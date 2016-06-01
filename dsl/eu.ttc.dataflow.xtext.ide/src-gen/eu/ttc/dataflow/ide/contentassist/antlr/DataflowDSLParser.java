/*
 * generated by Xtext 2.9.2
 */
package eu.ttc.dataflow.ide.contentassist.antlr;

import com.google.inject.Inject;
import eu.ttc.dataflow.ide.contentassist.antlr.internal.InternalDataflowDSLParser;
import eu.ttc.dataflow.services.DataflowDSLGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class DataflowDSLParser extends AbstractContentAssistParser {

	@Inject
	private DataflowDSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDataflowDSLParser createParser() {
		InternalDataflowDSLParser result = new InternalDataflowDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getConditionalExpressionAccess().getAlternatives(), "rule__ConditionalExpression__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_3_0(), "rule__EDouble__Alternatives_3_0");
					put(grammarAccess.getContainerTypeAccess().getAlternatives(), "rule__ContainerType__Alternatives");
					put(grammarAccess.getEqualityOperatorAccess().getAlternatives(), "rule__EqualityOperator__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getAllInstancesAccess().getGroup(), "rule__AllInstances__Group__0");
					put(grammarAccess.getAllInstancesAccess().getGroup_3(), "rule__AllInstances__Group_3__0");
					put(grammarAccess.getAllInstancesAccess().getGroup_4(), "rule__AllInstances__Group_4__0");
					put(grammarAccess.getAllInstancesAccess().getGroup_4_1(), "rule__AllInstances__Group_4_1__0");
					put(grammarAccess.getAllInstancesAccess().getGroup_4_2(), "rule__AllInstances__Group_4_2__0");
					put(grammarAccess.getAllInstancesAccess().getGroup_5(), "rule__AllInstances__Group_5__0");
					put(grammarAccess.getNewInstanceAccess().getGroup(), "rule__NewInstance__Group__0");
					put(grammarAccess.getNewInstanceAccess().getGroup_3(), "rule__NewInstance__Group_3__0");
					put(grammarAccess.getNewInstanceAccess().getGroup_4(), "rule__NewInstance__Group_4__0");
					put(grammarAccess.getNewInstanceAccess().getGroup_5(), "rule__NewInstance__Group_5__0");
					put(grammarAccess.getNewInstanceAccess().getGroup_5_1(), "rule__NewInstance__Group_5_1__0");
					put(grammarAccess.getNewInstanceAccess().getGroup_5_2(), "rule__NewInstance__Group_5_2__0");
					put(grammarAccess.getNewInstanceAccess().getGroup_6(), "rule__NewInstance__Group_6__0");
					put(grammarAccess.getFilterAccess().getGroup(), "rule__Filter__Group__0");
					put(grammarAccess.getFilterAccess().getGroup_3(), "rule__Filter__Group_3__0");
					put(grammarAccess.getFilterAccess().getGroup_4(), "rule__Filter__Group_4__0");
					put(grammarAccess.getFilterAccess().getGroup_5(), "rule__Filter__Group_5__0");
					put(grammarAccess.getCopyAccess().getGroup(), "rule__Copy__Group__0");
					put(grammarAccess.getCopyAccess().getGroup_3(), "rule__Copy__Group_3__0");
					put(grammarAccess.getCopyAccess().getGroup_4(), "rule__Copy__Group_4__0");
					put(grammarAccess.getSortAccess().getGroup(), "rule__Sort__Group__0");
					put(grammarAccess.getSortAccess().getGroup_3(), "rule__Sort__Group_3__0");
					put(grammarAccess.getSortAccess().getGroup_4(), "rule__Sort__Group_4__0");
					put(grammarAccess.getProductAccess().getGroup(), "rule__Product__Group__0");
					put(grammarAccess.getProductAccess().getGroup_3(), "rule__Product__Group_3__0");
					put(grammarAccess.getGetFeatureAccess().getGroup(), "rule__GetFeature__Group__0");
					put(grammarAccess.getGetFeatureAccess().getGroup_3(), "rule__GetFeature__Group_3__0");
					put(grammarAccess.getGetFeatureAccess().getGroup_4(), "rule__GetFeature__Group_4__0");
					put(grammarAccess.getGetFeatureAccess().getGroup_5(), "rule__GetFeature__Group_5__0");
					put(grammarAccess.getGetFeatureAccess().getGroup_6(), "rule__GetFeature__Group_6__0");
					put(grammarAccess.getSetFeatureAccess().getGroup(), "rule__SetFeature__Group__0");
					put(grammarAccess.getSetFeatureAccess().getGroup_3(), "rule__SetFeature__Group_3__0");
					put(grammarAccess.getSetFeatureAccess().getGroup_4(), "rule__SetFeature__Group_4__0");
					put(grammarAccess.getSetFeatureAccess().getGroup_5(), "rule__SetFeature__Group_5__0");
					put(grammarAccess.getSetFeatureAccess().getGroup_6(), "rule__SetFeature__Group_6__0");
					put(grammarAccess.getNewContainerAccess().getGroup(), "rule__NewContainer__Group__0");
					put(grammarAccess.getNewContainerAccess().getGroup_3(), "rule__NewContainer__Group_3__0");
					put(grammarAccess.getNewContainerAccess().getGroup_4(), "rule__NewContainer__Group_4__0");
					put(grammarAccess.getNewContainerAccess().getGroup_5(), "rule__NewContainer__Group_5__0");
					put(grammarAccess.getAddToContainerAccess().getGroup(), "rule__AddToContainer__Group__0");
					put(grammarAccess.getAddToContainerAccess().getGroup_3(), "rule__AddToContainer__Group_3__0");
					put(grammarAccess.getAddToContainerAccess().getGroup_4(), "rule__AddToContainer__Group_4__0");
					put(grammarAccess.getAddToContainerAccess().getGroup_5(), "rule__AddToContainer__Group_5__0");
					put(grammarAccess.getAddToContainerAccess().getGroup_6(), "rule__AddToContainer__Group_6__0");
					put(grammarAccess.getForEachAccess().getGroup(), "rule__ForEach__Group__0");
					put(grammarAccess.getForEachAccess().getGroup_3(), "rule__ForEach__Group_3__0");
					put(grammarAccess.getForEachAccess().getGroup_4(), "rule__ForEach__Group_4__0");
					put(grammarAccess.getForEachAccess().getGroup_5(), "rule__ForEach__Group_5__0");
					put(grammarAccess.getForEachAccess().getGroup_6(), "rule__ForEach__Group_6__0");
					put(grammarAccess.getCollectByAccess().getGroup(), "rule__CollectBy__Group__0");
					put(grammarAccess.getCollectByAccess().getGroup_3(), "rule__CollectBy__Group_3__0");
					put(grammarAccess.getCollectByAccess().getGroup_4(), "rule__CollectBy__Group_4__0");
					put(grammarAccess.getCollectByAccess().getGroup_5(), "rule__CollectBy__Group_5__0");
					put(grammarAccess.getEvaluateAccess().getGroup(), "rule__Evaluate__Group__0");
					put(grammarAccess.getEvaluateAccess().getGroup_3(), "rule__Evaluate__Group_3__0");
					put(grammarAccess.getEvaluateAccess().getGroup_4(), "rule__Evaluate__Group_4__0");
					put(grammarAccess.getEvaluateAccess().getGroup_5(), "rule__Evaluate__Group_5__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup_0(), "rule__ConditionalExpression__Group_0__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_0(), "rule__UnaryExpression__Group_0__0");
					put(grammarAccess.getFeatureCallExpressionAccess().getGroup(), "rule__FeatureCallExpression__Group__0");
					put(grammarAccess.getFeatureCallExpressionAccess().getGroup_1(), "rule__FeatureCallExpression__Group_1__0");
					put(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3(), "rule__FeatureCallExpression__Group_1_3__0");
					put(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1(), "rule__FeatureCallExpression__Group_1_3_1__0");
					put(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1_1(), "rule__FeatureCallExpression__Group_1_3_1_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_3(), "rule__PrimaryExpression__Group_3__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_4(), "rule__PrimaryExpression__Group_4__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_5(), "rule__PrimaryExpression__Group_5__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_3(), "rule__EDouble__Group_3__0");
					put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
					put(grammarAccess.getAllInstancesAccess().getNameAssignment_1(), "rule__AllInstances__NameAssignment_1");
					put(grammarAccess.getAllInstancesAccess().getFieldAssignment_3_1(), "rule__AllInstances__FieldAssignment_3_1");
					put(grammarAccess.getAllInstancesAccess().getModelAssignment_4_1_0(), "rule__AllInstances__ModelAssignment_4_1_0");
					put(grammarAccess.getAllInstancesAccess().getPackageNameAssignment_4_2_0(), "rule__AllInstances__PackageNameAssignment_4_2_0");
					put(grammarAccess.getAllInstancesAccess().getTypeNameAssignment_4_3(), "rule__AllInstances__TypeNameAssignment_4_3");
					put(grammarAccess.getAllInstancesAccess().getTargetAssignment_5_1(), "rule__AllInstances__TargetAssignment_5_1");
					put(grammarAccess.getNewInstanceAccess().getNameAssignment_1(), "rule__NewInstance__NameAssignment_1");
					put(grammarAccess.getNewInstanceAccess().getInstanceFieldAssignment_3_1(), "rule__NewInstance__InstanceFieldAssignment_3_1");
					put(grammarAccess.getNewInstanceAccess().getKeyAssignment_4_1(), "rule__NewInstance__KeyAssignment_4_1");
					put(grammarAccess.getNewInstanceAccess().getModelAssignment_5_1_0(), "rule__NewInstance__ModelAssignment_5_1_0");
					put(grammarAccess.getNewInstanceAccess().getPackageNameAssignment_5_2_0(), "rule__NewInstance__PackageNameAssignment_5_2_0");
					put(grammarAccess.getNewInstanceAccess().getTypeNameAssignment_5_3(), "rule__NewInstance__TypeNameAssignment_5_3");
					put(grammarAccess.getNewInstanceAccess().getTargetAssignment_6_1(), "rule__NewInstance__TargetAssignment_6_1");
					put(grammarAccess.getFilterAccess().getNameAssignment_1(), "rule__Filter__NameAssignment_1");
					put(grammarAccess.getFilterAccess().getFilterByAssignment_3_1(), "rule__Filter__FilterByAssignment_3_1");
					put(grammarAccess.getFilterAccess().getTargetAssignment_4_1(), "rule__Filter__TargetAssignment_4_1");
					put(grammarAccess.getFilterAccess().getRejectTargetAssignment_5_1(), "rule__Filter__RejectTargetAssignment_5_1");
					put(grammarAccess.getCopyAccess().getNameAssignment_1(), "rule__Copy__NameAssignment_1");
					put(grammarAccess.getCopyAccess().getTargetAssignment_3_1(), "rule__Copy__TargetAssignment_3_1");
					put(grammarAccess.getCopyAccess().getCopyTargetAssignment_4_1(), "rule__Copy__CopyTargetAssignment_4_1");
					put(grammarAccess.getSortAccess().getNameAssignment_1(), "rule__Sort__NameAssignment_1");
					put(grammarAccess.getSortAccess().getSortByAssignment_3_1(), "rule__Sort__SortByAssignment_3_1");
					put(grammarAccess.getSortAccess().getTargetAssignment_4_1(), "rule__Sort__TargetAssignment_4_1");
					put(grammarAccess.getProductAccess().getNameAssignment_1(), "rule__Product__NameAssignment_1");
					put(grammarAccess.getProductAccess().getTargetAssignment_3_1(), "rule__Product__TargetAssignment_3_1");
					put(grammarAccess.getGetFeatureAccess().getNameAssignment_1(), "rule__GetFeature__NameAssignment_1");
					put(grammarAccess.getGetFeatureAccess().getObjectFieldAssignment_3_1(), "rule__GetFeature__ObjectFieldAssignment_3_1");
					put(grammarAccess.getGetFeatureAccess().getValueFieldAssignment_4_1(), "rule__GetFeature__ValueFieldAssignment_4_1");
					put(grammarAccess.getGetFeatureAccess().getFeatureAssignment_5_1(), "rule__GetFeature__FeatureAssignment_5_1");
					put(grammarAccess.getGetFeatureAccess().getTargetAssignment_6_1(), "rule__GetFeature__TargetAssignment_6_1");
					put(grammarAccess.getSetFeatureAccess().getNameAssignment_1(), "rule__SetFeature__NameAssignment_1");
					put(grammarAccess.getSetFeatureAccess().getObjectFieldAssignment_3_1(), "rule__SetFeature__ObjectFieldAssignment_3_1");
					put(grammarAccess.getSetFeatureAccess().getValueAssignment_4_1(), "rule__SetFeature__ValueAssignment_4_1");
					put(grammarAccess.getSetFeatureAccess().getFeatureAssignment_5_1(), "rule__SetFeature__FeatureAssignment_5_1");
					put(grammarAccess.getSetFeatureAccess().getTargetAssignment_6_1(), "rule__SetFeature__TargetAssignment_6_1");
					put(grammarAccess.getNewContainerAccess().getNameAssignment_1(), "rule__NewContainer__NameAssignment_1");
					put(grammarAccess.getNewContainerAccess().getListFieldAssignment_3_1(), "rule__NewContainer__ListFieldAssignment_3_1");
					put(grammarAccess.getNewContainerAccess().getContainerTypeAssignment_4_1(), "rule__NewContainer__ContainerTypeAssignment_4_1");
					put(grammarAccess.getNewContainerAccess().getTargetAssignment_5_1(), "rule__NewContainer__TargetAssignment_5_1");
					put(grammarAccess.getAddToContainerAccess().getNameAssignment_1(), "rule__AddToContainer__NameAssignment_1");
					put(grammarAccess.getAddToContainerAccess().getListFieldAssignment_3_1(), "rule__AddToContainer__ListFieldAssignment_3_1");
					put(grammarAccess.getAddToContainerAccess().getValueAssignment_4_1(), "rule__AddToContainer__ValueAssignment_4_1");
					put(grammarAccess.getAddToContainerAccess().getPositionAssignment_5_1(), "rule__AddToContainer__PositionAssignment_5_1");
					put(grammarAccess.getAddToContainerAccess().getTargetAssignment_6_1(), "rule__AddToContainer__TargetAssignment_6_1");
					put(grammarAccess.getForEachAccess().getNameAssignment_1(), "rule__ForEach__NameAssignment_1");
					put(grammarAccess.getForEachAccess().getListFieldAssignment_3_1(), "rule__ForEach__ListFieldAssignment_3_1");
					put(grammarAccess.getForEachAccess().getItemFieldAssignment_4_1(), "rule__ForEach__ItemFieldAssignment_4_1");
					put(grammarAccess.getForEachAccess().getPositionFieldAssignment_5_1(), "rule__ForEach__PositionFieldAssignment_5_1");
					put(grammarAccess.getForEachAccess().getTargetAssignment_6_1(), "rule__ForEach__TargetAssignment_6_1");
					put(grammarAccess.getCollectByAccess().getNameAssignment_1(), "rule__CollectBy__NameAssignment_1");
					put(grammarAccess.getCollectByAccess().getElementFieldAssignment_3_1(), "rule__CollectBy__ElementFieldAssignment_3_1");
					put(grammarAccess.getCollectByAccess().getCollectByAssignment_4_1(), "rule__CollectBy__CollectByAssignment_4_1");
					put(grammarAccess.getCollectByAccess().getTargetAssignment_5_1(), "rule__CollectBy__TargetAssignment_5_1");
					put(grammarAccess.getEvaluateAccess().getNameAssignment_1(), "rule__Evaluate__NameAssignment_1");
					put(grammarAccess.getEvaluateAccess().getFieldAssignment_3_1(), "rule__Evaluate__FieldAssignment_3_1");
					put(grammarAccess.getEvaluateAccess().getExpressionAssignment_4_1(), "rule__Evaluate__ExpressionAssignment_4_1");
					put(grammarAccess.getEvaluateAccess().getTargetAssignment_5_1(), "rule__Evaluate__TargetAssignment_5_1");
					put(grammarAccess.getConditionalExpressionAccess().getThenExpressionAssignment_0_4(), "rule__ConditionalExpression__ThenExpressionAssignment_0_4");
					put(grammarAccess.getConditionalExpressionAccess().getElseExpressionAssignment_0_6(), "rule__ConditionalExpression__ElseExpressionAssignment_0_6");
					put(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1(), "rule__OrExpression__OperatorAssignment_1_1");
					put(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_2(), "rule__OrExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1(), "rule__AndExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_2(), "rule__AndExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1(), "rule__EqualityExpression__OperatorAssignment_1_1");
					put(grammarAccess.getEqualityExpressionAccess().getRightExpressionAssignment_1_2(), "rule__EqualityExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1(), "rule__RelationalExpression__OperatorAssignment_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getRightExpressionAssignment_1_2(), "rule__RelationalExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1(), "rule__AdditiveExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightExpressionAssignment_1_2(), "rule__AdditiveExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1(), "rule__MultiplicativeExpression__OperatorAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionAssignment_1_2(), "rule__MultiplicativeExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1(), "rule__UnaryExpression__OperatorAssignment_0_1");
					put(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2(), "rule__UnaryExpression__ExpressionAssignment_0_2");
					put(grammarAccess.getFeatureCallExpressionAccess().getFeatureAssignment_1_2(), "rule__FeatureCallExpression__FeatureAssignment_1_2");
					put(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_0(), "rule__FeatureCallExpression__ParametersAssignment_1_3_1_0");
					put(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_1_1(), "rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1(), "rule__PrimaryExpression__ValueAssignment_0_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1(), "rule__PrimaryExpression__ValueAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1(), "rule__PrimaryExpression__ValueAssignment_2_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_3_1(), "rule__PrimaryExpression__ValueAssignment_3_1");
					put(grammarAccess.getPrimaryExpressionAccess().getFieldAssignment_4_1(), "rule__PrimaryExpression__FieldAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDataflowDSLParser typedParser = (InternalDataflowDSLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DataflowDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DataflowDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
