/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collect By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.CollectBy#getElementField <em>Element Field</em>}</li>
 *   <li>{@link dataflow.CollectBy#getCollectBy <em>Collect By</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getCollectBy()
 * @model
 * @generated
 */
public interface CollectBy extends Element {
	/**
	 * Returns the value of the '<em><b>Element Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Field</em>' attribute.
	 * @see #setElementField(String)
	 * @see dataflow.DataflowPackage#getCollectBy_ElementField()
	 * @model required="true"
	 * @generated
	 */
	String getElementField();

	/**
	 * Sets the value of the '{@link dataflow.CollectBy#getElementField <em>Element Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Field</em>' attribute.
	 * @see #getElementField()
	 * @generated
	 */
	void setElementField(String value);

	/**
	 * Returns the value of the '<em><b>Collect By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collect By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collect By</em>' containment reference.
	 * @see #setCollectBy(Expression)
	 * @see dataflow.DataflowPackage#getCollectBy_CollectBy()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCollectBy();

	/**
	 * Sets the value of the '{@link dataflow.CollectBy#getCollectBy <em>Collect By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collect By</em>' containment reference.
	 * @see #getCollectBy()
	 * @generated
	 */
	void setCollectBy(Expression value);

} // CollectBy
