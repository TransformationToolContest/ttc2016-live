import logging
import threading
import operator
from queue import Queue

from lxml import etree

from antlr4 import *

from mofongo.grammars.FlowM2MVisitor import FlowM2MVisitor
if __name__ is not None and "." in __name__:
    from .FlowM2MParser import FlowM2MParser
else:
    from FlowM2MParser import FlowM2MParser

ALL_INSTANCES_QUEUE_SIZE = 100
logger = logging.getLogger(__name__)
logger.setLevel(logging.DEBUG)
# create console handler and set level to debug
ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)
logger.addHandler(ch)

def interpret(val):
    if val is None:
        return val
    if isinstance(val, etree.ElementBase):
        return val
    try:
        return int(val)
    except ValueError:
        try:
            return float(val)
        except ValueError:
            if isinstance(val, bool):
                return val
            return val


class FlowM2MError(Exception):
    pass


class ThreadElement(threading.Thread):

    def __init__(self, source_queue, target_queue):
        threading.Thread.__init__(self)
        self.source_queue = source_queue
        self.target_queue = target_queue

    def run(self):
        while True:
            item = self.source_queue.get()
            if item is None:
                break
            self.process(item)
            self.source_queue.task_done()

    def process(self, item):
        pass


class AllInstancesWorker(ThreadElement):

    def __init__(self, field, elements, **kwargs):
        self.field = field
        self.elements = elements
        super(AllInstancesWorker, self).__init__(**kwargs)

    def process(self, item):
        for e in self.elements:
            logger.info('AllInstancesWorker adding {} to the queue'.format(e))
            target_item = item.copy()
            target_item[self.field] = e
            if self.target_queue:
                self.target_queue.put(target_item)


class EvaluateWorker(ThreadElement):

    def __init__(self, field, exp, **kwargs):
        self.field = field
        self.exp = exp
        super(EvaluateWorker, self).__init__(**kwargs)

    def process(self, item):
        visitor = FlowM2MEvaluation()
        value = None
        try:
            value = visitor.visit(self.exp, item)
        except Exception as ex:
            logger.critical('EvaluateWorker excption. {}'.format(ex))
            return None
        logger.info('EvaluateWorker {} <- {}'.format(self.field, value))
        target_item = item.copy()
        target_item[self.field] = value
        if self.target_queue:
            logger.info('EvaluateWorker put in {}'.format(self.target_queue))
            self.target_queue.put(target_item)


class FilterWorker(ThreadElement):

    def __init__(self, filter_by, reject_queue, **kwargs):
        self.filter_by = filter_by
        self.reject_queue = reject_queue
        super(FilterWorker, self).__init__(**kwargs)

    def process(self, item):
        visitor = FlowM2MEvaluation()
        try:
            cond = visitor.visit(self.filter_by, item)
        except Exception as ex:
            logger.critical("FilterWorker exception. {}".format(ex))
            return None
        logger.info('FilterWorker condition {}'.format(self.filter_by.getText()))
        target_item = item.copy()
        if isinstance(cond, bool):
            cond_val = cond
        else:
            cond_val = cond is not None
        if cond_val:
            logger.info('Condition is true')
            if self.target_queue:
                logger.info('FilterWorker put in {}'.format(self.target_queue))
                self.target_queue.put(target_item)
        else:
            logger.info('Condition is false')
            if self.reject_queue:
                logger.info('FilterWorker put in {}'.format(self.reject_queue))
                self.reject_queue.put(target_item)


class NewInstanceWorker(ThreadElement):

    instances_cache = dict()

    def __init__(self, field, key, model, package_name, type_name, **kwargs):
        self.field = field
        self.key = key
        self.model = model
        self.package_name = package_name
        self.type_name = type_name
        super(NewInstanceWorker, self).__init__(**kwargs)

    def process(self, item):
        logger.info('NewInstanceWorker creating {}'.format(self.type_name))
        visitor = FlowM2MEvaluation()
        key_value = visitor.visit(self.key, item)
        target_item = item.copy()
        if key_value in self.instances_cache:
            logger.info('NewInstanceWorker match {}'.format(self.instances_cache[key_value]))
            target_item[self.field] = self.instances_cache[key_value]
        else:
            try:
                instance = self.model.create_instance(self.type_name, self.package_name)
            except Exception as ex:
                logger.info('NewInstanceWorker failed to create instance. {}'.format(ex))
                return None
            logger.info('NewInstanceWorker new {}'.format(instance))
            target_item[self.field] = instance
        if self.target_queue:
            logger.info('NewInstanceWorker put in {}'.format(self.target_queue))
            self.target_queue.put(target_item)


