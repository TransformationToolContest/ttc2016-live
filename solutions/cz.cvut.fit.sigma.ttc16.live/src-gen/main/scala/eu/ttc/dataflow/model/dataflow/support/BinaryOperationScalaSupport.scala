package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.BinaryOperation;
import eu.ttc.dataflow.model.dataflow.BinaryOperator;
import eu.ttc.dataflow.model.dataflow.Expression;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait BinaryOperationScalaSupport extends EMFScalaSupport {
  type BinaryOperation = eu.ttc.dataflow.model.dataflow.BinaryOperation
  
  protected implicit val _binaryoperationProxyBuilder = new EMFProxyBuilder[BinaryOperation](Dataflow._dataflowBuilder)
  
  object BinaryOperation {
    def apply(operator: BinaryOperator = BinaryOperator.EQ, leftExpression: Expression = null, rightExpression: Expression = null): BinaryOperation = {
      val _instance = Dataflow._dataflowBuilder.create[BinaryOperation]
      
      if (operator != BinaryOperator.EQ) _instance.setOperator(operator)
      if (leftExpression != null) _instance.setLeftExpression(leftExpression)
      if (rightExpression != null) _instance.setRightExpression(rightExpression)
      
      _instance
    }
  }}
object BinaryOperationScalaSupport extends BinaryOperationScalaSupport
