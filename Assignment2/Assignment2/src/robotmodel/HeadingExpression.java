/**
 */
package robotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.HeadingExpression#getHeadingLiteral <em>Heading Literal</em>}</li>
 *   <li>{@link robotmodel.HeadingExpression#getDirectionLiteral <em>Direction Literal</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getHeadingExpression()
 * @model
 * @generated
 */
public interface HeadingExpression extends AtomicExpression {
	/**
	 * Returns the value of the '<em><b>Heading Literal</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.HeadingLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading Literal</em>' attribute.
	 * @see robotmodel.HeadingLiteral
	 * @see #setHeadingLiteral(HeadingLiteral)
	 * @see robotmodel.RobotmodelPackage#getHeadingExpression_HeadingLiteral()
	 * @model required="true"
	 * @generated
	 */
	HeadingLiteral getHeadingLiteral();

	/**
	 * Sets the value of the '{@link robotmodel.HeadingExpression#getHeadingLiteral <em>Heading Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading Literal</em>' attribute.
	 * @see robotmodel.HeadingLiteral
	 * @see #getHeadingLiteral()
	 * @generated
	 */
	void setHeadingLiteral(HeadingLiteral value);

	/**
	 * Returns the value of the '<em><b>Direction Literal</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.DirectionLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Literal</em>' attribute.
	 * @see robotmodel.DirectionLiteral
	 * @see #setDirectionLiteral(DirectionLiteral)
	 * @see robotmodel.RobotmodelPackage#getHeadingExpression_DirectionLiteral()
	 * @model required="true"
	 * @generated
	 */
	DirectionLiteral getDirectionLiteral();

	/**
	 * Sets the value of the '{@link robotmodel.HeadingExpression#getDirectionLiteral <em>Direction Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Literal</em>' attribute.
	 * @see robotmodel.DirectionLiteral
	 * @see #getDirectionLiteral()
	 * @generated
	 */
	void setDirectionLiteral(DirectionLiteral value);

} // HeadingExpression