class SetFeatureWorker(ThreadElement):

    def __init__(self, field, value, feature, **kwargs):
        self.field = field
        self.value = value
        self.feature = feature
        super(SetFeatureWorker, self).__init__(**kwargs)

    def process(self, item):
        logger.info('SetFeatureWorker assigning {}'.format(self.feature))
        visitor = FlowM2MEvaluation()
        feature_value = visitor.visit(self.value, item)
        target_item = item.copy()
        element = item[self.field]
        # FIXME how do we set containement properties?
        # Get the type, find the sf, if it is containment add as child
        logger.info('SetFeatureWorker setting {} <- {} @ {}'.format(self.feature, self.value.getText(), element))
        element.attrib[self.feature] = feature_value
        #setattr(element, self.feature, feature_value)

        if self.target_queue:
            logger.info('SetFeatureWorker put in {}'.format(self.target_queue))
            self.target_queue.put(target_item)


class FlowM2MExecution(FlowM2MVisitor):

    def __init__(self, model_manager):
        self.model_manager = model_manager
        self.elementQueues = dict()

    def get_queue(self, name):
        if name:
            try:
                target_queue = self.elementQueues[name]
            except KeyError:
                target_queue = Queue(ALL_INSTANCES_QUEUE_SIZE)
                self.elementQueues[name] = target_queue
                target_queue.join()
            logger.info("Element {} given queue {}".format(name, target_queue))
            return target_queue
        return None

    # Visit a parse tree produced by FlowM2MParser#flow.
    def visitFlow(self, ctx: FlowM2MParser.FlowContext):
        threads = []
        for e in ctx.elements:
            t = self.visit(e)
            if isinstance(t, threading.Thread):
                threads.append(t)

        return threads


    # Visit a parse tree produced by FlowM2MParser#allInstances.
    def visitAllInstances(self, ctx:FlowM2MParser.AllInstancesContext):
        name = ctx.name.text
        logger.info('AllInstances: {}'.format(name))
        source_queue = self.get_queue(name)
        if source_queue.empty():
            logger.info('First Step')
            source_queue.put(dict())
        try:
            model_name = ctx.model.text
        except AttributeError:
            model_name = None
        try:
            package_name = ctx.package.text
        except AttributeError:
            package_name = None
        #if package_name:
        #    type_name = "{}!{}".format(package_name, ctx.typeId.text)
        #else:
            type_name = ctx.typeId.text
        if model_name:
            models = self.model_manager.get_go_by_name(model_name)
        else:
            models = next(iter(self.model_manager.models.values()))
        elements = []
        for m in models:
            element_type = m.get_type_by_name(type_name)
            m_els = m.get_all_of_kind(element_type)
            if package_name:
                # Move this to the Model, i.e. two parameters to get_all_of...
                for e in m_els:
                    t = type(element_type)
                    t_p = t.eContainer
                    if t_p.name == package_name:
                        elements.append(e)
            else:
                elements.extend(m_els)
        try:
            target = ctx.target.text
        except AttributeError:
            target = None
        target_queue = self.get_queue(target)
        field = ctx.field.text
        worker = AllInstancesWorker(field=field, elements=elements, source_queue=source_queue,
                                    target_queue=target_queue)
        worker.setDaemon(True)
        worker.start()
        return worker


    # Visit a parse tree produced by FlowM2MParser#evaluate.
    def visitEvaluate(self, ctx:FlowM2MParser.EvaluateContext):
        logger.info('Evaluate: {}'.format(ctx.name.text))
        try:
            target = ctx.target.text
        except AttributeError:
            target = None
        target_queue = self.get_queue(target)
        source_queue = self.get_queue(ctx.name.text)
        field = ctx.field.text
        worker = EvaluateWorker(field=field, exp=ctx.expression, source_queue=source_queue, target_queue=target_queue)
        worker.setDaemon(True)
        worker.start()
        return worker


    # Visit a parse tree produced by FlowM2MParser#filtrate.
    def visitFiltrate(self, ctx:FlowM2MParser.FiltrateContext):
        logger.info('Filter: {}'.format(ctx.name.text))
        try:
            target = ctx.target.text
        except AttributeError:
            target = None
        target_queue = self.get_queue(target)
        source_queue = self.get_queue(ctx.name.text)
        try:
            reject = ctx.reject.text
        except AttributeError:
            reject = None
        reject_queue = self.get_queue(reject)
        worker = FilterWorker(filter_by=ctx.filterBy, reject_queue=reject_queue, source_queue=source_queue,
                              target_queue=target_queue)
        worker.setDaemon(True)
        worker.start()
        return worker

    # Visit a parse tree produced by FlowM2MParser#newInstance.
    def visitNewInstance(self, ctx:FlowM2MParser.NewInstanceContext):
        logger.info('NewInstance: {}'.format(ctx.name.text))
        try:
            model_name = ctx.model.text
        except AttributeError:
            model_name = None
        try:
            package_name = ctx.package.text
        except AttributeError:
            package_name = None
        # if package_name:
        #    type_name = "{}!{}".format(package_name, ctx.typeId.text)
        # else:
        type_name = ctx.typeId.text
        if model_name:
            models = self.model_manager.get_go_by_name(model_name)
        else:
            models = [self.model_manager.models.popitem()]
        try:
            target = ctx.target.text
        except AttributeError:
            target = None
        target_queue = self.get_queue(target)
        source_queue = self.get_queue(ctx.name.text)
        field = ctx.field.text
        worker = NewInstanceWorker(field=field, key=ctx.key, model=models[0], package_name=package_name, type_name=type_name,
                                   source_queue=source_queue, target_queue=target_queue)
        worker.setDaemon(True)
        worker.start()
        return worker

    # Visit a parse tree produced by FlowM2MParser#setFeature.
    def visitSetFeature(self, ctx: FlowM2MParser.SetFeatureContext):
        logger.info('SetFeature: {}'.format(ctx.name.text))
        try:
            target = ctx.target.text
        except AttributeError:
            target = None
        target_queue = self.get_queue(target)
        source_queue = self.get_queue(ctx.name.text)
        field = ctx.objectField.text
        worker = SetFeatureWorker(field=field, value=ctx.value, feature=ctx.feature.text, source_queue=source_queue, target_queue=target_queue)
        worker.setDaemon(True)
        worker.start()
        return worker

