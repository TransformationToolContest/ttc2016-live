/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.NewInstance#getInstanceField <em>Instance Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.NewInstance#getKey <em>Key</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.NewInstance#getModel <em>Model</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.NewInstance#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.NewInstance#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getNewInstance()
 * @model
 * @generated
 */
public interface NewInstance extends Element
{
	/**
	 * Returns the value of the '<em><b>Instance Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Field</em>' attribute.
	 * @see #setInstanceField(String)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getNewInstance_InstanceField()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceField();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getInstanceField <em>Instance Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Field</em>' attribute.
	 * @see #getInstanceField()
	 * @generated
	 */
	void setInstanceField(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Expression)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getNewInstance_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getKey();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Expression value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #isSetModel()
	 * @see #unsetModel()
	 * @see #setModel(String)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getNewInstance_Model()
	 * @model unsettable="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #isSetModel()
	 * @see #unsetModel()
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Unsets the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModel()
	 * @see #getModel()
	 * @see #setModel(String)
	 * @generated
	 */
	void unsetModel();

	/**
	 * Returns whether the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getModel <em>Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model</em>' attribute is set.
	 * @see #unsetModel()
	 * @see #getModel()
	 * @see #setModel(String)
	 * @generated
	 */
	boolean isSetModel();

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #isSetPackageName()
	 * @see #unsetPackageName()
	 * @see #setPackageName(String)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getNewInstance_PackageName()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #isSetPackageName()
	 * @see #unsetPackageName()
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Unsets the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPackageName()
	 * @see #getPackageName()
	 * @see #setPackageName(String)
	 * @generated
	 */
	void unsetPackageName();

	/**
	 * Returns whether the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getPackageName <em>Package Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Package Name</em>' attribute is set.
	 * @see #unsetPackageName()
	 * @see #getPackageName()
	 * @see #setPackageName(String)
	 * @generated
	 */
	boolean isSetPackageName();

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
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getNewInstance_TypeName()
	 * @model required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // NewInstance
