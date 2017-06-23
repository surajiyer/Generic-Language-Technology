/**
 */
package robotmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robotmodel.RobotmodelPackage;
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
 *   <li>{@link robotmodel.impl.TraceCommandImpl#getCommand <em>Command</em>}</li>
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
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

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
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotmodelPackage.TRACE_COMMAND__COMMAND, oldCommand, command));
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
			case RobotmodelPackage.TRACE_COMMAND__COMMAND:
				return getCommand();
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
			case RobotmodelPackage.TRACE_COMMAND__COMMAND:
				setCommand((String)newValue);
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
			case RobotmodelPackage.TRACE_COMMAND__COMMAND:
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
			case RobotmodelPackage.TRACE_COMMAND__TRACE_LITERAL:
				return traceLiteral != TRACE_LITERAL_EDEFAULT;
			case RobotmodelPackage.TRACE_COMMAND__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
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
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //TraceCommandImpl
