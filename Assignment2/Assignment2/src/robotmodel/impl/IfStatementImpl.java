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
 *   <li>{@link robotmodel.impl.IfStatementImpl#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link robotmodel.impl.IfStatementImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link robotmodel.impl.IfStatementImpl#getStatements2 <em>Statements2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getIfExpression() <em>If Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression ifExpression;

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
	 * The cached value of the '{@link #getStatements2() <em>Statements2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements2()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements2;

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
	public Expression getIfExpression() {
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExpression(Expression newIfExpression, NotificationChain msgs) {
		Expression oldIfExpression = ifExpression;
		ifExpression = newIfExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION, oldIfExpression, newIfExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExpression(Expression newIfExpression) {
		if (newIfExpression != ifExpression) {
			NotificationChain msgs = null;
			if (ifExpression != null)
				msgs = ((InternalEObject)ifExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION, null, msgs);
			if (newIfExpression != null)
				msgs = ((InternalEObject)newIfExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION, null, msgs);
			msgs = basicSetIfExpression(newIfExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION, newIfExpression, newIfExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, RobotmodelPackage.IF_STATEMENT__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements2() {
		if (statements2 == null) {
			statements2 = new EObjectContainmentEList<Statement>(Statement.class, this, RobotmodelPackage.IF_STATEMENT__STATEMENTS2);
		}
		return statements2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION:
				return basicSetIfExpression(null, msgs);
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS2:
				return ((InternalEList<?>)getStatements2()).basicRemove(otherEnd, msgs);
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
			case RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION:
				return getIfExpression();
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS:
				return getStatements();
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS2:
				return getStatements2();
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
			case RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION:
				setIfExpression((Expression)newValue);
				return;
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS2:
				getStatements2().clear();
				getStatements2().addAll((Collection<? extends Statement>)newValue);
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
			case RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION:
				setIfExpression((Expression)null);
				return;
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS:
				getStatements().clear();
				return;
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS2:
				getStatements2().clear();
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
			case RobotmodelPackage.IF_STATEMENT__IF_EXPRESSION:
				return ifExpression != null;
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case RobotmodelPackage.IF_STATEMENT__STATEMENTS2:
				return statements2 != null && !statements2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
