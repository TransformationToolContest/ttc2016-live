package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.ConditionalExpression;
import eu.ttc.dataflow.model.dataflow.Expression;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait ConditionalExpressionScalaSupport extends EMFScalaSupport {
  type ConditionalExpression = eu.ttc.dataflow.model.dataflow.ConditionalExpression
  
  protected implicit val _conditionalexpressionProxyBuilder = new EMFProxyBuilder[ConditionalExpression](Dataflow._dataflowBuilder)
  
  object ConditionalExpression {
    def apply(conditionExpression: Expression = null, thenExpression: Expression = null, elseExpression: Expression = null): ConditionalExpression = {
      val _instance = Dataflow._dataflowBuilder.create[ConditionalExpression]
      
      if (conditionExpression != null) _instance.setConditionExpression(conditionExpression)
      if (thenExpression != null) _instance.setThenExpression(thenExpression)
      if (elseExpression != null) _instance.setElseExpression(elseExpression)
      
      _instance
    }
  }}
object ConditionalExpressionScalaSupport extends ConditionalExpressionScalaSupport
