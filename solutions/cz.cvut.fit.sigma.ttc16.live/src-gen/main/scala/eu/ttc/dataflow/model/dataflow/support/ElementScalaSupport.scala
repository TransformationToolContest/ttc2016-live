package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Element;

import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait ElementScalaSupport extends EMFScalaSupport {
  type Element = eu.ttc.dataflow.model.dataflow.Element
  
  object Element {
  }}
object ElementScalaSupport extends ElementScalaSupport
