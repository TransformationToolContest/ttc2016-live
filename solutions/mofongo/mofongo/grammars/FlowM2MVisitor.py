# Generated from C:/git/mofongo/grammars/flowm2m/src/tech/mofongo\FlowM2M.g4 by ANTLR 4.5.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .FlowM2MParser import FlowM2MParser
else:
    from FlowM2MParser import FlowM2MParser

# This class defines a complete generic visitor for a parse tree produced by FlowM2MParser.

class FlowM2MVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by FlowM2MParser#flow.
    def visitFlow(self, ctx:FlowM2MParser.FlowContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#element.
    def visitElement(self, ctx:FlowM2MParser.ElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#allInstances.
    def visitAllInstances(self, ctx:FlowM2MParser.AllInstancesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#newInstance.
    def visitNewInstance(self, ctx:FlowM2MParser.NewInstanceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#filtrate.
    def visitFiltrate(self, ctx:FlowM2MParser.FiltrateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#copy.
    def visitCopy(self, ctx:FlowM2MParser.CopyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#sort.
    def visitSort(self, ctx:FlowM2MParser.SortContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#product.
    def visitProduct(self, ctx:FlowM2MParser.ProductContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#getFeature.
    def visitGetFeature(self, ctx:FlowM2MParser.GetFeatureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#setFeature.
    def visitSetFeature(self, ctx:FlowM2MParser.SetFeatureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#newContainer.
    def visitNewContainer(self, ctx:FlowM2MParser.NewContainerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#addToContainer.
    def visitAddToContainer(self, ctx:FlowM2MParser.AddToContainerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#forEach.
    def visitForEach(self, ctx:FlowM2MParser.ForEachContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#collectBy.
    def visitCollectBy(self, ctx:FlowM2MParser.CollectByContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#evaluate.
    def visitEvaluate(self, ctx:FlowM2MParser.EvaluateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#conditionalExpression.
    def visitConditionalExpression(self, ctx:FlowM2MParser.ConditionalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#orExpression.
    def visitOrExpression(self, ctx:FlowM2MParser.OrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#andExpression.
    def visitAndExpression(self, ctx:FlowM2MParser.AndExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#equalityExpression.
    def visitEqualityExpression(self, ctx:FlowM2MParser.EqualityExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#relationalExpression.
    def visitRelationalExpression(self, ctx:FlowM2MParser.RelationalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#additiveExpression.
    def visitAdditiveExpression(self, ctx:FlowM2MParser.AdditiveExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx:FlowM2MParser.MultiplicativeExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#unaryExpression.
    def visitUnaryExpression(self, ctx:FlowM2MParser.UnaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#featureCallExpression.
    def visitFeatureCallExpression(self, ctx:FlowM2MParser.FeatureCallExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#int.
    def visitInt(self, ctx:FlowM2MParser.IntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#boolean.
    def visitBoolean(self, ctx:FlowM2MParser.BooleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#double.
    def visitDouble(self, ctx:FlowM2MParser.DoubleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#string.
    def visitString(self, ctx:FlowM2MParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#id.
    def visitId(self, ctx:FlowM2MParser.IdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#parens.
    def visitParens(self, ctx:FlowM2MParser.ParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#orOperator.
    def visitOrOperator(self, ctx:FlowM2MParser.OrOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#andOperator.
    def visitAndOperator(self, ctx:FlowM2MParser.AndOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#equals.
    def visitEquals(self, ctx:FlowM2MParser.EqualsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#not_equals.
    def visitNot_equals(self, ctx:FlowM2MParser.Not_equalsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#greather_than.
    def visitGreather_than(self, ctx:FlowM2MParser.Greather_thanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#great_or_equal.
    def visitGreat_or_equal(self, ctx:FlowM2MParser.Great_or_equalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#less_than.
    def visitLess_than(self, ctx:FlowM2MParser.Less_thanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#less_or_equal.
    def visitLess_or_equal(self, ctx:FlowM2MParser.Less_or_equalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#add.
    def visitAdd(self, ctx:FlowM2MParser.AddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#substract.
    def visitSubstract(self, ctx:FlowM2MParser.SubstractContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#multiply.
    def visitMultiply(self, ctx:FlowM2MParser.MultiplyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#divide.
    def visitDivide(self, ctx:FlowM2MParser.DivideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#modulo.
    def visitModulo(self, ctx:FlowM2MParser.ModuloContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#not.
    def visitNot(self, ctx:FlowM2MParser.NotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FlowM2MParser#negate.
    def visitNegate(self, ctx:FlowM2MParser.NegateContext):
        return self.visitChildren(ctx)



del FlowM2MParser