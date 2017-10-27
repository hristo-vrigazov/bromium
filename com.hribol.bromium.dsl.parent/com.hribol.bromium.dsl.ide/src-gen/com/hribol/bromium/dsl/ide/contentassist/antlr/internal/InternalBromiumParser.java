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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'actions'", "'{'", "'}'", "'from'", "'action'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'not'", "'expect'", "'http'", "'request'", "'element'", "'with'", "'css'", "'selector'", "'is'", "'clickable'", "'click'", "'on'", "'load'", "'page'", "'type'", "'in'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleWebDriverAction"
    // InternalBromium.g:103:1: entryRuleWebDriverAction : ruleWebDriverAction EOF ;
    public final void entryRuleWebDriverAction() throws RecognitionException {
        try {
            // InternalBromium.g:104:1: ( ruleWebDriverAction EOF )
            // InternalBromium.g:105:1: ruleWebDriverAction EOF
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
    // InternalBromium.g:112:1: ruleWebDriverAction : ( ( rule__WebDriverAction__Alternatives ) ) ;
    public final void ruleWebDriverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:116:2: ( ( ( rule__WebDriverAction__Alternatives ) ) )
            // InternalBromium.g:117:2: ( ( rule__WebDriverAction__Alternatives ) )
            {
            // InternalBromium.g:117:2: ( ( rule__WebDriverAction__Alternatives ) )
            // InternalBromium.g:118:3: ( rule__WebDriverAction__Alternatives )
            {
             before(grammarAccess.getWebDriverActionAccess().getAlternatives()); 
            // InternalBromium.g:119:3: ( rule__WebDriverAction__Alternatives )
            // InternalBromium.g:119:4: rule__WebDriverAction__Alternatives
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
    // InternalBromium.g:128:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalBromium.g:129:1: ( rulePrecondition EOF )
            // InternalBromium.g:130:1: rulePrecondition EOF
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
    // InternalBromium.g:137:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:141:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalBromium.g:142:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalBromium.g:142:2: ( ( rule__Precondition__Group__0 ) )
            // InternalBromium.g:143:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalBromium.g:144:3: ( rule__Precondition__Group__0 )
            // InternalBromium.g:144:4: rule__Precondition__Group__0
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
    // InternalBromium.g:153:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalBromium.g:154:1: ( rulePostcondition EOF )
            // InternalBromium.g:155:1: rulePostcondition EOF
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
    // InternalBromium.g:162:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:166:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalBromium.g:167:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalBromium.g:167:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalBromium.g:168:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalBromium.g:169:3: ( rule__Postcondition__Group__0 )
            // InternalBromium.g:169:4: rule__Postcondition__Group__0
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
    // InternalBromium.g:178:1: entryRuleExpectHttpRequest : ruleExpectHttpRequest EOF ;
    public final void entryRuleExpectHttpRequest() throws RecognitionException {
        try {
            // InternalBromium.g:179:1: ( ruleExpectHttpRequest EOF )
            // InternalBromium.g:180:1: ruleExpectHttpRequest EOF
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
    // InternalBromium.g:187:1: ruleExpectHttpRequest : ( ( rule__ExpectHttpRequest__Group__0 ) ) ;
    public final void ruleExpectHttpRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:191:2: ( ( ( rule__ExpectHttpRequest__Group__0 ) ) )
            // InternalBromium.g:192:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            {
            // InternalBromium.g:192:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            // InternalBromium.g:193:3: ( rule__ExpectHttpRequest__Group__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup()); 
            // InternalBromium.g:194:3: ( rule__ExpectHttpRequest__Group__0 )
            // InternalBromium.g:194:4: rule__ExpectHttpRequest__Group__0
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


    // $ANTLR start "entryRuleElementWithIdIsPresent"
    // InternalBromium.g:203:1: entryRuleElementWithIdIsPresent : ruleElementWithIdIsPresent EOF ;
    public final void entryRuleElementWithIdIsPresent() throws RecognitionException {
        try {
            // InternalBromium.g:204:1: ( ruleElementWithIdIsPresent EOF )
            // InternalBromium.g:205:1: ruleElementWithIdIsPresent EOF
            {
             before(grammarAccess.getElementWithIdIsPresentRule()); 
            pushFollow(FOLLOW_1);
            ruleElementWithIdIsPresent();

            state._fsp--;

             after(grammarAccess.getElementWithIdIsPresentRule()); 
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
    // $ANTLR end "entryRuleElementWithIdIsPresent"


    // $ANTLR start "ruleElementWithIdIsPresent"
    // InternalBromium.g:212:1: ruleElementWithIdIsPresent : ( ( rule__ElementWithIdIsPresent__Group__0 ) ) ;
    public final void ruleElementWithIdIsPresent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:216:2: ( ( ( rule__ElementWithIdIsPresent__Group__0 ) ) )
            // InternalBromium.g:217:2: ( ( rule__ElementWithIdIsPresent__Group__0 ) )
            {
            // InternalBromium.g:217:2: ( ( rule__ElementWithIdIsPresent__Group__0 ) )
            // InternalBromium.g:218:3: ( rule__ElementWithIdIsPresent__Group__0 )
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getGroup()); 
            // InternalBromium.g:219:3: ( rule__ElementWithIdIsPresent__Group__0 )
            // InternalBromium.g:219:4: rule__ElementWithIdIsPresent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementWithIdIsPresentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementWithIdIsPresent"


    // $ANTLR start "entryRuleClickOnElementWithId"
    // InternalBromium.g:228:1: entryRuleClickOnElementWithId : ruleClickOnElementWithId EOF ;
    public final void entryRuleClickOnElementWithId() throws RecognitionException {
        try {
            // InternalBromium.g:229:1: ( ruleClickOnElementWithId EOF )
            // InternalBromium.g:230:1: ruleClickOnElementWithId EOF
            {
             before(grammarAccess.getClickOnElementWithIdRule()); 
            pushFollow(FOLLOW_1);
            ruleClickOnElementWithId();

            state._fsp--;

             after(grammarAccess.getClickOnElementWithIdRule()); 
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
    // $ANTLR end "entryRuleClickOnElementWithId"


    // $ANTLR start "ruleClickOnElementWithId"
    // InternalBromium.g:237:1: ruleClickOnElementWithId : ( ( rule__ClickOnElementWithId__Group__0 ) ) ;
    public final void ruleClickOnElementWithId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:241:2: ( ( ( rule__ClickOnElementWithId__Group__0 ) ) )
            // InternalBromium.g:242:2: ( ( rule__ClickOnElementWithId__Group__0 ) )
            {
            // InternalBromium.g:242:2: ( ( rule__ClickOnElementWithId__Group__0 ) )
            // InternalBromium.g:243:3: ( rule__ClickOnElementWithId__Group__0 )
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getGroup()); 
            // InternalBromium.g:244:3: ( rule__ClickOnElementWithId__Group__0 )
            // InternalBromium.g:244:4: rule__ClickOnElementWithId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickOnElementWithIdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickOnElementWithId"


    // $ANTLR start "entryRulePageLoad"
    // InternalBromium.g:253:1: entryRulePageLoad : rulePageLoad EOF ;
    public final void entryRulePageLoad() throws RecognitionException {
        try {
            // InternalBromium.g:254:1: ( rulePageLoad EOF )
            // InternalBromium.g:255:1: rulePageLoad EOF
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
    // InternalBromium.g:262:1: rulePageLoad : ( ( rule__PageLoad__Group__0 ) ) ;
    public final void rulePageLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:266:2: ( ( ( rule__PageLoad__Group__0 ) ) )
            // InternalBromium.g:267:2: ( ( rule__PageLoad__Group__0 ) )
            {
            // InternalBromium.g:267:2: ( ( rule__PageLoad__Group__0 ) )
            // InternalBromium.g:268:3: ( rule__PageLoad__Group__0 )
            {
             before(grammarAccess.getPageLoadAccess().getGroup()); 
            // InternalBromium.g:269:3: ( rule__PageLoad__Group__0 )
            // InternalBromium.g:269:4: rule__PageLoad__Group__0
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
    // InternalBromium.g:278:1: entryRuleTypeTextInElementFoundByCssSelector : ruleTypeTextInElementFoundByCssSelector EOF ;
    public final void entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:279:1: ( ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:280:1: ruleTypeTextInElementFoundByCssSelector EOF
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
    // InternalBromium.g:287:1: ruleTypeTextInElementFoundByCssSelector : ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) ;
    public final void ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:291:2: ( ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) )
            // InternalBromium.g:292:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            {
            // InternalBromium.g:292:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            // InternalBromium.g:293:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); 
            // InternalBromium.g:294:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            // InternalBromium.g:294:4: rule__TypeTextInElementFoundByCssSelector__Group__0
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


    // $ANTLR start "entryRuleVersion"
    // InternalBromium.g:303:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalBromium.g:304:1: ( ruleVersion EOF )
            // InternalBromium.g:305:1: ruleVersion EOF
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
    // InternalBromium.g:312:1: ruleVersion : ( RULE_STRING ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:316:2: ( ( RULE_STRING ) )
            // InternalBromium.g:317:2: ( RULE_STRING )
            {
            // InternalBromium.g:317:2: ( RULE_STRING )
            // InternalBromium.g:318:3: RULE_STRING
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


    // $ANTLR start "rule__WebDriverAction__Alternatives"
    // InternalBromium.g:327:1: rule__WebDriverAction__Alternatives : ( ( ruleElementWithIdIsPresent ) | ( ruleClickOnElementWithId ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) );
    public final void rule__WebDriverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:331:1: ( ( ruleElementWithIdIsPresent ) | ( ruleClickOnElementWithId ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            case 37:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBromium.g:332:2: ( ruleElementWithIdIsPresent )
                    {
                    // InternalBromium.g:332:2: ( ruleElementWithIdIsPresent )
                    // InternalBromium.g:333:3: ruleElementWithIdIsPresent
                    {
                     before(grammarAccess.getWebDriverActionAccess().getElementWithIdIsPresentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleElementWithIdIsPresent();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getElementWithIdIsPresentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:338:2: ( ruleClickOnElementWithId )
                    {
                    // InternalBromium.g:338:2: ( ruleClickOnElementWithId )
                    // InternalBromium.g:339:3: ruleClickOnElementWithId
                    {
                     before(grammarAccess.getWebDriverActionAccess().getClickOnElementWithIdParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClickOnElementWithId();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getClickOnElementWithIdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBromium.g:344:2: ( rulePageLoad )
                    {
                    // InternalBromium.g:344:2: ( rulePageLoad )
                    // InternalBromium.g:345:3: rulePageLoad
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
                    // InternalBromium.g:350:2: ( ruleTypeTextInElementFoundByCssSelector )
                    {
                    // InternalBromium.g:350:2: ( ruleTypeTextInElementFoundByCssSelector )
                    // InternalBromium.g:351:3: ruleTypeTextInElementFoundByCssSelector
                    {
                     before(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeTextInElementFoundByCssSelector();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3()); 

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalBromium.g:360:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:364:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBromium.g:365:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalBromium.g:372:1: rule__Model__Group__0__Impl : ( 'name' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:376:1: ( ( 'name' ) )
            // InternalBromium.g:377:1: ( 'name' )
            {
            // InternalBromium.g:377:1: ( 'name' )
            // InternalBromium.g:378:2: 'name'
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
    // InternalBromium.g:387:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:391:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBromium.g:392:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalBromium.g:399:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:403:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalBromium.g:404:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalBromium.g:404:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalBromium.g:405:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalBromium.g:406:2: ( rule__Model__NameAssignment_1 )
            // InternalBromium.g:406:3: rule__Model__NameAssignment_1
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
    // InternalBromium.g:414:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:418:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBromium.g:419:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalBromium.g:426:1: rule__Model__Group__2__Impl : ( 'version' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:430:1: ( ( 'version' ) )
            // InternalBromium.g:431:1: ( 'version' )
            {
            // InternalBromium.g:431:1: ( 'version' )
            // InternalBromium.g:432:2: 'version'
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
    // InternalBromium.g:441:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:445:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBromium.g:446:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalBromium.g:453:1: rule__Model__Group__3__Impl : ( ( rule__Model__VersionAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:457:1: ( ( ( rule__Model__VersionAssignment_3 ) ) )
            // InternalBromium.g:458:1: ( ( rule__Model__VersionAssignment_3 ) )
            {
            // InternalBromium.g:458:1: ( ( rule__Model__VersionAssignment_3 ) )
            // InternalBromium.g:459:2: ( rule__Model__VersionAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_3()); 
            // InternalBromium.g:460:2: ( rule__Model__VersionAssignment_3 )
            // InternalBromium.g:460:3: rule__Model__VersionAssignment_3
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
    // InternalBromium.g:468:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:472:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBromium.g:473:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalBromium.g:480:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:484:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalBromium.g:485:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalBromium.g:485:1: ( ( rule__Model__Group_4__0 )? )
            // InternalBromium.g:486:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalBromium.g:487:2: ( rule__Model__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBromium.g:487:3: rule__Model__Group_4__0
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
    // InternalBromium.g:495:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:499:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalBromium.g:500:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalBromium.g:507:1: rule__Model__Group__5__Impl : ( 'actions' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:511:1: ( ( 'actions' ) )
            // InternalBromium.g:512:1: ( 'actions' )
            {
            // InternalBromium.g:512:1: ( 'actions' )
            // InternalBromium.g:513:2: 'actions'
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
    // InternalBromium.g:522:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:526:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalBromium.g:527:2: rule__Model__Group__6__Impl rule__Model__Group__7
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
    // InternalBromium.g:534:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:538:1: ( ( '{' ) )
            // InternalBromium.g:539:1: ( '{' )
            {
            // InternalBromium.g:539:1: ( '{' )
            // InternalBromium.g:540:2: '{'
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
    // InternalBromium.g:549:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:553:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalBromium.g:554:2: rule__Model__Group__7__Impl rule__Model__Group__8
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
    // InternalBromium.g:561:1: rule__Model__Group__7__Impl : ( ( rule__Model__ActionsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:565:1: ( ( ( rule__Model__ActionsAssignment_7 )* ) )
            // InternalBromium.g:566:1: ( ( rule__Model__ActionsAssignment_7 )* )
            {
            // InternalBromium.g:566:1: ( ( rule__Model__ActionsAssignment_7 )* )
            // InternalBromium.g:567:2: ( rule__Model__ActionsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getActionsAssignment_7()); 
            // InternalBromium.g:568:2: ( rule__Model__ActionsAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBromium.g:568:3: rule__Model__ActionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__ActionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalBromium.g:576:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:580:1: ( rule__Model__Group__8__Impl )
            // InternalBromium.g:581:2: rule__Model__Group__8__Impl
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
    // InternalBromium.g:587:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:591:1: ( ( '}' ) )
            // InternalBromium.g:592:1: ( '}' )
            {
            // InternalBromium.g:592:1: ( '}' )
            // InternalBromium.g:593:2: '}'
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
    // InternalBromium.g:603:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:607:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalBromium.g:608:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalBromium.g:615:1: rule__Model__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:619:1: ( ( 'from' ) )
            // InternalBromium.g:620:1: ( 'from' )
            {
            // InternalBromium.g:620:1: ( 'from' )
            // InternalBromium.g:621:2: 'from'
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
    // InternalBromium.g:630:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:634:1: ( rule__Model__Group_4__1__Impl )
            // InternalBromium.g:635:2: rule__Model__Group_4__1__Impl
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
    // InternalBromium.g:641:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__BaseVersionAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:645:1: ( ( ( rule__Model__BaseVersionAssignment_4_1 ) ) )
            // InternalBromium.g:646:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            {
            // InternalBromium.g:646:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            // InternalBromium.g:647:2: ( rule__Model__BaseVersionAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); 
            // InternalBromium.g:648:2: ( rule__Model__BaseVersionAssignment_4_1 )
            // InternalBromium.g:648:3: rule__Model__BaseVersionAssignment_4_1
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
    // InternalBromium.g:657:1: rule__ApplicationAction__Group__0 : rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 ;
    public final void rule__ApplicationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:661:1: ( rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 )
            // InternalBromium.g:662:2: rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBromium.g:669:1: rule__ApplicationAction__Group__0__Impl : ( 'action' ) ;
    public final void rule__ApplicationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:673:1: ( ( 'action' ) )
            // InternalBromium.g:674:1: ( 'action' )
            {
            // InternalBromium.g:674:1: ( 'action' )
            // InternalBromium.g:675:2: 'action'
            {
             before(grammarAccess.getApplicationActionAccess().getActionKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getActionKeyword_0()); 

            }


            }

        }
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
    // InternalBromium.g:684:1: rule__ApplicationAction__Group__1 : rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 ;
    public final void rule__ApplicationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:688:1: ( rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 )
            // InternalBromium.g:689:2: rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBromium.g:696:1: rule__ApplicationAction__Group__1__Impl : ( ( rule__ApplicationAction__ActionIdAssignment_1 ) ) ;
    public final void rule__ApplicationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:700:1: ( ( ( rule__ApplicationAction__ActionIdAssignment_1 ) ) )
            // InternalBromium.g:701:1: ( ( rule__ApplicationAction__ActionIdAssignment_1 ) )
            {
            // InternalBromium.g:701:1: ( ( rule__ApplicationAction__ActionIdAssignment_1 ) )
            // InternalBromium.g:702:2: ( rule__ApplicationAction__ActionIdAssignment_1 )
            {
             before(grammarAccess.getApplicationActionAccess().getActionIdAssignment_1()); 
            // InternalBromium.g:703:2: ( rule__ApplicationAction__ActionIdAssignment_1 )
            // InternalBromium.g:703:3: rule__ApplicationAction__ActionIdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__ActionIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getActionIdAssignment_1()); 

            }


            }

        }
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
    // InternalBromium.g:711:1: rule__ApplicationAction__Group__2 : rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 ;
    public final void rule__ApplicationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:715:1: ( rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 )
            // InternalBromium.g:716:2: rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalBromium.g:723:1: rule__ApplicationAction__Group__2__Impl : ( ( rule__ApplicationAction__PreconditionAssignment_2 )? ) ;
    public final void rule__ApplicationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:727:1: ( ( ( rule__ApplicationAction__PreconditionAssignment_2 )? ) )
            // InternalBromium.g:728:1: ( ( rule__ApplicationAction__PreconditionAssignment_2 )? )
            {
            // InternalBromium.g:728:1: ( ( rule__ApplicationAction__PreconditionAssignment_2 )? )
            // InternalBromium.g:729:2: ( rule__ApplicationAction__PreconditionAssignment_2 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_2()); 
            // InternalBromium.g:730:2: ( rule__ApplicationAction__PreconditionAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBromium.g:730:3: rule__ApplicationAction__PreconditionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__PreconditionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_2()); 

            }


            }

        }
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
    // InternalBromium.g:738:1: rule__ApplicationAction__Group__3 : rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 ;
    public final void rule__ApplicationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:742:1: ( rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 )
            // InternalBromium.g:743:2: rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalBromium.g:750:1: rule__ApplicationAction__Group__3__Impl : ( ( rule__ApplicationAction__WebDriverActionAssignment_3 ) ) ;
    public final void rule__ApplicationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:754:1: ( ( ( rule__ApplicationAction__WebDriverActionAssignment_3 ) ) )
            // InternalBromium.g:755:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_3 ) )
            {
            // InternalBromium.g:755:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_3 ) )
            // InternalBromium.g:756:2: ( rule__ApplicationAction__WebDriverActionAssignment_3 )
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_3()); 
            // InternalBromium.g:757:2: ( rule__ApplicationAction__WebDriverActionAssignment_3 )
            // InternalBromium.g:757:3: rule__ApplicationAction__WebDriverActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__WebDriverActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_3()); 

            }


            }

        }
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
    // InternalBromium.g:765:1: rule__ApplicationAction__Group__4 : rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 ;
    public final void rule__ApplicationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:769:1: ( rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 )
            // InternalBromium.g:770:2: rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalBromium.g:777:1: rule__ApplicationAction__Group__4__Impl : ( ( rule__ApplicationAction__PostconditionAssignment_4 )? ) ;
    public final void rule__ApplicationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:781:1: ( ( ( rule__ApplicationAction__PostconditionAssignment_4 )? ) )
            // InternalBromium.g:782:1: ( ( rule__ApplicationAction__PostconditionAssignment_4 )? )
            {
            // InternalBromium.g:782:1: ( ( rule__ApplicationAction__PostconditionAssignment_4 )? )
            // InternalBromium.g:783:2: ( rule__ApplicationAction__PostconditionAssignment_4 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_4()); 
            // InternalBromium.g:784:2: ( rule__ApplicationAction__PostconditionAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBromium.g:784:3: rule__ApplicationAction__PostconditionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__PostconditionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_4()); 

            }


            }

        }
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
    // InternalBromium.g:792:1: rule__ApplicationAction__Group__5 : rule__ApplicationAction__Group__5__Impl ;
    public final void rule__ApplicationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:796:1: ( rule__ApplicationAction__Group__5__Impl )
            // InternalBromium.g:797:2: rule__ApplicationAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__5__Impl();

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
    // InternalBromium.g:803:1: rule__ApplicationAction__Group__5__Impl : ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_5 ) ) ;
    public final void rule__ApplicationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:807:1: ( ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_5 ) ) )
            // InternalBromium.g:808:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_5 ) )
            {
            // InternalBromium.g:808:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_5 ) )
            // InternalBromium.g:809:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_5 )
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_5()); 
            // InternalBromium.g:810:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_5 )
            // InternalBromium.g:810:3: rule__ApplicationAction__ExpectHttpRequestAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__ExpectHttpRequestAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Precondition__Group__0"
    // InternalBromium.g:819:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:823:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalBromium.g:824:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBromium.g:831:1: rule__Precondition__Group__0__Impl : ( 'when' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:835:1: ( ( 'when' ) )
            // InternalBromium.g:836:1: ( 'when' )
            {
            // InternalBromium.g:836:1: ( 'when' )
            // InternalBromium.g:837:2: 'when'
            {
             before(grammarAccess.getPreconditionAccess().getWhenKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBromium.g:846:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:850:1: ( rule__Precondition__Group__1__Impl )
            // InternalBromium.g:851:2: rule__Precondition__Group__1__Impl
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
    // InternalBromium.g:857:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ActionAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:861:1: ( ( ( rule__Precondition__ActionAssignment_1 ) ) )
            // InternalBromium.g:862:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            {
            // InternalBromium.g:862:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            // InternalBromium.g:863:2: ( rule__Precondition__ActionAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getActionAssignment_1()); 
            // InternalBromium.g:864:2: ( rule__Precondition__ActionAssignment_1 )
            // InternalBromium.g:864:3: rule__Precondition__ActionAssignment_1
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
    // InternalBromium.g:873:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:877:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalBromium.g:878:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBromium.g:885:1: rule__Postcondition__Group__0__Impl : ( 'then' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:889:1: ( ( 'then' ) )
            // InternalBromium.g:890:1: ( 'then' )
            {
            // InternalBromium.g:890:1: ( 'then' )
            // InternalBromium.g:891:2: 'then'
            {
             before(grammarAccess.getPostconditionAccess().getThenKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBromium.g:900:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:904:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalBromium.g:905:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalBromium.g:912:1: rule__Postcondition__Group__1__Impl : ( 'make' ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:916:1: ( ( 'make' ) )
            // InternalBromium.g:917:1: ( 'make' )
            {
            // InternalBromium.g:917:1: ( 'make' )
            // InternalBromium.g:918:2: 'make'
            {
             before(grammarAccess.getPostconditionAccess().getMakeKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:927:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:931:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalBromium.g:932:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalBromium.g:939:1: rule__Postcondition__Group__2__Impl : ( 'sure' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:943:1: ( ( 'sure' ) )
            // InternalBromium.g:944:1: ( 'sure' )
            {
            // InternalBromium.g:944:1: ( 'sure' )
            // InternalBromium.g:945:2: 'sure'
            {
             before(grammarAccess.getPostconditionAccess().getSureKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:954:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:958:1: ( rule__Postcondition__Group__3__Impl )
            // InternalBromium.g:959:2: rule__Postcondition__Group__3__Impl
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
    // InternalBromium.g:965:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__PostconditionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:969:1: ( ( ( rule__Postcondition__PostconditionAssignment_3 ) ) )
            // InternalBromium.g:970:1: ( ( rule__Postcondition__PostconditionAssignment_3 ) )
            {
            // InternalBromium.g:970:1: ( ( rule__Postcondition__PostconditionAssignment_3 ) )
            // InternalBromium.g:971:2: ( rule__Postcondition__PostconditionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getPostconditionAssignment_3()); 
            // InternalBromium.g:972:2: ( rule__Postcondition__PostconditionAssignment_3 )
            // InternalBromium.g:972:3: rule__Postcondition__PostconditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__PostconditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getPostconditionAssignment_3()); 

            }


            }

        }
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
    // InternalBromium.g:981:1: rule__ExpectHttpRequest__Group__0 : rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 ;
    public final void rule__ExpectHttpRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:985:1: ( rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 )
            // InternalBromium.g:986:2: rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1
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
    // InternalBromium.g:993:1: rule__ExpectHttpRequest__Group__0__Impl : ( 'do' ) ;
    public final void rule__ExpectHttpRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:997:1: ( ( 'do' ) )
            // InternalBromium.g:998:1: ( 'do' )
            {
            // InternalBromium.g:998:1: ( 'do' )
            // InternalBromium.g:999:2: 'do'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getDoKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpectHttpRequest__Group__0__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group__1"
    // InternalBromium.g:1008:1: rule__ExpectHttpRequest__Group__1 : rule__ExpectHttpRequest__Group__1__Impl rule__ExpectHttpRequest__Group__2 ;
    public final void rule__ExpectHttpRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1012:1: ( rule__ExpectHttpRequest__Group__1__Impl rule__ExpectHttpRequest__Group__2 )
            // InternalBromium.g:1013:2: rule__ExpectHttpRequest__Group__1__Impl rule__ExpectHttpRequest__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ExpectHttpRequest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group__2();

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
    // InternalBromium.g:1020:1: rule__ExpectHttpRequest__Group__1__Impl : ( ( 'not' )? ) ;
    public final void rule__ExpectHttpRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1024:1: ( ( ( 'not' )? ) )
            // InternalBromium.g:1025:1: ( ( 'not' )? )
            {
            // InternalBromium.g:1025:1: ( ( 'not' )? )
            // InternalBromium.g:1026:2: ( 'not' )?
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotKeyword_1()); 
            // InternalBromium.g:1027:2: ( 'not' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBromium.g:1027:3: 'not'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpectHttpRequestAccess().getNotKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExpectHttpRequest__Group__2"
    // InternalBromium.g:1035:1: rule__ExpectHttpRequest__Group__2 : rule__ExpectHttpRequest__Group__2__Impl rule__ExpectHttpRequest__Group__3 ;
    public final void rule__ExpectHttpRequest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1039:1: ( rule__ExpectHttpRequest__Group__2__Impl rule__ExpectHttpRequest__Group__3 )
            // InternalBromium.g:1040:2: rule__ExpectHttpRequest__Group__2__Impl rule__ExpectHttpRequest__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ExpectHttpRequest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group__3();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group__2"


    // $ANTLR start "rule__ExpectHttpRequest__Group__2__Impl"
    // InternalBromium.g:1047:1: rule__ExpectHttpRequest__Group__2__Impl : ( 'expect' ) ;
    public final void rule__ExpectHttpRequest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1051:1: ( ( 'expect' ) )
            // InternalBromium.g:1052:1: ( 'expect' )
            {
            // InternalBromium.g:1052:1: ( 'expect' )
            // InternalBromium.g:1053:2: 'expect'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpectHttpRequest__Group__2__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group__3"
    // InternalBromium.g:1062:1: rule__ExpectHttpRequest__Group__3 : rule__ExpectHttpRequest__Group__3__Impl rule__ExpectHttpRequest__Group__4 ;
    public final void rule__ExpectHttpRequest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1066:1: ( rule__ExpectHttpRequest__Group__3__Impl rule__ExpectHttpRequest__Group__4 )
            // InternalBromium.g:1067:2: rule__ExpectHttpRequest__Group__3__Impl rule__ExpectHttpRequest__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ExpectHttpRequest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group__4();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group__3"


    // $ANTLR start "rule__ExpectHttpRequest__Group__3__Impl"
    // InternalBromium.g:1074:1: rule__ExpectHttpRequest__Group__3__Impl : ( 'http' ) ;
    public final void rule__ExpectHttpRequest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1078:1: ( ( 'http' ) )
            // InternalBromium.g:1079:1: ( 'http' )
            {
            // InternalBromium.g:1079:1: ( 'http' )
            // InternalBromium.g:1080:2: 'http'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getHttpKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getHttpKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpectHttpRequest__Group__3__Impl"


    // $ANTLR start "rule__ExpectHttpRequest__Group__4"
    // InternalBromium.g:1089:1: rule__ExpectHttpRequest__Group__4 : rule__ExpectHttpRequest__Group__4__Impl ;
    public final void rule__ExpectHttpRequest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1093:1: ( rule__ExpectHttpRequest__Group__4__Impl )
            // InternalBromium.g:1094:2: rule__ExpectHttpRequest__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpectHttpRequest__Group__4__Impl();

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
    // $ANTLR end "rule__ExpectHttpRequest__Group__4"


    // $ANTLR start "rule__ExpectHttpRequest__Group__4__Impl"
    // InternalBromium.g:1100:1: rule__ExpectHttpRequest__Group__4__Impl : ( 'request' ) ;
    public final void rule__ExpectHttpRequest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1104:1: ( ( 'request' ) )
            // InternalBromium.g:1105:1: ( 'request' )
            {
            // InternalBromium.g:1105:1: ( 'request' )
            // InternalBromium.g:1106:2: 'request'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getRequestKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpectHttpRequestAccess().getRequestKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpectHttpRequest__Group__4__Impl"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__0"
    // InternalBromium.g:1116:1: rule__ElementWithIdIsPresent__Group__0 : rule__ElementWithIdIsPresent__Group__0__Impl rule__ElementWithIdIsPresent__Group__1 ;
    public final void rule__ElementWithIdIsPresent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1120:1: ( rule__ElementWithIdIsPresent__Group__0__Impl rule__ElementWithIdIsPresent__Group__1 )
            // InternalBromium.g:1121:2: rule__ElementWithIdIsPresent__Group__0__Impl rule__ElementWithIdIsPresent__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ElementWithIdIsPresent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__Group__1();

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
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__0"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__0__Impl"
    // InternalBromium.g:1128:1: rule__ElementWithIdIsPresent__Group__0__Impl : ( 'element' ) ;
    public final void rule__ElementWithIdIsPresent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1132:1: ( ( 'element' ) )
            // InternalBromium.g:1133:1: ( 'element' )
            {
            // InternalBromium.g:1133:1: ( 'element' )
            // InternalBromium.g:1134:2: 'element'
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getElementKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getElementWithIdIsPresentAccess().getElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__0__Impl"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__1"
    // InternalBromium.g:1143:1: rule__ElementWithIdIsPresent__Group__1 : rule__ElementWithIdIsPresent__Group__1__Impl rule__ElementWithIdIsPresent__Group__2 ;
    public final void rule__ElementWithIdIsPresent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1147:1: ( rule__ElementWithIdIsPresent__Group__1__Impl rule__ElementWithIdIsPresent__Group__2 )
            // InternalBromium.g:1148:2: rule__ElementWithIdIsPresent__Group__1__Impl rule__ElementWithIdIsPresent__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ElementWithIdIsPresent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__Group__2();

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
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__1"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__1__Impl"
    // InternalBromium.g:1155:1: rule__ElementWithIdIsPresent__Group__1__Impl : ( 'with' ) ;
    public final void rule__ElementWithIdIsPresent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1159:1: ( ( 'with' ) )
            // InternalBromium.g:1160:1: ( 'with' )
            {
            // InternalBromium.g:1160:1: ( 'with' )
            // InternalBromium.g:1161:2: 'with'
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getWithKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getElementWithIdIsPresentAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__1__Impl"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__2"
    // InternalBromium.g:1170:1: rule__ElementWithIdIsPresent__Group__2 : rule__ElementWithIdIsPresent__Group__2__Impl rule__ElementWithIdIsPresent__Group__3 ;
    public final void rule__ElementWithIdIsPresent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1174:1: ( rule__ElementWithIdIsPresent__Group__2__Impl rule__ElementWithIdIsPresent__Group__3 )
            // InternalBromium.g:1175:2: rule__ElementWithIdIsPresent__Group__2__Impl rule__ElementWithIdIsPresent__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ElementWithIdIsPresent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__Group__3();

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
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__2"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__2__Impl"
    // InternalBromium.g:1182:1: rule__ElementWithIdIsPresent__Group__2__Impl : ( 'css' ) ;
    public final void rule__ElementWithIdIsPresent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1186:1: ( ( 'css' ) )
            // InternalBromium.g:1187:1: ( 'css' )
            {
            // InternalBromium.g:1187:1: ( 'css' )
            // InternalBromium.g:1188:2: 'css'
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getCssKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getElementWithIdIsPresentAccess().getCssKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__2__Impl"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__3"
    // InternalBromium.g:1197:1: rule__ElementWithIdIsPresent__Group__3 : rule__ElementWithIdIsPresent__Group__3__Impl rule__ElementWithIdIsPresent__Group__4 ;
    public final void rule__ElementWithIdIsPresent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1201:1: ( rule__ElementWithIdIsPresent__Group__3__Impl rule__ElementWithIdIsPresent__Group__4 )
            // InternalBromium.g:1202:2: rule__ElementWithIdIsPresent__Group__3__Impl rule__ElementWithIdIsPresent__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ElementWithIdIsPresent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__Group__4();

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
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__3"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__3__Impl"
    // InternalBromium.g:1209:1: rule__ElementWithIdIsPresent__Group__3__Impl : ( 'selector' ) ;
    public final void rule__ElementWithIdIsPresent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1213:1: ( ( 'selector' ) )
            // InternalBromium.g:1214:1: ( 'selector' )
            {
            // InternalBromium.g:1214:1: ( 'selector' )
            // InternalBromium.g:1215:2: 'selector'
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getSelectorKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getElementWithIdIsPresentAccess().getSelectorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__3__Impl"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__4"
    // InternalBromium.g:1224:1: rule__ElementWithIdIsPresent__Group__4 : rule__ElementWithIdIsPresent__Group__4__Impl rule__ElementWithIdIsPresent__Group__5 ;
    public final void rule__ElementWithIdIsPresent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1228:1: ( rule__ElementWithIdIsPresent__Group__4__Impl rule__ElementWithIdIsPresent__Group__5 )
            // InternalBromium.g:1229:2: rule__ElementWithIdIsPresent__Group__4__Impl rule__ElementWithIdIsPresent__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ElementWithIdIsPresent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__Group__5();

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
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__4"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__4__Impl"
    // InternalBromium.g:1236:1: rule__ElementWithIdIsPresent__Group__4__Impl : ( ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 ) ) ;
    public final void rule__ElementWithIdIsPresent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1240:1: ( ( ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 ) ) )
            // InternalBromium.g:1241:1: ( ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 ) )
            {
            // InternalBromium.g:1241:1: ( ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 ) )
            // InternalBromium.g:1242:2: ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 )
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorAssignment_4()); 
            // InternalBromium.g:1243:2: ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 )
            // InternalBromium.g:1243:3: rule__ElementWithIdIsPresent__CssSelectorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__CssSelectorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__4__Impl"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__5"
    // InternalBromium.g:1251:1: rule__ElementWithIdIsPresent__Group__5 : rule__ElementWithIdIsPresent__Group__5__Impl rule__ElementWithIdIsPresent__Group__6 ;
    public final void rule__ElementWithIdIsPresent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1255:1: ( rule__ElementWithIdIsPresent__Group__5__Impl rule__ElementWithIdIsPresent__Group__6 )
            // InternalBromium.g:1256:2: rule__ElementWithIdIsPresent__Group__5__Impl rule__ElementWithIdIsPresent__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ElementWithIdIsPresent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__Group__6();

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
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__5"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__5__Impl"
    // InternalBromium.g:1263:1: rule__ElementWithIdIsPresent__Group__5__Impl : ( 'is' ) ;
    public final void rule__ElementWithIdIsPresent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1267:1: ( ( 'is' ) )
            // InternalBromium.g:1268:1: ( 'is' )
            {
            // InternalBromium.g:1268:1: ( 'is' )
            // InternalBromium.g:1269:2: 'is'
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getIsKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getElementWithIdIsPresentAccess().getIsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__5__Impl"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__6"
    // InternalBromium.g:1278:1: rule__ElementWithIdIsPresent__Group__6 : rule__ElementWithIdIsPresent__Group__6__Impl ;
    public final void rule__ElementWithIdIsPresent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1282:1: ( rule__ElementWithIdIsPresent__Group__6__Impl )
            // InternalBromium.g:1283:2: rule__ElementWithIdIsPresent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementWithIdIsPresent__Group__6__Impl();

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
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__6"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__6__Impl"
    // InternalBromium.g:1289:1: rule__ElementWithIdIsPresent__Group__6__Impl : ( 'clickable' ) ;
    public final void rule__ElementWithIdIsPresent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1293:1: ( ( 'clickable' ) )
            // InternalBromium.g:1294:1: ( 'clickable' )
            {
            // InternalBromium.g:1294:1: ( 'clickable' )
            // InternalBromium.g:1295:2: 'clickable'
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getClickableKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getElementWithIdIsPresentAccess().getClickableKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementWithIdIsPresent__Group__6__Impl"


    // $ANTLR start "rule__ClickOnElementWithId__Group__0"
    // InternalBromium.g:1305:1: rule__ClickOnElementWithId__Group__0 : rule__ClickOnElementWithId__Group__0__Impl rule__ClickOnElementWithId__Group__1 ;
    public final void rule__ClickOnElementWithId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1309:1: ( rule__ClickOnElementWithId__Group__0__Impl rule__ClickOnElementWithId__Group__1 )
            // InternalBromium.g:1310:2: rule__ClickOnElementWithId__Group__0__Impl rule__ClickOnElementWithId__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ClickOnElementWithId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__Group__1();

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
    // $ANTLR end "rule__ClickOnElementWithId__Group__0"


    // $ANTLR start "rule__ClickOnElementWithId__Group__0__Impl"
    // InternalBromium.g:1317:1: rule__ClickOnElementWithId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickOnElementWithId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1321:1: ( ( 'click' ) )
            // InternalBromium.g:1322:1: ( 'click' )
            {
            // InternalBromium.g:1322:1: ( 'click' )
            // InternalBromium.g:1323:2: 'click'
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getClickKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClickOnElementWithIdAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOnElementWithId__Group__0__Impl"


    // $ANTLR start "rule__ClickOnElementWithId__Group__1"
    // InternalBromium.g:1332:1: rule__ClickOnElementWithId__Group__1 : rule__ClickOnElementWithId__Group__1__Impl rule__ClickOnElementWithId__Group__2 ;
    public final void rule__ClickOnElementWithId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1336:1: ( rule__ClickOnElementWithId__Group__1__Impl rule__ClickOnElementWithId__Group__2 )
            // InternalBromium.g:1337:2: rule__ClickOnElementWithId__Group__1__Impl rule__ClickOnElementWithId__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ClickOnElementWithId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__Group__2();

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
    // $ANTLR end "rule__ClickOnElementWithId__Group__1"


    // $ANTLR start "rule__ClickOnElementWithId__Group__1__Impl"
    // InternalBromium.g:1344:1: rule__ClickOnElementWithId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickOnElementWithId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1348:1: ( ( 'on' ) )
            // InternalBromium.g:1349:1: ( 'on' )
            {
            // InternalBromium.g:1349:1: ( 'on' )
            // InternalBromium.g:1350:2: 'on'
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getOnKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getClickOnElementWithIdAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOnElementWithId__Group__1__Impl"


    // $ANTLR start "rule__ClickOnElementWithId__Group__2"
    // InternalBromium.g:1359:1: rule__ClickOnElementWithId__Group__2 : rule__ClickOnElementWithId__Group__2__Impl rule__ClickOnElementWithId__Group__3 ;
    public final void rule__ClickOnElementWithId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1363:1: ( rule__ClickOnElementWithId__Group__2__Impl rule__ClickOnElementWithId__Group__3 )
            // InternalBromium.g:1364:2: rule__ClickOnElementWithId__Group__2__Impl rule__ClickOnElementWithId__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ClickOnElementWithId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__Group__3();

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
    // $ANTLR end "rule__ClickOnElementWithId__Group__2"


    // $ANTLR start "rule__ClickOnElementWithId__Group__2__Impl"
    // InternalBromium.g:1371:1: rule__ClickOnElementWithId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickOnElementWithId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1375:1: ( ( 'element' ) )
            // InternalBromium.g:1376:1: ( 'element' )
            {
            // InternalBromium.g:1376:1: ( 'element' )
            // InternalBromium.g:1377:2: 'element'
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getElementKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClickOnElementWithIdAccess().getElementKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOnElementWithId__Group__2__Impl"


    // $ANTLR start "rule__ClickOnElementWithId__Group__3"
    // InternalBromium.g:1386:1: rule__ClickOnElementWithId__Group__3 : rule__ClickOnElementWithId__Group__3__Impl rule__ClickOnElementWithId__Group__4 ;
    public final void rule__ClickOnElementWithId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1390:1: ( rule__ClickOnElementWithId__Group__3__Impl rule__ClickOnElementWithId__Group__4 )
            // InternalBromium.g:1391:2: rule__ClickOnElementWithId__Group__3__Impl rule__ClickOnElementWithId__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ClickOnElementWithId__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__Group__4();

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
    // $ANTLR end "rule__ClickOnElementWithId__Group__3"


    // $ANTLR start "rule__ClickOnElementWithId__Group__3__Impl"
    // InternalBromium.g:1398:1: rule__ClickOnElementWithId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickOnElementWithId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1402:1: ( ( 'with' ) )
            // InternalBromium.g:1403:1: ( 'with' )
            {
            // InternalBromium.g:1403:1: ( 'with' )
            // InternalBromium.g:1404:2: 'with'
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getWithKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClickOnElementWithIdAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOnElementWithId__Group__3__Impl"


    // $ANTLR start "rule__ClickOnElementWithId__Group__4"
    // InternalBromium.g:1413:1: rule__ClickOnElementWithId__Group__4 : rule__ClickOnElementWithId__Group__4__Impl rule__ClickOnElementWithId__Group__5 ;
    public final void rule__ClickOnElementWithId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1417:1: ( rule__ClickOnElementWithId__Group__4__Impl rule__ClickOnElementWithId__Group__5 )
            // InternalBromium.g:1418:2: rule__ClickOnElementWithId__Group__4__Impl rule__ClickOnElementWithId__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ClickOnElementWithId__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__Group__5();

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
    // $ANTLR end "rule__ClickOnElementWithId__Group__4"


    // $ANTLR start "rule__ClickOnElementWithId__Group__4__Impl"
    // InternalBromium.g:1425:1: rule__ClickOnElementWithId__Group__4__Impl : ( 'css' ) ;
    public final void rule__ClickOnElementWithId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1429:1: ( ( 'css' ) )
            // InternalBromium.g:1430:1: ( 'css' )
            {
            // InternalBromium.g:1430:1: ( 'css' )
            // InternalBromium.g:1431:2: 'css'
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getCssKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClickOnElementWithIdAccess().getCssKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOnElementWithId__Group__4__Impl"


    // $ANTLR start "rule__ClickOnElementWithId__Group__5"
    // InternalBromium.g:1440:1: rule__ClickOnElementWithId__Group__5 : rule__ClickOnElementWithId__Group__5__Impl rule__ClickOnElementWithId__Group__6 ;
    public final void rule__ClickOnElementWithId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1444:1: ( rule__ClickOnElementWithId__Group__5__Impl rule__ClickOnElementWithId__Group__6 )
            // InternalBromium.g:1445:2: rule__ClickOnElementWithId__Group__5__Impl rule__ClickOnElementWithId__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__ClickOnElementWithId__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__Group__6();

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
    // $ANTLR end "rule__ClickOnElementWithId__Group__5"


    // $ANTLR start "rule__ClickOnElementWithId__Group__5__Impl"
    // InternalBromium.g:1452:1: rule__ClickOnElementWithId__Group__5__Impl : ( 'selector' ) ;
    public final void rule__ClickOnElementWithId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1456:1: ( ( 'selector' ) )
            // InternalBromium.g:1457:1: ( 'selector' )
            {
            // InternalBromium.g:1457:1: ( 'selector' )
            // InternalBromium.g:1458:2: 'selector'
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getSelectorKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClickOnElementWithIdAccess().getSelectorKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOnElementWithId__Group__5__Impl"


    // $ANTLR start "rule__ClickOnElementWithId__Group__6"
    // InternalBromium.g:1467:1: rule__ClickOnElementWithId__Group__6 : rule__ClickOnElementWithId__Group__6__Impl ;
    public final void rule__ClickOnElementWithId__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1471:1: ( rule__ClickOnElementWithId__Group__6__Impl )
            // InternalBromium.g:1472:2: rule__ClickOnElementWithId__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__Group__6__Impl();

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
    // $ANTLR end "rule__ClickOnElementWithId__Group__6"


    // $ANTLR start "rule__ClickOnElementWithId__Group__6__Impl"
    // InternalBromium.g:1478:1: rule__ClickOnElementWithId__Group__6__Impl : ( ( rule__ClickOnElementWithId__CssSelectorAssignment_6 ) ) ;
    public final void rule__ClickOnElementWithId__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1482:1: ( ( ( rule__ClickOnElementWithId__CssSelectorAssignment_6 ) ) )
            // InternalBromium.g:1483:1: ( ( rule__ClickOnElementWithId__CssSelectorAssignment_6 ) )
            {
            // InternalBromium.g:1483:1: ( ( rule__ClickOnElementWithId__CssSelectorAssignment_6 ) )
            // InternalBromium.g:1484:2: ( rule__ClickOnElementWithId__CssSelectorAssignment_6 )
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorAssignment_6()); 
            // InternalBromium.g:1485:2: ( rule__ClickOnElementWithId__CssSelectorAssignment_6 )
            // InternalBromium.g:1485:3: rule__ClickOnElementWithId__CssSelectorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ClickOnElementWithId__CssSelectorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOnElementWithId__Group__6__Impl"


    // $ANTLR start "rule__PageLoad__Group__0"
    // InternalBromium.g:1494:1: rule__PageLoad__Group__0 : rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 ;
    public final void rule__PageLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1498:1: ( rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 )
            // InternalBromium.g:1499:2: rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBromium.g:1506:1: rule__PageLoad__Group__0__Impl : ( 'load' ) ;
    public final void rule__PageLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1510:1: ( ( 'load' ) )
            // InternalBromium.g:1511:1: ( 'load' )
            {
            // InternalBromium.g:1511:1: ( 'load' )
            // InternalBromium.g:1512:2: 'load'
            {
             before(grammarAccess.getPageLoadAccess().getLoadKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBromium.g:1521:1: rule__PageLoad__Group__1 : rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 ;
    public final void rule__PageLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1525:1: ( rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 )
            // InternalBromium.g:1526:2: rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalBromium.g:1533:1: rule__PageLoad__Group__1__Impl : ( 'page' ) ;
    public final void rule__PageLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1537:1: ( ( 'page' ) )
            // InternalBromium.g:1538:1: ( 'page' )
            {
            // InternalBromium.g:1538:1: ( 'page' )
            // InternalBromium.g:1539:2: 'page'
            {
             before(grammarAccess.getPageLoadAccess().getPageKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPageLoadAccess().getPageKeyword_1()); 

            }


            }

        }
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
    // InternalBromium.g:1548:1: rule__PageLoad__Group__2 : rule__PageLoad__Group__2__Impl ;
    public final void rule__PageLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1552:1: ( rule__PageLoad__Group__2__Impl )
            // InternalBromium.g:1553:2: rule__PageLoad__Group__2__Impl
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
    // InternalBromium.g:1559:1: rule__PageLoad__Group__2__Impl : ( ( rule__PageLoad__SubpathAssignment_2 ) ) ;
    public final void rule__PageLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1563:1: ( ( ( rule__PageLoad__SubpathAssignment_2 ) ) )
            // InternalBromium.g:1564:1: ( ( rule__PageLoad__SubpathAssignment_2 ) )
            {
            // InternalBromium.g:1564:1: ( ( rule__PageLoad__SubpathAssignment_2 ) )
            // InternalBromium.g:1565:2: ( rule__PageLoad__SubpathAssignment_2 )
            {
             before(grammarAccess.getPageLoadAccess().getSubpathAssignment_2()); 
            // InternalBromium.g:1566:2: ( rule__PageLoad__SubpathAssignment_2 )
            // InternalBromium.g:1566:3: rule__PageLoad__SubpathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PageLoad__SubpathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPageLoadAccess().getSubpathAssignment_2()); 

            }


            }

        }
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
    // InternalBromium.g:1575:1: rule__TypeTextInElementFoundByCssSelector__Group__0 : rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1579:1: ( rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 )
            // InternalBromium.g:1580:2: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBromium.g:1587:1: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1591:1: ( ( 'type' ) )
            // InternalBromium.g:1592:1: ( 'type' )
            {
            // InternalBromium.g:1592:1: ( 'type' )
            // InternalBromium.g:1593:2: 'type'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:1602:1: rule__TypeTextInElementFoundByCssSelector__Group__1 : rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1606:1: ( rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 )
            // InternalBromium.g:1607:2: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2
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
    // InternalBromium.g:1614:1: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1618:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 ) ) )
            // InternalBromium.g:1619:1: ( ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 ) )
            {
            // InternalBromium.g:1619:1: ( ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 ) )
            // InternalBromium.g:1620:2: ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextAssignment_1()); 
            // InternalBromium.g:1621:2: ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 )
            // InternalBromium.g:1621:3: rule__TypeTextInElementFoundByCssSelector__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextAssignment_1()); 

            }


            }

        }
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
    // InternalBromium.g:1629:1: rule__TypeTextInElementFoundByCssSelector__Group__2 : rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1633:1: ( rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 )
            // InternalBromium.g:1634:2: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:1641:1: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl : ( 'in' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1645:1: ( ( 'in' ) )
            // InternalBromium.g:1646:1: ( 'in' )
            {
            // InternalBromium.g:1646:1: ( 'in' )
            // InternalBromium.g:1647:2: 'in'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_2()); 

            }


            }

        }
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
    // InternalBromium.g:1656:1: rule__TypeTextInElementFoundByCssSelector__Group__3 : rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1660:1: ( rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 )
            // InternalBromium.g:1661:2: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalBromium.g:1668:1: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl : ( 'element' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1672:1: ( ( 'element' ) )
            // InternalBromium.g:1673:1: ( 'element' )
            {
            // InternalBromium.g:1673:1: ( 'element' )
            // InternalBromium.g:1674:2: 'element'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_3()); 

            }


            }

        }
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
    // InternalBromium.g:1683:1: rule__TypeTextInElementFoundByCssSelector__Group__4 : rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1687:1: ( rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 )
            // InternalBromium.g:1688:2: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalBromium.g:1695:1: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl : ( 'with' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1699:1: ( ( 'with' ) )
            // InternalBromium.g:1700:1: ( 'with' )
            {
            // InternalBromium.g:1700:1: ( 'with' )
            // InternalBromium.g:1701:2: 'with'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_4()); 

            }


            }

        }
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
    // InternalBromium.g:1710:1: rule__TypeTextInElementFoundByCssSelector__Group__5 : rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1714:1: ( rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 )
            // InternalBromium.g:1715:2: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalBromium.g:1722:1: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl : ( 'css' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1726:1: ( ( 'css' ) )
            // InternalBromium.g:1727:1: ( 'css' )
            {
            // InternalBromium.g:1727:1: ( 'css' )
            // InternalBromium.g:1728:2: 'css'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_5()); 

            }


            }

        }
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
    // InternalBromium.g:1737:1: rule__TypeTextInElementFoundByCssSelector__Group__6 : rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1741:1: ( rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 )
            // InternalBromium.g:1742:2: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalBromium.g:1749:1: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl : ( 'selector' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1753:1: ( ( 'selector' ) )
            // InternalBromium.g:1754:1: ( 'selector' )
            {
            // InternalBromium.g:1754:1: ( 'selector' )
            // InternalBromium.g:1755:2: 'selector'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getSelectorKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getSelectorKeyword_6()); 

            }


            }

        }
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
    // InternalBromium.g:1764:1: rule__TypeTextInElementFoundByCssSelector__Group__7 : rule__TypeTextInElementFoundByCssSelector__Group__7__Impl ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1768:1: ( rule__TypeTextInElementFoundByCssSelector__Group__7__Impl )
            // InternalBromium.g:1769:2: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__Group__7__Impl();

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
    // InternalBromium.g:1775:1: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1779:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 ) ) )
            // InternalBromium.g:1780:1: ( ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 ) )
            {
            // InternalBromium.g:1780:1: ( ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 ) )
            // InternalBromium.g:1781:2: ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorAssignment_7()); 
            // InternalBromium.g:1782:2: ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 )
            // InternalBromium.g:1782:3: rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalBromium.g:1791:1: rule__Model__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1795:1: ( ( RULE_STRING ) )
            // InternalBromium.g:1796:2: ( RULE_STRING )
            {
            // InternalBromium.g:1796:2: ( RULE_STRING )
            // InternalBromium.g:1797:3: RULE_STRING
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
    // InternalBromium.g:1806:1: rule__Model__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Model__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1810:1: ( ( RULE_STRING ) )
            // InternalBromium.g:1811:2: ( RULE_STRING )
            {
            // InternalBromium.g:1811:2: ( RULE_STRING )
            // InternalBromium.g:1812:3: RULE_STRING
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
    // InternalBromium.g:1821:1: rule__Model__BaseVersionAssignment_4_1 : ( ruleVersion ) ;
    public final void rule__Model__BaseVersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1825:1: ( ( ruleVersion ) )
            // InternalBromium.g:1826:2: ( ruleVersion )
            {
            // InternalBromium.g:1826:2: ( ruleVersion )
            // InternalBromium.g:1827:3: ruleVersion
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
    // InternalBromium.g:1836:1: rule__Model__ActionsAssignment_7 : ( ruleApplicationAction ) ;
    public final void rule__Model__ActionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1840:1: ( ( ruleApplicationAction ) )
            // InternalBromium.g:1841:2: ( ruleApplicationAction )
            {
            // InternalBromium.g:1841:2: ( ruleApplicationAction )
            // InternalBromium.g:1842:3: ruleApplicationAction
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


    // $ANTLR start "rule__ApplicationAction__ActionIdAssignment_1"
    // InternalBromium.g:1851:1: rule__ApplicationAction__ActionIdAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ApplicationAction__ActionIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1855:1: ( ( RULE_STRING ) )
            // InternalBromium.g:1856:2: ( RULE_STRING )
            {
            // InternalBromium.g:1856:2: ( RULE_STRING )
            // InternalBromium.g:1857:3: RULE_STRING
            {
             before(grammarAccess.getApplicationActionAccess().getActionIdSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getActionIdSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__ActionIdAssignment_1"


    // $ANTLR start "rule__ApplicationAction__PreconditionAssignment_2"
    // InternalBromium.g:1866:1: rule__ApplicationAction__PreconditionAssignment_2 : ( rulePrecondition ) ;
    public final void rule__ApplicationAction__PreconditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1870:1: ( ( rulePrecondition ) )
            // InternalBromium.g:1871:2: ( rulePrecondition )
            {
            // InternalBromium.g:1871:2: ( rulePrecondition )
            // InternalBromium.g:1872:3: rulePrecondition
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionPreconditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getPreconditionPreconditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__PreconditionAssignment_2"


    // $ANTLR start "rule__ApplicationAction__WebDriverActionAssignment_3"
    // InternalBromium.g:1881:1: rule__ApplicationAction__WebDriverActionAssignment_3 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__WebDriverActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1885:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:1886:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:1886:2: ( ruleWebDriverAction )
            // InternalBromium.g:1887:3: ruleWebDriverAction
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverAction();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__WebDriverActionAssignment_3"


    // $ANTLR start "rule__ApplicationAction__PostconditionAssignment_4"
    // InternalBromium.g:1896:1: rule__ApplicationAction__PostconditionAssignment_4 : ( rulePostcondition ) ;
    public final void rule__ApplicationAction__PostconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1900:1: ( ( rulePostcondition ) )
            // InternalBromium.g:1901:2: ( rulePostcondition )
            {
            // InternalBromium.g:1901:2: ( rulePostcondition )
            // InternalBromium.g:1902:3: rulePostcondition
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionPostconditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getPostconditionPostconditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__PostconditionAssignment_4"


    // $ANTLR start "rule__ApplicationAction__ExpectHttpRequestAssignment_5"
    // InternalBromium.g:1911:1: rule__ApplicationAction__ExpectHttpRequestAssignment_5 : ( ruleExpectHttpRequest ) ;
    public final void rule__ApplicationAction__ExpectHttpRequestAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1915:1: ( ( ruleExpectHttpRequest ) )
            // InternalBromium.g:1916:2: ( ruleExpectHttpRequest )
            {
            // InternalBromium.g:1916:2: ( ruleExpectHttpRequest )
            // InternalBromium.g:1917:3: ruleExpectHttpRequest
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestExpectHttpRequestParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpectHttpRequest();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getExpectHttpRequestExpectHttpRequestParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__ExpectHttpRequestAssignment_5"


    // $ANTLR start "rule__Precondition__ActionAssignment_1"
    // InternalBromium.g:1926:1: rule__Precondition__ActionAssignment_1 : ( ruleWebDriverAction ) ;
    public final void rule__Precondition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1930:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:1931:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:1931:2: ( ruleWebDriverAction )
            // InternalBromium.g:1932:3: ruleWebDriverAction
            {
             before(grammarAccess.getPreconditionAccess().getActionWebDriverActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverAction();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getActionWebDriverActionParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Postcondition__PostconditionAssignment_3"
    // InternalBromium.g:1941:1: rule__Postcondition__PostconditionAssignment_3 : ( ruleWebDriverAction ) ;
    public final void rule__Postcondition__PostconditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1945:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:1946:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:1946:2: ( ruleWebDriverAction )
            // InternalBromium.g:1947:3: ruleWebDriverAction
            {
             before(grammarAccess.getPostconditionAccess().getPostconditionWebDriverActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverAction();

            state._fsp--;

             after(grammarAccess.getPostconditionAccess().getPostconditionWebDriverActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__PostconditionAssignment_3"


    // $ANTLR start "rule__ElementWithIdIsPresent__CssSelectorAssignment_4"
    // InternalBromium.g:1956:1: rule__ElementWithIdIsPresent__CssSelectorAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ElementWithIdIsPresent__CssSelectorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1960:1: ( ( RULE_STRING ) )
            // InternalBromium.g:1961:2: ( RULE_STRING )
            {
            // InternalBromium.g:1961:2: ( RULE_STRING )
            // InternalBromium.g:1962:3: RULE_STRING
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementWithIdIsPresent__CssSelectorAssignment_4"


    // $ANTLR start "rule__ClickOnElementWithId__CssSelectorAssignment_6"
    // InternalBromium.g:1971:1: rule__ClickOnElementWithId__CssSelectorAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClickOnElementWithId__CssSelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1975:1: ( ( RULE_STRING ) )
            // InternalBromium.g:1976:2: ( RULE_STRING )
            {
            // InternalBromium.g:1976:2: ( RULE_STRING )
            // InternalBromium.g:1977:3: RULE_STRING
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOnElementWithId__CssSelectorAssignment_6"


    // $ANTLR start "rule__PageLoad__SubpathAssignment_2"
    // InternalBromium.g:1986:1: rule__PageLoad__SubpathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PageLoad__SubpathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1990:1: ( ( RULE_STRING ) )
            // InternalBromium.g:1991:2: ( RULE_STRING )
            {
            // InternalBromium.g:1991:2: ( RULE_STRING )
            // InternalBromium.g:1992:3: RULE_STRING
            {
             before(grammarAccess.getPageLoadAccess().getSubpathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPageLoadAccess().getSubpathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageLoad__SubpathAssignment_2"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__TextAssignment_1"
    // InternalBromium.g:2001:1: rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2005:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2006:2: ( RULE_STRING )
            {
            // InternalBromium.g:2006:2: ( RULE_STRING )
            // InternalBromium.g:2007:3: RULE_STRING
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__TextAssignment_1"


    // $ANTLR start "rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7"
    // InternalBromium.g:2016:1: rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 : ( RULE_STRING ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2020:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2021:2: ( RULE_STRING )
            {
            // InternalBromium.g:2021:2: ( RULE_STRING )
            // InternalBromium.g:2022:3: RULE_STRING
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002A08040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});

}