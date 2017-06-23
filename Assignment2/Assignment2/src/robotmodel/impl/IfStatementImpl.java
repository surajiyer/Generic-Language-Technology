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

import robotmodel.Expression;
import robotmodel.IfStatement;
import robotmodel.RobotmodelPackage;
import robotmodel.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.impl.IfStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link robotmodel.impl.IfStatementImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link robotmodel.impl.IfStatementImpl#getCommand2 <em>Command2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> command;

	/**
	 * The cached value of the '{@link #getCommand2() <em>Command2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand2()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> command2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotmodelPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotmodelPackage.IF_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.IF_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.IF_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.IF_STATEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<Statement>(Statement.class, this, RobotmodelPackage.IF_STATEMENT__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getCommand2() {
		if (command2 == null) {
			command2 = new EObjectContainmentEList<Statement>(Statement.class, this, RobotmodelPackage.IF_STATEMENT__COMMAND2);
		}
		return command2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotmodelPackage.IF_STATEMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case RobotmodelPackage.IF_STATEMENT__COMMAND:
				return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
			case RobotmodelPackage.IF_STATEMENT__COMMAND2:
				return ((InternalEList<?>)getCommand2()).basicRemove(otherEnd, msgs);
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
			case RobotmodelPackage.IF_STATEMENT__CONDITION:
				return getCondition();
			case RobotmodelPackage.IF_STATEMENT__COMMAND:
				return getCommand();
			case RobotmodelPackage.IF_STATEMENT__COMMAND2:
				return getCommand2();
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
			case RobotmodelPackage.IF_STATEMENT__CONDITION:
				setCondition((Expression)newValue);
				return;
			case RobotmodelPackage.IF_STATEMENT__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends Statement>)newValue);
				return;
			case RobotmodelPackage.IF_STATEMENT__COMMAND2:
				getCommand2().clear();
				getCommand2().addAll((Collection<? extends Statement>)newValue);
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
			case RobotmodelPackage.IF_STATEMENT__CONDITION:
				setCondition((Expression)null);
				return;
			case RobotmodelPackage.IF_STATEMENT__COMMAND:
				getCommand().clear();
				return;
			case RobotmodelPackage.IF_STATEMENT__COMMAND2:
				getCommand2().clear();
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
			case RobotmodelPackage.IF_STATEMENT__CONDITION:
				return condition != null;
			case RobotmodelPackage.IF_STATEMENT__COMMAND:
				return command != null && !command.isEmpty();
			case RobotmodelPackage.IF_STATEMENT__COMMAND2:
				return command2 != null && !command2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
