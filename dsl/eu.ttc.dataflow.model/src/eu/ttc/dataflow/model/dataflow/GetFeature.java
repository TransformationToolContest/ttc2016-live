/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.GetFeature#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.GetFeature#getValueField <em>Value Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.GetFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getGetFeature()
 * @model
 * @generated
 */
public interface GetFeature extends Element {
	/**
	 * Returns the value of the '<em><b>Object Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Field</em>' attribute.
	 * @see #setObjectField(String)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getGetFeature_ObjectField()
	 * @model required="true"
	 * @generated
	 */
	String getObjectField();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.GetFeature#getObjectField <em>Object Field</em>}' attribute.
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
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getGetFeature_ValueField()
	 * @model required="true"
	 * @generated
	 */
	String getValueField();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.GetFeature#getValueField <em>Value Field</em>}' attribute.
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
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getGetFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.GetFeature#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

} // GetFeature
