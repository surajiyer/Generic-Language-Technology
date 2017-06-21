/**
 */
package robotmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robotmodel.ConstructionStatement;
import robotmodel.GridLiteral;
import robotmodel.RobotmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Construction Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.impl.ConstructionStatementImpl#getIntegers <em>Integers</em>}</li>
 *   <li>{@link robotmodel.impl.ConstructionStatementImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructionStatementImpl extends StatementImpl implements ConstructionStatement {
	/**
	 * The cached value of the '{@link #getIntegers() <em>Integers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegers()
	 * @generated
	 * @ordered
	 */
	protected EList<robotmodel.Integer> integers;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final GridLiteral COMMAND_EDEFAULT = GridLiteral.BUILD_WALL;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected GridLiteral command = COMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotmodelPackage.Literals.CONSTRUCTION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<robotmodel.Integer> getIntegers() {
		if (integers == null) {
			integers = new EObjectContainmentEList<robotmodel.Integer>(robotmodel.Integer.class, this, RobotmodelPackage.CONSTRUCTION_STATEMENT__INTEGERS);
		}
		return integers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridLiteral getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(GridLiteral newCommand) {
		GridLiteral oldCommand = command;
		command = newCommand == null ? COMMAND_EDEFAULT : newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.CONSTRUCTION_STATEMENT__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__INTEGERS:
				return ((InternalEList<?>)getIntegers()).basicRemove(otherEnd, msgs);
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
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__INTEGERS:
				return getIntegers();
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__COMMAND:
				return getCommand();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__INTEGERS:
				getIntegers().clear();
				getIntegers().addAll((Collection<? extends robotmodel.Integer>)newValue);
				return;
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__COMMAND:
				setCommand((GridLiteral)newValue);
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
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__INTEGERS:
				getIntegers().clear();
				return;
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__COMMAND:
				setCommand(COMMAND_EDEFAULT);
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
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__INTEGERS:
				return integers != null && !integers.isEmpty();
			case RobotmodelPackage.CONSTRUCTION_STATEMENT__COMMAND:
				return command != COMMAND_EDEFAULT;
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
		result.append(" (command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //ConstructionStatementImpl
