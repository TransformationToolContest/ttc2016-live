package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Expression;
import eu.ttc.dataflow.model.dataflow.NewInstance;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait NewInstanceScalaSupport extends EMFScalaSupport {
  type NewInstance = eu.ttc.dataflow.model.dataflow.NewInstance
  
  protected implicit val _newinstanceProxyBuilder = new EMFProxyBuilder[NewInstance](Dataflow._dataflowBuilder)
  
  object NewInstance {
    def apply(name: String = null, target: Element = null, instanceField: String = null, key: Expression = null, model: String = null, packageName: String = null, typeName: String = null): NewInstance = {
      val _instance = Dataflow._dataflowBuilder.create[NewInstance]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (instanceField != null) _instance.setInstanceField(instanceField)
      if (key != null) _instance.setKey(key)
      if (model != null) _instance.setModel(model)
      if (packageName != null) _instance.setPackageName(packageName)
      if (typeName != null) _instance.setTypeName(typeName)
      
      _instance
    }
  }}
object NewInstanceScalaSupport extends NewInstanceScalaSupport
