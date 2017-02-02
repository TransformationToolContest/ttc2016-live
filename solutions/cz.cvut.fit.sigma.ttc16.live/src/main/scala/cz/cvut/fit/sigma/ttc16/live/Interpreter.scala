package cz.cvut.fit.sigma.ttc16.live

import scala.Stream
import scala.annotation.tailrec
import scala.reflect.ClassTag

import eu.ttc.dataflow.model.dataflow.BinaryOperator
import eu.ttc.dataflow.model.dataflow.UnaryOperator
import eu.ttc.dataflow.model.dataflow.support.Dataflow
import eu.ttc.dataflow.model.dataflow.support.Dataflow._dataflow._
import fr.unice.i3s.sigma.emf.support.ecore.{ EcorePackageScalaSupport => Ecore }
import fr.unice.i3s.sigma.emf.support.ecore.EcorePackageScalaSupport._ecore._
import java.util.Collection
import java.util.List

// TODO: models should be simply a seq, no?
class Interpreter(
    models: Map[String, collection.mutable.Buffer[EObject]],
    metamodels: Map[String, Seq[EPackage]],
    dataflow: Model) extends Dataflow with Ecore {

  type Row = collection.mutable.Map[String, Any]
  type Rows = collection.mutable.Buffer[Row]

  // mutable execution state
  private val finished = collection.mutable.Buffer[Element]()
  private val allIncomingRows = collection.mutable.Map[Element, Rows]()
  private val createdInstances = collection.mutable.Map[Any, EObject]()

  def run(): Unit = {
    def next(): Unit = unfinished foreach { x => processNode(x); next() }

    next();
  }

  private def processNode(source: Element): Unit = {
    println("-- processing " + source + " rows " + source.incomingRows)

    source.incomingRows foreach processIncomping(source)

    finished += source
    //    allIncomingRows remove (source)
  }

  private def processIncomping(source: Element)(row: Row): Unit = {
    //    println("--- source: "+source + " row: "+row)

    source match {
      case op: AllInstances =>
        op.target foreach { target =>
          models(op.model.get)
            .flatMap(_.allKindOf(op.typeName))
            .foreach(x => target.incomingRows += row.updated(op.field, x))
        }
      case op: Evaluate =>
        op.target foreach (_.incomingRows += row.updated(op.field, evaluate(op.expression, row)))
      case op: Filter =>
        val targetOpt = evaluate(op.filterBy, row) match {
          case Bool(true)  => op.target
          case Bool(false) => op.rejectTarget
          case x           => sys.error(s"$x is not a boolean")
        }
        targetOpt foreach (_.incomingRows += row)
      case op: NewInstance =>
        val key = evaluate(op.key, row)
        val cls =
          metamodels(op.model.get)
            .filter(x => op.packageName.map(_ == x.name).getOrElse(true))
            .flatMap(_.allKindOf[EClass])
            .filter(_.name == op.typeName)
            .headOption
        cls match {
          case None => sys.error(s"Unknown class in $op")
          case Some(c) =>
            val hash = (op.model, op.packageName, op.typeName, key)
            val instance = createdInstances.getOrElseUpdate(hash, {
              val i = c.newInstance
              models(op.model.get) += i
              i
            })
            op.target foreach { _.incomingRows += row.updated(op.instanceField, instance) }
        }
      case op: SetFeature =>
        val value = evaluate(op.value.get, row)
        row(op.objectField) match {
          case x: EObject => x.eSet(x.eClass.structuralFeature(op.feature), value)
          case x          => sys.error(s"$x is not an EObject")
        }
        op.target foreach (_.incomingRows += row)
      case op: AddToContainer =>
        for {
          c <- row.get(op.listField)
          e <- op.value
          v = evaluate(e, row)
        } {
          op.position match {
            case Some(pos) =>
              if (!c.isInstanceOf[List[Any]]) sys.error(s"$c is not a list")
              evaluate(pos, row) match {
                case index: Int => c.asInstanceOf[List[Any]].add(index, v)
                case _          => sys.error(s"$pos does not evaluate to int")
              }
            case None =>
              if (!c.isInstanceOf[Collection[Any]]) sys.error(s"$c is not a collection")
              c.asInstanceOf[Collection[Any]].add(v)
          }
          op.target foreach (_.incomingRows += row)
        }
      case op: ForEach =>
        op.target foreach { target =>
          row(op.listField) match {
            case c: Collection[Any] =>
              println(c)
              collection.JavaConversions.asScalaIterator(c.iterator()).zipWithIndex.foreach {
                case (v, pos) =>
                  var newRow = row.updated(op.itemField, v)
                  op.positionField.foreach(posField => newRow = newRow.updated(posField, pos))
                  target.incomingRows += newRow
              }
            case c => sys.error(s"$c is not a collection")
          }

        }
      case _ => sys.error(s"Unknwon op")
    }
  }

  private def evaluate(expr: Expression, row: Row): Any = expr match {
    case e: IntegerLiteral  => e.value.get
    case e: BooleanLiteral  => e.value.get
    case e: RealLiteral     => e.value.get
    case e: StringLiteral   => e.value.get
    case e: FieldReference  => row(e.field.get)
    case e: UnaryOperation  => evaluateUnary(e, row)
    case e: BinaryOperation => evaluateBinary(e, row)
    case e: FeatureCall =>
      val target = evaluate(e.targetExpression.get, row).asInstanceOf[EObject]
      e.feature.get match {
        case "eContainer" => target.eContainer
        case "eClass"     => target.eClass
        case f            => target.eGet(target.eClass.structuralFeature(f))
      }
    case e: ConditionalExpression => 
      evaluate(e.conditionExpression.get, row) match {
          case Bool(true)  => evaluate(e.thenExpression.get, row)
          case Bool(false) => evaluate(e.elseExpression.get, row)
          case x           => sys.error(s"$x is not a boolean")
        }
    case _ => sys.error(s"Don't know how to evalute expression $expr")
  }

  private def evaluateUnary(expr: UnaryOperation, row: Row): Any = expr.operator.get match {
    case UnaryOperator.NOT => evaluate(expr.expression.get, row) match {
      case x: Boolean => !x
      case x          => sys.error(s"$x is not a boolean")
    }
    case UnaryOperator.NEGATION => evaluate(expr.expression.get, row) match {
      case x: Int    => -x
      case x: Double => -x
      case x         => sys.error(s"$x is not a number")
    }
  }

  private def evaluateBinary(expr: BinaryOperation, row: Row): Any = {
    val left = evaluate(expr.getLeftExpression, row)
    val right = evaluate(expr.getRightExpression, row)
    (expr.operator.get, left, right) match {
      case (BinaryOperator.ADD, l: Int, r: Int)         => l + r
      case (BinaryOperator.ADD, l: String, r: String)   => l + r
      case (BinaryOperator.ADD, l: EObject, r: EObject) => l.toString() + r.toString()
      case (BinaryOperator.OR, Bool(l), Bool(r))        => l || r
      case (BinaryOperator.EQ, null, r)                 => r == null
      case (BinaryOperator.EQ, l, null)                 => l == null
      case (BinaryOperator.EQ, l: String, r: String)    => l.equals(r)
      case (BinaryOperator.EQ, l: Int, r: Int)          => l == r
      case (op, l, r)                                   => sys.error(s"Unsupported $l $op $r")
    }
  }

  private object Bool {
    def unapply(x: Any): Option[Boolean] = x match {
      case v: Boolean => Some(v)
      case v: AnyRef  => Some(true)
      case null       => Some(false)
      case _          => sys.error(s"Cannot convert $x to boolean")
    }
  }

  private def unfinished: Option[Element] = {
    val xs =
      dataflow.elements
        .filter(x => !finished.contains(x)) // they should not be finished
        .filter(x => {
          finished.containsAll(x.sources) // the source edges must be finished
        })
    xs.headOption
  }

  private implicit class EObjectExtras(target: EObject) {
    def allKindOf[T <: EClass: ClassTag]: Seq[T] = {
      val children = target.eContents().flatMap(x => x.allKindOf[T])
      target match {
        case x: T => x +: children
        case _    => children
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

  private implicit class EClassExtras(that: EClass) {
    def structuralFeature(name: String): EStructuralFeature =
      that.eAllStructuralFeatures.filter(_.name == name).headOption match {
        case Some(sf) => sf
        case None     => sys.error(s"$that does not know about the feature $name")
      }
  }

  private implicit class ElementExtras(that: Element) {
    val possibleTargets: Seq[Element] = {
      val targets = Seq.newBuilder[Element]

      that.target foreach (targets += _)
      that match {
        case op: Filter => op.rejectTarget foreach (targets += _)
        case _          =>
      }

      targets.result()
    }

    def sources: Seq[Element] = dataflow.elements filter (_.possibleTargets contains that)

    def incomingRows: Rows = allIncomingRows.get(that) match {
      case Some(rows) => rows
      case None => {
        val rows = collection.mutable.Buffer[Row]()

        // this is in the language definition
        if (that.sources.isEmpty) {
          rows += collection.mutable.Map[String, Any]()
        }

        allIncomingRows += that -> rows
        rows
      }
    }
  }
}