/**
 */
package robotmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.IfStatement#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link robotmodel.IfStatement#getStatements <em>Statements</em>}</li>
 *   <li>{@link robotmodel.IfStatement#getStatements2 <em>Statements2</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>If Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Expression</em>' containment reference.
	 * @see #setIfExpression(Expression)
	 * @see robotmodel.RobotmodelPackage#getIfStatement_IfExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIfExpression();

	/**
	 * Sets the value of the '{@link robotmodel.IfStatement#getIfExpression <em>If Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Expression</em>' containment reference.
	 * @see #getIfExpression()
	 * @generated
	 */
	void setIfExpression(Expression value);

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
	 * @see robotmodel.RobotmodelPackage#getIfStatement_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Statements2</b></em>' containment reference list.
	 * The list contents are of type {@link robotmodel.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements2</em>' containment reference list.
	 * @see robotmodel.RobotmodelPackage#getIfStatement_Statements2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements2();

} // IfStatement
