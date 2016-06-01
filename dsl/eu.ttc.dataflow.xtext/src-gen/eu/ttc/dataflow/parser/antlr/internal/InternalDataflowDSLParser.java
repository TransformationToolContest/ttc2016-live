package eu.ttc.dataflow.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.ttc.dataflow.services.DataflowDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataflowDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllInstances'", "'{'", "'field'", "'type'", "'!'", "'::'", "'target'", "'}'", "'NewInstance'", "'instanceField'", "'key'", "'Filter'", "'filterBy'", "'rejectTarget'", "'Copy'", "'copyTarget'", "'Sort'", "'sortBy'", "'Product'", "'GetFeature'", "'objectField'", "'valueField'", "'feature'", "'SetFeature'", "'value'", "'NewContainer'", "'listField'", "'containerType'", "'AddToContainer'", "'position'", "'ForEach'", "'itemField'", "'positionField'", "'CollectBy'", "'elementField'", "'collectBy'", "'Evaluate'", "'expression'", "'if'", "'then'", "'else'", "'.'", "'('", "','", "')'", "'true'", "'false'", "'E'", "'e'", "'-'", "'list'", "'set'", "'or'", "'and'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'*'", "'/'", "'%'", "'not'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
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


        public InternalDataflowDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataflowDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataflowDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataflowDSL.g"; }



     	private DataflowDSLGrammarAccess grammarAccess;

        public InternalDataflowDSLParser(TokenStream input, DataflowDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DataflowDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDataflowDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDataflowDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalDataflowDSL.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalDataflowDSL.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:78:2: ( ( () ( (lv_elements_1_0= ruleElement ) )* ) )
            // InternalDataflowDSL.g:79:2: ( () ( (lv_elements_1_0= ruleElement ) )* )
            {
            // InternalDataflowDSL.g:79:2: ( () ( (lv_elements_1_0= ruleElement ) )* )
            // InternalDataflowDSL.g:80:3: () ( (lv_elements_1_0= ruleElement ) )*
            {
            // InternalDataflowDSL.g:80:3: ()
            // InternalDataflowDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalDataflowDSL.g:87:3: ( (lv_elements_1_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==19||LA1_0==22||LA1_0==25||LA1_0==27||(LA1_0>=29 && LA1_0<=30)||LA1_0==34||LA1_0==36||LA1_0==39||LA1_0==41||LA1_0==44||LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDataflowDSL.g:88:4: (lv_elements_1_0= ruleElement )
            	    {
            	    // InternalDataflowDSL.g:88:4: (lv_elements_1_0= ruleElement )
            	    // InternalDataflowDSL.g:89:5: lv_elements_1_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"eu.ttc.dataflow.DataflowDSL.Element");
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


    // $ANTLR start "entryRuleElement"
    // InternalDataflowDSL.g:110:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDataflowDSL.g:110:48: (iv_ruleElement= ruleElement EOF )
            // InternalDataflowDSL.g:111:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDataflowDSL.g:117:1: ruleElement returns [EObject current=null] : (this_AllInstances_0= ruleAllInstances | this_NewInstance_1= ruleNewInstance | this_Filter_2= ruleFilter | this_Sort_3= ruleSort | this_Copy_4= ruleCopy | this_Product_5= ruleProduct | this_GetFeature_6= ruleGetFeature | this_SetFeature_7= ruleSetFeature | this_NewContainer_8= ruleNewContainer | this_AddToContainer_9= ruleAddToContainer | this_ForEach_10= ruleForEach | this_CollectBy_11= ruleCollectBy | this_Evaluate_12= ruleEvaluate ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_AllInstances_0 = null;

        EObject this_NewInstance_1 = null;

        EObject this_Filter_2 = null;

        EObject this_Sort_3 = null;

        EObject this_Copy_4 = null;

        EObject this_Product_5 = null;

        EObject this_GetFeature_6 = null;

        EObject this_SetFeature_7 = null;

        EObject this_NewContainer_8 = null;

        EObject this_AddToContainer_9 = null;

        EObject this_ForEach_10 = null;

        EObject this_CollectBy_11 = null;

        EObject this_Evaluate_12 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:123:2: ( (this_AllInstances_0= ruleAllInstances | this_NewInstance_1= ruleNewInstance | this_Filter_2= ruleFilter | this_Sort_3= ruleSort | this_Copy_4= ruleCopy | this_Product_5= ruleProduct | this_GetFeature_6= ruleGetFeature | this_SetFeature_7= ruleSetFeature | this_NewContainer_8= ruleNewContainer | this_AddToContainer_9= ruleAddToContainer | this_ForEach_10= ruleForEach | this_CollectBy_11= ruleCollectBy | this_Evaluate_12= ruleEvaluate ) )
            // InternalDataflowDSL.g:124:2: (this_AllInstances_0= ruleAllInstances | this_NewInstance_1= ruleNewInstance | this_Filter_2= ruleFilter | this_Sort_3= ruleSort | this_Copy_4= ruleCopy | this_Product_5= ruleProduct | this_GetFeature_6= ruleGetFeature | this_SetFeature_7= ruleSetFeature | this_NewContainer_8= ruleNewContainer | this_AddToContainer_9= ruleAddToContainer | this_ForEach_10= ruleForEach | this_CollectBy_11= ruleCollectBy | this_Evaluate_12= ruleEvaluate )
            {
            // InternalDataflowDSL.g:124:2: (this_AllInstances_0= ruleAllInstances | this_NewInstance_1= ruleNewInstance | this_Filter_2= ruleFilter | this_Sort_3= ruleSort | this_Copy_4= ruleCopy | this_Product_5= ruleProduct | this_GetFeature_6= ruleGetFeature | this_SetFeature_7= ruleSetFeature | this_NewContainer_8= ruleNewContainer | this_AddToContainer_9= ruleAddToContainer | this_ForEach_10= ruleForEach | this_CollectBy_11= ruleCollectBy | this_Evaluate_12= ruleEvaluate )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 29:
                {
                alt2=6;
                }
                break;
            case 30:
                {
                alt2=7;
                }
                break;
            case 34:
                {
                alt2=8;
                }
                break;
            case 36:
                {
                alt2=9;
                }
                break;
            case 39:
                {
                alt2=10;
                }
                break;
            case 41:
                {
                alt2=11;
                }
                break;
            case 44:
                {
                alt2=12;
                }
                break;
            case 47:
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDataflowDSL.g:125:3: this_AllInstances_0= ruleAllInstances
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAllInstancesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllInstances_0=ruleAllInstances();

                    state._fsp--;


                    			current = this_AllInstances_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:134:3: this_NewInstance_1= ruleNewInstance
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getNewInstanceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NewInstance_1=ruleNewInstance();

                    state._fsp--;


                    			current = this_NewInstance_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:143:3: this_Filter_2= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_2=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:152:3: this_Sort_3= ruleSort
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSortParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sort_3=ruleSort();

                    state._fsp--;


                    			current = this_Sort_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDataflowDSL.g:161:3: this_Copy_4= ruleCopy
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCopyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Copy_4=ruleCopy();

                    state._fsp--;


                    			current = this_Copy_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDataflowDSL.g:170:3: this_Product_5= ruleProduct
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getProductParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Product_5=ruleProduct();

                    state._fsp--;


                    			current = this_Product_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDataflowDSL.g:179:3: this_GetFeature_6= ruleGetFeature
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getGetFeatureParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetFeature_6=ruleGetFeature();

                    state._fsp--;


                    			current = this_GetFeature_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDataflowDSL.g:188:3: this_SetFeature_7= ruleSetFeature
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSetFeatureParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetFeature_7=ruleSetFeature();

                    state._fsp--;


                    			current = this_SetFeature_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDataflowDSL.g:197:3: this_NewContainer_8= ruleNewContainer
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getNewContainerParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_NewContainer_8=ruleNewContainer();

                    state._fsp--;


                    			current = this_NewContainer_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDataflowDSL.g:206:3: this_AddToContainer_9= ruleAddToContainer
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAddToContainerParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddToContainer_9=ruleAddToContainer();

                    state._fsp--;


                    			current = this_AddToContainer_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDataflowDSL.g:215:3: this_ForEach_10= ruleForEach
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getForEachParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForEach_10=ruleForEach();

                    state._fsp--;


                    			current = this_ForEach_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDataflowDSL.g:224:3: this_CollectBy_11= ruleCollectBy
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCollectByParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectBy_11=ruleCollectBy();

                    state._fsp--;


                    			current = this_CollectBy_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDataflowDSL.g:233:3: this_Evaluate_12= ruleEvaluate
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEvaluateParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Evaluate_12=ruleEvaluate();

                    state._fsp--;


                    			current = this_Evaluate_12;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAllInstances"
    // InternalDataflowDSL.g:245:1: entryRuleAllInstances returns [EObject current=null] : iv_ruleAllInstances= ruleAllInstances EOF ;
    public final EObject entryRuleAllInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllInstances = null;


        try {
            // InternalDataflowDSL.g:245:53: (iv_ruleAllInstances= ruleAllInstances EOF )
            // InternalDataflowDSL.g:246:2: iv_ruleAllInstances= ruleAllInstances EOF
            {
             newCompositeNode(grammarAccess.getAllInstancesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllInstances=ruleAllInstances();

            state._fsp--;

             current =iv_ruleAllInstances; 
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
    // $ANTLR end "entryRuleAllInstances"


    // $ANTLR start "ruleAllInstances"
    // InternalDataflowDSL.g:252:1: ruleAllInstances returns [EObject current=null] : (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) )? (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleAllInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_field_4_0=null;
        Token otherlv_5=null;
        Token lv_model_6_0=null;
        Token otherlv_7=null;
        Token lv_packageName_8_0=null;
        Token otherlv_9=null;
        Token lv_typeName_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:258:2: ( (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) )? (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // InternalDataflowDSL.g:259:2: (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) )? (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // InternalDataflowDSL.g:259:2: (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) )? (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // InternalDataflowDSL.g:260:3: otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) )? (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAllInstancesAccess().getAllInstancesKeyword_0());
            		
            // InternalDataflowDSL.g:264:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:265:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:265:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:266:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAllInstancesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllInstancesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAllInstancesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:286:3: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataflowDSL.g:287:4: otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllInstancesAccess().getFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:291:4: ( (lv_field_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:292:5: (lv_field_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:292:5: (lv_field_4_0= RULE_ID )
                    // InternalDataflowDSL.g:293:6: lv_field_4_0= RULE_ID
                    {
                    lv_field_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_field_4_0, grammarAccess.getAllInstancesAccess().getFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllInstancesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:310:3: (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataflowDSL.g:311:4: otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAllInstancesAccess().getTypeKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:315:4: ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==15) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalDataflowDSL.g:316:5: ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!'
                            {
                            // InternalDataflowDSL.g:316:5: ( (lv_model_6_0= RULE_ID ) )
                            // InternalDataflowDSL.g:317:6: (lv_model_6_0= RULE_ID )
                            {
                            // InternalDataflowDSL.g:317:6: (lv_model_6_0= RULE_ID )
                            // InternalDataflowDSL.g:318:7: lv_model_6_0= RULE_ID
                            {
                            lv_model_6_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                            							newLeafNode(lv_model_6_0, grammarAccess.getAllInstancesAccess().getModelIDTerminalRuleCall_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAllInstancesRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"model",
                            								lv_model_6_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            otherlv_7=(Token)match(input,15,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getAllInstancesAccess().getExclamationMarkKeyword_4_1_1());
                            				

                            }
                            break;

                    }

                    // InternalDataflowDSL.g:339:4: ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==16) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDataflowDSL.g:340:5: ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::'
                            {
                            // InternalDataflowDSL.g:340:5: ( (lv_packageName_8_0= RULE_ID ) )
                            // InternalDataflowDSL.g:341:6: (lv_packageName_8_0= RULE_ID )
                            {
                            // InternalDataflowDSL.g:341:6: (lv_packageName_8_0= RULE_ID )
                            // InternalDataflowDSL.g:342:7: lv_packageName_8_0= RULE_ID
                            {
                            lv_packageName_8_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                            							newLeafNode(lv_packageName_8_0, grammarAccess.getAllInstancesAccess().getPackageNameIDTerminalRuleCall_4_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAllInstancesRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"packageName",
                            								lv_packageName_8_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            otherlv_9=(Token)match(input,16,FOLLOW_4); 

                            					newLeafNode(otherlv_9, grammarAccess.getAllInstancesAccess().getColonColonKeyword_4_2_1());
                            				

                            }
                            break;

                    }

                    // InternalDataflowDSL.g:363:4: ( (lv_typeName_10_0= RULE_ID ) )
                    // InternalDataflowDSL.g:364:5: (lv_typeName_10_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:364:5: (lv_typeName_10_0= RULE_ID )
                    // InternalDataflowDSL.g:365:6: lv_typeName_10_0= RULE_ID
                    {
                    lv_typeName_10_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_typeName_10_0, grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllInstancesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"typeName",
                    							lv_typeName_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:382:3: (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataflowDSL.g:383:4: otherlv_11= 'target' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getAllInstancesAccess().getTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:387:4: ( (otherlv_12= RULE_ID ) )
                    // InternalDataflowDSL.g:388:5: (otherlv_12= RULE_ID )
                    {
                    // InternalDataflowDSL.g:388:5: (otherlv_12= RULE_ID )
                    // InternalDataflowDSL.g:389:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllInstancesRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_12, grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAllInstances"


    // $ANTLR start "entryRuleNewInstance"
    // InternalDataflowDSL.g:409:1: entryRuleNewInstance returns [EObject current=null] : iv_ruleNewInstance= ruleNewInstance EOF ;
    public final EObject entryRuleNewInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewInstance = null;


        try {
            // InternalDataflowDSL.g:409:52: (iv_ruleNewInstance= ruleNewInstance EOF )
            // InternalDataflowDSL.g:410:2: iv_ruleNewInstance= ruleNewInstance EOF
            {
             newCompositeNode(grammarAccess.getNewInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewInstance=ruleNewInstance();

            state._fsp--;

             current =iv_ruleNewInstance; 
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
    // $ANTLR end "entryRuleNewInstance"


    // $ANTLR start "ruleNewInstance"
    // InternalDataflowDSL.g:416:1: ruleNewInstance returns [EObject current=null] : (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'instanceField' ( (lv_instanceField_4_0= RULE_ID ) ) )? (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) )? (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleNewInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_instanceField_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_model_8_0=null;
        Token otherlv_9=null;
        Token lv_packageName_10_0=null;
        Token otherlv_11=null;
        Token lv_typeName_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_key_6_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:422:2: ( (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'instanceField' ( (lv_instanceField_4_0= RULE_ID ) ) )? (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) )? (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' ) )
            // InternalDataflowDSL.g:423:2: (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'instanceField' ( (lv_instanceField_4_0= RULE_ID ) ) )? (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) )? (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' )
            {
            // InternalDataflowDSL.g:423:2: (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'instanceField' ( (lv_instanceField_4_0= RULE_ID ) ) )? (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) )? (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}' )
            // InternalDataflowDSL.g:424:3: otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'instanceField' ( (lv_instanceField_4_0= RULE_ID ) ) )? (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) )? (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNewInstanceAccess().getNewInstanceKeyword_0());
            		
            // InternalDataflowDSL.g:428:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:429:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:429:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:430:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNewInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNewInstanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:450:3: (otherlv_3= 'instanceField' ( (lv_instanceField_4_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataflowDSL.g:451:4: otherlv_3= 'instanceField' ( (lv_instanceField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getNewInstanceAccess().getInstanceFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:455:4: ( (lv_instanceField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:456:5: (lv_instanceField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:456:5: (lv_instanceField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:457:6: lv_instanceField_4_0= RULE_ID
                    {
                    lv_instanceField_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_instanceField_4_0, grammarAccess.getNewInstanceAccess().getInstanceFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewInstanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"instanceField",
                    							lv_instanceField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:474:3: (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataflowDSL.g:475:4: otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getNewInstanceAccess().getKeyKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:479:4: ( (lv_key_6_0= ruleConditionalExpression ) )
                    // InternalDataflowDSL.g:480:5: (lv_key_6_0= ruleConditionalExpression )
                    {
                    // InternalDataflowDSL.g:480:5: (lv_key_6_0= ruleConditionalExpression )
                    // InternalDataflowDSL.g:481:6: lv_key_6_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getNewInstanceAccess().getKeyConditionalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_key_6_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNewInstanceRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.ConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:499:3: (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataflowDSL.g:500:4: otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getNewInstanceAccess().getTypeKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:504:4: ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==15) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDataflowDSL.g:505:5: ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!'
                            {
                            // InternalDataflowDSL.g:505:5: ( (lv_model_8_0= RULE_ID ) )
                            // InternalDataflowDSL.g:506:6: (lv_model_8_0= RULE_ID )
                            {
                            // InternalDataflowDSL.g:506:6: (lv_model_8_0= RULE_ID )
                            // InternalDataflowDSL.g:507:7: lv_model_8_0= RULE_ID
                            {
                            lv_model_8_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                            							newLeafNode(lv_model_8_0, grammarAccess.getNewInstanceAccess().getModelIDTerminalRuleCall_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNewInstanceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"model",
                            								lv_model_8_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            otherlv_9=(Token)match(input,15,FOLLOW_4); 

                            					newLeafNode(otherlv_9, grammarAccess.getNewInstanceAccess().getExclamationMarkKeyword_5_1_1());
                            				

                            }
                            break;

                    }

                    // InternalDataflowDSL.g:528:4: ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==16) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDataflowDSL.g:529:5: ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::'
                            {
                            // InternalDataflowDSL.g:529:5: ( (lv_packageName_10_0= RULE_ID ) )
                            // InternalDataflowDSL.g:530:6: (lv_packageName_10_0= RULE_ID )
                            {
                            // InternalDataflowDSL.g:530:6: (lv_packageName_10_0= RULE_ID )
                            // InternalDataflowDSL.g:531:7: lv_packageName_10_0= RULE_ID
                            {
                            lv_packageName_10_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                            							newLeafNode(lv_packageName_10_0, grammarAccess.getNewInstanceAccess().getPackageNameIDTerminalRuleCall_5_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNewInstanceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"packageName",
                            								lv_packageName_10_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            otherlv_11=(Token)match(input,16,FOLLOW_4); 

                            					newLeafNode(otherlv_11, grammarAccess.getNewInstanceAccess().getColonColonKeyword_5_2_1());
                            				

                            }
                            break;

                    }

                    // InternalDataflowDSL.g:552:4: ( (lv_typeName_12_0= RULE_ID ) )
                    // InternalDataflowDSL.g:553:5: (lv_typeName_12_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:553:5: (lv_typeName_12_0= RULE_ID )
                    // InternalDataflowDSL.g:554:6: lv_typeName_12_0= RULE_ID
                    {
                    lv_typeName_12_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_typeName_12_0, grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewInstanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"typeName",
                    							lv_typeName_12_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:571:3: (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataflowDSL.g:572:4: otherlv_13= 'target' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getNewInstanceAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:576:4: ( (otherlv_14= RULE_ID ) )
                    // InternalDataflowDSL.g:577:5: (otherlv_14= RULE_ID )
                    {
                    // InternalDataflowDSL.g:577:5: (otherlv_14= RULE_ID )
                    // InternalDataflowDSL.g:578:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewInstanceRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_14, grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getNewInstanceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleNewInstance"


    // $ANTLR start "entryRuleFilter"
    // InternalDataflowDSL.g:598:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalDataflowDSL.g:598:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalDataflowDSL.g:599:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalDataflowDSL.g:605:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_filterBy_4_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:611:2: ( (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalDataflowDSL.g:612:2: (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:612:2: (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalDataflowDSL.g:613:3: otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalDataflowDSL.g:617:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:618:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:618:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:619:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:639:3: (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataflowDSL.g:640:4: otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getFilterByKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:644:4: ( (lv_filterBy_4_0= ruleConditionalExpression ) )
                    // InternalDataflowDSL.g:645:5: (lv_filterBy_4_0= ruleConditionalExpression )
                    {
                    // InternalDataflowDSL.g:645:5: (lv_filterBy_4_0= ruleConditionalExpression )
                    // InternalDataflowDSL.g:646:6: lv_filterBy_4_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getFilterAccess().getFilterByConditionalExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_filterBy_4_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilterRule());
                    						}
                    						set(
                    							current,
                    							"filterBy",
                    							lv_filterBy_4_0,
                    							"eu.ttc.dataflow.DataflowDSL.ConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:664:3: (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataflowDSL.g:665:4: otherlv_5= 'target' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getTargetKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:669:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDataflowDSL.g:670:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDataflowDSL.g:670:5: (otherlv_6= RULE_ID )
                    // InternalDataflowDSL.g:671:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_6, grammarAccess.getFilterAccess().getTargetElementCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:683:3: (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataflowDSL.g:684:4: otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getRejectTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:688:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDataflowDSL.g:689:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDataflowDSL.g:689:5: (otherlv_8= RULE_ID )
                    // InternalDataflowDSL.g:690:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_8, grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleCopy"
    // InternalDataflowDSL.g:710:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalDataflowDSL.g:710:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalDataflowDSL.g:711:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalDataflowDSL.g:717:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:723:2: ( (otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) )
            // InternalDataflowDSL.g:724:2: (otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            {
            // InternalDataflowDSL.g:724:2: (otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            // InternalDataflowDSL.g:725:3: otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCopyKeyword_0());
            		
            // InternalDataflowDSL.g:729:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:730:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:730:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:731:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCopyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getCopyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:751:3: (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataflowDSL.g:752:4: otherlv_3= 'target' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getTargetKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:756:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDataflowDSL.g:757:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDataflowDSL.g:757:5: (otherlv_4= RULE_ID )
                    // InternalDataflowDSL.g:758:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCopyRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_4, grammarAccess.getCopyAccess().getTargetElementCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:770:3: (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataflowDSL.g:771:4: otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getCopyTargetKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:775:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDataflowDSL.g:776:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDataflowDSL.g:776:5: (otherlv_6= RULE_ID )
                    // InternalDataflowDSL.g:777:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCopyRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_6, grammarAccess.getCopyAccess().getCopyTargetElementCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleSort"
    // InternalDataflowDSL.g:797:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // InternalDataflowDSL.g:797:45: (iv_ruleSort= ruleSort EOF )
            // InternalDataflowDSL.g:798:2: iv_ruleSort= ruleSort EOF
            {
             newCompositeNode(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSort=ruleSort();

            state._fsp--;

             current =iv_ruleSort; 
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
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // InternalDataflowDSL.g:804:1: ruleSort returns [EObject current=null] : (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_sortBy_4_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:810:2: ( (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' ) )
            // InternalDataflowDSL.g:811:2: (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            {
            // InternalDataflowDSL.g:811:2: (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}' )
            // InternalDataflowDSL.g:812:3: otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) )? (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSortAccess().getSortKeyword_0());
            		
            // InternalDataflowDSL.g:816:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:817:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:817:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:818:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSortAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:838:3: (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataflowDSL.g:839:4: otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getSortAccess().getSortByKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:843:4: ( (lv_sortBy_4_0= ruleConditionalExpression ) )
                    // InternalDataflowDSL.g:844:5: (lv_sortBy_4_0= ruleConditionalExpression )
                    {
                    // InternalDataflowDSL.g:844:5: (lv_sortBy_4_0= ruleConditionalExpression )
                    // InternalDataflowDSL.g:845:6: lv_sortBy_4_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getSortAccess().getSortByConditionalExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_sortBy_4_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSortRule());
                    						}
                    						set(
                    							current,
                    							"sortBy",
                    							lv_sortBy_4_0,
                    							"eu.ttc.dataflow.DataflowDSL.ConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:863:3: (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataflowDSL.g:864:4: otherlv_5= 'target' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSortAccess().getTargetKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:868:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDataflowDSL.g:869:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDataflowDSL.g:869:5: (otherlv_6= RULE_ID )
                    // InternalDataflowDSL.g:870:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSortRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_6, grammarAccess.getSortAccess().getTargetElementCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSortAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleProduct"
    // InternalDataflowDSL.g:890:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalDataflowDSL.g:890:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalDataflowDSL.g:891:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalDataflowDSL.g:897:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:903:2: ( (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' ) )
            // InternalDataflowDSL.g:904:2: (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' )
            {
            // InternalDataflowDSL.g:904:2: (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' )
            // InternalDataflowDSL.g:905:3: otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getProductKeyword_0());
            		
            // InternalDataflowDSL.g:909:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:910:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:910:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:911:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProductAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:931:3: (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataflowDSL.g:932:4: otherlv_3= 'target' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getProductAccess().getTargetKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:936:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDataflowDSL.g:937:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDataflowDSL.g:937:5: (otherlv_4= RULE_ID )
                    // InternalDataflowDSL.g:938:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProductRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getProductAccess().getTargetElementCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProductAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleGetFeature"
    // InternalDataflowDSL.g:958:1: entryRuleGetFeature returns [EObject current=null] : iv_ruleGetFeature= ruleGetFeature EOF ;
    public final EObject entryRuleGetFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetFeature = null;


        try {
            // InternalDataflowDSL.g:958:51: (iv_ruleGetFeature= ruleGetFeature EOF )
            // InternalDataflowDSL.g:959:2: iv_ruleGetFeature= ruleGetFeature EOF
            {
             newCompositeNode(grammarAccess.getGetFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetFeature=ruleGetFeature();

            state._fsp--;

             current =iv_ruleGetFeature; 
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
    // $ANTLR end "entryRuleGetFeature"


    // $ANTLR start "ruleGetFeature"
    // InternalDataflowDSL.g:965:1: ruleGetFeature returns [EObject current=null] : (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleGetFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_objectField_4_0=null;
        Token otherlv_5=null;
        Token lv_valueField_6_0=null;
        Token otherlv_7=null;
        Token lv_feature_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:971:2: ( (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:972:2: (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:972:2: (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:973:3: otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGetFeatureAccess().getGetFeatureKeyword_0());
            		
            // InternalDataflowDSL.g:977:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:978:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:978:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:979:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGetFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getGetFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:999:3: (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDataflowDSL.g:1000:4: otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getGetFeatureAccess().getObjectFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1004:4: ( (lv_objectField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1005:5: (lv_objectField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1005:5: (lv_objectField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1006:6: lv_objectField_4_0= RULE_ID
                    {
                    lv_objectField_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_objectField_4_0, grammarAccess.getGetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"objectField",
                    							lv_objectField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1023:3: (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataflowDSL.g:1024:4: otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGetFeatureAccess().getValueFieldKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1028:4: ( (lv_valueField_6_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1029:5: (lv_valueField_6_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1029:5: (lv_valueField_6_0= RULE_ID )
                    // InternalDataflowDSL.g:1030:6: lv_valueField_6_0= RULE_ID
                    {
                    lv_valueField_6_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_valueField_6_0, grammarAccess.getGetFeatureAccess().getValueFieldIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueField",
                    							lv_valueField_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1047:3: (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataflowDSL.g:1048:4: otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getGetFeatureAccess().getFeatureKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1052:4: ( (lv_feature_8_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1053:5: (lv_feature_8_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1053:5: (lv_feature_8_0= RULE_ID )
                    // InternalDataflowDSL.g:1054:6: lv_feature_8_0= RULE_ID
                    {
                    lv_feature_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_feature_8_0, grammarAccess.getGetFeatureAccess().getFeatureIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"feature",
                    							lv_feature_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1071:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataflowDSL.g:1072:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getGetFeatureAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:1076:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:1077:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1077:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:1078:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetFeatureRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGetFeatureAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleGetFeature"


    // $ANTLR start "entryRuleSetFeature"
    // InternalDataflowDSL.g:1098:1: entryRuleSetFeature returns [EObject current=null] : iv_ruleSetFeature= ruleSetFeature EOF ;
    public final EObject entryRuleSetFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetFeature = null;


        try {
            // InternalDataflowDSL.g:1098:51: (iv_ruleSetFeature= ruleSetFeature EOF )
            // InternalDataflowDSL.g:1099:2: iv_ruleSetFeature= ruleSetFeature EOF
            {
             newCompositeNode(grammarAccess.getSetFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetFeature=ruleSetFeature();

            state._fsp--;

             current =iv_ruleSetFeature; 
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
    // $ANTLR end "entryRuleSetFeature"


    // $ANTLR start "ruleSetFeature"
    // InternalDataflowDSL.g:1105:1: ruleSetFeature returns [EObject current=null] : (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleSetFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_objectField_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_feature_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1111:2: ( (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:1112:2: (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:1112:2: (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:1113:3: otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSetFeatureAccess().getSetFeatureKeyword_0());
            		
            // InternalDataflowDSL.g:1117:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1118:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1118:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1119:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSetFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSetFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1139:3: (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataflowDSL.g:1140:4: otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetFeatureAccess().getObjectFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1144:4: ( (lv_objectField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1145:5: (lv_objectField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1145:5: (lv_objectField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1146:6: lv_objectField_4_0= RULE_ID
                    {
                    lv_objectField_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_objectField_4_0, grammarAccess.getSetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"objectField",
                    							lv_objectField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1163:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataflowDSL.g:1164:4: otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getSetFeatureAccess().getValueKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1168:4: ( (lv_value_6_0= ruleConditionalExpression ) )
                    // InternalDataflowDSL.g:1169:5: (lv_value_6_0= ruleConditionalExpression )
                    {
                    // InternalDataflowDSL.g:1169:5: (lv_value_6_0= ruleConditionalExpression )
                    // InternalDataflowDSL.g:1170:6: lv_value_6_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getSetFeatureAccess().getValueConditionalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_value_6_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetFeatureRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.ConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1188:3: (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataflowDSL.g:1189:4: otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSetFeatureAccess().getFeatureKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1193:4: ( (lv_feature_8_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1194:5: (lv_feature_8_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1194:5: (lv_feature_8_0= RULE_ID )
                    // InternalDataflowDSL.g:1195:6: lv_feature_8_0= RULE_ID
                    {
                    lv_feature_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_feature_8_0, grammarAccess.getSetFeatureAccess().getFeatureIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"feature",
                    							lv_feature_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1212:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataflowDSL.g:1213:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getSetFeatureAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:1217:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:1218:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1218:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:1219:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetFeatureRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSetFeatureAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSetFeature"


    // $ANTLR start "entryRuleNewContainer"
    // InternalDataflowDSL.g:1239:1: entryRuleNewContainer returns [EObject current=null] : iv_ruleNewContainer= ruleNewContainer EOF ;
    public final EObject entryRuleNewContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContainer = null;


        try {
            // InternalDataflowDSL.g:1239:53: (iv_ruleNewContainer= ruleNewContainer EOF )
            // InternalDataflowDSL.g:1240:2: iv_ruleNewContainer= ruleNewContainer EOF
            {
             newCompositeNode(grammarAccess.getNewContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewContainer=ruleNewContainer();

            state._fsp--;

             current =iv_ruleNewContainer; 
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
    // $ANTLR end "entryRuleNewContainer"


    // $ANTLR start "ruleNewContainer"
    // InternalDataflowDSL.g:1246:1: ruleNewContainer returns [EObject current=null] : (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleNewContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_listField_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_containerType_6_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1252:2: ( (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalDataflowDSL.g:1253:2: (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:1253:2: (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalDataflowDSL.g:1254:3: otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNewContainerAccess().getNewContainerKeyword_0());
            		
            // InternalDataflowDSL.g:1258:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1259:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1259:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1260:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNewContainerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getNewContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1280:3: (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataflowDSL.g:1281:4: otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getNewContainerAccess().getListFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1285:4: ( (lv_listField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1286:5: (lv_listField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1286:5: (lv_listField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1287:6: lv_listField_4_0= RULE_ID
                    {
                    lv_listField_4_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(lv_listField_4_0, grammarAccess.getNewContainerAccess().getListFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"listField",
                    							lv_listField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1304:3: (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataflowDSL.g:1305:4: otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getNewContainerAccess().getContainerTypeKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1309:4: ( (lv_containerType_6_0= ruleContainerType ) )
                    // InternalDataflowDSL.g:1310:5: (lv_containerType_6_0= ruleContainerType )
                    {
                    // InternalDataflowDSL.g:1310:5: (lv_containerType_6_0= ruleContainerType )
                    // InternalDataflowDSL.g:1311:6: lv_containerType_6_0= ruleContainerType
                    {

                    						newCompositeNode(grammarAccess.getNewContainerAccess().getContainerTypeContainerTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_containerType_6_0=ruleContainerType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNewContainerRule());
                    						}
                    						set(
                    							current,
                    							"containerType",
                    							lv_containerType_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.ContainerType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1329:3: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataflowDSL.g:1330:4: otherlv_7= 'target' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getNewContainerAccess().getTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1334:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDataflowDSL.g:1335:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1335:5: (otherlv_8= RULE_ID )
                    // InternalDataflowDSL.g:1336:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewContainerRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_8, grammarAccess.getNewContainerAccess().getTargetElementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNewContainerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleNewContainer"


    // $ANTLR start "entryRuleAddToContainer"
    // InternalDataflowDSL.g:1356:1: entryRuleAddToContainer returns [EObject current=null] : iv_ruleAddToContainer= ruleAddToContainer EOF ;
    public final EObject entryRuleAddToContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddToContainer = null;


        try {
            // InternalDataflowDSL.g:1356:55: (iv_ruleAddToContainer= ruleAddToContainer EOF )
            // InternalDataflowDSL.g:1357:2: iv_ruleAddToContainer= ruleAddToContainer EOF
            {
             newCompositeNode(grammarAccess.getAddToContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddToContainer=ruleAddToContainer();

            state._fsp--;

             current =iv_ruleAddToContainer; 
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
    // $ANTLR end "entryRuleAddToContainer"


    // $ANTLR start "ruleAddToContainer"
    // InternalDataflowDSL.g:1363:1: ruleAddToContainer returns [EObject current=null] : (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAddToContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_listField_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_value_6_0 = null;

        EObject lv_position_8_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1369:2: ( (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:1370:2: (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:1370:2: (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:1371:3: otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddToContainerAccess().getAddToContainerKeyword_0());
            		
            // InternalDataflowDSL.g:1375:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1376:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1376:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1377:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAddToContainerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddToContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getAddToContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1397:3: (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataflowDSL.g:1398:4: otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddToContainerAccess().getListFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1402:4: ( (lv_listField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1403:5: (lv_listField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1403:5: (lv_listField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1404:6: lv_listField_4_0= RULE_ID
                    {
                    lv_listField_4_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(lv_listField_4_0, grammarAccess.getAddToContainerAccess().getListFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddToContainerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"listField",
                    							lv_listField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1421:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataflowDSL.g:1422:4: otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddToContainerAccess().getValueKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1426:4: ( (lv_value_6_0= ruleConditionalExpression ) )
                    // InternalDataflowDSL.g:1427:5: (lv_value_6_0= ruleConditionalExpression )
                    {
                    // InternalDataflowDSL.g:1427:5: (lv_value_6_0= ruleConditionalExpression )
                    // InternalDataflowDSL.g:1428:6: lv_value_6_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getAddToContainerAccess().getValueConditionalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_value_6_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddToContainerRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.ConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1446:3: (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataflowDSL.g:1447:4: otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddToContainerAccess().getPositionKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1451:4: ( (lv_position_8_0= ruleConditionalExpression ) )
                    // InternalDataflowDSL.g:1452:5: (lv_position_8_0= ruleConditionalExpression )
                    {
                    // InternalDataflowDSL.g:1452:5: (lv_position_8_0= ruleConditionalExpression )
                    // InternalDataflowDSL.g:1453:6: lv_position_8_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getAddToContainerAccess().getPositionConditionalExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_position_8_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddToContainerRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_8_0,
                    							"eu.ttc.dataflow.DataflowDSL.ConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1471:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataflowDSL.g:1472:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddToContainerAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:1476:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:1477:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1477:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:1478:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddToContainerRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAddToContainerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAddToContainer"


    // $ANTLR start "entryRuleForEach"
    // InternalDataflowDSL.g:1498:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalDataflowDSL.g:1498:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalDataflowDSL.g:1499:2: iv_ruleForEach= ruleForEach EOF
            {
             newCompositeNode(grammarAccess.getForEachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEach=ruleForEach();

            state._fsp--;

             current =iv_ruleForEach; 
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
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // InternalDataflowDSL.g:1505:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_listField_4_0=null;
        Token otherlv_5=null;
        Token lv_itemField_6_0=null;
        Token otherlv_7=null;
        Token lv_positionField_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:1511:2: ( (otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' ) )
            // InternalDataflowDSL.g:1512:2: (otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:1512:2: (otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}' )
            // InternalDataflowDSL.g:1513:3: otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) )? (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )? (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForEachKeyword_0());
            		
            // InternalDataflowDSL.g:1517:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1518:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1518:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1519:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForEachAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1539:3: (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataflowDSL.g:1540:4: otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getListFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1544:4: ( (lv_listField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1545:5: (lv_listField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1545:5: (lv_listField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1546:6: lv_listField_4_0= RULE_ID
                    {
                    lv_listField_4_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(lv_listField_4_0, grammarAccess.getForEachAccess().getListFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForEachRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"listField",
                    							lv_listField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1563:3: (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataflowDSL.g:1564:4: otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getForEachAccess().getItemFieldKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1568:4: ( (lv_itemField_6_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1569:5: (lv_itemField_6_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1569:5: (lv_itemField_6_0= RULE_ID )
                    // InternalDataflowDSL.g:1570:6: lv_itemField_6_0= RULE_ID
                    {
                    lv_itemField_6_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(lv_itemField_6_0, grammarAccess.getForEachAccess().getItemFieldIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForEachRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"itemField",
                    							lv_itemField_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1587:3: (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataflowDSL.g:1588:4: otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getForEachAccess().getPositionFieldKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1592:4: ( (lv_positionField_8_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1593:5: (lv_positionField_8_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1593:5: (lv_positionField_8_0= RULE_ID )
                    // InternalDataflowDSL.g:1594:6: lv_positionField_8_0= RULE_ID
                    {
                    lv_positionField_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_positionField_8_0, grammarAccess.getForEachAccess().getPositionFieldIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForEachRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"positionField",
                    							lv_positionField_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1611:3: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==17) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDataflowDSL.g:1612:4: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getForEachAccess().getTargetKeyword_6_0());
                    			
                    // InternalDataflowDSL.g:1616:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDataflowDSL.g:1617:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1617:5: (otherlv_10= RULE_ID )
                    // InternalDataflowDSL.g:1618:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForEachRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_10, grammarAccess.getForEachAccess().getTargetElementCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleCollectBy"
    // InternalDataflowDSL.g:1638:1: entryRuleCollectBy returns [EObject current=null] : iv_ruleCollectBy= ruleCollectBy EOF ;
    public final EObject entryRuleCollectBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectBy = null;


        try {
            // InternalDataflowDSL.g:1638:50: (iv_ruleCollectBy= ruleCollectBy EOF )
            // InternalDataflowDSL.g:1639:2: iv_ruleCollectBy= ruleCollectBy EOF
            {
             newCompositeNode(grammarAccess.getCollectByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectBy=ruleCollectBy();

            state._fsp--;

             current =iv_ruleCollectBy; 
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
    // $ANTLR end "entryRuleCollectBy"


    // $ANTLR start "ruleCollectBy"
    // InternalDataflowDSL.g:1645:1: ruleCollectBy returns [EObject current=null] : (otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'elementField' ( (lv_elementField_4_0= RULE_ID ) ) )? (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleCollectBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_elementField_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_collectBy_6_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1651:2: ( (otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'elementField' ( (lv_elementField_4_0= RULE_ID ) ) )? (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalDataflowDSL.g:1652:2: (otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'elementField' ( (lv_elementField_4_0= RULE_ID ) ) )? (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:1652:2: (otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'elementField' ( (lv_elementField_4_0= RULE_ID ) ) )? (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalDataflowDSL.g:1653:3: otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'elementField' ( (lv_elementField_4_0= RULE_ID ) ) )? (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectByAccess().getCollectByKeyword_0());
            		
            // InternalDataflowDSL.g:1657:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1658:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1658:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1659:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCollectByAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectByRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectByAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1679:3: (otherlv_3= 'elementField' ( (lv_elementField_4_0= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDataflowDSL.g:1680:4: otherlv_3= 'elementField' ( (lv_elementField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCollectByAccess().getElementFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1684:4: ( (lv_elementField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1685:5: (lv_elementField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1685:5: (lv_elementField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1686:6: lv_elementField_4_0= RULE_ID
                    {
                    lv_elementField_4_0=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(lv_elementField_4_0, grammarAccess.getCollectByAccess().getElementFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectByRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"elementField",
                    							lv_elementField_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1703:3: (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDataflowDSL.g:1704:4: otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) )
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getCollectByAccess().getCollectByKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1708:4: ( (lv_collectBy_6_0= ruleConditionalExpression ) )
                    // InternalDataflowDSL.g:1709:5: (lv_collectBy_6_0= ruleConditionalExpression )
                    {
                    // InternalDataflowDSL.g:1709:5: (lv_collectBy_6_0= ruleConditionalExpression )
                    // InternalDataflowDSL.g:1710:6: lv_collectBy_6_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getCollectByAccess().getCollectByConditionalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_collectBy_6_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectByRule());
                    						}
                    						set(
                    							current,
                    							"collectBy",
                    							lv_collectBy_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.ConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1728:3: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==17) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDataflowDSL.g:1729:4: otherlv_7= 'target' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getCollectByAccess().getTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1733:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDataflowDSL.g:1734:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1734:5: (otherlv_8= RULE_ID )
                    // InternalDataflowDSL.g:1735:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCollectByRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_8, grammarAccess.getCollectByAccess().getTargetElementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCollectByAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCollectBy"


    // $ANTLR start "entryRuleEvaluate"
    // InternalDataflowDSL.g:1755:1: entryRuleEvaluate returns [EObject current=null] : iv_ruleEvaluate= ruleEvaluate EOF ;
    public final EObject entryRuleEvaluate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluate = null;


        try {
            // InternalDataflowDSL.g:1755:49: (iv_ruleEvaluate= ruleEvaluate EOF )
            // InternalDataflowDSL.g:1756:2: iv_ruleEvaluate= ruleEvaluate EOF
            {
             newCompositeNode(grammarAccess.getEvaluateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluate=ruleEvaluate();

            state._fsp--;

             current =iv_ruleEvaluate; 
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
    // $ANTLR end "entryRuleEvaluate"


    // $ANTLR start "ruleEvaluate"
    // InternalDataflowDSL.g:1762:1: ruleEvaluate returns [EObject current=null] : (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleEvaluate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_field_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1768:2: ( (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalDataflowDSL.g:1769:2: (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:1769:2: (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalDataflowDSL.g:1770:3: otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvaluateAccess().getEvaluateKeyword_0());
            		
            // InternalDataflowDSL.g:1774:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1775:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1775:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1776:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvaluateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvaluateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getEvaluateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1796:3: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==13) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDataflowDSL.g:1797:4: otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvaluateAccess().getFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1801:4: ( (lv_field_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1802:5: (lv_field_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1802:5: (lv_field_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1803:6: lv_field_4_0= RULE_ID
                    {
                    lv_field_4_0=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(lv_field_4_0, grammarAccess.getEvaluateAccess().getFieldIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1820:3: (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDataflowDSL.g:1821:4: otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) )
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvaluateAccess().getExpressionKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1825:4: ( (lv_expression_6_0= ruleConditionalExpression ) )
                    // InternalDataflowDSL.g:1826:5: (lv_expression_6_0= ruleConditionalExpression )
                    {
                    // InternalDataflowDSL.g:1826:5: (lv_expression_6_0= ruleConditionalExpression )
                    // InternalDataflowDSL.g:1827:6: lv_expression_6_0= ruleConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEvaluateAccess().getExpressionConditionalExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_expression_6_0=ruleConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluateRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.ConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataflowDSL.g:1845:3: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==17) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDataflowDSL.g:1846:4: otherlv_7= 'target' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getEvaluateAccess().getTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1850:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDataflowDSL.g:1851:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1851:5: (otherlv_8= RULE_ID )
                    // InternalDataflowDSL.g:1852:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_8, grammarAccess.getEvaluateAccess().getTargetElementCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEvaluateAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEvaluate"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalDataflowDSL.g:1872:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalDataflowDSL.g:1872:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalDataflowDSL.g:1873:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;

             current =iv_ruleConditionalExpression; 
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
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalDataflowDSL.g:1879:1: ruleConditionalExpression returns [EObject current=null] : ( (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) ) | this_OrExpression_7= ruleOrExpression ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_OrExpression_1 = null;

        EObject lv_thenExpression_4_0 = null;

        EObject lv_elseExpression_6_0 = null;

        EObject this_OrExpression_7 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1885:2: ( ( (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) ) | this_OrExpression_7= ruleOrExpression ) )
            // InternalDataflowDSL.g:1886:2: ( (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) ) | this_OrExpression_7= ruleOrExpression )
            {
            // InternalDataflowDSL.g:1886:2: ( (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) ) | this_OrExpression_7= ruleOrExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||(LA47_0>=52 && LA47_0<=53)||(LA47_0>=56 && LA47_0<=57)||LA47_0==60||LA47_0==75) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalDataflowDSL.g:1887:3: (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) )
                    {
                    // InternalDataflowDSL.g:1887:3: (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) )
                    // InternalDataflowDSL.g:1888:4: otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) )
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionalExpressionAccess().getIfKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOrExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_39);
                    this_OrExpression_1=ruleOrExpression();

                    state._fsp--;


                    				current = this_OrExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDataflowDSL.g:1900:4: ()
                    // InternalDataflowDSL.g:1901:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionExpressionAction_0_2(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,50,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionalExpressionAccess().getThenKeyword_0_3());
                    			
                    // InternalDataflowDSL.g:1911:4: ( (lv_thenExpression_4_0= ruleOrExpression ) )
                    // InternalDataflowDSL.g:1912:5: (lv_thenExpression_4_0= ruleOrExpression )
                    {
                    // InternalDataflowDSL.g:1912:5: (lv_thenExpression_4_0= ruleOrExpression )
                    // InternalDataflowDSL.g:1913:6: lv_thenExpression_4_0= ruleOrExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getThenExpressionOrExpressionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_thenExpression_4_0=ruleOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"thenExpression",
                    							lv_thenExpression_4_0,
                    							"eu.ttc.dataflow.DataflowDSL.OrExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getConditionalExpressionAccess().getElseKeyword_0_5());
                    			
                    // InternalDataflowDSL.g:1934:4: ( (lv_elseExpression_6_0= ruleOrExpression ) )
                    // InternalDataflowDSL.g:1935:5: (lv_elseExpression_6_0= ruleOrExpression )
                    {
                    // InternalDataflowDSL.g:1935:5: (lv_elseExpression_6_0= ruleOrExpression )
                    // InternalDataflowDSL.g:1936:6: lv_elseExpression_6_0= ruleOrExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getElseExpressionOrExpressionParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseExpression_6_0=ruleOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"elseExpression",
                    							lv_elseExpression_6_0,
                    							"eu.ttc.dataflow.DataflowDSL.OrExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1955:3: this_OrExpression_7= ruleOrExpression
                    {

                    			newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOrExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrExpression_7=ruleOrExpression();

                    state._fsp--;


                    			current = this_OrExpression_7;
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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalDataflowDSL.g:1967:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDataflowDSL.g:1967:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDataflowDSL.g:1968:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalDataflowDSL.g:1974:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:1980:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )* ) )
            // InternalDataflowDSL.g:1981:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )* )
            {
            // InternalDataflowDSL.g:1981:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )* )
            // InternalDataflowDSL.g:1982:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:1990:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==63) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDataflowDSL.g:1991:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) )
            	    {
            	    // InternalDataflowDSL.g:1991:4: ()
            	    // InternalDataflowDSL.g:1992:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:1998:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalDataflowDSL.g:1999:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalDataflowDSL.g:1999:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalDataflowDSL.g:2000:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleOrOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"eu.ttc.dataflow.DataflowDSL.OrOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDataflowDSL.g:2017:4: ( (lv_rightExpression_3_0= ruleAndExpression ) )
            	    // InternalDataflowDSL.g:2018:5: (lv_rightExpression_3_0= ruleAndExpression )
            	    {
            	    // InternalDataflowDSL.g:2018:5: (lv_rightExpression_3_0= ruleAndExpression )
            	    // InternalDataflowDSL.g:2019:6: lv_rightExpression_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_rightExpression_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpression",
            	    							lv_rightExpression_3_0,
            	    							"eu.ttc.dataflow.DataflowDSL.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalDataflowDSL.g:2041:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDataflowDSL.g:2041:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDataflowDSL.g:2042:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalDataflowDSL.g:2048:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2054:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalDataflowDSL.g:2055:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2055:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )* )
            // InternalDataflowDSL.g:2056:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2064:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==64) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDataflowDSL.g:2065:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2065:4: ()
            	    // InternalDataflowDSL.g:2066:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2072:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalDataflowDSL.g:2073:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalDataflowDSL.g:2073:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalDataflowDSL.g:2074:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"eu.ttc.dataflow.DataflowDSL.AndOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDataflowDSL.g:2091:4: ( (lv_rightExpression_3_0= ruleEqualityExpression ) )
            	    // InternalDataflowDSL.g:2092:5: (lv_rightExpression_3_0= ruleEqualityExpression )
            	    {
            	    // InternalDataflowDSL.g:2092:5: (lv_rightExpression_3_0= ruleEqualityExpression )
            	    // InternalDataflowDSL.g:2093:6: lv_rightExpression_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExpressionEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_rightExpression_3_0=ruleEqualityExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpression",
            	    							lv_rightExpression_3_0,
            	    							"eu.ttc.dataflow.DataflowDSL.EqualityExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalDataflowDSL.g:2115:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalDataflowDSL.g:2115:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalDataflowDSL.g:2116:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalDataflowDSL.g:2122:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2128:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalDataflowDSL.g:2129:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2129:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )* )
            // InternalDataflowDSL.g:2130:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2138:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=65 && LA50_0<=66)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDataflowDSL.g:2139:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2139:4: ()
            	    // InternalDataflowDSL.g:2140:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2146:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalDataflowDSL.g:2147:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalDataflowDSL.g:2147:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalDataflowDSL.g:2148:6: lv_operator_2_0= ruleEqualityOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleEqualityOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"eu.ttc.dataflow.DataflowDSL.EqualityOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDataflowDSL.g:2165:4: ( (lv_rightExpression_3_0= ruleRelationalExpression ) )
            	    // InternalDataflowDSL.g:2166:5: (lv_rightExpression_3_0= ruleRelationalExpression )
            	    {
            	    // InternalDataflowDSL.g:2166:5: (lv_rightExpression_3_0= ruleRelationalExpression )
            	    // InternalDataflowDSL.g:2167:6: lv_rightExpression_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightExpressionRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_rightExpression_3_0=ruleRelationalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpression",
            	    							lv_rightExpression_3_0,
            	    							"eu.ttc.dataflow.DataflowDSL.RelationalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalDataflowDSL.g:2189:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalDataflowDSL.g:2189:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalDataflowDSL.g:2190:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalDataflowDSL.g:2196:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2202:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalDataflowDSL.g:2203:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2203:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )* )
            // InternalDataflowDSL.g:2204:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2212:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=67 && LA51_0<=70)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalDataflowDSL.g:2213:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2213:4: ()
            	    // InternalDataflowDSL.g:2214:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2220:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalDataflowDSL.g:2221:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalDataflowDSL.g:2221:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalDataflowDSL.g:2222:6: lv_operator_2_0= ruleRelationalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleRelationalOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"eu.ttc.dataflow.DataflowDSL.RelationalOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDataflowDSL.g:2239:4: ( (lv_rightExpression_3_0= ruleAdditiveExpression ) )
            	    // InternalDataflowDSL.g:2240:5: (lv_rightExpression_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalDataflowDSL.g:2240:5: (lv_rightExpression_3_0= ruleAdditiveExpression )
            	    // InternalDataflowDSL.g:2241:6: lv_rightExpression_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightExpressionAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_rightExpression_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpression",
            	    							lv_rightExpression_3_0,
            	    							"eu.ttc.dataflow.DataflowDSL.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalDataflowDSL.g:2263:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalDataflowDSL.g:2263:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalDataflowDSL.g:2264:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalDataflowDSL.g:2270:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2276:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalDataflowDSL.g:2277:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2277:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalDataflowDSL.g:2278:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2286:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==60||LA52_0==71) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDataflowDSL.g:2287:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2287:4: ()
            	    // InternalDataflowDSL.g:2288:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2294:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalDataflowDSL.g:2295:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalDataflowDSL.g:2295:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalDataflowDSL.g:2296:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"eu.ttc.dataflow.DataflowDSL.AdditiveOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDataflowDSL.g:2313:4: ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) )
            	    // InternalDataflowDSL.g:2314:5: (lv_rightExpression_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalDataflowDSL.g:2314:5: (lv_rightExpression_3_0= ruleMultiplicativeExpression )
            	    // InternalDataflowDSL.g:2315:6: lv_rightExpression_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExpressionMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_rightExpression_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpression",
            	    							lv_rightExpression_3_0,
            	    							"eu.ttc.dataflow.DataflowDSL.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalDataflowDSL.g:2337:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalDataflowDSL.g:2337:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalDataflowDSL.g:2338:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalDataflowDSL.g:2344:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2350:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalDataflowDSL.g:2351:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2351:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )* )
            // InternalDataflowDSL.g:2352:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2360:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=72 && LA53_0<=74)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalDataflowDSL.g:2361:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2361:4: ()
            	    // InternalDataflowDSL.g:2362:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2368:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalDataflowDSL.g:2369:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalDataflowDSL.g:2369:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalDataflowDSL.g:2370:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"eu.ttc.dataflow.DataflowDSL.MultiplicativeOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDataflowDSL.g:2387:4: ( (lv_rightExpression_3_0= ruleUnaryExpression ) )
            	    // InternalDataflowDSL.g:2388:5: (lv_rightExpression_3_0= ruleUnaryExpression )
            	    {
            	    // InternalDataflowDSL.g:2388:5: (lv_rightExpression_3_0= ruleUnaryExpression )
            	    // InternalDataflowDSL.g:2389:6: lv_rightExpression_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_rightExpression_3_0=ruleUnaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightExpression",
            	    							lv_rightExpression_3_0,
            	    							"eu.ttc.dataflow.DataflowDSL.UnaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalDataflowDSL.g:2411:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDataflowDSL.g:2411:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDataflowDSL.g:2412:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalDataflowDSL.g:2418:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_FeatureCallExpression_3= ruleFeatureCallExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_expression_2_0 = null;

        EObject this_FeatureCallExpression_3 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2424:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_FeatureCallExpression_3= ruleFeatureCallExpression ) )
            // InternalDataflowDSL.g:2425:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_FeatureCallExpression_3= ruleFeatureCallExpression )
            {
            // InternalDataflowDSL.g:2425:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_FeatureCallExpression_3= ruleFeatureCallExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==60||LA54_0==75) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_INT)||(LA54_0>=52 && LA54_0<=53)||(LA54_0>=56 && LA54_0<=57)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalDataflowDSL.g:2426:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalDataflowDSL.g:2426:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    // InternalDataflowDSL.g:2427:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) )
                    {
                    // InternalDataflowDSL.g:2427:4: ()
                    // InternalDataflowDSL.g:2428:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getUnaryOperationAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2434:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalDataflowDSL.g:2435:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalDataflowDSL.g:2435:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalDataflowDSL.g:2436:6: lv_operator_1_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_operator_1_0=ruleUnaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"eu.ttc.dataflow.DataflowDSL.UnaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataflowDSL.g:2453:4: ( (lv_expression_2_0= ruleUnaryExpression ) )
                    // InternalDataflowDSL.g:2454:5: (lv_expression_2_0= ruleUnaryExpression )
                    {
                    // InternalDataflowDSL.g:2454:5: (lv_expression_2_0= ruleUnaryExpression )
                    // InternalDataflowDSL.g:2455:6: lv_expression_2_0= ruleUnaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionUnaryExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleUnaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"eu.ttc.dataflow.DataflowDSL.UnaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2474:3: this_FeatureCallExpression_3= ruleFeatureCallExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getFeatureCallExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureCallExpression_3=ruleFeatureCallExpression();

                    state._fsp--;


                    			current = this_FeatureCallExpression_3;
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleFeatureCallExpression"
    // InternalDataflowDSL.g:2486:1: entryRuleFeatureCallExpression returns [EObject current=null] : iv_ruleFeatureCallExpression= ruleFeatureCallExpression EOF ;
    public final EObject entryRuleFeatureCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCallExpression = null;


        try {
            // InternalDataflowDSL.g:2486:62: (iv_ruleFeatureCallExpression= ruleFeatureCallExpression EOF )
            // InternalDataflowDSL.g:2487:2: iv_ruleFeatureCallExpression= ruleFeatureCallExpression EOF
            {
             newCompositeNode(grammarAccess.getFeatureCallExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCallExpression=ruleFeatureCallExpression();

            state._fsp--;

             current =iv_ruleFeatureCallExpression; 
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
    // $ANTLR end "entryRuleFeatureCallExpression"


    // $ANTLR start "ruleFeatureCallExpression"
    // InternalDataflowDSL.g:2493:1: ruleFeatureCallExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleFeatureCallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_feature_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2499:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // InternalDataflowDSL.g:2500:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // InternalDataflowDSL.g:2500:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )* )
            // InternalDataflowDSL.g:2501:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )*
            {

            			newCompositeNode(grammarAccess.getFeatureCallExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2509:3: ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==52) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDataflowDSL.g:2510:4: () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalDataflowDSL.g:2510:4: ()
            	    // InternalDataflowDSL.g:2511:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFeatureCallExpressionAccess().getFeatureCallTargetExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFeatureCallExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalDataflowDSL.g:2521:4: ( (lv_feature_3_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:2522:5: (lv_feature_3_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:2522:5: (lv_feature_3_0= RULE_ID )
            	    // InternalDataflowDSL.g:2523:6: lv_feature_3_0= RULE_ID
            	    {
            	    lv_feature_3_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    						newLeafNode(lv_feature_3_0, grammarAccess.getFeatureCallExpressionAccess().getFeatureIDTerminalRuleCall_1_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFeatureCallExpressionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"feature",
            	    							lv_feature_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalDataflowDSL.g:2539:4: (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==53) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalDataflowDSL.g:2540:5: otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            otherlv_4=(Token)match(input,53,FOLLOW_49); 

            	            					newLeafNode(otherlv_4, grammarAccess.getFeatureCallExpressionAccess().getLeftParenthesisKeyword_1_3_0());
            	            				
            	            // InternalDataflowDSL.g:2544:5: ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )?
            	            int alt56=2;
            	            int LA56_0 = input.LA(1);

            	            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_INT)||(LA56_0>=52 && LA56_0<=53)||(LA56_0>=56 && LA56_0<=57)||LA56_0==60||LA56_0==75) ) {
            	                alt56=1;
            	            }
            	            switch (alt56) {
            	                case 1 :
            	                    // InternalDataflowDSL.g:2545:6: ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )*
            	                    {
            	                    // InternalDataflowDSL.g:2545:6: ( (lv_parameters_5_0= ruleOrExpression ) )
            	                    // InternalDataflowDSL.g:2546:7: (lv_parameters_5_0= ruleOrExpression )
            	                    {
            	                    // InternalDataflowDSL.g:2546:7: (lv_parameters_5_0= ruleOrExpression )
            	                    // InternalDataflowDSL.g:2547:8: lv_parameters_5_0= ruleOrExpression
            	                    {

            	                    								newCompositeNode(grammarAccess.getFeatureCallExpressionAccess().getParametersOrExpressionParserRuleCall_1_3_1_0_0());
            	                    							
            	                    pushFollow(FOLLOW_50);
            	                    lv_parameters_5_0=ruleOrExpression();

            	                    state._fsp--;


            	                    								if (current==null) {
            	                    									current = createModelElementForParent(grammarAccess.getFeatureCallExpressionRule());
            	                    								}
            	                    								add(
            	                    									current,
            	                    									"parameters",
            	                    									lv_parameters_5_0,
            	                    									"eu.ttc.dataflow.DataflowDSL.OrExpression");
            	                    								afterParserOrEnumRuleCall();
            	                    							

            	                    }


            	                    }

            	                    // InternalDataflowDSL.g:2564:6: (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )*
            	                    loop55:
            	                    do {
            	                        int alt55=2;
            	                        int LA55_0 = input.LA(1);

            	                        if ( (LA55_0==54) ) {
            	                            alt55=1;
            	                        }


            	                        switch (alt55) {
            	                    	case 1 :
            	                    	    // InternalDataflowDSL.g:2565:7: otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,54,FOLLOW_14); 

            	                    	    							newLeafNode(otherlv_6, grammarAccess.getFeatureCallExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	    						
            	                    	    // InternalDataflowDSL.g:2569:7: ( (lv_parameters_7_0= ruleOrExpression ) )
            	                    	    // InternalDataflowDSL.g:2570:8: (lv_parameters_7_0= ruleOrExpression )
            	                    	    {
            	                    	    // InternalDataflowDSL.g:2570:8: (lv_parameters_7_0= ruleOrExpression )
            	                    	    // InternalDataflowDSL.g:2571:9: lv_parameters_7_0= ruleOrExpression
            	                    	    {

            	                    	    									newCompositeNode(grammarAccess.getFeatureCallExpressionAccess().getParametersOrExpressionParserRuleCall_1_3_1_1_1_0());
            	                    	    								
            	                    	    pushFollow(FOLLOW_50);
            	                    	    lv_parameters_7_0=ruleOrExpression();

            	                    	    state._fsp--;


            	                    	    									if (current==null) {
            	                    	    										current = createModelElementForParent(grammarAccess.getFeatureCallExpressionRule());
            	                    	    									}
            	                    	    									add(
            	                    	    										current,
            	                    	    										"parameters",
            	                    	    										lv_parameters_7_0,
            	                    	    										"eu.ttc.dataflow.DataflowDSL.OrExpression");
            	                    	    									afterParserOrEnumRuleCall();
            	                    	    								

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop55;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,55,FOLLOW_47); 

            	            					newLeafNode(otherlv_8, grammarAccess.getFeatureCallExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "ruleFeatureCallExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalDataflowDSL.g:2600:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalDataflowDSL.g:2600:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDataflowDSL.g:2601:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalDataflowDSL.g:2607:1: rulePrimaryExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_7_0=null;
        Token lv_field_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject this_OrExpression_11 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2613:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) ) )
            // InternalDataflowDSL.g:2614:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) )
            {
            // InternalDataflowDSL.g:2614:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) )
            int alt59=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==52) ) {
                    int LA59_7 = input.LA(3);

                    if ( (LA59_7==RULE_ID) ) {
                        alt59=1;
                    }
                    else if ( (LA59_7==RULE_INT) ) {
                        alt59=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 7, input);

                        throw nvae;
                    }
                }
                else if ( (LA59_1==EOF||LA59_1==14||(LA59_1>=17 && LA59_1<=18)||LA59_1==24||LA59_1==33||LA59_1==40||(LA59_1>=50 && LA59_1<=51)||(LA59_1>=54 && LA59_1<=55)||LA59_1==60||(LA59_1>=63 && LA59_1<=74)) ) {
                    alt59=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
                }
                break;
            case 56:
            case 57:
                {
                alt59=2;
                }
                break;
            case 52:
                {
                alt59=3;
                }
                break;
            case RULE_STRING:
                {
                alt59=4;
                }
                break;
            case RULE_ID:
                {
                alt59=5;
                }
                break;
            case 53:
                {
                alt59=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalDataflowDSL.g:2615:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalDataflowDSL.g:2615:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalDataflowDSL.g:2616:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalDataflowDSL.g:2616:4: ()
                    // InternalDataflowDSL.g:2617:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getIntegerLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2623:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalDataflowDSL.g:2624:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalDataflowDSL.g:2624:5: (lv_value_1_0= ruleEInt )
                    // InternalDataflowDSL.g:2625:6: lv_value_1_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueEIntParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"eu.ttc.dataflow.DataflowDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2644:3: ( () ( (lv_value_3_0= ruleEBoolean ) ) )
                    {
                    // InternalDataflowDSL.g:2644:3: ( () ( (lv_value_3_0= ruleEBoolean ) ) )
                    // InternalDataflowDSL.g:2645:4: () ( (lv_value_3_0= ruleEBoolean ) )
                    {
                    // InternalDataflowDSL.g:2645:4: ()
                    // InternalDataflowDSL.g:2646:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2652:4: ( (lv_value_3_0= ruleEBoolean ) )
                    // InternalDataflowDSL.g:2653:5: (lv_value_3_0= ruleEBoolean )
                    {
                    // InternalDataflowDSL.g:2653:5: (lv_value_3_0= ruleEBoolean )
                    // InternalDataflowDSL.g:2654:6: lv_value_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueEBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"eu.ttc.dataflow.DataflowDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:2673:3: ( () ( (lv_value_5_0= ruleEDouble ) ) )
                    {
                    // InternalDataflowDSL.g:2673:3: ( () ( (lv_value_5_0= ruleEDouble ) ) )
                    // InternalDataflowDSL.g:2674:4: () ( (lv_value_5_0= ruleEDouble ) )
                    {
                    // InternalDataflowDSL.g:2674:4: ()
                    // InternalDataflowDSL.g:2675:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2681:4: ( (lv_value_5_0= ruleEDouble ) )
                    // InternalDataflowDSL.g:2682:5: (lv_value_5_0= ruleEDouble )
                    {
                    // InternalDataflowDSL.g:2682:5: (lv_value_5_0= ruleEDouble )
                    // InternalDataflowDSL.g:2683:6: lv_value_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"eu.ttc.dataflow.DataflowDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:2702:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalDataflowDSL.g:2702:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalDataflowDSL.g:2703:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalDataflowDSL.g:2703:4: ()
                    // InternalDataflowDSL.g:2704:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2710:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalDataflowDSL.g:2711:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalDataflowDSL.g:2711:5: (lv_value_7_0= RULE_STRING )
                    // InternalDataflowDSL.g:2712:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDataflowDSL.g:2730:3: ( () ( (lv_field_9_0= RULE_ID ) ) )
                    {
                    // InternalDataflowDSL.g:2730:3: ( () ( (lv_field_9_0= RULE_ID ) ) )
                    // InternalDataflowDSL.g:2731:4: () ( (lv_field_9_0= RULE_ID ) )
                    {
                    // InternalDataflowDSL.g:2731:4: ()
                    // InternalDataflowDSL.g:2732:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getFieldReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2738:4: ( (lv_field_9_0= RULE_ID ) )
                    // InternalDataflowDSL.g:2739:5: (lv_field_9_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:2739:5: (lv_field_9_0= RULE_ID )
                    // InternalDataflowDSL.g:2740:6: lv_field_9_0= RULE_ID
                    {
                    lv_field_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_field_9_0, grammarAccess.getPrimaryExpressionAccess().getFieldIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"field",
                    							lv_field_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDataflowDSL.g:2758:3: (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' )
                    {
                    // InternalDataflowDSL.g:2758:3: (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' )
                    // InternalDataflowDSL.g:2759:4: otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,53,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_51);
                    this_OrExpression_11=ruleOrExpression();

                    state._fsp--;


                    				current = this_OrExpression_11;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,55,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_2());
                    			

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleEInt"
    // InternalDataflowDSL.g:2780:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDataflowDSL.g:2780:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDataflowDSL.g:2781:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDataflowDSL.g:2787:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2793:2: (this_INT_0= RULE_INT )
            // InternalDataflowDSL.g:2794:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalDataflowDSL.g:2804:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDataflowDSL.g:2804:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDataflowDSL.g:2805:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalDataflowDSL.g:2811:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2817:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDataflowDSL.g:2818:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDataflowDSL.g:2818:2: (kw= 'true' | kw= 'false' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==56) ) {
                alt60=1;
            }
            else if ( (LA60_0==57) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalDataflowDSL.g:2819:3: kw= 'true'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2825:3: kw= 'false'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDouble"
    // InternalDataflowDSL.g:2834:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDataflowDSL.g:2834:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDataflowDSL.g:2835:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDataflowDSL.g:2841:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2847:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalDataflowDSL.g:2848:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalDataflowDSL.g:2848:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalDataflowDSL.g:2849:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalDataflowDSL.g:2849:3: (this_INT_0= RULE_INT )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_INT) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalDataflowDSL.g:2850:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_52); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,52,FOLLOW_53); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_54); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalDataflowDSL.g:2870:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=58 && LA64_0<=59)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDataflowDSL.g:2871:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                    {
                    // InternalDataflowDSL.g:2871:4: (kw= 'E' | kw= 'e' )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==58) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==59) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalDataflowDSL.g:2872:5: kw= 'E'
                            {
                            kw=(Token)match(input,58,FOLLOW_55); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDataflowDSL.g:2878:5: kw= 'e'
                            {
                            kw=(Token)match(input,59,FOLLOW_55); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDataflowDSL.g:2884:4: (kw= '-' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==60) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalDataflowDSL.g:2885:5: kw= '-'
                            {
                            kw=(Token)match(input,60,FOLLOW_53); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1());
                            				

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleContainerType"
    // InternalDataflowDSL.g:2903:1: ruleContainerType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) ) ;
    public final Enumerator ruleContainerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2909:2: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) ) )
            // InternalDataflowDSL.g:2910:2: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) )
            {
            // InternalDataflowDSL.g:2910:2: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==61) ) {
                alt65=1;
            }
            else if ( (LA65_0==62) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalDataflowDSL.g:2911:3: (enumLiteral_0= 'list' )
                    {
                    // InternalDataflowDSL.g:2911:3: (enumLiteral_0= 'list' )
                    // InternalDataflowDSL.g:2912:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2919:3: (enumLiteral_1= 'set' )
                    {
                    // InternalDataflowDSL.g:2919:3: (enumLiteral_1= 'set' )
                    // InternalDataflowDSL.g:2920:4: enumLiteral_1= 'set'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleContainerType"


    // $ANTLR start "ruleOrOperator"
    // InternalDataflowDSL.g:2930:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2936:2: ( (enumLiteral_0= 'or' ) )
            // InternalDataflowDSL.g:2937:2: (enumLiteral_0= 'or' )
            {
            // InternalDataflowDSL.g:2937:2: (enumLiteral_0= 'or' )
            // InternalDataflowDSL.g:2938:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

            			current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalDataflowDSL.g:2947:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2953:2: ( (enumLiteral_0= 'and' ) )
            // InternalDataflowDSL.g:2954:2: (enumLiteral_0= 'and' )
            {
            // InternalDataflowDSL.g:2954:2: (enumLiteral_0= 'and' )
            // InternalDataflowDSL.g:2955:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

            			current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalDataflowDSL.g:2964:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2970:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) )
            // InternalDataflowDSL.g:2971:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalDataflowDSL.g:2971:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==65) ) {
                alt66=1;
            }
            else if ( (LA66_0==66) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalDataflowDSL.g:2972:3: (enumLiteral_0= '=' )
                    {
                    // InternalDataflowDSL.g:2972:3: (enumLiteral_0= '=' )
                    // InternalDataflowDSL.g:2973:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2980:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDataflowDSL.g:2980:3: (enumLiteral_1= '!=' )
                    // InternalDataflowDSL.g:2981:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalDataflowDSL.g:2991:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2997:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) )
            // InternalDataflowDSL.g:2998:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalDataflowDSL.g:2998:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            int alt67=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt67=1;
                }
                break;
            case 68:
                {
                alt67=2;
                }
                break;
            case 69:
                {
                alt67=3;
                }
                break;
            case 70:
                {
                alt67=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalDataflowDSL.g:2999:3: (enumLiteral_0= '>' )
                    {
                    // InternalDataflowDSL.g:2999:3: (enumLiteral_0= '>' )
                    // InternalDataflowDSL.g:3000:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3007:3: (enumLiteral_1= '>=' )
                    {
                    // InternalDataflowDSL.g:3007:3: (enumLiteral_1= '>=' )
                    // InternalDataflowDSL.g:3008:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:3015:3: (enumLiteral_2= '<' )
                    {
                    // InternalDataflowDSL.g:3015:3: (enumLiteral_2= '<' )
                    // InternalDataflowDSL.g:3016:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:3023:3: (enumLiteral_3= '<=' )
                    {
                    // InternalDataflowDSL.g:3023:3: (enumLiteral_3= '<=' )
                    // InternalDataflowDSL.g:3024:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalDataflowDSL.g:3034:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3040:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDataflowDSL.g:3041:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDataflowDSL.g:3041:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==71) ) {
                alt68=1;
            }
            else if ( (LA68_0==60) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalDataflowDSL.g:3042:3: (enumLiteral_0= '+' )
                    {
                    // InternalDataflowDSL.g:3042:3: (enumLiteral_0= '+' )
                    // InternalDataflowDSL.g:3043:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3050:3: (enumLiteral_1= '-' )
                    {
                    // InternalDataflowDSL.g:3050:3: (enumLiteral_1= '-' )
                    // InternalDataflowDSL.g:3051:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalDataflowDSL.g:3061:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3067:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalDataflowDSL.g:3068:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalDataflowDSL.g:3068:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt69=1;
                }
                break;
            case 73:
                {
                alt69=2;
                }
                break;
            case 74:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalDataflowDSL.g:3069:3: (enumLiteral_0= '*' )
                    {
                    // InternalDataflowDSL.g:3069:3: (enumLiteral_0= '*' )
                    // InternalDataflowDSL.g:3070:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3077:3: (enumLiteral_1= '/' )
                    {
                    // InternalDataflowDSL.g:3077:3: (enumLiteral_1= '/' )
                    // InternalDataflowDSL.g:3078:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:3085:3: (enumLiteral_2= '%' )
                    {
                    // InternalDataflowDSL.g:3085:3: (enumLiteral_2= '%' )
                    // InternalDataflowDSL.g:3086:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalDataflowDSL.g:3096:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3102:2: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) )
            // InternalDataflowDSL.g:3103:2: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDataflowDSL.g:3103:2: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==75) ) {
                alt70=1;
            }
            else if ( (LA70_0==60) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalDataflowDSL.g:3104:3: (enumLiteral_0= 'not' )
                    {
                    // InternalDataflowDSL.g:3104:3: (enumLiteral_0= 'not' )
                    // InternalDataflowDSL.g:3105:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3112:3: (enumLiteral_1= '-' )
                    {
                    // InternalDataflowDSL.g:3112:3: (enumLiteral_1= '-' )
                    // InternalDataflowDSL.g:3113:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleUnaryOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000092946A480802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000066000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000364000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000264000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1332000000000070L,0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001860000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004060000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010060000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000380060000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300060000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000A80060000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000A00060000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000060000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000060000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000012800060000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010800060000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000060000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000C2000060000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0000060000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000060000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000600000060000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000060000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000062000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000060000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x13B2000000000070L,0x0000000000000800L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000040L});

}