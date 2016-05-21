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
 *   <li>{@link dataflow.Filter#getFilterByField <em>Filter By Field</em>}</li>
 *   <li>{@link dataflow.Filter#getRejectTarget <em>Reject Target</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends Element {
	/**
	 * Returns the value of the '<em><b>Filter By Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter By Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter By Field</em>' attribute.
	 * @see #setFilterByField(String)
	 * @see dataflow.DataflowPackage#getFilter_FilterByField()
	 * @model required="true"
	 * @generated
	 */
	String getFilterByField();

	/**
	 * Sets the value of the '{@link dataflow.Filter#getFilterByField <em>Filter By Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter By Field</em>' attribute.
	 * @see #getFilterByField()
	 * @generated
	 */
	void setFilterByField(String value);

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
