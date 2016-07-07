/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collect By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.CollectBy#getCollectBy <em>Collect By</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getCollectBy()
 * @model
 * @generated
 */
public interface CollectBy extends Element
{
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
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getCollectBy_CollectBy()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCollectBy();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.CollectBy#getCollectBy <em>Collect By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collect By</em>' containment reference.
	 * @see #getCollectBy()
	 * @generated
	 */
	void setCollectBy(Expression value);

} // CollectBy
