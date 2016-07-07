package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Expression;
import eu.ttc.dataflow.model.dataflow.Filter;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait FilterScalaSupport extends EMFScalaSupport {
  type Filter = eu.ttc.dataflow.model.dataflow.Filter
  
  protected implicit val _filterProxyBuilder = new EMFProxyBuilder[Filter](Dataflow._dataflowBuilder)
  
  object Filter {
    def apply(name: String = null, target: Element = null, filterBy: Expression = null, rejectTarget: Element = null): Filter = {
      val _instance = Dataflow._dataflowBuilder.create[Filter]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (filterBy != null) _instance.setFilterBy(filterBy)
      if (rejectTarget != null) _instance.setRejectTarget(rejectTarget)
      
      _instance
    }
  }}
object FilterScalaSupport extends FilterScalaSupport
