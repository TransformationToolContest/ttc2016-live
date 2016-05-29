/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.UnaryOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.UnaryOperation#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getUnaryOperation()
 * @model
 * @generated
 */
public interface UnaryOperation extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.ttc.dataflow.model.dataflow.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see eu.ttc.dataflow.model.dataflow.UnaryOperator
	 * @see #setOperator(UnaryOperator)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getUnaryOperation_Operator()
	 * @model
	 * @generated
	 */
	UnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.UnaryOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see eu.ttc.dataflow.model.dataflow.UnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperator value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getUnaryOperation_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.UnaryOperation#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // UnaryOperation
