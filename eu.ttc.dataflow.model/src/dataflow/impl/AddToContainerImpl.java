/**
 */
package dataflow.impl;

import dataflow.AddToContainer;
import dataflow.DataflowPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add To Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataflow.impl.AddToContainerImpl#getListField <em>List Field</em>}</li>
 *   <li>{@link dataflow.impl.AddToContainerImpl#getValueField <em>Value Field</em>}</li>
 *   <li>{@link dataflow.impl.AddToContainerImpl#getPositionField <em>Position Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddToContainerImpl extends ElementImpl implements AddToContainer {
	/**
	 * The default value of the '{@link #getListField() <em>List Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListField()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListField() <em>List Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListField()
	 * @generated
	 * @ordered
	 */
	protected String listField = LIST_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueField() <em>Value Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueField()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueField() <em>Value Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueField()
	 * @generated
	 * @ordered
	 */
	protected String valueField = VALUE_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionField() <em>Position Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionField()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionField() <em>Position Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionField()
	 * @generated
	 * @ordered
	 */
	protected String positionField = POSITION_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddToContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.ADD_TO_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListField() {
		return listField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListField(String newListField) {
		String oldListField = listField;
		listField = newListField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD, oldListField, listField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueField() {
		return valueField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueField(String newValueField) {
		String oldValueField = valueField;
		valueField = newValueField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__VALUE_FIELD, oldValueField, valueField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositionField() {
		return positionField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionField(String newPositionField) {
		String oldPositionField = positionField;
		positionField = newPositionField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__POSITION_FIELD, oldPositionField, positionField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD:
				return getListField();
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_FIELD:
				return getValueField();
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_FIELD:
				return getPositionField();
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
			case DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD:
				setListField((String)newValue);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_FIELD:
				setValueField((String)newValue);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_FIELD:
				setPositionField((String)newValue);
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
			case DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD:
				setListField(LIST_FIELD_EDEFAULT);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_FIELD:
				setValueField(VALUE_FIELD_EDEFAULT);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_FIELD:
				setPositionField(POSITION_FIELD_EDEFAULT);
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
			case DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD:
				return LIST_FIELD_EDEFAULT == null ? listField != null : !LIST_FIELD_EDEFAULT.equals(listField);
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_FIELD:
				return VALUE_FIELD_EDEFAULT == null ? valueField != null : !VALUE_FIELD_EDEFAULT.equals(valueField);
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_FIELD:
				return POSITION_FIELD_EDEFAULT == null ? positionField != null : !POSITION_FIELD_EDEFAULT.equals(positionField);
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
		result.append(" (listField: ");
		result.append(listField);
		result.append(", valueField: ");
		result.append(valueField);
		result.append(", positionField: ");
		result.append(positionField);
		result.append(')');
		return result.toString();
	}

} //AddToContainerImpl
