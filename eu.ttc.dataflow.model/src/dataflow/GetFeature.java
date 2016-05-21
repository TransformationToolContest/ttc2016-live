/**
 */
package dataflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.GetFeature#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link dataflow.GetFeature#getValueField <em>Value Field</em>}</li>
 *   <li>{@link dataflow.GetFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getGetFeature()
 * @model
 * @generated
 */
public interface GetFeature extends Element {
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
	 * @see dataflow.DataflowPackage#getGetFeature_ObjectField()
	 * @model
	 * @generated
	 */
	String getObjectField();

	/**
	 * Sets the value of the '{@link dataflow.GetFeature#getObjectField <em>Object Field</em>}' attribute.
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
	 * If the meaning of the '<em>Value Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Field</em>' attribute.
	 * @see #setValueField(String)
	 * @see dataflow.DataflowPackage#getGetFeature_ValueField()
	 * @model
	 * @generated
	 */
	String getValueField();

	/**
	 * Sets the value of the '{@link dataflow.GetFeature#getValueField <em>Value Field</em>}' attribute.
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
	 * @see dataflow.DataflowPackage#getGetFeature_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link dataflow.GetFeature#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

} // GetFeature
