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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'actions'", "'{'", "'}'", "'from'", "'id'", "'syntax'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'expect'", "'http'", "'request'", "'element'", "'with'", "'css'", "'is'", "'present'", "'click'", "'on'", "'load'", "'type'", "'in'", "'has'", "'and'", "'to'", "'not'", "'selector'", "'page'", "'text'", "'class'", "'dataId'", "'confirm'"
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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


    // $ANTLR start "entryRuleClickDataId"
    // InternalBromium.g:403:1: entryRuleClickDataId : ruleClickDataId EOF ;
    public final void entryRuleClickDataId() throws RecognitionException {
        try {
            // InternalBromium.g:404:1: ( ruleClickDataId EOF )
            // InternalBromium.g:405:1: ruleClickDataId EOF
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
    // InternalBromium.g:412:1: ruleClickDataId : ( ( rule__ClickDataId__Group__0 ) ) ;
    public final void ruleClickDataId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:416:2: ( ( ( rule__ClickDataId__Group__0 ) ) )
            // InternalBromium.g:417:2: ( ( rule__ClickDataId__Group__0 ) )
            {
            // InternalBromium.g:417:2: ( ( rule__ClickDataId__Group__0 ) )
            // InternalBromium.g:418:3: ( rule__ClickDataId__Group__0 )
            {
             before(grammarAccess.getClickDataIdAccess().getGroup()); 
            // InternalBromium.g:419:3: ( rule__ClickDataId__Group__0 )
            // InternalBromium.g:419:4: rule__ClickDataId__Group__0
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
    // InternalBromium.g:428:1: entryRuleConfirmAlert : ruleConfirmAlert EOF ;
    public final void entryRuleConfirmAlert() throws RecognitionException {
        try {
            // InternalBromium.g:429:1: ( ruleConfirmAlert EOF )
            // InternalBromium.g:430:1: ruleConfirmAlert EOF
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
    // InternalBromium.g:437:1: ruleConfirmAlert : ( ( rule__ConfirmAlert__Group__0 ) ) ;
    public final void ruleConfirmAlert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:441:2: ( ( ( rule__ConfirmAlert__Group__0 ) ) )
            // InternalBromium.g:442:2: ( ( rule__ConfirmAlert__Group__0 ) )
            {
            // InternalBromium.g:442:2: ( ( rule__ConfirmAlert__Group__0 ) )
            // InternalBromium.g:443:3: ( rule__ConfirmAlert__Group__0 )
            {
             before(grammarAccess.getConfirmAlertAccess().getGroup()); 
            // InternalBromium.g:444:3: ( rule__ConfirmAlert__Group__0 )
            // InternalBromium.g:444:4: rule__ConfirmAlert__Group__0
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


    // $ANTLR start "entryRuleParameterValue"
    // InternalBromium.g:453:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalBromium.g:454:1: ( ruleParameterValue EOF )
            // InternalBromium.g:455:1: ruleParameterValue EOF
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
    // InternalBromium.g:462:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:466:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalBromium.g:467:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalBromium.g:467:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalBromium.g:468:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalBromium.g:469:3: ( rule__ParameterValue__Alternatives )
            // InternalBromium.g:469:4: rule__ParameterValue__Alternatives
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
    // InternalBromium.g:478:1: entryRuleExposedParameter : ruleExposedParameter EOF ;
    public final void entryRuleExposedParameter() throws RecognitionException {
        try {
            // InternalBromium.g:479:1: ( ruleExposedParameter EOF )
            // InternalBromium.g:480:1: ruleExposedParameter EOF
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
    // InternalBromium.g:487:1: ruleExposedParameter : ( ( rule__ExposedParameter__NameAssignment ) ) ;
    public final void ruleExposedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:491:2: ( ( ( rule__ExposedParameter__NameAssignment ) ) )
            // InternalBromium.g:492:2: ( ( rule__ExposedParameter__NameAssignment ) )
            {
            // InternalBromium.g:492:2: ( ( rule__ExposedParameter__NameAssignment ) )
            // InternalBromium.g:493:3: ( rule__ExposedParameter__NameAssignment )
            {
             before(grammarAccess.getExposedParameterAccess().getNameAssignment()); 
            // InternalBromium.g:494:3: ( rule__ExposedParameter__NameAssignment )
            // InternalBromium.g:494:4: rule__ExposedParameter__NameAssignment
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
    // InternalBromium.g:503:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalBromium.g:504:1: ( ruleVersion EOF )
            // InternalBromium.g:505:1: ruleVersion EOF
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
    // InternalBromium.g:512:1: ruleVersion : ( RULE_STRING ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:516:2: ( ( RULE_STRING ) )
            // InternalBromium.g:517:2: ( RULE_STRING )
            {
            // InternalBromium.g:517:2: ( RULE_STRING )
            // InternalBromium.g:518:3: RULE_STRING
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
    // InternalBromium.g:527:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );
    public final void rule__WebDriverActionCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:531:1: ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalBromium.g:532:2: ( ruleElementByCssToBePresent )
                    {
                    // InternalBromium.g:532:2: ( ruleElementByCssToBePresent )
                    // InternalBromium.g:533:3: ruleElementByCssToBePresent
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
                    // InternalBromium.g:538:2: ( ruleTextOfElementWithCssSelectorToBe )
                    {
                    // InternalBromium.g:538:2: ( ruleTextOfElementWithCssSelectorToBe )
                    // InternalBromium.g:539:3: ruleTextOfElementWithCssSelectorToBe
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
                    // InternalBromium.g:544:2: ( ruleConfirmAlert )
                    {
                    // InternalBromium.g:544:2: ( ruleConfirmAlert )
                    // InternalBromium.g:545:3: ruleConfirmAlert
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
    // InternalBromium.g:554:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) );
    public final void rule__WebDriverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:558:1: ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBromium.g:559:2: ( ruleClickCssSelector )
                    {
                    // InternalBromium.g:559:2: ( ruleClickCssSelector )
                    // InternalBromium.g:560:3: ruleClickCssSelector
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
                    // InternalBromium.g:565:2: ( ruleClickClassByText )
                    {
                    // InternalBromium.g:565:2: ( ruleClickClassByText )
                    // InternalBromium.g:566:3: ruleClickClassByText
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
                    // InternalBromium.g:571:2: ( rulePageLoad )
                    {
                    // InternalBromium.g:571:2: ( rulePageLoad )
                    // InternalBromium.g:572:3: rulePageLoad
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
                    // InternalBromium.g:577:2: ( ruleTypeTextInElementFoundByCssSelector )
                    {
                    // InternalBromium.g:577:2: ( ruleTypeTextInElementFoundByCssSelector )
                    // InternalBromium.g:578:3: ruleTypeTextInElementFoundByCssSelector
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
                    // InternalBromium.g:583:2: ( ruleClickDataId )
                    {
                    // InternalBromium.g:583:2: ( ruleClickDataId )
                    // InternalBromium.g:584:3: ruleClickDataId
                    {
                     before(grammarAccess.getWebDriverActionAccess().getClickDataIdParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleClickDataId();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getClickDataIdParserRuleCall_4()); 

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
    // InternalBromium.g:593:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:597:1: ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) )
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
                    // InternalBromium.g:598:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    {
                    // InternalBromium.g:598:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    // InternalBromium.g:599:3: ( rule__ParameterValue__ContentAssignment_0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getContentAssignment_0()); 
                    // InternalBromium.g:600:3: ( rule__ParameterValue__ContentAssignment_0 )
                    // InternalBromium.g:600:4: rule__ParameterValue__ContentAssignment_0
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
                    // InternalBromium.g:604:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    {
                    // InternalBromium.g:604:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    // InternalBromium.g:605:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    {
                     before(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1()); 
                    // InternalBromium.g:606:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    // InternalBromium.g:606:4: rule__ParameterValue__ExposedParameterAssignment_1
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
    // InternalBromium.g:614:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:618:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBromium.g:619:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalBromium.g:626:1: rule__Model__Group__0__Impl : ( 'name' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:630:1: ( ( 'name' ) )
            // InternalBromium.g:631:1: ( 'name' )
            {
            // InternalBromium.g:631:1: ( 'name' )
            // InternalBromium.g:632:2: 'name'
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
    // InternalBromium.g:641:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:645:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBromium.g:646:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalBromium.g:653:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:657:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalBromium.g:658:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalBromium.g:658:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalBromium.g:659:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalBromium.g:660:2: ( rule__Model__NameAssignment_1 )
            // InternalBromium.g:660:3: rule__Model__NameAssignment_1
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
    // InternalBromium.g:668:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:672:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBromium.g:673:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalBromium.g:680:1: rule__Model__Group__2__Impl : ( 'version' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:684:1: ( ( 'version' ) )
            // InternalBromium.g:685:1: ( 'version' )
            {
            // InternalBromium.g:685:1: ( 'version' )
            // InternalBromium.g:686:2: 'version'
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
    // InternalBromium.g:695:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:699:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBromium.g:700:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalBromium.g:707:1: rule__Model__Group__3__Impl : ( ( rule__Model__VersionAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:711:1: ( ( ( rule__Model__VersionAssignment_3 ) ) )
            // InternalBromium.g:712:1: ( ( rule__Model__VersionAssignment_3 ) )
            {
            // InternalBromium.g:712:1: ( ( rule__Model__VersionAssignment_3 ) )
            // InternalBromium.g:713:2: ( rule__Model__VersionAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_3()); 
            // InternalBromium.g:714:2: ( rule__Model__VersionAssignment_3 )
            // InternalBromium.g:714:3: rule__Model__VersionAssignment_3
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
    // InternalBromium.g:722:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:726:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBromium.g:727:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalBromium.g:734:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:738:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalBromium.g:739:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalBromium.g:739:1: ( ( rule__Model__Group_4__0 )? )
            // InternalBromium.g:740:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalBromium.g:741:2: ( rule__Model__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBromium.g:741:3: rule__Model__Group_4__0
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
    // InternalBromium.g:749:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:753:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalBromium.g:754:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalBromium.g:761:1: rule__Model__Group__5__Impl : ( 'actions' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:765:1: ( ( 'actions' ) )
            // InternalBromium.g:766:1: ( 'actions' )
            {
            // InternalBromium.g:766:1: ( 'actions' )
            // InternalBromium.g:767:2: 'actions'
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
    // InternalBromium.g:776:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:780:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalBromium.g:781:2: rule__Model__Group__6__Impl rule__Model__Group__7
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
    // InternalBromium.g:788:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:792:1: ( ( '{' ) )
            // InternalBromium.g:793:1: ( '{' )
            {
            // InternalBromium.g:793:1: ( '{' )
            // InternalBromium.g:794:2: '{'
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
    // InternalBromium.g:803:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:807:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalBromium.g:808:2: rule__Model__Group__7__Impl rule__Model__Group__8
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
    // InternalBromium.g:815:1: rule__Model__Group__7__Impl : ( ( rule__Model__ActionsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:819:1: ( ( ( rule__Model__ActionsAssignment_7 )* ) )
            // InternalBromium.g:820:1: ( ( rule__Model__ActionsAssignment_7 )* )
            {
            // InternalBromium.g:820:1: ( ( rule__Model__ActionsAssignment_7 )* )
            // InternalBromium.g:821:2: ( rule__Model__ActionsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getActionsAssignment_7()); 
            // InternalBromium.g:822:2: ( rule__Model__ActionsAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBromium.g:822:3: rule__Model__ActionsAssignment_7
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
    // InternalBromium.g:830:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:834:1: ( rule__Model__Group__8__Impl )
            // InternalBromium.g:835:2: rule__Model__Group__8__Impl
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
    // InternalBromium.g:841:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:845:1: ( ( '}' ) )
            // InternalBromium.g:846:1: ( '}' )
            {
            // InternalBromium.g:846:1: ( '}' )
            // InternalBromium.g:847:2: '}'
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
    // InternalBromium.g:857:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:861:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalBromium.g:862:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalBromium.g:869:1: rule__Model__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:873:1: ( ( 'from' ) )
            // InternalBromium.g:874:1: ( 'from' )
            {
            // InternalBromium.g:874:1: ( 'from' )
            // InternalBromium.g:875:2: 'from'
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
    // InternalBromium.g:884:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:888:1: ( rule__Model__Group_4__1__Impl )
            // InternalBromium.g:889:2: rule__Model__Group_4__1__Impl
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
    // InternalBromium.g:895:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__BaseVersionAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:899:1: ( ( ( rule__Model__BaseVersionAssignment_4_1 ) ) )
            // InternalBromium.g:900:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            {
            // InternalBromium.g:900:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            // InternalBromium.g:901:2: ( rule__Model__BaseVersionAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); 
            // InternalBromium.g:902:2: ( rule__Model__BaseVersionAssignment_4_1 )
            // InternalBromium.g:902:3: rule__Model__BaseVersionAssignment_4_1
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
    // InternalBromium.g:911:1: rule__ApplicationAction__Group__0 : rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 ;
    public final void rule__ApplicationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:915:1: ( rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 )
            // InternalBromium.g:916:2: rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1
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
    // InternalBromium.g:923:1: rule__ApplicationAction__Group__0__Impl : ( 'id' ) ;
    public final void rule__ApplicationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:927:1: ( ( 'id' ) )
            // InternalBromium.g:928:1: ( 'id' )
            {
            // InternalBromium.g:928:1: ( 'id' )
            // InternalBromium.g:929:2: 'id'
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
    // InternalBromium.g:938:1: rule__ApplicationAction__Group__1 : rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 ;
    public final void rule__ApplicationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:942:1: ( rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 )
            // InternalBromium.g:943:2: rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2
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
    // InternalBromium.g:950:1: rule__ApplicationAction__Group__1__Impl : ( ( rule__ApplicationAction__NameAssignment_1 ) ) ;
    public final void rule__ApplicationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:954:1: ( ( ( rule__ApplicationAction__NameAssignment_1 ) ) )
            // InternalBromium.g:955:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            {
            // InternalBromium.g:955:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            // InternalBromium.g:956:2: ( rule__ApplicationAction__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationActionAccess().getNameAssignment_1()); 
            // InternalBromium.g:957:2: ( rule__ApplicationAction__NameAssignment_1 )
            // InternalBromium.g:957:3: rule__ApplicationAction__NameAssignment_1
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
    // InternalBromium.g:965:1: rule__ApplicationAction__Group__2 : rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 ;
    public final void rule__ApplicationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:969:1: ( rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 )
            // InternalBromium.g:970:2: rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3
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
    // InternalBromium.g:977:1: rule__ApplicationAction__Group__2__Impl : ( 'syntax' ) ;
    public final void rule__ApplicationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:981:1: ( ( 'syntax' ) )
            // InternalBromium.g:982:1: ( 'syntax' )
            {
            // InternalBromium.g:982:1: ( 'syntax' )
            // InternalBromium.g:983:2: 'syntax'
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
    // InternalBromium.g:992:1: rule__ApplicationAction__Group__3 : rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 ;
    public final void rule__ApplicationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:996:1: ( rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 )
            // InternalBromium.g:997:2: rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4
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
    // InternalBromium.g:1004:1: rule__ApplicationAction__Group__3__Impl : ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) ;
    public final void rule__ApplicationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1008:1: ( ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) )
            // InternalBromium.g:1009:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            {
            // InternalBromium.g:1009:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            // InternalBromium.g:1010:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            {
             before(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsAssignment_3()); 
            // InternalBromium.g:1011:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBromium.g:1011:3: rule__ApplicationAction__SyntaxDefinitionsAssignment_3
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
    // InternalBromium.g:1019:1: rule__ApplicationAction__Group__4 : rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 ;
    public final void rule__ApplicationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1023:1: ( rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 )
            // InternalBromium.g:1024:2: rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5
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
    // InternalBromium.g:1031:1: rule__ApplicationAction__Group__4__Impl : ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) ;
    public final void rule__ApplicationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1035:1: ( ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) )
            // InternalBromium.g:1036:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            {
            // InternalBromium.g:1036:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            // InternalBromium.g:1037:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_4()); 
            // InternalBromium.g:1038:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBromium.g:1038:3: rule__ApplicationAction__PreconditionAssignment_4
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
    // InternalBromium.g:1046:1: rule__ApplicationAction__Group__5 : rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 ;
    public final void rule__ApplicationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1050:1: ( rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 )
            // InternalBromium.g:1051:2: rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6
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
    // InternalBromium.g:1058:1: rule__ApplicationAction__Group__5__Impl : ( ( rule__ApplicationAction__WebDriverActionAssignment_5 ) ) ;
    public final void rule__ApplicationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1062:1: ( ( ( rule__ApplicationAction__WebDriverActionAssignment_5 ) ) )
            // InternalBromium.g:1063:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_5 ) )
            {
            // InternalBromium.g:1063:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_5 ) )
            // InternalBromium.g:1064:2: ( rule__ApplicationAction__WebDriverActionAssignment_5 )
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_5()); 
            // InternalBromium.g:1065:2: ( rule__ApplicationAction__WebDriverActionAssignment_5 )
            // InternalBromium.g:1065:3: rule__ApplicationAction__WebDriverActionAssignment_5
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
    // InternalBromium.g:1073:1: rule__ApplicationAction__Group__6 : rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 ;
    public final void rule__ApplicationAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1077:1: ( rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 )
            // InternalBromium.g:1078:2: rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:1085:1: rule__ApplicationAction__Group__6__Impl : ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 ) ) ;
    public final void rule__ApplicationAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1089:1: ( ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 ) ) )
            // InternalBromium.g:1090:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 ) )
            {
            // InternalBromium.g:1090:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 ) )
            // InternalBromium.g:1091:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 )
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_6()); 
            // InternalBromium.g:1092:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_6 )
            // InternalBromium.g:1092:3: rule__ApplicationAction__ExpectHttpRequestAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__ExpectHttpRequestAssignment_6();

            state._fsp--;


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
    // InternalBromium.g:1100:1: rule__ApplicationAction__Group__7 : rule__ApplicationAction__Group__7__Impl ;
    public final void rule__ApplicationAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1104:1: ( rule__ApplicationAction__Group__7__Impl )
            // InternalBromium.g:1105:2: rule__ApplicationAction__Group__7__Impl
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
    // InternalBromium.g:1111:1: rule__ApplicationAction__Group__7__Impl : ( ( rule__ApplicationAction__PostconditionAssignment_7 )? ) ;
    public final void rule__ApplicationAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1115:1: ( ( ( rule__ApplicationAction__PostconditionAssignment_7 )? ) )
            // InternalBromium.g:1116:1: ( ( rule__ApplicationAction__PostconditionAssignment_7 )? )
            {
            // InternalBromium.g:1116:1: ( ( rule__ApplicationAction__PostconditionAssignment_7 )? )
            // InternalBromium.g:1117:2: ( rule__ApplicationAction__PostconditionAssignment_7 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_7()); 
            // InternalBromium.g:1118:2: ( rule__ApplicationAction__PostconditionAssignment_7 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBromium.g:1118:3: rule__ApplicationAction__PostconditionAssignment_7
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
    // InternalBromium.g:1127:1: rule__SyntaxDefinition__Group__0 : rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 ;
    public final void rule__SyntaxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1131:1: ( rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 )
            // InternalBromium.g:1132:2: rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1
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
    // InternalBromium.g:1139:1: rule__SyntaxDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SyntaxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1143:1: ( ( () ) )
            // InternalBromium.g:1144:1: ( () )
            {
            // InternalBromium.g:1144:1: ( () )
            // InternalBromium.g:1145:2: ()
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getSyntaxDefinitionAction_0()); 
            // InternalBromium.g:1146:2: ()
            // InternalBromium.g:1146:3: 
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
    // InternalBromium.g:1154:1: rule__SyntaxDefinition__Group__1 : rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 ;
    public final void rule__SyntaxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1158:1: ( rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 )
            // InternalBromium.g:1159:2: rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2
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
    // InternalBromium.g:1166:1: rule__SyntaxDefinition__Group__1__Impl : ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) ;
    public final void rule__SyntaxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1170:1: ( ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) )
            // InternalBromium.g:1171:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            {
            // InternalBromium.g:1171:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            // InternalBromium.g:1172:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getContentAssignment_1()); 
            // InternalBromium.g:1173:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            // InternalBromium.g:1173:3: rule__SyntaxDefinition__ContentAssignment_1
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
    // InternalBromium.g:1181:1: rule__SyntaxDefinition__Group__2 : rule__SyntaxDefinition__Group__2__Impl ;
    public final void rule__SyntaxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1185:1: ( rule__SyntaxDefinition__Group__2__Impl )
            // InternalBromium.g:1186:2: rule__SyntaxDefinition__Group__2__Impl
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
    // InternalBromium.g:1192:1: rule__SyntaxDefinition__Group__2__Impl : ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) ;
    public final void rule__SyntaxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1196:1: ( ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) )
            // InternalBromium.g:1197:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            {
            // InternalBromium.g:1197:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            // InternalBromium.g:1198:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getParameterAssignment_2()); 
            // InternalBromium.g:1199:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBromium.g:1199:3: rule__SyntaxDefinition__ParameterAssignment_2
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
    // InternalBromium.g:1208:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1212:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalBromium.g:1213:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:1220:1: rule__Precondition__Group__0__Impl : ( 'when' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1224:1: ( ( 'when' ) )
            // InternalBromium.g:1225:1: ( 'when' )
            {
            // InternalBromium.g:1225:1: ( 'when' )
            // InternalBromium.g:1226:2: 'when'
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
    // InternalBromium.g:1235:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1239:1: ( rule__Precondition__Group__1__Impl )
            // InternalBromium.g:1240:2: rule__Precondition__Group__1__Impl
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
    // InternalBromium.g:1246:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ActionAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1250:1: ( ( ( rule__Precondition__ActionAssignment_1 ) ) )
            // InternalBromium.g:1251:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            {
            // InternalBromium.g:1251:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            // InternalBromium.g:1252:2: ( rule__Precondition__ActionAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getActionAssignment_1()); 
            // InternalBromium.g:1253:2: ( rule__Precondition__ActionAssignment_1 )
            // InternalBromium.g:1253:3: rule__Precondition__ActionAssignment_1
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
    // InternalBromium.g:1262:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1266:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalBromium.g:1267:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBromium.g:1274:1: rule__Postcondition__Group__0__Impl : ( 'then' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1278:1: ( ( 'then' ) )
            // InternalBromium.g:1279:1: ( 'then' )
            {
            // InternalBromium.g:1279:1: ( 'then' )
            // InternalBromium.g:1280:2: 'then'
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
    // InternalBromium.g:1289:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1293:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalBromium.g:1294:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBromium.g:1301:1: rule__Postcondition__Group__1__Impl : ( 'make' ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1305:1: ( ( 'make' ) )
            // InternalBromium.g:1306:1: ( 'make' )
            {
            // InternalBromium.g:1306:1: ( 'make' )
            // InternalBromium.g:1307:2: 'make'
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
    // InternalBromium.g:1316:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1320:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalBromium.g:1321:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:1328:1: rule__Postcondition__Group__2__Impl : ( 'sure' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1332:1: ( ( 'sure' ) )
            // InternalBromium.g:1333:1: ( 'sure' )
            {
            // InternalBromium.g:1333:1: ( 'sure' )
            // InternalBromium.g:1334:2: 'sure'
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
    // InternalBromium.g:1343:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1347:1: ( rule__Postcondition__Group__3__Impl )
            // InternalBromium.g:1348:2: rule__Postcondition__Group__3__Impl
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
    // InternalBromium.g:1354:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__ActionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1358:1: ( ( ( rule__Postcondition__ActionAssignment_3 ) ) )
            // InternalBromium.g:1359:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            {
            // InternalBromium.g:1359:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            // InternalBromium.g:1360:2: ( rule__Postcondition__ActionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getActionAssignment_3()); 
            // InternalBromium.g:1361:2: ( rule__Postcondition__ActionAssignment_3 )
            // InternalBromium.g:1361:3: rule__Postcondition__ActionAssignment_3
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
    // InternalBromium.g:1370:1: rule__ExpectHttpRequest__Group__0 : rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 ;
    public final void rule__ExpectHttpRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1374:1: ( rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 )
            // InternalBromium.g:1375:2: rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBromium.g:1382:1: rule__ExpectHttpRequest__Group__0__Impl : ( () ) ;
    public final void rule__ExpectHttpRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1386:1: ( ( () ) )
            // InternalBromium.g:1387:1: ( () )
            {
            // InternalBromium.g:1387:1: ( () )
            // InternalBromium.g:1388:2: ()
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectHttpRequestAction_0()); 
            // InternalBromium.g:1389:2: ()
            // InternalBromium.g:1389:3: 
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
    // InternalBromium.g:1397:1: rule__ExpectHttpRequest__Group__1 : rule__ExpectHttpRequest__Group__1__Impl ;
    public final void rule__ExpectHttpRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1401:1: ( rule__ExpectHttpRequest__Group__1__Impl )
            // InternalBromium.g:1402:2: rule__ExpectHttpRequest__Group__1__Impl
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
    // InternalBromium.g:1408:1: rule__ExpectHttpRequest__Group__1__Impl : ( ( rule__ExpectHttpRequest__Group_1__0 ) ) ;
    public final void rule__ExpectHttpRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1412:1: ( ( ( rule__ExpectHttpRequest__Group_1__0 ) ) )
            // InternalBromium.g:1413:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            {
            // InternalBromium.g:1413:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            // InternalBromium.g:1414:2: ( rule__ExpectHttpRequest__Group_1__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup_1()); 
            // InternalBromium.g:1415:2: ( rule__ExpectHttpRequest__Group_1__0 )
            // InternalBromium.g:1415:3: rule__ExpectHttpRequest__Group_1__0
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
    // InternalBromium.g:1424:1: rule__ExpectHttpRequest__Group_1__0 : rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 ;
    public final void rule__ExpectHttpRequest__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1428:1: ( rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 )
            // InternalBromium.g:1429:2: rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1
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
    // InternalBromium.g:1436:1: rule__ExpectHttpRequest__Group_1__0__Impl : ( 'do' ) ;
    public final void rule__ExpectHttpRequest__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1440:1: ( ( 'do' ) )
            // InternalBromium.g:1441:1: ( 'do' )
            {
            // InternalBromium.g:1441:1: ( 'do' )
            // InternalBromium.g:1442:2: 'do'
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
    // InternalBromium.g:1451:1: rule__ExpectHttpRequest__Group_1__1 : rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 ;
    public final void rule__ExpectHttpRequest__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1455:1: ( rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 )
            // InternalBromium.g:1456:2: rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2
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
    // InternalBromium.g:1463:1: rule__ExpectHttpRequest__Group_1__1__Impl : ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) ;
    public final void rule__ExpectHttpRequest__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1467:1: ( ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) )
            // InternalBromium.g:1468:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            {
            // InternalBromium.g:1468:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            // InternalBromium.g:1469:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotAssignment_1_1()); 
            // InternalBromium.g:1470:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBromium.g:1470:3: rule__ExpectHttpRequest__NotAssignment_1_1
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
    // InternalBromium.g:1478:1: rule__ExpectHttpRequest__Group_1__2 : rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 ;
    public final void rule__ExpectHttpRequest__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1482:1: ( rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 )
            // InternalBromium.g:1483:2: rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3
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
    // InternalBromium.g:1490:1: rule__ExpectHttpRequest__Group_1__2__Impl : ( 'expect' ) ;
    public final void rule__ExpectHttpRequest__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1494:1: ( ( 'expect' ) )
            // InternalBromium.g:1495:1: ( 'expect' )
            {
            // InternalBromium.g:1495:1: ( 'expect' )
            // InternalBromium.g:1496:2: 'expect'
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
    // InternalBromium.g:1505:1: rule__ExpectHttpRequest__Group_1__3 : rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 ;
    public final void rule__ExpectHttpRequest__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1509:1: ( rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 )
            // InternalBromium.g:1510:2: rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4
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
    // InternalBromium.g:1517:1: rule__ExpectHttpRequest__Group_1__3__Impl : ( 'http' ) ;
    public final void rule__ExpectHttpRequest__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1521:1: ( ( 'http' ) )
            // InternalBromium.g:1522:1: ( 'http' )
            {
            // InternalBromium.g:1522:1: ( 'http' )
            // InternalBromium.g:1523:2: 'http'
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
    // InternalBromium.g:1532:1: rule__ExpectHttpRequest__Group_1__4 : rule__ExpectHttpRequest__Group_1__4__Impl ;
    public final void rule__ExpectHttpRequest__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1536:1: ( rule__ExpectHttpRequest__Group_1__4__Impl )
            // InternalBromium.g:1537:2: rule__ExpectHttpRequest__Group_1__4__Impl
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
    // InternalBromium.g:1543:1: rule__ExpectHttpRequest__Group_1__4__Impl : ( 'request' ) ;
    public final void rule__ExpectHttpRequest__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1547:1: ( ( 'request' ) )
            // InternalBromium.g:1548:1: ( 'request' )
            {
            // InternalBromium.g:1548:1: ( 'request' )
            // InternalBromium.g:1549:2: 'request'
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
    // InternalBromium.g:1559:1: rule__ElementByCssToBePresent__Group__0 : rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 ;
    public final void rule__ElementByCssToBePresent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1563:1: ( rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 )
            // InternalBromium.g:1564:2: rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1
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
    // InternalBromium.g:1571:1: rule__ElementByCssToBePresent__Group__0__Impl : ( 'element' ) ;
    public final void rule__ElementByCssToBePresent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1575:1: ( ( 'element' ) )
            // InternalBromium.g:1576:1: ( 'element' )
            {
            // InternalBromium.g:1576:1: ( 'element' )
            // InternalBromium.g:1577:2: 'element'
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
    // InternalBromium.g:1586:1: rule__ElementByCssToBePresent__Group__1 : rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 ;
    public final void rule__ElementByCssToBePresent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1590:1: ( rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 )
            // InternalBromium.g:1591:2: rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2
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
    // InternalBromium.g:1598:1: rule__ElementByCssToBePresent__Group__1__Impl : ( 'with' ) ;
    public final void rule__ElementByCssToBePresent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1602:1: ( ( 'with' ) )
            // InternalBromium.g:1603:1: ( 'with' )
            {
            // InternalBromium.g:1603:1: ( 'with' )
            // InternalBromium.g:1604:2: 'with'
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
    // InternalBromium.g:1613:1: rule__ElementByCssToBePresent__Group__2 : rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 ;
    public final void rule__ElementByCssToBePresent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1617:1: ( rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 )
            // InternalBromium.g:1618:2: rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3
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
    // InternalBromium.g:1625:1: rule__ElementByCssToBePresent__Group__2__Impl : ( 'css' ) ;
    public final void rule__ElementByCssToBePresent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1629:1: ( ( 'css' ) )
            // InternalBromium.g:1630:1: ( 'css' )
            {
            // InternalBromium.g:1630:1: ( 'css' )
            // InternalBromium.g:1631:2: 'css'
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
    // InternalBromium.g:1640:1: rule__ElementByCssToBePresent__Group__3 : rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 ;
    public final void rule__ElementByCssToBePresent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1644:1: ( rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 )
            // InternalBromium.g:1645:2: rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4
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
    // InternalBromium.g:1652:1: rule__ElementByCssToBePresent__Group__3__Impl : ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1656:1: ( ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:1657:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:1657:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:1658:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:1659:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            // InternalBromium.g:1659:3: rule__ElementByCssToBePresent__ParameterNamesAssignment_3
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
    // InternalBromium.g:1667:1: rule__ElementByCssToBePresent__Group__4 : rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 ;
    public final void rule__ElementByCssToBePresent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1671:1: ( rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 )
            // InternalBromium.g:1672:2: rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5
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
    // InternalBromium.g:1679:1: rule__ElementByCssToBePresent__Group__4__Impl : ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1683:1: ( ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:1684:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:1684:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:1685:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:1686:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            // InternalBromium.g:1686:3: rule__ElementByCssToBePresent__ParameterValuesAssignment_4
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
    // InternalBromium.g:1694:1: rule__ElementByCssToBePresent__Group__5 : rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 ;
    public final void rule__ElementByCssToBePresent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1698:1: ( rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 )
            // InternalBromium.g:1699:2: rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6
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
    // InternalBromium.g:1706:1: rule__ElementByCssToBePresent__Group__5__Impl : ( 'is' ) ;
    public final void rule__ElementByCssToBePresent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1710:1: ( ( 'is' ) )
            // InternalBromium.g:1711:1: ( 'is' )
            {
            // InternalBromium.g:1711:1: ( 'is' )
            // InternalBromium.g:1712:2: 'is'
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
    // InternalBromium.g:1721:1: rule__ElementByCssToBePresent__Group__6 : rule__ElementByCssToBePresent__Group__6__Impl ;
    public final void rule__ElementByCssToBePresent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1725:1: ( rule__ElementByCssToBePresent__Group__6__Impl )
            // InternalBromium.g:1726:2: rule__ElementByCssToBePresent__Group__6__Impl
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
    // InternalBromium.g:1732:1: rule__ElementByCssToBePresent__Group__6__Impl : ( 'present' ) ;
    public final void rule__ElementByCssToBePresent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1736:1: ( ( 'present' ) )
            // InternalBromium.g:1737:1: ( 'present' )
            {
            // InternalBromium.g:1737:1: ( 'present' )
            // InternalBromium.g:1738:2: 'present'
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
    // InternalBromium.g:1748:1: rule__ClickCssSelector__Group__0 : rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 ;
    public final void rule__ClickCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1752:1: ( rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 )
            // InternalBromium.g:1753:2: rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1
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
    // InternalBromium.g:1760:1: rule__ClickCssSelector__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1764:1: ( ( 'click' ) )
            // InternalBromium.g:1765:1: ( 'click' )
            {
            // InternalBromium.g:1765:1: ( 'click' )
            // InternalBromium.g:1766:2: 'click'
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
    // InternalBromium.g:1775:1: rule__ClickCssSelector__Group__1 : rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 ;
    public final void rule__ClickCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1779:1: ( rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 )
            // InternalBromium.g:1780:2: rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2
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
    // InternalBromium.g:1787:1: rule__ClickCssSelector__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1791:1: ( ( 'on' ) )
            // InternalBromium.g:1792:1: ( 'on' )
            {
            // InternalBromium.g:1792:1: ( 'on' )
            // InternalBromium.g:1793:2: 'on'
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
    // InternalBromium.g:1802:1: rule__ClickCssSelector__Group__2 : rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 ;
    public final void rule__ClickCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1806:1: ( rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 )
            // InternalBromium.g:1807:2: rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3
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
    // InternalBromium.g:1814:1: rule__ClickCssSelector__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1818:1: ( ( 'element' ) )
            // InternalBromium.g:1819:1: ( 'element' )
            {
            // InternalBromium.g:1819:1: ( 'element' )
            // InternalBromium.g:1820:2: 'element'
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
    // InternalBromium.g:1829:1: rule__ClickCssSelector__Group__3 : rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 ;
    public final void rule__ClickCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1833:1: ( rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 )
            // InternalBromium.g:1834:2: rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4
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
    // InternalBromium.g:1841:1: rule__ClickCssSelector__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1845:1: ( ( 'with' ) )
            // InternalBromium.g:1846:1: ( 'with' )
            {
            // InternalBromium.g:1846:1: ( 'with' )
            // InternalBromium.g:1847:2: 'with'
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
    // InternalBromium.g:1856:1: rule__ClickCssSelector__Group__4 : rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 ;
    public final void rule__ClickCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1860:1: ( rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 )
            // InternalBromium.g:1861:2: rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5
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
    // InternalBromium.g:1868:1: rule__ClickCssSelector__Group__4__Impl : ( 'css' ) ;
    public final void rule__ClickCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1872:1: ( ( 'css' ) )
            // InternalBromium.g:1873:1: ( 'css' )
            {
            // InternalBromium.g:1873:1: ( 'css' )
            // InternalBromium.g:1874:2: 'css'
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
    // InternalBromium.g:1883:1: rule__ClickCssSelector__Group__5 : rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 ;
    public final void rule__ClickCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1887:1: ( rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 )
            // InternalBromium.g:1888:2: rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6
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
    // InternalBromium.g:1895:1: rule__ClickCssSelector__Group__5__Impl : ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) ;
    public final void rule__ClickCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1899:1: ( ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) )
            // InternalBromium.g:1900:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            {
            // InternalBromium.g:1900:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            // InternalBromium.g:1901:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesAssignment_5()); 
            // InternalBromium.g:1902:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            // InternalBromium.g:1902:3: rule__ClickCssSelector__ParameterNamesAssignment_5
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
    // InternalBromium.g:1910:1: rule__ClickCssSelector__Group__6 : rule__ClickCssSelector__Group__6__Impl ;
    public final void rule__ClickCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1914:1: ( rule__ClickCssSelector__Group__6__Impl )
            // InternalBromium.g:1915:2: rule__ClickCssSelector__Group__6__Impl
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
    // InternalBromium.g:1921:1: rule__ClickCssSelector__Group__6__Impl : ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) ;
    public final void rule__ClickCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1925:1: ( ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) )
            // InternalBromium.g:1926:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            {
            // InternalBromium.g:1926:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            // InternalBromium.g:1927:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterValuesAssignment_6()); 
            // InternalBromium.g:1928:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            // InternalBromium.g:1928:3: rule__ClickCssSelector__ParameterValuesAssignment_6
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
    // InternalBromium.g:1937:1: rule__PageLoad__Group__0 : rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 ;
    public final void rule__PageLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1941:1: ( rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 )
            // InternalBromium.g:1942:2: rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1
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
    // InternalBromium.g:1949:1: rule__PageLoad__Group__0__Impl : ( 'load' ) ;
    public final void rule__PageLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1953:1: ( ( 'load' ) )
            // InternalBromium.g:1954:1: ( 'load' )
            {
            // InternalBromium.g:1954:1: ( 'load' )
            // InternalBromium.g:1955:2: 'load'
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
    // InternalBromium.g:1964:1: rule__PageLoad__Group__1 : rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 ;
    public final void rule__PageLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1968:1: ( rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 )
            // InternalBromium.g:1969:2: rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2
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
    // InternalBromium.g:1976:1: rule__PageLoad__Group__1__Impl : ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) ;
    public final void rule__PageLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1980:1: ( ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:1981:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:1981:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:1982:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:1983:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            // InternalBromium.g:1983:3: rule__PageLoad__ParameterNamesAssignment_1
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
    // InternalBromium.g:1991:1: rule__PageLoad__Group__2 : rule__PageLoad__Group__2__Impl ;
    public final void rule__PageLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1995:1: ( rule__PageLoad__Group__2__Impl )
            // InternalBromium.g:1996:2: rule__PageLoad__Group__2__Impl
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
    // InternalBromium.g:2002:1: rule__PageLoad__Group__2__Impl : ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) ;
    public final void rule__PageLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2006:1: ( ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:2007:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:2007:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:2008:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:2009:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            // InternalBromium.g:2009:3: rule__PageLoad__ParameterValuesAssignment_2
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
    // InternalBromium.g:2018:1: rule__TypeTextInElementFoundByCssSelector__Group__0 : rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2022:1: ( rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 )
            // InternalBromium.g:2023:2: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1
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
    // InternalBromium.g:2030:1: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2034:1: ( ( 'type' ) )
            // InternalBromium.g:2035:1: ( 'type' )
            {
            // InternalBromium.g:2035:1: ( 'type' )
            // InternalBromium.g:2036:2: 'type'
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
    // InternalBromium.g:2045:1: rule__TypeTextInElementFoundByCssSelector__Group__1 : rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2049:1: ( rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 )
            // InternalBromium.g:2050:2: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2
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
    // InternalBromium.g:2057:1: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2061:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:2062:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:2062:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:2063:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:2064:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:2064:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1
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
    // InternalBromium.g:2072:1: rule__TypeTextInElementFoundByCssSelector__Group__2 : rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2076:1: ( rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 )
            // InternalBromium.g:2077:2: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3
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
    // InternalBromium.g:2084:1: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2088:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:2089:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:2089:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:2090:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:2091:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:2091:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2
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
    // InternalBromium.g:2099:1: rule__TypeTextInElementFoundByCssSelector__Group__3 : rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2103:1: ( rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 )
            // InternalBromium.g:2104:2: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4
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
    // InternalBromium.g:2111:1: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl : ( 'in' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2115:1: ( ( 'in' ) )
            // InternalBromium.g:2116:1: ( 'in' )
            {
            // InternalBromium.g:2116:1: ( 'in' )
            // InternalBromium.g:2117:2: 'in'
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
    // InternalBromium.g:2126:1: rule__TypeTextInElementFoundByCssSelector__Group__4 : rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2130:1: ( rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 )
            // InternalBromium.g:2131:2: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5
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
    // InternalBromium.g:2138:1: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl : ( 'element' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2142:1: ( ( 'element' ) )
            // InternalBromium.g:2143:1: ( 'element' )
            {
            // InternalBromium.g:2143:1: ( 'element' )
            // InternalBromium.g:2144:2: 'element'
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
    // InternalBromium.g:2153:1: rule__TypeTextInElementFoundByCssSelector__Group__5 : rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2157:1: ( rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 )
            // InternalBromium.g:2158:2: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6
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
    // InternalBromium.g:2165:1: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl : ( 'with' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2169:1: ( ( 'with' ) )
            // InternalBromium.g:2170:1: ( 'with' )
            {
            // InternalBromium.g:2170:1: ( 'with' )
            // InternalBromium.g:2171:2: 'with'
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
    // InternalBromium.g:2180:1: rule__TypeTextInElementFoundByCssSelector__Group__6 : rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2184:1: ( rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 )
            // InternalBromium.g:2185:2: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7
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
    // InternalBromium.g:2192:1: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl : ( 'css' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2196:1: ( ( 'css' ) )
            // InternalBromium.g:2197:1: ( 'css' )
            {
            // InternalBromium.g:2197:1: ( 'css' )
            // InternalBromium.g:2198:2: 'css'
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
    // InternalBromium.g:2207:1: rule__TypeTextInElementFoundByCssSelector__Group__7 : rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2211:1: ( rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 )
            // InternalBromium.g:2212:2: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8
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
    // InternalBromium.g:2219:1: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2223:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:2224:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:2224:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:2225:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:2226:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            // InternalBromium.g:2226:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7
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
    // InternalBromium.g:2234:1: rule__TypeTextInElementFoundByCssSelector__Group__8 : rule__TypeTextInElementFoundByCssSelector__Group__8__Impl ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2238:1: ( rule__TypeTextInElementFoundByCssSelector__Group__8__Impl )
            // InternalBromium.g:2239:2: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl
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
    // InternalBromium.g:2245:1: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2249:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:2250:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:2250:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:2251:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:2252:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            // InternalBromium.g:2252:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8
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
    // InternalBromium.g:2261:1: rule__TextOfElementWithCssSelectorToBe__Group__0 : rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2265:1: ( rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 )
            // InternalBromium.g:2266:2: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1
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
    // InternalBromium.g:2273:1: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl : ( 'element' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2277:1: ( ( 'element' ) )
            // InternalBromium.g:2278:1: ( 'element' )
            {
            // InternalBromium.g:2278:1: ( 'element' )
            // InternalBromium.g:2279:2: 'element'
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
    // InternalBromium.g:2288:1: rule__TextOfElementWithCssSelectorToBe__Group__1 : rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2292:1: ( rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 )
            // InternalBromium.g:2293:2: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2
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
    // InternalBromium.g:2300:1: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl : ( 'with' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2304:1: ( ( 'with' ) )
            // InternalBromium.g:2305:1: ( 'with' )
            {
            // InternalBromium.g:2305:1: ( 'with' )
            // InternalBromium.g:2306:2: 'with'
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
    // InternalBromium.g:2315:1: rule__TextOfElementWithCssSelectorToBe__Group__2 : rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2319:1: ( rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 )
            // InternalBromium.g:2320:2: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3
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
    // InternalBromium.g:2327:1: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl : ( 'css' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2331:1: ( ( 'css' ) )
            // InternalBromium.g:2332:1: ( 'css' )
            {
            // InternalBromium.g:2332:1: ( 'css' )
            // InternalBromium.g:2333:2: 'css'
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
    // InternalBromium.g:2342:1: rule__TextOfElementWithCssSelectorToBe__Group__3 : rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2346:1: ( rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 )
            // InternalBromium.g:2347:2: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4
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
    // InternalBromium.g:2354:1: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2358:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:2359:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:2359:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:2360:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:2361:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            // InternalBromium.g:2361:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3
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
    // InternalBromium.g:2369:1: rule__TextOfElementWithCssSelectorToBe__Group__4 : rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2373:1: ( rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 )
            // InternalBromium.g:2374:2: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5
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
    // InternalBromium.g:2381:1: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2385:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:2386:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:2386:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:2387:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:2388:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            // InternalBromium.g:2388:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4
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
    // InternalBromium.g:2396:1: rule__TextOfElementWithCssSelectorToBe__Group__5 : rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2400:1: ( rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 )
            // InternalBromium.g:2401:2: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6
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
    // InternalBromium.g:2408:1: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl : ( 'has' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2412:1: ( ( 'has' ) )
            // InternalBromium.g:2413:1: ( 'has' )
            {
            // InternalBromium.g:2413:1: ( 'has' )
            // InternalBromium.g:2414:2: 'has'
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
    // InternalBromium.g:2423:1: rule__TextOfElementWithCssSelectorToBe__Group__6 : rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2427:1: ( rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 )
            // InternalBromium.g:2428:2: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7
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
    // InternalBromium.g:2435:1: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2439:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) )
            // InternalBromium.g:2440:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            {
            // InternalBromium.g:2440:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            // InternalBromium.g:2441:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_6()); 
            // InternalBromium.g:2442:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            // InternalBromium.g:2442:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6
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
    // InternalBromium.g:2450:1: rule__TextOfElementWithCssSelectorToBe__Group__7 : rule__TextOfElementWithCssSelectorToBe__Group__7__Impl ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2454:1: ( rule__TextOfElementWithCssSelectorToBe__Group__7__Impl )
            // InternalBromium.g:2455:2: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl
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
    // InternalBromium.g:2461:1: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2465:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) )
            // InternalBromium.g:2466:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            {
            // InternalBromium.g:2466:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            // InternalBromium.g:2467:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_7()); 
            // InternalBromium.g:2468:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            // InternalBromium.g:2468:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7
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
    // InternalBromium.g:2477:1: rule__ClickClassByText__Group__0 : rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 ;
    public final void rule__ClickClassByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2481:1: ( rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 )
            // InternalBromium.g:2482:2: rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1
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
    // InternalBromium.g:2489:1: rule__ClickClassByText__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickClassByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2493:1: ( ( 'click' ) )
            // InternalBromium.g:2494:1: ( 'click' )
            {
            // InternalBromium.g:2494:1: ( 'click' )
            // InternalBromium.g:2495:2: 'click'
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
    // InternalBromium.g:2504:1: rule__ClickClassByText__Group__1 : rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 ;
    public final void rule__ClickClassByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2508:1: ( rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 )
            // InternalBromium.g:2509:2: rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2
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
    // InternalBromium.g:2516:1: rule__ClickClassByText__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickClassByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2520:1: ( ( 'on' ) )
            // InternalBromium.g:2521:1: ( 'on' )
            {
            // InternalBromium.g:2521:1: ( 'on' )
            // InternalBromium.g:2522:2: 'on'
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
    // InternalBromium.g:2531:1: rule__ClickClassByText__Group__2 : rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 ;
    public final void rule__ClickClassByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2535:1: ( rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 )
            // InternalBromium.g:2536:2: rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3
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
    // InternalBromium.g:2543:1: rule__ClickClassByText__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickClassByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2547:1: ( ( 'element' ) )
            // InternalBromium.g:2548:1: ( 'element' )
            {
            // InternalBromium.g:2548:1: ( 'element' )
            // InternalBromium.g:2549:2: 'element'
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
    // InternalBromium.g:2558:1: rule__ClickClassByText__Group__3 : rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 ;
    public final void rule__ClickClassByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2562:1: ( rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 )
            // InternalBromium.g:2563:2: rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4
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
    // InternalBromium.g:2570:1: rule__ClickClassByText__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickClassByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2574:1: ( ( 'with' ) )
            // InternalBromium.g:2575:1: ( 'with' )
            {
            // InternalBromium.g:2575:1: ( 'with' )
            // InternalBromium.g:2576:2: 'with'
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
    // InternalBromium.g:2585:1: rule__ClickClassByText__Group__4 : rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 ;
    public final void rule__ClickClassByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2589:1: ( rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 )
            // InternalBromium.g:2590:2: rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5
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
    // InternalBromium.g:2597:1: rule__ClickClassByText__Group__4__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickClassByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2601:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:2602:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:2602:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:2603:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:2604:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            // InternalBromium.g:2604:3: rule__ClickClassByText__ParameterNamesAssignment_4
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
    // InternalBromium.g:2612:1: rule__ClickClassByText__Group__5 : rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 ;
    public final void rule__ClickClassByText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2616:1: ( rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 )
            // InternalBromium.g:2617:2: rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6
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
    // InternalBromium.g:2624:1: rule__ClickClassByText__Group__5__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickClassByText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2628:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:2629:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:2629:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:2630:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:2631:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            // InternalBromium.g:2631:3: rule__ClickClassByText__ParameterValuesAssignment_5
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
    // InternalBromium.g:2639:1: rule__ClickClassByText__Group__6 : rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 ;
    public final void rule__ClickClassByText__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2643:1: ( rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 )
            // InternalBromium.g:2644:2: rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7
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
    // InternalBromium.g:2651:1: rule__ClickClassByText__Group__6__Impl : ( 'and' ) ;
    public final void rule__ClickClassByText__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2655:1: ( ( 'and' ) )
            // InternalBromium.g:2656:1: ( 'and' )
            {
            // InternalBromium.g:2656:1: ( 'and' )
            // InternalBromium.g:2657:2: 'and'
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
    // InternalBromium.g:2666:1: rule__ClickClassByText__Group__7 : rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 ;
    public final void rule__ClickClassByText__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2670:1: ( rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 )
            // InternalBromium.g:2671:2: rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8
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
    // InternalBromium.g:2678:1: rule__ClickClassByText__Group__7__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) ;
    public final void rule__ClickClassByText__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2682:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:2683:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:2683:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:2684:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:2685:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            // InternalBromium.g:2685:3: rule__ClickClassByText__ParameterNamesAssignment_7
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
    // InternalBromium.g:2693:1: rule__ClickClassByText__Group__8 : rule__ClickClassByText__Group__8__Impl ;
    public final void rule__ClickClassByText__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2697:1: ( rule__ClickClassByText__Group__8__Impl )
            // InternalBromium.g:2698:2: rule__ClickClassByText__Group__8__Impl
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
    // InternalBromium.g:2704:1: rule__ClickClassByText__Group__8__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) ;
    public final void rule__ClickClassByText__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2708:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:2709:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:2709:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:2710:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:2711:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            // InternalBromium.g:2711:3: rule__ClickClassByText__ParameterValuesAssignment_8
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


    // $ANTLR start "rule__ClickDataId__Group__0"
    // InternalBromium.g:2720:1: rule__ClickDataId__Group__0 : rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 ;
    public final void rule__ClickDataId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2724:1: ( rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 )
            // InternalBromium.g:2725:2: rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1
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
    // InternalBromium.g:2732:1: rule__ClickDataId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickDataId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2736:1: ( ( 'click' ) )
            // InternalBromium.g:2737:1: ( 'click' )
            {
            // InternalBromium.g:2737:1: ( 'click' )
            // InternalBromium.g:2738:2: 'click'
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
    // InternalBromium.g:2747:1: rule__ClickDataId__Group__1 : rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 ;
    public final void rule__ClickDataId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2751:1: ( rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 )
            // InternalBromium.g:2752:2: rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2
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
    // InternalBromium.g:2759:1: rule__ClickDataId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickDataId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2763:1: ( ( 'on' ) )
            // InternalBromium.g:2764:1: ( 'on' )
            {
            // InternalBromium.g:2764:1: ( 'on' )
            // InternalBromium.g:2765:2: 'on'
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
    // InternalBromium.g:2774:1: rule__ClickDataId__Group__2 : rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 ;
    public final void rule__ClickDataId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2778:1: ( rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 )
            // InternalBromium.g:2779:2: rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3
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
    // InternalBromium.g:2786:1: rule__ClickDataId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickDataId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2790:1: ( ( 'element' ) )
            // InternalBromium.g:2791:1: ( 'element' )
            {
            // InternalBromium.g:2791:1: ( 'element' )
            // InternalBromium.g:2792:2: 'element'
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
    // InternalBromium.g:2801:1: rule__ClickDataId__Group__3 : rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 ;
    public final void rule__ClickDataId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2805:1: ( rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 )
            // InternalBromium.g:2806:2: rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalBromium.g:2813:1: rule__ClickDataId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickDataId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2817:1: ( ( 'with' ) )
            // InternalBromium.g:2818:1: ( 'with' )
            {
            // InternalBromium.g:2818:1: ( 'with' )
            // InternalBromium.g:2819:2: 'with'
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
    // InternalBromium.g:2828:1: rule__ClickDataId__Group__4 : rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 ;
    public final void rule__ClickDataId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2832:1: ( rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 )
            // InternalBromium.g:2833:2: rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5
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
    // InternalBromium.g:2840:1: rule__ClickDataId__Group__4__Impl : ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickDataId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2844:1: ( ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:2845:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:2845:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:2846:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:2847:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            // InternalBromium.g:2847:3: rule__ClickDataId__ParameterNamesAssignment_4
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
    // InternalBromium.g:2855:1: rule__ClickDataId__Group__5 : rule__ClickDataId__Group__5__Impl ;
    public final void rule__ClickDataId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2859:1: ( rule__ClickDataId__Group__5__Impl )
            // InternalBromium.g:2860:2: rule__ClickDataId__Group__5__Impl
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
    // InternalBromium.g:2866:1: rule__ClickDataId__Group__5__Impl : ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickDataId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2870:1: ( ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:2871:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:2871:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:2872:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:2873:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            // InternalBromium.g:2873:3: rule__ClickDataId__ParameterValuesAssignment_5
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
    // InternalBromium.g:2882:1: rule__ConfirmAlert__Group__0 : rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 ;
    public final void rule__ConfirmAlert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2886:1: ( rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 )
            // InternalBromium.g:2887:2: rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBromium.g:2894:1: rule__ConfirmAlert__Group__0__Impl : ( 'to' ) ;
    public final void rule__ConfirmAlert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2898:1: ( ( 'to' ) )
            // InternalBromium.g:2899:1: ( 'to' )
            {
            // InternalBromium.g:2899:1: ( 'to' )
            // InternalBromium.g:2900:2: 'to'
            {
             before(grammarAccess.getConfirmAlertAccess().getToKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBromium.g:2909:1: rule__ConfirmAlert__Group__1 : rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 ;
    public final void rule__ConfirmAlert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2913:1: ( rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 )
            // InternalBromium.g:2914:2: rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2
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
    // InternalBromium.g:2921:1: rule__ConfirmAlert__Group__1__Impl : ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) ;
    public final void rule__ConfirmAlert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2925:1: ( ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:2926:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:2926:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:2927:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:2928:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            // InternalBromium.g:2928:3: rule__ConfirmAlert__ParameterNamesAssignment_1
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
    // InternalBromium.g:2936:1: rule__ConfirmAlert__Group__2 : rule__ConfirmAlert__Group__2__Impl ;
    public final void rule__ConfirmAlert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2940:1: ( rule__ConfirmAlert__Group__2__Impl )
            // InternalBromium.g:2941:2: rule__ConfirmAlert__Group__2__Impl
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
    // InternalBromium.g:2947:1: rule__ConfirmAlert__Group__2__Impl : ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) ;
    public final void rule__ConfirmAlert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2951:1: ( ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:2952:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:2952:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:2953:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:2954:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            // InternalBromium.g:2954:3: rule__ConfirmAlert__ParameterValuesAssignment_2
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalBromium.g:2963:1: rule__Model__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2967:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2968:2: ( RULE_STRING )
            {
            // InternalBromium.g:2968:2: ( RULE_STRING )
            // InternalBromium.g:2969:3: RULE_STRING
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
    // InternalBromium.g:2978:1: rule__Model__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Model__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2982:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2983:2: ( RULE_STRING )
            {
            // InternalBromium.g:2983:2: ( RULE_STRING )
            // InternalBromium.g:2984:3: RULE_STRING
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
    // InternalBromium.g:2993:1: rule__Model__BaseVersionAssignment_4_1 : ( ruleVersion ) ;
    public final void rule__Model__BaseVersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2997:1: ( ( ruleVersion ) )
            // InternalBromium.g:2998:2: ( ruleVersion )
            {
            // InternalBromium.g:2998:2: ( ruleVersion )
            // InternalBromium.g:2999:3: ruleVersion
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
    // InternalBromium.g:3008:1: rule__Model__ActionsAssignment_7 : ( ruleApplicationAction ) ;
    public final void rule__Model__ActionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3012:1: ( ( ruleApplicationAction ) )
            // InternalBromium.g:3013:2: ( ruleApplicationAction )
            {
            // InternalBromium.g:3013:2: ( ruleApplicationAction )
            // InternalBromium.g:3014:3: ruleApplicationAction
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
    // InternalBromium.g:3023:1: rule__ApplicationAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3027:1: ( ( RULE_ID ) )
            // InternalBromium.g:3028:2: ( RULE_ID )
            {
            // InternalBromium.g:3028:2: ( RULE_ID )
            // InternalBromium.g:3029:3: RULE_ID
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
    // InternalBromium.g:3038:1: rule__ApplicationAction__SyntaxDefinitionsAssignment_3 : ( ruleSyntaxDefinition ) ;
    public final void rule__ApplicationAction__SyntaxDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3042:1: ( ( ruleSyntaxDefinition ) )
            // InternalBromium.g:3043:2: ( ruleSyntaxDefinition )
            {
            // InternalBromium.g:3043:2: ( ruleSyntaxDefinition )
            // InternalBromium.g:3044:3: ruleSyntaxDefinition
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
    // InternalBromium.g:3053:1: rule__ApplicationAction__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__ApplicationAction__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3057:1: ( ( rulePrecondition ) )
            // InternalBromium.g:3058:2: ( rulePrecondition )
            {
            // InternalBromium.g:3058:2: ( rulePrecondition )
            // InternalBromium.g:3059:3: rulePrecondition
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
    // InternalBromium.g:3068:1: rule__ApplicationAction__WebDriverActionAssignment_5 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__WebDriverActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3072:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:3073:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:3073:2: ( ruleWebDriverAction )
            // InternalBromium.g:3074:3: ruleWebDriverAction
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
    // InternalBromium.g:3083:1: rule__ApplicationAction__ExpectHttpRequestAssignment_6 : ( ruleExpectHttpRequest ) ;
    public final void rule__ApplicationAction__ExpectHttpRequestAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3087:1: ( ( ruleExpectHttpRequest ) )
            // InternalBromium.g:3088:2: ( ruleExpectHttpRequest )
            {
            // InternalBromium.g:3088:2: ( ruleExpectHttpRequest )
            // InternalBromium.g:3089:3: ruleExpectHttpRequest
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
    // InternalBromium.g:3098:1: rule__ApplicationAction__PostconditionAssignment_7 : ( rulePostcondition ) ;
    public final void rule__ApplicationAction__PostconditionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3102:1: ( ( rulePostcondition ) )
            // InternalBromium.g:3103:2: ( rulePostcondition )
            {
            // InternalBromium.g:3103:2: ( rulePostcondition )
            // InternalBromium.g:3104:3: rulePostcondition
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
    // InternalBromium.g:3113:1: rule__SyntaxDefinition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SyntaxDefinition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3117:1: ( ( RULE_STRING ) )
            // InternalBromium.g:3118:2: ( RULE_STRING )
            {
            // InternalBromium.g:3118:2: ( RULE_STRING )
            // InternalBromium.g:3119:3: RULE_STRING
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
    // InternalBromium.g:3128:1: rule__SyntaxDefinition__ParameterAssignment_2 : ( ruleExposedParameter ) ;
    public final void rule__SyntaxDefinition__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3132:1: ( ( ruleExposedParameter ) )
            // InternalBromium.g:3133:2: ( ruleExposedParameter )
            {
            // InternalBromium.g:3133:2: ( ruleExposedParameter )
            // InternalBromium.g:3134:3: ruleExposedParameter
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
    // InternalBromium.g:3143:1: rule__Precondition__ActionAssignment_1 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Precondition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3147:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:3148:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:3148:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:3149:3: ruleWebDriverActionCondition
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
    // InternalBromium.g:3158:1: rule__Postcondition__ActionAssignment_3 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Postcondition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3162:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:3163:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:3163:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:3164:3: ruleWebDriverActionCondition
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
    // InternalBromium.g:3173:1: rule__ExpectHttpRequest__NotAssignment_1_1 : ( ( 'not' ) ) ;
    public final void rule__ExpectHttpRequest__NotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3177:1: ( ( ( 'not' ) ) )
            // InternalBromium.g:3178:2: ( ( 'not' ) )
            {
            // InternalBromium.g:3178:2: ( ( 'not' ) )
            // InternalBromium.g:3179:3: ( 'not' )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            // InternalBromium.g:3180:3: ( 'not' )
            // InternalBromium.g:3181:4: 'not'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBromium.g:3192:1: rule__ElementByCssToBePresent__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__ElementByCssToBePresent__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3196:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:3197:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:3197:2: ( ( 'selector' ) )
            // InternalBromium.g:3198:3: ( 'selector' )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:3199:3: ( 'selector' )
            // InternalBromium.g:3200:4: 'selector'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:3211:1: rule__ElementByCssToBePresent__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ElementByCssToBePresent__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3215:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3216:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3216:2: ( ruleParameterValue )
            // InternalBromium.g:3217:3: ruleParameterValue
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
    // InternalBromium.g:3226:1: rule__ClickCssSelector__ParameterNamesAssignment_5 : ( ( 'selector' ) ) ;
    public final void rule__ClickCssSelector__ParameterNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3230:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:3231:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:3231:2: ( ( 'selector' ) )
            // InternalBromium.g:3232:3: ( 'selector' )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            // InternalBromium.g:3233:3: ( 'selector' )
            // InternalBromium.g:3234:4: 'selector'
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:3245:1: rule__ClickCssSelector__ParameterValuesAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__ClickCssSelector__ParameterValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3249:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3250:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3250:2: ( ruleParameterValue )
            // InternalBromium.g:3251:3: ruleParameterValue
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
    // InternalBromium.g:3260:1: rule__PageLoad__ParameterNamesAssignment_1 : ( ( 'page' ) ) ;
    public final void rule__PageLoad__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3264:1: ( ( ( 'page' ) ) )
            // InternalBromium.g:3265:2: ( ( 'page' ) )
            {
            // InternalBromium.g:3265:2: ( ( 'page' ) )
            // InternalBromium.g:3266:3: ( 'page' )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            // InternalBromium.g:3267:3: ( 'page' )
            // InternalBromium.g:3268:4: 'page'
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBromium.g:3279:1: rule__PageLoad__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__PageLoad__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3283:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3284:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3284:2: ( ruleParameterValue )
            // InternalBromium.g:3285:3: ruleParameterValue
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
    // InternalBromium.g:3294:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 : ( ( 'text' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3298:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:3299:2: ( ( 'text' ) )
            {
            // InternalBromium.g:3299:2: ( ( 'text' ) )
            // InternalBromium.g:3300:3: ( 'text' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            // InternalBromium.g:3301:3: ( 'text' )
            // InternalBromium.g:3302:4: 'text'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBromium.g:3313:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3317:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3318:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3318:2: ( ruleParameterValue )
            // InternalBromium.g:3319:3: ruleParameterValue
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
    // InternalBromium.g:3328:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 : ( ( 'selector' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3332:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:3333:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:3333:2: ( ( 'selector' ) )
            // InternalBromium.g:3334:3: ( 'selector' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            // InternalBromium.g:3335:3: ( 'selector' )
            // InternalBromium.g:3336:4: 'selector'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:3347:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3351:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3352:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3352:2: ( ruleParameterValue )
            // InternalBromium.g:3353:3: ruleParameterValue
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
    // InternalBromium.g:3362:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3366:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:3367:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:3367:2: ( ( 'selector' ) )
            // InternalBromium.g:3368:3: ( 'selector' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:3369:3: ( 'selector' )
            // InternalBromium.g:3370:4: 'selector'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:3381:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3385:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3386:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3386:2: ( ruleParameterValue )
            // InternalBromium.g:3387:3: ruleParameterValue
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
    // InternalBromium.g:3396:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 : ( ( 'text' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3400:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:3401:2: ( ( 'text' ) )
            {
            // InternalBromium.g:3401:2: ( ( 'text' ) )
            // InternalBromium.g:3402:3: ( 'text' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            // InternalBromium.g:3403:3: ( 'text' )
            // InternalBromium.g:3404:4: 'text'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBromium.g:3415:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3419:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3420:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3420:2: ( ruleParameterValue )
            // InternalBromium.g:3421:3: ruleParameterValue
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
    // InternalBromium.g:3430:1: rule__ClickClassByText__ParameterNamesAssignment_4 : ( ( 'class' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3434:1: ( ( ( 'class' ) ) )
            // InternalBromium.g:3435:2: ( ( 'class' ) )
            {
            // InternalBromium.g:3435:2: ( ( 'class' ) )
            // InternalBromium.g:3436:3: ( 'class' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            // InternalBromium.g:3437:3: ( 'class' )
            // InternalBromium.g:3438:4: 'class'
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBromium.g:3449:1: rule__ClickClassByText__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3453:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3454:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3454:2: ( ruleParameterValue )
            // InternalBromium.g:3455:3: ruleParameterValue
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
    // InternalBromium.g:3464:1: rule__ClickClassByText__ParameterNamesAssignment_7 : ( ( 'text' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3468:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:3469:2: ( ( 'text' ) )
            {
            // InternalBromium.g:3469:2: ( ( 'text' ) )
            // InternalBromium.g:3470:3: ( 'text' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            // InternalBromium.g:3471:3: ( 'text' )
            // InternalBromium.g:3472:4: 'text'
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBromium.g:3483:1: rule__ClickClassByText__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3487:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3488:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3488:2: ( ruleParameterValue )
            // InternalBromium.g:3489:3: ruleParameterValue
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


    // $ANTLR start "rule__ClickDataId__ParameterNamesAssignment_4"
    // InternalBromium.g:3498:1: rule__ClickDataId__ParameterNamesAssignment_4 : ( ( 'dataId' ) ) ;
    public final void rule__ClickDataId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3502:1: ( ( ( 'dataId' ) ) )
            // InternalBromium.g:3503:2: ( ( 'dataId' ) )
            {
            // InternalBromium.g:3503:2: ( ( 'dataId' ) )
            // InternalBromium.g:3504:3: ( 'dataId' )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            // InternalBromium.g:3505:3: ( 'dataId' )
            // InternalBromium.g:3506:4: 'dataId'
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBromium.g:3517:1: rule__ClickDataId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickDataId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3521:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3522:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3522:2: ( ruleParameterValue )
            // InternalBromium.g:3523:3: ruleParameterValue
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
    // InternalBromium.g:3532:1: rule__ConfirmAlert__ParameterNamesAssignment_1 : ( ( 'confirm' ) ) ;
    public final void rule__ConfirmAlert__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3536:1: ( ( ( 'confirm' ) ) )
            // InternalBromium.g:3537:2: ( ( 'confirm' ) )
            {
            // InternalBromium.g:3537:2: ( ( 'confirm' ) )
            // InternalBromium.g:3538:3: ( 'confirm' )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            // InternalBromium.g:3539:3: ( 'confirm' )
            // InternalBromium.g:3540:4: 'confirm'
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBromium.g:3551:1: rule__ConfirmAlert__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ConfirmAlert__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3555:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:3556:2: ( ruleParameterValue )
            {
            // InternalBromium.g:3556:2: ( ruleParameterValue )
            // InternalBromium.g:3557:3: ruleParameterValue
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


    // $ANTLR start "rule__ParameterValue__ContentAssignment_0"
    // InternalBromium.g:3566:1: rule__ParameterValue__ContentAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ParameterValue__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3570:1: ( ( RULE_STRING ) )
            // InternalBromium.g:3571:2: ( RULE_STRING )
            {
            // InternalBromium.g:3571:2: ( RULE_STRING )
            // InternalBromium.g:3572:3: RULE_STRING
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
    // InternalBromium.g:3581:1: rule__ParameterValue__ExposedParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterValue__ExposedParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3585:1: ( ( ( RULE_ID ) ) )
            // InternalBromium.g:3586:2: ( ( RULE_ID ) )
            {
            // InternalBromium.g:3586:2: ( ( RULE_ID ) )
            // InternalBromium.g:3587:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterCrossReference_1_0()); 
            // InternalBromium.g:3588:3: ( RULE_ID )
            // InternalBromium.g:3589:4: RULE_ID
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
    // InternalBromium.g:3600:1: rule__ExposedParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExposedParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3604:1: ( ( RULE_ID ) )
            // InternalBromium.g:3605:2: ( RULE_ID )
            {
            // InternalBromium.g:3605:2: ( RULE_ID )
            // InternalBromium.g:3606:3: RULE_ID
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
    static final String dfa_2s = "\1\33\1\34\1\uffff\1\35\1\51\1\4\2\36\2\uffff";
    static final String dfa_3s = "\1\47\1\34\1\uffff\1\35\1\51\1\5\2\45\2\uffff";
    static final String dfa_4s = "\2\uffff\1\3\5\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\13\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\11\6\uffff\1\10",
            "\1\11\6\uffff\1\10",
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
            return "527:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );";
        }
    }
    static final String dfa_7s = "\1\40\1\41\2\uffff\1\33\1\34\1\35\3\uffff";
    static final String dfa_8s = "\1\43\1\41\2\uffff\1\33\1\34\1\55\3\uffff";
    static final String dfa_9s = "\2\uffff\1\3\1\4\3\uffff\1\5\1\2\1\1";
    static final String[] dfa_10s = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\11\16\uffff\1\10\1\7",
            "",
            "",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "554:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) );";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000D00080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});

}