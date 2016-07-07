import inspect
import os
import random
from unittest import mock
from unittest import TestCase
from urllib.parse import urljoin
from urllib.parse import urlparse
import urllib.request as urllib

from mofongo import presentation
from mofongo.core import MofongoError, ModelManagerError
from mofongo.presentation import MofongoModel
from mofongo.presentation import CsvMediator

__author__ = 'Horacio Hoyos'
__copyright__ = 'Copyright ${YEAR}, Kinori Technologies'


class T1:
    def __init__(self, name):
        self.name = name


class T2(T1):
    def __init__(self, name):
        self.name = name


class T3(T2):
    def __init__(self, name):
        self.name = name


class T4:
    def __init__(self, name):
        self.name = name


class T5(T2, T4):
    def __init__(self, name):
        self.name = name


class TestPresentation(TestCase):

    def test_get_file_scheme_context_manager(self):
        uri = urljoin('file:', 'foo')
        options = {'newline': ''}
        m = mock.mock_open()
        with mock.patch('{}.open'.format('mofongo.presentation'), m, create=True):
            with presentation.get_scheme_context_manager(uri, options) as cm:
                pass
            m.assert_called_with('\\foo', newline='')
            options = {'mode': 'w'}
            with presentation.get_scheme_context_manager(uri, options) as cm:
                pass
            m.assert_called_with('\\foo', mode='w')

    def test_get_unknown_scheme_context_manager(self):
        uri = urljoin('err:', 'foo')
        options = {'newline': ''}
        m = mock.mock_open()
        with mock.patch('{}.open'.format('mofongo.presentation'), m, create=True):
            with self.assertRaises(MofongoError):
                presentation.get_scheme_context_manager(uri, options)

    def test_get_all_subclasses(self):
        for sc in presentation.get_all_subclasses(T1):
            self.assertIn(sc, [T2, T3, T5])
        for sc in presentation.get_all_subclasses(T2):
            self.assertIn(sc, [T3, T5])
        for sc in presentation.get_all_subclasses(T3):
            self.assertTrue(False)
        else:
            pass
        for sc in presentation.get_all_subclasses(T4):
            self.assertEquals(sc, T5)
        for sc in presentation.get_all_subclasses(T5):
            self.assertTrue(False)
        else:
            pass


