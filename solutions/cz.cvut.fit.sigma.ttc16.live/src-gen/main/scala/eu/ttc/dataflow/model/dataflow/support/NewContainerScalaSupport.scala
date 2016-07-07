package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.ContainerType;
import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.NewContainer;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait NewContainerScalaSupport extends EMFScalaSupport {
  type NewContainer = eu.ttc.dataflow.model.dataflow.NewContainer
  
  protected implicit val _newcontainerProxyBuilder = new EMFProxyBuilder[NewContainer](Dataflow._dataflowBuilder)
  
  object NewContainer {
    def apply(name: String = null, target: Element = null, listField: String = null, containerType: ContainerType = ContainerType.LIST): NewContainer = {
      val _instance = Dataflow._dataflowBuilder.create[NewContainer]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (listField != null) _instance.setListField(listField)
      if (containerType != ContainerType.LIST) _instance.setContainerType(containerType)
      
      _instance
    }
  }}
object NewContainerScalaSupport extends NewContainerScalaSupport
