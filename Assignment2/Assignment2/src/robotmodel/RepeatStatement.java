/**
 */
package robotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.RepeatStatement#getCommand <em>Command</em>}</li>
 *   <li>{@link robotmodel.RepeatStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getRepeatStatement()
 * @model
 * @generated
 */
public interface RepeatStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link robotmodel.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see robotmodel.RobotmodelPackage#getRepeatStatement_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getCommand();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(int)
	 * @see robotmodel.RobotmodelPackage#getRepeatStatement_Condition()
	 * @model
	 * @generated
	 */
	int getCondition();

	/**
	 * Sets the value of the '{@link robotmodel.RepeatStatement#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(int value);

} // RepeatStatement
