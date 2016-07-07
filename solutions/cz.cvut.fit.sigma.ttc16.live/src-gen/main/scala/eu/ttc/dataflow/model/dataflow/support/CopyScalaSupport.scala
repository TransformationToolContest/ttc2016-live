package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Copy;
import eu.ttc.dataflow.model.dataflow.Element;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait CopyScalaSupport extends EMFScalaSupport {
  type Copy = eu.ttc.dataflow.model.dataflow.Copy
  
  protected implicit val _copyProxyBuilder = new EMFProxyBuilder[Copy](Dataflow._dataflowBuilder)
  
  object Copy {
    def apply(name: String = null, target: Element = null, copyTarget: Element = null): Copy = {
      val _instance = Dataflow._dataflowBuilder.create[Copy]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      if (copyTarget != null) _instance.setCopyTarget(copyTarget)
      
      _instance
    }
  }}
object CopyScalaSupport extends CopyScalaSupport
