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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'actions'", "'{'", "'}'", "'from'", "'action'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'not'", "'expect'", "'http'", "'request'", "'element'", "'with'", "'css'", "'selector'", "'is'", "'clickable'", "'click'", "'on'", "'load'", "'page'", "'type'", "'in'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleElementWithIdIsPresent"
    // InternalBromium.g:128:1: entryRuleElementWithIdIsPresent : ruleElementWithIdIsPresent EOF ;
    public final void entryRuleElementWithIdIsPresent() throws RecognitionException {
        try {
            // InternalBromium.g:129:1: ( ruleElementWithIdIsPresent EOF )
            // InternalBromium.g:130:1: ruleElementWithIdIsPresent EOF
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
    // InternalBromium.g:137:1: ruleElementWithIdIsPresent : ( ( rule__ElementWithIdIsPresent__Group__0 ) ) ;
    public final void ruleElementWithIdIsPresent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:141:2: ( ( ( rule__ElementWithIdIsPresent__Group__0 ) ) )
            // InternalBromium.g:142:2: ( ( rule__ElementWithIdIsPresent__Group__0 ) )
            {
            // InternalBromium.g:142:2: ( ( rule__ElementWithIdIsPresent__Group__0 ) )
            // InternalBromium.g:143:3: ( rule__ElementWithIdIsPresent__Group__0 )
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getGroup()); 
            // InternalBromium.g:144:3: ( rule__ElementWithIdIsPresent__Group__0 )
            // InternalBromium.g:144:4: rule__ElementWithIdIsPresent__Group__0
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
    // InternalBromium.g:153:1: entryRuleClickOnElementWithId : ruleClickOnElementWithId EOF ;
    public final void entryRuleClickOnElementWithId() throws RecognitionException {
        try {
            // InternalBromium.g:154:1: ( ruleClickOnElementWithId EOF )
            // InternalBromium.g:155:1: ruleClickOnElementWithId EOF
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
    // InternalBromium.g:162:1: ruleClickOnElementWithId : ( ( rule__ClickOnElementWithId__Group__0 ) ) ;
    public final void ruleClickOnElementWithId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:166:2: ( ( ( rule__ClickOnElementWithId__Group__0 ) ) )
            // InternalBromium.g:167:2: ( ( rule__ClickOnElementWithId__Group__0 ) )
            {
            // InternalBromium.g:167:2: ( ( rule__ClickOnElementWithId__Group__0 ) )
            // InternalBromium.g:168:3: ( rule__ClickOnElementWithId__Group__0 )
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getGroup()); 
            // InternalBromium.g:169:3: ( rule__ClickOnElementWithId__Group__0 )
            // InternalBromium.g:169:4: rule__ClickOnElementWithId__Group__0
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
    // InternalBromium.g:178:1: entryRulePageLoad : rulePageLoad EOF ;
    public final void entryRulePageLoad() throws RecognitionException {
        try {
            // InternalBromium.g:179:1: ( rulePageLoad EOF )
            // InternalBromium.g:180:1: rulePageLoad EOF
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
    // InternalBromium.g:187:1: rulePageLoad : ( ( rule__PageLoad__Group__0 ) ) ;
    public final void rulePageLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:191:2: ( ( ( rule__PageLoad__Group__0 ) ) )
            // InternalBromium.g:192:2: ( ( rule__PageLoad__Group__0 ) )
            {
            // InternalBromium.g:192:2: ( ( rule__PageLoad__Group__0 ) )
            // InternalBromium.g:193:3: ( rule__PageLoad__Group__0 )
            {
             before(grammarAccess.getPageLoadAccess().getGroup()); 
            // InternalBromium.g:194:3: ( rule__PageLoad__Group__0 )
            // InternalBromium.g:194:4: rule__PageLoad__Group__0
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
    // InternalBromium.g:203:1: entryRuleTypeTextInElementFoundByCssSelector : ruleTypeTextInElementFoundByCssSelector EOF ;
    public final void entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        try {
            // InternalBromium.g:204:1: ( ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:205:1: ruleTypeTextInElementFoundByCssSelector EOF
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
    // InternalBromium.g:212:1: ruleTypeTextInElementFoundByCssSelector : ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) ;
    public final void ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:216:2: ( ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) ) )
            // InternalBromium.g:217:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            {
            // InternalBromium.g:217:2: ( ( rule__TypeTextInElementFoundByCssSelector__Group__0 ) )
            // InternalBromium.g:218:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup()); 
            // InternalBromium.g:219:3: ( rule__TypeTextInElementFoundByCssSelector__Group__0 )
            // InternalBromium.g:219:4: rule__TypeTextInElementFoundByCssSelector__Group__0
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
    // InternalBromium.g:228:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalBromium.g:229:1: ( ruleVersion EOF )
            // InternalBromium.g:230:1: ruleVersion EOF
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
    // InternalBromium.g:237:1: ruleVersion : ( ( rule__Version__Alternatives ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:241:2: ( ( ( rule__Version__Alternatives ) ) )
            // InternalBromium.g:242:2: ( ( rule__Version__Alternatives ) )
            {
            // InternalBromium.g:242:2: ( ( rule__Version__Alternatives ) )
            // InternalBromium.g:243:3: ( rule__Version__Alternatives )
            {
             before(grammarAccess.getVersionAccess().getAlternatives()); 
            // InternalBromium.g:244:3: ( rule__Version__Alternatives )
            // InternalBromium.g:244:4: rule__Version__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Version__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleThreeDottedVersion"
    // InternalBromium.g:253:1: entryRuleThreeDottedVersion : ruleThreeDottedVersion EOF ;
    public final void entryRuleThreeDottedVersion() throws RecognitionException {
        try {
            // InternalBromium.g:254:1: ( ruleThreeDottedVersion EOF )
            // InternalBromium.g:255:1: ruleThreeDottedVersion EOF
            {
             before(grammarAccess.getThreeDottedVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleThreeDottedVersion();

            state._fsp--;

             after(grammarAccess.getThreeDottedVersionRule()); 
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
    // $ANTLR end "entryRuleThreeDottedVersion"


    // $ANTLR start "ruleThreeDottedVersion"
    // InternalBromium.g:262:1: ruleThreeDottedVersion : ( ( rule__ThreeDottedVersion__Group__0 ) ) ;
    public final void ruleThreeDottedVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:266:2: ( ( ( rule__ThreeDottedVersion__Group__0 ) ) )
            // InternalBromium.g:267:2: ( ( rule__ThreeDottedVersion__Group__0 ) )
            {
            // InternalBromium.g:267:2: ( ( rule__ThreeDottedVersion__Group__0 ) )
            // InternalBromium.g:268:3: ( rule__ThreeDottedVersion__Group__0 )
            {
             before(grammarAccess.getThreeDottedVersionAccess().getGroup()); 
            // InternalBromium.g:269:3: ( rule__ThreeDottedVersion__Group__0 )
            // InternalBromium.g:269:4: rule__ThreeDottedVersion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThreeDottedVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThreeDottedVersion"


    // $ANTLR start "rule__WebDriverAction__Alternatives"
    // InternalBromium.g:277:1: rule__WebDriverAction__Alternatives : ( ( ruleElementWithIdIsPresent ) | ( ruleClickOnElementWithId ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) );
    public final void rule__WebDriverAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:281:1: ( ( ruleElementWithIdIsPresent ) | ( ruleClickOnElementWithId ) | ( rulePageLoad ) | ( ruleTypeTextInElementFoundByCssSelector ) )
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
                    // InternalBromium.g:282:2: ( ruleElementWithIdIsPresent )
                    {
                    // InternalBromium.g:282:2: ( ruleElementWithIdIsPresent )
                    // InternalBromium.g:283:3: ruleElementWithIdIsPresent
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
                    // InternalBromium.g:288:2: ( ruleClickOnElementWithId )
                    {
                    // InternalBromium.g:288:2: ( ruleClickOnElementWithId )
                    // InternalBromium.g:289:3: ruleClickOnElementWithId
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
                    // InternalBromium.g:294:2: ( rulePageLoad )
                    {
                    // InternalBromium.g:294:2: ( rulePageLoad )
                    // InternalBromium.g:295:3: rulePageLoad
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
                    // InternalBromium.g:300:2: ( ruleTypeTextInElementFoundByCssSelector )
                    {
                    // InternalBromium.g:300:2: ( ruleTypeTextInElementFoundByCssSelector )
                    // InternalBromium.g:301:3: ruleTypeTextInElementFoundByCssSelector
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


    // $ANTLR start "rule__Version__Alternatives"
    // InternalBromium.g:310:1: rule__Version__Alternatives : ( ( ruleThreeDottedVersion ) | ( RULE_STRING ) );
    public final void rule__Version__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:314:1: ( ( ruleThreeDottedVersion ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBromium.g:315:2: ( ruleThreeDottedVersion )
                    {
                    // InternalBromium.g:315:2: ( ruleThreeDottedVersion )
                    // InternalBromium.g:316:3: ruleThreeDottedVersion
                    {
                     before(grammarAccess.getVersionAccess().getThreeDottedVersionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleThreeDottedVersion();

                    state._fsp--;

                     after(grammarAccess.getVersionAccess().getThreeDottedVersionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:321:2: ( RULE_STRING )
                    {
                    // InternalBromium.g:321:2: ( RULE_STRING )
                    // InternalBromium.g:322:3: RULE_STRING
                    {
                     before(grammarAccess.getVersionAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVersionAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Version__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalBromium.g:331:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:335:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBromium.g:336:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalBromium.g:343:1: rule__Model__Group__0__Impl : ( 'name' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:347:1: ( ( 'name' ) )
            // InternalBromium.g:348:1: ( 'name' )
            {
            // InternalBromium.g:348:1: ( 'name' )
            // InternalBromium.g:349:2: 'name'
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
    // InternalBromium.g:358:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:362:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBromium.g:363:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalBromium.g:370:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:374:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalBromium.g:375:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalBromium.g:375:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalBromium.g:376:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalBromium.g:377:2: ( rule__Model__NameAssignment_1 )
            // InternalBromium.g:377:3: rule__Model__NameAssignment_1
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
    // InternalBromium.g:385:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:389:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBromium.g:390:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalBromium.g:397:1: rule__Model__Group__2__Impl : ( 'version' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:401:1: ( ( 'version' ) )
            // InternalBromium.g:402:1: ( 'version' )
            {
            // InternalBromium.g:402:1: ( 'version' )
            // InternalBromium.g:403:2: 'version'
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
    // InternalBromium.g:412:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:416:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBromium.g:417:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalBromium.g:424:1: rule__Model__Group__3__Impl : ( ( rule__Model__VersionAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:428:1: ( ( ( rule__Model__VersionAssignment_3 ) ) )
            // InternalBromium.g:429:1: ( ( rule__Model__VersionAssignment_3 ) )
            {
            // InternalBromium.g:429:1: ( ( rule__Model__VersionAssignment_3 ) )
            // InternalBromium.g:430:2: ( rule__Model__VersionAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_3()); 
            // InternalBromium.g:431:2: ( rule__Model__VersionAssignment_3 )
            // InternalBromium.g:431:3: rule__Model__VersionAssignment_3
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
    // InternalBromium.g:439:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:443:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBromium.g:444:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalBromium.g:451:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:455:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalBromium.g:456:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalBromium.g:456:1: ( ( rule__Model__Group_4__0 )? )
            // InternalBromium.g:457:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalBromium.g:458:2: ( rule__Model__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBromium.g:458:3: rule__Model__Group_4__0
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
    // InternalBromium.g:466:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:470:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalBromium.g:471:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalBromium.g:478:1: rule__Model__Group__5__Impl : ( 'actions' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:482:1: ( ( 'actions' ) )
            // InternalBromium.g:483:1: ( 'actions' )
            {
            // InternalBromium.g:483:1: ( 'actions' )
            // InternalBromium.g:484:2: 'actions'
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
    // InternalBromium.g:493:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:497:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalBromium.g:498:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalBromium.g:505:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:509:1: ( ( '{' ) )
            // InternalBromium.g:510:1: ( '{' )
            {
            // InternalBromium.g:510:1: ( '{' )
            // InternalBromium.g:511:2: '{'
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
    // InternalBromium.g:520:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:524:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalBromium.g:525:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalBromium.g:532:1: rule__Model__Group__7__Impl : ( ( rule__Model__ActionsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:536:1: ( ( ( rule__Model__ActionsAssignment_7 )* ) )
            // InternalBromium.g:537:1: ( ( rule__Model__ActionsAssignment_7 )* )
            {
            // InternalBromium.g:537:1: ( ( rule__Model__ActionsAssignment_7 )* )
            // InternalBromium.g:538:2: ( rule__Model__ActionsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getActionsAssignment_7()); 
            // InternalBromium.g:539:2: ( rule__Model__ActionsAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBromium.g:539:3: rule__Model__ActionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__ActionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalBromium.g:547:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:551:1: ( rule__Model__Group__8__Impl )
            // InternalBromium.g:552:2: rule__Model__Group__8__Impl
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
    // InternalBromium.g:558:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:562:1: ( ( '}' ) )
            // InternalBromium.g:563:1: ( '}' )
            {
            // InternalBromium.g:563:1: ( '}' )
            // InternalBromium.g:564:2: '}'
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
    // InternalBromium.g:574:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:578:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalBromium.g:579:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBromium.g:586:1: rule__Model__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:590:1: ( ( 'from' ) )
            // InternalBromium.g:591:1: ( 'from' )
            {
            // InternalBromium.g:591:1: ( 'from' )
            // InternalBromium.g:592:2: 'from'
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
    // InternalBromium.g:601:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:605:1: ( rule__Model__Group_4__1__Impl )
            // InternalBromium.g:606:2: rule__Model__Group_4__1__Impl
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
    // InternalBromium.g:612:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__BaseVersionAssignment_4_1 ) ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:616:1: ( ( ( rule__Model__BaseVersionAssignment_4_1 ) ) )
            // InternalBromium.g:617:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            {
            // InternalBromium.g:617:1: ( ( rule__Model__BaseVersionAssignment_4_1 ) )
            // InternalBromium.g:618:2: ( rule__Model__BaseVersionAssignment_4_1 )
            {
             before(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1()); 
            // InternalBromium.g:619:2: ( rule__Model__BaseVersionAssignment_4_1 )
            // InternalBromium.g:619:3: rule__Model__BaseVersionAssignment_4_1
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
    // InternalBromium.g:628:1: rule__ApplicationAction__Group__0 : rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 ;
    public final void rule__ApplicationAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:632:1: ( rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1 )
            // InternalBromium.g:633:2: rule__ApplicationAction__Group__0__Impl rule__ApplicationAction__Group__1
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
    // InternalBromium.g:640:1: rule__ApplicationAction__Group__0__Impl : ( 'action' ) ;
    public final void rule__ApplicationAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:644:1: ( ( 'action' ) )
            // InternalBromium.g:645:1: ( 'action' )
            {
            // InternalBromium.g:645:1: ( 'action' )
            // InternalBromium.g:646:2: 'action'
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
    // InternalBromium.g:655:1: rule__ApplicationAction__Group__1 : rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 ;
    public final void rule__ApplicationAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:659:1: ( rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2 )
            // InternalBromium.g:660:2: rule__ApplicationAction__Group__1__Impl rule__ApplicationAction__Group__2
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
    // InternalBromium.g:667:1: rule__ApplicationAction__Group__1__Impl : ( ( rule__ApplicationAction__ActionIdAssignment_1 ) ) ;
    public final void rule__ApplicationAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:671:1: ( ( ( rule__ApplicationAction__ActionIdAssignment_1 ) ) )
            // InternalBromium.g:672:1: ( ( rule__ApplicationAction__ActionIdAssignment_1 ) )
            {
            // InternalBromium.g:672:1: ( ( rule__ApplicationAction__ActionIdAssignment_1 ) )
            // InternalBromium.g:673:2: ( rule__ApplicationAction__ActionIdAssignment_1 )
            {
             before(grammarAccess.getApplicationActionAccess().getActionIdAssignment_1()); 
            // InternalBromium.g:674:2: ( rule__ApplicationAction__ActionIdAssignment_1 )
            // InternalBromium.g:674:3: rule__ApplicationAction__ActionIdAssignment_1
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
    // InternalBromium.g:682:1: rule__ApplicationAction__Group__2 : rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 ;
    public final void rule__ApplicationAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:686:1: ( rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3 )
            // InternalBromium.g:687:2: rule__ApplicationAction__Group__2__Impl rule__ApplicationAction__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalBromium.g:694:1: rule__ApplicationAction__Group__2__Impl : ( ( rule__ApplicationAction__Group_2__0 )? ) ;
    public final void rule__ApplicationAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:698:1: ( ( ( rule__ApplicationAction__Group_2__0 )? ) )
            // InternalBromium.g:699:1: ( ( rule__ApplicationAction__Group_2__0 )? )
            {
            // InternalBromium.g:699:1: ( ( rule__ApplicationAction__Group_2__0 )? )
            // InternalBromium.g:700:2: ( rule__ApplicationAction__Group_2__0 )?
            {
             before(grammarAccess.getApplicationActionAccess().getGroup_2()); 
            // InternalBromium.g:701:2: ( rule__ApplicationAction__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBromium.g:701:3: rule__ApplicationAction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalBromium.g:709:1: rule__ApplicationAction__Group__3 : rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 ;
    public final void rule__ApplicationAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:713:1: ( rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4 )
            // InternalBromium.g:714:2: rule__ApplicationAction__Group__3__Impl rule__ApplicationAction__Group__4
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
    // InternalBromium.g:721:1: rule__ApplicationAction__Group__3__Impl : ( ( rule__ApplicationAction__WebDriverActionAssignment_3 ) ) ;
    public final void rule__ApplicationAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:725:1: ( ( ( rule__ApplicationAction__WebDriverActionAssignment_3 ) ) )
            // InternalBromium.g:726:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_3 ) )
            {
            // InternalBromium.g:726:1: ( ( rule__ApplicationAction__WebDriverActionAssignment_3 ) )
            // InternalBromium.g:727:2: ( rule__ApplicationAction__WebDriverActionAssignment_3 )
            {
             before(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_3()); 
            // InternalBromium.g:728:2: ( rule__ApplicationAction__WebDriverActionAssignment_3 )
            // InternalBromium.g:728:3: rule__ApplicationAction__WebDriverActionAssignment_3
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
    // InternalBromium.g:736:1: rule__ApplicationAction__Group__4 : rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 ;
    public final void rule__ApplicationAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:740:1: ( rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5 )
            // InternalBromium.g:741:2: rule__ApplicationAction__Group__4__Impl rule__ApplicationAction__Group__5
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
    // InternalBromium.g:748:1: rule__ApplicationAction__Group__4__Impl : ( ( rule__ApplicationAction__Group_4__0 )? ) ;
    public final void rule__ApplicationAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:752:1: ( ( ( rule__ApplicationAction__Group_4__0 )? ) )
            // InternalBromium.g:753:1: ( ( rule__ApplicationAction__Group_4__0 )? )
            {
            // InternalBromium.g:753:1: ( ( rule__ApplicationAction__Group_4__0 )? )
            // InternalBromium.g:754:2: ( rule__ApplicationAction__Group_4__0 )?
            {
             before(grammarAccess.getApplicationActionAccess().getGroup_4()); 
            // InternalBromium.g:755:2: ( rule__ApplicationAction__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBromium.g:755:3: rule__ApplicationAction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalBromium.g:763:1: rule__ApplicationAction__Group__5 : rule__ApplicationAction__Group__5__Impl ;
    public final void rule__ApplicationAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:767:1: ( rule__ApplicationAction__Group__5__Impl )
            // InternalBromium.g:768:2: rule__ApplicationAction__Group__5__Impl
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
    // InternalBromium.g:774:1: rule__ApplicationAction__Group__5__Impl : ( ( rule__ApplicationAction__Group_5__0 )? ) ;
    public final void rule__ApplicationAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:778:1: ( ( ( rule__ApplicationAction__Group_5__0 )? ) )
            // InternalBromium.g:779:1: ( ( rule__ApplicationAction__Group_5__0 )? )
            {
            // InternalBromium.g:779:1: ( ( rule__ApplicationAction__Group_5__0 )? )
            // InternalBromium.g:780:2: ( rule__ApplicationAction__Group_5__0 )?
            {
             before(grammarAccess.getApplicationActionAccess().getGroup_5()); 
            // InternalBromium.g:781:2: ( rule__ApplicationAction__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBromium.g:781:3: rule__ApplicationAction__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationAction__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ApplicationAction__Group_2__0"
    // InternalBromium.g:790:1: rule__ApplicationAction__Group_2__0 : rule__ApplicationAction__Group_2__0__Impl rule__ApplicationAction__Group_2__1 ;
    public final void rule__ApplicationAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:794:1: ( rule__ApplicationAction__Group_2__0__Impl rule__ApplicationAction__Group_2__1 )
            // InternalBromium.g:795:2: rule__ApplicationAction__Group_2__0__Impl rule__ApplicationAction__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ApplicationAction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_2__0"


    // $ANTLR start "rule__ApplicationAction__Group_2__0__Impl"
    // InternalBromium.g:802:1: rule__ApplicationAction__Group_2__0__Impl : ( 'when' ) ;
    public final void rule__ApplicationAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:806:1: ( ( 'when' ) )
            // InternalBromium.g:807:1: ( 'when' )
            {
            // InternalBromium.g:807:1: ( 'when' )
            // InternalBromium.g:808:2: 'when'
            {
             before(grammarAccess.getApplicationActionAccess().getWhenKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getWhenKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_2__0__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_2__1"
    // InternalBromium.g:817:1: rule__ApplicationAction__Group_2__1 : rule__ApplicationAction__Group_2__1__Impl ;
    public final void rule__ApplicationAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:821:1: ( rule__ApplicationAction__Group_2__1__Impl )
            // InternalBromium.g:822:2: rule__ApplicationAction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_2__1"


    // $ANTLR start "rule__ApplicationAction__Group_2__1__Impl"
    // InternalBromium.g:828:1: rule__ApplicationAction__Group_2__1__Impl : ( ( rule__ApplicationAction__PreconditionAssignment_2_1 ) ) ;
    public final void rule__ApplicationAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:832:1: ( ( ( rule__ApplicationAction__PreconditionAssignment_2_1 ) ) )
            // InternalBromium.g:833:1: ( ( rule__ApplicationAction__PreconditionAssignment_2_1 ) )
            {
            // InternalBromium.g:833:1: ( ( rule__ApplicationAction__PreconditionAssignment_2_1 ) )
            // InternalBromium.g:834:2: ( rule__ApplicationAction__PreconditionAssignment_2_1 )
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_2_1()); 
            // InternalBromium.g:835:2: ( rule__ApplicationAction__PreconditionAssignment_2_1 )
            // InternalBromium.g:835:3: rule__ApplicationAction__PreconditionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__PreconditionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_2__1__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_4__0"
    // InternalBromium.g:844:1: rule__ApplicationAction__Group_4__0 : rule__ApplicationAction__Group_4__0__Impl rule__ApplicationAction__Group_4__1 ;
    public final void rule__ApplicationAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:848:1: ( rule__ApplicationAction__Group_4__0__Impl rule__ApplicationAction__Group_4__1 )
            // InternalBromium.g:849:2: rule__ApplicationAction__Group_4__0__Impl rule__ApplicationAction__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ApplicationAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_4__0"


    // $ANTLR start "rule__ApplicationAction__Group_4__0__Impl"
    // InternalBromium.g:856:1: rule__ApplicationAction__Group_4__0__Impl : ( 'then' ) ;
    public final void rule__ApplicationAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:860:1: ( ( 'then' ) )
            // InternalBromium.g:861:1: ( 'then' )
            {
            // InternalBromium.g:861:1: ( 'then' )
            // InternalBromium.g:862:2: 'then'
            {
             before(grammarAccess.getApplicationActionAccess().getThenKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getThenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_4__0__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_4__1"
    // InternalBromium.g:871:1: rule__ApplicationAction__Group_4__1 : rule__ApplicationAction__Group_4__1__Impl rule__ApplicationAction__Group_4__2 ;
    public final void rule__ApplicationAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:875:1: ( rule__ApplicationAction__Group_4__1__Impl rule__ApplicationAction__Group_4__2 )
            // InternalBromium.g:876:2: rule__ApplicationAction__Group_4__1__Impl rule__ApplicationAction__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__ApplicationAction__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_4__1"


    // $ANTLR start "rule__ApplicationAction__Group_4__1__Impl"
    // InternalBromium.g:883:1: rule__ApplicationAction__Group_4__1__Impl : ( 'make' ) ;
    public final void rule__ApplicationAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:887:1: ( ( 'make' ) )
            // InternalBromium.g:888:1: ( 'make' )
            {
            // InternalBromium.g:888:1: ( 'make' )
            // InternalBromium.g:889:2: 'make'
            {
             before(grammarAccess.getApplicationActionAccess().getMakeKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getMakeKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_4__1__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_4__2"
    // InternalBromium.g:898:1: rule__ApplicationAction__Group_4__2 : rule__ApplicationAction__Group_4__2__Impl rule__ApplicationAction__Group_4__3 ;
    public final void rule__ApplicationAction__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:902:1: ( rule__ApplicationAction__Group_4__2__Impl rule__ApplicationAction__Group_4__3 )
            // InternalBromium.g:903:2: rule__ApplicationAction__Group_4__2__Impl rule__ApplicationAction__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__ApplicationAction__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_4__2"


    // $ANTLR start "rule__ApplicationAction__Group_4__2__Impl"
    // InternalBromium.g:910:1: rule__ApplicationAction__Group_4__2__Impl : ( 'sure' ) ;
    public final void rule__ApplicationAction__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:914:1: ( ( 'sure' ) )
            // InternalBromium.g:915:1: ( 'sure' )
            {
            // InternalBromium.g:915:1: ( 'sure' )
            // InternalBromium.g:916:2: 'sure'
            {
             before(grammarAccess.getApplicationActionAccess().getSureKeyword_4_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getSureKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_4__2__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_4__3"
    // InternalBromium.g:925:1: rule__ApplicationAction__Group_4__3 : rule__ApplicationAction__Group_4__3__Impl ;
    public final void rule__ApplicationAction__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:929:1: ( rule__ApplicationAction__Group_4__3__Impl )
            // InternalBromium.g:930:2: rule__ApplicationAction__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_4__3"


    // $ANTLR start "rule__ApplicationAction__Group_4__3__Impl"
    // InternalBromium.g:936:1: rule__ApplicationAction__Group_4__3__Impl : ( ( rule__ApplicationAction__PostconditionAssignment_4_3 ) ) ;
    public final void rule__ApplicationAction__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:940:1: ( ( ( rule__ApplicationAction__PostconditionAssignment_4_3 ) ) )
            // InternalBromium.g:941:1: ( ( rule__ApplicationAction__PostconditionAssignment_4_3 ) )
            {
            // InternalBromium.g:941:1: ( ( rule__ApplicationAction__PostconditionAssignment_4_3 ) )
            // InternalBromium.g:942:2: ( rule__ApplicationAction__PostconditionAssignment_4_3 )
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_4_3()); 
            // InternalBromium.g:943:2: ( rule__ApplicationAction__PostconditionAssignment_4_3 )
            // InternalBromium.g:943:3: rule__ApplicationAction__PostconditionAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__PostconditionAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_4__3__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_5__0"
    // InternalBromium.g:952:1: rule__ApplicationAction__Group_5__0 : rule__ApplicationAction__Group_5__0__Impl rule__ApplicationAction__Group_5__1 ;
    public final void rule__ApplicationAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:956:1: ( rule__ApplicationAction__Group_5__0__Impl rule__ApplicationAction__Group_5__1 )
            // InternalBromium.g:957:2: rule__ApplicationAction__Group_5__0__Impl rule__ApplicationAction__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__ApplicationAction__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__0"


    // $ANTLR start "rule__ApplicationAction__Group_5__0__Impl"
    // InternalBromium.g:964:1: rule__ApplicationAction__Group_5__0__Impl : ( 'do' ) ;
    public final void rule__ApplicationAction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:968:1: ( ( 'do' ) )
            // InternalBromium.g:969:1: ( 'do' )
            {
            // InternalBromium.g:969:1: ( 'do' )
            // InternalBromium.g:970:2: 'do'
            {
             before(grammarAccess.getApplicationActionAccess().getDoKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getDoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__0__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_5__1"
    // InternalBromium.g:979:1: rule__ApplicationAction__Group_5__1 : rule__ApplicationAction__Group_5__1__Impl rule__ApplicationAction__Group_5__2 ;
    public final void rule__ApplicationAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:983:1: ( rule__ApplicationAction__Group_5__1__Impl rule__ApplicationAction__Group_5__2 )
            // InternalBromium.g:984:2: rule__ApplicationAction__Group_5__1__Impl rule__ApplicationAction__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__ApplicationAction__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__1"


    // $ANTLR start "rule__ApplicationAction__Group_5__1__Impl"
    // InternalBromium.g:991:1: rule__ApplicationAction__Group_5__1__Impl : ( ( 'not' )? ) ;
    public final void rule__ApplicationAction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:995:1: ( ( ( 'not' )? ) )
            // InternalBromium.g:996:1: ( ( 'not' )? )
            {
            // InternalBromium.g:996:1: ( ( 'not' )? )
            // InternalBromium.g:997:2: ( 'not' )?
            {
             before(grammarAccess.getApplicationActionAccess().getNotKeyword_5_1()); 
            // InternalBromium.g:998:2: ( 'not' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBromium.g:998:3: 'not'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getApplicationActionAccess().getNotKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__1__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_5__2"
    // InternalBromium.g:1006:1: rule__ApplicationAction__Group_5__2 : rule__ApplicationAction__Group_5__2__Impl rule__ApplicationAction__Group_5__3 ;
    public final void rule__ApplicationAction__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1010:1: ( rule__ApplicationAction__Group_5__2__Impl rule__ApplicationAction__Group_5__3 )
            // InternalBromium.g:1011:2: rule__ApplicationAction__Group_5__2__Impl rule__ApplicationAction__Group_5__3
            {
            pushFollow(FOLLOW_15);
            rule__ApplicationAction__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__2"


    // $ANTLR start "rule__ApplicationAction__Group_5__2__Impl"
    // InternalBromium.g:1018:1: rule__ApplicationAction__Group_5__2__Impl : ( 'expect' ) ;
    public final void rule__ApplicationAction__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1022:1: ( ( 'expect' ) )
            // InternalBromium.g:1023:1: ( 'expect' )
            {
            // InternalBromium.g:1023:1: ( 'expect' )
            // InternalBromium.g:1024:2: 'expect'
            {
             before(grammarAccess.getApplicationActionAccess().getExpectKeyword_5_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getExpectKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__2__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_5__3"
    // InternalBromium.g:1033:1: rule__ApplicationAction__Group_5__3 : rule__ApplicationAction__Group_5__3__Impl rule__ApplicationAction__Group_5__4 ;
    public final void rule__ApplicationAction__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1037:1: ( rule__ApplicationAction__Group_5__3__Impl rule__ApplicationAction__Group_5__4 )
            // InternalBromium.g:1038:2: rule__ApplicationAction__Group_5__3__Impl rule__ApplicationAction__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__ApplicationAction__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__3"


    // $ANTLR start "rule__ApplicationAction__Group_5__3__Impl"
    // InternalBromium.g:1045:1: rule__ApplicationAction__Group_5__3__Impl : ( 'http' ) ;
    public final void rule__ApplicationAction__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1049:1: ( ( 'http' ) )
            // InternalBromium.g:1050:1: ( 'http' )
            {
            // InternalBromium.g:1050:1: ( 'http' )
            // InternalBromium.g:1051:2: 'http'
            {
             before(grammarAccess.getApplicationActionAccess().getHttpKeyword_5_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getHttpKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__3__Impl"


    // $ANTLR start "rule__ApplicationAction__Group_5__4"
    // InternalBromium.g:1060:1: rule__ApplicationAction__Group_5__4 : rule__ApplicationAction__Group_5__4__Impl ;
    public final void rule__ApplicationAction__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1064:1: ( rule__ApplicationAction__Group_5__4__Impl )
            // InternalBromium.g:1065:2: rule__ApplicationAction__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAction__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__4"


    // $ANTLR start "rule__ApplicationAction__Group_5__4__Impl"
    // InternalBromium.g:1071:1: rule__ApplicationAction__Group_5__4__Impl : ( 'request' ) ;
    public final void rule__ApplicationAction__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1075:1: ( ( 'request' ) )
            // InternalBromium.g:1076:1: ( 'request' )
            {
            // InternalBromium.g:1076:1: ( 'request' )
            // InternalBromium.g:1077:2: 'request'
            {
             before(grammarAccess.getApplicationActionAccess().getRequestKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getApplicationActionAccess().getRequestKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__Group_5__4__Impl"


    // $ANTLR start "rule__ElementWithIdIsPresent__Group__0"
    // InternalBromium.g:1087:1: rule__ElementWithIdIsPresent__Group__0 : rule__ElementWithIdIsPresent__Group__0__Impl rule__ElementWithIdIsPresent__Group__1 ;
    public final void rule__ElementWithIdIsPresent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1091:1: ( rule__ElementWithIdIsPresent__Group__0__Impl rule__ElementWithIdIsPresent__Group__1 )
            // InternalBromium.g:1092:2: rule__ElementWithIdIsPresent__Group__0__Impl rule__ElementWithIdIsPresent__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBromium.g:1099:1: rule__ElementWithIdIsPresent__Group__0__Impl : ( 'element' ) ;
    public final void rule__ElementWithIdIsPresent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1103:1: ( ( 'element' ) )
            // InternalBromium.g:1104:1: ( 'element' )
            {
            // InternalBromium.g:1104:1: ( 'element' )
            // InternalBromium.g:1105:2: 'element'
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
    // InternalBromium.g:1114:1: rule__ElementWithIdIsPresent__Group__1 : rule__ElementWithIdIsPresent__Group__1__Impl rule__ElementWithIdIsPresent__Group__2 ;
    public final void rule__ElementWithIdIsPresent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1118:1: ( rule__ElementWithIdIsPresent__Group__1__Impl rule__ElementWithIdIsPresent__Group__2 )
            // InternalBromium.g:1119:2: rule__ElementWithIdIsPresent__Group__1__Impl rule__ElementWithIdIsPresent__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBromium.g:1126:1: rule__ElementWithIdIsPresent__Group__1__Impl : ( 'with' ) ;
    public final void rule__ElementWithIdIsPresent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1130:1: ( ( 'with' ) )
            // InternalBromium.g:1131:1: ( 'with' )
            {
            // InternalBromium.g:1131:1: ( 'with' )
            // InternalBromium.g:1132:2: 'with'
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
    // InternalBromium.g:1141:1: rule__ElementWithIdIsPresent__Group__2 : rule__ElementWithIdIsPresent__Group__2__Impl rule__ElementWithIdIsPresent__Group__3 ;
    public final void rule__ElementWithIdIsPresent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1145:1: ( rule__ElementWithIdIsPresent__Group__2__Impl rule__ElementWithIdIsPresent__Group__3 )
            // InternalBromium.g:1146:2: rule__ElementWithIdIsPresent__Group__2__Impl rule__ElementWithIdIsPresent__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:1153:1: rule__ElementWithIdIsPresent__Group__2__Impl : ( 'css' ) ;
    public final void rule__ElementWithIdIsPresent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1157:1: ( ( 'css' ) )
            // InternalBromium.g:1158:1: ( 'css' )
            {
            // InternalBromium.g:1158:1: ( 'css' )
            // InternalBromium.g:1159:2: 'css'
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
    // InternalBromium.g:1168:1: rule__ElementWithIdIsPresent__Group__3 : rule__ElementWithIdIsPresent__Group__3__Impl rule__ElementWithIdIsPresent__Group__4 ;
    public final void rule__ElementWithIdIsPresent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1172:1: ( rule__ElementWithIdIsPresent__Group__3__Impl rule__ElementWithIdIsPresent__Group__4 )
            // InternalBromium.g:1173:2: rule__ElementWithIdIsPresent__Group__3__Impl rule__ElementWithIdIsPresent__Group__4
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
    // InternalBromium.g:1180:1: rule__ElementWithIdIsPresent__Group__3__Impl : ( 'selector' ) ;
    public final void rule__ElementWithIdIsPresent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1184:1: ( ( 'selector' ) )
            // InternalBromium.g:1185:1: ( 'selector' )
            {
            // InternalBromium.g:1185:1: ( 'selector' )
            // InternalBromium.g:1186:2: 'selector'
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
    // InternalBromium.g:1195:1: rule__ElementWithIdIsPresent__Group__4 : rule__ElementWithIdIsPresent__Group__4__Impl rule__ElementWithIdIsPresent__Group__5 ;
    public final void rule__ElementWithIdIsPresent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1199:1: ( rule__ElementWithIdIsPresent__Group__4__Impl rule__ElementWithIdIsPresent__Group__5 )
            // InternalBromium.g:1200:2: rule__ElementWithIdIsPresent__Group__4__Impl rule__ElementWithIdIsPresent__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalBromium.g:1207:1: rule__ElementWithIdIsPresent__Group__4__Impl : ( ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 ) ) ;
    public final void rule__ElementWithIdIsPresent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1211:1: ( ( ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 ) ) )
            // InternalBromium.g:1212:1: ( ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 ) )
            {
            // InternalBromium.g:1212:1: ( ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 ) )
            // InternalBromium.g:1213:2: ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 )
            {
             before(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorAssignment_4()); 
            // InternalBromium.g:1214:2: ( rule__ElementWithIdIsPresent__CssSelectorAssignment_4 )
            // InternalBromium.g:1214:3: rule__ElementWithIdIsPresent__CssSelectorAssignment_4
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
    // InternalBromium.g:1222:1: rule__ElementWithIdIsPresent__Group__5 : rule__ElementWithIdIsPresent__Group__5__Impl rule__ElementWithIdIsPresent__Group__6 ;
    public final void rule__ElementWithIdIsPresent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1226:1: ( rule__ElementWithIdIsPresent__Group__5__Impl rule__ElementWithIdIsPresent__Group__6 )
            // InternalBromium.g:1227:2: rule__ElementWithIdIsPresent__Group__5__Impl rule__ElementWithIdIsPresent__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalBromium.g:1234:1: rule__ElementWithIdIsPresent__Group__5__Impl : ( 'is' ) ;
    public final void rule__ElementWithIdIsPresent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1238:1: ( ( 'is' ) )
            // InternalBromium.g:1239:1: ( 'is' )
            {
            // InternalBromium.g:1239:1: ( 'is' )
            // InternalBromium.g:1240:2: 'is'
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
    // InternalBromium.g:1249:1: rule__ElementWithIdIsPresent__Group__6 : rule__ElementWithIdIsPresent__Group__6__Impl ;
    public final void rule__ElementWithIdIsPresent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1253:1: ( rule__ElementWithIdIsPresent__Group__6__Impl )
            // InternalBromium.g:1254:2: rule__ElementWithIdIsPresent__Group__6__Impl
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
    // InternalBromium.g:1260:1: rule__ElementWithIdIsPresent__Group__6__Impl : ( 'clickable' ) ;
    public final void rule__ElementWithIdIsPresent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1264:1: ( ( 'clickable' ) )
            // InternalBromium.g:1265:1: ( 'clickable' )
            {
            // InternalBromium.g:1265:1: ( 'clickable' )
            // InternalBromium.g:1266:2: 'clickable'
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
    // InternalBromium.g:1276:1: rule__ClickOnElementWithId__Group__0 : rule__ClickOnElementWithId__Group__0__Impl rule__ClickOnElementWithId__Group__1 ;
    public final void rule__ClickOnElementWithId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1280:1: ( rule__ClickOnElementWithId__Group__0__Impl rule__ClickOnElementWithId__Group__1 )
            // InternalBromium.g:1281:2: rule__ClickOnElementWithId__Group__0__Impl rule__ClickOnElementWithId__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBromium.g:1288:1: rule__ClickOnElementWithId__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickOnElementWithId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1292:1: ( ( 'click' ) )
            // InternalBromium.g:1293:1: ( 'click' )
            {
            // InternalBromium.g:1293:1: ( 'click' )
            // InternalBromium.g:1294:2: 'click'
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
    // InternalBromium.g:1303:1: rule__ClickOnElementWithId__Group__1 : rule__ClickOnElementWithId__Group__1__Impl rule__ClickOnElementWithId__Group__2 ;
    public final void rule__ClickOnElementWithId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1307:1: ( rule__ClickOnElementWithId__Group__1__Impl rule__ClickOnElementWithId__Group__2 )
            // InternalBromium.g:1308:2: rule__ClickOnElementWithId__Group__1__Impl rule__ClickOnElementWithId__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalBromium.g:1315:1: rule__ClickOnElementWithId__Group__1__Impl : ( 'on' ) ;
    public final void rule__ClickOnElementWithId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1319:1: ( ( 'on' ) )
            // InternalBromium.g:1320:1: ( 'on' )
            {
            // InternalBromium.g:1320:1: ( 'on' )
            // InternalBromium.g:1321:2: 'on'
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
    // InternalBromium.g:1330:1: rule__ClickOnElementWithId__Group__2 : rule__ClickOnElementWithId__Group__2__Impl rule__ClickOnElementWithId__Group__3 ;
    public final void rule__ClickOnElementWithId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1334:1: ( rule__ClickOnElementWithId__Group__2__Impl rule__ClickOnElementWithId__Group__3 )
            // InternalBromium.g:1335:2: rule__ClickOnElementWithId__Group__2__Impl rule__ClickOnElementWithId__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBromium.g:1342:1: rule__ClickOnElementWithId__Group__2__Impl : ( 'element' ) ;
    public final void rule__ClickOnElementWithId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1346:1: ( ( 'element' ) )
            // InternalBromium.g:1347:1: ( 'element' )
            {
            // InternalBromium.g:1347:1: ( 'element' )
            // InternalBromium.g:1348:2: 'element'
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
    // InternalBromium.g:1357:1: rule__ClickOnElementWithId__Group__3 : rule__ClickOnElementWithId__Group__3__Impl rule__ClickOnElementWithId__Group__4 ;
    public final void rule__ClickOnElementWithId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1361:1: ( rule__ClickOnElementWithId__Group__3__Impl rule__ClickOnElementWithId__Group__4 )
            // InternalBromium.g:1362:2: rule__ClickOnElementWithId__Group__3__Impl rule__ClickOnElementWithId__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalBromium.g:1369:1: rule__ClickOnElementWithId__Group__3__Impl : ( 'with' ) ;
    public final void rule__ClickOnElementWithId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1373:1: ( ( 'with' ) )
            // InternalBromium.g:1374:1: ( 'with' )
            {
            // InternalBromium.g:1374:1: ( 'with' )
            // InternalBromium.g:1375:2: 'with'
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
    // InternalBromium.g:1384:1: rule__ClickOnElementWithId__Group__4 : rule__ClickOnElementWithId__Group__4__Impl rule__ClickOnElementWithId__Group__5 ;
    public final void rule__ClickOnElementWithId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1388:1: ( rule__ClickOnElementWithId__Group__4__Impl rule__ClickOnElementWithId__Group__5 )
            // InternalBromium.g:1389:2: rule__ClickOnElementWithId__Group__4__Impl rule__ClickOnElementWithId__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:1396:1: rule__ClickOnElementWithId__Group__4__Impl : ( 'css' ) ;
    public final void rule__ClickOnElementWithId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1400:1: ( ( 'css' ) )
            // InternalBromium.g:1401:1: ( 'css' )
            {
            // InternalBromium.g:1401:1: ( 'css' )
            // InternalBromium.g:1402:2: 'css'
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
    // InternalBromium.g:1411:1: rule__ClickOnElementWithId__Group__5 : rule__ClickOnElementWithId__Group__5__Impl rule__ClickOnElementWithId__Group__6 ;
    public final void rule__ClickOnElementWithId__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1415:1: ( rule__ClickOnElementWithId__Group__5__Impl rule__ClickOnElementWithId__Group__6 )
            // InternalBromium.g:1416:2: rule__ClickOnElementWithId__Group__5__Impl rule__ClickOnElementWithId__Group__6
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
    // InternalBromium.g:1423:1: rule__ClickOnElementWithId__Group__5__Impl : ( 'selector' ) ;
    public final void rule__ClickOnElementWithId__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1427:1: ( ( 'selector' ) )
            // InternalBromium.g:1428:1: ( 'selector' )
            {
            // InternalBromium.g:1428:1: ( 'selector' )
            // InternalBromium.g:1429:2: 'selector'
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
    // InternalBromium.g:1438:1: rule__ClickOnElementWithId__Group__6 : rule__ClickOnElementWithId__Group__6__Impl ;
    public final void rule__ClickOnElementWithId__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1442:1: ( rule__ClickOnElementWithId__Group__6__Impl )
            // InternalBromium.g:1443:2: rule__ClickOnElementWithId__Group__6__Impl
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
    // InternalBromium.g:1449:1: rule__ClickOnElementWithId__Group__6__Impl : ( ( rule__ClickOnElementWithId__CssSelectorAssignment_6 ) ) ;
    public final void rule__ClickOnElementWithId__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1453:1: ( ( ( rule__ClickOnElementWithId__CssSelectorAssignment_6 ) ) )
            // InternalBromium.g:1454:1: ( ( rule__ClickOnElementWithId__CssSelectorAssignment_6 ) )
            {
            // InternalBromium.g:1454:1: ( ( rule__ClickOnElementWithId__CssSelectorAssignment_6 ) )
            // InternalBromium.g:1455:2: ( rule__ClickOnElementWithId__CssSelectorAssignment_6 )
            {
             before(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorAssignment_6()); 
            // InternalBromium.g:1456:2: ( rule__ClickOnElementWithId__CssSelectorAssignment_6 )
            // InternalBromium.g:1456:3: rule__ClickOnElementWithId__CssSelectorAssignment_6
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
    // InternalBromium.g:1465:1: rule__PageLoad__Group__0 : rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 ;
    public final void rule__PageLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1469:1: ( rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1 )
            // InternalBromium.g:1470:2: rule__PageLoad__Group__0__Impl rule__PageLoad__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBromium.g:1477:1: rule__PageLoad__Group__0__Impl : ( 'load' ) ;
    public final void rule__PageLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1481:1: ( ( 'load' ) )
            // InternalBromium.g:1482:1: ( 'load' )
            {
            // InternalBromium.g:1482:1: ( 'load' )
            // InternalBromium.g:1483:2: 'load'
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
    // InternalBromium.g:1492:1: rule__PageLoad__Group__1 : rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 ;
    public final void rule__PageLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1496:1: ( rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2 )
            // InternalBromium.g:1497:2: rule__PageLoad__Group__1__Impl rule__PageLoad__Group__2
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
    // InternalBromium.g:1504:1: rule__PageLoad__Group__1__Impl : ( 'page' ) ;
    public final void rule__PageLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1508:1: ( ( 'page' ) )
            // InternalBromium.g:1509:1: ( 'page' )
            {
            // InternalBromium.g:1509:1: ( 'page' )
            // InternalBromium.g:1510:2: 'page'
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
    // InternalBromium.g:1519:1: rule__PageLoad__Group__2 : rule__PageLoad__Group__2__Impl ;
    public final void rule__PageLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1523:1: ( rule__PageLoad__Group__2__Impl )
            // InternalBromium.g:1524:2: rule__PageLoad__Group__2__Impl
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
    // InternalBromium.g:1530:1: rule__PageLoad__Group__2__Impl : ( ( rule__PageLoad__SubpathAssignment_2 ) ) ;
    public final void rule__PageLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1534:1: ( ( ( rule__PageLoad__SubpathAssignment_2 ) ) )
            // InternalBromium.g:1535:1: ( ( rule__PageLoad__SubpathAssignment_2 ) )
            {
            // InternalBromium.g:1535:1: ( ( rule__PageLoad__SubpathAssignment_2 ) )
            // InternalBromium.g:1536:2: ( rule__PageLoad__SubpathAssignment_2 )
            {
             before(grammarAccess.getPageLoadAccess().getSubpathAssignment_2()); 
            // InternalBromium.g:1537:2: ( rule__PageLoad__SubpathAssignment_2 )
            // InternalBromium.g:1537:3: rule__PageLoad__SubpathAssignment_2
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
    // InternalBromium.g:1546:1: rule__TypeTextInElementFoundByCssSelector__Group__0 : rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1550:1: ( rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1 )
            // InternalBromium.g:1551:2: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl rule__TypeTextInElementFoundByCssSelector__Group__1
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
    // InternalBromium.g:1558:1: rule__TypeTextInElementFoundByCssSelector__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1562:1: ( ( 'type' ) )
            // InternalBromium.g:1563:1: ( 'type' )
            {
            // InternalBromium.g:1563:1: ( 'type' )
            // InternalBromium.g:1564:2: 'type'
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
    // InternalBromium.g:1573:1: rule__TypeTextInElementFoundByCssSelector__Group__1 : rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1577:1: ( rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2 )
            // InternalBromium.g:1578:2: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl rule__TypeTextInElementFoundByCssSelector__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBromium.g:1585:1: rule__TypeTextInElementFoundByCssSelector__Group__1__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1589:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 ) ) )
            // InternalBromium.g:1590:1: ( ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 ) )
            {
            // InternalBromium.g:1590:1: ( ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 ) )
            // InternalBromium.g:1591:2: ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextAssignment_1()); 
            // InternalBromium.g:1592:2: ( rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 )
            // InternalBromium.g:1592:3: rule__TypeTextInElementFoundByCssSelector__TextAssignment_1
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
    // InternalBromium.g:1600:1: rule__TypeTextInElementFoundByCssSelector__Group__2 : rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1604:1: ( rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3 )
            // InternalBromium.g:1605:2: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl rule__TypeTextInElementFoundByCssSelector__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalBromium.g:1612:1: rule__TypeTextInElementFoundByCssSelector__Group__2__Impl : ( 'in' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1616:1: ( ( 'in' ) )
            // InternalBromium.g:1617:1: ( 'in' )
            {
            // InternalBromium.g:1617:1: ( 'in' )
            // InternalBromium.g:1618:2: 'in'
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
    // InternalBromium.g:1627:1: rule__TypeTextInElementFoundByCssSelector__Group__3 : rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1631:1: ( rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4 )
            // InternalBromium.g:1632:2: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl rule__TypeTextInElementFoundByCssSelector__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalBromium.g:1639:1: rule__TypeTextInElementFoundByCssSelector__Group__3__Impl : ( 'element' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1643:1: ( ( 'element' ) )
            // InternalBromium.g:1644:1: ( 'element' )
            {
            // InternalBromium.g:1644:1: ( 'element' )
            // InternalBromium.g:1645:2: 'element'
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
    // InternalBromium.g:1654:1: rule__TypeTextInElementFoundByCssSelector__Group__4 : rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1658:1: ( rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5 )
            // InternalBromium.g:1659:2: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl rule__TypeTextInElementFoundByCssSelector__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalBromium.g:1666:1: rule__TypeTextInElementFoundByCssSelector__Group__4__Impl : ( 'with' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1670:1: ( ( 'with' ) )
            // InternalBromium.g:1671:1: ( 'with' )
            {
            // InternalBromium.g:1671:1: ( 'with' )
            // InternalBromium.g:1672:2: 'with'
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
    // InternalBromium.g:1681:1: rule__TypeTextInElementFoundByCssSelector__Group__5 : rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1685:1: ( rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6 )
            // InternalBromium.g:1686:2: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl rule__TypeTextInElementFoundByCssSelector__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalBromium.g:1693:1: rule__TypeTextInElementFoundByCssSelector__Group__5__Impl : ( 'css' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1697:1: ( ( 'css' ) )
            // InternalBromium.g:1698:1: ( 'css' )
            {
            // InternalBromium.g:1698:1: ( 'css' )
            // InternalBromium.g:1699:2: 'css'
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
    // InternalBromium.g:1708:1: rule__TypeTextInElementFoundByCssSelector__Group__6 : rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1712:1: ( rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7 )
            // InternalBromium.g:1713:2: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl rule__TypeTextInElementFoundByCssSelector__Group__7
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
    // InternalBromium.g:1720:1: rule__TypeTextInElementFoundByCssSelector__Group__6__Impl : ( 'selector' ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1724:1: ( ( 'selector' ) )
            // InternalBromium.g:1725:1: ( 'selector' )
            {
            // InternalBromium.g:1725:1: ( 'selector' )
            // InternalBromium.g:1726:2: 'selector'
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
    // InternalBromium.g:1735:1: rule__TypeTextInElementFoundByCssSelector__Group__7 : rule__TypeTextInElementFoundByCssSelector__Group__7__Impl ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1739:1: ( rule__TypeTextInElementFoundByCssSelector__Group__7__Impl )
            // InternalBromium.g:1740:2: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl
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
    // InternalBromium.g:1746:1: rule__TypeTextInElementFoundByCssSelector__Group__7__Impl : ( ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 ) ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1750:1: ( ( ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 ) ) )
            // InternalBromium.g:1751:1: ( ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 ) )
            {
            // InternalBromium.g:1751:1: ( ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 ) )
            // InternalBromium.g:1752:2: ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 )
            {
             before(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorAssignment_7()); 
            // InternalBromium.g:1753:2: ( rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 )
            // InternalBromium.g:1753:3: rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7
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


    // $ANTLR start "rule__ThreeDottedVersion__Group__0"
    // InternalBromium.g:1762:1: rule__ThreeDottedVersion__Group__0 : rule__ThreeDottedVersion__Group__0__Impl rule__ThreeDottedVersion__Group__1 ;
    public final void rule__ThreeDottedVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1766:1: ( rule__ThreeDottedVersion__Group__0__Impl rule__ThreeDottedVersion__Group__1 )
            // InternalBromium.g:1767:2: rule__ThreeDottedVersion__Group__0__Impl rule__ThreeDottedVersion__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ThreeDottedVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__0"


    // $ANTLR start "rule__ThreeDottedVersion__Group__0__Impl"
    // InternalBromium.g:1774:1: rule__ThreeDottedVersion__Group__0__Impl : ( ( rule__ThreeDottedVersion__BigAssignment_0 ) ) ;
    public final void rule__ThreeDottedVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1778:1: ( ( ( rule__ThreeDottedVersion__BigAssignment_0 ) ) )
            // InternalBromium.g:1779:1: ( ( rule__ThreeDottedVersion__BigAssignment_0 ) )
            {
            // InternalBromium.g:1779:1: ( ( rule__ThreeDottedVersion__BigAssignment_0 ) )
            // InternalBromium.g:1780:2: ( rule__ThreeDottedVersion__BigAssignment_0 )
            {
             before(grammarAccess.getThreeDottedVersionAccess().getBigAssignment_0()); 
            // InternalBromium.g:1781:2: ( rule__ThreeDottedVersion__BigAssignment_0 )
            // InternalBromium.g:1781:3: rule__ThreeDottedVersion__BigAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__BigAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getThreeDottedVersionAccess().getBigAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__0__Impl"


    // $ANTLR start "rule__ThreeDottedVersion__Group__1"
    // InternalBromium.g:1789:1: rule__ThreeDottedVersion__Group__1 : rule__ThreeDottedVersion__Group__1__Impl rule__ThreeDottedVersion__Group__2 ;
    public final void rule__ThreeDottedVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1793:1: ( rule__ThreeDottedVersion__Group__1__Impl rule__ThreeDottedVersion__Group__2 )
            // InternalBromium.g:1794:2: rule__ThreeDottedVersion__Group__1__Impl rule__ThreeDottedVersion__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ThreeDottedVersion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__1"


    // $ANTLR start "rule__ThreeDottedVersion__Group__1__Impl"
    // InternalBromium.g:1801:1: rule__ThreeDottedVersion__Group__1__Impl : ( '.' ) ;
    public final void rule__ThreeDottedVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1805:1: ( ( '.' ) )
            // InternalBromium.g:1806:1: ( '.' )
            {
            // InternalBromium.g:1806:1: ( '.' )
            // InternalBromium.g:1807:2: '.'
            {
             before(grammarAccess.getThreeDottedVersionAccess().getFullStopKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getThreeDottedVersionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__1__Impl"


    // $ANTLR start "rule__ThreeDottedVersion__Group__2"
    // InternalBromium.g:1816:1: rule__ThreeDottedVersion__Group__2 : rule__ThreeDottedVersion__Group__2__Impl rule__ThreeDottedVersion__Group__3 ;
    public final void rule__ThreeDottedVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1820:1: ( rule__ThreeDottedVersion__Group__2__Impl rule__ThreeDottedVersion__Group__3 )
            // InternalBromium.g:1821:2: rule__ThreeDottedVersion__Group__2__Impl rule__ThreeDottedVersion__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__ThreeDottedVersion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__2"


    // $ANTLR start "rule__ThreeDottedVersion__Group__2__Impl"
    // InternalBromium.g:1828:1: rule__ThreeDottedVersion__Group__2__Impl : ( ( rule__ThreeDottedVersion__MediumAssignment_2 ) ) ;
    public final void rule__ThreeDottedVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1832:1: ( ( ( rule__ThreeDottedVersion__MediumAssignment_2 ) ) )
            // InternalBromium.g:1833:1: ( ( rule__ThreeDottedVersion__MediumAssignment_2 ) )
            {
            // InternalBromium.g:1833:1: ( ( rule__ThreeDottedVersion__MediumAssignment_2 ) )
            // InternalBromium.g:1834:2: ( rule__ThreeDottedVersion__MediumAssignment_2 )
            {
             before(grammarAccess.getThreeDottedVersionAccess().getMediumAssignment_2()); 
            // InternalBromium.g:1835:2: ( rule__ThreeDottedVersion__MediumAssignment_2 )
            // InternalBromium.g:1835:3: rule__ThreeDottedVersion__MediumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__MediumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThreeDottedVersionAccess().getMediumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__2__Impl"


    // $ANTLR start "rule__ThreeDottedVersion__Group__3"
    // InternalBromium.g:1843:1: rule__ThreeDottedVersion__Group__3 : rule__ThreeDottedVersion__Group__3__Impl rule__ThreeDottedVersion__Group__4 ;
    public final void rule__ThreeDottedVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1847:1: ( rule__ThreeDottedVersion__Group__3__Impl rule__ThreeDottedVersion__Group__4 )
            // InternalBromium.g:1848:2: rule__ThreeDottedVersion__Group__3__Impl rule__ThreeDottedVersion__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__ThreeDottedVersion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__3"


    // $ANTLR start "rule__ThreeDottedVersion__Group__3__Impl"
    // InternalBromium.g:1855:1: rule__ThreeDottedVersion__Group__3__Impl : ( '.' ) ;
    public final void rule__ThreeDottedVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1859:1: ( ( '.' ) )
            // InternalBromium.g:1860:1: ( '.' )
            {
            // InternalBromium.g:1860:1: ( '.' )
            // InternalBromium.g:1861:2: '.'
            {
             before(grammarAccess.getThreeDottedVersionAccess().getFullStopKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getThreeDottedVersionAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__3__Impl"


    // $ANTLR start "rule__ThreeDottedVersion__Group__4"
    // InternalBromium.g:1870:1: rule__ThreeDottedVersion__Group__4 : rule__ThreeDottedVersion__Group__4__Impl ;
    public final void rule__ThreeDottedVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1874:1: ( rule__ThreeDottedVersion__Group__4__Impl )
            // InternalBromium.g:1875:2: rule__ThreeDottedVersion__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__4"


    // $ANTLR start "rule__ThreeDottedVersion__Group__4__Impl"
    // InternalBromium.g:1881:1: rule__ThreeDottedVersion__Group__4__Impl : ( ( rule__ThreeDottedVersion__SmallAssignment_4 ) ) ;
    public final void rule__ThreeDottedVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1885:1: ( ( ( rule__ThreeDottedVersion__SmallAssignment_4 ) ) )
            // InternalBromium.g:1886:1: ( ( rule__ThreeDottedVersion__SmallAssignment_4 ) )
            {
            // InternalBromium.g:1886:1: ( ( rule__ThreeDottedVersion__SmallAssignment_4 ) )
            // InternalBromium.g:1887:2: ( rule__ThreeDottedVersion__SmallAssignment_4 )
            {
             before(grammarAccess.getThreeDottedVersionAccess().getSmallAssignment_4()); 
            // InternalBromium.g:1888:2: ( rule__ThreeDottedVersion__SmallAssignment_4 )
            // InternalBromium.g:1888:3: rule__ThreeDottedVersion__SmallAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ThreeDottedVersion__SmallAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getThreeDottedVersionAccess().getSmallAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__Group__4__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalBromium.g:1897:1: rule__Model__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1901:1: ( ( RULE_STRING ) )
            // InternalBromium.g:1902:2: ( RULE_STRING )
            {
            // InternalBromium.g:1902:2: ( RULE_STRING )
            // InternalBromium.g:1903:3: RULE_STRING
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
    // InternalBromium.g:1912:1: rule__Model__VersionAssignment_3 : ( ruleVersion ) ;
    public final void rule__Model__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1916:1: ( ( ruleVersion ) )
            // InternalBromium.g:1917:2: ( ruleVersion )
            {
            // InternalBromium.g:1917:2: ( ruleVersion )
            // InternalBromium.g:1918:3: ruleVersion
            {
             before(grammarAccess.getModelAccess().getVersionVersionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVersionVersionParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalBromium.g:1927:1: rule__Model__BaseVersionAssignment_4_1 : ( ruleVersion ) ;
    public final void rule__Model__BaseVersionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1931:1: ( ( ruleVersion ) )
            // InternalBromium.g:1932:2: ( ruleVersion )
            {
            // InternalBromium.g:1932:2: ( ruleVersion )
            // InternalBromium.g:1933:3: ruleVersion
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
    // InternalBromium.g:1942:1: rule__Model__ActionsAssignment_7 : ( ruleApplicationAction ) ;
    public final void rule__Model__ActionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1946:1: ( ( ruleApplicationAction ) )
            // InternalBromium.g:1947:2: ( ruleApplicationAction )
            {
            // InternalBromium.g:1947:2: ( ruleApplicationAction )
            // InternalBromium.g:1948:3: ruleApplicationAction
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
    // InternalBromium.g:1957:1: rule__ApplicationAction__ActionIdAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ApplicationAction__ActionIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1961:1: ( ( RULE_STRING ) )
            // InternalBromium.g:1962:2: ( RULE_STRING )
            {
            // InternalBromium.g:1962:2: ( RULE_STRING )
            // InternalBromium.g:1963:3: RULE_STRING
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


    // $ANTLR start "rule__ApplicationAction__PreconditionAssignment_2_1"
    // InternalBromium.g:1972:1: rule__ApplicationAction__PreconditionAssignment_2_1 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__PreconditionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1976:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:1977:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:1977:2: ( ruleWebDriverAction )
            // InternalBromium.g:1978:3: ruleWebDriverAction
            {
             before(grammarAccess.getApplicationActionAccess().getPreconditionWebDriverActionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverAction();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getPreconditionWebDriverActionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__PreconditionAssignment_2_1"


    // $ANTLR start "rule__ApplicationAction__WebDriverActionAssignment_3"
    // InternalBromium.g:1987:1: rule__ApplicationAction__WebDriverActionAssignment_3 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__WebDriverActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:1991:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:1992:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:1992:2: ( ruleWebDriverAction )
            // InternalBromium.g:1993:3: ruleWebDriverAction
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


    // $ANTLR start "rule__ApplicationAction__PostconditionAssignment_4_3"
    // InternalBromium.g:2002:1: rule__ApplicationAction__PostconditionAssignment_4_3 : ( ruleWebDriverAction ) ;
    public final void rule__ApplicationAction__PostconditionAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2006:1: ( ( ruleWebDriverAction ) )
            // InternalBromium.g:2007:2: ( ruleWebDriverAction )
            {
            // InternalBromium.g:2007:2: ( ruleWebDriverAction )
            // InternalBromium.g:2008:3: ruleWebDriverAction
            {
             before(grammarAccess.getApplicationActionAccess().getPostconditionWebDriverActionParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWebDriverAction();

            state._fsp--;

             after(grammarAccess.getApplicationActionAccess().getPostconditionWebDriverActionParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationAction__PostconditionAssignment_4_3"


    // $ANTLR start "rule__ElementWithIdIsPresent__CssSelectorAssignment_4"
    // InternalBromium.g:2017:1: rule__ElementWithIdIsPresent__CssSelectorAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ElementWithIdIsPresent__CssSelectorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2021:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2022:2: ( RULE_STRING )
            {
            // InternalBromium.g:2022:2: ( RULE_STRING )
            // InternalBromium.g:2023:3: RULE_STRING
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
    // InternalBromium.g:2032:1: rule__ClickOnElementWithId__CssSelectorAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClickOnElementWithId__CssSelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2036:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2037:2: ( RULE_STRING )
            {
            // InternalBromium.g:2037:2: ( RULE_STRING )
            // InternalBromium.g:2038:3: RULE_STRING
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
    // InternalBromium.g:2047:1: rule__PageLoad__SubpathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PageLoad__SubpathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2051:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2052:2: ( RULE_STRING )
            {
            // InternalBromium.g:2052:2: ( RULE_STRING )
            // InternalBromium.g:2053:3: RULE_STRING
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
    // InternalBromium.g:2062:1: rule__TypeTextInElementFoundByCssSelector__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2066:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2067:2: ( RULE_STRING )
            {
            // InternalBromium.g:2067:2: ( RULE_STRING )
            // InternalBromium.g:2068:3: RULE_STRING
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
    // InternalBromium.g:2077:1: rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7 : ( RULE_STRING ) ;
    public final void rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2081:1: ( ( RULE_STRING ) )
            // InternalBromium.g:2082:2: ( RULE_STRING )
            {
            // InternalBromium.g:2082:2: ( RULE_STRING )
            // InternalBromium.g:2083:3: RULE_STRING
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


    // $ANTLR start "rule__ThreeDottedVersion__BigAssignment_0"
    // InternalBromium.g:2092:1: rule__ThreeDottedVersion__BigAssignment_0 : ( RULE_INT ) ;
    public final void rule__ThreeDottedVersion__BigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2096:1: ( ( RULE_INT ) )
            // InternalBromium.g:2097:2: ( RULE_INT )
            {
            // InternalBromium.g:2097:2: ( RULE_INT )
            // InternalBromium.g:2098:3: RULE_INT
            {
             before(grammarAccess.getThreeDottedVersionAccess().getBigINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThreeDottedVersionAccess().getBigINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__BigAssignment_0"


    // $ANTLR start "rule__ThreeDottedVersion__MediumAssignment_2"
    // InternalBromium.g:2107:1: rule__ThreeDottedVersion__MediumAssignment_2 : ( RULE_INT ) ;
    public final void rule__ThreeDottedVersion__MediumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2111:1: ( ( RULE_INT ) )
            // InternalBromium.g:2112:2: ( RULE_INT )
            {
            // InternalBromium.g:2112:2: ( RULE_INT )
            // InternalBromium.g:2113:3: RULE_INT
            {
             before(grammarAccess.getThreeDottedVersionAccess().getMediumINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThreeDottedVersionAccess().getMediumINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__MediumAssignment_2"


    // $ANTLR start "rule__ThreeDottedVersion__SmallAssignment_4"
    // InternalBromium.g:2122:1: rule__ThreeDottedVersion__SmallAssignment_4 : ( RULE_INT ) ;
    public final void rule__ThreeDottedVersion__SmallAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBromium.g:2126:1: ( ( RULE_INT ) )
            // InternalBromium.g:2127:2: ( RULE_INT )
            {
            // InternalBromium.g:2127:2: ( RULE_INT )
            // InternalBromium.g:2128:3: RULE_INT
            {
             before(grammarAccess.getThreeDottedVersionAccess().getSmallINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThreeDottedVersionAccess().getSmallINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThreeDottedVersion__SmallAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002A08040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});

}