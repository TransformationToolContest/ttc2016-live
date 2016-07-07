"""
As in the OSI model, the presentation layer is responsible for the delivery and formatting of information to the
application layer for further processing or display. The presentation layer provides services that allow interaction
with different sources of information. For each different type of information source, the presentation layer should
provide a *mediator *that allows loading the information into a model and storing the information from a model. By model
we are referring to the concept of model in the context of MDE.

Each **mediator** will require different configuration parameters in order to correctly access the information source
and translate the data into a *model*. For example, an CSV (comma separated value) mediator will need configuration
parameters about the location of the csv file, the headers used in the file and the encoding. For this, all Mediators
should provide three (@classmethod) methods:
    * get_boolean_init_parameters: Returns a set of configuration parameters for which boolean values should be
        supplied.
    * get_optional_init_parameters: Returns a set of optional initialization parameters for which non boolean values
        can be supplied.
    * get_required_init_parameters: Returns a set of required initialization parameters for which non-boolean values
        should be supplied.

This methods will be used by the Model Manager to load models when using config files.

A **model** is a container for elements. Each of these elements represents a distinct set of data and each
element has a set of properties that hold information about the element. An element is equivalent to the concept of
*object* in the Object-oriented programming paradigm. As an example, a model loaded using the the mofongo CSV mediator
will have a distinct element for each row in the CSV file, with attributes named after the file headers (if present -
see :py:class:`mofongo.presentation.CsvMediator`). These attributes will have values corresponding to the columns of
the row represented by the element. Mediators that interact with information sources specifically designed for MDE,
such as EMOF, will need to produce elements that comply with the standard(s) that defines such sources.

Each model specifies a name which must be unique in the context of the model manager in which it is contained. Also,
it defines a number of aliases, that is non-unique alternate names, via which it can be accessed. All mediators provide
a basic API to work with model elements and types.

Each element must have a unique id within the model. This id is required to be unmutable during the existence of the
model in the Model Manager. The existence of a model is defined as the lapse from when the model is loaded until it is
disposed. Some mediators might provide ids that are retained across sessions.

At the model level, the *knows_type( type )* method returns true if the model supports the given type. A list of known
types can be retrieved using the *get_known_types* method. As a minimum a model *knows* about a type if any of its
elements is an instance of the type. For some modelling technologies it is also possible that a model knows about the
types of the attributes of its elements (e.g. via resolving proxies in EMF). Since all elements are Python obejcts, the
standard Python functions and operators can be used to test type equality and/or inheritance.

To support technologies that enable users to define abstract (non-instantiable) types, the *is_Instantiable( type )*
method returns if instances of the type can be created. Elements of a given type can be retrieved via the
*get_all_of_type* and *get_all_of_kind* methods.
"""

import csv
import configparser
import inspect
import logging
import re
from urllib.parse import urlparse
import urllib.request as urllib
import uuid
from warnings import warn

from lxml import etree

from .core import MofongoError, ModelManagerError

__author__ = 'Horacio Hoyos'
__copyright__ = 'Copyright ${YEAR}, Kinori Technologies'

logger = logging.getLogger(__name__)
logger.setLevel(logging.CRITICAL)
# create console handler and set level to debug
ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)
logger.addHandler(ch)


def get_all_subclasses(cls):
    """ Generator of all a class's subclasses. """
    try:
        for subclass in cls.__subclasses__():
            yield subclass
            for subclass in get_all_subclasses(subclass):
                yield subclass
    except TypeError:
        return


def get_all_subclasses_mof(cls):
    """ Generator of all a class's subclasses. """
    try:
        for subclass in cls.eContainer.types:
            if cls in subclass.super_class:
                yield subclass
                for subclass in get_all_subclasses(subclass):
                    yield subclass
    except TypeError:
        return

def get_bare_tag(elem):
    return elem.tag.rsplit('}', 1)[-1]


def get_bare_type(qualified_name):
    return qualified_name.rsplit('::', 1)[-1]


def get_function_boolean_parameters(method):
    sig = inspect.signature(method)
    ret = set()
    for param in sig.parameters.values():
        if param.default is not param.empty and isinstance(param.default, bool):
            ret.add(param.name)
    return ret


def get_function_optional_parameters(method):
    """
    This method returns the set of optional initialization parameters for which non-boolean values should be
    supplied.
    """
    sig = inspect.signature(method)
    ret = set()
    for param in sig.parameters.values():
        if param.default is not param.empty and not isinstance(param.default, bool):
            ret.add(param.name)
    return ret


def get_function_required_parameters(method):
    sig = inspect.signature(method)
    ret = set()
    for param in sig.parameters.values():
        if param.default is param.empty:
            if param.name is not 'self':
                ret.add(param.name)
    return ret


def get_scheme_context_manager(uri, kwargs):
    """
    Return the correct context manager to be used by a mediator based on the URI's scheme.
    :param uri: URI of the model
    :param kwargs: Additional parameters needed by some context managers (e.g. user/password)
    :return: A context manager (file_object) to use with the mediator
    """
    o = urlparse(uri)
    if o.scheme == 'file':
        path = urllib.url2pathname(o.path)
        return open(path, **kwargs)
    raise MofongoError('Unsupported URI scheme: ' + o.scheme)


