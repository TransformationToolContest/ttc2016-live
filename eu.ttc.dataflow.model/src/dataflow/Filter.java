/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.Filter#getFilterBy <em>Filter By</em>}</li>
 *   <li>{@link dataflow.Filter#getRejectTarget <em>Reject Target</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends Element {
	/**
	 * Returns the value of the '<em><b>Filter By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter By</em>' containment reference.
	 * @see #setFilterBy(Expression)
	 * @see dataflow.DataflowPackage#getFilter_FilterBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFilterBy();

	/**
	 * Sets the value of the '{@link dataflow.Filter#getFilterBy <em>Filter By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter By</em>' containment reference.
	 * @see #getFilterBy()
	 * @generated
	 */
	void setFilterBy(Expression value);

	/**
	 * Returns the value of the '<em><b>Reject Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reject Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reject Target</em>' reference.
	 * @see #setRejectTarget(Element)
	 * @see dataflow.DataflowPackage#getFilter_RejectTarget()
	 * @model
	 * @generated
	 */
	Element getRejectTarget();

	/**
	 * Sets the value of the '{@link dataflow.Filter#getRejectTarget <em>Reject Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reject Target</em>' reference.
	 * @see #getRejectTarget()
	 * @generated
	 */
	void setRejectTarget(Element value);

} // Filter
