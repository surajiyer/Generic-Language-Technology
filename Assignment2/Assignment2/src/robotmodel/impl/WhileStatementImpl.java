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
import robotmodel.RobotmodelPackage;
import robotmodel.Statement;
import robotmodel.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.impl.WhileStatementImpl#getWhileExpression <em>While Expression</em>}</li>
 *   <li>{@link robotmodel.impl.WhileStatementImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileStatementImpl extends StatementImpl implements WhileStatement {
	/**
	 * The cached value of the '{@link #getWhileExpression() <em>While Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression whileExpression;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotmodelPackage.Literals.WHILE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhileExpression() {
		return whileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhileExpression(Expression newWhileExpression, NotificationChain msgs) {
		Expression oldWhileExpression = whileExpression;
		whileExpression = newWhileExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION, oldWhileExpression, newWhileExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileExpression(Expression newWhileExpression) {
		if (newWhileExpression != whileExpression) {
			NotificationChain msgs = null;
			if (whileExpression != null)
				msgs = ((InternalEObject)whileExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION, null, msgs);
			if (newWhileExpression != null)
				msgs = ((InternalEObject)newWhileExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION, null, msgs);
			msgs = basicSetWhileExpression(newWhileExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION, newWhileExpression, newWhileExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, RobotmodelPackage.WHILE_STATEMENT__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION:
				return basicSetWhileExpression(null, msgs);
			case RobotmodelPackage.WHILE_STATEMENT__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION:
				return getWhileExpression();
			case RobotmodelPackage.WHILE_STATEMENT__STATEMENTS:
				return getStatements();
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
			case RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION:
				setWhileExpression((Expression)newValue);
				return;
			case RobotmodelPackage.WHILE_STATEMENT__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
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
			case RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION:
				setWhileExpression((Expression)null);
				return;
			case RobotmodelPackage.WHILE_STATEMENT__STATEMENTS:
				getStatements().clear();
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
			case RobotmodelPackage.WHILE_STATEMENT__WHILE_EXPRESSION:
				return whileExpression != null;
			case RobotmodelPackage.WHILE_STATEMENT__STATEMENTS:
				return statements != null && !statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhileStatementImpl
