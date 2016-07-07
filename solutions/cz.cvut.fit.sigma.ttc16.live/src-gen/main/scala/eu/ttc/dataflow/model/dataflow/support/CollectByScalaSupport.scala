package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.CollectBy;
import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Expression;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait CollectByScalaSupport extends EMFScalaSupport {
  type CollectBy = eu.ttc.dataflow.model.dataflow.CollectBy
  
  protected implicit val _collectbyProxyBuilder = new EMFProxyBuilder[CollectBy](Dataflow._dataflowBuilder)
  
  object CollectBy {
    def apply(name: String = null, target: Element = null, collectBy: Expression = null): CollectBy = {
      val _instance = Dataflow._dataflowBuilder.create[CollectBy]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (collectBy != null) _instance.setCollectBy(collectBy)
      
      _instance
    }
  }}
object CollectByScalaSupport extends CollectByScalaSupport
