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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'from'", "'actions'", "'{'", "'}'", "'id'", "'syntax'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'not'", "'expect'", "'http'", "'request'", "'element'", "'with'", "'css'", "'selector'", "'is'", "'present'", "'click'", "'on'", "'load'", "'page'", "'type'", "'in'", "'text'", "'of'", "'class'", "'and'"
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
    // InternalBromium.g:190:1: ruleApplicationAction returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_postcondition_6_0= rulePostcondition ) )? ( (lv_expectHttpRequest_7_0= ruleExpectHttpRequest ) ) ) ;
    public final EObject ruleApplicationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_syntaxDefinitions_3_0 = null;

        EObject lv_precondition_4_0 = null;

        EObject lv_webDriverAction_5_0 = null;

        EObject lv_postcondition_6_0 = null;

        EObject lv_expectHttpRequest_7_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:196:2: ( (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_postcondition_6_0= rulePostcondition ) )? ( (lv_expectHttpRequest_7_0= ruleExpectHttpRequest ) ) ) )
            // InternalBromium.g:197:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_postcondition_6_0= rulePostcondition ) )? ( (lv_expectHttpRequest_7_0= ruleExpectHttpRequest ) ) )
            {
            // InternalBromium.g:197:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_postcondition_6_0= rulePostcondition ) )? ( (lv_expectHttpRequest_7_0= ruleExpectHttpRequest ) ) )
            // InternalBromium.g:198:3: otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'syntax' ( (lv_syntaxDefinitions_3_0= ruleSyntaxDefinition ) )* ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_webDriverAction_5_0= ruleWebDriverAction ) ) ( (lv_postcondition_6_0= rulePostcondition ) )? ( (lv_expectHttpRequest_7_0= ruleExpectHttpRequest ) )
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

            // InternalBromium.g:281:3: ( (lv_postcondition_6_0= rulePostcondition ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBromium.g:282:4: (lv_postcondition_6_0= rulePostcondition )
                    {
                    // InternalBromium.g:282:4: (lv_postcondition_6_0= rulePostcondition )
                    // InternalBromium.g:283:5: lv_postcondition_6_0= rulePostcondition
                    {

                    					newCompositeNode(grammarAccess.getApplicationActionAccess().getPostconditionPostconditionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_postcondition_6_0=rulePostcondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationActionRule());
                    					}
                    					set(
                    						current,
                    						"postcondition",
                    						lv_postcondition_6_0,
                    						"com.hribol.bromium.dsl.Bromium.Postcondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBromium.g:300:3: ( (lv_expectHttpRequest_7_0= ruleExpectHttpRequest ) )
            // InternalBromium.g:301:4: (lv_expectHttpRequest_7_0= ruleExpectHttpRequest )
            {
            // InternalBromium.g:301:4: (lv_expectHttpRequest_7_0= ruleExpectHttpRequest )
            // InternalBromium.g:302:5: lv_expectHttpRequest_7_0= ruleExpectHttpRequest
            {

            					newCompositeNode(grammarAccess.getApplicationActionAccess().getExpectHttpRequestExpectHttpRequestParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_expectHttpRequest_7_0=ruleExpectHttpRequest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationActionRule());
            					}
            					set(
            						current,
            						"expectHttpRequest",
            						lv_expectHttpRequest_7_0,
            						"com.hribol.bromium.dsl.Bromium.ExpectHttpRequest");
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
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
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
    // InternalBromium.g:393:1: ruleWebDriverActionCondition returns [EObject current=null] : (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe ) ;
    public final EObject ruleWebDriverActionCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ElementByCssToBePresent_0 = null;

        EObject this_TextOfElementWithCssSelectorToBe_1 = null;



        	enterRule();

        try {
            // InternalBromium.g:399:2: ( (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe ) )
            // InternalBromium.g:400:2: (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe )
            {
            // InternalBromium.g:400:2: (this_ElementByCssToBePresent_0= ruleElementByCssToBePresent | this_TextOfElementWithCssSelectorToBe_1= ruleTextOfElementWithCssSelectorToBe )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==40) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
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
    // InternalBromium.g:422:1: entryRuleWebDriverAction returns [EObject current=null] : iv_ruleWebDriverAction= ruleWebDriverAction EOF ;
    public final EObject entryRuleWebDriverAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebDriverAction = null;


        try {
            // InternalBromium.g:422:56: (iv_ruleWebDriverAction= ruleWebDriverAction EOF )
            // InternalBromium.g:423:2: iv_ruleWebDriverAction= ruleWebDriverAction EOF
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
    // InternalBromium.g:429:1: ruleWebDriverAction returns [EObject current=null] : (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector ) ;
    public final EObject ruleWebDriverAction() throws RecognitionException {
        EObject current = null;

        EObject this_ClickCssSelector_0 = null;

        EObject this_ClickClassByText_1 = null;

        EObject this_PageLoad_2 = null;

        EObject this_TypeTextInElementFoundByCssSelector_3 = null;



        	enterRule();

        try {
            // InternalBromium.g:435:2: ( (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector ) )
            // InternalBromium.g:436:2: (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector )
            {
            // InternalBromium.g:436:2: (this_ClickCssSelector_0= ruleClickCssSelector | this_ClickClassByText_1= ruleClickClassByText | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==35) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==28) ) {
                        int LA8_5 = input.LA(4);

                        if ( (LA8_5==29) ) {
                            int LA8_6 = input.LA(5);

                            if ( (LA8_6==30) ) {
                                alt8=1;
                            }
                            else if ( (LA8_6==42) ) {
                                alt8=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 38:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBromium.g:437:3: this_ClickCssSelector_0= ruleClickCssSelector
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
                    // InternalBromium.g:446:3: this_ClickClassByText_1= ruleClickClassByText
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
                    // InternalBromium.g:455:3: this_PageLoad_2= rulePageLoad
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
                    // InternalBromium.g:464:3: this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getTypeTextInElementFoundByCssSelectorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeTextInElementFoundByCssSelector_3=ruleTypeTextInElementFoundByCssSelector();

                    state._fsp--;


                    			current = this_TypeTextInElementFoundByCssSelector_3;
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
    // InternalBromium.g:476:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalBromium.g:476:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalBromium.g:477:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalBromium.g:483:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:489:2: ( (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) ) ) )
            // InternalBromium.g:490:2: (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) ) )
            {
            // InternalBromium.g:490:2: (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) ) )
            // InternalBromium.g:491:3: otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverActionCondition ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getWhenKeyword_0());
            		
            // InternalBromium.g:495:3: ( (lv_action_1_0= ruleWebDriverActionCondition ) )
            // InternalBromium.g:496:4: (lv_action_1_0= ruleWebDriverActionCondition )
            {
            // InternalBromium.g:496:4: (lv_action_1_0= ruleWebDriverActionCondition )
            // InternalBromium.g:497:5: lv_action_1_0= ruleWebDriverActionCondition
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
    // InternalBromium.g:518:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalBromium.g:518:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalBromium.g:519:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalBromium.g:525:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverActionCondition ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_postcondition_3_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:531:2: ( (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverActionCondition ) ) ) )
            // InternalBromium.g:532:2: (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverActionCondition ) ) )
            {
            // InternalBromium.g:532:2: (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverActionCondition ) ) )
            // InternalBromium.g:533:3: otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverActionCondition ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getThenKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getMakeKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getSureKeyword_2());
            		
            // InternalBromium.g:545:3: ( (lv_postcondition_3_0= ruleWebDriverActionCondition ) )
            // InternalBromium.g:546:4: (lv_postcondition_3_0= ruleWebDriverActionCondition )
            {
            // InternalBromium.g:546:4: (lv_postcondition_3_0= ruleWebDriverActionCondition )
            // InternalBromium.g:547:5: lv_postcondition_3_0= ruleWebDriverActionCondition
            {

            					newCompositeNode(grammarAccess.getPostconditionAccess().getPostconditionWebDriverActionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_postcondition_3_0=ruleWebDriverActionCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostconditionRule());
            					}
            					set(
            						current,
            						"postcondition",
            						lv_postcondition_3_0,
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
    // InternalBromium.g:568:1: entryRuleExpectHttpRequest returns [EObject current=null] : iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF ;
    public final EObject entryRuleExpectHttpRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectHttpRequest = null;


        try {
            // InternalBromium.g:568:58: (iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF )
            // InternalBromium.g:569:2: iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF
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
    // InternalBromium.g:575:1: ruleExpectHttpRequest returns [EObject current=null] : ( () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' ) ) ;
    public final EObject ruleExpectHttpRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBromium.g:581:2: ( ( () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' ) ) )
            // InternalBromium.g:582:2: ( () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' ) )
            {
            // InternalBromium.g:582:2: ( () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' ) )
            // InternalBromium.g:583:3: () (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' )
            {
            // InternalBromium.g:583:3: ()
            // InternalBromium.g:584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpectHttpRequestAccess().getExpectHttpRequestAction_0(),
            					current);
            			

            }

            // InternalBromium.g:590:3: (otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request' )
            // InternalBromium.g:591:4: otherlv_1= 'do' ( (lv_not_2_0= 'not' ) )? otherlv_3= 'expect' otherlv_4= 'http' otherlv_5= 'request'
            {
            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            				newLeafNode(otherlv_1, grammarAccess.getExpectHttpRequestAccess().getDoKeyword_1_0());
            			
            // InternalBromium.g:595:4: ( (lv_not_2_0= 'not' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBromium.g:596:5: (lv_not_2_0= 'not' )
                    {
                    // InternalBromium.g:596:5: (lv_not_2_0= 'not' )
                    // InternalBromium.g:597:6: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,24,FOLLOW_18); 

                    						newLeafNode(lv_not_2_0, grammarAccess.getExpectHttpRequestAccess().getNotNotKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpectHttpRequestRule());
                    						}
                    						setWithLastConsumed(current, "not", lv_not_2_0, "not");
                    					

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            				newLeafNode(otherlv_3, grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_1_2());
            			
            otherlv_4=(Token)match(input,26,FOLLOW_20); 

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
    // InternalBromium.g:626:1: entryRuleElementByCssToBePresent returns [EObject current=null] : iv_ruleElementByCssToBePresent= ruleElementByCssToBePresent EOF ;
    public final EObject entryRuleElementByCssToBePresent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementByCssToBePresent = null;


        try {
            // InternalBromium.g:626:64: (iv_ruleElementByCssToBePresent= ruleElementByCssToBePresent EOF )
            // InternalBromium.g:627:2: iv_ruleElementByCssToBePresent= ruleElementByCssToBePresent EOF
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
    // InternalBromium.g:633:1: ruleElementByCssToBePresent returns [EObject current=null] : (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present' ) ;
    public final EObject ruleElementByCssToBePresent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_cssSelector_4_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:639:2: ( (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present' ) )
            // InternalBromium.g:640:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present' )
            {
            // InternalBromium.g:640:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present' )
            // InternalBromium.g:641:3: otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'present'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getElementByCssToBePresentAccess().getElementKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getElementByCssToBePresentAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getElementByCssToBePresentAccess().getCssKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getElementByCssToBePresentAccess().getSelectorKeyword_3());
            		
            // InternalBromium.g:657:3: ( (lv_cssSelector_4_0= ruleParameterValue ) )
            // InternalBromium.g:658:4: (lv_cssSelector_4_0= ruleParameterValue )
            {
            // InternalBromium.g:658:4: (lv_cssSelector_4_0= ruleParameterValue )
            // InternalBromium.g:659:5: lv_cssSelector_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getElementByCssToBePresentAccess().getCssSelectorParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_cssSelector_4_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementByCssToBePresentRule());
            					}
            					set(
            						current,
            						"cssSelector",
            						lv_cssSelector_4_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_26); 

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
    // InternalBromium.g:688:1: entryRuleClickCssSelector returns [EObject current=null] : iv_ruleClickCssSelector= ruleClickCssSelector EOF ;
    public final EObject entryRuleClickCssSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickCssSelector = null;


        try {
            // InternalBromium.g:688:57: (iv_ruleClickCssSelector= ruleClickCssSelector EOF )
            // InternalBromium.g:689:2: iv_ruleClickCssSelector= ruleClickCssSelector EOF
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
    // InternalBromium.g:695:1: ruleClickCssSelector returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) ) ;
    public final EObject ruleClickCssSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_cssSelector_6_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:701:2: ( (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:702:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:702:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) )
            // InternalBromium.g:703:3: otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getClickCssSelectorAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getClickCssSelectorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getClickCssSelectorAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getClickCssSelectorAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getClickCssSelectorAccess().getCssKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getClickCssSelectorAccess().getSelectorKeyword_5());
            		
            // InternalBromium.g:727:3: ( (lv_cssSelector_6_0= ruleParameterValue ) )
            // InternalBromium.g:728:4: (lv_cssSelector_6_0= ruleParameterValue )
            {
            // InternalBromium.g:728:4: (lv_cssSelector_6_0= ruleParameterValue )
            // InternalBromium.g:729:5: lv_cssSelector_6_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getClickCssSelectorAccess().getCssSelectorParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_cssSelector_6_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickCssSelectorRule());
            					}
            					set(
            						current,
            						"cssSelector",
            						lv_cssSelector_6_0,
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
    // InternalBromium.g:750:1: entryRulePageLoad returns [EObject current=null] : iv_rulePageLoad= rulePageLoad EOF ;
    public final EObject entryRulePageLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageLoad = null;


        try {
            // InternalBromium.g:750:49: (iv_rulePageLoad= rulePageLoad EOF )
            // InternalBromium.g:751:2: iv_rulePageLoad= rulePageLoad EOF
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
    // InternalBromium.g:757:1: rulePageLoad returns [EObject current=null] : (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePageLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_subpath_2_0=null;


        	enterRule();

        try {
            // InternalBromium.g:763:2: ( (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) ) )
            // InternalBromium.g:764:2: (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) )
            {
            // InternalBromium.g:764:2: (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) )
            // InternalBromium.g:765:3: otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getPageLoadAccess().getLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPageLoadAccess().getPageKeyword_1());
            		
            // InternalBromium.g:773:3: ( (lv_subpath_2_0= RULE_STRING ) )
            // InternalBromium.g:774:4: (lv_subpath_2_0= RULE_STRING )
            {
            // InternalBromium.g:774:4: (lv_subpath_2_0= RULE_STRING )
            // InternalBromium.g:775:5: lv_subpath_2_0= RULE_STRING
            {
            lv_subpath_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_subpath_2_0, grammarAccess.getPageLoadAccess().getSubpathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subpath",
            						lv_subpath_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // InternalBromium.g:795:1: entryRuleTypeTextInElementFoundByCssSelector returns [EObject current=null] : iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF ;
    public final EObject entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTextInElementFoundByCssSelector = null;


        try {
            // InternalBromium.g:795:76: (iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:796:2: iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF
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
    // InternalBromium.g:802:1: ruleTypeTextInElementFoundByCssSelector returns [EObject current=null] : (otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) ) ) ;
    public final EObject ruleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_text_1_0 = null;

        EObject lv_cssSelector_7_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:808:2: ( (otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:809:2: (otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:809:2: (otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) ) )
            // InternalBromium.g:810:3: otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0());
            		
            // InternalBromium.g:814:3: ( (lv_text_1_0= ruleParameterValue ) )
            // InternalBromium.g:815:4: (lv_text_1_0= ruleParameterValue )
            {
            // InternalBromium.g:815:4: (lv_text_1_0= ruleParameterValue )
            // InternalBromium.g:816:5: lv_text_1_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextParameterValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_text_1_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeTextInElementFoundByCssSelectorRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_1_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_5());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getSelectorKeyword_6());
            		
            // InternalBromium.g:853:3: ( (lv_cssSelector_7_0= ruleParameterValue ) )
            // InternalBromium.g:854:4: (lv_cssSelector_7_0= ruleParameterValue )
            {
            // InternalBromium.g:854:4: (lv_cssSelector_7_0= ruleParameterValue )
            // InternalBromium.g:855:5: lv_cssSelector_7_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorParameterValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_cssSelector_7_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeTextInElementFoundByCssSelectorRule());
            					}
            					set(
            						current,
            						"cssSelector",
            						lv_cssSelector_7_0,
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
    // InternalBromium.g:876:1: entryRuleTextOfElementWithCssSelectorToBe returns [EObject current=null] : iv_ruleTextOfElementWithCssSelectorToBe= ruleTextOfElementWithCssSelectorToBe EOF ;
    public final EObject entryRuleTextOfElementWithCssSelectorToBe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOfElementWithCssSelectorToBe = null;


        try {
            // InternalBromium.g:876:73: (iv_ruleTextOfElementWithCssSelectorToBe= ruleTextOfElementWithCssSelectorToBe EOF )
            // InternalBromium.g:877:2: iv_ruleTextOfElementWithCssSelectorToBe= ruleTextOfElementWithCssSelectorToBe EOF
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
    // InternalBromium.g:883:1: ruleTextOfElementWithCssSelectorToBe returns [EObject current=null] : (otherlv_0= 'text' otherlv_1= 'of' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) otherlv_7= 'is' ( (lv_text_8_0= ruleParameterValue ) ) ) ;
    public final EObject ruleTextOfElementWithCssSelectorToBe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_cssSelector_6_0 = null;

        EObject lv_text_8_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:889:2: ( (otherlv_0= 'text' otherlv_1= 'of' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) otherlv_7= 'is' ( (lv_text_8_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:890:2: (otherlv_0= 'text' otherlv_1= 'of' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) otherlv_7= 'is' ( (lv_text_8_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:890:2: (otherlv_0= 'text' otherlv_1= 'of' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) otherlv_7= 'is' ( (lv_text_8_0= ruleParameterValue ) ) )
            // InternalBromium.g:891:3: otherlv_0= 'text' otherlv_1= 'of' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) otherlv_7= 'is' ( (lv_text_8_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getTextKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getOfKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getCssKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getSelectorKeyword_5());
            		
            // InternalBromium.g:915:3: ( (lv_cssSelector_6_0= ruleParameterValue ) )
            // InternalBromium.g:916:4: (lv_cssSelector_6_0= ruleParameterValue )
            {
            // InternalBromium.g:916:4: (lv_cssSelector_6_0= ruleParameterValue )
            // InternalBromium.g:917:5: lv_cssSelector_6_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getCssSelectorParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_cssSelector_6_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextOfElementWithCssSelectorToBeRule());
            					}
            					set(
            						current,
            						"cssSelector",
            						lv_cssSelector_6_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getIsKeyword_7());
            		
            // InternalBromium.g:938:3: ( (lv_text_8_0= ruleParameterValue ) )
            // InternalBromium.g:939:4: (lv_text_8_0= ruleParameterValue )
            {
            // InternalBromium.g:939:4: (lv_text_8_0= ruleParameterValue )
            // InternalBromium.g:940:5: lv_text_8_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getTextParameterValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_8_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextOfElementWithCssSelectorToBeRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_8_0,
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
    // InternalBromium.g:961:1: entryRuleClickClassByText returns [EObject current=null] : iv_ruleClickClassByText= ruleClickClassByText EOF ;
    public final EObject entryRuleClickClassByText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickClassByText = null;


        try {
            // InternalBromium.g:961:57: (iv_ruleClickClassByText= ruleClickClassByText EOF )
            // InternalBromium.g:962:2: iv_ruleClickClassByText= ruleClickClassByText EOF
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
    // InternalBromium.g:968:1: ruleClickClassByText returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'class' ( (lv_cssClass_5_0= ruleParameterValue ) ) otherlv_6= 'and' otherlv_7= 'text' ( (lv_text_8_0= ruleParameterValue ) ) ) ;
    public final EObject ruleClickClassByText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_cssClass_5_0 = null;

        EObject lv_text_8_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:974:2: ( (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'class' ( (lv_cssClass_5_0= ruleParameterValue ) ) otherlv_6= 'and' otherlv_7= 'text' ( (lv_text_8_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:975:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'class' ( (lv_cssClass_5_0= ruleParameterValue ) ) otherlv_6= 'and' otherlv_7= 'text' ( (lv_text_8_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:975:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'class' ( (lv_cssClass_5_0= ruleParameterValue ) ) otherlv_6= 'and' otherlv_7= 'text' ( (lv_text_8_0= ruleParameterValue ) ) )
            // InternalBromium.g:976:3: otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'class' ( (lv_cssClass_5_0= ruleParameterValue ) ) otherlv_6= 'and' otherlv_7= 'text' ( (lv_text_8_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getClickClassByTextAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getClickClassByTextAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getClickClassByTextAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getClickClassByTextAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getClickClassByTextAccess().getClassKeyword_4());
            		
            // InternalBromium.g:996:3: ( (lv_cssClass_5_0= ruleParameterValue ) )
            // InternalBromium.g:997:4: (lv_cssClass_5_0= ruleParameterValue )
            {
            // InternalBromium.g:997:4: (lv_cssClass_5_0= ruleParameterValue )
            // InternalBromium.g:998:5: lv_cssClass_5_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getClickClassByTextAccess().getCssClassParameterValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_33);
            lv_cssClass_5_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickClassByTextRule());
            					}
            					set(
            						current,
            						"cssClass",
            						lv_cssClass_5_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getClickClassByTextAccess().getAndKeyword_6());
            		
            otherlv_7=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getClickClassByTextAccess().getTextKeyword_7());
            		
            // InternalBromium.g:1023:3: ( (lv_text_8_0= ruleParameterValue ) )
            // InternalBromium.g:1024:4: (lv_text_8_0= ruleParameterValue )
            {
            // InternalBromium.g:1024:4: (lv_text_8_0= ruleParameterValue )
            // InternalBromium.g:1025:5: lv_text_8_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getClickClassByTextAccess().getTextParameterValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_8_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickClassByTextRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_8_0,
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


    // $ANTLR start "entryRuleParameterValue"
    // InternalBromium.g:1046:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalBromium.g:1046:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalBromium.g:1047:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalBromium.g:1053:1: ruleParameterValue returns [EObject current=null] : ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBromium.g:1059:2: ( ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBromium.g:1060:2: ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBromium.g:1060:2: ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBromium.g:1061:3: ( (lv_content_0_0= RULE_STRING ) )
                    {
                    // InternalBromium.g:1061:3: ( (lv_content_0_0= RULE_STRING ) )
                    // InternalBromium.g:1062:4: (lv_content_0_0= RULE_STRING )
                    {
                    // InternalBromium.g:1062:4: (lv_content_0_0= RULE_STRING )
                    // InternalBromium.g:1063:5: lv_content_0_0= RULE_STRING
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
                    // InternalBromium.g:1080:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalBromium.g:1080:3: ( (otherlv_1= RULE_ID ) )
                    // InternalBromium.g:1081:4: (otherlv_1= RULE_ID )
                    {
                    // InternalBromium.g:1081:4: (otherlv_1= RULE_ID )
                    // InternalBromium.g:1082:5: otherlv_1= RULE_ID
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
    // InternalBromium.g:1097:1: entryRuleExposedParameter returns [EObject current=null] : iv_ruleExposedParameter= ruleExposedParameter EOF ;
    public final EObject entryRuleExposedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExposedParameter = null;


        try {
            // InternalBromium.g:1097:57: (iv_ruleExposedParameter= ruleExposedParameter EOF )
            // InternalBromium.g:1098:2: iv_ruleExposedParameter= ruleExposedParameter EOF
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
    // InternalBromium.g:1104:1: ruleExposedParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExposedParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBromium.g:1110:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBromium.g:1111:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBromium.g:1111:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBromium.g:1112:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBromium.g:1112:3: (lv_name_0_0= RULE_ID )
            // InternalBromium.g:1113:4: lv_name_0_0= RULE_ID
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
    // InternalBromium.g:1132:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalBromium.g:1132:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalBromium.g:1133:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalBromium.g:1139:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalBromium.g:1145:2: (this_STRING_0= RULE_STRING )
            // InternalBromium.g:1146:2: this_STRING_0= RULE_STRING
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000005400080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});

}