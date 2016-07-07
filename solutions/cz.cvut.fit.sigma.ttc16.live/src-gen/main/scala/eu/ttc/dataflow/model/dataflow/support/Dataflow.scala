package eu.ttc.dataflow.model.dataflow.support

import eu.ttc.dataflow.model.dataflow.AddToContainer;
import eu.ttc.dataflow.model.dataflow.AllInstances;
import eu.ttc.dataflow.model.dataflow.BinaryOperation;
import eu.ttc.dataflow.model.dataflow.BinaryOperator;
import eu.ttc.dataflow.model.dataflow.BooleanLiteral;
import eu.ttc.dataflow.model.dataflow.CollectBy;
import eu.ttc.dataflow.model.dataflow.ConditionalExpression;
import eu.ttc.dataflow.model.dataflow.ContainerType;
import eu.ttc.dataflow.model.dataflow.Copy;
import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.dataflow.Element;
import eu.ttc.dataflow.model.dataflow.Evaluate;
import eu.ttc.dataflow.model.dataflow.Expression;
import eu.ttc.dataflow.model.dataflow.FeatureCall;
import eu.ttc.dataflow.model.dataflow.FieldReference;
import eu.ttc.dataflow.model.dataflow.Filter;
import eu.ttc.dataflow.model.dataflow.ForEach;
import eu.ttc.dataflow.model.dataflow.GetFeature;
import eu.ttc.dataflow.model.dataflow.IntegerLiteral;
import eu.ttc.dataflow.model.dataflow.Model;
import eu.ttc.dataflow.model.dataflow.NewContainer;
import eu.ttc.dataflow.model.dataflow.NewInstance;
import eu.ttc.dataflow.model.dataflow.RealLiteral;
import eu.ttc.dataflow.model.dataflow.SetFeature;
import eu.ttc.dataflow.model.dataflow.Sort;
import eu.ttc.dataflow.model.dataflow.StringLiteral;
import eu.ttc.dataflow.model.dataflow.UnaryOperation;
import eu.ttc.dataflow.model.dataflow.UnaryOperator;

import fr.unice.i3s.sigma.emf.support.EMFBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;
import fr.unice.i3s.sigma.emf.support.SigmaEcorePackage;

import org.eclipse.emf.common.util.EList;

import scala.Option;


