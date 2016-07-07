# Copyright [2015] [Horacio Hoyos]
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import itertools
import sys

from .core import TransformationEngineError

__author__ = 'Horacio Hoyos'
__copyright__ = 'Copyright , Nagasu Technologies'


"""The global context to use when evaluating pattern expressions
"""
glob_context = {"__builtins__": None}
WHERE = "_where"
REST = "rest"


def get_elements_for_domains(domain_models):
    """
    For each domain, get the elements of the corresponding model that match the patterns in the domain

    :param dict domain_models: A dictionary {:py:class:`Domain`: :py:class:`MofongoModel`} of domains and models of
        interest
    :return dict: A dictionary of {class_name: elements[]} of all elements that match the classes of the object template
        expressions in the domain's patterns
    """
    elements = dict()
    for d, m in domain_models.items():
        elements.update(get_model_elements_for_templates(m, d.templates))
    return elements


# def get_elements_for_rule(model, rule):
#     """
#     Get all elements from the model that match the object template expressions in the rule
#
#     :param rule: The rule to get the object template expressions
#     :param model: The model to get the elements from
#     :return: A dictionary of (class_name, elements[]) of all elements that match the classes of the object template
#         expressions
#     """
#     for d in rule.domain:
#         if d.name == model.name:
#             templates = d.templates
#     return get_model_elements_for_templates(model, templates)


def get_elements_for_direction(rule, model):
    """
    Find all elements in the model that match the rule's domain for that model

    :param Rule rule: The rule
    :param MofongoModel model: The model
    :return dict: A dictionary (str, Element[]) with a list of elements for each class used in the domain's templates.
    :raises TransformationEngineError: if the rule does not have a domain with the same name as the model
    """
    for d in rule.domain:
        if d.name == model.name:
            return get_model_elements_for_templates(model, d.templates)
    raise TransformationEngineError("The rule does not have a domain with name " + model.name)


def get_model_elements_for_templates(model, templates):
    """
    Find all elements in the model that match the class of the templates

    :param MofongoModel model: The model
    :param Template[] templates: The templates
    :return dict: A dictionary of {str, Elements[]) of all elements that match the top level classes in the template,
        i.e. classes are not searched recursively.
    """
    elements = dict()
    # We are only interested in first level classes
    for template in templates:
        assert isinstance(template, OTemplate)
        class_name = template.get_class_name()
        c = model.get_type_by_name(class_name)
        if c:
            elements[template.get_id()] = model.get_all_of_kind(c)
    return elements


# def assign_elements_to_rule(rule, elements):
#     """
#     For each (object_id, element) item in the dictionary of elements, assign it as an attribute to the rule.
#     This allows to use the rule as a trace for all elements involved and to easily use them during rule
#     evaluation.
#
#     :param elements:
#     :param rule:
#     :return:
#     """
#     rule.local_context = dict()
#     for object_id, element in elements:
#         rule.local_context[object_id] = element


def match_templates(elements, templates, local_context):
    """
    Bind or match variables defined in the template by matching the template's pattern to elements in the collection.
    Expressions in the template are evaluated in the local_context. All new bindings are added to the local_context for
    future pattern matching

    :param list elements: A list of Element to match the templates
    :param lst templates: The list of Template to match
    :param dict local_context: The context in which the templates are evaluated
    :return boolean: True if all the templates could be matched, False otherwise
    """
    for template in templates:
        element = [e for id, e in elements if id == template.get_id()][0]
        if not match_element(element, template, local_context):
            return False
    return True


def match_element(element, template, local_context):
    """
    Evaluate the properties on the element to bind the free variables, compare the bound variables to the element
    properties, or evaluate the nested templates. The local_context holds any bound variables (dict)

    :param Element element: The Element to match
    :param Template template: The template
    :param dict local_context: The context in which evaluation occurs
    """
    object_id = template.get_id()
    result = True
    # If the template id exists in the context, the element must match the bound object in the context
    if object_id in local_context:
            if element is not local_context[object_id]:
                result = False
    else:
        if isinstance(template, OTemplate):
            result = match_object_template(element, template, local_context)
        elif isinstance(template, CTemplate):
            # TODO test CTemplate in input domains
            result, matched_elements = match_collection_template(element, template, local_context)
            if result:
                if template.rest:       # TODO is the rest is bound should the collections match?
                    local_context[template.rest] = [x for x in element if x not in matched_elements]
        if result and template.get_where():
            where_func = template.get_where()
            where = where_func(element)
            if not where:
                result = False
    if result:
        local_context[template.get_id()] = element
    return result


