package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.IntegerLiteral;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait IntegerLiteralScalaSupport extends EMFScalaSupport {
  type IntegerLiteral = eu.ttc.dataflow.model.dataflow.IntegerLiteral
  
  protected implicit val _integerliteralProxyBuilder = new EMFProxyBuilder[IntegerLiteral](Dataflow._dataflowBuilder)
  
  object IntegerLiteral {
    def apply(value: Int = 0): IntegerLiteral = {
      val _instance = Dataflow._dataflowBuilder.create[IntegerLiteral]
      
      if (value != 0) _instance.setValue(value)
      
      _instance
    }
  }}
object IntegerLiteralScalaSupport extends IntegerLiteralScalaSupport
