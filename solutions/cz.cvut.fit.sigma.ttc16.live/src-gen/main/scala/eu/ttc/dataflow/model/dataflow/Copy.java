/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.Copy#getCopyTarget <em>Copy Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getCopy()
 * @model
 * @generated
 */
public interface Copy extends Element
{
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
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getCopy_CopyTarget()
	 * @model
	 * @generated
	 */
	Element getCopyTarget();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.Copy#getCopyTarget <em>Copy Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Target</em>' reference.
	 * @see #getCopyTarget()
	 * @generated
	 */
	void setCopyTarget(Element value);

} // Copy