class MofongoModel:

    def __init__(self, name, uri, aliases=list(), read_on_load=True, store_on_disposal=True):
        """
        The Mofongo Model Class is the unifying and general class to represent models. To interact with different data
        sources the Mofongo Model uses mediators. Each mediator knows how to load/save data to a particular modelling
        technology and persistence model. For example, a CSV mediator will allow a Mofongo Model to interact with CSV
        data sources. In the case of MOF/EMOF, separate mediators could be used to interact with MOF models in either
        XMI or other persistence models.
        :param name: The name of the model, should be unique within the model manager
        :param uri: An URI to represent the model's identity. The URI is also used for load and save.
        :param aliases: A list of alias names for the model
        :param read_on_load: If the model should be loaded from memory when loaded
        :param store_on_disposal: If the model should be stored to memory when disposed
        """
        self.name = name
        self.uri = uri
        self.aliases = aliases
        self.read_on_load = read_on_load
        self.store_on_disposal = store_on_disposal
        self.elements_by_type = None
        self.loaded = False
        self.modified = None        # We would need a listener for this?
        self.is_loading = False#
        self.root = None
        self.mediator = None

    #TODO These methods could be added by a metaclass so anyone creating new models will get this method for free, preferably this should be a field, more pythonic?

    @classmethod
    def get_boolean_init_parameters(cls):
        """
        This method returns the the set of initialization parameters for which boolean values should be supplied.
        Boolean values are of interest as configuration files as different values can be interpreted as
        boolean pairs, e.g. (True, False), (On, Off), (1, 0), etc. For this reason, boolean initialization parameters
        can not be optional, i.e. they must have a default value.
        """
        return get_function_boolean_parameters(cls.__init__)

    @classmethod
    def get_optional_init_parameters(cls):
        """
        This method returns the set of optional initialization parameters for which non-boolean values should be
        supplied.
        """
        return get_function_optional_parameters(cls.__init__)

    @classmethod
    def get_required_init_parameters(cls):
        """
        This method returns the set of required initialization parameters for which non-boolean values should be
        supplied.
        """
        return get_function_required_parameters(cls.__init__)

    def create_instance(self, model_type):
        """
        Create a new instance of the given type. The new instances is automatically added to the set of elements of the
        model.

        :param model_type: The type to instantiate
        :return: A new object of the given type
        :raises MediatorError: If the type is not known to the model or if it is not instantiatable
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        if self.read_on_load:
            if not self.knows_type(model_type):
                raise MofongoError('Type {} not found in this model.'.format(model_type))
            if not self.is_instantiable(model_type):
                raise MofongoError('Type {} is not instantiable.'.format(model_type))
            instance = model_type()
            self.elements_by_type[model_type].append(instance)
        else:
            #Fixme
            pass
        return instance

    def create_instance(self, type_name, package_name):
        # We dont have the types available, need to find it in the package
        manager = self.mediator.model_manager
        ps = manager.get_model_packages(self.name)
        logger.info("create_instance, package {}".format(ps))
        if package_name is not None:
            p = [p for p in ps.keys() if p.name == package_name][0]
        else:   # There should only be one package
            assert len(ps) == 1
            p = next(iter(ps.keys()))
        logger.info("create_instance, package {}".format(p))
        # Find the type
        #t = [t for t in p.types if t.name == type_name]
        #cls = self.model_lookup.get_class(t)
        P_NAMESPACE = ps[p]
        P_PREFIX = "{%s}" % P_NAMESPACE
        nsmap = self.mediator.nsmap.copy()
        nsmap[P_PREFIX] = P_NAMESPACE
        logger.info("create_instance, nsmap {}".format(nsmap))
        look_up = self.mediator.class_lookup
        parent = None   # FIXME features need a parent!
        t = look_up.get_class_for_tag(p, parent, P_PREFIX+type_name)
        t_class = look_up.get_class(t)
        look_up.create_class_properties(p, t, t_class)
        #xmi_id = uuid.uuid5(uuid.NAMESPACE_DNS, P_NAMESPACE + '/' + ) #FIXME we need another field for unique id
        xmi_id = uuid.uuid1()
        el = t_class()
        el.set(self.mediator.XMI + "id", str(xmi_id))
        logger.info("create_instance, el {}".format(el))
        # e1 = etree.SubElement(model, f + "Member")
        # print(etree.tostring(model, pretty_print=True))
        try:
            of_type = self.elements_by_type[type(el)]
        except KeyError:
            of_type = []
            self.elements_by_type[type(el)] = of_type
        of_type.append(el)
        return el

    def delete_element(self, element):
        """
        Delete an element from the model. If the element does not belong to the model there is no change.
        :param element: The element to delete
        :return : True if the element could be removed
        """
        # TODO Does this method is the equivalent of EcoreUtil.delete? Or is that a specific option for MOF models?
        # What about references for models of different technologies using URIs as references?
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        existing = self.get_all_of_type(type(element))
        success = True
        try:
            existing.remove(element)
        except ValueError:
            success = False
        return success

    def get_all_contents(self):
        """
        Returns a tree iterator that iterates over all the direct contents and indirect contents of this resource.

        :return: ???
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        raise MofongoError('Not implemented yet. See https://mofongo.myjetbrains.com/youtrack/issue/M-11')

    def get_all_of_kind(self, model_type):
        """
        Get all elements in the model that are of the kind of the given type, i.e. the type and the closure of its
        subtypes.

        :param model_type:
        :return: The list of elements that are of the type or a subtype of the given type.
        :raises MediatorError: If the type is not known to the model.
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        elements = []
        elements.extend(self.get_all_of_type(model_type))
        # FIXME FOR CSV
        subclasses = get_all_subclasses(model_type)
        #subclasses = get_all_subclasses_mof(model_type)
        for sc in subclasses:
            elements.extend(self.get_all_of_type(sc))
        return elements

    def get_all_of_type(self, model_type):
        """
        Get all elements in the model for the given type. The correct row type for the model can be retrieved from
        :py:attr:`CsvModel.row_class`.

        Alternatively you can use :py:func:`CsvModel.get_all_of_kind` with cvsModel.Row as the argument if the specific
        model row class is unknown.

        :param model_type: The type of the elements of interest
        :return: A list of all the elements of the given type.
        :raises MediatorError: If the type is not known to the model.
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        return self.elements_by_type.get(model_type, [])         # Avoid error for non existing types.

    def get_contents(self):
        """
        Returns the list of the direct content objects.

        :return: A list with all the direct contents (element.container == self)?
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        #TODO We need to return something else so that modifying that list actually modifies the model, or make the
        # list a reflective collection or something
        raise MofongoError('Not implemented yet. See https://mofongo.myjetbrains.com/youtrack/issue/M-11')

    def get_known_types(self):
        """
        The the set of known types of the model.

        :return: A list containing the list of types used by the model
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        return self.elements_by_type.keys()

    def get_type_by_name(self, name):
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        for t in self.elements_by_type.keys():
            if name == t.__name__:
                return t
        return None

    def get_package_by_name(self, name):
        pass

    def is_instantiable(self, model_type):
        """
        Return whether the given type is instantiable in the model.

        TODO test if the class is abstract or rely on MOF to have the isAbstract flag?

        :param model_type: The type to test
        :return: True if the given type is instantiable
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        #FIXME
        raise MofongoError('Not implemented yet')


    def knows_type(self, model_type):
        """
        Test if the model knows about the given type.

        :param model_type: The type to test
        :return: True if the type is known by the model
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        return model_type in self.get_known_types()

    def load(self, mediator, **kwargs):
        """
        Loads the model using the specified mediator. The mediator must have a load() method which must return all the
        elements loaded by using the model's URI. The options are passed to the mediator's load method.

        :param mediator: The mediator to use for loading the model.
        :param kwargs: A map of feature-value options to tailor the mediator loading operation. The mediator will
            ignore options it doesn't recognize.
        """
        # try:
        #     mediator = options['mediator']
        # except KeyError:
        #     raise MofongoError('Mediator not found. The supplied options must at least contain a "mediator" value. ')
        # TODO move this to the model manager, i.e. the mediator value should be the class
        # try:
        #     mediator = globals()[mediator_name]
        # except KeyError:
        #     raise MofongoError('Mediator not found. The mediator class {0} could not be found'.format(mediator_name))
        self.mediator = mediator
        kwargs['uri'] = self.uri
        kwargs['read_on_load'] = self.read_on_load
        if not self.loaded:
            self.is_loading = True
            try:
                self.elements_by_type, self.root = mediator.load(**kwargs)
            except EnvironmentError as e:    # Raised if an error handling the underlying file
                if not self.store_on_disposal:
                    raise MofongoError('The model could not be opened with the supplied mediator. ' + str(e))
            else:
                self.loaded = True
                self.modified = False
                if not self.read_on_load and self.store_on_disposal:
                    self.model_lookup = MofModelLookup(mediator.model_manager)
            finally:
                self.is_loading = False

    def store(self, mediator, **kwargs):
        """
        Stores the model using the specified mediator. The mediator must have a store(data[]) method which persists the
        objects in the parameter array using the model's URI. The options are passed to the mediator's store method.

        :param mediator: The mediator to use for loading the model.
        :param options: A map of feature-value options to tailor the mediator loading operation. The mediator will
            ignore options it doesn't recognize.
        """
        if not self.loaded:
            raise MofongoError('This operation requires the model to be loaded.')
        mms = mediator.model_manager.get_model_packages(self.name)
        kwargs['uri'] = self.uri
        kwargs['read_on_load'] = self.read_on_load
        mediator.store(self.elements_by_type.values(), mms, **kwargs)

    def unload(self):
        self.loaded = False
        self.elements_by_type = None


