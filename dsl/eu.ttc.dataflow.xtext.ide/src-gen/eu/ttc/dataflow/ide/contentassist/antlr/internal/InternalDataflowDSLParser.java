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
    // InternalDataflowDSL.g:1228:1: rule__CollectBy__Alternatives_3 : ( ( ( rule__CollectBy__Group_3_0__0 ) ) | ( ( rule__CollectBy__Group_3_1__0 ) ) | ( ( rule__CollectBy__Group_3_2__0 ) ) );
    public final void rule__CollectBy__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1232:1: ( ( ( rule__CollectBy__Group_3_0__0 ) ) | ( ( rule__CollectBy__Group_3_1__0 ) ) | ( ( rule__CollectBy__Group_3_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt11=1;
                }
                break;
            case 64:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            default:
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
                case 3 :
                    // InternalDataflowDSL.g:1245:2: ( ( rule__CollectBy__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1245:2: ( ( rule__CollectBy__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1246:3: ( rule__CollectBy__Group_3_2__0 )
                    {
                     before(grammarAccess.getCollectByAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1247:3: ( rule__CollectBy__Group_3_2__0 )
                    // InternalDataflowDSL.g:1247:4: rule__CollectBy__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectBy__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCollectByAccess().getGroup_3_2()); 

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
    // InternalDataflowDSL.g:1255:1: rule__Evaluate__Alternatives_3 : ( ( ( rule__Evaluate__Group_3_0__0 ) ) | ( ( rule__Evaluate__Group_3_1__0 ) ) | ( ( rule__Evaluate__Group_3_2__0 ) ) );
    public final void rule__Evaluate__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1259:1: ( ( ( rule__Evaluate__Group_3_0__0 ) ) | ( ( rule__Evaluate__Group_3_1__0 ) ) | ( ( rule__Evaluate__Group_3_2__0 ) ) )
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
                    // InternalDataflowDSL.g:1260:2: ( ( rule__Evaluate__Group_3_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1260:2: ( ( rule__Evaluate__Group_3_0__0 ) )
                    // InternalDataflowDSL.g:1261:3: ( rule__Evaluate__Group_3_0__0 )
                    {
                     before(grammarAccess.getEvaluateAccess().getGroup_3_0()); 
                    // InternalDataflowDSL.g:1262:3: ( rule__Evaluate__Group_3_0__0 )
                    // InternalDataflowDSL.g:1262:4: rule__Evaluate__Group_3_0__0
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
                    // InternalDataflowDSL.g:1266:2: ( ( rule__Evaluate__Group_3_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1266:2: ( ( rule__Evaluate__Group_3_1__0 ) )
                    // InternalDataflowDSL.g:1267:3: ( rule__Evaluate__Group_3_1__0 )
                    {
                     before(grammarAccess.getEvaluateAccess().getGroup_3_1()); 
                    // InternalDataflowDSL.g:1268:3: ( rule__Evaluate__Group_3_1__0 )
                    // InternalDataflowDSL.g:1268:4: rule__Evaluate__Group_3_1__0
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
                    // InternalDataflowDSL.g:1272:2: ( ( rule__Evaluate__Group_3_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1272:2: ( ( rule__Evaluate__Group_3_2__0 ) )
                    // InternalDataflowDSL.g:1273:3: ( rule__Evaluate__Group_3_2__0 )
                    {
                     before(grammarAccess.getEvaluateAccess().getGroup_3_2()); 
                    // InternalDataflowDSL.g:1274:3: ( rule__Evaluate__Group_3_2__0 )
                    // InternalDataflowDSL.g:1274:4: rule__Evaluate__Group_3_2__0
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
    // InternalDataflowDSL.g:1282:1: rule__ConditionalExpression__Alternatives : ( ( ( rule__ConditionalExpression__Group_0__0 ) ) | ( ruleOrExpression ) );
    public final void rule__ConditionalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1286:1: ( ( ( rule__ConditionalExpression__Group_0__0 ) ) | ( ruleOrExpression ) )
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
                    // InternalDataflowDSL.g:1287:2: ( ( rule__ConditionalExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1287:2: ( ( rule__ConditionalExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:1288:3: ( rule__ConditionalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getConditionalExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:1289:3: ( rule__ConditionalExpression__Group_0__0 )
                    // InternalDataflowDSL.g:1289:4: rule__ConditionalExpression__Group_0__0
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
                    // InternalDataflowDSL.g:1293:2: ( ruleOrExpression )
                    {
                    // InternalDataflowDSL.g:1293:2: ( ruleOrExpression )
                    // InternalDataflowDSL.g:1294:3: ruleOrExpression
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
    // InternalDataflowDSL.g:1303:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleFeatureCallExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1307:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleFeatureCallExpression ) )
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
                    // InternalDataflowDSL.g:1308:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1308:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:1309:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:1310:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalDataflowDSL.g:1310:4: rule__UnaryExpression__Group_0__0
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
                    // InternalDataflowDSL.g:1314:2: ( ruleFeatureCallExpression )
                    {
                    // InternalDataflowDSL.g:1314:2: ( ruleFeatureCallExpression )
                    // InternalDataflowDSL.g:1315:3: ruleFeatureCallExpression
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
    // InternalDataflowDSL.g:1324:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1328:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==70) ) {
                    int LA15_7 = input.LA(3);

                    if ( (LA15_7==RULE_INT) ) {
                        alt15=3;
                    }
                    else if ( (LA15_7==RULE_ID) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 7, input);

                        throw nvae;
                    }
                }
                else if ( (LA15_1==EOF||(LA15_1>=11 && LA15_1<=12)||(LA15_1>=19 && LA15_1<=29)||(LA15_1>=33 && LA15_1<=35)||LA15_1==38||LA15_1==40||(LA15_1>=42 && LA15_1<=43)||LA15_1==47||LA15_1==52||LA15_1==54||LA15_1==58||LA15_1==64||LA15_1==66||(LA15_1>=68 && LA15_1<=69)||(LA15_1>=72 && LA15_1<=73)) ) {
                    alt15=1;
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
                    // InternalDataflowDSL.g:1329:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalDataflowDSL.g:1329:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalDataflowDSL.g:1330:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalDataflowDSL.g:1331:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalDataflowDSL.g:1331:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalDataflowDSL.g:1335:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalDataflowDSL.g:1335:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalDataflowDSL.g:1336:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalDataflowDSL.g:1337:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalDataflowDSL.g:1337:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalDataflowDSL.g:1341:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalDataflowDSL.g:1341:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalDataflowDSL.g:1342:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalDataflowDSL.g:1343:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalDataflowDSL.g:1343:4: rule__PrimaryExpression__Group_2__0
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
                    // InternalDataflowDSL.g:1347:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalDataflowDSL.g:1347:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalDataflowDSL.g:1348:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalDataflowDSL.g:1349:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalDataflowDSL.g:1349:4: rule__PrimaryExpression__Group_3__0
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
                    // InternalDataflowDSL.g:1353:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalDataflowDSL.g:1353:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalDataflowDSL.g:1354:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalDataflowDSL.g:1355:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalDataflowDSL.g:1355:4: rule__PrimaryExpression__Group_4__0
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
                    // InternalDataflowDSL.g:1359:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // InternalDataflowDSL.g:1359:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // InternalDataflowDSL.g:1360:3: ( rule__PrimaryExpression__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    // InternalDataflowDSL.g:1361:3: ( rule__PrimaryExpression__Group_5__0 )
                    // InternalDataflowDSL.g:1361:4: rule__PrimaryExpression__Group_5__0
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
    // InternalDataflowDSL.g:1369:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1373:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalDataflowDSL.g:1374:2: ( 'true' )
                    {
                    // InternalDataflowDSL.g:1374:2: ( 'true' )
                    // InternalDataflowDSL.g:1375:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1380:2: ( 'false' )
                    {
                    // InternalDataflowDSL.g:1380:2: ( 'false' )
                    // InternalDataflowDSL.g:1381:3: 'false'
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
    // InternalDataflowDSL.g:1390:1: rule__EDouble__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1394:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalDataflowDSL.g:1395:2: ( 'E' )
                    {
                    // InternalDataflowDSL.g:1395:2: ( 'E' )
                    // InternalDataflowDSL.g:1396:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1401:2: ( 'e' )
                    {
                    // InternalDataflowDSL.g:1401:2: ( 'e' )
                    // InternalDataflowDSL.g:1402:3: 'e'
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
    // InternalDataflowDSL.g:1411:1: rule__ContainerType__Alternatives : ( ( ( 'list' ) ) | ( ( 'set' ) ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1415:1: ( ( ( 'list' ) ) | ( ( 'set' ) ) )
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
                    // InternalDataflowDSL.g:1416:2: ( ( 'list' ) )
                    {
                    // InternalDataflowDSL.g:1416:2: ( ( 'list' ) )
                    // InternalDataflowDSL.g:1417:3: ( 'list' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1418:3: ( 'list' )
                    // InternalDataflowDSL.g:1418:4: 'list'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getLISTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1422:2: ( ( 'set' ) )
                    {
                    // InternalDataflowDSL.g:1422:2: ( ( 'set' ) )
                    // InternalDataflowDSL.g:1423:3: ( 'set' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getSETEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1424:3: ( 'set' )
                    // InternalDataflowDSL.g:1424:4: 'set'
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
    // InternalDataflowDSL.g:1432:1: rule__EqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1436:1: ( ( ( '=' ) ) | ( ( '!=' ) ) )
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
                    // InternalDataflowDSL.g:1437:2: ( ( '=' ) )
                    {
                    // InternalDataflowDSL.g:1437:2: ( ( '=' ) )
                    // InternalDataflowDSL.g:1438:3: ( '=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1439:3: ( '=' )
                    // InternalDataflowDSL.g:1439:4: '='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1443:2: ( ( '!=' ) )
                    {
                    // InternalDataflowDSL.g:1443:2: ( ( '!=' ) )
                    // InternalDataflowDSL.g:1444:3: ( '!=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1445:3: ( '!=' )
                    // InternalDataflowDSL.g:1445:4: '!='
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
    // InternalDataflowDSL.g:1453:1: rule__RelationalOperator__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1457:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
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
                    // InternalDataflowDSL.g:1458:2: ( ( '>' ) )
                    {
                    // InternalDataflowDSL.g:1458:2: ( ( '>' ) )
                    // InternalDataflowDSL.g:1459:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1460:3: ( '>' )
                    // InternalDataflowDSL.g:1460:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1464:2: ( ( '>=' ) )
                    {
                    // InternalDataflowDSL.g:1464:2: ( ( '>=' ) )
                    // InternalDataflowDSL.g:1465:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1466:3: ( '>=' )
                    // InternalDataflowDSL.g:1466:4: '>='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1470:2: ( ( '<' ) )
                    {
                    // InternalDataflowDSL.g:1470:2: ( ( '<' ) )
                    // InternalDataflowDSL.g:1471:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:1472:3: ( '<' )
                    // InternalDataflowDSL.g:1472:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getLTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflowDSL.g:1476:2: ( ( '<=' ) )
                    {
                    // InternalDataflowDSL.g:1476:2: ( ( '<=' ) )
                    // InternalDataflowDSL.g:1477:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLEEnumLiteralDeclaration_3()); 
                    // InternalDataflowDSL.g:1478:3: ( '<=' )
                    // InternalDataflowDSL.g:1478:4: '<='
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
    // InternalDataflowDSL.g:1486:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1490:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // InternalDataflowDSL.g:1491:2: ( ( '+' ) )
                    {
                    // InternalDataflowDSL.g:1491:2: ( ( '+' ) )
                    // InternalDataflowDSL.g:1492:3: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1493:3: ( '+' )
                    // InternalDataflowDSL.g:1493:4: '+'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1497:2: ( ( '-' ) )
                    {
                    // InternalDataflowDSL.g:1497:2: ( ( '-' ) )
                    // InternalDataflowDSL.g:1498:3: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1499:3: ( '-' )
                    // InternalDataflowDSL.g:1499:4: '-'
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
    // InternalDataflowDSL.g:1507:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1511:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
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
                    // InternalDataflowDSL.g:1512:2: ( ( '*' ) )
                    {
                    // InternalDataflowDSL.g:1512:2: ( ( '*' ) )
                    // InternalDataflowDSL.g:1513:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1514:3: ( '*' )
                    // InternalDataflowDSL.g:1514:4: '*'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1518:2: ( ( '/' ) )
                    {
                    // InternalDataflowDSL.g:1518:2: ( ( '/' ) )
                    // InternalDataflowDSL.g:1519:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1520:3: ( '/' )
                    // InternalDataflowDSL.g:1520:4: '/'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflowDSL.g:1524:2: ( ( '%' ) )
                    {
                    // InternalDataflowDSL.g:1524:2: ( ( '%' ) )
                    // InternalDataflowDSL.g:1525:3: ( '%' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                    // InternalDataflowDSL.g:1526:3: ( '%' )
                    // InternalDataflowDSL.g:1526:4: '%'
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
    // InternalDataflowDSL.g:1534:1: rule__UnaryOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1538:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
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
                    // InternalDataflowDSL.g:1539:2: ( ( 'not' ) )
                    {
                    // InternalDataflowDSL.g:1539:2: ( ( 'not' ) )
                    // InternalDataflowDSL.g:1540:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalDataflowDSL.g:1541:3: ( 'not' )
                    // InternalDataflowDSL.g:1541:4: 'not'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflowDSL.g:1545:2: ( ( '-' ) )
                    {
                    // InternalDataflowDSL.g:1545:2: ( ( '-' ) )
                    // InternalDataflowDSL.g:1546:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNEGATIONEnumLiteralDeclaration_1()); 
                    // InternalDataflowDSL.g:1547:3: ( '-' )
                    // InternalDataflowDSL.g:1547:4: '-'
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
    // InternalDataflowDSL.g:1555:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1559:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDataflowDSL.g:1560:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDataflowDSL.g:1567:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1571:1: ( ( () ) )
            // InternalDataflowDSL.g:1572:1: ( () )
            {
            // InternalDataflowDSL.g:1572:1: ( () )
            // InternalDataflowDSL.g:1573:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalDataflowDSL.g:1574:2: ()
            // InternalDataflowDSL.g:1574:3: 
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
    // InternalDataflowDSL.g:1582:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1586:1: ( rule__Model__Group__1__Impl )
            // InternalDataflowDSL.g:1587:2: rule__Model__Group__1__Impl
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
    // InternalDataflowDSL.g:1593:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1597:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // InternalDataflowDSL.g:1598:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // InternalDataflowDSL.g:1598:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // InternalDataflowDSL.g:1599:2: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalDataflowDSL.g:1600:2: ( rule__Model__ElementsAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31||LA24_0==39||LA24_0==41||LA24_0==44||LA24_0==46||(LA24_0>=48 && LA24_0<=49)||LA24_0==53||LA24_0==55||LA24_0==57||LA24_0==59||LA24_0==63||LA24_0==65) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDataflowDSL.g:1600:3: rule__Model__ElementsAssignment_1
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
    // InternalDataflowDSL.g:1609:1: rule__AllInstances__Group__0 : rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 ;
    public final void rule__AllInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1613:1: ( rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 )
            // InternalDataflowDSL.g:1614:2: rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1
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
    // InternalDataflowDSL.g:1621:1: rule__AllInstances__Group__0__Impl : ( 'AllInstances' ) ;
    public final void rule__AllInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1625:1: ( ( 'AllInstances' ) )
            // InternalDataflowDSL.g:1626:1: ( 'AllInstances' )
            {
            // InternalDataflowDSL.g:1626:1: ( 'AllInstances' )
            // InternalDataflowDSL.g:1627:2: 'AllInstances'
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
    // InternalDataflowDSL.g:1636:1: rule__AllInstances__Group__1 : rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2 ;
    public final void rule__AllInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1640:1: ( rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2 )
            // InternalDataflowDSL.g:1641:2: rule__AllInstances__Group__1__Impl rule__AllInstances__Group__2
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
    // InternalDataflowDSL.g:1648:1: rule__AllInstances__Group__1__Impl : ( ( rule__AllInstances__NameAssignment_1 ) ) ;
    public final void rule__AllInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1652:1: ( ( ( rule__AllInstances__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:1653:1: ( ( rule__AllInstances__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:1653:1: ( ( rule__AllInstances__NameAssignment_1 ) )
            // InternalDataflowDSL.g:1654:2: ( rule__AllInstances__NameAssignment_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:1655:2: ( rule__AllInstances__NameAssignment_1 )
            // InternalDataflowDSL.g:1655:3: rule__AllInstances__NameAssignment_1
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
    // InternalDataflowDSL.g:1663:1: rule__AllInstances__Group__2 : rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3 ;
    public final void rule__AllInstances__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1667:1: ( rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3 )
            // InternalDataflowDSL.g:1668:2: rule__AllInstances__Group__2__Impl rule__AllInstances__Group__3
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
    // InternalDataflowDSL.g:1675:1: rule__AllInstances__Group__2__Impl : ( '{' ) ;
    public final void rule__AllInstances__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1679:1: ( ( '{' ) )
            // InternalDataflowDSL.g:1680:1: ( '{' )
            {
            // InternalDataflowDSL.g:1680:1: ( '{' )
            // InternalDataflowDSL.g:1681:2: '{'
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
    // InternalDataflowDSL.g:1690:1: rule__AllInstances__Group__3 : rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4 ;
    public final void rule__AllInstances__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1694:1: ( rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4 )
            // InternalDataflowDSL.g:1695:2: rule__AllInstances__Group__3__Impl rule__AllInstances__Group__4
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
    // InternalDataflowDSL.g:1702:1: rule__AllInstances__Group__3__Impl : ( ( rule__AllInstances__Alternatives_3 )* ) ;
    public final void rule__AllInstances__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1706:1: ( ( ( rule__AllInstances__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:1707:1: ( ( rule__AllInstances__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:1707:1: ( ( rule__AllInstances__Alternatives_3 )* )
            // InternalDataflowDSL.g:1708:2: ( rule__AllInstances__Alternatives_3 )*
            {
             before(grammarAccess.getAllInstancesAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:1709:2: ( rule__AllInstances__Alternatives_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=34 && LA25_0<=35)||LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDataflowDSL.g:1709:3: rule__AllInstances__Alternatives_3
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
    // InternalDataflowDSL.g:1717:1: rule__AllInstances__Group__4 : rule__AllInstances__Group__4__Impl ;
    public final void rule__AllInstances__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1721:1: ( rule__AllInstances__Group__4__Impl )
            // InternalDataflowDSL.g:1722:2: rule__AllInstances__Group__4__Impl
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
    // InternalDataflowDSL.g:1728:1: rule__AllInstances__Group__4__Impl : ( '}' ) ;
    public final void rule__AllInstances__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1732:1: ( ( '}' ) )
            // InternalDataflowDSL.g:1733:1: ( '}' )
            {
            // InternalDataflowDSL.g:1733:1: ( '}' )
            // InternalDataflowDSL.g:1734:2: '}'
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
    // InternalDataflowDSL.g:1744:1: rule__AllInstances__Group_3_0__0 : rule__AllInstances__Group_3_0__0__Impl rule__AllInstances__Group_3_0__1 ;
    public final void rule__AllInstances__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1748:1: ( rule__AllInstances__Group_3_0__0__Impl rule__AllInstances__Group_3_0__1 )
            // InternalDataflowDSL.g:1749:2: rule__AllInstances__Group_3_0__0__Impl rule__AllInstances__Group_3_0__1
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
    // InternalDataflowDSL.g:1756:1: rule__AllInstances__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__AllInstances__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1760:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:1761:1: ( 'field' )
            {
            // InternalDataflowDSL.g:1761:1: ( 'field' )
            // InternalDataflowDSL.g:1762:2: 'field'
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
    // InternalDataflowDSL.g:1771:1: rule__AllInstances__Group_3_0__1 : rule__AllInstances__Group_3_0__1__Impl ;
    public final void rule__AllInstances__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1775:1: ( rule__AllInstances__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:1776:2: rule__AllInstances__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:1782:1: rule__AllInstances__Group_3_0__1__Impl : ( ( rule__AllInstances__FieldAssignment_3_0_1 ) ) ;
    public final void rule__AllInstances__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1786:1: ( ( ( rule__AllInstances__FieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:1787:1: ( ( rule__AllInstances__FieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:1787:1: ( ( rule__AllInstances__FieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:1788:2: ( rule__AllInstances__FieldAssignment_3_0_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:1789:2: ( rule__AllInstances__FieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:1789:3: rule__AllInstances__FieldAssignment_3_0_1
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
    // InternalDataflowDSL.g:1798:1: rule__AllInstances__Group_3_1__0 : rule__AllInstances__Group_3_1__0__Impl rule__AllInstances__Group_3_1__1 ;
    public final void rule__AllInstances__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1802:1: ( rule__AllInstances__Group_3_1__0__Impl rule__AllInstances__Group_3_1__1 )
            // InternalDataflowDSL.g:1803:2: rule__AllInstances__Group_3_1__0__Impl rule__AllInstances__Group_3_1__1
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
    // InternalDataflowDSL.g:1810:1: rule__AllInstances__Group_3_1__0__Impl : ( 'type' ) ;
    public final void rule__AllInstances__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1814:1: ( ( 'type' ) )
            // InternalDataflowDSL.g:1815:1: ( 'type' )
            {
            // InternalDataflowDSL.g:1815:1: ( 'type' )
            // InternalDataflowDSL.g:1816:2: 'type'
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
    // InternalDataflowDSL.g:1825:1: rule__AllInstances__Group_3_1__1 : rule__AllInstances__Group_3_1__1__Impl rule__AllInstances__Group_3_1__2 ;
    public final void rule__AllInstances__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1829:1: ( rule__AllInstances__Group_3_1__1__Impl rule__AllInstances__Group_3_1__2 )
            // InternalDataflowDSL.g:1830:2: rule__AllInstances__Group_3_1__1__Impl rule__AllInstances__Group_3_1__2
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
    // InternalDataflowDSL.g:1837:1: rule__AllInstances__Group_3_1__1__Impl : ( ( rule__AllInstances__Group_3_1_1__0 )? ) ;
    public final void rule__AllInstances__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1841:1: ( ( ( rule__AllInstances__Group_3_1_1__0 )? ) )
            // InternalDataflowDSL.g:1842:1: ( ( rule__AllInstances__Group_3_1_1__0 )? )
            {
            // InternalDataflowDSL.g:1842:1: ( ( rule__AllInstances__Group_3_1_1__0 )? )
            // InternalDataflowDSL.g:1843:2: ( rule__AllInstances__Group_3_1_1__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_3_1_1()); 
            // InternalDataflowDSL.g:1844:2: ( rule__AllInstances__Group_3_1_1__0 )?
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
                    // InternalDataflowDSL.g:1844:3: rule__AllInstances__Group_3_1_1__0
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
    // InternalDataflowDSL.g:1852:1: rule__AllInstances__Group_3_1__2 : rule__AllInstances__Group_3_1__2__Impl rule__AllInstances__Group_3_1__3 ;
    public final void rule__AllInstances__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1856:1: ( rule__AllInstances__Group_3_1__2__Impl rule__AllInstances__Group_3_1__3 )
            // InternalDataflowDSL.g:1857:2: rule__AllInstances__Group_3_1__2__Impl rule__AllInstances__Group_3_1__3
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
    // InternalDataflowDSL.g:1864:1: rule__AllInstances__Group_3_1__2__Impl : ( ( rule__AllInstances__Group_3_1_2__0 )? ) ;
    public final void rule__AllInstances__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1868:1: ( ( ( rule__AllInstances__Group_3_1_2__0 )? ) )
            // InternalDataflowDSL.g:1869:1: ( ( rule__AllInstances__Group_3_1_2__0 )? )
            {
            // InternalDataflowDSL.g:1869:1: ( ( rule__AllInstances__Group_3_1_2__0 )? )
            // InternalDataflowDSL.g:1870:2: ( rule__AllInstances__Group_3_1_2__0 )?
            {
             before(grammarAccess.getAllInstancesAccess().getGroup_3_1_2()); 
            // InternalDataflowDSL.g:1871:2: ( rule__AllInstances__Group_3_1_2__0 )?
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
                    // InternalDataflowDSL.g:1871:3: rule__AllInstances__Group_3_1_2__0
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
    // InternalDataflowDSL.g:1879:1: rule__AllInstances__Group_3_1__3 : rule__AllInstances__Group_3_1__3__Impl ;
    public final void rule__AllInstances__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1883:1: ( rule__AllInstances__Group_3_1__3__Impl )
            // InternalDataflowDSL.g:1884:2: rule__AllInstances__Group_3_1__3__Impl
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
    // InternalDataflowDSL.g:1890:1: rule__AllInstances__Group_3_1__3__Impl : ( ( rule__AllInstances__TypeNameAssignment_3_1_3 ) ) ;
    public final void rule__AllInstances__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1894:1: ( ( ( rule__AllInstances__TypeNameAssignment_3_1_3 ) ) )
            // InternalDataflowDSL.g:1895:1: ( ( rule__AllInstances__TypeNameAssignment_3_1_3 ) )
            {
            // InternalDataflowDSL.g:1895:1: ( ( rule__AllInstances__TypeNameAssignment_3_1_3 ) )
            // InternalDataflowDSL.g:1896:2: ( rule__AllInstances__TypeNameAssignment_3_1_3 )
            {
             before(grammarAccess.getAllInstancesAccess().getTypeNameAssignment_3_1_3()); 
            // InternalDataflowDSL.g:1897:2: ( rule__AllInstances__TypeNameAssignment_3_1_3 )
            // InternalDataflowDSL.g:1897:3: rule__AllInstances__TypeNameAssignment_3_1_3
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
    // InternalDataflowDSL.g:1906:1: rule__AllInstances__Group_3_1_1__0 : rule__AllInstances__Group_3_1_1__0__Impl rule__AllInstances__Group_3_1_1__1 ;
    public final void rule__AllInstances__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1910:1: ( rule__AllInstances__Group_3_1_1__0__Impl rule__AllInstances__Group_3_1_1__1 )
            // InternalDataflowDSL.g:1911:2: rule__AllInstances__Group_3_1_1__0__Impl rule__AllInstances__Group_3_1_1__1
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
    // InternalDataflowDSL.g:1918:1: rule__AllInstances__Group_3_1_1__0__Impl : ( ( rule__AllInstances__ModelAssignment_3_1_1_0 ) ) ;
    public final void rule__AllInstances__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1922:1: ( ( ( rule__AllInstances__ModelAssignment_3_1_1_0 ) ) )
            // InternalDataflowDSL.g:1923:1: ( ( rule__AllInstances__ModelAssignment_3_1_1_0 ) )
            {
            // InternalDataflowDSL.g:1923:1: ( ( rule__AllInstances__ModelAssignment_3_1_1_0 ) )
            // InternalDataflowDSL.g:1924:2: ( rule__AllInstances__ModelAssignment_3_1_1_0 )
            {
             before(grammarAccess.getAllInstancesAccess().getModelAssignment_3_1_1_0()); 
            // InternalDataflowDSL.g:1925:2: ( rule__AllInstances__ModelAssignment_3_1_1_0 )
            // InternalDataflowDSL.g:1925:3: rule__AllInstances__ModelAssignment_3_1_1_0
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
    // InternalDataflowDSL.g:1933:1: rule__AllInstances__Group_3_1_1__1 : rule__AllInstances__Group_3_1_1__1__Impl ;
    public final void rule__AllInstances__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1937:1: ( rule__AllInstances__Group_3_1_1__1__Impl )
            // InternalDataflowDSL.g:1938:2: rule__AllInstances__Group_3_1_1__1__Impl
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
    // InternalDataflowDSL.g:1944:1: rule__AllInstances__Group_3_1_1__1__Impl : ( '!' ) ;
    public final void rule__AllInstances__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1948:1: ( ( '!' ) )
            // InternalDataflowDSL.g:1949:1: ( '!' )
            {
            // InternalDataflowDSL.g:1949:1: ( '!' )
            // InternalDataflowDSL.g:1950:2: '!'
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
    // InternalDataflowDSL.g:1960:1: rule__AllInstances__Group_3_1_2__0 : rule__AllInstances__Group_3_1_2__0__Impl rule__AllInstances__Group_3_1_2__1 ;
    public final void rule__AllInstances__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1964:1: ( rule__AllInstances__Group_3_1_2__0__Impl rule__AllInstances__Group_3_1_2__1 )
            // InternalDataflowDSL.g:1965:2: rule__AllInstances__Group_3_1_2__0__Impl rule__AllInstances__Group_3_1_2__1
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
    // InternalDataflowDSL.g:1972:1: rule__AllInstances__Group_3_1_2__0__Impl : ( ( rule__AllInstances__PackageNameAssignment_3_1_2_0 ) ) ;
    public final void rule__AllInstances__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1976:1: ( ( ( rule__AllInstances__PackageNameAssignment_3_1_2_0 ) ) )
            // InternalDataflowDSL.g:1977:1: ( ( rule__AllInstances__PackageNameAssignment_3_1_2_0 ) )
            {
            // InternalDataflowDSL.g:1977:1: ( ( rule__AllInstances__PackageNameAssignment_3_1_2_0 ) )
            // InternalDataflowDSL.g:1978:2: ( rule__AllInstances__PackageNameAssignment_3_1_2_0 )
            {
             before(grammarAccess.getAllInstancesAccess().getPackageNameAssignment_3_1_2_0()); 
            // InternalDataflowDSL.g:1979:2: ( rule__AllInstances__PackageNameAssignment_3_1_2_0 )
            // InternalDataflowDSL.g:1979:3: rule__AllInstances__PackageNameAssignment_3_1_2_0
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
    // InternalDataflowDSL.g:1987:1: rule__AllInstances__Group_3_1_2__1 : rule__AllInstances__Group_3_1_2__1__Impl ;
    public final void rule__AllInstances__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:1991:1: ( rule__AllInstances__Group_3_1_2__1__Impl )
            // InternalDataflowDSL.g:1992:2: rule__AllInstances__Group_3_1_2__1__Impl
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
    // InternalDataflowDSL.g:1998:1: rule__AllInstances__Group_3_1_2__1__Impl : ( '::' ) ;
    public final void rule__AllInstances__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2002:1: ( ( '::' ) )
            // InternalDataflowDSL.g:2003:1: ( '::' )
            {
            // InternalDataflowDSL.g:2003:1: ( '::' )
            // InternalDataflowDSL.g:2004:2: '::'
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
    // InternalDataflowDSL.g:2014:1: rule__AllInstances__Group_3_2__0 : rule__AllInstances__Group_3_2__0__Impl rule__AllInstances__Group_3_2__1 ;
    public final void rule__AllInstances__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2018:1: ( rule__AllInstances__Group_3_2__0__Impl rule__AllInstances__Group_3_2__1 )
            // InternalDataflowDSL.g:2019:2: rule__AllInstances__Group_3_2__0__Impl rule__AllInstances__Group_3_2__1
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
    // InternalDataflowDSL.g:2026:1: rule__AllInstances__Group_3_2__0__Impl : ( 'target' ) ;
    public final void rule__AllInstances__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2030:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2031:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2031:1: ( 'target' )
            // InternalDataflowDSL.g:2032:2: 'target'
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
    // InternalDataflowDSL.g:2041:1: rule__AllInstances__Group_3_2__1 : rule__AllInstances__Group_3_2__1__Impl ;
    public final void rule__AllInstances__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2045:1: ( rule__AllInstances__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:2046:2: rule__AllInstances__Group_3_2__1__Impl
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
    // InternalDataflowDSL.g:2052:1: rule__AllInstances__Group_3_2__1__Impl : ( ( rule__AllInstances__TargetAssignment_3_2_1 ) ) ;
    public final void rule__AllInstances__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2056:1: ( ( ( rule__AllInstances__TargetAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:2057:1: ( ( rule__AllInstances__TargetAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:2057:1: ( ( rule__AllInstances__TargetAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:2058:2: ( rule__AllInstances__TargetAssignment_3_2_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getTargetAssignment_3_2_1()); 
            // InternalDataflowDSL.g:2059:2: ( rule__AllInstances__TargetAssignment_3_2_1 )
            // InternalDataflowDSL.g:2059:3: rule__AllInstances__TargetAssignment_3_2_1
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
    // InternalDataflowDSL.g:2068:1: rule__NewInstance__Group__0 : rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1 ;
    public final void rule__NewInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2072:1: ( rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1 )
            // InternalDataflowDSL.g:2073:2: rule__NewInstance__Group__0__Impl rule__NewInstance__Group__1
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
    // InternalDataflowDSL.g:2080:1: rule__NewInstance__Group__0__Impl : ( 'NewInstance' ) ;
    public final void rule__NewInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2084:1: ( ( 'NewInstance' ) )
            // InternalDataflowDSL.g:2085:1: ( 'NewInstance' )
            {
            // InternalDataflowDSL.g:2085:1: ( 'NewInstance' )
            // InternalDataflowDSL.g:2086:2: 'NewInstance'
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
    // InternalDataflowDSL.g:2095:1: rule__NewInstance__Group__1 : rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2 ;
    public final void rule__NewInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2099:1: ( rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2 )
            // InternalDataflowDSL.g:2100:2: rule__NewInstance__Group__1__Impl rule__NewInstance__Group__2
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
    // InternalDataflowDSL.g:2107:1: rule__NewInstance__Group__1__Impl : ( ( rule__NewInstance__NameAssignment_1 ) ) ;
    public final void rule__NewInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2111:1: ( ( ( rule__NewInstance__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2112:1: ( ( rule__NewInstance__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2112:1: ( ( rule__NewInstance__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2113:2: ( rule__NewInstance__NameAssignment_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2114:2: ( rule__NewInstance__NameAssignment_1 )
            // InternalDataflowDSL.g:2114:3: rule__NewInstance__NameAssignment_1
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
    // InternalDataflowDSL.g:2122:1: rule__NewInstance__Group__2 : rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3 ;
    public final void rule__NewInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2126:1: ( rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3 )
            // InternalDataflowDSL.g:2127:2: rule__NewInstance__Group__2__Impl rule__NewInstance__Group__3
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
    // InternalDataflowDSL.g:2134:1: rule__NewInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__NewInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2138:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2139:1: ( '{' )
            {
            // InternalDataflowDSL.g:2139:1: ( '{' )
            // InternalDataflowDSL.g:2140:2: '{'
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
    // InternalDataflowDSL.g:2149:1: rule__NewInstance__Group__3 : rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4 ;
    public final void rule__NewInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2153:1: ( rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4 )
            // InternalDataflowDSL.g:2154:2: rule__NewInstance__Group__3__Impl rule__NewInstance__Group__4
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
    // InternalDataflowDSL.g:2161:1: rule__NewInstance__Group__3__Impl : ( ( rule__NewInstance__Alternatives_3 )* ) ;
    public final void rule__NewInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2165:1: ( ( ( rule__NewInstance__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:2166:1: ( ( rule__NewInstance__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:2166:1: ( ( rule__NewInstance__Alternatives_3 )* )
            // InternalDataflowDSL.g:2167:2: ( rule__NewInstance__Alternatives_3 )*
            {
             before(grammarAccess.getNewInstanceAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:2168:2: ( rule__NewInstance__Alternatives_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=34 && LA28_0<=35)||LA28_0==38||LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDataflowDSL.g:2168:3: rule__NewInstance__Alternatives_3
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
    // InternalDataflowDSL.g:2176:1: rule__NewInstance__Group__4 : rule__NewInstance__Group__4__Impl ;
    public final void rule__NewInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2180:1: ( rule__NewInstance__Group__4__Impl )
            // InternalDataflowDSL.g:2181:2: rule__NewInstance__Group__4__Impl
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
    // InternalDataflowDSL.g:2187:1: rule__NewInstance__Group__4__Impl : ( '}' ) ;
    public final void rule__NewInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2191:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2192:1: ( '}' )
            {
            // InternalDataflowDSL.g:2192:1: ( '}' )
            // InternalDataflowDSL.g:2193:2: '}'
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
    // InternalDataflowDSL.g:2203:1: rule__NewInstance__Group_3_0__0 : rule__NewInstance__Group_3_0__0__Impl rule__NewInstance__Group_3_0__1 ;
    public final void rule__NewInstance__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2207:1: ( rule__NewInstance__Group_3_0__0__Impl rule__NewInstance__Group_3_0__1 )
            // InternalDataflowDSL.g:2208:2: rule__NewInstance__Group_3_0__0__Impl rule__NewInstance__Group_3_0__1
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
    // InternalDataflowDSL.g:2215:1: rule__NewInstance__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__NewInstance__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2219:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:2220:1: ( 'field' )
            {
            // InternalDataflowDSL.g:2220:1: ( 'field' )
            // InternalDataflowDSL.g:2221:2: 'field'
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
    // InternalDataflowDSL.g:2230:1: rule__NewInstance__Group_3_0__1 : rule__NewInstance__Group_3_0__1__Impl ;
    public final void rule__NewInstance__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2234:1: ( rule__NewInstance__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:2235:2: rule__NewInstance__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:2241:1: rule__NewInstance__Group_3_0__1__Impl : ( ( rule__NewInstance__InstanceFieldAssignment_3_0_1 ) ) ;
    public final void rule__NewInstance__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2245:1: ( ( ( rule__NewInstance__InstanceFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:2246:1: ( ( rule__NewInstance__InstanceFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:2246:1: ( ( rule__NewInstance__InstanceFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:2247:2: ( rule__NewInstance__InstanceFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getInstanceFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:2248:2: ( rule__NewInstance__InstanceFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:2248:3: rule__NewInstance__InstanceFieldAssignment_3_0_1
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
    // InternalDataflowDSL.g:2257:1: rule__NewInstance__Group_3_1__0 : rule__NewInstance__Group_3_1__0__Impl rule__NewInstance__Group_3_1__1 ;
    public final void rule__NewInstance__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2261:1: ( rule__NewInstance__Group_3_1__0__Impl rule__NewInstance__Group_3_1__1 )
            // InternalDataflowDSL.g:2262:2: rule__NewInstance__Group_3_1__0__Impl rule__NewInstance__Group_3_1__1
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
    // InternalDataflowDSL.g:2269:1: rule__NewInstance__Group_3_1__0__Impl : ( 'key' ) ;
    public final void rule__NewInstance__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2273:1: ( ( 'key' ) )
            // InternalDataflowDSL.g:2274:1: ( 'key' )
            {
            // InternalDataflowDSL.g:2274:1: ( 'key' )
            // InternalDataflowDSL.g:2275:2: 'key'
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
    // InternalDataflowDSL.g:2284:1: rule__NewInstance__Group_3_1__1 : rule__NewInstance__Group_3_1__1__Impl ;
    public final void rule__NewInstance__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2288:1: ( rule__NewInstance__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:2289:2: rule__NewInstance__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:2295:1: rule__NewInstance__Group_3_1__1__Impl : ( ( rule__NewInstance__KeyAssignment_3_1_1 ) ) ;
    public final void rule__NewInstance__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2299:1: ( ( ( rule__NewInstance__KeyAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:2300:1: ( ( rule__NewInstance__KeyAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:2300:1: ( ( rule__NewInstance__KeyAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:2301:2: ( rule__NewInstance__KeyAssignment_3_1_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getKeyAssignment_3_1_1()); 
            // InternalDataflowDSL.g:2302:2: ( rule__NewInstance__KeyAssignment_3_1_1 )
            // InternalDataflowDSL.g:2302:3: rule__NewInstance__KeyAssignment_3_1_1
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
    // InternalDataflowDSL.g:2311:1: rule__NewInstance__Group_3_2__0 : rule__NewInstance__Group_3_2__0__Impl rule__NewInstance__Group_3_2__1 ;
    public final void rule__NewInstance__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2315:1: ( rule__NewInstance__Group_3_2__0__Impl rule__NewInstance__Group_3_2__1 )
            // InternalDataflowDSL.g:2316:2: rule__NewInstance__Group_3_2__0__Impl rule__NewInstance__Group_3_2__1
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
    // InternalDataflowDSL.g:2323:1: rule__NewInstance__Group_3_2__0__Impl : ( 'type' ) ;
    public final void rule__NewInstance__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2327:1: ( ( 'type' ) )
            // InternalDataflowDSL.g:2328:1: ( 'type' )
            {
            // InternalDataflowDSL.g:2328:1: ( 'type' )
            // InternalDataflowDSL.g:2329:2: 'type'
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
    // InternalDataflowDSL.g:2338:1: rule__NewInstance__Group_3_2__1 : rule__NewInstance__Group_3_2__1__Impl rule__NewInstance__Group_3_2__2 ;
    public final void rule__NewInstance__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2342:1: ( rule__NewInstance__Group_3_2__1__Impl rule__NewInstance__Group_3_2__2 )
            // InternalDataflowDSL.g:2343:2: rule__NewInstance__Group_3_2__1__Impl rule__NewInstance__Group_3_2__2
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
    // InternalDataflowDSL.g:2350:1: rule__NewInstance__Group_3_2__1__Impl : ( ( rule__NewInstance__Group_3_2_1__0 )? ) ;
    public final void rule__NewInstance__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2354:1: ( ( ( rule__NewInstance__Group_3_2_1__0 )? ) )
            // InternalDataflowDSL.g:2355:1: ( ( rule__NewInstance__Group_3_2_1__0 )? )
            {
            // InternalDataflowDSL.g:2355:1: ( ( rule__NewInstance__Group_3_2_1__0 )? )
            // InternalDataflowDSL.g:2356:2: ( rule__NewInstance__Group_3_2_1__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_3_2_1()); 
            // InternalDataflowDSL.g:2357:2: ( rule__NewInstance__Group_3_2_1__0 )?
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
                    // InternalDataflowDSL.g:2357:3: rule__NewInstance__Group_3_2_1__0
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
    // InternalDataflowDSL.g:2365:1: rule__NewInstance__Group_3_2__2 : rule__NewInstance__Group_3_2__2__Impl rule__NewInstance__Group_3_2__3 ;
    public final void rule__NewInstance__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2369:1: ( rule__NewInstance__Group_3_2__2__Impl rule__NewInstance__Group_3_2__3 )
            // InternalDataflowDSL.g:2370:2: rule__NewInstance__Group_3_2__2__Impl rule__NewInstance__Group_3_2__3
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
    // InternalDataflowDSL.g:2377:1: rule__NewInstance__Group_3_2__2__Impl : ( ( rule__NewInstance__Group_3_2_2__0 )? ) ;
    public final void rule__NewInstance__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2381:1: ( ( ( rule__NewInstance__Group_3_2_2__0 )? ) )
            // InternalDataflowDSL.g:2382:1: ( ( rule__NewInstance__Group_3_2_2__0 )? )
            {
            // InternalDataflowDSL.g:2382:1: ( ( rule__NewInstance__Group_3_2_2__0 )? )
            // InternalDataflowDSL.g:2383:2: ( rule__NewInstance__Group_3_2_2__0 )?
            {
             before(grammarAccess.getNewInstanceAccess().getGroup_3_2_2()); 
            // InternalDataflowDSL.g:2384:2: ( rule__NewInstance__Group_3_2_2__0 )?
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
                    // InternalDataflowDSL.g:2384:3: rule__NewInstance__Group_3_2_2__0
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
    // InternalDataflowDSL.g:2392:1: rule__NewInstance__Group_3_2__3 : rule__NewInstance__Group_3_2__3__Impl ;
    public final void rule__NewInstance__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2396:1: ( rule__NewInstance__Group_3_2__3__Impl )
            // InternalDataflowDSL.g:2397:2: rule__NewInstance__Group_3_2__3__Impl
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
    // InternalDataflowDSL.g:2403:1: rule__NewInstance__Group_3_2__3__Impl : ( ( rule__NewInstance__TypeNameAssignment_3_2_3 ) ) ;
    public final void rule__NewInstance__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2407:1: ( ( ( rule__NewInstance__TypeNameAssignment_3_2_3 ) ) )
            // InternalDataflowDSL.g:2408:1: ( ( rule__NewInstance__TypeNameAssignment_3_2_3 ) )
            {
            // InternalDataflowDSL.g:2408:1: ( ( rule__NewInstance__TypeNameAssignment_3_2_3 ) )
            // InternalDataflowDSL.g:2409:2: ( rule__NewInstance__TypeNameAssignment_3_2_3 )
            {
             before(grammarAccess.getNewInstanceAccess().getTypeNameAssignment_3_2_3()); 
            // InternalDataflowDSL.g:2410:2: ( rule__NewInstance__TypeNameAssignment_3_2_3 )
            // InternalDataflowDSL.g:2410:3: rule__NewInstance__TypeNameAssignment_3_2_3
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
    // InternalDataflowDSL.g:2419:1: rule__NewInstance__Group_3_2_1__0 : rule__NewInstance__Group_3_2_1__0__Impl rule__NewInstance__Group_3_2_1__1 ;
    public final void rule__NewInstance__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2423:1: ( rule__NewInstance__Group_3_2_1__0__Impl rule__NewInstance__Group_3_2_1__1 )
            // InternalDataflowDSL.g:2424:2: rule__NewInstance__Group_3_2_1__0__Impl rule__NewInstance__Group_3_2_1__1
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
    // InternalDataflowDSL.g:2431:1: rule__NewInstance__Group_3_2_1__0__Impl : ( ( rule__NewInstance__ModelAssignment_3_2_1_0 ) ) ;
    public final void rule__NewInstance__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2435:1: ( ( ( rule__NewInstance__ModelAssignment_3_2_1_0 ) ) )
            // InternalDataflowDSL.g:2436:1: ( ( rule__NewInstance__ModelAssignment_3_2_1_0 ) )
            {
            // InternalDataflowDSL.g:2436:1: ( ( rule__NewInstance__ModelAssignment_3_2_1_0 ) )
            // InternalDataflowDSL.g:2437:2: ( rule__NewInstance__ModelAssignment_3_2_1_0 )
            {
             before(grammarAccess.getNewInstanceAccess().getModelAssignment_3_2_1_0()); 
            // InternalDataflowDSL.g:2438:2: ( rule__NewInstance__ModelAssignment_3_2_1_0 )
            // InternalDataflowDSL.g:2438:3: rule__NewInstance__ModelAssignment_3_2_1_0
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
    // InternalDataflowDSL.g:2446:1: rule__NewInstance__Group_3_2_1__1 : rule__NewInstance__Group_3_2_1__1__Impl ;
    public final void rule__NewInstance__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2450:1: ( rule__NewInstance__Group_3_2_1__1__Impl )
            // InternalDataflowDSL.g:2451:2: rule__NewInstance__Group_3_2_1__1__Impl
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
    // InternalDataflowDSL.g:2457:1: rule__NewInstance__Group_3_2_1__1__Impl : ( '!' ) ;
    public final void rule__NewInstance__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2461:1: ( ( '!' ) )
            // InternalDataflowDSL.g:2462:1: ( '!' )
            {
            // InternalDataflowDSL.g:2462:1: ( '!' )
            // InternalDataflowDSL.g:2463:2: '!'
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
    // InternalDataflowDSL.g:2473:1: rule__NewInstance__Group_3_2_2__0 : rule__NewInstance__Group_3_2_2__0__Impl rule__NewInstance__Group_3_2_2__1 ;
    public final void rule__NewInstance__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2477:1: ( rule__NewInstance__Group_3_2_2__0__Impl rule__NewInstance__Group_3_2_2__1 )
            // InternalDataflowDSL.g:2478:2: rule__NewInstance__Group_3_2_2__0__Impl rule__NewInstance__Group_3_2_2__1
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
    // InternalDataflowDSL.g:2485:1: rule__NewInstance__Group_3_2_2__0__Impl : ( ( rule__NewInstance__PackageNameAssignment_3_2_2_0 ) ) ;
    public final void rule__NewInstance__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2489:1: ( ( ( rule__NewInstance__PackageNameAssignment_3_2_2_0 ) ) )
            // InternalDataflowDSL.g:2490:1: ( ( rule__NewInstance__PackageNameAssignment_3_2_2_0 ) )
            {
            // InternalDataflowDSL.g:2490:1: ( ( rule__NewInstance__PackageNameAssignment_3_2_2_0 ) )
            // InternalDataflowDSL.g:2491:2: ( rule__NewInstance__PackageNameAssignment_3_2_2_0 )
            {
             before(grammarAccess.getNewInstanceAccess().getPackageNameAssignment_3_2_2_0()); 
            // InternalDataflowDSL.g:2492:2: ( rule__NewInstance__PackageNameAssignment_3_2_2_0 )
            // InternalDataflowDSL.g:2492:3: rule__NewInstance__PackageNameAssignment_3_2_2_0
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
    // InternalDataflowDSL.g:2500:1: rule__NewInstance__Group_3_2_2__1 : rule__NewInstance__Group_3_2_2__1__Impl ;
    public final void rule__NewInstance__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2504:1: ( rule__NewInstance__Group_3_2_2__1__Impl )
            // InternalDataflowDSL.g:2505:2: rule__NewInstance__Group_3_2_2__1__Impl
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
    // InternalDataflowDSL.g:2511:1: rule__NewInstance__Group_3_2_2__1__Impl : ( '::' ) ;
    public final void rule__NewInstance__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2515:1: ( ( '::' ) )
            // InternalDataflowDSL.g:2516:1: ( '::' )
            {
            // InternalDataflowDSL.g:2516:1: ( '::' )
            // InternalDataflowDSL.g:2517:2: '::'
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
    // InternalDataflowDSL.g:2527:1: rule__NewInstance__Group_3_3__0 : rule__NewInstance__Group_3_3__0__Impl rule__NewInstance__Group_3_3__1 ;
    public final void rule__NewInstance__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2531:1: ( rule__NewInstance__Group_3_3__0__Impl rule__NewInstance__Group_3_3__1 )
            // InternalDataflowDSL.g:2532:2: rule__NewInstance__Group_3_3__0__Impl rule__NewInstance__Group_3_3__1
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
    // InternalDataflowDSL.g:2539:1: rule__NewInstance__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__NewInstance__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2543:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2544:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2544:1: ( 'target' )
            // InternalDataflowDSL.g:2545:2: 'target'
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
    // InternalDataflowDSL.g:2554:1: rule__NewInstance__Group_3_3__1 : rule__NewInstance__Group_3_3__1__Impl ;
    public final void rule__NewInstance__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2558:1: ( rule__NewInstance__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:2559:2: rule__NewInstance__Group_3_3__1__Impl
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
    // InternalDataflowDSL.g:2565:1: rule__NewInstance__Group_3_3__1__Impl : ( ( rule__NewInstance__TargetAssignment_3_3_1 ) ) ;
    public final void rule__NewInstance__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2569:1: ( ( ( rule__NewInstance__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:2570:1: ( ( rule__NewInstance__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:2570:1: ( ( rule__NewInstance__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:2571:2: ( rule__NewInstance__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getNewInstanceAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:2572:2: ( rule__NewInstance__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:2572:3: rule__NewInstance__TargetAssignment_3_3_1
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
    // InternalDataflowDSL.g:2581:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2585:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalDataflowDSL.g:2586:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
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
    // InternalDataflowDSL.g:2593:1: rule__Filter__Group__0__Impl : ( 'Filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2597:1: ( ( 'Filter' ) )
            // InternalDataflowDSL.g:2598:1: ( 'Filter' )
            {
            // InternalDataflowDSL.g:2598:1: ( 'Filter' )
            // InternalDataflowDSL.g:2599:2: 'Filter'
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
    // InternalDataflowDSL.g:2608:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2612:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalDataflowDSL.g:2613:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
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
    // InternalDataflowDSL.g:2620:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__NameAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2624:1: ( ( ( rule__Filter__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2625:1: ( ( rule__Filter__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2625:1: ( ( rule__Filter__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2626:2: ( rule__Filter__NameAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2627:2: ( rule__Filter__NameAssignment_1 )
            // InternalDataflowDSL.g:2627:3: rule__Filter__NameAssignment_1
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
    // InternalDataflowDSL.g:2635:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl rule__Filter__Group__3 ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2639:1: ( rule__Filter__Group__2__Impl rule__Filter__Group__3 )
            // InternalDataflowDSL.g:2640:2: rule__Filter__Group__2__Impl rule__Filter__Group__3
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
    // InternalDataflowDSL.g:2647:1: rule__Filter__Group__2__Impl : ( '{' ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2651:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2652:1: ( '{' )
            {
            // InternalDataflowDSL.g:2652:1: ( '{' )
            // InternalDataflowDSL.g:2653:2: '{'
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
    // InternalDataflowDSL.g:2662:1: rule__Filter__Group__3 : rule__Filter__Group__3__Impl rule__Filter__Group__4 ;
    public final void rule__Filter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2666:1: ( rule__Filter__Group__3__Impl rule__Filter__Group__4 )
            // InternalDataflowDSL.g:2667:2: rule__Filter__Group__3__Impl rule__Filter__Group__4
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
    // InternalDataflowDSL.g:2674:1: rule__Filter__Group__3__Impl : ( ( rule__Filter__Alternatives_3 )* ) ;
    public final void rule__Filter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2678:1: ( ( ( rule__Filter__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:2679:1: ( ( rule__Filter__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:2679:1: ( ( rule__Filter__Alternatives_3 )* )
            // InternalDataflowDSL.g:2680:2: ( rule__Filter__Alternatives_3 )*
            {
             before(grammarAccess.getFilterAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:2681:2: ( rule__Filter__Alternatives_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==38||(LA31_0>=42 && LA31_0<=43)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDataflowDSL.g:2681:3: rule__Filter__Alternatives_3
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
    // InternalDataflowDSL.g:2689:1: rule__Filter__Group__4 : rule__Filter__Group__4__Impl ;
    public final void rule__Filter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2693:1: ( rule__Filter__Group__4__Impl )
            // InternalDataflowDSL.g:2694:2: rule__Filter__Group__4__Impl
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
    // InternalDataflowDSL.g:2700:1: rule__Filter__Group__4__Impl : ( '}' ) ;
    public final void rule__Filter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2704:1: ( ( '}' ) )
            // InternalDataflowDSL.g:2705:1: ( '}' )
            {
            // InternalDataflowDSL.g:2705:1: ( '}' )
            // InternalDataflowDSL.g:2706:2: '}'
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
    // InternalDataflowDSL.g:2716:1: rule__Filter__Group_3_0__0 : rule__Filter__Group_3_0__0__Impl rule__Filter__Group_3_0__1 ;
    public final void rule__Filter__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2720:1: ( rule__Filter__Group_3_0__0__Impl rule__Filter__Group_3_0__1 )
            // InternalDataflowDSL.g:2721:2: rule__Filter__Group_3_0__0__Impl rule__Filter__Group_3_0__1
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
    // InternalDataflowDSL.g:2728:1: rule__Filter__Group_3_0__0__Impl : ( 'filterBy' ) ;
    public final void rule__Filter__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2732:1: ( ( 'filterBy' ) )
            // InternalDataflowDSL.g:2733:1: ( 'filterBy' )
            {
            // InternalDataflowDSL.g:2733:1: ( 'filterBy' )
            // InternalDataflowDSL.g:2734:2: 'filterBy'
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
    // InternalDataflowDSL.g:2743:1: rule__Filter__Group_3_0__1 : rule__Filter__Group_3_0__1__Impl ;
    public final void rule__Filter__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2747:1: ( rule__Filter__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:2748:2: rule__Filter__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:2754:1: rule__Filter__Group_3_0__1__Impl : ( ( rule__Filter__FilterByAssignment_3_0_1 ) ) ;
    public final void rule__Filter__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2758:1: ( ( ( rule__Filter__FilterByAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:2759:1: ( ( rule__Filter__FilterByAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:2759:1: ( ( rule__Filter__FilterByAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:2760:2: ( rule__Filter__FilterByAssignment_3_0_1 )
            {
             before(grammarAccess.getFilterAccess().getFilterByAssignment_3_0_1()); 
            // InternalDataflowDSL.g:2761:2: ( rule__Filter__FilterByAssignment_3_0_1 )
            // InternalDataflowDSL.g:2761:3: rule__Filter__FilterByAssignment_3_0_1
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
    // InternalDataflowDSL.g:2770:1: rule__Filter__Group_3_1__0 : rule__Filter__Group_3_1__0__Impl rule__Filter__Group_3_1__1 ;
    public final void rule__Filter__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2774:1: ( rule__Filter__Group_3_1__0__Impl rule__Filter__Group_3_1__1 )
            // InternalDataflowDSL.g:2775:2: rule__Filter__Group_3_1__0__Impl rule__Filter__Group_3_1__1
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
    // InternalDataflowDSL.g:2782:1: rule__Filter__Group_3_1__0__Impl : ( 'target' ) ;
    public final void rule__Filter__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2786:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:2787:1: ( 'target' )
            {
            // InternalDataflowDSL.g:2787:1: ( 'target' )
            // InternalDataflowDSL.g:2788:2: 'target'
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
    // InternalDataflowDSL.g:2797:1: rule__Filter__Group_3_1__1 : rule__Filter__Group_3_1__1__Impl ;
    public final void rule__Filter__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2801:1: ( rule__Filter__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:2802:2: rule__Filter__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:2808:1: rule__Filter__Group_3_1__1__Impl : ( ( rule__Filter__TargetAssignment_3_1_1 ) ) ;
    public final void rule__Filter__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2812:1: ( ( ( rule__Filter__TargetAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:2813:1: ( ( rule__Filter__TargetAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:2813:1: ( ( rule__Filter__TargetAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:2814:2: ( rule__Filter__TargetAssignment_3_1_1 )
            {
             before(grammarAccess.getFilterAccess().getTargetAssignment_3_1_1()); 
            // InternalDataflowDSL.g:2815:2: ( rule__Filter__TargetAssignment_3_1_1 )
            // InternalDataflowDSL.g:2815:3: rule__Filter__TargetAssignment_3_1_1
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
    // InternalDataflowDSL.g:2824:1: rule__Filter__Group_3_2__0 : rule__Filter__Group_3_2__0__Impl rule__Filter__Group_3_2__1 ;
    public final void rule__Filter__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2828:1: ( rule__Filter__Group_3_2__0__Impl rule__Filter__Group_3_2__1 )
            // InternalDataflowDSL.g:2829:2: rule__Filter__Group_3_2__0__Impl rule__Filter__Group_3_2__1
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
    // InternalDataflowDSL.g:2836:1: rule__Filter__Group_3_2__0__Impl : ( 'rejectTarget' ) ;
    public final void rule__Filter__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2840:1: ( ( 'rejectTarget' ) )
            // InternalDataflowDSL.g:2841:1: ( 'rejectTarget' )
            {
            // InternalDataflowDSL.g:2841:1: ( 'rejectTarget' )
            // InternalDataflowDSL.g:2842:2: 'rejectTarget'
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
    // InternalDataflowDSL.g:2851:1: rule__Filter__Group_3_2__1 : rule__Filter__Group_3_2__1__Impl ;
    public final void rule__Filter__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2855:1: ( rule__Filter__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:2856:2: rule__Filter__Group_3_2__1__Impl
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
    // InternalDataflowDSL.g:2862:1: rule__Filter__Group_3_2__1__Impl : ( ( rule__Filter__RejectTargetAssignment_3_2_1 ) ) ;
    public final void rule__Filter__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2866:1: ( ( ( rule__Filter__RejectTargetAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:2867:1: ( ( rule__Filter__RejectTargetAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:2867:1: ( ( rule__Filter__RejectTargetAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:2868:2: ( rule__Filter__RejectTargetAssignment_3_2_1 )
            {
             before(grammarAccess.getFilterAccess().getRejectTargetAssignment_3_2_1()); 
            // InternalDataflowDSL.g:2869:2: ( rule__Filter__RejectTargetAssignment_3_2_1 )
            // InternalDataflowDSL.g:2869:3: rule__Filter__RejectTargetAssignment_3_2_1
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
    // InternalDataflowDSL.g:2878:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2882:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalDataflowDSL.g:2883:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
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
    // InternalDataflowDSL.g:2890:1: rule__Copy__Group__0__Impl : ( 'Copy' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2894:1: ( ( 'Copy' ) )
            // InternalDataflowDSL.g:2895:1: ( 'Copy' )
            {
            // InternalDataflowDSL.g:2895:1: ( 'Copy' )
            // InternalDataflowDSL.g:2896:2: 'Copy'
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
    // InternalDataflowDSL.g:2905:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2909:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalDataflowDSL.g:2910:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
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
    // InternalDataflowDSL.g:2917:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__NameAssignment_1 ) ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2921:1: ( ( ( rule__Copy__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:2922:1: ( ( rule__Copy__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:2922:1: ( ( rule__Copy__NameAssignment_1 ) )
            // InternalDataflowDSL.g:2923:2: ( rule__Copy__NameAssignment_1 )
            {
             before(grammarAccess.getCopyAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:2924:2: ( rule__Copy__NameAssignment_1 )
            // InternalDataflowDSL.g:2924:3: rule__Copy__NameAssignment_1
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
    // InternalDataflowDSL.g:2932:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2936:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalDataflowDSL.g:2937:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
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
    // InternalDataflowDSL.g:2944:1: rule__Copy__Group__2__Impl : ( '{' ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2948:1: ( ( '{' ) )
            // InternalDataflowDSL.g:2949:1: ( '{' )
            {
            // InternalDataflowDSL.g:2949:1: ( '{' )
            // InternalDataflowDSL.g:2950:2: '{'
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
    // InternalDataflowDSL.g:2959:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2963:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalDataflowDSL.g:2964:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
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
    // InternalDataflowDSL.g:2971:1: rule__Copy__Group__3__Impl : ( ( rule__Copy__Alternatives_3 )* ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2975:1: ( ( ( rule__Copy__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:2976:1: ( ( rule__Copy__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:2976:1: ( ( rule__Copy__Alternatives_3 )* )
            // InternalDataflowDSL.g:2977:2: ( rule__Copy__Alternatives_3 )*
            {
             before(grammarAccess.getCopyAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:2978:2: ( rule__Copy__Alternatives_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38||LA32_0==45) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDataflowDSL.g:2978:3: rule__Copy__Alternatives_3
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
    // InternalDataflowDSL.g:2986:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:2990:1: ( rule__Copy__Group__4__Impl )
            // InternalDataflowDSL.g:2991:2: rule__Copy__Group__4__Impl
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
    // InternalDataflowDSL.g:2997:1: rule__Copy__Group__4__Impl : ( '}' ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3001:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3002:1: ( '}' )
            {
            // InternalDataflowDSL.g:3002:1: ( '}' )
            // InternalDataflowDSL.g:3003:2: '}'
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
    // InternalDataflowDSL.g:3013:1: rule__Copy__Group_3_0__0 : rule__Copy__Group_3_0__0__Impl rule__Copy__Group_3_0__1 ;
    public final void rule__Copy__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3017:1: ( rule__Copy__Group_3_0__0__Impl rule__Copy__Group_3_0__1 )
            // InternalDataflowDSL.g:3018:2: rule__Copy__Group_3_0__0__Impl rule__Copy__Group_3_0__1
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
    // InternalDataflowDSL.g:3025:1: rule__Copy__Group_3_0__0__Impl : ( 'target' ) ;
    public final void rule__Copy__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3029:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3030:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3030:1: ( 'target' )
            // InternalDataflowDSL.g:3031:2: 'target'
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
    // InternalDataflowDSL.g:3040:1: rule__Copy__Group_3_0__1 : rule__Copy__Group_3_0__1__Impl ;
    public final void rule__Copy__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3044:1: ( rule__Copy__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:3045:2: rule__Copy__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:3051:1: rule__Copy__Group_3_0__1__Impl : ( ( rule__Copy__TargetAssignment_3_0_1 ) ) ;
    public final void rule__Copy__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3055:1: ( ( ( rule__Copy__TargetAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:3056:1: ( ( rule__Copy__TargetAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:3056:1: ( ( rule__Copy__TargetAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:3057:2: ( rule__Copy__TargetAssignment_3_0_1 )
            {
             before(grammarAccess.getCopyAccess().getTargetAssignment_3_0_1()); 
            // InternalDataflowDSL.g:3058:2: ( rule__Copy__TargetAssignment_3_0_1 )
            // InternalDataflowDSL.g:3058:3: rule__Copy__TargetAssignment_3_0_1
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
    // InternalDataflowDSL.g:3067:1: rule__Copy__Group_3_1__0 : rule__Copy__Group_3_1__0__Impl rule__Copy__Group_3_1__1 ;
    public final void rule__Copy__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3071:1: ( rule__Copy__Group_3_1__0__Impl rule__Copy__Group_3_1__1 )
            // InternalDataflowDSL.g:3072:2: rule__Copy__Group_3_1__0__Impl rule__Copy__Group_3_1__1
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
    // InternalDataflowDSL.g:3079:1: rule__Copy__Group_3_1__0__Impl : ( 'copyTarget' ) ;
    public final void rule__Copy__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3083:1: ( ( 'copyTarget' ) )
            // InternalDataflowDSL.g:3084:1: ( 'copyTarget' )
            {
            // InternalDataflowDSL.g:3084:1: ( 'copyTarget' )
            // InternalDataflowDSL.g:3085:2: 'copyTarget'
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
    // InternalDataflowDSL.g:3094:1: rule__Copy__Group_3_1__1 : rule__Copy__Group_3_1__1__Impl ;
    public final void rule__Copy__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3098:1: ( rule__Copy__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:3099:2: rule__Copy__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:3105:1: rule__Copy__Group_3_1__1__Impl : ( ( rule__Copy__CopyTargetAssignment_3_1_1 ) ) ;
    public final void rule__Copy__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3109:1: ( ( ( rule__Copy__CopyTargetAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:3110:1: ( ( rule__Copy__CopyTargetAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:3110:1: ( ( rule__Copy__CopyTargetAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:3111:2: ( rule__Copy__CopyTargetAssignment_3_1_1 )
            {
             before(grammarAccess.getCopyAccess().getCopyTargetAssignment_3_1_1()); 
            // InternalDataflowDSL.g:3112:2: ( rule__Copy__CopyTargetAssignment_3_1_1 )
            // InternalDataflowDSL.g:3112:3: rule__Copy__CopyTargetAssignment_3_1_1
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
    // InternalDataflowDSL.g:3121:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3125:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // InternalDataflowDSL.g:3126:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
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
    // InternalDataflowDSL.g:3133:1: rule__Sort__Group__0__Impl : ( 'Sort' ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3137:1: ( ( 'Sort' ) )
            // InternalDataflowDSL.g:3138:1: ( 'Sort' )
            {
            // InternalDataflowDSL.g:3138:1: ( 'Sort' )
            // InternalDataflowDSL.g:3139:2: 'Sort'
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
    // InternalDataflowDSL.g:3148:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl rule__Sort__Group__2 ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3152:1: ( rule__Sort__Group__1__Impl rule__Sort__Group__2 )
            // InternalDataflowDSL.g:3153:2: rule__Sort__Group__1__Impl rule__Sort__Group__2
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
    // InternalDataflowDSL.g:3160:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3164:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3165:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3165:1: ( ( rule__Sort__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3166:2: ( rule__Sort__NameAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3167:2: ( rule__Sort__NameAssignment_1 )
            // InternalDataflowDSL.g:3167:3: rule__Sort__NameAssignment_1
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
    // InternalDataflowDSL.g:3175:1: rule__Sort__Group__2 : rule__Sort__Group__2__Impl rule__Sort__Group__3 ;
    public final void rule__Sort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3179:1: ( rule__Sort__Group__2__Impl rule__Sort__Group__3 )
            // InternalDataflowDSL.g:3180:2: rule__Sort__Group__2__Impl rule__Sort__Group__3
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
    // InternalDataflowDSL.g:3187:1: rule__Sort__Group__2__Impl : ( '{' ) ;
    public final void rule__Sort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3191:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3192:1: ( '{' )
            {
            // InternalDataflowDSL.g:3192:1: ( '{' )
            // InternalDataflowDSL.g:3193:2: '{'
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
    // InternalDataflowDSL.g:3202:1: rule__Sort__Group__3 : rule__Sort__Group__3__Impl rule__Sort__Group__4 ;
    public final void rule__Sort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3206:1: ( rule__Sort__Group__3__Impl rule__Sort__Group__4 )
            // InternalDataflowDSL.g:3207:2: rule__Sort__Group__3__Impl rule__Sort__Group__4
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
    // InternalDataflowDSL.g:3214:1: rule__Sort__Group__3__Impl : ( ( rule__Sort__Alternatives_3 )* ) ;
    public final void rule__Sort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3218:1: ( ( ( rule__Sort__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:3219:1: ( ( rule__Sort__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:3219:1: ( ( rule__Sort__Alternatives_3 )* )
            // InternalDataflowDSL.g:3220:2: ( rule__Sort__Alternatives_3 )*
            {
             before(grammarAccess.getSortAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:3221:2: ( rule__Sort__Alternatives_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38||LA33_0==47) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDataflowDSL.g:3221:3: rule__Sort__Alternatives_3
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
    // InternalDataflowDSL.g:3229:1: rule__Sort__Group__4 : rule__Sort__Group__4__Impl ;
    public final void rule__Sort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3233:1: ( rule__Sort__Group__4__Impl )
            // InternalDataflowDSL.g:3234:2: rule__Sort__Group__4__Impl
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
    // InternalDataflowDSL.g:3240:1: rule__Sort__Group__4__Impl : ( '}' ) ;
    public final void rule__Sort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3244:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3245:1: ( '}' )
            {
            // InternalDataflowDSL.g:3245:1: ( '}' )
            // InternalDataflowDSL.g:3246:2: '}'
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
    // InternalDataflowDSL.g:3256:1: rule__Sort__Group_3_0__0 : rule__Sort__Group_3_0__0__Impl rule__Sort__Group_3_0__1 ;
    public final void rule__Sort__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3260:1: ( rule__Sort__Group_3_0__0__Impl rule__Sort__Group_3_0__1 )
            // InternalDataflowDSL.g:3261:2: rule__Sort__Group_3_0__0__Impl rule__Sort__Group_3_0__1
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
    // InternalDataflowDSL.g:3268:1: rule__Sort__Group_3_0__0__Impl : ( 'sortBy' ) ;
    public final void rule__Sort__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3272:1: ( ( 'sortBy' ) )
            // InternalDataflowDSL.g:3273:1: ( 'sortBy' )
            {
            // InternalDataflowDSL.g:3273:1: ( 'sortBy' )
            // InternalDataflowDSL.g:3274:2: 'sortBy'
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
    // InternalDataflowDSL.g:3283:1: rule__Sort__Group_3_0__1 : rule__Sort__Group_3_0__1__Impl ;
    public final void rule__Sort__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3287:1: ( rule__Sort__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:3288:2: rule__Sort__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:3294:1: rule__Sort__Group_3_0__1__Impl : ( ( rule__Sort__SortByAssignment_3_0_1 ) ) ;
    public final void rule__Sort__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3298:1: ( ( ( rule__Sort__SortByAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:3299:1: ( ( rule__Sort__SortByAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:3299:1: ( ( rule__Sort__SortByAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:3300:2: ( rule__Sort__SortByAssignment_3_0_1 )
            {
             before(grammarAccess.getSortAccess().getSortByAssignment_3_0_1()); 
            // InternalDataflowDSL.g:3301:2: ( rule__Sort__SortByAssignment_3_0_1 )
            // InternalDataflowDSL.g:3301:3: rule__Sort__SortByAssignment_3_0_1
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
    // InternalDataflowDSL.g:3310:1: rule__Sort__Group_3_1__0 : rule__Sort__Group_3_1__0__Impl rule__Sort__Group_3_1__1 ;
    public final void rule__Sort__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3314:1: ( rule__Sort__Group_3_1__0__Impl rule__Sort__Group_3_1__1 )
            // InternalDataflowDSL.g:3315:2: rule__Sort__Group_3_1__0__Impl rule__Sort__Group_3_1__1
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
    // InternalDataflowDSL.g:3322:1: rule__Sort__Group_3_1__0__Impl : ( 'target' ) ;
    public final void rule__Sort__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3326:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3327:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3327:1: ( 'target' )
            // InternalDataflowDSL.g:3328:2: 'target'
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
    // InternalDataflowDSL.g:3337:1: rule__Sort__Group_3_1__1 : rule__Sort__Group_3_1__1__Impl ;
    public final void rule__Sort__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3341:1: ( rule__Sort__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:3342:2: rule__Sort__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:3348:1: rule__Sort__Group_3_1__1__Impl : ( ( rule__Sort__TargetAssignment_3_1_1 ) ) ;
    public final void rule__Sort__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3352:1: ( ( ( rule__Sort__TargetAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:3353:1: ( ( rule__Sort__TargetAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:3353:1: ( ( rule__Sort__TargetAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:3354:2: ( rule__Sort__TargetAssignment_3_1_1 )
            {
             before(grammarAccess.getSortAccess().getTargetAssignment_3_1_1()); 
            // InternalDataflowDSL.g:3355:2: ( rule__Sort__TargetAssignment_3_1_1 )
            // InternalDataflowDSL.g:3355:3: rule__Sort__TargetAssignment_3_1_1
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
    // InternalDataflowDSL.g:3364:1: rule__Product__Group__0 : rule__Product__Group__0__Impl rule__Product__Group__1 ;
    public final void rule__Product__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3368:1: ( rule__Product__Group__0__Impl rule__Product__Group__1 )
            // InternalDataflowDSL.g:3369:2: rule__Product__Group__0__Impl rule__Product__Group__1
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
    // InternalDataflowDSL.g:3376:1: rule__Product__Group__0__Impl : ( 'Product' ) ;
    public final void rule__Product__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3380:1: ( ( 'Product' ) )
            // InternalDataflowDSL.g:3381:1: ( 'Product' )
            {
            // InternalDataflowDSL.g:3381:1: ( 'Product' )
            // InternalDataflowDSL.g:3382:2: 'Product'
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
    // InternalDataflowDSL.g:3391:1: rule__Product__Group__1 : rule__Product__Group__1__Impl rule__Product__Group__2 ;
    public final void rule__Product__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3395:1: ( rule__Product__Group__1__Impl rule__Product__Group__2 )
            // InternalDataflowDSL.g:3396:2: rule__Product__Group__1__Impl rule__Product__Group__2
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
    // InternalDataflowDSL.g:3403:1: rule__Product__Group__1__Impl : ( ( rule__Product__NameAssignment_1 ) ) ;
    public final void rule__Product__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3407:1: ( ( ( rule__Product__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3408:1: ( ( rule__Product__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3408:1: ( ( rule__Product__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3409:2: ( rule__Product__NameAssignment_1 )
            {
             before(grammarAccess.getProductAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3410:2: ( rule__Product__NameAssignment_1 )
            // InternalDataflowDSL.g:3410:3: rule__Product__NameAssignment_1
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
    // InternalDataflowDSL.g:3418:1: rule__Product__Group__2 : rule__Product__Group__2__Impl rule__Product__Group__3 ;
    public final void rule__Product__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3422:1: ( rule__Product__Group__2__Impl rule__Product__Group__3 )
            // InternalDataflowDSL.g:3423:2: rule__Product__Group__2__Impl rule__Product__Group__3
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
    // InternalDataflowDSL.g:3430:1: rule__Product__Group__2__Impl : ( '{' ) ;
    public final void rule__Product__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3434:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3435:1: ( '{' )
            {
            // InternalDataflowDSL.g:3435:1: ( '{' )
            // InternalDataflowDSL.g:3436:2: '{'
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
    // InternalDataflowDSL.g:3445:1: rule__Product__Group__3 : rule__Product__Group__3__Impl rule__Product__Group__4 ;
    public final void rule__Product__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3449:1: ( rule__Product__Group__3__Impl rule__Product__Group__4 )
            // InternalDataflowDSL.g:3450:2: rule__Product__Group__3__Impl rule__Product__Group__4
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
    // InternalDataflowDSL.g:3457:1: rule__Product__Group__3__Impl : ( ( rule__Product__Group_3__0 )? ) ;
    public final void rule__Product__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3461:1: ( ( ( rule__Product__Group_3__0 )? ) )
            // InternalDataflowDSL.g:3462:1: ( ( rule__Product__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:3462:1: ( ( rule__Product__Group_3__0 )? )
            // InternalDataflowDSL.g:3463:2: ( rule__Product__Group_3__0 )?
            {
             before(grammarAccess.getProductAccess().getGroup_3()); 
            // InternalDataflowDSL.g:3464:2: ( rule__Product__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataflowDSL.g:3464:3: rule__Product__Group_3__0
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
    // InternalDataflowDSL.g:3472:1: rule__Product__Group__4 : rule__Product__Group__4__Impl ;
    public final void rule__Product__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3476:1: ( rule__Product__Group__4__Impl )
            // InternalDataflowDSL.g:3477:2: rule__Product__Group__4__Impl
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
    // InternalDataflowDSL.g:3483:1: rule__Product__Group__4__Impl : ( '}' ) ;
    public final void rule__Product__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3487:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3488:1: ( '}' )
            {
            // InternalDataflowDSL.g:3488:1: ( '}' )
            // InternalDataflowDSL.g:3489:2: '}'
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
    // InternalDataflowDSL.g:3499:1: rule__Product__Group_3__0 : rule__Product__Group_3__0__Impl rule__Product__Group_3__1 ;
    public final void rule__Product__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3503:1: ( rule__Product__Group_3__0__Impl rule__Product__Group_3__1 )
            // InternalDataflowDSL.g:3504:2: rule__Product__Group_3__0__Impl rule__Product__Group_3__1
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
    // InternalDataflowDSL.g:3511:1: rule__Product__Group_3__0__Impl : ( 'target' ) ;
    public final void rule__Product__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3515:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3516:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3516:1: ( 'target' )
            // InternalDataflowDSL.g:3517:2: 'target'
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
    // InternalDataflowDSL.g:3526:1: rule__Product__Group_3__1 : rule__Product__Group_3__1__Impl ;
    public final void rule__Product__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3530:1: ( rule__Product__Group_3__1__Impl )
            // InternalDataflowDSL.g:3531:2: rule__Product__Group_3__1__Impl
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
    // InternalDataflowDSL.g:3537:1: rule__Product__Group_3__1__Impl : ( ( rule__Product__TargetAssignment_3_1 ) ) ;
    public final void rule__Product__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3541:1: ( ( ( rule__Product__TargetAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:3542:1: ( ( rule__Product__TargetAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:3542:1: ( ( rule__Product__TargetAssignment_3_1 ) )
            // InternalDataflowDSL.g:3543:2: ( rule__Product__TargetAssignment_3_1 )
            {
             before(grammarAccess.getProductAccess().getTargetAssignment_3_1()); 
            // InternalDataflowDSL.g:3544:2: ( rule__Product__TargetAssignment_3_1 )
            // InternalDataflowDSL.g:3544:3: rule__Product__TargetAssignment_3_1
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
    // InternalDataflowDSL.g:3553:1: rule__GetFeature__Group__0 : rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1 ;
    public final void rule__GetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3557:1: ( rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1 )
            // InternalDataflowDSL.g:3558:2: rule__GetFeature__Group__0__Impl rule__GetFeature__Group__1
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
    // InternalDataflowDSL.g:3565:1: rule__GetFeature__Group__0__Impl : ( 'GetFeature' ) ;
    public final void rule__GetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3569:1: ( ( 'GetFeature' ) )
            // InternalDataflowDSL.g:3570:1: ( 'GetFeature' )
            {
            // InternalDataflowDSL.g:3570:1: ( 'GetFeature' )
            // InternalDataflowDSL.g:3571:2: 'GetFeature'
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
    // InternalDataflowDSL.g:3580:1: rule__GetFeature__Group__1 : rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2 ;
    public final void rule__GetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3584:1: ( rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2 )
            // InternalDataflowDSL.g:3585:2: rule__GetFeature__Group__1__Impl rule__GetFeature__Group__2
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
    // InternalDataflowDSL.g:3592:1: rule__GetFeature__Group__1__Impl : ( ( rule__GetFeature__NameAssignment_1 ) ) ;
    public final void rule__GetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3596:1: ( ( ( rule__GetFeature__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3597:1: ( ( rule__GetFeature__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3597:1: ( ( rule__GetFeature__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3598:2: ( rule__GetFeature__NameAssignment_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3599:2: ( rule__GetFeature__NameAssignment_1 )
            // InternalDataflowDSL.g:3599:3: rule__GetFeature__NameAssignment_1
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
    // InternalDataflowDSL.g:3607:1: rule__GetFeature__Group__2 : rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3 ;
    public final void rule__GetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3611:1: ( rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3 )
            // InternalDataflowDSL.g:3612:2: rule__GetFeature__Group__2__Impl rule__GetFeature__Group__3
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
    // InternalDataflowDSL.g:3619:1: rule__GetFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__GetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3623:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3624:1: ( '{' )
            {
            // InternalDataflowDSL.g:3624:1: ( '{' )
            // InternalDataflowDSL.g:3625:2: '{'
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
    // InternalDataflowDSL.g:3634:1: rule__GetFeature__Group__3 : rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4 ;
    public final void rule__GetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3638:1: ( rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4 )
            // InternalDataflowDSL.g:3639:2: rule__GetFeature__Group__3__Impl rule__GetFeature__Group__4
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
    // InternalDataflowDSL.g:3646:1: rule__GetFeature__Group__3__Impl : ( ( rule__GetFeature__Alternatives_3 )* ) ;
    public final void rule__GetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3650:1: ( ( ( rule__GetFeature__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:3651:1: ( ( rule__GetFeature__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:3651:1: ( ( rule__GetFeature__Alternatives_3 )* )
            // InternalDataflowDSL.g:3652:2: ( rule__GetFeature__Alternatives_3 )*
            {
             before(grammarAccess.getGetFeatureAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:3653:2: ( rule__GetFeature__Alternatives_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38||(LA35_0>=50 && LA35_0<=52)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDataflowDSL.g:3653:3: rule__GetFeature__Alternatives_3
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
    // InternalDataflowDSL.g:3661:1: rule__GetFeature__Group__4 : rule__GetFeature__Group__4__Impl ;
    public final void rule__GetFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3665:1: ( rule__GetFeature__Group__4__Impl )
            // InternalDataflowDSL.g:3666:2: rule__GetFeature__Group__4__Impl
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
    // InternalDataflowDSL.g:3672:1: rule__GetFeature__Group__4__Impl : ( '}' ) ;
    public final void rule__GetFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3676:1: ( ( '}' ) )
            // InternalDataflowDSL.g:3677:1: ( '}' )
            {
            // InternalDataflowDSL.g:3677:1: ( '}' )
            // InternalDataflowDSL.g:3678:2: '}'
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
    // InternalDataflowDSL.g:3688:1: rule__GetFeature__Group_3_0__0 : rule__GetFeature__Group_3_0__0__Impl rule__GetFeature__Group_3_0__1 ;
    public final void rule__GetFeature__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3692:1: ( rule__GetFeature__Group_3_0__0__Impl rule__GetFeature__Group_3_0__1 )
            // InternalDataflowDSL.g:3693:2: rule__GetFeature__Group_3_0__0__Impl rule__GetFeature__Group_3_0__1
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
    // InternalDataflowDSL.g:3700:1: rule__GetFeature__Group_3_0__0__Impl : ( 'objectField' ) ;
    public final void rule__GetFeature__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3704:1: ( ( 'objectField' ) )
            // InternalDataflowDSL.g:3705:1: ( 'objectField' )
            {
            // InternalDataflowDSL.g:3705:1: ( 'objectField' )
            // InternalDataflowDSL.g:3706:2: 'objectField'
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
    // InternalDataflowDSL.g:3715:1: rule__GetFeature__Group_3_0__1 : rule__GetFeature__Group_3_0__1__Impl ;
    public final void rule__GetFeature__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3719:1: ( rule__GetFeature__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:3720:2: rule__GetFeature__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:3726:1: rule__GetFeature__Group_3_0__1__Impl : ( ( rule__GetFeature__ObjectFieldAssignment_3_0_1 ) ) ;
    public final void rule__GetFeature__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3730:1: ( ( ( rule__GetFeature__ObjectFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:3731:1: ( ( rule__GetFeature__ObjectFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:3731:1: ( ( rule__GetFeature__ObjectFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:3732:2: ( rule__GetFeature__ObjectFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getObjectFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:3733:2: ( rule__GetFeature__ObjectFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:3733:3: rule__GetFeature__ObjectFieldAssignment_3_0_1
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
    // InternalDataflowDSL.g:3742:1: rule__GetFeature__Group_3_1__0 : rule__GetFeature__Group_3_1__0__Impl rule__GetFeature__Group_3_1__1 ;
    public final void rule__GetFeature__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3746:1: ( rule__GetFeature__Group_3_1__0__Impl rule__GetFeature__Group_3_1__1 )
            // InternalDataflowDSL.g:3747:2: rule__GetFeature__Group_3_1__0__Impl rule__GetFeature__Group_3_1__1
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
    // InternalDataflowDSL.g:3754:1: rule__GetFeature__Group_3_1__0__Impl : ( 'valueField' ) ;
    public final void rule__GetFeature__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3758:1: ( ( 'valueField' ) )
            // InternalDataflowDSL.g:3759:1: ( 'valueField' )
            {
            // InternalDataflowDSL.g:3759:1: ( 'valueField' )
            // InternalDataflowDSL.g:3760:2: 'valueField'
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
    // InternalDataflowDSL.g:3769:1: rule__GetFeature__Group_3_1__1 : rule__GetFeature__Group_3_1__1__Impl ;
    public final void rule__GetFeature__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3773:1: ( rule__GetFeature__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:3774:2: rule__GetFeature__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:3780:1: rule__GetFeature__Group_3_1__1__Impl : ( ( rule__GetFeature__ValueFieldAssignment_3_1_1 ) ) ;
    public final void rule__GetFeature__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3784:1: ( ( ( rule__GetFeature__ValueFieldAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:3785:1: ( ( rule__GetFeature__ValueFieldAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:3785:1: ( ( rule__GetFeature__ValueFieldAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:3786:2: ( rule__GetFeature__ValueFieldAssignment_3_1_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getValueFieldAssignment_3_1_1()); 
            // InternalDataflowDSL.g:3787:2: ( rule__GetFeature__ValueFieldAssignment_3_1_1 )
            // InternalDataflowDSL.g:3787:3: rule__GetFeature__ValueFieldAssignment_3_1_1
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
    // InternalDataflowDSL.g:3796:1: rule__GetFeature__Group_3_2__0 : rule__GetFeature__Group_3_2__0__Impl rule__GetFeature__Group_3_2__1 ;
    public final void rule__GetFeature__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3800:1: ( rule__GetFeature__Group_3_2__0__Impl rule__GetFeature__Group_3_2__1 )
            // InternalDataflowDSL.g:3801:2: rule__GetFeature__Group_3_2__0__Impl rule__GetFeature__Group_3_2__1
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
    // InternalDataflowDSL.g:3808:1: rule__GetFeature__Group_3_2__0__Impl : ( 'feature' ) ;
    public final void rule__GetFeature__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3812:1: ( ( 'feature' ) )
            // InternalDataflowDSL.g:3813:1: ( 'feature' )
            {
            // InternalDataflowDSL.g:3813:1: ( 'feature' )
            // InternalDataflowDSL.g:3814:2: 'feature'
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
    // InternalDataflowDSL.g:3823:1: rule__GetFeature__Group_3_2__1 : rule__GetFeature__Group_3_2__1__Impl ;
    public final void rule__GetFeature__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3827:1: ( rule__GetFeature__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:3828:2: rule__GetFeature__Group_3_2__1__Impl
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
    // InternalDataflowDSL.g:3834:1: rule__GetFeature__Group_3_2__1__Impl : ( ( rule__GetFeature__FeatureAssignment_3_2_1 ) ) ;
    public final void rule__GetFeature__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3838:1: ( ( ( rule__GetFeature__FeatureAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:3839:1: ( ( rule__GetFeature__FeatureAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:3839:1: ( ( rule__GetFeature__FeatureAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:3840:2: ( rule__GetFeature__FeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getFeatureAssignment_3_2_1()); 
            // InternalDataflowDSL.g:3841:2: ( rule__GetFeature__FeatureAssignment_3_2_1 )
            // InternalDataflowDSL.g:3841:3: rule__GetFeature__FeatureAssignment_3_2_1
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
    // InternalDataflowDSL.g:3850:1: rule__GetFeature__Group_3_3__0 : rule__GetFeature__Group_3_3__0__Impl rule__GetFeature__Group_3_3__1 ;
    public final void rule__GetFeature__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3854:1: ( rule__GetFeature__Group_3_3__0__Impl rule__GetFeature__Group_3_3__1 )
            // InternalDataflowDSL.g:3855:2: rule__GetFeature__Group_3_3__0__Impl rule__GetFeature__Group_3_3__1
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
    // InternalDataflowDSL.g:3862:1: rule__GetFeature__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__GetFeature__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3866:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:3867:1: ( 'target' )
            {
            // InternalDataflowDSL.g:3867:1: ( 'target' )
            // InternalDataflowDSL.g:3868:2: 'target'
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
    // InternalDataflowDSL.g:3877:1: rule__GetFeature__Group_3_3__1 : rule__GetFeature__Group_3_3__1__Impl ;
    public final void rule__GetFeature__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3881:1: ( rule__GetFeature__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:3882:2: rule__GetFeature__Group_3_3__1__Impl
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
    // InternalDataflowDSL.g:3888:1: rule__GetFeature__Group_3_3__1__Impl : ( ( rule__GetFeature__TargetAssignment_3_3_1 ) ) ;
    public final void rule__GetFeature__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3892:1: ( ( ( rule__GetFeature__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:3893:1: ( ( rule__GetFeature__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:3893:1: ( ( rule__GetFeature__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:3894:2: ( rule__GetFeature__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getGetFeatureAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:3895:2: ( rule__GetFeature__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:3895:3: rule__GetFeature__TargetAssignment_3_3_1
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
    // InternalDataflowDSL.g:3904:1: rule__SetFeature__Group__0 : rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 ;
    public final void rule__SetFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3908:1: ( rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1 )
            // InternalDataflowDSL.g:3909:2: rule__SetFeature__Group__0__Impl rule__SetFeature__Group__1
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
    // InternalDataflowDSL.g:3916:1: rule__SetFeature__Group__0__Impl : ( 'SetFeature' ) ;
    public final void rule__SetFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3920:1: ( ( 'SetFeature' ) )
            // InternalDataflowDSL.g:3921:1: ( 'SetFeature' )
            {
            // InternalDataflowDSL.g:3921:1: ( 'SetFeature' )
            // InternalDataflowDSL.g:3922:2: 'SetFeature'
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
    // InternalDataflowDSL.g:3931:1: rule__SetFeature__Group__1 : rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 ;
    public final void rule__SetFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3935:1: ( rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2 )
            // InternalDataflowDSL.g:3936:2: rule__SetFeature__Group__1__Impl rule__SetFeature__Group__2
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
    // InternalDataflowDSL.g:3943:1: rule__SetFeature__Group__1__Impl : ( ( rule__SetFeature__NameAssignment_1 ) ) ;
    public final void rule__SetFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3947:1: ( ( ( rule__SetFeature__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:3948:1: ( ( rule__SetFeature__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:3948:1: ( ( rule__SetFeature__NameAssignment_1 ) )
            // InternalDataflowDSL.g:3949:2: ( rule__SetFeature__NameAssignment_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:3950:2: ( rule__SetFeature__NameAssignment_1 )
            // InternalDataflowDSL.g:3950:3: rule__SetFeature__NameAssignment_1
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
    // InternalDataflowDSL.g:3958:1: rule__SetFeature__Group__2 : rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 ;
    public final void rule__SetFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3962:1: ( rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3 )
            // InternalDataflowDSL.g:3963:2: rule__SetFeature__Group__2__Impl rule__SetFeature__Group__3
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
    // InternalDataflowDSL.g:3970:1: rule__SetFeature__Group__2__Impl : ( '{' ) ;
    public final void rule__SetFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3974:1: ( ( '{' ) )
            // InternalDataflowDSL.g:3975:1: ( '{' )
            {
            // InternalDataflowDSL.g:3975:1: ( '{' )
            // InternalDataflowDSL.g:3976:2: '{'
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
    // InternalDataflowDSL.g:3985:1: rule__SetFeature__Group__3 : rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4 ;
    public final void rule__SetFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:3989:1: ( rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4 )
            // InternalDataflowDSL.g:3990:2: rule__SetFeature__Group__3__Impl rule__SetFeature__Group__4
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
    // InternalDataflowDSL.g:3997:1: rule__SetFeature__Group__3__Impl : ( ( rule__SetFeature__Alternatives_3 )* ) ;
    public final void rule__SetFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4001:1: ( ( ( rule__SetFeature__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:4002:1: ( ( rule__SetFeature__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:4002:1: ( ( rule__SetFeature__Alternatives_3 )* )
            // InternalDataflowDSL.g:4003:2: ( rule__SetFeature__Alternatives_3 )*
            {
             before(grammarAccess.getSetFeatureAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:4004:2: ( rule__SetFeature__Alternatives_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34||LA36_0==38||LA36_0==52||LA36_0==54) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDataflowDSL.g:4004:3: rule__SetFeature__Alternatives_3
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
    // InternalDataflowDSL.g:4012:1: rule__SetFeature__Group__4 : rule__SetFeature__Group__4__Impl ;
    public final void rule__SetFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4016:1: ( rule__SetFeature__Group__4__Impl )
            // InternalDataflowDSL.g:4017:2: rule__SetFeature__Group__4__Impl
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
    // InternalDataflowDSL.g:4023:1: rule__SetFeature__Group__4__Impl : ( '}' ) ;
    public final void rule__SetFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4027:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4028:1: ( '}' )
            {
            // InternalDataflowDSL.g:4028:1: ( '}' )
            // InternalDataflowDSL.g:4029:2: '}'
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
    // InternalDataflowDSL.g:4039:1: rule__SetFeature__Group_3_0__0 : rule__SetFeature__Group_3_0__0__Impl rule__SetFeature__Group_3_0__1 ;
    public final void rule__SetFeature__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4043:1: ( rule__SetFeature__Group_3_0__0__Impl rule__SetFeature__Group_3_0__1 )
            // InternalDataflowDSL.g:4044:2: rule__SetFeature__Group_3_0__0__Impl rule__SetFeature__Group_3_0__1
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
    // InternalDataflowDSL.g:4051:1: rule__SetFeature__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__SetFeature__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4055:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:4056:1: ( 'field' )
            {
            // InternalDataflowDSL.g:4056:1: ( 'field' )
            // InternalDataflowDSL.g:4057:2: 'field'
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
    // InternalDataflowDSL.g:4066:1: rule__SetFeature__Group_3_0__1 : rule__SetFeature__Group_3_0__1__Impl ;
    public final void rule__SetFeature__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4070:1: ( rule__SetFeature__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:4071:2: rule__SetFeature__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:4077:1: rule__SetFeature__Group_3_0__1__Impl : ( ( rule__SetFeature__ObjectFieldAssignment_3_0_1 ) ) ;
    public final void rule__SetFeature__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4081:1: ( ( ( rule__SetFeature__ObjectFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:4082:1: ( ( rule__SetFeature__ObjectFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:4082:1: ( ( rule__SetFeature__ObjectFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:4083:2: ( rule__SetFeature__ObjectFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getObjectFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:4084:2: ( rule__SetFeature__ObjectFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:4084:3: rule__SetFeature__ObjectFieldAssignment_3_0_1
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
    // InternalDataflowDSL.g:4093:1: rule__SetFeature__Group_3_1__0 : rule__SetFeature__Group_3_1__0__Impl rule__SetFeature__Group_3_1__1 ;
    public final void rule__SetFeature__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4097:1: ( rule__SetFeature__Group_3_1__0__Impl rule__SetFeature__Group_3_1__1 )
            // InternalDataflowDSL.g:4098:2: rule__SetFeature__Group_3_1__0__Impl rule__SetFeature__Group_3_1__1
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
    // InternalDataflowDSL.g:4105:1: rule__SetFeature__Group_3_1__0__Impl : ( 'value' ) ;
    public final void rule__SetFeature__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4109:1: ( ( 'value' ) )
            // InternalDataflowDSL.g:4110:1: ( 'value' )
            {
            // InternalDataflowDSL.g:4110:1: ( 'value' )
            // InternalDataflowDSL.g:4111:2: 'value'
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
    // InternalDataflowDSL.g:4120:1: rule__SetFeature__Group_3_1__1 : rule__SetFeature__Group_3_1__1__Impl ;
    public final void rule__SetFeature__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4124:1: ( rule__SetFeature__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:4125:2: rule__SetFeature__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:4131:1: rule__SetFeature__Group_3_1__1__Impl : ( ( rule__SetFeature__ValueAssignment_3_1_1 ) ) ;
    public final void rule__SetFeature__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4135:1: ( ( ( rule__SetFeature__ValueAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:4136:1: ( ( rule__SetFeature__ValueAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:4136:1: ( ( rule__SetFeature__ValueAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:4137:2: ( rule__SetFeature__ValueAssignment_3_1_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getValueAssignment_3_1_1()); 
            // InternalDataflowDSL.g:4138:2: ( rule__SetFeature__ValueAssignment_3_1_1 )
            // InternalDataflowDSL.g:4138:3: rule__SetFeature__ValueAssignment_3_1_1
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
    // InternalDataflowDSL.g:4147:1: rule__SetFeature__Group_3_2__0 : rule__SetFeature__Group_3_2__0__Impl rule__SetFeature__Group_3_2__1 ;
    public final void rule__SetFeature__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4151:1: ( rule__SetFeature__Group_3_2__0__Impl rule__SetFeature__Group_3_2__1 )
            // InternalDataflowDSL.g:4152:2: rule__SetFeature__Group_3_2__0__Impl rule__SetFeature__Group_3_2__1
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
    // InternalDataflowDSL.g:4159:1: rule__SetFeature__Group_3_2__0__Impl : ( 'feature' ) ;
    public final void rule__SetFeature__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4163:1: ( ( 'feature' ) )
            // InternalDataflowDSL.g:4164:1: ( 'feature' )
            {
            // InternalDataflowDSL.g:4164:1: ( 'feature' )
            // InternalDataflowDSL.g:4165:2: 'feature'
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
    // InternalDataflowDSL.g:4174:1: rule__SetFeature__Group_3_2__1 : rule__SetFeature__Group_3_2__1__Impl ;
    public final void rule__SetFeature__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4178:1: ( rule__SetFeature__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:4179:2: rule__SetFeature__Group_3_2__1__Impl
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
    // InternalDataflowDSL.g:4185:1: rule__SetFeature__Group_3_2__1__Impl : ( ( rule__SetFeature__FeatureAssignment_3_2_1 ) ) ;
    public final void rule__SetFeature__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4189:1: ( ( ( rule__SetFeature__FeatureAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:4190:1: ( ( rule__SetFeature__FeatureAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:4190:1: ( ( rule__SetFeature__FeatureAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:4191:2: ( rule__SetFeature__FeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getFeatureAssignment_3_2_1()); 
            // InternalDataflowDSL.g:4192:2: ( rule__SetFeature__FeatureAssignment_3_2_1 )
            // InternalDataflowDSL.g:4192:3: rule__SetFeature__FeatureAssignment_3_2_1
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
    // InternalDataflowDSL.g:4201:1: rule__SetFeature__Group_3_3__0 : rule__SetFeature__Group_3_3__0__Impl rule__SetFeature__Group_3_3__1 ;
    public final void rule__SetFeature__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4205:1: ( rule__SetFeature__Group_3_3__0__Impl rule__SetFeature__Group_3_3__1 )
            // InternalDataflowDSL.g:4206:2: rule__SetFeature__Group_3_3__0__Impl rule__SetFeature__Group_3_3__1
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
    // InternalDataflowDSL.g:4213:1: rule__SetFeature__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__SetFeature__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4217:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4218:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4218:1: ( 'target' )
            // InternalDataflowDSL.g:4219:2: 'target'
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
    // InternalDataflowDSL.g:4228:1: rule__SetFeature__Group_3_3__1 : rule__SetFeature__Group_3_3__1__Impl ;
    public final void rule__SetFeature__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4232:1: ( rule__SetFeature__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:4233:2: rule__SetFeature__Group_3_3__1__Impl
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
    // InternalDataflowDSL.g:4239:1: rule__SetFeature__Group_3_3__1__Impl : ( ( rule__SetFeature__TargetAssignment_3_3_1 ) ) ;
    public final void rule__SetFeature__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4243:1: ( ( ( rule__SetFeature__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:4244:1: ( ( rule__SetFeature__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:4244:1: ( ( rule__SetFeature__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:4245:2: ( rule__SetFeature__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getSetFeatureAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:4246:2: ( rule__SetFeature__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:4246:3: rule__SetFeature__TargetAssignment_3_3_1
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
    // InternalDataflowDSL.g:4255:1: rule__NewContainer__Group__0 : rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1 ;
    public final void rule__NewContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4259:1: ( rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1 )
            // InternalDataflowDSL.g:4260:2: rule__NewContainer__Group__0__Impl rule__NewContainer__Group__1
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
    // InternalDataflowDSL.g:4267:1: rule__NewContainer__Group__0__Impl : ( 'NewContainer' ) ;
    public final void rule__NewContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4271:1: ( ( 'NewContainer' ) )
            // InternalDataflowDSL.g:4272:1: ( 'NewContainer' )
            {
            // InternalDataflowDSL.g:4272:1: ( 'NewContainer' )
            // InternalDataflowDSL.g:4273:2: 'NewContainer'
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
    // InternalDataflowDSL.g:4282:1: rule__NewContainer__Group__1 : rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2 ;
    public final void rule__NewContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4286:1: ( rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2 )
            // InternalDataflowDSL.g:4287:2: rule__NewContainer__Group__1__Impl rule__NewContainer__Group__2
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
    // InternalDataflowDSL.g:4294:1: rule__NewContainer__Group__1__Impl : ( ( rule__NewContainer__NameAssignment_1 ) ) ;
    public final void rule__NewContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4298:1: ( ( ( rule__NewContainer__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4299:1: ( ( rule__NewContainer__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4299:1: ( ( rule__NewContainer__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4300:2: ( rule__NewContainer__NameAssignment_1 )
            {
             before(grammarAccess.getNewContainerAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4301:2: ( rule__NewContainer__NameAssignment_1 )
            // InternalDataflowDSL.g:4301:3: rule__NewContainer__NameAssignment_1
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
    // InternalDataflowDSL.g:4309:1: rule__NewContainer__Group__2 : rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3 ;
    public final void rule__NewContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4313:1: ( rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3 )
            // InternalDataflowDSL.g:4314:2: rule__NewContainer__Group__2__Impl rule__NewContainer__Group__3
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
    // InternalDataflowDSL.g:4321:1: rule__NewContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__NewContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4325:1: ( ( '{' ) )
            // InternalDataflowDSL.g:4326:1: ( '{' )
            {
            // InternalDataflowDSL.g:4326:1: ( '{' )
            // InternalDataflowDSL.g:4327:2: '{'
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
    // InternalDataflowDSL.g:4336:1: rule__NewContainer__Group__3 : rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4 ;
    public final void rule__NewContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4340:1: ( rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4 )
            // InternalDataflowDSL.g:4341:2: rule__NewContainer__Group__3__Impl rule__NewContainer__Group__4
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
    // InternalDataflowDSL.g:4348:1: rule__NewContainer__Group__3__Impl : ( ( rule__NewContainer__Group_3__0 )? ) ;
    public final void rule__NewContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4352:1: ( ( ( rule__NewContainer__Group_3__0 )? ) )
            // InternalDataflowDSL.g:4353:1: ( ( rule__NewContainer__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:4353:1: ( ( rule__NewContainer__Group_3__0 )? )
            // InternalDataflowDSL.g:4354:2: ( rule__NewContainer__Group_3__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_3()); 
            // InternalDataflowDSL.g:4355:2: ( rule__NewContainer__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataflowDSL.g:4355:3: rule__NewContainer__Group_3__0
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
    // InternalDataflowDSL.g:4363:1: rule__NewContainer__Group__4 : rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5 ;
    public final void rule__NewContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4367:1: ( rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5 )
            // InternalDataflowDSL.g:4368:2: rule__NewContainer__Group__4__Impl rule__NewContainer__Group__5
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
    // InternalDataflowDSL.g:4375:1: rule__NewContainer__Group__4__Impl : ( ( rule__NewContainer__Group_4__0 )? ) ;
    public final void rule__NewContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4379:1: ( ( ( rule__NewContainer__Group_4__0 )? ) )
            // InternalDataflowDSL.g:4380:1: ( ( rule__NewContainer__Group_4__0 )? )
            {
            // InternalDataflowDSL.g:4380:1: ( ( rule__NewContainer__Group_4__0 )? )
            // InternalDataflowDSL.g:4381:2: ( rule__NewContainer__Group_4__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_4()); 
            // InternalDataflowDSL.g:4382:2: ( rule__NewContainer__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataflowDSL.g:4382:3: rule__NewContainer__Group_4__0
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
    // InternalDataflowDSL.g:4390:1: rule__NewContainer__Group__5 : rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6 ;
    public final void rule__NewContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4394:1: ( rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6 )
            // InternalDataflowDSL.g:4395:2: rule__NewContainer__Group__5__Impl rule__NewContainer__Group__6
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
    // InternalDataflowDSL.g:4402:1: rule__NewContainer__Group__5__Impl : ( ( rule__NewContainer__Group_5__0 )? ) ;
    public final void rule__NewContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4406:1: ( ( ( rule__NewContainer__Group_5__0 )? ) )
            // InternalDataflowDSL.g:4407:1: ( ( rule__NewContainer__Group_5__0 )? )
            {
            // InternalDataflowDSL.g:4407:1: ( ( rule__NewContainer__Group_5__0 )? )
            // InternalDataflowDSL.g:4408:2: ( rule__NewContainer__Group_5__0 )?
            {
             before(grammarAccess.getNewContainerAccess().getGroup_5()); 
            // InternalDataflowDSL.g:4409:2: ( rule__NewContainer__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataflowDSL.g:4409:3: rule__NewContainer__Group_5__0
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
    // InternalDataflowDSL.g:4417:1: rule__NewContainer__Group__6 : rule__NewContainer__Group__6__Impl ;
    public final void rule__NewContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4421:1: ( rule__NewContainer__Group__6__Impl )
            // InternalDataflowDSL.g:4422:2: rule__NewContainer__Group__6__Impl
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
    // InternalDataflowDSL.g:4428:1: rule__NewContainer__Group__6__Impl : ( '}' ) ;
    public final void rule__NewContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4432:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4433:1: ( '}' )
            {
            // InternalDataflowDSL.g:4433:1: ( '}' )
            // InternalDataflowDSL.g:4434:2: '}'
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
    // InternalDataflowDSL.g:4444:1: rule__NewContainer__Group_3__0 : rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1 ;
    public final void rule__NewContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4448:1: ( rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1 )
            // InternalDataflowDSL.g:4449:2: rule__NewContainer__Group_3__0__Impl rule__NewContainer__Group_3__1
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
    // InternalDataflowDSL.g:4456:1: rule__NewContainer__Group_3__0__Impl : ( 'field' ) ;
    public final void rule__NewContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4460:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:4461:1: ( 'field' )
            {
            // InternalDataflowDSL.g:4461:1: ( 'field' )
            // InternalDataflowDSL.g:4462:2: 'field'
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
    // InternalDataflowDSL.g:4471:1: rule__NewContainer__Group_3__1 : rule__NewContainer__Group_3__1__Impl ;
    public final void rule__NewContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4475:1: ( rule__NewContainer__Group_3__1__Impl )
            // InternalDataflowDSL.g:4476:2: rule__NewContainer__Group_3__1__Impl
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
    // InternalDataflowDSL.g:4482:1: rule__NewContainer__Group_3__1__Impl : ( ( rule__NewContainer__ListFieldAssignment_3_1 ) ) ;
    public final void rule__NewContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4486:1: ( ( ( rule__NewContainer__ListFieldAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:4487:1: ( ( rule__NewContainer__ListFieldAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:4487:1: ( ( rule__NewContainer__ListFieldAssignment_3_1 ) )
            // InternalDataflowDSL.g:4488:2: ( rule__NewContainer__ListFieldAssignment_3_1 )
            {
             before(grammarAccess.getNewContainerAccess().getListFieldAssignment_3_1()); 
            // InternalDataflowDSL.g:4489:2: ( rule__NewContainer__ListFieldAssignment_3_1 )
            // InternalDataflowDSL.g:4489:3: rule__NewContainer__ListFieldAssignment_3_1
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
    // InternalDataflowDSL.g:4498:1: rule__NewContainer__Group_4__0 : rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1 ;
    public final void rule__NewContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4502:1: ( rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1 )
            // InternalDataflowDSL.g:4503:2: rule__NewContainer__Group_4__0__Impl rule__NewContainer__Group_4__1
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
    // InternalDataflowDSL.g:4510:1: rule__NewContainer__Group_4__0__Impl : ( 'containerType' ) ;
    public final void rule__NewContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4514:1: ( ( 'containerType' ) )
            // InternalDataflowDSL.g:4515:1: ( 'containerType' )
            {
            // InternalDataflowDSL.g:4515:1: ( 'containerType' )
            // InternalDataflowDSL.g:4516:2: 'containerType'
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
    // InternalDataflowDSL.g:4525:1: rule__NewContainer__Group_4__1 : rule__NewContainer__Group_4__1__Impl ;
    public final void rule__NewContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4529:1: ( rule__NewContainer__Group_4__1__Impl )
            // InternalDataflowDSL.g:4530:2: rule__NewContainer__Group_4__1__Impl
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
    // InternalDataflowDSL.g:4536:1: rule__NewContainer__Group_4__1__Impl : ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) ) ;
    public final void rule__NewContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4540:1: ( ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:4541:1: ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:4541:1: ( ( rule__NewContainer__ContainerTypeAssignment_4_1 ) )
            // InternalDataflowDSL.g:4542:2: ( rule__NewContainer__ContainerTypeAssignment_4_1 )
            {
             before(grammarAccess.getNewContainerAccess().getContainerTypeAssignment_4_1()); 
            // InternalDataflowDSL.g:4543:2: ( rule__NewContainer__ContainerTypeAssignment_4_1 )
            // InternalDataflowDSL.g:4543:3: rule__NewContainer__ContainerTypeAssignment_4_1
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
    // InternalDataflowDSL.g:4552:1: rule__NewContainer__Group_5__0 : rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1 ;
    public final void rule__NewContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4556:1: ( rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1 )
            // InternalDataflowDSL.g:4557:2: rule__NewContainer__Group_5__0__Impl rule__NewContainer__Group_5__1
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
    // InternalDataflowDSL.g:4564:1: rule__NewContainer__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__NewContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4568:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4569:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4569:1: ( 'target' )
            // InternalDataflowDSL.g:4570:2: 'target'
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
    // InternalDataflowDSL.g:4579:1: rule__NewContainer__Group_5__1 : rule__NewContainer__Group_5__1__Impl ;
    public final void rule__NewContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4583:1: ( rule__NewContainer__Group_5__1__Impl )
            // InternalDataflowDSL.g:4584:2: rule__NewContainer__Group_5__1__Impl
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
    // InternalDataflowDSL.g:4590:1: rule__NewContainer__Group_5__1__Impl : ( ( rule__NewContainer__TargetAssignment_5_1 ) ) ;
    public final void rule__NewContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4594:1: ( ( ( rule__NewContainer__TargetAssignment_5_1 ) ) )
            // InternalDataflowDSL.g:4595:1: ( ( rule__NewContainer__TargetAssignment_5_1 ) )
            {
            // InternalDataflowDSL.g:4595:1: ( ( rule__NewContainer__TargetAssignment_5_1 ) )
            // InternalDataflowDSL.g:4596:2: ( rule__NewContainer__TargetAssignment_5_1 )
            {
             before(grammarAccess.getNewContainerAccess().getTargetAssignment_5_1()); 
            // InternalDataflowDSL.g:4597:2: ( rule__NewContainer__TargetAssignment_5_1 )
            // InternalDataflowDSL.g:4597:3: rule__NewContainer__TargetAssignment_5_1
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
    // InternalDataflowDSL.g:4606:1: rule__AddToContainer__Group__0 : rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1 ;
    public final void rule__AddToContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4610:1: ( rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1 )
            // InternalDataflowDSL.g:4611:2: rule__AddToContainer__Group__0__Impl rule__AddToContainer__Group__1
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
    // InternalDataflowDSL.g:4618:1: rule__AddToContainer__Group__0__Impl : ( 'AddToContainer' ) ;
    public final void rule__AddToContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4622:1: ( ( 'AddToContainer' ) )
            // InternalDataflowDSL.g:4623:1: ( 'AddToContainer' )
            {
            // InternalDataflowDSL.g:4623:1: ( 'AddToContainer' )
            // InternalDataflowDSL.g:4624:2: 'AddToContainer'
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
    // InternalDataflowDSL.g:4633:1: rule__AddToContainer__Group__1 : rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2 ;
    public final void rule__AddToContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4637:1: ( rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2 )
            // InternalDataflowDSL.g:4638:2: rule__AddToContainer__Group__1__Impl rule__AddToContainer__Group__2
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
    // InternalDataflowDSL.g:4645:1: rule__AddToContainer__Group__1__Impl : ( ( rule__AddToContainer__NameAssignment_1 ) ) ;
    public final void rule__AddToContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4649:1: ( ( ( rule__AddToContainer__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:4650:1: ( ( rule__AddToContainer__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:4650:1: ( ( rule__AddToContainer__NameAssignment_1 ) )
            // InternalDataflowDSL.g:4651:2: ( rule__AddToContainer__NameAssignment_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:4652:2: ( rule__AddToContainer__NameAssignment_1 )
            // InternalDataflowDSL.g:4652:3: rule__AddToContainer__NameAssignment_1
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
    // InternalDataflowDSL.g:4660:1: rule__AddToContainer__Group__2 : rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3 ;
    public final void rule__AddToContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4664:1: ( rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3 )
            // InternalDataflowDSL.g:4665:2: rule__AddToContainer__Group__2__Impl rule__AddToContainer__Group__3
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
    // InternalDataflowDSL.g:4672:1: rule__AddToContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__AddToContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4676:1: ( ( '{' ) )
            // InternalDataflowDSL.g:4677:1: ( '{' )
            {
            // InternalDataflowDSL.g:4677:1: ( '{' )
            // InternalDataflowDSL.g:4678:2: '{'
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
    // InternalDataflowDSL.g:4687:1: rule__AddToContainer__Group__3 : rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4 ;
    public final void rule__AddToContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4691:1: ( rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4 )
            // InternalDataflowDSL.g:4692:2: rule__AddToContainer__Group__3__Impl rule__AddToContainer__Group__4
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
    // InternalDataflowDSL.g:4699:1: rule__AddToContainer__Group__3__Impl : ( ( rule__AddToContainer__Alternatives_3 )* ) ;
    public final void rule__AddToContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4703:1: ( ( ( rule__AddToContainer__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:4704:1: ( ( rule__AddToContainer__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:4704:1: ( ( rule__AddToContainer__Alternatives_3 )* )
            // InternalDataflowDSL.g:4705:2: ( rule__AddToContainer__Alternatives_3 )*
            {
             before(grammarAccess.getAddToContainerAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:4706:2: ( rule__AddToContainer__Alternatives_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34||LA40_0==38||LA40_0==54||LA40_0==58) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDataflowDSL.g:4706:3: rule__AddToContainer__Alternatives_3
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
    // InternalDataflowDSL.g:4714:1: rule__AddToContainer__Group__4 : rule__AddToContainer__Group__4__Impl ;
    public final void rule__AddToContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4718:1: ( rule__AddToContainer__Group__4__Impl )
            // InternalDataflowDSL.g:4719:2: rule__AddToContainer__Group__4__Impl
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
    // InternalDataflowDSL.g:4725:1: rule__AddToContainer__Group__4__Impl : ( '}' ) ;
    public final void rule__AddToContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4729:1: ( ( '}' ) )
            // InternalDataflowDSL.g:4730:1: ( '}' )
            {
            // InternalDataflowDSL.g:4730:1: ( '}' )
            // InternalDataflowDSL.g:4731:2: '}'
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
    // InternalDataflowDSL.g:4741:1: rule__AddToContainer__Group_3_0__0 : rule__AddToContainer__Group_3_0__0__Impl rule__AddToContainer__Group_3_0__1 ;
    public final void rule__AddToContainer__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4745:1: ( rule__AddToContainer__Group_3_0__0__Impl rule__AddToContainer__Group_3_0__1 )
            // InternalDataflowDSL.g:4746:2: rule__AddToContainer__Group_3_0__0__Impl rule__AddToContainer__Group_3_0__1
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
    // InternalDataflowDSL.g:4753:1: rule__AddToContainer__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__AddToContainer__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4757:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:4758:1: ( 'field' )
            {
            // InternalDataflowDSL.g:4758:1: ( 'field' )
            // InternalDataflowDSL.g:4759:2: 'field'
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
    // InternalDataflowDSL.g:4768:1: rule__AddToContainer__Group_3_0__1 : rule__AddToContainer__Group_3_0__1__Impl ;
    public final void rule__AddToContainer__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4772:1: ( rule__AddToContainer__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:4773:2: rule__AddToContainer__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:4779:1: rule__AddToContainer__Group_3_0__1__Impl : ( ( rule__AddToContainer__ListFieldAssignment_3_0_1 ) ) ;
    public final void rule__AddToContainer__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4783:1: ( ( ( rule__AddToContainer__ListFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:4784:1: ( ( rule__AddToContainer__ListFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:4784:1: ( ( rule__AddToContainer__ListFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:4785:2: ( rule__AddToContainer__ListFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getListFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:4786:2: ( rule__AddToContainer__ListFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:4786:3: rule__AddToContainer__ListFieldAssignment_3_0_1
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
    // InternalDataflowDSL.g:4795:1: rule__AddToContainer__Group_3_1__0 : rule__AddToContainer__Group_3_1__0__Impl rule__AddToContainer__Group_3_1__1 ;
    public final void rule__AddToContainer__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4799:1: ( rule__AddToContainer__Group_3_1__0__Impl rule__AddToContainer__Group_3_1__1 )
            // InternalDataflowDSL.g:4800:2: rule__AddToContainer__Group_3_1__0__Impl rule__AddToContainer__Group_3_1__1
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
    // InternalDataflowDSL.g:4807:1: rule__AddToContainer__Group_3_1__0__Impl : ( 'value' ) ;
    public final void rule__AddToContainer__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4811:1: ( ( 'value' ) )
            // InternalDataflowDSL.g:4812:1: ( 'value' )
            {
            // InternalDataflowDSL.g:4812:1: ( 'value' )
            // InternalDataflowDSL.g:4813:2: 'value'
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
    // InternalDataflowDSL.g:4822:1: rule__AddToContainer__Group_3_1__1 : rule__AddToContainer__Group_3_1__1__Impl ;
    public final void rule__AddToContainer__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4826:1: ( rule__AddToContainer__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:4827:2: rule__AddToContainer__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:4833:1: rule__AddToContainer__Group_3_1__1__Impl : ( ( rule__AddToContainer__ValueAssignment_3_1_1 ) ) ;
    public final void rule__AddToContainer__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4837:1: ( ( ( rule__AddToContainer__ValueAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:4838:1: ( ( rule__AddToContainer__ValueAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:4838:1: ( ( rule__AddToContainer__ValueAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:4839:2: ( rule__AddToContainer__ValueAssignment_3_1_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getValueAssignment_3_1_1()); 
            // InternalDataflowDSL.g:4840:2: ( rule__AddToContainer__ValueAssignment_3_1_1 )
            // InternalDataflowDSL.g:4840:3: rule__AddToContainer__ValueAssignment_3_1_1
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
    // InternalDataflowDSL.g:4849:1: rule__AddToContainer__Group_3_2__0 : rule__AddToContainer__Group_3_2__0__Impl rule__AddToContainer__Group_3_2__1 ;
    public final void rule__AddToContainer__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4853:1: ( rule__AddToContainer__Group_3_2__0__Impl rule__AddToContainer__Group_3_2__1 )
            // InternalDataflowDSL.g:4854:2: rule__AddToContainer__Group_3_2__0__Impl rule__AddToContainer__Group_3_2__1
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
    // InternalDataflowDSL.g:4861:1: rule__AddToContainer__Group_3_2__0__Impl : ( 'position' ) ;
    public final void rule__AddToContainer__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4865:1: ( ( 'position' ) )
            // InternalDataflowDSL.g:4866:1: ( 'position' )
            {
            // InternalDataflowDSL.g:4866:1: ( 'position' )
            // InternalDataflowDSL.g:4867:2: 'position'
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
    // InternalDataflowDSL.g:4876:1: rule__AddToContainer__Group_3_2__1 : rule__AddToContainer__Group_3_2__1__Impl ;
    public final void rule__AddToContainer__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4880:1: ( rule__AddToContainer__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:4881:2: rule__AddToContainer__Group_3_2__1__Impl
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
    // InternalDataflowDSL.g:4887:1: rule__AddToContainer__Group_3_2__1__Impl : ( ( rule__AddToContainer__PositionAssignment_3_2_1 ) ) ;
    public final void rule__AddToContainer__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4891:1: ( ( ( rule__AddToContainer__PositionAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:4892:1: ( ( rule__AddToContainer__PositionAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:4892:1: ( ( rule__AddToContainer__PositionAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:4893:2: ( rule__AddToContainer__PositionAssignment_3_2_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getPositionAssignment_3_2_1()); 
            // InternalDataflowDSL.g:4894:2: ( rule__AddToContainer__PositionAssignment_3_2_1 )
            // InternalDataflowDSL.g:4894:3: rule__AddToContainer__PositionAssignment_3_2_1
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
    // InternalDataflowDSL.g:4903:1: rule__AddToContainer__Group_3_3__0 : rule__AddToContainer__Group_3_3__0__Impl rule__AddToContainer__Group_3_3__1 ;
    public final void rule__AddToContainer__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4907:1: ( rule__AddToContainer__Group_3_3__0__Impl rule__AddToContainer__Group_3_3__1 )
            // InternalDataflowDSL.g:4908:2: rule__AddToContainer__Group_3_3__0__Impl rule__AddToContainer__Group_3_3__1
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
    // InternalDataflowDSL.g:4915:1: rule__AddToContainer__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__AddToContainer__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4919:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:4920:1: ( 'target' )
            {
            // InternalDataflowDSL.g:4920:1: ( 'target' )
            // InternalDataflowDSL.g:4921:2: 'target'
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
    // InternalDataflowDSL.g:4930:1: rule__AddToContainer__Group_3_3__1 : rule__AddToContainer__Group_3_3__1__Impl ;
    public final void rule__AddToContainer__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4934:1: ( rule__AddToContainer__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:4935:2: rule__AddToContainer__Group_3_3__1__Impl
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
    // InternalDataflowDSL.g:4941:1: rule__AddToContainer__Group_3_3__1__Impl : ( ( rule__AddToContainer__TargetAssignment_3_3_1 ) ) ;
    public final void rule__AddToContainer__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4945:1: ( ( ( rule__AddToContainer__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:4946:1: ( ( rule__AddToContainer__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:4946:1: ( ( rule__AddToContainer__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:4947:2: ( rule__AddToContainer__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getAddToContainerAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:4948:2: ( rule__AddToContainer__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:4948:3: rule__AddToContainer__TargetAssignment_3_3_1
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
    // InternalDataflowDSL.g:4957:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4961:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalDataflowDSL.g:4962:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
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
    // InternalDataflowDSL.g:4969:1: rule__ForEach__Group__0__Impl : ( 'ForEach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4973:1: ( ( 'ForEach' ) )
            // InternalDataflowDSL.g:4974:1: ( 'ForEach' )
            {
            // InternalDataflowDSL.g:4974:1: ( 'ForEach' )
            // InternalDataflowDSL.g:4975:2: 'ForEach'
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
    // InternalDataflowDSL.g:4984:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:4988:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalDataflowDSL.g:4989:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
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
    // InternalDataflowDSL.g:4996:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__NameAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5000:1: ( ( ( rule__ForEach__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:5001:1: ( ( rule__ForEach__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:5001:1: ( ( rule__ForEach__NameAssignment_1 ) )
            // InternalDataflowDSL.g:5002:2: ( rule__ForEach__NameAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:5003:2: ( rule__ForEach__NameAssignment_1 )
            // InternalDataflowDSL.g:5003:3: rule__ForEach__NameAssignment_1
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
    // InternalDataflowDSL.g:5011:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5015:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalDataflowDSL.g:5016:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
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
    // InternalDataflowDSL.g:5023:1: rule__ForEach__Group__2__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5027:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5028:1: ( '{' )
            {
            // InternalDataflowDSL.g:5028:1: ( '{' )
            // InternalDataflowDSL.g:5029:2: '{'
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
    // InternalDataflowDSL.g:5038:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5042:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalDataflowDSL.g:5043:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
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
    // InternalDataflowDSL.g:5050:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__Alternatives_3 )* ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5054:1: ( ( ( rule__ForEach__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:5055:1: ( ( rule__ForEach__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:5055:1: ( ( rule__ForEach__Alternatives_3 )* )
            // InternalDataflowDSL.g:5056:2: ( rule__ForEach__Alternatives_3 )*
            {
             before(grammarAccess.getForEachAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:5057:2: ( rule__ForEach__Alternatives_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==38||(LA41_0>=60 && LA41_0<=62)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDataflowDSL.g:5057:3: rule__ForEach__Alternatives_3
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
    // InternalDataflowDSL.g:5065:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5069:1: ( rule__ForEach__Group__4__Impl )
            // InternalDataflowDSL.g:5070:2: rule__ForEach__Group__4__Impl
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
    // InternalDataflowDSL.g:5076:1: rule__ForEach__Group__4__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5080:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5081:1: ( '}' )
            {
            // InternalDataflowDSL.g:5081:1: ( '}' )
            // InternalDataflowDSL.g:5082:2: '}'
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
    // InternalDataflowDSL.g:5092:1: rule__ForEach__Group_3_0__0 : rule__ForEach__Group_3_0__0__Impl rule__ForEach__Group_3_0__1 ;
    public final void rule__ForEach__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5096:1: ( rule__ForEach__Group_3_0__0__Impl rule__ForEach__Group_3_0__1 )
            // InternalDataflowDSL.g:5097:2: rule__ForEach__Group_3_0__0__Impl rule__ForEach__Group_3_0__1
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
    // InternalDataflowDSL.g:5104:1: rule__ForEach__Group_3_0__0__Impl : ( 'listField' ) ;
    public final void rule__ForEach__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5108:1: ( ( 'listField' ) )
            // InternalDataflowDSL.g:5109:1: ( 'listField' )
            {
            // InternalDataflowDSL.g:5109:1: ( 'listField' )
            // InternalDataflowDSL.g:5110:2: 'listField'
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
    // InternalDataflowDSL.g:5119:1: rule__ForEach__Group_3_0__1 : rule__ForEach__Group_3_0__1__Impl ;
    public final void rule__ForEach__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5123:1: ( rule__ForEach__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:5124:2: rule__ForEach__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:5130:1: rule__ForEach__Group_3_0__1__Impl : ( ( rule__ForEach__ListFieldAssignment_3_0_1 ) ) ;
    public final void rule__ForEach__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5134:1: ( ( ( rule__ForEach__ListFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:5135:1: ( ( rule__ForEach__ListFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:5135:1: ( ( rule__ForEach__ListFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:5136:2: ( rule__ForEach__ListFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getForEachAccess().getListFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:5137:2: ( rule__ForEach__ListFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:5137:3: rule__ForEach__ListFieldAssignment_3_0_1
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
    // InternalDataflowDSL.g:5146:1: rule__ForEach__Group_3_1__0 : rule__ForEach__Group_3_1__0__Impl rule__ForEach__Group_3_1__1 ;
    public final void rule__ForEach__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5150:1: ( rule__ForEach__Group_3_1__0__Impl rule__ForEach__Group_3_1__1 )
            // InternalDataflowDSL.g:5151:2: rule__ForEach__Group_3_1__0__Impl rule__ForEach__Group_3_1__1
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
    // InternalDataflowDSL.g:5158:1: rule__ForEach__Group_3_1__0__Impl : ( 'itemField' ) ;
    public final void rule__ForEach__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5162:1: ( ( 'itemField' ) )
            // InternalDataflowDSL.g:5163:1: ( 'itemField' )
            {
            // InternalDataflowDSL.g:5163:1: ( 'itemField' )
            // InternalDataflowDSL.g:5164:2: 'itemField'
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
    // InternalDataflowDSL.g:5173:1: rule__ForEach__Group_3_1__1 : rule__ForEach__Group_3_1__1__Impl ;
    public final void rule__ForEach__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5177:1: ( rule__ForEach__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:5178:2: rule__ForEach__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:5184:1: rule__ForEach__Group_3_1__1__Impl : ( ( rule__ForEach__ItemFieldAssignment_3_1_1 ) ) ;
    public final void rule__ForEach__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5188:1: ( ( ( rule__ForEach__ItemFieldAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:5189:1: ( ( rule__ForEach__ItemFieldAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:5189:1: ( ( rule__ForEach__ItemFieldAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:5190:2: ( rule__ForEach__ItemFieldAssignment_3_1_1 )
            {
             before(grammarAccess.getForEachAccess().getItemFieldAssignment_3_1_1()); 
            // InternalDataflowDSL.g:5191:2: ( rule__ForEach__ItemFieldAssignment_3_1_1 )
            // InternalDataflowDSL.g:5191:3: rule__ForEach__ItemFieldAssignment_3_1_1
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
    // InternalDataflowDSL.g:5200:1: rule__ForEach__Group_3_2__0 : rule__ForEach__Group_3_2__0__Impl rule__ForEach__Group_3_2__1 ;
    public final void rule__ForEach__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5204:1: ( rule__ForEach__Group_3_2__0__Impl rule__ForEach__Group_3_2__1 )
            // InternalDataflowDSL.g:5205:2: rule__ForEach__Group_3_2__0__Impl rule__ForEach__Group_3_2__1
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
    // InternalDataflowDSL.g:5212:1: rule__ForEach__Group_3_2__0__Impl : ( 'positionField' ) ;
    public final void rule__ForEach__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5216:1: ( ( 'positionField' ) )
            // InternalDataflowDSL.g:5217:1: ( 'positionField' )
            {
            // InternalDataflowDSL.g:5217:1: ( 'positionField' )
            // InternalDataflowDSL.g:5218:2: 'positionField'
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
    // InternalDataflowDSL.g:5227:1: rule__ForEach__Group_3_2__1 : rule__ForEach__Group_3_2__1__Impl ;
    public final void rule__ForEach__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5231:1: ( rule__ForEach__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:5232:2: rule__ForEach__Group_3_2__1__Impl
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
    // InternalDataflowDSL.g:5238:1: rule__ForEach__Group_3_2__1__Impl : ( ( rule__ForEach__PositionFieldAssignment_3_2_1 ) ) ;
    public final void rule__ForEach__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5242:1: ( ( ( rule__ForEach__PositionFieldAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:5243:1: ( ( rule__ForEach__PositionFieldAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:5243:1: ( ( rule__ForEach__PositionFieldAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:5244:2: ( rule__ForEach__PositionFieldAssignment_3_2_1 )
            {
             before(grammarAccess.getForEachAccess().getPositionFieldAssignment_3_2_1()); 
            // InternalDataflowDSL.g:5245:2: ( rule__ForEach__PositionFieldAssignment_3_2_1 )
            // InternalDataflowDSL.g:5245:3: rule__ForEach__PositionFieldAssignment_3_2_1
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
    // InternalDataflowDSL.g:5254:1: rule__ForEach__Group_3_3__0 : rule__ForEach__Group_3_3__0__Impl rule__ForEach__Group_3_3__1 ;
    public final void rule__ForEach__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5258:1: ( rule__ForEach__Group_3_3__0__Impl rule__ForEach__Group_3_3__1 )
            // InternalDataflowDSL.g:5259:2: rule__ForEach__Group_3_3__0__Impl rule__ForEach__Group_3_3__1
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
    // InternalDataflowDSL.g:5266:1: rule__ForEach__Group_3_3__0__Impl : ( 'target' ) ;
    public final void rule__ForEach__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5270:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5271:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5271:1: ( 'target' )
            // InternalDataflowDSL.g:5272:2: 'target'
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
    // InternalDataflowDSL.g:5281:1: rule__ForEach__Group_3_3__1 : rule__ForEach__Group_3_3__1__Impl ;
    public final void rule__ForEach__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5285:1: ( rule__ForEach__Group_3_3__1__Impl )
            // InternalDataflowDSL.g:5286:2: rule__ForEach__Group_3_3__1__Impl
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
    // InternalDataflowDSL.g:5292:1: rule__ForEach__Group_3_3__1__Impl : ( ( rule__ForEach__TargetAssignment_3_3_1 ) ) ;
    public final void rule__ForEach__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5296:1: ( ( ( rule__ForEach__TargetAssignment_3_3_1 ) ) )
            // InternalDataflowDSL.g:5297:1: ( ( rule__ForEach__TargetAssignment_3_3_1 ) )
            {
            // InternalDataflowDSL.g:5297:1: ( ( rule__ForEach__TargetAssignment_3_3_1 ) )
            // InternalDataflowDSL.g:5298:2: ( rule__ForEach__TargetAssignment_3_3_1 )
            {
             before(grammarAccess.getForEachAccess().getTargetAssignment_3_3_1()); 
            // InternalDataflowDSL.g:5299:2: ( rule__ForEach__TargetAssignment_3_3_1 )
            // InternalDataflowDSL.g:5299:3: rule__ForEach__TargetAssignment_3_3_1
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
    // InternalDataflowDSL.g:5308:1: rule__CollectBy__Group__0 : rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1 ;
    public final void rule__CollectBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5312:1: ( rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1 )
            // InternalDataflowDSL.g:5313:2: rule__CollectBy__Group__0__Impl rule__CollectBy__Group__1
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
    // InternalDataflowDSL.g:5320:1: rule__CollectBy__Group__0__Impl : ( 'CollectBy' ) ;
    public final void rule__CollectBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5324:1: ( ( 'CollectBy' ) )
            // InternalDataflowDSL.g:5325:1: ( 'CollectBy' )
            {
            // InternalDataflowDSL.g:5325:1: ( 'CollectBy' )
            // InternalDataflowDSL.g:5326:2: 'CollectBy'
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
    // InternalDataflowDSL.g:5335:1: rule__CollectBy__Group__1 : rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2 ;
    public final void rule__CollectBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5339:1: ( rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2 )
            // InternalDataflowDSL.g:5340:2: rule__CollectBy__Group__1__Impl rule__CollectBy__Group__2
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
    // InternalDataflowDSL.g:5347:1: rule__CollectBy__Group__1__Impl : ( ( rule__CollectBy__NameAssignment_1 ) ) ;
    public final void rule__CollectBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5351:1: ( ( ( rule__CollectBy__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:5352:1: ( ( rule__CollectBy__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:5352:1: ( ( rule__CollectBy__NameAssignment_1 ) )
            // InternalDataflowDSL.g:5353:2: ( rule__CollectBy__NameAssignment_1 )
            {
             before(grammarAccess.getCollectByAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:5354:2: ( rule__CollectBy__NameAssignment_1 )
            // InternalDataflowDSL.g:5354:3: rule__CollectBy__NameAssignment_1
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
    // InternalDataflowDSL.g:5362:1: rule__CollectBy__Group__2 : rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3 ;
    public final void rule__CollectBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5366:1: ( rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3 )
            // InternalDataflowDSL.g:5367:2: rule__CollectBy__Group__2__Impl rule__CollectBy__Group__3
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
    // InternalDataflowDSL.g:5374:1: rule__CollectBy__Group__2__Impl : ( '{' ) ;
    public final void rule__CollectBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5378:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5379:1: ( '{' )
            {
            // InternalDataflowDSL.g:5379:1: ( '{' )
            // InternalDataflowDSL.g:5380:2: '{'
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
    // InternalDataflowDSL.g:5389:1: rule__CollectBy__Group__3 : rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4 ;
    public final void rule__CollectBy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5393:1: ( rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4 )
            // InternalDataflowDSL.g:5394:2: rule__CollectBy__Group__3__Impl rule__CollectBy__Group__4
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
    // InternalDataflowDSL.g:5401:1: rule__CollectBy__Group__3__Impl : ( ( rule__CollectBy__Alternatives_3 )* ) ;
    public final void rule__CollectBy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5405:1: ( ( ( rule__CollectBy__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:5406:1: ( ( rule__CollectBy__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:5406:1: ( ( rule__CollectBy__Alternatives_3 )* )
            // InternalDataflowDSL.g:5407:2: ( rule__CollectBy__Alternatives_3 )*
            {
             before(grammarAccess.getCollectByAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:5408:2: ( rule__CollectBy__Alternatives_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==34||LA42_0==38||LA42_0==64) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDataflowDSL.g:5408:3: rule__CollectBy__Alternatives_3
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
    // InternalDataflowDSL.g:5416:1: rule__CollectBy__Group__4 : rule__CollectBy__Group__4__Impl ;
    public final void rule__CollectBy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5420:1: ( rule__CollectBy__Group__4__Impl )
            // InternalDataflowDSL.g:5421:2: rule__CollectBy__Group__4__Impl
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
    // InternalDataflowDSL.g:5427:1: rule__CollectBy__Group__4__Impl : ( '}' ) ;
    public final void rule__CollectBy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5431:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5432:1: ( '}' )
            {
            // InternalDataflowDSL.g:5432:1: ( '}' )
            // InternalDataflowDSL.g:5433:2: '}'
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
    // InternalDataflowDSL.g:5443:1: rule__CollectBy__Group_3_0__0 : rule__CollectBy__Group_3_0__0__Impl rule__CollectBy__Group_3_0__1 ;
    public final void rule__CollectBy__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5447:1: ( rule__CollectBy__Group_3_0__0__Impl rule__CollectBy__Group_3_0__1 )
            // InternalDataflowDSL.g:5448:2: rule__CollectBy__Group_3_0__0__Impl rule__CollectBy__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDataflowDSL.g:5455:1: rule__CollectBy__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__CollectBy__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5459:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:5460:1: ( 'field' )
            {
            // InternalDataflowDSL.g:5460:1: ( 'field' )
            // InternalDataflowDSL.g:5461:2: 'field'
            {
             before(grammarAccess.getCollectByAccess().getFieldKeyword_3_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getFieldKeyword_3_0_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:5470:1: rule__CollectBy__Group_3_0__1 : rule__CollectBy__Group_3_0__1__Impl ;
    public final void rule__CollectBy__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5474:1: ( rule__CollectBy__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:5475:2: rule__CollectBy__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:5481:1: rule__CollectBy__Group_3_0__1__Impl : ( ( rule__CollectBy__ElementFieldAssignment_3_0_1 ) ) ;
    public final void rule__CollectBy__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5485:1: ( ( ( rule__CollectBy__ElementFieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:5486:1: ( ( rule__CollectBy__ElementFieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:5486:1: ( ( rule__CollectBy__ElementFieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:5487:2: ( rule__CollectBy__ElementFieldAssignment_3_0_1 )
            {
             before(grammarAccess.getCollectByAccess().getElementFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:5488:2: ( rule__CollectBy__ElementFieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:5488:3: rule__CollectBy__ElementFieldAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__ElementFieldAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getElementFieldAssignment_3_0_1()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:5497:1: rule__CollectBy__Group_3_1__0 : rule__CollectBy__Group_3_1__0__Impl rule__CollectBy__Group_3_1__1 ;
    public final void rule__CollectBy__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5501:1: ( rule__CollectBy__Group_3_1__0__Impl rule__CollectBy__Group_3_1__1 )
            // InternalDataflowDSL.g:5502:2: rule__CollectBy__Group_3_1__0__Impl rule__CollectBy__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflowDSL.g:5509:1: rule__CollectBy__Group_3_1__0__Impl : ( 'collectBy' ) ;
    public final void rule__CollectBy__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5513:1: ( ( 'collectBy' ) )
            // InternalDataflowDSL.g:5514:1: ( 'collectBy' )
            {
            // InternalDataflowDSL.g:5514:1: ( 'collectBy' )
            // InternalDataflowDSL.g:5515:2: 'collectBy'
            {
             before(grammarAccess.getCollectByAccess().getCollectByKeyword_3_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getCollectByKeyword_3_1_0()); 

            }


            }

        }
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
    // InternalDataflowDSL.g:5524:1: rule__CollectBy__Group_3_1__1 : rule__CollectBy__Group_3_1__1__Impl ;
    public final void rule__CollectBy__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5528:1: ( rule__CollectBy__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:5529:2: rule__CollectBy__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:5535:1: rule__CollectBy__Group_3_1__1__Impl : ( ( rule__CollectBy__CollectByAssignment_3_1_1 ) ) ;
    public final void rule__CollectBy__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5539:1: ( ( ( rule__CollectBy__CollectByAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:5540:1: ( ( rule__CollectBy__CollectByAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:5540:1: ( ( rule__CollectBy__CollectByAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:5541:2: ( rule__CollectBy__CollectByAssignment_3_1_1 )
            {
             before(grammarAccess.getCollectByAccess().getCollectByAssignment_3_1_1()); 
            // InternalDataflowDSL.g:5542:2: ( rule__CollectBy__CollectByAssignment_3_1_1 )
            // InternalDataflowDSL.g:5542:3: rule__CollectBy__CollectByAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__CollectByAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getCollectByAssignment_3_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CollectBy__Group_3_2__0"
    // InternalDataflowDSL.g:5551:1: rule__CollectBy__Group_3_2__0 : rule__CollectBy__Group_3_2__0__Impl rule__CollectBy__Group_3_2__1 ;
    public final void rule__CollectBy__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5555:1: ( rule__CollectBy__Group_3_2__0__Impl rule__CollectBy__Group_3_2__1 )
            // InternalDataflowDSL.g:5556:2: rule__CollectBy__Group_3_2__0__Impl rule__CollectBy__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__CollectBy__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_2__0"


    // $ANTLR start "rule__CollectBy__Group_3_2__0__Impl"
    // InternalDataflowDSL.g:5563:1: rule__CollectBy__Group_3_2__0__Impl : ( 'target' ) ;
    public final void rule__CollectBy__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5567:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5568:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5568:1: ( 'target' )
            // InternalDataflowDSL.g:5569:2: 'target'
            {
             before(grammarAccess.getCollectByAccess().getTargetKeyword_3_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getTargetKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_2__0__Impl"


    // $ANTLR start "rule__CollectBy__Group_3_2__1"
    // InternalDataflowDSL.g:5578:1: rule__CollectBy__Group_3_2__1 : rule__CollectBy__Group_3_2__1__Impl ;
    public final void rule__CollectBy__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5582:1: ( rule__CollectBy__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:5583:2: rule__CollectBy__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_2__1"


    // $ANTLR start "rule__CollectBy__Group_3_2__1__Impl"
    // InternalDataflowDSL.g:5589:1: rule__CollectBy__Group_3_2__1__Impl : ( ( rule__CollectBy__TargetAssignment_3_2_1 ) ) ;
    public final void rule__CollectBy__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5593:1: ( ( ( rule__CollectBy__TargetAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:5594:1: ( ( rule__CollectBy__TargetAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:5594:1: ( ( rule__CollectBy__TargetAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:5595:2: ( rule__CollectBy__TargetAssignment_3_2_1 )
            {
             before(grammarAccess.getCollectByAccess().getTargetAssignment_3_2_1()); 
            // InternalDataflowDSL.g:5596:2: ( rule__CollectBy__TargetAssignment_3_2_1 )
            // InternalDataflowDSL.g:5596:3: rule__CollectBy__TargetAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CollectBy__TargetAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectByAccess().getTargetAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__Group_3_2__1__Impl"


    // $ANTLR start "rule__Evaluate__Group__0"
    // InternalDataflowDSL.g:5605:1: rule__Evaluate__Group__0 : rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 ;
    public final void rule__Evaluate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5609:1: ( rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 )
            // InternalDataflowDSL.g:5610:2: rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1
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
    // InternalDataflowDSL.g:5617:1: rule__Evaluate__Group__0__Impl : ( 'Evaluate' ) ;
    public final void rule__Evaluate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5621:1: ( ( 'Evaluate' ) )
            // InternalDataflowDSL.g:5622:1: ( 'Evaluate' )
            {
            // InternalDataflowDSL.g:5622:1: ( 'Evaluate' )
            // InternalDataflowDSL.g:5623:2: 'Evaluate'
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
    // InternalDataflowDSL.g:5632:1: rule__Evaluate__Group__1 : rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 ;
    public final void rule__Evaluate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5636:1: ( rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 )
            // InternalDataflowDSL.g:5637:2: rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2
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
    // InternalDataflowDSL.g:5644:1: rule__Evaluate__Group__1__Impl : ( ( rule__Evaluate__NameAssignment_1 ) ) ;
    public final void rule__Evaluate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5648:1: ( ( ( rule__Evaluate__NameAssignment_1 ) ) )
            // InternalDataflowDSL.g:5649:1: ( ( rule__Evaluate__NameAssignment_1 ) )
            {
            // InternalDataflowDSL.g:5649:1: ( ( rule__Evaluate__NameAssignment_1 ) )
            // InternalDataflowDSL.g:5650:2: ( rule__Evaluate__NameAssignment_1 )
            {
             before(grammarAccess.getEvaluateAccess().getNameAssignment_1()); 
            // InternalDataflowDSL.g:5651:2: ( rule__Evaluate__NameAssignment_1 )
            // InternalDataflowDSL.g:5651:3: rule__Evaluate__NameAssignment_1
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
    // InternalDataflowDSL.g:5659:1: rule__Evaluate__Group__2 : rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3 ;
    public final void rule__Evaluate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5663:1: ( rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3 )
            // InternalDataflowDSL.g:5664:2: rule__Evaluate__Group__2__Impl rule__Evaluate__Group__3
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
    // InternalDataflowDSL.g:5671:1: rule__Evaluate__Group__2__Impl : ( '{' ) ;
    public final void rule__Evaluate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5675:1: ( ( '{' ) )
            // InternalDataflowDSL.g:5676:1: ( '{' )
            {
            // InternalDataflowDSL.g:5676:1: ( '{' )
            // InternalDataflowDSL.g:5677:2: '{'
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
    // InternalDataflowDSL.g:5686:1: rule__Evaluate__Group__3 : rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4 ;
    public final void rule__Evaluate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5690:1: ( rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4 )
            // InternalDataflowDSL.g:5691:2: rule__Evaluate__Group__3__Impl rule__Evaluate__Group__4
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
    // InternalDataflowDSL.g:5698:1: rule__Evaluate__Group__3__Impl : ( ( rule__Evaluate__Alternatives_3 )* ) ;
    public final void rule__Evaluate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5702:1: ( ( ( rule__Evaluate__Alternatives_3 )* ) )
            // InternalDataflowDSL.g:5703:1: ( ( rule__Evaluate__Alternatives_3 )* )
            {
            // InternalDataflowDSL.g:5703:1: ( ( rule__Evaluate__Alternatives_3 )* )
            // InternalDataflowDSL.g:5704:2: ( rule__Evaluate__Alternatives_3 )*
            {
             before(grammarAccess.getEvaluateAccess().getAlternatives_3()); 
            // InternalDataflowDSL.g:5705:2: ( rule__Evaluate__Alternatives_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==34||LA43_0==38||LA43_0==66) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDataflowDSL.g:5705:3: rule__Evaluate__Alternatives_3
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
    // InternalDataflowDSL.g:5713:1: rule__Evaluate__Group__4 : rule__Evaluate__Group__4__Impl ;
    public final void rule__Evaluate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5717:1: ( rule__Evaluate__Group__4__Impl )
            // InternalDataflowDSL.g:5718:2: rule__Evaluate__Group__4__Impl
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
    // InternalDataflowDSL.g:5724:1: rule__Evaluate__Group__4__Impl : ( '}' ) ;
    public final void rule__Evaluate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5728:1: ( ( '}' ) )
            // InternalDataflowDSL.g:5729:1: ( '}' )
            {
            // InternalDataflowDSL.g:5729:1: ( '}' )
            // InternalDataflowDSL.g:5730:2: '}'
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
    // InternalDataflowDSL.g:5740:1: rule__Evaluate__Group_3_0__0 : rule__Evaluate__Group_3_0__0__Impl rule__Evaluate__Group_3_0__1 ;
    public final void rule__Evaluate__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5744:1: ( rule__Evaluate__Group_3_0__0__Impl rule__Evaluate__Group_3_0__1 )
            // InternalDataflowDSL.g:5745:2: rule__Evaluate__Group_3_0__0__Impl rule__Evaluate__Group_3_0__1
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
    // InternalDataflowDSL.g:5752:1: rule__Evaluate__Group_3_0__0__Impl : ( 'field' ) ;
    public final void rule__Evaluate__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5756:1: ( ( 'field' ) )
            // InternalDataflowDSL.g:5757:1: ( 'field' )
            {
            // InternalDataflowDSL.g:5757:1: ( 'field' )
            // InternalDataflowDSL.g:5758:2: 'field'
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
    // InternalDataflowDSL.g:5767:1: rule__Evaluate__Group_3_0__1 : rule__Evaluate__Group_3_0__1__Impl ;
    public final void rule__Evaluate__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5771:1: ( rule__Evaluate__Group_3_0__1__Impl )
            // InternalDataflowDSL.g:5772:2: rule__Evaluate__Group_3_0__1__Impl
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
    // InternalDataflowDSL.g:5778:1: rule__Evaluate__Group_3_0__1__Impl : ( ( rule__Evaluate__FieldAssignment_3_0_1 ) ) ;
    public final void rule__Evaluate__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5782:1: ( ( ( rule__Evaluate__FieldAssignment_3_0_1 ) ) )
            // InternalDataflowDSL.g:5783:1: ( ( rule__Evaluate__FieldAssignment_3_0_1 ) )
            {
            // InternalDataflowDSL.g:5783:1: ( ( rule__Evaluate__FieldAssignment_3_0_1 ) )
            // InternalDataflowDSL.g:5784:2: ( rule__Evaluate__FieldAssignment_3_0_1 )
            {
             before(grammarAccess.getEvaluateAccess().getFieldAssignment_3_0_1()); 
            // InternalDataflowDSL.g:5785:2: ( rule__Evaluate__FieldAssignment_3_0_1 )
            // InternalDataflowDSL.g:5785:3: rule__Evaluate__FieldAssignment_3_0_1
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
    // InternalDataflowDSL.g:5794:1: rule__Evaluate__Group_3_1__0 : rule__Evaluate__Group_3_1__0__Impl rule__Evaluate__Group_3_1__1 ;
    public final void rule__Evaluate__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5798:1: ( rule__Evaluate__Group_3_1__0__Impl rule__Evaluate__Group_3_1__1 )
            // InternalDataflowDSL.g:5799:2: rule__Evaluate__Group_3_1__0__Impl rule__Evaluate__Group_3_1__1
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
    // InternalDataflowDSL.g:5806:1: rule__Evaluate__Group_3_1__0__Impl : ( 'expression' ) ;
    public final void rule__Evaluate__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5810:1: ( ( 'expression' ) )
            // InternalDataflowDSL.g:5811:1: ( 'expression' )
            {
            // InternalDataflowDSL.g:5811:1: ( 'expression' )
            // InternalDataflowDSL.g:5812:2: 'expression'
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
    // InternalDataflowDSL.g:5821:1: rule__Evaluate__Group_3_1__1 : rule__Evaluate__Group_3_1__1__Impl ;
    public final void rule__Evaluate__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5825:1: ( rule__Evaluate__Group_3_1__1__Impl )
            // InternalDataflowDSL.g:5826:2: rule__Evaluate__Group_3_1__1__Impl
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
    // InternalDataflowDSL.g:5832:1: rule__Evaluate__Group_3_1__1__Impl : ( ( rule__Evaluate__ExpressionAssignment_3_1_1 ) ) ;
    public final void rule__Evaluate__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5836:1: ( ( ( rule__Evaluate__ExpressionAssignment_3_1_1 ) ) )
            // InternalDataflowDSL.g:5837:1: ( ( rule__Evaluate__ExpressionAssignment_3_1_1 ) )
            {
            // InternalDataflowDSL.g:5837:1: ( ( rule__Evaluate__ExpressionAssignment_3_1_1 ) )
            // InternalDataflowDSL.g:5838:2: ( rule__Evaluate__ExpressionAssignment_3_1_1 )
            {
             before(grammarAccess.getEvaluateAccess().getExpressionAssignment_3_1_1()); 
            // InternalDataflowDSL.g:5839:2: ( rule__Evaluate__ExpressionAssignment_3_1_1 )
            // InternalDataflowDSL.g:5839:3: rule__Evaluate__ExpressionAssignment_3_1_1
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
    // InternalDataflowDSL.g:5848:1: rule__Evaluate__Group_3_2__0 : rule__Evaluate__Group_3_2__0__Impl rule__Evaluate__Group_3_2__1 ;
    public final void rule__Evaluate__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5852:1: ( rule__Evaluate__Group_3_2__0__Impl rule__Evaluate__Group_3_2__1 )
            // InternalDataflowDSL.g:5853:2: rule__Evaluate__Group_3_2__0__Impl rule__Evaluate__Group_3_2__1
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
    // InternalDataflowDSL.g:5860:1: rule__Evaluate__Group_3_2__0__Impl : ( 'target' ) ;
    public final void rule__Evaluate__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5864:1: ( ( 'target' ) )
            // InternalDataflowDSL.g:5865:1: ( 'target' )
            {
            // InternalDataflowDSL.g:5865:1: ( 'target' )
            // InternalDataflowDSL.g:5866:2: 'target'
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
    // InternalDataflowDSL.g:5875:1: rule__Evaluate__Group_3_2__1 : rule__Evaluate__Group_3_2__1__Impl ;
    public final void rule__Evaluate__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5879:1: ( rule__Evaluate__Group_3_2__1__Impl )
            // InternalDataflowDSL.g:5880:2: rule__Evaluate__Group_3_2__1__Impl
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
    // InternalDataflowDSL.g:5886:1: rule__Evaluate__Group_3_2__1__Impl : ( ( rule__Evaluate__TargetAssignment_3_2_1 ) ) ;
    public final void rule__Evaluate__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5890:1: ( ( ( rule__Evaluate__TargetAssignment_3_2_1 ) ) )
            // InternalDataflowDSL.g:5891:1: ( ( rule__Evaluate__TargetAssignment_3_2_1 ) )
            {
            // InternalDataflowDSL.g:5891:1: ( ( rule__Evaluate__TargetAssignment_3_2_1 ) )
            // InternalDataflowDSL.g:5892:2: ( rule__Evaluate__TargetAssignment_3_2_1 )
            {
             before(grammarAccess.getEvaluateAccess().getTargetAssignment_3_2_1()); 
            // InternalDataflowDSL.g:5893:2: ( rule__Evaluate__TargetAssignment_3_2_1 )
            // InternalDataflowDSL.g:5893:3: rule__Evaluate__TargetAssignment_3_2_1
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
    // InternalDataflowDSL.g:5902:1: rule__ConditionalExpression__Group_0__0 : rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1 ;
    public final void rule__ConditionalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5906:1: ( rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1 )
            // InternalDataflowDSL.g:5907:2: rule__ConditionalExpression__Group_0__0__Impl rule__ConditionalExpression__Group_0__1
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
    // InternalDataflowDSL.g:5914:1: rule__ConditionalExpression__Group_0__0__Impl : ( 'if' ) ;
    public final void rule__ConditionalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5918:1: ( ( 'if' ) )
            // InternalDataflowDSL.g:5919:1: ( 'if' )
            {
            // InternalDataflowDSL.g:5919:1: ( 'if' )
            // InternalDataflowDSL.g:5920:2: 'if'
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
    // InternalDataflowDSL.g:5929:1: rule__ConditionalExpression__Group_0__1 : rule__ConditionalExpression__Group_0__1__Impl rule__ConditionalExpression__Group_0__2 ;
    public final void rule__ConditionalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5933:1: ( rule__ConditionalExpression__Group_0__1__Impl rule__ConditionalExpression__Group_0__2 )
            // InternalDataflowDSL.g:5934:2: rule__ConditionalExpression__Group_0__1__Impl rule__ConditionalExpression__Group_0__2
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
    // InternalDataflowDSL.g:5941:1: rule__ConditionalExpression__Group_0__1__Impl : ( ruleOrExpression ) ;
    public final void rule__ConditionalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5945:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:5946:1: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:5946:1: ( ruleOrExpression )
            // InternalDataflowDSL.g:5947:2: ruleOrExpression
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
    // InternalDataflowDSL.g:5956:1: rule__ConditionalExpression__Group_0__2 : rule__ConditionalExpression__Group_0__2__Impl rule__ConditionalExpression__Group_0__3 ;
    public final void rule__ConditionalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5960:1: ( rule__ConditionalExpression__Group_0__2__Impl rule__ConditionalExpression__Group_0__3 )
            // InternalDataflowDSL.g:5961:2: rule__ConditionalExpression__Group_0__2__Impl rule__ConditionalExpression__Group_0__3
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
    // InternalDataflowDSL.g:5968:1: rule__ConditionalExpression__Group_0__2__Impl : ( () ) ;
    public final void rule__ConditionalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5972:1: ( ( () ) )
            // InternalDataflowDSL.g:5973:1: ( () )
            {
            // InternalDataflowDSL.g:5973:1: ( () )
            // InternalDataflowDSL.g:5974:2: ()
            {
             before(grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionExpressionAction_0_2()); 
            // InternalDataflowDSL.g:5975:2: ()
            // InternalDataflowDSL.g:5975:3: 
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
    // InternalDataflowDSL.g:5983:1: rule__ConditionalExpression__Group_0__3 : rule__ConditionalExpression__Group_0__3__Impl rule__ConditionalExpression__Group_0__4 ;
    public final void rule__ConditionalExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5987:1: ( rule__ConditionalExpression__Group_0__3__Impl rule__ConditionalExpression__Group_0__4 )
            // InternalDataflowDSL.g:5988:2: rule__ConditionalExpression__Group_0__3__Impl rule__ConditionalExpression__Group_0__4
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
    // InternalDataflowDSL.g:5995:1: rule__ConditionalExpression__Group_0__3__Impl : ( 'then' ) ;
    public final void rule__ConditionalExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:5999:1: ( ( 'then' ) )
            // InternalDataflowDSL.g:6000:1: ( 'then' )
            {
            // InternalDataflowDSL.g:6000:1: ( 'then' )
            // InternalDataflowDSL.g:6001:2: 'then'
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
    // InternalDataflowDSL.g:6010:1: rule__ConditionalExpression__Group_0__4 : rule__ConditionalExpression__Group_0__4__Impl rule__ConditionalExpression__Group_0__5 ;
    public final void rule__ConditionalExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6014:1: ( rule__ConditionalExpression__Group_0__4__Impl rule__ConditionalExpression__Group_0__5 )
            // InternalDataflowDSL.g:6015:2: rule__ConditionalExpression__Group_0__4__Impl rule__ConditionalExpression__Group_0__5
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
    // InternalDataflowDSL.g:6022:1: rule__ConditionalExpression__Group_0__4__Impl : ( ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 ) ) ;
    public final void rule__ConditionalExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6026:1: ( ( ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 ) ) )
            // InternalDataflowDSL.g:6027:1: ( ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 ) )
            {
            // InternalDataflowDSL.g:6027:1: ( ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 ) )
            // InternalDataflowDSL.g:6028:2: ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getThenExpressionAssignment_0_4()); 
            // InternalDataflowDSL.g:6029:2: ( rule__ConditionalExpression__ThenExpressionAssignment_0_4 )
            // InternalDataflowDSL.g:6029:3: rule__ConditionalExpression__ThenExpressionAssignment_0_4
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
    // InternalDataflowDSL.g:6037:1: rule__ConditionalExpression__Group_0__5 : rule__ConditionalExpression__Group_0__5__Impl rule__ConditionalExpression__Group_0__6 ;
    public final void rule__ConditionalExpression__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6041:1: ( rule__ConditionalExpression__Group_0__5__Impl rule__ConditionalExpression__Group_0__6 )
            // InternalDataflowDSL.g:6042:2: rule__ConditionalExpression__Group_0__5__Impl rule__ConditionalExpression__Group_0__6
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
    // InternalDataflowDSL.g:6049:1: rule__ConditionalExpression__Group_0__5__Impl : ( 'else' ) ;
    public final void rule__ConditionalExpression__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6053:1: ( ( 'else' ) )
            // InternalDataflowDSL.g:6054:1: ( 'else' )
            {
            // InternalDataflowDSL.g:6054:1: ( 'else' )
            // InternalDataflowDSL.g:6055:2: 'else'
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
    // InternalDataflowDSL.g:6064:1: rule__ConditionalExpression__Group_0__6 : rule__ConditionalExpression__Group_0__6__Impl ;
    public final void rule__ConditionalExpression__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6068:1: ( rule__ConditionalExpression__Group_0__6__Impl )
            // InternalDataflowDSL.g:6069:2: rule__ConditionalExpression__Group_0__6__Impl
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
    // InternalDataflowDSL.g:6075:1: rule__ConditionalExpression__Group_0__6__Impl : ( ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 ) ) ;
    public final void rule__ConditionalExpression__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6079:1: ( ( ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 ) ) )
            // InternalDataflowDSL.g:6080:1: ( ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 ) )
            {
            // InternalDataflowDSL.g:6080:1: ( ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 ) )
            // InternalDataflowDSL.g:6081:2: ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getElseExpressionAssignment_0_6()); 
            // InternalDataflowDSL.g:6082:2: ( rule__ConditionalExpression__ElseExpressionAssignment_0_6 )
            // InternalDataflowDSL.g:6082:3: rule__ConditionalExpression__ElseExpressionAssignment_0_6
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
    // InternalDataflowDSL.g:6091:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6095:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalDataflowDSL.g:6096:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalDataflowDSL.g:6103:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6107:1: ( ( ruleAndExpression ) )
            // InternalDataflowDSL.g:6108:1: ( ruleAndExpression )
            {
            // InternalDataflowDSL.g:6108:1: ( ruleAndExpression )
            // InternalDataflowDSL.g:6109:2: ruleAndExpression
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
    // InternalDataflowDSL.g:6118:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6122:1: ( rule__OrExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6123:2: rule__OrExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6129:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6133:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6134:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6134:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6135:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6136:2: ( rule__OrExpression__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==11) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDataflowDSL.g:6136:3: rule__OrExpression__Group_1__0
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
    // InternalDataflowDSL.g:6145:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6149:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalDataflowDSL.g:6150:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalDataflowDSL.g:6157:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6161:1: ( ( () ) )
            // InternalDataflowDSL.g:6162:1: ( () )
            {
            // InternalDataflowDSL.g:6162:1: ( () )
            // InternalDataflowDSL.g:6163:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6164:2: ()
            // InternalDataflowDSL.g:6164:3: 
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
    // InternalDataflowDSL.g:6172:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6176:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalDataflowDSL.g:6177:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
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
    // InternalDataflowDSL.g:6184:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6188:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6189:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6189:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6190:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6191:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6191:3: rule__OrExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6199:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6203:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6204:2: rule__OrExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6210:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6214:1: ( ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6215:1: ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6215:1: ( ( rule__OrExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6216:2: ( rule__OrExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6217:2: ( rule__OrExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6217:3: rule__OrExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6226:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6230:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalDataflowDSL.g:6231:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalDataflowDSL.g:6238:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6242:1: ( ( ruleEqualityExpression ) )
            // InternalDataflowDSL.g:6243:1: ( ruleEqualityExpression )
            {
            // InternalDataflowDSL.g:6243:1: ( ruleEqualityExpression )
            // InternalDataflowDSL.g:6244:2: ruleEqualityExpression
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
    // InternalDataflowDSL.g:6253:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6257:1: ( rule__AndExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6258:2: rule__AndExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6264:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6268:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6269:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6269:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6270:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6271:2: ( rule__AndExpression__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==12) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDataflowDSL.g:6271:3: rule__AndExpression__Group_1__0
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
    // InternalDataflowDSL.g:6280:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6284:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalDataflowDSL.g:6285:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalDataflowDSL.g:6292:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6296:1: ( ( () ) )
            // InternalDataflowDSL.g:6297:1: ( () )
            {
            // InternalDataflowDSL.g:6297:1: ( () )
            // InternalDataflowDSL.g:6298:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6299:2: ()
            // InternalDataflowDSL.g:6299:3: 
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
    // InternalDataflowDSL.g:6307:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6311:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalDataflowDSL.g:6312:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
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
    // InternalDataflowDSL.g:6319:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6323:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6324:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6324:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6325:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6326:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6326:3: rule__AndExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6334:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6338:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6339:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6345:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6349:1: ( ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6350:1: ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6350:1: ( ( rule__AndExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6351:2: ( rule__AndExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6352:2: ( rule__AndExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6352:3: rule__AndExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6361:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6365:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalDataflowDSL.g:6366:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
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
    // InternalDataflowDSL.g:6373:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6377:1: ( ( ruleRelationalExpression ) )
            // InternalDataflowDSL.g:6378:1: ( ruleRelationalExpression )
            {
            // InternalDataflowDSL.g:6378:1: ( ruleRelationalExpression )
            // InternalDataflowDSL.g:6379:2: ruleRelationalExpression
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
    // InternalDataflowDSL.g:6388:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6392:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6393:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6399:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6403:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6404:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6404:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6405:2: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6406:2: ( rule__EqualityExpression__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=19 && LA46_0<=20)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDataflowDSL.g:6406:3: rule__EqualityExpression__Group_1__0
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
    // InternalDataflowDSL.g:6415:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6419:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalDataflowDSL.g:6420:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
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
    // InternalDataflowDSL.g:6427:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6431:1: ( ( () ) )
            // InternalDataflowDSL.g:6432:1: ( () )
            {
            // InternalDataflowDSL.g:6432:1: ( () )
            // InternalDataflowDSL.g:6433:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6434:2: ()
            // InternalDataflowDSL.g:6434:3: 
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
    // InternalDataflowDSL.g:6442:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6446:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalDataflowDSL.g:6447:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
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
    // InternalDataflowDSL.g:6454:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6458:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6459:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6459:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6460:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6461:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6461:3: rule__EqualityExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6469:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6473:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6474:2: rule__EqualityExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6480:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6484:1: ( ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6485:1: ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6485:1: ( ( rule__EqualityExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6486:2: ( rule__EqualityExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6487:2: ( rule__EqualityExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6487:3: rule__EqualityExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6496:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6500:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalDataflowDSL.g:6501:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
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
    // InternalDataflowDSL.g:6508:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6512:1: ( ( ruleAdditiveExpression ) )
            // InternalDataflowDSL.g:6513:1: ( ruleAdditiveExpression )
            {
            // InternalDataflowDSL.g:6513:1: ( ruleAdditiveExpression )
            // InternalDataflowDSL.g:6514:2: ruleAdditiveExpression
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
    // InternalDataflowDSL.g:6523:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6527:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6528:2: rule__RelationalExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6534:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6538:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6539:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6539:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6540:2: ( rule__RelationalExpression__Group_1__0 )*
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6541:2: ( rule__RelationalExpression__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=21 && LA47_0<=24)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDataflowDSL.g:6541:3: rule__RelationalExpression__Group_1__0
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
    // InternalDataflowDSL.g:6550:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6554:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalDataflowDSL.g:6555:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
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
    // InternalDataflowDSL.g:6562:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6566:1: ( ( () ) )
            // InternalDataflowDSL.g:6567:1: ( () )
            {
            // InternalDataflowDSL.g:6567:1: ( () )
            // InternalDataflowDSL.g:6568:2: ()
            {
             before(grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6569:2: ()
            // InternalDataflowDSL.g:6569:3: 
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
    // InternalDataflowDSL.g:6577:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6581:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // InternalDataflowDSL.g:6582:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
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
    // InternalDataflowDSL.g:6589:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6593:1: ( ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6594:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6594:1: ( ( rule__RelationalExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6595:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6596:2: ( rule__RelationalExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6596:3: rule__RelationalExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6604:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6608:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6609:2: rule__RelationalExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6615:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6619:1: ( ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6620:1: ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6620:1: ( ( rule__RelationalExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6621:2: ( rule__RelationalExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6622:2: ( rule__RelationalExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6622:3: rule__RelationalExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6631:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6635:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalDataflowDSL.g:6636:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
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
    // InternalDataflowDSL.g:6643:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6647:1: ( ( ruleMultiplicativeExpression ) )
            // InternalDataflowDSL.g:6648:1: ( ruleMultiplicativeExpression )
            {
            // InternalDataflowDSL.g:6648:1: ( ruleMultiplicativeExpression )
            // InternalDataflowDSL.g:6649:2: ruleMultiplicativeExpression
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
    // InternalDataflowDSL.g:6658:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6662:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6663:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6669:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6673:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6674:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6674:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6675:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6676:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=25 && LA48_0<=26)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDataflowDSL.g:6676:3: rule__AdditiveExpression__Group_1__0
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
    // InternalDataflowDSL.g:6685:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6689:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalDataflowDSL.g:6690:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
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
    // InternalDataflowDSL.g:6697:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6701:1: ( ( () ) )
            // InternalDataflowDSL.g:6702:1: ( () )
            {
            // InternalDataflowDSL.g:6702:1: ( () )
            // InternalDataflowDSL.g:6703:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6704:2: ()
            // InternalDataflowDSL.g:6704:3: 
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
    // InternalDataflowDSL.g:6712:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6716:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalDataflowDSL.g:6717:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
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
    // InternalDataflowDSL.g:6724:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6728:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6729:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6729:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6730:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6731:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6731:3: rule__AdditiveExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6739:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6743:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6744:2: rule__AdditiveExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6750:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6754:1: ( ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6755:1: ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6755:1: ( ( rule__AdditiveExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6756:2: ( rule__AdditiveExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6757:2: ( rule__AdditiveExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6757:3: rule__AdditiveExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6766:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6770:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalDataflowDSL.g:6771:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
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
    // InternalDataflowDSL.g:6778:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6782:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:6783:1: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:6783:1: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:6784:2: ruleUnaryExpression
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
    // InternalDataflowDSL.g:6793:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6797:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalDataflowDSL.g:6798:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:6804:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6808:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:6809:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:6809:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:6810:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:6811:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=27 && LA49_0<=29)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDataflowDSL.g:6811:3: rule__MultiplicativeExpression__Group_1__0
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
    // InternalDataflowDSL.g:6820:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6824:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalDataflowDSL.g:6825:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
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
    // InternalDataflowDSL.g:6832:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6836:1: ( ( () ) )
            // InternalDataflowDSL.g:6837:1: ( () )
            {
            // InternalDataflowDSL.g:6837:1: ( () )
            // InternalDataflowDSL.g:6838:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftExpressionAction_1_0()); 
            // InternalDataflowDSL.g:6839:2: ()
            // InternalDataflowDSL.g:6839:3: 
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
    // InternalDataflowDSL.g:6847:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6851:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalDataflowDSL.g:6852:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
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
    // InternalDataflowDSL.g:6859:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6863:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:6864:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:6864:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalDataflowDSL.g:6865:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalDataflowDSL.g:6866:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalDataflowDSL.g:6866:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
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
    // InternalDataflowDSL.g:6874:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6878:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalDataflowDSL.g:6879:2: rule__MultiplicativeExpression__Group_1__2__Impl
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
    // InternalDataflowDSL.g:6885:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6889:1: ( ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:6890:1: ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:6890:1: ( ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 ) )
            // InternalDataflowDSL.g:6891:2: ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalDataflowDSL.g:6892:2: ( rule__MultiplicativeExpression__RightExpressionAssignment_1_2 )
            // InternalDataflowDSL.g:6892:3: rule__MultiplicativeExpression__RightExpressionAssignment_1_2
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
    // InternalDataflowDSL.g:6901:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6905:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalDataflowDSL.g:6906:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
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
    // InternalDataflowDSL.g:6913:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6917:1: ( ( () ) )
            // InternalDataflowDSL.g:6918:1: ( () )
            {
            // InternalDataflowDSL.g:6918:1: ( () )
            // InternalDataflowDSL.g:6919:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperationAction_0_0()); 
            // InternalDataflowDSL.g:6920:2: ()
            // InternalDataflowDSL.g:6920:3: 
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
    // InternalDataflowDSL.g:6928:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6932:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalDataflowDSL.g:6933:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
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
    // InternalDataflowDSL.g:6940:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6944:1: ( ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) )
            // InternalDataflowDSL.g:6945:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            {
            // InternalDataflowDSL.g:6945:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            // InternalDataflowDSL.g:6946:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            // InternalDataflowDSL.g:6947:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            // InternalDataflowDSL.g:6947:3: rule__UnaryExpression__OperatorAssignment_0_1
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
    // InternalDataflowDSL.g:6955:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6959:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalDataflowDSL.g:6960:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalDataflowDSL.g:6966:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6970:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) )
            // InternalDataflowDSL.g:6971:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            {
            // InternalDataflowDSL.g:6971:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            // InternalDataflowDSL.g:6972:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 
            // InternalDataflowDSL.g:6973:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            // InternalDataflowDSL.g:6973:3: rule__UnaryExpression__ExpressionAssignment_0_2
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
    // InternalDataflowDSL.g:6982:1: rule__FeatureCallExpression__Group__0 : rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1 ;
    public final void rule__FeatureCallExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6986:1: ( rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1 )
            // InternalDataflowDSL.g:6987:2: rule__FeatureCallExpression__Group__0__Impl rule__FeatureCallExpression__Group__1
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
    // InternalDataflowDSL.g:6994:1: rule__FeatureCallExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__FeatureCallExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:6998:1: ( ( rulePrimaryExpression ) )
            // InternalDataflowDSL.g:6999:1: ( rulePrimaryExpression )
            {
            // InternalDataflowDSL.g:6999:1: ( rulePrimaryExpression )
            // InternalDataflowDSL.g:7000:2: rulePrimaryExpression
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
    // InternalDataflowDSL.g:7009:1: rule__FeatureCallExpression__Group__1 : rule__FeatureCallExpression__Group__1__Impl ;
    public final void rule__FeatureCallExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7013:1: ( rule__FeatureCallExpression__Group__1__Impl )
            // InternalDataflowDSL.g:7014:2: rule__FeatureCallExpression__Group__1__Impl
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
    // InternalDataflowDSL.g:7020:1: rule__FeatureCallExpression__Group__1__Impl : ( ( rule__FeatureCallExpression__Group_1__0 )* ) ;
    public final void rule__FeatureCallExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7024:1: ( ( ( rule__FeatureCallExpression__Group_1__0 )* ) )
            // InternalDataflowDSL.g:7025:1: ( ( rule__FeatureCallExpression__Group_1__0 )* )
            {
            // InternalDataflowDSL.g:7025:1: ( ( rule__FeatureCallExpression__Group_1__0 )* )
            // InternalDataflowDSL.g:7026:2: ( rule__FeatureCallExpression__Group_1__0 )*
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1()); 
            // InternalDataflowDSL.g:7027:2: ( rule__FeatureCallExpression__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==70) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDataflowDSL.g:7027:3: rule__FeatureCallExpression__Group_1__0
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
    // InternalDataflowDSL.g:7036:1: rule__FeatureCallExpression__Group_1__0 : rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1 ;
    public final void rule__FeatureCallExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7040:1: ( rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1 )
            // InternalDataflowDSL.g:7041:2: rule__FeatureCallExpression__Group_1__0__Impl rule__FeatureCallExpression__Group_1__1
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
    // InternalDataflowDSL.g:7048:1: rule__FeatureCallExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__FeatureCallExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7052:1: ( ( () ) )
            // InternalDataflowDSL.g:7053:1: ( () )
            {
            // InternalDataflowDSL.g:7053:1: ( () )
            // InternalDataflowDSL.g:7054:2: ()
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFeatureCallTargetExpressionAction_1_0()); 
            // InternalDataflowDSL.g:7055:2: ()
            // InternalDataflowDSL.g:7055:3: 
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
    // InternalDataflowDSL.g:7063:1: rule__FeatureCallExpression__Group_1__1 : rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2 ;
    public final void rule__FeatureCallExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7067:1: ( rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2 )
            // InternalDataflowDSL.g:7068:2: rule__FeatureCallExpression__Group_1__1__Impl rule__FeatureCallExpression__Group_1__2
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
    // InternalDataflowDSL.g:7075:1: rule__FeatureCallExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__FeatureCallExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7079:1: ( ( '.' ) )
            // InternalDataflowDSL.g:7080:1: ( '.' )
            {
            // InternalDataflowDSL.g:7080:1: ( '.' )
            // InternalDataflowDSL.g:7081:2: '.'
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
    // InternalDataflowDSL.g:7090:1: rule__FeatureCallExpression__Group_1__2 : rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3 ;
    public final void rule__FeatureCallExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7094:1: ( rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3 )
            // InternalDataflowDSL.g:7095:2: rule__FeatureCallExpression__Group_1__2__Impl rule__FeatureCallExpression__Group_1__3
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
    // InternalDataflowDSL.g:7102:1: rule__FeatureCallExpression__Group_1__2__Impl : ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) ) ;
    public final void rule__FeatureCallExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7106:1: ( ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) ) )
            // InternalDataflowDSL.g:7107:1: ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) )
            {
            // InternalDataflowDSL.g:7107:1: ( ( rule__FeatureCallExpression__FeatureAssignment_1_2 ) )
            // InternalDataflowDSL.g:7108:2: ( rule__FeatureCallExpression__FeatureAssignment_1_2 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getFeatureAssignment_1_2()); 
            // InternalDataflowDSL.g:7109:2: ( rule__FeatureCallExpression__FeatureAssignment_1_2 )
            // InternalDataflowDSL.g:7109:3: rule__FeatureCallExpression__FeatureAssignment_1_2
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
    // InternalDataflowDSL.g:7117:1: rule__FeatureCallExpression__Group_1__3 : rule__FeatureCallExpression__Group_1__3__Impl ;
    public final void rule__FeatureCallExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7121:1: ( rule__FeatureCallExpression__Group_1__3__Impl )
            // InternalDataflowDSL.g:7122:2: rule__FeatureCallExpression__Group_1__3__Impl
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
    // InternalDataflowDSL.g:7128:1: rule__FeatureCallExpression__Group_1__3__Impl : ( ( rule__FeatureCallExpression__Group_1_3__0 )? ) ;
    public final void rule__FeatureCallExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7132:1: ( ( ( rule__FeatureCallExpression__Group_1_3__0 )? ) )
            // InternalDataflowDSL.g:7133:1: ( ( rule__FeatureCallExpression__Group_1_3__0 )? )
            {
            // InternalDataflowDSL.g:7133:1: ( ( rule__FeatureCallExpression__Group_1_3__0 )? )
            // InternalDataflowDSL.g:7134:2: ( rule__FeatureCallExpression__Group_1_3__0 )?
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3()); 
            // InternalDataflowDSL.g:7135:2: ( rule__FeatureCallExpression__Group_1_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==71) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDataflowDSL.g:7135:3: rule__FeatureCallExpression__Group_1_3__0
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
    // InternalDataflowDSL.g:7144:1: rule__FeatureCallExpression__Group_1_3__0 : rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1 ;
    public final void rule__FeatureCallExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7148:1: ( rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1 )
            // InternalDataflowDSL.g:7149:2: rule__FeatureCallExpression__Group_1_3__0__Impl rule__FeatureCallExpression__Group_1_3__1
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
    // InternalDataflowDSL.g:7156:1: rule__FeatureCallExpression__Group_1_3__0__Impl : ( '(' ) ;
    public final void rule__FeatureCallExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7160:1: ( ( '(' ) )
            // InternalDataflowDSL.g:7161:1: ( '(' )
            {
            // InternalDataflowDSL.g:7161:1: ( '(' )
            // InternalDataflowDSL.g:7162:2: '('
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
    // InternalDataflowDSL.g:7171:1: rule__FeatureCallExpression__Group_1_3__1 : rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2 ;
    public final void rule__FeatureCallExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7175:1: ( rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2 )
            // InternalDataflowDSL.g:7176:2: rule__FeatureCallExpression__Group_1_3__1__Impl rule__FeatureCallExpression__Group_1_3__2
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
    // InternalDataflowDSL.g:7183:1: rule__FeatureCallExpression__Group_1_3__1__Impl : ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? ) ;
    public final void rule__FeatureCallExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7187:1: ( ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? ) )
            // InternalDataflowDSL.g:7188:1: ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? )
            {
            // InternalDataflowDSL.g:7188:1: ( ( rule__FeatureCallExpression__Group_1_3_1__0 )? )
            // InternalDataflowDSL.g:7189:2: ( rule__FeatureCallExpression__Group_1_3_1__0 )?
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1()); 
            // InternalDataflowDSL.g:7190:2: ( rule__FeatureCallExpression__Group_1_3_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_INT && LA52_0<=RULE_STRING)||(LA52_0>=13 && LA52_0<=14)||LA52_0==26||LA52_0==30||(LA52_0>=70 && LA52_0<=71)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDataflowDSL.g:7190:3: rule__FeatureCallExpression__Group_1_3_1__0
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
    // InternalDataflowDSL.g:7198:1: rule__FeatureCallExpression__Group_1_3__2 : rule__FeatureCallExpression__Group_1_3__2__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7202:1: ( rule__FeatureCallExpression__Group_1_3__2__Impl )
            // InternalDataflowDSL.g:7203:2: rule__FeatureCallExpression__Group_1_3__2__Impl
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
    // InternalDataflowDSL.g:7209:1: rule__FeatureCallExpression__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__FeatureCallExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7213:1: ( ( ')' ) )
            // InternalDataflowDSL.g:7214:1: ( ')' )
            {
            // InternalDataflowDSL.g:7214:1: ( ')' )
            // InternalDataflowDSL.g:7215:2: ')'
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
    // InternalDataflowDSL.g:7225:1: rule__FeatureCallExpression__Group_1_3_1__0 : rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1 ;
    public final void rule__FeatureCallExpression__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7229:1: ( rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1 )
            // InternalDataflowDSL.g:7230:2: rule__FeatureCallExpression__Group_1_3_1__0__Impl rule__FeatureCallExpression__Group_1_3_1__1
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
    // InternalDataflowDSL.g:7237:1: rule__FeatureCallExpression__Group_1_3_1__0__Impl : ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7241:1: ( ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) ) )
            // InternalDataflowDSL.g:7242:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) )
            {
            // InternalDataflowDSL.g:7242:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 ) )
            // InternalDataflowDSL.g:7243:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_0()); 
            // InternalDataflowDSL.g:7244:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 )
            // InternalDataflowDSL.g:7244:3: rule__FeatureCallExpression__ParametersAssignment_1_3_1_0
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
    // InternalDataflowDSL.g:7252:1: rule__FeatureCallExpression__Group_1_3_1__1 : rule__FeatureCallExpression__Group_1_3_1__1__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7256:1: ( rule__FeatureCallExpression__Group_1_3_1__1__Impl )
            // InternalDataflowDSL.g:7257:2: rule__FeatureCallExpression__Group_1_3_1__1__Impl
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
    // InternalDataflowDSL.g:7263:1: rule__FeatureCallExpression__Group_1_3_1__1__Impl : ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7267:1: ( ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* ) )
            // InternalDataflowDSL.g:7268:1: ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* )
            {
            // InternalDataflowDSL.g:7268:1: ( ( rule__FeatureCallExpression__Group_1_3_1_1__0 )* )
            // InternalDataflowDSL.g:7269:2: ( rule__FeatureCallExpression__Group_1_3_1_1__0 )*
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getGroup_1_3_1_1()); 
            // InternalDataflowDSL.g:7270:2: ( rule__FeatureCallExpression__Group_1_3_1_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==73) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalDataflowDSL.g:7270:3: rule__FeatureCallExpression__Group_1_3_1_1__0
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
    // InternalDataflowDSL.g:7279:1: rule__FeatureCallExpression__Group_1_3_1_1__0 : rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1 ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7283:1: ( rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1 )
            // InternalDataflowDSL.g:7284:2: rule__FeatureCallExpression__Group_1_3_1_1__0__Impl rule__FeatureCallExpression__Group_1_3_1_1__1
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
    // InternalDataflowDSL.g:7291:1: rule__FeatureCallExpression__Group_1_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7295:1: ( ( ',' ) )
            // InternalDataflowDSL.g:7296:1: ( ',' )
            {
            // InternalDataflowDSL.g:7296:1: ( ',' )
            // InternalDataflowDSL.g:7297:2: ','
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
    // InternalDataflowDSL.g:7306:1: rule__FeatureCallExpression__Group_1_3_1_1__1 : rule__FeatureCallExpression__Group_1_3_1_1__1__Impl ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7310:1: ( rule__FeatureCallExpression__Group_1_3_1_1__1__Impl )
            // InternalDataflowDSL.g:7311:2: rule__FeatureCallExpression__Group_1_3_1_1__1__Impl
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
    // InternalDataflowDSL.g:7317:1: rule__FeatureCallExpression__Group_1_3_1_1__1__Impl : ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) ) ;
    public final void rule__FeatureCallExpression__Group_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7321:1: ( ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) ) )
            // InternalDataflowDSL.g:7322:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) )
            {
            // InternalDataflowDSL.g:7322:1: ( ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 ) )
            // InternalDataflowDSL.g:7323:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 )
            {
             before(grammarAccess.getFeatureCallExpressionAccess().getParametersAssignment_1_3_1_1_1()); 
            // InternalDataflowDSL.g:7324:2: ( rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 )
            // InternalDataflowDSL.g:7324:3: rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1
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
    // InternalDataflowDSL.g:7333:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7337:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalDataflowDSL.g:7338:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
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
    // InternalDataflowDSL.g:7345:1: rule__PrimaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7349:1: ( ( () ) )
            // InternalDataflowDSL.g:7350:1: ( () )
            {
            // InternalDataflowDSL.g:7350:1: ( () )
            // InternalDataflowDSL.g:7351:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIntegerLiteralAction_0_0()); 
            // InternalDataflowDSL.g:7352:2: ()
            // InternalDataflowDSL.g:7352:3: 
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
    // InternalDataflowDSL.g:7360:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7364:1: ( rule__PrimaryExpression__Group_0__1__Impl )
            // InternalDataflowDSL.g:7365:2: rule__PrimaryExpression__Group_0__1__Impl
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
    // InternalDataflowDSL.g:7371:1: rule__PrimaryExpression__Group_0__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7375:1: ( ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) )
            // InternalDataflowDSL.g:7376:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            {
            // InternalDataflowDSL.g:7376:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            // InternalDataflowDSL.g:7377:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 
            // InternalDataflowDSL.g:7378:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            // InternalDataflowDSL.g:7378:3: rule__PrimaryExpression__ValueAssignment_0_1
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
    // InternalDataflowDSL.g:7387:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7391:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalDataflowDSL.g:7392:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
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
    // InternalDataflowDSL.g:7399:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7403:1: ( ( () ) )
            // InternalDataflowDSL.g:7404:1: ( () )
            {
            // InternalDataflowDSL.g:7404:1: ( () )
            // InternalDataflowDSL.g:7405:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getBooleanLiteralAction_1_0()); 
            // InternalDataflowDSL.g:7406:2: ()
            // InternalDataflowDSL.g:7406:3: 
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
    // InternalDataflowDSL.g:7414:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7418:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalDataflowDSL.g:7419:2: rule__PrimaryExpression__Group_1__1__Impl
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
    // InternalDataflowDSL.g:7425:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7429:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalDataflowDSL.g:7430:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalDataflowDSL.g:7430:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalDataflowDSL.g:7431:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalDataflowDSL.g:7432:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalDataflowDSL.g:7432:3: rule__PrimaryExpression__ValueAssignment_1_1
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
    // InternalDataflowDSL.g:7441:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7445:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalDataflowDSL.g:7446:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
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
    // InternalDataflowDSL.g:7453:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7457:1: ( ( () ) )
            // InternalDataflowDSL.g:7458:1: ( () )
            {
            // InternalDataflowDSL.g:7458:1: ( () )
            // InternalDataflowDSL.g:7459:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0()); 
            // InternalDataflowDSL.g:7460:2: ()
            // InternalDataflowDSL.g:7460:3: 
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
    // InternalDataflowDSL.g:7468:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7472:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalDataflowDSL.g:7473:2: rule__PrimaryExpression__Group_2__1__Impl
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
    // InternalDataflowDSL.g:7479:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7483:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // InternalDataflowDSL.g:7484:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // InternalDataflowDSL.g:7484:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // InternalDataflowDSL.g:7485:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // InternalDataflowDSL.g:7486:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // InternalDataflowDSL.g:7486:3: rule__PrimaryExpression__ValueAssignment_2_1
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
    // InternalDataflowDSL.g:7495:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7499:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalDataflowDSL.g:7500:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
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
    // InternalDataflowDSL.g:7507:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7511:1: ( ( () ) )
            // InternalDataflowDSL.g:7512:1: ( () )
            {
            // InternalDataflowDSL.g:7512:1: ( () )
            // InternalDataflowDSL.g:7513:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_3_0()); 
            // InternalDataflowDSL.g:7514:2: ()
            // InternalDataflowDSL.g:7514:3: 
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
    // InternalDataflowDSL.g:7522:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7526:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // InternalDataflowDSL.g:7527:2: rule__PrimaryExpression__Group_3__1__Impl
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
    // InternalDataflowDSL.g:7533:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7537:1: ( ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) )
            // InternalDataflowDSL.g:7538:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            {
            // InternalDataflowDSL.g:7538:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            // InternalDataflowDSL.g:7539:2: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_3_1()); 
            // InternalDataflowDSL.g:7540:2: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            // InternalDataflowDSL.g:7540:3: rule__PrimaryExpression__ValueAssignment_3_1
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
    // InternalDataflowDSL.g:7549:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7553:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalDataflowDSL.g:7554:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
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
    // InternalDataflowDSL.g:7561:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7565:1: ( ( () ) )
            // InternalDataflowDSL.g:7566:1: ( () )
            {
            // InternalDataflowDSL.g:7566:1: ( () )
            // InternalDataflowDSL.g:7567:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldReferenceAction_4_0()); 
            // InternalDataflowDSL.g:7568:2: ()
            // InternalDataflowDSL.g:7568:3: 
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
    // InternalDataflowDSL.g:7576:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7580:1: ( rule__PrimaryExpression__Group_4__1__Impl )
            // InternalDataflowDSL.g:7581:2: rule__PrimaryExpression__Group_4__1__Impl
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
    // InternalDataflowDSL.g:7587:1: rule__PrimaryExpression__Group_4__1__Impl : ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7591:1: ( ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) ) )
            // InternalDataflowDSL.g:7592:1: ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) )
            {
            // InternalDataflowDSL.g:7592:1: ( ( rule__PrimaryExpression__FieldAssignment_4_1 ) )
            // InternalDataflowDSL.g:7593:2: ( rule__PrimaryExpression__FieldAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFieldAssignment_4_1()); 
            // InternalDataflowDSL.g:7594:2: ( rule__PrimaryExpression__FieldAssignment_4_1 )
            // InternalDataflowDSL.g:7594:3: rule__PrimaryExpression__FieldAssignment_4_1
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
    // InternalDataflowDSL.g:7603:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7607:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // InternalDataflowDSL.g:7608:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
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
    // InternalDataflowDSL.g:7615:1: rule__PrimaryExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7619:1: ( ( '(' ) )
            // InternalDataflowDSL.g:7620:1: ( '(' )
            {
            // InternalDataflowDSL.g:7620:1: ( '(' )
            // InternalDataflowDSL.g:7621:2: '('
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
    // InternalDataflowDSL.g:7630:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7634:1: ( rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2 )
            // InternalDataflowDSL.g:7635:2: rule__PrimaryExpression__Group_5__1__Impl rule__PrimaryExpression__Group_5__2
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
    // InternalDataflowDSL.g:7642:1: rule__PrimaryExpression__Group_5__1__Impl : ( ruleOrExpression ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7646:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:7647:1: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:7647:1: ( ruleOrExpression )
            // InternalDataflowDSL.g:7648:2: ruleOrExpression
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
    // InternalDataflowDSL.g:7657:1: rule__PrimaryExpression__Group_5__2 : rule__PrimaryExpression__Group_5__2__Impl ;
    public final void rule__PrimaryExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7661:1: ( rule__PrimaryExpression__Group_5__2__Impl )
            // InternalDataflowDSL.g:7662:2: rule__PrimaryExpression__Group_5__2__Impl
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
    // InternalDataflowDSL.g:7668:1: rule__PrimaryExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7672:1: ( ( ')' ) )
            // InternalDataflowDSL.g:7673:1: ( ')' )
            {
            // InternalDataflowDSL.g:7673:1: ( ')' )
            // InternalDataflowDSL.g:7674:2: ')'
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
    // InternalDataflowDSL.g:7684:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7688:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDataflowDSL.g:7689:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalDataflowDSL.g:7696:1: rule__EDouble__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7700:1: ( ( ( RULE_INT )? ) )
            // InternalDataflowDSL.g:7701:1: ( ( RULE_INT )? )
            {
            // InternalDataflowDSL.g:7701:1: ( ( RULE_INT )? )
            // InternalDataflowDSL.g:7702:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0()); 
            // InternalDataflowDSL.g:7703:2: ( RULE_INT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDataflowDSL.g:7703:3: RULE_INT
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
    // InternalDataflowDSL.g:7711:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7715:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDataflowDSL.g:7716:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalDataflowDSL.g:7723:1: rule__EDouble__Group__1__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7727:1: ( ( '.' ) )
            // InternalDataflowDSL.g:7728:1: ( '.' )
            {
            // InternalDataflowDSL.g:7728:1: ( '.' )
            // InternalDataflowDSL.g:7729:2: '.'
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
    // InternalDataflowDSL.g:7738:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7742:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDataflowDSL.g:7743:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
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
    // InternalDataflowDSL.g:7750:1: rule__EDouble__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7754:1: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:7755:1: ( RULE_INT )
            {
            // InternalDataflowDSL.g:7755:1: ( RULE_INT )
            // InternalDataflowDSL.g:7756:2: RULE_INT
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
    // InternalDataflowDSL.g:7765:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7769:1: ( rule__EDouble__Group__3__Impl )
            // InternalDataflowDSL.g:7770:2: rule__EDouble__Group__3__Impl
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
    // InternalDataflowDSL.g:7776:1: rule__EDouble__Group__3__Impl : ( ( rule__EDouble__Group_3__0 )? ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7780:1: ( ( ( rule__EDouble__Group_3__0 )? ) )
            // InternalDataflowDSL.g:7781:1: ( ( rule__EDouble__Group_3__0 )? )
            {
            // InternalDataflowDSL.g:7781:1: ( ( rule__EDouble__Group_3__0 )? )
            // InternalDataflowDSL.g:7782:2: ( rule__EDouble__Group_3__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_3()); 
            // InternalDataflowDSL.g:7783:2: ( rule__EDouble__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=15 && LA55_0<=16)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDataflowDSL.g:7783:3: rule__EDouble__Group_3__0
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
    // InternalDataflowDSL.g:7792:1: rule__EDouble__Group_3__0 : rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 ;
    public final void rule__EDouble__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7796:1: ( rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1 )
            // InternalDataflowDSL.g:7797:2: rule__EDouble__Group_3__0__Impl rule__EDouble__Group_3__1
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
    // InternalDataflowDSL.g:7804:1: rule__EDouble__Group_3__0__Impl : ( ( rule__EDouble__Alternatives_3_0 ) ) ;
    public final void rule__EDouble__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7808:1: ( ( ( rule__EDouble__Alternatives_3_0 ) ) )
            // InternalDataflowDSL.g:7809:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            {
            // InternalDataflowDSL.g:7809:1: ( ( rule__EDouble__Alternatives_3_0 ) )
            // InternalDataflowDSL.g:7810:2: ( rule__EDouble__Alternatives_3_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_3_0()); 
            // InternalDataflowDSL.g:7811:2: ( rule__EDouble__Alternatives_3_0 )
            // InternalDataflowDSL.g:7811:3: rule__EDouble__Alternatives_3_0
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
    // InternalDataflowDSL.g:7819:1: rule__EDouble__Group_3__1 : rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 ;
    public final void rule__EDouble__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7823:1: ( rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2 )
            // InternalDataflowDSL.g:7824:2: rule__EDouble__Group_3__1__Impl rule__EDouble__Group_3__2
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
    // InternalDataflowDSL.g:7831:1: rule__EDouble__Group_3__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7835:1: ( ( ( '-' )? ) )
            // InternalDataflowDSL.g:7836:1: ( ( '-' )? )
            {
            // InternalDataflowDSL.g:7836:1: ( ( '-' )? )
            // InternalDataflowDSL.g:7837:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_3_1()); 
            // InternalDataflowDSL.g:7838:2: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==26) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDataflowDSL.g:7838:3: '-'
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
    // InternalDataflowDSL.g:7846:1: rule__EDouble__Group_3__2 : rule__EDouble__Group_3__2__Impl ;
    public final void rule__EDouble__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7850:1: ( rule__EDouble__Group_3__2__Impl )
            // InternalDataflowDSL.g:7851:2: rule__EDouble__Group_3__2__Impl
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
    // InternalDataflowDSL.g:7857:1: rule__EDouble__Group_3__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7861:1: ( ( RULE_INT ) )
            // InternalDataflowDSL.g:7862:1: ( RULE_INT )
            {
            // InternalDataflowDSL.g:7862:1: ( RULE_INT )
            // InternalDataflowDSL.g:7863:2: RULE_INT
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
    // InternalDataflowDSL.g:7873:1: rule__Model__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7877:1: ( ( ruleElement ) )
            // InternalDataflowDSL.g:7878:2: ( ruleElement )
            {
            // InternalDataflowDSL.g:7878:2: ( ruleElement )
            // InternalDataflowDSL.g:7879:3: ruleElement
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
    // InternalDataflowDSL.g:7888:1: rule__AllInstances__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7892:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7893:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7893:2: ( RULE_ID )
            // InternalDataflowDSL.g:7894:3: RULE_ID
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
    // InternalDataflowDSL.g:7903:1: rule__AllInstances__FieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__AllInstances__FieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7907:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7908:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7908:2: ( RULE_ID )
            // InternalDataflowDSL.g:7909:3: RULE_ID
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
    // InternalDataflowDSL.g:7918:1: rule__AllInstances__ModelAssignment_3_1_1_0 : ( RULE_ID ) ;
    public final void rule__AllInstances__ModelAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7922:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7923:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7923:2: ( RULE_ID )
            // InternalDataflowDSL.g:7924:3: RULE_ID
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
    // InternalDataflowDSL.g:7933:1: rule__AllInstances__PackageNameAssignment_3_1_2_0 : ( RULE_ID ) ;
    public final void rule__AllInstances__PackageNameAssignment_3_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7937:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7938:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7938:2: ( RULE_ID )
            // InternalDataflowDSL.g:7939:3: RULE_ID
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
    // InternalDataflowDSL.g:7948:1: rule__AllInstances__TypeNameAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__AllInstances__TypeNameAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7952:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7953:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7953:2: ( RULE_ID )
            // InternalDataflowDSL.g:7954:3: RULE_ID
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
    // InternalDataflowDSL.g:7963:1: rule__AllInstances__TargetAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllInstances__TargetAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7967:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:7968:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:7968:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7969:3: ( RULE_ID )
            {
             before(grammarAccess.getAllInstancesAccess().getTargetElementCrossReference_3_2_1_0()); 
            // InternalDataflowDSL.g:7970:3: ( RULE_ID )
            // InternalDataflowDSL.g:7971:4: RULE_ID
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
    // InternalDataflowDSL.g:7982:1: rule__NewInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:7986:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:7987:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:7987:2: ( RULE_ID )
            // InternalDataflowDSL.g:7988:3: RULE_ID
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
    // InternalDataflowDSL.g:7997:1: rule__NewInstance__InstanceFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__NewInstance__InstanceFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8001:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8002:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8002:2: ( RULE_ID )
            // InternalDataflowDSL.g:8003:3: RULE_ID
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
    // InternalDataflowDSL.g:8012:1: rule__NewInstance__KeyAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__NewInstance__KeyAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8016:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8017:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8017:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8018:3: ruleConditionalExpression
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
    // InternalDataflowDSL.g:8027:1: rule__NewInstance__ModelAssignment_3_2_1_0 : ( RULE_ID ) ;
    public final void rule__NewInstance__ModelAssignment_3_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8031:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8032:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8032:2: ( RULE_ID )
            // InternalDataflowDSL.g:8033:3: RULE_ID
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
    // InternalDataflowDSL.g:8042:1: rule__NewInstance__PackageNameAssignment_3_2_2_0 : ( RULE_ID ) ;
    public final void rule__NewInstance__PackageNameAssignment_3_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8046:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8047:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8047:2: ( RULE_ID )
            // InternalDataflowDSL.g:8048:3: RULE_ID
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
    // InternalDataflowDSL.g:8057:1: rule__NewInstance__TypeNameAssignment_3_2_3 : ( RULE_ID ) ;
    public final void rule__NewInstance__TypeNameAssignment_3_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8061:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8062:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8062:2: ( RULE_ID )
            // InternalDataflowDSL.g:8063:3: RULE_ID
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
    // InternalDataflowDSL.g:8072:1: rule__NewInstance__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewInstance__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8076:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8077:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8077:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8078:3: ( RULE_ID )
            {
             before(grammarAccess.getNewInstanceAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8079:3: ( RULE_ID )
            // InternalDataflowDSL.g:8080:4: RULE_ID
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
    // InternalDataflowDSL.g:8091:1: rule__Filter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Filter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8095:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8096:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8096:2: ( RULE_ID )
            // InternalDataflowDSL.g:8097:3: RULE_ID
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
    // InternalDataflowDSL.g:8106:1: rule__Filter__FilterByAssignment_3_0_1 : ( ruleConditionalExpression ) ;
    public final void rule__Filter__FilterByAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8110:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8111:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8111:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8112:3: ruleConditionalExpression
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
    // InternalDataflowDSL.g:8121:1: rule__Filter__TargetAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Filter__TargetAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8125:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8126:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8126:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8127:3: ( RULE_ID )
            {
             before(grammarAccess.getFilterAccess().getTargetElementCrossReference_3_1_1_0()); 
            // InternalDataflowDSL.g:8128:3: ( RULE_ID )
            // InternalDataflowDSL.g:8129:4: RULE_ID
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
    // InternalDataflowDSL.g:8140:1: rule__Filter__RejectTargetAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Filter__RejectTargetAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8144:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8145:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8145:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8146:3: ( RULE_ID )
            {
             before(grammarAccess.getFilterAccess().getRejectTargetElementCrossReference_3_2_1_0()); 
            // InternalDataflowDSL.g:8147:3: ( RULE_ID )
            // InternalDataflowDSL.g:8148:4: RULE_ID
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
    // InternalDataflowDSL.g:8159:1: rule__Copy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Copy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8163:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8164:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8164:2: ( RULE_ID )
            // InternalDataflowDSL.g:8165:3: RULE_ID
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
    // InternalDataflowDSL.g:8174:1: rule__Copy__TargetAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Copy__TargetAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8178:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8179:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8179:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8180:3: ( RULE_ID )
            {
             before(grammarAccess.getCopyAccess().getTargetElementCrossReference_3_0_1_0()); 
            // InternalDataflowDSL.g:8181:3: ( RULE_ID )
            // InternalDataflowDSL.g:8182:4: RULE_ID
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
    // InternalDataflowDSL.g:8193:1: rule__Copy__CopyTargetAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Copy__CopyTargetAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8197:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8198:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8198:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8199:3: ( RULE_ID )
            {
             before(grammarAccess.getCopyAccess().getCopyTargetElementCrossReference_3_1_1_0()); 
            // InternalDataflowDSL.g:8200:3: ( RULE_ID )
            // InternalDataflowDSL.g:8201:4: RULE_ID
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
    // InternalDataflowDSL.g:8212:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8216:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8217:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8217:2: ( RULE_ID )
            // InternalDataflowDSL.g:8218:3: RULE_ID
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
    // InternalDataflowDSL.g:8227:1: rule__Sort__SortByAssignment_3_0_1 : ( ruleConditionalExpression ) ;
    public final void rule__Sort__SortByAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8231:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8232:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8232:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8233:3: ruleConditionalExpression
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
    // InternalDataflowDSL.g:8242:1: rule__Sort__TargetAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Sort__TargetAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8246:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8247:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8247:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8248:3: ( RULE_ID )
            {
             before(grammarAccess.getSortAccess().getTargetElementCrossReference_3_1_1_0()); 
            // InternalDataflowDSL.g:8249:3: ( RULE_ID )
            // InternalDataflowDSL.g:8250:4: RULE_ID
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
    // InternalDataflowDSL.g:8261:1: rule__Product__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Product__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8265:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8266:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8266:2: ( RULE_ID )
            // InternalDataflowDSL.g:8267:3: RULE_ID
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
    // InternalDataflowDSL.g:8276:1: rule__Product__TargetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Product__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8280:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8281:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8281:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8282:3: ( RULE_ID )
            {
             before(grammarAccess.getProductAccess().getTargetElementCrossReference_3_1_0()); 
            // InternalDataflowDSL.g:8283:3: ( RULE_ID )
            // InternalDataflowDSL.g:8284:4: RULE_ID
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
    // InternalDataflowDSL.g:8295:1: rule__GetFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8299:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8300:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8300:2: ( RULE_ID )
            // InternalDataflowDSL.g:8301:3: RULE_ID
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
    // InternalDataflowDSL.g:8310:1: rule__GetFeature__ObjectFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__ObjectFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8314:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8315:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8315:2: ( RULE_ID )
            // InternalDataflowDSL.g:8316:3: RULE_ID
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
    // InternalDataflowDSL.g:8325:1: rule__GetFeature__ValueFieldAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__ValueFieldAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8329:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8330:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8330:2: ( RULE_ID )
            // InternalDataflowDSL.g:8331:3: RULE_ID
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
    // InternalDataflowDSL.g:8340:1: rule__GetFeature__FeatureAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__GetFeature__FeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8344:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8345:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8345:2: ( RULE_ID )
            // InternalDataflowDSL.g:8346:3: RULE_ID
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
    // InternalDataflowDSL.g:8355:1: rule__GetFeature__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetFeature__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8359:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8360:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8360:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8361:3: ( RULE_ID )
            {
             before(grammarAccess.getGetFeatureAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8362:3: ( RULE_ID )
            // InternalDataflowDSL.g:8363:4: RULE_ID
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
    // InternalDataflowDSL.g:8374:1: rule__SetFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8378:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8379:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8379:2: ( RULE_ID )
            // InternalDataflowDSL.g:8380:3: RULE_ID
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
    // InternalDataflowDSL.g:8389:1: rule__SetFeature__ObjectFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__ObjectFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8393:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8394:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8394:2: ( RULE_ID )
            // InternalDataflowDSL.g:8395:3: RULE_ID
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
    // InternalDataflowDSL.g:8404:1: rule__SetFeature__ValueAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__SetFeature__ValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8408:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8409:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8409:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8410:3: ruleConditionalExpression
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
    // InternalDataflowDSL.g:8419:1: rule__SetFeature__FeatureAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__SetFeature__FeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8423:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8424:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8424:2: ( RULE_ID )
            // InternalDataflowDSL.g:8425:3: RULE_ID
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
    // InternalDataflowDSL.g:8434:1: rule__SetFeature__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetFeature__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8438:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8439:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8439:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8440:3: ( RULE_ID )
            {
             before(grammarAccess.getSetFeatureAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8441:3: ( RULE_ID )
            // InternalDataflowDSL.g:8442:4: RULE_ID
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
    // InternalDataflowDSL.g:8453:1: rule__NewContainer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8457:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8458:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8458:2: ( RULE_ID )
            // InternalDataflowDSL.g:8459:3: RULE_ID
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
    // InternalDataflowDSL.g:8468:1: rule__NewContainer__ListFieldAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__NewContainer__ListFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8472:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8473:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8473:2: ( RULE_ID )
            // InternalDataflowDSL.g:8474:3: RULE_ID
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
    // InternalDataflowDSL.g:8483:1: rule__NewContainer__ContainerTypeAssignment_4_1 : ( ruleContainerType ) ;
    public final void rule__NewContainer__ContainerTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8487:1: ( ( ruleContainerType ) )
            // InternalDataflowDSL.g:8488:2: ( ruleContainerType )
            {
            // InternalDataflowDSL.g:8488:2: ( ruleContainerType )
            // InternalDataflowDSL.g:8489:3: ruleContainerType
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
    // InternalDataflowDSL.g:8498:1: rule__NewContainer__TargetAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__NewContainer__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8502:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8503:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8503:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8504:3: ( RULE_ID )
            {
             before(grammarAccess.getNewContainerAccess().getTargetElementCrossReference_5_1_0()); 
            // InternalDataflowDSL.g:8505:3: ( RULE_ID )
            // InternalDataflowDSL.g:8506:4: RULE_ID
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
    // InternalDataflowDSL.g:8517:1: rule__AddToContainer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8521:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8522:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8522:2: ( RULE_ID )
            // InternalDataflowDSL.g:8523:3: RULE_ID
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
    // InternalDataflowDSL.g:8532:1: rule__AddToContainer__ListFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__AddToContainer__ListFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8536:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8537:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8537:2: ( RULE_ID )
            // InternalDataflowDSL.g:8538:3: RULE_ID
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
    // InternalDataflowDSL.g:8547:1: rule__AddToContainer__ValueAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__AddToContainer__ValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8551:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8552:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8552:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8553:3: ruleConditionalExpression
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
    // InternalDataflowDSL.g:8562:1: rule__AddToContainer__PositionAssignment_3_2_1 : ( ruleConditionalExpression ) ;
    public final void rule__AddToContainer__PositionAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8566:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8567:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8567:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8568:3: ruleConditionalExpression
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
    // InternalDataflowDSL.g:8577:1: rule__AddToContainer__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AddToContainer__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8581:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8582:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8582:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8583:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToContainerAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8584:3: ( RULE_ID )
            // InternalDataflowDSL.g:8585:4: RULE_ID
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
    // InternalDataflowDSL.g:8596:1: rule__ForEach__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForEach__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8600:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8601:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8601:2: ( RULE_ID )
            // InternalDataflowDSL.g:8602:3: RULE_ID
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
    // InternalDataflowDSL.g:8611:1: rule__ForEach__ListFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__ForEach__ListFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8615:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8616:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8616:2: ( RULE_ID )
            // InternalDataflowDSL.g:8617:3: RULE_ID
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
    // InternalDataflowDSL.g:8626:1: rule__ForEach__ItemFieldAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__ForEach__ItemFieldAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8630:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8631:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8631:2: ( RULE_ID )
            // InternalDataflowDSL.g:8632:3: RULE_ID
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
    // InternalDataflowDSL.g:8641:1: rule__ForEach__PositionFieldAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__ForEach__PositionFieldAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8645:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8646:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8646:2: ( RULE_ID )
            // InternalDataflowDSL.g:8647:3: RULE_ID
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
    // InternalDataflowDSL.g:8656:1: rule__ForEach__TargetAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForEach__TargetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8660:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8661:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8661:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8662:3: ( RULE_ID )
            {
             before(grammarAccess.getForEachAccess().getTargetElementCrossReference_3_3_1_0()); 
            // InternalDataflowDSL.g:8663:3: ( RULE_ID )
            // InternalDataflowDSL.g:8664:4: RULE_ID
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
    // InternalDataflowDSL.g:8675:1: rule__CollectBy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CollectBy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8679:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8680:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8680:2: ( RULE_ID )
            // InternalDataflowDSL.g:8681:3: RULE_ID
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


    // $ANTLR start "rule__CollectBy__ElementFieldAssignment_3_0_1"
    // InternalDataflowDSL.g:8690:1: rule__CollectBy__ElementFieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__CollectBy__ElementFieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8694:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8695:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8695:2: ( RULE_ID )
            // InternalDataflowDSL.g:8696:3: RULE_ID
            {
             before(grammarAccess.getCollectByAccess().getElementFieldIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getElementFieldIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__ElementFieldAssignment_3_0_1"


    // $ANTLR start "rule__CollectBy__CollectByAssignment_3_1_1"
    // InternalDataflowDSL.g:8705:1: rule__CollectBy__CollectByAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__CollectBy__CollectByAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8709:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8710:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8710:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8711:3: ruleConditionalExpression
            {
             before(grammarAccess.getCollectByAccess().getCollectByConditionalExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getCollectByAccess().getCollectByConditionalExpressionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__CollectByAssignment_3_1_1"


    // $ANTLR start "rule__CollectBy__TargetAssignment_3_2_1"
    // InternalDataflowDSL.g:8720:1: rule__CollectBy__TargetAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CollectBy__TargetAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8724:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8725:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8725:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8726:3: ( RULE_ID )
            {
             before(grammarAccess.getCollectByAccess().getTargetElementCrossReference_3_2_1_0()); 
            // InternalDataflowDSL.g:8727:3: ( RULE_ID )
            // InternalDataflowDSL.g:8728:4: RULE_ID
            {
             before(grammarAccess.getCollectByAccess().getTargetElementIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollectByAccess().getTargetElementIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getCollectByAccess().getTargetElementCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectBy__TargetAssignment_3_2_1"


    // $ANTLR start "rule__Evaluate__NameAssignment_1"
    // InternalDataflowDSL.g:8739:1: rule__Evaluate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Evaluate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8743:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8744:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8744:2: ( RULE_ID )
            // InternalDataflowDSL.g:8745:3: RULE_ID
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
    // InternalDataflowDSL.g:8754:1: rule__Evaluate__FieldAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__Evaluate__FieldAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8758:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8759:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:8759:2: ( RULE_ID )
            // InternalDataflowDSL.g:8760:3: RULE_ID
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
    // InternalDataflowDSL.g:8769:1: rule__Evaluate__ExpressionAssignment_3_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__Evaluate__ExpressionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8773:1: ( ( ruleConditionalExpression ) )
            // InternalDataflowDSL.g:8774:2: ( ruleConditionalExpression )
            {
            // InternalDataflowDSL.g:8774:2: ( ruleConditionalExpression )
            // InternalDataflowDSL.g:8775:3: ruleConditionalExpression
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
    // InternalDataflowDSL.g:8784:1: rule__Evaluate__TargetAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Evaluate__TargetAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8788:1: ( ( ( RULE_ID ) ) )
            // InternalDataflowDSL.g:8789:2: ( ( RULE_ID ) )
            {
            // InternalDataflowDSL.g:8789:2: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:8790:3: ( RULE_ID )
            {
             before(grammarAccess.getEvaluateAccess().getTargetElementCrossReference_3_2_1_0()); 
            // InternalDataflowDSL.g:8791:3: ( RULE_ID )
            // InternalDataflowDSL.g:8792:4: RULE_ID
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
    // InternalDataflowDSL.g:8803:1: rule__ConditionalExpression__ThenExpressionAssignment_0_4 : ( ruleOrExpression ) ;
    public final void rule__ConditionalExpression__ThenExpressionAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8807:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8808:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8808:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8809:3: ruleOrExpression
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
    // InternalDataflowDSL.g:8818:1: rule__ConditionalExpression__ElseExpressionAssignment_0_6 : ( ruleOrExpression ) ;
    public final void rule__ConditionalExpression__ElseExpressionAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8822:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:8823:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:8823:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:8824:3: ruleOrExpression
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
    // InternalDataflowDSL.g:8833:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8837:1: ( ( ruleOrOperator ) )
            // InternalDataflowDSL.g:8838:2: ( ruleOrOperator )
            {
            // InternalDataflowDSL.g:8838:2: ( ruleOrOperator )
            // InternalDataflowDSL.g:8839:3: ruleOrOperator
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
    // InternalDataflowDSL.g:8848:1: rule__OrExpression__RightExpressionAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8852:1: ( ( ruleAndExpression ) )
            // InternalDataflowDSL.g:8853:2: ( ruleAndExpression )
            {
            // InternalDataflowDSL.g:8853:2: ( ruleAndExpression )
            // InternalDataflowDSL.g:8854:3: ruleAndExpression
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
    // InternalDataflowDSL.g:8863:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8867:1: ( ( ruleAndOperator ) )
            // InternalDataflowDSL.g:8868:2: ( ruleAndOperator )
            {
            // InternalDataflowDSL.g:8868:2: ( ruleAndOperator )
            // InternalDataflowDSL.g:8869:3: ruleAndOperator
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
    // InternalDataflowDSL.g:8878:1: rule__AndExpression__RightExpressionAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8882:1: ( ( ruleEqualityExpression ) )
            // InternalDataflowDSL.g:8883:2: ( ruleEqualityExpression )
            {
            // InternalDataflowDSL.g:8883:2: ( ruleEqualityExpression )
            // InternalDataflowDSL.g:8884:3: ruleEqualityExpression
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
    // InternalDataflowDSL.g:8893:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8897:1: ( ( ruleEqualityOperator ) )
            // InternalDataflowDSL.g:8898:2: ( ruleEqualityOperator )
            {
            // InternalDataflowDSL.g:8898:2: ( ruleEqualityOperator )
            // InternalDataflowDSL.g:8899:3: ruleEqualityOperator
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
    // InternalDataflowDSL.g:8908:1: rule__EqualityExpression__RightExpressionAssignment_1_2 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8912:1: ( ( ruleRelationalExpression ) )
            // InternalDataflowDSL.g:8913:2: ( ruleRelationalExpression )
            {
            // InternalDataflowDSL.g:8913:2: ( ruleRelationalExpression )
            // InternalDataflowDSL.g:8914:3: ruleRelationalExpression
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
    // InternalDataflowDSL.g:8923:1: rule__RelationalExpression__OperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__RelationalExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8927:1: ( ( ruleRelationalOperator ) )
            // InternalDataflowDSL.g:8928:2: ( ruleRelationalOperator )
            {
            // InternalDataflowDSL.g:8928:2: ( ruleRelationalOperator )
            // InternalDataflowDSL.g:8929:3: ruleRelationalOperator
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
    // InternalDataflowDSL.g:8938:1: rule__RelationalExpression__RightExpressionAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8942:1: ( ( ruleAdditiveExpression ) )
            // InternalDataflowDSL.g:8943:2: ( ruleAdditiveExpression )
            {
            // InternalDataflowDSL.g:8943:2: ( ruleAdditiveExpression )
            // InternalDataflowDSL.g:8944:3: ruleAdditiveExpression
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
    // InternalDataflowDSL.g:8953:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8957:1: ( ( ruleAdditiveOperator ) )
            // InternalDataflowDSL.g:8958:2: ( ruleAdditiveOperator )
            {
            // InternalDataflowDSL.g:8958:2: ( ruleAdditiveOperator )
            // InternalDataflowDSL.g:8959:3: ruleAdditiveOperator
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
    // InternalDataflowDSL.g:8968:1: rule__AdditiveExpression__RightExpressionAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8972:1: ( ( ruleMultiplicativeExpression ) )
            // InternalDataflowDSL.g:8973:2: ( ruleMultiplicativeExpression )
            {
            // InternalDataflowDSL.g:8973:2: ( ruleMultiplicativeExpression )
            // InternalDataflowDSL.g:8974:3: ruleMultiplicativeExpression
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
    // InternalDataflowDSL.g:8983:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:8987:1: ( ( ruleMultiplicativeOperator ) )
            // InternalDataflowDSL.g:8988:2: ( ruleMultiplicativeOperator )
            {
            // InternalDataflowDSL.g:8988:2: ( ruleMultiplicativeOperator )
            // InternalDataflowDSL.g:8989:3: ruleMultiplicativeOperator
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
    // InternalDataflowDSL.g:8998:1: rule__MultiplicativeExpression__RightExpressionAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9002:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:9003:2: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:9003:2: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:9004:3: ruleUnaryExpression
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
    // InternalDataflowDSL.g:9013:1: rule__UnaryExpression__OperatorAssignment_0_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9017:1: ( ( ruleUnaryOperator ) )
            // InternalDataflowDSL.g:9018:2: ( ruleUnaryOperator )
            {
            // InternalDataflowDSL.g:9018:2: ( ruleUnaryOperator )
            // InternalDataflowDSL.g:9019:3: ruleUnaryOperator
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
    // InternalDataflowDSL.g:9028:1: rule__UnaryExpression__ExpressionAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9032:1: ( ( ruleUnaryExpression ) )
            // InternalDataflowDSL.g:9033:2: ( ruleUnaryExpression )
            {
            // InternalDataflowDSL.g:9033:2: ( ruleUnaryExpression )
            // InternalDataflowDSL.g:9034:3: ruleUnaryExpression
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
    // InternalDataflowDSL.g:9043:1: rule__FeatureCallExpression__FeatureAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__FeatureCallExpression__FeatureAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9047:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:9048:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:9048:2: ( RULE_ID )
            // InternalDataflowDSL.g:9049:3: RULE_ID
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
    // InternalDataflowDSL.g:9058:1: rule__FeatureCallExpression__ParametersAssignment_1_3_1_0 : ( ruleOrExpression ) ;
    public final void rule__FeatureCallExpression__ParametersAssignment_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9062:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:9063:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:9063:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:9064:3: ruleOrExpression
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
    // InternalDataflowDSL.g:9073:1: rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1 : ( ruleOrExpression ) ;
    public final void rule__FeatureCallExpression__ParametersAssignment_1_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9077:1: ( ( ruleOrExpression ) )
            // InternalDataflowDSL.g:9078:2: ( ruleOrExpression )
            {
            // InternalDataflowDSL.g:9078:2: ( ruleOrExpression )
            // InternalDataflowDSL.g:9079:3: ruleOrExpression
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
    // InternalDataflowDSL.g:9088:1: rule__PrimaryExpression__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__PrimaryExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9092:1: ( ( ruleEInt ) )
            // InternalDataflowDSL.g:9093:2: ( ruleEInt )
            {
            // InternalDataflowDSL.g:9093:2: ( ruleEInt )
            // InternalDataflowDSL.g:9094:3: ruleEInt
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
    // InternalDataflowDSL.g:9103:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9107:1: ( ( ruleEBoolean ) )
            // InternalDataflowDSL.g:9108:2: ( ruleEBoolean )
            {
            // InternalDataflowDSL.g:9108:2: ( ruleEBoolean )
            // InternalDataflowDSL.g:9109:3: ruleEBoolean
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
    // InternalDataflowDSL.g:9118:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9122:1: ( ( ruleEDouble ) )
            // InternalDataflowDSL.g:9123:2: ( ruleEDouble )
            {
            // InternalDataflowDSL.g:9123:2: ( ruleEDouble )
            // InternalDataflowDSL.g:9124:3: ruleEDouble
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
    // InternalDataflowDSL.g:9133:1: rule__PrimaryExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9137:1: ( ( RULE_STRING ) )
            // InternalDataflowDSL.g:9138:2: ( RULE_STRING )
            {
            // InternalDataflowDSL.g:9138:2: ( RULE_STRING )
            // InternalDataflowDSL.g:9139:3: RULE_STRING
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
    // InternalDataflowDSL.g:9148:1: rule__PrimaryExpression__FieldAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__FieldAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflowDSL.g:9152:1: ( ( RULE_ID ) )
            // InternalDataflowDSL.g:9153:2: ( RULE_ID )
            {
            // InternalDataflowDSL.g:9153:2: ( RULE_ID )
            // InternalDataflowDSL.g:9154:3: RULE_ID
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
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004600000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004400000002L,0x0000000000000001L});
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