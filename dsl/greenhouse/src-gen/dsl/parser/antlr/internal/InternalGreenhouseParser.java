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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'hardware'", "'types'", "'micro-controllers'", "'actuator'", "'has'", "'action'", "'and'", "'sensor'", "'publishes'", "'controller'", "'of'", "'type'", "'ESP32'", "'ESP8266'", "'average'", "'median'", "'times'", "'per'", "'second'", "'with'", "'values'", "','", "'greenhouse'", "'row'", "'includes'", "'global'", "'on'", "'will'", "'states'", "'when'", "'<'", "'>'", "'='", "'variable'", "'receiving'", "'rule'", "'trigger'", "'is'", "'set'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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

                if ( (LA2_0==34) ) {
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
    // InternalGreenhouse.g:150:1: ruleHardwareSetup returns [EObject current=null] : ( () otherlv_1= 'hardware' otherlv_2= 'types' ( (lv_hardware_3_0= ruleHardware ) )* otherlv_4= 'micro-controllers' ( (lv_controllers_5_0= ruleController ) )+ ) ;
    public final EObject ruleHardwareSetup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_hardware_3_0 = null;

        EObject lv_controllers_5_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:156:2: ( ( () otherlv_1= 'hardware' otherlv_2= 'types' ( (lv_hardware_3_0= ruleHardware ) )* otherlv_4= 'micro-controllers' ( (lv_controllers_5_0= ruleController ) )+ ) )
            // InternalGreenhouse.g:157:2: ( () otherlv_1= 'hardware' otherlv_2= 'types' ( (lv_hardware_3_0= ruleHardware ) )* otherlv_4= 'micro-controllers' ( (lv_controllers_5_0= ruleController ) )+ )
            {
            // InternalGreenhouse.g:157:2: ( () otherlv_1= 'hardware' otherlv_2= 'types' ( (lv_hardware_3_0= ruleHardware ) )* otherlv_4= 'micro-controllers' ( (lv_controllers_5_0= ruleController ) )+ )
            // InternalGreenhouse.g:158:3: () otherlv_1= 'hardware' otherlv_2= 'types' ( (lv_hardware_3_0= ruleHardware ) )* otherlv_4= 'micro-controllers' ( (lv_controllers_5_0= ruleController ) )+
            {
            // InternalGreenhouse.g:158:3: ()
            // InternalGreenhouse.g:159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHardwareSetupAccess().getHardwareSetupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getHardwareSetupAccess().getHardwareKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getHardwareSetupAccess().getTypesKeyword_2());
            		
            // InternalGreenhouse.g:173:3: ( (lv_hardware_3_0= ruleHardware ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGreenhouse.g:174:4: (lv_hardware_3_0= ruleHardware )
            	    {
            	    // InternalGreenhouse.g:174:4: (lv_hardware_3_0= ruleHardware )
            	    // InternalGreenhouse.g:175:5: lv_hardware_3_0= ruleHardware
            	    {

            	    					newCompositeNode(grammarAccess.getHardwareSetupAccess().getHardwareHardwareParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_hardware_3_0=ruleHardware();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHardwareSetupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hardware",
            	    						lv_hardware_3_0,
            	    						"dsl.Greenhouse.Hardware");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getHardwareSetupAccess().getMicroControllersKeyword_4());
            		
            // InternalGreenhouse.g:196:3: ( (lv_controllers_5_0= ruleController ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGreenhouse.g:197:4: (lv_controllers_5_0= ruleController )
            	    {
            	    // InternalGreenhouse.g:197:4: (lv_controllers_5_0= ruleController )
            	    // InternalGreenhouse.g:198:5: lv_controllers_5_0= ruleController
            	    {

            	    					newCompositeNode(grammarAccess.getHardwareSetupAccess().getControllersControllerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_controllers_5_0=ruleController();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHardwareSetupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"controllers",
            	    						lv_controllers_5_0,
            	    						"dsl.Greenhouse.Controller");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalGreenhouse.g:219:1: entryRuleHardware returns [EObject current=null] : iv_ruleHardware= ruleHardware EOF ;
    public final EObject entryRuleHardware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardware = null;


        try {
            // InternalGreenhouse.g:219:49: (iv_ruleHardware= ruleHardware EOF )
            // InternalGreenhouse.g:220:2: iv_ruleHardware= ruleHardware EOF
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
    // InternalGreenhouse.g:226:1: ruleHardware returns [EObject current=null] : (this_SettingActuator_0= ruleSettingActuator | this_SettingSensor_1= ruleSettingSensor ) ;
    public final EObject ruleHardware() throws RecognitionException {
        EObject current = null;

        EObject this_SettingActuator_0 = null;

        EObject this_SettingSensor_1 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:232:2: ( (this_SettingActuator_0= ruleSettingActuator | this_SettingSensor_1= ruleSettingSensor ) )
            // InternalGreenhouse.g:233:2: (this_SettingActuator_0= ruleSettingActuator | this_SettingSensor_1= ruleSettingSensor )
            {
            // InternalGreenhouse.g:233:2: (this_SettingActuator_0= ruleSettingActuator | this_SettingSensor_1= ruleSettingSensor )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGreenhouse.g:234:3: this_SettingActuator_0= ruleSettingActuator
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
                    // InternalGreenhouse.g:243:3: this_SettingSensor_1= ruleSettingSensor
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
    // InternalGreenhouse.g:255:1: entryRuleSettingActuator returns [EObject current=null] : iv_ruleSettingActuator= ruleSettingActuator EOF ;
    public final EObject entryRuleSettingActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingActuator = null;


        try {
            // InternalGreenhouse.g:255:56: (iv_ruleSettingActuator= ruleSettingActuator EOF )
            // InternalGreenhouse.g:256:2: iv_ruleSettingActuator= ruleSettingActuator EOF
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
    // InternalGreenhouse.g:262:1: ruleSettingActuator returns [EObject current=null] : (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* ) ;
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
            // InternalGreenhouse.g:268:2: ( (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* ) )
            // InternalGreenhouse.g:269:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* )
            {
            // InternalGreenhouse.g:269:2: (otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )* )
            // InternalGreenhouse.g:270:3: otherlv_0= 'actuator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'action' ( (lv_settingAction_4_0= ruleSettingAction ) ) (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingActuatorAccess().getActuatorKeyword_0());
            		
            // InternalGreenhouse.g:274:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:275:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:275:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:276:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingActuatorAccess().getHasKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingActuatorAccess().getActionKeyword_3());
            		
            // InternalGreenhouse.g:300:3: ( (lv_settingAction_4_0= ruleSettingAction ) )
            // InternalGreenhouse.g:301:4: (lv_settingAction_4_0= ruleSettingAction )
            {
            // InternalGreenhouse.g:301:4: (lv_settingAction_4_0= ruleSettingAction )
            // InternalGreenhouse.g:302:5: lv_settingAction_4_0= ruleSettingAction
            {

            					newCompositeNode(grammarAccess.getSettingActuatorAccess().getSettingActionSettingActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalGreenhouse.g:319:3: (otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGreenhouse.g:320:4: otherlv_5= 'and' ( (lv_settingAction_6_0= ruleSettingAction ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSettingActuatorAccess().getAndKeyword_5_0());
            	    			
            	    // InternalGreenhouse.g:324:4: ( (lv_settingAction_6_0= ruleSettingAction ) )
            	    // InternalGreenhouse.g:325:5: (lv_settingAction_6_0= ruleSettingAction )
            	    {
            	    // InternalGreenhouse.g:325:5: (lv_settingAction_6_0= ruleSettingAction )
            	    // InternalGreenhouse.g:326:6: lv_settingAction_6_0= ruleSettingAction
            	    {

            	    						newCompositeNode(grammarAccess.getSettingActuatorAccess().getSettingActionSettingActionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
            	    break loop6;
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
    // InternalGreenhouse.g:348:1: entryRuleSettingSensor returns [EObject current=null] : iv_ruleSettingSensor= ruleSettingSensor EOF ;
    public final EObject entryRuleSettingSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingSensor = null;


        try {
            // InternalGreenhouse.g:348:54: (iv_ruleSettingSensor= ruleSettingSensor EOF )
            // InternalGreenhouse.g:349:2: iv_ruleSettingSensor= ruleSettingSensor EOF
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
    // InternalGreenhouse.g:355:1: ruleSettingSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) ) ) ;
    public final EObject ruleSettingSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_reducer_3_0 = null;

        EObject lv_frequency_4_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:361:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) ) ) )
            // InternalGreenhouse.g:362:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) ) )
            {
            // InternalGreenhouse.g:362:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) ) )
            // InternalGreenhouse.g:363:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'publishes' ( (lv_reducer_3_0= ruleReducer ) )? ( (lv_frequency_4_0= ruleFrequency ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingSensorAccess().getSensorKeyword_0());
            		
            // InternalGreenhouse.g:367:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:368:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:368:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:369:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingSensorAccess().getPublishesKeyword_2());
            		
            // InternalGreenhouse.g:389:3: ( (lv_reducer_3_0= ruleReducer ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=26 && LA7_0<=27)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGreenhouse.g:390:4: (lv_reducer_3_0= ruleReducer )
                    {
                    // InternalGreenhouse.g:390:4: (lv_reducer_3_0= ruleReducer )
                    // InternalGreenhouse.g:391:5: lv_reducer_3_0= ruleReducer
                    {

                    					newCompositeNode(grammarAccess.getSettingSensorAccess().getReducerReducerParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
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

            // InternalGreenhouse.g:408:3: ( (lv_frequency_4_0= ruleFrequency ) )
            // InternalGreenhouse.g:409:4: (lv_frequency_4_0= ruleFrequency )
            {
            // InternalGreenhouse.g:409:4: (lv_frequency_4_0= ruleFrequency )
            // InternalGreenhouse.g:410:5: lv_frequency_4_0= ruleFrequency
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


    // $ANTLR start "entryRuleController"
    // InternalGreenhouse.g:431:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalGreenhouse.g:431:51: (iv_ruleController= ruleController EOF )
            // InternalGreenhouse.g:432:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalGreenhouse.g:438:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:444:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) ) )
            // InternalGreenhouse.g:445:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) )
            {
            // InternalGreenhouse.g:445:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) ) )
            // InternalGreenhouse.g:446:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleControllerType ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalGreenhouse.g:450:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:451:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:451:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:452:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getTypeKeyword_3());
            		
            // InternalGreenhouse.g:476:3: ( (lv_type_4_0= ruleControllerType ) )
            // InternalGreenhouse.g:477:4: (lv_type_4_0= ruleControllerType )
            {
            // InternalGreenhouse.g:477:4: (lv_type_4_0= ruleControllerType )
            // InternalGreenhouse.g:478:5: lv_type_4_0= ruleControllerType
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getTypeControllerTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleControllerType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"dsl.Greenhouse.ControllerType");
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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleControllerType"
    // InternalGreenhouse.g:499:1: entryRuleControllerType returns [EObject current=null] : iv_ruleControllerType= ruleControllerType EOF ;
    public final EObject entryRuleControllerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerType = null;


        try {
            // InternalGreenhouse.g:499:55: (iv_ruleControllerType= ruleControllerType EOF )
            // InternalGreenhouse.g:500:2: iv_ruleControllerType= ruleControllerType EOF
            {
             newCompositeNode(grammarAccess.getControllerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControllerType=ruleControllerType();

            state._fsp--;

             current =iv_ruleControllerType; 
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
    // $ANTLR end "entryRuleControllerType"


    // $ANTLR start "ruleControllerType"
    // InternalGreenhouse.g:506:1: ruleControllerType returns [EObject current=null] : ( ( (lv_name_0_1= 'ESP32' | lv_name_0_2= 'ESP8266' ) ) ) ;
    public final EObject ruleControllerType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:512:2: ( ( ( (lv_name_0_1= 'ESP32' | lv_name_0_2= 'ESP8266' ) ) ) )
            // InternalGreenhouse.g:513:2: ( ( (lv_name_0_1= 'ESP32' | lv_name_0_2= 'ESP8266' ) ) )
            {
            // InternalGreenhouse.g:513:2: ( ( (lv_name_0_1= 'ESP32' | lv_name_0_2= 'ESP8266' ) ) )
            // InternalGreenhouse.g:514:3: ( (lv_name_0_1= 'ESP32' | lv_name_0_2= 'ESP8266' ) )
            {
            // InternalGreenhouse.g:514:3: ( (lv_name_0_1= 'ESP32' | lv_name_0_2= 'ESP8266' ) )
            // InternalGreenhouse.g:515:4: (lv_name_0_1= 'ESP32' | lv_name_0_2= 'ESP8266' )
            {
            // InternalGreenhouse.g:515:4: (lv_name_0_1= 'ESP32' | lv_name_0_2= 'ESP8266' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGreenhouse.g:516:5: lv_name_0_1= 'ESP32'
                    {
                    lv_name_0_1=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getControllerTypeAccess().getNameESP32Keyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getControllerTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:527:5: lv_name_0_2= 'ESP8266'
                    {
                    lv_name_0_2=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getControllerTypeAccess().getNameESP8266Keyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getControllerTypeRule());
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
    // $ANTLR end "ruleControllerType"


    // $ANTLR start "entryRuleReducer"
    // InternalGreenhouse.g:543:1: entryRuleReducer returns [EObject current=null] : iv_ruleReducer= ruleReducer EOF ;
    public final EObject entryRuleReducer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReducer = null;


        try {
            // InternalGreenhouse.g:543:48: (iv_ruleReducer= ruleReducer EOF )
            // InternalGreenhouse.g:544:2: iv_ruleReducer= ruleReducer EOF
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
    // InternalGreenhouse.g:550:1: ruleReducer returns [EObject current=null] : ( ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) ) ) ;
    public final EObject ruleReducer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:556:2: ( ( ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) ) ) )
            // InternalGreenhouse.g:557:2: ( ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) ) )
            {
            // InternalGreenhouse.g:557:2: ( ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) ) )
            // InternalGreenhouse.g:558:3: ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) )
            {
            // InternalGreenhouse.g:558:3: ( (lv_name_0_1= 'average' | lv_name_0_2= 'median' ) )
            // InternalGreenhouse.g:559:4: (lv_name_0_1= 'average' | lv_name_0_2= 'median' )
            {
            // InternalGreenhouse.g:559:4: (lv_name_0_1= 'average' | lv_name_0_2= 'median' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGreenhouse.g:560:5: lv_name_0_1= 'average'
                    {
                    lv_name_0_1=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getReducerAccess().getNameAverageKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReducerRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:571:5: lv_name_0_2= 'median'
                    {
                    lv_name_0_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalGreenhouse.g:587:1: entryRuleFrequency returns [EObject current=null] : iv_ruleFrequency= ruleFrequency EOF ;
    public final EObject entryRuleFrequency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequency = null;


        try {
            // InternalGreenhouse.g:587:50: (iv_ruleFrequency= ruleFrequency EOF )
            // InternalGreenhouse.g:588:2: iv_ruleFrequency= ruleFrequency EOF
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
    // InternalGreenhouse.g:594:1: ruleFrequency returns [EObject current=null] : ( ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second' ) ;
    public final EObject ruleFrequency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_freq_0_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:600:2: ( ( ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second' ) )
            // InternalGreenhouse.g:601:2: ( ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second' )
            {
            // InternalGreenhouse.g:601:2: ( ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second' )
            // InternalGreenhouse.g:602:3: ( (lv_freq_0_0= ruleExp ) ) otherlv_1= 'times' otherlv_2= 'per' otherlv_3= 'second'
            {
            // InternalGreenhouse.g:602:3: ( (lv_freq_0_0= ruleExp ) )
            // InternalGreenhouse.g:603:4: (lv_freq_0_0= ruleExp )
            {
            // InternalGreenhouse.g:603:4: (lv_freq_0_0= ruleExp )
            // InternalGreenhouse.g:604:5: lv_freq_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getFrequencyAccess().getFreqExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_1=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getFrequencyAccess().getTimesKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getFrequencyAccess().getPerKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalGreenhouse.g:637:1: entryRuleSettingAction returns [EObject current=null] : iv_ruleSettingAction= ruleSettingAction EOF ;
    public final EObject entryRuleSettingAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingAction = null;


        try {
            // InternalGreenhouse.g:637:54: (iv_ruleSettingAction= ruleSettingAction EOF )
            // InternalGreenhouse.g:638:2: iv_ruleSettingAction= ruleSettingAction EOF
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
    // InternalGreenhouse.g:644:1: ruleSettingAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* ) ;
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
            // InternalGreenhouse.g:650:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* ) )
            // InternalGreenhouse.g:651:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* )
            {
            // InternalGreenhouse.g:651:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )* )
            // InternalGreenhouse.g:652:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'values' ( (lv_settingValue_3_0= ruleSettingValue ) ) (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )*
            {
            // InternalGreenhouse.g:652:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:653:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:653:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:654:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingActionAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingActionAccess().getValuesKeyword_2());
            		
            // InternalGreenhouse.g:678:3: ( (lv_settingValue_3_0= ruleSettingValue ) )
            // InternalGreenhouse.g:679:4: (lv_settingValue_3_0= ruleSettingValue )
            {
            // InternalGreenhouse.g:679:4: (lv_settingValue_3_0= ruleSettingValue )
            // InternalGreenhouse.g:680:5: lv_settingValue_3_0= ruleSettingValue
            {

            					newCompositeNode(grammarAccess.getSettingActionAccess().getSettingValueSettingValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalGreenhouse.g:697:3: (otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGreenhouse.g:698:4: otherlv_4= ',' ( (lv_settingValue_5_0= ruleSettingValue ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSettingActionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalGreenhouse.g:702:4: ( (lv_settingValue_5_0= ruleSettingValue ) )
            	    // InternalGreenhouse.g:703:5: (lv_settingValue_5_0= ruleSettingValue )
            	    {
            	    // InternalGreenhouse.g:703:5: (lv_settingValue_5_0= ruleSettingValue )
            	    // InternalGreenhouse.g:704:6: lv_settingValue_5_0= ruleSettingValue
            	    {

            	    						newCompositeNode(grammarAccess.getSettingActionAccess().getSettingValueSettingValueParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleSettingAction"


    // $ANTLR start "entryRuleSettingValue"
    // InternalGreenhouse.g:726:1: entryRuleSettingValue returns [EObject current=null] : iv_ruleSettingValue= ruleSettingValue EOF ;
    public final EObject entryRuleSettingValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingValue = null;


        try {
            // InternalGreenhouse.g:726:53: (iv_ruleSettingValue= ruleSettingValue EOF )
            // InternalGreenhouse.g:727:2: iv_ruleSettingValue= ruleSettingValue EOF
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
    // InternalGreenhouse.g:733:1: ruleSettingValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSettingValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:739:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGreenhouse.g:740:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:740:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:741:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:741:3: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:742:4: lv_name_0_0= RULE_ID
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
    // InternalGreenhouse.g:761:1: entryRuleGreenhouse returns [EObject current=null] : iv_ruleGreenhouse= ruleGreenhouse EOF ;
    public final EObject entryRuleGreenhouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouse = null;


        try {
            // InternalGreenhouse.g:761:51: (iv_ruleGreenhouse= ruleGreenhouse EOF )
            // InternalGreenhouse.g:762:2: iv_ruleGreenhouse= ruleGreenhouse EOF
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
    // InternalGreenhouse.g:768:1: ruleGreenhouse returns [EObject current=null] : (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* ) ;
    public final EObject ruleGreenhouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_row_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:774:2: ( (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* ) )
            // InternalGreenhouse.g:775:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* )
            {
            // InternalGreenhouse.g:775:2: (otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )* )
            // InternalGreenhouse.g:776:3: otherlv_0= 'greenhouse' ( (lv_name_1_0= RULE_ID ) ) ( (lv_row_2_0= ruleRow ) )* ( (lv_elements_3_0= ruleGreenhouseElement ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseAccess().getGreenhouseKeyword_0());
            		
            // InternalGreenhouse.g:780:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:781:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:781:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:782:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalGreenhouse.g:798:3: ( (lv_row_2_0= ruleRow ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGreenhouse.g:799:4: (lv_row_2_0= ruleRow )
            	    {
            	    // InternalGreenhouse.g:799:4: (lv_row_2_0= ruleRow )
            	    // InternalGreenhouse.g:800:5: lv_row_2_0= ruleRow
            	    {

            	    					newCompositeNode(grammarAccess.getGreenhouseAccess().getRowRowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop11;
                }
            } while (true);

            // InternalGreenhouse.g:817:3: ( (lv_elements_3_0= ruleGreenhouseElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGreenhouse.g:818:4: (lv_elements_3_0= ruleGreenhouseElement )
            	    {
            	    // InternalGreenhouse.g:818:4: (lv_elements_3_0= ruleGreenhouseElement )
            	    // InternalGreenhouse.g:819:5: lv_elements_3_0= ruleGreenhouseElement
            	    {

            	    					newCompositeNode(grammarAccess.getGreenhouseAccess().getElementsGreenhouseElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
    // $ANTLR end "ruleGreenhouse"


    // $ANTLR start "entryRuleRow"
    // InternalGreenhouse.g:840:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalGreenhouse.g:840:44: (iv_ruleRow= ruleRow EOF )
            // InternalGreenhouse.g:841:2: iv_ruleRow= ruleRow EOF
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
    // InternalGreenhouse.g:847:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:853:2: ( (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* ) )
            // InternalGreenhouse.g:854:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* )
            {
            // InternalGreenhouse.g:854:2: (otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )* )
            // InternalGreenhouse.g:855:3: otherlv_0= 'row' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (lv_elements_3_0= ruleRowElement ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalGreenhouse.g:859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:860:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:861:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getIncludesKeyword_2());
            		
            // InternalGreenhouse.g:881:3: ( (lv_elements_3_0= ruleRowElement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==47) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGreenhouse.g:882:4: (lv_elements_3_0= ruleRowElement )
            	    {
            	    // InternalGreenhouse.g:882:4: (lv_elements_3_0= ruleRowElement )
            	    // InternalGreenhouse.g:883:5: lv_elements_3_0= ruleRowElement
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementsRowElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleGreenhouseElement"
    // InternalGreenhouse.g:904:1: entryRuleGreenhouseElement returns [EObject current=null] : iv_ruleGreenhouseElement= ruleGreenhouseElement EOF ;
    public final EObject entryRuleGreenhouseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseElement = null;


        try {
            // InternalGreenhouse.g:904:58: (iv_ruleGreenhouseElement= ruleGreenhouseElement EOF )
            // InternalGreenhouse.g:905:2: iv_ruleGreenhouseElement= ruleGreenhouseElement EOF
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
    // InternalGreenhouse.g:911:1: ruleGreenhouseElement returns [EObject current=null] : (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet ) ;
    public final EObject ruleGreenhouseElement() throws RecognitionException {
        EObject current = null;

        EObject this_GreenhouseSensor_0 = null;

        EObject this_GreenhouseActuator_1 = null;

        EObject this_GreenhouseRuleSet_2 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:917:2: ( (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet ) )
            // InternalGreenhouse.g:918:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )
            {
            // InternalGreenhouse.g:918:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalGreenhouse.g:919:3: this_GreenhouseSensor_0= ruleGreenhouseSensor
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
                    // InternalGreenhouse.g:928:3: this_GreenhouseActuator_1= ruleGreenhouseActuator
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
                    // InternalGreenhouse.g:937:3: this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet
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
    // InternalGreenhouse.g:949:1: entryRuleRowElement returns [EObject current=null] : iv_ruleRowElement= ruleRowElement EOF ;
    public final EObject entryRuleRowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowElement = null;


        try {
            // InternalGreenhouse.g:949:51: (iv_ruleRowElement= ruleRowElement EOF )
            // InternalGreenhouse.g:950:2: iv_ruleRowElement= ruleRowElement EOF
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
    // InternalGreenhouse.g:956:1: ruleRowElement returns [EObject current=null] : (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet ) ;
    public final EObject ruleRowElement() throws RecognitionException {
        EObject current = null;

        EObject this_RowSensor_0 = null;

        EObject this_RowActuator_1 = null;

        EObject this_RowRuleSet_2 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:962:2: ( (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet ) )
            // InternalGreenhouse.g:963:2: (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet )
            {
            // InternalGreenhouse.g:963:2: (this_RowSensor_0= ruleRowSensor | this_RowActuator_1= ruleRowActuator | this_RowRuleSet_2= ruleRowRuleSet )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==38) ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4==21) ) {
                            int LA15_5 = input.LA(5);

                            if ( (LA15_5==RULE_ID) ) {
                                int LA15_6 = input.LA(6);

                                if ( (LA15_6==EOF||LA15_6==RULE_ID||(LA15_6>=33 && LA15_6<=35)||LA15_6==37||LA15_6==39||LA15_6==47) ) {
                                    alt15=2;
                                }
                                else if ( (LA15_6==16) ) {
                                    alt15=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==47) ) {
                alt15=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGreenhouse.g:964:3: this_RowSensor_0= ruleRowSensor
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
                    // InternalGreenhouse.g:973:3: this_RowActuator_1= ruleRowActuator
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
                    // InternalGreenhouse.g:982:3: this_RowRuleSet_2= ruleRowRuleSet
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
    // InternalGreenhouse.g:994:1: entryRuleGreenhouseActuator returns [EObject current=null] : iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF ;
    public final EObject entryRuleGreenhouseActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseActuator = null;


        try {
            // InternalGreenhouse.g:994:59: (iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF )
            // InternalGreenhouse.g:995:2: iv_ruleGreenhouseActuator= ruleGreenhouseActuator EOF
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
    // InternalGreenhouse.g:1001:1: ruleGreenhouseActuator returns [EObject current=null] : (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )? (otherlv_8= ',' otherlv_9= 'will' ( (lv_action_10_0= ruleAction ) ) )* ) ;
    public final EObject ruleGreenhouseActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_action_7_0 = null;

        EObject lv_action_10_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1007:2: ( (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )? (otherlv_8= ',' otherlv_9= 'will' ( (lv_action_10_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:1008:2: (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )? (otherlv_8= ',' otherlv_9= 'will' ( (lv_action_10_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:1008:2: (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )? (otherlv_8= ',' otherlv_9= 'will' ( (lv_action_10_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:1009:3: otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )? (otherlv_8= ',' otherlv_9= 'will' ( (lv_action_10_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseActuatorAccess().getGlobalKeyword_0());
            		
            // InternalGreenhouse.g:1013:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:1014:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:1014:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:1015:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseActuatorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getGreenhouseActuatorAccess().getTypeSettingActuatorCrossReference_1_0());
            				

            }


            }

            // InternalGreenhouse.g:1026:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:1027:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:1027:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:1028:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseActuatorAccess().getOnKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGreenhouseActuatorAccess().getControllerKeyword_4());
            		
            // InternalGreenhouse.g:1052:3: ( (otherlv_5= RULE_ID ) )
            // InternalGreenhouse.g:1053:4: (otherlv_5= RULE_ID )
            {
            // InternalGreenhouse.g:1053:4: (otherlv_5= RULE_ID )
            // InternalGreenhouse.g:1054:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseActuatorRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_5, grammarAccess.getGreenhouseActuatorAccess().getControllerControllerCrossReference_5_0());
            				

            }


            }

            // InternalGreenhouse.g:1065:3: (otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGreenhouse.g:1066:4: otherlv_6= 'will' ( (lv_action_7_0= ruleAction ) )
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGreenhouseActuatorAccess().getWillKeyword_6_0());
                    			
                    // InternalGreenhouse.g:1070:4: ( (lv_action_7_0= ruleAction ) )
                    // InternalGreenhouse.g:1071:5: (lv_action_7_0= ruleAction )
                    {
                    // InternalGreenhouse.g:1071:5: (lv_action_7_0= ruleAction )
                    // InternalGreenhouse.g:1072:6: lv_action_7_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getGreenhouseActuatorAccess().getActionActionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            }

            // InternalGreenhouse.g:1090:3: (otherlv_8= ',' otherlv_9= 'will' ( (lv_action_10_0= ruleAction ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGreenhouse.g:1091:4: otherlv_8= ',' otherlv_9= 'will' ( (lv_action_10_0= ruleAction ) )
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_30); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGreenhouseActuatorAccess().getCommaKeyword_7_0());
            	    			
            	    otherlv_9=(Token)match(input,39,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getGreenhouseActuatorAccess().getWillKeyword_7_1());
            	    			
            	    // InternalGreenhouse.g:1099:4: ( (lv_action_10_0= ruleAction ) )
            	    // InternalGreenhouse.g:1100:5: (lv_action_10_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:1100:5: (lv_action_10_0= ruleAction )
            	    // InternalGreenhouse.g:1101:6: lv_action_10_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseActuatorAccess().getActionActionParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_action_10_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreenhouseActuatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_10_0,
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
    // $ANTLR end "ruleGreenhouseActuator"


    // $ANTLR start "entryRuleRowActuator"
    // InternalGreenhouse.g:1123:1: entryRuleRowActuator returns [EObject current=null] : iv_ruleRowActuator= ruleRowActuator EOF ;
    public final EObject entryRuleRowActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowActuator = null;


        try {
            // InternalGreenhouse.g:1123:52: (iv_ruleRowActuator= ruleRowActuator EOF )
            // InternalGreenhouse.g:1124:2: iv_ruleRowActuator= ruleRowActuator EOF
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
    // InternalGreenhouse.g:1130:1: ruleRowActuator returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )? (otherlv_7= ',' otherlv_8= 'will' ( (lv_action_9_0= ruleAction ) ) )* ) ;
    public final EObject ruleRowActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_action_6_0 = null;

        EObject lv_action_9_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1136:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )? (otherlv_7= ',' otherlv_8= 'will' ( (lv_action_9_0= ruleAction ) ) )* ) )
            // InternalGreenhouse.g:1137:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )? (otherlv_7= ',' otherlv_8= 'will' ( (lv_action_9_0= ruleAction ) ) )* )
            {
            // InternalGreenhouse.g:1137:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )? (otherlv_7= ',' otherlv_8= 'will' ( (lv_action_9_0= ruleAction ) ) )* )
            // InternalGreenhouse.g:1138:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )? (otherlv_7= ',' otherlv_8= 'will' ( (lv_action_9_0= ruleAction ) ) )*
            {
            // InternalGreenhouse.g:1138:3: ( (otherlv_0= RULE_ID ) )
            // InternalGreenhouse.g:1139:4: (otherlv_0= RULE_ID )
            {
            // InternalGreenhouse.g:1139:4: (otherlv_0= RULE_ID )
            // InternalGreenhouse.g:1140:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowActuatorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getRowActuatorAccess().getTypeSettingActuatorCrossReference_0_0());
            				

            }


            }

            // InternalGreenhouse.g:1151:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1152:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1152:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1153:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRowActuatorAccess().getOnKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRowActuatorAccess().getControllerKeyword_3());
            		
            // InternalGreenhouse.g:1177:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreenhouse.g:1178:4: (otherlv_4= RULE_ID )
            {
            // InternalGreenhouse.g:1178:4: (otherlv_4= RULE_ID )
            // InternalGreenhouse.g:1179:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowActuatorRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_4, grammarAccess.getRowActuatorAccess().getControllerControllerCrossReference_4_0());
            				

            }


            }

            // InternalGreenhouse.g:1190:3: (otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGreenhouse.g:1191:4: otherlv_5= 'will' ( (lv_action_6_0= ruleAction ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRowActuatorAccess().getWillKeyword_5_0());
                    			
                    // InternalGreenhouse.g:1195:4: ( (lv_action_6_0= ruleAction ) )
                    // InternalGreenhouse.g:1196:5: (lv_action_6_0= ruleAction )
                    {
                    // InternalGreenhouse.g:1196:5: (lv_action_6_0= ruleAction )
                    // InternalGreenhouse.g:1197:6: lv_action_6_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRowActuatorAccess().getActionActionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            }

            // InternalGreenhouse.g:1215:3: (otherlv_7= ',' otherlv_8= 'will' ( (lv_action_9_0= ruleAction ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGreenhouse.g:1216:4: otherlv_7= ',' otherlv_8= 'will' ( (lv_action_9_0= ruleAction ) )
            	    {
            	    otherlv_7=(Token)match(input,33,FOLLOW_30); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRowActuatorAccess().getCommaKeyword_6_0());
            	    			
            	    otherlv_8=(Token)match(input,39,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getRowActuatorAccess().getWillKeyword_6_1());
            	    			
            	    // InternalGreenhouse.g:1224:4: ( (lv_action_9_0= ruleAction ) )
            	    // InternalGreenhouse.g:1225:5: (lv_action_9_0= ruleAction )
            	    {
            	    // InternalGreenhouse.g:1225:5: (lv_action_9_0= ruleAction )
            	    // InternalGreenhouse.g:1226:6: lv_action_9_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getRowActuatorAccess().getActionActionParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_action_9_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRowActuatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_9_0,
            	    							"dsl.Greenhouse.Action");
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
    // $ANTLR end "ruleRowActuator"


    // $ANTLR start "entryRuleGreenhouseSensor"
    // InternalGreenhouse.g:1248:1: entryRuleGreenhouseSensor returns [EObject current=null] : iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF ;
    public final EObject entryRuleGreenhouseSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseSensor = null;


        try {
            // InternalGreenhouse.g:1248:57: (iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF )
            // InternalGreenhouse.g:1249:2: iv_ruleGreenhouseSensor= ruleGreenhouseSensor EOF
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
    // InternalGreenhouse.g:1255:1: ruleGreenhouseSensor returns [EObject current=null] : (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_variable_7_0= ruleVariable ) ) otherlv_8= 'and' otherlv_9= 'states' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* ) ;
    public final EObject ruleGreenhouseSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_variable_7_0 = null;

        EObject lv_states_10_0 = null;

        EObject lv_states_12_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1261:2: ( (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_variable_7_0= ruleVariable ) ) otherlv_8= 'and' otherlv_9= 'states' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:1262:2: (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_variable_7_0= ruleVariable ) ) otherlv_8= 'and' otherlv_9= 'states' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:1262:2: (otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_variable_7_0= ruleVariable ) ) otherlv_8= 'and' otherlv_9= 'states' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )* )
            // InternalGreenhouse.g:1263:3: otherlv_0= 'global' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'controller' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'has' ( (lv_variable_7_0= ruleVariable ) ) otherlv_8= 'and' otherlv_9= 'states' ( (lv_states_10_0= ruleState ) ) (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseSensorAccess().getGlobalKeyword_0());
            		
            // InternalGreenhouse.g:1267:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:1268:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:1268:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:1269:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseSensorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getGreenhouseSensorAccess().getTypeSettingSensorCrossReference_1_0());
            				

            }


            }

            // InternalGreenhouse.g:1280:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGreenhouse.g:1281:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGreenhouse.g:1281:4: (lv_name_2_0= RULE_ID )
            // InternalGreenhouse.g:1282:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseSensorAccess().getOnKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGreenhouseSensorAccess().getControllerKeyword_4());
            		
            // InternalGreenhouse.g:1306:3: ( (otherlv_5= RULE_ID ) )
            // InternalGreenhouse.g:1307:4: (otherlv_5= RULE_ID )
            {
            // InternalGreenhouse.g:1307:4: (otherlv_5= RULE_ID )
            // InternalGreenhouse.g:1308:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseSensorRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_5, grammarAccess.getGreenhouseSensorAccess().getControllerControllerCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_31); 

            			newLeafNode(otherlv_6, grammarAccess.getGreenhouseSensorAccess().getHasKeyword_6());
            		
            // InternalGreenhouse.g:1323:3: ( (lv_variable_7_0= ruleVariable ) )
            // InternalGreenhouse.g:1324:4: (lv_variable_7_0= ruleVariable )
            {
            // InternalGreenhouse.g:1324:4: (lv_variable_7_0= ruleVariable )
            // InternalGreenhouse.g:1325:5: lv_variable_7_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getVariableVariableParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_32);
            lv_variable_7_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_7_0,
            						"dsl.Greenhouse.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_8, grammarAccess.getGreenhouseSensorAccess().getAndKeyword_8());
            		
            otherlv_9=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getGreenhouseSensorAccess().getStatesKeyword_9());
            		
            // InternalGreenhouse.g:1350:3: ( (lv_states_10_0= ruleState ) )
            // InternalGreenhouse.g:1351:4: (lv_states_10_0= ruleState )
            {
            // InternalGreenhouse.g:1351:4: (lv_states_10_0= ruleState )
            // InternalGreenhouse.g:1352:5: lv_states_10_0= ruleState
            {

            					newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_23);
            lv_states_10_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_10_0,
            						"dsl.Greenhouse.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:1369:3: (otherlv_11= ',' ( (lv_states_12_0= ruleState ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGreenhouse.g:1370:4: otherlv_11= ',' ( (lv_states_12_0= ruleState ) )
            	    {
            	    otherlv_11=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getGreenhouseSensorAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalGreenhouse.g:1374:4: ( (lv_states_12_0= ruleState ) )
            	    // InternalGreenhouse.g:1375:5: (lv_states_12_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:1375:5: (lv_states_12_0= ruleState )
            	    // InternalGreenhouse.g:1376:6: lv_states_12_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getGreenhouseSensorAccess().getStatesStateParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_states_12_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGreenhouseSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_12_0,
            	    							"dsl.Greenhouse.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalGreenhouse.g:1398:1: entryRuleRowSensor returns [EObject current=null] : iv_ruleRowSensor= ruleRowSensor EOF ;
    public final EObject entryRuleRowSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowSensor = null;


        try {
            // InternalGreenhouse.g:1398:50: (iv_ruleRowSensor= ruleRowSensor EOF )
            // InternalGreenhouse.g:1399:2: iv_ruleRowSensor= ruleRowSensor EOF
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
    // InternalGreenhouse.g:1405:1: ruleRowSensor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'has' ( (lv_variable_6_0= ruleVariable ) ) otherlv_7= 'and' otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* ) ;
    public final EObject ruleRowSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_variable_6_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_states_11_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1411:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'has' ( (lv_variable_6_0= ruleVariable ) ) otherlv_7= 'and' otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* ) )
            // InternalGreenhouse.g:1412:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'has' ( (lv_variable_6_0= ruleVariable ) ) otherlv_7= 'and' otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* )
            {
            // InternalGreenhouse.g:1412:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'has' ( (lv_variable_6_0= ruleVariable ) ) otherlv_7= 'and' otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )* )
            // InternalGreenhouse.g:1413:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'on' otherlv_3= 'controller' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'has' ( (lv_variable_6_0= ruleVariable ) ) otherlv_7= 'and' otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )*
            {
            // InternalGreenhouse.g:1413:3: ( (otherlv_0= RULE_ID ) )
            // InternalGreenhouse.g:1414:4: (otherlv_0= RULE_ID )
            {
            // InternalGreenhouse.g:1414:4: (otherlv_0= RULE_ID )
            // InternalGreenhouse.g:1415:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowSensorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getRowSensorAccess().getTypeSettingSensorCrossReference_0_0());
            				

            }


            }

            // InternalGreenhouse.g:1426:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1427:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1427:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1428:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRowSensorAccess().getOnKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRowSensorAccess().getControllerKeyword_3());
            		
            // InternalGreenhouse.g:1452:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreenhouse.g:1453:4: (otherlv_4= RULE_ID )
            {
            // InternalGreenhouse.g:1453:4: (otherlv_4= RULE_ID )
            // InternalGreenhouse.g:1454:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowSensorRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getRowSensorAccess().getControllerControllerCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getRowSensorAccess().getHasKeyword_5());
            		
            // InternalGreenhouse.g:1469:3: ( (lv_variable_6_0= ruleVariable ) )
            // InternalGreenhouse.g:1470:4: (lv_variable_6_0= ruleVariable )
            {
            // InternalGreenhouse.g:1470:4: (lv_variable_6_0= ruleVariable )
            // InternalGreenhouse.g:1471:5: lv_variable_6_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getRowSensorAccess().getVariableVariableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
            lv_variable_6_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowSensorRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_6_0,
            						"dsl.Greenhouse.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getRowSensorAccess().getAndKeyword_7());
            		
            otherlv_8=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getRowSensorAccess().getStatesKeyword_8());
            		
            // InternalGreenhouse.g:1496:3: ( (lv_states_9_0= ruleState ) )
            // InternalGreenhouse.g:1497:4: (lv_states_9_0= ruleState )
            {
            // InternalGreenhouse.g:1497:4: (lv_states_9_0= ruleState )
            // InternalGreenhouse.g:1498:5: lv_states_9_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRowSensorAccess().getStatesStateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_23);
            lv_states_9_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowSensorRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_9_0,
            						"dsl.Greenhouse.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGreenhouse.g:1515:3: (otherlv_10= ',' ( (lv_states_11_0= ruleState ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGreenhouse.g:1516:4: otherlv_10= ',' ( (lv_states_11_0= ruleState ) )
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getRowSensorAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalGreenhouse.g:1520:4: ( (lv_states_11_0= ruleState ) )
            	    // InternalGreenhouse.g:1521:5: (lv_states_11_0= ruleState )
            	    {
            	    // InternalGreenhouse.g:1521:5: (lv_states_11_0= ruleState )
            	    // InternalGreenhouse.g:1522:6: lv_states_11_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getRowSensorAccess().getStatesStateParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_states_11_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRowSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_11_0,
            	    							"dsl.Greenhouse.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalGreenhouse.g:1544:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalGreenhouse.g:1544:46: (iv_ruleState= ruleState EOF )
            // InternalGreenhouse.g:1545:2: iv_ruleState= ruleState EOF
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
    // InternalGreenhouse.g:1551:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) ) ) ;
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
            // InternalGreenhouse.g:1557:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) ) ) )
            // InternalGreenhouse.g:1558:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) ) )
            {
            // InternalGreenhouse.g:1558:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) ) )
            // InternalGreenhouse.g:1559:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) ) ( (lv_threshold_4_0= ruleExp ) )
            {
            // InternalGreenhouse.g:1559:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:1560:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:1560:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:1561:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getWhenKeyword_1());
            		
            // InternalGreenhouse.g:1581:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1582:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1582:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1583:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_2, grammarAccess.getStateAccess().getVariableVariableCrossReference_2_0());
            				

            }


            }

            // InternalGreenhouse.g:1594:3: ( ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) ) )
            // InternalGreenhouse.g:1595:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            {
            // InternalGreenhouse.g:1595:4: ( (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' ) )
            // InternalGreenhouse.g:1596:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            {
            // InternalGreenhouse.g:1596:5: (lv_op_3_1= '<' | lv_op_3_2= '>' | lv_op_3_3= '=' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGreenhouse.g:1597:6: lv_op_3_1= '<'
                    {
                    lv_op_3_1=(Token)match(input,42,FOLLOW_14); 

                    						newLeafNode(lv_op_3_1, grammarAccess.getStateAccess().getOpLessThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalGreenhouse.g:1608:6: lv_op_3_2= '>'
                    {
                    lv_op_3_2=(Token)match(input,43,FOLLOW_14); 

                    						newLeafNode(lv_op_3_2, grammarAccess.getStateAccess().getOpGreaterThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalGreenhouse.g:1619:6: lv_op_3_3= '='
                    {
                    lv_op_3_3=(Token)match(input,44,FOLLOW_14); 

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

            // InternalGreenhouse.g:1632:3: ( (lv_threshold_4_0= ruleExp ) )
            // InternalGreenhouse.g:1633:4: (lv_threshold_4_0= ruleExp )
            {
            // InternalGreenhouse.g:1633:4: (lv_threshold_4_0= ruleExp )
            // InternalGreenhouse.g:1634:5: lv_threshold_4_0= ruleExp
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
    // InternalGreenhouse.g:1655:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalGreenhouse.g:1655:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalGreenhouse.g:1656:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalGreenhouse.g:1662:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1668:2: ( (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1669:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1669:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1670:3: otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalGreenhouse.g:1674:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1675:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1675:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1676:5: lv_name_1_0= RULE_ID
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
    // InternalGreenhouse.g:1696:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGreenhouse.g:1696:47: (iv_ruleAction= ruleAction EOF )
            // InternalGreenhouse.g:1697:2: iv_ruleAction= ruleAction EOF
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
    // InternalGreenhouse.g:1703:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_trigger_4_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:1709:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) ) ) )
            // InternalGreenhouse.g:1710:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) ) )
            {
            // InternalGreenhouse.g:1710:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) ) )
            // InternalGreenhouse.g:1711:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= 'when' otherlv_3= 'receiving' ( (lv_trigger_4_0= ruleTrigger ) )
            {
            // InternalGreenhouse.g:1711:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGreenhouse.g:1712:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGreenhouse.g:1712:4: (lv_name_0_0= RULE_ID )
            // InternalGreenhouse.g:1713:5: lv_name_0_0= RULE_ID
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

            // InternalGreenhouse.g:1729:3: ( (otherlv_1= RULE_ID ) )
            // InternalGreenhouse.g:1730:4: (otherlv_1= RULE_ID )
            {
            // InternalGreenhouse.g:1730:4: (otherlv_1= RULE_ID )
            // InternalGreenhouse.g:1731:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getValueSettingValueCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getWhenKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getReceivingKeyword_3());
            		
            // InternalGreenhouse.g:1750:3: ( (lv_trigger_4_0= ruleTrigger ) )
            // InternalGreenhouse.g:1751:4: (lv_trigger_4_0= ruleTrigger )
            {
            // InternalGreenhouse.g:1751:4: (lv_trigger_4_0= ruleTrigger )
            // InternalGreenhouse.g:1752:5: lv_trigger_4_0= ruleTrigger
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
    // InternalGreenhouse.g:1773:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalGreenhouse.g:1773:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalGreenhouse.g:1774:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalGreenhouse.g:1780:1: ruleTrigger returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1786:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1787:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1787:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGreenhouse.g:1788:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalGreenhouse.g:1788:3: ()
            // InternalGreenhouse.g:1789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerAccess().getTriggerAction_0(),
            					current);
            			

            }

            // InternalGreenhouse.g:1795:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGreenhouse.g:1796:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGreenhouse.g:1796:4: (lv_name_1_0= RULE_ID )
            // InternalGreenhouse.g:1797:5: lv_name_1_0= RULE_ID
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
    // InternalGreenhouse.g:1817:1: entryRuleRowRuleSet returns [EObject current=null] : iv_ruleRowRuleSet= ruleRowRuleSet EOF ;
    public final EObject entryRuleRowRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowRuleSet = null;


        try {
            // InternalGreenhouse.g:1817:51: (iv_ruleRowRuleSet= ruleRowRuleSet EOF )
            // InternalGreenhouse.g:1818:2: iv_ruleRowRuleSet= ruleRowRuleSet EOF
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
    // InternalGreenhouse.g:1824:1: ruleRowRuleSet returns [EObject current=null] : (otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) ;
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
            // InternalGreenhouse.g:1830:2: ( (otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1831:2: (otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1831:2: (otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) ) )
            // InternalGreenhouse.g:1832:3: otherlv_0= 'rule' otherlv_1= 'trigger' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'when' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'is' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getRowRuleSetAccess().getRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRowRuleSetAccess().getTriggerKeyword_1());
            		
            // InternalGreenhouse.g:1840:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1841:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1841:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1842:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_2, grammarAccess.getRowRuleSetAccess().getTriggerTriggerCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRowRuleSetAccess().getOnKeyword_3());
            		
            // InternalGreenhouse.g:1857:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreenhouse.g:1858:4: (otherlv_4= RULE_ID )
            {
            // InternalGreenhouse.g:1858:4: (otherlv_4= RULE_ID )
            // InternalGreenhouse.g:1859:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_4, grammarAccess.getRowRuleSetAccess().getActuatorRowActuatorCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRowRuleSetAccess().getWhenKeyword_5());
            		
            // InternalGreenhouse.g:1874:3: ( (otherlv_6= RULE_ID ) )
            // InternalGreenhouse.g:1875:4: (otherlv_6= RULE_ID )
            {
            // InternalGreenhouse.g:1875:4: (otherlv_6= RULE_ID )
            // InternalGreenhouse.g:1876:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowRuleSetRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_6, grammarAccess.getRowRuleSetAccess().getSensorRowSensorCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRowRuleSetAccess().getIsKeyword_7());
            		
            // InternalGreenhouse.g:1891:3: ( (otherlv_8= RULE_ID ) )
            // InternalGreenhouse.g:1892:4: (otherlv_8= RULE_ID )
            {
            // InternalGreenhouse.g:1892:4: (otherlv_8= RULE_ID )
            // InternalGreenhouse.g:1893:5: otherlv_8= RULE_ID
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
    // InternalGreenhouse.g:1908:1: entryRuleGreenhouseRuleSet returns [EObject current=null] : iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF ;
    public final EObject entryRuleGreenhouseRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreenhouseRuleSet = null;


        try {
            // InternalGreenhouse.g:1908:58: (iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF )
            // InternalGreenhouse.g:1909:2: iv_ruleGreenhouseRuleSet= ruleGreenhouseRuleSet EOF
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
    // InternalGreenhouse.g:1915:1: ruleGreenhouseRuleSet returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= 'when' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (otherlv_9= RULE_ID ) ) ) ;
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
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalGreenhouse.g:1921:2: ( (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= 'when' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalGreenhouse.g:1922:2: (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= 'when' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalGreenhouse.g:1922:2: (otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= 'when' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (otherlv_9= RULE_ID ) ) )
            // InternalGreenhouse.g:1923:3: otherlv_0= 'global' otherlv_1= 'rule' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= 'when' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'is' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getGreenhouseRuleSetAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreenhouseRuleSetAccess().getRuleKeyword_1());
            		
            // InternalGreenhouse.g:1931:3: ( (otherlv_2= RULE_ID ) )
            // InternalGreenhouse.g:1932:4: (otherlv_2= RULE_ID )
            {
            // InternalGreenhouse.g:1932:4: (otherlv_2= RULE_ID )
            // InternalGreenhouse.g:1933:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_2, grammarAccess.getGreenhouseRuleSetAccess().getActuatorGreenhouseActuatorCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGreenhouseRuleSetAccess().getSetKeyword_3());
            		
            // InternalGreenhouse.g:1948:3: ( (otherlv_4= RULE_ID ) )
            // InternalGreenhouse.g:1949:4: (otherlv_4= RULE_ID )
            {
            // InternalGreenhouse.g:1949:4: (otherlv_4= RULE_ID )
            // InternalGreenhouse.g:1950:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_4, grammarAccess.getGreenhouseRuleSetAccess().getActionActionCrossReference_4_0());
            				

            }


            }

            // InternalGreenhouse.g:1961:3: ( (otherlv_5= RULE_ID ) )
            // InternalGreenhouse.g:1962:4: (otherlv_5= RULE_ID )
            {
            // InternalGreenhouse.g:1962:4: (otherlv_5= RULE_ID )
            // InternalGreenhouse.g:1963:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_5, grammarAccess.getGreenhouseRuleSetAccess().getSettingvalueSettingValueCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGreenhouseRuleSetAccess().getWhenKeyword_6());
            		
            // InternalGreenhouse.g:1978:3: ( (otherlv_7= RULE_ID ) )
            // InternalGreenhouse.g:1979:4: (otherlv_7= RULE_ID )
            {
            // InternalGreenhouse.g:1979:4: (otherlv_7= RULE_ID )
            // InternalGreenhouse.g:1980:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_7, grammarAccess.getGreenhouseRuleSetAccess().getSensorGreenhouseSensorCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getGreenhouseRuleSetAccess().getIsKeyword_8());
            		
            // InternalGreenhouse.g:1995:3: ( (otherlv_9= RULE_ID ) )
            // InternalGreenhouse.g:1996:4: (otherlv_9= RULE_ID )
            {
            // InternalGreenhouse.g:1996:4: (otherlv_9= RULE_ID )
            // InternalGreenhouse.g:1997:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreenhouseRuleSetRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getGreenhouseRuleSetAccess().getStateStateCrossReference_9_0());
            				

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
    // InternalGreenhouse.g:2012:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalGreenhouse.g:2012:44: (iv_ruleExp= ruleExp EOF )
            // InternalGreenhouse.g:2013:2: iv_ruleExp= ruleExp EOF
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
    // InternalGreenhouse.g:2019:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:2025:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalGreenhouse.g:2026:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalGreenhouse.g:2026:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalGreenhouse.g:2027:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGreenhouse.g:2035:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=51 && LA24_0<=52)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGreenhouse.g:2036:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalGreenhouse.g:2036:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==51) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==52) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalGreenhouse.g:2037:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalGreenhouse.g:2037:5: ( () otherlv_2= '+' )
            	            // InternalGreenhouse.g:2038:6: () otherlv_2= '+'
            	            {
            	            // InternalGreenhouse.g:2038:6: ()
            	            // InternalGreenhouse.g:2039:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,51,FOLLOW_14); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGreenhouse.g:2051:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalGreenhouse.g:2051:5: ( () otherlv_4= '-' )
            	            // InternalGreenhouse.g:2052:6: () otherlv_4= '-'
            	            {
            	            // InternalGreenhouse.g:2052:6: ()
            	            // InternalGreenhouse.g:2053:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_14); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalGreenhouse.g:2065:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalGreenhouse.g:2066:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalGreenhouse.g:2066:5: (lv_right_5_0= ruleFactor )
            	    // InternalGreenhouse.g:2067:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalGreenhouse.g:2089:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalGreenhouse.g:2089:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalGreenhouse.g:2090:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalGreenhouse.g:2096:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:2102:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalGreenhouse.g:2103:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalGreenhouse.g:2103:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalGreenhouse.g:2104:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGreenhouse.g:2112:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=53 && LA26_0<=54)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGreenhouse.g:2113:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalGreenhouse.g:2113:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==53) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==54) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalGreenhouse.g:2114:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalGreenhouse.g:2114:5: ( () otherlv_2= '*' )
            	            // InternalGreenhouse.g:2115:6: () otherlv_2= '*'
            	            {
            	            // InternalGreenhouse.g:2115:6: ()
            	            // InternalGreenhouse.g:2116:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,53,FOLLOW_14); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGreenhouse.g:2128:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalGreenhouse.g:2128:5: ( () otherlv_4= '/' )
            	            // InternalGreenhouse.g:2129:6: () otherlv_4= '/'
            	            {
            	            // InternalGreenhouse.g:2129:6: ()
            	            // InternalGreenhouse.g:2130:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,54,FOLLOW_14); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalGreenhouse.g:2142:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalGreenhouse.g:2143:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalGreenhouse.g:2143:5: (lv_right_5_0= rulePrimary )
            	    // InternalGreenhouse.g:2144:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
            	    break loop26;
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
    // InternalGreenhouse.g:2166:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGreenhouse.g:2166:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGreenhouse.g:2167:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalGreenhouse.g:2173:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Exp_3 = null;



        	enterRule();

        try {
            // InternalGreenhouse.g:2179:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) ) )
            // InternalGreenhouse.g:2180:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            {
            // InternalGreenhouse.g:2180:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            else if ( (LA27_0==55) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGreenhouse.g:2181:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalGreenhouse.g:2181:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalGreenhouse.g:2182:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalGreenhouse.g:2182:4: ()
                    // InternalGreenhouse.g:2183:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGreenhouse.g:2189:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalGreenhouse.g:2190:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalGreenhouse.g:2190:5: (lv_value_1_0= RULE_INT )
                    // InternalGreenhouse.g:2191:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

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
                    break;
                case 2 :
                    // InternalGreenhouse.g:2209:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    {
                    // InternalGreenhouse.g:2209:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    // InternalGreenhouse.g:2210:4: otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_43);
                    this_Exp_3=ruleExp();

                    state._fsp--;


                    				current = this_Exp_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,56,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "rulePrimary"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\uffff\1\11\2\uffff";
    static final String dfa_3s = "\1\45\2\4\1\uffff\1\46\1\25\1\4\1\20\2\uffff";
    static final String dfa_4s = "\1\45\1\57\1\4\1\uffff\1\46\1\25\1\4\1\47\2\uffff";
    static final String dfa_5s = "\3\uffff\1\3\4\uffff\1\1\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\52\uffff\1\3",
            "\1\4",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10\20\uffff\2\11\2\uffff\1\11\1\uffff\1\11",
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "918:2: (this_GreenhouseSensor_0= ruleGreenhouseSensor | this_GreenhouseActuator_1= ruleGreenhouseActuator | this_GreenhouseRuleSet_2= ruleGreenhouseRuleSet )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x008000000C000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});

}