package com.hribol.bromium.dsl.ide.contentassist.antlr.internal;

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
import com.hribol.bromium.dsl.services.BromiumGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBromiumParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'actions'", "'{'", "'}'", "'from'", "'id'", "'syntax'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'expect'", "'http'", "'request'", "'element'", "'with'", "'css'", "'is'", "'present'", "'click'", "'on'", "'load'", "'type'", "'in'", "'has'", "'and'", "'set'", "'to'", "'the'", "'text'", "'of'", "'not'", "'selector'", "'page'", "'class'", "'variable'", "'dataId'", "'confirm'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    public static final int T__49=49;
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


        public InternalBromiumParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBromiumParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBromiumParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBromium.g"; }


    	private BromiumGrammarAccess grammarAccess;

    	public void setGrammarAccess(BromiumGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalBromium.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBromium.g:54:1: ( ruleModel EOF )
            // InternalBromium.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBromium.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalBromium.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalBromium.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalBromium.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalBromium.g:69:3: ( rule__Model__Group__0 )
            // InternalBromium.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplicationAction"
    // InternalBromium.g:78:1: entryRuleApplicationAction : ruleApplicationAction EOF ;
    public final void entryRuleApplicationAction() throws RecognitionException {
        try {
            // InternalBromium.g:79:1: ( ruleApplicationAction EOF )
            // InternalBromium.g:80:1: ruleApplicationAction EOF
            {
             before(grammarAccess.getApplicationActionRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationAction();

            state._fsp--;

             after(grammarAccess.getApplicationActionRule()); 
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
    // $ANTLR end "entryRuleApplicationAction"


    // $ANTLR start "ruleApplicationAction"
    // InternalBromium.g:87:1: ruleApplicationAction : ( ( rule__ApplicationAction__Group__0 ) ) ;
    public final void ruleApplicationAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:91:2: ( ( ( rule__ApplicationAction__Group__0 ) ) )
            // InternalBromium.g:92:2: ( ( rule__ApplicationAction__Group__0 ) )
            {
            // InternalBromium.g:92:2: ( ( rule__ApplicationAction__Group__0 ) )
            // InternalBromium.g:93:3: ( rule__ApplicationAction__Group__0 )
            {
             before(grammarAccess.getApplicationActionAccess().getGroup()); 
            // InternalBromium.g:94:3: ( rule__ApplicationAction__Group__0 )
            // InternalBromium.g:94:4: rule__ApplicationAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getGroup()); 

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
    // $ANTLR end "ruleApplicationAction"


    // $ANTLR start "entryRuleSyntaxDefinition"
    // InternalBromium.g:103:1: entryRuleSyntaxDefinition : ruleSyntaxDefinition EOF ;
    public final void entryRuleSyntaxDefinition() throws RecognitionException {
        try {
            // InternalBromium.g:104:1: ( ruleSyntaxDefinition EOF )
            // InternalBromium.g:105:1: ruleSyntaxDefinition EOF
            {
             before(grammarAccess.getSyntaxDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSyntaxDefinition();

            state._fsp--;

             after(grammarAccess.getSyntaxDefinitionRule()); 
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
    // $ANTLR end "entryRuleSyntaxDefinition"


    // $ANTLR start "ruleSyntaxDefinition"
    // InternalBromium.g:112:1: ruleSyntaxDefinition : ( ( rule__SyntaxDefinition__Group__0 ) ) ;
    public final void ruleSyntaxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:116:2: ( ( ( rule__SyntaxDefinition__Group__0 ) ) )
            // InternalBromium.g:117:2: ( ( rule__SyntaxDefinition__Group__0 ) )
            {
            // InternalBromium.g:117:2: ( ( rule__SyntaxDefinition__Group__0 ) )
            // InternalBromium.g:118:3: ( rule__SyntaxDefinition__Group__0 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getGroup()); 
            // InternalBromium.g:119:3: ( rule__SyntaxDefinition__Group__0 )
            // InternalBromium.g:119:4: rule__SyntaxDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SyntaxDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleSyntaxDefinition"


    // $ANTLR start "entryRuleWebDriverActionCondition"
    // InternalBromium.g:128:1: entryRuleWebDriverActionCondition : ruleWebDriverActionCondition EOF ;
    public final void entryRuleWebDriverActionCondition() throws RecognitionException {
        try {
            // InternalBromium.g:129:1: ( ruleWebDriverActionCondition EOF )
            // InternalBromium.g:130:1: ruleWebDriverActionCondition EOF
            {
             before(grammarAccess.getWebDriverActionConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleWebDriverActionCondition();

            state._fsp--;

             after(grammarAccess.getWebDriverActionConditionRule()); 
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
    // $ANTLR end "entryRuleWebDriverActionCondition"


    // $ANTLR start "ruleWebDriverActionCondition"
    // InternalBromium.g:137:1: ruleWebDriverActionCondition : ( ( rule__WebDriverActionCondition__Alternatives ) ) ;
    public final void ruleWebDriverActionCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:141:2: ( ( ( rule__WebDriverActionCondition__Alternatives ) ) )
            // InternalBromium.g:142:2: ( ( rule__WebDriverActionCondition__Alternatives ) )
            {
            // InternalBromium.g:142:2: ( ( rule__WebDriverActionCondition__Alternatives ) )
            // InternalBromium.g:143:3: ( rule__WebDriverActionCondition__Alternatives )
            {
             before(grammarAccess.getWebDriverActionConditionAccess().getAlternatives()); 
            // InternalBromium.g:144:3: ( rule__WebDriverActionCondition__Alternatives )
            // InternalBromium.g:144:4: rule__WebDriverActionCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WebDriverActionCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWebDriverActionConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWebDriverActionCondition"


    // $ANTLR start "entryRuleWebDriverAction"
    // InternalBromium.g:153:1: entryRuleWebDriverAction : ruleWebDriverAction EOF ;
    public final void entryRuleWebDriverAction() throws RecognitionException {
        try {
            // InternalBromium.g:154:1: ( ruleWebDriverAction EOF )
            // InternalBromium.g:155:1: ruleWebDriverAction EOF
            {
             before(grammarAccess.getWebDriverActionRule()); 
            pushFollow(FOLLOW_1);
            ruleWebDriverAction();

            state._fsp--;

             after(grammarAccess.getWebDriverActionRule()); 
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
    // $ANTLR end "entryRuleWebDriverAction"


    // $ANTLR start "ruleWebDriverAction"
    // InternalBromium.g:162:1: ruleWebDriverAction : ( ( rule__WebDriverAction__Alternatives ) ) ;
    public final void ruleWebDriverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:166:2: ( ( ( rule__WebDriverAction__Alternatives ) ) )
            // InternalBromium.g:167:2: ( ( rule__WebDriverAction__Alternatives ) )
            {
            // InternalBromium.g:167:2: ( ( rule__WebDriverAction__Alternatives ) )
            // InternalBromium.g:168:3: ( rule__WebDriverAction__Alternatives )
            {
             before(grammarAccess.getWebDriverActionAccess().getAlternatives()); 
            // InternalBromium.g:169:3: ( rule__WebDriverAction__Alternatives )
            // InternalBromium.g:169:4: rule__WebDriverAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WebDriverAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWebDriverActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWebDriverAction"


    // $ANTLR start "entryRulePrecondition"
    // InternalBromium.g:178:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalBromium.g:179:1: ( rulePrecondition EOF )
            // InternalBromium.g:180:1: rulePrecondition EOF
            {
             before(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionRule()); 
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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalBromium.g:187:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:191:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalBromium.g:192:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalBromium.g:192:2: ( ( rule__Precondition__Group__0 ) )
            // InternalBromium.g:193:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalBromium.g:194:3: ( rule__Precondition__Group__0 )
            // InternalBromium.g:194:4: rule__Precondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getGroup()); 

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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalBromium.g:203:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalBromium.g:204:1: ( rulePostcondition EOF )
            // InternalBromium.g:205:1: rulePostcondition EOF
            {
             before(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getPostconditionRule()); 
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
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalBromium.g:212:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:216:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalBromium.g:217:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalBromium.g:217:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalBromium.g:218:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalBromium.g:219:3: ( rule__Postcondition__Group__0 )
            // InternalBromium.g:219:4: rule__Postcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getGroup()); 

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
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleExpectHttpRequest"
    // InternalBromium.g:228:1: entryRuleExpectHttpRequest : ruleExpectHttpRequest EOF ;
    public final void entryRuleExpectHttpRequest() throws RecognitionException {
        try {
            // InternalBromium.g:229:1: ( ruleExpectHttpRequest EOF )
            // InternalBromium.g:230:1: ruleExpectHttpRequest EOF
            {
             before(grammarAccess.getExpectHttpRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleExpectHttpRequest();

            state._fsp--;

             after(grammarAccess.getExpectHttpRequestRule()); 
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
    // $ANTLR end "entryRuleExpectHttpRequest"


    // $ANTLR start "ruleExpectHttpRequest"
    // InternalBromium.g:237:1: ruleExpectHttpRequest : ( ( rule__ExpectHttpRequest__Group__0 ) ) ;
    public final void ruleExpectHttpRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:241:2: ( ( ( rule__ExpectHttpRequest__Group__0 ) ) )
            // InternalBromium.g:242:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            {
            // InternalBromium.g:242:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            // InternalBromium.g:243:3: ( rule__ExpectHttpRequest__Group__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup()); 
            // InternalBromium.g:244:3: ( rule__ExpectHttpRequest__Group__0 )
            // InternalBromium.g:244:4: rule__ExpectHttpRequest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpectHttpRequestAccess().getGroup()); 

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
    // $ANTLR end "ruleExpectHttpRequest"


    // $ANTLR start "entryRuleElementByCssToBePresent"
    // InternalBromium.g:253:1: entryRuleElementByCssToBePresent : ruleElementByCssToBePresent EOF ;
    public final void entryRuleElementByCssToBePresent() throws RecognitionException {
        try {
            // InternalBromium.g:254:1: ( ruleElementByCssToBePresent EOF )
            // InternalBromium.g:255:1: ruleElementByCssToBePresent EOF
            {
             before(grammarAccess.getElementByCssToBePresentRule()); 
            pushFollow(FOLLOW_1);
            ruleElementByCssToBePresent();

            state._fsp--;

             after(grammarAccess.getElementByCssToBePresentRule()); 
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
    // $ANTLR end "entryRuleElementByCssToBePresent"


    // $ANTLR start "ruleElementByCssToBePresent"
    // InternalBromium.g:262:1: ruleElementByCssToBePresent : ( ( rule__ElementByCssToBePresent__Group__0 ) ) ;
    public final void ruleElementByCssToBePresent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:266:2: ( ( ( rule__ElementByCssToBePresent__Group__0 ) ) )
            // InternalBromium.g:267:2: ( ( rule__ElementByCssToBePresent__Group__0 ) )
            {
            // InternalBromium.g:267:2: ( ( rule__ElementByCssToBePresent__Group__0 ) )
            // InternalBromium.g:268:3: ( rule__ElementByCssToBePresent__Group__0 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getGroup()); 
            // InternalBromium.g:269:3: ( rule__ElementByCssToBePresent__Group__0 )
            // InternalBromium.g:269:4: rule__ElementByCssToBePresent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementByCssToBePresentAccess().getGroup()); 

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
    // $ANTLR end "ruleElementByCssToBePresent"


    // $ANTLR start "entryRuleClickCssSelector"
    // InternalBromium.g:278:1: entryRuleClickCssSelector : ruleClickCssSelector EOF ;
    public final void entryRuleClickCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:279:1: ( ruleClickCssSelector EOF )
            // InternalBromium.g:280:1: ruleClickCssSelector EOF
            {
             before(grammarAccess.getClickCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleClickCssSelector();

            state._fsp--;

             after(grammarAccess.getClickCssSelectorRule()); 
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
    // $ANTLR end "entryRuleClickCssSelector"


    // $ANTLR start "ruleClickCssSelector"
    // InternalBromium.g:287:1: ruleClickCssSelector : ( ( rule__ClickCssSelector__Group__0 ) ) ;
    public final void ruleClickCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:291:2: ( ( ( rule__ClickCssSelector__Group__0 ) ) )
            // InternalBromium.g:292:2: ( ( rule__ClickCssSelector__Group__0 ) )
            {
            // InternalBromium.g:292:2: ( ( rule__ClickCssSelector__Group__0 ) )
            // InternalBromium.g:293:3: ( rule__ClickCssSelector__Group__0 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getGroup()); 
            // InternalBromium.g:294:3: ( rule__ClickCssSelector__Group__0 )
            // InternalBromium.g:294:4: rule__ClickCssSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickCssSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleClickCssSelector"


    // $ANTLR start "entryRulePageLoad"
    // InternalBromium.g:303:1: entryRulePageLoad : rulePageLoad EOF ;
    public final void entryRulePageLoad() throws RecognitionException {
        try {
            // InternalBromium.g:304:1: ( rulePageLoad EOF )
            // InternalBromium.g:305:1: rulePageLoad EOF
            {
             before(grammarAccess.getPageLoadRule()); 
            pushFollow(FOLLOW_1);
            rulePageLoad();

            state._fsp--;

             after(grammarAccess.getPageLoadRule()); 
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
    // $ANTLR end "entryRulePageLoad"


    // $ANTLR start "rulePageLoad"
    // InternalBromium.g:312:1: rulePageLoad : ( ( rule__PageLoad__Group__0 ) ) ;
    public final void rulePageLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:316:2: ( ( ( rule__PageLoad__Group__0 ) ) )
            // InternalBromium.g:317:2: ( ( rule__PageLoad__Group__0 ) )
            {
            // InternalBromium.g:317:2: ( ( rule__PageLoad__Group__0 ) )
            // InternalBromium.g:318:3: ( rule__PageLoad__Group__0 )
            {
             before(grammarAccess.getPageLoadAccess().getGroup()); 
            // InternalBromium.g:319:3: ( rule__PageLoad__Group__0 )
            // InternalBromium.g:319:4: rule__PageLoad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageLoad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageLoadAccess().getGroup()); 

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
    // $ANTLR end "rulePageLoad"


    // $ANTLR start "entryRuleTypeTextInElementFoundByCssSelector"
    // InternalBromium.g:328:1: entryRuleTypeTextInElementFoundByCssSelector : ruleTypeTextInElementFoundByCssSelector EOF ;
    public final void entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:329:1: ( ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:330:1: ruleTypeTextInElementFoundByCssSelector EOF
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeTextInElementFoundByCssSelector();

            state._fsp--;

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorRule()); 
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
    // $ANTLR end "entryRuleTypeTextInElementFoundByCssSelector"


    // $ANTLR start "ruleTypeTextInElementFoundByCssSelector"
    // InternalBromium.g:337:1: ruleTypeTextInElementFoundByCssSelector : ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) ;
    public final void ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:341:2: ( ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) )
            // InternalBromium.g:342:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            {
            // InternalBromium.g:342:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            // InternalBromium.g:343:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); 
            // InternalBromium.g:344:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            // InternalBromium.g:344:4: rule__TypeTextInElementFoundByCssSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeTextInElementFoundByCssSelector"


    // $ANTLR start "entryRuleTextOfElementWithCssSelectorToBe"
    // InternalBromium.g:353:1: entryRuleTextOfElementWithCssSelectorToBe : ruleTextOfElementWithCssSelectorToBe EOF ;
    public final void entryRuleTextOfElementWithCssSelectorToBe() throws RecognitionException {
        try {
            // InternalBromium.g:354:1: ( ruleTextOfElementWithCssSelectorToBe EOF )
            // InternalBromium.g:355:1: ruleTextOfElementWithCssSelectorToBe EOF
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeRule()); 
            pushFollow(FOLLOW_1);
            ruleTextOfElementWithCssSelectorToBe();

            state._fsp--;

             after(grammarAccess.getTextOfElementWithCssSelectorToBeRule()); 
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
    // $ANTLR end "entryRuleTextOfElementWithCssSelectorToBe"


    // $ANTLR start "ruleTextOfElementWithCssSelectorToBe"
    // InternalBromium.g:362:1: ruleTextOfElementWithCssSelectorToBe : ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) ) ;
    public final void ruleTextOfElementWithCssSelectorToBe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:366:2: ( ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) ) )
            // InternalBromium.g:367:2: ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) )
            {
            // InternalBromium.g:367:2: ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) )
            // InternalBromium.g:368:3: ( rule__TextOfElementWithCssSelectorToBe__Group__0 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getGroup()); 
            // InternalBromium.g:369:3: ( rule__TextOfElementWithCssSelectorToBe__Group__0 )
            // InternalBromium.g:369:4: rule__TextOfElementWithCssSelectorToBe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getGroup()); 

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
    // $ANTLR end "ruleTextOfElementWithCssSelectorToBe"


    // $ANTLR start "entryRuleClickClassByText"
    // InternalBromium.g:378:1: entryRuleClickClassByText : ruleClickClassByText EOF ;
    public final void entryRuleClickClassByText() throws RecognitionException {
        try {
            // InternalBromium.g:379:1: ( ruleClickClassByText EOF )
            // InternalBromium.g:380:1: ruleClickClassByText EOF
            {
             before(grammarAccess.getClickClassByTextRule()); 
            pushFollow(FOLLOW_1);
            ruleClickClassByText();

            state._fsp--;

             after(grammarAccess.getClickClassByTextRule()); 
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
    // $ANTLR end "entryRuleClickClassByText"


    // $ANTLR start "ruleClickClassByText"
    // InternalBromium.g:387:1: ruleClickClassByText : ( ( rule__ClickClassByText__Group__0 ) ) ;
    public final void ruleClickClassByText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:391:2: ( ( ( rule__ClickClassByText__Group__0 ) ) )
            // InternalBromium.g:392:2: ( ( rule__ClickClassByText__Group__0 ) )
            {
            // InternalBromium.g:392:2: ( ( rule__ClickClassByText__Group__0 ) )
            // InternalBromium.g:393:3: ( rule__ClickClassByText__Group__0 )
            {
             before(grammarAccess.getClickClassByTextAccess().getGroup()); 
            // InternalBromium.g:394:3: ( rule__ClickClassByText__Group__0 )
            // InternalBromium.g:394:4: rule__ClickClassByText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickClassByTextAccess().getGroup()); 

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
    // $ANTLR end "ruleClickClassByText"


    // $ANTLR start "entryRuleSetVariableToTextOfElementWithCssSelector"
    // InternalBromium.g:403:1: entryRuleSetVariableToTextOfElementWithCssSelector : ruleSetVariableToTextOfElementWithCssSelector EOF ;
    public final void entryRuleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:404:1: ( ruleSetVariableToTextOfElementWithCssSelector EOF )
            // InternalBromium.g:405:1: ruleSetVariableToTextOfElementWithCssSelector EOF
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSetVariableToTextOfElementWithCssSelector();

            state._fsp--;

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorRule()); 
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
    // $ANTLR end "entryRuleSetVariableToTextOfElementWithCssSelector"


    // $ANTLR start "ruleSetVariableToTextOfElementWithCssSelector"
    // InternalBromium.g:412:1: ruleSetVariableToTextOfElementWithCssSelector : ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) ) ;
    public final void ruleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:416:2: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) ) )
            // InternalBromium.g:417:2: ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) )
            {
            // InternalBromium.g:417:2: ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) )
            // InternalBromium.g:418:3: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getGroup()); 
            // InternalBromium.g:419:3: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 )
            // InternalBromium.g:419:4: rule__SetVariableToTextOfElementWithCssSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleSetVariableToTextOfElementWithCssSelector"


    // $ANTLR start "entryRuleClickDataId"
    // InternalBromium.g:428:1: entryRuleClickDataId : ruleClickDataId EOF ;
    public final void entryRuleClickDataId() throws RecognitionException {
        try {
            // InternalBromium.g:429:1: ( ruleClickDataId EOF )
            // InternalBromium.g:430:1: ruleClickDataId EOF
            {
             before(grammarAccess.getClickDataIdRule()); 
            pushFollow(FOLLOW_1);
            ruleClickDataId();

            state._fsp--;

             after(grammarAccess.getClickDataIdRule()); 
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
    // $ANTLR end "entryRuleClickDataId"


    // $ANTLR start "ruleClickDataId"
    // InternalBromium.g:437:1: ruleClickDataId : ( ( rule__ClickDataId__Group__0 ) ) ;
    public final void ruleClickDataId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:441:2: ( ( ( rule__ClickDataId__Group__0 ) ) )
            // InternalBromium.g:442:2: ( ( rule__ClickDataId__Group__0 ) )
            {
            // InternalBromium.g:442:2: ( ( rule__ClickDataId__Group__0 ) )
            // InternalBromium.g:443:3: ( rule__ClickDataId__Group__0 )
            {
             before(grammarAccess.getClickDataIdAccess().getGroup()); 
            // InternalBromium.g:444:3: ( rule__ClickDataId__Group__0 )
            // InternalBromium.g:444:4: rule__ClickDataId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickDataId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickDataIdAccess().getGroup()); 

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
    // $ANTLR end "ruleClickDataId"


    // $ANTLR start "entryRuleConfirmAlert"
    // InternalBromium.g:453:1: entryRuleConfirmAlert : ruleConfirmAlert EOF ;
    public final void entryRuleConfirmAlert() throws RecognitionException {
        try {
            // InternalBromium.g:454:1: ( ruleConfirmAlert EOF )
            // InternalBromium.g:455:1: ruleConfirmAlert EOF
            {
             before(grammarAccess.getConfirmAlertRule()); 
            pushFollow(FOLLOW_1);
            ruleConfirmAlert();

            state._fsp--;

             after(grammarAccess.getConfirmAlertRule()); 
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
    // $ANTLR end "entryRuleConfirmAlert"


    // $ANTLR start "ruleConfirmAlert"
    // InternalBromium.g:462:1: ruleConfirmAlert : ( ( rule__ConfirmAlert__Group__0 ) ) ;
    public final void ruleConfirmAlert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:466:2: ( ( ( rule__ConfirmAlert__Group__0 ) ) )
            // InternalBromium.g:467:2: ( ( rule__ConfirmAlert__Group__0 ) )
            {
            // InternalBromium.g:467:2: ( ( rule__ConfirmAlert__Group__0 ) )
            // InternalBromium.g:468:3: ( rule__ConfirmAlert__Group__0 )
            {
             before(grammarAccess.getConfirmAlertAccess().getGroup()); 
            // InternalBromium.g:469:3: ( rule__ConfirmAlert__Group__0 )
            // InternalBromium.g:469:4: rule__ConfirmAlert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfirmAlert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfirmAlertAccess().getGroup()); 

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
    // $ANTLR end "ruleConfirmAlert"


    // $ANTLR start "entryRuleClickId"
    // InternalBromium.g:478:1: entryRuleClickId : ruleClickId EOF ;
    public final void entryRuleClickId() throws RecognitionException {
        try {
            // InternalBromium.g:479:1: ( ruleClickId EOF )
            // InternalBromium.g:480:1: ruleClickId EOF
            {
             before(grammarAccess.getClickIdRule()); 
            pushFollow(FOLLOW_1);
            ruleClickId();

            state._fsp--;

             after(grammarAccess.getClickIdRule()); 
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
    // $ANTLR end "entryRuleClickId"


    // $ANTLR start "ruleClickId"
    // InternalBromium.g:487:1: ruleClickId : ( ( rule__ClickId__Group__0 ) ) ;
    public final void ruleClickId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:491:2: ( ( ( rule__ClickId__Group__0 ) ) )
            // InternalBromium.g:492:2: ( ( rule__ClickId__Group__0 ) )
            {
            // InternalBromium.g:492:2: ( ( rule__ClickId__Group__0 ) )
            // InternalBromium.g:493:3: ( rule__ClickId__Group__0 )
            {
             before(grammarAccess.getClickIdAccess().getGroup()); 
            // InternalBromium.g:494:3: ( rule__ClickId__Group__0 )
            // InternalBromium.g:494:4: rule__ClickId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickIdAccess().getGroup()); 

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
    // $ANTLR end "ruleClickId"


    // $ANTLR start "entryRuleParameterValue"
    // InternalBromium.g:503:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalBromium.g:504:1: ( ruleParameterValue EOF )
            // InternalBromium.g:505:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule()); 
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalBromium.g:512:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:516:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalBromium.g:517:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalBromium.g:517:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalBromium.g:518:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalBromium.g:519:3: ( rule__ParameterValue__Alternatives )
            // InternalBromium.g:519:4: rule__ParameterValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleExposedParameter"
    // InternalBromium.g:528:1: entryRuleExposedParameter : ruleExposedParameter EOF ;
    public final void entryRuleExposedParameter() throws RecognitionException {
        try {
            // InternalBromium.g:529:1: ( ruleExposedParameter EOF )
            // InternalBromium.g:530:1: ruleExposedParameter EOF
            {
             before(grammarAccess.getExposedParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleExposedParameter();

            state._fsp--;

             after(grammarAccess.getExposedParameterRule()); 
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
    // $ANTLR end "entryRuleExposedParameter"


    // $ANTLR start "ruleExposedParameter"
    // InternalBromium.g:537:1: ruleExposedParameter : ( ( rule__ExposedParameter__NameAssignment ) ) ;
    public final void ruleExposedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:541:2: ( ( ( rule__ExposedParameter__NameAssignment ) ) )
            // InternalBromium.g:542:2: ( ( rule__ExposedParameter__NameAssignment ) )
            {
            // InternalBromium.g:542:2: ( ( rule__ExposedParameter__NameAssignment ) )
            // InternalBromium.g:543:3: ( rule__ExposedParameter__NameAssignment )
            {
             before(grammarAccess.getExposedParameterAccess().getNameAssignment()); 
            // InternalBromium.g:544:3: ( rule__ExposedParameter__NameAssignment )
            // InternalBromium.g:544:4: rule__ExposedParameter__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExposedParameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExposedParameterAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleExposedParameter"


    // $ANTLR start "entryRuleVersion"
    // InternalBromium.g:553:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalBromium.g:554:1: ( ruleVersion EOF )
            // InternalBromium.g:555:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalBromium.g:562:1: ruleVersion : ( RULE_STRING ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:566:2: ( ( RULE_STRING ) )
            // InternalBromium.g:567:2: ( RULE_STRING )
            {
            // InternalBromium.g:567:2: ( RULE_STRING )
            // InternalBromium.g:568:3: RULE_STRING
            {
             before(grammarAccess.getVersionAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "rule__WebDriverActionCondition__Alternatives"
    // InternalBromium.g:577:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );
    public final void rule__WebDriverActionCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:581:1: ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalBromium.g:582:2: ( ruleElementByCssToBePresent )
                    {
                    // InternalBromium.g:582:2: ( ruleElementByCssToBePresent )
                    // InternalBromium.g:583:3: ruleElementByCssToBePresent
                    {
                     before(grammarAccess.getWebDriverActionConditionAccess().getElementByCssToBePresentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleElementByCssToBePresent();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionConditionAccess().getElementByCssToBePresentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:588:2: ( ruleTextOfElementWithCssSelectorToBe )
                    {
                    // InternalBromium.g:588:2: ( ruleTextOfElementWithCssSelectorToBe )
                    // InternalBromium.g:589:3: ruleTextOfElementWithCssSelectorToBe
                    {
                     before(grammarAccess.getWebDriverActionConditionAccess().getTextOfElementWithCssSelectorToBeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextOfElementWithCssSelectorToBe();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionConditionAccess().getTextOfElementWithCssSelectorToBeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBromium.g:594:2: ( ruleConfirmAlert )
                    {
                    // InternalBromium.g:594:2: ( ruleConfirmAlert )
                    // InternalBromium.g:595:3: ruleConfirmAlert
                    {
                     before(grammarAccess.getWebDriverActionConditionAccess().getConfirmAlertParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConfirmAlert();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionConditionAccess().getConfirmAlertParserRuleCall_2()); 

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
    // $ANTLR end "rule__WebDriverActionCondition__Alternatives"


    // $ANTLR start "rule__WebDriverAction__Alternatives"
    // InternalBromium.g:604:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) );
    public final void rule__WebDriverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:608:1: ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBromium.g:609:2: ( ruleClickCssSelector )
                    {
                    // InternalBromium.g:609:2: ( ruleClickCssSelector )
                    // InternalBromium.g:610:3: ruleClickCssSelector
                    {
                     before(grammarAccess.getWebDriverActionAccess().getClickCssSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClickCssSelector();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getClickCssSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:615:2: ( ruleClickClassByText )
                    {
                    // InternalBromium.g:615:2: ( ruleClickClassByText )
                    // InternalBromium.g:616:3: ruleClickClassByText
                    {
                     before(grammarAccess.getWebDriverActionAccess().getClickClassByTextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClickClassByText();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getClickClassByTextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBromium.g:621:2: ( rulePageLoad )
                    {
                    // InternalBromium.g:621:2: ( rulePageLoad )
                    // InternalBromium.g:622:3: rulePageLoad
                    {
                     before(grammarAccess.getWebDriverActionAccess().getPageLoadParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePageLoad();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getPageLoadParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBromium.g:627:2: ( ruleTypeTextInElementFoundByCssSelector )
                    {
                    // InternalBromium.g:627:2: ( ruleTypeTextInElementFoundByCssSelector )
                    // InternalBromium.g:628:3: ruleTypeTextInElementFoundByCssSelector
                    {
                     before(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeTextInElementFoundByCssSelector();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBromium.g:633:2: ( ruleClickDataId )
                    {
                    // InternalBromium.g:633:2: ( ruleClickDataId )
                    // InternalBromium.g:634:3: ruleClickDataId
                    {
                     before(grammarAccess.getWebDriverActionAccess().getClickDataIdParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleClickDataId();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getClickDataIdParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBromium.g:639:2: ( ruleSetVariableToTextOfElementWithCssSelector )
                    {
                    // InternalBromium.g:639:2: ( ruleSetVariableToTextOfElementWithCssSelector )
                    // InternalBromium.g:640:3: ruleSetVariableToTextOfElementWithCssSelector
                    {
                     before(grammarAccess.getWebDriverActionAccess().getSetVariableToTextOfElementWithCssSelectorParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSetVariableToTextOfElementWithCssSelector();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getSetVariableToTextOfElementWithCssSelectorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBromium.g:645:2: ( ruleClickId )
                    {
                    // InternalBromium.g:645:2: ( ruleClickId )
                    // InternalBromium.g:646:3: ruleClickId
                    {
                     before(grammarAccess.getWebDriverActionAccess().getClickIdParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleClickId();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getClickIdParserRuleCall_6()); 

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
    // $ANTLR end "rule__WebDriverAction__Alternatives"


    // $ANTLR start "rule__ParameterValue__Alternatives"
    // InternalBromium.g:655:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:659:1: ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBromium.g:660:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    {
                    // InternalBromium.g:660:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    // InternalBromium.g:661:3: ( rule__ParameterValue__ContentAssignment_0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getContentAssignment_0()); 
                    // InternalBromium.g:662:3: ( rule__ParameterValue__ContentAssignment_0 )
                    // InternalBromium.g:662:4: rule__ParameterValue__ContentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__ContentAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getContentAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:666:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    {
                    // InternalBromium.g:666:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    // InternalBromium.g:667:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    {
                     before(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1()); 
                    // InternalBromium.g:668:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    // InternalBromium.g:668:4: rule__ParameterValue__ExposedParameterAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__ExposedParameterAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1()); 

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
    // $ANTLR end "rule__ParameterValue__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalBromium.g:676:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:680:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBromium.g:681:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalBromium.g:688:1: rule__Model__Group__0__Impl : ( 'name' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:692:1: ( ( 'name' ) )
            // InternalBromium.g:693:1: ( 'name' )
            {
            // InternalBromium.g:693:1: ( 'name' )
            // InternalBromium.g:694:2: 'name'
            {
             before(grammarAccess.getModelAccess().getNameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalBromium.g:703:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:707:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBromium.g:708:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalBromium.g:715:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:719:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalBromium.g:720:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalBromium.g:720:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalBromium.g:721:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalBromium.g:722:2: ( rule__Model__NameAssignment_1 )
            // InternalBromium.g:722:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalBromium.g:730:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:734:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBromium.g:735:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalBromium.g:742:1: rule__Model__Group__2__Impl : ( 'version' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:746:1: ( ( 'version' ) )
            // InternalBromium.g:747:1: ( 'version' )
            {
            // InternalBromium.g:747:1: ( 'version' )
            // InternalBromium.g:748:2: 'version'
            {
             before(grammarAccess.getModelAccess().getVersionKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVersionKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalBromium.g:757:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:761:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBromium.g:762:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalBromium.g:769:1: rule__Model__Group__3__Impl : ( ( rule__Model__VersionAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:773:1: ( ( ( rule__Model__VersionAssignment_3 ) ) )
            // InternalBromium.g:774:1: ( ( rule__Model__VersionAssignment_3 ) )
            {
            // InternalBromium.g:774:1: ( ( rule__Model__VersionAssignment_3 ) )
            // InternalBromium.g:775:2: ( rule__Model__VersionAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_3()); 
            // InternalBromium.g:776:2: ( rule__Model__VersionAssignment_3 )
            // InternalBromium.g:776:3: rule__Model__VersionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVersionAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalBromium.g:784:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:788:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBromium.g:789:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalBromium.g:796:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:800:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalBromium.g:801:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalBromium.g:801:1: ( ( rule__Model__Group_4__0 )? )
            // InternalBromium.g:802:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalBromium.g:803:2: ( rule__Model__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBromium.g:803:3: rule__Model__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalBromium.g:811:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:815:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalBromium.g:816:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalBromium.g:823:1: rule__Model__Group__5__Impl : ( 'actions' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:827:1: ( ( 'actions' ) )
            // InternalBromium.g:828:1: ( 'actions' )
            {
            // InternalBromium.g:828:1: ( 'actions' )
            // InternalBromium.g:829:2: 'actions'
            {
             before(grammarAccess.getModelAccess().getActionsKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getActionsKeyword_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalBromium.g:838:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:842:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalBromium.g:843:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalBromium.g:850:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:854:1: ( ( '{' ) )
            // InternalBromium.g:855:1: ( '{' )
            {
            // InternalBromium.g:855:1: ( '{' )
            // InternalBromium.g:856:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalBromium.g:865:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:869:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalBromium.g:870:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalBromium.g:877:1: rule__Model__Group__7__Impl : ( ( rule__Model__ActionsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:881:1: ( ( ( rule__Model__ActionsAssignment_7 )* ) )
            // InternalBromium.g:882:1: ( ( rule__Model__ActionsAssignment_7 )* )
            {
            // InternalBromium.g:882:1: ( ( rule__Model__ActionsAssignment_7 )* )
            // InternalBromium.g:883:2: ( rule__Model__ActionsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getActionsAssignment_7()); 
            // InternalBromium.g:884:2: ( rule__Model__ActionsAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBromium.g:884:3: rule__Model__ActionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__ActionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getActionsAssignment_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalBromium.g:892:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:896:1: ( rule__Model__Group__8__Impl )
            // InternalBromium.g:897:2: rule__Model__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__8__Impl();

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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalBromium.g:903:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:907:1: ( ( '}' ) )
            // InternalBromium.g:908:1: ( '}' )
            {
            // InternalBromium.g:908:1: ( '}' )
            // InternalBromium.g:909:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // InternalBromium.g:919:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:923:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalBromium.g:924:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1();

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
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // InternalBromium.g:931:1: rule__Model__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:935:1: ( ( 'from' ) )
            // InternalBromium.g:936:1: ( 'from' )
            {
            // InternalBromium.g:936:1: ( 'from' )
            // InternalBromium.g:937:2: 'from'
            {
             before(grammarAccess.getModelAccess().getFromKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFromKeyword_4_0()); 

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
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // InternalBromium.g:946:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:950:1: ( rule__Model__Group_4__1__Impl )
            // InternalBromium.g:951:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1__Impl();

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
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // InternalBromium.g:957:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__BaseVersionAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:961:1: ( ( ( rule__Model__BaseVersionAssignment_4_1 ) ) )
            // InternalBromium.g:962:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            {
            // InternalBromium.g:962:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            // InternalBromium.g:963:2: ( rule__Model__BaseVersionAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); 
            // InternalBromium.g:964:2: ( rule__Model__BaseVersionAssignment_4_1 )
            // InternalBromium.g:964:3: rule__Model__BaseVersionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__BaseVersionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); 

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
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__ApplicationAction__Group__0"
    // InternalBromium.g:973:1: rule__ApplicationAction__Group__0 : rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 ;
    public final void rule__ApplicationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:977:1: ( rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 )
            // InternalBromium.g:978:2: rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ApplicationAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__1();

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
    // $ANTLR end "rule__ApplicationAction__Group__0"


    // $ANTLR start "rule__ApplicationAction__Group__0__Impl"
    // InternalBromium.g:985:1: rule__ApplicationAction__Group__0__Impl : ( 'id' ) ;
    public final void rule__ApplicationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:989:1: ( ( 'id' ) )
            // InternalBromium.g:990:1: ( 'id' )
            {
            // InternalBromium.g:990:1: ( 'id' )
            // InternalBromium.g:991:2: 'id'
            {
             before(grammarAccess.getApplicationActionAccess().getIdKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getIdKeyword_0()); 

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
    // $ANTLR end "rule__ApplicationAction__Group__0__Impl"


    // $ANTLR start "rule__ApplicationAction__Group__1"
    // InternalBromium.g:1000:1: rule__ApplicationAction__Group__1 : rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 ;
    public final void rule__ApplicationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1004:1: ( rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 )
            // InternalBromium.g:1005:2: rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ApplicationAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__2();

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
    // $ANTLR end "rule__ApplicationAction__Group__1"


    // $ANTLR start "rule__ApplicationAction__Group__1__Impl"
    // InternalBromium.g:1012:1: rule__ApplicationAction__Group__1__Impl : ( ( rule__ApplicationAction__NameAssignment_1 ) ) ;
    public final void rule__ApplicationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1016:1: ( ( ( rule__ApplicationAction__NameAssignment_1 ) ) )
            // InternalBromium.g:1017:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            {
            // InternalBromium.g:1017:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            // InternalBromium.g:1018:2: ( rule__ApplicationAction__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationActionAccess().getNameAssignment_1()); 
            // InternalBromium.g:1019:2: ( rule__ApplicationAction__NameAssignment_1 )
            // InternalBromium.g:1019:3: rule__ApplicationAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ApplicationAction__Group__1__Impl"


    // $ANTLR start "rule__ApplicationAction__Group__2"
    // InternalBromium.g:1027:1: rule__ApplicationAction__Group__2 : rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 ;
    public final void rule__ApplicationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1031:1: ( rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 )
            // InternalBromium.g:1032:2: rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ApplicationAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__3();

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
    // $ANTLR end "rule__ApplicationAction__Group__2"


    // $ANTLR start "rule__ApplicationAction__Group__2__Impl"
    // InternalBromium.g:1039:1: rule__ApplicationAction__Group__2__Impl : ( 'syntax' ) ;
    public final void rule__ApplicationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1043:1: ( ( 'syntax' ) )
            // InternalBromium.g:1044:1: ( 'syntax' )
            {
            // InternalBromium.g:1044:1: ( 'syntax' )
            // InternalBromium.g:1045:2: 'syntax'
            {
             before(grammarAccess.getApplicationActionAccess().getSyntaxKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getSyntaxKeyword_2()); 

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
    // $ANTLR end "rule__ApplicationAction__Group__2__Impl"


    // $ANTLR start "rule__ApplicationAction__Group__3"
    // InternalBromium.g:1054:1: rule__ApplicationAction__Group__3 : rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 ;
    public final void rule__ApplicationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1058:1: ( rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 )
            // InternalBromium.g:1059:2: rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ApplicationAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__4();

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
    // $ANTLR end "rule__ApplicationAction__Group__3"


    // $ANTLR start "rule__ApplicationAction__Group__3__Impl"
    // InternalBromium.g:1066:1: rule__ApplicationAction__Group__3__Impl : ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) ;
    public final void rule__ApplicationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1070:1: ( ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) )
            // InternalBromium.g:1071:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            {
            // InternalBromium.g:1071:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            // InternalBromium.g:1072:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            {
             before(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsAssignment_3()); 
            // InternalBromium.g:1073:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBromium.g:1073:3: rule__ApplicationAction__SyntaxDefinitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ApplicationAction__SyntaxDefinitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsAssignment_3()); 

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
    // $ANTLR end "rule__ApplicationAction__Group__3__Impl"


    // $ANTLR start "rule__ApplicationAction__Group__4"
    // InternalBromium.g:1081:1: rule__ApplicationAction__Group__4 : rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 ;
    public final void rule__ApplicationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1085:1: ( rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 )
            // InternalBromium.g:1086:2: rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ApplicationAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__5();

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
    // $ANTLR end "rule__ApplicationAction__Group__4"


    // $ANTLR start "rule__ApplicationAction__Group__4__Impl"
    // InternalBromium.g:1093:1: rule__ApplicationAction__Group__4__Impl : ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) ;
    public final void rule__ApplicationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1097:1: ( ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) )
            // InternalBromium.g:1098:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            {
            // InternalBromium.g:1098:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            // InternalBromium.g:1099:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_4()); 
            // InternalBromium.g:1100:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBromium.g:1100:3: rule__ApplicationAction__PreconditionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__PreconditionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_4()); 

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
    // $ANTLR end "rule__ApplicationAction__Group__4__Impl"


    // $ANTLR start "rule__ApplicationAction__Group__5"
    // InternalBromium.g:1108:1: rule__ApplicationAction__Group__5 : rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 ;
    public final void rule__ApplicationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1112:1: ( rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 )
            // InternalBromium.g:1113:2: rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ApplicationAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__6();

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
    // $ANTLR end "rule__ApplicationAction__Group__5"


    // $ANTLR start "rule__ApplicationAction__Group__5__Impl"
    // InternalBromium.g:1120:1: rule__ApplicationAction__Group__5__Impl : ( ( rule__ApplicationAction__WebDriverActionAssignment_5 ) ) ;
    public final void rule__ApplicationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1124:1: ( ( ( rule__ApplicationAction__WebDriverActionAssignment_5 ) ) )
            // InternalBromium.g:1125:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_5 ) )
            {
            // InternalBromium.g:1125:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_5 ) )
            // InternalBromium.g:1126:2: ( rule__ApplicationAction__WebDriverActionAssignment_5 )
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_5()); 
            // InternalBromium.g:1127:2: ( rule__ApplicationAction__WebDriverActionAssignment_5 )
            // InternalBromium.g:1127:3: rule__ApplicationAction__WebDriverActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__WebDriverActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_5()); 

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
    // $ANTLR end "rule__ApplicationAction__Group__5__Impl"


    // $ANTLR start "rule__ApplicationAction__Group__6"
    // InternalBromium.g:1135:1: rule__ApplicationAction__Group__6 : rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 ;
    public final void rule__ApplicationAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1139:1: ( rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 )
            // InternalBromium.g:1140:2: rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ApplicationAction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__7();

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
    // $ANTLR end "rule__ApplicationAction__Group__6"


    // $ANTLR start "rule__ApplicationAction__Group__6__Impl"
    // InternalBromium.g:1147:1: rule__ApplicationAction__Group__6__Impl : ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 )? ) ;
    public final void rule__ApplicationAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1151:1: ( ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 )? ) )
            // InternalBromium.g:1152:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 )? )
            {
            // InternalBromium.g:1152:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 )? )
            // InternalBromium.g:1153:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 )?
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_6()); 
            // InternalBromium.g:1154:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBromium.g:1154:3: rule__ApplicationAction__ExpectHttpRequestAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__ExpectHttpRequestAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_6()); 

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
    // $ANTLR end "rule__ApplicationAction__Group__6__Impl"


    // $ANTLR start "rule__ApplicationAction__Group__7"
    // InternalBromium.g:1162:1: rule__ApplicationAction__Group__7 : rule__ApplicationAction__Group__7__Impl ;
    public final void rule__ApplicationAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1166:1: ( rule__ApplicationAction__Group__7__Impl )
            // InternalBromium.g:1167:2: rule__ApplicationAction__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__7__Impl();

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
    // $ANTLR end "rule__ApplicationAction__Group__7"


    // $ANTLR start "rule__ApplicationAction__Group__7__Impl"
    // InternalBromium.g:1173:1: rule__ApplicationAction__Group__7__Impl : ( ( rule__ApplicationAction__PostconditionAssignment_7 )? ) ;
    public final void rule__ApplicationAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1177:1: ( ( ( rule__ApplicationAction__PostconditionAssignment_7 )? ) )
            // InternalBromium.g:1178:1: ( ( rule__ApplicationAction__PostconditionAssignment_7 )? )
            {
            // InternalBromium.g:1178:1: ( ( rule__ApplicationAction__PostconditionAssignment_7 )? )
            // InternalBromium.g:1179:2: ( rule__ApplicationAction__PostconditionAssignment_7 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_7()); 
            // InternalBromium.g:1180:2: ( rule__ApplicationAction__PostconditionAssignment_7 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBromium.g:1180:3: rule__ApplicationAction__PostconditionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__PostconditionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_7()); 

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
    // $ANTLR end "rule__ApplicationAction__Group__7__Impl"


    // $ANTLR start "rule__SyntaxDefinition__Group__0"
    // InternalBromium.g:1189:1: rule__SyntaxDefinition__Group__0 : rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 ;
    public final void rule__SyntaxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1193:1: ( rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 )
            // InternalBromium.g:1194:2: rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SyntaxDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SyntaxDefinition__Group__1();

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
    // $ANTLR end "rule__SyntaxDefinition__Group__0"


    // $ANTLR start "rule__SyntaxDefinition__Group__0__Impl"
    // InternalBromium.g:1201:1: rule__SyntaxDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SyntaxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1205:1: ( ( () ) )
            // InternalBromium.g:1206:1: ( () )
            {
            // InternalBromium.g:1206:1: ( () )
            // InternalBromium.g:1207:2: ()
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getSyntaxDefinitionAction_0()); 
            // InternalBromium.g:1208:2: ()
            // InternalBromium.g:1208:3: 
            {
            }

             after(grammarAccess.getSyntaxDefinitionAccess().getSyntaxDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntaxDefinition__Group__0__Impl"


    // $ANTLR start "rule__SyntaxDefinition__Group__1"
    // InternalBromium.g:1216:1: rule__SyntaxDefinition__Group__1 : rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 ;
    public final void rule__SyntaxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1220:1: ( rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 )
            // InternalBromium.g:1221:2: rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SyntaxDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SyntaxDefinition__Group__2();

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
    // $ANTLR end "rule__SyntaxDefinition__Group__1"


    // $ANTLR start "rule__SyntaxDefinition__Group__1__Impl"
    // InternalBromium.g:1228:1: rule__SyntaxDefinition__Group__1__Impl : ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) ;
    public final void rule__SyntaxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1232:1: ( ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) )
            // InternalBromium.g:1233:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            {
            // InternalBromium.g:1233:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            // InternalBromium.g:1234:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getContentAssignment_1()); 
            // InternalBromium.g:1235:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            // InternalBromium.g:1235:3: rule__SyntaxDefinition__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SyntaxDefinition__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxDefinitionAccess().getContentAssignment_1()); 

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
    // $ANTLR end "rule__SyntaxDefinition__Group__1__Impl"


    // $ANTLR start "rule__SyntaxDefinition__Group__2"
    // InternalBromium.g:1243:1: rule__SyntaxDefinition__Group__2 : rule__SyntaxDefinition__Group__2__Impl ;
    public final void rule__SyntaxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1247:1: ( rule__SyntaxDefinition__Group__2__Impl )
            // InternalBromium.g:1248:2: rule__SyntaxDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SyntaxDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__SyntaxDefinition__Group__2"


    // $ANTLR start "rule__SyntaxDefinition__Group__2__Impl"
    // InternalBromium.g:1254:1: rule__SyntaxDefinition__Group__2__Impl : ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) ;
    public final void rule__SyntaxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1258:1: ( ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) )
            // InternalBromium.g:1259:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            {
            // InternalBromium.g:1259:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            // InternalBromium.g:1260:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getParameterAssignment_2()); 
            // InternalBromium.g:1261:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBromium.g:1261:3: rule__SyntaxDefinition__ParameterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SyntaxDefinition__ParameterAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSyntaxDefinitionAccess().getParameterAssignment_2()); 

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
    // $ANTLR end "rule__SyntaxDefinition__Group__2__Impl"


    // $ANTLR start "rule__Precondition__Group__0"
    // InternalBromium.g:1270:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1274:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalBromium.g:1275:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Precondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1();

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
    // $ANTLR end "rule__Precondition__Group__0"


    // $ANTLR start "rule__Precondition__Group__0__Impl"
    // InternalBromium.g:1282:1: rule__Precondition__Group__0__Impl : ( 'when' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1286:1: ( ( 'when' ) )
            // InternalBromium.g:1287:1: ( 'when' )
            {
            // InternalBromium.g:1287:1: ( 'when' )
            // InternalBromium.g:1288:2: 'when'
            {
             before(grammarAccess.getPreconditionAccess().getWhenKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getWhenKeyword_0()); 

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
    // $ANTLR end "rule__Precondition__Group__0__Impl"


    // $ANTLR start "rule__Precondition__Group__1"
    // InternalBromium.g:1297:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1301:1: ( rule__Precondition__Group__1__Impl )
            // InternalBromium.g:1302:2: rule__Precondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1__Impl();

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
    // $ANTLR end "rule__Precondition__Group__1"


    // $ANTLR start "rule__Precondition__Group__1__Impl"
    // InternalBromium.g:1308:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ActionAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1312:1: ( ( ( rule__Precondition__ActionAssignment_1 ) ) )
            // InternalBromium.g:1313:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            {
            // InternalBromium.g:1313:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            // InternalBromium.g:1314:2: ( rule__Precondition__ActionAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getActionAssignment_1()); 
            // InternalBromium.g:1315:2: ( rule__Precondition__ActionAssignment_1 )
            // InternalBromium.g:1315:3: rule__Precondition__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getActionAssignment_1()); 

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
    // $ANTLR end "rule__Precondition__Group__1__Impl"


    // $ANTLR start "rule__Postcondition__Group__0"
    // InternalBromium.g:1324:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1328:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalBromium.g:1329:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Postcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__1();

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
    // $ANTLR end "rule__Postcondition__Group__0"


    // $ANTLR start "rule__Postcondition__Group__0__Impl"
    // InternalBromium.g:1336:1: rule__Postcondition__Group__0__Impl : ( 'then' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1340:1: ( ( 'then' ) )
            // InternalBromium.g:1341:1: ( 'then' )
            {
            // InternalBromium.g:1341:1: ( 'then' )
            // InternalBromium.g:1342:2: 'then'
            {
             before(grammarAccess.getPostconditionAccess().getThenKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getThenKeyword_0()); 

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
    // $ANTLR end "rule__Postcondition__Group__0__Impl"


    // $ANTLR start "rule__Postcondition__Group__1"
    // InternalBromium.g:1351:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1355:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalBromium.g:1356:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Postcondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__2();

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
    // $ANTLR end "rule__Postcondition__Group__1"


    // $ANTLR start "rule__Postcondition__Group__1__Impl"
    // InternalBromium.g:1363:1: rule__Postcondition__Group__1__Impl : ( 'make' ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1367:1: ( ( 'make' ) )
            // InternalBromium.g:1368:1: ( 'make' )
            {
            // InternalBromium.g:1368:1: ( 'make' )
            // InternalBromium.g:1369:2: 'make'
            {
             before(grammarAccess.getPostconditionAccess().getMakeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getMakeKeyword_1()); 

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
    // $ANTLR end "rule__Postcondition__Group__1__Impl"


    // $ANTLR start "rule__Postcondition__Group__2"
    // InternalBromium.g:1378:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1382:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalBromium.g:1383:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Postcondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__3();

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
    // $ANTLR end "rule__Postcondition__Group__2"


    // $ANTLR start "rule__Postcondition__Group__2__Impl"
    // InternalBromium.g:1390:1: rule__Postcondition__Group__2__Impl : ( 'sure' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1394:1: ( ( 'sure' ) )
            // InternalBromium.g:1395:1: ( 'sure' )
            {
            // InternalBromium.g:1395:1: ( 'sure' )
            // InternalBromium.g:1396:2: 'sure'
            {
             before(grammarAccess.getPostconditionAccess().getSureKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getSureKeyword_2()); 

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
    // $ANTLR end "rule__Postcondition__Group__2__Impl"


    // $ANTLR start "rule__Postcondition__Group__3"
    // InternalBromium.g:1405:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1409:1: ( rule__Postcondition__Group__3__Impl )
            // InternalBromium.g:1410:2: rule__Postcondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__3__Impl();

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
    // $ANTLR end "rule__Postcondition__Group__3"


    // $ANTLR start "rule__Postcondition__Group__3__Impl"
    // InternalBromium.g:1416:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__ActionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1420:1: ( ( ( rule__Postcondition__ActionAssignment_3 ) ) )
            // InternalBromium.g:1421:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            {
            // InternalBromium.g:1421:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            // InternalBromium.g:1422:2: ( rule__Postcondition__ActionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getActionAssignment_3()); 
            // InternalBromium.g:1423:2: ( rule__Postcondition__ActionAssignment_3 )
            // InternalBromium.g:1423:3: rule__Postcondition__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getActionAssignment_3()); 

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
    // $ANTLR end "rule__Postcondition__Group__3__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group__0"
    // InternalBromium.g:1432:1: rule__ExpectHttpRequest__Group__0 : rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 ;
    public final void rule__ExpectHttpRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1436:1: ( rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 )
            // InternalBromium.g:1437:2: rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ExpectHttpRequest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group__1();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group__0"


    // $ANTLR start "rule__ExpectHttpRequest__Group__0__Impl"
    // InternalBromium.g:1444:1: rule__ExpectHttpRequest__Group__0__Impl : ( () ) ;
    public final void rule__ExpectHttpRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1448:1: ( ( () ) )
            // InternalBromium.g:1449:1: ( () )
            {
            // InternalBromium.g:1449:1: ( () )
            // InternalBromium.g:1450:2: ()
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectHttpRequestAction_0()); 
            // InternalBromium.g:1451:2: ()
            // InternalBromium.g:1451:3: 
            {
            }

             after(grammarAccess.getExpectHttpRequestAccess().getExpectHttpRequestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpectHttpRequest__Group__0__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group__1"
    // InternalBromium.g:1459:1: rule__ExpectHttpRequest__Group__1 : rule__ExpectHttpRequest__Group__1__Impl ;
    public final void rule__ExpectHttpRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1463:1: ( rule__ExpectHttpRequest__Group__1__Impl )
            // InternalBromium.g:1464:2: rule__ExpectHttpRequest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group__1__Impl();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group__1"


    // $ANTLR start "rule__ExpectHttpRequest__Group__1__Impl"
    // InternalBromium.g:1470:1: rule__ExpectHttpRequest__Group__1__Impl : ( ( rule__ExpectHttpRequest__Group_1__0 ) ) ;
    public final void rule__ExpectHttpRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1474:1: ( ( ( rule__ExpectHttpRequest__Group_1__0 ) ) )
            // InternalBromium.g:1475:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            {
            // InternalBromium.g:1475:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            // InternalBromium.g:1476:2: ( rule__ExpectHttpRequest__Group_1__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup_1()); 
            // InternalBromium.g:1477:2: ( rule__ExpectHttpRequest__Group_1__0 )
            // InternalBromium.g:1477:3: rule__ExpectHttpRequest__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpectHttpRequestAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpectHttpRequest__Group__1__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__0"
    // InternalBromium.g:1486:1: rule__ExpectHttpRequest__Group_1__0 : rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 ;
    public final void rule__ExpectHttpRequest__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1490:1: ( rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 )
            // InternalBromium.g:1491:2: rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpectHttpRequest__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group_1__1();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__0"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__0__Impl"
    // InternalBromium.g:1498:1: rule__ExpectHttpRequest__Group_1__0__Impl : ( 'do' ) ;
    public final void rule__ExpectHttpRequest__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1502:1: ( ( 'do' ) )
            // InternalBromium.g:1503:1: ( 'do' )
            {
            // InternalBromium.g:1503:1: ( 'do' )
            // InternalBromium.g:1504:2: 'do'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getDoKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getDoKeyword_1_0()); 

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__0__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__1"
    // InternalBromium.g:1513:1: rule__ExpectHttpRequest__Group_1__1 : rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 ;
    public final void rule__ExpectHttpRequest__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1517:1: ( rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 )
            // InternalBromium.g:1518:2: rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpectHttpRequest__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group_1__2();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__1"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__1__Impl"
    // InternalBromium.g:1525:1: rule__ExpectHttpRequest__Group_1__1__Impl : ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) ;
    public final void rule__ExpectHttpRequest__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1529:1: ( ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) )
            // InternalBromium.g:1530:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            {
            // InternalBromium.g:1530:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            // InternalBromium.g:1531:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotAssignment_1_1()); 
            // InternalBromium.g:1532:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBromium.g:1532:3: rule__ExpectHttpRequest__NotAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpectHttpRequest__NotAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpectHttpRequestAccess().getNotAssignment_1_1()); 

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__1__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__2"
    // InternalBromium.g:1540:1: rule__ExpectHttpRequest__Group_1__2 : rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 ;
    public final void rule__ExpectHttpRequest__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1544:1: ( rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 )
            // InternalBromium.g:1545:2: rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__ExpectHttpRequest__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group_1__3();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__2"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__2__Impl"
    // InternalBromium.g:1552:1: rule__ExpectHttpRequest__Group_1__2__Impl : ( 'expect' ) ;
    public final void rule__ExpectHttpRequest__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1556:1: ( ( 'expect' ) )
            // InternalBromium.g:1557:1: ( 'expect' )
            {
            // InternalBromium.g:1557:1: ( 'expect' )
            // InternalBromium.g:1558:2: 'expect'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_1_2()); 

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__2__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__3"
    // InternalBromium.g:1567:1: rule__ExpectHttpRequest__Group_1__3 : rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 ;
    public final void rule__ExpectHttpRequest__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1571:1: ( rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 )
            // InternalBromium.g:1572:2: rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4
            {
            pushFollow(FOLLOW_20);
            rule__ExpectHttpRequest__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group_1__4();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__3"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__3__Impl"
    // InternalBromium.g:1579:1: rule__ExpectHttpRequest__Group_1__3__Impl : ( 'http' ) ;
    public final void rule__ExpectHttpRequest__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1583:1: ( ( 'http' ) )
            // InternalBromium.g:1584:1: ( 'http' )
            {
            // InternalBromium.g:1584:1: ( 'http' )
            // InternalBromium.g:1585:2: 'http'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getHttpKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getHttpKeyword_1_3()); 

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__3__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__4"
    // InternalBromium.g:1594:1: rule__ExpectHttpRequest__Group_1__4 : rule__ExpectHttpRequest__Group_1__4__Impl ;
    public final void rule__ExpectHttpRequest__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1598:1: ( rule__ExpectHttpRequest__Group_1__4__Impl )
            // InternalBromium.g:1599:2: rule__ExpectHttpRequest__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group_1__4__Impl();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__4"


    // $ANTLR start "rule__ExpectHttpRequest__Group_1__4__Impl"
    // InternalBromium.g:1605:1: rule__ExpectHttpRequest__Group_1__4__Impl : ( 'request' ) ;
    public final void rule__ExpectHttpRequest__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1609:1: ( ( 'request' ) )
            // InternalBromium.g:1610:1: ( 'request' )
            {
            // InternalBromium.g:1610:1: ( 'request' )
            // InternalBromium.g:1611:2: 'request'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getRequestKeyword_1_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getRequestKeyword_1_4()); 

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
    // $ANTLR end "rule__ExpectHttpRequest__Group_1__4__Impl"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__0"
    // InternalBromium.g:1621:1: rule__ElementByCssToBePresent__Group__0 : rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 ;
    public final void rule__ElementByCssToBePresent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1625:1: ( rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 )
            // InternalBromium.g:1626:2: rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ElementByCssToBePresent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__Group__1();

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__0"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__0__Impl"
    // InternalBromium.g:1633:1: rule__ElementByCssToBePresent__Group__0__Impl : ( 'element' ) ;
    public final void rule__ElementByCssToBePresent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1637:1: ( ( 'element' ) )
            // InternalBromium.g:1638:1: ( 'element' )
            {
            // InternalBromium.g:1638:1: ( 'element' )
            // InternalBromium.g:1639:2: 'element'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getElementKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getElementByCssToBePresentAccess().getElementKeyword_0()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__0__Impl"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__1"
    // InternalBromium.g:1648:1: rule__ElementByCssToBePresent__Group__1 : rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 ;
    public final void rule__ElementByCssToBePresent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1652:1: ( rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 )
            // InternalBromium.g:1653:2: rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ElementByCssToBePresent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__Group__2();

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__1"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__1__Impl"
    // InternalBromium.g:1660:1: rule__ElementByCssToBePresent__Group__1__Impl : ( 'with' ) ;
    public final void rule__ElementByCssToBePresent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1664:1: ( ( 'with' ) )
            // InternalBromium.g:1665:1: ( 'with' )
            {
            // InternalBromium.g:1665:1: ( 'with' )
            // InternalBromium.g:1666:2: 'with'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getWithKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getElementByCssToBePresentAccess().getWithKeyword_1()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__1__Impl"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__2"
    // InternalBromium.g:1675:1: rule__ElementByCssToBePresent__Group__2 : rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 ;
    public final void rule__ElementByCssToBePresent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1679:1: ( rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 )
            // InternalBromium.g:1680:2: rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ElementByCssToBePresent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__Group__3();

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__2"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__2__Impl"
    // InternalBromium.g:1687:1: rule__ElementByCssToBePresent__Group__2__Impl : ( 'css' ) ;
    public final void rule__ElementByCssToBePresent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1691:1: ( ( 'css' ) )
            // InternalBromium.g:1692:1: ( 'css' )
            {
            // InternalBromium.g:1692:1: ( 'css' )
            // InternalBromium.g:1693:2: 'css'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getCssKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getElementByCssToBePresentAccess().getCssKeyword_2()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__2__Impl"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__3"
    // InternalBromium.g:1702:1: rule__ElementByCssToBePresent__Group__3 : rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 ;
    public final void rule__ElementByCssToBePresent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1706:1: ( rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 )
            // InternalBromium.g:1707:2: rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ElementByCssToBePresent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__Group__4();

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__3"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__3__Impl"
    // InternalBromium.g:1714:1: rule__ElementByCssToBePresent__Group__3__Impl : ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1718:1: ( ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:1719:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:1719:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:1720:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:1721:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            // InternalBromium.g:1721:3: rule__ElementByCssToBePresent__ParameterNamesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__ParameterNamesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesAssignment_3()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__3__Impl"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__4"
    // InternalBromium.g:1729:1: rule__ElementByCssToBePresent__Group__4 : rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 ;
    public final void rule__ElementByCssToBePresent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1733:1: ( rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 )
            // InternalBromium.g:1734:2: rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ElementByCssToBePresent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__Group__5();

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__4"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__4__Impl"
    // InternalBromium.g:1741:1: rule__ElementByCssToBePresent__Group__4__Impl : ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1745:1: ( ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:1746:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:1746:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:1747:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:1748:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            // InternalBromium.g:1748:3: rule__ElementByCssToBePresent__ParameterValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__ParameterValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesAssignment_4()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__4__Impl"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__5"
    // InternalBromium.g:1756:1: rule__ElementByCssToBePresent__Group__5 : rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 ;
    public final void rule__ElementByCssToBePresent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1760:1: ( rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 )
            // InternalBromium.g:1761:2: rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__ElementByCssToBePresent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__Group__6();

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__5"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__5__Impl"
    // InternalBromium.g:1768:1: rule__ElementByCssToBePresent__Group__5__Impl : ( 'is' ) ;
    public final void rule__ElementByCssToBePresent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1772:1: ( ( 'is' ) )
            // InternalBromium.g:1773:1: ( 'is' )
            {
            // InternalBromium.g:1773:1: ( 'is' )
            // InternalBromium.g:1774:2: 'is'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getIsKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getElementByCssToBePresentAccess().getIsKeyword_5()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__5__Impl"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__6"
    // InternalBromium.g:1783:1: rule__ElementByCssToBePresent__Group__6 : rule__ElementByCssToBePresent__Group__6__Impl ;
    public final void rule__ElementByCssToBePresent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1787:1: ( rule__ElementByCssToBePresent__Group__6__Impl )
            // InternalBromium.g:1788:2: rule__ElementByCssToBePresent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementByCssToBePresent__Group__6__Impl();

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__6"


    // $ANTLR start "rule__ElementByCssToBePresent__Group__6__Impl"
    // InternalBromium.g:1794:1: rule__ElementByCssToBePresent__Group__6__Impl : ( 'present' ) ;
    public final void rule__ElementByCssToBePresent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1798:1: ( ( 'present' ) )
            // InternalBromium.g:1799:1: ( 'present' )
            {
            // InternalBromium.g:1799:1: ( 'present' )
            // InternalBromium.g:1800:2: 'present'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getPresentKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getElementByCssToBePresentAccess().getPresentKeyword_6()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__Group__6__Impl"


    // $ANTLR start "rule__ClickCssSelector__Group__0"
    // InternalBromium.g:1810:1: rule__ClickCssSelector__Group__0 : rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 ;
    public final void rule__ClickCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1814:1: ( rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 )
            // InternalBromium.g:1815:2: rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ClickCssSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__Group__1();

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
    // $ANTLR end "rule__ClickCssSelector__Group__0"


    // $ANTLR start "rule__ClickCssSelector__Group__0__Impl"
    // InternalBromium.g:1822:1: rule__ClickCssSelector__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1826:1: ( ( 'click' ) )
            // InternalBromium.g:1827:1: ( 'click' )
            {
            // InternalBromium.g:1827:1: ( 'click' )
            // InternalBromium.g:1828:2: 'click'
            {
             before(grammarAccess.getClickCssSelectorAccess().getClickKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClickCssSelectorAccess().getClickKeyword_0()); 

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
    // $ANTLR end "rule__ClickCssSelector__Group__0__Impl"


    // $ANTLR start "rule__ClickCssSelector__Group__1"
    // InternalBromium.g:1837:1: rule__ClickCssSelector__Group__1 : rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 ;
    public final void rule__ClickCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1841:1: ( rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 )
            // InternalBromium.g:1842:2: rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ClickCssSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__Group__2();

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
    // $ANTLR end "rule__ClickCssSelector__Group__1"


    // $ANTLR start "rule__ClickCssSelector__Group__1__Impl"
    // InternalBromium.g:1849:1: rule__ClickCssSelector__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1853:1: ( ( 'on' ) )
            // InternalBromium.g:1854:1: ( 'on' )
            {
            // InternalBromium.g:1854:1: ( 'on' )
            // InternalBromium.g:1855:2: 'on'
            {
             before(grammarAccess.getClickCssSelectorAccess().getOnKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClickCssSelectorAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__ClickCssSelector__Group__1__Impl"


    // $ANTLR start "rule__ClickCssSelector__Group__2"
    // InternalBromium.g:1864:1: rule__ClickCssSelector__Group__2 : rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 ;
    public final void rule__ClickCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1868:1: ( rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 )
            // InternalBromium.g:1869:2: rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ClickCssSelector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__Group__3();

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
    // $ANTLR end "rule__ClickCssSelector__Group__2"


    // $ANTLR start "rule__ClickCssSelector__Group__2__Impl"
    // InternalBromium.g:1876:1: rule__ClickCssSelector__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1880:1: ( ( 'element' ) )
            // InternalBromium.g:1881:1: ( 'element' )
            {
            // InternalBromium.g:1881:1: ( 'element' )
            // InternalBromium.g:1882:2: 'element'
            {
             before(grammarAccess.getClickCssSelectorAccess().getElementKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClickCssSelectorAccess().getElementKeyword_2()); 

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
    // $ANTLR end "rule__ClickCssSelector__Group__2__Impl"


    // $ANTLR start "rule__ClickCssSelector__Group__3"
    // InternalBromium.g:1891:1: rule__ClickCssSelector__Group__3 : rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 ;
    public final void rule__ClickCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1895:1: ( rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 )
            // InternalBromium.g:1896:2: rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ClickCssSelector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__Group__4();

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
    // $ANTLR end "rule__ClickCssSelector__Group__3"


    // $ANTLR start "rule__ClickCssSelector__Group__3__Impl"
    // InternalBromium.g:1903:1: rule__ClickCssSelector__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1907:1: ( ( 'with' ) )
            // InternalBromium.g:1908:1: ( 'with' )
            {
            // InternalBromium.g:1908:1: ( 'with' )
            // InternalBromium.g:1909:2: 'with'
            {
             before(grammarAccess.getClickCssSelectorAccess().getWithKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClickCssSelectorAccess().getWithKeyword_3()); 

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
    // $ANTLR end "rule__ClickCssSelector__Group__3__Impl"


    // $ANTLR start "rule__ClickCssSelector__Group__4"
    // InternalBromium.g:1918:1: rule__ClickCssSelector__Group__4 : rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 ;
    public final void rule__ClickCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1922:1: ( rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 )
            // InternalBromium.g:1923:2: rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ClickCssSelector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__Group__5();

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
    // $ANTLR end "rule__ClickCssSelector__Group__4"


    // $ANTLR start "rule__ClickCssSelector__Group__4__Impl"
    // InternalBromium.g:1930:1: rule__ClickCssSelector__Group__4__Impl : ( 'css' ) ;
    public final void rule__ClickCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1934:1: ( ( 'css' ) )
            // InternalBromium.g:1935:1: ( 'css' )
            {
            // InternalBromium.g:1935:1: ( 'css' )
            // InternalBromium.g:1936:2: 'css'
            {
             before(grammarAccess.getClickCssSelectorAccess().getCssKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClickCssSelectorAccess().getCssKeyword_4()); 

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
    // $ANTLR end "rule__ClickCssSelector__Group__4__Impl"


    // $ANTLR start "rule__ClickCssSelector__Group__5"
    // InternalBromium.g:1945:1: rule__ClickCssSelector__Group__5 : rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 ;
    public final void rule__ClickCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1949:1: ( rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 )
            // InternalBromium.g:1950:2: rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ClickCssSelector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__Group__6();

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
    // $ANTLR end "rule__ClickCssSelector__Group__5"


    // $ANTLR start "rule__ClickCssSelector__Group__5__Impl"
    // InternalBromium.g:1957:1: rule__ClickCssSelector__Group__5__Impl : ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) ;
    public final void rule__ClickCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1961:1: ( ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) )
            // InternalBromium.g:1962:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            {
            // InternalBromium.g:1962:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            // InternalBromium.g:1963:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesAssignment_5()); 
            // InternalBromium.g:1964:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            // InternalBromium.g:1964:3: rule__ClickCssSelector__ParameterNamesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__ParameterNamesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClickCssSelectorAccess().getParameterNamesAssignment_5()); 

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
    // $ANTLR end "rule__ClickCssSelector__Group__5__Impl"


    // $ANTLR start "rule__ClickCssSelector__Group__6"
    // InternalBromium.g:1972:1: rule__ClickCssSelector__Group__6 : rule__ClickCssSelector__Group__6__Impl ;
    public final void rule__ClickCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1976:1: ( rule__ClickCssSelector__Group__6__Impl )
            // InternalBromium.g:1977:2: rule__ClickCssSelector__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__Group__6__Impl();

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
    // $ANTLR end "rule__ClickCssSelector__Group__6"


    // $ANTLR start "rule__ClickCssSelector__Group__6__Impl"
    // InternalBromium.g:1983:1: rule__ClickCssSelector__Group__6__Impl : ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) ;
    public final void rule__ClickCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1987:1: ( ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) )
            // InternalBromium.g:1988:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            {
            // InternalBromium.g:1988:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            // InternalBromium.g:1989:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterValuesAssignment_6()); 
            // InternalBromium.g:1990:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            // InternalBromium.g:1990:3: rule__ClickCssSelector__ParameterValuesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ClickCssSelector__ParameterValuesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getClickCssSelectorAccess().getParameterValuesAssignment_6()); 

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
    // $ANTLR end "rule__ClickCssSelector__Group__6__Impl"


    // $ANTLR start "rule__PageLoad__Group__0"
    // InternalBromium.g:1999:1: rule__PageLoad__Group__0 : rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 ;
    public final void rule__PageLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2003:1: ( rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 )
            // InternalBromium.g:2004:2: rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__PageLoad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageLoad__Group__1();

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
    // $ANTLR end "rule__PageLoad__Group__0"


    // $ANTLR start "rule__PageLoad__Group__0__Impl"
    // InternalBromium.g:2011:1: rule__PageLoad__Group__0__Impl : ( 'load' ) ;
    public final void rule__PageLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2015:1: ( ( 'load' ) )
            // InternalBromium.g:2016:1: ( 'load' )
            {
            // InternalBromium.g:2016:1: ( 'load' )
            // InternalBromium.g:2017:2: 'load'
            {
             before(grammarAccess.getPageLoadAccess().getLoadKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPageLoadAccess().getLoadKeyword_0()); 

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
    // $ANTLR end "rule__PageLoad__Group__0__Impl"


    // $ANTLR start "rule__PageLoad__Group__1"
    // InternalBromium.g:2026:1: rule__PageLoad__Group__1 : rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 ;
    public final void rule__PageLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2030:1: ( rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 )
            // InternalBromium.g:2031:2: rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__PageLoad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageLoad__Group__2();

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
    // $ANTLR end "rule__PageLoad__Group__1"


    // $ANTLR start "rule__PageLoad__Group__1__Impl"
    // InternalBromium.g:2038:1: rule__PageLoad__Group__1__Impl : ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) ;
    public final void rule__PageLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2042:1: ( ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:2043:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:2043:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:2044:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:2045:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            // InternalBromium.g:2045:3: rule__PageLoad__ParameterNamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PageLoad__ParameterNamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageLoadAccess().getParameterNamesAssignment_1()); 

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
    // $ANTLR end "rule__PageLoad__Group__1__Impl"


    // $ANTLR start "rule__PageLoad__Group__2"
    // InternalBromium.g:2053:1: rule__PageLoad__Group__2 : rule__PageLoad__Group__2__Impl ;
    public final void rule__PageLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2057:1: ( rule__PageLoad__Group__2__Impl )
            // InternalBromium.g:2058:2: rule__PageLoad__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageLoad__Group__2__Impl();

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
    // $ANTLR end "rule__PageLoad__Group__2"


    // $ANTLR start "rule__PageLoad__Group__2__Impl"
    // InternalBromium.g:2064:1: rule__PageLoad__Group__2__Impl : ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) ;
    public final void rule__PageLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2068:1: ( ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:2069:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:2069:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:2070:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:2071:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            // InternalBromium.g:2071:3: rule__PageLoad__ParameterValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PageLoad__ParameterValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPageLoadAccess().getParameterValuesAssignment_2()); 

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
    // $ANTLR end "rule__PageLoad__Group__2__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__0"
    // InternalBromium.g:2080:1: rule__TypeTextInElementFoundByCssSelector__Group__0 : rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2084:1: ( rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 )
            // InternalBromium.g:2085:2: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__TypeTextInElementFoundByCssSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__1();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__0"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__0__Impl"
    // InternalBromium.g:2092:1: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2096:1: ( ( 'type' ) )
            // InternalBromium.g:2097:1: ( 'type' )
            {
            // InternalBromium.g:2097:1: ( 'type' )
            // InternalBromium.g:2098:2: 'type'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__0__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__1"
    // InternalBromium.g:2107:1: rule__TypeTextInElementFoundByCssSelector__Group__1 : rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2111:1: ( rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 )
            // InternalBromium.g:2112:2: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__TypeTextInElementFoundByCssSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__2();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__1"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__1__Impl"
    // InternalBromium.g:2119:1: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2123:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:2124:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:2124:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:2125:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:2126:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:2126:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_1()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__1__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__2"
    // InternalBromium.g:2134:1: rule__TypeTextInElementFoundByCssSelector__Group__2 : rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2138:1: ( rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 )
            // InternalBromium.g:2139:2: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__TypeTextInElementFoundByCssSelector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__3();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__2"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__2__Impl"
    // InternalBromium.g:2146:1: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2150:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:2151:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:2151:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:2152:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:2153:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:2153:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_2()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__2__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__3"
    // InternalBromium.g:2161:1: rule__TypeTextInElementFoundByCssSelector__Group__3 : rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2165:1: ( rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 )
            // InternalBromium.g:2166:2: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__TypeTextInElementFoundByCssSelector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__4();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__3"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__3__Impl"
    // InternalBromium.g:2173:1: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl : ( 'in' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2177:1: ( ( 'in' ) )
            // InternalBromium.g:2178:1: ( 'in' )
            {
            // InternalBromium.g:2178:1: ( 'in' )
            // InternalBromium.g:2179:2: 'in'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_3()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__3__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__4"
    // InternalBromium.g:2188:1: rule__TypeTextInElementFoundByCssSelector__Group__4 : rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2192:1: ( rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 )
            // InternalBromium.g:2193:2: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__TypeTextInElementFoundByCssSelector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__5();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__4"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__4__Impl"
    // InternalBromium.g:2200:1: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl : ( 'element' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2204:1: ( ( 'element' ) )
            // InternalBromium.g:2205:1: ( 'element' )
            {
            // InternalBromium.g:2205:1: ( 'element' )
            // InternalBromium.g:2206:2: 'element'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_4()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__4__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__5"
    // InternalBromium.g:2215:1: rule__TypeTextInElementFoundByCssSelector__Group__5 : rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2219:1: ( rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 )
            // InternalBromium.g:2220:2: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__TypeTextInElementFoundByCssSelector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__6();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__5"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__5__Impl"
    // InternalBromium.g:2227:1: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl : ( 'with' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2231:1: ( ( 'with' ) )
            // InternalBromium.g:2232:1: ( 'with' )
            {
            // InternalBromium.g:2232:1: ( 'with' )
            // InternalBromium.g:2233:2: 'with'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_5()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__5__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__6"
    // InternalBromium.g:2242:1: rule__TypeTextInElementFoundByCssSelector__Group__6 : rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2246:1: ( rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 )
            // InternalBromium.g:2247:2: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__TypeTextInElementFoundByCssSelector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__7();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__6"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__6__Impl"
    // InternalBromium.g:2254:1: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl : ( 'css' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2258:1: ( ( 'css' ) )
            // InternalBromium.g:2259:1: ( 'css' )
            {
            // InternalBromium.g:2259:1: ( 'css' )
            // InternalBromium.g:2260:2: 'css'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_6()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__6__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__7"
    // InternalBromium.g:2269:1: rule__TypeTextInElementFoundByCssSelector__Group__7 : rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2273:1: ( rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 )
            // InternalBromium.g:2274:2: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__TypeTextInElementFoundByCssSelector__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__8();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__7"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__7__Impl"
    // InternalBromium.g:2281:1: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2285:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:2286:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:2286:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:2287:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:2288:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            // InternalBromium.g:2288:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_7()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__7__Impl"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__8"
    // InternalBromium.g:2296:1: rule__TypeTextInElementFoundByCssSelector__Group__8 : rule__TypeTextInElementFoundByCssSelector__Group__8__Impl ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2300:1: ( rule__TypeTextInElementFoundByCssSelector__Group__8__Impl )
            // InternalBromium.g:2301:2: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__8__Impl();

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__8"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__Group__8__Impl"
    // InternalBromium.g:2307:1: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2311:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:2312:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:2312:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:2313:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:2314:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            // InternalBromium.g:2314:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_8()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__Group__8__Impl"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__0"
    // InternalBromium.g:2323:1: rule__TextOfElementWithCssSelectorToBe__Group__0 : rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2327:1: ( rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 )
            // InternalBromium.g:2328:2: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TextOfElementWithCssSelectorToBe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__1();

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__0"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__0__Impl"
    // InternalBromium.g:2335:1: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl : ( 'element' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2339:1: ( ( 'element' ) )
            // InternalBromium.g:2340:1: ( 'element' )
            {
            // InternalBromium.g:2340:1: ( 'element' )
            // InternalBromium.g:2341:2: 'element'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getElementKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getElementKeyword_0()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__0__Impl"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__1"
    // InternalBromium.g:2350:1: rule__TextOfElementWithCssSelectorToBe__Group__1 : rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2354:1: ( rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 )
            // InternalBromium.g:2355:2: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__TextOfElementWithCssSelectorToBe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__2();

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__1"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__1__Impl"
    // InternalBromium.g:2362:1: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl : ( 'with' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2366:1: ( ( 'with' ) )
            // InternalBromium.g:2367:1: ( 'with' )
            {
            // InternalBromium.g:2367:1: ( 'with' )
            // InternalBromium.g:2368:2: 'with'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getWithKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getWithKeyword_1()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__1__Impl"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__2"
    // InternalBromium.g:2377:1: rule__TextOfElementWithCssSelectorToBe__Group__2 : rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2381:1: ( rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 )
            // InternalBromium.g:2382:2: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__TextOfElementWithCssSelectorToBe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__3();

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__2"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__2__Impl"
    // InternalBromium.g:2389:1: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl : ( 'css' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2393:1: ( ( 'css' ) )
            // InternalBromium.g:2394:1: ( 'css' )
            {
            // InternalBromium.g:2394:1: ( 'css' )
            // InternalBromium.g:2395:2: 'css'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getCssKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getCssKeyword_2()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__2__Impl"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__3"
    // InternalBromium.g:2404:1: rule__TextOfElementWithCssSelectorToBe__Group__3 : rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2408:1: ( rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 )
            // InternalBromium.g:2409:2: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__TextOfElementWithCssSelectorToBe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__4();

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__3"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__3__Impl"
    // InternalBromium.g:2416:1: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2420:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:2421:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:2421:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:2422:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:2423:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            // InternalBromium.g:2423:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_3()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__3__Impl"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__4"
    // InternalBromium.g:2431:1: rule__TextOfElementWithCssSelectorToBe__Group__4 : rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2435:1: ( rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 )
            // InternalBromium.g:2436:2: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__TextOfElementWithCssSelectorToBe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__5();

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__4"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__4__Impl"
    // InternalBromium.g:2443:1: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2447:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:2448:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:2448:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:2449:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:2450:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            // InternalBromium.g:2450:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_4()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__4__Impl"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__5"
    // InternalBromium.g:2458:1: rule__TextOfElementWithCssSelectorToBe__Group__5 : rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2462:1: ( rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 )
            // InternalBromium.g:2463:2: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__TextOfElementWithCssSelectorToBe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__6();

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__5"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__5__Impl"
    // InternalBromium.g:2470:1: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl : ( 'has' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2474:1: ( ( 'has' ) )
            // InternalBromium.g:2475:1: ( 'has' )
            {
            // InternalBromium.g:2475:1: ( 'has' )
            // InternalBromium.g:2476:2: 'has'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getHasKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getHasKeyword_5()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__5__Impl"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__6"
    // InternalBromium.g:2485:1: rule__TextOfElementWithCssSelectorToBe__Group__6 : rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2489:1: ( rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 )
            // InternalBromium.g:2490:2: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__TextOfElementWithCssSelectorToBe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__7();

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__6"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__6__Impl"
    // InternalBromium.g:2497:1: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2501:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) )
            // InternalBromium.g:2502:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            {
            // InternalBromium.g:2502:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            // InternalBromium.g:2503:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_6()); 
            // InternalBromium.g:2504:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            // InternalBromium.g:2504:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_6()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__6__Impl"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__7"
    // InternalBromium.g:2512:1: rule__TextOfElementWithCssSelectorToBe__Group__7 : rule__TextOfElementWithCssSelectorToBe__Group__7__Impl ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2516:1: ( rule__TextOfElementWithCssSelectorToBe__Group__7__Impl )
            // InternalBromium.g:2517:2: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__Group__7__Impl();

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__7"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__Group__7__Impl"
    // InternalBromium.g:2523:1: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2527:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) )
            // InternalBromium.g:2528:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            {
            // InternalBromium.g:2528:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            // InternalBromium.g:2529:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_7()); 
            // InternalBromium.g:2530:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            // InternalBromium.g:2530:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_7()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__Group__7__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__0"
    // InternalBromium.g:2539:1: rule__ClickClassByText__Group__0 : rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 ;
    public final void rule__ClickClassByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2543:1: ( rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 )
            // InternalBromium.g:2544:2: rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ClickClassByText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__1();

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
    // $ANTLR end "rule__ClickClassByText__Group__0"


    // $ANTLR start "rule__ClickClassByText__Group__0__Impl"
    // InternalBromium.g:2551:1: rule__ClickClassByText__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickClassByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2555:1: ( ( 'click' ) )
            // InternalBromium.g:2556:1: ( 'click' )
            {
            // InternalBromium.g:2556:1: ( 'click' )
            // InternalBromium.g:2557:2: 'click'
            {
             before(grammarAccess.getClickClassByTextAccess().getClickKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClickClassByTextAccess().getClickKeyword_0()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__0__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__1"
    // InternalBromium.g:2566:1: rule__ClickClassByText__Group__1 : rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 ;
    public final void rule__ClickClassByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2570:1: ( rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 )
            // InternalBromium.g:2571:2: rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ClickClassByText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__2();

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
    // $ANTLR end "rule__ClickClassByText__Group__1"


    // $ANTLR start "rule__ClickClassByText__Group__1__Impl"
    // InternalBromium.g:2578:1: rule__ClickClassByText__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickClassByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2582:1: ( ( 'on' ) )
            // InternalBromium.g:2583:1: ( 'on' )
            {
            // InternalBromium.g:2583:1: ( 'on' )
            // InternalBromium.g:2584:2: 'on'
            {
             before(grammarAccess.getClickClassByTextAccess().getOnKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClickClassByTextAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__1__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__2"
    // InternalBromium.g:2593:1: rule__ClickClassByText__Group__2 : rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 ;
    public final void rule__ClickClassByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2597:1: ( rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 )
            // InternalBromium.g:2598:2: rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ClickClassByText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__3();

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
    // $ANTLR end "rule__ClickClassByText__Group__2"


    // $ANTLR start "rule__ClickClassByText__Group__2__Impl"
    // InternalBromium.g:2605:1: rule__ClickClassByText__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickClassByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2609:1: ( ( 'element' ) )
            // InternalBromium.g:2610:1: ( 'element' )
            {
            // InternalBromium.g:2610:1: ( 'element' )
            // InternalBromium.g:2611:2: 'element'
            {
             before(grammarAccess.getClickClassByTextAccess().getElementKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClickClassByTextAccess().getElementKeyword_2()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__2__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__3"
    // InternalBromium.g:2620:1: rule__ClickClassByText__Group__3 : rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 ;
    public final void rule__ClickClassByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2624:1: ( rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 )
            // InternalBromium.g:2625:2: rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__ClickClassByText__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__4();

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
    // $ANTLR end "rule__ClickClassByText__Group__3"


    // $ANTLR start "rule__ClickClassByText__Group__3__Impl"
    // InternalBromium.g:2632:1: rule__ClickClassByText__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickClassByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2636:1: ( ( 'with' ) )
            // InternalBromium.g:2637:1: ( 'with' )
            {
            // InternalBromium.g:2637:1: ( 'with' )
            // InternalBromium.g:2638:2: 'with'
            {
             before(grammarAccess.getClickClassByTextAccess().getWithKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClickClassByTextAccess().getWithKeyword_3()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__3__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__4"
    // InternalBromium.g:2647:1: rule__ClickClassByText__Group__4 : rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 ;
    public final void rule__ClickClassByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2651:1: ( rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 )
            // InternalBromium.g:2652:2: rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ClickClassByText__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__5();

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
    // $ANTLR end "rule__ClickClassByText__Group__4"


    // $ANTLR start "rule__ClickClassByText__Group__4__Impl"
    // InternalBromium.g:2659:1: rule__ClickClassByText__Group__4__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickClassByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2663:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:2664:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:2664:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:2665:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:2666:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            // InternalBromium.g:2666:3: rule__ClickClassByText__ParameterNamesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ClickClassByText__ParameterNamesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_4()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__4__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__5"
    // InternalBromium.g:2674:1: rule__ClickClassByText__Group__5 : rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 ;
    public final void rule__ClickClassByText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2678:1: ( rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 )
            // InternalBromium.g:2679:2: rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__ClickClassByText__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__6();

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
    // $ANTLR end "rule__ClickClassByText__Group__5"


    // $ANTLR start "rule__ClickClassByText__Group__5__Impl"
    // InternalBromium.g:2686:1: rule__ClickClassByText__Group__5__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickClassByText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2690:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:2691:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:2691:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:2692:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:2693:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            // InternalBromium.g:2693:3: rule__ClickClassByText__ParameterValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ClickClassByText__ParameterValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_5()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__5__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__6"
    // InternalBromium.g:2701:1: rule__ClickClassByText__Group__6 : rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 ;
    public final void rule__ClickClassByText__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2705:1: ( rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 )
            // InternalBromium.g:2706:2: rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__ClickClassByText__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__7();

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
    // $ANTLR end "rule__ClickClassByText__Group__6"


    // $ANTLR start "rule__ClickClassByText__Group__6__Impl"
    // InternalBromium.g:2713:1: rule__ClickClassByText__Group__6__Impl : ( 'and' ) ;
    public final void rule__ClickClassByText__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2717:1: ( ( 'and' ) )
            // InternalBromium.g:2718:1: ( 'and' )
            {
            // InternalBromium.g:2718:1: ( 'and' )
            // InternalBromium.g:2719:2: 'and'
            {
             before(grammarAccess.getClickClassByTextAccess().getAndKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getClickClassByTextAccess().getAndKeyword_6()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__6__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__7"
    // InternalBromium.g:2728:1: rule__ClickClassByText__Group__7 : rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 ;
    public final void rule__ClickClassByText__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2732:1: ( rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 )
            // InternalBromium.g:2733:2: rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__ClickClassByText__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__8();

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
    // $ANTLR end "rule__ClickClassByText__Group__7"


    // $ANTLR start "rule__ClickClassByText__Group__7__Impl"
    // InternalBromium.g:2740:1: rule__ClickClassByText__Group__7__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) ;
    public final void rule__ClickClassByText__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2744:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:2745:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:2745:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:2746:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:2747:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            // InternalBromium.g:2747:3: rule__ClickClassByText__ParameterNamesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ClickClassByText__ParameterNamesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_7()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__7__Impl"


    // $ANTLR start "rule__ClickClassByText__Group__8"
    // InternalBromium.g:2755:1: rule__ClickClassByText__Group__8 : rule__ClickClassByText__Group__8__Impl ;
    public final void rule__ClickClassByText__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2759:1: ( rule__ClickClassByText__Group__8__Impl )
            // InternalBromium.g:2760:2: rule__ClickClassByText__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickClassByText__Group__8__Impl();

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
    // $ANTLR end "rule__ClickClassByText__Group__8"


    // $ANTLR start "rule__ClickClassByText__Group__8__Impl"
    // InternalBromium.g:2766:1: rule__ClickClassByText__Group__8__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) ;
    public final void rule__ClickClassByText__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2770:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:2771:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:2771:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:2772:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:2773:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            // InternalBromium.g:2773:3: rule__ClickClassByText__ParameterValuesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ClickClassByText__ParameterValuesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_8()); 

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
    // $ANTLR end "rule__ClickClassByText__Group__8__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__0"
    // InternalBromium.g:2782:1: rule__SetVariableToTextOfElementWithCssSelector__Group__0 : rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2786:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1 )
            // InternalBromium.g:2787:2: rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__1();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__0"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl"
    // InternalBromium.g:2794:1: rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2798:1: ( ( 'set' ) )
            // InternalBromium.g:2799:1: ( 'set' )
            {
            // InternalBromium.g:2799:1: ( 'set' )
            // InternalBromium.g:2800:2: 'set'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getSetKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getSetKeyword_0()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__1"
    // InternalBromium.g:2809:1: rule__SetVariableToTextOfElementWithCssSelector__Group__1 : rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2813:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2 )
            // InternalBromium.g:2814:2: rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__2();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__1"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl"
    // InternalBromium.g:2821:1: rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2825:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:2826:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:2826:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:2827:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:2828:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:2828:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_1()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__2"
    // InternalBromium.g:2836:1: rule__SetVariableToTextOfElementWithCssSelector__Group__2 : rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2840:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3 )
            // InternalBromium.g:2841:2: rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__3();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__2"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl"
    // InternalBromium.g:2848:1: rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2852:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:2853:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:2853:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:2854:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:2855:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:2855:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_2()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__3"
    // InternalBromium.g:2863:1: rule__SetVariableToTextOfElementWithCssSelector__Group__3 : rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2867:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4 )
            // InternalBromium.g:2868:2: rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__4();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__3"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl"
    // InternalBromium.g:2875:1: rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl : ( 'to' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2879:1: ( ( 'to' ) )
            // InternalBromium.g:2880:1: ( 'to' )
            {
            // InternalBromium.g:2880:1: ( 'to' )
            // InternalBromium.g:2881:2: 'to'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getToKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getToKeyword_3()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__4"
    // InternalBromium.g:2890:1: rule__SetVariableToTextOfElementWithCssSelector__Group__4 : rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2894:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5 )
            // InternalBromium.g:2895:2: rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__5();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__4"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl"
    // InternalBromium.g:2902:1: rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl : ( 'the' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2906:1: ( ( 'the' ) )
            // InternalBromium.g:2907:1: ( 'the' )
            {
            // InternalBromium.g:2907:1: ( 'the' )
            // InternalBromium.g:2908:2: 'the'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTheKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTheKeyword_4()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__5"
    // InternalBromium.g:2917:1: rule__SetVariableToTextOfElementWithCssSelector__Group__5 : rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2921:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6 )
            // InternalBromium.g:2922:2: rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__6();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__5"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl"
    // InternalBromium.g:2929:1: rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl : ( 'text' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2933:1: ( ( 'text' ) )
            // InternalBromium.g:2934:1: ( 'text' )
            {
            // InternalBromium.g:2934:1: ( 'text' )
            // InternalBromium.g:2935:2: 'text'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTextKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTextKeyword_5()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__6"
    // InternalBromium.g:2944:1: rule__SetVariableToTextOfElementWithCssSelector__Group__6 : rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2948:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7 )
            // InternalBromium.g:2949:2: rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__7();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__6"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl"
    // InternalBromium.g:2956:1: rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl : ( 'of' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2960:1: ( ( 'of' ) )
            // InternalBromium.g:2961:1: ( 'of' )
            {
            // InternalBromium.g:2961:1: ( 'of' )
            // InternalBromium.g:2962:2: 'of'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getOfKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getOfKeyword_6()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__7"
    // InternalBromium.g:2971:1: rule__SetVariableToTextOfElementWithCssSelector__Group__7 : rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2975:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8 )
            // InternalBromium.g:2976:2: rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__8();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__7"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl"
    // InternalBromium.g:2983:1: rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl : ( 'element' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2987:1: ( ( 'element' ) )
            // InternalBromium.g:2988:1: ( 'element' )
            {
            // InternalBromium.g:2988:1: ( 'element' )
            // InternalBromium.g:2989:2: 'element'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getElementKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getElementKeyword_7()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__8"
    // InternalBromium.g:2998:1: rule__SetVariableToTextOfElementWithCssSelector__Group__8 : rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3002:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9 )
            // InternalBromium.g:3003:2: rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__9();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__8"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl"
    // InternalBromium.g:3010:1: rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl : ( 'with' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3014:1: ( ( 'with' ) )
            // InternalBromium.g:3015:1: ( 'with' )
            {
            // InternalBromium.g:3015:1: ( 'with' )
            // InternalBromium.g:3016:2: 'with'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getWithKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getWithKeyword_8()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__9"
    // InternalBromium.g:3025:1: rule__SetVariableToTextOfElementWithCssSelector__Group__9 : rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3029:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10 )
            // InternalBromium.g:3030:2: rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__10();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__9"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl"
    // InternalBromium.g:3037:1: rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl : ( 'css' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3041:1: ( ( 'css' ) )
            // InternalBromium.g:3042:1: ( 'css' )
            {
            // InternalBromium.g:3042:1: ( 'css' )
            // InternalBromium.g:3043:2: 'css'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getCssKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getCssKeyword_9()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__10"
    // InternalBromium.g:3052:1: rule__SetVariableToTextOfElementWithCssSelector__Group__10 : rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3056:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11 )
            // InternalBromium.g:3057:2: rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__11();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__10"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl"
    // InternalBromium.g:3064:1: rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3068:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) ) )
            // InternalBromium.g:3069:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) )
            {
            // InternalBromium.g:3069:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) )
            // InternalBromium.g:3070:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_10()); 
            // InternalBromium.g:3071:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 )
            // InternalBromium.g:3071:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_10()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__11"
    // InternalBromium.g:3079:1: rule__SetVariableToTextOfElementWithCssSelector__Group__11 : rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3083:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl )
            // InternalBromium.g:3084:2: rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl();

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__11"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl"
    // InternalBromium.g:3090:1: rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3094:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) ) )
            // InternalBromium.g:3095:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) )
            {
            // InternalBromium.g:3095:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) )
            // InternalBromium.g:3096:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_11()); 
            // InternalBromium.g:3097:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 )
            // InternalBromium.g:3097:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_11()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl"


    // $ANTLR start "rule__ClickDataId__Group__0"
    // InternalBromium.g:3106:1: rule__ClickDataId__Group__0 : rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 ;
    public final void rule__ClickDataId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3110:1: ( rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 )
            // InternalBromium.g:3111:2: rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ClickDataId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickDataId__Group__1();

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
    // $ANTLR end "rule__ClickDataId__Group__0"


    // $ANTLR start "rule__ClickDataId__Group__0__Impl"
    // InternalBromium.g:3118:1: rule__ClickDataId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickDataId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3122:1: ( ( 'click' ) )
            // InternalBromium.g:3123:1: ( 'click' )
            {
            // InternalBromium.g:3123:1: ( 'click' )
            // InternalBromium.g:3124:2: 'click'
            {
             before(grammarAccess.getClickDataIdAccess().getClickKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClickDataIdAccess().getClickKeyword_0()); 

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
    // $ANTLR end "rule__ClickDataId__Group__0__Impl"


    // $ANTLR start "rule__ClickDataId__Group__1"
    // InternalBromium.g:3133:1: rule__ClickDataId__Group__1 : rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 ;
    public final void rule__ClickDataId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3137:1: ( rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 )
            // InternalBromium.g:3138:2: rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ClickDataId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickDataId__Group__2();

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
    // $ANTLR end "rule__ClickDataId__Group__1"


    // $ANTLR start "rule__ClickDataId__Group__1__Impl"
    // InternalBromium.g:3145:1: rule__ClickDataId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickDataId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3149:1: ( ( 'on' ) )
            // InternalBromium.g:3150:1: ( 'on' )
            {
            // InternalBromium.g:3150:1: ( 'on' )
            // InternalBromium.g:3151:2: 'on'
            {
             before(grammarAccess.getClickDataIdAccess().getOnKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClickDataIdAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__ClickDataId__Group__1__Impl"


    // $ANTLR start "rule__ClickDataId__Group__2"
    // InternalBromium.g:3160:1: rule__ClickDataId__Group__2 : rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 ;
    public final void rule__ClickDataId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3164:1: ( rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 )
            // InternalBromium.g:3165:2: rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ClickDataId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickDataId__Group__3();

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
    // $ANTLR end "rule__ClickDataId__Group__2"


    // $ANTLR start "rule__ClickDataId__Group__2__Impl"
    // InternalBromium.g:3172:1: rule__ClickDataId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickDataId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3176:1: ( ( 'element' ) )
            // InternalBromium.g:3177:1: ( 'element' )
            {
            // InternalBromium.g:3177:1: ( 'element' )
            // InternalBromium.g:3178:2: 'element'
            {
             before(grammarAccess.getClickDataIdAccess().getElementKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClickDataIdAccess().getElementKeyword_2()); 

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
    // $ANTLR end "rule__ClickDataId__Group__2__Impl"


    // $ANTLR start "rule__ClickDataId__Group__3"
    // InternalBromium.g:3187:1: rule__ClickDataId__Group__3 : rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 ;
    public final void rule__ClickDataId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3191:1: ( rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 )
            // InternalBromium.g:3192:2: rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__ClickDataId__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickDataId__Group__4();

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
    // $ANTLR end "rule__ClickDataId__Group__3"


    // $ANTLR start "rule__ClickDataId__Group__3__Impl"
    // InternalBromium.g:3199:1: rule__ClickDataId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickDataId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3203:1: ( ( 'with' ) )
            // InternalBromium.g:3204:1: ( 'with' )
            {
            // InternalBromium.g:3204:1: ( 'with' )
            // InternalBromium.g:3205:2: 'with'
            {
             before(grammarAccess.getClickDataIdAccess().getWithKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClickDataIdAccess().getWithKeyword_3()); 

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
    // $ANTLR end "rule__ClickDataId__Group__3__Impl"


    // $ANTLR start "rule__ClickDataId__Group__4"
    // InternalBromium.g:3214:1: rule__ClickDataId__Group__4 : rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 ;
    public final void rule__ClickDataId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3218:1: ( rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 )
            // InternalBromium.g:3219:2: rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ClickDataId__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickDataId__Group__5();

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
    // $ANTLR end "rule__ClickDataId__Group__4"


    // $ANTLR start "rule__ClickDataId__Group__4__Impl"
    // InternalBromium.g:3226:1: rule__ClickDataId__Group__4__Impl : ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickDataId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3230:1: ( ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:3231:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:3231:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:3232:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:3233:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            // InternalBromium.g:3233:3: rule__ClickDataId__ParameterNamesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ClickDataId__ParameterNamesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClickDataIdAccess().getParameterNamesAssignment_4()); 

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
    // $ANTLR end "rule__ClickDataId__Group__4__Impl"


    // $ANTLR start "rule__ClickDataId__Group__5"
    // InternalBromium.g:3241:1: rule__ClickDataId__Group__5 : rule__ClickDataId__Group__5__Impl ;
    public final void rule__ClickDataId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3245:1: ( rule__ClickDataId__Group__5__Impl )
            // InternalBromium.g:3246:2: rule__ClickDataId__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickDataId__Group__5__Impl();

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
    // $ANTLR end "rule__ClickDataId__Group__5"


    // $ANTLR start "rule__ClickDataId__Group__5__Impl"
    // InternalBromium.g:3252:1: rule__ClickDataId__Group__5__Impl : ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickDataId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3256:1: ( ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:3257:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:3257:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:3258:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:3259:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            // InternalBromium.g:3259:3: rule__ClickDataId__ParameterValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ClickDataId__ParameterValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClickDataIdAccess().getParameterValuesAssignment_5()); 

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
    // $ANTLR end "rule__ClickDataId__Group__5__Impl"


    // $ANTLR start "rule__ConfirmAlert__Group__0"
    // InternalBromium.g:3268:1: rule__ConfirmAlert__Group__0 : rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 ;
    public final void rule__ConfirmAlert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3272:1: ( rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 )
            // InternalBromium.g:3273:2: rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ConfirmAlert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfirmAlert__Group__1();

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
    // $ANTLR end "rule__ConfirmAlert__Group__0"


    // $ANTLR start "rule__ConfirmAlert__Group__0__Impl"
    // InternalBromium.g:3280:1: rule__ConfirmAlert__Group__0__Impl : ( 'to' ) ;
    public final void rule__ConfirmAlert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3284:1: ( ( 'to' ) )
            // InternalBromium.g:3285:1: ( 'to' )
            {
            // InternalBromium.g:3285:1: ( 'to' )
            // InternalBromium.g:3286:2: 'to'
            {
             before(grammarAccess.getConfirmAlertAccess().getToKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConfirmAlertAccess().getToKeyword_0()); 

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
    // $ANTLR end "rule__ConfirmAlert__Group__0__Impl"


    // $ANTLR start "rule__ConfirmAlert__Group__1"
    // InternalBromium.g:3295:1: rule__ConfirmAlert__Group__1 : rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 ;
    public final void rule__ConfirmAlert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3299:1: ( rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 )
            // InternalBromium.g:3300:2: rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ConfirmAlert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfirmAlert__Group__2();

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
    // $ANTLR end "rule__ConfirmAlert__Group__1"


    // $ANTLR start "rule__ConfirmAlert__Group__1__Impl"
    // InternalBromium.g:3307:1: rule__ConfirmAlert__Group__1__Impl : ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) ;
    public final void rule__ConfirmAlert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3311:1: ( ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:3312:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:3312:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:3313:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:3314:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            // InternalBromium.g:3314:3: rule__ConfirmAlert__ParameterNamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfirmAlert__ParameterNamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfirmAlertAccess().getParameterNamesAssignment_1()); 

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
    // $ANTLR end "rule__ConfirmAlert__Group__1__Impl"


    // $ANTLR start "rule__ConfirmAlert__Group__2"
    // InternalBromium.g:3322:1: rule__ConfirmAlert__Group__2 : rule__ConfirmAlert__Group__2__Impl ;
    public final void rule__ConfirmAlert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3326:1: ( rule__ConfirmAlert__Group__2__Impl )
            // InternalBromium.g:3327:2: rule__ConfirmAlert__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfirmAlert__Group__2__Impl();

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
    // $ANTLR end "rule__ConfirmAlert__Group__2"


    // $ANTLR start "rule__ConfirmAlert__Group__2__Impl"
    // InternalBromium.g:3333:1: rule__ConfirmAlert__Group__2__Impl : ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) ;
    public final void rule__ConfirmAlert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3337:1: ( ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:3338:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:3338:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:3339:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:3340:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            // InternalBromium.g:3340:3: rule__ConfirmAlert__ParameterValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfirmAlert__ParameterValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfirmAlertAccess().getParameterValuesAssignment_2()); 

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
    // $ANTLR end "rule__ConfirmAlert__Group__2__Impl"


    // $ANTLR start "rule__ClickId__Group__0"
    // InternalBromium.g:3349:1: rule__ClickId__Group__0 : rule__ClickId__Group__0__Impl rule__ClickId__Group__1 ;
    public final void rule__ClickId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3353:1: ( rule__ClickId__Group__0__Impl rule__ClickId__Group__1 )
            // InternalBromium.g:3354:2: rule__ClickId__Group__0__Impl rule__ClickId__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ClickId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickId__Group__1();

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
    // $ANTLR end "rule__ClickId__Group__0"


    // $ANTLR start "rule__ClickId__Group__0__Impl"
    // InternalBromium.g:3361:1: rule__ClickId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3365:1: ( ( 'click' ) )
            // InternalBromium.g:3366:1: ( 'click' )
            {
            // InternalBromium.g:3366:1: ( 'click' )
            // InternalBromium.g:3367:2: 'click'
            {
             before(grammarAccess.getClickIdAccess().getClickKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClickIdAccess().getClickKeyword_0()); 

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
    // $ANTLR end "rule__ClickId__Group__0__Impl"


    // $ANTLR start "rule__ClickId__Group__1"
    // InternalBromium.g:3376:1: rule__ClickId__Group__1 : rule__ClickId__Group__1__Impl rule__ClickId__Group__2 ;
    public final void rule__ClickId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3380:1: ( rule__ClickId__Group__1__Impl rule__ClickId__Group__2 )
            // InternalBromium.g:3381:2: rule__ClickId__Group__1__Impl rule__ClickId__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ClickId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickId__Group__2();

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
    // $ANTLR end "rule__ClickId__Group__1"


    // $ANTLR start "rule__ClickId__Group__1__Impl"
    // InternalBromium.g:3388:1: rule__ClickId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3392:1: ( ( 'on' ) )
            // InternalBromium.g:3393:1: ( 'on' )
            {
            // InternalBromium.g:3393:1: ( 'on' )
            // InternalBromium.g:3394:2: 'on'
            {
             before(grammarAccess.getClickIdAccess().getOnKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClickIdAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__ClickId__Group__1__Impl"


    // $ANTLR start "rule__ClickId__Group__2"
    // InternalBromium.g:3403:1: rule__ClickId__Group__2 : rule__ClickId__Group__2__Impl rule__ClickId__Group__3 ;
    public final void rule__ClickId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3407:1: ( rule__ClickId__Group__2__Impl rule__ClickId__Group__3 )
            // InternalBromium.g:3408:2: rule__ClickId__Group__2__Impl rule__ClickId__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ClickId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickId__Group__3();

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
    // $ANTLR end "rule__ClickId__Group__2"


    // $ANTLR start "rule__ClickId__Group__2__Impl"
    // InternalBromium.g:3415:1: rule__ClickId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3419:1: ( ( 'element' ) )
            // InternalBromium.g:3420:1: ( 'element' )
            {
            // InternalBromium.g:3420:1: ( 'element' )
            // InternalBromium.g:3421:2: 'element'
            {
             before(grammarAccess.getClickIdAccess().getElementKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClickIdAccess().getElementKeyword_2()); 

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
    // $ANTLR end "rule__ClickId__Group__2__Impl"


    // $ANTLR start "rule__ClickId__Group__3"
    // InternalBromium.g:3430:1: rule__ClickId__Group__3 : rule__ClickId__Group__3__Impl rule__ClickId__Group__4 ;
    public final void rule__ClickId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3434:1: ( rule__ClickId__Group__3__Impl rule__ClickId__Group__4 )
            // InternalBromium.g:3435:2: rule__ClickId__Group__3__Impl rule__ClickId__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__ClickId__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickId__Group__4();

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
    // $ANTLR end "rule__ClickId__Group__3"


    // $ANTLR start "rule__ClickId__Group__3__Impl"
    // InternalBromium.g:3442:1: rule__ClickId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3446:1: ( ( 'with' ) )
            // InternalBromium.g:3447:1: ( 'with' )
            {
            // InternalBromium.g:3447:1: ( 'with' )
            // InternalBromium.g:3448:2: 'with'
            {
             before(grammarAccess.getClickIdAccess().getWithKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClickIdAccess().getWithKeyword_3()); 

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
    // $ANTLR end "rule__ClickId__Group__3__Impl"


    // $ANTLR start "rule__ClickId__Group__4"
    // InternalBromium.g:3457:1: rule__ClickId__Group__4 : rule__ClickId__Group__4__Impl rule__ClickId__Group__5 ;
    public final void rule__ClickId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3461:1: ( rule__ClickId__Group__4__Impl rule__ClickId__Group__5 )
            // InternalBromium.g:3462:2: rule__ClickId__Group__4__Impl rule__ClickId__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ClickId__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickId__Group__5();

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
    // $ANTLR end "rule__ClickId__Group__4"


    // $ANTLR start "rule__ClickId__Group__4__Impl"
    // InternalBromium.g:3469:1: rule__ClickId__Group__4__Impl : ( ( rule__ClickId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3473:1: ( ( ( rule__ClickId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:3474:1: ( ( rule__ClickId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:3474:1: ( ( rule__ClickId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:3475:2: ( rule__ClickId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:3476:2: ( rule__ClickId__ParameterNamesAssignment_4 )
            // InternalBromium.g:3476:3: rule__ClickId__ParameterNamesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ClickId__ParameterNamesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClickIdAccess().getParameterNamesAssignment_4()); 

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
    // $ANTLR end "rule__ClickId__Group__4__Impl"


    // $ANTLR start "rule__ClickId__Group__5"
    // InternalBromium.g:3484:1: rule__ClickId__Group__5 : rule__ClickId__Group__5__Impl ;
    public final void rule__ClickId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3488:1: ( rule__ClickId__Group__5__Impl )
            // InternalBromium.g:3489:2: rule__ClickId__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickId__Group__5__Impl();

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
    // $ANTLR end "rule__ClickId__Group__5"


    // $ANTLR start "rule__ClickId__Group__5__Impl"
    // InternalBromium.g:3495:1: rule__ClickId__Group__5__Impl : ( ( rule__ClickId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3499:1: ( ( ( rule__ClickId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:3500:1: ( ( rule__ClickId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:3500:1: ( ( rule__ClickId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:3501:2: ( rule__ClickId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:3502:2: ( rule__ClickId__ParameterValuesAssignment_5 )
            // InternalBromium.g:3502:3: rule__ClickId__ParameterValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ClickId__ParameterValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClickIdAccess().getParameterValuesAssignment_5()); 

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
    // $ANTLR end "rule__ClickId__Group__5__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalBromium.g:3511:1: rule__Model__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3515:1: ( ( RULE_STRING ) )
            // InternalBromium.g:3516:2: ( RULE_STRING )
            {
            // InternalBromium.g:3516:2: ( RULE_STRING )
            // InternalBromium.g:3517:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__VersionAssignment_3"
    // InternalBromium.g:3526:1: rule__Model__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Model__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3530:1: ( ( RULE_STRING ) )
            // InternalBromium.g:3531:2: ( RULE_STRING )
            {
            // InternalBromium.g:3531:2: ( RULE_STRING )
            // InternalBromium.g:3532:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__VersionAssignment_3"


    // $ANTLR start "rule__Model__BaseVersionAssignment_4_1"
    // InternalBromium.g:3541:1: rule__Model__BaseVersionAssignment_4_1 : ( ruleVersion ) ;
    public final void rule__Model__BaseVersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3545:1: ( ( ruleVersion ) )
            // InternalBromium.g:3546:2: ( ruleVersion )
            {
            // InternalBromium.g:3546:2: ( ruleVersion )
            // InternalBromium.g:3547:3: ruleVersion
            {
             before(grammarAccess.getModelAccess().getBaseVersionVersionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBaseVersionVersionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Model__BaseVersionAssignment_4_1"


    // $ANTLR start "rule__Model__ActionsAssignment_7"
    // InternalBromium.g:3556:1: rule__Model__ActionsAssignment_7 : ( ruleApplicationAction ) ;
    public final void rule__Model__ActionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3560:1: ( ( ruleApplicationAction ) )
            // InternalBromium.g:3561:2: ( ruleApplicationAction )
            {
            // InternalBromium.g:3561:2: ( ruleApplicationAction )
            // InternalBromium.g:3562:3: ruleApplicationAction
            {
             before(grammarAccess.getModelAccess().getActionsApplicationActionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleApplicationAction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActionsApplicationActionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Model__ActionsAssignment_7"


    // $ANTLR start "rule__ApplicationAction__NameAssignment_1"
    // InternalBromium.g:3571:1: rule__ApplicationAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3575:1: ( ( RULE_ID ) )
            // InternalBromium.g:3576:2: ( RULE_ID )
            {
            // InternalBromium.g:3576:2: ( RULE_ID )
            // InternalBromium.g:3577:3: RULE_ID
            {
             before(grammarAccess.getApplicationActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ApplicationAction__NameAssignment_1"


    // $ANTLR start "rule__ApplicationAction__SyntaxDefinitionsAssignment_3"
    // InternalBromium.g:3586:1: rule__ApplicationAction__SyntaxDefinitionsAssignment_3 : ( ruleSyntaxDefinition ) ;
    public final void rule__ApplicationAction__SyntaxDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3590:1: ( ( ruleSyntaxDefinition ) )
            // InternalBromium.g:3591:2: ( ruleSyntaxDefinition )
            {
            // InternalBromium.g:3591:2: ( ruleSyntaxDefinition )
            // InternalBromium.g:3592:3: ruleSyntaxDefinition
            {
             before(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsSyntaxDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSyntaxDefinition();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsSyntaxDefinitionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ApplicationAction__SyntaxDefinitionsAssignment_3"


    // $ANTLR start "rule__ApplicationAction__PreconditionAssignment_4"
    // InternalBromium.g:3601:1: rule__ApplicationAction__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__ApplicationAction__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3605:1: ( ( rulePrecondition ) )
            // InternalBromium.g:3606:2: ( rulePrecondition )
            {
            // InternalBromium.g:3606:2: ( rulePrecondition )
            // InternalBromium.g:3607:3: rulePrecondition
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionPreconditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getPreconditionPreconditionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ApplicationAction__PreconditionAssignment_4"


    // $ANTLR start "rule__ApplicationAction__WebDriverActionAssignment_5"
    // InternalBromium.g:3616:1: rule__ApplicationAction__WebDriverActionAssignment_5 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__WebDriverActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3620:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:3621:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:3621:2: ( ruleWebDriverAction )
            // InternalBromium.g:3622:3: ruleWebDriverAction
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverAction();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ApplicationAction__WebDriverActionAssignment_5"


    // $ANTLR start "rule__ApplicationAction__ExpectHttpRequestAssignment_6"
    // InternalBromium.g:3631:1: rule__ApplicationAction__ExpectHttpRequestAssignment_6 : ( ruleExpectHttpRequest ) ;
    public final void rule__ApplicationAction__ExpectHttpRequestAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3635:1: ( ( ruleExpectHttpRequest ) )
            // InternalBromium.g:3636:2: ( ruleExpectHttpRequest )
            {
            // InternalBromium.g:3636:2: ( ruleExpectHttpRequest )
            // InternalBromium.g:3637:3: ruleExpectHttpRequest
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestExpectHttpRequestParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpectHttpRequest();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getExpectHttpRequestExpectHttpRequestParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ApplicationAction__ExpectHttpRequestAssignment_6"


    // $ANTLR start "rule__ApplicationAction__PostconditionAssignment_7"
    // InternalBromium.g:3646:1: rule__ApplicationAction__PostconditionAssignment_7 : ( rulePostcondition ) ;
    public final void rule__ApplicationAction__PostconditionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3650:1: ( ( rulePostcondition ) )
            // InternalBromium.g:3651:2: ( rulePostcondition )
            {
            // InternalBromium.g:3651:2: ( rulePostcondition )
            // InternalBromium.g:3652:3: rulePostcondition
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionPostconditionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getPostconditionPostconditionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ApplicationAction__PostconditionAssignment_7"


    // $ANTLR start "rule__SyntaxDefinition__ContentAssignment_1"
    // InternalBromium.g:3661:1: rule__SyntaxDefinition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SyntaxDefinition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3665:1: ( ( RULE_STRING ) )
            // InternalBromium.g:3666:2: ( RULE_STRING )
            {
            // InternalBromium.g:3666:2: ( RULE_STRING )
            // InternalBromium.g:3667:3: RULE_STRING
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSyntaxDefinitionAccess().getContentSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SyntaxDefinition__ContentAssignment_1"


    // $ANTLR start "rule__SyntaxDefinition__ParameterAssignment_2"
    // InternalBromium.g:3676:1: rule__SyntaxDefinition__ParameterAssignment_2 : ( ruleExposedParameter ) ;
    public final void rule__SyntaxDefinition__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3680:1: ( ( ruleExposedParameter ) )
            // InternalBromium.g:3681:2: ( ruleExposedParameter )
            {
            // InternalBromium.g:3681:2: ( ruleExposedParameter )
            // InternalBromium.g:3682:3: ruleExposedParameter
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getParameterExposedParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExposedParameter();

            state._fsp--;

             after(grammarAccess.getSyntaxDefinitionAccess().getParameterExposedParameterParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SyntaxDefinition__ParameterAssignment_2"


    // $ANTLR start "rule__Precondition__ActionAssignment_1"
    // InternalBromium.g:3691:1: rule__Precondition__ActionAssignment_1 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Precondition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3695:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:3696:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:3696:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:3697:3: ruleWebDriverActionCondition
            {
             before(grammarAccess.getPreconditionAccess().getActionWebDriverActionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverActionCondition();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getActionWebDriverActionConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Precondition__ActionAssignment_1"


    // $ANTLR start "rule__Postcondition__ActionAssignment_3"
    // InternalBromium.g:3706:1: rule__Postcondition__ActionAssignment_3 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Postcondition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3710:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:3711:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:3711:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:3712:3: ruleWebDriverActionCondition
            {
             before(grammarAccess.getPostconditionAccess().getActionWebDriverActionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverActionCondition();

            state._fsp--;

             after(grammarAccess.getPostconditionAccess().getActionWebDriverActionConditionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Postcondition__ActionAssignment_3"


    // $ANTLR start "rule__ExpectHttpRequest__NotAssignment_1_1"
    // InternalBromium.g:3721:1: rule__ExpectHttpRequest__NotAssignment_1_1 : ( ( 'not' ) ) ;
    public final void rule__ExpectHttpRequest__NotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3725:1: ( ( ( 'not' ) ) )
            // InternalBromium.g:3726:2: ( ( 'not' ) )
            {
            // InternalBromium.g:3726:2: ( ( 'not' ) )
            // InternalBromium.g:3727:3: ( 'not' )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            // InternalBromium.g:3728:3: ( 'not' )
            // InternalBromium.g:3729:4: 'not'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 

            }

             after(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 

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
    // $ANTLR end "rule__ExpectHttpRequest__NotAssignment_1_1"


    // $ANTLR start "rule__ElementByCssToBePresent__ParameterNamesAssignment_3"
    // InternalBromium.g:3740:1: rule__ElementByCssToBePresent__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__ElementByCssToBePresent__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3744:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:3745:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:3745:2: ( ( 'selector' ) )
            // InternalBromium.g:3746:3: ( 'selector' )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:3747:3: ( 'selector' )
            // InternalBromium.g:3748:4: 'selector'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 

            }

             after(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__ParameterNamesAssignment_3"


    // $ANTLR start "rule__ElementByCssToBePresent__ParameterValuesAssignment_4"
    // InternalBromium.g:3759:1: rule__ElementByCssToBePresent__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ElementByCssToBePresent__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3763:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3764:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3764:2: ( ruleParameterValue )
            // InternalBromium.g:3765:3: ruleParameterValue
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesParameterValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesParameterValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ElementByCssToBePresent__ParameterValuesAssignment_4"


    // $ANTLR start "rule__ClickCssSelector__ParameterNamesAssignment_5"
    // InternalBromium.g:3774:1: rule__ClickCssSelector__ParameterNamesAssignment_5 : ( ( 'selector' ) ) ;
    public final void rule__ClickCssSelector__ParameterNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3778:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:3779:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:3779:2: ( ( 'selector' ) )
            // InternalBromium.g:3780:3: ( 'selector' )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            // InternalBromium.g:3781:3: ( 'selector' )
            // InternalBromium.g:3782:4: 'selector'
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 

            }

             after(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 

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
    // $ANTLR end "rule__ClickCssSelector__ParameterNamesAssignment_5"


    // $ANTLR start "rule__ClickCssSelector__ParameterValuesAssignment_6"
    // InternalBromium.g:3793:1: rule__ClickCssSelector__ParameterValuesAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__ClickCssSelector__ParameterValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3797:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3798:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3798:2: ( ruleParameterValue )
            // InternalBromium.g:3799:3: ruleParameterValue
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getClickCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ClickCssSelector__ParameterValuesAssignment_6"


    // $ANTLR start "rule__PageLoad__ParameterNamesAssignment_1"
    // InternalBromium.g:3808:1: rule__PageLoad__ParameterNamesAssignment_1 : ( ( 'page' ) ) ;
    public final void rule__PageLoad__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3812:1: ( ( ( 'page' ) ) )
            // InternalBromium.g:3813:2: ( ( 'page' ) )
            {
            // InternalBromium.g:3813:2: ( ( 'page' ) )
            // InternalBromium.g:3814:3: ( 'page' )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            // InternalBromium.g:3815:3: ( 'page' )
            // InternalBromium.g:3816:4: 'page'
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 

            }

             after(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 

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
    // $ANTLR end "rule__PageLoad__ParameterNamesAssignment_1"


    // $ANTLR start "rule__PageLoad__ParameterValuesAssignment_2"
    // InternalBromium.g:3827:1: rule__PageLoad__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__PageLoad__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3831:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3832:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3832:2: ( ruleParameterValue )
            // InternalBromium.g:3833:3: ruleParameterValue
            {
             before(grammarAccess.getPageLoadAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getPageLoadAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PageLoad__ParameterValuesAssignment_2"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1"
    // InternalBromium.g:3842:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 : ( ( 'text' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3846:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:3847:2: ( ( 'text' ) )
            {
            // InternalBromium.g:3847:2: ( ( 'text' ) )
            // InternalBromium.g:3848:3: ( 'text' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            // InternalBromium.g:3849:3: ( 'text' )
            // InternalBromium.g:3850:4: 'text'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 

            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2"
    // InternalBromium.g:3861:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3865:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3866:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3866:2: ( ruleParameterValue )
            // InternalBromium.g:3867:3: ruleParameterValue
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7"
    // InternalBromium.g:3876:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 : ( ( 'selector' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3880:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:3881:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:3881:2: ( ( 'selector' ) )
            // InternalBromium.g:3882:3: ( 'selector' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            // InternalBromium.g:3883:3: ( 'selector' )
            // InternalBromium.g:3884:4: 'selector'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 

            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8"
    // InternalBromium.g:3895:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3899:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3900:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3900:2: ( ruleParameterValue )
            // InternalBromium.g:3901:3: ruleParameterValue
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3"
    // InternalBromium.g:3910:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3914:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:3915:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:3915:2: ( ( 'selector' ) )
            // InternalBromium.g:3916:3: ( 'selector' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:3917:3: ( 'selector' )
            // InternalBromium.g:3918:4: 'selector'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 

            }

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4"
    // InternalBromium.g:3929:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3933:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3934:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3934:2: ( ruleParameterValue )
            // InternalBromium.g:3935:3: ruleParameterValue
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesParameterValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesParameterValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6"
    // InternalBromium.g:3944:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 : ( ( 'text' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3948:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:3949:2: ( ( 'text' ) )
            {
            // InternalBromium.g:3949:2: ( ( 'text' ) )
            // InternalBromium.g:3950:3: ( 'text' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            // InternalBromium.g:3951:3: ( 'text' )
            // InternalBromium.g:3952:4: 'text'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 

            }

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6"


    // $ANTLR start "rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7"
    // InternalBromium.g:3963:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3967:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3968:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3968:2: ( ruleParameterValue )
            // InternalBromium.g:3969:3: ruleParameterValue
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesParameterValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesParameterValueParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7"


    // $ANTLR start "rule__ClickClassByText__ParameterNamesAssignment_4"
    // InternalBromium.g:3978:1: rule__ClickClassByText__ParameterNamesAssignment_4 : ( ( 'class' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3982:1: ( ( ( 'class' ) ) )
            // InternalBromium.g:3983:2: ( ( 'class' ) )
            {
            // InternalBromium.g:3983:2: ( ( 'class' ) )
            // InternalBromium.g:3984:3: ( 'class' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            // InternalBromium.g:3985:3: ( 'class' )
            // InternalBromium.g:3986:4: 'class'
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 

            }

             after(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 

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
    // $ANTLR end "rule__ClickClassByText__ParameterNamesAssignment_4"


    // $ANTLR start "rule__ClickClassByText__ParameterValuesAssignment_5"
    // InternalBromium.g:3997:1: rule__ClickClassByText__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4001:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:4002:2: ( ruleParameterValue )
            {
            // InternalBromium.g:4002:2: ( ruleParameterValue )
            // InternalBromium.g:4003:3: ruleParameterValue
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesParameterValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getClickClassByTextAccess().getParameterValuesParameterValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ClickClassByText__ParameterValuesAssignment_5"


    // $ANTLR start "rule__ClickClassByText__ParameterNamesAssignment_7"
    // InternalBromium.g:4012:1: rule__ClickClassByText__ParameterNamesAssignment_7 : ( ( 'text' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4016:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:4017:2: ( ( 'text' ) )
            {
            // InternalBromium.g:4017:2: ( ( 'text' ) )
            // InternalBromium.g:4018:3: ( 'text' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            // InternalBromium.g:4019:3: ( 'text' )
            // InternalBromium.g:4020:4: 'text'
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 

            }

             after(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 

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
    // $ANTLR end "rule__ClickClassByText__ParameterNamesAssignment_7"


    // $ANTLR start "rule__ClickClassByText__ParameterValuesAssignment_8"
    // InternalBromium.g:4031:1: rule__ClickClassByText__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4035:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:4036:2: ( ruleParameterValue )
            {
            // InternalBromium.g:4036:2: ( ruleParameterValue )
            // InternalBromium.g:4037:3: ruleParameterValue
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesParameterValueParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getClickClassByTextAccess().getParameterValuesParameterValueParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ClickClassByText__ParameterValuesAssignment_8"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1"
    // InternalBromium.g:4046:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 : ( ( 'variable' ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4050:1: ( ( ( 'variable' ) ) )
            // InternalBromium.g:4051:2: ( ( 'variable' ) )
            {
            // InternalBromium.g:4051:2: ( ( 'variable' ) )
            // InternalBromium.g:4052:3: ( 'variable' )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 
            // InternalBromium.g:4053:3: ( 'variable' )
            // InternalBromium.g:4054:4: 'variable'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 

            }

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2"
    // InternalBromium.g:4065:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4069:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:4070:2: ( ruleParameterValue )
            {
            // InternalBromium.g:4070:2: ( ruleParameterValue )
            // InternalBromium.g:4071:3: ruleParameterValue
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10"
    // InternalBromium.g:4080:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 : ( ( 'selector' ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4084:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:4085:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:4085:2: ( ( 'selector' ) )
            // InternalBromium.g:4086:3: ( 'selector' )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 
            // InternalBromium.g:4087:3: ( 'selector' )
            // InternalBromium.g:4088:4: 'selector'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 

            }

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10"


    // $ANTLR start "rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11"
    // InternalBromium.g:4099:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 : ( ruleParameterValue ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4103:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:4104:2: ( ruleParameterValue )
            {
            // InternalBromium.g:4104:2: ( ruleParameterValue )
            // InternalBromium.g:4105:3: ruleParameterValue
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11"


    // $ANTLR start "rule__ClickDataId__ParameterNamesAssignment_4"
    // InternalBromium.g:4114:1: rule__ClickDataId__ParameterNamesAssignment_4 : ( ( 'dataId' ) ) ;
    public final void rule__ClickDataId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4118:1: ( ( ( 'dataId' ) ) )
            // InternalBromium.g:4119:2: ( ( 'dataId' ) )
            {
            // InternalBromium.g:4119:2: ( ( 'dataId' ) )
            // InternalBromium.g:4120:3: ( 'dataId' )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            // InternalBromium.g:4121:3: ( 'dataId' )
            // InternalBromium.g:4122:4: 'dataId'
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 

            }

             after(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 

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
    // $ANTLR end "rule__ClickDataId__ParameterNamesAssignment_4"


    // $ANTLR start "rule__ClickDataId__ParameterValuesAssignment_5"
    // InternalBromium.g:4133:1: rule__ClickDataId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickDataId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4137:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:4138:2: ( ruleParameterValue )
            {
            // InternalBromium.g:4138:2: ( ruleParameterValue )
            // InternalBromium.g:4139:3: ruleParameterValue
            {
             before(grammarAccess.getClickDataIdAccess().getParameterValuesParameterValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getClickDataIdAccess().getParameterValuesParameterValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ClickDataId__ParameterValuesAssignment_5"


    // $ANTLR start "rule__ConfirmAlert__ParameterNamesAssignment_1"
    // InternalBromium.g:4148:1: rule__ConfirmAlert__ParameterNamesAssignment_1 : ( ( 'confirm' ) ) ;
    public final void rule__ConfirmAlert__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4152:1: ( ( ( 'confirm' ) ) )
            // InternalBromium.g:4153:2: ( ( 'confirm' ) )
            {
            // InternalBromium.g:4153:2: ( ( 'confirm' ) )
            // InternalBromium.g:4154:3: ( 'confirm' )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            // InternalBromium.g:4155:3: ( 'confirm' )
            // InternalBromium.g:4156:4: 'confirm'
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 

            }

             after(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 

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
    // $ANTLR end "rule__ConfirmAlert__ParameterNamesAssignment_1"


    // $ANTLR start "rule__ConfirmAlert__ParameterValuesAssignment_2"
    // InternalBromium.g:4167:1: rule__ConfirmAlert__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ConfirmAlert__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4171:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:4172:2: ( ruleParameterValue )
            {
            // InternalBromium.g:4172:2: ( ruleParameterValue )
            // InternalBromium.g:4173:3: ruleParameterValue
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getConfirmAlertAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConfirmAlert__ParameterValuesAssignment_2"


    // $ANTLR start "rule__ClickId__ParameterNamesAssignment_4"
    // InternalBromium.g:4182:1: rule__ClickId__ParameterNamesAssignment_4 : ( ( 'id' ) ) ;
    public final void rule__ClickId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4186:1: ( ( ( 'id' ) ) )
            // InternalBromium.g:4187:2: ( ( 'id' ) )
            {
            // InternalBromium.g:4187:2: ( ( 'id' ) )
            // InternalBromium.g:4188:3: ( 'id' )
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesIdKeyword_4_0()); 
            // InternalBromium.g:4189:3: ( 'id' )
            // InternalBromium.g:4190:4: 'id'
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesIdKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClickIdAccess().getParameterNamesIdKeyword_4_0()); 

            }

             after(grammarAccess.getClickIdAccess().getParameterNamesIdKeyword_4_0()); 

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
    // $ANTLR end "rule__ClickId__ParameterNamesAssignment_4"


    // $ANTLR start "rule__ClickId__ParameterValuesAssignment_5"
    // InternalBromium.g:4201:1: rule__ClickId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4205:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:4206:2: ( ruleParameterValue )
            {
            // InternalBromium.g:4206:2: ( ruleParameterValue )
            // InternalBromium.g:4207:3: ruleParameterValue
            {
             before(grammarAccess.getClickIdAccess().getParameterValuesParameterValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getClickIdAccess().getParameterValuesParameterValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ClickId__ParameterValuesAssignment_5"


    // $ANTLR start "rule__ParameterValue__ContentAssignment_0"
    // InternalBromium.g:4216:1: rule__ParameterValue__ContentAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ParameterValue__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4220:1: ( ( RULE_STRING ) )
            // InternalBromium.g:4221:2: ( RULE_STRING )
            {
            // InternalBromium.g:4221:2: ( RULE_STRING )
            // InternalBromium.g:4222:3: RULE_STRING
            {
             before(grammarAccess.getParameterValueAccess().getContentSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getContentSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ParameterValue__ContentAssignment_0"


    // $ANTLR start "rule__ParameterValue__ExposedParameterAssignment_1"
    // InternalBromium.g:4231:1: rule__ParameterValue__ExposedParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterValue__ExposedParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4235:1: ( ( ( RULE_ID ) ) )
            // InternalBromium.g:4236:2: ( ( RULE_ID ) )
            {
            // InternalBromium.g:4236:2: ( ( RULE_ID ) )
            // InternalBromium.g:4237:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterCrossReference_1_0()); 
            // InternalBromium.g:4238:3: ( RULE_ID )
            // InternalBromium.g:4239:4: RULE_ID
            {
             before(grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterCrossReference_1_0()); 

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
    // $ANTLR end "rule__ParameterValue__ExposedParameterAssignment_1"


    // $ANTLR start "rule__ExposedParameter__NameAssignment"
    // InternalBromium.g:4250:1: rule__ExposedParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExposedParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4254:1: ( ( RULE_ID ) )
            // InternalBromium.g:4255:2: ( RULE_ID )
            {
            // InternalBromium.g:4255:2: ( RULE_ID )
            // InternalBromium.g:4256:3: RULE_ID
            {
             before(grammarAccess.getExposedParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExposedParameterAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ExposedParameter__NameAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\33\1\34\1\uffff\1\35\1\55\1\4\2\36\2\uffff";
    static final String dfa_3s = "\1\50\1\34\1\uffff\1\35\1\55\1\5\2\45\2\uffff";
    static final String dfa_4s = "\2\uffff\1\3\5\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\10\6\uffff\1\11",
            "\1\10\6\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "577:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\40\1\41\3\uffff\1\33\1\34\1\21\4\uffff";
    static final String dfa_9s = "\1\47\1\41\3\uffff\1\33\1\34\1\61\4\uffff";
    static final String dfa_10s = "\2\uffff\1\3\1\4\1\6\3\uffff\1\2\1\1\1\7\1\5";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\uffff\1\2\1\3\3\uffff\1\4",
            "\1\5",
            "",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\12\13\uffff\1\11\21\uffff\1\10\1\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "604:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008D00080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020000L});

}