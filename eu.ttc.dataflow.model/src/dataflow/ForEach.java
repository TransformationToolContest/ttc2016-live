/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.ForEach#getListField <em>List Field</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends Element {
	/**
	 * Returns the value of the '<em><b>List Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Field</em>' attribute.
	 * @see #setListField(String)
	 * @see dataflow.DataflowPackage#getForEach_ListField()
	 * @model required="true"
	 * @generated
	 */
	String getListField();

	/**
	 * Sets the value of the '{@link dataflow.ForEach#getListField <em>List Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Field</em>' attribute.
	 * @see #getListField()
	 * @generated
	 */
	void setListField(String value);

} // ForEach
