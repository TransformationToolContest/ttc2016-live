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
 *   <li>{@link dataflow.impl.AddToContainerImpl#getPositionExpression <em>Position Expression</em>}</li>
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
	 * The default value of the '{@link #getPositionExpression() <em>Position Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionExpression() <em>Position Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionExpression()
	 * @generated
	 * @ordered
	 */
	protected String positionExpression = POSITION_EXPRESSION_EDEFAULT;

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
	public String getPositionExpression() {
		return positionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionExpression(String newPositionExpression) {
		String oldPositionExpression = positionExpression;
		positionExpression = newPositionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION, oldPositionExpression, positionExpression));
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
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION:
				return getPositionExpression();
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
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION:
				setPositionExpression((String)newValue);
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
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION:
				setPositionExpression(POSITION_EXPRESSION_EDEFAULT);
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
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION:
				return POSITION_EXPRESSION_EDEFAULT == null ? positionExpression != null : !POSITION_EXPRESSION_EDEFAULT.equals(positionExpression);
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
		result.append(", positionExpression: ");
		result.append(positionExpression);
		result.append(')');
		return result.toString();
	}

} //AddToContainerImpl
