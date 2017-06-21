/**
 */
package robotmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotmodel.Script#getName <em>Name</em>}</li>
 *   <li>{@link robotmodel.Script#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see robotmodel.RobotmodelPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see robotmodel.RobotmodelPackage#getScript_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link robotmodel.Script#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

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
	 * @see robotmodel.RobotmodelPackage#getScript_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // Script
