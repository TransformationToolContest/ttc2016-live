/**
 */
package dataflow.impl;

import dataflow.AddToContainer;
import dataflow.DataflowPackage;
import dataflow.Expression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link dataflow.impl.AddToContainerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dataflow.impl.AddToContainerImpl#getPosition <em>Position</em>}</li>
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Expression position;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Expression newPosition, NotificationChain msgs) {
		Expression oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Expression newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataflowPackage.ADD_TO_CONTAINER__VALUE:
				return basicSetValue(null, msgs);
			case DataflowPackage.ADD_TO_CONTAINER__POSITION:
				return basicSetPosition(null, msgs);
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
			case DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD:
				return getListField();
			case DataflowPackage.ADD_TO_CONTAINER__VALUE:
				return getValue();
			case DataflowPackage.ADD_TO_CONTAINER__POSITION:
				return getPosition();
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
			case DataflowPackage.ADD_TO_CONTAINER__VALUE:
				setValue((Expression)newValue);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__POSITION:
				setPosition((Expression)newValue);
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
			case DataflowPackage.ADD_TO_CONTAINER__VALUE:
				setValue((Expression)null);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__POSITION:
				setPosition((Expression)null);
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
			case DataflowPackage.ADD_TO_CONTAINER__VALUE:
				return value != null;
			case DataflowPackage.ADD_TO_CONTAINER__POSITION:
				return position != null;
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
		result.append(')');
		return result.toString();
	}

} //AddToContainerImpl