class FlowM2MEvaluation(FlowM2MVisitor):

    def visit(self, tree, item=None):
        tree.item = item
        return super(FlowM2MEvaluation, self).visit(tree)

    def evaluate_arithmetic_exp(self, ctx):
        left = self.visit(ctx.leftExpression, ctx.item)
        if ctx.operator:
            result = left
            for operator, exp in zip(ctx.operator, ctx.rightExpression):
                op = self.visit(operator, ctx.item)
                right = self.visit(exp, ctx.item)
                result = op(result, right)
            return result
        return left

    def evaluate_logical_exp(self, ctx):
        left = self.visit(ctx.leftExpression, ctx.item)
        if ctx.operator:
            result = left
            for op_in_exp, exp in zip(ctx.operator, ctx.rightExpression):
                op = self.visit(op_in_exp, ctx.item)
                right = self.visit(exp, ctx.item)
                if isinstance(result, bool):
                    result_val = left
                else:
                    result_val = left is not None
                if isinstance(right, bool):
                    right_val = right
                else:
                    right_val = right is not None
                result = op(result_val, right_val)
            return result
        return left

    # Visit a parse tree produced by FlowM2MParser#conditionalExpression.
    def visitConditionalExpression(self, ctx:FlowM2MParser.ConditionalExpressionContext):
        if ctx.ifExpression:
            cond = self.visit(ctx.ifExpression, ctx.item)
            if cond:
                return self.visit(ctx.thenExpression, ctx.item)
            else:
                return self.visit(ctx.elseExpression, ctx.item)
        else:
            return self.visit(ctx.simpleExpression, ctx.item)


    # Visit a parse tree produced by FlowM2MParser#orExpression.
    def visitOrExpression(self, ctx:FlowM2MParser.OrExpressionContext):
        return self.evaluate_logical_exp(ctx)


    # Visit a parse tree produced by FlowM2MParser#andExpression.
    def visitAndExpression(self, ctx:FlowM2MParser.AndExpressionContext):
        return self.evaluate_logical_exp(ctx)


    # Visit a parse tree produced by FlowM2MParser#equalityExpression.
    def visitEqualityExpression(self, ctx:FlowM2MParser.EqualityExpressionContext):
        return self.evaluate_arithmetic_exp(ctx)

    # Visit a parse tree produced by FlowM2MParser#relationalExpression.
    def visitRelationalExpression(self, ctx:FlowM2MParser.RelationalExpressionContext):
        return self.evaluate_arithmetic_exp(ctx)


    # Visit a parse tree produced by FlowM2MParser#additiveExpression.
    def visitAdditiveExpression(self, ctx:FlowM2MParser.AdditiveExpressionContext):
        return self.evaluate_arithmetic_exp(ctx)


    # Visit a parse tree produced by FlowM2MParser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx:FlowM2MParser.MultiplicativeExpressionContext):
        return self.evaluate_arithmetic_exp(ctx)


    # Visit a parse tree produced by FlowM2MParser#unaryExpression.
    def visitUnaryExpression(self, ctx:FlowM2MParser.UnaryExpressionContext):
        if ctx.operator:
            op = self.visit(ctx.operator)
            val = self.visit(ctx.expression, ctx.item)
            return op(val)
        else:
            return self.visit(ctx.simpleExpression, ctx.item)


    # Visit a parse tree produced by FlowM2MParser#featureCallExpression.
    def visitFeatureCallExpression(self, ctx:FlowM2MParser.FeatureCallExpressionContext):
        prim = self.visit(ctx.primary, ctx.item)
        try:
            ctx.primary.field
        except AttributeError:
            return prim
        val = ctx.item[prim]
        if ctx.feature:
            for f in ctx.feature:
                if f.text == 'eContainer':
                    #val = val.eContainer   FIXME when model is also MOF
                    val = val.getparent()
                elif f.text == 'eClass':
                    val = type(val)
                else:
                    try:
                        #val = val.attrib[f.text]
                        raw_val = getattr(val, f.text)
                        val = interpret(raw_val)
                    except KeyError:
                        raise FlowM2MError("The feature call expression references an unknown attribute: {}".format(f))
            if ctx.parameters:
                params = []
                for p in ctx.parameters:
                    params.append(self.visit(p, ctx.item))
                return val(*params)
        return val

    # Visit a parse tree produced by FlowM2MParser#int.
    def visitInt(self, ctx:FlowM2MParser.IntContext):
        return int(ctx.value.text)


    # Visit a parse tree produced by FlowM2MParser#boolean.
    def visitBoolean(self, ctx:FlowM2MParser.BooleanContext):
        return bool(ctx.value.text)


    # Visit a parse tree produced by FlowM2MParser#double.
    def visitDouble(self, ctx:FlowM2MParser.DoubleContext):
        return float(ctx.value.text)


    # Visit a parse tree produced by FlowM2MParser#string.
    def visitString(self, ctx:FlowM2MParser.StringContext):
        val = ctx.value.text[1:-1]
        return val


    # Visit a parse tree produced by FlowM2MParser#id.
    def visitId(self, ctx:FlowM2MParser.IdContext):
        id = ctx.field.text
        return id


    # Visit a parse tree produced by FlowM2MParser#parens.
    def visitParens(self, ctx:FlowM2MParser.ParensContext):
        return self.visit(ctx.orExpression())


    # Visit a parse tree produced by FlowM2MParser#orOperator.
    def visitOrOperator(self, ctx:FlowM2MParser.OrOperatorContext):
        return operator.__or__


    # Visit a parse tree produced by FlowM2MParser#andOperator.
    def visitAndOperator(self, ctx:FlowM2MParser.AndOperatorContext):
        return operator.__and__


    # Visit a parse tree produced by FlowM2MParser#equals.
    def visitEquals(self, ctx:FlowM2MParser.EqualsContext):
        return operator.__eq__


    # Visit a parse tree produced by FlowM2MParser#not_equals.
    def visitNot_equals(self, ctx:FlowM2MParser.Not_equalsContext):
        return operator.__ne__


    # Visit a parse tree produced by FlowM2MParser#greather_than.
    def visitGreather_than(self, ctx:FlowM2MParser.Greather_thanContext):
        return operator.__gt__


    # Visit a parse tree produced by FlowM2MParser#great_or_equal.
    def visitGreat_or_equal(self, ctx:FlowM2MParser.Great_or_equalContext):
        return operator.__ge__


    # Visit a parse tree produced by FlowM2MParser#less_than.
    def visitLess_than(self, ctx:FlowM2MParser.Less_thanContext):
        return operator.__lt__


    # Visit a parse tree produced by FlowM2MParser#less_or_equal.
    def visitLess_or_equal(self, ctx:FlowM2MParser.Less_or_equalContext):
        return operator.__le__


    # Visit a parse tree produced by FlowM2MParser#add.
    def visitAdd(self, ctx:FlowM2MParser.AddContext):
        return operator.__add__


    # Visit a parse tree produced by FlowM2MParser#substract.
    def visitSubstract(self, ctx:FlowM2MParser.SubstractContext):
        return operator.__sub__


    # Visit a parse tree produced by FlowM2MParser#multiply.
    def visitMultiply(self, ctx:FlowM2MParser.MultiplyContext):
        return operator.__mul__


    # Visit a parse tree produced by FlowM2MParser#divide.
    def visitDivide(self, ctx:FlowM2MParser.DivideContext):
        return operator.__truediv__


    # Visit a parse tree produced by FlowM2MParser#modulo.
    def visitModulo(self, ctx:FlowM2MParser.ModuloContext):
        return operator.__mod__


    # Visit a parse tree produced by FlowM2MParser#not.
    def visitNot(self, ctx:FlowM2MParser.NotContext):
        return operator.__not__


    # Visit a parse tree produced by FlowM2MParser#negate.
    def visitNegate(self, ctx:FlowM2MParser.NegateContext):
        return operator.__neg__


del FlowM2MParser