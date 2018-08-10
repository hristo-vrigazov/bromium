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


    // $ANTLR start "entryRuleCssSelector"
    // InternalBromium.g:278:1: entryRuleCssSelector : ruleCssSelector EOF ;
    public final void entryRuleCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:279:1: ( ruleCssSelector EOF )
            // InternalBromium.g:280:1: ruleCssSelector EOF
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
    // InternalBromium.g:287:1: ruleCssSelector : ( ( rule__CssSelector__Group__0 ) ) ;
    public final void ruleCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:291:2: ( ( ( rule__CssSelector__Group__0 ) ) )
            // InternalBromium.g:292:2: ( ( rule__CssSelector__Group__0 ) )
            {
            // InternalBromium.g:292:2: ( ( rule__CssSelector__Group__0 ) )
            // InternalBromium.g:293:3: ( rule__CssSelector__Group__0 )
            {
             before(grammarAccess.getCssSelectorAccess().getGroup()); 
            // InternalBromium.g:294:3: ( rule__CssSelector__Group__0 )
            // InternalBromium.g:294:4: rule__CssSelector__Group__0
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
    // InternalBromium.g:303:1: entryRuleSyntaxDefinition : ruleSyntaxDefinition EOF ;
    public final void entryRuleSyntaxDefinition() throws RecognitionException {
        try {
            // InternalBromium.g:304:1: ( ruleSyntaxDefinition EOF )
            // InternalBromium.g:305:1: ruleSyntaxDefinition EOF
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
    // InternalBromium.g:312:1: ruleSyntaxDefinition : ( ( rule__SyntaxDefinition__Group__0 ) ) ;
    public final void ruleSyntaxDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:316:2: ( ( ( rule__SyntaxDefinition__Group__0 ) ) )
            // InternalBromium.g:317:2: ( ( rule__SyntaxDefinition__Group__0 ) )
            {
            // InternalBromium.g:317:2: ( ( rule__SyntaxDefinition__Group__0 ) )
            // InternalBromium.g:318:3: ( rule__SyntaxDefinition__Group__0 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getGroup()); 
            // InternalBromium.g:319:3: ( rule__SyntaxDefinition__Group__0 )
            // InternalBromium.g:319:4: rule__SyntaxDefinition__Group__0
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
    // InternalBromium.g:328:1: entryRuleWebDriverActionCondition : ruleWebDriverActionCondition EOF ;
    public final void entryRuleWebDriverActionCondition() throws RecognitionException {
        try {
            // InternalBromium.g:329:1: ( ruleWebDriverActionCondition EOF )
            // InternalBromium.g:330:1: ruleWebDriverActionCondition EOF
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
    // InternalBromium.g:337:1: ruleWebDriverActionCondition : ( ( rule__WebDriverActionCondition__Alternatives ) ) ;
    public final void ruleWebDriverActionCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:341:2: ( ( ( rule__WebDriverActionCondition__Alternatives ) ) )
            // InternalBromium.g:342:2: ( ( rule__WebDriverActionCondition__Alternatives ) )
            {
            // InternalBromium.g:342:2: ( ( rule__WebDriverActionCondition__Alternatives ) )
            // InternalBromium.g:343:3: ( rule__WebDriverActionCondition__Alternatives )
            {
             before(grammarAccess.getWebDriverActionConditionAccess().getAlternatives()); 
            // InternalBromium.g:344:3: ( rule__WebDriverActionCondition__Alternatives )
            // InternalBromium.g:344:4: rule__WebDriverActionCondition__Alternatives
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
    // InternalBromium.g:353:1: entryRuleWebDriverAction : ruleWebDriverAction EOF ;
    public final void entryRuleWebDriverAction() throws RecognitionException {
        try {
            // InternalBromium.g:354:1: ( ruleWebDriverAction EOF )
            // InternalBromium.g:355:1: ruleWebDriverAction EOF
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
    // InternalBromium.g:362:1: ruleWebDriverAction : ( ( rule__WebDriverAction__Alternatives ) ) ;
    public final void ruleWebDriverAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:366:2: ( ( ( rule__WebDriverAction__Alternatives ) ) )
            // InternalBromium.g:367:2: ( ( rule__WebDriverAction__Alternatives ) )
            {
            // InternalBromium.g:367:2: ( ( rule__WebDriverAction__Alternatives ) )
            // InternalBromium.g:368:3: ( rule__WebDriverAction__Alternatives )
            {
             before(grammarAccess.getWebDriverActionAccess().getAlternatives()); 
            // InternalBromium.g:369:3: ( rule__WebDriverAction__Alternatives )
            // InternalBromium.g:369:4: rule__WebDriverAction__Alternatives
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
    // InternalBromium.g:378:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalBromium.g:379:1: ( rulePrecondition EOF )
            // InternalBromium.g:380:1: rulePrecondition EOF
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
    // InternalBromium.g:387:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:391:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalBromium.g:392:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalBromium.g:392:2: ( ( rule__Precondition__Group__0 ) )
            // InternalBromium.g:393:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalBromium.g:394:3: ( rule__Precondition__Group__0 )
            // InternalBromium.g:394:4: rule__Precondition__Group__0
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
    // InternalBromium.g:403:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalBromium.g:404:1: ( rulePostcondition EOF )
            // InternalBromium.g:405:1: rulePostcondition EOF
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
    // InternalBromium.g:412:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:416:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalBromium.g:417:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalBromium.g:417:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalBromium.g:418:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalBromium.g:419:3: ( rule__Postcondition__Group__0 )
            // InternalBromium.g:419:4: rule__Postcondition__Group__0
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
    // InternalBromium.g:428:1: entryRuleExpectHttpRequest : ruleExpectHttpRequest EOF ;
    public final void entryRuleExpectHttpRequest() throws RecognitionException {
        try {
            // InternalBromium.g:429:1: ( ruleExpectHttpRequest EOF )
            // InternalBromium.g:430:1: ruleExpectHttpRequest EOF
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
    // InternalBromium.g:437:1: ruleExpectHttpRequest : ( ( rule__ExpectHttpRequest__Group__0 ) ) ;
    public final void ruleExpectHttpRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:441:2: ( ( ( rule__ExpectHttpRequest__Group__0 ) ) )
            // InternalBromium.g:442:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            {
            // InternalBromium.g:442:2: ( ( rule__ExpectHttpRequest__Group__0 ) )
            // InternalBromium.g:443:3: ( rule__ExpectHttpRequest__Group__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup()); 
            // InternalBromium.g:444:3: ( rule__ExpectHttpRequest__Group__0 )
            // InternalBromium.g:444:4: rule__ExpectHttpRequest__Group__0
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
    // InternalBromium.g:453:1: entryRuleElementByCssToBePresent : ruleElementByCssToBePresent EOF ;
    public final void entryRuleElementByCssToBePresent() throws RecognitionException {
        try {
            // InternalBromium.g:454:1: ( ruleElementByCssToBePresent EOF )
            // InternalBromium.g:455:1: ruleElementByCssToBePresent EOF
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
    // InternalBromium.g:462:1: ruleElementByCssToBePresent : ( ( rule__ElementByCssToBePresent__Group__0 ) ) ;
    public final void ruleElementByCssToBePresent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:466:2: ( ( ( rule__ElementByCssToBePresent__Group__0 ) ) )
            // InternalBromium.g:467:2: ( ( rule__ElementByCssToBePresent__Group__0 ) )
            {
            // InternalBromium.g:467:2: ( ( rule__ElementByCssToBePresent__Group__0 ) )
            // InternalBromium.g:468:3: ( rule__ElementByCssToBePresent__Group__0 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getGroup()); 
            // InternalBromium.g:469:3: ( rule__ElementByCssToBePresent__Group__0 )
            // InternalBromium.g:469:4: rule__ElementByCssToBePresent__Group__0
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
    // InternalBromium.g:478:1: entryRuleClickCssSelector : ruleClickCssSelector EOF ;
    public final void entryRuleClickCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:479:1: ( ruleClickCssSelector EOF )
            // InternalBromium.g:480:1: ruleClickCssSelector EOF
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
    // InternalBromium.g:487:1: ruleClickCssSelector : ( ( rule__ClickCssSelector__Group__0 ) ) ;
    public final void ruleClickCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:491:2: ( ( ( rule__ClickCssSelector__Group__0 ) ) )
            // InternalBromium.g:492:2: ( ( rule__ClickCssSelector__Group__0 ) )
            {
            // InternalBromium.g:492:2: ( ( rule__ClickCssSelector__Group__0 ) )
            // InternalBromium.g:493:3: ( rule__ClickCssSelector__Group__0 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getGroup()); 
            // InternalBromium.g:494:3: ( rule__ClickCssSelector__Group__0 )
            // InternalBromium.g:494:4: rule__ClickCssSelector__Group__0
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
    // InternalBromium.g:503:1: entryRulePageLoad : rulePageLoad EOF ;
    public final void entryRulePageLoad() throws RecognitionException {
        try {
            // InternalBromium.g:504:1: ( rulePageLoad EOF )
            // InternalBromium.g:505:1: rulePageLoad EOF
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
    // InternalBromium.g:512:1: rulePageLoad : ( ( rule__PageLoad__Group__0 ) ) ;
    public final void rulePageLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:516:2: ( ( ( rule__PageLoad__Group__0 ) ) )
            // InternalBromium.g:517:2: ( ( rule__PageLoad__Group__0 ) )
            {
            // InternalBromium.g:517:2: ( ( rule__PageLoad__Group__0 ) )
            // InternalBromium.g:518:3: ( rule__PageLoad__Group__0 )
            {
             before(grammarAccess.getPageLoadAccess().getGroup()); 
            // InternalBromium.g:519:3: ( rule__PageLoad__Group__0 )
            // InternalBromium.g:519:4: rule__PageLoad__Group__0
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
    // InternalBromium.g:528:1: entryRuleTypeTextInElementFoundByCssSelector : ruleTypeTextInElementFoundByCssSelector EOF ;
    public final void entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:529:1: ( ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:530:1: ruleTypeTextInElementFoundByCssSelector EOF
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
    // InternalBromium.g:537:1: ruleTypeTextInElementFoundByCssSelector : ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) ;
    public final void ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:541:2: ( ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) )
            // InternalBromium.g:542:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            {
            // InternalBromium.g:542:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            // InternalBromium.g:543:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); 
            // InternalBromium.g:544:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            // InternalBromium.g:544:4: rule__TypeTextInElementFoundByCssSelector__Group__0
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
    // InternalBromium.g:553:1: entryRuleTextOfElementWithCssSelectorToBe : ruleTextOfElementWithCssSelectorToBe EOF ;
    public final void entryRuleTextOfElementWithCssSelectorToBe() throws RecognitionException {
        try {
            // InternalBromium.g:554:1: ( ruleTextOfElementWithCssSelectorToBe EOF )
            // InternalBromium.g:555:1: ruleTextOfElementWithCssSelectorToBe EOF
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
    // InternalBromium.g:562:1: ruleTextOfElementWithCssSelectorToBe : ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) ) ;
    public final void ruleTextOfElementWithCssSelectorToBe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:566:2: ( ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) ) )
            // InternalBromium.g:567:2: ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) )
            {
            // InternalBromium.g:567:2: ( ( rule__TextOfElementWithCssSelectorToBe__Group__0 ) )
            // InternalBromium.g:568:3: ( rule__TextOfElementWithCssSelectorToBe__Group__0 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getGroup()); 
            // InternalBromium.g:569:3: ( rule__TextOfElementWithCssSelectorToBe__Group__0 )
            // InternalBromium.g:569:4: rule__TextOfElementWithCssSelectorToBe__Group__0
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
    // InternalBromium.g:578:1: entryRuleClickClassByText : ruleClickClassByText EOF ;
    public final void entryRuleClickClassByText() throws RecognitionException {
        try {
            // InternalBromium.g:579:1: ( ruleClickClassByText EOF )
            // InternalBromium.g:580:1: ruleClickClassByText EOF
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
    // InternalBromium.g:587:1: ruleClickClassByText : ( ( rule__ClickClassByText__Group__0 ) ) ;
    public final void ruleClickClassByText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:591:2: ( ( ( rule__ClickClassByText__Group__0 ) ) )
            // InternalBromium.g:592:2: ( ( rule__ClickClassByText__Group__0 ) )
            {
            // InternalBromium.g:592:2: ( ( rule__ClickClassByText__Group__0 ) )
            // InternalBromium.g:593:3: ( rule__ClickClassByText__Group__0 )
            {
             before(grammarAccess.getClickClassByTextAccess().getGroup()); 
            // InternalBromium.g:594:3: ( rule__ClickClassByText__Group__0 )
            // InternalBromium.g:594:4: rule__ClickClassByText__Group__0
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
    // InternalBromium.g:603:1: entryRuleSetVariableToTextOfElementWithCssSelector : ruleSetVariableToTextOfElementWithCssSelector EOF ;
    public final void entryRuleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:604:1: ( ruleSetVariableToTextOfElementWithCssSelector EOF )
            // InternalBromium.g:605:1: ruleSetVariableToTextOfElementWithCssSelector EOF
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
    // InternalBromium.g:612:1: ruleSetVariableToTextOfElementWithCssSelector : ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) ) ;
    public final void ruleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:616:2: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) ) )
            // InternalBromium.g:617:2: ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) )
            {
            // InternalBromium.g:617:2: ( ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 ) )
            // InternalBromium.g:618:3: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getGroup()); 
            // InternalBromium.g:619:3: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0 )
            // InternalBromium.g:619:4: rule__SetVariableToTextOfElementWithCssSelector__Group__0
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
    // InternalBromium.g:628:1: entryRuleClickDataId : ruleClickDataId EOF ;
    public final void entryRuleClickDataId() throws RecognitionException {
        try {
            // InternalBromium.g:629:1: ( ruleClickDataId EOF )
            // InternalBromium.g:630:1: ruleClickDataId EOF
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
    // InternalBromium.g:637:1: ruleClickDataId : ( ( rule__ClickDataId__Group__0 ) ) ;
    public final void ruleClickDataId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:641:2: ( ( ( rule__ClickDataId__Group__0 ) ) )
            // InternalBromium.g:642:2: ( ( rule__ClickDataId__Group__0 ) )
            {
            // InternalBromium.g:642:2: ( ( rule__ClickDataId__Group__0 ) )
            // InternalBromium.g:643:3: ( rule__ClickDataId__Group__0 )
            {
             before(grammarAccess.getClickDataIdAccess().getGroup()); 
            // InternalBromium.g:644:3: ( rule__ClickDataId__Group__0 )
            // InternalBromium.g:644:4: rule__ClickDataId__Group__0
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
    // InternalBromium.g:653:1: entryRuleConfirmAlert : ruleConfirmAlert EOF ;
    public final void entryRuleConfirmAlert() throws RecognitionException {
        try {
            // InternalBromium.g:654:1: ( ruleConfirmAlert EOF )
            // InternalBromium.g:655:1: ruleConfirmAlert EOF
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
    // InternalBromium.g:662:1: ruleConfirmAlert : ( ( rule__ConfirmAlert__Group__0 ) ) ;
    public final void ruleConfirmAlert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:666:2: ( ( ( rule__ConfirmAlert__Group__0 ) ) )
            // InternalBromium.g:667:2: ( ( rule__ConfirmAlert__Group__0 ) )
            {
            // InternalBromium.g:667:2: ( ( rule__ConfirmAlert__Group__0 ) )
            // InternalBromium.g:668:3: ( rule__ConfirmAlert__Group__0 )
            {
             before(grammarAccess.getConfirmAlertAccess().getGroup()); 
            // InternalBromium.g:669:3: ( rule__ConfirmAlert__Group__0 )
            // InternalBromium.g:669:4: rule__ConfirmAlert__Group__0
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
    // InternalBromium.g:678:1: entryRuleClickId : ruleClickId EOF ;
    public final void entryRuleClickId() throws RecognitionException {
        try {
            // InternalBromium.g:679:1: ( ruleClickId EOF )
            // InternalBromium.g:680:1: ruleClickId EOF
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
    // InternalBromium.g:687:1: ruleClickId : ( ( rule__ClickId__Group__0 ) ) ;
    public final void ruleClickId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:691:2: ( ( ( rule__ClickId__Group__0 ) ) )
            // InternalBromium.g:692:2: ( ( rule__ClickId__Group__0 ) )
            {
            // InternalBromium.g:692:2: ( ( rule__ClickId__Group__0 ) )
            // InternalBromium.g:693:3: ( rule__ClickId__Group__0 )
            {
             before(grammarAccess.getClickIdAccess().getGroup()); 
            // InternalBromium.g:694:3: ( rule__ClickId__Group__0 )
            // InternalBromium.g:694:4: rule__ClickId__Group__0
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
    // InternalBromium.g:703:1: entryRuleClickName : ruleClickName EOF ;
    public final void entryRuleClickName() throws RecognitionException {
        try {
            // InternalBromium.g:704:1: ( ruleClickName EOF )
            // InternalBromium.g:705:1: ruleClickName EOF
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
    // InternalBromium.g:712:1: ruleClickName : ( ( rule__ClickName__Group__0 ) ) ;
    public final void ruleClickName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:716:2: ( ( ( rule__ClickName__Group__0 ) ) )
            // InternalBromium.g:717:2: ( ( rule__ClickName__Group__0 ) )
            {
            // InternalBromium.g:717:2: ( ( rule__ClickName__Group__0 ) )
            // InternalBromium.g:718:3: ( rule__ClickName__Group__0 )
            {
             before(grammarAccess.getClickNameAccess().getGroup()); 
            // InternalBromium.g:719:3: ( rule__ClickName__Group__0 )
            // InternalBromium.g:719:4: rule__ClickName__Group__0
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
    // InternalBromium.g:728:1: entryRuleSelectValue : ruleSelectValue EOF ;
    public final void entryRuleSelectValue() throws RecognitionException {
        try {
            // InternalBromium.g:729:1: ( ruleSelectValue EOF )
            // InternalBromium.g:730:1: ruleSelectValue EOF
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
    // InternalBromium.g:737:1: ruleSelectValue : ( ( rule__SelectValue__Group__0 ) ) ;
    public final void ruleSelectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:741:2: ( ( ( rule__SelectValue__Group__0 ) ) )
            // InternalBromium.g:742:2: ( ( rule__SelectValue__Group__0 ) )
            {
            // InternalBromium.g:742:2: ( ( rule__SelectValue__Group__0 ) )
            // InternalBromium.g:743:3: ( rule__SelectValue__Group__0 )
            {
             before(grammarAccess.getSelectValueAccess().getGroup()); 
            // InternalBromium.g:744:3: ( rule__SelectValue__Group__0 )
            // InternalBromium.g:744:4: rule__SelectValue__Group__0
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
    // InternalBromium.g:753:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalBromium.g:754:1: ( ruleParameterValue EOF )
            // InternalBromium.g:755:1: ruleParameterValue EOF
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
    // InternalBromium.g:762:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:766:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalBromium.g:767:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalBromium.g:767:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalBromium.g:768:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalBromium.g:769:3: ( rule__ParameterValue__Alternatives )
            // InternalBromium.g:769:4: rule__ParameterValue__Alternatives
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
    // InternalBromium.g:778:1: entryRuleExposedParameter : ruleExposedParameter EOF ;
    public final void entryRuleExposedParameter() throws RecognitionException {
        try {
            // InternalBromium.g:779:1: ( ruleExposedParameter EOF )
            // InternalBromium.g:780:1: ruleExposedParameter EOF
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
    // InternalBromium.g:787:1: ruleExposedParameter : ( ( rule__ExposedParameter__NameAssignment ) ) ;
    public final void ruleExposedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:791:2: ( ( ( rule__ExposedParameter__NameAssignment ) ) )
            // InternalBromium.g:792:2: ( ( rule__ExposedParameter__NameAssignment ) )
            {
            // InternalBromium.g:792:2: ( ( rule__ExposedParameter__NameAssignment ) )
            // InternalBromium.g:793:3: ( rule__ExposedParameter__NameAssignment )
            {
             before(grammarAccess.getExposedParameterAccess().getNameAssignment()); 
            // InternalBromium.g:794:3: ( rule__ExposedParameter__NameAssignment )
            // InternalBromium.g:794:4: rule__ExposedParameter__NameAssignment
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
    // InternalBromium.g:803:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalBromium.g:804:1: ( ruleVersion EOF )
            // InternalBromium.g:805:1: ruleVersion EOF
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
    // InternalBromium.g:812:1: ruleVersion : ( RULE_STRING ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:816:2: ( ( RULE_STRING ) )
            // InternalBromium.g:817:2: ( RULE_STRING )
            {
            // InternalBromium.g:817:2: ( RULE_STRING )
            // InternalBromium.g:818:3: RULE_STRING
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
    // InternalBromium.g:827:1: rule__RowSelector__Alternatives : ( ( ruleRowLocator ) | ( ruleRowIndex ) );
    public final void rule__RowSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:831:1: ( ( ruleRowLocator ) | ( ruleRowIndex ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==23) ) {
                    alt1=2;
                }
                else if ( (LA1_1==20) ) {
                    alt1=1;
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
                    // InternalBromium.g:832:2: ( ruleRowLocator )
                    {
                    // InternalBromium.g:832:2: ( ruleRowLocator )
                    // InternalBromium.g:833:3: ruleRowLocator
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
                    // InternalBromium.g:838:2: ( ruleRowIndex )
                    {
                    // InternalBromium.g:838:2: ( ruleRowIndex )
                    // InternalBromium.g:839:3: ruleRowIndex
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
    // InternalBromium.g:848:1: rule__Locator__Alternatives : ( ( ruleCssSelector ) | ( ruleClassByText ) | ( ruleActionContext ) );
    public final void rule__Locator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:852:1: ( ( ruleCssSelector ) | ( ruleClassByText ) | ( ruleActionContext ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBromium.g:853:2: ( ruleCssSelector )
                    {
                    // InternalBromium.g:853:2: ( ruleCssSelector )
                    // InternalBromium.g:854:3: ruleCssSelector
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
                    // InternalBromium.g:859:2: ( ruleClassByText )
                    {
                    // InternalBromium.g:859:2: ( ruleClassByText )
                    // InternalBromium.g:860:3: ruleClassByText
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
                    // InternalBromium.g:865:2: ( ruleActionContext )
                    {
                    // InternalBromium.g:865:2: ( ruleActionContext )
                    // InternalBromium.g:866:3: ruleActionContext
                    {
                     before(grammarAccess.getLocatorAccess().getActionContextParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleActionContext();

                    state._fsp--;

                     after(grammarAccess.getLocatorAccess().getActionContextParserRuleCall_2()); 

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
    // InternalBromium.g:875:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );
    public final void rule__WebDriverActionCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:879:1: ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBromium.g:880:2: ( ruleElementByCssToBePresent )
                    {
                    // InternalBromium.g:880:2: ( ruleElementByCssToBePresent )
                    // InternalBromium.g:881:3: ruleElementByCssToBePresent
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
                    // InternalBromium.g:886:2: ( ruleTextOfElementWithCssSelectorToBe )
                    {
                    // InternalBromium.g:886:2: ( ruleTextOfElementWithCssSelectorToBe )
                    // InternalBromium.g:887:3: ruleTextOfElementWithCssSelectorToBe
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
                    // InternalBromium.g:892:2: ( ruleConfirmAlert )
                    {
                    // InternalBromium.g:892:2: ( ruleConfirmAlert )
                    // InternalBromium.g:893:3: ruleConfirmAlert
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
    // InternalBromium.g:902:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) );
    public final void rule__WebDriverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:906:1: ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalBromium.g:907:2: ( ruleClickCssSelector )
                    {
                    // InternalBromium.g:907:2: ( ruleClickCssSelector )
                    // InternalBromium.g:908:3: ruleClickCssSelector
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
                    // InternalBromium.g:913:2: ( ruleClickClassByText )
                    {
                    // InternalBromium.g:913:2: ( ruleClickClassByText )
                    // InternalBromium.g:914:3: ruleClickClassByText
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
                    // InternalBromium.g:919:2: ( rulePageLoad )
                    {
                    // InternalBromium.g:919:2: ( rulePageLoad )
                    // InternalBromium.g:920:3: rulePageLoad
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
                    // InternalBromium.g:925:2: ( ruleTypeTextInElementFoundByCssSelector )
                    {
                    // InternalBromium.g:925:2: ( ruleTypeTextInElementFoundByCssSelector )
                    // InternalBromium.g:926:3: ruleTypeTextInElementFoundByCssSelector
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
                    // InternalBromium.g:931:2: ( ruleClickDataId )
                    {
                    // InternalBromium.g:931:2: ( ruleClickDataId )
                    // InternalBromium.g:932:3: ruleClickDataId
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
                    // InternalBromium.g:937:2: ( ruleSetVariableToTextOfElementWithCssSelector )
                    {
                    // InternalBromium.g:937:2: ( ruleSetVariableToTextOfElementWithCssSelector )
                    // InternalBromium.g:938:3: ruleSetVariableToTextOfElementWithCssSelector
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
                    // InternalBromium.g:943:2: ( ruleClickId )
                    {
                    // InternalBromium.g:943:2: ( ruleClickId )
                    // InternalBromium.g:944:3: ruleClickId
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
                    // InternalBromium.g:949:2: ( ruleClickName )
                    {
                    // InternalBromium.g:949:2: ( ruleClickName )
                    // InternalBromium.g:950:3: ruleClickName
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
                    // InternalBromium.g:955:2: ( ruleSelectValue )
                    {
                    // InternalBromium.g:955:2: ( ruleSelectValue )
                    // InternalBromium.g:956:3: ruleSelectValue
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
    // InternalBromium.g:965:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) | ( ( rule__ParameterValue__IndexAssignment_2 ) ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:969:1: ( ( ( rule__ParameterValue__ContentAssignment_0 ) ) | ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) ) | ( ( rule__ParameterValue__IndexAssignment_2 ) ) )
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
                    // InternalBromium.g:970:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    {
                    // InternalBromium.g:970:2: ( ( rule__ParameterValue__ContentAssignment_0 ) )
                    // InternalBromium.g:971:3: ( rule__ParameterValue__ContentAssignment_0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getContentAssignment_0()); 
                    // InternalBromium.g:972:3: ( rule__ParameterValue__ContentAssignment_0 )
                    // InternalBromium.g:972:4: rule__ParameterValue__ContentAssignment_0
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
                    // InternalBromium.g:976:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    {
                    // InternalBromium.g:976:2: ( ( rule__ParameterValue__ExposedParameterAssignment_1 ) )
                    // InternalBromium.g:977:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    {
                     before(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1()); 
                    // InternalBromium.g:978:3: ( rule__ParameterValue__ExposedParameterAssignment_1 )
                    // InternalBromium.g:978:4: rule__ParameterValue__ExposedParameterAssignment_1
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
                    // InternalBromium.g:982:2: ( ( rule__ParameterValue__IndexAssignment_2 ) )
                    {
                    // InternalBromium.g:982:2: ( ( rule__ParameterValue__IndexAssignment_2 ) )
                    // InternalBromium.g:983:3: ( rule__ParameterValue__IndexAssignment_2 )
                    {
                     before(grammarAccess.getParameterValueAccess().getIndexAssignment_2()); 
                    // InternalBromium.g:984:3: ( rule__ParameterValue__IndexAssignment_2 )
                    // InternalBromium.g:984:4: rule__ParameterValue__IndexAssignment_2
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
    // InternalBromium.g:992:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:996:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBromium.g:997:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalBromium.g:1004:1: rule__Model__Group__0__Impl : ( 'name' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1008:1: ( ( 'name' ) )
            // InternalBromium.g:1009:1: ( 'name' )
            {
            // InternalBromium.g:1009:1: ( 'name' )
            // InternalBromium.g:1010:2: 'name'
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
    // InternalBromium.g:1019:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1023:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBromium.g:1024:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalBromium.g:1031:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1035:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalBromium.g:1036:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalBromium.g:1036:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalBromium.g:1037:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalBromium.g:1038:2: ( rule__Model__NameAssignment_1 )
            // InternalBromium.g:1038:3: rule__Model__NameAssignment_1
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
    // InternalBromium.g:1046:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1050:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBromium.g:1051:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalBromium.g:1058:1: rule__Model__Group__2__Impl : ( 'version' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1062:1: ( ( 'version' ) )
            // InternalBromium.g:1063:1: ( 'version' )
            {
            // InternalBromium.g:1063:1: ( 'version' )
            // InternalBromium.g:1064:2: 'version'
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
    // InternalBromium.g:1073:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1077:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBromium.g:1078:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalBromium.g:1085:1: rule__Model__Group__3__Impl : ( ( rule__Model__VersionAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1089:1: ( ( ( rule__Model__VersionAssignment_3 ) ) )
            // InternalBromium.g:1090:1: ( ( rule__Model__VersionAssignment_3 ) )
            {
            // InternalBromium.g:1090:1: ( ( rule__Model__VersionAssignment_3 ) )
            // InternalBromium.g:1091:2: ( rule__Model__VersionAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_3()); 
            // InternalBromium.g:1092:2: ( rule__Model__VersionAssignment_3 )
            // InternalBromium.g:1092:3: rule__Model__VersionAssignment_3
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
    // InternalBromium.g:1100:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1104:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBromium.g:1105:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalBromium.g:1112:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1116:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalBromium.g:1117:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalBromium.g:1117:1: ( ( rule__Model__Group_4__0 )? )
            // InternalBromium.g:1118:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalBromium.g:1119:2: ( rule__Model__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBromium.g:1119:3: rule__Model__Group_4__0
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
    // InternalBromium.g:1127:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1131:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalBromium.g:1132:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalBromium.g:1139:1: rule__Model__Group__5__Impl : ( 'actions' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1143:1: ( ( 'actions' ) )
            // InternalBromium.g:1144:1: ( 'actions' )
            {
            // InternalBromium.g:1144:1: ( 'actions' )
            // InternalBromium.g:1145:2: 'actions'
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
    // InternalBromium.g:1154:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1158:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalBromium.g:1159:2: rule__Model__Group__6__Impl rule__Model__Group__7
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
    // InternalBromium.g:1166:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1170:1: ( ( '{' ) )
            // InternalBromium.g:1171:1: ( '{' )
            {
            // InternalBromium.g:1171:1: ( '{' )
            // InternalBromium.g:1172:2: '{'
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
    // InternalBromium.g:1181:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1185:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalBromium.g:1186:2: rule__Model__Group__7__Impl rule__Model__Group__8
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
    // InternalBromium.g:1193:1: rule__Model__Group__7__Impl : ( ( rule__Model__ActionsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1197:1: ( ( ( rule__Model__ActionsAssignment_7 )* ) )
            // InternalBromium.g:1198:1: ( ( rule__Model__ActionsAssignment_7 )* )
            {
            // InternalBromium.g:1198:1: ( ( rule__Model__ActionsAssignment_7 )* )
            // InternalBromium.g:1199:2: ( rule__Model__ActionsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getActionsAssignment_7()); 
            // InternalBromium.g:1200:2: ( rule__Model__ActionsAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBromium.g:1200:3: rule__Model__ActionsAssignment_7
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
    // InternalBromium.g:1208:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1212:1: ( rule__Model__Group__8__Impl )
            // InternalBromium.g:1213:2: rule__Model__Group__8__Impl
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
    // InternalBromium.g:1219:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1223:1: ( ( '}' ) )
            // InternalBromium.g:1224:1: ( '}' )
            {
            // InternalBromium.g:1224:1: ( '}' )
            // InternalBromium.g:1225:2: '}'
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
    // InternalBromium.g:1235:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1239:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalBromium.g:1240:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalBromium.g:1247:1: rule__Model__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1251:1: ( ( 'from' ) )
            // InternalBromium.g:1252:1: ( 'from' )
            {
            // InternalBromium.g:1252:1: ( 'from' )
            // InternalBromium.g:1253:2: 'from'
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
    // InternalBromium.g:1262:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1266:1: ( rule__Model__Group_4__1__Impl )
            // InternalBromium.g:1267:2: rule__Model__Group_4__1__Impl
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
    // InternalBromium.g:1273:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__BaseVersionAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1277:1: ( ( ( rule__Model__BaseVersionAssignment_4_1 ) ) )
            // InternalBromium.g:1278:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            {
            // InternalBromium.g:1278:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            // InternalBromium.g:1279:2: ( rule__Model__BaseVersionAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); 
            // InternalBromium.g:1280:2: ( rule__Model__BaseVersionAssignment_4_1 )
            // InternalBromium.g:1280:3: rule__Model__BaseVersionAssignment_4_1
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
    // InternalBromium.g:1289:1: rule__ApplicationAction__Group__0 : rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 ;
    public final void rule__ApplicationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1293:1: ( rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 )
            // InternalBromium.g:1294:2: rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1
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
    // InternalBromium.g:1301:1: rule__ApplicationAction__Group__0__Impl : ( 'id' ) ;
    public final void rule__ApplicationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1305:1: ( ( 'id' ) )
            // InternalBromium.g:1306:1: ( 'id' )
            {
            // InternalBromium.g:1306:1: ( 'id' )
            // InternalBromium.g:1307:2: 'id'
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
    // InternalBromium.g:1316:1: rule__ApplicationAction__Group__1 : rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 ;
    public final void rule__ApplicationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1320:1: ( rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 )
            // InternalBromium.g:1321:2: rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2
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
    // InternalBromium.g:1328:1: rule__ApplicationAction__Group__1__Impl : ( ( rule__ApplicationAction__NameAssignment_1 ) ) ;
    public final void rule__ApplicationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1332:1: ( ( ( rule__ApplicationAction__NameAssignment_1 ) ) )
            // InternalBromium.g:1333:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            {
            // InternalBromium.g:1333:1: ( ( rule__ApplicationAction__NameAssignment_1 ) )
            // InternalBromium.g:1334:2: ( rule__ApplicationAction__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationActionAccess().getNameAssignment_1()); 
            // InternalBromium.g:1335:2: ( rule__ApplicationAction__NameAssignment_1 )
            // InternalBromium.g:1335:3: rule__ApplicationAction__NameAssignment_1
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
    // InternalBromium.g:1343:1: rule__ApplicationAction__Group__2 : rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 ;
    public final void rule__ApplicationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1347:1: ( rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 )
            // InternalBromium.g:1348:2: rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3
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
    // InternalBromium.g:1355:1: rule__ApplicationAction__Group__2__Impl : ( 'syntax' ) ;
    public final void rule__ApplicationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1359:1: ( ( 'syntax' ) )
            // InternalBromium.g:1360:1: ( 'syntax' )
            {
            // InternalBromium.g:1360:1: ( 'syntax' )
            // InternalBromium.g:1361:2: 'syntax'
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
    // InternalBromium.g:1370:1: rule__ApplicationAction__Group__3 : rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 ;
    public final void rule__ApplicationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1374:1: ( rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 )
            // InternalBromium.g:1375:2: rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4
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
    // InternalBromium.g:1382:1: rule__ApplicationAction__Group__3__Impl : ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) ;
    public final void rule__ApplicationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1386:1: ( ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* ) )
            // InternalBromium.g:1387:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            {
            // InternalBromium.g:1387:1: ( ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )* )
            // InternalBromium.g:1388:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            {
             before(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsAssignment_3()); 
            // InternalBromium.g:1389:2: ( rule__ApplicationAction__SyntaxDefinitionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBromium.g:1389:3: rule__ApplicationAction__SyntaxDefinitionsAssignment_3
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
    // InternalBromium.g:1397:1: rule__ApplicationAction__Group__4 : rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 ;
    public final void rule__ApplicationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1401:1: ( rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 )
            // InternalBromium.g:1402:2: rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5
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
    // InternalBromium.g:1409:1: rule__ApplicationAction__Group__4__Impl : ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) ;
    public final void rule__ApplicationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1413:1: ( ( ( rule__ApplicationAction__PreconditionAssignment_4 )? ) )
            // InternalBromium.g:1414:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            {
            // InternalBromium.g:1414:1: ( ( rule__ApplicationAction__PreconditionAssignment_4 )? )
            // InternalBromium.g:1415:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_4()); 
            // InternalBromium.g:1416:2: ( rule__ApplicationAction__PreconditionAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBromium.g:1416:3: rule__ApplicationAction__PreconditionAssignment_4
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
    // InternalBromium.g:1424:1: rule__ApplicationAction__Group__5 : rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 ;
    public final void rule__ApplicationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1428:1: ( rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6 )
            // InternalBromium.g:1429:2: rule__ApplicationAction__Group__5__Impl rule__ApplicationAction__Group__6
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
    // InternalBromium.g:1436:1: rule__ApplicationAction__Group__5__Impl : ( ( rule__ApplicationAction__ActionContextAssignment_5 )? ) ;
    public final void rule__ApplicationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1440:1: ( ( ( rule__ApplicationAction__ActionContextAssignment_5 )? ) )
            // InternalBromium.g:1441:1: ( ( rule__ApplicationAction__ActionContextAssignment_5 )? )
            {
            // InternalBromium.g:1441:1: ( ( rule__ApplicationAction__ActionContextAssignment_5 )? )
            // InternalBromium.g:1442:2: ( rule__ApplicationAction__ActionContextAssignment_5 )?
            {
             before(grammarAccess.getApplicationActionAccess().getActionContextAssignment_5()); 
            // InternalBromium.g:1443:2: ( rule__ApplicationAction__ActionContextAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBromium.g:1443:3: rule__ApplicationAction__ActionContextAssignment_5
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
    // InternalBromium.g:1451:1: rule__ApplicationAction__Group__6 : rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 ;
    public final void rule__ApplicationAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1455:1: ( rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7 )
            // InternalBromium.g:1456:2: rule__ApplicationAction__Group__6__Impl rule__ApplicationAction__Group__7
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
    // InternalBromium.g:1463:1: rule__ApplicationAction__Group__6__Impl : ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) ) ;
    public final void rule__ApplicationAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1467:1: ( ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) ) )
            // InternalBromium.g:1468:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) )
            {
            // InternalBromium.g:1468:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_6 ) )
            // InternalBromium.g:1469:2: ( rule__ApplicationAction__WebDriverActionAssignment_6 )
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_6()); 
            // InternalBromium.g:1470:2: ( rule__ApplicationAction__WebDriverActionAssignment_6 )
            // InternalBromium.g:1470:3: rule__ApplicationAction__WebDriverActionAssignment_6
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
    // InternalBromium.g:1478:1: rule__ApplicationAction__Group__7 : rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8 ;
    public final void rule__ApplicationAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1482:1: ( rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8 )
            // InternalBromium.g:1483:2: rule__ApplicationAction__Group__7__Impl rule__ApplicationAction__Group__8
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
    // InternalBromium.g:1490:1: rule__ApplicationAction__Group__7__Impl : ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? ) ;
    public final void rule__ApplicationAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1494:1: ( ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? ) )
            // InternalBromium.g:1495:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? )
            {
            // InternalBromium.g:1495:1: ( ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )? )
            // InternalBromium.g:1496:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )?
            {
             before(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_7()); 
            // InternalBromium.g:1497:2: ( rule__ApplicationAction__ExpectHttpRequestAssignment_7 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBromium.g:1497:3: rule__ApplicationAction__ExpectHttpRequestAssignment_7
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
    // InternalBromium.g:1505:1: rule__ApplicationAction__Group__8 : rule__ApplicationAction__Group__8__Impl ;
    public final void rule__ApplicationAction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1509:1: ( rule__ApplicationAction__Group__8__Impl )
            // InternalBromium.g:1510:2: rule__ApplicationAction__Group__8__Impl
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
    // InternalBromium.g:1516:1: rule__ApplicationAction__Group__8__Impl : ( ( rule__ApplicationAction__PostconditionAssignment_8 )? ) ;
    public final void rule__ApplicationAction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1520:1: ( ( ( rule__ApplicationAction__PostconditionAssignment_8 )? ) )
            // InternalBromium.g:1521:1: ( ( rule__ApplicationAction__PostconditionAssignment_8 )? )
            {
            // InternalBromium.g:1521:1: ( ( rule__ApplicationAction__PostconditionAssignment_8 )? )
            // InternalBromium.g:1522:2: ( rule__ApplicationAction__PostconditionAssignment_8 )?
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_8()); 
            // InternalBromium.g:1523:2: ( rule__ApplicationAction__PostconditionAssignment_8 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBromium.g:1523:3: rule__ApplicationAction__PostconditionAssignment_8
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
    // InternalBromium.g:1532:1: rule__TableActionContext__Group__0 : rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1 ;
    public final void rule__TableActionContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1536:1: ( rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1 )
            // InternalBromium.g:1537:2: rule__TableActionContext__Group__0__Impl rule__TableActionContext__Group__1
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
    // InternalBromium.g:1544:1: rule__TableActionContext__Group__0__Impl : ( 'table' ) ;
    public final void rule__TableActionContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1548:1: ( ( 'table' ) )
            // InternalBromium.g:1549:1: ( 'table' )
            {
            // InternalBromium.g:1549:1: ( 'table' )
            // InternalBromium.g:1550:2: 'table'
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
    // InternalBromium.g:1559:1: rule__TableActionContext__Group__1 : rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2 ;
    public final void rule__TableActionContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1563:1: ( rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2 )
            // InternalBromium.g:1564:2: rule__TableActionContext__Group__1__Impl rule__TableActionContext__Group__2
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
    // InternalBromium.g:1571:1: rule__TableActionContext__Group__1__Impl : ( 'with' ) ;
    public final void rule__TableActionContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1575:1: ( ( 'with' ) )
            // InternalBromium.g:1576:1: ( 'with' )
            {
            // InternalBromium.g:1576:1: ( 'with' )
            // InternalBromium.g:1577:2: 'with'
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
    // InternalBromium.g:1586:1: rule__TableActionContext__Group__2 : rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3 ;
    public final void rule__TableActionContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1590:1: ( rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3 )
            // InternalBromium.g:1591:2: rule__TableActionContext__Group__2__Impl rule__TableActionContext__Group__3
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
    // InternalBromium.g:1598:1: rule__TableActionContext__Group__2__Impl : ( ( rule__TableActionContext__TableLocatorAssignment_2 ) ) ;
    public final void rule__TableActionContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1602:1: ( ( ( rule__TableActionContext__TableLocatorAssignment_2 ) ) )
            // InternalBromium.g:1603:1: ( ( rule__TableActionContext__TableLocatorAssignment_2 ) )
            {
            // InternalBromium.g:1603:1: ( ( rule__TableActionContext__TableLocatorAssignment_2 ) )
            // InternalBromium.g:1604:2: ( rule__TableActionContext__TableLocatorAssignment_2 )
            {
             before(grammarAccess.getTableActionContextAccess().getTableLocatorAssignment_2()); 
            // InternalBromium.g:1605:2: ( rule__TableActionContext__TableLocatorAssignment_2 )
            // InternalBromium.g:1605:3: rule__TableActionContext__TableLocatorAssignment_2
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
    // InternalBromium.g:1613:1: rule__TableActionContext__Group__3 : rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4 ;
    public final void rule__TableActionContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1617:1: ( rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4 )
            // InternalBromium.g:1618:2: rule__TableActionContext__Group__3__Impl rule__TableActionContext__Group__4
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
    // InternalBromium.g:1625:1: rule__TableActionContext__Group__3__Impl : ( 'rows' ) ;
    public final void rule__TableActionContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1629:1: ( ( 'rows' ) )
            // InternalBromium.g:1630:1: ( 'rows' )
            {
            // InternalBromium.g:1630:1: ( 'rows' )
            // InternalBromium.g:1631:2: 'rows'
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
    // InternalBromium.g:1640:1: rule__TableActionContext__Group__4 : rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5 ;
    public final void rule__TableActionContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1644:1: ( rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5 )
            // InternalBromium.g:1645:2: rule__TableActionContext__Group__4__Impl rule__TableActionContext__Group__5
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
    // InternalBromium.g:1652:1: rule__TableActionContext__Group__4__Impl : ( 'with' ) ;
    public final void rule__TableActionContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1656:1: ( ( 'with' ) )
            // InternalBromium.g:1657:1: ( 'with' )
            {
            // InternalBromium.g:1657:1: ( 'with' )
            // InternalBromium.g:1658:2: 'with'
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
    // InternalBromium.g:1667:1: rule__TableActionContext__Group__5 : rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6 ;
    public final void rule__TableActionContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1671:1: ( rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6 )
            // InternalBromium.g:1672:2: rule__TableActionContext__Group__5__Impl rule__TableActionContext__Group__6
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
    // InternalBromium.g:1679:1: rule__TableActionContext__Group__5__Impl : ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) ) ;
    public final void rule__TableActionContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1683:1: ( ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) ) )
            // InternalBromium.g:1684:1: ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) )
            {
            // InternalBromium.g:1684:1: ( ( rule__TableActionContext__RowsLocatorAssignment_5 ) )
            // InternalBromium.g:1685:2: ( rule__TableActionContext__RowsLocatorAssignment_5 )
            {
             before(grammarAccess.getTableActionContextAccess().getRowsLocatorAssignment_5()); 
            // InternalBromium.g:1686:2: ( rule__TableActionContext__RowsLocatorAssignment_5 )
            // InternalBromium.g:1686:3: rule__TableActionContext__RowsLocatorAssignment_5
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
    // InternalBromium.g:1694:1: rule__TableActionContext__Group__6 : rule__TableActionContext__Group__6__Impl ;
    public final void rule__TableActionContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1698:1: ( rule__TableActionContext__Group__6__Impl )
            // InternalBromium.g:1699:2: rule__TableActionContext__Group__6__Impl
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
    // InternalBromium.g:1705:1: rule__TableActionContext__Group__6__Impl : ( ( rule__TableActionContext__RowSelectorAssignment_6 ) ) ;
    public final void rule__TableActionContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1709:1: ( ( ( rule__TableActionContext__RowSelectorAssignment_6 ) ) )
            // InternalBromium.g:1710:1: ( ( rule__TableActionContext__RowSelectorAssignment_6 ) )
            {
            // InternalBromium.g:1710:1: ( ( rule__TableActionContext__RowSelectorAssignment_6 ) )
            // InternalBromium.g:1711:2: ( rule__TableActionContext__RowSelectorAssignment_6 )
            {
             before(grammarAccess.getTableActionContextAccess().getRowSelectorAssignment_6()); 
            // InternalBromium.g:1712:2: ( rule__TableActionContext__RowSelectorAssignment_6 )
            // InternalBromium.g:1712:3: rule__TableActionContext__RowSelectorAssignment_6
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
    // InternalBromium.g:1721:1: rule__RowLocator__Group__0 : rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1 ;
    public final void rule__RowLocator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1725:1: ( rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1 )
            // InternalBromium.g:1726:2: rule__RowLocator__Group__0__Impl rule__RowLocator__Group__1
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
    // InternalBromium.g:1733:1: rule__RowLocator__Group__0__Impl : ( 'row' ) ;
    public final void rule__RowLocator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1737:1: ( ( 'row' ) )
            // InternalBromium.g:1738:1: ( 'row' )
            {
            // InternalBromium.g:1738:1: ( 'row' )
            // InternalBromium.g:1739:2: 'row'
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
    // InternalBromium.g:1748:1: rule__RowLocator__Group__1 : rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2 ;
    public final void rule__RowLocator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1752:1: ( rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2 )
            // InternalBromium.g:1753:2: rule__RowLocator__Group__1__Impl rule__RowLocator__Group__2
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
    // InternalBromium.g:1760:1: rule__RowLocator__Group__1__Impl : ( 'with' ) ;
    public final void rule__RowLocator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1764:1: ( ( 'with' ) )
            // InternalBromium.g:1765:1: ( 'with' )
            {
            // InternalBromium.g:1765:1: ( 'with' )
            // InternalBromium.g:1766:2: 'with'
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
    // InternalBromium.g:1775:1: rule__RowLocator__Group__2 : rule__RowLocator__Group__2__Impl ;
    public final void rule__RowLocator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1779:1: ( rule__RowLocator__Group__2__Impl )
            // InternalBromium.g:1780:2: rule__RowLocator__Group__2__Impl
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
    // InternalBromium.g:1786:1: rule__RowLocator__Group__2__Impl : ( ( rule__RowLocator__RowLocatorAssignment_2 ) ) ;
    public final void rule__RowLocator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1790:1: ( ( ( rule__RowLocator__RowLocatorAssignment_2 ) ) )
            // InternalBromium.g:1791:1: ( ( rule__RowLocator__RowLocatorAssignment_2 ) )
            {
            // InternalBromium.g:1791:1: ( ( rule__RowLocator__RowLocatorAssignment_2 ) )
            // InternalBromium.g:1792:2: ( rule__RowLocator__RowLocatorAssignment_2 )
            {
             before(grammarAccess.getRowLocatorAccess().getRowLocatorAssignment_2()); 
            // InternalBromium.g:1793:2: ( rule__RowLocator__RowLocatorAssignment_2 )
            // InternalBromium.g:1793:3: rule__RowLocator__RowLocatorAssignment_2
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
    // InternalBromium.g:1802:1: rule__RowIndex__Group__0 : rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1 ;
    public final void rule__RowIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1806:1: ( rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1 )
            // InternalBromium.g:1807:2: rule__RowIndex__Group__0__Impl rule__RowIndex__Group__1
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
    // InternalBromium.g:1814:1: rule__RowIndex__Group__0__Impl : ( 'row' ) ;
    public final void rule__RowIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1818:1: ( ( 'row' ) )
            // InternalBromium.g:1819:1: ( 'row' )
            {
            // InternalBromium.g:1819:1: ( 'row' )
            // InternalBromium.g:1820:2: 'row'
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
    // InternalBromium.g:1829:1: rule__RowIndex__Group__1 : rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2 ;
    public final void rule__RowIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1833:1: ( rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2 )
            // InternalBromium.g:1834:2: rule__RowIndex__Group__1__Impl rule__RowIndex__Group__2
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
    // InternalBromium.g:1841:1: rule__RowIndex__Group__1__Impl : ( 'number' ) ;
    public final void rule__RowIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1845:1: ( ( 'number' ) )
            // InternalBromium.g:1846:1: ( 'number' )
            {
            // InternalBromium.g:1846:1: ( 'number' )
            // InternalBromium.g:1847:2: 'number'
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
    // InternalBromium.g:1856:1: rule__RowIndex__Group__2 : rule__RowIndex__Group__2__Impl ;
    public final void rule__RowIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1860:1: ( rule__RowIndex__Group__2__Impl )
            // InternalBromium.g:1861:2: rule__RowIndex__Group__2__Impl
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
    // InternalBromium.g:1867:1: rule__RowIndex__Group__2__Impl : ( ( rule__RowIndex__IndexAssignment_2 ) ) ;
    public final void rule__RowIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1871:1: ( ( ( rule__RowIndex__IndexAssignment_2 ) ) )
            // InternalBromium.g:1872:1: ( ( rule__RowIndex__IndexAssignment_2 ) )
            {
            // InternalBromium.g:1872:1: ( ( rule__RowIndex__IndexAssignment_2 ) )
            // InternalBromium.g:1873:2: ( rule__RowIndex__IndexAssignment_2 )
            {
             before(grammarAccess.getRowIndexAccess().getIndexAssignment_2()); 
            // InternalBromium.g:1874:2: ( rule__RowIndex__IndexAssignment_2 )
            // InternalBromium.g:1874:3: rule__RowIndex__IndexAssignment_2
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
    // InternalBromium.g:1883:1: rule__ClassByText__Group__0 : rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1 ;
    public final void rule__ClassByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1887:1: ( rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1 )
            // InternalBromium.g:1888:2: rule__ClassByText__Group__0__Impl rule__ClassByText__Group__1
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
    // InternalBromium.g:1895:1: rule__ClassByText__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1899:1: ( ( 'class' ) )
            // InternalBromium.g:1900:1: ( 'class' )
            {
            // InternalBromium.g:1900:1: ( 'class' )
            // InternalBromium.g:1901:2: 'class'
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
    // InternalBromium.g:1910:1: rule__ClassByText__Group__1 : rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2 ;
    public final void rule__ClassByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1914:1: ( rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2 )
            // InternalBromium.g:1915:2: rule__ClassByText__Group__1__Impl rule__ClassByText__Group__2
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
    // InternalBromium.g:1922:1: rule__ClassByText__Group__1__Impl : ( ( rule__ClassByText__KlassAssignment_1 ) ) ;
    public final void rule__ClassByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1926:1: ( ( ( rule__ClassByText__KlassAssignment_1 ) ) )
            // InternalBromium.g:1927:1: ( ( rule__ClassByText__KlassAssignment_1 ) )
            {
            // InternalBromium.g:1927:1: ( ( rule__ClassByText__KlassAssignment_1 ) )
            // InternalBromium.g:1928:2: ( rule__ClassByText__KlassAssignment_1 )
            {
             before(grammarAccess.getClassByTextAccess().getKlassAssignment_1()); 
            // InternalBromium.g:1929:2: ( rule__ClassByText__KlassAssignment_1 )
            // InternalBromium.g:1929:3: rule__ClassByText__KlassAssignment_1
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
    // InternalBromium.g:1937:1: rule__ClassByText__Group__2 : rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3 ;
    public final void rule__ClassByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1941:1: ( rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3 )
            // InternalBromium.g:1942:2: rule__ClassByText__Group__2__Impl rule__ClassByText__Group__3
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
    // InternalBromium.g:1949:1: rule__ClassByText__Group__2__Impl : ( 'and' ) ;
    public final void rule__ClassByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1953:1: ( ( 'and' ) )
            // InternalBromium.g:1954:1: ( 'and' )
            {
            // InternalBromium.g:1954:1: ( 'and' )
            // InternalBromium.g:1955:2: 'and'
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
    // InternalBromium.g:1964:1: rule__ClassByText__Group__3 : rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4 ;
    public final void rule__ClassByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1968:1: ( rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4 )
            // InternalBromium.g:1969:2: rule__ClassByText__Group__3__Impl rule__ClassByText__Group__4
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
    // InternalBromium.g:1976:1: rule__ClassByText__Group__3__Impl : ( 'text' ) ;
    public final void rule__ClassByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1980:1: ( ( 'text' ) )
            // InternalBromium.g:1981:1: ( 'text' )
            {
            // InternalBromium.g:1981:1: ( 'text' )
            // InternalBromium.g:1982:2: 'text'
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
    // InternalBromium.g:1991:1: rule__ClassByText__Group__4 : rule__ClassByText__Group__4__Impl ;
    public final void rule__ClassByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1995:1: ( rule__ClassByText__Group__4__Impl )
            // InternalBromium.g:1996:2: rule__ClassByText__Group__4__Impl
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
    // InternalBromium.g:2002:1: rule__ClassByText__Group__4__Impl : ( ( rule__ClassByText__TextAssignment_4 ) ) ;
    public final void rule__ClassByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2006:1: ( ( ( rule__ClassByText__TextAssignment_4 ) ) )
            // InternalBromium.g:2007:1: ( ( rule__ClassByText__TextAssignment_4 ) )
            {
            // InternalBromium.g:2007:1: ( ( rule__ClassByText__TextAssignment_4 ) )
            // InternalBromium.g:2008:2: ( rule__ClassByText__TextAssignment_4 )
            {
             before(grammarAccess.getClassByTextAccess().getTextAssignment_4()); 
            // InternalBromium.g:2009:2: ( rule__ClassByText__TextAssignment_4 )
            // InternalBromium.g:2009:3: rule__ClassByText__TextAssignment_4
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


    // $ANTLR start "rule__CssSelector__Group__0"
    // InternalBromium.g:2018:1: rule__CssSelector__Group__0 : rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 ;
    public final void rule__CssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2022:1: ( rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1 )
            // InternalBromium.g:2023:2: rule__CssSelector__Group__0__Impl rule__CssSelector__Group__1
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
    // InternalBromium.g:2030:1: rule__CssSelector__Group__0__Impl : ( 'css' ) ;
    public final void rule__CssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2034:1: ( ( 'css' ) )
            // InternalBromium.g:2035:1: ( 'css' )
            {
            // InternalBromium.g:2035:1: ( 'css' )
            // InternalBromium.g:2036:2: 'css'
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
    // InternalBromium.g:2045:1: rule__CssSelector__Group__1 : rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2 ;
    public final void rule__CssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2049:1: ( rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2 )
            // InternalBromium.g:2050:2: rule__CssSelector__Group__1__Impl rule__CssSelector__Group__2
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
    // InternalBromium.g:2057:1: rule__CssSelector__Group__1__Impl : ( 'selector' ) ;
    public final void rule__CssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2061:1: ( ( 'selector' ) )
            // InternalBromium.g:2062:1: ( 'selector' )
            {
            // InternalBromium.g:2062:1: ( 'selector' )
            // InternalBromium.g:2063:2: 'selector'
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
    // InternalBromium.g:2072:1: rule__CssSelector__Group__2 : rule__CssSelector__Group__2__Impl ;
    public final void rule__CssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2076:1: ( rule__CssSelector__Group__2__Impl )
            // InternalBromium.g:2077:2: rule__CssSelector__Group__2__Impl
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
    // InternalBromium.g:2083:1: rule__CssSelector__Group__2__Impl : ( ( rule__CssSelector__SelectorAssignment_2 ) ) ;
    public final void rule__CssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2087:1: ( ( ( rule__CssSelector__SelectorAssignment_2 ) ) )
            // InternalBromium.g:2088:1: ( ( rule__CssSelector__SelectorAssignment_2 ) )
            {
            // InternalBromium.g:2088:1: ( ( rule__CssSelector__SelectorAssignment_2 ) )
            // InternalBromium.g:2089:2: ( rule__CssSelector__SelectorAssignment_2 )
            {
             before(grammarAccess.getCssSelectorAccess().getSelectorAssignment_2()); 
            // InternalBromium.g:2090:2: ( rule__CssSelector__SelectorAssignment_2 )
            // InternalBromium.g:2090:3: rule__CssSelector__SelectorAssignment_2
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
    // InternalBromium.g:2099:1: rule__SyntaxDefinition__Group__0 : rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 ;
    public final void rule__SyntaxDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2103:1: ( rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1 )
            // InternalBromium.g:2104:2: rule__SyntaxDefinition__Group__0__Impl rule__SyntaxDefinition__Group__1
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
    // InternalBromium.g:2111:1: rule__SyntaxDefinition__Group__0__Impl : ( () ) ;
    public final void rule__SyntaxDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2115:1: ( ( () ) )
            // InternalBromium.g:2116:1: ( () )
            {
            // InternalBromium.g:2116:1: ( () )
            // InternalBromium.g:2117:2: ()
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getSyntaxDefinitionAction_0()); 
            // InternalBromium.g:2118:2: ()
            // InternalBromium.g:2118:3: 
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
    // InternalBromium.g:2126:1: rule__SyntaxDefinition__Group__1 : rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 ;
    public final void rule__SyntaxDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2130:1: ( rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2 )
            // InternalBromium.g:2131:2: rule__SyntaxDefinition__Group__1__Impl rule__SyntaxDefinition__Group__2
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
    // InternalBromium.g:2138:1: rule__SyntaxDefinition__Group__1__Impl : ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) ;
    public final void rule__SyntaxDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2142:1: ( ( ( rule__SyntaxDefinition__ContentAssignment_1 ) ) )
            // InternalBromium.g:2143:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            {
            // InternalBromium.g:2143:1: ( ( rule__SyntaxDefinition__ContentAssignment_1 ) )
            // InternalBromium.g:2144:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getContentAssignment_1()); 
            // InternalBromium.g:2145:2: ( rule__SyntaxDefinition__ContentAssignment_1 )
            // InternalBromium.g:2145:3: rule__SyntaxDefinition__ContentAssignment_1
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
    // InternalBromium.g:2153:1: rule__SyntaxDefinition__Group__2 : rule__SyntaxDefinition__Group__2__Impl ;
    public final void rule__SyntaxDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2157:1: ( rule__SyntaxDefinition__Group__2__Impl )
            // InternalBromium.g:2158:2: rule__SyntaxDefinition__Group__2__Impl
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
    // InternalBromium.g:2164:1: rule__SyntaxDefinition__Group__2__Impl : ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) ;
    public final void rule__SyntaxDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2168:1: ( ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? ) )
            // InternalBromium.g:2169:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            {
            // InternalBromium.g:2169:1: ( ( rule__SyntaxDefinition__ParameterAssignment_2 )? )
            // InternalBromium.g:2170:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            {
             before(grammarAccess.getSyntaxDefinitionAccess().getParameterAssignment_2()); 
            // InternalBromium.g:2171:2: ( rule__SyntaxDefinition__ParameterAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBromium.g:2171:3: rule__SyntaxDefinition__ParameterAssignment_2
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
    // InternalBromium.g:2180:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2184:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalBromium.g:2185:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
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
    // InternalBromium.g:2192:1: rule__Precondition__Group__0__Impl : ( 'when' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2196:1: ( ( 'when' ) )
            // InternalBromium.g:2197:1: ( 'when' )
            {
            // InternalBromium.g:2197:1: ( 'when' )
            // InternalBromium.g:2198:2: 'when'
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
    // InternalBromium.g:2207:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2211:1: ( rule__Precondition__Group__1__Impl )
            // InternalBromium.g:2212:2: rule__Precondition__Group__1__Impl
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
    // InternalBromium.g:2218:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ActionAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2222:1: ( ( ( rule__Precondition__ActionAssignment_1 ) ) )
            // InternalBromium.g:2223:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            {
            // InternalBromium.g:2223:1: ( ( rule__Precondition__ActionAssignment_1 ) )
            // InternalBromium.g:2224:2: ( rule__Precondition__ActionAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getActionAssignment_1()); 
            // InternalBromium.g:2225:2: ( rule__Precondition__ActionAssignment_1 )
            // InternalBromium.g:2225:3: rule__Precondition__ActionAssignment_1
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
    // InternalBromium.g:2234:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2238:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalBromium.g:2239:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
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
    // InternalBromium.g:2246:1: rule__Postcondition__Group__0__Impl : ( 'then' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2250:1: ( ( 'then' ) )
            // InternalBromium.g:2251:1: ( 'then' )
            {
            // InternalBromium.g:2251:1: ( 'then' )
            // InternalBromium.g:2252:2: 'then'
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
    // InternalBromium.g:2261:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2265:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalBromium.g:2266:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
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
    // InternalBromium.g:2273:1: rule__Postcondition__Group__1__Impl : ( 'make' ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2277:1: ( ( 'make' ) )
            // InternalBromium.g:2278:1: ( 'make' )
            {
            // InternalBromium.g:2278:1: ( 'make' )
            // InternalBromium.g:2279:2: 'make'
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
    // InternalBromium.g:2288:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2292:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalBromium.g:2293:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
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
    // InternalBromium.g:2300:1: rule__Postcondition__Group__2__Impl : ( 'sure' ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2304:1: ( ( 'sure' ) )
            // InternalBromium.g:2305:1: ( 'sure' )
            {
            // InternalBromium.g:2305:1: ( 'sure' )
            // InternalBromium.g:2306:2: 'sure'
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
    // InternalBromium.g:2315:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2319:1: ( rule__Postcondition__Group__3__Impl )
            // InternalBromium.g:2320:2: rule__Postcondition__Group__3__Impl
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
    // InternalBromium.g:2326:1: rule__Postcondition__Group__3__Impl : ( ( rule__Postcondition__ActionAssignment_3 ) ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2330:1: ( ( ( rule__Postcondition__ActionAssignment_3 ) ) )
            // InternalBromium.g:2331:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            {
            // InternalBromium.g:2331:1: ( ( rule__Postcondition__ActionAssignment_3 ) )
            // InternalBromium.g:2332:2: ( rule__Postcondition__ActionAssignment_3 )
            {
             before(grammarAccess.getPostconditionAccess().getActionAssignment_3()); 
            // InternalBromium.g:2333:2: ( rule__Postcondition__ActionAssignment_3 )
            // InternalBromium.g:2333:3: rule__Postcondition__ActionAssignment_3
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
    // InternalBromium.g:2342:1: rule__ExpectHttpRequest__Group__0 : rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 ;
    public final void rule__ExpectHttpRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2346:1: ( rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1 )
            // InternalBromium.g:2347:2: rule__ExpectHttpRequest__Group__0__Impl rule__ExpectHttpRequest__Group__1
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
    // InternalBromium.g:2354:1: rule__ExpectHttpRequest__Group__0__Impl : ( () ) ;
    public final void rule__ExpectHttpRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2358:1: ( ( () ) )
            // InternalBromium.g:2359:1: ( () )
            {
            // InternalBromium.g:2359:1: ( () )
            // InternalBromium.g:2360:2: ()
            {
             before(grammarAccess.getExpectHttpRequestAccess().getExpectHttpRequestAction_0()); 
            // InternalBromium.g:2361:2: ()
            // InternalBromium.g:2361:3: 
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
    // InternalBromium.g:2369:1: rule__ExpectHttpRequest__Group__1 : rule__ExpectHttpRequest__Group__1__Impl ;
    public final void rule__ExpectHttpRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2373:1: ( rule__ExpectHttpRequest__Group__1__Impl )
            // InternalBromium.g:2374:2: rule__ExpectHttpRequest__Group__1__Impl
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
    // InternalBromium.g:2380:1: rule__ExpectHttpRequest__Group__1__Impl : ( ( rule__ExpectHttpRequest__Group_1__0 ) ) ;
    public final void rule__ExpectHttpRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2384:1: ( ( ( rule__ExpectHttpRequest__Group_1__0 ) ) )
            // InternalBromium.g:2385:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            {
            // InternalBromium.g:2385:1: ( ( rule__ExpectHttpRequest__Group_1__0 ) )
            // InternalBromium.g:2386:2: ( rule__ExpectHttpRequest__Group_1__0 )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getGroup_1()); 
            // InternalBromium.g:2387:2: ( rule__ExpectHttpRequest__Group_1__0 )
            // InternalBromium.g:2387:3: rule__ExpectHttpRequest__Group_1__0
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
    // InternalBromium.g:2396:1: rule__ExpectHttpRequest__Group_1__0 : rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 ;
    public final void rule__ExpectHttpRequest__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2400:1: ( rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1 )
            // InternalBromium.g:2401:2: rule__ExpectHttpRequest__Group_1__0__Impl rule__ExpectHttpRequest__Group_1__1
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
    // InternalBromium.g:2408:1: rule__ExpectHttpRequest__Group_1__0__Impl : ( 'do' ) ;
    public final void rule__ExpectHttpRequest__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2412:1: ( ( 'do' ) )
            // InternalBromium.g:2413:1: ( 'do' )
            {
            // InternalBromium.g:2413:1: ( 'do' )
            // InternalBromium.g:2414:2: 'do'
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
    // InternalBromium.g:2423:1: rule__ExpectHttpRequest__Group_1__1 : rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 ;
    public final void rule__ExpectHttpRequest__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2427:1: ( rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2 )
            // InternalBromium.g:2428:2: rule__ExpectHttpRequest__Group_1__1__Impl rule__ExpectHttpRequest__Group_1__2
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
    // InternalBromium.g:2435:1: rule__ExpectHttpRequest__Group_1__1__Impl : ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) ;
    public final void rule__ExpectHttpRequest__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2439:1: ( ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? ) )
            // InternalBromium.g:2440:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            {
            // InternalBromium.g:2440:1: ( ( rule__ExpectHttpRequest__NotAssignment_1_1 )? )
            // InternalBromium.g:2441:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotAssignment_1_1()); 
            // InternalBromium.g:2442:2: ( rule__ExpectHttpRequest__NotAssignment_1_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==51) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBromium.g:2442:3: rule__ExpectHttpRequest__NotAssignment_1_1
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
    // InternalBromium.g:2450:1: rule__ExpectHttpRequest__Group_1__2 : rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 ;
    public final void rule__ExpectHttpRequest__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2454:1: ( rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3 )
            // InternalBromium.g:2455:2: rule__ExpectHttpRequest__Group_1__2__Impl rule__ExpectHttpRequest__Group_1__3
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
    // InternalBromium.g:2462:1: rule__ExpectHttpRequest__Group_1__2__Impl : ( 'expect' ) ;
    public final void rule__ExpectHttpRequest__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2466:1: ( ( 'expect' ) )
            // InternalBromium.g:2467:1: ( 'expect' )
            {
            // InternalBromium.g:2467:1: ( 'expect' )
            // InternalBromium.g:2468:2: 'expect'
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
    // InternalBromium.g:2477:1: rule__ExpectHttpRequest__Group_1__3 : rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 ;
    public final void rule__ExpectHttpRequest__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2481:1: ( rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4 )
            // InternalBromium.g:2482:2: rule__ExpectHttpRequest__Group_1__3__Impl rule__ExpectHttpRequest__Group_1__4
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
    // InternalBromium.g:2489:1: rule__ExpectHttpRequest__Group_1__3__Impl : ( 'http' ) ;
    public final void rule__ExpectHttpRequest__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2493:1: ( ( 'http' ) )
            // InternalBromium.g:2494:1: ( 'http' )
            {
            // InternalBromium.g:2494:1: ( 'http' )
            // InternalBromium.g:2495:2: 'http'
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
    // InternalBromium.g:2504:1: rule__ExpectHttpRequest__Group_1__4 : rule__ExpectHttpRequest__Group_1__4__Impl ;
    public final void rule__ExpectHttpRequest__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2508:1: ( rule__ExpectHttpRequest__Group_1__4__Impl )
            // InternalBromium.g:2509:2: rule__ExpectHttpRequest__Group_1__4__Impl
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
    // InternalBromium.g:2515:1: rule__ExpectHttpRequest__Group_1__4__Impl : ( 'request' ) ;
    public final void rule__ExpectHttpRequest__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2519:1: ( ( 'request' ) )
            // InternalBromium.g:2520:1: ( 'request' )
            {
            // InternalBromium.g:2520:1: ( 'request' )
            // InternalBromium.g:2521:2: 'request'
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
    // InternalBromium.g:2531:1: rule__ElementByCssToBePresent__Group__0 : rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 ;
    public final void rule__ElementByCssToBePresent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2535:1: ( rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1 )
            // InternalBromium.g:2536:2: rule__ElementByCssToBePresent__Group__0__Impl rule__ElementByCssToBePresent__Group__1
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
    // InternalBromium.g:2543:1: rule__ElementByCssToBePresent__Group__0__Impl : ( 'element' ) ;
    public final void rule__ElementByCssToBePresent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2547:1: ( ( 'element' ) )
            // InternalBromium.g:2548:1: ( 'element' )
            {
            // InternalBromium.g:2548:1: ( 'element' )
            // InternalBromium.g:2549:2: 'element'
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
    // InternalBromium.g:2558:1: rule__ElementByCssToBePresent__Group__1 : rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 ;
    public final void rule__ElementByCssToBePresent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2562:1: ( rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2 )
            // InternalBromium.g:2563:2: rule__ElementByCssToBePresent__Group__1__Impl rule__ElementByCssToBePresent__Group__2
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
    // InternalBromium.g:2570:1: rule__ElementByCssToBePresent__Group__1__Impl : ( 'with' ) ;
    public final void rule__ElementByCssToBePresent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2574:1: ( ( 'with' ) )
            // InternalBromium.g:2575:1: ( 'with' )
            {
            // InternalBromium.g:2575:1: ( 'with' )
            // InternalBromium.g:2576:2: 'with'
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
    // InternalBromium.g:2585:1: rule__ElementByCssToBePresent__Group__2 : rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 ;
    public final void rule__ElementByCssToBePresent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2589:1: ( rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3 )
            // InternalBromium.g:2590:2: rule__ElementByCssToBePresent__Group__2__Impl rule__ElementByCssToBePresent__Group__3
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
    // InternalBromium.g:2597:1: rule__ElementByCssToBePresent__Group__2__Impl : ( 'css' ) ;
    public final void rule__ElementByCssToBePresent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2601:1: ( ( 'css' ) )
            // InternalBromium.g:2602:1: ( 'css' )
            {
            // InternalBromium.g:2602:1: ( 'css' )
            // InternalBromium.g:2603:2: 'css'
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
    // InternalBromium.g:2612:1: rule__ElementByCssToBePresent__Group__3 : rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 ;
    public final void rule__ElementByCssToBePresent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2616:1: ( rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4 )
            // InternalBromium.g:2617:2: rule__ElementByCssToBePresent__Group__3__Impl rule__ElementByCssToBePresent__Group__4
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
    // InternalBromium.g:2624:1: rule__ElementByCssToBePresent__Group__3__Impl : ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2628:1: ( ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:2629:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:2629:1: ( ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:2630:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:2631:2: ( rule__ElementByCssToBePresent__ParameterNamesAssignment_3 )
            // InternalBromium.g:2631:3: rule__ElementByCssToBePresent__ParameterNamesAssignment_3
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
    // InternalBromium.g:2639:1: rule__ElementByCssToBePresent__Group__4 : rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 ;
    public final void rule__ElementByCssToBePresent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2643:1: ( rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5 )
            // InternalBromium.g:2644:2: rule__ElementByCssToBePresent__Group__4__Impl rule__ElementByCssToBePresent__Group__5
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
    // InternalBromium.g:2651:1: rule__ElementByCssToBePresent__Group__4__Impl : ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) ;
    public final void rule__ElementByCssToBePresent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2655:1: ( ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:2656:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:2656:1: ( ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:2657:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:2658:2: ( rule__ElementByCssToBePresent__ParameterValuesAssignment_4 )
            // InternalBromium.g:2658:3: rule__ElementByCssToBePresent__ParameterValuesAssignment_4
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
    // InternalBromium.g:2666:1: rule__ElementByCssToBePresent__Group__5 : rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 ;
    public final void rule__ElementByCssToBePresent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2670:1: ( rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6 )
            // InternalBromium.g:2671:2: rule__ElementByCssToBePresent__Group__5__Impl rule__ElementByCssToBePresent__Group__6
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
    // InternalBromium.g:2678:1: rule__ElementByCssToBePresent__Group__5__Impl : ( 'is' ) ;
    public final void rule__ElementByCssToBePresent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2682:1: ( ( 'is' ) )
            // InternalBromium.g:2683:1: ( 'is' )
            {
            // InternalBromium.g:2683:1: ( 'is' )
            // InternalBromium.g:2684:2: 'is'
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
    // InternalBromium.g:2693:1: rule__ElementByCssToBePresent__Group__6 : rule__ElementByCssToBePresent__Group__6__Impl ;
    public final void rule__ElementByCssToBePresent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2697:1: ( rule__ElementByCssToBePresent__Group__6__Impl )
            // InternalBromium.g:2698:2: rule__ElementByCssToBePresent__Group__6__Impl
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
    // InternalBromium.g:2704:1: rule__ElementByCssToBePresent__Group__6__Impl : ( 'present' ) ;
    public final void rule__ElementByCssToBePresent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2708:1: ( ( 'present' ) )
            // InternalBromium.g:2709:1: ( 'present' )
            {
            // InternalBromium.g:2709:1: ( 'present' )
            // InternalBromium.g:2710:2: 'present'
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
    // InternalBromium.g:2720:1: rule__ClickCssSelector__Group__0 : rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 ;
    public final void rule__ClickCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2724:1: ( rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1 )
            // InternalBromium.g:2725:2: rule__ClickCssSelector__Group__0__Impl rule__ClickCssSelector__Group__1
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
    // InternalBromium.g:2732:1: rule__ClickCssSelector__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2736:1: ( ( 'click' ) )
            // InternalBromium.g:2737:1: ( 'click' )
            {
            // InternalBromium.g:2737:1: ( 'click' )
            // InternalBromium.g:2738:2: 'click'
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
    // InternalBromium.g:2747:1: rule__ClickCssSelector__Group__1 : rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 ;
    public final void rule__ClickCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2751:1: ( rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2 )
            // InternalBromium.g:2752:2: rule__ClickCssSelector__Group__1__Impl rule__ClickCssSelector__Group__2
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
    // InternalBromium.g:2759:1: rule__ClickCssSelector__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2763:1: ( ( 'on' ) )
            // InternalBromium.g:2764:1: ( 'on' )
            {
            // InternalBromium.g:2764:1: ( 'on' )
            // InternalBromium.g:2765:2: 'on'
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
    // InternalBromium.g:2774:1: rule__ClickCssSelector__Group__2 : rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 ;
    public final void rule__ClickCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2778:1: ( rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3 )
            // InternalBromium.g:2779:2: rule__ClickCssSelector__Group__2__Impl rule__ClickCssSelector__Group__3
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
    // InternalBromium.g:2786:1: rule__ClickCssSelector__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2790:1: ( ( 'element' ) )
            // InternalBromium.g:2791:1: ( 'element' )
            {
            // InternalBromium.g:2791:1: ( 'element' )
            // InternalBromium.g:2792:2: 'element'
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
    // InternalBromium.g:2801:1: rule__ClickCssSelector__Group__3 : rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 ;
    public final void rule__ClickCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2805:1: ( rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4 )
            // InternalBromium.g:2806:2: rule__ClickCssSelector__Group__3__Impl rule__ClickCssSelector__Group__4
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
    // InternalBromium.g:2813:1: rule__ClickCssSelector__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2817:1: ( ( 'with' ) )
            // InternalBromium.g:2818:1: ( 'with' )
            {
            // InternalBromium.g:2818:1: ( 'with' )
            // InternalBromium.g:2819:2: 'with'
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
    // InternalBromium.g:2828:1: rule__ClickCssSelector__Group__4 : rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 ;
    public final void rule__ClickCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2832:1: ( rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5 )
            // InternalBromium.g:2833:2: rule__ClickCssSelector__Group__4__Impl rule__ClickCssSelector__Group__5
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
    // InternalBromium.g:2840:1: rule__ClickCssSelector__Group__4__Impl : ( 'css' ) ;
    public final void rule__ClickCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2844:1: ( ( 'css' ) )
            // InternalBromium.g:2845:1: ( 'css' )
            {
            // InternalBromium.g:2845:1: ( 'css' )
            // InternalBromium.g:2846:2: 'css'
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
    // InternalBromium.g:2855:1: rule__ClickCssSelector__Group__5 : rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 ;
    public final void rule__ClickCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2859:1: ( rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6 )
            // InternalBromium.g:2860:2: rule__ClickCssSelector__Group__5__Impl rule__ClickCssSelector__Group__6
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
    // InternalBromium.g:2867:1: rule__ClickCssSelector__Group__5__Impl : ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) ;
    public final void rule__ClickCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2871:1: ( ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) ) )
            // InternalBromium.g:2872:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            {
            // InternalBromium.g:2872:1: ( ( rule__ClickCssSelector__ParameterNamesAssignment_5 ) )
            // InternalBromium.g:2873:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesAssignment_5()); 
            // InternalBromium.g:2874:2: ( rule__ClickCssSelector__ParameterNamesAssignment_5 )
            // InternalBromium.g:2874:3: rule__ClickCssSelector__ParameterNamesAssignment_5
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
    // InternalBromium.g:2882:1: rule__ClickCssSelector__Group__6 : rule__ClickCssSelector__Group__6__Impl ;
    public final void rule__ClickCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2886:1: ( rule__ClickCssSelector__Group__6__Impl )
            // InternalBromium.g:2887:2: rule__ClickCssSelector__Group__6__Impl
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
    // InternalBromium.g:2893:1: rule__ClickCssSelector__Group__6__Impl : ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) ;
    public final void rule__ClickCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2897:1: ( ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) ) )
            // InternalBromium.g:2898:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            {
            // InternalBromium.g:2898:1: ( ( rule__ClickCssSelector__ParameterValuesAssignment_6 ) )
            // InternalBromium.g:2899:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterValuesAssignment_6()); 
            // InternalBromium.g:2900:2: ( rule__ClickCssSelector__ParameterValuesAssignment_6 )
            // InternalBromium.g:2900:3: rule__ClickCssSelector__ParameterValuesAssignment_6
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
    // InternalBromium.g:2909:1: rule__PageLoad__Group__0 : rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 ;
    public final void rule__PageLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2913:1: ( rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 )
            // InternalBromium.g:2914:2: rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1
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
    // InternalBromium.g:2921:1: rule__PageLoad__Group__0__Impl : ( 'load' ) ;
    public final void rule__PageLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2925:1: ( ( 'load' ) )
            // InternalBromium.g:2926:1: ( 'load' )
            {
            // InternalBromium.g:2926:1: ( 'load' )
            // InternalBromium.g:2927:2: 'load'
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
    // InternalBromium.g:2936:1: rule__PageLoad__Group__1 : rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 ;
    public final void rule__PageLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2940:1: ( rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 )
            // InternalBromium.g:2941:2: rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2
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
    // InternalBromium.g:2948:1: rule__PageLoad__Group__1__Impl : ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) ;
    public final void rule__PageLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2952:1: ( ( ( rule__PageLoad__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:2953:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:2953:1: ( ( rule__PageLoad__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:2954:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:2955:2: ( rule__PageLoad__ParameterNamesAssignment_1 )
            // InternalBromium.g:2955:3: rule__PageLoad__ParameterNamesAssignment_1
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
    // InternalBromium.g:2963:1: rule__PageLoad__Group__2 : rule__PageLoad__Group__2__Impl ;
    public final void rule__PageLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2967:1: ( rule__PageLoad__Group__2__Impl )
            // InternalBromium.g:2968:2: rule__PageLoad__Group__2__Impl
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
    // InternalBromium.g:2974:1: rule__PageLoad__Group__2__Impl : ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) ;
    public final void rule__PageLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2978:1: ( ( ( rule__PageLoad__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:2979:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:2979:1: ( ( rule__PageLoad__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:2980:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getPageLoadAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:2981:2: ( rule__PageLoad__ParameterValuesAssignment_2 )
            // InternalBromium.g:2981:3: rule__PageLoad__ParameterValuesAssignment_2
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
    // InternalBromium.g:2990:1: rule__TypeTextInElementFoundByCssSelector__Group__0 : rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2994:1: ( rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 )
            // InternalBromium.g:2995:2: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1
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
    // InternalBromium.g:3002:1: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3006:1: ( ( 'type' ) )
            // InternalBromium.g:3007:1: ( 'type' )
            {
            // InternalBromium.g:3007:1: ( 'type' )
            // InternalBromium.g:3008:2: 'type'
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
    // InternalBromium.g:3017:1: rule__TypeTextInElementFoundByCssSelector__Group__1 : rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3021:1: ( rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 )
            // InternalBromium.g:3022:2: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2
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
    // InternalBromium.g:3029:1: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3033:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:3034:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:3034:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:3035:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:3036:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:3036:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1
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
    // InternalBromium.g:3044:1: rule__TypeTextInElementFoundByCssSelector__Group__2 : rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3048:1: ( rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 )
            // InternalBromium.g:3049:2: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3
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
    // InternalBromium.g:3056:1: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3060:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:3061:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:3061:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:3062:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:3063:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:3063:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2
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
    // InternalBromium.g:3071:1: rule__TypeTextInElementFoundByCssSelector__Group__3 : rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3075:1: ( rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 )
            // InternalBromium.g:3076:2: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4
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
    // InternalBromium.g:3083:1: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl : ( 'in' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3087:1: ( ( 'in' ) )
            // InternalBromium.g:3088:1: ( 'in' )
            {
            // InternalBromium.g:3088:1: ( 'in' )
            // InternalBromium.g:3089:2: 'in'
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
    // InternalBromium.g:3098:1: rule__TypeTextInElementFoundByCssSelector__Group__4 : rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3102:1: ( rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 )
            // InternalBromium.g:3103:2: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5
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
    // InternalBromium.g:3110:1: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl : ( 'element' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3114:1: ( ( 'element' ) )
            // InternalBromium.g:3115:1: ( 'element' )
            {
            // InternalBromium.g:3115:1: ( 'element' )
            // InternalBromium.g:3116:2: 'element'
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
    // InternalBromium.g:3125:1: rule__TypeTextInElementFoundByCssSelector__Group__5 : rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3129:1: ( rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 )
            // InternalBromium.g:3130:2: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6
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
    // InternalBromium.g:3137:1: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl : ( 'with' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3141:1: ( ( 'with' ) )
            // InternalBromium.g:3142:1: ( 'with' )
            {
            // InternalBromium.g:3142:1: ( 'with' )
            // InternalBromium.g:3143:2: 'with'
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
    // InternalBromium.g:3152:1: rule__TypeTextInElementFoundByCssSelector__Group__6 : rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3156:1: ( rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 )
            // InternalBromium.g:3157:2: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7
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
    // InternalBromium.g:3164:1: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl : ( 'css' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3168:1: ( ( 'css' ) )
            // InternalBromium.g:3169:1: ( 'css' )
            {
            // InternalBromium.g:3169:1: ( 'css' )
            // InternalBromium.g:3170:2: 'css'
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
    // InternalBromium.g:3179:1: rule__TypeTextInElementFoundByCssSelector__Group__7 : rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3183:1: ( rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8 )
            // InternalBromium.g:3184:2: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl rule__TypeTextInElementFoundByCssSelector__Group__8
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
    // InternalBromium.g:3191:1: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3195:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:3196:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:3196:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:3197:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:3198:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 )
            // InternalBromium.g:3198:3: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7
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
    // InternalBromium.g:3206:1: rule__TypeTextInElementFoundByCssSelector__Group__8 : rule__TypeTextInElementFoundByCssSelector__Group__8__Impl ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3210:1: ( rule__TypeTextInElementFoundByCssSelector__Group__8__Impl )
            // InternalBromium.g:3211:2: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl
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
    // InternalBromium.g:3217:1: rule__TypeTextInElementFoundByCssSelector__Group__8__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3221:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:3222:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:3222:1: ( ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:3223:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:3224:2: ( rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 )
            // InternalBromium.g:3224:3: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8
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
    // InternalBromium.g:3233:1: rule__TextOfElementWithCssSelectorToBe__Group__0 : rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3237:1: ( rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1 )
            // InternalBromium.g:3238:2: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl rule__TextOfElementWithCssSelectorToBe__Group__1
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
    // InternalBromium.g:3245:1: rule__TextOfElementWithCssSelectorToBe__Group__0__Impl : ( 'element' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3249:1: ( ( 'element' ) )
            // InternalBromium.g:3250:1: ( 'element' )
            {
            // InternalBromium.g:3250:1: ( 'element' )
            // InternalBromium.g:3251:2: 'element'
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
    // InternalBromium.g:3260:1: rule__TextOfElementWithCssSelectorToBe__Group__1 : rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3264:1: ( rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2 )
            // InternalBromium.g:3265:2: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl rule__TextOfElementWithCssSelectorToBe__Group__2
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
    // InternalBromium.g:3272:1: rule__TextOfElementWithCssSelectorToBe__Group__1__Impl : ( 'with' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3276:1: ( ( 'with' ) )
            // InternalBromium.g:3277:1: ( 'with' )
            {
            // InternalBromium.g:3277:1: ( 'with' )
            // InternalBromium.g:3278:2: 'with'
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
    // InternalBromium.g:3287:1: rule__TextOfElementWithCssSelectorToBe__Group__2 : rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3291:1: ( rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3 )
            // InternalBromium.g:3292:2: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl rule__TextOfElementWithCssSelectorToBe__Group__3
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
    // InternalBromium.g:3299:1: rule__TextOfElementWithCssSelectorToBe__Group__2__Impl : ( 'css' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3303:1: ( ( 'css' ) )
            // InternalBromium.g:3304:1: ( 'css' )
            {
            // InternalBromium.g:3304:1: ( 'css' )
            // InternalBromium.g:3305:2: 'css'
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
    // InternalBromium.g:3314:1: rule__TextOfElementWithCssSelectorToBe__Group__3 : rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3318:1: ( rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4 )
            // InternalBromium.g:3319:2: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl rule__TextOfElementWithCssSelectorToBe__Group__4
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
    // InternalBromium.g:3326:1: rule__TextOfElementWithCssSelectorToBe__Group__3__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3330:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) ) )
            // InternalBromium.g:3331:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            {
            // InternalBromium.g:3331:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 ) )
            // InternalBromium.g:3332:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_3()); 
            // InternalBromium.g:3333:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 )
            // InternalBromium.g:3333:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3
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
    // InternalBromium.g:3341:1: rule__TextOfElementWithCssSelectorToBe__Group__4 : rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3345:1: ( rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5 )
            // InternalBromium.g:3346:2: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl rule__TextOfElementWithCssSelectorToBe__Group__5
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
    // InternalBromium.g:3353:1: rule__TextOfElementWithCssSelectorToBe__Group__4__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3357:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) ) )
            // InternalBromium.g:3358:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            {
            // InternalBromium.g:3358:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 ) )
            // InternalBromium.g:3359:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_4()); 
            // InternalBromium.g:3360:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 )
            // InternalBromium.g:3360:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4
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
    // InternalBromium.g:3368:1: rule__TextOfElementWithCssSelectorToBe__Group__5 : rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3372:1: ( rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6 )
            // InternalBromium.g:3373:2: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl rule__TextOfElementWithCssSelectorToBe__Group__6
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
    // InternalBromium.g:3380:1: rule__TextOfElementWithCssSelectorToBe__Group__5__Impl : ( 'has' ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3384:1: ( ( 'has' ) )
            // InternalBromium.g:3385:1: ( 'has' )
            {
            // InternalBromium.g:3385:1: ( 'has' )
            // InternalBromium.g:3386:2: 'has'
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
    // InternalBromium.g:3395:1: rule__TextOfElementWithCssSelectorToBe__Group__6 : rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3399:1: ( rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7 )
            // InternalBromium.g:3400:2: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl rule__TextOfElementWithCssSelectorToBe__Group__7
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
    // InternalBromium.g:3407:1: rule__TextOfElementWithCssSelectorToBe__Group__6__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3411:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) ) )
            // InternalBromium.g:3412:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            {
            // InternalBromium.g:3412:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 ) )
            // InternalBromium.g:3413:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_6()); 
            // InternalBromium.g:3414:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 )
            // InternalBromium.g:3414:3: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6
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
    // InternalBromium.g:3422:1: rule__TextOfElementWithCssSelectorToBe__Group__7 : rule__TextOfElementWithCssSelectorToBe__Group__7__Impl ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3426:1: ( rule__TextOfElementWithCssSelectorToBe__Group__7__Impl )
            // InternalBromium.g:3427:2: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl
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
    // InternalBromium.g:3433:1: rule__TextOfElementWithCssSelectorToBe__Group__7__Impl : ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3437:1: ( ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) ) )
            // InternalBromium.g:3438:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            {
            // InternalBromium.g:3438:1: ( ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 ) )
            // InternalBromium.g:3439:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_7()); 
            // InternalBromium.g:3440:2: ( rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 )
            // InternalBromium.g:3440:3: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7
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
    // InternalBromium.g:3449:1: rule__ClickClassByText__Group__0 : rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 ;
    public final void rule__ClickClassByText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3453:1: ( rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1 )
            // InternalBromium.g:3454:2: rule__ClickClassByText__Group__0__Impl rule__ClickClassByText__Group__1
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
    // InternalBromium.g:3461:1: rule__ClickClassByText__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickClassByText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3465:1: ( ( 'click' ) )
            // InternalBromium.g:3466:1: ( 'click' )
            {
            // InternalBromium.g:3466:1: ( 'click' )
            // InternalBromium.g:3467:2: 'click'
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
    // InternalBromium.g:3476:1: rule__ClickClassByText__Group__1 : rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 ;
    public final void rule__ClickClassByText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3480:1: ( rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2 )
            // InternalBromium.g:3481:2: rule__ClickClassByText__Group__1__Impl rule__ClickClassByText__Group__2
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
    // InternalBromium.g:3488:1: rule__ClickClassByText__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickClassByText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3492:1: ( ( 'on' ) )
            // InternalBromium.g:3493:1: ( 'on' )
            {
            // InternalBromium.g:3493:1: ( 'on' )
            // InternalBromium.g:3494:2: 'on'
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
    // InternalBromium.g:3503:1: rule__ClickClassByText__Group__2 : rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 ;
    public final void rule__ClickClassByText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3507:1: ( rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3 )
            // InternalBromium.g:3508:2: rule__ClickClassByText__Group__2__Impl rule__ClickClassByText__Group__3
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
    // InternalBromium.g:3515:1: rule__ClickClassByText__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickClassByText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3519:1: ( ( 'element' ) )
            // InternalBromium.g:3520:1: ( 'element' )
            {
            // InternalBromium.g:3520:1: ( 'element' )
            // InternalBromium.g:3521:2: 'element'
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
    // InternalBromium.g:3530:1: rule__ClickClassByText__Group__3 : rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 ;
    public final void rule__ClickClassByText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3534:1: ( rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4 )
            // InternalBromium.g:3535:2: rule__ClickClassByText__Group__3__Impl rule__ClickClassByText__Group__4
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
    // InternalBromium.g:3542:1: rule__ClickClassByText__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickClassByText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3546:1: ( ( 'with' ) )
            // InternalBromium.g:3547:1: ( 'with' )
            {
            // InternalBromium.g:3547:1: ( 'with' )
            // InternalBromium.g:3548:2: 'with'
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
    // InternalBromium.g:3557:1: rule__ClickClassByText__Group__4 : rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 ;
    public final void rule__ClickClassByText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3561:1: ( rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5 )
            // InternalBromium.g:3562:2: rule__ClickClassByText__Group__4__Impl rule__ClickClassByText__Group__5
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
    // InternalBromium.g:3569:1: rule__ClickClassByText__Group__4__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickClassByText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3573:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:3574:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:3574:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:3575:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:3576:2: ( rule__ClickClassByText__ParameterNamesAssignment_4 )
            // InternalBromium.g:3576:3: rule__ClickClassByText__ParameterNamesAssignment_4
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
    // InternalBromium.g:3584:1: rule__ClickClassByText__Group__5 : rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 ;
    public final void rule__ClickClassByText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3588:1: ( rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6 )
            // InternalBromium.g:3589:2: rule__ClickClassByText__Group__5__Impl rule__ClickClassByText__Group__6
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
    // InternalBromium.g:3596:1: rule__ClickClassByText__Group__5__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickClassByText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3600:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:3601:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:3601:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:3602:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:3603:2: ( rule__ClickClassByText__ParameterValuesAssignment_5 )
            // InternalBromium.g:3603:3: rule__ClickClassByText__ParameterValuesAssignment_5
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
    // InternalBromium.g:3611:1: rule__ClickClassByText__Group__6 : rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 ;
    public final void rule__ClickClassByText__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3615:1: ( rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7 )
            // InternalBromium.g:3616:2: rule__ClickClassByText__Group__6__Impl rule__ClickClassByText__Group__7
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
    // InternalBromium.g:3623:1: rule__ClickClassByText__Group__6__Impl : ( 'and' ) ;
    public final void rule__ClickClassByText__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3627:1: ( ( 'and' ) )
            // InternalBromium.g:3628:1: ( 'and' )
            {
            // InternalBromium.g:3628:1: ( 'and' )
            // InternalBromium.g:3629:2: 'and'
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
    // InternalBromium.g:3638:1: rule__ClickClassByText__Group__7 : rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 ;
    public final void rule__ClickClassByText__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3642:1: ( rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8 )
            // InternalBromium.g:3643:2: rule__ClickClassByText__Group__7__Impl rule__ClickClassByText__Group__8
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
    // InternalBromium.g:3650:1: rule__ClickClassByText__Group__7__Impl : ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) ;
    public final void rule__ClickClassByText__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3654:1: ( ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:3655:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:3655:1: ( ( rule__ClickClassByText__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:3656:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:3657:2: ( rule__ClickClassByText__ParameterNamesAssignment_7 )
            // InternalBromium.g:3657:3: rule__ClickClassByText__ParameterNamesAssignment_7
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
    // InternalBromium.g:3665:1: rule__ClickClassByText__Group__8 : rule__ClickClassByText__Group__8__Impl ;
    public final void rule__ClickClassByText__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3669:1: ( rule__ClickClassByText__Group__8__Impl )
            // InternalBromium.g:3670:2: rule__ClickClassByText__Group__8__Impl
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
    // InternalBromium.g:3676:1: rule__ClickClassByText__Group__8__Impl : ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) ;
    public final void rule__ClickClassByText__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3680:1: ( ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:3681:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:3681:1: ( ( rule__ClickClassByText__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:3682:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:3683:2: ( rule__ClickClassByText__ParameterValuesAssignment_8 )
            // InternalBromium.g:3683:3: rule__ClickClassByText__ParameterValuesAssignment_8
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
    // InternalBromium.g:3692:1: rule__SetVariableToTextOfElementWithCssSelector__Group__0 : rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3696:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1 )
            // InternalBromium.g:3697:2: rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__1
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
    // InternalBromium.g:3704:1: rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3708:1: ( ( 'set' ) )
            // InternalBromium.g:3709:1: ( 'set' )
            {
            // InternalBromium.g:3709:1: ( 'set' )
            // InternalBromium.g:3710:2: 'set'
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
    // InternalBromium.g:3719:1: rule__SetVariableToTextOfElementWithCssSelector__Group__1 : rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3723:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2 )
            // InternalBromium.g:3724:2: rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__2
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
    // InternalBromium.g:3731:1: rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3735:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:3736:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:3736:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:3737:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:3738:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 )
            // InternalBromium.g:3738:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1
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
    // InternalBromium.g:3746:1: rule__SetVariableToTextOfElementWithCssSelector__Group__2 : rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3750:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3 )
            // InternalBromium.g:3751:2: rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__3
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
    // InternalBromium.g:3758:1: rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3762:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:3763:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:3763:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:3764:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:3765:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 )
            // InternalBromium.g:3765:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2
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
    // InternalBromium.g:3773:1: rule__SetVariableToTextOfElementWithCssSelector__Group__3 : rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3777:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4 )
            // InternalBromium.g:3778:2: rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__4
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
    // InternalBromium.g:3785:1: rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl : ( 'to' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3789:1: ( ( 'to' ) )
            // InternalBromium.g:3790:1: ( 'to' )
            {
            // InternalBromium.g:3790:1: ( 'to' )
            // InternalBromium.g:3791:2: 'to'
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
    // InternalBromium.g:3800:1: rule__SetVariableToTextOfElementWithCssSelector__Group__4 : rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3804:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5 )
            // InternalBromium.g:3805:2: rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__5
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
    // InternalBromium.g:3812:1: rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl : ( 'the' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3816:1: ( ( 'the' ) )
            // InternalBromium.g:3817:1: ( 'the' )
            {
            // InternalBromium.g:3817:1: ( 'the' )
            // InternalBromium.g:3818:2: 'the'
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
    // InternalBromium.g:3827:1: rule__SetVariableToTextOfElementWithCssSelector__Group__5 : rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3831:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6 )
            // InternalBromium.g:3832:2: rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__6
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
    // InternalBromium.g:3839:1: rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl : ( 'text' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3843:1: ( ( 'text' ) )
            // InternalBromium.g:3844:1: ( 'text' )
            {
            // InternalBromium.g:3844:1: ( 'text' )
            // InternalBromium.g:3845:2: 'text'
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
    // InternalBromium.g:3854:1: rule__SetVariableToTextOfElementWithCssSelector__Group__6 : rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3858:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7 )
            // InternalBromium.g:3859:2: rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__7
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
    // InternalBromium.g:3866:1: rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl : ( 'of' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3870:1: ( ( 'of' ) )
            // InternalBromium.g:3871:1: ( 'of' )
            {
            // InternalBromium.g:3871:1: ( 'of' )
            // InternalBromium.g:3872:2: 'of'
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
    // InternalBromium.g:3881:1: rule__SetVariableToTextOfElementWithCssSelector__Group__7 : rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3885:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8 )
            // InternalBromium.g:3886:2: rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__8
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
    // InternalBromium.g:3893:1: rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl : ( 'element' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3897:1: ( ( 'element' ) )
            // InternalBromium.g:3898:1: ( 'element' )
            {
            // InternalBromium.g:3898:1: ( 'element' )
            // InternalBromium.g:3899:2: 'element'
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
    // InternalBromium.g:3908:1: rule__SetVariableToTextOfElementWithCssSelector__Group__8 : rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3912:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9 )
            // InternalBromium.g:3913:2: rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__9
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
    // InternalBromium.g:3920:1: rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl : ( 'with' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3924:1: ( ( 'with' ) )
            // InternalBromium.g:3925:1: ( 'with' )
            {
            // InternalBromium.g:3925:1: ( 'with' )
            // InternalBromium.g:3926:2: 'with'
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
    // InternalBromium.g:3935:1: rule__SetVariableToTextOfElementWithCssSelector__Group__9 : rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3939:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10 )
            // InternalBromium.g:3940:2: rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__10
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
    // InternalBromium.g:3947:1: rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl : ( 'css' ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3951:1: ( ( 'css' ) )
            // InternalBromium.g:3952:1: ( 'css' )
            {
            // InternalBromium.g:3952:1: ( 'css' )
            // InternalBromium.g:3953:2: 'css'
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
    // InternalBromium.g:3962:1: rule__SetVariableToTextOfElementWithCssSelector__Group__10 : rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11 ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3966:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11 )
            // InternalBromium.g:3967:2: rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl rule__SetVariableToTextOfElementWithCssSelector__Group__11
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
    // InternalBromium.g:3974:1: rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3978:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) ) )
            // InternalBromium.g:3979:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) )
            {
            // InternalBromium.g:3979:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 ) )
            // InternalBromium.g:3980:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_10()); 
            // InternalBromium.g:3981:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 )
            // InternalBromium.g:3981:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10
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
    // InternalBromium.g:3989:1: rule__SetVariableToTextOfElementWithCssSelector__Group__11 : rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:3993:1: ( rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl )
            // InternalBromium.g:3994:2: rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl
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
    // InternalBromium.g:4000:1: rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl : ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4004:1: ( ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) ) )
            // InternalBromium.g:4005:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) )
            {
            // InternalBromium.g:4005:1: ( ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 ) )
            // InternalBromium.g:4006:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_11()); 
            // InternalBromium.g:4007:2: ( rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 )
            // InternalBromium.g:4007:3: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11
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
    // InternalBromium.g:4016:1: rule__ClickDataId__Group__0 : rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 ;
    public final void rule__ClickDataId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4020:1: ( rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1 )
            // InternalBromium.g:4021:2: rule__ClickDataId__Group__0__Impl rule__ClickDataId__Group__1
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
    // InternalBromium.g:4028:1: rule__ClickDataId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickDataId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4032:1: ( ( 'click' ) )
            // InternalBromium.g:4033:1: ( 'click' )
            {
            // InternalBromium.g:4033:1: ( 'click' )
            // InternalBromium.g:4034:2: 'click'
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
    // InternalBromium.g:4043:1: rule__ClickDataId__Group__1 : rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 ;
    public final void rule__ClickDataId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4047:1: ( rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2 )
            // InternalBromium.g:4048:2: rule__ClickDataId__Group__1__Impl rule__ClickDataId__Group__2
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
    // InternalBromium.g:4055:1: rule__ClickDataId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickDataId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4059:1: ( ( 'on' ) )
            // InternalBromium.g:4060:1: ( 'on' )
            {
            // InternalBromium.g:4060:1: ( 'on' )
            // InternalBromium.g:4061:2: 'on'
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
    // InternalBromium.g:4070:1: rule__ClickDataId__Group__2 : rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 ;
    public final void rule__ClickDataId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4074:1: ( rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3 )
            // InternalBromium.g:4075:2: rule__ClickDataId__Group__2__Impl rule__ClickDataId__Group__3
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
    // InternalBromium.g:4082:1: rule__ClickDataId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickDataId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4086:1: ( ( 'element' ) )
            // InternalBromium.g:4087:1: ( 'element' )
            {
            // InternalBromium.g:4087:1: ( 'element' )
            // InternalBromium.g:4088:2: 'element'
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
    // InternalBromium.g:4097:1: rule__ClickDataId__Group__3 : rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 ;
    public final void rule__ClickDataId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4101:1: ( rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4 )
            // InternalBromium.g:4102:2: rule__ClickDataId__Group__3__Impl rule__ClickDataId__Group__4
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
    // InternalBromium.g:4109:1: rule__ClickDataId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickDataId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4113:1: ( ( 'with' ) )
            // InternalBromium.g:4114:1: ( 'with' )
            {
            // InternalBromium.g:4114:1: ( 'with' )
            // InternalBromium.g:4115:2: 'with'
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
    // InternalBromium.g:4124:1: rule__ClickDataId__Group__4 : rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 ;
    public final void rule__ClickDataId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4128:1: ( rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5 )
            // InternalBromium.g:4129:2: rule__ClickDataId__Group__4__Impl rule__ClickDataId__Group__5
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
    // InternalBromium.g:4136:1: rule__ClickDataId__Group__4__Impl : ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickDataId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4140:1: ( ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4141:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4141:1: ( ( rule__ClickDataId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4142:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4143:2: ( rule__ClickDataId__ParameterNamesAssignment_4 )
            // InternalBromium.g:4143:3: rule__ClickDataId__ParameterNamesAssignment_4
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
    // InternalBromium.g:4151:1: rule__ClickDataId__Group__5 : rule__ClickDataId__Group__5__Impl ;
    public final void rule__ClickDataId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4155:1: ( rule__ClickDataId__Group__5__Impl )
            // InternalBromium.g:4156:2: rule__ClickDataId__Group__5__Impl
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
    // InternalBromium.g:4162:1: rule__ClickDataId__Group__5__Impl : ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickDataId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4166:1: ( ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4167:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4167:1: ( ( rule__ClickDataId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4168:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4169:2: ( rule__ClickDataId__ParameterValuesAssignment_5 )
            // InternalBromium.g:4169:3: rule__ClickDataId__ParameterValuesAssignment_5
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
    // InternalBromium.g:4178:1: rule__ConfirmAlert__Group__0 : rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 ;
    public final void rule__ConfirmAlert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4182:1: ( rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1 )
            // InternalBromium.g:4183:2: rule__ConfirmAlert__Group__0__Impl rule__ConfirmAlert__Group__1
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
    // InternalBromium.g:4190:1: rule__ConfirmAlert__Group__0__Impl : ( 'to' ) ;
    public final void rule__ConfirmAlert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4194:1: ( ( 'to' ) )
            // InternalBromium.g:4195:1: ( 'to' )
            {
            // InternalBromium.g:4195:1: ( 'to' )
            // InternalBromium.g:4196:2: 'to'
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
    // InternalBromium.g:4205:1: rule__ConfirmAlert__Group__1 : rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 ;
    public final void rule__ConfirmAlert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4209:1: ( rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2 )
            // InternalBromium.g:4210:2: rule__ConfirmAlert__Group__1__Impl rule__ConfirmAlert__Group__2
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
    // InternalBromium.g:4217:1: rule__ConfirmAlert__Group__1__Impl : ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) ;
    public final void rule__ConfirmAlert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4221:1: ( ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:4222:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:4222:1: ( ( rule__ConfirmAlert__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:4223:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:4224:2: ( rule__ConfirmAlert__ParameterNamesAssignment_1 )
            // InternalBromium.g:4224:3: rule__ConfirmAlert__ParameterNamesAssignment_1
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
    // InternalBromium.g:4232:1: rule__ConfirmAlert__Group__2 : rule__ConfirmAlert__Group__2__Impl ;
    public final void rule__ConfirmAlert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4236:1: ( rule__ConfirmAlert__Group__2__Impl )
            // InternalBromium.g:4237:2: rule__ConfirmAlert__Group__2__Impl
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
    // InternalBromium.g:4243:1: rule__ConfirmAlert__Group__2__Impl : ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) ;
    public final void rule__ConfirmAlert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4247:1: ( ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:4248:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:4248:1: ( ( rule__ConfirmAlert__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:4249:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:4250:2: ( rule__ConfirmAlert__ParameterValuesAssignment_2 )
            // InternalBromium.g:4250:3: rule__ConfirmAlert__ParameterValuesAssignment_2
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
    // InternalBromium.g:4259:1: rule__ClickId__Group__0 : rule__ClickId__Group__0__Impl rule__ClickId__Group__1 ;
    public final void rule__ClickId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4263:1: ( rule__ClickId__Group__0__Impl rule__ClickId__Group__1 )
            // InternalBromium.g:4264:2: rule__ClickId__Group__0__Impl rule__ClickId__Group__1
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
    // InternalBromium.g:4271:1: rule__ClickId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4275:1: ( ( 'click' ) )
            // InternalBromium.g:4276:1: ( 'click' )
            {
            // InternalBromium.g:4276:1: ( 'click' )
            // InternalBromium.g:4277:2: 'click'
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
    // InternalBromium.g:4286:1: rule__ClickId__Group__1 : rule__ClickId__Group__1__Impl rule__ClickId__Group__2 ;
    public final void rule__ClickId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4290:1: ( rule__ClickId__Group__1__Impl rule__ClickId__Group__2 )
            // InternalBromium.g:4291:2: rule__ClickId__Group__1__Impl rule__ClickId__Group__2
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
    // InternalBromium.g:4298:1: rule__ClickId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4302:1: ( ( 'on' ) )
            // InternalBromium.g:4303:1: ( 'on' )
            {
            // InternalBromium.g:4303:1: ( 'on' )
            // InternalBromium.g:4304:2: 'on'
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
    // InternalBromium.g:4313:1: rule__ClickId__Group__2 : rule__ClickId__Group__2__Impl rule__ClickId__Group__3 ;
    public final void rule__ClickId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4317:1: ( rule__ClickId__Group__2__Impl rule__ClickId__Group__3 )
            // InternalBromium.g:4318:2: rule__ClickId__Group__2__Impl rule__ClickId__Group__3
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
    // InternalBromium.g:4325:1: rule__ClickId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4329:1: ( ( 'element' ) )
            // InternalBromium.g:4330:1: ( 'element' )
            {
            // InternalBromium.g:4330:1: ( 'element' )
            // InternalBromium.g:4331:2: 'element'
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
    // InternalBromium.g:4340:1: rule__ClickId__Group__3 : rule__ClickId__Group__3__Impl rule__ClickId__Group__4 ;
    public final void rule__ClickId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4344:1: ( rule__ClickId__Group__3__Impl rule__ClickId__Group__4 )
            // InternalBromium.g:4345:2: rule__ClickId__Group__3__Impl rule__ClickId__Group__4
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
    // InternalBromium.g:4352:1: rule__ClickId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4356:1: ( ( 'with' ) )
            // InternalBromium.g:4357:1: ( 'with' )
            {
            // InternalBromium.g:4357:1: ( 'with' )
            // InternalBromium.g:4358:2: 'with'
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
    // InternalBromium.g:4367:1: rule__ClickId__Group__4 : rule__ClickId__Group__4__Impl rule__ClickId__Group__5 ;
    public final void rule__ClickId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4371:1: ( rule__ClickId__Group__4__Impl rule__ClickId__Group__5 )
            // InternalBromium.g:4372:2: rule__ClickId__Group__4__Impl rule__ClickId__Group__5
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
    // InternalBromium.g:4379:1: rule__ClickId__Group__4__Impl : ( ( rule__ClickId__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4383:1: ( ( ( rule__ClickId__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4384:1: ( ( rule__ClickId__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4384:1: ( ( rule__ClickId__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4385:2: ( rule__ClickId__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4386:2: ( rule__ClickId__ParameterNamesAssignment_4 )
            // InternalBromium.g:4386:3: rule__ClickId__ParameterNamesAssignment_4
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
    // InternalBromium.g:4394:1: rule__ClickId__Group__5 : rule__ClickId__Group__5__Impl ;
    public final void rule__ClickId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4398:1: ( rule__ClickId__Group__5__Impl )
            // InternalBromium.g:4399:2: rule__ClickId__Group__5__Impl
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
    // InternalBromium.g:4405:1: rule__ClickId__Group__5__Impl : ( ( rule__ClickId__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4409:1: ( ( ( rule__ClickId__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4410:1: ( ( rule__ClickId__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4410:1: ( ( rule__ClickId__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4411:2: ( rule__ClickId__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickIdAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4412:2: ( rule__ClickId__ParameterValuesAssignment_5 )
            // InternalBromium.g:4412:3: rule__ClickId__ParameterValuesAssignment_5
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
    // InternalBromium.g:4421:1: rule__ClickName__Group__0 : rule__ClickName__Group__0__Impl rule__ClickName__Group__1 ;
    public final void rule__ClickName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4425:1: ( rule__ClickName__Group__0__Impl rule__ClickName__Group__1 )
            // InternalBromium.g:4426:2: rule__ClickName__Group__0__Impl rule__ClickName__Group__1
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
    // InternalBromium.g:4433:1: rule__ClickName__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4437:1: ( ( 'click' ) )
            // InternalBromium.g:4438:1: ( 'click' )
            {
            // InternalBromium.g:4438:1: ( 'click' )
            // InternalBromium.g:4439:2: 'click'
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
    // InternalBromium.g:4448:1: rule__ClickName__Group__1 : rule__ClickName__Group__1__Impl rule__ClickName__Group__2 ;
    public final void rule__ClickName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4452:1: ( rule__ClickName__Group__1__Impl rule__ClickName__Group__2 )
            // InternalBromium.g:4453:2: rule__ClickName__Group__1__Impl rule__ClickName__Group__2
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
    // InternalBromium.g:4460:1: rule__ClickName__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4464:1: ( ( 'on' ) )
            // InternalBromium.g:4465:1: ( 'on' )
            {
            // InternalBromium.g:4465:1: ( 'on' )
            // InternalBromium.g:4466:2: 'on'
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
    // InternalBromium.g:4475:1: rule__ClickName__Group__2 : rule__ClickName__Group__2__Impl rule__ClickName__Group__3 ;
    public final void rule__ClickName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4479:1: ( rule__ClickName__Group__2__Impl rule__ClickName__Group__3 )
            // InternalBromium.g:4480:2: rule__ClickName__Group__2__Impl rule__ClickName__Group__3
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
    // InternalBromium.g:4487:1: rule__ClickName__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4491:1: ( ( 'element' ) )
            // InternalBromium.g:4492:1: ( 'element' )
            {
            // InternalBromium.g:4492:1: ( 'element' )
            // InternalBromium.g:4493:2: 'element'
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
    // InternalBromium.g:4502:1: rule__ClickName__Group__3 : rule__ClickName__Group__3__Impl rule__ClickName__Group__4 ;
    public final void rule__ClickName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4506:1: ( rule__ClickName__Group__3__Impl rule__ClickName__Group__4 )
            // InternalBromium.g:4507:2: rule__ClickName__Group__3__Impl rule__ClickName__Group__4
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
    // InternalBromium.g:4514:1: rule__ClickName__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4518:1: ( ( 'with' ) )
            // InternalBromium.g:4519:1: ( 'with' )
            {
            // InternalBromium.g:4519:1: ( 'with' )
            // InternalBromium.g:4520:2: 'with'
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
    // InternalBromium.g:4529:1: rule__ClickName__Group__4 : rule__ClickName__Group__4__Impl rule__ClickName__Group__5 ;
    public final void rule__ClickName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4533:1: ( rule__ClickName__Group__4__Impl rule__ClickName__Group__5 )
            // InternalBromium.g:4534:2: rule__ClickName__Group__4__Impl rule__ClickName__Group__5
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
    // InternalBromium.g:4541:1: rule__ClickName__Group__4__Impl : ( ( rule__ClickName__ParameterNamesAssignment_4 ) ) ;
    public final void rule__ClickName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4545:1: ( ( ( rule__ClickName__ParameterNamesAssignment_4 ) ) )
            // InternalBromium.g:4546:1: ( ( rule__ClickName__ParameterNamesAssignment_4 ) )
            {
            // InternalBromium.g:4546:1: ( ( rule__ClickName__ParameterNamesAssignment_4 ) )
            // InternalBromium.g:4547:2: ( rule__ClickName__ParameterNamesAssignment_4 )
            {
             before(grammarAccess.getClickNameAccess().getParameterNamesAssignment_4()); 
            // InternalBromium.g:4548:2: ( rule__ClickName__ParameterNamesAssignment_4 )
            // InternalBromium.g:4548:3: rule__ClickName__ParameterNamesAssignment_4
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
    // InternalBromium.g:4556:1: rule__ClickName__Group__5 : rule__ClickName__Group__5__Impl ;
    public final void rule__ClickName__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4560:1: ( rule__ClickName__Group__5__Impl )
            // InternalBromium.g:4561:2: rule__ClickName__Group__5__Impl
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
    // InternalBromium.g:4567:1: rule__ClickName__Group__5__Impl : ( ( rule__ClickName__ParameterValuesAssignment_5 ) ) ;
    public final void rule__ClickName__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4571:1: ( ( ( rule__ClickName__ParameterValuesAssignment_5 ) ) )
            // InternalBromium.g:4572:1: ( ( rule__ClickName__ParameterValuesAssignment_5 ) )
            {
            // InternalBromium.g:4572:1: ( ( rule__ClickName__ParameterValuesAssignment_5 ) )
            // InternalBromium.g:4573:2: ( rule__ClickName__ParameterValuesAssignment_5 )
            {
             before(grammarAccess.getClickNameAccess().getParameterValuesAssignment_5()); 
            // InternalBromium.g:4574:2: ( rule__ClickName__ParameterValuesAssignment_5 )
            // InternalBromium.g:4574:3: rule__ClickName__ParameterValuesAssignment_5
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
    // InternalBromium.g:4583:1: rule__SelectValue__Group__0 : rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1 ;
    public final void rule__SelectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4587:1: ( rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1 )
            // InternalBromium.g:4588:2: rule__SelectValue__Group__0__Impl rule__SelectValue__Group__1
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
    // InternalBromium.g:4595:1: rule__SelectValue__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4599:1: ( ( 'select' ) )
            // InternalBromium.g:4600:1: ( 'select' )
            {
            // InternalBromium.g:4600:1: ( 'select' )
            // InternalBromium.g:4601:2: 'select'
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
    // InternalBromium.g:4610:1: rule__SelectValue__Group__1 : rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2 ;
    public final void rule__SelectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4614:1: ( rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2 )
            // InternalBromium.g:4615:2: rule__SelectValue__Group__1__Impl rule__SelectValue__Group__2
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
    // InternalBromium.g:4622:1: rule__SelectValue__Group__1__Impl : ( ( rule__SelectValue__ParameterNamesAssignment_1 ) ) ;
    public final void rule__SelectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4626:1: ( ( ( rule__SelectValue__ParameterNamesAssignment_1 ) ) )
            // InternalBromium.g:4627:1: ( ( rule__SelectValue__ParameterNamesAssignment_1 ) )
            {
            // InternalBromium.g:4627:1: ( ( rule__SelectValue__ParameterNamesAssignment_1 ) )
            // InternalBromium.g:4628:2: ( rule__SelectValue__ParameterNamesAssignment_1 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_1()); 
            // InternalBromium.g:4629:2: ( rule__SelectValue__ParameterNamesAssignment_1 )
            // InternalBromium.g:4629:3: rule__SelectValue__ParameterNamesAssignment_1
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
    // InternalBromium.g:4637:1: rule__SelectValue__Group__2 : rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3 ;
    public final void rule__SelectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4641:1: ( rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3 )
            // InternalBromium.g:4642:2: rule__SelectValue__Group__2__Impl rule__SelectValue__Group__3
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
    // InternalBromium.g:4649:1: rule__SelectValue__Group__2__Impl : ( ( rule__SelectValue__ParameterValuesAssignment_2 ) ) ;
    public final void rule__SelectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4653:1: ( ( ( rule__SelectValue__ParameterValuesAssignment_2 ) ) )
            // InternalBromium.g:4654:1: ( ( rule__SelectValue__ParameterValuesAssignment_2 ) )
            {
            // InternalBromium.g:4654:1: ( ( rule__SelectValue__ParameterValuesAssignment_2 ) )
            // InternalBromium.g:4655:2: ( rule__SelectValue__ParameterValuesAssignment_2 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_2()); 
            // InternalBromium.g:4656:2: ( rule__SelectValue__ParameterValuesAssignment_2 )
            // InternalBromium.g:4656:3: rule__SelectValue__ParameterValuesAssignment_2
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
    // InternalBromium.g:4664:1: rule__SelectValue__Group__3 : rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4 ;
    public final void rule__SelectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4668:1: ( rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4 )
            // InternalBromium.g:4669:2: rule__SelectValue__Group__3__Impl rule__SelectValue__Group__4
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
    // InternalBromium.g:4676:1: rule__SelectValue__Group__3__Impl : ( 'in' ) ;
    public final void rule__SelectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4680:1: ( ( 'in' ) )
            // InternalBromium.g:4681:1: ( 'in' )
            {
            // InternalBromium.g:4681:1: ( 'in' )
            // InternalBromium.g:4682:2: 'in'
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
    // InternalBromium.g:4691:1: rule__SelectValue__Group__4 : rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5 ;
    public final void rule__SelectValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4695:1: ( rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5 )
            // InternalBromium.g:4696:2: rule__SelectValue__Group__4__Impl rule__SelectValue__Group__5
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
    // InternalBromium.g:4703:1: rule__SelectValue__Group__4__Impl : ( 'element' ) ;
    public final void rule__SelectValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4707:1: ( ( 'element' ) )
            // InternalBromium.g:4708:1: ( 'element' )
            {
            // InternalBromium.g:4708:1: ( 'element' )
            // InternalBromium.g:4709:2: 'element'
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
    // InternalBromium.g:4718:1: rule__SelectValue__Group__5 : rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6 ;
    public final void rule__SelectValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4722:1: ( rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6 )
            // InternalBromium.g:4723:2: rule__SelectValue__Group__5__Impl rule__SelectValue__Group__6
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
    // InternalBromium.g:4730:1: rule__SelectValue__Group__5__Impl : ( 'with' ) ;
    public final void rule__SelectValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4734:1: ( ( 'with' ) )
            // InternalBromium.g:4735:1: ( 'with' )
            {
            // InternalBromium.g:4735:1: ( 'with' )
            // InternalBromium.g:4736:2: 'with'
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
    // InternalBromium.g:4745:1: rule__SelectValue__Group__6 : rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7 ;
    public final void rule__SelectValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4749:1: ( rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7 )
            // InternalBromium.g:4750:2: rule__SelectValue__Group__6__Impl rule__SelectValue__Group__7
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
    // InternalBromium.g:4757:1: rule__SelectValue__Group__6__Impl : ( 'css' ) ;
    public final void rule__SelectValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4761:1: ( ( 'css' ) )
            // InternalBromium.g:4762:1: ( 'css' )
            {
            // InternalBromium.g:4762:1: ( 'css' )
            // InternalBromium.g:4763:2: 'css'
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
    // InternalBromium.g:4772:1: rule__SelectValue__Group__7 : rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8 ;
    public final void rule__SelectValue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4776:1: ( rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8 )
            // InternalBromium.g:4777:2: rule__SelectValue__Group__7__Impl rule__SelectValue__Group__8
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
    // InternalBromium.g:4784:1: rule__SelectValue__Group__7__Impl : ( ( rule__SelectValue__ParameterNamesAssignment_7 ) ) ;
    public final void rule__SelectValue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4788:1: ( ( ( rule__SelectValue__ParameterNamesAssignment_7 ) ) )
            // InternalBromium.g:4789:1: ( ( rule__SelectValue__ParameterNamesAssignment_7 ) )
            {
            // InternalBromium.g:4789:1: ( ( rule__SelectValue__ParameterNamesAssignment_7 ) )
            // InternalBromium.g:4790:2: ( rule__SelectValue__ParameterNamesAssignment_7 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_7()); 
            // InternalBromium.g:4791:2: ( rule__SelectValue__ParameterNamesAssignment_7 )
            // InternalBromium.g:4791:3: rule__SelectValue__ParameterNamesAssignment_7
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
    // InternalBromium.g:4799:1: rule__SelectValue__Group__8 : rule__SelectValue__Group__8__Impl ;
    public final void rule__SelectValue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4803:1: ( rule__SelectValue__Group__8__Impl )
            // InternalBromium.g:4804:2: rule__SelectValue__Group__8__Impl
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
    // InternalBromium.g:4810:1: rule__SelectValue__Group__8__Impl : ( ( rule__SelectValue__ParameterValuesAssignment_8 ) ) ;
    public final void rule__SelectValue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4814:1: ( ( ( rule__SelectValue__ParameterValuesAssignment_8 ) ) )
            // InternalBromium.g:4815:1: ( ( rule__SelectValue__ParameterValuesAssignment_8 ) )
            {
            // InternalBromium.g:4815:1: ( ( rule__SelectValue__ParameterValuesAssignment_8 ) )
            // InternalBromium.g:4816:2: ( rule__SelectValue__ParameterValuesAssignment_8 )
            {
             before(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_8()); 
            // InternalBromium.g:4817:2: ( rule__SelectValue__ParameterValuesAssignment_8 )
            // InternalBromium.g:4817:3: rule__SelectValue__ParameterValuesAssignment_8
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
    // InternalBromium.g:4826:1: rule__Model__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4830:1: ( ( RULE_STRING ) )
            // InternalBromium.g:4831:2: ( RULE_STRING )
            {
            // InternalBromium.g:4831:2: ( RULE_STRING )
            // InternalBromium.g:4832:3: RULE_STRING
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
    // InternalBromium.g:4841:1: rule__Model__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Model__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4845:1: ( ( RULE_STRING ) )
            // InternalBromium.g:4846:2: ( RULE_STRING )
            {
            // InternalBromium.g:4846:2: ( RULE_STRING )
            // InternalBromium.g:4847:3: RULE_STRING
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
    // InternalBromium.g:4856:1: rule__Model__BaseVersionAssignment_4_1 : ( ruleVersion ) ;
    public final void rule__Model__BaseVersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4860:1: ( ( ruleVersion ) )
            // InternalBromium.g:4861:2: ( ruleVersion )
            {
            // InternalBromium.g:4861:2: ( ruleVersion )
            // InternalBromium.g:4862:3: ruleVersion
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
    // InternalBromium.g:4871:1: rule__Model__ActionsAssignment_7 : ( ruleApplicationAction ) ;
    public final void rule__Model__ActionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4875:1: ( ( ruleApplicationAction ) )
            // InternalBromium.g:4876:2: ( ruleApplicationAction )
            {
            // InternalBromium.g:4876:2: ( ruleApplicationAction )
            // InternalBromium.g:4877:3: ruleApplicationAction
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
    // InternalBromium.g:4886:1: rule__ApplicationAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4890:1: ( ( RULE_ID ) )
            // InternalBromium.g:4891:2: ( RULE_ID )
            {
            // InternalBromium.g:4891:2: ( RULE_ID )
            // InternalBromium.g:4892:3: RULE_ID
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
    // InternalBromium.g:4901:1: rule__ApplicationAction__SyntaxDefinitionsAssignment_3 : ( ruleSyntaxDefinition ) ;
    public final void rule__ApplicationAction__SyntaxDefinitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4905:1: ( ( ruleSyntaxDefinition ) )
            // InternalBromium.g:4906:2: ( ruleSyntaxDefinition )
            {
            // InternalBromium.g:4906:2: ( ruleSyntaxDefinition )
            // InternalBromium.g:4907:3: ruleSyntaxDefinition
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
    // InternalBromium.g:4916:1: rule__ApplicationAction__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__ApplicationAction__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4920:1: ( ( rulePrecondition ) )
            // InternalBromium.g:4921:2: ( rulePrecondition )
            {
            // InternalBromium.g:4921:2: ( rulePrecondition )
            // InternalBromium.g:4922:3: rulePrecondition
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
    // InternalBromium.g:4931:1: rule__ApplicationAction__ActionContextAssignment_5 : ( ruleActionContext ) ;
    public final void rule__ApplicationAction__ActionContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4935:1: ( ( ruleActionContext ) )
            // InternalBromium.g:4936:2: ( ruleActionContext )
            {
            // InternalBromium.g:4936:2: ( ruleActionContext )
            // InternalBromium.g:4937:3: ruleActionContext
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
    // InternalBromium.g:4946:1: rule__ApplicationAction__WebDriverActionAssignment_6 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__WebDriverActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4950:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:4951:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:4951:2: ( ruleWebDriverAction )
            // InternalBromium.g:4952:3: ruleWebDriverAction
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
    // InternalBromium.g:4961:1: rule__ApplicationAction__ExpectHttpRequestAssignment_7 : ( ruleExpectHttpRequest ) ;
    public final void rule__ApplicationAction__ExpectHttpRequestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4965:1: ( ( ruleExpectHttpRequest ) )
            // InternalBromium.g:4966:2: ( ruleExpectHttpRequest )
            {
            // InternalBromium.g:4966:2: ( ruleExpectHttpRequest )
            // InternalBromium.g:4967:3: ruleExpectHttpRequest
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
    // InternalBromium.g:4976:1: rule__ApplicationAction__PostconditionAssignment_8 : ( rulePostcondition ) ;
    public final void rule__ApplicationAction__PostconditionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4980:1: ( ( rulePostcondition ) )
            // InternalBromium.g:4981:2: ( rulePostcondition )
            {
            // InternalBromium.g:4981:2: ( rulePostcondition )
            // InternalBromium.g:4982:3: rulePostcondition
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
    // InternalBromium.g:4991:1: rule__TableActionContext__TableLocatorAssignment_2 : ( ruleLocator ) ;
    public final void rule__TableActionContext__TableLocatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:4995:1: ( ( ruleLocator ) )
            // InternalBromium.g:4996:2: ( ruleLocator )
            {
            // InternalBromium.g:4996:2: ( ruleLocator )
            // InternalBromium.g:4997:3: ruleLocator
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
    // InternalBromium.g:5006:1: rule__TableActionContext__RowsLocatorAssignment_5 : ( ruleLocator ) ;
    public final void rule__TableActionContext__RowsLocatorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5010:1: ( ( ruleLocator ) )
            // InternalBromium.g:5011:2: ( ruleLocator )
            {
            // InternalBromium.g:5011:2: ( ruleLocator )
            // InternalBromium.g:5012:3: ruleLocator
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
    // InternalBromium.g:5021:1: rule__TableActionContext__RowSelectorAssignment_6 : ( ruleRowSelector ) ;
    public final void rule__TableActionContext__RowSelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5025:1: ( ( ruleRowSelector ) )
            // InternalBromium.g:5026:2: ( ruleRowSelector )
            {
            // InternalBromium.g:5026:2: ( ruleRowSelector )
            // InternalBromium.g:5027:3: ruleRowSelector
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
    // InternalBromium.g:5036:1: rule__RowLocator__RowLocatorAssignment_2 : ( ruleLocator ) ;
    public final void rule__RowLocator__RowLocatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5040:1: ( ( ruleLocator ) )
            // InternalBromium.g:5041:2: ( ruleLocator )
            {
            // InternalBromium.g:5041:2: ( ruleLocator )
            // InternalBromium.g:5042:3: ruleLocator
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
    // InternalBromium.g:5051:1: rule__RowIndex__IndexAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__RowIndex__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5055:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5056:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5056:2: ( ruleParameterValue )
            // InternalBromium.g:5057:3: ruleParameterValue
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
    // InternalBromium.g:5066:1: rule__ClassByText__KlassAssignment_1 : ( ruleParameterValue ) ;
    public final void rule__ClassByText__KlassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5070:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5071:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5071:2: ( ruleParameterValue )
            // InternalBromium.g:5072:3: ruleParameterValue
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
    // InternalBromium.g:5081:1: rule__ClassByText__TextAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ClassByText__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5085:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5086:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5086:2: ( ruleParameterValue )
            // InternalBromium.g:5087:3: ruleParameterValue
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


    // $ANTLR start "rule__CssSelector__SelectorAssignment_2"
    // InternalBromium.g:5096:1: rule__CssSelector__SelectorAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__CssSelector__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5100:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5101:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5101:2: ( ruleParameterValue )
            // InternalBromium.g:5102:3: ruleParameterValue
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
    // InternalBromium.g:5111:1: rule__SyntaxDefinition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SyntaxDefinition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5115:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5116:2: ( RULE_STRING )
            {
            // InternalBromium.g:5116:2: ( RULE_STRING )
            // InternalBromium.g:5117:3: RULE_STRING
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
    // InternalBromium.g:5126:1: rule__SyntaxDefinition__ParameterAssignment_2 : ( ruleExposedParameter ) ;
    public final void rule__SyntaxDefinition__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5130:1: ( ( ruleExposedParameter ) )
            // InternalBromium.g:5131:2: ( ruleExposedParameter )
            {
            // InternalBromium.g:5131:2: ( ruleExposedParameter )
            // InternalBromium.g:5132:3: ruleExposedParameter
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
    // InternalBromium.g:5141:1: rule__Precondition__ActionAssignment_1 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Precondition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5145:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:5146:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:5146:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:5147:3: ruleWebDriverActionCondition
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
    // InternalBromium.g:5156:1: rule__Postcondition__ActionAssignment_3 : ( ruleWebDriverActionCondition ) ;
    public final void rule__Postcondition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5160:1: ( ( ruleWebDriverActionCondition ) )
            // InternalBromium.g:5161:2: ( ruleWebDriverActionCondition )
            {
            // InternalBromium.g:5161:2: ( ruleWebDriverActionCondition )
            // InternalBromium.g:5162:3: ruleWebDriverActionCondition
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
    // InternalBromium.g:5171:1: rule__ExpectHttpRequest__NotAssignment_1_1 : ( ( 'not' ) ) ;
    public final void rule__ExpectHttpRequest__NotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5175:1: ( ( ( 'not' ) ) )
            // InternalBromium.g:5176:2: ( ( 'not' ) )
            {
            // InternalBromium.g:5176:2: ( ( 'not' ) )
            // InternalBromium.g:5177:3: ( 'not' )
            {
             before(grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0()); 
            // InternalBromium.g:5178:3: ( 'not' )
            // InternalBromium.g:5179:4: 'not'
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
    // InternalBromium.g:5190:1: rule__ElementByCssToBePresent__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__ElementByCssToBePresent__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5194:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5195:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5195:2: ( ( 'selector' ) )
            // InternalBromium.g:5196:3: ( 'selector' )
            {
             before(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:5197:3: ( 'selector' )
            // InternalBromium.g:5198:4: 'selector'
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
    // InternalBromium.g:5209:1: rule__ElementByCssToBePresent__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ElementByCssToBePresent__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5213:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5214:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5214:2: ( ruleParameterValue )
            // InternalBromium.g:5215:3: ruleParameterValue
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
    // InternalBromium.g:5224:1: rule__ClickCssSelector__ParameterNamesAssignment_5 : ( ( 'selector' ) ) ;
    public final void rule__ClickCssSelector__ParameterNamesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5228:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5229:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5229:2: ( ( 'selector' ) )
            // InternalBromium.g:5230:3: ( 'selector' )
            {
             before(grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0()); 
            // InternalBromium.g:5231:3: ( 'selector' )
            // InternalBromium.g:5232:4: 'selector'
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
    // InternalBromium.g:5243:1: rule__ClickCssSelector__ParameterValuesAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__ClickCssSelector__ParameterValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5247:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5248:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5248:2: ( ruleParameterValue )
            // InternalBromium.g:5249:3: ruleParameterValue
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
    // InternalBromium.g:5258:1: rule__PageLoad__ParameterNamesAssignment_1 : ( ( 'page' ) ) ;
    public final void rule__PageLoad__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5262:1: ( ( ( 'page' ) ) )
            // InternalBromium.g:5263:2: ( ( 'page' ) )
            {
            // InternalBromium.g:5263:2: ( ( 'page' ) )
            // InternalBromium.g:5264:3: ( 'page' )
            {
             before(grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0()); 
            // InternalBromium.g:5265:3: ( 'page' )
            // InternalBromium.g:5266:4: 'page'
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
    // InternalBromium.g:5277:1: rule__PageLoad__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__PageLoad__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5281:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5282:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5282:2: ( ruleParameterValue )
            // InternalBromium.g:5283:3: ruleParameterValue
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
    // InternalBromium.g:5292:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1 : ( ( 'text' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5296:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5297:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5297:2: ( ( 'text' ) )
            // InternalBromium.g:5298:3: ( 'text' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0()); 
            // InternalBromium.g:5299:3: ( 'text' )
            // InternalBromium.g:5300:4: 'text'
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
    // InternalBromium.g:5311:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5315:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5316:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5316:2: ( ruleParameterValue )
            // InternalBromium.g:5317:3: ruleParameterValue
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
    // InternalBromium.g:5326:1: rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7 : ( ( 'selector' ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5330:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5331:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5331:2: ( ( 'selector' ) )
            // InternalBromium.g:5332:3: ( 'selector' )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0()); 
            // InternalBromium.g:5333:3: ( 'selector' )
            // InternalBromium.g:5334:4: 'selector'
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
    // InternalBromium.g:5345:1: rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5349:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5350:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5350:2: ( ruleParameterValue )
            // InternalBromium.g:5351:3: ruleParameterValue
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
    // InternalBromium.g:5360:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3 : ( ( 'selector' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5364:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5365:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5365:2: ( ( 'selector' ) )
            // InternalBromium.g:5366:3: ( 'selector' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0()); 
            // InternalBromium.g:5367:3: ( 'selector' )
            // InternalBromium.g:5368:4: 'selector'
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
    // InternalBromium.g:5379:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5383:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5384:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5384:2: ( ruleParameterValue )
            // InternalBromium.g:5385:3: ruleParameterValue
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
    // InternalBromium.g:5394:1: rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6 : ( ( 'text' ) ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5398:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5399:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5399:2: ( ( 'text' ) )
            // InternalBromium.g:5400:3: ( 'text' )
            {
             before(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0()); 
            // InternalBromium.g:5401:3: ( 'text' )
            // InternalBromium.g:5402:4: 'text'
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
    // InternalBromium.g:5413:1: rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7 : ( ruleParameterValue ) ;
    public final void rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5417:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5418:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5418:2: ( ruleParameterValue )
            // InternalBromium.g:5419:3: ruleParameterValue
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
    // InternalBromium.g:5428:1: rule__ClickClassByText__ParameterNamesAssignment_4 : ( ( 'class' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5432:1: ( ( ( 'class' ) ) )
            // InternalBromium.g:5433:2: ( ( 'class' ) )
            {
            // InternalBromium.g:5433:2: ( ( 'class' ) )
            // InternalBromium.g:5434:3: ( 'class' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0()); 
            // InternalBromium.g:5435:3: ( 'class' )
            // InternalBromium.g:5436:4: 'class'
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
    // InternalBromium.g:5447:1: rule__ClickClassByText__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5451:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5452:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5452:2: ( ruleParameterValue )
            // InternalBromium.g:5453:3: ruleParameterValue
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
    // InternalBromium.g:5462:1: rule__ClickClassByText__ParameterNamesAssignment_7 : ( ( 'text' ) ) ;
    public final void rule__ClickClassByText__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5466:1: ( ( ( 'text' ) ) )
            // InternalBromium.g:5467:2: ( ( 'text' ) )
            {
            // InternalBromium.g:5467:2: ( ( 'text' ) )
            // InternalBromium.g:5468:3: ( 'text' )
            {
             before(grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0()); 
            // InternalBromium.g:5469:3: ( 'text' )
            // InternalBromium.g:5470:4: 'text'
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
    // InternalBromium.g:5481:1: rule__ClickClassByText__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__ClickClassByText__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5485:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5486:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5486:2: ( ruleParameterValue )
            // InternalBromium.g:5487:3: ruleParameterValue
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
    // InternalBromium.g:5496:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1 : ( ( 'variable' ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5500:1: ( ( ( 'variable' ) ) )
            // InternalBromium.g:5501:2: ( ( 'variable' ) )
            {
            // InternalBromium.g:5501:2: ( ( 'variable' ) )
            // InternalBromium.g:5502:3: ( 'variable' )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0()); 
            // InternalBromium.g:5503:3: ( 'variable' )
            // InternalBromium.g:5504:4: 'variable'
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
    // InternalBromium.g:5515:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5519:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5520:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5520:2: ( ruleParameterValue )
            // InternalBromium.g:5521:3: ruleParameterValue
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
    // InternalBromium.g:5530:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10 : ( ( 'selector' ) ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5534:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5535:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5535:2: ( ( 'selector' ) )
            // InternalBromium.g:5536:3: ( 'selector' )
            {
             before(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0()); 
            // InternalBromium.g:5537:3: ( 'selector' )
            // InternalBromium.g:5538:4: 'selector'
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
    // InternalBromium.g:5549:1: rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11 : ( ruleParameterValue ) ;
    public final void rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5553:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5554:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5554:2: ( ruleParameterValue )
            // InternalBromium.g:5555:3: ruleParameterValue
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
    // InternalBromium.g:5564:1: rule__ClickDataId__ParameterNamesAssignment_4 : ( ( 'dataId' ) ) ;
    public final void rule__ClickDataId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5568:1: ( ( ( 'dataId' ) ) )
            // InternalBromium.g:5569:2: ( ( 'dataId' ) )
            {
            // InternalBromium.g:5569:2: ( ( 'dataId' ) )
            // InternalBromium.g:5570:3: ( 'dataId' )
            {
             before(grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0()); 
            // InternalBromium.g:5571:3: ( 'dataId' )
            // InternalBromium.g:5572:4: 'dataId'
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
    // InternalBromium.g:5583:1: rule__ClickDataId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickDataId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5587:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5588:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5588:2: ( ruleParameterValue )
            // InternalBromium.g:5589:3: ruleParameterValue
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
    // InternalBromium.g:5598:1: rule__ConfirmAlert__ParameterNamesAssignment_1 : ( ( 'confirm' ) ) ;
    public final void rule__ConfirmAlert__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5602:1: ( ( ( 'confirm' ) ) )
            // InternalBromium.g:5603:2: ( ( 'confirm' ) )
            {
            // InternalBromium.g:5603:2: ( ( 'confirm' ) )
            // InternalBromium.g:5604:3: ( 'confirm' )
            {
             before(grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0()); 
            // InternalBromium.g:5605:3: ( 'confirm' )
            // InternalBromium.g:5606:4: 'confirm'
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
    // InternalBromium.g:5617:1: rule__ConfirmAlert__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ConfirmAlert__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5621:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5622:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5622:2: ( ruleParameterValue )
            // InternalBromium.g:5623:3: ruleParameterValue
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
    // InternalBromium.g:5632:1: rule__ClickId__ParameterNamesAssignment_4 : ( ( 'id' ) ) ;
    public final void rule__ClickId__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5636:1: ( ( ( 'id' ) ) )
            // InternalBromium.g:5637:2: ( ( 'id' ) )
            {
            // InternalBromium.g:5637:2: ( ( 'id' ) )
            // InternalBromium.g:5638:3: ( 'id' )
            {
             before(grammarAccess.getClickIdAccess().getParameterNamesIdKeyword_4_0()); 
            // InternalBromium.g:5639:3: ( 'id' )
            // InternalBromium.g:5640:4: 'id'
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
    // InternalBromium.g:5651:1: rule__ClickId__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickId__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5655:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5656:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5656:2: ( ruleParameterValue )
            // InternalBromium.g:5657:3: ruleParameterValue
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
    // InternalBromium.g:5666:1: rule__ClickName__ParameterNamesAssignment_4 : ( ( 'name' ) ) ;
    public final void rule__ClickName__ParameterNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5670:1: ( ( ( 'name' ) ) )
            // InternalBromium.g:5671:2: ( ( 'name' ) )
            {
            // InternalBromium.g:5671:2: ( ( 'name' ) )
            // InternalBromium.g:5672:3: ( 'name' )
            {
             before(grammarAccess.getClickNameAccess().getParameterNamesNameKeyword_4_0()); 
            // InternalBromium.g:5673:3: ( 'name' )
            // InternalBromium.g:5674:4: 'name'
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
    // InternalBromium.g:5685:1: rule__ClickName__ParameterValuesAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ClickName__ParameterValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5689:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5690:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5690:2: ( ruleParameterValue )
            // InternalBromium.g:5691:3: ruleParameterValue
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
    // InternalBromium.g:5700:1: rule__SelectValue__ParameterNamesAssignment_1 : ( ( 'value' ) ) ;
    public final void rule__SelectValue__ParameterNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5704:1: ( ( ( 'value' ) ) )
            // InternalBromium.g:5705:2: ( ( 'value' ) )
            {
            // InternalBromium.g:5705:2: ( ( 'value' ) )
            // InternalBromium.g:5706:3: ( 'value' )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesValueKeyword_1_0()); 
            // InternalBromium.g:5707:3: ( 'value' )
            // InternalBromium.g:5708:4: 'value'
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
    // InternalBromium.g:5719:1: rule__SelectValue__ParameterValuesAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__SelectValue__ParameterValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5723:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5724:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5724:2: ( ruleParameterValue )
            // InternalBromium.g:5725:3: ruleParameterValue
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
    // InternalBromium.g:5734:1: rule__SelectValue__ParameterNamesAssignment_7 : ( ( 'selector' ) ) ;
    public final void rule__SelectValue__ParameterNamesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5738:1: ( ( ( 'selector' ) ) )
            // InternalBromium.g:5739:2: ( ( 'selector' ) )
            {
            // InternalBromium.g:5739:2: ( ( 'selector' ) )
            // InternalBromium.g:5740:3: ( 'selector' )
            {
             before(grammarAccess.getSelectValueAccess().getParameterNamesSelectorKeyword_7_0()); 
            // InternalBromium.g:5741:3: ( 'selector' )
            // InternalBromium.g:5742:4: 'selector'
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
    // InternalBromium.g:5753:1: rule__SelectValue__ParameterValuesAssignment_8 : ( ruleParameterValue ) ;
    public final void rule__SelectValue__ParameterValuesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5757:1: ( ( ruleParameterValue ) )
            // InternalBromium.g:5758:2: ( ruleParameterValue )
            {
            // InternalBromium.g:5758:2: ( ruleParameterValue )
            // InternalBromium.g:5759:3: ruleParameterValue
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
    // InternalBromium.g:5768:1: rule__ParameterValue__ContentAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ParameterValue__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5772:1: ( ( RULE_STRING ) )
            // InternalBromium.g:5773:2: ( RULE_STRING )
            {
            // InternalBromium.g:5773:2: ( RULE_STRING )
            // InternalBromium.g:5774:3: RULE_STRING
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
    // InternalBromium.g:5783:1: rule__ParameterValue__ExposedParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterValue__ExposedParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5787:1: ( ( ( RULE_ID ) ) )
            // InternalBromium.g:5788:2: ( ( RULE_ID ) )
            {
            // InternalBromium.g:5788:2: ( ( RULE_ID ) )
            // InternalBromium.g:5789:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterCrossReference_1_0()); 
            // InternalBromium.g:5790:3: ( RULE_ID )
            // InternalBromium.g:5791:4: RULE_ID
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
    // InternalBromium.g:5802:1: rule__ParameterValue__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__ParameterValue__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5806:1: ( ( RULE_INT ) )
            // InternalBromium.g:5807:2: ( RULE_INT )
            {
            // InternalBromium.g:5807:2: ( RULE_INT )
            // InternalBromium.g:5808:3: RULE_INT
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
    // InternalBromium.g:5817:1: rule__ExposedParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExposedParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:5821:1: ( ( RULE_ID ) )
            // InternalBromium.g:5822:2: ( RULE_ID )
            {
            // InternalBromium.g:5822:2: ( RULE_ID )
            // InternalBromium.g:5823:3: RULE_ID
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
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\45\1\24\1\uffff\1\33\1\34\1\4\3\46\2\uffff";
    static final String dfa_3s = "\1\57\1\24\1\uffff\1\33\1\34\1\6\3\55\2\uffff";
    static final String dfa_4s = "\2\uffff\1\3\6\uffff\1\1\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\11\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\1\7\1\10",
            "\1\11\6\uffff\1\12",
            "\1\11\6\uffff\1\12",
            "\1\11\6\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "875:1: rule__WebDriverActionCondition__Alternatives : ( ( ruleElementByCssToBePresent ) | ( ruleTextOfElementWithCssSelectorToBe ) | ( ruleConfirmAlert ) );";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\50\1\51\4\uffff\1\45\1\24\1\13\5\uffff";
    static final String dfa_9s = "\1\62\1\51\4\uffff\1\45\1\24\1\66\5\uffff";
    static final String dfa_10s = "\2\uffff\1\3\1\4\1\6\1\11\3\uffff\1\10\1\5\1\2\1\1\1\7";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\uffff\1\2\1\3\2\uffff\1\4\3\uffff\1\5",
            "\1\6",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11\5\uffff\1\15\6\uffff\1\13\2\uffff\1\14\32\uffff\1\12",
            "",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "902:1: rule__WebDriverAction__Alternatives : ( ( ruleClickCssSelector ) | ( ruleClickClassByText ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) | ( ruleClickDataId ) | ( ruleSetVariableToTextOfElementWithCssSelector ) | ( ruleClickId ) | ( ruleClickName ) | ( ruleSelectValue ) );";
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