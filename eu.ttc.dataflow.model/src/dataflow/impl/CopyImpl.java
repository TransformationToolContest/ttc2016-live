/**
 */
package dataflow.impl;

import dataflow.Copy;
import dataflow.DataflowPackage;
import dataflow.Element;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataflow.impl.CopyImpl#getCopyTarget <em>Copy Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyImpl extends ElementImpl implements Copy {
	/**
	 * The cached value of the '{@link #getCopyTarget() <em>Copy Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyTarget()
	 * @generated
	 * @ordered
	 */
	protected Element copyTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.COPY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getCopyTarget() {
		if (copyTarget != null && copyTarget.eIsProxy()) {
			InternalEObject oldCopyTarget = (InternalEObject)copyTarget;
			copyTarget = (Element)eResolveProxy(oldCopyTarget);
			if (copyTarget != oldCopyTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataflowPackage.COPY__COPY_TARGET, oldCopyTarget, copyTarget));
			}
		}
		return copyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetCopyTarget() {
		return copyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyTarget(Element newCopyTarget) {
		Element oldCopyTarget = copyTarget;
		copyTarget = newCopyTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.COPY__COPY_TARGET, oldCopyTarget, copyTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataflowPackage.COPY__COPY_TARGET:
				if (resolve) return getCopyTarget();
				return basicGetCopyTarget();
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
			case DataflowPackage.COPY__COPY_TARGET:
				setCopyTarget((Element)newValue);
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
			case DataflowPackage.COPY__COPY_TARGET:
				setCopyTarget((Element)null);
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
			case DataflowPackage.COPY__COPY_TARGET:
				return copyTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //CopyImpl
