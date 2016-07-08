package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Evaluate;
import eu.ttc.dataflow.model.dataflow.Expression;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait EvaluateScalaSupport extends EMFScalaSupport {
  type Evaluate = eu.ttc.dataflow.model.dataflow.Evaluate
  
  protected implicit val _evaluateProxyBuilder = new EMFProxyBuilder[Evaluate](Dataflow._dataflowBuilder)
  
  object Evaluate {
    def apply(name: String = null, target: Element = null, field: String = null, expression: Expression = null): Evaluate = {
      val _instance = Dataflow._dataflowBuilder.create[Evaluate]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (field != null) _instance.setField(field)
      if (expression != null) _instance.setExpression(expression)
      
      _instance
    }
  }}
object EvaluateScalaSupport extends EvaluateScalaSupport
