/**
 */
package robotmodel.tests;

import junit.textui.TestRunner;

import robotmodel.AtomicCommand;
import robotmodel.RobotmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atomic Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicCommandTest extends CommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtomicCommandTest.class);
	}

	/**
	 * Constructs a new Atomic Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicCommandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atomic Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtomicCommand getFixture() {
		return (AtomicCommand)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotmodelFactory.eINSTANCE.createAtomicCommand());
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

} //AtomicCommandTest
