/**
 */
package robotmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robotmodel.AheadLiteral;
import robotmodel.AtomicCommand;
import robotmodel.AtomicExpression;
import robotmodel.BinaryExpression;
import robotmodel.Command;
import robotmodel.CommandLiteral;
import robotmodel.Comment;
import robotmodel.ConstructionStatement;
import robotmodel.DirectionLiteral;
import robotmodel.Expression;
import robotmodel.GridLiteral;
import robotmodel.HeadingExpression;
import robotmodel.HeadingLiteral;
import robotmodel.IfStatement;
import robotmodel.Keyword;
import robotmodel.Layout;
import robotmodel.NegatedExpression;
import robotmodel.NormalExpression;
import robotmodel.NormalExpressionLiteral;
import robotmodel.OperatorLiteral;
import robotmodel.RepeatStatement;
import robotmodel.RobotmodelFactory;
import robotmodel.RobotmodelPackage;
import robotmodel.Script;
import robotmodel.Statement;
import robotmodel.TraceCommand;
import robotmodel.TraceLiteral;
import robotmodel.WallAheadExpression;
import robotmodel.WallLiteral;
import robotmodel.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotmodelPackageImpl extends EPackageImpl implements RobotmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wallAheadExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum traceLiteralEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandLiteralEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorLiteralEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keywordEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionLiteralEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum headingLiteralEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wallLiteralEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aheadLiteralEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum normalExpressionLiteralEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gridLiteralEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see robotmodel.RobotmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotmodelPackageImpl() {
		super(eNS_URI, RobotmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RobotmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotmodelPackage init() {
		if (isInited) return (RobotmodelPackage)EPackage.Registry.INSTANCE.getEPackage(RobotmodelPackage.eNS_URI);

		// Obtain or create and register package
		RobotmodelPackageImpl theRobotmodelPackage = (RobotmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RobotmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RobotmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRobotmodelPackage.createPackageContents();

		// Initialize created meta-data
		theRobotmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRobotmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotmodelPackage.eNS_URI, theRobotmodelPackage);
		return theRobotmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Command() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Name() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Condition() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Command() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Command2() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileStatement_Condition() {
		return (EReference)whileStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileStatement_Command() {
		return (EReference)whileStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatStatement() {
		return repeatStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatStatement_Command() {
		return (EReference)repeatStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatStatement_Condition() {
		return (EAttribute)repeatStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Command() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceCommand() {
		return traceCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceCommand_TraceLiteral() {
		return (EAttribute)traceCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceCommand_Command() {
		return (EAttribute)traceCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicCommand() {
		return atomicCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicCommand_Command() {
		return (EAttribute)atomicCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegatedExpression() {
		return negatedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegatedExpression_NegatedExpression() {
		return (EReference)negatedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicExpression() {
		return atomicExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_LeftExpression() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_RightExpression() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadingExpression() {
		return headingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadingExpression_HeadingLiteral() {
		return (EAttribute)headingExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadingExpression_DirectionLiteral() {
		return (EAttribute)headingExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallAheadExpression() {
		return wallAheadExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallAheadExpression_Wall() {
		return (EAttribute)wallAheadExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallAheadExpression_Ahead() {
		return (EAttribute)wallAheadExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalExpression() {
		return normalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalExpression_Literal() {
		return (EAttribute)normalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructionStatement() {
		return constructionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructionStatement_Command() {
		return (EAttribute)constructionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructionStatement_X() {
		return (EAttribute)constructionStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructionStatement_Y() {
		return (EAttribute)constructionStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTraceLiteral() {
		return traceLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommandLiteral() {
		return commandLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorLiteral() {
		return operatorLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeyword() {
		return keywordEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionLiteral() {
		return directionLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHeadingLiteral() {
		return headingLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWallLiteral() {
		return wallLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAheadLiteral() {
		return aheadLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNormalExpressionLiteral() {
		return normalExpressionLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGridLiteral() {
		return gridLiteralEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotmodelFactory getRobotmodelFactory() {
		return (RobotmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scriptEClass = createEClass(SCRIPT);
		createEReference(scriptEClass, SCRIPT__COMMAND);
		createEAttribute(scriptEClass, SCRIPT__NAME);

		statementEClass = createEClass(STATEMENT);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__CONDITION);
		createEReference(ifStatementEClass, IF_STATEMENT__COMMAND);
		createEReference(ifStatementEClass, IF_STATEMENT__COMMAND2);

		whileStatementEClass = createEClass(WHILE_STATEMENT);
		createEReference(whileStatementEClass, WHILE_STATEMENT__CONDITION);
		createEReference(whileStatementEClass, WHILE_STATEMENT__COMMAND);

		repeatStatementEClass = createEClass(REPEAT_STATEMENT);
		createEReference(repeatStatementEClass, REPEAT_STATEMENT__COMMAND);
		createEAttribute(repeatStatementEClass, REPEAT_STATEMENT__CONDITION);

		commandEClass = createEClass(COMMAND);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__COMMAND);

		traceCommandEClass = createEClass(TRACE_COMMAND);
		createEAttribute(traceCommandEClass, TRACE_COMMAND__TRACE_LITERAL);
		createEAttribute(traceCommandEClass, TRACE_COMMAND__COMMAND);

		atomicCommandEClass = createEClass(ATOMIC_COMMAND);
		createEAttribute(atomicCommandEClass, ATOMIC_COMMAND__COMMAND);

		expressionEClass = createEClass(EXPRESSION);

		negatedExpressionEClass = createEClass(NEGATED_EXPRESSION);
		createEReference(negatedExpressionEClass, NEGATED_EXPRESSION__NEGATED_EXPRESSION);

		atomicExpressionEClass = createEClass(ATOMIC_EXPRESSION);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_EXPRESSION);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);

		layoutEClass = createEClass(LAYOUT);

		headingExpressionEClass = createEClass(HEADING_EXPRESSION);
		createEAttribute(headingExpressionEClass, HEADING_EXPRESSION__HEADING_LITERAL);
		createEAttribute(headingExpressionEClass, HEADING_EXPRESSION__DIRECTION_LITERAL);

		wallAheadExpressionEClass = createEClass(WALL_AHEAD_EXPRESSION);
		createEAttribute(wallAheadExpressionEClass, WALL_AHEAD_EXPRESSION__WALL);
		createEAttribute(wallAheadExpressionEClass, WALL_AHEAD_EXPRESSION__AHEAD);

		normalExpressionEClass = createEClass(NORMAL_EXPRESSION);
		createEAttribute(normalExpressionEClass, NORMAL_EXPRESSION__LITERAL);

		constructionStatementEClass = createEClass(CONSTRUCTION_STATEMENT);
		createEAttribute(constructionStatementEClass, CONSTRUCTION_STATEMENT__COMMAND);
		createEAttribute(constructionStatementEClass, CONSTRUCTION_STATEMENT__X);
		createEAttribute(constructionStatementEClass, CONSTRUCTION_STATEMENT__Y);

		// Create enums
		traceLiteralEEnum = createEEnum(TRACE_LITERAL);
		commandLiteralEEnum = createEEnum(COMMAND_LITERAL);
		operatorLiteralEEnum = createEEnum(OPERATOR_LITERAL);
		keywordEEnum = createEEnum(KEYWORD);
		directionLiteralEEnum = createEEnum(DIRECTION_LITERAL);
		headingLiteralEEnum = createEEnum(HEADING_LITERAL);
		wallLiteralEEnum = createEEnum(WALL_LITERAL);
		aheadLiteralEEnum = createEEnum(AHEAD_LITERAL);
		normalExpressionLiteralEEnum = createEEnum(NORMAL_EXPRESSION_LITERAL);
		gridLiteralEEnum = createEEnum(GRID_LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ifStatementEClass.getESuperTypes().add(this.getStatement());
		whileStatementEClass.getESuperTypes().add(this.getStatement());
		repeatStatementEClass.getESuperTypes().add(this.getStatement());
		commandEClass.getESuperTypes().add(this.getStatement());
		commentEClass.getESuperTypes().add(this.getCommand());
		traceCommandEClass.getESuperTypes().add(this.getCommand());
		atomicCommandEClass.getESuperTypes().add(this.getCommand());
		negatedExpressionEClass.getESuperTypes().add(this.getExpression());
		atomicExpressionEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		headingExpressionEClass.getESuperTypes().add(this.getAtomicExpression());
		wallAheadExpressionEClass.getESuperTypes().add(this.getAtomicExpression());
		normalExpressionEClass.getESuperTypes().add(this.getAtomicExpression());
		constructionStatementEClass.getESuperTypes().add(this.getStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScript_Command(), this.getStatement(), null, "command", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScript_Name(), ecorePackage.getEString(), "name", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_Command(), this.getStatement(), null, "command", null, 1, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_Command2(), this.getStatement(), null, "command2", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileStatement_Command(), this.getStatement(), null, "command", null, 0, -1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatStatementEClass, RepeatStatement.class, "RepeatStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatStatement_Command(), this.getStatement(), null, "command", null, 0, -1, RepeatStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepeatStatement_Condition(), ecorePackage.getEInt(), "condition", null, 0, 1, RepeatStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Command(), ecorePackage.getEString(), "command", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceCommandEClass, TraceCommand.class, "TraceCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceCommand_TraceLiteral(), this.getTraceLiteral(), "traceLiteral", null, 1, 1, TraceCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceCommand_Command(), ecorePackage.getEString(), "command", null, 0, 1, TraceCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicCommandEClass, AtomicCommand.class, "AtomicCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicCommand_Command(), this.getCommandLiteral(), "command", null, 1, 1, AtomicCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negatedExpressionEClass, NegatedExpression.class, "NegatedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegatedExpression_NegatedExpression(), this.getExpression(), null, "negatedExpression", null, 1, 1, NegatedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicExpressionEClass, AtomicExpression.class, "AtomicExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_LeftExpression(), this.getExpression(), null, "leftExpression", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_RightExpression(), this.getExpression(), null, "rightExpression", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExpression_Operator(), this.getOperatorLiteral(), "operator", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headingExpressionEClass, HeadingExpression.class, "HeadingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeadingExpression_HeadingLiteral(), this.getHeadingLiteral(), "headingLiteral", null, 1, 1, HeadingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeadingExpression_DirectionLiteral(), this.getDirectionLiteral(), "directionLiteral", null, 1, 1, HeadingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wallAheadExpressionEClass, WallAheadExpression.class, "WallAheadExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWallAheadExpression_Wall(), this.getWallLiteral(), "wall", null, 1, 1, WallAheadExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallAheadExpression_Ahead(), this.getAheadLiteral(), "ahead", null, 1, 1, WallAheadExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalExpressionEClass, NormalExpression.class, "NormalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormalExpression_Literal(), this.getNormalExpressionLiteral(), "literal", null, 1, 1, NormalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructionStatementEClass, ConstructionStatement.class, "ConstructionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstructionStatement_Command(), this.getGridLiteral(), "command", null, 0, 1, ConstructionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructionStatement_X(), ecorePackage.getEInt(), "x", null, 1, 1, ConstructionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructionStatement_Y(), ecorePackage.getEInt(), "y", null, 1, 1, ConstructionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(traceLiteralEEnum, TraceLiteral.class, "TraceLiteral");
		addEEnumLiteral(traceLiteralEEnum, TraceLiteral.TRACE);

		initEEnum(commandLiteralEEnum, CommandLiteral.class, "CommandLiteral");
		addEEnumLiteral(commandLiteralEEnum, CommandLiteral.STEP);
		addEEnumLiteral(commandLiteralEEnum, CommandLiteral.TURN_LEFT);
		addEEnumLiteral(commandLiteralEEnum, CommandLiteral.DROP);
		addEEnumLiteral(commandLiteralEEnum, CommandLiteral.PICK);

		initEEnum(operatorLiteralEEnum, OperatorLiteral.class, "OperatorLiteral");
		addEEnumLiteral(operatorLiteralEEnum, OperatorLiteral.AND);
		addEEnumLiteral(operatorLiteralEEnum, OperatorLiteral.OR);

		initEEnum(keywordEEnum, Keyword.class, "Keyword");
		addEEnumLiteral(keywordEEnum, Keyword.SCRIPT);
		addEEnumLiteral(keywordEEnum, Keyword.RUNS);
		addEEnumLiteral(keywordEEnum, Keyword.AS);
		addEEnumLiteral(keywordEEnum, Keyword.END);
		addEEnumLiteral(keywordEEnum, Keyword.STEP);
		addEEnumLiteral(keywordEEnum, Keyword.TURN_LEFT);
		addEEnumLiteral(keywordEEnum, Keyword.DROP);
		addEEnumLiteral(keywordEEnum, Keyword.PICK);
		addEEnumLiteral(keywordEEnum, Keyword.TRACE);
		addEEnumLiteral(keywordEEnum, Keyword.FULL);
		addEEnumLiteral(keywordEEnum, Keyword.HEADING);
		addEEnumLiteral(keywordEEnum, Keyword.NORTH);
		addEEnumLiteral(keywordEEnum, Keyword.IF);
		addEEnumLiteral(keywordEEnum, Keyword.DO);
		addEEnumLiteral(keywordEEnum, Keyword.ELSE);
		addEEnumLiteral(keywordEEnum, Keyword.WHILE);
		addEEnumLiteral(keywordEEnum, Keyword.REPEAT);
		addEEnumLiteral(keywordEEnum, Keyword.TIMES);

		initEEnum(directionLiteralEEnum, DirectionLiteral.class, "DirectionLiteral");
		addEEnumLiteral(directionLiteralEEnum, DirectionLiteral.NORTH);
		addEEnumLiteral(directionLiteralEEnum, DirectionLiteral.SOUTH);
		addEEnumLiteral(directionLiteralEEnum, DirectionLiteral.EAST);
		addEEnumLiteral(directionLiteralEEnum, DirectionLiteral.WEST);

		initEEnum(headingLiteralEEnum, HeadingLiteral.class, "HeadingLiteral");
		addEEnumLiteral(headingLiteralEEnum, HeadingLiteral.HEADING);

		initEEnum(wallLiteralEEnum, WallLiteral.class, "WallLiteral");
		addEEnumLiteral(wallLiteralEEnum, WallLiteral.WALL);

		initEEnum(aheadLiteralEEnum, AheadLiteral.class, "AheadLiteral");
		addEEnumLiteral(aheadLiteralEEnum, AheadLiteral.AHEAD);

		initEEnum(normalExpressionLiteralEEnum, NormalExpressionLiteral.class, "NormalExpressionLiteral");
		addEEnumLiteral(normalExpressionLiteralEEnum, NormalExpressionLiteral.FULL);
		addEEnumLiteral(normalExpressionLiteralEEnum, NormalExpressionLiteral.MARK);

		initEEnum(gridLiteralEEnum, GridLiteral.class, "GridLiteral");
		addEEnumLiteral(gridLiteralEEnum, GridLiteral.BUILD_WALL);
		addEEnumLiteral(gridLiteralEEnum, GridLiteral.DESTROY_WALL);
		addEEnumLiteral(gridLiteralEEnum, GridLiteral.PICK_MARK);
		addEEnumLiteral(gridLiteralEEnum, GridLiteral.DROP_MARK);

		// Create resource
		createResource(eNS_URI);
	}

} //RobotmodelPackageImpl
