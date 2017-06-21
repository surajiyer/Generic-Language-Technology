/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl1.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl1.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getOperatorLiteralAccess().getAlternatives(), "rule__OperatorLiteral__Alternatives");
					put(grammarAccess.getDirectionLiteralAccess().getAlternatives(), "rule__DirectionLiteral__Alternatives");
					put(grammarAccess.getNormalExpressionLiteralAccess().getAlternatives(), "rule__NormalExpressionLiteral__Alternatives");
					put(grammarAccess.getCommandLiteralAccess().getAlternatives(), "rule__CommandLiteral__Alternatives");
					put(grammarAccess.getGridLiteralAccess().getAlternatives(), "rule__GridLiteral__Alternatives");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_4(), "rule__IfStatement__Group_4__0");
					put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
					put(grammarAccess.getRepeatStatementAccess().getGroup(), "rule__RepeatStatement__Group__0");
					put(grammarAccess.getCommentAccess().getGroup(), "rule__Comment__Group__0");
					put(grammarAccess.getTraceCommandAccess().getGroup(), "rule__TraceCommand__Group__0");
					put(grammarAccess.getConstructionStatementAccess().getGroup(), "rule__ConstructionStatement__Group__0");
					put(grammarAccess.getNegatedExpressionAccess().getGroup(), "rule__NegatedExpression__Group__0");
					put(grammarAccess.getBinaryExpressionAccess().getGroup(), "rule__BinaryExpression__Group__0");
					put(grammarAccess.getHeadingExpressionAccess().getGroup(), "rule__HeadingExpression__Group__0");
					put(grammarAccess.getWallAheadExpressionAccess().getGroup(), "rule__WallAheadExpression__Group__0");
					put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
					put(grammarAccess.getStringExpressionAccess().getGroup(), "rule__StringExpression__Group__0");
					put(grammarAccess.getScriptAccess().getNameAssignment_1(), "rule__Script__NameAssignment_1");
					put(grammarAccess.getScriptAccess().getStatementsAssignment_4(), "rule__Script__StatementsAssignment_4");
					put(grammarAccess.getIfStatementAccess().getIfExpressionAssignment_1(), "rule__IfStatement__IfExpressionAssignment_1");
					put(grammarAccess.getIfStatementAccess().getStatementsAssignment_3(), "rule__IfStatement__StatementsAssignment_3");
					put(grammarAccess.getIfStatementAccess().getStatements2Assignment_4_2(), "rule__IfStatement__Statements2Assignment_4_2");
					put(grammarAccess.getWhileStatementAccess().getWhileExpressionAssignment_1(), "rule__WhileStatement__WhileExpressionAssignment_1");
					put(grammarAccess.getWhileStatementAccess().getStatementsAssignment_3(), "rule__WhileStatement__StatementsAssignment_3");
					put(grammarAccess.getRepeatStatementAccess().getIntegerAssignment_1(), "rule__RepeatStatement__IntegerAssignment_1");
					put(grammarAccess.getRepeatStatementAccess().getStatementsAssignment_3(), "rule__RepeatStatement__StatementsAssignment_3");
					put(grammarAccess.getTraceCommandAccess().getStringAssignment_1(), "rule__TraceCommand__StringAssignment_1");
					put(grammarAccess.getAtomicCommandAccess().getLiteralAssignment(), "rule__AtomicCommand__LiteralAssignment");
					put(grammarAccess.getConstructionStatementAccess().getCommandAssignment_0(), "rule__ConstructionStatement__CommandAssignment_0");
					put(grammarAccess.getConstructionStatementAccess().getIntegersAssignment_3(), "rule__ConstructionStatement__IntegersAssignment_3");
					put(grammarAccess.getConstructionStatementAccess().getIntegersAssignment_6(), "rule__ConstructionStatement__IntegersAssignment_6");
					put(grammarAccess.getNegatedExpressionAccess().getNegatedExpressionAssignment_1(), "rule__NegatedExpression__NegatedExpressionAssignment_1");
					put(grammarAccess.getBinaryExpressionAccess().getLeftExpressionAssignment_1(), "rule__BinaryExpression__LeftExpressionAssignment_1");
					put(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_2(), "rule__BinaryExpression__OperatorAssignment_2");
					put(grammarAccess.getBinaryExpressionAccess().getRightExpressionAssignment_3(), "rule__BinaryExpression__RightExpressionAssignment_3");
					put(grammarAccess.getHeadingExpressionAccess().getHeadingLiteralAssignment_0(), "rule__HeadingExpression__HeadingLiteralAssignment_0");
					put(grammarAccess.getHeadingExpressionAccess().getDirectionLiteralAssignment_1(), "rule__HeadingExpression__DirectionLiteralAssignment_1");
					put(grammarAccess.getWallAheadExpressionAccess().getWallAssignment_0(), "rule__WallAheadExpression__WallAssignment_0");
					put(grammarAccess.getWallAheadExpressionAccess().getAheadAssignment_1(), "rule__WallAheadExpression__AheadAssignment_1");
					put(grammarAccess.getNormalExpressionAccess().getLiteralAssignment(), "rule__NormalExpression__LiteralAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}