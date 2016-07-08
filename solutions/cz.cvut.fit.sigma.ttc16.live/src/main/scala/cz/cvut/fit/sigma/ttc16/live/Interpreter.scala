package cz.cvut.fit.sigma.ttc16.live

import scala.Stream
import scala.annotation.tailrec
import scala.collection.mutable.Buffer
import scala.reflect.ClassTag

import eu.ttc.dataflow.model.dataflow.BinaryOperator
import eu.ttc.dataflow.model.dataflow.UnaryOperator
import eu.ttc.dataflow.model.dataflow.support.Dataflow
import eu.ttc.dataflow.model.dataflow.support.Dataflow._dataflow._
import fr.unice.i3s.sigma.emf.support.ecore.{ EcorePackageScalaSupport => Ecore }
import fr.unice.i3s.sigma.emf.support.ecore.EcorePackageScalaSupport._ecore._

class Interpreter(
    models: Map[String, Buffer[EObject]], 
    metamodels: Map[String, Seq[EPackage]], 
    dataflow: Model) extends Dataflow with Ecore {

  type Row = Map[String, Any]
  
  // mutable execution state
  private val finished = Buffer[Element]()
  private val createdInstances = collection.mutable.Map[Any, EObject]()
  
  def run(): Unit = unfinished foreach executeFlow
    
  private def executeFlow(elem: Element) {
    execute(elem, Map[String, Any]())
  }
  
  private def execute(elem: Option[Element], row: Row): Unit = elem foreach (execute(_, row))

  private def execute(elem: Element, row: Row): Unit = {
     finished += elem
     elem match {
       case op : AllInstances =>
         val all = models(op.model.get).flatMap(_.allKindOf(op.typeName))
         all foreach (x => execute(op.target, row.updated(op.field, x))) 
       case op : Evaluate =>
         execute(op.target, row.updated(op.field, evaluate(op.expression, row)))
       case op : Filter => 
         evaluate(op.filterBy, row) match {
           case Bool(true) => execute(op.target, row) 
           case Bool(false) => execute(op.rejectTarget, row)
           case x => sys.error(s"$x is not a boolean")
         }
       case op : NewInstance =>
         val key = evaluate(op.key, row)
         val cls = 
           metamodels(op.model.get)
             .filter(x => op.packageName.map(_ == x.name).getOrElse(true))
             .flatMap(_.allKindOf[EClass])
             .filter(_.name == op.typeName)
             .headOption
         cls match {
           case Some(c) =>
             val hash = (op.model, op.packageName, op.typeName, key)
             val instance = createdInstances.getOrElseUpdate(hash, {
               val i = c.newInstance
               models(op.model.get) += i
               i
             })
             val xx = row.updated(op.instanceField, instance)
             execute(op.target, xx)
           case None => sys.error(s"Unknown class in $op")
         }
       case op : SetFeature =>
         val value = evaluate(op.value.get, row)
         row(op.objectField) match {
           case x : EObject => x.eSet(x.eClass.structuralFeature(op.feature), value)
           case x => sys.error(s"$x is not an EObject")
         }
         execute(op.target, row)
       case _ => // ignore
     }
  }
  
  private def evaluate(expr: Expression, row: Row): Any = expr match {
    case e : IntegerLiteral => e.value.get
    case e : BooleanLiteral => e.value.get
    case e : RealLiteral => e.value.get
    case e : StringLiteral => e.value.get
    case e : FieldReference => row(e.field.get)
    case e : UnaryOperation => evaluateUnary(e, row)
    case e : BinaryOperation => evaluateBinary(e, row)
    case e : FeatureCall => 
      val target = evaluate(e.targetExpression.get, row).asInstanceOf[EObject]
      e.feature.get match {
        case "eContainer" => target.eContainer
        case "eClass" => target.eClass
        case f => target.eGet(target.eClass.structuralFeature(f))
      }
  }
  
  private def evaluateUnary(expr: UnaryOperation, row: Row): Any = expr.operator.get match {
    case UnaryOperator.NOT => evaluate(expr.expression.get, row) match {
      case x : Boolean => !x
      case x => sys.error(s"$x is not a boolean")
    }
    case UnaryOperator.NEGATION => evaluate(expr.expression.get, row) match {
      case x : Int => -x
      case x : Double => -x
      case x => sys.error(s"$x is not a number")
    }
  }

  private def evaluateBinary(expr: BinaryOperation, row: Row): Any = {
    val left = evaluate(expr.getLeftExpression, row)
    val right = evaluate(expr.getRightExpression, row)
    (expr.operator.get, left, right) match {
      case (BinaryOperator.ADD, l: Int, r: Int) => l + r
      case (BinaryOperator.ADD, l: String, r: String) => l + r
      case (BinaryOperator.OR, Bool(l), Bool(r)) => l || r
      case (op, l, r) => sys.error(s"Unsupported $l $op $r") 
    }
  }
  
  private object Bool {
    def unapply(x : Any): Option[Boolean] = x match {
      case v : Boolean => Some(v)
      case v : AnyRef => Some(true)
      case null => Some(false)
      case _ => sys.error(s"Cannot convert $x to boolean") 
    }
  }
  
    private def unfinished: Stream[Element] = {
    val xs = dataflow.elements filterNot (finished.contains(_))
    if (xs.isEmpty) Stream.empty else Stream.cons(xs.head, unfinished)
  }

  private implicit class EObjectExtras(target: EObject) {
    def allKindOf[T <: EClass : ClassTag]: Seq[T] = {
      val children = target.eContents().flatMap(x => x.allKindOf[T])
      target match {
        case x: T => x +: children
        case _ => children
      }      
    }
    
    def allKindOf(name: String): Seq[EObject] = {
      val children = target.eContents().flatMap(x => x.allKindOf(name))
      if (target.eClass().name == name) {
        target +: children
      } else {
        children
      }
    }
  }
  
  private implicit class EClassExtras(target: EClass) {
    def structuralFeature(name: String): EStructuralFeature = 
      target.eAllStructuralFeatures.filter(_.name == name).headOption match {
        case Some(sf) => sf
        case None => sys.error(s"$target does not know about the feature $name")
      } 
  }
}