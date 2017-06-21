package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'heading'", "'wall'", "'ahead'", "'and'", "'or'", "'north'", "'south'", "'east'", "'west'", "'full'", "'mark'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'buildWall'", "'destroyWall'", "'pickMark'", "'dropMark'", "'Script'", "'runs'", "'as'", "'end'", "'if'", "'do'", "'else'", "'while'", "'repeat'", "'times'", "'Comment'", "'trace'", "'at'", "'row:'", "','", "'col:'", "'not'", "'('", "')'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleScript"
    // InternalMyDsl.g:53:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleScript EOF )
            // InternalMyDsl.g:55:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalMyDsl.g:62:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Script__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Script__Group__0 )
            // InternalMyDsl.g:69:4: rule__Script__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStatement EOF )
            // InternalMyDsl.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Statement__Alternatives )
            // InternalMyDsl.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleExpression EOF )
            // InternalMyDsl.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:119:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:128:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleName EOF )
            // InternalMyDsl.g:130:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMyDsl.g:137:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Name__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Name__Group__0 )
            // InternalMyDsl.g:144:4: rule__Name__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMyDsl.g:153:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleIfStatement EOF )
            // InternalMyDsl.g:155:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMyDsl.g:162:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__IfStatement__Group__0 )
            // InternalMyDsl.g:169:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalMyDsl.g:178:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleWhileStatement EOF )
            // InternalMyDsl.g:180:1: ruleWhileStatement EOF
            {
             before(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleWhileStatement();

            state._fsp--;

             after(grammarAccess.getWhileStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalMyDsl.g:187:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__WhileStatement__Group__0 )
            {
             before(grammarAccess.getWhileStatementAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__WhileStatement__Group__0 )
            // InternalMyDsl.g:194:4: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleRepeatStatement"
    // InternalMyDsl.g:203:1: entryRuleRepeatStatement : ruleRepeatStatement EOF ;
    public final void entryRuleRepeatStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRepeatStatement EOF )
            // InternalMyDsl.g:205:1: ruleRepeatStatement EOF
            {
             before(grammarAccess.getRepeatStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleRepeatStatement();

            state._fsp--;

             after(grammarAccess.getRepeatStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepeatStatement"


    // $ANTLR start "ruleRepeatStatement"
    // InternalMyDsl.g:212:1: ruleRepeatStatement : ( ( rule__RepeatStatement__Group__0 ) ) ;
    public final void ruleRepeatStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__RepeatStatement__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__RepeatStatement__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__RepeatStatement__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__RepeatStatement__Group__0 )
            {
             before(grammarAccess.getRepeatStatementAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__RepeatStatement__Group__0 )
            // InternalMyDsl.g:219:4: rule__RepeatStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepeatStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepeatStatement"


    // $ANTLR start "entryRuleComment"
    // InternalMyDsl.g:228:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleComment EOF )
            // InternalMyDsl.g:230:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalMyDsl.g:237:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Comment__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Comment__Group__0 )
            // InternalMyDsl.g:244:4: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleTraceCommand"
    // InternalMyDsl.g:253:1: entryRuleTraceCommand : ruleTraceCommand EOF ;
    public final void entryRuleTraceCommand() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleTraceCommand EOF )
            // InternalMyDsl.g:255:1: ruleTraceCommand EOF
            {
             before(grammarAccess.getTraceCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleTraceCommand();

            state._fsp--;

             after(grammarAccess.getTraceCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTraceCommand"


    // $ANTLR start "ruleTraceCommand"
    // InternalMyDsl.g:262:1: ruleTraceCommand : ( ( rule__TraceCommand__Group__0 ) ) ;
    public final void ruleTraceCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__TraceCommand__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__TraceCommand__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__TraceCommand__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__TraceCommand__Group__0 )
            {
             before(grammarAccess.getTraceCommandAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__TraceCommand__Group__0 )
            // InternalMyDsl.g:269:4: rule__TraceCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TraceCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraceCommand"


    // $ANTLR start "entryRuleAtomicCommand"
    // InternalMyDsl.g:278:1: entryRuleAtomicCommand : ruleAtomicCommand EOF ;
    public final void entryRuleAtomicCommand() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleAtomicCommand EOF )
            // InternalMyDsl.g:280:1: ruleAtomicCommand EOF
            {
             before(grammarAccess.getAtomicCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicCommand();

            state._fsp--;

             after(grammarAccess.getAtomicCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicCommand"


    // $ANTLR start "ruleAtomicCommand"
    // InternalMyDsl.g:287:1: ruleAtomicCommand : ( ( rule__AtomicCommand__LiteralAssignment ) ) ;
    public final void ruleAtomicCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__AtomicCommand__LiteralAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__AtomicCommand__LiteralAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__AtomicCommand__LiteralAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__AtomicCommand__LiteralAssignment )
            {
             before(grammarAccess.getAtomicCommandAccess().getLiteralAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__AtomicCommand__LiteralAssignment )
            // InternalMyDsl.g:294:4: rule__AtomicCommand__LiteralAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AtomicCommand__LiteralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtomicCommandAccess().getLiteralAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicCommand"


    // $ANTLR start "entryRuleConstructionStatement"
    // InternalMyDsl.g:303:1: entryRuleConstructionStatement : ruleConstructionStatement EOF ;
    public final void entryRuleConstructionStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleConstructionStatement EOF )
            // InternalMyDsl.g:305:1: ruleConstructionStatement EOF
            {
             before(grammarAccess.getConstructionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleConstructionStatement();

            state._fsp--;

             after(grammarAccess.getConstructionStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructionStatement"


    // $ANTLR start "ruleConstructionStatement"
    // InternalMyDsl.g:312:1: ruleConstructionStatement : ( ( rule__ConstructionStatement__Group__0 ) ) ;
    public final void ruleConstructionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ConstructionStatement__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ConstructionStatement__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ConstructionStatement__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ConstructionStatement__Group__0 )
            {
             before(grammarAccess.getConstructionStatementAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ConstructionStatement__Group__0 )
            // InternalMyDsl.g:319:4: rule__ConstructionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructionStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructionStatement"


    // $ANTLR start "entryRuleNegatedExpression"
    // InternalMyDsl.g:328:1: entryRuleNegatedExpression : ruleNegatedExpression EOF ;
    public final void entryRuleNegatedExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleNegatedExpression EOF )
            // InternalMyDsl.g:330:1: ruleNegatedExpression EOF
            {
             before(grammarAccess.getNegatedExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNegatedExpression();

            state._fsp--;

             after(grammarAccess.getNegatedExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegatedExpression"


    // $ANTLR start "ruleNegatedExpression"
    // InternalMyDsl.g:337:1: ruleNegatedExpression : ( ( rule__NegatedExpression__Group__0 ) ) ;
    public final void ruleNegatedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__NegatedExpression__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__NegatedExpression__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__NegatedExpression__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__NegatedExpression__Group__0 )
            {
             before(grammarAccess.getNegatedExpressionAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__NegatedExpression__Group__0 )
            // InternalMyDsl.g:344:4: rule__NegatedExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NegatedExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegatedExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegatedExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalMyDsl.g:353:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleBinaryExpression EOF )
            // InternalMyDsl.g:355:1: ruleBinaryExpression EOF
            {
             before(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalMyDsl.g:362:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__BinaryExpression__Group__0 )
            // InternalMyDsl.g:369:4: rule__BinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleHeadingExpression"
    // InternalMyDsl.g:378:1: entryRuleHeadingExpression : ruleHeadingExpression EOF ;
    public final void entryRuleHeadingExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleHeadingExpression EOF )
            // InternalMyDsl.g:380:1: ruleHeadingExpression EOF
            {
             before(grammarAccess.getHeadingExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeadingExpression();

            state._fsp--;

             after(grammarAccess.getHeadingExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeadingExpression"


    // $ANTLR start "ruleHeadingExpression"
    // InternalMyDsl.g:387:1: ruleHeadingExpression : ( ( rule__HeadingExpression__Group__0 ) ) ;
    public final void ruleHeadingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__HeadingExpression__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__HeadingExpression__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__HeadingExpression__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__HeadingExpression__Group__0 )
            {
             before(grammarAccess.getHeadingExpressionAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__HeadingExpression__Group__0 )
            // InternalMyDsl.g:394:4: rule__HeadingExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeadingExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadingExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeadingExpression"


    // $ANTLR start "entryRuleWallAheadExpression"
    // InternalMyDsl.g:403:1: entryRuleWallAheadExpression : ruleWallAheadExpression EOF ;
    public final void entryRuleWallAheadExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleWallAheadExpression EOF )
            // InternalMyDsl.g:405:1: ruleWallAheadExpression EOF
            {
             before(grammarAccess.getWallAheadExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleWallAheadExpression();

            state._fsp--;

             after(grammarAccess.getWallAheadExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWallAheadExpression"


    // $ANTLR start "ruleWallAheadExpression"
    // InternalMyDsl.g:412:1: ruleWallAheadExpression : ( ( rule__WallAheadExpression__Group__0 ) ) ;
    public final void ruleWallAheadExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__WallAheadExpression__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__WallAheadExpression__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__WallAheadExpression__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__WallAheadExpression__Group__0 )
            {
             before(grammarAccess.getWallAheadExpressionAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__WallAheadExpression__Group__0 )
            // InternalMyDsl.g:419:4: rule__WallAheadExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WallAheadExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWallAheadExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWallAheadExpression"


    // $ANTLR start "entryRuleNormalExpression"
    // InternalMyDsl.g:428:1: entryRuleNormalExpression : ruleNormalExpression EOF ;
    public final void entryRuleNormalExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleNormalExpression EOF )
            // InternalMyDsl.g:430:1: ruleNormalExpression EOF
            {
             before(grammarAccess.getNormalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNormalExpression();

            state._fsp--;

             after(grammarAccess.getNormalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNormalExpression"


    // $ANTLR start "ruleNormalExpression"
    // InternalMyDsl.g:437:1: ruleNormalExpression : ( ( rule__NormalExpression__LiteralAssignment ) ) ;
    public final void ruleNormalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__NormalExpression__LiteralAssignment ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__NormalExpression__LiteralAssignment ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__NormalExpression__LiteralAssignment ) )
            // InternalMyDsl.g:443:3: ( rule__NormalExpression__LiteralAssignment )
            {
             before(grammarAccess.getNormalExpressionAccess().getLiteralAssignment()); 
            // InternalMyDsl.g:444:3: ( rule__NormalExpression__LiteralAssignment )
            // InternalMyDsl.g:444:4: rule__NormalExpression__LiteralAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NormalExpression__LiteralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNormalExpressionAccess().getLiteralAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormalExpression"


    // $ANTLR start "entryRuleInteger"
    // InternalMyDsl.g:453:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleInteger EOF )
            // InternalMyDsl.g:455:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalMyDsl.g:462:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Integer__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Integer__Group__0 )
            // InternalMyDsl.g:469:4: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleStringExpression"
    // InternalMyDsl.g:478:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleStringExpression EOF )
            // InternalMyDsl.g:480:1: ruleStringExpression EOF
            {
             before(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getStringExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalMyDsl.g:487:1: ruleStringExpression : ( ( rule__StringExpression__Group__0 ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__StringExpression__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__StringExpression__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__StringExpression__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__StringExpression__Group__0 )
            {
             before(grammarAccess.getStringExpressionAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__StringExpression__Group__0 )
            // InternalMyDsl.g:494:4: rule__StringExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "ruleOperatorLiteral"
    // InternalMyDsl.g:503:1: ruleOperatorLiteral : ( ( rule__OperatorLiteral__Alternatives ) ) ;
    public final void ruleOperatorLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ( rule__OperatorLiteral__Alternatives ) ) )
            // InternalMyDsl.g:508:2: ( ( rule__OperatorLiteral__Alternatives ) )
            {
            // InternalMyDsl.g:508:2: ( ( rule__OperatorLiteral__Alternatives ) )
            // InternalMyDsl.g:509:3: ( rule__OperatorLiteral__Alternatives )
            {
             before(grammarAccess.getOperatorLiteralAccess().getAlternatives()); 
            // InternalMyDsl.g:510:3: ( rule__OperatorLiteral__Alternatives )
            // InternalMyDsl.g:510:4: rule__OperatorLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperatorLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperatorLiteral"


    // $ANTLR start "ruleHeadingLiteral"
    // InternalMyDsl.g:519:1: ruleHeadingLiteral : ( ( 'heading' ) ) ;
    public final void ruleHeadingLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( ( ( 'heading' ) ) )
            // InternalMyDsl.g:524:2: ( ( 'heading' ) )
            {
            // InternalMyDsl.g:524:2: ( ( 'heading' ) )
            // InternalMyDsl.g:525:3: ( 'heading' )
            {
             before(grammarAccess.getHeadingLiteralAccess().getHeadingEnumLiteralDeclaration()); 
            // InternalMyDsl.g:526:3: ( 'heading' )
            // InternalMyDsl.g:526:4: 'heading'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getHeadingLiteralAccess().getHeadingEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeadingLiteral"


    // $ANTLR start "ruleDirectionLiteral"
    // InternalMyDsl.g:535:1: ruleDirectionLiteral : ( ( rule__DirectionLiteral__Alternatives ) ) ;
    public final void ruleDirectionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( ( ( rule__DirectionLiteral__Alternatives ) ) )
            // InternalMyDsl.g:540:2: ( ( rule__DirectionLiteral__Alternatives ) )
            {
            // InternalMyDsl.g:540:2: ( ( rule__DirectionLiteral__Alternatives ) )
            // InternalMyDsl.g:541:3: ( rule__DirectionLiteral__Alternatives )
            {
             before(grammarAccess.getDirectionLiteralAccess().getAlternatives()); 
            // InternalMyDsl.g:542:3: ( rule__DirectionLiteral__Alternatives )
            // InternalMyDsl.g:542:4: rule__DirectionLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DirectionLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectionLiteral"


    // $ANTLR start "ruleWallLiteral"
    // InternalMyDsl.g:551:1: ruleWallLiteral : ( ( 'wall' ) ) ;
    public final void ruleWallLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( ( ( 'wall' ) ) )
            // InternalMyDsl.g:556:2: ( ( 'wall' ) )
            {
            // InternalMyDsl.g:556:2: ( ( 'wall' ) )
            // InternalMyDsl.g:557:3: ( 'wall' )
            {
             before(grammarAccess.getWallLiteralAccess().getWallEnumLiteralDeclaration()); 
            // InternalMyDsl.g:558:3: ( 'wall' )
            // InternalMyDsl.g:558:4: 'wall'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getWallLiteralAccess().getWallEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWallLiteral"


    // $ANTLR start "ruleAheadLiteral"
    // InternalMyDsl.g:567:1: ruleAheadLiteral : ( ( 'ahead' ) ) ;
    public final void ruleAheadLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( ( 'ahead' ) ) )
            // InternalMyDsl.g:572:2: ( ( 'ahead' ) )
            {
            // InternalMyDsl.g:572:2: ( ( 'ahead' ) )
            // InternalMyDsl.g:573:3: ( 'ahead' )
            {
             before(grammarAccess.getAheadLiteralAccess().getAheadEnumLiteralDeclaration()); 
            // InternalMyDsl.g:574:3: ( 'ahead' )
            // InternalMyDsl.g:574:4: 'ahead'
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getAheadLiteralAccess().getAheadEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAheadLiteral"


    // $ANTLR start "ruleNormalExpressionLiteral"
    // InternalMyDsl.g:583:1: ruleNormalExpressionLiteral : ( ( rule__NormalExpressionLiteral__Alternatives ) ) ;
    public final void ruleNormalExpressionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( ( rule__NormalExpressionLiteral__Alternatives ) ) )
            // InternalMyDsl.g:588:2: ( ( rule__NormalExpressionLiteral__Alternatives ) )
            {
            // InternalMyDsl.g:588:2: ( ( rule__NormalExpressionLiteral__Alternatives ) )
            // InternalMyDsl.g:589:3: ( rule__NormalExpressionLiteral__Alternatives )
            {
             before(grammarAccess.getNormalExpressionLiteralAccess().getAlternatives()); 
            // InternalMyDsl.g:590:3: ( rule__NormalExpressionLiteral__Alternatives )
            // InternalMyDsl.g:590:4: rule__NormalExpressionLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NormalExpressionLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNormalExpressionLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormalExpressionLiteral"


    // $ANTLR start "ruleCommandLiteral"
    // InternalMyDsl.g:599:1: ruleCommandLiteral : ( ( rule__CommandLiteral__Alternatives ) ) ;
    public final void ruleCommandLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( ( ( rule__CommandLiteral__Alternatives ) ) )
            // InternalMyDsl.g:604:2: ( ( rule__CommandLiteral__Alternatives ) )
            {
            // InternalMyDsl.g:604:2: ( ( rule__CommandLiteral__Alternatives ) )
            // InternalMyDsl.g:605:3: ( rule__CommandLiteral__Alternatives )
            {
             before(grammarAccess.getCommandLiteralAccess().getAlternatives()); 
            // InternalMyDsl.g:606:3: ( rule__CommandLiteral__Alternatives )
            // InternalMyDsl.g:606:4: rule__CommandLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CommandLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandLiteral"


    // $ANTLR start "ruleGridLiteral"
    // InternalMyDsl.g:615:1: ruleGridLiteral : ( ( rule__GridLiteral__Alternatives ) ) ;
    public final void ruleGridLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( ( rule__GridLiteral__Alternatives ) ) )
            // InternalMyDsl.g:620:2: ( ( rule__GridLiteral__Alternatives ) )
            {
            // InternalMyDsl.g:620:2: ( ( rule__GridLiteral__Alternatives ) )
            // InternalMyDsl.g:621:3: ( rule__GridLiteral__Alternatives )
            {
             before(grammarAccess.getGridLiteralAccess().getAlternatives()); 
            // InternalMyDsl.g:622:3: ( rule__GridLiteral__Alternatives )
            // InternalMyDsl.g:622:4: rule__GridLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GridLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGridLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGridLiteral"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyDsl.g:630:1: rule__Statement__Alternatives : ( ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleRepeatStatement ) | ( ruleComment ) | ( ruleTraceCommand ) | ( ruleAtomicCommand ) | ( ruleConstructionStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleRepeatStatement ) | ( ruleComment ) | ( ruleTraceCommand ) | ( ruleAtomicCommand ) | ( ruleConstructionStatement ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 38:
                {
                alt1=3;
                }
                break;
            case 40:
                {
                alt1=4;
                }
                break;
            case 41:
                {
                alt1=5;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt1=6;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:635:2: ( ruleIfStatement )
                    {
                    // InternalMyDsl.g:635:2: ( ruleIfStatement )
                    // InternalMyDsl.g:636:3: ruleIfStatement
                    {
                     before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:641:2: ( ruleWhileStatement )
                    {
                    // InternalMyDsl.g:641:2: ( ruleWhileStatement )
                    // InternalMyDsl.g:642:3: ruleWhileStatement
                    {
                     before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWhileStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:647:2: ( ruleRepeatStatement )
                    {
                    // InternalMyDsl.g:647:2: ( ruleRepeatStatement )
                    // InternalMyDsl.g:648:3: ruleRepeatStatement
                    {
                     before(grammarAccess.getStatementAccess().getRepeatStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRepeatStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRepeatStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:653:2: ( ruleComment )
                    {
                    // InternalMyDsl.g:653:2: ( ruleComment )
                    // InternalMyDsl.g:654:3: ruleComment
                    {
                     before(grammarAccess.getStatementAccess().getCommentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCommentParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:659:2: ( ruleTraceCommand )
                    {
                    // InternalMyDsl.g:659:2: ( ruleTraceCommand )
                    // InternalMyDsl.g:660:3: ruleTraceCommand
                    {
                     before(grammarAccess.getStatementAccess().getTraceCommandParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTraceCommand();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTraceCommandParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:665:2: ( ruleAtomicCommand )
                    {
                    // InternalMyDsl.g:665:2: ( ruleAtomicCommand )
                    // InternalMyDsl.g:666:3: ruleAtomicCommand
                    {
                     before(grammarAccess.getStatementAccess().getAtomicCommandParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomicCommand();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAtomicCommandParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:671:2: ( ruleConstructionStatement )
                    {
                    // InternalMyDsl.g:671:2: ( ruleConstructionStatement )
                    // InternalMyDsl.g:672:3: ruleConstructionStatement
                    {
                     before(grammarAccess.getStatementAccess().getConstructionStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleConstructionStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConstructionStatementParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:681:1: rule__Expression__Alternatives : ( ( ruleNegatedExpression ) | ( ruleBinaryExpression ) | ( ruleHeadingExpression ) | ( ruleWallAheadExpression ) | ( ruleNormalExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( ( ruleNegatedExpression ) | ( ruleBinaryExpression ) | ( ruleHeadingExpression ) | ( ruleWallAheadExpression ) | ( ruleNormalExpression ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt2=1;
                }
                break;
            case 47:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            case 20:
            case 21:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:686:2: ( ruleNegatedExpression )
                    {
                    // InternalMyDsl.g:686:2: ( ruleNegatedExpression )
                    // InternalMyDsl.g:687:3: ruleNegatedExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNegatedExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNegatedExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNegatedExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:692:2: ( ruleBinaryExpression )
                    {
                    // InternalMyDsl.g:692:2: ( ruleBinaryExpression )
                    // InternalMyDsl.g:693:3: ruleBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:698:2: ( ruleHeadingExpression )
                    {
                    // InternalMyDsl.g:698:2: ( ruleHeadingExpression )
                    // InternalMyDsl.g:699:3: ruleHeadingExpression
                    {
                     before(grammarAccess.getExpressionAccess().getHeadingExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHeadingExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getHeadingExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:704:2: ( ruleWallAheadExpression )
                    {
                    // InternalMyDsl.g:704:2: ( ruleWallAheadExpression )
                    // InternalMyDsl.g:705:3: ruleWallAheadExpression
                    {
                     before(grammarAccess.getExpressionAccess().getWallAheadExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWallAheadExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getWallAheadExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:710:2: ( ruleNormalExpression )
                    {
                    // InternalMyDsl.g:710:2: ( ruleNormalExpression )
                    // InternalMyDsl.g:711:3: ruleNormalExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNormalExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNormalExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNormalExpressionParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__OperatorLiteral__Alternatives"
    // InternalMyDsl.g:720:1: rule__OperatorLiteral__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__OperatorLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:725:2: ( ( 'and' ) )
                    {
                    // InternalMyDsl.g:725:2: ( ( 'and' ) )
                    // InternalMyDsl.g:726:3: ( 'and' )
                    {
                     before(grammarAccess.getOperatorLiteralAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:727:3: ( 'and' )
                    // InternalMyDsl.g:727:4: 'and'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorLiteralAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:731:2: ( ( 'or' ) )
                    {
                    // InternalMyDsl.g:731:2: ( ( 'or' ) )
                    // InternalMyDsl.g:732:3: ( 'or' )
                    {
                     before(grammarAccess.getOperatorLiteralAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:733:3: ( 'or' )
                    // InternalMyDsl.g:733:4: 'or'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorLiteralAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorLiteral__Alternatives"


    // $ANTLR start "rule__DirectionLiteral__Alternatives"
    // InternalMyDsl.g:741:1: rule__DirectionLiteral__Alternatives : ( ( ( 'north' ) ) | ( ( 'south' ) ) | ( ( 'east' ) ) | ( ( 'west' ) ) );
    public final void rule__DirectionLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( ( ( 'north' ) ) | ( ( 'south' ) ) | ( ( 'east' ) ) | ( ( 'west' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:746:2: ( ( 'north' ) )
                    {
                    // InternalMyDsl.g:746:2: ( ( 'north' ) )
                    // InternalMyDsl.g:747:3: ( 'north' )
                    {
                     before(grammarAccess.getDirectionLiteralAccess().getNorthEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:748:3: ( 'north' )
                    // InternalMyDsl.g:748:4: 'north'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionLiteralAccess().getNorthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:752:2: ( ( 'south' ) )
                    {
                    // InternalMyDsl.g:752:2: ( ( 'south' ) )
                    // InternalMyDsl.g:753:3: ( 'south' )
                    {
                     before(grammarAccess.getDirectionLiteralAccess().getSouthEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:754:3: ( 'south' )
                    // InternalMyDsl.g:754:4: 'south'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionLiteralAccess().getSouthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:758:2: ( ( 'east' ) )
                    {
                    // InternalMyDsl.g:758:2: ( ( 'east' ) )
                    // InternalMyDsl.g:759:3: ( 'east' )
                    {
                     before(grammarAccess.getDirectionLiteralAccess().getEastEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:760:3: ( 'east' )
                    // InternalMyDsl.g:760:4: 'east'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionLiteralAccess().getEastEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:764:2: ( ( 'west' ) )
                    {
                    // InternalMyDsl.g:764:2: ( ( 'west' ) )
                    // InternalMyDsl.g:765:3: ( 'west' )
                    {
                     before(grammarAccess.getDirectionLiteralAccess().getWestEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:766:3: ( 'west' )
                    // InternalMyDsl.g:766:4: 'west'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionLiteralAccess().getWestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionLiteral__Alternatives"


    // $ANTLR start "rule__NormalExpressionLiteral__Alternatives"
    // InternalMyDsl.g:774:1: rule__NormalExpressionLiteral__Alternatives : ( ( ( 'full' ) ) | ( ( 'mark' ) ) );
    public final void rule__NormalExpressionLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( ( ( 'full' ) ) | ( ( 'mark' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:779:2: ( ( 'full' ) )
                    {
                    // InternalMyDsl.g:779:2: ( ( 'full' ) )
                    // InternalMyDsl.g:780:3: ( 'full' )
                    {
                     before(grammarAccess.getNormalExpressionLiteralAccess().getFullEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:781:3: ( 'full' )
                    // InternalMyDsl.g:781:4: 'full'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getNormalExpressionLiteralAccess().getFullEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:785:2: ( ( 'mark' ) )
                    {
                    // InternalMyDsl.g:785:2: ( ( 'mark' ) )
                    // InternalMyDsl.g:786:3: ( 'mark' )
                    {
                     before(grammarAccess.getNormalExpressionLiteralAccess().getMarkEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:787:3: ( 'mark' )
                    // InternalMyDsl.g:787:4: 'mark'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getNormalExpressionLiteralAccess().getMarkEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalExpressionLiteral__Alternatives"


    // $ANTLR start "rule__CommandLiteral__Alternatives"
    // InternalMyDsl.g:795:1: rule__CommandLiteral__Alternatives : ( ( ( 'step' ) ) | ( ( 'turnLeft' ) ) | ( ( 'drop' ) ) | ( ( 'pick' ) ) );
    public final void rule__CommandLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( ( ( 'step' ) ) | ( ( 'turnLeft' ) ) | ( ( 'drop' ) ) | ( ( 'pick' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:800:2: ( ( 'step' ) )
                    {
                    // InternalMyDsl.g:800:2: ( ( 'step' ) )
                    // InternalMyDsl.g:801:3: ( 'step' )
                    {
                     before(grammarAccess.getCommandLiteralAccess().getStepEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:802:3: ( 'step' )
                    // InternalMyDsl.g:802:4: 'step'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommandLiteralAccess().getStepEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:806:2: ( ( 'turnLeft' ) )
                    {
                    // InternalMyDsl.g:806:2: ( ( 'turnLeft' ) )
                    // InternalMyDsl.g:807:3: ( 'turnLeft' )
                    {
                     before(grammarAccess.getCommandLiteralAccess().getTurnLeftEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:808:3: ( 'turnLeft' )
                    // InternalMyDsl.g:808:4: 'turnLeft'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommandLiteralAccess().getTurnLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:812:2: ( ( 'drop' ) )
                    {
                    // InternalMyDsl.g:812:2: ( ( 'drop' ) )
                    // InternalMyDsl.g:813:3: ( 'drop' )
                    {
                     before(grammarAccess.getCommandLiteralAccess().getDropEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:814:3: ( 'drop' )
                    // InternalMyDsl.g:814:4: 'drop'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommandLiteralAccess().getDropEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:818:2: ( ( 'pick' ) )
                    {
                    // InternalMyDsl.g:818:2: ( ( 'pick' ) )
                    // InternalMyDsl.g:819:3: ( 'pick' )
                    {
                     before(grammarAccess.getCommandLiteralAccess().getPickEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:820:3: ( 'pick' )
                    // InternalMyDsl.g:820:4: 'pick'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommandLiteralAccess().getPickEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandLiteral__Alternatives"


    // $ANTLR start "rule__GridLiteral__Alternatives"
    // InternalMyDsl.g:828:1: rule__GridLiteral__Alternatives : ( ( ( 'buildWall' ) ) | ( ( 'destroyWall' ) ) | ( ( 'pickMark' ) ) | ( ( 'dropMark' ) ) );
    public final void rule__GridLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:1: ( ( ( 'buildWall' ) ) | ( ( 'destroyWall' ) ) | ( ( 'pickMark' ) ) | ( ( 'dropMark' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:833:2: ( ( 'buildWall' ) )
                    {
                    // InternalMyDsl.g:833:2: ( ( 'buildWall' ) )
                    // InternalMyDsl.g:834:3: ( 'buildWall' )
                    {
                     before(grammarAccess.getGridLiteralAccess().getBuildWallEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:835:3: ( 'buildWall' )
                    // InternalMyDsl.g:835:4: 'buildWall'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getGridLiteralAccess().getBuildWallEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:839:2: ( ( 'destroyWall' ) )
                    {
                    // InternalMyDsl.g:839:2: ( ( 'destroyWall' ) )
                    // InternalMyDsl.g:840:3: ( 'destroyWall' )
                    {
                     before(grammarAccess.getGridLiteralAccess().getDestroyWallEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:841:3: ( 'destroyWall' )
                    // InternalMyDsl.g:841:4: 'destroyWall'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getGridLiteralAccess().getDestroyWallEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:845:2: ( ( 'pickMark' ) )
                    {
                    // InternalMyDsl.g:845:2: ( ( 'pickMark' ) )
                    // InternalMyDsl.g:846:3: ( 'pickMark' )
                    {
                     before(grammarAccess.getGridLiteralAccess().getPickMarkEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:847:3: ( 'pickMark' )
                    // InternalMyDsl.g:847:4: 'pickMark'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getGridLiteralAccess().getPickMarkEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:851:2: ( ( 'dropMark' ) )
                    {
                    // InternalMyDsl.g:851:2: ( ( 'dropMark' ) )
                    // InternalMyDsl.g:852:3: ( 'dropMark' )
                    {
                     before(grammarAccess.getGridLiteralAccess().getDropMarkEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:853:3: ( 'dropMark' )
                    // InternalMyDsl.g:853:4: 'dropMark'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getGridLiteralAccess().getDropMarkEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridLiteral__Alternatives"


    // $ANTLR start "rule__Script__Group__0"
    // InternalMyDsl.g:861:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:865:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalMyDsl.g:866:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // InternalMyDsl.g:873:1: rule__Script__Group__0__Impl : ( 'Script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( ( 'Script' ) )
            // InternalMyDsl.g:878:1: ( 'Script' )
            {
            // InternalMyDsl.g:878:1: ( 'Script' )
            // InternalMyDsl.g:879:2: 'Script'
            {
             before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getScriptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // InternalMyDsl.g:888:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // InternalMyDsl.g:893:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // InternalMyDsl.g:900:1: rule__Script__Group__1__Impl : ( ( rule__Script__NameAssignment_1 ) ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( ( ( rule__Script__NameAssignment_1 ) ) )
            // InternalMyDsl.g:905:1: ( ( rule__Script__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:905:1: ( ( rule__Script__NameAssignment_1 ) )
            // InternalMyDsl.g:906:2: ( rule__Script__NameAssignment_1 )
            {
             before(grammarAccess.getScriptAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:907:2: ( rule__Script__NameAssignment_1 )
            // InternalMyDsl.g:907:3: rule__Script__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Script__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // InternalMyDsl.g:915:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // InternalMyDsl.g:920:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Script__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // InternalMyDsl.g:927:1: rule__Script__Group__2__Impl : ( 'runs' ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( ( 'runs' ) )
            // InternalMyDsl.g:932:1: ( 'runs' )
            {
            // InternalMyDsl.g:932:1: ( 'runs' )
            // InternalMyDsl.g:933:2: 'runs'
            {
             before(grammarAccess.getScriptAccess().getRunsKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getRunsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Script__Group__3"
    // InternalMyDsl.g:942:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // InternalMyDsl.g:947:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Script__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3"


    // $ANTLR start "rule__Script__Group__3__Impl"
    // InternalMyDsl.g:954:1: rule__Script__Group__3__Impl : ( 'as' ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( 'as' ) )
            // InternalMyDsl.g:959:1: ( 'as' )
            {
            // InternalMyDsl.g:959:1: ( 'as' )
            // InternalMyDsl.g:960:2: 'as'
            {
             before(grammarAccess.getScriptAccess().getAsKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3__Impl"


    // $ANTLR start "rule__Script__Group__4"
    // InternalMyDsl.g:969:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // InternalMyDsl.g:974:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Script__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4"


    // $ANTLR start "rule__Script__Group__4__Impl"
    // InternalMyDsl.g:981:1: rule__Script__Group__4__Impl : ( ( rule__Script__StatementsAssignment_4 )* ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( ( ( rule__Script__StatementsAssignment_4 )* ) )
            // InternalMyDsl.g:986:1: ( ( rule__Script__StatementsAssignment_4 )* )
            {
            // InternalMyDsl.g:986:1: ( ( rule__Script__StatementsAssignment_4 )* )
            // InternalMyDsl.g:987:2: ( rule__Script__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScriptAccess().getStatementsAssignment_4()); 
            // InternalMyDsl.g:988:2: ( rule__Script__StatementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=29)||LA8_0==34||(LA8_0>=37 && LA8_0<=38)||(LA8_0>=40 && LA8_0<=41)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:988:3: rule__Script__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Script__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4__Impl"


    // $ANTLR start "rule__Script__Group__5"
    // InternalMyDsl.g:996:1: rule__Script__Group__5 : rule__Script__Group__5__Impl ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( rule__Script__Group__5__Impl )
            // InternalMyDsl.g:1001:2: rule__Script__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5"


    // $ANTLR start "rule__Script__Group__5__Impl"
    // InternalMyDsl.g:1007:1: rule__Script__Group__5__Impl : ( 'end' ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( ( 'end' ) )
            // InternalMyDsl.g:1012:1: ( 'end' )
            {
            // InternalMyDsl.g:1012:1: ( 'end' )
            // InternalMyDsl.g:1013:2: 'end'
            {
             before(grammarAccess.getScriptAccess().getEndKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalMyDsl.g:1023:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalMyDsl.g:1028:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalMyDsl.g:1035:1: rule__Name__Group__0__Impl : ( () ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( () ) )
            // InternalMyDsl.g:1040:1: ( () )
            {
            // InternalMyDsl.g:1040:1: ( () )
            // InternalMyDsl.g:1041:2: ()
            {
             before(grammarAccess.getNameAccess().getNameAction_0()); 
            // InternalMyDsl.g:1042:2: ()
            // InternalMyDsl.g:1042:3: 
            {
            }

             after(grammarAccess.getNameAccess().getNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // InternalMyDsl.g:1050:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( rule__Name__Group__1__Impl )
            // InternalMyDsl.g:1055:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalMyDsl.g:1061:1: rule__Name__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1065:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1066:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1066:1: ( RULE_ID )
            // InternalMyDsl.g:1067:2: RULE_ID
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalMyDsl.g:1077:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalMyDsl.g:1082:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalMyDsl.g:1089:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( ( 'if' ) )
            // InternalMyDsl.g:1094:1: ( 'if' )
            {
            // InternalMyDsl.g:1094:1: ( 'if' )
            // InternalMyDsl.g:1095:2: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalMyDsl.g:1104:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalMyDsl.g:1109:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalMyDsl.g:1116:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__IfExpressionAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( ( ( rule__IfStatement__IfExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:1121:1: ( ( rule__IfStatement__IfExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:1121:1: ( ( rule__IfStatement__IfExpressionAssignment_1 ) )
            // InternalMyDsl.g:1122:2: ( rule__IfStatement__IfExpressionAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getIfExpressionAssignment_1()); 
            // InternalMyDsl.g:1123:2: ( rule__IfStatement__IfExpressionAssignment_1 )
            // InternalMyDsl.g:1123:3: rule__IfStatement__IfExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__IfExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getIfExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalMyDsl.g:1131:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalMyDsl.g:1136:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalMyDsl.g:1143:1: rule__IfStatement__Group__2__Impl : ( 'do' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( ( 'do' ) )
            // InternalMyDsl.g:1148:1: ( 'do' )
            {
            // InternalMyDsl.g:1148:1: ( 'do' )
            // InternalMyDsl.g:1149:2: 'do'
            {
             before(grammarAccess.getIfStatementAccess().getDoKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalMyDsl.g:1158:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalMyDsl.g:1163:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalMyDsl.g:1170:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__StatementsAssignment_3 )* ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( ( ( rule__IfStatement__StatementsAssignment_3 )* ) )
            // InternalMyDsl.g:1175:1: ( ( rule__IfStatement__StatementsAssignment_3 )* )
            {
            // InternalMyDsl.g:1175:1: ( ( rule__IfStatement__StatementsAssignment_3 )* )
            // InternalMyDsl.g:1176:2: ( rule__IfStatement__StatementsAssignment_3 )*
            {
             before(grammarAccess.getIfStatementAccess().getStatementsAssignment_3()); 
            // InternalMyDsl.g:1177:2: ( rule__IfStatement__StatementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=22 && LA9_0<=29)||LA9_0==34||(LA9_0>=37 && LA9_0<=38)||(LA9_0>=40 && LA9_0<=41)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1177:3: rule__IfStatement__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__IfStatement__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalMyDsl.g:1185:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalMyDsl.g:1190:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalMyDsl.g:1197:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__Group_4__0 )? ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( ( ( rule__IfStatement__Group_4__0 )? ) )
            // InternalMyDsl.g:1202:1: ( ( rule__IfStatement__Group_4__0 )? )
            {
            // InternalMyDsl.g:1202:1: ( ( rule__IfStatement__Group_4__0 )? )
            // InternalMyDsl.g:1203:2: ( rule__IfStatement__Group_4__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_4()); 
            // InternalMyDsl.g:1204:2: ( rule__IfStatement__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1204:3: rule__IfStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalMyDsl.g:1212:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( rule__IfStatement__Group__5__Impl )
            // InternalMyDsl.g:1217:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalMyDsl.g:1223:1: rule__IfStatement__Group__5__Impl : ( 'end' ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1227:1: ( ( 'end' ) )
            // InternalMyDsl.g:1228:1: ( 'end' )
            {
            // InternalMyDsl.g:1228:1: ( 'end' )
            // InternalMyDsl.g:1229:2: 'end'
            {
             before(grammarAccess.getIfStatementAccess().getEndKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group_4__0"
    // InternalMyDsl.g:1239:1: rule__IfStatement__Group_4__0 : rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 ;
    public final void rule__IfStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 )
            // InternalMyDsl.g:1244:2: rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__IfStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_4__0"


    // $ANTLR start "rule__IfStatement__Group_4__0__Impl"
    // InternalMyDsl.g:1251:1: rule__IfStatement__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( 'else' ) )
            // InternalMyDsl.g:1256:1: ( 'else' )
            {
            // InternalMyDsl.g:1256:1: ( 'else' )
            // InternalMyDsl.g:1257:2: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getElseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_4__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_4__1"
    // InternalMyDsl.g:1266:1: rule__IfStatement__Group_4__1 : rule__IfStatement__Group_4__1__Impl rule__IfStatement__Group_4__2 ;
    public final void rule__IfStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( rule__IfStatement__Group_4__1__Impl rule__IfStatement__Group_4__2 )
            // InternalMyDsl.g:1271:2: rule__IfStatement__Group_4__1__Impl rule__IfStatement__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__IfStatement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_4__1"


    // $ANTLR start "rule__IfStatement__Group_4__1__Impl"
    // InternalMyDsl.g:1278:1: rule__IfStatement__Group_4__1__Impl : ( 'do' ) ;
    public final void rule__IfStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( ( 'do' ) )
            // InternalMyDsl.g:1283:1: ( 'do' )
            {
            // InternalMyDsl.g:1283:1: ( 'do' )
            // InternalMyDsl.g:1284:2: 'do'
            {
             before(grammarAccess.getIfStatementAccess().getDoKeyword_4_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getDoKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_4__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_4__2"
    // InternalMyDsl.g:1293:1: rule__IfStatement__Group_4__2 : rule__IfStatement__Group_4__2__Impl ;
    public final void rule__IfStatement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( rule__IfStatement__Group_4__2__Impl )
            // InternalMyDsl.g:1298:2: rule__IfStatement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_4__2"


    // $ANTLR start "rule__IfStatement__Group_4__2__Impl"
    // InternalMyDsl.g:1304:1: rule__IfStatement__Group_4__2__Impl : ( ( rule__IfStatement__Statements2Assignment_4_2 )* ) ;
    public final void rule__IfStatement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1308:1: ( ( ( rule__IfStatement__Statements2Assignment_4_2 )* ) )
            // InternalMyDsl.g:1309:1: ( ( rule__IfStatement__Statements2Assignment_4_2 )* )
            {
            // InternalMyDsl.g:1309:1: ( ( rule__IfStatement__Statements2Assignment_4_2 )* )
            // InternalMyDsl.g:1310:2: ( rule__IfStatement__Statements2Assignment_4_2 )*
            {
             before(grammarAccess.getIfStatementAccess().getStatements2Assignment_4_2()); 
            // InternalMyDsl.g:1311:2: ( rule__IfStatement__Statements2Assignment_4_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=22 && LA11_0<=29)||LA11_0==34||(LA11_0>=37 && LA11_0<=38)||(LA11_0>=40 && LA11_0<=41)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1311:3: rule__IfStatement__Statements2Assignment_4_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__IfStatement__Statements2Assignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getStatements2Assignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_4__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__0"
    // InternalMyDsl.g:1320:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalMyDsl.g:1325:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0"


    // $ANTLR start "rule__WhileStatement__Group__0__Impl"
    // InternalMyDsl.g:1332:1: rule__WhileStatement__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( ( 'while' ) )
            // InternalMyDsl.g:1337:1: ( 'while' )
            {
            // InternalMyDsl.g:1337:1: ( 'while' )
            // InternalMyDsl.g:1338:2: 'while'
            {
             before(grammarAccess.getWhileStatementAccess().getWhileKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getWhileStatementAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__0__Impl"


    // $ANTLR start "rule__WhileStatement__Group__1"
    // InternalMyDsl.g:1347:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalMyDsl.g:1352:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__1"


    // $ANTLR start "rule__WhileStatement__Group__1__Impl"
    // InternalMyDsl.g:1359:1: rule__WhileStatement__Group__1__Impl : ( ( rule__WhileStatement__WhileExpressionAssignment_1 ) ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( ( rule__WhileStatement__WhileExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:1364:1: ( ( rule__WhileStatement__WhileExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:1364:1: ( ( rule__WhileStatement__WhileExpressionAssignment_1 ) )
            // InternalMyDsl.g:1365:2: ( rule__WhileStatement__WhileExpressionAssignment_1 )
            {
             before(grammarAccess.getWhileStatementAccess().getWhileExpressionAssignment_1()); 
            // InternalMyDsl.g:1366:2: ( rule__WhileStatement__WhileExpressionAssignment_1 )
            // InternalMyDsl.g:1366:3: rule__WhileStatement__WhileExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__WhileExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getWhileExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__2"
    // InternalMyDsl.g:1374:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalMyDsl.g:1379:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__2"


    // $ANTLR start "rule__WhileStatement__Group__2__Impl"
    // InternalMyDsl.g:1386:1: rule__WhileStatement__Group__2__Impl : ( 'do' ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( 'do' ) )
            // InternalMyDsl.g:1391:1: ( 'do' )
            {
            // InternalMyDsl.g:1391:1: ( 'do' )
            // InternalMyDsl.g:1392:2: 'do'
            {
             before(grammarAccess.getWhileStatementAccess().getDoKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getWhileStatementAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__3"
    // InternalMyDsl.g:1401:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalMyDsl.g:1406:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__3"


    // $ANTLR start "rule__WhileStatement__Group__3__Impl"
    // InternalMyDsl.g:1413:1: rule__WhileStatement__Group__3__Impl : ( ( rule__WhileStatement__StatementsAssignment_3 )* ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( ( ( rule__WhileStatement__StatementsAssignment_3 )* ) )
            // InternalMyDsl.g:1418:1: ( ( rule__WhileStatement__StatementsAssignment_3 )* )
            {
            // InternalMyDsl.g:1418:1: ( ( rule__WhileStatement__StatementsAssignment_3 )* )
            // InternalMyDsl.g:1419:2: ( rule__WhileStatement__StatementsAssignment_3 )*
            {
             before(grammarAccess.getWhileStatementAccess().getStatementsAssignment_3()); 
            // InternalMyDsl.g:1420:2: ( rule__WhileStatement__StatementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=22 && LA12_0<=29)||LA12_0==34||(LA12_0>=37 && LA12_0<=38)||(LA12_0>=40 && LA12_0<=41)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1420:3: rule__WhileStatement__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhileStatement__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getWhileStatementAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__3__Impl"


    // $ANTLR start "rule__WhileStatement__Group__4"
    // InternalMyDsl.g:1428:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( rule__WhileStatement__Group__4__Impl )
            // InternalMyDsl.g:1433:2: rule__WhileStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__4"


    // $ANTLR start "rule__WhileStatement__Group__4__Impl"
    // InternalMyDsl.g:1439:1: rule__WhileStatement__Group__4__Impl : ( 'end' ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( ( 'end' ) )
            // InternalMyDsl.g:1444:1: ( 'end' )
            {
            // InternalMyDsl.g:1444:1: ( 'end' )
            // InternalMyDsl.g:1445:2: 'end'
            {
             before(grammarAccess.getWhileStatementAccess().getEndKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getWhileStatementAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__Group__4__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__0"
    // InternalMyDsl.g:1455:1: rule__RepeatStatement__Group__0 : rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 ;
    public final void rule__RepeatStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 )
            // InternalMyDsl.g:1460:2: rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RepeatStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__0"


    // $ANTLR start "rule__RepeatStatement__Group__0__Impl"
    // InternalMyDsl.g:1467:1: rule__RepeatStatement__Group__0__Impl : ( 'repeat' ) ;
    public final void rule__RepeatStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( 'repeat' ) )
            // InternalMyDsl.g:1472:1: ( 'repeat' )
            {
            // InternalMyDsl.g:1472:1: ( 'repeat' )
            // InternalMyDsl.g:1473:2: 'repeat'
            {
             before(grammarAccess.getRepeatStatementAccess().getRepeatKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRepeatStatementAccess().getRepeatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__0__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__1"
    // InternalMyDsl.g:1482:1: rule__RepeatStatement__Group__1 : rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 ;
    public final void rule__RepeatStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 )
            // InternalMyDsl.g:1487:2: rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RepeatStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__1"


    // $ANTLR start "rule__RepeatStatement__Group__1__Impl"
    // InternalMyDsl.g:1494:1: rule__RepeatStatement__Group__1__Impl : ( ( rule__RepeatStatement__IntegerAssignment_1 ) ) ;
    public final void rule__RepeatStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( ( ( rule__RepeatStatement__IntegerAssignment_1 ) ) )
            // InternalMyDsl.g:1499:1: ( ( rule__RepeatStatement__IntegerAssignment_1 ) )
            {
            // InternalMyDsl.g:1499:1: ( ( rule__RepeatStatement__IntegerAssignment_1 ) )
            // InternalMyDsl.g:1500:2: ( rule__RepeatStatement__IntegerAssignment_1 )
            {
             before(grammarAccess.getRepeatStatementAccess().getIntegerAssignment_1()); 
            // InternalMyDsl.g:1501:2: ( rule__RepeatStatement__IntegerAssignment_1 )
            // InternalMyDsl.g:1501:3: rule__RepeatStatement__IntegerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__IntegerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepeatStatementAccess().getIntegerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__1__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__2"
    // InternalMyDsl.g:1509:1: rule__RepeatStatement__Group__2 : rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 ;
    public final void rule__RepeatStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 )
            // InternalMyDsl.g:1514:2: rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RepeatStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__2"


    // $ANTLR start "rule__RepeatStatement__Group__2__Impl"
    // InternalMyDsl.g:1521:1: rule__RepeatStatement__Group__2__Impl : ( 'times' ) ;
    public final void rule__RepeatStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( 'times' ) )
            // InternalMyDsl.g:1526:1: ( 'times' )
            {
            // InternalMyDsl.g:1526:1: ( 'times' )
            // InternalMyDsl.g:1527:2: 'times'
            {
             before(grammarAccess.getRepeatStatementAccess().getTimesKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRepeatStatementAccess().getTimesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__2__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__3"
    // InternalMyDsl.g:1536:1: rule__RepeatStatement__Group__3 : rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 ;
    public final void rule__RepeatStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 )
            // InternalMyDsl.g:1541:2: rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RepeatStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__3"


    // $ANTLR start "rule__RepeatStatement__Group__3__Impl"
    // InternalMyDsl.g:1548:1: rule__RepeatStatement__Group__3__Impl : ( ( rule__RepeatStatement__StatementsAssignment_3 )* ) ;
    public final void rule__RepeatStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( ( ( rule__RepeatStatement__StatementsAssignment_3 )* ) )
            // InternalMyDsl.g:1553:1: ( ( rule__RepeatStatement__StatementsAssignment_3 )* )
            {
            // InternalMyDsl.g:1553:1: ( ( rule__RepeatStatement__StatementsAssignment_3 )* )
            // InternalMyDsl.g:1554:2: ( rule__RepeatStatement__StatementsAssignment_3 )*
            {
             before(grammarAccess.getRepeatStatementAccess().getStatementsAssignment_3()); 
            // InternalMyDsl.g:1555:2: ( rule__RepeatStatement__StatementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=22 && LA13_0<=29)||LA13_0==34||(LA13_0>=37 && LA13_0<=38)||(LA13_0>=40 && LA13_0<=41)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1555:3: rule__RepeatStatement__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RepeatStatement__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRepeatStatementAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__3__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__4"
    // InternalMyDsl.g:1563:1: rule__RepeatStatement__Group__4 : rule__RepeatStatement__Group__4__Impl ;
    public final void rule__RepeatStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( rule__RepeatStatement__Group__4__Impl )
            // InternalMyDsl.g:1568:2: rule__RepeatStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__4"


    // $ANTLR start "rule__RepeatStatement__Group__4__Impl"
    // InternalMyDsl.g:1574:1: rule__RepeatStatement__Group__4__Impl : ( 'end' ) ;
    public final void rule__RepeatStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1578:1: ( ( 'end' ) )
            // InternalMyDsl.g:1579:1: ( 'end' )
            {
            // InternalMyDsl.g:1579:1: ( 'end' )
            // InternalMyDsl.g:1580:2: 'end'
            {
             before(grammarAccess.getRepeatStatementAccess().getEndKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRepeatStatementAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__Group__4__Impl"


    // $ANTLR start "rule__Comment__Group__0"
    // InternalMyDsl.g:1590:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalMyDsl.g:1595:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Comment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0"


    // $ANTLR start "rule__Comment__Group__0__Impl"
    // InternalMyDsl.g:1602:1: rule__Comment__Group__0__Impl : ( () ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( ( () ) )
            // InternalMyDsl.g:1607:1: ( () )
            {
            // InternalMyDsl.g:1607:1: ( () )
            // InternalMyDsl.g:1608:2: ()
            {
             before(grammarAccess.getCommentAccess().getCommentAction_0()); 
            // InternalMyDsl.g:1609:2: ()
            // InternalMyDsl.g:1609:3: 
            {
            }

             after(grammarAccess.getCommentAccess().getCommentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__1"
    // InternalMyDsl.g:1617:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( rule__Comment__Group__1__Impl )
            // InternalMyDsl.g:1622:2: rule__Comment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1"


    // $ANTLR start "rule__Comment__Group__1__Impl"
    // InternalMyDsl.g:1628:1: rule__Comment__Group__1__Impl : ( 'Comment' ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1632:1: ( ( 'Comment' ) )
            // InternalMyDsl.g:1633:1: ( 'Comment' )
            {
            // InternalMyDsl.g:1633:1: ( 'Comment' )
            // InternalMyDsl.g:1634:2: 'Comment'
            {
             before(grammarAccess.getCommentAccess().getCommentKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getCommentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1__Impl"


    // $ANTLR start "rule__TraceCommand__Group__0"
    // InternalMyDsl.g:1644:1: rule__TraceCommand__Group__0 : rule__TraceCommand__Group__0__Impl rule__TraceCommand__Group__1 ;
    public final void rule__TraceCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( rule__TraceCommand__Group__0__Impl rule__TraceCommand__Group__1 )
            // InternalMyDsl.g:1649:2: rule__TraceCommand__Group__0__Impl rule__TraceCommand__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TraceCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceCommand__Group__0"


    // $ANTLR start "rule__TraceCommand__Group__0__Impl"
    // InternalMyDsl.g:1656:1: rule__TraceCommand__Group__0__Impl : ( 'trace' ) ;
    public final void rule__TraceCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( ( 'trace' ) )
            // InternalMyDsl.g:1661:1: ( 'trace' )
            {
            // InternalMyDsl.g:1661:1: ( 'trace' )
            // InternalMyDsl.g:1662:2: 'trace'
            {
             before(grammarAccess.getTraceCommandAccess().getTraceKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTraceCommandAccess().getTraceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceCommand__Group__0__Impl"


    // $ANTLR start "rule__TraceCommand__Group__1"
    // InternalMyDsl.g:1671:1: rule__TraceCommand__Group__1 : rule__TraceCommand__Group__1__Impl ;
    public final void rule__TraceCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( rule__TraceCommand__Group__1__Impl )
            // InternalMyDsl.g:1676:2: rule__TraceCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraceCommand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceCommand__Group__1"


    // $ANTLR start "rule__TraceCommand__Group__1__Impl"
    // InternalMyDsl.g:1682:1: rule__TraceCommand__Group__1__Impl : ( ( rule__TraceCommand__StringAssignment_1 ) ) ;
    public final void rule__TraceCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1686:1: ( ( ( rule__TraceCommand__StringAssignment_1 ) ) )
            // InternalMyDsl.g:1687:1: ( ( rule__TraceCommand__StringAssignment_1 ) )
            {
            // InternalMyDsl.g:1687:1: ( ( rule__TraceCommand__StringAssignment_1 ) )
            // InternalMyDsl.g:1688:2: ( rule__TraceCommand__StringAssignment_1 )
            {
             before(grammarAccess.getTraceCommandAccess().getStringAssignment_1()); 
            // InternalMyDsl.g:1689:2: ( rule__TraceCommand__StringAssignment_1 )
            // InternalMyDsl.g:1689:3: rule__TraceCommand__StringAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TraceCommand__StringAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceCommandAccess().getStringAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceCommand__Group__1__Impl"


    // $ANTLR start "rule__ConstructionStatement__Group__0"
    // InternalMyDsl.g:1698:1: rule__ConstructionStatement__Group__0 : rule__ConstructionStatement__Group__0__Impl rule__ConstructionStatement__Group__1 ;
    public final void rule__ConstructionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( rule__ConstructionStatement__Group__0__Impl rule__ConstructionStatement__Group__1 )
            // InternalMyDsl.g:1703:2: rule__ConstructionStatement__Group__0__Impl rule__ConstructionStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ConstructionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__0"


    // $ANTLR start "rule__ConstructionStatement__Group__0__Impl"
    // InternalMyDsl.g:1710:1: rule__ConstructionStatement__Group__0__Impl : ( ( rule__ConstructionStatement__CommandAssignment_0 ) ) ;
    public final void rule__ConstructionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( ( ( rule__ConstructionStatement__CommandAssignment_0 ) ) )
            // InternalMyDsl.g:1715:1: ( ( rule__ConstructionStatement__CommandAssignment_0 ) )
            {
            // InternalMyDsl.g:1715:1: ( ( rule__ConstructionStatement__CommandAssignment_0 ) )
            // InternalMyDsl.g:1716:2: ( rule__ConstructionStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getConstructionStatementAccess().getCommandAssignment_0()); 
            // InternalMyDsl.g:1717:2: ( rule__ConstructionStatement__CommandAssignment_0 )
            // InternalMyDsl.g:1717:3: rule__ConstructionStatement__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__CommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructionStatementAccess().getCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__0__Impl"


    // $ANTLR start "rule__ConstructionStatement__Group__1"
    // InternalMyDsl.g:1725:1: rule__ConstructionStatement__Group__1 : rule__ConstructionStatement__Group__1__Impl rule__ConstructionStatement__Group__2 ;
    public final void rule__ConstructionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( rule__ConstructionStatement__Group__1__Impl rule__ConstructionStatement__Group__2 )
            // InternalMyDsl.g:1730:2: rule__ConstructionStatement__Group__1__Impl rule__ConstructionStatement__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ConstructionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__1"


    // $ANTLR start "rule__ConstructionStatement__Group__1__Impl"
    // InternalMyDsl.g:1737:1: rule__ConstructionStatement__Group__1__Impl : ( 'at' ) ;
    public final void rule__ConstructionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( ( 'at' ) )
            // InternalMyDsl.g:1742:1: ( 'at' )
            {
            // InternalMyDsl.g:1742:1: ( 'at' )
            // InternalMyDsl.g:1743:2: 'at'
            {
             before(grammarAccess.getConstructionStatementAccess().getAtKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConstructionStatementAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__1__Impl"


    // $ANTLR start "rule__ConstructionStatement__Group__2"
    // InternalMyDsl.g:1752:1: rule__ConstructionStatement__Group__2 : rule__ConstructionStatement__Group__2__Impl rule__ConstructionStatement__Group__3 ;
    public final void rule__ConstructionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( rule__ConstructionStatement__Group__2__Impl rule__ConstructionStatement__Group__3 )
            // InternalMyDsl.g:1757:2: rule__ConstructionStatement__Group__2__Impl rule__ConstructionStatement__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ConstructionStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__2"


    // $ANTLR start "rule__ConstructionStatement__Group__2__Impl"
    // InternalMyDsl.g:1764:1: rule__ConstructionStatement__Group__2__Impl : ( 'row:' ) ;
    public final void rule__ConstructionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( ( 'row:' ) )
            // InternalMyDsl.g:1769:1: ( 'row:' )
            {
            // InternalMyDsl.g:1769:1: ( 'row:' )
            // InternalMyDsl.g:1770:2: 'row:'
            {
             before(grammarAccess.getConstructionStatementAccess().getRowKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getConstructionStatementAccess().getRowKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__2__Impl"


    // $ANTLR start "rule__ConstructionStatement__Group__3"
    // InternalMyDsl.g:1779:1: rule__ConstructionStatement__Group__3 : rule__ConstructionStatement__Group__3__Impl rule__ConstructionStatement__Group__4 ;
    public final void rule__ConstructionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( rule__ConstructionStatement__Group__3__Impl rule__ConstructionStatement__Group__4 )
            // InternalMyDsl.g:1784:2: rule__ConstructionStatement__Group__3__Impl rule__ConstructionStatement__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ConstructionStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__3"


    // $ANTLR start "rule__ConstructionStatement__Group__3__Impl"
    // InternalMyDsl.g:1791:1: rule__ConstructionStatement__Group__3__Impl : ( ( rule__ConstructionStatement__IntegersAssignment_3 ) ) ;
    public final void rule__ConstructionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( ( ( rule__ConstructionStatement__IntegersAssignment_3 ) ) )
            // InternalMyDsl.g:1796:1: ( ( rule__ConstructionStatement__IntegersAssignment_3 ) )
            {
            // InternalMyDsl.g:1796:1: ( ( rule__ConstructionStatement__IntegersAssignment_3 ) )
            // InternalMyDsl.g:1797:2: ( rule__ConstructionStatement__IntegersAssignment_3 )
            {
             before(grammarAccess.getConstructionStatementAccess().getIntegersAssignment_3()); 
            // InternalMyDsl.g:1798:2: ( rule__ConstructionStatement__IntegersAssignment_3 )
            // InternalMyDsl.g:1798:3: rule__ConstructionStatement__IntegersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__IntegersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstructionStatementAccess().getIntegersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__3__Impl"


    // $ANTLR start "rule__ConstructionStatement__Group__4"
    // InternalMyDsl.g:1806:1: rule__ConstructionStatement__Group__4 : rule__ConstructionStatement__Group__4__Impl rule__ConstructionStatement__Group__5 ;
    public final void rule__ConstructionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( rule__ConstructionStatement__Group__4__Impl rule__ConstructionStatement__Group__5 )
            // InternalMyDsl.g:1811:2: rule__ConstructionStatement__Group__4__Impl rule__ConstructionStatement__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ConstructionStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__4"


    // $ANTLR start "rule__ConstructionStatement__Group__4__Impl"
    // InternalMyDsl.g:1818:1: rule__ConstructionStatement__Group__4__Impl : ( ',' ) ;
    public final void rule__ConstructionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( ( ',' ) )
            // InternalMyDsl.g:1823:1: ( ',' )
            {
            // InternalMyDsl.g:1823:1: ( ',' )
            // InternalMyDsl.g:1824:2: ','
            {
             before(grammarAccess.getConstructionStatementAccess().getCommaKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getConstructionStatementAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__4__Impl"


    // $ANTLR start "rule__ConstructionStatement__Group__5"
    // InternalMyDsl.g:1833:1: rule__ConstructionStatement__Group__5 : rule__ConstructionStatement__Group__5__Impl rule__ConstructionStatement__Group__6 ;
    public final void rule__ConstructionStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( rule__ConstructionStatement__Group__5__Impl rule__ConstructionStatement__Group__6 )
            // InternalMyDsl.g:1838:2: rule__ConstructionStatement__Group__5__Impl rule__ConstructionStatement__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ConstructionStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__5"


    // $ANTLR start "rule__ConstructionStatement__Group__5__Impl"
    // InternalMyDsl.g:1845:1: rule__ConstructionStatement__Group__5__Impl : ( 'col:' ) ;
    public final void rule__ConstructionStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( 'col:' ) )
            // InternalMyDsl.g:1850:1: ( 'col:' )
            {
            // InternalMyDsl.g:1850:1: ( 'col:' )
            // InternalMyDsl.g:1851:2: 'col:'
            {
             before(grammarAccess.getConstructionStatementAccess().getColKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConstructionStatementAccess().getColKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__5__Impl"


    // $ANTLR start "rule__ConstructionStatement__Group__6"
    // InternalMyDsl.g:1860:1: rule__ConstructionStatement__Group__6 : rule__ConstructionStatement__Group__6__Impl ;
    public final void rule__ConstructionStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( rule__ConstructionStatement__Group__6__Impl )
            // InternalMyDsl.g:1865:2: rule__ConstructionStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__6"


    // $ANTLR start "rule__ConstructionStatement__Group__6__Impl"
    // InternalMyDsl.g:1871:1: rule__ConstructionStatement__Group__6__Impl : ( ( rule__ConstructionStatement__IntegersAssignment_6 ) ) ;
    public final void rule__ConstructionStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1875:1: ( ( ( rule__ConstructionStatement__IntegersAssignment_6 ) ) )
            // InternalMyDsl.g:1876:1: ( ( rule__ConstructionStatement__IntegersAssignment_6 ) )
            {
            // InternalMyDsl.g:1876:1: ( ( rule__ConstructionStatement__IntegersAssignment_6 ) )
            // InternalMyDsl.g:1877:2: ( rule__ConstructionStatement__IntegersAssignment_6 )
            {
             before(grammarAccess.getConstructionStatementAccess().getIntegersAssignment_6()); 
            // InternalMyDsl.g:1878:2: ( rule__ConstructionStatement__IntegersAssignment_6 )
            // InternalMyDsl.g:1878:3: rule__ConstructionStatement__IntegersAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConstructionStatement__IntegersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConstructionStatementAccess().getIntegersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__Group__6__Impl"


    // $ANTLR start "rule__NegatedExpression__Group__0"
    // InternalMyDsl.g:1887:1: rule__NegatedExpression__Group__0 : rule__NegatedExpression__Group__0__Impl rule__NegatedExpression__Group__1 ;
    public final void rule__NegatedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( rule__NegatedExpression__Group__0__Impl rule__NegatedExpression__Group__1 )
            // InternalMyDsl.g:1892:2: rule__NegatedExpression__Group__0__Impl rule__NegatedExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__NegatedExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NegatedExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedExpression__Group__0"


    // $ANTLR start "rule__NegatedExpression__Group__0__Impl"
    // InternalMyDsl.g:1899:1: rule__NegatedExpression__Group__0__Impl : ( 'not' ) ;
    public final void rule__NegatedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( ( 'not' ) )
            // InternalMyDsl.g:1904:1: ( 'not' )
            {
            // InternalMyDsl.g:1904:1: ( 'not' )
            // InternalMyDsl.g:1905:2: 'not'
            {
             before(grammarAccess.getNegatedExpressionAccess().getNotKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNegatedExpressionAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedExpression__Group__0__Impl"


    // $ANTLR start "rule__NegatedExpression__Group__1"
    // InternalMyDsl.g:1914:1: rule__NegatedExpression__Group__1 : rule__NegatedExpression__Group__1__Impl ;
    public final void rule__NegatedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( rule__NegatedExpression__Group__1__Impl )
            // InternalMyDsl.g:1919:2: rule__NegatedExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NegatedExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedExpression__Group__1"


    // $ANTLR start "rule__NegatedExpression__Group__1__Impl"
    // InternalMyDsl.g:1925:1: rule__NegatedExpression__Group__1__Impl : ( ( rule__NegatedExpression__NegatedExpressionAssignment_1 ) ) ;
    public final void rule__NegatedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1929:1: ( ( ( rule__NegatedExpression__NegatedExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:1930:1: ( ( rule__NegatedExpression__NegatedExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:1930:1: ( ( rule__NegatedExpression__NegatedExpressionAssignment_1 ) )
            // InternalMyDsl.g:1931:2: ( rule__NegatedExpression__NegatedExpressionAssignment_1 )
            {
             before(grammarAccess.getNegatedExpressionAccess().getNegatedExpressionAssignment_1()); 
            // InternalMyDsl.g:1932:2: ( rule__NegatedExpression__NegatedExpressionAssignment_1 )
            // InternalMyDsl.g:1932:3: rule__NegatedExpression__NegatedExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NegatedExpression__NegatedExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegatedExpressionAccess().getNegatedExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalMyDsl.g:1941:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1945:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalMyDsl.g:1946:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // InternalMyDsl.g:1953:1: rule__BinaryExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( ( '(' ) )
            // InternalMyDsl.g:1958:1: ( '(' )
            {
            // InternalMyDsl.g:1958:1: ( '(' )
            // InternalMyDsl.g:1959:2: '('
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // InternalMyDsl.g:1968:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalMyDsl.g:1973:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // InternalMyDsl.g:1980:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__LeftExpressionAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( ( ( rule__BinaryExpression__LeftExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:1985:1: ( ( rule__BinaryExpression__LeftExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:1985:1: ( ( rule__BinaryExpression__LeftExpressionAssignment_1 ) )
            // InternalMyDsl.g:1986:2: ( rule__BinaryExpression__LeftExpressionAssignment_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftExpressionAssignment_1()); 
            // InternalMyDsl.g:1987:2: ( rule__BinaryExpression__LeftExpressionAssignment_1 )
            // InternalMyDsl.g:1987:3: rule__BinaryExpression__LeftExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__LeftExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLeftExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__2"
    // InternalMyDsl.g:1995:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3 ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3 )
            // InternalMyDsl.g:2000:2: rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__BinaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2"


    // $ANTLR start "rule__BinaryExpression__Group__2__Impl"
    // InternalMyDsl.g:2007:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__OperatorAssignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( ( ( rule__BinaryExpression__OperatorAssignment_2 ) ) )
            // InternalMyDsl.g:2012:1: ( ( rule__BinaryExpression__OperatorAssignment_2 ) )
            {
            // InternalMyDsl.g:2012:1: ( ( rule__BinaryExpression__OperatorAssignment_2 ) )
            // InternalMyDsl.g:2013:2: ( rule__BinaryExpression__OperatorAssignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_2()); 
            // InternalMyDsl.g:2014:2: ( rule__BinaryExpression__OperatorAssignment_2 )
            // InternalMyDsl.g:2014:3: rule__BinaryExpression__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__3"
    // InternalMyDsl.g:2022:1: rule__BinaryExpression__Group__3 : rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4 ;
    public final void rule__BinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4 )
            // InternalMyDsl.g:2027:2: rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__BinaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__3"


    // $ANTLR start "rule__BinaryExpression__Group__3__Impl"
    // InternalMyDsl.g:2034:1: rule__BinaryExpression__Group__3__Impl : ( ( rule__BinaryExpression__RightExpressionAssignment_3 ) ) ;
    public final void rule__BinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( ( ( rule__BinaryExpression__RightExpressionAssignment_3 ) ) )
            // InternalMyDsl.g:2039:1: ( ( rule__BinaryExpression__RightExpressionAssignment_3 ) )
            {
            // InternalMyDsl.g:2039:1: ( ( rule__BinaryExpression__RightExpressionAssignment_3 ) )
            // InternalMyDsl.g:2040:2: ( rule__BinaryExpression__RightExpressionAssignment_3 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightExpressionAssignment_3()); 
            // InternalMyDsl.g:2041:2: ( rule__BinaryExpression__RightExpressionAssignment_3 )
            // InternalMyDsl.g:2041:3: rule__BinaryExpression__RightExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__RightExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getRightExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__3__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__4"
    // InternalMyDsl.g:2049:1: rule__BinaryExpression__Group__4 : rule__BinaryExpression__Group__4__Impl ;
    public final void rule__BinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( rule__BinaryExpression__Group__4__Impl )
            // InternalMyDsl.g:2054:2: rule__BinaryExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__4"


    // $ANTLR start "rule__BinaryExpression__Group__4__Impl"
    // InternalMyDsl.g:2060:1: rule__BinaryExpression__Group__4__Impl : ( ')' ) ;
    public final void rule__BinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2064:1: ( ( ')' ) )
            // InternalMyDsl.g:2065:1: ( ')' )
            {
            // InternalMyDsl.g:2065:1: ( ')' )
            // InternalMyDsl.g:2066:2: ')'
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__4__Impl"


    // $ANTLR start "rule__HeadingExpression__Group__0"
    // InternalMyDsl.g:2076:1: rule__HeadingExpression__Group__0 : rule__HeadingExpression__Group__0__Impl rule__HeadingExpression__Group__1 ;
    public final void rule__HeadingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( rule__HeadingExpression__Group__0__Impl rule__HeadingExpression__Group__1 )
            // InternalMyDsl.g:2081:2: rule__HeadingExpression__Group__0__Impl rule__HeadingExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__HeadingExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeadingExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadingExpression__Group__0"


    // $ANTLR start "rule__HeadingExpression__Group__0__Impl"
    // InternalMyDsl.g:2088:1: rule__HeadingExpression__Group__0__Impl : ( ( rule__HeadingExpression__HeadingLiteralAssignment_0 ) ) ;
    public final void rule__HeadingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( ( ( rule__HeadingExpression__HeadingLiteralAssignment_0 ) ) )
            // InternalMyDsl.g:2093:1: ( ( rule__HeadingExpression__HeadingLiteralAssignment_0 ) )
            {
            // InternalMyDsl.g:2093:1: ( ( rule__HeadingExpression__HeadingLiteralAssignment_0 ) )
            // InternalMyDsl.g:2094:2: ( rule__HeadingExpression__HeadingLiteralAssignment_0 )
            {
             before(grammarAccess.getHeadingExpressionAccess().getHeadingLiteralAssignment_0()); 
            // InternalMyDsl.g:2095:2: ( rule__HeadingExpression__HeadingLiteralAssignment_0 )
            // InternalMyDsl.g:2095:3: rule__HeadingExpression__HeadingLiteralAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HeadingExpression__HeadingLiteralAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeadingExpressionAccess().getHeadingLiteralAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadingExpression__Group__0__Impl"


    // $ANTLR start "rule__HeadingExpression__Group__1"
    // InternalMyDsl.g:2103:1: rule__HeadingExpression__Group__1 : rule__HeadingExpression__Group__1__Impl ;
    public final void rule__HeadingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2107:1: ( rule__HeadingExpression__Group__1__Impl )
            // InternalMyDsl.g:2108:2: rule__HeadingExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeadingExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadingExpression__Group__1"


    // $ANTLR start "rule__HeadingExpression__Group__1__Impl"
    // InternalMyDsl.g:2114:1: rule__HeadingExpression__Group__1__Impl : ( ( rule__HeadingExpression__DirectionLiteralAssignment_1 ) ) ;
    public final void rule__HeadingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2118:1: ( ( ( rule__HeadingExpression__DirectionLiteralAssignment_1 ) ) )
            // InternalMyDsl.g:2119:1: ( ( rule__HeadingExpression__DirectionLiteralAssignment_1 ) )
            {
            // InternalMyDsl.g:2119:1: ( ( rule__HeadingExpression__DirectionLiteralAssignment_1 ) )
            // InternalMyDsl.g:2120:2: ( rule__HeadingExpression__DirectionLiteralAssignment_1 )
            {
             before(grammarAccess.getHeadingExpressionAccess().getDirectionLiteralAssignment_1()); 
            // InternalMyDsl.g:2121:2: ( rule__HeadingExpression__DirectionLiteralAssignment_1 )
            // InternalMyDsl.g:2121:3: rule__HeadingExpression__DirectionLiteralAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeadingExpression__DirectionLiteralAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadingExpressionAccess().getDirectionLiteralAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadingExpression__Group__1__Impl"


    // $ANTLR start "rule__WallAheadExpression__Group__0"
    // InternalMyDsl.g:2130:1: rule__WallAheadExpression__Group__0 : rule__WallAheadExpression__Group__0__Impl rule__WallAheadExpression__Group__1 ;
    public final void rule__WallAheadExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( rule__WallAheadExpression__Group__0__Impl rule__WallAheadExpression__Group__1 )
            // InternalMyDsl.g:2135:2: rule__WallAheadExpression__Group__0__Impl rule__WallAheadExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__WallAheadExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WallAheadExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallAheadExpression__Group__0"


    // $ANTLR start "rule__WallAheadExpression__Group__0__Impl"
    // InternalMyDsl.g:2142:1: rule__WallAheadExpression__Group__0__Impl : ( ( rule__WallAheadExpression__WallAssignment_0 ) ) ;
    public final void rule__WallAheadExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( ( ( rule__WallAheadExpression__WallAssignment_0 ) ) )
            // InternalMyDsl.g:2147:1: ( ( rule__WallAheadExpression__WallAssignment_0 ) )
            {
            // InternalMyDsl.g:2147:1: ( ( rule__WallAheadExpression__WallAssignment_0 ) )
            // InternalMyDsl.g:2148:2: ( rule__WallAheadExpression__WallAssignment_0 )
            {
             before(grammarAccess.getWallAheadExpressionAccess().getWallAssignment_0()); 
            // InternalMyDsl.g:2149:2: ( rule__WallAheadExpression__WallAssignment_0 )
            // InternalMyDsl.g:2149:3: rule__WallAheadExpression__WallAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WallAheadExpression__WallAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWallAheadExpressionAccess().getWallAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallAheadExpression__Group__0__Impl"


    // $ANTLR start "rule__WallAheadExpression__Group__1"
    // InternalMyDsl.g:2157:1: rule__WallAheadExpression__Group__1 : rule__WallAheadExpression__Group__1__Impl ;
    public final void rule__WallAheadExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2161:1: ( rule__WallAheadExpression__Group__1__Impl )
            // InternalMyDsl.g:2162:2: rule__WallAheadExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WallAheadExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallAheadExpression__Group__1"


    // $ANTLR start "rule__WallAheadExpression__Group__1__Impl"
    // InternalMyDsl.g:2168:1: rule__WallAheadExpression__Group__1__Impl : ( ( rule__WallAheadExpression__AheadAssignment_1 ) ) ;
    public final void rule__WallAheadExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2172:1: ( ( ( rule__WallAheadExpression__AheadAssignment_1 ) ) )
            // InternalMyDsl.g:2173:1: ( ( rule__WallAheadExpression__AheadAssignment_1 ) )
            {
            // InternalMyDsl.g:2173:1: ( ( rule__WallAheadExpression__AheadAssignment_1 ) )
            // InternalMyDsl.g:2174:2: ( rule__WallAheadExpression__AheadAssignment_1 )
            {
             before(grammarAccess.getWallAheadExpressionAccess().getAheadAssignment_1()); 
            // InternalMyDsl.g:2175:2: ( rule__WallAheadExpression__AheadAssignment_1 )
            // InternalMyDsl.g:2175:3: rule__WallAheadExpression__AheadAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WallAheadExpression__AheadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWallAheadExpressionAccess().getAheadAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallAheadExpression__Group__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalMyDsl.g:2184:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalMyDsl.g:2189:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalMyDsl.g:2196:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( ( () ) )
            // InternalMyDsl.g:2201:1: ( () )
            {
            // InternalMyDsl.g:2201:1: ( () )
            // InternalMyDsl.g:2202:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalMyDsl.g:2203:2: ()
            // InternalMyDsl.g:2203:3: 
            {
            }

             after(grammarAccess.getIntegerAccess().getIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalMyDsl.g:2211:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( rule__Integer__Group__1__Impl )
            // InternalMyDsl.g:2216:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalMyDsl.g:2222:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2226:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2227:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2227:1: ( RULE_INT )
            // InternalMyDsl.g:2228:2: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__StringExpression__Group__0"
    // InternalMyDsl.g:2238:1: rule__StringExpression__Group__0 : rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1 ;
    public final void rule__StringExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1 )
            // InternalMyDsl.g:2243:2: rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__StringExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__0"


    // $ANTLR start "rule__StringExpression__Group__0__Impl"
    // InternalMyDsl.g:2250:1: rule__StringExpression__Group__0__Impl : ( () ) ;
    public final void rule__StringExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( ( () ) )
            // InternalMyDsl.g:2255:1: ( () )
            {
            // InternalMyDsl.g:2255:1: ( () )
            // InternalMyDsl.g:2256:2: ()
            {
             before(grammarAccess.getStringExpressionAccess().getStringExpressionAction_0()); 
            // InternalMyDsl.g:2257:2: ()
            // InternalMyDsl.g:2257:3: 
            {
            }

             after(grammarAccess.getStringExpressionAccess().getStringExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__0__Impl"


    // $ANTLR start "rule__StringExpression__Group__1"
    // InternalMyDsl.g:2265:1: rule__StringExpression__Group__1 : rule__StringExpression__Group__1__Impl ;
    public final void rule__StringExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( rule__StringExpression__Group__1__Impl )
            // InternalMyDsl.g:2270:2: rule__StringExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__1"


    // $ANTLR start "rule__StringExpression__Group__1__Impl"
    // InternalMyDsl.g:2276:1: rule__StringExpression__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__StringExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2281:1: ( RULE_STRING )
            {
            // InternalMyDsl.g:2281:1: ( RULE_STRING )
            // InternalMyDsl.g:2282:2: RULE_STRING
            {
             before(grammarAccess.getStringExpressionAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringExpressionAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__1__Impl"


    // $ANTLR start "rule__Script__NameAssignment_1"
    // InternalMyDsl.g:2292:1: rule__Script__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Script__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( ( ruleName ) )
            // InternalMyDsl.g:2297:2: ( ruleName )
            {
            // InternalMyDsl.g:2297:2: ( ruleName )
            // InternalMyDsl.g:2298:3: ruleName
            {
             before(grammarAccess.getScriptAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__NameAssignment_1"


    // $ANTLR start "rule__Script__StatementsAssignment_4"
    // InternalMyDsl.g:2307:1: rule__Script__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Script__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2312:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2312:2: ( ruleStatement )
            // InternalMyDsl.g:2313:3: ruleStatement
            {
             before(grammarAccess.getScriptAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__StatementsAssignment_4"


    // $ANTLR start "rule__IfStatement__IfExpressionAssignment_1"
    // InternalMyDsl.g:2322:1: rule__IfStatement__IfExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfStatement__IfExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2327:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2327:2: ( ruleExpression )
            // InternalMyDsl.g:2328:3: ruleExpression
            {
             before(grammarAccess.getIfStatementAccess().getIfExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getIfExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__IfExpressionAssignment_1"


    // $ANTLR start "rule__IfStatement__StatementsAssignment_3"
    // InternalMyDsl.g:2337:1: rule__IfStatement__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__IfStatement__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2341:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2342:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2342:2: ( ruleStatement )
            // InternalMyDsl.g:2343:3: ruleStatement
            {
             before(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__StatementsAssignment_3"


    // $ANTLR start "rule__IfStatement__Statements2Assignment_4_2"
    // InternalMyDsl.g:2352:1: rule__IfStatement__Statements2Assignment_4_2 : ( ruleStatement ) ;
    public final void rule__IfStatement__Statements2Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2356:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2357:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2357:2: ( ruleStatement )
            // InternalMyDsl.g:2358:3: ruleStatement
            {
             before(grammarAccess.getIfStatementAccess().getStatements2StatementParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getStatements2StatementParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Statements2Assignment_4_2"


    // $ANTLR start "rule__WhileStatement__WhileExpressionAssignment_1"
    // InternalMyDsl.g:2367:1: rule__WhileStatement__WhileExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhileStatement__WhileExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2371:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2372:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2372:2: ( ruleExpression )
            // InternalMyDsl.g:2373:3: ruleExpression
            {
             before(grammarAccess.getWhileStatementAccess().getWhileExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileStatementAccess().getWhileExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__WhileExpressionAssignment_1"


    // $ANTLR start "rule__WhileStatement__StatementsAssignment_3"
    // InternalMyDsl.g:2382:1: rule__WhileStatement__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__WhileStatement__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2387:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2387:2: ( ruleStatement )
            // InternalMyDsl.g:2388:3: ruleStatement
            {
             before(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatement__StatementsAssignment_3"


    // $ANTLR start "rule__RepeatStatement__IntegerAssignment_1"
    // InternalMyDsl.g:2397:1: rule__RepeatStatement__IntegerAssignment_1 : ( ruleInteger ) ;
    public final void rule__RepeatStatement__IntegerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( ( ruleInteger ) )
            // InternalMyDsl.g:2402:2: ( ruleInteger )
            {
            // InternalMyDsl.g:2402:2: ( ruleInteger )
            // InternalMyDsl.g:2403:3: ruleInteger
            {
             before(grammarAccess.getRepeatStatementAccess().getIntegerIntegerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getRepeatStatementAccess().getIntegerIntegerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__IntegerAssignment_1"


    // $ANTLR start "rule__RepeatStatement__StatementsAssignment_3"
    // InternalMyDsl.g:2412:1: rule__RepeatStatement__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__RepeatStatement__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2417:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2417:2: ( ruleStatement )
            // InternalMyDsl.g:2418:3: ruleStatement
            {
             before(grammarAccess.getRepeatStatementAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getRepeatStatementAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepeatStatement__StatementsAssignment_3"


    // $ANTLR start "rule__TraceCommand__StringAssignment_1"
    // InternalMyDsl.g:2427:1: rule__TraceCommand__StringAssignment_1 : ( ruleStringExpression ) ;
    public final void rule__TraceCommand__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( ( ruleStringExpression ) )
            // InternalMyDsl.g:2432:2: ( ruleStringExpression )
            {
            // InternalMyDsl.g:2432:2: ( ruleStringExpression )
            // InternalMyDsl.g:2433:3: ruleStringExpression
            {
             before(grammarAccess.getTraceCommandAccess().getStringStringExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getTraceCommandAccess().getStringStringExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceCommand__StringAssignment_1"


    // $ANTLR start "rule__AtomicCommand__LiteralAssignment"
    // InternalMyDsl.g:2442:1: rule__AtomicCommand__LiteralAssignment : ( ruleCommandLiteral ) ;
    public final void rule__AtomicCommand__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( ruleCommandLiteral ) )
            // InternalMyDsl.g:2447:2: ( ruleCommandLiteral )
            {
            // InternalMyDsl.g:2447:2: ( ruleCommandLiteral )
            // InternalMyDsl.g:2448:3: ruleCommandLiteral
            {
             before(grammarAccess.getAtomicCommandAccess().getLiteralCommandLiteralEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandLiteral();

            state._fsp--;

             after(grammarAccess.getAtomicCommandAccess().getLiteralCommandLiteralEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicCommand__LiteralAssignment"


    // $ANTLR start "rule__ConstructionStatement__CommandAssignment_0"
    // InternalMyDsl.g:2457:1: rule__ConstructionStatement__CommandAssignment_0 : ( ruleGridLiteral ) ;
    public final void rule__ConstructionStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( ( ruleGridLiteral ) )
            // InternalMyDsl.g:2462:2: ( ruleGridLiteral )
            {
            // InternalMyDsl.g:2462:2: ( ruleGridLiteral )
            // InternalMyDsl.g:2463:3: ruleGridLiteral
            {
             before(grammarAccess.getConstructionStatementAccess().getCommandGridLiteralEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGridLiteral();

            state._fsp--;

             after(grammarAccess.getConstructionStatementAccess().getCommandGridLiteralEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__CommandAssignment_0"


    // $ANTLR start "rule__ConstructionStatement__IntegersAssignment_3"
    // InternalMyDsl.g:2472:1: rule__ConstructionStatement__IntegersAssignment_3 : ( ruleInteger ) ;
    public final void rule__ConstructionStatement__IntegersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( ( ruleInteger ) )
            // InternalMyDsl.g:2477:2: ( ruleInteger )
            {
            // InternalMyDsl.g:2477:2: ( ruleInteger )
            // InternalMyDsl.g:2478:3: ruleInteger
            {
             before(grammarAccess.getConstructionStatementAccess().getIntegersIntegerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getConstructionStatementAccess().getIntegersIntegerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__IntegersAssignment_3"


    // $ANTLR start "rule__ConstructionStatement__IntegersAssignment_6"
    // InternalMyDsl.g:2487:1: rule__ConstructionStatement__IntegersAssignment_6 : ( ruleInteger ) ;
    public final void rule__ConstructionStatement__IntegersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2491:1: ( ( ruleInteger ) )
            // InternalMyDsl.g:2492:2: ( ruleInteger )
            {
            // InternalMyDsl.g:2492:2: ( ruleInteger )
            // InternalMyDsl.g:2493:3: ruleInteger
            {
             before(grammarAccess.getConstructionStatementAccess().getIntegersIntegerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getConstructionStatementAccess().getIntegersIntegerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructionStatement__IntegersAssignment_6"


    // $ANTLR start "rule__NegatedExpression__NegatedExpressionAssignment_1"
    // InternalMyDsl.g:2502:1: rule__NegatedExpression__NegatedExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__NegatedExpression__NegatedExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2507:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2507:2: ( ruleExpression )
            // InternalMyDsl.g:2508:3: ruleExpression
            {
             before(grammarAccess.getNegatedExpressionAccess().getNegatedExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getNegatedExpressionAccess().getNegatedExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedExpression__NegatedExpressionAssignment_1"


    // $ANTLR start "rule__BinaryExpression__LeftExpressionAssignment_1"
    // InternalMyDsl.g:2517:1: rule__BinaryExpression__LeftExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__LeftExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2522:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2522:2: ( ruleExpression )
            // InternalMyDsl.g:2523:3: ruleExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getLeftExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__LeftExpressionAssignment_1"


    // $ANTLR start "rule__BinaryExpression__OperatorAssignment_2"
    // InternalMyDsl.g:2532:1: rule__BinaryExpression__OperatorAssignment_2 : ( ruleOperatorLiteral ) ;
    public final void rule__BinaryExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( ( ruleOperatorLiteral ) )
            // InternalMyDsl.g:2537:2: ( ruleOperatorLiteral )
            {
            // InternalMyDsl.g:2537:2: ( ruleOperatorLiteral )
            // InternalMyDsl.g:2538:3: ruleOperatorLiteral
            {
             before(grammarAccess.getBinaryExpressionAccess().getOperatorOperatorLiteralEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperatorLiteral();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOperatorOperatorLiteralEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OperatorAssignment_2"


    // $ANTLR start "rule__BinaryExpression__RightExpressionAssignment_3"
    // InternalMyDsl.g:2547:1: rule__BinaryExpression__RightExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__BinaryExpression__RightExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2552:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2552:2: ( ruleExpression )
            // InternalMyDsl.g:2553:3: ruleExpression
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getRightExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__RightExpressionAssignment_3"


    // $ANTLR start "rule__HeadingExpression__HeadingLiteralAssignment_0"
    // InternalMyDsl.g:2562:1: rule__HeadingExpression__HeadingLiteralAssignment_0 : ( ruleHeadingLiteral ) ;
    public final void rule__HeadingExpression__HeadingLiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( ( ruleHeadingLiteral ) )
            // InternalMyDsl.g:2567:2: ( ruleHeadingLiteral )
            {
            // InternalMyDsl.g:2567:2: ( ruleHeadingLiteral )
            // InternalMyDsl.g:2568:3: ruleHeadingLiteral
            {
             before(grammarAccess.getHeadingExpressionAccess().getHeadingLiteralHeadingLiteralEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHeadingLiteral();

            state._fsp--;

             after(grammarAccess.getHeadingExpressionAccess().getHeadingLiteralHeadingLiteralEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadingExpression__HeadingLiteralAssignment_0"


    // $ANTLR start "rule__HeadingExpression__DirectionLiteralAssignment_1"
    // InternalMyDsl.g:2577:1: rule__HeadingExpression__DirectionLiteralAssignment_1 : ( ruleDirectionLiteral ) ;
    public final void rule__HeadingExpression__DirectionLiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( ruleDirectionLiteral ) )
            // InternalMyDsl.g:2582:2: ( ruleDirectionLiteral )
            {
            // InternalMyDsl.g:2582:2: ( ruleDirectionLiteral )
            // InternalMyDsl.g:2583:3: ruleDirectionLiteral
            {
             before(grammarAccess.getHeadingExpressionAccess().getDirectionLiteralDirectionLiteralEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectionLiteral();

            state._fsp--;

             after(grammarAccess.getHeadingExpressionAccess().getDirectionLiteralDirectionLiteralEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadingExpression__DirectionLiteralAssignment_1"


    // $ANTLR start "rule__WallAheadExpression__WallAssignment_0"
    // InternalMyDsl.g:2592:1: rule__WallAheadExpression__WallAssignment_0 : ( ruleWallLiteral ) ;
    public final void rule__WallAheadExpression__WallAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( ( ruleWallLiteral ) )
            // InternalMyDsl.g:2597:2: ( ruleWallLiteral )
            {
            // InternalMyDsl.g:2597:2: ( ruleWallLiteral )
            // InternalMyDsl.g:2598:3: ruleWallLiteral
            {
             before(grammarAccess.getWallAheadExpressionAccess().getWallWallLiteralEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWallLiteral();

            state._fsp--;

             after(grammarAccess.getWallAheadExpressionAccess().getWallWallLiteralEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallAheadExpression__WallAssignment_0"


    // $ANTLR start "rule__WallAheadExpression__AheadAssignment_1"
    // InternalMyDsl.g:2607:1: rule__WallAheadExpression__AheadAssignment_1 : ( ruleAheadLiteral ) ;
    public final void rule__WallAheadExpression__AheadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2611:1: ( ( ruleAheadLiteral ) )
            // InternalMyDsl.g:2612:2: ( ruleAheadLiteral )
            {
            // InternalMyDsl.g:2612:2: ( ruleAheadLiteral )
            // InternalMyDsl.g:2613:3: ruleAheadLiteral
            {
             before(grammarAccess.getWallAheadExpressionAccess().getAheadAheadLiteralEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAheadLiteral();

            state._fsp--;

             after(grammarAccess.getWallAheadExpressionAccess().getAheadAheadLiteralEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallAheadExpression__AheadAssignment_1"


    // $ANTLR start "rule__NormalExpression__LiteralAssignment"
    // InternalMyDsl.g:2622:1: rule__NormalExpression__LiteralAssignment : ( ruleNormalExpressionLiteral ) ;
    public final void rule__NormalExpression__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2626:1: ( ( ruleNormalExpressionLiteral ) )
            // InternalMyDsl.g:2627:2: ( ruleNormalExpressionLiteral )
            {
            // InternalMyDsl.g:2627:2: ( ruleNormalExpressionLiteral )
            // InternalMyDsl.g:2628:3: ruleNormalExpressionLiteral
            {
             before(grammarAccess.getNormalExpressionAccess().getLiteralNormalExpressionLiteralEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNormalExpressionLiteral();

            state._fsp--;

             after(grammarAccess.getNormalExpressionAccess().getLiteralNormalExpressionLiteralEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalExpression__LiteralAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000003663FC00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000003643FC00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000C00000301800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003763FC00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000003643FC00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});

}