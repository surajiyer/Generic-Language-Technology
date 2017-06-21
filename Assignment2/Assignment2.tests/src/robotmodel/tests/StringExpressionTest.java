/**
 */
package robotmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import robotmodel.RobotmodelFactory;
import robotmodel.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringExpressionTest extends TestCase {

	/**
	 * The fixture for this String Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringExpressionTest.class);
	}

	/**
	 * Constructs a new String Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this String Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StringExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this String Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringExpression getFixture() {
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
		setFixture(RobotmodelFactory.eINSTANCE.createStringExpression());
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

} //StringExpressionTest
