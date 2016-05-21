/**
 */
package dataflow.impl;

import dataflow.DataflowPackage;
import dataflow.Element;
import dataflow.Expression;
import dataflow.Filter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataflow.impl.FilterImpl#getFilterBy <em>Filter By</em>}</li>
 *   <li>{@link dataflow.impl.FilterImpl#getRejectTarget <em>Reject Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends ElementImpl implements Filter {
	/**
	 * The cached value of the '{@link #getFilterBy() <em>Filter By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterBy()
	 * @generated
	 * @ordered
	 */
	protected Expression filterBy;

	/**
	 * The cached value of the '{@link #getRejectTarget() <em>Reject Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectTarget()
	 * @generated
	 * @ordered
	 */
	protected Element rejectTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFilterBy() {
		return filterBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterBy(Expression newFilterBy, NotificationChain msgs) {
		Expression oldFilterBy = filterBy;
		filterBy = newFilterBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.FILTER__FILTER_BY, oldFilterBy, newFilterBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterBy(Expression newFilterBy) {
		if (newFilterBy != filterBy) {
			NotificationChain msgs = null;
			if (filterBy != null)
				msgs = ((InternalEObject)filterBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.FILTER__FILTER_BY, null, msgs);
			if (newFilterBy != null)
				msgs = ((InternalEObject)newFilterBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.FILTER__FILTER_BY, null, msgs);
			msgs = basicSetFilterBy(newFilterBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.FILTER__FILTER_BY, newFilterBy, newFilterBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRejectTarget() {
		if (rejectTarget != null && rejectTarget.eIsProxy()) {
			InternalEObject oldRejectTarget = (InternalEObject)rejectTarget;
			rejectTarget = (Element)eResolveProxy(oldRejectTarget);
			if (rejectTarget != oldRejectTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataflowPackage.FILTER__REJECT_TARGET, oldRejectTarget, rejectTarget));
			}
		}
		return rejectTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetRejectTarget() {
		return rejectTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRejectTarget(Element newRejectTarget) {
		Element oldRejectTarget = rejectTarget;
		rejectTarget = newRejectTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.FILTER__REJECT_TARGET, oldRejectTarget, rejectTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataflowPackage.FILTER__FILTER_BY:
				return basicSetFilterBy(null, msgs);
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
			case DataflowPackage.FILTER__FILTER_BY:
				return getFilterBy();
			case DataflowPackage.FILTER__REJECT_TARGET:
				if (resolve) return getRejectTarget();
				return basicGetRejectTarget();
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
			case DataflowPackage.FILTER__FILTER_BY:
				setFilterBy((Expression)newValue);
				return;
			case DataflowPackage.FILTER__REJECT_TARGET:
				setRejectTarget((Element)newValue);
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
			case DataflowPackage.FILTER__FILTER_BY:
				setFilterBy((Expression)null);
				return;
			case DataflowPackage.FILTER__REJECT_TARGET:
				setRejectTarget((Element)null);
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
			case DataflowPackage.FILTER__FILTER_BY:
				return filterBy != null;
			case DataflowPackage.FILTER__REJECT_TARGET:
				return rejectTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterImpl
