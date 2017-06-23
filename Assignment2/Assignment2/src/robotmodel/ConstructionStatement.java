/**
 */
package robotmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construction Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.ConstructionStatement#getCommand <em>Command</em>}</li>
 *   <li>{@link robotmodel.ConstructionStatement#getX <em>X</em>}</li>
 *   <li>{@link robotmodel.ConstructionStatement#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getConstructionStatement()
 * @model
 * @generated
 */
public interface ConstructionStatement extends Statement {
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

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see robotmodel.RobotmodelPackage#getConstructionStatement_X()
	 * @model required="true"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link robotmodel.ConstructionStatement#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see robotmodel.RobotmodelPackage#getConstructionStatement_Y()
	 * @model required="true"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link robotmodel.ConstructionStatement#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

} // ConstructionStatement