def match_object_template(element, template, local_context):
    """
    Evaluate the object template on the element. Evaluation bounds all unbound variables in the context to the value
    of the element's attributes or tests if the attribute matches the value of previously bound variables.

    :param Element element: The element to evaluate
    :param OTemplate template: The template
    :param dict local_context: The context in which expressions are evaluated
    :return boolean: True if the element matches the template, False otherwise
    """
    # The element must be an instance of the Template's class
    # TODO Check why Row Class is not registered and reenable test!!
    #if not isinstance(element, globals()[template.get_class_name()]):
    #    result = False
    #else:
    for referred_property, value in template.parts.items():
        if isinstance(value, Template):
            nested_element = getattr(element, referred_property)
            result = match_element(nested_element, value, local_context)
        else:
            result = bind_or_match_attribute(element, referred_property, value, local_context)
        if not result:
            break
    return result


def match_collection_template(collection, template, local_context):
    """
    Evaluate the collection template on the collection. For each member of the collection template, an element of the
    collection match or bound is

    :param list collection: The collection to evaluate
    :param CTemplate template: The template
    :param dict local_context: The context in which expressions are evaluated
    :return boolean, list: The result of the evaluation and a list of all elements that where matched
    """
    matched_elements = []
    # TODO All the elements in the collection must be an instance of the Template class?
    #try:
    #    result = all([isinstance(e, globals()[template.collection_type]) for e in element])
    #except TypeError:
    #    result = False
    #if result:
    result = True
    for member_template in template.members:
        if isinstance(member_template, Template):
            for e in collection:
                # Bind/match an element of the element collection to the template member
                if match_element(e, member_template, local_context):
                    matched_elements.append(e)
                else:
                    result = False      # But continue binding all we can
        elif isinstance(member_template, SharedVar):
            for e in collection:
                # Bind/match an element of the element collection to the template member
                try:
                    if e is local_context[member_template.id]:
                        matched_elements.append(e)
                except KeyError:
                    # TODO Match must be weak when testing existing elements and the local context must not be affected
                    pass
        else:
            # TODO test this!
            if not any(map(lambda e: local_context[member_template] == e, collection)):
                return False
    return result, matched_elements


def bind_or_match_attribute(element, attribute, exp, local_context):
    """
    Bind or match the element's attribute to the given exp. If the expression is a SharedVar the attribute's value must
    match the context value of the SharedVar. If no context exist, the SharedVar is bound to the attribute's value. If
    the exp is an expression (e.g. lambda function) the evaluation of the expression in the local context must match the
    attributes value.
    :param Element element: The Element
    :param str attribute: The name of the attribute to bind/match
    :param exp: The expression to bind/match the attribute
    :param dict local_context: The context in which the expression is evaluated
    :return boolean: True if the attribute matches or was bound.
    """
    attr_val = getattr(element, attribute)
    if isinstance(exp, SharedVar):
        if exp.id in local_context:  # The variable is already bound, we need to test
            if attr_val != local_context[exp.id]:  # The combination pair does not match, this rule is not valid
                return False
        else:  # Bound the variable, if value is shared var
            local_context[exp.id] = attr_val
    else:
        exp_val = eval(exp, glob_context, local_context)
        if attr_val != exp_val:  # The combination pair does not match, this rule is not valid
            return False
    return True


def evaluate_given(rule, match_elements):
    """
    TODO Evaluate the given clause to provide further matching, i.e. match_elements may be more than one. Evaluate
    the given expressions and use the result from previous invocations to bind the rest of the variables
    :param rule:
    :param match_elements:
    :return:
    """
    # TODO Finish this!
    # TODO if after the implies still there is more than one match warn the user that their rule is ambigous
    try:
        element = match_elements[0]
    except IndexError:
        element = None
    return element


