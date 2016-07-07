/**
 */
package eu.ttc.dataflow.model.dataflow.impl;

import eu.ttc.dataflow.model.dataflow.ContainerType;
import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.dataflow.NewContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.NewContainerImpl#getListField <em>List Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.NewContainerImpl#getContainerType <em>Container Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewContainerImpl extends ElementImpl implements NewContainer
{
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
	 * The default value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerType CONTAINER_TYPE_EDEFAULT = ContainerType.LIST;

	/**
	 * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected ContainerType containerType = CONTAINER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewContainerImpl()
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
		return DataflowPackage.Literals.NEW_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListField()
	{
		return listField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListField(String newListField)
	{
		String oldListField = listField;
		listField = newListField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_CONTAINER__LIST_FIELD, oldListField, listField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType getContainerType()
	{
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerType(ContainerType newContainerType)
	{
		ContainerType oldContainerType = containerType;
		containerType = newContainerType == null ? CONTAINER_TYPE_EDEFAULT : newContainerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE, oldContainerType, containerType));
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
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				return getListField();
			case DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE:
				return getContainerType();
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
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				setListField((String)newValue);
				return;
			case DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE:
				setContainerType((ContainerType)newValue);
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
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				setListField(LIST_FIELD_EDEFAULT);
				return;
			case DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE:
				setContainerType(CONTAINER_TYPE_EDEFAULT);
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
			case DataflowPackage.NEW_CONTAINER__LIST_FIELD:
				return LIST_FIELD_EDEFAULT == null ? listField != null : !LIST_FIELD_EDEFAULT.equals(listField);
			case DataflowPackage.NEW_CONTAINER__CONTAINER_TYPE:
				return containerType != CONTAINER_TYPE_EDEFAULT;
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
		result.append(" (listField: ");
		result.append(listField);
		result.append(", containerType: ");
		result.append(containerType);
		result.append(')');
		return result.toString();
	}

} //NewContainerImpl
