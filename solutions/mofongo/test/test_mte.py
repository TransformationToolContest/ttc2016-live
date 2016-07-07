import os
import re

from unittest import TestCase
from mofongo import presentation
from mofongo import mte

__author__ = 'Horacio Hoyos'
__copyright__ = 'Copyright , Nagasu Technologies'


#TODO this could be a JSON/INI/YAML string like?
class_keys = {
    'users': {
        'UsersRow': ['first_name', 'last_name']
    },
    'countries': {
        'CountriesRow': ['country']
    }
}


class SimpleDomains(mte.Rule):
    top = True
    fn = mte.SharedVar('fn')
    ln = mte.SharedVar('ln')
    c = mte.SharedVar('c')
    domain = [
        mte.Domain('users',
                   mte.OTemplate(
                       'ur',
                       'UsersRow',
                       first_name=fn,
                       last_name=ln,
                       country=c)
                   ),
        mte.EnforceDomain('countries',
                          mte.OTemplate(
                              'cr',
                              'CountriesRow',
                              country=c,
                              users=mte.CTemplate(
                                  'users',
                                  'set',
                                  mte.SharedVar('c_usr')
                              )
                          )
                          )
    ]

    def given(self):
        pass

    def implies(self):
        if self.ur.gender == 'Female':
            prefix = "Mrs."
        else:
            prefix = "Mr."
        c_usr = prefix + self.fn + " " + self.ln


class TestCsvPresentation(TestCase):

    def test_pattern(self):
        import time
        start_time = time.time()

        document = """
        [users]
        __mediator__ = csv
        path = resources/USER_COUNTRY.csv
        store_on_disposal = 0
        [countries]
        __mediator__ = csv
        path = resources/COUNTRIES.csv
        read_on_load = no
        """
        mm = presentation.ModelManager()
        mm.load_string(document)
        engine = mte.Engine(mm, [SimpleDomains], 'countries', class_keys)
        engine.execute()
        mm.dispose()
        print("--- %s seconds ---" % (time.time() - start_time))


