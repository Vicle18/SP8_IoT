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
<<<<<<< HEAD
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'configuration'", "'actuator'", "'has'", "'action'", "','", "'and'", "'listens'", "'on'", "'sensor'", "'publishes'", "'to'", "'topic'", "'with'", "'values'", "'greenhouse'", "'row'", "'includes'", "'global'", "'will'", "'value'", "'states'", "'when'", "'<'", "'>'", "'='", "'variable'", "'receiving'", "'by'", "'setting'", "'rule'", "'set'", "'is'"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'setting'", "'actuator'", "'has'", "'action'", "','", "'and'", "'listens'", "'on'", "'sensor'", "'publishes'", "'to'", "'topic'", "'with'", "'values'", "'greenhouse'", "'row'", "'includes'", "'global'", "'can'", "'value'", "'states'", "'when'", "'<'", "'>'", "'='", "'variable'", "'receiving'", "'by'", "'condition'", "'rule'", "'set'", "'is'"
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )* ) ;
=======
    // InternalGreenhouse.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settings_2_0= ruleSetting ) )* ( (lv_greenhouses_3_0= ruleGreenhouse ) )* ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
<<<<<<< HEAD
        EObject lv_hardwareSetup_2_0 = null;
=======
        EObject lv_settings_2_0 = null;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

        EObject lv_greenhouses_3_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )* ) )
            // InternalGreenhouse.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )* )
            {
            // InternalGreenhouse.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )* )
            // InternalGreenhouse.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )? ( (lv_greenhouses_3_0= ruleGreenhouse ) )*
=======
            // InternalGreenhouse.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settings_2_0= ruleSetting ) )* ( (lv_greenhouses_3_0= ruleGreenhouse ) )* ) )
            // InternalGreenhouse.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settings_2_0= ruleSetting ) )* ( (lv_greenhouses_3_0= ruleGreenhouse ) )* )
            {
            // InternalGreenhouse.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settings_2_0= ruleSetting ) )* ( (lv_greenhouses_3_0= ruleGreenhouse ) )* )
            // InternalGreenhouse.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settings_2_0= ruleSetting ) )* ( (lv_greenhouses_3_0= ruleGreenhouse ) )*
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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

<<<<<<< HEAD
            // InternalGreenhouse.g:101:3: ( (lv_hardwareSetup_2_0= ruleHardwareSetup ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);
=======
            // InternalGreenhouse.g:101:3: ( (lv_settings_2_0= ruleSetting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
<<<<<<< HEAD
            	    // InternalGreenhouse.g:121:4: (lv_greenhouses_3_0= ruleGreenhouse )
            	    {
            	    // InternalGreenhouse.g:121:4: (lv_greenhouses_3_0= ruleGreenhouse )
            	    // InternalGreenhouse.g:122:5: lv_greenhouses_3_0= ruleGreenhouse
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getGreenhousesGreenhouseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_greenhouses_3_0=ruleGreenhouse();
=======
            	    // InternalGreenhouse.g:102:4: (lv_settings_2_0= ruleSetting )
            	    {
            	    // InternalGreenhouse.g:102:4: (lv_settings_2_0= ruleSetting )
            	    // InternalGreenhouse.g:103:5: lv_settings_2_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSettingsSettingParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_settings_2_0=ruleSetting();
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
<<<<<<< HEAD
            	    						"greenhouses",
            	    						lv_greenhouses_3_0,
            	    						"dsl.Greenhouse.Greenhouse");
=======
            	    						"settings",
            	    						lv_settings_2_0,
            	    						"dsl.Greenhouse.Setting");
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGreenhouse.g:120:3: ( (lv_greenhouses_3_0= ruleGreenhouse ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
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


<<<<<<< HEAD
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
=======
    // $ANTLR start "entryRuleSetting"
    // InternalGreenhouse.g:143:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalGreenhouse.g:143:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalGreenhouse.g:144:2: iv_ruleSetting= ruleSetting EOF
            {
             newCompositeNode(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetting=ruleSetting();

            state._fsp--;

             current =iv_ruleSetting; 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // $ANTLR end "entryRuleHardwareSetup"


    // $ANTLR start "ruleHardwareSetup"
    // InternalGreenhouse.g:150:1: ruleHardwareSetup returns [EObject current=null] : ( () otherlv_1= 'configuration' ( (lv_hardware_2_0= ruleHardware ) )* ) ;
    public final EObject ruleHardwareSetup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_hardware_2_0 = null;
=======
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalGreenhouse.g:150:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settingActuator_2_0= ruleSettingActuator ) ) ( (lv_settingSensor_3_0= ruleSettingSensor ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_settingActuator_2_0 = null;

        EObject lv_settingSensor_3_0 = null;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4



        	enterRule();

        try {
<<<<<<< HEAD
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

                if ( (LA3_0==13||LA3_0==20) ) {
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
            else if ( (LA4_0==20) ) {
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
=======
            // InternalGreenhouse.g:156:2: ( (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settingActuator_2_0= ruleSettingActuator ) ) ( (lv_settingSensor_3_0= ruleSettingSensor ) ) ) )
            // InternalGreenhouse.g:157:2: (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settingActuator_2_0= ruleSettingActuator ) ) ( (lv_settingSensor_3_0= ruleSettingSensor ) ) )
            {
            // InternalGreenhouse.g:157:2: (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settingActuator_2_0= ruleSettingActuator ) ) ( (lv_settingSensor_3_0= ruleSettingSensor ) ) )
            // InternalGreenhouse.g:158:3: otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) ( (lv_settingActuator_2_0= ruleSettingActuator ) ) ( (lv_settingSensor_3_0= ruleSettingSensor ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            // InternalGreenhouse.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalGreenhouse.g:180:3: ( (lv_settingActuator_2_0= ruleSettingActuator ) )
            // InternalGreenhouse.g:181:4: (lv_settingActuator_2_0= ruleSettingActuator )
            {
            // InternalGreenhouse.g:181:4: (lv_settingActuator_2_0= ruleSettingActuator )
            // InternalGreenhouse.g:182:5: lv_settingActuator_2_0= ruleSettingActuator
            {

            					newCompositeNode(grammarAccess.getSettingAccess().getSettingActuatorSettingActuatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_settingActuator_2_0=ruleSettingActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingRule());
            					}
            					add(
            						current,
            						"settingActuator",
            						lv_settingActuator_2_0,
            						"dsl.Greenhouse.SettingActuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:199:3: ( (lv_settingSensor_3_0= ruleSettingSensor ) )
            // InternalGreenhouse.g:200:4: (lv_settingSensor_3_0= ruleSettingSensor )
            {
            // InternalGreenhouse.g:200:4: (lv_settingSensor_3_0= ruleSettingSensor )
            // InternalGreenhouse.g:201:5: lv_settingSensor_3_0= ruleSettingSensor
            {

            					newCompositeNode(grammarAccess.getSettingAccess().getSettingSensorSettingSensorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_settingSensor_3_0=ruleSettingSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingRule());
            					}
            					add(
            						current,
            						"settingSensor",
            						lv_settingSensor_3_0,
            						"dsl.Greenhouse.SettingSensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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
<<<<<<< HEAD
    // $ANTLR end "ruleHardware"


    // $ANTLR start "entryRuleSettingActuator"
    // InternalGreenhouse.g:228:1: entryRuleSettingActuator returns [EObject current=null] : iv_ruleSettingActuator= ruleSettingActuator EOF ;
=======
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleSettingActuator"
    // InternalGreenhouse.g:222:1: entryRuleSettingActuator returns [EObject current=null] : iv_ruleSettingActuator= ruleSettingActuator EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleSettingActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingActuator = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:228:56: (iv_ruleSettingActuator= ruleSettingActuator EOF )
            // InternalGreenhouse.g:229:2: iv_ruleSettingActuator= ruleSettingActuator EOF
=======
            // InternalGreenhouse.g:222:56: (iv_ruleSettingActuator= ruleSettingActuator EOF )
            // InternalGreenhouse.g:223:2: iv_ruleSettingActuator= ruleSettingActuator EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:235:1: ruleSettingActuator returns [EObject current=null] : (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) ) ) ;
=======
    // InternalGreenhouse.g:229:1: ruleSettingActuator returns [EObject current=null] : (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleSettingActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_settingAction_4_0 = null;

        EObject lv_settingAction_6_0 = null;

        EObject lv_topic_10_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:241:2: ( (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) ) ) )
            // InternalGreenhouse.g:242:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) ) )
            {
            // InternalGreenhouse.g:242:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) ) )
            // InternalGreenhouse.g:243:3: otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) )
=======
            // InternalGreenhouse.g:235:2: ( (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) ) ) )
            // InternalGreenhouse.g:236:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) ) )
            {
            // InternalGreenhouse.g:236:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) ) )
            // InternalGreenhouse.g:237:3: otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* otherlv_7= 'and' otherlv_8= 'listens' otherlv_9= 'on' ( (lv_topic_10_0= ruleTopic ) )
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingActuatorAccess().getActuatorKeyword_0());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:248:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:249:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 
=======
            // InternalGreenhouse.g:241:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:242:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:242:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:243:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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

<<<<<<< HEAD
            otherlv_2=(Token)match(input,14,FOLLOW_8); 
=======
            otherlv_2=(Token)match(input,14,FOLLOW_9); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            			newLeafNode(otherlv_2, grammarAccess.getSettingActuatorAccess().getHasKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingActuatorAccess().getActionKeyword_3());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:273:3: ( (lv_settingAction_4_0= ruleSettingAction ) )
            // InternalGreenhouse.g:274:4: (lv_settingAction_4_0= ruleSettingAction )
            {
            // InternalGreenhouse.g:274:4: (lv_settingAction_4_0= ruleSettingAction )
            // InternalGreenhouse.g:275:5: lv_settingAction_4_0= ruleSettingAction
=======
            // InternalGreenhouse.g:267:3: ( (lv_settingAction_4_0= ruleSettingAction ) )
            // InternalGreenhouse.g:268:4: (lv_settingAction_4_0= ruleSettingAction )
            {
            // InternalGreenhouse.g:268:4: (lv_settingAction_4_0= ruleSettingAction )
            // InternalGreenhouse.g:269:5: lv_settingAction_4_0= ruleSettingAction
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					newCompositeNode(grammarAccess.getSettingActuatorAccess().getSettingActionSettingActionParserRuleCall_4_0());
            				
<<<<<<< HEAD
            pushFollow(FOLLOW_9);
=======
            pushFollow(FOLLOW_10);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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

<<<<<<< HEAD
            // InternalGreenhouse.g:292:3: (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGreenhouse.g:293:4: otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) )
=======
            // InternalGreenhouse.g:286:3: (otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGreenhouse.g:287:4: otherlv_5= ',' ( (lv_settingAction_6_0= ruleSettingAction ) )
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSettingActuatorAccess().getCommaKeyword_5_0());
            	    			
<<<<<<< HEAD
            	    // InternalGreenhouse.g:297:4: ( (lv_settingAction_6_0= ruleSettingAction ) )
            	    // InternalGreenhouse.g:298:5: (lv_settingAction_6_0= ruleSettingAction )
            	    {
            	    // InternalGreenhouse.g:298:5: (lv_settingAction_6_0= ruleSettingAction )
            	    // InternalGreenhouse.g:299:6: lv_settingAction_6_0= ruleSettingAction
=======
            	    // InternalGreenhouse.g:291:4: ( (lv_settingAction_6_0= ruleSettingAction ) )
            	    // InternalGreenhouse.g:292:5: (lv_settingAction_6_0= ruleSettingAction )
            	    {
            	    // InternalGreenhouse.g:292:5: (lv_settingAction_6_0= ruleSettingAction )
            	    // InternalGreenhouse.g:293:6: lv_settingAction_6_0= ruleSettingAction
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    {

            	    						newCompositeNode(grammarAccess.getSettingActuatorAccess().getSettingActionSettingActionParserRuleCall_5_1_0());
            	    					
<<<<<<< HEAD
            	    pushFollow(FOLLOW_9);
=======
            	    pushFollow(FOLLOW_10);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getSettingActuatorAccess().getAndKeyword_6());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getSettingActuatorAccess().getListensKeyword_7());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getSettingActuatorAccess().getOnKeyword_8());
            		
            // InternalGreenhouse.g:329:3: ( (lv_topic_10_0= ruleTopic ) )
            // InternalGreenhouse.g:330:4: (lv_topic_10_0= ruleTopic )
            {
            // InternalGreenhouse.g:330:4: (lv_topic_10_0= ruleTopic )
            // InternalGreenhouse.g:331:5: lv_topic_10_0= ruleTopic
=======
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getSettingActuatorAccess().getAndKeyword_6());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getSettingActuatorAccess().getListensKeyword_7());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getSettingActuatorAccess().getOnKeyword_8());
            		
            // InternalGreenhouse.g:323:3: ( (lv_topic_10_0= ruleTopic ) )
            // InternalGreenhouse.g:324:4: (lv_topic_10_0= ruleTopic )
            {
            // InternalGreenhouse.g:324:4: (lv_topic_10_0= ruleTopic )
            // InternalGreenhouse.g:325:5: lv_topic_10_0= ruleTopic
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					newCompositeNode(grammarAccess.getSettingActuatorAccess().getTopicTopicParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_topic_10_0=ruleTopic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingActuatorRule());
            					}
            					set(
            						current,
            						"topic",
            						lv_topic_10_0,
            						"dsl.Greenhouse.Topic");
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
    // $ANTLR end "ruleSettingActuator"


    // $ANTLR start "entryRuleSettingSensor"
<<<<<<< HEAD
    // InternalGreenhouse.g:352:1: entryRuleSettingSensor returns [EObject current=null] : iv_ruleSettingSensor= ruleSettingSensor EOF ;
=======
    // InternalGreenhouse.g:346:1: entryRuleSettingSensor returns [EObject current=null] : iv_ruleSettingSensor= ruleSettingSensor EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleSettingSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingSensor = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:352:54: (iv_ruleSettingSensor= ruleSettingSensor EOF )
            // InternalGreenhouse.g:353:2: iv_ruleSettingSensor= ruleSettingSensor EOF
=======
            // InternalGreenhouse.g:346:54: (iv_ruleSettingSensor= ruleSettingSensor EOF )
            // InternalGreenhouse.g:347:2: iv_ruleSettingSensor= ruleSettingSensor EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:359:1: ruleSettingSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) ) ) ;
=======
    // InternalGreenhouse.g:353:1: ruleSettingSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleSettingSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_topic_4_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:365:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) ) ) )
            // InternalGreenhouse.g:366:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) ) )
            {
            // InternalGreenhouse.g:366:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) ) )
            // InternalGreenhouse.g:367:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) )
=======
            // InternalGreenhouse.g:359:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) ) ) )
            // InternalGreenhouse.g:360:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) ) )
            {
            // InternalGreenhouse.g:360:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) ) )
            // InternalGreenhouse.g:361:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' otherlv_3= 'to' ( (lv_topic_4_0= ruleTopic ) )
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingSensorAccess().getSensorKeyword_0());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:371:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:372:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:372:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:373:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 
=======
            // InternalGreenhouse.g:365:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:366:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:366:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:367:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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

<<<<<<< HEAD
            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingSensorAccess().getPublishesKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingSensorAccess().getToKeyword_3());
            		
            // InternalGreenhouse.g:397:3: ( (lv_topic_4_0= ruleTopic ) )
            // InternalGreenhouse.g:398:4: (lv_topic_4_0= ruleTopic )
            {
            // InternalGreenhouse.g:398:4: (lv_topic_4_0= ruleTopic )
            // InternalGreenhouse.g:399:5: lv_topic_4_0= ruleTopic
=======
            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingSensorAccess().getPublishesKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingSensorAccess().getToKeyword_3());
            		
            // InternalGreenhouse.g:391:3: ( (lv_topic_4_0= ruleTopic ) )
            // InternalGreenhouse.g:392:4: (lv_topic_4_0= ruleTopic )
            {
            // InternalGreenhouse.g:392:4: (lv_topic_4_0= ruleTopic )
            // InternalGreenhouse.g:393:5: lv_topic_4_0= ruleTopic
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					newCompositeNode(grammarAccess.getSettingSensorAccess().getTopicTopicParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_topic_4_0=ruleTopic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingSensorRule());
            					}
            					set(
            						current,
            						"topic",
            						lv_topic_4_0,
            						"dsl.Greenhouse.Topic");
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


    // $ANTLR start "entryRuleTopic"
<<<<<<< HEAD
    // InternalGreenhouse.g:420:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
=======
    // InternalGreenhouse.g:414:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:420:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalGreenhouse.g:421:2: iv_ruleTopic= ruleTopic EOF
=======
            // InternalGreenhouse.g:414:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalGreenhouse.g:415:2: iv_ruleTopic= ruleTopic EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
<<<<<<< HEAD
    // InternalGreenhouse.g:427:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ) ;
=======
    // InternalGreenhouse.g:421:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:433:2: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:434:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:434:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:435:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) )
=======
            // InternalGreenhouse.g:427:2: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:428:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:428:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:429:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) )
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:439:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:440:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:440:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:441:5: lv_name_1_0= RULE_ID
=======
            // InternalGreenhouse.g:433:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:434:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:434:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:435:5: lv_name_1_0= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicRule());
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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleSettingAction"
<<<<<<< HEAD
    // InternalGreenhouse.g:461:1: entryRuleSettingAction returns [EObject current=null] : iv_ruleSettingAction= ruleSettingAction EOF ;
=======
    // InternalGreenhouse.g:455:1: entryRuleSettingAction returns [EObject current=null] : iv_ruleSettingAction= ruleSettingAction EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleSettingAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingAction = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:461:54: (iv_ruleSettingAction= ruleSettingAction EOF )
            // InternalGreenhouse.g:462:2: iv_ruleSettingAction= ruleSettingAction EOF
=======
            // InternalGreenhouse.g:455:54: (iv_ruleSettingAction= ruleSettingAction EOF )
            // InternalGreenhouse.g:456:2: iv_ruleSettingAction= ruleSettingAction EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:468:1: ruleSettingAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* ) ;
=======
    // InternalGreenhouse.g:462:1: ruleSettingAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            // InternalGreenhouse.g:474:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* ) )
            // InternalGreenhouse.g:475:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* )
            {
            // InternalGreenhouse.g:475:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* )
            // InternalGreenhouse.g:476:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )*
            {
            // InternalGreenhouse.g:476:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:477:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:477:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:478:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 
=======
            // InternalGreenhouse.g:468:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* ) )
            // InternalGreenhouse.g:469:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* )
            {
            // InternalGreenhouse.g:469:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* )
            // InternalGreenhouse.g:470:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )*
            {
            // InternalGreenhouse.g:470:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:471:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:471:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:472:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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

<<<<<<< HEAD
            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingActionAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingActionAccess().getValuesKeyword_2());
            		
            // InternalGreenhouse.g:502:3: ( (lv_settingValue_3_0= ruleSettingValue ) )
            // InternalGreenhouse.g:503:4: (lv_settingValue_3_0= ruleSettingValue )
            {
            // InternalGreenhouse.g:503:4: (lv_settingValue_3_0= ruleSettingValue )
            // InternalGreenhouse.g:504:5: lv_settingValue_3_0= ruleSettingValue
=======
            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingActionAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingActionAccess().getValuesKeyword_2());
            		
            // InternalGreenhouse.g:496:3: ( (lv_settingValue_3_0= ruleSettingValue ) )
            // InternalGreenhouse.g:497:4: (lv_settingValue_3_0= ruleSettingValue )
            {
            // InternalGreenhouse.g:497:4: (lv_settingValue_3_0= ruleSettingValue )
            // InternalGreenhouse.g:498:5: lv_settingValue_3_0= ruleSettingValue
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					newCompositeNode(grammarAccess.getSettingActionAccess().getSettingValueSettingValueParserRuleCall_3_0());
            				
<<<<<<< HEAD
            pushFollow(FOLLOW_18);
=======
            pushFollow(FOLLOW_19);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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

<<<<<<< HEAD
            // InternalGreenhouse.g:521:3: (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_INT) ) {
                        alt6=1;
=======
            // InternalGreenhouse.g:515:3: (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_INT) ) {
                        alt4=1;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                    }


                }


<<<<<<< HEAD
                switch (alt6) {
            	case 1 :
            	    // InternalGreenhouse.g:522:4: otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSettingActionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGreenhouse.g:526:4: ( (lv_settingValue_5_0= ruleSettingValue ) )
            	    // InternalGreenhouse.g:527:5: (lv_settingValue_5_0= ruleSettingValue )
            	    {
            	    // InternalGreenhouse.g:527:5: (lv_settingValue_5_0= ruleSettingValue )
            	    // InternalGreenhouse.g:528:6: lv_settingValue_5_0= ruleSettingValue
=======
                switch (alt4) {
            	case 1 :
            	    // InternalGreenhouse.g:516:4: otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSettingActionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGreenhouse.g:520:4: ( (lv_settingValue_5_0= ruleSettingValue ) )
            	    // InternalGreenhouse.g:521:5: (lv_settingValue_5_0= ruleSettingValue )
            	    {
            	    // InternalGreenhouse.g:521:5: (lv_settingValue_5_0= ruleSettingValue )
            	    // InternalGreenhouse.g:522:6: lv_settingValue_5_0= ruleSettingValue
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    {

            	    						newCompositeNode(grammarAccess.getSettingActionAccess().getSettingValueSettingValueParserRuleCall_4_1_0());
            	    					
<<<<<<< HEAD
            	    pushFollow(FOLLOW_18);
=======
            	    pushFollow(FOLLOW_19);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            	    break loop6;
=======
            	    break loop4;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:550:1: entryRuleSettingValue returns [EObject current=null] : iv_ruleSettingValue= ruleSettingValue EOF ;
=======
    // InternalGreenhouse.g:544:1: entryRuleSettingValue returns [EObject current=null] : iv_ruleSettingValue= ruleSettingValue EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleSettingValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingValue = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:550:53: (iv_ruleSettingValue= ruleSettingValue EOF )
            // InternalGreenhouse.g:551:2: iv_ruleSettingValue= ruleSettingValue EOF
=======
            // InternalGreenhouse.g:544:53: (iv_ruleSettingValue= ruleSettingValue EOF )
            // InternalGreenhouse.g:545:2: iv_ruleSettingValue= ruleSettingValue EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:557:1: ruleSettingValue returns [EObject current=null] : ( (lv_name_0_0= RULE_INT ) ) ;
=======
    // InternalGreenhouse.g:551:1: ruleSettingValue returns [EObject current=null] : ( (lv_name_0_0= RULE_INT ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleSettingValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:563:2: ( ( (lv_name_0_0= RULE_INT ) ) )
            // InternalGreenhouse.g:564:2: ( (lv_name_0_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:564:2: ( (lv_name_0_0= RULE_INT ) )
            // InternalGreenhouse.g:565:3: (lv_name_0_0= RULE_INT )
            {
            // InternalGreenhouse.g:565:3: (lv_name_0_0= RULE_INT )
            // InternalGreenhouse.g:566:4: lv_name_0_0= RULE_INT
=======
            // InternalGreenhouse.g:557:2: ( ( (lv_name_0_0= RULE_INT ) ) )
            // InternalGreenhouse.g:558:2: ( (lv_name_0_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:558:2: ( (lv_name_0_0= RULE_INT ) )
            // InternalGreenhouse.g:559:3: (lv_name_0_0= RULE_INT )
            {
            // InternalGreenhouse.g:559:3: (lv_name_0_0= RULE_INT )
            // InternalGreenhouse.g:560:4: lv_name_0_0= RULE_INT
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSettingValueAccess().getNameINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSettingValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
<<<<<<< HEAD
    // InternalGreenhouse.g:585:1: entryRuleGreenhouse returns [EObject current=null] : iv_ruleGreenhouse= ruleGreenhouse EOF ;
=======
    // InternalGreenhouse.g:579:1: entryRuleGreenhouse returns [EObject current=null] : iv_ruleGreenhouse= ruleGreenhouse EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleGreenhouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouse = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:585:51: (iv_ruleGreenhouse= ruleGreenhouse EOF )
            // InternalGreenhouse.g:586:2: iv_ruleGreenhouse= ruleGreenhouse EOF
=======
            // InternalGreenhouse.g:579:51: (iv_ruleGreenhouse= ruleGreenhouse EOF )
            // InternalGreenhouse.g:580:2: iv_ruleGreenhouse= ruleGreenhouse EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:592:1: ruleGreenhouse returns [EObject current=null] : (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* ) ;
=======
    // InternalGreenhouse.g:586:1: ruleGreenhouse returns [EObject current=null] : (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleGreenhouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_row_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:598:2: ( (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* ) )
            // InternalGreenhouse.g:599:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* )
            {
            // InternalGreenhouse.g:599:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* )
            // InternalGreenhouse.g:600:3: otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )*
=======
            // InternalGreenhouse.g:592:2: ( (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* ) )
            // InternalGreenhouse.g:593:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* )
            {
            // InternalGreenhouse.g:593:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* )
            // InternalGreenhouse.g:594:3: otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )*
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseAccess().getGreenhouseKeyword_0());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:604:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:605:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:605:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:606:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 
=======
            // InternalGreenhouse.g:598:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:599:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:599:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:600:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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

<<<<<<< HEAD
            // InternalGreenhouse.g:622:3: ( (lv_row_2_0= ruleRow ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGreenhouse.g:623:4: (lv_row_2_0= ruleRow )
            	    {
            	    // InternalGreenhouse.g:623:4: (lv_row_2_0= ruleRow )
            	    // InternalGreenhouse.g:624:5: lv_row_2_0= ruleRow
=======
            // InternalGreenhouse.g:616:3: ( (lv_row_2_0= ruleRow ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGreenhouse.g:617:4: (lv_row_2_0= ruleRow )
            	    {
            	    // InternalGreenhouse.g:617:4: (lv_row_2_0= ruleRow )
            	    // InternalGreenhouse.g:618:5: lv_row_2_0= ruleRow
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    {

            	    					newCompositeNode(grammarAccess.getGreenhouseAccess().getRowRowParserRuleCall_2_0());
            	    				
<<<<<<< HEAD
            	    pushFollow(FOLLOW_19);
=======
            	    pushFollow(FOLLOW_20);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            	    break loop7;
                }
            } while (true);

            // InternalGreenhouse.g:641:3: ( (lv_elements_3_0= ruleGreenhouseElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGreenhouse.g:642:4: (lv_elements_3_0= ruleGreenhouseElement )
            	    {
            	    // InternalGreenhouse.g:642:4: (lv_elements_3_0= ruleGreenhouseElement )
            	    // InternalGreenhouse.g:643:5: lv_elements_3_0= ruleGreenhouseElement
=======
            	    break loop5;
                }
            } while (true);

            // InternalGreenhouse.g:635:3: ( (lv_elements_3_0= ruleGreenhouseElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGreenhouse.g:636:4: (lv_elements_3_0= ruleGreenhouseElement )
            	    {
            	    // InternalGreenhouse.g:636:4: (lv_elements_3_0= ruleGreenhouseElement )
            	    // InternalGreenhouse.g:637:5: lv_elements_3_0= ruleGreenhouseElement
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    {

            	    					newCompositeNode(grammarAccess.getGreenhouseAccess().getElementsGreenhouseElementParserRuleCall_3_0());
            	    				
<<<<<<< HEAD
            	    pushFollow(FOLLOW_20);
=======
            	    pushFollow(FOLLOW_21);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            	    break loop8;
=======
            	    break loop6;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:664:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
=======
    // InternalGreenhouse.g:658:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:664:44: (iv_ruleRow= ruleRow EOF )
            // InternalGreenhouse.g:665:2: iv_ruleRow= ruleRow EOF
=======
            // InternalGreenhouse.g:658:44: (iv_ruleRow= ruleRow EOF )
            // InternalGreenhouse.g:659:2: iv_ruleRow= ruleRow EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:671:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* ) ;
=======
    // InternalGreenhouse.g:665:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:677:2: ( (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* ) )
            // InternalGreenhouse.g:678:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* )
            {
            // InternalGreenhouse.g:678:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* )
            // InternalGreenhouse.g:679:3: otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )*
=======
            // InternalGreenhouse.g:671:2: ( (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* ) )
            // InternalGreenhouse.g:672:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* )
            {
            // InternalGreenhouse.g:672:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* )
            // InternalGreenhouse.g:673:3: otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )*
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:683:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:684:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:684:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:685:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 
=======
            // InternalGreenhouse.g:677:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:678:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:678:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:679:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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

<<<<<<< HEAD
            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getIncludesKeyword_2());
            		
            // InternalGreenhouse.g:705:3: ( (lv_elements_3_0= ruleRowElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==20||LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGreenhouse.g:706:4: (lv_elements_3_0= ruleRowElement )
            	    {
            	    // InternalGreenhouse.g:706:4: (lv_elements_3_0= ruleRowElement )
            	    // InternalGreenhouse.g:707:5: lv_elements_3_0= ruleRowElement
=======
            otherlv_2=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getIncludesKeyword_2());
            		
            // InternalGreenhouse.g:699:3: ( (lv_elements_3_0= ruleRowElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13||LA7_0==20||LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGreenhouse.g:700:4: (lv_elements_3_0= ruleRowElement )
            	    {
            	    // InternalGreenhouse.g:700:4: (lv_elements_3_0= ruleRowElement )
            	    // InternalGreenhouse.g:701:5: lv_elements_3_0= ruleRowElement
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementsRowElementParserRuleCall_3_0());
            	    				
<<<<<<< HEAD
            	    pushFollow(FOLLOW_22);
=======
            	    pushFollow(FOLLOW_23);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            	    break loop9;
=======
            	    break loop7;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:728:1: entryRuleGreenhouseElement returns [EObject current=null] : iv_ruleGreenhouseElement= ruleGreenhouseElement EOF ;
=======
    // InternalGreenhouse.g:722:1: entryRuleGreenhouseElement returns [EObject current=null] : iv_ruleGreenhouseElement= ruleGreenhouseElement EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleGreenhouseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseElement = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:728:58: (iv_ruleGreenhouseElement= ruleGreenhouseElement EOF )
            // InternalGreenhouse.g:729:2: iv_ruleGreenhouseElement= ruleGreenhouseElement EOF
=======
            // InternalGreenhouse.g:722:58: (iv_ruleGreenhouseElement= ruleGreenhouseElement EOF )
            // InternalGreenhouse.g:723:2: iv_ruleGreenhouseElement= ruleGreenhouseElement EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:735:1: ruleGreenhouseElement returns [EObject current=null] : (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet ) ;
=======
    // InternalGreenhouse.g:729:1: ruleGreenhouseElement returns [EObject current=null] : (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleGreenhouseElement() throws RecognitionException {
        EObject current = null;

        EObject this_GreenhouseSensor_0 = null;

        EObject this_GreenhouseActuator_1 = null;

        EObject this_GreenhouseRuleSet_2 = null;



        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:741:2: ( (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet ) )
            // InternalGreenhouse.g:742:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )
            {
            // InternalGreenhouse.g:742:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt10=1;
                    }
                    break;
                case 41:
                    {
                    alt10=3;
=======
            // InternalGreenhouse.g:735:2: ( (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet ) )
            // InternalGreenhouse.g:736:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )
            {
            // InternalGreenhouse.g:736:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt8=3;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                    }
                    break;
                case 13:
                    {
<<<<<<< HEAD
                    alt10=2;
=======
                    alt8=2;
                    }
                    break;
                case 20:
                    {
                    alt8=1;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                    }
                    break;
                default:
                    NoViableAltException nvae =
<<<<<<< HEAD
                        new NoViableAltException("", 10, 1, input);
=======
                        new NoViableAltException("", 8, 1, input);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
<<<<<<< HEAD
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGreenhouse.g:743:3: this_GreenhouseSensor_0= ruleGreenhouseSensor
=======
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGreenhouse.g:737:3: this_GreenhouseSensor_0= ruleGreenhouseSensor
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
                    // InternalGreenhouse.g:752:3: this_GreenhouseActuator_1= ruleGreenhouseActuator
=======
                    // InternalGreenhouse.g:746:3: this_GreenhouseActuator_1= ruleGreenhouseActuator
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
                    // InternalGreenhouse.g:761:3: this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet
=======
                    // InternalGreenhouse.g:755:3: this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:773:1: entryRuleRowElement returns [EObject current=null] : iv_ruleRowElement= ruleRowElement EOF ;
=======
    // InternalGreenhouse.g:767:1: entryRuleRowElement returns [EObject current=null] : iv_ruleRowElement= ruleRowElement EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleRowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowElement = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:773:51: (iv_ruleRowElement= ruleRowElement EOF )
            // InternalGreenhouse.g:774:2: iv_ruleRowElement= ruleRowElement EOF
=======
            // InternalGreenhouse.g:767:51: (iv_ruleRowElement= ruleRowElement EOF )
            // InternalGreenhouse.g:768:2: iv_ruleRowElement= ruleRowElement EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:780:1: ruleRowElement returns [EObject current=null] : (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet ) ;
=======
    // InternalGreenhouse.g:774:1: ruleRowElement returns [EObject current=null] : (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleRowElement() throws RecognitionException {
        EObject current = null;

        EObject this_RowSensor_0 = null;

        EObject this_RowActuator_1 = null;

        EObject this_RowRuleSet_2 = null;



        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:786:2: ( (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet ) )
            // InternalGreenhouse.g:787:2: (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet )
            {
            // InternalGreenhouse.g:787:2: (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
=======
            // InternalGreenhouse.g:780:2: ( (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet ) )
            // InternalGreenhouse.g:781:2: (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet )
            {
            // InternalGreenhouse.g:781:2: (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                }
                break;
            case 41:
                {
<<<<<<< HEAD
                alt11=3;
=======
                alt9=3;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                }
                break;
            default:
                NoViableAltException nvae =
<<<<<<< HEAD
                    new NoViableAltException("", 11, 0, input);
=======
                    new NoViableAltException("", 9, 0, input);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

                throw nvae;
            }

<<<<<<< HEAD
            switch (alt11) {
                case 1 :
                    // InternalGreenhouse.g:788:3: this_RowSensor_0= ruleRowSensor
=======
            switch (alt9) {
                case 1 :
                    // InternalGreenhouse.g:782:3: this_RowSensor_0= ruleRowSensor
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
                    // InternalGreenhouse.g:797:3: this_RowActuator_1= ruleRowActuator
=======
                    // InternalGreenhouse.g:791:3: this_RowActuator_1= ruleRowActuator
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
                    // InternalGreenhouse.g:806:3: this_RowRuleSet_2= ruleRowRuleSet
=======
                    // InternalGreenhouse.g:800:3: this_RowRuleSet_2= ruleRowRuleSet
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:818:1: entryRuleGreenhouseActuator returns [EObject current=null] : iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF ;
=======
    // InternalGreenhouse.g:812:1: entryRuleGreenhouseActuator returns [EObject current=null] : iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleGreenhouseActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseActuator = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:818:59: (iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF )
            // InternalGreenhouse.g:819:2: iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF
=======
            // InternalGreenhouse.g:812:59: (iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF )
            // InternalGreenhouse.g:813:2: iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:825:1: ruleGreenhouseActuator returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )* ) ;
=======
    // InternalGreenhouse.g:819:1: ruleGreenhouseActuator returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )* ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            // InternalGreenhouse.g:831:2: ( (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:832:2: (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:832:2: (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:833:3: otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 
=======
            // InternalGreenhouse.g:825:2: ( (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:826:2: (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:826:2: (otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:827:3: otherlv_0= 'global' otherlv_1= 'actuator' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )? (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseActuatorAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreenhouseActuatorAccess().getActuatorKeyword_1());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:841:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:842:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:842:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:843:5: lv_name_2_0= RULE_ID
=======
            // InternalGreenhouse.g:835:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:836:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:836:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:837:5: lv_name_2_0= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

<<<<<<< HEAD
            // InternalGreenhouse.g:859:3: (otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGreenhouse.g:860:4: otherlv_3= 'will' ( (lv_action_4_0= ruleAction ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGreenhouseActuatorAccess().getWillKeyword_3_0());
                    			
                    // InternalGreenhouse.g:864:4: ( (lv_action_4_0= ruleAction ) )
                    // InternalGreenhouse.g:865:5: (lv_action_4_0= ruleAction )
                    {
                    // InternalGreenhouse.g:865:5: (lv_action_4_0= ruleAction )
                    // InternalGreenhouse.g:866:6: lv_action_4_0= ruleAction
=======
            // InternalGreenhouse.g:853:3: (otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGreenhouse.g:854:4: otherlv_3= 'can' ( (lv_action_4_0= ruleAction ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGreenhouseActuatorAccess().getCanKeyword_3_0());
                    			
                    // InternalGreenhouse.g:858:4: ( (lv_action_4_0= ruleAction ) )
                    // InternalGreenhouse.g:859:5: (lv_action_4_0= ruleAction )
                    {
                    // InternalGreenhouse.g:859:5: (lv_action_4_0= ruleAction )
                    // InternalGreenhouse.g:860:6: lv_action_4_0= ruleAction
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                    {

                    						newCompositeNode(grammarAccess.getGreenhouseActuatorAccess().getActionActionParserRuleCall_3_1_0());
                    					
<<<<<<< HEAD
                    pushFollow(FOLLOW_18);
=======
                    pushFollow(FOLLOW_19);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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

<<<<<<< HEAD
            // InternalGreenhouse.g:884:3: (otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGreenhouse.g:885:4: otherlv_5= ',' otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) )
=======
            // InternalGreenhouse.g:878:3: (otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGreenhouse.g:879:4: otherlv_5= ',' otherlv_6= 'can' ( (lv_action_7_0= ruleAction ) )
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_25); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGreenhouseActuatorAccess().getCommaKeyword_4_0());
            	    			
            	    otherlv_6=(Token)match(input,30,FOLLOW_3); 

<<<<<<< HEAD
            	    				newLeafNode(otherlv_6, grammarAccess.getGreenhouseActuatorAccess().getWillKeyword_4_1());
            	    			
            	    // InternalGreenhouse.g:893:4: ( (lv_action_7_0= ruleAction ) )
            	    // InternalGreenhouse.g:894:5: (lv_action_7_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:894:5: (lv_action_7_0= ruleAction )
            	    // InternalGreenhouse.g:895:6: lv_action_7_0= ruleAction
=======
            	    				newLeafNode(otherlv_6, grammarAccess.getGreenhouseActuatorAccess().getCanKeyword_4_1());
            	    			
            	    // InternalGreenhouse.g:887:4: ( (lv_action_7_0= ruleAction ) )
            	    // InternalGreenhouse.g:888:5: (lv_action_7_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:888:5: (lv_action_7_0= ruleAction )
            	    // InternalGreenhouse.g:889:6: lv_action_7_0= ruleAction
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseActuatorAccess().getActionActionParserRuleCall_4_2_0());
            	    					
<<<<<<< HEAD
            	    pushFollow(FOLLOW_18);
=======
            	    pushFollow(FOLLOW_19);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            	    break loop13;
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
    // InternalGreenhouse.g:917:1: entryRuleRowActuator returns [EObject current=null] : iv_ruleRowActuator= ruleRowActuator EOF ;
    public final EObject entryRuleRowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowActuator = null;


        try {
            // InternalGreenhouse.g:917:52: (iv_ruleRowActuator= ruleRowActuator EOF )
            // InternalGreenhouse.g:918:2: iv_ruleRowActuator= ruleRowActuator EOF
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
    // InternalGreenhouse.g:924:1: ruleRowActuator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )* ) ;
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
            // InternalGreenhouse.g:930:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:931:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:931:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:932:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )*
            {
            // InternalGreenhouse.g:932:3: ( (otherlv_0= RULE_ID ) )
            // InternalGreenhouse.g:933:4: (otherlv_0= RULE_ID )
            {
            // InternalGreenhouse.g:933:4: (otherlv_0= RULE_ID )
            // InternalGreenhouse.g:934:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowActuatorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getRowActuatorAccess().getTypeSettingActuatorCrossReference_0_0());
            				

            }


            }

            // InternalGreenhouse.g:945:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:946:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:946:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:947:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalGreenhouse.g:963:3: (otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGreenhouse.g:964:4: otherlv_2= 'will' ( (lv_action_3_0= ruleAction ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRowActuatorAccess().getWillKeyword_2_0());
                    			
                    // InternalGreenhouse.g:968:4: ( (lv_action_3_0= ruleAction ) )
                    // InternalGreenhouse.g:969:5: (lv_action_3_0= ruleAction )
                    {
                    // InternalGreenhouse.g:969:5: (lv_action_3_0= ruleAction )
                    // InternalGreenhouse.g:970:6: lv_action_3_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRowActuatorAccess().getActionActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalGreenhouse.g:988:3: (otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGreenhouse.g:989:4: otherlv_4= ',' otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_25); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRowActuatorAccess().getCommaKeyword_3_0());
            	    			
            	    otherlv_5=(Token)match(input,30,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRowActuatorAccess().getWillKeyword_3_1());
            	    			
            	    // InternalGreenhouse.g:997:4: ( (lv_action_6_0= ruleAction ) )
            	    // InternalGreenhouse.g:998:5: (lv_action_6_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:998:5: (lv_action_6_0= ruleAction )
            	    // InternalGreenhouse.g:999:6: lv_action_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getRowActuatorAccess().getActionActionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
    // $ANTLR end "ruleRowActuator"


    // $ANTLR start "entryRuleGreenhouseSensor"
    // InternalGreenhouse.g:1021:1: entryRuleGreenhouseSensor returns [EObject current=null] : iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF ;
    public final EObject entryRuleGreenhouseSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseSensor = null;


        try {
            // InternalGreenhouse.g:1021:57: (iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF )
            // InternalGreenhouse.g:1022:2: iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF
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
    // InternalGreenhouse.g:1028:1: ruleGreenhouseSensor returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) ;
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
            // InternalGreenhouse.g:1034:2: ( (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:1035:2: (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:1035:2: (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            // InternalGreenhouse.g:1036:3: otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseSensorAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreenhouseSensorAccess().getSensorKeyword_1());
            		
            // InternalGreenhouse.g:1044:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:1045:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:1045:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:1046:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseSensorAccess().getHasKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getGreenhouseSensorAccess().getValueKeyword_4());
            		
            // InternalGreenhouse.g:1070:3: ( (lv_variable_5_0= ruleVariable ) )
            // InternalGreenhouse.g:1071:4: (lv_variable_5_0= ruleVariable )
            {
            // InternalGreenhouse.g:1071:4: (lv_variable_5_0= ruleVariable )
            // InternalGreenhouse.g:1072:5: lv_variable_5_0= ruleVariable
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

            // InternalGreenhouse.g:1089:3: ( (lv_states_6_0= ruleState ) )
            // InternalGreenhouse.g:1090:4: (lv_states_6_0= ruleState )
            {
            // InternalGreenhouse.g:1090:4: (lv_states_6_0= ruleState )
            // InternalGreenhouse.g:1091:5: lv_states_6_0= ruleState
            {

            					newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalGreenhouse.g:1108:3: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGreenhouse.g:1109:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getGreenhouseSensorAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGreenhouse.g:1113:4: ( (lv_states_8_0= ruleState ) )
            	    // InternalGreenhouse.g:1114:5: (lv_states_8_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:1114:5: (lv_states_8_0= ruleState )
            	    // InternalGreenhouse.g:1115:6: lv_states_8_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop16;
=======
            	    break loop11;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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


<<<<<<< HEAD
    // $ANTLR start "entryRuleRowSensor"
    // InternalGreenhouse.g:1137:1: entryRuleRowSensor returns [EObject current=null] : iv_ruleRowSensor= ruleRowSensor EOF ;
    public final EObject entryRuleRowSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowSensor = null;


        try {
            // InternalGreenhouse.g:1137:50: (iv_ruleRowSensor= ruleRowSensor EOF )
            // InternalGreenhouse.g:1138:2: iv_ruleRowSensor= ruleRowSensor EOF
            {
             newCompositeNode(grammarAccess.getRowSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowSensor=ruleRowSensor();

            state._fsp--;

             current =iv_ruleRowSensor; 
=======
    // $ANTLR start "entryRuleRowActuator"
    // InternalGreenhouse.g:911:1: entryRuleRowActuator returns [EObject current=null] : iv_ruleRowActuator= ruleRowActuator EOF ;
    public final EObject entryRuleRowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowActuator = null;


        try {
            // InternalGreenhouse.g:911:52: (iv_ruleRowActuator= ruleRowActuator EOF )
            // InternalGreenhouse.g:912:2: iv_ruleRowActuator= ruleRowActuator EOF
            {
             newCompositeNode(grammarAccess.getRowActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowActuator=ruleRowActuator();

            state._fsp--;

             current =iv_ruleRowActuator; 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // $ANTLR end "entryRuleRowSensor"


    // $ANTLR start "ruleRowSensor"
    // InternalGreenhouse.g:1144:1: ruleRowSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) ;
    public final EObject ruleRowSensor() throws RecognitionException {
=======
    // $ANTLR end "entryRuleRowActuator"


    // $ANTLR start "ruleRowActuator"
    // InternalGreenhouse.g:918:1: ruleRowActuator returns [EObject current=null] : (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )* ) ;
    public final EObject ruleRowActuator() throws RecognitionException {
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            // InternalGreenhouse.g:1150:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:1151:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:1151:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            // InternalGreenhouse.g:1152:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRowSensorAccess().getSensorKeyword_0());
            		
            // InternalGreenhouse.g:1156:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1157:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1157:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1158:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRowSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowSensorRule());
=======
            // InternalGreenhouse.g:924:2: ( (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:925:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:925:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:926:3: otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )? (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRowActuatorAccess().getActuatorKeyword_0());
            		
            // InternalGreenhouse.g:930:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:931:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:931:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:932:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRowActuatorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowActuatorRule());
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

<<<<<<< HEAD
            otherlv_2=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getRowSensorAccess().getHasKeyword_2());
            		
            // InternalGreenhouse.g:1178:3: ( (lv_variable_3_0= ruleVariable ) )
            // InternalGreenhouse.g:1179:4: (lv_variable_3_0= ruleVariable )
            {
            // InternalGreenhouse.g:1179:4: (lv_variable_3_0= ruleVariable )
            // InternalGreenhouse.g:1180:5: lv_variable_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getRowSensorAccess().getVariableVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_variable_3_0=ruleVariable();
=======
            // InternalGreenhouse.g:948:3: (otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGreenhouse.g:949:4: otherlv_2= 'can' ( (lv_action_3_0= ruleAction ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRowActuatorAccess().getCanKeyword_2_0());
                    			
                    // InternalGreenhouse.g:953:4: ( (lv_action_3_0= ruleAction ) )
                    // InternalGreenhouse.g:954:5: (lv_action_3_0= ruleAction )
                    {
                    // InternalGreenhouse.g:954:5: (lv_action_3_0= ruleAction )
                    // InternalGreenhouse.g:955:6: lv_action_3_0= ruleAction
                    {
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

                    						newCompositeNode(grammarAccess.getRowActuatorAccess().getActionActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_action_3_0=ruleAction();

                    state._fsp--;


<<<<<<< HEAD
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

            otherlv_4=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getRowSensorAccess().getAndKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRowSensorAccess().getStatesKeyword_5());
            		
            // InternalGreenhouse.g:1205:3: ( (lv_states_6_0= ruleState ) )
            // InternalGreenhouse.g:1206:4: (lv_states_6_0= ruleState )
            {
            // InternalGreenhouse.g:1206:4: (lv_states_6_0= ruleState )
            // InternalGreenhouse.g:1207:5: lv_states_6_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRowSensorAccess().getStatesStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalGreenhouse.g:1224:3: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGreenhouse.g:1225:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRowSensorAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGreenhouse.g:1229:4: ( (lv_states_8_0= ruleState ) )
            	    // InternalGreenhouse.g:1230:5: (lv_states_8_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:1230:5: (lv_states_8_0= ruleState )
            	    // InternalGreenhouse.g:1231:6: lv_states_8_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getRowSensorAccess().getStatesStateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_states_8_0=ruleState();
=======
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

            // InternalGreenhouse.g:973:3: (otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGreenhouse.g:974:4: otherlv_4= ',' otherlv_5= 'can' ( (lv_action_6_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_25); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRowActuatorAccess().getCommaKeyword_3_0());
            	    			
            	    otherlv_5=(Token)match(input,30,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRowActuatorAccess().getCanKeyword_3_1());
            	    			
            	    // InternalGreenhouse.g:982:4: ( (lv_action_6_0= ruleAction ) )
            	    // InternalGreenhouse.g:983:5: (lv_action_6_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:983:5: (lv_action_6_0= ruleAction )
            	    // InternalGreenhouse.g:984:6: lv_action_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getRowActuatorAccess().getActionActionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_action_6_0=ruleAction();
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            	    state._fsp--;


            	    						if (current==null) {
<<<<<<< HEAD
            	    							current = createModelElementForParent(grammarAccess.getRowSensorRule());
=======
            	    							current = createModelElementForParent(grammarAccess.getRowActuatorRule());
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            	    break loop17;
=======
            	    break loop13;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
=======
    // $ANTLR end "ruleRowActuator"


    // $ANTLR start "entryRuleGreenhouseSensor"
    // InternalGreenhouse.g:1006:1: entryRuleGreenhouseSensor returns [EObject current=null] : iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF ;
    public final EObject entryRuleGreenhouseSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseSensor = null;


        try {
            // InternalGreenhouse.g:1006:57: (iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF )
            // InternalGreenhouse.g:1007:2: iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF
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
    // InternalGreenhouse.g:1013:1: ruleGreenhouseSensor returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) ;
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
            // InternalGreenhouse.g:1019:2: ( (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:1020:2: (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:1020:2: (otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            // InternalGreenhouse.g:1021:3: otherlv_0= 'global' otherlv_1= 'sensor' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'has' otherlv_4= 'value' ( (lv_variable_5_0= ruleVariable ) ) ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseSensorAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreenhouseSensorAccess().getSensorKeyword_1());
            		
            // InternalGreenhouse.g:1029:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:1030:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:1030:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:1031:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseSensorAccess().getHasKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getGreenhouseSensorAccess().getValueKeyword_4());
            		
            // InternalGreenhouse.g:1055:3: ( (lv_variable_5_0= ruleVariable ) )
            // InternalGreenhouse.g:1056:4: (lv_variable_5_0= ruleVariable )
            {
            // InternalGreenhouse.g:1056:4: (lv_variable_5_0= ruleVariable )
            // InternalGreenhouse.g:1057:5: lv_variable_5_0= ruleVariable
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

            // InternalGreenhouse.g:1074:3: ( (lv_states_6_0= ruleState ) )
            // InternalGreenhouse.g:1075:4: (lv_states_6_0= ruleState )
            {
            // InternalGreenhouse.g:1075:4: (lv_states_6_0= ruleState )
            // InternalGreenhouse.g:1076:5: lv_states_6_0= ruleState
            {

            					newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalGreenhouse.g:1093:3: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGreenhouse.g:1094:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getGreenhouseSensorAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGreenhouse.g:1098:4: ( (lv_states_8_0= ruleState ) )
            	    // InternalGreenhouse.g:1099:5: (lv_states_8_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:1099:5: (lv_states_8_0= ruleState )
            	    // InternalGreenhouse.g:1100:6: lv_states_8_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop14;
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
    // InternalGreenhouse.g:1122:1: entryRuleRowSensor returns [EObject current=null] : iv_ruleRowSensor= ruleRowSensor EOF ;
    public final EObject entryRuleRowSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowSensor = null;


        try {
            // InternalGreenhouse.g:1122:50: (iv_ruleRowSensor= ruleRowSensor EOF )
            // InternalGreenhouse.g:1123:2: iv_ruleRowSensor= ruleRowSensor EOF
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
    // InternalGreenhouse.g:1129:1: ruleRowSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) ;
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
            // InternalGreenhouse.g:1135:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:1136:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:1136:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* )
            // InternalGreenhouse.g:1137:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' ( (lv_variable_3_0= ruleVariable ) ) otherlv_4= 'and' otherlv_5= 'states' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRowSensorAccess().getSensorKeyword_0());
            		
            // InternalGreenhouse.g:1141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1142:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRowSensorAccess().getHasKeyword_2());
            		
            // InternalGreenhouse.g:1163:3: ( (lv_variable_3_0= ruleVariable ) )
            // InternalGreenhouse.g:1164:4: (lv_variable_3_0= ruleVariable )
            {
            // InternalGreenhouse.g:1164:4: (lv_variable_3_0= ruleVariable )
            // InternalGreenhouse.g:1165:5: lv_variable_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getRowSensorAccess().getVariableVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getRowSensorAccess().getAndKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRowSensorAccess().getStatesKeyword_5());
            		
            // InternalGreenhouse.g:1190:3: ( (lv_states_6_0= ruleState ) )
            // InternalGreenhouse.g:1191:4: (lv_states_6_0= ruleState )
            {
            // InternalGreenhouse.g:1191:4: (lv_states_6_0= ruleState )
            // InternalGreenhouse.g:1192:5: lv_states_6_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRowSensorAccess().getStatesStateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalGreenhouse.g:1209:3: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGreenhouse.g:1210:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRowSensorAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGreenhouse.g:1214:4: ( (lv_states_8_0= ruleState ) )
            	    // InternalGreenhouse.g:1215:5: (lv_states_8_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:1215:5: (lv_states_8_0= ruleState )
            	    // InternalGreenhouse.g:1216:6: lv_states_8_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getRowSensorAccess().getStatesStateParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    // $ANTLR end "ruleRowSensor"


    // $ANTLR start "entryRuleState"
<<<<<<< HEAD
    // InternalGreenhouse.g:1253:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
=======
    // InternalGreenhouse.g:1238:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1253:46: (iv_ruleState= ruleState EOF )
            // InternalGreenhouse.g:1254:2: iv_ruleState= ruleState EOF
=======
            // InternalGreenhouse.g:1238:46: (iv_ruleState= ruleState EOF )
            // InternalGreenhouse.g:1239:2: iv_ruleState= ruleState EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1260:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) ) ;
=======
    // InternalGreenhouse.g:1245:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            // InternalGreenhouse.g:1266:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) ) )
            // InternalGreenhouse.g:1267:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) )
            {
            // InternalGreenhouse.g:1267:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) )
            // InternalGreenhouse.g:1268:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:1268:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:1269:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:1269:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:1270:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 
=======
            // InternalGreenhouse.g:1251:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) ) )
            // InternalGreenhouse.g:1252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) )
            {
            // InternalGreenhouse.g:1252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) ) )
            // InternalGreenhouse.g:1253:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:1253:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:1254:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:1254:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:1255:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1290:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1291:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1291:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1292:5: otherlv_2= RULE_ID
=======
            // InternalGreenhouse.g:1275:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1276:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1276:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1277:5: otherlv_2= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				
<<<<<<< HEAD
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_32); 
=======
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            					newLeafNode(otherlv_2, grammarAccess.getStateAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

<<<<<<< HEAD
            // InternalGreenhouse.g:1303:3: ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) )
            // InternalGreenhouse.g:1304:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            {
            // InternalGreenhouse.g:1304:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            // InternalGreenhouse.g:1305:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            {
            // InternalGreenhouse.g:1305:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
=======
            // InternalGreenhouse.g:1288:3: ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) )
            // InternalGreenhouse.g:1289:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            {
            // InternalGreenhouse.g:1289:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            // InternalGreenhouse.g:1290:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            {
            // InternalGreenhouse.g:1290:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                }
                break;
            case 35:
                {
<<<<<<< HEAD
                alt18=2;
=======
                alt16=2;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                }
                break;
            case 36:
                {
<<<<<<< HEAD
                alt18=3;
=======
                alt16=3;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
                }
                break;
            default:
                NoViableAltException nvae =
<<<<<<< HEAD
                    new NoViableAltException("", 18, 0, input);
=======
                    new NoViableAltException("", 16, 0, input);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

                throw nvae;
            }

<<<<<<< HEAD
            switch (alt18) {
                case 1 :
                    // InternalGreenhouse.g:1306:6: lv_op_3_1= '<'
                    {
                    lv_op_3_1=(Token)match(input,34,FOLLOW_17); 
=======
            switch (alt16) {
                case 1 :
                    // InternalGreenhouse.g:1291:6: lv_op_3_1= '<'
                    {
                    lv_op_3_1=(Token)match(input,34,FOLLOW_18); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

                    						newLeafNode(lv_op_3_1, grammarAccess.getStateAccess().getOpLessThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_1, null);
                    					

                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // InternalGreenhouse.g:1317:6: lv_op_3_2= '>'
                    {
                    lv_op_3_2=(Token)match(input,35,FOLLOW_17); 
=======
                    // InternalGreenhouse.g:1302:6: lv_op_3_2= '>'
                    {
                    lv_op_3_2=(Token)match(input,35,FOLLOW_18); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

                    						newLeafNode(lv_op_3_2, grammarAccess.getStateAccess().getOpGreaterThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_2, null);
                    					

                    }
                    break;
                case 3 :
<<<<<<< HEAD
                    // InternalGreenhouse.g:1328:6: lv_op_3_3= '='
                    {
                    lv_op_3_3=(Token)match(input,36,FOLLOW_17); 
=======
                    // InternalGreenhouse.g:1313:6: lv_op_3_3= '='
                    {
                    lv_op_3_3=(Token)match(input,36,FOLLOW_18); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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

<<<<<<< HEAD
            // InternalGreenhouse.g:1341:3: ( (lv_threshold_4_0= RULE_INT ) )
            // InternalGreenhouse.g:1342:4: (lv_threshold_4_0= RULE_INT )
            {
            // InternalGreenhouse.g:1342:4: (lv_threshold_4_0= RULE_INT )
            // InternalGreenhouse.g:1343:5: lv_threshold_4_0= RULE_INT
=======
            // InternalGreenhouse.g:1326:3: ( (lv_threshold_4_0= RULE_INT ) )
            // InternalGreenhouse.g:1327:4: (lv_threshold_4_0= RULE_INT )
            {
            // InternalGreenhouse.g:1327:4: (lv_threshold_4_0= RULE_INT )
            // InternalGreenhouse.g:1328:5: lv_threshold_4_0= RULE_INT
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1363:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
=======
    // InternalGreenhouse.g:1348:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1363:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalGreenhouse.g:1364:2: iv_ruleVariable= ruleVariable EOF
=======
            // InternalGreenhouse.g:1348:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalGreenhouse.g:1349:2: iv_ruleVariable= ruleVariable EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1370:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) ;
=======
    // InternalGreenhouse.g:1355:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1376:2: ( (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1377:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1377:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1378:3: otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) )
=======
            // InternalGreenhouse.g:1361:2: ( (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1362:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1362:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1363:3: otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) )
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1382:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1383:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1383:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1384:5: lv_name_1_0= RULE_ID
=======
            // InternalGreenhouse.g:1367:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1368:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1368:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1369:5: lv_name_1_0= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1404:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
=======
    // InternalGreenhouse.g:1389:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1404:47: (iv_ruleAction= ruleAction EOF )
            // InternalGreenhouse.g:1405:2: iv_ruleAction= ruleAction EOF
=======
            // InternalGreenhouse.g:1389:47: (iv_ruleAction= ruleAction EOF )
            // InternalGreenhouse.g:1390:2: iv_ruleAction= ruleAction EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1411:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) ) ;
=======
    // InternalGreenhouse.g:1396:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_condition_6_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1417:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) ) )
            // InternalGreenhouse.g:1418:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) )
            {
            // InternalGreenhouse.g:1418:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) )
            // InternalGreenhouse.g:1419:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'setting' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) )
            {
            // InternalGreenhouse.g:1419:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:1420:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:1420:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:1421:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 
=======
            // InternalGreenhouse.g:1402:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) ) )
            // InternalGreenhouse.g:1403:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) )
            {
            // InternalGreenhouse.g:1403:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) ) )
            // InternalGreenhouse.g:1404:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'receiving' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= 'by' otherlv_5= 'condition' ( (lv_condition_6_0= ruleCondition ) ) otherlv_7= 'to' ( (lv_value_8_0= ruleValue ) )
            {
            // InternalGreenhouse.g:1404:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:1405:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:1405:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:1406:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

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

<<<<<<< HEAD
            otherlv_1=(Token)match(input,33,FOLLOW_33); 
=======
            otherlv_1=(Token)match(input,33,FOLLOW_32); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getReceivingKeyword_2());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1445:3: ( (lv_trigger_3_0= ruleTrigger ) )
            // InternalGreenhouse.g:1446:4: (lv_trigger_3_0= ruleTrigger )
            {
            // InternalGreenhouse.g:1446:4: (lv_trigger_3_0= ruleTrigger )
            // InternalGreenhouse.g:1447:5: lv_trigger_3_0= ruleTrigger
=======
            // InternalGreenhouse.g:1430:3: ( (lv_trigger_3_0= ruleTrigger ) )
            // InternalGreenhouse.g:1431:4: (lv_trigger_3_0= ruleTrigger )
            {
            // InternalGreenhouse.g:1431:4: (lv_trigger_3_0= ruleTrigger )
            // InternalGreenhouse.g:1432:5: lv_trigger_3_0= ruleTrigger
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					newCompositeNode(grammarAccess.getActionAccess().getTriggerTriggerParserRuleCall_3_0());
            				
<<<<<<< HEAD
            pushFollow(FOLLOW_34);
=======
            pushFollow(FOLLOW_33);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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

<<<<<<< HEAD
            otherlv_4=(Token)match(input,39,FOLLOW_35); 
=======
            otherlv_4=(Token)match(input,39,FOLLOW_34); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getByKeyword_4());
            		
            otherlv_5=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getConditionKeyword_5());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1472:3: ( (lv_condition_6_0= ruleCondition ) )
            // InternalGreenhouse.g:1473:4: (lv_condition_6_0= ruleCondition )
            {
            // InternalGreenhouse.g:1473:4: (lv_condition_6_0= ruleCondition )
            // InternalGreenhouse.g:1474:5: lv_condition_6_0= ruleCondition
=======
            // InternalGreenhouse.g:1457:3: ( (lv_condition_6_0= ruleCondition ) )
            // InternalGreenhouse.g:1458:4: (lv_condition_6_0= ruleCondition )
            {
            // InternalGreenhouse.g:1458:4: (lv_condition_6_0= ruleCondition )
            // InternalGreenhouse.g:1459:5: lv_condition_6_0= ruleCondition
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					newCompositeNode(grammarAccess.getActionAccess().getConditionConditionParserRuleCall_6_0());
            				
<<<<<<< HEAD
            pushFollow(FOLLOW_14);
=======
            pushFollow(FOLLOW_15);
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            lv_condition_6_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_6_0,
            						"dsl.Greenhouse.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

<<<<<<< HEAD
            otherlv_7=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getToKeyword_7());
            		
            // InternalGreenhouse.g:1495:3: ( (lv_value_8_0= ruleValue ) )
            // InternalGreenhouse.g:1496:4: (lv_value_8_0= ruleValue )
            {
            // InternalGreenhouse.g:1496:4: (lv_value_8_0= ruleValue )
            // InternalGreenhouse.g:1497:5: lv_value_8_0= ruleValue
=======
            otherlv_7=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getToKeyword_7());
            		
            // InternalGreenhouse.g:1480:3: ( (lv_value_8_0= ruleValue ) )
            // InternalGreenhouse.g:1481:4: (lv_value_8_0= ruleValue )
            {
            // InternalGreenhouse.g:1481:4: (lv_value_8_0= ruleValue )
            // InternalGreenhouse.g:1482:5: lv_value_8_0= ruleValue
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1518:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
=======
    // InternalGreenhouse.g:1503:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1518:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalGreenhouse.g:1519:2: iv_ruleTrigger= ruleTrigger EOF
=======
            // InternalGreenhouse.g:1503:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalGreenhouse.g:1504:2: iv_ruleTrigger= ruleTrigger EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1525:1: ruleTrigger returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
=======
    // InternalGreenhouse.g:1510:1: ruleTrigger returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1531:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1532:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1532:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1533:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:1533:3: ()
            // InternalGreenhouse.g:1534:4: 
=======
            // InternalGreenhouse.g:1516:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1517:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1517:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1518:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:1518:3: ()
            // InternalGreenhouse.g:1519:4: 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerAccess().getTriggerAction_0(),
            					current);
            			

            }

<<<<<<< HEAD
            // InternalGreenhouse.g:1540:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1541:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1541:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1542:5: lv_name_1_0= RULE_ID
=======
            // InternalGreenhouse.g:1525:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1526:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1526:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1527:5: lv_name_1_0= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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


    // $ANTLR start "entryRuleCondition"
<<<<<<< HEAD
    // InternalGreenhouse.g:1562:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
=======
    // InternalGreenhouse.g:1547:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1562:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGreenhouse.g:1563:2: iv_ruleCondition= ruleCondition EOF
=======
            // InternalGreenhouse.g:1547:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGreenhouse.g:1548:2: iv_ruleCondition= ruleCondition EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
<<<<<<< HEAD
    // InternalGreenhouse.g:1569:1: ruleCondition returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
=======
    // InternalGreenhouse.g:1554:1: ruleCondition returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1575:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1576:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1576:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1577:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:1577:3: ()
            // InternalGreenhouse.g:1578:4: 
=======
            // InternalGreenhouse.g:1560:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1561:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1561:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1562:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:1562:3: ()
            // InternalGreenhouse.g:1563:4: 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

<<<<<<< HEAD
            // InternalGreenhouse.g:1584:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1585:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1585:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1586:5: lv_name_1_0= RULE_ID
=======
            // InternalGreenhouse.g:1569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1570:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1571:5: lv_name_1_0= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleValue"
<<<<<<< HEAD
    // InternalGreenhouse.g:1606:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
=======
    // InternalGreenhouse.g:1591:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1606:46: (iv_ruleValue= ruleValue EOF )
            // InternalGreenhouse.g:1607:2: iv_ruleValue= ruleValue EOF
=======
            // InternalGreenhouse.g:1591:46: (iv_ruleValue= ruleValue EOF )
            // InternalGreenhouse.g:1592:2: iv_ruleValue= ruleValue EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1613:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_INT ) ) ) ;
=======
    // InternalGreenhouse.g:1598:1: ruleValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_INT ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1619:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) ) )
            // InternalGreenhouse.g:1620:2: ( () ( (lv_name_1_0= RULE_INT ) ) )
            {
            // InternalGreenhouse.g:1620:2: ( () ( (lv_name_1_0= RULE_INT ) ) )
            // InternalGreenhouse.g:1621:3: () ( (lv_name_1_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:1621:3: ()
            // InternalGreenhouse.g:1622:4: 
=======
            // InternalGreenhouse.g:1604:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) ) )
            // InternalGreenhouse.g:1605:2: ( () ( (lv_name_1_0= RULE_INT ) ) )
            {
            // InternalGreenhouse.g:1605:2: ( () ( (lv_name_1_0= RULE_INT ) ) )
            // InternalGreenhouse.g:1606:3: () ( (lv_name_1_0= RULE_INT ) )
            {
            // InternalGreenhouse.g:1606:3: ()
            // InternalGreenhouse.g:1607:4: 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

<<<<<<< HEAD
            // InternalGreenhouse.g:1628:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalGreenhouse.g:1629:4: (lv_name_1_0= RULE_INT )
            {
            // InternalGreenhouse.g:1629:4: (lv_name_1_0= RULE_INT )
            // InternalGreenhouse.g:1630:5: lv_name_1_0= RULE_INT
=======
            // InternalGreenhouse.g:1613:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalGreenhouse.g:1614:4: (lv_name_1_0= RULE_INT )
            {
            // InternalGreenhouse.g:1614:4: (lv_name_1_0= RULE_INT )
            // InternalGreenhouse.g:1615:5: lv_name_1_0= RULE_INT
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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


    // $ANTLR start "entryRuleRowRuleSet"
<<<<<<< HEAD
    // InternalGreenhouse.g:1650:1: entryRuleRowRuleSet returns [EObject current=null] : iv_ruleRowRuleSet= ruleRowRuleSet EOF ;
=======
    // InternalGreenhouse.g:1635:1: entryRuleRowRuleSet returns [EObject current=null] : iv_ruleRowRuleSet= ruleRowRuleSet EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleRowRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowRuleSet = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1650:51: (iv_ruleRowRuleSet= ruleRowRuleSet EOF )
            // InternalGreenhouse.g:1651:2: iv_ruleRowRuleSet= ruleRowRuleSet EOF
=======
            // InternalGreenhouse.g:1635:51: (iv_ruleRowRuleSet= ruleRowRuleSet EOF )
            // InternalGreenhouse.g:1636:2: iv_ruleRowRuleSet= ruleRowRuleSet EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1657:1: ruleRowRuleSet returns [EObject current=null] : (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) ) ;
=======
    // InternalGreenhouse.g:1642:1: ruleRowRuleSet returns [EObject current=null] : (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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


        	enterRule();

        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1663:2: ( (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1664:2: (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1664:2: (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) )
            // InternalGreenhouse.g:1665:3: otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) )
=======
            // InternalGreenhouse.g:1648:2: ( (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1649:2: (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1649:2: (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) ) )
            // InternalGreenhouse.g:1650:3: otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'when' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'is' ( (otherlv_7= RULE_ID ) )
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRowRuleSetAccess().getRuleKeyword_0());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1669:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:1670:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:1670:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:1671:5: otherlv_1= RULE_ID
=======
            // InternalGreenhouse.g:1654:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:1655:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:1655:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:1656:5: otherlv_1= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
<<<<<<< HEAD
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_36); 
=======
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            					newLeafNode(otherlv_1, grammarAccess.getRowRuleSetAccess().getActuatorRowActuatorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRowRuleSetAccess().getSetKeyword_2());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1686:3: ( (otherlv_3= RULE_ID ) )
            // InternalGreenhouse.g:1687:4: (otherlv_3= RULE_ID )
            {
            // InternalGreenhouse.g:1687:4: (otherlv_3= RULE_ID )
            // InternalGreenhouse.g:1688:5: otherlv_3= RULE_ID
=======
            // InternalGreenhouse.g:1671:3: ( (otherlv_3= RULE_ID ) )
            // InternalGreenhouse.g:1672:4: (otherlv_3= RULE_ID )
            {
            // InternalGreenhouse.g:1672:4: (otherlv_3= RULE_ID )
            // InternalGreenhouse.g:1673:5: otherlv_3= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
<<<<<<< HEAD
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_31); 
=======
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            					newLeafNode(otherlv_3, grammarAccess.getRowRuleSetAccess().getActionActionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRowRuleSetAccess().getWhenKeyword_4());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1703:3: ( (otherlv_5= RULE_ID ) )
            // InternalGreenhouse.g:1704:4: (otherlv_5= RULE_ID )
            {
            // InternalGreenhouse.g:1704:4: (otherlv_5= RULE_ID )
            // InternalGreenhouse.g:1705:5: otherlv_5= RULE_ID
=======
            // InternalGreenhouse.g:1688:3: ( (otherlv_5= RULE_ID ) )
            // InternalGreenhouse.g:1689:4: (otherlv_5= RULE_ID )
            {
            // InternalGreenhouse.g:1689:4: (otherlv_5= RULE_ID )
            // InternalGreenhouse.g:1690:5: otherlv_5= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
<<<<<<< HEAD
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_37); 
=======
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_36); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            					newLeafNode(otherlv_5, grammarAccess.getRowRuleSetAccess().getSensorRowSensorCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getRowRuleSetAccess().getIsKeyword_6());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1720:3: ( (otherlv_7= RULE_ID ) )
            // InternalGreenhouse.g:1721:4: (otherlv_7= RULE_ID )
            {
            // InternalGreenhouse.g:1721:4: (otherlv_7= RULE_ID )
            // InternalGreenhouse.g:1722:5: otherlv_7= RULE_ID
=======
            // InternalGreenhouse.g:1705:3: ( (otherlv_7= RULE_ID ) )
            // InternalGreenhouse.g:1706:4: (otherlv_7= RULE_ID )
            {
            // InternalGreenhouse.g:1706:4: (otherlv_7= RULE_ID )
            // InternalGreenhouse.g:1707:5: otherlv_7= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getRowRuleSetAccess().getStateStateCrossReference_7_0());
            				

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
<<<<<<< HEAD
    // InternalGreenhouse.g:1737:1: entryRuleGreenhouseRuleSet returns [EObject current=null] : iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF ;
=======
    // InternalGreenhouse.g:1722:1: entryRuleGreenhouseRuleSet returns [EObject current=null] : iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
    public final EObject entryRuleGreenhouseRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseRuleSet = null;


        try {
<<<<<<< HEAD
            // InternalGreenhouse.g:1737:58: (iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF )
            // InternalGreenhouse.g:1738:2: iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF
=======
            // InternalGreenhouse.g:1722:58: (iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF )
            // InternalGreenhouse.g:1723:2: iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
    // InternalGreenhouse.g:1744:1: ruleGreenhouseRuleSet returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) ;
=======
    // InternalGreenhouse.g:1729:1: ruleGreenhouseRuleSet returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) ;
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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
<<<<<<< HEAD
            // InternalGreenhouse.g:1750:2: ( (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1751:2: (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1751:2: (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            // InternalGreenhouse.g:1752:3: otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_38); 
=======
            // InternalGreenhouse.g:1735:2: ( (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1736:2: (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1736:2: (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            // InternalGreenhouse.g:1737:3: otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_37); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseRuleSetAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreenhouseRuleSetAccess().getRuleKeyword_1());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1760:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1761:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1761:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1762:5: otherlv_2= RULE_ID
=======
            // InternalGreenhouse.g:1745:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1746:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1746:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1747:5: otherlv_2= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
<<<<<<< HEAD
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_36); 
=======
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_35); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            					newLeafNode(otherlv_2, grammarAccess.getGreenhouseRuleSetAccess().getActuatorGreenhouseActuatorCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseRuleSetAccess().getSetKeyword_3());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1777:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreenhouse.g:1778:4: (otherlv_4= RULE_ID )
            {
            // InternalGreenhouse.g:1778:4: (otherlv_4= RULE_ID )
            // InternalGreenhouse.g:1779:5: otherlv_4= RULE_ID
=======
            // InternalGreenhouse.g:1762:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreenhouse.g:1763:4: (otherlv_4= RULE_ID )
            {
            // InternalGreenhouse.g:1763:4: (otherlv_4= RULE_ID )
            // InternalGreenhouse.g:1764:5: otherlv_4= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
<<<<<<< HEAD
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_31); 
=======
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_30); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            					newLeafNode(otherlv_4, grammarAccess.getGreenhouseRuleSetAccess().getActionActionCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGreenhouseRuleSetAccess().getWhenKeyword_5());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1794:3: ( (otherlv_6= RULE_ID ) )
            // InternalGreenhouse.g:1795:4: (otherlv_6= RULE_ID )
            {
            // InternalGreenhouse.g:1795:4: (otherlv_6= RULE_ID )
            // InternalGreenhouse.g:1796:5: otherlv_6= RULE_ID
=======
            // InternalGreenhouse.g:1779:3: ( (otherlv_6= RULE_ID ) )
            // InternalGreenhouse.g:1780:4: (otherlv_6= RULE_ID )
            {
            // InternalGreenhouse.g:1780:4: (otherlv_6= RULE_ID )
            // InternalGreenhouse.g:1781:5: otherlv_6= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
<<<<<<< HEAD
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_37); 
=======
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_36); 
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

            					newLeafNode(otherlv_6, grammarAccess.getGreenhouseRuleSetAccess().getSensorGreenhouseSensorCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getGreenhouseRuleSetAccess().getIsKeyword_7());
            		
<<<<<<< HEAD
            // InternalGreenhouse.g:1811:3: ( (otherlv_8= RULE_ID ) )
            // InternalGreenhouse.g:1812:4: (otherlv_8= RULE_ID )
            {
            // InternalGreenhouse.g:1812:4: (otherlv_8= RULE_ID )
            // InternalGreenhouse.g:1813:5: otherlv_8= RULE_ID
=======
            // InternalGreenhouse.g:1796:3: ( (otherlv_8= RULE_ID ) )
            // InternalGreenhouse.g:1797:4: (otherlv_8= RULE_ID )
            {
            // InternalGreenhouse.g:1797:4: (otherlv_8= RULE_ID )
            // InternalGreenhouse.g:1798:5: otherlv_8= RULE_ID
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000002L});
<<<<<<< HEAD
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000100012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
=======
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000102002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
>>>>>>> 6bcf240872a089181259f4cf236ae39a3f597bc4

}