trait Dataflow
  extends EMFScalaSupport {
    
    implicit class Model2Sigma(that: Model) {
      def elements: EList[Element] = that.getElements
    }
    implicit class Element2Sigma(that: Element) {
      def name: String = that.getName
      def name_=(value: String): Unit = that.setName(value)
      def target: Option[Element] = Option(that.getTarget)
      def target_=(value: Element): Unit = that.setTarget(value)
      def target_=(value: ⇒ Option[Element]): Unit =
        that.setTarget(Dataflow._dataflowBuilder.ref(value))
    }
    implicit class AllInstances2Sigma(that: AllInstances) {
      def field: String = that.getField
      def field_=(value: String): Unit = that.setField(value)
      def model: Option[String] = Option(that.getModel)
      def model_=(value: String): Unit = that.setModel(value)
      def packageName: Option[String] = Option(that.getPackageName)
      def packageName_=(value: String): Unit = that.setPackageName(value)
      def typeName: String = that.getTypeName
      def typeName_=(value: String): Unit = that.setTypeName(value)
    }
    implicit class NewInstance2Sigma(that: NewInstance) {
      def instanceField: String = that.getInstanceField
      def instanceField_=(value: String): Unit = that.setInstanceField(value)
      def key: Expression = that.getKey
      def key_=(value: Expression): Unit = that.setKey(value)
      def model: Option[String] = Option(that.getModel)
      def model_=(value: String): Unit = that.setModel(value)
      def packageName: Option[String] = Option(that.getPackageName)
      def packageName_=(value: String): Unit = that.setPackageName(value)
      def typeName: String = that.getTypeName
      def typeName_=(value: String): Unit = that.setTypeName(value)
    }
    implicit class Filter2Sigma(that: Filter) {
      def filterBy: Expression = that.getFilterBy
      def filterBy_=(value: Expression): Unit = that.setFilterBy(value)
      def rejectTarget: Option[Element] = Option(that.getRejectTarget)
      def rejectTarget_=(value: Element): Unit = that.setRejectTarget(value)
      def rejectTarget_=(value: ⇒ Option[Element]): Unit =
        that.setRejectTarget(Dataflow._dataflowBuilder.ref(value))
    }
    implicit class Sort2Sigma(that: Sort) {
      def sortBy: Expression = that.getSortBy
      def sortBy_=(value: Expression): Unit = that.setSortBy(value)
    }
    implicit class Copy2Sigma(that: Copy) {
      def copyTarget: Option[Element] = Option(that.getCopyTarget)
      def copyTarget_=(value: Element): Unit = that.setCopyTarget(value)
      def copyTarget_=(value: ⇒ Option[Element]): Unit =
        that.setCopyTarget(Dataflow._dataflowBuilder.ref(value))
    }
    
    implicit class GetFeature2Sigma(that: GetFeature) {
      def objectField: String = that.getObjectField
      def objectField_=(value: String): Unit = that.setObjectField(value)
      def valueField: String = that.getValueField
      def valueField_=(value: String): Unit = that.setValueField(value)
      def feature: String = that.getFeature
      def feature_=(value: String): Unit = that.setFeature(value)
    }
    implicit class SetFeature2Sigma(that: SetFeature) {
      def objectField: String = that.getObjectField
      def objectField_=(value: String): Unit = that.setObjectField(value)
      def value: Option[Expression] = Option(that.getValue)
      def value_=(value: Expression): Unit = that.setValue(value)
      def feature: String = that.getFeature
      def feature_=(value: String): Unit = that.setFeature(value)
    }
    implicit class NewContainer2Sigma(that: NewContainer) {
      def listField: String = that.getListField
      def listField_=(value: String): Unit = that.setListField(value)
      def containerType: Option[ContainerType] = Option(that.getContainerType)
      def containerType_=(value: ContainerType): Unit = that.setContainerType(value)
    }
    implicit class AddToContainer2Sigma(that: AddToContainer) {
      def listField: String = that.getListField
      def listField_=(value: String): Unit = that.setListField(value)
      def value: Option[Expression] = Option(that.getValue)
      def value_=(value: Expression): Unit = that.setValue(value)
      def position: Option[Expression] = Option(that.getPosition)
      def position_=(value: Expression): Unit = that.setPosition(value)
    }
    implicit class ForEach2Sigma(that: ForEach) {
      def listField: String = that.getListField
      def listField_=(value: String): Unit = that.setListField(value)
      def itemField: String = that.getItemField
      def itemField_=(value: String): Unit = that.setItemField(value)
      def positionField: Option[String] = Option(that.getPositionField)
      def positionField_=(value: String): Unit = that.setPositionField(value)
    }
    implicit class CollectBy2Sigma(that: CollectBy) {
      def collectBy: Option[Expression] = Option(that.getCollectBy)
      def collectBy_=(value: Expression): Unit = that.setCollectBy(value)
    }
    implicit class Evaluate2Sigma(that: Evaluate) {
      def field: String = that.getField
      def field_=(value: String): Unit = that.setField(value)
      def expression: Expression = that.getExpression
      def expression_=(value: Expression): Unit = that.setExpression(value)
    }
    
    implicit class IntegerLiteral2Sigma(that: IntegerLiteral) {
      def value: Option[Int] = Option(that.getValue)
      def value_=(value: Int): Unit = that.setValue(value)
    }
    implicit class BooleanLiteral2Sigma(that: BooleanLiteral) {
      def value: Option[Boolean] = Option(that.isValue)
      def value_=(value: Boolean): Unit = that.setValue(value)
    }
    implicit class RealLiteral2Sigma(that: RealLiteral) {
      def value: Option[Double] = Option(that.getValue)
      def value_=(value: Double): Unit = that.setValue(value)
    }
    implicit class StringLiteral2Sigma(that: StringLiteral) {
      def value: Option[String] = Option(that.getValue)
      def value_=(value: String): Unit = that.setValue(value)
    }
    implicit class FieldReference2Sigma(that: FieldReference) {
      def field: Option[String] = Option(that.getField)
      def field_=(value: String): Unit = that.setField(value)
    }
    implicit class UnaryOperation2Sigma(that: UnaryOperation) {
      def operator: Option[UnaryOperator] = Option(that.getOperator)
      def operator_=(value: UnaryOperator): Unit = that.setOperator(value)
      def expression: Option[Expression] = Option(that.getExpression)
      def expression_=(value: Expression): Unit = that.setExpression(value)
    }
    implicit class BinaryOperation2Sigma(that: BinaryOperation) {
      def operator: Option[BinaryOperator] = Option(that.getOperator)
      def operator_=(value: BinaryOperator): Unit = that.setOperator(value)
      def leftExpression: Option[Expression] = Option(that.getLeftExpression)
      def leftExpression_=(value: Expression): Unit = that.setLeftExpression(value)
      def rightExpression: Option[Expression] = Option(that.getRightExpression)
      def rightExpression_=(value: Expression): Unit = that.setRightExpression(value)
    }
    implicit class FeatureCall2Sigma(that: FeatureCall) {
      def targetExpression: Option[Expression] = Option(that.getTargetExpression)
      def targetExpression_=(value: Expression): Unit = that.setTargetExpression(value)
      def feature: Option[String] = Option(that.getFeature)
      def feature_=(value: String): Unit = that.setFeature(value)
      def parameters: EList[Expression] = that.getParameters
    }
    implicit class ConditionalExpression2Sigma(that: ConditionalExpression) {
      def conditionExpression: Option[Expression] = Option(that.getConditionExpression)
      def conditionExpression_=(value: Expression): Unit = that.setConditionExpression(value)
      def thenExpression: Option[Expression] = Option(that.getThenExpression)
      def thenExpression_=(value: Expression): Unit = that.setThenExpression(value)
      def elseExpression: Option[Expression] = Option(that.getElseExpression)
      def elseExpression_=(value: Expression): Unit = that.setElseExpression(value)
    }
    
    object _dataflow extends SigmaEcorePackage[DataflowPackage] with
      ModelScalaSupport with
      ElementScalaSupport with
      AllInstancesScalaSupport with
      NewInstanceScalaSupport with
      FilterScalaSupport with
      SortScalaSupport with
      CopyScalaSupport with
      ProductScalaSupport with
      GetFeatureScalaSupport with
      SetFeatureScalaSupport with
      NewContainerScalaSupport with
      AddToContainerScalaSupport with
      ForEachScalaSupport with
      CollectByScalaSupport with
      EvaluateScalaSupport with
      ExpressionScalaSupport with
      IntegerLiteralScalaSupport with
      BooleanLiteralScalaSupport with
      RealLiteralScalaSupport with
      StringLiteralScalaSupport with
      FieldReferenceScalaSupport with
      UnaryOperationScalaSupport with
      BinaryOperationScalaSupport with
      FeatureCallScalaSupport with
      ConditionalExpressionScalaSupport {
      
      val ePackage = DataflowPackage.eINSTANCE
    }}
object Dataflow extends Dataflow {
  private[this] val ePackage = DataflowPackage.eINSTANCE
  
  protected[support] val _dataflowBuilder = new EMFBuilder(ePackage)
}