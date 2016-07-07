package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Model;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

trait ModelScalaSupport extends EMFScalaSupport {
  type Model = eu.ttc.dataflow.model.dataflow.Model
  
  protected implicit val _modelProxyBuilder = new EMFProxyBuilder[Model](Dataflow._dataflowBuilder)
  
  object Model {
    def apply(elements: EList[Element] = null): Model = {
      val _instance = Dataflow._dataflowBuilder.create[Model]
      
      if (elements != null) _instance.getElements.addAll(elements)
      
      _instance
    }
  }}
object ModelScalaSupport extends ModelScalaSupport
