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
 *   <li>{@link dataflow.Sort#getSortByField <em>Sort By Field</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getSort()
 * @model
 * @generated
 */
public interface Sort extends Element {
	/**
	 * Returns the value of the '<em><b>Sort By Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort By Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By Field</em>' attribute.
	 * @see #setSortByField(String)
	 * @see dataflow.DataflowPackage#getSort_SortByField()
	 * @model required="true"
	 * @generated
	 */
	String getSortByField();

	/**
	 * Sets the value of the '{@link dataflow.Sort#getSortByField <em>Sort By Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By Field</em>' attribute.
	 * @see #getSortByField()
	 * @generated
	 */
	void setSortByField(String value);

} // Sort
