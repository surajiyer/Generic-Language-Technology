package nl.tue.robot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.tue.robot.services.RobotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RL_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Script'", "'runs'", "'as'", "'end'", "'not'", "'('", "')'", "'if'", "'do'", "'else'", "'while'", "'repeat'", "'times'", "'trace'", "'at'", "'row:'", "','", "'col:'", "'and'", "'or'", "'heading'", "'north'", "'south'", "'east'", "'west'", "'wall'", "'ahead'", "'full'", "'mark'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'buildWall'", "'destroyWall'", "'pickMark'", "'dropMark'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_RL_COMMENT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRobotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRobot.g"; }



     	private RobotGrammarAccess grammarAccess;

        public InternalRobotParser(TokenStream input, RobotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Script";
       	}

       	@Override
       	protected RobotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScript"
    // InternalRobot.g:65:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalRobot.g:65:47: (iv_ruleScript= ruleScript EOF )
            // InternalRobot.g:66:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalRobot.g:72:1: ruleScript returns [EObject current=null] : ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_command_5_0= ruleStatement ) )* otherlv_6= 'end' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_command_5_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:78:2: ( ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_command_5_0= ruleStatement ) )* otherlv_6= 'end' ) )
            // InternalRobot.g:79:2: ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_command_5_0= ruleStatement ) )* otherlv_6= 'end' )
            {
            // InternalRobot.g:79:2: ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_command_5_0= ruleStatement ) )* otherlv_6= 'end' )
            // InternalRobot.g:80:3: () otherlv_1= 'Script' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_command_5_0= ruleStatement ) )* otherlv_6= 'end'
            {
            // InternalRobot.g:80:3: ()
            // InternalRobot.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScriptAccess().getScriptAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getScriptAccess().getScriptKeyword_1());
            		
            // InternalRobot.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRobot.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRobot.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalRobot.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getScriptAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScriptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getRunsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getScriptAccess().getAsKeyword_4());
            		
            // InternalRobot.g:117:3: ( (lv_command_5_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_RL_COMMENT||LA1_0==19||(LA1_0>=22 && LA1_0<=23)||LA1_0==25||(LA1_0>=41 && LA1_0<=48)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRobot.g:118:4: (lv_command_5_0= ruleStatement )
            	    {
            	    // InternalRobot.g:118:4: (lv_command_5_0= ruleStatement )
            	    // InternalRobot.g:119:5: lv_command_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScriptAccess().getCommandStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_command_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScriptRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_5_0,
            	    						"nl.tue.robot.Robot.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getScriptAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleStatement"
    // InternalRobot.g:144:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobot.g:144:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobot.g:145:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRobot.g:151:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_RepeatStatement_2 = null;

        EObject this_Comment_3 = null;

        EObject this_TraceCommand_4 = null;

        EObject this_AtomicCommand_5 = null;

        EObject this_ConstructionStatement_6 = null;



        	enterRule();

        try {
            // InternalRobot.g:157:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement ) )
            // InternalRobot.g:158:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement )
            {
            // InternalRobot.g:158:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case RULE_RL_COMMENT:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt2=6;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRobot.g:159:3: this_IfStatement_0= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:168:3: this_WhileStatement_1= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_1=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobot.g:177:3: this_RepeatStatement_2= ruleRepeatStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRepeatStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeatStatement_2=ruleRepeatStatement();

                    state._fsp--;


                    			current = this_RepeatStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobot.g:186:3: this_Comment_3= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCommentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_3=ruleComment();

                    state._fsp--;


                    			current = this_Comment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobot.g:195:3: this_TraceCommand_4= ruleTraceCommand
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTraceCommandParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TraceCommand_4=ruleTraceCommand();

                    state._fsp--;


                    			current = this_TraceCommand_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobot.g:204:3: this_AtomicCommand_5= ruleAtomicCommand
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAtomicCommandParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicCommand_5=ruleAtomicCommand();

                    state._fsp--;


                    			current = this_AtomicCommand_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobot.g:213:3: this_ConstructionStatement_6= ruleConstructionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConstructionStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstructionStatement_6=ruleConstructionStatement();

                    state._fsp--;


                    			current = this_ConstructionStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalRobot.g:225:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRobot.g:225:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRobot.g:226:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRobot.g:232:1: ruleExpression returns [EObject current=null] : (this_NegatedExpression_0= ruleNegatedExpression | this_BinaryExpression_1= ruleBinaryExpression | this_HeadingExpression_2= ruleHeadingExpression | this_WallAheadExpression_3= ruleWallAheadExpression | this_NormalExpression_4= ruleNormalExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegatedExpression_0 = null;

        EObject this_BinaryExpression_1 = null;

        EObject this_HeadingExpression_2 = null;

        EObject this_WallAheadExpression_3 = null;

        EObject this_NormalExpression_4 = null;



        	enterRule();

        try {
            // InternalRobot.g:238:2: ( (this_NegatedExpression_0= ruleNegatedExpression | this_BinaryExpression_1= ruleBinaryExpression | this_HeadingExpression_2= ruleHeadingExpression | this_WallAheadExpression_3= ruleWallAheadExpression | this_NormalExpression_4= ruleNormalExpression ) )
            // InternalRobot.g:239:2: (this_NegatedExpression_0= ruleNegatedExpression | this_BinaryExpression_1= ruleBinaryExpression | this_HeadingExpression_2= ruleHeadingExpression | this_WallAheadExpression_3= ruleWallAheadExpression | this_NormalExpression_4= ruleNormalExpression )
            {
            // InternalRobot.g:239:2: (this_NegatedExpression_0= ruleNegatedExpression | this_BinaryExpression_1= ruleBinaryExpression | this_HeadingExpression_2= ruleHeadingExpression | this_WallAheadExpression_3= ruleWallAheadExpression | this_NormalExpression_4= ruleNormalExpression )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 37:
                {
                alt3=4;
                }
                break;
            case 39:
            case 40:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRobot.g:240:3: this_NegatedExpression_0= ruleNegatedExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNegatedExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NegatedExpression_0=ruleNegatedExpression();

                    state._fsp--;


                    			current = this_NegatedExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobot.g:249:3: this_BinaryExpression_1= ruleBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryExpression_1=ruleBinaryExpression();

                    state._fsp--;


                    			current = this_BinaryExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobot.g:258:3: this_HeadingExpression_2= ruleHeadingExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeadingExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeadingExpression_2=ruleHeadingExpression();

                    state._fsp--;


                    			current = this_HeadingExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobot.g:267:3: this_WallAheadExpression_3= ruleWallAheadExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getWallAheadExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WallAheadExpression_3=ruleWallAheadExpression();

                    state._fsp--;


                    			current = this_WallAheadExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobot.g:276:3: this_NormalExpression_4= ruleNormalExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNormalExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NormalExpression_4=ruleNormalExpression();

                    state._fsp--;


                    			current = this_NormalExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNegatedExpression"
    // InternalRobot.g:288:1: entryRuleNegatedExpression returns [EObject current=null] : iv_ruleNegatedExpression= ruleNegatedExpression EOF ;
    public final EObject entryRuleNegatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegatedExpression = null;


        try {
            // InternalRobot.g:288:58: (iv_ruleNegatedExpression= ruleNegatedExpression EOF )
            // InternalRobot.g:289:2: iv_ruleNegatedExpression= ruleNegatedExpression EOF
            {
             newCompositeNode(grammarAccess.getNegatedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegatedExpression=ruleNegatedExpression();

            state._fsp--;

             current =iv_ruleNegatedExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegatedExpression"


    // $ANTLR start "ruleNegatedExpression"
    // InternalRobot.g:295:1: ruleNegatedExpression returns [EObject current=null] : ( () otherlv_1= 'not' ( (lv_negatedExpression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleNegatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_negatedExpression_2_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:301:2: ( ( () otherlv_1= 'not' ( (lv_negatedExpression_2_0= ruleExpression ) ) ) )
            // InternalRobot.g:302:2: ( () otherlv_1= 'not' ( (lv_negatedExpression_2_0= ruleExpression ) ) )
            {
            // InternalRobot.g:302:2: ( () otherlv_1= 'not' ( (lv_negatedExpression_2_0= ruleExpression ) ) )
            // InternalRobot.g:303:3: () otherlv_1= 'not' ( (lv_negatedExpression_2_0= ruleExpression ) )
            {
            // InternalRobot.g:303:3: ()
            // InternalRobot.g:304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNegatedExpressionAccess().getNegatedExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNegatedExpressionAccess().getNotKeyword_1());
            		
            // InternalRobot.g:314:3: ( (lv_negatedExpression_2_0= ruleExpression ) )
            // InternalRobot.g:315:4: (lv_negatedExpression_2_0= ruleExpression )
            {
            // InternalRobot.g:315:4: (lv_negatedExpression_2_0= ruleExpression )
            // InternalRobot.g:316:5: lv_negatedExpression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNegatedExpressionAccess().getNegatedExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_negatedExpression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegatedExpressionRule());
            					}
            					set(
            						current,
            						"negatedExpression",
            						lv_negatedExpression_2_0,
            						"nl.tue.robot.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegatedExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalRobot.g:337:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalRobot.g:337:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalRobot.g:338:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalRobot.g:344:1: ruleBinaryExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) ( (lv_operator_3_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_leftExpression_2_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:350:2: ( ( () otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) ( (lv_operator_3_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalRobot.g:351:2: ( () otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) ( (lv_operator_3_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalRobot.g:351:2: ( () otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) ( (lv_operator_3_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalRobot.g:352:3: () otherlv_1= '(' ( (lv_leftExpression_2_0= ruleExpression ) ) ( (lv_operator_3_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // InternalRobot.g:352:3: ()
            // InternalRobot.g:353:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinaryExpressionAccess().getBinaryExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRobot.g:363:3: ( (lv_leftExpression_2_0= ruleExpression ) )
            // InternalRobot.g:364:4: (lv_leftExpression_2_0= ruleExpression )
            {
            // InternalRobot.g:364:4: (lv_leftExpression_2_0= ruleExpression )
            // InternalRobot.g:365:5: lv_leftExpression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_leftExpression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"leftExpression",
            						lv_leftExpression_2_0,
            						"nl.tue.robot.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:382:3: ( (lv_operator_3_0= ruleOperatorLiteral ) )
            // InternalRobot.g:383:4: (lv_operator_3_0= ruleOperatorLiteral )
            {
            // InternalRobot.g:383:4: (lv_operator_3_0= ruleOperatorLiteral )
            // InternalRobot.g:384:5: lv_operator_3_0= ruleOperatorLiteral
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorOperatorLiteralEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_operator_3_0=ruleOperatorLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"nl.tue.robot.Robot.OperatorLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:401:3: ( (lv_rightExpression_4_0= ruleExpression ) )
            // InternalRobot.g:402:4: (lv_rightExpression_4_0= ruleExpression )
            {
            // InternalRobot.g:402:4: (lv_rightExpression_4_0= ruleExpression )
            // InternalRobot.g:403:5: lv_rightExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_rightExpression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"rightExpression",
            						lv_rightExpression_4_0,
            						"nl.tue.robot.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleHeadingExpression"
    // InternalRobot.g:428:1: entryRuleHeadingExpression returns [EObject current=null] : iv_ruleHeadingExpression= ruleHeadingExpression EOF ;
    public final EObject entryRuleHeadingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadingExpression = null;


        try {
            // InternalRobot.g:428:58: (iv_ruleHeadingExpression= ruleHeadingExpression EOF )
            // InternalRobot.g:429:2: iv_ruleHeadingExpression= ruleHeadingExpression EOF
            {
             newCompositeNode(grammarAccess.getHeadingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeadingExpression=ruleHeadingExpression();

            state._fsp--;

             current =iv_ruleHeadingExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeadingExpression"


    // $ANTLR start "ruleHeadingExpression"
    // InternalRobot.g:435:1: ruleHeadingExpression returns [EObject current=null] : ( () ( (lv_headingLiteral_1_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_2_0= ruleDirectionLiteral ) ) ) ;
    public final EObject ruleHeadingExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_headingLiteral_1_0 = null;

        Enumerator lv_directionLiteral_2_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:441:2: ( ( () ( (lv_headingLiteral_1_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_2_0= ruleDirectionLiteral ) ) ) )
            // InternalRobot.g:442:2: ( () ( (lv_headingLiteral_1_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_2_0= ruleDirectionLiteral ) ) )
            {
            // InternalRobot.g:442:2: ( () ( (lv_headingLiteral_1_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_2_0= ruleDirectionLiteral ) ) )
            // InternalRobot.g:443:3: () ( (lv_headingLiteral_1_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_2_0= ruleDirectionLiteral ) )
            {
            // InternalRobot.g:443:3: ()
            // InternalRobot.g:444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadingExpressionAccess().getHeadingExpressionAction_0(),
            					current);
            			

            }

            // InternalRobot.g:450:3: ( (lv_headingLiteral_1_0= ruleHeadingLiteral ) )
            // InternalRobot.g:451:4: (lv_headingLiteral_1_0= ruleHeadingLiteral )
            {
            // InternalRobot.g:451:4: (lv_headingLiteral_1_0= ruleHeadingLiteral )
            // InternalRobot.g:452:5: lv_headingLiteral_1_0= ruleHeadingLiteral
            {

            					newCompositeNode(grammarAccess.getHeadingExpressionAccess().getHeadingLiteralHeadingLiteralEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_headingLiteral_1_0=ruleHeadingLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadingExpressionRule());
            					}
            					set(
            						current,
            						"headingLiteral",
            						lv_headingLiteral_1_0,
            						"nl.tue.robot.Robot.HeadingLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:469:3: ( (lv_directionLiteral_2_0= ruleDirectionLiteral ) )
            // InternalRobot.g:470:4: (lv_directionLiteral_2_0= ruleDirectionLiteral )
            {
            // InternalRobot.g:470:4: (lv_directionLiteral_2_0= ruleDirectionLiteral )
            // InternalRobot.g:471:5: lv_directionLiteral_2_0= ruleDirectionLiteral
            {

            					newCompositeNode(grammarAccess.getHeadingExpressionAccess().getDirectionLiteralDirectionLiteralEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_directionLiteral_2_0=ruleDirectionLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadingExpressionRule());
            					}
            					set(
            						current,
            						"directionLiteral",
            						lv_directionLiteral_2_0,
            						"nl.tue.robot.Robot.DirectionLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeadingExpression"


    // $ANTLR start "entryRuleWallAheadExpression"
    // InternalRobot.g:492:1: entryRuleWallAheadExpression returns [EObject current=null] : iv_ruleWallAheadExpression= ruleWallAheadExpression EOF ;
    public final EObject entryRuleWallAheadExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallAheadExpression = null;


        try {
            // InternalRobot.g:492:60: (iv_ruleWallAheadExpression= ruleWallAheadExpression EOF )
            // InternalRobot.g:493:2: iv_ruleWallAheadExpression= ruleWallAheadExpression EOF
            {
             newCompositeNode(grammarAccess.getWallAheadExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWallAheadExpression=ruleWallAheadExpression();

            state._fsp--;

             current =iv_ruleWallAheadExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWallAheadExpression"


    // $ANTLR start "ruleWallAheadExpression"
    // InternalRobot.g:499:1: ruleWallAheadExpression returns [EObject current=null] : ( () ( (lv_wall_1_0= ruleWallLiteral ) ) ( (lv_ahead_2_0= ruleAheadLiteral ) ) ) ;
    public final EObject ruleWallAheadExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_wall_1_0 = null;

        Enumerator lv_ahead_2_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:505:2: ( ( () ( (lv_wall_1_0= ruleWallLiteral ) ) ( (lv_ahead_2_0= ruleAheadLiteral ) ) ) )
            // InternalRobot.g:506:2: ( () ( (lv_wall_1_0= ruleWallLiteral ) ) ( (lv_ahead_2_0= ruleAheadLiteral ) ) )
            {
            // InternalRobot.g:506:2: ( () ( (lv_wall_1_0= ruleWallLiteral ) ) ( (lv_ahead_2_0= ruleAheadLiteral ) ) )
            // InternalRobot.g:507:3: () ( (lv_wall_1_0= ruleWallLiteral ) ) ( (lv_ahead_2_0= ruleAheadLiteral ) )
            {
            // InternalRobot.g:507:3: ()
            // InternalRobot.g:508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWallAheadExpressionAccess().getWallAheadExpressionAction_0(),
            					current);
            			

            }

            // InternalRobot.g:514:3: ( (lv_wall_1_0= ruleWallLiteral ) )
            // InternalRobot.g:515:4: (lv_wall_1_0= ruleWallLiteral )
            {
            // InternalRobot.g:515:4: (lv_wall_1_0= ruleWallLiteral )
            // InternalRobot.g:516:5: lv_wall_1_0= ruleWallLiteral
            {

            					newCompositeNode(grammarAccess.getWallAheadExpressionAccess().getWallWallLiteralEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_wall_1_0=ruleWallLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallAheadExpressionRule());
            					}
            					set(
            						current,
            						"wall",
            						lv_wall_1_0,
            						"nl.tue.robot.Robot.WallLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:533:3: ( (lv_ahead_2_0= ruleAheadLiteral ) )
            // InternalRobot.g:534:4: (lv_ahead_2_0= ruleAheadLiteral )
            {
            // InternalRobot.g:534:4: (lv_ahead_2_0= ruleAheadLiteral )
            // InternalRobot.g:535:5: lv_ahead_2_0= ruleAheadLiteral
            {

            					newCompositeNode(grammarAccess.getWallAheadExpressionAccess().getAheadAheadLiteralEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ahead_2_0=ruleAheadLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallAheadExpressionRule());
            					}
            					set(
            						current,
            						"ahead",
            						lv_ahead_2_0,
            						"nl.tue.robot.Robot.AheadLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWallAheadExpression"


    // $ANTLR start "entryRuleNormalExpression"
    // InternalRobot.g:556:1: entryRuleNormalExpression returns [EObject current=null] : iv_ruleNormalExpression= ruleNormalExpression EOF ;
    public final EObject entryRuleNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalExpression = null;


        try {
            // InternalRobot.g:556:57: (iv_ruleNormalExpression= ruleNormalExpression EOF )
            // InternalRobot.g:557:2: iv_ruleNormalExpression= ruleNormalExpression EOF
            {
             newCompositeNode(grammarAccess.getNormalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalExpression=ruleNormalExpression();

            state._fsp--;

             current =iv_ruleNormalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormalExpression"


    // $ANTLR start "ruleNormalExpression"
    // InternalRobot.g:563:1: ruleNormalExpression returns [EObject current=null] : ( () ( (lv_literal_1_0= ruleNormalExpressionLiteral ) ) ) ;
    public final EObject ruleNormalExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_literal_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:569:2: ( ( () ( (lv_literal_1_0= ruleNormalExpressionLiteral ) ) ) )
            // InternalRobot.g:570:2: ( () ( (lv_literal_1_0= ruleNormalExpressionLiteral ) ) )
            {
            // InternalRobot.g:570:2: ( () ( (lv_literal_1_0= ruleNormalExpressionLiteral ) ) )
            // InternalRobot.g:571:3: () ( (lv_literal_1_0= ruleNormalExpressionLiteral ) )
            {
            // InternalRobot.g:571:3: ()
            // InternalRobot.g:572:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalExpressionAccess().getNormalExpressionAction_0(),
            					current);
            			

            }

            // InternalRobot.g:578:3: ( (lv_literal_1_0= ruleNormalExpressionLiteral ) )
            // InternalRobot.g:579:4: (lv_literal_1_0= ruleNormalExpressionLiteral )
            {
            // InternalRobot.g:579:4: (lv_literal_1_0= ruleNormalExpressionLiteral )
            // InternalRobot.g:580:5: lv_literal_1_0= ruleNormalExpressionLiteral
            {

            					newCompositeNode(grammarAccess.getNormalExpressionAccess().getLiteralNormalExpressionLiteralEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_literal_1_0=ruleNormalExpressionLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNormalExpressionRule());
            					}
            					set(
            						current,
            						"literal",
            						lv_literal_1_0,
            						"nl.tue.robot.Robot.NormalExpressionLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormalExpression"


    // $ANTLR start "entryRuleComment"
    // InternalRobot.g:601:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRobot.g:601:48: (iv_ruleComment= ruleComment EOF )
            // InternalRobot.g:602:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalRobot.g:608:1: ruleComment returns [EObject current=null] : ( () ( (lv_command_1_0= RULE_RL_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalRobot.g:614:2: ( ( () ( (lv_command_1_0= RULE_RL_COMMENT ) ) ) )
            // InternalRobot.g:615:2: ( () ( (lv_command_1_0= RULE_RL_COMMENT ) ) )
            {
            // InternalRobot.g:615:2: ( () ( (lv_command_1_0= RULE_RL_COMMENT ) ) )
            // InternalRobot.g:616:3: () ( (lv_command_1_0= RULE_RL_COMMENT ) )
            {
            // InternalRobot.g:616:3: ()
            // InternalRobot.g:617:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }

            // InternalRobot.g:623:3: ( (lv_command_1_0= RULE_RL_COMMENT ) )
            // InternalRobot.g:624:4: (lv_command_1_0= RULE_RL_COMMENT )
            {
            // InternalRobot.g:624:4: (lv_command_1_0= RULE_RL_COMMENT )
            // InternalRobot.g:625:5: lv_command_1_0= RULE_RL_COMMENT
            {
            lv_command_1_0=(Token)match(input,RULE_RL_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_command_1_0, grammarAccess.getCommentAccess().getCommandRL_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_1_0,
            						"nl.tue.robot.Robot.RL_COMMENT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleIfStatement"
    // InternalRobot.g:645:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalRobot.g:645:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalRobot.g:646:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalRobot.g:652:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* (otherlv_5= 'else' otherlv_6= 'do' ( (lv_command2_7_0= ruleStatement ) )* )? otherlv_8= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_condition_2_0 = null;

        EObject lv_command_4_0 = null;

        EObject lv_command2_7_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:658:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* (otherlv_5= 'else' otherlv_6= 'do' ( (lv_command2_7_0= ruleStatement ) )* )? otherlv_8= 'end' ) )
            // InternalRobot.g:659:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* (otherlv_5= 'else' otherlv_6= 'do' ( (lv_command2_7_0= ruleStatement ) )* )? otherlv_8= 'end' )
            {
            // InternalRobot.g:659:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* (otherlv_5= 'else' otherlv_6= 'do' ( (lv_command2_7_0= ruleStatement ) )* )? otherlv_8= 'end' )
            // InternalRobot.g:660:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* (otherlv_5= 'else' otherlv_6= 'do' ( (lv_command2_7_0= ruleStatement ) )* )? otherlv_8= 'end'
            {
            // InternalRobot.g:660:3: ()
            // InternalRobot.g:661:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
            		
            // InternalRobot.g:671:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalRobot.g:672:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalRobot.g:672:4: (lv_condition_2_0= ruleExpression )
            // InternalRobot.g:673:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"nl.tue.robot.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getDoKeyword_3());
            		
            // InternalRobot.g:694:3: ( (lv_command_4_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_RL_COMMENT||LA4_0==19||(LA4_0>=22 && LA4_0<=23)||LA4_0==25||(LA4_0>=41 && LA4_0<=48)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRobot.g:695:4: (lv_command_4_0= ruleStatement )
            	    {
            	    // InternalRobot.g:695:4: (lv_command_4_0= ruleStatement )
            	    // InternalRobot.g:696:5: lv_command_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getCommandStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_command_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_4_0,
            	    						"nl.tue.robot.Robot.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalRobot.g:713:3: (otherlv_5= 'else' otherlv_6= 'do' ( (lv_command2_7_0= ruleStatement ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobot.g:714:4: otherlv_5= 'else' otherlv_6= 'do' ( (lv_command2_7_0= ruleStatement ) )*
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getDoKeyword_5_1());
                    			
                    // InternalRobot.g:722:4: ( (lv_command2_7_0= ruleStatement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_RL_COMMENT||LA5_0==19||(LA5_0>=22 && LA5_0<=23)||LA5_0==25||(LA5_0>=41 && LA5_0<=48)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRobot.g:723:5: (lv_command2_7_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:723:5: (lv_command2_7_0= ruleStatement )
                    	    // InternalRobot.g:724:6: lv_command2_7_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfStatementAccess().getCommand2StatementParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_command2_7_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"command2",
                    	    							lv_command2_7_0,
                    	    							"nl.tue.robot.Robot.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalRobot.g:750:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRobot.g:750:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRobot.g:751:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalRobot.g:757:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_command_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:763:2: ( ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' ) )
            // InternalRobot.g:764:2: ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' )
            {
            // InternalRobot.g:764:2: ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' )
            // InternalRobot.g:765:3: () otherlv_1= 'while' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end'
            {
            // InternalRobot.g:765:3: ()
            // InternalRobot.g:766:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
            		
            // InternalRobot.g:776:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalRobot.g:777:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalRobot.g:777:4: (lv_condition_2_0= ruleExpression )
            // InternalRobot.g:778:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"nl.tue.robot.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getDoKeyword_3());
            		
            // InternalRobot.g:799:3: ( (lv_command_4_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_RL_COMMENT||LA7_0==19||(LA7_0>=22 && LA7_0<=23)||LA7_0==25||(LA7_0>=41 && LA7_0<=48)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRobot.g:800:4: (lv_command_4_0= ruleStatement )
            	    {
            	    // InternalRobot.g:800:4: (lv_command_4_0= ruleStatement )
            	    // InternalRobot.g:801:5: lv_command_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileStatementAccess().getCommandStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_command_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_4_0,
            	    						"nl.tue.robot.Robot.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleRepeatStatement"
    // InternalRobot.g:826:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalRobot.g:826:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalRobot.g:827:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
            {
             newCompositeNode(grammarAccess.getRepeatStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeatStatement=ruleRepeatStatement();

            state._fsp--;

             current =iv_ruleRepeatStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeatStatement"


    // $ANTLR start "ruleRepeatStatement"
    // InternalRobot.g:833:1: ruleRepeatStatement returns [EObject current=null] : ( () otherlv_1= 'repeat' ( (lv_condition_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_command_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:839:2: ( ( () otherlv_1= 'repeat' ( (lv_condition_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' ) )
            // InternalRobot.g:840:2: ( () otherlv_1= 'repeat' ( (lv_condition_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' )
            {
            // InternalRobot.g:840:2: ( () otherlv_1= 'repeat' ( (lv_condition_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' )
            // InternalRobot.g:841:3: () otherlv_1= 'repeat' ( (lv_condition_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end'
            {
            // InternalRobot.g:841:3: ()
            // InternalRobot.g:842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepeatStatementAccess().getRepeatStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatStatementAccess().getRepeatKeyword_1());
            		
            // InternalRobot.g:852:3: ( (lv_condition_2_0= RULE_INT ) )
            // InternalRobot.g:853:4: (lv_condition_2_0= RULE_INT )
            {
            // InternalRobot.g:853:4: (lv_condition_2_0= RULE_INT )
            // InternalRobot.g:854:5: lv_condition_2_0= RULE_INT
            {
            lv_condition_2_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_condition_2_0, grammarAccess.getRepeatStatementAccess().getConditionINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRepeatStatementAccess().getTimesKeyword_3());
            		
            // InternalRobot.g:874:3: ( (lv_command_4_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_RL_COMMENT||LA8_0==19||(LA8_0>=22 && LA8_0<=23)||LA8_0==25||(LA8_0>=41 && LA8_0<=48)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRobot.g:875:4: (lv_command_4_0= ruleStatement )
            	    {
            	    // InternalRobot.g:875:4: (lv_command_4_0= ruleStatement )
            	    // InternalRobot.g:876:5: lv_command_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getRepeatStatementAccess().getCommandStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_command_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_4_0,
            	    						"nl.tue.robot.Robot.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRepeatStatementAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeatStatement"


    // $ANTLR start "entryRuleTraceCommand"
    // InternalRobot.g:901:1: entryRuleTraceCommand returns [EObject current=null] : iv_ruleTraceCommand= ruleTraceCommand EOF ;
    public final EObject entryRuleTraceCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceCommand = null;


        try {
            // InternalRobot.g:901:53: (iv_ruleTraceCommand= ruleTraceCommand EOF )
            // InternalRobot.g:902:2: iv_ruleTraceCommand= ruleTraceCommand EOF
            {
             newCompositeNode(grammarAccess.getTraceCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceCommand=ruleTraceCommand();

            state._fsp--;

             current =iv_ruleTraceCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceCommand"


    // $ANTLR start "ruleTraceCommand"
    // InternalRobot.g:908:1: ruleTraceCommand returns [EObject current=null] : ( () otherlv_1= 'trace' ( (lv_command_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTraceCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_command_2_0=null;


        	enterRule();

        try {
            // InternalRobot.g:914:2: ( ( () otherlv_1= 'trace' ( (lv_command_2_0= RULE_STRING ) ) ) )
            // InternalRobot.g:915:2: ( () otherlv_1= 'trace' ( (lv_command_2_0= RULE_STRING ) ) )
            {
            // InternalRobot.g:915:2: ( () otherlv_1= 'trace' ( (lv_command_2_0= RULE_STRING ) ) )
            // InternalRobot.g:916:3: () otherlv_1= 'trace' ( (lv_command_2_0= RULE_STRING ) )
            {
            // InternalRobot.g:916:3: ()
            // InternalRobot.g:917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceCommandAccess().getTraceCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceCommandAccess().getTraceKeyword_1());
            		
            // InternalRobot.g:927:3: ( (lv_command_2_0= RULE_STRING ) )
            // InternalRobot.g:928:4: (lv_command_2_0= RULE_STRING )
            {
            // InternalRobot.g:928:4: (lv_command_2_0= RULE_STRING )
            // InternalRobot.g:929:5: lv_command_2_0= RULE_STRING
            {
            lv_command_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_command_2_0, grammarAccess.getTraceCommandAccess().getCommandSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceCommand"


    // $ANTLR start "entryRuleAtomicCommand"
    // InternalRobot.g:949:1: entryRuleAtomicCommand returns [EObject current=null] : iv_ruleAtomicCommand= ruleAtomicCommand EOF ;
    public final EObject entryRuleAtomicCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicCommand = null;


        try {
            // InternalRobot.g:949:54: (iv_ruleAtomicCommand= ruleAtomicCommand EOF )
            // InternalRobot.g:950:2: iv_ruleAtomicCommand= ruleAtomicCommand EOF
            {
             newCompositeNode(grammarAccess.getAtomicCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicCommand=ruleAtomicCommand();

            state._fsp--;

             current =iv_ruleAtomicCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicCommand"


    // $ANTLR start "ruleAtomicCommand"
    // InternalRobot.g:956:1: ruleAtomicCommand returns [EObject current=null] : ( () ( (lv_command_1_0= ruleCommandLiteral ) ) ) ;
    public final EObject ruleAtomicCommand() throws RecognitionException {
        EObject current = null;

        Enumerator lv_command_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:962:2: ( ( () ( (lv_command_1_0= ruleCommandLiteral ) ) ) )
            // InternalRobot.g:963:2: ( () ( (lv_command_1_0= ruleCommandLiteral ) ) )
            {
            // InternalRobot.g:963:2: ( () ( (lv_command_1_0= ruleCommandLiteral ) ) )
            // InternalRobot.g:964:3: () ( (lv_command_1_0= ruleCommandLiteral ) )
            {
            // InternalRobot.g:964:3: ()
            // InternalRobot.g:965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicCommandAccess().getAtomicCommandAction_0(),
            					current);
            			

            }

            // InternalRobot.g:971:3: ( (lv_command_1_0= ruleCommandLiteral ) )
            // InternalRobot.g:972:4: (lv_command_1_0= ruleCommandLiteral )
            {
            // InternalRobot.g:972:4: (lv_command_1_0= ruleCommandLiteral )
            // InternalRobot.g:973:5: lv_command_1_0= ruleCommandLiteral
            {

            					newCompositeNode(grammarAccess.getAtomicCommandAccess().getCommandCommandLiteralEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_command_1_0=ruleCommandLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicCommandRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_1_0,
            						"nl.tue.robot.Robot.CommandLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicCommand"


    // $ANTLR start "entryRuleConstructionStatement"
    // InternalRobot.g:994:1: entryRuleConstructionStatement returns [EObject current=null] : iv_ruleConstructionStatement= ruleConstructionStatement EOF ;
    public final EObject entryRuleConstructionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructionStatement = null;


        try {
            // InternalRobot.g:994:62: (iv_ruleConstructionStatement= ruleConstructionStatement EOF )
            // InternalRobot.g:995:2: iv_ruleConstructionStatement= ruleConstructionStatement EOF
            {
             newCompositeNode(grammarAccess.getConstructionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructionStatement=ruleConstructionStatement();

            state._fsp--;

             current =iv_ruleConstructionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructionStatement"


    // $ANTLR start "ruleConstructionStatement"
    // InternalRobot.g:1001:1: ruleConstructionStatement returns [EObject current=null] : ( () ( (lv_command_1_0= ruleGridLiteral ) ) otherlv_2= 'at' otherlv_3= 'row:' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'col:' ( (lv_y_7_0= RULE_INT ) ) ) ;
    public final EObject ruleConstructionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_y_7_0=null;
        Enumerator lv_command_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:1007:2: ( ( () ( (lv_command_1_0= ruleGridLiteral ) ) otherlv_2= 'at' otherlv_3= 'row:' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'col:' ( (lv_y_7_0= RULE_INT ) ) ) )
            // InternalRobot.g:1008:2: ( () ( (lv_command_1_0= ruleGridLiteral ) ) otherlv_2= 'at' otherlv_3= 'row:' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'col:' ( (lv_y_7_0= RULE_INT ) ) )
            {
            // InternalRobot.g:1008:2: ( () ( (lv_command_1_0= ruleGridLiteral ) ) otherlv_2= 'at' otherlv_3= 'row:' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'col:' ( (lv_y_7_0= RULE_INT ) ) )
            // InternalRobot.g:1009:3: () ( (lv_command_1_0= ruleGridLiteral ) ) otherlv_2= 'at' otherlv_3= 'row:' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'col:' ( (lv_y_7_0= RULE_INT ) )
            {
            // InternalRobot.g:1009:3: ()
            // InternalRobot.g:1010:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructionStatementAccess().getConstructionStatementAction_0(),
            					current);
            			

            }

            // InternalRobot.g:1016:3: ( (lv_command_1_0= ruleGridLiteral ) )
            // InternalRobot.g:1017:4: (lv_command_1_0= ruleGridLiteral )
            {
            // InternalRobot.g:1017:4: (lv_command_1_0= ruleGridLiteral )
            // InternalRobot.g:1018:5: lv_command_1_0= ruleGridLiteral
            {

            					newCompositeNode(grammarAccess.getConstructionStatementAccess().getCommandGridLiteralEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_command_1_0=ruleGridLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructionStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_1_0,
            						"nl.tue.robot.Robot.GridLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getConstructionStatementAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getConstructionStatementAccess().getRowKeyword_3());
            		
            // InternalRobot.g:1043:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalRobot.g:1044:4: (lv_x_4_0= RULE_INT )
            {
            // InternalRobot.g:1044:4: (lv_x_4_0= RULE_INT )
            // InternalRobot.g:1045:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_x_4_0, grammarAccess.getConstructionStatementAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructionStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getConstructionStatementAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getConstructionStatementAccess().getColKeyword_6());
            		
            // InternalRobot.g:1069:3: ( (lv_y_7_0= RULE_INT ) )
            // InternalRobot.g:1070:4: (lv_y_7_0= RULE_INT )
            {
            // InternalRobot.g:1070:4: (lv_y_7_0= RULE_INT )
            // InternalRobot.g:1071:5: lv_y_7_0= RULE_INT
            {
            lv_y_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_7_0, grammarAccess.getConstructionStatementAccess().getYINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructionStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructionStatement"


    // $ANTLR start "ruleOperatorLiteral"
    // InternalRobot.g:1091:1: ruleOperatorLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleOperatorLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1097:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalRobot.g:1098:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalRobot.g:1098:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRobot.g:1099:3: (enumLiteral_0= 'and' )
                    {
                    // InternalRobot.g:1099:3: (enumLiteral_0= 'and' )
                    // InternalRobot.g:1100:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperatorLiteralAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorLiteralAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1107:3: (enumLiteral_1= 'or' )
                    {
                    // InternalRobot.g:1107:3: (enumLiteral_1= 'or' )
                    // InternalRobot.g:1108:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOperatorLiteralAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorLiteralAccess().getOrEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperatorLiteral"


    // $ANTLR start "ruleHeadingLiteral"
    // InternalRobot.g:1118:1: ruleHeadingLiteral returns [Enumerator current=null] : (enumLiteral_0= 'heading' ) ;
    public final Enumerator ruleHeadingLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRobot.g:1124:2: ( (enumLiteral_0= 'heading' ) )
            // InternalRobot.g:1125:2: (enumLiteral_0= 'heading' )
            {
            // InternalRobot.g:1125:2: (enumLiteral_0= 'heading' )
            // InternalRobot.g:1126:3: enumLiteral_0= 'heading'
            {
            enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

            			current = grammarAccess.getHeadingLiteralAccess().getHeadingEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getHeadingLiteralAccess().getHeadingEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeadingLiteral"


    // $ANTLR start "ruleDirectionLiteral"
    // InternalRobot.g:1135:1: ruleDirectionLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleDirectionLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1141:2: ( ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) )
            // InternalRobot.g:1142:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalRobot.g:1142:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 36:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRobot.g:1143:3: (enumLiteral_0= 'north' )
                    {
                    // InternalRobot.g:1143:3: (enumLiteral_0= 'north' )
                    // InternalRobot.g:1144:4: enumLiteral_0= 'north'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getNorthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionLiteralAccess().getNorthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1151:3: (enumLiteral_1= 'south' )
                    {
                    // InternalRobot.g:1151:3: (enumLiteral_1= 'south' )
                    // InternalRobot.g:1152:4: enumLiteral_1= 'south'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getSouthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionLiteralAccess().getSouthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1159:3: (enumLiteral_2= 'east' )
                    {
                    // InternalRobot.g:1159:3: (enumLiteral_2= 'east' )
                    // InternalRobot.g:1160:4: enumLiteral_2= 'east'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionLiteralAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1167:3: (enumLiteral_3= 'west' )
                    {
                    // InternalRobot.g:1167:3: (enumLiteral_3= 'west' )
                    // InternalRobot.g:1168:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getWestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionLiteralAccess().getWestEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectionLiteral"


    // $ANTLR start "ruleWallLiteral"
    // InternalRobot.g:1178:1: ruleWallLiteral returns [Enumerator current=null] : (enumLiteral_0= 'wall' ) ;
    public final Enumerator ruleWallLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRobot.g:1184:2: ( (enumLiteral_0= 'wall' ) )
            // InternalRobot.g:1185:2: (enumLiteral_0= 'wall' )
            {
            // InternalRobot.g:1185:2: (enumLiteral_0= 'wall' )
            // InternalRobot.g:1186:3: enumLiteral_0= 'wall'
            {
            enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

            			current = grammarAccess.getWallLiteralAccess().getWallEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getWallLiteralAccess().getWallEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWallLiteral"


    // $ANTLR start "ruleAheadLiteral"
    // InternalRobot.g:1195:1: ruleAheadLiteral returns [Enumerator current=null] : (enumLiteral_0= 'ahead' ) ;
    public final Enumerator ruleAheadLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRobot.g:1201:2: ( (enumLiteral_0= 'ahead' ) )
            // InternalRobot.g:1202:2: (enumLiteral_0= 'ahead' )
            {
            // InternalRobot.g:1202:2: (enumLiteral_0= 'ahead' )
            // InternalRobot.g:1203:3: enumLiteral_0= 'ahead'
            {
            enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

            			current = grammarAccess.getAheadLiteralAccess().getAheadEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAheadLiteralAccess().getAheadEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAheadLiteral"


    // $ANTLR start "ruleNormalExpressionLiteral"
    // InternalRobot.g:1212:1: ruleNormalExpressionLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) ) ;
    public final Enumerator ruleNormalExpressionLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobot.g:1218:2: ( ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) ) )
            // InternalRobot.g:1219:2: ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) )
            {
            // InternalRobot.g:1219:2: ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            else if ( (LA11_0==40) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRobot.g:1220:3: (enumLiteral_0= 'full' )
                    {
                    // InternalRobot.g:1220:3: (enumLiteral_0= 'full' )
                    // InternalRobot.g:1221:4: enumLiteral_0= 'full'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getNormalExpressionLiteralAccess().getFullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNormalExpressionLiteralAccess().getFullEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1228:3: (enumLiteral_1= 'mark' )
                    {
                    // InternalRobot.g:1228:3: (enumLiteral_1= 'mark' )
                    // InternalRobot.g:1229:4: enumLiteral_1= 'mark'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getNormalExpressionLiteralAccess().getMarkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNormalExpressionLiteralAccess().getMarkEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormalExpressionLiteral"


    // $ANTLR start "ruleCommandLiteral"
    // InternalRobot.g:1239:1: ruleCommandLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) ;
    public final Enumerator ruleCommandLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1245:2: ( ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) )
            // InternalRobot.g:1246:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            {
            // InternalRobot.g:1246:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 42:
                {
                alt12=2;
                }
                break;
            case 43:
                {
                alt12=3;
                }
                break;
            case 44:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRobot.g:1247:3: (enumLiteral_0= 'step' )
                    {
                    // InternalRobot.g:1247:3: (enumLiteral_0= 'step' )
                    // InternalRobot.g:1248:4: enumLiteral_0= 'step'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getStepEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCommandLiteralAccess().getStepEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1255:3: (enumLiteral_1= 'turnLeft' )
                    {
                    // InternalRobot.g:1255:3: (enumLiteral_1= 'turnLeft' )
                    // InternalRobot.g:1256:4: enumLiteral_1= 'turnLeft'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getTurnLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCommandLiteralAccess().getTurnLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1263:3: (enumLiteral_2= 'drop' )
                    {
                    // InternalRobot.g:1263:3: (enumLiteral_2= 'drop' )
                    // InternalRobot.g:1264:4: enumLiteral_2= 'drop'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getDropEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCommandLiteralAccess().getDropEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1271:3: (enumLiteral_3= 'pick' )
                    {
                    // InternalRobot.g:1271:3: (enumLiteral_3= 'pick' )
                    // InternalRobot.g:1272:4: enumLiteral_3= 'pick'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getPickEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCommandLiteralAccess().getPickEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandLiteral"


    // $ANTLR start "ruleGridLiteral"
    // InternalRobot.g:1282:1: ruleGridLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) ) ;
    public final Enumerator ruleGridLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:1288:2: ( ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) ) )
            // InternalRobot.g:1289:2: ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) )
            {
            // InternalRobot.g:1289:2: ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt13=1;
                }
                break;
            case 46:
                {
                alt13=2;
                }
                break;
            case 47:
                {
                alt13=3;
                }
                break;
            case 48:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRobot.g:1290:3: (enumLiteral_0= 'buildWall' )
                    {
                    // InternalRobot.g:1290:3: (enumLiteral_0= 'buildWall' )
                    // InternalRobot.g:1291:4: enumLiteral_0= 'buildWall'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getBuildWallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGridLiteralAccess().getBuildWallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:1298:3: (enumLiteral_1= 'destroyWall' )
                    {
                    // InternalRobot.g:1298:3: (enumLiteral_1= 'destroyWall' )
                    // InternalRobot.g:1299:4: enumLiteral_1= 'destroyWall'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getDestroyWallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGridLiteralAccess().getDestroyWallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:1306:3: (enumLiteral_2= 'pickMark' )
                    {
                    // InternalRobot.g:1306:3: (enumLiteral_2= 'pickMark' )
                    // InternalRobot.g:1307:4: enumLiteral_2= 'pickMark'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getPickMarkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGridLiteralAccess().getPickMarkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:1314:3: (enumLiteral_3= 'dropMark' )
                    {
                    // InternalRobot.g:1314:3: (enumLiteral_3= 'dropMark' )
                    // InternalRobot.g:1315:4: enumLiteral_3= 'dropMark'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getDropMarkEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGridLiteralAccess().getDropMarkEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGridLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001FE0002C88020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001A100030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001FE0002E88020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});

}