/**
 */
package robotmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robotmodel.RobotmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerTest extends TestCase {

	/**
	 * The fixture for this Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected robotmodel.Integer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerTest.class);
	}

	/**
	 * Constructs a new Integer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(robotmodel.Integer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected robotmodel.Integer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotmodelFactory.eINSTANCE.createInteger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntegerTest
