package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.FieldReference;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait FieldReferenceScalaSupport extends EMFScalaSupport {
  type FieldReference = eu.ttc.dataflow.model.dataflow.FieldReference
  
  protected implicit val _fieldreferenceProxyBuilder = new EMFProxyBuilder[FieldReference](Dataflow._dataflowBuilder)
  
  object FieldReference {
    def apply(field: String = null): FieldReference = {
      val _instance = Dataflow._dataflowBuilder.create[FieldReference]
      
      if (field != null) _instance.setField(field)
      
      _instance
    }
  }}
object FieldReferenceScalaSupport extends FieldReferenceScalaSupport
