package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.AllInstances;
import eu.ttc.dataflow.model.dataflow.Element;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait AllInstancesScalaSupport extends EMFScalaSupport {
  type AllInstances = eu.ttc.dataflow.model.dataflow.AllInstances
  
  protected implicit val _allinstancesProxyBuilder = new EMFProxyBuilder[AllInstances](Dataflow._dataflowBuilder)
  
  object AllInstances {
    def apply(name: String = null, target: Element = null, field: String = null, model: String = null, packageName: String = null, typeName: String = null): AllInstances = {
      val _instance = Dataflow._dataflowBuilder.create[AllInstances]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (field != null) _instance.setField(field)
      if (model != null) _instance.setModel(model)
      if (packageName != null) _instance.setPackageName(packageName)
      if (typeName != null) _instance.setTypeName(typeName)
      
      _instance
    }
  }}
object AllInstancesScalaSupport extends AllInstancesScalaSupport
