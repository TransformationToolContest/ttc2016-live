/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add To Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.AddToContainer#getListField <em>List Field</em>}</li>
 *   <li>{@link dataflow.AddToContainer#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link dataflow.AddToContainer#getPositionExpression <em>Position Expression</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getAddToContainer()
 * @model
 * @generated
 */
public interface AddToContainer extends Element {
	/**
	 * Returns the value of the '<em><b>List Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Field</em>' containment reference.
	 * @see #setListField(FieldReference)
	 * @see dataflow.DataflowPackage#getAddToContainer_ListField()
	 * @model containment="true"
	 * @generated
	 */
	FieldReference getListField();

	/**
	 * Sets the value of the '{@link dataflow.AddToContainer#getListField <em>List Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Field</em>' containment reference.
	 * @see #getListField()
	 * @generated
	 */
	void setListField(FieldReference value);

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
	 * @see dataflow.DataflowPackage#getAddToContainer_ValueExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link dataflow.AddToContainer#getValueExpression <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' containment reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Position Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Expression</em>' containment reference.
	 * @see #setPositionExpression(Expression)
	 * @see dataflow.DataflowPackage#getAddToContainer_PositionExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPositionExpression();

	/**
	 * Sets the value of the '{@link dataflow.AddToContainer#getPositionExpression <em>Position Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Expression</em>' containment reference.
	 * @see #getPositionExpression()
	 * @generated
	 */
	void setPositionExpression(Expression value);

} // AddToContainer
