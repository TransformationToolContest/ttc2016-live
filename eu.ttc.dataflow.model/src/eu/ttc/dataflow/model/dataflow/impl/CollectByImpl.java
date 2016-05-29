/**
 */
package eu.ttc.dataflow.model.dataflow.impl;

import eu.ttc.dataflow.model.dataflow.CollectBy;
import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.dataflow.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collect By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.CollectByImpl#getElementField <em>Element Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.CollectByImpl#getCollectBy <em>Collect By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectByImpl extends ElementImpl implements CollectBy {
	/**
	 * The default value of the '{@link #getElementField() <em>Element Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementField()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementField() <em>Element Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementField()
	 * @generated
	 * @ordered
	 */
	protected String elementField = ELEMENT_FIELD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollectBy() <em>Collect By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectBy()
	 * @generated
	 * @ordered
	 */
	protected Expression collectBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.COLLECT_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementField() {
		return elementField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementField(String newElementField) {
		String oldElementField = elementField;
		elementField = newElementField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.COLLECT_BY__ELEMENT_FIELD, oldElementField, elementField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCollectBy() {
		return collectBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectBy(Expression newCollectBy, NotificationChain msgs) {
		Expression oldCollectBy = collectBy;
		collectBy = newCollectBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.COLLECT_BY__COLLECT_BY, oldCollectBy, newCollectBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectBy(Expression newCollectBy) {
		if (newCollectBy != collectBy) {
			NotificationChain msgs = null;
			if (collectBy != null)
				msgs = ((InternalEObject)collectBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.COLLECT_BY__COLLECT_BY, null, msgs);
			if (newCollectBy != null)
				msgs = ((InternalEObject)newCollectBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.COLLECT_BY__COLLECT_BY, null, msgs);
			msgs = basicSetCollectBy(newCollectBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.COLLECT_BY__COLLECT_BY, newCollectBy, newCollectBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataflowPackage.COLLECT_BY__COLLECT_BY:
				return basicSetCollectBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataflowPackage.COLLECT_BY__ELEMENT_FIELD:
				return getElementField();
			case DataflowPackage.COLLECT_BY__COLLECT_BY:
				return getCollectBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataflowPackage.COLLECT_BY__ELEMENT_FIELD:
				setElementField((String)newValue);
				return;
			case DataflowPackage.COLLECT_BY__COLLECT_BY:
				setCollectBy((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataflowPackage.COLLECT_BY__ELEMENT_FIELD:
				setElementField(ELEMENT_FIELD_EDEFAULT);
				return;
			case DataflowPackage.COLLECT_BY__COLLECT_BY:
				setCollectBy((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataflowPackage.COLLECT_BY__ELEMENT_FIELD:
				return ELEMENT_FIELD_EDEFAULT == null ? elementField != null : !ELEMENT_FIELD_EDEFAULT.equals(elementField);
			case DataflowPackage.COLLECT_BY__COLLECT_BY:
				return collectBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (elementField: ");
		result.append(elementField);
		result.append(')');
		return result.toString();
	}

} //CollectByImpl
