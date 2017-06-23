/**
 */
package robotmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robotmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotmodelFactoryImpl extends EFactoryImpl implements RobotmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotmodelFactory init() {
		try {
			RobotmodelFactory theRobotmodelFactory = (RobotmodelFactory)EPackage.Registry.INSTANCE.getEFactory(RobotmodelPackage.eNS_URI);
			if (theRobotmodelFactory != null) {
				return theRobotmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RobotmodelPackage.SCRIPT: return createScript();
			case RobotmodelPackage.IF_STATEMENT: return createIfStatement();
			case RobotmodelPackage.WHILE_STATEMENT: return createWhileStatement();
			case RobotmodelPackage.REPEAT_STATEMENT: return createRepeatStatement();
			case RobotmodelPackage.COMMENT: return createComment();
			case RobotmodelPackage.TRACE_COMMAND: return createTraceCommand();
			case RobotmodelPackage.ATOMIC_COMMAND: return createAtomicCommand();
			case RobotmodelPackage.NEGATED_EXPRESSION: return createNegatedExpression();
			case RobotmodelPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case RobotmodelPackage.LAYOUT: return createLayout();
			case RobotmodelPackage.HEADING_EXPRESSION: return createHeadingExpression();
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION: return createWallAheadExpression();
			case RobotmodelPackage.NORMAL_EXPRESSION: return createNormalExpression();
			case RobotmodelPackage.CONSTRUCTION_STATEMENT: return createConstructionStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RobotmodelPackage.TRACE_LITERAL:
				return createTraceLiteralFromString(eDataType, initialValue);
			case RobotmodelPackage.COMMAND_LITERAL:
				return createCommandLiteralFromString(eDataType, initialValue);
			case RobotmodelPackage.OPERATOR_LITERAL:
				return createOperatorLiteralFromString(eDataType, initialValue);
			case RobotmodelPackage.KEYWORD:
				return createKeywordFromString(eDataType, initialValue);
			case RobotmodelPackage.DIRECTION_LITERAL:
				return createDirectionLiteralFromString(eDataType, initialValue);
			case RobotmodelPackage.HEADING_LITERAL:
				return createHeadingLiteralFromString(eDataType, initialValue);
			case RobotmodelPackage.WALL_LITERAL:
				return createWallLiteralFromString(eDataType, initialValue);
			case RobotmodelPackage.AHEAD_LITERAL:
				return createAheadLiteralFromString(eDataType, initialValue);
			case RobotmodelPackage.NORMAL_EXPRESSION_LITERAL:
				return createNormalExpressionLiteralFromString(eDataType, initialValue);
			case RobotmodelPackage.GRID_LITERAL:
				return createGridLiteralFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RobotmodelPackage.TRACE_LITERAL:
				return convertTraceLiteralToString(eDataType, instanceValue);
			case RobotmodelPackage.COMMAND_LITERAL:
				return convertCommandLiteralToString(eDataType, instanceValue);
			case RobotmodelPackage.OPERATOR_LITERAL:
				return convertOperatorLiteralToString(eDataType, instanceValue);
			case RobotmodelPackage.KEYWORD:
				return convertKeywordToString(eDataType, instanceValue);
			case RobotmodelPackage.DIRECTION_LITERAL:
				return convertDirectionLiteralToString(eDataType, instanceValue);
			case RobotmodelPackage.HEADING_LITERAL:
				return convertHeadingLiteralToString(eDataType, instanceValue);
			case RobotmodelPackage.WALL_LITERAL:
				return convertWallLiteralToString(eDataType, instanceValue);
			case RobotmodelPackage.AHEAD_LITERAL:
				return convertAheadLiteralToString(eDataType, instanceValue);
			case RobotmodelPackage.NORMAL_EXPRESSION_LITERAL:
				return convertNormalExpressionLiteralToString(eDataType, instanceValue);
			case RobotmodelPackage.GRID_LITERAL:
				return convertGridLiteralToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatStatement createRepeatStatement() {
		RepeatStatementImpl repeatStatement = new RepeatStatementImpl();
		return repeatStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceCommand createTraceCommand() {
		TraceCommandImpl traceCommand = new TraceCommandImpl();
		return traceCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicCommand createAtomicCommand() {
		AtomicCommandImpl atomicCommand = new AtomicCommandImpl();
		return atomicCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegatedExpression createNegatedExpression() {
		NegatedExpressionImpl negatedExpression = new NegatedExpressionImpl();
		return negatedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadingExpression createHeadingExpression() {
		HeadingExpressionImpl headingExpression = new HeadingExpressionImpl();
		return headingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallAheadExpression createWallAheadExpression() {
		WallAheadExpressionImpl wallAheadExpression = new WallAheadExpressionImpl();
		return wallAheadExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalExpression createNormalExpression() {
		NormalExpressionImpl normalExpression = new NormalExpressionImpl();
		return normalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructionStatement createConstructionStatement() {
		ConstructionStatementImpl constructionStatement = new ConstructionStatementImpl();
		return constructionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLiteral createTraceLiteralFromString(EDataType eDataType, String initialValue) {
		TraceLiteral result = TraceLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTraceLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLiteral createCommandLiteralFromString(EDataType eDataType, String initialValue) {
		CommandLiteral result = CommandLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorLiteral createOperatorLiteralFromString(EDataType eDataType, String initialValue) {
		OperatorLiteral result = OperatorLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword createKeywordFromString(EDataType eDataType, String initialValue) {
		Keyword result = Keyword.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeywordToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionLiteral createDirectionLiteralFromString(EDataType eDataType, String initialValue) {
		DirectionLiteral result = DirectionLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadingLiteral createHeadingLiteralFromString(EDataType eDataType, String initialValue) {
		HeadingLiteral result = HeadingLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeadingLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallLiteral createWallLiteralFromString(EDataType eDataType, String initialValue) {
		WallLiteral result = WallLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWallLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AheadLiteral createAheadLiteralFromString(EDataType eDataType, String initialValue) {
		AheadLiteral result = AheadLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAheadLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalExpressionLiteral createNormalExpressionLiteralFromString(EDataType eDataType, String initialValue) {
		NormalExpressionLiteral result = NormalExpressionLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalExpressionLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridLiteral createGridLiteralFromString(EDataType eDataType, String initialValue) {
		GridLiteral result = GridLiteral.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGridLiteralToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotmodelPackage getRobotmodelPackage() {
		return (RobotmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotmodelPackage getPackage() {
		return RobotmodelPackage.eINSTANCE;
	}

} //RobotmodelFactoryImpl
