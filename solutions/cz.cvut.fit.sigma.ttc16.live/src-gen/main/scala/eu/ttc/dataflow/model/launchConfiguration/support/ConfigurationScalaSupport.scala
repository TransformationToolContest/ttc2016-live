package eu.ttc.dataflow.model.launchConfiguration.support

import eu.ttc.dataflow.model.launchConfiguration.Configuration;
import eu.ttc.dataflow.model.launchConfiguration.Dataflow;
import eu.ttc.dataflow.model.launchConfiguration.Model;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

trait ConfigurationScalaSupport extends EMFScalaSupport {
  type Configuration = eu.ttc.dataflow.model.launchConfiguration.Configuration
  
  protected implicit val _configurationProxyBuilder = new EMFProxyBuilder[Configuration](LaunchConfig._launchconfigBuilder)
  
  object Configuration {
    def apply(dataflow: Dataflow = null, models: EList[Model] = null): Configuration = {
      val _instance = LaunchConfig._launchconfigBuilder.create[Configuration]
      
      if (dataflow != null) _instance.setDataflow(dataflow)
      if (models != null) _instance.getModels.addAll(models)
      
      _instance
    }
  }}
object ConfigurationScalaSupport extends ConfigurationScalaSupport
