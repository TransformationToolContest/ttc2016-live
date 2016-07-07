/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getBinaryOperation()
 * @model
 * @generated
 */
public interface BinaryOperation extends Expression
{
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.ttc.dataflow.model.dataflow.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see eu.ttc.dataflow.model.dataflow.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getBinaryOperation_Operator()
	 * @model
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see eu.ttc.dataflow.model.dataflow.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Expression</em>' containment reference.
	 * @see #setLeftExpression(Expression)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getBinaryOperation_LeftExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeftExpression();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getLeftExpression <em>Left Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Expression</em>' containment reference.
	 * @see #getLeftExpression()
	 * @generated
	 */
	void setLeftExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Expression</em>' containment reference.
	 * @see #setRightExpression(Expression)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getBinaryOperation_RightExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRightExpression();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getRightExpression <em>Right Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Expression</em>' containment reference.
	 * @see #getRightExpression()
	 * @generated
	 */
	void setRightExpression(Expression value);

} // BinaryOperation
