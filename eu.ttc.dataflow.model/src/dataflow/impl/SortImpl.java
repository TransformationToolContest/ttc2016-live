/**
 */
package dataflow.impl;

import dataflow.DataflowPackage;
import dataflow.Sort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataflow.impl.SortImpl#getSortByField <em>Sort By Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortImpl extends ElementImpl implements Sort {
	/**
	 * The default value of the '{@link #getSortByField() <em>Sort By Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortByField()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_BY_FIELD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSortByField() <em>Sort By Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortByField()
	 * @generated
	 * @ordered
	 */
	protected String sortByField = SORT_BY_FIELD_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortByField() {
		return sortByField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortByField(String newSortByField) {
		String oldSortByField = sortByField;
		sortByField = newSortByField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.SORT__SORT_BY_FIELD, oldSortByField, sortByField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataflowPackage.SORT__SORT_BY_FIELD:
				return getSortByField();
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
			case DataflowPackage.SORT__SORT_BY_FIELD:
				setSortByField((String)newValue);
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
			case DataflowPackage.SORT__SORT_BY_FIELD:
				setSortByField(SORT_BY_FIELD_EDEFAULT);
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
			case DataflowPackage.SORT__SORT_BY_FIELD:
				return SORT_BY_FIELD_EDEFAULT == null ? sortByField != null : !SORT_BY_FIELD_EDEFAULT.equals(sortByField);
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
		result.append(" (sortByField: ");
		result.append(sortByField);
		result.append(')');
		return result.toString();
	}

} //SortImpl