class Rule(object):
    def __getattribute__(self, name):
        try:
            attr = object.__getattribute__(self, name)
        except AttributeError:      # Might be an access to a template object_id
            try:
                return self.local_context[name]
            except KeyError:        # The variable is unbound
                raise TransformationEngineError("Referencing object with id {}, but it has not been defined previously."
                                                .format(name))
        if isinstance(attr, SharedVar):
            return self.local_context[attr.id]
        if name == "implies":
            # http://code.activestate.com/recipes/577283-decorator-to-expose-local-variables-of-a-function-/
            def tracer(frame, event, arg):
                if event == 'return':
                    impl_locals = frame.f_locals.copy()
                    implies_bindings = {your_key: impl_locals[your_key] for your_key in impl_locals.keys()
                                        if your_key != "self"}
                    self.local_context.update(implies_bindings)

            def newfunc(*args, **kwargs):
                sys.setprofile(tracer)
                try:
                    # trace the function call
                    result = attr(*args, **kwargs)
                finally:
                    # disable tracer and replace with old one
                    sys.setprofile(None)
                return result
            return newfunc
        else:
            return attr


class Domain:

    def __init__(self, name, *args):
        """
        A Domain has a name, a mode and a list of templates. The name must match the name of a model, the mode must be an
        EnforceMode, the template defines the patterns to match in the domain.

        :param name: The name of the domain
        :param args: Any number of :py:class:`Template` objects
        :return:
        """
        self.name = name
        self.templates = args


class CheckDomain(Domain):
    pass


class EnforceDomain(Domain):
    pass


class SharedVar:
    def __init__(self, identifier):
        self.id = identifier

    def __radd__(self, other):
        return other + self.id

    def __add__(self, other):
        return self.id + other


class Template:
    def __init__(self, identifier, _where=None, **kwargs):
        self.__id = identifier
        self.__where = _where

    def get_id(self):
        return self.__id

    def get_where(self):
        return self.__where


class OTemplate(Template):

    def __init__(self, identifier, class_name, *args, **kwargs):
        super().__init__(identifier, **kwargs)
        self.__class_name = class_name
        # TODO maybe store each key, value as a  PropertyTemplateItem (referredProperty, value)
        self.parts = {k: v for (k, v) in kwargs.items() if k != WHERE}

    def get_class_name(self):
        return self.__class_name


class CTemplate(Template):

    def __init__(self, identifier, collection_type, *args, rest=None, **kwargs):
        super().__init__(identifier, **kwargs)
        self.collection_type = collection_type
        self.members = args
        self.rest = rest