class Row:
    """
    Base class from which all specific model row classes inherit. This provides a common super type for all rows.
    """
    pass


class RowMetaclass(type):
    """
    The Row Metaclass is used to instantiate the specific csv model classes.
    """

    def __call__(cls, **kwargs):
        """
        Instantiate a new object of the respective csv model class and adds the additional attributes (with values).

        :param kwargs list: The specific attributes to set in the new object based on the csv model class.
        :return: A new instance of the csv model class.
        :rtype: object
        """
        o = type.__call__(cls)
        # Add the row headers as attributes to the class
        for key, value in kwargs.items():
            setattr(o, key, value)
        return o


class CsvMediator:
    """
    A mediator to allow mofongo to use CSV files as data sources for models.
    Each row of the csv file is represented as a model element who's attributes correspond to the headers of
    the CSV file (if present). Each mediator constructs a unique class used to instantiate its elements. For files
    without a header row, the *field names* parameter can be provided to be used the as headers. Additionally, if no
    specific headers are known/wanted the *no headers* parameter can be set to **True**, in which case the resulting
    class will have attributes field_0, field_1, ..., field_n.

    If the row read has more fields than the header sequence (as determined from above), the remaining data is added
    as a sequence keyed by the value of restkey. If the row read has fewer fields than the fieldnames sequence, the
    remaining keys take the value of the optional restval parameter. For the restval option to work, lines with
    missing fields should not end in a comma, as this would be interpreted as an empty value.

    An optional dialect parameter can be given which is used to define a set of parameters specific to a particular
    CSV dialect. It may be an instance of a subclass of the Dialect class or one of the strings returned by the list
    dialects() function. The default dialect is excel.
    """
    def __init__(self, field_names=list(), first_row_is_headers=False, encoding='utf-8', restkey=None,
                 restval=None, dialect='excel'):
        """
        Initialize a new CsvMediator.

        :param field_names: A sequence whose elements are associated with the fields of the input data in order.
        :param first_row_is_headers: True to use the first row of the file as field names, field_names should be None
        :param encoding: The encoding in the of the csv file
        :param restkey: The attribute name used to group any data in a row that has more fields than the
            field_names/headers
        :param restval: The value to use when a row has fewer fields than the field_names/headers
        :param dialect: Define a set of parameters specific to a particular CSV dialect
            (see `Dialects <https://docs.python.org/3/library/csv.html#csv.Dialect>`_). The default dialect is excel.
        """
        self.encoding = encoding
        self.field_names = field_names
        self.first_row_is_headers = first_row_is_headers
        self._use_field_names = first_row_is_headers or (len(field_names) > 0)
        self.restkey = restkey
        self.restval = restval
        self.dialect = dialect
        # TODO Check how to register the class in the globals so we can later retrieve it
        # globals()[self.row_class.__name__] = self.row_class

    @classmethod
    def get_boolean_init_parameters(cls):
        """
        This method returns a the set of initialization parameters for which boolean values should be supplied.
        Boolean values are of interest as configuration files as different values can be interpreted as
        boolean pairs, e.g. (True, False), (On, Off), (1, 0), etc. For this reason, boolean initialization parameters
        can not be optional, i.e. they must have a default value.
        """
        return get_function_boolean_parameters(cls.__init__)

    @classmethod
    def get_optional_init_parameters(cls):
        """
        This method returns the set of optional initialization parameters for which non-boolean values should be
        supplied.
        """
        return get_function_optional_parameters(cls.__init__)

    @classmethod
    def get_required_init_parameters(cls):
        """
        This method returns the set of required initialization parameters for which non-boolean values should be
        supplied.
        """
        return get_function_required_parameters(cls.__init__)


    @classmethod
    def get_boolean_load_parameters(cls):
        """
        This method returns the set of required load parameters for which non-boolean values should be
        supplied.
        """
        return get_function_boolean_parameters(cls.load)

    @classmethod
    def get_optional_load_parameters(cls):
        """
        This method returns the set of required initialization parameters for which non-boolean values should be
        supplied.
        """
        return get_function_optional_parameters(cls.load)

    @classmethod
    def get_required_load_parameters(cls):
        """
        This method returns the set of required initialization parameters for which non-boolean values should be
        supplied.
        """
        parameters = get_function_required_parameters(cls.load)
        parameters.remove('kwargs')     # kwargs are not configurable
        return parameters

    @classmethod
    def get_boolean_store_parameters(cls):
        """
        This method returns the set of required initialization parameters for which non-boolean values should be
        supplied.
        """
        return get_function_boolean_parameters(cls.store)

    @classmethod
    def get_optional_store_parameters(cls):
        """
        This method returns the set of required initialization parameters for which non-boolean values should be
        supplied.
        """
        parameters = get_function_optional_parameters(cls.store)
        return parameters

    @classmethod
    def get_required_store_parameters(cls):
        """
        This method returns the set of required initialization parameters for which non-boolean values should be
        supplied.
        """
        parameters = get_function_required_parameters(cls.store)
        parameters.remove('data')  # Data is not a configuration parameter
        parameters.remove('kwargs')  # kwargs are not configurable
        return parameters

    def load(self, uri="", base_name="", read_on_load=False, **kwargs):
        """
        Loads the csv file by creating instances of the row class for each row in the file. Returns a list of all the
        elements in the model. The field_names is modified depending on the loading options.

        :param uri: The URI of the model
        :param base_name: The base name for the created Row subclass
        :param read_on_load: Whether the data is read when loading the model.
        :return: A dict of objects (if read_on=load) {class: []}, of elements grouped by type
        :rtype: Dictionary
        """
        row_class = RowMetaclass(base_name.capitalize() + 'Row', (Row,), {})
        rows = []
        elements = {row_class: rows}
        #if not kwargs:
        #    kwargs = dict()     #TODO do we need this?
        kwargs['newline'] = ''
        field_names = self.field_names
        if not field_names and not self.first_row_is_headers:
            # Get the number of fields from the first row, and crate names for them: field_0, field_1, ..., field_n
            with get_scheme_context_manager(uri, kwargs) as csvfile:
                reader = csv.reader(csvfile)
                row = next(reader)
                field_size = len(row)
                field_names = ['field_' + str(n) for n in range(field_size)]
        with get_scheme_context_manager(uri, kwargs) as csvfile:
            if self.first_row_is_headers:
                reader = csv.DictReader(csvfile, restkey=self.restkey, restval=self.restval, dialect=self.dialect)
            else:
                reader = csv.DictReader(csvfile, fieldnames=field_names, restkey=self.restkey, restval=self.restval,
                                        dialect=self.dialect)
            self.field_names = reader.fieldnames
            # TODO Other mediators for model instances with a metamodel should add an etry for every type in the
            # metamodel, even if the model does not have instaces of that type.
            if read_on_load:
                for row in reader:
                    rows.append(row_class(**row))
        return elements

    def store(self, data, uri="", append=False, **kwargs):
        """
        Persists a list of objects in a csv file

        :param data: A list with the objects to be persisted
        :param uri: The URI of the model (i.e. path to the CSV file)
        :param append: If set to true, the data is appended to the end of the CSV file
        """
        #if not kwargs:
        #    kwargs = dict()  # TODO do we need this?
        kwargs['newline'] = ''
        if append:
            kwargs['mode'] = 'a'
        else:
            kwargs['mode'] = 'w'
        with get_scheme_context_manager(uri, kwargs) as csvfile:
            writer = csv.writer(csvfile, dialect=self.dialect)
            if self._use_field_names:
                writer.writerow(self.field_names)
            for o in data:
                row = []
                for key in self.field_names:
                    value = vars(o).get(key, self.restval)
                    # If the key is restkey, there might me multiple values
                    if key == self.restkey:
                        if not isinstance(value, str):
                            for u in value:
                                row.append(u)
                    else:
                        row.append(value)
                writer.writerow(row)


