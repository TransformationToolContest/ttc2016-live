package eu.ttc.dataflow.model.launchConfiguration.support

import eu.ttc.dataflow.model.launchConfiguration.Configuration;
import eu.ttc.dataflow.model.launchConfiguration.Dataflow;
import eu.ttc.dataflow.model.launchConfiguration.LaunchConfigPackage;
import eu.ttc.dataflow.model.launchConfiguration.Metamodel;
import eu.ttc.dataflow.model.launchConfiguration.Model;

import fr.unice.i3s.sigma.emf.support.EMFBuilder;
import fr.unice.i3s.sigma.emf.support.EMFScalaSupport;
import fr.unice.i3s.sigma.emf.support.SigmaEcorePackage;

import org.eclipse.emf.common.util.EList;

import scala.Option;


trait LaunchConfig
  extends EMFScalaSupport {
    
    implicit class Configuration2Sigma(that: Configuration) {
      def dataflow: Option[Dataflow] = Option(that.getDataflow)
      def dataflow_=(value: Dataflow): Unit = that.setDataflow(value)
      def models: EList[Model] = that.getModels
    }
    implicit class Dataflow2Sigma(that: Dataflow) {
      def location: Option[String] = Option(that.getLocation)
      def location_=(value: String): Unit = that.setLocation(value)
    }
    implicit class Model2Sigma(that: Model) {
      def name: Option[String] = Option(that.getName)
      def name_=(value: String): Unit = that.setName(value)
      def location: Option[String] = Option(that.getLocation)
      def location_=(value: String): Unit = that.setLocation(value)
      def metamodels: EList[Metamodel] = that.getMetamodels
      def readOnLoad: Option[Boolean] = Option(that.isReadOnLoad)
      def readOnLoad_=(value: Boolean): Unit = that.setReadOnLoad(value)
      def storeOnDisposal: Option[Boolean] = Option(that.isStoreOnDisposal)
      def storeOnDisposal_=(value: Boolean): Unit = that.setStoreOnDisposal(value)
    }
    implicit class Metamodel2Sigma(that: Metamodel) {
      def location: Option[String] = Option(that.getLocation)
      def location_=(value: String): Unit = that.setLocation(value)
    }
    
    object _launchConfiguration extends SigmaEcorePackage[LaunchConfigPackage] with
      ConfigurationScalaSupport with
      DataflowScalaSupport with
      ModelScalaSupport with
      MetamodelScalaSupport {
      
      val ePackage = LaunchConfigPackage.eINSTANCE
    }}
object LaunchConfig extends LaunchConfig {
  private[this] val ePackage = LaunchConfigPackage.eINSTANCE
  
  protected[support] val _launchconfigBuilder = new EMFBuilder(ePackage)
}