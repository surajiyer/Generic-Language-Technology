/**
 */
package robotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.WhileStatement#getWhileExpression <em>While Expression</em>}</li>
 *   <li>{@link robotmodel.WhileStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>While Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Expression</em>' containment reference.
	 * @see #setWhileExpression(Expression)
	 * @see robotmodel.RobotmodelPackage#getWhileStatement_WhileExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getWhileExpression();

	/**
	 * Sets the value of the '{@link robotmodel.WhileStatement#getWhileExpression <em>While Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Expression</em>' containment reference.
	 * @see #getWhileExpression()
	 * @generated
	 */
	void setWhileExpression(Expression value);

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
	 * @see robotmodel.RobotmodelPackage#getWhileStatement_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // WhileStatement
