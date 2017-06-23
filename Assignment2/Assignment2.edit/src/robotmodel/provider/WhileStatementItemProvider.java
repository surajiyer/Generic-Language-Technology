/**
 */
package robotmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import robotmodel.RobotmodelFactory;
import robotmodel.RobotmodelPackage;
import robotmodel.WhileStatement;

/**
 * This is the item provider adapter for a {@link robotmodel.WhileStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RobotmodelPackage.Literals.WHILE_STATEMENT__CONDITION);
			childrenFeatures.add(RobotmodelPackage.Literals.WHILE_STATEMENT__COMMAND);
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
	 * This returns WhileStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WhileStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_WhileStatement_type");
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

		switch (notification.getFeatureID(WhileStatement.class)) {
			case RobotmodelPackage.WHILE_STATEMENT__CONDITION:
			case RobotmodelPackage.WHILE_STATEMENT__COMMAND:
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
				(RobotmodelPackage.Literals.WHILE_STATEMENT__CONDITION,
				 RobotmodelFactory.eINSTANCE.createNegatedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__CONDITION,
				 RobotmodelFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__CONDITION,
				 RobotmodelFactory.eINSTANCE.createHeadingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__CONDITION,
				 RobotmodelFactory.eINSTANCE.createWallAheadExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__CONDITION,
				 RobotmodelFactory.eINSTANCE.createNormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__COMMAND,
				 RobotmodelFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__COMMAND,
				 RobotmodelFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__COMMAND,
				 RobotmodelFactory.eINSTANCE.createRepeatStatement()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__COMMAND,
				 RobotmodelFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__COMMAND,
				 RobotmodelFactory.eINSTANCE.createTraceCommand()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__COMMAND,
				 RobotmodelFactory.eINSTANCE.createAtomicCommand()));

		newChildDescriptors.add
			(createChildParameter
				(RobotmodelPackage.Literals.WHILE_STATEMENT__COMMAND,
				 RobotmodelFactory.eINSTANCE.createConstructionStatement()));
	}

}