class MofModelLookup(etree.PythonElementClassLookup):

    def __init__(self, model_manager):
        self.model_manager = model_manager
        self.classes = dict()

    def lookup(self, document, element):
        tag = etree.QName(element.tag)
        uri = tag.namespace
        if uri is None:
            # Use my parents
            parent = element.getparent()
            p_tag = etree.QName(parent.tag)
            uri = p_tag.namespace   # fIXME propaby recurse till we find one
        p = self.model_manager.get_pacakge(uri)
        if p is not None:
            parent = element.getparent()
            t = self.get_class_for_tag(p, parent, element.tag)
            t_class = self.get_class(t)
            self.create_class_properties(p, t, t_class)
            return t_class
        return None

    def get_class_for_tag(self, p, parent, element_tag):
        tag = etree.QName(element_tag)
        if parent is None or parent.prefix == "xmi":
            t = [t for t in p.types if t.name == tag.localname][0]
        else:
            parent_tag = etree.QName(parent.tag)
            parent_type = [t for t in p.types if t.name == parent_tag.localname][0]
            for sf in parent_type.structural_features:
                if sf.name == tag.localname:
                    t = p.find_type(sf.type)
                    break
        return t

    def create_class_properties(self, p, t, t_class):
        for sf in t.structural_features:
            feature_name = sf.name
            cont = sf.attrib.get('containment', False)
            mult = int(sf.attrib.get('upperBound', '0'))
            if not cont:
                if mult == 0:
                    opposite_href = sf.attrib.get('eOpposite', None)
                    if opposite_href is not None:
                        # FIXME we need to solve multipackages
                        # FIXME we need a resolve mechanism by id
                        opposite_sf = p.find_sf(opposite_href)
                        if 'containment' in opposite_sf.attrib:
                            opposite_sf_name = opposite_sf.name
                    else:
                        opposite_sf_name = None
                    func = self.get_property_function(feature_name, opposite_sf_name)
                else:
                    func = self.get_multi_property_function(feature_name)
            else:
                if mult == 0:
                    opposite_href = sf.attrib.get('eOpposite', None)
                    if opposite_href is not None:
                        # FIXME we need to solve multipackages
                        # FIXME we need a resolve mechanism by id
                        opposite_sf = p.find_sf(opposite_href)
                        if 'containment' in opposite_sf.attrib:
                            opposite_sf_name = opposite_sf.name
                    else:
                        opposite_sf_name = None
                    func = self.get_cont_property_function(feature_name, opposite_sf_name)
                else:
                    func = self.get_multi_cont_property_function(feature_name)
            setattr(t_class, sf.name, property(func))

        setattr(t_class, 'eClass', property(self.get_eclass_function(t)))

    @classmethod
    def get_eclass_function(cls, t):
        def func(self):
            return t

        return func

    @classmethod
    def get_multi_cont_property_function(cls, feature_name):
        def func(self):
            return [c for c in self if etree.QName(c.tag).localname == feature_name]

        return func

    @classmethod
    def get_cont_property_function(cls, feature_name, opposite_sf):
        def func(self):
            try:
                val = [c for c in self if etree.QName(c.tag).localname == feature_name][0]
            except IndexError:  # The attribute has no value
                val = None
            # Is the opposite?
            if val is None and opposite_sf is not None:
                parent = self.getparent()
                opp_val = getattr(parent, opposite_sf)
                try:
                    if self in opp_val:
                        return parent
                except TypeError:   # Item is not iterable
                    pass
                if self is opp_val:
                    return parent
                    val = parent
                else:
                    # FIXME we need to search all the classes
                    pass
            return val

        return func

    @classmethod
    def get_multi_property_function(cls, feature_name):
        def func(self):
            return self.get(feature_name).split(' ')

        return func

    @classmethod
    def get_property_function(cls, feature_name, opposite_sf):
        def func(self):
            val = self.get(feature_name)
            # Is the opposite?
            if val is None and opposite_sf is not None:
                parent = self.getparent()
                opp_val = getattr(parent, opposite_sf)
                try:
                    if self in opp_val:
                        return parent
                except TypeError:      # Item is not iterable
                    pass
                if self is opp_val:
                    return parent
                    val = parent
                else:
                    # FIXME we need to search all the classes
                    pass
            return val

        return func

    def get_class(self, t):
        try:
            t_class = self.classes[t.name]
        except KeyError:
            # Need to make sure super classes exist first
            super_class = {etree.ElementBase}
            for sc in t.super_class:
                super_class.add(self.get_class(sc))
            t_class = type(t.name, tuple(super_class), {})
            self.classes[t.name] = t_class
        return t_class


