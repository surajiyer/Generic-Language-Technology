/**
 */
package robotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.TraceCommand#getTraceLiteral <em>Trace Literal</em>}</li>
 *   <li>{@link robotmodel.TraceCommand#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getTraceCommand()
 * @model
 * @generated
 */
public interface TraceCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Trace Literal</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.TraceLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Literal</em>' attribute.
	 * @see robotmodel.TraceLiteral
	 * @see #setTraceLiteral(TraceLiteral)
	 * @see robotmodel.RobotmodelPackage#getTraceCommand_TraceLiteral()
	 * @model required="true"
	 * @generated
	 */
	TraceLiteral getTraceLiteral();

	/**
	 * Sets the value of the '{@link robotmodel.TraceCommand#getTraceLiteral <em>Trace Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Literal</em>' attribute.
	 * @see robotmodel.TraceLiteral
	 * @see #getTraceLiteral()
	 * @generated
	 */
	void setTraceLiteral(TraceLiteral value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see robotmodel.RobotmodelPackage#getTraceCommand_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link robotmodel.TraceCommand#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

} // TraceCommand