class TestMofongoModel(TestCase):

    def test_get_boolean_init_parameters(self):
        params = MofongoModel.get_boolean_init_parameters()
        self.assertIn('read_on_load', params)
        self.assertIn('store_on_disposal', params)

    def test_get_optional_init_parameters(self):
        params = MofongoModel.get_optional_init_parameters()
        self.assertIn('aliases', params)

    def test_get_required_init_parameters(self):
        params = MofongoModel.get_required_init_parameters()
        self.assertIn('name', params)
        self.assertIn('uri', params)

    def test_load(self):
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = ['foo']
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            instance.load.assert_called_with(read_on_load=True, uri=uri)
            self.assertEquals(m.elements, ['foo'])

    def test_load_fail(self):
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.side_effect = EnvironmentError('Boom!')
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            with self.assertRaises(MofongoError):
                m.load(mediator())

    def test_access_before_load(self):
        m = presentation.MofongoModel(name="users", uri=None)
        with self.assertRaises(MofongoError):
            m.get_all_contents()
        with self.assertRaises(MofongoError):
            m.get_all_of_kind(T1)
        with self.assertRaises(MofongoError):
            m.get_all_of_type(T1)
        with self.assertRaises(MofongoError):
            m.get_contents()
        with self.assertRaises(MofongoError):
            m.get_known_types()
        with self.assertRaises(MofongoError):
            m.get_type_by_name("T1")
        with self.assertRaises(MofongoError):
            m.is_instantiable(T1)
        with self.assertRaises(MofongoError):
            m.knows_type(T1)
        with self.assertRaises(MofongoError):
            m.store(None)

    def test_store(self):
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.elements = ['foo', 'boo']
            m.store(mediator())
            instance.store.assert_called_with(['foo', 'boo'], uri=uri)

    def test_get_all_of_type(self):
        count_t1 = 4
        count_t2 = 3
        count_t3 = 2
        elements = [T1(i) for i in range(count_t1)]
        elements.extend([T2(i) for i in range(count_t2)])
        elements.extend([T3(i) for i in range(count_t3)])
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = elements
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            result = m.get_all_of_type(T1)
            self.assertEqual(len(result), count_t1)
            result = m.get_all_of_type(T2)
            self.assertEqual(len(result), count_t2)
            result = m.get_all_of_type(T3)
            self.assertEqual(len(result), count_t3)

    def test_get_unknown_type(self):
        count_t1 = 4
        elements = [T1(i) for i in range(count_t1)]
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = elements
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            self.assertFalse(m.get_all_of_type(T2))

    def test_get_all_of_kind(self):
        count_t1 = 4
        count_t2 = 3
        count_t3 = 2
        elements = [T1(i) for i in range(count_t1)]
        elements.extend([T2(i) for i in range(count_t2)])
        elements.extend([T3(i) for i in range(count_t3)])
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = elements
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            result = m.get_all_of_kind(T1)
            self.assertEqual(len(result), count_t1+count_t2+count_t3)
            [self.assertIsInstance(e, T1) for e in result]
            result = m.get_all_of_kind(T2)
            self.assertEqual(len(result), count_t2+count_t3)
            [self.assertIsInstance(e, T2) for e in result]
            result = m.get_all_of_kind(T3)
            self.assertEqual(len(result), count_t3)
            [self.assertIsInstance(e, T3) for e in result]

    def test_get_unknown_kind(self):
        count_t1 = 4
        elements = [T1(i) for i in range(count_t1)]
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = elements
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            self.assertFalse(m.get_all_of_kind(T2))

    def test_is_instantiable(self):
        class T1:
            def __init__(self, id):
                self.id = id

        count_t1 = 4
        elements = [T1(i) for i in range(count_t1)]
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = elements
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            self.assertTrue(m.is_instantiable(T1))

    def test_get_all_contents(self):
        count_t1 = 4
        elements = [T1(i) for i in range(count_t1)]
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = elements
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            self.assertEqual(len(m.get_all_contents()), 4)

    def test_create_instance(self):
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = [T1(1)]
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            new_element = m.create_instance(T1)
            self.assertIsInstance(new_element, T1)

    def test_create_instance_invalid(self):
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = []
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            with self.assertRaises(MofongoError):
                m.create_instance(int)

    def test_delete_element(self):
        count_t1 = 4
        elements = [T1(i) for i in range(count_t1)]
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = elements
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            deleted = random.choice(elements)
            success = m.delete_element(deleted)
            self.assertTrue(success)
            result = m.get_all_of_type(T1)
            self.assertNotIn(deleted, result)

    def test_delete_unexisting_element_wrong_type(self):
        count_t1 = 4
        elements = [T1(i) for i in range(count_t1)]
        with mock.patch('mofongo.presentation.CsvMediator', create=True) as mediator:
            instance = mediator.return_value
            instance.load.return_value = elements
            uri = urljoin('file:', 'foo')
            m = presentation.MofongoModel(name="users", uri=uri)
            m.load(mediator())
            deleted = T2(1)
            success = m.delete_element(deleted)
            self.assertFalse(success)


