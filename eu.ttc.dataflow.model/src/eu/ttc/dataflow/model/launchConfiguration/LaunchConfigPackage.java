/**
 */
package eu.ttc.dataflow.model.launchConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.ttc.dataflow.model.launchConfiguration.LaunchConfigFactory
 * @model kind="package"
 * @generated
 */
public interface LaunchConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "launchConfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://transformation-tool-contest.eu/2016/launch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaunchConfigPackage eINSTANCE = eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.launchConfiguration.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.launchConfiguration.impl.ConfigurationImpl
	 * @see eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Dataflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DATAFLOW = 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MODELS = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.launchConfiguration.impl.DataflowImpl <em>Dataflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.launchConfiguration.impl.DataflowImpl
	 * @see eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl#getDataflow()
	 * @generated
	 */
	int DATAFLOW = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Dataflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dataflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl
	 * @see eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__METAMODELS = 2;

	/**
	 * The feature id for the '<em><b>Read On Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__READ_ON_LOAD = 3;

	/**
	 * The feature id for the '<em><b>Store On Disposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STORE_ON_DISPOSAL = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.launchConfiguration.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.launchConfiguration.impl.MetamodelImpl
	 * @see eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.launchConfiguration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.launchConfiguration.Configuration#getDataflow <em>Dataflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataflow</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Configuration#getDataflow()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Dataflow();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.ttc.dataflow.model.launchConfiguration.Configuration#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Configuration#getModels()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Models();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.launchConfiguration.Dataflow <em>Dataflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataflow</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Dataflow
	 * @generated
	 */
	EClass getDataflow();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.launchConfiguration.Dataflow#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Dataflow#getLocation()
	 * @see #getDataflow()
	 * @generated
	 */
	EAttribute getDataflow_Location();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.launchConfiguration.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.launchConfiguration.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.launchConfiguration.Model#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Model#getLocation()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.ttc.dataflow.model.launchConfiguration.Model#getMetamodels <em>Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodels</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Model#getMetamodels()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Metamodels();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.launchConfiguration.Model#isReadOnLoad <em>Read On Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read On Load</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Model#isReadOnLoad()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ReadOnLoad();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.launchConfiguration.Model#isStoreOnDisposal <em>Store On Disposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store On Disposal</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Model#isStoreOnDisposal()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_StoreOnDisposal();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.launchConfiguration.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.launchConfiguration.Metamodel#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see eu.ttc.dataflow.model.launchConfiguration.Metamodel#getLocation()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Location();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LaunchConfigFactory getLaunchConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.launchConfiguration.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.launchConfiguration.impl.ConfigurationImpl
		 * @see eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Dataflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DATAFLOW = eINSTANCE.getConfiguration_Dataflow();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MODELS = eINSTANCE.getConfiguration_Models();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.launchConfiguration.impl.DataflowImpl <em>Dataflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.launchConfiguration.impl.DataflowImpl
		 * @see eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl#getDataflow()
		 * @generated
		 */
		EClass DATAFLOW = eINSTANCE.getDataflow();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFLOW__LOCATION = eINSTANCE.getDataflow_Location();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.launchConfiguration.impl.ModelImpl
		 * @see eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__LOCATION = eINSTANCE.getModel_Location();

		/**
		 * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__METAMODELS = eINSTANCE.getModel_Metamodels();

		/**
		 * The meta object literal for the '<em><b>Read On Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__READ_ON_LOAD = eINSTANCE.getModel_ReadOnLoad();

		/**
		 * The meta object literal for the '<em><b>Store On Disposal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__STORE_ON_DISPOSAL = eINSTANCE.getModel_StoreOnDisposal();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.launchConfiguration.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.launchConfiguration.impl.MetamodelImpl
		 * @see eu.ttc.dataflow.model.launchConfiguration.impl.LaunchConfigPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__LOCATION = eINSTANCE.getMetamodel_Location();

	}

} //LaunchConfigPackage
