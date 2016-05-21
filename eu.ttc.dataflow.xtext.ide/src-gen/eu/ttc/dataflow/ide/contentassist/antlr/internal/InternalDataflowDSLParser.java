package eu.ttc.dataflow.ide.contentassist.antlr.internal;

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
import eu.ttc.dataflow.services.DataflowDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataflowDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'and'", "'true'", "'false'", "'E'", "'e'", "'list'", "'set'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'size'", "'defined'", "'undefined'", "'AllInstances'", "'{'", "'}'", "'field'", "'nsURI'", "'typeName'", "'target'", "'NewInstance'", "'Filter'", "'filterByField'", "'rejectTarget'", "'Sort'", "'sortByField'", "'Product'", "'GetFeature'", "'objectField'", "'valueField'", "'feature'", "'SetFeature'", "'NewContainer'", "'listField'", "'containerType'", "'AddToContainer'", "'positionField'", "'Evaluate'", "'expression'", "'('", "')'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
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


        public InternalDataflowDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataflowDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataflowDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataflowDSL.g"; }


    	private DataflowDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(DataflowDSLGrammarAccess grammarAccess) {
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
    // InternalDataflowDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:54:1: ( ruleModel EOF )
            // InternalDataflowDSL.g:55:1: ruleModel EOF
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
    // InternalDataflowDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDataflowDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDataflowDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDataflowDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDataflowDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalDataflowDSL.g:69:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleElement"
    // InternalDataflowDSL.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:79:1: ( ruleElement EOF )
            // InternalDataflowDSL.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDataflowDSL.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalDataflowDSL.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalDataflowDSL.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalDataflowDSL.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalDataflowDSL.g:94:3: ( rule__Element__Alternatives )
            // InternalDataflowDSL.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAllInstances"
    // InternalDataflowDSL.g:103:1: entryRuleAllInstances : ruleAllInstances EOF ;
    public final void entryRuleAllInstances() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:104:1: ( ruleAllInstances EOF )
            // InternalDataflowDSL.g:105:1: ruleAllInstances EOF
            {
             before(grammarAccess.getAllInstancesRule()); 
            pushFollow(FOLLOW_1);
            ruleAllInstances();

            state._fsp--;

             after(grammarAccess.getAllInstancesRule()); 
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
    // $ANTLR end "entryRuleAllInstances"


    // $ANTLR start "ruleAllInstances"
    // InternalDataflowDSL.g:112:1: ruleAllInstances : ( ( rule__AllInstances__Group__0 ) ) ;
    public final void ruleAllInstances() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:116:2: ( ( ( rule__AllInstances__Group__0 ) ) )
            // InternalDataflowDSL.g:117:2: ( ( rule__AllInstances__Group__0 ) )
            {
            // InternalDataflowDSL.g:117:2: ( ( rule__AllInstances__Group__0 ) )
            // InternalDataflowDSL.g:118:3: ( rule__AllInstances__Group__0 )
            {
             before(grammarAccess.getAllInstancesAccess().getGroup()); 
            // InternalDataflowDSL.g:119:3: ( rule__AllInstances__Group__0 )
            // InternalDataflowDSL.g:119:4: rule__AllInstances__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getGroup()); 

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
    // $ANTLR end "ruleAllInstances"


    // $ANTLR start "entryRuleNewInstance"
    // InternalDataflowDSL.g:128:1: entryRuleNewInstance : ruleNewInstance EOF ;
    public final void entryRuleNewInstance() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:129:1: ( ruleNewInstance EOF )
            // InternalDataflowDSL.g:130:1: ruleNewInstance EOF
            {
             before(grammarAccess.getNewInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleNewInstance();

            state._fsp--;

             after(grammarAccess.getNewInstanceRule()); 
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
    // $ANTLR end "entryRuleNewInstance"


    // $ANTLR start "ruleNewInstance"
    // InternalDataflowDSL.g:137:1: ruleNewInstance : ( ( rule__NewInstance__Group__0 ) ) ;
    public final void ruleNewInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:141:2: ( ( ( rule__NewInstance__Group__0 ) ) )
            // InternalDataflowDSL.g:142:2: ( ( rule__NewInstance__Group__0 ) )
            {
            // InternalDataflowDSL.g:142:2: ( ( rule__NewInstance__Group__0 ) )
            // InternalDataflowDSL.g:143:3: ( rule__NewInstance__Group__0 )
            {
             before(grammarAccess.getNewInstanceAccess().getGroup()); 
            // InternalDataflowDSL.g:144:3: ( rule__NewInstance__Group__0 )
            // InternalDataflowDSL.g:144:4: rule__NewInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getGroup()); 

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
    // $ANTLR end "ruleNewInstance"


    // $ANTLR start "entryRuleFilter"
    // InternalDataflowDSL.g:153:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:154:1: ( ruleFilter EOF )
            // InternalDataflowDSL.g:155:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalDataflowDSL.g:162:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:166:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalDataflowDSL.g:167:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalDataflowDSL.g:167:2: ( ( rule__Filter__Group__0 ) )
            // InternalDataflowDSL.g:168:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalDataflowDSL.g:169:3: ( rule__Filter__Group__0 )
            // InternalDataflowDSL.g:169:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleSort"
    // InternalDataflowDSL.g:178:1: entryRuleSort : ruleSort EOF ;
    public final void entryRuleSort() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:179:1: ( ruleSort EOF )
            // InternalDataflowDSL.g:180:1: ruleSort EOF
            {
             before(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_1);
            ruleSort();

            state._fsp--;

             after(grammarAccess.getSortRule()); 
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
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // InternalDataflowDSL.g:187:1: ruleSort : ( ( rule__Sort__Group__0 ) ) ;
    public final void ruleSort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:191:2: ( ( ( rule__Sort__Group__0 ) ) )
            // InternalDataflowDSL.g:192:2: ( ( rule__Sort__Group__0 ) )
            {
            // InternalDataflowDSL.g:192:2: ( ( rule__Sort__Group__0 ) )
            // InternalDataflowDSL.g:193:3: ( rule__Sort__Group__0 )
            {
             before(grammarAccess.getSortAccess().getGroup()); 
            // InternalDataflowDSL.g:194:3: ( rule__Sort__Group__0 )
            // InternalDataflowDSL.g:194:4: rule__Sort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getGroup()); 

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
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleProduct"
    // InternalDataflowDSL.g:203:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:204:1: ( ruleProduct EOF )
            // InternalDataflowDSL.g:205:1: ruleProduct EOF
            {
             before(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getProductRule()); 
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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalDataflowDSL.g:212:1: ruleProduct : ( ( rule__Product__Group__0 ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:216:2: ( ( ( rule__Product__Group__0 ) ) )
            // InternalDataflowDSL.g:217:2: ( ( rule__Product__Group__0 ) )
            {
            // InternalDataflowDSL.g:217:2: ( ( rule__Product__Group__0 ) )
            // InternalDataflowDSL.g:218:3: ( rule__Product__Group__0 )
            {
             before(grammarAccess.getProductAccess().getGroup()); 
            // InternalDataflowDSL.g:219:3: ( rule__Product__Group__0 )
            // InternalDataflowDSL.g:219:4: rule__Product__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Product__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getGroup()); 

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleGetFeature"
    // InternalDataflowDSL.g:228:1: entryRuleGetFeature : ruleGetFeature EOF ;
    public final void entryRuleGetFeature() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:229:1: ( ruleGetFeature EOF )
            // InternalDataflowDSL.g:230:1: ruleGetFeature EOF
            {
             before(grammarAccess.getGetFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleGetFeature();

            state._fsp--;

             after(grammarAccess.getGetFeatureRule()); 
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
    // $ANTLR end "entryRuleGetFeature"


    // $ANTLR start "ruleGetFeature"
    // InternalDataflowDSL.g:237:1: ruleGetFeature : ( ( rule__GetFeature__Group__0 ) ) ;
    public final void ruleGetFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:241:2: ( ( ( rule__GetFeature__Group__0 ) ) )
            // InternalDataflowDSL.g:242:2: ( ( rule__GetFeature__Group__0 ) )
            {
            // InternalDataflowDSL.g:242:2: ( ( rule__GetFeature__Group__0 ) )
            // InternalDataflowDSL.g:243:3: ( rule__GetFeature__Group__0 )
            {
             before(grammarAccess.getGetFeatureAccess().getGroup()); 
            // InternalDataflowDSL.g:244:3: ( rule__GetFeature__Group__0 )
            // InternalDataflowDSL.g:244:4: rule__GetFeature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleGetFeature"


    // $ANTLR start "entryRuleSetFeature"
    // InternalDataflowDSL.g:253:1: entryRuleSetFeature : ruleSetFeature EOF ;
    public final void entryRuleSetFeature() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:254:1: ( ruleSetFeature EOF )
            // InternalDataflowDSL.g:255:1: ruleSetFeature EOF
            {
             before(grammarAccess.getSetFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSetFeature();

            state._fsp--;

             after(grammarAccess.getSetFeatureRule()); 
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
    // $ANTLR end "entryRuleSetFeature"


    // $ANTLR start "ruleSetFeature"
    // InternalDataflowDSL.g:262:1: ruleSetFeature : ( ( rule__SetFeature__Group__0 ) ) ;
    public final void ruleSetFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:266:2: ( ( ( rule__SetFeature__Group__0 ) ) )
            // InternalDataflowDSL.g:267:2: ( ( rule__SetFeature__Group__0 ) )
            {
            // InternalDataflowDSL.g:267:2: ( ( rule__SetFeature__Group__0 ) )
            // InternalDataflowDSL.g:268:3: ( rule__SetFeature__Group__0 )
            {
             before(grammarAccess.getSetFeatureAccess().getGroup()); 
            // InternalDataflowDSL.g:269:3: ( rule__SetFeature__Group__0 )
            // InternalDataflowDSL.g:269:4: rule__SetFeature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleSetFeature"


    // $ANTLR start "entryRuleNewContainer"
    // InternalDataflowDSL.g:278:1: entryRuleNewContainer : ruleNewContainer EOF ;
    public final void entryRuleNewContainer() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:279:1: ( ruleNewContainer EOF )
            // InternalDataflowDSL.g:280:1: ruleNewContainer EOF
            {
             before(grammarAccess.getNewContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleNewContainer();

            state._fsp--;

             after(grammarAccess.getNewContainerRule()); 
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
    // $ANTLR end "entryRuleNewContainer"


    // $ANTLR start "ruleNewContainer"
    // InternalDataflowDSL.g:287:1: ruleNewContainer : ( ( rule__NewContainer__Group__0 ) ) ;
    public final void ruleNewContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:291:2: ( ( ( rule__NewContainer__Group__0 ) ) )
            // InternalDataflowDSL.g:292:2: ( ( rule__NewContainer__Group__0 ) )
            {
            // InternalDataflowDSL.g:292:2: ( ( rule__NewContainer__Group__0 ) )
            // InternalDataflowDSL.g:293:3: ( rule__NewContainer__Group__0 )
            {
             before(grammarAccess.getNewContainerAccess().getGroup()); 
            // InternalDataflowDSL.g:294:3: ( rule__NewContainer__Group__0 )
            // InternalDataflowDSL.g:294:4: rule__NewContainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleNewContainer"


    // $ANTLR start "entryRuleAddToContainer"
    // InternalDataflowDSL.g:303:1: entryRuleAddToContainer : ruleAddToContainer EOF ;
    public final void entryRuleAddToContainer() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:304:1: ( ruleAddToContainer EOF )
            // InternalDataflowDSL.g:305:1: ruleAddToContainer EOF
            {
             before(grammarAccess.getAddToContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleAddToContainer();

            state._fsp--;

             after(grammarAccess.getAddToContainerRule()); 
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
    // $ANTLR end "entryRuleAddToContainer"


    // $ANTLR start "ruleAddToContainer"
    // InternalDataflowDSL.g:312:1: ruleAddToContainer : ( ( rule__AddToContainer__Group__0 ) ) ;
    public final void ruleAddToContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:316:2: ( ( ( rule__AddToContainer__Group__0 ) ) )
            // InternalDataflowDSL.g:317:2: ( ( rule__AddToContainer__Group__0 ) )
            {
            // InternalDataflowDSL.g:317:2: ( ( rule__AddToContainer__Group__0 ) )
            // InternalDataflowDSL.g:318:3: ( rule__AddToContainer__Group__0 )
            {
             before(grammarAccess.getAddToContainerAccess().getGroup()); 
            // InternalDataflowDSL.g:319:3: ( rule__AddToContainer__Group__0 )
            // InternalDataflowDSL.g:319:4: rule__AddToContainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleAddToContainer"


    // $ANTLR start "entryRuleEvaluate"
    // InternalDataflowDSL.g:328:1: entryRuleEvaluate : ruleEvaluate EOF ;
    public final void entryRuleEvaluate() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:329:1: ( ruleEvaluate EOF )
            // InternalDataflowDSL.g:330:1: ruleEvaluate EOF
            {
             before(grammarAccess.getEvaluateRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluate();

            state._fsp--;

             after(grammarAccess.getEvaluateRule()); 
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
    // $ANTLR end "entryRuleEvaluate"


    // $ANTLR start "ruleEvaluate"
    // InternalDataflowDSL.g:337:1: ruleEvaluate : ( ( rule__Evaluate__Group__0 ) ) ;
    public final void ruleEvaluate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:341:2: ( ( ( rule__Evaluate__Group__0 ) ) )
            // InternalDataflowDSL.g:342:2: ( ( rule__Evaluate__Group__0 ) )
            {
            // InternalDataflowDSL.g:342:2: ( ( rule__Evaluate__Group__0 ) )
            // InternalDataflowDSL.g:343:3: ( rule__Evaluate__Group__0 )
            {
             before(grammarAccess.getEvaluateAccess().getGroup()); 
            // InternalDataflowDSL.g:344:3: ( rule__Evaluate__Group__0 )
            // InternalDataflowDSL.g:344:4: rule__Evaluate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getGroup()); 

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
    // $ANTLR end "ruleEvaluate"


    // $ANTLR start "entryRuleOrExpression"
    // InternalDataflowDSL.g:353:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:354:1: ( ruleOrExpression EOF )
            // InternalDataflowDSL.g:355:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalDataflowDSL.g:362:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:366:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:367:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:367:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalDataflowDSL.g:368:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:369:3: ( rule__OrExpression__Group__0 )
            // InternalDataflowDSL.g:369:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalDataflowDSL.g:378:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:379:1: ( ruleAndExpression EOF )
            // InternalDataflowDSL.g:380:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalDataflowDSL.g:387:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:391:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:392:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:392:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalDataflowDSL.g:393:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:394:3: ( rule__AndExpression__Group__0 )
            // InternalDataflowDSL.g:394:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalDataflowDSL.g:403:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:404:1: ( ruleEqualityExpression EOF )
            // InternalDataflowDSL.g:405:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalDataflowDSL.g:412:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:416:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:417:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:417:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalDataflowDSL.g:418:3: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:419:3: ( rule__EqualityExpression__Group__0 )
            // InternalDataflowDSL.g:419:4: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalDataflowDSL.g:428:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:429:1: ( ruleRelationalExpression EOF )
            // InternalDataflowDSL.g:430:1: ruleRelationalExpression EOF
            {
             before(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionRule()); 
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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalDataflowDSL.g:437:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:441:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:442:2: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:442:2: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalDataflowDSL.g:443:3: ( rule__RelationalExpression__Group__0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:444:3: ( rule__RelationalExpression__Group__0 )
            // InternalDataflowDSL.g:444:4: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalDataflowDSL.g:453:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:454:1: ( ruleAdditiveExpression EOF )
            // InternalDataflowDSL.g:455:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalDataflowDSL.g:462:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:466:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:467:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:467:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalDataflowDSL.g:468:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:469:3: ( rule__AdditiveExpression__Group__0 )
            // InternalDataflowDSL.g:469:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalDataflowDSL.g:478:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:479:1: ( ruleMultiplicativeExpression EOF )
            // InternalDataflowDSL.g:480:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalDataflowDSL.g:487:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:491:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:492:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:492:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalDataflowDSL.g:493:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:494:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalDataflowDSL.g:494:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalDataflowDSL.g:503:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:504:1: ( ruleUnaryExpression EOF )
            // InternalDataflowDSL.g:505:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalDataflowDSL.g:512:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:516:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalDataflowDSL.g:517:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalDataflowDSL.g:517:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalDataflowDSL.g:518:3: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // InternalDataflowDSL.g:519:3: ( rule__UnaryExpression__Alternatives )
            // InternalDataflowDSL.g:519:4: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalDataflowDSL.g:528:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:529:1: ( rulePrimaryExpression EOF )
            // InternalDataflowDSL.g:530:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalDataflowDSL.g:537:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:541:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalDataflowDSL.g:542:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalDataflowDSL.g:542:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalDataflowDSL.g:543:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalDataflowDSL.g:544:3: ( rule__PrimaryExpression__Alternatives )
            // InternalDataflowDSL.g:544:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleEInt"
    // InternalDataflowDSL.g:553:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:554:1: ( ruleEInt EOF )
            // InternalDataflowDSL.g:555:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDataflowDSL.g:562:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:566:2: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:567:2: ( RULE_INT )
            {
            // InternalDataflowDSL.g:567:2: ( RULE_INT )
            // InternalDataflowDSL.g:568:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalDataflowDSL.g:578:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:579:1: ( ruleEBoolean EOF )
            // InternalDataflowDSL.g:580:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalDataflowDSL.g:587:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:591:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalDataflowDSL.g:592:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalDataflowDSL.g:592:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalDataflowDSL.g:593:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalDataflowDSL.g:594:3: ( rule__EBoolean__Alternatives )
            // InternalDataflowDSL.g:594:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDouble"
    // InternalDataflowDSL.g:603:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:604:1: ( ruleEDouble EOF )
            // InternalDataflowDSL.g:605:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDataflowDSL.g:612:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:616:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalDataflowDSL.g:617:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalDataflowDSL.g:617:2: ( ( rule__EDouble__Group__0 ) )
            // InternalDataflowDSL.g:618:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalDataflowDSL.g:619:3: ( rule__EDouble__Group__0 )
            // InternalDataflowDSL.g:619:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleContainerType"
    // InternalDataflowDSL.g:628:1: ruleContainerType : ( ( rule__ContainerType__Alternatives ) ) ;
    public final void ruleContainerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:632:1: ( ( ( rule__ContainerType__Alternatives ) ) )
            // InternalDataflowDSL.g:633:2: ( ( rule__ContainerType__Alternatives ) )
            {
            // InternalDataflowDSL.g:633:2: ( ( rule__ContainerType__Alternatives ) )
            // InternalDataflowDSL.g:634:3: ( rule__ContainerType__Alternatives )
            {
             before(grammarAccess.getContainerTypeAccess().getAlternatives()); 
            // InternalDataflowDSL.g:635:3: ( rule__ContainerType__Alternatives )
            // InternalDataflowDSL.g:635:4: rule__ContainerType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContainerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContainerTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContainerType"


    // $ANTLR start "ruleOrOperator"
    // InternalDataflowDSL.g:644:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:648:1: ( ( ( 'or' ) ) )
            // InternalDataflowDSL.g:649:2: ( ( 'or' ) )
            {
            // InternalDataflowDSL.g:649:2: ( ( 'or' ) )
            // InternalDataflowDSL.g:650:3: ( 'or' )
            {
             before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalDataflowDSL.g:651:3: ( 'or' )
            // InternalDataflowDSL.g:651:4: 'or'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalDataflowDSL.g:660:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:664:1: ( ( ( 'and' ) ) )
            // InternalDataflowDSL.g:665:2: ( ( 'and' ) )
            {
            // InternalDataflowDSL.g:665:2: ( ( 'and' ) )
            // InternalDataflowDSL.g:666:3: ( 'and' )
            {
             before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalDataflowDSL.g:667:3: ( 'and' )
            // InternalDataflowDSL.g:667:4: 'and'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalDataflowDSL.g:676:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:680:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:681:2: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:681:2: ( ( rule__EqualityOperator__Alternatives ) )
            // InternalDataflowDSL.g:682:3: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:683:3: ( rule__EqualityOperator__Alternatives )
            // InternalDataflowDSL.g:683:4: rule__EqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalDataflowDSL.g:692:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:696:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:697:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:697:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalDataflowDSL.g:698:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:699:3: ( rule__RelationalOperator__Alternatives )
            // InternalDataflowDSL.g:699:4: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalDataflowDSL.g:708:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:712:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:713:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:713:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalDataflowDSL.g:714:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:715:3: ( rule__AdditiveOperator__Alternatives )
            // InternalDataflowDSL.g:715:4: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalDataflowDSL.g:724:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:728:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:729:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:729:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalDataflowDSL.g:730:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:731:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalDataflowDSL.g:731:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalDataflowDSL.g:740:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:744:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:745:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:745:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalDataflowDSL.g:746:3: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:747:3: ( rule__UnaryOperator__Alternatives )
            // InternalDataflowDSL.g:747:4: rule__UnaryOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalDataflowDSL.g:755:1: rule__Element__Alternatives : ( ( ruleAllInstances ) | ( ruleNewInstance ) | ( ruleFilter ) | ( ruleSort ) | ( ruleProduct ) | ( ruleGetFeature ) | ( ruleSetFeature ) | ( ruleNewContainer ) | ( ruleAddToContainer ) | ( ruleEvaluate ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:759:1: ( ( ruleAllInstances ) | ( ruleNewInstance ) | ( ruleFilter ) | ( ruleSort ) | ( ruleProduct ) | ( ruleGetFeature ) | ( ruleSetFeature ) | ( ruleNewContainer ) | ( ruleAddToContainer ) | ( ruleEvaluate ) )
            int alt1=10;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            case 45:
                {
                alt1=4;
                }
                break;
            case 47:
                {
                alt1=5;
                }
                break;
            case 48:
                {
                alt1=6;
                }
                break;
            case 52:
                {
                alt1=7;
                }
                break;
            case 53:
                {
                alt1=8;
                }
                break;
            case 56:
                {
                alt1=9;
                }
                break;
            case 58:
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDataflowDSL.g:760:2: ( ruleAllInstances )
                    {
                    // InternalDataflowDSL.g:760:2: ( ruleAllInstances )
                    // InternalDataflowDSL.g:761:3: ruleAllInstances
                    {
                     before(grammarAccess.getElementAccess().getAllInstancesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllInstances();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getAllInstancesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:766:2: ( ruleNewInstance )
                    {
                    // InternalDataflowDSL.g:766:2: ( ruleNewInstance )
                    // InternalDataflowDSL.g:767:3: ruleNewInstance
                    {
                     before(grammarAccess.getElementAccess().getNewInstanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNewInstance();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getNewInstanceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:772:2: ( ruleFilter )
                    {
                    // InternalDataflowDSL.g:772:2: ( ruleFilter )
                    // InternalDataflowDSL.g:773:3: ruleFilter
                    {
                     before(grammarAccess.getElementAccess().getFilterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFilter();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFilterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:778:2: ( ruleSort )
                    {
                    // InternalDataflowDSL.g:778:2: ( ruleSort )
                    // InternalDataflowDSL.g:779:3: ruleSort
                    {
                     before(grammarAccess.getElementAccess().getSortParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSort();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSortParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataflowDSL.g:784:2: ( ruleProduct )
                    {
                    // InternalDataflowDSL.g:784:2: ( ruleProduct )
                    // InternalDataflowDSL.g:785:3: ruleProduct
                    {
                     before(grammarAccess.getElementAccess().getProductParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleProduct();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getProductParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataflowDSL.g:790:2: ( ruleGetFeature )
                    {
                    // InternalDataflowDSL.g:790:2: ( ruleGetFeature )
                    // InternalDataflowDSL.g:791:3: ruleGetFeature
                    {
                     before(grammarAccess.getElementAccess().getGetFeatureParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleGetFeature();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getGetFeatureParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataflowDSL.g:796:2: ( ruleSetFeature )
                    {
                    // InternalDataflowDSL.g:796:2: ( ruleSetFeature )
                    // InternalDataflowDSL.g:797:3: ruleSetFeature
                    {
                     before(grammarAccess.getElementAccess().getSetFeatureParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSetFeature();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSetFeatureParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataflowDSL.g:802:2: ( ruleNewContainer )
                    {
                    // InternalDataflowDSL.g:802:2: ( ruleNewContainer )
                    // InternalDataflowDSL.g:803:3: ruleNewContainer
                    {
                     before(grammarAccess.getElementAccess().getNewContainerParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleNewContainer();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getNewContainerParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataflowDSL.g:808:2: ( ruleAddToContainer )
                    {
                    // InternalDataflowDSL.g:808:2: ( ruleAddToContainer )
                    // InternalDataflowDSL.g:809:3: ruleAddToContainer
                    {
                     before(grammarAccess.getElementAccess().getAddToContainerParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleAddToContainer();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getAddToContainerParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataflowDSL.g:814:2: ( ruleEvaluate )
                    {
                    // InternalDataflowDSL.g:814:2: ( ruleEvaluate )
                    // InternalDataflowDSL.g:815:3: ruleEvaluate
                    {
                     before(grammarAccess.getElementAccess().getEvaluateParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleEvaluate();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEvaluateParserRuleCall_9()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalDataflowDSL.g:824:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:828:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26||(LA2_0>=30 && LA2_0<=33)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=13 && LA2_0<=14)||LA2_0==60||LA2_0==62) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataflowDSL.g:829:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:829:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:830:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:831:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalDataflowDSL.g:831:4: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:835:2: ( rulePrimaryExpression )
                    {
                    // InternalDataflowDSL.g:835:2: ( rulePrimaryExpression )
                    // InternalDataflowDSL.g:836:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalDataflowDSL.g:845:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:849:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=11 && LA3_1<=12)||(LA3_1>=19 && LA3_1<=29)||LA3_1==36||LA3_1==40||LA3_1==61) ) {
                    alt3=1;
                }
                else if ( (LA3_1==62) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
            case 14:
                {
                alt3=2;
                }
                break;
            case 62:
                {
                alt3=3;
                }
                break;
            case RULE_STRING:
                {
                alt3=4;
                }
                break;
            case RULE_ID:
                {
                alt3=5;
                }
                break;
            case 60:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDataflowDSL.g:850:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:850:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:851:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:852:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalDataflowDSL.g:852:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:856:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalDataflowDSL.g:856:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalDataflowDSL.g:857:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalDataflowDSL.g:858:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalDataflowDSL.g:858:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:862:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalDataflowDSL.g:862:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalDataflowDSL.g:863:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalDataflowDSL.g:864:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalDataflowDSL.g:864:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:868:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalDataflowDSL.g:868:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalDataflowDSL.g:869:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalDataflowDSL.g:870:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalDataflowDSL.g:870:4: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataflowDSL.g:874:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalDataflowDSL.g:874:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalDataflowDSL.g:875:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalDataflowDSL.g:876:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalDataflowDSL.g:876:4: rule__PrimaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataflowDSL.g:880:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // InternalDataflowDSL.g:880:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // InternalDataflowDSL.g:881:3: ( rule__PrimaryExpression__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    // InternalDataflowDSL.g:882:3: ( rule__PrimaryExpression__Group_5__0 )
                    // InternalDataflowDSL.g:882:4: rule__PrimaryExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalDataflowDSL.g:890:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:894:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataflowDSL.g:895:2: ( 'true' )
                    {
                    // InternalDataflowDSL.g:895:2: ( 'true' )
                    // InternalDataflowDSL.g:896:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:901:2: ( 'false' )
                    {
                    // InternalDataflowDSL.g:901:2: ( 'false' )
                    // InternalDataflowDSL.g:902:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_3_0"
    // InternalDataflowDSL.g:911:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:915:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataflowDSL.g:916:2: ( 'E' )
                    {
                    // InternalDataflowDSL.g:916:2: ( 'E' )
                    // InternalDataflowDSL.g:917:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:922:2: ( 'e' )
                    {
                    // InternalDataflowDSL.g:922:2: ( 'e' )
                    // InternalDataflowDSL.g:923:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_3_0"


    // $ANTLR start "rule__ContainerType__Alternatives"
    // InternalDataflowDSL.g:932:1: rule__ContainerType__Alternatives : ( ( ( 'list' ) ) | ( ( 'set' ) ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:936:1: ( ( ( 'list' ) ) | ( ( 'set' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
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
                    // InternalDataflowDSL.g:937:2: ( ( 'list' ) )
                    {
                    // InternalDataflowDSL.g:937:2: ( ( 'list' ) )
                    // InternalDataflowDSL.g:938:3: ( 'list' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:939:3: ( 'list' )
                    // InternalDataflowDSL.g:939:4: 'list'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:943:2: ( ( 'set' ) )
                    {
                    // InternalDataflowDSL.g:943:2: ( ( 'set' ) )
                    // InternalDataflowDSL.g:944:3: ( 'set' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:945:3: ( 'set' )
                    // InternalDataflowDSL.g:945:4: 'set'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ContainerType__Alternatives"


    // $ANTLR start "rule__EqualityOperator__Alternatives"
    // InternalDataflowDSL.g:953:1: rule__EqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:957:1: ( ( ( '=' ) ) | ( ( '!=' ) ) )
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
                    // InternalDataflowDSL.g:958:2: ( ( '=' ) )
                    {
                    // InternalDataflowDSL.g:958:2: ( ( '=' ) )
                    // InternalDataflowDSL.g:959:3: ( '=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:960:3: ( '=' )
                    // InternalDataflowDSL.g:960:4: '='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:964:2: ( ( '!=' ) )
                    {
                    // InternalDataflowDSL.g:964:2: ( ( '!=' ) )
                    // InternalDataflowDSL.g:965:3: ( '!=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:966:3: ( '!=' )
                    // InternalDataflowDSL.g:966:4: '!='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EqualityOperator__Alternatives"


    // $ANTLR start "rule__RelationalOperator__Alternatives"
    // InternalDataflowDSL.g:974:1: rule__RelationalOperator__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:978:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
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
                    // InternalDataflowDSL.g:979:2: ( ( '>' ) )
                    {
                    // InternalDataflowDSL.g:979:2: ( ( '>' ) )
                    // InternalDataflowDSL.g:980:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:981:3: ( '>' )
                    // InternalDataflowDSL.g:981:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:985:2: ( ( '>=' ) )
                    {
                    // InternalDataflowDSL.g:985:2: ( ( '>=' ) )
                    // InternalDataflowDSL.g:986:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:987:3: ( '>=' )
                    // InternalDataflowDSL.g:987:4: '>='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:991:2: ( ( '<' ) )
                    {
                    // InternalDataflowDSL.g:991:2: ( ( '<' ) )
                    // InternalDataflowDSL.g:992:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:993:3: ( '<' )
                    // InternalDataflowDSL.g:993:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:997:2: ( ( '<=' ) )
                    {
                    // InternalDataflowDSL.g:997:2: ( ( '<=' ) )
                    // InternalDataflowDSL.g:998:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3()); 
                    // InternalDataflowDSL.g:999:3: ( '<=' )
                    // InternalDataflowDSL.g:999:4: '<='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__RelationalOperator__Alternatives"


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // InternalDataflowDSL.g:1007:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1011:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataflowDSL.g:1012:2: ( ( '+' ) )
                    {
                    // InternalDataflowDSL.g:1012:2: ( ( '+' ) )
                    // InternalDataflowDSL.g:1013:3: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1014:3: ( '+' )
                    // InternalDataflowDSL.g:1014:4: '+'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1018:2: ( ( '-' ) )
                    {
                    // InternalDataflowDSL.g:1018:2: ( ( '-' ) )
                    // InternalDataflowDSL.g:1019:3: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1020:3: ( '-' )
                    // InternalDataflowDSL.g:1020:4: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AdditiveOperator__Alternatives"


    // $ANTLR start "rule__MultiplicativeOperator__Alternatives"
    // InternalDataflowDSL.g:1028:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1032:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDataflowDSL.g:1033:2: ( ( '*' ) )
                    {
                    // InternalDataflowDSL.g:1033:2: ( ( '*' ) )
                    // InternalDataflowDSL.g:1034:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1035:3: ( '*' )
                    // InternalDataflowDSL.g:1035:4: '*'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1039:2: ( ( '/' ) )
                    {
                    // InternalDataflowDSL.g:1039:2: ( ( '/' ) )
                    // InternalDataflowDSL.g:1040:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1041:3: ( '/' )
                    // InternalDataflowDSL.g:1041:4: '/'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1045:2: ( ( '%' ) )
                    {
                    // InternalDataflowDSL.g:1045:2: ( ( '%' ) )
                    // InternalDataflowDSL.g:1046:3: ( '%' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:1047:3: ( '%' )
                    // InternalDataflowDSL.g:1047:4: '%'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__MultiplicativeOperator__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // InternalDataflowDSL.g:1055:1: rule__UnaryOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) | ( ( 'size' ) ) | ( ( 'defined' ) ) | ( ( 'undefined' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1059:1: ( ( ( 'not' ) ) | ( ( '-' ) ) | ( ( 'size' ) ) | ( ( 'defined' ) ) | ( ( 'undefined' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDataflowDSL.g:1060:2: ( ( 'not' ) )
                    {
                    // InternalDataflowDSL.g:1060:2: ( ( 'not' ) )
                    // InternalDataflowDSL.g:1061:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1062:3: ( 'not' )
                    // InternalDataflowDSL.g:1062:4: 'not'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1066:2: ( ( '-' ) )
                    {
                    // InternalDataflowDSL.g:1066:2: ( ( '-' ) )
                    // InternalDataflowDSL.g:1067:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1068:3: ( '-' )
                    // InternalDataflowDSL.g:1068:4: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1072:2: ( ( 'size' ) )
                    {
                    // InternalDataflowDSL.g:1072:2: ( ( 'size' ) )
                    // InternalDataflowDSL.g:1073:3: ( 'size' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getSIZEEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:1074:3: ( 'size' )
                    // InternalDataflowDSL.g:1074:4: 'size'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getSIZEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1078:2: ( ( 'defined' ) )
                    {
                    // InternalDataflowDSL.g:1078:2: ( ( 'defined' ) )
                    // InternalDataflowDSL.g:1079:3: ( 'defined' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getIS_DEFINEDEnumLiteralDeclaration_3()); 
                    // InternalDataflowDSL.g:1080:3: ( 'defined' )
                    // InternalDataflowDSL.g:1080:4: 'defined'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getIS_DEFINEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataflowDSL.g:1084:2: ( ( 'undefined' ) )
                    {
                    // InternalDataflowDSL.g:1084:2: ( ( 'undefined' ) )
                    // InternalDataflowDSL.g:1085:3: ( 'undefined' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getIS_UNDEFINEDEnumLiteralDeclaration_4()); 
                    // InternalDataflowDSL.g:1086:3: ( 'undefined' )
                    // InternalDataflowDSL.g:1086:4: 'undefined'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getIS_UNDEFINEDEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__UnaryOperator__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDataflowDSL.g:1094:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1098:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDataflowDSL.g:1099:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDataflowDSL.g:1106:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1110:1: ( ( () ) )
            // InternalDataflowDSL.g:1111:1: ( () )
            {
            // InternalDataflowDSL.g:1111:1: ( () )
            // InternalDataflowDSL.g:1112:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalDataflowDSL.g:1113:2: ()
            // InternalDataflowDSL.g:1113:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDataflowDSL.g:1121:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1125:1: ( rule__Model__Group__1__Impl )
            // InternalDataflowDSL.g:1126:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // InternalDataflowDSL.g:1132:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1136:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDataflowDSL.g:1137:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDataflowDSL.g:1137:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDataflowDSL.g:1138:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDataflowDSL.g:1139:2: ( rule__Model__ElementsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34||(LA12_0>=41 && LA12_0<=42)||LA12_0==45||(LA12_0>=47 && LA12_0<=48)||(LA12_0>=52 && LA12_0<=53)||LA12_0==56||LA12_0==58) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDataflowDSL.g:1139:3: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

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


    // $ANTLR start "rule__AllInstances__Group__0"
    // InternalDataflowDSL.g:1148:1: rule__AllInstances__Group__0 : rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 ;
    public final void rule__AllInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1152:1: ( rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 )
            // InternalDataflowDSL.g:1153:2: rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__1();

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
    // $ANTLR end "rule__AllInstances__Group__0"


    // $ANTLR start "rule__AllInstances__Group__0__Impl"
    // InternalDataflowDSL.g:1160:1: rule__AllInstances__Group__0__Impl : ( 'AllInstances' ) ;
    public final void rule__AllInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1164:1: ( ( 'AllInstances' ) )
            // InternalDataflowDSL.g:1165:1: ( 'AllInstances' )
            {
            // InternalDataflowDSL.g:1165:1: ( 'AllInstances' )
            // InternalDataflowDSL.g:1166:2: 'AllInstances'
            {
             before(grammarAccess.getAllInstancesAccess().getAllInstancesKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getAllInstancesKeyword_0()); 

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
    // $ANTLR end "rule__AllInstances__Group__0__Impl"


    // $ANTLR start "rule__AllInstances__Group__1"
    // InternalDataflowDSL.g:1175:1: rule__AllInstances__Group__1 : rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2 ;
    public final void rule__AllInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1179:1: ( rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2 )
            // InternalDataflowDSL.g:1180:2: rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AllInstances__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__2();

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
    // $ANTLR end "rule__AllInstances__Group__1"


    // $ANTLR start "rule__AllInstances__Group__1__Impl"
    // InternalDataflowDSL.g:1187:1: rule__AllInstances__Group__1__Impl : ( ( rule__AllInstances__NameAssignment_1 ) ) ;
    public final void rule__AllInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1191:1: ( ( ( rule__AllInstances__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:1192:1: ( ( rule__AllInstances__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:1192:1: ( ( rule__AllInstances__NameAssignment_1 ) )
            // InternalDataflowDSL.g:1193:2: ( rule__AllInstances__NameAssignment_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:1194:2: ( rule__AllInstances__NameAssignment_1 )
            // InternalDataflowDSL.g:1194:3: rule__AllInstances__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AllInstances__Group__1__Impl"


    // $ANTLR start "rule__AllInstances__Group__2"
    // InternalDataflowDSL.g:1202:1: rule__AllInstances__Group__2 : rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3 ;
    public final void rule__AllInstances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1206:1: ( rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3 )
            // InternalDataflowDSL.g:1207:2: rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__AllInstances__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__3();

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
    // $ANTLR end "rule__AllInstances__Group__2"


    // $ANTLR start "rule__AllInstances__Group__2__Impl"
    // InternalDataflowDSL.g:1214:1: rule__AllInstances__Group__2__Impl : ( '{' ) ;
    public final void rule__AllInstances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1218:1: ( ( '{' ) )
            // InternalDataflowDSL.g:1219:1: ( '{' )
            {
            // InternalDataflowDSL.g:1219:1: ( '{' )
            // InternalDataflowDSL.g:1220:2: '{'
            {
             before(grammarAccess.getAllInstancesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AllInstances__Group__2__Impl"


    // $ANTLR start "rule__AllInstances__Group__3"
    // InternalDataflowDSL.g:1229:1: rule__AllInstances__Group__3 : rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4 ;
    public final void rule__AllInstances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1233:1: ( rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4 )
            // InternalDataflowDSL.g:1234:2: rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__AllInstances__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__4();

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
    // $ANTLR end "rule__AllInstances__Group__3"


    // $ANTLR start "rule__AllInstances__Group__3__Impl"
    // InternalDataflowDSL.g:1241:1: rule__AllInstances__Group__3__Impl : ( ( rule__AllInstances__Group_3__0 )? ) ;
    public final void rule__AllInstances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1245:1: ( ( ( rule__AllInstances__Group_3__0 )? ) )
            // InternalDataflowDSL.g:1246:1: ( ( rule__AllInstances__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:1246:1: ( ( rule__AllInstances__Group_3__0 )? )
            // InternalDataflowDSL.g:1247:2: ( rule__AllInstances__Group_3__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_3()); 
            // InternalDataflowDSL.g:1248:2: ( rule__AllInstances__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataflowDSL.g:1248:3: rule__AllInstances__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllInstancesAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AllInstances__Group__3__Impl"


    // $ANTLR start "rule__AllInstances__Group__4"
    // InternalDataflowDSL.g:1256:1: rule__AllInstances__Group__4 : rule__AllInstances__Group__4__Impl rule__AllInstances__Group__5 ;
    public final void rule__AllInstances__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1260:1: ( rule__AllInstances__Group__4__Impl rule__AllInstances__Group__5 )
            // InternalDataflowDSL.g:1261:2: rule__AllInstances__Group__4__Impl rule__AllInstances__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AllInstances__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__5();

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
    // $ANTLR end "rule__AllInstances__Group__4"


    // $ANTLR start "rule__AllInstances__Group__4__Impl"
    // InternalDataflowDSL.g:1268:1: rule__AllInstances__Group__4__Impl : ( ( rule__AllInstances__Group_4__0 )? ) ;
    public final void rule__AllInstances__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1272:1: ( ( ( rule__AllInstances__Group_4__0 )? ) )
            // InternalDataflowDSL.g:1273:1: ( ( rule__AllInstances__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:1273:1: ( ( rule__AllInstances__Group_4__0 )? )
            // InternalDataflowDSL.g:1274:2: ( rule__AllInstances__Group_4__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_4()); 
            // InternalDataflowDSL.g:1275:2: ( rule__AllInstances__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataflowDSL.g:1275:3: rule__AllInstances__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllInstancesAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AllInstances__Group__4__Impl"


    // $ANTLR start "rule__AllInstances__Group__5"
    // InternalDataflowDSL.g:1283:1: rule__AllInstances__Group__5 : rule__AllInstances__Group__5__Impl rule__AllInstances__Group__6 ;
    public final void rule__AllInstances__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1287:1: ( rule__AllInstances__Group__5__Impl rule__AllInstances__Group__6 )
            // InternalDataflowDSL.g:1288:2: rule__AllInstances__Group__5__Impl rule__AllInstances__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__AllInstances__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__6();

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
    // $ANTLR end "rule__AllInstances__Group__5"


    // $ANTLR start "rule__AllInstances__Group__5__Impl"
    // InternalDataflowDSL.g:1295:1: rule__AllInstances__Group__5__Impl : ( ( rule__AllInstances__Group_5__0 )? ) ;
    public final void rule__AllInstances__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1299:1: ( ( ( rule__AllInstances__Group_5__0 )? ) )
            // InternalDataflowDSL.g:1300:1: ( ( rule__AllInstances__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:1300:1: ( ( rule__AllInstances__Group_5__0 )? )
            // InternalDataflowDSL.g:1301:2: ( rule__AllInstances__Group_5__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_5()); 
            // InternalDataflowDSL.g:1302:2: ( rule__AllInstances__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataflowDSL.g:1302:3: rule__AllInstances__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllInstancesAccess().getGroup_5()); 

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
    // $ANTLR end "rule__AllInstances__Group__5__Impl"


    // $ANTLR start "rule__AllInstances__Group__6"
    // InternalDataflowDSL.g:1310:1: rule__AllInstances__Group__6 : rule__AllInstances__Group__6__Impl rule__AllInstances__Group__7 ;
    public final void rule__AllInstances__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1314:1: ( rule__AllInstances__Group__6__Impl rule__AllInstances__Group__7 )
            // InternalDataflowDSL.g:1315:2: rule__AllInstances__Group__6__Impl rule__AllInstances__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__AllInstances__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__7();

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
    // $ANTLR end "rule__AllInstances__Group__6"


    // $ANTLR start "rule__AllInstances__Group__6__Impl"
    // InternalDataflowDSL.g:1322:1: rule__AllInstances__Group__6__Impl : ( ( rule__AllInstances__Group_6__0 )? ) ;
    public final void rule__AllInstances__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1326:1: ( ( ( rule__AllInstances__Group_6__0 )? ) )
            // InternalDataflowDSL.g:1327:1: ( ( rule__AllInstances__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:1327:1: ( ( rule__AllInstances__Group_6__0 )? )
            // InternalDataflowDSL.g:1328:2: ( rule__AllInstances__Group_6__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_6()); 
            // InternalDataflowDSL.g:1329:2: ( rule__AllInstances__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataflowDSL.g:1329:3: rule__AllInstances__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllInstancesAccess().getGroup_6()); 

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
    // $ANTLR end "rule__AllInstances__Group__6__Impl"


    // $ANTLR start "rule__AllInstances__Group__7"
    // InternalDataflowDSL.g:1337:1: rule__AllInstances__Group__7 : rule__AllInstances__Group__7__Impl ;
    public final void rule__AllInstances__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1341:1: ( rule__AllInstances__Group__7__Impl )
            // InternalDataflowDSL.g:1342:2: rule__AllInstances__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__7__Impl();

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
    // $ANTLR end "rule__AllInstances__Group__7"


    // $ANTLR start "rule__AllInstances__Group__7__Impl"
    // InternalDataflowDSL.g:1348:1: rule__AllInstances__Group__7__Impl : ( '}' ) ;
    public final void rule__AllInstances__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1352:1: ( ( '}' ) )
            // InternalDataflowDSL.g:1353:1: ( '}' )
            {
            // InternalDataflowDSL.g:1353:1: ( '}' )
            // InternalDataflowDSL.g:1354:2: '}'
            {
             before(grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__AllInstances__Group__7__Impl"


    // $ANTLR start "rule__AllInstances__Group_3__0"
    // InternalDataflowDSL.g:1364:1: rule__AllInstances__Group_3__0 : rule__AllInstances__Group_3__0__Impl rule__AllInstances__Group_3__1 ;
    public final void rule__AllInstances__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1368:1: ( rule__AllInstances__Group_3__0__Impl rule__AllInstances__Group_3__1 )
            // InternalDataflowDSL.g:1369:2: rule__AllInstances__Group_3__0__Impl rule__AllInstances__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3__1();

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
    // $ANTLR end "rule__AllInstances__Group_3__0"


    // $ANTLR start "rule__AllInstances__Group_3__0__Impl"
    // InternalDataflowDSL.g:1376:1: rule__AllInstances__Group_3__0__Impl : ( 'field' ) ;
    public final void rule__AllInstances__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1380:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:1381:1: ( 'field' )
            {
            // InternalDataflowDSL.g:1381:1: ( 'field' )
            // InternalDataflowDSL.g:1382:2: 'field'
            {
             before(grammarAccess.getAllInstancesAccess().getFieldKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__AllInstances__Group_3__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_3__1"
    // InternalDataflowDSL.g:1391:1: rule__AllInstances__Group_3__1 : rule__AllInstances__Group_3__1__Impl ;
    public final void rule__AllInstances__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1395:1: ( rule__AllInstances__Group_3__1__Impl )
            // InternalDataflowDSL.g:1396:2: rule__AllInstances__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3__1__Impl();

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
    // $ANTLR end "rule__AllInstances__Group_3__1"


    // $ANTLR start "rule__AllInstances__Group_3__1__Impl"
    // InternalDataflowDSL.g:1402:1: rule__AllInstances__Group_3__1__Impl : ( ( rule__AllInstances__FieldAssignment_3_1 ) ) ;
    public final void rule__AllInstances__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1406:1: ( ( ( rule__AllInstances__FieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:1407:1: ( ( rule__AllInstances__FieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:1407:1: ( ( rule__AllInstances__FieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:1408:2: ( rule__AllInstances__FieldAssignment_3_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:1409:2: ( rule__AllInstances__FieldAssignment_3_1 )
            // InternalDataflowDSL.g:1409:3: rule__AllInstances__FieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__FieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__AllInstances__Group_3__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_4__0"
    // InternalDataflowDSL.g:1418:1: rule__AllInstances__Group_4__0 : rule__AllInstances__Group_4__0__Impl rule__AllInstances__Group_4__1 ;
    public final void rule__AllInstances__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1422:1: ( rule__AllInstances__Group_4__0__Impl rule__AllInstances__Group_4__1 )
            // InternalDataflowDSL.g:1423:2: rule__AllInstances__Group_4__0__Impl rule__AllInstances__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__AllInstances__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4__1();

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
    // $ANTLR end "rule__AllInstances__Group_4__0"


    // $ANTLR start "rule__AllInstances__Group_4__0__Impl"
    // InternalDataflowDSL.g:1430:1: rule__AllInstances__Group_4__0__Impl : ( 'nsURI' ) ;
    public final void rule__AllInstances__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1434:1: ( ( 'nsURI' ) )
            // InternalDataflowDSL.g:1435:1: ( 'nsURI' )
            {
            // InternalDataflowDSL.g:1435:1: ( 'nsURI' )
            // InternalDataflowDSL.g:1436:2: 'nsURI'
            {
             before(grammarAccess.getAllInstancesAccess().getNsURIKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getNsURIKeyword_4_0()); 

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
    // $ANTLR end "rule__AllInstances__Group_4__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_4__1"
    // InternalDataflowDSL.g:1445:1: rule__AllInstances__Group_4__1 : rule__AllInstances__Group_4__1__Impl ;
    public final void rule__AllInstances__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1449:1: ( rule__AllInstances__Group_4__1__Impl )
            // InternalDataflowDSL.g:1450:2: rule__AllInstances__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4__1__Impl();

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
    // $ANTLR end "rule__AllInstances__Group_4__1"


    // $ANTLR start "rule__AllInstances__Group_4__1__Impl"
    // InternalDataflowDSL.g:1456:1: rule__AllInstances__Group_4__1__Impl : ( ( rule__AllInstances__NsURIAssignment_4_1 ) ) ;
    public final void rule__AllInstances__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1460:1: ( ( ( rule__AllInstances__NsURIAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:1461:1: ( ( rule__AllInstances__NsURIAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:1461:1: ( ( rule__AllInstances__NsURIAssignment_4_1 ) )
            // InternalDataflowDSL.g:1462:2: ( rule__AllInstances__NsURIAssignment_4_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getNsURIAssignment_4_1()); 
            // InternalDataflowDSL.g:1463:2: ( rule__AllInstances__NsURIAssignment_4_1 )
            // InternalDataflowDSL.g:1463:3: rule__AllInstances__NsURIAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__NsURIAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getNsURIAssignment_4_1()); 

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
    // $ANTLR end "rule__AllInstances__Group_4__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_5__0"
    // InternalDataflowDSL.g:1472:1: rule__AllInstances__Group_5__0 : rule__AllInstances__Group_5__0__Impl rule__AllInstances__Group_5__1 ;
    public final void rule__AllInstances__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1476:1: ( rule__AllInstances__Group_5__0__Impl rule__AllInstances__Group_5__1 )
            // InternalDataflowDSL.g:1477:2: rule__AllInstances__Group_5__0__Impl rule__AllInstances__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_5__1();

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
    // $ANTLR end "rule__AllInstances__Group_5__0"


    // $ANTLR start "rule__AllInstances__Group_5__0__Impl"
    // InternalDataflowDSL.g:1484:1: rule__AllInstances__Group_5__0__Impl : ( 'typeName' ) ;
    public final void rule__AllInstances__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1488:1: ( ( 'typeName' ) )
            // InternalDataflowDSL.g:1489:1: ( 'typeName' )
            {
            // InternalDataflowDSL.g:1489:1: ( 'typeName' )
            // InternalDataflowDSL.g:1490:2: 'typeName'
            {
             before(grammarAccess.getAllInstancesAccess().getTypeNameKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTypeNameKeyword_5_0()); 

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
    // $ANTLR end "rule__AllInstances__Group_5__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_5__1"
    // InternalDataflowDSL.g:1499:1: rule__AllInstances__Group_5__1 : rule__AllInstances__Group_5__1__Impl ;
    public final void rule__AllInstances__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1503:1: ( rule__AllInstances__Group_5__1__Impl )
            // InternalDataflowDSL.g:1504:2: rule__AllInstances__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_5__1__Impl();

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
    // $ANTLR end "rule__AllInstances__Group_5__1"


    // $ANTLR start "rule__AllInstances__Group_5__1__Impl"
    // InternalDataflowDSL.g:1510:1: rule__AllInstances__Group_5__1__Impl : ( ( rule__AllInstances__TypeNameAssignment_5_1 ) ) ;
    public final void rule__AllInstances__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1514:1: ( ( ( rule__AllInstances__TypeNameAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:1515:1: ( ( rule__AllInstances__TypeNameAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:1515:1: ( ( rule__AllInstances__TypeNameAssignment_5_1 ) )
            // InternalDataflowDSL.g:1516:2: ( rule__AllInstances__TypeNameAssignment_5_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getTypeNameAssignment_5_1()); 
            // InternalDataflowDSL.g:1517:2: ( rule__AllInstances__TypeNameAssignment_5_1 )
            // InternalDataflowDSL.g:1517:3: rule__AllInstances__TypeNameAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__TypeNameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getTypeNameAssignment_5_1()); 

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
    // $ANTLR end "rule__AllInstances__Group_5__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_6__0"
    // InternalDataflowDSL.g:1526:1: rule__AllInstances__Group_6__0 : rule__AllInstances__Group_6__0__Impl rule__AllInstances__Group_6__1 ;
    public final void rule__AllInstances__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1530:1: ( rule__AllInstances__Group_6__0__Impl rule__AllInstances__Group_6__1 )
            // InternalDataflowDSL.g:1531:2: rule__AllInstances__Group_6__0__Impl rule__AllInstances__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_6__1();

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
    // $ANTLR end "rule__AllInstances__Group_6__0"


    // $ANTLR start "rule__AllInstances__Group_6__0__Impl"
    // InternalDataflowDSL.g:1538:1: rule__AllInstances__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__AllInstances__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1542:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:1543:1: ( 'target' )
            {
            // InternalDataflowDSL.g:1543:1: ( 'target' )
            // InternalDataflowDSL.g:1544:2: 'target'
            {
             before(grammarAccess.getAllInstancesAccess().getTargetKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTargetKeyword_6_0()); 

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
    // $ANTLR end "rule__AllInstances__Group_6__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_6__1"
    // InternalDataflowDSL.g:1553:1: rule__AllInstances__Group_6__1 : rule__AllInstances__Group_6__1__Impl ;
    public final void rule__AllInstances__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1557:1: ( rule__AllInstances__Group_6__1__Impl )
            // InternalDataflowDSL.g:1558:2: rule__AllInstances__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_6__1__Impl();

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
    // $ANTLR end "rule__AllInstances__Group_6__1"


    // $ANTLR start "rule__AllInstances__Group_6__1__Impl"
    // InternalDataflowDSL.g:1564:1: rule__AllInstances__Group_6__1__Impl : ( ( rule__AllInstances__TargetAssignment_6_1 ) ) ;
    public final void rule__AllInstances__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1568:1: ( ( ( rule__AllInstances__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:1569:1: ( ( rule__AllInstances__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:1569:1: ( ( rule__AllInstances__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:1570:2: ( rule__AllInstances__TargetAssignment_6_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:1571:2: ( rule__AllInstances__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:1571:3: rule__AllInstances__TargetAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__TargetAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getTargetAssignment_6_1()); 

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
    // $ANTLR end "rule__AllInstances__Group_6__1__Impl"


    // $ANTLR start "rule__NewInstance__Group__0"
    // InternalDataflowDSL.g:1580:1: rule__NewInstance__Group__0 : rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1 ;
    public final void rule__NewInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1584:1: ( rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1 )
            // InternalDataflowDSL.g:1585:2: rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__1();

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
    // $ANTLR end "rule__NewInstance__Group__0"


    // $ANTLR start "rule__NewInstance__Group__0__Impl"
    // InternalDataflowDSL.g:1592:1: rule__NewInstance__Group__0__Impl : ( 'NewInstance' ) ;
    public final void rule__NewInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1596:1: ( ( 'NewInstance' ) )
            // InternalDataflowDSL.g:1597:1: ( 'NewInstance' )
            {
            // InternalDataflowDSL.g:1597:1: ( 'NewInstance' )
            // InternalDataflowDSL.g:1598:2: 'NewInstance'
            {
             before(grammarAccess.getNewInstanceAccess().getNewInstanceKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getNewInstanceKeyword_0()); 

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
    // $ANTLR end "rule__NewInstance__Group__0__Impl"


    // $ANTLR start "rule__NewInstance__Group__1"
    // InternalDataflowDSL.g:1607:1: rule__NewInstance__Group__1 : rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2 ;
    public final void rule__NewInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1611:1: ( rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2 )
            // InternalDataflowDSL.g:1612:2: rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__NewInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__2();

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
    // $ANTLR end "rule__NewInstance__Group__1"


    // $ANTLR start "rule__NewInstance__Group__1__Impl"
    // InternalDataflowDSL.g:1619:1: rule__NewInstance__Group__1__Impl : ( ( rule__NewInstance__NameAssignment_1 ) ) ;
    public final void rule__NewInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1623:1: ( ( ( rule__NewInstance__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:1624:1: ( ( rule__NewInstance__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:1624:1: ( ( rule__NewInstance__NameAssignment_1 ) )
            // InternalDataflowDSL.g:1625:2: ( rule__NewInstance__NameAssignment_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:1626:2: ( rule__NewInstance__NameAssignment_1 )
            // InternalDataflowDSL.g:1626:3: rule__NewInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NewInstance__Group__1__Impl"


    // $ANTLR start "rule__NewInstance__Group__2"
    // InternalDataflowDSL.g:1634:1: rule__NewInstance__Group__2 : rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3 ;
    public final void rule__NewInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1638:1: ( rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3 )
            // InternalDataflowDSL.g:1639:2: rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__NewInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__3();

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
    // $ANTLR end "rule__NewInstance__Group__2"


    // $ANTLR start "rule__NewInstance__Group__2__Impl"
    // InternalDataflowDSL.g:1646:1: rule__NewInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__NewInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1650:1: ( ( '{' ) )
            // InternalDataflowDSL.g:1651:1: ( '{' )
            {
            // InternalDataflowDSL.g:1651:1: ( '{' )
            // InternalDataflowDSL.g:1652:2: '{'
            {
             before(grammarAccess.getNewInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__NewInstance__Group__2__Impl"


    // $ANTLR start "rule__NewInstance__Group__3"
    // InternalDataflowDSL.g:1661:1: rule__NewInstance__Group__3 : rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4 ;
    public final void rule__NewInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1665:1: ( rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4 )
            // InternalDataflowDSL.g:1666:2: rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__NewInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__4();

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
    // $ANTLR end "rule__NewInstance__Group__3"


    // $ANTLR start "rule__NewInstance__Group__3__Impl"
    // InternalDataflowDSL.g:1673:1: rule__NewInstance__Group__3__Impl : ( ( rule__NewInstance__Group_3__0 )? ) ;
    public final void rule__NewInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1677:1: ( ( ( rule__NewInstance__Group_3__0 )? ) )
            // InternalDataflowDSL.g:1678:1: ( ( rule__NewInstance__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:1678:1: ( ( rule__NewInstance__Group_3__0 )? )
            // InternalDataflowDSL.g:1679:2: ( rule__NewInstance__Group_3__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_3()); 
            // InternalDataflowDSL.g:1680:2: ( rule__NewInstance__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataflowDSL.g:1680:3: rule__NewInstance__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewInstanceAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NewInstance__Group__3__Impl"


    // $ANTLR start "rule__NewInstance__Group__4"
    // InternalDataflowDSL.g:1688:1: rule__NewInstance__Group__4 : rule__NewInstance__Group__4__Impl rule__NewInstance__Group__5 ;
    public final void rule__NewInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1692:1: ( rule__NewInstance__Group__4__Impl rule__NewInstance__Group__5 )
            // InternalDataflowDSL.g:1693:2: rule__NewInstance__Group__4__Impl rule__NewInstance__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__NewInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__5();

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
    // $ANTLR end "rule__NewInstance__Group__4"


    // $ANTLR start "rule__NewInstance__Group__4__Impl"
    // InternalDataflowDSL.g:1700:1: rule__NewInstance__Group__4__Impl : ( ( rule__NewInstance__Group_4__0 )? ) ;
    public final void rule__NewInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1704:1: ( ( ( rule__NewInstance__Group_4__0 )? ) )
            // InternalDataflowDSL.g:1705:1: ( ( rule__NewInstance__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:1705:1: ( ( rule__NewInstance__Group_4__0 )? )
            // InternalDataflowDSL.g:1706:2: ( rule__NewInstance__Group_4__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_4()); 
            // InternalDataflowDSL.g:1707:2: ( rule__NewInstance__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataflowDSL.g:1707:3: rule__NewInstance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewInstanceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__NewInstance__Group__4__Impl"


    // $ANTLR start "rule__NewInstance__Group__5"
    // InternalDataflowDSL.g:1715:1: rule__NewInstance__Group__5 : rule__NewInstance__Group__5__Impl rule__NewInstance__Group__6 ;
    public final void rule__NewInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1719:1: ( rule__NewInstance__Group__5__Impl rule__NewInstance__Group__6 )
            // InternalDataflowDSL.g:1720:2: rule__NewInstance__Group__5__Impl rule__NewInstance__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__NewInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__6();

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
    // $ANTLR end "rule__NewInstance__Group__5"


    // $ANTLR start "rule__NewInstance__Group__5__Impl"
    // InternalDataflowDSL.g:1727:1: rule__NewInstance__Group__5__Impl : ( ( rule__NewInstance__Group_5__0 )? ) ;
    public final void rule__NewInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1731:1: ( ( ( rule__NewInstance__Group_5__0 )? ) )
            // InternalDataflowDSL.g:1732:1: ( ( rule__NewInstance__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:1732:1: ( ( rule__NewInstance__Group_5__0 )? )
            // InternalDataflowDSL.g:1733:2: ( rule__NewInstance__Group_5__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_5()); 
            // InternalDataflowDSL.g:1734:2: ( rule__NewInstance__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataflowDSL.g:1734:3: rule__NewInstance__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewInstanceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__NewInstance__Group__5__Impl"


    // $ANTLR start "rule__NewInstance__Group__6"
    // InternalDataflowDSL.g:1742:1: rule__NewInstance__Group__6 : rule__NewInstance__Group__6__Impl rule__NewInstance__Group__7 ;
    public final void rule__NewInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1746:1: ( rule__NewInstance__Group__6__Impl rule__NewInstance__Group__7 )
            // InternalDataflowDSL.g:1747:2: rule__NewInstance__Group__6__Impl rule__NewInstance__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__NewInstance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__7();

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
    // $ANTLR end "rule__NewInstance__Group__6"


    // $ANTLR start "rule__NewInstance__Group__6__Impl"
    // InternalDataflowDSL.g:1754:1: rule__NewInstance__Group__6__Impl : ( ( rule__NewInstance__Group_6__0 )? ) ;
    public final void rule__NewInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1758:1: ( ( ( rule__NewInstance__Group_6__0 )? ) )
            // InternalDataflowDSL.g:1759:1: ( ( rule__NewInstance__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:1759:1: ( ( rule__NewInstance__Group_6__0 )? )
            // InternalDataflowDSL.g:1760:2: ( rule__NewInstance__Group_6__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_6()); 
            // InternalDataflowDSL.g:1761:2: ( rule__NewInstance__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataflowDSL.g:1761:3: rule__NewInstance__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewInstanceAccess().getGroup_6()); 

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
    // $ANTLR end "rule__NewInstance__Group__6__Impl"


    // $ANTLR start "rule__NewInstance__Group__7"
    // InternalDataflowDSL.g:1769:1: rule__NewInstance__Group__7 : rule__NewInstance__Group__7__Impl ;
    public final void rule__NewInstance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1773:1: ( rule__NewInstance__Group__7__Impl )
            // InternalDataflowDSL.g:1774:2: rule__NewInstance__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__7__Impl();

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
    // $ANTLR end "rule__NewInstance__Group__7"


    // $ANTLR start "rule__NewInstance__Group__7__Impl"
    // InternalDataflowDSL.g:1780:1: rule__NewInstance__Group__7__Impl : ( '}' ) ;
    public final void rule__NewInstance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1784:1: ( ( '}' ) )
            // InternalDataflowDSL.g:1785:1: ( '}' )
            {
            // InternalDataflowDSL.g:1785:1: ( '}' )
            // InternalDataflowDSL.g:1786:2: '}'
            {
             before(grammarAccess.getNewInstanceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__NewInstance__Group__7__Impl"


    // $ANTLR start "rule__NewInstance__Group_3__0"
    // InternalDataflowDSL.g:1796:1: rule__NewInstance__Group_3__0 : rule__NewInstance__Group_3__0__Impl rule__NewInstance__Group_3__1 ;
    public final void rule__NewInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1800:1: ( rule__NewInstance__Group_3__0__Impl rule__NewInstance__Group_3__1 )
            // InternalDataflowDSL.g:1801:2: rule__NewInstance__Group_3__0__Impl rule__NewInstance__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3__1();

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
    // $ANTLR end "rule__NewInstance__Group_3__0"


    // $ANTLR start "rule__NewInstance__Group_3__0__Impl"
    // InternalDataflowDSL.g:1808:1: rule__NewInstance__Group_3__0__Impl : ( 'field' ) ;
    public final void rule__NewInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1812:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:1813:1: ( 'field' )
            {
            // InternalDataflowDSL.g:1813:1: ( 'field' )
            // InternalDataflowDSL.g:1814:2: 'field'
            {
             before(grammarAccess.getNewInstanceAccess().getFieldKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__NewInstance__Group_3__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_3__1"
    // InternalDataflowDSL.g:1823:1: rule__NewInstance__Group_3__1 : rule__NewInstance__Group_3__1__Impl ;
    public final void rule__NewInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1827:1: ( rule__NewInstance__Group_3__1__Impl )
            // InternalDataflowDSL.g:1828:2: rule__NewInstance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3__1__Impl();

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
    // $ANTLR end "rule__NewInstance__Group_3__1"


    // $ANTLR start "rule__NewInstance__Group_3__1__Impl"
    // InternalDataflowDSL.g:1834:1: rule__NewInstance__Group_3__1__Impl : ( ( rule__NewInstance__FieldAssignment_3_1 ) ) ;
    public final void rule__NewInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1838:1: ( ( ( rule__NewInstance__FieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:1839:1: ( ( rule__NewInstance__FieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:1839:1: ( ( rule__NewInstance__FieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:1840:2: ( rule__NewInstance__FieldAssignment_3_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:1841:2: ( rule__NewInstance__FieldAssignment_3_1 )
            // InternalDataflowDSL.g:1841:3: rule__NewInstance__FieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__FieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__NewInstance__Group_3__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_4__0"
    // InternalDataflowDSL.g:1850:1: rule__NewInstance__Group_4__0 : rule__NewInstance__Group_4__0__Impl rule__NewInstance__Group_4__1 ;
    public final void rule__NewInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1854:1: ( rule__NewInstance__Group_4__0__Impl rule__NewInstance__Group_4__1 )
            // InternalDataflowDSL.g:1855:2: rule__NewInstance__Group_4__0__Impl rule__NewInstance__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__NewInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_4__1();

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
    // $ANTLR end "rule__NewInstance__Group_4__0"


    // $ANTLR start "rule__NewInstance__Group_4__0__Impl"
    // InternalDataflowDSL.g:1862:1: rule__NewInstance__Group_4__0__Impl : ( 'nsURI' ) ;
    public final void rule__NewInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1866:1: ( ( 'nsURI' ) )
            // InternalDataflowDSL.g:1867:1: ( 'nsURI' )
            {
            // InternalDataflowDSL.g:1867:1: ( 'nsURI' )
            // InternalDataflowDSL.g:1868:2: 'nsURI'
            {
             before(grammarAccess.getNewInstanceAccess().getNsURIKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getNsURIKeyword_4_0()); 

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
    // $ANTLR end "rule__NewInstance__Group_4__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_4__1"
    // InternalDataflowDSL.g:1877:1: rule__NewInstance__Group_4__1 : rule__NewInstance__Group_4__1__Impl ;
    public final void rule__NewInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1881:1: ( rule__NewInstance__Group_4__1__Impl )
            // InternalDataflowDSL.g:1882:2: rule__NewInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_4__1__Impl();

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
    // $ANTLR end "rule__NewInstance__Group_4__1"


    // $ANTLR start "rule__NewInstance__Group_4__1__Impl"
    // InternalDataflowDSL.g:1888:1: rule__NewInstance__Group_4__1__Impl : ( ( rule__NewInstance__NsURIAssignment_4_1 ) ) ;
    public final void rule__NewInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1892:1: ( ( ( rule__NewInstance__NsURIAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:1893:1: ( ( rule__NewInstance__NsURIAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:1893:1: ( ( rule__NewInstance__NsURIAssignment_4_1 ) )
            // InternalDataflowDSL.g:1894:2: ( rule__NewInstance__NsURIAssignment_4_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getNsURIAssignment_4_1()); 
            // InternalDataflowDSL.g:1895:2: ( rule__NewInstance__NsURIAssignment_4_1 )
            // InternalDataflowDSL.g:1895:3: rule__NewInstance__NsURIAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__NsURIAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getNsURIAssignment_4_1()); 

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
    // $ANTLR end "rule__NewInstance__Group_4__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_5__0"
    // InternalDataflowDSL.g:1904:1: rule__NewInstance__Group_5__0 : rule__NewInstance__Group_5__0__Impl rule__NewInstance__Group_5__1 ;
    public final void rule__NewInstance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1908:1: ( rule__NewInstance__Group_5__0__Impl rule__NewInstance__Group_5__1 )
            // InternalDataflowDSL.g:1909:2: rule__NewInstance__Group_5__0__Impl rule__NewInstance__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5__1();

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
    // $ANTLR end "rule__NewInstance__Group_5__0"


    // $ANTLR start "rule__NewInstance__Group_5__0__Impl"
    // InternalDataflowDSL.g:1916:1: rule__NewInstance__Group_5__0__Impl : ( 'typeName' ) ;
    public final void rule__NewInstance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1920:1: ( ( 'typeName' ) )
            // InternalDataflowDSL.g:1921:1: ( 'typeName' )
            {
            // InternalDataflowDSL.g:1921:1: ( 'typeName' )
            // InternalDataflowDSL.g:1922:2: 'typeName'
            {
             before(grammarAccess.getNewInstanceAccess().getTypeNameKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTypeNameKeyword_5_0()); 

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
    // $ANTLR end "rule__NewInstance__Group_5__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_5__1"
    // InternalDataflowDSL.g:1931:1: rule__NewInstance__Group_5__1 : rule__NewInstance__Group_5__1__Impl ;
    public final void rule__NewInstance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1935:1: ( rule__NewInstance__Group_5__1__Impl )
            // InternalDataflowDSL.g:1936:2: rule__NewInstance__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5__1__Impl();

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
    // $ANTLR end "rule__NewInstance__Group_5__1"


    // $ANTLR start "rule__NewInstance__Group_5__1__Impl"
    // InternalDataflowDSL.g:1942:1: rule__NewInstance__Group_5__1__Impl : ( ( rule__NewInstance__TypeNameAssignment_5_1 ) ) ;
    public final void rule__NewInstance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1946:1: ( ( ( rule__NewInstance__TypeNameAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:1947:1: ( ( rule__NewInstance__TypeNameAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:1947:1: ( ( rule__NewInstance__TypeNameAssignment_5_1 ) )
            // InternalDataflowDSL.g:1948:2: ( rule__NewInstance__TypeNameAssignment_5_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getTypeNameAssignment_5_1()); 
            // InternalDataflowDSL.g:1949:2: ( rule__NewInstance__TypeNameAssignment_5_1 )
            // InternalDataflowDSL.g:1949:3: rule__NewInstance__TypeNameAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__TypeNameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getTypeNameAssignment_5_1()); 

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
    // $ANTLR end "rule__NewInstance__Group_5__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_6__0"
    // InternalDataflowDSL.g:1958:1: rule__NewInstance__Group_6__0 : rule__NewInstance__Group_6__0__Impl rule__NewInstance__Group_6__1 ;
    public final void rule__NewInstance__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1962:1: ( rule__NewInstance__Group_6__0__Impl rule__NewInstance__Group_6__1 )
            // InternalDataflowDSL.g:1963:2: rule__NewInstance__Group_6__0__Impl rule__NewInstance__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_6__1();

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
    // $ANTLR end "rule__NewInstance__Group_6__0"


    // $ANTLR start "rule__NewInstance__Group_6__0__Impl"
    // InternalDataflowDSL.g:1970:1: rule__NewInstance__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__NewInstance__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1974:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:1975:1: ( 'target' )
            {
            // InternalDataflowDSL.g:1975:1: ( 'target' )
            // InternalDataflowDSL.g:1976:2: 'target'
            {
             before(grammarAccess.getNewInstanceAccess().getTargetKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTargetKeyword_6_0()); 

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
    // $ANTLR end "rule__NewInstance__Group_6__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_6__1"
    // InternalDataflowDSL.g:1985:1: rule__NewInstance__Group_6__1 : rule__NewInstance__Group_6__1__Impl ;
    public final void rule__NewInstance__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1989:1: ( rule__NewInstance__Group_6__1__Impl )
            // InternalDataflowDSL.g:1990:2: rule__NewInstance__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_6__1__Impl();

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
    // $ANTLR end "rule__NewInstance__Group_6__1"


    // $ANTLR start "rule__NewInstance__Group_6__1__Impl"
    // InternalDataflowDSL.g:1996:1: rule__NewInstance__Group_6__1__Impl : ( ( rule__NewInstance__TargetAssignment_6_1 ) ) ;
    public final void rule__NewInstance__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2000:1: ( ( ( rule__NewInstance__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:2001:1: ( ( rule__NewInstance__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:2001:1: ( ( rule__NewInstance__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:2002:2: ( rule__NewInstance__TargetAssignment_6_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:2003:2: ( rule__NewInstance__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:2003:3: rule__NewInstance__TargetAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__TargetAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getTargetAssignment_6_1()); 

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
    // $ANTLR end "rule__NewInstance__Group_6__1__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalDataflowDSL.g:2012:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2016:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalDataflowDSL.g:2017:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

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
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalDataflowDSL.g:2024:1: rule__Filter__Group__0__Impl : ( 'Filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2028:1: ( ( 'Filter' ) )
            // InternalDataflowDSL.g:2029:1: ( 'Filter' )
            {
            // InternalDataflowDSL.g:2029:1: ( 'Filter' )
            // InternalDataflowDSL.g:2030:2: 'Filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterKeyword_0()); 

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
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalDataflowDSL.g:2039:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2043:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalDataflowDSL.g:2044:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Filter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__2();

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
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalDataflowDSL.g:2051:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__NameAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2055:1: ( ( ( rule__Filter__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2056:1: ( ( rule__Filter__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2056:1: ( ( rule__Filter__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2057:2: ( rule__Filter__NameAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2058:2: ( rule__Filter__NameAssignment_1 )
            // InternalDataflowDSL.g:2058:3: rule__Filter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // InternalDataflowDSL.g:2066:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl rule__Filter__Group__3 ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2070:1: ( rule__Filter__Group__2__Impl rule__Filter__Group__3 )
            // InternalDataflowDSL.g:2071:2: rule__Filter__Group__2__Impl rule__Filter__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Filter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__3();

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
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // InternalDataflowDSL.g:2078:1: rule__Filter__Group__2__Impl : ( '{' ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2082:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2083:1: ( '{' )
            {
            // InternalDataflowDSL.g:2083:1: ( '{' )
            // InternalDataflowDSL.g:2084:2: '{'
            {
             before(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__Filter__Group__3"
    // InternalDataflowDSL.g:2093:1: rule__Filter__Group__3 : rule__Filter__Group__3__Impl rule__Filter__Group__4 ;
    public final void rule__Filter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2097:1: ( rule__Filter__Group__3__Impl rule__Filter__Group__4 )
            // InternalDataflowDSL.g:2098:2: rule__Filter__Group__3__Impl rule__Filter__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Filter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__4();

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
    // $ANTLR end "rule__Filter__Group__3"


    // $ANTLR start "rule__Filter__Group__3__Impl"
    // InternalDataflowDSL.g:2105:1: rule__Filter__Group__3__Impl : ( ( rule__Filter__Group_3__0 )? ) ;
    public final void rule__Filter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2109:1: ( ( ( rule__Filter__Group_3__0 )? ) )
            // InternalDataflowDSL.g:2110:1: ( ( rule__Filter__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:2110:1: ( ( rule__Filter__Group_3__0 )? )
            // InternalDataflowDSL.g:2111:2: ( rule__Filter__Group_3__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_3()); 
            // InternalDataflowDSL.g:2112:2: ( rule__Filter__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataflowDSL.g:2112:3: rule__Filter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Filter__Group__3__Impl"


    // $ANTLR start "rule__Filter__Group__4"
    // InternalDataflowDSL.g:2120:1: rule__Filter__Group__4 : rule__Filter__Group__4__Impl rule__Filter__Group__5 ;
    public final void rule__Filter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2124:1: ( rule__Filter__Group__4__Impl rule__Filter__Group__5 )
            // InternalDataflowDSL.g:2125:2: rule__Filter__Group__4__Impl rule__Filter__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Filter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__5();

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
    // $ANTLR end "rule__Filter__Group__4"


    // $ANTLR start "rule__Filter__Group__4__Impl"
    // InternalDataflowDSL.g:2132:1: rule__Filter__Group__4__Impl : ( ( rule__Filter__Group_4__0 )? ) ;
    public final void rule__Filter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2136:1: ( ( ( rule__Filter__Group_4__0 )? ) )
            // InternalDataflowDSL.g:2137:1: ( ( rule__Filter__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:2137:1: ( ( rule__Filter__Group_4__0 )? )
            // InternalDataflowDSL.g:2138:2: ( rule__Filter__Group_4__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_4()); 
            // InternalDataflowDSL.g:2139:2: ( rule__Filter__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDataflowDSL.g:2139:3: rule__Filter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Filter__Group__4__Impl"


    // $ANTLR start "rule__Filter__Group__5"
    // InternalDataflowDSL.g:2147:1: rule__Filter__Group__5 : rule__Filter__Group__5__Impl rule__Filter__Group__6 ;
    public final void rule__Filter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2151:1: ( rule__Filter__Group__5__Impl rule__Filter__Group__6 )
            // InternalDataflowDSL.g:2152:2: rule__Filter__Group__5__Impl rule__Filter__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Filter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__6();

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
    // $ANTLR end "rule__Filter__Group__5"


    // $ANTLR start "rule__Filter__Group__5__Impl"
    // InternalDataflowDSL.g:2159:1: rule__Filter__Group__5__Impl : ( ( rule__Filter__Group_5__0 )? ) ;
    public final void rule__Filter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2163:1: ( ( ( rule__Filter__Group_5__0 )? ) )
            // InternalDataflowDSL.g:2164:1: ( ( rule__Filter__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:2164:1: ( ( rule__Filter__Group_5__0 )? )
            // InternalDataflowDSL.g:2165:2: ( rule__Filter__Group_5__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_5()); 
            // InternalDataflowDSL.g:2166:2: ( rule__Filter__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataflowDSL.g:2166:3: rule__Filter__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Filter__Group__5__Impl"


    // $ANTLR start "rule__Filter__Group__6"
    // InternalDataflowDSL.g:2174:1: rule__Filter__Group__6 : rule__Filter__Group__6__Impl ;
    public final void rule__Filter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2178:1: ( rule__Filter__Group__6__Impl )
            // InternalDataflowDSL.g:2179:2: rule__Filter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__6__Impl();

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
    // $ANTLR end "rule__Filter__Group__6"


    // $ANTLR start "rule__Filter__Group__6__Impl"
    // InternalDataflowDSL.g:2185:1: rule__Filter__Group__6__Impl : ( '}' ) ;
    public final void rule__Filter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2189:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2190:1: ( '}' )
            {
            // InternalDataflowDSL.g:2190:1: ( '}' )
            // InternalDataflowDSL.g:2191:2: '}'
            {
             before(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Filter__Group__6__Impl"


    // $ANTLR start "rule__Filter__Group_3__0"
    // InternalDataflowDSL.g:2201:1: rule__Filter__Group_3__0 : rule__Filter__Group_3__0__Impl rule__Filter__Group_3__1 ;
    public final void rule__Filter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2205:1: ( rule__Filter__Group_3__0__Impl rule__Filter__Group_3__1 )
            // InternalDataflowDSL.g:2206:2: rule__Filter__Group_3__0__Impl rule__Filter__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Filter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_3__1();

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
    // $ANTLR end "rule__Filter__Group_3__0"


    // $ANTLR start "rule__Filter__Group_3__0__Impl"
    // InternalDataflowDSL.g:2213:1: rule__Filter__Group_3__0__Impl : ( 'filterByField' ) ;
    public final void rule__Filter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2217:1: ( ( 'filterByField' ) )
            // InternalDataflowDSL.g:2218:1: ( 'filterByField' )
            {
            // InternalDataflowDSL.g:2218:1: ( 'filterByField' )
            // InternalDataflowDSL.g:2219:2: 'filterByField'
            {
             before(grammarAccess.getFilterAccess().getFilterByFieldKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterByFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__Filter__Group_3__0__Impl"


    // $ANTLR start "rule__Filter__Group_3__1"
    // InternalDataflowDSL.g:2228:1: rule__Filter__Group_3__1 : rule__Filter__Group_3__1__Impl ;
    public final void rule__Filter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2232:1: ( rule__Filter__Group_3__1__Impl )
            // InternalDataflowDSL.g:2233:2: rule__Filter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_3__1__Impl();

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
    // $ANTLR end "rule__Filter__Group_3__1"


    // $ANTLR start "rule__Filter__Group_3__1__Impl"
    // InternalDataflowDSL.g:2239:1: rule__Filter__Group_3__1__Impl : ( ( rule__Filter__FilterByFieldAssignment_3_1 ) ) ;
    public final void rule__Filter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2243:1: ( ( ( rule__Filter__FilterByFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:2244:1: ( ( rule__Filter__FilterByFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:2244:1: ( ( rule__Filter__FilterByFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:2245:2: ( rule__Filter__FilterByFieldAssignment_3_1 )
            {
             before(grammarAccess.getFilterAccess().getFilterByFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:2246:2: ( rule__Filter__FilterByFieldAssignment_3_1 )
            // InternalDataflowDSL.g:2246:3: rule__Filter__FilterByFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__FilterByFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getFilterByFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__Filter__Group_3__1__Impl"


    // $ANTLR start "rule__Filter__Group_4__0"
    // InternalDataflowDSL.g:2255:1: rule__Filter__Group_4__0 : rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1 ;
    public final void rule__Filter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2259:1: ( rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1 )
            // InternalDataflowDSL.g:2260:2: rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Filter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_4__1();

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
    // $ANTLR end "rule__Filter__Group_4__0"


    // $ANTLR start "rule__Filter__Group_4__0__Impl"
    // InternalDataflowDSL.g:2267:1: rule__Filter__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Filter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2271:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2272:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2272:1: ( 'target' )
            // InternalDataflowDSL.g:2273:2: 'target'
            {
             before(grammarAccess.getFilterAccess().getTargetKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getTargetKeyword_4_0()); 

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
    // $ANTLR end "rule__Filter__Group_4__0__Impl"


    // $ANTLR start "rule__Filter__Group_4__1"
    // InternalDataflowDSL.g:2282:1: rule__Filter__Group_4__1 : rule__Filter__Group_4__1__Impl ;
    public final void rule__Filter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2286:1: ( rule__Filter__Group_4__1__Impl )
            // InternalDataflowDSL.g:2287:2: rule__Filter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_4__1__Impl();

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
    // $ANTLR end "rule__Filter__Group_4__1"


    // $ANTLR start "rule__Filter__Group_4__1__Impl"
    // InternalDataflowDSL.g:2293:1: rule__Filter__Group_4__1__Impl : ( ( rule__Filter__TargetAssignment_4_1 ) ) ;
    public final void rule__Filter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2297:1: ( ( ( rule__Filter__TargetAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:2298:1: ( ( rule__Filter__TargetAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:2298:1: ( ( rule__Filter__TargetAssignment_4_1 ) )
            // InternalDataflowDSL.g:2299:2: ( rule__Filter__TargetAssignment_4_1 )
            {
             before(grammarAccess.getFilterAccess().getTargetAssignment_4_1()); 
            // InternalDataflowDSL.g:2300:2: ( rule__Filter__TargetAssignment_4_1 )
            // InternalDataflowDSL.g:2300:3: rule__Filter__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getTargetAssignment_4_1()); 

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
    // $ANTLR end "rule__Filter__Group_4__1__Impl"


    // $ANTLR start "rule__Filter__Group_5__0"
    // InternalDataflowDSL.g:2309:1: rule__Filter__Group_5__0 : rule__Filter__Group_5__0__Impl rule__Filter__Group_5__1 ;
    public final void rule__Filter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2313:1: ( rule__Filter__Group_5__0__Impl rule__Filter__Group_5__1 )
            // InternalDataflowDSL.g:2314:2: rule__Filter__Group_5__0__Impl rule__Filter__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Filter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_5__1();

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
    // $ANTLR end "rule__Filter__Group_5__0"


    // $ANTLR start "rule__Filter__Group_5__0__Impl"
    // InternalDataflowDSL.g:2321:1: rule__Filter__Group_5__0__Impl : ( 'rejectTarget' ) ;
    public final void rule__Filter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2325:1: ( ( 'rejectTarget' ) )
            // InternalDataflowDSL.g:2326:1: ( 'rejectTarget' )
            {
            // InternalDataflowDSL.g:2326:1: ( 'rejectTarget' )
            // InternalDataflowDSL.g:2327:2: 'rejectTarget'
            {
             before(grammarAccess.getFilterAccess().getRejectTargetKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRejectTargetKeyword_5_0()); 

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
    // $ANTLR end "rule__Filter__Group_5__0__Impl"


    // $ANTLR start "rule__Filter__Group_5__1"
    // InternalDataflowDSL.g:2336:1: rule__Filter__Group_5__1 : rule__Filter__Group_5__1__Impl ;
    public final void rule__Filter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2340:1: ( rule__Filter__Group_5__1__Impl )
            // InternalDataflowDSL.g:2341:2: rule__Filter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_5__1__Impl();

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
    // $ANTLR end "rule__Filter__Group_5__1"


    // $ANTLR start "rule__Filter__Group_5__1__Impl"
    // InternalDataflowDSL.g:2347:1: rule__Filter__Group_5__1__Impl : ( ( rule__Filter__RejectTargetAssignment_5_1 ) ) ;
    public final void rule__Filter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2351:1: ( ( ( rule__Filter__RejectTargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:2352:1: ( ( rule__Filter__RejectTargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:2352:1: ( ( rule__Filter__RejectTargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:2353:2: ( rule__Filter__RejectTargetAssignment_5_1 )
            {
             before(grammarAccess.getFilterAccess().getRejectTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:2354:2: ( rule__Filter__RejectTargetAssignment_5_1 )
            // InternalDataflowDSL.g:2354:3: rule__Filter__RejectTargetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__RejectTargetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getRejectTargetAssignment_5_1()); 

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
    // $ANTLR end "rule__Filter__Group_5__1__Impl"


    // $ANTLR start "rule__Sort__Group__0"
    // InternalDataflowDSL.g:2363:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2367:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // InternalDataflowDSL.g:2368:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Sort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group__1();

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
    // $ANTLR end "rule__Sort__Group__0"


    // $ANTLR start "rule__Sort__Group__0__Impl"
    // InternalDataflowDSL.g:2375:1: rule__Sort__Group__0__Impl : ( 'Sort' ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2379:1: ( ( 'Sort' ) )
            // InternalDataflowDSL.g:2380:1: ( 'Sort' )
            {
            // InternalDataflowDSL.g:2380:1: ( 'Sort' )
            // InternalDataflowDSL.g:2381:2: 'Sort'
            {
             before(grammarAccess.getSortAccess().getSortKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getSortKeyword_0()); 

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
    // $ANTLR end "rule__Sort__Group__0__Impl"


    // $ANTLR start "rule__Sort__Group__1"
    // InternalDataflowDSL.g:2390:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl rule__Sort__Group__2 ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2394:1: ( rule__Sort__Group__1__Impl rule__Sort__Group__2 )
            // InternalDataflowDSL.g:2395:2: rule__Sort__Group__1__Impl rule__Sort__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Sort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group__2();

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
    // $ANTLR end "rule__Sort__Group__1"


    // $ANTLR start "rule__Sort__Group__1__Impl"
    // InternalDataflowDSL.g:2402:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2406:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2407:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2407:1: ( ( rule__Sort__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2408:2: ( rule__Sort__NameAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2409:2: ( rule__Sort__NameAssignment_1 )
            // InternalDataflowDSL.g:2409:3: rule__Sort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sort__Group__1__Impl"


    // $ANTLR start "rule__Sort__Group__2"
    // InternalDataflowDSL.g:2417:1: rule__Sort__Group__2 : rule__Sort__Group__2__Impl rule__Sort__Group__3 ;
    public final void rule__Sort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2421:1: ( rule__Sort__Group__2__Impl rule__Sort__Group__3 )
            // InternalDataflowDSL.g:2422:2: rule__Sort__Group__2__Impl rule__Sort__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Sort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group__3();

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
    // $ANTLR end "rule__Sort__Group__2"


    // $ANTLR start "rule__Sort__Group__2__Impl"
    // InternalDataflowDSL.g:2429:1: rule__Sort__Group__2__Impl : ( '{' ) ;
    public final void rule__Sort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2433:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2434:1: ( '{' )
            {
            // InternalDataflowDSL.g:2434:1: ( '{' )
            // InternalDataflowDSL.g:2435:2: '{'
            {
             before(grammarAccess.getSortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Sort__Group__2__Impl"


    // $ANTLR start "rule__Sort__Group__3"
    // InternalDataflowDSL.g:2444:1: rule__Sort__Group__3 : rule__Sort__Group__3__Impl rule__Sort__Group__4 ;
    public final void rule__Sort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2448:1: ( rule__Sort__Group__3__Impl rule__Sort__Group__4 )
            // InternalDataflowDSL.g:2449:2: rule__Sort__Group__3__Impl rule__Sort__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Sort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group__4();

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
    // $ANTLR end "rule__Sort__Group__3"


    // $ANTLR start "rule__Sort__Group__3__Impl"
    // InternalDataflowDSL.g:2456:1: rule__Sort__Group__3__Impl : ( ( rule__Sort__Group_3__0 )? ) ;
    public final void rule__Sort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2460:1: ( ( ( rule__Sort__Group_3__0 )? ) )
            // InternalDataflowDSL.g:2461:1: ( ( rule__Sort__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:2461:1: ( ( rule__Sort__Group_3__0 )? )
            // InternalDataflowDSL.g:2462:2: ( rule__Sort__Group_3__0 )?
            {
             before(grammarAccess.getSortAccess().getGroup_3()); 
            // InternalDataflowDSL.g:2463:2: ( rule__Sort__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataflowDSL.g:2463:3: rule__Sort__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sort__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSortAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Sort__Group__3__Impl"


    // $ANTLR start "rule__Sort__Group__4"
    // InternalDataflowDSL.g:2471:1: rule__Sort__Group__4 : rule__Sort__Group__4__Impl rule__Sort__Group__5 ;
    public final void rule__Sort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2475:1: ( rule__Sort__Group__4__Impl rule__Sort__Group__5 )
            // InternalDataflowDSL.g:2476:2: rule__Sort__Group__4__Impl rule__Sort__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Sort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group__5();

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
    // $ANTLR end "rule__Sort__Group__4"


    // $ANTLR start "rule__Sort__Group__4__Impl"
    // InternalDataflowDSL.g:2483:1: rule__Sort__Group__4__Impl : ( ( rule__Sort__Group_4__0 )? ) ;
    public final void rule__Sort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2487:1: ( ( ( rule__Sort__Group_4__0 )? ) )
            // InternalDataflowDSL.g:2488:1: ( ( rule__Sort__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:2488:1: ( ( rule__Sort__Group_4__0 )? )
            // InternalDataflowDSL.g:2489:2: ( rule__Sort__Group_4__0 )?
            {
             before(grammarAccess.getSortAccess().getGroup_4()); 
            // InternalDataflowDSL.g:2490:2: ( rule__Sort__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataflowDSL.g:2490:3: rule__Sort__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sort__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSortAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Sort__Group__4__Impl"


    // $ANTLR start "rule__Sort__Group__5"
    // InternalDataflowDSL.g:2498:1: rule__Sort__Group__5 : rule__Sort__Group__5__Impl ;
    public final void rule__Sort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2502:1: ( rule__Sort__Group__5__Impl )
            // InternalDataflowDSL.g:2503:2: rule__Sort__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group__5__Impl();

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
    // $ANTLR end "rule__Sort__Group__5"


    // $ANTLR start "rule__Sort__Group__5__Impl"
    // InternalDataflowDSL.g:2509:1: rule__Sort__Group__5__Impl : ( '}' ) ;
    public final void rule__Sort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2513:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2514:1: ( '}' )
            {
            // InternalDataflowDSL.g:2514:1: ( '}' )
            // InternalDataflowDSL.g:2515:2: '}'
            {
             before(grammarAccess.getSortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Sort__Group__5__Impl"


    // $ANTLR start "rule__Sort__Group_3__0"
    // InternalDataflowDSL.g:2525:1: rule__Sort__Group_3__0 : rule__Sort__Group_3__0__Impl rule__Sort__Group_3__1 ;
    public final void rule__Sort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2529:1: ( rule__Sort__Group_3__0__Impl rule__Sort__Group_3__1 )
            // InternalDataflowDSL.g:2530:2: rule__Sort__Group_3__0__Impl rule__Sort__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Sort__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group_3__1();

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
    // $ANTLR end "rule__Sort__Group_3__0"


    // $ANTLR start "rule__Sort__Group_3__0__Impl"
    // InternalDataflowDSL.g:2537:1: rule__Sort__Group_3__0__Impl : ( 'sortByField' ) ;
    public final void rule__Sort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2541:1: ( ( 'sortByField' ) )
            // InternalDataflowDSL.g:2542:1: ( 'sortByField' )
            {
            // InternalDataflowDSL.g:2542:1: ( 'sortByField' )
            // InternalDataflowDSL.g:2543:2: 'sortByField'
            {
             before(grammarAccess.getSortAccess().getSortByFieldKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getSortByFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__Sort__Group_3__0__Impl"


    // $ANTLR start "rule__Sort__Group_3__1"
    // InternalDataflowDSL.g:2552:1: rule__Sort__Group_3__1 : rule__Sort__Group_3__1__Impl ;
    public final void rule__Sort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2556:1: ( rule__Sort__Group_3__1__Impl )
            // InternalDataflowDSL.g:2557:2: rule__Sort__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group_3__1__Impl();

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
    // $ANTLR end "rule__Sort__Group_3__1"


    // $ANTLR start "rule__Sort__Group_3__1__Impl"
    // InternalDataflowDSL.g:2563:1: rule__Sort__Group_3__1__Impl : ( ( rule__Sort__SortByFieldAssignment_3_1 ) ) ;
    public final void rule__Sort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2567:1: ( ( ( rule__Sort__SortByFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:2568:1: ( ( rule__Sort__SortByFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:2568:1: ( ( rule__Sort__SortByFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:2569:2: ( rule__Sort__SortByFieldAssignment_3_1 )
            {
             before(grammarAccess.getSortAccess().getSortByFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:2570:2: ( rule__Sort__SortByFieldAssignment_3_1 )
            // InternalDataflowDSL.g:2570:3: rule__Sort__SortByFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sort__SortByFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getSortByFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__Sort__Group_3__1__Impl"


    // $ANTLR start "rule__Sort__Group_4__0"
    // InternalDataflowDSL.g:2579:1: rule__Sort__Group_4__0 : rule__Sort__Group_4__0__Impl rule__Sort__Group_4__1 ;
    public final void rule__Sort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2583:1: ( rule__Sort__Group_4__0__Impl rule__Sort__Group_4__1 )
            // InternalDataflowDSL.g:2584:2: rule__Sort__Group_4__0__Impl rule__Sort__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Sort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group_4__1();

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
    // $ANTLR end "rule__Sort__Group_4__0"


    // $ANTLR start "rule__Sort__Group_4__0__Impl"
    // InternalDataflowDSL.g:2591:1: rule__Sort__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Sort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2595:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2596:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2596:1: ( 'target' )
            // InternalDataflowDSL.g:2597:2: 'target'
            {
             before(grammarAccess.getSortAccess().getTargetKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getTargetKeyword_4_0()); 

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
    // $ANTLR end "rule__Sort__Group_4__0__Impl"


    // $ANTLR start "rule__Sort__Group_4__1"
    // InternalDataflowDSL.g:2606:1: rule__Sort__Group_4__1 : rule__Sort__Group_4__1__Impl ;
    public final void rule__Sort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2610:1: ( rule__Sort__Group_4__1__Impl )
            // InternalDataflowDSL.g:2611:2: rule__Sort__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group_4__1__Impl();

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
    // $ANTLR end "rule__Sort__Group_4__1"


    // $ANTLR start "rule__Sort__Group_4__1__Impl"
    // InternalDataflowDSL.g:2617:1: rule__Sort__Group_4__1__Impl : ( ( rule__Sort__TargetAssignment_4_1 ) ) ;
    public final void rule__Sort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2621:1: ( ( ( rule__Sort__TargetAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:2622:1: ( ( rule__Sort__TargetAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:2622:1: ( ( rule__Sort__TargetAssignment_4_1 ) )
            // InternalDataflowDSL.g:2623:2: ( rule__Sort__TargetAssignment_4_1 )
            {
             before(grammarAccess.getSortAccess().getTargetAssignment_4_1()); 
            // InternalDataflowDSL.g:2624:2: ( rule__Sort__TargetAssignment_4_1 )
            // InternalDataflowDSL.g:2624:3: rule__Sort__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Sort__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getTargetAssignment_4_1()); 

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
    // $ANTLR end "rule__Sort__Group_4__1__Impl"


    // $ANTLR start "rule__Product__Group__0"
    // InternalDataflowDSL.g:2633:1: rule__Product__Group__0 : rule__Product__Group__0__Impl rule__Product__Group__1 ;
    public final void rule__Product__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2637:1: ( rule__Product__Group__0__Impl rule__Product__Group__1 )
            // InternalDataflowDSL.g:2638:2: rule__Product__Group__0__Impl rule__Product__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Product__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Product__Group__1();

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
    // $ANTLR end "rule__Product__Group__0"


    // $ANTLR start "rule__Product__Group__0__Impl"
    // InternalDataflowDSL.g:2645:1: rule__Product__Group__0__Impl : ( 'Product' ) ;
    public final void rule__Product__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2649:1: ( ( 'Product' ) )
            // InternalDataflowDSL.g:2650:1: ( 'Product' )
            {
            // InternalDataflowDSL.g:2650:1: ( 'Product' )
            // InternalDataflowDSL.g:2651:2: 'Product'
            {
             before(grammarAccess.getProductAccess().getProductKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getProductAccess().getProductKeyword_0()); 

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
    // $ANTLR end "rule__Product__Group__0__Impl"


    // $ANTLR start "rule__Product__Group__1"
    // InternalDataflowDSL.g:2660:1: rule__Product__Group__1 : rule__Product__Group__1__Impl rule__Product__Group__2 ;
    public final void rule__Product__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2664:1: ( rule__Product__Group__1__Impl rule__Product__Group__2 )
            // InternalDataflowDSL.g:2665:2: rule__Product__Group__1__Impl rule__Product__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Product__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Product__Group__2();

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
    // $ANTLR end "rule__Product__Group__1"


    // $ANTLR start "rule__Product__Group__1__Impl"
    // InternalDataflowDSL.g:2672:1: rule__Product__Group__1__Impl : ( ( rule__Product__NameAssignment_1 ) ) ;
    public final void rule__Product__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2676:1: ( ( ( rule__Product__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2677:1: ( ( rule__Product__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2677:1: ( ( rule__Product__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2678:2: ( rule__Product__NameAssignment_1 )
            {
             before(grammarAccess.getProductAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2679:2: ( rule__Product__NameAssignment_1 )
            // InternalDataflowDSL.g:2679:3: rule__Product__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Product__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Product__Group__1__Impl"


    // $ANTLR start "rule__Product__Group__2"
    // InternalDataflowDSL.g:2687:1: rule__Product__Group__2 : rule__Product__Group__2__Impl rule__Product__Group__3 ;
    public final void rule__Product__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2691:1: ( rule__Product__Group__2__Impl rule__Product__Group__3 )
            // InternalDataflowDSL.g:2692:2: rule__Product__Group__2__Impl rule__Product__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Product__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Product__Group__3();

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
    // $ANTLR end "rule__Product__Group__2"


    // $ANTLR start "rule__Product__Group__2__Impl"
    // InternalDataflowDSL.g:2699:1: rule__Product__Group__2__Impl : ( '{' ) ;
    public final void rule__Product__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2703:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2704:1: ( '{' )
            {
            // InternalDataflowDSL.g:2704:1: ( '{' )
            // InternalDataflowDSL.g:2705:2: '{'
            {
             before(grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Product__Group__2__Impl"


    // $ANTLR start "rule__Product__Group__3"
    // InternalDataflowDSL.g:2714:1: rule__Product__Group__3 : rule__Product__Group__3__Impl rule__Product__Group__4 ;
    public final void rule__Product__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2718:1: ( rule__Product__Group__3__Impl rule__Product__Group__4 )
            // InternalDataflowDSL.g:2719:2: rule__Product__Group__3__Impl rule__Product__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Product__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Product__Group__4();

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
    // $ANTLR end "rule__Product__Group__3"


    // $ANTLR start "rule__Product__Group__3__Impl"
    // InternalDataflowDSL.g:2726:1: rule__Product__Group__3__Impl : ( ( rule__Product__Group_3__0 )? ) ;
    public final void rule__Product__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2730:1: ( ( ( rule__Product__Group_3__0 )? ) )
            // InternalDataflowDSL.g:2731:1: ( ( rule__Product__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:2731:1: ( ( rule__Product__Group_3__0 )? )
            // InternalDataflowDSL.g:2732:2: ( rule__Product__Group_3__0 )?
            {
             before(grammarAccess.getProductAccess().getGroup_3()); 
            // InternalDataflowDSL.g:2733:2: ( rule__Product__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataflowDSL.g:2733:3: rule__Product__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Product__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Product__Group__3__Impl"


    // $ANTLR start "rule__Product__Group__4"
    // InternalDataflowDSL.g:2741:1: rule__Product__Group__4 : rule__Product__Group__4__Impl ;
    public final void rule__Product__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2745:1: ( rule__Product__Group__4__Impl )
            // InternalDataflowDSL.g:2746:2: rule__Product__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Product__Group__4__Impl();

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
    // $ANTLR end "rule__Product__Group__4"


    // $ANTLR start "rule__Product__Group__4__Impl"
    // InternalDataflowDSL.g:2752:1: rule__Product__Group__4__Impl : ( '}' ) ;
    public final void rule__Product__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2756:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2757:1: ( '}' )
            {
            // InternalDataflowDSL.g:2757:1: ( '}' )
            // InternalDataflowDSL.g:2758:2: '}'
            {
             before(grammarAccess.getProductAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProductAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Product__Group__4__Impl"


    // $ANTLR start "rule__Product__Group_3__0"
    // InternalDataflowDSL.g:2768:1: rule__Product__Group_3__0 : rule__Product__Group_3__0__Impl rule__Product__Group_3__1 ;
    public final void rule__Product__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2772:1: ( rule__Product__Group_3__0__Impl rule__Product__Group_3__1 )
            // InternalDataflowDSL.g:2773:2: rule__Product__Group_3__0__Impl rule__Product__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Product__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Product__Group_3__1();

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
    // $ANTLR end "rule__Product__Group_3__0"


    // $ANTLR start "rule__Product__Group_3__0__Impl"
    // InternalDataflowDSL.g:2780:1: rule__Product__Group_3__0__Impl : ( 'target' ) ;
    public final void rule__Product__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2784:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2785:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2785:1: ( 'target' )
            // InternalDataflowDSL.g:2786:2: 'target'
            {
             before(grammarAccess.getProductAccess().getTargetKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProductAccess().getTargetKeyword_3_0()); 

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
    // $ANTLR end "rule__Product__Group_3__0__Impl"


    // $ANTLR start "rule__Product__Group_3__1"
    // InternalDataflowDSL.g:2795:1: rule__Product__Group_3__1 : rule__Product__Group_3__1__Impl ;
    public final void rule__Product__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2799:1: ( rule__Product__Group_3__1__Impl )
            // InternalDataflowDSL.g:2800:2: rule__Product__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Product__Group_3__1__Impl();

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
    // $ANTLR end "rule__Product__Group_3__1"


    // $ANTLR start "rule__Product__Group_3__1__Impl"
    // InternalDataflowDSL.g:2806:1: rule__Product__Group_3__1__Impl : ( ( rule__Product__TargetAssignment_3_1 ) ) ;
    public final void rule__Product__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2810:1: ( ( ( rule__Product__TargetAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:2811:1: ( ( rule__Product__TargetAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:2811:1: ( ( rule__Product__TargetAssignment_3_1 ) )
            // InternalDataflowDSL.g:2812:2: ( rule__Product__TargetAssignment_3_1 )
            {
             before(grammarAccess.getProductAccess().getTargetAssignment_3_1()); 
            // InternalDataflowDSL.g:2813:2: ( rule__Product__TargetAssignment_3_1 )
            // InternalDataflowDSL.g:2813:3: rule__Product__TargetAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Product__TargetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getTargetAssignment_3_1()); 

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
    // $ANTLR end "rule__Product__Group_3__1__Impl"


    // $ANTLR start "rule__GetFeature__Group__0"
    // InternalDataflowDSL.g:2822:1: rule__GetFeature__Group__0 : rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1 ;
    public final void rule__GetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2826:1: ( rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1 )
            // InternalDataflowDSL.g:2827:2: rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__1();

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
    // $ANTLR end "rule__GetFeature__Group__0"


    // $ANTLR start "rule__GetFeature__Group__0__Impl"
    // InternalDataflowDSL.g:2834:1: rule__GetFeature__Group__0__Impl : ( 'GetFeature' ) ;
    public final void rule__GetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2838:1: ( ( 'GetFeature' ) )
            // InternalDataflowDSL.g:2839:1: ( 'GetFeature' )
            {
            // InternalDataflowDSL.g:2839:1: ( 'GetFeature' )
            // InternalDataflowDSL.g:2840:2: 'GetFeature'
            {
             before(grammarAccess.getGetFeatureAccess().getGetFeatureKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getGetFeatureKeyword_0()); 

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
    // $ANTLR end "rule__GetFeature__Group__0__Impl"


    // $ANTLR start "rule__GetFeature__Group__1"
    // InternalDataflowDSL.g:2849:1: rule__GetFeature__Group__1 : rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2 ;
    public final void rule__GetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2853:1: ( rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2 )
            // InternalDataflowDSL.g:2854:2: rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__GetFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__2();

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
    // $ANTLR end "rule__GetFeature__Group__1"


    // $ANTLR start "rule__GetFeature__Group__1__Impl"
    // InternalDataflowDSL.g:2861:1: rule__GetFeature__Group__1__Impl : ( ( rule__GetFeature__NameAssignment_1 ) ) ;
    public final void rule__GetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2865:1: ( ( ( rule__GetFeature__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2866:1: ( ( rule__GetFeature__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2866:1: ( ( rule__GetFeature__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2867:2: ( rule__GetFeature__NameAssignment_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2868:2: ( rule__GetFeature__NameAssignment_1 )
            // InternalDataflowDSL.g:2868:3: rule__GetFeature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__GetFeature__Group__1__Impl"


    // $ANTLR start "rule__GetFeature__Group__2"
    // InternalDataflowDSL.g:2876:1: rule__GetFeature__Group__2 : rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3 ;
    public final void rule__GetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2880:1: ( rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3 )
            // InternalDataflowDSL.g:2881:2: rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__GetFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__3();

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
    // $ANTLR end "rule__GetFeature__Group__2"


    // $ANTLR start "rule__GetFeature__Group__2__Impl"
    // InternalDataflowDSL.g:2888:1: rule__GetFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__GetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2892:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2893:1: ( '{' )
            {
            // InternalDataflowDSL.g:2893:1: ( '{' )
            // InternalDataflowDSL.g:2894:2: '{'
            {
             before(grammarAccess.getGetFeatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__GetFeature__Group__2__Impl"


    // $ANTLR start "rule__GetFeature__Group__3"
    // InternalDataflowDSL.g:2903:1: rule__GetFeature__Group__3 : rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4 ;
    public final void rule__GetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2907:1: ( rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4 )
            // InternalDataflowDSL.g:2908:2: rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__GetFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__4();

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
    // $ANTLR end "rule__GetFeature__Group__3"


    // $ANTLR start "rule__GetFeature__Group__3__Impl"
    // InternalDataflowDSL.g:2915:1: rule__GetFeature__Group__3__Impl : ( ( rule__GetFeature__Group_3__0 )? ) ;
    public final void rule__GetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2919:1: ( ( ( rule__GetFeature__Group_3__0 )? ) )
            // InternalDataflowDSL.g:2920:1: ( ( rule__GetFeature__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:2920:1: ( ( rule__GetFeature__Group_3__0 )? )
            // InternalDataflowDSL.g:2921:2: ( rule__GetFeature__Group_3__0 )?
            {
             before(grammarAccess.getGetFeatureAccess().getGroup_3()); 
            // InternalDataflowDSL.g:2922:2: ( rule__GetFeature__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataflowDSL.g:2922:3: rule__GetFeature__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetFeature__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetFeatureAccess().getGroup_3()); 

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
    // $ANTLR end "rule__GetFeature__Group__3__Impl"


    // $ANTLR start "rule__GetFeature__Group__4"
    // InternalDataflowDSL.g:2930:1: rule__GetFeature__Group__4 : rule__GetFeature__Group__4__Impl rule__GetFeature__Group__5 ;
    public final void rule__GetFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2934:1: ( rule__GetFeature__Group__4__Impl rule__GetFeature__Group__5 )
            // InternalDataflowDSL.g:2935:2: rule__GetFeature__Group__4__Impl rule__GetFeature__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__GetFeature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__5();

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
    // $ANTLR end "rule__GetFeature__Group__4"


    // $ANTLR start "rule__GetFeature__Group__4__Impl"
    // InternalDataflowDSL.g:2942:1: rule__GetFeature__Group__4__Impl : ( ( rule__GetFeature__Group_4__0 )? ) ;
    public final void rule__GetFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2946:1: ( ( ( rule__GetFeature__Group_4__0 )? ) )
            // InternalDataflowDSL.g:2947:1: ( ( rule__GetFeature__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:2947:1: ( ( rule__GetFeature__Group_4__0 )? )
            // InternalDataflowDSL.g:2948:2: ( rule__GetFeature__Group_4__0 )?
            {
             before(grammarAccess.getGetFeatureAccess().getGroup_4()); 
            // InternalDataflowDSL.g:2949:2: ( rule__GetFeature__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataflowDSL.g:2949:3: rule__GetFeature__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetFeature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetFeatureAccess().getGroup_4()); 

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
    // $ANTLR end "rule__GetFeature__Group__4__Impl"


    // $ANTLR start "rule__GetFeature__Group__5"
    // InternalDataflowDSL.g:2957:1: rule__GetFeature__Group__5 : rule__GetFeature__Group__5__Impl rule__GetFeature__Group__6 ;
    public final void rule__GetFeature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2961:1: ( rule__GetFeature__Group__5__Impl rule__GetFeature__Group__6 )
            // InternalDataflowDSL.g:2962:2: rule__GetFeature__Group__5__Impl rule__GetFeature__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__GetFeature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__6();

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
    // $ANTLR end "rule__GetFeature__Group__5"


    // $ANTLR start "rule__GetFeature__Group__5__Impl"
    // InternalDataflowDSL.g:2969:1: rule__GetFeature__Group__5__Impl : ( ( rule__GetFeature__Group_5__0 )? ) ;
    public final void rule__GetFeature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2973:1: ( ( ( rule__GetFeature__Group_5__0 )? ) )
            // InternalDataflowDSL.g:2974:1: ( ( rule__GetFeature__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:2974:1: ( ( rule__GetFeature__Group_5__0 )? )
            // InternalDataflowDSL.g:2975:2: ( rule__GetFeature__Group_5__0 )?
            {
             before(grammarAccess.getGetFeatureAccess().getGroup_5()); 
            // InternalDataflowDSL.g:2976:2: ( rule__GetFeature__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataflowDSL.g:2976:3: rule__GetFeature__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetFeature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetFeatureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__GetFeature__Group__5__Impl"


    // $ANTLR start "rule__GetFeature__Group__6"
    // InternalDataflowDSL.g:2984:1: rule__GetFeature__Group__6 : rule__GetFeature__Group__6__Impl rule__GetFeature__Group__7 ;
    public final void rule__GetFeature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2988:1: ( rule__GetFeature__Group__6__Impl rule__GetFeature__Group__7 )
            // InternalDataflowDSL.g:2989:2: rule__GetFeature__Group__6__Impl rule__GetFeature__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__GetFeature__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__7();

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
    // $ANTLR end "rule__GetFeature__Group__6"


    // $ANTLR start "rule__GetFeature__Group__6__Impl"
    // InternalDataflowDSL.g:2996:1: rule__GetFeature__Group__6__Impl : ( ( rule__GetFeature__Group_6__0 )? ) ;
    public final void rule__GetFeature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3000:1: ( ( ( rule__GetFeature__Group_6__0 )? ) )
            // InternalDataflowDSL.g:3001:1: ( ( rule__GetFeature__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:3001:1: ( ( rule__GetFeature__Group_6__0 )? )
            // InternalDataflowDSL.g:3002:2: ( rule__GetFeature__Group_6__0 )?
            {
             before(grammarAccess.getGetFeatureAccess().getGroup_6()); 
            // InternalDataflowDSL.g:3003:2: ( rule__GetFeature__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataflowDSL.g:3003:3: rule__GetFeature__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetFeature__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetFeatureAccess().getGroup_6()); 

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
    // $ANTLR end "rule__GetFeature__Group__6__Impl"


    // $ANTLR start "rule__GetFeature__Group__7"
    // InternalDataflowDSL.g:3011:1: rule__GetFeature__Group__7 : rule__GetFeature__Group__7__Impl ;
    public final void rule__GetFeature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3015:1: ( rule__GetFeature__Group__7__Impl )
            // InternalDataflowDSL.g:3016:2: rule__GetFeature__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__7__Impl();

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
    // $ANTLR end "rule__GetFeature__Group__7"


    // $ANTLR start "rule__GetFeature__Group__7__Impl"
    // InternalDataflowDSL.g:3022:1: rule__GetFeature__Group__7__Impl : ( '}' ) ;
    public final void rule__GetFeature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3026:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3027:1: ( '}' )
            {
            // InternalDataflowDSL.g:3027:1: ( '}' )
            // InternalDataflowDSL.g:3028:2: '}'
            {
             before(grammarAccess.getGetFeatureAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__GetFeature__Group__7__Impl"


    // $ANTLR start "rule__GetFeature__Group_3__0"
    // InternalDataflowDSL.g:3038:1: rule__GetFeature__Group_3__0 : rule__GetFeature__Group_3__0__Impl rule__GetFeature__Group_3__1 ;
    public final void rule__GetFeature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3042:1: ( rule__GetFeature__Group_3__0__Impl rule__GetFeature__Group_3__1 )
            // InternalDataflowDSL.g:3043:2: rule__GetFeature__Group_3__0__Impl rule__GetFeature__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3__1();

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
    // $ANTLR end "rule__GetFeature__Group_3__0"


    // $ANTLR start "rule__GetFeature__Group_3__0__Impl"
    // InternalDataflowDSL.g:3050:1: rule__GetFeature__Group_3__0__Impl : ( 'objectField' ) ;
    public final void rule__GetFeature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3054:1: ( ( 'objectField' ) )
            // InternalDataflowDSL.g:3055:1: ( 'objectField' )
            {
            // InternalDataflowDSL.g:3055:1: ( 'objectField' )
            // InternalDataflowDSL.g:3056:2: 'objectField'
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getObjectFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__GetFeature__Group_3__0__Impl"


    // $ANTLR start "rule__GetFeature__Group_3__1"
    // InternalDataflowDSL.g:3065:1: rule__GetFeature__Group_3__1 : rule__GetFeature__Group_3__1__Impl ;
    public final void rule__GetFeature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3069:1: ( rule__GetFeature__Group_3__1__Impl )
            // InternalDataflowDSL.g:3070:2: rule__GetFeature__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3__1__Impl();

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
    // $ANTLR end "rule__GetFeature__Group_3__1"


    // $ANTLR start "rule__GetFeature__Group_3__1__Impl"
    // InternalDataflowDSL.g:3076:1: rule__GetFeature__Group_3__1__Impl : ( ( rule__GetFeature__ObjectFieldAssignment_3_1 ) ) ;
    public final void rule__GetFeature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3080:1: ( ( ( rule__GetFeature__ObjectFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:3081:1: ( ( rule__GetFeature__ObjectFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:3081:1: ( ( rule__GetFeature__ObjectFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:3082:2: ( rule__GetFeature__ObjectFieldAssignment_3_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:3083:2: ( rule__GetFeature__ObjectFieldAssignment_3_1 )
            // InternalDataflowDSL.g:3083:3: rule__GetFeature__ObjectFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__ObjectFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getObjectFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__GetFeature__Group_3__1__Impl"


    // $ANTLR start "rule__GetFeature__Group_4__0"
    // InternalDataflowDSL.g:3092:1: rule__GetFeature__Group_4__0 : rule__GetFeature__Group_4__0__Impl rule__GetFeature__Group_4__1 ;
    public final void rule__GetFeature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3096:1: ( rule__GetFeature__Group_4__0__Impl rule__GetFeature__Group_4__1 )
            // InternalDataflowDSL.g:3097:2: rule__GetFeature__Group_4__0__Impl rule__GetFeature__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_4__1();

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
    // $ANTLR end "rule__GetFeature__Group_4__0"


    // $ANTLR start "rule__GetFeature__Group_4__0__Impl"
    // InternalDataflowDSL.g:3104:1: rule__GetFeature__Group_4__0__Impl : ( 'valueField' ) ;
    public final void rule__GetFeature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3108:1: ( ( 'valueField' ) )
            // InternalDataflowDSL.g:3109:1: ( 'valueField' )
            {
            // InternalDataflowDSL.g:3109:1: ( 'valueField' )
            // InternalDataflowDSL.g:3110:2: 'valueField'
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getValueFieldKeyword_4_0()); 

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
    // $ANTLR end "rule__GetFeature__Group_4__0__Impl"


    // $ANTLR start "rule__GetFeature__Group_4__1"
    // InternalDataflowDSL.g:3119:1: rule__GetFeature__Group_4__1 : rule__GetFeature__Group_4__1__Impl ;
    public final void rule__GetFeature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3123:1: ( rule__GetFeature__Group_4__1__Impl )
            // InternalDataflowDSL.g:3124:2: rule__GetFeature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_4__1__Impl();

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
    // $ANTLR end "rule__GetFeature__Group_4__1"


    // $ANTLR start "rule__GetFeature__Group_4__1__Impl"
    // InternalDataflowDSL.g:3130:1: rule__GetFeature__Group_4__1__Impl : ( ( rule__GetFeature__ValueFieldAssignment_4_1 ) ) ;
    public final void rule__GetFeature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3134:1: ( ( ( rule__GetFeature__ValueFieldAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:3135:1: ( ( rule__GetFeature__ValueFieldAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:3135:1: ( ( rule__GetFeature__ValueFieldAssignment_4_1 ) )
            // InternalDataflowDSL.g:3136:2: ( rule__GetFeature__ValueFieldAssignment_4_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldAssignment_4_1()); 
            // InternalDataflowDSL.g:3137:2: ( rule__GetFeature__ValueFieldAssignment_4_1 )
            // InternalDataflowDSL.g:3137:3: rule__GetFeature__ValueFieldAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__ValueFieldAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getValueFieldAssignment_4_1()); 

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
    // $ANTLR end "rule__GetFeature__Group_4__1__Impl"


    // $ANTLR start "rule__GetFeature__Group_5__0"
    // InternalDataflowDSL.g:3146:1: rule__GetFeature__Group_5__0 : rule__GetFeature__Group_5__0__Impl rule__GetFeature__Group_5__1 ;
    public final void rule__GetFeature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3150:1: ( rule__GetFeature__Group_5__0__Impl rule__GetFeature__Group_5__1 )
            // InternalDataflowDSL.g:3151:2: rule__GetFeature__Group_5__0__Impl rule__GetFeature__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_5__1();

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
    // $ANTLR end "rule__GetFeature__Group_5__0"


    // $ANTLR start "rule__GetFeature__Group_5__0__Impl"
    // InternalDataflowDSL.g:3158:1: rule__GetFeature__Group_5__0__Impl : ( 'feature' ) ;
    public final void rule__GetFeature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3162:1: ( ( 'feature' ) )
            // InternalDataflowDSL.g:3163:1: ( 'feature' )
            {
            // InternalDataflowDSL.g:3163:1: ( 'feature' )
            // InternalDataflowDSL.g:3164:2: 'feature'
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getFeatureKeyword_5_0()); 

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
    // $ANTLR end "rule__GetFeature__Group_5__0__Impl"


    // $ANTLR start "rule__GetFeature__Group_5__1"
    // InternalDataflowDSL.g:3173:1: rule__GetFeature__Group_5__1 : rule__GetFeature__Group_5__1__Impl ;
    public final void rule__GetFeature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3177:1: ( rule__GetFeature__Group_5__1__Impl )
            // InternalDataflowDSL.g:3178:2: rule__GetFeature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_5__1__Impl();

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
    // $ANTLR end "rule__GetFeature__Group_5__1"


    // $ANTLR start "rule__GetFeature__Group_5__1__Impl"
    // InternalDataflowDSL.g:3184:1: rule__GetFeature__Group_5__1__Impl : ( ( rule__GetFeature__FeatureAssignment_5_1 ) ) ;
    public final void rule__GetFeature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3188:1: ( ( ( rule__GetFeature__FeatureAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:3189:1: ( ( rule__GetFeature__FeatureAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:3189:1: ( ( rule__GetFeature__FeatureAssignment_5_1 ) )
            // InternalDataflowDSL.g:3190:2: ( rule__GetFeature__FeatureAssignment_5_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureAssignment_5_1()); 
            // InternalDataflowDSL.g:3191:2: ( rule__GetFeature__FeatureAssignment_5_1 )
            // InternalDataflowDSL.g:3191:3: rule__GetFeature__FeatureAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__FeatureAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getFeatureAssignment_5_1()); 

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
    // $ANTLR end "rule__GetFeature__Group_5__1__Impl"


    // $ANTLR start "rule__GetFeature__Group_6__0"
    // InternalDataflowDSL.g:3200:1: rule__GetFeature__Group_6__0 : rule__GetFeature__Group_6__0__Impl rule__GetFeature__Group_6__1 ;
    public final void rule__GetFeature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3204:1: ( rule__GetFeature__Group_6__0__Impl rule__GetFeature__Group_6__1 )
            // InternalDataflowDSL.g:3205:2: rule__GetFeature__Group_6__0__Impl rule__GetFeature__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_6__1();

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
    // $ANTLR end "rule__GetFeature__Group_6__0"


    // $ANTLR start "rule__GetFeature__Group_6__0__Impl"
    // InternalDataflowDSL.g:3212:1: rule__GetFeature__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__GetFeature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3216:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3217:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3217:1: ( 'target' )
            // InternalDataflowDSL.g:3218:2: 'target'
            {
             before(grammarAccess.getGetFeatureAccess().getTargetKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getTargetKeyword_6_0()); 

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
    // $ANTLR end "rule__GetFeature__Group_6__0__Impl"


    // $ANTLR start "rule__GetFeature__Group_6__1"
    // InternalDataflowDSL.g:3227:1: rule__GetFeature__Group_6__1 : rule__GetFeature__Group_6__1__Impl ;
    public final void rule__GetFeature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3231:1: ( rule__GetFeature__Group_6__1__Impl )
            // InternalDataflowDSL.g:3232:2: rule__GetFeature__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_6__1__Impl();

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
    // $ANTLR end "rule__GetFeature__Group_6__1"


    // $ANTLR start "rule__GetFeature__Group_6__1__Impl"
    // InternalDataflowDSL.g:3238:1: rule__GetFeature__Group_6__1__Impl : ( ( rule__GetFeature__TargetAssignment_6_1 ) ) ;
    public final void rule__GetFeature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3242:1: ( ( ( rule__GetFeature__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:3243:1: ( ( rule__GetFeature__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:3243:1: ( ( rule__GetFeature__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:3244:2: ( rule__GetFeature__TargetAssignment_6_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:3245:2: ( rule__GetFeature__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:3245:3: rule__GetFeature__TargetAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__TargetAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getTargetAssignment_6_1()); 

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
    // $ANTLR end "rule__GetFeature__Group_6__1__Impl"


    // $ANTLR start "rule__SetFeature__Group__0"
    // InternalDataflowDSL.g:3254:1: rule__SetFeature__Group__0 : rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 ;
    public final void rule__SetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3258:1: ( rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 )
            // InternalDataflowDSL.g:3259:2: rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SetFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__1();

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
    // $ANTLR end "rule__SetFeature__Group__0"


    // $ANTLR start "rule__SetFeature__Group__0__Impl"
    // InternalDataflowDSL.g:3266:1: rule__SetFeature__Group__0__Impl : ( 'SetFeature' ) ;
    public final void rule__SetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3270:1: ( ( 'SetFeature' ) )
            // InternalDataflowDSL.g:3271:1: ( 'SetFeature' )
            {
            // InternalDataflowDSL.g:3271:1: ( 'SetFeature' )
            // InternalDataflowDSL.g:3272:2: 'SetFeature'
            {
             before(grammarAccess.getSetFeatureAccess().getSetFeatureKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getSetFeatureKeyword_0()); 

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
    // $ANTLR end "rule__SetFeature__Group__0__Impl"


    // $ANTLR start "rule__SetFeature__Group__1"
    // InternalDataflowDSL.g:3281:1: rule__SetFeature__Group__1 : rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 ;
    public final void rule__SetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3285:1: ( rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 )
            // InternalDataflowDSL.g:3286:2: rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SetFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__2();

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
    // $ANTLR end "rule__SetFeature__Group__1"


    // $ANTLR start "rule__SetFeature__Group__1__Impl"
    // InternalDataflowDSL.g:3293:1: rule__SetFeature__Group__1__Impl : ( ( rule__SetFeature__NameAssignment_1 ) ) ;
    public final void rule__SetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3297:1: ( ( ( rule__SetFeature__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3298:1: ( ( rule__SetFeature__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3298:1: ( ( rule__SetFeature__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3299:2: ( rule__SetFeature__NameAssignment_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3300:2: ( rule__SetFeature__NameAssignment_1 )
            // InternalDataflowDSL.g:3300:3: rule__SetFeature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SetFeature__Group__1__Impl"


    // $ANTLR start "rule__SetFeature__Group__2"
    // InternalDataflowDSL.g:3308:1: rule__SetFeature__Group__2 : rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 ;
    public final void rule__SetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3312:1: ( rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 )
            // InternalDataflowDSL.g:3313:2: rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SetFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__3();

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
    // $ANTLR end "rule__SetFeature__Group__2"


    // $ANTLR start "rule__SetFeature__Group__2__Impl"
    // InternalDataflowDSL.g:3320:1: rule__SetFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__SetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3324:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3325:1: ( '{' )
            {
            // InternalDataflowDSL.g:3325:1: ( '{' )
            // InternalDataflowDSL.g:3326:2: '{'
            {
             before(grammarAccess.getSetFeatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SetFeature__Group__2__Impl"


    // $ANTLR start "rule__SetFeature__Group__3"
    // InternalDataflowDSL.g:3335:1: rule__SetFeature__Group__3 : rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4 ;
    public final void rule__SetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3339:1: ( rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4 )
            // InternalDataflowDSL.g:3340:2: rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SetFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__4();

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
    // $ANTLR end "rule__SetFeature__Group__3"


    // $ANTLR start "rule__SetFeature__Group__3__Impl"
    // InternalDataflowDSL.g:3347:1: rule__SetFeature__Group__3__Impl : ( ( rule__SetFeature__Group_3__0 )? ) ;
    public final void rule__SetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3351:1: ( ( ( rule__SetFeature__Group_3__0 )? ) )
            // InternalDataflowDSL.g:3352:1: ( ( rule__SetFeature__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:3352:1: ( ( rule__SetFeature__Group_3__0 )? )
            // InternalDataflowDSL.g:3353:2: ( rule__SetFeature__Group_3__0 )?
            {
             before(grammarAccess.getSetFeatureAccess().getGroup_3()); 
            // InternalDataflowDSL.g:3354:2: ( rule__SetFeature__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataflowDSL.g:3354:3: rule__SetFeature__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetFeature__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetFeatureAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SetFeature__Group__3__Impl"


    // $ANTLR start "rule__SetFeature__Group__4"
    // InternalDataflowDSL.g:3362:1: rule__SetFeature__Group__4 : rule__SetFeature__Group__4__Impl rule__SetFeature__Group__5 ;
    public final void rule__SetFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3366:1: ( rule__SetFeature__Group__4__Impl rule__SetFeature__Group__5 )
            // InternalDataflowDSL.g:3367:2: rule__SetFeature__Group__4__Impl rule__SetFeature__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__SetFeature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__5();

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
    // $ANTLR end "rule__SetFeature__Group__4"


    // $ANTLR start "rule__SetFeature__Group__4__Impl"
    // InternalDataflowDSL.g:3374:1: rule__SetFeature__Group__4__Impl : ( ( rule__SetFeature__Group_4__0 )? ) ;
    public final void rule__SetFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3378:1: ( ( ( rule__SetFeature__Group_4__0 )? ) )
            // InternalDataflowDSL.g:3379:1: ( ( rule__SetFeature__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:3379:1: ( ( rule__SetFeature__Group_4__0 )? )
            // InternalDataflowDSL.g:3380:2: ( rule__SetFeature__Group_4__0 )?
            {
             before(grammarAccess.getSetFeatureAccess().getGroup_4()); 
            // InternalDataflowDSL.g:3381:2: ( rule__SetFeature__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataflowDSL.g:3381:3: rule__SetFeature__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetFeature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetFeatureAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SetFeature__Group__4__Impl"


    // $ANTLR start "rule__SetFeature__Group__5"
    // InternalDataflowDSL.g:3389:1: rule__SetFeature__Group__5 : rule__SetFeature__Group__5__Impl rule__SetFeature__Group__6 ;
    public final void rule__SetFeature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3393:1: ( rule__SetFeature__Group__5__Impl rule__SetFeature__Group__6 )
            // InternalDataflowDSL.g:3394:2: rule__SetFeature__Group__5__Impl rule__SetFeature__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__SetFeature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__6();

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
    // $ANTLR end "rule__SetFeature__Group__5"


    // $ANTLR start "rule__SetFeature__Group__5__Impl"
    // InternalDataflowDSL.g:3401:1: rule__SetFeature__Group__5__Impl : ( ( rule__SetFeature__Group_5__0 )? ) ;
    public final void rule__SetFeature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3405:1: ( ( ( rule__SetFeature__Group_5__0 )? ) )
            // InternalDataflowDSL.g:3406:1: ( ( rule__SetFeature__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:3406:1: ( ( rule__SetFeature__Group_5__0 )? )
            // InternalDataflowDSL.g:3407:2: ( rule__SetFeature__Group_5__0 )?
            {
             before(grammarAccess.getSetFeatureAccess().getGroup_5()); 
            // InternalDataflowDSL.g:3408:2: ( rule__SetFeature__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataflowDSL.g:3408:3: rule__SetFeature__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetFeature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetFeatureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SetFeature__Group__5__Impl"


    // $ANTLR start "rule__SetFeature__Group__6"
    // InternalDataflowDSL.g:3416:1: rule__SetFeature__Group__6 : rule__SetFeature__Group__6__Impl rule__SetFeature__Group__7 ;
    public final void rule__SetFeature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3420:1: ( rule__SetFeature__Group__6__Impl rule__SetFeature__Group__7 )
            // InternalDataflowDSL.g:3421:2: rule__SetFeature__Group__6__Impl rule__SetFeature__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__SetFeature__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__7();

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
    // $ANTLR end "rule__SetFeature__Group__6"


    // $ANTLR start "rule__SetFeature__Group__6__Impl"
    // InternalDataflowDSL.g:3428:1: rule__SetFeature__Group__6__Impl : ( ( rule__SetFeature__Group_6__0 )? ) ;
    public final void rule__SetFeature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3432:1: ( ( ( rule__SetFeature__Group_6__0 )? ) )
            // InternalDataflowDSL.g:3433:1: ( ( rule__SetFeature__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:3433:1: ( ( rule__SetFeature__Group_6__0 )? )
            // InternalDataflowDSL.g:3434:2: ( rule__SetFeature__Group_6__0 )?
            {
             before(grammarAccess.getSetFeatureAccess().getGroup_6()); 
            // InternalDataflowDSL.g:3435:2: ( rule__SetFeature__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataflowDSL.g:3435:3: rule__SetFeature__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetFeature__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetFeatureAccess().getGroup_6()); 

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
    // $ANTLR end "rule__SetFeature__Group__6__Impl"


    // $ANTLR start "rule__SetFeature__Group__7"
    // InternalDataflowDSL.g:3443:1: rule__SetFeature__Group__7 : rule__SetFeature__Group__7__Impl ;
    public final void rule__SetFeature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3447:1: ( rule__SetFeature__Group__7__Impl )
            // InternalDataflowDSL.g:3448:2: rule__SetFeature__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__7__Impl();

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
    // $ANTLR end "rule__SetFeature__Group__7"


    // $ANTLR start "rule__SetFeature__Group__7__Impl"
    // InternalDataflowDSL.g:3454:1: rule__SetFeature__Group__7__Impl : ( '}' ) ;
    public final void rule__SetFeature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3458:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3459:1: ( '}' )
            {
            // InternalDataflowDSL.g:3459:1: ( '}' )
            // InternalDataflowDSL.g:3460:2: '}'
            {
             before(grammarAccess.getSetFeatureAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__SetFeature__Group__7__Impl"


    // $ANTLR start "rule__SetFeature__Group_3__0"
    // InternalDataflowDSL.g:3470:1: rule__SetFeature__Group_3__0 : rule__SetFeature__Group_3__0__Impl rule__SetFeature__Group_3__1 ;
    public final void rule__SetFeature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3474:1: ( rule__SetFeature__Group_3__0__Impl rule__SetFeature__Group_3__1 )
            // InternalDataflowDSL.g:3475:2: rule__SetFeature__Group_3__0__Impl rule__SetFeature__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__SetFeature__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3__1();

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
    // $ANTLR end "rule__SetFeature__Group_3__0"


    // $ANTLR start "rule__SetFeature__Group_3__0__Impl"
    // InternalDataflowDSL.g:3482:1: rule__SetFeature__Group_3__0__Impl : ( 'objectField' ) ;
    public final void rule__SetFeature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3486:1: ( ( 'objectField' ) )
            // InternalDataflowDSL.g:3487:1: ( 'objectField' )
            {
            // InternalDataflowDSL.g:3487:1: ( 'objectField' )
            // InternalDataflowDSL.g:3488:2: 'objectField'
            {
             before(grammarAccess.getSetFeatureAccess().getObjectFieldKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getObjectFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__SetFeature__Group_3__0__Impl"


    // $ANTLR start "rule__SetFeature__Group_3__1"
    // InternalDataflowDSL.g:3497:1: rule__SetFeature__Group_3__1 : rule__SetFeature__Group_3__1__Impl ;
    public final void rule__SetFeature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3501:1: ( rule__SetFeature__Group_3__1__Impl )
            // InternalDataflowDSL.g:3502:2: rule__SetFeature__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3__1__Impl();

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
    // $ANTLR end "rule__SetFeature__Group_3__1"


    // $ANTLR start "rule__SetFeature__Group_3__1__Impl"
    // InternalDataflowDSL.g:3508:1: rule__SetFeature__Group_3__1__Impl : ( ( rule__SetFeature__ObjectFieldAssignment_3_1 ) ) ;
    public final void rule__SetFeature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3512:1: ( ( ( rule__SetFeature__ObjectFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:3513:1: ( ( rule__SetFeature__ObjectFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:3513:1: ( ( rule__SetFeature__ObjectFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:3514:2: ( rule__SetFeature__ObjectFieldAssignment_3_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getObjectFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:3515:2: ( rule__SetFeature__ObjectFieldAssignment_3_1 )
            // InternalDataflowDSL.g:3515:3: rule__SetFeature__ObjectFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__ObjectFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getObjectFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__SetFeature__Group_3__1__Impl"


    // $ANTLR start "rule__SetFeature__Group_4__0"
    // InternalDataflowDSL.g:3524:1: rule__SetFeature__Group_4__0 : rule__SetFeature__Group_4__0__Impl rule__SetFeature__Group_4__1 ;
    public final void rule__SetFeature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3528:1: ( rule__SetFeature__Group_4__0__Impl rule__SetFeature__Group_4__1 )
            // InternalDataflowDSL.g:3529:2: rule__SetFeature__Group_4__0__Impl rule__SetFeature__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__SetFeature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_4__1();

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
    // $ANTLR end "rule__SetFeature__Group_4__0"


    // $ANTLR start "rule__SetFeature__Group_4__0__Impl"
    // InternalDataflowDSL.g:3536:1: rule__SetFeature__Group_4__0__Impl : ( 'valueField' ) ;
    public final void rule__SetFeature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3540:1: ( ( 'valueField' ) )
            // InternalDataflowDSL.g:3541:1: ( 'valueField' )
            {
            // InternalDataflowDSL.g:3541:1: ( 'valueField' )
            // InternalDataflowDSL.g:3542:2: 'valueField'
            {
             before(grammarAccess.getSetFeatureAccess().getValueFieldKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getValueFieldKeyword_4_0()); 

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
    // $ANTLR end "rule__SetFeature__Group_4__0__Impl"


    // $ANTLR start "rule__SetFeature__Group_4__1"
    // InternalDataflowDSL.g:3551:1: rule__SetFeature__Group_4__1 : rule__SetFeature__Group_4__1__Impl ;
    public final void rule__SetFeature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3555:1: ( rule__SetFeature__Group_4__1__Impl )
            // InternalDataflowDSL.g:3556:2: rule__SetFeature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_4__1__Impl();

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
    // $ANTLR end "rule__SetFeature__Group_4__1"


    // $ANTLR start "rule__SetFeature__Group_4__1__Impl"
    // InternalDataflowDSL.g:3562:1: rule__SetFeature__Group_4__1__Impl : ( ( rule__SetFeature__ValueFieldAssignment_4_1 ) ) ;
    public final void rule__SetFeature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3566:1: ( ( ( rule__SetFeature__ValueFieldAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:3567:1: ( ( rule__SetFeature__ValueFieldAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:3567:1: ( ( rule__SetFeature__ValueFieldAssignment_4_1 ) )
            // InternalDataflowDSL.g:3568:2: ( rule__SetFeature__ValueFieldAssignment_4_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getValueFieldAssignment_4_1()); 
            // InternalDataflowDSL.g:3569:2: ( rule__SetFeature__ValueFieldAssignment_4_1 )
            // InternalDataflowDSL.g:3569:3: rule__SetFeature__ValueFieldAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__ValueFieldAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getValueFieldAssignment_4_1()); 

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
    // $ANTLR end "rule__SetFeature__Group_4__1__Impl"


    // $ANTLR start "rule__SetFeature__Group_5__0"
    // InternalDataflowDSL.g:3578:1: rule__SetFeature__Group_5__0 : rule__SetFeature__Group_5__0__Impl rule__SetFeature__Group_5__1 ;
    public final void rule__SetFeature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3582:1: ( rule__SetFeature__Group_5__0__Impl rule__SetFeature__Group_5__1 )
            // InternalDataflowDSL.g:3583:2: rule__SetFeature__Group_5__0__Impl rule__SetFeature__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__SetFeature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_5__1();

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
    // $ANTLR end "rule__SetFeature__Group_5__0"


    // $ANTLR start "rule__SetFeature__Group_5__0__Impl"
    // InternalDataflowDSL.g:3590:1: rule__SetFeature__Group_5__0__Impl : ( 'feature' ) ;
    public final void rule__SetFeature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3594:1: ( ( 'feature' ) )
            // InternalDataflowDSL.g:3595:1: ( 'feature' )
            {
            // InternalDataflowDSL.g:3595:1: ( 'feature' )
            // InternalDataflowDSL.g:3596:2: 'feature'
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getFeatureKeyword_5_0()); 

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
    // $ANTLR end "rule__SetFeature__Group_5__0__Impl"


    // $ANTLR start "rule__SetFeature__Group_5__1"
    // InternalDataflowDSL.g:3605:1: rule__SetFeature__Group_5__1 : rule__SetFeature__Group_5__1__Impl ;
    public final void rule__SetFeature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3609:1: ( rule__SetFeature__Group_5__1__Impl )
            // InternalDataflowDSL.g:3610:2: rule__SetFeature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_5__1__Impl();

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
    // $ANTLR end "rule__SetFeature__Group_5__1"


    // $ANTLR start "rule__SetFeature__Group_5__1__Impl"
    // InternalDataflowDSL.g:3616:1: rule__SetFeature__Group_5__1__Impl : ( ( rule__SetFeature__FeatureAssignment_5_1 ) ) ;
    public final void rule__SetFeature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3620:1: ( ( ( rule__SetFeature__FeatureAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:3621:1: ( ( rule__SetFeature__FeatureAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:3621:1: ( ( rule__SetFeature__FeatureAssignment_5_1 ) )
            // InternalDataflowDSL.g:3622:2: ( rule__SetFeature__FeatureAssignment_5_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureAssignment_5_1()); 
            // InternalDataflowDSL.g:3623:2: ( rule__SetFeature__FeatureAssignment_5_1 )
            // InternalDataflowDSL.g:3623:3: rule__SetFeature__FeatureAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__FeatureAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getFeatureAssignment_5_1()); 

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
    // $ANTLR end "rule__SetFeature__Group_5__1__Impl"


    // $ANTLR start "rule__SetFeature__Group_6__0"
    // InternalDataflowDSL.g:3632:1: rule__SetFeature__Group_6__0 : rule__SetFeature__Group_6__0__Impl rule__SetFeature__Group_6__1 ;
    public final void rule__SetFeature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3636:1: ( rule__SetFeature__Group_6__0__Impl rule__SetFeature__Group_6__1 )
            // InternalDataflowDSL.g:3637:2: rule__SetFeature__Group_6__0__Impl rule__SetFeature__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__SetFeature__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_6__1();

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
    // $ANTLR end "rule__SetFeature__Group_6__0"


    // $ANTLR start "rule__SetFeature__Group_6__0__Impl"
    // InternalDataflowDSL.g:3644:1: rule__SetFeature__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__SetFeature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3648:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3649:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3649:1: ( 'target' )
            // InternalDataflowDSL.g:3650:2: 'target'
            {
             before(grammarAccess.getSetFeatureAccess().getTargetKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getTargetKeyword_6_0()); 

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
    // $ANTLR end "rule__SetFeature__Group_6__0__Impl"


    // $ANTLR start "rule__SetFeature__Group_6__1"
    // InternalDataflowDSL.g:3659:1: rule__SetFeature__Group_6__1 : rule__SetFeature__Group_6__1__Impl ;
    public final void rule__SetFeature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3663:1: ( rule__SetFeature__Group_6__1__Impl )
            // InternalDataflowDSL.g:3664:2: rule__SetFeature__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_6__1__Impl();

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
    // $ANTLR end "rule__SetFeature__Group_6__1"


    // $ANTLR start "rule__SetFeature__Group_6__1__Impl"
    // InternalDataflowDSL.g:3670:1: rule__SetFeature__Group_6__1__Impl : ( ( rule__SetFeature__TargetAssignment_6_1 ) ) ;
    public final void rule__SetFeature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3674:1: ( ( ( rule__SetFeature__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:3675:1: ( ( rule__SetFeature__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:3675:1: ( ( rule__SetFeature__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:3676:2: ( rule__SetFeature__TargetAssignment_6_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:3677:2: ( rule__SetFeature__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:3677:3: rule__SetFeature__TargetAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__TargetAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getTargetAssignment_6_1()); 

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
    // $ANTLR end "rule__SetFeature__Group_6__1__Impl"


    // $ANTLR start "rule__NewContainer__Group__0"
    // InternalDataflowDSL.g:3686:1: rule__NewContainer__Group__0 : rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1 ;
    public final void rule__NewContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3690:1: ( rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1 )
            // InternalDataflowDSL.g:3691:2: rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NewContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group__1();

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
    // $ANTLR end "rule__NewContainer__Group__0"


    // $ANTLR start "rule__NewContainer__Group__0__Impl"
    // InternalDataflowDSL.g:3698:1: rule__NewContainer__Group__0__Impl : ( 'NewContainer' ) ;
    public final void rule__NewContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3702:1: ( ( 'NewContainer' ) )
            // InternalDataflowDSL.g:3703:1: ( 'NewContainer' )
            {
            // InternalDataflowDSL.g:3703:1: ( 'NewContainer' )
            // InternalDataflowDSL.g:3704:2: 'NewContainer'
            {
             before(grammarAccess.getNewContainerAccess().getNewContainerKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getNewContainerKeyword_0()); 

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
    // $ANTLR end "rule__NewContainer__Group__0__Impl"


    // $ANTLR start "rule__NewContainer__Group__1"
    // InternalDataflowDSL.g:3713:1: rule__NewContainer__Group__1 : rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2 ;
    public final void rule__NewContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3717:1: ( rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2 )
            // InternalDataflowDSL.g:3718:2: rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__NewContainer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group__2();

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
    // $ANTLR end "rule__NewContainer__Group__1"


    // $ANTLR start "rule__NewContainer__Group__1__Impl"
    // InternalDataflowDSL.g:3725:1: rule__NewContainer__Group__1__Impl : ( ( rule__NewContainer__NameAssignment_1 ) ) ;
    public final void rule__NewContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3729:1: ( ( ( rule__NewContainer__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3730:1: ( ( rule__NewContainer__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3730:1: ( ( rule__NewContainer__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3731:2: ( rule__NewContainer__NameAssignment_1 )
            {
             before(grammarAccess.getNewContainerAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3732:2: ( rule__NewContainer__NameAssignment_1 )
            // InternalDataflowDSL.g:3732:3: rule__NewContainer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewContainerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NewContainer__Group__1__Impl"


    // $ANTLR start "rule__NewContainer__Group__2"
    // InternalDataflowDSL.g:3740:1: rule__NewContainer__Group__2 : rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3 ;
    public final void rule__NewContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3744:1: ( rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3 )
            // InternalDataflowDSL.g:3745:2: rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__NewContainer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group__3();

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
    // $ANTLR end "rule__NewContainer__Group__2"


    // $ANTLR start "rule__NewContainer__Group__2__Impl"
    // InternalDataflowDSL.g:3752:1: rule__NewContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__NewContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3756:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3757:1: ( '{' )
            {
            // InternalDataflowDSL.g:3757:1: ( '{' )
            // InternalDataflowDSL.g:3758:2: '{'
            {
             before(grammarAccess.getNewContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__NewContainer__Group__2__Impl"


    // $ANTLR start "rule__NewContainer__Group__3"
    // InternalDataflowDSL.g:3767:1: rule__NewContainer__Group__3 : rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4 ;
    public final void rule__NewContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3771:1: ( rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4 )
            // InternalDataflowDSL.g:3772:2: rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__NewContainer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group__4();

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
    // $ANTLR end "rule__NewContainer__Group__3"


    // $ANTLR start "rule__NewContainer__Group__3__Impl"
    // InternalDataflowDSL.g:3779:1: rule__NewContainer__Group__3__Impl : ( ( rule__NewContainer__Group_3__0 )? ) ;
    public final void rule__NewContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3783:1: ( ( ( rule__NewContainer__Group_3__0 )? ) )
            // InternalDataflowDSL.g:3784:1: ( ( rule__NewContainer__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:3784:1: ( ( rule__NewContainer__Group_3__0 )? )
            // InternalDataflowDSL.g:3785:2: ( rule__NewContainer__Group_3__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_3()); 
            // InternalDataflowDSL.g:3786:2: ( rule__NewContainer__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataflowDSL.g:3786:3: rule__NewContainer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewContainer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewContainerAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NewContainer__Group__3__Impl"


    // $ANTLR start "rule__NewContainer__Group__4"
    // InternalDataflowDSL.g:3794:1: rule__NewContainer__Group__4 : rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5 ;
    public final void rule__NewContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3798:1: ( rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5 )
            // InternalDataflowDSL.g:3799:2: rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__NewContainer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group__5();

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
    // $ANTLR end "rule__NewContainer__Group__4"


    // $ANTLR start "rule__NewContainer__Group__4__Impl"
    // InternalDataflowDSL.g:3806:1: rule__NewContainer__Group__4__Impl : ( ( rule__NewContainer__Group_4__0 )? ) ;
    public final void rule__NewContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3810:1: ( ( ( rule__NewContainer__Group_4__0 )? ) )
            // InternalDataflowDSL.g:3811:1: ( ( rule__NewContainer__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:3811:1: ( ( rule__NewContainer__Group_4__0 )? )
            // InternalDataflowDSL.g:3812:2: ( rule__NewContainer__Group_4__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_4()); 
            // InternalDataflowDSL.g:3813:2: ( rule__NewContainer__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataflowDSL.g:3813:3: rule__NewContainer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewContainer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewContainerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__NewContainer__Group__4__Impl"


    // $ANTLR start "rule__NewContainer__Group__5"
    // InternalDataflowDSL.g:3821:1: rule__NewContainer__Group__5 : rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6 ;
    public final void rule__NewContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3825:1: ( rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6 )
            // InternalDataflowDSL.g:3826:2: rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__NewContainer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group__6();

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
    // $ANTLR end "rule__NewContainer__Group__5"


    // $ANTLR start "rule__NewContainer__Group__5__Impl"
    // InternalDataflowDSL.g:3833:1: rule__NewContainer__Group__5__Impl : ( ( rule__NewContainer__Group_5__0 )? ) ;
    public final void rule__NewContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3837:1: ( ( ( rule__NewContainer__Group_5__0 )? ) )
            // InternalDataflowDSL.g:3838:1: ( ( rule__NewContainer__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:3838:1: ( ( rule__NewContainer__Group_5__0 )? )
            // InternalDataflowDSL.g:3839:2: ( rule__NewContainer__Group_5__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_5()); 
            // InternalDataflowDSL.g:3840:2: ( rule__NewContainer__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataflowDSL.g:3840:3: rule__NewContainer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewContainer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewContainerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__NewContainer__Group__5__Impl"


    // $ANTLR start "rule__NewContainer__Group__6"
    // InternalDataflowDSL.g:3848:1: rule__NewContainer__Group__6 : rule__NewContainer__Group__6__Impl ;
    public final void rule__NewContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3852:1: ( rule__NewContainer__Group__6__Impl )
            // InternalDataflowDSL.g:3853:2: rule__NewContainer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__Group__6__Impl();

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
    // $ANTLR end "rule__NewContainer__Group__6"


    // $ANTLR start "rule__NewContainer__Group__6__Impl"
    // InternalDataflowDSL.g:3859:1: rule__NewContainer__Group__6__Impl : ( '}' ) ;
    public final void rule__NewContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3863:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3864:1: ( '}' )
            {
            // InternalDataflowDSL.g:3864:1: ( '}' )
            // InternalDataflowDSL.g:3865:2: '}'
            {
             before(grammarAccess.getNewContainerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__NewContainer__Group__6__Impl"


    // $ANTLR start "rule__NewContainer__Group_3__0"
    // InternalDataflowDSL.g:3875:1: rule__NewContainer__Group_3__0 : rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1 ;
    public final void rule__NewContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3879:1: ( rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1 )
            // InternalDataflowDSL.g:3880:2: rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__NewContainer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group_3__1();

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
    // $ANTLR end "rule__NewContainer__Group_3__0"


    // $ANTLR start "rule__NewContainer__Group_3__0__Impl"
    // InternalDataflowDSL.g:3887:1: rule__NewContainer__Group_3__0__Impl : ( 'listField' ) ;
    public final void rule__NewContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3891:1: ( ( 'listField' ) )
            // InternalDataflowDSL.g:3892:1: ( 'listField' )
            {
            // InternalDataflowDSL.g:3892:1: ( 'listField' )
            // InternalDataflowDSL.g:3893:2: 'listField'
            {
             before(grammarAccess.getNewContainerAccess().getListFieldKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getListFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__NewContainer__Group_3__0__Impl"


    // $ANTLR start "rule__NewContainer__Group_3__1"
    // InternalDataflowDSL.g:3902:1: rule__NewContainer__Group_3__1 : rule__NewContainer__Group_3__1__Impl ;
    public final void rule__NewContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3906:1: ( rule__NewContainer__Group_3__1__Impl )
            // InternalDataflowDSL.g:3907:2: rule__NewContainer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__Group_3__1__Impl();

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
    // $ANTLR end "rule__NewContainer__Group_3__1"


    // $ANTLR start "rule__NewContainer__Group_3__1__Impl"
    // InternalDataflowDSL.g:3913:1: rule__NewContainer__Group_3__1__Impl : ( ( rule__NewContainer__ListFieldAssignment_3_1 ) ) ;
    public final void rule__NewContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3917:1: ( ( ( rule__NewContainer__ListFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:3918:1: ( ( rule__NewContainer__ListFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:3918:1: ( ( rule__NewContainer__ListFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:3919:2: ( rule__NewContainer__ListFieldAssignment_3_1 )
            {
             before(grammarAccess.getNewContainerAccess().getListFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:3920:2: ( rule__NewContainer__ListFieldAssignment_3_1 )
            // InternalDataflowDSL.g:3920:3: rule__NewContainer__ListFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__ListFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNewContainerAccess().getListFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__NewContainer__Group_3__1__Impl"


    // $ANTLR start "rule__NewContainer__Group_4__0"
    // InternalDataflowDSL.g:3929:1: rule__NewContainer__Group_4__0 : rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1 ;
    public final void rule__NewContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3933:1: ( rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1 )
            // InternalDataflowDSL.g:3934:2: rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__NewContainer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group_4__1();

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
    // $ANTLR end "rule__NewContainer__Group_4__0"


    // $ANTLR start "rule__NewContainer__Group_4__0__Impl"
    // InternalDataflowDSL.g:3941:1: rule__NewContainer__Group_4__0__Impl : ( 'containerType' ) ;
    public final void rule__NewContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3945:1: ( ( 'containerType' ) )
            // InternalDataflowDSL.g:3946:1: ( 'containerType' )
            {
            // InternalDataflowDSL.g:3946:1: ( 'containerType' )
            // InternalDataflowDSL.g:3947:2: 'containerType'
            {
             before(grammarAccess.getNewContainerAccess().getContainerTypeKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getContainerTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__NewContainer__Group_4__0__Impl"


    // $ANTLR start "rule__NewContainer__Group_4__1"
    // InternalDataflowDSL.g:3956:1: rule__NewContainer__Group_4__1 : rule__NewContainer__Group_4__1__Impl ;
    public final void rule__NewContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3960:1: ( rule__NewContainer__Group_4__1__Impl )
            // InternalDataflowDSL.g:3961:2: rule__NewContainer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__Group_4__1__Impl();

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
    // $ANTLR end "rule__NewContainer__Group_4__1"


    // $ANTLR start "rule__NewContainer__Group_4__1__Impl"
    // InternalDataflowDSL.g:3967:1: rule__NewContainer__Group_4__1__Impl : ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) ) ;
    public final void rule__NewContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3971:1: ( ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:3972:1: ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:3972:1: ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) )
            // InternalDataflowDSL.g:3973:2: ( rule__NewContainer__ContainerTypeAssignment_4_1 )
            {
             before(grammarAccess.getNewContainerAccess().getContainerTypeAssignment_4_1()); 
            // InternalDataflowDSL.g:3974:2: ( rule__NewContainer__ContainerTypeAssignment_4_1 )
            // InternalDataflowDSL.g:3974:3: rule__NewContainer__ContainerTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__ContainerTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNewContainerAccess().getContainerTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__NewContainer__Group_4__1__Impl"


    // $ANTLR start "rule__NewContainer__Group_5__0"
    // InternalDataflowDSL.g:3983:1: rule__NewContainer__Group_5__0 : rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1 ;
    public final void rule__NewContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3987:1: ( rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1 )
            // InternalDataflowDSL.g:3988:2: rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__NewContainer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewContainer__Group_5__1();

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
    // $ANTLR end "rule__NewContainer__Group_5__0"


    // $ANTLR start "rule__NewContainer__Group_5__0__Impl"
    // InternalDataflowDSL.g:3995:1: rule__NewContainer__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__NewContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3999:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4000:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4000:1: ( 'target' )
            // InternalDataflowDSL.g:4001:2: 'target'
            {
             before(grammarAccess.getNewContainerAccess().getTargetKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getTargetKeyword_5_0()); 

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
    // $ANTLR end "rule__NewContainer__Group_5__0__Impl"


    // $ANTLR start "rule__NewContainer__Group_5__1"
    // InternalDataflowDSL.g:4010:1: rule__NewContainer__Group_5__1 : rule__NewContainer__Group_5__1__Impl ;
    public final void rule__NewContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4014:1: ( rule__NewContainer__Group_5__1__Impl )
            // InternalDataflowDSL.g:4015:2: rule__NewContainer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__Group_5__1__Impl();

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
    // $ANTLR end "rule__NewContainer__Group_5__1"


    // $ANTLR start "rule__NewContainer__Group_5__1__Impl"
    // InternalDataflowDSL.g:4021:1: rule__NewContainer__Group_5__1__Impl : ( ( rule__NewContainer__TargetAssignment_5_1 ) ) ;
    public final void rule__NewContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4025:1: ( ( ( rule__NewContainer__TargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:4026:1: ( ( rule__NewContainer__TargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:4026:1: ( ( rule__NewContainer__TargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:4027:2: ( rule__NewContainer__TargetAssignment_5_1 )
            {
             before(grammarAccess.getNewContainerAccess().getTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:4028:2: ( rule__NewContainer__TargetAssignment_5_1 )
            // InternalDataflowDSL.g:4028:3: rule__NewContainer__TargetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NewContainer__TargetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNewContainerAccess().getTargetAssignment_5_1()); 

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
    // $ANTLR end "rule__NewContainer__Group_5__1__Impl"


    // $ANTLR start "rule__AddToContainer__Group__0"
    // InternalDataflowDSL.g:4037:1: rule__AddToContainer__Group__0 : rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1 ;
    public final void rule__AddToContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4041:1: ( rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1 )
            // InternalDataflowDSL.g:4042:2: rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AddToContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__1();

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
    // $ANTLR end "rule__AddToContainer__Group__0"


    // $ANTLR start "rule__AddToContainer__Group__0__Impl"
    // InternalDataflowDSL.g:4049:1: rule__AddToContainer__Group__0__Impl : ( 'AddToContainer' ) ;
    public final void rule__AddToContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4053:1: ( ( 'AddToContainer' ) )
            // InternalDataflowDSL.g:4054:1: ( 'AddToContainer' )
            {
            // InternalDataflowDSL.g:4054:1: ( 'AddToContainer' )
            // InternalDataflowDSL.g:4055:2: 'AddToContainer'
            {
             before(grammarAccess.getAddToContainerAccess().getAddToContainerKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getAddToContainerKeyword_0()); 

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
    // $ANTLR end "rule__AddToContainer__Group__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group__1"
    // InternalDataflowDSL.g:4064:1: rule__AddToContainer__Group__1 : rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2 ;
    public final void rule__AddToContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4068:1: ( rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2 )
            // InternalDataflowDSL.g:4069:2: rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AddToContainer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__2();

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
    // $ANTLR end "rule__AddToContainer__Group__1"


    // $ANTLR start "rule__AddToContainer__Group__1__Impl"
    // InternalDataflowDSL.g:4076:1: rule__AddToContainer__Group__1__Impl : ( ( rule__AddToContainer__NameAssignment_1 ) ) ;
    public final void rule__AddToContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4080:1: ( ( ( rule__AddToContainer__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4081:1: ( ( rule__AddToContainer__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4081:1: ( ( rule__AddToContainer__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4082:2: ( rule__AddToContainer__NameAssignment_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4083:2: ( rule__AddToContainer__NameAssignment_1 )
            // InternalDataflowDSL.g:4083:3: rule__AddToContainer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AddToContainer__Group__1__Impl"


    // $ANTLR start "rule__AddToContainer__Group__2"
    // InternalDataflowDSL.g:4091:1: rule__AddToContainer__Group__2 : rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3 ;
    public final void rule__AddToContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4095:1: ( rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3 )
            // InternalDataflowDSL.g:4096:2: rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__AddToContainer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__3();

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
    // $ANTLR end "rule__AddToContainer__Group__2"


    // $ANTLR start "rule__AddToContainer__Group__2__Impl"
    // InternalDataflowDSL.g:4103:1: rule__AddToContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__AddToContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4107:1: ( ( '{' ) )
            // InternalDataflowDSL.g:4108:1: ( '{' )
            {
            // InternalDataflowDSL.g:4108:1: ( '{' )
            // InternalDataflowDSL.g:4109:2: '{'
            {
             before(grammarAccess.getAddToContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AddToContainer__Group__2__Impl"


    // $ANTLR start "rule__AddToContainer__Group__3"
    // InternalDataflowDSL.g:4118:1: rule__AddToContainer__Group__3 : rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4 ;
    public final void rule__AddToContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4122:1: ( rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4 )
            // InternalDataflowDSL.g:4123:2: rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__AddToContainer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__4();

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
    // $ANTLR end "rule__AddToContainer__Group__3"


    // $ANTLR start "rule__AddToContainer__Group__3__Impl"
    // InternalDataflowDSL.g:4130:1: rule__AddToContainer__Group__3__Impl : ( ( rule__AddToContainer__Group_3__0 )? ) ;
    public final void rule__AddToContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4134:1: ( ( ( rule__AddToContainer__Group_3__0 )? ) )
            // InternalDataflowDSL.g:4135:1: ( ( rule__AddToContainer__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:4135:1: ( ( rule__AddToContainer__Group_3__0 )? )
            // InternalDataflowDSL.g:4136:2: ( rule__AddToContainer__Group_3__0 )?
            {
             before(grammarAccess.getAddToContainerAccess().getGroup_3()); 
            // InternalDataflowDSL.g:4137:2: ( rule__AddToContainer__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataflowDSL.g:4137:3: rule__AddToContainer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToContainer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddToContainerAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AddToContainer__Group__3__Impl"


    // $ANTLR start "rule__AddToContainer__Group__4"
    // InternalDataflowDSL.g:4145:1: rule__AddToContainer__Group__4 : rule__AddToContainer__Group__4__Impl rule__AddToContainer__Group__5 ;
    public final void rule__AddToContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4149:1: ( rule__AddToContainer__Group__4__Impl rule__AddToContainer__Group__5 )
            // InternalDataflowDSL.g:4150:2: rule__AddToContainer__Group__4__Impl rule__AddToContainer__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__AddToContainer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__5();

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
    // $ANTLR end "rule__AddToContainer__Group__4"


    // $ANTLR start "rule__AddToContainer__Group__4__Impl"
    // InternalDataflowDSL.g:4157:1: rule__AddToContainer__Group__4__Impl : ( ( rule__AddToContainer__Group_4__0 )? ) ;
    public final void rule__AddToContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4161:1: ( ( ( rule__AddToContainer__Group_4__0 )? ) )
            // InternalDataflowDSL.g:4162:1: ( ( rule__AddToContainer__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:4162:1: ( ( rule__AddToContainer__Group_4__0 )? )
            // InternalDataflowDSL.g:4163:2: ( rule__AddToContainer__Group_4__0 )?
            {
             before(grammarAccess.getAddToContainerAccess().getGroup_4()); 
            // InternalDataflowDSL.g:4164:2: ( rule__AddToContainer__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataflowDSL.g:4164:3: rule__AddToContainer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToContainer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddToContainerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AddToContainer__Group__4__Impl"


    // $ANTLR start "rule__AddToContainer__Group__5"
    // InternalDataflowDSL.g:4172:1: rule__AddToContainer__Group__5 : rule__AddToContainer__Group__5__Impl rule__AddToContainer__Group__6 ;
    public final void rule__AddToContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4176:1: ( rule__AddToContainer__Group__5__Impl rule__AddToContainer__Group__6 )
            // InternalDataflowDSL.g:4177:2: rule__AddToContainer__Group__5__Impl rule__AddToContainer__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__AddToContainer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__6();

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
    // $ANTLR end "rule__AddToContainer__Group__5"


    // $ANTLR start "rule__AddToContainer__Group__5__Impl"
    // InternalDataflowDSL.g:4184:1: rule__AddToContainer__Group__5__Impl : ( ( rule__AddToContainer__Group_5__0 )? ) ;
    public final void rule__AddToContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4188:1: ( ( ( rule__AddToContainer__Group_5__0 )? ) )
            // InternalDataflowDSL.g:4189:1: ( ( rule__AddToContainer__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:4189:1: ( ( rule__AddToContainer__Group_5__0 )? )
            // InternalDataflowDSL.g:4190:2: ( rule__AddToContainer__Group_5__0 )?
            {
             before(grammarAccess.getAddToContainerAccess().getGroup_5()); 
            // InternalDataflowDSL.g:4191:2: ( rule__AddToContainer__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDataflowDSL.g:4191:3: rule__AddToContainer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToContainer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddToContainerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__AddToContainer__Group__5__Impl"


    // $ANTLR start "rule__AddToContainer__Group__6"
    // InternalDataflowDSL.g:4199:1: rule__AddToContainer__Group__6 : rule__AddToContainer__Group__6__Impl rule__AddToContainer__Group__7 ;
    public final void rule__AddToContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4203:1: ( rule__AddToContainer__Group__6__Impl rule__AddToContainer__Group__7 )
            // InternalDataflowDSL.g:4204:2: rule__AddToContainer__Group__6__Impl rule__AddToContainer__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__AddToContainer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__7();

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
    // $ANTLR end "rule__AddToContainer__Group__6"


    // $ANTLR start "rule__AddToContainer__Group__6__Impl"
    // InternalDataflowDSL.g:4211:1: rule__AddToContainer__Group__6__Impl : ( ( rule__AddToContainer__Group_6__0 )? ) ;
    public final void rule__AddToContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4215:1: ( ( ( rule__AddToContainer__Group_6__0 )? ) )
            // InternalDataflowDSL.g:4216:1: ( ( rule__AddToContainer__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:4216:1: ( ( rule__AddToContainer__Group_6__0 )? )
            // InternalDataflowDSL.g:4217:2: ( rule__AddToContainer__Group_6__0 )?
            {
             before(grammarAccess.getAddToContainerAccess().getGroup_6()); 
            // InternalDataflowDSL.g:4218:2: ( rule__AddToContainer__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDataflowDSL.g:4218:3: rule__AddToContainer__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToContainer__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddToContainerAccess().getGroup_6()); 

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
    // $ANTLR end "rule__AddToContainer__Group__6__Impl"


    // $ANTLR start "rule__AddToContainer__Group__7"
    // InternalDataflowDSL.g:4226:1: rule__AddToContainer__Group__7 : rule__AddToContainer__Group__7__Impl ;
    public final void rule__AddToContainer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4230:1: ( rule__AddToContainer__Group__7__Impl )
            // InternalDataflowDSL.g:4231:2: rule__AddToContainer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__7__Impl();

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
    // $ANTLR end "rule__AddToContainer__Group__7"


    // $ANTLR start "rule__AddToContainer__Group__7__Impl"
    // InternalDataflowDSL.g:4237:1: rule__AddToContainer__Group__7__Impl : ( '}' ) ;
    public final void rule__AddToContainer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4241:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4242:1: ( '}' )
            {
            // InternalDataflowDSL.g:4242:1: ( '}' )
            // InternalDataflowDSL.g:4243:2: '}'
            {
             before(grammarAccess.getAddToContainerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__AddToContainer__Group__7__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3__0"
    // InternalDataflowDSL.g:4253:1: rule__AddToContainer__Group_3__0 : rule__AddToContainer__Group_3__0__Impl rule__AddToContainer__Group_3__1 ;
    public final void rule__AddToContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4257:1: ( rule__AddToContainer__Group_3__0__Impl rule__AddToContainer__Group_3__1 )
            // InternalDataflowDSL.g:4258:2: rule__AddToContainer__Group_3__0__Impl rule__AddToContainer__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__AddToContainer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3__1();

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
    // $ANTLR end "rule__AddToContainer__Group_3__0"


    // $ANTLR start "rule__AddToContainer__Group_3__0__Impl"
    // InternalDataflowDSL.g:4265:1: rule__AddToContainer__Group_3__0__Impl : ( 'listField' ) ;
    public final void rule__AddToContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4269:1: ( ( 'listField' ) )
            // InternalDataflowDSL.g:4270:1: ( 'listField' )
            {
            // InternalDataflowDSL.g:4270:1: ( 'listField' )
            // InternalDataflowDSL.g:4271:2: 'listField'
            {
             before(grammarAccess.getAddToContainerAccess().getListFieldKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getListFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__AddToContainer__Group_3__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3__1"
    // InternalDataflowDSL.g:4280:1: rule__AddToContainer__Group_3__1 : rule__AddToContainer__Group_3__1__Impl ;
    public final void rule__AddToContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4284:1: ( rule__AddToContainer__Group_3__1__Impl )
            // InternalDataflowDSL.g:4285:2: rule__AddToContainer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3__1__Impl();

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
    // $ANTLR end "rule__AddToContainer__Group_3__1"


    // $ANTLR start "rule__AddToContainer__Group_3__1__Impl"
    // InternalDataflowDSL.g:4291:1: rule__AddToContainer__Group_3__1__Impl : ( ( rule__AddToContainer__ListFieldAssignment_3_1 ) ) ;
    public final void rule__AddToContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4295:1: ( ( ( rule__AddToContainer__ListFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:4296:1: ( ( rule__AddToContainer__ListFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:4296:1: ( ( rule__AddToContainer__ListFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:4297:2: ( rule__AddToContainer__ListFieldAssignment_3_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getListFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:4298:2: ( rule__AddToContainer__ListFieldAssignment_3_1 )
            // InternalDataflowDSL.g:4298:3: rule__AddToContainer__ListFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__ListFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getListFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__AddToContainer__Group_3__1__Impl"


    // $ANTLR start "rule__AddToContainer__Group_4__0"
    // InternalDataflowDSL.g:4307:1: rule__AddToContainer__Group_4__0 : rule__AddToContainer__Group_4__0__Impl rule__AddToContainer__Group_4__1 ;
    public final void rule__AddToContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4311:1: ( rule__AddToContainer__Group_4__0__Impl rule__AddToContainer__Group_4__1 )
            // InternalDataflowDSL.g:4312:2: rule__AddToContainer__Group_4__0__Impl rule__AddToContainer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__AddToContainer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_4__1();

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
    // $ANTLR end "rule__AddToContainer__Group_4__0"


    // $ANTLR start "rule__AddToContainer__Group_4__0__Impl"
    // InternalDataflowDSL.g:4319:1: rule__AddToContainer__Group_4__0__Impl : ( 'valueField' ) ;
    public final void rule__AddToContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4323:1: ( ( 'valueField' ) )
            // InternalDataflowDSL.g:4324:1: ( 'valueField' )
            {
            // InternalDataflowDSL.g:4324:1: ( 'valueField' )
            // InternalDataflowDSL.g:4325:2: 'valueField'
            {
             before(grammarAccess.getAddToContainerAccess().getValueFieldKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getValueFieldKeyword_4_0()); 

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
    // $ANTLR end "rule__AddToContainer__Group_4__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group_4__1"
    // InternalDataflowDSL.g:4334:1: rule__AddToContainer__Group_4__1 : rule__AddToContainer__Group_4__1__Impl ;
    public final void rule__AddToContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4338:1: ( rule__AddToContainer__Group_4__1__Impl )
            // InternalDataflowDSL.g:4339:2: rule__AddToContainer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_4__1__Impl();

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
    // $ANTLR end "rule__AddToContainer__Group_4__1"


    // $ANTLR start "rule__AddToContainer__Group_4__1__Impl"
    // InternalDataflowDSL.g:4345:1: rule__AddToContainer__Group_4__1__Impl : ( ( rule__AddToContainer__ValueFieldAssignment_4_1 ) ) ;
    public final void rule__AddToContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4349:1: ( ( ( rule__AddToContainer__ValueFieldAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:4350:1: ( ( rule__AddToContainer__ValueFieldAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:4350:1: ( ( rule__AddToContainer__ValueFieldAssignment_4_1 ) )
            // InternalDataflowDSL.g:4351:2: ( rule__AddToContainer__ValueFieldAssignment_4_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getValueFieldAssignment_4_1()); 
            // InternalDataflowDSL.g:4352:2: ( rule__AddToContainer__ValueFieldAssignment_4_1 )
            // InternalDataflowDSL.g:4352:3: rule__AddToContainer__ValueFieldAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__ValueFieldAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getValueFieldAssignment_4_1()); 

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
    // $ANTLR end "rule__AddToContainer__Group_4__1__Impl"


    // $ANTLR start "rule__AddToContainer__Group_5__0"
    // InternalDataflowDSL.g:4361:1: rule__AddToContainer__Group_5__0 : rule__AddToContainer__Group_5__0__Impl rule__AddToContainer__Group_5__1 ;
    public final void rule__AddToContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4365:1: ( rule__AddToContainer__Group_5__0__Impl rule__AddToContainer__Group_5__1 )
            // InternalDataflowDSL.g:4366:2: rule__AddToContainer__Group_5__0__Impl rule__AddToContainer__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__AddToContainer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_5__1();

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
    // $ANTLR end "rule__AddToContainer__Group_5__0"


    // $ANTLR start "rule__AddToContainer__Group_5__0__Impl"
    // InternalDataflowDSL.g:4373:1: rule__AddToContainer__Group_5__0__Impl : ( 'positionField' ) ;
    public final void rule__AddToContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4377:1: ( ( 'positionField' ) )
            // InternalDataflowDSL.g:4378:1: ( 'positionField' )
            {
            // InternalDataflowDSL.g:4378:1: ( 'positionField' )
            // InternalDataflowDSL.g:4379:2: 'positionField'
            {
             before(grammarAccess.getAddToContainerAccess().getPositionFieldKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getPositionFieldKeyword_5_0()); 

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
    // $ANTLR end "rule__AddToContainer__Group_5__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group_5__1"
    // InternalDataflowDSL.g:4388:1: rule__AddToContainer__Group_5__1 : rule__AddToContainer__Group_5__1__Impl ;
    public final void rule__AddToContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4392:1: ( rule__AddToContainer__Group_5__1__Impl )
            // InternalDataflowDSL.g:4393:2: rule__AddToContainer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_5__1__Impl();

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
    // $ANTLR end "rule__AddToContainer__Group_5__1"


    // $ANTLR start "rule__AddToContainer__Group_5__1__Impl"
    // InternalDataflowDSL.g:4399:1: rule__AddToContainer__Group_5__1__Impl : ( ( rule__AddToContainer__PositionFieldAssignment_5_1 ) ) ;
    public final void rule__AddToContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4403:1: ( ( ( rule__AddToContainer__PositionFieldAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:4404:1: ( ( rule__AddToContainer__PositionFieldAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:4404:1: ( ( rule__AddToContainer__PositionFieldAssignment_5_1 ) )
            // InternalDataflowDSL.g:4405:2: ( rule__AddToContainer__PositionFieldAssignment_5_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getPositionFieldAssignment_5_1()); 
            // InternalDataflowDSL.g:4406:2: ( rule__AddToContainer__PositionFieldAssignment_5_1 )
            // InternalDataflowDSL.g:4406:3: rule__AddToContainer__PositionFieldAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__PositionFieldAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getPositionFieldAssignment_5_1()); 

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
    // $ANTLR end "rule__AddToContainer__Group_5__1__Impl"


    // $ANTLR start "rule__AddToContainer__Group_6__0"
    // InternalDataflowDSL.g:4415:1: rule__AddToContainer__Group_6__0 : rule__AddToContainer__Group_6__0__Impl rule__AddToContainer__Group_6__1 ;
    public final void rule__AddToContainer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4419:1: ( rule__AddToContainer__Group_6__0__Impl rule__AddToContainer__Group_6__1 )
            // InternalDataflowDSL.g:4420:2: rule__AddToContainer__Group_6__0__Impl rule__AddToContainer__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__AddToContainer__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_6__1();

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
    // $ANTLR end "rule__AddToContainer__Group_6__0"


    // $ANTLR start "rule__AddToContainer__Group_6__0__Impl"
    // InternalDataflowDSL.g:4427:1: rule__AddToContainer__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__AddToContainer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4431:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4432:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4432:1: ( 'target' )
            // InternalDataflowDSL.g:4433:2: 'target'
            {
             before(grammarAccess.getAddToContainerAccess().getTargetKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getTargetKeyword_6_0()); 

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
    // $ANTLR end "rule__AddToContainer__Group_6__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group_6__1"
    // InternalDataflowDSL.g:4442:1: rule__AddToContainer__Group_6__1 : rule__AddToContainer__Group_6__1__Impl ;
    public final void rule__AddToContainer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4446:1: ( rule__AddToContainer__Group_6__1__Impl )
            // InternalDataflowDSL.g:4447:2: rule__AddToContainer__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_6__1__Impl();

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
    // $ANTLR end "rule__AddToContainer__Group_6__1"


    // $ANTLR start "rule__AddToContainer__Group_6__1__Impl"
    // InternalDataflowDSL.g:4453:1: rule__AddToContainer__Group_6__1__Impl : ( ( rule__AddToContainer__TargetAssignment_6_1 ) ) ;
    public final void rule__AddToContainer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4457:1: ( ( ( rule__AddToContainer__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:4458:1: ( ( rule__AddToContainer__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:4458:1: ( ( rule__AddToContainer__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:4459:2: ( rule__AddToContainer__TargetAssignment_6_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:4460:2: ( rule__AddToContainer__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:4460:3: rule__AddToContainer__TargetAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__TargetAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getTargetAssignment_6_1()); 

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
    // $ANTLR end "rule__AddToContainer__Group_6__1__Impl"


    // $ANTLR start "rule__Evaluate__Group__0"
    // InternalDataflowDSL.g:4469:1: rule__Evaluate__Group__0 : rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 ;
    public final void rule__Evaluate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4473:1: ( rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 )
            // InternalDataflowDSL.g:4474:2: rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Evaluate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__1();

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
    // $ANTLR end "rule__Evaluate__Group__0"


    // $ANTLR start "rule__Evaluate__Group__0__Impl"
    // InternalDataflowDSL.g:4481:1: rule__Evaluate__Group__0__Impl : ( 'Evaluate' ) ;
    public final void rule__Evaluate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4485:1: ( ( 'Evaluate' ) )
            // InternalDataflowDSL.g:4486:1: ( 'Evaluate' )
            {
            // InternalDataflowDSL.g:4486:1: ( 'Evaluate' )
            // InternalDataflowDSL.g:4487:2: 'Evaluate'
            {
             before(grammarAccess.getEvaluateAccess().getEvaluateKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getEvaluateKeyword_0()); 

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
    // $ANTLR end "rule__Evaluate__Group__0__Impl"


    // $ANTLR start "rule__Evaluate__Group__1"
    // InternalDataflowDSL.g:4496:1: rule__Evaluate__Group__1 : rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 ;
    public final void rule__Evaluate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4500:1: ( rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 )
            // InternalDataflowDSL.g:4501:2: rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Evaluate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__2();

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
    // $ANTLR end "rule__Evaluate__Group__1"


    // $ANTLR start "rule__Evaluate__Group__1__Impl"
    // InternalDataflowDSL.g:4508:1: rule__Evaluate__Group__1__Impl : ( ( rule__Evaluate__NameAssignment_1 ) ) ;
    public final void rule__Evaluate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4512:1: ( ( ( rule__Evaluate__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4513:1: ( ( rule__Evaluate__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4513:1: ( ( rule__Evaluate__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4514:2: ( rule__Evaluate__NameAssignment_1 )
            {
             before(grammarAccess.getEvaluateAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4515:2: ( rule__Evaluate__NameAssignment_1 )
            // InternalDataflowDSL.g:4515:3: rule__Evaluate__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Evaluate__Group__1__Impl"


    // $ANTLR start "rule__Evaluate__Group__2"
    // InternalDataflowDSL.g:4523:1: rule__Evaluate__Group__2 : rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3 ;
    public final void rule__Evaluate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4527:1: ( rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3 )
            // InternalDataflowDSL.g:4528:2: rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Evaluate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__3();

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
    // $ANTLR end "rule__Evaluate__Group__2"


    // $ANTLR start "rule__Evaluate__Group__2__Impl"
    // InternalDataflowDSL.g:4535:1: rule__Evaluate__Group__2__Impl : ( '{' ) ;
    public final void rule__Evaluate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4539:1: ( ( '{' ) )
            // InternalDataflowDSL.g:4540:1: ( '{' )
            {
            // InternalDataflowDSL.g:4540:1: ( '{' )
            // InternalDataflowDSL.g:4541:2: '{'
            {
             before(grammarAccess.getEvaluateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Evaluate__Group__2__Impl"


    // $ANTLR start "rule__Evaluate__Group__3"
    // InternalDataflowDSL.g:4550:1: rule__Evaluate__Group__3 : rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4 ;
    public final void rule__Evaluate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4554:1: ( rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4 )
            // InternalDataflowDSL.g:4555:2: rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Evaluate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__4();

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
    // $ANTLR end "rule__Evaluate__Group__3"


    // $ANTLR start "rule__Evaluate__Group__3__Impl"
    // InternalDataflowDSL.g:4562:1: rule__Evaluate__Group__3__Impl : ( ( rule__Evaluate__Group_3__0 )? ) ;
    public final void rule__Evaluate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4566:1: ( ( ( rule__Evaluate__Group_3__0 )? ) )
            // InternalDataflowDSL.g:4567:1: ( ( rule__Evaluate__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:4567:1: ( ( rule__Evaluate__Group_3__0 )? )
            // InternalDataflowDSL.g:4568:2: ( rule__Evaluate__Group_3__0 )?
            {
             before(grammarAccess.getEvaluateAccess().getGroup_3()); 
            // InternalDataflowDSL.g:4569:2: ( rule__Evaluate__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDataflowDSL.g:4569:3: rule__Evaluate__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluate__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluateAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Evaluate__Group__3__Impl"


    // $ANTLR start "rule__Evaluate__Group__4"
    // InternalDataflowDSL.g:4577:1: rule__Evaluate__Group__4 : rule__Evaluate__Group__4__Impl rule__Evaluate__Group__5 ;
    public final void rule__Evaluate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4581:1: ( rule__Evaluate__Group__4__Impl rule__Evaluate__Group__5 )
            // InternalDataflowDSL.g:4582:2: rule__Evaluate__Group__4__Impl rule__Evaluate__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Evaluate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__5();

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
    // $ANTLR end "rule__Evaluate__Group__4"


    // $ANTLR start "rule__Evaluate__Group__4__Impl"
    // InternalDataflowDSL.g:4589:1: rule__Evaluate__Group__4__Impl : ( ( rule__Evaluate__Group_4__0 )? ) ;
    public final void rule__Evaluate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4593:1: ( ( ( rule__Evaluate__Group_4__0 )? ) )
            // InternalDataflowDSL.g:4594:1: ( ( rule__Evaluate__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:4594:1: ( ( rule__Evaluate__Group_4__0 )? )
            // InternalDataflowDSL.g:4595:2: ( rule__Evaluate__Group_4__0 )?
            {
             before(grammarAccess.getEvaluateAccess().getGroup_4()); 
            // InternalDataflowDSL.g:4596:2: ( rule__Evaluate__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==59) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDataflowDSL.g:4596:3: rule__Evaluate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluateAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Evaluate__Group__4__Impl"


    // $ANTLR start "rule__Evaluate__Group__5"
    // InternalDataflowDSL.g:4604:1: rule__Evaluate__Group__5 : rule__Evaluate__Group__5__Impl rule__Evaluate__Group__6 ;
    public final void rule__Evaluate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4608:1: ( rule__Evaluate__Group__5__Impl rule__Evaluate__Group__6 )
            // InternalDataflowDSL.g:4609:2: rule__Evaluate__Group__5__Impl rule__Evaluate__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Evaluate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__6();

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
    // $ANTLR end "rule__Evaluate__Group__5"


    // $ANTLR start "rule__Evaluate__Group__5__Impl"
    // InternalDataflowDSL.g:4616:1: rule__Evaluate__Group__5__Impl : ( ( rule__Evaluate__Group_5__0 )? ) ;
    public final void rule__Evaluate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4620:1: ( ( ( rule__Evaluate__Group_5__0 )? ) )
            // InternalDataflowDSL.g:4621:1: ( ( rule__Evaluate__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:4621:1: ( ( rule__Evaluate__Group_5__0 )? )
            // InternalDataflowDSL.g:4622:2: ( rule__Evaluate__Group_5__0 )?
            {
             before(grammarAccess.getEvaluateAccess().getGroup_5()); 
            // InternalDataflowDSL.g:4623:2: ( rule__Evaluate__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDataflowDSL.g:4623:3: rule__Evaluate__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluate__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluateAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Evaluate__Group__5__Impl"


    // $ANTLR start "rule__Evaluate__Group__6"
    // InternalDataflowDSL.g:4631:1: rule__Evaluate__Group__6 : rule__Evaluate__Group__6__Impl ;
    public final void rule__Evaluate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4635:1: ( rule__Evaluate__Group__6__Impl )
            // InternalDataflowDSL.g:4636:2: rule__Evaluate__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__6__Impl();

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
    // $ANTLR end "rule__Evaluate__Group__6"


    // $ANTLR start "rule__Evaluate__Group__6__Impl"
    // InternalDataflowDSL.g:4642:1: rule__Evaluate__Group__6__Impl : ( '}' ) ;
    public final void rule__Evaluate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4646:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4647:1: ( '}' )
            {
            // InternalDataflowDSL.g:4647:1: ( '}' )
            // InternalDataflowDSL.g:4648:2: '}'
            {
             before(grammarAccess.getEvaluateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Evaluate__Group__6__Impl"


    // $ANTLR start "rule__Evaluate__Group_3__0"
    // InternalDataflowDSL.g:4658:1: rule__Evaluate__Group_3__0 : rule__Evaluate__Group_3__0__Impl rule__Evaluate__Group_3__1 ;
    public final void rule__Evaluate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4662:1: ( rule__Evaluate__Group_3__0__Impl rule__Evaluate__Group_3__1 )
            // InternalDataflowDSL.g:4663:2: rule__Evaluate__Group_3__0__Impl rule__Evaluate__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Evaluate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_3__1();

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
    // $ANTLR end "rule__Evaluate__Group_3__0"


    // $ANTLR start "rule__Evaluate__Group_3__0__Impl"
    // InternalDataflowDSL.g:4670:1: rule__Evaluate__Group_3__0__Impl : ( 'field' ) ;
    public final void rule__Evaluate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4674:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:4675:1: ( 'field' )
            {
            // InternalDataflowDSL.g:4675:1: ( 'field' )
            // InternalDataflowDSL.g:4676:2: 'field'
            {
             before(grammarAccess.getEvaluateAccess().getFieldKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getFieldKeyword_3_0()); 

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
    // $ANTLR end "rule__Evaluate__Group_3__0__Impl"


    // $ANTLR start "rule__Evaluate__Group_3__1"
    // InternalDataflowDSL.g:4685:1: rule__Evaluate__Group_3__1 : rule__Evaluate__Group_3__1__Impl ;
    public final void rule__Evaluate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4689:1: ( rule__Evaluate__Group_3__1__Impl )
            // InternalDataflowDSL.g:4690:2: rule__Evaluate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_3__1__Impl();

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
    // $ANTLR end "rule__Evaluate__Group_3__1"


    // $ANTLR start "rule__Evaluate__Group_3__1__Impl"
    // InternalDataflowDSL.g:4696:1: rule__Evaluate__Group_3__1__Impl : ( ( rule__Evaluate__FieldAssignment_3_1 ) ) ;
    public final void rule__Evaluate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4700:1: ( ( ( rule__Evaluate__FieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:4701:1: ( ( rule__Evaluate__FieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:4701:1: ( ( rule__Evaluate__FieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:4702:2: ( rule__Evaluate__FieldAssignment_3_1 )
            {
             before(grammarAccess.getEvaluateAccess().getFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:4703:2: ( rule__Evaluate__FieldAssignment_3_1 )
            // InternalDataflowDSL.g:4703:3: rule__Evaluate__FieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__FieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getFieldAssignment_3_1()); 

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
    // $ANTLR end "rule__Evaluate__Group_3__1__Impl"


    // $ANTLR start "rule__Evaluate__Group_4__0"
    // InternalDataflowDSL.g:4712:1: rule__Evaluate__Group_4__0 : rule__Evaluate__Group_4__0__Impl rule__Evaluate__Group_4__1 ;
    public final void rule__Evaluate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4716:1: ( rule__Evaluate__Group_4__0__Impl rule__Evaluate__Group_4__1 )
            // InternalDataflowDSL.g:4717:2: rule__Evaluate__Group_4__0__Impl rule__Evaluate__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Evaluate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_4__1();

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
    // $ANTLR end "rule__Evaluate__Group_4__0"


    // $ANTLR start "rule__Evaluate__Group_4__0__Impl"
    // InternalDataflowDSL.g:4724:1: rule__Evaluate__Group_4__0__Impl : ( 'expression' ) ;
    public final void rule__Evaluate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4728:1: ( ( 'expression' ) )
            // InternalDataflowDSL.g:4729:1: ( 'expression' )
            {
            // InternalDataflowDSL.g:4729:1: ( 'expression' )
            // InternalDataflowDSL.g:4730:2: 'expression'
            {
             before(grammarAccess.getEvaluateAccess().getExpressionKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getExpressionKeyword_4_0()); 

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
    // $ANTLR end "rule__Evaluate__Group_4__0__Impl"


    // $ANTLR start "rule__Evaluate__Group_4__1"
    // InternalDataflowDSL.g:4739:1: rule__Evaluate__Group_4__1 : rule__Evaluate__Group_4__1__Impl ;
    public final void rule__Evaluate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4743:1: ( rule__Evaluate__Group_4__1__Impl )
            // InternalDataflowDSL.g:4744:2: rule__Evaluate__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_4__1__Impl();

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
    // $ANTLR end "rule__Evaluate__Group_4__1"


    // $ANTLR start "rule__Evaluate__Group_4__1__Impl"
    // InternalDataflowDSL.g:4750:1: rule__Evaluate__Group_4__1__Impl : ( ( rule__Evaluate__ExpressionAssignment_4_1 ) ) ;
    public final void rule__Evaluate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4754:1: ( ( ( rule__Evaluate__ExpressionAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:4755:1: ( ( rule__Evaluate__ExpressionAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:4755:1: ( ( rule__Evaluate__ExpressionAssignment_4_1 ) )
            // InternalDataflowDSL.g:4756:2: ( rule__Evaluate__ExpressionAssignment_4_1 )
            {
             before(grammarAccess.getEvaluateAccess().getExpressionAssignment_4_1()); 
            // InternalDataflowDSL.g:4757:2: ( rule__Evaluate__ExpressionAssignment_4_1 )
            // InternalDataflowDSL.g:4757:3: rule__Evaluate__ExpressionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__ExpressionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getExpressionAssignment_4_1()); 

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
    // $ANTLR end "rule__Evaluate__Group_4__1__Impl"


    // $ANTLR start "rule__Evaluate__Group_5__0"
    // InternalDataflowDSL.g:4766:1: rule__Evaluate__Group_5__0 : rule__Evaluate__Group_5__0__Impl rule__Evaluate__Group_5__1 ;
    public final void rule__Evaluate__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4770:1: ( rule__Evaluate__Group_5__0__Impl rule__Evaluate__Group_5__1 )
            // InternalDataflowDSL.g:4771:2: rule__Evaluate__Group_5__0__Impl rule__Evaluate__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Evaluate__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_5__1();

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
    // $ANTLR end "rule__Evaluate__Group_5__0"


    // $ANTLR start "rule__Evaluate__Group_5__0__Impl"
    // InternalDataflowDSL.g:4778:1: rule__Evaluate__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__Evaluate__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4782:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4783:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4783:1: ( 'target' )
            // InternalDataflowDSL.g:4784:2: 'target'
            {
             before(grammarAccess.getEvaluateAccess().getTargetKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getTargetKeyword_5_0()); 

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
    // $ANTLR end "rule__Evaluate__Group_5__0__Impl"


    // $ANTLR start "rule__Evaluate__Group_5__1"
    // InternalDataflowDSL.g:4793:1: rule__Evaluate__Group_5__1 : rule__Evaluate__Group_5__1__Impl ;
    public final void rule__Evaluate__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4797:1: ( rule__Evaluate__Group_5__1__Impl )
            // InternalDataflowDSL.g:4798:2: rule__Evaluate__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_5__1__Impl();

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
    // $ANTLR end "rule__Evaluate__Group_5__1"


    // $ANTLR start "rule__Evaluate__Group_5__1__Impl"
    // InternalDataflowDSL.g:4804:1: rule__Evaluate__Group_5__1__Impl : ( ( rule__Evaluate__TargetAssignment_5_1 ) ) ;
    public final void rule__Evaluate__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4808:1: ( ( ( rule__Evaluate__TargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:4809:1: ( ( rule__Evaluate__TargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:4809:1: ( ( rule__Evaluate__TargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:4810:2: ( rule__Evaluate__TargetAssignment_5_1 )
            {
             before(grammarAccess.getEvaluateAccess().getTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:4811:2: ( rule__Evaluate__TargetAssignment_5_1 )
            // InternalDataflowDSL.g:4811:3: rule__Evaluate__TargetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__TargetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getTargetAssignment_5_1()); 

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
    // $ANTLR end "rule__Evaluate__Group_5__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalDataflowDSL.g:4820:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4824:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalDataflowDSL.g:4825:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalDataflowDSL.g:4832:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4836:1: ( ( ruleAndExpression ) )
            // InternalDataflowDSL.g:4837:1: ( ruleAndExpression )
            {
            // InternalDataflowDSL.g:4837:1: ( ruleAndExpression )
            // InternalDataflowDSL.g:4838:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalDataflowDSL.g:4847:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4851:1: ( rule__OrExpression__Group__1__Impl )
            // InternalDataflowDSL.g:4852:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalDataflowDSL.g:4858:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )? ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4862:1: ( ( ( rule__OrExpression__Group_1__0 )? ) )
            // InternalDataflowDSL.g:4863:1: ( ( rule__OrExpression__Group_1__0 )? )
            {
            // InternalDataflowDSL.g:4863:1: ( ( rule__OrExpression__Group_1__0 )? )
            // InternalDataflowDSL.g:4864:2: ( rule__OrExpression__Group_1__0 )?
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:4865:2: ( rule__OrExpression__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDataflowDSL.g:4865:3: rule__OrExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalDataflowDSL.g:4874:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4878:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalDataflowDSL.g:4879:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalDataflowDSL.g:4886:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4890:1: ( ( () ) )
            // InternalDataflowDSL.g:4891:1: ( () )
            {
            // InternalDataflowDSL.g:4891:1: ( () )
            // InternalDataflowDSL.g:4892:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:4893:2: ()
            // InternalDataflowDSL.g:4893:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalDataflowDSL.g:4901:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4905:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalDataflowDSL.g:4906:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalDataflowDSL.g:4913:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4917:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:4918:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:4918:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:4919:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:4920:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:4920:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalDataflowDSL.g:4928:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4932:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:4933:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalDataflowDSL.g:4939:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4943:1: ( ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:4944:1: ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:4944:1: ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:4945:2: ( rule__OrExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:4946:2: ( rule__OrExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:4946:3: rule__OrExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalDataflowDSL.g:4955:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4959:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalDataflowDSL.g:4960:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalDataflowDSL.g:4967:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4971:1: ( ( ruleEqualityExpression ) )
            // InternalDataflowDSL.g:4972:1: ( ruleEqualityExpression )
            {
            // InternalDataflowDSL.g:4972:1: ( ruleEqualityExpression )
            // InternalDataflowDSL.g:4973:2: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalDataflowDSL.g:4982:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4986:1: ( rule__AndExpression__Group__1__Impl )
            // InternalDataflowDSL.g:4987:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalDataflowDSL.g:4993:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )? ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4997:1: ( ( ( rule__AndExpression__Group_1__0 )? ) )
            // InternalDataflowDSL.g:4998:1: ( ( rule__AndExpression__Group_1__0 )? )
            {
            // InternalDataflowDSL.g:4998:1: ( ( rule__AndExpression__Group_1__0 )? )
            // InternalDataflowDSL.g:4999:2: ( rule__AndExpression__Group_1__0 )?
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:5000:2: ( rule__AndExpression__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDataflowDSL.g:5000:3: rule__AndExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AndExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalDataflowDSL.g:5009:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5013:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalDataflowDSL.g:5014:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalDataflowDSL.g:5021:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5025:1: ( ( () ) )
            // InternalDataflowDSL.g:5026:1: ( () )
            {
            // InternalDataflowDSL.g:5026:1: ( () )
            // InternalDataflowDSL.g:5027:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:5028:2: ()
            // InternalDataflowDSL.g:5028:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalDataflowDSL.g:5036:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5040:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalDataflowDSL.g:5041:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalDataflowDSL.g:5048:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5052:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:5053:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:5053:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:5054:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:5055:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:5055:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalDataflowDSL.g:5063:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5067:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:5068:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalDataflowDSL.g:5074:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5078:1: ( ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:5079:1: ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:5079:1: ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:5080:2: ( rule__AndExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:5081:2: ( rule__AndExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:5081:3: rule__AndExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // InternalDataflowDSL.g:5090:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5094:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalDataflowDSL.g:5095:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1();

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
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // InternalDataflowDSL.g:5102:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5106:1: ( ( ruleRelationalExpression ) )
            // InternalDataflowDSL.g:5107:1: ( ruleRelationalExpression )
            {
            // InternalDataflowDSL.g:5107:1: ( ruleRelationalExpression )
            // InternalDataflowDSL.g:5108:2: ruleRelationalExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // InternalDataflowDSL.g:5117:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5121:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalDataflowDSL.g:5122:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1__Impl();

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
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // InternalDataflowDSL.g:5128:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )? ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5132:1: ( ( ( rule__EqualityExpression__Group_1__0 )? ) )
            // InternalDataflowDSL.g:5133:1: ( ( rule__EqualityExpression__Group_1__0 )? )
            {
            // InternalDataflowDSL.g:5133:1: ( ( rule__EqualityExpression__Group_1__0 )? )
            // InternalDataflowDSL.g:5134:2: ( rule__EqualityExpression__Group_1__0 )?
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:5135:2: ( rule__EqualityExpression__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=19 && LA47_0<=20)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDataflowDSL.g:5135:3: rule__EqualityExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EqualityExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // InternalDataflowDSL.g:5144:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5148:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalDataflowDSL.g:5149:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__1();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // InternalDataflowDSL.g:5156:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5160:1: ( ( () ) )
            // InternalDataflowDSL.g:5161:1: ( () )
            {
            // InternalDataflowDSL.g:5161:1: ( () )
            // InternalDataflowDSL.g:5162:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:5163:2: ()
            // InternalDataflowDSL.g:5163:3: 
            {
            }

             after(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // InternalDataflowDSL.g:5171:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5175:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalDataflowDSL.g:5176:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // InternalDataflowDSL.g:5183:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5187:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:5188:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:5188:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:5189:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:5190:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:5190:3: rule__EqualityExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__2"
    // InternalDataflowDSL.g:5198:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5202:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:5203:2: rule__EqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__2"


    // $ANTLR start "rule__EqualityExpression__Group_1__2__Impl"
    // InternalDataflowDSL.g:5209:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5213:1: ( ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:5214:1: ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:5214:1: ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:5215:2: ( rule__EqualityExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:5216:2: ( rule__EqualityExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:5216:3: rule__EqualityExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getRightExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__EqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__0"
    // InternalDataflowDSL.g:5225:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5229:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalDataflowDSL.g:5230:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1();

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
    // $ANTLR end "rule__RelationalExpression__Group__0"


    // $ANTLR start "rule__RelationalExpression__Group__0__Impl"
    // InternalDataflowDSL.g:5237:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5241:1: ( ( ruleAdditiveExpression ) )
            // InternalDataflowDSL.g:5242:1: ( ruleAdditiveExpression )
            {
            // InternalDataflowDSL.g:5242:1: ( ruleAdditiveExpression )
            // InternalDataflowDSL.g:5243:2: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__RelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__1"
    // InternalDataflowDSL.g:5252:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5256:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalDataflowDSL.g:5257:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1__Impl();

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
    // $ANTLR end "rule__RelationalExpression__Group__1"


    // $ANTLR start "rule__RelationalExpression__Group__1__Impl"
    // InternalDataflowDSL.g:5263:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )? ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5267:1: ( ( ( rule__RelationalExpression__Group_1__0 )? ) )
            // InternalDataflowDSL.g:5268:1: ( ( rule__RelationalExpression__Group_1__0 )? )
            {
            // InternalDataflowDSL.g:5268:1: ( ( rule__RelationalExpression__Group_1__0 )? )
            // InternalDataflowDSL.g:5269:2: ( rule__RelationalExpression__Group_1__0 )?
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:5270:2: ( rule__RelationalExpression__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=21 && LA48_0<=24)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDataflowDSL.g:5270:3: rule__RelationalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationalExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__0"
    // InternalDataflowDSL.g:5279:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5283:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalDataflowDSL.g:5284:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__1();

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
    // $ANTLR end "rule__RelationalExpression__Group_1__0"


    // $ANTLR start "rule__RelationalExpression__Group_1__0__Impl"
    // InternalDataflowDSL.g:5291:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5295:1: ( ( () ) )
            // InternalDataflowDSL.g:5296:1: ( () )
            {
            // InternalDataflowDSL.g:5296:1: ( () )
            // InternalDataflowDSL.g:5297:2: ()
            {
             before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:5298:2: ()
            // InternalDataflowDSL.g:5298:3: 
            {
            }

             after(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__1"
    // InternalDataflowDSL.g:5306:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5310:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // InternalDataflowDSL.g:5311:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__RelationalExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__2();

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
    // $ANTLR end "rule__RelationalExpression__Group_1__1"


    // $ANTLR start "rule__RelationalExpression__Group_1__1__Impl"
    // InternalDataflowDSL.g:5318:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5322:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:5323:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:5323:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:5324:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:5325:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:5325:3: rule__RelationalExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__RelationalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__2"
    // InternalDataflowDSL.g:5333:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5337:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:5338:2: rule__RelationalExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__RelationalExpression__Group_1__2"


    // $ANTLR start "rule__RelationalExpression__Group_1__2__Impl"
    // InternalDataflowDSL.g:5344:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5348:1: ( ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:5349:1: ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:5349:1: ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:5350:2: ( rule__RelationalExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:5351:2: ( rule__RelationalExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:5351:3: rule__RelationalExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getRightExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__RelationalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalDataflowDSL.g:5360:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5364:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalDataflowDSL.g:5365:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

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
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalDataflowDSL.g:5372:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5376:1: ( ( ruleMultiplicativeExpression ) )
            // InternalDataflowDSL.g:5377:1: ( ruleMultiplicativeExpression )
            {
            // InternalDataflowDSL.g:5377:1: ( ruleMultiplicativeExpression )
            // InternalDataflowDSL.g:5378:2: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalDataflowDSL.g:5387:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5391:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalDataflowDSL.g:5392:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalDataflowDSL.g:5398:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )? ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5402:1: ( ( ( rule__AdditiveExpression__Group_1__0 )? ) )
            // InternalDataflowDSL.g:5403:1: ( ( rule__AdditiveExpression__Group_1__0 )? )
            {
            // InternalDataflowDSL.g:5403:1: ( ( rule__AdditiveExpression__Group_1__0 )? )
            // InternalDataflowDSL.g:5404:2: ( rule__AdditiveExpression__Group_1__0 )?
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:5405:2: ( rule__AdditiveExpression__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=25 && LA49_0<=26)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDataflowDSL.g:5405:3: rule__AdditiveExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdditiveExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalDataflowDSL.g:5414:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5418:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalDataflowDSL.g:5419:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalDataflowDSL.g:5426:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5430:1: ( ( () ) )
            // InternalDataflowDSL.g:5431:1: ( () )
            {
            // InternalDataflowDSL.g:5431:1: ( () )
            // InternalDataflowDSL.g:5432:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:5433:2: ()
            // InternalDataflowDSL.g:5433:3: 
            {
            }

             after(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalDataflowDSL.g:5441:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5445:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalDataflowDSL.g:5446:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2();

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalDataflowDSL.g:5453:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5457:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:5458:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:5458:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:5459:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:5460:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:5460:3: rule__AdditiveExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2"
    // InternalDataflowDSL.g:5468:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5472:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:5473:2: rule__AdditiveExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__2"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2__Impl"
    // InternalDataflowDSL.g:5479:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5483:1: ( ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:5484:1: ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:5484:1: ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:5485:2: ( rule__AdditiveExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:5486:2: ( rule__AdditiveExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:5486:3: rule__AdditiveExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getRightExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalDataflowDSL.g:5495:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5499:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalDataflowDSL.g:5500:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalDataflowDSL.g:5507:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5511:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:5512:1: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:5512:1: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:5513:2: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalDataflowDSL.g:5522:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5526:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalDataflowDSL.g:5527:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalDataflowDSL.g:5533:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )? ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5537:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )? ) )
            // InternalDataflowDSL.g:5538:1: ( ( rule__MultiplicativeExpression__Group_1__0 )? )
            {
            // InternalDataflowDSL.g:5538:1: ( ( rule__MultiplicativeExpression__Group_1__0 )? )
            // InternalDataflowDSL.g:5539:2: ( rule__MultiplicativeExpression__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:5540:2: ( rule__MultiplicativeExpression__Group_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=27 && LA50_0<=29)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDataflowDSL.g:5540:3: rule__MultiplicativeExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicativeExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalDataflowDSL.g:5549:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5553:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalDataflowDSL.g:5554:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalDataflowDSL.g:5561:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5565:1: ( ( () ) )
            // InternalDataflowDSL.g:5566:1: ( () )
            {
            // InternalDataflowDSL.g:5566:1: ( () )
            // InternalDataflowDSL.g:5567:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:5568:2: ()
            // InternalDataflowDSL.g:5568:3: 
            {
            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalDataflowDSL.g:5576:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5580:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalDataflowDSL.g:5581:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalDataflowDSL.g:5588:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5592:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:5593:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:5593:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:5594:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:5595:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:5595:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2"
    // InternalDataflowDSL.g:5603:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5607:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:5608:2: rule__MultiplicativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2__Impl"
    // InternalDataflowDSL.g:5614:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5618:1: ( ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:5619:1: ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:5619:1: ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:5620:2: ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:5621:2: ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:5621:3: rule__MultiplicativeExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // InternalDataflowDSL.g:5630:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5634:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalDataflowDSL.g:5635:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__1();

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
    // $ANTLR end "rule__UnaryExpression__Group_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0__0__Impl"
    // InternalDataflowDSL.g:5642:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5646:1: ( ( () ) )
            // InternalDataflowDSL.g:5647:1: ( () )
            {
            // InternalDataflowDSL.g:5647:1: ( () )
            // InternalDataflowDSL.g:5648:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperationAction_0_0()); 
            // InternalDataflowDSL.g:5649:2: ()
            // InternalDataflowDSL.g:5649:3: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getUnaryOperationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__1"
    // InternalDataflowDSL.g:5657:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5661:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalDataflowDSL.g:5662:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2();

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
    // $ANTLR end "rule__UnaryExpression__Group_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0__1__Impl"
    // InternalDataflowDSL.g:5669:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5673:1: ( ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) )
            // InternalDataflowDSL.g:5674:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            {
            // InternalDataflowDSL.g:5674:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            // InternalDataflowDSL.g:5675:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            // InternalDataflowDSL.g:5676:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            // InternalDataflowDSL.g:5676:3: rule__UnaryExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperatorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 

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
    // $ANTLR end "rule__UnaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__2"
    // InternalDataflowDSL.g:5684:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5688:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalDataflowDSL.g:5689:2: rule__UnaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__UnaryExpression__Group_0__2"


    // $ANTLR start "rule__UnaryExpression__Group_0__2__Impl"
    // InternalDataflowDSL.g:5695:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5699:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) )
            // InternalDataflowDSL.g:5700:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            {
            // InternalDataflowDSL.g:5700:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            // InternalDataflowDSL.g:5701:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 
            // InternalDataflowDSL.g:5702:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            // InternalDataflowDSL.g:5702:3: rule__UnaryExpression__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__ExpressionAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 

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
    // $ANTLR end "rule__UnaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalDataflowDSL.g:5711:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5715:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalDataflowDSL.g:5716:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalDataflowDSL.g:5723:1: rule__PrimaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5727:1: ( ( () ) )
            // InternalDataflowDSL.g:5728:1: ( () )
            {
            // InternalDataflowDSL.g:5728:1: ( () )
            // InternalDataflowDSL.g:5729:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIntegerLiteralAction_0_0()); 
            // InternalDataflowDSL.g:5730:2: ()
            // InternalDataflowDSL.g:5730:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getIntegerLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalDataflowDSL.g:5738:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5742:1: ( rule__PrimaryExpression__Group_0__1__Impl )
            // InternalDataflowDSL.g:5743:2: rule__PrimaryExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalDataflowDSL.g:5749:1: rule__PrimaryExpression__Group_0__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5753:1: ( ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) )
            // InternalDataflowDSL.g:5754:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            {
            // InternalDataflowDSL.g:5754:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            // InternalDataflowDSL.g:5755:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 
            // InternalDataflowDSL.g:5756:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            // InternalDataflowDSL.g:5756:3: rule__PrimaryExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalDataflowDSL.g:5765:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5769:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalDataflowDSL.g:5770:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalDataflowDSL.g:5777:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5781:1: ( ( () ) )
            // InternalDataflowDSL.g:5782:1: ( () )
            {
            // InternalDataflowDSL.g:5782:1: ( () )
            // InternalDataflowDSL.g:5783:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_1_0()); 
            // InternalDataflowDSL.g:5784:2: ()
            // InternalDataflowDSL.g:5784:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalDataflowDSL.g:5792:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5796:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalDataflowDSL.g:5797:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalDataflowDSL.g:5803:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5807:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:5808:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:5808:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalDataflowDSL.g:5809:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalDataflowDSL.g:5810:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalDataflowDSL.g:5810:3: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalDataflowDSL.g:5819:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5823:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalDataflowDSL.g:5824:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalDataflowDSL.g:5831:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5835:1: ( ( () ) )
            // InternalDataflowDSL.g:5836:1: ( () )
            {
            // InternalDataflowDSL.g:5836:1: ( () )
            // InternalDataflowDSL.g:5837:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0()); 
            // InternalDataflowDSL.g:5838:2: ()
            // InternalDataflowDSL.g:5838:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalDataflowDSL.g:5846:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5850:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalDataflowDSL.g:5851:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalDataflowDSL.g:5857:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5861:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // InternalDataflowDSL.g:5862:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // InternalDataflowDSL.g:5862:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // InternalDataflowDSL.g:5863:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // InternalDataflowDSL.g:5864:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // InternalDataflowDSL.g:5864:3: rule__PrimaryExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // InternalDataflowDSL.g:5873:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5877:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalDataflowDSL.g:5878:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // InternalDataflowDSL.g:5885:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5889:1: ( ( () ) )
            // InternalDataflowDSL.g:5890:1: ( () )
            {
            // InternalDataflowDSL.g:5890:1: ( () )
            // InternalDataflowDSL.g:5891:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_3_0()); 
            // InternalDataflowDSL.g:5892:2: ()
            // InternalDataflowDSL.g:5892:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // InternalDataflowDSL.g:5900:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5904:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // InternalDataflowDSL.g:5905:2: rule__PrimaryExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // InternalDataflowDSL.g:5911:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5915:1: ( ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:5916:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:5916:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            // InternalDataflowDSL.g:5917:2: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_3_1()); 
            // InternalDataflowDSL.g:5918:2: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            // InternalDataflowDSL.g:5918:3: rule__PrimaryExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0"
    // InternalDataflowDSL.g:5927:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5931:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalDataflowDSL.g:5932:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimaryExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__0"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0__Impl"
    // InternalDataflowDSL.g:5939:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5943:1: ( ( () ) )
            // InternalDataflowDSL.g:5944:1: ( () )
            {
            // InternalDataflowDSL.g:5944:1: ( () )
            // InternalDataflowDSL.g:5945:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldReferenceAction_4_0()); 
            // InternalDataflowDSL.g:5946:2: ()
            // InternalDataflowDSL.g:5946:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getFieldReferenceAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1"
    // InternalDataflowDSL.g:5954:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5958:1: ( rule__PrimaryExpression__Group_4__1__Impl )
            // InternalDataflowDSL.g:5959:2: rule__PrimaryExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__1"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1__Impl"
    // InternalDataflowDSL.g:5965:1: rule__PrimaryExpression__Group_4__1__Impl : ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5969:1: ( ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:5970:1: ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:5970:1: ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) )
            // InternalDataflowDSL.g:5971:2: ( rule__PrimaryExpression__FieldAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldAssignment_4_1()); 
            // InternalDataflowDSL.g:5972:2: ( rule__PrimaryExpression__FieldAssignment_4_1 )
            // InternalDataflowDSL.g:5972:3: rule__PrimaryExpression__FieldAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__FieldAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getFieldAssignment_4_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__0"
    // InternalDataflowDSL.g:5981:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5985:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // InternalDataflowDSL.g:5986:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__PrimaryExpression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_5__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_5__0"


    // $ANTLR start "rule__PrimaryExpression__Group_5__0__Impl"
    // InternalDataflowDSL.g:5993:1: rule__PrimaryExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5997:1: ( ( '(' ) )
            // InternalDataflowDSL.g:5998:1: ( '(' )
            {
            // InternalDataflowDSL.g:5998:1: ( '(' )
            // InternalDataflowDSL.g:5999:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_5__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__1"
    // InternalDataflowDSL.g:6008:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6012:1: ( rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 )
            // InternalDataflowDSL.g:6013:2: rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2
            {
            pushFollow(FOLLOW_28);
            rule__PrimaryExpression__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_5__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_5__1"


    // $ANTLR start "rule__PrimaryExpression__Group_5__1__Impl"
    // InternalDataflowDSL.g:6020:1: rule__PrimaryExpression__Group_5__1__Impl : ( ruleOrExpression ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6024:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:6025:1: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:6025:1: ( ruleOrExpression )
            // InternalDataflowDSL.g:6026:2: ruleOrExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_5_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_5__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__2"
    // InternalDataflowDSL.g:6035:1: rule__PrimaryExpression__Group_5__2 : rule__PrimaryExpression__Group_5__2__Impl ;
    public final void rule__PrimaryExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6039:1: ( rule__PrimaryExpression__Group_5__2__Impl )
            // InternalDataflowDSL.g:6040:2: rule__PrimaryExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_5__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_5__2"


    // $ANTLR start "rule__PrimaryExpression__Group_5__2__Impl"
    // InternalDataflowDSL.g:6046:1: rule__PrimaryExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6050:1: ( ( ')' ) )
            // InternalDataflowDSL.g:6051:1: ( ')' )
            {
            // InternalDataflowDSL.g:6051:1: ( ')' )
            // InternalDataflowDSL.g:6052:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_5__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalDataflowDSL.g:6062:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6066:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDataflowDSL.g:6067:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalDataflowDSL.g:6074:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6078:1: ( ( ( RULE_INT )? ) )
            // InternalDataflowDSL.g:6079:1: ( ( RULE_INT )? )
            {
            // InternalDataflowDSL.g:6079:1: ( ( RULE_INT )? )
            // InternalDataflowDSL.g:6080:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalDataflowDSL.g:6081:2: ( RULE_INT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDataflowDSL.g:6081:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalDataflowDSL.g:6089:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6093:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDataflowDSL.g:6094:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalDataflowDSL.g:6101:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6105:1: ( ( '.' ) )
            // InternalDataflowDSL.g:6106:1: ( '.' )
            {
            // InternalDataflowDSL.g:6106:1: ( '.' )
            // InternalDataflowDSL.g:6107:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalDataflowDSL.g:6116:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6120:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDataflowDSL.g:6121:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalDataflowDSL.g:6128:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6132:1: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:6133:1: ( RULE_INT )
            {
            // InternalDataflowDSL.g:6133:1: ( RULE_INT )
            // InternalDataflowDSL.g:6134:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalDataflowDSL.g:6143:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6147:1: ( rule__EDouble__Group__3__Impl )
            // InternalDataflowDSL.g:6148:2: rule__EDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3__Impl();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalDataflowDSL.g:6154:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6158:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalDataflowDSL.g:6159:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:6159:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalDataflowDSL.g:6160:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalDataflowDSL.g:6161:2: ( rule__EDouble__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=15 && LA52_0<=16)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDataflowDSL.g:6161:3: rule__EDouble__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group_3__0"
    // InternalDataflowDSL.g:6170:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6174:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalDataflowDSL.g:6175:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__EDouble__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_3__1();

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
    // $ANTLR end "rule__EDouble__Group_3__0"


    // $ANTLR start "rule__EDouble__Group_3__0__Impl"
    // InternalDataflowDSL.g:6182:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6186:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalDataflowDSL.g:6187:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalDataflowDSL.g:6187:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalDataflowDSL.g:6188:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalDataflowDSL.g:6189:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalDataflowDSL.g:6189:3: rule__EDouble__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 

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
    // $ANTLR end "rule__EDouble__Group_3__0__Impl"


    // $ANTLR start "rule__EDouble__Group_3__1"
    // InternalDataflowDSL.g:6197:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6201:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // InternalDataflowDSL.g:6202:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__EDouble__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_3__2();

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
    // $ANTLR end "rule__EDouble__Group_3__1"


    // $ANTLR start "rule__EDouble__Group_3__1__Impl"
    // InternalDataflowDSL.g:6209:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6213:1: ( ( ( '-' )? ) )
            // InternalDataflowDSL.g:6214:1: ( ( '-' )? )
            {
            // InternalDataflowDSL.g:6214:1: ( ( '-' )? )
            // InternalDataflowDSL.g:6215:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // InternalDataflowDSL.g:6216:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==26) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDataflowDSL.g:6216:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 

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
    // $ANTLR end "rule__EDouble__Group_3__1__Impl"


    // $ANTLR start "rule__EDouble__Group_3__2"
    // InternalDataflowDSL.g:6224:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6228:1: ( rule__EDouble__Group_3__2__Impl )
            // InternalDataflowDSL.g:6229:2: rule__EDouble__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_3__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_3__2"


    // $ANTLR start "rule__EDouble__Group_3__2__Impl"
    // InternalDataflowDSL.g:6235:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6239:1: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:6240:1: ( RULE_INT )
            {
            // InternalDataflowDSL.g:6240:1: ( RULE_INT )
            // InternalDataflowDSL.g:6241:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3_2()); 

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
    // $ANTLR end "rule__EDouble__Group_3__2__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // InternalDataflowDSL.g:6251:1: rule__Model__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6255:1: ( ( ruleElement ) )
            // InternalDataflowDSL.g:6256:2: ( ruleElement )
            {
            // InternalDataflowDSL.g:6256:2: ( ruleElement )
            // InternalDataflowDSL.g:6257:3: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__AllInstances__NameAssignment_1"
    // InternalDataflowDSL.g:6266:1: rule__AllInstances__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6270:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6271:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6271:2: ( RULE_ID )
            // InternalDataflowDSL.g:6272:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AllInstances__NameAssignment_1"


    // $ANTLR start "rule__AllInstances__FieldAssignment_3_1"
    // InternalDataflowDSL.g:6281:1: rule__AllInstances__FieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__FieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6285:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6286:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6286:2: ( RULE_ID )
            // InternalDataflowDSL.g:6287:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AllInstances__FieldAssignment_3_1"


    // $ANTLR start "rule__AllInstances__NsURIAssignment_4_1"
    // InternalDataflowDSL.g:6296:1: rule__AllInstances__NsURIAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__AllInstances__NsURIAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6300:1: ( ( RULE_STRING ) )
            // InternalDataflowDSL.g:6301:2: ( RULE_STRING )
            {
            // InternalDataflowDSL.g:6301:2: ( RULE_STRING )
            // InternalDataflowDSL.g:6302:3: RULE_STRING
            {
             before(grammarAccess.getAllInstancesAccess().getNsURISTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getNsURISTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__AllInstances__NsURIAssignment_4_1"


    // $ANTLR start "rule__AllInstances__TypeNameAssignment_5_1"
    // InternalDataflowDSL.g:6311:1: rule__AllInstances__TypeNameAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__TypeNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6315:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6316:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6316:2: ( RULE_ID )
            // InternalDataflowDSL.g:6317:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__AllInstances__TypeNameAssignment_5_1"


    // $ANTLR start "rule__AllInstances__TargetAssignment_6_1"
    // InternalDataflowDSL.g:6326:1: rule__AllInstances__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllInstances__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6330:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6331:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6331:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6332:3: ( RULE_ID )
            {
             before(grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:6333:3: ( RULE_ID )
            // InternalDataflowDSL.g:6334:4: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__AllInstances__TargetAssignment_6_1"


    // $ANTLR start "rule__NewInstance__NameAssignment_1"
    // InternalDataflowDSL.g:6345:1: rule__NewInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6349:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6350:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6350:2: ( RULE_ID )
            // InternalDataflowDSL.g:6351:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NewInstance__NameAssignment_1"


    // $ANTLR start "rule__NewInstance__FieldAssignment_3_1"
    // InternalDataflowDSL.g:6360:1: rule__NewInstance__FieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__FieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6364:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6365:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6365:2: ( RULE_ID )
            // InternalDataflowDSL.g:6366:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NewInstance__FieldAssignment_3_1"


    // $ANTLR start "rule__NewInstance__NsURIAssignment_4_1"
    // InternalDataflowDSL.g:6375:1: rule__NewInstance__NsURIAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__NewInstance__NsURIAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6379:1: ( ( RULE_STRING ) )
            // InternalDataflowDSL.g:6380:2: ( RULE_STRING )
            {
            // InternalDataflowDSL.g:6380:2: ( RULE_STRING )
            // InternalDataflowDSL.g:6381:3: RULE_STRING
            {
             before(grammarAccess.getNewInstanceAccess().getNsURISTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getNsURISTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__NewInstance__NsURIAssignment_4_1"


    // $ANTLR start "rule__NewInstance__TypeNameAssignment_5_1"
    // InternalDataflowDSL.g:6390:1: rule__NewInstance__TypeNameAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__TypeNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6394:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6395:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6395:2: ( RULE_ID )
            // InternalDataflowDSL.g:6396:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__NewInstance__TypeNameAssignment_5_1"


    // $ANTLR start "rule__NewInstance__TargetAssignment_6_1"
    // InternalDataflowDSL.g:6405:1: rule__NewInstance__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewInstance__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6409:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6410:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6410:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6411:3: ( RULE_ID )
            {
             before(grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:6412:3: ( RULE_ID )
            // InternalDataflowDSL.g:6413:4: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__NewInstance__TargetAssignment_6_1"


    // $ANTLR start "rule__Filter__NameAssignment_1"
    // InternalDataflowDSL.g:6424:1: rule__Filter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Filter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6428:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6429:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6429:2: ( RULE_ID )
            // InternalDataflowDSL.g:6430:3: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Filter__NameAssignment_1"


    // $ANTLR start "rule__Filter__FilterByFieldAssignment_3_1"
    // InternalDataflowDSL.g:6439:1: rule__Filter__FilterByFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Filter__FilterByFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6443:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6444:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6444:2: ( RULE_ID )
            // InternalDataflowDSL.g:6445:3: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getFilterByFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterByFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Filter__FilterByFieldAssignment_3_1"


    // $ANTLR start "rule__Filter__TargetAssignment_4_1"
    // InternalDataflowDSL.g:6454:1: rule__Filter__TargetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Filter__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6458:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6459:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6459:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6460:3: ( RULE_ID )
            {
             before(grammarAccess.getFilterAccess().getTargetElementCrossReference_4_1_0()); 
            // InternalDataflowDSL.g:6461:3: ( RULE_ID )
            // InternalDataflowDSL.g:6462:4: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getTargetElementIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getTargetElementIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFilterAccess().getTargetElementCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Filter__TargetAssignment_4_1"


    // $ANTLR start "rule__Filter__RejectTargetAssignment_5_1"
    // InternalDataflowDSL.g:6473:1: rule__Filter__RejectTargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Filter__RejectTargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6477:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6478:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6478:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6479:3: ( RULE_ID )
            {
             before(grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:6480:3: ( RULE_ID )
            // InternalDataflowDSL.g:6481:4: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getRejectTargetElementIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRejectTargetElementIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Filter__RejectTargetAssignment_5_1"


    // $ANTLR start "rule__Sort__NameAssignment_1"
    // InternalDataflowDSL.g:6492:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6496:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6497:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6497:2: ( RULE_ID )
            // InternalDataflowDSL.g:6498:3: RULE_ID
            {
             before(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sort__NameAssignment_1"


    // $ANTLR start "rule__Sort__SortByFieldAssignment_3_1"
    // InternalDataflowDSL.g:6507:1: rule__Sort__SortByFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Sort__SortByFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6511:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6512:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6512:2: ( RULE_ID )
            // InternalDataflowDSL.g:6513:3: RULE_ID
            {
             before(grammarAccess.getSortAccess().getSortByFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getSortByFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Sort__SortByFieldAssignment_3_1"


    // $ANTLR start "rule__Sort__TargetAssignment_4_1"
    // InternalDataflowDSL.g:6522:1: rule__Sort__TargetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Sort__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6526:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6527:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6527:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6528:3: ( RULE_ID )
            {
             before(grammarAccess.getSortAccess().getTargetElementCrossReference_4_1_0()); 
            // InternalDataflowDSL.g:6529:3: ( RULE_ID )
            // InternalDataflowDSL.g:6530:4: RULE_ID
            {
             before(grammarAccess.getSortAccess().getTargetElementIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getTargetElementIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSortAccess().getTargetElementCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Sort__TargetAssignment_4_1"


    // $ANTLR start "rule__Product__NameAssignment_1"
    // InternalDataflowDSL.g:6541:1: rule__Product__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Product__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6545:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6546:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6546:2: ( RULE_ID )
            // InternalDataflowDSL.g:6547:3: RULE_ID
            {
             before(grammarAccess.getProductAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProductAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Product__NameAssignment_1"


    // $ANTLR start "rule__Product__TargetAssignment_3_1"
    // InternalDataflowDSL.g:6556:1: rule__Product__TargetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Product__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6560:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6561:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6561:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6562:3: ( RULE_ID )
            {
             before(grammarAccess.getProductAccess().getTargetElementCrossReference_3_1_0()); 
            // InternalDataflowDSL.g:6563:3: ( RULE_ID )
            // InternalDataflowDSL.g:6564:4: RULE_ID
            {
             before(grammarAccess.getProductAccess().getTargetElementIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProductAccess().getTargetElementIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getProductAccess().getTargetElementCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Product__TargetAssignment_3_1"


    // $ANTLR start "rule__GetFeature__NameAssignment_1"
    // InternalDataflowDSL.g:6575:1: rule__GetFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6579:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6580:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6580:2: ( RULE_ID )
            // InternalDataflowDSL.g:6581:3: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GetFeature__NameAssignment_1"


    // $ANTLR start "rule__GetFeature__ObjectFieldAssignment_3_1"
    // InternalDataflowDSL.g:6590:1: rule__GetFeature__ObjectFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__ObjectFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6594:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6595:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6595:2: ( RULE_ID )
            // InternalDataflowDSL.g:6596:3: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__GetFeature__ObjectFieldAssignment_3_1"


    // $ANTLR start "rule__GetFeature__ValueFieldAssignment_4_1"
    // InternalDataflowDSL.g:6605:1: rule__GetFeature__ValueFieldAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__ValueFieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6609:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6610:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6610:2: ( RULE_ID )
            // InternalDataflowDSL.g:6611:3: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getValueFieldIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__GetFeature__ValueFieldAssignment_4_1"


    // $ANTLR start "rule__GetFeature__FeatureAssignment_5_1"
    // InternalDataflowDSL.g:6620:1: rule__GetFeature__FeatureAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__FeatureAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6624:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6625:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6625:2: ( RULE_ID )
            // InternalDataflowDSL.g:6626:3: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getFeatureIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__GetFeature__FeatureAssignment_5_1"


    // $ANTLR start "rule__GetFeature__TargetAssignment_6_1"
    // InternalDataflowDSL.g:6635:1: rule__GetFeature__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetFeature__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6639:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6640:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6640:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6641:3: ( RULE_ID )
            {
             before(grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:6642:3: ( RULE_ID )
            // InternalDataflowDSL.g:6643:4: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__GetFeature__TargetAssignment_6_1"


    // $ANTLR start "rule__SetFeature__NameAssignment_1"
    // InternalDataflowDSL.g:6654:1: rule__SetFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6658:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6659:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6659:2: ( RULE_ID )
            // InternalDataflowDSL.g:6660:3: RULE_ID
            {
             before(grammarAccess.getSetFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SetFeature__NameAssignment_1"


    // $ANTLR start "rule__SetFeature__ObjectFieldAssignment_3_1"
    // InternalDataflowDSL.g:6669:1: rule__SetFeature__ObjectFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__ObjectFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6673:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6674:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6674:2: ( RULE_ID )
            // InternalDataflowDSL.g:6675:3: RULE_ID
            {
             before(grammarAccess.getSetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__SetFeature__ObjectFieldAssignment_3_1"


    // $ANTLR start "rule__SetFeature__ValueFieldAssignment_4_1"
    // InternalDataflowDSL.g:6684:1: rule__SetFeature__ValueFieldAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__ValueFieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6688:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6689:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6689:2: ( RULE_ID )
            // InternalDataflowDSL.g:6690:3: RULE_ID
            {
             before(grammarAccess.getSetFeatureAccess().getValueFieldIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getValueFieldIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SetFeature__ValueFieldAssignment_4_1"


    // $ANTLR start "rule__SetFeature__FeatureAssignment_5_1"
    // InternalDataflowDSL.g:6699:1: rule__SetFeature__FeatureAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__FeatureAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6703:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6704:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6704:2: ( RULE_ID )
            // InternalDataflowDSL.g:6705:3: RULE_ID
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getFeatureIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SetFeature__FeatureAssignment_5_1"


    // $ANTLR start "rule__SetFeature__TargetAssignment_6_1"
    // InternalDataflowDSL.g:6714:1: rule__SetFeature__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetFeature__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6718:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6719:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6719:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6720:3: ( RULE_ID )
            {
             before(grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:6721:3: ( RULE_ID )
            // InternalDataflowDSL.g:6722:4: RULE_ID
            {
             before(grammarAccess.getSetFeatureAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__SetFeature__TargetAssignment_6_1"


    // $ANTLR start "rule__NewContainer__NameAssignment_1"
    // InternalDataflowDSL.g:6733:1: rule__NewContainer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6737:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6738:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6738:2: ( RULE_ID )
            // InternalDataflowDSL.g:6739:3: RULE_ID
            {
             before(grammarAccess.getNewContainerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NewContainer__NameAssignment_1"


    // $ANTLR start "rule__NewContainer__ListFieldAssignment_3_1"
    // InternalDataflowDSL.g:6748:1: rule__NewContainer__ListFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__NewContainer__ListFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6752:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6753:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6753:2: ( RULE_ID )
            // InternalDataflowDSL.g:6754:3: RULE_ID
            {
             before(grammarAccess.getNewContainerAccess().getListFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getListFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NewContainer__ListFieldAssignment_3_1"


    // $ANTLR start "rule__NewContainer__ContainerTypeAssignment_4_1"
    // InternalDataflowDSL.g:6763:1: rule__NewContainer__ContainerTypeAssignment_4_1 : ( ruleContainerType ) ;
    public final void rule__NewContainer__ContainerTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6767:1: ( ( ruleContainerType ) )
            // InternalDataflowDSL.g:6768:2: ( ruleContainerType )
            {
            // InternalDataflowDSL.g:6768:2: ( ruleContainerType )
            // InternalDataflowDSL.g:6769:3: ruleContainerType
            {
             before(grammarAccess.getNewContainerAccess().getContainerTypeContainerTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContainerType();

            state._fsp--;

             after(grammarAccess.getNewContainerAccess().getContainerTypeContainerTypeEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__NewContainer__ContainerTypeAssignment_4_1"


    // $ANTLR start "rule__NewContainer__TargetAssignment_5_1"
    // InternalDataflowDSL.g:6778:1: rule__NewContainer__TargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewContainer__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6782:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6783:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6783:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6784:3: ( RULE_ID )
            {
             before(grammarAccess.getNewContainerAccess().getTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:6785:3: ( RULE_ID )
            // InternalDataflowDSL.g:6786:4: RULE_ID
            {
             before(grammarAccess.getNewContainerAccess().getTargetElementIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getTargetElementIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getNewContainerAccess().getTargetElementCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__NewContainer__TargetAssignment_5_1"


    // $ANTLR start "rule__AddToContainer__NameAssignment_1"
    // InternalDataflowDSL.g:6797:1: rule__AddToContainer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6801:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6802:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6802:2: ( RULE_ID )
            // InternalDataflowDSL.g:6803:3: RULE_ID
            {
             before(grammarAccess.getAddToContainerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddToContainer__NameAssignment_1"


    // $ANTLR start "rule__AddToContainer__ListFieldAssignment_3_1"
    // InternalDataflowDSL.g:6812:1: rule__AddToContainer__ListFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__ListFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6816:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6817:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6817:2: ( RULE_ID )
            // InternalDataflowDSL.g:6818:3: RULE_ID
            {
             before(grammarAccess.getAddToContainerAccess().getListFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getListFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AddToContainer__ListFieldAssignment_3_1"


    // $ANTLR start "rule__AddToContainer__ValueFieldAssignment_4_1"
    // InternalDataflowDSL.g:6827:1: rule__AddToContainer__ValueFieldAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__ValueFieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6831:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6832:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6832:2: ( RULE_ID )
            // InternalDataflowDSL.g:6833:3: RULE_ID
            {
             before(grammarAccess.getAddToContainerAccess().getValueFieldIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getValueFieldIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__AddToContainer__ValueFieldAssignment_4_1"


    // $ANTLR start "rule__AddToContainer__PositionFieldAssignment_5_1"
    // InternalDataflowDSL.g:6842:1: rule__AddToContainer__PositionFieldAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__PositionFieldAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6846:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6847:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6847:2: ( RULE_ID )
            // InternalDataflowDSL.g:6848:3: RULE_ID
            {
             before(grammarAccess.getAddToContainerAccess().getPositionFieldIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getPositionFieldIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__AddToContainer__PositionFieldAssignment_5_1"


    // $ANTLR start "rule__AddToContainer__TargetAssignment_6_1"
    // InternalDataflowDSL.g:6857:1: rule__AddToContainer__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__AddToContainer__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6861:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6862:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6862:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6863:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:6864:3: ( RULE_ID )
            // InternalDataflowDSL.g:6865:4: RULE_ID
            {
             before(grammarAccess.getAddToContainerAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getTargetElementIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__AddToContainer__TargetAssignment_6_1"


    // $ANTLR start "rule__Evaluate__NameAssignment_1"
    // InternalDataflowDSL.g:6876:1: rule__Evaluate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Evaluate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6880:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6881:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6881:2: ( RULE_ID )
            // InternalDataflowDSL.g:6882:3: RULE_ID
            {
             before(grammarAccess.getEvaluateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Evaluate__NameAssignment_1"


    // $ANTLR start "rule__Evaluate__FieldAssignment_3_1"
    // InternalDataflowDSL.g:6891:1: rule__Evaluate__FieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Evaluate__FieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6895:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6896:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:6896:2: ( RULE_ID )
            // InternalDataflowDSL.g:6897:3: RULE_ID
            {
             before(grammarAccess.getEvaluateAccess().getFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getFieldIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Evaluate__FieldAssignment_3_1"


    // $ANTLR start "rule__Evaluate__ExpressionAssignment_4_1"
    // InternalDataflowDSL.g:6906:1: rule__Evaluate__ExpressionAssignment_4_1 : ( ruleOrExpression ) ;
    public final void rule__Evaluate__ExpressionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6910:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:6911:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:6911:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:6912:3: ruleOrExpression
            {
             before(grammarAccess.getEvaluateAccess().getExpressionOrExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getEvaluateAccess().getExpressionOrExpressionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Evaluate__ExpressionAssignment_4_1"


    // $ANTLR start "rule__Evaluate__TargetAssignment_5_1"
    // InternalDataflowDSL.g:6921:1: rule__Evaluate__TargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Evaluate__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6925:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:6926:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:6926:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:6927:3: ( RULE_ID )
            {
             before(grammarAccess.getEvaluateAccess().getTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:6928:3: ( RULE_ID )
            // InternalDataflowDSL.g:6929:4: RULE_ID
            {
             before(grammarAccess.getEvaluateAccess().getTargetElementIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getTargetElementIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getEvaluateAccess().getTargetElementCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Evaluate__TargetAssignment_5_1"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalDataflowDSL.g:6940:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6944:1: ( ( ruleOrOperator ) )
            // InternalDataflowDSL.g:6945:2: ( ruleOrOperator )
            {
            // InternalDataflowDSL.g:6945:2: ( ruleOrOperator )
            // InternalDataflowDSL.g:6946:3: ruleOrOperator
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrOperator();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RightExpressionAssignment_1_2"
    // InternalDataflowDSL.g:6955:1: rule__OrExpression__RightExpressionAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6959:1: ( ( ruleAndExpression ) )
            // InternalDataflowDSL.g:6960:2: ( ruleAndExpression )
            {
            // InternalDataflowDSL.g:6960:2: ( ruleAndExpression )
            // InternalDataflowDSL.g:6961:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalDataflowDSL.g:6970:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6974:1: ( ( ruleAndOperator ) )
            // InternalDataflowDSL.g:6975:2: ( ruleAndOperator )
            {
            // InternalDataflowDSL.g:6975:2: ( ruleAndOperator )
            // InternalDataflowDSL.g:6976:3: ruleAndOperator
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperator();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightExpressionAssignment_1_2"
    // InternalDataflowDSL.g:6985:1: rule__AndExpression__RightExpressionAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6989:1: ( ( ruleEqualityExpression ) )
            // InternalDataflowDSL.g:6990:2: ( ruleEqualityExpression )
            {
            // InternalDataflowDSL.g:6990:2: ( ruleEqualityExpression )
            // InternalDataflowDSL.g:6991:3: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionEqualityExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightExpressionEqualityExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__EqualityExpression__OperatorAssignment_1_1"
    // InternalDataflowDSL.g:7000:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7004:1: ( ( ruleEqualityOperator ) )
            // InternalDataflowDSL.g:7005:2: ( ruleEqualityOperator )
            {
            // InternalDataflowDSL.g:7005:2: ( ruleEqualityOperator )
            // InternalDataflowDSL.g:7006:3: ruleEqualityOperator
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityOperator();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EqualityExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__RightExpressionAssignment_1_2"
    // InternalDataflowDSL.g:7015:1: rule__EqualityExpression__RightExpressionAssignment_1_2 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7019:1: ( ( ruleRelationalExpression ) )
            // InternalDataflowDSL.g:7020:2: ( ruleRelationalExpression )
            {
            // InternalDataflowDSL.g:7020:2: ( ruleRelationalExpression )
            // InternalDataflowDSL.g:7021:3: ruleRelationalExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightExpressionRelationalExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getRightExpressionRelationalExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__EqualityExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__RelationalExpression__OperatorAssignment_1_1"
    // InternalDataflowDSL.g:7030:1: rule__RelationalExpression__OperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7034:1: ( ( ruleRelationalOperator ) )
            // InternalDataflowDSL.g:7035:2: ( ruleRelationalOperator )
            {
            // InternalDataflowDSL.g:7035:2: ( ruleRelationalOperator )
            // InternalDataflowDSL.g:7036:3: ruleRelationalOperator
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__RelationalExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__RelationalExpression__RightExpressionAssignment_1_2"
    // InternalDataflowDSL.g:7045:1: rule__RelationalExpression__RightExpressionAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7049:1: ( ( ruleAdditiveExpression ) )
            // InternalDataflowDSL.g:7050:2: ( ruleAdditiveExpression )
            {
            // InternalDataflowDSL.g:7050:2: ( ruleAdditiveExpression )
            // InternalDataflowDSL.g:7051:3: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getRightExpressionAdditiveExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getRightExpressionAdditiveExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__RelationalExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalDataflowDSL.g:7060:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7064:1: ( ( ruleAdditiveOperator ) )
            // InternalDataflowDSL.g:7065:2: ( ruleAdditiveOperator )
            {
            // InternalDataflowDSL.g:7065:2: ( ruleAdditiveOperator )
            // InternalDataflowDSL.g:7066:3: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AdditiveExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__RightExpressionAssignment_1_2"
    // InternalDataflowDSL.g:7075:1: rule__AdditiveExpression__RightExpressionAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7079:1: ( ( ruleMultiplicativeExpression ) )
            // InternalDataflowDSL.g:7080:2: ( ruleMultiplicativeExpression )
            {
            // InternalDataflowDSL.g:7080:2: ( ruleMultiplicativeExpression )
            // InternalDataflowDSL.g:7081:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightExpressionMultiplicativeExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getRightExpressionMultiplicativeExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AdditiveExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_1_1"
    // InternalDataflowDSL.g:7090:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7094:1: ( ( ruleMultiplicativeOperator ) )
            // InternalDataflowDSL.g:7095:2: ( ruleMultiplicativeOperator )
            {
            // InternalDataflowDSL.g:7095:2: ( ruleMultiplicativeOperator )
            // InternalDataflowDSL.g:7096:3: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__RightExpressionAssignment_1_2"
    // InternalDataflowDSL.g:7105:1: rule__MultiplicativeExpression__RightExpressionAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7109:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:7110:2: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:7110:2: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:7111:3: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_0_1"
    // InternalDataflowDSL.g:7120:1: rule__UnaryExpression__OperatorAssignment_0_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7124:1: ( ( ruleUnaryOperator ) )
            // InternalDataflowDSL.g:7125:2: ( ruleUnaryOperator )
            {
            // InternalDataflowDSL.g:7125:2: ( ruleUnaryOperator )
            // InternalDataflowDSL.g:7126:3: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__UnaryExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__UnaryExpression__ExpressionAssignment_0_2"
    // InternalDataflowDSL.g:7135:1: rule__UnaryExpression__ExpressionAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7139:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:7140:2: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:7140:2: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:7141:3: ruleUnaryExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionUnaryExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getExpressionUnaryExpressionParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__UnaryExpression__ExpressionAssignment_0_2"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_0_1"
    // InternalDataflowDSL.g:7150:1: rule__PrimaryExpression__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__PrimaryExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7154:1: ( ( ruleEInt ) )
            // InternalDataflowDSL.g:7155:2: ( ruleEInt )
            {
            // InternalDataflowDSL.g:7155:2: ( ruleEInt )
            // InternalDataflowDSL.g:7156:3: ruleEInt
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueEIntParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValueEIntParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1_1"
    // InternalDataflowDSL.g:7165:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7169:1: ( ( ruleEBoolean ) )
            // InternalDataflowDSL.g:7170:2: ( ruleEBoolean )
            {
            // InternalDataflowDSL.g:7170:2: ( ruleEBoolean )
            // InternalDataflowDSL.g:7171:3: ruleEBoolean
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValueEBooleanParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_2_1"
    // InternalDataflowDSL.g:7180:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7184:1: ( ( ruleEDouble ) )
            // InternalDataflowDSL.g:7185:2: ( ruleEDouble )
            {
            // InternalDataflowDSL.g:7185:2: ( ruleEDouble )
            // InternalDataflowDSL.g:7186:3: ruleEDouble
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValueEDoubleParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_3_1"
    // InternalDataflowDSL.g:7195:1: rule__PrimaryExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7199:1: ( ( RULE_STRING ) )
            // InternalDataflowDSL.g:7200:2: ( RULE_STRING )
            {
            // InternalDataflowDSL.g:7200:2: ( RULE_STRING )
            // InternalDataflowDSL.g:7201:3: RULE_STRING
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__PrimaryExpression__FieldAssignment_4_1"
    // InternalDataflowDSL.g:7210:1: rule__PrimaryExpression__FieldAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__FieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7214:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7215:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7215:2: ( RULE_ID )
            // InternalDataflowDSL.g:7216:3: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getFieldIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__FieldAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0531A60400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0531A60400000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000191000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000411000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000E011000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00C0011000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0244011000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0800013000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x50000003C4006070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000003C4000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000010L});

}