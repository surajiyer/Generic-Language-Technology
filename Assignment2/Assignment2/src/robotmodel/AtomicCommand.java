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
 *   <li>{@link robotmodel.AtomicCommand#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getAtomicCommand()
 * @model
 * @generated
 */
public interface AtomicCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.CommandLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see robotmodel.CommandLiteral
	 * @see #setLiteral(CommandLiteral)
	 * @see robotmodel.RobotmodelPackage#getAtomicCommand_Literal()
	 * @model required="true"
	 * @generated
	 */
	CommandLiteral getLiteral();

	/**
	 * Sets the value of the '{@link robotmodel.AtomicCommand#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see robotmodel.CommandLiteral
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(CommandLiteral value);

} // AtomicCommand
