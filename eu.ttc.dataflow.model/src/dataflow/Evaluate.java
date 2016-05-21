/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.Evaluate#getField <em>Field</em>}</li>
 *   <li>{@link dataflow.Evaluate#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getEvaluate()
 * @model
 * @generated
 */
public interface Evaluate extends Element {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(FieldReference)
	 * @see dataflow.DataflowPackage#getEvaluate_Field()
	 * @model containment="true"
	 * @generated
	 */
	FieldReference getField();

	/**
	 * Sets the value of the '{@link dataflow.Evaluate#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(FieldReference value);

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
	 * @see dataflow.DataflowPackage#getEvaluate_ValueExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link dataflow.Evaluate#getValueExpression <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' containment reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

} // Evaluate
