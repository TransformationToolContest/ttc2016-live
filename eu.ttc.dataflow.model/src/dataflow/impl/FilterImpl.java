/**
 */
package dataflow.impl;

import dataflow.DataflowPackage;
import dataflow.Element;
import dataflow.Filter;

import org.eclipse.emf.common.notify.Notification;
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
 *   <li>{@link dataflow.impl.FilterImpl#getFilterByField <em>Filter By Field</em>}</li>
 *   <li>{@link dataflow.impl.FilterImpl#getRejectTarget <em>Reject Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends ElementImpl implements Filter {
	/**
	 * The default value of the '{@link #getFilterByField() <em>Filter By Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterByField()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_BY_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterByField() <em>Filter By Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterByField()
	 * @generated
	 * @ordered
	 */
	protected String filterByField = FILTER_BY_FIELD_EDEFAULT;

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
	public String getFilterByField() {
		return filterByField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterByField(String newFilterByField) {
		String oldFilterByField = filterByField;
		filterByField = newFilterByField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.FILTER__FILTER_BY_FIELD, oldFilterByField, filterByField));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataflowPackage.FILTER__FILTER_BY_FIELD:
				return getFilterByField();
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
			case DataflowPackage.FILTER__FILTER_BY_FIELD:
				setFilterByField((String)newValue);
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
			case DataflowPackage.FILTER__FILTER_BY_FIELD:
				setFilterByField(FILTER_BY_FIELD_EDEFAULT);
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
			case DataflowPackage.FILTER__FILTER_BY_FIELD:
				return FILTER_BY_FIELD_EDEFAULT == null ? filterByField != null : !FILTER_BY_FIELD_EDEFAULT.equals(filterByField);
			case DataflowPackage.FILTER__REJECT_TARGET:
				return rejectTarget != null;
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
		result.append(" (filterByField: ");
		result.append(filterByField);
		result.append(')');
		return result.toString();
	}

} //FilterImpl
