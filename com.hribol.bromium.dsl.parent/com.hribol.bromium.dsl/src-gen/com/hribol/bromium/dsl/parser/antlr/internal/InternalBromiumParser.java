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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'version'", "'from'", "'actions'", "'{'", "'}'", "'id'", "'syntax'", "'when'", "'then'", "'make'", "'sure'", "'do'", "'not'", "'expect'", "'http'", "'request'", "'element'", "'with'", "'css'", "'selector'", "'is'", "'clickable'", "'click'", "'on'", "'load'", "'page'", "'type'", "'in'"
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

        AntlrDatatypeRuleToken lv_expectHttpRequest_7_0 = null;



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


    // $ANTLR start "entryRuleWebDriverAction"
    // InternalBromium.g:386:1: entryRuleWebDriverAction returns [EObject current=null] : iv_ruleWebDriverAction= ruleWebDriverAction EOF ;
    public final EObject entryRuleWebDriverAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebDriverAction = null;


        try {
            // InternalBromium.g:386:56: (iv_ruleWebDriverAction= ruleWebDriverAction EOF )
            // InternalBromium.g:387:2: iv_ruleWebDriverAction= ruleWebDriverAction EOF
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
    // InternalBromium.g:393:1: ruleWebDriverAction returns [EObject current=null] : (this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent | this_ClickOnElementWithId_1= ruleClickOnElementWithId | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector ) ;
    public final EObject ruleWebDriverAction() throws RecognitionException {
        EObject current = null;

        EObject this_ElementWithIdIsPresent_0 = null;

        EObject this_ClickOnElementWithId_1 = null;

        EObject this_PageLoad_2 = null;

        EObject this_TypeTextInElementFoundByCssSelector_3 = null;



        	enterRule();

        try {
            // InternalBromium.g:399:2: ( (this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent | this_ClickOnElementWithId_1= ruleClickOnElementWithId | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector ) )
            // InternalBromium.g:400:2: (this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent | this_ClickOnElementWithId_1= ruleClickOnElementWithId | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector )
            {
            // InternalBromium.g:400:2: (this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent | this_ClickOnElementWithId_1= ruleClickOnElementWithId | this_PageLoad_2= rulePageLoad | this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            case 38:
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
                    // InternalBromium.g:401:3: this_ElementWithIdIsPresent_0= ruleElementWithIdIsPresent
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getElementWithIdIsPresentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementWithIdIsPresent_0=ruleElementWithIdIsPresent();

                    state._fsp--;


                    			current = this_ElementWithIdIsPresent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBromium.g:410:3: this_ClickOnElementWithId_1= ruleClickOnElementWithId
                    {

                    			newCompositeNode(grammarAccess.getWebDriverActionAccess().getClickOnElementWithIdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickOnElementWithId_1=ruleClickOnElementWithId();

                    state._fsp--;


                    			current = this_ClickOnElementWithId_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBromium.g:419:3: this_PageLoad_2= rulePageLoad
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
                    // InternalBromium.g:428:3: this_TypeTextInElementFoundByCssSelector_3= ruleTypeTextInElementFoundByCssSelector
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
    // InternalBromium.g:440:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalBromium.g:440:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalBromium.g:441:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalBromium.g:447:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverAction ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:453:2: ( (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverAction ) ) ) )
            // InternalBromium.g:454:2: (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverAction ) ) )
            {
            // InternalBromium.g:454:2: (otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverAction ) ) )
            // InternalBromium.g:455:3: otherlv_0= 'when' ( (lv_action_1_0= ruleWebDriverAction ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getWhenKeyword_0());
            		
            // InternalBromium.g:459:3: ( (lv_action_1_0= ruleWebDriverAction ) )
            // InternalBromium.g:460:4: (lv_action_1_0= ruleWebDriverAction )
            {
            // InternalBromium.g:460:4: (lv_action_1_0= ruleWebDriverAction )
            // InternalBromium.g:461:5: lv_action_1_0= ruleWebDriverAction
            {

            					newCompositeNode(grammarAccess.getPreconditionAccess().getActionWebDriverActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_1_0=ruleWebDriverAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_1_0,
            						"com.hribol.bromium.dsl.Bromium.WebDriverAction");
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
    // InternalBromium.g:482:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalBromium.g:482:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalBromium.g:483:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalBromium.g:489:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverAction ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_postcondition_3_0 = null;



        	enterRule();

        try {
            // InternalBromium.g:495:2: ( (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverAction ) ) ) )
            // InternalBromium.g:496:2: (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverAction ) ) )
            {
            // InternalBromium.g:496:2: (otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverAction ) ) )
            // InternalBromium.g:497:3: otherlv_0= 'then' otherlv_1= 'make' otherlv_2= 'sure' ( (lv_postcondition_3_0= ruleWebDriverAction ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getThenKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getMakeKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getSureKeyword_2());
            		
            // InternalBromium.g:509:3: ( (lv_postcondition_3_0= ruleWebDriverAction ) )
            // InternalBromium.g:510:4: (lv_postcondition_3_0= ruleWebDriverAction )
            {
            // InternalBromium.g:510:4: (lv_postcondition_3_0= ruleWebDriverAction )
            // InternalBromium.g:511:5: lv_postcondition_3_0= ruleWebDriverAction
            {

            					newCompositeNode(grammarAccess.getPostconditionAccess().getPostconditionWebDriverActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_postcondition_3_0=ruleWebDriverAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostconditionRule());
            					}
            					set(
            						current,
            						"postcondition",
            						lv_postcondition_3_0,
            						"com.hribol.bromium.dsl.Bromium.WebDriverAction");
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
    // InternalBromium.g:532:1: entryRuleExpectHttpRequest returns [String current=null] : iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF ;
    public final String entryRuleExpectHttpRequest() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpectHttpRequest = null;


        try {
            // InternalBromium.g:532:57: (iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF )
            // InternalBromium.g:533:2: iv_ruleExpectHttpRequest= ruleExpectHttpRequest EOF
            {
             newCompositeNode(grammarAccess.getExpectHttpRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpectHttpRequest=ruleExpectHttpRequest();

            state._fsp--;

             current =iv_ruleExpectHttpRequest.getText(); 
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
    // InternalBromium.g:539:1: ruleExpectHttpRequest returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'do' (kw= 'not' )? kw= 'expect' kw= 'http' kw= 'request' ) ;
    public final AntlrDatatypeRuleToken ruleExpectHttpRequest() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBromium.g:545:2: ( (kw= 'do' (kw= 'not' )? kw= 'expect' kw= 'http' kw= 'request' ) )
            // InternalBromium.g:546:2: (kw= 'do' (kw= 'not' )? kw= 'expect' kw= 'http' kw= 'request' )
            {
            // InternalBromium.g:546:2: (kw= 'do' (kw= 'not' )? kw= 'expect' kw= 'http' kw= 'request' )
            // InternalBromium.g:547:3: kw= 'do' (kw= 'not' )? kw= 'expect' kw= 'http' kw= 'request'
            {
            kw=(Token)match(input,23,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExpectHttpRequestAccess().getDoKeyword_0());
            		
            // InternalBromium.g:552:3: (kw= 'not' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBromium.g:553:4: kw= 'not'
                    {
                    kw=(Token)match(input,24,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpectHttpRequestAccess().getNotKeyword_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExpectHttpRequestAccess().getExpectKeyword_2());
            		
            kw=(Token)match(input,26,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExpectHttpRequestAccess().getHttpKeyword_3());
            		
            kw=(Token)match(input,27,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExpectHttpRequestAccess().getRequestKeyword_4());
            		

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


    // $ANTLR start "entryRuleElementWithIdIsPresent"
    // InternalBromium.g:578:1: entryRuleElementWithIdIsPresent returns [EObject current=null] : iv_ruleElementWithIdIsPresent= ruleElementWithIdIsPresent EOF ;
    public final EObject entryRuleElementWithIdIsPresent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementWithIdIsPresent = null;


        try {
            // InternalBromium.g:578:63: (iv_ruleElementWithIdIsPresent= ruleElementWithIdIsPresent EOF )
            // InternalBromium.g:579:2: iv_ruleElementWithIdIsPresent= ruleElementWithIdIsPresent EOF
            {
             newCompositeNode(grammarAccess.getElementWithIdIsPresentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementWithIdIsPresent=ruleElementWithIdIsPresent();

            state._fsp--;

             current =iv_ruleElementWithIdIsPresent; 
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
    // $ANTLR end "entryRuleElementWithIdIsPresent"


    // $ANTLR start "ruleElementWithIdIsPresent"
    // InternalBromium.g:585:1: ruleElementWithIdIsPresent returns [EObject current=null] : (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'clickable' ) ;
    public final EObject ruleElementWithIdIsPresent() throws RecognitionException {
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
            // InternalBromium.g:591:2: ( (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'clickable' ) )
            // InternalBromium.g:592:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'clickable' )
            {
            // InternalBromium.g:592:2: (otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'clickable' )
            // InternalBromium.g:593:3: otherlv_0= 'element' otherlv_1= 'with' otherlv_2= 'css' otherlv_3= 'selector' ( (lv_cssSelector_4_0= ruleParameterValue ) ) otherlv_5= 'is' otherlv_6= 'clickable'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getElementWithIdIsPresentAccess().getElementKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getElementWithIdIsPresentAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getElementWithIdIsPresentAccess().getCssKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getElementWithIdIsPresentAccess().getSelectorKeyword_3());
            		
            // InternalBromium.g:609:3: ( (lv_cssSelector_4_0= ruleParameterValue ) )
            // InternalBromium.g:610:4: (lv_cssSelector_4_0= ruleParameterValue )
            {
            // InternalBromium.g:610:4: (lv_cssSelector_4_0= ruleParameterValue )
            // InternalBromium.g:611:5: lv_cssSelector_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_cssSelector_4_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementWithIdIsPresentRule());
            					}
            					set(
            						current,
            						"cssSelector",
            						lv_cssSelector_4_0,
            						"com.hribol.bromium.dsl.Bromium.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getElementWithIdIsPresentAccess().getIsKeyword_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getElementWithIdIsPresentAccess().getClickableKeyword_6());
            		

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
    // $ANTLR end "ruleElementWithIdIsPresent"


    // $ANTLR start "entryRuleClickOnElementWithId"
    // InternalBromium.g:640:1: entryRuleClickOnElementWithId returns [EObject current=null] : iv_ruleClickOnElementWithId= ruleClickOnElementWithId EOF ;
    public final EObject entryRuleClickOnElementWithId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickOnElementWithId = null;


        try {
            // InternalBromium.g:640:61: (iv_ruleClickOnElementWithId= ruleClickOnElementWithId EOF )
            // InternalBromium.g:641:2: iv_ruleClickOnElementWithId= ruleClickOnElementWithId EOF
            {
             newCompositeNode(grammarAccess.getClickOnElementWithIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickOnElementWithId=ruleClickOnElementWithId();

            state._fsp--;

             current =iv_ruleClickOnElementWithId; 
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
    // $ANTLR end "entryRuleClickOnElementWithId"


    // $ANTLR start "ruleClickOnElementWithId"
    // InternalBromium.g:647:1: ruleClickOnElementWithId returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) ) ;
    public final EObject ruleClickOnElementWithId() throws RecognitionException {
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
            // InternalBromium.g:653:2: ( (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:654:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:654:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) ) )
            // InternalBromium.g:655:3: otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'css' otherlv_5= 'selector' ( (lv_cssSelector_6_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getClickOnElementWithIdAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getClickOnElementWithIdAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getClickOnElementWithIdAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getClickOnElementWithIdAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getClickOnElementWithIdAccess().getCssKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getClickOnElementWithIdAccess().getSelectorKeyword_5());
            		
            // InternalBromium.g:679:3: ( (lv_cssSelector_6_0= ruleParameterValue ) )
            // InternalBromium.g:680:4: (lv_cssSelector_6_0= ruleParameterValue )
            {
            // InternalBromium.g:680:4: (lv_cssSelector_6_0= ruleParameterValue )
            // InternalBromium.g:681:5: lv_cssSelector_6_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_cssSelector_6_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickOnElementWithIdRule());
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
    // $ANTLR end "ruleClickOnElementWithId"


    // $ANTLR start "entryRulePageLoad"
    // InternalBromium.g:702:1: entryRulePageLoad returns [EObject current=null] : iv_rulePageLoad= rulePageLoad EOF ;
    public final EObject entryRulePageLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageLoad = null;


        try {
            // InternalBromium.g:702:49: (iv_rulePageLoad= rulePageLoad EOF )
            // InternalBromium.g:703:2: iv_rulePageLoad= rulePageLoad EOF
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
    // InternalBromium.g:709:1: rulePageLoad returns [EObject current=null] : (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePageLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_subpath_2_0=null;


        	enterRule();

        try {
            // InternalBromium.g:715:2: ( (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) ) )
            // InternalBromium.g:716:2: (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) )
            {
            // InternalBromium.g:716:2: (otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) ) )
            // InternalBromium.g:717:3: otherlv_0= 'load' otherlv_1= 'page' ( (lv_subpath_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getPageLoadAccess().getLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPageLoadAccess().getPageKeyword_1());
            		
            // InternalBromium.g:725:3: ( (lv_subpath_2_0= RULE_STRING ) )
            // InternalBromium.g:726:4: (lv_subpath_2_0= RULE_STRING )
            {
            // InternalBromium.g:726:4: (lv_subpath_2_0= RULE_STRING )
            // InternalBromium.g:727:5: lv_subpath_2_0= RULE_STRING
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
    // InternalBromium.g:747:1: entryRuleTypeTextInElementFoundByCssSelector returns [EObject current=null] : iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF ;
    public final EObject entryRuleTypeTextInElementFoundByCssSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTextInElementFoundByCssSelector = null;


        try {
            // InternalBromium.g:747:76: (iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF )
            // InternalBromium.g:748:2: iv_ruleTypeTextInElementFoundByCssSelector= ruleTypeTextInElementFoundByCssSelector EOF
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
    // InternalBromium.g:754:1: ruleTypeTextInElementFoundByCssSelector returns [EObject current=null] : (otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) ) ) ;
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
            // InternalBromium.g:760:2: ( (otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) ) ) )
            // InternalBromium.g:761:2: (otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) ) )
            {
            // InternalBromium.g:761:2: (otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) ) )
            // InternalBromium.g:762:3: otherlv_0= 'type' ( (lv_text_1_0= ruleParameterValue ) ) otherlv_2= 'in' otherlv_3= 'element' otherlv_4= 'with' otherlv_5= 'css' otherlv_6= 'selector' ( (lv_cssSelector_7_0= ruleParameterValue ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTypeKeyword_0());
            		
            // InternalBromium.g:766:3: ( (lv_text_1_0= ruleParameterValue ) )
            // InternalBromium.g:767:4: (lv_text_1_0= ruleParameterValue )
            {
            // InternalBromium.g:767:4: (lv_text_1_0= ruleParameterValue )
            // InternalBromium.g:768:5: lv_text_1_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextParameterValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_2=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getInKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getElementKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssKeyword_5());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getSelectorKeyword_6());
            		
            // InternalBromium.g:805:3: ( (lv_cssSelector_7_0= ruleParameterValue ) )
            // InternalBromium.g:806:4: (lv_cssSelector_7_0= ruleParameterValue )
            {
            // InternalBromium.g:806:4: (lv_cssSelector_7_0= ruleParameterValue )
            // InternalBromium.g:807:5: lv_cssSelector_7_0= ruleParameterValue
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


    // $ANTLR start "entryRuleParameterValue"
    // InternalBromium.g:828:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalBromium.g:828:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalBromium.g:829:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalBromium.g:835:1: ruleParameterValue returns [EObject current=null] : ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBromium.g:841:2: ( ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBromium.g:842:2: ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBromium.g:842:2: ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBromium.g:843:3: ( (lv_content_0_0= RULE_STRING ) )
                    {
                    // InternalBromium.g:843:3: ( (lv_content_0_0= RULE_STRING ) )
                    // InternalBromium.g:844:4: (lv_content_0_0= RULE_STRING )
                    {
                    // InternalBromium.g:844:4: (lv_content_0_0= RULE_STRING )
                    // InternalBromium.g:845:5: lv_content_0_0= RULE_STRING
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
                    // InternalBromium.g:862:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalBromium.g:862:3: ( (otherlv_1= RULE_ID ) )
                    // InternalBromium.g:863:4: (otherlv_1= RULE_ID )
                    {
                    // InternalBromium.g:863:4: (otherlv_1= RULE_ID )
                    // InternalBromium.g:864:5: otherlv_1= RULE_ID
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
    // InternalBromium.g:879:1: entryRuleExposedParameter returns [EObject current=null] : iv_ruleExposedParameter= ruleExposedParameter EOF ;
    public final EObject entryRuleExposedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExposedParameter = null;


        try {
            // InternalBromium.g:879:57: (iv_ruleExposedParameter= ruleExposedParameter EOF )
            // InternalBromium.g:880:2: iv_ruleExposedParameter= ruleExposedParameter EOF
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
    // InternalBromium.g:886:1: ruleExposedParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExposedParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBromium.g:892:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBromium.g:893:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBromium.g:893:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBromium.g:894:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBromium.g:894:3: (lv_name_0_0= RULE_ID )
            // InternalBromium.g:895:4: lv_name_0_0= RULE_ID
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
    // InternalBromium.g:914:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalBromium.g:914:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalBromium.g:915:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalBromium.g:921:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalBromium.g:927:2: (this_STRING_0= RULE_STRING )
            // InternalBromium.g:928:2: this_STRING_0= RULE_STRING
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000005410080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});

}