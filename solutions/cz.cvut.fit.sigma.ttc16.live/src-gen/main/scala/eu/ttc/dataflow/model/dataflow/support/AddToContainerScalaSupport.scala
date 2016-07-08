package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.AddToContainer;
import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Expression;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait AddToContainerScalaSupport extends EMFScalaSupport {
  type AddToContainer = eu.ttc.dataflow.model.dataflow.AddToContainer
  
  protected implicit val _addtocontainerProxyBuilder = new EMFProxyBuilder[AddToContainer](Dataflow._dataflowBuilder)
  
  object AddToContainer {
    def apply(name: String = null, target: Element = null, listField: String = null, value: Expression = null, position: Expression = null): AddToContainer = {
      val _instance = Dataflow._dataflowBuilder.create[AddToContainer]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (listField != null) _instance.setListField(listField)
      if (value != null) _instance.setValue(value)
      if (position != null) _instance.setPosition(position)
      
      _instance
    }
  }}
object AddToContainerScalaSupport extends AddToContainerScalaSupport
