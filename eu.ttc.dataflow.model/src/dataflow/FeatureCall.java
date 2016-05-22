/**
 */
package dataflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.FeatureCall#getTargetExpression <em>Target Expression</em>}</li>
 *   <li>{@link dataflow.FeatureCall#getFeature <em>Feature</em>}</li>
 *   <li>{@link dataflow.FeatureCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getFeatureCall()
 * @model
 * @generated
 */
public interface FeatureCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Target Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Expression</em>' containment reference.
	 * @see #setTargetExpression(Expression)
	 * @see dataflow.DataflowPackage#getFeatureCall_TargetExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTargetExpression();

	/**
	 * Sets the value of the '{@link dataflow.FeatureCall#getTargetExpression <em>Target Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Expression</em>' containment reference.
	 * @see #getTargetExpression()
	 * @generated
	 */
	void setTargetExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see dataflow.DataflowPackage#getFeatureCall_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link dataflow.FeatureCall#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dataflow.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see dataflow.DataflowPackage#getFeatureCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getParameters();

} // FeatureCall
