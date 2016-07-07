/**
 */
package eu.ttc.dataflow.model.launchConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.Configuration#getDataflow <em>Dataflow</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.Configuration#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
{
	/**
	 * Returns the value of the '<em><b>Dataflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataflow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflow</em>' containment reference.
	 * @see #setDataflow(Dataflow)
	 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getConfiguration_Dataflow()
	 * @model containment="true"
	 * @generated
	 */
	Dataflow getDataflow();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.launchConfiguration.Configuration#getDataflow <em>Dataflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataflow</em>' containment reference.
	 * @see #getDataflow()
	 * @generated
	 */
	void setDataflow(Dataflow value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link eu.ttc.dataflow.model.launchConfiguration.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getConfiguration_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

} // Configuration
