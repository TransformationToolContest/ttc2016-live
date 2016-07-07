package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Expression;
import eu.ttc.dataflow.model.dataflow.FeatureCall;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

trait FeatureCallScalaSupport extends EMFScalaSupport {
  type FeatureCall = eu.ttc.dataflow.model.dataflow.FeatureCall
  
  protected implicit val _featurecallProxyBuilder = new EMFProxyBuilder[FeatureCall](Dataflow._dataflowBuilder)
  
  object FeatureCall {
    def apply(targetExpression: Expression = null, feature: String = null, parameters: EList[Expression] = null): FeatureCall = {
      val _instance = Dataflow._dataflowBuilder.create[FeatureCall]
      
      if (targetExpression != null) _instance.setTargetExpression(targetExpression)
      if (feature != null) _instance.setFeature(feature)
      if (parameters != null) _instance.getParameters.addAll(parameters)
      
      _instance
    }
  }}
object FeatureCallScalaSupport extends FeatureCallScalaSupport
