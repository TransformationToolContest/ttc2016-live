package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.ForEach;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait ForEachScalaSupport extends EMFScalaSupport {
  type ForEach = eu.ttc.dataflow.model.dataflow.ForEach
  
  protected implicit val _foreachProxyBuilder = new EMFProxyBuilder[ForEach](Dataflow._dataflowBuilder)
  
  object ForEach {
    def apply(name: String = null, target: Element = null, listField: String = null, itemField: String = null, positionField: String = null): ForEach = {
      val _instance = Dataflow._dataflowBuilder.create[ForEach]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (listField != null) _instance.setListField(listField)
      if (itemField != null) _instance.setItemField(itemField)
      if (positionField != null) _instance.setPositionField(positionField)
      
      _instance
    }
  }}
object ForEachScalaSupport extends ForEachScalaSupport
