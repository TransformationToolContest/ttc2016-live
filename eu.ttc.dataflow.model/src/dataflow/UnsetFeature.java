/**
 */
package dataflow;

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
	 * Returns the value of the '<em><b>Object Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Field</em>' attribute.
	 * @see #setObjectField(String)
	 * @see dataflow.DataflowPackage#getUnsetFeature_ObjectField()
	 * @model
	 * @generated
	 */
	String getObjectField();

	/**
	 * Sets the value of the '{@link dataflow.UnsetFeature#getObjectField <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Field</em>' attribute.
	 * @see #getObjectField()
	 * @generated
	 */
	void setObjectField(String value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see dataflow.DataflowPackage#getUnsetFeature_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link dataflow.UnsetFeature#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

} // UnsetFeature
