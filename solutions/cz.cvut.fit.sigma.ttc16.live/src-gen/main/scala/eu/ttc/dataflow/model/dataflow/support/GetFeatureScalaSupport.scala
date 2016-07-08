package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.GetFeature;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait GetFeatureScalaSupport extends EMFScalaSupport {
  type GetFeature = eu.ttc.dataflow.model.dataflow.GetFeature
  
  protected implicit val _getfeatureProxyBuilder = new EMFProxyBuilder[GetFeature](Dataflow._dataflowBuilder)
  
  object GetFeature {
    def apply(name: String = null, target: Element = null, objectField: String = null, valueField: String = null, feature: String = null): GetFeature = {
      val _instance = Dataflow._dataflowBuilder.create[GetFeature]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (objectField != null) _instance.setObjectField(objectField)
      if (valueField != null) _instance.setValueField(valueField)
      if (feature != null) _instance.setFeature(feature)
      
      _instance
    }
  }}
object GetFeatureScalaSupport extends GetFeatureScalaSupport
