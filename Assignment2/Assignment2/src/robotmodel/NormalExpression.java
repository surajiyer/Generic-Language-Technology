/**
 */
package robotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.NormalExpression#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getNormalExpression()
 * @model
 * @generated
 */
public interface NormalExpression extends AtomicExpression {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.NormalExpressionLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see robotmodel.NormalExpressionLiteral
	 * @see #setLiteral(NormalExpressionLiteral)
	 * @see robotmodel.RobotmodelPackage#getNormalExpression_Literal()
	 * @model required="true"
	 * @generated
	 */
	NormalExpressionLiteral getLiteral();

	/**
	 * Sets the value of the '{@link robotmodel.NormalExpression#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see robotmodel.NormalExpressionLiteral
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(NormalExpressionLiteral value);

} // NormalExpression
