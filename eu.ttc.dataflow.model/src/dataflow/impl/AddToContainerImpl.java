/**
 */
package dataflow.impl;

import dataflow.AddToContainer;
import dataflow.DataflowPackage;
import dataflow.Expression;
import dataflow.FieldReference;

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
 *   <li>{@link dataflow.impl.AddToContainerImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link dataflow.impl.AddToContainerImpl#getPositionExpression <em>Position Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddToContainerImpl extends ElementImpl implements AddToContainer {
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
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression valueExpression;

	/**
	 * The cached value of the '{@link #getPositionExpression() <em>Position Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression positionExpression;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD, oldListField, newListField);
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
				msgs = ((InternalEObject)listField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD, null, msgs);
			if (newListField != null)
				msgs = ((InternalEObject)newListField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD, null, msgs);
			msgs = basicSetListField(newListField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD, newListField, newListField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueExpression(Expression newValueExpression, NotificationChain msgs) {
		Expression oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION, oldValueExpression, newValueExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueExpression(Expression newValueExpression) {
		if (newValueExpression != valueExpression) {
			NotificationChain msgs = null;
			if (valueExpression != null)
				msgs = ((InternalEObject)valueExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION, null, msgs);
			if (newValueExpression != null)
				msgs = ((InternalEObject)newValueExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION, null, msgs);
			msgs = basicSetValueExpression(newValueExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION, newValueExpression, newValueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPositionExpression() {
		return positionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionExpression(Expression newPositionExpression, NotificationChain msgs) {
		Expression oldPositionExpression = positionExpression;
		positionExpression = newPositionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION, oldPositionExpression, newPositionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionExpression(Expression newPositionExpression) {
		if (newPositionExpression != positionExpression) {
			NotificationChain msgs = null;
			if (positionExpression != null)
				msgs = ((InternalEObject)positionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION, null, msgs);
			if (newPositionExpression != null)
				msgs = ((InternalEObject)newPositionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION, null, msgs);
			msgs = basicSetPositionExpression(newPositionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION, newPositionExpression, newPositionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD:
				return basicSetListField(null, msgs);
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION:
				return basicSetValueExpression(null, msgs);
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION:
				return basicSetPositionExpression(null, msgs);
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
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION:
				return getValueExpression();
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
				setListField((FieldReference)newValue);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION:
				setValueExpression((Expression)newValue);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION:
				setPositionExpression((Expression)newValue);
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
				setListField((FieldReference)null);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION:
				setValueExpression((Expression)null);
				return;
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION:
				setPositionExpression((Expression)null);
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
				return listField != null;
			case DataflowPackage.ADD_TO_CONTAINER__VALUE_EXPRESSION:
				return valueExpression != null;
			case DataflowPackage.ADD_TO_CONTAINER__POSITION_EXPRESSION:
				return positionExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //AddToContainerImpl