class Engine:
    """
    The mofongo model transformation engine.
    Domains in rules are matched by names, alases are too complex to handle, i.e. in the input it is easy to calculate
    the cross-product of all possible alias-class (from patterns) combinations, but then to which specific output
    alias the changes should go is undecidable.
    """

    def __init__(self, model_manager, rules, direction, class_keys):
        self.model_manager = model_manager
        self.direction = direction
        self.rules = rules
        self.class_keys = class_keys
        self.trace = dict()
        self.missing_values = dict()
        self.dir_keys = None
        self.target_model = None

    def execute(self):
        for top_rule in [rule for rule in self.rules if rule.top]:
            # TODO Do an early check that the target domain is Check or Enforce?
            pairs = self.get_source_elements_tuples(top_rule)
            # Get existing model elements that match the output model
            self.target_model = self.model_manager.models[self.direction]
            existing = get_elements_for_direction(top_rule, self.target_model)
            # One rule execution for each combination on the cartesian product
            for pair_combination in itertools.product(*pairs):
                self.missing_values.clear()
                ri = top_rule()    # the products are ordered as the values
                #assign_elements_to_rule(ri, pair_combination)
                ri.local_context = dict()
                found_elements, trace = self.execute_rule(ri, pair_combination)  # The rule was not a good match for the assigned elements, continue
                if not found_elements:
                    continue
                # Save the trace
                try:
                    self.trace[top_rule.__name__].append(trace)
                except KeyError:
                    self.trace[top_rule.__name__] = [trace]
                # TODO WE can change the execute method of rules, so they either find the trace or execute!
                # This will also means the engine must be attached to every rule, as the engine is the trace owner

                # TODO For enforce mode, we need to keep track of existing elements that where not matched so they can be deleted from the model
                #for key, value in found_elements.items():
                #    if key in existing:
                #        for e in value:
                #            try:
                #                existing[key].remove(e)
                #            except ValueError:
                #                pass

    def get_source_elements_tuples(self, rule):
        """
        Get all the elements from the input models based on the classes in the patterns in the domains and create a list
        of tuples to be used to try all element combinations

        :param rule: The rule to explore
        :return: A list of (class_name, elements) items
        """
        domain_models = dict()
        for d in rule.domain:
            if d.name != self.direction:
                if d.name not in self.model_manager.models:
                    raise TransformationEngineError("No model for domain {} found on the model manager. ".format(d))

                domain_models[d] = self.model_manager.models[d.name]
        elements = get_elements_for_domains(domain_models)
        pairs = []
        for object_id, instances in elements.items():
            # TODO class_names should be unique, need to append typed model in the rule!
            if instances:
                per_id = [(object_id, i) for i in instances]
            else:
                per_id = [(object_id, None)]
            pairs.append(per_id)
        pairs.sort(key=len, reverse=True)
        return pairs

    def execute_rule(self, rule, top_elements):
        """
        Execute the given rule against the top elements

        :param rule:
        :param top_elements: One element per top template of the source domains
        :return:
        """
        # 1. Bind the free variables using the source domains
        source_templates = []
        for d in rule.domain:
            if d.name != self.direction:
                source_templates.extend(d.templates)
            else:
                target_domain = d
        # Assign values to shared vars from matched elements
        if not match_templates(top_elements, source_templates, rule.local_context):      # Some of the objects in the rule don't match, this is an invalid rule instance, i.e. the pair assigned to the rule does not match
            return None
        # 2. Check/Enforce the direction
        found_elements = dict()
        for template in target_domain.templates:
            try:
                self.dir_keys = self.class_keys[self.direction]
            except KeyError:
                self.dir_keys = None
            element_class = self.target_model.get_type_by_name(template.get_class_name())
            match_elements = []
            match_elements_context = dict()
            for element in self.target_model.get_all_of_type(element_class):
                match_context = rule.local_context.copy()
                if match_element(element, template, match_context):
                    match_elements.append(element)
                    match_elements_context[element] = match_context
            match_element = evaluate_given(rule, match_elements)
            # Restore the elements context
            try:
                rule.local_context = match_elements_context[match_element]
            except KeyError:
                pass        # Nothing to restore
            # Since there can be many matches, just keep the correct one
            rule.local_context[template.get_id()] = match_element
            if isinstance(target_domain, CheckDomain):
                if not match_element:
                    return None     # All the templates must match
                else:
                    found_elements[template.get_id()] = match_element
                    continue
            # We are in enforce, if no match we need to create the element
            elif isinstance(target_domain, EnforceDomain):
                if not match_element:
                    new_element = self.create_element(template, rule.local_context)
                    rule.local_context[template.get_id()] = new_element
                else:
                    found_elements[template.get_id()] = match_element
                    # Update the element
                    self.set_or_update_element_attributes(match_element, template, rule.local_context)
        # 3. Execute the implies
        rule.implies()
        # 4. Finish updating elements after implies
        for element, tracked_properties in self.missing_values.items():
            for attr, value in tracked_properties.items():
                property_value = rule.local_context[value]
                try:
                    attr_val = getattr(element, attr)
                    try:
                        attr_val.append(property_value)
                    except AttributeError:
                        attr_val.add(property_value)
                except AttributeError:
                    setattr(element, attr, property_value)
        # Create the trace
        top_binds = dict((element_tuple[0], element_tuple[1]) for element_tuple in top_elements)
        for t in target_domain.templates:
            object_id = t.get_id()
            top_binds[object_id] = rule.local_context[object_id]
        return found_elements, top_binds

    def create_element(self, template, local_context):
        """

        :param template:
        :param local_context:
        :return:
        """
        # An element is only instantiated if the template has all the properties in the key
        # TODO perhaps this is a method of the engine so we dont pass the keys and target_model around
        new_element = None
        assert isinstance(template, OTemplate)
        if template.get_class_name() in self.dir_keys:
            key_attr = set(self.dir_keys[template.get_class_name()])
            template_attr = set(template.parts.keys())
            if not key_attr - template_attr:
                model_type = self.target_model.get_type_by_name(template.get_class_name())
                new_element = self.target_model.create_instance(model_type)
                local_context[template.get_id()] = new_element
                self.set_or_update_element_attributes(new_element, template, local_context)
        return new_element

    def set_or_update_element_attributes(self, element, template, local_context):
        """
        Use the values in the local context to update the attributes in the object as defined by the pattern.
        :param element: The object to update
        :param template: A template to use to set the element attributes
        :param local_context: The local context used to evaluate expressions in the values.
        """
        # TODO DIVIDE this so when updating we don't overwrite existing values... it is harmless but is extra work we
        # dont need
        if isinstance(template, OTemplate):
            for referred_property, value in template.parts.items():
                if isinstance(value, Template):
                    try:
                        attr_val = getattr(element, referred_property)
                    except AttributeError:
                        #  Element does not has an attribute
                        # TODO As in EMOF the presentation can cause elements to raise the exceptio if the value is not set,
                        # because there is a difference between an unset attribute an one set to None
                        attr_val = self.instantiate_element_attribute(element, referred_property, value, local_context)
                        if attr_val:
                            local_context[value.get_id()] = attr_val
                            setattr(element, referred_property, attr_val)
                        else:
                            try:
                                _ = (e for e in attr_val)       # A new collection attribute will test as false
                                local_context[value.get_id()] = attr_val
                                setattr(element, referred_property, attr_val)
                            except TypeError:
                                self.update_after_implies(element, referred_property, value)
                    else:
                        local_context[value.get_id()] = attr_val
                        self.update_element(element, referred_property, attr_val, value, local_context)
                else:
                    if isinstance(value, SharedVar):
                        try:
                            setattr(element, referred_property, local_context[value.id])
                        except KeyError:
                            self.update_after_implies(element, referred_property, value)
                    else:
                        try:
                            exp_val = eval(value, glob_context, local_context)
                        except NameError:   # A var is unbound
                            self.update_after_implies(element, referred_property, value)
                        else:
                            setattr(element, referred_property, exp_val)

    def instantiate_element_attribute(self, element, attribute, template, local_context):
        if isinstance(template, OTemplate):
            attr_value = self.create_element(template, local_context)
        elif isinstance(template, CTemplate):
            # TODO what other type of collections?
            if template.collection_type == 'set':
                attr_value = set()
            elif template.collection_type == 'list':
                attr_value = list()
            # We assume that members of the template have id's that have already been bound or that
            # need to be bound in the implies
            for m in template.members:
                if isinstance(m, Template):
                    var_id = m.get_id()
                else:
                    var_id = m.id       # It must be a SharedVar
                try:
                    bound_value = local_context[var_id]
                except KeyError:
                    self.update_after_implies(element, attribute, var_id)
                else:
                    try:
                        attr_value.add(bound_value)
                    except AttributeError:
                        attr_value.append(bound_value)
        return attr_value

    def update_element(self, element, attribute, attr_val, attr_template, local_context):
        if isinstance(attr_template, OTemplate):
            self.set_or_update_element_attributes(attr_val, attr_template, local_context)
        elif isinstance(attr_template, CTemplate):
            # We assume that members of the template have id's that have already been bound or that
            # need to be bound in the implies
            for m in attr_template.members:
                if isinstance(m, Template):
                    var_id = m.get_id()
                else:       # Must be a shared var TODO Can we have plain strings?
                    var_id = m.id
                try:
                    bound_value = local_context[var_id]
                except KeyError:
                    # Need binding from the implies, we need to keep track of the parent object for nested missing bindings
                    self.update_after_implies(element, attribute, var_id)
                else:
                    try:
                        element.add(bound_value)
                    except AttributeError:
                        element.append(bound_value)

    def update_after_implies(self, element, attr, value):
        try:
            tracked_attrs = self.missing_values[element]
        except KeyError:
            tracked_attrs = dict()
        tracked_attrs[attr] = value
        self.missing_values[element] = tracked_attrs


