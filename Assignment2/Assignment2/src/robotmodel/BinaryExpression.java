/**
 */
package robotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.BinaryExpression#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link robotmodel.BinaryExpression#getRightExpression <em>Right Expression</em>}</li>
 *   <li>{@link robotmodel.BinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Expression</em>' containment reference.
	 * @see #setLeftExpression(Expression)
	 * @see robotmodel.RobotmodelPackage#getBinaryExpression_LeftExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftExpression();

	/**
	 * Sets the value of the '{@link robotmodel.BinaryExpression#getLeftExpression <em>Left Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Expression</em>' containment reference.
	 * @see #getLeftExpression()
	 * @generated
	 */
	void setLeftExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Expression</em>' containment reference.
	 * @see #setRightExpression(Expression)
	 * @see robotmodel.RobotmodelPackage#getBinaryExpression_RightExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightExpression();

	/**
	 * Sets the value of the '{@link robotmodel.BinaryExpression#getRightExpression <em>Right Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Expression</em>' containment reference.
	 * @see #getRightExpression()
	 * @generated
	 */
	void setRightExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.OperatorLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see robotmodel.OperatorLiteral
	 * @see #setOperator(OperatorLiteral)
	 * @see robotmodel.RobotmodelPackage#getBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	OperatorLiteral getOperator();

	/**
	 * Sets the value of the '{@link robotmodel.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see robotmodel.OperatorLiteral
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorLiteral value);

} // BinaryExpression
