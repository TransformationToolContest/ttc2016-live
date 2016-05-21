/**
 */
package dataflow.impl;

import dataflow.DataflowPackage;
import dataflow.FieldReference;
import dataflow.GetFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataflow.impl.GetFeatureImpl#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link dataflow.impl.GetFeatureImpl#getValueField <em>Value Field</em>}</li>
 *   <li>{@link dataflow.impl.GetFeatureImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetFeatureImpl extends ElementImpl implements GetFeature {
	/**
	 * The cached value of the '{@link #getObjectField() <em>Object Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectField()
	 * @generated
	 * @ordered
	 */
	protected FieldReference objectField;

	/**
	 * The cached value of the '{@link #getValueField() <em>Value Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueField()
	 * @generated
	 * @ordered
	 */
	protected FieldReference valueField;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.GET_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldReference getObjectField() {
		return objectField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectField(FieldReference newObjectField, NotificationChain msgs) {
		FieldReference oldObjectField = objectField;
		objectField = newObjectField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.GET_FEATURE__OBJECT_FIELD, oldObjectField, newObjectField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectField(FieldReference newObjectField) {
		if (newObjectField != objectField) {
			NotificationChain msgs = null;
			if (objectField != null)
				msgs = ((InternalEObject)objectField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.GET_FEATURE__OBJECT_FIELD, null, msgs);
			if (newObjectField != null)
				msgs = ((InternalEObject)newObjectField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.GET_FEATURE__OBJECT_FIELD, null, msgs);
			msgs = basicSetObjectField(newObjectField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.GET_FEATURE__OBJECT_FIELD, newObjectField, newObjectField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldReference getValueField() {
		return valueField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueField(FieldReference newValueField, NotificationChain msgs) {
		FieldReference oldValueField = valueField;
		valueField = newValueField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.GET_FEATURE__VALUE_FIELD, oldValueField, newValueField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueField(FieldReference newValueField) {
		if (newValueField != valueField) {
			NotificationChain msgs = null;
			if (valueField != null)
				msgs = ((InternalEObject)valueField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.GET_FEATURE__VALUE_FIELD, null, msgs);
			if (newValueField != null)
				msgs = ((InternalEObject)newValueField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.GET_FEATURE__VALUE_FIELD, null, msgs);
			msgs = basicSetValueField(newValueField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.GET_FEATURE__VALUE_FIELD, newValueField, newValueField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataflowPackage.GET_FEATURE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.GET_FEATURE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				return basicSetObjectField(null, msgs);
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				return basicSetValueField(null, msgs);
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
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				return getObjectField();
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				return getValueField();
			case DataflowPackage.GET_FEATURE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				setObjectField((FieldReference)newValue);
				return;
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				setValueField((FieldReference)newValue);
				return;
			case DataflowPackage.GET_FEATURE__FEATURE:
				setFeature((EStructuralFeature)newValue);
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
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				setObjectField((FieldReference)null);
				return;
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				setValueField((FieldReference)null);
				return;
			case DataflowPackage.GET_FEATURE__FEATURE:
				setFeature((EStructuralFeature)null);
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
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				return objectField != null;
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				return valueField != null;
			case DataflowPackage.GET_FEATURE__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
	}

} //GetFeatureImpl
