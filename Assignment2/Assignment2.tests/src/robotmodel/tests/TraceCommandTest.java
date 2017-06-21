/**
 */
package robotmodel.tests;

import junit.textui.TestRunner;

import robotmodel.RobotmodelFactory;
import robotmodel.TraceCommand;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trace Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceCommandTest extends CommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TraceCommandTest.class);
	}

	/**
	 * Constructs a new Trace Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceCommandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trace Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TraceCommand getFixture() {
		return (TraceCommand)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotmodelFactory.eINSTANCE.createTraceCommand());
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

} //TraceCommandTest
