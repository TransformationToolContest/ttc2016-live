/**
 */
package eu.ttc.dataflow.model.dataflow.impl;

import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.dataflow.Expression;
import eu.ttc.dataflow.model.dataflow.NewInstance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl#getInstanceField <em>Instance Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl#getKey <em>Key</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewInstanceImpl extends ElementImpl implements NewInstance {
	/**
	 * The default value of the '{@link #getInstanceField() <em>Instance Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceField()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceField() <em>Instance Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceField()
	 * @generated
	 * @ordered
	 */
	protected String instanceField = INSTANCE_FIELD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Expression key;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * This is true if the Model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modelESet;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * This is true if the Package Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean packageNameESet;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataflowPackage.Literals.NEW_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceField() {
		return instanceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceField(String newInstanceField) {
		String oldInstanceField = instanceField;
		instanceField = newInstanceField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_INSTANCE__INSTANCE_FIELD, oldInstanceField, instanceField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(Expression newKey, NotificationChain msgs) {
		Expression oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_INSTANCE__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Expression newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.NEW_INSTANCE__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataflowPackage.NEW_INSTANCE__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_INSTANCE__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		boolean oldModelESet = modelESet;
		modelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_INSTANCE__MODEL, oldModel, model, !oldModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModel() {
		String oldModel = model;
		boolean oldModelESet = modelESet;
		model = MODEL_EDEFAULT;
		modelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DataflowPackage.NEW_INSTANCE__MODEL, oldModel, MODEL_EDEFAULT, oldModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModel() {
		return modelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		boolean oldPackageNameESet = packageNameESet;
		packageNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_INSTANCE__PACKAGE_NAME, oldPackageName, packageName, !oldPackageNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPackageName() {
		String oldPackageName = packageName;
		boolean oldPackageNameESet = packageNameESet;
		packageName = PACKAGE_NAME_EDEFAULT;
		packageNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DataflowPackage.NEW_INSTANCE__PACKAGE_NAME, oldPackageName, PACKAGE_NAME_EDEFAULT, oldPackageNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPackageName() {
		return packageNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataflowPackage.NEW_INSTANCE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataflowPackage.NEW_INSTANCE__KEY:
				return basicSetKey(null, msgs);
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
			case DataflowPackage.NEW_INSTANCE__INSTANCE_FIELD:
				return getInstanceField();
			case DataflowPackage.NEW_INSTANCE__KEY:
				return getKey();
			case DataflowPackage.NEW_INSTANCE__MODEL:
				return getModel();
			case DataflowPackage.NEW_INSTANCE__PACKAGE_NAME:
				return getPackageName();
			case DataflowPackage.NEW_INSTANCE__TYPE_NAME:
				return getTypeName();
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
			case DataflowPackage.NEW_INSTANCE__INSTANCE_FIELD:
				setInstanceField((String)newValue);
				return;
			case DataflowPackage.NEW_INSTANCE__KEY:
				setKey((Expression)newValue);
				return;
			case DataflowPackage.NEW_INSTANCE__MODEL:
				setModel((String)newValue);
				return;
			case DataflowPackage.NEW_INSTANCE__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case DataflowPackage.NEW_INSTANCE__TYPE_NAME:
				setTypeName((String)newValue);
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
			case DataflowPackage.NEW_INSTANCE__INSTANCE_FIELD:
				setInstanceField(INSTANCE_FIELD_EDEFAULT);
				return;
			case DataflowPackage.NEW_INSTANCE__KEY:
				setKey((Expression)null);
				return;
			case DataflowPackage.NEW_INSTANCE__MODEL:
				unsetModel();
				return;
			case DataflowPackage.NEW_INSTANCE__PACKAGE_NAME:
				unsetPackageName();
				return;
			case DataflowPackage.NEW_INSTANCE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
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
			case DataflowPackage.NEW_INSTANCE__INSTANCE_FIELD:
				return INSTANCE_FIELD_EDEFAULT == null ? instanceField != null : !INSTANCE_FIELD_EDEFAULT.equals(instanceField);
			case DataflowPackage.NEW_INSTANCE__KEY:
				return key != null;
			case DataflowPackage.NEW_INSTANCE__MODEL:
				return isSetModel();
			case DataflowPackage.NEW_INSTANCE__PACKAGE_NAME:
				return isSetPackageName();
			case DataflowPackage.NEW_INSTANCE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
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
		result.append(" (instanceField: ");
		result.append(instanceField);
		result.append(", model: ");
		if (modelESet) result.append(model); else result.append("<unset>");
		result.append(", packageName: ");
		if (packageNameESet) result.append(packageName); else result.append("<unset>");
		result.append(", typeName: ");
		result.append(typeName);
		result.append(')');
		return result.toString();
	}

} //NewInstanceImpl
