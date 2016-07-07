package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.RealLiteral;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait RealLiteralScalaSupport extends EMFScalaSupport {
  type RealLiteral = eu.ttc.dataflow.model.dataflow.RealLiteral
  
  protected implicit val _realliteralProxyBuilder = new EMFProxyBuilder[RealLiteral](Dataflow._dataflowBuilder)
  
  object RealLiteral {
    def apply(value: Double = 0.0): RealLiteral = {
      val _instance = Dataflow._dataflowBuilder.create[RealLiteral]
      
      if (value != 0.0) _instance.setValue(value)
      
      _instance
    }
  }}
object RealLiteralScalaSupport extends RealLiteralScalaSupport
