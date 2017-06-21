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
 *   <li>{@link robotmodel.RepeatStatement#getStatements <em>Statements</em>}</li>
 *   <li>{@link robotmodel.RepeatStatement#getInteger <em>Integer</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getRepeatStatement()
 * @model
 * @generated
 */
public interface RepeatStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link robotmodel.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see robotmodel.RobotmodelPackage#getRepeatStatement_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' containment reference.
	 * @see #setInteger(robotmodel.Integer)
	 * @see robotmodel.RobotmodelPackage#getRepeatStatement_Integer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	robotmodel.Integer getInteger();

	/**
	 * Sets the value of the '{@link robotmodel.RepeatStatement#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(robotmodel.Integer value);

} // RepeatStatement
