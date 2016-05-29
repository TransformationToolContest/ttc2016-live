/**
 */
package eu.ttc.dataflow.model.launchConfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.Dataflow#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getDataflow()
 * @model
 * @generated
 */
public interface Dataflow extends EObject {
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
	 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage#getDataflow_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.launchConfiguration.Dataflow#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // Dataflow
