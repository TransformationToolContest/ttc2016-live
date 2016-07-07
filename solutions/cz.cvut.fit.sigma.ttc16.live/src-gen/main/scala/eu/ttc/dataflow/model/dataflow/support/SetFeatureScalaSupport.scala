package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Expression;
import eu.ttc.dataflow.model.dataflow.SetFeature;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait SetFeatureScalaSupport extends EMFScalaSupport {
  type SetFeature = eu.ttc.dataflow.model.dataflow.SetFeature
  
  protected implicit val _setfeatureProxyBuilder = new EMFProxyBuilder[SetFeature](Dataflow._dataflowBuilder)
  
  object SetFeature {
    def apply(name: String = null, target: Element = null, objectField: String = null, value: Expression = null, feature: String = null): SetFeature = {
      val _instance = Dataflow._dataflowBuilder.create[SetFeature]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (objectField != null) _instance.setObjectField(objectField)
      if (value != null) _instance.setValue(value)
      if (feature != null) _instance.setFeature(feature)
      
      _instance
    }
  }}
object SetFeatureScalaSupport extends SetFeatureScalaSupport
