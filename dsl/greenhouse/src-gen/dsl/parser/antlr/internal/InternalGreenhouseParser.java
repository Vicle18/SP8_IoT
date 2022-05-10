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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'configuration'", "'actuator'", "'has'", "'action'", "'and'", "'sensor'", "'publishes'", "'average'", "'median'", "'times'", "'per'", "'second'", "'with'", "'values'", "','", "'greenhouse'", "'row'", "'includes'", "'global'", "'will'", "'states'", "'when'", "'<'", "'>'", "'='", "'variable'", "'receiving'", "'rule'", "'trigger'", "'on'", "'is'", "'set'", "'+'", "'-'", "'*'", "'/'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
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
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalGreenhouse.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_hardwareSetup_2_0 = null;

        EObject lv_greenhouses_3_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )* ) )
            // InternalGreenhouse.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )* )
            {
            // InternalGreenhouse.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )* )
            // InternalGreenhouse.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )*
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

            // InternalGreenhouse.g:101:3: ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGreenhouse.g:102:4: (lv_hardwareSetup_2_0= ruleHardwareSetup )
                    {
                    // InternalGreenhouse.g:102:4: (lv_hardwareSetup_2_0= ruleHardwareSetup )
                    // InternalGreenhouse.g:103:5: lv_hardwareSetup_2_0= ruleHardwareSetup
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getHardwareSetupHardwareSetupParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_hardwareSetup_2_0=ruleHardwareSetup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					add(
                    						current,
                    						"hardwareSetup",
                    						lv_hardwareSetup_2_0,
                    						"dsl.Greenhouse.HardwareSetup");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGreenhouse.g:120:3: ( (lv_greenhouses_3_0= ruleGreenhouse ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGreenhouse.g:121:4: (lv_greenhouses_3_0= ruleGreenhouse )
            	    {
            	    // InternalGreenhouse.g:121:4: (lv_greenhouses_3_0= ruleGreenhouse )
            	    // InternalGreenhouse.g:122:5: lv_greenhouses_3_0= ruleGreenhouse
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getGreenhousesGreenhouseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_greenhouses_3_0=ruleGreenhouse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"greenhouses",
            	    						lv_greenhouses_3_0,
            	    						"dsl.Greenhouse.Greenhouse");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleHardwareSetup"
    // InternalGreenhouse.g:143:1: entryRuleHardwareSetup returns [EObject current=null] : iv_ruleHardwareSetup= ruleHardwareSetup EOF ;
    public final EObject entryRuleHardwareSetup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardwareSetup = null;


        try {
            // InternalGreenhouse.g:143:54: (iv_ruleHardwareSetup= ruleHardwareSetup EOF )
            // InternalGreenhouse.g:144:2: iv_ruleHardwareSetup= ruleHardwareSetup EOF
            {
             newCompositeNode(grammarAccess.getHardwareSetupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHardwareSetup=ruleHardwareSetup();

            state._fsp--;

             current =iv_ruleHardwareSetup; 
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
    // $ANTLR end "entryRuleHardwareSetup"


    // $ANTLR start "ruleHardwareSetup"
    // InternalGreenhouse.g:150:1: ruleHardwareSetup returns [EObject current=null] : ( () otherlv_1= 'configuration' ( (lv_hardware_2_0= ruleHardware ) )* ) ;
    public final EObject ruleHardwareSetup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_hardware_2_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:156:2: ( ( () otherlv_1= 'configuration' ( (lv_hardware_2_0= ruleHardware ) )* ) )
            // InternalGreenhouse.g:157:2: ( () otherlv_1= 'configuration' ( (lv_hardware_2_0= ruleHardware ) )* )
            {
            // InternalGreenhouse.g:157:2: ( () otherlv_1= 'configuration' ( (lv_hardware_2_0= ruleHardware ) )* )
            // InternalGreenhouse.g:158:3: () otherlv_1= 'configuration' ( (lv_hardware_2_0= ruleHardware ) )*
            {
            // InternalGreenhouse.g:158:3: ()
            // InternalGreenhouse.g:159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHardwareSetupAccess().getSettingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getHardwareSetupAccess().getConfigurationKeyword_1());
            		
            // InternalGreenhouse.g:169:3: ( (lv_hardware_2_0= ruleHardware ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGreenhouse.g:170:4: (lv_hardware_2_0= ruleHardware )
            	    {
            	    // InternalGreenhouse.g:170:4: (lv_hardware_2_0= ruleHardware )
            	    // InternalGreenhouse.g:171:5: lv_hardware_2_0= ruleHardware
            	    {

            	    					newCompositeNode(grammarAccess.getHardwareSetupAccess().getHardwareHardwareParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_hardware_2_0=ruleHardware();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHardwareSetupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hardware",
            	    						lv_hardware_2_0,
            	    						"dsl.Greenhouse.Hardware");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleHardwareSetup"


    // $ANTLR start "entryRuleHardware"
    // InternalGreenhouse.g:192:1: entryRuleHardware returns [EObject current=null] : iv_ruleHardware= ruleHardware EOF ;
    public final EObject entryRuleHardware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardware = null;


        try {
            // InternalGreenhouse.g:192:49: (iv_ruleHardware= ruleHardware EOF )
            // InternalGreenhouse.g:193:2: iv_ruleHardware= ruleHardware EOF
            {
             newCompositeNode(grammarAccess.getHardwareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHardware=ruleHardware();

            state._fsp--;

             current =iv_ruleHardware; 
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
    // $ANTLR end "entryRuleHardware"


    // $ANTLR start "ruleHardware"
    // InternalGreenhouse.g:199:1: ruleHardware returns [EObject current=null] : (this_SettingActuator_0= ruleSettingActuator | this_SettingSensor_1= ruleSettingSensor ) ;
    public final EObject ruleHardware() throws RecognitionException {
        EObject current = null;

        EObject this_SettingActuator_0 = null;

        EObject this_SettingSensor_1 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:205:2: ( (this_SettingActuator_0= ruleSettingActuator | this_SettingSensor_1= ruleSettingSensor ) )
            // InternalGreenhouse.g:206:2: (this_SettingActuator_0= ruleSettingActuator | this_SettingSensor_1= ruleSettingSensor )
            {
            // InternalGreenhouse.g:206:2: (this_SettingActuator_0= ruleSettingActuator | this_SettingSensor_1= ruleSettingSensor )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGreenhouse.g:207:3: this_SettingActuator_0= ruleSettingActuator
                    {

                    			newCompositeNode(grammarAccess.getHardwareAccess().getSettingActuatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SettingActuator_0=ruleSettingActuator();

                    state._fsp--;


                    			current = this_SettingActuator_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:216:3: this_SettingSensor_1= ruleSettingSensor
                    {

                    			newCompositeNode(grammarAccess.getHardwareAccess().getSettingSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SettingSensor_1=ruleSettingSensor();

                    state._fsp--;


                    			current = this_SettingSensor_1;
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
    // $ANTLR end "ruleHardware"


    // $ANTLR start "entryRuleSettingActuator"
    // InternalGreenhouse.g:228:1: entryRuleSettingActuator returns [EObject current=null] : iv_ruleSettingActuator= ruleSettingActuator EOF ;
    public final EObject entryRuleSettingActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingActuator = null;


        try {
            // InternalGreenhouse.g:228:56: (iv_ruleSettingActuator= ruleSettingActuator EOF )
            // InternalGreenhouse.g:229:2: iv_ruleSettingActuator= ruleSettingActuator EOF
            {
             newCompositeNode(grammarAccess.getSettingActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSettingActuator=ruleSettingActuator();

            state._fsp--;

             current =iv_ruleSettingActuator; 
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
    // $ANTLR end "entryRuleSettingActuator"


    // $ANTLR start "ruleSettingActuator"
    // InternalGreenhouse.g:235:1: ruleSettingActuator returns [EObject current=null] : (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* ) ;
    public final EObject ruleSettingActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_settingAction_4_0 = null;

        EObject lv_settingAction_6_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:241:2: ( (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* ) )
            // InternalGreenhouse.g:242:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* )
            {
            // InternalGreenhouse.g:242:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* )
            // InternalGreenhouse.g:243:3: otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingActuatorAccess().getActuatorKeyword_0());
            		
            // InternalGreenhouse.g:247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:248:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:249:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSettingActuatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingActuatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingActuatorAccess().getHasKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingActuatorAccess().getActionKeyword_3());
            		
            // InternalGreenhouse.g:273:3: ( (lv_settingAction_4_0= ruleSettingAction ) )
            // InternalGreenhouse.g:274:4: (lv_settingAction_4_0= ruleSettingAction )
            {
            // InternalGreenhouse.g:274:4: (lv_settingAction_4_0= ruleSettingAction )
            // InternalGreenhouse.g:275:5: lv_settingAction_4_0= ruleSettingAction
            {

            					newCompositeNode(grammarAccess.getSettingActuatorAccess().getSettingActionSettingActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_settingAction_4_0=ruleSettingAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingActuatorRule());
            					}
            					add(
            						current,
            						"settingAction",
            						lv_settingAction_4_0,
            						"dsl.Greenhouse.SettingAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:292:3: (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGreenhouse.g:293:4: otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSettingActuatorAccess().getAndKeyword_5_0());
            	    			
            	    // InternalGreenhouse.g:297:4: ( (lv_settingAction_6_0= ruleSettingAction ) )
            	    // InternalGreenhouse.g:298:5: (lv_settingAction_6_0= ruleSettingAction )
            	    {
            	    // InternalGreenhouse.g:298:5: (lv_settingAction_6_0= ruleSettingAction )
            	    // InternalGreenhouse.g:299:6: lv_settingAction_6_0= ruleSettingAction
            	    {

            	    						newCompositeNode(grammarAccess.getSettingActuatorAccess().getSettingActionSettingActionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_settingAction_6_0=ruleSettingAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSettingActuatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"settingAction",
            	    							lv_settingAction_6_0,
            	    							"dsl.Greenhouse.SettingAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleSettingActuator"


    // $ANTLR start "entryRuleSettingSensor"
    // InternalGreenhouse.g:321:1: entryRuleSettingSensor returns [EObject current=null] : iv_ruleSettingSensor= ruleSettingSensor EOF ;
    public final EObject entryRuleSettingSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingSensor = null;


        try {
            // InternalGreenhouse.g:321:54: (iv_ruleSettingSensor= ruleSettingSensor EOF )
            // InternalGreenhouse.g:322:2: iv_ruleSettingSensor= ruleSettingSensor EOF
            {
             newCompositeNode(grammarAccess.getSettingSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSettingSensor=ruleSettingSensor();

            state._fsp--;

             current =iv_ruleSettingSensor; 
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
    // $ANTLR end "entryRuleSettingSensor"


    // $ANTLR start "ruleSettingSensor"
    // InternalGreenhouse.g:328:1: ruleSettingSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) ) ) ;
    public final EObject ruleSettingSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_reducer_3_0 = null;

        EObject lv_frequency_4_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:334:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) ) ) )
            // InternalGreenhouse.g:335:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) ) )
            {
            // InternalGreenhouse.g:335:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) ) )
            // InternalGreenhouse.g:336:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingSensorAccess().getSensorKeyword_0());
            		
            // InternalGreenhouse.g:340:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:341:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:341:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:342:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSettingSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingSensorAccess().getPublishesKeyword_2());
            		
            // InternalGreenhouse.g:362:3: ( (lv_reducer_3_0= ruleReducer ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGreenhouse.g:363:4: (lv_reducer_3_0= ruleReducer )
                    {
                    // InternalGreenhouse.g:363:4: (lv_reducer_3_0= ruleReducer )
                    // InternalGreenhouse.g:364:5: lv_reducer_3_0= ruleReducer
                    {

                    					newCompositeNode(grammarAccess.getSettingSensorAccess().getReducerReducerParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_reducer_3_0=ruleReducer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSettingSensorRule());
                    					}
                    					set(
                    						current,
                    						"reducer",
                    						lv_reducer_3_0,
                    						"dsl.Greenhouse.Reducer");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGreenhouse.g:381:3: ( (lv_frequency_4_0= ruleFrequency ) )
            // InternalGreenhouse.g:382:4: (lv_frequency_4_0= ruleFrequency )
            {
            // InternalGreenhouse.g:382:4: (lv_frequency_4_0= ruleFrequency )
            // InternalGreenhouse.g:383:5: lv_frequency_4_0= ruleFrequency
            {

            					newCompositeNode(grammarAccess.getSettingSensorAccess().getFrequencyFrequencyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_frequency_4_0=ruleFrequency();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingSensorRule());
            					}
            					set(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"dsl.Greenhouse.Frequency");
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
    // $ANTLR end "ruleSettingSensor"


    // $ANTLR start "entryRuleReducer"
    // InternalGreenhouse.g:404:1: entryRuleReducer returns [EObject current=null] : iv_ruleReducer= ruleReducer EOF ;
    public final EObject entryRuleReducer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReducer = null;


        try {
            // InternalGreenhouse.g:404:48: (iv_ruleReducer= ruleReducer EOF )
            // InternalGreenhouse.g:405:2: iv_ruleReducer= ruleReducer EOF
            {
             newCompositeNode(grammarAccess.getReducerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReducer=ruleReducer();

            state._fsp--;

             current =iv_ruleReducer; 
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
    // $ANTLR end "entryRuleReducer"


    // $ANTLR start "ruleReducer"
    // InternalGreenhouse.g:411:1: ruleReducer returns [EObject current=null] : ( ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) ) ) ;
    public final EObject ruleReducer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:417:2: ( ( ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) ) ) )
            // InternalGreenhouse.g:418:2: ( ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) ) )
            {
            // InternalGreenhouse.g:418:2: ( ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) ) )
            // InternalGreenhouse.g:419:3: ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) )
            {
            // InternalGreenhouse.g:419:3: ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) )
            // InternalGreenhouse.g:420:4: (lv_name_0_1= 'average' | lv_name_0_2= 'median' )
            {
            // InternalGreenhouse.g:420:4: (lv_name_0_1= 'average' | lv_name_0_2= 'median' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGreenhouse.g:421:5: lv_name_0_1= 'average'
                    {
                    lv_name_0_1=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getReducerAccess().getNameAverageKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReducerRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:432:5: lv_name_0_2= 'median'
                    {
                    lv_name_0_2=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getReducerAccess().getNameMedianKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReducerRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleReducer"


    // $ANTLR start "entryRuleFrequency"
    // InternalGreenhouse.g:448:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalGreenhouse.g:448:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalGreenhouse.g:449:2: iv_ruleFrequency= ruleFrequency EOF
            {
             newCompositeNode(grammarAccess.getFrequencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrequency=ruleFrequency();

            state._fsp--;

             current =iv_ruleFrequency; 
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
    // $ANTLR end "entryRuleFrequency"


    // $ANTLR start "ruleFrequency"
    // InternalGreenhouse.g:455:1: ruleFrequency returns [EObject current=null] : ( ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second' ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_freq_0_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:461:2: ( ( ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second' ) )
            // InternalGreenhouse.g:462:2: ( ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second' )
            {
            // InternalGreenhouse.g:462:2: ( ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second' )
            // InternalGreenhouse.g:463:3: ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second'
            {
            // InternalGreenhouse.g:463:3: ( (lv_freq_0_0= ruleExp ) )
            // InternalGreenhouse.g:464:4: (lv_freq_0_0= ruleExp )
            {
            // InternalGreenhouse.g:464:4: (lv_freq_0_0= ruleExp )
            // InternalGreenhouse.g:465:5: lv_freq_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getFrequencyAccess().getFreqExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_freq_0_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrequencyRule());
            					}
            					set(
            						current,
            						"freq",
            						lv_freq_0_0,
            						"dsl.Greenhouse.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFrequencyAccess().getTimesKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getFrequencyAccess().getPerKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFrequencyAccess().getSecondKeyword_3());
            		

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
    // $ANTLR end "ruleFrequency"


    // $ANTLR start "entryRuleSettingAction"
    // InternalGreenhouse.g:498:1: entryRuleSettingAction returns [EObject current=null] : iv_ruleSettingAction= ruleSettingAction EOF ;
    public final EObject entryRuleSettingAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingAction = null;


        try {
            // InternalGreenhouse.g:498:54: (iv_ruleSettingAction= ruleSettingAction EOF )
            // InternalGreenhouse.g:499:2: iv_ruleSettingAction= ruleSettingAction EOF
            {
             newCompositeNode(grammarAccess.getSettingActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSettingAction=ruleSettingAction();

            state._fsp--;

             current =iv_ruleSettingAction; 
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
    // $ANTLR end "entryRuleSettingAction"


    // $ANTLR start "ruleSettingAction"
    // InternalGreenhouse.g:505:1: ruleSettingAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* ) ;
    public final EObject ruleSettingAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_settingValue_3_0 = null;

        EObject lv_settingValue_5_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:511:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* ) )
            // InternalGreenhouse.g:512:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* )
            {
            // InternalGreenhouse.g:512:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* )
            // InternalGreenhouse.g:513:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )*
            {
            // InternalGreenhouse.g:513:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:514:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:514:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:515:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSettingActionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingActionAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingActionAccess().getValuesKeyword_2());
            		
            // InternalGreenhouse.g:539:3: ( (lv_settingValue_3_0= ruleSettingValue ) )
            // InternalGreenhouse.g:540:4: (lv_settingValue_3_0= ruleSettingValue )
            {
            // InternalGreenhouse.g:540:4: (lv_settingValue_3_0= ruleSettingValue )
            // InternalGreenhouse.g:541:5: lv_settingValue_3_0= ruleSettingValue
            {

            					newCompositeNode(grammarAccess.getSettingActionAccess().getSettingValueSettingValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_settingValue_3_0=ruleSettingValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingActionRule());
            					}
            					add(
            						current,
            						"settingValue",
            						lv_settingValue_3_0,
            						"dsl.Greenhouse.SettingValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:558:3: (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGreenhouse.g:559:4: otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSettingActionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGreenhouse.g:563:4: ( (lv_settingValue_5_0= ruleSettingValue ) )
            	    // InternalGreenhouse.g:564:5: (lv_settingValue_5_0= ruleSettingValue )
            	    {
            	    // InternalGreenhouse.g:564:5: (lv_settingValue_5_0= ruleSettingValue )
            	    // InternalGreenhouse.g:565:6: lv_settingValue_5_0= ruleSettingValue
            	    {

            	    						newCompositeNode(grammarAccess.getSettingActionAccess().getSettingValueSettingValueParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_settingValue_5_0=ruleSettingValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSettingActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"settingValue",
            	    							lv_settingValue_5_0,
            	    							"dsl.Greenhouse.SettingValue");
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
    // $ANTLR end "ruleSettingAction"


    // $ANTLR start "entryRuleSettingValue"
    // InternalGreenhouse.g:587:1: entryRuleSettingValue returns [EObject current=null] : iv_ruleSettingValue= ruleSettingValue EOF ;
    public final EObject entryRuleSettingValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingValue = null;


        try {
            // InternalGreenhouse.g:587:53: (iv_ruleSettingValue= ruleSettingValue EOF )
            // InternalGreenhouse.g:588:2: iv_ruleSettingValue= ruleSettingValue EOF
            {
             newCompositeNode(grammarAccess.getSettingValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSettingValue=ruleSettingValue();

            state._fsp--;

             current =iv_ruleSettingValue; 
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
    // $ANTLR end "entryRuleSettingValue"


    // $ANTLR start "ruleSettingValue"
    // InternalGreenhouse.g:594:1: ruleSettingValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSettingValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:600:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGreenhouse.g:601:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:601:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:602:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:602:3: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:603:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSettingValueAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSettingValueRule());
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
    // $ANTLR end "ruleSettingValue"


    // $ANTLR start "entryRuleGreenhouse"
    // InternalGreenhouse.g:622:1: entryRuleGreenhouse returns [EObject current=null] : iv_ruleGreenhouse= ruleGreenhouse EOF ;
    public final EObject entryRuleGreenhouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouse = null;


        try {
            // InternalGreenhouse.g:622:51: (iv_ruleGreenhouse= ruleGreenhouse EOF )
            // InternalGreenhouse.g:623:2: iv_ruleGreenhouse= ruleGreenhouse EOF
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
    // InternalGreenhouse.g:629:1: ruleGreenhouse returns [EObject current=null] : (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* ) ;
    public final EObject ruleGreenhouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_row_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:635:2: ( (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* ) )
            // InternalGreenhouse.g:636:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* )
            {
            // InternalGreenhouse.g:636:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* )
            // InternalGreenhouse.g:637:3: otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseAccess().getGreenhouseKeyword_0());
            		
            // InternalGreenhouse.g:641:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:642:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:642:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:643:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalGreenhouse.g:659:3: ( (lv_row_2_0= ruleRow ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGreenhouse.g:660:4: (lv_row_2_0= ruleRow )
            	    {
            	    // InternalGreenhouse.g:660:4: (lv_row_2_0= ruleRow )
            	    // InternalGreenhouse.g:661:5: lv_row_2_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getGreenhouseAccess().getRowRowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_row_2_0=ruleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGreenhouseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"row",
            	    						lv_row_2_0,
            	    						"dsl.Greenhouse.Row");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGreenhouse.g:678:3: ( (lv_elements_3_0= ruleGreenhouseElement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGreenhouse.g:679:4: (lv_elements_3_0= ruleGreenhouseElement )
            	    {
            	    // InternalGreenhouse.g:679:4: (lv_elements_3_0= ruleGreenhouseElement )
            	    // InternalGreenhouse.g:680:5: lv_elements_3_0= ruleGreenhouseElement
            	    {

            	    					newCompositeNode(grammarAccess.getGreenhouseAccess().getElementsGreenhouseElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_elements_3_0=ruleGreenhouseElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGreenhouseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"dsl.Greenhouse.GreenhouseElement");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleGreenhouse"


    // $ANTLR start "entryRuleRow"
    // InternalGreenhouse.g:701:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalGreenhouse.g:701:44: (iv_ruleRow= ruleRow EOF )
            // InternalGreenhouse.g:702:2: iv_ruleRow= ruleRow EOF
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
    // InternalGreenhouse.g:708:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:714:2: ( (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* ) )
            // InternalGreenhouse.g:715:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* )
            {
            // InternalGreenhouse.g:715:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* )
            // InternalGreenhouse.g:716:3: otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalGreenhouse.g:720:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:721:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:721:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:722:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getIncludesKeyword_2());
            		
            // InternalGreenhouse.g:742:3: ( (lv_elements_3_0= ruleRowElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGreenhouse.g:743:4: (lv_elements_3_0= ruleRowElement )
            	    {
            	    // InternalGreenhouse.g:743:4: (lv_elements_3_0= ruleRowElement )
            	    // InternalGreenhouse.g:744:5: lv_elements_3_0= ruleRowElement
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementsRowElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_elements_3_0=ruleRowElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"dsl.Greenhouse.RowElement");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleGreenhouseElement"
    // InternalGreenhouse.g:765:1: entryRuleGreenhouseElement returns [EObject current=null] : iv_ruleGreenhouseElement= ruleGreenhouseElement EOF ;
    public final EObject entryRuleGreenhouseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseElement = null;


        try {
            // InternalGreenhouse.g:765:58: (iv_ruleGreenhouseElement= ruleGreenhouseElement EOF )
            // InternalGreenhouse.g:766:2: iv_ruleGreenhouseElement= ruleGreenhouseElement EOF
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
    // InternalGreenhouse.g:772:1: ruleGreenhouseElement returns [EObject current=null] : (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet ) ;
    public final EObject ruleGreenhouseElement() throws RecognitionException {
        EObject current = null;

        EObject this_GreenhouseSensor_0 = null;

        EObject this_GreenhouseActuator_1 = null;

        EObject this_GreenhouseRuleSet_2 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:778:2: ( (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet ) )
            // InternalGreenhouse.g:779:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )
            {
            // InternalGreenhouse.g:779:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==RULE_ID) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==14) ) {
                            alt12=1;
                        }
                        else if ( (LA12_4==EOF||(LA12_4>=26 && LA12_4<=27)||(LA12_4>=30 && LA12_4<=31)) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_1==39) ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGreenhouse.g:780:3: this_GreenhouseSensor_0= ruleGreenhouseSensor
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
                    // InternalGreenhouse.g:789:3: this_GreenhouseActuator_1= ruleGreenhouseActuator
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
                    // InternalGreenhouse.g:798:3: this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet
                    {

                    			newCompositeNode(grammarAccess.getGreenhouseElementAccess().getGreenhouseRuleSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GreenhouseRuleSet_2=ruleGreenhouseRuleSet();

                    state._fsp--;


                    			current = this_GreenhouseRuleSet_2;
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
    // InternalGreenhouse.g:810:1: entryRuleRowElement returns [EObject current=null] : iv_ruleRowElement= ruleRowElement EOF ;
    public final EObject entryRuleRowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowElement = null;


        try {
            // InternalGreenhouse.g:810:51: (iv_ruleRowElement= ruleRowElement EOF )
            // InternalGreenhouse.g:811:2: iv_ruleRowElement= ruleRowElement EOF
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
    // InternalGreenhouse.g:817:1: ruleRowElement returns [EObject current=null] : (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet ) ;
    public final EObject ruleRowElement() throws RecognitionException {
        EObject current = null;

        EObject this_RowSensor_0 = null;

        EObject this_RowActuator_1 = null;

        EObject this_RowRuleSet_2 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:823:2: ( (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet ) )
            // InternalGreenhouse.g:824:2: (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet )
            {
            // InternalGreenhouse.g:824:2: (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==EOF||LA13_3==RULE_ID||(LA13_3>=26 && LA13_3<=28)||(LA13_3>=30 && LA13_3<=31)||LA13_3==39) ) {
                        alt13=2;
                    }
                    else if ( (LA13_3==14) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==39) ) {
                alt13=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGreenhouse.g:825:3: this_RowSensor_0= ruleRowSensor
                    {

                    			newCompositeNode(grammarAccess.getRowElementAccess().getRowSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RowSensor_0=ruleRowSensor();

                    state._fsp--;


                    			current = this_RowSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:834:3: this_RowActuator_1= ruleRowActuator
                    {

                    			newCompositeNode(grammarAccess.getRowElementAccess().getRowActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RowActuator_1=ruleRowActuator();

                    state._fsp--;


                    			current = this_RowActuator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGreenhouse.g:843:3: this_RowRuleSet_2= ruleRowRuleSet
                    {

                    			newCompositeNode(grammarAccess.getRowElementAccess().getRowRuleSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RowRuleSet_2=ruleRowRuleSet();

                    state._fsp--;


                    			current = this_RowRuleSet_2;
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
    // InternalGreenhouse.g:855:1: entryRuleGreenhouseActuator returns [EObject current=null] : iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF ;
    public final EObject entryRuleGreenhouseActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseActuator = null;


        try {
            // InternalGreenhouse.g:855:59: (iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF )
            // InternalGreenhouse.g:856:2: iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF
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
    // InternalGreenhouse.g:862:1: ruleGreenhouseActuator returns [EObject current=null] : (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )* ) ;
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
            // InternalGreenhouse.g:868:2: ( (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:869:2: (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:869:2: (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:870:3: otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseActuatorAccess().getGlobalKeyword_0());
            		
            // InternalGreenhouse.g:874:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:875:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:875:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:876:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseActuatorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getGreenhouseActuatorAccess().getTypeSettingActuatorCrossReference_1_0());
            				

            }


            }

            // InternalGreenhouse.g:887:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:888:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:888:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:889:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalGreenhouse.g:905:3: (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGreenhouse.g:906:4: otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGreenhouseActuatorAccess().getWillKeyword_3_0());
                    			
                    // InternalGreenhouse.g:910:4: ( (lv_action_4_0= ruleAction ) )
                    // InternalGreenhouse.g:911:5: (lv_action_4_0= ruleAction )
                    {
                    // InternalGreenhouse.g:911:5: (lv_action_4_0= ruleAction )
                    // InternalGreenhouse.g:912:6: lv_action_4_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getGreenhouseActuatorAccess().getActionActionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            // InternalGreenhouse.g:930:3: (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGreenhouse.g:931:4: otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_23); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGreenhouseActuatorAccess().getCommaKeyword_4_0());
            	    			
            	    otherlv_6=(Token)match(input,31,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getGreenhouseActuatorAccess().getWillKeyword_4_1());
            	    			
            	    // InternalGreenhouse.g:939:4: ( (lv_action_7_0= ruleAction ) )
            	    // InternalGreenhouse.g:940:5: (lv_action_7_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:940:5: (lv_action_7_0= ruleAction )
            	    // InternalGreenhouse.g:941:6: lv_action_7_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseActuatorAccess().getActionActionParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop15;
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


    // $ANTLR start "entryRuleRowActuator"
    // InternalGreenhouse.g:963:1: entryRuleRowActuator returns [EObject current=null] : iv_ruleRowActuator= ruleRowActuator EOF ;
    public final EObject entryRuleRowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowActuator = null;


        try {
            // InternalGreenhouse.g:963:52: (iv_ruleRowActuator= ruleRowActuator EOF )
            // InternalGreenhouse.g:964:2: iv_ruleRowActuator= ruleRowActuator EOF
            {
             newCompositeNode(grammarAccess.getRowActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowActuator=ruleRowActuator();

            state._fsp--;

             current =iv_ruleRowActuator; 
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
    // $ANTLR end "entryRuleRowActuator"


    // $ANTLR start "ruleRowActuator"
    // InternalGreenhouse.g:970:1: ruleRowActuator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )* ) ;
    public final EObject ruleRowActuator() throws RecognitionException {
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
            // InternalGreenhouse.g:976:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:977:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:977:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:978:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )*
            {
            // InternalGreenhouse.g:978:3: ( (otherlv_0= RULE_ID ) )
            // InternalGreenhouse.g:979:4: (otherlv_0= RULE_ID )
            {
            // InternalGreenhouse.g:979:4: (otherlv_0= RULE_ID )
            // InternalGreenhouse.g:980:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowActuatorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getRowActuatorAccess().getTypeSettingActuatorCrossReference_0_0());
            				

            }


            }

            // InternalGreenhouse.g:991:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:992:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:992:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:993:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRowActuatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowActuatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGreenhouse.g:1009:3: (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGreenhouse.g:1010:4: otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRowActuatorAccess().getWillKeyword_2_0());
                    			
                    // InternalGreenhouse.g:1014:4: ( (lv_action_3_0= ruleAction ) )
                    // InternalGreenhouse.g:1015:5: (lv_action_3_0= ruleAction )
                    {
                    // InternalGreenhouse.g:1015:5: (lv_action_3_0= ruleAction )
                    // InternalGreenhouse.g:1016:6: lv_action_3_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRowActuatorAccess().getActionActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_action_3_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowActuatorRule());
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

            // InternalGreenhouse.g:1034:3: (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGreenhouse.g:1035:4: otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRowActuatorAccess().getCommaKeyword_3_0());
            	    			
            	    otherlv_5=(Token)match(input,31,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRowActuatorAccess().getWillKeyword_3_1());
            	    			
            	    // InternalGreenhouse.g:1043:4: ( (lv_action_6_0= ruleAction ) )
            	    // InternalGreenhouse.g:1044:5: (lv_action_6_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:1044:5: (lv_action_6_0= ruleAction )
            	    // InternalGreenhouse.g:1045:6: lv_action_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getRowActuatorAccess().getActionActionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_action_6_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRowActuatorRule());
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
            	    break loop17;
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
    // $ANTLR end "ruleRowActuator"


    // $ANTLR start "entryRuleGreenhouseSensor"
    // InternalGreenhouse.g:1067:1: entryRuleGreenhouseSensor returns [EObject current=null] : iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF ;
    public final EObject entryRuleGreenhouseSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseSensor = null;


        try {
            // InternalGreenhouse.g:1067:57: (iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF )
            // InternalGreenhouse.g:1068:2: iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF
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
    // InternalGreenhouse.g:1074:1: ruleGreenhouseSensor returns [EObject current=null] : (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' ( (lv_variable_4_0= ruleVariable ) ) otherlv_5= 'and' otherlv_6= 'states' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* ) ;
    public final EObject ruleGreenhouseSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_variable_4_0 = null;

        EObject lv_states_7_0 = null;

        EObject lv_states_9_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1080:2: ( (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' ( (lv_variable_4_0= ruleVariable ) ) otherlv_5= 'and' otherlv_6= 'states' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:1081:2: (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' ( (lv_variable_4_0= ruleVariable ) ) otherlv_5= 'and' otherlv_6= 'states' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:1081:2: (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' ( (lv_variable_4_0= ruleVariable ) ) otherlv_5= 'and' otherlv_6= 'states' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )* )
            // InternalGreenhouse.g:1082:3: otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' ( (lv_variable_4_0= ruleVariable ) ) otherlv_5= 'and' otherlv_6= 'states' ( (lv_states_7_0= ruleState ) ) (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseSensorAccess().getGlobalKeyword_0());
            		
            // InternalGreenhouse.g:1086:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:1087:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:1087:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:1088:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseSensorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getGreenhouseSensorAccess().getTypeSettingSensorCrossReference_1_0());
            				

            }


            }

            // InternalGreenhouse.g:1099:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:1100:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:1100:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:1101:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseSensorAccess().getHasKeyword_3());
            		
            // InternalGreenhouse.g:1121:3: ( (lv_variable_4_0= ruleVariable ) )
            // InternalGreenhouse.g:1122:4: (lv_variable_4_0= ruleVariable )
            {
            // InternalGreenhouse.g:1122:4: (lv_variable_4_0= ruleVariable )
            // InternalGreenhouse.g:1123:5: lv_variable_4_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getVariableVariableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_variable_4_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_4_0,
            						"dsl.Greenhouse.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getGreenhouseSensorAccess().getAndKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGreenhouseSensorAccess().getStatesKeyword_6());
            		
            // InternalGreenhouse.g:1148:3: ( (lv_states_7_0= ruleState ) )
            // InternalGreenhouse.g:1149:4: (lv_states_7_0= ruleState )
            {
            // InternalGreenhouse.g:1149:4: (lv_states_7_0= ruleState )
            // InternalGreenhouse.g:1150:5: lv_states_7_0= ruleState
            {

            					newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_states_7_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_7_0,
            						"dsl.Greenhouse.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:1167:3: (otherlv_8= ',' ( (lv_states_9_0= ruleState ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGreenhouse.g:1168:4: otherlv_8= ',' ( (lv_states_9_0= ruleState ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGreenhouseSensorAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalGreenhouse.g:1172:4: ( (lv_states_9_0= ruleState ) )
            	    // InternalGreenhouse.g:1173:5: (lv_states_9_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:1173:5: (lv_states_9_0= ruleState )
            	    // InternalGreenhouse.g:1174:6: lv_states_9_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_states_9_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_9_0,
            	    							"dsl.Greenhouse.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "entryRuleRowSensor"
    // InternalGreenhouse.g:1196:1: entryRuleRowSensor returns [EObject current=null] : iv_ruleRowSensor= ruleRowSensor EOF ;
    public final EObject entryRuleRowSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowSensor = null;


        try {
            // InternalGreenhouse.g:1196:50: (iv_ruleRowSensor= ruleRowSensor EOF )
            // InternalGreenhouse.g:1197:2: iv_ruleRowSensor= ruleRowSensor EOF
            {
             newCompositeNode(grammarAccess.getRowSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowSensor=ruleRowSensor();

            state._fsp--;

             current =iv_ruleRowSensor; 
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
    // $ANTLR end "entryRuleRowSensor"


    // $ANTLR start "ruleRowSensor"
    // InternalGreenhouse.g:1203:1: ruleRowSensor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) ;
    public final EObject ruleRowSensor() throws RecognitionException {
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
            // InternalGreenhouse.g:1209:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:1210:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:1210:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            // InternalGreenhouse.g:1211:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            {
            // InternalGreenhouse.g:1211:3: ( (otherlv_0= RULE_ID ) )
            // InternalGreenhouse.g:1212:4: (otherlv_0= RULE_ID )
            {
            // InternalGreenhouse.g:1212:4: (otherlv_0= RULE_ID )
            // InternalGreenhouse.g:1213:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowSensorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getRowSensorAccess().getTypeSettingSensorCrossReference_0_0());
            				

            }


            }

            // InternalGreenhouse.g:1224:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1225:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1225:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1226:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRowSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRowSensorAccess().getHasKeyword_2());
            		
            // InternalGreenhouse.g:1246:3: ( (lv_variable_3_0= ruleVariable ) )
            // InternalGreenhouse.g:1247:4: (lv_variable_3_0= ruleVariable )
            {
            // InternalGreenhouse.g:1247:4: (lv_variable_3_0= ruleVariable )
            // InternalGreenhouse.g:1248:5: lv_variable_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getRowSensorAccess().getVariableVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_variable_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowSensorRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_3_0,
            						"dsl.Greenhouse.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getRowSensorAccess().getAndKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRowSensorAccess().getStatesKeyword_5());
            		
            // InternalGreenhouse.g:1273:3: ( (lv_states_6_0= ruleState ) )
            // InternalGreenhouse.g:1274:4: (lv_states_6_0= ruleState )
            {
            // InternalGreenhouse.g:1274:4: (lv_states_6_0= ruleState )
            // InternalGreenhouse.g:1275:5: lv_states_6_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRowSensorAccess().getStatesStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_states_6_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowSensorRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_6_0,
            						"dsl.Greenhouse.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:1292:3: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGreenhouse.g:1293:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRowSensorAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGreenhouse.g:1297:4: ( (lv_states_8_0= ruleState ) )
            	    // InternalGreenhouse.g:1298:5: (lv_states_8_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:1298:5: (lv_states_8_0= ruleState )
            	    // InternalGreenhouse.g:1299:6: lv_states_8_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getRowSensorAccess().getStatesStateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_states_8_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRowSensorRule());
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
            	    break loop19;
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
    // $ANTLR end "ruleRowSensor"


    // $ANTLR start "entryRuleState"
    // InternalGreenhouse.g:1321:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGreenhouse.g:1321:46: (iv_ruleState= ruleState EOF )
            // InternalGreenhouse.g:1322:2: iv_ruleState= ruleState EOF
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
    // InternalGreenhouse.g:1328:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        EObject lv_threshold_4_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1334:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) ) ) )
            // InternalGreenhouse.g:1335:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) ) )
            {
            // InternalGreenhouse.g:1335:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) ) )
            // InternalGreenhouse.g:1336:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) )
            {
            // InternalGreenhouse.g:1336:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:1337:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:1337:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:1338:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getWhenKeyword_1());
            		
            // InternalGreenhouse.g:1358:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1359:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1359:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1360:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_2, grammarAccess.getStateAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            // InternalGreenhouse.g:1371:3: ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) )
            // InternalGreenhouse.g:1372:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            {
            // InternalGreenhouse.g:1372:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            // InternalGreenhouse.g:1373:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            {
            // InternalGreenhouse.g:1373:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGreenhouse.g:1374:6: lv_op_3_1= '<'
                    {
                    lv_op_3_1=(Token)match(input,34,FOLLOW_11); 

                    						newLeafNode(lv_op_3_1, grammarAccess.getStateAccess().getOpLessThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:1385:6: lv_op_3_2= '>'
                    {
                    lv_op_3_2=(Token)match(input,35,FOLLOW_11); 

                    						newLeafNode(lv_op_3_2, grammarAccess.getStateAccess().getOpGreaterThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalGreenhouse.g:1396:6: lv_op_3_3= '='
                    {
                    lv_op_3_3=(Token)match(input,36,FOLLOW_11); 

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

            // InternalGreenhouse.g:1409:3: ( (lv_threshold_4_0= ruleExp ) )
            // InternalGreenhouse.g:1410:4: (lv_threshold_4_0= ruleExp )
            {
            // InternalGreenhouse.g:1410:4: (lv_threshold_4_0= ruleExp )
            // InternalGreenhouse.g:1411:5: lv_threshold_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getStateAccess().getThresholdExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_threshold_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"threshold",
            						lv_threshold_4_0,
            						"dsl.Greenhouse.Exp");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleVariable"
    // InternalGreenhouse.g:1432:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalGreenhouse.g:1432:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalGreenhouse.g:1433:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalGreenhouse.g:1439:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1445:2: ( (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1446:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1446:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1447:3: otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalGreenhouse.g:1451:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1452:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1452:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1453:5: lv_name_1_0= RULE_ID
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
    // InternalGreenhouse.g:1473:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGreenhouse.g:1473:47: (iv_ruleAction= ruleAction EOF )
            // InternalGreenhouse.g:1474:2: iv_ruleAction= ruleAction EOF
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
    // InternalGreenhouse.g:1480:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_trigger_4_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1486:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) ) ) )
            // InternalGreenhouse.g:1487:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) ) )
            {
            // InternalGreenhouse.g:1487:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) ) )
            // InternalGreenhouse.g:1488:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) )
            {
            // InternalGreenhouse.g:1488:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:1489:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:1489:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:1490:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            // InternalGreenhouse.g:1506:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:1507:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:1507:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:1508:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getValueSettingValueCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getWhenKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getReceivingKeyword_3());
            		
            // InternalGreenhouse.g:1527:3: ( (lv_trigger_4_0= ruleTrigger ) )
            // InternalGreenhouse.g:1528:4: (lv_trigger_4_0= ruleTrigger )
            {
            // InternalGreenhouse.g:1528:4: (lv_trigger_4_0= ruleTrigger )
            // InternalGreenhouse.g:1529:5: lv_trigger_4_0= ruleTrigger
            {

            					newCompositeNode(grammarAccess.getActionAccess().getTriggerTriggerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_trigger_4_0=ruleTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_4_0,
            						"dsl.Greenhouse.Trigger");
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
    // InternalGreenhouse.g:1550:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalGreenhouse.g:1550:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalGreenhouse.g:1551:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalGreenhouse.g:1557:1: ruleTrigger returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1563:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1564:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1564:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1565:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:1565:3: ()
            // InternalGreenhouse.g:1566:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerAccess().getTriggerAction_0(),
            					current);
            			

            }

            // InternalGreenhouse.g:1572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1573:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1574:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleRowRuleSet"
    // InternalGreenhouse.g:1594:1: entryRuleRowRuleSet returns [EObject current=null] : iv_ruleRowRuleSet= ruleRowRuleSet EOF ;
    public final EObject entryRuleRowRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowRuleSet = null;


        try {
            // InternalGreenhouse.g:1594:51: (iv_ruleRowRuleSet= ruleRowRuleSet EOF )
            // InternalGreenhouse.g:1595:2: iv_ruleRowRuleSet= ruleRowRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRowRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowRuleSet=ruleRowRuleSet();

            state._fsp--;

             current =iv_ruleRowRuleSet; 
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
    // $ANTLR end "entryRuleRowRuleSet"


    // $ANTLR start "ruleRowRuleSet"
    // InternalGreenhouse.g:1601:1: ruleRowRuleSet returns [EObject current=null] : (otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleRowRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1607:2: ( (otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1608:2: (otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1608:2: (otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            // InternalGreenhouse.g:1609:3: otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getRowRuleSetAccess().getRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRowRuleSetAccess().getTriggerKeyword_1());
            		
            // InternalGreenhouse.g:1617:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1618:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1618:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1619:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_2, grammarAccess.getRowRuleSetAccess().getTriggerTriggerCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRowRuleSetAccess().getOnKeyword_3());
            		
            // InternalGreenhouse.g:1634:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreenhouse.g:1635:4: (otherlv_4= RULE_ID )
            {
            // InternalGreenhouse.g:1635:4: (otherlv_4= RULE_ID )
            // InternalGreenhouse.g:1636:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_4, grammarAccess.getRowRuleSetAccess().getActuatorRowActuatorCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRowRuleSetAccess().getWhenKeyword_5());
            		
            // InternalGreenhouse.g:1651:3: ( (otherlv_6= RULE_ID ) )
            // InternalGreenhouse.g:1652:4: (otherlv_6= RULE_ID )
            {
            // InternalGreenhouse.g:1652:4: (otherlv_6= RULE_ID )
            // InternalGreenhouse.g:1653:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_6, grammarAccess.getRowRuleSetAccess().getSensorRowSensorCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRowRuleSetAccess().getIsKeyword_7());
            		
            // InternalGreenhouse.g:1668:3: ( (otherlv_8= RULE_ID ) )
            // InternalGreenhouse.g:1669:4: (otherlv_8= RULE_ID )
            {
            // InternalGreenhouse.g:1669:4: (otherlv_8= RULE_ID )
            // InternalGreenhouse.g:1670:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_8, grammarAccess.getRowRuleSetAccess().getStateStateCrossReference_8_0());
            				

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
    // $ANTLR end "ruleRowRuleSet"


    // $ANTLR start "entryRuleGreenhouseRuleSet"
    // InternalGreenhouse.g:1685:1: entryRuleGreenhouseRuleSet returns [EObject current=null] : iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF ;
    public final EObject entryRuleGreenhouseRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseRuleSet = null;


        try {
            // InternalGreenhouse.g:1685:58: (iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF )
            // InternalGreenhouse.g:1686:2: iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF
            {
             newCompositeNode(grammarAccess.getGreenhouseRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreenhouseRuleSet=ruleGreenhouseRuleSet();

            state._fsp--;

             current =iv_ruleGreenhouseRuleSet; 
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
    // $ANTLR end "entryRuleGreenhouseRuleSet"


    // $ANTLR start "ruleGreenhouseRuleSet"
    // InternalGreenhouse.g:1692:1: ruleGreenhouseRuleSet returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleGreenhouseRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1698:2: ( (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1699:2: (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1699:2: (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            // InternalGreenhouse.g:1700:3: otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseRuleSetAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreenhouseRuleSetAccess().getRuleKeyword_1());
            		
            // InternalGreenhouse.g:1708:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1709:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1709:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1710:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_2, grammarAccess.getGreenhouseRuleSetAccess().getActuatorGreenhouseCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseRuleSetAccess().getSetKeyword_3());
            		
            // InternalGreenhouse.g:1725:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreenhouse.g:1726:4: (otherlv_4= RULE_ID )
            {
            // InternalGreenhouse.g:1726:4: (otherlv_4= RULE_ID )
            // InternalGreenhouse.g:1727:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_4, grammarAccess.getGreenhouseRuleSetAccess().getActionActionCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGreenhouseRuleSetAccess().getWhenKeyword_5());
            		
            // InternalGreenhouse.g:1742:3: ( (otherlv_6= RULE_ID ) )
            // InternalGreenhouse.g:1743:4: (otherlv_6= RULE_ID )
            {
            // InternalGreenhouse.g:1743:4: (otherlv_6= RULE_ID )
            // InternalGreenhouse.g:1744:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_6, grammarAccess.getGreenhouseRuleSetAccess().getSensorGreenhouseSensorCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getGreenhouseRuleSetAccess().getIsKeyword_7());
            		
            // InternalGreenhouse.g:1759:3: ( (otherlv_8= RULE_ID ) )
            // InternalGreenhouse.g:1760:4: (otherlv_8= RULE_ID )
            {
            // InternalGreenhouse.g:1760:4: (otherlv_8= RULE_ID )
            // InternalGreenhouse.g:1761:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_8, grammarAccess.getGreenhouseRuleSetAccess().getStateStateCrossReference_8_0());
            				

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
    // $ANTLR end "ruleGreenhouseRuleSet"


    // $ANTLR start "entryRuleExp"
    // InternalGreenhouse.g:1776:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalGreenhouse.g:1776:44: (iv_ruleExp= ruleExp EOF )
            // InternalGreenhouse.g:1777:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalGreenhouse.g:1783:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1789:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalGreenhouse.g:1790:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalGreenhouse.g:1790:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalGreenhouse.g:1791:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGreenhouse.g:1799:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=44 && LA22_0<=45)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGreenhouse.g:1800:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalGreenhouse.g:1800:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==44) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==45) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalGreenhouse.g:1801:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalGreenhouse.g:1801:5: ( () otherlv_2= '+' )
            	            // InternalGreenhouse.g:1802:6: () otherlv_2= '+'
            	            {
            	            // InternalGreenhouse.g:1802:6: ()
            	            // InternalGreenhouse.g:1803:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,44,FOLLOW_11); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGreenhouse.g:1815:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalGreenhouse.g:1815:5: ( () otherlv_4= '-' )
            	            // InternalGreenhouse.g:1816:6: () otherlv_4= '-'
            	            {
            	            // InternalGreenhouse.g:1816:6: ()
            	            // InternalGreenhouse.g:1817:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,45,FOLLOW_11); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalGreenhouse.g:1829:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalGreenhouse.g:1830:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalGreenhouse.g:1830:5: (lv_right_5_0= ruleFactor )
            	    // InternalGreenhouse.g:1831:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dsl.Greenhouse.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalGreenhouse.g:1853:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalGreenhouse.g:1853:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalGreenhouse.g:1854:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalGreenhouse.g:1860:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1866:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalGreenhouse.g:1867:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalGreenhouse.g:1867:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalGreenhouse.g:1868:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGreenhouse.g:1876:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=46 && LA24_0<=47)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGreenhouse.g:1877:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalGreenhouse.g:1877:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==46) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==47) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalGreenhouse.g:1878:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalGreenhouse.g:1878:5: ( () otherlv_2= '*' )
            	            // InternalGreenhouse.g:1879:6: () otherlv_2= '*'
            	            {
            	            // InternalGreenhouse.g:1879:6: ()
            	            // InternalGreenhouse.g:1880:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,46,FOLLOW_11); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGreenhouse.g:1892:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalGreenhouse.g:1892:5: ( () otherlv_4= '/' )
            	            // InternalGreenhouse.g:1893:6: () otherlv_4= '/'
            	            {
            	            // InternalGreenhouse.g:1893:6: ()
            	            // InternalGreenhouse.g:1894:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,47,FOLLOW_11); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalGreenhouse.g:1906:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalGreenhouse.g:1907:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalGreenhouse.g:1907:5: (lv_right_5_0= rulePrimary )
            	    // InternalGreenhouse.g:1908:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dsl.Greenhouse.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalGreenhouse.g:1930:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGreenhouse.g:1930:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGreenhouse.g:1931:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalGreenhouse.g:1937:1: rulePrimary returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1943:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalGreenhouse.g:1944:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalGreenhouse.g:1944:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalGreenhouse.g:1945:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:1945:3: ()
            // InternalGreenhouse.g:1946:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimaryAccess().getMathNumberAction_0(),
            					current);
            			

            }

            // InternalGreenhouse.g:1952:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalGreenhouse.g:1953:4: (lv_value_1_0= RULE_INT )
            {
            // InternalGreenhouse.g:1953:4: (lv_value_1_0= RULE_INT )
            // InternalGreenhouse.g:1954:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000050000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C00000000002L});

}