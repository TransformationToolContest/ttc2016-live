/**
 */
package eu.ttc.dataflow.model.dataflow;

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
 *   <li>{@link eu.ttc.dataflow.model.dataflow.Model#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link eu.ttc.dataflow.model.dataflow.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Model
