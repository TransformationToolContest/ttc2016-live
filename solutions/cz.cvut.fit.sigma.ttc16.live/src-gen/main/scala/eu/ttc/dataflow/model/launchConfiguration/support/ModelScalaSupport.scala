package eu.ttc.dataflow.model.launchConfiguration.support

import eu.ttc.dataflow.model.launchConfiguration.Metamodel;
import eu.ttc.dataflow.model.launchConfiguration.Model;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

trait ModelScalaSupport extends EMFScalaSupport {
  type Model = eu.ttc.dataflow.model.launchConfiguration.Model
  
  protected implicit val _modelProxyBuilder = new EMFProxyBuilder[Model](LaunchConfig._launchconfigBuilder)
  
  object Model {
    def apply(name: String = null, location: String = null, metamodels: EList[Metamodel] = null, readOnLoad: Boolean = true, storeOnDisposal: Boolean = false): Model = {
      val _instance = LaunchConfig._launchconfigBuilder.create[Model]
      
      if (name != null) _instance.setName(name)
      if (location != null) _instance.setLocation(location)
      if (metamodels != null) _instance.getMetamodels.addAll(metamodels)
      if (readOnLoad != true) _instance.setReadOnLoad(readOnLoad)
      if (storeOnDisposal != false) _instance.setStoreOnDisposal(storeOnDisposal)
      
      _instance
    }
  }}
object ModelScalaSupport extends ModelScalaSupport
