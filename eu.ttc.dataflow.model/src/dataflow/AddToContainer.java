/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add To Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.AddToContainer#getListField <em>List Field</em>}</li>
 *   <li>{@link dataflow.AddToContainer#getValueField <em>Value Field</em>}</li>
 *   <li>{@link dataflow.AddToContainer#getPositionExpression <em>Position Expression</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getAddToContainer()
 * @model
 * @generated
 */
public interface AddToContainer extends Element {
	/**
	 * Returns the value of the '<em><b>List Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Field</em>' attribute.
	 * @see #setListField(String)
	 * @see dataflow.DataflowPackage#getAddToContainer_ListField()
	 * @model
	 * @generated
	 */
	String getListField();

	/**
	 * Sets the value of the '{@link dataflow.AddToContainer#getListField <em>List Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Field</em>' attribute.
	 * @see #getListField()
	 * @generated
	 */
	void setListField(String value);

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
	 * @see dataflow.DataflowPackage#getAddToContainer_ValueField()
	 * @model
	 * @generated
	 */
	String getValueField();

	/**
	 * Sets the value of the '{@link dataflow.AddToContainer#getValueField <em>Value Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Field</em>' attribute.
	 * @see #getValueField()
	 * @generated
	 */
	void setValueField(String value);

	/**
	 * Returns the value of the '<em><b>Position Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Expression</em>' attribute.
	 * @see #setPositionExpression(String)
	 * @see dataflow.DataflowPackage#getAddToContainer_PositionExpression()
	 * @model
	 * @generated
	 */
	String getPositionExpression();

	/**
	 * Sets the value of the '{@link dataflow.AddToContainer#getPositionExpression <em>Position Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Expression</em>' attribute.
	 * @see #getPositionExpression()
	 * @generated
	 */
	void setPositionExpression(String value);

} // AddToContainer
