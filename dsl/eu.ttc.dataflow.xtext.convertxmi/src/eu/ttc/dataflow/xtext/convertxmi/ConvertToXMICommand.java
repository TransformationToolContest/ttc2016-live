package eu.ttc.dataflow.xtext.convertxmi;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class ConvertToXMICommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection selection0 = HandlerUtil.getCurrentSelection(event);
        if (selection0 instanceof IStructuredSelection) {
                final IStructuredSelection selection = (IStructuredSelection) selection0;
                final IFile dataflowModel = (IFile) selection.getFirstElement();
                final File src = dataflowModel.getLocation().toFile();
                final File dest = dataflowModel.getLocation().removeFileExtension().addFileExtension("xmi").toFile();

                try {
					convert(src, dest);
					dataflowModel.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (IOException | CoreException e) {
					throw new ExecutionException(e.getMessage(), e);
				}
        }

        return null;
	}

	private void convert(File src, File dest) throws IOException {
		final ResourceSet srcRS = new ResourceSetImpl();
		final Resource srcResource = srcRS.createResource(URI.createFileURI(src.getAbsolutePath()));
		srcResource.load(null);
		
		final XMIResourceImpl destModel = new XMIResourceImpl(URI.createFileURI(dest.getAbsolutePath()));
		final Collection<EObject> copy = EcoreUtil.copyAll(srcResource.getContents());
		destModel.getContents().addAll(copy);

		destModel.save(null);
	}

}
