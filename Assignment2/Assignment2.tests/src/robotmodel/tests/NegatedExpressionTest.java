/**
 */
package robotmodel.tests;

import junit.textui.TestRunner;

import robotmodel.NegatedExpression;
import robotmodel.RobotmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Negated Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegatedExpressionTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NegatedExpressionTest.class);
	}

	/**
	 * Constructs a new Negated Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegatedExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Negated Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NegatedExpression getFixture() {
		return (NegatedExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotmodelFactory.eINSTANCE.createNegatedExpression());
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

} //NegatedExpressionTest
