/**
 */
package robotmodel.tests;

import junit.textui.TestRunner;

import robotmodel.Comment;
import robotmodel.RobotmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommentTest extends CommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommentTest.class);
	}

	/**
	 * Constructs a new Comment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Comment getFixture() {
		return (Comment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotmodelFactory.eINSTANCE.createComment());
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

} //CommentTest
