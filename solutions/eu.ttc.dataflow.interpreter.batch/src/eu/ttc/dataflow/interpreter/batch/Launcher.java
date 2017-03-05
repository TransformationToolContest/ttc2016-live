package eu.ttc.dataflow.interpreter.batch;

import java.io.File;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.operations.contributors.OperationContributor;
import org.eclipse.epsilon.eol.types.EolNoType;

import eu.ttc.dataflow.DataflowDSLStandaloneSetup;
import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.launchConfiguration.Configuration;
import eu.ttc.dataflow.model.launchConfiguration.LaunchConfigFactory;
import eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage;
import eu.ttc.dataflow.model.launchConfiguration.Metamodel;
import eu.ttc.dataflow.model.launchConfiguration.Model;

public class Launcher {

	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.err.println("Usage: java -jar batchInterpreter.jar your.launchconfig");
			System.exit(1);
		}
		final String sLaunchConfig = args[0];

		new Launcher().run(sLaunchConfig);
	}

	public void run(String sLaunchConfig) throws Exception {
		final long startMillis = System.currentTimeMillis();

		EPackage.Registry.INSTANCE.put(DataflowPackage.eNS_URI, DataflowPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(LaunchConfigPackage.eNS_URI, LaunchConfigPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		DataflowDSLStandaloneSetup.doSetup();

		final File fLaunchConfig = new File(sLaunchConfig).getAbsoluteFile();
		final ResourceSet rsLaunchConfig = new ResourceSetImpl();
		final Resource rLaunchConfig = rsLaunchConfig.createResource(URI.createFileURI(fLaunchConfig.getAbsolutePath()));
		rLaunchConfig.load(null);
		final Configuration launchConfig = (Configuration) rLaunchConfig.getContents().get(0);

		run(fLaunchConfig.getParentFile().toPath(), launchConfig);

		System.out.println("Total time in seconds: " + (System.currentTimeMillis() - startMillis)/1000.);
	}

	public void run(final Path basePath, final Configuration launchConfig) throws Exception {
		final long startEOLMillis = System.currentTimeMillis();
		final EolModule eolModule = loadEolModule();
		System.out.println("Loaded EOL interpreter: " + (System.currentTimeMillis() - startEOLMillis)/1000.);
		
		final long startDataflowLoadMillis = System.currentTimeMillis();
		final ResourceSet rsDataflow = new ResourceSetImpl();
		final URI dataflowURI = resolveURI(basePath, launchConfig.getDataflow().getLocation());
		final Resource rDataflow = rsDataflow.createResource(dataflowURI);
		rDataflow.load(null);

		final Model dataflowModelConfig = LaunchConfigFactory.eINSTANCE.createModel();
		dataflowModelConfig.setName("Dataflow");
		addModel(eolModule, rDataflow, dataflowModelConfig);
		System.out.println("Loaded dataflow model: " + (System.currentTimeMillis() - startDataflowLoadMillis)/1000.);

		// Note - relative paths are resolved from the folder of the .launchconfig file
		final long startModelLoadMillis = System.currentTimeMillis();
		ResourceSet rsMetamodels = new ResourceSetImpl();
		for (Model m : launchConfig.getModels()) {
			for (Metamodel mm : m.getMetamodels()) {
				final Resource rMetamodel = rsMetamodels.createResource(resolveURI(basePath, mm.getLocation()));
				rMetamodel.load(null);
				for (EObject root : rMetamodel.getContents()) {
					if (root instanceof EPackage) {
						final EPackage epkg = (EPackage)root;
						rsDataflow.getPackageRegistry().put(epkg.getNsURI(), epkg);
						System.out.println("Loaded metamodel " + epkg.getNsURI());
					}
				}
			}

			final Resource rModel = rsDataflow.createResource(resolveURI(basePath, m.getLocation()));
			if (m.isReadOnLoad()) {
				rModel.load(null);
			}
			addModel(eolModule, rModel, m);
		}
		System.out.println("Loaded input models: " + (System.currentTimeMillis() - startModelLoadMillis)/1000.);

		final long startEOLExecuteMillis = System.currentTimeMillis();
		eolModule.execute();
		eolModule.getContext().getModelRepository().dispose();
		eolModule.getContext().dispose();
		System.out.println("Transformation execution: " + (System.currentTimeMillis() - startEOLExecuteMillis)/1000.);
	}

	private void addModel(final EolModule module, final Resource emfResource, final Model modelConfiguration) {
		final InMemoryEmfModel emfModel = new InMemoryEmfModel(emfResource);
		emfModel.setName(modelConfiguration.getName());
		emfModel.setReadOnLoad(modelConfiguration.isReadOnLoad());
		emfModel.setStoredOnDisposal(modelConfiguration.isStoreOnDisposal());
		module.getContext().getModelRepository().addModel(emfModel);
	}

	private EolModule loadEolModule() throws Exception {
		EolModule module = new EolModule();
		module.getContext().getOperationContributorRegistry().add(new OperationContributor() {
			@Override
			public boolean contributesTo(Object target) {
				return EolNoType.NoInstance.equals(target);
			}

			@SuppressWarnings("unused")
			public long currentTimeMillis() {
				return System.currentTimeMillis();
			}
		});
		module.parse(getClass().getResource("eol/dataflow.eol").toURI());
		for (ParseProblem problem : module.getParseProblems()) {
			throw new EolRuntimeException("Parsing problem: " + problem);
		}
		return module;
	}

	private URI resolveURI(final Path basePath, final String location) {
		final Path resolvedPath = basePath.resolve(location);
		final URI uri = URI.createFileURI(resolvedPath.toFile().getAbsolutePath());
		return uri;
	}

}

