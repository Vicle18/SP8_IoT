package dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dsl.services.GreenhouseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreenhouseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'greenhouse'", "'['", "']'", "'row'", "'includes'", "'global'", "'actuator'", "'can'", "','", "'sensor'", "'has'", "'value'", "'and'", "'states'", "'when'", "'<'", "'>'", "'='", "'variable'", "'receiving'", "'by'", "'setting'", "'to'", "'rule'", "'set'", "'is'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
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
    public static final int RULE_ID=4;
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


        public InternalGreenhouseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGreenhouseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGreenhouseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGreenhouse.g"; }



     	private GreenhouseGrammarAccess grammarAccess;

        public InternalGreenhouseParser(TokenStream input, GreenhouseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GreenhouseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGreenhouse.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGreenhouse.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGreenhouse.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalGreenhouse.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_greenhouses_2_0= ruleGreenhouse ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_greenhouses_2_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_greenhouses_2_0= ruleGreenhouse ) )* ) )
            // InternalGreenhouse.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_greenhouses_2_0= ruleGreenhouse ) )* )
            {
            // InternalGreenhouse.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_greenhouses_2_0= ruleGreenhouse ) )* )
            // InternalGreenhouse.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_greenhouses_2_0= ruleGreenhouse ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSystemKeyword_0());
            		
            // InternalGreenhouse.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGreenhouse.g:101:3: ( (lv_greenhouses_2_0= ruleGreenhouse ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGreenhouse.g:102:4: (lv_greenhouses_2_0= ruleGreenhouse )
            	    {
            	    // InternalGreenhouse.g:102:4: (lv_greenhouses_2_0= ruleGreenhouse )
            	    // InternalGreenhouse.g:103:5: lv_greenhouses_2_0= ruleGreenhouse
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getGreenhousesGreenhouseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_greenhouses_2_0=ruleGreenhouse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"greenhouses",
            	    						lv_greenhouses_2_0,
            	    						"dsl.Greenhouse.Greenhouse");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleGreenhouse"
    // InternalGreenhouse.g:124:1: entryRuleGreenhouse returns [EObject current=null] : iv_ruleGreenhouse= ruleGreenhouse EOF ;
    public final EObject entryRuleGreenhouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouse = null;


        try {
            // InternalGreenhouse.g:124:51: (iv_ruleGreenhouse= ruleGreenhouse EOF )
            // InternalGreenhouse.g:125:2: iv_ruleGreenhouse= ruleGreenhouse EOF
            {
             newCompositeNode(grammarAccess.getGreenhouseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreenhouse=ruleGreenhouse();

            state._fsp--;

             current =iv_ruleGreenhouse; 
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
    // $ANTLR end "entryRuleGreenhouse"


    // $ANTLR start "ruleGreenhouse"
    // InternalGreenhouse.g:131:1: ruleGreenhouse returns [EObject current=null] : (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_row_3_0= ruleRow ) )* ( (lv_elements_4_0= ruleGreenhouseElement ) )* otherlv_5= ']' ) ;
    public final EObject ruleGreenhouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_row_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:137:2: ( (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_row_3_0= ruleRow ) )* ( (lv_elements_4_0= ruleGreenhouseElement ) )* otherlv_5= ']' ) )
            // InternalGreenhouse.g:138:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_row_3_0= ruleRow ) )* ( (lv_elements_4_0= ruleGreenhouseElement ) )* otherlv_5= ']' )
            {
            // InternalGreenhouse.g:138:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_row_3_0= ruleRow ) )* ( (lv_elements_4_0= ruleGreenhouseElement ) )* otherlv_5= ']' )
            // InternalGreenhouse.g:139:3: otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_row_3_0= ruleRow ) )* ( (lv_elements_4_0= ruleGreenhouseElement ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseAccess().getGreenhouseKeyword_0());
            		
            // InternalGreenhouse.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreenhouseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGreenhouseAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalGreenhouse.g:165:3: ( (lv_row_3_0= ruleRow ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGreenhouse.g:166:4: (lv_row_3_0= ruleRow )
            	    {
            	    // InternalGreenhouse.g:166:4: (lv_row_3_0= ruleRow )
            	    // InternalGreenhouse.g:167:5: lv_row_3_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getGreenhouseAccess().getRowRowParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_row_3_0=ruleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGreenhouseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"row",
            	    						lv_row_3_0,
            	    						"dsl.Greenhouse.Row");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGreenhouse.g:184:3: ( (lv_elements_4_0= ruleGreenhouseElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGreenhouse.g:185:4: (lv_elements_4_0= ruleGreenhouseElement )
            	    {
            	    // InternalGreenhouse.g:185:4: (lv_elements_4_0= ruleGreenhouseElement )
            	    // InternalGreenhouse.g:186:5: lv_elements_4_0= ruleGreenhouseElement
            	    {

            	    					newCompositeNode(grammarAccess.getGreenhouseAccess().getElementsGreenhouseElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_4_0=ruleGreenhouseElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGreenhouseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"dsl.Greenhouse.GreenhouseElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGreenhouseAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGreenhouse"


    // $ANTLR start "entryRuleRow"
    // InternalGreenhouse.g:211:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalGreenhouse.g:211:44: (iv_ruleRow= ruleRow EOF )
            // InternalGreenhouse.g:212:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalGreenhouse.g:218:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' otherlv_3= '[' ( (lv_elements_4_0= ruleRowElement ) )* otherlv_5= ']' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:224:2: ( (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' otherlv_3= '[' ( (lv_elements_4_0= ruleRowElement ) )* otherlv_5= ']' ) )
            // InternalGreenhouse.g:225:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' otherlv_3= '[' ( (lv_elements_4_0= ruleRowElement ) )* otherlv_5= ']' )
            {
            // InternalGreenhouse.g:225:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' otherlv_3= '[' ( (lv_elements_4_0= ruleRowElement ) )* otherlv_5= ']' )
            // InternalGreenhouse.g:226:3: otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' otherlv_3= '[' ( (lv_elements_4_0= ruleRowElement ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalGreenhouse.g:230:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:231:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:231:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:232:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getIncludesKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRowAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalGreenhouse.g:256:3: ( (lv_elements_4_0= ruleRowElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGreenhouse.g:257:4: (lv_elements_4_0= ruleRowElement )
            	    {
            	    // InternalGreenhouse.g:257:4: (lv_elements_4_0= ruleRowElement )
            	    // InternalGreenhouse.g:258:5: lv_elements_4_0= ruleRowElement
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementsRowElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_4_0=ruleRowElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"dsl.Greenhouse.RowElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRowAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleGreenhouseElement"
    // InternalGreenhouse.g:283:1: entryRuleGreenhouseElement returns [EObject current=null] : iv_ruleGreenhouseElement= ruleGreenhouseElement EOF ;
    public final EObject entryRuleGreenhouseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseElement = null;


        try {
            // InternalGreenhouse.g:283:58: (iv_ruleGreenhouseElement= ruleGreenhouseElement EOF )
            // InternalGreenhouse.g:284:2: iv_ruleGreenhouseElement= ruleGreenhouseElement EOF
            {
             newCompositeNode(grammarAccess.getGreenhouseElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreenhouseElement=ruleGreenhouseElement();

            state._fsp--;

             current =iv_ruleGreenhouseElement; 
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
    // $ANTLR end "entryRuleGreenhouseElement"


    // $ANTLR start "ruleGreenhouseElement"
    // InternalGreenhouse.g:290:1: ruleGreenhouseElement returns [EObject current=null] : (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_RuleSet_2= ruleRuleSet ) ;
    public final EObject ruleGreenhouseElement() throws RecognitionException {
        EObject current = null;

        EObject this_GreenhouseSensor_0 = null;

        EObject this_GreenhouseActuator_1 = null;

        EObject this_RuleSet_2 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:296:2: ( (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_RuleSet_2= ruleRuleSet ) )
            // InternalGreenhouse.g:297:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_RuleSet_2= ruleRuleSet )
            {
            // InternalGreenhouse.g:297:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_RuleSet_2= ruleRuleSet )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==18) ) {
                    alt5=2;
                }
                else if ( (LA5_1==21) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==35) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGreenhouse.g:298:3: this_GreenhouseSensor_0= ruleGreenhouseSensor
                    {

                    			newCompositeNode(grammarAccess.getGreenhouseElementAccess().getGreenhouseSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GreenhouseSensor_0=ruleGreenhouseSensor();

                    state._fsp--;


                    			current = this_GreenhouseSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:307:3: this_GreenhouseActuator_1= ruleGreenhouseActuator
                    {

                    			newCompositeNode(grammarAccess.getGreenhouseElementAccess().getGreenhouseActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GreenhouseActuator_1=ruleGreenhouseActuator();

                    state._fsp--;


                    			current = this_GreenhouseActuator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGreenhouse.g:316:3: this_RuleSet_2= ruleRuleSet
                    {

                    			newCompositeNode(grammarAccess.getGreenhouseElementAccess().getRuleSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleSet_2=ruleRuleSet();

                    state._fsp--;


                    			current = this_RuleSet_2;
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
    // $ANTLR end "ruleGreenhouseElement"


    // $ANTLR start "entryRuleRowElement"
    // InternalGreenhouse.g:328:1: entryRuleRowElement returns [EObject current=null] : iv_ruleRowElement= ruleRowElement EOF ;
    public final EObject entryRuleRowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowElement = null;


        try {
            // InternalGreenhouse.g:328:51: (iv_ruleRowElement= ruleRowElement EOF )
            // InternalGreenhouse.g:329:2: iv_ruleRowElement= ruleRowElement EOF
            {
             newCompositeNode(grammarAccess.getRowElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowElement=ruleRowElement();

            state._fsp--;

             current =iv_ruleRowElement; 
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
    // $ANTLR end "entryRuleRowElement"


    // $ANTLR start "ruleRowElement"
    // InternalGreenhouse.g:335:1: ruleRowElement returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleRowElement() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:341:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalGreenhouse.g:342:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalGreenhouse.g:342:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGreenhouse.g:343:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getRowElementAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:352:3: this_Actuator_1= ruleActuator
                    {

                    			newCompositeNode(grammarAccess.getRowElementAccess().getActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;


                    			current = this_Actuator_1;
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
    // $ANTLR end "ruleRowElement"


    // $ANTLR start "entryRuleGreenhouseActuator"
    // InternalGreenhouse.g:364:1: entryRuleGreenhouseActuator returns [EObject current=null] : iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF ;
    public final EObject entryRuleGreenhouseActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseActuator = null;


        try {
            // InternalGreenhouse.g:364:59: (iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF )
            // InternalGreenhouse.g:365:2: iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF
            {
             newCompositeNode(grammarAccess.getGreenhouseActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreenhouseActuator=ruleGreenhouseActuator();

            state._fsp--;

             current =iv_ruleGreenhouseActuator; 
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
    // $ANTLR end "entryRuleGreenhouseActuator"


    // $ANTLR start "ruleGreenhouseActuator"
    // InternalGreenhouse.g:371:1: ruleGreenhouseActuator returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )* ) ;
    public final EObject ruleGreenhouseActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_action_4_0 = null;

        EObject lv_action_7_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:377:2: ( (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:378:2: (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:378:2: (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:379:3: otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseActuatorAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreenhouseActuatorAccess().getActuatorKeyword_1());
            		
            // InternalGreenhouse.g:387:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:388:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:388:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:389:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGreenhouseActuatorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseActuatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGreenhouse.g:405:3: (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGreenhouse.g:406:4: otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGreenhouseActuatorAccess().getCanKeyword_3_0());
                    			
                    // InternalGreenhouse.g:410:4: ( (lv_action_4_0= ruleAction ) )
                    // InternalGreenhouse.g:411:5: (lv_action_4_0= ruleAction )
                    {
                    // InternalGreenhouse.g:411:5: (lv_action_4_0= ruleAction )
                    // InternalGreenhouse.g:412:6: lv_action_4_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getGreenhouseActuatorAccess().getActionActionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_action_4_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGreenhouseActuatorRule());
                    						}
                    						add(
                    							current,
                    							"action",
                    							lv_action_4_0,
                    							"dsl.Greenhouse.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGreenhouse.g:430:3: (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGreenhouse.g:431:4: otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGreenhouseActuatorAccess().getCommaKeyword_4_0());
            	    			
            	    otherlv_6=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getGreenhouseActuatorAccess().getCanKeyword_4_1());
            	    			
            	    // InternalGreenhouse.g:439:4: ( (lv_action_7_0= ruleAction ) )
            	    // InternalGreenhouse.g:440:5: (lv_action_7_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:440:5: (lv_action_7_0= ruleAction )
            	    // InternalGreenhouse.g:441:6: lv_action_7_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseActuatorAccess().getActionActionParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_action_7_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreenhouseActuatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_7_0,
            	    							"dsl.Greenhouse.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleGreenhouseActuator"


    // $ANTLR start "entryRuleActuator"
    // InternalGreenhouse.g:463:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalGreenhouse.g:463:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalGreenhouse.g:464:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalGreenhouse.g:470:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )* ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_action_3_0 = null;

        EObject lv_action_6_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:476:2: ( (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:477:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:477:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:478:3: otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalGreenhouse.g:482:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:483:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:483:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:484:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActuatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGreenhouse.g:500:3: (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGreenhouse.g:501:4: otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getCanKeyword_2_0());
                    			
                    // InternalGreenhouse.g:505:4: ( (lv_action_3_0= ruleAction ) )
                    // InternalGreenhouse.g:506:5: (lv_action_3_0= ruleAction )
                    {
                    // InternalGreenhouse.g:506:5: (lv_action_3_0= ruleAction )
                    // InternalGreenhouse.g:507:6: lv_action_3_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getActionActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_action_3_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						add(
                    							current,
                    							"action",
                    							lv_action_3_0,
                    							"dsl.Greenhouse.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGreenhouse.g:525:3: (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGreenhouse.g:526:4: otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getCommaKeyword_3_0());
            	    			
            	    otherlv_5=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getCanKeyword_3_1());
            	    			
            	    // InternalGreenhouse.g:534:4: ( (lv_action_6_0= ruleAction ) )
            	    // InternalGreenhouse.g:535:5: (lv_action_6_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:535:5: (lv_action_6_0= ruleAction )
            	    // InternalGreenhouse.g:536:6: lv_action_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getActuatorAccess().getActionActionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_action_6_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActuatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_6_0,
            	    							"dsl.Greenhouse.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleGreenhouseSensor"
    // InternalGreenhouse.g:558:1: entryRuleGreenhouseSensor returns [EObject current=null] : iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF ;
    public final EObject entryRuleGreenhouseSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseSensor = null;


        try {
            // InternalGreenhouse.g:558:57: (iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF )
            // InternalGreenhouse.g:559:2: iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF
            {
             newCompositeNode(grammarAccess.getGreenhouseSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreenhouseSensor=ruleGreenhouseSensor();

            state._fsp--;

             current =iv_ruleGreenhouseSensor; 
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
    // $ANTLR end "entryRuleGreenhouseSensor"


    // $ANTLR start "ruleGreenhouseSensor"
    // InternalGreenhouse.g:565:1: ruleGreenhouseSensor returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) ;
    public final EObject ruleGreenhouseSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_variable_5_0 = null;

        EObject lv_states_6_0 = null;

        EObject lv_states_8_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:571:2: ( (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:572:2: (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:572:2: (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            // InternalGreenhouse.g:573:3: otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseSensorAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreenhouseSensorAccess().getSensorKeyword_1());
            		
            // InternalGreenhouse.g:581:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:582:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:582:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:583:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGreenhouseSensorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseSensorAccess().getHasKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getGreenhouseSensorAccess().getValueKeyword_4());
            		
            // InternalGreenhouse.g:607:3: ( (lv_variable_5_0= ruleVariable ) )
            // InternalGreenhouse.g:608:4: (lv_variable_5_0= ruleVariable )
            {
            // InternalGreenhouse.g:608:4: (lv_variable_5_0= ruleVariable )
            // InternalGreenhouse.g:609:5: lv_variable_5_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getVariableVariableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_3);
            lv_variable_5_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_5_0,
            						"dsl.Greenhouse.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:626:3: ( (lv_states_6_0= ruleState ) )
            // InternalGreenhouse.g:627:4: (lv_states_6_0= ruleState )
            {
            // InternalGreenhouse.g:627:4: (lv_states_6_0= ruleState )
            // InternalGreenhouse.g:628:5: lv_states_6_0= ruleState
            {

            					newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_states_6_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_6_0,
            						"dsl.Greenhouse.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:645:3: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGreenhouse.g:646:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getGreenhouseSensorAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGreenhouse.g:650:4: ( (lv_states_8_0= ruleState ) )
            	    // InternalGreenhouse.g:651:5: (lv_states_8_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:651:5: (lv_states_8_0= ruleState )
            	    // InternalGreenhouse.g:652:6: lv_states_8_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_states_8_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_8_0,
            	    							"dsl.Greenhouse.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleGreenhouseSensor"


    // $ANTLR start "entryRuleSensor"
    // InternalGreenhouse.g:674:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalGreenhouse.g:674:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalGreenhouse.g:675:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalGreenhouse.g:681:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_variable_3_0 = null;

        EObject lv_states_6_0 = null;

        EObject lv_states_8_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:687:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:688:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:688:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            // InternalGreenhouse.g:689:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalGreenhouse.g:693:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:694:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:694:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:695:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getHasKeyword_2());
            		
            // InternalGreenhouse.g:715:3: ( (lv_variable_3_0= ruleVariable ) )
            // InternalGreenhouse.g:716:4: (lv_variable_3_0= ruleVariable )
            {
            // InternalGreenhouse.g:716:4: (lv_variable_3_0= ruleVariable )
            // InternalGreenhouse.g:717:5: lv_variable_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getVariableVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_variable_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"dsl.Greenhouse.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getAndKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getStatesKeyword_5());
            		
            // InternalGreenhouse.g:742:3: ( (lv_states_6_0= ruleState ) )
            // InternalGreenhouse.g:743:4: (lv_states_6_0= ruleState )
            {
            // InternalGreenhouse.g:743:4: (lv_states_6_0= ruleState )
            // InternalGreenhouse.g:744:5: lv_states_6_0= ruleState
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getStatesStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_states_6_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_6_0,
            						"dsl.Greenhouse.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:761:3: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGreenhouse.g:762:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGreenhouse.g:766:4: ( (lv_states_8_0= ruleState ) )
            	    // InternalGreenhouse.g:767:5: (lv_states_8_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:767:5: (lv_states_8_0= ruleState )
            	    // InternalGreenhouse.g:768:6: lv_states_8_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getSensorAccess().getStatesStateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_states_8_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_8_0,
            	    							"dsl.Greenhouse.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleState"
    // InternalGreenhouse.g:790:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGreenhouse.g:790:46: (iv_ruleState= ruleState EOF )
            // InternalGreenhouse.g:791:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalGreenhouse.g:797:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_threshold_4_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:803:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) ) )
            // InternalGreenhouse.g:804:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) )
            {
            // InternalGreenhouse.g:804:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) )
            // InternalGreenhouse.g:805:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:805:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:806:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:806:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:807:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getWhenKeyword_1());
            		
            // InternalGreenhouse.g:827:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:828:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:828:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:829:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getStateAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            // InternalGreenhouse.g:840:3: ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) )
            // InternalGreenhouse.g:841:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            {
            // InternalGreenhouse.g:841:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            // InternalGreenhouse.g:842:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            {
            // InternalGreenhouse.g:842:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGreenhouse.g:843:6: lv_op_3_1= '<'
                    {
                    lv_op_3_1=(Token)match(input,27,FOLLOW_22); 

                    						newLeafNode(lv_op_3_1, grammarAccess.getStateAccess().getOpLessThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:854:6: lv_op_3_2= '>'
                    {
                    lv_op_3_2=(Token)match(input,28,FOLLOW_22); 

                    						newLeafNode(lv_op_3_2, grammarAccess.getStateAccess().getOpGreaterThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalGreenhouse.g:865:6: lv_op_3_3= '='
                    {
                    lv_op_3_3=(Token)match(input,29,FOLLOW_22); 

                    						newLeafNode(lv_op_3_3, grammarAccess.getStateAccess().getOpEqualsSignKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalGreenhouse.g:878:3: ( (lv_threshold_4_0= RULE_INT ) )
            // InternalGreenhouse.g:879:4: (lv_threshold_4_0= RULE_INT )
            {
            // InternalGreenhouse.g:879:4: (lv_threshold_4_0= RULE_INT )
            // InternalGreenhouse.g:880:5: lv_threshold_4_0= RULE_INT
            {
            lv_threshold_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_threshold_4_0, grammarAccess.getStateAccess().getThresholdINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"threshold",
            						lv_threshold_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleVariable"
    // InternalGreenhouse.g:900:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalGreenhouse.g:900:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalGreenhouse.g:901:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalGreenhouse.g:907:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:913:2: ( (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:914:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:914:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:915:3: otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalGreenhouse.g:919:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:920:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:920:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:921:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAction"
    // InternalGreenhouse.g:941:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGreenhouse.g:941:47: (iv_ruleAction= ruleAction EOF )
            // InternalGreenhouse.g:942:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGreenhouse.g:948:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_setting_6_0= ruleSetting ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_setting_6_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:954:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_setting_6_0= ruleSetting ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) ) )
            // InternalGreenhouse.g:955:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_setting_6_0= ruleSetting ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) )
            {
            // InternalGreenhouse.g:955:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_setting_6_0= ruleSetting ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) )
            // InternalGreenhouse.g:956:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_setting_6_0= ruleSetting ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) )
            {
            // InternalGreenhouse.g:956:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:957:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:957:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:958:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getReceivingKeyword_2());
            		
            // InternalGreenhouse.g:982:3: ( (lv_trigger_3_0= ruleTrigger ) )
            // InternalGreenhouse.g:983:4: (lv_trigger_3_0= ruleTrigger )
            {
            // InternalGreenhouse.g:983:4: (lv_trigger_3_0= ruleTrigger )
            // InternalGreenhouse.g:984:5: lv_trigger_3_0= ruleTrigger
            {

            					newCompositeNode(grammarAccess.getActionAccess().getTriggerTriggerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_trigger_3_0=ruleTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_3_0,
            						"dsl.Greenhouse.Trigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getByKeyword_4());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getSettingKeyword_5());
            		
            // InternalGreenhouse.g:1009:3: ( (lv_setting_6_0= ruleSetting ) )
            // InternalGreenhouse.g:1010:4: (lv_setting_6_0= ruleSetting )
            {
            // InternalGreenhouse.g:1010:4: (lv_setting_6_0= ruleSetting )
            // InternalGreenhouse.g:1011:5: lv_setting_6_0= ruleSetting
            {

            					newCompositeNode(grammarAccess.getActionAccess().getSettingSettingParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
            lv_setting_6_0=ruleSetting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"setting",
            						lv_setting_6_0,
            						"dsl.Greenhouse.Setting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getToKeyword_7());
            		
            // InternalGreenhouse.g:1032:3: ( (lv_value_8_0= ruleValue ) )
            // InternalGreenhouse.g:1033:4: (lv_value_8_0= ruleValue )
            {
            // InternalGreenhouse.g:1033:4: (lv_value_8_0= ruleValue )
            // InternalGreenhouse.g:1034:5: lv_value_8_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getActionAccess().getValueValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_8_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_8_0,
            						"dsl.Greenhouse.Value");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTrigger"
    // InternalGreenhouse.g:1055:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalGreenhouse.g:1055:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalGreenhouse.g:1056:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalGreenhouse.g:1062:1: ruleTrigger returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1068:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1069:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1069:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1070:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:1070:3: ()
            // InternalGreenhouse.g:1071:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerAccess().getTriggerAction_0(),
            					current);
            			

            }

            // InternalGreenhouse.g:1077:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1078:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1078:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1079:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleSetting"
    // InternalGreenhouse.g:1099:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalGreenhouse.g:1099:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalGreenhouse.g:1100:2: iv_ruleSetting= ruleSetting EOF
            {
             newCompositeNode(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetting=ruleSetting();

            state._fsp--;

             current =iv_ruleSetting; 
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
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalGreenhouse.g:1106:1: ruleSetting returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1112:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1113:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1113:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1114:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:1114:3: ()
            // InternalGreenhouse.g:1115:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSettingAccess().getSettingAction_0(),
            					current);
            			

            }

            // InternalGreenhouse.g:1121:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1122:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1122:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1123:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSettingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleValue"
    // InternalGreenhouse.g:1143:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGreenhouse.g:1143:46: (iv_ruleValue= ruleValue EOF )
            // InternalGreenhouse.g:1144:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGreenhouse.g:1150:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_INT ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1156:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) ) )
            // InternalGreenhouse.g:1157:2: ( () ( (lv_name_1_0= RULE_INT ) ) )
            {
            // InternalGreenhouse.g:1157:2: ( () ( (lv_name_1_0= RULE_INT ) ) )
            // InternalGreenhouse.g:1158:3: () ( (lv_name_1_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:1158:3: ()
            // InternalGreenhouse.g:1159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            // InternalGreenhouse.g:1165:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalGreenhouse.g:1166:4: (lv_name_1_0= RULE_INT )
            {
            // InternalGreenhouse.g:1166:4: (lv_name_1_0= RULE_INT )
            // InternalGreenhouse.g:1167:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getValueAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleRuleSet"
    // InternalGreenhouse.g:1187:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalGreenhouse.g:1187:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalGreenhouse.g:1188:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
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
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalGreenhouse.g:1194:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1200:2: ( (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1201:2: (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1201:2: (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) )
            // InternalGreenhouse.g:1202:3: otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getRuleKeyword_0());
            		
            // InternalGreenhouse.g:1206:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:1207:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:1207:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:1208:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleSetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getRuleSetAccess().getActuatorActuatorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getSetKeyword_2());
            		
            // InternalGreenhouse.g:1223:3: ( (otherlv_3= RULE_ID ) )
            // InternalGreenhouse.g:1224:4: (otherlv_3= RULE_ID )
            {
            // InternalGreenhouse.g:1224:4: (otherlv_3= RULE_ID )
            // InternalGreenhouse.g:1225:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleSetRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getRuleSetAccess().getActionActionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleSetAccess().getWhenKeyword_4());
            		
            // InternalGreenhouse.g:1240:3: ( (otherlv_5= RULE_ID ) )
            // InternalGreenhouse.g:1241:4: (otherlv_5= RULE_ID )
            {
            // InternalGreenhouse.g:1241:4: (otherlv_5= RULE_ID )
            // InternalGreenhouse.g:1242:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleSetRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getSensorSensorCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleSetAccess().getIsKeyword_6());
            		
            // InternalGreenhouse.g:1257:3: ( (otherlv_7= RULE_ID ) )
            // InternalGreenhouse.g:1258:4: (otherlv_7= RULE_ID )
            {
            // InternalGreenhouse.g:1258:4: (otherlv_7= RULE_ID )
            // InternalGreenhouse.g:1259:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleSetRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getRuleSetAccess().getStateStateCrossReference_7_0());
            				

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
    // $ANTLR end "ruleRuleSet"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000080002C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800024000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000244000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});

}