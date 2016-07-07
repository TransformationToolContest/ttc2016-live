package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.StringLiteral;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait StringLiteralScalaSupport extends EMFScalaSupport {
  type StringLiteral = eu.ttc.dataflow.model.dataflow.StringLiteral
  
  protected implicit val _stringliteralProxyBuilder = new EMFProxyBuilder[StringLiteral](Dataflow._dataflowBuilder)
  
  object StringLiteral {
    def apply(value: String = null): StringLiteral = {
      val _instance = Dataflow._dataflowBuilder.create[StringLiteral]
      
      if (value != null) _instance.setValue(value)
      
      _instance
    }
  }}
object StringLiteralScalaSupport extends StringLiteralScalaSupport
