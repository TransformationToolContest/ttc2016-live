package eu.ttc.dataflow.model.launchConfiguration.support

import eu.ttc.dataflow.model.launchConfiguration.Dataflow;

import fr.unice.i3s.sigma.emf.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;

trait DataflowScalaSupport extends EMFScalaSupport {
  type Dataflow = eu.ttc.dataflow.model.launchConfiguration.Dataflow
  
  protected implicit val _dataflowProxyBuilder = new EMFProxyBuilder[Dataflow](LaunchConfig._launchconfigBuilder)
  
  object Dataflow {
    def apply(location: String = null): Dataflow = {
      val _instance = LaunchConfig._launchconfigBuilder.create[Dataflow]
      
      if (location != null) _instance.setLocation(location)
      
      _instance
    }
  }}
object DataflowScalaSupport extends DataflowScalaSupport
