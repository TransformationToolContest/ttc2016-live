/**
 */
package dataflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataflow.AllInstances#getField <em>Field</em>}</li>
 *   <li>{@link dataflow.AllInstances#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link dataflow.AllInstances#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see dataflow.DataflowPackage#getAllInstances()
 * @model
 * @generated
 */
public interface AllInstances extends Element {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see dataflow.DataflowPackage#getAllInstances_Field()
	 * @model required="true"
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link dataflow.AllInstances#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #isSetNsURI()
	 * @see #unsetNsURI()
	 * @see #setNsURI(String)
	 * @see dataflow.DataflowPackage#getAllInstances_NsURI()
	 * @model unsettable="true"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link dataflow.AllInstances#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #isSetNsURI()
	 * @see #unsetNsURI()
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Unsets the value of the '{@link dataflow.AllInstances#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNsURI()
	 * @see #getNsURI()
	 * @see #setNsURI(String)
	 * @generated
	 */
	void unsetNsURI();

	/**
	 * Returns whether the value of the '{@link dataflow.AllInstances#getNsURI <em>Ns URI</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ns URI</em>' attribute is set.
	 * @see #unsetNsURI()
	 * @see #getNsURI()
	 * @see #setNsURI(String)
	 * @generated
	 */
	boolean isSetNsURI();

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see dataflow.DataflowPackage#getAllInstances_TypeName()
	 * @model required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link dataflow.AllInstances#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // AllInstances
