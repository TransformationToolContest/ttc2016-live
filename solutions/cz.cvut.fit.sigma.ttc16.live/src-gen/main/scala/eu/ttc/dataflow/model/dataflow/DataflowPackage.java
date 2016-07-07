/**
 */
package eu.ttc.dataflow.model.dataflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eu.ttc.dataflow.model.dataflow.DataflowFactory
 * @model kind="package"
 * @generated
 */
public interface DataflowPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://transformation-tool-contest.eu/2016/dataflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "df";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataflowPackage eINSTANCE = eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.ModelImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.ElementImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.AllInstancesImpl <em>All Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.AllInstancesImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getAllInstances()
	 * @generated
	 */
	int ALL_INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES__FIELD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES__MODEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES__PACKAGE_NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES__TYPE_NAME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>All Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>All Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCES_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl <em>New Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getNewInstance()
	 * @generated
	 */
	int NEW_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Instance Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE__INSTANCE_FIELD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE__KEY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE__MODEL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE__PACKAGE_NAME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE__TYPE_NAME = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>New Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>New Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INSTANCE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.FilterImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Filter By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_BY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reject Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__REJECT_TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.SortImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__SORT_BY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.CopyImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Copy Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__COPY_TARGET = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.ProductImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TARGET = ELEMENT__TARGET;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.GetFeatureImpl <em>Get Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.GetFeatureImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getGetFeature()
	 * @generated
	 */
	int GET_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Object Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE__OBJECT_FIELD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE__VALUE_FIELD = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE__FEATURE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Get Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Get Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.SetFeatureImpl <em>Set Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.SetFeatureImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getSetFeature()
	 * @generated
	 */
	int SET_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Object Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__OBJECT_FIELD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE__FEATURE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Set Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.NewContainerImpl <em>New Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.NewContainerImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getNewContainer()
	 * @generated
	 */
	int NEW_CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONTAINER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONTAINER__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>List Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONTAINER__LIST_FIELD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONTAINER__CONTAINER_TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONTAINER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>New Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONTAINER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.AddToContainerImpl <em>Add To Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.AddToContainerImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getAddToContainer()
	 * @generated
	 */
	int ADD_TO_CONTAINER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CONTAINER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CONTAINER__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>List Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CONTAINER__LIST_FIELD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CONTAINER__VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CONTAINER__POSITION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add To Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CONTAINER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Add To Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CONTAINER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.ForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.ForEachImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getForEach()
	 * @generated
	 */
	int FOR_EACH = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>List Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__LIST_FIELD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ITEM_FIELD = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__POSITION_FIELD = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.CollectByImpl <em>Collect By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.CollectByImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getCollectBy()
	 * @generated
	 */
	int COLLECT_BY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_BY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_BY__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Collect By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_BY__COLLECT_BY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collect By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_BY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collect By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_BY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.EvaluateImpl <em>Evaluate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.EvaluateImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getEvaluate()
	 * @generated
	 */
	int EVALUATE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__TARGET = ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__FIELD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__EXPRESSION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.ExpressionImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.IntegerLiteralImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.BooleanLiteralImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.RealLiteralImpl <em>Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.RealLiteralImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.StringLiteralImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.FieldReferenceImpl <em>Field Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.FieldReferenceImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getFieldReference()
	 * @generated
	 */
	int FIELD_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE__FIELD = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.UnaryOperationImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getUnaryOperation()
	 * @generated
	 */
	int UNARY_OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.BinaryOperationImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 22;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.FeatureCallImpl <em>Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.FeatureCallImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getFeatureCall()
	 * @generated
	 */
	int FEATURE_CALL = 23;

	/**
	 * The feature id for the '<em><b>Target Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__TARGET_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.impl.ConditionalExpressionImpl
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CONDITION_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__THEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.UnaryOperator
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.BinaryOperator
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 26;

	/**
	 * The meta object id for the '{@link eu.ttc.dataflow.model.dataflow.ContainerType <em>Container Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.ttc.dataflow.model.dataflow.ContainerType
	 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.ttc.dataflow.model.dataflow.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.ttc.dataflow.model.dataflow.Element#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Element#getTarget()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Target();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.AllInstances <em>All Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Instances</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AllInstances
	 * @generated
	 */
	EClass getAllInstances();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.AllInstances#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AllInstances#getField()
	 * @see #getAllInstances()
	 * @generated
	 */
	EAttribute getAllInstances_Field();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.AllInstances#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AllInstances#getModel()
	 * @see #getAllInstances()
	 * @generated
	 */
	EAttribute getAllInstances_Model();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.AllInstances#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AllInstances#getPackageName()
	 * @see #getAllInstances()
	 * @generated
	 */
	EAttribute getAllInstances_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.AllInstances#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AllInstances#getTypeName()
	 * @see #getAllInstances()
	 * @generated
	 */
	EAttribute getAllInstances_TypeName();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.NewInstance <em>New Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Instance</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewInstance
	 * @generated
	 */
	EClass getNewInstance();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getInstanceField <em>Instance Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewInstance#getInstanceField()
	 * @see #getNewInstance()
	 * @generated
	 */
	EAttribute getNewInstance_InstanceField();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewInstance#getKey()
	 * @see #getNewInstance()
	 * @generated
	 */
	EReference getNewInstance_Key();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewInstance#getModel()
	 * @see #getNewInstance()
	 * @generated
	 */
	EAttribute getNewInstance_Model();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewInstance#getPackageName()
	 * @see #getNewInstance()
	 * @generated
	 */
	EAttribute getNewInstance_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.NewInstance#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewInstance#getTypeName()
	 * @see #getNewInstance()
	 * @generated
	 */
	EAttribute getNewInstance_TypeName();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.Filter#getFilterBy <em>Filter By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter By</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Filter#getFilterBy()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_FilterBy();

	/**
	 * Returns the meta object for the reference '{@link eu.ttc.dataflow.model.dataflow.Filter#getRejectTarget <em>Reject Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reject Target</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Filter#getRejectTarget()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_RejectTarget();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.Sort#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort By</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Sort#getSortBy()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_SortBy();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for the reference '{@link eu.ttc.dataflow.model.dataflow.Copy#getCopyTarget <em>Copy Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copy Target</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Copy#getCopyTarget()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_CopyTarget();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.GetFeature <em>Get Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Feature</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.GetFeature
	 * @generated
	 */
	EClass getGetFeature();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.GetFeature#getObjectField <em>Object Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.GetFeature#getObjectField()
	 * @see #getGetFeature()
	 * @generated
	 */
	EAttribute getGetFeature_ObjectField();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.GetFeature#getValueField <em>Value Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.GetFeature#getValueField()
	 * @see #getGetFeature()
	 * @generated
	 */
	EAttribute getGetFeature_ValueField();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.GetFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.GetFeature#getFeature()
	 * @see #getGetFeature()
	 * @generated
	 */
	EAttribute getGetFeature_Feature();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.SetFeature <em>Set Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Feature</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.SetFeature
	 * @generated
	 */
	EClass getSetFeature();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.SetFeature#getObjectField <em>Object Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.SetFeature#getObjectField()
	 * @see #getSetFeature()
	 * @generated
	 */
	EAttribute getSetFeature_ObjectField();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.SetFeature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.SetFeature#getValue()
	 * @see #getSetFeature()
	 * @generated
	 */
	EReference getSetFeature_Value();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.SetFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.SetFeature#getFeature()
	 * @see #getSetFeature()
	 * @generated
	 */
	EAttribute getSetFeature_Feature();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.NewContainer <em>New Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Container</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewContainer
	 * @generated
	 */
	EClass getNewContainer();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.NewContainer#getListField <em>List Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewContainer#getListField()
	 * @see #getNewContainer()
	 * @generated
	 */
	EAttribute getNewContainer_ListField();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.NewContainer#getContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Type</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.NewContainer#getContainerType()
	 * @see #getNewContainer()
	 * @generated
	 */
	EAttribute getNewContainer_ContainerType();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.AddToContainer <em>Add To Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add To Container</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AddToContainer
	 * @generated
	 */
	EClass getAddToContainer();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getListField <em>List Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AddToContainer#getListField()
	 * @see #getAddToContainer()
	 * @generated
	 */
	EAttribute getAddToContainer_ListField();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AddToContainer#getValue()
	 * @see #getAddToContainer()
	 * @generated
	 */
	EReference getAddToContainer_Value();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.AddToContainer#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.AddToContainer#getPosition()
	 * @see #getAddToContainer()
	 * @generated
	 */
	EReference getAddToContainer_Position();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ForEach
	 * @generated
	 */
	EClass getForEach();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.ForEach#getListField <em>List Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ForEach#getListField()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_ListField();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.ForEach#getItemField <em>Item Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ForEach#getItemField()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_ItemField();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.ForEach#getPositionField <em>Position Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ForEach#getPositionField()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_PositionField();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.CollectBy <em>Collect By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collect By</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.CollectBy
	 * @generated
	 */
	EClass getCollectBy();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.CollectBy#getCollectBy <em>Collect By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collect By</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.CollectBy#getCollectBy()
	 * @see #getCollectBy()
	 * @generated
	 */
	EReference getCollectBy_CollectBy();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.Evaluate <em>Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Evaluate
	 * @generated
	 */
	EClass getEvaluate();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.Evaluate#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Evaluate#getField()
	 * @see #getEvaluate()
	 * @generated
	 */
	EAttribute getEvaluate_Field();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.Evaluate#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Evaluate#getExpression()
	 * @see #getEvaluate()
	 * @generated
	 */
	EReference getEvaluate_Expression();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.RealLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.RealLiteral#getValue()
	 * @see #getRealLiteral()
	 * @generated
	 */
	EAttribute getRealLiteral_Value();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.FieldReference <em>Field Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Reference</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.FieldReference
	 * @generated
	 */
	EClass getFieldReference();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.FieldReference#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.FieldReference#getField()
	 * @see #getFieldReference()
	 * @generated
	 */
	EAttribute getFieldReference_Field();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operation</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.UnaryOperation
	 * @generated
	 */
	EClass getUnaryOperation();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.UnaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.UnaryOperation#getOperator()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EAttribute getUnaryOperation_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.UnaryOperation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.UnaryOperation#getExpression()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EReference getUnaryOperation_Expression();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.BinaryOperation#getOperator()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EAttribute getBinaryOperation_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getLeftExpression <em>Left Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.BinaryOperation#getLeftExpression()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_LeftExpression();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.BinaryOperation#getRightExpression <em>Right Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.BinaryOperation#getRightExpression()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_RightExpression();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.FeatureCall <em>Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Call</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.FeatureCall
	 * @generated
	 */
	EClass getFeatureCall();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.FeatureCall#getTargetExpression <em>Target Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.FeatureCall#getTargetExpression()
	 * @see #getFeatureCall()
	 * @generated
	 */
	EReference getFeatureCall_TargetExpression();

	/**
	 * Returns the meta object for the attribute '{@link eu.ttc.dataflow.model.dataflow.FeatureCall#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.FeatureCall#getFeature()
	 * @see #getFeatureCall()
	 * @generated
	 */
	EAttribute getFeatureCall_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.ttc.dataflow.model.dataflow.FeatureCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.FeatureCall#getParameters()
	 * @see #getFeatureCall()
	 * @generated
	 */
	EReference getFeatureCall_Parameters();

	/**
	 * Returns the meta object for class '{@link eu.ttc.dataflow.model.dataflow.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.ConditionalExpression#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ConditionalExpression#getConditionExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ConditionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.ConditionalExpression#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ConditionalExpression#getThenExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link eu.ttc.dataflow.model.dataflow.ConditionalExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ConditionalExpression#getElseExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ElseExpression();

	/**
	 * Returns the meta object for enum '{@link eu.ttc.dataflow.model.dataflow.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link eu.ttc.dataflow.model.dataflow.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link eu.ttc.dataflow.model.dataflow.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Type</em>'.
	 * @see eu.ttc.dataflow.model.dataflow.ContainerType
	 * @generated
	 */
	EEnum getContainerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataflowFactory getDataflowFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.ModelImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.ElementImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TARGET = eINSTANCE.getElement_Target();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.AllInstancesImpl <em>All Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.AllInstancesImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getAllInstances()
		 * @generated
		 */
		EClass ALL_INSTANCES = eINSTANCE.getAllInstances();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_INSTANCES__FIELD = eINSTANCE.getAllInstances_Field();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_INSTANCES__MODEL = eINSTANCE.getAllInstances_Model();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_INSTANCES__PACKAGE_NAME = eINSTANCE.getAllInstances_PackageName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_INSTANCES__TYPE_NAME = eINSTANCE.getAllInstances_TypeName();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl <em>New Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.NewInstanceImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getNewInstance()
		 * @generated
		 */
		EClass NEW_INSTANCE = eINSTANCE.getNewInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_INSTANCE__INSTANCE_FIELD = eINSTANCE.getNewInstance_InstanceField();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_INSTANCE__KEY = eINSTANCE.getNewInstance_Key();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_INSTANCE__MODEL = eINSTANCE.getNewInstance_Model();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_INSTANCE__PACKAGE_NAME = eINSTANCE.getNewInstance_PackageName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_INSTANCE__TYPE_NAME = eINSTANCE.getNewInstance_TypeName();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.FilterImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Filter By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FILTER_BY = eINSTANCE.getFilter_FilterBy();

		/**
		 * The meta object literal for the '<em><b>Reject Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__REJECT_TARGET = eINSTANCE.getFilter_RejectTarget();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.SortImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '<em><b>Sort By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__SORT_BY = eINSTANCE.getSort_SortBy();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.CopyImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '<em><b>Copy Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__COPY_TARGET = eINSTANCE.getCopy_CopyTarget();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.ProductImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.GetFeatureImpl <em>Get Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.GetFeatureImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getGetFeature()
		 * @generated
		 */
		EClass GET_FEATURE = eINSTANCE.getGetFeature();

		/**
		 * The meta object literal for the '<em><b>Object Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE__OBJECT_FIELD = eINSTANCE.getGetFeature_ObjectField();

		/**
		 * The meta object literal for the '<em><b>Value Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE__VALUE_FIELD = eINSTANCE.getGetFeature_ValueField();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE__FEATURE = eINSTANCE.getGetFeature_Feature();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.SetFeatureImpl <em>Set Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.SetFeatureImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getSetFeature()
		 * @generated
		 */
		EClass SET_FEATURE = eINSTANCE.getSetFeature();

		/**
		 * The meta object literal for the '<em><b>Object Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_FEATURE__OBJECT_FIELD = eINSTANCE.getSetFeature_ObjectField();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_FEATURE__VALUE = eINSTANCE.getSetFeature_Value();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_FEATURE__FEATURE = eINSTANCE.getSetFeature_Feature();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.NewContainerImpl <em>New Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.NewContainerImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getNewContainer()
		 * @generated
		 */
		EClass NEW_CONTAINER = eINSTANCE.getNewContainer();

		/**
		 * The meta object literal for the '<em><b>List Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_CONTAINER__LIST_FIELD = eINSTANCE.getNewContainer_ListField();

		/**
		 * The meta object literal for the '<em><b>Container Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_CONTAINER__CONTAINER_TYPE = eINSTANCE.getNewContainer_ContainerType();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.AddToContainerImpl <em>Add To Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.AddToContainerImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getAddToContainer()
		 * @generated
		 */
		EClass ADD_TO_CONTAINER = eINSTANCE.getAddToContainer();

		/**
		 * The meta object literal for the '<em><b>List Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TO_CONTAINER__LIST_FIELD = eINSTANCE.getAddToContainer_ListField();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_TO_CONTAINER__VALUE = eINSTANCE.getAddToContainer_Value();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_TO_CONTAINER__POSITION = eINSTANCE.getAddToContainer_Position();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.ForEachImpl <em>For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.ForEachImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getForEach()
		 * @generated
		 */
		EClass FOR_EACH = eINSTANCE.getForEach();

		/**
		 * The meta object literal for the '<em><b>List Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__LIST_FIELD = eINSTANCE.getForEach_ListField();

		/**
		 * The meta object literal for the '<em><b>Item Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__ITEM_FIELD = eINSTANCE.getForEach_ItemField();

		/**
		 * The meta object literal for the '<em><b>Position Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH__POSITION_FIELD = eINSTANCE.getForEach_PositionField();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.CollectByImpl <em>Collect By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.CollectByImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getCollectBy()
		 * @generated
		 */
		EClass COLLECT_BY = eINSTANCE.getCollectBy();

		/**
		 * The meta object literal for the '<em><b>Collect By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECT_BY__COLLECT_BY = eINSTANCE.getCollectBy_CollectBy();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.EvaluateImpl <em>Evaluate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.EvaluateImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getEvaluate()
		 * @generated
		 */
		EClass EVALUATE = eINSTANCE.getEvaluate();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATE__FIELD = eINSTANCE.getEvaluate_Field();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE__EXPRESSION = eINSTANCE.getEvaluate_Expression();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.ExpressionImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.IntegerLiteralImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.BooleanLiteralImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.RealLiteralImpl <em>Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.RealLiteralImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getRealLiteral()
		 * @generated
		 */
		EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.StringLiteralImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.FieldReferenceImpl <em>Field Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.FieldReferenceImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getFieldReference()
		 * @generated
		 */
		EClass FIELD_REFERENCE = eINSTANCE.getFieldReference();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_REFERENCE__FIELD = eINSTANCE.getFieldReference_Field();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.UnaryOperationImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getUnaryOperation()
		 * @generated
		 */
		EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_OPERATION__OPERATOR = eINSTANCE.getUnaryOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATION__EXPRESSION = eINSTANCE.getUnaryOperation_Expression();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.BinaryOperationImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATION__OPERATOR = eINSTANCE.getBinaryOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT_EXPRESSION = eINSTANCE.getBinaryOperation_LeftExpression();

		/**
		 * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT_EXPRESSION = eINSTANCE.getBinaryOperation_RightExpression();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.FeatureCallImpl <em>Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.FeatureCallImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getFeatureCall()
		 * @generated
		 */
		EClass FEATURE_CALL = eINSTANCE.getFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Target Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CALL__TARGET_EXPRESSION = eINSTANCE.getFeatureCall_TargetExpression();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CALL__FEATURE = eINSTANCE.getFeatureCall_Feature();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CALL__PARAMETERS = eINSTANCE.getFeatureCall_Parameters();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.impl.ConditionalExpressionImpl
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__CONDITION_EXPRESSION = eINSTANCE.getConditionalExpression_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__THEN_EXPRESSION = eINSTANCE.getConditionalExpression_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getConditionalExpression_ElseExpression();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.UnaryOperator
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.BinaryOperator
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link eu.ttc.dataflow.model.dataflow.ContainerType <em>Container Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.ttc.dataflow.model.dataflow.ContainerType
		 * @see eu.ttc.dataflow.model.dataflow.impl.DataflowPackageImpl#getContainerType()
		 * @generated
		 */
		EEnum CONTAINER_TYPE = eINSTANCE.getContainerType();

	}

} //DataflowPackage
