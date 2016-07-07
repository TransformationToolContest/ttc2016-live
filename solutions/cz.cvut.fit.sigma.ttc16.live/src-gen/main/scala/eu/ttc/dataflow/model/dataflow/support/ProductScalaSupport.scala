package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Product;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait ProductScalaSupport extends EMFScalaSupport {
  type Product = eu.ttc.dataflow.model.dataflow.Product
  
  protected implicit val _productProxyBuilder = new EMFProxyBuilder[Product](Dataflow._dataflowBuilder)
  
  object Product {
    def apply(name: String = null, target: Element = null): Product = {
      val _instance = Dataflow._dataflowBuilder.create[Product]
      
      if (name != null) _instance.setName(name)
      if (target != null) _instance.setTarget(target)
      
      _instance
    }
  }}
object ProductScalaSupport extends ProductScalaSupport
