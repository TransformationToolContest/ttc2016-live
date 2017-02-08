package TTC_2016_run.files;

import java.io.File;
import java.net.URL;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

import eu.ttc.dataflow.DataflowDSLStandaloneSetup;
import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.launchConfiguration.Configuration;
import eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage;

/**
 * Entry point of the 'DataFlowInterpreter' transformation module.
 */
public class DataFlowInterpreter {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: java -jar batchInterpreter.jar your.launchconfig");
			System.exit(1);
		}
		
		final String sLaunchConfig = args[0];

		try {
			DataFlowInterpreter dt = new DataFlowInterpreter();
			dt.run(sLaunchConfig);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void run(String sLaunchConfig) throws Exception {

		registerNamespaces();
		
		// Read run config
		final File fLaunchConfig = new File(sLaunchConfig).getAbsoluteFile();
		final ResourceSet rsLaunchConfig = new ResourceSetImpl();
		final Resource rLaunchConfig = rsLaunchConfig.createResource(URI.createFileURI(fLaunchConfig.getAbsolutePath()));
		rLaunchConfig.load(null);
		final Configuration launchConfig = (Configuration) rLaunchConfig.getContents().get(0);
		
		java.nio.file.Path basePath = fLaunchConfig.getParentFile().toPath();
		
		// Extract data from run config
		String dataflowPath = launchConfig.getDataflow().getLocation();
		String dataflowMetamodel = DataflowPackage.eINSTANCE.eResource().getURI().toString();
		String inputModel = launchConfig.getModels().get(0).getLocation();
		String inputMetamodel = launchConfig.getModels().get(0).getMetamodels().get(0).getLocation();
		String outputModel = launchConfig.getModels().get(1).getLocation();
		String outputMetamodel = launchConfig.getModels().get(1).getMetamodels().get(0).getLocation();
		
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();

		// Load metamodels
		Metamodel emftvm = EmftvmFactory.eINSTANCE.createMetamodel();
		emftvm.setResource(rs.getResource(URI.createURI("http://www.eclipse.org/m2m/atl/2011/EMFTVM"), true));
		env.registerMetaModel("METAMODEL", emftvm);

		Metamodel IM = EmftvmFactory.eINSTANCE.createMetamodel();
		IM.setResource(rs.getResource(URI.createFileURI(basePath.toString() +"/"+ inputMetamodel), true));
		env.registerMetaModel("IM", IM);
		registerPackages(rs, rs.getResource(URI.createFileURI(basePath.toString() +"/"+ inputMetamodel), true));
		
		Metamodel Ecore = EmftvmFactory.eINSTANCE.createMetamodel();
		Ecore.setResource(rs.getResource(URI.createURI("http://www.eclipse.org/emf/2002/Ecore"), true));
		env.registerMetaModel("Ecore", Ecore);
		
		Metamodel DF = EmftvmFactory.eINSTANCE.createMetamodel();
		DF.setResource(rs.getResource(URI.createURI(dataflowMetamodel), true));
		env.registerMetaModel("DF", DF);
		
		Metamodel OM = EmftvmFactory.eINSTANCE.createMetamodel();
		OM.setResource(rs.getResource(URI.createFileURI(basePath.toString() +"/"+ outputMetamodel), true));
		env.registerMetaModel("OM", OM);

		// Load models
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createFileURI(basePath.toString() +"/"+ inputModel), true));
		env.registerInputModel("im", inModel);

		Model dfModel = EmftvmFactory.eINSTANCE.createModel();
		dfModel.setResource(rs.getResource(URI.createFileURI(basePath.toString() +"/"+ dataflowPath), true));
		env.registerInOutModel("df", dfModel);
		
		Model dfMetamodel = EmftvmFactory.eINSTANCE.createModel();
		dfMetamodel.setResource(rs.getResource(URI.createURI(dataflowMetamodel), true));
		env.registerInOutModel("dfMM", dfMetamodel);
		
		Model inMetamodel = EmftvmFactory.eINSTANCE.createModel();
		inMetamodel.setResource(rs.getResource(URI.createFileURI(basePath.toString() +"/"+ inputMetamodel), true));
		env.registerInOutModel("iMM", inMetamodel);
		
		Model outMetamodel = EmftvmFactory.eINSTANCE.createModel();
		outMetamodel.setResource(rs.getResource(URI.createFileURI(basePath.toString() +"/"+ outputMetamodel), true));
		env.registerInOutModel("oMM", outMetamodel);

		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createFileURI(basePath.toString() +"/"+ outputModel)));
		env.registerOutputModel("om", outModel);

		//TODO: Workaround: This only works as JAR, you need to do:
		//* Copy the line of plugin.properties in TTC_2016 into the plugin.properties in the generated jar
		//* Copy the folder trafo into the generated JAR
		URL url = this.getClass().getClassLoader().getResource("trafo");
		URI uri = (url==null)?URI.createFileURI("trafo"):URI.createURI(url.toURI().toString()); //Run as Eclipse/Jar
		String uriS = URIConverter.INSTANCE.normalize(uri).toString();
				
		// Load and run module
		ModuleResolver mr = new DefaultModuleResolver(uriS+"/", rs);
		TimingData td = new TimingData();
		env.loadModule(mr, "DataFlowInterpreter");
		td.finishLoading();
		env.run(td);
		td.finish();
		System.out.println(td.toString());

		// Save models
		outModel.getResource().save(Collections.emptyMap());
	}


	private void registerNamespaces() {
		EPackage.Registry.INSTANCE.put(DataflowPackage.eNS_URI, DataflowPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(LaunchConfigPackage.eNS_URI, LaunchConfigPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		DataflowDSLStandaloneSetup.doSetup();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
	}

	private void registerPackages(ResourceSet resourceSet, Resource resource) {
		EList<EObject> eObjects = resource.getContents();
		for(EObject eObject : eObjects){
			if (eObject instanceof EPackage) {
				EPackage p = (EPackage) eObject;
				resourceSet.getPackageRegistry().put(p.getNsURI(), p);
			}
		}
	}
}
