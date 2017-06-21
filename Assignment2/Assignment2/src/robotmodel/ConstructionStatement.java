/**
 */
package robotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construction Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.ConstructionStatement#getIntegers <em>Integers</em>}</li>
 *   <li>{@link robotmodel.ConstructionStatement#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getConstructionStatement()
 * @model
 * @generated
 */
public interface ConstructionStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Integers</b></em>' containment reference list.
	 * The list contents are of type {@link robotmodel.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integers</em>' containment reference list.
	 * @see robotmodel.RobotmodelPackage#getConstructionStatement_Integers()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<robotmodel.Integer> getIntegers();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.GridLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see robotmodel.GridLiteral
	 * @see #setCommand(GridLiteral)
	 * @see robotmodel.RobotmodelPackage#getConstructionStatement_Command()
	 * @model
	 * @generated
	 */
	GridLiteral getCommand();

	/**
	 * Sets the value of the '{@link robotmodel.ConstructionStatement#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see robotmodel.GridLiteral
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(GridLiteral value);

} // ConstructionStatement
