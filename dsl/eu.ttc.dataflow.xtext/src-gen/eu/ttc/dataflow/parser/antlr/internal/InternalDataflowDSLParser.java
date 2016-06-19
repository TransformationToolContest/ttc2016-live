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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllInstances'", "'{'", "'field'", "'type'", "'!'", "'::'", "'target'", "'}'", "'NewInstance'", "'key'", "'Filter'", "'filterBy'", "'rejectTarget'", "'Copy'", "'copyTarget'", "'Sort'", "'sortBy'", "'Product'", "'GetFeature'", "'objectField'", "'valueField'", "'feature'", "'SetFeature'", "'value'", "'NewContainer'", "'containerType'", "'AddToContainer'", "'position'", "'ForEach'", "'listField'", "'itemField'", "'positionField'", "'CollectBy'", "'collectBy'", "'Evaluate'", "'expression'", "'if'", "'then'", "'else'", "'.'", "'('", "','", "')'", "'true'", "'false'", "'E'", "'e'", "'-'", "'list'", "'set'", "'or'", "'and'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'*'", "'/'", "'%'", "'not'"
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

                if ( (LA1_0==11||LA1_0==19||LA1_0==21||LA1_0==24||LA1_0==26||(LA1_0>=28 && LA1_0<=29)||LA1_0==33||LA1_0==35||LA1_0==37||LA1_0==39||LA1_0==43||LA1_0==45) ) {
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
            case 21:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 28:
                {
                alt2=6;
                }
                break;
            case 29:
                {
                alt2=7;
                }
                break;
            case 33:
                {
                alt2=8;
                }
                break;
            case 35:
                {
                alt2=9;
                }
                break;
            case 37:
                {
                alt2=10;
                }
                break;
            case 39:
                {
                alt2=11;
                }
                break;
            case 43:
                {
                alt2=12;
                }
                break;
            case 45:
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
    // InternalDataflowDSL.g:252:1: ruleAllInstances returns [EObject current=null] : (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) ) | (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' ) ;
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
            // InternalDataflowDSL.g:258:2: ( (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) ) | (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' ) )
            // InternalDataflowDSL.g:259:2: (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) ) | (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' )
            {
            // InternalDataflowDSL.g:259:2: (otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) ) | (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' )
            // InternalDataflowDSL.g:260:3: otherlv_0= 'AllInstances' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) ) | (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}'
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
            		
            // InternalDataflowDSL.g:286:3: ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) ) | (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) ) )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt5=1;
                    }
                    break;
                case 14:
                    {
                    alt5=2;
                    }
                    break;
                case 17:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalDataflowDSL.g:287:4: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:287:4: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:288:5: otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getAllInstancesAccess().getFieldKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:292:5: ( (lv_field_4_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:293:6: (lv_field_4_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:293:6: (lv_field_4_0= RULE_ID )
            	    // InternalDataflowDSL.g:294:7: lv_field_4_0= RULE_ID
            	    {
            	    lv_field_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    							newLeafNode(lv_field_4_0, grammarAccess.getAllInstancesAccess().getFieldIDTerminalRuleCall_3_0_1_0());
            	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:312:4: (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:312:4: (otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:313:5: otherlv_5= 'type' ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )? ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )? ( (lv_typeName_10_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getAllInstancesAccess().getTypeKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:317:5: ( ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_ID) ) {
            	        int LA3_1 = input.LA(2);

            	        if ( (LA3_1==15) ) {
            	            alt3=1;
            	        }
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalDataflowDSL.g:318:6: ( (lv_model_6_0= RULE_ID ) ) otherlv_7= '!'
            	            {
            	            // InternalDataflowDSL.g:318:6: ( (lv_model_6_0= RULE_ID ) )
            	            // InternalDataflowDSL.g:319:7: (lv_model_6_0= RULE_ID )
            	            {
            	            // InternalDataflowDSL.g:319:7: (lv_model_6_0= RULE_ID )
            	            // InternalDataflowDSL.g:320:8: lv_model_6_0= RULE_ID
            	            {
            	            lv_model_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	            								newLeafNode(lv_model_6_0, grammarAccess.getAllInstancesAccess().getModelIDTerminalRuleCall_3_1_1_0_0());
            	            							

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

            	            						newLeafNode(otherlv_7, grammarAccess.getAllInstancesAccess().getExclamationMarkKeyword_3_1_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalDataflowDSL.g:341:5: ( ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_ID) ) {
            	        int LA4_1 = input.LA(2);

            	        if ( (LA4_1==16) ) {
            	            alt4=1;
            	        }
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalDataflowDSL.g:342:6: ( (lv_packageName_8_0= RULE_ID ) ) otherlv_9= '::'
            	            {
            	            // InternalDataflowDSL.g:342:6: ( (lv_packageName_8_0= RULE_ID ) )
            	            // InternalDataflowDSL.g:343:7: (lv_packageName_8_0= RULE_ID )
            	            {
            	            // InternalDataflowDSL.g:343:7: (lv_packageName_8_0= RULE_ID )
            	            // InternalDataflowDSL.g:344:8: lv_packageName_8_0= RULE_ID
            	            {
            	            lv_packageName_8_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	            								newLeafNode(lv_packageName_8_0, grammarAccess.getAllInstancesAccess().getPackageNameIDTerminalRuleCall_3_1_2_0_0());
            	            							

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

            	            						newLeafNode(otherlv_9, grammarAccess.getAllInstancesAccess().getColonColonKeyword_3_1_2_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalDataflowDSL.g:365:5: ( (lv_typeName_10_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:366:6: (lv_typeName_10_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:366:6: (lv_typeName_10_0= RULE_ID )
            	    // InternalDataflowDSL.g:367:7: lv_typeName_10_0= RULE_ID
            	    {
            	    lv_typeName_10_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    							newLeafNode(lv_typeName_10_0, grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_3_1_3_0());
            	    						

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


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:385:4: (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:385:4: (otherlv_11= 'target' ( (otherlv_12= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:386:5: otherlv_11= 'target' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_11, grammarAccess.getAllInstancesAccess().getTargetKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:390:5: ( (otherlv_12= RULE_ID ) )
            	    // InternalDataflowDSL.g:391:6: (otherlv_12= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:391:6: (otherlv_12= RULE_ID )
            	    // InternalDataflowDSL.g:392:7: otherlv_12= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getAllInstancesRule());
            	    							}
            	    						
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    							newLeafNode(otherlv_12, grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_3_2_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:413:1: entryRuleNewInstance returns [EObject current=null] : iv_ruleNewInstance= ruleNewInstance EOF ;
    public final EObject entryRuleNewInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewInstance = null;


        try {
            // InternalDataflowDSL.g:413:52: (iv_ruleNewInstance= ruleNewInstance EOF )
            // InternalDataflowDSL.g:414:2: iv_ruleNewInstance= ruleNewInstance EOF
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
    // InternalDataflowDSL.g:420:1: ruleNewInstance returns [EObject current=null] : (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) ) ) | (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) ) | (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) ) )* otherlv_15= '}' ) ;
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
            // InternalDataflowDSL.g:426:2: ( (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) ) ) | (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) ) | (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) ) )* otherlv_15= '}' ) )
            // InternalDataflowDSL.g:427:2: (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) ) ) | (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) ) | (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) ) )* otherlv_15= '}' )
            {
            // InternalDataflowDSL.g:427:2: (otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) ) ) | (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) ) | (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) ) )* otherlv_15= '}' )
            // InternalDataflowDSL.g:428:3: otherlv_0= 'NewInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) ) ) | (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) ) | (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNewInstanceAccess().getNewInstanceKeyword_0());
            		
            // InternalDataflowDSL.g:432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:433:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:434:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getNewInstanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:454:3: ( (otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) ) ) | (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) ) | (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) ) )*
            loop8:
            do {
                int alt8=5;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt8=1;
                    }
                    break;
                case 20:
                    {
                    alt8=2;
                    }
                    break;
                case 14:
                    {
                    alt8=3;
                    }
                    break;
                case 17:
                    {
                    alt8=4;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalDataflowDSL.g:455:4: (otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:455:4: (otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:456:5: otherlv_3= 'field' ( (lv_instanceField_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getNewInstanceAccess().getFieldKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:460:5: ( (lv_instanceField_4_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:461:6: (lv_instanceField_4_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:461:6: (lv_instanceField_4_0= RULE_ID )
            	    // InternalDataflowDSL.g:462:7: lv_instanceField_4_0= RULE_ID
            	    {
            	    lv_instanceField_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    							newLeafNode(lv_instanceField_4_0, grammarAccess.getNewInstanceAccess().getInstanceFieldIDTerminalRuleCall_3_0_1_0());
            	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:480:4: (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) )
            	    {
            	    // InternalDataflowDSL.g:480:4: (otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) ) )
            	    // InternalDataflowDSL.g:481:5: otherlv_5= 'key' ( (lv_key_6_0= ruleConditionalExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getNewInstanceAccess().getKeyKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:485:5: ( (lv_key_6_0= ruleConditionalExpression ) )
            	    // InternalDataflowDSL.g:486:6: (lv_key_6_0= ruleConditionalExpression )
            	    {
            	    // InternalDataflowDSL.g:486:6: (lv_key_6_0= ruleConditionalExpression )
            	    // InternalDataflowDSL.g:487:7: lv_key_6_0= ruleConditionalExpression
            	    {

            	    							newCompositeNode(grammarAccess.getNewInstanceAccess().getKeyConditionalExpressionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_9);
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


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:506:4: (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:506:4: (otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:507:5: otherlv_7= 'type' ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )? ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )? ( (lv_typeName_12_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getNewInstanceAccess().getTypeKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:511:5: ( ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_ID) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==15) ) {
            	            alt6=1;
            	        }
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalDataflowDSL.g:512:6: ( (lv_model_8_0= RULE_ID ) ) otherlv_9= '!'
            	            {
            	            // InternalDataflowDSL.g:512:6: ( (lv_model_8_0= RULE_ID ) )
            	            // InternalDataflowDSL.g:513:7: (lv_model_8_0= RULE_ID )
            	            {
            	            // InternalDataflowDSL.g:513:7: (lv_model_8_0= RULE_ID )
            	            // InternalDataflowDSL.g:514:8: lv_model_8_0= RULE_ID
            	            {
            	            lv_model_8_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	            								newLeafNode(lv_model_8_0, grammarAccess.getNewInstanceAccess().getModelIDTerminalRuleCall_3_2_1_0_0());
            	            							

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

            	            						newLeafNode(otherlv_9, grammarAccess.getNewInstanceAccess().getExclamationMarkKeyword_3_2_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalDataflowDSL.g:535:5: ( ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_ID) ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1==16) ) {
            	            alt7=1;
            	        }
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalDataflowDSL.g:536:6: ( (lv_packageName_10_0= RULE_ID ) ) otherlv_11= '::'
            	            {
            	            // InternalDataflowDSL.g:536:6: ( (lv_packageName_10_0= RULE_ID ) )
            	            // InternalDataflowDSL.g:537:7: (lv_packageName_10_0= RULE_ID )
            	            {
            	            // InternalDataflowDSL.g:537:7: (lv_packageName_10_0= RULE_ID )
            	            // InternalDataflowDSL.g:538:8: lv_packageName_10_0= RULE_ID
            	            {
            	            lv_packageName_10_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	            								newLeafNode(lv_packageName_10_0, grammarAccess.getNewInstanceAccess().getPackageNameIDTerminalRuleCall_3_2_2_0_0());
            	            							

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

            	            						newLeafNode(otherlv_11, grammarAccess.getNewInstanceAccess().getColonColonKeyword_3_2_2_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalDataflowDSL.g:559:5: ( (lv_typeName_12_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:560:6: (lv_typeName_12_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:560:6: (lv_typeName_12_0= RULE_ID )
            	    // InternalDataflowDSL.g:561:7: lv_typeName_12_0= RULE_ID
            	    {
            	    lv_typeName_12_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    							newLeafNode(lv_typeName_12_0, grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_3_2_3_0());
            	    						

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


            	    }
            	    break;
            	case 4 :
            	    // InternalDataflowDSL.g:579:4: (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:579:4: (otherlv_13= 'target' ( (otherlv_14= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:580:5: otherlv_13= 'target' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_13, grammarAccess.getNewInstanceAccess().getTargetKeyword_3_3_0());
            	    				
            	    // InternalDataflowDSL.g:584:5: ( (otherlv_14= RULE_ID ) )
            	    // InternalDataflowDSL.g:585:6: (otherlv_14= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:585:6: (otherlv_14= RULE_ID )
            	    // InternalDataflowDSL.g:586:7: otherlv_14= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getNewInstanceRule());
            	    							}
            	    						
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    							newLeafNode(otherlv_14, grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_3_3_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getNewInstanceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:607:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalDataflowDSL.g:607:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalDataflowDSL.g:608:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalDataflowDSL.g:614:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' ) ;
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
            // InternalDataflowDSL.g:620:2: ( (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' ) )
            // InternalDataflowDSL.g:621:2: (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:621:2: (otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' )
            // InternalDataflowDSL.g:622:3: otherlv_0= 'Filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalDataflowDSL.g:626:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:627:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:627:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:628:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:648:3: ( (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) | (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    alt9=1;
                    }
                    break;
                case 17:
                    {
                    alt9=2;
                    }
                    break;
                case 23:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalDataflowDSL.g:649:4: (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) )
            	    {
            	    // InternalDataflowDSL.g:649:4: (otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) ) )
            	    // InternalDataflowDSL.g:650:5: otherlv_3= 'filterBy' ( (lv_filterBy_4_0= ruleConditionalExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_10); 

            	    					newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getFilterByKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:654:5: ( (lv_filterBy_4_0= ruleConditionalExpression ) )
            	    // InternalDataflowDSL.g:655:6: (lv_filterBy_4_0= ruleConditionalExpression )
            	    {
            	    // InternalDataflowDSL.g:655:6: (lv_filterBy_4_0= ruleConditionalExpression )
            	    // InternalDataflowDSL.g:656:7: lv_filterBy_4_0= ruleConditionalExpression
            	    {

            	    							newCompositeNode(grammarAccess.getFilterAccess().getFilterByConditionalExpressionParserRuleCall_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_11);
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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:675:4: (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:675:4: (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:676:5: otherlv_5= 'target' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getTargetKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:680:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalDataflowDSL.g:681:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:681:6: (otherlv_6= RULE_ID )
            	    // InternalDataflowDSL.g:682:7: otherlv_6= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getFilterRule());
            	    							}
            	    						
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    							newLeafNode(otherlv_6, grammarAccess.getFilterAccess().getTargetElementCrossReference_3_1_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:695:4: (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:695:4: (otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:696:5: otherlv_7= 'rejectTarget' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getRejectTargetKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:700:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDataflowDSL.g:701:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:701:6: (otherlv_8= RULE_ID )
            	    // InternalDataflowDSL.g:702:7: otherlv_8= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getFilterRule());
            	    							}
            	    						
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    							newLeafNode(otherlv_8, grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_3_2_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:723:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalDataflowDSL.g:723:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalDataflowDSL.g:724:2: iv_ruleCopy= ruleCopy EOF
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
    // InternalDataflowDSL.g:730:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}' ) ;
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
            // InternalDataflowDSL.g:736:2: ( (otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}' ) )
            // InternalDataflowDSL.g:737:2: (otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}' )
            {
            // InternalDataflowDSL.g:737:2: (otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}' )
            // InternalDataflowDSL.g:738:3: otherlv_0= 'Copy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCopyKeyword_0());
            		
            // InternalDataflowDSL.g:742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:743:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:744:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCopyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:764:3: ( (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }
                else if ( (LA10_0==25) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDataflowDSL.g:765:4: (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:765:4: (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:766:5: otherlv_3= 'target' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getTargetKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:770:5: ( (otherlv_4= RULE_ID ) )
            	    // InternalDataflowDSL.g:771:6: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:771:6: (otherlv_4= RULE_ID )
            	    // InternalDataflowDSL.g:772:7: otherlv_4= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getCopyRule());
            	    							}
            	    						
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    							newLeafNode(otherlv_4, grammarAccess.getCopyAccess().getTargetElementCrossReference_3_0_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:785:4: (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:785:4: (otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:786:5: otherlv_5= 'copyTarget' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,25,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getCopyTargetKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:790:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalDataflowDSL.g:791:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:791:6: (otherlv_6= RULE_ID )
            	    // InternalDataflowDSL.g:792:7: otherlv_6= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getCopyRule());
            	    							}
            	    						
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    							newLeafNode(otherlv_6, grammarAccess.getCopyAccess().getCopyTargetElementCrossReference_3_1_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:813:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // InternalDataflowDSL.g:813:45: (iv_ruleSort= ruleSort EOF )
            // InternalDataflowDSL.g:814:2: iv_ruleSort= ruleSort EOF
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
    // InternalDataflowDSL.g:820:1: ruleSort returns [EObject current=null] : (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}' ) ;
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
            // InternalDataflowDSL.g:826:2: ( (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}' ) )
            // InternalDataflowDSL.g:827:2: (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}' )
            {
            // InternalDataflowDSL.g:827:2: (otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}' )
            // InternalDataflowDSL.g:828:3: otherlv_0= 'Sort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSortAccess().getSortKeyword_0());
            		
            // InternalDataflowDSL.g:832:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:833:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:833:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:834:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSortAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:854:3: ( (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) ) | (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }
                else if ( (LA11_0==17) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDataflowDSL.g:855:4: (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) )
            	    {
            	    // InternalDataflowDSL.g:855:4: (otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) ) )
            	    // InternalDataflowDSL.g:856:5: otherlv_3= 'sortBy' ( (lv_sortBy_4_0= ruleConditionalExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_10); 

            	    					newLeafNode(otherlv_3, grammarAccess.getSortAccess().getSortByKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:860:5: ( (lv_sortBy_4_0= ruleConditionalExpression ) )
            	    // InternalDataflowDSL.g:861:6: (lv_sortBy_4_0= ruleConditionalExpression )
            	    {
            	    // InternalDataflowDSL.g:861:6: (lv_sortBy_4_0= ruleConditionalExpression )
            	    // InternalDataflowDSL.g:862:7: lv_sortBy_4_0= ruleConditionalExpression
            	    {

            	    							newCompositeNode(grammarAccess.getSortAccess().getSortByConditionalExpressionParserRuleCall_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_13);
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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:881:4: (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:881:4: (otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:882:5: otherlv_5= 'target' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSortAccess().getTargetKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:886:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalDataflowDSL.g:887:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:887:6: (otherlv_6= RULE_ID )
            	    // InternalDataflowDSL.g:888:7: otherlv_6= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSortRule());
            	    							}
            	    						
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    							newLeafNode(otherlv_6, grammarAccess.getSortAccess().getTargetElementCrossReference_3_1_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSortAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:909:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalDataflowDSL.g:909:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalDataflowDSL.g:910:2: iv_ruleProduct= ruleProduct EOF
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
    // InternalDataflowDSL.g:916:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' ) ;
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
            // InternalDataflowDSL.g:922:2: ( (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' ) )
            // InternalDataflowDSL.g:923:2: (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' )
            {
            // InternalDataflowDSL.g:923:2: (otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}' )
            // InternalDataflowDSL.g:924:3: otherlv_0= 'Product' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getProductKeyword_0());
            		
            // InternalDataflowDSL.g:928:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:929:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:929:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:930:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:950:3: (otherlv_3= 'target' ( (otherlv_4= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataflowDSL.g:951:4: otherlv_3= 'target' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getProductAccess().getTargetKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:955:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDataflowDSL.g:956:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDataflowDSL.g:956:5: (otherlv_4= RULE_ID )
                    // InternalDataflowDSL.g:957:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProductRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

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
    // InternalDataflowDSL.g:977:1: entryRuleGetFeature returns [EObject current=null] : iv_ruleGetFeature= ruleGetFeature EOF ;
    public final EObject entryRuleGetFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetFeature = null;


        try {
            // InternalDataflowDSL.g:977:51: (iv_ruleGetFeature= ruleGetFeature EOF )
            // InternalDataflowDSL.g:978:2: iv_ruleGetFeature= ruleGetFeature EOF
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
    // InternalDataflowDSL.g:984:1: ruleGetFeature returns [EObject current=null] : (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' ) ;
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
            // InternalDataflowDSL.g:990:2: ( (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' ) )
            // InternalDataflowDSL.g:991:2: (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:991:2: (otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' )
            // InternalDataflowDSL.g:992:3: otherlv_0= 'GetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGetFeatureAccess().getGetFeatureKeyword_0());
            		
            // InternalDataflowDSL.g:996:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:997:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:997:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:998:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getGetFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1018:3: ( (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )*
            loop13:
            do {
                int alt13=5;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt13=1;
                    }
                    break;
                case 31:
                    {
                    alt13=2;
                    }
                    break;
                case 32:
                    {
                    alt13=3;
                    }
                    break;
                case 17:
                    {
                    alt13=4;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalDataflowDSL.g:1019:4: (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1019:4: (otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1020:5: otherlv_3= 'objectField' ( (lv_objectField_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getGetFeatureAccess().getObjectFieldKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:1024:5: ( (lv_objectField_4_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1025:6: (lv_objectField_4_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1025:6: (lv_objectField_4_0= RULE_ID )
            	    // InternalDataflowDSL.g:1026:7: lv_objectField_4_0= RULE_ID
            	    {
            	    lv_objectField_4_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    							newLeafNode(lv_objectField_4_0, grammarAccess.getGetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_0_1_0());
            	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:1044:4: (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1044:4: (otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1045:5: otherlv_5= 'valueField' ( (lv_valueField_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,31,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getGetFeatureAccess().getValueFieldKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:1049:5: ( (lv_valueField_6_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1050:6: (lv_valueField_6_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1050:6: (lv_valueField_6_0= RULE_ID )
            	    // InternalDataflowDSL.g:1051:7: lv_valueField_6_0= RULE_ID
            	    {
            	    lv_valueField_6_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    							newLeafNode(lv_valueField_6_0, grammarAccess.getGetFeatureAccess().getValueFieldIDTerminalRuleCall_3_1_1_0());
            	    						

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


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:1069:4: (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1069:4: (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1070:5: otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getGetFeatureAccess().getFeatureKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:1074:5: ( (lv_feature_8_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1075:6: (lv_feature_8_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1075:6: (lv_feature_8_0= RULE_ID )
            	    // InternalDataflowDSL.g:1076:7: lv_feature_8_0= RULE_ID
            	    {
            	    lv_feature_8_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    							newLeafNode(lv_feature_8_0, grammarAccess.getGetFeatureAccess().getFeatureIDTerminalRuleCall_3_2_1_0());
            	    						

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


            	    }
            	    break;
            	case 4 :
            	    // InternalDataflowDSL.g:1094:4: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1094:4: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1095:5: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_9, grammarAccess.getGetFeatureAccess().getTargetKeyword_3_3_0());
            	    				
            	    // InternalDataflowDSL.g:1099:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalDataflowDSL.g:1100:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1100:6: (otherlv_10= RULE_ID )
            	    // InternalDataflowDSL.g:1101:7: otherlv_10= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGetFeatureRule());
            	    							}
            	    						
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    							newLeafNode(otherlv_10, grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_3_3_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGetFeatureAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:1122:1: entryRuleSetFeature returns [EObject current=null] : iv_ruleSetFeature= ruleSetFeature EOF ;
    public final EObject entryRuleSetFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetFeature = null;


        try {
            // InternalDataflowDSL.g:1122:51: (iv_ruleSetFeature= ruleSetFeature EOF )
            // InternalDataflowDSL.g:1123:2: iv_ruleSetFeature= ruleSetFeature EOF
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
    // InternalDataflowDSL.g:1129:1: ruleSetFeature returns [EObject current=null] : (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' ) ;
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
            // InternalDataflowDSL.g:1135:2: ( (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' ) )
            // InternalDataflowDSL.g:1136:2: (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:1136:2: (otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' )
            // InternalDataflowDSL.g:1137:3: otherlv_0= 'SetFeature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSetFeatureAccess().getSetFeatureKeyword_0());
            		
            // InternalDataflowDSL.g:1141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1142:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1143:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSetFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1163:3: ( (otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )*
            loop14:
            do {
                int alt14=5;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt14=1;
                    }
                    break;
                case 34:
                    {
                    alt14=2;
                    }
                    break;
                case 32:
                    {
                    alt14=3;
                    }
                    break;
                case 17:
                    {
                    alt14=4;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalDataflowDSL.g:1164:4: (otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1164:4: (otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1165:5: otherlv_3= 'field' ( (lv_objectField_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getSetFeatureAccess().getFieldKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:1169:5: ( (lv_objectField_4_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1170:6: (lv_objectField_4_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1170:6: (lv_objectField_4_0= RULE_ID )
            	    // InternalDataflowDSL.g:1171:7: lv_objectField_4_0= RULE_ID
            	    {
            	    lv_objectField_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    							newLeafNode(lv_objectField_4_0, grammarAccess.getSetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_0_1_0());
            	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:1189:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )
            	    {
            	    // InternalDataflowDSL.g:1189:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )
            	    // InternalDataflowDSL.g:1190:5: otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSetFeatureAccess().getValueKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:1194:5: ( (lv_value_6_0= ruleConditionalExpression ) )
            	    // InternalDataflowDSL.g:1195:6: (lv_value_6_0= ruleConditionalExpression )
            	    {
            	    // InternalDataflowDSL.g:1195:6: (lv_value_6_0= ruleConditionalExpression )
            	    // InternalDataflowDSL.g:1196:7: lv_value_6_0= ruleConditionalExpression
            	    {

            	    							newCompositeNode(grammarAccess.getSetFeatureAccess().getValueConditionalExpressionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_17);
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


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:1215:4: (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1215:4: (otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1216:5: otherlv_7= 'feature' ( (lv_feature_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getSetFeatureAccess().getFeatureKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:1220:5: ( (lv_feature_8_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1221:6: (lv_feature_8_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1221:6: (lv_feature_8_0= RULE_ID )
            	    // InternalDataflowDSL.g:1222:7: lv_feature_8_0= RULE_ID
            	    {
            	    lv_feature_8_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    							newLeafNode(lv_feature_8_0, grammarAccess.getSetFeatureAccess().getFeatureIDTerminalRuleCall_3_2_1_0());
            	    						

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


            	    }
            	    break;
            	case 4 :
            	    // InternalDataflowDSL.g:1240:4: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1240:4: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1241:5: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_9, grammarAccess.getSetFeatureAccess().getTargetKeyword_3_3_0());
            	    				
            	    // InternalDataflowDSL.g:1245:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalDataflowDSL.g:1246:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1246:6: (otherlv_10= RULE_ID )
            	    // InternalDataflowDSL.g:1247:7: otherlv_10= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSetFeatureRule());
            	    							}
            	    						
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    							newLeafNode(otherlv_10, grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_3_3_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSetFeatureAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:1268:1: entryRuleNewContainer returns [EObject current=null] : iv_ruleNewContainer= ruleNewContainer EOF ;
    public final EObject entryRuleNewContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewContainer = null;


        try {
            // InternalDataflowDSL.g:1268:53: (iv_ruleNewContainer= ruleNewContainer EOF )
            // InternalDataflowDSL.g:1269:2: iv_ruleNewContainer= ruleNewContainer EOF
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
    // InternalDataflowDSL.g:1275:1: ruleNewContainer returns [EObject current=null] : (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) ;
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
            // InternalDataflowDSL.g:1281:2: ( (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' ) )
            // InternalDataflowDSL.g:1282:2: (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:1282:2: (otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}' )
            // InternalDataflowDSL.g:1283:3: otherlv_0= 'NewContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) )? (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )? (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNewContainerAccess().getNewContainerKeyword_0());
            		
            // InternalDataflowDSL.g:1287:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1288:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1288:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1289:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNewContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1309:3: (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataflowDSL.g:1310:4: otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getNewContainerAccess().getFieldKeyword_3_0());
                    			
                    // InternalDataflowDSL.g:1314:4: ( (lv_listField_4_0= RULE_ID ) )
                    // InternalDataflowDSL.g:1315:5: (lv_listField_4_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1315:5: (lv_listField_4_0= RULE_ID )
                    // InternalDataflowDSL.g:1316:6: lv_listField_4_0= RULE_ID
                    {
                    lv_listField_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalDataflowDSL.g:1333:3: (otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataflowDSL.g:1334:4: otherlv_5= 'containerType' ( (lv_containerType_6_0= ruleContainerType ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getNewContainerAccess().getContainerTypeKeyword_4_0());
                    			
                    // InternalDataflowDSL.g:1338:4: ( (lv_containerType_6_0= ruleContainerType ) )
                    // InternalDataflowDSL.g:1339:5: (lv_containerType_6_0= ruleContainerType )
                    {
                    // InternalDataflowDSL.g:1339:5: (lv_containerType_6_0= ruleContainerType )
                    // InternalDataflowDSL.g:1340:6: lv_containerType_6_0= ruleContainerType
                    {

                    						newCompositeNode(grammarAccess.getNewContainerAccess().getContainerTypeContainerTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            // InternalDataflowDSL.g:1358:3: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataflowDSL.g:1359:4: otherlv_7= 'target' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getNewContainerAccess().getTargetKeyword_5_0());
                    			
                    // InternalDataflowDSL.g:1363:4: ( (otherlv_8= RULE_ID ) )
                    // InternalDataflowDSL.g:1364:5: (otherlv_8= RULE_ID )
                    {
                    // InternalDataflowDSL.g:1364:5: (otherlv_8= RULE_ID )
                    // InternalDataflowDSL.g:1365:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNewContainerRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_15); 

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
    // InternalDataflowDSL.g:1385:1: entryRuleAddToContainer returns [EObject current=null] : iv_ruleAddToContainer= ruleAddToContainer EOF ;
    public final EObject entryRuleAddToContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddToContainer = null;


        try {
            // InternalDataflowDSL.g:1385:55: (iv_ruleAddToContainer= ruleAddToContainer EOF )
            // InternalDataflowDSL.g:1386:2: iv_ruleAddToContainer= ruleAddToContainer EOF
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
    // InternalDataflowDSL.g:1392:1: ruleAddToContainer returns [EObject current=null] : (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' ) ;
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
            // InternalDataflowDSL.g:1398:2: ( (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' ) )
            // InternalDataflowDSL.g:1399:2: (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:1399:2: (otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' )
            // InternalDataflowDSL.g:1400:3: otherlv_0= 'AddToContainer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddToContainerAccess().getAddToContainerKeyword_0());
            		
            // InternalDataflowDSL.g:1404:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1405:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1405:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1406:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAddToContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1426:3: ( (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )*
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt18=1;
                    }
                    break;
                case 34:
                    {
                    alt18=2;
                    }
                    break;
                case 38:
                    {
                    alt18=3;
                    }
                    break;
                case 17:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalDataflowDSL.g:1427:4: (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1427:4: (otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1428:5: otherlv_3= 'field' ( (lv_listField_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getAddToContainerAccess().getFieldKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:1432:5: ( (lv_listField_4_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1433:6: (lv_listField_4_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1433:6: (lv_listField_4_0= RULE_ID )
            	    // InternalDataflowDSL.g:1434:7: lv_listField_4_0= RULE_ID
            	    {
            	    lv_listField_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    							newLeafNode(lv_listField_4_0, grammarAccess.getAddToContainerAccess().getListFieldIDTerminalRuleCall_3_0_1_0());
            	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:1452:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )
            	    {
            	    // InternalDataflowDSL.g:1452:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) ) )
            	    // InternalDataflowDSL.g:1453:5: otherlv_5= 'value' ( (lv_value_6_0= ruleConditionalExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getAddToContainerAccess().getValueKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:1457:5: ( (lv_value_6_0= ruleConditionalExpression ) )
            	    // InternalDataflowDSL.g:1458:6: (lv_value_6_0= ruleConditionalExpression )
            	    {
            	    // InternalDataflowDSL.g:1458:6: (lv_value_6_0= ruleConditionalExpression )
            	    // InternalDataflowDSL.g:1459:7: lv_value_6_0= ruleConditionalExpression
            	    {

            	    							newCompositeNode(grammarAccess.getAddToContainerAccess().getValueConditionalExpressionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
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


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:1478:4: (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) )
            	    {
            	    // InternalDataflowDSL.g:1478:4: (otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) ) )
            	    // InternalDataflowDSL.g:1479:5: otherlv_7= 'position' ( (lv_position_8_0= ruleConditionalExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_10); 

            	    					newLeafNode(otherlv_7, grammarAccess.getAddToContainerAccess().getPositionKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:1483:5: ( (lv_position_8_0= ruleConditionalExpression ) )
            	    // InternalDataflowDSL.g:1484:6: (lv_position_8_0= ruleConditionalExpression )
            	    {
            	    // InternalDataflowDSL.g:1484:6: (lv_position_8_0= ruleConditionalExpression )
            	    // InternalDataflowDSL.g:1485:7: lv_position_8_0= ruleConditionalExpression
            	    {

            	    							newCompositeNode(grammarAccess.getAddToContainerAccess().getPositionConditionalExpressionParserRuleCall_3_2_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
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


            	    }
            	    break;
            	case 4 :
            	    // InternalDataflowDSL.g:1504:4: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1504:4: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1505:5: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_9, grammarAccess.getAddToContainerAccess().getTargetKeyword_3_3_0());
            	    				
            	    // InternalDataflowDSL.g:1509:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalDataflowDSL.g:1510:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1510:6: (otherlv_10= RULE_ID )
            	    // InternalDataflowDSL.g:1511:7: otherlv_10= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getAddToContainerRule());
            	    							}
            	    						
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    							newLeafNode(otherlv_10, grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_3_3_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAddToContainerAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:1532:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalDataflowDSL.g:1532:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalDataflowDSL.g:1533:2: iv_ruleForEach= ruleForEach EOF
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
    // InternalDataflowDSL.g:1539:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) ) | (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' ) ;
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
            // InternalDataflowDSL.g:1545:2: ( (otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) ) | (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' ) )
            // InternalDataflowDSL.g:1546:2: (otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) ) | (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' )
            {
            // InternalDataflowDSL.g:1546:2: (otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) ) | (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}' )
            // InternalDataflowDSL.g:1547:3: otherlv_0= 'ForEach' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) ) | (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForEachKeyword_0());
            		
            // InternalDataflowDSL.g:1551:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1552:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1552:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1553:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1573:3: ( (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) ) | (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) ) | (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) ) | (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) ) )*
            loop19:
            do {
                int alt19=5;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    alt19=1;
                    }
                    break;
                case 41:
                    {
                    alt19=2;
                    }
                    break;
                case 42:
                    {
                    alt19=3;
                    }
                    break;
                case 17:
                    {
                    alt19=4;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalDataflowDSL.g:1574:4: (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1574:4: (otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1575:5: otherlv_3= 'listField' ( (lv_listField_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getListFieldKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:1579:5: ( (lv_listField_4_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1580:6: (lv_listField_4_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1580:6: (lv_listField_4_0= RULE_ID )
            	    // InternalDataflowDSL.g:1581:7: lv_listField_4_0= RULE_ID
            	    {
            	    lv_listField_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    							newLeafNode(lv_listField_4_0, grammarAccess.getForEachAccess().getListFieldIDTerminalRuleCall_3_0_1_0());
            	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:1599:4: (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1599:4: (otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1600:5: otherlv_5= 'itemField' ( (lv_itemField_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,41,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getForEachAccess().getItemFieldKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:1604:5: ( (lv_itemField_6_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1605:6: (lv_itemField_6_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1605:6: (lv_itemField_6_0= RULE_ID )
            	    // InternalDataflowDSL.g:1606:7: lv_itemField_6_0= RULE_ID
            	    {
            	    lv_itemField_6_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    							newLeafNode(lv_itemField_6_0, grammarAccess.getForEachAccess().getItemFieldIDTerminalRuleCall_3_1_1_0());
            	    						

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


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:1624:4: (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1624:4: (otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1625:5: otherlv_7= 'positionField' ( (lv_positionField_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,42,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getForEachAccess().getPositionFieldKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:1629:5: ( (lv_positionField_8_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1630:6: (lv_positionField_8_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1630:6: (lv_positionField_8_0= RULE_ID )
            	    // InternalDataflowDSL.g:1631:7: lv_positionField_8_0= RULE_ID
            	    {
            	    lv_positionField_8_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    							newLeafNode(lv_positionField_8_0, grammarAccess.getForEachAccess().getPositionFieldIDTerminalRuleCall_3_2_1_0());
            	    						

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


            	    }
            	    break;
            	case 4 :
            	    // InternalDataflowDSL.g:1649:4: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1649:4: (otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1650:5: otherlv_9= 'target' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_9, grammarAccess.getForEachAccess().getTargetKeyword_3_3_0());
            	    				
            	    // InternalDataflowDSL.g:1654:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalDataflowDSL.g:1655:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1655:6: (otherlv_10= RULE_ID )
            	    // InternalDataflowDSL.g:1656:7: otherlv_10= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getForEachRule());
            	    							}
            	    						
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    							newLeafNode(otherlv_10, grammarAccess.getForEachAccess().getTargetElementCrossReference_3_3_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:1677:1: entryRuleCollectBy returns [EObject current=null] : iv_ruleCollectBy= ruleCollectBy EOF ;
    public final EObject entryRuleCollectBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectBy = null;


        try {
            // InternalDataflowDSL.g:1677:50: (iv_ruleCollectBy= ruleCollectBy EOF )
            // InternalDataflowDSL.g:1678:2: iv_ruleCollectBy= ruleCollectBy EOF
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
    // InternalDataflowDSL.g:1684:1: ruleCollectBy returns [EObject current=null] : (otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) ) ) | (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' ) ;
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
            // InternalDataflowDSL.g:1690:2: ( (otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) ) ) | (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' ) )
            // InternalDataflowDSL.g:1691:2: (otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) ) ) | (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:1691:2: (otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) ) ) | (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' )
            // InternalDataflowDSL.g:1692:3: otherlv_0= 'CollectBy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) ) ) | (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectByAccess().getCollectByKeyword_0());
            		
            // InternalDataflowDSL.g:1696:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1697:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1697:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1698:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectByAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1718:3: ( (otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) ) ) | (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )*
            loop20:
            do {
                int alt20=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt20=1;
                    }
                    break;
                case 44:
                    {
                    alt20=2;
                    }
                    break;
                case 17:
                    {
                    alt20=3;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalDataflowDSL.g:1719:4: (otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1719:4: (otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1720:5: otherlv_3= 'field' ( (lv_elementField_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getCollectByAccess().getFieldKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:1724:5: ( (lv_elementField_4_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1725:6: (lv_elementField_4_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1725:6: (lv_elementField_4_0= RULE_ID )
            	    // InternalDataflowDSL.g:1726:7: lv_elementField_4_0= RULE_ID
            	    {
            	    lv_elementField_4_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    							newLeafNode(lv_elementField_4_0, grammarAccess.getCollectByAccess().getElementFieldIDTerminalRuleCall_3_0_1_0());
            	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:1744:4: (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) )
            	    {
            	    // InternalDataflowDSL.g:1744:4: (otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) ) )
            	    // InternalDataflowDSL.g:1745:5: otherlv_5= 'collectBy' ( (lv_collectBy_6_0= ruleConditionalExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,44,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getCollectByAccess().getCollectByKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:1749:5: ( (lv_collectBy_6_0= ruleConditionalExpression ) )
            	    // InternalDataflowDSL.g:1750:6: (lv_collectBy_6_0= ruleConditionalExpression )
            	    {
            	    // InternalDataflowDSL.g:1750:6: (lv_collectBy_6_0= ruleConditionalExpression )
            	    // InternalDataflowDSL.g:1751:7: lv_collectBy_6_0= ruleConditionalExpression
            	    {

            	    							newCompositeNode(grammarAccess.getCollectByAccess().getCollectByConditionalExpressionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_23);
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


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:1770:4: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1770:4: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1771:5: otherlv_7= 'target' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getCollectByAccess().getTargetKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:1775:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDataflowDSL.g:1776:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1776:6: (otherlv_8= RULE_ID )
            	    // InternalDataflowDSL.g:1777:7: otherlv_8= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getCollectByRule());
            	    							}
            	    						
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    							newLeafNode(otherlv_8, grammarAccess.getCollectByAccess().getTargetElementCrossReference_3_2_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCollectByAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:1798:1: entryRuleEvaluate returns [EObject current=null] : iv_ruleEvaluate= ruleEvaluate EOF ;
    public final EObject entryRuleEvaluate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluate = null;


        try {
            // InternalDataflowDSL.g:1798:49: (iv_ruleEvaluate= ruleEvaluate EOF )
            // InternalDataflowDSL.g:1799:2: iv_ruleEvaluate= ruleEvaluate EOF
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
    // InternalDataflowDSL.g:1805:1: ruleEvaluate returns [EObject current=null] : (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' ) ;
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
            // InternalDataflowDSL.g:1811:2: ( (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' ) )
            // InternalDataflowDSL.g:1812:2: (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' )
            {
            // InternalDataflowDSL.g:1812:2: (otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}' )
            // InternalDataflowDSL.g:1813:3: otherlv_0= 'Evaluate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvaluateAccess().getEvaluateKeyword_0());
            		
            // InternalDataflowDSL.g:1817:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataflowDSL.g:1818:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataflowDSL.g:1818:4: (lv_name_1_0= RULE_ID )
            // InternalDataflowDSL.g:1819:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getEvaluateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataflowDSL.g:1839:3: ( (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) ) | (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) ) | (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) ) )*
            loop21:
            do {
                int alt21=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt21=1;
                    }
                    break;
                case 46:
                    {
                    alt21=2;
                    }
                    break;
                case 17:
                    {
                    alt21=3;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalDataflowDSL.g:1840:4: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1840:4: (otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1841:5: otherlv_3= 'field' ( (lv_field_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getEvaluateAccess().getFieldKeyword_3_0_0());
            	    				
            	    // InternalDataflowDSL.g:1845:5: ( (lv_field_4_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:1846:6: (lv_field_4_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1846:6: (lv_field_4_0= RULE_ID )
            	    // InternalDataflowDSL.g:1847:7: lv_field_4_0= RULE_ID
            	    {
            	    lv_field_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    							newLeafNode(lv_field_4_0, grammarAccess.getEvaluateAccess().getFieldIDTerminalRuleCall_3_0_1_0());
            	    						

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


            	    }
            	    break;
            	case 2 :
            	    // InternalDataflowDSL.g:1865:4: (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) )
            	    {
            	    // InternalDataflowDSL.g:1865:4: (otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) ) )
            	    // InternalDataflowDSL.g:1866:5: otherlv_5= 'expression' ( (lv_expression_6_0= ruleConditionalExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,46,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEvaluateAccess().getExpressionKeyword_3_1_0());
            	    				
            	    // InternalDataflowDSL.g:1870:5: ( (lv_expression_6_0= ruleConditionalExpression ) )
            	    // InternalDataflowDSL.g:1871:6: (lv_expression_6_0= ruleConditionalExpression )
            	    {
            	    // InternalDataflowDSL.g:1871:6: (lv_expression_6_0= ruleConditionalExpression )
            	    // InternalDataflowDSL.g:1872:7: lv_expression_6_0= ruleConditionalExpression
            	    {

            	    							newCompositeNode(grammarAccess.getEvaluateAccess().getExpressionConditionalExpressionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
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


            	    }
            	    break;
            	case 3 :
            	    // InternalDataflowDSL.g:1891:4: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )
            	    {
            	    // InternalDataflowDSL.g:1891:4: (otherlv_7= 'target' ( (otherlv_8= RULE_ID ) ) )
            	    // InternalDataflowDSL.g:1892:5: otherlv_7= 'target' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getEvaluateAccess().getTargetKeyword_3_2_0());
            	    				
            	    // InternalDataflowDSL.g:1896:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDataflowDSL.g:1897:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:1897:6: (otherlv_8= RULE_ID )
            	    // InternalDataflowDSL.g:1898:7: otherlv_8= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getEvaluateRule());
            	    							}
            	    						
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    							newLeafNode(otherlv_8, grammarAccess.getEvaluateAccess().getTargetElementCrossReference_3_2_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEvaluateAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataflowDSL.g:1919:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalDataflowDSL.g:1919:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalDataflowDSL.g:1920:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
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
    // InternalDataflowDSL.g:1926:1: ruleConditionalExpression returns [EObject current=null] : ( (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) ) | this_OrExpression_7= ruleOrExpression ) ;
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
            // InternalDataflowDSL.g:1932:2: ( ( (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) ) | this_OrExpression_7= ruleOrExpression ) )
            // InternalDataflowDSL.g:1933:2: ( (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) ) | this_OrExpression_7= ruleOrExpression )
            {
            // InternalDataflowDSL.g:1933:2: ( (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) ) | this_OrExpression_7= ruleOrExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||(LA22_0>=50 && LA22_0<=51)||(LA22_0>=54 && LA22_0<=55)||LA22_0==58||LA22_0==73) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDataflowDSL.g:1934:3: (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) )
                    {
                    // InternalDataflowDSL.g:1934:3: (otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) ) )
                    // InternalDataflowDSL.g:1935:4: otherlv_0= 'if' this_OrExpression_1= ruleOrExpression () otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleOrExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleOrExpression ) )
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionalExpressionAccess().getIfKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOrExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_OrExpression_1=ruleOrExpression();

                    state._fsp--;


                    				current = this_OrExpression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDataflowDSL.g:1947:4: ()
                    // InternalDataflowDSL.g:1948:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionExpressionAction_0_2(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionalExpressionAccess().getThenKeyword_0_3());
                    			
                    // InternalDataflowDSL.g:1958:4: ( (lv_thenExpression_4_0= ruleOrExpression ) )
                    // InternalDataflowDSL.g:1959:5: (lv_thenExpression_4_0= ruleOrExpression )
                    {
                    // InternalDataflowDSL.g:1959:5: (lv_thenExpression_4_0= ruleOrExpression )
                    // InternalDataflowDSL.g:1960:6: lv_thenExpression_4_0= ruleOrExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalExpressionAccess().getThenExpressionOrExpressionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    otherlv_5=(Token)match(input,49,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getConditionalExpressionAccess().getElseKeyword_0_5());
                    			
                    // InternalDataflowDSL.g:1981:4: ( (lv_elseExpression_6_0= ruleOrExpression ) )
                    // InternalDataflowDSL.g:1982:5: (lv_elseExpression_6_0= ruleOrExpression )
                    {
                    // InternalDataflowDSL.g:1982:5: (lv_elseExpression_6_0= ruleOrExpression )
                    // InternalDataflowDSL.g:1983:6: lv_elseExpression_6_0= ruleOrExpression
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
                    // InternalDataflowDSL.g:2002:3: this_OrExpression_7= ruleOrExpression
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
    // InternalDataflowDSL.g:2014:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDataflowDSL.g:2014:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDataflowDSL.g:2015:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalDataflowDSL.g:2021:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2027:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )* ) )
            // InternalDataflowDSL.g:2028:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2028:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )* )
            // InternalDataflowDSL.g:2029:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2037:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDataflowDSL.g:2038:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_rightExpression_3_0= ruleAndExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2038:4: ()
            	    // InternalDataflowDSL.g:2039:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2045:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalDataflowDSL.g:2046:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalDataflowDSL.g:2046:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalDataflowDSL.g:2047:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalDataflowDSL.g:2064:4: ( (lv_rightExpression_3_0= ruleAndExpression ) )
            	    // InternalDataflowDSL.g:2065:5: (lv_rightExpression_3_0= ruleAndExpression )
            	    {
            	    // InternalDataflowDSL.g:2065:5: (lv_rightExpression_3_0= ruleAndExpression )
            	    // InternalDataflowDSL.g:2066:6: lv_rightExpression_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop23;
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
    // InternalDataflowDSL.g:2088:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDataflowDSL.g:2088:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDataflowDSL.g:2089:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalDataflowDSL.g:2095:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2101:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalDataflowDSL.g:2102:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2102:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )* )
            // InternalDataflowDSL.g:2103:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2111:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==62) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDataflowDSL.g:2112:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_rightExpression_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2112:4: ()
            	    // InternalDataflowDSL.g:2113:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2119:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalDataflowDSL.g:2120:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalDataflowDSL.g:2120:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalDataflowDSL.g:2121:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalDataflowDSL.g:2138:4: ( (lv_rightExpression_3_0= ruleEqualityExpression ) )
            	    // InternalDataflowDSL.g:2139:5: (lv_rightExpression_3_0= ruleEqualityExpression )
            	    {
            	    // InternalDataflowDSL.g:2139:5: (lv_rightExpression_3_0= ruleEqualityExpression )
            	    // InternalDataflowDSL.g:2140:6: lv_rightExpression_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExpressionEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalDataflowDSL.g:2162:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalDataflowDSL.g:2162:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalDataflowDSL.g:2163:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalDataflowDSL.g:2169:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2175:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalDataflowDSL.g:2176:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2176:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )* )
            // InternalDataflowDSL.g:2177:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2185:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=63 && LA25_0<=64)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDataflowDSL.g:2186:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExpression_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2186:4: ()
            	    // InternalDataflowDSL.g:2187:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2193:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalDataflowDSL.g:2194:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalDataflowDSL.g:2194:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalDataflowDSL.g:2195:6: lv_operator_2_0= ruleEqualityOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalDataflowDSL.g:2212:4: ( (lv_rightExpression_3_0= ruleRelationalExpression ) )
            	    // InternalDataflowDSL.g:2213:5: (lv_rightExpression_3_0= ruleRelationalExpression )
            	    {
            	    // InternalDataflowDSL.g:2213:5: (lv_rightExpression_3_0= ruleRelationalExpression )
            	    // InternalDataflowDSL.g:2214:6: lv_rightExpression_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightExpressionRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
            	    break loop25;
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
    // InternalDataflowDSL.g:2236:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalDataflowDSL.g:2236:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalDataflowDSL.g:2237:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalDataflowDSL.g:2243:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2249:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalDataflowDSL.g:2250:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2250:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )* )
            // InternalDataflowDSL.g:2251:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2259:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=65 && LA26_0<=68)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDataflowDSL.g:2260:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightExpression_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2260:4: ()
            	    // InternalDataflowDSL.g:2261:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2267:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalDataflowDSL.g:2268:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalDataflowDSL.g:2268:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalDataflowDSL.g:2269:6: lv_operator_2_0= ruleRelationalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalDataflowDSL.g:2286:4: ( (lv_rightExpression_3_0= ruleAdditiveExpression ) )
            	    // InternalDataflowDSL.g:2287:5: (lv_rightExpression_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalDataflowDSL.g:2287:5: (lv_rightExpression_3_0= ruleAdditiveExpression )
            	    // InternalDataflowDSL.g:2288:6: lv_rightExpression_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightExpressionAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalDataflowDSL.g:2310:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalDataflowDSL.g:2310:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalDataflowDSL.g:2311:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalDataflowDSL.g:2317:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2323:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalDataflowDSL.g:2324:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2324:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalDataflowDSL.g:2325:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2333:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==58||LA27_0==69) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDataflowDSL.g:2334:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2334:4: ()
            	    // InternalDataflowDSL.g:2335:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2341:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalDataflowDSL.g:2342:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalDataflowDSL.g:2342:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalDataflowDSL.g:2343:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalDataflowDSL.g:2360:4: ( (lv_rightExpression_3_0= ruleMultiplicativeExpression ) )
            	    // InternalDataflowDSL.g:2361:5: (lv_rightExpression_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalDataflowDSL.g:2361:5: (lv_rightExpression_3_0= ruleMultiplicativeExpression )
            	    // InternalDataflowDSL.g:2362:6: lv_rightExpression_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExpressionMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop27;
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
    // InternalDataflowDSL.g:2384:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalDataflowDSL.g:2384:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalDataflowDSL.g:2385:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalDataflowDSL.g:2391:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2397:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalDataflowDSL.g:2398:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalDataflowDSL.g:2398:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )* )
            // InternalDataflowDSL.g:2399:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2407:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=70 && LA28_0<=72)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDataflowDSL.g:2408:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpression_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalDataflowDSL.g:2408:4: ()
            	    // InternalDataflowDSL.g:2409:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDataflowDSL.g:2415:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalDataflowDSL.g:2416:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalDataflowDSL.g:2416:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalDataflowDSL.g:2417:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalDataflowDSL.g:2434:4: ( (lv_rightExpression_3_0= ruleUnaryExpression ) )
            	    // InternalDataflowDSL.g:2435:5: (lv_rightExpression_3_0= ruleUnaryExpression )
            	    {
            	    // InternalDataflowDSL.g:2435:5: (lv_rightExpression_3_0= ruleUnaryExpression )
            	    // InternalDataflowDSL.g:2436:6: lv_rightExpression_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop28;
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
    // InternalDataflowDSL.g:2458:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDataflowDSL.g:2458:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDataflowDSL.g:2459:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalDataflowDSL.g:2465:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_FeatureCallExpression_3= ruleFeatureCallExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_expression_2_0 = null;

        EObject this_FeatureCallExpression_3 = null;



        	enterRule();

        try {
            // InternalDataflowDSL.g:2471:2: ( ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_FeatureCallExpression_3= ruleFeatureCallExpression ) )
            // InternalDataflowDSL.g:2472:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_FeatureCallExpression_3= ruleFeatureCallExpression )
            {
            // InternalDataflowDSL.g:2472:2: ( ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) ) | this_FeatureCallExpression_3= ruleFeatureCallExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58||LA29_0==73) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||(LA29_0>=50 && LA29_0<=51)||(LA29_0>=54 && LA29_0<=55)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataflowDSL.g:2473:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalDataflowDSL.g:2473:3: ( () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) ) )
                    // InternalDataflowDSL.g:2474:4: () ( (lv_operator_1_0= ruleUnaryOperator ) ) ( (lv_expression_2_0= ruleUnaryExpression ) )
                    {
                    // InternalDataflowDSL.g:2474:4: ()
                    // InternalDataflowDSL.g:2475:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getUnaryOperationAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2481:4: ( (lv_operator_1_0= ruleUnaryOperator ) )
                    // InternalDataflowDSL.g:2482:5: (lv_operator_1_0= ruleUnaryOperator )
                    {
                    // InternalDataflowDSL.g:2482:5: (lv_operator_1_0= ruleUnaryOperator )
                    // InternalDataflowDSL.g:2483:6: lv_operator_1_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalDataflowDSL.g:2500:4: ( (lv_expression_2_0= ruleUnaryExpression ) )
                    // InternalDataflowDSL.g:2501:5: (lv_expression_2_0= ruleUnaryExpression )
                    {
                    // InternalDataflowDSL.g:2501:5: (lv_expression_2_0= ruleUnaryExpression )
                    // InternalDataflowDSL.g:2502:6: lv_expression_2_0= ruleUnaryExpression
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
                    // InternalDataflowDSL.g:2521:3: this_FeatureCallExpression_3= ruleFeatureCallExpression
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
    // InternalDataflowDSL.g:2533:1: entryRuleFeatureCallExpression returns [EObject current=null] : iv_ruleFeatureCallExpression= ruleFeatureCallExpression EOF ;
    public final EObject entryRuleFeatureCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCallExpression = null;


        try {
            // InternalDataflowDSL.g:2533:62: (iv_ruleFeatureCallExpression= ruleFeatureCallExpression EOF )
            // InternalDataflowDSL.g:2534:2: iv_ruleFeatureCallExpression= ruleFeatureCallExpression EOF
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
    // InternalDataflowDSL.g:2540:1: ruleFeatureCallExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // InternalDataflowDSL.g:2546:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // InternalDataflowDSL.g:2547:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // InternalDataflowDSL.g:2547:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )* )
            // InternalDataflowDSL.g:2548:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )*
            {

            			newCompositeNode(grammarAccess.getFeatureCallExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDataflowDSL.g:2556:3: ( () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDataflowDSL.g:2557:4: () otherlv_2= '.' ( (lv_feature_3_0= RULE_ID ) ) (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalDataflowDSL.g:2557:4: ()
            	    // InternalDataflowDSL.g:2558:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFeatureCallExpressionAccess().getFeatureCallTargetExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFeatureCallExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalDataflowDSL.g:2568:4: ( (lv_feature_3_0= RULE_ID ) )
            	    // InternalDataflowDSL.g:2569:5: (lv_feature_3_0= RULE_ID )
            	    {
            	    // InternalDataflowDSL.g:2569:5: (lv_feature_3_0= RULE_ID )
            	    // InternalDataflowDSL.g:2570:6: lv_feature_3_0= RULE_ID
            	    {
            	    lv_feature_3_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            	    // InternalDataflowDSL.g:2586:4: (otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==51) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalDataflowDSL.g:2587:5: otherlv_4= '(' ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            otherlv_4=(Token)match(input,51,FOLLOW_35); 

            	            					newLeafNode(otherlv_4, grammarAccess.getFeatureCallExpressionAccess().getLeftParenthesisKeyword_1_3_0());
            	            				
            	            // InternalDataflowDSL.g:2591:5: ( ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )* )?
            	            int alt31=2;
            	            int LA31_0 = input.LA(1);

            	            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||(LA31_0>=50 && LA31_0<=51)||(LA31_0>=54 && LA31_0<=55)||LA31_0==58||LA31_0==73) ) {
            	                alt31=1;
            	            }
            	            switch (alt31) {
            	                case 1 :
            	                    // InternalDataflowDSL.g:2592:6: ( (lv_parameters_5_0= ruleOrExpression ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )*
            	                    {
            	                    // InternalDataflowDSL.g:2592:6: ( (lv_parameters_5_0= ruleOrExpression ) )
            	                    // InternalDataflowDSL.g:2593:7: (lv_parameters_5_0= ruleOrExpression )
            	                    {
            	                    // InternalDataflowDSL.g:2593:7: (lv_parameters_5_0= ruleOrExpression )
            	                    // InternalDataflowDSL.g:2594:8: lv_parameters_5_0= ruleOrExpression
            	                    {

            	                    								newCompositeNode(grammarAccess.getFeatureCallExpressionAccess().getParametersOrExpressionParserRuleCall_1_3_1_0_0());
            	                    							
            	                    pushFollow(FOLLOW_36);
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

            	                    // InternalDataflowDSL.g:2611:6: (otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) )*
            	                    loop30:
            	                    do {
            	                        int alt30=2;
            	                        int LA30_0 = input.LA(1);

            	                        if ( (LA30_0==52) ) {
            	                            alt30=1;
            	                        }


            	                        switch (alt30) {
            	                    	case 1 :
            	                    	    // InternalDataflowDSL.g:2612:7: otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,52,FOLLOW_10); 

            	                    	    							newLeafNode(otherlv_6, grammarAccess.getFeatureCallExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	    						
            	                    	    // InternalDataflowDSL.g:2616:7: ( (lv_parameters_7_0= ruleOrExpression ) )
            	                    	    // InternalDataflowDSL.g:2617:8: (lv_parameters_7_0= ruleOrExpression )
            	                    	    {
            	                    	    // InternalDataflowDSL.g:2617:8: (lv_parameters_7_0= ruleOrExpression )
            	                    	    // InternalDataflowDSL.g:2618:9: lv_parameters_7_0= ruleOrExpression
            	                    	    {

            	                    	    									newCompositeNode(grammarAccess.getFeatureCallExpressionAccess().getParametersOrExpressionParserRuleCall_1_3_1_1_1_0());
            	                    	    								
            	                    	    pushFollow(FOLLOW_36);
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
            	                    	    break loop30;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,53,FOLLOW_33); 

            	            					newLeafNode(otherlv_8, grammarAccess.getFeatureCallExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalDataflowDSL.g:2647:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalDataflowDSL.g:2647:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDataflowDSL.g:2648:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalDataflowDSL.g:2654:1: rulePrimaryExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) ) ;
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
            // InternalDataflowDSL.g:2660:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) ) )
            // InternalDataflowDSL.g:2661:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) )
            {
            // InternalDataflowDSL.g:2661:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEBoolean ) ) ) | ( () ( (lv_value_5_0= ruleEDouble ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_field_9_0= RULE_ID ) ) ) | (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==50) ) {
                    int LA34_7 = input.LA(3);

                    if ( (LA34_7==RULE_INT) ) {
                        alt34=3;
                    }
                    else if ( (LA34_7==RULE_ID) ) {
                        alt34=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 7, input);

                        throw nvae;
                    }
                }
                else if ( (LA34_1==EOF||(LA34_1>=13 && LA34_1<=14)||(LA34_1>=17 && LA34_1<=18)||LA34_1==20||(LA34_1>=22 && LA34_1<=23)||LA34_1==27||LA34_1==32||LA34_1==34||LA34_1==38||LA34_1==44||LA34_1==46||(LA34_1>=48 && LA34_1<=49)||(LA34_1>=52 && LA34_1<=53)||LA34_1==58||(LA34_1>=61 && LA34_1<=72)) ) {
                    alt34=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case 54:
            case 55:
                {
                alt34=2;
                }
                break;
            case 50:
                {
                alt34=3;
                }
                break;
            case RULE_STRING:
                {
                alt34=4;
                }
                break;
            case RULE_ID:
                {
                alt34=5;
                }
                break;
            case 51:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalDataflowDSL.g:2662:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalDataflowDSL.g:2662:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalDataflowDSL.g:2663:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalDataflowDSL.g:2663:4: ()
                    // InternalDataflowDSL.g:2664:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getIntegerLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2670:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalDataflowDSL.g:2671:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalDataflowDSL.g:2671:5: (lv_value_1_0= ruleEInt )
                    // InternalDataflowDSL.g:2672:6: lv_value_1_0= ruleEInt
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
                    // InternalDataflowDSL.g:2691:3: ( () ( (lv_value_3_0= ruleEBoolean ) ) )
                    {
                    // InternalDataflowDSL.g:2691:3: ( () ( (lv_value_3_0= ruleEBoolean ) ) )
                    // InternalDataflowDSL.g:2692:4: () ( (lv_value_3_0= ruleEBoolean ) )
                    {
                    // InternalDataflowDSL.g:2692:4: ()
                    // InternalDataflowDSL.g:2693:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2699:4: ( (lv_value_3_0= ruleEBoolean ) )
                    // InternalDataflowDSL.g:2700:5: (lv_value_3_0= ruleEBoolean )
                    {
                    // InternalDataflowDSL.g:2700:5: (lv_value_3_0= ruleEBoolean )
                    // InternalDataflowDSL.g:2701:6: lv_value_3_0= ruleEBoolean
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
                    // InternalDataflowDSL.g:2720:3: ( () ( (lv_value_5_0= ruleEDouble ) ) )
                    {
                    // InternalDataflowDSL.g:2720:3: ( () ( (lv_value_5_0= ruleEDouble ) ) )
                    // InternalDataflowDSL.g:2721:4: () ( (lv_value_5_0= ruleEDouble ) )
                    {
                    // InternalDataflowDSL.g:2721:4: ()
                    // InternalDataflowDSL.g:2722:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2728:4: ( (lv_value_5_0= ruleEDouble ) )
                    // InternalDataflowDSL.g:2729:5: (lv_value_5_0= ruleEDouble )
                    {
                    // InternalDataflowDSL.g:2729:5: (lv_value_5_0= ruleEDouble )
                    // InternalDataflowDSL.g:2730:6: lv_value_5_0= ruleEDouble
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
                    // InternalDataflowDSL.g:2749:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalDataflowDSL.g:2749:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalDataflowDSL.g:2750:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalDataflowDSL.g:2750:4: ()
                    // InternalDataflowDSL.g:2751:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2757:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalDataflowDSL.g:2758:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalDataflowDSL.g:2758:5: (lv_value_7_0= RULE_STRING )
                    // InternalDataflowDSL.g:2759:6: lv_value_7_0= RULE_STRING
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
                    // InternalDataflowDSL.g:2777:3: ( () ( (lv_field_9_0= RULE_ID ) ) )
                    {
                    // InternalDataflowDSL.g:2777:3: ( () ( (lv_field_9_0= RULE_ID ) ) )
                    // InternalDataflowDSL.g:2778:4: () ( (lv_field_9_0= RULE_ID ) )
                    {
                    // InternalDataflowDSL.g:2778:4: ()
                    // InternalDataflowDSL.g:2779:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getFieldReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDataflowDSL.g:2785:4: ( (lv_field_9_0= RULE_ID ) )
                    // InternalDataflowDSL.g:2786:5: (lv_field_9_0= RULE_ID )
                    {
                    // InternalDataflowDSL.g:2786:5: (lv_field_9_0= RULE_ID )
                    // InternalDataflowDSL.g:2787:6: lv_field_9_0= RULE_ID
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
                    // InternalDataflowDSL.g:2805:3: (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' )
                    {
                    // InternalDataflowDSL.g:2805:3: (otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')' )
                    // InternalDataflowDSL.g:2806:4: otherlv_10= '(' this_OrExpression_11= ruleOrExpression otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_OrExpression_11=ruleOrExpression();

                    state._fsp--;


                    				current = this_OrExpression_11;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,53,FOLLOW_2); 

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
    // InternalDataflowDSL.g:2827:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDataflowDSL.g:2827:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDataflowDSL.g:2828:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDataflowDSL.g:2834:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2840:2: (this_INT_0= RULE_INT )
            // InternalDataflowDSL.g:2841:2: this_INT_0= RULE_INT
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
    // InternalDataflowDSL.g:2851:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDataflowDSL.g:2851:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDataflowDSL.g:2852:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalDataflowDSL.g:2858:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2864:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDataflowDSL.g:2865:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDataflowDSL.g:2865:2: (kw= 'true' | kw= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            else if ( (LA35_0==55) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataflowDSL.g:2866:3: kw= 'true'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2872:3: kw= 'false'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalDataflowDSL.g:2881:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDataflowDSL.g:2881:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDataflowDSL.g:2882:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalDataflowDSL.g:2888:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2894:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalDataflowDSL.g:2895:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalDataflowDSL.g:2895:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalDataflowDSL.g:2896:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalDataflowDSL.g:2896:3: (this_INT_0= RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataflowDSL.g:2897:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,50,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_40); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalDataflowDSL.g:2917:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=56 && LA39_0<=57)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataflowDSL.g:2918:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                    {
                    // InternalDataflowDSL.g:2918:4: (kw= 'E' | kw= 'e' )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==56) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==57) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalDataflowDSL.g:2919:5: kw= 'E'
                            {
                            kw=(Token)match(input,56,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDataflowDSL.g:2925:5: kw= 'e'
                            {
                            kw=(Token)match(input,57,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDataflowDSL.g:2931:4: (kw= '-' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==58) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalDataflowDSL.g:2932:5: kw= '-'
                            {
                            kw=(Token)match(input,58,FOLLOW_39); 

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
    // InternalDataflowDSL.g:2950:1: ruleContainerType returns [Enumerator current=null] : ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) ) ;
    public final Enumerator ruleContainerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2956:2: ( ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) ) )
            // InternalDataflowDSL.g:2957:2: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) )
            {
            // InternalDataflowDSL.g:2957:2: ( (enumLiteral_0= 'list' ) | (enumLiteral_1= 'set' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==59) ) {
                alt40=1;
            }
            else if ( (LA40_0==60) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDataflowDSL.g:2958:3: (enumLiteral_0= 'list' )
                    {
                    // InternalDataflowDSL.g:2958:3: (enumLiteral_0= 'list' )
                    // InternalDataflowDSL.g:2959:4: enumLiteral_0= 'list'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:2966:3: (enumLiteral_1= 'set' )
                    {
                    // InternalDataflowDSL.g:2966:3: (enumLiteral_1= 'set' )
                    // InternalDataflowDSL.g:2967:4: enumLiteral_1= 'set'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

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
    // InternalDataflowDSL.g:2977:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:2983:2: ( (enumLiteral_0= 'or' ) )
            // InternalDataflowDSL.g:2984:2: (enumLiteral_0= 'or' )
            {
            // InternalDataflowDSL.g:2984:2: (enumLiteral_0= 'or' )
            // InternalDataflowDSL.g:2985:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

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
    // InternalDataflowDSL.g:2994:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3000:2: ( (enumLiteral_0= 'and' ) )
            // InternalDataflowDSL.g:3001:2: (enumLiteral_0= 'and' )
            {
            // InternalDataflowDSL.g:3001:2: (enumLiteral_0= 'and' )
            // InternalDataflowDSL.g:3002:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

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
    // InternalDataflowDSL.g:3011:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3017:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) ) )
            // InternalDataflowDSL.g:3018:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalDataflowDSL.g:3018:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            else if ( (LA41_0==64) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDataflowDSL.g:3019:3: (enumLiteral_0= '=' )
                    {
                    // InternalDataflowDSL.g:3019:3: (enumLiteral_0= '=' )
                    // InternalDataflowDSL.g:3020:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3027:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDataflowDSL.g:3027:3: (enumLiteral_1= '!=' )
                    // InternalDataflowDSL.g:3028:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalDataflowDSL.g:3038:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3044:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) )
            // InternalDataflowDSL.g:3045:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalDataflowDSL.g:3045:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt42=1;
                }
                break;
            case 66:
                {
                alt42=2;
                }
                break;
            case 67:
                {
                alt42=3;
                }
                break;
            case 68:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalDataflowDSL.g:3046:3: (enumLiteral_0= '>' )
                    {
                    // InternalDataflowDSL.g:3046:3: (enumLiteral_0= '>' )
                    // InternalDataflowDSL.g:3047:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3054:3: (enumLiteral_1= '>=' )
                    {
                    // InternalDataflowDSL.g:3054:3: (enumLiteral_1= '>=' )
                    // InternalDataflowDSL.g:3055:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:3062:3: (enumLiteral_2= '<' )
                    {
                    // InternalDataflowDSL.g:3062:3: (enumLiteral_2= '<' )
                    // InternalDataflowDSL.g:3063:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:3070:3: (enumLiteral_3= '<=' )
                    {
                    // InternalDataflowDSL.g:3070:3: (enumLiteral_3= '<=' )
                    // InternalDataflowDSL.g:3071:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

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
    // InternalDataflowDSL.g:3081:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3087:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDataflowDSL.g:3088:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDataflowDSL.g:3088:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==69) ) {
                alt43=1;
            }
            else if ( (LA43_0==58) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalDataflowDSL.g:3089:3: (enumLiteral_0= '+' )
                    {
                    // InternalDataflowDSL.g:3089:3: (enumLiteral_0= '+' )
                    // InternalDataflowDSL.g:3090:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3097:3: (enumLiteral_1= '-' )
                    {
                    // InternalDataflowDSL.g:3097:3: (enumLiteral_1= '-' )
                    // InternalDataflowDSL.g:3098:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

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
    // InternalDataflowDSL.g:3108:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3114:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalDataflowDSL.g:3115:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalDataflowDSL.g:3115:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt44=1;
                }
                break;
            case 71:
                {
                alt44=2;
                }
                break;
            case 72:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalDataflowDSL.g:3116:3: (enumLiteral_0= '*' )
                    {
                    // InternalDataflowDSL.g:3116:3: (enumLiteral_0= '*' )
                    // InternalDataflowDSL.g:3117:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3124:3: (enumLiteral_1= '/' )
                    {
                    // InternalDataflowDSL.g:3124:3: (enumLiteral_1= '/' )
                    // InternalDataflowDSL.g:3125:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:3132:3: (enumLiteral_2= '%' )
                    {
                    // InternalDataflowDSL.g:3132:3: (enumLiteral_2= '%' )
                    // InternalDataflowDSL.g:3133:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

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
    // InternalDataflowDSL.g:3143:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataflowDSL.g:3149:2: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) )
            // InternalDataflowDSL.g:3150:2: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDataflowDSL.g:3150:2: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==73) ) {
                alt45=1;
            }
            else if ( (LA45_0==58) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalDataflowDSL.g:3151:3: (enumLiteral_0= 'not' )
                    {
                    // InternalDataflowDSL.g:3151:3: (enumLiteral_0= 'not' )
                    // InternalDataflowDSL.g:3152:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:3159:3: (enumLiteral_1= '-' )
                    {
                    // InternalDataflowDSL.g:3159:3: (enumLiteral_1= '-' )
                    // InternalDataflowDSL.g:3160:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000028AA35280802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000066000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000166000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x04CC800000000070L,0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C60000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001C0060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000500062000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000062000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000060000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004400062000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000070000060000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000062000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000062000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001EL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x04EC800000000070L,0x0000000000000200L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000040L});

}