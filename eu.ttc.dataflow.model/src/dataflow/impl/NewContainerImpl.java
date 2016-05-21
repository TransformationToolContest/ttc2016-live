/**
 */
package dataflow.impl;

import dataflow.ContainerType;
import dataflow.DataflowPackage;
import dataflow.FieldReference;
import dataflow.NewContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataflow.impl.NewContainerImpl#getListField <em>List Field</em>}</li>
 *   <li>{@link dataflow.impl.NewContainerImpl#getContainerType <em>Container Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewContainerImpl extends ElementImpl implements NewContainer {
	/**
	 * The cached value of the '{@link #getListField() <em>List Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListField()
	 * @generated
	 * @ordered
	 */
	protected FieldReference listField;

	/**
	 * The default value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerType CONTAINER_TYPE_EDEFAULT = ContainerType.LIST;

	/**
	 * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected ContainerType containerType = CONTAINER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.NEW_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldReference getListField() {
		return listField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListField(FieldReference newListField, NotificationChain msgs) {
		FieldReference oldListField = listField;
		listField = newListField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_CONTAINER__LIST_FIELD, oldListField, newListField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListField(FieldReference newListField) {
		if (newListField != listField) {
			NotificationChain msgs = null;
			if (listField != null)
				msgs = ((InternalEObject)listField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.NEW_CONTAINER__LIST_FIELD, null, msgs);
			if (newListField != null)
				msgs = ((InternalEObject)newListField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.NEW_CONTAINER__LIST_FIELD, null, msgs);
			msgs = basicSetListField(newListField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_CONTAINER__LIST_FIELD, newListField, newListField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType getContainerType() {
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerType(ContainerType newContainerType) {
		ContainerType oldContainerType = containerType;
		containerType = newContainerType == null ? CONTAINER_TYPE_EDEFAULT : newContainerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE, oldContainerType, containerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				return basicSetListField(null, msgs);
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
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				return getListField();
			case DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE:
				return getContainerType();
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
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				setListField((FieldReference)newValue);
				return;
			case DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE:
				setContainerType((ContainerType)newValue);
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
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				setListField((FieldReference)null);
				return;
			case DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE:
				setContainerType(CONTAINER_TYPE_EDEFAULT);
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
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				return listField != null;
			case DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE:
				return containerType != CONTAINER_TYPE_EDEFAULT;
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
		result.append(" (containerType: ");
		result.append(containerType);
		result.append(')');
		return result.toString();
	}

} //NewContainerImpl
