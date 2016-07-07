/**
 */
package eu.ttc.dataflow.model.launchConfiguration.impl;

import eu.ttc.dataflow.model.launchConfiguration.Configuration;
import eu.ttc.dataflow.model.launchConfiguration.Dataflow;
import eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage;
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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.impl.ConfigurationImpl#getDataflow <em>Dataflow</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.launchConfiguration.impl.ConfigurationImpl#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration
{
	/**
	 * The cached value of the '{@link #getDataflow() <em>Dataflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataflow()
	 * @generated
	 * @ordered
	 */
	protected Dataflow dataflow;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl()
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
		return LaunchConfigPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataflow getDataflow()
	{
		return dataflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataflow(Dataflow newDataflow, NotificationChain msgs)
	{
		Dataflow oldDataflow = dataflow;
		dataflow = newDataflow;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaunchConfigPackage.CONFIGURATION__DATAFLOW, oldDataflow, newDataflow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataflow(Dataflow newDataflow)
	{
		if (newDataflow != dataflow)
		{
			NotificationChain msgs = null;
			if (dataflow != null)
				msgs = ((InternalEObject)dataflow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaunchConfigPackage.CONFIGURATION__DATAFLOW, null, msgs);
			if (newDataflow != null)
				msgs = ((InternalEObject)newDataflow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaunchConfigPackage.CONFIGURATION__DATAFLOW, null, msgs);
			msgs = basicSetDataflow(newDataflow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchConfigPackage.CONFIGURATION__DATAFLOW, newDataflow, newDataflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels()
	{
		if (models == null)
		{
			models = new EObjectContainmentEList<Model>(Model.class, this, LaunchConfigPackage.CONFIGURATION__MODELS);
		}
		return models;
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
			case LaunchConfigPackage.CONFIGURATION__DATAFLOW:
				return basicSetDataflow(null, msgs);
			case LaunchConfigPackage.CONFIGURATION__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
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
			case LaunchConfigPackage.CONFIGURATION__DATAFLOW:
				return getDataflow();
			case LaunchConfigPackage.CONFIGURATION__MODELS:
				return getModels();
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
			case LaunchConfigPackage.CONFIGURATION__DATAFLOW:
				setDataflow((Dataflow)newValue);
				return;
			case LaunchConfigPackage.CONFIGURATION__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
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
			case LaunchConfigPackage.CONFIGURATION__DATAFLOW:
				setDataflow((Dataflow)null);
				return;
			case LaunchConfigPackage.CONFIGURATION__MODELS:
				getModels().clear();
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
			case LaunchConfigPackage.CONFIGURATION__DATAFLOW:
				return dataflow != null;
			case LaunchConfigPackage.CONFIGURATION__MODELS:
				return models != null && !models.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
