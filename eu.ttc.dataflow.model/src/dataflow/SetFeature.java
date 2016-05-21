/**
 */
package dataflow;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.SetFeature#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link dataflow.SetFeature#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link dataflow.SetFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getSetFeature()
 * @model
 * @generated
 */
public interface SetFeature extends Element {
	/**
	 * Returns the value of the '<em><b>Object Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Field</em>' containment reference.
	 * @see #setObjectField(FieldReference)
	 * @see dataflow.DataflowPackage#getSetFeature_ObjectField()
	 * @model containment="true"
	 * @generated
	 */
	FieldReference getObjectField();

	/**
	 * Sets the value of the '{@link dataflow.SetFeature#getObjectField <em>Object Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Field</em>' containment reference.
	 * @see #getObjectField()
	 * @generated
	 */
	void setObjectField(FieldReference value);

	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Expression</em>' containment reference.
	 * @see #setValueExpression(Expression)
	 * @see dataflow.DataflowPackage#getSetFeature_ValueExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link dataflow.SetFeature#getValueExpression <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' containment reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see dataflow.DataflowPackage#getSetFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link dataflow.SetFeature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

} // SetFeature
