import argparse
import os
import re
import sys
import time
from urllib.parse import urljoin
import urllib.request as urllib

from antlr4 import *
from lxml import etree

from mofongo.presentation import ModelManager
from mofongo.presentation import MofMediator
from mofongo.presentation import MofongoModel
from mofongo.grammars.FlowM2MLexer import FlowM2MLexer
from mofongo.grammars.FlowM2MParser import FlowM2MParser
from mofongo.grammars.FlowM2MExecution import FlowM2MExecution

ecore_data_types = {'EBoolean', 'EByte', 'EChar', 'EDouble', 'EFloat', 'EInt', 'ELong', 'EShort', 'EByteArray', 'EBooleanObject', 'EByteObject', 'ECharacterObject', 'EDoubleObject', 'EFloatObject', 'EIntegerObject', 'ELongObject', 'EShortObject', 'EBigDecimal', 'EBigInteger', 'EDate', 'EJavaObject', 'EJavaClass', 'EString'}


class MofPackage(etree.ElementBase):

    @property
    def name(self):
        return self.get('name')

    @property
    def uri(self):
        return self.get('nsURI')

    @property
    def types(self):
        return list(self)

    @property
    def index(self):
        parent = self.getparent()
        if parent:
            return parent.index(self)
        else:
            return 0

    def find_type(self, href):
        type_reference_regex = re.compile(r'#/(\d?)/(\w*)')
        info = type_reference_regex.search(href)
        p_id, type_name = info.groups()
        if not p_id or (p_id == self.index):
            if type_name in ecore_data_types:
                return type_name
            else:
                t = [t for t in self.types if t.name == type_name][0]
                return t

    def find_sf(self, href):
        type_reference_regex = re.compile(r'#/(\d?)/(\w*)/(\w*)')
        info = type_reference_regex.search(href)
        p_id, type_name, sf_name = info.groups()
        if not p_id or (p_id == self.index):
            if type_name in ecore_data_types:
                return type_name
            else:
                t = [t for t in self.types if t.name == type_name][0]
                a = [a for a in t.structural_features if a.name == sf_name][0]
                return a


class MofClass(etree.ElementBase):

    @property
    def name(self):
        return self.get('name')

    @property
    def structural_features(self):
        my_features = list(self)
        inherited = []
        for sc in self.super_class:
            for sf in sc.structural_features:
                inherited.append(sf)
        my_features.extend(inherited)
        return my_features

    @property
    def super_class(self):
        sc_names = self.get('eSuperTypes')
        result = []
        if sc_names:
            p = self.getparent()
            if p is not None:
                sc_list = sc_names.split(" ")
                for sc in sc_list:
                    t = p.find_type(sc)
                    result.append(t)
        return result

    @property
    def qualified_name(self):
        package = self.getparent()
        assert isinstance(package, MofPackage)
        return '{}::{}'.format(package.name, self.get('name'))

    @property
    def eContainer(self):
        return self.getparent()


class MofStructuralFeature(etree.ElementBase):

    @property
    def name(self):
        return self.get('name')

    @property
    def type(self):
        return self.get('eType')

    @property
    def eContainer(self):
        return self.getparent()


class MofMetamodelLookup(etree.CustomElementClassLookup):

    def lookup(self, node_type, document, namespace, name):
        if "EPackage" in name:
            return MofPackage
        elif "eClassifiers" in name:
            return MofClass
        elif "eStructuralFeatures" in name:
            return MofStructuralFeature
        else:
            return None


def create_class(name, super, kwargs):
    o = type(name, super, kwargs)
    return o


def create_init_method(cls, *args):
    def init(self, args):
        for name, value in args.items():
            setattr(self, name, value)
        super(cls, self).__init__()

    init.__name__ = '__init__'
    setattr(cls, init.__name__, init)


def load_metamodel(path):
    with open(path) as mm_file:
        parser = etree.XMLParser()
        parser.set_element_class_lookup(MofMetamodelLookup())
        ecore_tree = etree.parse(mm_file, parser)
        root = ecore_tree.getroot()
        p_counter = 0
        packages = dict()
        if "EPackage" in root.tag:
            packages[p_counter] = root
        else:   # xmi should be the root
            assert 'XMI' in root.tag
            for p in root:
                assert isinstance(p, MofPackage)
                packages[p_counter] = p
                p_counter += p_counter

        result = dict()
        for _, p in packages.items():
            result[p.uri] = p
        return result


def execute(tranformation_path, input_name, input_model_path, input_mm_path, output_name, output_model_path,
            output_mm_path):

    transformation_stream = FileStream(tranformation_path)
    lexer = FlowM2MLexer(transformation_stream)
    stream = CommonTokenStream(lexer)
    flow_parser = FlowM2MParser(stream)
    tree = flow_parser.flow()
    mm = ModelManager()
    input_metamodels = load_metamodel(input_mm_path)
    mm.register_packages(input_metamodels)
    output_metamodels = load_metamodel(output_mm_path)
    mm.register_packages(output_metamodels)

    input_mediator = MofMediator(mm)
    uri = urljoin('file:', urllib.pathname2url(input_model_path))
    input_model = MofongoModel(input_name, uri, store_on_disposal=False)
    input_model.load(input_mediator)

    output_mediator = MofMediator(mm)
    uri = urljoin('file:', urllib.pathname2url(output_model_path))
    output_model = MofongoModel(output_name, uri, read_on_load=False)
    output_model.load(output_mediator)
    mm.add_model(input_name, input_model, input_metamodels)
    mm.add_model(output_name, output_model, output_metamodels)
    execute_start = time.time()
    eval = FlowM2MExecution(mm)
    threads = eval.visit(tree)
    for q in eval.elementQueues.values():
        q.join()
    for q in eval.elementQueues.values():
        q.put(None)
    for t in threads:
        t.join()
    execute_end = time.time()
    # Safe the model
    rel = os.path.relpath(output_mm_path, output_model_path)
    print(rel)
    output_model.store(output_mediator, relative_location=rel)
    return execute_end - execute_start

def main():
    parser = argparse.ArgumentParser(description='Execute FlowM2M.')
    parser.add_argument('input_transformation',
                        help='The path to the FlowM2M transformation (*/*.dataflow)')
    parser.add_argument('input_model_name',
                        help='The name of the input model')
    parser.add_argument('input_model',
                        help='The path to the input model (*/*.model)')
    parser.add_argument('input_metamodel',
                        help='The path to the input meta model (*/*.ecore)')
    parser.add_argument('output_model_name',
                        help='The name of the output model')
    parser.add_argument('output_model',
                        help='The path to the output model (*/*.model)')
    parser.add_argument('output_metamodel',
                        help='The path to the output meta model (*/*.ecore)')

    args = parser.parse_args()
    start_time = time.time()
    execution_time = execute(args.input_transformation, args.input_model_name, args.input_model, args.input_metamodel,
                             args.output_model_name, args.output_model, args.output_metamodel)
    print("--- Conmplete time %s seconds ---" % (time.time() - start_time))
    print("--- Execution time %s seconds ---" % execution_time)

if __name__ == '__main__':
    main()

