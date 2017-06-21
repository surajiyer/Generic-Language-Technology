/**
 */
package robotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall Ahead Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.WallAheadExpression#getWall <em>Wall</em>}</li>
 *   <li>{@link robotmodel.WallAheadExpression#getAhead <em>Ahead</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getWallAheadExpression()
 * @model
 * @generated
 */
public interface WallAheadExpression extends AtomicExpression {
	/**
	 * Returns the value of the '<em><b>Wall</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.WallLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall</em>' attribute.
	 * @see robotmodel.WallLiteral
	 * @see #setWall(WallLiteral)
	 * @see robotmodel.RobotmodelPackage#getWallAheadExpression_Wall()
	 * @model required="true"
	 * @generated
	 */
	WallLiteral getWall();

	/**
	 * Sets the value of the '{@link robotmodel.WallAheadExpression#getWall <em>Wall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall</em>' attribute.
	 * @see robotmodel.WallLiteral
	 * @see #getWall()
	 * @generated
	 */
	void setWall(WallLiteral value);

	/**
	 * Returns the value of the '<em><b>Ahead</b></em>' attribute.
	 * The literals are from the enumeration {@link robotmodel.AheadLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ahead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ahead</em>' attribute.
	 * @see robotmodel.AheadLiteral
	 * @see #setAhead(AheadLiteral)
	 * @see robotmodel.RobotmodelPackage#getWallAheadExpression_Ahead()
	 * @model required="true"
	 * @generated
	 */
	AheadLiteral getAhead();

	/**
	 * Sets the value of the '{@link robotmodel.WallAheadExpression#getAhead <em>Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ahead</em>' attribute.
	 * @see robotmodel.AheadLiteral
	 * @see #getAhead()
	 * @generated
	 */
	void setAhead(AheadLiteral value);

} // WallAheadExpression
