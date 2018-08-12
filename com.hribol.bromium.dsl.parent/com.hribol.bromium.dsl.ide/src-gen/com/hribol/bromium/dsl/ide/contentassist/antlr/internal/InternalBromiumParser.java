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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'actions'", "'{'", "'}'", "'from'", "'id'", "'syntax'", "'table'", "'with'", "'rows'", "'row'", "'number'", "'class'", "'and'", "'text'", "'css'", "'selector'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'expect'", "'http'", "'request'", "'element'", "'is'", "'present'", "'click'", "'on'", "'load'", "'type'", "'in'", "'has'", "'set'", "'to'", "'the'", "'of'", "'select'", "'not'", "'page'", "'variable'", "'dataId'", "'confirm'", "'value'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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


    // $ANTLR start "entryRuleActionContext"
    // InternalBromium.g:103:1: entryRuleActionContext : ruleActionContext EOF ;
    public final void entryRuleActionContext() throws RecognitionException {
        try {
            // InternalBromium.g:104:1: ( ruleActionContext EOF )
            // InternalBromium.g:105:1: ruleActionContext EOF
            {
             before(grammarAccess.getActionContextRule()); 
            pushFollow(FOLLOW_1);
            ruleActionContext();

            state._fsp--;

             after(grammarAccess.getActionContextRule()); 
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
    // $ANTLR end "entryRuleActionContext"


    // $ANTLR start "ruleActionContext"
    // InternalBromium.g:112:1: ruleActionContext : ( ruleTableActionContext ) ;
    public final void ruleActionContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:116:2: ( ( ruleTableActionContext ) )
            // InternalBromium.g:117:2: ( ruleTableActionContext )
            {
            // InternalBromium.g:117:2: ( ruleTableActionContext )
            // InternalBromium.g:118:3: ruleTableActionContext
            {
             before(grammarAccess.getActionContextAccess().getTableActionContextParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTableActionContext();

            state._fsp--;

             after(grammarAccess.getActionContextAccess().getTableActionContextParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionContext"


    // $ANTLR start "entryRuleTableActionContext"
    // InternalBromium.g:128:1: entryRuleTableActionContext : ruleTableActionContext EOF ;
    public final void entryRuleTableActionContext() throws RecognitionException {
        try {
            // InternalBromium.g:129:1: ( ruleTableActionContext EOF )
            // InternalBromium.g:130:1: ruleTableActionContext EOF
            {
             before(grammarAccess.getTableActionContextRule()); 
            pushFollow(FOLLOW_1);
            ruleTableActionContext();

            state._fsp--;

             after(grammarAccess.getTableActionContextRule()); 
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
    // $ANTLR end "entryRuleTableActionContext"


    // $ANTLR start "ruleTableActionContext"
    // InternalBromium.g:137:1: ruleTableActionContext : ( ( rule__TableActionContext__Group__0 ) ) ;
    public final void ruleTableActionContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:141:2: ( ( ( rule__TableActionContext__Group__0 ) ) )
            // InternalBromium.g:142:2: ( ( rule__TableActionContext__Group__0 ) )
            {
            // InternalBromium.g:142:2: ( ( rule__TableActionContext__Group__0 ) )
            // InternalBromium.g:143:3: ( rule__TableActionContext__Group__0 )
            {
             before(grammarAccess.getTableActionContextAccess().getGroup()); 
            // InternalBromium.g:144:3: ( rule__TableActionContext__Group__0 )
            // InternalBromium.g:144:4: rule__TableActionContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableActionContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableActionContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableActionContext"


    // $ANTLR start "entryRuleRowSelector"
    // InternalBromium.g:153:1: entryRuleRowSelector : ruleRowSelector EOF ;
    public final void entryRuleRowSelector() throws RecognitionException {
        try {
            // InternalBromium.g:154:1: ( ruleRowSelector EOF )
            // InternalBromium.g:155:1: ruleRowSelector EOF
            {
             before(grammarAccess.getRowSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleRowSelector();

            state._fsp--;

             after(grammarAccess.getRowSelectorRule()); 
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
    // $ANTLR end "entryRuleRowSelector"


    // $ANTLR start "ruleRowSelector"
    // InternalBromium.g:162:1: ruleRowSelector : ( ( rule__RowSelector__Alternatives ) ) ;
    public final void ruleRowSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:166:2: ( ( ( rule__RowSelector__Alternatives ) ) )
            // InternalBromium.g:167:2: ( ( rule__RowSelector__Alternatives ) )
            {
            // InternalBromium.g:167:2: ( ( rule__RowSelector__Alternatives ) )
            // InternalBromium.g:168:3: ( rule__RowSelector__Alternatives )
            {
             before(grammarAccess.getRowSelectorAccess().getAlternatives()); 
            // InternalBromium.g:169:3: ( rule__RowSelector__Alternatives )
            // InternalBromium.g:169:4: rule__RowSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RowSelector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRowSelectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRowSelector"


    // $ANTLR start "entryRuleRowLocator"
    // InternalBromium.g:178:1: entryRuleRowLocator : ruleRowLocator EOF ;
    public final void entryRuleRowLocator() throws RecognitionException {
        try {
            // InternalBromium.g:179:1: ( ruleRowLocator EOF )
            // InternalBromium.g:180:1: ruleRowLocator EOF
            {
             before(grammarAccess.getRowLocatorRule()); 
            pushFollow(FOLLOW_1);
            ruleRowLocator();

            state._fsp--;

             after(grammarAccess.getRowLocatorRule()); 
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
    // $ANTLR end "entryRuleRowLocator"


    // $ANTLR start "ruleRowLocator"
    // InternalBromium.g:187:1: ruleRowLocator : ( ( rule__RowLocator__Group__0 ) ) ;
    public final void ruleRowLocator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:191:2: ( ( ( rule__RowLocator__Group__0 ) ) )
            // InternalBromium.g:192:2: ( ( rule__RowLocator__Group__0 ) )
            {
            // InternalBromium.g:192:2: ( ( rule__RowLocator__Group__0 ) )
            // InternalBromium.g:193:3: ( rule__RowLocator__Group__0 )
            {
             before(grammarAccess.getRowLocatorAccess().getGroup()); 
            // InternalBromium.g:194:3: ( rule__RowLocator__Group__0 )
            // InternalBromium.g:194:4: rule__RowLocator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RowLocator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowLocatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRowLocator"


    // $ANTLR start "entryRuleRowIndex"
    // InternalBromium.g:203:1: entryRuleRowIndex : ruleRowIndex EOF ;
    public final void entryRuleRowIndex() throws RecognitionException {
        try {
            // InternalBromium.g:204:1: ( ruleRowIndex EOF )
            // InternalBromium.g:205:1: ruleRowIndex EOF
            {
             before(grammarAccess.getRowIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleRowIndex();

            state._fsp--;

             after(grammarAccess.getRowIndexRule()); 
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
    // $ANTLR end "entryRuleRowIndex"


    // $ANTLR start "ruleRowIndex"
    // InternalBromium.g:212:1: ruleRowIndex : ( ( rule__RowIndex__Group__0 ) ) ;
    public final void ruleRowIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:216:2: ( ( ( rule__RowIndex__Group__0 ) ) )
            // InternalBromium.g:217:2: ( ( rule__RowIndex__Group__0 ) )
            {
            // InternalBromium.g:217:2: ( ( rule__RowIndex__Group__0 ) )
            // InternalBromium.g:218:3: ( rule__RowIndex__Group__0 )
            {
             before(grammarAccess.getRowIndexAccess().getGroup()); 
            // InternalBromium.g:219:3: ( rule__RowIndex__Group__0 )
            // InternalBromium.g:219:4: rule__RowIndex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RowIndex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowIndexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRowIndex"


    // $ANTLR start "entryRuleLocator"
    // InternalBromium.g:228:1: entryRuleLocator : ruleLocator EOF ;
    public final void entryRuleLocator() throws RecognitionException {
        try {
            // InternalBromium.g:229:1: ( ruleLocator EOF )
            // InternalBromium.g:230:1: ruleLocator EOF
            {
             before(grammarAccess.getLocatorRule()); 
            pushFollow(FOLLOW_1);
            ruleLocator();

            state._fsp--;

             after(grammarAccess.getLocatorRule()); 
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
    // $ANTLR end "entryRuleLocator"


    // $ANTLR start "ruleLocator"
    // InternalBromium.g:237:1: ruleLocator : ( ( rule__Locator__Alternatives ) ) ;
    public final void ruleLocator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:241:2: ( ( ( rule__Locator__Alternatives ) ) )
            // InternalBromium.g:242:2: ( ( rule__Locator__Alternatives ) )
            {
            // InternalBromium.g:242:2: ( ( rule__Locator__Alternatives ) )
            // InternalBromium.g:243:3: ( rule__Locator__Alternatives )
            {
             before(grammarAccess.getLocatorAccess().getAlternatives()); 
            // InternalBromium.g:244:3: ( rule__Locator__Alternatives )
            // InternalBromium.g:244:4: rule__Locator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Locator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocator"


    // $ANTLR start "entryRuleClassByText"
    // InternalBromium.g:253:1: entryRuleClassByText : ruleClassByText EOF ;
    public final void entryRuleClassByText() throws RecognitionException {
        try {
            // InternalBromium.g:254:1: ( ruleClassByText EOF )
            // InternalBromium.g:255:1: ruleClassByText EOF
            {
             before(grammarAccess.getClassByTextRule()); 
            pushFollow(FOLLOW_1);
            ruleClassByText();

            state._fsp--;

             after(grammarAccess.getClassByTextRule()); 
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
    // $ANTLR end "entryRuleClassByText"


    // $ANTLR start "ruleClassByText"
    // InternalBromium.g:262:1: ruleClassByText : ( ( rule__ClassByText__Group__0 ) ) ;
    public final void ruleClassByText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:266:2: ( ( ( rule__ClassByText__Group__0 ) ) )
            // InternalBromium.g:267:2: ( ( rule__ClassByText__Group__0 ) )
            {
            // InternalBromium.g:267:2: ( ( rule__ClassByText__Group__0 ) )
            // InternalBromium.g:268:3: ( rule__ClassByText__Group__0 )
            {
             before(grammarAccess.getClassByTextAccess().getGroup()); 
            // InternalBromium.g:269:3: ( rule__ClassByText__Group__0 )
            // InternalBromium.g:269:4: rule__ClassByText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassByText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassByTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassByText"


    // $ANTLR start "entryRuleCssSelectorByText"
    // InternalBromium.g:278:1: entryRuleCssSelectorByText : ruleCssSelectorByText EOF ;
    public final void entryRuleCssSelectorByText() throws RecognitionException {
        try {
            // InternalBromium.g:279:1: ( ruleCssSelectorByText EOF )
            // InternalBromium.g:280:1: ruleCssSelectorByText EOF
            {
             before(grammarAccess.getCssSelectorByTextRule()); 
            pushFollow(FOLLOW_1);
            ruleCssSelectorByText();

            state._fsp--;

             after(grammarAccess.getCssSelectorByTextRule()); 
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
    // $ANTLR end "entryRuleCssSelectorByText"


    // $ANTLR start "ruleCssSelectorByText"
    // InternalBromium.g:287:1: ruleCssSelectorByText : ( ( rule__CssSelectorByText__Group__0 ) ) ;
    public final void ruleCssSelectorByText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:291:2: ( ( ( rule__CssSelectorByText__Group__0 ) ) )
            // InternalBromium.g:292:2: ( ( rule__CssSelectorByText__Group__0 ) )
            {
            // InternalBromium.g:292:2: ( ( rule__CssSelectorByText__Group__0 ) )
            // InternalBromium.g:293:3: ( rule__CssSelectorByText__Group__0 )
            {
             before(grammarAccess.getCssSelectorByTextAccess().getGroup()); 
            // InternalBromium.g:294:3: ( rule__CssSelectorByText__Group__0 )
            // InternalBromium.g:294:4: rule__CssSelectorByText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCssSelectorByTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCssSelectorByText"


    // $ANTLR start "entryRuleCssSelector"
    // InternalBromium.g:303:1: entryRuleCssSelector : ruleCssSelector EOF ;
    public final void entryRuleCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:304:1: ( ruleCssSelector EOF )
            // InternalBromium.g:305:1: ruleCssSelector EOF
            {
             before(grammarAccess.getCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleCssSelector();

            state._fsp--;

             after(grammarAccess.getCssSelectorRule()); 
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
    // $ANTLR end "entryRuleCssSelector"


    // $ANTLR start "ruleCssSelector"
    // InternalBromium.g:312:1: ruleCssSelector : ( ( rule__CssSelector__Group__0 ) ) ;
    public final void ruleCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:316:2: ( ( ( rule__CssSelector__Group__0 ) ) )
            // InternalBromium.g:317:2: ( ( rule__CssSelector__Group__0 ) )
            {
            // InternalBromium.g:317:2: ( ( rule__CssSelector__Group__0 ) )
            // InternalBromium.g:318:3: ( rule__CssSelector__Group__0 )
            {
             before(grammarAccess.getCssSelectorAccess().getGroup()); 
            // InternalBromium.g:319:3: ( rule__CssSelector__Group__0 )
            // InternalBromium.g:319:4: rule__CssSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCssSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCssSelector"


    // $ANTLR start "entryRuleSyntaxDefinition"
    // InternalBromium.g:328:1: entryRuleSyntaxDefinition : ruleSyntaxDefinition EOF ;
    public final void entryRuleSyntaxDefinition() throws RecognitionException {
        try {
            // InternalBromium.g:329:1: ( ruleSyntaxDefinition EOF )
            // InternalBromium.g:330:1: ruleSyntaxDefinition EOF
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
    // InternalBromium.g:337:1: ruleSyntaxDefinition : ( ( rule__SyntaxDefinition__Group__0 ) ) ;
    public final void ruleSyntaxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:341:2: ( ( ( rule__SyntaxDefinition__Group__0 ) ) )
            // InternalBromium.g:342:2: ( ( rule__SyntaxDefinition__Group__0 ) )
            {
            // InternalBromium.g:342:2: ( ( rule__SyntaxDefinition__Group__0 ) )
            // InternalBromium.g:343:3: ( rule__SyntaxDefinition__Group__0 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getGroup()); 
            // InternalBromium.g:344:3: ( rule__SyntaxDefinition__Group__0 )
            // InternalBromium.g:344:4: rule__SyntaxDefinition__Group__0
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
    // InternalBromium.g:353:1: entryRuleWebDriverActionCondition : ruleWebDriverActionCondition EOF ;
    public final void entryRuleWebDriverActionCondition() throws RecognitionException {
        try {
            // InternalBromium.g:354:1: ( ruleWebDriverActionCondition EOF )
            // InternalBromium.g:355:1: ruleWebDriverActionCondition EOF
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
    // InternalBromium.g:362:1: ruleWebDriverActionCondition : ( ( rule__WebDriverActionCondition__Alternatives ) ) ;
    public final void ruleWebDriverActionCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:366:2: ( ( ( rule__WebDriverActionCondition__Alternatives ) ) )
            // InternalBromium.g:367:2: ( ( rule__WebDriverActionCondition__Alternatives ) )
            {
            // InternalBromium.g:367:2: ( ( rule__WebDriverActionCondition__Alternatives ) )
            // InternalBromium.g:368:3: ( rule__WebDriverActionCondition__Alternatives )
            {
             before(grammarAccess.getWebDriverActionConditionAccess().getAlternatives()); 
            // InternalBromium.g:369:3: ( rule__WebDriverActionCondition__Alternatives )
            // InternalBromium.g:369:4: rule__WebDriverActionCondition__Alternatives
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
    // InternalBromium.g:378:1: entryRuleWebDriverAction : ruleWebDriverAction EOF ;
    public final void entryRuleWebDriverAction() throws RecognitionException {
        try {
            // InternalBromium.g:379:1: ( ruleWebDriverAction EOF )
            // InternalBromium.g:380:1: ruleWebDriverAction EOF
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
    // InternalBromium.g:387:1: ruleWebDriverAction : ( ( rule__WebDriverAction__Alternatives ) ) ;
    public final void ruleWebDriverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:391:2: ( ( ( rule__WebDriverAction__Alternatives ) ) )
            // InternalBromium.g:392:2: ( ( rule__WebDriverAction__Alternatives ) )
            {
            // InternalBromium.g:392:2: ( ( rule__WebDriverAction__Alternatives ) )
            // InternalBromium.g:393:3: ( rule__WebDriverAction__Alternatives )
            {
             before(grammarAccess.getWebDriverActionAccess().getAlternatives()); 
            // InternalBromium.g:394:3: ( rule__WebDriverAction__Alternatives )
            // InternalBromium.g:394:4: rule__WebDriverAction__Alternatives
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
    // InternalBromium.g:403:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalBromium.g:404:1: ( rulePrecondition EOF )
            // InternalBromium.g:405:1: rulePrecondition EOF
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
    // InternalBromium.g:412:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:416:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalBromium.g:417:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalBromium.g:417:2: ( ( rule__Precondition__Group__0 ) )
            // InternalBromium.g:418:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalBromium.g:419:3: ( rule__Precondition__Group__0 )
            // InternalBromium.g:419:4: rule__Precondition__Group__0
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
    // InternalBromium.g:428:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalBromium.g:429:1: ( rulePostcondition EOF )
            // InternalBromium.g:430:1: rulePostcondition EOF
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
    // InternalBromium.g:437:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:441:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalBromium.g:442:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalBromium.g:442:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalBromium.g:443:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalBromium.g:444:3: ( rule__Postcondition__Group__0 )
            // InternalBromium.g:444:4: rule__Postcondition__Group__0
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
    // InternalBromium.g:453:1: entryRuleExpectHttpRequest : ruleExpectHttpRequest EOF ;
    public final void entryRuleExpectHttpRequest() throws RecognitionException {
        try {
            // InternalBromium.g:454:1: ( ruleExpectHttpRequest EOF )
            // InternalBromium.g:455:1: ruleExpectHttpRequest EOF
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
    // InternalBromium.g:462:1: ruleExpectHttpRequest : ( ( rule__ExpectHttpRequest__Group__0 ) ) ;
    public final void ruleExpectHttpRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:466:2: ( ( ( rule__ExpectHttpRequest__Group__0 ) ) )
            // InternalBromium.g:467:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            {
            // InternalBromium.g:467:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            // InternalBromium.g:468:3: ( rule__ExpectHttpRequest__Group__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup()); 
            // InternalBromium.g:469:3: ( rule__ExpectHttpRequest__Group__0 )
            // InternalBromium.g:469:4: rule__ExpectHttpRequest__Group__0
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
    // InternalBromium.g:478:1: entryRuleElementByCssToBePresent : ruleElementByCssToBePresent EOF ;
    public final void entryRuleElementByCssToBePresent() throws RecognitionException {
        try {
            // InternalBromium.g:479:1: ( ruleElementByCssToBePresent EOF )
            // InternalBromium.g:480:1: ruleElementByCssToBePresent EOF
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
    // InternalBromium.g:487:1: ruleElementByCssToBePresent : ( ( rule__ElementByCssToBePresent__Group__0 ) ) ;
    public final void ruleElementByCssToBePresent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:491:2: ( ( ( rule__ElementByCssToBePresent__Group__0 ) ) )
            // InternalBromium.g:492:2: ( ( rule__ElementByCssToBePresent__Group__0 ) )
            {
            // InternalBromium.g:492:2: ( ( rule__ElementByCssToBePresent__Group__0 ) )
            // InternalBromium.g:493:3: ( rule__ElementByCssToBePresent__Group__0 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getGroup()); 
            // InternalBromium.g:494:3: ( rule__ElementByCssToBePresent__Group__0 )
            // InternalBromium.g:494:4: rule__ElementByCssToBePresent__Group__0
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
    // InternalBromium.g:503:1: entryRuleClickCssSelector : ruleClickCssSelector EOF ;
    public final void entryRuleClickCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:504:1: ( ruleClickCssSelector EOF )
            // InternalBromium.g:505:1: ruleClickCssSelector EOF
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
    // InternalBromium.g:512:1: ruleClickCssSelector : ( ( rule__ClickCssSelector__Group__0 ) ) ;
    public final void ruleClickCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:516:2: ( ( ( rule__ClickCssSelector__Group__0 ) ) )
            // InternalBromium.g:517:2: ( ( rule__ClickCssSelector__Group__0 ) )
            {
            // InternalBromium.g:517:2: ( ( rule__ClickCssSelector__Group__0 ) )
            // InternalBromium.g:518:3: ( rule__ClickCssSelector__Group__0 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getGroup()); 
            // InternalBromium.g:519:3: ( rule__ClickCssSelector__Group__0 )
            // InternalBromium.g:519:4: rule__ClickCssSelector__Group__0
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
    // InternalBromium.g:528:1: entryRulePageLoad : rulePageLoad EOF ;
    public final void entryRulePageLoad() throws RecognitionException {
        try {
            // InternalBromium.g:529:1: ( rulePageLoad EOF )
            // InternalBromium.g:530:1: rulePageLoad EOF
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
    // InternalBromium.g:537:1: rulePageLoad : ( ( rule__PageLoad__Group__0 ) ) ;
    public final void rulePageLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:541:2: ( ( ( rule__PageLoad__Group__0 ) ) )
            // InternalBromium.g:542:2: ( ( rule__PageLoad__Group__0 ) )
            {
            // InternalBromium.g:542:2: ( ( rule__PageLoad__Group__0 ) )
            // InternalBromium.g:543:3: ( rule__PageLoad__Group__0 )
            {
             before(grammarAccess.getPageLoadAccess().getGroup()); 
            // InternalBromium.g:544:3: ( rule__PageLoad__Group__0 )
            // InternalBromium.g:544:4: rule__PageLoad__Group__0
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
    // InternalBromium.g:553:1: entryRuleTypeTextInElementFoundByCssSelector : ruleTypeTextInElementFoundByCssSelector EOF ;
    public final void entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:554:1: ( ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:555:1: ruleTypeTextInElementFoundByCssSelector EOF
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
    // InternalBromium.g:562:1: ruleTypeTextInElementFoundByCssSelector : ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) ;
    public final void ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:566:2: ( ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) )
            // InternalBromium.g:567:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            {
            // InternalBromium.g:567:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            // InternalBromium.g:568:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); 
            // InternalBromium.g:569:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            // InternalBromium.g:569:4: rule__TypeTextInElementFoundByCssSelector__Group__0
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
    // InternalBromium.g:578:1: entryRuleTextOfElementWithCssSelectorToBe : ruleTextOfElementWithCssSelectorToBe EOF ;
    public final void entryRuleTextOfElementWithCssSelectorToBe() throws RecognitionException {
        try {
            // InternalBromium.g:579:1: ( ruleTextOfElementWithCssSelectorToBe EOF )
            // InternalBromium.g:580:1: ruleTextOfElementWithCssSelectorToBe EOF
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
    // InternalBromium.g:587:1: ruleTextOfElementWithCssSelectorToBe : ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) ) ;
    public final void ruleTextOfElementWithCssSelectorToBe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:591:2: ( ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) ) )
            // InternalBromium.g:592:2: ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) )
            {
            // InternalBromium.g:592:2: ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) )
            // InternalBromium.g:593:3: ( rule__TextOfElementWithCssSelectorToBe__Group__0 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getGroup()); 
            // InternalBromium.g:594:3: ( rule__TextOfElementWithCssSelectorToBe__Group__0 )
            // InternalBromium.g:594:4: rule__TextOfElementWithCssSelectorToBe__Group__0
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
    // InternalBromium.g:603:1: entryRuleClickClassByText : ruleClickClassByText EOF ;
    public final void entryRuleClickClassByText() throws RecognitionException {
        try {
            // InternalBromium.g:604:1: ( ruleClickClassByText EOF )
            // InternalBromium.g:605:1: ruleClickClassByText EOF
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
    // InternalBromium.g:612:1: ruleClickClassByText : ( ( rule__ClickClassByText__Group__0 ) ) ;
    public final void ruleClickClassByText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:616:2: ( ( ( rule__ClickClassByText__Group__0 ) ) )
            // InternalBromium.g:617:2: ( ( rule__ClickClassByText__Group__0 ) )
            {
            // InternalBromium.g:617:2: ( ( rule__ClickClassByText__Group__0 ) )
            // InternalBromium.g:618:3: ( rule__ClickClassByText__Group__0 )
            {
             before(grammarAccess.getClickClassByTextAccess().getGroup()); 
            // InternalBromium.g:619:3: ( rule__ClickClassByText__Group__0 )
            // InternalBromium.g:619:4: rule__ClickClassByText__Group__0
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
    // InternalBromium.g:628:1: entryRuleSetVariableToTextOfElementWithCssSelector : ruleSetVariableToTextOfElementWithCssSelector EOF ;
    public final void entryRuleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:629:1: ( ruleSetVariableToTextOfElementWithCssSelector EOF )
            // InternalBromium.g:630:1: ruleSetVariableToTextOfElementWithCssSelector EOF
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
    // InternalBromium.g:637:1: ruleSetVariableToTextOfElementWithCssSelector : ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) ) ;
    public final void ruleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:641:2: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) ) )
            // InternalBromium.g:642:2: ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) )
            {
            // InternalBromium.g:642:2: ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) )
            // InternalBromium.g:643:3: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getGroup()); 
            // InternalBromium.g:644:3: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 )
            // InternalBromium.g:644:4: rule__SetVariableToTextOfElementWithCssSelector__Group__0
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
    // InternalBromium.g:653:1: entryRuleClickDataId : ruleClickDataId EOF ;
    public final void entryRuleClickDataId() throws RecognitionException {
        try {
            // InternalBromium.g:654:1: ( ruleClickDataId EOF )
            // InternalBromium.g:655:1: ruleClickDataId EOF
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
    // InternalBromium.g:662:1: ruleClickDataId : ( ( rule__ClickDataId__Group__0 ) ) ;
    public final void ruleClickDataId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:666:2: ( ( ( rule__ClickDataId__Group__0 ) ) )
            // InternalBromium.g:667:2: ( ( rule__ClickDataId__Group__0 ) )
            {
            // InternalBromium.g:667:2: ( ( rule__ClickDataId__Group__0 ) )
            // InternalBromium.g:668:3: ( rule__ClickDataId__Group__0 )
            {
             before(grammarAccess.getClickDataIdAccess().getGroup()); 
            // InternalBromium.g:669:3: ( rule__ClickDataId__Group__0 )
            // InternalBromium.g:669:4: rule__ClickDataId__Group__0
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
    // InternalBromium.g:678:1: entryRuleConfirmAlert : ruleConfirmAlert EOF ;
    public final void entryRuleConfirmAlert() throws RecognitionException {
        try {
            // InternalBromium.g:679:1: ( ruleConfirmAlert EOF )
            // InternalBromium.g:680:1: ruleConfirmAlert EOF
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
    // InternalBromium.g:687:1: ruleConfirmAlert : ( ( rule__ConfirmAlert__Group__0 ) ) ;
    public final void ruleConfirmAlert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:691:2: ( ( ( rule__ConfirmAlert__Group__0 ) ) )
            // InternalBromium.g:692:2: ( ( rule__ConfirmAlert__Group__0 ) )
            {
            // InternalBromium.g:692:2: ( ( rule__ConfirmAlert__Group__0 ) )
            // InternalBromium.g:693:3: ( rule__ConfirmAlert__Group__0 )
            {
             before(grammarAccess.getConfirmAlertAccess().getGroup()); 
            // InternalBromium.g:694:3: ( rule__ConfirmAlert__Group__0 )
            // InternalBromium.g:694:4: rule__ConfirmAlert__Group__0
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
    // InternalBromium.g:703:1: entryRuleClickId : ruleClickId EOF ;
    public final void entryRuleClickId() throws RecognitionException {
        try {
            // InternalBromium.g:704:1: ( ruleClickId EOF )
            // InternalBromium.g:705:1: ruleClickId EOF
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
    // InternalBromium.g:712:1: ruleClickId : ( ( rule__ClickId__Group__0 ) ) ;
    public final void ruleClickId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:716:2: ( ( ( rule__ClickId__Group__0 ) ) )
            // InternalBromium.g:717:2: ( ( rule__ClickId__Group__0 ) )
            {
            // InternalBromium.g:717:2: ( ( rule__ClickId__Group__0 ) )
            // InternalBromium.g:718:3: ( rule__ClickId__Group__0 )
            {
             before(grammarAccess.getClickIdAccess().getGroup()); 
            // InternalBromium.g:719:3: ( rule__ClickId__Group__0 )
            // InternalBromium.g:719:4: rule__ClickId__Group__0
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


    // $ANTLR start "entryRuleClickName"
    // InternalBromium.g:728:1: entryRuleClickName : ruleClickName EOF ;
    public final void entryRuleClickName() throws RecognitionException {
        try {
            // InternalBromium.g:729:1: ( ruleClickName EOF )
            // InternalBromium.g:730:1: ruleClickName EOF
            {
             before(grammarAccess.getClickNameRule()); 
            pushFollow(FOLLOW_1);
            ruleClickName();

            state._fsp--;

             after(grammarAccess.getClickNameRule()); 
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
    // $ANTLR end "entryRuleClickName"


    // $ANTLR start "ruleClickName"
    // InternalBromium.g:737:1: ruleClickName : ( ( rule__ClickName__Group__0 ) ) ;
    public final void ruleClickName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:741:2: ( ( ( rule__ClickName__Group__0 ) ) )
            // InternalBromium.g:742:2: ( ( rule__ClickName__Group__0 ) )
            {
            // InternalBromium.g:742:2: ( ( rule__ClickName__Group__0 ) )
            // InternalBromium.g:743:3: ( rule__ClickName__Group__0 )
            {
             before(grammarAccess.getClickNameAccess().getGroup()); 
            // InternalBromium.g:744:3: ( rule__ClickName__Group__0 )
            // InternalBromium.g:744:4: rule__ClickName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickName"


    // $ANTLR start "entryRuleSelectValue"
    // InternalBromium.g:753:1: entryRuleSelectValue : ruleSelectValue EOF ;
    public final void entryRuleSelectValue() throws RecognitionException {
        try {
            // InternalBromium.g:754:1: ( ruleSelectValue EOF )
            // InternalBromium.g:755:1: ruleSelectValue EOF
            {
             before(grammarAccess.getSelectValueRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectValue();

            state._fsp--;

             after(grammarAccess.getSelectValueRule()); 
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
    // $ANTLR end "entryRuleSelectValue"


    // $ANTLR start "ruleSelectValue"
    // InternalBromium.g:762:1: ruleSelectValue : ( ( rule__SelectValue__Group__0 ) ) ;
    public final void ruleSelectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:766:2: ( ( ( rule__SelectValue__Group__0 ) ) )
            // InternalBromium.g:767:2: ( ( rule__SelectValue__Group__0 ) )
            {
            // InternalBromium.g:767:2: ( ( rule__SelectValue__Group__0 ) )
            // InternalBromium.g:768:3: ( rule__SelectValue__Group__0 )
            {
             before(grammarAccess.getSelectValueAccess().getGroup()); 
            // InternalBromium.g:769:3: ( rule__SelectValue__Group__0 )
            // InternalBromium.g:769:4: rule__SelectValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectValue"


    // $ANTLR start "entryRuleParameterValue"
    // InternalBromium.g:778:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalBromium.g:779:1: ( ruleParameterValue EOF )
            // InternalBromium.g:780:1: ruleParameterValue EOF
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
    // InternalBromium.g:787:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:791:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalBromium.g:792:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalBromium.g:792:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalBromium.g:793:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalBromium.g:794:3: ( rule__ParameterValue__Alternatives )
            // InternalBromium.g:794:4: rule__ParameterValue__Alternatives
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
    // InternalBromium.g:803:1: entryRuleExposedParameter : ruleExposedParameter EOF ;
    public final void entryRuleExposedParameter() throws RecognitionException {
        try {
            // InternalBromium.g:804:1: ( ruleExposedParameter EOF )
            // InternalBromium.g:805:1: ruleExposedParameter EOF
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
    // InternalBromium.g:812:1: ruleExposedParameter : ( ( rule__ExposedParameter__NameAssignment ) ) ;
    public final void ruleExposedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:816:2: ( ( ( rule__ExposedParameter__NameAssignment ) ) )
            // InternalBromium.g:817:2: ( ( rule__ExposedParameter__NameAssignment ) )
            {
            // InternalBromium.g:817:2: ( ( rule__ExposedParameter__NameAssignment ) )
            // InternalBromium.g:818:3: ( rule__ExposedParameter__NameAssignment )
            {
             before(grammarAccess.getExposedParameterAccess().getNameAssignment()); 
            // InternalBromium.g:819:3: ( rule__ExposedParameter__NameAssignment )
            // InternalBromium.g:819:4: rule__ExposedParameter__NameAssignment
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
    // InternalBromium.g:828:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalBromium.g:829:1: ( ruleVersion EOF )
            // InternalBromium.g:830:1: ruleVersion EOF
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
    // InternalBromium.g:837:1: ruleVersion : ( RULE_STRING ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:841:2: ( ( RULE_STRING ) )
            // InternalBromium.g:842:2: ( RULE_STRING )
            {
            // InternalBromium.g:842:2: ( RULE_STRING )
            // InternalBromium.g:843:3: RULE_STRING
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


    // $ANTLR start "rule__RowSelector__Alternatives"
    // InternalBromium.g:852:1: rule__RowSelector__Alternatives : ( ( ruleRowLocator ) | ( ruleRowIndex ) );
    public final void rule__RowSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:856:1: ( ( ruleRowLocator ) | ( ruleRowIndex ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    alt1=1;
                }
                else if ( (LA1_1==23) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBromium.g:857:2: ( ruleRowLocator )
                    {
                    // InternalBromium.g:857:2: ( ruleRowLocator )
                    // InternalBromium.g:858:3: ruleRowLocator
                    {
                     before(grammarAccess.getRowSelectorAccess().getRowLocatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRowLocator();

                    state._fsp--;

                     after(grammarAccess.getRowSelectorAccess().getRowLocatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:863:2: ( ruleRowIndex )
                    {
                    // InternalBromium.g:863:2: ( ruleRowIndex )
                    // InternalBromium.g:864:3: ruleRowIndex
                    {
                     before(grammarAccess.getRowSelectorAccess().getRowIndexParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRowIndex();

                    state._fsp--;

                     after(grammarAccess.getRowSelectorAccess().getRowIndexParserRuleCall_1()); 

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
    // $ANTLR end "rule__RowSelector__Alternatives"


    // $ANTLR start "rule__Locator__Alternatives"
    // InternalBromium.g:873:1: rule__Locator__Alternatives : ( ( ruleCssSelector ) | ( ruleClassByText ) | ( ruleCssSelectorByText ) | ( ruleActionContext ) );
    public final void rule__Locator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:877:1: ( ( ruleCssSelector ) | ( ruleClassByText ) | ( ruleCssSelectorByText ) | ( ruleActionContext ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBromium.g:878:2: ( ruleCssSelector )
                    {
                    // InternalBromium.g:878:2: ( ruleCssSelector )
                    // InternalBromium.g:879:3: ruleCssSelector
                    {
                     before(grammarAccess.getLocatorAccess().getCssSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCssSelector();

                    state._fsp--;

                     after(grammarAccess.getLocatorAccess().getCssSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:884:2: ( ruleClassByText )
                    {
                    // InternalBromium.g:884:2: ( ruleClassByText )
                    // InternalBromium.g:885:3: ruleClassByText
                    {
                     before(grammarAccess.getLocatorAccess().getClassByTextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassByText();

                    state._fsp--;

                     after(grammarAccess.getLocatorAccess().getClassByTextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBromium.g:890:2: ( ruleCssSelectorByText )
                    {
                    // InternalBromium.g:890:2: ( ruleCssSelectorByText )
                    // InternalBromium.g:891:3: ruleCssSelectorByText
                    {
                     before(grammarAccess.getLocatorAccess().getCssSelectorByTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCssSelectorByText();

                    state._fsp--;

                     after(grammarAccess.getLocatorAccess().getCssSelectorByTextParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBromium.g:896:2: ( ruleActionContext )
                    {
                    // InternalBromium.g:896:2: ( ruleActionContext )
                    // InternalBromium.g:897:3: ruleActionContext
                    {
                     before(grammarAccess.getLocatorAccess().getActionContextParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleActionContext();

                    state._fsp--;

                     after(grammarAccess.getLocatorAccess().getActionContextParserRuleCall_3()); 

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
    // $ANTLR end "rule__Locator__Alternatives"


    // $ANTLR start "rule__WebDriverActionCondition__Alternatives"
    // InternalBromium.g:906:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );
    public final void rule__WebDriverActionCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:910:1: ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBromium.g:911:2: ( ruleElementByCssToBePresent )
                    {
                    // InternalBromium.g:911:2: ( ruleElementByCssToBePresent )
                    // InternalBromium.g:912:3: ruleElementByCssToBePresent
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
                    // InternalBromium.g:917:2: ( ruleTextOfElementWithCssSelectorToBe )
                    {
                    // InternalBromium.g:917:2: ( ruleTextOfElementWithCssSelectorToBe )
                    // InternalBromium.g:918:3: ruleTextOfElementWithCssSelectorToBe
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
                    // InternalBromium.g:923:2: ( ruleConfirmAlert )
                    {
                    // InternalBromium.g:923:2: ( ruleConfirmAlert )
                    // InternalBromium.g:924:3: ruleConfirmAlert
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
    // InternalBromium.g:933:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) );
    public final void rule__WebDriverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:937:1: ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalBromium.g:938:2: ( ruleClickCssSelector )
                    {
                    // InternalBromium.g:938:2: ( ruleClickCssSelector )
                    // InternalBromium.g:939:3: ruleClickCssSelector
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
                    // InternalBromium.g:944:2: ( ruleClickClassByText )
                    {
                    // InternalBromium.g:944:2: ( ruleClickClassByText )
                    // InternalBromium.g:945:3: ruleClickClassByText
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
                    // InternalBromium.g:950:2: ( rulePageLoad )
                    {
                    // InternalBromium.g:950:2: ( rulePageLoad )
                    // InternalBromium.g:951:3: rulePageLoad
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
                    // InternalBromium.g:956:2: ( ruleTypeTextInElementFoundByCssSelector )
                    {
                    // InternalBromium.g:956:2: ( ruleTypeTextInElementFoundByCssSelector )
                    // InternalBromium.g:957:3: ruleTypeTextInElementFoundByCssSelector
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
                    // InternalBromium.g:962:2: ( ruleClickDataId )
                    {
                    // InternalBromium.g:962:2: ( ruleClickDataId )
                    // InternalBromium.g:963:3: ruleClickDataId
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
                    // InternalBromium.g:968:2: ( ruleSetVariableToTextOfElementWithCssSelector )
                    {
                    // InternalBromium.g:968:2: ( ruleSetVariableToTextOfElementWithCssSelector )
                    // InternalBromium.g:969:3: ruleSetVariableToTextOfElementWithCssSelector
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
                    // InternalBromium.g:974:2: ( ruleClickId )
                    {
                    // InternalBromium.g:974:2: ( ruleClickId )
                    // InternalBromium.g:975:3: ruleClickId
                    {
                     before(grammarAccess.getWebDriverActionAccess().getClickIdParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleClickId();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getClickIdParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBromium.g:980:2: ( ruleClickName )
                    {
                    // InternalBromium.g:980:2: ( ruleClickName )
                    // InternalBromium.g:981:3: ruleClickName
                    {
                     before(grammarAccess.getWebDriverActionAccess().getClickNameParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleClickName();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getClickNameParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBromium.g:986:2: ( ruleSelectValue )
                    {
                    // InternalBromium.g:986:2: ( ruleSelectValue )
                    // InternalBromium.g:987:3: ruleSelectValue
                    {
                     before(grammarAccess.getWebDriverActionAccess().getSelectValueParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectValue();

                    state._fsp--;

                     after(grammarAccess.getWebDriverActionAccess().getSelectValueParserRuleCall_8()); 

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
    // InternalBromium.g:996:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) | ( ( rule__ParameterValue__IndexAssignment_2 ) ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1000:1: ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) | ( ( rule__ParameterValue__IndexAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBromium.g:1001:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    {
                    // InternalBromium.g:1001:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    // InternalBromium.g:1002:3: ( rule__ParameterValue__ContentAssignment_0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getContentAssignment_0()); 
                    // InternalBromium.g:1003:3: ( rule__ParameterValue__ContentAssignment_0 )
                    // InternalBromium.g:1003:4: rule__ParameterValue__ContentAssignment_0
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
                    // InternalBromium.g:1007:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    {
                    // InternalBromium.g:1007:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    // InternalBromium.g:1008:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    {
                     before(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1()); 
                    // InternalBromium.g:1009:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    // InternalBromium.g:1009:4: rule__ParameterValue__ExposedParameterAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__ExposedParameterAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBromium.g:1013:2: ( ( rule__ParameterValue__IndexAssignment_2 ) )
                    {
                    // InternalBromium.g:1013:2: ( ( rule__ParameterValue__IndexAssignment_2 ) )
                    // InternalBromium.g:1014:3: ( rule__ParameterValue__IndexAssignment_2 )
                    {
                     before(grammarAccess.getParameterValueAccess().getIndexAssignment_2()); 
                    // InternalBromium.g:1015:3: ( rule__ParameterValue__IndexAssignment_2 )
                    // InternalBromium.g:1015:4: rule__ParameterValue__IndexAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__IndexAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getIndexAssignment_2()); 

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
    // InternalBromium.g:1023:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1027:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBromium.g:1028:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalBromium.g:1035:1: rule__Model__Group__0__Impl : ( 'name' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1039:1: ( ( 'name' ) )
            // InternalBromium.g:1040:1: ( 'name' )
            {
            // InternalBromium.g:1040:1: ( 'name' )
            // InternalBromium.g:1041:2: 'name'
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
    // InternalBromium.g:1050:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1054:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBromium.g:1055:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalBromium.g:1062:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1066:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalBromium.g:1067:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalBromium.g:1067:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalBromium.g:1068:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalBromium.g:1069:2: ( rule__Model__NameAssignment_1 )
            // InternalBromium.g:1069:3: rule__Model__NameAssignment_1
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
    // InternalBromium.g:1077:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1081:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBromium.g:1082:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalBromium.g:1089:1: rule__Model__Group__2__Impl : ( 'version' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1093:1: ( ( 'version' ) )
            // InternalBromium.g:1094:1: ( 'version' )
            {
            // InternalBromium.g:1094:1: ( 'version' )
            // InternalBromium.g:1095:2: 'version'
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
    // InternalBromium.g:1104:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1108:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBromium.g:1109:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalBromium.g:1116:1: rule__Model__Group__3__Impl : ( ( rule__Model__VersionAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1120:1: ( ( ( rule__Model__VersionAssignment_3 ) ) )
            // InternalBromium.g:1121:1: ( ( rule__Model__VersionAssignment_3 ) )
            {
            // InternalBromium.g:1121:1: ( ( rule__Model__VersionAssignment_3 ) )
            // InternalBromium.g:1122:2: ( rule__Model__VersionAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_3()); 
            // InternalBromium.g:1123:2: ( rule__Model__VersionAssignment_3 )
            // InternalBromium.g:1123:3: rule__Model__VersionAssignment_3
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
    // InternalBromium.g:1131:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1135:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBromium.g:1136:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalBromium.g:1143:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1147:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalBromium.g:1148:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalBromium.g:1148:1: ( ( rule__Model__Group_4__0 )? )
            // InternalBromium.g:1149:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalBromium.g:1150:2: ( rule__Model__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBromium.g:1150:3: rule__Model__Group_4__0
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
    // InternalBromium.g:1158:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1162:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalBromium.g:1163:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalBromium.g:1170:1: rule__Model__Group__5__Impl : ( 'actions' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1174:1: ( ( 'actions' ) )
            // InternalBromium.g:1175:1: ( 'actions' )
            {
            // InternalBromium.g:1175:1: ( 'actions' )
            // InternalBromium.g:1176:2: 'actions'
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
    // InternalBromium.g:1185:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1189:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalBromium.g:1190:2: rule__Model__Group__6__Impl rule__Model__Group__7
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
    // InternalBromium.g:1197:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1201:1: ( ( '{' ) )
            // InternalBromium.g:1202:1: ( '{' )
            {
            // InternalBromium.g:1202:1: ( '{' )
            // InternalBromium.g:1203:2: '{'
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
    // InternalBromium.g:1212:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1216:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalBromium.g:1217:2: rule__Model__Group__7__Impl rule__Model__Group__8
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
    // InternalBromium.g:1224:1: rule__Model__Group__7__Impl : ( ( rule__Model__ActionsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1228:1: ( ( ( rule__Model__ActionsAssignment_7 )* ) )
            // InternalBromium.g:1229:1: ( ( rule__Model__ActionsAssignment_7 )* )
            {
            // InternalBromium.g:1229:1: ( ( rule__Model__ActionsAssignment_7 )* )
            // InternalBromium.g:1230:2: ( rule__Model__ActionsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getActionsAssignment_7()); 
            // InternalBromium.g:1231:2: ( rule__Model__ActionsAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBromium.g:1231:3: rule__Model__ActionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__ActionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalBromium.g:1239:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1243:1: ( rule__Model__Group__8__Impl )
            // InternalBromium.g:1244:2: rule__Model__Group__8__Impl
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
    // InternalBromium.g:1250:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1254:1: ( ( '}' ) )
            // InternalBromium.g:1255:1: ( '}' )
            {
            // InternalBromium.g:1255:1: ( '}' )
            // InternalBromium.g:1256:2: '}'
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
    // InternalBromium.g:1266:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1270:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalBromium.g:1271:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalBromium.g:1278:1: rule__Model__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1282:1: ( ( 'from' ) )
            // InternalBromium.g:1283:1: ( 'from' )
            {
            // InternalBromium.g:1283:1: ( 'from' )
            // InternalBromium.g:1284:2: 'from'
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
    // InternalBromium.g:1293:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1297:1: ( rule__Model__Group_4__1__Impl )
            // InternalBromium.g:1298:2: rule__Model__Group_4__1__Impl
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
    // InternalBromium.g:1304:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__BaseVersionAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1308:1: ( ( ( rule__Model__BaseVersionAssignment_4_1 ) ) )
            // InternalBromium.g:1309:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            {
            // InternalBromium.g:1309:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            // InternalBromium.g:1310:2: ( rule__Model__BaseVersionAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); 
            // InternalBromium.g:1311:2: ( rule__Model__BaseVersionAssignment_4_1 )
            // InternalBromium.g:1311:3: rule__Model__BaseVersionAssignment_4_1
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
    // InternalBromium.g:1320:1: rule__ApplicationAction__Group__0 : rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 ;
    public final void rule__ApplicationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1324:1: ( rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 )
            // InternalBromium.g:1325:2: rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1
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
    // InternalBromium.g:1332:1: rule__ApplicationAction__Group__0__Impl : ( 'id' ) ;
    public final void rule__ApplicationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1336:1: ( ( 'id' ) )
            // InternalBromium.g:1337:1: ( 'id' )
            {
            // InternalBromium.g:1337:1: ( 'id' )
            // InternalBromium.g:1338:2: 'id'
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
    // InternalBromium.g:1347:1: rule__ApplicationAction__Group__1 : rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 ;
    public final void rule__ApplicationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1351:1: ( rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 )
            // InternalBromium.g:1352:2: rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2
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
    // InternalBromium.g:1359:1: rule__ApplicationAction__Group__1__Impl : ( ( rule__ApplicationAction__NameAssignment_1 ) ) ;
    public final void rule__ApplicationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1363:1: ( ( ( rule__ApplicationAction__NameAssignment_1 ) ) )
            // InternalBromium.g:1364:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            {
            // InternalBromium.g:1364:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            // InternalBromium.g:1365:2: ( rule__ApplicationAction__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationActionAccess().getNameAssignment_1()); 
            // InternalBromium.g:1366:2: ( rule__ApplicationAction__NameAssignment_1 )
            // InternalBromium.g:1366:3: rule__ApplicationAction__NameAssignment_1
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
    // InternalBromium.g:1374:1: rule__ApplicationAction__Group__2 : rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 ;
    public final void rule__ApplicationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1378:1: ( rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 )
            // InternalBromium.g:1379:2: rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3
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
    // InternalBromium.g:1386:1: rule__ApplicationAction__Group__2__Impl : ( 'syntax' ) ;
    public final void rule__ApplicationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1390:1: ( ( 'syntax' ) )
            // InternalBromium.g:1391:1: ( 'syntax' )
            {
            // InternalBromium.g:1391:1: ( 'syntax' )
            // InternalBromium.g:1392:2: 'syntax'
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
    // InternalBromium.g:1401:1: rule__ApplicationAction__Group__3 : rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 ;
    public final void rule__ApplicationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1405:1: ( rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 )
            // InternalBromium.g:1406:2: rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4
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
    // InternalBromium.g:1413:1: rule__ApplicationAction__Group__3__Impl : ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) ;
    public final void rule__ApplicationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1417:1: ( ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) )
            // InternalBromium.g:1418:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            {
            // InternalBromium.g:1418:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            // InternalBromium.g:1419:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            {
             before(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsAssignment_3()); 
            // InternalBromium.g:1420:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBromium.g:1420:3: rule__ApplicationAction__SyntaxDefinitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ApplicationAction__SyntaxDefinitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalBromium.g:1428:1: rule__ApplicationAction__Group__4 : rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 ;
    public final void rule__ApplicationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1432:1: ( rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 )
            // InternalBromium.g:1433:2: rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5
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
    // InternalBromium.g:1440:1: rule__ApplicationAction__Group__4__Impl : ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) ;
    public final void rule__ApplicationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1444:1: ( ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) )
            // InternalBromium.g:1445:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            {
            // InternalBromium.g:1445:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            // InternalBromium.g:1446:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_4()); 
            // InternalBromium.g:1447:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBromium.g:1447:3: rule__ApplicationAction__PreconditionAssignment_4
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
    // InternalBromium.g:1455:1: rule__ApplicationAction__Group__5 : rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 ;
    public final void rule__ApplicationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1459:1: ( rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 )
            // InternalBromium.g:1460:2: rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalBromium.g:1467:1: rule__ApplicationAction__Group__5__Impl : ( ( rule__ApplicationAction__ActionContextAssignment_5 )? ) ;
    public final void rule__ApplicationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1471:1: ( ( ( rule__ApplicationAction__ActionContextAssignment_5 )? ) )
            // InternalBromium.g:1472:1: ( ( rule__ApplicationAction__ActionContextAssignment_5 )? )
            {
            // InternalBromium.g:1472:1: ( ( rule__ApplicationAction__ActionContextAssignment_5 )? )
            // InternalBromium.g:1473:2: ( rule__ApplicationAction__ActionContextAssignment_5 )?
            {
             before(grammarAccess.getApplicationActionAccess().getActionContextAssignment_5()); 
            // InternalBromium.g:1474:2: ( rule__ApplicationAction__ActionContextAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBromium.g:1474:3: rule__ApplicationAction__ActionContextAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__ActionContextAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getActionContextAssignment_5()); 

            }


            }

        }
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
    // InternalBromium.g:1482:1: rule__ApplicationAction__Group__6 : rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 ;
    public final void rule__ApplicationAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1486:1: ( rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 )
            // InternalBromium.g:1487:2: rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7
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
    // InternalBromium.g:1494:1: rule__ApplicationAction__Group__6__Impl : ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) ) ;
    public final void rule__ApplicationAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1498:1: ( ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) ) )
            // InternalBromium.g:1499:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) )
            {
            // InternalBromium.g:1499:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) )
            // InternalBromium.g:1500:2: ( rule__ApplicationAction__WebDriverActionAssignment_6 )
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_6()); 
            // InternalBromium.g:1501:2: ( rule__ApplicationAction__WebDriverActionAssignment_6 )
            // InternalBromium.g:1501:3: rule__ApplicationAction__WebDriverActionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__WebDriverActionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_6()); 

            }


            }

        }
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
    // InternalBromium.g:1509:1: rule__ApplicationAction__Group__7 : rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8 ;
    public final void rule__ApplicationAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1513:1: ( rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8 )
            // InternalBromium.g:1514:2: rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__ApplicationAction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__8();

            state._fsp--;


            }

        }
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
    // InternalBromium.g:1521:1: rule__ApplicationAction__Group__7__Impl : ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? ) ;
    public final void rule__ApplicationAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1525:1: ( ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? ) )
            // InternalBromium.g:1526:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? )
            {
            // InternalBromium.g:1526:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? )
            // InternalBromium.g:1527:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )?
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_7()); 
            // InternalBromium.g:1528:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBromium.g:1528:3: rule__ApplicationAction__ExpectHttpRequestAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__ExpectHttpRequestAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__ApplicationAction__Group__8"
    // InternalBromium.g:1536:1: rule__ApplicationAction__Group__8 : rule__ApplicationAction__Group__8__Impl ;
    public final void rule__ApplicationAction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1540:1: ( rule__ApplicationAction__Group__8__Impl )
            // InternalBromium.g:1541:2: rule__ApplicationAction__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group__8"


    // $ANTLR start "rule__ApplicationAction__Group__8__Impl"
    // InternalBromium.g:1547:1: rule__ApplicationAction__Group__8__Impl : ( ( rule__ApplicationAction__PostconditionAssignment_8 )? ) ;
    public final void rule__ApplicationAction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1551:1: ( ( ( rule__ApplicationAction__PostconditionAssignment_8 )? ) )
            // InternalBromium.g:1552:1: ( ( rule__ApplicationAction__PostconditionAssignment_8 )? )
            {
            // InternalBromium.g:1552:1: ( ( rule__ApplicationAction__PostconditionAssignment_8 )? )
            // InternalBromium.g:1553:2: ( rule__ApplicationAction__PostconditionAssignment_8 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_8()); 
            // InternalBromium.g:1554:2: ( rule__ApplicationAction__PostconditionAssignment_8 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBromium.g:1554:3: rule__ApplicationAction__PostconditionAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__PostconditionAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group__8__Impl"


    // $ANTLR start "rule__TableActionContext__Group__0"
    // InternalBromium.g:1563:1: rule__TableActionContext__Group__0 : rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1 ;
    public final void rule__TableActionContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1567:1: ( rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1 )
            // InternalBromium.g:1568:2: rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TableActionContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableActionContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__0"


    // $ANTLR start "rule__TableActionContext__Group__0__Impl"
    // InternalBromium.g:1575:1: rule__TableActionContext__Group__0__Impl : ( 'table' ) ;
    public final void rule__TableActionContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1579:1: ( ( 'table' ) )
            // InternalBromium.g:1580:1: ( 'table' )
            {
            // InternalBromium.g:1580:1: ( 'table' )
            // InternalBromium.g:1581:2: 'table'
            {
             before(grammarAccess.getTableActionContextAccess().getTableKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTableActionContextAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__0__Impl"


    // $ANTLR start "rule__TableActionContext__Group__1"
    // InternalBromium.g:1590:1: rule__TableActionContext__Group__1 : rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2 ;
    public final void rule__TableActionContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1594:1: ( rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2 )
            // InternalBromium.g:1595:2: rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TableActionContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableActionContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__1"


    // $ANTLR start "rule__TableActionContext__Group__1__Impl"
    // InternalBromium.g:1602:1: rule__TableActionContext__Group__1__Impl : ( 'with' ) ;
    public final void rule__TableActionContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1606:1: ( ( 'with' ) )
            // InternalBromium.g:1607:1: ( 'with' )
            {
            // InternalBromium.g:1607:1: ( 'with' )
            // InternalBromium.g:1608:2: 'with'
            {
             before(grammarAccess.getTableActionContextAccess().getWithKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableActionContextAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__1__Impl"


    // $ANTLR start "rule__TableActionContext__Group__2"
    // InternalBromium.g:1617:1: rule__TableActionContext__Group__2 : rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3 ;
    public final void rule__TableActionContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1621:1: ( rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3 )
            // InternalBromium.g:1622:2: rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TableActionContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableActionContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__2"


    // $ANTLR start "rule__TableActionContext__Group__2__Impl"
    // InternalBromium.g:1629:1: rule__TableActionContext__Group__2__Impl : ( ( rule__TableActionContext__TableLocatorAssignment_2 ) ) ;
    public final void rule__TableActionContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1633:1: ( ( ( rule__TableActionContext__TableLocatorAssignment_2 ) ) )
            // InternalBromium.g:1634:1: ( ( rule__TableActionContext__TableLocatorAssignment_2 ) )
            {
            // InternalBromium.g:1634:1: ( ( rule__TableActionContext__TableLocatorAssignment_2 ) )
            // InternalBromium.g:1635:2: ( rule__TableActionContext__TableLocatorAssignment_2 )
            {
             before(grammarAccess.getTableActionContextAccess().getTableLocatorAssignment_2()); 
            // InternalBromium.g:1636:2: ( rule__TableActionContext__TableLocatorAssignment_2 )
            // InternalBromium.g:1636:3: rule__TableActionContext__TableLocatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableActionContext__TableLocatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableActionContextAccess().getTableLocatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__2__Impl"


    // $ANTLR start "rule__TableActionContext__Group__3"
    // InternalBromium.g:1644:1: rule__TableActionContext__Group__3 : rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4 ;
    public final void rule__TableActionContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1648:1: ( rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4 )
            // InternalBromium.g:1649:2: rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__TableActionContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableActionContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__3"


    // $ANTLR start "rule__TableActionContext__Group__3__Impl"
    // InternalBromium.g:1656:1: rule__TableActionContext__Group__3__Impl : ( 'rows' ) ;
    public final void rule__TableActionContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1660:1: ( ( 'rows' ) )
            // InternalBromium.g:1661:1: ( 'rows' )
            {
            // InternalBromium.g:1661:1: ( 'rows' )
            // InternalBromium.g:1662:2: 'rows'
            {
             before(grammarAccess.getTableActionContextAccess().getRowsKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableActionContextAccess().getRowsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__3__Impl"


    // $ANTLR start "rule__TableActionContext__Group__4"
    // InternalBromium.g:1671:1: rule__TableActionContext__Group__4 : rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5 ;
    public final void rule__TableActionContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1675:1: ( rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5 )
            // InternalBromium.g:1676:2: rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__TableActionContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableActionContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__4"


    // $ANTLR start "rule__TableActionContext__Group__4__Impl"
    // InternalBromium.g:1683:1: rule__TableActionContext__Group__4__Impl : ( 'with' ) ;
    public final void rule__TableActionContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1687:1: ( ( 'with' ) )
            // InternalBromium.g:1688:1: ( 'with' )
            {
            // InternalBromium.g:1688:1: ( 'with' )
            // InternalBromium.g:1689:2: 'with'
            {
             before(grammarAccess.getTableActionContextAccess().getWithKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableActionContextAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__4__Impl"


    // $ANTLR start "rule__TableActionContext__Group__5"
    // InternalBromium.g:1698:1: rule__TableActionContext__Group__5 : rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6 ;
    public final void rule__TableActionContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1702:1: ( rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6 )
            // InternalBromium.g:1703:2: rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__TableActionContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableActionContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__5"


    // $ANTLR start "rule__TableActionContext__Group__5__Impl"
    // InternalBromium.g:1710:1: rule__TableActionContext__Group__5__Impl : ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) ) ;
    public final void rule__TableActionContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1714:1: ( ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) ) )
            // InternalBromium.g:1715:1: ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) )
            {
            // InternalBromium.g:1715:1: ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) )
            // InternalBromium.g:1716:2: ( rule__TableActionContext__RowsLocatorAssignment_5 )
            {
             before(grammarAccess.getTableActionContextAccess().getRowsLocatorAssignment_5()); 
            // InternalBromium.g:1717:2: ( rule__TableActionContext__RowsLocatorAssignment_5 )
            // InternalBromium.g:1717:3: rule__TableActionContext__RowsLocatorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TableActionContext__RowsLocatorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTableActionContextAccess().getRowsLocatorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__5__Impl"


    // $ANTLR start "rule__TableActionContext__Group__6"
    // InternalBromium.g:1725:1: rule__TableActionContext__Group__6 : rule__TableActionContext__Group__6__Impl ;
    public final void rule__TableActionContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1729:1: ( rule__TableActionContext__Group__6__Impl )
            // InternalBromium.g:1730:2: rule__TableActionContext__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableActionContext__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__6"


    // $ANTLR start "rule__TableActionContext__Group__6__Impl"
    // InternalBromium.g:1736:1: rule__TableActionContext__Group__6__Impl : ( ( rule__TableActionContext__RowSelectorAssignment_6 ) ) ;
    public final void rule__TableActionContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1740:1: ( ( ( rule__TableActionContext__RowSelectorAssignment_6 ) ) )
            // InternalBromium.g:1741:1: ( ( rule__TableActionContext__RowSelectorAssignment_6 ) )
            {
            // InternalBromium.g:1741:1: ( ( rule__TableActionContext__RowSelectorAssignment_6 ) )
            // InternalBromium.g:1742:2: ( rule__TableActionContext__RowSelectorAssignment_6 )
            {
             before(grammarAccess.getTableActionContextAccess().getRowSelectorAssignment_6()); 
            // InternalBromium.g:1743:2: ( rule__TableActionContext__RowSelectorAssignment_6 )
            // InternalBromium.g:1743:3: rule__TableActionContext__RowSelectorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TableActionContext__RowSelectorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTableActionContextAccess().getRowSelectorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__Group__6__Impl"


    // $ANTLR start "rule__RowLocator__Group__0"
    // InternalBromium.g:1752:1: rule__RowLocator__Group__0 : rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1 ;
    public final void rule__RowLocator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1756:1: ( rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1 )
            // InternalBromium.g:1757:2: rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RowLocator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowLocator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowLocator__Group__0"


    // $ANTLR start "rule__RowLocator__Group__0__Impl"
    // InternalBromium.g:1764:1: rule__RowLocator__Group__0__Impl : ( 'row' ) ;
    public final void rule__RowLocator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1768:1: ( ( 'row' ) )
            // InternalBromium.g:1769:1: ( 'row' )
            {
            // InternalBromium.g:1769:1: ( 'row' )
            // InternalBromium.g:1770:2: 'row'
            {
             before(grammarAccess.getRowLocatorAccess().getRowKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRowLocatorAccess().getRowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowLocator__Group__0__Impl"


    // $ANTLR start "rule__RowLocator__Group__1"
    // InternalBromium.g:1779:1: rule__RowLocator__Group__1 : rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2 ;
    public final void rule__RowLocator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1783:1: ( rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2 )
            // InternalBromium.g:1784:2: rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__RowLocator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowLocator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowLocator__Group__1"


    // $ANTLR start "rule__RowLocator__Group__1__Impl"
    // InternalBromium.g:1791:1: rule__RowLocator__Group__1__Impl : ( 'with' ) ;
    public final void rule__RowLocator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1795:1: ( ( 'with' ) )
            // InternalBromium.g:1796:1: ( 'with' )
            {
            // InternalBromium.g:1796:1: ( 'with' )
            // InternalBromium.g:1797:2: 'with'
            {
             before(grammarAccess.getRowLocatorAccess().getWithKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRowLocatorAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowLocator__Group__1__Impl"


    // $ANTLR start "rule__RowLocator__Group__2"
    // InternalBromium.g:1806:1: rule__RowLocator__Group__2 : rule__RowLocator__Group__2__Impl ;
    public final void rule__RowLocator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1810:1: ( rule__RowLocator__Group__2__Impl )
            // InternalBromium.g:1811:2: rule__RowLocator__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RowLocator__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowLocator__Group__2"


    // $ANTLR start "rule__RowLocator__Group__2__Impl"
    // InternalBromium.g:1817:1: rule__RowLocator__Group__2__Impl : ( ( rule__RowLocator__RowLocatorAssignment_2 ) ) ;
    public final void rule__RowLocator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1821:1: ( ( ( rule__RowLocator__RowLocatorAssignment_2 ) ) )
            // InternalBromium.g:1822:1: ( ( rule__RowLocator__RowLocatorAssignment_2 ) )
            {
            // InternalBromium.g:1822:1: ( ( rule__RowLocator__RowLocatorAssignment_2 ) )
            // InternalBromium.g:1823:2: ( rule__RowLocator__RowLocatorAssignment_2 )
            {
             before(grammarAccess.getRowLocatorAccess().getRowLocatorAssignment_2()); 
            // InternalBromium.g:1824:2: ( rule__RowLocator__RowLocatorAssignment_2 )
            // InternalBromium.g:1824:3: rule__RowLocator__RowLocatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RowLocator__RowLocatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRowLocatorAccess().getRowLocatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowLocator__Group__2__Impl"


    // $ANTLR start "rule__RowIndex__Group__0"
    // InternalBromium.g:1833:1: rule__RowIndex__Group__0 : rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1 ;
    public final void rule__RowIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1837:1: ( rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1 )
            // InternalBromium.g:1838:2: rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__RowIndex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowIndex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowIndex__Group__0"


    // $ANTLR start "rule__RowIndex__Group__0__Impl"
    // InternalBromium.g:1845:1: rule__RowIndex__Group__0__Impl : ( 'row' ) ;
    public final void rule__RowIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1849:1: ( ( 'row' ) )
            // InternalBromium.g:1850:1: ( 'row' )
            {
            // InternalBromium.g:1850:1: ( 'row' )
            // InternalBromium.g:1851:2: 'row'
            {
             before(grammarAccess.getRowIndexAccess().getRowKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRowIndexAccess().getRowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowIndex__Group__0__Impl"


    // $ANTLR start "rule__RowIndex__Group__1"
    // InternalBromium.g:1860:1: rule__RowIndex__Group__1 : rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2 ;
    public final void rule__RowIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1864:1: ( rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2 )
            // InternalBromium.g:1865:2: rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__RowIndex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowIndex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowIndex__Group__1"


    // $ANTLR start "rule__RowIndex__Group__1__Impl"
    // InternalBromium.g:1872:1: rule__RowIndex__Group__1__Impl : ( 'number' ) ;
    public final void rule__RowIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1876:1: ( ( 'number' ) )
            // InternalBromium.g:1877:1: ( 'number' )
            {
            // InternalBromium.g:1877:1: ( 'number' )
            // InternalBromium.g:1878:2: 'number'
            {
             before(grammarAccess.getRowIndexAccess().getNumberKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRowIndexAccess().getNumberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowIndex__Group__1__Impl"


    // $ANTLR start "rule__RowIndex__Group__2"
    // InternalBromium.g:1887:1: rule__RowIndex__Group__2 : rule__RowIndex__Group__2__Impl ;
    public final void rule__RowIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1891:1: ( rule__RowIndex__Group__2__Impl )
            // InternalBromium.g:1892:2: rule__RowIndex__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RowIndex__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowIndex__Group__2"


    // $ANTLR start "rule__RowIndex__Group__2__Impl"
    // InternalBromium.g:1898:1: rule__RowIndex__Group__2__Impl : ( ( rule__RowIndex__IndexAssignment_2 ) ) ;
    public final void rule__RowIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1902:1: ( ( ( rule__RowIndex__IndexAssignment_2 ) ) )
            // InternalBromium.g:1903:1: ( ( rule__RowIndex__IndexAssignment_2 ) )
            {
            // InternalBromium.g:1903:1: ( ( rule__RowIndex__IndexAssignment_2 ) )
            // InternalBromium.g:1904:2: ( rule__RowIndex__IndexAssignment_2 )
            {
             before(grammarAccess.getRowIndexAccess().getIndexAssignment_2()); 
            // InternalBromium.g:1905:2: ( rule__RowIndex__IndexAssignment_2 )
            // InternalBromium.g:1905:3: rule__RowIndex__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RowIndex__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRowIndexAccess().getIndexAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowIndex__Group__2__Impl"


    // $ANTLR start "rule__ClassByText__Group__0"
    // InternalBromium.g:1914:1: rule__ClassByText__Group__0 : rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1 ;
    public final void rule__ClassByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1918:1: ( rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1 )
            // InternalBromium.g:1919:2: rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ClassByText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassByText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__0"


    // $ANTLR start "rule__ClassByText__Group__0__Impl"
    // InternalBromium.g:1926:1: rule__ClassByText__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1930:1: ( ( 'class' ) )
            // InternalBromium.g:1931:1: ( 'class' )
            {
            // InternalBromium.g:1931:1: ( 'class' )
            // InternalBromium.g:1932:2: 'class'
            {
             before(grammarAccess.getClassByTextAccess().getClassKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassByTextAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__0__Impl"


    // $ANTLR start "rule__ClassByText__Group__1"
    // InternalBromium.g:1941:1: rule__ClassByText__Group__1 : rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2 ;
    public final void rule__ClassByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1945:1: ( rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2 )
            // InternalBromium.g:1946:2: rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ClassByText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassByText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__1"


    // $ANTLR start "rule__ClassByText__Group__1__Impl"
    // InternalBromium.g:1953:1: rule__ClassByText__Group__1__Impl : ( ( rule__ClassByText__KlassAssignment_1 ) ) ;
    public final void rule__ClassByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1957:1: ( ( ( rule__ClassByText__KlassAssignment_1 ) ) )
            // InternalBromium.g:1958:1: ( ( rule__ClassByText__KlassAssignment_1 ) )
            {
            // InternalBromium.g:1958:1: ( ( rule__ClassByText__KlassAssignment_1 ) )
            // InternalBromium.g:1959:2: ( rule__ClassByText__KlassAssignment_1 )
            {
             before(grammarAccess.getClassByTextAccess().getKlassAssignment_1()); 
            // InternalBromium.g:1960:2: ( rule__ClassByText__KlassAssignment_1 )
            // InternalBromium.g:1960:3: rule__ClassByText__KlassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassByText__KlassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassByTextAccess().getKlassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__1__Impl"


    // $ANTLR start "rule__ClassByText__Group__2"
    // InternalBromium.g:1968:1: rule__ClassByText__Group__2 : rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3 ;
    public final void rule__ClassByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1972:1: ( rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3 )
            // InternalBromium.g:1973:2: rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ClassByText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassByText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__2"


    // $ANTLR start "rule__ClassByText__Group__2__Impl"
    // InternalBromium.g:1980:1: rule__ClassByText__Group__2__Impl : ( 'and' ) ;
    public final void rule__ClassByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1984:1: ( ( 'and' ) )
            // InternalBromium.g:1985:1: ( 'and' )
            {
            // InternalBromium.g:1985:1: ( 'and' )
            // InternalBromium.g:1986:2: 'and'
            {
             before(grammarAccess.getClassByTextAccess().getAndKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassByTextAccess().getAndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__2__Impl"


    // $ANTLR start "rule__ClassByText__Group__3"
    // InternalBromium.g:1995:1: rule__ClassByText__Group__3 : rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4 ;
    public final void rule__ClassByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1999:1: ( rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4 )
            // InternalBromium.g:2000:2: rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ClassByText__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassByText__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__3"


    // $ANTLR start "rule__ClassByText__Group__3__Impl"
    // InternalBromium.g:2007:1: rule__ClassByText__Group__3__Impl : ( 'text' ) ;
    public final void rule__ClassByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2011:1: ( ( 'text' ) )
            // InternalBromium.g:2012:1: ( 'text' )
            {
            // InternalBromium.g:2012:1: ( 'text' )
            // InternalBromium.g:2013:2: 'text'
            {
             before(grammarAccess.getClassByTextAccess().getTextKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassByTextAccess().getTextKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__3__Impl"


    // $ANTLR start "rule__ClassByText__Group__4"
    // InternalBromium.g:2022:1: rule__ClassByText__Group__4 : rule__ClassByText__Group__4__Impl ;
    public final void rule__ClassByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2026:1: ( rule__ClassByText__Group__4__Impl )
            // InternalBromium.g:2027:2: rule__ClassByText__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassByText__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__4"


    // $ANTLR start "rule__ClassByText__Group__4__Impl"
    // InternalBromium.g:2033:1: rule__ClassByText__Group__4__Impl : ( ( rule__ClassByText__TextAssignment_4 ) ) ;
    public final void rule__ClassByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2037:1: ( ( ( rule__ClassByText__TextAssignment_4 ) ) )
            // InternalBromium.g:2038:1: ( ( rule__ClassByText__TextAssignment_4 ) )
            {
            // InternalBromium.g:2038:1: ( ( rule__ClassByText__TextAssignment_4 ) )
            // InternalBromium.g:2039:2: ( rule__ClassByText__TextAssignment_4 )
            {
             before(grammarAccess.getClassByTextAccess().getTextAssignment_4()); 
            // InternalBromium.g:2040:2: ( rule__ClassByText__TextAssignment_4 )
            // InternalBromium.g:2040:3: rule__ClassByText__TextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ClassByText__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClassByTextAccess().getTextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__Group__4__Impl"


    // $ANTLR start "rule__CssSelectorByText__Group__0"
    // InternalBromium.g:2049:1: rule__CssSelectorByText__Group__0 : rule__CssSelectorByText__Group__0__Impl rule__CssSelectorByText__Group__1 ;
    public final void rule__CssSelectorByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2053:1: ( rule__CssSelectorByText__Group__0__Impl rule__CssSelectorByText__Group__1 )
            // InternalBromium.g:2054:2: rule__CssSelectorByText__Group__0__Impl rule__CssSelectorByText__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CssSelectorByText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__0"


    // $ANTLR start "rule__CssSelectorByText__Group__0__Impl"
    // InternalBromium.g:2061:1: rule__CssSelectorByText__Group__0__Impl : ( 'css' ) ;
    public final void rule__CssSelectorByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2065:1: ( ( 'css' ) )
            // InternalBromium.g:2066:1: ( 'css' )
            {
            // InternalBromium.g:2066:1: ( 'css' )
            // InternalBromium.g:2067:2: 'css'
            {
             before(grammarAccess.getCssSelectorByTextAccess().getCssKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCssSelectorByTextAccess().getCssKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__0__Impl"


    // $ANTLR start "rule__CssSelectorByText__Group__1"
    // InternalBromium.g:2076:1: rule__CssSelectorByText__Group__1 : rule__CssSelectorByText__Group__1__Impl rule__CssSelectorByText__Group__2 ;
    public final void rule__CssSelectorByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2080:1: ( rule__CssSelectorByText__Group__1__Impl rule__CssSelectorByText__Group__2 )
            // InternalBromium.g:2081:2: rule__CssSelectorByText__Group__1__Impl rule__CssSelectorByText__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__CssSelectorByText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__1"


    // $ANTLR start "rule__CssSelectorByText__Group__1__Impl"
    // InternalBromium.g:2088:1: rule__CssSelectorByText__Group__1__Impl : ( 'selector' ) ;
    public final void rule__CssSelectorByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2092:1: ( ( 'selector' ) )
            // InternalBromium.g:2093:1: ( 'selector' )
            {
            // InternalBromium.g:2093:1: ( 'selector' )
            // InternalBromium.g:2094:2: 'selector'
            {
             before(grammarAccess.getCssSelectorByTextAccess().getSelectorKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCssSelectorByTextAccess().getSelectorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__1__Impl"


    // $ANTLR start "rule__CssSelectorByText__Group__2"
    // InternalBromium.g:2103:1: rule__CssSelectorByText__Group__2 : rule__CssSelectorByText__Group__2__Impl rule__CssSelectorByText__Group__3 ;
    public final void rule__CssSelectorByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2107:1: ( rule__CssSelectorByText__Group__2__Impl rule__CssSelectorByText__Group__3 )
            // InternalBromium.g:2108:2: rule__CssSelectorByText__Group__2__Impl rule__CssSelectorByText__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__CssSelectorByText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__2"


    // $ANTLR start "rule__CssSelectorByText__Group__2__Impl"
    // InternalBromium.g:2115:1: rule__CssSelectorByText__Group__2__Impl : ( ( rule__CssSelectorByText__SelectorAssignment_2 ) ) ;
    public final void rule__CssSelectorByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2119:1: ( ( ( rule__CssSelectorByText__SelectorAssignment_2 ) ) )
            // InternalBromium.g:2120:1: ( ( rule__CssSelectorByText__SelectorAssignment_2 ) )
            {
            // InternalBromium.g:2120:1: ( ( rule__CssSelectorByText__SelectorAssignment_2 ) )
            // InternalBromium.g:2121:2: ( rule__CssSelectorByText__SelectorAssignment_2 )
            {
             before(grammarAccess.getCssSelectorByTextAccess().getSelectorAssignment_2()); 
            // InternalBromium.g:2122:2: ( rule__CssSelectorByText__SelectorAssignment_2 )
            // InternalBromium.g:2122:3: rule__CssSelectorByText__SelectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__SelectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCssSelectorByTextAccess().getSelectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__2__Impl"


    // $ANTLR start "rule__CssSelectorByText__Group__3"
    // InternalBromium.g:2130:1: rule__CssSelectorByText__Group__3 : rule__CssSelectorByText__Group__3__Impl rule__CssSelectorByText__Group__4 ;
    public final void rule__CssSelectorByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2134:1: ( rule__CssSelectorByText__Group__3__Impl rule__CssSelectorByText__Group__4 )
            // InternalBromium.g:2135:2: rule__CssSelectorByText__Group__3__Impl rule__CssSelectorByText__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__CssSelectorByText__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__3"


    // $ANTLR start "rule__CssSelectorByText__Group__3__Impl"
    // InternalBromium.g:2142:1: rule__CssSelectorByText__Group__3__Impl : ( 'and' ) ;
    public final void rule__CssSelectorByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2146:1: ( ( 'and' ) )
            // InternalBromium.g:2147:1: ( 'and' )
            {
            // InternalBromium.g:2147:1: ( 'and' )
            // InternalBromium.g:2148:2: 'and'
            {
             before(grammarAccess.getCssSelectorByTextAccess().getAndKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCssSelectorByTextAccess().getAndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__3__Impl"


    // $ANTLR start "rule__CssSelectorByText__Group__4"
    // InternalBromium.g:2157:1: rule__CssSelectorByText__Group__4 : rule__CssSelectorByText__Group__4__Impl rule__CssSelectorByText__Group__5 ;
    public final void rule__CssSelectorByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2161:1: ( rule__CssSelectorByText__Group__4__Impl rule__CssSelectorByText__Group__5 )
            // InternalBromium.g:2162:2: rule__CssSelectorByText__Group__4__Impl rule__CssSelectorByText__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__CssSelectorByText__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__4"


    // $ANTLR start "rule__CssSelectorByText__Group__4__Impl"
    // InternalBromium.g:2169:1: rule__CssSelectorByText__Group__4__Impl : ( 'text' ) ;
    public final void rule__CssSelectorByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2173:1: ( ( 'text' ) )
            // InternalBromium.g:2174:1: ( 'text' )
            {
            // InternalBromium.g:2174:1: ( 'text' )
            // InternalBromium.g:2175:2: 'text'
            {
             before(grammarAccess.getCssSelectorByTextAccess().getTextKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCssSelectorByTextAccess().getTextKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__4__Impl"


    // $ANTLR start "rule__CssSelectorByText__Group__5"
    // InternalBromium.g:2184:1: rule__CssSelectorByText__Group__5 : rule__CssSelectorByText__Group__5__Impl ;
    public final void rule__CssSelectorByText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2188:1: ( rule__CssSelectorByText__Group__5__Impl )
            // InternalBromium.g:2189:2: rule__CssSelectorByText__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__5"


    // $ANTLR start "rule__CssSelectorByText__Group__5__Impl"
    // InternalBromium.g:2195:1: rule__CssSelectorByText__Group__5__Impl : ( ( rule__CssSelectorByText__TextAssignment_5 ) ) ;
    public final void rule__CssSelectorByText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2199:1: ( ( ( rule__CssSelectorByText__TextAssignment_5 ) ) )
            // InternalBromium.g:2200:1: ( ( rule__CssSelectorByText__TextAssignment_5 ) )
            {
            // InternalBromium.g:2200:1: ( ( rule__CssSelectorByText__TextAssignment_5 ) )
            // InternalBromium.g:2201:2: ( rule__CssSelectorByText__TextAssignment_5 )
            {
             before(grammarAccess.getCssSelectorByTextAccess().getTextAssignment_5()); 
            // InternalBromium.g:2202:2: ( rule__CssSelectorByText__TextAssignment_5 )
            // InternalBromium.g:2202:3: rule__CssSelectorByText__TextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CssSelectorByText__TextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCssSelectorByTextAccess().getTextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__Group__5__Impl"


    // $ANTLR start "rule__CssSelector__Group__0"
    // InternalBromium.g:2211:1: rule__CssSelector__Group__0 : rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 ;
    public final void rule__CssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2215:1: ( rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 )
            // InternalBromium.g:2216:2: rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CssSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__0"


    // $ANTLR start "rule__CssSelector__Group__0__Impl"
    // InternalBromium.g:2223:1: rule__CssSelector__Group__0__Impl : ( 'css' ) ;
    public final void rule__CssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2227:1: ( ( 'css' ) )
            // InternalBromium.g:2228:1: ( 'css' )
            {
            // InternalBromium.g:2228:1: ( 'css' )
            // InternalBromium.g:2229:2: 'css'
            {
             before(grammarAccess.getCssSelectorAccess().getCssKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCssSelectorAccess().getCssKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__0__Impl"


    // $ANTLR start "rule__CssSelector__Group__1"
    // InternalBromium.g:2238:1: rule__CssSelector__Group__1 : rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2 ;
    public final void rule__CssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2242:1: ( rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2 )
            // InternalBromium.g:2243:2: rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__CssSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CssSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__1"


    // $ANTLR start "rule__CssSelector__Group__1__Impl"
    // InternalBromium.g:2250:1: rule__CssSelector__Group__1__Impl : ( 'selector' ) ;
    public final void rule__CssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2254:1: ( ( 'selector' ) )
            // InternalBromium.g:2255:1: ( 'selector' )
            {
            // InternalBromium.g:2255:1: ( 'selector' )
            // InternalBromium.g:2256:2: 'selector'
            {
             before(grammarAccess.getCssSelectorAccess().getSelectorKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCssSelectorAccess().getSelectorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__1__Impl"


    // $ANTLR start "rule__CssSelector__Group__2"
    // InternalBromium.g:2265:1: rule__CssSelector__Group__2 : rule__CssSelector__Group__2__Impl ;
    public final void rule__CssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2269:1: ( rule__CssSelector__Group__2__Impl )
            // InternalBromium.g:2270:2: rule__CssSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__2"


    // $ANTLR start "rule__CssSelector__Group__2__Impl"
    // InternalBromium.g:2276:1: rule__CssSelector__Group__2__Impl : ( ( rule__CssSelector__SelectorAssignment_2 ) ) ;
    public final void rule__CssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2280:1: ( ( ( rule__CssSelector__SelectorAssignment_2 ) ) )
            // InternalBromium.g:2281:1: ( ( rule__CssSelector__SelectorAssignment_2 ) )
            {
            // InternalBromium.g:2281:1: ( ( rule__CssSelector__SelectorAssignment_2 ) )
            // InternalBromium.g:2282:2: ( rule__CssSelector__SelectorAssignment_2 )
            {
             before(grammarAccess.getCssSelectorAccess().getSelectorAssignment_2()); 
            // InternalBromium.g:2283:2: ( rule__CssSelector__SelectorAssignment_2 )
            // InternalBromium.g:2283:3: rule__CssSelector__SelectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CssSelector__SelectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCssSelectorAccess().getSelectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__Group__2__Impl"


    // $ANTLR start "rule__SyntaxDefinition__Group__0"
    // InternalBromium.g:2292:1: rule__SyntaxDefinition__Group__0 : rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 ;
    public final void rule__SyntaxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2296:1: ( rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 )
            // InternalBromium.g:2297:2: rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1
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
    // InternalBromium.g:2304:1: rule__SyntaxDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SyntaxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2308:1: ( ( () ) )
            // InternalBromium.g:2309:1: ( () )
            {
            // InternalBromium.g:2309:1: ( () )
            // InternalBromium.g:2310:2: ()
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getSyntaxDefinitionAction_0()); 
            // InternalBromium.g:2311:2: ()
            // InternalBromium.g:2311:3: 
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
    // InternalBromium.g:2319:1: rule__SyntaxDefinition__Group__1 : rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 ;
    public final void rule__SyntaxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2323:1: ( rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 )
            // InternalBromium.g:2324:2: rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2
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
    // InternalBromium.g:2331:1: rule__SyntaxDefinition__Group__1__Impl : ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) ;
    public final void rule__SyntaxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2335:1: ( ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) )
            // InternalBromium.g:2336:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            {
            // InternalBromium.g:2336:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            // InternalBromium.g:2337:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getContentAssignment_1()); 
            // InternalBromium.g:2338:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            // InternalBromium.g:2338:3: rule__SyntaxDefinition__ContentAssignment_1
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
    // InternalBromium.g:2346:1: rule__SyntaxDefinition__Group__2 : rule__SyntaxDefinition__Group__2__Impl ;
    public final void rule__SyntaxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2350:1: ( rule__SyntaxDefinition__Group__2__Impl )
            // InternalBromium.g:2351:2: rule__SyntaxDefinition__Group__2__Impl
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
    // InternalBromium.g:2357:1: rule__SyntaxDefinition__Group__2__Impl : ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) ;
    public final void rule__SyntaxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2361:1: ( ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) )
            // InternalBromium.g:2362:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            {
            // InternalBromium.g:2362:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            // InternalBromium.g:2363:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getParameterAssignment_2()); 
            // InternalBromium.g:2364:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBromium.g:2364:3: rule__SyntaxDefinition__ParameterAssignment_2
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
    // InternalBromium.g:2373:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2377:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalBromium.g:2378:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBromium.g:2385:1: rule__Precondition__Group__0__Impl : ( 'when' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2389:1: ( ( 'when' ) )
            // InternalBromium.g:2390:1: ( 'when' )
            {
            // InternalBromium.g:2390:1: ( 'when' )
            // InternalBromium.g:2391:2: 'when'
            {
             before(grammarAccess.getPreconditionAccess().getWhenKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBromium.g:2400:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2404:1: ( rule__Precondition__Group__1__Impl )
            // InternalBromium.g:2405:2: rule__Precondition__Group__1__Impl
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
    // InternalBromium.g:2411:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ActionAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2415:1: ( ( ( rule__Precondition__ActionAssignment_1 ) ) )
            // InternalBromium.g:2416:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            {
            // InternalBromium.g:2416:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            // InternalBromium.g:2417:2: ( rule__Precondition__ActionAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getActionAssignment_1()); 
            // InternalBromium.g:2418:2: ( rule__Precondition__ActionAssignment_1 )
            // InternalBromium.g:2418:3: rule__Precondition__ActionAssignment_1
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
    // InternalBromium.g:2427:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2431:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalBromium.g:2432:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBromium.g:2439:1: rule__Postcondition__Group__0__Impl : ( 'then' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2443:1: ( ( 'then' ) )
            // InternalBromium.g:2444:1: ( 'then' )
            {
            // InternalBromium.g:2444:1: ( 'then' )
            // InternalBromium.g:2445:2: 'then'
            {
             before(grammarAccess.getPostconditionAccess().getThenKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:2454:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2458:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalBromium.g:2459:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBromium.g:2466:1: rule__Postcondition__Group__1__Impl : ( 'make' ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2470:1: ( ( 'make' ) )
            // InternalBromium.g:2471:1: ( 'make' )
            {
            // InternalBromium.g:2471:1: ( 'make' )
            // InternalBromium.g:2472:2: 'make'
            {
             before(grammarAccess.getPostconditionAccess().getMakeKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBromium.g:2481:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2485:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalBromium.g:2486:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalBromium.g:2493:1: rule__Postcondition__Group__2__Impl : ( 'sure' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2497:1: ( ( 'sure' ) )
            // InternalBromium.g:2498:1: ( 'sure' )
            {
            // InternalBromium.g:2498:1: ( 'sure' )
            // InternalBromium.g:2499:2: 'sure'
            {
             before(grammarAccess.getPostconditionAccess().getSureKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBromium.g:2508:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2512:1: ( rule__Postcondition__Group__3__Impl )
            // InternalBromium.g:2513:2: rule__Postcondition__Group__3__Impl
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
    // InternalBromium.g:2519:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__ActionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2523:1: ( ( ( rule__Postcondition__ActionAssignment_3 ) ) )
            // InternalBromium.g:2524:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            {
            // InternalBromium.g:2524:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            // InternalBromium.g:2525:2: ( rule__Postcondition__ActionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getActionAssignment_3()); 
            // InternalBromium.g:2526:2: ( rule__Postcondition__ActionAssignment_3 )
            // InternalBromium.g:2526:3: rule__Postcondition__ActionAssignment_3
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
    // InternalBromium.g:2535:1: rule__ExpectHttpRequest__Group__0 : rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 ;
    public final void rule__ExpectHttpRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2539:1: ( rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 )
            // InternalBromium.g:2540:2: rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBromium.g:2547:1: rule__ExpectHttpRequest__Group__0__Impl : ( () ) ;
    public final void rule__ExpectHttpRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2551:1: ( ( () ) )
            // InternalBromium.g:2552:1: ( () )
            {
            // InternalBromium.g:2552:1: ( () )
            // InternalBromium.g:2553:2: ()
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectHttpRequestAction_0()); 
            // InternalBromium.g:2554:2: ()
            // InternalBromium.g:2554:3: 
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
    // InternalBromium.g:2562:1: rule__ExpectHttpRequest__Group__1 : rule__ExpectHttpRequest__Group__1__Impl ;
    public final void rule__ExpectHttpRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2566:1: ( rule__ExpectHttpRequest__Group__1__Impl )
            // InternalBromium.g:2567:2: rule__ExpectHttpRequest__Group__1__Impl
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
    // InternalBromium.g:2573:1: rule__ExpectHttpRequest__Group__1__Impl : ( ( rule__ExpectHttpRequest__Group_1__0 ) ) ;
    public final void rule__ExpectHttpRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2577:1: ( ( ( rule__ExpectHttpRequest__Group_1__0 ) ) )
            // InternalBromium.g:2578:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            {
            // InternalBromium.g:2578:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            // InternalBromium.g:2579:2: ( rule__ExpectHttpRequest__Group_1__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup_1()); 
            // InternalBromium.g:2580:2: ( rule__ExpectHttpRequest__Group_1__0 )
            // InternalBromium.g:2580:3: rule__ExpectHttpRequest__Group_1__0
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
    // InternalBromium.g:2589:1: rule__ExpectHttpRequest__Group_1__0 : rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 ;
    public final void rule__ExpectHttpRequest__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2593:1: ( rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 )
            // InternalBromium.g:2594:2: rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalBromium.g:2601:1: rule__ExpectHttpRequest__Group_1__0__Impl : ( 'do' ) ;
    public final void rule__ExpectHttpRequest__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2605:1: ( ( 'do' ) )
            // InternalBromium.g:2606:1: ( 'do' )
            {
            // InternalBromium.g:2606:1: ( 'do' )
            // InternalBromium.g:2607:2: 'do'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getDoKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBromium.g:2616:1: rule__ExpectHttpRequest__Group_1__1 : rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 ;
    public final void rule__ExpectHttpRequest__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2620:1: ( rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 )
            // InternalBromium.g:2621:2: rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalBromium.g:2628:1: rule__ExpectHttpRequest__Group_1__1__Impl : ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) ;
    public final void rule__ExpectHttpRequest__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2632:1: ( ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) )
            // InternalBromium.g:2633:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            {
            // InternalBromium.g:2633:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            // InternalBromium.g:2634:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotAssignment_1_1()); 
            // InternalBromium.g:2635:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==51) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBromium.g:2635:3: rule__ExpectHttpRequest__NotAssignment_1_1
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
    // InternalBromium.g:2643:1: rule__ExpectHttpRequest__Group_1__2 : rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 ;
    public final void rule__ExpectHttpRequest__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2647:1: ( rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 )
            // InternalBromium.g:2648:2: rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalBromium.g:2655:1: rule__ExpectHttpRequest__Group_1__2__Impl : ( 'expect' ) ;
    public final void rule__ExpectHttpRequest__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2659:1: ( ( 'expect' ) )
            // InternalBromium.g:2660:1: ( 'expect' )
            {
            // InternalBromium.g:2660:1: ( 'expect' )
            // InternalBromium.g:2661:2: 'expect'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBromium.g:2670:1: rule__ExpectHttpRequest__Group_1__3 : rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 ;
    public final void rule__ExpectHttpRequest__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2674:1: ( rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 )
            // InternalBromium.g:2675:2: rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalBromium.g:2682:1: rule__ExpectHttpRequest__Group_1__3__Impl : ( 'http' ) ;
    public final void rule__ExpectHttpRequest__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2686:1: ( ( 'http' ) )
            // InternalBromium.g:2687:1: ( 'http' )
            {
            // InternalBromium.g:2687:1: ( 'http' )
            // InternalBromium.g:2688:2: 'http'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getHttpKeyword_1_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBromium.g:2697:1: rule__ExpectHttpRequest__Group_1__4 : rule__ExpectHttpRequest__Group_1__4__Impl ;
    public final void rule__ExpectHttpRequest__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2701:1: ( rule__ExpectHttpRequest__Group_1__4__Impl )
            // InternalBromium.g:2702:2: rule__ExpectHttpRequest__Group_1__4__Impl
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
    // InternalBromium.g:2708:1: rule__ExpectHttpRequest__Group_1__4__Impl : ( 'request' ) ;
    public final void rule__ExpectHttpRequest__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2712:1: ( ( 'request' ) )
            // InternalBromium.g:2713:1: ( 'request' )
            {
            // InternalBromium.g:2713:1: ( 'request' )
            // InternalBromium.g:2714:2: 'request'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getRequestKeyword_1_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBromium.g:2724:1: rule__ElementByCssToBePresent__Group__0 : rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 ;
    public final void rule__ElementByCssToBePresent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2728:1: ( rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 )
            // InternalBromium.g:2729:2: rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:2736:1: rule__ElementByCssToBePresent__Group__0__Impl : ( 'element' ) ;
    public final void rule__ElementByCssToBePresent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2740:1: ( ( 'element' ) )
            // InternalBromium.g:2741:1: ( 'element' )
            {
            // InternalBromium.g:2741:1: ( 'element' )
            // InternalBromium.g:2742:2: 'element'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getElementKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:2751:1: rule__ElementByCssToBePresent__Group__1 : rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 ;
    public final void rule__ElementByCssToBePresent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2755:1: ( rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 )
            // InternalBromium.g:2756:2: rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalBromium.g:2763:1: rule__ElementByCssToBePresent__Group__1__Impl : ( 'with' ) ;
    public final void rule__ElementByCssToBePresent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2767:1: ( ( 'with' ) )
            // InternalBromium.g:2768:1: ( 'with' )
            {
            // InternalBromium.g:2768:1: ( 'with' )
            // InternalBromium.g:2769:2: 'with'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getWithKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:2778:1: rule__ElementByCssToBePresent__Group__2 : rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 ;
    public final void rule__ElementByCssToBePresent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2782:1: ( rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 )
            // InternalBromium.g:2783:2: rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:2790:1: rule__ElementByCssToBePresent__Group__2__Impl : ( 'css' ) ;
    public final void rule__ElementByCssToBePresent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2794:1: ( ( 'css' ) )
            // InternalBromium.g:2795:1: ( 'css' )
            {
            // InternalBromium.g:2795:1: ( 'css' )
            // InternalBromium.g:2796:2: 'css'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getCssKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBromium.g:2805:1: rule__ElementByCssToBePresent__Group__3 : rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 ;
    public final void rule__ElementByCssToBePresent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2809:1: ( rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 )
            // InternalBromium.g:2810:2: rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:2817:1: rule__ElementByCssToBePresent__Group__3__Impl : ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2821:1: ( ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:2822:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:2822:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:2823:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:2824:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            // InternalBromium.g:2824:3: rule__ElementByCssToBePresent__ParameterNamesAssignment_3
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
    // InternalBromium.g:2832:1: rule__ElementByCssToBePresent__Group__4 : rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 ;
    public final void rule__ElementByCssToBePresent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2836:1: ( rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 )
            // InternalBromium.g:2837:2: rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalBromium.g:2844:1: rule__ElementByCssToBePresent__Group__4__Impl : ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2848:1: ( ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:2849:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:2849:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:2850:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:2851:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            // InternalBromium.g:2851:3: rule__ElementByCssToBePresent__ParameterValuesAssignment_4
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
    // InternalBromium.g:2859:1: rule__ElementByCssToBePresent__Group__5 : rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 ;
    public final void rule__ElementByCssToBePresent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2863:1: ( rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 )
            // InternalBromium.g:2864:2: rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalBromium.g:2871:1: rule__ElementByCssToBePresent__Group__5__Impl : ( 'is' ) ;
    public final void rule__ElementByCssToBePresent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2875:1: ( ( 'is' ) )
            // InternalBromium.g:2876:1: ( 'is' )
            {
            // InternalBromium.g:2876:1: ( 'is' )
            // InternalBromium.g:2877:2: 'is'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getIsKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBromium.g:2886:1: rule__ElementByCssToBePresent__Group__6 : rule__ElementByCssToBePresent__Group__6__Impl ;
    public final void rule__ElementByCssToBePresent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2890:1: ( rule__ElementByCssToBePresent__Group__6__Impl )
            // InternalBromium.g:2891:2: rule__ElementByCssToBePresent__Group__6__Impl
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
    // InternalBromium.g:2897:1: rule__ElementByCssToBePresent__Group__6__Impl : ( 'present' ) ;
    public final void rule__ElementByCssToBePresent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2901:1: ( ( 'present' ) )
            // InternalBromium.g:2902:1: ( 'present' )
            {
            // InternalBromium.g:2902:1: ( 'present' )
            // InternalBromium.g:2903:2: 'present'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getPresentKeyword_6()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBromium.g:2913:1: rule__ClickCssSelector__Group__0 : rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 ;
    public final void rule__ClickCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2917:1: ( rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 )
            // InternalBromium.g:2918:2: rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBromium.g:2925:1: rule__ClickCssSelector__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2929:1: ( ( 'click' ) )
            // InternalBromium.g:2930:1: ( 'click' )
            {
            // InternalBromium.g:2930:1: ( 'click' )
            // InternalBromium.g:2931:2: 'click'
            {
             before(grammarAccess.getClickCssSelectorAccess().getClickKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBromium.g:2940:1: rule__ClickCssSelector__Group__1 : rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 ;
    public final void rule__ClickCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2944:1: ( rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 )
            // InternalBromium.g:2945:2: rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:2952:1: rule__ClickCssSelector__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2956:1: ( ( 'on' ) )
            // InternalBromium.g:2957:1: ( 'on' )
            {
            // InternalBromium.g:2957:1: ( 'on' )
            // InternalBromium.g:2958:2: 'on'
            {
             before(grammarAccess.getClickCssSelectorAccess().getOnKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:2967:1: rule__ClickCssSelector__Group__2 : rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 ;
    public final void rule__ClickCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2971:1: ( rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 )
            // InternalBromium.g:2972:2: rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:2979:1: rule__ClickCssSelector__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2983:1: ( ( 'element' ) )
            // InternalBromium.g:2984:1: ( 'element' )
            {
            // InternalBromium.g:2984:1: ( 'element' )
            // InternalBromium.g:2985:2: 'element'
            {
             before(grammarAccess.getClickCssSelectorAccess().getElementKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:2994:1: rule__ClickCssSelector__Group__3 : rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 ;
    public final void rule__ClickCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2998:1: ( rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 )
            // InternalBromium.g:2999:2: rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalBromium.g:3006:1: rule__ClickCssSelector__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3010:1: ( ( 'with' ) )
            // InternalBromium.g:3011:1: ( 'with' )
            {
            // InternalBromium.g:3011:1: ( 'with' )
            // InternalBromium.g:3012:2: 'with'
            {
             before(grammarAccess.getClickCssSelectorAccess().getWithKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:3021:1: rule__ClickCssSelector__Group__4 : rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 ;
    public final void rule__ClickCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3025:1: ( rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 )
            // InternalBromium.g:3026:2: rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:3033:1: rule__ClickCssSelector__Group__4__Impl : ( 'css' ) ;
    public final void rule__ClickCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3037:1: ( ( 'css' ) )
            // InternalBromium.g:3038:1: ( 'css' )
            {
            // InternalBromium.g:3038:1: ( 'css' )
            // InternalBromium.g:3039:2: 'css'
            {
             before(grammarAccess.getClickCssSelectorAccess().getCssKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBromium.g:3048:1: rule__ClickCssSelector__Group__5 : rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 ;
    public final void rule__ClickCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3052:1: ( rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 )
            // InternalBromium.g:3053:2: rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3060:1: rule__ClickCssSelector__Group__5__Impl : ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) ;
    public final void rule__ClickCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3064:1: ( ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) )
            // InternalBromium.g:3065:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            {
            // InternalBromium.g:3065:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            // InternalBromium.g:3066:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesAssignment_5()); 
            // InternalBromium.g:3067:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            // InternalBromium.g:3067:3: rule__ClickCssSelector__ParameterNamesAssignment_5
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
    // InternalBromium.g:3075:1: rule__ClickCssSelector__Group__6 : rule__ClickCssSelector__Group__6__Impl ;
    public final void rule__ClickCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3079:1: ( rule__ClickCssSelector__Group__6__Impl )
            // InternalBromium.g:3080:2: rule__ClickCssSelector__Group__6__Impl
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
    // InternalBromium.g:3086:1: rule__ClickCssSelector__Group__6__Impl : ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) ;
    public final void rule__ClickCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3090:1: ( ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) )
            // InternalBromium.g:3091:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            {
            // InternalBromium.g:3091:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            // InternalBromium.g:3092:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterValuesAssignment_6()); 
            // InternalBromium.g:3093:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            // InternalBromium.g:3093:3: rule__ClickCssSelector__ParameterValuesAssignment_6
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
    // InternalBromium.g:3102:1: rule__PageLoad__Group__0 : rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 ;
    public final void rule__PageLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3106:1: ( rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 )
            // InternalBromium.g:3107:2: rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalBromium.g:3114:1: rule__PageLoad__Group__0__Impl : ( 'load' ) ;
    public final void rule__PageLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3118:1: ( ( 'load' ) )
            // InternalBromium.g:3119:1: ( 'load' )
            {
            // InternalBromium.g:3119:1: ( 'load' )
            // InternalBromium.g:3120:2: 'load'
            {
             before(grammarAccess.getPageLoadAccess().getLoadKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBromium.g:3129:1: rule__PageLoad__Group__1 : rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 ;
    public final void rule__PageLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3133:1: ( rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 )
            // InternalBromium.g:3134:2: rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3141:1: rule__PageLoad__Group__1__Impl : ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) ;
    public final void rule__PageLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3145:1: ( ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:3146:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:3146:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:3147:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:3148:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            // InternalBromium.g:3148:3: rule__PageLoad__ParameterNamesAssignment_1
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
    // InternalBromium.g:3156:1: rule__PageLoad__Group__2 : rule__PageLoad__Group__2__Impl ;
    public final void rule__PageLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3160:1: ( rule__PageLoad__Group__2__Impl )
            // InternalBromium.g:3161:2: rule__PageLoad__Group__2__Impl
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
    // InternalBromium.g:3167:1: rule__PageLoad__Group__2__Impl : ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) ;
    public final void rule__PageLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3171:1: ( ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:3172:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:3172:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:3173:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:3174:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            // InternalBromium.g:3174:3: rule__PageLoad__ParameterValuesAssignment_2
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
    // InternalBromium.g:3183:1: rule__TypeTextInElementFoundByCssSelector__Group__0 : rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3187:1: ( rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 )
            // InternalBromium.g:3188:2: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBromium.g:3195:1: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3199:1: ( ( 'type' ) )
            // InternalBromium.g:3200:1: ( 'type' )
            {
            // InternalBromium.g:3200:1: ( 'type' )
            // InternalBromium.g:3201:2: 'type'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBromium.g:3210:1: rule__TypeTextInElementFoundByCssSelector__Group__1 : rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3214:1: ( rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 )
            // InternalBromium.g:3215:2: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3222:1: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3226:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:3227:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:3227:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:3228:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:3229:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:3229:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1
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
    // InternalBromium.g:3237:1: rule__TypeTextInElementFoundByCssSelector__Group__2 : rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3241:1: ( rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 )
            // InternalBromium.g:3242:2: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBromium.g:3249:1: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3253:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:3254:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:3254:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:3255:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:3256:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:3256:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2
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
    // InternalBromium.g:3264:1: rule__TypeTextInElementFoundByCssSelector__Group__3 : rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3268:1: ( rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 )
            // InternalBromium.g:3269:2: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:3276:1: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl : ( 'in' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3280:1: ( ( 'in' ) )
            // InternalBromium.g:3281:1: ( 'in' )
            {
            // InternalBromium.g:3281:1: ( 'in' )
            // InternalBromium.g:3282:2: 'in'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBromium.g:3291:1: rule__TypeTextInElementFoundByCssSelector__Group__4 : rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3295:1: ( rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 )
            // InternalBromium.g:3296:2: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:3303:1: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl : ( 'element' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3307:1: ( ( 'element' ) )
            // InternalBromium.g:3308:1: ( 'element' )
            {
            // InternalBromium.g:3308:1: ( 'element' )
            // InternalBromium.g:3309:2: 'element'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:3318:1: rule__TypeTextInElementFoundByCssSelector__Group__5 : rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3322:1: ( rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 )
            // InternalBromium.g:3323:2: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalBromium.g:3330:1: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl : ( 'with' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3334:1: ( ( 'with' ) )
            // InternalBromium.g:3335:1: ( 'with' )
            {
            // InternalBromium.g:3335:1: ( 'with' )
            // InternalBromium.g:3336:2: 'with'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:3345:1: rule__TypeTextInElementFoundByCssSelector__Group__6 : rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3349:1: ( rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 )
            // InternalBromium.g:3350:2: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:3357:1: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl : ( 'css' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3361:1: ( ( 'css' ) )
            // InternalBromium.g:3362:1: ( 'css' )
            {
            // InternalBromium.g:3362:1: ( 'css' )
            // InternalBromium.g:3363:2: 'css'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBromium.g:3372:1: rule__TypeTextInElementFoundByCssSelector__Group__7 : rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3376:1: ( rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 )
            // InternalBromium.g:3377:2: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3384:1: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3388:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:3389:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:3389:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:3390:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:3391:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            // InternalBromium.g:3391:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7
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
    // InternalBromium.g:3399:1: rule__TypeTextInElementFoundByCssSelector__Group__8 : rule__TypeTextInElementFoundByCssSelector__Group__8__Impl ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3403:1: ( rule__TypeTextInElementFoundByCssSelector__Group__8__Impl )
            // InternalBromium.g:3404:2: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl
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
    // InternalBromium.g:3410:1: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3414:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:3415:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:3415:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:3416:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:3417:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            // InternalBromium.g:3417:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8
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
    // InternalBromium.g:3426:1: rule__TextOfElementWithCssSelectorToBe__Group__0 : rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3430:1: ( rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 )
            // InternalBromium.g:3431:2: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:3438:1: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl : ( 'element' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3442:1: ( ( 'element' ) )
            // InternalBromium.g:3443:1: ( 'element' )
            {
            // InternalBromium.g:3443:1: ( 'element' )
            // InternalBromium.g:3444:2: 'element'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getElementKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:3453:1: rule__TextOfElementWithCssSelectorToBe__Group__1 : rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3457:1: ( rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 )
            // InternalBromium.g:3458:2: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalBromium.g:3465:1: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl : ( 'with' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3469:1: ( ( 'with' ) )
            // InternalBromium.g:3470:1: ( 'with' )
            {
            // InternalBromium.g:3470:1: ( 'with' )
            // InternalBromium.g:3471:2: 'with'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getWithKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:3480:1: rule__TextOfElementWithCssSelectorToBe__Group__2 : rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3484:1: ( rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 )
            // InternalBromium.g:3485:2: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:3492:1: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl : ( 'css' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3496:1: ( ( 'css' ) )
            // InternalBromium.g:3497:1: ( 'css' )
            {
            // InternalBromium.g:3497:1: ( 'css' )
            // InternalBromium.g:3498:2: 'css'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getCssKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBromium.g:3507:1: rule__TextOfElementWithCssSelectorToBe__Group__3 : rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3511:1: ( rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 )
            // InternalBromium.g:3512:2: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3519:1: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3523:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:3524:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:3524:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:3525:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:3526:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            // InternalBromium.g:3526:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3
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
    // InternalBromium.g:3534:1: rule__TextOfElementWithCssSelectorToBe__Group__4 : rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3538:1: ( rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 )
            // InternalBromium.g:3539:2: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalBromium.g:3546:1: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3550:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:3551:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:3551:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:3552:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:3553:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            // InternalBromium.g:3553:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4
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
    // InternalBromium.g:3561:1: rule__TextOfElementWithCssSelectorToBe__Group__5 : rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3565:1: ( rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 )
            // InternalBromium.g:3566:2: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalBromium.g:3573:1: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl : ( 'has' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3577:1: ( ( 'has' ) )
            // InternalBromium.g:3578:1: ( 'has' )
            {
            // InternalBromium.g:3578:1: ( 'has' )
            // InternalBromium.g:3579:2: 'has'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getHasKeyword_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBromium.g:3588:1: rule__TextOfElementWithCssSelectorToBe__Group__6 : rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3592:1: ( rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 )
            // InternalBromium.g:3593:2: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3600:1: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3604:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) )
            // InternalBromium.g:3605:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            {
            // InternalBromium.g:3605:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            // InternalBromium.g:3606:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_6()); 
            // InternalBromium.g:3607:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            // InternalBromium.g:3607:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6
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
    // InternalBromium.g:3615:1: rule__TextOfElementWithCssSelectorToBe__Group__7 : rule__TextOfElementWithCssSelectorToBe__Group__7__Impl ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3619:1: ( rule__TextOfElementWithCssSelectorToBe__Group__7__Impl )
            // InternalBromium.g:3620:2: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl
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
    // InternalBromium.g:3626:1: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3630:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) )
            // InternalBromium.g:3631:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            {
            // InternalBromium.g:3631:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            // InternalBromium.g:3632:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_7()); 
            // InternalBromium.g:3633:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            // InternalBromium.g:3633:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7
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
    // InternalBromium.g:3642:1: rule__ClickClassByText__Group__0 : rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 ;
    public final void rule__ClickClassByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3646:1: ( rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 )
            // InternalBromium.g:3647:2: rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBromium.g:3654:1: rule__ClickClassByText__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickClassByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3658:1: ( ( 'click' ) )
            // InternalBromium.g:3659:1: ( 'click' )
            {
            // InternalBromium.g:3659:1: ( 'click' )
            // InternalBromium.g:3660:2: 'click'
            {
             before(grammarAccess.getClickClassByTextAccess().getClickKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBromium.g:3669:1: rule__ClickClassByText__Group__1 : rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 ;
    public final void rule__ClickClassByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3673:1: ( rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 )
            // InternalBromium.g:3674:2: rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:3681:1: rule__ClickClassByText__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickClassByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3685:1: ( ( 'on' ) )
            // InternalBromium.g:3686:1: ( 'on' )
            {
            // InternalBromium.g:3686:1: ( 'on' )
            // InternalBromium.g:3687:2: 'on'
            {
             before(grammarAccess.getClickClassByTextAccess().getOnKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:3696:1: rule__ClickClassByText__Group__2 : rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 ;
    public final void rule__ClickClassByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3700:1: ( rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 )
            // InternalBromium.g:3701:2: rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:3708:1: rule__ClickClassByText__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickClassByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3712:1: ( ( 'element' ) )
            // InternalBromium.g:3713:1: ( 'element' )
            {
            // InternalBromium.g:3713:1: ( 'element' )
            // InternalBromium.g:3714:2: 'element'
            {
             before(grammarAccess.getClickClassByTextAccess().getElementKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:3723:1: rule__ClickClassByText__Group__3 : rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 ;
    public final void rule__ClickClassByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3727:1: ( rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 )
            // InternalBromium.g:3728:2: rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalBromium.g:3735:1: rule__ClickClassByText__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickClassByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3739:1: ( ( 'with' ) )
            // InternalBromium.g:3740:1: ( 'with' )
            {
            // InternalBromium.g:3740:1: ( 'with' )
            // InternalBromium.g:3741:2: 'with'
            {
             before(grammarAccess.getClickClassByTextAccess().getWithKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:3750:1: rule__ClickClassByText__Group__4 : rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 ;
    public final void rule__ClickClassByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3754:1: ( rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 )
            // InternalBromium.g:3755:2: rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3762:1: rule__ClickClassByText__Group__4__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickClassByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3766:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:3767:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:3767:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:3768:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:3769:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            // InternalBromium.g:3769:3: rule__ClickClassByText__ParameterNamesAssignment_4
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
    // InternalBromium.g:3777:1: rule__ClickClassByText__Group__5 : rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 ;
    public final void rule__ClickClassByText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3781:1: ( rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 )
            // InternalBromium.g:3782:2: rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3789:1: rule__ClickClassByText__Group__5__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickClassByText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3793:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:3794:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:3794:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:3795:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:3796:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            // InternalBromium.g:3796:3: rule__ClickClassByText__ParameterValuesAssignment_5
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
    // InternalBromium.g:3804:1: rule__ClickClassByText__Group__6 : rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 ;
    public final void rule__ClickClassByText__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3808:1: ( rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 )
            // InternalBromium.g:3809:2: rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalBromium.g:3816:1: rule__ClickClassByText__Group__6__Impl : ( 'and' ) ;
    public final void rule__ClickClassByText__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3820:1: ( ( 'and' ) )
            // InternalBromium.g:3821:1: ( 'and' )
            {
            // InternalBromium.g:3821:1: ( 'and' )
            // InternalBromium.g:3822:2: 'and'
            {
             before(grammarAccess.getClickClassByTextAccess().getAndKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBromium.g:3831:1: rule__ClickClassByText__Group__7 : rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 ;
    public final void rule__ClickClassByText__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3835:1: ( rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 )
            // InternalBromium.g:3836:2: rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3843:1: rule__ClickClassByText__Group__7__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) ;
    public final void rule__ClickClassByText__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3847:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:3848:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:3848:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:3849:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:3850:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            // InternalBromium.g:3850:3: rule__ClickClassByText__ParameterNamesAssignment_7
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
    // InternalBromium.g:3858:1: rule__ClickClassByText__Group__8 : rule__ClickClassByText__Group__8__Impl ;
    public final void rule__ClickClassByText__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3862:1: ( rule__ClickClassByText__Group__8__Impl )
            // InternalBromium.g:3863:2: rule__ClickClassByText__Group__8__Impl
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
    // InternalBromium.g:3869:1: rule__ClickClassByText__Group__8__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) ;
    public final void rule__ClickClassByText__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3873:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:3874:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:3874:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:3875:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:3876:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            // InternalBromium.g:3876:3: rule__ClickClassByText__ParameterValuesAssignment_8
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
    // InternalBromium.g:3885:1: rule__SetVariableToTextOfElementWithCssSelector__Group__0 : rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3889:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1 )
            // InternalBromium.g:3890:2: rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalBromium.g:3897:1: rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3901:1: ( ( 'set' ) )
            // InternalBromium.g:3902:1: ( 'set' )
            {
            // InternalBromium.g:3902:1: ( 'set' )
            // InternalBromium.g:3903:2: 'set'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getSetKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBromium.g:3912:1: rule__SetVariableToTextOfElementWithCssSelector__Group__1 : rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3916:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2 )
            // InternalBromium.g:3917:2: rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:3924:1: rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3928:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:3929:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:3929:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:3930:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:3931:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:3931:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1
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
    // InternalBromium.g:3939:1: rule__SetVariableToTextOfElementWithCssSelector__Group__2 : rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3943:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3 )
            // InternalBromium.g:3944:2: rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBromium.g:3951:1: rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3955:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:3956:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:3956:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:3957:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:3958:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:3958:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2
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
    // InternalBromium.g:3966:1: rule__SetVariableToTextOfElementWithCssSelector__Group__3 : rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3970:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4 )
            // InternalBromium.g:3971:2: rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalBromium.g:3978:1: rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl : ( 'to' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3982:1: ( ( 'to' ) )
            // InternalBromium.g:3983:1: ( 'to' )
            {
            // InternalBromium.g:3983:1: ( 'to' )
            // InternalBromium.g:3984:2: 'to'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getToKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBromium.g:3993:1: rule__SetVariableToTextOfElementWithCssSelector__Group__4 : rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3997:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5 )
            // InternalBromium.g:3998:2: rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalBromium.g:4005:1: rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl : ( 'the' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4009:1: ( ( 'the' ) )
            // InternalBromium.g:4010:1: ( 'the' )
            {
            // InternalBromium.g:4010:1: ( 'the' )
            // InternalBromium.g:4011:2: 'the'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTheKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBromium.g:4020:1: rule__SetVariableToTextOfElementWithCssSelector__Group__5 : rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4024:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6 )
            // InternalBromium.g:4025:2: rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalBromium.g:4032:1: rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl : ( 'text' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4036:1: ( ( 'text' ) )
            // InternalBromium.g:4037:1: ( 'text' )
            {
            // InternalBromium.g:4037:1: ( 'text' )
            // InternalBromium.g:4038:2: 'text'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTextKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBromium.g:4047:1: rule__SetVariableToTextOfElementWithCssSelector__Group__6 : rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4051:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7 )
            // InternalBromium.g:4052:2: rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:4059:1: rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl : ( 'of' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4063:1: ( ( 'of' ) )
            // InternalBromium.g:4064:1: ( 'of' )
            {
            // InternalBromium.g:4064:1: ( 'of' )
            // InternalBromium.g:4065:2: 'of'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getOfKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBromium.g:4074:1: rule__SetVariableToTextOfElementWithCssSelector__Group__7 : rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4078:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8 )
            // InternalBromium.g:4079:2: rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:4086:1: rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl : ( 'element' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4090:1: ( ( 'element' ) )
            // InternalBromium.g:4091:1: ( 'element' )
            {
            // InternalBromium.g:4091:1: ( 'element' )
            // InternalBromium.g:4092:2: 'element'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getElementKeyword_7()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:4101:1: rule__SetVariableToTextOfElementWithCssSelector__Group__8 : rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4105:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9 )
            // InternalBromium.g:4106:2: rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9
            {
            pushFollow(FOLLOW_30);
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
    // InternalBromium.g:4113:1: rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl : ( 'with' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4117:1: ( ( 'with' ) )
            // InternalBromium.g:4118:1: ( 'with' )
            {
            // InternalBromium.g:4118:1: ( 'with' )
            // InternalBromium.g:4119:2: 'with'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getWithKeyword_8()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:4128:1: rule__SetVariableToTextOfElementWithCssSelector__Group__9 : rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4132:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10 )
            // InternalBromium.g:4133:2: rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:4140:1: rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl : ( 'css' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4144:1: ( ( 'css' ) )
            // InternalBromium.g:4145:1: ( 'css' )
            {
            // InternalBromium.g:4145:1: ( 'css' )
            // InternalBromium.g:4146:2: 'css'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getCssKeyword_9()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBromium.g:4155:1: rule__SetVariableToTextOfElementWithCssSelector__Group__10 : rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4159:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11 )
            // InternalBromium.g:4160:2: rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:4167:1: rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4171:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) ) )
            // InternalBromium.g:4172:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) )
            {
            // InternalBromium.g:4172:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) )
            // InternalBromium.g:4173:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_10()); 
            // InternalBromium.g:4174:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 )
            // InternalBromium.g:4174:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10
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
    // InternalBromium.g:4182:1: rule__SetVariableToTextOfElementWithCssSelector__Group__11 : rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4186:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl )
            // InternalBromium.g:4187:2: rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl
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
    // InternalBromium.g:4193:1: rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4197:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) ) )
            // InternalBromium.g:4198:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) )
            {
            // InternalBromium.g:4198:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) )
            // InternalBromium.g:4199:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_11()); 
            // InternalBromium.g:4200:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 )
            // InternalBromium.g:4200:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11
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
    // InternalBromium.g:4209:1: rule__ClickDataId__Group__0 : rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 ;
    public final void rule__ClickDataId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4213:1: ( rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 )
            // InternalBromium.g:4214:2: rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBromium.g:4221:1: rule__ClickDataId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickDataId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4225:1: ( ( 'click' ) )
            // InternalBromium.g:4226:1: ( 'click' )
            {
            // InternalBromium.g:4226:1: ( 'click' )
            // InternalBromium.g:4227:2: 'click'
            {
             before(grammarAccess.getClickDataIdAccess().getClickKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBromium.g:4236:1: rule__ClickDataId__Group__1 : rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 ;
    public final void rule__ClickDataId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4240:1: ( rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 )
            // InternalBromium.g:4241:2: rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:4248:1: rule__ClickDataId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickDataId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4252:1: ( ( 'on' ) )
            // InternalBromium.g:4253:1: ( 'on' )
            {
            // InternalBromium.g:4253:1: ( 'on' )
            // InternalBromium.g:4254:2: 'on'
            {
             before(grammarAccess.getClickDataIdAccess().getOnKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:4263:1: rule__ClickDataId__Group__2 : rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 ;
    public final void rule__ClickDataId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4267:1: ( rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 )
            // InternalBromium.g:4268:2: rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:4275:1: rule__ClickDataId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickDataId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4279:1: ( ( 'element' ) )
            // InternalBromium.g:4280:1: ( 'element' )
            {
            // InternalBromium.g:4280:1: ( 'element' )
            // InternalBromium.g:4281:2: 'element'
            {
             before(grammarAccess.getClickDataIdAccess().getElementKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:4290:1: rule__ClickDataId__Group__3 : rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 ;
    public final void rule__ClickDataId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4294:1: ( rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 )
            // InternalBromium.g:4295:2: rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalBromium.g:4302:1: rule__ClickDataId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickDataId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4306:1: ( ( 'with' ) )
            // InternalBromium.g:4307:1: ( 'with' )
            {
            // InternalBromium.g:4307:1: ( 'with' )
            // InternalBromium.g:4308:2: 'with'
            {
             before(grammarAccess.getClickDataIdAccess().getWithKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:4317:1: rule__ClickDataId__Group__4 : rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 ;
    public final void rule__ClickDataId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4321:1: ( rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 )
            // InternalBromium.g:4322:2: rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:4329:1: rule__ClickDataId__Group__4__Impl : ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickDataId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4333:1: ( ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4334:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4334:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4335:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4336:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            // InternalBromium.g:4336:3: rule__ClickDataId__ParameterNamesAssignment_4
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
    // InternalBromium.g:4344:1: rule__ClickDataId__Group__5 : rule__ClickDataId__Group__5__Impl ;
    public final void rule__ClickDataId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4348:1: ( rule__ClickDataId__Group__5__Impl )
            // InternalBromium.g:4349:2: rule__ClickDataId__Group__5__Impl
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
    // InternalBromium.g:4355:1: rule__ClickDataId__Group__5__Impl : ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickDataId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4359:1: ( ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4360:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4360:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4361:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4362:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            // InternalBromium.g:4362:3: rule__ClickDataId__ParameterValuesAssignment_5
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
    // InternalBromium.g:4371:1: rule__ConfirmAlert__Group__0 : rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 ;
    public final void rule__ConfirmAlert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4375:1: ( rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 )
            // InternalBromium.g:4376:2: rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalBromium.g:4383:1: rule__ConfirmAlert__Group__0__Impl : ( 'to' ) ;
    public final void rule__ConfirmAlert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4387:1: ( ( 'to' ) )
            // InternalBromium.g:4388:1: ( 'to' )
            {
            // InternalBromium.g:4388:1: ( 'to' )
            // InternalBromium.g:4389:2: 'to'
            {
             before(grammarAccess.getConfirmAlertAccess().getToKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBromium.g:4398:1: rule__ConfirmAlert__Group__1 : rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 ;
    public final void rule__ConfirmAlert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4402:1: ( rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 )
            // InternalBromium.g:4403:2: rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:4410:1: rule__ConfirmAlert__Group__1__Impl : ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) ;
    public final void rule__ConfirmAlert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4414:1: ( ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:4415:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:4415:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:4416:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:4417:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            // InternalBromium.g:4417:3: rule__ConfirmAlert__ParameterNamesAssignment_1
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
    // InternalBromium.g:4425:1: rule__ConfirmAlert__Group__2 : rule__ConfirmAlert__Group__2__Impl ;
    public final void rule__ConfirmAlert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4429:1: ( rule__ConfirmAlert__Group__2__Impl )
            // InternalBromium.g:4430:2: rule__ConfirmAlert__Group__2__Impl
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
    // InternalBromium.g:4436:1: rule__ConfirmAlert__Group__2__Impl : ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) ;
    public final void rule__ConfirmAlert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4440:1: ( ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:4441:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:4441:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:4442:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:4443:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            // InternalBromium.g:4443:3: rule__ConfirmAlert__ParameterValuesAssignment_2
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
    // InternalBromium.g:4452:1: rule__ClickId__Group__0 : rule__ClickId__Group__0__Impl rule__ClickId__Group__1 ;
    public final void rule__ClickId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4456:1: ( rule__ClickId__Group__0__Impl rule__ClickId__Group__1 )
            // InternalBromium.g:4457:2: rule__ClickId__Group__0__Impl rule__ClickId__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBromium.g:4464:1: rule__ClickId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4468:1: ( ( 'click' ) )
            // InternalBromium.g:4469:1: ( 'click' )
            {
            // InternalBromium.g:4469:1: ( 'click' )
            // InternalBromium.g:4470:2: 'click'
            {
             before(grammarAccess.getClickIdAccess().getClickKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBromium.g:4479:1: rule__ClickId__Group__1 : rule__ClickId__Group__1__Impl rule__ClickId__Group__2 ;
    public final void rule__ClickId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4483:1: ( rule__ClickId__Group__1__Impl rule__ClickId__Group__2 )
            // InternalBromium.g:4484:2: rule__ClickId__Group__1__Impl rule__ClickId__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:4491:1: rule__ClickId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4495:1: ( ( 'on' ) )
            // InternalBromium.g:4496:1: ( 'on' )
            {
            // InternalBromium.g:4496:1: ( 'on' )
            // InternalBromium.g:4497:2: 'on'
            {
             before(grammarAccess.getClickIdAccess().getOnKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:4506:1: rule__ClickId__Group__2 : rule__ClickId__Group__2__Impl rule__ClickId__Group__3 ;
    public final void rule__ClickId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4510:1: ( rule__ClickId__Group__2__Impl rule__ClickId__Group__3 )
            // InternalBromium.g:4511:2: rule__ClickId__Group__2__Impl rule__ClickId__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:4518:1: rule__ClickId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4522:1: ( ( 'element' ) )
            // InternalBromium.g:4523:1: ( 'element' )
            {
            // InternalBromium.g:4523:1: ( 'element' )
            // InternalBromium.g:4524:2: 'element'
            {
             before(grammarAccess.getClickIdAccess().getElementKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:4533:1: rule__ClickId__Group__3 : rule__ClickId__Group__3__Impl rule__ClickId__Group__4 ;
    public final void rule__ClickId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4537:1: ( rule__ClickId__Group__3__Impl rule__ClickId__Group__4 )
            // InternalBromium.g:4538:2: rule__ClickId__Group__3__Impl rule__ClickId__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalBromium.g:4545:1: rule__ClickId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4549:1: ( ( 'with' ) )
            // InternalBromium.g:4550:1: ( 'with' )
            {
            // InternalBromium.g:4550:1: ( 'with' )
            // InternalBromium.g:4551:2: 'with'
            {
             before(grammarAccess.getClickIdAccess().getWithKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:4560:1: rule__ClickId__Group__4 : rule__ClickId__Group__4__Impl rule__ClickId__Group__5 ;
    public final void rule__ClickId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4564:1: ( rule__ClickId__Group__4__Impl rule__ClickId__Group__5 )
            // InternalBromium.g:4565:2: rule__ClickId__Group__4__Impl rule__ClickId__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:4572:1: rule__ClickId__Group__4__Impl : ( ( rule__ClickId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4576:1: ( ( ( rule__ClickId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4577:1: ( ( rule__ClickId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4577:1: ( ( rule__ClickId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4578:2: ( rule__ClickId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4579:2: ( rule__ClickId__ParameterNamesAssignment_4 )
            // InternalBromium.g:4579:3: rule__ClickId__ParameterNamesAssignment_4
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
    // InternalBromium.g:4587:1: rule__ClickId__Group__5 : rule__ClickId__Group__5__Impl ;
    public final void rule__ClickId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4591:1: ( rule__ClickId__Group__5__Impl )
            // InternalBromium.g:4592:2: rule__ClickId__Group__5__Impl
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
    // InternalBromium.g:4598:1: rule__ClickId__Group__5__Impl : ( ( rule__ClickId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4602:1: ( ( ( rule__ClickId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4603:1: ( ( rule__ClickId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4603:1: ( ( rule__ClickId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4604:2: ( rule__ClickId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4605:2: ( rule__ClickId__ParameterValuesAssignment_5 )
            // InternalBromium.g:4605:3: rule__ClickId__ParameterValuesAssignment_5
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


    // $ANTLR start "rule__ClickName__Group__0"
    // InternalBromium.g:4614:1: rule__ClickName__Group__0 : rule__ClickName__Group__0__Impl rule__ClickName__Group__1 ;
    public final void rule__ClickName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4618:1: ( rule__ClickName__Group__0__Impl rule__ClickName__Group__1 )
            // InternalBromium.g:4619:2: rule__ClickName__Group__0__Impl rule__ClickName__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ClickName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__0"


    // $ANTLR start "rule__ClickName__Group__0__Impl"
    // InternalBromium.g:4626:1: rule__ClickName__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4630:1: ( ( 'click' ) )
            // InternalBromium.g:4631:1: ( 'click' )
            {
            // InternalBromium.g:4631:1: ( 'click' )
            // InternalBromium.g:4632:2: 'click'
            {
             before(grammarAccess.getClickNameAccess().getClickKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClickNameAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__0__Impl"


    // $ANTLR start "rule__ClickName__Group__1"
    // InternalBromium.g:4641:1: rule__ClickName__Group__1 : rule__ClickName__Group__1__Impl rule__ClickName__Group__2 ;
    public final void rule__ClickName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4645:1: ( rule__ClickName__Group__1__Impl rule__ClickName__Group__2 )
            // InternalBromium.g:4646:2: rule__ClickName__Group__1__Impl rule__ClickName__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ClickName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__1"


    // $ANTLR start "rule__ClickName__Group__1__Impl"
    // InternalBromium.g:4653:1: rule__ClickName__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4657:1: ( ( 'on' ) )
            // InternalBromium.g:4658:1: ( 'on' )
            {
            // InternalBromium.g:4658:1: ( 'on' )
            // InternalBromium.g:4659:2: 'on'
            {
             before(grammarAccess.getClickNameAccess().getOnKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getClickNameAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__1__Impl"


    // $ANTLR start "rule__ClickName__Group__2"
    // InternalBromium.g:4668:1: rule__ClickName__Group__2 : rule__ClickName__Group__2__Impl rule__ClickName__Group__3 ;
    public final void rule__ClickName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4672:1: ( rule__ClickName__Group__2__Impl rule__ClickName__Group__3 )
            // InternalBromium.g:4673:2: rule__ClickName__Group__2__Impl rule__ClickName__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ClickName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__2"


    // $ANTLR start "rule__ClickName__Group__2__Impl"
    // InternalBromium.g:4680:1: rule__ClickName__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4684:1: ( ( 'element' ) )
            // InternalBromium.g:4685:1: ( 'element' )
            {
            // InternalBromium.g:4685:1: ( 'element' )
            // InternalBromium.g:4686:2: 'element'
            {
             before(grammarAccess.getClickNameAccess().getElementKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClickNameAccess().getElementKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__2__Impl"


    // $ANTLR start "rule__ClickName__Group__3"
    // InternalBromium.g:4695:1: rule__ClickName__Group__3 : rule__ClickName__Group__3__Impl rule__ClickName__Group__4 ;
    public final void rule__ClickName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4699:1: ( rule__ClickName__Group__3__Impl rule__ClickName__Group__4 )
            // InternalBromium.g:4700:2: rule__ClickName__Group__3__Impl rule__ClickName__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__ClickName__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickName__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__3"


    // $ANTLR start "rule__ClickName__Group__3__Impl"
    // InternalBromium.g:4707:1: rule__ClickName__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4711:1: ( ( 'with' ) )
            // InternalBromium.g:4712:1: ( 'with' )
            {
            // InternalBromium.g:4712:1: ( 'with' )
            // InternalBromium.g:4713:2: 'with'
            {
             before(grammarAccess.getClickNameAccess().getWithKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClickNameAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__3__Impl"


    // $ANTLR start "rule__ClickName__Group__4"
    // InternalBromium.g:4722:1: rule__ClickName__Group__4 : rule__ClickName__Group__4__Impl rule__ClickName__Group__5 ;
    public final void rule__ClickName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4726:1: ( rule__ClickName__Group__4__Impl rule__ClickName__Group__5 )
            // InternalBromium.g:4727:2: rule__ClickName__Group__4__Impl rule__ClickName__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ClickName__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickName__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__4"


    // $ANTLR start "rule__ClickName__Group__4__Impl"
    // InternalBromium.g:4734:1: rule__ClickName__Group__4__Impl : ( ( rule__ClickName__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4738:1: ( ( ( rule__ClickName__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4739:1: ( ( rule__ClickName__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4739:1: ( ( rule__ClickName__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4740:2: ( rule__ClickName__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickNameAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4741:2: ( rule__ClickName__ParameterNamesAssignment_4 )
            // InternalBromium.g:4741:3: rule__ClickName__ParameterNamesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ClickName__ParameterNamesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClickNameAccess().getParameterNamesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__4__Impl"


    // $ANTLR start "rule__ClickName__Group__5"
    // InternalBromium.g:4749:1: rule__ClickName__Group__5 : rule__ClickName__Group__5__Impl ;
    public final void rule__ClickName__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4753:1: ( rule__ClickName__Group__5__Impl )
            // InternalBromium.g:4754:2: rule__ClickName__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickName__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__5"


    // $ANTLR start "rule__ClickName__Group__5__Impl"
    // InternalBromium.g:4760:1: rule__ClickName__Group__5__Impl : ( ( rule__ClickName__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickName__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4764:1: ( ( ( rule__ClickName__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4765:1: ( ( rule__ClickName__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4765:1: ( ( rule__ClickName__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4766:2: ( rule__ClickName__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickNameAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4767:2: ( rule__ClickName__ParameterValuesAssignment_5 )
            // InternalBromium.g:4767:3: rule__ClickName__ParameterValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ClickName__ParameterValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClickNameAccess().getParameterValuesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__Group__5__Impl"


    // $ANTLR start "rule__SelectValue__Group__0"
    // InternalBromium.g:4776:1: rule__SelectValue__Group__0 : rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1 ;
    public final void rule__SelectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4780:1: ( rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1 )
            // InternalBromium.g:4781:2: rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__SelectValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__0"


    // $ANTLR start "rule__SelectValue__Group__0__Impl"
    // InternalBromium.g:4788:1: rule__SelectValue__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4792:1: ( ( 'select' ) )
            // InternalBromium.g:4793:1: ( 'select' )
            {
            // InternalBromium.g:4793:1: ( 'select' )
            // InternalBromium.g:4794:2: 'select'
            {
             before(grammarAccess.getSelectValueAccess().getSelectKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSelectValueAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__0__Impl"


    // $ANTLR start "rule__SelectValue__Group__1"
    // InternalBromium.g:4803:1: rule__SelectValue__Group__1 : rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2 ;
    public final void rule__SelectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4807:1: ( rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2 )
            // InternalBromium.g:4808:2: rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SelectValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__1"


    // $ANTLR start "rule__SelectValue__Group__1__Impl"
    // InternalBromium.g:4815:1: rule__SelectValue__Group__1__Impl : ( ( rule__SelectValue__ParameterNamesAssignment_1 ) ) ;
    public final void rule__SelectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4819:1: ( ( ( rule__SelectValue__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:4820:1: ( ( rule__SelectValue__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:4820:1: ( ( rule__SelectValue__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:4821:2: ( rule__SelectValue__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:4822:2: ( rule__SelectValue__ParameterNamesAssignment_1 )
            // InternalBromium.g:4822:3: rule__SelectValue__ParameterNamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectValue__ParameterNamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__1__Impl"


    // $ANTLR start "rule__SelectValue__Group__2"
    // InternalBromium.g:4830:1: rule__SelectValue__Group__2 : rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3 ;
    public final void rule__SelectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4834:1: ( rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3 )
            // InternalBromium.g:4835:2: rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__SelectValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__2"


    // $ANTLR start "rule__SelectValue__Group__2__Impl"
    // InternalBromium.g:4842:1: rule__SelectValue__Group__2__Impl : ( ( rule__SelectValue__ParameterValuesAssignment_2 ) ) ;
    public final void rule__SelectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4846:1: ( ( ( rule__SelectValue__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:4847:1: ( ( rule__SelectValue__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:4847:1: ( ( rule__SelectValue__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:4848:2: ( rule__SelectValue__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:4849:2: ( rule__SelectValue__ParameterValuesAssignment_2 )
            // InternalBromium.g:4849:3: rule__SelectValue__ParameterValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectValue__ParameterValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__2__Impl"


    // $ANTLR start "rule__SelectValue__Group__3"
    // InternalBromium.g:4857:1: rule__SelectValue__Group__3 : rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4 ;
    public final void rule__SelectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4861:1: ( rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4 )
            // InternalBromium.g:4862:2: rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__SelectValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__3"


    // $ANTLR start "rule__SelectValue__Group__3__Impl"
    // InternalBromium.g:4869:1: rule__SelectValue__Group__3__Impl : ( 'in' ) ;
    public final void rule__SelectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4873:1: ( ( 'in' ) )
            // InternalBromium.g:4874:1: ( 'in' )
            {
            // InternalBromium.g:4874:1: ( 'in' )
            // InternalBromium.g:4875:2: 'in'
            {
             before(grammarAccess.getSelectValueAccess().getInKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSelectValueAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__3__Impl"


    // $ANTLR start "rule__SelectValue__Group__4"
    // InternalBromium.g:4884:1: rule__SelectValue__Group__4 : rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5 ;
    public final void rule__SelectValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4888:1: ( rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5 )
            // InternalBromium.g:4889:2: rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__SelectValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__4"


    // $ANTLR start "rule__SelectValue__Group__4__Impl"
    // InternalBromium.g:4896:1: rule__SelectValue__Group__4__Impl : ( 'element' ) ;
    public final void rule__SelectValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4900:1: ( ( 'element' ) )
            // InternalBromium.g:4901:1: ( 'element' )
            {
            // InternalBromium.g:4901:1: ( 'element' )
            // InternalBromium.g:4902:2: 'element'
            {
             before(grammarAccess.getSelectValueAccess().getElementKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSelectValueAccess().getElementKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__4__Impl"


    // $ANTLR start "rule__SelectValue__Group__5"
    // InternalBromium.g:4911:1: rule__SelectValue__Group__5 : rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6 ;
    public final void rule__SelectValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4915:1: ( rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6 )
            // InternalBromium.g:4916:2: rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__SelectValue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__5"


    // $ANTLR start "rule__SelectValue__Group__5__Impl"
    // InternalBromium.g:4923:1: rule__SelectValue__Group__5__Impl : ( 'with' ) ;
    public final void rule__SelectValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4927:1: ( ( 'with' ) )
            // InternalBromium.g:4928:1: ( 'with' )
            {
            // InternalBromium.g:4928:1: ( 'with' )
            // InternalBromium.g:4929:2: 'with'
            {
             before(grammarAccess.getSelectValueAccess().getWithKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSelectValueAccess().getWithKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__5__Impl"


    // $ANTLR start "rule__SelectValue__Group__6"
    // InternalBromium.g:4938:1: rule__SelectValue__Group__6 : rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7 ;
    public final void rule__SelectValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4942:1: ( rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7 )
            // InternalBromium.g:4943:2: rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__SelectValue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__6"


    // $ANTLR start "rule__SelectValue__Group__6__Impl"
    // InternalBromium.g:4950:1: rule__SelectValue__Group__6__Impl : ( 'css' ) ;
    public final void rule__SelectValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4954:1: ( ( 'css' ) )
            // InternalBromium.g:4955:1: ( 'css' )
            {
            // InternalBromium.g:4955:1: ( 'css' )
            // InternalBromium.g:4956:2: 'css'
            {
             before(grammarAccess.getSelectValueAccess().getCssKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectValueAccess().getCssKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__6__Impl"


    // $ANTLR start "rule__SelectValue__Group__7"
    // InternalBromium.g:4965:1: rule__SelectValue__Group__7 : rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8 ;
    public final void rule__SelectValue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4969:1: ( rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8 )
            // InternalBromium.g:4970:2: rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__SelectValue__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__7"


    // $ANTLR start "rule__SelectValue__Group__7__Impl"
    // InternalBromium.g:4977:1: rule__SelectValue__Group__7__Impl : ( ( rule__SelectValue__ParameterNamesAssignment_7 ) ) ;
    public final void rule__SelectValue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4981:1: ( ( ( rule__SelectValue__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:4982:1: ( ( rule__SelectValue__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:4982:1: ( ( rule__SelectValue__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:4983:2: ( rule__SelectValue__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:4984:2: ( rule__SelectValue__ParameterNamesAssignment_7 )
            // InternalBromium.g:4984:3: rule__SelectValue__ParameterNamesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SelectValue__ParameterNamesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__7__Impl"


    // $ANTLR start "rule__SelectValue__Group__8"
    // InternalBromium.g:4992:1: rule__SelectValue__Group__8 : rule__SelectValue__Group__8__Impl ;
    public final void rule__SelectValue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4996:1: ( rule__SelectValue__Group__8__Impl )
            // InternalBromium.g:4997:2: rule__SelectValue__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectValue__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__8"


    // $ANTLR start "rule__SelectValue__Group__8__Impl"
    // InternalBromium.g:5003:1: rule__SelectValue__Group__8__Impl : ( ( rule__SelectValue__ParameterValuesAssignment_8 ) ) ;
    public final void rule__SelectValue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5007:1: ( ( ( rule__SelectValue__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:5008:1: ( ( rule__SelectValue__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:5008:1: ( ( rule__SelectValue__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:5009:2: ( rule__SelectValue__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:5010:2: ( rule__SelectValue__ParameterValuesAssignment_8 )
            // InternalBromium.g:5010:3: rule__SelectValue__ParameterValuesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SelectValue__ParameterValuesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__Group__8__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalBromium.g:5019:1: rule__Model__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5023:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5024:2: ( RULE_STRING )
            {
            // InternalBromium.g:5024:2: ( RULE_STRING )
            // InternalBromium.g:5025:3: RULE_STRING
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
    // InternalBromium.g:5034:1: rule__Model__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Model__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5038:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5039:2: ( RULE_STRING )
            {
            // InternalBromium.g:5039:2: ( RULE_STRING )
            // InternalBromium.g:5040:3: RULE_STRING
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
    // InternalBromium.g:5049:1: rule__Model__BaseVersionAssignment_4_1 : ( ruleVersion ) ;
    public final void rule__Model__BaseVersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5053:1: ( ( ruleVersion ) )
            // InternalBromium.g:5054:2: ( ruleVersion )
            {
            // InternalBromium.g:5054:2: ( ruleVersion )
            // InternalBromium.g:5055:3: ruleVersion
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
    // InternalBromium.g:5064:1: rule__Model__ActionsAssignment_7 : ( ruleApplicationAction ) ;
    public final void rule__Model__ActionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5068:1: ( ( ruleApplicationAction ) )
            // InternalBromium.g:5069:2: ( ruleApplicationAction )
            {
            // InternalBromium.g:5069:2: ( ruleApplicationAction )
            // InternalBromium.g:5070:3: ruleApplicationAction
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
    // InternalBromium.g:5079:1: rule__ApplicationAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5083:1: ( ( RULE_ID ) )
            // InternalBromium.g:5084:2: ( RULE_ID )
            {
            // InternalBromium.g:5084:2: ( RULE_ID )
            // InternalBromium.g:5085:3: RULE_ID
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
    // InternalBromium.g:5094:1: rule__ApplicationAction__SyntaxDefinitionsAssignment_3 : ( ruleSyntaxDefinition ) ;
    public final void rule__ApplicationAction__SyntaxDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5098:1: ( ( ruleSyntaxDefinition ) )
            // InternalBromium.g:5099:2: ( ruleSyntaxDefinition )
            {
            // InternalBromium.g:5099:2: ( ruleSyntaxDefinition )
            // InternalBromium.g:5100:3: ruleSyntaxDefinition
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
    // InternalBromium.g:5109:1: rule__ApplicationAction__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__ApplicationAction__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5113:1: ( ( rulePrecondition ) )
            // InternalBromium.g:5114:2: ( rulePrecondition )
            {
            // InternalBromium.g:5114:2: ( rulePrecondition )
            // InternalBromium.g:5115:3: rulePrecondition
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


    // $ANTLR start "rule__ApplicationAction__ActionContextAssignment_5"
    // InternalBromium.g:5124:1: rule__ApplicationAction__ActionContextAssignment_5 : ( ruleActionContext ) ;
    public final void rule__ApplicationAction__ActionContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5128:1: ( ( ruleActionContext ) )
            // InternalBromium.g:5129:2: ( ruleActionContext )
            {
            // InternalBromium.g:5129:2: ( ruleActionContext )
            // InternalBromium.g:5130:3: ruleActionContext
            {
             before(grammarAccess.getApplicationActionAccess().getActionContextActionContextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleActionContext();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getActionContextActionContextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__ActionContextAssignment_5"


    // $ANTLR start "rule__ApplicationAction__WebDriverActionAssignment_6"
    // InternalBromium.g:5139:1: rule__ApplicationAction__WebDriverActionAssignment_6 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__WebDriverActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5143:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:5144:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:5144:2: ( ruleWebDriverAction )
            // InternalBromium.g:5145:3: ruleWebDriverAction
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverAction();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__WebDriverActionAssignment_6"


    // $ANTLR start "rule__ApplicationAction__ExpectHttpRequestAssignment_7"
    // InternalBromium.g:5154:1: rule__ApplicationAction__ExpectHttpRequestAssignment_7 : ( ruleExpectHttpRequest ) ;
    public final void rule__ApplicationAction__ExpectHttpRequestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5158:1: ( ( ruleExpectHttpRequest ) )
            // InternalBromium.g:5159:2: ( ruleExpectHttpRequest )
            {
            // InternalBromium.g:5159:2: ( ruleExpectHttpRequest )
            // InternalBromium.g:5160:3: ruleExpectHttpRequest
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestExpectHttpRequestParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExpectHttpRequest();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getExpectHttpRequestExpectHttpRequestParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__ExpectHttpRequestAssignment_7"


    // $ANTLR start "rule__ApplicationAction__PostconditionAssignment_8"
    // InternalBromium.g:5169:1: rule__ApplicationAction__PostconditionAssignment_8 : ( rulePostcondition ) ;
    public final void rule__ApplicationAction__PostconditionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5173:1: ( ( rulePostcondition ) )
            // InternalBromium.g:5174:2: ( rulePostcondition )
            {
            // InternalBromium.g:5174:2: ( rulePostcondition )
            // InternalBromium.g:5175:3: rulePostcondition
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionPostconditionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getPostconditionPostconditionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__PostconditionAssignment_8"


    // $ANTLR start "rule__TableActionContext__TableLocatorAssignment_2"
    // InternalBromium.g:5184:1: rule__TableActionContext__TableLocatorAssignment_2 : ( ruleLocator ) ;
    public final void rule__TableActionContext__TableLocatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5188:1: ( ( ruleLocator ) )
            // InternalBromium.g:5189:2: ( ruleLocator )
            {
            // InternalBromium.g:5189:2: ( ruleLocator )
            // InternalBromium.g:5190:3: ruleLocator
            {
             before(grammarAccess.getTableActionContextAccess().getTableLocatorLocatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocator();

            state._fsp--;

             after(grammarAccess.getTableActionContextAccess().getTableLocatorLocatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__TableLocatorAssignment_2"


    // $ANTLR start "rule__TableActionContext__RowsLocatorAssignment_5"
    // InternalBromium.g:5199:1: rule__TableActionContext__RowsLocatorAssignment_5 : ( ruleLocator ) ;
    public final void rule__TableActionContext__RowsLocatorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5203:1: ( ( ruleLocator ) )
            // InternalBromium.g:5204:2: ( ruleLocator )
            {
            // InternalBromium.g:5204:2: ( ruleLocator )
            // InternalBromium.g:5205:3: ruleLocator
            {
             before(grammarAccess.getTableActionContextAccess().getRowsLocatorLocatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLocator();

            state._fsp--;

             after(grammarAccess.getTableActionContextAccess().getRowsLocatorLocatorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__RowsLocatorAssignment_5"


    // $ANTLR start "rule__TableActionContext__RowSelectorAssignment_6"
    // InternalBromium.g:5214:1: rule__TableActionContext__RowSelectorAssignment_6 : ( ruleRowSelector ) ;
    public final void rule__TableActionContext__RowSelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5218:1: ( ( ruleRowSelector ) )
            // InternalBromium.g:5219:2: ( ruleRowSelector )
            {
            // InternalBromium.g:5219:2: ( ruleRowSelector )
            // InternalBromium.g:5220:3: ruleRowSelector
            {
             before(grammarAccess.getTableActionContextAccess().getRowSelectorRowSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRowSelector();

            state._fsp--;

             after(grammarAccess.getTableActionContextAccess().getRowSelectorRowSelectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableActionContext__RowSelectorAssignment_6"


    // $ANTLR start "rule__RowLocator__RowLocatorAssignment_2"
    // InternalBromium.g:5229:1: rule__RowLocator__RowLocatorAssignment_2 : ( ruleLocator ) ;
    public final void rule__RowLocator__RowLocatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5233:1: ( ( ruleLocator ) )
            // InternalBromium.g:5234:2: ( ruleLocator )
            {
            // InternalBromium.g:5234:2: ( ruleLocator )
            // InternalBromium.g:5235:3: ruleLocator
            {
             before(grammarAccess.getRowLocatorAccess().getRowLocatorLocatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocator();

            state._fsp--;

             after(grammarAccess.getRowLocatorAccess().getRowLocatorLocatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowLocator__RowLocatorAssignment_2"


    // $ANTLR start "rule__RowIndex__IndexAssignment_2"
    // InternalBromium.g:5244:1: rule__RowIndex__IndexAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__RowIndex__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5248:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5249:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5249:2: ( ruleParameterValue )
            // InternalBromium.g:5250:3: ruleParameterValue
            {
             before(grammarAccess.getRowIndexAccess().getIndexParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getRowIndexAccess().getIndexParameterValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowIndex__IndexAssignment_2"


    // $ANTLR start "rule__ClassByText__KlassAssignment_1"
    // InternalBromium.g:5259:1: rule__ClassByText__KlassAssignment_1 : ( ruleParameterValue ) ;
    public final void rule__ClassByText__KlassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5263:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5264:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5264:2: ( ruleParameterValue )
            // InternalBromium.g:5265:3: ruleParameterValue
            {
             before(grammarAccess.getClassByTextAccess().getKlassParameterValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getClassByTextAccess().getKlassParameterValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__KlassAssignment_1"


    // $ANTLR start "rule__ClassByText__TextAssignment_4"
    // InternalBromium.g:5274:1: rule__ClassByText__TextAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ClassByText__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5278:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5279:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5279:2: ( ruleParameterValue )
            // InternalBromium.g:5280:3: ruleParameterValue
            {
             before(grammarAccess.getClassByTextAccess().getTextParameterValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getClassByTextAccess().getTextParameterValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassByText__TextAssignment_4"


    // $ANTLR start "rule__CssSelectorByText__SelectorAssignment_2"
    // InternalBromium.g:5289:1: rule__CssSelectorByText__SelectorAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__CssSelectorByText__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5293:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5294:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5294:2: ( ruleParameterValue )
            // InternalBromium.g:5295:3: ruleParameterValue
            {
             before(grammarAccess.getCssSelectorByTextAccess().getSelectorParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getCssSelectorByTextAccess().getSelectorParameterValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__SelectorAssignment_2"


    // $ANTLR start "rule__CssSelectorByText__TextAssignment_5"
    // InternalBromium.g:5304:1: rule__CssSelectorByText__TextAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__CssSelectorByText__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5308:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5309:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5309:2: ( ruleParameterValue )
            // InternalBromium.g:5310:3: ruleParameterValue
            {
             before(grammarAccess.getCssSelectorByTextAccess().getTextParameterValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getCssSelectorByTextAccess().getTextParameterValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelectorByText__TextAssignment_5"


    // $ANTLR start "rule__CssSelector__SelectorAssignment_2"
    // InternalBromium.g:5319:1: rule__CssSelector__SelectorAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__CssSelector__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5323:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5324:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5324:2: ( ruleParameterValue )
            // InternalBromium.g:5325:3: ruleParameterValue
            {
             before(grammarAccess.getCssSelectorAccess().getSelectorParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getCssSelectorAccess().getSelectorParameterValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssSelector__SelectorAssignment_2"


    // $ANTLR start "rule__SyntaxDefinition__ContentAssignment_1"
    // InternalBromium.g:5334:1: rule__SyntaxDefinition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SyntaxDefinition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5338:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5339:2: ( RULE_STRING )
            {
            // InternalBromium.g:5339:2: ( RULE_STRING )
            // InternalBromium.g:5340:3: RULE_STRING
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
    // InternalBromium.g:5349:1: rule__SyntaxDefinition__ParameterAssignment_2 : ( ruleExposedParameter ) ;
    public final void rule__SyntaxDefinition__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5353:1: ( ( ruleExposedParameter ) )
            // InternalBromium.g:5354:2: ( ruleExposedParameter )
            {
            // InternalBromium.g:5354:2: ( ruleExposedParameter )
            // InternalBromium.g:5355:3: ruleExposedParameter
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
    // InternalBromium.g:5364:1: rule__Precondition__ActionAssignment_1 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Precondition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5368:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:5369:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:5369:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:5370:3: ruleWebDriverActionCondition
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
    // InternalBromium.g:5379:1: rule__Postcondition__ActionAssignment_3 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Postcondition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5383:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:5384:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:5384:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:5385:3: ruleWebDriverActionCondition
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
    // InternalBromium.g:5394:1: rule__ExpectHttpRequest__NotAssignment_1_1 : ( ( 'not' ) ) ;
    public final void rule__ExpectHttpRequest__NotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5398:1: ( ( ( 'not' ) ) )
            // InternalBromium.g:5399:2: ( ( 'not' ) )
            {
            // InternalBromium.g:5399:2: ( ( 'not' ) )
            // InternalBromium.g:5400:3: ( 'not' )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            // InternalBromium.g:5401:3: ( 'not' )
            // InternalBromium.g:5402:4: 'not'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBromium.g:5413:1: rule__ElementByCssToBePresent__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__ElementByCssToBePresent__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5417:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5418:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5418:2: ( ( 'selector' ) )
            // InternalBromium.g:5419:3: ( 'selector' )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:5420:3: ( 'selector' )
            // InternalBromium.g:5421:4: 'selector'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:5432:1: rule__ElementByCssToBePresent__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ElementByCssToBePresent__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5436:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5437:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5437:2: ( ruleParameterValue )
            // InternalBromium.g:5438:3: ruleParameterValue
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
    // InternalBromium.g:5447:1: rule__ClickCssSelector__ParameterNamesAssignment_5 : ( ( 'selector' ) ) ;
    public final void rule__ClickCssSelector__ParameterNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5451:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5452:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5452:2: ( ( 'selector' ) )
            // InternalBromium.g:5453:3: ( 'selector' )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            // InternalBromium.g:5454:3: ( 'selector' )
            // InternalBromium.g:5455:4: 'selector'
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:5466:1: rule__ClickCssSelector__ParameterValuesAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__ClickCssSelector__ParameterValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5470:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5471:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5471:2: ( ruleParameterValue )
            // InternalBromium.g:5472:3: ruleParameterValue
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
    // InternalBromium.g:5481:1: rule__PageLoad__ParameterNamesAssignment_1 : ( ( 'page' ) ) ;
    public final void rule__PageLoad__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5485:1: ( ( ( 'page' ) ) )
            // InternalBromium.g:5486:2: ( ( 'page' ) )
            {
            // InternalBromium.g:5486:2: ( ( 'page' ) )
            // InternalBromium.g:5487:3: ( 'page' )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            // InternalBromium.g:5488:3: ( 'page' )
            // InternalBromium.g:5489:4: 'page'
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBromium.g:5500:1: rule__PageLoad__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__PageLoad__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5504:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5505:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5505:2: ( ruleParameterValue )
            // InternalBromium.g:5506:3: ruleParameterValue
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
    // InternalBromium.g:5515:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 : ( ( 'text' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5519:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5520:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5520:2: ( ( 'text' ) )
            // InternalBromium.g:5521:3: ( 'text' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            // InternalBromium.g:5522:3: ( 'text' )
            // InternalBromium.g:5523:4: 'text'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBromium.g:5534:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5538:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5539:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5539:2: ( ruleParameterValue )
            // InternalBromium.g:5540:3: ruleParameterValue
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
    // InternalBromium.g:5549:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 : ( ( 'selector' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5553:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5554:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5554:2: ( ( 'selector' ) )
            // InternalBromium.g:5555:3: ( 'selector' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            // InternalBromium.g:5556:3: ( 'selector' )
            // InternalBromium.g:5557:4: 'selector'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:5568:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5572:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5573:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5573:2: ( ruleParameterValue )
            // InternalBromium.g:5574:3: ruleParameterValue
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
    // InternalBromium.g:5583:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5587:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5588:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5588:2: ( ( 'selector' ) )
            // InternalBromium.g:5589:3: ( 'selector' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:5590:3: ( 'selector' )
            // InternalBromium.g:5591:4: 'selector'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:5602:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5606:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5607:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5607:2: ( ruleParameterValue )
            // InternalBromium.g:5608:3: ruleParameterValue
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
    // InternalBromium.g:5617:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 : ( ( 'text' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5621:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5622:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5622:2: ( ( 'text' ) )
            // InternalBromium.g:5623:3: ( 'text' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            // InternalBromium.g:5624:3: ( 'text' )
            // InternalBromium.g:5625:4: 'text'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBromium.g:5636:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5640:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5641:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5641:2: ( ruleParameterValue )
            // InternalBromium.g:5642:3: ruleParameterValue
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
    // InternalBromium.g:5651:1: rule__ClickClassByText__ParameterNamesAssignment_4 : ( ( 'class' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5655:1: ( ( ( 'class' ) ) )
            // InternalBromium.g:5656:2: ( ( 'class' ) )
            {
            // InternalBromium.g:5656:2: ( ( 'class' ) )
            // InternalBromium.g:5657:3: ( 'class' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            // InternalBromium.g:5658:3: ( 'class' )
            // InternalBromium.g:5659:4: 'class'
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBromium.g:5670:1: rule__ClickClassByText__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5674:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5675:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5675:2: ( ruleParameterValue )
            // InternalBromium.g:5676:3: ruleParameterValue
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
    // InternalBromium.g:5685:1: rule__ClickClassByText__ParameterNamesAssignment_7 : ( ( 'text' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5689:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5690:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5690:2: ( ( 'text' ) )
            // InternalBromium.g:5691:3: ( 'text' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            // InternalBromium.g:5692:3: ( 'text' )
            // InternalBromium.g:5693:4: 'text'
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBromium.g:5704:1: rule__ClickClassByText__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5708:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5709:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5709:2: ( ruleParameterValue )
            // InternalBromium.g:5710:3: ruleParameterValue
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
    // InternalBromium.g:5719:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 : ( ( 'variable' ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5723:1: ( ( ( 'variable' ) ) )
            // InternalBromium.g:5724:2: ( ( 'variable' ) )
            {
            // InternalBromium.g:5724:2: ( ( 'variable' ) )
            // InternalBromium.g:5725:3: ( 'variable' )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 
            // InternalBromium.g:5726:3: ( 'variable' )
            // InternalBromium.g:5727:4: 'variable'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBromium.g:5738:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5742:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5743:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5743:2: ( ruleParameterValue )
            // InternalBromium.g:5744:3: ruleParameterValue
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
    // InternalBromium.g:5753:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 : ( ( 'selector' ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5757:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5758:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5758:2: ( ( 'selector' ) )
            // InternalBromium.g:5759:3: ( 'selector' )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 
            // InternalBromium.g:5760:3: ( 'selector' )
            // InternalBromium.g:5761:4: 'selector'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:5772:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 : ( ruleParameterValue ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5776:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5777:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5777:2: ( ruleParameterValue )
            // InternalBromium.g:5778:3: ruleParameterValue
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
    // InternalBromium.g:5787:1: rule__ClickDataId__ParameterNamesAssignment_4 : ( ( 'dataId' ) ) ;
    public final void rule__ClickDataId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5791:1: ( ( ( 'dataId' ) ) )
            // InternalBromium.g:5792:2: ( ( 'dataId' ) )
            {
            // InternalBromium.g:5792:2: ( ( 'dataId' ) )
            // InternalBromium.g:5793:3: ( 'dataId' )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            // InternalBromium.g:5794:3: ( 'dataId' )
            // InternalBromium.g:5795:4: 'dataId'
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBromium.g:5806:1: rule__ClickDataId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickDataId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5810:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5811:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5811:2: ( ruleParameterValue )
            // InternalBromium.g:5812:3: ruleParameterValue
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
    // InternalBromium.g:5821:1: rule__ConfirmAlert__ParameterNamesAssignment_1 : ( ( 'confirm' ) ) ;
    public final void rule__ConfirmAlert__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5825:1: ( ( ( 'confirm' ) ) )
            // InternalBromium.g:5826:2: ( ( 'confirm' ) )
            {
            // InternalBromium.g:5826:2: ( ( 'confirm' ) )
            // InternalBromium.g:5827:3: ( 'confirm' )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            // InternalBromium.g:5828:3: ( 'confirm' )
            // InternalBromium.g:5829:4: 'confirm'
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBromium.g:5840:1: rule__ConfirmAlert__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ConfirmAlert__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5844:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5845:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5845:2: ( ruleParameterValue )
            // InternalBromium.g:5846:3: ruleParameterValue
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
    // InternalBromium.g:5855:1: rule__ClickId__ParameterNamesAssignment_4 : ( ( 'id' ) ) ;
    public final void rule__ClickId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5859:1: ( ( ( 'id' ) ) )
            // InternalBromium.g:5860:2: ( ( 'id' ) )
            {
            // InternalBromium.g:5860:2: ( ( 'id' ) )
            // InternalBromium.g:5861:3: ( 'id' )
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesIdKeyword_4_0()); 
            // InternalBromium.g:5862:3: ( 'id' )
            // InternalBromium.g:5863:4: 'id'
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
    // InternalBromium.g:5874:1: rule__ClickId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5878:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5879:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5879:2: ( ruleParameterValue )
            // InternalBromium.g:5880:3: ruleParameterValue
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


    // $ANTLR start "rule__ClickName__ParameterNamesAssignment_4"
    // InternalBromium.g:5889:1: rule__ClickName__ParameterNamesAssignment_4 : ( ( 'name' ) ) ;
    public final void rule__ClickName__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5893:1: ( ( ( 'name' ) ) )
            // InternalBromium.g:5894:2: ( ( 'name' ) )
            {
            // InternalBromium.g:5894:2: ( ( 'name' ) )
            // InternalBromium.g:5895:3: ( 'name' )
            {
             before(grammarAccess.getClickNameAccess().getParameterNamesNameKeyword_4_0()); 
            // InternalBromium.g:5896:3: ( 'name' )
            // InternalBromium.g:5897:4: 'name'
            {
             before(grammarAccess.getClickNameAccess().getParameterNamesNameKeyword_4_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClickNameAccess().getParameterNamesNameKeyword_4_0()); 

            }

             after(grammarAccess.getClickNameAccess().getParameterNamesNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__ParameterNamesAssignment_4"


    // $ANTLR start "rule__ClickName__ParameterValuesAssignment_5"
    // InternalBromium.g:5908:1: rule__ClickName__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickName__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5912:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5913:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5913:2: ( ruleParameterValue )
            // InternalBromium.g:5914:3: ruleParameterValue
            {
             before(grammarAccess.getClickNameAccess().getParameterValuesParameterValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getClickNameAccess().getParameterValuesParameterValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickName__ParameterValuesAssignment_5"


    // $ANTLR start "rule__SelectValue__ParameterNamesAssignment_1"
    // InternalBromium.g:5923:1: rule__SelectValue__ParameterNamesAssignment_1 : ( ( 'value' ) ) ;
    public final void rule__SelectValue__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5927:1: ( ( ( 'value' ) ) )
            // InternalBromium.g:5928:2: ( ( 'value' ) )
            {
            // InternalBromium.g:5928:2: ( ( 'value' ) )
            // InternalBromium.g:5929:3: ( 'value' )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesValueKeyword_1_0()); 
            // InternalBromium.g:5930:3: ( 'value' )
            // InternalBromium.g:5931:4: 'value'
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesValueKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSelectValueAccess().getParameterNamesValueKeyword_1_0()); 

            }

             after(grammarAccess.getSelectValueAccess().getParameterNamesValueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__ParameterNamesAssignment_1"


    // $ANTLR start "rule__SelectValue__ParameterValuesAssignment_2"
    // InternalBromium.g:5942:1: rule__SelectValue__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__SelectValue__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5946:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5947:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5947:2: ( ruleParameterValue )
            // InternalBromium.g:5948:3: ruleParameterValue
            {
             before(grammarAccess.getSelectValueAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getSelectValueAccess().getParameterValuesParameterValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__ParameterValuesAssignment_2"


    // $ANTLR start "rule__SelectValue__ParameterNamesAssignment_7"
    // InternalBromium.g:5957:1: rule__SelectValue__ParameterNamesAssignment_7 : ( ( 'selector' ) ) ;
    public final void rule__SelectValue__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5961:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5962:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5962:2: ( ( 'selector' ) )
            // InternalBromium.g:5963:3: ( 'selector' )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesSelectorKeyword_7_0()); 
            // InternalBromium.g:5964:3: ( 'selector' )
            // InternalBromium.g:5965:4: 'selector'
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesSelectorKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectValueAccess().getParameterNamesSelectorKeyword_7_0()); 

            }

             after(grammarAccess.getSelectValueAccess().getParameterNamesSelectorKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__ParameterNamesAssignment_7"


    // $ANTLR start "rule__SelectValue__ParameterValuesAssignment_8"
    // InternalBromium.g:5976:1: rule__SelectValue__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__SelectValue__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5980:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5981:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5981:2: ( ruleParameterValue )
            // InternalBromium.g:5982:3: ruleParameterValue
            {
             before(grammarAccess.getSelectValueAccess().getParameterValuesParameterValueParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getSelectValueAccess().getParameterValuesParameterValueParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectValue__ParameterValuesAssignment_8"


    // $ANTLR start "rule__ParameterValue__ContentAssignment_0"
    // InternalBromium.g:5991:1: rule__ParameterValue__ContentAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ParameterValue__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5995:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5996:2: ( RULE_STRING )
            {
            // InternalBromium.g:5996:2: ( RULE_STRING )
            // InternalBromium.g:5997:3: RULE_STRING
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
    // InternalBromium.g:6006:1: rule__ParameterValue__ExposedParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterValue__ExposedParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6010:1: ( ( ( RULE_ID ) ) )
            // InternalBromium.g:6011:2: ( ( RULE_ID ) )
            {
            // InternalBromium.g:6011:2: ( ( RULE_ID ) )
            // InternalBromium.g:6012:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterCrossReference_1_0()); 
            // InternalBromium.g:6013:3: ( RULE_ID )
            // InternalBromium.g:6014:4: RULE_ID
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


    // $ANTLR start "rule__ParameterValue__IndexAssignment_2"
    // InternalBromium.g:6025:1: rule__ParameterValue__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__ParameterValue__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6029:1: ( ( RULE_INT ) )
            // InternalBromium.g:6030:2: ( RULE_INT )
            {
            // InternalBromium.g:6030:2: ( RULE_INT )
            // InternalBromium.g:6031:3: RULE_INT
            {
             before(grammarAccess.getParameterValueAccess().getIndexINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParameterValueAccess().getIndexINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__IndexAssignment_2"


    // $ANTLR start "rule__ExposedParameter__NameAssignment"
    // InternalBromium.g:6040:1: rule__ExposedParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExposedParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6044:1: ( ( RULE_ID ) )
            // InternalBromium.g:6045:2: ( RULE_ID )
            {
            // InternalBromium.g:6045:2: ( RULE_ID )
            // InternalBromium.g:6046:3: RULE_ID
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\5\uffff\3\11\2\uffff";
    static final String dfa_3s = "\1\23\1\34\2\uffff\1\4\3\25\2\uffff";
    static final String dfa_4s = "\1\33\1\34\2\uffff\1\6\3\62\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\4\4\uffff\1\3\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\4\uffff\1\2\2\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\5\1\6\1\7",
            "\2\11\2\uffff\1\10\16\uffff\1\11\1\uffff\2\11\2\uffff\1\11\3\uffff\1\11",
            "\2\11\2\uffff\1\10\16\uffff\1\11\1\uffff\2\11\2\uffff\1\11\3\uffff\1\11",
            "\2\11\2\uffff\1\10\16\uffff\1\11\1\uffff\2\11\2\uffff\1\11\3\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "873:1: rule__Locator__Alternatives : ( ( ruleCssSelector ) | ( ruleClassByText ) | ( ruleCssSelectorByText ) | ( ruleActionContext ) );";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\45\1\24\1\uffff\1\33\1\34\1\4\3\46\2\uffff";
    static final String dfa_10s = "\1\57\1\24\1\uffff\1\33\1\34\1\6\3\55\2\uffff";
    static final String dfa_11s = "\2\uffff\1\3\6\uffff\1\2\1\1";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\11\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\1\7\1\10",
            "\1\12\6\uffff\1\11",
            "\1\12\6\uffff\1\11",
            "\1\12\6\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "906:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );";
        }
    }
    static final String dfa_14s = "\16\uffff";
    static final String dfa_15s = "\1\50\1\51\4\uffff\1\45\1\24\1\13\5\uffff";
    static final String dfa_16s = "\1\62\1\51\4\uffff\1\45\1\24\1\66\5\uffff";
    static final String dfa_17s = "\2\uffff\1\3\1\4\1\6\1\11\3\uffff\1\2\1\1\1\7\1\10\1\5";
    static final String dfa_18s = "\16\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\1\uffff\1\2\1\3\2\uffff\1\4\3\uffff\1\5",
            "\1\6",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\14\5\uffff\1\13\6\uffff\1\11\2\uffff\1\12\32\uffff\1\15",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "933:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) );";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00044D0020080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000009080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000802000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});

}