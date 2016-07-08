package eu.ttc.dataflow.model.launchConfiguration.support

import eu.ttc.dataflow.model.launchConfiguration.Metamodel;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait MetamodelScalaSupport extends EMFScalaSupport {
  type Metamodel = eu.ttc.dataflow.model.launchConfiguration.Metamodel
  
  protected implicit val _metamodelProxyBuilder = new EMFProxyBuilder[Metamodel](LaunchConfig._launchconfigBuilder)
  
  object Metamodel {
    def apply(location: String = null): Metamodel = {
      val _instance = LaunchConfig._launchconfigBuilder.create[Metamodel]
      
      if (location != null) _instance.setLocation(location)
      
      _instance
    }
  }}
object MetamodelScalaSupport extends MetamodelScalaSupport
