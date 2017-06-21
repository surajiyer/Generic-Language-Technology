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

import robotmodel.RepeatStatement;
import robotmodel.RobotmodelPackage;
import robotmodel.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.impl.RepeatStatementImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link robotmodel.impl.RepeatStatementImpl#getInteger <em>Integer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatStatementImpl extends StatementImpl implements RepeatStatement {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected robotmodel.Integer integer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotmodelPackage.Literals.REPEAT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, RobotmodelPackage.REPEAT_STATEMENT__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public robotmodel.Integer getInteger() {
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteger(robotmodel.Integer newInteger, NotificationChain msgs) {
		robotmodel.Integer oldInteger = integer;
		integer = newInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotmodelPackage.REPEAT_STATEMENT__INTEGER, oldInteger, newInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteger(robotmodel.Integer newInteger) {
		if (newInteger != integer) {
			NotificationChain msgs = null;
			if (integer != null)
				msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.REPEAT_STATEMENT__INTEGER, null, msgs);
			if (newInteger != null)
				msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.REPEAT_STATEMENT__INTEGER, null, msgs);
			msgs = basicSetInteger(newInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.REPEAT_STATEMENT__INTEGER, newInteger, newInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotmodelPackage.REPEAT_STATEMENT__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case RobotmodelPackage.REPEAT_STATEMENT__INTEGER:
				return basicSetInteger(null, msgs);
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
			case RobotmodelPackage.REPEAT_STATEMENT__STATEMENTS:
				return getStatements();
			case RobotmodelPackage.REPEAT_STATEMENT__INTEGER:
				return getInteger();
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
			case RobotmodelPackage.REPEAT_STATEMENT__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case RobotmodelPackage.REPEAT_STATEMENT__INTEGER:
				setInteger((robotmodel.Integer)newValue);
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
			case RobotmodelPackage.REPEAT_STATEMENT__STATEMENTS:
				getStatements().clear();
				return;
			case RobotmodelPackage.REPEAT_STATEMENT__INTEGER:
				setInteger((robotmodel.Integer)null);
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
			case RobotmodelPackage.REPEAT_STATEMENT__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case RobotmodelPackage.REPEAT_STATEMENT__INTEGER:
				return integer != null;
		}
		return super.eIsSet(featureID);
	}

} //RepeatStatementImpl
