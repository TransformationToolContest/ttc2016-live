__author__ = 'Horacio Hoyos'
__copyright__ = 'Copyright , Nagasu Technologies'


class MofongoError(Exception):
    """
    Raised when a model is asked to handle a type that is not present in the known types of its resources layer.
    """
    pass


class ModelManagerError(Exception):
    """
    Raised when the model manager is not happy.
    """
    pass


class TransformationEngineError(Exception):
    """
    Raised when the mte is not happy.
    """
    pass