class TestCsvMediator(TestCase):

    def test_get_boolean_init_parameters(self):
        params = CsvMediator.get_boolean_init_parameters()
        self.assertIs(1, len(params))
        self.assertIn('first_row_is_headers', params)

    def test_get_optional_init_parameters(self):
        params = CsvMediator.get_optional_init_parameters()
        self.assertIs(5, len(params))
        self.assertIn('field_names', params)
        self.assertIn('encoding', params)
        self.assertIn('restkey', params)
        self.assertIn('restval', params)
        self.assertIn('dialect', params)

    def test_get_required_init_parameters(self):
        params = CsvMediator.get_required_init_parameters()
        self.assertIs(0, len(params))

    def test_get_boolean_load_parameters(self):
        params = CsvMediator.get_boolean_load_parameters()
        self.assertIs(1, len(params))
        self.assertIn('read_on_load', params)

    def test_get_optional_load_parameters(self):
        params = CsvMediator.get_optional_load_parameters()
        self.assertIs(2, len(params))
        self.assertIn('uri', params)
        self.assertIn('base_name', params)

    def test_get_required_load_parameters(self):
        params = CsvMediator.get_required_load_parameters()
        self.assertIs(0, len(params))

    def test_get_boolean_store_parameters(self):
        params = CsvMediator.get_boolean_store_parameters()
        self.assertIs(1, len(params))
        self.assertIn('append', params)

    def test_get_optional_store_parameters(self):
        params = CsvMediator.get_optional_store_parameters()
        self.assertIs(1, len(params))
        self.assertIn('uri', params)

    def test_get_required_store_parameters(self):
        params = CsvMediator.get_required_store_parameters()
        self.assertIs(0, len(params))

    def test_row_class_is_subclass_of_presentation_row(self):
        filename = os.path.join(os.path.dirname(__file__), 'resources/CSV_TEST_DATA.csv')
        mediator = CsvMediator(first_row_is_headers=True)
        uri = urljoin('file:', urllib.pathname2url(filename))
        data = mediator.load(uri=uri, base_name="test", read_on_load=True)
        self.assertEquals(len(data), 1)  # Only one type of elements
        row_class = list(data.keys())[0]
        self.assertTrue(issubclass(row_class, presentation.Row))

    def test_with_headers(self):
        filename = os.path.join(os.path.dirname(__file__), 'resources/CSV_TEST_DATA.csv')
        mediator = CsvMediator(first_row_is_headers=True)
        uri = urljoin('file:', urllib.pathname2url(filename))
        data = mediator.load(uri=uri, base_name="test", read_on_load=True)
        self.assertEquals(len(data), 1)     # Only one type of elements
        row_class = list(data.keys())[0]
        self.assertEquals(len(data[row_class]), 4)  # Four rows
        row_element = data[row_class][0]
        self.assertTrue(hasattr(row_element, "id"))
        self.assertTrue(hasattr(row_element, "first_name"))
        self.assertTrue(hasattr(row_element, "last_name"))
        self.assertTrue(hasattr(row_element, "email"))
        self.assertTrue(hasattr(row_element, "country"))
        self.assertTrue(hasattr(row_element, "ip_address"))
        self.assertEqual(row_element.id, "1")
        self.assertEqual(row_element.first_name, "Craig")
        self.assertEqual(row_element.last_name, "Moore")
        self.assertEqual(row_element.email, "cmoore0@bizjournals.com")
        self.assertEqual(row_element.country, "New Caledonia")
        self.assertEqual(row_element.ip_address, "150.211.249.201")

    def test_no_read_on_load(self):
        filename = os.path.join(os.path.dirname(__file__), 'resources/CSV_TEST_DATA.csv')
        mediator = CsvMediator(first_row_is_headers=True)
        uri = urljoin('file:', urllib.pathname2url(filename))
        data = mediator.load(uri=uri, base_name="test", read_on_load=False)
        self.assertEquals(len(data), 1)  # Only one type of elements
        for k, v in data.items():
            self.assertEquals(len(v), 0)

    def test_with_no_headers(self):
        filename = os.path.join(os.path.dirname(__file__), 'resources/CSV_TEST_DATA_NO_HEADERS.csv')
        mediator = CsvMediator()
        uri = urljoin('file:', urllib.pathname2url(filename))
        data = mediator.load(uri=uri, base_name="test", read_on_load=True)
        self.assertEquals(len(data), 1)  # Only one type of elements
        row_class = list(data.keys())[0]
        self.assertEquals(len(data[row_class]), 10)  # Ten rows
        row_element = data[row_class][0]
        self.assertTrue(hasattr(row_element, "field_0"))
        self.assertTrue(hasattr(row_element, "field_1"))
        self.assertTrue(hasattr(row_element, "field_2"))
        self.assertTrue(hasattr(row_element, "field_3"))
        self.assertTrue(hasattr(row_element, "field_4"))
        self.assertTrue(hasattr(row_element, "field_5"))
        self.assertEqual(row_element.field_0, "1")
        self.assertEqual(row_element.field_1, "Peter")
        self.assertEqual(row_element.field_2, "Carter")
        self.assertEqual(row_element.field_3, "pcarter0@jugem.jp")
        self.assertEqual(row_element.field_4, "China")
        self.assertEqual(row_element.field_5, "26.177.133.38")

    def test_with_external_headers(self):
        filename = os.path.join(os.path.dirname(__file__), 'resources/CSV_TEST_DATA_NO_HEADERS.csv')
        mediator = CsvMediator(field_names=["id", "first_name", "last_name", "email", "country", "ip_address"])
        uri = urljoin('file:', urllib.pathname2url(filename))
        data = mediator.load(uri=uri, base_name="test", read_on_load=True)
        self.assertEquals(len(data), 1)  # Only one type of elements
        row_class = list(data.keys())[0]
        self.assertEquals(len(data[row_class]), 10)  # Ten rows
        row_element = data[row_class][0]
        self.assertTrue(hasattr(row_element, "id"))
        self.assertTrue(hasattr(row_element, "first_name"))
        self.assertTrue(hasattr(row_element, "last_name"))
        self.assertTrue(hasattr(row_element, "email"))
        self.assertTrue(hasattr(row_element, "country"))
        self.assertTrue(hasattr(row_element, "ip_address"))
        self.assertEqual(row_element.id, "1")
        self.assertEqual(row_element.first_name, "Peter")
        self.assertEqual(row_element.last_name, "Carter")
        self.assertEqual(row_element.email, "pcarter0@jugem.jp")
        self.assertEqual(row_element.country, "China")
        self.assertEqual(row_element.ip_address, "26.177.133.38")

    def test_more_fields(self):
        filename = os.path.join(os.path.dirname(__file__), 'resources/CSV_TEST_DATA_VARARGS.csv')
        mediator = CsvMediator(first_row_is_headers=True,restkey="country")
        uri = urljoin('file:', urllib.pathname2url(filename))
        data = mediator.load(uri=uri, base_name="test", read_on_load=True)
        self.assertEquals(len(data), 1)  # Only one type of elements
        row_class = list(data.keys())[0]
        self.assertEquals(len(data[row_class]), 25)  # Ten rows
        row_element = data[row_class][0]
        self.assertTrue(hasattr(row_element, "id"))
        self.assertTrue(hasattr(row_element, "first_name"))
        self.assertTrue(hasattr(row_element, "last_name"))
        self.assertTrue(hasattr(row_element, "email"))
        self.assertTrue(hasattr(row_element, "country"))
        self.assertEqual(row_element.id, "1")
        self.assertEqual(row_element.first_name, "Robert")
        self.assertEqual(row_element.last_name, "Daniels")
        self.assertEqual(row_element.email, "rdaniels0@hibu.com")
        self.assertTrue("Russia" in row_element.country)
        self.assertTrue("Nigeria" in row_element.country)
        self.assertTrue("France" in row_element.country)

    def test_less_fields(self):
        filename = os.path.join(os.path.dirname(__file__), 'resources/CSV_TEST_DATA_EMPTY_FIELDS.csv')
        mediator = CsvMediator(first_row_is_headers=True, restval="Worcester")
        uri = urljoin('file:', urllib.pathname2url(filename))
        data = mediator.load(uri=uri, base_name="test", read_on_load=True)
        self.assertEquals(len(data), 1)  # Only one type of elements
        row_class = list(data.keys())[0]
        self.assertEquals(len(data[row_class]), 25)  # Ten rows
        row_element = data[row_class][0]
        self.assertIsInstance(row_element, presentation.Row)
        self.assertTrue(hasattr(row_element, "id"))
        self.assertTrue(hasattr(row_element, "first_name"))
        self.assertTrue(hasattr(row_element, "last_name"))
        self.assertTrue(hasattr(row_element, "email"))
        self.assertTrue(hasattr(row_element, "country"))
        self.assertTrue(hasattr(row_element, "city"))
        self.assertEqual(row_element.id, "1")
        self.assertEqual(row_element.first_name, "Chris")
        self.assertEqual(row_element.last_name, "Jordan")
        self.assertEqual(row_element.email, "cjordan0@furl.net")
        self.assertEqual(row_element.country, "Indonesia")
        self.assertEqual(row_element.city, "Worcester")
        row_element = data[row_class][1]
        self.assertEqual(row_element.id, "2")
        self.assertEqual(row_element.first_name, "Edward")
        self.assertEqual(row_element.last_name, "Williamson")
        self.assertEqual(row_element.email, "ewilliamson1@disqus.com")
        self.assertEqual(row_element.country, "Brazil")
        self.assertEqual(row_element.city, "Vila Velha")


