/**
 */
package robotmodel.tests;

import junit.textui.TestRunner;

import robotmodel.NormalExpression;
import robotmodel.RobotmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Normal Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalExpressionTest extends AtomicExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NormalExpressionTest.class);
	}

	/**
	 * Constructs a new Normal Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Normal Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NormalExpression getFixture() {
		return (NormalExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotmodelFactory.eINSTANCE.createNormalExpression());
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

} //NormalExpressionTest
