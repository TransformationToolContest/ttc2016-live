/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.Sort#getSortBy <em>Sort By</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getSort()
 * @model
 * @generated
 */
public interface Sort extends Element {
	/**
	 * Returns the value of the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By</em>' containment reference.
	 * @see #setSortBy(Expression)
	 * @see dataflow.DataflowPackage#getSort_SortBy()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSortBy();

	/**
	 * Sets the value of the '{@link dataflow.Sort#getSortBy <em>Sort By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By</em>' containment reference.
	 * @see #getSortBy()
	 * @generated
	 */
	void setSortBy(Expression value);

} // Sort
