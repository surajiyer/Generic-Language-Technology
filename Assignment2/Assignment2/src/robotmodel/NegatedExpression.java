/**
 */
package robotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negated Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.NegatedExpression#getNegatedExpression <em>Negated Expression</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getNegatedExpression()
 * @model
 * @generated
 */
public interface NegatedExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Negated Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated Expression</em>' containment reference.
	 * @see #setNegatedExpression(Expression)
	 * @see robotmodel.RobotmodelPackage#getNegatedExpression_NegatedExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getNegatedExpression();

	/**
	 * Sets the value of the '{@link robotmodel.NegatedExpression#getNegatedExpression <em>Negated Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated Expression</em>' containment reference.
	 * @see #getNegatedExpression()
	 * @generated
	 */
	void setNegatedExpression(Expression value);

} // NegatedExpression
