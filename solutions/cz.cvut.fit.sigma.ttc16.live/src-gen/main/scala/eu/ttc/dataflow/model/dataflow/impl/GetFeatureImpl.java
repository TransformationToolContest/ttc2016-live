/**
 */
package eu.ttc.dataflow.model.dataflow.impl;

import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.dataflow.GetFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.GetFeatureImpl#getObjectField <em>Object Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.GetFeatureImpl#getValueField <em>Value Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.GetFeatureImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetFeatureImpl extends ElementImpl implements GetFeature
{
	/**
	 * The default value of the '{@link #getObjectField() <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectField()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectField() <em>Object Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectField()
	 * @generated
	 * @ordered
	 */
	protected String objectField = OBJECT_FIELD_EDEFAULT;

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
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected String feature = FEATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetFeatureImpl()
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
		return DataflowPackage.Literals.GET_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectField()
	{
		return objectField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectField(String newObjectField)
	{
		String oldObjectField = objectField;
		objectField = newObjectField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.GET_FEATURE__OBJECT_FIELD, oldObjectField, objectField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueField()
	{
		return valueField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueField(String newValueField)
	{
		String oldValueField = valueField;
		valueField = newValueField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.GET_FEATURE__VALUE_FIELD, oldValueField, valueField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeature()
	{
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(String newFeature)
	{
		String oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.GET_FEATURE__FEATURE, oldFeature, feature));
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
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				return getObjectField();
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				return getValueField();
			case DataflowPackage.GET_FEATURE__FEATURE:
				return getFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				setObjectField((String)newValue);
				return;
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				setValueField((String)newValue);
				return;
			case DataflowPackage.GET_FEATURE__FEATURE:
				setFeature((String)newValue);
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
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				setObjectField(OBJECT_FIELD_EDEFAULT);
				return;
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				setValueField(VALUE_FIELD_EDEFAULT);
				return;
			case DataflowPackage.GET_FEATURE__FEATURE:
				setFeature(FEATURE_EDEFAULT);
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
			case DataflowPackage.GET_FEATURE__OBJECT_FIELD:
				return OBJECT_FIELD_EDEFAULT == null ? objectField != null : !OBJECT_FIELD_EDEFAULT.equals(objectField);
			case DataflowPackage.GET_FEATURE__VALUE_FIELD:
				return VALUE_FIELD_EDEFAULT == null ? valueField != null : !VALUE_FIELD_EDEFAULT.equals(valueField);
			case DataflowPackage.GET_FEATURE__FEATURE:
				return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
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
		result.append(" (objectField: ");
		result.append(objectField);
		result.append(", valueField: ");
		result.append(valueField);
		result.append(", feature: ");
		result.append(feature);
		result.append(')');
		return result.toString();
	}

} //GetFeatureImpl
