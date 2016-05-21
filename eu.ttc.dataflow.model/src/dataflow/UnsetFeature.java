/**
 */
package dataflow;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unset Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.UnsetFeature#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link dataflow.UnsetFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getUnsetFeature()
 * @model
 * @generated
 */
public interface UnsetFeature extends Element {
	/**
	 * Returns the value of the '<em><b>Object Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Field</em>' containment reference.
	 * @see #setObjectField(FieldReference)
	 * @see dataflow.DataflowPackage#getUnsetFeature_ObjectField()
	 * @model containment="true"
	 * @generated
	 */
	FieldReference getObjectField();

	/**
	 * Sets the value of the '{@link dataflow.UnsetFeature#getObjectField <em>Object Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Field</em>' containment reference.
	 * @see #getObjectField()
	 * @generated
	 */
	void setObjectField(FieldReference value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see dataflow.DataflowPackage#getUnsetFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link dataflow.UnsetFeature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

} // UnsetFeature
