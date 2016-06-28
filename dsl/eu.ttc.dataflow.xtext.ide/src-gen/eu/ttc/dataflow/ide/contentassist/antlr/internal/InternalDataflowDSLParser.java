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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'and'", "'true'", "'false'", "'E'", "'e'", "'list'", "'set'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'AllInstances'", "'{'", "'}'", "'field'", "'type'", "'!'", "'::'", "'target'", "'NewInstance'", "'key'", "'Filter'", "'filterBy'", "'rejectTarget'", "'Copy'", "'copyTarget'", "'Sort'", "'sortBy'", "'Product'", "'GetFeature'", "'objectField'", "'valueField'", "'feature'", "'SetFeature'", "'value'", "'NewContainer'", "'containerType'", "'AddToContainer'", "'position'", "'ForEach'", "'listField'", "'itemField'", "'positionField'", "'CollectBy'", "'collectBy'", "'Evaluate'", "'expression'", "'if'", "'then'", "'else'", "'.'", "'('", "')'", "','"
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
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalDataflowDSL.g:428:1: entryRuleConditionalExpression : ruleConditionalExpression EOF ;
    public final void entryRuleConditionalExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:429:1: ( ruleConditionalExpression EOF )
            // InternalDataflowDSL.g:430:1: ruleConditionalExpression EOF
            {
             before(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionRule()); 
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
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalDataflowDSL.g:437:1: ruleConditionalExpression : ( ( rule__ConditionalExpression__Alternatives ) ) ;
    public final void ruleConditionalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:441:2: ( ( ( rule__ConditionalExpression__Alternatives ) ) )
            // InternalDataflowDSL.g:442:2: ( ( rule__ConditionalExpression__Alternatives ) )
            {
            // InternalDataflowDSL.g:442:2: ( ( rule__ConditionalExpression__Alternatives ) )
            // InternalDataflowDSL.g:443:3: ( rule__ConditionalExpression__Alternatives )
            {
             before(grammarAccess.getConditionalExpressionAccess().getAlternatives()); 
            // InternalDataflowDSL.g:444:3: ( rule__ConditionalExpression__Alternatives )
            // InternalDataflowDSL.g:444:4: rule__ConditionalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalDataflowDSL.g:453:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:454:1: ( ruleOrExpression EOF )
            // InternalDataflowDSL.g:455:1: ruleOrExpression EOF
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
    // InternalDataflowDSL.g:462:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:466:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:467:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:467:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalDataflowDSL.g:468:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:469:3: ( rule__OrExpression__Group__0 )
            // InternalDataflowDSL.g:469:4: rule__OrExpression__Group__0
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
    // InternalDataflowDSL.g:478:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:479:1: ( ruleAndExpression EOF )
            // InternalDataflowDSL.g:480:1: ruleAndExpression EOF
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
    // InternalDataflowDSL.g:487:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:491:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:492:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:492:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalDataflowDSL.g:493:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:494:3: ( rule__AndExpression__Group__0 )
            // InternalDataflowDSL.g:494:4: rule__AndExpression__Group__0
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
    // InternalDataflowDSL.g:503:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:504:1: ( ruleEqualityExpression EOF )
            // InternalDataflowDSL.g:505:1: ruleEqualityExpression EOF
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
    // InternalDataflowDSL.g:512:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:516:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:517:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:517:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalDataflowDSL.g:518:3: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:519:3: ( rule__EqualityExpression__Group__0 )
            // InternalDataflowDSL.g:519:4: rule__EqualityExpression__Group__0
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
    // InternalDataflowDSL.g:528:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:529:1: ( ruleRelationalExpression EOF )
            // InternalDataflowDSL.g:530:1: ruleRelationalExpression EOF
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
    // InternalDataflowDSL.g:537:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:541:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:542:2: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:542:2: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalDataflowDSL.g:543:3: ( rule__RelationalExpression__Group__0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:544:3: ( rule__RelationalExpression__Group__0 )
            // InternalDataflowDSL.g:544:4: rule__RelationalExpression__Group__0
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
    // InternalDataflowDSL.g:553:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:554:1: ( ruleAdditiveExpression EOF )
            // InternalDataflowDSL.g:555:1: ruleAdditiveExpression EOF
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
    // InternalDataflowDSL.g:562:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:566:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:567:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:567:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalDataflowDSL.g:568:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:569:3: ( rule__AdditiveExpression__Group__0 )
            // InternalDataflowDSL.g:569:4: rule__AdditiveExpression__Group__0
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
    // InternalDataflowDSL.g:578:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:579:1: ( ruleMultiplicativeExpression EOF )
            // InternalDataflowDSL.g:580:1: ruleMultiplicativeExpression EOF
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
    // InternalDataflowDSL.g:587:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:591:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:592:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:592:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalDataflowDSL.g:593:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:594:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalDataflowDSL.g:594:4: rule__MultiplicativeExpression__Group__0
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
    // InternalDataflowDSL.g:603:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:604:1: ( ruleUnaryExpression EOF )
            // InternalDataflowDSL.g:605:1: ruleUnaryExpression EOF
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
    // InternalDataflowDSL.g:612:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:616:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalDataflowDSL.g:617:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalDataflowDSL.g:617:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalDataflowDSL.g:618:3: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // InternalDataflowDSL.g:619:3: ( rule__UnaryExpression__Alternatives )
            // InternalDataflowDSL.g:619:4: rule__UnaryExpression__Alternatives
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
    // InternalDataflowDSL.g:628:1: entryRuleFeatureCallExpression : ruleFeatureCallExpression EOF ;
    public final void entryRuleFeatureCallExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:629:1: ( ruleFeatureCallExpression EOF )
            // InternalDataflowDSL.g:630:1: ruleFeatureCallExpression EOF
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
    // InternalDataflowDSL.g:637:1: ruleFeatureCallExpression : ( ( rule__FeatureCallExpression__Group__0 ) ) ;
    public final void ruleFeatureCallExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:641:2: ( ( ( rule__FeatureCallExpression__Group__0 ) ) )
            // InternalDataflowDSL.g:642:2: ( ( rule__FeatureCallExpression__Group__0 ) )
            {
            // InternalDataflowDSL.g:642:2: ( ( rule__FeatureCallExpression__Group__0 ) )
            // InternalDataflowDSL.g:643:3: ( rule__FeatureCallExpression__Group__0 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup()); 
            // InternalDataflowDSL.g:644:3: ( rule__FeatureCallExpression__Group__0 )
            // InternalDataflowDSL.g:644:4: rule__FeatureCallExpression__Group__0
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
    // InternalDataflowDSL.g:653:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:654:1: ( rulePrimaryExpression EOF )
            // InternalDataflowDSL.g:655:1: rulePrimaryExpression EOF
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
    // InternalDataflowDSL.g:662:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:666:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalDataflowDSL.g:667:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalDataflowDSL.g:667:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalDataflowDSL.g:668:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalDataflowDSL.g:669:3: ( rule__PrimaryExpression__Alternatives )
            // InternalDataflowDSL.g:669:4: rule__PrimaryExpression__Alternatives
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
    // InternalDataflowDSL.g:678:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:679:1: ( ruleEInt EOF )
            // InternalDataflowDSL.g:680:1: ruleEInt EOF
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
    // InternalDataflowDSL.g:687:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:691:2: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:692:2: ( RULE_INT )
            {
            // InternalDataflowDSL.g:692:2: ( RULE_INT )
            // InternalDataflowDSL.g:693:3: RULE_INT
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
    // InternalDataflowDSL.g:703:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:704:1: ( ruleEBoolean EOF )
            // InternalDataflowDSL.g:705:1: ruleEBoolean EOF
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
    // InternalDataflowDSL.g:712:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:716:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalDataflowDSL.g:717:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalDataflowDSL.g:717:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalDataflowDSL.g:718:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalDataflowDSL.g:719:3: ( rule__EBoolean__Alternatives )
            // InternalDataflowDSL.g:719:4: rule__EBoolean__Alternatives
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
    // InternalDataflowDSL.g:728:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalDataflowDSL.g:729:1: ( ruleEDouble EOF )
            // InternalDataflowDSL.g:730:1: ruleEDouble EOF
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
    // InternalDataflowDSL.g:737:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:741:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalDataflowDSL.g:742:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalDataflowDSL.g:742:2: ( ( rule__EDouble__Group__0 ) )
            // InternalDataflowDSL.g:743:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalDataflowDSL.g:744:3: ( rule__EDouble__Group__0 )
            // InternalDataflowDSL.g:744:4: rule__EDouble__Group__0
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
    // InternalDataflowDSL.g:753:1: ruleContainerType : ( ( rule__ContainerType__Alternatives ) ) ;
    public final void ruleContainerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:757:1: ( ( ( rule__ContainerType__Alternatives ) ) )
            // InternalDataflowDSL.g:758:2: ( ( rule__ContainerType__Alternatives ) )
            {
            // InternalDataflowDSL.g:758:2: ( ( rule__ContainerType__Alternatives ) )
            // InternalDataflowDSL.g:759:3: ( rule__ContainerType__Alternatives )
            {
             before(grammarAccess.getContainerTypeAccess().getAlternatives()); 
            // InternalDataflowDSL.g:760:3: ( rule__ContainerType__Alternatives )
            // InternalDataflowDSL.g:760:4: rule__ContainerType__Alternatives
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
    // InternalDataflowDSL.g:769:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:773:1: ( ( ( 'or' ) ) )
            // InternalDataflowDSL.g:774:2: ( ( 'or' ) )
            {
            // InternalDataflowDSL.g:774:2: ( ( 'or' ) )
            // InternalDataflowDSL.g:775:3: ( 'or' )
            {
             before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalDataflowDSL.g:776:3: ( 'or' )
            // InternalDataflowDSL.g:776:4: 'or'
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
    // InternalDataflowDSL.g:785:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:789:1: ( ( ( 'and' ) ) )
            // InternalDataflowDSL.g:790:2: ( ( 'and' ) )
            {
            // InternalDataflowDSL.g:790:2: ( ( 'and' ) )
            // InternalDataflowDSL.g:791:3: ( 'and' )
            {
             before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalDataflowDSL.g:792:3: ( 'and' )
            // InternalDataflowDSL.g:792:4: 'and'
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
    // InternalDataflowDSL.g:801:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:805:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:806:2: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:806:2: ( ( rule__EqualityOperator__Alternatives ) )
            // InternalDataflowDSL.g:807:3: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:808:3: ( rule__EqualityOperator__Alternatives )
            // InternalDataflowDSL.g:808:4: rule__EqualityOperator__Alternatives
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
    // InternalDataflowDSL.g:817:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:821:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:822:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:822:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalDataflowDSL.g:823:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:824:3: ( rule__RelationalOperator__Alternatives )
            // InternalDataflowDSL.g:824:4: rule__RelationalOperator__Alternatives
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
    // InternalDataflowDSL.g:833:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:837:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:838:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:838:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalDataflowDSL.g:839:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:840:3: ( rule__AdditiveOperator__Alternatives )
            // InternalDataflowDSL.g:840:4: rule__AdditiveOperator__Alternatives
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
    // InternalDataflowDSL.g:849:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:853:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:854:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:854:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalDataflowDSL.g:855:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:856:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalDataflowDSL.g:856:4: rule__MultiplicativeOperator__Alternatives
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
    // InternalDataflowDSL.g:865:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:869:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalDataflowDSL.g:870:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalDataflowDSL.g:870:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalDataflowDSL.g:871:3: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // InternalDataflowDSL.g:872:3: ( rule__UnaryOperator__Alternatives )
            // InternalDataflowDSL.g:872:4: rule__UnaryOperator__Alternatives
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
    // InternalDataflowDSL.g:880:1: rule__Element__Alternatives : ( ( ruleAllInstances ) | ( ruleNewInstance ) | ( ruleFilter ) | ( ruleSort ) | ( ruleCopy ) | ( ruleProduct ) | ( ruleGetFeature ) | ( ruleSetFeature ) | ( ruleNewContainer ) | ( ruleAddToContainer ) | ( ruleForEach ) | ( ruleCollectBy ) | ( ruleEvaluate ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:884:1: ( ( ruleAllInstances ) | ( ruleNewInstance ) | ( ruleFilter ) | ( ruleSort ) | ( ruleCopy ) | ( ruleProduct ) | ( ruleGetFeature ) | ( ruleSetFeature ) | ( ruleNewContainer ) | ( ruleAddToContainer ) | ( ruleForEach ) | ( ruleCollectBy ) | ( ruleEvaluate ) )
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
            case 41:
                {
                alt1=3;
                }
                break;
            case 46:
                {
                alt1=4;
                }
                break;
            case 44:
                {
                alt1=5;
                }
                break;
            case 48:
                {
                alt1=6;
                }
                break;
            case 49:
                {
                alt1=7;
                }
                break;
            case 53:
                {
                alt1=8;
                }
                break;
            case 55:
                {
                alt1=9;
                }
                break;
            case 57:
                {
                alt1=10;
                }
                break;
            case 59:
                {
                alt1=11;
                }
                break;
            case 63:
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
                    // InternalDataflowDSL.g:885:2: ( ruleAllInstances )
                    {
                    // InternalDataflowDSL.g:885:2: ( ruleAllInstances )
                    // InternalDataflowDSL.g:886:3: ruleAllInstances
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
                    // InternalDataflowDSL.g:891:2: ( ruleNewInstance )
                    {
                    // InternalDataflowDSL.g:891:2: ( ruleNewInstance )
                    // InternalDataflowDSL.g:892:3: ruleNewInstance
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
                    // InternalDataflowDSL.g:897:2: ( ruleFilter )
                    {
                    // InternalDataflowDSL.g:897:2: ( ruleFilter )
                    // InternalDataflowDSL.g:898:3: ruleFilter
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
                    // InternalDataflowDSL.g:903:2: ( ruleSort )
                    {
                    // InternalDataflowDSL.g:903:2: ( ruleSort )
                    // InternalDataflowDSL.g:904:3: ruleSort
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
                    // InternalDataflowDSL.g:909:2: ( ruleCopy )
                    {
                    // InternalDataflowDSL.g:909:2: ( ruleCopy )
                    // InternalDataflowDSL.g:910:3: ruleCopy
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
                    // InternalDataflowDSL.g:915:2: ( ruleProduct )
                    {
                    // InternalDataflowDSL.g:915:2: ( ruleProduct )
                    // InternalDataflowDSL.g:916:3: ruleProduct
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
                    // InternalDataflowDSL.g:921:2: ( ruleGetFeature )
                    {
                    // InternalDataflowDSL.g:921:2: ( ruleGetFeature )
                    // InternalDataflowDSL.g:922:3: ruleGetFeature
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
                    // InternalDataflowDSL.g:927:2: ( ruleSetFeature )
                    {
                    // InternalDataflowDSL.g:927:2: ( ruleSetFeature )
                    // InternalDataflowDSL.g:928:3: ruleSetFeature
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
                    // InternalDataflowDSL.g:933:2: ( ruleNewContainer )
                    {
                    // InternalDataflowDSL.g:933:2: ( ruleNewContainer )
                    // InternalDataflowDSL.g:934:3: ruleNewContainer
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
                    // InternalDataflowDSL.g:939:2: ( ruleAddToContainer )
                    {
                    // InternalDataflowDSL.g:939:2: ( ruleAddToContainer )
                    // InternalDataflowDSL.g:940:3: ruleAddToContainer
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
                    // InternalDataflowDSL.g:945:2: ( ruleForEach )
                    {
                    // InternalDataflowDSL.g:945:2: ( ruleForEach )
                    // InternalDataflowDSL.g:946:3: ruleForEach
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
                    // InternalDataflowDSL.g:951:2: ( ruleCollectBy )
                    {
                    // InternalDataflowDSL.g:951:2: ( ruleCollectBy )
                    // InternalDataflowDSL.g:952:3: ruleCollectBy
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
                    // InternalDataflowDSL.g:957:2: ( ruleEvaluate )
                    {
                    // InternalDataflowDSL.g:957:2: ( ruleEvaluate )
                    // InternalDataflowDSL.g:958:3: ruleEvaluate
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


    // $ANTLR start "rule__AllInstances__Alternatives_3"
    // InternalDataflowDSL.g:967:1: rule__AllInstances__Alternatives_3 : ( ( ( rule__AllInstances__Group_3_0__0 ) ) | ( ( rule__AllInstances__Group_3_1__0 ) ) | ( ( rule__AllInstances__Group_3_2__0 ) ) );
    public final void rule__AllInstances__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:971:1: ( ( ( rule__AllInstances__Group_3_0__0 ) ) | ( ( rule__AllInstances__Group_3_1__0 ) ) | ( ( rule__AllInstances__Group_3_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDataflowDSL.g:972:2: ( ( rule__AllInstances__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:972:2: ( ( rule__AllInstances__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:973:3: ( rule__AllInstances__Group_3_0__0 )
                    {
                     before(grammarAccess.getAllInstancesAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:974:3: ( rule__AllInstances__Group_3_0__0 )
                    // InternalDataflowDSL.g:974:4: rule__AllInstances__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllInstancesAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:978:2: ( ( rule__AllInstances__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:978:2: ( ( rule__AllInstances__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:979:3: ( rule__AllInstances__Group_3_1__0 )
                    {
                     before(grammarAccess.getAllInstancesAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:980:3: ( rule__AllInstances__Group_3_1__0 )
                    // InternalDataflowDSL.g:980:4: rule__AllInstances__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllInstancesAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:984:2: ( ( rule__AllInstances__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:984:2: ( ( rule__AllInstances__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:985:3: ( rule__AllInstances__Group_3_2__0 )
                    {
                     before(grammarAccess.getAllInstancesAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:986:3: ( rule__AllInstances__Group_3_2__0 )
                    // InternalDataflowDSL.g:986:4: rule__AllInstances__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllInstancesAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__AllInstances__Alternatives_3"


    // $ANTLR start "rule__NewInstance__Alternatives_3"
    // InternalDataflowDSL.g:994:1: rule__NewInstance__Alternatives_3 : ( ( ( rule__NewInstance__Group_3_0__0 ) ) | ( ( rule__NewInstance__Group_3_1__0 ) ) | ( ( rule__NewInstance__Group_3_2__0 ) ) | ( ( rule__NewInstance__Group_3_3__0 ) ) );
    public final void rule__NewInstance__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:998:1: ( ( ( rule__NewInstance__Group_3_0__0 ) ) | ( ( rule__NewInstance__Group_3_1__0 ) ) | ( ( rule__NewInstance__Group_3_2__0 ) ) | ( ( rule__NewInstance__Group_3_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDataflowDSL.g:999:2: ( ( rule__NewInstance__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:999:2: ( ( rule__NewInstance__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1000:3: ( rule__NewInstance__Group_3_0__0 )
                    {
                     before(grammarAccess.getNewInstanceAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1001:3: ( rule__NewInstance__Group_3_0__0 )
                    // InternalDataflowDSL.g:1001:4: rule__NewInstance__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNewInstanceAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1005:2: ( ( rule__NewInstance__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1005:2: ( ( rule__NewInstance__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1006:3: ( rule__NewInstance__Group_3_1__0 )
                    {
                     before(grammarAccess.getNewInstanceAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1007:3: ( rule__NewInstance__Group_3_1__0 )
                    // InternalDataflowDSL.g:1007:4: rule__NewInstance__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNewInstanceAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1011:2: ( ( rule__NewInstance__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1011:2: ( ( rule__NewInstance__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1012:3: ( rule__NewInstance__Group_3_2__0 )
                    {
                     before(grammarAccess.getNewInstanceAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1013:3: ( rule__NewInstance__Group_3_2__0 )
                    // InternalDataflowDSL.g:1013:4: rule__NewInstance__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNewInstanceAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1017:2: ( ( rule__NewInstance__Group_3_3__0 ) )
                    {
                    // InternalDataflowDSL.g:1017:2: ( ( rule__NewInstance__Group_3_3__0 ) )
                    // InternalDataflowDSL.g:1018:3: ( rule__NewInstance__Group_3_3__0 )
                    {
                     before(grammarAccess.getNewInstanceAccess().getGroup_3_3()); 
                    // InternalDataflowDSL.g:1019:3: ( rule__NewInstance__Group_3_3__0 )
                    // InternalDataflowDSL.g:1019:4: rule__NewInstance__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNewInstanceAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__NewInstance__Alternatives_3"


    // $ANTLR start "rule__Filter__Alternatives_3"
    // InternalDataflowDSL.g:1027:1: rule__Filter__Alternatives_3 : ( ( ( rule__Filter__Group_3_0__0 ) ) | ( ( rule__Filter__Group_3_1__0 ) ) | ( ( rule__Filter__Group_3_2__0 ) ) );
    public final void rule__Filter__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1031:1: ( ( ( rule__Filter__Group_3_0__0 ) ) | ( ( rule__Filter__Group_3_1__0 ) ) | ( ( rule__Filter__Group_3_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDataflowDSL.g:1032:2: ( ( rule__Filter__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1032:2: ( ( rule__Filter__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1033:3: ( rule__Filter__Group_3_0__0 )
                    {
                     before(grammarAccess.getFilterAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1034:3: ( rule__Filter__Group_3_0__0 )
                    // InternalDataflowDSL.g:1034:4: rule__Filter__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1038:2: ( ( rule__Filter__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1038:2: ( ( rule__Filter__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1039:3: ( rule__Filter__Group_3_1__0 )
                    {
                     before(grammarAccess.getFilterAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1040:3: ( rule__Filter__Group_3_1__0 )
                    // InternalDataflowDSL.g:1040:4: rule__Filter__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1044:2: ( ( rule__Filter__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1044:2: ( ( rule__Filter__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1045:3: ( rule__Filter__Group_3_2__0 )
                    {
                     before(grammarAccess.getFilterAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1046:3: ( rule__Filter__Group_3_2__0 )
                    // InternalDataflowDSL.g:1046:4: rule__Filter__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Filter__Alternatives_3"


    // $ANTLR start "rule__Copy__Alternatives_3"
    // InternalDataflowDSL.g:1054:1: rule__Copy__Alternatives_3 : ( ( ( rule__Copy__Group_3_0__0 ) ) | ( ( rule__Copy__Group_3_1__0 ) ) );
    public final void rule__Copy__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1058:1: ( ( ( rule__Copy__Group_3_0__0 ) ) | ( ( rule__Copy__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            else if ( (LA5_0==45) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataflowDSL.g:1059:2: ( ( rule__Copy__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1059:2: ( ( rule__Copy__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1060:3: ( rule__Copy__Group_3_0__0 )
                    {
                     before(grammarAccess.getCopyAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1061:3: ( rule__Copy__Group_3_0__0 )
                    // InternalDataflowDSL.g:1061:4: rule__Copy__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Copy__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCopyAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1065:2: ( ( rule__Copy__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1065:2: ( ( rule__Copy__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1066:3: ( rule__Copy__Group_3_1__0 )
                    {
                     before(grammarAccess.getCopyAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1067:3: ( rule__Copy__Group_3_1__0 )
                    // InternalDataflowDSL.g:1067:4: rule__Copy__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Copy__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCopyAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Copy__Alternatives_3"


    // $ANTLR start "rule__Sort__Alternatives_3"
    // InternalDataflowDSL.g:1075:1: rule__Sort__Alternatives_3 : ( ( ( rule__Sort__Group_3_0__0 ) ) | ( ( rule__Sort__Group_3_1__0 ) ) );
    public final void rule__Sort__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1079:1: ( ( ( rule__Sort__Group_3_0__0 ) ) | ( ( rule__Sort__Group_3_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            else if ( (LA6_0==38) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataflowDSL.g:1080:2: ( ( rule__Sort__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1080:2: ( ( rule__Sort__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1081:3: ( rule__Sort__Group_3_0__0 )
                    {
                     before(grammarAccess.getSortAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1082:3: ( rule__Sort__Group_3_0__0 )
                    // InternalDataflowDSL.g:1082:4: rule__Sort__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sort__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSortAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1086:2: ( ( rule__Sort__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1086:2: ( ( rule__Sort__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1087:3: ( rule__Sort__Group_3_1__0 )
                    {
                     before(grammarAccess.getSortAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1088:3: ( rule__Sort__Group_3_1__0 )
                    // InternalDataflowDSL.g:1088:4: rule__Sort__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sort__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSortAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Sort__Alternatives_3"


    // $ANTLR start "rule__GetFeature__Alternatives_3"
    // InternalDataflowDSL.g:1096:1: rule__GetFeature__Alternatives_3 : ( ( ( rule__GetFeature__Group_3_0__0 ) ) | ( ( rule__GetFeature__Group_3_1__0 ) ) | ( ( rule__GetFeature__Group_3_2__0 ) ) | ( ( rule__GetFeature__Group_3_3__0 ) ) );
    public final void rule__GetFeature__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1100:1: ( ( ( rule__GetFeature__Group_3_0__0 ) ) | ( ( rule__GetFeature__Group_3_1__0 ) ) | ( ( rule__GetFeature__Group_3_2__0 ) ) | ( ( rule__GetFeature__Group_3_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt7=1;
                }
                break;
            case 51:
                {
                alt7=2;
                }
                break;
            case 52:
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
                    // InternalDataflowDSL.g:1101:2: ( ( rule__GetFeature__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1101:2: ( ( rule__GetFeature__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1102:3: ( rule__GetFeature__Group_3_0__0 )
                    {
                     before(grammarAccess.getGetFeatureAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1103:3: ( rule__GetFeature__Group_3_0__0 )
                    // InternalDataflowDSL.g:1103:4: rule__GetFeature__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetFeature__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetFeatureAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1107:2: ( ( rule__GetFeature__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1107:2: ( ( rule__GetFeature__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1108:3: ( rule__GetFeature__Group_3_1__0 )
                    {
                     before(grammarAccess.getGetFeatureAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1109:3: ( rule__GetFeature__Group_3_1__0 )
                    // InternalDataflowDSL.g:1109:4: rule__GetFeature__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetFeature__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetFeatureAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1113:2: ( ( rule__GetFeature__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1113:2: ( ( rule__GetFeature__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1114:3: ( rule__GetFeature__Group_3_2__0 )
                    {
                     before(grammarAccess.getGetFeatureAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1115:3: ( rule__GetFeature__Group_3_2__0 )
                    // InternalDataflowDSL.g:1115:4: rule__GetFeature__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetFeature__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetFeatureAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1119:2: ( ( rule__GetFeature__Group_3_3__0 ) )
                    {
                    // InternalDataflowDSL.g:1119:2: ( ( rule__GetFeature__Group_3_3__0 ) )
                    // InternalDataflowDSL.g:1120:3: ( rule__GetFeature__Group_3_3__0 )
                    {
                     before(grammarAccess.getGetFeatureAccess().getGroup_3_3()); 
                    // InternalDataflowDSL.g:1121:3: ( rule__GetFeature__Group_3_3__0 )
                    // InternalDataflowDSL.g:1121:4: rule__GetFeature__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetFeature__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetFeatureAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__GetFeature__Alternatives_3"


    // $ANTLR start "rule__SetFeature__Alternatives_3"
    // InternalDataflowDSL.g:1129:1: rule__SetFeature__Alternatives_3 : ( ( ( rule__SetFeature__Group_3_0__0 ) ) | ( ( rule__SetFeature__Group_3_1__0 ) ) | ( ( rule__SetFeature__Group_3_2__0 ) ) | ( ( rule__SetFeature__Group_3_3__0 ) ) );
    public final void rule__SetFeature__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1133:1: ( ( ( rule__SetFeature__Group_3_0__0 ) ) | ( ( rule__SetFeature__Group_3_1__0 ) ) | ( ( rule__SetFeature__Group_3_2__0 ) ) | ( ( rule__SetFeature__Group_3_3__0 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 54:
                {
                alt8=2;
                }
                break;
            case 52:
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
                    // InternalDataflowDSL.g:1134:2: ( ( rule__SetFeature__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1134:2: ( ( rule__SetFeature__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1135:3: ( rule__SetFeature__Group_3_0__0 )
                    {
                     before(grammarAccess.getSetFeatureAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1136:3: ( rule__SetFeature__Group_3_0__0 )
                    // InternalDataflowDSL.g:1136:4: rule__SetFeature__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetFeature__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetFeatureAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1140:2: ( ( rule__SetFeature__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1140:2: ( ( rule__SetFeature__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1141:3: ( rule__SetFeature__Group_3_1__0 )
                    {
                     before(grammarAccess.getSetFeatureAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1142:3: ( rule__SetFeature__Group_3_1__0 )
                    // InternalDataflowDSL.g:1142:4: rule__SetFeature__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetFeature__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetFeatureAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1146:2: ( ( rule__SetFeature__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1146:2: ( ( rule__SetFeature__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1147:3: ( rule__SetFeature__Group_3_2__0 )
                    {
                     before(grammarAccess.getSetFeatureAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1148:3: ( rule__SetFeature__Group_3_2__0 )
                    // InternalDataflowDSL.g:1148:4: rule__SetFeature__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetFeature__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetFeatureAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1152:2: ( ( rule__SetFeature__Group_3_3__0 ) )
                    {
                    // InternalDataflowDSL.g:1152:2: ( ( rule__SetFeature__Group_3_3__0 ) )
                    // InternalDataflowDSL.g:1153:3: ( rule__SetFeature__Group_3_3__0 )
                    {
                     before(grammarAccess.getSetFeatureAccess().getGroup_3_3()); 
                    // InternalDataflowDSL.g:1154:3: ( rule__SetFeature__Group_3_3__0 )
                    // InternalDataflowDSL.g:1154:4: rule__SetFeature__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetFeature__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetFeatureAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__SetFeature__Alternatives_3"


    // $ANTLR start "rule__AddToContainer__Alternatives_3"
    // InternalDataflowDSL.g:1162:1: rule__AddToContainer__Alternatives_3 : ( ( ( rule__AddToContainer__Group_3_0__0 ) ) | ( ( rule__AddToContainer__Group_3_1__0 ) ) | ( ( rule__AddToContainer__Group_3_2__0 ) ) | ( ( rule__AddToContainer__Group_3_3__0 ) ) );
    public final void rule__AddToContainer__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1166:1: ( ( ( rule__AddToContainer__Group_3_0__0 ) ) | ( ( rule__AddToContainer__Group_3_1__0 ) ) | ( ( rule__AddToContainer__Group_3_2__0 ) ) | ( ( rule__AddToContainer__Group_3_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 54:
                {
                alt9=2;
                }
                break;
            case 58:
                {
                alt9=3;
                }
                break;
            case 38:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDataflowDSL.g:1167:2: ( ( rule__AddToContainer__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1167:2: ( ( rule__AddToContainer__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1168:3: ( rule__AddToContainer__Group_3_0__0 )
                    {
                     before(grammarAccess.getAddToContainerAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1169:3: ( rule__AddToContainer__Group_3_0__0 )
                    // InternalDataflowDSL.g:1169:4: rule__AddToContainer__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToContainer__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToContainerAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1173:2: ( ( rule__AddToContainer__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1173:2: ( ( rule__AddToContainer__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1174:3: ( rule__AddToContainer__Group_3_1__0 )
                    {
                     before(grammarAccess.getAddToContainerAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1175:3: ( rule__AddToContainer__Group_3_1__0 )
                    // InternalDataflowDSL.g:1175:4: rule__AddToContainer__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToContainer__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToContainerAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1179:2: ( ( rule__AddToContainer__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1179:2: ( ( rule__AddToContainer__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1180:3: ( rule__AddToContainer__Group_3_2__0 )
                    {
                     before(grammarAccess.getAddToContainerAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1181:3: ( rule__AddToContainer__Group_3_2__0 )
                    // InternalDataflowDSL.g:1181:4: rule__AddToContainer__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToContainer__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToContainerAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1185:2: ( ( rule__AddToContainer__Group_3_3__0 ) )
                    {
                    // InternalDataflowDSL.g:1185:2: ( ( rule__AddToContainer__Group_3_3__0 ) )
                    // InternalDataflowDSL.g:1186:3: ( rule__AddToContainer__Group_3_3__0 )
                    {
                     before(grammarAccess.getAddToContainerAccess().getGroup_3_3()); 
                    // InternalDataflowDSL.g:1187:3: ( rule__AddToContainer__Group_3_3__0 )
                    // InternalDataflowDSL.g:1187:4: rule__AddToContainer__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddToContainer__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToContainerAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__AddToContainer__Alternatives_3"


    // $ANTLR start "rule__ForEach__Alternatives_3"
    // InternalDataflowDSL.g:1195:1: rule__ForEach__Alternatives_3 : ( ( ( rule__ForEach__Group_3_0__0 ) ) | ( ( rule__ForEach__Group_3_1__0 ) ) | ( ( rule__ForEach__Group_3_2__0 ) ) | ( ( rule__ForEach__Group_3_3__0 ) ) );
    public final void rule__ForEach__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1199:1: ( ( ( rule__ForEach__Group_3_0__0 ) ) | ( ( rule__ForEach__Group_3_1__0 ) ) | ( ( rule__ForEach__Group_3_2__0 ) ) | ( ( rule__ForEach__Group_3_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt10=1;
                }
                break;
            case 61:
                {
                alt10=2;
                }
                break;
            case 62:
                {
                alt10=3;
                }
                break;
            case 38:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDataflowDSL.g:1200:2: ( ( rule__ForEach__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1200:2: ( ( rule__ForEach__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1201:3: ( rule__ForEach__Group_3_0__0 )
                    {
                     before(grammarAccess.getForEachAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1202:3: ( rule__ForEach__Group_3_0__0 )
                    // InternalDataflowDSL.g:1202:4: rule__ForEach__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEach__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForEachAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1206:2: ( ( rule__ForEach__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1206:2: ( ( rule__ForEach__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1207:3: ( rule__ForEach__Group_3_1__0 )
                    {
                     before(grammarAccess.getForEachAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1208:3: ( rule__ForEach__Group_3_1__0 )
                    // InternalDataflowDSL.g:1208:4: rule__ForEach__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEach__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForEachAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1212:2: ( ( rule__ForEach__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1212:2: ( ( rule__ForEach__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1213:3: ( rule__ForEach__Group_3_2__0 )
                    {
                     before(grammarAccess.getForEachAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1214:3: ( rule__ForEach__Group_3_2__0 )
                    // InternalDataflowDSL.g:1214:4: rule__ForEach__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEach__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForEachAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1218:2: ( ( rule__ForEach__Group_3_3__0 ) )
                    {
                    // InternalDataflowDSL.g:1218:2: ( ( rule__ForEach__Group_3_3__0 ) )
                    // InternalDataflowDSL.g:1219:3: ( rule__ForEach__Group_3_3__0 )
                    {
                     before(grammarAccess.getForEachAccess().getGroup_3_3()); 
                    // InternalDataflowDSL.g:1220:3: ( rule__ForEach__Group_3_3__0 )
                    // InternalDataflowDSL.g:1220:4: rule__ForEach__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEach__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForEachAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__ForEach__Alternatives_3"


    // $ANTLR start "rule__CollectBy__Alternatives_3"
    // InternalDataflowDSL.g:1228:1: rule__CollectBy__Alternatives_3 : ( ( ( rule__CollectBy__Group_3_0__0 ) ) | ( ( rule__CollectBy__Group_3_1__0 ) ) );
    public final void rule__CollectBy__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1232:1: ( ( ( rule__CollectBy__Group_3_0__0 ) ) | ( ( rule__CollectBy__Group_3_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==64) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataflowDSL.g:1233:2: ( ( rule__CollectBy__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1233:2: ( ( rule__CollectBy__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1234:3: ( rule__CollectBy__Group_3_0__0 )
                    {
                     before(grammarAccess.getCollectByAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1235:3: ( rule__CollectBy__Group_3_0__0 )
                    // InternalDataflowDSL.g:1235:4: rule__CollectBy__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectBy__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectByAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1239:2: ( ( rule__CollectBy__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1239:2: ( ( rule__CollectBy__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1240:3: ( rule__CollectBy__Group_3_1__0 )
                    {
                     before(grammarAccess.getCollectByAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1241:3: ( rule__CollectBy__Group_3_1__0 )
                    // InternalDataflowDSL.g:1241:4: rule__CollectBy__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectBy__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectByAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__CollectBy__Alternatives_3"


    // $ANTLR start "rule__Evaluate__Alternatives_3"
    // InternalDataflowDSL.g:1249:1: rule__Evaluate__Alternatives_3 : ( ( ( rule__Evaluate__Group_3_0__0 ) ) | ( ( rule__Evaluate__Group_3_1__0 ) ) | ( ( rule__Evaluate__Group_3_2__0 ) ) );
    public final void rule__Evaluate__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1253:1: ( ( ( rule__Evaluate__Group_3_0__0 ) ) | ( ( rule__Evaluate__Group_3_1__0 ) ) | ( ( rule__Evaluate__Group_3_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 66:
                {
                alt12=2;
                }
                break;
            case 38:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDataflowDSL.g:1254:2: ( ( rule__Evaluate__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1254:2: ( ( rule__Evaluate__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1255:3: ( rule__Evaluate__Group_3_0__0 )
                    {
                     before(grammarAccess.getEvaluateAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1256:3: ( rule__Evaluate__Group_3_0__0 )
                    // InternalDataflowDSL.g:1256:4: rule__Evaluate__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluate__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvaluateAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1260:2: ( ( rule__Evaluate__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1260:2: ( ( rule__Evaluate__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1261:3: ( rule__Evaluate__Group_3_1__0 )
                    {
                     before(grammarAccess.getEvaluateAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1262:3: ( rule__Evaluate__Group_3_1__0 )
                    // InternalDataflowDSL.g:1262:4: rule__Evaluate__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluate__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvaluateAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1266:2: ( ( rule__Evaluate__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1266:2: ( ( rule__Evaluate__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1267:3: ( rule__Evaluate__Group_3_2__0 )
                    {
                     before(grammarAccess.getEvaluateAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1268:3: ( rule__Evaluate__Group_3_2__0 )
                    // InternalDataflowDSL.g:1268:4: rule__Evaluate__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluate__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEvaluateAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Evaluate__Alternatives_3"


    // $ANTLR start "rule__ConditionalExpression__Alternatives"
    // InternalDataflowDSL.g:1276:1: rule__ConditionalExpression__Alternatives : ( ( ( rule__ConditionalExpression__Group_0__0 ) ) | ( ruleOrExpression ) );
    public final void rule__ConditionalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1280:1: ( ( ( rule__ConditionalExpression__Group_0__0 ) ) | ( ruleOrExpression ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==67) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)||(LA13_0>=13 && LA13_0<=14)||LA13_0==26||LA13_0==30||(LA13_0>=70 && LA13_0<=71)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataflowDSL.g:1281:2: ( ( rule__ConditionalExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1281:2: ( ( rule__ConditionalExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:1282:3: ( rule__ConditionalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getConditionalExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:1283:3: ( rule__ConditionalExpression__Group_0__0 )
                    // InternalDataflowDSL.g:1283:4: rule__ConditionalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1287:2: ( ruleOrExpression )
                    {
                    // InternalDataflowDSL.g:1287:2: ( ruleOrExpression )
                    // InternalDataflowDSL.g:1288:3: ruleOrExpression
                    {
                     before(grammarAccess.getConditionalExpressionAccess().getOrExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrExpression();

                    state._fsp--;

                     after(grammarAccess.getConditionalExpressionAccess().getOrExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__ConditionalExpression__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalDataflowDSL.g:1297:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleFeatureCallExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1301:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleFeatureCallExpression ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26||LA14_0==30) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_STRING)||(LA14_0>=13 && LA14_0<=14)||(LA14_0>=70 && LA14_0<=71)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataflowDSL.g:1302:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1302:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:1303:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:1304:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalDataflowDSL.g:1304:4: rule__UnaryExpression__Group_0__0
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
                    // InternalDataflowDSL.g:1308:2: ( ruleFeatureCallExpression )
                    {
                    // InternalDataflowDSL.g:1308:2: ( ruleFeatureCallExpression )
                    // InternalDataflowDSL.g:1309:3: ruleFeatureCallExpression
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
    // InternalDataflowDSL.g:1318:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1322:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1>=11 && LA15_1<=12)||(LA15_1>=19 && LA15_1<=29)||(LA15_1>=33 && LA15_1<=35)||LA15_1==38||LA15_1==40||(LA15_1>=42 && LA15_1<=43)||LA15_1==47||LA15_1==52||LA15_1==54||LA15_1==58||LA15_1==64||LA15_1==66||(LA15_1>=68 && LA15_1<=69)||(LA15_1>=72 && LA15_1<=73)) ) {
                    alt15=1;
                }
                else if ( (LA15_1==70) ) {
                    int LA15_8 = input.LA(3);

                    if ( (LA15_8==RULE_ID) ) {
                        alt15=1;
                    }
                    else if ( (LA15_8==RULE_INT) ) {
                        alt15=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 8, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
            case 14:
                {
                alt15=2;
                }
                break;
            case 70:
                {
                alt15=3;
                }
                break;
            case RULE_STRING:
                {
                alt15=4;
                }
                break;
            case RULE_ID:
                {
                alt15=5;
                }
                break;
            case 71:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDataflowDSL.g:1323:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1323:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:1324:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:1325:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalDataflowDSL.g:1325:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalDataflowDSL.g:1329:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1329:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalDataflowDSL.g:1330:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalDataflowDSL.g:1331:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalDataflowDSL.g:1331:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalDataflowDSL.g:1335:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1335:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalDataflowDSL.g:1336:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalDataflowDSL.g:1337:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalDataflowDSL.g:1337:4: rule__PrimaryExpression__Group_2__0
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
                    // InternalDataflowDSL.g:1341:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalDataflowDSL.g:1341:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalDataflowDSL.g:1342:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalDataflowDSL.g:1343:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalDataflowDSL.g:1343:4: rule__PrimaryExpression__Group_3__0
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
                    // InternalDataflowDSL.g:1347:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalDataflowDSL.g:1347:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalDataflowDSL.g:1348:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalDataflowDSL.g:1349:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalDataflowDSL.g:1349:4: rule__PrimaryExpression__Group_4__0
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
                    // InternalDataflowDSL.g:1353:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // InternalDataflowDSL.g:1353:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // InternalDataflowDSL.g:1354:3: ( rule__PrimaryExpression__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    // InternalDataflowDSL.g:1355:3: ( rule__PrimaryExpression__Group_5__0 )
                    // InternalDataflowDSL.g:1355:4: rule__PrimaryExpression__Group_5__0
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
    // InternalDataflowDSL.g:1363:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1367:1: ( ( 'true' ) | ( 'false' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            else if ( (LA16_0==14) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataflowDSL.g:1368:2: ( 'true' )
                    {
                    // InternalDataflowDSL.g:1368:2: ( 'true' )
                    // InternalDataflowDSL.g:1369:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1374:2: ( 'false' )
                    {
                    // InternalDataflowDSL.g:1374:2: ( 'false' )
                    // InternalDataflowDSL.g:1375:3: 'false'
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
    // InternalDataflowDSL.g:1384:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1388:1: ( ( 'E' ) | ( 'e' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            else if ( (LA17_0==16) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataflowDSL.g:1389:2: ( 'E' )
                    {
                    // InternalDataflowDSL.g:1389:2: ( 'E' )
                    // InternalDataflowDSL.g:1390:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1395:2: ( 'e' )
                    {
                    // InternalDataflowDSL.g:1395:2: ( 'e' )
                    // InternalDataflowDSL.g:1396:3: 'e'
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
    // InternalDataflowDSL.g:1405:1: rule__ContainerType__Alternatives : ( ( ( 'list' ) ) | ( ( 'set' ) ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1409:1: ( ( ( 'list' ) ) | ( ( 'set' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataflowDSL.g:1410:2: ( ( 'list' ) )
                    {
                    // InternalDataflowDSL.g:1410:2: ( ( 'list' ) )
                    // InternalDataflowDSL.g:1411:3: ( 'list' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1412:3: ( 'list' )
                    // InternalDataflowDSL.g:1412:4: 'list'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1416:2: ( ( 'set' ) )
                    {
                    // InternalDataflowDSL.g:1416:2: ( ( 'set' ) )
                    // InternalDataflowDSL.g:1417:3: ( 'set' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1418:3: ( 'set' )
                    // InternalDataflowDSL.g:1418:4: 'set'
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
    // InternalDataflowDSL.g:1426:1: rule__EqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1430:1: ( ( ( '=' ) ) | ( ( '!=' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            else if ( (LA19_0==20) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataflowDSL.g:1431:2: ( ( '=' ) )
                    {
                    // InternalDataflowDSL.g:1431:2: ( ( '=' ) )
                    // InternalDataflowDSL.g:1432:3: ( '=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1433:3: ( '=' )
                    // InternalDataflowDSL.g:1433:4: '='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1437:2: ( ( '!=' ) )
                    {
                    // InternalDataflowDSL.g:1437:2: ( ( '!=' ) )
                    // InternalDataflowDSL.g:1438:3: ( '!=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1439:3: ( '!=' )
                    // InternalDataflowDSL.g:1439:4: '!='
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
    // InternalDataflowDSL.g:1447:1: rule__RelationalOperator__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1451:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt20=1;
                }
                break;
            case 22:
                {
                alt20=2;
                }
                break;
            case 23:
                {
                alt20=3;
                }
                break;
            case 24:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDataflowDSL.g:1452:2: ( ( '>' ) )
                    {
                    // InternalDataflowDSL.g:1452:2: ( ( '>' ) )
                    // InternalDataflowDSL.g:1453:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1454:3: ( '>' )
                    // InternalDataflowDSL.g:1454:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1458:2: ( ( '>=' ) )
                    {
                    // InternalDataflowDSL.g:1458:2: ( ( '>=' ) )
                    // InternalDataflowDSL.g:1459:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1460:3: ( '>=' )
                    // InternalDataflowDSL.g:1460:4: '>='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1464:2: ( ( '<' ) )
                    {
                    // InternalDataflowDSL.g:1464:2: ( ( '<' ) )
                    // InternalDataflowDSL.g:1465:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:1466:3: ( '<' )
                    // InternalDataflowDSL.g:1466:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1470:2: ( ( '<=' ) )
                    {
                    // InternalDataflowDSL.g:1470:2: ( ( '<=' ) )
                    // InternalDataflowDSL.g:1471:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3()); 
                    // InternalDataflowDSL.g:1472:3: ( '<=' )
                    // InternalDataflowDSL.g:1472:4: '<='
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
    // InternalDataflowDSL.g:1480:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1484:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataflowDSL.g:1485:2: ( ( '+' ) )
                    {
                    // InternalDataflowDSL.g:1485:2: ( ( '+' ) )
                    // InternalDataflowDSL.g:1486:3: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1487:3: ( '+' )
                    // InternalDataflowDSL.g:1487:4: '+'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1491:2: ( ( '-' ) )
                    {
                    // InternalDataflowDSL.g:1491:2: ( ( '-' ) )
                    // InternalDataflowDSL.g:1492:3: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1493:3: ( '-' )
                    // InternalDataflowDSL.g:1493:4: '-'
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
    // InternalDataflowDSL.g:1501:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1505:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt22=1;
                }
                break;
            case 28:
                {
                alt22=2;
                }
                break;
            case 29:
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
                    // InternalDataflowDSL.g:1506:2: ( ( '*' ) )
                    {
                    // InternalDataflowDSL.g:1506:2: ( ( '*' ) )
                    // InternalDataflowDSL.g:1507:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1508:3: ( '*' )
                    // InternalDataflowDSL.g:1508:4: '*'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1512:2: ( ( '/' ) )
                    {
                    // InternalDataflowDSL.g:1512:2: ( ( '/' ) )
                    // InternalDataflowDSL.g:1513:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1514:3: ( '/' )
                    // InternalDataflowDSL.g:1514:4: '/'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1518:2: ( ( '%' ) )
                    {
                    // InternalDataflowDSL.g:1518:2: ( ( '%' ) )
                    // InternalDataflowDSL.g:1519:3: ( '%' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:1520:3: ( '%' )
                    // InternalDataflowDSL.g:1520:4: '%'
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
    // InternalDataflowDSL.g:1528:1: rule__UnaryOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1532:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            else if ( (LA23_0==26) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataflowDSL.g:1533:2: ( ( 'not' ) )
                    {
                    // InternalDataflowDSL.g:1533:2: ( ( 'not' ) )
                    // InternalDataflowDSL.g:1534:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1535:3: ( 'not' )
                    // InternalDataflowDSL.g:1535:4: 'not'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1539:2: ( ( '-' ) )
                    {
                    // InternalDataflowDSL.g:1539:2: ( ( '-' ) )
                    // InternalDataflowDSL.g:1540:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1541:3: ( '-' )
                    // InternalDataflowDSL.g:1541:4: '-'
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
    // InternalDataflowDSL.g:1549:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1553:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDataflowDSL.g:1554:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDataflowDSL.g:1561:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1565:1: ( ( () ) )
            // InternalDataflowDSL.g:1566:1: ( () )
            {
            // InternalDataflowDSL.g:1566:1: ( () )
            // InternalDataflowDSL.g:1567:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalDataflowDSL.g:1568:2: ()
            // InternalDataflowDSL.g:1568:3: 
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
    // InternalDataflowDSL.g:1576:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1580:1: ( rule__Model__Group__1__Impl )
            // InternalDataflowDSL.g:1581:2: rule__Model__Group__1__Impl
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
    // InternalDataflowDSL.g:1587:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1591:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDataflowDSL.g:1592:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDataflowDSL.g:1592:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDataflowDSL.g:1593:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDataflowDSL.g:1594:2: ( rule__Model__ElementsAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31||LA24_0==39||LA24_0==41||LA24_0==44||LA24_0==46||(LA24_0>=48 && LA24_0<=49)||LA24_0==53||LA24_0==55||LA24_0==57||LA24_0==59||LA24_0==63||LA24_0==65) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDataflowDSL.g:1594:3: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalDataflowDSL.g:1603:1: rule__AllInstances__Group__0 : rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 ;
    public final void rule__AllInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1607:1: ( rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 )
            // InternalDataflowDSL.g:1608:2: rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1
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
    // InternalDataflowDSL.g:1615:1: rule__AllInstances__Group__0__Impl : ( 'AllInstances' ) ;
    public final void rule__AllInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1619:1: ( ( 'AllInstances' ) )
            // InternalDataflowDSL.g:1620:1: ( 'AllInstances' )
            {
            // InternalDataflowDSL.g:1620:1: ( 'AllInstances' )
            // InternalDataflowDSL.g:1621:2: 'AllInstances'
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
    // InternalDataflowDSL.g:1630:1: rule__AllInstances__Group__1 : rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2 ;
    public final void rule__AllInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1634:1: ( rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2 )
            // InternalDataflowDSL.g:1635:2: rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2
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
    // InternalDataflowDSL.g:1642:1: rule__AllInstances__Group__1__Impl : ( ( rule__AllInstances__NameAssignment_1 ) ) ;
    public final void rule__AllInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1646:1: ( ( ( rule__AllInstances__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:1647:1: ( ( rule__AllInstances__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:1647:1: ( ( rule__AllInstances__NameAssignment_1 ) )
            // InternalDataflowDSL.g:1648:2: ( rule__AllInstances__NameAssignment_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:1649:2: ( rule__AllInstances__NameAssignment_1 )
            // InternalDataflowDSL.g:1649:3: rule__AllInstances__NameAssignment_1
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
    // InternalDataflowDSL.g:1657:1: rule__AllInstances__Group__2 : rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3 ;
    public final void rule__AllInstances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1661:1: ( rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3 )
            // InternalDataflowDSL.g:1662:2: rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3
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
    // InternalDataflowDSL.g:1669:1: rule__AllInstances__Group__2__Impl : ( '{' ) ;
    public final void rule__AllInstances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1673:1: ( ( '{' ) )
            // InternalDataflowDSL.g:1674:1: ( '{' )
            {
            // InternalDataflowDSL.g:1674:1: ( '{' )
            // InternalDataflowDSL.g:1675:2: '{'
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
    // InternalDataflowDSL.g:1684:1: rule__AllInstances__Group__3 : rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4 ;
    public final void rule__AllInstances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1688:1: ( rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4 )
            // InternalDataflowDSL.g:1689:2: rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4
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
    // InternalDataflowDSL.g:1696:1: rule__AllInstances__Group__3__Impl : ( ( rule__AllInstances__Alternatives_3 )* ) ;
    public final void rule__AllInstances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1700:1: ( ( ( rule__AllInstances__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:1701:1: ( ( rule__AllInstances__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:1701:1: ( ( rule__AllInstances__Alternatives_3 )* )
            // InternalDataflowDSL.g:1702:2: ( rule__AllInstances__Alternatives_3 )*
            {
             before(grammarAccess.getAllInstancesAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:1703:2: ( rule__AllInstances__Alternatives_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=34 && LA25_0<=35)||LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDataflowDSL.g:1703:3: rule__AllInstances__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AllInstances__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAllInstancesAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:1711:1: rule__AllInstances__Group__4 : rule__AllInstances__Group__4__Impl ;
    public final void rule__AllInstances__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1715:1: ( rule__AllInstances__Group__4__Impl )
            // InternalDataflowDSL.g:1716:2: rule__AllInstances__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:1722:1: rule__AllInstances__Group__4__Impl : ( '}' ) ;
    public final void rule__AllInstances__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1726:1: ( ( '}' ) )
            // InternalDataflowDSL.g:1727:1: ( '}' )
            {
            // InternalDataflowDSL.g:1727:1: ( '}' )
            // InternalDataflowDSL.g:1728:2: '}'
            {
             before(grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__AllInstances__Group_3_0__0"
    // InternalDataflowDSL.g:1738:1: rule__AllInstances__Group_3_0__0 : rule__AllInstances__Group_3_0__0__Impl rule__AllInstances__Group_3_0__1 ;
    public final void rule__AllInstances__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1742:1: ( rule__AllInstances__Group_3_0__0__Impl rule__AllInstances__Group_3_0__1 )
            // InternalDataflowDSL.g:1743:2: rule__AllInstances__Group_3_0__0__Impl rule__AllInstances__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_0__0"


    // $ANTLR start "rule__AllInstances__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:1750:1: rule__AllInstances__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__AllInstances__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1754:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:1755:1: ( 'field' )
            {
            // InternalDataflowDSL.g:1755:1: ( 'field' )
            // InternalDataflowDSL.g:1756:2: 'field'
            {
             before(grammarAccess.getAllInstancesAccess().getFieldKeyword_3_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getFieldKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_0__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_0__1"
    // InternalDataflowDSL.g:1765:1: rule__AllInstances__Group_3_0__1 : rule__AllInstances__Group_3_0__1__Impl ;
    public final void rule__AllInstances__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1769:1: ( rule__AllInstances__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:1770:2: rule__AllInstances__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_0__1"


    // $ANTLR start "rule__AllInstances__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:1776:1: rule__AllInstances__Group_3_0__1__Impl : ( ( rule__AllInstances__FieldAssignment_3_0_1 ) ) ;
    public final void rule__AllInstances__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1780:1: ( ( ( rule__AllInstances__FieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:1781:1: ( ( rule__AllInstances__FieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:1781:1: ( ( rule__AllInstances__FieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:1782:2: ( rule__AllInstances__FieldAssignment_3_0_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:1783:2: ( rule__AllInstances__FieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:1783:3: rule__AllInstances__FieldAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__FieldAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getFieldAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_0__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_1__0"
    // InternalDataflowDSL.g:1792:1: rule__AllInstances__Group_3_1__0 : rule__AllInstances__Group_3_1__0__Impl rule__AllInstances__Group_3_1__1 ;
    public final void rule__AllInstances__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1796:1: ( rule__AllInstances__Group_3_1__0__Impl rule__AllInstances__Group_3_1__1 )
            // InternalDataflowDSL.g:1797:2: rule__AllInstances__Group_3_1__0__Impl rule__AllInstances__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1__0"


    // $ANTLR start "rule__AllInstances__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:1804:1: rule__AllInstances__Group_3_1__0__Impl : ( 'type' ) ;
    public final void rule__AllInstances__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1808:1: ( ( 'type' ) )
            // InternalDataflowDSL.g:1809:1: ( 'type' )
            {
            // InternalDataflowDSL.g:1809:1: ( 'type' )
            // InternalDataflowDSL.g:1810:2: 'type'
            {
             before(grammarAccess.getAllInstancesAccess().getTypeKeyword_3_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTypeKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_1__1"
    // InternalDataflowDSL.g:1819:1: rule__AllInstances__Group_3_1__1 : rule__AllInstances__Group_3_1__1__Impl rule__AllInstances__Group_3_1__2 ;
    public final void rule__AllInstances__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1823:1: ( rule__AllInstances__Group_3_1__1__Impl rule__AllInstances__Group_3_1__2 )
            // InternalDataflowDSL.g:1824:2: rule__AllInstances__Group_3_1__1__Impl rule__AllInstances__Group_3_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1__1"


    // $ANTLR start "rule__AllInstances__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:1831:1: rule__AllInstances__Group_3_1__1__Impl : ( ( rule__AllInstances__Group_3_1_1__0 )? ) ;
    public final void rule__AllInstances__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1835:1: ( ( ( rule__AllInstances__Group_3_1_1__0 )? ) )
            // InternalDataflowDSL.g:1836:1: ( ( rule__AllInstances__Group_3_1_1__0 )? )
            {
            // InternalDataflowDSL.g:1836:1: ( ( rule__AllInstances__Group_3_1_1__0 )? )
            // InternalDataflowDSL.g:1837:2: ( rule__AllInstances__Group_3_1_1__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_3_1_1()); 
            // InternalDataflowDSL.g:1838:2: ( rule__AllInstances__Group_3_1_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==36) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalDataflowDSL.g:1838:3: rule__AllInstances__Group_3_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_3_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllInstancesAccess().getGroup_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_1__2"
    // InternalDataflowDSL.g:1846:1: rule__AllInstances__Group_3_1__2 : rule__AllInstances__Group_3_1__2__Impl rule__AllInstances__Group_3_1__3 ;
    public final void rule__AllInstances__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1850:1: ( rule__AllInstances__Group_3_1__2__Impl rule__AllInstances__Group_3_1__3 )
            // InternalDataflowDSL.g:1851:2: rule__AllInstances__Group_3_1__2__Impl rule__AllInstances__Group_3_1__3
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1__2"


    // $ANTLR start "rule__AllInstances__Group_3_1__2__Impl"
    // InternalDataflowDSL.g:1858:1: rule__AllInstances__Group_3_1__2__Impl : ( ( rule__AllInstances__Group_3_1_2__0 )? ) ;
    public final void rule__AllInstances__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1862:1: ( ( ( rule__AllInstances__Group_3_1_2__0 )? ) )
            // InternalDataflowDSL.g:1863:1: ( ( rule__AllInstances__Group_3_1_2__0 )? )
            {
            // InternalDataflowDSL.g:1863:1: ( ( rule__AllInstances__Group_3_1_2__0 )? )
            // InternalDataflowDSL.g:1864:2: ( rule__AllInstances__Group_3_1_2__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_3_1_2()); 
            // InternalDataflowDSL.g:1865:2: ( rule__AllInstances__Group_3_1_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==37) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalDataflowDSL.g:1865:3: rule__AllInstances__Group_3_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllInstances__Group_3_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllInstancesAccess().getGroup_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1__2__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_1__3"
    // InternalDataflowDSL.g:1873:1: rule__AllInstances__Group_3_1__3 : rule__AllInstances__Group_3_1__3__Impl ;
    public final void rule__AllInstances__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1877:1: ( rule__AllInstances__Group_3_1__3__Impl )
            // InternalDataflowDSL.g:1878:2: rule__AllInstances__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1__3"


    // $ANTLR start "rule__AllInstances__Group_3_1__3__Impl"
    // InternalDataflowDSL.g:1884:1: rule__AllInstances__Group_3_1__3__Impl : ( ( rule__AllInstances__TypeNameAssignment_3_1_3 ) ) ;
    public final void rule__AllInstances__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1888:1: ( ( ( rule__AllInstances__TypeNameAssignment_3_1_3 ) ) )
            // InternalDataflowDSL.g:1889:1: ( ( rule__AllInstances__TypeNameAssignment_3_1_3 ) )
            {
            // InternalDataflowDSL.g:1889:1: ( ( rule__AllInstances__TypeNameAssignment_3_1_3 ) )
            // InternalDataflowDSL.g:1890:2: ( rule__AllInstances__TypeNameAssignment_3_1_3 )
            {
             before(grammarAccess.getAllInstancesAccess().getTypeNameAssignment_3_1_3()); 
            // InternalDataflowDSL.g:1891:2: ( rule__AllInstances__TypeNameAssignment_3_1_3 )
            // InternalDataflowDSL.g:1891:3: rule__AllInstances__TypeNameAssignment_3_1_3
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__TypeNameAssignment_3_1_3();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getTypeNameAssignment_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1__3__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_1_1__0"
    // InternalDataflowDSL.g:1900:1: rule__AllInstances__Group_3_1_1__0 : rule__AllInstances__Group_3_1_1__0__Impl rule__AllInstances__Group_3_1_1__1 ;
    public final void rule__AllInstances__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1904:1: ( rule__AllInstances__Group_3_1_1__0__Impl rule__AllInstances__Group_3_1_1__1 )
            // InternalDataflowDSL.g:1905:2: rule__AllInstances__Group_3_1_1__0__Impl rule__AllInstances__Group_3_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__AllInstances__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1_1__0"


    // $ANTLR start "rule__AllInstances__Group_3_1_1__0__Impl"
    // InternalDataflowDSL.g:1912:1: rule__AllInstances__Group_3_1_1__0__Impl : ( ( rule__AllInstances__ModelAssignment_3_1_1_0 ) ) ;
    public final void rule__AllInstances__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1916:1: ( ( ( rule__AllInstances__ModelAssignment_3_1_1_0 ) ) )
            // InternalDataflowDSL.g:1917:1: ( ( rule__AllInstances__ModelAssignment_3_1_1_0 ) )
            {
            // InternalDataflowDSL.g:1917:1: ( ( rule__AllInstances__ModelAssignment_3_1_1_0 ) )
            // InternalDataflowDSL.g:1918:2: ( rule__AllInstances__ModelAssignment_3_1_1_0 )
            {
             before(grammarAccess.getAllInstancesAccess().getModelAssignment_3_1_1_0()); 
            // InternalDataflowDSL.g:1919:2: ( rule__AllInstances__ModelAssignment_3_1_1_0 )
            // InternalDataflowDSL.g:1919:3: rule__AllInstances__ModelAssignment_3_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__ModelAssignment_3_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getModelAssignment_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_1_1__1"
    // InternalDataflowDSL.g:1927:1: rule__AllInstances__Group_3_1_1__1 : rule__AllInstances__Group_3_1_1__1__Impl ;
    public final void rule__AllInstances__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1931:1: ( rule__AllInstances__Group_3_1_1__1__Impl )
            // InternalDataflowDSL.g:1932:2: rule__AllInstances__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1_1__1"


    // $ANTLR start "rule__AllInstances__Group_3_1_1__1__Impl"
    // InternalDataflowDSL.g:1938:1: rule__AllInstances__Group_3_1_1__1__Impl : ( '!' ) ;
    public final void rule__AllInstances__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1942:1: ( ( '!' ) )
            // InternalDataflowDSL.g:1943:1: ( '!' )
            {
            // InternalDataflowDSL.g:1943:1: ( '!' )
            // InternalDataflowDSL.g:1944:2: '!'
            {
             before(grammarAccess.getAllInstancesAccess().getExclamationMarkKeyword_3_1_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getExclamationMarkKeyword_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_1_2__0"
    // InternalDataflowDSL.g:1954:1: rule__AllInstances__Group_3_1_2__0 : rule__AllInstances__Group_3_1_2__0__Impl rule__AllInstances__Group_3_1_2__1 ;
    public final void rule__AllInstances__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1958:1: ( rule__AllInstances__Group_3_1_2__0__Impl rule__AllInstances__Group_3_1_2__1 )
            // InternalDataflowDSL.g:1959:2: rule__AllInstances__Group_3_1_2__0__Impl rule__AllInstances__Group_3_1_2__1
            {
            pushFollow(FOLLOW_10);
            rule__AllInstances__Group_3_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1_2__0"


    // $ANTLR start "rule__AllInstances__Group_3_1_2__0__Impl"
    // InternalDataflowDSL.g:1966:1: rule__AllInstances__Group_3_1_2__0__Impl : ( ( rule__AllInstances__PackageNameAssignment_3_1_2_0 ) ) ;
    public final void rule__AllInstances__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1970:1: ( ( ( rule__AllInstances__PackageNameAssignment_3_1_2_0 ) ) )
            // InternalDataflowDSL.g:1971:1: ( ( rule__AllInstances__PackageNameAssignment_3_1_2_0 ) )
            {
            // InternalDataflowDSL.g:1971:1: ( ( rule__AllInstances__PackageNameAssignment_3_1_2_0 ) )
            // InternalDataflowDSL.g:1972:2: ( rule__AllInstances__PackageNameAssignment_3_1_2_0 )
            {
             before(grammarAccess.getAllInstancesAccess().getPackageNameAssignment_3_1_2_0()); 
            // InternalDataflowDSL.g:1973:2: ( rule__AllInstances__PackageNameAssignment_3_1_2_0 )
            // InternalDataflowDSL.g:1973:3: rule__AllInstances__PackageNameAssignment_3_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__PackageNameAssignment_3_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getPackageNameAssignment_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_1_2__1"
    // InternalDataflowDSL.g:1981:1: rule__AllInstances__Group_3_1_2__1 : rule__AllInstances__Group_3_1_2__1__Impl ;
    public final void rule__AllInstances__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1985:1: ( rule__AllInstances__Group_3_1_2__1__Impl )
            // InternalDataflowDSL.g:1986:2: rule__AllInstances__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1_2__1"


    // $ANTLR start "rule__AllInstances__Group_3_1_2__1__Impl"
    // InternalDataflowDSL.g:1992:1: rule__AllInstances__Group_3_1_2__1__Impl : ( '::' ) ;
    public final void rule__AllInstances__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1996:1: ( ( '::' ) )
            // InternalDataflowDSL.g:1997:1: ( '::' )
            {
            // InternalDataflowDSL.g:1997:1: ( '::' )
            // InternalDataflowDSL.g:1998:2: '::'
            {
             before(grammarAccess.getAllInstancesAccess().getColonColonKeyword_3_1_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getColonColonKeyword_3_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_2__0"
    // InternalDataflowDSL.g:2008:1: rule__AllInstances__Group_3_2__0 : rule__AllInstances__Group_3_2__0__Impl rule__AllInstances__Group_3_2__1 ;
    public final void rule__AllInstances__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2012:1: ( rule__AllInstances__Group_3_2__0__Impl rule__AllInstances__Group_3_2__1 )
            // InternalDataflowDSL.g:2013:2: rule__AllInstances__Group_3_2__0__Impl rule__AllInstances__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__AllInstances__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_2__0"


    // $ANTLR start "rule__AllInstances__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:2020:1: rule__AllInstances__Group_3_2__0__Impl : ( 'target' ) ;
    public final void rule__AllInstances__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2024:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2025:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2025:1: ( 'target' )
            // InternalDataflowDSL.g:2026:2: 'target'
            {
             before(grammarAccess.getAllInstancesAccess().getTargetKeyword_3_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTargetKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_2__0__Impl"


    // $ANTLR start "rule__AllInstances__Group_3_2__1"
    // InternalDataflowDSL.g:2035:1: rule__AllInstances__Group_3_2__1 : rule__AllInstances__Group_3_2__1__Impl ;
    public final void rule__AllInstances__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2039:1: ( rule__AllInstances__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:2040:2: rule__AllInstances__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_2__1"


    // $ANTLR start "rule__AllInstances__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:2046:1: rule__AllInstances__Group_3_2__1__Impl : ( ( rule__AllInstances__TargetAssignment_3_2_1 ) ) ;
    public final void rule__AllInstances__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2050:1: ( ( ( rule__AllInstances__TargetAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:2051:1: ( ( rule__AllInstances__TargetAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:2051:1: ( ( rule__AllInstances__TargetAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:2052:2: ( rule__AllInstances__TargetAssignment_3_2_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getTargetAssignment_3_2_1()); 
            // InternalDataflowDSL.g:2053:2: ( rule__AllInstances__TargetAssignment_3_2_1 )
            // InternalDataflowDSL.g:2053:3: rule__AllInstances__TargetAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__TargetAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getTargetAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__Group_3_2__1__Impl"


    // $ANTLR start "rule__NewInstance__Group__0"
    // InternalDataflowDSL.g:2062:1: rule__NewInstance__Group__0 : rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1 ;
    public final void rule__NewInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2066:1: ( rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1 )
            // InternalDataflowDSL.g:2067:2: rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1
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
    // InternalDataflowDSL.g:2074:1: rule__NewInstance__Group__0__Impl : ( 'NewInstance' ) ;
    public final void rule__NewInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2078:1: ( ( 'NewInstance' ) )
            // InternalDataflowDSL.g:2079:1: ( 'NewInstance' )
            {
            // InternalDataflowDSL.g:2079:1: ( 'NewInstance' )
            // InternalDataflowDSL.g:2080:2: 'NewInstance'
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
    // InternalDataflowDSL.g:2089:1: rule__NewInstance__Group__1 : rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2 ;
    public final void rule__NewInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2093:1: ( rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2 )
            // InternalDataflowDSL.g:2094:2: rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2
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
    // InternalDataflowDSL.g:2101:1: rule__NewInstance__Group__1__Impl : ( ( rule__NewInstance__NameAssignment_1 ) ) ;
    public final void rule__NewInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2105:1: ( ( ( rule__NewInstance__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2106:1: ( ( rule__NewInstance__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2106:1: ( ( rule__NewInstance__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2107:2: ( rule__NewInstance__NameAssignment_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2108:2: ( rule__NewInstance__NameAssignment_1 )
            // InternalDataflowDSL.g:2108:3: rule__NewInstance__NameAssignment_1
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
    // InternalDataflowDSL.g:2116:1: rule__NewInstance__Group__2 : rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3 ;
    public final void rule__NewInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2120:1: ( rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3 )
            // InternalDataflowDSL.g:2121:2: rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:2128:1: rule__NewInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__NewInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2132:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2133:1: ( '{' )
            {
            // InternalDataflowDSL.g:2133:1: ( '{' )
            // InternalDataflowDSL.g:2134:2: '{'
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
    // InternalDataflowDSL.g:2143:1: rule__NewInstance__Group__3 : rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4 ;
    public final void rule__NewInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2147:1: ( rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4 )
            // InternalDataflowDSL.g:2148:2: rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataflowDSL.g:2155:1: rule__NewInstance__Group__3__Impl : ( ( rule__NewInstance__Alternatives_3 )* ) ;
    public final void rule__NewInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2159:1: ( ( ( rule__NewInstance__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:2160:1: ( ( rule__NewInstance__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:2160:1: ( ( rule__NewInstance__Alternatives_3 )* )
            // InternalDataflowDSL.g:2161:2: ( rule__NewInstance__Alternatives_3 )*
            {
             before(grammarAccess.getNewInstanceAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:2162:2: ( rule__NewInstance__Alternatives_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=34 && LA28_0<=35)||LA28_0==38||LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDataflowDSL.g:2162:3: rule__NewInstance__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__NewInstance__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getNewInstanceAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2170:1: rule__NewInstance__Group__4 : rule__NewInstance__Group__4__Impl ;
    public final void rule__NewInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2174:1: ( rule__NewInstance__Group__4__Impl )
            // InternalDataflowDSL.g:2175:2: rule__NewInstance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:2181:1: rule__NewInstance__Group__4__Impl : ( '}' ) ;
    public final void rule__NewInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2185:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2186:1: ( '}' )
            {
            // InternalDataflowDSL.g:2186:1: ( '}' )
            // InternalDataflowDSL.g:2187:2: '}'
            {
             before(grammarAccess.getNewInstanceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__NewInstance__Group_3_0__0"
    // InternalDataflowDSL.g:2197:1: rule__NewInstance__Group_3_0__0 : rule__NewInstance__Group_3_0__0__Impl rule__NewInstance__Group_3_0__1 ;
    public final void rule__NewInstance__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2201:1: ( rule__NewInstance__Group_3_0__0__Impl rule__NewInstance__Group_3_0__1 )
            // InternalDataflowDSL.g:2202:2: rule__NewInstance__Group_3_0__0__Impl rule__NewInstance__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_0__0"


    // $ANTLR start "rule__NewInstance__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:2209:1: rule__NewInstance__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__NewInstance__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2213:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:2214:1: ( 'field' )
            {
            // InternalDataflowDSL.g:2214:1: ( 'field' )
            // InternalDataflowDSL.g:2215:2: 'field'
            {
             before(grammarAccess.getNewInstanceAccess().getFieldKeyword_3_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getFieldKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_0__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_0__1"
    // InternalDataflowDSL.g:2224:1: rule__NewInstance__Group_3_0__1 : rule__NewInstance__Group_3_0__1__Impl ;
    public final void rule__NewInstance__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2228:1: ( rule__NewInstance__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:2229:2: rule__NewInstance__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_0__1"


    // $ANTLR start "rule__NewInstance__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:2235:1: rule__NewInstance__Group_3_0__1__Impl : ( ( rule__NewInstance__InstanceFieldAssignment_3_0_1 ) ) ;
    public final void rule__NewInstance__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2239:1: ( ( ( rule__NewInstance__InstanceFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:2240:1: ( ( rule__NewInstance__InstanceFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:2240:1: ( ( rule__NewInstance__InstanceFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:2241:2: ( rule__NewInstance__InstanceFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getInstanceFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:2242:2: ( rule__NewInstance__InstanceFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:2242:3: rule__NewInstance__InstanceFieldAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__InstanceFieldAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getInstanceFieldAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_0__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_1__0"
    // InternalDataflowDSL.g:2251:1: rule__NewInstance__Group_3_1__0 : rule__NewInstance__Group_3_1__0__Impl rule__NewInstance__Group_3_1__1 ;
    public final void rule__NewInstance__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2255:1: ( rule__NewInstance__Group_3_1__0__Impl rule__NewInstance__Group_3_1__1 )
            // InternalDataflowDSL.g:2256:2: rule__NewInstance__Group_3_1__0__Impl rule__NewInstance__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__NewInstance__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_1__0"


    // $ANTLR start "rule__NewInstance__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:2263:1: rule__NewInstance__Group_3_1__0__Impl : ( 'key' ) ;
    public final void rule__NewInstance__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2267:1: ( ( 'key' ) )
            // InternalDataflowDSL.g:2268:1: ( 'key' )
            {
            // InternalDataflowDSL.g:2268:1: ( 'key' )
            // InternalDataflowDSL.g:2269:2: 'key'
            {
             before(grammarAccess.getNewInstanceAccess().getKeyKeyword_3_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getKeyKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_1__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_1__1"
    // InternalDataflowDSL.g:2278:1: rule__NewInstance__Group_3_1__1 : rule__NewInstance__Group_3_1__1__Impl ;
    public final void rule__NewInstance__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2282:1: ( rule__NewInstance__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:2283:2: rule__NewInstance__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_1__1"


    // $ANTLR start "rule__NewInstance__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:2289:1: rule__NewInstance__Group_3_1__1__Impl : ( ( rule__NewInstance__KeyAssignment_3_1_1 ) ) ;
    public final void rule__NewInstance__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2293:1: ( ( ( rule__NewInstance__KeyAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:2294:1: ( ( rule__NewInstance__KeyAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:2294:1: ( ( rule__NewInstance__KeyAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:2295:2: ( rule__NewInstance__KeyAssignment_3_1_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getKeyAssignment_3_1_1()); 
            // InternalDataflowDSL.g:2296:2: ( rule__NewInstance__KeyAssignment_3_1_1 )
            // InternalDataflowDSL.g:2296:3: rule__NewInstance__KeyAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__KeyAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getKeyAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_1__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_2__0"
    // InternalDataflowDSL.g:2305:1: rule__NewInstance__Group_3_2__0 : rule__NewInstance__Group_3_2__0__Impl rule__NewInstance__Group_3_2__1 ;
    public final void rule__NewInstance__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2309:1: ( rule__NewInstance__Group_3_2__0__Impl rule__NewInstance__Group_3_2__1 )
            // InternalDataflowDSL.g:2310:2: rule__NewInstance__Group_3_2__0__Impl rule__NewInstance__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2__0"


    // $ANTLR start "rule__NewInstance__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:2317:1: rule__NewInstance__Group_3_2__0__Impl : ( 'type' ) ;
    public final void rule__NewInstance__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2321:1: ( ( 'type' ) )
            // InternalDataflowDSL.g:2322:1: ( 'type' )
            {
            // InternalDataflowDSL.g:2322:1: ( 'type' )
            // InternalDataflowDSL.g:2323:2: 'type'
            {
             before(grammarAccess.getNewInstanceAccess().getTypeKeyword_3_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTypeKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_2__1"
    // InternalDataflowDSL.g:2332:1: rule__NewInstance__Group_3_2__1 : rule__NewInstance__Group_3_2__1__Impl rule__NewInstance__Group_3_2__2 ;
    public final void rule__NewInstance__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2336:1: ( rule__NewInstance__Group_3_2__1__Impl rule__NewInstance__Group_3_2__2 )
            // InternalDataflowDSL.g:2337:2: rule__NewInstance__Group_3_2__1__Impl rule__NewInstance__Group_3_2__2
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2__1"


    // $ANTLR start "rule__NewInstance__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:2344:1: rule__NewInstance__Group_3_2__1__Impl : ( ( rule__NewInstance__Group_3_2_1__0 )? ) ;
    public final void rule__NewInstance__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2348:1: ( ( ( rule__NewInstance__Group_3_2_1__0 )? ) )
            // InternalDataflowDSL.g:2349:1: ( ( rule__NewInstance__Group_3_2_1__0 )? )
            {
            // InternalDataflowDSL.g:2349:1: ( ( rule__NewInstance__Group_3_2_1__0 )? )
            // InternalDataflowDSL.g:2350:2: ( rule__NewInstance__Group_3_2_1__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_3_2_1()); 
            // InternalDataflowDSL.g:2351:2: ( rule__NewInstance__Group_3_2_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==36) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalDataflowDSL.g:2351:3: rule__NewInstance__Group_3_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_3_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewInstanceAccess().getGroup_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_2__2"
    // InternalDataflowDSL.g:2359:1: rule__NewInstance__Group_3_2__2 : rule__NewInstance__Group_3_2__2__Impl rule__NewInstance__Group_3_2__3 ;
    public final void rule__NewInstance__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2363:1: ( rule__NewInstance__Group_3_2__2__Impl rule__NewInstance__Group_3_2__3 )
            // InternalDataflowDSL.g:2364:2: rule__NewInstance__Group_3_2__2__Impl rule__NewInstance__Group_3_2__3
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2__2"


    // $ANTLR start "rule__NewInstance__Group_3_2__2__Impl"
    // InternalDataflowDSL.g:2371:1: rule__NewInstance__Group_3_2__2__Impl : ( ( rule__NewInstance__Group_3_2_2__0 )? ) ;
    public final void rule__NewInstance__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2375:1: ( ( ( rule__NewInstance__Group_3_2_2__0 )? ) )
            // InternalDataflowDSL.g:2376:1: ( ( rule__NewInstance__Group_3_2_2__0 )? )
            {
            // InternalDataflowDSL.g:2376:1: ( ( rule__NewInstance__Group_3_2_2__0 )? )
            // InternalDataflowDSL.g:2377:2: ( rule__NewInstance__Group_3_2_2__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_3_2_2()); 
            // InternalDataflowDSL.g:2378:2: ( rule__NewInstance__Group_3_2_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==37) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalDataflowDSL.g:2378:3: rule__NewInstance__Group_3_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NewInstance__Group_3_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewInstanceAccess().getGroup_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2__2__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_2__3"
    // InternalDataflowDSL.g:2386:1: rule__NewInstance__Group_3_2__3 : rule__NewInstance__Group_3_2__3__Impl ;
    public final void rule__NewInstance__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2390:1: ( rule__NewInstance__Group_3_2__3__Impl )
            // InternalDataflowDSL.g:2391:2: rule__NewInstance__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2__3"


    // $ANTLR start "rule__NewInstance__Group_3_2__3__Impl"
    // InternalDataflowDSL.g:2397:1: rule__NewInstance__Group_3_2__3__Impl : ( ( rule__NewInstance__TypeNameAssignment_3_2_3 ) ) ;
    public final void rule__NewInstance__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2401:1: ( ( ( rule__NewInstance__TypeNameAssignment_3_2_3 ) ) )
            // InternalDataflowDSL.g:2402:1: ( ( rule__NewInstance__TypeNameAssignment_3_2_3 ) )
            {
            // InternalDataflowDSL.g:2402:1: ( ( rule__NewInstance__TypeNameAssignment_3_2_3 ) )
            // InternalDataflowDSL.g:2403:2: ( rule__NewInstance__TypeNameAssignment_3_2_3 )
            {
             before(grammarAccess.getNewInstanceAccess().getTypeNameAssignment_3_2_3()); 
            // InternalDataflowDSL.g:2404:2: ( rule__NewInstance__TypeNameAssignment_3_2_3 )
            // InternalDataflowDSL.g:2404:3: rule__NewInstance__TypeNameAssignment_3_2_3
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__TypeNameAssignment_3_2_3();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getTypeNameAssignment_3_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2__3__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_2_1__0"
    // InternalDataflowDSL.g:2413:1: rule__NewInstance__Group_3_2_1__0 : rule__NewInstance__Group_3_2_1__0__Impl rule__NewInstance__Group_3_2_1__1 ;
    public final void rule__NewInstance__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2417:1: ( rule__NewInstance__Group_3_2_1__0__Impl rule__NewInstance__Group_3_2_1__1 )
            // InternalDataflowDSL.g:2418:2: rule__NewInstance__Group_3_2_1__0__Impl rule__NewInstance__Group_3_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__NewInstance__Group_3_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2_1__0"


    // $ANTLR start "rule__NewInstance__Group_3_2_1__0__Impl"
    // InternalDataflowDSL.g:2425:1: rule__NewInstance__Group_3_2_1__0__Impl : ( ( rule__NewInstance__ModelAssignment_3_2_1_0 ) ) ;
    public final void rule__NewInstance__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2429:1: ( ( ( rule__NewInstance__ModelAssignment_3_2_1_0 ) ) )
            // InternalDataflowDSL.g:2430:1: ( ( rule__NewInstance__ModelAssignment_3_2_1_0 ) )
            {
            // InternalDataflowDSL.g:2430:1: ( ( rule__NewInstance__ModelAssignment_3_2_1_0 ) )
            // InternalDataflowDSL.g:2431:2: ( rule__NewInstance__ModelAssignment_3_2_1_0 )
            {
             before(grammarAccess.getNewInstanceAccess().getModelAssignment_3_2_1_0()); 
            // InternalDataflowDSL.g:2432:2: ( rule__NewInstance__ModelAssignment_3_2_1_0 )
            // InternalDataflowDSL.g:2432:3: rule__NewInstance__ModelAssignment_3_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__ModelAssignment_3_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getModelAssignment_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2_1__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_2_1__1"
    // InternalDataflowDSL.g:2440:1: rule__NewInstance__Group_3_2_1__1 : rule__NewInstance__Group_3_2_1__1__Impl ;
    public final void rule__NewInstance__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2444:1: ( rule__NewInstance__Group_3_2_1__1__Impl )
            // InternalDataflowDSL.g:2445:2: rule__NewInstance__Group_3_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2_1__1"


    // $ANTLR start "rule__NewInstance__Group_3_2_1__1__Impl"
    // InternalDataflowDSL.g:2451:1: rule__NewInstance__Group_3_2_1__1__Impl : ( '!' ) ;
    public final void rule__NewInstance__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2455:1: ( ( '!' ) )
            // InternalDataflowDSL.g:2456:1: ( '!' )
            {
            // InternalDataflowDSL.g:2456:1: ( '!' )
            // InternalDataflowDSL.g:2457:2: '!'
            {
             before(grammarAccess.getNewInstanceAccess().getExclamationMarkKeyword_3_2_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getExclamationMarkKeyword_3_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2_1__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_2_2__0"
    // InternalDataflowDSL.g:2467:1: rule__NewInstance__Group_3_2_2__0 : rule__NewInstance__Group_3_2_2__0__Impl rule__NewInstance__Group_3_2_2__1 ;
    public final void rule__NewInstance__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2471:1: ( rule__NewInstance__Group_3_2_2__0__Impl rule__NewInstance__Group_3_2_2__1 )
            // InternalDataflowDSL.g:2472:2: rule__NewInstance__Group_3_2_2__0__Impl rule__NewInstance__Group_3_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__NewInstance__Group_3_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2_2__0"


    // $ANTLR start "rule__NewInstance__Group_3_2_2__0__Impl"
    // InternalDataflowDSL.g:2479:1: rule__NewInstance__Group_3_2_2__0__Impl : ( ( rule__NewInstance__PackageNameAssignment_3_2_2_0 ) ) ;
    public final void rule__NewInstance__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2483:1: ( ( ( rule__NewInstance__PackageNameAssignment_3_2_2_0 ) ) )
            // InternalDataflowDSL.g:2484:1: ( ( rule__NewInstance__PackageNameAssignment_3_2_2_0 ) )
            {
            // InternalDataflowDSL.g:2484:1: ( ( rule__NewInstance__PackageNameAssignment_3_2_2_0 ) )
            // InternalDataflowDSL.g:2485:2: ( rule__NewInstance__PackageNameAssignment_3_2_2_0 )
            {
             before(grammarAccess.getNewInstanceAccess().getPackageNameAssignment_3_2_2_0()); 
            // InternalDataflowDSL.g:2486:2: ( rule__NewInstance__PackageNameAssignment_3_2_2_0 )
            // InternalDataflowDSL.g:2486:3: rule__NewInstance__PackageNameAssignment_3_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__PackageNameAssignment_3_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getPackageNameAssignment_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2_2__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_2_2__1"
    // InternalDataflowDSL.g:2494:1: rule__NewInstance__Group_3_2_2__1 : rule__NewInstance__Group_3_2_2__1__Impl ;
    public final void rule__NewInstance__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2498:1: ( rule__NewInstance__Group_3_2_2__1__Impl )
            // InternalDataflowDSL.g:2499:2: rule__NewInstance__Group_3_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2_2__1"


    // $ANTLR start "rule__NewInstance__Group_3_2_2__1__Impl"
    // InternalDataflowDSL.g:2505:1: rule__NewInstance__Group_3_2_2__1__Impl : ( '::' ) ;
    public final void rule__NewInstance__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2509:1: ( ( '::' ) )
            // InternalDataflowDSL.g:2510:1: ( '::' )
            {
            // InternalDataflowDSL.g:2510:1: ( '::' )
            // InternalDataflowDSL.g:2511:2: '::'
            {
             before(grammarAccess.getNewInstanceAccess().getColonColonKeyword_3_2_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getColonColonKeyword_3_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_2_2__1__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_3__0"
    // InternalDataflowDSL.g:2521:1: rule__NewInstance__Group_3_3__0 : rule__NewInstance__Group_3_3__0__Impl rule__NewInstance__Group_3_3__1 ;
    public final void rule__NewInstance__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2525:1: ( rule__NewInstance__Group_3_3__0__Impl rule__NewInstance__Group_3_3__1 )
            // InternalDataflowDSL.g:2526:2: rule__NewInstance__Group_3_3__0__Impl rule__NewInstance__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
            rule__NewInstance__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_3__0"


    // $ANTLR start "rule__NewInstance__Group_3_3__0__Impl"
    // InternalDataflowDSL.g:2533:1: rule__NewInstance__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__NewInstance__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2537:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2538:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2538:1: ( 'target' )
            // InternalDataflowDSL.g:2539:2: 'target'
            {
             before(grammarAccess.getNewInstanceAccess().getTargetKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTargetKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_3__0__Impl"


    // $ANTLR start "rule__NewInstance__Group_3_3__1"
    // InternalDataflowDSL.g:2548:1: rule__NewInstance__Group_3_3__1 : rule__NewInstance__Group_3_3__1__Impl ;
    public final void rule__NewInstance__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2552:1: ( rule__NewInstance__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:2553:2: rule__NewInstance__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_3__1"


    // $ANTLR start "rule__NewInstance__Group_3_3__1__Impl"
    // InternalDataflowDSL.g:2559:1: rule__NewInstance__Group_3_3__1__Impl : ( ( rule__NewInstance__TargetAssignment_3_3_1 ) ) ;
    public final void rule__NewInstance__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2563:1: ( ( ( rule__NewInstance__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:2564:1: ( ( rule__NewInstance__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:2564:1: ( ( rule__NewInstance__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:2565:2: ( rule__NewInstance__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:2566:2: ( rule__NewInstance__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:2566:3: rule__NewInstance__TargetAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInstance__TargetAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInstanceAccess().getTargetAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__Group_3_3__1__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalDataflowDSL.g:2575:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2579:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalDataflowDSL.g:2580:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
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
    // InternalDataflowDSL.g:2587:1: rule__Filter__Group__0__Impl : ( 'Filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2591:1: ( ( 'Filter' ) )
            // InternalDataflowDSL.g:2592:1: ( 'Filter' )
            {
            // InternalDataflowDSL.g:2592:1: ( 'Filter' )
            // InternalDataflowDSL.g:2593:2: 'Filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDataflowDSL.g:2602:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2606:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalDataflowDSL.g:2607:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
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
    // InternalDataflowDSL.g:2614:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__NameAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2618:1: ( ( ( rule__Filter__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2619:1: ( ( rule__Filter__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2619:1: ( ( rule__Filter__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2620:2: ( rule__Filter__NameAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2621:2: ( rule__Filter__NameAssignment_1 )
            // InternalDataflowDSL.g:2621:3: rule__Filter__NameAssignment_1
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
    // InternalDataflowDSL.g:2629:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl rule__Filter__Group__3 ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2633:1: ( rule__Filter__Group__2__Impl rule__Filter__Group__3 )
            // InternalDataflowDSL.g:2634:2: rule__Filter__Group__2__Impl rule__Filter__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataflowDSL.g:2641:1: rule__Filter__Group__2__Impl : ( '{' ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2645:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2646:1: ( '{' )
            {
            // InternalDataflowDSL.g:2646:1: ( '{' )
            // InternalDataflowDSL.g:2647:2: '{'
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
    // InternalDataflowDSL.g:2656:1: rule__Filter__Group__3 : rule__Filter__Group__3__Impl rule__Filter__Group__4 ;
    public final void rule__Filter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2660:1: ( rule__Filter__Group__3__Impl rule__Filter__Group__4 )
            // InternalDataflowDSL.g:2661:2: rule__Filter__Group__3__Impl rule__Filter__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataflowDSL.g:2668:1: rule__Filter__Group__3__Impl : ( ( rule__Filter__Alternatives_3 )* ) ;
    public final void rule__Filter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2672:1: ( ( ( rule__Filter__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:2673:1: ( ( rule__Filter__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:2673:1: ( ( rule__Filter__Alternatives_3 )* )
            // InternalDataflowDSL.g:2674:2: ( rule__Filter__Alternatives_3 )*
            {
             before(grammarAccess.getFilterAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:2675:2: ( rule__Filter__Alternatives_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==38||(LA31_0>=42 && LA31_0<=43)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDataflowDSL.g:2675:3: rule__Filter__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Filter__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getFilterAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2683:1: rule__Filter__Group__4 : rule__Filter__Group__4__Impl ;
    public final void rule__Filter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2687:1: ( rule__Filter__Group__4__Impl )
            // InternalDataflowDSL.g:2688:2: rule__Filter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:2694:1: rule__Filter__Group__4__Impl : ( '}' ) ;
    public final void rule__Filter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2698:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2699:1: ( '}' )
            {
            // InternalDataflowDSL.g:2699:1: ( '}' )
            // InternalDataflowDSL.g:2700:2: '}'
            {
             before(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Filter__Group_3_0__0"
    // InternalDataflowDSL.g:2710:1: rule__Filter__Group_3_0__0 : rule__Filter__Group_3_0__0__Impl rule__Filter__Group_3_0__1 ;
    public final void rule__Filter__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2714:1: ( rule__Filter__Group_3_0__0__Impl rule__Filter__Group_3_0__1 )
            // InternalDataflowDSL.g:2715:2: rule__Filter__Group_3_0__0__Impl rule__Filter__Group_3_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Filter__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_0__0"


    // $ANTLR start "rule__Filter__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:2722:1: rule__Filter__Group_3_0__0__Impl : ( 'filterBy' ) ;
    public final void rule__Filter__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2726:1: ( ( 'filterBy' ) )
            // InternalDataflowDSL.g:2727:1: ( 'filterBy' )
            {
            // InternalDataflowDSL.g:2727:1: ( 'filterBy' )
            // InternalDataflowDSL.g:2728:2: 'filterBy'
            {
             before(grammarAccess.getFilterAccess().getFilterByKeyword_3_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterByKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_0__0__Impl"


    // $ANTLR start "rule__Filter__Group_3_0__1"
    // InternalDataflowDSL.g:2737:1: rule__Filter__Group_3_0__1 : rule__Filter__Group_3_0__1__Impl ;
    public final void rule__Filter__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2741:1: ( rule__Filter__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:2742:2: rule__Filter__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_0__1"


    // $ANTLR start "rule__Filter__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:2748:1: rule__Filter__Group_3_0__1__Impl : ( ( rule__Filter__FilterByAssignment_3_0_1 ) ) ;
    public final void rule__Filter__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2752:1: ( ( ( rule__Filter__FilterByAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:2753:1: ( ( rule__Filter__FilterByAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:2753:1: ( ( rule__Filter__FilterByAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:2754:2: ( rule__Filter__FilterByAssignment_3_0_1 )
            {
             before(grammarAccess.getFilterAccess().getFilterByAssignment_3_0_1()); 
            // InternalDataflowDSL.g:2755:2: ( rule__Filter__FilterByAssignment_3_0_1 )
            // InternalDataflowDSL.g:2755:3: rule__Filter__FilterByAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__FilterByAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getFilterByAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_0__1__Impl"


    // $ANTLR start "rule__Filter__Group_3_1__0"
    // InternalDataflowDSL.g:2764:1: rule__Filter__Group_3_1__0 : rule__Filter__Group_3_1__0__Impl rule__Filter__Group_3_1__1 ;
    public final void rule__Filter__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2768:1: ( rule__Filter__Group_3_1__0__Impl rule__Filter__Group_3_1__1 )
            // InternalDataflowDSL.g:2769:2: rule__Filter__Group_3_1__0__Impl rule__Filter__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Filter__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_1__0"


    // $ANTLR start "rule__Filter__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:2776:1: rule__Filter__Group_3_1__0__Impl : ( 'target' ) ;
    public final void rule__Filter__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2780:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2781:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2781:1: ( 'target' )
            // InternalDataflowDSL.g:2782:2: 'target'
            {
             before(grammarAccess.getFilterAccess().getTargetKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getTargetKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_1__0__Impl"


    // $ANTLR start "rule__Filter__Group_3_1__1"
    // InternalDataflowDSL.g:2791:1: rule__Filter__Group_3_1__1 : rule__Filter__Group_3_1__1__Impl ;
    public final void rule__Filter__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2795:1: ( rule__Filter__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:2796:2: rule__Filter__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_1__1"


    // $ANTLR start "rule__Filter__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:2802:1: rule__Filter__Group_3_1__1__Impl : ( ( rule__Filter__TargetAssignment_3_1_1 ) ) ;
    public final void rule__Filter__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2806:1: ( ( ( rule__Filter__TargetAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:2807:1: ( ( rule__Filter__TargetAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:2807:1: ( ( rule__Filter__TargetAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:2808:2: ( rule__Filter__TargetAssignment_3_1_1 )
            {
             before(grammarAccess.getFilterAccess().getTargetAssignment_3_1_1()); 
            // InternalDataflowDSL.g:2809:2: ( rule__Filter__TargetAssignment_3_1_1 )
            // InternalDataflowDSL.g:2809:3: rule__Filter__TargetAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__TargetAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getTargetAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_1__1__Impl"


    // $ANTLR start "rule__Filter__Group_3_2__0"
    // InternalDataflowDSL.g:2818:1: rule__Filter__Group_3_2__0 : rule__Filter__Group_3_2__0__Impl rule__Filter__Group_3_2__1 ;
    public final void rule__Filter__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2822:1: ( rule__Filter__Group_3_2__0__Impl rule__Filter__Group_3_2__1 )
            // InternalDataflowDSL.g:2823:2: rule__Filter__Group_3_2__0__Impl rule__Filter__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Filter__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_2__0"


    // $ANTLR start "rule__Filter__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:2830:1: rule__Filter__Group_3_2__0__Impl : ( 'rejectTarget' ) ;
    public final void rule__Filter__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2834:1: ( ( 'rejectTarget' ) )
            // InternalDataflowDSL.g:2835:1: ( 'rejectTarget' )
            {
            // InternalDataflowDSL.g:2835:1: ( 'rejectTarget' )
            // InternalDataflowDSL.g:2836:2: 'rejectTarget'
            {
             before(grammarAccess.getFilterAccess().getRejectTargetKeyword_3_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRejectTargetKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_2__0__Impl"


    // $ANTLR start "rule__Filter__Group_3_2__1"
    // InternalDataflowDSL.g:2845:1: rule__Filter__Group_3_2__1 : rule__Filter__Group_3_2__1__Impl ;
    public final void rule__Filter__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2849:1: ( rule__Filter__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:2850:2: rule__Filter__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_2__1"


    // $ANTLR start "rule__Filter__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:2856:1: rule__Filter__Group_3_2__1__Impl : ( ( rule__Filter__RejectTargetAssignment_3_2_1 ) ) ;
    public final void rule__Filter__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2860:1: ( ( ( rule__Filter__RejectTargetAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:2861:1: ( ( rule__Filter__RejectTargetAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:2861:1: ( ( rule__Filter__RejectTargetAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:2862:2: ( rule__Filter__RejectTargetAssignment_3_2_1 )
            {
             before(grammarAccess.getFilterAccess().getRejectTargetAssignment_3_2_1()); 
            // InternalDataflowDSL.g:2863:2: ( rule__Filter__RejectTargetAssignment_3_2_1 )
            // InternalDataflowDSL.g:2863:3: rule__Filter__RejectTargetAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__RejectTargetAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getRejectTargetAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group_3_2__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // InternalDataflowDSL.g:2872:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2876:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalDataflowDSL.g:2877:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
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
    // InternalDataflowDSL.g:2884:1: rule__Copy__Group__0__Impl : ( 'Copy' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2888:1: ( ( 'Copy' ) )
            // InternalDataflowDSL.g:2889:1: ( 'Copy' )
            {
            // InternalDataflowDSL.g:2889:1: ( 'Copy' )
            // InternalDataflowDSL.g:2890:2: 'Copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDataflowDSL.g:2899:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2903:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalDataflowDSL.g:2904:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
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
    // InternalDataflowDSL.g:2911:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__NameAssignment_1 ) ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2915:1: ( ( ( rule__Copy__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2916:1: ( ( rule__Copy__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2916:1: ( ( rule__Copy__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2917:2: ( rule__Copy__NameAssignment_1 )
            {
             before(grammarAccess.getCopyAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2918:2: ( rule__Copy__NameAssignment_1 )
            // InternalDataflowDSL.g:2918:3: rule__Copy__NameAssignment_1
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
    // InternalDataflowDSL.g:2926:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2930:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalDataflowDSL.g:2931:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflowDSL.g:2938:1: rule__Copy__Group__2__Impl : ( '{' ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2942:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2943:1: ( '{' )
            {
            // InternalDataflowDSL.g:2943:1: ( '{' )
            // InternalDataflowDSL.g:2944:2: '{'
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
    // InternalDataflowDSL.g:2953:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2957:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalDataflowDSL.g:2958:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflowDSL.g:2965:1: rule__Copy__Group__3__Impl : ( ( rule__Copy__Alternatives_3 )* ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2969:1: ( ( ( rule__Copy__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:2970:1: ( ( rule__Copy__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:2970:1: ( ( rule__Copy__Alternatives_3 )* )
            // InternalDataflowDSL.g:2971:2: ( rule__Copy__Alternatives_3 )*
            {
             before(grammarAccess.getCopyAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:2972:2: ( rule__Copy__Alternatives_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38||LA32_0==45) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDataflowDSL.g:2972:3: rule__Copy__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Copy__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getCopyAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:2980:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2984:1: ( rule__Copy__Group__4__Impl )
            // InternalDataflowDSL.g:2985:2: rule__Copy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:2991:1: rule__Copy__Group__4__Impl : ( '}' ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2995:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2996:1: ( '}' )
            {
            // InternalDataflowDSL.g:2996:1: ( '}' )
            // InternalDataflowDSL.g:2997:2: '}'
            {
             before(grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Copy__Group_3_0__0"
    // InternalDataflowDSL.g:3007:1: rule__Copy__Group_3_0__0 : rule__Copy__Group_3_0__0__Impl rule__Copy__Group_3_0__1 ;
    public final void rule__Copy__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3011:1: ( rule__Copy__Group_3_0__0__Impl rule__Copy__Group_3_0__1 )
            // InternalDataflowDSL.g:3012:2: rule__Copy__Group_3_0__0__Impl rule__Copy__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Copy__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3_0__0"


    // $ANTLR start "rule__Copy__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:3019:1: rule__Copy__Group_3_0__0__Impl : ( 'target' ) ;
    public final void rule__Copy__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3023:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3024:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3024:1: ( 'target' )
            // InternalDataflowDSL.g:3025:2: 'target'
            {
             before(grammarAccess.getCopyAccess().getTargetKeyword_3_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getTargetKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3_0__0__Impl"


    // $ANTLR start "rule__Copy__Group_3_0__1"
    // InternalDataflowDSL.g:3034:1: rule__Copy__Group_3_0__1 : rule__Copy__Group_3_0__1__Impl ;
    public final void rule__Copy__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3038:1: ( rule__Copy__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:3039:2: rule__Copy__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3_0__1"


    // $ANTLR start "rule__Copy__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:3045:1: rule__Copy__Group_3_0__1__Impl : ( ( rule__Copy__TargetAssignment_3_0_1 ) ) ;
    public final void rule__Copy__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3049:1: ( ( ( rule__Copy__TargetAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:3050:1: ( ( rule__Copy__TargetAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:3050:1: ( ( rule__Copy__TargetAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:3051:2: ( rule__Copy__TargetAssignment_3_0_1 )
            {
             before(grammarAccess.getCopyAccess().getTargetAssignment_3_0_1()); 
            // InternalDataflowDSL.g:3052:2: ( rule__Copy__TargetAssignment_3_0_1 )
            // InternalDataflowDSL.g:3052:3: rule__Copy__TargetAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Copy__TargetAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getTargetAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3_0__1__Impl"


    // $ANTLR start "rule__Copy__Group_3_1__0"
    // InternalDataflowDSL.g:3061:1: rule__Copy__Group_3_1__0 : rule__Copy__Group_3_1__0__Impl rule__Copy__Group_3_1__1 ;
    public final void rule__Copy__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3065:1: ( rule__Copy__Group_3_1__0__Impl rule__Copy__Group_3_1__1 )
            // InternalDataflowDSL.g:3066:2: rule__Copy__Group_3_1__0__Impl rule__Copy__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Copy__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3_1__0"


    // $ANTLR start "rule__Copy__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:3073:1: rule__Copy__Group_3_1__0__Impl : ( 'copyTarget' ) ;
    public final void rule__Copy__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3077:1: ( ( 'copyTarget' ) )
            // InternalDataflowDSL.g:3078:1: ( 'copyTarget' )
            {
            // InternalDataflowDSL.g:3078:1: ( 'copyTarget' )
            // InternalDataflowDSL.g:3079:2: 'copyTarget'
            {
             before(grammarAccess.getCopyAccess().getCopyTargetKeyword_3_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCopyTargetKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3_1__0__Impl"


    // $ANTLR start "rule__Copy__Group_3_1__1"
    // InternalDataflowDSL.g:3088:1: rule__Copy__Group_3_1__1 : rule__Copy__Group_3_1__1__Impl ;
    public final void rule__Copy__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3092:1: ( rule__Copy__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:3093:2: rule__Copy__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3_1__1"


    // $ANTLR start "rule__Copy__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:3099:1: rule__Copy__Group_3_1__1__Impl : ( ( rule__Copy__CopyTargetAssignment_3_1_1 ) ) ;
    public final void rule__Copy__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3103:1: ( ( ( rule__Copy__CopyTargetAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:3104:1: ( ( rule__Copy__CopyTargetAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:3104:1: ( ( rule__Copy__CopyTargetAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:3105:2: ( rule__Copy__CopyTargetAssignment_3_1_1 )
            {
             before(grammarAccess.getCopyAccess().getCopyTargetAssignment_3_1_1()); 
            // InternalDataflowDSL.g:3106:2: ( rule__Copy__CopyTargetAssignment_3_1_1 )
            // InternalDataflowDSL.g:3106:3: rule__Copy__CopyTargetAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Copy__CopyTargetAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getCopyTargetAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_3_1__1__Impl"


    // $ANTLR start "rule__Sort__Group__0"
    // InternalDataflowDSL.g:3115:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3119:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // InternalDataflowDSL.g:3120:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
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
    // InternalDataflowDSL.g:3127:1: rule__Sort__Group__0__Impl : ( 'Sort' ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3131:1: ( ( 'Sort' ) )
            // InternalDataflowDSL.g:3132:1: ( 'Sort' )
            {
            // InternalDataflowDSL.g:3132:1: ( 'Sort' )
            // InternalDataflowDSL.g:3133:2: 'Sort'
            {
             before(grammarAccess.getSortAccess().getSortKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3142:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl rule__Sort__Group__2 ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3146:1: ( rule__Sort__Group__1__Impl rule__Sort__Group__2 )
            // InternalDataflowDSL.g:3147:2: rule__Sort__Group__1__Impl rule__Sort__Group__2
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
    // InternalDataflowDSL.g:3154:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3158:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3159:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3159:1: ( ( rule__Sort__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3160:2: ( rule__Sort__NameAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3161:2: ( rule__Sort__NameAssignment_1 )
            // InternalDataflowDSL.g:3161:3: rule__Sort__NameAssignment_1
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
    // InternalDataflowDSL.g:3169:1: rule__Sort__Group__2 : rule__Sort__Group__2__Impl rule__Sort__Group__3 ;
    public final void rule__Sort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3173:1: ( rule__Sort__Group__2__Impl rule__Sort__Group__3 )
            // InternalDataflowDSL.g:3174:2: rule__Sort__Group__2__Impl rule__Sort__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataflowDSL.g:3181:1: rule__Sort__Group__2__Impl : ( '{' ) ;
    public final void rule__Sort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3185:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3186:1: ( '{' )
            {
            // InternalDataflowDSL.g:3186:1: ( '{' )
            // InternalDataflowDSL.g:3187:2: '{'
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
    // InternalDataflowDSL.g:3196:1: rule__Sort__Group__3 : rule__Sort__Group__3__Impl rule__Sort__Group__4 ;
    public final void rule__Sort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3200:1: ( rule__Sort__Group__3__Impl rule__Sort__Group__4 )
            // InternalDataflowDSL.g:3201:2: rule__Sort__Group__3__Impl rule__Sort__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataflowDSL.g:3208:1: rule__Sort__Group__3__Impl : ( ( rule__Sort__Alternatives_3 )* ) ;
    public final void rule__Sort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3212:1: ( ( ( rule__Sort__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:3213:1: ( ( rule__Sort__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:3213:1: ( ( rule__Sort__Alternatives_3 )* )
            // InternalDataflowDSL.g:3214:2: ( rule__Sort__Alternatives_3 )*
            {
             before(grammarAccess.getSortAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:3215:2: ( rule__Sort__Alternatives_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38||LA33_0==47) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDataflowDSL.g:3215:3: rule__Sort__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Sort__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSortAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:3223:1: rule__Sort__Group__4 : rule__Sort__Group__4__Impl ;
    public final void rule__Sort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3227:1: ( rule__Sort__Group__4__Impl )
            // InternalDataflowDSL.g:3228:2: rule__Sort__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:3234:1: rule__Sort__Group__4__Impl : ( '}' ) ;
    public final void rule__Sort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3238:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3239:1: ( '}' )
            {
            // InternalDataflowDSL.g:3239:1: ( '}' )
            // InternalDataflowDSL.g:3240:2: '}'
            {
             before(grammarAccess.getSortAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sort__Group_3_0__0"
    // InternalDataflowDSL.g:3250:1: rule__Sort__Group_3_0__0 : rule__Sort__Group_3_0__0__Impl rule__Sort__Group_3_0__1 ;
    public final void rule__Sort__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3254:1: ( rule__Sort__Group_3_0__0__Impl rule__Sort__Group_3_0__1 )
            // InternalDataflowDSL.g:3255:2: rule__Sort__Group_3_0__0__Impl rule__Sort__Group_3_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Sort__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group_3_0__0"


    // $ANTLR start "rule__Sort__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:3262:1: rule__Sort__Group_3_0__0__Impl : ( 'sortBy' ) ;
    public final void rule__Sort__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3266:1: ( ( 'sortBy' ) )
            // InternalDataflowDSL.g:3267:1: ( 'sortBy' )
            {
            // InternalDataflowDSL.g:3267:1: ( 'sortBy' )
            // InternalDataflowDSL.g:3268:2: 'sortBy'
            {
             before(grammarAccess.getSortAccess().getSortByKeyword_3_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getSortByKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group_3_0__0__Impl"


    // $ANTLR start "rule__Sort__Group_3_0__1"
    // InternalDataflowDSL.g:3277:1: rule__Sort__Group_3_0__1 : rule__Sort__Group_3_0__1__Impl ;
    public final void rule__Sort__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3281:1: ( rule__Sort__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:3282:2: rule__Sort__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group_3_0__1"


    // $ANTLR start "rule__Sort__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:3288:1: rule__Sort__Group_3_0__1__Impl : ( ( rule__Sort__SortByAssignment_3_0_1 ) ) ;
    public final void rule__Sort__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3292:1: ( ( ( rule__Sort__SortByAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:3293:1: ( ( rule__Sort__SortByAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:3293:1: ( ( rule__Sort__SortByAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:3294:2: ( rule__Sort__SortByAssignment_3_0_1 )
            {
             before(grammarAccess.getSortAccess().getSortByAssignment_3_0_1()); 
            // InternalDataflowDSL.g:3295:2: ( rule__Sort__SortByAssignment_3_0_1 )
            // InternalDataflowDSL.g:3295:3: rule__Sort__SortByAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Sort__SortByAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getSortByAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group_3_0__1__Impl"


    // $ANTLR start "rule__Sort__Group_3_1__0"
    // InternalDataflowDSL.g:3304:1: rule__Sort__Group_3_1__0 : rule__Sort__Group_3_1__0__Impl rule__Sort__Group_3_1__1 ;
    public final void rule__Sort__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3308:1: ( rule__Sort__Group_3_1__0__Impl rule__Sort__Group_3_1__1 )
            // InternalDataflowDSL.g:3309:2: rule__Sort__Group_3_1__0__Impl rule__Sort__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Sort__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group_3_1__0"


    // $ANTLR start "rule__Sort__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:3316:1: rule__Sort__Group_3_1__0__Impl : ( 'target' ) ;
    public final void rule__Sort__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3320:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3321:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3321:1: ( 'target' )
            // InternalDataflowDSL.g:3322:2: 'target'
            {
             before(grammarAccess.getSortAccess().getTargetKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getTargetKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group_3_1__0__Impl"


    // $ANTLR start "rule__Sort__Group_3_1__1"
    // InternalDataflowDSL.g:3331:1: rule__Sort__Group_3_1__1 : rule__Sort__Group_3_1__1__Impl ;
    public final void rule__Sort__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3335:1: ( rule__Sort__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:3336:2: rule__Sort__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group_3_1__1"


    // $ANTLR start "rule__Sort__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:3342:1: rule__Sort__Group_3_1__1__Impl : ( ( rule__Sort__TargetAssignment_3_1_1 ) ) ;
    public final void rule__Sort__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3346:1: ( ( ( rule__Sort__TargetAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:3347:1: ( ( rule__Sort__TargetAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:3347:1: ( ( rule__Sort__TargetAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:3348:2: ( rule__Sort__TargetAssignment_3_1_1 )
            {
             before(grammarAccess.getSortAccess().getTargetAssignment_3_1_1()); 
            // InternalDataflowDSL.g:3349:2: ( rule__Sort__TargetAssignment_3_1_1 )
            // InternalDataflowDSL.g:3349:3: rule__Sort__TargetAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sort__TargetAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getTargetAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group_3_1__1__Impl"


    // $ANTLR start "rule__Product__Group__0"
    // InternalDataflowDSL.g:3358:1: rule__Product__Group__0 : rule__Product__Group__0__Impl rule__Product__Group__1 ;
    public final void rule__Product__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3362:1: ( rule__Product__Group__0__Impl rule__Product__Group__1 )
            // InternalDataflowDSL.g:3363:2: rule__Product__Group__0__Impl rule__Product__Group__1
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
    // InternalDataflowDSL.g:3370:1: rule__Product__Group__0__Impl : ( 'Product' ) ;
    public final void rule__Product__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3374:1: ( ( 'Product' ) )
            // InternalDataflowDSL.g:3375:1: ( 'Product' )
            {
            // InternalDataflowDSL.g:3375:1: ( 'Product' )
            // InternalDataflowDSL.g:3376:2: 'Product'
            {
             before(grammarAccess.getProductAccess().getProductKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3385:1: rule__Product__Group__1 : rule__Product__Group__1__Impl rule__Product__Group__2 ;
    public final void rule__Product__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3389:1: ( rule__Product__Group__1__Impl rule__Product__Group__2 )
            // InternalDataflowDSL.g:3390:2: rule__Product__Group__1__Impl rule__Product__Group__2
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
    // InternalDataflowDSL.g:3397:1: rule__Product__Group__1__Impl : ( ( rule__Product__NameAssignment_1 ) ) ;
    public final void rule__Product__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3401:1: ( ( ( rule__Product__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3402:1: ( ( rule__Product__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3402:1: ( ( rule__Product__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3403:2: ( rule__Product__NameAssignment_1 )
            {
             before(grammarAccess.getProductAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3404:2: ( rule__Product__NameAssignment_1 )
            // InternalDataflowDSL.g:3404:3: rule__Product__NameAssignment_1
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
    // InternalDataflowDSL.g:3412:1: rule__Product__Group__2 : rule__Product__Group__2__Impl rule__Product__Group__3 ;
    public final void rule__Product__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3416:1: ( rule__Product__Group__2__Impl rule__Product__Group__3 )
            // InternalDataflowDSL.g:3417:2: rule__Product__Group__2__Impl rule__Product__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataflowDSL.g:3424:1: rule__Product__Group__2__Impl : ( '{' ) ;
    public final void rule__Product__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3428:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3429:1: ( '{' )
            {
            // InternalDataflowDSL.g:3429:1: ( '{' )
            // InternalDataflowDSL.g:3430:2: '{'
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
    // InternalDataflowDSL.g:3439:1: rule__Product__Group__3 : rule__Product__Group__3__Impl rule__Product__Group__4 ;
    public final void rule__Product__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3443:1: ( rule__Product__Group__3__Impl rule__Product__Group__4 )
            // InternalDataflowDSL.g:3444:2: rule__Product__Group__3__Impl rule__Product__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataflowDSL.g:3451:1: rule__Product__Group__3__Impl : ( ( rule__Product__Group_3__0 )? ) ;
    public final void rule__Product__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3455:1: ( ( ( rule__Product__Group_3__0 )? ) )
            // InternalDataflowDSL.g:3456:1: ( ( rule__Product__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:3456:1: ( ( rule__Product__Group_3__0 )? )
            // InternalDataflowDSL.g:3457:2: ( rule__Product__Group_3__0 )?
            {
             before(grammarAccess.getProductAccess().getGroup_3()); 
            // InternalDataflowDSL.g:3458:2: ( rule__Product__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataflowDSL.g:3458:3: rule__Product__Group_3__0
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
    // InternalDataflowDSL.g:3466:1: rule__Product__Group__4 : rule__Product__Group__4__Impl ;
    public final void rule__Product__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3470:1: ( rule__Product__Group__4__Impl )
            // InternalDataflowDSL.g:3471:2: rule__Product__Group__4__Impl
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
    // InternalDataflowDSL.g:3477:1: rule__Product__Group__4__Impl : ( '}' ) ;
    public final void rule__Product__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3481:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3482:1: ( '}' )
            {
            // InternalDataflowDSL.g:3482:1: ( '}' )
            // InternalDataflowDSL.g:3483:2: '}'
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
    // InternalDataflowDSL.g:3493:1: rule__Product__Group_3__0 : rule__Product__Group_3__0__Impl rule__Product__Group_3__1 ;
    public final void rule__Product__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3497:1: ( rule__Product__Group_3__0__Impl rule__Product__Group_3__1 )
            // InternalDataflowDSL.g:3498:2: rule__Product__Group_3__0__Impl rule__Product__Group_3__1
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
    // InternalDataflowDSL.g:3505:1: rule__Product__Group_3__0__Impl : ( 'target' ) ;
    public final void rule__Product__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3509:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3510:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3510:1: ( 'target' )
            // InternalDataflowDSL.g:3511:2: 'target'
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
    // InternalDataflowDSL.g:3520:1: rule__Product__Group_3__1 : rule__Product__Group_3__1__Impl ;
    public final void rule__Product__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3524:1: ( rule__Product__Group_3__1__Impl )
            // InternalDataflowDSL.g:3525:2: rule__Product__Group_3__1__Impl
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
    // InternalDataflowDSL.g:3531:1: rule__Product__Group_3__1__Impl : ( ( rule__Product__TargetAssignment_3_1 ) ) ;
    public final void rule__Product__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3535:1: ( ( ( rule__Product__TargetAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:3536:1: ( ( rule__Product__TargetAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:3536:1: ( ( rule__Product__TargetAssignment_3_1 ) )
            // InternalDataflowDSL.g:3537:2: ( rule__Product__TargetAssignment_3_1 )
            {
             before(grammarAccess.getProductAccess().getTargetAssignment_3_1()); 
            // InternalDataflowDSL.g:3538:2: ( rule__Product__TargetAssignment_3_1 )
            // InternalDataflowDSL.g:3538:3: rule__Product__TargetAssignment_3_1
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
    // InternalDataflowDSL.g:3547:1: rule__GetFeature__Group__0 : rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1 ;
    public final void rule__GetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3551:1: ( rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1 )
            // InternalDataflowDSL.g:3552:2: rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1
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
    // InternalDataflowDSL.g:3559:1: rule__GetFeature__Group__0__Impl : ( 'GetFeature' ) ;
    public final void rule__GetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3563:1: ( ( 'GetFeature' ) )
            // InternalDataflowDSL.g:3564:1: ( 'GetFeature' )
            {
            // InternalDataflowDSL.g:3564:1: ( 'GetFeature' )
            // InternalDataflowDSL.g:3565:2: 'GetFeature'
            {
             before(grammarAccess.getGetFeatureAccess().getGetFeatureKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3574:1: rule__GetFeature__Group__1 : rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2 ;
    public final void rule__GetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3578:1: ( rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2 )
            // InternalDataflowDSL.g:3579:2: rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2
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
    // InternalDataflowDSL.g:3586:1: rule__GetFeature__Group__1__Impl : ( ( rule__GetFeature__NameAssignment_1 ) ) ;
    public final void rule__GetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3590:1: ( ( ( rule__GetFeature__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3591:1: ( ( rule__GetFeature__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3591:1: ( ( rule__GetFeature__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3592:2: ( rule__GetFeature__NameAssignment_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3593:2: ( rule__GetFeature__NameAssignment_1 )
            // InternalDataflowDSL.g:3593:3: rule__GetFeature__NameAssignment_1
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
    // InternalDataflowDSL.g:3601:1: rule__GetFeature__Group__2 : rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3 ;
    public final void rule__GetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3605:1: ( rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3 )
            // InternalDataflowDSL.g:3606:2: rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalDataflowDSL.g:3613:1: rule__GetFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__GetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3617:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3618:1: ( '{' )
            {
            // InternalDataflowDSL.g:3618:1: ( '{' )
            // InternalDataflowDSL.g:3619:2: '{'
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
    // InternalDataflowDSL.g:3628:1: rule__GetFeature__Group__3 : rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4 ;
    public final void rule__GetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3632:1: ( rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4 )
            // InternalDataflowDSL.g:3633:2: rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalDataflowDSL.g:3640:1: rule__GetFeature__Group__3__Impl : ( ( rule__GetFeature__Alternatives_3 )* ) ;
    public final void rule__GetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3644:1: ( ( ( rule__GetFeature__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:3645:1: ( ( rule__GetFeature__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:3645:1: ( ( rule__GetFeature__Alternatives_3 )* )
            // InternalDataflowDSL.g:3646:2: ( rule__GetFeature__Alternatives_3 )*
            {
             before(grammarAccess.getGetFeatureAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:3647:2: ( rule__GetFeature__Alternatives_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38||(LA35_0>=50 && LA35_0<=52)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDataflowDSL.g:3647:3: rule__GetFeature__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__GetFeature__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getGetFeatureAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:3655:1: rule__GetFeature__Group__4 : rule__GetFeature__Group__4__Impl ;
    public final void rule__GetFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3659:1: ( rule__GetFeature__Group__4__Impl )
            // InternalDataflowDSL.g:3660:2: rule__GetFeature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:3666:1: rule__GetFeature__Group__4__Impl : ( '}' ) ;
    public final void rule__GetFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3670:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3671:1: ( '}' )
            {
            // InternalDataflowDSL.g:3671:1: ( '}' )
            // InternalDataflowDSL.g:3672:2: '}'
            {
             before(grammarAccess.getGetFeatureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__GetFeature__Group_3_0__0"
    // InternalDataflowDSL.g:3682:1: rule__GetFeature__Group_3_0__0 : rule__GetFeature__Group_3_0__0__Impl rule__GetFeature__Group_3_0__1 ;
    public final void rule__GetFeature__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3686:1: ( rule__GetFeature__Group_3_0__0__Impl rule__GetFeature__Group_3_0__1 )
            // InternalDataflowDSL.g:3687:2: rule__GetFeature__Group_3_0__0__Impl rule__GetFeature__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_0__0"


    // $ANTLR start "rule__GetFeature__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:3694:1: rule__GetFeature__Group_3_0__0__Impl : ( 'objectField' ) ;
    public final void rule__GetFeature__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3698:1: ( ( 'objectField' ) )
            // InternalDataflowDSL.g:3699:1: ( 'objectField' )
            {
            // InternalDataflowDSL.g:3699:1: ( 'objectField' )
            // InternalDataflowDSL.g:3700:2: 'objectField'
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldKeyword_3_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getObjectFieldKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_0__0__Impl"


    // $ANTLR start "rule__GetFeature__Group_3_0__1"
    // InternalDataflowDSL.g:3709:1: rule__GetFeature__Group_3_0__1 : rule__GetFeature__Group_3_0__1__Impl ;
    public final void rule__GetFeature__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3713:1: ( rule__GetFeature__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:3714:2: rule__GetFeature__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_0__1"


    // $ANTLR start "rule__GetFeature__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:3720:1: rule__GetFeature__Group_3_0__1__Impl : ( ( rule__GetFeature__ObjectFieldAssignment_3_0_1 ) ) ;
    public final void rule__GetFeature__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3724:1: ( ( ( rule__GetFeature__ObjectFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:3725:1: ( ( rule__GetFeature__ObjectFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:3725:1: ( ( rule__GetFeature__ObjectFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:3726:2: ( rule__GetFeature__ObjectFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:3727:2: ( rule__GetFeature__ObjectFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:3727:3: rule__GetFeature__ObjectFieldAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__ObjectFieldAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getObjectFieldAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_0__1__Impl"


    // $ANTLR start "rule__GetFeature__Group_3_1__0"
    // InternalDataflowDSL.g:3736:1: rule__GetFeature__Group_3_1__0 : rule__GetFeature__Group_3_1__0__Impl rule__GetFeature__Group_3_1__1 ;
    public final void rule__GetFeature__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3740:1: ( rule__GetFeature__Group_3_1__0__Impl rule__GetFeature__Group_3_1__1 )
            // InternalDataflowDSL.g:3741:2: rule__GetFeature__Group_3_1__0__Impl rule__GetFeature__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_1__0"


    // $ANTLR start "rule__GetFeature__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:3748:1: rule__GetFeature__Group_3_1__0__Impl : ( 'valueField' ) ;
    public final void rule__GetFeature__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3752:1: ( ( 'valueField' ) )
            // InternalDataflowDSL.g:3753:1: ( 'valueField' )
            {
            // InternalDataflowDSL.g:3753:1: ( 'valueField' )
            // InternalDataflowDSL.g:3754:2: 'valueField'
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldKeyword_3_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getValueFieldKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_1__0__Impl"


    // $ANTLR start "rule__GetFeature__Group_3_1__1"
    // InternalDataflowDSL.g:3763:1: rule__GetFeature__Group_3_1__1 : rule__GetFeature__Group_3_1__1__Impl ;
    public final void rule__GetFeature__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3767:1: ( rule__GetFeature__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:3768:2: rule__GetFeature__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_1__1"


    // $ANTLR start "rule__GetFeature__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:3774:1: rule__GetFeature__Group_3_1__1__Impl : ( ( rule__GetFeature__ValueFieldAssignment_3_1_1 ) ) ;
    public final void rule__GetFeature__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3778:1: ( ( ( rule__GetFeature__ValueFieldAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:3779:1: ( ( rule__GetFeature__ValueFieldAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:3779:1: ( ( rule__GetFeature__ValueFieldAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:3780:2: ( rule__GetFeature__ValueFieldAssignment_3_1_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldAssignment_3_1_1()); 
            // InternalDataflowDSL.g:3781:2: ( rule__GetFeature__ValueFieldAssignment_3_1_1 )
            // InternalDataflowDSL.g:3781:3: rule__GetFeature__ValueFieldAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__ValueFieldAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getValueFieldAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_1__1__Impl"


    // $ANTLR start "rule__GetFeature__Group_3_2__0"
    // InternalDataflowDSL.g:3790:1: rule__GetFeature__Group_3_2__0 : rule__GetFeature__Group_3_2__0__Impl rule__GetFeature__Group_3_2__1 ;
    public final void rule__GetFeature__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3794:1: ( rule__GetFeature__Group_3_2__0__Impl rule__GetFeature__Group_3_2__1 )
            // InternalDataflowDSL.g:3795:2: rule__GetFeature__Group_3_2__0__Impl rule__GetFeature__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_2__0"


    // $ANTLR start "rule__GetFeature__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:3802:1: rule__GetFeature__Group_3_2__0__Impl : ( 'feature' ) ;
    public final void rule__GetFeature__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3806:1: ( ( 'feature' ) )
            // InternalDataflowDSL.g:3807:1: ( 'feature' )
            {
            // InternalDataflowDSL.g:3807:1: ( 'feature' )
            // InternalDataflowDSL.g:3808:2: 'feature'
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureKeyword_3_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getFeatureKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_2__0__Impl"


    // $ANTLR start "rule__GetFeature__Group_3_2__1"
    // InternalDataflowDSL.g:3817:1: rule__GetFeature__Group_3_2__1 : rule__GetFeature__Group_3_2__1__Impl ;
    public final void rule__GetFeature__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3821:1: ( rule__GetFeature__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:3822:2: rule__GetFeature__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_2__1"


    // $ANTLR start "rule__GetFeature__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:3828:1: rule__GetFeature__Group_3_2__1__Impl : ( ( rule__GetFeature__FeatureAssignment_3_2_1 ) ) ;
    public final void rule__GetFeature__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3832:1: ( ( ( rule__GetFeature__FeatureAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:3833:1: ( ( rule__GetFeature__FeatureAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:3833:1: ( ( rule__GetFeature__FeatureAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:3834:2: ( rule__GetFeature__FeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureAssignment_3_2_1()); 
            // InternalDataflowDSL.g:3835:2: ( rule__GetFeature__FeatureAssignment_3_2_1 )
            // InternalDataflowDSL.g:3835:3: rule__GetFeature__FeatureAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__FeatureAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getFeatureAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_2__1__Impl"


    // $ANTLR start "rule__GetFeature__Group_3_3__0"
    // InternalDataflowDSL.g:3844:1: rule__GetFeature__Group_3_3__0 : rule__GetFeature__Group_3_3__0__Impl rule__GetFeature__Group_3_3__1 ;
    public final void rule__GetFeature__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3848:1: ( rule__GetFeature__Group_3_3__0__Impl rule__GetFeature__Group_3_3__1 )
            // InternalDataflowDSL.g:3849:2: rule__GetFeature__Group_3_3__0__Impl rule__GetFeature__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
            rule__GetFeature__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_3__0"


    // $ANTLR start "rule__GetFeature__Group_3_3__0__Impl"
    // InternalDataflowDSL.g:3856:1: rule__GetFeature__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__GetFeature__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3860:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3861:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3861:1: ( 'target' )
            // InternalDataflowDSL.g:3862:2: 'target'
            {
             before(grammarAccess.getGetFeatureAccess().getTargetKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getTargetKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_3__0__Impl"


    // $ANTLR start "rule__GetFeature__Group_3_3__1"
    // InternalDataflowDSL.g:3871:1: rule__GetFeature__Group_3_3__1 : rule__GetFeature__Group_3_3__1__Impl ;
    public final void rule__GetFeature__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3875:1: ( rule__GetFeature__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:3876:2: rule__GetFeature__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_3__1"


    // $ANTLR start "rule__GetFeature__Group_3_3__1__Impl"
    // InternalDataflowDSL.g:3882:1: rule__GetFeature__Group_3_3__1__Impl : ( ( rule__GetFeature__TargetAssignment_3_3_1 ) ) ;
    public final void rule__GetFeature__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3886:1: ( ( ( rule__GetFeature__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:3887:1: ( ( rule__GetFeature__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:3887:1: ( ( rule__GetFeature__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:3888:2: ( rule__GetFeature__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:3889:2: ( rule__GetFeature__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:3889:3: rule__GetFeature__TargetAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GetFeature__TargetAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGetFeatureAccess().getTargetAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__Group_3_3__1__Impl"


    // $ANTLR start "rule__SetFeature__Group__0"
    // InternalDataflowDSL.g:3898:1: rule__SetFeature__Group__0 : rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 ;
    public final void rule__SetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3902:1: ( rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 )
            // InternalDataflowDSL.g:3903:2: rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1
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
    // InternalDataflowDSL.g:3910:1: rule__SetFeature__Group__0__Impl : ( 'SetFeature' ) ;
    public final void rule__SetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3914:1: ( ( 'SetFeature' ) )
            // InternalDataflowDSL.g:3915:1: ( 'SetFeature' )
            {
            // InternalDataflowDSL.g:3915:1: ( 'SetFeature' )
            // InternalDataflowDSL.g:3916:2: 'SetFeature'
            {
             before(grammarAccess.getSetFeatureAccess().getSetFeatureKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalDataflowDSL.g:3925:1: rule__SetFeature__Group__1 : rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 ;
    public final void rule__SetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3929:1: ( rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 )
            // InternalDataflowDSL.g:3930:2: rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2
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
    // InternalDataflowDSL.g:3937:1: rule__SetFeature__Group__1__Impl : ( ( rule__SetFeature__NameAssignment_1 ) ) ;
    public final void rule__SetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3941:1: ( ( ( rule__SetFeature__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3942:1: ( ( rule__SetFeature__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3942:1: ( ( rule__SetFeature__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3943:2: ( rule__SetFeature__NameAssignment_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3944:2: ( rule__SetFeature__NameAssignment_1 )
            // InternalDataflowDSL.g:3944:3: rule__SetFeature__NameAssignment_1
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
    // InternalDataflowDSL.g:3952:1: rule__SetFeature__Group__2 : rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 ;
    public final void rule__SetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3956:1: ( rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 )
            // InternalDataflowDSL.g:3957:2: rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalDataflowDSL.g:3964:1: rule__SetFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__SetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3968:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3969:1: ( '{' )
            {
            // InternalDataflowDSL.g:3969:1: ( '{' )
            // InternalDataflowDSL.g:3970:2: '{'
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
    // InternalDataflowDSL.g:3979:1: rule__SetFeature__Group__3 : rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4 ;
    public final void rule__SetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3983:1: ( rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4 )
            // InternalDataflowDSL.g:3984:2: rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDataflowDSL.g:3991:1: rule__SetFeature__Group__3__Impl : ( ( rule__SetFeature__Alternatives_3 )* ) ;
    public final void rule__SetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3995:1: ( ( ( rule__SetFeature__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:3996:1: ( ( rule__SetFeature__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:3996:1: ( ( rule__SetFeature__Alternatives_3 )* )
            // InternalDataflowDSL.g:3997:2: ( rule__SetFeature__Alternatives_3 )*
            {
             before(grammarAccess.getSetFeatureAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:3998:2: ( rule__SetFeature__Alternatives_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34||LA36_0==38||LA36_0==52||LA36_0==54) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDataflowDSL.g:3998:3: rule__SetFeature__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SetFeature__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getSetFeatureAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:4006:1: rule__SetFeature__Group__4 : rule__SetFeature__Group__4__Impl ;
    public final void rule__SetFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4010:1: ( rule__SetFeature__Group__4__Impl )
            // InternalDataflowDSL.g:4011:2: rule__SetFeature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:4017:1: rule__SetFeature__Group__4__Impl : ( '}' ) ;
    public final void rule__SetFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4021:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4022:1: ( '}' )
            {
            // InternalDataflowDSL.g:4022:1: ( '}' )
            // InternalDataflowDSL.g:4023:2: '}'
            {
             before(grammarAccess.getSetFeatureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__SetFeature__Group_3_0__0"
    // InternalDataflowDSL.g:4033:1: rule__SetFeature__Group_3_0__0 : rule__SetFeature__Group_3_0__0__Impl rule__SetFeature__Group_3_0__1 ;
    public final void rule__SetFeature__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4037:1: ( rule__SetFeature__Group_3_0__0__Impl rule__SetFeature__Group_3_0__1 )
            // InternalDataflowDSL.g:4038:2: rule__SetFeature__Group_3_0__0__Impl rule__SetFeature__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__SetFeature__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_0__0"


    // $ANTLR start "rule__SetFeature__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:4045:1: rule__SetFeature__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__SetFeature__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4049:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:4050:1: ( 'field' )
            {
            // InternalDataflowDSL.g:4050:1: ( 'field' )
            // InternalDataflowDSL.g:4051:2: 'field'
            {
             before(grammarAccess.getSetFeatureAccess().getFieldKeyword_3_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getFieldKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_0__0__Impl"


    // $ANTLR start "rule__SetFeature__Group_3_0__1"
    // InternalDataflowDSL.g:4060:1: rule__SetFeature__Group_3_0__1 : rule__SetFeature__Group_3_0__1__Impl ;
    public final void rule__SetFeature__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4064:1: ( rule__SetFeature__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:4065:2: rule__SetFeature__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_0__1"


    // $ANTLR start "rule__SetFeature__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:4071:1: rule__SetFeature__Group_3_0__1__Impl : ( ( rule__SetFeature__ObjectFieldAssignment_3_0_1 ) ) ;
    public final void rule__SetFeature__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4075:1: ( ( ( rule__SetFeature__ObjectFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:4076:1: ( ( rule__SetFeature__ObjectFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:4076:1: ( ( rule__SetFeature__ObjectFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:4077:2: ( rule__SetFeature__ObjectFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getObjectFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:4078:2: ( rule__SetFeature__ObjectFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:4078:3: rule__SetFeature__ObjectFieldAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__ObjectFieldAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getObjectFieldAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_0__1__Impl"


    // $ANTLR start "rule__SetFeature__Group_3_1__0"
    // InternalDataflowDSL.g:4087:1: rule__SetFeature__Group_3_1__0 : rule__SetFeature__Group_3_1__0__Impl rule__SetFeature__Group_3_1__1 ;
    public final void rule__SetFeature__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4091:1: ( rule__SetFeature__Group_3_1__0__Impl rule__SetFeature__Group_3_1__1 )
            // InternalDataflowDSL.g:4092:2: rule__SetFeature__Group_3_1__0__Impl rule__SetFeature__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__SetFeature__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_1__0"


    // $ANTLR start "rule__SetFeature__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:4099:1: rule__SetFeature__Group_3_1__0__Impl : ( 'value' ) ;
    public final void rule__SetFeature__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4103:1: ( ( 'value' ) )
            // InternalDataflowDSL.g:4104:1: ( 'value' )
            {
            // InternalDataflowDSL.g:4104:1: ( 'value' )
            // InternalDataflowDSL.g:4105:2: 'value'
            {
             before(grammarAccess.getSetFeatureAccess().getValueKeyword_3_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getValueKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_1__0__Impl"


    // $ANTLR start "rule__SetFeature__Group_3_1__1"
    // InternalDataflowDSL.g:4114:1: rule__SetFeature__Group_3_1__1 : rule__SetFeature__Group_3_1__1__Impl ;
    public final void rule__SetFeature__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4118:1: ( rule__SetFeature__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:4119:2: rule__SetFeature__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_1__1"


    // $ANTLR start "rule__SetFeature__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:4125:1: rule__SetFeature__Group_3_1__1__Impl : ( ( rule__SetFeature__ValueAssignment_3_1_1 ) ) ;
    public final void rule__SetFeature__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4129:1: ( ( ( rule__SetFeature__ValueAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:4130:1: ( ( rule__SetFeature__ValueAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:4130:1: ( ( rule__SetFeature__ValueAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:4131:2: ( rule__SetFeature__ValueAssignment_3_1_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getValueAssignment_3_1_1()); 
            // InternalDataflowDSL.g:4132:2: ( rule__SetFeature__ValueAssignment_3_1_1 )
            // InternalDataflowDSL.g:4132:3: rule__SetFeature__ValueAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__ValueAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getValueAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_1__1__Impl"


    // $ANTLR start "rule__SetFeature__Group_3_2__0"
    // InternalDataflowDSL.g:4141:1: rule__SetFeature__Group_3_2__0 : rule__SetFeature__Group_3_2__0__Impl rule__SetFeature__Group_3_2__1 ;
    public final void rule__SetFeature__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4145:1: ( rule__SetFeature__Group_3_2__0__Impl rule__SetFeature__Group_3_2__1 )
            // InternalDataflowDSL.g:4146:2: rule__SetFeature__Group_3_2__0__Impl rule__SetFeature__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SetFeature__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_2__0"


    // $ANTLR start "rule__SetFeature__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:4153:1: rule__SetFeature__Group_3_2__0__Impl : ( 'feature' ) ;
    public final void rule__SetFeature__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4157:1: ( ( 'feature' ) )
            // InternalDataflowDSL.g:4158:1: ( 'feature' )
            {
            // InternalDataflowDSL.g:4158:1: ( 'feature' )
            // InternalDataflowDSL.g:4159:2: 'feature'
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureKeyword_3_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getFeatureKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_2__0__Impl"


    // $ANTLR start "rule__SetFeature__Group_3_2__1"
    // InternalDataflowDSL.g:4168:1: rule__SetFeature__Group_3_2__1 : rule__SetFeature__Group_3_2__1__Impl ;
    public final void rule__SetFeature__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4172:1: ( rule__SetFeature__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:4173:2: rule__SetFeature__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_2__1"


    // $ANTLR start "rule__SetFeature__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:4179:1: rule__SetFeature__Group_3_2__1__Impl : ( ( rule__SetFeature__FeatureAssignment_3_2_1 ) ) ;
    public final void rule__SetFeature__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4183:1: ( ( ( rule__SetFeature__FeatureAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:4184:1: ( ( rule__SetFeature__FeatureAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:4184:1: ( ( rule__SetFeature__FeatureAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:4185:2: ( rule__SetFeature__FeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureAssignment_3_2_1()); 
            // InternalDataflowDSL.g:4186:2: ( rule__SetFeature__FeatureAssignment_3_2_1 )
            // InternalDataflowDSL.g:4186:3: rule__SetFeature__FeatureAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__FeatureAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getFeatureAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_2__1__Impl"


    // $ANTLR start "rule__SetFeature__Group_3_3__0"
    // InternalDataflowDSL.g:4195:1: rule__SetFeature__Group_3_3__0 : rule__SetFeature__Group_3_3__0__Impl rule__SetFeature__Group_3_3__1 ;
    public final void rule__SetFeature__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4199:1: ( rule__SetFeature__Group_3_3__0__Impl rule__SetFeature__Group_3_3__1 )
            // InternalDataflowDSL.g:4200:2: rule__SetFeature__Group_3_3__0__Impl rule__SetFeature__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
            rule__SetFeature__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_3__0"


    // $ANTLR start "rule__SetFeature__Group_3_3__0__Impl"
    // InternalDataflowDSL.g:4207:1: rule__SetFeature__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__SetFeature__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4211:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4212:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4212:1: ( 'target' )
            // InternalDataflowDSL.g:4213:2: 'target'
            {
             before(grammarAccess.getSetFeatureAccess().getTargetKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getTargetKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_3__0__Impl"


    // $ANTLR start "rule__SetFeature__Group_3_3__1"
    // InternalDataflowDSL.g:4222:1: rule__SetFeature__Group_3_3__1 : rule__SetFeature__Group_3_3__1__Impl ;
    public final void rule__SetFeature__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4226:1: ( rule__SetFeature__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:4227:2: rule__SetFeature__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_3__1"


    // $ANTLR start "rule__SetFeature__Group_3_3__1__Impl"
    // InternalDataflowDSL.g:4233:1: rule__SetFeature__Group_3_3__1__Impl : ( ( rule__SetFeature__TargetAssignment_3_3_1 ) ) ;
    public final void rule__SetFeature__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4237:1: ( ( ( rule__SetFeature__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:4238:1: ( ( rule__SetFeature__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:4238:1: ( ( rule__SetFeature__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:4239:2: ( rule__SetFeature__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:4240:2: ( rule__SetFeature__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:4240:3: rule__SetFeature__TargetAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SetFeature__TargetAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSetFeatureAccess().getTargetAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__Group_3_3__1__Impl"


    // $ANTLR start "rule__NewContainer__Group__0"
    // InternalDataflowDSL.g:4249:1: rule__NewContainer__Group__0 : rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1 ;
    public final void rule__NewContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4253:1: ( rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1 )
            // InternalDataflowDSL.g:4254:2: rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1
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
    // InternalDataflowDSL.g:4261:1: rule__NewContainer__Group__0__Impl : ( 'NewContainer' ) ;
    public final void rule__NewContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4265:1: ( ( 'NewContainer' ) )
            // InternalDataflowDSL.g:4266:1: ( 'NewContainer' )
            {
            // InternalDataflowDSL.g:4266:1: ( 'NewContainer' )
            // InternalDataflowDSL.g:4267:2: 'NewContainer'
            {
             before(grammarAccess.getNewContainerAccess().getNewContainerKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4276:1: rule__NewContainer__Group__1 : rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2 ;
    public final void rule__NewContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4280:1: ( rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2 )
            // InternalDataflowDSL.g:4281:2: rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2
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
    // InternalDataflowDSL.g:4288:1: rule__NewContainer__Group__1__Impl : ( ( rule__NewContainer__NameAssignment_1 ) ) ;
    public final void rule__NewContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4292:1: ( ( ( rule__NewContainer__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4293:1: ( ( rule__NewContainer__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4293:1: ( ( rule__NewContainer__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4294:2: ( rule__NewContainer__NameAssignment_1 )
            {
             before(grammarAccess.getNewContainerAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4295:2: ( rule__NewContainer__NameAssignment_1 )
            // InternalDataflowDSL.g:4295:3: rule__NewContainer__NameAssignment_1
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
    // InternalDataflowDSL.g:4303:1: rule__NewContainer__Group__2 : rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3 ;
    public final void rule__NewContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4307:1: ( rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3 )
            // InternalDataflowDSL.g:4308:2: rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalDataflowDSL.g:4315:1: rule__NewContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__NewContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4319:1: ( ( '{' ) )
            // InternalDataflowDSL.g:4320:1: ( '{' )
            {
            // InternalDataflowDSL.g:4320:1: ( '{' )
            // InternalDataflowDSL.g:4321:2: '{'
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
    // InternalDataflowDSL.g:4330:1: rule__NewContainer__Group__3 : rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4 ;
    public final void rule__NewContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4334:1: ( rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4 )
            // InternalDataflowDSL.g:4335:2: rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalDataflowDSL.g:4342:1: rule__NewContainer__Group__3__Impl : ( ( rule__NewContainer__Group_3__0 )? ) ;
    public final void rule__NewContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4346:1: ( ( ( rule__NewContainer__Group_3__0 )? ) )
            // InternalDataflowDSL.g:4347:1: ( ( rule__NewContainer__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:4347:1: ( ( rule__NewContainer__Group_3__0 )? )
            // InternalDataflowDSL.g:4348:2: ( rule__NewContainer__Group_3__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_3()); 
            // InternalDataflowDSL.g:4349:2: ( rule__NewContainer__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataflowDSL.g:4349:3: rule__NewContainer__Group_3__0
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
    // InternalDataflowDSL.g:4357:1: rule__NewContainer__Group__4 : rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5 ;
    public final void rule__NewContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4361:1: ( rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5 )
            // InternalDataflowDSL.g:4362:2: rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalDataflowDSL.g:4369:1: rule__NewContainer__Group__4__Impl : ( ( rule__NewContainer__Group_4__0 )? ) ;
    public final void rule__NewContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4373:1: ( ( ( rule__NewContainer__Group_4__0 )? ) )
            // InternalDataflowDSL.g:4374:1: ( ( rule__NewContainer__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:4374:1: ( ( rule__NewContainer__Group_4__0 )? )
            // InternalDataflowDSL.g:4375:2: ( rule__NewContainer__Group_4__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_4()); 
            // InternalDataflowDSL.g:4376:2: ( rule__NewContainer__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataflowDSL.g:4376:3: rule__NewContainer__Group_4__0
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
    // InternalDataflowDSL.g:4384:1: rule__NewContainer__Group__5 : rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6 ;
    public final void rule__NewContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4388:1: ( rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6 )
            // InternalDataflowDSL.g:4389:2: rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalDataflowDSL.g:4396:1: rule__NewContainer__Group__5__Impl : ( ( rule__NewContainer__Group_5__0 )? ) ;
    public final void rule__NewContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4400:1: ( ( ( rule__NewContainer__Group_5__0 )? ) )
            // InternalDataflowDSL.g:4401:1: ( ( rule__NewContainer__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:4401:1: ( ( rule__NewContainer__Group_5__0 )? )
            // InternalDataflowDSL.g:4402:2: ( rule__NewContainer__Group_5__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_5()); 
            // InternalDataflowDSL.g:4403:2: ( rule__NewContainer__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataflowDSL.g:4403:3: rule__NewContainer__Group_5__0
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
    // InternalDataflowDSL.g:4411:1: rule__NewContainer__Group__6 : rule__NewContainer__Group__6__Impl ;
    public final void rule__NewContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4415:1: ( rule__NewContainer__Group__6__Impl )
            // InternalDataflowDSL.g:4416:2: rule__NewContainer__Group__6__Impl
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
    // InternalDataflowDSL.g:4422:1: rule__NewContainer__Group__6__Impl : ( '}' ) ;
    public final void rule__NewContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4426:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4427:1: ( '}' )
            {
            // InternalDataflowDSL.g:4427:1: ( '}' )
            // InternalDataflowDSL.g:4428:2: '}'
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
    // InternalDataflowDSL.g:4438:1: rule__NewContainer__Group_3__0 : rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1 ;
    public final void rule__NewContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4442:1: ( rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1 )
            // InternalDataflowDSL.g:4443:2: rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1
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
    // InternalDataflowDSL.g:4450:1: rule__NewContainer__Group_3__0__Impl : ( 'field' ) ;
    public final void rule__NewContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4454:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:4455:1: ( 'field' )
            {
            // InternalDataflowDSL.g:4455:1: ( 'field' )
            // InternalDataflowDSL.g:4456:2: 'field'
            {
             before(grammarAccess.getNewContainerAccess().getFieldKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNewContainerAccess().getFieldKeyword_3_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:4465:1: rule__NewContainer__Group_3__1 : rule__NewContainer__Group_3__1__Impl ;
    public final void rule__NewContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4469:1: ( rule__NewContainer__Group_3__1__Impl )
            // InternalDataflowDSL.g:4470:2: rule__NewContainer__Group_3__1__Impl
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
    // InternalDataflowDSL.g:4476:1: rule__NewContainer__Group_3__1__Impl : ( ( rule__NewContainer__ListFieldAssignment_3_1 ) ) ;
    public final void rule__NewContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4480:1: ( ( ( rule__NewContainer__ListFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:4481:1: ( ( rule__NewContainer__ListFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:4481:1: ( ( rule__NewContainer__ListFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:4482:2: ( rule__NewContainer__ListFieldAssignment_3_1 )
            {
             before(grammarAccess.getNewContainerAccess().getListFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:4483:2: ( rule__NewContainer__ListFieldAssignment_3_1 )
            // InternalDataflowDSL.g:4483:3: rule__NewContainer__ListFieldAssignment_3_1
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
    // InternalDataflowDSL.g:4492:1: rule__NewContainer__Group_4__0 : rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1 ;
    public final void rule__NewContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4496:1: ( rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1 )
            // InternalDataflowDSL.g:4497:2: rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDataflowDSL.g:4504:1: rule__NewContainer__Group_4__0__Impl : ( 'containerType' ) ;
    public final void rule__NewContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4508:1: ( ( 'containerType' ) )
            // InternalDataflowDSL.g:4509:1: ( 'containerType' )
            {
            // InternalDataflowDSL.g:4509:1: ( 'containerType' )
            // InternalDataflowDSL.g:4510:2: 'containerType'
            {
             before(grammarAccess.getNewContainerAccess().getContainerTypeKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4519:1: rule__NewContainer__Group_4__1 : rule__NewContainer__Group_4__1__Impl ;
    public final void rule__NewContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4523:1: ( rule__NewContainer__Group_4__1__Impl )
            // InternalDataflowDSL.g:4524:2: rule__NewContainer__Group_4__1__Impl
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
    // InternalDataflowDSL.g:4530:1: rule__NewContainer__Group_4__1__Impl : ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) ) ;
    public final void rule__NewContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4534:1: ( ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:4535:1: ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:4535:1: ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) )
            // InternalDataflowDSL.g:4536:2: ( rule__NewContainer__ContainerTypeAssignment_4_1 )
            {
             before(grammarAccess.getNewContainerAccess().getContainerTypeAssignment_4_1()); 
            // InternalDataflowDSL.g:4537:2: ( rule__NewContainer__ContainerTypeAssignment_4_1 )
            // InternalDataflowDSL.g:4537:3: rule__NewContainer__ContainerTypeAssignment_4_1
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
    // InternalDataflowDSL.g:4546:1: rule__NewContainer__Group_5__0 : rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1 ;
    public final void rule__NewContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4550:1: ( rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1 )
            // InternalDataflowDSL.g:4551:2: rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1
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
    // InternalDataflowDSL.g:4558:1: rule__NewContainer__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__NewContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4562:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4563:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4563:1: ( 'target' )
            // InternalDataflowDSL.g:4564:2: 'target'
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
    // InternalDataflowDSL.g:4573:1: rule__NewContainer__Group_5__1 : rule__NewContainer__Group_5__1__Impl ;
    public final void rule__NewContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4577:1: ( rule__NewContainer__Group_5__1__Impl )
            // InternalDataflowDSL.g:4578:2: rule__NewContainer__Group_5__1__Impl
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
    // InternalDataflowDSL.g:4584:1: rule__NewContainer__Group_5__1__Impl : ( ( rule__NewContainer__TargetAssignment_5_1 ) ) ;
    public final void rule__NewContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4588:1: ( ( ( rule__NewContainer__TargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:4589:1: ( ( rule__NewContainer__TargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:4589:1: ( ( rule__NewContainer__TargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:4590:2: ( rule__NewContainer__TargetAssignment_5_1 )
            {
             before(grammarAccess.getNewContainerAccess().getTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:4591:2: ( rule__NewContainer__TargetAssignment_5_1 )
            // InternalDataflowDSL.g:4591:3: rule__NewContainer__TargetAssignment_5_1
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
    // InternalDataflowDSL.g:4600:1: rule__AddToContainer__Group__0 : rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1 ;
    public final void rule__AddToContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4604:1: ( rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1 )
            // InternalDataflowDSL.g:4605:2: rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1
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
    // InternalDataflowDSL.g:4612:1: rule__AddToContainer__Group__0__Impl : ( 'AddToContainer' ) ;
    public final void rule__AddToContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4616:1: ( ( 'AddToContainer' ) )
            // InternalDataflowDSL.g:4617:1: ( 'AddToContainer' )
            {
            // InternalDataflowDSL.g:4617:1: ( 'AddToContainer' )
            // InternalDataflowDSL.g:4618:2: 'AddToContainer'
            {
             before(grammarAccess.getAddToContainerAccess().getAddToContainerKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4627:1: rule__AddToContainer__Group__1 : rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2 ;
    public final void rule__AddToContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4631:1: ( rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2 )
            // InternalDataflowDSL.g:4632:2: rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2
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
    // InternalDataflowDSL.g:4639:1: rule__AddToContainer__Group__1__Impl : ( ( rule__AddToContainer__NameAssignment_1 ) ) ;
    public final void rule__AddToContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4643:1: ( ( ( rule__AddToContainer__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4644:1: ( ( rule__AddToContainer__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4644:1: ( ( rule__AddToContainer__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4645:2: ( rule__AddToContainer__NameAssignment_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4646:2: ( rule__AddToContainer__NameAssignment_1 )
            // InternalDataflowDSL.g:4646:3: rule__AddToContainer__NameAssignment_1
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
    // InternalDataflowDSL.g:4654:1: rule__AddToContainer__Group__2 : rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3 ;
    public final void rule__AddToContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4658:1: ( rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3 )
            // InternalDataflowDSL.g:4659:2: rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalDataflowDSL.g:4666:1: rule__AddToContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__AddToContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4670:1: ( ( '{' ) )
            // InternalDataflowDSL.g:4671:1: ( '{' )
            {
            // InternalDataflowDSL.g:4671:1: ( '{' )
            // InternalDataflowDSL.g:4672:2: '{'
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
    // InternalDataflowDSL.g:4681:1: rule__AddToContainer__Group__3 : rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4 ;
    public final void rule__AddToContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4685:1: ( rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4 )
            // InternalDataflowDSL.g:4686:2: rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalDataflowDSL.g:4693:1: rule__AddToContainer__Group__3__Impl : ( ( rule__AddToContainer__Alternatives_3 )* ) ;
    public final void rule__AddToContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4697:1: ( ( ( rule__AddToContainer__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:4698:1: ( ( rule__AddToContainer__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:4698:1: ( ( rule__AddToContainer__Alternatives_3 )* )
            // InternalDataflowDSL.g:4699:2: ( rule__AddToContainer__Alternatives_3 )*
            {
             before(grammarAccess.getAddToContainerAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:4700:2: ( rule__AddToContainer__Alternatives_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34||LA40_0==38||LA40_0==54||LA40_0==58) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDataflowDSL.g:4700:3: rule__AddToContainer__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__AddToContainer__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getAddToContainerAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:4708:1: rule__AddToContainer__Group__4 : rule__AddToContainer__Group__4__Impl ;
    public final void rule__AddToContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4712:1: ( rule__AddToContainer__Group__4__Impl )
            // InternalDataflowDSL.g:4713:2: rule__AddToContainer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:4719:1: rule__AddToContainer__Group__4__Impl : ( '}' ) ;
    public final void rule__AddToContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4723:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4724:1: ( '}' )
            {
            // InternalDataflowDSL.g:4724:1: ( '}' )
            // InternalDataflowDSL.g:4725:2: '}'
            {
             before(grammarAccess.getAddToContainerAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__AddToContainer__Group_3_0__0"
    // InternalDataflowDSL.g:4735:1: rule__AddToContainer__Group_3_0__0 : rule__AddToContainer__Group_3_0__0__Impl rule__AddToContainer__Group_3_0__1 ;
    public final void rule__AddToContainer__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4739:1: ( rule__AddToContainer__Group_3_0__0__Impl rule__AddToContainer__Group_3_0__1 )
            // InternalDataflowDSL.g:4740:2: rule__AddToContainer__Group_3_0__0__Impl rule__AddToContainer__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__AddToContainer__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_0__0"


    // $ANTLR start "rule__AddToContainer__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:4747:1: rule__AddToContainer__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__AddToContainer__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4751:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:4752:1: ( 'field' )
            {
            // InternalDataflowDSL.g:4752:1: ( 'field' )
            // InternalDataflowDSL.g:4753:2: 'field'
            {
             before(grammarAccess.getAddToContainerAccess().getFieldKeyword_3_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getFieldKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_0__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3_0__1"
    // InternalDataflowDSL.g:4762:1: rule__AddToContainer__Group_3_0__1 : rule__AddToContainer__Group_3_0__1__Impl ;
    public final void rule__AddToContainer__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4766:1: ( rule__AddToContainer__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:4767:2: rule__AddToContainer__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_0__1"


    // $ANTLR start "rule__AddToContainer__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:4773:1: rule__AddToContainer__Group_3_0__1__Impl : ( ( rule__AddToContainer__ListFieldAssignment_3_0_1 ) ) ;
    public final void rule__AddToContainer__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4777:1: ( ( ( rule__AddToContainer__ListFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:4778:1: ( ( rule__AddToContainer__ListFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:4778:1: ( ( rule__AddToContainer__ListFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:4779:2: ( rule__AddToContainer__ListFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getListFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:4780:2: ( rule__AddToContainer__ListFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:4780:3: rule__AddToContainer__ListFieldAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__ListFieldAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getListFieldAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_0__1__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3_1__0"
    // InternalDataflowDSL.g:4789:1: rule__AddToContainer__Group_3_1__0 : rule__AddToContainer__Group_3_1__0__Impl rule__AddToContainer__Group_3_1__1 ;
    public final void rule__AddToContainer__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4793:1: ( rule__AddToContainer__Group_3_1__0__Impl rule__AddToContainer__Group_3_1__1 )
            // InternalDataflowDSL.g:4794:2: rule__AddToContainer__Group_3_1__0__Impl rule__AddToContainer__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__AddToContainer__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_1__0"


    // $ANTLR start "rule__AddToContainer__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:4801:1: rule__AddToContainer__Group_3_1__0__Impl : ( 'value' ) ;
    public final void rule__AddToContainer__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4805:1: ( ( 'value' ) )
            // InternalDataflowDSL.g:4806:1: ( 'value' )
            {
            // InternalDataflowDSL.g:4806:1: ( 'value' )
            // InternalDataflowDSL.g:4807:2: 'value'
            {
             before(grammarAccess.getAddToContainerAccess().getValueKeyword_3_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getValueKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_1__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3_1__1"
    // InternalDataflowDSL.g:4816:1: rule__AddToContainer__Group_3_1__1 : rule__AddToContainer__Group_3_1__1__Impl ;
    public final void rule__AddToContainer__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4820:1: ( rule__AddToContainer__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:4821:2: rule__AddToContainer__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_1__1"


    // $ANTLR start "rule__AddToContainer__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:4827:1: rule__AddToContainer__Group_3_1__1__Impl : ( ( rule__AddToContainer__ValueAssignment_3_1_1 ) ) ;
    public final void rule__AddToContainer__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4831:1: ( ( ( rule__AddToContainer__ValueAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:4832:1: ( ( rule__AddToContainer__ValueAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:4832:1: ( ( rule__AddToContainer__ValueAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:4833:2: ( rule__AddToContainer__ValueAssignment_3_1_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getValueAssignment_3_1_1()); 
            // InternalDataflowDSL.g:4834:2: ( rule__AddToContainer__ValueAssignment_3_1_1 )
            // InternalDataflowDSL.g:4834:3: rule__AddToContainer__ValueAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__ValueAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getValueAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_1__1__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3_2__0"
    // InternalDataflowDSL.g:4843:1: rule__AddToContainer__Group_3_2__0 : rule__AddToContainer__Group_3_2__0__Impl rule__AddToContainer__Group_3_2__1 ;
    public final void rule__AddToContainer__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4847:1: ( rule__AddToContainer__Group_3_2__0__Impl rule__AddToContainer__Group_3_2__1 )
            // InternalDataflowDSL.g:4848:2: rule__AddToContainer__Group_3_2__0__Impl rule__AddToContainer__Group_3_2__1
            {
            pushFollow(FOLLOW_13);
            rule__AddToContainer__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_2__0"


    // $ANTLR start "rule__AddToContainer__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:4855:1: rule__AddToContainer__Group_3_2__0__Impl : ( 'position' ) ;
    public final void rule__AddToContainer__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4859:1: ( ( 'position' ) )
            // InternalDataflowDSL.g:4860:1: ( 'position' )
            {
            // InternalDataflowDSL.g:4860:1: ( 'position' )
            // InternalDataflowDSL.g:4861:2: 'position'
            {
             before(grammarAccess.getAddToContainerAccess().getPositionKeyword_3_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getPositionKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_2__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3_2__1"
    // InternalDataflowDSL.g:4870:1: rule__AddToContainer__Group_3_2__1 : rule__AddToContainer__Group_3_2__1__Impl ;
    public final void rule__AddToContainer__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4874:1: ( rule__AddToContainer__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:4875:2: rule__AddToContainer__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_2__1"


    // $ANTLR start "rule__AddToContainer__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:4881:1: rule__AddToContainer__Group_3_2__1__Impl : ( ( rule__AddToContainer__PositionAssignment_3_2_1 ) ) ;
    public final void rule__AddToContainer__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4885:1: ( ( ( rule__AddToContainer__PositionAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:4886:1: ( ( rule__AddToContainer__PositionAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:4886:1: ( ( rule__AddToContainer__PositionAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:4887:2: ( rule__AddToContainer__PositionAssignment_3_2_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getPositionAssignment_3_2_1()); 
            // InternalDataflowDSL.g:4888:2: ( rule__AddToContainer__PositionAssignment_3_2_1 )
            // InternalDataflowDSL.g:4888:3: rule__AddToContainer__PositionAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__PositionAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getPositionAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_2__1__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3_3__0"
    // InternalDataflowDSL.g:4897:1: rule__AddToContainer__Group_3_3__0 : rule__AddToContainer__Group_3_3__0__Impl rule__AddToContainer__Group_3_3__1 ;
    public final void rule__AddToContainer__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4901:1: ( rule__AddToContainer__Group_3_3__0__Impl rule__AddToContainer__Group_3_3__1 )
            // InternalDataflowDSL.g:4902:2: rule__AddToContainer__Group_3_3__0__Impl rule__AddToContainer__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
            rule__AddToContainer__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_3__0"


    // $ANTLR start "rule__AddToContainer__Group_3_3__0__Impl"
    // InternalDataflowDSL.g:4909:1: rule__AddToContainer__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__AddToContainer__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4913:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4914:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4914:1: ( 'target' )
            // InternalDataflowDSL.g:4915:2: 'target'
            {
             before(grammarAccess.getAddToContainerAccess().getTargetKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getTargetKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_3__0__Impl"


    // $ANTLR start "rule__AddToContainer__Group_3_3__1"
    // InternalDataflowDSL.g:4924:1: rule__AddToContainer__Group_3_3__1 : rule__AddToContainer__Group_3_3__1__Impl ;
    public final void rule__AddToContainer__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4928:1: ( rule__AddToContainer__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:4929:2: rule__AddToContainer__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_3__1"


    // $ANTLR start "rule__AddToContainer__Group_3_3__1__Impl"
    // InternalDataflowDSL.g:4935:1: rule__AddToContainer__Group_3_3__1__Impl : ( ( rule__AddToContainer__TargetAssignment_3_3_1 ) ) ;
    public final void rule__AddToContainer__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4939:1: ( ( ( rule__AddToContainer__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:4940:1: ( ( rule__AddToContainer__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:4940:1: ( ( rule__AddToContainer__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:4941:2: ( rule__AddToContainer__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:4942:2: ( rule__AddToContainer__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:4942:3: rule__AddToContainer__TargetAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AddToContainer__TargetAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToContainerAccess().getTargetAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__Group_3_3__1__Impl"


    // $ANTLR start "rule__ForEach__Group__0"
    // InternalDataflowDSL.g:4951:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4955:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalDataflowDSL.g:4956:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
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
    // InternalDataflowDSL.g:4963:1: rule__ForEach__Group__0__Impl : ( 'ForEach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4967:1: ( ( 'ForEach' ) )
            // InternalDataflowDSL.g:4968:1: ( 'ForEach' )
            {
            // InternalDataflowDSL.g:4968:1: ( 'ForEach' )
            // InternalDataflowDSL.g:4969:2: 'ForEach'
            {
             before(grammarAccess.getForEachAccess().getForEachKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalDataflowDSL.g:4978:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4982:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalDataflowDSL.g:4983:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalDataflowDSL.g:4990:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__NameAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4994:1: ( ( ( rule__ForEach__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4995:1: ( ( rule__ForEach__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4995:1: ( ( rule__ForEach__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4996:2: ( rule__ForEach__NameAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4997:2: ( rule__ForEach__NameAssignment_1 )
            // InternalDataflowDSL.g:4997:3: rule__ForEach__NameAssignment_1
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
    // InternalDataflowDSL.g:5005:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5009:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalDataflowDSL.g:5010:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalDataflowDSL.g:5017:1: rule__ForEach__Group__2__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5021:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5022:1: ( '{' )
            {
            // InternalDataflowDSL.g:5022:1: ( '{' )
            // InternalDataflowDSL.g:5023:2: '{'
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
    // InternalDataflowDSL.g:5032:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5036:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalDataflowDSL.g:5037:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalDataflowDSL.g:5044:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__Alternatives_3 )* ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5048:1: ( ( ( rule__ForEach__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:5049:1: ( ( rule__ForEach__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:5049:1: ( ( rule__ForEach__Alternatives_3 )* )
            // InternalDataflowDSL.g:5050:2: ( rule__ForEach__Alternatives_3 )*
            {
             before(grammarAccess.getForEachAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:5051:2: ( rule__ForEach__Alternatives_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==38||(LA41_0>=60 && LA41_0<=62)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDataflowDSL.g:5051:3: rule__ForEach__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ForEach__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getForEachAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:5059:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5063:1: ( rule__ForEach__Group__4__Impl )
            // InternalDataflowDSL.g:5064:2: rule__ForEach__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:5070:1: rule__ForEach__Group__4__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5074:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5075:1: ( '}' )
            {
            // InternalDataflowDSL.g:5075:1: ( '}' )
            // InternalDataflowDSL.g:5076:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ForEach__Group_3_0__0"
    // InternalDataflowDSL.g:5086:1: rule__ForEach__Group_3_0__0 : rule__ForEach__Group_3_0__0__Impl rule__ForEach__Group_3_0__1 ;
    public final void rule__ForEach__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5090:1: ( rule__ForEach__Group_3_0__0__Impl rule__ForEach__Group_3_0__1 )
            // InternalDataflowDSL.g:5091:2: rule__ForEach__Group_3_0__0__Impl rule__ForEach__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ForEach__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_0__0"


    // $ANTLR start "rule__ForEach__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:5098:1: rule__ForEach__Group_3_0__0__Impl : ( 'listField' ) ;
    public final void rule__ForEach__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5102:1: ( ( 'listField' ) )
            // InternalDataflowDSL.g:5103:1: ( 'listField' )
            {
            // InternalDataflowDSL.g:5103:1: ( 'listField' )
            // InternalDataflowDSL.g:5104:2: 'listField'
            {
             before(grammarAccess.getForEachAccess().getListFieldKeyword_3_0_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getListFieldKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_0__0__Impl"


    // $ANTLR start "rule__ForEach__Group_3_0__1"
    // InternalDataflowDSL.g:5113:1: rule__ForEach__Group_3_0__1 : rule__ForEach__Group_3_0__1__Impl ;
    public final void rule__ForEach__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5117:1: ( rule__ForEach__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:5118:2: rule__ForEach__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_0__1"


    // $ANTLR start "rule__ForEach__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:5124:1: rule__ForEach__Group_3_0__1__Impl : ( ( rule__ForEach__ListFieldAssignment_3_0_1 ) ) ;
    public final void rule__ForEach__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5128:1: ( ( ( rule__ForEach__ListFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:5129:1: ( ( rule__ForEach__ListFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:5129:1: ( ( rule__ForEach__ListFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:5130:2: ( rule__ForEach__ListFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getForEachAccess().getListFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:5131:2: ( rule__ForEach__ListFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:5131:3: rule__ForEach__ListFieldAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__ListFieldAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getListFieldAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_0__1__Impl"


    // $ANTLR start "rule__ForEach__Group_3_1__0"
    // InternalDataflowDSL.g:5140:1: rule__ForEach__Group_3_1__0 : rule__ForEach__Group_3_1__0__Impl rule__ForEach__Group_3_1__1 ;
    public final void rule__ForEach__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5144:1: ( rule__ForEach__Group_3_1__0__Impl rule__ForEach__Group_3_1__1 )
            // InternalDataflowDSL.g:5145:2: rule__ForEach__Group_3_1__0__Impl rule__ForEach__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ForEach__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_1__0"


    // $ANTLR start "rule__ForEach__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:5152:1: rule__ForEach__Group_3_1__0__Impl : ( 'itemField' ) ;
    public final void rule__ForEach__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5156:1: ( ( 'itemField' ) )
            // InternalDataflowDSL.g:5157:1: ( 'itemField' )
            {
            // InternalDataflowDSL.g:5157:1: ( 'itemField' )
            // InternalDataflowDSL.g:5158:2: 'itemField'
            {
             before(grammarAccess.getForEachAccess().getItemFieldKeyword_3_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getItemFieldKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_1__0__Impl"


    // $ANTLR start "rule__ForEach__Group_3_1__1"
    // InternalDataflowDSL.g:5167:1: rule__ForEach__Group_3_1__1 : rule__ForEach__Group_3_1__1__Impl ;
    public final void rule__ForEach__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5171:1: ( rule__ForEach__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:5172:2: rule__ForEach__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_1__1"


    // $ANTLR start "rule__ForEach__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:5178:1: rule__ForEach__Group_3_1__1__Impl : ( ( rule__ForEach__ItemFieldAssignment_3_1_1 ) ) ;
    public final void rule__ForEach__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5182:1: ( ( ( rule__ForEach__ItemFieldAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:5183:1: ( ( rule__ForEach__ItemFieldAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:5183:1: ( ( rule__ForEach__ItemFieldAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:5184:2: ( rule__ForEach__ItemFieldAssignment_3_1_1 )
            {
             before(grammarAccess.getForEachAccess().getItemFieldAssignment_3_1_1()); 
            // InternalDataflowDSL.g:5185:2: ( rule__ForEach__ItemFieldAssignment_3_1_1 )
            // InternalDataflowDSL.g:5185:3: rule__ForEach__ItemFieldAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__ItemFieldAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getItemFieldAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_1__1__Impl"


    // $ANTLR start "rule__ForEach__Group_3_2__0"
    // InternalDataflowDSL.g:5194:1: rule__ForEach__Group_3_2__0 : rule__ForEach__Group_3_2__0__Impl rule__ForEach__Group_3_2__1 ;
    public final void rule__ForEach__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5198:1: ( rule__ForEach__Group_3_2__0__Impl rule__ForEach__Group_3_2__1 )
            // InternalDataflowDSL.g:5199:2: rule__ForEach__Group_3_2__0__Impl rule__ForEach__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ForEach__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_2__0"


    // $ANTLR start "rule__ForEach__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:5206:1: rule__ForEach__Group_3_2__0__Impl : ( 'positionField' ) ;
    public final void rule__ForEach__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5210:1: ( ( 'positionField' ) )
            // InternalDataflowDSL.g:5211:1: ( 'positionField' )
            {
            // InternalDataflowDSL.g:5211:1: ( 'positionField' )
            // InternalDataflowDSL.g:5212:2: 'positionField'
            {
             before(grammarAccess.getForEachAccess().getPositionFieldKeyword_3_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getPositionFieldKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_2__0__Impl"


    // $ANTLR start "rule__ForEach__Group_3_2__1"
    // InternalDataflowDSL.g:5221:1: rule__ForEach__Group_3_2__1 : rule__ForEach__Group_3_2__1__Impl ;
    public final void rule__ForEach__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5225:1: ( rule__ForEach__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:5226:2: rule__ForEach__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_2__1"


    // $ANTLR start "rule__ForEach__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:5232:1: rule__ForEach__Group_3_2__1__Impl : ( ( rule__ForEach__PositionFieldAssignment_3_2_1 ) ) ;
    public final void rule__ForEach__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5236:1: ( ( ( rule__ForEach__PositionFieldAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:5237:1: ( ( rule__ForEach__PositionFieldAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:5237:1: ( ( rule__ForEach__PositionFieldAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:5238:2: ( rule__ForEach__PositionFieldAssignment_3_2_1 )
            {
             before(grammarAccess.getForEachAccess().getPositionFieldAssignment_3_2_1()); 
            // InternalDataflowDSL.g:5239:2: ( rule__ForEach__PositionFieldAssignment_3_2_1 )
            // InternalDataflowDSL.g:5239:3: rule__ForEach__PositionFieldAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__PositionFieldAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getPositionFieldAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_2__1__Impl"


    // $ANTLR start "rule__ForEach__Group_3_3__0"
    // InternalDataflowDSL.g:5248:1: rule__ForEach__Group_3_3__0 : rule__ForEach__Group_3_3__0__Impl rule__ForEach__Group_3_3__1 ;
    public final void rule__ForEach__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5252:1: ( rule__ForEach__Group_3_3__0__Impl rule__ForEach__Group_3_3__1 )
            // InternalDataflowDSL.g:5253:2: rule__ForEach__Group_3_3__0__Impl rule__ForEach__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ForEach__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_3__0"


    // $ANTLR start "rule__ForEach__Group_3_3__0__Impl"
    // InternalDataflowDSL.g:5260:1: rule__ForEach__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__ForEach__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5264:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5265:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5265:1: ( 'target' )
            // InternalDataflowDSL.g:5266:2: 'target'
            {
             before(grammarAccess.getForEachAccess().getTargetKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getTargetKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_3__0__Impl"


    // $ANTLR start "rule__ForEach__Group_3_3__1"
    // InternalDataflowDSL.g:5275:1: rule__ForEach__Group_3_3__1 : rule__ForEach__Group_3_3__1__Impl ;
    public final void rule__ForEach__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5279:1: ( rule__ForEach__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:5280:2: rule__ForEach__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_3__1"


    // $ANTLR start "rule__ForEach__Group_3_3__1__Impl"
    // InternalDataflowDSL.g:5286:1: rule__ForEach__Group_3_3__1__Impl : ( ( rule__ForEach__TargetAssignment_3_3_1 ) ) ;
    public final void rule__ForEach__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5290:1: ( ( ( rule__ForEach__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:5291:1: ( ( rule__ForEach__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:5291:1: ( ( rule__ForEach__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:5292:2: ( rule__ForEach__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getForEachAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:5293:2: ( rule__ForEach__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:5293:3: rule__ForEach__TargetAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__TargetAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getTargetAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__Group_3_3__1__Impl"


    // $ANTLR start "rule__CollectBy__Group__0"
    // InternalDataflowDSL.g:5302:1: rule__CollectBy__Group__0 : rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1 ;
    public final void rule__CollectBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5306:1: ( rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1 )
            // InternalDataflowDSL.g:5307:2: rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1
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
    // InternalDataflowDSL.g:5314:1: rule__CollectBy__Group__0__Impl : ( 'CollectBy' ) ;
    public final void rule__CollectBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5318:1: ( ( 'CollectBy' ) )
            // InternalDataflowDSL.g:5319:1: ( 'CollectBy' )
            {
            // InternalDataflowDSL.g:5319:1: ( 'CollectBy' )
            // InternalDataflowDSL.g:5320:2: 'CollectBy'
            {
             before(grammarAccess.getCollectByAccess().getCollectByKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalDataflowDSL.g:5329:1: rule__CollectBy__Group__1 : rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2 ;
    public final void rule__CollectBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5333:1: ( rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2 )
            // InternalDataflowDSL.g:5334:2: rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2
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
    // InternalDataflowDSL.g:5341:1: rule__CollectBy__Group__1__Impl : ( ( rule__CollectBy__NameAssignment_1 ) ) ;
    public final void rule__CollectBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5345:1: ( ( ( rule__CollectBy__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:5346:1: ( ( rule__CollectBy__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:5346:1: ( ( rule__CollectBy__NameAssignment_1 ) )
            // InternalDataflowDSL.g:5347:2: ( rule__CollectBy__NameAssignment_1 )
            {
             before(grammarAccess.getCollectByAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:5348:2: ( rule__CollectBy__NameAssignment_1 )
            // InternalDataflowDSL.g:5348:3: rule__CollectBy__NameAssignment_1
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
    // InternalDataflowDSL.g:5356:1: rule__CollectBy__Group__2 : rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3 ;
    public final void rule__CollectBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5360:1: ( rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3 )
            // InternalDataflowDSL.g:5361:2: rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalDataflowDSL.g:5368:1: rule__CollectBy__Group__2__Impl : ( '{' ) ;
    public final void rule__CollectBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5372:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5373:1: ( '{' )
            {
            // InternalDataflowDSL.g:5373:1: ( '{' )
            // InternalDataflowDSL.g:5374:2: '{'
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
    // InternalDataflowDSL.g:5383:1: rule__CollectBy__Group__3 : rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4 ;
    public final void rule__CollectBy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5387:1: ( rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4 )
            // InternalDataflowDSL.g:5388:2: rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalDataflowDSL.g:5395:1: rule__CollectBy__Group__3__Impl : ( ( rule__CollectBy__Alternatives_3 )* ) ;
    public final void rule__CollectBy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5399:1: ( ( ( rule__CollectBy__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:5400:1: ( ( rule__CollectBy__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:5400:1: ( ( rule__CollectBy__Alternatives_3 )* )
            // InternalDataflowDSL.g:5401:2: ( rule__CollectBy__Alternatives_3 )*
            {
             before(grammarAccess.getCollectByAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:5402:2: ( rule__CollectBy__Alternatives_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==38||LA42_0==64) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDataflowDSL.g:5402:3: rule__CollectBy__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CollectBy__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getCollectByAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:5410:1: rule__CollectBy__Group__4 : rule__CollectBy__Group__4__Impl ;
    public final void rule__CollectBy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5414:1: ( rule__CollectBy__Group__4__Impl )
            // InternalDataflowDSL.g:5415:2: rule__CollectBy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:5421:1: rule__CollectBy__Group__4__Impl : ( '}' ) ;
    public final void rule__CollectBy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5425:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5426:1: ( '}' )
            {
            // InternalDataflowDSL.g:5426:1: ( '}' )
            // InternalDataflowDSL.g:5427:2: '}'
            {
             before(grammarAccess.getCollectByAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__CollectBy__Group_3_0__0"
    // InternalDataflowDSL.g:5437:1: rule__CollectBy__Group_3_0__0 : rule__CollectBy__Group_3_0__0__Impl rule__CollectBy__Group_3_0__1 ;
    public final void rule__CollectBy__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5441:1: ( rule__CollectBy__Group_3_0__0__Impl rule__CollectBy__Group_3_0__1 )
            // InternalDataflowDSL.g:5442:2: rule__CollectBy__Group_3_0__0__Impl rule__CollectBy__Group_3_0__1
            {
            pushFollow(FOLLOW_13);
            rule__CollectBy__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_0__0"


    // $ANTLR start "rule__CollectBy__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:5449:1: rule__CollectBy__Group_3_0__0__Impl : ( 'collectBy' ) ;
    public final void rule__CollectBy__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5453:1: ( ( 'collectBy' ) )
            // InternalDataflowDSL.g:5454:1: ( 'collectBy' )
            {
            // InternalDataflowDSL.g:5454:1: ( 'collectBy' )
            // InternalDataflowDSL.g:5455:2: 'collectBy'
            {
             before(grammarAccess.getCollectByAccess().getCollectByKeyword_3_0_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getCollectByKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_0__0__Impl"


    // $ANTLR start "rule__CollectBy__Group_3_0__1"
    // InternalDataflowDSL.g:5464:1: rule__CollectBy__Group_3_0__1 : rule__CollectBy__Group_3_0__1__Impl ;
    public final void rule__CollectBy__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5468:1: ( rule__CollectBy__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:5469:2: rule__CollectBy__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_0__1"


    // $ANTLR start "rule__CollectBy__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:5475:1: rule__CollectBy__Group_3_0__1__Impl : ( ( rule__CollectBy__CollectByAssignment_3_0_1 ) ) ;
    public final void rule__CollectBy__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5479:1: ( ( ( rule__CollectBy__CollectByAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:5480:1: ( ( rule__CollectBy__CollectByAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:5480:1: ( ( rule__CollectBy__CollectByAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:5481:2: ( rule__CollectBy__CollectByAssignment_3_0_1 )
            {
             before(grammarAccess.getCollectByAccess().getCollectByAssignment_3_0_1()); 
            // InternalDataflowDSL.g:5482:2: ( rule__CollectBy__CollectByAssignment_3_0_1 )
            // InternalDataflowDSL.g:5482:3: rule__CollectBy__CollectByAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__CollectByAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getCollectByAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_0__1__Impl"


    // $ANTLR start "rule__CollectBy__Group_3_1__0"
    // InternalDataflowDSL.g:5491:1: rule__CollectBy__Group_3_1__0 : rule__CollectBy__Group_3_1__0__Impl rule__CollectBy__Group_3_1__1 ;
    public final void rule__CollectBy__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5495:1: ( rule__CollectBy__Group_3_1__0__Impl rule__CollectBy__Group_3_1__1 )
            // InternalDataflowDSL.g:5496:2: rule__CollectBy__Group_3_1__0__Impl rule__CollectBy__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__CollectBy__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_1__0"


    // $ANTLR start "rule__CollectBy__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:5503:1: rule__CollectBy__Group_3_1__0__Impl : ( 'target' ) ;
    public final void rule__CollectBy__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5507:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5508:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5508:1: ( 'target' )
            // InternalDataflowDSL.g:5509:2: 'target'
            {
             before(grammarAccess.getCollectByAccess().getTargetKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getTargetKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_1__0__Impl"


    // $ANTLR start "rule__CollectBy__Group_3_1__1"
    // InternalDataflowDSL.g:5518:1: rule__CollectBy__Group_3_1__1 : rule__CollectBy__Group_3_1__1__Impl ;
    public final void rule__CollectBy__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5522:1: ( rule__CollectBy__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:5523:2: rule__CollectBy__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_1__1"


    // $ANTLR start "rule__CollectBy__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:5529:1: rule__CollectBy__Group_3_1__1__Impl : ( ( rule__CollectBy__TargetAssignment_3_1_1 ) ) ;
    public final void rule__CollectBy__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5533:1: ( ( ( rule__CollectBy__TargetAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:5534:1: ( ( rule__CollectBy__TargetAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:5534:1: ( ( rule__CollectBy__TargetAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:5535:2: ( rule__CollectBy__TargetAssignment_3_1_1 )
            {
             before(grammarAccess.getCollectByAccess().getTargetAssignment_3_1_1()); 
            // InternalDataflowDSL.g:5536:2: ( rule__CollectBy__TargetAssignment_3_1_1 )
            // InternalDataflowDSL.g:5536:3: rule__CollectBy__TargetAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__TargetAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getTargetAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_1__1__Impl"


    // $ANTLR start "rule__Evaluate__Group__0"
    // InternalDataflowDSL.g:5545:1: rule__Evaluate__Group__0 : rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 ;
    public final void rule__Evaluate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5549:1: ( rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 )
            // InternalDataflowDSL.g:5550:2: rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1
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
    // InternalDataflowDSL.g:5557:1: rule__Evaluate__Group__0__Impl : ( 'Evaluate' ) ;
    public final void rule__Evaluate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5561:1: ( ( 'Evaluate' ) )
            // InternalDataflowDSL.g:5562:1: ( 'Evaluate' )
            {
            // InternalDataflowDSL.g:5562:1: ( 'Evaluate' )
            // InternalDataflowDSL.g:5563:2: 'Evaluate'
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
    // InternalDataflowDSL.g:5572:1: rule__Evaluate__Group__1 : rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 ;
    public final void rule__Evaluate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5576:1: ( rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 )
            // InternalDataflowDSL.g:5577:2: rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2
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
    // InternalDataflowDSL.g:5584:1: rule__Evaluate__Group__1__Impl : ( ( rule__Evaluate__NameAssignment_1 ) ) ;
    public final void rule__Evaluate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5588:1: ( ( ( rule__Evaluate__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:5589:1: ( ( rule__Evaluate__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:5589:1: ( ( rule__Evaluate__NameAssignment_1 ) )
            // InternalDataflowDSL.g:5590:2: ( rule__Evaluate__NameAssignment_1 )
            {
             before(grammarAccess.getEvaluateAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:5591:2: ( rule__Evaluate__NameAssignment_1 )
            // InternalDataflowDSL.g:5591:3: rule__Evaluate__NameAssignment_1
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
    // InternalDataflowDSL.g:5599:1: rule__Evaluate__Group__2 : rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3 ;
    public final void rule__Evaluate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5603:1: ( rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3 )
            // InternalDataflowDSL.g:5604:2: rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalDataflowDSL.g:5611:1: rule__Evaluate__Group__2__Impl : ( '{' ) ;
    public final void rule__Evaluate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5615:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5616:1: ( '{' )
            {
            // InternalDataflowDSL.g:5616:1: ( '{' )
            // InternalDataflowDSL.g:5617:2: '{'
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
    // InternalDataflowDSL.g:5626:1: rule__Evaluate__Group__3 : rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4 ;
    public final void rule__Evaluate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5630:1: ( rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4 )
            // InternalDataflowDSL.g:5631:2: rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalDataflowDSL.g:5638:1: rule__Evaluate__Group__3__Impl : ( ( rule__Evaluate__Alternatives_3 )* ) ;
    public final void rule__Evaluate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5642:1: ( ( ( rule__Evaluate__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:5643:1: ( ( rule__Evaluate__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:5643:1: ( ( rule__Evaluate__Alternatives_3 )* )
            // InternalDataflowDSL.g:5644:2: ( rule__Evaluate__Alternatives_3 )*
            {
             before(grammarAccess.getEvaluateAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:5645:2: ( rule__Evaluate__Alternatives_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==34||LA43_0==38||LA43_0==66) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDataflowDSL.g:5645:3: rule__Evaluate__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Evaluate__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getEvaluateAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:5653:1: rule__Evaluate__Group__4 : rule__Evaluate__Group__4__Impl ;
    public final void rule__Evaluate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5657:1: ( rule__Evaluate__Group__4__Impl )
            // InternalDataflowDSL.g:5658:2: rule__Evaluate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataflowDSL.g:5664:1: rule__Evaluate__Group__4__Impl : ( '}' ) ;
    public final void rule__Evaluate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5668:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5669:1: ( '}' )
            {
            // InternalDataflowDSL.g:5669:1: ( '}' )
            // InternalDataflowDSL.g:5670:2: '}'
            {
             before(grammarAccess.getEvaluateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Evaluate__Group_3_0__0"
    // InternalDataflowDSL.g:5680:1: rule__Evaluate__Group_3_0__0 : rule__Evaluate__Group_3_0__0__Impl rule__Evaluate__Group_3_0__1 ;
    public final void rule__Evaluate__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5684:1: ( rule__Evaluate__Group_3_0__0__Impl rule__Evaluate__Group_3_0__1 )
            // InternalDataflowDSL.g:5685:2: rule__Evaluate__Group_3_0__0__Impl rule__Evaluate__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Evaluate__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_0__0"


    // $ANTLR start "rule__Evaluate__Group_3_0__0__Impl"
    // InternalDataflowDSL.g:5692:1: rule__Evaluate__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__Evaluate__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5696:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:5697:1: ( 'field' )
            {
            // InternalDataflowDSL.g:5697:1: ( 'field' )
            // InternalDataflowDSL.g:5698:2: 'field'
            {
             before(grammarAccess.getEvaluateAccess().getFieldKeyword_3_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getFieldKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_0__0__Impl"


    // $ANTLR start "rule__Evaluate__Group_3_0__1"
    // InternalDataflowDSL.g:5707:1: rule__Evaluate__Group_3_0__1 : rule__Evaluate__Group_3_0__1__Impl ;
    public final void rule__Evaluate__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5711:1: ( rule__Evaluate__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:5712:2: rule__Evaluate__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_0__1"


    // $ANTLR start "rule__Evaluate__Group_3_0__1__Impl"
    // InternalDataflowDSL.g:5718:1: rule__Evaluate__Group_3_0__1__Impl : ( ( rule__Evaluate__FieldAssignment_3_0_1 ) ) ;
    public final void rule__Evaluate__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5722:1: ( ( ( rule__Evaluate__FieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:5723:1: ( ( rule__Evaluate__FieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:5723:1: ( ( rule__Evaluate__FieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:5724:2: ( rule__Evaluate__FieldAssignment_3_0_1 )
            {
             before(grammarAccess.getEvaluateAccess().getFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:5725:2: ( rule__Evaluate__FieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:5725:3: rule__Evaluate__FieldAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__FieldAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getFieldAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_0__1__Impl"


    // $ANTLR start "rule__Evaluate__Group_3_1__0"
    // InternalDataflowDSL.g:5734:1: rule__Evaluate__Group_3_1__0 : rule__Evaluate__Group_3_1__0__Impl rule__Evaluate__Group_3_1__1 ;
    public final void rule__Evaluate__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5738:1: ( rule__Evaluate__Group_3_1__0__Impl rule__Evaluate__Group_3_1__1 )
            // InternalDataflowDSL.g:5739:2: rule__Evaluate__Group_3_1__0__Impl rule__Evaluate__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Evaluate__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_1__0"


    // $ANTLR start "rule__Evaluate__Group_3_1__0__Impl"
    // InternalDataflowDSL.g:5746:1: rule__Evaluate__Group_3_1__0__Impl : ( 'expression' ) ;
    public final void rule__Evaluate__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5750:1: ( ( 'expression' ) )
            // InternalDataflowDSL.g:5751:1: ( 'expression' )
            {
            // InternalDataflowDSL.g:5751:1: ( 'expression' )
            // InternalDataflowDSL.g:5752:2: 'expression'
            {
             before(grammarAccess.getEvaluateAccess().getExpressionKeyword_3_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getExpressionKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_1__0__Impl"


    // $ANTLR start "rule__Evaluate__Group_3_1__1"
    // InternalDataflowDSL.g:5761:1: rule__Evaluate__Group_3_1__1 : rule__Evaluate__Group_3_1__1__Impl ;
    public final void rule__Evaluate__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5765:1: ( rule__Evaluate__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:5766:2: rule__Evaluate__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_1__1"


    // $ANTLR start "rule__Evaluate__Group_3_1__1__Impl"
    // InternalDataflowDSL.g:5772:1: rule__Evaluate__Group_3_1__1__Impl : ( ( rule__Evaluate__ExpressionAssignment_3_1_1 ) ) ;
    public final void rule__Evaluate__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5776:1: ( ( ( rule__Evaluate__ExpressionAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:5777:1: ( ( rule__Evaluate__ExpressionAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:5777:1: ( ( rule__Evaluate__ExpressionAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:5778:2: ( rule__Evaluate__ExpressionAssignment_3_1_1 )
            {
             before(grammarAccess.getEvaluateAccess().getExpressionAssignment_3_1_1()); 
            // InternalDataflowDSL.g:5779:2: ( rule__Evaluate__ExpressionAssignment_3_1_1 )
            // InternalDataflowDSL.g:5779:3: rule__Evaluate__ExpressionAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__ExpressionAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getExpressionAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_1__1__Impl"


    // $ANTLR start "rule__Evaluate__Group_3_2__0"
    // InternalDataflowDSL.g:5788:1: rule__Evaluate__Group_3_2__0 : rule__Evaluate__Group_3_2__0__Impl rule__Evaluate__Group_3_2__1 ;
    public final void rule__Evaluate__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5792:1: ( rule__Evaluate__Group_3_2__0__Impl rule__Evaluate__Group_3_2__1 )
            // InternalDataflowDSL.g:5793:2: rule__Evaluate__Group_3_2__0__Impl rule__Evaluate__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Evaluate__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_2__0"


    // $ANTLR start "rule__Evaluate__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:5800:1: rule__Evaluate__Group_3_2__0__Impl : ( 'target' ) ;
    public final void rule__Evaluate__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5804:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5805:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5805:1: ( 'target' )
            // InternalDataflowDSL.g:5806:2: 'target'
            {
             before(grammarAccess.getEvaluateAccess().getTargetKeyword_3_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getTargetKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_2__0__Impl"


    // $ANTLR start "rule__Evaluate__Group_3_2__1"
    // InternalDataflowDSL.g:5815:1: rule__Evaluate__Group_3_2__1 : rule__Evaluate__Group_3_2__1__Impl ;
    public final void rule__Evaluate__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5819:1: ( rule__Evaluate__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:5820:2: rule__Evaluate__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_2__1"


    // $ANTLR start "rule__Evaluate__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:5826:1: rule__Evaluate__Group_3_2__1__Impl : ( ( rule__Evaluate__TargetAssignment_3_2_1 ) ) ;
    public final void rule__Evaluate__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5830:1: ( ( ( rule__Evaluate__TargetAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:5831:1: ( ( rule__Evaluate__TargetAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:5831:1: ( ( rule__Evaluate__TargetAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:5832:2: ( rule__Evaluate__TargetAssignment_3_2_1 )
            {
             before(grammarAccess.getEvaluateAccess().getTargetAssignment_3_2_1()); 
            // InternalDataflowDSL.g:5833:2: ( rule__Evaluate__TargetAssignment_3_2_1 )
            // InternalDataflowDSL.g:5833:3: rule__Evaluate__TargetAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__TargetAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getTargetAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_3_2__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0__0"
    // InternalDataflowDSL.g:5842:1: rule__ConditionalExpression__Group_0__0 : rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1 ;
    public final void rule__ConditionalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5846:1: ( rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1 )
            // InternalDataflowDSL.g:5847:2: rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__ConditionalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__0"


    // $ANTLR start "rule__ConditionalExpression__Group_0__0__Impl"
    // InternalDataflowDSL.g:5854:1: rule__ConditionalExpression__Group_0__0__Impl : ( 'if' ) ;
    public final void rule__ConditionalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5858:1: ( ( 'if' ) )
            // InternalDataflowDSL.g:5859:1: ( 'if' )
            {
            // InternalDataflowDSL.g:5859:1: ( 'if' )
            // InternalDataflowDSL.g:5860:2: 'if'
            {
             before(grammarAccess.getConditionalExpressionAccess().getIfKeyword_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getConditionalExpressionAccess().getIfKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0__1"
    // InternalDataflowDSL.g:5869:1: rule__ConditionalExpression__Group_0__1 : rule__ConditionalExpression__Group_0__1__Impl rule__ConditionalExpression__Group_0__2 ;
    public final void rule__ConditionalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5873:1: ( rule__ConditionalExpression__Group_0__1__Impl rule__ConditionalExpression__Group_0__2 )
            // InternalDataflowDSL.g:5874:2: rule__ConditionalExpression__Group_0__1__Impl rule__ConditionalExpression__Group_0__2
            {
            pushFollow(FOLLOW_35);
            rule__ConditionalExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__1"


    // $ANTLR start "rule__ConditionalExpression__Group_0__1__Impl"
    // InternalDataflowDSL.g:5881:1: rule__ConditionalExpression__Group_0__1__Impl : ( ruleOrExpression ) ;
    public final void rule__ConditionalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5885:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:5886:1: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:5886:1: ( ruleOrExpression )
            // InternalDataflowDSL.g:5887:2: ruleOrExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getOrExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOrExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0__2"
    // InternalDataflowDSL.g:5896:1: rule__ConditionalExpression__Group_0__2 : rule__ConditionalExpression__Group_0__2__Impl rule__ConditionalExpression__Group_0__3 ;
    public final void rule__ConditionalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5900:1: ( rule__ConditionalExpression__Group_0__2__Impl rule__ConditionalExpression__Group_0__3 )
            // InternalDataflowDSL.g:5901:2: rule__ConditionalExpression__Group_0__2__Impl rule__ConditionalExpression__Group_0__3
            {
            pushFollow(FOLLOW_35);
            rule__ConditionalExpression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__2"


    // $ANTLR start "rule__ConditionalExpression__Group_0__2__Impl"
    // InternalDataflowDSL.g:5908:1: rule__ConditionalExpression__Group_0__2__Impl : ( () ) ;
    public final void rule__ConditionalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5912:1: ( ( () ) )
            // InternalDataflowDSL.g:5913:1: ( () )
            {
            // InternalDataflowDSL.g:5913:1: ( () )
            // InternalDataflowDSL.g:5914:2: ()
            {
             before(grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionExpressionAction_0_2()); 
            // InternalDataflowDSL.g:5915:2: ()
            // InternalDataflowDSL.g:5915:3: 
            {
            }

             after(grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionExpressionAction_0_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__2__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0__3"
    // InternalDataflowDSL.g:5923:1: rule__ConditionalExpression__Group_0__3 : rule__ConditionalExpression__Group_0__3__Impl rule__ConditionalExpression__Group_0__4 ;
    public final void rule__ConditionalExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5927:1: ( rule__ConditionalExpression__Group_0__3__Impl rule__ConditionalExpression__Group_0__4 )
            // InternalDataflowDSL.g:5928:2: rule__ConditionalExpression__Group_0__3__Impl rule__ConditionalExpression__Group_0__4
            {
            pushFollow(FOLLOW_13);
            rule__ConditionalExpression__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__3"


    // $ANTLR start "rule__ConditionalExpression__Group_0__3__Impl"
    // InternalDataflowDSL.g:5935:1: rule__ConditionalExpression__Group_0__3__Impl : ( 'then' ) ;
    public final void rule__ConditionalExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5939:1: ( ( 'then' ) )
            // InternalDataflowDSL.g:5940:1: ( 'then' )
            {
            // InternalDataflowDSL.g:5940:1: ( 'then' )
            // InternalDataflowDSL.g:5941:2: 'then'
            {
             before(grammarAccess.getConditionalExpressionAccess().getThenKeyword_0_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getConditionalExpressionAccess().getThenKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__3__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0__4"
    // InternalDataflowDSL.g:5950:1: rule__ConditionalExpression__Group_0__4 : rule__ConditionalExpression__Group_0__4__Impl rule__ConditionalExpression__Group_0__5 ;
    public final void rule__ConditionalExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5954:1: ( rule__ConditionalExpression__Group_0__4__Impl rule__ConditionalExpression__Group_0__5 )
            // InternalDataflowDSL.g:5955:2: rule__ConditionalExpression__Group_0__4__Impl rule__ConditionalExpression__Group_0__5
            {
            pushFollow(FOLLOW_36);
            rule__ConditionalExpression__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__4"


    // $ANTLR start "rule__ConditionalExpression__Group_0__4__Impl"
    // InternalDataflowDSL.g:5962:1: rule__ConditionalExpression__Group_0__4__Impl : ( ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 ) ) ;
    public final void rule__ConditionalExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5966:1: ( ( ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 ) ) )
            // InternalDataflowDSL.g:5967:1: ( ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 ) )
            {
            // InternalDataflowDSL.g:5967:1: ( ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 ) )
            // InternalDataflowDSL.g:5968:2: ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getThenExpressionAssignment_0_4()); 
            // InternalDataflowDSL.g:5969:2: ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 )
            // InternalDataflowDSL.g:5969:3: rule__ConditionalExpression__ThenExpressionAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__ThenExpressionAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getThenExpressionAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__4__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0__5"
    // InternalDataflowDSL.g:5977:1: rule__ConditionalExpression__Group_0__5 : rule__ConditionalExpression__Group_0__5__Impl rule__ConditionalExpression__Group_0__6 ;
    public final void rule__ConditionalExpression__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5981:1: ( rule__ConditionalExpression__Group_0__5__Impl rule__ConditionalExpression__Group_0__6 )
            // InternalDataflowDSL.g:5982:2: rule__ConditionalExpression__Group_0__5__Impl rule__ConditionalExpression__Group_0__6
            {
            pushFollow(FOLLOW_13);
            rule__ConditionalExpression__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__5"


    // $ANTLR start "rule__ConditionalExpression__Group_0__5__Impl"
    // InternalDataflowDSL.g:5989:1: rule__ConditionalExpression__Group_0__5__Impl : ( 'else' ) ;
    public final void rule__ConditionalExpression__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5993:1: ( ( 'else' ) )
            // InternalDataflowDSL.g:5994:1: ( 'else' )
            {
            // InternalDataflowDSL.g:5994:1: ( 'else' )
            // InternalDataflowDSL.g:5995:2: 'else'
            {
             before(grammarAccess.getConditionalExpressionAccess().getElseKeyword_0_5()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getConditionalExpressionAccess().getElseKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__5__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_0__6"
    // InternalDataflowDSL.g:6004:1: rule__ConditionalExpression__Group_0__6 : rule__ConditionalExpression__Group_0__6__Impl ;
    public final void rule__ConditionalExpression__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6008:1: ( rule__ConditionalExpression__Group_0__6__Impl )
            // InternalDataflowDSL.g:6009:2: rule__ConditionalExpression__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__6"


    // $ANTLR start "rule__ConditionalExpression__Group_0__6__Impl"
    // InternalDataflowDSL.g:6015:1: rule__ConditionalExpression__Group_0__6__Impl : ( ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 ) ) ;
    public final void rule__ConditionalExpression__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6019:1: ( ( ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 ) ) )
            // InternalDataflowDSL.g:6020:1: ( ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 ) )
            {
            // InternalDataflowDSL.g:6020:1: ( ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 ) )
            // InternalDataflowDSL.g:6021:2: ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getElseExpressionAssignment_0_6()); 
            // InternalDataflowDSL.g:6022:2: ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 )
            // InternalDataflowDSL.g:6022:3: rule__ConditionalExpression__ElseExpressionAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalExpression__ElseExpressionAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getElseExpressionAssignment_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_0__6__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalDataflowDSL.g:6031:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6035:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalDataflowDSL.g:6036:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDataflowDSL.g:6043:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6047:1: ( ( ruleAndExpression ) )
            // InternalDataflowDSL.g:6048:1: ( ruleAndExpression )
            {
            // InternalDataflowDSL.g:6048:1: ( ruleAndExpression )
            // InternalDataflowDSL.g:6049:2: ruleAndExpression
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
    // InternalDataflowDSL.g:6058:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6062:1: ( rule__OrExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6063:2: rule__OrExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6069:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6073:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6074:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6074:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6075:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6076:2: ( rule__OrExpression__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==11) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDataflowDSL.g:6076:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalDataflowDSL.g:6085:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6089:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalDataflowDSL.g:6090:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDataflowDSL.g:6097:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6101:1: ( ( () ) )
            // InternalDataflowDSL.g:6102:1: ( () )
            {
            // InternalDataflowDSL.g:6102:1: ( () )
            // InternalDataflowDSL.g:6103:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6104:2: ()
            // InternalDataflowDSL.g:6104:3: 
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
    // InternalDataflowDSL.g:6112:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6116:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalDataflowDSL.g:6117:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:6124:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6128:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6129:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6129:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6130:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6131:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6131:3: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6139:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6143:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6144:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6150:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6154:1: ( ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6155:1: ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6155:1: ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6156:2: ( rule__OrExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6157:2: ( rule__OrExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6157:3: rule__OrExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6166:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6170:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalDataflowDSL.g:6171:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDataflowDSL.g:6178:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6182:1: ( ( ruleEqualityExpression ) )
            // InternalDataflowDSL.g:6183:1: ( ruleEqualityExpression )
            {
            // InternalDataflowDSL.g:6183:1: ( ruleEqualityExpression )
            // InternalDataflowDSL.g:6184:2: ruleEqualityExpression
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
    // InternalDataflowDSL.g:6193:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6197:1: ( rule__AndExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6198:2: rule__AndExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6204:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6208:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6209:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6209:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6210:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6211:2: ( rule__AndExpression__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==12) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDataflowDSL.g:6211:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalDataflowDSL.g:6220:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6224:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalDataflowDSL.g:6225:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDataflowDSL.g:6232:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6236:1: ( ( () ) )
            // InternalDataflowDSL.g:6237:1: ( () )
            {
            // InternalDataflowDSL.g:6237:1: ( () )
            // InternalDataflowDSL.g:6238:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6239:2: ()
            // InternalDataflowDSL.g:6239:3: 
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
    // InternalDataflowDSL.g:6247:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6251:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalDataflowDSL.g:6252:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:6259:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6263:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6264:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6264:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6265:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6266:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6266:3: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6274:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6278:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6279:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6285:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6289:1: ( ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6290:1: ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6290:1: ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6291:2: ( rule__AndExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6292:2: ( rule__AndExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6292:3: rule__AndExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6301:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6305:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalDataflowDSL.g:6306:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDataflowDSL.g:6313:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6317:1: ( ( ruleRelationalExpression ) )
            // InternalDataflowDSL.g:6318:1: ( ruleRelationalExpression )
            {
            // InternalDataflowDSL.g:6318:1: ( ruleRelationalExpression )
            // InternalDataflowDSL.g:6319:2: ruleRelationalExpression
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
    // InternalDataflowDSL.g:6328:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6332:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6333:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6339:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6343:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6344:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6344:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6345:2: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6346:2: ( rule__EqualityExpression__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=19 && LA46_0<=20)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDataflowDSL.g:6346:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalDataflowDSL.g:6355:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6359:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalDataflowDSL.g:6360:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDataflowDSL.g:6367:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6371:1: ( ( () ) )
            // InternalDataflowDSL.g:6372:1: ( () )
            {
            // InternalDataflowDSL.g:6372:1: ( () )
            // InternalDataflowDSL.g:6373:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6374:2: ()
            // InternalDataflowDSL.g:6374:3: 
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
    // InternalDataflowDSL.g:6382:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6386:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalDataflowDSL.g:6387:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:6394:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6398:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6399:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6399:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6400:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6401:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6401:3: rule__EqualityExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6409:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6413:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6414:2: rule__EqualityExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6420:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6424:1: ( ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6425:1: ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6425:1: ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6426:2: ( rule__EqualityExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6427:2: ( rule__EqualityExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6427:3: rule__EqualityExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6436:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6440:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalDataflowDSL.g:6441:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalDataflowDSL.g:6448:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6452:1: ( ( ruleAdditiveExpression ) )
            // InternalDataflowDSL.g:6453:1: ( ruleAdditiveExpression )
            {
            // InternalDataflowDSL.g:6453:1: ( ruleAdditiveExpression )
            // InternalDataflowDSL.g:6454:2: ruleAdditiveExpression
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
    // InternalDataflowDSL.g:6463:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6467:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6468:2: rule__RelationalExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6474:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6478:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6479:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6479:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6480:2: ( rule__RelationalExpression__Group_1__0 )*
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6481:2: ( rule__RelationalExpression__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=21 && LA47_0<=24)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDataflowDSL.g:6481:3: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalDataflowDSL.g:6490:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6494:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalDataflowDSL.g:6495:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalDataflowDSL.g:6502:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6506:1: ( ( () ) )
            // InternalDataflowDSL.g:6507:1: ( () )
            {
            // InternalDataflowDSL.g:6507:1: ( () )
            // InternalDataflowDSL.g:6508:2: ()
            {
             before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6509:2: ()
            // InternalDataflowDSL.g:6509:3: 
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
    // InternalDataflowDSL.g:6517:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6521:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // InternalDataflowDSL.g:6522:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:6529:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6533:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6534:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6534:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6535:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6536:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6536:3: rule__RelationalExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6544:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6548:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6549:2: rule__RelationalExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6555:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6559:1: ( ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6560:1: ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6560:1: ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6561:2: ( rule__RelationalExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6562:2: ( rule__RelationalExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6562:3: rule__RelationalExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6571:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6575:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalDataflowDSL.g:6576:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalDataflowDSL.g:6583:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6587:1: ( ( ruleMultiplicativeExpression ) )
            // InternalDataflowDSL.g:6588:1: ( ruleMultiplicativeExpression )
            {
            // InternalDataflowDSL.g:6588:1: ( ruleMultiplicativeExpression )
            // InternalDataflowDSL.g:6589:2: ruleMultiplicativeExpression
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
    // InternalDataflowDSL.g:6598:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6602:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6603:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6609:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6613:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6614:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6614:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6615:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6616:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=25 && LA48_0<=26)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDataflowDSL.g:6616:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalDataflowDSL.g:6625:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6629:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalDataflowDSL.g:6630:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalDataflowDSL.g:6637:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6641:1: ( ( () ) )
            // InternalDataflowDSL.g:6642:1: ( () )
            {
            // InternalDataflowDSL.g:6642:1: ( () )
            // InternalDataflowDSL.g:6643:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6644:2: ()
            // InternalDataflowDSL.g:6644:3: 
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
    // InternalDataflowDSL.g:6652:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6656:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalDataflowDSL.g:6657:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:6664:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6668:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6669:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6669:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6670:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6671:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6671:3: rule__AdditiveExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6679:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6683:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6684:2: rule__AdditiveExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6690:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6694:1: ( ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6695:1: ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6695:1: ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6696:2: ( rule__AdditiveExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6697:2: ( rule__AdditiveExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6697:3: rule__AdditiveExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6706:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6710:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalDataflowDSL.g:6711:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalDataflowDSL.g:6718:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6722:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:6723:1: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:6723:1: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:6724:2: ruleUnaryExpression
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
    // InternalDataflowDSL.g:6733:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6737:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6738:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6744:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6748:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6749:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6749:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6750:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6751:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=27 && LA49_0<=29)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDataflowDSL.g:6751:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalDataflowDSL.g:6760:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6764:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalDataflowDSL.g:6765:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalDataflowDSL.g:6772:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6776:1: ( ( () ) )
            // InternalDataflowDSL.g:6777:1: ( () )
            {
            // InternalDataflowDSL.g:6777:1: ( () )
            // InternalDataflowDSL.g:6778:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6779:2: ()
            // InternalDataflowDSL.g:6779:3: 
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
    // InternalDataflowDSL.g:6787:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6791:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalDataflowDSL.g:6792:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:6799:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6803:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6804:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6804:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6805:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6806:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6806:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6814:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6818:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6819:2: rule__MultiplicativeExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6825:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6829:1: ( ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6830:1: ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6830:1: ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6831:2: ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6832:2: ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6832:3: rule__MultiplicativeExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6841:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6845:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalDataflowDSL.g:6846:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalDataflowDSL.g:6853:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6857:1: ( ( () ) )
            // InternalDataflowDSL.g:6858:1: ( () )
            {
            // InternalDataflowDSL.g:6858:1: ( () )
            // InternalDataflowDSL.g:6859:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperationAction_0_0()); 
            // InternalDataflowDSL.g:6860:2: ()
            // InternalDataflowDSL.g:6860:3: 
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
    // InternalDataflowDSL.g:6868:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6872:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalDataflowDSL.g:6873:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:6880:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6884:1: ( ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) )
            // InternalDataflowDSL.g:6885:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            {
            // InternalDataflowDSL.g:6885:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            // InternalDataflowDSL.g:6886:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            // InternalDataflowDSL.g:6887:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            // InternalDataflowDSL.g:6887:3: rule__UnaryExpression__OperatorAssignment_0_1
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
    // InternalDataflowDSL.g:6895:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6899:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalDataflowDSL.g:6900:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalDataflowDSL.g:6906:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6910:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) )
            // InternalDataflowDSL.g:6911:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            {
            // InternalDataflowDSL.g:6911:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            // InternalDataflowDSL.g:6912:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 
            // InternalDataflowDSL.g:6913:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            // InternalDataflowDSL.g:6913:3: rule__UnaryExpression__ExpressionAssignment_0_2
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
    // InternalDataflowDSL.g:6922:1: rule__FeatureCallExpression__Group__0 : rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1 ;
    public final void rule__FeatureCallExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6926:1: ( rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1 )
            // InternalDataflowDSL.g:6927:2: rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalDataflowDSL.g:6934:1: rule__FeatureCallExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__FeatureCallExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6938:1: ( ( rulePrimaryExpression ) )
            // InternalDataflowDSL.g:6939:1: ( rulePrimaryExpression )
            {
            // InternalDataflowDSL.g:6939:1: ( rulePrimaryExpression )
            // InternalDataflowDSL.g:6940:2: rulePrimaryExpression
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
    // InternalDataflowDSL.g:6949:1: rule__FeatureCallExpression__Group__1 : rule__FeatureCallExpression__Group__1__Impl ;
    public final void rule__FeatureCallExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6953:1: ( rule__FeatureCallExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6954:2: rule__FeatureCallExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6960:1: rule__FeatureCallExpression__Group__1__Impl : ( ( rule__FeatureCallExpression__Group_1__0 )* ) ;
    public final void rule__FeatureCallExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6964:1: ( ( ( rule__FeatureCallExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6965:1: ( ( rule__FeatureCallExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6965:1: ( ( rule__FeatureCallExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6966:2: ( rule__FeatureCallExpression__Group_1__0 )*
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6967:2: ( rule__FeatureCallExpression__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==70) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDataflowDSL.g:6967:3: rule__FeatureCallExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__FeatureCallExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalDataflowDSL.g:6976:1: rule__FeatureCallExpression__Group_1__0 : rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1 ;
    public final void rule__FeatureCallExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6980:1: ( rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1 )
            // InternalDataflowDSL.g:6981:2: rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalDataflowDSL.g:6988:1: rule__FeatureCallExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__FeatureCallExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6992:1: ( ( () ) )
            // InternalDataflowDSL.g:6993:1: ( () )
            {
            // InternalDataflowDSL.g:6993:1: ( () )
            // InternalDataflowDSL.g:6994:2: ()
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFeatureCallTargetExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6995:2: ()
            // InternalDataflowDSL.g:6995:3: 
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
    // InternalDataflowDSL.g:7003:1: rule__FeatureCallExpression__Group_1__1 : rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2 ;
    public final void rule__FeatureCallExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7007:1: ( rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2 )
            // InternalDataflowDSL.g:7008:2: rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2
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
    // InternalDataflowDSL.g:7015:1: rule__FeatureCallExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__FeatureCallExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7019:1: ( ( '.' ) )
            // InternalDataflowDSL.g:7020:1: ( '.' )
            {
            // InternalDataflowDSL.g:7020:1: ( '.' )
            // InternalDataflowDSL.g:7021:2: '.'
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7030:1: rule__FeatureCallExpression__Group_1__2 : rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3 ;
    public final void rule__FeatureCallExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7034:1: ( rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3 )
            // InternalDataflowDSL.g:7035:2: rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalDataflowDSL.g:7042:1: rule__FeatureCallExpression__Group_1__2__Impl : ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) ) ;
    public final void rule__FeatureCallExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7046:1: ( ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:7047:1: ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:7047:1: ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) )
            // InternalDataflowDSL.g:7048:2: ( rule__FeatureCallExpression__FeatureAssignment_1_2 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFeatureAssignment_1_2()); 
            // InternalDataflowDSL.g:7049:2: ( rule__FeatureCallExpression__FeatureAssignment_1_2 )
            // InternalDataflowDSL.g:7049:3: rule__FeatureCallExpression__FeatureAssignment_1_2
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
    // InternalDataflowDSL.g:7057:1: rule__FeatureCallExpression__Group_1__3 : rule__FeatureCallExpression__Group_1__3__Impl ;
    public final void rule__FeatureCallExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7061:1: ( rule__FeatureCallExpression__Group_1__3__Impl )
            // InternalDataflowDSL.g:7062:2: rule__FeatureCallExpression__Group_1__3__Impl
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
    // InternalDataflowDSL.g:7068:1: rule__FeatureCallExpression__Group_1__3__Impl : ( ( rule__FeatureCallExpression__Group_1_3__0 )? ) ;
    public final void rule__FeatureCallExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7072:1: ( ( ( rule__FeatureCallExpression__Group_1_3__0 )? ) )
            // InternalDataflowDSL.g:7073:1: ( ( rule__FeatureCallExpression__Group_1_3__0 )? )
            {
            // InternalDataflowDSL.g:7073:1: ( ( rule__FeatureCallExpression__Group_1_3__0 )? )
            // InternalDataflowDSL.g:7074:2: ( rule__FeatureCallExpression__Group_1_3__0 )?
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3()); 
            // InternalDataflowDSL.g:7075:2: ( rule__FeatureCallExpression__Group_1_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==71) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDataflowDSL.g:7075:3: rule__FeatureCallExpression__Group_1_3__0
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
    // InternalDataflowDSL.g:7084:1: rule__FeatureCallExpression__Group_1_3__0 : rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1 ;
    public final void rule__FeatureCallExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7088:1: ( rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1 )
            // InternalDataflowDSL.g:7089:2: rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalDataflowDSL.g:7096:1: rule__FeatureCallExpression__Group_1_3__0__Impl : ( '(' ) ;
    public final void rule__FeatureCallExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7100:1: ( ( '(' ) )
            // InternalDataflowDSL.g:7101:1: ( '(' )
            {
            // InternalDataflowDSL.g:7101:1: ( '(' )
            // InternalDataflowDSL.g:7102:2: '('
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getLeftParenthesisKeyword_1_3_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7111:1: rule__FeatureCallExpression__Group_1_3__1 : rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2 ;
    public final void rule__FeatureCallExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7115:1: ( rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2 )
            // InternalDataflowDSL.g:7116:2: rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalDataflowDSL.g:7123:1: rule__FeatureCallExpression__Group_1_3__1__Impl : ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? ) ;
    public final void rule__FeatureCallExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7127:1: ( ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? ) )
            // InternalDataflowDSL.g:7128:1: ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? )
            {
            // InternalDataflowDSL.g:7128:1: ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? )
            // InternalDataflowDSL.g:7129:2: ( rule__FeatureCallExpression__Group_1_3_1__0 )?
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1()); 
            // InternalDataflowDSL.g:7130:2: ( rule__FeatureCallExpression__Group_1_3_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_INT && LA52_0<=RULE_STRING)||(LA52_0>=13 && LA52_0<=14)||LA52_0==26||LA52_0==30||(LA52_0>=70 && LA52_0<=71)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDataflowDSL.g:7130:3: rule__FeatureCallExpression__Group_1_3_1__0
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
    // InternalDataflowDSL.g:7138:1: rule__FeatureCallExpression__Group_1_3__2 : rule__FeatureCallExpression__Group_1_3__2__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7142:1: ( rule__FeatureCallExpression__Group_1_3__2__Impl )
            // InternalDataflowDSL.g:7143:2: rule__FeatureCallExpression__Group_1_3__2__Impl
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
    // InternalDataflowDSL.g:7149:1: rule__FeatureCallExpression__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__FeatureCallExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7153:1: ( ( ')' ) )
            // InternalDataflowDSL.g:7154:1: ( ')' )
            {
            // InternalDataflowDSL.g:7154:1: ( ')' )
            // InternalDataflowDSL.g:7155:2: ')'
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7165:1: rule__FeatureCallExpression__Group_1_3_1__0 : rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1 ;
    public final void rule__FeatureCallExpression__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7169:1: ( rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1 )
            // InternalDataflowDSL.g:7170:2: rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalDataflowDSL.g:7177:1: rule__FeatureCallExpression__Group_1_3_1__0__Impl : ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7181:1: ( ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) ) )
            // InternalDataflowDSL.g:7182:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) )
            {
            // InternalDataflowDSL.g:7182:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) )
            // InternalDataflowDSL.g:7183:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_0()); 
            // InternalDataflowDSL.g:7184:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 )
            // InternalDataflowDSL.g:7184:3: rule__FeatureCallExpression__ParametersAssignment_1_3_1_0
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
    // InternalDataflowDSL.g:7192:1: rule__FeatureCallExpression__Group_1_3_1__1 : rule__FeatureCallExpression__Group_1_3_1__1__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7196:1: ( rule__FeatureCallExpression__Group_1_3_1__1__Impl )
            // InternalDataflowDSL.g:7197:2: rule__FeatureCallExpression__Group_1_3_1__1__Impl
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
    // InternalDataflowDSL.g:7203:1: rule__FeatureCallExpression__Group_1_3_1__1__Impl : ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7207:1: ( ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* ) )
            // InternalDataflowDSL.g:7208:1: ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* )
            {
            // InternalDataflowDSL.g:7208:1: ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* )
            // InternalDataflowDSL.g:7209:2: ( rule__FeatureCallExpression__Group_1_3_1_1__0 )*
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1_1()); 
            // InternalDataflowDSL.g:7210:2: ( rule__FeatureCallExpression__Group_1_3_1_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==73) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalDataflowDSL.g:7210:3: rule__FeatureCallExpression__Group_1_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__FeatureCallExpression__Group_1_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalDataflowDSL.g:7219:1: rule__FeatureCallExpression__Group_1_3_1_1__0 : rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1 ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7223:1: ( rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1 )
            // InternalDataflowDSL.g:7224:2: rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:7231:1: rule__FeatureCallExpression__Group_1_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7235:1: ( ( ',' ) )
            // InternalDataflowDSL.g:7236:1: ( ',' )
            {
            // InternalDataflowDSL.g:7236:1: ( ',' )
            // InternalDataflowDSL.g:7237:2: ','
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7246:1: rule__FeatureCallExpression__Group_1_3_1_1__1 : rule__FeatureCallExpression__Group_1_3_1_1__1__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7250:1: ( rule__FeatureCallExpression__Group_1_3_1_1__1__Impl )
            // InternalDataflowDSL.g:7251:2: rule__FeatureCallExpression__Group_1_3_1_1__1__Impl
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
    // InternalDataflowDSL.g:7257:1: rule__FeatureCallExpression__Group_1_3_1_1__1__Impl : ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7261:1: ( ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) ) )
            // InternalDataflowDSL.g:7262:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) )
            {
            // InternalDataflowDSL.g:7262:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) )
            // InternalDataflowDSL.g:7263:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_1_1()); 
            // InternalDataflowDSL.g:7264:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 )
            // InternalDataflowDSL.g:7264:3: rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1
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
    // InternalDataflowDSL.g:7273:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7277:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalDataflowDSL.g:7278:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalDataflowDSL.g:7285:1: rule__PrimaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7289:1: ( ( () ) )
            // InternalDataflowDSL.g:7290:1: ( () )
            {
            // InternalDataflowDSL.g:7290:1: ( () )
            // InternalDataflowDSL.g:7291:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIntegerLiteralAction_0_0()); 
            // InternalDataflowDSL.g:7292:2: ()
            // InternalDataflowDSL.g:7292:3: 
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
    // InternalDataflowDSL.g:7300:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7304:1: ( rule__PrimaryExpression__Group_0__1__Impl )
            // InternalDataflowDSL.g:7305:2: rule__PrimaryExpression__Group_0__1__Impl
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
    // InternalDataflowDSL.g:7311:1: rule__PrimaryExpression__Group_0__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7315:1: ( ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) )
            // InternalDataflowDSL.g:7316:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            {
            // InternalDataflowDSL.g:7316:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            // InternalDataflowDSL.g:7317:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 
            // InternalDataflowDSL.g:7318:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            // InternalDataflowDSL.g:7318:3: rule__PrimaryExpression__ValueAssignment_0_1
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
    // InternalDataflowDSL.g:7327:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7331:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalDataflowDSL.g:7332:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalDataflowDSL.g:7339:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7343:1: ( ( () ) )
            // InternalDataflowDSL.g:7344:1: ( () )
            {
            // InternalDataflowDSL.g:7344:1: ( () )
            // InternalDataflowDSL.g:7345:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_1_0()); 
            // InternalDataflowDSL.g:7346:2: ()
            // InternalDataflowDSL.g:7346:3: 
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
    // InternalDataflowDSL.g:7354:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7358:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalDataflowDSL.g:7359:2: rule__PrimaryExpression__Group_1__1__Impl
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
    // InternalDataflowDSL.g:7365:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7369:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:7370:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:7370:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalDataflowDSL.g:7371:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalDataflowDSL.g:7372:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalDataflowDSL.g:7372:3: rule__PrimaryExpression__ValueAssignment_1_1
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
    // InternalDataflowDSL.g:7381:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7385:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalDataflowDSL.g:7386:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalDataflowDSL.g:7393:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7397:1: ( ( () ) )
            // InternalDataflowDSL.g:7398:1: ( () )
            {
            // InternalDataflowDSL.g:7398:1: ( () )
            // InternalDataflowDSL.g:7399:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0()); 
            // InternalDataflowDSL.g:7400:2: ()
            // InternalDataflowDSL.g:7400:3: 
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
    // InternalDataflowDSL.g:7408:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7412:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalDataflowDSL.g:7413:2: rule__PrimaryExpression__Group_2__1__Impl
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
    // InternalDataflowDSL.g:7419:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7423:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // InternalDataflowDSL.g:7424:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // InternalDataflowDSL.g:7424:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // InternalDataflowDSL.g:7425:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // InternalDataflowDSL.g:7426:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // InternalDataflowDSL.g:7426:3: rule__PrimaryExpression__ValueAssignment_2_1
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
    // InternalDataflowDSL.g:7435:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7439:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalDataflowDSL.g:7440:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalDataflowDSL.g:7447:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7451:1: ( ( () ) )
            // InternalDataflowDSL.g:7452:1: ( () )
            {
            // InternalDataflowDSL.g:7452:1: ( () )
            // InternalDataflowDSL.g:7453:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_3_0()); 
            // InternalDataflowDSL.g:7454:2: ()
            // InternalDataflowDSL.g:7454:3: 
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
    // InternalDataflowDSL.g:7462:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7466:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // InternalDataflowDSL.g:7467:2: rule__PrimaryExpression__Group_3__1__Impl
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
    // InternalDataflowDSL.g:7473:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7477:1: ( ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:7478:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:7478:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            // InternalDataflowDSL.g:7479:2: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_3_1()); 
            // InternalDataflowDSL.g:7480:2: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            // InternalDataflowDSL.g:7480:3: rule__PrimaryExpression__ValueAssignment_3_1
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
    // InternalDataflowDSL.g:7489:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7493:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalDataflowDSL.g:7494:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
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
    // InternalDataflowDSL.g:7501:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7505:1: ( ( () ) )
            // InternalDataflowDSL.g:7506:1: ( () )
            {
            // InternalDataflowDSL.g:7506:1: ( () )
            // InternalDataflowDSL.g:7507:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldReferenceAction_4_0()); 
            // InternalDataflowDSL.g:7508:2: ()
            // InternalDataflowDSL.g:7508:3: 
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
    // InternalDataflowDSL.g:7516:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7520:1: ( rule__PrimaryExpression__Group_4__1__Impl )
            // InternalDataflowDSL.g:7521:2: rule__PrimaryExpression__Group_4__1__Impl
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
    // InternalDataflowDSL.g:7527:1: rule__PrimaryExpression__Group_4__1__Impl : ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7531:1: ( ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:7532:1: ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:7532:1: ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) )
            // InternalDataflowDSL.g:7533:2: ( rule__PrimaryExpression__FieldAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldAssignment_4_1()); 
            // InternalDataflowDSL.g:7534:2: ( rule__PrimaryExpression__FieldAssignment_4_1 )
            // InternalDataflowDSL.g:7534:3: rule__PrimaryExpression__FieldAssignment_4_1
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
    // InternalDataflowDSL.g:7543:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7547:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // InternalDataflowDSL.g:7548:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:7555:1: rule__PrimaryExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7559:1: ( ( '(' ) )
            // InternalDataflowDSL.g:7560:1: ( '(' )
            {
            // InternalDataflowDSL.g:7560:1: ( '(' )
            // InternalDataflowDSL.g:7561:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7570:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7574:1: ( rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 )
            // InternalDataflowDSL.g:7575:2: rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2
            {
            pushFollow(FOLLOW_60);
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
    // InternalDataflowDSL.g:7582:1: rule__PrimaryExpression__Group_5__1__Impl : ( ruleOrExpression ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7586:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:7587:1: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:7587:1: ( ruleOrExpression )
            // InternalDataflowDSL.g:7588:2: ruleOrExpression
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
    // InternalDataflowDSL.g:7597:1: rule__PrimaryExpression__Group_5__2 : rule__PrimaryExpression__Group_5__2__Impl ;
    public final void rule__PrimaryExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7601:1: ( rule__PrimaryExpression__Group_5__2__Impl )
            // InternalDataflowDSL.g:7602:2: rule__PrimaryExpression__Group_5__2__Impl
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
    // InternalDataflowDSL.g:7608:1: rule__PrimaryExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7612:1: ( ( ')' ) )
            // InternalDataflowDSL.g:7613:1: ( ')' )
            {
            // InternalDataflowDSL.g:7613:1: ( ')' )
            // InternalDataflowDSL.g:7614:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7624:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7628:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDataflowDSL.g:7629:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalDataflowDSL.g:7636:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7640:1: ( ( ( RULE_INT )? ) )
            // InternalDataflowDSL.g:7641:1: ( ( RULE_INT )? )
            {
            // InternalDataflowDSL.g:7641:1: ( ( RULE_INT )? )
            // InternalDataflowDSL.g:7642:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalDataflowDSL.g:7643:2: ( RULE_INT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDataflowDSL.g:7643:3: RULE_INT
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
    // InternalDataflowDSL.g:7651:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7655:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDataflowDSL.g:7656:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalDataflowDSL.g:7663:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7667:1: ( ( '.' ) )
            // InternalDataflowDSL.g:7668:1: ( '.' )
            {
            // InternalDataflowDSL.g:7668:1: ( '.' )
            // InternalDataflowDSL.g:7669:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalDataflowDSL.g:7678:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7682:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDataflowDSL.g:7683:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_61);
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
    // InternalDataflowDSL.g:7690:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7694:1: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:7695:1: ( RULE_INT )
            {
            // InternalDataflowDSL.g:7695:1: ( RULE_INT )
            // InternalDataflowDSL.g:7696:2: RULE_INT
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
    // InternalDataflowDSL.g:7705:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7709:1: ( rule__EDouble__Group__3__Impl )
            // InternalDataflowDSL.g:7710:2: rule__EDouble__Group__3__Impl
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
    // InternalDataflowDSL.g:7716:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7720:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalDataflowDSL.g:7721:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:7721:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalDataflowDSL.g:7722:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalDataflowDSL.g:7723:2: ( rule__EDouble__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=15 && LA55_0<=16)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDataflowDSL.g:7723:3: rule__EDouble__Group_3__0
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
    // InternalDataflowDSL.g:7732:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7736:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalDataflowDSL.g:7737:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalDataflowDSL.g:7744:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7748:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalDataflowDSL.g:7749:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalDataflowDSL.g:7749:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalDataflowDSL.g:7750:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalDataflowDSL.g:7751:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalDataflowDSL.g:7751:3: rule__EDouble__Alternatives_3_0
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
    // InternalDataflowDSL.g:7759:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7763:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // InternalDataflowDSL.g:7764:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
            {
            pushFollow(FOLLOW_62);
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
    // InternalDataflowDSL.g:7771:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7775:1: ( ( ( '-' )? ) )
            // InternalDataflowDSL.g:7776:1: ( ( '-' )? )
            {
            // InternalDataflowDSL.g:7776:1: ( ( '-' )? )
            // InternalDataflowDSL.g:7777:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // InternalDataflowDSL.g:7778:2: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==26) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDataflowDSL.g:7778:3: '-'
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
    // InternalDataflowDSL.g:7786:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7790:1: ( rule__EDouble__Group_3__2__Impl )
            // InternalDataflowDSL.g:7791:2: rule__EDouble__Group_3__2__Impl
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
    // InternalDataflowDSL.g:7797:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7801:1: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:7802:1: ( RULE_INT )
            {
            // InternalDataflowDSL.g:7802:1: ( RULE_INT )
            // InternalDataflowDSL.g:7803:2: RULE_INT
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
    // InternalDataflowDSL.g:7813:1: rule__Model__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7817:1: ( ( ruleElement ) )
            // InternalDataflowDSL.g:7818:2: ( ruleElement )
            {
            // InternalDataflowDSL.g:7818:2: ( ruleElement )
            // InternalDataflowDSL.g:7819:3: ruleElement
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
    // InternalDataflowDSL.g:7828:1: rule__AllInstances__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7832:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7833:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7833:2: ( RULE_ID )
            // InternalDataflowDSL.g:7834:3: RULE_ID
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


    // $ANTLR start "rule__AllInstances__FieldAssignment_3_0_1"
    // InternalDataflowDSL.g:7843:1: rule__AllInstances__FieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__FieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7847:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7848:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7848:2: ( RULE_ID )
            // InternalDataflowDSL.g:7849:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getFieldIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getFieldIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__FieldAssignment_3_0_1"


    // $ANTLR start "rule__AllInstances__ModelAssignment_3_1_1_0"
    // InternalDataflowDSL.g:7858:1: rule__AllInstances__ModelAssignment_3_1_1_0 : ( RULE_ID ) ;
    public final void rule__AllInstances__ModelAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7862:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7863:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7863:2: ( RULE_ID )
            // InternalDataflowDSL.g:7864:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getModelIDTerminalRuleCall_3_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getModelIDTerminalRuleCall_3_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__ModelAssignment_3_1_1_0"


    // $ANTLR start "rule__AllInstances__PackageNameAssignment_3_1_2_0"
    // InternalDataflowDSL.g:7873:1: rule__AllInstances__PackageNameAssignment_3_1_2_0 : ( RULE_ID ) ;
    public final void rule__AllInstances__PackageNameAssignment_3_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7877:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7878:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7878:2: ( RULE_ID )
            // InternalDataflowDSL.g:7879:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getPackageNameIDTerminalRuleCall_3_1_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getPackageNameIDTerminalRuleCall_3_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__PackageNameAssignment_3_1_2_0"


    // $ANTLR start "rule__AllInstances__TypeNameAssignment_3_1_3"
    // InternalDataflowDSL.g:7888:1: rule__AllInstances__TypeNameAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__AllInstances__TypeNameAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7892:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7893:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7893:2: ( RULE_ID )
            // InternalDataflowDSL.g:7894:3: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_3_1_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTypeNameIDTerminalRuleCall_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__TypeNameAssignment_3_1_3"


    // $ANTLR start "rule__AllInstances__TargetAssignment_3_2_1"
    // InternalDataflowDSL.g:7903:1: rule__AllInstances__TargetAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllInstances__TargetAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7907:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:7908:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:7908:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7909:3: ( RULE_ID )
            {
             before(grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_3_2_1_0()); 
            // InternalDataflowDSL.g:7910:3: ( RULE_ID )
            // InternalDataflowDSL.g:7911:4: RULE_ID
            {
             before(grammarAccess.getAllInstancesAccess().getTargetElementIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getTargetElementIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllInstances__TargetAssignment_3_2_1"


    // $ANTLR start "rule__NewInstance__NameAssignment_1"
    // InternalDataflowDSL.g:7922:1: rule__NewInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7926:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7927:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7927:2: ( RULE_ID )
            // InternalDataflowDSL.g:7928:3: RULE_ID
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


    // $ANTLR start "rule__NewInstance__InstanceFieldAssignment_3_0_1"
    // InternalDataflowDSL.g:7937:1: rule__NewInstance__InstanceFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__InstanceFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7941:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7942:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7942:2: ( RULE_ID )
            // InternalDataflowDSL.g:7943:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getInstanceFieldIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getInstanceFieldIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__InstanceFieldAssignment_3_0_1"


    // $ANTLR start "rule__NewInstance__KeyAssignment_3_1_1"
    // InternalDataflowDSL.g:7952:1: rule__NewInstance__KeyAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__NewInstance__KeyAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7956:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:7957:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:7957:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:7958:3: ruleConditionalExpression
            {
             before(grammarAccess.getNewInstanceAccess().getKeyConditionalExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getNewInstanceAccess().getKeyConditionalExpressionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__KeyAssignment_3_1_1"


    // $ANTLR start "rule__NewInstance__ModelAssignment_3_2_1_0"
    // InternalDataflowDSL.g:7967:1: rule__NewInstance__ModelAssignment_3_2_1_0 : ( RULE_ID ) ;
    public final void rule__NewInstance__ModelAssignment_3_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7971:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7972:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7972:2: ( RULE_ID )
            // InternalDataflowDSL.g:7973:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getModelIDTerminalRuleCall_3_2_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getModelIDTerminalRuleCall_3_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__ModelAssignment_3_2_1_0"


    // $ANTLR start "rule__NewInstance__PackageNameAssignment_3_2_2_0"
    // InternalDataflowDSL.g:7982:1: rule__NewInstance__PackageNameAssignment_3_2_2_0 : ( RULE_ID ) ;
    public final void rule__NewInstance__PackageNameAssignment_3_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7986:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7987:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7987:2: ( RULE_ID )
            // InternalDataflowDSL.g:7988:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getPackageNameIDTerminalRuleCall_3_2_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getPackageNameIDTerminalRuleCall_3_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__PackageNameAssignment_3_2_2_0"


    // $ANTLR start "rule__NewInstance__TypeNameAssignment_3_2_3"
    // InternalDataflowDSL.g:7997:1: rule__NewInstance__TypeNameAssignment_3_2_3 : ( RULE_ID ) ;
    public final void rule__NewInstance__TypeNameAssignment_3_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8001:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8002:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8002:2: ( RULE_ID )
            // InternalDataflowDSL.g:8003:3: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_3_2_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTypeNameIDTerminalRuleCall_3_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__TypeNameAssignment_3_2_3"


    // $ANTLR start "rule__NewInstance__TargetAssignment_3_3_1"
    // InternalDataflowDSL.g:8012:1: rule__NewInstance__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewInstance__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8016:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8017:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8017:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8018:3: ( RULE_ID )
            {
             before(grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8019:3: ( RULE_ID )
            // InternalDataflowDSL.g:8020:4: RULE_ID
            {
             before(grammarAccess.getNewInstanceAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInstanceAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInstance__TargetAssignment_3_3_1"


    // $ANTLR start "rule__Filter__NameAssignment_1"
    // InternalDataflowDSL.g:8031:1: rule__Filter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Filter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8035:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8036:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8036:2: ( RULE_ID )
            // InternalDataflowDSL.g:8037:3: RULE_ID
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


    // $ANTLR start "rule__Filter__FilterByAssignment_3_0_1"
    // InternalDataflowDSL.g:8046:1: rule__Filter__FilterByAssignment_3_0_1 : ( ruleConditionalExpression ) ;
    public final void rule__Filter__FilterByAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8050:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8051:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8051:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8052:3: ruleConditionalExpression
            {
             before(grammarAccess.getFilterAccess().getFilterByConditionalExpressionParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getFilterByConditionalExpressionParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__FilterByAssignment_3_0_1"


    // $ANTLR start "rule__Filter__TargetAssignment_3_1_1"
    // InternalDataflowDSL.g:8061:1: rule__Filter__TargetAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Filter__TargetAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8065:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8066:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8066:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8067:3: ( RULE_ID )
            {
             before(grammarAccess.getFilterAccess().getTargetElementCrossReference_3_1_1_0()); 
            // InternalDataflowDSL.g:8068:3: ( RULE_ID )
            // InternalDataflowDSL.g:8069:4: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getTargetElementIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getTargetElementIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getFilterAccess().getTargetElementCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__TargetAssignment_3_1_1"


    // $ANTLR start "rule__Filter__RejectTargetAssignment_3_2_1"
    // InternalDataflowDSL.g:8080:1: rule__Filter__RejectTargetAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Filter__RejectTargetAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8084:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8085:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8085:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8086:3: ( RULE_ID )
            {
             before(grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_3_2_1_0()); 
            // InternalDataflowDSL.g:8087:3: ( RULE_ID )
            // InternalDataflowDSL.g:8088:4: RULE_ID
            {
             before(grammarAccess.getFilterAccess().getRejectTargetElementIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRejectTargetElementIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__RejectTargetAssignment_3_2_1"


    // $ANTLR start "rule__Copy__NameAssignment_1"
    // InternalDataflowDSL.g:8099:1: rule__Copy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Copy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8103:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8104:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8104:2: ( RULE_ID )
            // InternalDataflowDSL.g:8105:3: RULE_ID
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


    // $ANTLR start "rule__Copy__TargetAssignment_3_0_1"
    // InternalDataflowDSL.g:8114:1: rule__Copy__TargetAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Copy__TargetAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8118:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8119:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8119:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8120:3: ( RULE_ID )
            {
             before(grammarAccess.getCopyAccess().getTargetElementCrossReference_3_0_1_0()); 
            // InternalDataflowDSL.g:8121:3: ( RULE_ID )
            // InternalDataflowDSL.g:8122:4: RULE_ID
            {
             before(grammarAccess.getCopyAccess().getTargetElementIDTerminalRuleCall_3_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getTargetElementIDTerminalRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getCopyAccess().getTargetElementCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__TargetAssignment_3_0_1"


    // $ANTLR start "rule__Copy__CopyTargetAssignment_3_1_1"
    // InternalDataflowDSL.g:8133:1: rule__Copy__CopyTargetAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Copy__CopyTargetAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8137:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8138:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8138:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8139:3: ( RULE_ID )
            {
             before(grammarAccess.getCopyAccess().getCopyTargetElementCrossReference_3_1_1_0()); 
            // InternalDataflowDSL.g:8140:3: ( RULE_ID )
            // InternalDataflowDSL.g:8141:4: RULE_ID
            {
             before(grammarAccess.getCopyAccess().getCopyTargetElementIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCopyTargetElementIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getCopyAccess().getCopyTargetElementCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__CopyTargetAssignment_3_1_1"


    // $ANTLR start "rule__Sort__NameAssignment_1"
    // InternalDataflowDSL.g:8152:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8156:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8157:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8157:2: ( RULE_ID )
            // InternalDataflowDSL.g:8158:3: RULE_ID
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


    // $ANTLR start "rule__Sort__SortByAssignment_3_0_1"
    // InternalDataflowDSL.g:8167:1: rule__Sort__SortByAssignment_3_0_1 : ( ruleConditionalExpression ) ;
    public final void rule__Sort__SortByAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8171:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8172:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8172:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8173:3: ruleConditionalExpression
            {
             before(grammarAccess.getSortAccess().getSortByConditionalExpressionParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getSortAccess().getSortByConditionalExpressionParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__SortByAssignment_3_0_1"


    // $ANTLR start "rule__Sort__TargetAssignment_3_1_1"
    // InternalDataflowDSL.g:8182:1: rule__Sort__TargetAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Sort__TargetAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8186:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8187:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8187:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8188:3: ( RULE_ID )
            {
             before(grammarAccess.getSortAccess().getTargetElementCrossReference_3_1_1_0()); 
            // InternalDataflowDSL.g:8189:3: ( RULE_ID )
            // InternalDataflowDSL.g:8190:4: RULE_ID
            {
             before(grammarAccess.getSortAccess().getTargetElementIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getTargetElementIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getSortAccess().getTargetElementCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__TargetAssignment_3_1_1"


    // $ANTLR start "rule__Product__NameAssignment_1"
    // InternalDataflowDSL.g:8201:1: rule__Product__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Product__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8205:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8206:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8206:2: ( RULE_ID )
            // InternalDataflowDSL.g:8207:3: RULE_ID
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
    // InternalDataflowDSL.g:8216:1: rule__Product__TargetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Product__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8220:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8221:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8221:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8222:3: ( RULE_ID )
            {
             before(grammarAccess.getProductAccess().getTargetElementCrossReference_3_1_0()); 
            // InternalDataflowDSL.g:8223:3: ( RULE_ID )
            // InternalDataflowDSL.g:8224:4: RULE_ID
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
    // InternalDataflowDSL.g:8235:1: rule__GetFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8239:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8240:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8240:2: ( RULE_ID )
            // InternalDataflowDSL.g:8241:3: RULE_ID
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


    // $ANTLR start "rule__GetFeature__ObjectFieldAssignment_3_0_1"
    // InternalDataflowDSL.g:8250:1: rule__GetFeature__ObjectFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__ObjectFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8254:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8255:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8255:2: ( RULE_ID )
            // InternalDataflowDSL.g:8256:3: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__ObjectFieldAssignment_3_0_1"


    // $ANTLR start "rule__GetFeature__ValueFieldAssignment_3_1_1"
    // InternalDataflowDSL.g:8265:1: rule__GetFeature__ValueFieldAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__ValueFieldAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8269:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8270:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8270:2: ( RULE_ID )
            // InternalDataflowDSL.g:8271:3: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getValueFieldIDTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__ValueFieldAssignment_3_1_1"


    // $ANTLR start "rule__GetFeature__FeatureAssignment_3_2_1"
    // InternalDataflowDSL.g:8280:1: rule__GetFeature__FeatureAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__FeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8284:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8285:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8285:2: ( RULE_ID )
            // InternalDataflowDSL.g:8286:3: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getFeatureIDTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__FeatureAssignment_3_2_1"


    // $ANTLR start "rule__GetFeature__TargetAssignment_3_3_1"
    // InternalDataflowDSL.g:8295:1: rule__GetFeature__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetFeature__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8299:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8300:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8300:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8301:3: ( RULE_ID )
            {
             before(grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8302:3: ( RULE_ID )
            // InternalDataflowDSL.g:8303:4: RULE_ID
            {
             before(grammarAccess.getGetFeatureAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetFeatureAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetFeature__TargetAssignment_3_3_1"


    // $ANTLR start "rule__SetFeature__NameAssignment_1"
    // InternalDataflowDSL.g:8314:1: rule__SetFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8318:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8319:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8319:2: ( RULE_ID )
            // InternalDataflowDSL.g:8320:3: RULE_ID
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


    // $ANTLR start "rule__SetFeature__ObjectFieldAssignment_3_0_1"
    // InternalDataflowDSL.g:8329:1: rule__SetFeature__ObjectFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__ObjectFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8333:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8334:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8334:2: ( RULE_ID )
            // InternalDataflowDSL.g:8335:3: RULE_ID
            {
             before(grammarAccess.getSetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getObjectFieldIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__ObjectFieldAssignment_3_0_1"


    // $ANTLR start "rule__SetFeature__ValueAssignment_3_1_1"
    // InternalDataflowDSL.g:8344:1: rule__SetFeature__ValueAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__SetFeature__ValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8348:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8349:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8349:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8350:3: ruleConditionalExpression
            {
             before(grammarAccess.getSetFeatureAccess().getValueConditionalExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getSetFeatureAccess().getValueConditionalExpressionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__ValueAssignment_3_1_1"


    // $ANTLR start "rule__SetFeature__FeatureAssignment_3_2_1"
    // InternalDataflowDSL.g:8359:1: rule__SetFeature__FeatureAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__FeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8363:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8364:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8364:2: ( RULE_ID )
            // InternalDataflowDSL.g:8365:3: RULE_ID
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getFeatureIDTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__FeatureAssignment_3_2_1"


    // $ANTLR start "rule__SetFeature__TargetAssignment_3_3_1"
    // InternalDataflowDSL.g:8374:1: rule__SetFeature__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetFeature__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8378:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8379:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8379:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8380:3: ( RULE_ID )
            {
             before(grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8381:3: ( RULE_ID )
            // InternalDataflowDSL.g:8382:4: RULE_ID
            {
             before(grammarAccess.getSetFeatureAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetFeatureAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetFeature__TargetAssignment_3_3_1"


    // $ANTLR start "rule__NewContainer__NameAssignment_1"
    // InternalDataflowDSL.g:8393:1: rule__NewContainer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8397:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8398:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8398:2: ( RULE_ID )
            // InternalDataflowDSL.g:8399:3: RULE_ID
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
    // InternalDataflowDSL.g:8408:1: rule__NewContainer__ListFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__NewContainer__ListFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8412:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8413:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8413:2: ( RULE_ID )
            // InternalDataflowDSL.g:8414:3: RULE_ID
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
    // InternalDataflowDSL.g:8423:1: rule__NewContainer__ContainerTypeAssignment_4_1 : ( ruleContainerType ) ;
    public final void rule__NewContainer__ContainerTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8427:1: ( ( ruleContainerType ) )
            // InternalDataflowDSL.g:8428:2: ( ruleContainerType )
            {
            // InternalDataflowDSL.g:8428:2: ( ruleContainerType )
            // InternalDataflowDSL.g:8429:3: ruleContainerType
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
    // InternalDataflowDSL.g:8438:1: rule__NewContainer__TargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewContainer__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8442:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8443:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8443:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8444:3: ( RULE_ID )
            {
             before(grammarAccess.getNewContainerAccess().getTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:8445:3: ( RULE_ID )
            // InternalDataflowDSL.g:8446:4: RULE_ID
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
    // InternalDataflowDSL.g:8457:1: rule__AddToContainer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8461:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8462:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8462:2: ( RULE_ID )
            // InternalDataflowDSL.g:8463:3: RULE_ID
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


    // $ANTLR start "rule__AddToContainer__ListFieldAssignment_3_0_1"
    // InternalDataflowDSL.g:8472:1: rule__AddToContainer__ListFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__ListFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8476:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8477:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8477:2: ( RULE_ID )
            // InternalDataflowDSL.g:8478:3: RULE_ID
            {
             before(grammarAccess.getAddToContainerAccess().getListFieldIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getListFieldIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__ListFieldAssignment_3_0_1"


    // $ANTLR start "rule__AddToContainer__ValueAssignment_3_1_1"
    // InternalDataflowDSL.g:8487:1: rule__AddToContainer__ValueAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__AddToContainer__ValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8491:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8492:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8492:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8493:3: ruleConditionalExpression
            {
             before(grammarAccess.getAddToContainerAccess().getValueConditionalExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getAddToContainerAccess().getValueConditionalExpressionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__ValueAssignment_3_1_1"


    // $ANTLR start "rule__AddToContainer__PositionAssignment_3_2_1"
    // InternalDataflowDSL.g:8502:1: rule__AddToContainer__PositionAssignment_3_2_1 : ( ruleConditionalExpression ) ;
    public final void rule__AddToContainer__PositionAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8506:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8507:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8507:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8508:3: ruleConditionalExpression
            {
             before(grammarAccess.getAddToContainerAccess().getPositionConditionalExpressionParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getAddToContainerAccess().getPositionConditionalExpressionParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__PositionAssignment_3_2_1"


    // $ANTLR start "rule__AddToContainer__TargetAssignment_3_3_1"
    // InternalDataflowDSL.g:8517:1: rule__AddToContainer__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AddToContainer__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8521:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8522:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8522:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8523:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8524:3: ( RULE_ID )
            // InternalDataflowDSL.g:8525:4: RULE_ID
            {
             before(grammarAccess.getAddToContainerAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToContainerAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddToContainer__TargetAssignment_3_3_1"


    // $ANTLR start "rule__ForEach__NameAssignment_1"
    // InternalDataflowDSL.g:8536:1: rule__ForEach__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForEach__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8540:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8541:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8541:2: ( RULE_ID )
            // InternalDataflowDSL.g:8542:3: RULE_ID
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


    // $ANTLR start "rule__ForEach__ListFieldAssignment_3_0_1"
    // InternalDataflowDSL.g:8551:1: rule__ForEach__ListFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__ForEach__ListFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8555:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8556:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8556:2: ( RULE_ID )
            // InternalDataflowDSL.g:8557:3: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getListFieldIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getListFieldIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__ListFieldAssignment_3_0_1"


    // $ANTLR start "rule__ForEach__ItemFieldAssignment_3_1_1"
    // InternalDataflowDSL.g:8566:1: rule__ForEach__ItemFieldAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__ForEach__ItemFieldAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8570:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8571:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8571:2: ( RULE_ID )
            // InternalDataflowDSL.g:8572:3: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getItemFieldIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getItemFieldIDTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__ItemFieldAssignment_3_1_1"


    // $ANTLR start "rule__ForEach__PositionFieldAssignment_3_2_1"
    // InternalDataflowDSL.g:8581:1: rule__ForEach__PositionFieldAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__ForEach__PositionFieldAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8585:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8586:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8586:2: ( RULE_ID )
            // InternalDataflowDSL.g:8587:3: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getPositionFieldIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getPositionFieldIDTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__PositionFieldAssignment_3_2_1"


    // $ANTLR start "rule__ForEach__TargetAssignment_3_3_1"
    // InternalDataflowDSL.g:8596:1: rule__ForEach__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8600:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8601:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8601:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8602:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8603:3: ( RULE_ID )
            // InternalDataflowDSL.g:8604:4: RULE_ID
            {
             before(grammarAccess.getForEachAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getTargetElementIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getForEachAccess().getTargetElementCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEach__TargetAssignment_3_3_1"


    // $ANTLR start "rule__CollectBy__NameAssignment_1"
    // InternalDataflowDSL.g:8615:1: rule__CollectBy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CollectBy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8619:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8620:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8620:2: ( RULE_ID )
            // InternalDataflowDSL.g:8621:3: RULE_ID
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


    // $ANTLR start "rule__CollectBy__CollectByAssignment_3_0_1"
    // InternalDataflowDSL.g:8630:1: rule__CollectBy__CollectByAssignment_3_0_1 : ( ruleConditionalExpression ) ;
    public final void rule__CollectBy__CollectByAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8634:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8635:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8635:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8636:3: ruleConditionalExpression
            {
             before(grammarAccess.getCollectByAccess().getCollectByConditionalExpressionParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getCollectByAccess().getCollectByConditionalExpressionParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__CollectByAssignment_3_0_1"


    // $ANTLR start "rule__CollectBy__TargetAssignment_3_1_1"
    // InternalDataflowDSL.g:8645:1: rule__CollectBy__TargetAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CollectBy__TargetAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8649:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8650:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8650:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8651:3: ( RULE_ID )
            {
             before(grammarAccess.getCollectByAccess().getTargetElementCrossReference_3_1_1_0()); 
            // InternalDataflowDSL.g:8652:3: ( RULE_ID )
            // InternalDataflowDSL.g:8653:4: RULE_ID
            {
             before(grammarAccess.getCollectByAccess().getTargetElementIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getTargetElementIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getCollectByAccess().getTargetElementCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__TargetAssignment_3_1_1"


    // $ANTLR start "rule__Evaluate__NameAssignment_1"
    // InternalDataflowDSL.g:8664:1: rule__Evaluate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Evaluate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8668:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8669:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8669:2: ( RULE_ID )
            // InternalDataflowDSL.g:8670:3: RULE_ID
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


    // $ANTLR start "rule__Evaluate__FieldAssignment_3_0_1"
    // InternalDataflowDSL.g:8679:1: rule__Evaluate__FieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__Evaluate__FieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8683:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8684:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8684:2: ( RULE_ID )
            // InternalDataflowDSL.g:8685:3: RULE_ID
            {
             before(grammarAccess.getEvaluateAccess().getFieldIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getFieldIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__FieldAssignment_3_0_1"


    // $ANTLR start "rule__Evaluate__ExpressionAssignment_3_1_1"
    // InternalDataflowDSL.g:8694:1: rule__Evaluate__ExpressionAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__Evaluate__ExpressionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8698:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8699:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8699:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8700:3: ruleConditionalExpression
            {
             before(grammarAccess.getEvaluateAccess().getExpressionConditionalExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getEvaluateAccess().getExpressionConditionalExpressionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__ExpressionAssignment_3_1_1"


    // $ANTLR start "rule__Evaluate__TargetAssignment_3_2_1"
    // InternalDataflowDSL.g:8709:1: rule__Evaluate__TargetAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Evaluate__TargetAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8713:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8714:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8714:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8715:3: ( RULE_ID )
            {
             before(grammarAccess.getEvaluateAccess().getTargetElementCrossReference_3_2_1_0()); 
            // InternalDataflowDSL.g:8716:3: ( RULE_ID )
            // InternalDataflowDSL.g:8717:4: RULE_ID
            {
             before(grammarAccess.getEvaluateAccess().getTargetElementIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getTargetElementIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getEvaluateAccess().getTargetElementCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__TargetAssignment_3_2_1"


    // $ANTLR start "rule__ConditionalExpression__ThenExpressionAssignment_0_4"
    // InternalDataflowDSL.g:8728:1: rule__ConditionalExpression__ThenExpressionAssignment_0_4 : ( ruleOrExpression ) ;
    public final void rule__ConditionalExpression__ThenExpressionAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8732:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8733:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8733:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8734:3: ruleOrExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getThenExpressionOrExpressionParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getThenExpressionOrExpressionParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__ThenExpressionAssignment_0_4"


    // $ANTLR start "rule__ConditionalExpression__ElseExpressionAssignment_0_6"
    // InternalDataflowDSL.g:8743:1: rule__ConditionalExpression__ElseExpressionAssignment_0_6 : ( ruleOrExpression ) ;
    public final void rule__ConditionalExpression__ElseExpressionAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8747:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8748:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8748:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8749:3: ruleOrExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getElseExpressionOrExpressionParserRuleCall_0_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getElseExpressionOrExpressionParserRuleCall_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__ElseExpressionAssignment_0_6"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalDataflowDSL.g:8758:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8762:1: ( ( ruleOrOperator ) )
            // InternalDataflowDSL.g:8763:2: ( ruleOrOperator )
            {
            // InternalDataflowDSL.g:8763:2: ( ruleOrOperator )
            // InternalDataflowDSL.g:8764:3: ruleOrOperator
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
    // InternalDataflowDSL.g:8773:1: rule__OrExpression__RightExpressionAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8777:1: ( ( ruleAndExpression ) )
            // InternalDataflowDSL.g:8778:2: ( ruleAndExpression )
            {
            // InternalDataflowDSL.g:8778:2: ( ruleAndExpression )
            // InternalDataflowDSL.g:8779:3: ruleAndExpression
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
    // InternalDataflowDSL.g:8788:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8792:1: ( ( ruleAndOperator ) )
            // InternalDataflowDSL.g:8793:2: ( ruleAndOperator )
            {
            // InternalDataflowDSL.g:8793:2: ( ruleAndOperator )
            // InternalDataflowDSL.g:8794:3: ruleAndOperator
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
    // InternalDataflowDSL.g:8803:1: rule__AndExpression__RightExpressionAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8807:1: ( ( ruleEqualityExpression ) )
            // InternalDataflowDSL.g:8808:2: ( ruleEqualityExpression )
            {
            // InternalDataflowDSL.g:8808:2: ( ruleEqualityExpression )
            // InternalDataflowDSL.g:8809:3: ruleEqualityExpression
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
    // InternalDataflowDSL.g:8818:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8822:1: ( ( ruleEqualityOperator ) )
            // InternalDataflowDSL.g:8823:2: ( ruleEqualityOperator )
            {
            // InternalDataflowDSL.g:8823:2: ( ruleEqualityOperator )
            // InternalDataflowDSL.g:8824:3: ruleEqualityOperator
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
    // InternalDataflowDSL.g:8833:1: rule__EqualityExpression__RightExpressionAssignment_1_2 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8837:1: ( ( ruleRelationalExpression ) )
            // InternalDataflowDSL.g:8838:2: ( ruleRelationalExpression )
            {
            // InternalDataflowDSL.g:8838:2: ( ruleRelationalExpression )
            // InternalDataflowDSL.g:8839:3: ruleRelationalExpression
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
    // InternalDataflowDSL.g:8848:1: rule__RelationalExpression__OperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8852:1: ( ( ruleRelationalOperator ) )
            // InternalDataflowDSL.g:8853:2: ( ruleRelationalOperator )
            {
            // InternalDataflowDSL.g:8853:2: ( ruleRelationalOperator )
            // InternalDataflowDSL.g:8854:3: ruleRelationalOperator
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
    // InternalDataflowDSL.g:8863:1: rule__RelationalExpression__RightExpressionAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8867:1: ( ( ruleAdditiveExpression ) )
            // InternalDataflowDSL.g:8868:2: ( ruleAdditiveExpression )
            {
            // InternalDataflowDSL.g:8868:2: ( ruleAdditiveExpression )
            // InternalDataflowDSL.g:8869:3: ruleAdditiveExpression
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
    // InternalDataflowDSL.g:8878:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8882:1: ( ( ruleAdditiveOperator ) )
            // InternalDataflowDSL.g:8883:2: ( ruleAdditiveOperator )
            {
            // InternalDataflowDSL.g:8883:2: ( ruleAdditiveOperator )
            // InternalDataflowDSL.g:8884:3: ruleAdditiveOperator
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
    // InternalDataflowDSL.g:8893:1: rule__AdditiveExpression__RightExpressionAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8897:1: ( ( ruleMultiplicativeExpression ) )
            // InternalDataflowDSL.g:8898:2: ( ruleMultiplicativeExpression )
            {
            // InternalDataflowDSL.g:8898:2: ( ruleMultiplicativeExpression )
            // InternalDataflowDSL.g:8899:3: ruleMultiplicativeExpression
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
    // InternalDataflowDSL.g:8908:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8912:1: ( ( ruleMultiplicativeOperator ) )
            // InternalDataflowDSL.g:8913:2: ( ruleMultiplicativeOperator )
            {
            // InternalDataflowDSL.g:8913:2: ( ruleMultiplicativeOperator )
            // InternalDataflowDSL.g:8914:3: ruleMultiplicativeOperator
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
    // InternalDataflowDSL.g:8923:1: rule__MultiplicativeExpression__RightExpressionAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8927:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:8928:2: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:8928:2: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:8929:3: ruleUnaryExpression
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
    // InternalDataflowDSL.g:8938:1: rule__UnaryExpression__OperatorAssignment_0_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8942:1: ( ( ruleUnaryOperator ) )
            // InternalDataflowDSL.g:8943:2: ( ruleUnaryOperator )
            {
            // InternalDataflowDSL.g:8943:2: ( ruleUnaryOperator )
            // InternalDataflowDSL.g:8944:3: ruleUnaryOperator
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
    // InternalDataflowDSL.g:8953:1: rule__UnaryExpression__ExpressionAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8957:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:8958:2: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:8958:2: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:8959:3: ruleUnaryExpression
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
    // InternalDataflowDSL.g:8968:1: rule__FeatureCallExpression__FeatureAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__FeatureCallExpression__FeatureAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8972:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8973:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8973:2: ( RULE_ID )
            // InternalDataflowDSL.g:8974:3: RULE_ID
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
    // InternalDataflowDSL.g:8983:1: rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 : ( ruleOrExpression ) ;
    public final void rule__FeatureCallExpression__ParametersAssignment_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8987:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8988:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8988:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8989:3: ruleOrExpression
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
    // InternalDataflowDSL.g:8998:1: rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 : ( ruleOrExpression ) ;
    public final void rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9002:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:9003:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:9003:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:9004:3: ruleOrExpression
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
    // InternalDataflowDSL.g:9013:1: rule__PrimaryExpression__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__PrimaryExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9017:1: ( ( ruleEInt ) )
            // InternalDataflowDSL.g:9018:2: ( ruleEInt )
            {
            // InternalDataflowDSL.g:9018:2: ( ruleEInt )
            // InternalDataflowDSL.g:9019:3: ruleEInt
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
    // InternalDataflowDSL.g:9028:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9032:1: ( ( ruleEBoolean ) )
            // InternalDataflowDSL.g:9033:2: ( ruleEBoolean )
            {
            // InternalDataflowDSL.g:9033:2: ( ruleEBoolean )
            // InternalDataflowDSL.g:9034:3: ruleEBoolean
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
    // InternalDataflowDSL.g:9043:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9047:1: ( ( ruleEDouble ) )
            // InternalDataflowDSL.g:9048:2: ( ruleEDouble )
            {
            // InternalDataflowDSL.g:9048:2: ( ruleEDouble )
            // InternalDataflowDSL.g:9049:3: ruleEDouble
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
    // InternalDataflowDSL.g:9058:1: rule__PrimaryExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9062:1: ( ( RULE_STRING ) )
            // InternalDataflowDSL.g:9063:2: ( RULE_STRING )
            {
            // InternalDataflowDSL.g:9063:2: ( RULE_STRING )
            // InternalDataflowDSL.g:9064:3: RULE_STRING
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
    // InternalDataflowDSL.g:9073:1: rule__PrimaryExpression__FieldAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__FieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9077:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:9078:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:9078:2: ( RULE_ID )
            // InternalDataflowDSL.g:9079:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8AA3528080000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8AA3528080000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004E00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004C00000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000014E00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000014C00000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000044006070L,0x00000000000000C8L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000C4200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000C4000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000204200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000204000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000804200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000804000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x001C004200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x001C004000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0050004600000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0050004400000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0100004600000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0440004600000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0440004400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x7000004200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x7000004000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004200000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004600000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004400000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000044006070L,0x00000000000001C8L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000004000010L});

}