import io
import sys

from antlr4 import *
from grammars.MQVTrLexer import MQVTrLexer
from grammars.MQVTrListener import MQVTrListener
from grammars.MQVTrParser import MQVTrParser


class KeyPrinter(MQVTrListener):

    # Enter a parse tree produced by PQVTrParser#topLevelCS.
    def enterTopLevelCS(self, ctx:MQVTrParser.TopLevelCSContext):
        print('Enter TopLevel')

    # Exit a parse tree produced by PQVTrParser#topLevelCS.
    def exitTopLevelCS(self, ctx:MQVTrParser.TopLevelCSContext):
        print('Exit TopLevel')

    def enterUnitCS(self, ctx:MQVTrParser.UnitCSContext):
        print('Enter Unit')

    def exitUnitCS(self, ctx:MQVTrParser.UnitCSContext):
        print("Oh, a Unit! ", ctx)


def main(argv):
    #input = FileStream("resources/mvt/hstm2stm.mvt")
    input = FileStream("resources/mvt/query.mqvtr")
    lexer = MQVTrLexer(input)
    stream = CommonTokenStream(lexer)
    parser = MQVTrParser(stream)
    parser.setTrace(True)
    tree = parser.queryCS()
    printer = KeyPrinter()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main(sys.argv)
