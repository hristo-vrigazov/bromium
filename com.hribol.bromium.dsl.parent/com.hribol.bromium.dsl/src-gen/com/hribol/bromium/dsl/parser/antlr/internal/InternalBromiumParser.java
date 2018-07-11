package com.hribol.bromium.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.hribol.bromium.dsl.services.BromiumGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBromiumParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'from'", "'actions'", "'{'", "'}'", "'id'", "'syntax'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'not'", "'expect'", "'http'", "'request'", "'element'", "'with'", "'css'", "'selector'", "'is'", "'present'", "'click'", "'on'", "'load'", "'page'", "'type'", "'text'", "'in'", "'has'", "'class'", "'and'", "'set'", "'variable'", "'to'", "'the'", "'of'", "'dataId'", "'confirm'"
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

        public InternalBromiumParser(TokenStream input, BromiumGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BromiumGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBromium.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBromium.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBromium.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBromium.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_baseVersion_5_0 = null;

        EObject lv_actions_8_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:77:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}' ) )
            // InternalBromium.g:78:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}' )
            {
            // InternalBromium.g:78:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}' )
            // InternalBromium.g:79:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )? otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleApplicationAction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getNameKeyword_0());
            		
            // InternalBromium.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBromium.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBromium.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalBromium.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getVersionKeyword_2());
            		
            // InternalBromium.g:105:3: ( (lv_version_3_0= RULE_STRING ) )
            // InternalBromium.g:106:4: (lv_version_3_0= RULE_STRING )
            {
            // InternalBromium.g:106:4: (lv_version_3_0= RULE_STRING )
            // InternalBromium.g:107:5: lv_version_3_0= RULE_STRING
            {
            lv_version_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_version_3_0, grammarAccess.getModelAccess().getVersionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBromium.g:123:3: (otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBromium.g:124:4: otherlv_4= 'from' ( (lv_baseVersion_5_0= ruleVersion ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getFromKeyword_4_0());
                    			
                    // InternalBromium.g:128:4: ( (lv_baseVersion_5_0= ruleVersion ) )
                    // InternalBromium.g:129:5: (lv_baseVersion_5_0= ruleVersion )
                    {
                    // InternalBromium.g:129:5: (lv_baseVersion_5_0= ruleVersion )
                    // InternalBromium.g:130:6: lv_baseVersion_5_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getBaseVersionVersionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_baseVersion_5_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"baseVersion",
                    							lv_baseVersion_5_0,
                    							"com.hribol.bromium.dsl.Bromium.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getActionsKeyword_5());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBromium.g:156:3: ( (lv_actions_8_0= ruleApplicationAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBromium.g:157:4: (lv_actions_8_0= ruleApplicationAction )
            	    {
            	    // InternalBromium.g:157:4: (lv_actions_8_0= ruleApplicationAction )
            	    // InternalBromium.g:158:5: lv_actions_8_0= ruleApplicationAction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getActionsApplicationActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_actions_8_0=ruleApplicationAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_8_0,
            	    						"com.hribol.bromium.dsl.Bromium.ApplicationAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplicationAction"
    // InternalBromium.g:183:1: entryRuleApplicationAction returns [EObject current=null] : iv_ruleApplicationAction= ruleApplicationAction EOF ;
    public final EObject entryRuleApplicationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAction = null;


        try {
            // InternalBromium.g:183:58: (iv_ruleApplicationAction= ruleApplicationAction EOF )
            // InternalBromium.g:184:2: iv_ruleApplicationAction= ruleApplicationAction EOF
            {
             newCompositeNode(grammarAccess.getApplicationActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationAction=ruleApplicationAction();

            state._fsp--;

             current =iv_ruleApplicationAction; 
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
    // $ANTLR end "entryRuleApplicationAction"


    // $ANTLR start "ruleApplicationAction"
    // InternalBromium.g:190:1: ruleApplicationAction returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_expectHttpRequest_6_0= ruleExpectHttpRequest ) )? ( (lv_postcondition_7_0= rulePostcondition ) )? ) ;
    public final EObject ruleApplicationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_syntaxDefinitions_3_0 = null;

        EObject lv_precondition_4_0 = null;

        EObject lv_webDriverAction_5_0 = null;

        EObject lv_expectHttpRequest_6_0 = null;

        EObject lv_postcondition_7_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:196:2: ( (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_expectHttpRequest_6_0= ruleExpectHttpRequest ) )? ( (lv_postcondition_7_0= rulePostcondition ) )? ) )
            // InternalBromium.g:197:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_expectHttpRequest_6_0= ruleExpectHttpRequest ) )? ( (lv_postcondition_7_0= rulePostcondition ) )? )
            {
            // InternalBromium.g:197:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_expectHttpRequest_6_0= ruleExpectHttpRequest ) )? ( (lv_postcondition_7_0= rulePostcondition ) )? )
            // InternalBromium.g:198:3: otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_expectHttpRequest_6_0= ruleExpectHttpRequest ) )? ( (lv_postcondition_7_0= rulePostcondition ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationActionAccess().getIdKeyword_0());
            		
            // InternalBromium.g:202:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBromium.g:203:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBromium.g:203:4: (lv_name_1_0= RULE_ID )
            // InternalBromium.g:204:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getApplicationActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationActionAccess().getSyntaxKeyword_2());
            		
            // InternalBromium.g:224:3: ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBromium.g:225:4: (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition )
            	    {
            	    // InternalBromium.g:225:4: (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition )
            	    // InternalBromium.g:226:5: lv_syntaxDefinitions_3_0= ruleSyntaxDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsSyntaxDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_syntaxDefinitions_3_0=ruleSyntaxDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"syntaxDefinitions",
            	    						lv_syntaxDefinitions_3_0,
            	    						"com.hribol.bromium.dsl.Bromium.SyntaxDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalBromium.g:243:3: ( (lv_precondition_4_0= rulePrecondition ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBromium.g:244:4: (lv_precondition_4_0= rulePrecondition )
                    {
                    // InternalBromium.g:244:4: (lv_precondition_4_0= rulePrecondition )
                    // InternalBromium.g:245:5: lv_precondition_4_0= rulePrecondition
                    {

                    					newCompositeNode(grammarAccess.getApplicationActionAccess().getPreconditionPreconditionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_precondition_4_0=rulePrecondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationActionRule());
                    					}
                    					set(
                    						current,
                    						"precondition",
                    						lv_precondition_4_0,
                    						"com.hribol.bromium.dsl.Bromium.Precondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBromium.g:262:3: ( (lv_webDriverAction_5_0= ruleWebDriverAction ) )
            // InternalBromium.g:263:4: (lv_webDriverAction_5_0= ruleWebDriverAction )
            {
            // InternalBromium.g:263:4: (lv_webDriverAction_5_0= ruleWebDriverAction )
            // InternalBromium.g:264:5: lv_webDriverAction_5_0= ruleWebDriverAction
            {

            					newCompositeNode(grammarAccess.getApplicationActionAccess().getWebDriverActionWebDriverActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_webDriverAction_5_0=ruleWebDriverAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationActionRule());
            					}
            					set(
            						current,
            						"webDriverAction",
            						lv_webDriverAction_5_0,
            						"com.hribol.bromium.dsl.Bromium.WebDriverAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBromium.g:281:3: ( (lv_expectHttpRequest_6_0= ruleExpectHttpRequest ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBromium.g:282:4: (lv_expectHttpRequest_6_0= ruleExpectHttpRequest )
                    {
                    // InternalBromium.g:282:4: (lv_expectHttpRequest_6_0= ruleExpectHttpRequest )
                    // InternalBromium.g:283:5: lv_expectHttpRequest_6_0= ruleExpectHttpRequest
                    {

                    					newCompositeNode(grammarAccess.getApplicationActionAccess().getExpectHttpRequestExpectHttpRequestParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_expectHttpRequest_6_0=ruleExpectHttpRequest();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationActionRule());
                    					}
                    					set(
                    						current,
                    						"expectHttpRequest",
                    						lv_expectHttpRequest_6_0,
                    						"com.hribol.bromium.dsl.Bromium.ExpectHttpRequest");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBromium.g:300:3: ( (lv_postcondition_7_0= rulePostcondition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBromium.g:301:4: (lv_postcondition_7_0= rulePostcondition )
                    {
                    // InternalBromium.g:301:4: (lv_postcondition_7_0= rulePostcondition )
                    // InternalBromium.g:302:5: lv_postcondition_7_0= rulePostcondition
                    {

                    					newCompositeNode(grammarAccess.getApplicationActionAccess().getPostconditionPostconditionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_postcondition_7_0=rulePostcondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationActionRule());
                    					}
                    					set(
                    						current,
                    						"postcondition",
                    						lv_postcondition_7_0,
                    						"com.hribol.bromium.dsl.Bromium.Postcondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleApplicationAction"


    // $ANTLR start "entryRuleSyntaxDefinition"
    // InternalBromium.g:323:1: entryRuleSyntaxDefinition returns [EObject current=null] : iv_ruleSyntaxDefinition= ruleSyntaxDefinition EOF ;
    public final EObject entryRuleSyntaxDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntaxDefinition = null;


        try {
            // InternalBromium.g:323:57: (iv_ruleSyntaxDefinition= ruleSyntaxDefinition EOF )
            // InternalBromium.g:324:2: iv_ruleSyntaxDefinition= ruleSyntaxDefinition EOF
            {
             newCompositeNode(grammarAccess.getSyntaxDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSyntaxDefinition=ruleSyntaxDefinition();

            state._fsp--;

             current =iv_ruleSyntaxDefinition; 
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
    // $ANTLR end "entryRuleSyntaxDefinition"


    // $ANTLR start "ruleSyntaxDefinition"
    // InternalBromium.g:330:1: ruleSyntaxDefinition returns [EObject current=null] : ( () ( (lv_content_1_0= RULE_STRING ) ) ( (lv_parameter_2_0= ruleExposedParameter ) )? ) ;
    public final EObject ruleSyntaxDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_content_1_0=null;
        EObject lv_parameter_2_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:336:2: ( ( () ( (lv_content_1_0= RULE_STRING ) ) ( (lv_parameter_2_0= ruleExposedParameter ) )? ) )
            // InternalBromium.g:337:2: ( () ( (lv_content_1_0= RULE_STRING ) ) ( (lv_parameter_2_0= ruleExposedParameter ) )? )
            {
            // InternalBromium.g:337:2: ( () ( (lv_content_1_0= RULE_STRING ) ) ( (lv_parameter_2_0= ruleExposedParameter ) )? )
            // InternalBromium.g:338:3: () ( (lv_content_1_0= RULE_STRING ) ) ( (lv_parameter_2_0= ruleExposedParameter ) )?
            {
            // InternalBromium.g:338:3: ()
            // InternalBromium.g:339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSyntaxDefinitionAccess().getSyntaxDefinitionAction_0(),
            					current);
            			

            }

            // InternalBromium.g:345:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalBromium.g:346:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalBromium.g:346:4: (lv_content_1_0= RULE_STRING )
            // InternalBromium.g:347:5: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_content_1_0, grammarAccess.getSyntaxDefinitionAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSyntaxDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBromium.g:363:3: ( (lv_parameter_2_0= ruleExposedParameter ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBromium.g:364:4: (lv_parameter_2_0= ruleExposedParameter )
                    {
                    // InternalBromium.g:364:4: (lv_parameter_2_0= ruleExposedParameter )
                    // InternalBromium.g:365:5: lv_parameter_2_0= ruleExposedParameter
                    {

                    					newCompositeNode(grammarAccess.getSyntaxDefinitionAccess().getParameterExposedParameterParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameter_2_0=ruleExposedParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSyntaxDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"parameter",
                    						lv_parameter_2_0,
                    						"com.hribol.bromium.dsl.Bromium.ExposedParameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSyntaxDefinition"


    // $ANTLR start "entryRuleWebDriverActionCondition"
    // InternalBromium.g:386:1: entryRuleWebDriverActionCondition returns [EObject current=null] : iv_ruleWebDriverActionCondition= ruleWebDriverActionCondition EOF ;
    public final EObject entryRuleWebDriverActionCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebDriverActionCondition = null;


        try {
            // InternalBromium.g:386:65: (iv_ruleWebDriverActionCondition= ruleWebDriverActionCondition EOF )
            // InternalBromium.g:387:2: iv_ruleWebDriverActionCondition= ruleWebDriverActionCondition EOF
            {
             newCompositeNode(grammarAccess.getWebDriverActionConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebDriverActionCondition=ruleWebDriverActionCondition();

            state._fsp--;

             current =iv_ruleWebDriverActionCondition; 
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
    // $ANTLR end "entryRuleWebDriverActionCondition"


    // $ANTLR start "ruleWebDriverActionCondition"
    // InternalBromium.g:393:1: ruleWebDriverActionCondition returns [EObject current=null] : (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe | this_ConfirmAlert_2= ruleConfirmAlert ) ;
    public final EObject ruleWebDriverActionCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ElementByCssToBePresent_0 = null;

        EObject this_TextOfElementWithCssSelectorToBe_1 = null;

        EObject this_ConfirmAlert_2 = null;



        	enterRule();

        try {
            // InternalBromium.g:399:2: ( (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe | this_ConfirmAlert_2= ruleConfirmAlert ) )
            // InternalBromium.g:400:2: (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe | this_ConfirmAlert_2= ruleConfirmAlert )
            {
            // InternalBromium.g:400:2: (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe | this_ConfirmAlert_2= ruleConfirmAlert )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalBromium.g:401:3: this_ElementByCssToBePresent_0= ruleElementByCssToBePresent
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionConditionAccess().getElementByCssToBePresentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementByCssToBePresent_0=ruleElementByCssToBePresent();

                    state._fsp--;


                    			current = this_ElementByCssToBePresent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBromium.g:410:3: this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionConditionAccess().getTextOfElementWithCssSelectorToBeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextOfElementWithCssSelectorToBe_1=ruleTextOfElementWithCssSelectorToBe();

                    state._fsp--;


                    			current = this_TextOfElementWithCssSelectorToBe_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBromium.g:419:3: this_ConfirmAlert_2= ruleConfirmAlert
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionConditionAccess().getConfirmAlertParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConfirmAlert_2=ruleConfirmAlert();

                    state._fsp--;


                    			current = this_ConfirmAlert_2;
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
    // $ANTLR end "ruleWebDriverActionCondition"


    // $ANTLR start "entryRuleWebDriverAction"
    // InternalBromium.g:431:1: entryRuleWebDriverAction returns [EObject current=null] : iv_ruleWebDriverAction= ruleWebDriverAction EOF ;
    public final EObject entryRuleWebDriverAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebDriverAction = null;


        try {
            // InternalBromium.g:431:56: (iv_ruleWebDriverAction= ruleWebDriverAction EOF )
            // InternalBromium.g:432:2: iv_ruleWebDriverAction= ruleWebDriverAction EOF
            {
             newCompositeNode(grammarAccess.getWebDriverActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebDriverAction=ruleWebDriverAction();

            state._fsp--;

             current =iv_ruleWebDriverAction; 
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
    // $ANTLR end "entryRuleWebDriverAction"


    // $ANTLR start "ruleWebDriverAction"
    // InternalBromium.g:438:1: ruleWebDriverAction returns [EObject current=null] : (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector | this_ClickDataId_4= ruleClickDataId | this_SetVariableToTextOfElementWithCssSelector_5= ruleSetVariableToTextOfElementWithCssSelector ) ;
    public final EObject ruleWebDriverAction() throws RecognitionException {
        EObject current = null;

        EObject this_ClickCssSelector_0 = null;

        EObject this_ClickClassByText_1 = null;

        EObject this_PageLoad_2 = null;

        EObject this_TypeTextInElementFoundByCssSelector_3 = null;

        EObject this_ClickDataId_4 = null;

        EObject this_SetVariableToTextOfElementWithCssSelector_5 = null;



        	enterRule();

        try {
            // InternalBromium.g:444:2: ( (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector | this_ClickDataId_4= ruleClickDataId | this_SetVariableToTextOfElementWithCssSelector_5= ruleSetVariableToTextOfElementWithCssSelector ) )
            // InternalBromium.g:445:2: (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector | this_ClickDataId_4= ruleClickDataId | this_SetVariableToTextOfElementWithCssSelector_5= ruleSetVariableToTextOfElementWithCssSelector )
            {
            // InternalBromium.g:445:2: (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector | this_ClickDataId_4= ruleClickDataId | this_SetVariableToTextOfElementWithCssSelector_5= ruleSetVariableToTextOfElementWithCssSelector )
            int alt9=6;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalBromium.g:446:3: this_ClickCssSelector_0= ruleClickCssSelector
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getClickCssSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickCssSelector_0=ruleClickCssSelector();

                    state._fsp--;


                    			current = this_ClickCssSelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBromium.g:455:3: this_ClickClassByText_1= ruleClickClassByText
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getClickClassByTextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickClassByText_1=ruleClickClassByText();

                    state._fsp--;


                    			current = this_ClickClassByText_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBromium.g:464:3: this_PageLoad_2= rulePageLoad
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getPageLoadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageLoad_2=rulePageLoad();

                    state._fsp--;


                    			current = this_PageLoad_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBromium.g:473:3: this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeTextInElementFoundByCssSelector_3=ruleTypeTextInElementFoundByCssSelector();

                    state._fsp--;


                    			current = this_TypeTextInElementFoundByCssSelector_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBromium.g:482:3: this_ClickDataId_4= ruleClickDataId
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getClickDataIdParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickDataId_4=ruleClickDataId();

                    state._fsp--;


                    			current = this_ClickDataId_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBromium.g:491:3: this_SetVariableToTextOfElementWithCssSelector_5= ruleSetVariableToTextOfElementWithCssSelector
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getSetVariableToTextOfElementWithCssSelectorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetVariableToTextOfElementWithCssSelector_5=ruleSetVariableToTextOfElementWithCssSelector();

                    state._fsp--;


                    			current = this_SetVariableToTextOfElementWithCssSelector_5;
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
    // $ANTLR end "ruleWebDriverAction"


    // $ANTLR start "entryRulePrecondition"
    // InternalBromium.g:503:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalBromium.g:503:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalBromium.g:504:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition; 
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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalBromium.g:510:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:516:2: ( (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) ) ) )
            // InternalBromium.g:517:2: (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) ) )
            {
            // InternalBromium.g:517:2: (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) ) )
            // InternalBromium.g:518:3: otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getWhenKeyword_0());
            		
            // InternalBromium.g:522:3: ( (lv_action_1_0= ruleWebDriverActionCondition ) )
            // InternalBromium.g:523:4: (lv_action_1_0= ruleWebDriverActionCondition )
            {
            // InternalBromium.g:523:4: (lv_action_1_0= ruleWebDriverActionCondition )
            // InternalBromium.g:524:5: lv_action_1_0= ruleWebDriverActionCondition
            {

            					newCompositeNode(grammarAccess.getPreconditionAccess().getActionWebDriverActionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_1_0=ruleWebDriverActionCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_1_0,
            						"com.hribol.bromium.dsl.Bromium.WebDriverActionCondition");
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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalBromium.g:545:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalBromium.g:545:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalBromium.g:546:2: iv_rulePostcondition= rulePostcondition EOF
            {
             newCompositeNode(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;

             current =iv_rulePostcondition; 
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
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalBromium.g:552:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_action_3_0= ruleWebDriverActionCondition ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:558:2: ( (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_action_3_0= ruleWebDriverActionCondition ) ) ) )
            // InternalBromium.g:559:2: (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_action_3_0= ruleWebDriverActionCondition ) ) )
            {
            // InternalBromium.g:559:2: (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_action_3_0= ruleWebDriverActionCondition ) ) )
            // InternalBromium.g:560:3: otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_action_3_0= ruleWebDriverActionCondition ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getThenKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getMakeKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getSureKeyword_2());
            		
            // InternalBromium.g:572:3: ( (lv_action_3_0= ruleWebDriverActionCondition ) )
            // InternalBromium.g:573:4: (lv_action_3_0= ruleWebDriverActionCondition )
            {
            // InternalBromium.g:573:4: (lv_action_3_0= ruleWebDriverActionCondition )
            // InternalBromium.g:574:5: lv_action_3_0= ruleWebDriverActionCondition
            {

            					newCompositeNode(grammarAccess.getPostconditionAccess().getActionWebDriverActionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_3_0=ruleWebDriverActionCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostconditionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_3_0,
            						"com.hribol.bromium.dsl.Bromium.WebDriverActionCondition");
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
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleExpectHttpRequest"
    // InternalBromium.g:595:1: entryRuleExpectHttpRequest returns [EObject current=null] : iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF ;
    public final EObject entryRuleExpectHttpRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectHttpRequest = null;


        try {
            // InternalBromium.g:595:58: (iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF )
            // InternalBromium.g:596:2: iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF
            {
             newCompositeNode(grammarAccess.getExpectHttpRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpectHttpRequest=ruleExpectHttpRequest();

            state._fsp--;

             current =iv_ruleExpectHttpRequest; 
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
    // $ANTLR end "entryRuleExpectHttpRequest"


    // $ANTLR start "ruleExpectHttpRequest"
    // InternalBromium.g:602:1: ruleExpectHttpRequest returns [EObject current=null] : ( () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' ) ) ;
    public final EObject ruleExpectHttpRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBromium.g:608:2: ( ( () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' ) ) )
            // InternalBromium.g:609:2: ( () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' ) )
            {
            // InternalBromium.g:609:2: ( () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' ) )
            // InternalBromium.g:610:3: () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' )
            {
            // InternalBromium.g:610:3: ()
            // InternalBromium.g:611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpectHttpRequestAccess().getExpectHttpRequestAction_0(),
            					current);
            			

            }

            // InternalBromium.g:617:3: (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' )
            // InternalBromium.g:618:4: otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request'
            {
            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            				newLeafNode(otherlv_1, grammarAccess.getExpectHttpRequestAccess().getDoKeyword_1_0());
            			
            // InternalBromium.g:622:4: ( (lv_not_2_0= 'not' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBromium.g:623:5: (lv_not_2_0= 'not' )
                    {
                    // InternalBromium.g:623:5: (lv_not_2_0= 'not' )
                    // InternalBromium.g:624:6: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,24,FOLLOW_19); 

                    						newLeafNode(lv_not_2_0, grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpectHttpRequestRule());
                    						}
                    						setWithLastConsumed(current, "not", true, "not");
                    					

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_20); 

            				newLeafNode(otherlv_3, grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_1_2());
            			
            otherlv_4=(Token)match(input,26,FOLLOW_21); 

            				newLeafNode(otherlv_4, grammarAccess.getExpectHttpRequestAccess().getHttpKeyword_1_3());
            			
            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getExpectHttpRequestAccess().getRequestKeyword_1_4());
            			

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
    // $ANTLR end "ruleExpectHttpRequest"


    // $ANTLR start "entryRuleElementByCssToBePresent"
    // InternalBromium.g:653:1: entryRuleElementByCssToBePresent returns [EObject current=null] : iv_ruleElementByCssToBePresent= ruleElementByCssToBePresent EOF ;
    public final EObject entryRuleElementByCssToBePresent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementByCssToBePresent = null;


        try {
            // InternalBromium.g:653:64: (iv_ruleElementByCssToBePresent= ruleElementByCssToBePresent EOF )
            // InternalBromium.g:654:2: iv_ruleElementByCssToBePresent= ruleElementByCssToBePresent EOF
            {
             newCompositeNode(grammarAccess.getElementByCssToBePresentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementByCssToBePresent=ruleElementByCssToBePresent();

            state._fsp--;

             current =iv_ruleElementByCssToBePresent; 
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
    // $ANTLR end "entryRuleElementByCssToBePresent"


    // $ANTLR start "ruleElementByCssToBePresent"
    // InternalBromium.g:660:1: ruleElementByCssToBePresent returns [EObject current=null] : (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present' ) ;
    public final EObject ruleElementByCssToBePresent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_parameterNames_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameterValues_4_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:666:2: ( (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present' ) )
            // InternalBromium.g:667:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present' )
            {
            // InternalBromium.g:667:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present' )
            // InternalBromium.g:668:3: otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getElementByCssToBePresentAccess().getElementKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getElementByCssToBePresentAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getElementByCssToBePresentAccess().getCssKeyword_2());
            		
            // InternalBromium.g:680:3: ( (lv_parameterNames_3_0= 'selector' ) )
            // InternalBromium.g:681:4: (lv_parameterNames_3_0= 'selector' )
            {
            // InternalBromium.g:681:4: (lv_parameterNames_3_0= 'selector' )
            // InternalBromium.g:682:5: lv_parameterNames_3_0= 'selector'
            {
            lv_parameterNames_3_0=(Token)match(input,31,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_3_0, grammarAccess.getElementByCssToBePresentAccess().getParameterNamesSelectorKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementByCssToBePresentRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_3_0, "selector");
            				

            }


            }

            // InternalBromium.g:694:3: ( (lv_parameterValues_4_0= ruleParameterValue ) )
            // InternalBromium.g:695:4: (lv_parameterValues_4_0= ruleParameterValue )
            {
            // InternalBromium.g:695:4: (lv_parameterValues_4_0= ruleParameterValue )
            // InternalBromium.g:696:5: lv_parameterValues_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_parameterValues_4_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementByCssToBePresentRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_4_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getElementByCssToBePresentAccess().getIsKeyword_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getElementByCssToBePresentAccess().getPresentKeyword_6());
            		

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
    // $ANTLR end "ruleElementByCssToBePresent"


    // $ANTLR start "entryRuleClickCssSelector"
    // InternalBromium.g:725:1: entryRuleClickCssSelector returns [EObject current=null] : iv_ruleClickCssSelector= ruleClickCssSelector EOF ;
    public final EObject entryRuleClickCssSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickCssSelector = null;


        try {
            // InternalBromium.g:725:57: (iv_ruleClickCssSelector= ruleClickCssSelector EOF )
            // InternalBromium.g:726:2: iv_ruleClickCssSelector= ruleClickCssSelector EOF
            {
             newCompositeNode(grammarAccess.getClickCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickCssSelector=ruleClickCssSelector();

            state._fsp--;

             current =iv_ruleClickCssSelector; 
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
    // $ANTLR end "entryRuleClickCssSelector"


    // $ANTLR start "ruleClickCssSelector"
    // InternalBromium.g:732:1: ruleClickCssSelector returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' ( (lv_parameterNames_5_0= 'selector' ) ) ( (lv_parameterValues_6_0= ruleParameterValue ) ) ) ;
    public final EObject ruleClickCssSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_parameterNames_5_0=null;
        EObject lv_parameterValues_6_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:738:2: ( (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' ( (lv_parameterNames_5_0= 'selector' ) ) ( (lv_parameterValues_6_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:739:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' ( (lv_parameterNames_5_0= 'selector' ) ) ( (lv_parameterValues_6_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:739:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' ( (lv_parameterNames_5_0= 'selector' ) ) ( (lv_parameterValues_6_0= ruleParameterValue ) ) )
            // InternalBromium.g:740:3: otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' ( (lv_parameterNames_5_0= 'selector' ) ) ( (lv_parameterValues_6_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getClickCssSelectorAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getClickCssSelectorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getClickCssSelectorAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getClickCssSelectorAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getClickCssSelectorAccess().getCssKeyword_4());
            		
            // InternalBromium.g:760:3: ( (lv_parameterNames_5_0= 'selector' ) )
            // InternalBromium.g:761:4: (lv_parameterNames_5_0= 'selector' )
            {
            // InternalBromium.g:761:4: (lv_parameterNames_5_0= 'selector' )
            // InternalBromium.g:762:5: lv_parameterNames_5_0= 'selector'
            {
            lv_parameterNames_5_0=(Token)match(input,31,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_5_0, grammarAccess.getClickCssSelectorAccess().getParameterNamesSelectorKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickCssSelectorRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_5_0, "selector");
            				

            }


            }

            // InternalBromium.g:774:3: ( (lv_parameterValues_6_0= ruleParameterValue ) )
            // InternalBromium.g:775:4: (lv_parameterValues_6_0= ruleParameterValue )
            {
            // InternalBromium.g:775:4: (lv_parameterValues_6_0= ruleParameterValue )
            // InternalBromium.g:776:5: lv_parameterValues_6_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getClickCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterValues_6_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickCssSelectorRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_6_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
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
    // $ANTLR end "ruleClickCssSelector"


    // $ANTLR start "entryRulePageLoad"
    // InternalBromium.g:797:1: entryRulePageLoad returns [EObject current=null] : iv_rulePageLoad= rulePageLoad EOF ;
    public final EObject entryRulePageLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageLoad = null;


        try {
            // InternalBromium.g:797:49: (iv_rulePageLoad= rulePageLoad EOF )
            // InternalBromium.g:798:2: iv_rulePageLoad= rulePageLoad EOF
            {
             newCompositeNode(grammarAccess.getPageLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageLoad=rulePageLoad();

            state._fsp--;

             current =iv_rulePageLoad; 
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
    // $ANTLR end "entryRulePageLoad"


    // $ANTLR start "rulePageLoad"
    // InternalBromium.g:804:1: rulePageLoad returns [EObject current=null] : (otherlv_0= 'load' ( (lv_parameterNames_1_0= 'page' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) ) ;
    public final EObject rulePageLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameterNames_1_0=null;
        EObject lv_parameterValues_2_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:810:2: ( (otherlv_0= 'load' ( (lv_parameterNames_1_0= 'page' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:811:2: (otherlv_0= 'load' ( (lv_parameterNames_1_0= 'page' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:811:2: (otherlv_0= 'load' ( (lv_parameterNames_1_0= 'page' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) )
            // InternalBromium.g:812:3: otherlv_0= 'load' ( (lv_parameterNames_1_0= 'page' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getPageLoadAccess().getLoadKeyword_0());
            		
            // InternalBromium.g:816:3: ( (lv_parameterNames_1_0= 'page' ) )
            // InternalBromium.g:817:4: (lv_parameterNames_1_0= 'page' )
            {
            // InternalBromium.g:817:4: (lv_parameterNames_1_0= 'page' )
            // InternalBromium.g:818:5: lv_parameterNames_1_0= 'page'
            {
            lv_parameterNames_1_0=(Token)match(input,37,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_1_0, grammarAccess.getPageLoadAccess().getParameterNamesPageKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageLoadRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_1_0, "page");
            				

            }


            }

            // InternalBromium.g:830:3: ( (lv_parameterValues_2_0= ruleParameterValue ) )
            // InternalBromium.g:831:4: (lv_parameterValues_2_0= ruleParameterValue )
            {
            // InternalBromium.g:831:4: (lv_parameterValues_2_0= ruleParameterValue )
            // InternalBromium.g:832:5: lv_parameterValues_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getPageLoadAccess().getParameterValuesParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterValues_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageLoadRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_2_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
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
    // $ANTLR end "rulePageLoad"


    // $ANTLR start "entryRuleTypeTextInElementFoundByCssSelector"
    // InternalBromium.g:853:1: entryRuleTypeTextInElementFoundByCssSelector returns [EObject current=null] : iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF ;
    public final EObject entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTextInElementFoundByCssSelector = null;


        try {
            // InternalBromium.g:853:76: (iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:854:2: iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF
            {
             newCompositeNode(grammarAccess.getTypeTextInElementFoundByCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeTextInElementFoundByCssSelector=ruleTypeTextInElementFoundByCssSelector();

            state._fsp--;

             current =iv_ruleTypeTextInElementFoundByCssSelector; 
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
    // $ANTLR end "entryRuleTypeTextInElementFoundByCssSelector"


    // $ANTLR start "ruleTypeTextInElementFoundByCssSelector"
    // InternalBromium.g:860:1: ruleTypeTextInElementFoundByCssSelector returns [EObject current=null] : (otherlv_0= 'type' ( (lv_parameterNames_1_0= 'text' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'in' otherlv_4= 'element' otherlv_5= 'with' otherlv_6= 'css' ( (lv_parameterNames_7_0= 'selector' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) ) ) ;
    public final EObject ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameterNames_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_parameterNames_7_0=null;
        EObject lv_parameterValues_2_0 = null;

        EObject lv_parameterValues_8_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:866:2: ( (otherlv_0= 'type' ( (lv_parameterNames_1_0= 'text' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'in' otherlv_4= 'element' otherlv_5= 'with' otherlv_6= 'css' ( (lv_parameterNames_7_0= 'selector' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:867:2: (otherlv_0= 'type' ( (lv_parameterNames_1_0= 'text' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'in' otherlv_4= 'element' otherlv_5= 'with' otherlv_6= 'css' ( (lv_parameterNames_7_0= 'selector' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:867:2: (otherlv_0= 'type' ( (lv_parameterNames_1_0= 'text' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'in' otherlv_4= 'element' otherlv_5= 'with' otherlv_6= 'css' ( (lv_parameterNames_7_0= 'selector' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) ) )
            // InternalBromium.g:868:3: otherlv_0= 'type' ( (lv_parameterNames_1_0= 'text' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'in' otherlv_4= 'element' otherlv_5= 'with' otherlv_6= 'css' ( (lv_parameterNames_7_0= 'selector' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0());
            		
            // InternalBromium.g:872:3: ( (lv_parameterNames_1_0= 'text' ) )
            // InternalBromium.g:873:4: (lv_parameterNames_1_0= 'text' )
            {
            // InternalBromium.g:873:4: (lv_parameterNames_1_0= 'text' )
            // InternalBromium.g:874:5: lv_parameterNames_1_0= 'text'
            {
            lv_parameterNames_1_0=(Token)match(input,39,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_1_0, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesTextKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeTextInElementFoundByCssSelectorRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_1_0, "text");
            				

            }


            }

            // InternalBromium.g:886:3: ( (lv_parameterValues_2_0= ruleParameterValue ) )
            // InternalBromium.g:887:4: (lv_parameterValues_2_0= ruleParameterValue )
            {
            // InternalBromium.g:887:4: (lv_parameterValues_2_0= ruleParameterValue )
            // InternalBromium.g:888:5: lv_parameterValues_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_parameterValues_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeTextInElementFoundByCssSelectorRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_2_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_6());
            		
            // InternalBromium.g:921:3: ( (lv_parameterNames_7_0= 'selector' ) )
            // InternalBromium.g:922:4: (lv_parameterNames_7_0= 'selector' )
            {
            // InternalBromium.g:922:4: (lv_parameterNames_7_0= 'selector' )
            // InternalBromium.g:923:5: lv_parameterNames_7_0= 'selector'
            {
            lv_parameterNames_7_0=(Token)match(input,31,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_7_0, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesSelectorKeyword_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeTextInElementFoundByCssSelectorRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_7_0, "selector");
            				

            }


            }

            // InternalBromium.g:935:3: ( (lv_parameterValues_8_0= ruleParameterValue ) )
            // InternalBromium.g:936:4: (lv_parameterValues_8_0= ruleParameterValue )
            {
            // InternalBromium.g:936:4: (lv_parameterValues_8_0= ruleParameterValue )
            // InternalBromium.g:937:5: lv_parameterValues_8_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterValues_8_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeTextInElementFoundByCssSelectorRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_8_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
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
    // $ANTLR end "ruleTypeTextInElementFoundByCssSelector"


    // $ANTLR start "entryRuleTextOfElementWithCssSelectorToBe"
    // InternalBromium.g:958:1: entryRuleTextOfElementWithCssSelectorToBe returns [EObject current=null] : iv_ruleTextOfElementWithCssSelectorToBe= ruleTextOfElementWithCssSelectorToBe EOF ;
    public final EObject entryRuleTextOfElementWithCssSelectorToBe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOfElementWithCssSelectorToBe = null;


        try {
            // InternalBromium.g:958:73: (iv_ruleTextOfElementWithCssSelectorToBe= ruleTextOfElementWithCssSelectorToBe EOF )
            // InternalBromium.g:959:2: iv_ruleTextOfElementWithCssSelectorToBe= ruleTextOfElementWithCssSelectorToBe EOF
            {
             newCompositeNode(grammarAccess.getTextOfElementWithCssSelectorToBeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextOfElementWithCssSelectorToBe=ruleTextOfElementWithCssSelectorToBe();

            state._fsp--;

             current =iv_ruleTextOfElementWithCssSelectorToBe; 
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
    // $ANTLR end "entryRuleTextOfElementWithCssSelectorToBe"


    // $ANTLR start "ruleTextOfElementWithCssSelectorToBe"
    // InternalBromium.g:965:1: ruleTextOfElementWithCssSelectorToBe returns [EObject current=null] : (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'has' ( (lv_parameterNames_6_0= 'text' ) ) ( (lv_parameterValues_7_0= ruleParameterValue ) ) ) ;
    public final EObject ruleTextOfElementWithCssSelectorToBe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_parameterNames_3_0=null;
        Token otherlv_5=null;
        Token lv_parameterNames_6_0=null;
        EObject lv_parameterValues_4_0 = null;

        EObject lv_parameterValues_7_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:971:2: ( (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'has' ( (lv_parameterNames_6_0= 'text' ) ) ( (lv_parameterValues_7_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:972:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'has' ( (lv_parameterNames_6_0= 'text' ) ) ( (lv_parameterValues_7_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:972:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'has' ( (lv_parameterNames_6_0= 'text' ) ) ( (lv_parameterValues_7_0= ruleParameterValue ) ) )
            // InternalBromium.g:973:3: otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' ( (lv_parameterNames_3_0= 'selector' ) ) ( (lv_parameterValues_4_0= ruleParameterValue ) ) otherlv_5= 'has' ( (lv_parameterNames_6_0= 'text' ) ) ( (lv_parameterValues_7_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getElementKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getCssKeyword_2());
            		
            // InternalBromium.g:985:3: ( (lv_parameterNames_3_0= 'selector' ) )
            // InternalBromium.g:986:4: (lv_parameterNames_3_0= 'selector' )
            {
            // InternalBromium.g:986:4: (lv_parameterNames_3_0= 'selector' )
            // InternalBromium.g:987:5: lv_parameterNames_3_0= 'selector'
            {
            lv_parameterNames_3_0=(Token)match(input,31,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_3_0, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesSelectorKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextOfElementWithCssSelectorToBeRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_3_0, "selector");
            				

            }


            }

            // InternalBromium.g:999:3: ( (lv_parameterValues_4_0= ruleParameterValue ) )
            // InternalBromium.g:1000:4: (lv_parameterValues_4_0= ruleParameterValue )
            {
            // InternalBromium.g:1000:4: (lv_parameterValues_4_0= ruleParameterValue )
            // InternalBromium.g:1001:5: lv_parameterValues_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
            lv_parameterValues_4_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextOfElementWithCssSelectorToBeRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_4_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getHasKeyword_5());
            		
            // InternalBromium.g:1022:3: ( (lv_parameterNames_6_0= 'text' ) )
            // InternalBromium.g:1023:4: (lv_parameterNames_6_0= 'text' )
            {
            // InternalBromium.g:1023:4: (lv_parameterNames_6_0= 'text' )
            // InternalBromium.g:1024:5: lv_parameterNames_6_0= 'text'
            {
            lv_parameterNames_6_0=(Token)match(input,39,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_6_0, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesTextKeyword_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextOfElementWithCssSelectorToBeRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_6_0, "text");
            				

            }


            }

            // InternalBromium.g:1036:3: ( (lv_parameterValues_7_0= ruleParameterValue ) )
            // InternalBromium.g:1037:4: (lv_parameterValues_7_0= ruleParameterValue )
            {
            // InternalBromium.g:1037:4: (lv_parameterValues_7_0= ruleParameterValue )
            // InternalBromium.g:1038:5: lv_parameterValues_7_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesParameterValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterValues_7_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextOfElementWithCssSelectorToBeRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_7_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
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
    // $ANTLR end "ruleTextOfElementWithCssSelectorToBe"


    // $ANTLR start "entryRuleClickClassByText"
    // InternalBromium.g:1059:1: entryRuleClickClassByText returns [EObject current=null] : iv_ruleClickClassByText= ruleClickClassByText EOF ;
    public final EObject entryRuleClickClassByText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickClassByText = null;


        try {
            // InternalBromium.g:1059:57: (iv_ruleClickClassByText= ruleClickClassByText EOF )
            // InternalBromium.g:1060:2: iv_ruleClickClassByText= ruleClickClassByText EOF
            {
             newCompositeNode(grammarAccess.getClickClassByTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickClassByText=ruleClickClassByText();

            state._fsp--;

             current =iv_ruleClickClassByText; 
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
    // $ANTLR end "entryRuleClickClassByText"


    // $ANTLR start "ruleClickClassByText"
    // InternalBromium.g:1066:1: ruleClickClassByText returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'class' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) otherlv_6= 'and' ( (lv_parameterNames_7_0= 'text' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) ) ) ;
    public final EObject ruleClickClassByText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_parameterNames_4_0=null;
        Token otherlv_6=null;
        Token lv_parameterNames_7_0=null;
        EObject lv_parameterValues_5_0 = null;

        EObject lv_parameterValues_8_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:1072:2: ( (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'class' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) otherlv_6= 'and' ( (lv_parameterNames_7_0= 'text' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:1073:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'class' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) otherlv_6= 'and' ( (lv_parameterNames_7_0= 'text' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:1073:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'class' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) otherlv_6= 'and' ( (lv_parameterNames_7_0= 'text' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) ) )
            // InternalBromium.g:1074:3: otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'class' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) otherlv_6= 'and' ( (lv_parameterNames_7_0= 'text' ) ) ( (lv_parameterValues_8_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getClickClassByTextAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getClickClassByTextAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getClickClassByTextAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getClickClassByTextAccess().getWithKeyword_3());
            		
            // InternalBromium.g:1090:3: ( (lv_parameterNames_4_0= 'class' ) )
            // InternalBromium.g:1091:4: (lv_parameterNames_4_0= 'class' )
            {
            // InternalBromium.g:1091:4: (lv_parameterNames_4_0= 'class' )
            // InternalBromium.g:1092:5: lv_parameterNames_4_0= 'class'
            {
            lv_parameterNames_4_0=(Token)match(input,42,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_4_0, grammarAccess.getClickClassByTextAccess().getParameterNamesClassKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickClassByTextRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_4_0, "class");
            				

            }


            }

            // InternalBromium.g:1104:3: ( (lv_parameterValues_5_0= ruleParameterValue ) )
            // InternalBromium.g:1105:4: (lv_parameterValues_5_0= ruleParameterValue )
            {
            // InternalBromium.g:1105:4: (lv_parameterValues_5_0= ruleParameterValue )
            // InternalBromium.g:1106:5: lv_parameterValues_5_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getClickClassByTextAccess().getParameterValuesParameterValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_35);
            lv_parameterValues_5_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickClassByTextRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_5_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_31); 

            			newLeafNode(otherlv_6, grammarAccess.getClickClassByTextAccess().getAndKeyword_6());
            		
            // InternalBromium.g:1127:3: ( (lv_parameterNames_7_0= 'text' ) )
            // InternalBromium.g:1128:4: (lv_parameterNames_7_0= 'text' )
            {
            // InternalBromium.g:1128:4: (lv_parameterNames_7_0= 'text' )
            // InternalBromium.g:1129:5: lv_parameterNames_7_0= 'text'
            {
            lv_parameterNames_7_0=(Token)match(input,39,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_7_0, grammarAccess.getClickClassByTextAccess().getParameterNamesTextKeyword_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickClassByTextRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_7_0, "text");
            				

            }


            }

            // InternalBromium.g:1141:3: ( (lv_parameterValues_8_0= ruleParameterValue ) )
            // InternalBromium.g:1142:4: (lv_parameterValues_8_0= ruleParameterValue )
            {
            // InternalBromium.g:1142:4: (lv_parameterValues_8_0= ruleParameterValue )
            // InternalBromium.g:1143:5: lv_parameterValues_8_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getClickClassByTextAccess().getParameterValuesParameterValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterValues_8_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickClassByTextRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_8_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
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
    // $ANTLR end "ruleClickClassByText"


    // $ANTLR start "entryRuleSetVariableToTextOfElementWithCssSelector"
    // InternalBromium.g:1164:1: entryRuleSetVariableToTextOfElementWithCssSelector returns [EObject current=null] : iv_ruleSetVariableToTextOfElementWithCssSelector= ruleSetVariableToTextOfElementWithCssSelector EOF ;
    public final EObject entryRuleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetVariableToTextOfElementWithCssSelector = null;


        try {
            // InternalBromium.g:1164:82: (iv_ruleSetVariableToTextOfElementWithCssSelector= ruleSetVariableToTextOfElementWithCssSelector EOF )
            // InternalBromium.g:1165:2: iv_ruleSetVariableToTextOfElementWithCssSelector= ruleSetVariableToTextOfElementWithCssSelector EOF
            {
             newCompositeNode(grammarAccess.getSetVariableToTextOfElementWithCssSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetVariableToTextOfElementWithCssSelector=ruleSetVariableToTextOfElementWithCssSelector();

            state._fsp--;

             current =iv_ruleSetVariableToTextOfElementWithCssSelector; 
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
    // $ANTLR end "entryRuleSetVariableToTextOfElementWithCssSelector"


    // $ANTLR start "ruleSetVariableToTextOfElementWithCssSelector"
    // InternalBromium.g:1171:1: ruleSetVariableToTextOfElementWithCssSelector returns [EObject current=null] : (otherlv_0= 'set' ( (lv_parameterNames_1_0= 'variable' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'to' otherlv_4= 'the' otherlv_5= 'text' otherlv_6= 'of' otherlv_7= 'element' otherlv_8= 'with' otherlv_9= 'css' ( (lv_parameterNames_10_0= 'selector' ) ) ( (lv_parameterValues_11_0= ruleParameterValue ) ) ) ;
    public final EObject ruleSetVariableToTextOfElementWithCssSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameterNames_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_parameterNames_10_0=null;
        EObject lv_parameterValues_2_0 = null;

        EObject lv_parameterValues_11_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:1177:2: ( (otherlv_0= 'set' ( (lv_parameterNames_1_0= 'variable' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'to' otherlv_4= 'the' otherlv_5= 'text' otherlv_6= 'of' otherlv_7= 'element' otherlv_8= 'with' otherlv_9= 'css' ( (lv_parameterNames_10_0= 'selector' ) ) ( (lv_parameterValues_11_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:1178:2: (otherlv_0= 'set' ( (lv_parameterNames_1_0= 'variable' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'to' otherlv_4= 'the' otherlv_5= 'text' otherlv_6= 'of' otherlv_7= 'element' otherlv_8= 'with' otherlv_9= 'css' ( (lv_parameterNames_10_0= 'selector' ) ) ( (lv_parameterValues_11_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:1178:2: (otherlv_0= 'set' ( (lv_parameterNames_1_0= 'variable' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'to' otherlv_4= 'the' otherlv_5= 'text' otherlv_6= 'of' otherlv_7= 'element' otherlv_8= 'with' otherlv_9= 'css' ( (lv_parameterNames_10_0= 'selector' ) ) ( (lv_parameterValues_11_0= ruleParameterValue ) ) )
            // InternalBromium.g:1179:3: otherlv_0= 'set' ( (lv_parameterNames_1_0= 'variable' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) otherlv_3= 'to' otherlv_4= 'the' otherlv_5= 'text' otherlv_6= 'of' otherlv_7= 'element' otherlv_8= 'with' otherlv_9= 'css' ( (lv_parameterNames_10_0= 'selector' ) ) ( (lv_parameterValues_11_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getSetKeyword_0());
            		
            // InternalBromium.g:1183:3: ( (lv_parameterNames_1_0= 'variable' ) )
            // InternalBromium.g:1184:4: (lv_parameterNames_1_0= 'variable' )
            {
            // InternalBromium.g:1184:4: (lv_parameterNames_1_0= 'variable' )
            // InternalBromium.g:1185:5: lv_parameterNames_1_0= 'variable'
            {
            lv_parameterNames_1_0=(Token)match(input,45,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_1_0, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesVariableKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVariableToTextOfElementWithCssSelectorRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_1_0, "variable");
            				

            }


            }

            // InternalBromium.g:1197:3: ( (lv_parameterValues_2_0= ruleParameterValue ) )
            // InternalBromium.g:1198:4: (lv_parameterValues_2_0= ruleParameterValue )
            {
            // InternalBromium.g:1198:4: (lv_parameterValues_2_0= ruleParameterValue )
            // InternalBromium.g:1199:5: lv_parameterValues_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
            lv_parameterValues_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetVariableToTextOfElementWithCssSelectorRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_2_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getToKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTheKeyword_4());
            		
            otherlv_5=(Token)match(input,39,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getTextKeyword_5());
            		
            otherlv_6=(Token)match(input,48,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getOfKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getElementKeyword_7());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getWithKeyword_8());
            		
            otherlv_9=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getCssKeyword_9());
            		
            // InternalBromium.g:1244:3: ( (lv_parameterNames_10_0= 'selector' ) )
            // InternalBromium.g:1245:4: (lv_parameterNames_10_0= 'selector' )
            {
            // InternalBromium.g:1245:4: (lv_parameterNames_10_0= 'selector' )
            // InternalBromium.g:1246:5: lv_parameterNames_10_0= 'selector'
            {
            lv_parameterNames_10_0=(Token)match(input,31,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_10_0, grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesSelectorKeyword_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVariableToTextOfElementWithCssSelectorRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_10_0, "selector");
            				

            }


            }

            // InternalBromium.g:1258:3: ( (lv_parameterValues_11_0= ruleParameterValue ) )
            // InternalBromium.g:1259:4: (lv_parameterValues_11_0= ruleParameterValue )
            {
            // InternalBromium.g:1259:4: (lv_parameterValues_11_0= ruleParameterValue )
            // InternalBromium.g:1260:5: lv_parameterValues_11_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesParameterValueParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterValues_11_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetVariableToTextOfElementWithCssSelectorRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_11_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
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
    // $ANTLR end "ruleSetVariableToTextOfElementWithCssSelector"


    // $ANTLR start "entryRuleClickDataId"
    // InternalBromium.g:1281:1: entryRuleClickDataId returns [EObject current=null] : iv_ruleClickDataId= ruleClickDataId EOF ;
    public final EObject entryRuleClickDataId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickDataId = null;


        try {
            // InternalBromium.g:1281:52: (iv_ruleClickDataId= ruleClickDataId EOF )
            // InternalBromium.g:1282:2: iv_ruleClickDataId= ruleClickDataId EOF
            {
             newCompositeNode(grammarAccess.getClickDataIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickDataId=ruleClickDataId();

            state._fsp--;

             current =iv_ruleClickDataId; 
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
    // $ANTLR end "entryRuleClickDataId"


    // $ANTLR start "ruleClickDataId"
    // InternalBromium.g:1288:1: ruleClickDataId returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'dataId' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) ) ;
    public final EObject ruleClickDataId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_parameterNames_4_0=null;
        EObject lv_parameterValues_5_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:1294:2: ( (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'dataId' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:1295:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'dataId' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:1295:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'dataId' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) ) )
            // InternalBromium.g:1296:3: otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' ( (lv_parameterNames_4_0= 'dataId' ) ) ( (lv_parameterValues_5_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getClickDataIdAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getClickDataIdAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getClickDataIdAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getClickDataIdAccess().getWithKeyword_3());
            		
            // InternalBromium.g:1312:3: ( (lv_parameterNames_4_0= 'dataId' ) )
            // InternalBromium.g:1313:4: (lv_parameterNames_4_0= 'dataId' )
            {
            // InternalBromium.g:1313:4: (lv_parameterNames_4_0= 'dataId' )
            // InternalBromium.g:1314:5: lv_parameterNames_4_0= 'dataId'
            {
            lv_parameterNames_4_0=(Token)match(input,49,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_4_0, grammarAccess.getClickDataIdAccess().getParameterNamesDataIdKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickDataIdRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_4_0, "dataId");
            				

            }


            }

            // InternalBromium.g:1326:3: ( (lv_parameterValues_5_0= ruleParameterValue ) )
            // InternalBromium.g:1327:4: (lv_parameterValues_5_0= ruleParameterValue )
            {
            // InternalBromium.g:1327:4: (lv_parameterValues_5_0= ruleParameterValue )
            // InternalBromium.g:1328:5: lv_parameterValues_5_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getClickDataIdAccess().getParameterValuesParameterValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterValues_5_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickDataIdRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_5_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
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
    // $ANTLR end "ruleClickDataId"


    // $ANTLR start "entryRuleConfirmAlert"
    // InternalBromium.g:1349:1: entryRuleConfirmAlert returns [EObject current=null] : iv_ruleConfirmAlert= ruleConfirmAlert EOF ;
    public final EObject entryRuleConfirmAlert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfirmAlert = null;


        try {
            // InternalBromium.g:1349:53: (iv_ruleConfirmAlert= ruleConfirmAlert EOF )
            // InternalBromium.g:1350:2: iv_ruleConfirmAlert= ruleConfirmAlert EOF
            {
             newCompositeNode(grammarAccess.getConfirmAlertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfirmAlert=ruleConfirmAlert();

            state._fsp--;

             current =iv_ruleConfirmAlert; 
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
    // $ANTLR end "entryRuleConfirmAlert"


    // $ANTLR start "ruleConfirmAlert"
    // InternalBromium.g:1356:1: ruleConfirmAlert returns [EObject current=null] : (otherlv_0= 'to' ( (lv_parameterNames_1_0= 'confirm' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) ) ;
    public final EObject ruleConfirmAlert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameterNames_1_0=null;
        EObject lv_parameterValues_2_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:1362:2: ( (otherlv_0= 'to' ( (lv_parameterNames_1_0= 'confirm' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:1363:2: (otherlv_0= 'to' ( (lv_parameterNames_1_0= 'confirm' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:1363:2: (otherlv_0= 'to' ( (lv_parameterNames_1_0= 'confirm' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) ) )
            // InternalBromium.g:1364:3: otherlv_0= 'to' ( (lv_parameterNames_1_0= 'confirm' ) ) ( (lv_parameterValues_2_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getConfirmAlertAccess().getToKeyword_0());
            		
            // InternalBromium.g:1368:3: ( (lv_parameterNames_1_0= 'confirm' ) )
            // InternalBromium.g:1369:4: (lv_parameterNames_1_0= 'confirm' )
            {
            // InternalBromium.g:1369:4: (lv_parameterNames_1_0= 'confirm' )
            // InternalBromium.g:1370:5: lv_parameterNames_1_0= 'confirm'
            {
            lv_parameterNames_1_0=(Token)match(input,50,FOLLOW_25); 

            					newLeafNode(lv_parameterNames_1_0, grammarAccess.getConfirmAlertAccess().getParameterNamesConfirmKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfirmAlertRule());
            					}
            					addWithLastConsumed(current, "parameterNames", lv_parameterNames_1_0, "confirm");
            				

            }


            }

            // InternalBromium.g:1382:3: ( (lv_parameterValues_2_0= ruleParameterValue ) )
            // InternalBromium.g:1383:4: (lv_parameterValues_2_0= ruleParameterValue )
            {
            // InternalBromium.g:1383:4: (lv_parameterValues_2_0= ruleParameterValue )
            // InternalBromium.g:1384:5: lv_parameterValues_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getConfirmAlertAccess().getParameterValuesParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterValues_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfirmAlertRule());
            					}
            					add(
            						current,
            						"parameterValues",
            						lv_parameterValues_2_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
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
    // $ANTLR end "ruleConfirmAlert"


    // $ANTLR start "entryRuleParameterValue"
    // InternalBromium.g:1405:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalBromium.g:1405:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalBromium.g:1406:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalBromium.g:1412:1: ruleParameterValue returns [EObject current=null] : ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBromium.g:1418:2: ( ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBromium.g:1419:2: ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBromium.g:1419:2: ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBromium.g:1420:3: ( (lv_content_0_0= RULE_STRING ) )
                    {
                    // InternalBromium.g:1420:3: ( (lv_content_0_0= RULE_STRING ) )
                    // InternalBromium.g:1421:4: (lv_content_0_0= RULE_STRING )
                    {
                    // InternalBromium.g:1421:4: (lv_content_0_0= RULE_STRING )
                    // InternalBromium.g:1422:5: lv_content_0_0= RULE_STRING
                    {
                    lv_content_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_content_0_0, grammarAccess.getParameterValueAccess().getContentSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"content",
                    						lv_content_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBromium.g:1439:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalBromium.g:1439:3: ( (otherlv_1= RULE_ID ) )
                    // InternalBromium.g:1440:4: (otherlv_1= RULE_ID )
                    {
                    // InternalBromium.g:1440:4: (otherlv_1= RULE_ID )
                    // InternalBromium.g:1441:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterValueRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getParameterValueAccess().getExposedParameterExposedParameterCrossReference_1_0());
                    				

                    }


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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleExposedParameter"
    // InternalBromium.g:1456:1: entryRuleExposedParameter returns [EObject current=null] : iv_ruleExposedParameter= ruleExposedParameter EOF ;
    public final EObject entryRuleExposedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExposedParameter = null;


        try {
            // InternalBromium.g:1456:57: (iv_ruleExposedParameter= ruleExposedParameter EOF )
            // InternalBromium.g:1457:2: iv_ruleExposedParameter= ruleExposedParameter EOF
            {
             newCompositeNode(grammarAccess.getExposedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExposedParameter=ruleExposedParameter();

            state._fsp--;

             current =iv_ruleExposedParameter; 
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
    // $ANTLR end "entryRuleExposedParameter"


    // $ANTLR start "ruleExposedParameter"
    // InternalBromium.g:1463:1: ruleExposedParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExposedParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBromium.g:1469:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBromium.g:1470:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBromium.g:1470:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBromium.g:1471:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBromium.g:1471:3: (lv_name_0_0= RULE_ID )
            // InternalBromium.g:1472:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExposedParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExposedParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleExposedParameter"


    // $ANTLR start "entryRuleVersion"
    // InternalBromium.g:1491:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalBromium.g:1491:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalBromium.g:1492:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalBromium.g:1498:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalBromium.g:1504:2: (this_STRING_0= RULE_STRING )
            // InternalBromium.g:1505:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getVersionAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleVersion"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\34\1\35\1\uffff\1\36\1\37\1\4\2\40\2\uffff";
    static final String dfa_3s = "\1\56\1\35\1\uffff\1\36\1\37\1\5\2\51\2\uffff";
    static final String dfa_4s = "\2\uffff\1\3\5\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\21\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\11\10\uffff\1\10",
            "\1\11\10\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "400:2: (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe | this_ConfirmAlert_2= ruleConfirmAlert )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\42\1\43\3\uffff\1\34\1\35\1\36\3\uffff";
    static final String dfa_9s = "\1\54\1\43\3\uffff\1\34\1\35\1\61\3\uffff";
    static final String dfa_10s = "\2\uffff\1\3\1\4\1\6\3\uffff\1\2\1\5\1\1";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\5\uffff\1\4",
            "\1\5",
            "",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\12\13\uffff\1\10\6\uffff\1\11",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "445:2: (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector | this_ClickDataId_4= ruleClickDataId | this_SetVariableToTextOfElementWithCssSelector_5= ruleSetVariableToTextOfElementWithCssSelector )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000105400080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});

}