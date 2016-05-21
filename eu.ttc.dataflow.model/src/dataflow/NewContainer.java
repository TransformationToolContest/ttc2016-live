/**
 */
package dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.NewContainer#getListField <em>List Field</em>}</li>
 *   <li>{@link dataflow.NewContainer#getContainerType <em>Container Type</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getNewContainer()
 * @model
 * @generated
 */
public interface NewContainer extends Element {
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
	 * @see dataflow.DataflowPackage#getNewContainer_ListField()
	 * @model
	 * @generated
	 */
	String getListField();

	/**
	 * Sets the value of the '{@link dataflow.NewContainer#getListField <em>List Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Field</em>' attribute.
	 * @see #getListField()
	 * @generated
	 */
	void setListField(String value);

	/**
	 * Returns the value of the '<em><b>Container Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dataflow.ContainerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type</em>' attribute.
	 * @see dataflow.ContainerType
	 * @see #setContainerType(ContainerType)
	 * @see dataflow.DataflowPackage#getNewContainer_ContainerType()
	 * @model
	 * @generated
	 */
	ContainerType getContainerType();

	/**
	 * Sets the value of the '{@link dataflow.NewContainer#getContainerType <em>Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Type</em>' attribute.
	 * @see dataflow.ContainerType
	 * @see #getContainerType()
	 * @generated
	 */
	void setContainerType(ContainerType value);

} // NewContainer
