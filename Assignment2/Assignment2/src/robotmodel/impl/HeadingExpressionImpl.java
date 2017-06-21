/**
 */
package robotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotmodel.DirectionLiteral;
import robotmodel.HeadingExpression;
import robotmodel.HeadingLiteral;
import robotmodel.RobotmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.impl.HeadingExpressionImpl#getHeadingLiteral <em>Heading Literal</em>}</li>
 *   <li>{@link robotmodel.impl.HeadingExpressionImpl#getDirectionLiteral <em>Direction Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadingExpressionImpl extends AtomicExpressionImpl implements HeadingExpression {
	/**
	 * The default value of the '{@link #getHeadingLiteral() <em>Heading Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadingLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final HeadingLiteral HEADING_LITERAL_EDEFAULT = HeadingLiteral.HEADING;

	/**
	 * The cached value of the '{@link #getHeadingLiteral() <em>Heading Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadingLiteral()
	 * @generated
	 * @ordered
	 */
	protected HeadingLiteral headingLiteral = HEADING_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectionLiteral() <em>Direction Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionLiteral DIRECTION_LITERAL_EDEFAULT = DirectionLiteral.NORTH;

	/**
	 * The cached value of the '{@link #getDirectionLiteral() <em>Direction Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionLiteral()
	 * @generated
	 * @ordered
	 */
	protected DirectionLiteral directionLiteral = DIRECTION_LITERAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadingExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotmodelPackage.Literals.HEADING_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadingLiteral getHeadingLiteral() {
		return headingLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadingLiteral(HeadingLiteral newHeadingLiteral) {
		HeadingLiteral oldHeadingLiteral = headingLiteral;
		headingLiteral = newHeadingLiteral == null ? HEADING_LITERAL_EDEFAULT : newHeadingLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.HEADING_EXPRESSION__HEADING_LITERAL, oldHeadingLiteral, headingLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionLiteral getDirectionLiteral() {
		return directionLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionLiteral(DirectionLiteral newDirectionLiteral) {
		DirectionLiteral oldDirectionLiteral = directionLiteral;
		directionLiteral = newDirectionLiteral == null ? DIRECTION_LITERAL_EDEFAULT : newDirectionLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.HEADING_EXPRESSION__DIRECTION_LITERAL, oldDirectionLiteral, directionLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotmodelPackage.HEADING_EXPRESSION__HEADING_LITERAL:
				return getHeadingLiteral();
			case RobotmodelPackage.HEADING_EXPRESSION__DIRECTION_LITERAL:
				return getDirectionLiteral();
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
			case RobotmodelPackage.HEADING_EXPRESSION__HEADING_LITERAL:
				setHeadingLiteral((HeadingLiteral)newValue);
				return;
			case RobotmodelPackage.HEADING_EXPRESSION__DIRECTION_LITERAL:
				setDirectionLiteral((DirectionLiteral)newValue);
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
			case RobotmodelPackage.HEADING_EXPRESSION__HEADING_LITERAL:
				setHeadingLiteral(HEADING_LITERAL_EDEFAULT);
				return;
			case RobotmodelPackage.HEADING_EXPRESSION__DIRECTION_LITERAL:
				setDirectionLiteral(DIRECTION_LITERAL_EDEFAULT);
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
			case RobotmodelPackage.HEADING_EXPRESSION__HEADING_LITERAL:
				return headingLiteral != HEADING_LITERAL_EDEFAULT;
			case RobotmodelPackage.HEADING_EXPRESSION__DIRECTION_LITERAL:
				return directionLiteral != DIRECTION_LITERAL_EDEFAULT;
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
		result.append(" (headingLiteral: ");
		result.append(headingLiteral);
		result.append(", directionLiteral: ");
		result.append(directionLiteral);
		result.append(')');
		return result.toString();
	}

} //HeadingExpressionImpl
