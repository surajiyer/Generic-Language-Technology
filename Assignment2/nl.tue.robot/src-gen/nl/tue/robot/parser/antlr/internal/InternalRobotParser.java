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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RL_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Script'", "'runs'", "'as'", "'end'", "'if'", "'do'", "'else'", "'while'", "'repeat'", "'times'", "'trace'", "'at'", "'row:'", "','", "'col:'", "'and'", "'or'", "'heading'", "'north'", "'south'", "'east'", "'west'", "'wall'", "'ahead'", "'full'", "'mark'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'buildWall'", "'destroyWall'", "'pickMark'", "'dropMark'"
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
    public static final int T__44=44;
    public static final int T__45=45;
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
    // InternalRobot.g:72:1: ruleScript returns [EObject current=null] : (otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_name_1_0 = null;

        EObject lv_command_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:78:2: ( (otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' ) )
            // InternalRobot.g:79:2: (otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' )
            {
            // InternalRobot.g:79:2: (otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end' )
            // InternalRobot.g:80:3: otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_command_4_0= ruleStatement ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
            		
            // InternalRobot.g:84:3: ( (lv_name_1_0= ruleName ) )
            // InternalRobot.g:85:4: (lv_name_1_0= ruleName )
            {
            // InternalRobot.g:85:4: (lv_name_1_0= ruleName )
            // InternalRobot.g:86:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getScriptAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScriptRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"nl.tue.robot.Robot.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getRunsKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getAsKeyword_3());
            		
            // InternalRobot.g:111:3: ( (lv_command_4_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_RL_COMMENT||LA1_0==16||(LA1_0>=19 && LA1_0<=20)||LA1_0==22||(LA1_0>=38 && LA1_0<=45)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRobot.g:112:4: (lv_command_4_0= ruleStatement )
            	    {
            	    // InternalRobot.g:112:4: (lv_command_4_0= ruleStatement )
            	    // InternalRobot.g:113:5: lv_command_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScriptAccess().getCommandStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_command_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScriptRule());
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
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getEndKeyword_5());
            		

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
    // InternalRobot.g:138:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobot.g:138:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobot.g:139:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRobot.g:145:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement ) ;
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
            // InternalRobot.g:151:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement ) )
            // InternalRobot.g:152:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement )
            {
            // InternalRobot.g:152:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case RULE_RL_COMMENT:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt2=6;
                }
                break;
            case 42:
            case 43:
            case 44:
            case 45:
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
                    // InternalRobot.g:153:3: this_IfStatement_0= ruleIfStatement
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
                    // InternalRobot.g:162:3: this_WhileStatement_1= ruleWhileStatement
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
                    // InternalRobot.g:171:3: this_RepeatStatement_2= ruleRepeatStatement
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
                    // InternalRobot.g:180:3: this_Comment_3= ruleComment
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
                    // InternalRobot.g:189:3: this_TraceCommand_4= ruleTraceCommand
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
                    // InternalRobot.g:198:3: this_AtomicCommand_5= ruleAtomicCommand
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
                    // InternalRobot.g:207:3: this_ConstructionStatement_6= ruleConstructionStatement
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
    // InternalRobot.g:219:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRobot.g:219:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRobot.g:220:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRobot.g:226:1: ruleExpression returns [EObject current=null] : () ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRobot.g:232:2: ( () )
            // InternalRobot.g:233:2: ()
            {
            // InternalRobot.g:233:2: ()
            // InternalRobot.g:234:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getExpressionAccess().getExpressionAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleName"
    // InternalRobot.g:243:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalRobot.g:243:45: (iv_ruleName= ruleName EOF )
            // InternalRobot.g:244:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalRobot.g:250:1: ruleName returns [EObject current=null] : ( () this_ID_1= RULE_ID ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobot.g:256:2: ( ( () this_ID_1= RULE_ID ) )
            // InternalRobot.g:257:2: ( () this_ID_1= RULE_ID )
            {
            // InternalRobot.g:257:2: ( () this_ID_1= RULE_ID )
            // InternalRobot.g:258:3: () this_ID_1= RULE_ID
            {
            // InternalRobot.g:258:3: ()
            // InternalRobot.g:259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameAccess().getNameAction_0(),
            					current);
            			

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(this_ID_1, grammarAccess.getNameAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleComment"
    // InternalRobot.g:273:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRobot.g:273:48: (iv_ruleComment= ruleComment EOF )
            // InternalRobot.g:274:2: iv_ruleComment= ruleComment EOF
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
    // InternalRobot.g:280:1: ruleComment returns [EObject current=null] : ( () ( (lv_command_1_0= RULE_RL_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalRobot.g:286:2: ( ( () ( (lv_command_1_0= RULE_RL_COMMENT ) ) ) )
            // InternalRobot.g:287:2: ( () ( (lv_command_1_0= RULE_RL_COMMENT ) ) )
            {
            // InternalRobot.g:287:2: ( () ( (lv_command_1_0= RULE_RL_COMMENT ) ) )
            // InternalRobot.g:288:3: () ( (lv_command_1_0= RULE_RL_COMMENT ) )
            {
            // InternalRobot.g:288:3: ()
            // InternalRobot.g:289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }

            // InternalRobot.g:295:3: ( (lv_command_1_0= RULE_RL_COMMENT ) )
            // InternalRobot.g:296:4: (lv_command_1_0= RULE_RL_COMMENT )
            {
            // InternalRobot.g:296:4: (lv_command_1_0= RULE_RL_COMMENT )
            // InternalRobot.g:297:5: lv_command_1_0= RULE_RL_COMMENT
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
    // InternalRobot.g:317:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalRobot.g:317:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalRobot.g:318:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalRobot.g:324:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_command2_6_0= ruleStatement ) )* )? otherlv_7= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_1_0 = null;

        EObject lv_command_3_0 = null;

        EObject lv_command2_6_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:330:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_command2_6_0= ruleStatement ) )* )? otherlv_7= 'end' ) )
            // InternalRobot.g:331:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_command2_6_0= ruleStatement ) )* )? otherlv_7= 'end' )
            {
            // InternalRobot.g:331:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_command2_6_0= ruleStatement ) )* )? otherlv_7= 'end' )
            // InternalRobot.g:332:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_command2_6_0= ruleStatement ) )* )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalRobot.g:336:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalRobot.g:337:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalRobot.g:337:4: (lv_condition_1_0= ruleExpression )
            // InternalRobot.g:338:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"nl.tue.robot.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getDoKeyword_2());
            		
            // InternalRobot.g:359:3: ( (lv_command_3_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_RL_COMMENT||LA3_0==16||(LA3_0>=19 && LA3_0<=20)||LA3_0==22||(LA3_0>=38 && LA3_0<=45)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRobot.g:360:4: (lv_command_3_0= ruleStatement )
            	    {
            	    // InternalRobot.g:360:4: (lv_command_3_0= ruleStatement )
            	    // InternalRobot.g:361:5: lv_command_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getCommandStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_command_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_3_0,
            	    						"nl.tue.robot.Robot.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalRobot.g:378:3: (otherlv_4= 'else' otherlv_5= 'do' ( (lv_command2_6_0= ruleStatement ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobot.g:379:4: otherlv_4= 'else' otherlv_5= 'do' ( (lv_command2_6_0= ruleStatement ) )*
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getElseKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getDoKeyword_4_1());
                    			
                    // InternalRobot.g:387:4: ( (lv_command2_6_0= ruleStatement ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_RL_COMMENT||LA4_0==16||(LA4_0>=19 && LA4_0<=20)||LA4_0==22||(LA4_0>=38 && LA4_0<=45)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRobot.g:388:5: (lv_command2_6_0= ruleStatement )
                    	    {
                    	    // InternalRobot.g:388:5: (lv_command2_6_0= ruleStatement )
                    	    // InternalRobot.g:389:6: lv_command2_6_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfStatementAccess().getCommand2StatementParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_command2_6_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"command2",
                    	    							lv_command2_6_0,
                    	    							"nl.tue.robot.Robot.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getEndKeyword_5());
            		

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
    // InternalRobot.g:415:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRobot.g:415:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRobot.g:416:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalRobot.g:422:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:428:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end' ) )
            // InternalRobot.g:429:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end' )
            {
            // InternalRobot.g:429:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end' )
            // InternalRobot.g:430:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalRobot.g:434:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalRobot.g:435:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalRobot.g:435:4: (lv_condition_1_0= ruleExpression )
            // InternalRobot.g:436:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"nl.tue.robot.Robot.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getDoKeyword_2());
            		
            // InternalRobot.g:457:3: ( (lv_command_3_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_RL_COMMENT||LA6_0==16||(LA6_0>=19 && LA6_0<=20)||LA6_0==22||(LA6_0>=38 && LA6_0<=45)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRobot.g:458:4: (lv_command_3_0= ruleStatement )
            	    {
            	    // InternalRobot.g:458:4: (lv_command_3_0= ruleStatement )
            	    // InternalRobot.g:459:5: lv_command_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileStatementAccess().getCommandStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_command_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_3_0,
            	    						"nl.tue.robot.Robot.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getEndKeyword_4());
            		

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
    // InternalRobot.g:484:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalRobot.g:484:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalRobot.g:485:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
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
    // InternalRobot.g:491:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_condition_1_0= RULE_INT ) ) otherlv_2= 'times' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end' ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_condition_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:497:2: ( (otherlv_0= 'repeat' ( (lv_condition_1_0= RULE_INT ) ) otherlv_2= 'times' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end' ) )
            // InternalRobot.g:498:2: (otherlv_0= 'repeat' ( (lv_condition_1_0= RULE_INT ) ) otherlv_2= 'times' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end' )
            {
            // InternalRobot.g:498:2: (otherlv_0= 'repeat' ( (lv_condition_1_0= RULE_INT ) ) otherlv_2= 'times' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end' )
            // InternalRobot.g:499:3: otherlv_0= 'repeat' ( (lv_condition_1_0= RULE_INT ) ) otherlv_2= 'times' ( (lv_command_3_0= ruleStatement ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepeatKeyword_0());
            		
            // InternalRobot.g:503:3: ( (lv_condition_1_0= RULE_INT ) )
            // InternalRobot.g:504:4: (lv_condition_1_0= RULE_INT )
            {
            // InternalRobot.g:504:4: (lv_condition_1_0= RULE_INT )
            // InternalRobot.g:505:5: lv_condition_1_0= RULE_INT
            {
            lv_condition_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_condition_1_0, grammarAccess.getRepeatStatementAccess().getConditionINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getTimesKeyword_2());
            		
            // InternalRobot.g:525:3: ( (lv_command_3_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_RL_COMMENT||LA7_0==16||(LA7_0>=19 && LA7_0<=20)||LA7_0==22||(LA7_0>=38 && LA7_0<=45)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRobot.g:526:4: (lv_command_3_0= ruleStatement )
            	    {
            	    // InternalRobot.g:526:4: (lv_command_3_0= ruleStatement )
            	    // InternalRobot.g:527:5: lv_command_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getRepeatStatementAccess().getCommandStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_command_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_3_0,
            	    						"nl.tue.robot.Robot.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRepeatStatementAccess().getEndKeyword_4());
            		

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
    // InternalRobot.g:552:1: entryRuleTraceCommand returns [EObject current=null] : iv_ruleTraceCommand= ruleTraceCommand EOF ;
    public final EObject entryRuleTraceCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceCommand = null;


        try {
            // InternalRobot.g:552:53: (iv_ruleTraceCommand= ruleTraceCommand EOF )
            // InternalRobot.g:553:2: iv_ruleTraceCommand= ruleTraceCommand EOF
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
    // InternalRobot.g:559:1: ruleTraceCommand returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_command_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTraceCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalRobot.g:565:2: ( (otherlv_0= 'trace' ( (lv_command_1_0= RULE_STRING ) ) ) )
            // InternalRobot.g:566:2: (otherlv_0= 'trace' ( (lv_command_1_0= RULE_STRING ) ) )
            {
            // InternalRobot.g:566:2: (otherlv_0= 'trace' ( (lv_command_1_0= RULE_STRING ) ) )
            // InternalRobot.g:567:3: otherlv_0= 'trace' ( (lv_command_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceCommandAccess().getTraceKeyword_0());
            		
            // InternalRobot.g:571:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalRobot.g:572:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalRobot.g:572:4: (lv_command_1_0= RULE_STRING )
            // InternalRobot.g:573:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_command_1_0, grammarAccess.getTraceCommandAccess().getCommandSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_1_0,
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
    // InternalRobot.g:593:1: entryRuleAtomicCommand returns [EObject current=null] : iv_ruleAtomicCommand= ruleAtomicCommand EOF ;
    public final EObject entryRuleAtomicCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicCommand = null;


        try {
            // InternalRobot.g:593:54: (iv_ruleAtomicCommand= ruleAtomicCommand EOF )
            // InternalRobot.g:594:2: iv_ruleAtomicCommand= ruleAtomicCommand EOF
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
    // InternalRobot.g:600:1: ruleAtomicCommand returns [EObject current=null] : ( (lv_command_0_0= ruleCommandLiteral ) ) ;
    public final EObject ruleAtomicCommand() throws RecognitionException {
        EObject current = null;

        Enumerator lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:606:2: ( ( (lv_command_0_0= ruleCommandLiteral ) ) )
            // InternalRobot.g:607:2: ( (lv_command_0_0= ruleCommandLiteral ) )
            {
            // InternalRobot.g:607:2: ( (lv_command_0_0= ruleCommandLiteral ) )
            // InternalRobot.g:608:3: (lv_command_0_0= ruleCommandLiteral )
            {
            // InternalRobot.g:608:3: (lv_command_0_0= ruleCommandLiteral )
            // InternalRobot.g:609:4: lv_command_0_0= ruleCommandLiteral
            {

            				newCompositeNode(grammarAccess.getAtomicCommandAccess().getCommandCommandLiteralEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_command_0_0=ruleCommandLiteral();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAtomicCommandRule());
            				}
            				set(
            					current,
            					"command",
            					lv_command_0_0,
            					"nl.tue.robot.Robot.CommandLiteral");
            				afterParserOrEnumRuleCall();
            			

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
    // InternalRobot.g:629:1: entryRuleConstructionStatement returns [EObject current=null] : iv_ruleConstructionStatement= ruleConstructionStatement EOF ;
    public final EObject entryRuleConstructionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructionStatement = null;


        try {
            // InternalRobot.g:629:62: (iv_ruleConstructionStatement= ruleConstructionStatement EOF )
            // InternalRobot.g:630:2: iv_ruleConstructionStatement= ruleConstructionStatement EOF
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
    // InternalRobot.g:636:1: ruleConstructionStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_y_6_0= RULE_INT ) ) ) ;
    public final EObject ruleConstructionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_y_6_0=null;
        Enumerator lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:642:2: ( ( ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_y_6_0= RULE_INT ) ) ) )
            // InternalRobot.g:643:2: ( ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_y_6_0= RULE_INT ) ) )
            {
            // InternalRobot.g:643:2: ( ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_y_6_0= RULE_INT ) ) )
            // InternalRobot.g:644:3: ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_y_6_0= RULE_INT ) )
            {
            // InternalRobot.g:644:3: ( (lv_command_0_0= ruleGridLiteral ) )
            // InternalRobot.g:645:4: (lv_command_0_0= ruleGridLiteral )
            {
            // InternalRobot.g:645:4: (lv_command_0_0= ruleGridLiteral )
            // InternalRobot.g:646:5: lv_command_0_0= ruleGridLiteral
            {

            					newCompositeNode(grammarAccess.getConstructionStatementAccess().getCommandGridLiteralEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_command_0_0=ruleGridLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructionStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"nl.tue.robot.Robot.GridLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructionStatementAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getConstructionStatementAccess().getRowKeyword_2());
            		
            // InternalRobot.g:671:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalRobot.g:672:4: (lv_x_3_0= RULE_INT )
            {
            // InternalRobot.g:672:4: (lv_x_3_0= RULE_INT )
            // InternalRobot.g:673:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_x_3_0, grammarAccess.getConstructionStatementAccess().getXINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructionStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getConstructionStatementAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getConstructionStatementAccess().getColKeyword_5());
            		
            // InternalRobot.g:697:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalRobot.g:698:4: (lv_y_6_0= RULE_INT )
            {
            // InternalRobot.g:698:4: (lv_y_6_0= RULE_INT )
            // InternalRobot.g:699:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_6_0, grammarAccess.getConstructionStatementAccess().getYINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructionStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
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
    // InternalRobot.g:719:1: ruleOperatorLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleOperatorLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobot.g:725:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalRobot.g:726:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalRobot.g:726:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRobot.g:727:3: (enumLiteral_0= 'and' )
                    {
                    // InternalRobot.g:727:3: (enumLiteral_0= 'and' )
                    // InternalRobot.g:728:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getOperatorLiteralAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorLiteralAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:735:3: (enumLiteral_1= 'or' )
                    {
                    // InternalRobot.g:735:3: (enumLiteral_1= 'or' )
                    // InternalRobot.g:736:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

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
    // InternalRobot.g:746:1: ruleHeadingLiteral returns [Enumerator current=null] : (enumLiteral_0= 'heading' ) ;
    public final Enumerator ruleHeadingLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRobot.g:752:2: ( (enumLiteral_0= 'heading' ) )
            // InternalRobot.g:753:2: (enumLiteral_0= 'heading' )
            {
            // InternalRobot.g:753:2: (enumLiteral_0= 'heading' )
            // InternalRobot.g:754:3: enumLiteral_0= 'heading'
            {
            enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRobot.g:763:1: ruleDirectionLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleDirectionLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:769:2: ( ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) )
            // InternalRobot.g:770:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalRobot.g:770:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRobot.g:771:3: (enumLiteral_0= 'north' )
                    {
                    // InternalRobot.g:771:3: (enumLiteral_0= 'north' )
                    // InternalRobot.g:772:4: enumLiteral_0= 'north'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getNorthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionLiteralAccess().getNorthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:779:3: (enumLiteral_1= 'south' )
                    {
                    // InternalRobot.g:779:3: (enumLiteral_1= 'south' )
                    // InternalRobot.g:780:4: enumLiteral_1= 'south'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getSouthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionLiteralAccess().getSouthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:787:3: (enumLiteral_2= 'east' )
                    {
                    // InternalRobot.g:787:3: (enumLiteral_2= 'east' )
                    // InternalRobot.g:788:4: enumLiteral_2= 'east'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionLiteralAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:795:3: (enumLiteral_3= 'west' )
                    {
                    // InternalRobot.g:795:3: (enumLiteral_3= 'west' )
                    // InternalRobot.g:796:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

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
    // InternalRobot.g:806:1: ruleWallLiteral returns [Enumerator current=null] : (enumLiteral_0= 'wall' ) ;
    public final Enumerator ruleWallLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRobot.g:812:2: ( (enumLiteral_0= 'wall' ) )
            // InternalRobot.g:813:2: (enumLiteral_0= 'wall' )
            {
            // InternalRobot.g:813:2: (enumLiteral_0= 'wall' )
            // InternalRobot.g:814:3: enumLiteral_0= 'wall'
            {
            enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRobot.g:823:1: ruleAheadLiteral returns [Enumerator current=null] : (enumLiteral_0= 'ahead' ) ;
    public final Enumerator ruleAheadLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRobot.g:829:2: ( (enumLiteral_0= 'ahead' ) )
            // InternalRobot.g:830:2: (enumLiteral_0= 'ahead' )
            {
            // InternalRobot.g:830:2: (enumLiteral_0= 'ahead' )
            // InternalRobot.g:831:3: enumLiteral_0= 'ahead'
            {
            enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

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
    // InternalRobot.g:840:1: ruleNormalExpressionLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) ) ;
    public final Enumerator ruleNormalExpressionLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobot.g:846:2: ( ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) ) )
            // InternalRobot.g:847:2: ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) )
            {
            // InternalRobot.g:847:2: ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==37) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobot.g:848:3: (enumLiteral_0= 'full' )
                    {
                    // InternalRobot.g:848:3: (enumLiteral_0= 'full' )
                    // InternalRobot.g:849:4: enumLiteral_0= 'full'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getNormalExpressionLiteralAccess().getFullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNormalExpressionLiteralAccess().getFullEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:856:3: (enumLiteral_1= 'mark' )
                    {
                    // InternalRobot.g:856:3: (enumLiteral_1= 'mark' )
                    // InternalRobot.g:857:4: enumLiteral_1= 'mark'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

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
    // InternalRobot.g:867:1: ruleCommandLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) ;
    public final Enumerator ruleCommandLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:873:2: ( ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) )
            // InternalRobot.g:874:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            {
            // InternalRobot.g:874:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            case 41:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRobot.g:875:3: (enumLiteral_0= 'step' )
                    {
                    // InternalRobot.g:875:3: (enumLiteral_0= 'step' )
                    // InternalRobot.g:876:4: enumLiteral_0= 'step'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getStepEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCommandLiteralAccess().getStepEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:883:3: (enumLiteral_1= 'turnLeft' )
                    {
                    // InternalRobot.g:883:3: (enumLiteral_1= 'turnLeft' )
                    // InternalRobot.g:884:4: enumLiteral_1= 'turnLeft'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getTurnLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCommandLiteralAccess().getTurnLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:891:3: (enumLiteral_2= 'drop' )
                    {
                    // InternalRobot.g:891:3: (enumLiteral_2= 'drop' )
                    // InternalRobot.g:892:4: enumLiteral_2= 'drop'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getDropEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCommandLiteralAccess().getDropEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:899:3: (enumLiteral_3= 'pick' )
                    {
                    // InternalRobot.g:899:3: (enumLiteral_3= 'pick' )
                    // InternalRobot.g:900:4: enumLiteral_3= 'pick'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

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
    // InternalRobot.g:910:1: ruleGridLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) ) ;
    public final Enumerator ruleGridLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:916:2: ( ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) ) )
            // InternalRobot.g:917:2: ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) )
            {
            // InternalRobot.g:917:2: ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case 43:
                {
                alt12=2;
                }
                break;
            case 44:
                {
                alt12=3;
                }
                break;
            case 45:
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
                    // InternalRobot.g:918:3: (enumLiteral_0= 'buildWall' )
                    {
                    // InternalRobot.g:918:3: (enumLiteral_0= 'buildWall' )
                    // InternalRobot.g:919:4: enumLiteral_0= 'buildWall'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getBuildWallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGridLiteralAccess().getBuildWallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:926:3: (enumLiteral_1= 'destroyWall' )
                    {
                    // InternalRobot.g:926:3: (enumLiteral_1= 'destroyWall' )
                    // InternalRobot.g:927:4: enumLiteral_1= 'destroyWall'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getDestroyWallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGridLiteralAccess().getDestroyWallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:934:3: (enumLiteral_2= 'pickMark' )
                    {
                    // InternalRobot.g:934:3: (enumLiteral_2= 'pickMark' )
                    // InternalRobot.g:935:4: enumLiteral_2= 'pickMark'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getPickMarkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGridLiteralAccess().getPickMarkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:942:3: (enumLiteral_3= 'dropMark' )
                    {
                    // InternalRobot.g:942:3: (enumLiteral_3= 'dropMark' )
                    // InternalRobot.g:943:4: enumLiteral_3= 'dropMark'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00003FC000598020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00003FC0005D8020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});

}