class TestModelManager(TestCase):

    class MockMediator:
        """
        A mock mediator for testing the model manager.
        """
        def __init__(self, required, optional_boolean=True, optional_string='', **kwargs):
            super().__init__(**kwargs)
            self.required = required
            self.optional_boolean = optional_boolean
            self.optional_string = optional_string

        @classmethod
        def get_required_init_parameters(cls):
            sig = inspect.signature(cls.__init__)
            ret = set()
            for param in sig.parameters.values():
                if param.default is param.empty:
                    ret.add(param.name)
            return ret

        @classmethod
        def get_optional_init_parameters(cls):
            sig = inspect.signature(cls.__init__)
            ret = set()
            for param in sig.parameters.values():
                if param.default is not param.empty:
                    ret.add(param.name)
            return ret

        @classmethod
        def get_boolean_init_parameters(cls):
            sig = inspect.signature(cls.__init__)
            ret = set()
            for param in sig.parameters.values():
                if param.default is not param.empty and isinstance(param.default, bool):
                    ret.add(param.name)
            return ret

        @classmethod
        def get_load_parameters(cls):
            return set("load_me")

        @classmethod
        def get_store_parameters(cls):
            return set("store_me")

    def test_register_mediator(self):
        mm = presentation.ModelManager()
        mm.register_mediator("mock", self.MockMediator)
        self.assertIs(1, len(mm._mediators))
        self.assertIn("mock", mm._mediators)
        self.assertIn(self.MockMediator, mm._mediators.values())

    def test_register_duplicate_mediator(self):
        mm = presentation.ModelManager()
        mm.register_mediator("mock", self.MockMediator)
        with self.assertRaises(ModelManagerError):
            mm.register_mediator("mock", self.MockMediator)

    def test_load_model_missing_mediator(self):
        document = """
            [test1]
            uri = path/mock
            """
        mm = presentation.ModelManager()
        mm.register_mediator("mock", self.MockMediator)
        with self.assertRaises(ModelManagerError):
            mm.load_string(document)

    def test_load_model_unknown_mediator(self):
        document = """
            [test1]
            __mediator__ = other
            """
        mm = presentation.ModelManager()
        mm.register_mediator("mock", self.MockMediator)
        with self.assertRaises(ModelManagerError):
            mm.load_string(document)

    def test_load_model_min_keys(self):
        document = """
        [test1]
        __mediator__ = mock
        uri = path/mock
        required = required
        optional_boolean = 1
        optional_string = optional
        load_me = load
        store_me = store
        """
        mm = presentation.ModelManager()
        mm.register_mediator("mock", self.MockMediator)
        mm.load_string(document)
        self.assertTrue('test1' in mm.models)

    def test_load_model_all_keys(self):
        document = """
        [test1]
        __mediator__ = mock
        uri = path/mock
        aliases =
            t2
            t3
        required = mock
        optional = True
        quiz =
            1
            0
            yes
            no
            true
            false
            on
            off
        """
        mm = presentation.ModelManager()
        mm.load_string(document)
        self.assertTrue('test1' in mm.models)

    def test_load_missing_field(self):
        document = """
        [test1]
        __mediator__ = mock
        uri = path/mock
        """
        mm = presentation.ModelManager()
        with self.assertRaises(ModelManagerError):
            mm.load_string(document)

    def test_load_multiple_models(self):
        document = """
        [test1]
        __mediator__ = mock
        uri = path/mock
        required = mock
        [test2]
        __mediator__ = _mock
        uri = path/mock
        required = mock
        [test3]
        __mediator__ = _mock
        uri = path/mock
        required = mock
        """
        mm = presentation.ModelManager()
        mm.load_string(document)
        self.assertEqual(len(mm.models), 3)
        self.assertTrue('test1' in mm.models)
        self.assertTrue('test2' in mm.models)
        self.assertTrue('test3' in mm.models)

    def test_load_multiple_models_complete(self):
        document = """
        [test1]
        __mediator__ = mock
        uri = path/mock
        required = mock
        [test2]
        __mediator__ = mock
        uri = path/mock
        [test3]
        __mediator__ = mock
        path = path/mock
        required = mock
        """
        mm = presentation.ModelManager()
        with self.assertRaises(ModelManagerError):
            mm.load_string(document)

    def test_load_multiple_models_partial(self):
        document = """
        [test1]
        __mediator__ = mock
        uri = path/mock
        required = mock
        [test2]
        __mediator__ = mock
        path = path/mock
        [test3]
        __mediator__ = mock
        uri = path/mock
        required = mock
        """
        mm = presentation.ModelManager()
        mm.load_string(document, True)
        self.assertTrue('test1' in mm.models)
        self.assertFalse('test2' in mm.models)
        self.assertTrue('test3' in mm.models)



