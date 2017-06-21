package org.xtext.example.mydsl1.parser.antlr.internal;

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Script'", "'runs'", "'as'", "'end'", "'if'", "'do'", "'else'", "'while'", "'repeat'", "'times'", "'Comment'", "'trace'", "'at'", "'row:'", "','", "'col:'", "'not'", "'('", "')'", "'and'", "'or'", "'heading'", "'north'", "'south'", "'east'", "'west'", "'wall'", "'ahead'", "'full'", "'mark'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'buildWall'", "'destroyWall'", "'pickMark'", "'dropMark'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Script";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScript"
    // InternalMyDsl.g:65:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalMyDsl.g:65:47: (iv_ruleScript= ruleScript EOF )
            // InternalMyDsl.g:66:2: iv_ruleScript= ruleScript EOF
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
    // InternalMyDsl.g:72:1: ruleScript returns [EObject current=null] : (otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= 'end' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_name_1_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= 'end' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= 'end' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= 'end' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Script' ( (lv_name_1_0= ruleName ) ) otherlv_2= 'runs' otherlv_3= 'as' ( (lv_statements_4_0= ruleStatement ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleName ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleName )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleName )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleName
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
            						"org.xtext.example.mydsl1.MyDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getRunsKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getAsKeyword_3());
            		
            // InternalMyDsl.g:111:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=18 && LA1_0<=19)||(LA1_0>=21 && LA1_0<=22)||(LA1_0>=41 && LA1_0<=48)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:112:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:112:4: (lv_statements_4_0= ruleStatement )
            	    // InternalMyDsl.g:113:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScriptAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScriptRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"org.xtext.example.mydsl1.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:138:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:138:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:139:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:145:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement ) ;
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
            // InternalMyDsl.g:151:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement ) )
            // InternalMyDsl.g:152:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement )
            {
            // InternalMyDsl.g:152:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Comment_3= ruleComment | this_TraceCommand_4= ruleTraceCommand | this_AtomicCommand_5= ruleAtomicCommand | this_ConstructionStatement_6= ruleConstructionStatement )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 22:
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
                    // InternalMyDsl.g:153:3: this_IfStatement_0= ruleIfStatement
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
                    // InternalMyDsl.g:162:3: this_WhileStatement_1= ruleWhileStatement
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
                    // InternalMyDsl.g:171:3: this_RepeatStatement_2= ruleRepeatStatement
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
                    // InternalMyDsl.g:180:3: this_Comment_3= ruleComment
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
                    // InternalMyDsl.g:189:3: this_TraceCommand_4= ruleTraceCommand
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
                    // InternalMyDsl.g:198:3: this_AtomicCommand_5= ruleAtomicCommand
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
                    // InternalMyDsl.g:207:3: this_ConstructionStatement_6= ruleConstructionStatement
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
    // InternalMyDsl.g:219:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:219:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:220:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:226:1: ruleExpression returns [EObject current=null] : (this_NegatedExpression_0= ruleNegatedExpression | this_BinaryExpression_1= ruleBinaryExpression | this_HeadingExpression_2= ruleHeadingExpression | this_WallAheadExpression_3= ruleWallAheadExpression | this_NormalExpression_4= ruleNormalExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegatedExpression_0 = null;

        EObject this_BinaryExpression_1 = null;

        EObject this_HeadingExpression_2 = null;

        EObject this_WallAheadExpression_3 = null;

        EObject this_NormalExpression_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( (this_NegatedExpression_0= ruleNegatedExpression | this_BinaryExpression_1= ruleBinaryExpression | this_HeadingExpression_2= ruleHeadingExpression | this_WallAheadExpression_3= ruleWallAheadExpression | this_NormalExpression_4= ruleNormalExpression ) )
            // InternalMyDsl.g:233:2: (this_NegatedExpression_0= ruleNegatedExpression | this_BinaryExpression_1= ruleBinaryExpression | this_HeadingExpression_2= ruleHeadingExpression | this_WallAheadExpression_3= ruleWallAheadExpression | this_NormalExpression_4= ruleNormalExpression )
            {
            // InternalMyDsl.g:233:2: (this_NegatedExpression_0= ruleNegatedExpression | this_BinaryExpression_1= ruleBinaryExpression | this_HeadingExpression_2= ruleHeadingExpression | this_WallAheadExpression_3= ruleWallAheadExpression | this_NormalExpression_4= ruleNormalExpression )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 28:
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
                    // InternalMyDsl.g:234:3: this_NegatedExpression_0= ruleNegatedExpression
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
                    // InternalMyDsl.g:243:3: this_BinaryExpression_1= ruleBinaryExpression
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
                    // InternalMyDsl.g:252:3: this_HeadingExpression_2= ruleHeadingExpression
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
                    // InternalMyDsl.g:261:3: this_WallAheadExpression_3= ruleWallAheadExpression
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
                    // InternalMyDsl.g:270:3: this_NormalExpression_4= ruleNormalExpression
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


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:282:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalMyDsl.g:282:45: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:283:2: iv_ruleName= ruleName EOF
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
    // InternalMyDsl.g:289:1: ruleName returns [EObject current=null] : ( () this_ID_1= RULE_ID ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:295:2: ( ( () this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:296:2: ( () this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:296:2: ( () this_ID_1= RULE_ID )
            // InternalMyDsl.g:297:3: () this_ID_1= RULE_ID
            {
            // InternalMyDsl.g:297:3: ()
            // InternalMyDsl.g:298:4: 
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


    // $ANTLR start "entryRuleIfStatement"
    // InternalMyDsl.g:312:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalMyDsl.g:312:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMyDsl.g:313:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalMyDsl.g:319:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_statements2_6_0= ruleStatement ) )* )? otherlv_7= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ifExpression_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_statements2_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:325:2: ( (otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_statements2_6_0= ruleStatement ) )* )? otherlv_7= 'end' ) )
            // InternalMyDsl.g:326:2: (otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_statements2_6_0= ruleStatement ) )* )? otherlv_7= 'end' )
            {
            // InternalMyDsl.g:326:2: (otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_statements2_6_0= ruleStatement ) )* )? otherlv_7= 'end' )
            // InternalMyDsl.g:327:3: otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* (otherlv_4= 'else' otherlv_5= 'do' ( (lv_statements2_6_0= ruleStatement ) )* )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalMyDsl.g:331:3: ( (lv_ifExpression_1_0= ruleExpression ) )
            // InternalMyDsl.g:332:4: (lv_ifExpression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:332:4: (lv_ifExpression_1_0= ruleExpression )
            // InternalMyDsl.g:333:5: lv_ifExpression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getIfExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_ifExpression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"ifExpression",
            						lv_ifExpression_1_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getDoKeyword_2());
            		
            // InternalMyDsl.g:354:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||(LA4_0>=18 && LA4_0<=19)||(LA4_0>=21 && LA4_0<=22)||(LA4_0>=41 && LA4_0<=48)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:355:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:355:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMyDsl.g:356:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.example.mydsl1.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyDsl.g:373:3: (otherlv_4= 'else' otherlv_5= 'do' ( (lv_statements2_6_0= ruleStatement ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:374:4: otherlv_4= 'else' otherlv_5= 'do' ( (lv_statements2_6_0= ruleStatement ) )*
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getElseKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getDoKeyword_4_1());
                    			
                    // InternalMyDsl.g:382:4: ( (lv_statements2_6_0= ruleStatement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15||(LA5_0>=18 && LA5_0<=19)||(LA5_0>=21 && LA5_0<=22)||(LA5_0>=41 && LA5_0<=48)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:383:5: (lv_statements2_6_0= ruleStatement )
                    	    {
                    	    // InternalMyDsl.g:383:5: (lv_statements2_6_0= ruleStatement )
                    	    // InternalMyDsl.g:384:6: lv_statements2_6_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfStatementAccess().getStatements2StatementParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_statements2_6_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements2",
                    	    							lv_statements2_6_0,
                    	    							"org.xtext.example.mydsl1.MyDsl.Statement");
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

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:410:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalMyDsl.g:410:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalMyDsl.g:411:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalMyDsl.g:417:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_whileExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_whileExpression_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:423:2: ( (otherlv_0= 'while' ( (lv_whileExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) )
            // InternalMyDsl.g:424:2: (otherlv_0= 'while' ( (lv_whileExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            {
            // InternalMyDsl.g:424:2: (otherlv_0= 'while' ( (lv_whileExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            // InternalMyDsl.g:425:3: otherlv_0= 'while' ( (lv_whileExpression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
            		
            // InternalMyDsl.g:429:3: ( (lv_whileExpression_1_0= ruleExpression ) )
            // InternalMyDsl.g:430:4: (lv_whileExpression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:430:4: (lv_whileExpression_1_0= ruleExpression )
            // InternalMyDsl.g:431:5: lv_whileExpression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_whileExpression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"whileExpression",
            						lv_whileExpression_1_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getDoKeyword_2());
            		
            // InternalMyDsl.g:452:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15||(LA7_0>=18 && LA7_0<=19)||(LA7_0>=21 && LA7_0<=22)||(LA7_0>=41 && LA7_0<=48)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:453:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:453:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMyDsl.g:454:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.example.mydsl1.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:479:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalMyDsl.g:479:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalMyDsl.g:480:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
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
    // InternalMyDsl.g:486:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_integer_1_0= ruleInteger ) ) otherlv_2= 'times' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_integer_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:492:2: ( (otherlv_0= 'repeat' ( (lv_integer_1_0= ruleInteger ) ) otherlv_2= 'times' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) )
            // InternalMyDsl.g:493:2: (otherlv_0= 'repeat' ( (lv_integer_1_0= ruleInteger ) ) otherlv_2= 'times' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            {
            // InternalMyDsl.g:493:2: (otherlv_0= 'repeat' ( (lv_integer_1_0= ruleInteger ) ) otherlv_2= 'times' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            // InternalMyDsl.g:494:3: otherlv_0= 'repeat' ( (lv_integer_1_0= ruleInteger ) ) otherlv_2= 'times' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepeatKeyword_0());
            		
            // InternalMyDsl.g:498:3: ( (lv_integer_1_0= ruleInteger ) )
            // InternalMyDsl.g:499:4: (lv_integer_1_0= ruleInteger )
            {
            // InternalMyDsl.g:499:4: (lv_integer_1_0= ruleInteger )
            // InternalMyDsl.g:500:5: lv_integer_1_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getIntegerIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_integer_1_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            					}
            					set(
            						current,
            						"integer",
            						lv_integer_1_0,
            						"org.xtext.example.mydsl1.MyDsl.Integer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getTimesKeyword_2());
            		
            // InternalMyDsl.g:521:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15||(LA8_0>=18 && LA8_0<=19)||(LA8_0>=21 && LA8_0<=22)||(LA8_0>=41 && LA8_0<=48)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:522:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:522:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMyDsl.g:523:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getRepeatStatementAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.example.mydsl1.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleComment"
    // InternalMyDsl.g:548:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalMyDsl.g:548:48: (iv_ruleComment= ruleComment EOF )
            // InternalMyDsl.g:549:2: iv_ruleComment= ruleComment EOF
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
    // InternalMyDsl.g:555:1: ruleComment returns [EObject current=null] : ( () otherlv_1= 'Comment' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:561:2: ( ( () otherlv_1= 'Comment' ) )
            // InternalMyDsl.g:562:2: ( () otherlv_1= 'Comment' )
            {
            // InternalMyDsl.g:562:2: ( () otherlv_1= 'Comment' )
            // InternalMyDsl.g:563:3: () otherlv_1= 'Comment'
            {
            // InternalMyDsl.g:563:3: ()
            // InternalMyDsl.g:564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getCommentKeyword_1());
            		

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


    // $ANTLR start "entryRuleTraceCommand"
    // InternalMyDsl.g:578:1: entryRuleTraceCommand returns [EObject current=null] : iv_ruleTraceCommand= ruleTraceCommand EOF ;
    public final EObject entryRuleTraceCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceCommand = null;


        try {
            // InternalMyDsl.g:578:53: (iv_ruleTraceCommand= ruleTraceCommand EOF )
            // InternalMyDsl.g:579:2: iv_ruleTraceCommand= ruleTraceCommand EOF
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
    // InternalMyDsl.g:585:1: ruleTraceCommand returns [EObject current=null] : (otherlv_0= 'trace' ( (lv_string_1_0= ruleStringExpression ) ) ) ;
    public final EObject ruleTraceCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_string_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:591:2: ( (otherlv_0= 'trace' ( (lv_string_1_0= ruleStringExpression ) ) ) )
            // InternalMyDsl.g:592:2: (otherlv_0= 'trace' ( (lv_string_1_0= ruleStringExpression ) ) )
            {
            // InternalMyDsl.g:592:2: (otherlv_0= 'trace' ( (lv_string_1_0= ruleStringExpression ) ) )
            // InternalMyDsl.g:593:3: otherlv_0= 'trace' ( (lv_string_1_0= ruleStringExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceCommandAccess().getTraceKeyword_0());
            		
            // InternalMyDsl.g:597:3: ( (lv_string_1_0= ruleStringExpression ) )
            // InternalMyDsl.g:598:4: (lv_string_1_0= ruleStringExpression )
            {
            // InternalMyDsl.g:598:4: (lv_string_1_0= ruleStringExpression )
            // InternalMyDsl.g:599:5: lv_string_1_0= ruleStringExpression
            {

            					newCompositeNode(grammarAccess.getTraceCommandAccess().getStringStringExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_string_1_0=ruleStringExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceCommandRule());
            					}
            					set(
            						current,
            						"string",
            						lv_string_1_0,
            						"org.xtext.example.mydsl1.MyDsl.StringExpression");
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
    // $ANTLR end "ruleTraceCommand"


    // $ANTLR start "entryRuleAtomicCommand"
    // InternalMyDsl.g:620:1: entryRuleAtomicCommand returns [EObject current=null] : iv_ruleAtomicCommand= ruleAtomicCommand EOF ;
    public final EObject entryRuleAtomicCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicCommand = null;


        try {
            // InternalMyDsl.g:620:54: (iv_ruleAtomicCommand= ruleAtomicCommand EOF )
            // InternalMyDsl.g:621:2: iv_ruleAtomicCommand= ruleAtomicCommand EOF
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
    // InternalMyDsl.g:627:1: ruleAtomicCommand returns [EObject current=null] : ( (lv_literal_0_0= ruleCommandLiteral ) ) ;
    public final EObject ruleAtomicCommand() throws RecognitionException {
        EObject current = null;

        Enumerator lv_literal_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:633:2: ( ( (lv_literal_0_0= ruleCommandLiteral ) ) )
            // InternalMyDsl.g:634:2: ( (lv_literal_0_0= ruleCommandLiteral ) )
            {
            // InternalMyDsl.g:634:2: ( (lv_literal_0_0= ruleCommandLiteral ) )
            // InternalMyDsl.g:635:3: (lv_literal_0_0= ruleCommandLiteral )
            {
            // InternalMyDsl.g:635:3: (lv_literal_0_0= ruleCommandLiteral )
            // InternalMyDsl.g:636:4: lv_literal_0_0= ruleCommandLiteral
            {

            				newCompositeNode(grammarAccess.getAtomicCommandAccess().getLiteralCommandLiteralEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_literal_0_0=ruleCommandLiteral();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAtomicCommandRule());
            				}
            				set(
            					current,
            					"literal",
            					lv_literal_0_0,
            					"org.xtext.example.mydsl1.MyDsl.CommandLiteral");
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
    // InternalMyDsl.g:656:1: entryRuleConstructionStatement returns [EObject current=null] : iv_ruleConstructionStatement= ruleConstructionStatement EOF ;
    public final EObject entryRuleConstructionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructionStatement = null;


        try {
            // InternalMyDsl.g:656:62: (iv_ruleConstructionStatement= ruleConstructionStatement EOF )
            // InternalMyDsl.g:657:2: iv_ruleConstructionStatement= ruleConstructionStatement EOF
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
    // InternalMyDsl.g:663:1: ruleConstructionStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_integers_3_0= ruleInteger ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_integers_6_0= ruleInteger ) ) ) ;
    public final EObject ruleConstructionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_command_0_0 = null;

        EObject lv_integers_3_0 = null;

        EObject lv_integers_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:669:2: ( ( ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_integers_3_0= ruleInteger ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_integers_6_0= ruleInteger ) ) ) )
            // InternalMyDsl.g:670:2: ( ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_integers_3_0= ruleInteger ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_integers_6_0= ruleInteger ) ) )
            {
            // InternalMyDsl.g:670:2: ( ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_integers_3_0= ruleInteger ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_integers_6_0= ruleInteger ) ) )
            // InternalMyDsl.g:671:3: ( (lv_command_0_0= ruleGridLiteral ) ) otherlv_1= 'at' otherlv_2= 'row:' ( (lv_integers_3_0= ruleInteger ) ) otherlv_4= ',' otherlv_5= 'col:' ( (lv_integers_6_0= ruleInteger ) )
            {
            // InternalMyDsl.g:671:3: ( (lv_command_0_0= ruleGridLiteral ) )
            // InternalMyDsl.g:672:4: (lv_command_0_0= ruleGridLiteral )
            {
            // InternalMyDsl.g:672:4: (lv_command_0_0= ruleGridLiteral )
            // InternalMyDsl.g:673:5: lv_command_0_0= ruleGridLiteral
            {

            					newCompositeNode(grammarAccess.getConstructionStatementAccess().getCommandGridLiteralEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_command_0_0=ruleGridLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructionStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"org.xtext.example.mydsl1.MyDsl.GridLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructionStatementAccess().getAtKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConstructionStatementAccess().getRowKeyword_2());
            		
            // InternalMyDsl.g:698:3: ( (lv_integers_3_0= ruleInteger ) )
            // InternalMyDsl.g:699:4: (lv_integers_3_0= ruleInteger )
            {
            // InternalMyDsl.g:699:4: (lv_integers_3_0= ruleInteger )
            // InternalMyDsl.g:700:5: lv_integers_3_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getConstructionStatementAccess().getIntegersIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_integers_3_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructionStatementRule());
            					}
            					add(
            						current,
            						"integers",
            						lv_integers_3_0,
            						"org.xtext.example.mydsl1.MyDsl.Integer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getConstructionStatementAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getConstructionStatementAccess().getColKeyword_5());
            		
            // InternalMyDsl.g:725:3: ( (lv_integers_6_0= ruleInteger ) )
            // InternalMyDsl.g:726:4: (lv_integers_6_0= ruleInteger )
            {
            // InternalMyDsl.g:726:4: (lv_integers_6_0= ruleInteger )
            // InternalMyDsl.g:727:5: lv_integers_6_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getConstructionStatementAccess().getIntegersIntegerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_integers_6_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructionStatementRule());
            					}
            					add(
            						current,
            						"integers",
            						lv_integers_6_0,
            						"org.xtext.example.mydsl1.MyDsl.Integer");
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
    // $ANTLR end "ruleConstructionStatement"


    // $ANTLR start "entryRuleNegatedExpression"
    // InternalMyDsl.g:748:1: entryRuleNegatedExpression returns [EObject current=null] : iv_ruleNegatedExpression= ruleNegatedExpression EOF ;
    public final EObject entryRuleNegatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegatedExpression = null;


        try {
            // InternalMyDsl.g:748:58: (iv_ruleNegatedExpression= ruleNegatedExpression EOF )
            // InternalMyDsl.g:749:2: iv_ruleNegatedExpression= ruleNegatedExpression EOF
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
    // InternalMyDsl.g:755:1: ruleNegatedExpression returns [EObject current=null] : (otherlv_0= 'not' ( (lv_negatedExpression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleNegatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_negatedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:761:2: ( (otherlv_0= 'not' ( (lv_negatedExpression_1_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:762:2: (otherlv_0= 'not' ( (lv_negatedExpression_1_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:762:2: (otherlv_0= 'not' ( (lv_negatedExpression_1_0= ruleExpression ) ) )
            // InternalMyDsl.g:763:3: otherlv_0= 'not' ( (lv_negatedExpression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNegatedExpressionAccess().getNotKeyword_0());
            		
            // InternalMyDsl.g:767:3: ( (lv_negatedExpression_1_0= ruleExpression ) )
            // InternalMyDsl.g:768:4: (lv_negatedExpression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:768:4: (lv_negatedExpression_1_0= ruleExpression )
            // InternalMyDsl.g:769:5: lv_negatedExpression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNegatedExpressionAccess().getNegatedExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_negatedExpression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegatedExpressionRule());
            					}
            					set(
            						current,
            						"negatedExpression",
            						lv_negatedExpression_1_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
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
    // InternalMyDsl.g:790:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalMyDsl.g:790:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalMyDsl.g:791:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalMyDsl.g:797:1: ruleBinaryExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_leftExpression_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_leftExpression_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:803:2: ( (otherlv_0= '(' ( (lv_leftExpression_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:804:2: (otherlv_0= '(' ( (lv_leftExpression_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:804:2: (otherlv_0= '(' ( (lv_leftExpression_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:805:3: otherlv_0= '(' ( (lv_leftExpression_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperatorLiteral ) ) ( (lv_rightExpression_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:809:3: ( (lv_leftExpression_1_0= ruleExpression ) )
            // InternalMyDsl.g:810:4: (lv_leftExpression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:810:4: (lv_leftExpression_1_0= ruleExpression )
            // InternalMyDsl.g:811:5: lv_leftExpression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_leftExpression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"leftExpression",
            						lv_leftExpression_1_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:828:3: ( (lv_operator_2_0= ruleOperatorLiteral ) )
            // InternalMyDsl.g:829:4: (lv_operator_2_0= ruleOperatorLiteral )
            {
            // InternalMyDsl.g:829:4: (lv_operator_2_0= ruleOperatorLiteral )
            // InternalMyDsl.g:830:5: lv_operator_2_0= ruleOperatorLiteral
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorOperatorLiteralEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_operator_2_0=ruleOperatorLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"org.xtext.example.mydsl1.MyDsl.OperatorLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:847:3: ( (lv_rightExpression_3_0= ruleExpression ) )
            // InternalMyDsl.g:848:4: (lv_rightExpression_3_0= ruleExpression )
            {
            // InternalMyDsl.g:848:4: (lv_rightExpression_3_0= ruleExpression )
            // InternalMyDsl.g:849:5: lv_rightExpression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_rightExpression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"rightExpression",
            						lv_rightExpression_3_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalMyDsl.g:874:1: entryRuleHeadingExpression returns [EObject current=null] : iv_ruleHeadingExpression= ruleHeadingExpression EOF ;
    public final EObject entryRuleHeadingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadingExpression = null;


        try {
            // InternalMyDsl.g:874:58: (iv_ruleHeadingExpression= ruleHeadingExpression EOF )
            // InternalMyDsl.g:875:2: iv_ruleHeadingExpression= ruleHeadingExpression EOF
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
    // InternalMyDsl.g:881:1: ruleHeadingExpression returns [EObject current=null] : ( ( (lv_headingLiteral_0_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_1_0= ruleDirectionLiteral ) ) ) ;
    public final EObject ruleHeadingExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_headingLiteral_0_0 = null;

        Enumerator lv_directionLiteral_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:887:2: ( ( ( (lv_headingLiteral_0_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_1_0= ruleDirectionLiteral ) ) ) )
            // InternalMyDsl.g:888:2: ( ( (lv_headingLiteral_0_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_1_0= ruleDirectionLiteral ) ) )
            {
            // InternalMyDsl.g:888:2: ( ( (lv_headingLiteral_0_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_1_0= ruleDirectionLiteral ) ) )
            // InternalMyDsl.g:889:3: ( (lv_headingLiteral_0_0= ruleHeadingLiteral ) ) ( (lv_directionLiteral_1_0= ruleDirectionLiteral ) )
            {
            // InternalMyDsl.g:889:3: ( (lv_headingLiteral_0_0= ruleHeadingLiteral ) )
            // InternalMyDsl.g:890:4: (lv_headingLiteral_0_0= ruleHeadingLiteral )
            {
            // InternalMyDsl.g:890:4: (lv_headingLiteral_0_0= ruleHeadingLiteral )
            // InternalMyDsl.g:891:5: lv_headingLiteral_0_0= ruleHeadingLiteral
            {

            					newCompositeNode(grammarAccess.getHeadingExpressionAccess().getHeadingLiteralHeadingLiteralEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_headingLiteral_0_0=ruleHeadingLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadingExpressionRule());
            					}
            					set(
            						current,
            						"headingLiteral",
            						lv_headingLiteral_0_0,
            						"org.xtext.example.mydsl1.MyDsl.HeadingLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:908:3: ( (lv_directionLiteral_1_0= ruleDirectionLiteral ) )
            // InternalMyDsl.g:909:4: (lv_directionLiteral_1_0= ruleDirectionLiteral )
            {
            // InternalMyDsl.g:909:4: (lv_directionLiteral_1_0= ruleDirectionLiteral )
            // InternalMyDsl.g:910:5: lv_directionLiteral_1_0= ruleDirectionLiteral
            {

            					newCompositeNode(grammarAccess.getHeadingExpressionAccess().getDirectionLiteralDirectionLiteralEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_directionLiteral_1_0=ruleDirectionLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadingExpressionRule());
            					}
            					set(
            						current,
            						"directionLiteral",
            						lv_directionLiteral_1_0,
            						"org.xtext.example.mydsl1.MyDsl.DirectionLiteral");
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
    // InternalMyDsl.g:931:1: entryRuleWallAheadExpression returns [EObject current=null] : iv_ruleWallAheadExpression= ruleWallAheadExpression EOF ;
    public final EObject entryRuleWallAheadExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallAheadExpression = null;


        try {
            // InternalMyDsl.g:931:60: (iv_ruleWallAheadExpression= ruleWallAheadExpression EOF )
            // InternalMyDsl.g:932:2: iv_ruleWallAheadExpression= ruleWallAheadExpression EOF
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
    // InternalMyDsl.g:938:1: ruleWallAheadExpression returns [EObject current=null] : ( ( (lv_wall_0_0= ruleWallLiteral ) ) ( (lv_ahead_1_0= ruleAheadLiteral ) ) ) ;
    public final EObject ruleWallAheadExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_wall_0_0 = null;

        Enumerator lv_ahead_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:944:2: ( ( ( (lv_wall_0_0= ruleWallLiteral ) ) ( (lv_ahead_1_0= ruleAheadLiteral ) ) ) )
            // InternalMyDsl.g:945:2: ( ( (lv_wall_0_0= ruleWallLiteral ) ) ( (lv_ahead_1_0= ruleAheadLiteral ) ) )
            {
            // InternalMyDsl.g:945:2: ( ( (lv_wall_0_0= ruleWallLiteral ) ) ( (lv_ahead_1_0= ruleAheadLiteral ) ) )
            // InternalMyDsl.g:946:3: ( (lv_wall_0_0= ruleWallLiteral ) ) ( (lv_ahead_1_0= ruleAheadLiteral ) )
            {
            // InternalMyDsl.g:946:3: ( (lv_wall_0_0= ruleWallLiteral ) )
            // InternalMyDsl.g:947:4: (lv_wall_0_0= ruleWallLiteral )
            {
            // InternalMyDsl.g:947:4: (lv_wall_0_0= ruleWallLiteral )
            // InternalMyDsl.g:948:5: lv_wall_0_0= ruleWallLiteral
            {

            					newCompositeNode(grammarAccess.getWallAheadExpressionAccess().getWallWallLiteralEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_wall_0_0=ruleWallLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallAheadExpressionRule());
            					}
            					set(
            						current,
            						"wall",
            						lv_wall_0_0,
            						"org.xtext.example.mydsl1.MyDsl.WallLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:965:3: ( (lv_ahead_1_0= ruleAheadLiteral ) )
            // InternalMyDsl.g:966:4: (lv_ahead_1_0= ruleAheadLiteral )
            {
            // InternalMyDsl.g:966:4: (lv_ahead_1_0= ruleAheadLiteral )
            // InternalMyDsl.g:967:5: lv_ahead_1_0= ruleAheadLiteral
            {

            					newCompositeNode(grammarAccess.getWallAheadExpressionAccess().getAheadAheadLiteralEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ahead_1_0=ruleAheadLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallAheadExpressionRule());
            					}
            					set(
            						current,
            						"ahead",
            						lv_ahead_1_0,
            						"org.xtext.example.mydsl1.MyDsl.AheadLiteral");
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
    // InternalMyDsl.g:988:1: entryRuleNormalExpression returns [EObject current=null] : iv_ruleNormalExpression= ruleNormalExpression EOF ;
    public final EObject entryRuleNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalExpression = null;


        try {
            // InternalMyDsl.g:988:57: (iv_ruleNormalExpression= ruleNormalExpression EOF )
            // InternalMyDsl.g:989:2: iv_ruleNormalExpression= ruleNormalExpression EOF
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
    // InternalMyDsl.g:995:1: ruleNormalExpression returns [EObject current=null] : ( (lv_literal_0_0= ruleNormalExpressionLiteral ) ) ;
    public final EObject ruleNormalExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_literal_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1001:2: ( ( (lv_literal_0_0= ruleNormalExpressionLiteral ) ) )
            // InternalMyDsl.g:1002:2: ( (lv_literal_0_0= ruleNormalExpressionLiteral ) )
            {
            // InternalMyDsl.g:1002:2: ( (lv_literal_0_0= ruleNormalExpressionLiteral ) )
            // InternalMyDsl.g:1003:3: (lv_literal_0_0= ruleNormalExpressionLiteral )
            {
            // InternalMyDsl.g:1003:3: (lv_literal_0_0= ruleNormalExpressionLiteral )
            // InternalMyDsl.g:1004:4: lv_literal_0_0= ruleNormalExpressionLiteral
            {

            				newCompositeNode(grammarAccess.getNormalExpressionAccess().getLiteralNormalExpressionLiteralEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_literal_0_0=ruleNormalExpressionLiteral();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNormalExpressionRule());
            				}
            				set(
            					current,
            					"literal",
            					lv_literal_0_0,
            					"org.xtext.example.mydsl1.MyDsl.NormalExpressionLiteral");
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
    // $ANTLR end "ruleNormalExpression"


    // $ANTLR start "entryRuleInteger"
    // InternalMyDsl.g:1024:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalMyDsl.g:1024:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalMyDsl.g:1025:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalMyDsl.g:1031:1: ruleInteger returns [EObject current=null] : ( () this_INT_1= RULE_INT ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1037:2: ( ( () this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1038:2: ( () this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1038:2: ( () this_INT_1= RULE_INT )
            // InternalMyDsl.g:1039:3: () this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1039:3: ()
            // InternalMyDsl.g:1040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleStringExpression"
    // InternalMyDsl.g:1054:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalMyDsl.g:1054:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalMyDsl.g:1055:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalMyDsl.g:1061:1: ruleStringExpression returns [EObject current=null] : ( () this_STRING_1= RULE_STRING ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1067:2: ( ( () this_STRING_1= RULE_STRING ) )
            // InternalMyDsl.g:1068:2: ( () this_STRING_1= RULE_STRING )
            {
            // InternalMyDsl.g:1068:2: ( () this_STRING_1= RULE_STRING )
            // InternalMyDsl.g:1069:3: () this_STRING_1= RULE_STRING
            {
            // InternalMyDsl.g:1069:3: ()
            // InternalMyDsl.g:1070:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringExpressionAccess().getStringExpressionAction_0(),
            					current);
            			

            }

            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_1, grammarAccess.getStringExpressionAccess().getSTRINGTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "ruleOperatorLiteral"
    // InternalMyDsl.g:1084:1: ruleOperatorLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleOperatorLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1090:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalMyDsl.g:1091:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalMyDsl.g:1091:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
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
                    // InternalMyDsl.g:1092:3: (enumLiteral_0= 'and' )
                    {
                    // InternalMyDsl.g:1092:3: (enumLiteral_0= 'and' )
                    // InternalMyDsl.g:1093:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperatorLiteralAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorLiteralAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1100:3: (enumLiteral_1= 'or' )
                    {
                    // InternalMyDsl.g:1100:3: (enumLiteral_1= 'or' )
                    // InternalMyDsl.g:1101:4: enumLiteral_1= 'or'
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
    // InternalMyDsl.g:1111:1: ruleHeadingLiteral returns [Enumerator current=null] : (enumLiteral_0= 'heading' ) ;
    public final Enumerator ruleHeadingLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1117:2: ( (enumLiteral_0= 'heading' ) )
            // InternalMyDsl.g:1118:2: (enumLiteral_0= 'heading' )
            {
            // InternalMyDsl.g:1118:2: (enumLiteral_0= 'heading' )
            // InternalMyDsl.g:1119:3: enumLiteral_0= 'heading'
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
    // InternalMyDsl.g:1128:1: ruleDirectionLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleDirectionLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1134:2: ( ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) ) )
            // InternalMyDsl.g:1135:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalMyDsl.g:1135:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'south' ) | (enumLiteral_2= 'east' ) | (enumLiteral_3= 'west' ) )
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
                    // InternalMyDsl.g:1136:3: (enumLiteral_0= 'north' )
                    {
                    // InternalMyDsl.g:1136:3: (enumLiteral_0= 'north' )
                    // InternalMyDsl.g:1137:4: enumLiteral_0= 'north'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getNorthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionLiteralAccess().getNorthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1144:3: (enumLiteral_1= 'south' )
                    {
                    // InternalMyDsl.g:1144:3: (enumLiteral_1= 'south' )
                    // InternalMyDsl.g:1145:4: enumLiteral_1= 'south'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getSouthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionLiteralAccess().getSouthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1152:3: (enumLiteral_2= 'east' )
                    {
                    // InternalMyDsl.g:1152:3: (enumLiteral_2= 'east' )
                    // InternalMyDsl.g:1153:4: enumLiteral_2= 'east'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDirectionLiteralAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionLiteralAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1160:3: (enumLiteral_3= 'west' )
                    {
                    // InternalMyDsl.g:1160:3: (enumLiteral_3= 'west' )
                    // InternalMyDsl.g:1161:4: enumLiteral_3= 'west'
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
    // InternalMyDsl.g:1171:1: ruleWallLiteral returns [Enumerator current=null] : (enumLiteral_0= 'wall' ) ;
    public final Enumerator ruleWallLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1177:2: ( (enumLiteral_0= 'wall' ) )
            // InternalMyDsl.g:1178:2: (enumLiteral_0= 'wall' )
            {
            // InternalMyDsl.g:1178:2: (enumLiteral_0= 'wall' )
            // InternalMyDsl.g:1179:3: enumLiteral_0= 'wall'
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
    // InternalMyDsl.g:1188:1: ruleAheadLiteral returns [Enumerator current=null] : (enumLiteral_0= 'ahead' ) ;
    public final Enumerator ruleAheadLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1194:2: ( (enumLiteral_0= 'ahead' ) )
            // InternalMyDsl.g:1195:2: (enumLiteral_0= 'ahead' )
            {
            // InternalMyDsl.g:1195:2: (enumLiteral_0= 'ahead' )
            // InternalMyDsl.g:1196:3: enumLiteral_0= 'ahead'
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
    // InternalMyDsl.g:1205:1: ruleNormalExpressionLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) ) ;
    public final Enumerator ruleNormalExpressionLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1211:2: ( ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) ) )
            // InternalMyDsl.g:1212:2: ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) )
            {
            // InternalMyDsl.g:1212:2: ( (enumLiteral_0= 'full' ) | (enumLiteral_1= 'mark' ) )
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
                    // InternalMyDsl.g:1213:3: (enumLiteral_0= 'full' )
                    {
                    // InternalMyDsl.g:1213:3: (enumLiteral_0= 'full' )
                    // InternalMyDsl.g:1214:4: enumLiteral_0= 'full'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getNormalExpressionLiteralAccess().getFullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNormalExpressionLiteralAccess().getFullEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1221:3: (enumLiteral_1= 'mark' )
                    {
                    // InternalMyDsl.g:1221:3: (enumLiteral_1= 'mark' )
                    // InternalMyDsl.g:1222:4: enumLiteral_1= 'mark'
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
    // InternalMyDsl.g:1232:1: ruleCommandLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) ;
    public final Enumerator ruleCommandLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1238:2: ( ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) ) )
            // InternalMyDsl.g:1239:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
            {
            // InternalMyDsl.g:1239:2: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'turnLeft' ) | (enumLiteral_2= 'drop' ) | (enumLiteral_3= 'pick' ) )
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
                    // InternalMyDsl.g:1240:3: (enumLiteral_0= 'step' )
                    {
                    // InternalMyDsl.g:1240:3: (enumLiteral_0= 'step' )
                    // InternalMyDsl.g:1241:4: enumLiteral_0= 'step'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getStepEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCommandLiteralAccess().getStepEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1248:3: (enumLiteral_1= 'turnLeft' )
                    {
                    // InternalMyDsl.g:1248:3: (enumLiteral_1= 'turnLeft' )
                    // InternalMyDsl.g:1249:4: enumLiteral_1= 'turnLeft'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getTurnLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCommandLiteralAccess().getTurnLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1256:3: (enumLiteral_2= 'drop' )
                    {
                    // InternalMyDsl.g:1256:3: (enumLiteral_2= 'drop' )
                    // InternalMyDsl.g:1257:4: enumLiteral_2= 'drop'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getCommandLiteralAccess().getDropEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCommandLiteralAccess().getDropEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1264:3: (enumLiteral_3= 'pick' )
                    {
                    // InternalMyDsl.g:1264:3: (enumLiteral_3= 'pick' )
                    // InternalMyDsl.g:1265:4: enumLiteral_3= 'pick'
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
    // InternalMyDsl.g:1275:1: ruleGridLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) ) ;
    public final Enumerator ruleGridLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1281:2: ( ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) ) )
            // InternalMyDsl.g:1282:2: ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) )
            {
            // InternalMyDsl.g:1282:2: ( (enumLiteral_0= 'buildWall' ) | (enumLiteral_1= 'destroyWall' ) | (enumLiteral_2= 'pickMark' ) | (enumLiteral_3= 'dropMark' ) )
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
                    // InternalMyDsl.g:1283:3: (enumLiteral_0= 'buildWall' )
                    {
                    // InternalMyDsl.g:1283:3: (enumLiteral_0= 'buildWall' )
                    // InternalMyDsl.g:1284:4: enumLiteral_0= 'buildWall'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getBuildWallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGridLiteralAccess().getBuildWallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1291:3: (enumLiteral_1= 'destroyWall' )
                    {
                    // InternalMyDsl.g:1291:3: (enumLiteral_1= 'destroyWall' )
                    // InternalMyDsl.g:1292:4: enumLiteral_1= 'destroyWall'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getDestroyWallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGridLiteralAccess().getDestroyWallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1299:3: (enumLiteral_2= 'pickMark' )
                    {
                    // InternalMyDsl.g:1299:3: (enumLiteral_2= 'pickMark' )
                    // InternalMyDsl.g:1300:4: enumLiteral_2= 'pickMark'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getGridLiteralAccess().getPickMarkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGridLiteralAccess().getPickMarkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1307:3: (enumLiteral_3= 'dropMark' )
                    {
                    // InternalMyDsl.g:1307:3: (enumLiteral_3= 'dropMark' )
                    // InternalMyDsl.g:1308:4: enumLiteral_3= 'dropMark'
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001FE00006CC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001A118000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001FE00006EC000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});

}