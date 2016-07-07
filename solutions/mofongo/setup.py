import io
#import codecs
import os
import sys
from setuptools import setup, find_packages
from setuptools.command.test import test as TestCommand

import mofongo

here = os.path.abspath(os.path.dirname(__file__))

def read(*filenames, **kwargs):
    encoding = kwargs.get('encoding', 'utf-8')
    sep = kwargs.get('sep', '\n')
    buf = []
    for filename in filenames:
        with io.open(filename, encoding=encoding) as f:
            buf.append(f.read())
    return sep.join(buf)

long_description = read('README.rst')


class PyTest(TestCommand):
    user_options = [('pytest-args=', 'a', "Arguments to pass to py.test")]

    def initialize_options(self):
        TestCommand.initialize_options(self)
        self.pytest_args = ["--cov-config", "test/.coveragerc", "--cov-report",  "html", "--cov", "mofongo/", "test/"]

    def finalize_options(self):
        TestCommand.finalize_options(self)
        self.test_args = []
        self.test_suite = True

    def run_tests(self):
        #import here, cause outside the eggs aren't loaded
        import pytest
        errno = pytest.main(self.pytest_args)
        sys.exit(errno)

setup(
    name='mofongo',
    version=mofongo.__version__,
    packages=find_packages(),
    include_package_data=True,
    # Metadata
    author='Horacio Hoyos Rodriguez',
    author_email='arcanefoam@gmail.com',
    description='A framework for building task-specific languages for model management tasks.',
    license='Apache Software License',
    url='http://bitbucket.org/arcanefoam/mofongo',
    long_description=long_description,
    install_requires=['hashids'],
    platforms='any',
    classifiers=[
        'Programming Language :: Python',
        'Development Status :: 0.1 - Alpha',
        'Natural Language :: English',
        'Environment :: Model Driven Engineering',
        'Intended Audience :: Developers',
        'License :: OSI Approved :: Apache Software License',
        'Operating System :: OS Independent',
        'Topic :: Software Development :: Libraries :: Python Modules',
        'Topic :: Software Development :: Libraries :: Application Frameworks',
        'Topic :: MDA :: OMG/MOF :: Facility and Object Lifecycle',
        ],
    # py.test
    cmdclass={'test': PyTest},
    extras_require={
        'testing': ['pytest-cov', 'pytest'],
        },
    test_suite='test',
)

