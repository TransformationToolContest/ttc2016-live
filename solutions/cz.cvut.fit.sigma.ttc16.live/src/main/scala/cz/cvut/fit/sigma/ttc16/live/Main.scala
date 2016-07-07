package cz.cvut.fit.sigma.ttc16.live

import java.io.File

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable.Buffer

import org.eclipse.emf.ecore.EPackage.Registry

import eu.ttc.dataflow.DataflowDSLStandaloneSetup
import eu.ttc.dataflow.model.dataflow.support.Dataflow
import eu.ttc.dataflow.model.launchConfiguration.Model
import eu.ttc.dataflow.model.launchConfiguration.support.LaunchConfig
import eu.ttc.dataflow.model.launchConfiguration.support.LaunchConfig._launchConfiguration._
import fr.unice.i3s.sigma.emf.support.ecore.{ EcorePackageScalaSupport => Ecore }
import fr.unice.i3s.sigma.emf.support.ecore.EcorePackageScalaSupport._ecore._
import fr.unice.i3s.sigma.emf.util.EMFUtils

object Main extends App with LaunchConfig with Dataflow with Ecore {  
  assert(LaunchConfig._launchConfiguration.ePackage != null)
  assert(Dataflow._dataflow.ePackage != null)

  EMFUtils.IO.registerDefaultFactories()
  DataflowDSLStandaloneSetup.doSetup()

  if (args.length != 1) {
    println(s"Missing required parameters: <path/to/file.launchconfig>")
    sys.exit(1)
  }

  val configFile = new File(args(0))
  val config = EMFUtils.IO.loadFromFile[Configuration](configFile)
  
  def resolvePath(relativePath: String) = new File(configFile.getParentFile, relativePath)
  
  val metamodels: Map[Model, Seq[EPackage]] = 
    config.models
          .toSeq
          .map { m =>            
            val pkgs = 
              m.metamodels
               .toSeq
               .map(x => x.location.get)
               .distinct
               .map(x => EMFUtils.IO.loadResourceFromFile(resolvePath(x)))
               .flatMap { x => 
                 x.getContents.collect { 
                    case p : EPackage => { 
              	      println(s"Loaded metamodel ${p.nsURI}")
                      Registry.INSTANCE += p.nsURI -> p
                      p 
                    }
                 }
               }
             (m, pkgs)
           }
           .toMap
  
  val models: Map[Model, Buffer[EObject]] = 
    config.models
          .map { x => 
            if (x.isReadOnLoad()) {
              x -> asScalaBuffer(EMFUtils.IO.loadResourceFromFile(resolvePath(x.location.get)).getContents)
            } else {
              x -> Buffer[EObject]()
            }
          }
          .toMap

  val dataflow = config.dataflow.map(x => EMFUtils.IO.loadFromFile[_dataflow.Model](resolvePath(x.location.get))).get
  
  val time = System.currentTimeMillis
  
  new Interpreter(
      models.map(x => (x._1.name.get, x._2)),
      metamodels.map(x => (x._1.name.get, x._2)),
      dataflow).run()
      
  println(s"Execution took: ${System.currentTimeMillis - time} ms")
      
  for ((model, elements) <- models if model.isStoreOnDisposal()) {
    val path = resolvePath(model.location.get)
    
    println(s"Storing model ${model.name.get} to $path")
    EMFUtils.IO.saveToFile(path, elements filter (_.eContainer() == null))      
  }
}