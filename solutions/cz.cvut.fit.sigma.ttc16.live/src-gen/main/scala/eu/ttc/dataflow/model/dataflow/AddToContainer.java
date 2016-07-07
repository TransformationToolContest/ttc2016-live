/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add To Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getListField <em>List Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getValue <em>Value</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getAddToContainer()
 * @model
 * @generated
 */
public interface AddToContainer extends Element
{
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
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getAddToContainer_ListField()
	 * @model required="true"
	 * @generated
	 */
	String getListField();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getListField <em>List Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Field</em>' attribute.
	 * @see #getListField()
	 * @generated
	 */
	void setListField(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getAddToContainer_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Expression)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getAddToContainer_Position()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPosition();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Expression value);

} // AddToContainer