class MofMediator:

    XMI_NAMESPACE = "http://www.omg.org/XMI"
    XSI_NAMESPACE = "http://www.w3.org/2001/XMLSchema-instance"
    XMI = "{%s}" % XMI_NAMESPACE
    XSI = "{%s}" % XSI_NAMESPACE
    nsmap = {'xmi': XMI_NAMESPACE, 'xsi': XSI_NAMESPACE}

    def __init__(self, model_manager):
        self.model_manager = model_manager
        self.eContainers = dict()
        self.href_resolution = dict()
        self.package_lookpup = dict()  # etree lookup classes for each package
        self.class_lookup = MofModelLookup(self.model_manager)

    # def href_reolution(self):
    #     # Fix type references TODO handle deeper nestings!
    #     # #/1/Member
    #     type_reference_regex = re.compile(r'#/(\d?)/(\w*)')
    #     # for p in packages.values():
    #     #    for c in p:
    #     for a in [a for a in root.iterfind(".//eStructuralFeatures")]:
    #         info = type_reference_regex.search(a.type)
    #         p_id, type_name = info.groups()
    #         if not p_id:
    #             p_id = 0
    #         if type_name in ecore_data_types:
    #             a.type = type_name
    #         else:
    #             p = packages[p_id]
    #             t = [t for t in p.types if t.__name__ == type_name][0]
    #             a.type = t

    def load(self, uri="", read_on_load=False, **kwargs):
        elements = dict()
        root = None
        self.parser = etree.XMLParser()
        self.parser.set_element_class_lookup(self.class_lookup)
        try:
            with get_scheme_context_manager(uri, kwargs) as moffile:
                ecore_tree = etree.parse(moffile, self.parser)
                root = ecore_tree.getroot()
                if read_on_load:
                    for element in root.iter("*"):
                        of_type = elements.get(type(element), [])
                        if len(of_type) == 0:
                            elements[type(element)] = of_type
                        of_type.append(element)
                else:
                    #delete all?
                    pass
        except FileNotFoundError as ex:
            # File does not exist?
            if read_on_load:
                raise ex
        return elements, root

    def store(self, data, packages, uri="", read_on_load=True, append=False, **kwargs):
        mode = 'w'
        if not read_on_load:
            # Create a new model
            # Add model packages
            nsmap = self.nsmap.copy()
            if len(packages) > 1:
                for p, p_uri in packages.items():
                    nsmap[p.name] = p_uri
            else:
                p_uri = next(iter(packages.values()))
                nsmap[None] = p_uri
            root = etree.Element(self.XMI + "XMI", nsmap=nsmap)
            root.set(self.XMI + 'version', "2.0")
        else:
            with get_scheme_context_manager(uri, kwargs) as moffile:
                ecore_tree = etree.parse(moffile, self.parser)
                root = ecore_tree.getroot()
        # if append mode = 'a'?
        for elements in data:
            for e in elements:
                if e.getparent() is None:
                    root.append(e)
        encoding = 'ISO-8859-1'
        open_args = {'mode': 'wb'}
        with get_scheme_context_manager(uri, open_args) as moffile:
            moffile.write(etree.tostring(root, encoding=encoding, pretty_print=True))


