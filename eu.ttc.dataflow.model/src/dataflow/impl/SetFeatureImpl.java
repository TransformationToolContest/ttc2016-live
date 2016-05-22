/**
 */
package dataflow.impl;

import dataflow.DataflowPackage;
import dataflow.Expression;
import dataflow.SetFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataflow.impl.SetFeatureImpl#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link dataflow.impl.SetFeatureImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dataflow.impl.SetFeatureImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetFeatureImpl extends ElementImpl implements SetFeature {
	/**
	 * The default value of the '{@link #getObjectField() <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectField()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectField() <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectField()
	 * @generated
	 * @ordered
	 */
	protected String objectField = OBJECT_FIELD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected String feature = FEATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.SET_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectField() {
		return objectField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectField(String newObjectField) {
		String oldObjectField = objectField;
		objectField = newObjectField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.SET_FEATURE__OBJECT_FIELD, oldObjectField, objectField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.SET_FEATURE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.SET_FEATURE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.SET_FEATURE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.SET_FEATURE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(String newFeature) {
		String oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.SET_FEATURE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataflowPackage.SET_FEATURE__VALUE:
				return basicSetValue(null, msgs);
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
			case DataflowPackage.SET_FEATURE__OBJECT_FIELD:
				return getObjectField();
			case DataflowPackage.SET_FEATURE__VALUE:
				return getValue();
			case DataflowPackage.SET_FEATURE__FEATURE:
				return getFeature();
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
			case DataflowPackage.SET_FEATURE__OBJECT_FIELD:
				setObjectField((String)newValue);
				return;
			case DataflowPackage.SET_FEATURE__VALUE:
				setValue((Expression)newValue);
				return;
			case DataflowPackage.SET_FEATURE__FEATURE:
				setFeature((String)newValue);
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
			case DataflowPackage.SET_FEATURE__OBJECT_FIELD:
				setObjectField(OBJECT_FIELD_EDEFAULT);
				return;
			case DataflowPackage.SET_FEATURE__VALUE:
				setValue((Expression)null);
				return;
			case DataflowPackage.SET_FEATURE__FEATURE:
				setFeature(FEATURE_EDEFAULT);
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
			case DataflowPackage.SET_FEATURE__OBJECT_FIELD:
				return OBJECT_FIELD_EDEFAULT == null ? objectField != null : !OBJECT_FIELD_EDEFAULT.equals(objectField);
			case DataflowPackage.SET_FEATURE__VALUE:
				return value != null;
			case DataflowPackage.SET_FEATURE__FEATURE:
				return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
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
		result.append(" (objectField: ");
		result.append(objectField);
		result.append(", feature: ");
		result.append(feature);
		result.append(')');
		return result.toString();
	}

} //SetFeatureImpl
