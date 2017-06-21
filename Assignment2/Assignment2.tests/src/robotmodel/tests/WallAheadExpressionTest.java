/**
 */
package robotmodel.tests;

import junit.textui.TestRunner;

import robotmodel.RobotmodelFactory;
import robotmodel.WallAheadExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wall Ahead Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WallAheadExpressionTest extends AtomicExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WallAheadExpressionTest.class);
	}

	/**
	 * Constructs a new Wall Ahead Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallAheadExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wall Ahead Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WallAheadExpression getFixture() {
		return (WallAheadExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotmodelFactory.eINSTANCE.createWallAheadExpression());
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

} //WallAheadExpressionTest
