/**
 */
package eu.ttc.dataflow.model.launchConfiguration.impl;

import eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage;
import eu.ttc.dataflow.model.launchConfiguration.Metamodel;
import eu.ttc.dataflow.model.launchConfiguration.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl#isReadOnLoad <em>Read On Load</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl#isStoreOnDisposal <em>Store On Disposal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetamodels() <em>Metamodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> metamodels;

	/**
	 * The default value of the '{@link #isReadOnLoad() <em>Read On Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnLoad()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ON_LOAD_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReadOnLoad() <em>Read On Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnLoad()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnLoad = READ_ON_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isStoreOnDisposal() <em>Store On Disposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStoreOnDisposal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STORE_ON_DISPOSAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStoreOnDisposal() <em>Store On Disposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStoreOnDisposal()
	 * @generated
	 * @ordered
	 */
	protected boolean storeOnDisposal = STORE_ON_DISPOSAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return LaunchConfigPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchConfigPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation()
	{
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation)
	{
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchConfigPackage.MODEL__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metamodel> getMetamodels()
	{
		if (metamodels == null)
		{
			metamodels = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, LaunchConfigPackage.MODEL__METAMODELS);
		}
		return metamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnLoad()
	{
		return readOnLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnLoad(boolean newReadOnLoad)
	{
		boolean oldReadOnLoad = readOnLoad;
		readOnLoad = newReadOnLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchConfigPackage.MODEL__READ_ON_LOAD, oldReadOnLoad, readOnLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStoreOnDisposal()
	{
		return storeOnDisposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreOnDisposal(boolean newStoreOnDisposal)
	{
		boolean oldStoreOnDisposal = storeOnDisposal;
		storeOnDisposal = newStoreOnDisposal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchConfigPackage.MODEL__STORE_ON_DISPOSAL, oldStoreOnDisposal, storeOnDisposal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case LaunchConfigPackage.MODEL__METAMODELS:
				return ((InternalEList<?>)getMetamodels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case LaunchConfigPackage.MODEL__NAME:
				return getName();
			case LaunchConfigPackage.MODEL__LOCATION:
				return getLocation();
			case LaunchConfigPackage.MODEL__METAMODELS:
				return getMetamodels();
			case LaunchConfigPackage.MODEL__READ_ON_LOAD:
				return isReadOnLoad();
			case LaunchConfigPackage.MODEL__STORE_ON_DISPOSAL:
				return isStoreOnDisposal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case LaunchConfigPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case LaunchConfigPackage.MODEL__LOCATION:
				setLocation((String)newValue);
				return;
			case LaunchConfigPackage.MODEL__METAMODELS:
				getMetamodels().clear();
				getMetamodels().addAll((Collection<? extends Metamodel>)newValue);
				return;
			case LaunchConfigPackage.MODEL__READ_ON_LOAD:
				setReadOnLoad((Boolean)newValue);
				return;
			case LaunchConfigPackage.MODEL__STORE_ON_DISPOSAL:
				setStoreOnDisposal((Boolean)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case LaunchConfigPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LaunchConfigPackage.MODEL__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case LaunchConfigPackage.MODEL__METAMODELS:
				getMetamodels().clear();
				return;
			case LaunchConfigPackage.MODEL__READ_ON_LOAD:
				setReadOnLoad(READ_ON_LOAD_EDEFAULT);
				return;
			case LaunchConfigPackage.MODEL__STORE_ON_DISPOSAL:
				setStoreOnDisposal(STORE_ON_DISPOSAL_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case LaunchConfigPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LaunchConfigPackage.MODEL__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case LaunchConfigPackage.MODEL__METAMODELS:
				return metamodels != null && !metamodels.isEmpty();
			case LaunchConfigPackage.MODEL__READ_ON_LOAD:
				return readOnLoad != READ_ON_LOAD_EDEFAULT;
			case LaunchConfigPackage.MODEL__STORE_ON_DISPOSAL:
				return storeOnDisposal != STORE_ON_DISPOSAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(", readOnLoad: ");
		result.append(readOnLoad);
		result.append(", storeOnDisposal: ");
		result.append(storeOnDisposal);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
