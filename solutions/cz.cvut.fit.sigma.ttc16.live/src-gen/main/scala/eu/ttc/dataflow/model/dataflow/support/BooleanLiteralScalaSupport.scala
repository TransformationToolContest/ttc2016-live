package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.BooleanLiteral;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait BooleanLiteralScalaSupport extends EMFScalaSupport {
  type BooleanLiteral = eu.ttc.dataflow.model.dataflow.BooleanLiteral
  
  protected implicit val _booleanliteralProxyBuilder = new EMFProxyBuilder[BooleanLiteral](Dataflow._dataflowBuilder)
  
  object BooleanLiteral {
    def apply(value: Boolean = false): BooleanLiteral = {
      val _instance = Dataflow._dataflowBuilder.create[BooleanLiteral]
      
      if (value != false) _instance.setValue(value)
      
      _instance
    }
  }}
object BooleanLiteralScalaSupport extends BooleanLiteralScalaSupport
