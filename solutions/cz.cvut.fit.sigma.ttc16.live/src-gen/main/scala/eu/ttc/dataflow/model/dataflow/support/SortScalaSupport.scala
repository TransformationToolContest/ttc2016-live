package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Expression;
import eu.ttc.dataflow.model.dataflow.Sort;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait SortScalaSupport extends EMFScalaSupport {
  type Sort = eu.ttc.dataflow.model.dataflow.Sort
  
  protected implicit val _sortProxyBuilder = new EMFProxyBuilder[Sort](Dataflow._dataflowBuilder)
  
  object Sort {
    def apply(name: String = null, target: Element = null, sortBy: Expression = null): Sort = {
      val _instance = Dataflow._dataflowBuilder.create[Sort]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (sortBy != null) _instance.setSortBy(sortBy)
      
      _instance
    }
  }}
object SortScalaSupport extends SortScalaSupport
