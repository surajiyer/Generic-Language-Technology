/**
 */
package robotmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotmodel.RobotmodelFactory
 * @model kind="package"
 * @generated
 */
public interface RobotmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "plugin://glt.robot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotmodelPackage eINSTANCE = robotmodel.impl.RobotmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link robotmodel.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.ScriptImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.StatementImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.IfStatementImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__COMMAND = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__COMMAND2 = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.WhileStatementImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__COMMAND = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.RepeatStatementImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getRepeatStatement()
	 * @generated
	 */
	int REPEAT_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__COMMAND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.CommandImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 5;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.CommentImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 6;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMAND = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.TraceCommandImpl <em>Trace Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.TraceCommandImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getTraceCommand()
	 * @generated
	 */
	int TRACE_COMMAND = 7;

	/**
	 * The feature id for the '<em><b>Trace Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMAND__TRACE_LITERAL = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMAND__COMMAND = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trace Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trace Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.AtomicCommandImpl <em>Atomic Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.AtomicCommandImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getAtomicCommand()
	 * @generated
	 */
	int ATOMIC_COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMMAND__COMMAND = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atomic Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.ExpressionImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.NegatedExpressionImpl <em>Negated Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.NegatedExpressionImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getNegatedExpression()
	 * @generated
	 */
	int NEGATED_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Negated Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_EXPRESSION__NEGATED_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negated Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negated Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.AtomicExpressionImpl <em>Atomic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.AtomicExpressionImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getAtomicExpression()
	 * @generated
	 */
	int ATOMIC_EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>Atomic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atomic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.BinaryExpressionImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.LayoutImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 13;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.HeadingExpressionImpl <em>Heading Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.HeadingExpressionImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getHeadingExpression()
	 * @generated
	 */
	int HEADING_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Heading Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_EXPRESSION__HEADING_LITERAL = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_EXPRESSION__DIRECTION_LITERAL = ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heading Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heading Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_EXPRESSION_OPERATION_COUNT = ATOMIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.WallAheadExpressionImpl <em>Wall Ahead Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.WallAheadExpressionImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getWallAheadExpression()
	 * @generated
	 */
	int WALL_AHEAD_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Wall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_EXPRESSION__WALL = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ahead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_EXPRESSION__AHEAD = ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wall Ahead Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wall Ahead Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_EXPRESSION_OPERATION_COUNT = ATOMIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.NormalExpressionImpl <em>Normal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.NormalExpressionImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getNormalExpression()
	 * @generated
	 */
	int NORMAL_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_EXPRESSION__LITERAL = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Normal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_EXPRESSION_OPERATION_COUNT = ATOMIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.NameImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 17;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotmodel.impl.ConstructionStatementImpl <em>Construction Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.impl.ConstructionStatementImpl
	 * @see robotmodel.impl.RobotmodelPackageImpl#getConstructionStatement()
	 * @generated
	 */
	int CONSTRUCTION_STATEMENT = 18;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION_STATEMENT__COMMAND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION_STATEMENT__X = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION_STATEMENT__Y = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Construction Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Construction Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotmodel.TraceLiteral <em>Trace Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.TraceLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getTraceLiteral()
	 * @generated
	 */
	int TRACE_LITERAL = 19;

	/**
	 * The meta object id for the '{@link robotmodel.CommandLiteral <em>Command Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.CommandLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getCommandLiteral()
	 * @generated
	 */
	int COMMAND_LITERAL = 20;

	/**
	 * The meta object id for the '{@link robotmodel.OperatorLiteral <em>Operator Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.OperatorLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getOperatorLiteral()
	 * @generated
	 */
	int OPERATOR_LITERAL = 21;

	/**
	 * The meta object id for the '{@link robotmodel.Keyword <em>Keyword</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.Keyword
	 * @see robotmodel.impl.RobotmodelPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 22;

	/**
	 * The meta object id for the '{@link robotmodel.DirectionLiteral <em>Direction Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.DirectionLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getDirectionLiteral()
	 * @generated
	 */
	int DIRECTION_LITERAL = 23;

	/**
	 * The meta object id for the '{@link robotmodel.HeadingLiteral <em>Heading Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.HeadingLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getHeadingLiteral()
	 * @generated
	 */
	int HEADING_LITERAL = 24;

	/**
	 * The meta object id for the '{@link robotmodel.WallLiteral <em>Wall Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.WallLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getWallLiteral()
	 * @generated
	 */
	int WALL_LITERAL = 25;

	/**
	 * The meta object id for the '{@link robotmodel.AheadLiteral <em>Ahead Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.AheadLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getAheadLiteral()
	 * @generated
	 */
	int AHEAD_LITERAL = 26;

	/**
	 * The meta object id for the '{@link robotmodel.NormalExpressionLiteral <em>Normal Expression Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.NormalExpressionLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getNormalExpressionLiteral()
	 * @generated
	 */
	int NORMAL_EXPRESSION_LITERAL = 27;

	/**
	 * The meta object id for the '{@link robotmodel.GridLiteral <em>Grid Literal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotmodel.GridLiteral
	 * @see robotmodel.impl.RobotmodelPackageImpl#getGridLiteral()
	 * @generated
	 */
	int GRID_LITERAL = 28;


	/**
	 * Returns the meta object for class '{@link robotmodel.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see robotmodel.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference '{@link robotmodel.Script#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see robotmodel.Script#getName()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link robotmodel.Script#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see robotmodel.Script#getCommand()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Command();

	/**
	 * Returns the meta object for class '{@link robotmodel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see robotmodel.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link robotmodel.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see robotmodel.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link robotmodel.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robotmodel.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link robotmodel.IfStatement#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see robotmodel.IfStatement#getCommand()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link robotmodel.IfStatement#getCommand2 <em>Command2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command2</em>'.
	 * @see robotmodel.IfStatement#getCommand2()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Command2();

	/**
	 * Returns the meta object for class '{@link robotmodel.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see robotmodel.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link robotmodel.WhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robotmodel.WhileStatement#getCondition()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link robotmodel.WhileStatement#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see robotmodel.WhileStatement#getCommand()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Command();

	/**
	 * Returns the meta object for class '{@link robotmodel.RepeatStatement <em>Repeat Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Statement</em>'.
	 * @see robotmodel.RepeatStatement
	 * @generated
	 */
	EClass getRepeatStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link robotmodel.RepeatStatement#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see robotmodel.RepeatStatement#getCommand()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_Command();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.RepeatStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see robotmodel.RepeatStatement#getCondition()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EAttribute getRepeatStatement_Condition();

	/**
	 * Returns the meta object for class '{@link robotmodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see robotmodel.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link robotmodel.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see robotmodel.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.Comment#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see robotmodel.Comment#getCommand()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Command();

	/**
	 * Returns the meta object for class '{@link robotmodel.TraceCommand <em>Trace Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Command</em>'.
	 * @see robotmodel.TraceCommand
	 * @generated
	 */
	EClass getTraceCommand();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.TraceCommand#getTraceLiteral <em>Trace Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Literal</em>'.
	 * @see robotmodel.TraceCommand#getTraceLiteral()
	 * @see #getTraceCommand()
	 * @generated
	 */
	EAttribute getTraceCommand_TraceLiteral();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.TraceCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see robotmodel.TraceCommand#getCommand()
	 * @see #getTraceCommand()
	 * @generated
	 */
	EAttribute getTraceCommand_Command();

	/**
	 * Returns the meta object for class '{@link robotmodel.AtomicCommand <em>Atomic Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Command</em>'.
	 * @see robotmodel.AtomicCommand
	 * @generated
	 */
	EClass getAtomicCommand();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.AtomicCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see robotmodel.AtomicCommand#getCommand()
	 * @see #getAtomicCommand()
	 * @generated
	 */
	EAttribute getAtomicCommand_Command();

	/**
	 * Returns the meta object for class '{@link robotmodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see robotmodel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link robotmodel.NegatedExpression <em>Negated Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negated Expression</em>'.
	 * @see robotmodel.NegatedExpression
	 * @generated
	 */
	EClass getNegatedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link robotmodel.NegatedExpression#getNegatedExpression <em>Negated Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negated Expression</em>'.
	 * @see robotmodel.NegatedExpression#getNegatedExpression()
	 * @see #getNegatedExpression()
	 * @generated
	 */
	EReference getNegatedExpression_NegatedExpression();

	/**
	 * Returns the meta object for class '{@link robotmodel.AtomicExpression <em>Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Expression</em>'.
	 * @see robotmodel.AtomicExpression
	 * @generated
	 */
	EClass getAtomicExpression();

	/**
	 * Returns the meta object for class '{@link robotmodel.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see robotmodel.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link robotmodel.BinaryExpression#getLeftExpression <em>Left Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expression</em>'.
	 * @see robotmodel.BinaryExpression#getLeftExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftExpression();

	/**
	 * Returns the meta object for the containment reference '{@link robotmodel.BinaryExpression#getRightExpression <em>Right Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expression</em>'.
	 * @see robotmodel.BinaryExpression#getRightExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightExpression();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see robotmodel.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link robotmodel.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see robotmodel.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for class '{@link robotmodel.HeadingExpression <em>Heading Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading Expression</em>'.
	 * @see robotmodel.HeadingExpression
	 * @generated
	 */
	EClass getHeadingExpression();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.HeadingExpression#getHeadingLiteral <em>Heading Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading Literal</em>'.
	 * @see robotmodel.HeadingExpression#getHeadingLiteral()
	 * @see #getHeadingExpression()
	 * @generated
	 */
	EAttribute getHeadingExpression_HeadingLiteral();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.HeadingExpression#getDirectionLiteral <em>Direction Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Literal</em>'.
	 * @see robotmodel.HeadingExpression#getDirectionLiteral()
	 * @see #getHeadingExpression()
	 * @generated
	 */
	EAttribute getHeadingExpression_DirectionLiteral();

	/**
	 * Returns the meta object for class '{@link robotmodel.WallAheadExpression <em>Wall Ahead Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall Ahead Expression</em>'.
	 * @see robotmodel.WallAheadExpression
	 * @generated
	 */
	EClass getWallAheadExpression();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.WallAheadExpression#getWall <em>Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wall</em>'.
	 * @see robotmodel.WallAheadExpression#getWall()
	 * @see #getWallAheadExpression()
	 * @generated
	 */
	EAttribute getWallAheadExpression_Wall();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.WallAheadExpression#getAhead <em>Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ahead</em>'.
	 * @see robotmodel.WallAheadExpression#getAhead()
	 * @see #getWallAheadExpression()
	 * @generated
	 */
	EAttribute getWallAheadExpression_Ahead();

	/**
	 * Returns the meta object for class '{@link robotmodel.NormalExpression <em>Normal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Expression</em>'.
	 * @see robotmodel.NormalExpression
	 * @generated
	 */
	EClass getNormalExpression();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.NormalExpression#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see robotmodel.NormalExpression#getLiteral()
	 * @see #getNormalExpression()
	 * @generated
	 */
	EAttribute getNormalExpression_Literal();

	/**
	 * Returns the meta object for class '{@link robotmodel.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see robotmodel.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for class '{@link robotmodel.ConstructionStatement <em>Construction Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construction Statement</em>'.
	 * @see robotmodel.ConstructionStatement
	 * @generated
	 */
	EClass getConstructionStatement();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.ConstructionStatement#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see robotmodel.ConstructionStatement#getCommand()
	 * @see #getConstructionStatement()
	 * @generated
	 */
	EAttribute getConstructionStatement_Command();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.ConstructionStatement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see robotmodel.ConstructionStatement#getX()
	 * @see #getConstructionStatement()
	 * @generated
	 */
	EAttribute getConstructionStatement_X();

	/**
	 * Returns the meta object for the attribute '{@link robotmodel.ConstructionStatement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see robotmodel.ConstructionStatement#getY()
	 * @see #getConstructionStatement()
	 * @generated
	 */
	EAttribute getConstructionStatement_Y();

	/**
	 * Returns the meta object for enum '{@link robotmodel.TraceLiteral <em>Trace Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trace Literal</em>'.
	 * @see robotmodel.TraceLiteral
	 * @generated
	 */
	EEnum getTraceLiteral();

	/**
	 * Returns the meta object for enum '{@link robotmodel.CommandLiteral <em>Command Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Literal</em>'.
	 * @see robotmodel.CommandLiteral
	 * @generated
	 */
	EEnum getCommandLiteral();

	/**
	 * Returns the meta object for enum '{@link robotmodel.OperatorLiteral <em>Operator Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Literal</em>'.
	 * @see robotmodel.OperatorLiteral
	 * @generated
	 */
	EEnum getOperatorLiteral();

	/**
	 * Returns the meta object for enum '{@link robotmodel.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Keyword</em>'.
	 * @see robotmodel.Keyword
	 * @generated
	 */
	EEnum getKeyword();

	/**
	 * Returns the meta object for enum '{@link robotmodel.DirectionLiteral <em>Direction Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Literal</em>'.
	 * @see robotmodel.DirectionLiteral
	 * @generated
	 */
	EEnum getDirectionLiteral();

	/**
	 * Returns the meta object for enum '{@link robotmodel.HeadingLiteral <em>Heading Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Heading Literal</em>'.
	 * @see robotmodel.HeadingLiteral
	 * @generated
	 */
	EEnum getHeadingLiteral();

	/**
	 * Returns the meta object for enum '{@link robotmodel.WallLiteral <em>Wall Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wall Literal</em>'.
	 * @see robotmodel.WallLiteral
	 * @generated
	 */
	EEnum getWallLiteral();

	/**
	 * Returns the meta object for enum '{@link robotmodel.AheadLiteral <em>Ahead Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ahead Literal</em>'.
	 * @see robotmodel.AheadLiteral
	 * @generated
	 */
	EEnum getAheadLiteral();

	/**
	 * Returns the meta object for enum '{@link robotmodel.NormalExpressionLiteral <em>Normal Expression Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Normal Expression Literal</em>'.
	 * @see robotmodel.NormalExpressionLiteral
	 * @generated
	 */
	EEnum getNormalExpressionLiteral();

	/**
	 * Returns the meta object for enum '{@link robotmodel.GridLiteral <em>Grid Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grid Literal</em>'.
	 * @see robotmodel.GridLiteral
	 * @generated
	 */
	EEnum getGridLiteral();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotmodelFactory getRobotmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robotmodel.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.ScriptImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__NAME = eINSTANCE.getScript_Name();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__COMMAND = eINSTANCE.getScript_Command();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.StatementImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.IfStatementImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__COMMAND = eINSTANCE.getIfStatement_Command();

		/**
		 * The meta object literal for the '<em><b>Command2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__COMMAND2 = eINSTANCE.getIfStatement_Command2();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.WhileStatementImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__COMMAND = eINSTANCE.getWhileStatement_Command();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.RepeatStatementImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getRepeatStatement()
		 * @generated
		 */
		EClass REPEAT_STATEMENT = eINSTANCE.getRepeatStatement();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__COMMAND = eINSTANCE.getRepeatStatement_Command();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_STATEMENT__CONDITION = eINSTANCE.getRepeatStatement_Condition();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.CommandImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.CommentImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMAND = eINSTANCE.getComment_Command();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.TraceCommandImpl <em>Trace Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.TraceCommandImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getTraceCommand()
		 * @generated
		 */
		EClass TRACE_COMMAND = eINSTANCE.getTraceCommand();

		/**
		 * The meta object literal for the '<em><b>Trace Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMAND__TRACE_LITERAL = eINSTANCE.getTraceCommand_TraceLiteral();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMAND__COMMAND = eINSTANCE.getTraceCommand_Command();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.AtomicCommandImpl <em>Atomic Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.AtomicCommandImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getAtomicCommand()
		 * @generated
		 */
		EClass ATOMIC_COMMAND = eINSTANCE.getAtomicCommand();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_COMMAND__COMMAND = eINSTANCE.getAtomicCommand_Command();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.ExpressionImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.NegatedExpressionImpl <em>Negated Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.NegatedExpressionImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getNegatedExpression()
		 * @generated
		 */
		EClass NEGATED_EXPRESSION = eINSTANCE.getNegatedExpression();

		/**
		 * The meta object literal for the '<em><b>Negated Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATED_EXPRESSION__NEGATED_EXPRESSION = eINSTANCE.getNegatedExpression_NegatedExpression();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.AtomicExpressionImpl <em>Atomic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.AtomicExpressionImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getAtomicExpression()
		 * @generated
		 */
		EClass ATOMIC_EXPRESSION = eINSTANCE.getAtomicExpression();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.BinaryExpressionImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_EXPRESSION = eINSTANCE.getBinaryExpression_LeftExpression();

		/**
		 * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_EXPRESSION = eINSTANCE.getBinaryExpression_RightExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.LayoutImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.HeadingExpressionImpl <em>Heading Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.HeadingExpressionImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getHeadingExpression()
		 * @generated
		 */
		EClass HEADING_EXPRESSION = eINSTANCE.getHeadingExpression();

		/**
		 * The meta object literal for the '<em><b>Heading Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING_EXPRESSION__HEADING_LITERAL = eINSTANCE.getHeadingExpression_HeadingLiteral();

		/**
		 * The meta object literal for the '<em><b>Direction Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING_EXPRESSION__DIRECTION_LITERAL = eINSTANCE.getHeadingExpression_DirectionLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.WallAheadExpressionImpl <em>Wall Ahead Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.WallAheadExpressionImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getWallAheadExpression()
		 * @generated
		 */
		EClass WALL_AHEAD_EXPRESSION = eINSTANCE.getWallAheadExpression();

		/**
		 * The meta object literal for the '<em><b>Wall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALL_AHEAD_EXPRESSION__WALL = eINSTANCE.getWallAheadExpression_Wall();

		/**
		 * The meta object literal for the '<em><b>Ahead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALL_AHEAD_EXPRESSION__AHEAD = eINSTANCE.getWallAheadExpression_Ahead();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.NormalExpressionImpl <em>Normal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.NormalExpressionImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getNormalExpression()
		 * @generated
		 */
		EClass NORMAL_EXPRESSION = eINSTANCE.getNormalExpression();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_EXPRESSION__LITERAL = eINSTANCE.getNormalExpression_Literal();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.NameImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '{@link robotmodel.impl.ConstructionStatementImpl <em>Construction Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.impl.ConstructionStatementImpl
		 * @see robotmodel.impl.RobotmodelPackageImpl#getConstructionStatement()
		 * @generated
		 */
		EClass CONSTRUCTION_STATEMENT = eINSTANCE.getConstructionStatement();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTION_STATEMENT__COMMAND = eINSTANCE.getConstructionStatement_Command();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTION_STATEMENT__X = eINSTANCE.getConstructionStatement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTION_STATEMENT__Y = eINSTANCE.getConstructionStatement_Y();

		/**
		 * The meta object literal for the '{@link robotmodel.TraceLiteral <em>Trace Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.TraceLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getTraceLiteral()
		 * @generated
		 */
		EEnum TRACE_LITERAL = eINSTANCE.getTraceLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.CommandLiteral <em>Command Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.CommandLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getCommandLiteral()
		 * @generated
		 */
		EEnum COMMAND_LITERAL = eINSTANCE.getCommandLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.OperatorLiteral <em>Operator Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.OperatorLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getOperatorLiteral()
		 * @generated
		 */
		EEnum OPERATOR_LITERAL = eINSTANCE.getOperatorLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.Keyword <em>Keyword</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.Keyword
		 * @see robotmodel.impl.RobotmodelPackageImpl#getKeyword()
		 * @generated
		 */
		EEnum KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '{@link robotmodel.DirectionLiteral <em>Direction Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.DirectionLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getDirectionLiteral()
		 * @generated
		 */
		EEnum DIRECTION_LITERAL = eINSTANCE.getDirectionLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.HeadingLiteral <em>Heading Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.HeadingLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getHeadingLiteral()
		 * @generated
		 */
		EEnum HEADING_LITERAL = eINSTANCE.getHeadingLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.WallLiteral <em>Wall Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.WallLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getWallLiteral()
		 * @generated
		 */
		EEnum WALL_LITERAL = eINSTANCE.getWallLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.AheadLiteral <em>Ahead Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.AheadLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getAheadLiteral()
		 * @generated
		 */
		EEnum AHEAD_LITERAL = eINSTANCE.getAheadLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.NormalExpressionLiteral <em>Normal Expression Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.NormalExpressionLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getNormalExpressionLiteral()
		 * @generated
		 */
		EEnum NORMAL_EXPRESSION_LITERAL = eINSTANCE.getNormalExpressionLiteral();

		/**
		 * The meta object literal for the '{@link robotmodel.GridLiteral <em>Grid Literal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotmodel.GridLiteral
		 * @see robotmodel.impl.RobotmodelPackageImpl#getGridLiteral()
		 * @generated
		 */
		EEnum GRID_LITERAL = eINSTANCE.getGridLiteral();

	}

} //RobotmodelPackage
