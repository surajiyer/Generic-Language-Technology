/**
 */
package robotmodel.tests;

import junit.textui.TestRunner;

import robotmodel.ConstructionStatement;
import robotmodel.RobotmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Construction Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstructionStatementTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstructionStatementTest.class);
	}

	/**
	 * Constructs a new Construction Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructionStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Construction Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConstructionStatement getFixture() {
		return (ConstructionStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotmodelFactory.eINSTANCE.createConstructionStatement());
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

} //ConstructionStatementTest
