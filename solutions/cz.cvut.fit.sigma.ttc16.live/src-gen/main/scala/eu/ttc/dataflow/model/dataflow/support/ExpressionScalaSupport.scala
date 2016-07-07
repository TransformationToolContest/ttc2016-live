package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.Expression;

import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait ExpressionScalaSupport extends EMFScalaSupport {
  type Expression = eu.ttc.dataflow.model.dataflow.Expression
  
  object Expression {
  }}
object ExpressionScalaSupport extends ExpressionScalaSupport
