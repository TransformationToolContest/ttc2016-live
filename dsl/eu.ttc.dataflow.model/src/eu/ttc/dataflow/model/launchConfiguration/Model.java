/**
 */
package eu.ttc.dataflow.model.launchConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.Model#getName <em>Name</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.Model#getLocation <em>Location</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.Model#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.Model#isReadOnLoad <em>Read On Load</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.Model#isStoreOnDisposal <em>Store On Disposal</em>}</li>
 * </ul>
 *
 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.launchConfiguration.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getModel_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.launchConfiguration.Model#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link eu.ttc.dataflow.model.launchConfiguration.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodels</em>' containment reference list.
	 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getModel_Metamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getMetamodels();

	/**
	 * Returns the value of the '<em><b>Read On Load</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read On Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read On Load</em>' attribute.
	 * @see #setReadOnLoad(boolean)
	 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getModel_ReadOnLoad()
	 * @model default="true"
	 * @generated
	 */
	boolean isReadOnLoad();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.launchConfiguration.Model#isReadOnLoad <em>Read On Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read On Load</em>' attribute.
	 * @see #isReadOnLoad()
	 * @generated
	 */
	void setReadOnLoad(boolean value);

	/**
	 * Returns the value of the '<em><b>Store On Disposal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store On Disposal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store On Disposal</em>' attribute.
	 * @see #setStoreOnDisposal(boolean)
	 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getModel_StoreOnDisposal()
	 * @model default="false"
	 * @generated
	 */
	boolean isStoreOnDisposal();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.launchConfiguration.Model#isStoreOnDisposal <em>Store On Disposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store On Disposal</em>' attribute.
	 * @see #isStoreOnDisposal()
	 * @generated
	 */
	void setStoreOnDisposal(boolean value);

} // Model
