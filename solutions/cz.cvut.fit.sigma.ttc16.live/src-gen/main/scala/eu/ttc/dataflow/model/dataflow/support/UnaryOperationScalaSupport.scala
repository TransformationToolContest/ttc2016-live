package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Expression;
import eu.ttc.dataflow.model.dataflow.UnaryOperation;
import eu.ttc.dataflow.model.dataflow.UnaryOperator;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait UnaryOperationScalaSupport extends EMFScalaSupport {
  type UnaryOperation = eu.ttc.dataflow.model.dataflow.UnaryOperation
  
  protected implicit val _unaryoperationProxyBuilder = new EMFProxyBuilder[UnaryOperation](Dataflow._dataflowBuilder)
  
  object UnaryOperation {
    def apply(operator: UnaryOperator = UnaryOperator.NOT, expression: Expression = null): UnaryOperation = {
      val _instance = Dataflow._dataflowBuilder.create[UnaryOperation]
      
      if (operator != UnaryOperator.NOT) _instance.setOperator(operator)
      if (expression != null) _instance.setExpression(expression)
      
      _instance
    }
  }}
object UnaryOperationScalaSupport extends UnaryOperationScalaSupport
