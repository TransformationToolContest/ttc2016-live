/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.ForEach#getListField <em>List Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.ForEach#getItemField <em>Item Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.ForEach#getPositionField <em>Position Field</em>}</li>
 * </ul>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getForEach()
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
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getForEach_ListField()
	 * @model required="true"
	 * @generated
	 */
	String getListField();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.ForEach#getListField <em>List Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Field</em>' attribute.
	 * @see #getListField()
	 * @generated
	 */
	void setListField(String value);

	/**
	 * Returns the value of the '<em><b>Item Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Field</em>' attribute.
	 * @see #setItemField(String)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getForEach_ItemField()
	 * @model required="true"
	 * @generated
	 */
	String getItemField();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.ForEach#getItemField <em>Item Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Field</em>' attribute.
	 * @see #getItemField()
	 * @generated
	 */
	void setItemField(String value);

	/**
	 * Returns the value of the '<em><b>Position Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Field</em>' attribute.
	 * @see #setPositionField(String)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getForEach_PositionField()
	 * @model
	 * @generated
	 */
	String getPositionField();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.ForEach#getPositionField <em>Position Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Field</em>' attribute.
	 * @see #getPositionField()
	 * @generated
	 */
	void setPositionField(String value);

} // ForEach
