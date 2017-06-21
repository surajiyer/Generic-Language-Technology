/**
 */
package robotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotmodel.AheadLiteral;
import robotmodel.RobotmodelPackage;
import robotmodel.WallAheadExpression;
import robotmodel.WallLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall Ahead Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.impl.WallAheadExpressionImpl#getWall <em>Wall</em>}</li>
 *   <li>{@link robotmodel.impl.WallAheadExpressionImpl#getAhead <em>Ahead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallAheadExpressionImpl extends AtomicExpressionImpl implements WallAheadExpression {
	/**
	 * The default value of the '{@link #getWall() <em>Wall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWall()
	 * @generated
	 * @ordered
	 */
	protected static final WallLiteral WALL_EDEFAULT = WallLiteral.WALL;

	/**
	 * The cached value of the '{@link #getWall() <em>Wall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWall()
	 * @generated
	 * @ordered
	 */
	protected WallLiteral wall = WALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAhead() <em>Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAhead()
	 * @generated
	 * @ordered
	 */
	protected static final AheadLiteral AHEAD_EDEFAULT = AheadLiteral.AHEAD;

	/**
	 * The cached value of the '{@link #getAhead() <em>Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAhead()
	 * @generated
	 * @ordered
	 */
	protected AheadLiteral ahead = AHEAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallAheadExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotmodelPackage.Literals.WALL_AHEAD_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallLiteral getWall() {
		return wall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWall(WallLiteral newWall) {
		WallLiteral oldWall = wall;
		wall = newWall == null ? WALL_EDEFAULT : newWall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.WALL_AHEAD_EXPRESSION__WALL, oldWall, wall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AheadLiteral getAhead() {
		return ahead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAhead(AheadLiteral newAhead) {
		AheadLiteral oldAhead = ahead;
		ahead = newAhead == null ? AHEAD_EDEFAULT : newAhead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.WALL_AHEAD_EXPRESSION__AHEAD, oldAhead, ahead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION__WALL:
				return getWall();
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION__AHEAD:
				return getAhead();
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
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION__WALL:
				setWall((WallLiteral)newValue);
				return;
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION__AHEAD:
				setAhead((AheadLiteral)newValue);
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
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION__WALL:
				setWall(WALL_EDEFAULT);
				return;
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION__AHEAD:
				setAhead(AHEAD_EDEFAULT);
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
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION__WALL:
				return wall != WALL_EDEFAULT;
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION__AHEAD:
				return ahead != AHEAD_EDEFAULT;
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
		result.append(" (wall: ");
		result.append(wall);
		result.append(", ahead: ");
		result.append(ahead);
		result.append(')');
		return result.toString();
	}

} //WallAheadExpressionImpl
