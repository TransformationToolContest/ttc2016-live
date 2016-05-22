/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.Copy#getCopyTarget <em>Copy Target</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getCopy()
 * @model
 * @generated
 */
public interface Copy extends Element {
	/**
	 * Returns the value of the '<em><b>Copy Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Target</em>' reference.
	 * @see #setCopyTarget(Element)
	 * @see dataflow.DataflowPackage#getCopy_CopyTarget()
	 * @model
	 * @generated
	 */
	Element getCopyTarget();

	/**
	 * Sets the value of the '{@link dataflow.Copy#getCopyTarget <em>Copy Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Target</em>' reference.
	 * @see #getCopyTarget()
	 * @generated
	 */
	void setCopyTarget(Element value);

} // Copy
