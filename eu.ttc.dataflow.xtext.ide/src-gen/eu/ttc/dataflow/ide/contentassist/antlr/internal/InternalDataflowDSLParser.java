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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'and'", "'true'", "'false'", "'E'", "'e'", "'list'", "'set'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'AllInstances'", "'{'", "'}'", "'field'", "'type'", "'!'", "'::'", "'target'", "'NewInstance'", "'instanceField'", "'key'", "'Filter'", "'filterBy'", "'rejectTarget'", "'Copy'", "'copyTarget'", "'Sort'", "'sortBy'", "'Product'", "'GetFeature'", "'objectField'", "'valueField'", "'feature'", "'SetFeature'", "'value'", "'NewContainer'", "'listField'", "'containerType'", "'AddToContainer'", "'position'", "'ForEach'", "'CollectBy'", "'elementField'", "'collectBy'", "'Evaluate'", "'expression'", "'.'", "'('", "')'", "','"
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


    // $ANTLR start "entryRuleCopy"
    // InternalDataflowDSL.g:178:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:179:1: ( ruleCopy EOF )
            // InternalDataflowDSL.g:180:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalDataflowDSL.g:187:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:191:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalDataflowDSL.g:192:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalDataflowDSL.g:192:2: ( ( rule__Copy__Group__0 ) )
            // InternalDataflowDSL.g:193:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalDataflowDSL.g:194:3: ( rule__Copy__Group__0 )
            // InternalDataflowDSL.g:194:4: rule__Copy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleSort"
    // InternalDataflowDSL.g:203:1: entryRuleSort : ruleSort EOF ;
    public final void entryRuleSort() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:204:1: ( ruleSort EOF )
            // InternalDataflowDSL.g:205:1: ruleSort EOF
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
    // InternalDataflowDSL.g:212:1: ruleSort : ( ( rule__Sort__Group__0 ) ) ;
    public final void ruleSort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:216:2: ( ( ( rule__Sort__Group__0 ) ) )
            // InternalDataflowDSL.g:217:2: ( ( rule__Sort__Group__0 ) )
            {
            // InternalDataflowDSL.g:217:2: ( ( rule__Sort__Group__0 ) )
            // InternalDataflowDSL.g:218:3: ( rule__Sort__Group__0 )
            {
             before(grammarAccess.getSortAccess().getGroup()); 
            // InternalDataflowDSL.g:219:3: ( rule__Sort__Group__0 )
            // InternalDataflowDSL.g:219:4: rule__Sort__Group__0
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
    // InternalDataflowDSL.g:228:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:229:1: ( ruleProduct EOF )
            // InternalDataflowDSL.g:230:1: ruleProduct EOF
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
    // InternalDataflowDSL.g:237:1: ruleProduct : ( ( rule__Product__Group__0 ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:241:2: ( ( ( rule__Product__Group__0 ) ) )
            // InternalDataflowDSL.g:242:2: ( ( rule__Product__Group__0 ) )
            {
            // InternalDataflowDSL.g:242:2: ( ( rule__Product__Group__0 ) )
            // InternalDataflowDSL.g:243:3: ( rule__Product__Group__0 )
            {
             before(grammarAccess.getProductAccess().getGroup()); 
            // InternalDataflowDSL.g:244:3: ( rule__Product__Group__0 )
            // InternalDataflowDSL.g:244:4: rule__Product__Group__0
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
    // InternalDataflowDSL.g:253:1: entryRuleGetFeature : ruleGetFeature EOF ;
    public final void entryRuleGetFeature() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:254:1: ( ruleGetFeature EOF )
            // InternalDataflowDSL.g:255:1: ruleGetFeature EOF
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
    // InternalDataflowDSL.g:262:1: ruleGetFeature : ( ( rule__GetFeature__Group__0 ) ) ;
    public final void ruleGetFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:266:2: ( ( ( rule__GetFeature__Group__0 ) ) )
            // InternalDataflowDSL.g:267:2: ( ( rule__GetFeature__Group__0 ) )
            {
            // InternalDataflowDSL.g:267:2: ( ( rule__GetFeature__Group__0 ) )
            // InternalDataflowDSL.g:268:3: ( rule__GetFeature__Group__0 )
            {
             before(grammarAccess.getGetFeatureAccess().getGroup()); 
            // InternalDataflowDSL.g:269:3: ( rule__GetFeature__Group__0 )
            // InternalDataflowDSL.g:269:4: rule__GetFeature__Group__0
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
    // InternalDataflowDSL.g:278:1: entryRuleSetFeature : ruleSetFeature EOF ;
    public final void entryRuleSetFeature() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:279:1: ( ruleSetFeature EOF )
            // InternalDataflowDSL.g:280:1: ruleSetFeature EOF
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
    // InternalDataflowDSL.g:287:1: ruleSetFeature : ( ( rule__SetFeature__Group__0 ) ) ;
    public final void ruleSetFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:291:2: ( ( ( rule__SetFeature__Group__0 ) ) )
            // InternalDataflowDSL.g:292:2: ( ( rule__SetFeature__Group__0 ) )
            {
            // InternalDataflowDSL.g:292:2: ( ( rule__SetFeature__Group__0 ) )
            // InternalDataflowDSL.g:293:3: ( rule__SetFeature__Group__0 )
            {
             before(grammarAccess.getSetFeatureAccess().getGroup()); 
            // InternalDataflowDSL.g:294:3: ( rule__SetFeature__Group__0 )
            // InternalDataflowDSL.g:294:4: rule__SetFeature__Group__0
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
    // InternalDataflowDSL.g:303:1: entryRuleNewContainer : ruleNewContainer EOF ;
    public final void entryRuleNewContainer() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:304:1: ( ruleNewContainer EOF )
            // InternalDataflowDSL.g:305:1: ruleNewContainer EOF
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
    // InternalDataflowDSL.g:312:1: ruleNewContainer : ( ( rule__NewContainer__Group__0 ) ) ;
    public final void ruleNewContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:316:2: ( ( ( rule__NewContainer__Group__0 ) ) )
            // InternalDataflowDSL.g:317:2: ( ( rule__NewContainer__Group__0 ) )
            {
            // InternalDataflowDSL.g:317:2: ( ( rule__NewContainer__Group__0 ) )
            // InternalDataflowDSL.g:318:3: ( rule__NewContainer__Group__0 )
            {
             before(grammarAccess.getNewContainerAccess().getGroup()); 
            // InternalDataflowDSL.g:319:3: ( rule__NewContainer__Group__0 )
            // InternalDataflowDSL.g:319:4: rule__NewContainer__Group__0
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
    // InternalDataflowDSL.g:328:1: entryRuleAddToContainer : ruleAddToContainer EOF ;
    public final void entryRuleAddToContainer() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:329:1: ( ruleAddToContainer EOF )
            // InternalDataflowDSL.g:330:1: ruleAddToContainer EOF
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
    // InternalDataflowDSL.g:337:1: ruleAddToContainer : ( ( rule__AddToContainer__Group__0 ) ) ;
    public final void ruleAddToContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:341:2: ( ( ( rule__AddToContainer__Group__0 ) ) )
            // InternalDataflowDSL.g:342:2: ( ( rule__AddToContainer__Group__0 ) )
            {
            // InternalDataflowDSL.g:342:2: ( ( rule__AddToContainer__Group__0 ) )
            // InternalDataflowDSL.g:343:3: ( rule__AddToContainer__Group__0 )
            {
             before(grammarAccess.getAddToContainerAccess().getGroup()); 
            // InternalDataflowDSL.g:344:3: ( rule__AddToContainer__Group__0 )
            // InternalDataflowDSL.g:344:4: rule__AddToContainer__Group__0
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


    // $ANTLR start "entryRuleForEach"
    // InternalDataflowDSL.g:353:1: entryRuleForEach : ruleForEach EOF ;
    public final void entryRuleForEach() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:354:1: ( ruleForEach EOF )
            // InternalDataflowDSL.g:355:1: ruleForEach EOF
            {
             before(grammarAccess.getForEachRule()); 
            pushFollow(FOLLOW_1);
            ruleForEach();

            state._fsp--;

             after(grammarAccess.getForEachRule()); 
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
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // InternalDataflowDSL.g:362:1: ruleForEach : ( ( rule__ForEach__Group__0 ) ) ;
    public final void ruleForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:366:2: ( ( ( rule__ForEach__Group__0 ) ) )
            // InternalDataflowDSL.g:367:2: ( ( rule__ForEach__Group__0 ) )
            {
            // InternalDataflowDSL.g:367:2: ( ( rule__ForEach__Group__0 ) )
            // InternalDataflowDSL.g:368:3: ( rule__ForEach__Group__0 )
            {
             before(grammarAccess.getForEachAccess().getGroup()); 
            // InternalDataflowDSL.g:369:3: ( rule__ForEach__Group__0 )
            // InternalDataflowDSL.g:369:4: rule__ForEach__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleCollectBy"
    // InternalDataflowDSL.g:378:1: entryRuleCollectBy : ruleCollectBy EOF ;
    public final void entryRuleCollectBy() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:379:1: ( ruleCollectBy EOF )
            // InternalDataflowDSL.g:380:1: ruleCollectBy EOF
            {
             before(grammarAccess.getCollectByRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectBy();

            state._fsp--;

             after(grammarAccess.getCollectByRule()); 
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
    // $ANTLR end "entryRuleCollectBy"


    // $ANTLR start "ruleCollectBy"
    // InternalDataflowDSL.g:387:1: ruleCollectBy : ( ( rule__CollectBy__Group__0 ) ) ;
    public final void ruleCollectBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:391:2: ( ( ( rule__CollectBy__Group__0 ) ) )
            // InternalDataflowDSL.g:392:2: ( ( rule__CollectBy__Group__0 ) )
            {
            // InternalDataflowDSL.g:392:2: ( ( rule__CollectBy__Group__0 ) )
            // InternalDataflowDSL.g:393:3: ( rule__CollectBy__Group__0 )
            {
             before(grammarAccess.getCollectByAccess().getGroup()); 
            // InternalDataflowDSL.g:394:3: ( rule__CollectBy__Group__0 )
            // InternalDataflowDSL.g:394:4: rule__CollectBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectBy"


    // $ANTLR start "entryRuleEvaluate"
    // InternalDataflowDSL.g:403:1: entryRuleEvaluate : ruleEvaluate EOF ;
    public final void entryRuleEvaluate() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:404:1: ( ruleEvaluate EOF )
            // InternalDataflowDSL.g:405:1: ruleEvaluate EOF
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
    // InternalDataflowDSL.g:412:1: ruleEvaluate : ( ( rule__Evaluate__Group__0 ) ) ;
    public final void ruleEvaluate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:416:2: ( ( ( rule__Evaluate__Group__0 ) ) )
            // InternalDataflowDSL.g:417:2: ( ( rule__Evaluate__Group__0 ) )
            {
            // InternalDataflowDSL.g:417:2: ( ( rule__Evaluate__Group__0 ) )
            // InternalDataflowDSL.g:418:3: ( rule__Evaluate__Group__0 )
            {
             before(grammarAccess.getEvaluateAccess().getGroup()); 
            // InternalDataflowDSL.g:419:3: ( rule__Evaluate__Group__0 )
            // InternalDataflowDSL.g:419:4: rule__Evaluate__Group__0
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
    // InternalDataflowDSL.g:428:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:429:1: ( ruleOrExpression EOF )
            // InternalDataflowDSL.g:430:1: ruleOrExpression EOF
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
    // InternalDataflowDSL.g:437:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:441:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:442:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:442:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalDataflowDSL.g:443:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:444:3: ( rule__OrExpression__Group__0 )
            // InternalDataflowDSL.g:444:4: rule__OrExpression__Group__0
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
    // InternalDataflowDSL.g:453:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:454:1: ( ruleAndExpression EOF )
            // InternalDataflowDSL.g:455:1: ruleAndExpression EOF
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
    // InternalDataflowDSL.g:462:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:466:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:467:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:467:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalDataflowDSL.g:468:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:469:3: ( rule__AndExpression__Group__0 )
            // InternalDataflowDSL.g:469:4: rule__AndExpression__Group__0
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
    // InternalDataflowDSL.g:478:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:479:1: ( ruleEqualityExpression EOF )
            // InternalDataflowDSL.g:480:1: ruleEqualityExpression EOF
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
    // InternalDataflowDSL.g:487:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:491:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:492:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:492:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalDataflowDSL.g:493:3: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:494:3: ( rule__EqualityExpression__Group__0 )
            // InternalDataflowDSL.g:494:4: rule__EqualityExpression__Group__0
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
    // InternalDataflowDSL.g:503:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:504:1: ( ruleRelationalExpression EOF )
            // InternalDataflowDSL.g:505:1: ruleRelationalExpression EOF
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
    // InternalDataflowDSL.g:512:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:516:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:517:2: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:517:2: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalDataflowDSL.g:518:3: ( rule__RelationalExpression__Group__0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:519:3: ( rule__RelationalExpression__Group__0 )
            // InternalDataflowDSL.g:519:4: rule__RelationalExpression__Group__0
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
    // InternalDataflowDSL.g:528:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:529:1: ( ruleAdditiveExpression EOF )
            // InternalDataflowDSL.g:530:1: ruleAdditiveExpression EOF
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
    // InternalDataflowDSL.g:537:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:541:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:542:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:542:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalDataflowDSL.g:543:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:544:3: ( rule__AdditiveExpression__Group__0 )
            // InternalDataflowDSL.g:544:4: rule__AdditiveExpression__Group__0
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
    // InternalDataflowDSL.g:553:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:554:1: ( ruleMultiplicativeExpression EOF )
            // InternalDataflowDSL.g:555:1: ruleMultiplicativeExpression EOF
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
    // InternalDataflowDSL.g:562:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:566:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:567:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:567:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalDataflowDSL.g:568:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:569:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalDataflowDSL.g:569:4: rule__MultiplicativeExpression__Group__0
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
    // InternalDataflowDSL.g:578:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:579:1: ( ruleUnaryExpression EOF )
            // InternalDataflowDSL.g:580:1: ruleUnaryExpression EOF
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
    // InternalDataflowDSL.g:587:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:591:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalDataflowDSL.g:592:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalDataflowDSL.g:592:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalDataflowDSL.g:593:3: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // InternalDataflowDSL.g:594:3: ( rule__UnaryExpression__Alternatives )
            // InternalDataflowDSL.g:594:4: rule__UnaryExpression__Alternatives
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


    // $ANTLR start "entryRuleFeatureCallExpression"
    // InternalDataflowDSL.g:603:1: entryRuleFeatureCallExpression : ruleFeatureCallExpression EOF ;
    public final void entryRuleFeatureCallExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:604:1: ( ruleFeatureCallExpression EOF )
            // InternalDataflowDSL.g:605:1: ruleFeatureCallExpression EOF
            {
             before(grammarAccess.getFeatureCallExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureCallExpression();

            state._fsp--;

             after(grammarAccess.getFeatureCallExpressionRule()); 
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
    // $ANTLR end "entryRuleFeatureCallExpression"


    // $ANTLR start "ruleFeatureCallExpression"
    // InternalDataflowDSL.g:612:1: ruleFeatureCallExpression : ( ( rule__FeatureCallExpression__Group__0 ) ) ;
    public final void ruleFeatureCallExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:616:2: ( ( ( rule__FeatureCallExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:617:2: ( ( rule__FeatureCallExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:617:2: ( ( rule__FeatureCallExpression__Group__0 ) )
            // InternalDataflowDSL.g:618:3: ( rule__FeatureCallExpression__Group__0 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:619:3: ( rule__FeatureCallExpression__Group__0 )
            // InternalDataflowDSL.g:619:4: rule__FeatureCallExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureCallExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureCallExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalDataflowDSL.g:628:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:629:1: ( rulePrimaryExpression EOF )
            // InternalDataflowDSL.g:630:1: rulePrimaryExpression EOF
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
    // InternalDataflowDSL.g:637:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:641:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalDataflowDSL.g:642:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalDataflowDSL.g:642:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalDataflowDSL.g:643:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalDataflowDSL.g:644:3: ( rule__PrimaryExpression__Alternatives )
            // InternalDataflowDSL.g:644:4: rule__PrimaryExpression__Alternatives
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
    // InternalDataflowDSL.g:653:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:654:1: ( ruleEInt EOF )
            // InternalDataflowDSL.g:655:1: ruleEInt EOF
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
    // InternalDataflowDSL.g:662:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:666:2: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:667:2: ( RULE_INT )
            {
            // InternalDataflowDSL.g:667:2: ( RULE_INT )
            // InternalDataflowDSL.g:668:3: RULE_INT
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
    // InternalDataflowDSL.g:678:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:679:1: ( ruleEBoolean EOF )
            // InternalDataflowDSL.g:680:1: ruleEBoolean EOF
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
    // InternalDataflowDSL.g:687:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:691:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalDataflowDSL.g:692:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalDataflowDSL.g:692:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalDataflowDSL.g:693:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalDataflowDSL.g:694:3: ( rule__EBoolean__Alternatives )
            // InternalDataflowDSL.g:694:4: rule__EBoolean__Alternatives
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
    // InternalDataflowDSL.g:703:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:704:1: ( ruleEDouble EOF )
            // InternalDataflowDSL.g:705:1: ruleEDouble EOF
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
    // InternalDataflowDSL.g:712:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:716:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalDataflowDSL.g:717:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalDataflowDSL.g:717:2: ( ( rule__EDouble__Group__0 ) )
            // InternalDataflowDSL.g:718:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalDataflowDSL.g:719:3: ( rule__EDouble__Group__0 )
            // InternalDataflowDSL.g:719:4: rule__EDouble__Group__0
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
    // InternalDataflowDSL.g:728:1: ruleContainerType : ( ( rule__ContainerType__Alternatives ) ) ;
    public final void ruleContainerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:732:1: ( ( ( rule__ContainerType__Alternatives ) ) )
            // InternalDataflowDSL.g:733:2: ( ( rule__ContainerType__Alternatives ) )
            {
            // InternalDataflowDSL.g:733:2: ( ( rule__ContainerType__Alternatives ) )
            // InternalDataflowDSL.g:734:3: ( rule__ContainerType__Alternatives )
            {
             before(grammarAccess.getContainerTypeAccess().getAlternatives()); 
            // InternalDataflowDSL.g:735:3: ( rule__ContainerType__Alternatives )
            // InternalDataflowDSL.g:735:4: rule__ContainerType__Alternatives
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
    // InternalDataflowDSL.g:744:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:748:1: ( ( ( 'or' ) ) )
            // InternalDataflowDSL.g:749:2: ( ( 'or' ) )
            {
            // InternalDataflowDSL.g:749:2: ( ( 'or' ) )
            // InternalDataflowDSL.g:750:3: ( 'or' )
            {
             before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalDataflowDSL.g:751:3: ( 'or' )
            // InternalDataflowDSL.g:751:4: 'or'
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
    // InternalDataflowDSL.g:760:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:764:1: ( ( ( 'and' ) ) )
            // InternalDataflowDSL.g:765:2: ( ( 'and' ) )
            {
            // InternalDataflowDSL.g:765:2: ( ( 'and' ) )
            // InternalDataflowDSL.g:766:3: ( 'and' )
            {
             before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalDataflowDSL.g:767:3: ( 'and' )
            // InternalDataflowDSL.g:767:4: 'and'
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
    // InternalDataflowDSL.g:776:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:780:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:781:2: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:781:2: ( ( rule__EqualityOperator__Alternatives ) )
            // InternalDataflowDSL.g:782:3: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:783:3: ( rule__EqualityOperator__Alternatives )
            // InternalDataflowDSL.g:783:4: rule__EqualityOperator__Alternatives
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
    // InternalDataflowDSL.g:792:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:796:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:797:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:797:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalDataflowDSL.g:798:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:799:3: ( rule__RelationalOperator__Alternatives )
            // InternalDataflowDSL.g:799:4: rule__RelationalOperator__Alternatives
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
    // InternalDataflowDSL.g:808:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:812:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:813:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:813:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalDataflowDSL.g:814:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:815:3: ( rule__AdditiveOperator__Alternatives )
            // InternalDataflowDSL.g:815:4: rule__AdditiveOperator__Alternatives
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
    // InternalDataflowDSL.g:824:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:828:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:829:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:829:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalDataflowDSL.g:830:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:831:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalDataflowDSL.g:831:4: rule__MultiplicativeOperator__Alternatives
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
    // InternalDataflowDSL.g:840:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:844:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:845:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:845:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalDataflowDSL.g:846:3: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:847:3: ( rule__UnaryOperator__Alternatives )
            // InternalDataflowDSL.g:847:4: rule__UnaryOperator__Alternatives
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
    // InternalDataflowDSL.g:855:1: rule__Element__Alternatives : ( ( ruleAllInstances ) | ( ruleNewInstance ) | ( ruleFilter ) | ( ruleSort ) | ( ruleCopy ) | ( ruleProduct ) | ( ruleGetFeature ) | ( ruleSetFeature ) | ( ruleNewContainer ) | ( ruleAddToContainer ) | ( ruleForEach ) | ( ruleCollectBy ) | ( ruleEvaluate ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:859:1: ( ( ruleAllInstances ) | ( ruleNewInstance ) | ( ruleFilter ) | ( ruleSort ) | ( ruleCopy ) | ( ruleProduct ) | ( ruleGetFeature ) | ( ruleSetFeature ) | ( ruleNewContainer ) | ( ruleAddToContainer ) | ( ruleForEach ) | ( ruleCollectBy ) | ( ruleEvaluate ) )
            int alt1=13;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            case 47:
                {
                alt1=4;
                }
                break;
            case 45:
                {
                alt1=5;
                }
                break;
            case 49:
                {
                alt1=6;
                }
                break;
            case 50:
                {
                alt1=7;
                }
                break;
            case 54:
                {
                alt1=8;
                }
                break;
            case 56:
                {
                alt1=9;
                }
                break;
            case 59:
                {
                alt1=10;
                }
                break;
            case 61:
                {
                alt1=11;
                }
                break;
            case 62:
                {
                alt1=12;
                }
                break;
            case 65:
                {
                alt1=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDataflowDSL.g:860:2: ( ruleAllInstances )
                    {
                    // InternalDataflowDSL.g:860:2: ( ruleAllInstances )
                    // InternalDataflowDSL.g:861:3: ruleAllInstances
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
                    // InternalDataflowDSL.g:866:2: ( ruleNewInstance )
                    {
                    // InternalDataflowDSL.g:866:2: ( ruleNewInstance )
                    // InternalDataflowDSL.g:867:3: ruleNewInstance
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
                    // InternalDataflowDSL.g:872:2: ( ruleFilter )
                    {
                    // InternalDataflowDSL.g:872:2: ( ruleFilter )
                    // InternalDataflowDSL.g:873:3: ruleFilter
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
                    // InternalDataflowDSL.g:878:2: ( ruleSort )
                    {
                    // InternalDataflowDSL.g:878:2: ( ruleSort )
                    // InternalDataflowDSL.g:879:3: ruleSort
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
                    // InternalDataflowDSL.g:884:2: ( ruleCopy )
                    {
                    // InternalDataflowDSL.g:884:2: ( ruleCopy )
                    // InternalDataflowDSL.g:885:3: ruleCopy
                    {
                     before(grammarAccess.getElementAccess().getCopyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCopyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataflowDSL.g:890:2: ( ruleProduct )
                    {
                    // InternalDataflowDSL.g:890:2: ( ruleProduct )
                    // InternalDataflowDSL.g:891:3: ruleProduct
                    {
                     before(grammarAccess.getElementAccess().getProductParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleProduct();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getProductParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataflowDSL.g:896:2: ( ruleGetFeature )
                    {
                    // InternalDataflowDSL.g:896:2: ( ruleGetFeature )
                    // InternalDataflowDSL.g:897:3: ruleGetFeature
                    {
                     before(grammarAccess.getElementAccess().getGetFeatureParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleGetFeature();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getGetFeatureParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataflowDSL.g:902:2: ( ruleSetFeature )
                    {
                    // InternalDataflowDSL.g:902:2: ( ruleSetFeature )
                    // InternalDataflowDSL.g:903:3: ruleSetFeature
                    {
                     before(grammarAccess.getElementAccess().getSetFeatureParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSetFeature();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSetFeatureParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataflowDSL.g:908:2: ( ruleNewContainer )
                    {
                    // InternalDataflowDSL.g:908:2: ( ruleNewContainer )
                    // InternalDataflowDSL.g:909:3: ruleNewContainer
                    {
                     before(grammarAccess.getElementAccess().getNewContainerParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleNewContainer();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getNewContainerParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataflowDSL.g:914:2: ( ruleAddToContainer )
                    {
                    // InternalDataflowDSL.g:914:2: ( ruleAddToContainer )
                    // InternalDataflowDSL.g:915:3: ruleAddToContainer
                    {
                     before(grammarAccess.getElementAccess().getAddToContainerParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleAddToContainer();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getAddToContainerParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataflowDSL.g:920:2: ( ruleForEach )
                    {
                    // InternalDataflowDSL.g:920:2: ( ruleForEach )
                    // InternalDataflowDSL.g:921:3: ruleForEach
                    {
                     before(grammarAccess.getElementAccess().getForEachParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleForEach();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getForEachParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDataflowDSL.g:926:2: ( ruleCollectBy )
                    {
                    // InternalDataflowDSL.g:926:2: ( ruleCollectBy )
                    // InternalDataflowDSL.g:927:3: ruleCollectBy
                    {
                     before(grammarAccess.getElementAccess().getCollectByParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleCollectBy();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCollectByParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDataflowDSL.g:932:2: ( ruleEvaluate )
                    {
                    // InternalDataflowDSL.g:932:2: ( ruleEvaluate )
                    // InternalDataflowDSL.g:933:3: ruleEvaluate
                    {
                     before(grammarAccess.getElementAccess().getEvaluateParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleEvaluate();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEvaluateParserRuleCall_12()); 

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
    // InternalDataflowDSL.g:942:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleFeatureCallExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:946:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleFeatureCallExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26||LA2_0==30) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=13 && LA2_0<=14)||(LA2_0>=67 && LA2_0<=68)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataflowDSL.g:947:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:947:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:948:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:949:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalDataflowDSL.g:949:4: rule__UnaryExpression__Group_0__0
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
                    // InternalDataflowDSL.g:953:2: ( ruleFeatureCallExpression )
                    {
                    // InternalDataflowDSL.g:953:2: ( ruleFeatureCallExpression )
                    // InternalDataflowDSL.g:954:3: ruleFeatureCallExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getFeatureCallExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureCallExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getFeatureCallExpressionParserRuleCall_1()); 

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
    // InternalDataflowDSL.g:963:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:967:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=11 && LA3_1<=12)||(LA3_1>=19 && LA3_1<=29)||LA3_1==33||LA3_1==35||LA3_1==38||LA3_1==44||LA3_1==53||LA3_1==60||(LA3_1>=69 && LA3_1<=70)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==67) ) {
                    int LA3_8 = input.LA(3);

                    if ( (LA3_8==RULE_ID) ) {
                        alt3=1;
                    }
                    else if ( (LA3_8==RULE_INT) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 8, input);

                        throw nvae;
                    }
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
            case 67:
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
            case 68:
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
                    // InternalDataflowDSL.g:968:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:968:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:969:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:970:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalDataflowDSL.g:970:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalDataflowDSL.g:974:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalDataflowDSL.g:974:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalDataflowDSL.g:975:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalDataflowDSL.g:976:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalDataflowDSL.g:976:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalDataflowDSL.g:980:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalDataflowDSL.g:980:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalDataflowDSL.g:981:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalDataflowDSL.g:982:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalDataflowDSL.g:982:4: rule__PrimaryExpression__Group_2__0
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
                    // InternalDataflowDSL.g:986:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalDataflowDSL.g:986:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalDataflowDSL.g:987:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalDataflowDSL.g:988:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalDataflowDSL.g:988:4: rule__PrimaryExpression__Group_3__0
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
                    // InternalDataflowDSL.g:992:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalDataflowDSL.g:992:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalDataflowDSL.g:993:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalDataflowDSL.g:994:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalDataflowDSL.g:994:4: rule__PrimaryExpression__Group_4__0
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
                    // InternalDataflowDSL.g:998:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // InternalDataflowDSL.g:998:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // InternalDataflowDSL.g:999:3: ( rule__PrimaryExpression__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    // InternalDataflowDSL.g:1000:3: ( rule__PrimaryExpression__Group_5__0 )
                    // InternalDataflowDSL.g:1000:4: rule__PrimaryExpression__Group_5__0
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
    // InternalDataflowDSL.g:1008:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1012:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalDataflowDSL.g:1013:2: ( 'true' )
                    {
                    // InternalDataflowDSL.g:1013:2: ( 'true' )
                    // InternalDataflowDSL.g:1014:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1019:2: ( 'false' )
                    {
                    // InternalDataflowDSL.g:1019:2: ( 'false' )
                    // InternalDataflowDSL.g:1020:3: 'false'
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
    // InternalDataflowDSL.g:1029:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1033:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalDataflowDSL.g:1034:2: ( 'E' )
                    {
                    // InternalDataflowDSL.g:1034:2: ( 'E' )
                    // InternalDataflowDSL.g:1035:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1040:2: ( 'e' )
                    {
                    // InternalDataflowDSL.g:1040:2: ( 'e' )
                    // InternalDataflowDSL.g:1041:3: 'e'
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
    // InternalDataflowDSL.g:1050:1: rule__ContainerType__Alternatives : ( ( ( 'list' ) ) | ( ( 'set' ) ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1054:1: ( ( ( 'list' ) ) | ( ( 'set' ) ) )
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
                    // InternalDataflowDSL.g:1055:2: ( ( 'list' ) )
                    {
                    // InternalDataflowDSL.g:1055:2: ( ( 'list' ) )
                    // InternalDataflowDSL.g:1056:3: ( 'list' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1057:3: ( 'list' )
                    // InternalDataflowDSL.g:1057:4: 'list'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1061:2: ( ( 'set' ) )
                    {
                    // InternalDataflowDSL.g:1061:2: ( ( 'set' ) )
                    // InternalDataflowDSL.g:1062:3: ( 'set' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1063:3: ( 'set' )
                    // InternalDataflowDSL.g:1063:4: 'set'
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
    // InternalDataflowDSL.g:1071:1: rule__EqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1075:1: ( ( ( '=' ) ) | ( ( '!=' ) ) )
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
                    // InternalDataflowDSL.g:1076:2: ( ( '=' ) )
                    {
                    // InternalDataflowDSL.g:1076:2: ( ( '=' ) )
                    // InternalDataflowDSL.g:1077:3: ( '=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1078:3: ( '=' )
                    // InternalDataflowDSL.g:1078:4: '='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1082:2: ( ( '!=' ) )
                    {
                    // InternalDataflowDSL.g:1082:2: ( ( '!=' ) )
                    // InternalDataflowDSL.g:1083:3: ( '!=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1084:3: ( '!=' )
                    // InternalDataflowDSL.g:1084:4: '!='
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
    // InternalDataflowDSL.g:1092:1: rule__RelationalOperator__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1096:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
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
                    // InternalDataflowDSL.g:1097:2: ( ( '>' ) )
                    {
                    // InternalDataflowDSL.g:1097:2: ( ( '>' ) )
                    // InternalDataflowDSL.g:1098:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1099:3: ( '>' )
                    // InternalDataflowDSL.g:1099:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1103:2: ( ( '>=' ) )
                    {
                    // InternalDataflowDSL.g:1103:2: ( ( '>=' ) )
                    // InternalDataflowDSL.g:1104:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1105:3: ( '>=' )
                    // InternalDataflowDSL.g:1105:4: '>='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1109:2: ( ( '<' ) )
                    {
                    // InternalDataflowDSL.g:1109:2: ( ( '<' ) )
                    // InternalDataflowDSL.g:1110:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:1111:3: ( '<' )
                    // InternalDataflowDSL.g:1111:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1115:2: ( ( '<=' ) )
                    {
                    // InternalDataflowDSL.g:1115:2: ( ( '<=' ) )
                    // InternalDataflowDSL.g:1116:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3()); 
                    // InternalDataflowDSL.g:1117:3: ( '<=' )
                    // InternalDataflowDSL.g:1117:4: '<='
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
    // InternalDataflowDSL.g:1125:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1129:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // InternalDataflowDSL.g:1130:2: ( ( '+' ) )
                    {
                    // InternalDataflowDSL.g:1130:2: ( ( '+' ) )
                    // InternalDataflowDSL.g:1131:3: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1132:3: ( '+' )
                    // InternalDataflowDSL.g:1132:4: '+'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1136:2: ( ( '-' ) )
                    {
                    // InternalDataflowDSL.g:1136:2: ( ( '-' ) )
                    // InternalDataflowDSL.g:1137:3: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1138:3: ( '-' )
                    // InternalDataflowDSL.g:1138:4: '-'
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
    // InternalDataflowDSL.g:1146:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1150:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
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
                    // InternalDataflowDSL.g:1151:2: ( ( '*' ) )
                    {
                    // InternalDataflowDSL.g:1151:2: ( ( '*' ) )
                    // InternalDataflowDSL.g:1152:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1153:3: ( '*' )
                    // InternalDataflowDSL.g:1153:4: '*'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1157:2: ( ( '/' ) )
                    {
                    // InternalDataflowDSL.g:1157:2: ( ( '/' ) )
                    // InternalDataflowDSL.g:1158:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1159:3: ( '/' )
                    // InternalDataflowDSL.g:1159:4: '/'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1163:2: ( ( '%' ) )
                    {
                    // InternalDataflowDSL.g:1163:2: ( ( '%' ) )
                    // InternalDataflowDSL.g:1164:3: ( '%' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:1165:3: ( '%' )
                    // InternalDataflowDSL.g:1165:4: '%'
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
    // InternalDataflowDSL.g:1173:1: rule__UnaryOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1177:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataflowDSL.g:1178:2: ( ( 'not' ) )
                    {
                    // InternalDataflowDSL.g:1178:2: ( ( 'not' ) )
                    // InternalDataflowDSL.g:1179:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1180:3: ( 'not' )
                    // InternalDataflowDSL.g:1180:4: 'not'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1184:2: ( ( '-' ) )
                    {
                    // InternalDataflowDSL.g:1184:2: ( ( '-' ) )
                    // InternalDataflowDSL.g:1185:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1186:3: ( '-' )
                    // InternalDataflowDSL.g:1186:4: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1()); 

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
    // InternalDataflowDSL.g:1194:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1198:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDataflowDSL.g:1199:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDataflowDSL.g:1206:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1210:1: ( ( () ) )
            // InternalDataflowDSL.g:1211:1: ( () )
            {
            // InternalDataflowDSL.g:1211:1: ( () )
            // InternalDataflowDSL.g:1212:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalDataflowDSL.g:1213:2: ()
            // InternalDataflowDSL.g:1213:3: 
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
    // InternalDataflowDSL.g:1221:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1225:1: ( rule__Model__Group__1__Impl )
            // InternalDataflowDSL.g:1226:2: rule__Model__Group__1__Impl
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
    // InternalDataflowDSL.g:1232:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1236:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDataflowDSL.g:1237:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDataflowDSL.g:1237:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDataflowDSL.g:1238:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDataflowDSL.g:1239:2: ( rule__Model__ElementsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31||LA12_0==39||LA12_0==42||LA12_0==45||LA12_0==47||(LA12_0>=49 && LA12_0<=50)||LA12_0==54||LA12_0==56||LA12_0==59||(LA12_0>=61 && LA12_0<=62)||LA12_0==65) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDataflowDSL.g:1239:3: rule__Model__ElementsAssignment_1
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
    // InternalDataflowDSL.g:1248:1: rule__AllInstances__Group__0 : rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 ;
    public final void rule__AllInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1252:1: ( rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 )
            // InternalDataflowDSL.g:1253:2: rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1
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
    // InternalDataflowDSL.g:1260:1: rule__AllInstances__Group__0__Impl : ( 'AllInstances' ) ;
    public final void rule__AllInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1264:1: ( ( 'AllInstances' ) )
            // InternalDataflowDSL.g:1265:1: ( 'AllInstances' )
            {
            // InternalDataflowDSL.g:1265:1: ( 'AllInstances' )
            // InternalDataflowDSL.g:1266:2: 'AllInstances'
            {
             before(grammarAccess.getAllInstancesAccess().getAllInstancesKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDataflowDSL.g:1275:1: rule__AllInstances__Group__1 : rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2 ;
    public final void rule__AllInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1279:1: ( rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2 )
            // InternalDataflowDSL.g:1280:2: rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2
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
    // InternalDataflowDSL.g:1287:1: rule__AllInstances__Group__1__Impl : ( ( rule__AllInstances__NameAssignment_1 ) ) ;
    public final void rule__AllInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1291:1: ( ( ( rule__AllInstances__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:1292:1: ( ( rule__AllInstances__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:1292:1: ( ( rule__AllInstances__NameAssignment_1 ) )
            // InternalDataflowDSL.g:1293:2: ( rule__AllInstances__NameAssignment_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:1294:2: ( rule__AllInstances__NameAssignment_1 )
            // InternalDataflowDSL.g:1294:3: rule__AllInstances__NameAssignment_1
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
    // InternalDataflowDSL.g:1302:1: rule__AllInstances__Group__2 : rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3 ;
    public final void rule__AllInstances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1306:1: ( rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3 )
            // InternalDataflowDSL.g:1307:2: rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3
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
    // InternalDataflowDSL.g:1314:1: rule__AllInstances__Group__2__Impl : ( '{' ) ;
    public final void rule__AllInstances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1318:1: ( ( '{' ) )
            // InternalDataflowDSL.g:1319:1: ( '{' )
            {
            // InternalDataflowDSL.g:1319:1: ( '{' )
            // InternalDataflowDSL.g:1320:2: '{'
            {
             before(grammarAccess.getAllInstancesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:1329:1: rule__AllInstances__Group__3 : rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4 ;
    public final void rule__AllInstances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1333:1: ( rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4 )
            // InternalDataflowDSL.g:1334:2: rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4
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
    // InternalDataflowDSL.g:1341:1: rule__AllInstances__Group__3__Impl : ( ( rule__AllInstances__Group_3__0 )? ) ;
    public final void rule__AllInstances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1345:1: ( ( ( rule__AllInstances__Group_3__0 )? ) )
            // InternalDataflowDSL.g:1346:1: ( ( rule__AllInstances__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:1346:1: ( ( rule__AllInstances__Group_3__0 )? )
            // InternalDataflowDSL.g:1347:2: ( rule__AllInstances__Group_3__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_3()); 
            // InternalDataflowDSL.g:1348:2: ( rule__AllInstances__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataflowDSL.g:1348:3: rule__AllInstances__Group_3__0
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
    // InternalDataflowDSL.g:1356:1: rule__AllInstances__Group__4 : rule__AllInstances__Group__4__Impl rule__AllInstances__Group__5 ;
    public final void rule__AllInstances__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1360:1: ( rule__AllInstances__Group__4__Impl rule__AllInstances__Group__5 )
            // InternalDataflowDSL.g:1361:2: rule__AllInstances__Group__4__Impl rule__AllInstances__Group__5
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
    // InternalDataflowDSL.g:1368:1: rule__AllInstances__Group__4__Impl : ( ( rule__AllInstances__Group_4__0 )? ) ;
    public final void rule__AllInstances__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1372:1: ( ( ( rule__AllInstances__Group_4__0 )? ) )
            // InternalDataflowDSL.g:1373:1: ( ( rule__AllInstances__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:1373:1: ( ( rule__AllInstances__Group_4__0 )? )
            // InternalDataflowDSL.g:1374:2: ( rule__AllInstances__Group_4__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_4()); 
            // InternalDataflowDSL.g:1375:2: ( rule__AllInstances__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataflowDSL.g:1375:3: rule__AllInstances__Group_4__0
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
    // InternalDataflowDSL.g:1383:1: rule__AllInstances__Group__5 : rule__AllInstances__Group__5__Impl rule__AllInstances__Group__6 ;
    public final void rule__AllInstances__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1387:1: ( rule__AllInstances__Group__5__Impl rule__AllInstances__Group__6 )
            // InternalDataflowDSL.g:1388:2: rule__AllInstances__Group__5__Impl rule__AllInstances__Group__6
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
    // InternalDataflowDSL.g:1395:1: rule__AllInstances__Group__5__Impl : ( ( rule__AllInstances__Group_5__0 )? ) ;
    public final void rule__AllInstances__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1399:1: ( ( ( rule__AllInstances__Group_5__0 )? ) )
            // InternalDataflowDSL.g:1400:1: ( ( rule__AllInstances__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:1400:1: ( ( rule__AllInstances__Group_5__0 )? )
            // InternalDataflowDSL.g:1401:2: ( rule__AllInstances__Group_5__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_5()); 
            // InternalDataflowDSL.g:1402:2: ( rule__AllInstances__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataflowDSL.g:1402:3: rule__AllInstances__Group_5__0
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
    // InternalDataflowDSL.g:1410:1: rule__AllInstances__Group__6 : rule__AllInstances__Group__6__Impl ;
    public final void rule__AllInstances__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1414:1: ( rule__AllInstances__Group__6__Impl )
            // InternalDataflowDSL.g:1415:2: rule__AllInstances__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__6__Impl();

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
    // InternalDataflowDSL.g:1421:1: rule__AllInstances__Group__6__Impl : ( '}' ) ;
    public final void rule__AllInstances__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1425:1: ( ( '}' ) )
            // InternalDataflowDSL.g:1426:1: ( '}' )
            {
            // InternalDataflowDSL.g:1426:1: ( '}' )
            // InternalDataflowDSL.g:1427:2: '}'
            {
             before(grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__AllInstances__Group_3__0"
    // InternalDataflowDSL.g:1437:1: rule__AllInstances__Group_3__0 : rule__AllInstances__Group_3__0__Impl rule__AllInstances__Group_3__1 ;
    public final void rule__AllInstances__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1441:1: ( rule__AllInstances__Group_3__0__Impl rule__AllInstances__Group_3__1 )
            // InternalDataflowDSL.g:1442:2: rule__AllInstances__Group_3__0__Impl rule__AllInstances__Group_3__1
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
    // InternalDataflowDSL.g:1449:1: rule__AllInstances__Group_3__0__Impl : ( 'field' ) ;
    public final void rule__AllInstances__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1453:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:1454:1: ( 'field' )
            {
            // InternalDataflowDSL.g:1454:1: ( 'field' )
            // InternalDataflowDSL.g:1455:2: 'field'
            {
             before(grammarAccess.getAllInstancesAccess().getFieldKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDataflowDSL.g:1464:1: rule__AllInstances__Group_3__1 : rule__AllInstances__Group_3__1__Impl ;
    public final void rule__AllInstances__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1468:1: ( rule__AllInstances__Group_3__1__Impl )
            // InternalDataflowDSL.g:1469:2: rule__AllInstances__Group_3__1__Impl
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
    // InternalDataflowDSL.g:1475:1: rule__AllInstances__Group_3__1__Impl : ( ( rule__AllInstances__FieldAssignment_3_1 ) ) ;
    public final void rule__AllInstances__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1479:1: ( ( ( rule__AllInstances__FieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:1480:1: ( ( rule__AllInstances__FieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:1480:1: ( ( rule__AllInstances__FieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:1481:2: ( rule__AllInstances__FieldAssignment_3_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:1482:2: ( rule__AllInstances__FieldAssignment_3_1 )
            // InternalDataflowDSL.g:1482:3: rule__AllInstances__FieldAssignment_3_1
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
    // InternalDataflowDSL.g:1491:1: rule__AllInstances__Group_4__0 : rule__AllInstances__Group_4__0__Impl rule__AllInstances__Group_4__1 ;
    public final void rule__AllInstances__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1495:1: ( rule__AllInstances__Group_4__0__Impl rule__AllInstances__Group_4__1 )
            // InternalDataflowDSL.g:1496:2: rule__AllInstances__Group_4__0__Impl rule__AllInstances__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDataflowDSL.g:1503:1: rule__AllInstances__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__AllInstances__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1507:1: ( ( 'type' ) )
            // InternalDataflowDSL.g:1508:1: ( 'type' )
            {
            // InternalDataflowDSL.g:1508:1: ( 'type' )
            // InternalDataflowDSL.g:1509:2: 'type'
            {
             before(grammarAccess.getAllInstancesAccess().getTypeKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTypeKeyword_4_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:1518:1: rule__AllInstances__Group_4__1 : rule__AllInstances__Group_4__1__Impl rule__AllInstances__Group_4__2 ;
    public final void rule__AllInstances__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1522:1: ( rule__AllInstances__Group_4__1__Impl rule__AllInstances__Group_4__2 )
            // InternalDataflowDSL.g:1523:2: rule__AllInstances__Group_4__1__Impl rule__AllInstances__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4__2();

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
    // InternalDataflowDSL.g:1530:1: rule__AllInstances__Group_4__1__Impl : ( ( rule__AllInstances__Group_4_1__0 )? ) ;
    public final void rule__AllInstances__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1534:1: ( ( ( rule__AllInstances__Group_4_1__0 )? ) )
            // InternalDataflowDSL.g:1535:1: ( ( rule__AllInstances__Group_4_1__0 )? )
            {
            // InternalDataflowDSL.g:1535:1: ( ( rule__AllInstances__Group_4_1__0 )? )
            // InternalDataflowDSL.g:1536:2: ( rule__AllInstances__Group_4_1__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_4_1()); 
            // InternalDataflowDSL.g:1537:2: ( rule__AllInstances__Group_4_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==36) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalDataflowDSL.g:1537:3: rule__AllInstances__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllInstancesAccess().getGroup_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AllInstances__Group_4__2"
    // InternalDataflowDSL.g:1545:1: rule__AllInstances__Group_4__2 : rule__AllInstances__Group_4__2__Impl rule__AllInstances__Group_4__3 ;
    public final void rule__AllInstances__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1549:1: ( rule__AllInstances__Group_4__2__Impl rule__AllInstances__Group_4__3 )
            // InternalDataflowDSL.g:1550:2: rule__AllInstances__Group_4__2__Impl rule__AllInstances__Group_4__3
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4__3();

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
    // $ANTLR end "rule__AllInstances__Group_4__2"


    // $ANTLR start "rule__AllInstances__Group_4__2__Impl"
    // InternalDataflowDSL.g:1557:1: rule__AllInstances__Group_4__2__Impl : ( ( rule__AllInstances__Group_4_2__0 )? ) ;
    public final void rule__AllInstances__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1561:1: ( ( ( rule__AllInstances__Group_4_2__0 )? ) )
            // InternalDataflowDSL.g:1562:1: ( ( rule__AllInstances__Group_4_2__0 )? )
            {
            // InternalDataflowDSL.g:1562:1: ( ( rule__AllInstances__Group_4_2__0 )? )
            // InternalDataflowDSL.g:1563:2: ( rule__AllInstances__Group_4_2__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_4_2()); 
            // InternalDataflowDSL.g:1564:2: ( rule__AllInstances__Group_4_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==37) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalDataflowDSL.g:1564:3: rule__AllInstances__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllInstancesAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_4__2__Impl"


    // $ANTLR start "rule__AllInstances__Group_4__3"
    // InternalDataflowDSL.g:1572:1: rule__AllInstances__Group_4__3 : rule__AllInstances__Group_4__3__Impl ;
    public final void rule__AllInstances__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1576:1: ( rule__AllInstances__Group_4__3__Impl )
            // InternalDataflowDSL.g:1577:2: rule__AllInstances__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4__3__Impl();

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
    // $ANTLR end "rule__AllInstances__Group_4__3"


    // $ANTLR start "rule__AllInstances__Group_4__3__Impl"
    // InternalDataflowDSL.g:1583:1: rule__AllInstances__Group_4__3__Impl : ( ( rule__AllInstances__TypeNameAssignment_4_3 ) ) ;
    public final void rule__AllInstances__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1587:1: ( ( ( rule__AllInstances__TypeNameAssignment_4_3 ) ) )
            // InternalDataflowDSL.g:1588:1: ( ( rule__AllInstances__TypeNameAssignment_4_3 ) )
            {
            // InternalDataflowDSL.g:1588:1: ( ( rule__AllInstances__TypeNameAssignment_4_3 ) )
            // InternalDataflowDSL.g:1589:2: ( rule__AllInstances__TypeNameAssignment_4_3 )
            {
             before(grammarAccess.getAllInstancesAccess().getTypeNameAssignment_4_3()); 
            // InternalDataflowDSL.g:1590:2: ( rule__AllInstances__TypeNameAssignment_4_3 )
            // InternalDataflowDSL.g:1590:3: rule__AllInstances__TypeNameAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__TypeNameAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getTypeNameAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_4__3__Impl"


    // $ANTLR start "rule__AllInstances__Group_4_1__0"
    // InternalDataflowDSL.g:1599:1: rule__AllInstances__Group_4_1__0 : rule__AllInstances__Group_4_1__0__Impl rule__AllInstances__Group_4_1__1 ;
    public final void rule__AllInstances__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1603:1: ( rule__AllInstances__Group_4_1__0__Impl rule__AllInstances__Group_4_1__1 )
            // InternalDataflowDSL.g:1604:2: rule__AllInstances__Group_4_1__0__Impl rule__AllInstances__Group_4_1__1
            {
            pushFollow(FOLLOW_8);
            rule__AllInstances__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4_1__1();

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
    // $ANTLR end "rule__AllInstances__Group_4_1__0"


    // $ANTLR start "rule__AllInstances__Group_4_1__0__Impl"
    // InternalDataflowDSL.g:1611:1: rule__AllInstances__Group_4_1__0__Impl : ( ( rule__AllInstances__ModelAssignment_4_1_0 ) ) ;
    public final void rule__AllInstances__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1615:1: ( ( ( rule__AllInstances__ModelAssignment_4_1_0 ) ) )
            // InternalDataflowDSL.g:1616:1: ( ( rule__AllInstances__ModelAssignment_4_1_0 ) )
            {
            // InternalDataflowDSL.g:1616:1: ( ( rule__AllInstances__ModelAssignment_4_1_0 ) )
            // InternalDataflowDSL.g:1617:2: ( rule__AllInstances__ModelAssignment_4_1_0 )
            {
             before(grammarAccess.getAllInstancesAccess().getModelAssignment_4_1_0()); 
            // InternalDataflowDSL.g:1618:2: ( rule__AllInstances__ModelAssignment_4_1_0 )
            // InternalDataflowDSL.g:1618:3: rule__AllInstances__ModelAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__ModelAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getModelAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_4_1__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_4_1__1"
    // InternalDataflowDSL.g:1626:1: rule__AllInstances__Group_4_1__1 : rule__AllInstances__Group_4_1__1__Impl ;
    public final void rule__AllInstances__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1630:1: ( rule__AllInstances__Group_4_1__1__Impl )
            // InternalDataflowDSL.g:1631:2: rule__AllInstances__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__AllInstances__Group_4_1__1"


    // $ANTLR start "rule__AllInstances__Group_4_1__1__Impl"
    // InternalDataflowDSL.g:1637:1: rule__AllInstances__Group_4_1__1__Impl : ( '!' ) ;
    public final void rule__AllInstances__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1641:1: ( ( '!' ) )
            // InternalDataflowDSL.g:1642:1: ( '!' )
            {
            // InternalDataflowDSL.g:1642:1: ( '!' )
            // InternalDataflowDSL.g:1643:2: '!'
            {
             before(grammarAccess.getAllInstancesAccess().getExclamationMarkKeyword_4_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getExclamationMarkKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_4_1__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_4_2__0"
    // InternalDataflowDSL.g:1653:1: rule__AllInstances__Group_4_2__0 : rule__AllInstances__Group_4_2__0__Impl rule__AllInstances__Group_4_2__1 ;
    public final void rule__AllInstances__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1657:1: ( rule__AllInstances__Group_4_2__0__Impl rule__AllInstances__Group_4_2__1 )
            // InternalDataflowDSL.g:1658:2: rule__AllInstances__Group_4_2__0__Impl rule__AllInstances__Group_4_2__1
            {
            pushFollow(FOLLOW_9);
            rule__AllInstances__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4_2__1();

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
    // $ANTLR end "rule__AllInstances__Group_4_2__0"


    // $ANTLR start "rule__AllInstances__Group_4_2__0__Impl"
    // InternalDataflowDSL.g:1665:1: rule__AllInstances__Group_4_2__0__Impl : ( ( rule__AllInstances__PackageNameAssignment_4_2_0 ) ) ;
    public final void rule__AllInstances__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1669:1: ( ( ( rule__AllInstances__PackageNameAssignment_4_2_0 ) ) )
            // InternalDataflowDSL.g:1670:1: ( ( rule__AllInstances__PackageNameAssignment_4_2_0 ) )
            {
            // InternalDataflowDSL.g:1670:1: ( ( rule__AllInstances__PackageNameAssignment_4_2_0 ) )
            // InternalDataflowDSL.g:1671:2: ( rule__AllInstances__PackageNameAssignment_4_2_0 )
            {
             before(grammarAccess.getAllInstancesAccess().getPackageNameAssignment_4_2_0()); 
            // InternalDataflowDSL.g:1672:2: ( rule__AllInstances__PackageNameAssignment_4_2_0 )
            // InternalDataflowDSL.g:1672:3: rule__AllInstances__PackageNameAssignment_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__PackageNameAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getPackageNameAssignment_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_4_2__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_4_2__1"
    // InternalDataflowDSL.g:1680:1: rule__AllInstances__Group_4_2__1 : rule__AllInstances__Group_4_2__1__Impl ;
    public final void rule__AllInstances__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1684:1: ( rule__AllInstances__Group_4_2__1__Impl )
            // InternalDataflowDSL.g:1685:2: rule__AllInstances__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__AllInstances__Group_4_2__1"


    // $ANTLR start "rule__AllInstances__Group_4_2__1__Impl"
    // InternalDataflowDSL.g:1691:1: rule__AllInstances__Group_4_2__1__Impl : ( '::' ) ;
    public final void rule__AllInstances__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1695:1: ( ( '::' ) )
            // InternalDataflowDSL.g:1696:1: ( '::' )
            {
            // InternalDataflowDSL.g:1696:1: ( '::' )
            // InternalDataflowDSL.g:1697:2: '::'
            {
             before(grammarAccess.getAllInstancesAccess().getColonColonKeyword_4_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getColonColonKeyword_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_4_2__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_5__0"
    // InternalDataflowDSL.g:1707:1: rule__AllInstances__Group_5__0 : rule__AllInstances__Group_5__0__Impl rule__AllInstances__Group_5__1 ;
    public final void rule__AllInstances__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1711:1: ( rule__AllInstances__Group_5__0__Impl rule__AllInstances__Group_5__1 )
            // InternalDataflowDSL.g:1712:2: rule__AllInstances__Group_5__0__Impl rule__AllInstances__Group_5__1
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
    // InternalDataflowDSL.g:1719:1: rule__AllInstances__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__AllInstances__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1723:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:1724:1: ( 'target' )
            {
            // InternalDataflowDSL.g:1724:1: ( 'target' )
            // InternalDataflowDSL.g:1725:2: 'target'
            {
             before(grammarAccess.getAllInstancesAccess().getTargetKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTargetKeyword_5_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:1734:1: rule__AllInstances__Group_5__1 : rule__AllInstances__Group_5__1__Impl ;
    public final void rule__AllInstances__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1738:1: ( rule__AllInstances__Group_5__1__Impl )
            // InternalDataflowDSL.g:1739:2: rule__AllInstances__Group_5__1__Impl
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
    // InternalDataflowDSL.g:1745:1: rule__AllInstances__Group_5__1__Impl : ( ( rule__AllInstances__TargetAssignment_5_1 ) ) ;
    public final void rule__AllInstances__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1749:1: ( ( ( rule__AllInstances__TargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:1750:1: ( ( rule__AllInstances__TargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:1750:1: ( ( rule__AllInstances__TargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:1751:2: ( rule__AllInstances__TargetAssignment_5_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:1752:2: ( rule__AllInstances__TargetAssignment_5_1 )
            // InternalDataflowDSL.g:1752:3: rule__AllInstances__TargetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__TargetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getTargetAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__NewInstance__Group__0"
    // InternalDataflowDSL.g:1761:1: rule__NewInstance__Group__0 : rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1 ;
    public final void rule__NewInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1765:1: ( rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1 )
            // InternalDataflowDSL.g:1766:2: rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1
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
    // InternalDataflowDSL.g:1773:1: rule__NewInstance__Group__0__Impl : ( 'NewInstance' ) ;
    public final void rule__NewInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1777:1: ( ( 'NewInstance' ) )
            // InternalDataflowDSL.g:1778:1: ( 'NewInstance' )
            {
            // InternalDataflowDSL.g:1778:1: ( 'NewInstance' )
            // InternalDataflowDSL.g:1779:2: 'NewInstance'
            {
             before(grammarAccess.getNewInstanceAccess().getNewInstanceKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDataflowDSL.g:1788:1: rule__NewInstance__Group__1 : rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2 ;
    public final void rule__NewInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1792:1: ( rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2 )
            // InternalDataflowDSL.g:1793:2: rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2
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
    // InternalDataflowDSL.g:1800:1: rule__NewInstance__Group__1__Impl : ( ( rule__NewInstance__NameAssignment_1 ) ) ;
    public final void rule__NewInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1804:1: ( ( ( rule__NewInstance__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:1805:1: ( ( rule__NewInstance__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:1805:1: ( ( rule__NewInstance__NameAssignment_1 ) )
            // InternalDataflowDSL.g:1806:2: ( rule__NewInstance__NameAssignment_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:1807:2: ( rule__NewInstance__NameAssignment_1 )
            // InternalDataflowDSL.g:1807:3: rule__NewInstance__NameAssignment_1
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
    // InternalDataflowDSL.g:1815:1: rule__NewInstance__Group__2 : rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3 ;
    public final void rule__NewInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1819:1: ( rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3 )
            // InternalDataflowDSL.g:1820:2: rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataflowDSL.g:1827:1: rule__NewInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__NewInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1831:1: ( ( '{' ) )
            // InternalDataflowDSL.g:1832:1: ( '{' )
            {
            // InternalDataflowDSL.g:1832:1: ( '{' )
            // InternalDataflowDSL.g:1833:2: '{'
            {
             before(grammarAccess.getNewInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:1842:1: rule__NewInstance__Group__3 : rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4 ;
    public final void rule__NewInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1846:1: ( rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4 )
            // InternalDataflowDSL.g:1847:2: rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataflowDSL.g:1854:1: rule__NewInstance__Group__3__Impl : ( ( rule__NewInstance__Group_3__0 )? ) ;
    public final void rule__NewInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1858:1: ( ( ( rule__NewInstance__Group_3__0 )? ) )
            // InternalDataflowDSL.g:1859:1: ( ( rule__NewInstance__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:1859:1: ( ( rule__NewInstance__Group_3__0 )? )
            // InternalDataflowDSL.g:1860:2: ( rule__NewInstance__Group_3__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_3()); 
            // InternalDataflowDSL.g:1861:2: ( rule__NewInstance__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataflowDSL.g:1861:3: rule__NewInstance__Group_3__0
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
    // InternalDataflowDSL.g:1869:1: rule__NewInstance__Group__4 : rule__NewInstance__Group__4__Impl rule__NewInstance__Group__5 ;
    public final void rule__NewInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1873:1: ( rule__NewInstance__Group__4__Impl rule__NewInstance__Group__5 )
            // InternalDataflowDSL.g:1874:2: rule__NewInstance__Group__4__Impl rule__NewInstance__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataflowDSL.g:1881:1: rule__NewInstance__Group__4__Impl : ( ( rule__NewInstance__Group_4__0 )? ) ;
    public final void rule__NewInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1885:1: ( ( ( rule__NewInstance__Group_4__0 )? ) )
            // InternalDataflowDSL.g:1886:1: ( ( rule__NewInstance__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:1886:1: ( ( rule__NewInstance__Group_4__0 )? )
            // InternalDataflowDSL.g:1887:2: ( rule__NewInstance__Group_4__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_4()); 
            // InternalDataflowDSL.g:1888:2: ( rule__NewInstance__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataflowDSL.g:1888:3: rule__NewInstance__Group_4__0
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
    // InternalDataflowDSL.g:1896:1: rule__NewInstance__Group__5 : rule__NewInstance__Group__5__Impl rule__NewInstance__Group__6 ;
    public final void rule__NewInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1900:1: ( rule__NewInstance__Group__5__Impl rule__NewInstance__Group__6 )
            // InternalDataflowDSL.g:1901:2: rule__NewInstance__Group__5__Impl rule__NewInstance__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataflowDSL.g:1908:1: rule__NewInstance__Group__5__Impl : ( ( rule__NewInstance__Group_5__0 )? ) ;
    public final void rule__NewInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1912:1: ( ( ( rule__NewInstance__Group_5__0 )? ) )
            // InternalDataflowDSL.g:1913:1: ( ( rule__NewInstance__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:1913:1: ( ( rule__NewInstance__Group_5__0 )? )
            // InternalDataflowDSL.g:1914:2: ( rule__NewInstance__Group_5__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_5()); 
            // InternalDataflowDSL.g:1915:2: ( rule__NewInstance__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataflowDSL.g:1915:3: rule__NewInstance__Group_5__0
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
    // InternalDataflowDSL.g:1923:1: rule__NewInstance__Group__6 : rule__NewInstance__Group__6__Impl rule__NewInstance__Group__7 ;
    public final void rule__NewInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1927:1: ( rule__NewInstance__Group__6__Impl rule__NewInstance__Group__7 )
            // InternalDataflowDSL.g:1928:2: rule__NewInstance__Group__6__Impl rule__NewInstance__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataflowDSL.g:1935:1: rule__NewInstance__Group__6__Impl : ( ( rule__NewInstance__Group_6__0 )? ) ;
    public final void rule__NewInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1939:1: ( ( ( rule__NewInstance__Group_6__0 )? ) )
            // InternalDataflowDSL.g:1940:1: ( ( rule__NewInstance__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:1940:1: ( ( rule__NewInstance__Group_6__0 )? )
            // InternalDataflowDSL.g:1941:2: ( rule__NewInstance__Group_6__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_6()); 
            // InternalDataflowDSL.g:1942:2: ( rule__NewInstance__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataflowDSL.g:1942:3: rule__NewInstance__Group_6__0
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
    // InternalDataflowDSL.g:1950:1: rule__NewInstance__Group__7 : rule__NewInstance__Group__7__Impl ;
    public final void rule__NewInstance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1954:1: ( rule__NewInstance__Group__7__Impl )
            // InternalDataflowDSL.g:1955:2: rule__NewInstance__Group__7__Impl
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
    // InternalDataflowDSL.g:1961:1: rule__NewInstance__Group__7__Impl : ( '}' ) ;
    public final void rule__NewInstance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1965:1: ( ( '}' ) )
            // InternalDataflowDSL.g:1966:1: ( '}' )
            {
            // InternalDataflowDSL.g:1966:1: ( '}' )
            // InternalDataflowDSL.g:1967:2: '}'
            {
             before(grammarAccess.getNewInstanceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:1977:1: rule__NewInstance__Group_3__0 : rule__NewInstance__Group_3__0__Impl rule__NewInstance__Group_3__1 ;
    public final void rule__NewInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1981:1: ( rule__NewInstance__Group_3__0__Impl rule__NewInstance__Group_3__1 )
            // InternalDataflowDSL.g:1982:2: rule__NewInstance__Group_3__0__Impl rule__NewInstance__Group_3__1
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
    // InternalDataflowDSL.g:1989:1: rule__NewInstance__Group_3__0__Impl : ( 'instanceField' ) ;
    public final void rule__NewInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1993:1: ( ( 'instanceField' ) )
            // InternalDataflowDSL.g:1994:1: ( 'instanceField' )
            {
            // InternalDataflowDSL.g:1994:1: ( 'instanceField' )
            // InternalDataflowDSL.g:1995:2: 'instanceField'
            {
             before(grammarAccess.getNewInstanceAccess().getInstanceFieldKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getInstanceFieldKeyword_3_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2004:1: rule__NewInstance__Group_3__1 : rule__NewInstance__Group_3__1__Impl ;
    public final void rule__NewInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2008:1: ( rule__NewInstance__Group_3__1__Impl )
            // InternalDataflowDSL.g:2009:2: rule__NewInstance__Group_3__1__Impl
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
    // InternalDataflowDSL.g:2015:1: rule__NewInstance__Group_3__1__Impl : ( ( rule__NewInstance__InstanceFieldAssignment_3_1 ) ) ;
    public final void rule__NewInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2019:1: ( ( ( rule__NewInstance__InstanceFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:2020:1: ( ( rule__NewInstance__InstanceFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:2020:1: ( ( rule__NewInstance__InstanceFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:2021:2: ( rule__NewInstance__InstanceFieldAssignment_3_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getInstanceFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:2022:2: ( rule__NewInstance__InstanceFieldAssignment_3_1 )
            // InternalDataflowDSL.g:2022:3: rule__NewInstance__InstanceFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__InstanceFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getInstanceFieldAssignment_3_1()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2031:1: rule__NewInstance__Group_4__0 : rule__NewInstance__Group_4__0__Impl rule__NewInstance__Group_4__1 ;
    public final void rule__NewInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2035:1: ( rule__NewInstance__Group_4__0__Impl rule__NewInstance__Group_4__1 )
            // InternalDataflowDSL.g:2036:2: rule__NewInstance__Group_4__0__Impl rule__NewInstance__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:2043:1: rule__NewInstance__Group_4__0__Impl : ( 'key' ) ;
    public final void rule__NewInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2047:1: ( ( 'key' ) )
            // InternalDataflowDSL.g:2048:1: ( 'key' )
            {
            // InternalDataflowDSL.g:2048:1: ( 'key' )
            // InternalDataflowDSL.g:2049:2: 'key'
            {
             before(grammarAccess.getNewInstanceAccess().getKeyKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getKeyKeyword_4_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2058:1: rule__NewInstance__Group_4__1 : rule__NewInstance__Group_4__1__Impl ;
    public final void rule__NewInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2062:1: ( rule__NewInstance__Group_4__1__Impl )
            // InternalDataflowDSL.g:2063:2: rule__NewInstance__Group_4__1__Impl
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
    // InternalDataflowDSL.g:2069:1: rule__NewInstance__Group_4__1__Impl : ( ( rule__NewInstance__KeyAssignment_4_1 ) ) ;
    public final void rule__NewInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2073:1: ( ( ( rule__NewInstance__KeyAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:2074:1: ( ( rule__NewInstance__KeyAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:2074:1: ( ( rule__NewInstance__KeyAssignment_4_1 ) )
            // InternalDataflowDSL.g:2075:2: ( rule__NewInstance__KeyAssignment_4_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getKeyAssignment_4_1()); 
            // InternalDataflowDSL.g:2076:2: ( rule__NewInstance__KeyAssignment_4_1 )
            // InternalDataflowDSL.g:2076:3: rule__NewInstance__KeyAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__KeyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getKeyAssignment_4_1()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2085:1: rule__NewInstance__Group_5__0 : rule__NewInstance__Group_5__0__Impl rule__NewInstance__Group_5__1 ;
    public final void rule__NewInstance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2089:1: ( rule__NewInstance__Group_5__0__Impl rule__NewInstance__Group_5__1 )
            // InternalDataflowDSL.g:2090:2: rule__NewInstance__Group_5__0__Impl rule__NewInstance__Group_5__1
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
    // InternalDataflowDSL.g:2097:1: rule__NewInstance__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__NewInstance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2101:1: ( ( 'type' ) )
            // InternalDataflowDSL.g:2102:1: ( 'type' )
            {
            // InternalDataflowDSL.g:2102:1: ( 'type' )
            // InternalDataflowDSL.g:2103:2: 'type'
            {
             before(grammarAccess.getNewInstanceAccess().getTypeKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTypeKeyword_5_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2112:1: rule__NewInstance__Group_5__1 : rule__NewInstance__Group_5__1__Impl rule__NewInstance__Group_5__2 ;
    public final void rule__NewInstance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2116:1: ( rule__NewInstance__Group_5__1__Impl rule__NewInstance__Group_5__2 )
            // InternalDataflowDSL.g:2117:2: rule__NewInstance__Group_5__1__Impl rule__NewInstance__Group_5__2
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5__2();

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
    // InternalDataflowDSL.g:2124:1: rule__NewInstance__Group_5__1__Impl : ( ( rule__NewInstance__Group_5_1__0 )? ) ;
    public final void rule__NewInstance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2128:1: ( ( ( rule__NewInstance__Group_5_1__0 )? ) )
            // InternalDataflowDSL.g:2129:1: ( ( rule__NewInstance__Group_5_1__0 )? )
            {
            // InternalDataflowDSL.g:2129:1: ( ( rule__NewInstance__Group_5_1__0 )? )
            // InternalDataflowDSL.g:2130:2: ( rule__NewInstance__Group_5_1__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_5_1()); 
            // InternalDataflowDSL.g:2131:2: ( rule__NewInstance__Group_5_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==36) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalDataflowDSL.g:2131:3: rule__NewInstance__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_5_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewInstanceAccess().getGroup_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__NewInstance__Group_5__2"
    // InternalDataflowDSL.g:2139:1: rule__NewInstance__Group_5__2 : rule__NewInstance__Group_5__2__Impl rule__NewInstance__Group_5__3 ;
    public final void rule__NewInstance__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2143:1: ( rule__NewInstance__Group_5__2__Impl rule__NewInstance__Group_5__3 )
            // InternalDataflowDSL.g:2144:2: rule__NewInstance__Group_5__2__Impl rule__NewInstance__Group_5__3
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5__3();

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
    // $ANTLR end "rule__NewInstance__Group_5__2"


    // $ANTLR start "rule__NewInstance__Group_5__2__Impl"
    // InternalDataflowDSL.g:2151:1: rule__NewInstance__Group_5__2__Impl : ( ( rule__NewInstance__Group_5_2__0 )? ) ;
    public final void rule__NewInstance__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2155:1: ( ( ( rule__NewInstance__Group_5_2__0 )? ) )
            // InternalDataflowDSL.g:2156:1: ( ( rule__NewInstance__Group_5_2__0 )? )
            {
            // InternalDataflowDSL.g:2156:1: ( ( rule__NewInstance__Group_5_2__0 )? )
            // InternalDataflowDSL.g:2157:2: ( rule__NewInstance__Group_5_2__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_5_2()); 
            // InternalDataflowDSL.g:2158:2: ( rule__NewInstance__Group_5_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==37) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalDataflowDSL.g:2158:3: rule__NewInstance__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_5_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewInstanceAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_5__2__Impl"


    // $ANTLR start "rule__NewInstance__Group_5__3"
    // InternalDataflowDSL.g:2166:1: rule__NewInstance__Group_5__3 : rule__NewInstance__Group_5__3__Impl ;
    public final void rule__NewInstance__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2170:1: ( rule__NewInstance__Group_5__3__Impl )
            // InternalDataflowDSL.g:2171:2: rule__NewInstance__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5__3__Impl();

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
    // $ANTLR end "rule__NewInstance__Group_5__3"


    // $ANTLR start "rule__NewInstance__Group_5__3__Impl"
    // InternalDataflowDSL.g:2177:1: rule__NewInstance__Group_5__3__Impl : ( ( rule__NewInstance__TypeNameAssignment_5_3 ) ) ;
    public final void rule__NewInstance__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2181:1: ( ( ( rule__NewInstance__TypeNameAssignment_5_3 ) ) )
            // InternalDataflowDSL.g:2182:1: ( ( rule__NewInstance__TypeNameAssignment_5_3 ) )
            {
            // InternalDataflowDSL.g:2182:1: ( ( rule__NewInstance__TypeNameAssignment_5_3 ) )
            // InternalDataflowDSL.g:2183:2: ( rule__NewInstance__TypeNameAssignment_5_3 )
            {
             before(grammarAccess.getNewInstanceAccess().getTypeNameAssignment_5_3()); 
            // InternalDataflowDSL.g:2184:2: ( rule__NewInstance__TypeNameAssignment_5_3 )
            // InternalDataflowDSL.g:2184:3: rule__NewInstance__TypeNameAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__TypeNameAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getTypeNameAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_5__3__Impl"


    // $ANTLR start "rule__NewInstance__Group_5_1__0"
    // InternalDataflowDSL.g:2193:1: rule__NewInstance__Group_5_1__0 : rule__NewInstance__Group_5_1__0__Impl rule__NewInstance__Group_5_1__1 ;
    public final void rule__NewInstance__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2197:1: ( rule__NewInstance__Group_5_1__0__Impl rule__NewInstance__Group_5_1__1 )
            // InternalDataflowDSL.g:2198:2: rule__NewInstance__Group_5_1__0__Impl rule__NewInstance__Group_5_1__1
            {
            pushFollow(FOLLOW_8);
            rule__NewInstance__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5_1__1();

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
    // $ANTLR end "rule__NewInstance__Group_5_1__0"


    // $ANTLR start "rule__NewInstance__Group_5_1__0__Impl"
    // InternalDataflowDSL.g:2205:1: rule__NewInstance__Group_5_1__0__Impl : ( ( rule__NewInstance__ModelAssignment_5_1_0 ) ) ;
    public final void rule__NewInstance__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2209:1: ( ( ( rule__NewInstance__ModelAssignment_5_1_0 ) ) )
            // InternalDataflowDSL.g:2210:1: ( ( rule__NewInstance__ModelAssignment_5_1_0 ) )
            {
            // InternalDataflowDSL.g:2210:1: ( ( rule__NewInstance__ModelAssignment_5_1_0 ) )
            // InternalDataflowDSL.g:2211:2: ( rule__NewInstance__ModelAssignment_5_1_0 )
            {
             before(grammarAccess.getNewInstanceAccess().getModelAssignment_5_1_0()); 
            // InternalDataflowDSL.g:2212:2: ( rule__NewInstance__ModelAssignment_5_1_0 )
            // InternalDataflowDSL.g:2212:3: rule__NewInstance__ModelAssignment_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__ModelAssignment_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getModelAssignment_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_5_1__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_5_1__1"
    // InternalDataflowDSL.g:2220:1: rule__NewInstance__Group_5_1__1 : rule__NewInstance__Group_5_1__1__Impl ;
    public final void rule__NewInstance__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2224:1: ( rule__NewInstance__Group_5_1__1__Impl )
            // InternalDataflowDSL.g:2225:2: rule__NewInstance__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__NewInstance__Group_5_1__1"


    // $ANTLR start "rule__NewInstance__Group_5_1__1__Impl"
    // InternalDataflowDSL.g:2231:1: rule__NewInstance__Group_5_1__1__Impl : ( '!' ) ;
    public final void rule__NewInstance__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2235:1: ( ( '!' ) )
            // InternalDataflowDSL.g:2236:1: ( '!' )
            {
            // InternalDataflowDSL.g:2236:1: ( '!' )
            // InternalDataflowDSL.g:2237:2: '!'
            {
             before(grammarAccess.getNewInstanceAccess().getExclamationMarkKeyword_5_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getExclamationMarkKeyword_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_5_1__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_5_2__0"
    // InternalDataflowDSL.g:2247:1: rule__NewInstance__Group_5_2__0 : rule__NewInstance__Group_5_2__0__Impl rule__NewInstance__Group_5_2__1 ;
    public final void rule__NewInstance__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2251:1: ( rule__NewInstance__Group_5_2__0__Impl rule__NewInstance__Group_5_2__1 )
            // InternalDataflowDSL.g:2252:2: rule__NewInstance__Group_5_2__0__Impl rule__NewInstance__Group_5_2__1
            {
            pushFollow(FOLLOW_9);
            rule__NewInstance__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5_2__1();

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
    // $ANTLR end "rule__NewInstance__Group_5_2__0"


    // $ANTLR start "rule__NewInstance__Group_5_2__0__Impl"
    // InternalDataflowDSL.g:2259:1: rule__NewInstance__Group_5_2__0__Impl : ( ( rule__NewInstance__PackageNameAssignment_5_2_0 ) ) ;
    public final void rule__NewInstance__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2263:1: ( ( ( rule__NewInstance__PackageNameAssignment_5_2_0 ) ) )
            // InternalDataflowDSL.g:2264:1: ( ( rule__NewInstance__PackageNameAssignment_5_2_0 ) )
            {
            // InternalDataflowDSL.g:2264:1: ( ( rule__NewInstance__PackageNameAssignment_5_2_0 ) )
            // InternalDataflowDSL.g:2265:2: ( rule__NewInstance__PackageNameAssignment_5_2_0 )
            {
             before(grammarAccess.getNewInstanceAccess().getPackageNameAssignment_5_2_0()); 
            // InternalDataflowDSL.g:2266:2: ( rule__NewInstance__PackageNameAssignment_5_2_0 )
            // InternalDataflowDSL.g:2266:3: rule__NewInstance__PackageNameAssignment_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__PackageNameAssignment_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getPackageNameAssignment_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_5_2__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_5_2__1"
    // InternalDataflowDSL.g:2274:1: rule__NewInstance__Group_5_2__1 : rule__NewInstance__Group_5_2__1__Impl ;
    public final void rule__NewInstance__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2278:1: ( rule__NewInstance__Group_5_2__1__Impl )
            // InternalDataflowDSL.g:2279:2: rule__NewInstance__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__NewInstance__Group_5_2__1"


    // $ANTLR start "rule__NewInstance__Group_5_2__1__Impl"
    // InternalDataflowDSL.g:2285:1: rule__NewInstance__Group_5_2__1__Impl : ( '::' ) ;
    public final void rule__NewInstance__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2289:1: ( ( '::' ) )
            // InternalDataflowDSL.g:2290:1: ( '::' )
            {
            // InternalDataflowDSL.g:2290:1: ( '::' )
            // InternalDataflowDSL.g:2291:2: '::'
            {
             before(grammarAccess.getNewInstanceAccess().getColonColonKeyword_5_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getColonColonKeyword_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_5_2__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_6__0"
    // InternalDataflowDSL.g:2301:1: rule__NewInstance__Group_6__0 : rule__NewInstance__Group_6__0__Impl rule__NewInstance__Group_6__1 ;
    public final void rule__NewInstance__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2305:1: ( rule__NewInstance__Group_6__0__Impl rule__NewInstance__Group_6__1 )
            // InternalDataflowDSL.g:2306:2: rule__NewInstance__Group_6__0__Impl rule__NewInstance__Group_6__1
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
    // InternalDataflowDSL.g:2313:1: rule__NewInstance__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__NewInstance__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2317:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2318:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2318:1: ( 'target' )
            // InternalDataflowDSL.g:2319:2: 'target'
            {
             before(grammarAccess.getNewInstanceAccess().getTargetKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:2328:1: rule__NewInstance__Group_6__1 : rule__NewInstance__Group_6__1__Impl ;
    public final void rule__NewInstance__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2332:1: ( rule__NewInstance__Group_6__1__Impl )
            // InternalDataflowDSL.g:2333:2: rule__NewInstance__Group_6__1__Impl
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
    // InternalDataflowDSL.g:2339:1: rule__NewInstance__Group_6__1__Impl : ( ( rule__NewInstance__TargetAssignment_6_1 ) ) ;
    public final void rule__NewInstance__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2343:1: ( ( ( rule__NewInstance__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:2344:1: ( ( rule__NewInstance__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:2344:1: ( ( rule__NewInstance__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:2345:2: ( rule__NewInstance__TargetAssignment_6_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:2346:2: ( rule__NewInstance__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:2346:3: rule__NewInstance__TargetAssignment_6_1
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
    // InternalDataflowDSL.g:2355:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2359:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalDataflowDSL.g:2360:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
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
    // InternalDataflowDSL.g:2367:1: rule__Filter__Group__0__Impl : ( 'Filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2371:1: ( ( 'Filter' ) )
            // InternalDataflowDSL.g:2372:1: ( 'Filter' )
            {
            // InternalDataflowDSL.g:2372:1: ( 'Filter' )
            // InternalDataflowDSL.g:2373:2: 'Filter'
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
    // InternalDataflowDSL.g:2382:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2386:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalDataflowDSL.g:2387:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
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
    // InternalDataflowDSL.g:2394:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__NameAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2398:1: ( ( ( rule__Filter__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2399:1: ( ( rule__Filter__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2399:1: ( ( rule__Filter__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2400:2: ( rule__Filter__NameAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2401:2: ( rule__Filter__NameAssignment_1 )
            // InternalDataflowDSL.g:2401:3: rule__Filter__NameAssignment_1
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
    // InternalDataflowDSL.g:2409:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl rule__Filter__Group__3 ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2413:1: ( rule__Filter__Group__2__Impl rule__Filter__Group__3 )
            // InternalDataflowDSL.g:2414:2: rule__Filter__Group__2__Impl rule__Filter__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataflowDSL.g:2421:1: rule__Filter__Group__2__Impl : ( '{' ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2425:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2426:1: ( '{' )
            {
            // InternalDataflowDSL.g:2426:1: ( '{' )
            // InternalDataflowDSL.g:2427:2: '{'
            {
             before(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:2436:1: rule__Filter__Group__3 : rule__Filter__Group__3__Impl rule__Filter__Group__4 ;
    public final void rule__Filter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2440:1: ( rule__Filter__Group__3__Impl rule__Filter__Group__4 )
            // InternalDataflowDSL.g:2441:2: rule__Filter__Group__3__Impl rule__Filter__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataflowDSL.g:2448:1: rule__Filter__Group__3__Impl : ( ( rule__Filter__Group_3__0 )? ) ;
    public final void rule__Filter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2452:1: ( ( ( rule__Filter__Group_3__0 )? ) )
            // InternalDataflowDSL.g:2453:1: ( ( rule__Filter__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:2453:1: ( ( rule__Filter__Group_3__0 )? )
            // InternalDataflowDSL.g:2454:2: ( rule__Filter__Group_3__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_3()); 
            // InternalDataflowDSL.g:2455:2: ( rule__Filter__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataflowDSL.g:2455:3: rule__Filter__Group_3__0
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
    // InternalDataflowDSL.g:2463:1: rule__Filter__Group__4 : rule__Filter__Group__4__Impl rule__Filter__Group__5 ;
    public final void rule__Filter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2467:1: ( rule__Filter__Group__4__Impl rule__Filter__Group__5 )
            // InternalDataflowDSL.g:2468:2: rule__Filter__Group__4__Impl rule__Filter__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataflowDSL.g:2475:1: rule__Filter__Group__4__Impl : ( ( rule__Filter__Group_4__0 )? ) ;
    public final void rule__Filter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2479:1: ( ( ( rule__Filter__Group_4__0 )? ) )
            // InternalDataflowDSL.g:2480:1: ( ( rule__Filter__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:2480:1: ( ( rule__Filter__Group_4__0 )? )
            // InternalDataflowDSL.g:2481:2: ( rule__Filter__Group_4__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_4()); 
            // InternalDataflowDSL.g:2482:2: ( rule__Filter__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataflowDSL.g:2482:3: rule__Filter__Group_4__0
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
    // InternalDataflowDSL.g:2490:1: rule__Filter__Group__5 : rule__Filter__Group__5__Impl rule__Filter__Group__6 ;
    public final void rule__Filter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2494:1: ( rule__Filter__Group__5__Impl rule__Filter__Group__6 )
            // InternalDataflowDSL.g:2495:2: rule__Filter__Group__5__Impl rule__Filter__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataflowDSL.g:2502:1: rule__Filter__Group__5__Impl : ( ( rule__Filter__Group_5__0 )? ) ;
    public final void rule__Filter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2506:1: ( ( ( rule__Filter__Group_5__0 )? ) )
            // InternalDataflowDSL.g:2507:1: ( ( rule__Filter__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:2507:1: ( ( rule__Filter__Group_5__0 )? )
            // InternalDataflowDSL.g:2508:2: ( rule__Filter__Group_5__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_5()); 
            // InternalDataflowDSL.g:2509:2: ( rule__Filter__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataflowDSL.g:2509:3: rule__Filter__Group_5__0
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
    // InternalDataflowDSL.g:2517:1: rule__Filter__Group__6 : rule__Filter__Group__6__Impl ;
    public final void rule__Filter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2521:1: ( rule__Filter__Group__6__Impl )
            // InternalDataflowDSL.g:2522:2: rule__Filter__Group__6__Impl
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
    // InternalDataflowDSL.g:2528:1: rule__Filter__Group__6__Impl : ( '}' ) ;
    public final void rule__Filter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2532:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2533:1: ( '}' )
            {
            // InternalDataflowDSL.g:2533:1: ( '}' )
            // InternalDataflowDSL.g:2534:2: '}'
            {
             before(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:2544:1: rule__Filter__Group_3__0 : rule__Filter__Group_3__0__Impl rule__Filter__Group_3__1 ;
    public final void rule__Filter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2548:1: ( rule__Filter__Group_3__0__Impl rule__Filter__Group_3__1 )
            // InternalDataflowDSL.g:2549:2: rule__Filter__Group_3__0__Impl rule__Filter__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:2556:1: rule__Filter__Group_3__0__Impl : ( 'filterBy' ) ;
    public final void rule__Filter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2560:1: ( ( 'filterBy' ) )
            // InternalDataflowDSL.g:2561:1: ( 'filterBy' )
            {
            // InternalDataflowDSL.g:2561:1: ( 'filterBy' )
            // InternalDataflowDSL.g:2562:2: 'filterBy'
            {
             before(grammarAccess.getFilterAccess().getFilterByKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterByKeyword_3_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2571:1: rule__Filter__Group_3__1 : rule__Filter__Group_3__1__Impl ;
    public final void rule__Filter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2575:1: ( rule__Filter__Group_3__1__Impl )
            // InternalDataflowDSL.g:2576:2: rule__Filter__Group_3__1__Impl
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
    // InternalDataflowDSL.g:2582:1: rule__Filter__Group_3__1__Impl : ( ( rule__Filter__FilterByAssignment_3_1 ) ) ;
    public final void rule__Filter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2586:1: ( ( ( rule__Filter__FilterByAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:2587:1: ( ( rule__Filter__FilterByAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:2587:1: ( ( rule__Filter__FilterByAssignment_3_1 ) )
            // InternalDataflowDSL.g:2588:2: ( rule__Filter__FilterByAssignment_3_1 )
            {
             before(grammarAccess.getFilterAccess().getFilterByAssignment_3_1()); 
            // InternalDataflowDSL.g:2589:2: ( rule__Filter__FilterByAssignment_3_1 )
            // InternalDataflowDSL.g:2589:3: rule__Filter__FilterByAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__FilterByAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getFilterByAssignment_3_1()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2598:1: rule__Filter__Group_4__0 : rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1 ;
    public final void rule__Filter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2602:1: ( rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1 )
            // InternalDataflowDSL.g:2603:2: rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1
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
    // InternalDataflowDSL.g:2610:1: rule__Filter__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Filter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2614:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2615:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2615:1: ( 'target' )
            // InternalDataflowDSL.g:2616:2: 'target'
            {
             before(grammarAccess.getFilterAccess().getTargetKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:2625:1: rule__Filter__Group_4__1 : rule__Filter__Group_4__1__Impl ;
    public final void rule__Filter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2629:1: ( rule__Filter__Group_4__1__Impl )
            // InternalDataflowDSL.g:2630:2: rule__Filter__Group_4__1__Impl
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
    // InternalDataflowDSL.g:2636:1: rule__Filter__Group_4__1__Impl : ( ( rule__Filter__TargetAssignment_4_1 ) ) ;
    public final void rule__Filter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2640:1: ( ( ( rule__Filter__TargetAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:2641:1: ( ( rule__Filter__TargetAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:2641:1: ( ( rule__Filter__TargetAssignment_4_1 ) )
            // InternalDataflowDSL.g:2642:2: ( rule__Filter__TargetAssignment_4_1 )
            {
             before(grammarAccess.getFilterAccess().getTargetAssignment_4_1()); 
            // InternalDataflowDSL.g:2643:2: ( rule__Filter__TargetAssignment_4_1 )
            // InternalDataflowDSL.g:2643:3: rule__Filter__TargetAssignment_4_1
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
    // InternalDataflowDSL.g:2652:1: rule__Filter__Group_5__0 : rule__Filter__Group_5__0__Impl rule__Filter__Group_5__1 ;
    public final void rule__Filter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2656:1: ( rule__Filter__Group_5__0__Impl rule__Filter__Group_5__1 )
            // InternalDataflowDSL.g:2657:2: rule__Filter__Group_5__0__Impl rule__Filter__Group_5__1
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
    // InternalDataflowDSL.g:2664:1: rule__Filter__Group_5__0__Impl : ( 'rejectTarget' ) ;
    public final void rule__Filter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2668:1: ( ( 'rejectTarget' ) )
            // InternalDataflowDSL.g:2669:1: ( 'rejectTarget' )
            {
            // InternalDataflowDSL.g:2669:1: ( 'rejectTarget' )
            // InternalDataflowDSL.g:2670:2: 'rejectTarget'
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
    // InternalDataflowDSL.g:2679:1: rule__Filter__Group_5__1 : rule__Filter__Group_5__1__Impl ;
    public final void rule__Filter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2683:1: ( rule__Filter__Group_5__1__Impl )
            // InternalDataflowDSL.g:2684:2: rule__Filter__Group_5__1__Impl
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
    // InternalDataflowDSL.g:2690:1: rule__Filter__Group_5__1__Impl : ( ( rule__Filter__RejectTargetAssignment_5_1 ) ) ;
    public final void rule__Filter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2694:1: ( ( ( rule__Filter__RejectTargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:2695:1: ( ( rule__Filter__RejectTargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:2695:1: ( ( rule__Filter__RejectTargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:2696:2: ( rule__Filter__RejectTargetAssignment_5_1 )
            {
             before(grammarAccess.getFilterAccess().getRejectTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:2697:2: ( rule__Filter__RejectTargetAssignment_5_1 )
            // InternalDataflowDSL.g:2697:3: rule__Filter__RejectTargetAssignment_5_1
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


    // $ANTLR start "rule__Copy__Group__0"
    // InternalDataflowDSL.g:2706:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2710:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalDataflowDSL.g:2711:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__1();

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
    // $ANTLR end "rule__Copy__Group__0"


    // $ANTLR start "rule__Copy__Group__0__Impl"
    // InternalDataflowDSL.g:2718:1: rule__Copy__Group__0__Impl : ( 'Copy' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2722:1: ( ( 'Copy' ) )
            // InternalDataflowDSL.g:2723:1: ( 'Copy' )
            {
            // InternalDataflowDSL.g:2723:1: ( 'Copy' )
            // InternalDataflowDSL.g:2724:2: 'Copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCopyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0__Impl"


    // $ANTLR start "rule__Copy__Group__1"
    // InternalDataflowDSL.g:2733:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2737:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalDataflowDSL.g:2738:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__2();

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
    // $ANTLR end "rule__Copy__Group__1"


    // $ANTLR start "rule__Copy__Group__1__Impl"
    // InternalDataflowDSL.g:2745:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__NameAssignment_1 ) ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2749:1: ( ( ( rule__Copy__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2750:1: ( ( rule__Copy__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2750:1: ( ( rule__Copy__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2751:2: ( rule__Copy__NameAssignment_1 )
            {
             before(grammarAccess.getCopyAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2752:2: ( rule__Copy__NameAssignment_1 )
            // InternalDataflowDSL.g:2752:3: rule__Copy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Copy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1__Impl"


    // $ANTLR start "rule__Copy__Group__2"
    // InternalDataflowDSL.g:2760:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2764:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalDataflowDSL.g:2765:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__3();

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
    // $ANTLR end "rule__Copy__Group__2"


    // $ANTLR start "rule__Copy__Group__2__Impl"
    // InternalDataflowDSL.g:2772:1: rule__Copy__Group__2__Impl : ( '{' ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2776:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2777:1: ( '{' )
            {
            // InternalDataflowDSL.g:2777:1: ( '{' )
            // InternalDataflowDSL.g:2778:2: '{'
            {
             before(grammarAccess.getCopyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__2__Impl"


    // $ANTLR start "rule__Copy__Group__3"
    // InternalDataflowDSL.g:2787:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2791:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalDataflowDSL.g:2792:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Copy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__4();

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
    // $ANTLR end "rule__Copy__Group__3"


    // $ANTLR start "rule__Copy__Group__3__Impl"
    // InternalDataflowDSL.g:2799:1: rule__Copy__Group__3__Impl : ( ( rule__Copy__Group_3__0 )? ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2803:1: ( ( ( rule__Copy__Group_3__0 )? ) )
            // InternalDataflowDSL.g:2804:1: ( ( rule__Copy__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:2804:1: ( ( rule__Copy__Group_3__0 )? )
            // InternalDataflowDSL.g:2805:2: ( rule__Copy__Group_3__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_3()); 
            // InternalDataflowDSL.g:2806:2: ( rule__Copy__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataflowDSL.g:2806:3: rule__Copy__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Copy__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCopyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__3__Impl"


    // $ANTLR start "rule__Copy__Group__4"
    // InternalDataflowDSL.g:2814:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2818:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalDataflowDSL.g:2819:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Copy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__5();

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
    // $ANTLR end "rule__Copy__Group__4"


    // $ANTLR start "rule__Copy__Group__4__Impl"
    // InternalDataflowDSL.g:2826:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__Group_4__0 )? ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2830:1: ( ( ( rule__Copy__Group_4__0 )? ) )
            // InternalDataflowDSL.g:2831:1: ( ( rule__Copy__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:2831:1: ( ( rule__Copy__Group_4__0 )? )
            // InternalDataflowDSL.g:2832:2: ( rule__Copy__Group_4__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_4()); 
            // InternalDataflowDSL.g:2833:2: ( rule__Copy__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataflowDSL.g:2833:3: rule__Copy__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Copy__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCopyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__4__Impl"


    // $ANTLR start "rule__Copy__Group__5"
    // InternalDataflowDSL.g:2841:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2845:1: ( rule__Copy__Group__5__Impl )
            // InternalDataflowDSL.g:2846:2: rule__Copy__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__5__Impl();

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
    // $ANTLR end "rule__Copy__Group__5"


    // $ANTLR start "rule__Copy__Group__5__Impl"
    // InternalDataflowDSL.g:2852:1: rule__Copy__Group__5__Impl : ( '}' ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2856:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2857:1: ( '}' )
            {
            // InternalDataflowDSL.g:2857:1: ( '}' )
            // InternalDataflowDSL.g:2858:2: '}'
            {
             before(grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__5__Impl"


    // $ANTLR start "rule__Copy__Group_3__0"
    // InternalDataflowDSL.g:2868:1: rule__Copy__Group_3__0 : rule__Copy__Group_3__0__Impl rule__Copy__Group_3__1 ;
    public final void rule__Copy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2872:1: ( rule__Copy__Group_3__0__Impl rule__Copy__Group_3__1 )
            // InternalDataflowDSL.g:2873:2: rule__Copy__Group_3__0__Impl rule__Copy__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Copy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group_3__1();

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
    // $ANTLR end "rule__Copy__Group_3__0"


    // $ANTLR start "rule__Copy__Group_3__0__Impl"
    // InternalDataflowDSL.g:2880:1: rule__Copy__Group_3__0__Impl : ( 'target' ) ;
    public final void rule__Copy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2884:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2885:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2885:1: ( 'target' )
            // InternalDataflowDSL.g:2886:2: 'target'
            {
             before(grammarAccess.getCopyAccess().getTargetKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getTargetKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3__0__Impl"


    // $ANTLR start "rule__Copy__Group_3__1"
    // InternalDataflowDSL.g:2895:1: rule__Copy__Group_3__1 : rule__Copy__Group_3__1__Impl ;
    public final void rule__Copy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2899:1: ( rule__Copy__Group_3__1__Impl )
            // InternalDataflowDSL.g:2900:2: rule__Copy__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group_3__1__Impl();

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
    // $ANTLR end "rule__Copy__Group_3__1"


    // $ANTLR start "rule__Copy__Group_3__1__Impl"
    // InternalDataflowDSL.g:2906:1: rule__Copy__Group_3__1__Impl : ( ( rule__Copy__TargetAssignment_3_1 ) ) ;
    public final void rule__Copy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2910:1: ( ( ( rule__Copy__TargetAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:2911:1: ( ( rule__Copy__TargetAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:2911:1: ( ( rule__Copy__TargetAssignment_3_1 ) )
            // InternalDataflowDSL.g:2912:2: ( rule__Copy__TargetAssignment_3_1 )
            {
             before(grammarAccess.getCopyAccess().getTargetAssignment_3_1()); 
            // InternalDataflowDSL.g:2913:2: ( rule__Copy__TargetAssignment_3_1 )
            // InternalDataflowDSL.g:2913:3: rule__Copy__TargetAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Copy__TargetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getTargetAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3__1__Impl"


    // $ANTLR start "rule__Copy__Group_4__0"
    // InternalDataflowDSL.g:2922:1: rule__Copy__Group_4__0 : rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 ;
    public final void rule__Copy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2926:1: ( rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 )
            // InternalDataflowDSL.g:2927:2: rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Copy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group_4__1();

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
    // $ANTLR end "rule__Copy__Group_4__0"


    // $ANTLR start "rule__Copy__Group_4__0__Impl"
    // InternalDataflowDSL.g:2934:1: rule__Copy__Group_4__0__Impl : ( 'copyTarget' ) ;
    public final void rule__Copy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2938:1: ( ( 'copyTarget' ) )
            // InternalDataflowDSL.g:2939:1: ( 'copyTarget' )
            {
            // InternalDataflowDSL.g:2939:1: ( 'copyTarget' )
            // InternalDataflowDSL.g:2940:2: 'copyTarget'
            {
             before(grammarAccess.getCopyAccess().getCopyTargetKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCopyTargetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_4__0__Impl"


    // $ANTLR start "rule__Copy__Group_4__1"
    // InternalDataflowDSL.g:2949:1: rule__Copy__Group_4__1 : rule__Copy__Group_4__1__Impl ;
    public final void rule__Copy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2953:1: ( rule__Copy__Group_4__1__Impl )
            // InternalDataflowDSL.g:2954:2: rule__Copy__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group_4__1__Impl();

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
    // $ANTLR end "rule__Copy__Group_4__1"


    // $ANTLR start "rule__Copy__Group_4__1__Impl"
    // InternalDataflowDSL.g:2960:1: rule__Copy__Group_4__1__Impl : ( ( rule__Copy__CopyTargetAssignment_4_1 ) ) ;
    public final void rule__Copy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2964:1: ( ( ( rule__Copy__CopyTargetAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:2965:1: ( ( rule__Copy__CopyTargetAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:2965:1: ( ( rule__Copy__CopyTargetAssignment_4_1 ) )
            // InternalDataflowDSL.g:2966:2: ( rule__Copy__CopyTargetAssignment_4_1 )
            {
             before(grammarAccess.getCopyAccess().getCopyTargetAssignment_4_1()); 
            // InternalDataflowDSL.g:2967:2: ( rule__Copy__CopyTargetAssignment_4_1 )
            // InternalDataflowDSL.g:2967:3: rule__Copy__CopyTargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Copy__CopyTargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getCopyTargetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_4__1__Impl"


    // $ANTLR start "rule__Sort__Group__0"
    // InternalDataflowDSL.g:2976:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2980:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // InternalDataflowDSL.g:2981:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
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
    // InternalDataflowDSL.g:2988:1: rule__Sort__Group__0__Impl : ( 'Sort' ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2992:1: ( ( 'Sort' ) )
            // InternalDataflowDSL.g:2993:1: ( 'Sort' )
            {
            // InternalDataflowDSL.g:2993:1: ( 'Sort' )
            // InternalDataflowDSL.g:2994:2: 'Sort'
            {
             before(grammarAccess.getSortAccess().getSortKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3003:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl rule__Sort__Group__2 ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3007:1: ( rule__Sort__Group__1__Impl rule__Sort__Group__2 )
            // InternalDataflowDSL.g:3008:2: rule__Sort__Group__1__Impl rule__Sort__Group__2
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
    // InternalDataflowDSL.g:3015:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3019:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3020:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3020:1: ( ( rule__Sort__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3021:2: ( rule__Sort__NameAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3022:2: ( rule__Sort__NameAssignment_1 )
            // InternalDataflowDSL.g:3022:3: rule__Sort__NameAssignment_1
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
    // InternalDataflowDSL.g:3030:1: rule__Sort__Group__2 : rule__Sort__Group__2__Impl rule__Sort__Group__3 ;
    public final void rule__Sort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3034:1: ( rule__Sort__Group__2__Impl rule__Sort__Group__3 )
            // InternalDataflowDSL.g:3035:2: rule__Sort__Group__2__Impl rule__Sort__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataflowDSL.g:3042:1: rule__Sort__Group__2__Impl : ( '{' ) ;
    public final void rule__Sort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3046:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3047:1: ( '{' )
            {
            // InternalDataflowDSL.g:3047:1: ( '{' )
            // InternalDataflowDSL.g:3048:2: '{'
            {
             before(grammarAccess.getSortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3057:1: rule__Sort__Group__3 : rule__Sort__Group__3__Impl rule__Sort__Group__4 ;
    public final void rule__Sort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3061:1: ( rule__Sort__Group__3__Impl rule__Sort__Group__4 )
            // InternalDataflowDSL.g:3062:2: rule__Sort__Group__3__Impl rule__Sort__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataflowDSL.g:3069:1: rule__Sort__Group__3__Impl : ( ( rule__Sort__Group_3__0 )? ) ;
    public final void rule__Sort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3073:1: ( ( ( rule__Sort__Group_3__0 )? ) )
            // InternalDataflowDSL.g:3074:1: ( ( rule__Sort__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:3074:1: ( ( rule__Sort__Group_3__0 )? )
            // InternalDataflowDSL.g:3075:2: ( rule__Sort__Group_3__0 )?
            {
             before(grammarAccess.getSortAccess().getGroup_3()); 
            // InternalDataflowDSL.g:3076:2: ( rule__Sort__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataflowDSL.g:3076:3: rule__Sort__Group_3__0
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
    // InternalDataflowDSL.g:3084:1: rule__Sort__Group__4 : rule__Sort__Group__4__Impl rule__Sort__Group__5 ;
    public final void rule__Sort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3088:1: ( rule__Sort__Group__4__Impl rule__Sort__Group__5 )
            // InternalDataflowDSL.g:3089:2: rule__Sort__Group__4__Impl rule__Sort__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataflowDSL.g:3096:1: rule__Sort__Group__4__Impl : ( ( rule__Sort__Group_4__0 )? ) ;
    public final void rule__Sort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3100:1: ( ( ( rule__Sort__Group_4__0 )? ) )
            // InternalDataflowDSL.g:3101:1: ( ( rule__Sort__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:3101:1: ( ( rule__Sort__Group_4__0 )? )
            // InternalDataflowDSL.g:3102:2: ( rule__Sort__Group_4__0 )?
            {
             before(grammarAccess.getSortAccess().getGroup_4()); 
            // InternalDataflowDSL.g:3103:2: ( rule__Sort__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataflowDSL.g:3103:3: rule__Sort__Group_4__0
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
    // InternalDataflowDSL.g:3111:1: rule__Sort__Group__5 : rule__Sort__Group__5__Impl ;
    public final void rule__Sort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3115:1: ( rule__Sort__Group__5__Impl )
            // InternalDataflowDSL.g:3116:2: rule__Sort__Group__5__Impl
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
    // InternalDataflowDSL.g:3122:1: rule__Sort__Group__5__Impl : ( '}' ) ;
    public final void rule__Sort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3126:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3127:1: ( '}' )
            {
            // InternalDataflowDSL.g:3127:1: ( '}' )
            // InternalDataflowDSL.g:3128:2: '}'
            {
             before(grammarAccess.getSortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3138:1: rule__Sort__Group_3__0 : rule__Sort__Group_3__0__Impl rule__Sort__Group_3__1 ;
    public final void rule__Sort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3142:1: ( rule__Sort__Group_3__0__Impl rule__Sort__Group_3__1 )
            // InternalDataflowDSL.g:3143:2: rule__Sort__Group_3__0__Impl rule__Sort__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:3150:1: rule__Sort__Group_3__0__Impl : ( 'sortBy' ) ;
    public final void rule__Sort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3154:1: ( ( 'sortBy' ) )
            // InternalDataflowDSL.g:3155:1: ( 'sortBy' )
            {
            // InternalDataflowDSL.g:3155:1: ( 'sortBy' )
            // InternalDataflowDSL.g:3156:2: 'sortBy'
            {
             before(grammarAccess.getSortAccess().getSortByKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getSortByKeyword_3_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:3165:1: rule__Sort__Group_3__1 : rule__Sort__Group_3__1__Impl ;
    public final void rule__Sort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3169:1: ( rule__Sort__Group_3__1__Impl )
            // InternalDataflowDSL.g:3170:2: rule__Sort__Group_3__1__Impl
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
    // InternalDataflowDSL.g:3176:1: rule__Sort__Group_3__1__Impl : ( ( rule__Sort__SortByAssignment_3_1 ) ) ;
    public final void rule__Sort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3180:1: ( ( ( rule__Sort__SortByAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:3181:1: ( ( rule__Sort__SortByAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:3181:1: ( ( rule__Sort__SortByAssignment_3_1 ) )
            // InternalDataflowDSL.g:3182:2: ( rule__Sort__SortByAssignment_3_1 )
            {
             before(grammarAccess.getSortAccess().getSortByAssignment_3_1()); 
            // InternalDataflowDSL.g:3183:2: ( rule__Sort__SortByAssignment_3_1 )
            // InternalDataflowDSL.g:3183:3: rule__Sort__SortByAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sort__SortByAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getSortByAssignment_3_1()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:3192:1: rule__Sort__Group_4__0 : rule__Sort__Group_4__0__Impl rule__Sort__Group_4__1 ;
    public final void rule__Sort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3196:1: ( rule__Sort__Group_4__0__Impl rule__Sort__Group_4__1 )
            // InternalDataflowDSL.g:3197:2: rule__Sort__Group_4__0__Impl rule__Sort__Group_4__1
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
    // InternalDataflowDSL.g:3204:1: rule__Sort__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Sort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3208:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3209:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3209:1: ( 'target' )
            // InternalDataflowDSL.g:3210:2: 'target'
            {
             before(grammarAccess.getSortAccess().getTargetKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3219:1: rule__Sort__Group_4__1 : rule__Sort__Group_4__1__Impl ;
    public final void rule__Sort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3223:1: ( rule__Sort__Group_4__1__Impl )
            // InternalDataflowDSL.g:3224:2: rule__Sort__Group_4__1__Impl
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
    // InternalDataflowDSL.g:3230:1: rule__Sort__Group_4__1__Impl : ( ( rule__Sort__TargetAssignment_4_1 ) ) ;
    public final void rule__Sort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3234:1: ( ( ( rule__Sort__TargetAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:3235:1: ( ( rule__Sort__TargetAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:3235:1: ( ( rule__Sort__TargetAssignment_4_1 ) )
            // InternalDataflowDSL.g:3236:2: ( rule__Sort__TargetAssignment_4_1 )
            {
             before(grammarAccess.getSortAccess().getTargetAssignment_4_1()); 
            // InternalDataflowDSL.g:3237:2: ( rule__Sort__TargetAssignment_4_1 )
            // InternalDataflowDSL.g:3237:3: rule__Sort__TargetAssignment_4_1
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
    // InternalDataflowDSL.g:3246:1: rule__Product__Group__0 : rule__Product__Group__0__Impl rule__Product__Group__1 ;
    public final void rule__Product__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3250:1: ( rule__Product__Group__0__Impl rule__Product__Group__1 )
            // InternalDataflowDSL.g:3251:2: rule__Product__Group__0__Impl rule__Product__Group__1
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
    // InternalDataflowDSL.g:3258:1: rule__Product__Group__0__Impl : ( 'Product' ) ;
    public final void rule__Product__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3262:1: ( ( 'Product' ) )
            // InternalDataflowDSL.g:3263:1: ( 'Product' )
            {
            // InternalDataflowDSL.g:3263:1: ( 'Product' )
            // InternalDataflowDSL.g:3264:2: 'Product'
            {
             before(grammarAccess.getProductAccess().getProductKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3273:1: rule__Product__Group__1 : rule__Product__Group__1__Impl rule__Product__Group__2 ;
    public final void rule__Product__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3277:1: ( rule__Product__Group__1__Impl rule__Product__Group__2 )
            // InternalDataflowDSL.g:3278:2: rule__Product__Group__1__Impl rule__Product__Group__2
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
    // InternalDataflowDSL.g:3285:1: rule__Product__Group__1__Impl : ( ( rule__Product__NameAssignment_1 ) ) ;
    public final void rule__Product__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3289:1: ( ( ( rule__Product__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3290:1: ( ( rule__Product__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3290:1: ( ( rule__Product__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3291:2: ( rule__Product__NameAssignment_1 )
            {
             before(grammarAccess.getProductAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3292:2: ( rule__Product__NameAssignment_1 )
            // InternalDataflowDSL.g:3292:3: rule__Product__NameAssignment_1
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
    // InternalDataflowDSL.g:3300:1: rule__Product__Group__2 : rule__Product__Group__2__Impl rule__Product__Group__3 ;
    public final void rule__Product__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3304:1: ( rule__Product__Group__2__Impl rule__Product__Group__3 )
            // InternalDataflowDSL.g:3305:2: rule__Product__Group__2__Impl rule__Product__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDataflowDSL.g:3312:1: rule__Product__Group__2__Impl : ( '{' ) ;
    public final void rule__Product__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3316:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3317:1: ( '{' )
            {
            // InternalDataflowDSL.g:3317:1: ( '{' )
            // InternalDataflowDSL.g:3318:2: '{'
            {
             before(grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3327:1: rule__Product__Group__3 : rule__Product__Group__3__Impl rule__Product__Group__4 ;
    public final void rule__Product__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3331:1: ( rule__Product__Group__3__Impl rule__Product__Group__4 )
            // InternalDataflowDSL.g:3332:2: rule__Product__Group__3__Impl rule__Product__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalDataflowDSL.g:3339:1: rule__Product__Group__3__Impl : ( ( rule__Product__Group_3__0 )? ) ;
    public final void rule__Product__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3343:1: ( ( ( rule__Product__Group_3__0 )? ) )
            // InternalDataflowDSL.g:3344:1: ( ( rule__Product__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:3344:1: ( ( rule__Product__Group_3__0 )? )
            // InternalDataflowDSL.g:3345:2: ( rule__Product__Group_3__0 )?
            {
             before(grammarAccess.getProductAccess().getGroup_3()); 
            // InternalDataflowDSL.g:3346:2: ( rule__Product__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataflowDSL.g:3346:3: rule__Product__Group_3__0
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
    // InternalDataflowDSL.g:3354:1: rule__Product__Group__4 : rule__Product__Group__4__Impl ;
    public final void rule__Product__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3358:1: ( rule__Product__Group__4__Impl )
            // InternalDataflowDSL.g:3359:2: rule__Product__Group__4__Impl
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
    // InternalDataflowDSL.g:3365:1: rule__Product__Group__4__Impl : ( '}' ) ;
    public final void rule__Product__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3369:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3370:1: ( '}' )
            {
            // InternalDataflowDSL.g:3370:1: ( '}' )
            // InternalDataflowDSL.g:3371:2: '}'
            {
             before(grammarAccess.getProductAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3381:1: rule__Product__Group_3__0 : rule__Product__Group_3__0__Impl rule__Product__Group_3__1 ;
    public final void rule__Product__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3385:1: ( rule__Product__Group_3__0__Impl rule__Product__Group_3__1 )
            // InternalDataflowDSL.g:3386:2: rule__Product__Group_3__0__Impl rule__Product__Group_3__1
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
    // InternalDataflowDSL.g:3393:1: rule__Product__Group_3__0__Impl : ( 'target' ) ;
    public final void rule__Product__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3397:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3398:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3398:1: ( 'target' )
            // InternalDataflowDSL.g:3399:2: 'target'
            {
             before(grammarAccess.getProductAccess().getTargetKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3408:1: rule__Product__Group_3__1 : rule__Product__Group_3__1__Impl ;
    public final void rule__Product__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3412:1: ( rule__Product__Group_3__1__Impl )
            // InternalDataflowDSL.g:3413:2: rule__Product__Group_3__1__Impl
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
    // InternalDataflowDSL.g:3419:1: rule__Product__Group_3__1__Impl : ( ( rule__Product__TargetAssignment_3_1 ) ) ;
    public final void rule__Product__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3423:1: ( ( ( rule__Product__TargetAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:3424:1: ( ( rule__Product__TargetAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:3424:1: ( ( rule__Product__TargetAssignment_3_1 ) )
            // InternalDataflowDSL.g:3425:2: ( rule__Product__TargetAssignment_3_1 )
            {
             before(grammarAccess.getProductAccess().getTargetAssignment_3_1()); 
            // InternalDataflowDSL.g:3426:2: ( rule__Product__TargetAssignment_3_1 )
            // InternalDataflowDSL.g:3426:3: rule__Product__TargetAssignment_3_1
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
    // InternalDataflowDSL.g:3435:1: rule__GetFeature__Group__0 : rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1 ;
    public final void rule__GetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3439:1: ( rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1 )
            // InternalDataflowDSL.g:3440:2: rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1
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
    // InternalDataflowDSL.g:3447:1: rule__GetFeature__Group__0__Impl : ( 'GetFeature' ) ;
    public final void rule__GetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3451:1: ( ( 'GetFeature' ) )
            // InternalDataflowDSL.g:3452:1: ( 'GetFeature' )
            {
            // InternalDataflowDSL.g:3452:1: ( 'GetFeature' )
            // InternalDataflowDSL.g:3453:2: 'GetFeature'
            {
             before(grammarAccess.getGetFeatureAccess().getGetFeatureKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3462:1: rule__GetFeature__Group__1 : rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2 ;
    public final void rule__GetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3466:1: ( rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2 )
            // InternalDataflowDSL.g:3467:2: rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2
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
    // InternalDataflowDSL.g:3474:1: rule__GetFeature__Group__1__Impl : ( ( rule__GetFeature__NameAssignment_1 ) ) ;
    public final void rule__GetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3478:1: ( ( ( rule__GetFeature__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3479:1: ( ( rule__GetFeature__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3479:1: ( ( rule__GetFeature__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3480:2: ( rule__GetFeature__NameAssignment_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3481:2: ( rule__GetFeature__NameAssignment_1 )
            // InternalDataflowDSL.g:3481:3: rule__GetFeature__NameAssignment_1
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
    // InternalDataflowDSL.g:3489:1: rule__GetFeature__Group__2 : rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3 ;
    public final void rule__GetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3493:1: ( rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3 )
            // InternalDataflowDSL.g:3494:2: rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflowDSL.g:3501:1: rule__GetFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__GetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3505:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3506:1: ( '{' )
            {
            // InternalDataflowDSL.g:3506:1: ( '{' )
            // InternalDataflowDSL.g:3507:2: '{'
            {
             before(grammarAccess.getGetFeatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3516:1: rule__GetFeature__Group__3 : rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4 ;
    public final void rule__GetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3520:1: ( rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4 )
            // InternalDataflowDSL.g:3521:2: rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflowDSL.g:3528:1: rule__GetFeature__Group__3__Impl : ( ( rule__GetFeature__Group_3__0 )? ) ;
    public final void rule__GetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3532:1: ( ( ( rule__GetFeature__Group_3__0 )? ) )
            // InternalDataflowDSL.g:3533:1: ( ( rule__GetFeature__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:3533:1: ( ( rule__GetFeature__Group_3__0 )? )
            // InternalDataflowDSL.g:3534:2: ( rule__GetFeature__Group_3__0 )?
            {
             before(grammarAccess.getGetFeatureAccess().getGroup_3()); 
            // InternalDataflowDSL.g:3535:2: ( rule__GetFeature__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataflowDSL.g:3535:3: rule__GetFeature__Group_3__0
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
    // InternalDataflowDSL.g:3543:1: rule__GetFeature__Group__4 : rule__GetFeature__Group__4__Impl rule__GetFeature__Group__5 ;
    public final void rule__GetFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3547:1: ( rule__GetFeature__Group__4__Impl rule__GetFeature__Group__5 )
            // InternalDataflowDSL.g:3548:2: rule__GetFeature__Group__4__Impl rule__GetFeature__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflowDSL.g:3555:1: rule__GetFeature__Group__4__Impl : ( ( rule__GetFeature__Group_4__0 )? ) ;
    public final void rule__GetFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3559:1: ( ( ( rule__GetFeature__Group_4__0 )? ) )
            // InternalDataflowDSL.g:3560:1: ( ( rule__GetFeature__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:3560:1: ( ( rule__GetFeature__Group_4__0 )? )
            // InternalDataflowDSL.g:3561:2: ( rule__GetFeature__Group_4__0 )?
            {
             before(grammarAccess.getGetFeatureAccess().getGroup_4()); 
            // InternalDataflowDSL.g:3562:2: ( rule__GetFeature__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataflowDSL.g:3562:3: rule__GetFeature__Group_4__0
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
    // InternalDataflowDSL.g:3570:1: rule__GetFeature__Group__5 : rule__GetFeature__Group__5__Impl rule__GetFeature__Group__6 ;
    public final void rule__GetFeature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3574:1: ( rule__GetFeature__Group__5__Impl rule__GetFeature__Group__6 )
            // InternalDataflowDSL.g:3575:2: rule__GetFeature__Group__5__Impl rule__GetFeature__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflowDSL.g:3582:1: rule__GetFeature__Group__5__Impl : ( ( rule__GetFeature__Group_5__0 )? ) ;
    public final void rule__GetFeature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3586:1: ( ( ( rule__GetFeature__Group_5__0 )? ) )
            // InternalDataflowDSL.g:3587:1: ( ( rule__GetFeature__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:3587:1: ( ( rule__GetFeature__Group_5__0 )? )
            // InternalDataflowDSL.g:3588:2: ( rule__GetFeature__Group_5__0 )?
            {
             before(grammarAccess.getGetFeatureAccess().getGroup_5()); 
            // InternalDataflowDSL.g:3589:2: ( rule__GetFeature__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataflowDSL.g:3589:3: rule__GetFeature__Group_5__0
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
    // InternalDataflowDSL.g:3597:1: rule__GetFeature__Group__6 : rule__GetFeature__Group__6__Impl rule__GetFeature__Group__7 ;
    public final void rule__GetFeature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3601:1: ( rule__GetFeature__Group__6__Impl rule__GetFeature__Group__7 )
            // InternalDataflowDSL.g:3602:2: rule__GetFeature__Group__6__Impl rule__GetFeature__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflowDSL.g:3609:1: rule__GetFeature__Group__6__Impl : ( ( rule__GetFeature__Group_6__0 )? ) ;
    public final void rule__GetFeature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3613:1: ( ( ( rule__GetFeature__Group_6__0 )? ) )
            // InternalDataflowDSL.g:3614:1: ( ( rule__GetFeature__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:3614:1: ( ( rule__GetFeature__Group_6__0 )? )
            // InternalDataflowDSL.g:3615:2: ( rule__GetFeature__Group_6__0 )?
            {
             before(grammarAccess.getGetFeatureAccess().getGroup_6()); 
            // InternalDataflowDSL.g:3616:2: ( rule__GetFeature__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataflowDSL.g:3616:3: rule__GetFeature__Group_6__0
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
    // InternalDataflowDSL.g:3624:1: rule__GetFeature__Group__7 : rule__GetFeature__Group__7__Impl ;
    public final void rule__GetFeature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3628:1: ( rule__GetFeature__Group__7__Impl )
            // InternalDataflowDSL.g:3629:2: rule__GetFeature__Group__7__Impl
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
    // InternalDataflowDSL.g:3635:1: rule__GetFeature__Group__7__Impl : ( '}' ) ;
    public final void rule__GetFeature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3639:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3640:1: ( '}' )
            {
            // InternalDataflowDSL.g:3640:1: ( '}' )
            // InternalDataflowDSL.g:3641:2: '}'
            {
             before(grammarAccess.getGetFeatureAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3651:1: rule__GetFeature__Group_3__0 : rule__GetFeature__Group_3__0__Impl rule__GetFeature__Group_3__1 ;
    public final void rule__GetFeature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3655:1: ( rule__GetFeature__Group_3__0__Impl rule__GetFeature__Group_3__1 )
            // InternalDataflowDSL.g:3656:2: rule__GetFeature__Group_3__0__Impl rule__GetFeature__Group_3__1
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
    // InternalDataflowDSL.g:3663:1: rule__GetFeature__Group_3__0__Impl : ( 'objectField' ) ;
    public final void rule__GetFeature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3667:1: ( ( 'objectField' ) )
            // InternalDataflowDSL.g:3668:1: ( 'objectField' )
            {
            // InternalDataflowDSL.g:3668:1: ( 'objectField' )
            // InternalDataflowDSL.g:3669:2: 'objectField'
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldKeyword_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3678:1: rule__GetFeature__Group_3__1 : rule__GetFeature__Group_3__1__Impl ;
    public final void rule__GetFeature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3682:1: ( rule__GetFeature__Group_3__1__Impl )
            // InternalDataflowDSL.g:3683:2: rule__GetFeature__Group_3__1__Impl
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
    // InternalDataflowDSL.g:3689:1: rule__GetFeature__Group_3__1__Impl : ( ( rule__GetFeature__ObjectFieldAssignment_3_1 ) ) ;
    public final void rule__GetFeature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3693:1: ( ( ( rule__GetFeature__ObjectFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:3694:1: ( ( rule__GetFeature__ObjectFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:3694:1: ( ( rule__GetFeature__ObjectFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:3695:2: ( rule__GetFeature__ObjectFieldAssignment_3_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:3696:2: ( rule__GetFeature__ObjectFieldAssignment_3_1 )
            // InternalDataflowDSL.g:3696:3: rule__GetFeature__ObjectFieldAssignment_3_1
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
    // InternalDataflowDSL.g:3705:1: rule__GetFeature__Group_4__0 : rule__GetFeature__Group_4__0__Impl rule__GetFeature__Group_4__1 ;
    public final void rule__GetFeature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3709:1: ( rule__GetFeature__Group_4__0__Impl rule__GetFeature__Group_4__1 )
            // InternalDataflowDSL.g:3710:2: rule__GetFeature__Group_4__0__Impl rule__GetFeature__Group_4__1
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
    // InternalDataflowDSL.g:3717:1: rule__GetFeature__Group_4__0__Impl : ( 'valueField' ) ;
    public final void rule__GetFeature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3721:1: ( ( 'valueField' ) )
            // InternalDataflowDSL.g:3722:1: ( 'valueField' )
            {
            // InternalDataflowDSL.g:3722:1: ( 'valueField' )
            // InternalDataflowDSL.g:3723:2: 'valueField'
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldKeyword_4_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3732:1: rule__GetFeature__Group_4__1 : rule__GetFeature__Group_4__1__Impl ;
    public final void rule__GetFeature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3736:1: ( rule__GetFeature__Group_4__1__Impl )
            // InternalDataflowDSL.g:3737:2: rule__GetFeature__Group_4__1__Impl
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
    // InternalDataflowDSL.g:3743:1: rule__GetFeature__Group_4__1__Impl : ( ( rule__GetFeature__ValueFieldAssignment_4_1 ) ) ;
    public final void rule__GetFeature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3747:1: ( ( ( rule__GetFeature__ValueFieldAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:3748:1: ( ( rule__GetFeature__ValueFieldAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:3748:1: ( ( rule__GetFeature__ValueFieldAssignment_4_1 ) )
            // InternalDataflowDSL.g:3749:2: ( rule__GetFeature__ValueFieldAssignment_4_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldAssignment_4_1()); 
            // InternalDataflowDSL.g:3750:2: ( rule__GetFeature__ValueFieldAssignment_4_1 )
            // InternalDataflowDSL.g:3750:3: rule__GetFeature__ValueFieldAssignment_4_1
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
    // InternalDataflowDSL.g:3759:1: rule__GetFeature__Group_5__0 : rule__GetFeature__Group_5__0__Impl rule__GetFeature__Group_5__1 ;
    public final void rule__GetFeature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3763:1: ( rule__GetFeature__Group_5__0__Impl rule__GetFeature__Group_5__1 )
            // InternalDataflowDSL.g:3764:2: rule__GetFeature__Group_5__0__Impl rule__GetFeature__Group_5__1
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
    // InternalDataflowDSL.g:3771:1: rule__GetFeature__Group_5__0__Impl : ( 'feature' ) ;
    public final void rule__GetFeature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3775:1: ( ( 'feature' ) )
            // InternalDataflowDSL.g:3776:1: ( 'feature' )
            {
            // InternalDataflowDSL.g:3776:1: ( 'feature' )
            // InternalDataflowDSL.g:3777:2: 'feature'
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3786:1: rule__GetFeature__Group_5__1 : rule__GetFeature__Group_5__1__Impl ;
    public final void rule__GetFeature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3790:1: ( rule__GetFeature__Group_5__1__Impl )
            // InternalDataflowDSL.g:3791:2: rule__GetFeature__Group_5__1__Impl
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
    // InternalDataflowDSL.g:3797:1: rule__GetFeature__Group_5__1__Impl : ( ( rule__GetFeature__FeatureAssignment_5_1 ) ) ;
    public final void rule__GetFeature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3801:1: ( ( ( rule__GetFeature__FeatureAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:3802:1: ( ( rule__GetFeature__FeatureAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:3802:1: ( ( rule__GetFeature__FeatureAssignment_5_1 ) )
            // InternalDataflowDSL.g:3803:2: ( rule__GetFeature__FeatureAssignment_5_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureAssignment_5_1()); 
            // InternalDataflowDSL.g:3804:2: ( rule__GetFeature__FeatureAssignment_5_1 )
            // InternalDataflowDSL.g:3804:3: rule__GetFeature__FeatureAssignment_5_1
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
    // InternalDataflowDSL.g:3813:1: rule__GetFeature__Group_6__0 : rule__GetFeature__Group_6__0__Impl rule__GetFeature__Group_6__1 ;
    public final void rule__GetFeature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3817:1: ( rule__GetFeature__Group_6__0__Impl rule__GetFeature__Group_6__1 )
            // InternalDataflowDSL.g:3818:2: rule__GetFeature__Group_6__0__Impl rule__GetFeature__Group_6__1
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
    // InternalDataflowDSL.g:3825:1: rule__GetFeature__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__GetFeature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3829:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3830:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3830:1: ( 'target' )
            // InternalDataflowDSL.g:3831:2: 'target'
            {
             before(grammarAccess.getGetFeatureAccess().getTargetKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3840:1: rule__GetFeature__Group_6__1 : rule__GetFeature__Group_6__1__Impl ;
    public final void rule__GetFeature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3844:1: ( rule__GetFeature__Group_6__1__Impl )
            // InternalDataflowDSL.g:3845:2: rule__GetFeature__Group_6__1__Impl
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
    // InternalDataflowDSL.g:3851:1: rule__GetFeature__Group_6__1__Impl : ( ( rule__GetFeature__TargetAssignment_6_1 ) ) ;
    public final void rule__GetFeature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3855:1: ( ( ( rule__GetFeature__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:3856:1: ( ( rule__GetFeature__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:3856:1: ( ( rule__GetFeature__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:3857:2: ( rule__GetFeature__TargetAssignment_6_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:3858:2: ( rule__GetFeature__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:3858:3: rule__GetFeature__TargetAssignment_6_1
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
    // InternalDataflowDSL.g:3867:1: rule__SetFeature__Group__0 : rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 ;
    public final void rule__SetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3871:1: ( rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 )
            // InternalDataflowDSL.g:3872:2: rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1
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
    // InternalDataflowDSL.g:3879:1: rule__SetFeature__Group__0__Impl : ( 'SetFeature' ) ;
    public final void rule__SetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3883:1: ( ( 'SetFeature' ) )
            // InternalDataflowDSL.g:3884:1: ( 'SetFeature' )
            {
            // InternalDataflowDSL.g:3884:1: ( 'SetFeature' )
            // InternalDataflowDSL.g:3885:2: 'SetFeature'
            {
             before(grammarAccess.getSetFeatureAccess().getSetFeatureKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3894:1: rule__SetFeature__Group__1 : rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 ;
    public final void rule__SetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3898:1: ( rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 )
            // InternalDataflowDSL.g:3899:2: rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2
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
    // InternalDataflowDSL.g:3906:1: rule__SetFeature__Group__1__Impl : ( ( rule__SetFeature__NameAssignment_1 ) ) ;
    public final void rule__SetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3910:1: ( ( ( rule__SetFeature__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3911:1: ( ( rule__SetFeature__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3911:1: ( ( rule__SetFeature__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3912:2: ( rule__SetFeature__NameAssignment_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3913:2: ( rule__SetFeature__NameAssignment_1 )
            // InternalDataflowDSL.g:3913:3: rule__SetFeature__NameAssignment_1
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
    // InternalDataflowDSL.g:3921:1: rule__SetFeature__Group__2 : rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 ;
    public final void rule__SetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3925:1: ( rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 )
            // InternalDataflowDSL.g:3926:2: rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataflowDSL.g:3933:1: rule__SetFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__SetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3937:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3938:1: ( '{' )
            {
            // InternalDataflowDSL.g:3938:1: ( '{' )
            // InternalDataflowDSL.g:3939:2: '{'
            {
             before(grammarAccess.getSetFeatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3948:1: rule__SetFeature__Group__3 : rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4 ;
    public final void rule__SetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3952:1: ( rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4 )
            // InternalDataflowDSL.g:3953:2: rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataflowDSL.g:3960:1: rule__SetFeature__Group__3__Impl : ( ( rule__SetFeature__Group_3__0 )? ) ;
    public final void rule__SetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3964:1: ( ( ( rule__SetFeature__Group_3__0 )? ) )
            // InternalDataflowDSL.g:3965:1: ( ( rule__SetFeature__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:3965:1: ( ( rule__SetFeature__Group_3__0 )? )
            // InternalDataflowDSL.g:3966:2: ( rule__SetFeature__Group_3__0 )?
            {
             before(grammarAccess.getSetFeatureAccess().getGroup_3()); 
            // InternalDataflowDSL.g:3967:2: ( rule__SetFeature__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataflowDSL.g:3967:3: rule__SetFeature__Group_3__0
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
    // InternalDataflowDSL.g:3975:1: rule__SetFeature__Group__4 : rule__SetFeature__Group__4__Impl rule__SetFeature__Group__5 ;
    public final void rule__SetFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3979:1: ( rule__SetFeature__Group__4__Impl rule__SetFeature__Group__5 )
            // InternalDataflowDSL.g:3980:2: rule__SetFeature__Group__4__Impl rule__SetFeature__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataflowDSL.g:3987:1: rule__SetFeature__Group__4__Impl : ( ( rule__SetFeature__Group_4__0 )? ) ;
    public final void rule__SetFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3991:1: ( ( ( rule__SetFeature__Group_4__0 )? ) )
            // InternalDataflowDSL.g:3992:1: ( ( rule__SetFeature__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:3992:1: ( ( rule__SetFeature__Group_4__0 )? )
            // InternalDataflowDSL.g:3993:2: ( rule__SetFeature__Group_4__0 )?
            {
             before(grammarAccess.getSetFeatureAccess().getGroup_4()); 
            // InternalDataflowDSL.g:3994:2: ( rule__SetFeature__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataflowDSL.g:3994:3: rule__SetFeature__Group_4__0
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
    // InternalDataflowDSL.g:4002:1: rule__SetFeature__Group__5 : rule__SetFeature__Group__5__Impl rule__SetFeature__Group__6 ;
    public final void rule__SetFeature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4006:1: ( rule__SetFeature__Group__5__Impl rule__SetFeature__Group__6 )
            // InternalDataflowDSL.g:4007:2: rule__SetFeature__Group__5__Impl rule__SetFeature__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataflowDSL.g:4014:1: rule__SetFeature__Group__5__Impl : ( ( rule__SetFeature__Group_5__0 )? ) ;
    public final void rule__SetFeature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4018:1: ( ( ( rule__SetFeature__Group_5__0 )? ) )
            // InternalDataflowDSL.g:4019:1: ( ( rule__SetFeature__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:4019:1: ( ( rule__SetFeature__Group_5__0 )? )
            // InternalDataflowDSL.g:4020:2: ( rule__SetFeature__Group_5__0 )?
            {
             before(grammarAccess.getSetFeatureAccess().getGroup_5()); 
            // InternalDataflowDSL.g:4021:2: ( rule__SetFeature__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataflowDSL.g:4021:3: rule__SetFeature__Group_5__0
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
    // InternalDataflowDSL.g:4029:1: rule__SetFeature__Group__6 : rule__SetFeature__Group__6__Impl rule__SetFeature__Group__7 ;
    public final void rule__SetFeature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4033:1: ( rule__SetFeature__Group__6__Impl rule__SetFeature__Group__7 )
            // InternalDataflowDSL.g:4034:2: rule__SetFeature__Group__6__Impl rule__SetFeature__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataflowDSL.g:4041:1: rule__SetFeature__Group__6__Impl : ( ( rule__SetFeature__Group_6__0 )? ) ;
    public final void rule__SetFeature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4045:1: ( ( ( rule__SetFeature__Group_6__0 )? ) )
            // InternalDataflowDSL.g:4046:1: ( ( rule__SetFeature__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:4046:1: ( ( rule__SetFeature__Group_6__0 )? )
            // InternalDataflowDSL.g:4047:2: ( rule__SetFeature__Group_6__0 )?
            {
             before(grammarAccess.getSetFeatureAccess().getGroup_6()); 
            // InternalDataflowDSL.g:4048:2: ( rule__SetFeature__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataflowDSL.g:4048:3: rule__SetFeature__Group_6__0
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
    // InternalDataflowDSL.g:4056:1: rule__SetFeature__Group__7 : rule__SetFeature__Group__7__Impl ;
    public final void rule__SetFeature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4060:1: ( rule__SetFeature__Group__7__Impl )
            // InternalDataflowDSL.g:4061:2: rule__SetFeature__Group__7__Impl
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
    // InternalDataflowDSL.g:4067:1: rule__SetFeature__Group__7__Impl : ( '}' ) ;
    public final void rule__SetFeature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4071:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4072:1: ( '}' )
            {
            // InternalDataflowDSL.g:4072:1: ( '}' )
            // InternalDataflowDSL.g:4073:2: '}'
            {
             before(grammarAccess.getSetFeatureAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4083:1: rule__SetFeature__Group_3__0 : rule__SetFeature__Group_3__0__Impl rule__SetFeature__Group_3__1 ;
    public final void rule__SetFeature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4087:1: ( rule__SetFeature__Group_3__0__Impl rule__SetFeature__Group_3__1 )
            // InternalDataflowDSL.g:4088:2: rule__SetFeature__Group_3__0__Impl rule__SetFeature__Group_3__1
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
    // InternalDataflowDSL.g:4095:1: rule__SetFeature__Group_3__0__Impl : ( 'objectField' ) ;
    public final void rule__SetFeature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4099:1: ( ( 'objectField' ) )
            // InternalDataflowDSL.g:4100:1: ( 'objectField' )
            {
            // InternalDataflowDSL.g:4100:1: ( 'objectField' )
            // InternalDataflowDSL.g:4101:2: 'objectField'
            {
             before(grammarAccess.getSetFeatureAccess().getObjectFieldKeyword_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4110:1: rule__SetFeature__Group_3__1 : rule__SetFeature__Group_3__1__Impl ;
    public final void rule__SetFeature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4114:1: ( rule__SetFeature__Group_3__1__Impl )
            // InternalDataflowDSL.g:4115:2: rule__SetFeature__Group_3__1__Impl
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
    // InternalDataflowDSL.g:4121:1: rule__SetFeature__Group_3__1__Impl : ( ( rule__SetFeature__ObjectFieldAssignment_3_1 ) ) ;
    public final void rule__SetFeature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4125:1: ( ( ( rule__SetFeature__ObjectFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:4126:1: ( ( rule__SetFeature__ObjectFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:4126:1: ( ( rule__SetFeature__ObjectFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:4127:2: ( rule__SetFeature__ObjectFieldAssignment_3_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getObjectFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:4128:2: ( rule__SetFeature__ObjectFieldAssignment_3_1 )
            // InternalDataflowDSL.g:4128:3: rule__SetFeature__ObjectFieldAssignment_3_1
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
    // InternalDataflowDSL.g:4137:1: rule__SetFeature__Group_4__0 : rule__SetFeature__Group_4__0__Impl rule__SetFeature__Group_4__1 ;
    public final void rule__SetFeature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4141:1: ( rule__SetFeature__Group_4__0__Impl rule__SetFeature__Group_4__1 )
            // InternalDataflowDSL.g:4142:2: rule__SetFeature__Group_4__0__Impl rule__SetFeature__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:4149:1: rule__SetFeature__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__SetFeature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4153:1: ( ( 'value' ) )
            // InternalDataflowDSL.g:4154:1: ( 'value' )
            {
            // InternalDataflowDSL.g:4154:1: ( 'value' )
            // InternalDataflowDSL.g:4155:2: 'value'
            {
             before(grammarAccess.getSetFeatureAccess().getValueKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getValueKeyword_4_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:4164:1: rule__SetFeature__Group_4__1 : rule__SetFeature__Group_4__1__Impl ;
    public final void rule__SetFeature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4168:1: ( rule__SetFeature__Group_4__1__Impl )
            // InternalDataflowDSL.g:4169:2: rule__SetFeature__Group_4__1__Impl
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
    // InternalDataflowDSL.g:4175:1: rule__SetFeature__Group_4__1__Impl : ( ( rule__SetFeature__ValueAssignment_4_1 ) ) ;
    public final void rule__SetFeature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4179:1: ( ( ( rule__SetFeature__ValueAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:4180:1: ( ( rule__SetFeature__ValueAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:4180:1: ( ( rule__SetFeature__ValueAssignment_4_1 ) )
            // InternalDataflowDSL.g:4181:2: ( rule__SetFeature__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getValueAssignment_4_1()); 
            // InternalDataflowDSL.g:4182:2: ( rule__SetFeature__ValueAssignment_4_1 )
            // InternalDataflowDSL.g:4182:3: rule__SetFeature__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getValueAssignment_4_1()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:4191:1: rule__SetFeature__Group_5__0 : rule__SetFeature__Group_5__0__Impl rule__SetFeature__Group_5__1 ;
    public final void rule__SetFeature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4195:1: ( rule__SetFeature__Group_5__0__Impl rule__SetFeature__Group_5__1 )
            // InternalDataflowDSL.g:4196:2: rule__SetFeature__Group_5__0__Impl rule__SetFeature__Group_5__1
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
    // InternalDataflowDSL.g:4203:1: rule__SetFeature__Group_5__0__Impl : ( 'feature' ) ;
    public final void rule__SetFeature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4207:1: ( ( 'feature' ) )
            // InternalDataflowDSL.g:4208:1: ( 'feature' )
            {
            // InternalDataflowDSL.g:4208:1: ( 'feature' )
            // InternalDataflowDSL.g:4209:2: 'feature'
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4218:1: rule__SetFeature__Group_5__1 : rule__SetFeature__Group_5__1__Impl ;
    public final void rule__SetFeature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4222:1: ( rule__SetFeature__Group_5__1__Impl )
            // InternalDataflowDSL.g:4223:2: rule__SetFeature__Group_5__1__Impl
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
    // InternalDataflowDSL.g:4229:1: rule__SetFeature__Group_5__1__Impl : ( ( rule__SetFeature__FeatureAssignment_5_1 ) ) ;
    public final void rule__SetFeature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4233:1: ( ( ( rule__SetFeature__FeatureAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:4234:1: ( ( rule__SetFeature__FeatureAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:4234:1: ( ( rule__SetFeature__FeatureAssignment_5_1 ) )
            // InternalDataflowDSL.g:4235:2: ( rule__SetFeature__FeatureAssignment_5_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureAssignment_5_1()); 
            // InternalDataflowDSL.g:4236:2: ( rule__SetFeature__FeatureAssignment_5_1 )
            // InternalDataflowDSL.g:4236:3: rule__SetFeature__FeatureAssignment_5_1
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
    // InternalDataflowDSL.g:4245:1: rule__SetFeature__Group_6__0 : rule__SetFeature__Group_6__0__Impl rule__SetFeature__Group_6__1 ;
    public final void rule__SetFeature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4249:1: ( rule__SetFeature__Group_6__0__Impl rule__SetFeature__Group_6__1 )
            // InternalDataflowDSL.g:4250:2: rule__SetFeature__Group_6__0__Impl rule__SetFeature__Group_6__1
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
    // InternalDataflowDSL.g:4257:1: rule__SetFeature__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__SetFeature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4261:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4262:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4262:1: ( 'target' )
            // InternalDataflowDSL.g:4263:2: 'target'
            {
             before(grammarAccess.getSetFeatureAccess().getTargetKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4272:1: rule__SetFeature__Group_6__1 : rule__SetFeature__Group_6__1__Impl ;
    public final void rule__SetFeature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4276:1: ( rule__SetFeature__Group_6__1__Impl )
            // InternalDataflowDSL.g:4277:2: rule__SetFeature__Group_6__1__Impl
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
    // InternalDataflowDSL.g:4283:1: rule__SetFeature__Group_6__1__Impl : ( ( rule__SetFeature__TargetAssignment_6_1 ) ) ;
    public final void rule__SetFeature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4287:1: ( ( ( rule__SetFeature__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:4288:1: ( ( rule__SetFeature__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:4288:1: ( ( rule__SetFeature__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:4289:2: ( rule__SetFeature__TargetAssignment_6_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:4290:2: ( rule__SetFeature__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:4290:3: rule__SetFeature__TargetAssignment_6_1
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
    // InternalDataflowDSL.g:4299:1: rule__NewContainer__Group__0 : rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1 ;
    public final void rule__NewContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4303:1: ( rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1 )
            // InternalDataflowDSL.g:4304:2: rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1
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
    // InternalDataflowDSL.g:4311:1: rule__NewContainer__Group__0__Impl : ( 'NewContainer' ) ;
    public final void rule__NewContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4315:1: ( ( 'NewContainer' ) )
            // InternalDataflowDSL.g:4316:1: ( 'NewContainer' )
            {
            // InternalDataflowDSL.g:4316:1: ( 'NewContainer' )
            // InternalDataflowDSL.g:4317:2: 'NewContainer'
            {
             before(grammarAccess.getNewContainerAccess().getNewContainerKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4326:1: rule__NewContainer__Group__1 : rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2 ;
    public final void rule__NewContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4330:1: ( rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2 )
            // InternalDataflowDSL.g:4331:2: rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2
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
    // InternalDataflowDSL.g:4338:1: rule__NewContainer__Group__1__Impl : ( ( rule__NewContainer__NameAssignment_1 ) ) ;
    public final void rule__NewContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4342:1: ( ( ( rule__NewContainer__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4343:1: ( ( rule__NewContainer__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4343:1: ( ( rule__NewContainer__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4344:2: ( rule__NewContainer__NameAssignment_1 )
            {
             before(grammarAccess.getNewContainerAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4345:2: ( rule__NewContainer__NameAssignment_1 )
            // InternalDataflowDSL.g:4345:3: rule__NewContainer__NameAssignment_1
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
    // InternalDataflowDSL.g:4353:1: rule__NewContainer__Group__2 : rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3 ;
    public final void rule__NewContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4357:1: ( rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3 )
            // InternalDataflowDSL.g:4358:2: rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataflowDSL.g:4365:1: rule__NewContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__NewContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4369:1: ( ( '{' ) )
            // InternalDataflowDSL.g:4370:1: ( '{' )
            {
            // InternalDataflowDSL.g:4370:1: ( '{' )
            // InternalDataflowDSL.g:4371:2: '{'
            {
             before(grammarAccess.getNewContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4380:1: rule__NewContainer__Group__3 : rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4 ;
    public final void rule__NewContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4384:1: ( rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4 )
            // InternalDataflowDSL.g:4385:2: rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataflowDSL.g:4392:1: rule__NewContainer__Group__3__Impl : ( ( rule__NewContainer__Group_3__0 )? ) ;
    public final void rule__NewContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4396:1: ( ( ( rule__NewContainer__Group_3__0 )? ) )
            // InternalDataflowDSL.g:4397:1: ( ( rule__NewContainer__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:4397:1: ( ( rule__NewContainer__Group_3__0 )? )
            // InternalDataflowDSL.g:4398:2: ( rule__NewContainer__Group_3__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_3()); 
            // InternalDataflowDSL.g:4399:2: ( rule__NewContainer__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDataflowDSL.g:4399:3: rule__NewContainer__Group_3__0
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
    // InternalDataflowDSL.g:4407:1: rule__NewContainer__Group__4 : rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5 ;
    public final void rule__NewContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4411:1: ( rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5 )
            // InternalDataflowDSL.g:4412:2: rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataflowDSL.g:4419:1: rule__NewContainer__Group__4__Impl : ( ( rule__NewContainer__Group_4__0 )? ) ;
    public final void rule__NewContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4423:1: ( ( ( rule__NewContainer__Group_4__0 )? ) )
            // InternalDataflowDSL.g:4424:1: ( ( rule__NewContainer__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:4424:1: ( ( rule__NewContainer__Group_4__0 )? )
            // InternalDataflowDSL.g:4425:2: ( rule__NewContainer__Group_4__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_4()); 
            // InternalDataflowDSL.g:4426:2: ( rule__NewContainer__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDataflowDSL.g:4426:3: rule__NewContainer__Group_4__0
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
    // InternalDataflowDSL.g:4434:1: rule__NewContainer__Group__5 : rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6 ;
    public final void rule__NewContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4438:1: ( rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6 )
            // InternalDataflowDSL.g:4439:2: rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataflowDSL.g:4446:1: rule__NewContainer__Group__5__Impl : ( ( rule__NewContainer__Group_5__0 )? ) ;
    public final void rule__NewContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4450:1: ( ( ( rule__NewContainer__Group_5__0 )? ) )
            // InternalDataflowDSL.g:4451:1: ( ( rule__NewContainer__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:4451:1: ( ( rule__NewContainer__Group_5__0 )? )
            // InternalDataflowDSL.g:4452:2: ( rule__NewContainer__Group_5__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_5()); 
            // InternalDataflowDSL.g:4453:2: ( rule__NewContainer__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDataflowDSL.g:4453:3: rule__NewContainer__Group_5__0
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
    // InternalDataflowDSL.g:4461:1: rule__NewContainer__Group__6 : rule__NewContainer__Group__6__Impl ;
    public final void rule__NewContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4465:1: ( rule__NewContainer__Group__6__Impl )
            // InternalDataflowDSL.g:4466:2: rule__NewContainer__Group__6__Impl
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
    // InternalDataflowDSL.g:4472:1: rule__NewContainer__Group__6__Impl : ( '}' ) ;
    public final void rule__NewContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4476:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4477:1: ( '}' )
            {
            // InternalDataflowDSL.g:4477:1: ( '}' )
            // InternalDataflowDSL.g:4478:2: '}'
            {
             before(grammarAccess.getNewContainerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4488:1: rule__NewContainer__Group_3__0 : rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1 ;
    public final void rule__NewContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4492:1: ( rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1 )
            // InternalDataflowDSL.g:4493:2: rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1
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
    // InternalDataflowDSL.g:4500:1: rule__NewContainer__Group_3__0__Impl : ( 'listField' ) ;
    public final void rule__NewContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4504:1: ( ( 'listField' ) )
            // InternalDataflowDSL.g:4505:1: ( 'listField' )
            {
            // InternalDataflowDSL.g:4505:1: ( 'listField' )
            // InternalDataflowDSL.g:4506:2: 'listField'
            {
             before(grammarAccess.getNewContainerAccess().getListFieldKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4515:1: rule__NewContainer__Group_3__1 : rule__NewContainer__Group_3__1__Impl ;
    public final void rule__NewContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4519:1: ( rule__NewContainer__Group_3__1__Impl )
            // InternalDataflowDSL.g:4520:2: rule__NewContainer__Group_3__1__Impl
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
    // InternalDataflowDSL.g:4526:1: rule__NewContainer__Group_3__1__Impl : ( ( rule__NewContainer__ListFieldAssignment_3_1 ) ) ;
    public final void rule__NewContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4530:1: ( ( ( rule__NewContainer__ListFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:4531:1: ( ( rule__NewContainer__ListFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:4531:1: ( ( rule__NewContainer__ListFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:4532:2: ( rule__NewContainer__ListFieldAssignment_3_1 )
            {
             before(grammarAccess.getNewContainerAccess().getListFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:4533:2: ( rule__NewContainer__ListFieldAssignment_3_1 )
            // InternalDataflowDSL.g:4533:3: rule__NewContainer__ListFieldAssignment_3_1
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
    // InternalDataflowDSL.g:4542:1: rule__NewContainer__Group_4__0 : rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1 ;
    public final void rule__NewContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4546:1: ( rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1 )
            // InternalDataflowDSL.g:4547:2: rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDataflowDSL.g:4554:1: rule__NewContainer__Group_4__0__Impl : ( 'containerType' ) ;
    public final void rule__NewContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4558:1: ( ( 'containerType' ) )
            // InternalDataflowDSL.g:4559:1: ( 'containerType' )
            {
            // InternalDataflowDSL.g:4559:1: ( 'containerType' )
            // InternalDataflowDSL.g:4560:2: 'containerType'
            {
             before(grammarAccess.getNewContainerAccess().getContainerTypeKeyword_4_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4569:1: rule__NewContainer__Group_4__1 : rule__NewContainer__Group_4__1__Impl ;
    public final void rule__NewContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4573:1: ( rule__NewContainer__Group_4__1__Impl )
            // InternalDataflowDSL.g:4574:2: rule__NewContainer__Group_4__1__Impl
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
    // InternalDataflowDSL.g:4580:1: rule__NewContainer__Group_4__1__Impl : ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) ) ;
    public final void rule__NewContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4584:1: ( ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:4585:1: ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:4585:1: ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) )
            // InternalDataflowDSL.g:4586:2: ( rule__NewContainer__ContainerTypeAssignment_4_1 )
            {
             before(grammarAccess.getNewContainerAccess().getContainerTypeAssignment_4_1()); 
            // InternalDataflowDSL.g:4587:2: ( rule__NewContainer__ContainerTypeAssignment_4_1 )
            // InternalDataflowDSL.g:4587:3: rule__NewContainer__ContainerTypeAssignment_4_1
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
    // InternalDataflowDSL.g:4596:1: rule__NewContainer__Group_5__0 : rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1 ;
    public final void rule__NewContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4600:1: ( rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1 )
            // InternalDataflowDSL.g:4601:2: rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1
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
    // InternalDataflowDSL.g:4608:1: rule__NewContainer__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__NewContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4612:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4613:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4613:1: ( 'target' )
            // InternalDataflowDSL.g:4614:2: 'target'
            {
             before(grammarAccess.getNewContainerAccess().getTargetKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4623:1: rule__NewContainer__Group_5__1 : rule__NewContainer__Group_5__1__Impl ;
    public final void rule__NewContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4627:1: ( rule__NewContainer__Group_5__1__Impl )
            // InternalDataflowDSL.g:4628:2: rule__NewContainer__Group_5__1__Impl
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
    // InternalDataflowDSL.g:4634:1: rule__NewContainer__Group_5__1__Impl : ( ( rule__NewContainer__TargetAssignment_5_1 ) ) ;
    public final void rule__NewContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4638:1: ( ( ( rule__NewContainer__TargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:4639:1: ( ( rule__NewContainer__TargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:4639:1: ( ( rule__NewContainer__TargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:4640:2: ( rule__NewContainer__TargetAssignment_5_1 )
            {
             before(grammarAccess.getNewContainerAccess().getTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:4641:2: ( rule__NewContainer__TargetAssignment_5_1 )
            // InternalDataflowDSL.g:4641:3: rule__NewContainer__TargetAssignment_5_1
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
    // InternalDataflowDSL.g:4650:1: rule__AddToContainer__Group__0 : rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1 ;
    public final void rule__AddToContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4654:1: ( rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1 )
            // InternalDataflowDSL.g:4655:2: rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1
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
    // InternalDataflowDSL.g:4662:1: rule__AddToContainer__Group__0__Impl : ( 'AddToContainer' ) ;
    public final void rule__AddToContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4666:1: ( ( 'AddToContainer' ) )
            // InternalDataflowDSL.g:4667:1: ( 'AddToContainer' )
            {
            // InternalDataflowDSL.g:4667:1: ( 'AddToContainer' )
            // InternalDataflowDSL.g:4668:2: 'AddToContainer'
            {
             before(grammarAccess.getAddToContainerAccess().getAddToContainerKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4677:1: rule__AddToContainer__Group__1 : rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2 ;
    public final void rule__AddToContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4681:1: ( rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2 )
            // InternalDataflowDSL.g:4682:2: rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2
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
    // InternalDataflowDSL.g:4689:1: rule__AddToContainer__Group__1__Impl : ( ( rule__AddToContainer__NameAssignment_1 ) ) ;
    public final void rule__AddToContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4693:1: ( ( ( rule__AddToContainer__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4694:1: ( ( rule__AddToContainer__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4694:1: ( ( rule__AddToContainer__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4695:2: ( rule__AddToContainer__NameAssignment_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4696:2: ( rule__AddToContainer__NameAssignment_1 )
            // InternalDataflowDSL.g:4696:3: rule__AddToContainer__NameAssignment_1
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
    // InternalDataflowDSL.g:4704:1: rule__AddToContainer__Group__2 : rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3 ;
    public final void rule__AddToContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4708:1: ( rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3 )
            // InternalDataflowDSL.g:4709:2: rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataflowDSL.g:4716:1: rule__AddToContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__AddToContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4720:1: ( ( '{' ) )
            // InternalDataflowDSL.g:4721:1: ( '{' )
            {
            // InternalDataflowDSL.g:4721:1: ( '{' )
            // InternalDataflowDSL.g:4722:2: '{'
            {
             before(grammarAccess.getAddToContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4731:1: rule__AddToContainer__Group__3 : rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4 ;
    public final void rule__AddToContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4735:1: ( rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4 )
            // InternalDataflowDSL.g:4736:2: rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataflowDSL.g:4743:1: rule__AddToContainer__Group__3__Impl : ( ( rule__AddToContainer__Group_3__0 )? ) ;
    public final void rule__AddToContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4747:1: ( ( ( rule__AddToContainer__Group_3__0 )? ) )
            // InternalDataflowDSL.g:4748:1: ( ( rule__AddToContainer__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:4748:1: ( ( rule__AddToContainer__Group_3__0 )? )
            // InternalDataflowDSL.g:4749:2: ( rule__AddToContainer__Group_3__0 )?
            {
             before(grammarAccess.getAddToContainerAccess().getGroup_3()); 
            // InternalDataflowDSL.g:4750:2: ( rule__AddToContainer__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==57) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDataflowDSL.g:4750:3: rule__AddToContainer__Group_3__0
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
    // InternalDataflowDSL.g:4758:1: rule__AddToContainer__Group__4 : rule__AddToContainer__Group__4__Impl rule__AddToContainer__Group__5 ;
    public final void rule__AddToContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4762:1: ( rule__AddToContainer__Group__4__Impl rule__AddToContainer__Group__5 )
            // InternalDataflowDSL.g:4763:2: rule__AddToContainer__Group__4__Impl rule__AddToContainer__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataflowDSL.g:4770:1: rule__AddToContainer__Group__4__Impl : ( ( rule__AddToContainer__Group_4__0 )? ) ;
    public final void rule__AddToContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4774:1: ( ( ( rule__AddToContainer__Group_4__0 )? ) )
            // InternalDataflowDSL.g:4775:1: ( ( rule__AddToContainer__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:4775:1: ( ( rule__AddToContainer__Group_4__0 )? )
            // InternalDataflowDSL.g:4776:2: ( rule__AddToContainer__Group_4__0 )?
            {
             before(grammarAccess.getAddToContainerAccess().getGroup_4()); 
            // InternalDataflowDSL.g:4777:2: ( rule__AddToContainer__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDataflowDSL.g:4777:3: rule__AddToContainer__Group_4__0
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
    // InternalDataflowDSL.g:4785:1: rule__AddToContainer__Group__5 : rule__AddToContainer__Group__5__Impl rule__AddToContainer__Group__6 ;
    public final void rule__AddToContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4789:1: ( rule__AddToContainer__Group__5__Impl rule__AddToContainer__Group__6 )
            // InternalDataflowDSL.g:4790:2: rule__AddToContainer__Group__5__Impl rule__AddToContainer__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataflowDSL.g:4797:1: rule__AddToContainer__Group__5__Impl : ( ( rule__AddToContainer__Group_5__0 )? ) ;
    public final void rule__AddToContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4801:1: ( ( ( rule__AddToContainer__Group_5__0 )? ) )
            // InternalDataflowDSL.g:4802:1: ( ( rule__AddToContainer__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:4802:1: ( ( rule__AddToContainer__Group_5__0 )? )
            // InternalDataflowDSL.g:4803:2: ( rule__AddToContainer__Group_5__0 )?
            {
             before(grammarAccess.getAddToContainerAccess().getGroup_5()); 
            // InternalDataflowDSL.g:4804:2: ( rule__AddToContainer__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==60) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDataflowDSL.g:4804:3: rule__AddToContainer__Group_5__0
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
    // InternalDataflowDSL.g:4812:1: rule__AddToContainer__Group__6 : rule__AddToContainer__Group__6__Impl rule__AddToContainer__Group__7 ;
    public final void rule__AddToContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4816:1: ( rule__AddToContainer__Group__6__Impl rule__AddToContainer__Group__7 )
            // InternalDataflowDSL.g:4817:2: rule__AddToContainer__Group__6__Impl rule__AddToContainer__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataflowDSL.g:4824:1: rule__AddToContainer__Group__6__Impl : ( ( rule__AddToContainer__Group_6__0 )? ) ;
    public final void rule__AddToContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4828:1: ( ( ( rule__AddToContainer__Group_6__0 )? ) )
            // InternalDataflowDSL.g:4829:1: ( ( rule__AddToContainer__Group_6__0 )? )
            {
            // InternalDataflowDSL.g:4829:1: ( ( rule__AddToContainer__Group_6__0 )? )
            // InternalDataflowDSL.g:4830:2: ( rule__AddToContainer__Group_6__0 )?
            {
             before(grammarAccess.getAddToContainerAccess().getGroup_6()); 
            // InternalDataflowDSL.g:4831:2: ( rule__AddToContainer__Group_6__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDataflowDSL.g:4831:3: rule__AddToContainer__Group_6__0
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
    // InternalDataflowDSL.g:4839:1: rule__AddToContainer__Group__7 : rule__AddToContainer__Group__7__Impl ;
    public final void rule__AddToContainer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4843:1: ( rule__AddToContainer__Group__7__Impl )
            // InternalDataflowDSL.g:4844:2: rule__AddToContainer__Group__7__Impl
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
    // InternalDataflowDSL.g:4850:1: rule__AddToContainer__Group__7__Impl : ( '}' ) ;
    public final void rule__AddToContainer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4854:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4855:1: ( '}' )
            {
            // InternalDataflowDSL.g:4855:1: ( '}' )
            // InternalDataflowDSL.g:4856:2: '}'
            {
             before(grammarAccess.getAddToContainerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4866:1: rule__AddToContainer__Group_3__0 : rule__AddToContainer__Group_3__0__Impl rule__AddToContainer__Group_3__1 ;
    public final void rule__AddToContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4870:1: ( rule__AddToContainer__Group_3__0__Impl rule__AddToContainer__Group_3__1 )
            // InternalDataflowDSL.g:4871:2: rule__AddToContainer__Group_3__0__Impl rule__AddToContainer__Group_3__1
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
    // InternalDataflowDSL.g:4878:1: rule__AddToContainer__Group_3__0__Impl : ( 'listField' ) ;
    public final void rule__AddToContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4882:1: ( ( 'listField' ) )
            // InternalDataflowDSL.g:4883:1: ( 'listField' )
            {
            // InternalDataflowDSL.g:4883:1: ( 'listField' )
            // InternalDataflowDSL.g:4884:2: 'listField'
            {
             before(grammarAccess.getAddToContainerAccess().getListFieldKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4893:1: rule__AddToContainer__Group_3__1 : rule__AddToContainer__Group_3__1__Impl ;
    public final void rule__AddToContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4897:1: ( rule__AddToContainer__Group_3__1__Impl )
            // InternalDataflowDSL.g:4898:2: rule__AddToContainer__Group_3__1__Impl
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
    // InternalDataflowDSL.g:4904:1: rule__AddToContainer__Group_3__1__Impl : ( ( rule__AddToContainer__ListFieldAssignment_3_1 ) ) ;
    public final void rule__AddToContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4908:1: ( ( ( rule__AddToContainer__ListFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:4909:1: ( ( rule__AddToContainer__ListFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:4909:1: ( ( rule__AddToContainer__ListFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:4910:2: ( rule__AddToContainer__ListFieldAssignment_3_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getListFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:4911:2: ( rule__AddToContainer__ListFieldAssignment_3_1 )
            // InternalDataflowDSL.g:4911:3: rule__AddToContainer__ListFieldAssignment_3_1
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
    // InternalDataflowDSL.g:4920:1: rule__AddToContainer__Group_4__0 : rule__AddToContainer__Group_4__0__Impl rule__AddToContainer__Group_4__1 ;
    public final void rule__AddToContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4924:1: ( rule__AddToContainer__Group_4__0__Impl rule__AddToContainer__Group_4__1 )
            // InternalDataflowDSL.g:4925:2: rule__AddToContainer__Group_4__0__Impl rule__AddToContainer__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:4932:1: rule__AddToContainer__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__AddToContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4936:1: ( ( 'value' ) )
            // InternalDataflowDSL.g:4937:1: ( 'value' )
            {
            // InternalDataflowDSL.g:4937:1: ( 'value' )
            // InternalDataflowDSL.g:4938:2: 'value'
            {
             before(grammarAccess.getAddToContainerAccess().getValueKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getValueKeyword_4_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:4947:1: rule__AddToContainer__Group_4__1 : rule__AddToContainer__Group_4__1__Impl ;
    public final void rule__AddToContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4951:1: ( rule__AddToContainer__Group_4__1__Impl )
            // InternalDataflowDSL.g:4952:2: rule__AddToContainer__Group_4__1__Impl
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
    // InternalDataflowDSL.g:4958:1: rule__AddToContainer__Group_4__1__Impl : ( ( rule__AddToContainer__ValueAssignment_4_1 ) ) ;
    public final void rule__AddToContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4962:1: ( ( ( rule__AddToContainer__ValueAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:4963:1: ( ( rule__AddToContainer__ValueAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:4963:1: ( ( rule__AddToContainer__ValueAssignment_4_1 ) )
            // InternalDataflowDSL.g:4964:2: ( rule__AddToContainer__ValueAssignment_4_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getValueAssignment_4_1()); 
            // InternalDataflowDSL.g:4965:2: ( rule__AddToContainer__ValueAssignment_4_1 )
            // InternalDataflowDSL.g:4965:3: rule__AddToContainer__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getValueAssignment_4_1()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:4974:1: rule__AddToContainer__Group_5__0 : rule__AddToContainer__Group_5__0__Impl rule__AddToContainer__Group_5__1 ;
    public final void rule__AddToContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4978:1: ( rule__AddToContainer__Group_5__0__Impl rule__AddToContainer__Group_5__1 )
            // InternalDataflowDSL.g:4979:2: rule__AddToContainer__Group_5__0__Impl rule__AddToContainer__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:4986:1: rule__AddToContainer__Group_5__0__Impl : ( 'position' ) ;
    public final void rule__AddToContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4990:1: ( ( 'position' ) )
            // InternalDataflowDSL.g:4991:1: ( 'position' )
            {
            // InternalDataflowDSL.g:4991:1: ( 'position' )
            // InternalDataflowDSL.g:4992:2: 'position'
            {
             before(grammarAccess.getAddToContainerAccess().getPositionKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getPositionKeyword_5_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:5001:1: rule__AddToContainer__Group_5__1 : rule__AddToContainer__Group_5__1__Impl ;
    public final void rule__AddToContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5005:1: ( rule__AddToContainer__Group_5__1__Impl )
            // InternalDataflowDSL.g:5006:2: rule__AddToContainer__Group_5__1__Impl
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
    // InternalDataflowDSL.g:5012:1: rule__AddToContainer__Group_5__1__Impl : ( ( rule__AddToContainer__PositionAssignment_5_1 ) ) ;
    public final void rule__AddToContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5016:1: ( ( ( rule__AddToContainer__PositionAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:5017:1: ( ( rule__AddToContainer__PositionAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:5017:1: ( ( rule__AddToContainer__PositionAssignment_5_1 ) )
            // InternalDataflowDSL.g:5018:2: ( rule__AddToContainer__PositionAssignment_5_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getPositionAssignment_5_1()); 
            // InternalDataflowDSL.g:5019:2: ( rule__AddToContainer__PositionAssignment_5_1 )
            // InternalDataflowDSL.g:5019:3: rule__AddToContainer__PositionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__PositionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getPositionAssignment_5_1()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:5028:1: rule__AddToContainer__Group_6__0 : rule__AddToContainer__Group_6__0__Impl rule__AddToContainer__Group_6__1 ;
    public final void rule__AddToContainer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5032:1: ( rule__AddToContainer__Group_6__0__Impl rule__AddToContainer__Group_6__1 )
            // InternalDataflowDSL.g:5033:2: rule__AddToContainer__Group_6__0__Impl rule__AddToContainer__Group_6__1
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
    // InternalDataflowDSL.g:5040:1: rule__AddToContainer__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__AddToContainer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5044:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5045:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5045:1: ( 'target' )
            // InternalDataflowDSL.g:5046:2: 'target'
            {
             before(grammarAccess.getAddToContainerAccess().getTargetKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:5055:1: rule__AddToContainer__Group_6__1 : rule__AddToContainer__Group_6__1__Impl ;
    public final void rule__AddToContainer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5059:1: ( rule__AddToContainer__Group_6__1__Impl )
            // InternalDataflowDSL.g:5060:2: rule__AddToContainer__Group_6__1__Impl
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
    // InternalDataflowDSL.g:5066:1: rule__AddToContainer__Group_6__1__Impl : ( ( rule__AddToContainer__TargetAssignment_6_1 ) ) ;
    public final void rule__AddToContainer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5070:1: ( ( ( rule__AddToContainer__TargetAssignment_6_1 ) ) )
            // InternalDataflowDSL.g:5071:1: ( ( rule__AddToContainer__TargetAssignment_6_1 ) )
            {
            // InternalDataflowDSL.g:5071:1: ( ( rule__AddToContainer__TargetAssignment_6_1 ) )
            // InternalDataflowDSL.g:5072:2: ( rule__AddToContainer__TargetAssignment_6_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getTargetAssignment_6_1()); 
            // InternalDataflowDSL.g:5073:2: ( rule__AddToContainer__TargetAssignment_6_1 )
            // InternalDataflowDSL.g:5073:3: rule__AddToContainer__TargetAssignment_6_1
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


    // $ANTLR start "rule__ForEach__Group__0"
    // InternalDataflowDSL.g:5082:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5086:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalDataflowDSL.g:5087:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ForEach__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__1();

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
    // $ANTLR end "rule__ForEach__Group__0"


    // $ANTLR start "rule__ForEach__Group__0__Impl"
    // InternalDataflowDSL.g:5094:1: rule__ForEach__Group__0__Impl : ( 'ForEach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5098:1: ( ( 'ForEach' ) )
            // InternalDataflowDSL.g:5099:1: ( 'ForEach' )
            {
            // InternalDataflowDSL.g:5099:1: ( 'ForEach' )
            // InternalDataflowDSL.g:5100:2: 'ForEach'
            {
             before(grammarAccess.getForEachAccess().getForEachKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getForEachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__0__Impl"


    // $ANTLR start "rule__ForEach__Group__1"
    // InternalDataflowDSL.g:5109:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5113:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalDataflowDSL.g:5114:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ForEach__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__2();

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
    // $ANTLR end "rule__ForEach__Group__1"


    // $ANTLR start "rule__ForEach__Group__1__Impl"
    // InternalDataflowDSL.g:5121:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__NameAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5125:1: ( ( ( rule__ForEach__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:5126:1: ( ( rule__ForEach__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:5126:1: ( ( rule__ForEach__NameAssignment_1 ) )
            // InternalDataflowDSL.g:5127:2: ( rule__ForEach__NameAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:5128:2: ( rule__ForEach__NameAssignment_1 )
            // InternalDataflowDSL.g:5128:3: rule__ForEach__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__1__Impl"


    // $ANTLR start "rule__ForEach__Group__2"
    // InternalDataflowDSL.g:5136:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5140:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalDataflowDSL.g:5141:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ForEach__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__3();

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
    // $ANTLR end "rule__ForEach__Group__2"


    // $ANTLR start "rule__ForEach__Group__2__Impl"
    // InternalDataflowDSL.g:5148:1: rule__ForEach__Group__2__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5152:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5153:1: ( '{' )
            {
            // InternalDataflowDSL.g:5153:1: ( '{' )
            // InternalDataflowDSL.g:5154:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__2__Impl"


    // $ANTLR start "rule__ForEach__Group__3"
    // InternalDataflowDSL.g:5163:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5167:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalDataflowDSL.g:5168:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ForEach__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__4();

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
    // $ANTLR end "rule__ForEach__Group__3"


    // $ANTLR start "rule__ForEach__Group__3__Impl"
    // InternalDataflowDSL.g:5175:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__Group_3__0 )? ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5179:1: ( ( ( rule__ForEach__Group_3__0 )? ) )
            // InternalDataflowDSL.g:5180:1: ( ( rule__ForEach__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:5180:1: ( ( rule__ForEach__Group_3__0 )? )
            // InternalDataflowDSL.g:5181:2: ( rule__ForEach__Group_3__0 )?
            {
             before(grammarAccess.getForEachAccess().getGroup_3()); 
            // InternalDataflowDSL.g:5182:2: ( rule__ForEach__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDataflowDSL.g:5182:3: rule__ForEach__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEach__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForEachAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__3__Impl"


    // $ANTLR start "rule__ForEach__Group__4"
    // InternalDataflowDSL.g:5190:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5194:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalDataflowDSL.g:5195:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__ForEach__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__5();

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
    // $ANTLR end "rule__ForEach__Group__4"


    // $ANTLR start "rule__ForEach__Group__4__Impl"
    // InternalDataflowDSL.g:5202:1: rule__ForEach__Group__4__Impl : ( ( rule__ForEach__Group_4__0 )? ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5206:1: ( ( ( rule__ForEach__Group_4__0 )? ) )
            // InternalDataflowDSL.g:5207:1: ( ( rule__ForEach__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:5207:1: ( ( rule__ForEach__Group_4__0 )? )
            // InternalDataflowDSL.g:5208:2: ( rule__ForEach__Group_4__0 )?
            {
             before(grammarAccess.getForEachAccess().getGroup_4()); 
            // InternalDataflowDSL.g:5209:2: ( rule__ForEach__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDataflowDSL.g:5209:3: rule__ForEach__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEach__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForEachAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__4__Impl"


    // $ANTLR start "rule__ForEach__Group__5"
    // InternalDataflowDSL.g:5217:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5221:1: ( rule__ForEach__Group__5__Impl )
            // InternalDataflowDSL.g:5222:2: rule__ForEach__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__5__Impl();

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
    // $ANTLR end "rule__ForEach__Group__5"


    // $ANTLR start "rule__ForEach__Group__5__Impl"
    // InternalDataflowDSL.g:5228:1: rule__ForEach__Group__5__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5232:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5233:1: ( '}' )
            {
            // InternalDataflowDSL.g:5233:1: ( '}' )
            // InternalDataflowDSL.g:5234:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group__5__Impl"


    // $ANTLR start "rule__ForEach__Group_3__0"
    // InternalDataflowDSL.g:5244:1: rule__ForEach__Group_3__0 : rule__ForEach__Group_3__0__Impl rule__ForEach__Group_3__1 ;
    public final void rule__ForEach__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5248:1: ( rule__ForEach__Group_3__0__Impl rule__ForEach__Group_3__1 )
            // InternalDataflowDSL.g:5249:2: rule__ForEach__Group_3__0__Impl rule__ForEach__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ForEach__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3__1();

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
    // $ANTLR end "rule__ForEach__Group_3__0"


    // $ANTLR start "rule__ForEach__Group_3__0__Impl"
    // InternalDataflowDSL.g:5256:1: rule__ForEach__Group_3__0__Impl : ( 'listField' ) ;
    public final void rule__ForEach__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5260:1: ( ( 'listField' ) )
            // InternalDataflowDSL.g:5261:1: ( 'listField' )
            {
            // InternalDataflowDSL.g:5261:1: ( 'listField' )
            // InternalDataflowDSL.g:5262:2: 'listField'
            {
             before(grammarAccess.getForEachAccess().getListFieldKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getListFieldKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3__0__Impl"


    // $ANTLR start "rule__ForEach__Group_3__1"
    // InternalDataflowDSL.g:5271:1: rule__ForEach__Group_3__1 : rule__ForEach__Group_3__1__Impl ;
    public final void rule__ForEach__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5275:1: ( rule__ForEach__Group_3__1__Impl )
            // InternalDataflowDSL.g:5276:2: rule__ForEach__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3__1__Impl();

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
    // $ANTLR end "rule__ForEach__Group_3__1"


    // $ANTLR start "rule__ForEach__Group_3__1__Impl"
    // InternalDataflowDSL.g:5282:1: rule__ForEach__Group_3__1__Impl : ( ( rule__ForEach__ListFieldAssignment_3_1 ) ) ;
    public final void rule__ForEach__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5286:1: ( ( ( rule__ForEach__ListFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:5287:1: ( ( rule__ForEach__ListFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:5287:1: ( ( rule__ForEach__ListFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:5288:2: ( rule__ForEach__ListFieldAssignment_3_1 )
            {
             before(grammarAccess.getForEachAccess().getListFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:5289:2: ( rule__ForEach__ListFieldAssignment_3_1 )
            // InternalDataflowDSL.g:5289:3: rule__ForEach__ListFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__ListFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getListFieldAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3__1__Impl"


    // $ANTLR start "rule__ForEach__Group_4__0"
    // InternalDataflowDSL.g:5298:1: rule__ForEach__Group_4__0 : rule__ForEach__Group_4__0__Impl rule__ForEach__Group_4__1 ;
    public final void rule__ForEach__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5302:1: ( rule__ForEach__Group_4__0__Impl rule__ForEach__Group_4__1 )
            // InternalDataflowDSL.g:5303:2: rule__ForEach__Group_4__0__Impl rule__ForEach__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ForEach__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group_4__1();

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
    // $ANTLR end "rule__ForEach__Group_4__0"


    // $ANTLR start "rule__ForEach__Group_4__0__Impl"
    // InternalDataflowDSL.g:5310:1: rule__ForEach__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__ForEach__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5314:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5315:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5315:1: ( 'target' )
            // InternalDataflowDSL.g:5316:2: 'target'
            {
             before(grammarAccess.getForEachAccess().getTargetKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getTargetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_4__0__Impl"


    // $ANTLR start "rule__ForEach__Group_4__1"
    // InternalDataflowDSL.g:5325:1: rule__ForEach__Group_4__1 : rule__ForEach__Group_4__1__Impl ;
    public final void rule__ForEach__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5329:1: ( rule__ForEach__Group_4__1__Impl )
            // InternalDataflowDSL.g:5330:2: rule__ForEach__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group_4__1__Impl();

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
    // $ANTLR end "rule__ForEach__Group_4__1"


    // $ANTLR start "rule__ForEach__Group_4__1__Impl"
    // InternalDataflowDSL.g:5336:1: rule__ForEach__Group_4__1__Impl : ( ( rule__ForEach__TargetAssignment_4_1 ) ) ;
    public final void rule__ForEach__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5340:1: ( ( ( rule__ForEach__TargetAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:5341:1: ( ( rule__ForEach__TargetAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:5341:1: ( ( rule__ForEach__TargetAssignment_4_1 ) )
            // InternalDataflowDSL.g:5342:2: ( rule__ForEach__TargetAssignment_4_1 )
            {
             before(grammarAccess.getForEachAccess().getTargetAssignment_4_1()); 
            // InternalDataflowDSL.g:5343:2: ( rule__ForEach__TargetAssignment_4_1 )
            // InternalDataflowDSL.g:5343:3: rule__ForEach__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getTargetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_4__1__Impl"


    // $ANTLR start "rule__CollectBy__Group__0"
    // InternalDataflowDSL.g:5352:1: rule__CollectBy__Group__0 : rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1 ;
    public final void rule__CollectBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5356:1: ( rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1 )
            // InternalDataflowDSL.g:5357:2: rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CollectBy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__1();

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
    // $ANTLR end "rule__CollectBy__Group__0"


    // $ANTLR start "rule__CollectBy__Group__0__Impl"
    // InternalDataflowDSL.g:5364:1: rule__CollectBy__Group__0__Impl : ( 'CollectBy' ) ;
    public final void rule__CollectBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5368:1: ( ( 'CollectBy' ) )
            // InternalDataflowDSL.g:5369:1: ( 'CollectBy' )
            {
            // InternalDataflowDSL.g:5369:1: ( 'CollectBy' )
            // InternalDataflowDSL.g:5370:2: 'CollectBy'
            {
             before(grammarAccess.getCollectByAccess().getCollectByKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getCollectByKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group__0__Impl"


    // $ANTLR start "rule__CollectBy__Group__1"
    // InternalDataflowDSL.g:5379:1: rule__CollectBy__Group__1 : rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2 ;
    public final void rule__CollectBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5383:1: ( rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2 )
            // InternalDataflowDSL.g:5384:2: rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CollectBy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__2();

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
    // $ANTLR end "rule__CollectBy__Group__1"


    // $ANTLR start "rule__CollectBy__Group__1__Impl"
    // InternalDataflowDSL.g:5391:1: rule__CollectBy__Group__1__Impl : ( ( rule__CollectBy__NameAssignment_1 ) ) ;
    public final void rule__CollectBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5395:1: ( ( ( rule__CollectBy__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:5396:1: ( ( rule__CollectBy__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:5396:1: ( ( rule__CollectBy__NameAssignment_1 ) )
            // InternalDataflowDSL.g:5397:2: ( rule__CollectBy__NameAssignment_1 )
            {
             before(grammarAccess.getCollectByAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:5398:2: ( rule__CollectBy__NameAssignment_1 )
            // InternalDataflowDSL.g:5398:3: rule__CollectBy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group__1__Impl"


    // $ANTLR start "rule__CollectBy__Group__2"
    // InternalDataflowDSL.g:5406:1: rule__CollectBy__Group__2 : rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3 ;
    public final void rule__CollectBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5410:1: ( rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3 )
            // InternalDataflowDSL.g:5411:2: rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__CollectBy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__3();

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
    // $ANTLR end "rule__CollectBy__Group__2"


    // $ANTLR start "rule__CollectBy__Group__2__Impl"
    // InternalDataflowDSL.g:5418:1: rule__CollectBy__Group__2__Impl : ( '{' ) ;
    public final void rule__CollectBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5422:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5423:1: ( '{' )
            {
            // InternalDataflowDSL.g:5423:1: ( '{' )
            // InternalDataflowDSL.g:5424:2: '{'
            {
             before(grammarAccess.getCollectByAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group__2__Impl"


    // $ANTLR start "rule__CollectBy__Group__3"
    // InternalDataflowDSL.g:5433:1: rule__CollectBy__Group__3 : rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4 ;
    public final void rule__CollectBy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5437:1: ( rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4 )
            // InternalDataflowDSL.g:5438:2: rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__CollectBy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__4();

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
    // $ANTLR end "rule__CollectBy__Group__3"


    // $ANTLR start "rule__CollectBy__Group__3__Impl"
    // InternalDataflowDSL.g:5445:1: rule__CollectBy__Group__3__Impl : ( ( rule__CollectBy__Group_3__0 )? ) ;
    public final void rule__CollectBy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5449:1: ( ( ( rule__CollectBy__Group_3__0 )? ) )
            // InternalDataflowDSL.g:5450:1: ( ( rule__CollectBy__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:5450:1: ( ( rule__CollectBy__Group_3__0 )? )
            // InternalDataflowDSL.g:5451:2: ( rule__CollectBy__Group_3__0 )?
            {
             before(grammarAccess.getCollectByAccess().getGroup_3()); 
            // InternalDataflowDSL.g:5452:2: ( rule__CollectBy__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDataflowDSL.g:5452:3: rule__CollectBy__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectBy__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectByAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group__3__Impl"


    // $ANTLR start "rule__CollectBy__Group__4"
    // InternalDataflowDSL.g:5460:1: rule__CollectBy__Group__4 : rule__CollectBy__Group__4__Impl rule__CollectBy__Group__5 ;
    public final void rule__CollectBy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5464:1: ( rule__CollectBy__Group__4__Impl rule__CollectBy__Group__5 )
            // InternalDataflowDSL.g:5465:2: rule__CollectBy__Group__4__Impl rule__CollectBy__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__CollectBy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__5();

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
    // $ANTLR end "rule__CollectBy__Group__4"


    // $ANTLR start "rule__CollectBy__Group__4__Impl"
    // InternalDataflowDSL.g:5472:1: rule__CollectBy__Group__4__Impl : ( ( rule__CollectBy__Group_4__0 )? ) ;
    public final void rule__CollectBy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5476:1: ( ( ( rule__CollectBy__Group_4__0 )? ) )
            // InternalDataflowDSL.g:5477:1: ( ( rule__CollectBy__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:5477:1: ( ( rule__CollectBy__Group_4__0 )? )
            // InternalDataflowDSL.g:5478:2: ( rule__CollectBy__Group_4__0 )?
            {
             before(grammarAccess.getCollectByAccess().getGroup_4()); 
            // InternalDataflowDSL.g:5479:2: ( rule__CollectBy__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==64) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDataflowDSL.g:5479:3: rule__CollectBy__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectBy__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectByAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group__4__Impl"


    // $ANTLR start "rule__CollectBy__Group__5"
    // InternalDataflowDSL.g:5487:1: rule__CollectBy__Group__5 : rule__CollectBy__Group__5__Impl rule__CollectBy__Group__6 ;
    public final void rule__CollectBy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5491:1: ( rule__CollectBy__Group__5__Impl rule__CollectBy__Group__6 )
            // InternalDataflowDSL.g:5492:2: rule__CollectBy__Group__5__Impl rule__CollectBy__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__CollectBy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__6();

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
    // $ANTLR end "rule__CollectBy__Group__5"


    // $ANTLR start "rule__CollectBy__Group__5__Impl"
    // InternalDataflowDSL.g:5499:1: rule__CollectBy__Group__5__Impl : ( ( rule__CollectBy__Group_5__0 )? ) ;
    public final void rule__CollectBy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5503:1: ( ( ( rule__CollectBy__Group_5__0 )? ) )
            // InternalDataflowDSL.g:5504:1: ( ( rule__CollectBy__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:5504:1: ( ( rule__CollectBy__Group_5__0 )? )
            // InternalDataflowDSL.g:5505:2: ( rule__CollectBy__Group_5__0 )?
            {
             before(grammarAccess.getCollectByAccess().getGroup_5()); 
            // InternalDataflowDSL.g:5506:2: ( rule__CollectBy__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDataflowDSL.g:5506:3: rule__CollectBy__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectBy__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectByAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group__5__Impl"


    // $ANTLR start "rule__CollectBy__Group__6"
    // InternalDataflowDSL.g:5514:1: rule__CollectBy__Group__6 : rule__CollectBy__Group__6__Impl ;
    public final void rule__CollectBy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5518:1: ( rule__CollectBy__Group__6__Impl )
            // InternalDataflowDSL.g:5519:2: rule__CollectBy__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__6__Impl();

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
    // $ANTLR end "rule__CollectBy__Group__6"


    // $ANTLR start "rule__CollectBy__Group__6__Impl"
    // InternalDataflowDSL.g:5525:1: rule__CollectBy__Group__6__Impl : ( '}' ) ;
    public final void rule__CollectBy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5529:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5530:1: ( '}' )
            {
            // InternalDataflowDSL.g:5530:1: ( '}' )
            // InternalDataflowDSL.g:5531:2: '}'
            {
             before(grammarAccess.getCollectByAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group__6__Impl"


    // $ANTLR start "rule__CollectBy__Group_3__0"
    // InternalDataflowDSL.g:5541:1: rule__CollectBy__Group_3__0 : rule__CollectBy__Group_3__0__Impl rule__CollectBy__Group_3__1 ;
    public final void rule__CollectBy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5545:1: ( rule__CollectBy__Group_3__0__Impl rule__CollectBy__Group_3__1 )
            // InternalDataflowDSL.g:5546:2: rule__CollectBy__Group_3__0__Impl rule__CollectBy__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__CollectBy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_3__1();

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
    // $ANTLR end "rule__CollectBy__Group_3__0"


    // $ANTLR start "rule__CollectBy__Group_3__0__Impl"
    // InternalDataflowDSL.g:5553:1: rule__CollectBy__Group_3__0__Impl : ( 'elementField' ) ;
    public final void rule__CollectBy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5557:1: ( ( 'elementField' ) )
            // InternalDataflowDSL.g:5558:1: ( 'elementField' )
            {
            // InternalDataflowDSL.g:5558:1: ( 'elementField' )
            // InternalDataflowDSL.g:5559:2: 'elementField'
            {
             before(grammarAccess.getCollectByAccess().getElementFieldKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getElementFieldKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3__0__Impl"


    // $ANTLR start "rule__CollectBy__Group_3__1"
    // InternalDataflowDSL.g:5568:1: rule__CollectBy__Group_3__1 : rule__CollectBy__Group_3__1__Impl ;
    public final void rule__CollectBy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5572:1: ( rule__CollectBy__Group_3__1__Impl )
            // InternalDataflowDSL.g:5573:2: rule__CollectBy__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_3__1__Impl();

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
    // $ANTLR end "rule__CollectBy__Group_3__1"


    // $ANTLR start "rule__CollectBy__Group_3__1__Impl"
    // InternalDataflowDSL.g:5579:1: rule__CollectBy__Group_3__1__Impl : ( ( rule__CollectBy__ElementFieldAssignment_3_1 ) ) ;
    public final void rule__CollectBy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5583:1: ( ( ( rule__CollectBy__ElementFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:5584:1: ( ( rule__CollectBy__ElementFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:5584:1: ( ( rule__CollectBy__ElementFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:5585:2: ( rule__CollectBy__ElementFieldAssignment_3_1 )
            {
             before(grammarAccess.getCollectByAccess().getElementFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:5586:2: ( rule__CollectBy__ElementFieldAssignment_3_1 )
            // InternalDataflowDSL.g:5586:3: rule__CollectBy__ElementFieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__ElementFieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getElementFieldAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3__1__Impl"


    // $ANTLR start "rule__CollectBy__Group_4__0"
    // InternalDataflowDSL.g:5595:1: rule__CollectBy__Group_4__0 : rule__CollectBy__Group_4__0__Impl rule__CollectBy__Group_4__1 ;
    public final void rule__CollectBy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5599:1: ( rule__CollectBy__Group_4__0__Impl rule__CollectBy__Group_4__1 )
            // InternalDataflowDSL.g:5600:2: rule__CollectBy__Group_4__0__Impl rule__CollectBy__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__CollectBy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_4__1();

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
    // $ANTLR end "rule__CollectBy__Group_4__0"


    // $ANTLR start "rule__CollectBy__Group_4__0__Impl"
    // InternalDataflowDSL.g:5607:1: rule__CollectBy__Group_4__0__Impl : ( 'collectBy' ) ;
    public final void rule__CollectBy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5611:1: ( ( 'collectBy' ) )
            // InternalDataflowDSL.g:5612:1: ( 'collectBy' )
            {
            // InternalDataflowDSL.g:5612:1: ( 'collectBy' )
            // InternalDataflowDSL.g:5613:2: 'collectBy'
            {
             before(grammarAccess.getCollectByAccess().getCollectByKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getCollectByKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_4__0__Impl"


    // $ANTLR start "rule__CollectBy__Group_4__1"
    // InternalDataflowDSL.g:5622:1: rule__CollectBy__Group_4__1 : rule__CollectBy__Group_4__1__Impl ;
    public final void rule__CollectBy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5626:1: ( rule__CollectBy__Group_4__1__Impl )
            // InternalDataflowDSL.g:5627:2: rule__CollectBy__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_4__1__Impl();

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
    // $ANTLR end "rule__CollectBy__Group_4__1"


    // $ANTLR start "rule__CollectBy__Group_4__1__Impl"
    // InternalDataflowDSL.g:5633:1: rule__CollectBy__Group_4__1__Impl : ( ( rule__CollectBy__CollectByAssignment_4_1 ) ) ;
    public final void rule__CollectBy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5637:1: ( ( ( rule__CollectBy__CollectByAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:5638:1: ( ( rule__CollectBy__CollectByAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:5638:1: ( ( rule__CollectBy__CollectByAssignment_4_1 ) )
            // InternalDataflowDSL.g:5639:2: ( rule__CollectBy__CollectByAssignment_4_1 )
            {
             before(grammarAccess.getCollectByAccess().getCollectByAssignment_4_1()); 
            // InternalDataflowDSL.g:5640:2: ( rule__CollectBy__CollectByAssignment_4_1 )
            // InternalDataflowDSL.g:5640:3: rule__CollectBy__CollectByAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__CollectByAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getCollectByAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_4__1__Impl"


    // $ANTLR start "rule__CollectBy__Group_5__0"
    // InternalDataflowDSL.g:5649:1: rule__CollectBy__Group_5__0 : rule__CollectBy__Group_5__0__Impl rule__CollectBy__Group_5__1 ;
    public final void rule__CollectBy__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5653:1: ( rule__CollectBy__Group_5__0__Impl rule__CollectBy__Group_5__1 )
            // InternalDataflowDSL.g:5654:2: rule__CollectBy__Group_5__0__Impl rule__CollectBy__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__CollectBy__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_5__1();

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
    // $ANTLR end "rule__CollectBy__Group_5__0"


    // $ANTLR start "rule__CollectBy__Group_5__0__Impl"
    // InternalDataflowDSL.g:5661:1: rule__CollectBy__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__CollectBy__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5665:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5666:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5666:1: ( 'target' )
            // InternalDataflowDSL.g:5667:2: 'target'
            {
             before(grammarAccess.getCollectByAccess().getTargetKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getTargetKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_5__0__Impl"


    // $ANTLR start "rule__CollectBy__Group_5__1"
    // InternalDataflowDSL.g:5676:1: rule__CollectBy__Group_5__1 : rule__CollectBy__Group_5__1__Impl ;
    public final void rule__CollectBy__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5680:1: ( rule__CollectBy__Group_5__1__Impl )
            // InternalDataflowDSL.g:5681:2: rule__CollectBy__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_5__1__Impl();

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
    // $ANTLR end "rule__CollectBy__Group_5__1"


    // $ANTLR start "rule__CollectBy__Group_5__1__Impl"
    // InternalDataflowDSL.g:5687:1: rule__CollectBy__Group_5__1__Impl : ( ( rule__CollectBy__TargetAssignment_5_1 ) ) ;
    public final void rule__CollectBy__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5691:1: ( ( ( rule__CollectBy__TargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:5692:1: ( ( rule__CollectBy__TargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:5692:1: ( ( rule__CollectBy__TargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:5693:2: ( rule__CollectBy__TargetAssignment_5_1 )
            {
             before(grammarAccess.getCollectByAccess().getTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:5694:2: ( rule__CollectBy__TargetAssignment_5_1 )
            // InternalDataflowDSL.g:5694:3: rule__CollectBy__TargetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__TargetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getTargetAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_5__1__Impl"


    // $ANTLR start "rule__Evaluate__Group__0"
    // InternalDataflowDSL.g:5703:1: rule__Evaluate__Group__0 : rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 ;
    public final void rule__Evaluate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5707:1: ( rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 )
            // InternalDataflowDSL.g:5708:2: rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1
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
    // InternalDataflowDSL.g:5715:1: rule__Evaluate__Group__0__Impl : ( 'Evaluate' ) ;
    public final void rule__Evaluate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5719:1: ( ( 'Evaluate' ) )
            // InternalDataflowDSL.g:5720:1: ( 'Evaluate' )
            {
            // InternalDataflowDSL.g:5720:1: ( 'Evaluate' )
            // InternalDataflowDSL.g:5721:2: 'Evaluate'
            {
             before(grammarAccess.getEvaluateAccess().getEvaluateKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalDataflowDSL.g:5730:1: rule__Evaluate__Group__1 : rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 ;
    public final void rule__Evaluate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5734:1: ( rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 )
            // InternalDataflowDSL.g:5735:2: rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2
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
    // InternalDataflowDSL.g:5742:1: rule__Evaluate__Group__1__Impl : ( ( rule__Evaluate__NameAssignment_1 ) ) ;
    public final void rule__Evaluate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5746:1: ( ( ( rule__Evaluate__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:5747:1: ( ( rule__Evaluate__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:5747:1: ( ( rule__Evaluate__NameAssignment_1 ) )
            // InternalDataflowDSL.g:5748:2: ( rule__Evaluate__NameAssignment_1 )
            {
             before(grammarAccess.getEvaluateAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:5749:2: ( rule__Evaluate__NameAssignment_1 )
            // InternalDataflowDSL.g:5749:3: rule__Evaluate__NameAssignment_1
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
    // InternalDataflowDSL.g:5757:1: rule__Evaluate__Group__2 : rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3 ;
    public final void rule__Evaluate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5761:1: ( rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3 )
            // InternalDataflowDSL.g:5762:2: rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalDataflowDSL.g:5769:1: rule__Evaluate__Group__2__Impl : ( '{' ) ;
    public final void rule__Evaluate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5773:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5774:1: ( '{' )
            {
            // InternalDataflowDSL.g:5774:1: ( '{' )
            // InternalDataflowDSL.g:5775:2: '{'
            {
             before(grammarAccess.getEvaluateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataflowDSL.g:5784:1: rule__Evaluate__Group__3 : rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4 ;
    public final void rule__Evaluate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5788:1: ( rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4 )
            // InternalDataflowDSL.g:5789:2: rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDataflowDSL.g:5796:1: rule__Evaluate__Group__3__Impl : ( ( rule__Evaluate__Group_3__0 )? ) ;
    public final void rule__Evaluate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5800:1: ( ( ( rule__Evaluate__Group_3__0 )? ) )
            // InternalDataflowDSL.g:5801:1: ( ( rule__Evaluate__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:5801:1: ( ( rule__Evaluate__Group_3__0 )? )
            // InternalDataflowDSL.g:5802:2: ( rule__Evaluate__Group_3__0 )?
            {
             before(grammarAccess.getEvaluateAccess().getGroup_3()); 
            // InternalDataflowDSL.g:5803:2: ( rule__Evaluate__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDataflowDSL.g:5803:3: rule__Evaluate__Group_3__0
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
    // InternalDataflowDSL.g:5811:1: rule__Evaluate__Group__4 : rule__Evaluate__Group__4__Impl rule__Evaluate__Group__5 ;
    public final void rule__Evaluate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5815:1: ( rule__Evaluate__Group__4__Impl rule__Evaluate__Group__5 )
            // InternalDataflowDSL.g:5816:2: rule__Evaluate__Group__4__Impl rule__Evaluate__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalDataflowDSL.g:5823:1: rule__Evaluate__Group__4__Impl : ( ( rule__Evaluate__Group_4__0 )? ) ;
    public final void rule__Evaluate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5827:1: ( ( ( rule__Evaluate__Group_4__0 )? ) )
            // InternalDataflowDSL.g:5828:1: ( ( rule__Evaluate__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:5828:1: ( ( rule__Evaluate__Group_4__0 )? )
            // InternalDataflowDSL.g:5829:2: ( rule__Evaluate__Group_4__0 )?
            {
             before(grammarAccess.getEvaluateAccess().getGroup_4()); 
            // InternalDataflowDSL.g:5830:2: ( rule__Evaluate__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==66) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDataflowDSL.g:5830:3: rule__Evaluate__Group_4__0
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
    // InternalDataflowDSL.g:5838:1: rule__Evaluate__Group__5 : rule__Evaluate__Group__5__Impl rule__Evaluate__Group__6 ;
    public final void rule__Evaluate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5842:1: ( rule__Evaluate__Group__5__Impl rule__Evaluate__Group__6 )
            // InternalDataflowDSL.g:5843:2: rule__Evaluate__Group__5__Impl rule__Evaluate__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalDataflowDSL.g:5850:1: rule__Evaluate__Group__5__Impl : ( ( rule__Evaluate__Group_5__0 )? ) ;
    public final void rule__Evaluate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5854:1: ( ( ( rule__Evaluate__Group_5__0 )? ) )
            // InternalDataflowDSL.g:5855:1: ( ( rule__Evaluate__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:5855:1: ( ( rule__Evaluate__Group_5__0 )? )
            // InternalDataflowDSL.g:5856:2: ( rule__Evaluate__Group_5__0 )?
            {
             before(grammarAccess.getEvaluateAccess().getGroup_5()); 
            // InternalDataflowDSL.g:5857:2: ( rule__Evaluate__Group_5__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==38) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDataflowDSL.g:5857:3: rule__Evaluate__Group_5__0
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
    // InternalDataflowDSL.g:5865:1: rule__Evaluate__Group__6 : rule__Evaluate__Group__6__Impl ;
    public final void rule__Evaluate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5869:1: ( rule__Evaluate__Group__6__Impl )
            // InternalDataflowDSL.g:5870:2: rule__Evaluate__Group__6__Impl
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
    // InternalDataflowDSL.g:5876:1: rule__Evaluate__Group__6__Impl : ( '}' ) ;
    public final void rule__Evaluate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5880:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5881:1: ( '}' )
            {
            // InternalDataflowDSL.g:5881:1: ( '}' )
            // InternalDataflowDSL.g:5882:2: '}'
            {
             before(grammarAccess.getEvaluateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDataflowDSL.g:5892:1: rule__Evaluate__Group_3__0 : rule__Evaluate__Group_3__0__Impl rule__Evaluate__Group_3__1 ;
    public final void rule__Evaluate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5896:1: ( rule__Evaluate__Group_3__0__Impl rule__Evaluate__Group_3__1 )
            // InternalDataflowDSL.g:5897:2: rule__Evaluate__Group_3__0__Impl rule__Evaluate__Group_3__1
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
    // InternalDataflowDSL.g:5904:1: rule__Evaluate__Group_3__0__Impl : ( 'field' ) ;
    public final void rule__Evaluate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5908:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:5909:1: ( 'field' )
            {
            // InternalDataflowDSL.g:5909:1: ( 'field' )
            // InternalDataflowDSL.g:5910:2: 'field'
            {
             before(grammarAccess.getEvaluateAccess().getFieldKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDataflowDSL.g:5919:1: rule__Evaluate__Group_3__1 : rule__Evaluate__Group_3__1__Impl ;
    public final void rule__Evaluate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5923:1: ( rule__Evaluate__Group_3__1__Impl )
            // InternalDataflowDSL.g:5924:2: rule__Evaluate__Group_3__1__Impl
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
    // InternalDataflowDSL.g:5930:1: rule__Evaluate__Group_3__1__Impl : ( ( rule__Evaluate__FieldAssignment_3_1 ) ) ;
    public final void rule__Evaluate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5934:1: ( ( ( rule__Evaluate__FieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:5935:1: ( ( rule__Evaluate__FieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:5935:1: ( ( rule__Evaluate__FieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:5936:2: ( rule__Evaluate__FieldAssignment_3_1 )
            {
             before(grammarAccess.getEvaluateAccess().getFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:5937:2: ( rule__Evaluate__FieldAssignment_3_1 )
            // InternalDataflowDSL.g:5937:3: rule__Evaluate__FieldAssignment_3_1
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
    // InternalDataflowDSL.g:5946:1: rule__Evaluate__Group_4__0 : rule__Evaluate__Group_4__0__Impl rule__Evaluate__Group_4__1 ;
    public final void rule__Evaluate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5950:1: ( rule__Evaluate__Group_4__0__Impl rule__Evaluate__Group_4__1 )
            // InternalDataflowDSL.g:5951:2: rule__Evaluate__Group_4__0__Impl rule__Evaluate__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:5958:1: rule__Evaluate__Group_4__0__Impl : ( 'expression' ) ;
    public final void rule__Evaluate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5962:1: ( ( 'expression' ) )
            // InternalDataflowDSL.g:5963:1: ( 'expression' )
            {
            // InternalDataflowDSL.g:5963:1: ( 'expression' )
            // InternalDataflowDSL.g:5964:2: 'expression'
            {
             before(grammarAccess.getEvaluateAccess().getExpressionKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalDataflowDSL.g:5973:1: rule__Evaluate__Group_4__1 : rule__Evaluate__Group_4__1__Impl ;
    public final void rule__Evaluate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5977:1: ( rule__Evaluate__Group_4__1__Impl )
            // InternalDataflowDSL.g:5978:2: rule__Evaluate__Group_4__1__Impl
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
    // InternalDataflowDSL.g:5984:1: rule__Evaluate__Group_4__1__Impl : ( ( rule__Evaluate__ExpressionAssignment_4_1 ) ) ;
    public final void rule__Evaluate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5988:1: ( ( ( rule__Evaluate__ExpressionAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:5989:1: ( ( rule__Evaluate__ExpressionAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:5989:1: ( ( rule__Evaluate__ExpressionAssignment_4_1 ) )
            // InternalDataflowDSL.g:5990:2: ( rule__Evaluate__ExpressionAssignment_4_1 )
            {
             before(grammarAccess.getEvaluateAccess().getExpressionAssignment_4_1()); 
            // InternalDataflowDSL.g:5991:2: ( rule__Evaluate__ExpressionAssignment_4_1 )
            // InternalDataflowDSL.g:5991:3: rule__Evaluate__ExpressionAssignment_4_1
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
    // InternalDataflowDSL.g:6000:1: rule__Evaluate__Group_5__0 : rule__Evaluate__Group_5__0__Impl rule__Evaluate__Group_5__1 ;
    public final void rule__Evaluate__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6004:1: ( rule__Evaluate__Group_5__0__Impl rule__Evaluate__Group_5__1 )
            // InternalDataflowDSL.g:6005:2: rule__Evaluate__Group_5__0__Impl rule__Evaluate__Group_5__1
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
    // InternalDataflowDSL.g:6012:1: rule__Evaluate__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__Evaluate__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6016:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:6017:1: ( 'target' )
            {
            // InternalDataflowDSL.g:6017:1: ( 'target' )
            // InternalDataflowDSL.g:6018:2: 'target'
            {
             before(grammarAccess.getEvaluateAccess().getTargetKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDataflowDSL.g:6027:1: rule__Evaluate__Group_5__1 : rule__Evaluate__Group_5__1__Impl ;
    public final void rule__Evaluate__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6031:1: ( rule__Evaluate__Group_5__1__Impl )
            // InternalDataflowDSL.g:6032:2: rule__Evaluate__Group_5__1__Impl
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
    // InternalDataflowDSL.g:6038:1: rule__Evaluate__Group_5__1__Impl : ( ( rule__Evaluate__TargetAssignment_5_1 ) ) ;
    public final void rule__Evaluate__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6042:1: ( ( ( rule__Evaluate__TargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:6043:1: ( ( rule__Evaluate__TargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:6043:1: ( ( rule__Evaluate__TargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:6044:2: ( rule__Evaluate__TargetAssignment_5_1 )
            {
             before(grammarAccess.getEvaluateAccess().getTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:6045:2: ( rule__Evaluate__TargetAssignment_5_1 )
            // InternalDataflowDSL.g:6045:3: rule__Evaluate__TargetAssignment_5_1
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
    // InternalDataflowDSL.g:6054:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6058:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalDataflowDSL.g:6059:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDataflowDSL.g:6066:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6070:1: ( ( ruleAndExpression ) )
            // InternalDataflowDSL.g:6071:1: ( ruleAndExpression )
            {
            // InternalDataflowDSL.g:6071:1: ( ruleAndExpression )
            // InternalDataflowDSL.g:6072:2: ruleAndExpression
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
    // InternalDataflowDSL.g:6081:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6085:1: ( rule__OrExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6086:2: rule__OrExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6092:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6096:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6097:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6097:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6098:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6099:2: ( rule__OrExpression__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==11) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalDataflowDSL.g:6099:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

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
    // InternalDataflowDSL.g:6108:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6112:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalDataflowDSL.g:6113:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDataflowDSL.g:6120:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6124:1: ( ( () ) )
            // InternalDataflowDSL.g:6125:1: ( () )
            {
            // InternalDataflowDSL.g:6125:1: ( () )
            // InternalDataflowDSL.g:6126:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6127:2: ()
            // InternalDataflowDSL.g:6127:3: 
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
    // InternalDataflowDSL.g:6135:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6139:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalDataflowDSL.g:6140:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:6147:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6151:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6152:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6152:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6153:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6154:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6154:3: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6162:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6166:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6167:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6173:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6177:1: ( ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6178:1: ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6178:1: ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6179:2: ( rule__OrExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6180:2: ( rule__OrExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6180:3: rule__OrExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6189:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6193:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalDataflowDSL.g:6194:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDataflowDSL.g:6201:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6205:1: ( ( ruleEqualityExpression ) )
            // InternalDataflowDSL.g:6206:1: ( ruleEqualityExpression )
            {
            // InternalDataflowDSL.g:6206:1: ( ruleEqualityExpression )
            // InternalDataflowDSL.g:6207:2: ruleEqualityExpression
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
    // InternalDataflowDSL.g:6216:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6220:1: ( rule__AndExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6221:2: rule__AndExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6227:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6231:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6232:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6232:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6233:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6234:2: ( rule__AndExpression__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==12) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalDataflowDSL.g:6234:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

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
    // InternalDataflowDSL.g:6243:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6247:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalDataflowDSL.g:6248:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDataflowDSL.g:6255:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6259:1: ( ( () ) )
            // InternalDataflowDSL.g:6260:1: ( () )
            {
            // InternalDataflowDSL.g:6260:1: ( () )
            // InternalDataflowDSL.g:6261:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6262:2: ()
            // InternalDataflowDSL.g:6262:3: 
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
    // InternalDataflowDSL.g:6270:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6274:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalDataflowDSL.g:6275:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:6282:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6286:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6287:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6287:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6288:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6289:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6289:3: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6297:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6301:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6302:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6308:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6312:1: ( ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6313:1: ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6313:1: ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6314:2: ( rule__AndExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6315:2: ( rule__AndExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6315:3: rule__AndExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6324:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6328:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalDataflowDSL.g:6329:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDataflowDSL.g:6336:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6340:1: ( ( ruleRelationalExpression ) )
            // InternalDataflowDSL.g:6341:1: ( ruleRelationalExpression )
            {
            // InternalDataflowDSL.g:6341:1: ( ruleRelationalExpression )
            // InternalDataflowDSL.g:6342:2: ruleRelationalExpression
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
    // InternalDataflowDSL.g:6351:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6355:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6356:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6362:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6366:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6367:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6367:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6368:2: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6369:2: ( rule__EqualityExpression__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=19 && LA57_0<=20)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalDataflowDSL.g:6369:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

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
    // InternalDataflowDSL.g:6378:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6382:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalDataflowDSL.g:6383:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDataflowDSL.g:6390:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6394:1: ( ( () ) )
            // InternalDataflowDSL.g:6395:1: ( () )
            {
            // InternalDataflowDSL.g:6395:1: ( () )
            // InternalDataflowDSL.g:6396:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6397:2: ()
            // InternalDataflowDSL.g:6397:3: 
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
    // InternalDataflowDSL.g:6405:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6409:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalDataflowDSL.g:6410:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:6417:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6421:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6422:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6422:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6423:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6424:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6424:3: rule__EqualityExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6432:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6436:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6437:2: rule__EqualityExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6443:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6447:1: ( ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6448:1: ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6448:1: ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6449:2: ( rule__EqualityExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6450:2: ( rule__EqualityExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6450:3: rule__EqualityExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6459:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6463:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalDataflowDSL.g:6464:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDataflowDSL.g:6471:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6475:1: ( ( ruleAdditiveExpression ) )
            // InternalDataflowDSL.g:6476:1: ( ruleAdditiveExpression )
            {
            // InternalDataflowDSL.g:6476:1: ( ruleAdditiveExpression )
            // InternalDataflowDSL.g:6477:2: ruleAdditiveExpression
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
    // InternalDataflowDSL.g:6486:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6490:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6491:2: rule__RelationalExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6497:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6501:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6502:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6502:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6503:2: ( rule__RelationalExpression__Group_1__0 )*
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6504:2: ( rule__RelationalExpression__Group_1__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=21 && LA58_0<=24)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDataflowDSL.g:6504:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

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
    // InternalDataflowDSL.g:6513:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6517:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalDataflowDSL.g:6518:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDataflowDSL.g:6525:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6529:1: ( ( () ) )
            // InternalDataflowDSL.g:6530:1: ( () )
            {
            // InternalDataflowDSL.g:6530:1: ( () )
            // InternalDataflowDSL.g:6531:2: ()
            {
             before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6532:2: ()
            // InternalDataflowDSL.g:6532:3: 
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
    // InternalDataflowDSL.g:6540:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6544:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // InternalDataflowDSL.g:6545:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:6552:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6556:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6557:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6557:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6558:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6559:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6559:3: rule__RelationalExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6567:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6571:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6572:2: rule__RelationalExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6578:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6582:1: ( ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6583:1: ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6583:1: ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6584:2: ( rule__RelationalExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6585:2: ( rule__RelationalExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6585:3: rule__RelationalExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6594:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6598:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalDataflowDSL.g:6599:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDataflowDSL.g:6606:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6610:1: ( ( ruleMultiplicativeExpression ) )
            // InternalDataflowDSL.g:6611:1: ( ruleMultiplicativeExpression )
            {
            // InternalDataflowDSL.g:6611:1: ( ruleMultiplicativeExpression )
            // InternalDataflowDSL.g:6612:2: ruleMultiplicativeExpression
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
    // InternalDataflowDSL.g:6621:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6625:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6626:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6632:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6636:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6637:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6637:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6638:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6639:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=25 && LA59_0<=26)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalDataflowDSL.g:6639:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

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
    // InternalDataflowDSL.g:6648:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6652:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalDataflowDSL.g:6653:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDataflowDSL.g:6660:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6664:1: ( ( () ) )
            // InternalDataflowDSL.g:6665:1: ( () )
            {
            // InternalDataflowDSL.g:6665:1: ( () )
            // InternalDataflowDSL.g:6666:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6667:2: ()
            // InternalDataflowDSL.g:6667:3: 
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
    // InternalDataflowDSL.g:6675:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6679:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalDataflowDSL.g:6680:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:6687:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6691:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6692:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6692:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6693:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6694:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6694:3: rule__AdditiveExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6702:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6706:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6707:2: rule__AdditiveExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6713:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6717:1: ( ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6718:1: ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6718:1: ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6719:2: ( rule__AdditiveExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6720:2: ( rule__AdditiveExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6720:3: rule__AdditiveExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6729:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6733:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalDataflowDSL.g:6734:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDataflowDSL.g:6741:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6745:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:6746:1: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:6746:1: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:6747:2: ruleUnaryExpression
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
    // InternalDataflowDSL.g:6756:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6760:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6761:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6767:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6771:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6772:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6772:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6773:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6774:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=27 && LA60_0<=29)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalDataflowDSL.g:6774:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

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
    // InternalDataflowDSL.g:6783:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6787:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalDataflowDSL.g:6788:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDataflowDSL.g:6795:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6799:1: ( ( () ) )
            // InternalDataflowDSL.g:6800:1: ( () )
            {
            // InternalDataflowDSL.g:6800:1: ( () )
            // InternalDataflowDSL.g:6801:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6802:2: ()
            // InternalDataflowDSL.g:6802:3: 
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
    // InternalDataflowDSL.g:6810:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6814:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalDataflowDSL.g:6815:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:6822:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6826:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6827:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6827:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6828:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6829:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6829:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6837:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6841:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6842:2: rule__MultiplicativeExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6848:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6852:1: ( ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6853:1: ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6853:1: ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6854:2: ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6855:2: ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6855:3: rule__MultiplicativeExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6864:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6868:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalDataflowDSL.g:6869:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDataflowDSL.g:6876:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6880:1: ( ( () ) )
            // InternalDataflowDSL.g:6881:1: ( () )
            {
            // InternalDataflowDSL.g:6881:1: ( () )
            // InternalDataflowDSL.g:6882:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperationAction_0_0()); 
            // InternalDataflowDSL.g:6883:2: ()
            // InternalDataflowDSL.g:6883:3: 
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
    // InternalDataflowDSL.g:6891:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6895:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalDataflowDSL.g:6896:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:6903:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6907:1: ( ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) )
            // InternalDataflowDSL.g:6908:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            {
            // InternalDataflowDSL.g:6908:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            // InternalDataflowDSL.g:6909:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            // InternalDataflowDSL.g:6910:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            // InternalDataflowDSL.g:6910:3: rule__UnaryExpression__OperatorAssignment_0_1
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
    // InternalDataflowDSL.g:6918:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6922:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalDataflowDSL.g:6923:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalDataflowDSL.g:6929:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6933:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) )
            // InternalDataflowDSL.g:6934:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            {
            // InternalDataflowDSL.g:6934:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            // InternalDataflowDSL.g:6935:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 
            // InternalDataflowDSL.g:6936:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            // InternalDataflowDSL.g:6936:3: rule__UnaryExpression__ExpressionAssignment_0_2
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


    // $ANTLR start "rule__FeatureCallExpression__Group__0"
    // InternalDataflowDSL.g:6945:1: rule__FeatureCallExpression__Group__0 : rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1 ;
    public final void rule__FeatureCallExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6949:1: ( rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1 )
            // InternalDataflowDSL.g:6950:2: rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__FeatureCallExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group__1();

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
    // $ANTLR end "rule__FeatureCallExpression__Group__0"


    // $ANTLR start "rule__FeatureCallExpression__Group__0__Impl"
    // InternalDataflowDSL.g:6957:1: rule__FeatureCallExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__FeatureCallExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6961:1: ( ( rulePrimaryExpression ) )
            // InternalDataflowDSL.g:6962:1: ( rulePrimaryExpression )
            {
            // InternalDataflowDSL.g:6962:1: ( rulePrimaryExpression )
            // InternalDataflowDSL.g:6963:2: rulePrimaryExpression
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getFeatureCallExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group__0__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group__1"
    // InternalDataflowDSL.g:6972:1: rule__FeatureCallExpression__Group__1 : rule__FeatureCallExpression__Group__1__Impl ;
    public final void rule__FeatureCallExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6976:1: ( rule__FeatureCallExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6977:2: rule__FeatureCallExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group__1__Impl();

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
    // $ANTLR end "rule__FeatureCallExpression__Group__1"


    // $ANTLR start "rule__FeatureCallExpression__Group__1__Impl"
    // InternalDataflowDSL.g:6983:1: rule__FeatureCallExpression__Group__1__Impl : ( ( rule__FeatureCallExpression__Group_1__0 )* ) ;
    public final void rule__FeatureCallExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6987:1: ( ( ( rule__FeatureCallExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6988:1: ( ( rule__FeatureCallExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6988:1: ( ( rule__FeatureCallExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6989:2: ( rule__FeatureCallExpression__Group_1__0 )*
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6990:2: ( rule__FeatureCallExpression__Group_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==67) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalDataflowDSL.g:6990:3: rule__FeatureCallExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__FeatureCallExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getFeatureCallExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group__1__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1__0"
    // InternalDataflowDSL.g:6999:1: rule__FeatureCallExpression__Group_1__0 : rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1 ;
    public final void rule__FeatureCallExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7003:1: ( rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1 )
            // InternalDataflowDSL.g:7004:2: rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__FeatureCallExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1__1();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1__0"


    // $ANTLR start "rule__FeatureCallExpression__Group_1__0__Impl"
    // InternalDataflowDSL.g:7011:1: rule__FeatureCallExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__FeatureCallExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7015:1: ( ( () ) )
            // InternalDataflowDSL.g:7016:1: ( () )
            {
            // InternalDataflowDSL.g:7016:1: ( () )
            // InternalDataflowDSL.g:7017:2: ()
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFeatureCallTargetExpressionAction_1_0()); 
            // InternalDataflowDSL.g:7018:2: ()
            // InternalDataflowDSL.g:7018:3: 
            {
            }

             after(grammarAccess.getFeatureCallExpressionAccess().getFeatureCallTargetExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1__1"
    // InternalDataflowDSL.g:7026:1: rule__FeatureCallExpression__Group_1__1 : rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2 ;
    public final void rule__FeatureCallExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7030:1: ( rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2 )
            // InternalDataflowDSL.g:7031:2: rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__FeatureCallExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1__2();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1__1"


    // $ANTLR start "rule__FeatureCallExpression__Group_1__1__Impl"
    // InternalDataflowDSL.g:7038:1: rule__FeatureCallExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__FeatureCallExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7042:1: ( ( '.' ) )
            // InternalDataflowDSL.g:7043:1: ( '.' )
            {
            // InternalDataflowDSL.g:7043:1: ( '.' )
            // InternalDataflowDSL.g:7044:2: '.'
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getFeatureCallExpressionAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1__1__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1__2"
    // InternalDataflowDSL.g:7053:1: rule__FeatureCallExpression__Group_1__2 : rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3 ;
    public final void rule__FeatureCallExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7057:1: ( rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3 )
            // InternalDataflowDSL.g:7058:2: rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3
            {
            pushFollow(FOLLOW_39);
            rule__FeatureCallExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1__3();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1__2"


    // $ANTLR start "rule__FeatureCallExpression__Group_1__2__Impl"
    // InternalDataflowDSL.g:7065:1: rule__FeatureCallExpression__Group_1__2__Impl : ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) ) ;
    public final void rule__FeatureCallExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7069:1: ( ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:7070:1: ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:7070:1: ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) )
            // InternalDataflowDSL.g:7071:2: ( rule__FeatureCallExpression__FeatureAssignment_1_2 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFeatureAssignment_1_2()); 
            // InternalDataflowDSL.g:7072:2: ( rule__FeatureCallExpression__FeatureAssignment_1_2 )
            // InternalDataflowDSL.g:7072:3: rule__FeatureCallExpression__FeatureAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__FeatureAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureCallExpressionAccess().getFeatureAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1__2__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1__3"
    // InternalDataflowDSL.g:7080:1: rule__FeatureCallExpression__Group_1__3 : rule__FeatureCallExpression__Group_1__3__Impl ;
    public final void rule__FeatureCallExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7084:1: ( rule__FeatureCallExpression__Group_1__3__Impl )
            // InternalDataflowDSL.g:7085:2: rule__FeatureCallExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1__3__Impl();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1__3"


    // $ANTLR start "rule__FeatureCallExpression__Group_1__3__Impl"
    // InternalDataflowDSL.g:7091:1: rule__FeatureCallExpression__Group_1__3__Impl : ( ( rule__FeatureCallExpression__Group_1_3__0 )? ) ;
    public final void rule__FeatureCallExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7095:1: ( ( ( rule__FeatureCallExpression__Group_1_3__0 )? ) )
            // InternalDataflowDSL.g:7096:1: ( ( rule__FeatureCallExpression__Group_1_3__0 )? )
            {
            // InternalDataflowDSL.g:7096:1: ( ( rule__FeatureCallExpression__Group_1_3__0 )? )
            // InternalDataflowDSL.g:7097:2: ( rule__FeatureCallExpression__Group_1_3__0 )?
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3()); 
            // InternalDataflowDSL.g:7098:2: ( rule__FeatureCallExpression__Group_1_3__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==68) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDataflowDSL.g:7098:3: rule__FeatureCallExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureCallExpression__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1__3__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3__0"
    // InternalDataflowDSL.g:7107:1: rule__FeatureCallExpression__Group_1_3__0 : rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1 ;
    public final void rule__FeatureCallExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7111:1: ( rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1 )
            // InternalDataflowDSL.g:7112:2: rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_40);
            rule__FeatureCallExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1_3__1();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3__0"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3__0__Impl"
    // InternalDataflowDSL.g:7119:1: rule__FeatureCallExpression__Group_1_3__0__Impl : ( '(' ) ;
    public final void rule__FeatureCallExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7123:1: ( ( '(' ) )
            // InternalDataflowDSL.g:7124:1: ( '(' )
            {
            // InternalDataflowDSL.g:7124:1: ( '(' )
            // InternalDataflowDSL.g:7125:2: '('
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getLeftParenthesisKeyword_1_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFeatureCallExpressionAccess().getLeftParenthesisKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3__1"
    // InternalDataflowDSL.g:7134:1: rule__FeatureCallExpression__Group_1_3__1 : rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2 ;
    public final void rule__FeatureCallExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7138:1: ( rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2 )
            // InternalDataflowDSL.g:7139:2: rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_40);
            rule__FeatureCallExpression__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1_3__2();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3__1"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3__1__Impl"
    // InternalDataflowDSL.g:7146:1: rule__FeatureCallExpression__Group_1_3__1__Impl : ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? ) ;
    public final void rule__FeatureCallExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7150:1: ( ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? ) )
            // InternalDataflowDSL.g:7151:1: ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? )
            {
            // InternalDataflowDSL.g:7151:1: ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? )
            // InternalDataflowDSL.g:7152:2: ( rule__FeatureCallExpression__Group_1_3_1__0 )?
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1()); 
            // InternalDataflowDSL.g:7153:2: ( rule__FeatureCallExpression__Group_1_3_1__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_INT && LA63_0<=RULE_STRING)||(LA63_0>=13 && LA63_0<=14)||LA63_0==26||LA63_0==30||(LA63_0>=67 && LA63_0<=68)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDataflowDSL.g:7153:3: rule__FeatureCallExpression__Group_1_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureCallExpression__Group_1_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3__2"
    // InternalDataflowDSL.g:7161:1: rule__FeatureCallExpression__Group_1_3__2 : rule__FeatureCallExpression__Group_1_3__2__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7165:1: ( rule__FeatureCallExpression__Group_1_3__2__Impl )
            // InternalDataflowDSL.g:7166:2: rule__FeatureCallExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3__2"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3__2__Impl"
    // InternalDataflowDSL.g:7172:1: rule__FeatureCallExpression__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__FeatureCallExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7176:1: ( ( ')' ) )
            // InternalDataflowDSL.g:7177:1: ( ')' )
            {
            // InternalDataflowDSL.g:7177:1: ( ')' )
            // InternalDataflowDSL.g:7178:2: ')'
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFeatureCallExpressionAccess().getRightParenthesisKeyword_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3_1__0"
    // InternalDataflowDSL.g:7188:1: rule__FeatureCallExpression__Group_1_3_1__0 : rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1 ;
    public final void rule__FeatureCallExpression__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7192:1: ( rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1 )
            // InternalDataflowDSL.g:7193:2: rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1
            {
            pushFollow(FOLLOW_41);
            rule__FeatureCallExpression__Group_1_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1_3_1__1();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3_1__0"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3_1__0__Impl"
    // InternalDataflowDSL.g:7200:1: rule__FeatureCallExpression__Group_1_3_1__0__Impl : ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7204:1: ( ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) ) )
            // InternalDataflowDSL.g:7205:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) )
            {
            // InternalDataflowDSL.g:7205:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) )
            // InternalDataflowDSL.g:7206:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_0()); 
            // InternalDataflowDSL.g:7207:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 )
            // InternalDataflowDSL.g:7207:3: rule__FeatureCallExpression__ParametersAssignment_1_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__ParametersAssignment_1_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3_1__1"
    // InternalDataflowDSL.g:7215:1: rule__FeatureCallExpression__Group_1_3_1__1 : rule__FeatureCallExpression__Group_1_3_1__1__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7219:1: ( rule__FeatureCallExpression__Group_1_3_1__1__Impl )
            // InternalDataflowDSL.g:7220:2: rule__FeatureCallExpression__Group_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1_3_1__1__Impl();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3_1__1"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3_1__1__Impl"
    // InternalDataflowDSL.g:7226:1: rule__FeatureCallExpression__Group_1_3_1__1__Impl : ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7230:1: ( ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* ) )
            // InternalDataflowDSL.g:7231:1: ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* )
            {
            // InternalDataflowDSL.g:7231:1: ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* )
            // InternalDataflowDSL.g:7232:2: ( rule__FeatureCallExpression__Group_1_3_1_1__0 )*
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1_1()); 
            // InternalDataflowDSL.g:7233:2: ( rule__FeatureCallExpression__Group_1_3_1_1__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==70) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalDataflowDSL.g:7233:3: rule__FeatureCallExpression__Group_1_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__FeatureCallExpression__Group_1_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3_1_1__0"
    // InternalDataflowDSL.g:7242:1: rule__FeatureCallExpression__Group_1_3_1_1__0 : rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1 ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7246:1: ( rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1 )
            // InternalDataflowDSL.g:7247:2: rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__FeatureCallExpression__Group_1_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1_3_1_1__1();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3_1_1__0"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3_1_1__0__Impl"
    // InternalDataflowDSL.g:7254:1: rule__FeatureCallExpression__Group_1_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7258:1: ( ( ',' ) )
            // InternalDataflowDSL.g:7259:1: ( ',' )
            {
            // InternalDataflowDSL.g:7259:1: ( ',' )
            // InternalDataflowDSL.g:7260:2: ','
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getFeatureCallExpressionAccess().getCommaKeyword_1_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3_1_1__0__Impl"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3_1_1__1"
    // InternalDataflowDSL.g:7269:1: rule__FeatureCallExpression__Group_1_3_1_1__1 : rule__FeatureCallExpression__Group_1_3_1_1__1__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7273:1: ( rule__FeatureCallExpression__Group_1_3_1_1__1__Impl )
            // InternalDataflowDSL.g:7274:2: rule__FeatureCallExpression__Group_1_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__Group_1_3_1_1__1__Impl();

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
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3_1_1__1"


    // $ANTLR start "rule__FeatureCallExpression__Group_1_3_1_1__1__Impl"
    // InternalDataflowDSL.g:7280:1: rule__FeatureCallExpression__Group_1_3_1_1__1__Impl : ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7284:1: ( ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) ) )
            // InternalDataflowDSL.g:7285:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) )
            {
            // InternalDataflowDSL.g:7285:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) )
            // InternalDataflowDSL.g:7286:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_1_1()); 
            // InternalDataflowDSL.g:7287:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 )
            // InternalDataflowDSL.g:7287:3: rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__Group_1_3_1_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalDataflowDSL.g:7296:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7300:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalDataflowDSL.g:7301:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalDataflowDSL.g:7308:1: rule__PrimaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7312:1: ( ( () ) )
            // InternalDataflowDSL.g:7313:1: ( () )
            {
            // InternalDataflowDSL.g:7313:1: ( () )
            // InternalDataflowDSL.g:7314:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIntegerLiteralAction_0_0()); 
            // InternalDataflowDSL.g:7315:2: ()
            // InternalDataflowDSL.g:7315:3: 
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
    // InternalDataflowDSL.g:7323:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7327:1: ( rule__PrimaryExpression__Group_0__1__Impl )
            // InternalDataflowDSL.g:7328:2: rule__PrimaryExpression__Group_0__1__Impl
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
    // InternalDataflowDSL.g:7334:1: rule__PrimaryExpression__Group_0__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7338:1: ( ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) )
            // InternalDataflowDSL.g:7339:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            {
            // InternalDataflowDSL.g:7339:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            // InternalDataflowDSL.g:7340:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 
            // InternalDataflowDSL.g:7341:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            // InternalDataflowDSL.g:7341:3: rule__PrimaryExpression__ValueAssignment_0_1
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
    // InternalDataflowDSL.g:7350:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7354:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalDataflowDSL.g:7355:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalDataflowDSL.g:7362:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7366:1: ( ( () ) )
            // InternalDataflowDSL.g:7367:1: ( () )
            {
            // InternalDataflowDSL.g:7367:1: ( () )
            // InternalDataflowDSL.g:7368:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_1_0()); 
            // InternalDataflowDSL.g:7369:2: ()
            // InternalDataflowDSL.g:7369:3: 
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
    // InternalDataflowDSL.g:7377:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7381:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalDataflowDSL.g:7382:2: rule__PrimaryExpression__Group_1__1__Impl
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
    // InternalDataflowDSL.g:7388:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7392:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:7393:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:7393:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalDataflowDSL.g:7394:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalDataflowDSL.g:7395:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalDataflowDSL.g:7395:3: rule__PrimaryExpression__ValueAssignment_1_1
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
    // InternalDataflowDSL.g:7404:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7408:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalDataflowDSL.g:7409:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalDataflowDSL.g:7416:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7420:1: ( ( () ) )
            // InternalDataflowDSL.g:7421:1: ( () )
            {
            // InternalDataflowDSL.g:7421:1: ( () )
            // InternalDataflowDSL.g:7422:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0()); 
            // InternalDataflowDSL.g:7423:2: ()
            // InternalDataflowDSL.g:7423:3: 
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
    // InternalDataflowDSL.g:7431:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7435:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalDataflowDSL.g:7436:2: rule__PrimaryExpression__Group_2__1__Impl
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
    // InternalDataflowDSL.g:7442:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7446:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // InternalDataflowDSL.g:7447:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // InternalDataflowDSL.g:7447:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // InternalDataflowDSL.g:7448:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // InternalDataflowDSL.g:7449:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // InternalDataflowDSL.g:7449:3: rule__PrimaryExpression__ValueAssignment_2_1
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
    // InternalDataflowDSL.g:7458:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7462:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalDataflowDSL.g:7463:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalDataflowDSL.g:7470:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7474:1: ( ( () ) )
            // InternalDataflowDSL.g:7475:1: ( () )
            {
            // InternalDataflowDSL.g:7475:1: ( () )
            // InternalDataflowDSL.g:7476:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_3_0()); 
            // InternalDataflowDSL.g:7477:2: ()
            // InternalDataflowDSL.g:7477:3: 
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
    // InternalDataflowDSL.g:7485:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7489:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // InternalDataflowDSL.g:7490:2: rule__PrimaryExpression__Group_3__1__Impl
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
    // InternalDataflowDSL.g:7496:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7500:1: ( ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:7501:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:7501:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            // InternalDataflowDSL.g:7502:2: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_3_1()); 
            // InternalDataflowDSL.g:7503:2: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            // InternalDataflowDSL.g:7503:3: rule__PrimaryExpression__ValueAssignment_3_1
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
    // InternalDataflowDSL.g:7512:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7516:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalDataflowDSL.g:7517:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
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
    // InternalDataflowDSL.g:7524:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7528:1: ( ( () ) )
            // InternalDataflowDSL.g:7529:1: ( () )
            {
            // InternalDataflowDSL.g:7529:1: ( () )
            // InternalDataflowDSL.g:7530:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldReferenceAction_4_0()); 
            // InternalDataflowDSL.g:7531:2: ()
            // InternalDataflowDSL.g:7531:3: 
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
    // InternalDataflowDSL.g:7539:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7543:1: ( rule__PrimaryExpression__Group_4__1__Impl )
            // InternalDataflowDSL.g:7544:2: rule__PrimaryExpression__Group_4__1__Impl
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
    // InternalDataflowDSL.g:7550:1: rule__PrimaryExpression__Group_4__1__Impl : ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7554:1: ( ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:7555:1: ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:7555:1: ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) )
            // InternalDataflowDSL.g:7556:2: ( rule__PrimaryExpression__FieldAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldAssignment_4_1()); 
            // InternalDataflowDSL.g:7557:2: ( rule__PrimaryExpression__FieldAssignment_4_1 )
            // InternalDataflowDSL.g:7557:3: rule__PrimaryExpression__FieldAssignment_4_1
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
    // InternalDataflowDSL.g:7566:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7570:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // InternalDataflowDSL.g:7571:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:7578:1: rule__PrimaryExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7582:1: ( ( '(' ) )
            // InternalDataflowDSL.g:7583:1: ( '(' )
            {
            // InternalDataflowDSL.g:7583:1: ( '(' )
            // InternalDataflowDSL.g:7584:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7593:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7597:1: ( rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 )
            // InternalDataflowDSL.g:7598:2: rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalDataflowDSL.g:7605:1: rule__PrimaryExpression__Group_5__1__Impl : ( ruleOrExpression ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7609:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:7610:1: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:7610:1: ( ruleOrExpression )
            // InternalDataflowDSL.g:7611:2: ruleOrExpression
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
    // InternalDataflowDSL.g:7620:1: rule__PrimaryExpression__Group_5__2 : rule__PrimaryExpression__Group_5__2__Impl ;
    public final void rule__PrimaryExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7624:1: ( rule__PrimaryExpression__Group_5__2__Impl )
            // InternalDataflowDSL.g:7625:2: rule__PrimaryExpression__Group_5__2__Impl
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
    // InternalDataflowDSL.g:7631:1: rule__PrimaryExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7635:1: ( ( ')' ) )
            // InternalDataflowDSL.g:7636:1: ( ')' )
            {
            // InternalDataflowDSL.g:7636:1: ( ')' )
            // InternalDataflowDSL.g:7637:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7647:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7651:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDataflowDSL.g:7652:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalDataflowDSL.g:7659:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7663:1: ( ( ( RULE_INT )? ) )
            // InternalDataflowDSL.g:7664:1: ( ( RULE_INT )? )
            {
            // InternalDataflowDSL.g:7664:1: ( ( RULE_INT )? )
            // InternalDataflowDSL.g:7665:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalDataflowDSL.g:7666:2: ( RULE_INT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDataflowDSL.g:7666:3: RULE_INT
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
    // InternalDataflowDSL.g:7674:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7678:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDataflowDSL.g:7679:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalDataflowDSL.g:7686:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7690:1: ( ( '.' ) )
            // InternalDataflowDSL.g:7691:1: ( '.' )
            {
            // InternalDataflowDSL.g:7691:1: ( '.' )
            // InternalDataflowDSL.g:7692:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7701:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7705:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDataflowDSL.g:7706:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalDataflowDSL.g:7713:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7717:1: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:7718:1: ( RULE_INT )
            {
            // InternalDataflowDSL.g:7718:1: ( RULE_INT )
            // InternalDataflowDSL.g:7719:2: RULE_INT
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
    // InternalDataflowDSL.g:7728:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7732:1: ( rule__EDouble__Group__3__Impl )
            // InternalDataflowDSL.g:7733:2: rule__EDouble__Group__3__Impl
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
    // InternalDataflowDSL.g:7739:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7743:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalDataflowDSL.g:7744:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:7744:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalDataflowDSL.g:7745:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalDataflowDSL.g:7746:2: ( rule__EDouble__Group_3__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=15 && LA66_0<=16)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDataflowDSL.g:7746:3: rule__EDouble__Group_3__0
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
    // InternalDataflowDSL.g:7755:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7759:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalDataflowDSL.g:7760:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalDataflowDSL.g:7767:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7771:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalDataflowDSL.g:7772:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalDataflowDSL.g:7772:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalDataflowDSL.g:7773:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalDataflowDSL.g:7774:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalDataflowDSL.g:7774:3: rule__EDouble__Alternatives_3_0
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
    // InternalDataflowDSL.g:7782:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7786:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // InternalDataflowDSL.g:7787:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalDataflowDSL.g:7794:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7798:1: ( ( ( '-' )? ) )
            // InternalDataflowDSL.g:7799:1: ( ( '-' )? )
            {
            // InternalDataflowDSL.g:7799:1: ( ( '-' )? )
            // InternalDataflowDSL.g:7800:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // InternalDataflowDSL.g:7801:2: ( '-' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==26) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDataflowDSL.g:7801:3: '-'
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
    // InternalDataflowDSL.g:7809:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7813:1: ( rule__EDouble__Group_3__2__Impl )
            // InternalDataflowDSL.g:7814:2: rule__EDouble__Group_3__2__Impl
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
    // InternalDataflowDSL.g:7820:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7824:1: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:7825:1: ( RULE_INT )
            {
            // InternalDataflowDSL.g:7825:1: ( RULE_INT )
            // InternalDataflowDSL.g:7826:2: RULE_INT
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
    // InternalDataflowDSL.g:7836:1: rule__Model__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7840:1: ( ( ruleElement ) )
            // InternalDataflowDSL.g:7841:2: ( ruleElement )
            {
            // InternalDataflowDSL.g:7841:2: ( ruleElement )
            // InternalDataflowDSL.g:7842:3: ruleElement
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
    // InternalDataflowDSL.g:7851:1: rule__AllInstances__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7855:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7856:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7856:2: ( RULE_ID )
            // InternalDataflowDSL.g:7857:3: RULE_ID
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
    // InternalDataflowDSL.g:7866:1: rule__AllInstances__FieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__FieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7870:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7871:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7871:2: ( RULE_ID )
            // InternalDataflowDSL.g:7872:3: RULE_ID
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


    // $ANTLR start "rule__AllInstances__ModelAssignment_4_1_0"
    // InternalDataflowDSL.g:7881:1: rule__AllInstances__ModelAssignment_4_1_0 : ( RULE_ID ) ;
    public final void rule__AllInstances__ModelAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7885:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7886:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7886:2: ( RULE_ID )
            // InternalDataflowDSL.g:7887:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getModelIDTerminalRuleCall_4_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getModelIDTerminalRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__ModelAssignment_4_1_0"


    // $ANTLR start "rule__AllInstances__PackageNameAssignment_4_2_0"
    // InternalDataflowDSL.g:7896:1: rule__AllInstances__PackageNameAssignment_4_2_0 : ( RULE_ID ) ;
    public final void rule__AllInstances__PackageNameAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7900:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7901:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7901:2: ( RULE_ID )
            // InternalDataflowDSL.g:7902:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getPackageNameIDTerminalRuleCall_4_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getPackageNameIDTerminalRuleCall_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__PackageNameAssignment_4_2_0"


    // $ANTLR start "rule__AllInstances__TypeNameAssignment_4_3"
    // InternalDataflowDSL.g:7911:1: rule__AllInstances__TypeNameAssignment_4_3 : ( RULE_ID ) ;
    public final void rule__AllInstances__TypeNameAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7915:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7916:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7916:2: ( RULE_ID )
            // InternalDataflowDSL.g:7917:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_4_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__TypeNameAssignment_4_3"


    // $ANTLR start "rule__AllInstances__TargetAssignment_5_1"
    // InternalDataflowDSL.g:7926:1: rule__AllInstances__TargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllInstances__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7930:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:7931:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:7931:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7932:3: ( RULE_ID )
            {
             before(grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:7933:3: ( RULE_ID )
            // InternalDataflowDSL.g:7934:4: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getTargetElementIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTargetElementIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__TargetAssignment_5_1"


    // $ANTLR start "rule__NewInstance__NameAssignment_1"
    // InternalDataflowDSL.g:7945:1: rule__NewInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7949:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7950:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7950:2: ( RULE_ID )
            // InternalDataflowDSL.g:7951:3: RULE_ID
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


    // $ANTLR start "rule__NewInstance__InstanceFieldAssignment_3_1"
    // InternalDataflowDSL.g:7960:1: rule__NewInstance__InstanceFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__InstanceFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7964:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7965:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7965:2: ( RULE_ID )
            // InternalDataflowDSL.g:7966:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getInstanceFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getInstanceFieldIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__InstanceFieldAssignment_3_1"


    // $ANTLR start "rule__NewInstance__KeyAssignment_4_1"
    // InternalDataflowDSL.g:7975:1: rule__NewInstance__KeyAssignment_4_1 : ( ruleOrExpression ) ;
    public final void rule__NewInstance__KeyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7979:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:7980:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:7980:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:7981:3: ruleOrExpression
            {
             before(grammarAccess.getNewInstanceAccess().getKeyOrExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getNewInstanceAccess().getKeyOrExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__KeyAssignment_4_1"


    // $ANTLR start "rule__NewInstance__ModelAssignment_5_1_0"
    // InternalDataflowDSL.g:7990:1: rule__NewInstance__ModelAssignment_5_1_0 : ( RULE_ID ) ;
    public final void rule__NewInstance__ModelAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7994:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7995:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7995:2: ( RULE_ID )
            // InternalDataflowDSL.g:7996:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getModelIDTerminalRuleCall_5_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getModelIDTerminalRuleCall_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__ModelAssignment_5_1_0"


    // $ANTLR start "rule__NewInstance__PackageNameAssignment_5_2_0"
    // InternalDataflowDSL.g:8005:1: rule__NewInstance__PackageNameAssignment_5_2_0 : ( RULE_ID ) ;
    public final void rule__NewInstance__PackageNameAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8009:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8010:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8010:2: ( RULE_ID )
            // InternalDataflowDSL.g:8011:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getPackageNameIDTerminalRuleCall_5_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getPackageNameIDTerminalRuleCall_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__PackageNameAssignment_5_2_0"


    // $ANTLR start "rule__NewInstance__TypeNameAssignment_5_3"
    // InternalDataflowDSL.g:8020:1: rule__NewInstance__TypeNameAssignment_5_3 : ( RULE_ID ) ;
    public final void rule__NewInstance__TypeNameAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8024:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8025:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8025:2: ( RULE_ID )
            // InternalDataflowDSL.g:8026:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_5_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__TypeNameAssignment_5_3"


    // $ANTLR start "rule__NewInstance__TargetAssignment_6_1"
    // InternalDataflowDSL.g:8035:1: rule__NewInstance__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewInstance__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8039:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8040:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8040:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8041:3: ( RULE_ID )
            {
             before(grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:8042:3: ( RULE_ID )
            // InternalDataflowDSL.g:8043:4: RULE_ID
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
    // InternalDataflowDSL.g:8054:1: rule__Filter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Filter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8058:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8059:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8059:2: ( RULE_ID )
            // InternalDataflowDSL.g:8060:3: RULE_ID
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


    // $ANTLR start "rule__Filter__FilterByAssignment_3_1"
    // InternalDataflowDSL.g:8069:1: rule__Filter__FilterByAssignment_3_1 : ( ruleOrExpression ) ;
    public final void rule__Filter__FilterByAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8073:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8074:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8074:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8075:3: ruleOrExpression
            {
             before(grammarAccess.getFilterAccess().getFilterByOrExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getFilterByOrExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__FilterByAssignment_3_1"


    // $ANTLR start "rule__Filter__TargetAssignment_4_1"
    // InternalDataflowDSL.g:8084:1: rule__Filter__TargetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Filter__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8088:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8089:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8089:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8090:3: ( RULE_ID )
            {
             before(grammarAccess.getFilterAccess().getTargetElementCrossReference_4_1_0()); 
            // InternalDataflowDSL.g:8091:3: ( RULE_ID )
            // InternalDataflowDSL.g:8092:4: RULE_ID
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
    // InternalDataflowDSL.g:8103:1: rule__Filter__RejectTargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Filter__RejectTargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8107:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8108:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8108:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8109:3: ( RULE_ID )
            {
             before(grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:8110:3: ( RULE_ID )
            // InternalDataflowDSL.g:8111:4: RULE_ID
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


    // $ANTLR start "rule__Copy__NameAssignment_1"
    // InternalDataflowDSL.g:8122:1: rule__Copy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Copy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8126:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8127:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8127:2: ( RULE_ID )
            // InternalDataflowDSL.g:8128:3: RULE_ID
            {
             before(grammarAccess.getCopyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__NameAssignment_1"


    // $ANTLR start "rule__Copy__TargetAssignment_3_1"
    // InternalDataflowDSL.g:8137:1: rule__Copy__TargetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Copy__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8141:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8142:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8142:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8143:3: ( RULE_ID )
            {
             before(grammarAccess.getCopyAccess().getTargetElementCrossReference_3_1_0()); 
            // InternalDataflowDSL.g:8144:3: ( RULE_ID )
            // InternalDataflowDSL.g:8145:4: RULE_ID
            {
             before(grammarAccess.getCopyAccess().getTargetElementIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getTargetElementIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCopyAccess().getTargetElementCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__TargetAssignment_3_1"


    // $ANTLR start "rule__Copy__CopyTargetAssignment_4_1"
    // InternalDataflowDSL.g:8156:1: rule__Copy__CopyTargetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Copy__CopyTargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8160:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8161:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8161:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8162:3: ( RULE_ID )
            {
             before(grammarAccess.getCopyAccess().getCopyTargetElementCrossReference_4_1_0()); 
            // InternalDataflowDSL.g:8163:3: ( RULE_ID )
            // InternalDataflowDSL.g:8164:4: RULE_ID
            {
             before(grammarAccess.getCopyAccess().getCopyTargetElementIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCopyTargetElementIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCopyAccess().getCopyTargetElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__CopyTargetAssignment_4_1"


    // $ANTLR start "rule__Sort__NameAssignment_1"
    // InternalDataflowDSL.g:8175:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8179:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8180:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8180:2: ( RULE_ID )
            // InternalDataflowDSL.g:8181:3: RULE_ID
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


    // $ANTLR start "rule__Sort__SortByAssignment_3_1"
    // InternalDataflowDSL.g:8190:1: rule__Sort__SortByAssignment_3_1 : ( ruleOrExpression ) ;
    public final void rule__Sort__SortByAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8194:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8195:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8195:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8196:3: ruleOrExpression
            {
             before(grammarAccess.getSortAccess().getSortByOrExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getSortAccess().getSortByOrExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__SortByAssignment_3_1"


    // $ANTLR start "rule__Sort__TargetAssignment_4_1"
    // InternalDataflowDSL.g:8205:1: rule__Sort__TargetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Sort__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8209:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8210:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8210:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8211:3: ( RULE_ID )
            {
             before(grammarAccess.getSortAccess().getTargetElementCrossReference_4_1_0()); 
            // InternalDataflowDSL.g:8212:3: ( RULE_ID )
            // InternalDataflowDSL.g:8213:4: RULE_ID
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
    // InternalDataflowDSL.g:8224:1: rule__Product__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Product__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8228:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8229:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8229:2: ( RULE_ID )
            // InternalDataflowDSL.g:8230:3: RULE_ID
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
    // InternalDataflowDSL.g:8239:1: rule__Product__TargetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Product__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8243:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8244:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8244:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8245:3: ( RULE_ID )
            {
             before(grammarAccess.getProductAccess().getTargetElementCrossReference_3_1_0()); 
            // InternalDataflowDSL.g:8246:3: ( RULE_ID )
            // InternalDataflowDSL.g:8247:4: RULE_ID
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
    // InternalDataflowDSL.g:8258:1: rule__GetFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8262:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8263:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8263:2: ( RULE_ID )
            // InternalDataflowDSL.g:8264:3: RULE_ID
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
    // InternalDataflowDSL.g:8273:1: rule__GetFeature__ObjectFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__ObjectFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8277:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8278:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8278:2: ( RULE_ID )
            // InternalDataflowDSL.g:8279:3: RULE_ID
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
    // InternalDataflowDSL.g:8288:1: rule__GetFeature__ValueFieldAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__ValueFieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8292:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8293:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8293:2: ( RULE_ID )
            // InternalDataflowDSL.g:8294:3: RULE_ID
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
    // InternalDataflowDSL.g:8303:1: rule__GetFeature__FeatureAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__FeatureAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8307:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8308:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8308:2: ( RULE_ID )
            // InternalDataflowDSL.g:8309:3: RULE_ID
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
    // InternalDataflowDSL.g:8318:1: rule__GetFeature__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetFeature__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8322:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8323:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8323:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8324:3: ( RULE_ID )
            {
             before(grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:8325:3: ( RULE_ID )
            // InternalDataflowDSL.g:8326:4: RULE_ID
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
    // InternalDataflowDSL.g:8337:1: rule__SetFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8341:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8342:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8342:2: ( RULE_ID )
            // InternalDataflowDSL.g:8343:3: RULE_ID
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
    // InternalDataflowDSL.g:8352:1: rule__SetFeature__ObjectFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__ObjectFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8356:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8357:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8357:2: ( RULE_ID )
            // InternalDataflowDSL.g:8358:3: RULE_ID
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


    // $ANTLR start "rule__SetFeature__ValueAssignment_4_1"
    // InternalDataflowDSL.g:8367:1: rule__SetFeature__ValueAssignment_4_1 : ( ruleOrExpression ) ;
    public final void rule__SetFeature__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8371:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8372:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8372:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8373:3: ruleOrExpression
            {
             before(grammarAccess.getSetFeatureAccess().getValueOrExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getSetFeatureAccess().getValueOrExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__ValueAssignment_4_1"


    // $ANTLR start "rule__SetFeature__FeatureAssignment_5_1"
    // InternalDataflowDSL.g:8382:1: rule__SetFeature__FeatureAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__FeatureAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8386:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8387:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8387:2: ( RULE_ID )
            // InternalDataflowDSL.g:8388:3: RULE_ID
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
    // InternalDataflowDSL.g:8397:1: rule__SetFeature__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetFeature__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8401:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8402:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8402:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8403:3: ( RULE_ID )
            {
             before(grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:8404:3: ( RULE_ID )
            // InternalDataflowDSL.g:8405:4: RULE_ID
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
    // InternalDataflowDSL.g:8416:1: rule__NewContainer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8420:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8421:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8421:2: ( RULE_ID )
            // InternalDataflowDSL.g:8422:3: RULE_ID
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
    // InternalDataflowDSL.g:8431:1: rule__NewContainer__ListFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__NewContainer__ListFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8435:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8436:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8436:2: ( RULE_ID )
            // InternalDataflowDSL.g:8437:3: RULE_ID
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
    // InternalDataflowDSL.g:8446:1: rule__NewContainer__ContainerTypeAssignment_4_1 : ( ruleContainerType ) ;
    public final void rule__NewContainer__ContainerTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8450:1: ( ( ruleContainerType ) )
            // InternalDataflowDSL.g:8451:2: ( ruleContainerType )
            {
            // InternalDataflowDSL.g:8451:2: ( ruleContainerType )
            // InternalDataflowDSL.g:8452:3: ruleContainerType
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
    // InternalDataflowDSL.g:8461:1: rule__NewContainer__TargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewContainer__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8465:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8466:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8466:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8467:3: ( RULE_ID )
            {
             before(grammarAccess.getNewContainerAccess().getTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:8468:3: ( RULE_ID )
            // InternalDataflowDSL.g:8469:4: RULE_ID
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
    // InternalDataflowDSL.g:8480:1: rule__AddToContainer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8484:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8485:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8485:2: ( RULE_ID )
            // InternalDataflowDSL.g:8486:3: RULE_ID
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
    // InternalDataflowDSL.g:8495:1: rule__AddToContainer__ListFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__ListFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8499:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8500:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8500:2: ( RULE_ID )
            // InternalDataflowDSL.g:8501:3: RULE_ID
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


    // $ANTLR start "rule__AddToContainer__ValueAssignment_4_1"
    // InternalDataflowDSL.g:8510:1: rule__AddToContainer__ValueAssignment_4_1 : ( ruleOrExpression ) ;
    public final void rule__AddToContainer__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8514:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8515:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8515:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8516:3: ruleOrExpression
            {
             before(grammarAccess.getAddToContainerAccess().getValueOrExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getAddToContainerAccess().getValueOrExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__ValueAssignment_4_1"


    // $ANTLR start "rule__AddToContainer__PositionAssignment_5_1"
    // InternalDataflowDSL.g:8525:1: rule__AddToContainer__PositionAssignment_5_1 : ( ruleOrExpression ) ;
    public final void rule__AddToContainer__PositionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8529:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8530:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8530:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8531:3: ruleOrExpression
            {
             before(grammarAccess.getAddToContainerAccess().getPositionOrExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getAddToContainerAccess().getPositionOrExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__PositionAssignment_5_1"


    // $ANTLR start "rule__AddToContainer__TargetAssignment_6_1"
    // InternalDataflowDSL.g:8540:1: rule__AddToContainer__TargetAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__AddToContainer__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8544:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8545:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8545:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8546:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_6_1_0()); 
            // InternalDataflowDSL.g:8547:3: ( RULE_ID )
            // InternalDataflowDSL.g:8548:4: RULE_ID
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


    // $ANTLR start "rule__ForEach__NameAssignment_1"
    // InternalDataflowDSL.g:8559:1: rule__ForEach__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForEach__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8563:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8564:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8564:2: ( RULE_ID )
            // InternalDataflowDSL.g:8565:3: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__NameAssignment_1"


    // $ANTLR start "rule__ForEach__ListFieldAssignment_3_1"
    // InternalDataflowDSL.g:8574:1: rule__ForEach__ListFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__ForEach__ListFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8578:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8579:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8579:2: ( RULE_ID )
            // InternalDataflowDSL.g:8580:3: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getListFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getListFieldIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__ListFieldAssignment_3_1"


    // $ANTLR start "rule__ForEach__TargetAssignment_4_1"
    // InternalDataflowDSL.g:8589:1: rule__ForEach__TargetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8593:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8594:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8594:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8595:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getTargetElementCrossReference_4_1_0()); 
            // InternalDataflowDSL.g:8596:3: ( RULE_ID )
            // InternalDataflowDSL.g:8597:4: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getTargetElementIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getTargetElementIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getForEachAccess().getTargetElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__TargetAssignment_4_1"


    // $ANTLR start "rule__CollectBy__NameAssignment_1"
    // InternalDataflowDSL.g:8608:1: rule__CollectBy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CollectBy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8612:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8613:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8613:2: ( RULE_ID )
            // InternalDataflowDSL.g:8614:3: RULE_ID
            {
             before(grammarAccess.getCollectByAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__NameAssignment_1"


    // $ANTLR start "rule__CollectBy__ElementFieldAssignment_3_1"
    // InternalDataflowDSL.g:8623:1: rule__CollectBy__ElementFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__CollectBy__ElementFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8627:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8628:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8628:2: ( RULE_ID )
            // InternalDataflowDSL.g:8629:3: RULE_ID
            {
             before(grammarAccess.getCollectByAccess().getElementFieldIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getElementFieldIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__ElementFieldAssignment_3_1"


    // $ANTLR start "rule__CollectBy__CollectByAssignment_4_1"
    // InternalDataflowDSL.g:8638:1: rule__CollectBy__CollectByAssignment_4_1 : ( ruleOrExpression ) ;
    public final void rule__CollectBy__CollectByAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8642:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8643:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8643:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8644:3: ruleOrExpression
            {
             before(grammarAccess.getCollectByAccess().getCollectByOrExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getCollectByAccess().getCollectByOrExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__CollectByAssignment_4_1"


    // $ANTLR start "rule__CollectBy__TargetAssignment_5_1"
    // InternalDataflowDSL.g:8653:1: rule__CollectBy__TargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__CollectBy__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8657:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8658:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8658:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8659:3: ( RULE_ID )
            {
             before(grammarAccess.getCollectByAccess().getTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:8660:3: ( RULE_ID )
            // InternalDataflowDSL.g:8661:4: RULE_ID
            {
             before(grammarAccess.getCollectByAccess().getTargetElementIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getTargetElementIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCollectByAccess().getTargetElementCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__TargetAssignment_5_1"


    // $ANTLR start "rule__Evaluate__NameAssignment_1"
    // InternalDataflowDSL.g:8672:1: rule__Evaluate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Evaluate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8676:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8677:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8677:2: ( RULE_ID )
            // InternalDataflowDSL.g:8678:3: RULE_ID
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
    // InternalDataflowDSL.g:8687:1: rule__Evaluate__FieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Evaluate__FieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8691:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8692:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8692:2: ( RULE_ID )
            // InternalDataflowDSL.g:8693:3: RULE_ID
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
    // InternalDataflowDSL.g:8702:1: rule__Evaluate__ExpressionAssignment_4_1 : ( ruleOrExpression ) ;
    public final void rule__Evaluate__ExpressionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8706:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8707:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8707:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8708:3: ruleOrExpression
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
    // InternalDataflowDSL.g:8717:1: rule__Evaluate__TargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Evaluate__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8721:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8722:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8722:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8723:3: ( RULE_ID )
            {
             before(grammarAccess.getEvaluateAccess().getTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:8724:3: ( RULE_ID )
            // InternalDataflowDSL.g:8725:4: RULE_ID
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
    // InternalDataflowDSL.g:8736:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8740:1: ( ( ruleOrOperator ) )
            // InternalDataflowDSL.g:8741:2: ( ruleOrOperator )
            {
            // InternalDataflowDSL.g:8741:2: ( ruleOrOperator )
            // InternalDataflowDSL.g:8742:3: ruleOrOperator
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
    // InternalDataflowDSL.g:8751:1: rule__OrExpression__RightExpressionAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8755:1: ( ( ruleAndExpression ) )
            // InternalDataflowDSL.g:8756:2: ( ruleAndExpression )
            {
            // InternalDataflowDSL.g:8756:2: ( ruleAndExpression )
            // InternalDataflowDSL.g:8757:3: ruleAndExpression
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
    // InternalDataflowDSL.g:8766:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8770:1: ( ( ruleAndOperator ) )
            // InternalDataflowDSL.g:8771:2: ( ruleAndOperator )
            {
            // InternalDataflowDSL.g:8771:2: ( ruleAndOperator )
            // InternalDataflowDSL.g:8772:3: ruleAndOperator
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
    // InternalDataflowDSL.g:8781:1: rule__AndExpression__RightExpressionAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8785:1: ( ( ruleEqualityExpression ) )
            // InternalDataflowDSL.g:8786:2: ( ruleEqualityExpression )
            {
            // InternalDataflowDSL.g:8786:2: ( ruleEqualityExpression )
            // InternalDataflowDSL.g:8787:3: ruleEqualityExpression
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
    // InternalDataflowDSL.g:8796:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8800:1: ( ( ruleEqualityOperator ) )
            // InternalDataflowDSL.g:8801:2: ( ruleEqualityOperator )
            {
            // InternalDataflowDSL.g:8801:2: ( ruleEqualityOperator )
            // InternalDataflowDSL.g:8802:3: ruleEqualityOperator
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
    // InternalDataflowDSL.g:8811:1: rule__EqualityExpression__RightExpressionAssignment_1_2 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8815:1: ( ( ruleRelationalExpression ) )
            // InternalDataflowDSL.g:8816:2: ( ruleRelationalExpression )
            {
            // InternalDataflowDSL.g:8816:2: ( ruleRelationalExpression )
            // InternalDataflowDSL.g:8817:3: ruleRelationalExpression
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
    // InternalDataflowDSL.g:8826:1: rule__RelationalExpression__OperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8830:1: ( ( ruleRelationalOperator ) )
            // InternalDataflowDSL.g:8831:2: ( ruleRelationalOperator )
            {
            // InternalDataflowDSL.g:8831:2: ( ruleRelationalOperator )
            // InternalDataflowDSL.g:8832:3: ruleRelationalOperator
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
    // InternalDataflowDSL.g:8841:1: rule__RelationalExpression__RightExpressionAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8845:1: ( ( ruleAdditiveExpression ) )
            // InternalDataflowDSL.g:8846:2: ( ruleAdditiveExpression )
            {
            // InternalDataflowDSL.g:8846:2: ( ruleAdditiveExpression )
            // InternalDataflowDSL.g:8847:3: ruleAdditiveExpression
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
    // InternalDataflowDSL.g:8856:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8860:1: ( ( ruleAdditiveOperator ) )
            // InternalDataflowDSL.g:8861:2: ( ruleAdditiveOperator )
            {
            // InternalDataflowDSL.g:8861:2: ( ruleAdditiveOperator )
            // InternalDataflowDSL.g:8862:3: ruleAdditiveOperator
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
    // InternalDataflowDSL.g:8871:1: rule__AdditiveExpression__RightExpressionAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8875:1: ( ( ruleMultiplicativeExpression ) )
            // InternalDataflowDSL.g:8876:2: ( ruleMultiplicativeExpression )
            {
            // InternalDataflowDSL.g:8876:2: ( ruleMultiplicativeExpression )
            // InternalDataflowDSL.g:8877:3: ruleMultiplicativeExpression
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
    // InternalDataflowDSL.g:8886:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8890:1: ( ( ruleMultiplicativeOperator ) )
            // InternalDataflowDSL.g:8891:2: ( ruleMultiplicativeOperator )
            {
            // InternalDataflowDSL.g:8891:2: ( ruleMultiplicativeOperator )
            // InternalDataflowDSL.g:8892:3: ruleMultiplicativeOperator
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
    // InternalDataflowDSL.g:8901:1: rule__MultiplicativeExpression__RightExpressionAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8905:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:8906:2: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:8906:2: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:8907:3: ruleUnaryExpression
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
    // InternalDataflowDSL.g:8916:1: rule__UnaryExpression__OperatorAssignment_0_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8920:1: ( ( ruleUnaryOperator ) )
            // InternalDataflowDSL.g:8921:2: ( ruleUnaryOperator )
            {
            // InternalDataflowDSL.g:8921:2: ( ruleUnaryOperator )
            // InternalDataflowDSL.g:8922:3: ruleUnaryOperator
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
    // InternalDataflowDSL.g:8931:1: rule__UnaryExpression__ExpressionAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8935:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:8936:2: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:8936:2: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:8937:3: ruleUnaryExpression
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


    // $ANTLR start "rule__FeatureCallExpression__FeatureAssignment_1_2"
    // InternalDataflowDSL.g:8946:1: rule__FeatureCallExpression__FeatureAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__FeatureCallExpression__FeatureAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8950:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8951:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8951:2: ( RULE_ID )
            // InternalDataflowDSL.g:8952:3: RULE_ID
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFeatureIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureCallExpressionAccess().getFeatureIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__FeatureAssignment_1_2"


    // $ANTLR start "rule__FeatureCallExpression__ParametersAssignment_1_3_1_0"
    // InternalDataflowDSL.g:8961:1: rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 : ( ruleOrExpression ) ;
    public final void rule__FeatureCallExpression__ParametersAssignment_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8965:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8966:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8966:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8967:3: ruleOrExpression
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getParametersOrExpressionParserRuleCall_1_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getFeatureCallExpressionAccess().getParametersOrExpressionParserRuleCall_1_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__ParametersAssignment_1_3_1_0"


    // $ANTLR start "rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1"
    // InternalDataflowDSL.g:8976:1: rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 : ( ruleOrExpression ) ;
    public final void rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8980:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8981:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8981:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8982:3: ruleOrExpression
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getParametersOrExpressionParserRuleCall_1_3_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getFeatureCallExpressionAccess().getParametersOrExpressionParserRuleCall_1_3_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_0_1"
    // InternalDataflowDSL.g:8991:1: rule__PrimaryExpression__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__PrimaryExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8995:1: ( ( ruleEInt ) )
            // InternalDataflowDSL.g:8996:2: ( ruleEInt )
            {
            // InternalDataflowDSL.g:8996:2: ( ruleEInt )
            // InternalDataflowDSL.g:8997:3: ruleEInt
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
    // InternalDataflowDSL.g:9006:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9010:1: ( ( ruleEBoolean ) )
            // InternalDataflowDSL.g:9011:2: ( ruleEBoolean )
            {
            // InternalDataflowDSL.g:9011:2: ( ruleEBoolean )
            // InternalDataflowDSL.g:9012:3: ruleEBoolean
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
    // InternalDataflowDSL.g:9021:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9025:1: ( ( ruleEDouble ) )
            // InternalDataflowDSL.g:9026:2: ( ruleEDouble )
            {
            // InternalDataflowDSL.g:9026:2: ( ruleEDouble )
            // InternalDataflowDSL.g:9027:3: ruleEDouble
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
    // InternalDataflowDSL.g:9036:1: rule__PrimaryExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9040:1: ( ( RULE_STRING ) )
            // InternalDataflowDSL.g:9041:2: ( RULE_STRING )
            {
            // InternalDataflowDSL.g:9041:2: ( RULE_STRING )
            // InternalDataflowDSL.g:9042:3: RULE_STRING
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
    // InternalDataflowDSL.g:9051:1: rule__PrimaryExpression__FieldAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__FieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9055:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:9056:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:9056:2: ( RULE_ID )
            // InternalDataflowDSL.g:9057:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x6946A48080000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x6946A48080000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004E00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000034A00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000044006070L,0x0000000000000018L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000184200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000404200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001004200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0038004200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00A8004200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0600004200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1280004200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200004200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x8000004200000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004600000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000044006070L,0x0000000000000038L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000004000010L});

}