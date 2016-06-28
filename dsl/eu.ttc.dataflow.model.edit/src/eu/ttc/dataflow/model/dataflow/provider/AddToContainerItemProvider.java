/**
 */
package eu.ttc.dataflow.model.dataflow.provider;


import eu.ttc.dataflow.model.dataflow.AddToContainer;
import eu.ttc.dataflow.model.dataflow.DataflowFactory;
import eu.ttc.dataflow.model.dataflow.DataflowPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.ttc.dataflow.model.dataflow.AddToContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddToContainerItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddToContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataflowPackage.Literals.ADD_TO_CONTAINER__LIST_FIELD);
			childrenFeatures.add(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE);
			childrenFeatures.add(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AddToContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddToContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AddToContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AddToContainer_type") :
			getString("_UI_AddToContainer_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AddToContainer.class)) {
			case DataflowPackage.ADD_TO_CONTAINER__LIST_FIELD:
			case DataflowPackage.ADD_TO_CONTAINER__VALUE:
			case DataflowPackage.ADD_TO_CONTAINER__POSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__LIST_FIELD,
				 ""));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createFieldReference()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE,
				 DataflowFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createFieldReference()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION,
				 DataflowFactory.eINSTANCE.createConditionalExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DataflowPackage.Literals.ADD_TO_CONTAINER__VALUE ||
			childFeature == DataflowPackage.Literals.ADD_TO_CONTAINER__POSITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
