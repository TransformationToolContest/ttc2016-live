/**
 */
package dataflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.SetFeature#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link dataflow.SetFeature#getValueField <em>Value Field</em>}</li>
 *   <li>{@link dataflow.SetFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getSetFeature()
 * @model
 * @generated
 */
public interface SetFeature extends Element {
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
	 * @see dataflow.DataflowPackage#getSetFeature_ObjectField()
	 * @model required="true"
	 * @generated
	 */
	String getObjectField();

	/**
	 * Sets the value of the '{@link dataflow.SetFeature#getObjectField <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Field</em>' attribute.
	 * @see #getObjectField()
	 * @generated
	 */
	void setObjectField(String value);

	/**
	 * Returns the value of the '<em><b>Value Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Field</em>' attribute.
	 * @see #setValueField(String)
	 * @see dataflow.DataflowPackage#getSetFeature_ValueField()
	 * @model
	 * @generated
	 */
	String getValueField();

	/**
	 * Sets the value of the '{@link dataflow.SetFeature#getValueField <em>Value Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Field</em>' attribute.
	 * @see #getValueField()
	 * @generated
	 */
	void setValueField(String value);

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
	 * @see dataflow.DataflowPackage#getSetFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link dataflow.SetFeature#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

} // SetFeature
