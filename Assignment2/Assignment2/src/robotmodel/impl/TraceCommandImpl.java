/**
 */
package robotmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotmodel.RobotmodelPackage;
import robotmodel.StringExpression;
import robotmodel.TraceCommand;
import robotmodel.TraceLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.impl.TraceCommandImpl#getTraceLiteral <em>Trace Literal</em>}</li>
 *   <li>{@link robotmodel.impl.TraceCommandImpl#getString <em>String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceCommandImpl extends CommandImpl implements TraceCommand {
	/**
	 * The default value of the '{@link #getTraceLiteral() <em>Trace Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final TraceLiteral TRACE_LITERAL_EDEFAULT = TraceLiteral.TRACE;

	/**
	 * The cached value of the '{@link #getTraceLiteral() <em>Trace Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLiteral()
	 * @generated
	 * @ordered
	 */
	protected TraceLiteral traceLiteral = TRACE_LITERAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected StringExpression string;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotmodelPackage.Literals.TRACE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLiteral getTraceLiteral() {
		return traceLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLiteral(TraceLiteral newTraceLiteral) {
		TraceLiteral oldTraceLiteral = traceLiteral;
		traceLiteral = newTraceLiteral == null ? TRACE_LITERAL_EDEFAULT : newTraceLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.TRACE_COMMAND__TRACE_LITERAL, oldTraceLiteral, traceLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(StringExpression newString, NotificationChain msgs) {
		StringExpression oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RobotmodelPackage.TRACE_COMMAND__STRING, oldString, newString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(StringExpression newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.TRACE_COMMAND__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RobotmodelPackage.TRACE_COMMAND__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.TRACE_COMMAND__STRING, newString, newString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RobotmodelPackage.TRACE_COMMAND__STRING:
				return basicSetString(null, msgs);
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
			case RobotmodelPackage.TRACE_COMMAND__TRACE_LITERAL:
				return getTraceLiteral();
			case RobotmodelPackage.TRACE_COMMAND__STRING:
				return getString();
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
			case RobotmodelPackage.TRACE_COMMAND__TRACE_LITERAL:
				setTraceLiteral((TraceLiteral)newValue);
				return;
			case RobotmodelPackage.TRACE_COMMAND__STRING:
				setString((StringExpression)newValue);
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
			case RobotmodelPackage.TRACE_COMMAND__TRACE_LITERAL:
				setTraceLiteral(TRACE_LITERAL_EDEFAULT);
				return;
			case RobotmodelPackage.TRACE_COMMAND__STRING:
				setString((StringExpression)null);
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
			case RobotmodelPackage.TRACE_COMMAND__TRACE_LITERAL:
				return traceLiteral != TRACE_LITERAL_EDEFAULT;
			case RobotmodelPackage.TRACE_COMMAND__STRING:
				return string != null;
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
		result.append(" (traceLiteral: ");
		result.append(traceLiteral);
		result.append(')');
		return result.toString();
	}

} //TraceCommandImpl
