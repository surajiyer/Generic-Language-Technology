/**
 */
package robotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.AtomicCommand#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getAtomicCommand()
 * @model
 * @generated
 */
public interface AtomicCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.CommandLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see robotmodel.CommandLiteral
	 * @see #setCommand(CommandLiteral)
	 * @see robotmodel.RobotmodelPackage#getAtomicCommand_Command()
	 * @model required="true"
	 * @generated
	 */
	CommandLiteral getCommand();

	/**
	 * Sets the value of the '{@link robotmodel.AtomicCommand#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see robotmodel.CommandLiteral
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(CommandLiteral value);

} // AtomicCommand