class ModelManager:
    """
    The model manager is used to a manage a set of models of interest in a particular modelling activity. The model
    manager can be used to load models from "model configuration files" (which are plain INI files), create unique ids
    for element traces, etc.
    """
    MEDIATOR_KEY = '__mediator__'
    BOOLEAN_STATES = {'1': True, 'yes': True, 'true': True, 'on': True,
                      '0': False, 'no': False, 'false': False, 'off': False}

    def __init__(self):
        # Referece models by name (name, model)
        self.models = dict()
        # Reference models by alias
        self.alias_models = dict()
        self._mediators = dict()
        self.store_args = dict()    # model,**kwargs of store options
        self.packages = dict()
        self.mms = dict()

    def load_file(self, file, partial=False):
        """
        Load a set of models defined in a configuration file.

        Each section of the file represents a model, and the section name is used as the model name. Each section must
        define two keys:
        - __mediator__ : The class name of the mediator used to load the model. The module containing the mediator class
        must have been loaded (e.g. import statement)
        - path : The path to the model file.

        All models can provide three additional optional arguments:
        - aliases : A list of alias names that can be used to identify the model.
        - read_on_load : If the model should be read from its source data file when loaded.
        - store_on_disposal : If the model should be stored to its data file when disposed.

        Each mediator can define additional required and optional arguments. Refer to the specific documentation.

        :param file:
        :param partial: Allow the manager to load the models partially. If set to false (default) fail to load any model will result in no models loaded.
        :return: The list of models successfully loaded.
        :raises ModelManagerError: If there is an error loading any of the models. If partial = True, exceptions are silently ignored.
        """
        config = configparser.ConfigParser()
        config.read_file(file)
        self._load(config, partial)
        return self.models.keys()

    def load_string(self, string, partial=False):
        """
        Load a set of models defined in a string. The string must have the same structure as the configuration file for
        :py:func:`ModelManager.load_file`.

        :param string:
        :return: The list of models successfully loaded.
        """
        config = configparser.ConfigParser()
        config.read_string(string)
        self._load(config, partial)
        return self.models.keys()

    def register_mediator(self, name, mediator):
        """
        Register a user defined model mediator. Refer to XXX to get the details on how to provider specialized/new
        mediators.

        :param name: The name used to identify the mediator in configuration files. Must be unique.
        :param mediator: The class of the mediator.
        :raises ModelManagerError: If the name is not unique or the mediator is not a subclass of MofongoModel.
        """
        if name in self._mediators:
            raise ModelManagerError('The name of mediators must be unique.')
        self._mediators[name] = mediator

    def dispose(self):
        """
        Dispose all models managed my the Model Manager
        """
        for model in self.models.values():
            if model.store_on_disposal:
                try:
                    model.store()
                except AttributeError:      # Some model mediators may not have a store method
                    warn("The model mediator does not provide a store() method. The model {} can't be stored."
                         .format(model.name))

    def add_model(self, name, model, mms, aliases=[]):
        self.models[name] = model
        for alias in aliases:
            self.alias_models[alias] = model
        res = {v: k for k, v in mms.items()}
        self.mms[name] = res

    def register_package(self, uri, package):
        self.packages[uri] = package

    def register_packages(self, packages):
        self.packages.update(packages)

    def get_pacakge(self, uri):
        p = self.packages.get(uri, None)
        return self.packages.get(uri, None)

    def get_model_packages(self, name):
        return self.mms[name]

    def _load(self, config, partial):
        """
        Load all the models in the configuration.

        :param config:
        :param partial:
        :return:
        """
        for section in config.sections():
            settings = config[section]
            try:
                mediator_name = settings.pop(self.MEDIATOR_KEY)
            except KeyError:
                msg = 'Configuration for model {} needs a "__mediator__" key to indicate the mediator to use.'.format(section)
                if not partial:
                    raise ModelManagerError(msg)
                else:
                    warn(section)
            else:
                try:
                    mediator_class = self._mediators[mediator_name]
                except KeyError:
                    raise ModelManagerError("No mediator has been registered for the given __mediator__ setting: {}"
                                            .format(mediator_name))

                # We have 4 sets of keys: Model_init, mediator_init, mediator_load and mediator_store
                # 1. Instantiate the mediator
                mediator_init_keys = mediator_class.get_required_init_parameters() | MofongoModel.get_optional_init_parameters()
                mediator_init_bool_keys = mediator_class.get_boolean_init_parameters()
                missing_mediator_init_keys = mediator_class.get_required_init_parameters() - settings.keys() - set(
                    'name')  # Name comes from the section
                if missing_mediator_init_keys:
                    if not partial:
                        raise ModelManagerError("Configuration needs a {} setting(s)".format(missing_mediator_init_keys))
                    else:
                        continue
                mediator_init_kwargs = self._create_kwargs(settings, mediator_init_keys, mediator_init_bool_keys)
                try:
                    mediator = mediator_class(**mediator_init_kwargs)
                except TypeError as e: # TypeError for error in arguments
                    if not partial:
                        raise ModelManagerError('Error creating mediator instance {}. '.format(mediator_name) + e.args)
                else:
                    # 2. Instantiate the model
                    model_init_keys = MofongoModel.get_required_init_parameters() | MofongoModel.get_optional_init_parameters()
                    model_init_bool_keys = MofongoModel.get_boolean_init_parameters()
                    missing_model_init_keys = MofongoModel.get_required_init_parameters() - settings.keys() - set('name')   # Name comes from the section
                    if missing_model_init_keys:
                        if not partial:
                            raise ModelManagerError("Configuration needs a {} setting(s)".format(missing_model_init_keys))
                        else:
                            continue
                    model_init_kwargs = self._create_kwargs(settings, mediator_init_keys, mediator_init_bool_keys)
                    try:
                        model = mediator_class(name=section, **model_init_kwargs)
                    except TypeError as e:
                        # TypeError for error in arguments
                        if not partial:
                            raise ModelManagerError('Error creating the mofongo model instance {}. '.format(section) + e.args)
                    else:
                        load_keys = mediator_class.get_required_load_parameters() | mediator_class.get_optional_load_parameters()
                        load_bool_keys = mediator_class.get_boolean_load_parameters()
                        missing_load_keys = mediator_class.get_required_load_parameters() - settings.keys() - set('name')  # Name comes from the section
                        if missing_load_keys:
                            if not partial:
                                raise ModelManagerError("Configurations need a {} setting(s)".format(missing_load_keys))
                            else:
                                continue
                        load_kwargs = self._create_kwargs(settings, model_init_keys, model_init_bool_keys)
                        try:
                            model.load(mediator, **load_kwargs)
                        except TypeError as e: # TypeError for error in arguments
                            if not partial:
                                raise ModelManagerError(
                                    'Error creating the mofongo model instance {}. '.format(section) + e.args)
                        except AttributeError:
                            warn("The mediator {0} does not provide a load() method. The model at {1} "
                                 "can't be loaded.".format(mediator_name, load_kwargs["uri"]))
                            self.models[section] = None
                        else:
                            self.models[section] = model
                            if 'aliases' in load_kwargs:
                                for a in load_kwargs['aliases']:
                                    if a in self.alias_models:
                                        self.alias_models[a].append(model)
                                    else:
                                        self.alias_models[a] = [model]
                        #model.load(mediator, **kwargs)
                store_keys = mediator_class.get_required_init_parameters() | mediator_class.get_optional_init_parameters()
                store_bool_keys = mediator_class.get_boolean_init_parameters()
                missing_store_keys = mediator_class.get_required_init_parameters() - settings.keys() - set('name')  # Name comes from the section
                if missing_store_keys:
                    if not partial:
                        raise ModelManagerError("Configurations need a {} setting(s)".format(missing_store_keys))
                    else:
                        continue


    def get_go_by_name(self, name):
        """
        Get all models that either respond to the name or the alias
        """
        models = []
        if name in self.models:
            models.append(self.models[name])
        if name in self.alias_models:
            models.append(self.alias_models[name])
        return models

    def _convert_to_boolean(self, value):
        """Return a boolean value translating from other types if necessary.

        """
        if value.lower() not in self.BOOLEAN_STATES:
            raise ValueError('Not a boolean: %s' % value)
        return self.BOOLEAN_STATES[value.lower()]

    #TODO handle config multi-values, i.e. lists
    def _create_kwargs(self, settings, complete_keys, bool_keys):
        """
        Return a list of kwargs to initialize a model.

        This methods deals with list and boolean values.

        :param settings: The settings from which the key,value pairs of the kwargs are extracted
        :param complete_keys: The keys of interest in the settings
        :param bool_keys: The keys that should be processed as boolean values

        :return: A dict of valid initializing attributes
        """
        kwargs = dict()
        for key in complete_keys:
            if key in settings:
                val = settings[key]
                fin = list(filter(None, val.splitlines()))
                if len(fin) == 1:
                    if key in bool_keys:
                        kwargs[key] = self._convert_to_boolean(fin[0])
                    else:
                        kwargs[key] = fin[0]
                else:
                    if key in bool_keys:
                        ret = []
                        for f in fin:
                            ret.append(self._convert_to_boolean(f))
                        kwargs[key] = ret
                    else:
                        kwargs[key] = fin
        return kwargs
