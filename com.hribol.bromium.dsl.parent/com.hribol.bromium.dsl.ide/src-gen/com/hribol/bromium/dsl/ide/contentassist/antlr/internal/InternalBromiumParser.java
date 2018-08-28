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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'actions'", "'{'", "'}'", "'from'", "'id'", "'syntax'", "'within'", "'element'", "'with'", "'table'", "'rows'", "'row'", "'number'", "'class'", "'and'", "'text'", "'css'", "'selector'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'expect'", "'http'", "'request'", "'is'", "'present'", "'click'", "'on'", "'load'", "'type'", "'in'", "'has'", "'set'", "'to'", "'the'", "'of'", "'select'", "'not'", "'page'", "'variable'", "'dataId'", "'confirm'", "'value'"
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
    public static final int T__57=57;
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
    // InternalBromium.g:112:1: ruleActionContext : ( ( rule__ActionContext__Alternatives ) ) ;
    public final void ruleActionContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:116:2: ( ( ( rule__ActionContext__Alternatives ) ) )
            // InternalBromium.g:117:2: ( ( rule__ActionContext__Alternatives ) )
            {
            // InternalBromium.g:117:2: ( ( rule__ActionContext__Alternatives ) )
            // InternalBromium.g:118:3: ( rule__ActionContext__Alternatives )
            {
             before(grammarAccess.getActionContextAccess().getAlternatives()); 
            // InternalBromium.g:119:3: ( rule__ActionContext__Alternatives )
            // InternalBromium.g:119:4: rule__ActionContext__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionContext__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionContextAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleWithinContext"
    // InternalBromium.g:128:1: entryRuleWithinContext : ruleWithinContext EOF ;
    public final void entryRuleWithinContext() throws RecognitionException {
        try {
            // InternalBromium.g:129:1: ( ruleWithinContext EOF )
            // InternalBromium.g:130:1: ruleWithinContext EOF
            {
             before(grammarAccess.getWithinContextRule()); 
            pushFollow(FOLLOW_1);
            ruleWithinContext();

            state._fsp--;

             after(grammarAccess.getWithinContextRule()); 
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
    // $ANTLR end "entryRuleWithinContext"


    // $ANTLR start "ruleWithinContext"
    // InternalBromium.g:137:1: ruleWithinContext : ( ( rule__WithinContext__Group__0 ) ) ;
    public final void ruleWithinContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:141:2: ( ( ( rule__WithinContext__Group__0 ) ) )
            // InternalBromium.g:142:2: ( ( rule__WithinContext__Group__0 ) )
            {
            // InternalBromium.g:142:2: ( ( rule__WithinContext__Group__0 ) )
            // InternalBromium.g:143:3: ( rule__WithinContext__Group__0 )
            {
             before(grammarAccess.getWithinContextAccess().getGroup()); 
            // InternalBromium.g:144:3: ( rule__WithinContext__Group__0 )
            // InternalBromium.g:144:4: rule__WithinContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WithinContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWithinContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWithinContext"


    // $ANTLR start "entryRuleTableActionContext"
    // InternalBromium.g:153:1: entryRuleTableActionContext : ruleTableActionContext EOF ;
    public final void entryRuleTableActionContext() throws RecognitionException {
        try {
            // InternalBromium.g:154:1: ( ruleTableActionContext EOF )
            // InternalBromium.g:155:1: ruleTableActionContext EOF
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
    // InternalBromium.g:162:1: ruleTableActionContext : ( ( rule__TableActionContext__Group__0 ) ) ;
    public final void ruleTableActionContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:166:2: ( ( ( rule__TableActionContext__Group__0 ) ) )
            // InternalBromium.g:167:2: ( ( rule__TableActionContext__Group__0 ) )
            {
            // InternalBromium.g:167:2: ( ( rule__TableActionContext__Group__0 ) )
            // InternalBromium.g:168:3: ( rule__TableActionContext__Group__0 )
            {
             before(grammarAccess.getTableActionContextAccess().getGroup()); 
            // InternalBromium.g:169:3: ( rule__TableActionContext__Group__0 )
            // InternalBromium.g:169:4: rule__TableActionContext__Group__0
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
    // InternalBromium.g:178:1: entryRuleRowSelector : ruleRowSelector EOF ;
    public final void entryRuleRowSelector() throws RecognitionException {
        try {
            // InternalBromium.g:179:1: ( ruleRowSelector EOF )
            // InternalBromium.g:180:1: ruleRowSelector EOF
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
    // InternalBromium.g:187:1: ruleRowSelector : ( ( rule__RowSelector__Alternatives ) ) ;
    public final void ruleRowSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:191:2: ( ( ( rule__RowSelector__Alternatives ) ) )
            // InternalBromium.g:192:2: ( ( rule__RowSelector__Alternatives ) )
            {
            // InternalBromium.g:192:2: ( ( rule__RowSelector__Alternatives ) )
            // InternalBromium.g:193:3: ( rule__RowSelector__Alternatives )
            {
             before(grammarAccess.getRowSelectorAccess().getAlternatives()); 
            // InternalBromium.g:194:3: ( rule__RowSelector__Alternatives )
            // InternalBromium.g:194:4: rule__RowSelector__Alternatives
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
    // InternalBromium.g:203:1: entryRuleRowLocator : ruleRowLocator EOF ;
    public final void entryRuleRowLocator() throws RecognitionException {
        try {
            // InternalBromium.g:204:1: ( ruleRowLocator EOF )
            // InternalBromium.g:205:1: ruleRowLocator EOF
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
    // InternalBromium.g:212:1: ruleRowLocator : ( ( rule__RowLocator__Group__0 ) ) ;
    public final void ruleRowLocator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:216:2: ( ( ( rule__RowLocator__Group__0 ) ) )
            // InternalBromium.g:217:2: ( ( rule__RowLocator__Group__0 ) )
            {
            // InternalBromium.g:217:2: ( ( rule__RowLocator__Group__0 ) )
            // InternalBromium.g:218:3: ( rule__RowLocator__Group__0 )
            {
             before(grammarAccess.getRowLocatorAccess().getGroup()); 
            // InternalBromium.g:219:3: ( rule__RowLocator__Group__0 )
            // InternalBromium.g:219:4: rule__RowLocator__Group__0
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
    // InternalBromium.g:228:1: entryRuleRowIndex : ruleRowIndex EOF ;
    public final void entryRuleRowIndex() throws RecognitionException {
        try {
            // InternalBromium.g:229:1: ( ruleRowIndex EOF )
            // InternalBromium.g:230:1: ruleRowIndex EOF
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
    // InternalBromium.g:237:1: ruleRowIndex : ( ( rule__RowIndex__Group__0 ) ) ;
    public final void ruleRowIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:241:2: ( ( ( rule__RowIndex__Group__0 ) ) )
            // InternalBromium.g:242:2: ( ( rule__RowIndex__Group__0 ) )
            {
            // InternalBromium.g:242:2: ( ( rule__RowIndex__Group__0 ) )
            // InternalBromium.g:243:3: ( rule__RowIndex__Group__0 )
            {
             before(grammarAccess.getRowIndexAccess().getGroup()); 
            // InternalBromium.g:244:3: ( rule__RowIndex__Group__0 )
            // InternalBromium.g:244:4: rule__RowIndex__Group__0
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
    // InternalBromium.g:253:1: entryRuleLocator : ruleLocator EOF ;
    public final void entryRuleLocator() throws RecognitionException {
        try {
            // InternalBromium.g:254:1: ( ruleLocator EOF )
            // InternalBromium.g:255:1: ruleLocator EOF
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
    // InternalBromium.g:262:1: ruleLocator : ( ( rule__Locator__Alternatives ) ) ;
    public final void ruleLocator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:266:2: ( ( ( rule__Locator__Alternatives ) ) )
            // InternalBromium.g:267:2: ( ( rule__Locator__Alternatives ) )
            {
            // InternalBromium.g:267:2: ( ( rule__Locator__Alternatives ) )
            // InternalBromium.g:268:3: ( rule__Locator__Alternatives )
            {
             before(grammarAccess.getLocatorAccess().getAlternatives()); 
            // InternalBromium.g:269:3: ( rule__Locator__Alternatives )
            // InternalBromium.g:269:4: rule__Locator__Alternatives
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
    // InternalBromium.g:278:1: entryRuleClassByText : ruleClassByText EOF ;
    public final void entryRuleClassByText() throws RecognitionException {
        try {
            // InternalBromium.g:279:1: ( ruleClassByText EOF )
            // InternalBromium.g:280:1: ruleClassByText EOF
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
    // InternalBromium.g:287:1: ruleClassByText : ( ( rule__ClassByText__Group__0 ) ) ;
    public final void ruleClassByText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:291:2: ( ( ( rule__ClassByText__Group__0 ) ) )
            // InternalBromium.g:292:2: ( ( rule__ClassByText__Group__0 ) )
            {
            // InternalBromium.g:292:2: ( ( rule__ClassByText__Group__0 ) )
            // InternalBromium.g:293:3: ( rule__ClassByText__Group__0 )
            {
             before(grammarAccess.getClassByTextAccess().getGroup()); 
            // InternalBromium.g:294:3: ( rule__ClassByText__Group__0 )
            // InternalBromium.g:294:4: rule__ClassByText__Group__0
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
    // InternalBromium.g:303:1: entryRuleCssSelectorByText : ruleCssSelectorByText EOF ;
    public final void entryRuleCssSelectorByText() throws RecognitionException {
        try {
            // InternalBromium.g:304:1: ( ruleCssSelectorByText EOF )
            // InternalBromium.g:305:1: ruleCssSelectorByText EOF
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
    // InternalBromium.g:312:1: ruleCssSelectorByText : ( ( rule__CssSelectorByText__Group__0 ) ) ;
    public final void ruleCssSelectorByText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:316:2: ( ( ( rule__CssSelectorByText__Group__0 ) ) )
            // InternalBromium.g:317:2: ( ( rule__CssSelectorByText__Group__0 ) )
            {
            // InternalBromium.g:317:2: ( ( rule__CssSelectorByText__Group__0 ) )
            // InternalBromium.g:318:3: ( rule__CssSelectorByText__Group__0 )
            {
             before(grammarAccess.getCssSelectorByTextAccess().getGroup()); 
            // InternalBromium.g:319:3: ( rule__CssSelectorByText__Group__0 )
            // InternalBromium.g:319:4: rule__CssSelectorByText__Group__0
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
    // InternalBromium.g:328:1: entryRuleCssSelector : ruleCssSelector EOF ;
    public final void entryRuleCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:329:1: ( ruleCssSelector EOF )
            // InternalBromium.g:330:1: ruleCssSelector EOF
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
    // InternalBromium.g:337:1: ruleCssSelector : ( ( rule__CssSelector__Group__0 ) ) ;
    public final void ruleCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:341:2: ( ( ( rule__CssSelector__Group__0 ) ) )
            // InternalBromium.g:342:2: ( ( rule__CssSelector__Group__0 ) )
            {
            // InternalBromium.g:342:2: ( ( rule__CssSelector__Group__0 ) )
            // InternalBromium.g:343:3: ( rule__CssSelector__Group__0 )
            {
             before(grammarAccess.getCssSelectorAccess().getGroup()); 
            // InternalBromium.g:344:3: ( rule__CssSelector__Group__0 )
            // InternalBromium.g:344:4: rule__CssSelector__Group__0
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
    // InternalBromium.g:353:1: entryRuleSyntaxDefinition : ruleSyntaxDefinition EOF ;
    public final void entryRuleSyntaxDefinition() throws RecognitionException {
        try {
            // InternalBromium.g:354:1: ( ruleSyntaxDefinition EOF )
            // InternalBromium.g:355:1: ruleSyntaxDefinition EOF
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
    // InternalBromium.g:362:1: ruleSyntaxDefinition : ( ( rule__SyntaxDefinition__Group__0 ) ) ;
    public final void ruleSyntaxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:366:2: ( ( ( rule__SyntaxDefinition__Group__0 ) ) )
            // InternalBromium.g:367:2: ( ( rule__SyntaxDefinition__Group__0 ) )
            {
            // InternalBromium.g:367:2: ( ( rule__SyntaxDefinition__Group__0 ) )
            // InternalBromium.g:368:3: ( rule__SyntaxDefinition__Group__0 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getGroup()); 
            // InternalBromium.g:369:3: ( rule__SyntaxDefinition__Group__0 )
            // InternalBromium.g:369:4: rule__SyntaxDefinition__Group__0
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
    // InternalBromium.g:378:1: entryRuleWebDriverActionCondition : ruleWebDriverActionCondition EOF ;
    public final void entryRuleWebDriverActionCondition() throws RecognitionException {
        try {
            // InternalBromium.g:379:1: ( ruleWebDriverActionCondition EOF )
            // InternalBromium.g:380:1: ruleWebDriverActionCondition EOF
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
    // InternalBromium.g:387:1: ruleWebDriverActionCondition : ( ( rule__WebDriverActionCondition__Alternatives ) ) ;
    public final void ruleWebDriverActionCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:391:2: ( ( ( rule__WebDriverActionCondition__Alternatives ) ) )
            // InternalBromium.g:392:2: ( ( rule__WebDriverActionCondition__Alternatives ) )
            {
            // InternalBromium.g:392:2: ( ( rule__WebDriverActionCondition__Alternatives ) )
            // InternalBromium.g:393:3: ( rule__WebDriverActionCondition__Alternatives )
            {
             before(grammarAccess.getWebDriverActionConditionAccess().getAlternatives()); 
            // InternalBromium.g:394:3: ( rule__WebDriverActionCondition__Alternatives )
            // InternalBromium.g:394:4: rule__WebDriverActionCondition__Alternatives
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
    // InternalBromium.g:403:1: entryRuleWebDriverAction : ruleWebDriverAction EOF ;
    public final void entryRuleWebDriverAction() throws RecognitionException {
        try {
            // InternalBromium.g:404:1: ( ruleWebDriverAction EOF )
            // InternalBromium.g:405:1: ruleWebDriverAction EOF
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
    // InternalBromium.g:412:1: ruleWebDriverAction : ( ( rule__WebDriverAction__Alternatives ) ) ;
    public final void ruleWebDriverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:416:2: ( ( ( rule__WebDriverAction__Alternatives ) ) )
            // InternalBromium.g:417:2: ( ( rule__WebDriverAction__Alternatives ) )
            {
            // InternalBromium.g:417:2: ( ( rule__WebDriverAction__Alternatives ) )
            // InternalBromium.g:418:3: ( rule__WebDriverAction__Alternatives )
            {
             before(grammarAccess.getWebDriverActionAccess().getAlternatives()); 
            // InternalBromium.g:419:3: ( rule__WebDriverAction__Alternatives )
            // InternalBromium.g:419:4: rule__WebDriverAction__Alternatives
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
    // InternalBromium.g:428:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalBromium.g:429:1: ( rulePrecondition EOF )
            // InternalBromium.g:430:1: rulePrecondition EOF
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
    // InternalBromium.g:437:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:441:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalBromium.g:442:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalBromium.g:442:2: ( ( rule__Precondition__Group__0 ) )
            // InternalBromium.g:443:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalBromium.g:444:3: ( rule__Precondition__Group__0 )
            // InternalBromium.g:444:4: rule__Precondition__Group__0
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
    // InternalBromium.g:453:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalBromium.g:454:1: ( rulePostcondition EOF )
            // InternalBromium.g:455:1: rulePostcondition EOF
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
    // InternalBromium.g:462:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:466:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalBromium.g:467:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalBromium.g:467:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalBromium.g:468:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalBromium.g:469:3: ( rule__Postcondition__Group__0 )
            // InternalBromium.g:469:4: rule__Postcondition__Group__0
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
    // InternalBromium.g:478:1: entryRuleExpectHttpRequest : ruleExpectHttpRequest EOF ;
    public final void entryRuleExpectHttpRequest() throws RecognitionException {
        try {
            // InternalBromium.g:479:1: ( ruleExpectHttpRequest EOF )
            // InternalBromium.g:480:1: ruleExpectHttpRequest EOF
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
    // InternalBromium.g:487:1: ruleExpectHttpRequest : ( ( rule__ExpectHttpRequest__Group__0 ) ) ;
    public final void ruleExpectHttpRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:491:2: ( ( ( rule__ExpectHttpRequest__Group__0 ) ) )
            // InternalBromium.g:492:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            {
            // InternalBromium.g:492:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            // InternalBromium.g:493:3: ( rule__ExpectHttpRequest__Group__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup()); 
            // InternalBromium.g:494:3: ( rule__ExpectHttpRequest__Group__0 )
            // InternalBromium.g:494:4: rule__ExpectHttpRequest__Group__0
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
    // InternalBromium.g:503:1: entryRuleElementByCssToBePresent : ruleElementByCssToBePresent EOF ;
    public final void entryRuleElementByCssToBePresent() throws RecognitionException {
        try {
            // InternalBromium.g:504:1: ( ruleElementByCssToBePresent EOF )
            // InternalBromium.g:505:1: ruleElementByCssToBePresent EOF
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
    // InternalBromium.g:512:1: ruleElementByCssToBePresent : ( ( rule__ElementByCssToBePresent__Group__0 ) ) ;
    public final void ruleElementByCssToBePresent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:516:2: ( ( ( rule__ElementByCssToBePresent__Group__0 ) ) )
            // InternalBromium.g:517:2: ( ( rule__ElementByCssToBePresent__Group__0 ) )
            {
            // InternalBromium.g:517:2: ( ( rule__ElementByCssToBePresent__Group__0 ) )
            // InternalBromium.g:518:3: ( rule__ElementByCssToBePresent__Group__0 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getGroup()); 
            // InternalBromium.g:519:3: ( rule__ElementByCssToBePresent__Group__0 )
            // InternalBromium.g:519:4: rule__ElementByCssToBePresent__Group__0
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
    // InternalBromium.g:528:1: entryRuleClickCssSelector : ruleClickCssSelector EOF ;
    public final void entryRuleClickCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:529:1: ( ruleClickCssSelector EOF )
            // InternalBromium.g:530:1: ruleClickCssSelector EOF
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
    // InternalBromium.g:537:1: ruleClickCssSelector : ( ( rule__ClickCssSelector__Group__0 ) ) ;
    public final void ruleClickCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:541:2: ( ( ( rule__ClickCssSelector__Group__0 ) ) )
            // InternalBromium.g:542:2: ( ( rule__ClickCssSelector__Group__0 ) )
            {
            // InternalBromium.g:542:2: ( ( rule__ClickCssSelector__Group__0 ) )
            // InternalBromium.g:543:3: ( rule__ClickCssSelector__Group__0 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getGroup()); 
            // InternalBromium.g:544:3: ( rule__ClickCssSelector__Group__0 )
            // InternalBromium.g:544:4: rule__ClickCssSelector__Group__0
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
    // InternalBromium.g:553:1: entryRulePageLoad : rulePageLoad EOF ;
    public final void entryRulePageLoad() throws RecognitionException {
        try {
            // InternalBromium.g:554:1: ( rulePageLoad EOF )
            // InternalBromium.g:555:1: rulePageLoad EOF
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
    // InternalBromium.g:562:1: rulePageLoad : ( ( rule__PageLoad__Group__0 ) ) ;
    public final void rulePageLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:566:2: ( ( ( rule__PageLoad__Group__0 ) ) )
            // InternalBromium.g:567:2: ( ( rule__PageLoad__Group__0 ) )
            {
            // InternalBromium.g:567:2: ( ( rule__PageLoad__Group__0 ) )
            // InternalBromium.g:568:3: ( rule__PageLoad__Group__0 )
            {
             before(grammarAccess.getPageLoadAccess().getGroup()); 
            // InternalBromium.g:569:3: ( rule__PageLoad__Group__0 )
            // InternalBromium.g:569:4: rule__PageLoad__Group__0
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
    // InternalBromium.g:578:1: entryRuleTypeTextInElementFoundByCssSelector : ruleTypeTextInElementFoundByCssSelector EOF ;
    public final void entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:579:1: ( ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:580:1: ruleTypeTextInElementFoundByCssSelector EOF
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
    // InternalBromium.g:587:1: ruleTypeTextInElementFoundByCssSelector : ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) ;
    public final void ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:591:2: ( ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) )
            // InternalBromium.g:592:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            {
            // InternalBromium.g:592:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            // InternalBromium.g:593:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); 
            // InternalBromium.g:594:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            // InternalBromium.g:594:4: rule__TypeTextInElementFoundByCssSelector__Group__0
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
    // InternalBromium.g:603:1: entryRuleTextOfElementWithCssSelectorToBe : ruleTextOfElementWithCssSelectorToBe EOF ;
    public final void entryRuleTextOfElementWithCssSelectorToBe() throws RecognitionException {
        try {
            // InternalBromium.g:604:1: ( ruleTextOfElementWithCssSelectorToBe EOF )
            // InternalBromium.g:605:1: ruleTextOfElementWithCssSelectorToBe EOF
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
    // InternalBromium.g:612:1: ruleTextOfElementWithCssSelectorToBe : ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) ) ;
    public final void ruleTextOfElementWithCssSelectorToBe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:616:2: ( ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) ) )
            // InternalBromium.g:617:2: ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) )
            {
            // InternalBromium.g:617:2: ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) )
            // InternalBromium.g:618:3: ( rule__TextOfElementWithCssSelectorToBe__Group__0 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getGroup()); 
            // InternalBromium.g:619:3: ( rule__TextOfElementWithCssSelectorToBe__Group__0 )
            // InternalBromium.g:619:4: rule__TextOfElementWithCssSelectorToBe__Group__0
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
    // InternalBromium.g:628:1: entryRuleClickClassByText : ruleClickClassByText EOF ;
    public final void entryRuleClickClassByText() throws RecognitionException {
        try {
            // InternalBromium.g:629:1: ( ruleClickClassByText EOF )
            // InternalBromium.g:630:1: ruleClickClassByText EOF
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
    // InternalBromium.g:637:1: ruleClickClassByText : ( ( rule__ClickClassByText__Group__0 ) ) ;
    public final void ruleClickClassByText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:641:2: ( ( ( rule__ClickClassByText__Group__0 ) ) )
            // InternalBromium.g:642:2: ( ( rule__ClickClassByText__Group__0 ) )
            {
            // InternalBromium.g:642:2: ( ( rule__ClickClassByText__Group__0 ) )
            // InternalBromium.g:643:3: ( rule__ClickClassByText__Group__0 )
            {
             before(grammarAccess.getClickClassByTextAccess().getGroup()); 
            // InternalBromium.g:644:3: ( rule__ClickClassByText__Group__0 )
            // InternalBromium.g:644:4: rule__ClickClassByText__Group__0
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
    // InternalBromium.g:653:1: entryRuleSetVariableToTextOfElementWithCssSelector : ruleSetVariableToTextOfElementWithCssSelector EOF ;
    public final void entryRuleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:654:1: ( ruleSetVariableToTextOfElementWithCssSelector EOF )
            // InternalBromium.g:655:1: ruleSetVariableToTextOfElementWithCssSelector EOF
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
    // InternalBromium.g:662:1: ruleSetVariableToTextOfElementWithCssSelector : ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) ) ;
    public final void ruleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:666:2: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) ) )
            // InternalBromium.g:667:2: ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) )
            {
            // InternalBromium.g:667:2: ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) )
            // InternalBromium.g:668:3: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getGroup()); 
            // InternalBromium.g:669:3: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 )
            // InternalBromium.g:669:4: rule__SetVariableToTextOfElementWithCssSelector__Group__0
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
    // InternalBromium.g:678:1: entryRuleClickDataId : ruleClickDataId EOF ;
    public final void entryRuleClickDataId() throws RecognitionException {
        try {
            // InternalBromium.g:679:1: ( ruleClickDataId EOF )
            // InternalBromium.g:680:1: ruleClickDataId EOF
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
    // InternalBromium.g:687:1: ruleClickDataId : ( ( rule__ClickDataId__Group__0 ) ) ;
    public final void ruleClickDataId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:691:2: ( ( ( rule__ClickDataId__Group__0 ) ) )
            // InternalBromium.g:692:2: ( ( rule__ClickDataId__Group__0 ) )
            {
            // InternalBromium.g:692:2: ( ( rule__ClickDataId__Group__0 ) )
            // InternalBromium.g:693:3: ( rule__ClickDataId__Group__0 )
            {
             before(grammarAccess.getClickDataIdAccess().getGroup()); 
            // InternalBromium.g:694:3: ( rule__ClickDataId__Group__0 )
            // InternalBromium.g:694:4: rule__ClickDataId__Group__0
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
    // InternalBromium.g:703:1: entryRuleConfirmAlert : ruleConfirmAlert EOF ;
    public final void entryRuleConfirmAlert() throws RecognitionException {
        try {
            // InternalBromium.g:704:1: ( ruleConfirmAlert EOF )
            // InternalBromium.g:705:1: ruleConfirmAlert EOF
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
    // InternalBromium.g:712:1: ruleConfirmAlert : ( ( rule__ConfirmAlert__Group__0 ) ) ;
    public final void ruleConfirmAlert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:716:2: ( ( ( rule__ConfirmAlert__Group__0 ) ) )
            // InternalBromium.g:717:2: ( ( rule__ConfirmAlert__Group__0 ) )
            {
            // InternalBromium.g:717:2: ( ( rule__ConfirmAlert__Group__0 ) )
            // InternalBromium.g:718:3: ( rule__ConfirmAlert__Group__0 )
            {
             before(grammarAccess.getConfirmAlertAccess().getGroup()); 
            // InternalBromium.g:719:3: ( rule__ConfirmAlert__Group__0 )
            // InternalBromium.g:719:4: rule__ConfirmAlert__Group__0
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
    // InternalBromium.g:728:1: entryRuleClickId : ruleClickId EOF ;
    public final void entryRuleClickId() throws RecognitionException {
        try {
            // InternalBromium.g:729:1: ( ruleClickId EOF )
            // InternalBromium.g:730:1: ruleClickId EOF
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
    // InternalBromium.g:737:1: ruleClickId : ( ( rule__ClickId__Group__0 ) ) ;
    public final void ruleClickId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:741:2: ( ( ( rule__ClickId__Group__0 ) ) )
            // InternalBromium.g:742:2: ( ( rule__ClickId__Group__0 ) )
            {
            // InternalBromium.g:742:2: ( ( rule__ClickId__Group__0 ) )
            // InternalBromium.g:743:3: ( rule__ClickId__Group__0 )
            {
             before(grammarAccess.getClickIdAccess().getGroup()); 
            // InternalBromium.g:744:3: ( rule__ClickId__Group__0 )
            // InternalBromium.g:744:4: rule__ClickId__Group__0
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
    // InternalBromium.g:753:1: entryRuleClickName : ruleClickName EOF ;
    public final void entryRuleClickName() throws RecognitionException {
        try {
            // InternalBromium.g:754:1: ( ruleClickName EOF )
            // InternalBromium.g:755:1: ruleClickName EOF
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
    // InternalBromium.g:762:1: ruleClickName : ( ( rule__ClickName__Group__0 ) ) ;
    public final void ruleClickName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:766:2: ( ( ( rule__ClickName__Group__0 ) ) )
            // InternalBromium.g:767:2: ( ( rule__ClickName__Group__0 ) )
            {
            // InternalBromium.g:767:2: ( ( rule__ClickName__Group__0 ) )
            // InternalBromium.g:768:3: ( rule__ClickName__Group__0 )
            {
             before(grammarAccess.getClickNameAccess().getGroup()); 
            // InternalBromium.g:769:3: ( rule__ClickName__Group__0 )
            // InternalBromium.g:769:4: rule__ClickName__Group__0
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
    // InternalBromium.g:778:1: entryRuleSelectValue : ruleSelectValue EOF ;
    public final void entryRuleSelectValue() throws RecognitionException {
        try {
            // InternalBromium.g:779:1: ( ruleSelectValue EOF )
            // InternalBromium.g:780:1: ruleSelectValue EOF
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
    // InternalBromium.g:787:1: ruleSelectValue : ( ( rule__SelectValue__Group__0 ) ) ;
    public final void ruleSelectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:791:2: ( ( ( rule__SelectValue__Group__0 ) ) )
            // InternalBromium.g:792:2: ( ( rule__SelectValue__Group__0 ) )
            {
            // InternalBromium.g:792:2: ( ( rule__SelectValue__Group__0 ) )
            // InternalBromium.g:793:3: ( rule__SelectValue__Group__0 )
            {
             before(grammarAccess.getSelectValueAccess().getGroup()); 
            // InternalBromium.g:794:3: ( rule__SelectValue__Group__0 )
            // InternalBromium.g:794:4: rule__SelectValue__Group__0
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
    // InternalBromium.g:803:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalBromium.g:804:1: ( ruleParameterValue EOF )
            // InternalBromium.g:805:1: ruleParameterValue EOF
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
    // InternalBromium.g:812:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:816:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalBromium.g:817:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalBromium.g:817:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalBromium.g:818:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalBromium.g:819:3: ( rule__ParameterValue__Alternatives )
            // InternalBromium.g:819:4: rule__ParameterValue__Alternatives
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
    // InternalBromium.g:828:1: entryRuleExposedParameter : ruleExposedParameter EOF ;
    public final void entryRuleExposedParameter() throws RecognitionException {
        try {
            // InternalBromium.g:829:1: ( ruleExposedParameter EOF )
            // InternalBromium.g:830:1: ruleExposedParameter EOF
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
    // InternalBromium.g:837:1: ruleExposedParameter : ( ( rule__ExposedParameter__NameAssignment ) ) ;
    public final void ruleExposedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:841:2: ( ( ( rule__ExposedParameter__NameAssignment ) ) )
            // InternalBromium.g:842:2: ( ( rule__ExposedParameter__NameAssignment ) )
            {
            // InternalBromium.g:842:2: ( ( rule__ExposedParameter__NameAssignment ) )
            // InternalBromium.g:843:3: ( rule__ExposedParameter__NameAssignment )
            {
             before(grammarAccess.getExposedParameterAccess().getNameAssignment()); 
            // InternalBromium.g:844:3: ( rule__ExposedParameter__NameAssignment )
            // InternalBromium.g:844:4: rule__ExposedParameter__NameAssignment
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
    // InternalBromium.g:853:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalBromium.g:854:1: ( ruleVersion EOF )
            // InternalBromium.g:855:1: ruleVersion EOF
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
    // InternalBromium.g:862:1: ruleVersion : ( RULE_STRING ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:866:2: ( ( RULE_STRING ) )
            // InternalBromium.g:867:2: ( RULE_STRING )
            {
            // InternalBromium.g:867:2: ( RULE_STRING )
            // InternalBromium.g:868:3: RULE_STRING
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


    // $ANTLR start "rule__ActionContext__Alternatives"
    // InternalBromium.g:877:1: rule__ActionContext__Alternatives : ( ( ruleTableActionContext ) | ( ruleWithinContext ) );
    public final void rule__ActionContext__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:881:1: ( ( ruleTableActionContext ) | ( ruleWithinContext ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBromium.g:882:2: ( ruleTableActionContext )
                    {
                    // InternalBromium.g:882:2: ( ruleTableActionContext )
                    // InternalBromium.g:883:3: ruleTableActionContext
                    {
                     before(grammarAccess.getActionContextAccess().getTableActionContextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTableActionContext();

                    state._fsp--;

                     after(grammarAccess.getActionContextAccess().getTableActionContextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:888:2: ( ruleWithinContext )
                    {
                    // InternalBromium.g:888:2: ( ruleWithinContext )
                    // InternalBromium.g:889:3: ruleWithinContext
                    {
                     before(grammarAccess.getActionContextAccess().getWithinContextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWithinContext();

                    state._fsp--;

                     after(grammarAccess.getActionContextAccess().getWithinContextParserRuleCall_1()); 

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
    // $ANTLR end "rule__ActionContext__Alternatives"


    // $ANTLR start "rule__RowSelector__Alternatives"
    // InternalBromium.g:898:1: rule__RowSelector__Alternatives : ( ( ruleRowLocator ) | ( ruleRowIndex ) );
    public final void rule__RowSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:902:1: ( ( ruleRowLocator ) | ( ruleRowIndex ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==25) ) {
                    alt2=2;
                }
                else if ( (LA2_1==21) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBromium.g:903:2: ( ruleRowLocator )
                    {
                    // InternalBromium.g:903:2: ( ruleRowLocator )
                    // InternalBromium.g:904:3: ruleRowLocator
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
                    // InternalBromium.g:909:2: ( ruleRowIndex )
                    {
                    // InternalBromium.g:909:2: ( ruleRowIndex )
                    // InternalBromium.g:910:3: ruleRowIndex
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
    // InternalBromium.g:919:1: rule__Locator__Alternatives : ( ( ruleCssSelector ) | ( ruleClassByText ) | ( ruleCssSelectorByText ) | ( ruleActionContext ) );
    public final void rule__Locator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:923:1: ( ( ruleCssSelector ) | ( ruleClassByText ) | ( ruleCssSelectorByText ) | ( ruleActionContext ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBromium.g:924:2: ( ruleCssSelector )
                    {
                    // InternalBromium.g:924:2: ( ruleCssSelector )
                    // InternalBromium.g:925:3: ruleCssSelector
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
                    // InternalBromium.g:930:2: ( ruleClassByText )
                    {
                    // InternalBromium.g:930:2: ( ruleClassByText )
                    // InternalBromium.g:931:3: ruleClassByText
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
                    // InternalBromium.g:936:2: ( ruleCssSelectorByText )
                    {
                    // InternalBromium.g:936:2: ( ruleCssSelectorByText )
                    // InternalBromium.g:937:3: ruleCssSelectorByText
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
                    // InternalBromium.g:942:2: ( ruleActionContext )
                    {
                    // InternalBromium.g:942:2: ( ruleActionContext )
                    // InternalBromium.g:943:3: ruleActionContext
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
    // InternalBromium.g:952:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );
    public final void rule__WebDriverActionCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:956:1: ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalBromium.g:957:2: ( ruleElementByCssToBePresent )
                    {
                    // InternalBromium.g:957:2: ( ruleElementByCssToBePresent )
                    // InternalBromium.g:958:3: ruleElementByCssToBePresent
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
                    // InternalBromium.g:963:2: ( ruleTextOfElementWithCssSelectorToBe )
                    {
                    // InternalBromium.g:963:2: ( ruleTextOfElementWithCssSelectorToBe )
                    // InternalBromium.g:964:3: ruleTextOfElementWithCssSelectorToBe
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
                    // InternalBromium.g:969:2: ( ruleConfirmAlert )
                    {
                    // InternalBromium.g:969:2: ( ruleConfirmAlert )
                    // InternalBromium.g:970:3: ruleConfirmAlert
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
    // InternalBromium.g:979:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) );
    public final void rule__WebDriverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:983:1: ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalBromium.g:984:2: ( ruleClickCssSelector )
                    {
                    // InternalBromium.g:984:2: ( ruleClickCssSelector )
                    // InternalBromium.g:985:3: ruleClickCssSelector
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
                    // InternalBromium.g:990:2: ( ruleClickClassByText )
                    {
                    // InternalBromium.g:990:2: ( ruleClickClassByText )
                    // InternalBromium.g:991:3: ruleClickClassByText
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
                    // InternalBromium.g:996:2: ( rulePageLoad )
                    {
                    // InternalBromium.g:996:2: ( rulePageLoad )
                    // InternalBromium.g:997:3: rulePageLoad
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
                    // InternalBromium.g:1002:2: ( ruleTypeTextInElementFoundByCssSelector )
                    {
                    // InternalBromium.g:1002:2: ( ruleTypeTextInElementFoundByCssSelector )
                    // InternalBromium.g:1003:3: ruleTypeTextInElementFoundByCssSelector
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
                    // InternalBromium.g:1008:2: ( ruleClickDataId )
                    {
                    // InternalBromium.g:1008:2: ( ruleClickDataId )
                    // InternalBromium.g:1009:3: ruleClickDataId
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
                    // InternalBromium.g:1014:2: ( ruleSetVariableToTextOfElementWithCssSelector )
                    {
                    // InternalBromium.g:1014:2: ( ruleSetVariableToTextOfElementWithCssSelector )
                    // InternalBromium.g:1015:3: ruleSetVariableToTextOfElementWithCssSelector
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
                    // InternalBromium.g:1020:2: ( ruleClickId )
                    {
                    // InternalBromium.g:1020:2: ( ruleClickId )
                    // InternalBromium.g:1021:3: ruleClickId
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
                    // InternalBromium.g:1026:2: ( ruleClickName )
                    {
                    // InternalBromium.g:1026:2: ( ruleClickName )
                    // InternalBromium.g:1027:3: ruleClickName
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
                    // InternalBromium.g:1032:2: ( ruleSelectValue )
                    {
                    // InternalBromium.g:1032:2: ( ruleSelectValue )
                    // InternalBromium.g:1033:3: ruleSelectValue
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
    // InternalBromium.g:1042:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) | ( ( rule__ParameterValue__IndexAssignment_2 ) ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1046:1: ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) | ( ( rule__ParameterValue__IndexAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBromium.g:1047:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    {
                    // InternalBromium.g:1047:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    // InternalBromium.g:1048:3: ( rule__ParameterValue__ContentAssignment_0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getContentAssignment_0()); 
                    // InternalBromium.g:1049:3: ( rule__ParameterValue__ContentAssignment_0 )
                    // InternalBromium.g:1049:4: rule__ParameterValue__ContentAssignment_0
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
                    // InternalBromium.g:1053:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    {
                    // InternalBromium.g:1053:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    // InternalBromium.g:1054:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    {
                     before(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1()); 
                    // InternalBromium.g:1055:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    // InternalBromium.g:1055:4: rule__ParameterValue__ExposedParameterAssignment_1
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
                    // InternalBromium.g:1059:2: ( ( rule__ParameterValue__IndexAssignment_2 ) )
                    {
                    // InternalBromium.g:1059:2: ( ( rule__ParameterValue__IndexAssignment_2 ) )
                    // InternalBromium.g:1060:3: ( rule__ParameterValue__IndexAssignment_2 )
                    {
                     before(grammarAccess.getParameterValueAccess().getIndexAssignment_2()); 
                    // InternalBromium.g:1061:3: ( rule__ParameterValue__IndexAssignment_2 )
                    // InternalBromium.g:1061:4: rule__ParameterValue__IndexAssignment_2
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
    // InternalBromium.g:1069:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1073:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBromium.g:1074:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalBromium.g:1081:1: rule__Model__Group__0__Impl : ( 'name' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1085:1: ( ( 'name' ) )
            // InternalBromium.g:1086:1: ( 'name' )
            {
            // InternalBromium.g:1086:1: ( 'name' )
            // InternalBromium.g:1087:2: 'name'
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
    // InternalBromium.g:1096:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1100:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBromium.g:1101:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalBromium.g:1108:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1112:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalBromium.g:1113:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalBromium.g:1113:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalBromium.g:1114:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalBromium.g:1115:2: ( rule__Model__NameAssignment_1 )
            // InternalBromium.g:1115:3: rule__Model__NameAssignment_1
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
    // InternalBromium.g:1123:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1127:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBromium.g:1128:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalBromium.g:1135:1: rule__Model__Group__2__Impl : ( 'version' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1139:1: ( ( 'version' ) )
            // InternalBromium.g:1140:1: ( 'version' )
            {
            // InternalBromium.g:1140:1: ( 'version' )
            // InternalBromium.g:1141:2: 'version'
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
    // InternalBromium.g:1150:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1154:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBromium.g:1155:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalBromium.g:1162:1: rule__Model__Group__3__Impl : ( ( rule__Model__VersionAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1166:1: ( ( ( rule__Model__VersionAssignment_3 ) ) )
            // InternalBromium.g:1167:1: ( ( rule__Model__VersionAssignment_3 ) )
            {
            // InternalBromium.g:1167:1: ( ( rule__Model__VersionAssignment_3 ) )
            // InternalBromium.g:1168:2: ( rule__Model__VersionAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_3()); 
            // InternalBromium.g:1169:2: ( rule__Model__VersionAssignment_3 )
            // InternalBromium.g:1169:3: rule__Model__VersionAssignment_3
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
    // InternalBromium.g:1177:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1181:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBromium.g:1182:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalBromium.g:1189:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1193:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalBromium.g:1194:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalBromium.g:1194:1: ( ( rule__Model__Group_4__0 )? )
            // InternalBromium.g:1195:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalBromium.g:1196:2: ( rule__Model__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBromium.g:1196:3: rule__Model__Group_4__0
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
    // InternalBromium.g:1204:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1208:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalBromium.g:1209:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalBromium.g:1216:1: rule__Model__Group__5__Impl : ( 'actions' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1220:1: ( ( 'actions' ) )
            // InternalBromium.g:1221:1: ( 'actions' )
            {
            // InternalBromium.g:1221:1: ( 'actions' )
            // InternalBromium.g:1222:2: 'actions'
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
    // InternalBromium.g:1231:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1235:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalBromium.g:1236:2: rule__Model__Group__6__Impl rule__Model__Group__7
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
    // InternalBromium.g:1243:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1247:1: ( ( '{' ) )
            // InternalBromium.g:1248:1: ( '{' )
            {
            // InternalBromium.g:1248:1: ( '{' )
            // InternalBromium.g:1249:2: '{'
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
    // InternalBromium.g:1258:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1262:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalBromium.g:1263:2: rule__Model__Group__7__Impl rule__Model__Group__8
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
    // InternalBromium.g:1270:1: rule__Model__Group__7__Impl : ( ( rule__Model__ActionsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1274:1: ( ( ( rule__Model__ActionsAssignment_7 )* ) )
            // InternalBromium.g:1275:1: ( ( rule__Model__ActionsAssignment_7 )* )
            {
            // InternalBromium.g:1275:1: ( ( rule__Model__ActionsAssignment_7 )* )
            // InternalBromium.g:1276:2: ( rule__Model__ActionsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getActionsAssignment_7()); 
            // InternalBromium.g:1277:2: ( rule__Model__ActionsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBromium.g:1277:3: rule__Model__ActionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__ActionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalBromium.g:1285:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1289:1: ( rule__Model__Group__8__Impl )
            // InternalBromium.g:1290:2: rule__Model__Group__8__Impl
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
    // InternalBromium.g:1296:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1300:1: ( ( '}' ) )
            // InternalBromium.g:1301:1: ( '}' )
            {
            // InternalBromium.g:1301:1: ( '}' )
            // InternalBromium.g:1302:2: '}'
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
    // InternalBromium.g:1312:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1316:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalBromium.g:1317:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalBromium.g:1324:1: rule__Model__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1328:1: ( ( 'from' ) )
            // InternalBromium.g:1329:1: ( 'from' )
            {
            // InternalBromium.g:1329:1: ( 'from' )
            // InternalBromium.g:1330:2: 'from'
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
    // InternalBromium.g:1339:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1343:1: ( rule__Model__Group_4__1__Impl )
            // InternalBromium.g:1344:2: rule__Model__Group_4__1__Impl
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
    // InternalBromium.g:1350:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__BaseVersionAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1354:1: ( ( ( rule__Model__BaseVersionAssignment_4_1 ) ) )
            // InternalBromium.g:1355:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            {
            // InternalBromium.g:1355:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            // InternalBromium.g:1356:2: ( rule__Model__BaseVersionAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); 
            // InternalBromium.g:1357:2: ( rule__Model__BaseVersionAssignment_4_1 )
            // InternalBromium.g:1357:3: rule__Model__BaseVersionAssignment_4_1
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
    // InternalBromium.g:1366:1: rule__ApplicationAction__Group__0 : rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 ;
    public final void rule__ApplicationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1370:1: ( rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 )
            // InternalBromium.g:1371:2: rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1
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
    // InternalBromium.g:1378:1: rule__ApplicationAction__Group__0__Impl : ( 'id' ) ;
    public final void rule__ApplicationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1382:1: ( ( 'id' ) )
            // InternalBromium.g:1383:1: ( 'id' )
            {
            // InternalBromium.g:1383:1: ( 'id' )
            // InternalBromium.g:1384:2: 'id'
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
    // InternalBromium.g:1393:1: rule__ApplicationAction__Group__1 : rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 ;
    public final void rule__ApplicationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1397:1: ( rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 )
            // InternalBromium.g:1398:2: rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2
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
    // InternalBromium.g:1405:1: rule__ApplicationAction__Group__1__Impl : ( ( rule__ApplicationAction__NameAssignment_1 ) ) ;
    public final void rule__ApplicationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1409:1: ( ( ( rule__ApplicationAction__NameAssignment_1 ) ) )
            // InternalBromium.g:1410:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            {
            // InternalBromium.g:1410:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            // InternalBromium.g:1411:2: ( rule__ApplicationAction__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationActionAccess().getNameAssignment_1()); 
            // InternalBromium.g:1412:2: ( rule__ApplicationAction__NameAssignment_1 )
            // InternalBromium.g:1412:3: rule__ApplicationAction__NameAssignment_1
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
    // InternalBromium.g:1420:1: rule__ApplicationAction__Group__2 : rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 ;
    public final void rule__ApplicationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1424:1: ( rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 )
            // InternalBromium.g:1425:2: rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3
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
    // InternalBromium.g:1432:1: rule__ApplicationAction__Group__2__Impl : ( 'syntax' ) ;
    public final void rule__ApplicationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1436:1: ( ( 'syntax' ) )
            // InternalBromium.g:1437:1: ( 'syntax' )
            {
            // InternalBromium.g:1437:1: ( 'syntax' )
            // InternalBromium.g:1438:2: 'syntax'
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
    // InternalBromium.g:1447:1: rule__ApplicationAction__Group__3 : rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 ;
    public final void rule__ApplicationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1451:1: ( rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 )
            // InternalBromium.g:1452:2: rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4
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
    // InternalBromium.g:1459:1: rule__ApplicationAction__Group__3__Impl : ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) ;
    public final void rule__ApplicationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1463:1: ( ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) )
            // InternalBromium.g:1464:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            {
            // InternalBromium.g:1464:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            // InternalBromium.g:1465:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            {
             before(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsAssignment_3()); 
            // InternalBromium.g:1466:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBromium.g:1466:3: rule__ApplicationAction__SyntaxDefinitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ApplicationAction__SyntaxDefinitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalBromium.g:1474:1: rule__ApplicationAction__Group__4 : rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 ;
    public final void rule__ApplicationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1478:1: ( rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 )
            // InternalBromium.g:1479:2: rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5
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
    // InternalBromium.g:1486:1: rule__ApplicationAction__Group__4__Impl : ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) ;
    public final void rule__ApplicationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1490:1: ( ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) )
            // InternalBromium.g:1491:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            {
            // InternalBromium.g:1491:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            // InternalBromium.g:1492:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_4()); 
            // InternalBromium.g:1493:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBromium.g:1493:3: rule__ApplicationAction__PreconditionAssignment_4
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
    // InternalBromium.g:1501:1: rule__ApplicationAction__Group__5 : rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 ;
    public final void rule__ApplicationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1505:1: ( rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 )
            // InternalBromium.g:1506:2: rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6
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
    // InternalBromium.g:1513:1: rule__ApplicationAction__Group__5__Impl : ( ( rule__ApplicationAction__ActionContextAssignment_5 )? ) ;
    public final void rule__ApplicationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1517:1: ( ( ( rule__ApplicationAction__ActionContextAssignment_5 )? ) )
            // InternalBromium.g:1518:1: ( ( rule__ApplicationAction__ActionContextAssignment_5 )? )
            {
            // InternalBromium.g:1518:1: ( ( rule__ApplicationAction__ActionContextAssignment_5 )? )
            // InternalBromium.g:1519:2: ( rule__ApplicationAction__ActionContextAssignment_5 )?
            {
             before(grammarAccess.getApplicationActionAccess().getActionContextAssignment_5()); 
            // InternalBromium.g:1520:2: ( rule__ApplicationAction__ActionContextAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19||LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBromium.g:1520:3: rule__ApplicationAction__ActionContextAssignment_5
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
    // InternalBromium.g:1528:1: rule__ApplicationAction__Group__6 : rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 ;
    public final void rule__ApplicationAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1532:1: ( rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 )
            // InternalBromium.g:1533:2: rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7
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
    // InternalBromium.g:1540:1: rule__ApplicationAction__Group__6__Impl : ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) ) ;
    public final void rule__ApplicationAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1544:1: ( ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) ) )
            // InternalBromium.g:1545:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) )
            {
            // InternalBromium.g:1545:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) )
            // InternalBromium.g:1546:2: ( rule__ApplicationAction__WebDriverActionAssignment_6 )
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_6()); 
            // InternalBromium.g:1547:2: ( rule__ApplicationAction__WebDriverActionAssignment_6 )
            // InternalBromium.g:1547:3: rule__ApplicationAction__WebDriverActionAssignment_6
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
    // InternalBromium.g:1555:1: rule__ApplicationAction__Group__7 : rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8 ;
    public final void rule__ApplicationAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1559:1: ( rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8 )
            // InternalBromium.g:1560:2: rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8
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
    // InternalBromium.g:1567:1: rule__ApplicationAction__Group__7__Impl : ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? ) ;
    public final void rule__ApplicationAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1571:1: ( ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? ) )
            // InternalBromium.g:1572:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? )
            {
            // InternalBromium.g:1572:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? )
            // InternalBromium.g:1573:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )?
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_7()); 
            // InternalBromium.g:1574:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBromium.g:1574:3: rule__ApplicationAction__ExpectHttpRequestAssignment_7
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
    // InternalBromium.g:1582:1: rule__ApplicationAction__Group__8 : rule__ApplicationAction__Group__8__Impl ;
    public final void rule__ApplicationAction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1586:1: ( rule__ApplicationAction__Group__8__Impl )
            // InternalBromium.g:1587:2: rule__ApplicationAction__Group__8__Impl
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
    // InternalBromium.g:1593:1: rule__ApplicationAction__Group__8__Impl : ( ( rule__ApplicationAction__PostconditionAssignment_8 )? ) ;
    public final void rule__ApplicationAction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1597:1: ( ( ( rule__ApplicationAction__PostconditionAssignment_8 )? ) )
            // InternalBromium.g:1598:1: ( ( rule__ApplicationAction__PostconditionAssignment_8 )? )
            {
            // InternalBromium.g:1598:1: ( ( rule__ApplicationAction__PostconditionAssignment_8 )? )
            // InternalBromium.g:1599:2: ( rule__ApplicationAction__PostconditionAssignment_8 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_8()); 
            // InternalBromium.g:1600:2: ( rule__ApplicationAction__PostconditionAssignment_8 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBromium.g:1600:3: rule__ApplicationAction__PostconditionAssignment_8
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


    // $ANTLR start "rule__WithinContext__Group__0"
    // InternalBromium.g:1609:1: rule__WithinContext__Group__0 : rule__WithinContext__Group__0__Impl rule__WithinContext__Group__1 ;
    public final void rule__WithinContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1613:1: ( rule__WithinContext__Group__0__Impl rule__WithinContext__Group__1 )
            // InternalBromium.g:1614:2: rule__WithinContext__Group__0__Impl rule__WithinContext__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__WithinContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithinContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__Group__0"


    // $ANTLR start "rule__WithinContext__Group__0__Impl"
    // InternalBromium.g:1621:1: rule__WithinContext__Group__0__Impl : ( 'within' ) ;
    public final void rule__WithinContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1625:1: ( ( 'within' ) )
            // InternalBromium.g:1626:1: ( 'within' )
            {
            // InternalBromium.g:1626:1: ( 'within' )
            // InternalBromium.g:1627:2: 'within'
            {
             before(grammarAccess.getWithinContextAccess().getWithinKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWithinContextAccess().getWithinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__Group__0__Impl"


    // $ANTLR start "rule__WithinContext__Group__1"
    // InternalBromium.g:1636:1: rule__WithinContext__Group__1 : rule__WithinContext__Group__1__Impl rule__WithinContext__Group__2 ;
    public final void rule__WithinContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1640:1: ( rule__WithinContext__Group__1__Impl rule__WithinContext__Group__2 )
            // InternalBromium.g:1641:2: rule__WithinContext__Group__1__Impl rule__WithinContext__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__WithinContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithinContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__Group__1"


    // $ANTLR start "rule__WithinContext__Group__1__Impl"
    // InternalBromium.g:1648:1: rule__WithinContext__Group__1__Impl : ( 'element' ) ;
    public final void rule__WithinContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1652:1: ( ( 'element' ) )
            // InternalBromium.g:1653:1: ( 'element' )
            {
            // InternalBromium.g:1653:1: ( 'element' )
            // InternalBromium.g:1654:2: 'element'
            {
             before(grammarAccess.getWithinContextAccess().getElementKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWithinContextAccess().getElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__Group__1__Impl"


    // $ANTLR start "rule__WithinContext__Group__2"
    // InternalBromium.g:1663:1: rule__WithinContext__Group__2 : rule__WithinContext__Group__2__Impl rule__WithinContext__Group__3 ;
    public final void rule__WithinContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1667:1: ( rule__WithinContext__Group__2__Impl rule__WithinContext__Group__3 )
            // InternalBromium.g:1668:2: rule__WithinContext__Group__2__Impl rule__WithinContext__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__WithinContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithinContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__Group__2"


    // $ANTLR start "rule__WithinContext__Group__2__Impl"
    // InternalBromium.g:1675:1: rule__WithinContext__Group__2__Impl : ( 'with' ) ;
    public final void rule__WithinContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1679:1: ( ( 'with' ) )
            // InternalBromium.g:1680:1: ( 'with' )
            {
            // InternalBromium.g:1680:1: ( 'with' )
            // InternalBromium.g:1681:2: 'with'
            {
             before(grammarAccess.getWithinContextAccess().getWithKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWithinContextAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__Group__2__Impl"


    // $ANTLR start "rule__WithinContext__Group__3"
    // InternalBromium.g:1690:1: rule__WithinContext__Group__3 : rule__WithinContext__Group__3__Impl ;
    public final void rule__WithinContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1694:1: ( rule__WithinContext__Group__3__Impl )
            // InternalBromium.g:1695:2: rule__WithinContext__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WithinContext__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__Group__3"


    // $ANTLR start "rule__WithinContext__Group__3__Impl"
    // InternalBromium.g:1701:1: rule__WithinContext__Group__3__Impl : ( ( rule__WithinContext__ElementLocatorAssignment_3 ) ) ;
    public final void rule__WithinContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1705:1: ( ( ( rule__WithinContext__ElementLocatorAssignment_3 ) ) )
            // InternalBromium.g:1706:1: ( ( rule__WithinContext__ElementLocatorAssignment_3 ) )
            {
            // InternalBromium.g:1706:1: ( ( rule__WithinContext__ElementLocatorAssignment_3 ) )
            // InternalBromium.g:1707:2: ( rule__WithinContext__ElementLocatorAssignment_3 )
            {
             before(grammarAccess.getWithinContextAccess().getElementLocatorAssignment_3()); 
            // InternalBromium.g:1708:2: ( rule__WithinContext__ElementLocatorAssignment_3 )
            // InternalBromium.g:1708:3: rule__WithinContext__ElementLocatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WithinContext__ElementLocatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWithinContextAccess().getElementLocatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__Group__3__Impl"


    // $ANTLR start "rule__TableActionContext__Group__0"
    // InternalBromium.g:1717:1: rule__TableActionContext__Group__0 : rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1 ;
    public final void rule__TableActionContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1721:1: ( rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1 )
            // InternalBromium.g:1722:2: rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:1729:1: rule__TableActionContext__Group__0__Impl : ( 'table' ) ;
    public final void rule__TableActionContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1733:1: ( ( 'table' ) )
            // InternalBromium.g:1734:1: ( 'table' )
            {
            // InternalBromium.g:1734:1: ( 'table' )
            // InternalBromium.g:1735:2: 'table'
            {
             before(grammarAccess.getTableActionContextAccess().getTableKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBromium.g:1744:1: rule__TableActionContext__Group__1 : rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2 ;
    public final void rule__TableActionContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1748:1: ( rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2 )
            // InternalBromium.g:1749:2: rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBromium.g:1756:1: rule__TableActionContext__Group__1__Impl : ( 'with' ) ;
    public final void rule__TableActionContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1760:1: ( ( 'with' ) )
            // InternalBromium.g:1761:1: ( 'with' )
            {
            // InternalBromium.g:1761:1: ( 'with' )
            // InternalBromium.g:1762:2: 'with'
            {
             before(grammarAccess.getTableActionContextAccess().getWithKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:1771:1: rule__TableActionContext__Group__2 : rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3 ;
    public final void rule__TableActionContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1775:1: ( rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3 )
            // InternalBromium.g:1776:2: rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBromium.g:1783:1: rule__TableActionContext__Group__2__Impl : ( ( rule__TableActionContext__TableLocatorAssignment_2 ) ) ;
    public final void rule__TableActionContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1787:1: ( ( ( rule__TableActionContext__TableLocatorAssignment_2 ) ) )
            // InternalBromium.g:1788:1: ( ( rule__TableActionContext__TableLocatorAssignment_2 ) )
            {
            // InternalBromium.g:1788:1: ( ( rule__TableActionContext__TableLocatorAssignment_2 ) )
            // InternalBromium.g:1789:2: ( rule__TableActionContext__TableLocatorAssignment_2 )
            {
             before(grammarAccess.getTableActionContextAccess().getTableLocatorAssignment_2()); 
            // InternalBromium.g:1790:2: ( rule__TableActionContext__TableLocatorAssignment_2 )
            // InternalBromium.g:1790:3: rule__TableActionContext__TableLocatorAssignment_2
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
    // InternalBromium.g:1798:1: rule__TableActionContext__Group__3 : rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4 ;
    public final void rule__TableActionContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1802:1: ( rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4 )
            // InternalBromium.g:1803:2: rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:1810:1: rule__TableActionContext__Group__3__Impl : ( 'rows' ) ;
    public final void rule__TableActionContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1814:1: ( ( 'rows' ) )
            // InternalBromium.g:1815:1: ( 'rows' )
            {
            // InternalBromium.g:1815:1: ( 'rows' )
            // InternalBromium.g:1816:2: 'rows'
            {
             before(grammarAccess.getTableActionContextAccess().getRowsKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBromium.g:1825:1: rule__TableActionContext__Group__4 : rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5 ;
    public final void rule__TableActionContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1829:1: ( rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5 )
            // InternalBromium.g:1830:2: rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalBromium.g:1837:1: rule__TableActionContext__Group__4__Impl : ( 'with' ) ;
    public final void rule__TableActionContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1841:1: ( ( 'with' ) )
            // InternalBromium.g:1842:1: ( 'with' )
            {
            // InternalBromium.g:1842:1: ( 'with' )
            // InternalBromium.g:1843:2: 'with'
            {
             before(grammarAccess.getTableActionContextAccess().getWithKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:1852:1: rule__TableActionContext__Group__5 : rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6 ;
    public final void rule__TableActionContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1856:1: ( rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6 )
            // InternalBromium.g:1857:2: rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalBromium.g:1864:1: rule__TableActionContext__Group__5__Impl : ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) ) ;
    public final void rule__TableActionContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1868:1: ( ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) ) )
            // InternalBromium.g:1869:1: ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) )
            {
            // InternalBromium.g:1869:1: ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) )
            // InternalBromium.g:1870:2: ( rule__TableActionContext__RowsLocatorAssignment_5 )
            {
             before(grammarAccess.getTableActionContextAccess().getRowsLocatorAssignment_5()); 
            // InternalBromium.g:1871:2: ( rule__TableActionContext__RowsLocatorAssignment_5 )
            // InternalBromium.g:1871:3: rule__TableActionContext__RowsLocatorAssignment_5
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
    // InternalBromium.g:1879:1: rule__TableActionContext__Group__6 : rule__TableActionContext__Group__6__Impl ;
    public final void rule__TableActionContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1883:1: ( rule__TableActionContext__Group__6__Impl )
            // InternalBromium.g:1884:2: rule__TableActionContext__Group__6__Impl
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
    // InternalBromium.g:1890:1: rule__TableActionContext__Group__6__Impl : ( ( rule__TableActionContext__RowSelectorAssignment_6 ) ) ;
    public final void rule__TableActionContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1894:1: ( ( ( rule__TableActionContext__RowSelectorAssignment_6 ) ) )
            // InternalBromium.g:1895:1: ( ( rule__TableActionContext__RowSelectorAssignment_6 ) )
            {
            // InternalBromium.g:1895:1: ( ( rule__TableActionContext__RowSelectorAssignment_6 ) )
            // InternalBromium.g:1896:2: ( rule__TableActionContext__RowSelectorAssignment_6 )
            {
             before(grammarAccess.getTableActionContextAccess().getRowSelectorAssignment_6()); 
            // InternalBromium.g:1897:2: ( rule__TableActionContext__RowSelectorAssignment_6 )
            // InternalBromium.g:1897:3: rule__TableActionContext__RowSelectorAssignment_6
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
    // InternalBromium.g:1906:1: rule__RowLocator__Group__0 : rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1 ;
    public final void rule__RowLocator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1910:1: ( rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1 )
            // InternalBromium.g:1911:2: rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:1918:1: rule__RowLocator__Group__0__Impl : ( 'row' ) ;
    public final void rule__RowLocator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1922:1: ( ( 'row' ) )
            // InternalBromium.g:1923:1: ( 'row' )
            {
            // InternalBromium.g:1923:1: ( 'row' )
            // InternalBromium.g:1924:2: 'row'
            {
             before(grammarAccess.getRowLocatorAccess().getRowKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBromium.g:1933:1: rule__RowLocator__Group__1 : rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2 ;
    public final void rule__RowLocator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1937:1: ( rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2 )
            // InternalBromium.g:1938:2: rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBromium.g:1945:1: rule__RowLocator__Group__1__Impl : ( 'with' ) ;
    public final void rule__RowLocator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1949:1: ( ( 'with' ) )
            // InternalBromium.g:1950:1: ( 'with' )
            {
            // InternalBromium.g:1950:1: ( 'with' )
            // InternalBromium.g:1951:2: 'with'
            {
             before(grammarAccess.getRowLocatorAccess().getWithKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:1960:1: rule__RowLocator__Group__2 : rule__RowLocator__Group__2__Impl ;
    public final void rule__RowLocator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1964:1: ( rule__RowLocator__Group__2__Impl )
            // InternalBromium.g:1965:2: rule__RowLocator__Group__2__Impl
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
    // InternalBromium.g:1971:1: rule__RowLocator__Group__2__Impl : ( ( rule__RowLocator__RowLocatorAssignment_2 ) ) ;
    public final void rule__RowLocator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1975:1: ( ( ( rule__RowLocator__RowLocatorAssignment_2 ) ) )
            // InternalBromium.g:1976:1: ( ( rule__RowLocator__RowLocatorAssignment_2 ) )
            {
            // InternalBromium.g:1976:1: ( ( rule__RowLocator__RowLocatorAssignment_2 ) )
            // InternalBromium.g:1977:2: ( rule__RowLocator__RowLocatorAssignment_2 )
            {
             before(grammarAccess.getRowLocatorAccess().getRowLocatorAssignment_2()); 
            // InternalBromium.g:1978:2: ( rule__RowLocator__RowLocatorAssignment_2 )
            // InternalBromium.g:1978:3: rule__RowLocator__RowLocatorAssignment_2
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
    // InternalBromium.g:1987:1: rule__RowIndex__Group__0 : rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1 ;
    public final void rule__RowIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1991:1: ( rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1 )
            // InternalBromium.g:1992:2: rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:1999:1: rule__RowIndex__Group__0__Impl : ( 'row' ) ;
    public final void rule__RowIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2003:1: ( ( 'row' ) )
            // InternalBromium.g:2004:1: ( 'row' )
            {
            // InternalBromium.g:2004:1: ( 'row' )
            // InternalBromium.g:2005:2: 'row'
            {
             before(grammarAccess.getRowIndexAccess().getRowKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBromium.g:2014:1: rule__RowIndex__Group__1 : rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2 ;
    public final void rule__RowIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2018:1: ( rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2 )
            // InternalBromium.g:2019:2: rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:2026:1: rule__RowIndex__Group__1__Impl : ( 'number' ) ;
    public final void rule__RowIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2030:1: ( ( 'number' ) )
            // InternalBromium.g:2031:1: ( 'number' )
            {
            // InternalBromium.g:2031:1: ( 'number' )
            // InternalBromium.g:2032:2: 'number'
            {
             before(grammarAccess.getRowIndexAccess().getNumberKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBromium.g:2041:1: rule__RowIndex__Group__2 : rule__RowIndex__Group__2__Impl ;
    public final void rule__RowIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2045:1: ( rule__RowIndex__Group__2__Impl )
            // InternalBromium.g:2046:2: rule__RowIndex__Group__2__Impl
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
    // InternalBromium.g:2052:1: rule__RowIndex__Group__2__Impl : ( ( rule__RowIndex__IndexAssignment_2 ) ) ;
    public final void rule__RowIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2056:1: ( ( ( rule__RowIndex__IndexAssignment_2 ) ) )
            // InternalBromium.g:2057:1: ( ( rule__RowIndex__IndexAssignment_2 ) )
            {
            // InternalBromium.g:2057:1: ( ( rule__RowIndex__IndexAssignment_2 ) )
            // InternalBromium.g:2058:2: ( rule__RowIndex__IndexAssignment_2 )
            {
             before(grammarAccess.getRowIndexAccess().getIndexAssignment_2()); 
            // InternalBromium.g:2059:2: ( rule__RowIndex__IndexAssignment_2 )
            // InternalBromium.g:2059:3: rule__RowIndex__IndexAssignment_2
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
    // InternalBromium.g:2068:1: rule__ClassByText__Group__0 : rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1 ;
    public final void rule__ClassByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2072:1: ( rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1 )
            // InternalBromium.g:2073:2: rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:2080:1: rule__ClassByText__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2084:1: ( ( 'class' ) )
            // InternalBromium.g:2085:1: ( 'class' )
            {
            // InternalBromium.g:2085:1: ( 'class' )
            // InternalBromium.g:2086:2: 'class'
            {
             before(grammarAccess.getClassByTextAccess().getClassKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBromium.g:2095:1: rule__ClassByText__Group__1 : rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2 ;
    public final void rule__ClassByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2099:1: ( rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2 )
            // InternalBromium.g:2100:2: rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalBromium.g:2107:1: rule__ClassByText__Group__1__Impl : ( ( rule__ClassByText__KlassAssignment_1 ) ) ;
    public final void rule__ClassByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2111:1: ( ( ( rule__ClassByText__KlassAssignment_1 ) ) )
            // InternalBromium.g:2112:1: ( ( rule__ClassByText__KlassAssignment_1 ) )
            {
            // InternalBromium.g:2112:1: ( ( rule__ClassByText__KlassAssignment_1 ) )
            // InternalBromium.g:2113:2: ( rule__ClassByText__KlassAssignment_1 )
            {
             before(grammarAccess.getClassByTextAccess().getKlassAssignment_1()); 
            // InternalBromium.g:2114:2: ( rule__ClassByText__KlassAssignment_1 )
            // InternalBromium.g:2114:3: rule__ClassByText__KlassAssignment_1
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
    // InternalBromium.g:2122:1: rule__ClassByText__Group__2 : rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3 ;
    public final void rule__ClassByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2126:1: ( rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3 )
            // InternalBromium.g:2127:2: rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:2134:1: rule__ClassByText__Group__2__Impl : ( 'and' ) ;
    public final void rule__ClassByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2138:1: ( ( 'and' ) )
            // InternalBromium.g:2139:1: ( 'and' )
            {
            // InternalBromium.g:2139:1: ( 'and' )
            // InternalBromium.g:2140:2: 'and'
            {
             before(grammarAccess.getClassByTextAccess().getAndKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBromium.g:2149:1: rule__ClassByText__Group__3 : rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4 ;
    public final void rule__ClassByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2153:1: ( rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4 )
            // InternalBromium.g:2154:2: rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:2161:1: rule__ClassByText__Group__3__Impl : ( 'text' ) ;
    public final void rule__ClassByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2165:1: ( ( 'text' ) )
            // InternalBromium.g:2166:1: ( 'text' )
            {
            // InternalBromium.g:2166:1: ( 'text' )
            // InternalBromium.g:2167:2: 'text'
            {
             before(grammarAccess.getClassByTextAccess().getTextKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:2176:1: rule__ClassByText__Group__4 : rule__ClassByText__Group__4__Impl ;
    public final void rule__ClassByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2180:1: ( rule__ClassByText__Group__4__Impl )
            // InternalBromium.g:2181:2: rule__ClassByText__Group__4__Impl
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
    // InternalBromium.g:2187:1: rule__ClassByText__Group__4__Impl : ( ( rule__ClassByText__TextAssignment_4 ) ) ;
    public final void rule__ClassByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2191:1: ( ( ( rule__ClassByText__TextAssignment_4 ) ) )
            // InternalBromium.g:2192:1: ( ( rule__ClassByText__TextAssignment_4 ) )
            {
            // InternalBromium.g:2192:1: ( ( rule__ClassByText__TextAssignment_4 ) )
            // InternalBromium.g:2193:2: ( rule__ClassByText__TextAssignment_4 )
            {
             before(grammarAccess.getClassByTextAccess().getTextAssignment_4()); 
            // InternalBromium.g:2194:2: ( rule__ClassByText__TextAssignment_4 )
            // InternalBromium.g:2194:3: rule__ClassByText__TextAssignment_4
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
    // InternalBromium.g:2203:1: rule__CssSelectorByText__Group__0 : rule__CssSelectorByText__Group__0__Impl rule__CssSelectorByText__Group__1 ;
    public final void rule__CssSelectorByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2207:1: ( rule__CssSelectorByText__Group__0__Impl rule__CssSelectorByText__Group__1 )
            // InternalBromium.g:2208:2: rule__CssSelectorByText__Group__0__Impl rule__CssSelectorByText__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBromium.g:2215:1: rule__CssSelectorByText__Group__0__Impl : ( 'css' ) ;
    public final void rule__CssSelectorByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2219:1: ( ( 'css' ) )
            // InternalBromium.g:2220:1: ( 'css' )
            {
            // InternalBromium.g:2220:1: ( 'css' )
            // InternalBromium.g:2221:2: 'css'
            {
             before(grammarAccess.getCssSelectorByTextAccess().getCssKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBromium.g:2230:1: rule__CssSelectorByText__Group__1 : rule__CssSelectorByText__Group__1__Impl rule__CssSelectorByText__Group__2 ;
    public final void rule__CssSelectorByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2234:1: ( rule__CssSelectorByText__Group__1__Impl rule__CssSelectorByText__Group__2 )
            // InternalBromium.g:2235:2: rule__CssSelectorByText__Group__1__Impl rule__CssSelectorByText__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:2242:1: rule__CssSelectorByText__Group__1__Impl : ( 'selector' ) ;
    public final void rule__CssSelectorByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2246:1: ( ( 'selector' ) )
            // InternalBromium.g:2247:1: ( 'selector' )
            {
            // InternalBromium.g:2247:1: ( 'selector' )
            // InternalBromium.g:2248:2: 'selector'
            {
             before(grammarAccess.getCssSelectorByTextAccess().getSelectorKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:2257:1: rule__CssSelectorByText__Group__2 : rule__CssSelectorByText__Group__2__Impl rule__CssSelectorByText__Group__3 ;
    public final void rule__CssSelectorByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2261:1: ( rule__CssSelectorByText__Group__2__Impl rule__CssSelectorByText__Group__3 )
            // InternalBromium.g:2262:2: rule__CssSelectorByText__Group__2__Impl rule__CssSelectorByText__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalBromium.g:2269:1: rule__CssSelectorByText__Group__2__Impl : ( ( rule__CssSelectorByText__SelectorAssignment_2 ) ) ;
    public final void rule__CssSelectorByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2273:1: ( ( ( rule__CssSelectorByText__SelectorAssignment_2 ) ) )
            // InternalBromium.g:2274:1: ( ( rule__CssSelectorByText__SelectorAssignment_2 ) )
            {
            // InternalBromium.g:2274:1: ( ( rule__CssSelectorByText__SelectorAssignment_2 ) )
            // InternalBromium.g:2275:2: ( rule__CssSelectorByText__SelectorAssignment_2 )
            {
             before(grammarAccess.getCssSelectorByTextAccess().getSelectorAssignment_2()); 
            // InternalBromium.g:2276:2: ( rule__CssSelectorByText__SelectorAssignment_2 )
            // InternalBromium.g:2276:3: rule__CssSelectorByText__SelectorAssignment_2
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
    // InternalBromium.g:2284:1: rule__CssSelectorByText__Group__3 : rule__CssSelectorByText__Group__3__Impl rule__CssSelectorByText__Group__4 ;
    public final void rule__CssSelectorByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2288:1: ( rule__CssSelectorByText__Group__3__Impl rule__CssSelectorByText__Group__4 )
            // InternalBromium.g:2289:2: rule__CssSelectorByText__Group__3__Impl rule__CssSelectorByText__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:2296:1: rule__CssSelectorByText__Group__3__Impl : ( 'and' ) ;
    public final void rule__CssSelectorByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2300:1: ( ( 'and' ) )
            // InternalBromium.g:2301:1: ( 'and' )
            {
            // InternalBromium.g:2301:1: ( 'and' )
            // InternalBromium.g:2302:2: 'and'
            {
             before(grammarAccess.getCssSelectorByTextAccess().getAndKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBromium.g:2311:1: rule__CssSelectorByText__Group__4 : rule__CssSelectorByText__Group__4__Impl rule__CssSelectorByText__Group__5 ;
    public final void rule__CssSelectorByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2315:1: ( rule__CssSelectorByText__Group__4__Impl rule__CssSelectorByText__Group__5 )
            // InternalBromium.g:2316:2: rule__CssSelectorByText__Group__4__Impl rule__CssSelectorByText__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:2323:1: rule__CssSelectorByText__Group__4__Impl : ( 'text' ) ;
    public final void rule__CssSelectorByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2327:1: ( ( 'text' ) )
            // InternalBromium.g:2328:1: ( 'text' )
            {
            // InternalBromium.g:2328:1: ( 'text' )
            // InternalBromium.g:2329:2: 'text'
            {
             before(grammarAccess.getCssSelectorByTextAccess().getTextKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:2338:1: rule__CssSelectorByText__Group__5 : rule__CssSelectorByText__Group__5__Impl ;
    public final void rule__CssSelectorByText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2342:1: ( rule__CssSelectorByText__Group__5__Impl )
            // InternalBromium.g:2343:2: rule__CssSelectorByText__Group__5__Impl
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
    // InternalBromium.g:2349:1: rule__CssSelectorByText__Group__5__Impl : ( ( rule__CssSelectorByText__TextAssignment_5 ) ) ;
    public final void rule__CssSelectorByText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2353:1: ( ( ( rule__CssSelectorByText__TextAssignment_5 ) ) )
            // InternalBromium.g:2354:1: ( ( rule__CssSelectorByText__TextAssignment_5 ) )
            {
            // InternalBromium.g:2354:1: ( ( rule__CssSelectorByText__TextAssignment_5 ) )
            // InternalBromium.g:2355:2: ( rule__CssSelectorByText__TextAssignment_5 )
            {
             before(grammarAccess.getCssSelectorByTextAccess().getTextAssignment_5()); 
            // InternalBromium.g:2356:2: ( rule__CssSelectorByText__TextAssignment_5 )
            // InternalBromium.g:2356:3: rule__CssSelectorByText__TextAssignment_5
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
    // InternalBromium.g:2365:1: rule__CssSelector__Group__0 : rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 ;
    public final void rule__CssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2369:1: ( rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 )
            // InternalBromium.g:2370:2: rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBromium.g:2377:1: rule__CssSelector__Group__0__Impl : ( 'css' ) ;
    public final void rule__CssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2381:1: ( ( 'css' ) )
            // InternalBromium.g:2382:1: ( 'css' )
            {
            // InternalBromium.g:2382:1: ( 'css' )
            // InternalBromium.g:2383:2: 'css'
            {
             before(grammarAccess.getCssSelectorAccess().getCssKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBromium.g:2392:1: rule__CssSelector__Group__1 : rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2 ;
    public final void rule__CssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2396:1: ( rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2 )
            // InternalBromium.g:2397:2: rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:2404:1: rule__CssSelector__Group__1__Impl : ( 'selector' ) ;
    public final void rule__CssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2408:1: ( ( 'selector' ) )
            // InternalBromium.g:2409:1: ( 'selector' )
            {
            // InternalBromium.g:2409:1: ( 'selector' )
            // InternalBromium.g:2410:2: 'selector'
            {
             before(grammarAccess.getCssSelectorAccess().getSelectorKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:2419:1: rule__CssSelector__Group__2 : rule__CssSelector__Group__2__Impl ;
    public final void rule__CssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2423:1: ( rule__CssSelector__Group__2__Impl )
            // InternalBromium.g:2424:2: rule__CssSelector__Group__2__Impl
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
    // InternalBromium.g:2430:1: rule__CssSelector__Group__2__Impl : ( ( rule__CssSelector__SelectorAssignment_2 ) ) ;
    public final void rule__CssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2434:1: ( ( ( rule__CssSelector__SelectorAssignment_2 ) ) )
            // InternalBromium.g:2435:1: ( ( rule__CssSelector__SelectorAssignment_2 ) )
            {
            // InternalBromium.g:2435:1: ( ( rule__CssSelector__SelectorAssignment_2 ) )
            // InternalBromium.g:2436:2: ( rule__CssSelector__SelectorAssignment_2 )
            {
             before(grammarAccess.getCssSelectorAccess().getSelectorAssignment_2()); 
            // InternalBromium.g:2437:2: ( rule__CssSelector__SelectorAssignment_2 )
            // InternalBromium.g:2437:3: rule__CssSelector__SelectorAssignment_2
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
    // InternalBromium.g:2446:1: rule__SyntaxDefinition__Group__0 : rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 ;
    public final void rule__SyntaxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2450:1: ( rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 )
            // InternalBromium.g:2451:2: rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1
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
    // InternalBromium.g:2458:1: rule__SyntaxDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SyntaxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2462:1: ( ( () ) )
            // InternalBromium.g:2463:1: ( () )
            {
            // InternalBromium.g:2463:1: ( () )
            // InternalBromium.g:2464:2: ()
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getSyntaxDefinitionAction_0()); 
            // InternalBromium.g:2465:2: ()
            // InternalBromium.g:2465:3: 
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
    // InternalBromium.g:2473:1: rule__SyntaxDefinition__Group__1 : rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 ;
    public final void rule__SyntaxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2477:1: ( rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 )
            // InternalBromium.g:2478:2: rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2
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
    // InternalBromium.g:2485:1: rule__SyntaxDefinition__Group__1__Impl : ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) ;
    public final void rule__SyntaxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2489:1: ( ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) )
            // InternalBromium.g:2490:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            {
            // InternalBromium.g:2490:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            // InternalBromium.g:2491:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getContentAssignment_1()); 
            // InternalBromium.g:2492:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            // InternalBromium.g:2492:3: rule__SyntaxDefinition__ContentAssignment_1
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
    // InternalBromium.g:2500:1: rule__SyntaxDefinition__Group__2 : rule__SyntaxDefinition__Group__2__Impl ;
    public final void rule__SyntaxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2504:1: ( rule__SyntaxDefinition__Group__2__Impl )
            // InternalBromium.g:2505:2: rule__SyntaxDefinition__Group__2__Impl
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
    // InternalBromium.g:2511:1: rule__SyntaxDefinition__Group__2__Impl : ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) ;
    public final void rule__SyntaxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2515:1: ( ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) )
            // InternalBromium.g:2516:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            {
            // InternalBromium.g:2516:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            // InternalBromium.g:2517:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getParameterAssignment_2()); 
            // InternalBromium.g:2518:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBromium.g:2518:3: rule__SyntaxDefinition__ParameterAssignment_2
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
    // InternalBromium.g:2527:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2531:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalBromium.g:2532:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBromium.g:2539:1: rule__Precondition__Group__0__Impl : ( 'when' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2543:1: ( ( 'when' ) )
            // InternalBromium.g:2544:1: ( 'when' )
            {
            // InternalBromium.g:2544:1: ( 'when' )
            // InternalBromium.g:2545:2: 'when'
            {
             before(grammarAccess.getPreconditionAccess().getWhenKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBromium.g:2554:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2558:1: ( rule__Precondition__Group__1__Impl )
            // InternalBromium.g:2559:2: rule__Precondition__Group__1__Impl
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
    // InternalBromium.g:2565:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ActionAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2569:1: ( ( ( rule__Precondition__ActionAssignment_1 ) ) )
            // InternalBromium.g:2570:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            {
            // InternalBromium.g:2570:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            // InternalBromium.g:2571:2: ( rule__Precondition__ActionAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getActionAssignment_1()); 
            // InternalBromium.g:2572:2: ( rule__Precondition__ActionAssignment_1 )
            // InternalBromium.g:2572:3: rule__Precondition__ActionAssignment_1
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
    // InternalBromium.g:2581:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2585:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalBromium.g:2586:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBromium.g:2593:1: rule__Postcondition__Group__0__Impl : ( 'then' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2597:1: ( ( 'then' ) )
            // InternalBromium.g:2598:1: ( 'then' )
            {
            // InternalBromium.g:2598:1: ( 'then' )
            // InternalBromium.g:2599:2: 'then'
            {
             before(grammarAccess.getPostconditionAccess().getThenKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBromium.g:2608:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2612:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalBromium.g:2613:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalBromium.g:2620:1: rule__Postcondition__Group__1__Impl : ( 'make' ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2624:1: ( ( 'make' ) )
            // InternalBromium.g:2625:1: ( 'make' )
            {
            // InternalBromium.g:2625:1: ( 'make' )
            // InternalBromium.g:2626:2: 'make'
            {
             before(grammarAccess.getPostconditionAccess().getMakeKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBromium.g:2635:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2639:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalBromium.g:2640:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalBromium.g:2647:1: rule__Postcondition__Group__2__Impl : ( 'sure' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2651:1: ( ( 'sure' ) )
            // InternalBromium.g:2652:1: ( 'sure' )
            {
            // InternalBromium.g:2652:1: ( 'sure' )
            // InternalBromium.g:2653:2: 'sure'
            {
             before(grammarAccess.getPostconditionAccess().getSureKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBromium.g:2662:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2666:1: ( rule__Postcondition__Group__3__Impl )
            // InternalBromium.g:2667:2: rule__Postcondition__Group__3__Impl
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
    // InternalBromium.g:2673:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__ActionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2677:1: ( ( ( rule__Postcondition__ActionAssignment_3 ) ) )
            // InternalBromium.g:2678:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            {
            // InternalBromium.g:2678:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            // InternalBromium.g:2679:2: ( rule__Postcondition__ActionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getActionAssignment_3()); 
            // InternalBromium.g:2680:2: ( rule__Postcondition__ActionAssignment_3 )
            // InternalBromium.g:2680:3: rule__Postcondition__ActionAssignment_3
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
    // InternalBromium.g:2689:1: rule__ExpectHttpRequest__Group__0 : rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 ;
    public final void rule__ExpectHttpRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2693:1: ( rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 )
            // InternalBromium.g:2694:2: rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalBromium.g:2701:1: rule__ExpectHttpRequest__Group__0__Impl : ( () ) ;
    public final void rule__ExpectHttpRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2705:1: ( ( () ) )
            // InternalBromium.g:2706:1: ( () )
            {
            // InternalBromium.g:2706:1: ( () )
            // InternalBromium.g:2707:2: ()
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectHttpRequestAction_0()); 
            // InternalBromium.g:2708:2: ()
            // InternalBromium.g:2708:3: 
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
    // InternalBromium.g:2716:1: rule__ExpectHttpRequest__Group__1 : rule__ExpectHttpRequest__Group__1__Impl ;
    public final void rule__ExpectHttpRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2720:1: ( rule__ExpectHttpRequest__Group__1__Impl )
            // InternalBromium.g:2721:2: rule__ExpectHttpRequest__Group__1__Impl
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
    // InternalBromium.g:2727:1: rule__ExpectHttpRequest__Group__1__Impl : ( ( rule__ExpectHttpRequest__Group_1__0 ) ) ;
    public final void rule__ExpectHttpRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2731:1: ( ( ( rule__ExpectHttpRequest__Group_1__0 ) ) )
            // InternalBromium.g:2732:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            {
            // InternalBromium.g:2732:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            // InternalBromium.g:2733:2: ( rule__ExpectHttpRequest__Group_1__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup_1()); 
            // InternalBromium.g:2734:2: ( rule__ExpectHttpRequest__Group_1__0 )
            // InternalBromium.g:2734:3: rule__ExpectHttpRequest__Group_1__0
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
    // InternalBromium.g:2743:1: rule__ExpectHttpRequest__Group_1__0 : rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 ;
    public final void rule__ExpectHttpRequest__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2747:1: ( rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 )
            // InternalBromium.g:2748:2: rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalBromium.g:2755:1: rule__ExpectHttpRequest__Group_1__0__Impl : ( 'do' ) ;
    public final void rule__ExpectHttpRequest__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2759:1: ( ( 'do' ) )
            // InternalBromium.g:2760:1: ( 'do' )
            {
            // InternalBromium.g:2760:1: ( 'do' )
            // InternalBromium.g:2761:2: 'do'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getDoKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBromium.g:2770:1: rule__ExpectHttpRequest__Group_1__1 : rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 ;
    public final void rule__ExpectHttpRequest__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2774:1: ( rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 )
            // InternalBromium.g:2775:2: rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalBromium.g:2782:1: rule__ExpectHttpRequest__Group_1__1__Impl : ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) ;
    public final void rule__ExpectHttpRequest__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2786:1: ( ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) )
            // InternalBromium.g:2787:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            {
            // InternalBromium.g:2787:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            // InternalBromium.g:2788:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotAssignment_1_1()); 
            // InternalBromium.g:2789:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==52) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBromium.g:2789:3: rule__ExpectHttpRequest__NotAssignment_1_1
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
    // InternalBromium.g:2797:1: rule__ExpectHttpRequest__Group_1__2 : rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 ;
    public final void rule__ExpectHttpRequest__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2801:1: ( rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 )
            // InternalBromium.g:2802:2: rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalBromium.g:2809:1: rule__ExpectHttpRequest__Group_1__2__Impl : ( 'expect' ) ;
    public final void rule__ExpectHttpRequest__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2813:1: ( ( 'expect' ) )
            // InternalBromium.g:2814:1: ( 'expect' )
            {
            // InternalBromium.g:2814:1: ( 'expect' )
            // InternalBromium.g:2815:2: 'expect'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBromium.g:2824:1: rule__ExpectHttpRequest__Group_1__3 : rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 ;
    public final void rule__ExpectHttpRequest__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2828:1: ( rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 )
            // InternalBromium.g:2829:2: rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalBromium.g:2836:1: rule__ExpectHttpRequest__Group_1__3__Impl : ( 'http' ) ;
    public final void rule__ExpectHttpRequest__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2840:1: ( ( 'http' ) )
            // InternalBromium.g:2841:1: ( 'http' )
            {
            // InternalBromium.g:2841:1: ( 'http' )
            // InternalBromium.g:2842:2: 'http'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getHttpKeyword_1_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBromium.g:2851:1: rule__ExpectHttpRequest__Group_1__4 : rule__ExpectHttpRequest__Group_1__4__Impl ;
    public final void rule__ExpectHttpRequest__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2855:1: ( rule__ExpectHttpRequest__Group_1__4__Impl )
            // InternalBromium.g:2856:2: rule__ExpectHttpRequest__Group_1__4__Impl
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
    // InternalBromium.g:2862:1: rule__ExpectHttpRequest__Group_1__4__Impl : ( 'request' ) ;
    public final void rule__ExpectHttpRequest__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2866:1: ( ( 'request' ) )
            // InternalBromium.g:2867:1: ( 'request' )
            {
            // InternalBromium.g:2867:1: ( 'request' )
            // InternalBromium.g:2868:2: 'request'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getRequestKeyword_1_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBromium.g:2878:1: rule__ElementByCssToBePresent__Group__0 : rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 ;
    public final void rule__ElementByCssToBePresent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2882:1: ( rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 )
            // InternalBromium.g:2883:2: rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:2890:1: rule__ElementByCssToBePresent__Group__0__Impl : ( 'element' ) ;
    public final void rule__ElementByCssToBePresent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2894:1: ( ( 'element' ) )
            // InternalBromium.g:2895:1: ( 'element' )
            {
            // InternalBromium.g:2895:1: ( 'element' )
            // InternalBromium.g:2896:2: 'element'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getElementKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:2905:1: rule__ElementByCssToBePresent__Group__1 : rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 ;
    public final void rule__ElementByCssToBePresent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2909:1: ( rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 )
            // InternalBromium.g:2910:2: rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBromium.g:2917:1: rule__ElementByCssToBePresent__Group__1__Impl : ( 'with' ) ;
    public final void rule__ElementByCssToBePresent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2921:1: ( ( 'with' ) )
            // InternalBromium.g:2922:1: ( 'with' )
            {
            // InternalBromium.g:2922:1: ( 'with' )
            // InternalBromium.g:2923:2: 'with'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getWithKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:2932:1: rule__ElementByCssToBePresent__Group__2 : rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 ;
    public final void rule__ElementByCssToBePresent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2936:1: ( rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 )
            // InternalBromium.g:2937:2: rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3
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
    // InternalBromium.g:2944:1: rule__ElementByCssToBePresent__Group__2__Impl : ( 'css' ) ;
    public final void rule__ElementByCssToBePresent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2948:1: ( ( 'css' ) )
            // InternalBromium.g:2949:1: ( 'css' )
            {
            // InternalBromium.g:2949:1: ( 'css' )
            // InternalBromium.g:2950:2: 'css'
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
    // InternalBromium.g:2959:1: rule__ElementByCssToBePresent__Group__3 : rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 ;
    public final void rule__ElementByCssToBePresent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2963:1: ( rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 )
            // InternalBromium.g:2964:2: rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:2971:1: rule__ElementByCssToBePresent__Group__3__Impl : ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2975:1: ( ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:2976:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:2976:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:2977:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:2978:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            // InternalBromium.g:2978:3: rule__ElementByCssToBePresent__ParameterNamesAssignment_3
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
    // InternalBromium.g:2986:1: rule__ElementByCssToBePresent__Group__4 : rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 ;
    public final void rule__ElementByCssToBePresent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2990:1: ( rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 )
            // InternalBromium.g:2991:2: rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalBromium.g:2998:1: rule__ElementByCssToBePresent__Group__4__Impl : ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3002:1: ( ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:3003:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:3003:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:3004:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:3005:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            // InternalBromium.g:3005:3: rule__ElementByCssToBePresent__ParameterValuesAssignment_4
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
    // InternalBromium.g:3013:1: rule__ElementByCssToBePresent__Group__5 : rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 ;
    public final void rule__ElementByCssToBePresent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3017:1: ( rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 )
            // InternalBromium.g:3018:2: rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalBromium.g:3025:1: rule__ElementByCssToBePresent__Group__5__Impl : ( 'is' ) ;
    public final void rule__ElementByCssToBePresent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3029:1: ( ( 'is' ) )
            // InternalBromium.g:3030:1: ( 'is' )
            {
            // InternalBromium.g:3030:1: ( 'is' )
            // InternalBromium.g:3031:2: 'is'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getIsKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBromium.g:3040:1: rule__ElementByCssToBePresent__Group__6 : rule__ElementByCssToBePresent__Group__6__Impl ;
    public final void rule__ElementByCssToBePresent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3044:1: ( rule__ElementByCssToBePresent__Group__6__Impl )
            // InternalBromium.g:3045:2: rule__ElementByCssToBePresent__Group__6__Impl
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
    // InternalBromium.g:3051:1: rule__ElementByCssToBePresent__Group__6__Impl : ( 'present' ) ;
    public final void rule__ElementByCssToBePresent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3055:1: ( ( 'present' ) )
            // InternalBromium.g:3056:1: ( 'present' )
            {
            // InternalBromium.g:3056:1: ( 'present' )
            // InternalBromium.g:3057:2: 'present'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getPresentKeyword_6()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBromium.g:3067:1: rule__ClickCssSelector__Group__0 : rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 ;
    public final void rule__ClickCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3071:1: ( rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 )
            // InternalBromium.g:3072:2: rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:3079:1: rule__ClickCssSelector__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3083:1: ( ( 'click' ) )
            // InternalBromium.g:3084:1: ( 'click' )
            {
            // InternalBromium.g:3084:1: ( 'click' )
            // InternalBromium.g:3085:2: 'click'
            {
             before(grammarAccess.getClickCssSelectorAccess().getClickKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:3094:1: rule__ClickCssSelector__Group__1 : rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 ;
    public final void rule__ClickCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3098:1: ( rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 )
            // InternalBromium.g:3099:2: rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:3106:1: rule__ClickCssSelector__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3110:1: ( ( 'on' ) )
            // InternalBromium.g:3111:1: ( 'on' )
            {
            // InternalBromium.g:3111:1: ( 'on' )
            // InternalBromium.g:3112:2: 'on'
            {
             before(grammarAccess.getClickCssSelectorAccess().getOnKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBromium.g:3121:1: rule__ClickCssSelector__Group__2 : rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 ;
    public final void rule__ClickCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3125:1: ( rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 )
            // InternalBromium.g:3126:2: rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:3133:1: rule__ClickCssSelector__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3137:1: ( ( 'element' ) )
            // InternalBromium.g:3138:1: ( 'element' )
            {
            // InternalBromium.g:3138:1: ( 'element' )
            // InternalBromium.g:3139:2: 'element'
            {
             before(grammarAccess.getClickCssSelectorAccess().getElementKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:3148:1: rule__ClickCssSelector__Group__3 : rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 ;
    public final void rule__ClickCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3152:1: ( rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 )
            // InternalBromium.g:3153:2: rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalBromium.g:3160:1: rule__ClickCssSelector__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3164:1: ( ( 'with' ) )
            // InternalBromium.g:3165:1: ( 'with' )
            {
            // InternalBromium.g:3165:1: ( 'with' )
            // InternalBromium.g:3166:2: 'with'
            {
             before(grammarAccess.getClickCssSelectorAccess().getWithKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:3175:1: rule__ClickCssSelector__Group__4 : rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 ;
    public final void rule__ClickCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3179:1: ( rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 )
            // InternalBromium.g:3180:2: rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5
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
    // InternalBromium.g:3187:1: rule__ClickCssSelector__Group__4__Impl : ( 'css' ) ;
    public final void rule__ClickCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3191:1: ( ( 'css' ) )
            // InternalBromium.g:3192:1: ( 'css' )
            {
            // InternalBromium.g:3192:1: ( 'css' )
            // InternalBromium.g:3193:2: 'css'
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
    // InternalBromium.g:3202:1: rule__ClickCssSelector__Group__5 : rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 ;
    public final void rule__ClickCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3206:1: ( rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 )
            // InternalBromium.g:3207:2: rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3214:1: rule__ClickCssSelector__Group__5__Impl : ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) ;
    public final void rule__ClickCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3218:1: ( ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) )
            // InternalBromium.g:3219:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            {
            // InternalBromium.g:3219:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            // InternalBromium.g:3220:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesAssignment_5()); 
            // InternalBromium.g:3221:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            // InternalBromium.g:3221:3: rule__ClickCssSelector__ParameterNamesAssignment_5
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
    // InternalBromium.g:3229:1: rule__ClickCssSelector__Group__6 : rule__ClickCssSelector__Group__6__Impl ;
    public final void rule__ClickCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3233:1: ( rule__ClickCssSelector__Group__6__Impl )
            // InternalBromium.g:3234:2: rule__ClickCssSelector__Group__6__Impl
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
    // InternalBromium.g:3240:1: rule__ClickCssSelector__Group__6__Impl : ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) ;
    public final void rule__ClickCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3244:1: ( ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) )
            // InternalBromium.g:3245:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            {
            // InternalBromium.g:3245:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            // InternalBromium.g:3246:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterValuesAssignment_6()); 
            // InternalBromium.g:3247:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            // InternalBromium.g:3247:3: rule__ClickCssSelector__ParameterValuesAssignment_6
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
    // InternalBromium.g:3256:1: rule__PageLoad__Group__0 : rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 ;
    public final void rule__PageLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3260:1: ( rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 )
            // InternalBromium.g:3261:2: rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1
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
    // InternalBromium.g:3268:1: rule__PageLoad__Group__0__Impl : ( 'load' ) ;
    public final void rule__PageLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3272:1: ( ( 'load' ) )
            // InternalBromium.g:3273:1: ( 'load' )
            {
            // InternalBromium.g:3273:1: ( 'load' )
            // InternalBromium.g:3274:2: 'load'
            {
             before(grammarAccess.getPageLoadAccess().getLoadKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBromium.g:3283:1: rule__PageLoad__Group__1 : rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 ;
    public final void rule__PageLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3287:1: ( rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 )
            // InternalBromium.g:3288:2: rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3295:1: rule__PageLoad__Group__1__Impl : ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) ;
    public final void rule__PageLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3299:1: ( ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:3300:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:3300:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:3301:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:3302:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            // InternalBromium.g:3302:3: rule__PageLoad__ParameterNamesAssignment_1
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
    // InternalBromium.g:3310:1: rule__PageLoad__Group__2 : rule__PageLoad__Group__2__Impl ;
    public final void rule__PageLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3314:1: ( rule__PageLoad__Group__2__Impl )
            // InternalBromium.g:3315:2: rule__PageLoad__Group__2__Impl
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
    // InternalBromium.g:3321:1: rule__PageLoad__Group__2__Impl : ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) ;
    public final void rule__PageLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3325:1: ( ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:3326:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:3326:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:3327:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:3328:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            // InternalBromium.g:3328:3: rule__PageLoad__ParameterValuesAssignment_2
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
    // InternalBromium.g:3337:1: rule__TypeTextInElementFoundByCssSelector__Group__0 : rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3341:1: ( rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 )
            // InternalBromium.g:3342:2: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:3349:1: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3353:1: ( ( 'type' ) )
            // InternalBromium.g:3354:1: ( 'type' )
            {
            // InternalBromium.g:3354:1: ( 'type' )
            // InternalBromium.g:3355:2: 'type'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBromium.g:3364:1: rule__TypeTextInElementFoundByCssSelector__Group__1 : rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3368:1: ( rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 )
            // InternalBromium.g:3369:2: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3376:1: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3380:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:3381:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:3381:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:3382:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:3383:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:3383:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1
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
    // InternalBromium.g:3391:1: rule__TypeTextInElementFoundByCssSelector__Group__2 : rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3395:1: ( rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 )
            // InternalBromium.g:3396:2: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3
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
    // InternalBromium.g:3403:1: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3407:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:3408:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:3408:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:3409:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:3410:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:3410:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2
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
    // InternalBromium.g:3418:1: rule__TypeTextInElementFoundByCssSelector__Group__3 : rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3422:1: ( rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 )
            // InternalBromium.g:3423:2: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:3430:1: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl : ( 'in' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3434:1: ( ( 'in' ) )
            // InternalBromium.g:3435:1: ( 'in' )
            {
            // InternalBromium.g:3435:1: ( 'in' )
            // InternalBromium.g:3436:2: 'in'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBromium.g:3445:1: rule__TypeTextInElementFoundByCssSelector__Group__4 : rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3449:1: ( rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 )
            // InternalBromium.g:3450:2: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:3457:1: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl : ( 'element' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3461:1: ( ( 'element' ) )
            // InternalBromium.g:3462:1: ( 'element' )
            {
            // InternalBromium.g:3462:1: ( 'element' )
            // InternalBromium.g:3463:2: 'element'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:3472:1: rule__TypeTextInElementFoundByCssSelector__Group__5 : rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3476:1: ( rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 )
            // InternalBromium.g:3477:2: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalBromium.g:3484:1: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl : ( 'with' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3488:1: ( ( 'with' ) )
            // InternalBromium.g:3489:1: ( 'with' )
            {
            // InternalBromium.g:3489:1: ( 'with' )
            // InternalBromium.g:3490:2: 'with'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:3499:1: rule__TypeTextInElementFoundByCssSelector__Group__6 : rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3503:1: ( rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 )
            // InternalBromium.g:3504:2: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7
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
    // InternalBromium.g:3511:1: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl : ( 'css' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3515:1: ( ( 'css' ) )
            // InternalBromium.g:3516:1: ( 'css' )
            {
            // InternalBromium.g:3516:1: ( 'css' )
            // InternalBromium.g:3517:2: 'css'
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
    // InternalBromium.g:3526:1: rule__TypeTextInElementFoundByCssSelector__Group__7 : rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3530:1: ( rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 )
            // InternalBromium.g:3531:2: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3538:1: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3542:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:3543:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:3543:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:3544:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:3545:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            // InternalBromium.g:3545:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7
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
    // InternalBromium.g:3553:1: rule__TypeTextInElementFoundByCssSelector__Group__8 : rule__TypeTextInElementFoundByCssSelector__Group__8__Impl ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3557:1: ( rule__TypeTextInElementFoundByCssSelector__Group__8__Impl )
            // InternalBromium.g:3558:2: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl
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
    // InternalBromium.g:3564:1: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3568:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:3569:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:3569:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:3570:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:3571:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            // InternalBromium.g:3571:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8
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
    // InternalBromium.g:3580:1: rule__TextOfElementWithCssSelectorToBe__Group__0 : rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3584:1: ( rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 )
            // InternalBromium.g:3585:2: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:3592:1: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl : ( 'element' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3596:1: ( ( 'element' ) )
            // InternalBromium.g:3597:1: ( 'element' )
            {
            // InternalBromium.g:3597:1: ( 'element' )
            // InternalBromium.g:3598:2: 'element'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getElementKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:3607:1: rule__TextOfElementWithCssSelectorToBe__Group__1 : rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3611:1: ( rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 )
            // InternalBromium.g:3612:2: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBromium.g:3619:1: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl : ( 'with' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3623:1: ( ( 'with' ) )
            // InternalBromium.g:3624:1: ( 'with' )
            {
            // InternalBromium.g:3624:1: ( 'with' )
            // InternalBromium.g:3625:2: 'with'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getWithKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:3634:1: rule__TextOfElementWithCssSelectorToBe__Group__2 : rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3638:1: ( rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 )
            // InternalBromium.g:3639:2: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3
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
    // InternalBromium.g:3646:1: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl : ( 'css' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3650:1: ( ( 'css' ) )
            // InternalBromium.g:3651:1: ( 'css' )
            {
            // InternalBromium.g:3651:1: ( 'css' )
            // InternalBromium.g:3652:2: 'css'
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
    // InternalBromium.g:3661:1: rule__TextOfElementWithCssSelectorToBe__Group__3 : rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3665:1: ( rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 )
            // InternalBromium.g:3666:2: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3673:1: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3677:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:3678:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:3678:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:3679:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:3680:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            // InternalBromium.g:3680:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3
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
    // InternalBromium.g:3688:1: rule__TextOfElementWithCssSelectorToBe__Group__4 : rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3692:1: ( rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 )
            // InternalBromium.g:3693:2: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5
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
    // InternalBromium.g:3700:1: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3704:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:3705:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:3705:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:3706:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:3707:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            // InternalBromium.g:3707:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4
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
    // InternalBromium.g:3715:1: rule__TextOfElementWithCssSelectorToBe__Group__5 : rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3719:1: ( rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 )
            // InternalBromium.g:3720:2: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:3727:1: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl : ( 'has' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3731:1: ( ( 'has' ) )
            // InternalBromium.g:3732:1: ( 'has' )
            {
            // InternalBromium.g:3732:1: ( 'has' )
            // InternalBromium.g:3733:2: 'has'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getHasKeyword_5()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBromium.g:3742:1: rule__TextOfElementWithCssSelectorToBe__Group__6 : rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3746:1: ( rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 )
            // InternalBromium.g:3747:2: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3754:1: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3758:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) )
            // InternalBromium.g:3759:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            {
            // InternalBromium.g:3759:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            // InternalBromium.g:3760:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_6()); 
            // InternalBromium.g:3761:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            // InternalBromium.g:3761:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6
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
    // InternalBromium.g:3769:1: rule__TextOfElementWithCssSelectorToBe__Group__7 : rule__TextOfElementWithCssSelectorToBe__Group__7__Impl ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3773:1: ( rule__TextOfElementWithCssSelectorToBe__Group__7__Impl )
            // InternalBromium.g:3774:2: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl
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
    // InternalBromium.g:3780:1: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3784:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) )
            // InternalBromium.g:3785:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            {
            // InternalBromium.g:3785:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            // InternalBromium.g:3786:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_7()); 
            // InternalBromium.g:3787:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            // InternalBromium.g:3787:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7
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
    // InternalBromium.g:3796:1: rule__ClickClassByText__Group__0 : rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 ;
    public final void rule__ClickClassByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3800:1: ( rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 )
            // InternalBromium.g:3801:2: rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:3808:1: rule__ClickClassByText__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickClassByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3812:1: ( ( 'click' ) )
            // InternalBromium.g:3813:1: ( 'click' )
            {
            // InternalBromium.g:3813:1: ( 'click' )
            // InternalBromium.g:3814:2: 'click'
            {
             before(grammarAccess.getClickClassByTextAccess().getClickKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:3823:1: rule__ClickClassByText__Group__1 : rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 ;
    public final void rule__ClickClassByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3827:1: ( rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 )
            // InternalBromium.g:3828:2: rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:3835:1: rule__ClickClassByText__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickClassByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3839:1: ( ( 'on' ) )
            // InternalBromium.g:3840:1: ( 'on' )
            {
            // InternalBromium.g:3840:1: ( 'on' )
            // InternalBromium.g:3841:2: 'on'
            {
             before(grammarAccess.getClickClassByTextAccess().getOnKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBromium.g:3850:1: rule__ClickClassByText__Group__2 : rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 ;
    public final void rule__ClickClassByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3854:1: ( rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 )
            // InternalBromium.g:3855:2: rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:3862:1: rule__ClickClassByText__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickClassByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3866:1: ( ( 'element' ) )
            // InternalBromium.g:3867:1: ( 'element' )
            {
            // InternalBromium.g:3867:1: ( 'element' )
            // InternalBromium.g:3868:2: 'element'
            {
             before(grammarAccess.getClickClassByTextAccess().getElementKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:3877:1: rule__ClickClassByText__Group__3 : rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 ;
    public final void rule__ClickClassByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3881:1: ( rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 )
            // InternalBromium.g:3882:2: rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4
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
    // InternalBromium.g:3889:1: rule__ClickClassByText__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickClassByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3893:1: ( ( 'with' ) )
            // InternalBromium.g:3894:1: ( 'with' )
            {
            // InternalBromium.g:3894:1: ( 'with' )
            // InternalBromium.g:3895:2: 'with'
            {
             before(grammarAccess.getClickClassByTextAccess().getWithKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:3904:1: rule__ClickClassByText__Group__4 : rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 ;
    public final void rule__ClickClassByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3908:1: ( rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 )
            // InternalBromium.g:3909:2: rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3916:1: rule__ClickClassByText__Group__4__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickClassByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3920:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:3921:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:3921:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:3922:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:3923:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            // InternalBromium.g:3923:3: rule__ClickClassByText__ParameterNamesAssignment_4
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
    // InternalBromium.g:3931:1: rule__ClickClassByText__Group__5 : rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 ;
    public final void rule__ClickClassByText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3935:1: ( rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 )
            // InternalBromium.g:3936:2: rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalBromium.g:3943:1: rule__ClickClassByText__Group__5__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickClassByText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3947:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:3948:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:3948:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:3949:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:3950:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            // InternalBromium.g:3950:3: rule__ClickClassByText__ParameterValuesAssignment_5
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
    // InternalBromium.g:3958:1: rule__ClickClassByText__Group__6 : rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 ;
    public final void rule__ClickClassByText__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3962:1: ( rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 )
            // InternalBromium.g:3963:2: rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:3970:1: rule__ClickClassByText__Group__6__Impl : ( 'and' ) ;
    public final void rule__ClickClassByText__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3974:1: ( ( 'and' ) )
            // InternalBromium.g:3975:1: ( 'and' )
            {
            // InternalBromium.g:3975:1: ( 'and' )
            // InternalBromium.g:3976:2: 'and'
            {
             before(grammarAccess.getClickClassByTextAccess().getAndKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBromium.g:3985:1: rule__ClickClassByText__Group__7 : rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 ;
    public final void rule__ClickClassByText__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3989:1: ( rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 )
            // InternalBromium.g:3990:2: rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:3997:1: rule__ClickClassByText__Group__7__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) ;
    public final void rule__ClickClassByText__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4001:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:4002:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:4002:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:4003:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:4004:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            // InternalBromium.g:4004:3: rule__ClickClassByText__ParameterNamesAssignment_7
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
    // InternalBromium.g:4012:1: rule__ClickClassByText__Group__8 : rule__ClickClassByText__Group__8__Impl ;
    public final void rule__ClickClassByText__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4016:1: ( rule__ClickClassByText__Group__8__Impl )
            // InternalBromium.g:4017:2: rule__ClickClassByText__Group__8__Impl
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
    // InternalBromium.g:4023:1: rule__ClickClassByText__Group__8__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) ;
    public final void rule__ClickClassByText__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4027:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:4028:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:4028:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:4029:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:4030:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            // InternalBromium.g:4030:3: rule__ClickClassByText__ParameterValuesAssignment_8
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
    // InternalBromium.g:4039:1: rule__SetVariableToTextOfElementWithCssSelector__Group__0 : rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4043:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1 )
            // InternalBromium.g:4044:2: rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1
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
    // InternalBromium.g:4051:1: rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4055:1: ( ( 'set' ) )
            // InternalBromium.g:4056:1: ( 'set' )
            {
            // InternalBromium.g:4056:1: ( 'set' )
            // InternalBromium.g:4057:2: 'set'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getSetKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBromium.g:4066:1: rule__SetVariableToTextOfElementWithCssSelector__Group__1 : rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4070:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2 )
            // InternalBromium.g:4071:2: rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:4078:1: rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4082:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:4083:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:4083:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:4084:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:4085:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:4085:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1
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
    // InternalBromium.g:4093:1: rule__SetVariableToTextOfElementWithCssSelector__Group__2 : rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4097:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3 )
            // InternalBromium.g:4098:2: rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3
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
    // InternalBromium.g:4105:1: rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4109:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:4110:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:4110:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:4111:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:4112:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:4112:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2
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
    // InternalBromium.g:4120:1: rule__SetVariableToTextOfElementWithCssSelector__Group__3 : rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4124:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4 )
            // InternalBromium.g:4125:2: rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4
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
    // InternalBromium.g:4132:1: rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl : ( 'to' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4136:1: ( ( 'to' ) )
            // InternalBromium.g:4137:1: ( 'to' )
            {
            // InternalBromium.g:4137:1: ( 'to' )
            // InternalBromium.g:4138:2: 'to'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getToKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBromium.g:4147:1: rule__SetVariableToTextOfElementWithCssSelector__Group__4 : rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4151:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5 )
            // InternalBromium.g:4152:2: rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:4159:1: rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl : ( 'the' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4163:1: ( ( 'the' ) )
            // InternalBromium.g:4164:1: ( 'the' )
            {
            // InternalBromium.g:4164:1: ( 'the' )
            // InternalBromium.g:4165:2: 'the'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTheKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBromium.g:4174:1: rule__SetVariableToTextOfElementWithCssSelector__Group__5 : rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4178:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6 )
            // InternalBromium.g:4179:2: rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6
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
    // InternalBromium.g:4186:1: rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl : ( 'text' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4190:1: ( ( 'text' ) )
            // InternalBromium.g:4191:1: ( 'text' )
            {
            // InternalBromium.g:4191:1: ( 'text' )
            // InternalBromium.g:4192:2: 'text'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTextKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:4201:1: rule__SetVariableToTextOfElementWithCssSelector__Group__6 : rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4205:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7 )
            // InternalBromium.g:4206:2: rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:4213:1: rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl : ( 'of' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4217:1: ( ( 'of' ) )
            // InternalBromium.g:4218:1: ( 'of' )
            {
            // InternalBromium.g:4218:1: ( 'of' )
            // InternalBromium.g:4219:2: 'of'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getOfKeyword_6()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBromium.g:4228:1: rule__SetVariableToTextOfElementWithCssSelector__Group__7 : rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4232:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8 )
            // InternalBromium.g:4233:2: rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:4240:1: rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl : ( 'element' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4244:1: ( ( 'element' ) )
            // InternalBromium.g:4245:1: ( 'element' )
            {
            // InternalBromium.g:4245:1: ( 'element' )
            // InternalBromium.g:4246:2: 'element'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getElementKeyword_7()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:4255:1: rule__SetVariableToTextOfElementWithCssSelector__Group__8 : rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4259:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9 )
            // InternalBromium.g:4260:2: rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalBromium.g:4267:1: rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl : ( 'with' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4271:1: ( ( 'with' ) )
            // InternalBromium.g:4272:1: ( 'with' )
            {
            // InternalBromium.g:4272:1: ( 'with' )
            // InternalBromium.g:4273:2: 'with'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getWithKeyword_8()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:4282:1: rule__SetVariableToTextOfElementWithCssSelector__Group__9 : rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4286:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10 )
            // InternalBromium.g:4287:2: rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10
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
    // InternalBromium.g:4294:1: rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl : ( 'css' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4298:1: ( ( 'css' ) )
            // InternalBromium.g:4299:1: ( 'css' )
            {
            // InternalBromium.g:4299:1: ( 'css' )
            // InternalBromium.g:4300:2: 'css'
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
    // InternalBromium.g:4309:1: rule__SetVariableToTextOfElementWithCssSelector__Group__10 : rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4313:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11 )
            // InternalBromium.g:4314:2: rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:4321:1: rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4325:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) ) )
            // InternalBromium.g:4326:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) )
            {
            // InternalBromium.g:4326:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) )
            // InternalBromium.g:4327:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_10()); 
            // InternalBromium.g:4328:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 )
            // InternalBromium.g:4328:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10
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
    // InternalBromium.g:4336:1: rule__SetVariableToTextOfElementWithCssSelector__Group__11 : rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4340:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl )
            // InternalBromium.g:4341:2: rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl
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
    // InternalBromium.g:4347:1: rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4351:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) ) )
            // InternalBromium.g:4352:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) )
            {
            // InternalBromium.g:4352:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) )
            // InternalBromium.g:4353:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_11()); 
            // InternalBromium.g:4354:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 )
            // InternalBromium.g:4354:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11
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
    // InternalBromium.g:4363:1: rule__ClickDataId__Group__0 : rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 ;
    public final void rule__ClickDataId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4367:1: ( rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 )
            // InternalBromium.g:4368:2: rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:4375:1: rule__ClickDataId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickDataId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4379:1: ( ( 'click' ) )
            // InternalBromium.g:4380:1: ( 'click' )
            {
            // InternalBromium.g:4380:1: ( 'click' )
            // InternalBromium.g:4381:2: 'click'
            {
             before(grammarAccess.getClickDataIdAccess().getClickKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:4390:1: rule__ClickDataId__Group__1 : rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 ;
    public final void rule__ClickDataId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4394:1: ( rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 )
            // InternalBromium.g:4395:2: rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:4402:1: rule__ClickDataId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickDataId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4406:1: ( ( 'on' ) )
            // InternalBromium.g:4407:1: ( 'on' )
            {
            // InternalBromium.g:4407:1: ( 'on' )
            // InternalBromium.g:4408:2: 'on'
            {
             before(grammarAccess.getClickDataIdAccess().getOnKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBromium.g:4417:1: rule__ClickDataId__Group__2 : rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 ;
    public final void rule__ClickDataId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4421:1: ( rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 )
            // InternalBromium.g:4422:2: rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:4429:1: rule__ClickDataId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickDataId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4433:1: ( ( 'element' ) )
            // InternalBromium.g:4434:1: ( 'element' )
            {
            // InternalBromium.g:4434:1: ( 'element' )
            // InternalBromium.g:4435:2: 'element'
            {
             before(grammarAccess.getClickDataIdAccess().getElementKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:4444:1: rule__ClickDataId__Group__3 : rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 ;
    public final void rule__ClickDataId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4448:1: ( rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 )
            // InternalBromium.g:4449:2: rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4
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
    // InternalBromium.g:4456:1: rule__ClickDataId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickDataId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4460:1: ( ( 'with' ) )
            // InternalBromium.g:4461:1: ( 'with' )
            {
            // InternalBromium.g:4461:1: ( 'with' )
            // InternalBromium.g:4462:2: 'with'
            {
             before(grammarAccess.getClickDataIdAccess().getWithKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:4471:1: rule__ClickDataId__Group__4 : rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 ;
    public final void rule__ClickDataId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4475:1: ( rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 )
            // InternalBromium.g:4476:2: rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:4483:1: rule__ClickDataId__Group__4__Impl : ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickDataId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4487:1: ( ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4488:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4488:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4489:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4490:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            // InternalBromium.g:4490:3: rule__ClickDataId__ParameterNamesAssignment_4
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
    // InternalBromium.g:4498:1: rule__ClickDataId__Group__5 : rule__ClickDataId__Group__5__Impl ;
    public final void rule__ClickDataId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4502:1: ( rule__ClickDataId__Group__5__Impl )
            // InternalBromium.g:4503:2: rule__ClickDataId__Group__5__Impl
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
    // InternalBromium.g:4509:1: rule__ClickDataId__Group__5__Impl : ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickDataId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4513:1: ( ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4514:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4514:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4515:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4516:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            // InternalBromium.g:4516:3: rule__ClickDataId__ParameterValuesAssignment_5
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
    // InternalBromium.g:4525:1: rule__ConfirmAlert__Group__0 : rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 ;
    public final void rule__ConfirmAlert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4529:1: ( rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 )
            // InternalBromium.g:4530:2: rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1
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
    // InternalBromium.g:4537:1: rule__ConfirmAlert__Group__0__Impl : ( 'to' ) ;
    public final void rule__ConfirmAlert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4541:1: ( ( 'to' ) )
            // InternalBromium.g:4542:1: ( 'to' )
            {
            // InternalBromium.g:4542:1: ( 'to' )
            // InternalBromium.g:4543:2: 'to'
            {
             before(grammarAccess.getConfirmAlertAccess().getToKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBromium.g:4552:1: rule__ConfirmAlert__Group__1 : rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 ;
    public final void rule__ConfirmAlert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4556:1: ( rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 )
            // InternalBromium.g:4557:2: rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:4564:1: rule__ConfirmAlert__Group__1__Impl : ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) ;
    public final void rule__ConfirmAlert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4568:1: ( ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:4569:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:4569:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:4570:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:4571:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            // InternalBromium.g:4571:3: rule__ConfirmAlert__ParameterNamesAssignment_1
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
    // InternalBromium.g:4579:1: rule__ConfirmAlert__Group__2 : rule__ConfirmAlert__Group__2__Impl ;
    public final void rule__ConfirmAlert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4583:1: ( rule__ConfirmAlert__Group__2__Impl )
            // InternalBromium.g:4584:2: rule__ConfirmAlert__Group__2__Impl
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
    // InternalBromium.g:4590:1: rule__ConfirmAlert__Group__2__Impl : ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) ;
    public final void rule__ConfirmAlert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4594:1: ( ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:4595:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:4595:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:4596:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:4597:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            // InternalBromium.g:4597:3: rule__ConfirmAlert__ParameterValuesAssignment_2
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
    // InternalBromium.g:4606:1: rule__ClickId__Group__0 : rule__ClickId__Group__0__Impl rule__ClickId__Group__1 ;
    public final void rule__ClickId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4610:1: ( rule__ClickId__Group__0__Impl rule__ClickId__Group__1 )
            // InternalBromium.g:4611:2: rule__ClickId__Group__0__Impl rule__ClickId__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:4618:1: rule__ClickId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4622:1: ( ( 'click' ) )
            // InternalBromium.g:4623:1: ( 'click' )
            {
            // InternalBromium.g:4623:1: ( 'click' )
            // InternalBromium.g:4624:2: 'click'
            {
             before(grammarAccess.getClickIdAccess().getClickKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:4633:1: rule__ClickId__Group__1 : rule__ClickId__Group__1__Impl rule__ClickId__Group__2 ;
    public final void rule__ClickId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4637:1: ( rule__ClickId__Group__1__Impl rule__ClickId__Group__2 )
            // InternalBromium.g:4638:2: rule__ClickId__Group__1__Impl rule__ClickId__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:4645:1: rule__ClickId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4649:1: ( ( 'on' ) )
            // InternalBromium.g:4650:1: ( 'on' )
            {
            // InternalBromium.g:4650:1: ( 'on' )
            // InternalBromium.g:4651:2: 'on'
            {
             before(grammarAccess.getClickIdAccess().getOnKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBromium.g:4660:1: rule__ClickId__Group__2 : rule__ClickId__Group__2__Impl rule__ClickId__Group__3 ;
    public final void rule__ClickId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4664:1: ( rule__ClickId__Group__2__Impl rule__ClickId__Group__3 )
            // InternalBromium.g:4665:2: rule__ClickId__Group__2__Impl rule__ClickId__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:4672:1: rule__ClickId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4676:1: ( ( 'element' ) )
            // InternalBromium.g:4677:1: ( 'element' )
            {
            // InternalBromium.g:4677:1: ( 'element' )
            // InternalBromium.g:4678:2: 'element'
            {
             before(grammarAccess.getClickIdAccess().getElementKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:4687:1: rule__ClickId__Group__3 : rule__ClickId__Group__3__Impl rule__ClickId__Group__4 ;
    public final void rule__ClickId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4691:1: ( rule__ClickId__Group__3__Impl rule__ClickId__Group__4 )
            // InternalBromium.g:4692:2: rule__ClickId__Group__3__Impl rule__ClickId__Group__4
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
    // InternalBromium.g:4699:1: rule__ClickId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4703:1: ( ( 'with' ) )
            // InternalBromium.g:4704:1: ( 'with' )
            {
            // InternalBromium.g:4704:1: ( 'with' )
            // InternalBromium.g:4705:2: 'with'
            {
             before(grammarAccess.getClickIdAccess().getWithKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:4714:1: rule__ClickId__Group__4 : rule__ClickId__Group__4__Impl rule__ClickId__Group__5 ;
    public final void rule__ClickId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4718:1: ( rule__ClickId__Group__4__Impl rule__ClickId__Group__5 )
            // InternalBromium.g:4719:2: rule__ClickId__Group__4__Impl rule__ClickId__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:4726:1: rule__ClickId__Group__4__Impl : ( ( rule__ClickId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4730:1: ( ( ( rule__ClickId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4731:1: ( ( rule__ClickId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4731:1: ( ( rule__ClickId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4732:2: ( rule__ClickId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4733:2: ( rule__ClickId__ParameterNamesAssignment_4 )
            // InternalBromium.g:4733:3: rule__ClickId__ParameterNamesAssignment_4
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
    // InternalBromium.g:4741:1: rule__ClickId__Group__5 : rule__ClickId__Group__5__Impl ;
    public final void rule__ClickId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4745:1: ( rule__ClickId__Group__5__Impl )
            // InternalBromium.g:4746:2: rule__ClickId__Group__5__Impl
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
    // InternalBromium.g:4752:1: rule__ClickId__Group__5__Impl : ( ( rule__ClickId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4756:1: ( ( ( rule__ClickId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4757:1: ( ( rule__ClickId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4757:1: ( ( rule__ClickId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4758:2: ( rule__ClickId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4759:2: ( rule__ClickId__ParameterValuesAssignment_5 )
            // InternalBromium.g:4759:3: rule__ClickId__ParameterValuesAssignment_5
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
    // InternalBromium.g:4768:1: rule__ClickName__Group__0 : rule__ClickName__Group__0__Impl rule__ClickName__Group__1 ;
    public final void rule__ClickName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4772:1: ( rule__ClickName__Group__0__Impl rule__ClickName__Group__1 )
            // InternalBromium.g:4773:2: rule__ClickName__Group__0__Impl rule__ClickName__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBromium.g:4780:1: rule__ClickName__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4784:1: ( ( 'click' ) )
            // InternalBromium.g:4785:1: ( 'click' )
            {
            // InternalBromium.g:4785:1: ( 'click' )
            // InternalBromium.g:4786:2: 'click'
            {
             before(grammarAccess.getClickNameAccess().getClickKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBromium.g:4795:1: rule__ClickName__Group__1 : rule__ClickName__Group__1__Impl rule__ClickName__Group__2 ;
    public final void rule__ClickName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4799:1: ( rule__ClickName__Group__1__Impl rule__ClickName__Group__2 )
            // InternalBromium.g:4800:2: rule__ClickName__Group__1__Impl rule__ClickName__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:4807:1: rule__ClickName__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4811:1: ( ( 'on' ) )
            // InternalBromium.g:4812:1: ( 'on' )
            {
            // InternalBromium.g:4812:1: ( 'on' )
            // InternalBromium.g:4813:2: 'on'
            {
             before(grammarAccess.getClickNameAccess().getOnKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBromium.g:4822:1: rule__ClickName__Group__2 : rule__ClickName__Group__2__Impl rule__ClickName__Group__3 ;
    public final void rule__ClickName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4826:1: ( rule__ClickName__Group__2__Impl rule__ClickName__Group__3 )
            // InternalBromium.g:4827:2: rule__ClickName__Group__2__Impl rule__ClickName__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:4834:1: rule__ClickName__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4838:1: ( ( 'element' ) )
            // InternalBromium.g:4839:1: ( 'element' )
            {
            // InternalBromium.g:4839:1: ( 'element' )
            // InternalBromium.g:4840:2: 'element'
            {
             before(grammarAccess.getClickNameAccess().getElementKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:4849:1: rule__ClickName__Group__3 : rule__ClickName__Group__3__Impl rule__ClickName__Group__4 ;
    public final void rule__ClickName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4853:1: ( rule__ClickName__Group__3__Impl rule__ClickName__Group__4 )
            // InternalBromium.g:4854:2: rule__ClickName__Group__3__Impl rule__ClickName__Group__4
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
    // InternalBromium.g:4861:1: rule__ClickName__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4865:1: ( ( 'with' ) )
            // InternalBromium.g:4866:1: ( 'with' )
            {
            // InternalBromium.g:4866:1: ( 'with' )
            // InternalBromium.g:4867:2: 'with'
            {
             before(grammarAccess.getClickNameAccess().getWithKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:4876:1: rule__ClickName__Group__4 : rule__ClickName__Group__4__Impl rule__ClickName__Group__5 ;
    public final void rule__ClickName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4880:1: ( rule__ClickName__Group__4__Impl rule__ClickName__Group__5 )
            // InternalBromium.g:4881:2: rule__ClickName__Group__4__Impl rule__ClickName__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:4888:1: rule__ClickName__Group__4__Impl : ( ( rule__ClickName__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4892:1: ( ( ( rule__ClickName__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4893:1: ( ( rule__ClickName__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4893:1: ( ( rule__ClickName__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4894:2: ( rule__ClickName__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickNameAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4895:2: ( rule__ClickName__ParameterNamesAssignment_4 )
            // InternalBromium.g:4895:3: rule__ClickName__ParameterNamesAssignment_4
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
    // InternalBromium.g:4903:1: rule__ClickName__Group__5 : rule__ClickName__Group__5__Impl ;
    public final void rule__ClickName__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4907:1: ( rule__ClickName__Group__5__Impl )
            // InternalBromium.g:4908:2: rule__ClickName__Group__5__Impl
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
    // InternalBromium.g:4914:1: rule__ClickName__Group__5__Impl : ( ( rule__ClickName__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickName__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4918:1: ( ( ( rule__ClickName__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4919:1: ( ( rule__ClickName__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4919:1: ( ( rule__ClickName__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4920:2: ( rule__ClickName__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickNameAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4921:2: ( rule__ClickName__ParameterValuesAssignment_5 )
            // InternalBromium.g:4921:3: rule__ClickName__ParameterValuesAssignment_5
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
    // InternalBromium.g:4930:1: rule__SelectValue__Group__0 : rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1 ;
    public final void rule__SelectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4934:1: ( rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1 )
            // InternalBromium.g:4935:2: rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1
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
    // InternalBromium.g:4942:1: rule__SelectValue__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4946:1: ( ( 'select' ) )
            // InternalBromium.g:4947:1: ( 'select' )
            {
            // InternalBromium.g:4947:1: ( 'select' )
            // InternalBromium.g:4948:2: 'select'
            {
             before(grammarAccess.getSelectValueAccess().getSelectKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBromium.g:4957:1: rule__SelectValue__Group__1 : rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2 ;
    public final void rule__SelectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4961:1: ( rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2 )
            // InternalBromium.g:4962:2: rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:4969:1: rule__SelectValue__Group__1__Impl : ( ( rule__SelectValue__ParameterNamesAssignment_1 ) ) ;
    public final void rule__SelectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4973:1: ( ( ( rule__SelectValue__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:4974:1: ( ( rule__SelectValue__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:4974:1: ( ( rule__SelectValue__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:4975:2: ( rule__SelectValue__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:4976:2: ( rule__SelectValue__ParameterNamesAssignment_1 )
            // InternalBromium.g:4976:3: rule__SelectValue__ParameterNamesAssignment_1
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
    // InternalBromium.g:4984:1: rule__SelectValue__Group__2 : rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3 ;
    public final void rule__SelectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4988:1: ( rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3 )
            // InternalBromium.g:4989:2: rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3
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
    // InternalBromium.g:4996:1: rule__SelectValue__Group__2__Impl : ( ( rule__SelectValue__ParameterValuesAssignment_2 ) ) ;
    public final void rule__SelectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5000:1: ( ( ( rule__SelectValue__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:5001:1: ( ( rule__SelectValue__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:5001:1: ( ( rule__SelectValue__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:5002:2: ( rule__SelectValue__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:5003:2: ( rule__SelectValue__ParameterValuesAssignment_2 )
            // InternalBromium.g:5003:3: rule__SelectValue__ParameterValuesAssignment_2
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
    // InternalBromium.g:5011:1: rule__SelectValue__Group__3 : rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4 ;
    public final void rule__SelectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5015:1: ( rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4 )
            // InternalBromium.g:5016:2: rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalBromium.g:5023:1: rule__SelectValue__Group__3__Impl : ( 'in' ) ;
    public final void rule__SelectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5027:1: ( ( 'in' ) )
            // InternalBromium.g:5028:1: ( 'in' )
            {
            // InternalBromium.g:5028:1: ( 'in' )
            // InternalBromium.g:5029:2: 'in'
            {
             before(grammarAccess.getSelectValueAccess().getInKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBromium.g:5038:1: rule__SelectValue__Group__4 : rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5 ;
    public final void rule__SelectValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5042:1: ( rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5 )
            // InternalBromium.g:5043:2: rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalBromium.g:5050:1: rule__SelectValue__Group__4__Impl : ( 'element' ) ;
    public final void rule__SelectValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5054:1: ( ( 'element' ) )
            // InternalBromium.g:5055:1: ( 'element' )
            {
            // InternalBromium.g:5055:1: ( 'element' )
            // InternalBromium.g:5056:2: 'element'
            {
             before(grammarAccess.getSelectValueAccess().getElementKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBromium.g:5065:1: rule__SelectValue__Group__5 : rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6 ;
    public final void rule__SelectValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5069:1: ( rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6 )
            // InternalBromium.g:5070:2: rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalBromium.g:5077:1: rule__SelectValue__Group__5__Impl : ( 'with' ) ;
    public final void rule__SelectValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5081:1: ( ( 'with' ) )
            // InternalBromium.g:5082:1: ( 'with' )
            {
            // InternalBromium.g:5082:1: ( 'with' )
            // InternalBromium.g:5083:2: 'with'
            {
             before(grammarAccess.getSelectValueAccess().getWithKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBromium.g:5092:1: rule__SelectValue__Group__6 : rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7 ;
    public final void rule__SelectValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5096:1: ( rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7 )
            // InternalBromium.g:5097:2: rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalBromium.g:5104:1: rule__SelectValue__Group__6__Impl : ( 'css' ) ;
    public final void rule__SelectValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5108:1: ( ( 'css' ) )
            // InternalBromium.g:5109:1: ( 'css' )
            {
            // InternalBromium.g:5109:1: ( 'css' )
            // InternalBromium.g:5110:2: 'css'
            {
             before(grammarAccess.getSelectValueAccess().getCssKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBromium.g:5119:1: rule__SelectValue__Group__7 : rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8 ;
    public final void rule__SelectValue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5123:1: ( rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8 )
            // InternalBromium.g:5124:2: rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:5131:1: rule__SelectValue__Group__7__Impl : ( ( rule__SelectValue__ParameterNamesAssignment_7 ) ) ;
    public final void rule__SelectValue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5135:1: ( ( ( rule__SelectValue__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:5136:1: ( ( rule__SelectValue__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:5136:1: ( ( rule__SelectValue__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:5137:2: ( rule__SelectValue__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:5138:2: ( rule__SelectValue__ParameterNamesAssignment_7 )
            // InternalBromium.g:5138:3: rule__SelectValue__ParameterNamesAssignment_7
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
    // InternalBromium.g:5146:1: rule__SelectValue__Group__8 : rule__SelectValue__Group__8__Impl ;
    public final void rule__SelectValue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5150:1: ( rule__SelectValue__Group__8__Impl )
            // InternalBromium.g:5151:2: rule__SelectValue__Group__8__Impl
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
    // InternalBromium.g:5157:1: rule__SelectValue__Group__8__Impl : ( ( rule__SelectValue__ParameterValuesAssignment_8 ) ) ;
    public final void rule__SelectValue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5161:1: ( ( ( rule__SelectValue__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:5162:1: ( ( rule__SelectValue__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:5162:1: ( ( rule__SelectValue__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:5163:2: ( rule__SelectValue__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:5164:2: ( rule__SelectValue__ParameterValuesAssignment_8 )
            // InternalBromium.g:5164:3: rule__SelectValue__ParameterValuesAssignment_8
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
    // InternalBromium.g:5173:1: rule__Model__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5177:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5178:2: ( RULE_STRING )
            {
            // InternalBromium.g:5178:2: ( RULE_STRING )
            // InternalBromium.g:5179:3: RULE_STRING
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
    // InternalBromium.g:5188:1: rule__Model__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Model__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5192:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5193:2: ( RULE_STRING )
            {
            // InternalBromium.g:5193:2: ( RULE_STRING )
            // InternalBromium.g:5194:3: RULE_STRING
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
    // InternalBromium.g:5203:1: rule__Model__BaseVersionAssignment_4_1 : ( ruleVersion ) ;
    public final void rule__Model__BaseVersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5207:1: ( ( ruleVersion ) )
            // InternalBromium.g:5208:2: ( ruleVersion )
            {
            // InternalBromium.g:5208:2: ( ruleVersion )
            // InternalBromium.g:5209:3: ruleVersion
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
    // InternalBromium.g:5218:1: rule__Model__ActionsAssignment_7 : ( ruleApplicationAction ) ;
    public final void rule__Model__ActionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5222:1: ( ( ruleApplicationAction ) )
            // InternalBromium.g:5223:2: ( ruleApplicationAction )
            {
            // InternalBromium.g:5223:2: ( ruleApplicationAction )
            // InternalBromium.g:5224:3: ruleApplicationAction
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
    // InternalBromium.g:5233:1: rule__ApplicationAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5237:1: ( ( RULE_ID ) )
            // InternalBromium.g:5238:2: ( RULE_ID )
            {
            // InternalBromium.g:5238:2: ( RULE_ID )
            // InternalBromium.g:5239:3: RULE_ID
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
    // InternalBromium.g:5248:1: rule__ApplicationAction__SyntaxDefinitionsAssignment_3 : ( ruleSyntaxDefinition ) ;
    public final void rule__ApplicationAction__SyntaxDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5252:1: ( ( ruleSyntaxDefinition ) )
            // InternalBromium.g:5253:2: ( ruleSyntaxDefinition )
            {
            // InternalBromium.g:5253:2: ( ruleSyntaxDefinition )
            // InternalBromium.g:5254:3: ruleSyntaxDefinition
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
    // InternalBromium.g:5263:1: rule__ApplicationAction__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__ApplicationAction__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5267:1: ( ( rulePrecondition ) )
            // InternalBromium.g:5268:2: ( rulePrecondition )
            {
            // InternalBromium.g:5268:2: ( rulePrecondition )
            // InternalBromium.g:5269:3: rulePrecondition
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
    // InternalBromium.g:5278:1: rule__ApplicationAction__ActionContextAssignment_5 : ( ruleActionContext ) ;
    public final void rule__ApplicationAction__ActionContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5282:1: ( ( ruleActionContext ) )
            // InternalBromium.g:5283:2: ( ruleActionContext )
            {
            // InternalBromium.g:5283:2: ( ruleActionContext )
            // InternalBromium.g:5284:3: ruleActionContext
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
    // InternalBromium.g:5293:1: rule__ApplicationAction__WebDriverActionAssignment_6 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__WebDriverActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5297:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:5298:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:5298:2: ( ruleWebDriverAction )
            // InternalBromium.g:5299:3: ruleWebDriverAction
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
    // InternalBromium.g:5308:1: rule__ApplicationAction__ExpectHttpRequestAssignment_7 : ( ruleExpectHttpRequest ) ;
    public final void rule__ApplicationAction__ExpectHttpRequestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5312:1: ( ( ruleExpectHttpRequest ) )
            // InternalBromium.g:5313:2: ( ruleExpectHttpRequest )
            {
            // InternalBromium.g:5313:2: ( ruleExpectHttpRequest )
            // InternalBromium.g:5314:3: ruleExpectHttpRequest
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
    // InternalBromium.g:5323:1: rule__ApplicationAction__PostconditionAssignment_8 : ( rulePostcondition ) ;
    public final void rule__ApplicationAction__PostconditionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5327:1: ( ( rulePostcondition ) )
            // InternalBromium.g:5328:2: ( rulePostcondition )
            {
            // InternalBromium.g:5328:2: ( rulePostcondition )
            // InternalBromium.g:5329:3: rulePostcondition
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


    // $ANTLR start "rule__WithinContext__ElementLocatorAssignment_3"
    // InternalBromium.g:5338:1: rule__WithinContext__ElementLocatorAssignment_3 : ( ruleLocator ) ;
    public final void rule__WithinContext__ElementLocatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5342:1: ( ( ruleLocator ) )
            // InternalBromium.g:5343:2: ( ruleLocator )
            {
            // InternalBromium.g:5343:2: ( ruleLocator )
            // InternalBromium.g:5344:3: ruleLocator
            {
             before(grammarAccess.getWithinContextAccess().getElementLocatorLocatorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLocator();

            state._fsp--;

             after(grammarAccess.getWithinContextAccess().getElementLocatorLocatorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithinContext__ElementLocatorAssignment_3"


    // $ANTLR start "rule__TableActionContext__TableLocatorAssignment_2"
    // InternalBromium.g:5353:1: rule__TableActionContext__TableLocatorAssignment_2 : ( ruleLocator ) ;
    public final void rule__TableActionContext__TableLocatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5357:1: ( ( ruleLocator ) )
            // InternalBromium.g:5358:2: ( ruleLocator )
            {
            // InternalBromium.g:5358:2: ( ruleLocator )
            // InternalBromium.g:5359:3: ruleLocator
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
    // InternalBromium.g:5368:1: rule__TableActionContext__RowsLocatorAssignment_5 : ( ruleLocator ) ;
    public final void rule__TableActionContext__RowsLocatorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5372:1: ( ( ruleLocator ) )
            // InternalBromium.g:5373:2: ( ruleLocator )
            {
            // InternalBromium.g:5373:2: ( ruleLocator )
            // InternalBromium.g:5374:3: ruleLocator
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
    // InternalBromium.g:5383:1: rule__TableActionContext__RowSelectorAssignment_6 : ( ruleRowSelector ) ;
    public final void rule__TableActionContext__RowSelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5387:1: ( ( ruleRowSelector ) )
            // InternalBromium.g:5388:2: ( ruleRowSelector )
            {
            // InternalBromium.g:5388:2: ( ruleRowSelector )
            // InternalBromium.g:5389:3: ruleRowSelector
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
    // InternalBromium.g:5398:1: rule__RowLocator__RowLocatorAssignment_2 : ( ruleLocator ) ;
    public final void rule__RowLocator__RowLocatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5402:1: ( ( ruleLocator ) )
            // InternalBromium.g:5403:2: ( ruleLocator )
            {
            // InternalBromium.g:5403:2: ( ruleLocator )
            // InternalBromium.g:5404:3: ruleLocator
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
    // InternalBromium.g:5413:1: rule__RowIndex__IndexAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__RowIndex__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5417:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5418:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5418:2: ( ruleParameterValue )
            // InternalBromium.g:5419:3: ruleParameterValue
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
    // InternalBromium.g:5428:1: rule__ClassByText__KlassAssignment_1 : ( ruleParameterValue ) ;
    public final void rule__ClassByText__KlassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5432:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5433:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5433:2: ( ruleParameterValue )
            // InternalBromium.g:5434:3: ruleParameterValue
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
    // InternalBromium.g:5443:1: rule__ClassByText__TextAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ClassByText__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5447:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5448:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5448:2: ( ruleParameterValue )
            // InternalBromium.g:5449:3: ruleParameterValue
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
    // InternalBromium.g:5458:1: rule__CssSelectorByText__SelectorAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__CssSelectorByText__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5462:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5463:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5463:2: ( ruleParameterValue )
            // InternalBromium.g:5464:3: ruleParameterValue
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
    // InternalBromium.g:5473:1: rule__CssSelectorByText__TextAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__CssSelectorByText__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5477:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5478:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5478:2: ( ruleParameterValue )
            // InternalBromium.g:5479:3: ruleParameterValue
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
    // InternalBromium.g:5488:1: rule__CssSelector__SelectorAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__CssSelector__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5492:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5493:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5493:2: ( ruleParameterValue )
            // InternalBromium.g:5494:3: ruleParameterValue
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
    // InternalBromium.g:5503:1: rule__SyntaxDefinition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SyntaxDefinition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5507:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5508:2: ( RULE_STRING )
            {
            // InternalBromium.g:5508:2: ( RULE_STRING )
            // InternalBromium.g:5509:3: RULE_STRING
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
    // InternalBromium.g:5518:1: rule__SyntaxDefinition__ParameterAssignment_2 : ( ruleExposedParameter ) ;
    public final void rule__SyntaxDefinition__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5522:1: ( ( ruleExposedParameter ) )
            // InternalBromium.g:5523:2: ( ruleExposedParameter )
            {
            // InternalBromium.g:5523:2: ( ruleExposedParameter )
            // InternalBromium.g:5524:3: ruleExposedParameter
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
    // InternalBromium.g:5533:1: rule__Precondition__ActionAssignment_1 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Precondition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5537:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:5538:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:5538:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:5539:3: ruleWebDriverActionCondition
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
    // InternalBromium.g:5548:1: rule__Postcondition__ActionAssignment_3 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Postcondition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5552:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:5553:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:5553:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:5554:3: ruleWebDriverActionCondition
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
    // InternalBromium.g:5563:1: rule__ExpectHttpRequest__NotAssignment_1_1 : ( ( 'not' ) ) ;
    public final void rule__ExpectHttpRequest__NotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5567:1: ( ( ( 'not' ) ) )
            // InternalBromium.g:5568:2: ( ( 'not' ) )
            {
            // InternalBromium.g:5568:2: ( ( 'not' ) )
            // InternalBromium.g:5569:3: ( 'not' )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            // InternalBromium.g:5570:3: ( 'not' )
            // InternalBromium.g:5571:4: 'not'
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBromium.g:5582:1: rule__ElementByCssToBePresent__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__ElementByCssToBePresent__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5586:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5587:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5587:2: ( ( 'selector' ) )
            // InternalBromium.g:5588:3: ( 'selector' )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:5589:3: ( 'selector' )
            // InternalBromium.g:5590:4: 'selector'
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:5601:1: rule__ElementByCssToBePresent__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ElementByCssToBePresent__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5605:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5606:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5606:2: ( ruleParameterValue )
            // InternalBromium.g:5607:3: ruleParameterValue
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
    // InternalBromium.g:5616:1: rule__ClickCssSelector__ParameterNamesAssignment_5 : ( ( 'selector' ) ) ;
    public final void rule__ClickCssSelector__ParameterNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5620:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5621:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5621:2: ( ( 'selector' ) )
            // InternalBromium.g:5622:3: ( 'selector' )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            // InternalBromium.g:5623:3: ( 'selector' )
            // InternalBromium.g:5624:4: 'selector'
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:5635:1: rule__ClickCssSelector__ParameterValuesAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__ClickCssSelector__ParameterValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5639:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5640:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5640:2: ( ruleParameterValue )
            // InternalBromium.g:5641:3: ruleParameterValue
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
    // InternalBromium.g:5650:1: rule__PageLoad__ParameterNamesAssignment_1 : ( ( 'page' ) ) ;
    public final void rule__PageLoad__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5654:1: ( ( ( 'page' ) ) )
            // InternalBromium.g:5655:2: ( ( 'page' ) )
            {
            // InternalBromium.g:5655:2: ( ( 'page' ) )
            // InternalBromium.g:5656:3: ( 'page' )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            // InternalBromium.g:5657:3: ( 'page' )
            // InternalBromium.g:5658:4: 'page'
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBromium.g:5669:1: rule__PageLoad__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__PageLoad__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5673:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5674:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5674:2: ( ruleParameterValue )
            // InternalBromium.g:5675:3: ruleParameterValue
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
    // InternalBromium.g:5684:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 : ( ( 'text' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5688:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5689:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5689:2: ( ( 'text' ) )
            // InternalBromium.g:5690:3: ( 'text' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            // InternalBromium.g:5691:3: ( 'text' )
            // InternalBromium.g:5692:4: 'text'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:5703:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5707:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5708:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5708:2: ( ruleParameterValue )
            // InternalBromium.g:5709:3: ruleParameterValue
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
    // InternalBromium.g:5718:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 : ( ( 'selector' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5722:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5723:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5723:2: ( ( 'selector' ) )
            // InternalBromium.g:5724:3: ( 'selector' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            // InternalBromium.g:5725:3: ( 'selector' )
            // InternalBromium.g:5726:4: 'selector'
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:5737:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5741:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5742:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5742:2: ( ruleParameterValue )
            // InternalBromium.g:5743:3: ruleParameterValue
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
    // InternalBromium.g:5752:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5756:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5757:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5757:2: ( ( 'selector' ) )
            // InternalBromium.g:5758:3: ( 'selector' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:5759:3: ( 'selector' )
            // InternalBromium.g:5760:4: 'selector'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:5771:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5775:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5776:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5776:2: ( ruleParameterValue )
            // InternalBromium.g:5777:3: ruleParameterValue
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
    // InternalBromium.g:5786:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 : ( ( 'text' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5790:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5791:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5791:2: ( ( 'text' ) )
            // InternalBromium.g:5792:3: ( 'text' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            // InternalBromium.g:5793:3: ( 'text' )
            // InternalBromium.g:5794:4: 'text'
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:5805:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5809:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5810:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5810:2: ( ruleParameterValue )
            // InternalBromium.g:5811:3: ruleParameterValue
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
    // InternalBromium.g:5820:1: rule__ClickClassByText__ParameterNamesAssignment_4 : ( ( 'class' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5824:1: ( ( ( 'class' ) ) )
            // InternalBromium.g:5825:2: ( ( 'class' ) )
            {
            // InternalBromium.g:5825:2: ( ( 'class' ) )
            // InternalBromium.g:5826:3: ( 'class' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            // InternalBromium.g:5827:3: ( 'class' )
            // InternalBromium.g:5828:4: 'class'
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBromium.g:5839:1: rule__ClickClassByText__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5843:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5844:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5844:2: ( ruleParameterValue )
            // InternalBromium.g:5845:3: ruleParameterValue
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
    // InternalBromium.g:5854:1: rule__ClickClassByText__ParameterNamesAssignment_7 : ( ( 'text' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5858:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5859:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5859:2: ( ( 'text' ) )
            // InternalBromium.g:5860:3: ( 'text' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            // InternalBromium.g:5861:3: ( 'text' )
            // InternalBromium.g:5862:4: 'text'
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBromium.g:5873:1: rule__ClickClassByText__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5877:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5878:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5878:2: ( ruleParameterValue )
            // InternalBromium.g:5879:3: ruleParameterValue
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
    // InternalBromium.g:5888:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 : ( ( 'variable' ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5892:1: ( ( ( 'variable' ) ) )
            // InternalBromium.g:5893:2: ( ( 'variable' ) )
            {
            // InternalBromium.g:5893:2: ( ( 'variable' ) )
            // InternalBromium.g:5894:3: ( 'variable' )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 
            // InternalBromium.g:5895:3: ( 'variable' )
            // InternalBromium.g:5896:4: 'variable'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBromium.g:5907:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5911:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5912:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5912:2: ( ruleParameterValue )
            // InternalBromium.g:5913:3: ruleParameterValue
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
    // InternalBromium.g:5922:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 : ( ( 'selector' ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5926:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5927:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5927:2: ( ( 'selector' ) )
            // InternalBromium.g:5928:3: ( 'selector' )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 
            // InternalBromium.g:5929:3: ( 'selector' )
            // InternalBromium.g:5930:4: 'selector'
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:5941:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 : ( ruleParameterValue ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5945:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5946:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5946:2: ( ruleParameterValue )
            // InternalBromium.g:5947:3: ruleParameterValue
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
    // InternalBromium.g:5956:1: rule__ClickDataId__ParameterNamesAssignment_4 : ( ( 'dataId' ) ) ;
    public final void rule__ClickDataId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5960:1: ( ( ( 'dataId' ) ) )
            // InternalBromium.g:5961:2: ( ( 'dataId' ) )
            {
            // InternalBromium.g:5961:2: ( ( 'dataId' ) )
            // InternalBromium.g:5962:3: ( 'dataId' )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            // InternalBromium.g:5963:3: ( 'dataId' )
            // InternalBromium.g:5964:4: 'dataId'
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBromium.g:5975:1: rule__ClickDataId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickDataId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5979:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5980:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5980:2: ( ruleParameterValue )
            // InternalBromium.g:5981:3: ruleParameterValue
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
    // InternalBromium.g:5990:1: rule__ConfirmAlert__ParameterNamesAssignment_1 : ( ( 'confirm' ) ) ;
    public final void rule__ConfirmAlert__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5994:1: ( ( ( 'confirm' ) ) )
            // InternalBromium.g:5995:2: ( ( 'confirm' ) )
            {
            // InternalBromium.g:5995:2: ( ( 'confirm' ) )
            // InternalBromium.g:5996:3: ( 'confirm' )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            // InternalBromium.g:5997:3: ( 'confirm' )
            // InternalBromium.g:5998:4: 'confirm'
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBromium.g:6009:1: rule__ConfirmAlert__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ConfirmAlert__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6013:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:6014:2: ( ruleParameterValue )
            {
            // InternalBromium.g:6014:2: ( ruleParameterValue )
            // InternalBromium.g:6015:3: ruleParameterValue
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
    // InternalBromium.g:6024:1: rule__ClickId__ParameterNamesAssignment_4 : ( ( 'id' ) ) ;
    public final void rule__ClickId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6028:1: ( ( ( 'id' ) ) )
            // InternalBromium.g:6029:2: ( ( 'id' ) )
            {
            // InternalBromium.g:6029:2: ( ( 'id' ) )
            // InternalBromium.g:6030:3: ( 'id' )
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesIdKeyword_4_0()); 
            // InternalBromium.g:6031:3: ( 'id' )
            // InternalBromium.g:6032:4: 'id'
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
    // InternalBromium.g:6043:1: rule__ClickId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6047:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:6048:2: ( ruleParameterValue )
            {
            // InternalBromium.g:6048:2: ( ruleParameterValue )
            // InternalBromium.g:6049:3: ruleParameterValue
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
    // InternalBromium.g:6058:1: rule__ClickName__ParameterNamesAssignment_4 : ( ( 'name' ) ) ;
    public final void rule__ClickName__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6062:1: ( ( ( 'name' ) ) )
            // InternalBromium.g:6063:2: ( ( 'name' ) )
            {
            // InternalBromium.g:6063:2: ( ( 'name' ) )
            // InternalBromium.g:6064:3: ( 'name' )
            {
             before(grammarAccess.getClickNameAccess().getParameterNamesNameKeyword_4_0()); 
            // InternalBromium.g:6065:3: ( 'name' )
            // InternalBromium.g:6066:4: 'name'
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
    // InternalBromium.g:6077:1: rule__ClickName__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickName__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6081:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:6082:2: ( ruleParameterValue )
            {
            // InternalBromium.g:6082:2: ( ruleParameterValue )
            // InternalBromium.g:6083:3: ruleParameterValue
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
    // InternalBromium.g:6092:1: rule__SelectValue__ParameterNamesAssignment_1 : ( ( 'value' ) ) ;
    public final void rule__SelectValue__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6096:1: ( ( ( 'value' ) ) )
            // InternalBromium.g:6097:2: ( ( 'value' ) )
            {
            // InternalBromium.g:6097:2: ( ( 'value' ) )
            // InternalBromium.g:6098:3: ( 'value' )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesValueKeyword_1_0()); 
            // InternalBromium.g:6099:3: ( 'value' )
            // InternalBromium.g:6100:4: 'value'
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesValueKeyword_1_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBromium.g:6111:1: rule__SelectValue__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__SelectValue__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6115:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:6116:2: ( ruleParameterValue )
            {
            // InternalBromium.g:6116:2: ( ruleParameterValue )
            // InternalBromium.g:6117:3: ruleParameterValue
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
    // InternalBromium.g:6126:1: rule__SelectValue__ParameterNamesAssignment_7 : ( ( 'selector' ) ) ;
    public final void rule__SelectValue__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6130:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:6131:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:6131:2: ( ( 'selector' ) )
            // InternalBromium.g:6132:3: ( 'selector' )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesSelectorKeyword_7_0()); 
            // InternalBromium.g:6133:3: ( 'selector' )
            // InternalBromium.g:6134:4: 'selector'
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesSelectorKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBromium.g:6145:1: rule__SelectValue__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__SelectValue__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6149:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:6150:2: ( ruleParameterValue )
            {
            // InternalBromium.g:6150:2: ( ruleParameterValue )
            // InternalBromium.g:6151:3: ruleParameterValue
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
    // InternalBromium.g:6160:1: rule__ParameterValue__ContentAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ParameterValue__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6164:1: ( ( RULE_STRING ) )
            // InternalBromium.g:6165:2: ( RULE_STRING )
            {
            // InternalBromium.g:6165:2: ( RULE_STRING )
            // InternalBromium.g:6166:3: RULE_STRING
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
    // InternalBromium.g:6175:1: rule__ParameterValue__ExposedParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterValue__ExposedParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6179:1: ( ( ( RULE_ID ) ) )
            // InternalBromium.g:6180:2: ( ( RULE_ID ) )
            {
            // InternalBromium.g:6180:2: ( ( RULE_ID ) )
            // InternalBromium.g:6181:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterCrossReference_1_0()); 
            // InternalBromium.g:6182:3: ( RULE_ID )
            // InternalBromium.g:6183:4: RULE_ID
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
    // InternalBromium.g:6194:1: rule__ParameterValue__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__ParameterValue__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6198:1: ( ( RULE_INT ) )
            // InternalBromium.g:6199:2: ( RULE_INT )
            {
            // InternalBromium.g:6199:2: ( RULE_INT )
            // InternalBromium.g:6200:3: RULE_INT
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
    // InternalBromium.g:6209:1: rule__ExposedParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExposedParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:6213:1: ( ( RULE_ID ) )
            // InternalBromium.g:6214:2: ( RULE_ID )
            {
            // InternalBromium.g:6214:2: ( RULE_ID )
            // InternalBromium.g:6215:3: RULE_ID
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\5\uffff\3\11\2\uffff";
    static final String dfa_3s = "\1\23\1\36\2\uffff\1\4\3\27\2\uffff";
    static final String dfa_4s = "\1\35\1\36\2\uffff\1\6\3\63\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\4\4\uffff\1\3\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\2\uffff\1\3\3\uffff\1\2\2\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\5\1\6\1\7",
            "\2\11\2\uffff\1\10\15\uffff\1\11\1\uffff\2\11\2\uffff\1\11\3\uffff\1\11",
            "\2\11\2\uffff\1\10\15\uffff\1\11\1\uffff\2\11\2\uffff\1\11\3\uffff\1\11",
            "\2\11\2\uffff\1\10\15\uffff\1\11\1\uffff\2\11\2\uffff\1\11\3\uffff\1\11",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "919:1: rule__Locator__Alternatives : ( ( ruleCssSelector ) | ( ruleClassByText ) | ( ruleCssSelectorByText ) | ( ruleActionContext ) );";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\24\1\25\1\uffff\1\35\1\36\1\4\3\47\2\uffff";
    static final String dfa_10s = "\1\60\1\25\1\uffff\1\35\1\36\1\6\3\56\2\uffff";
    static final String dfa_11s = "\2\uffff\1\3\6\uffff\1\2\1\1";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\33\uffff\1\2",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "952:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );";
        }
    }
    static final String dfa_14s = "\16\uffff";
    static final String dfa_15s = "\1\51\1\52\4\uffff\1\24\1\25\1\13\5\uffff";
    static final String dfa_16s = "\1\63\1\52\4\uffff\1\24\1\25\1\67\5\uffff";
    static final String dfa_17s = "\2\uffff\1\3\1\4\1\6\1\11\3\uffff\1\7\1\10\1\5\1\2\1\1";
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
            "\1\12\5\uffff\1\11\10\uffff\1\14\2\uffff\1\15\31\uffff\1\13",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "979:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) );";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00089A0080480010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000024480000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});

}