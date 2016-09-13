using System;
using System.CodeDom;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Interop.Ecore;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Serialization;
using NMF.Utilities;
using TTC2016.LiveContest.DataflowGenerator;
using TTC2016.LiveContest.LaunchConfiguration;
using System.Diagnostics;

namespace DataflowGenerator
{
    class Program
    {
        const string DataflowFileName = "DataFlowBasics.cs";

        static void Main(string[] args)
        {
            var stopwatch = new Stopwatch();
            stopwatch.Start();
            Console.WriteLine("Initializing repository...");
            var repository = new ModelRepository();
            var launchConfig = repository.Resolve(args[0]).RootElements[0] as Configuration;
            Environment.CurrentDirectory = Path.GetDirectoryName(Path.GetFullPath(args[0]));
            var dataflow = repository.Resolve(Path.ChangeExtension(launchConfig.Dataflow.Location, ".xmi"));
            stopwatch.Stop();
            Console.WriteLine("Done. Took {0}ms", stopwatch.ElapsedMilliseconds);

            stopwatch.Restart();
            Console.WriteLine("Generating transformation...");
            var csharp = new Microsoft.CSharp.CSharpCodeProvider();
            var csharpSettings = new CodeGeneratorOptions()
            {
                IndentString = "    ",
                BracingStyle = "C",
            };
            var ns = Path.GetFileNameWithoutExtension(launchConfig.Dataflow.Location).ToPascalCase();
            var directory = Path.GetDirectoryName(launchConfig.Dataflow.Location);
            var codeFiles = new List<string>();
            var metamodelDict = new Dictionary<string, IEnumerable<INamespace>>();
            var metamodelsCovered = new Dictionary<string, IEnumerable<INamespace>>();
            foreach (var model in launchConfig.Models)
            {
                foreach (var metamodel in model.Metamodels)
                {
                    IEnumerable<INamespace> nMeta;
                    if (!metamodelsCovered.TryGetValue(metamodel.Location, out nMeta))
                    {
                        var ecoreFile = EcoreInterop.LoadPackageFromFile(metamodel.Location);
                        nMeta = EcoreInterop.Transform2Meta(ecoreFile.Model.RootElements.OfType<EPackage>());

                        var metamodelpath = Path.Combine(directory, Path.GetFileNameWithoutExtension(metamodel.Location) + ".nmf");
                        var packageIndex = 0;
                        foreach (var package in nMeta)
                        {
                            var code = MetaFacade.CreateCode(package, ns);
                            var packagePath = Path.GetFileNameWithoutExtension(metamodelpath);
                            if (packageIndex > 0)
                            {
                                packagePath += packageIndex.ToString();
                            }
                            else
                            {
                                code.AssemblyCustomAttributes.Add(new CodeAttributeDeclaration("NMF.Models.ModelMetadata",
                                    new CodeAttributeArgument(new CodePrimitiveExpression(package.Model.ModelUri.AbsoluteUri)),
                                    new CodeAttributeArgument(new CodePrimitiveExpression(Path.GetFileNameWithoutExtension(metamodel.Location) + ".nmf"))));
                            }
                            packagePath = Path.Combine(directory, packagePath + ".cs");
                            using (var sw = new StreamWriter(packagePath))
                            {
                                csharp.GenerateCodeFromCompileUnit(code, sw, csharpSettings);
                            }
                            codeFiles.Add(packagePath);
                            packageIndex++;
                        }
                        repository.Save(nMeta.First().Model, metamodelpath);
                        metamodelsCovered.Add(metamodel.Location, nMeta);
                    }
                    metamodelDict.Add(model.Name, nMeta);
                }
            }

            var unit = Generator.GenerateCode(dataflow.RootElements[0].As<TTC2016.LiveContest.Dataflow.Model>().Elements, ns, metamodelDict, launchConfig.Models);
            var dataflowFile = Path.ChangeExtension(launchConfig.Dataflow.Location, ".cs");
            codeFiles.Add(dataflowFile);
            File.WriteAllText(dataflowFile, unit);

            var dataflowBasicsFile = Path.Combine(Path.GetDirectoryName(dataflowFile), DataflowFileName);
            codeFiles.Add(dataflowBasicsFile);
            File.WriteAllText(dataflowBasicsFile, GenerateDataflowBasicsFile());

            var projectFile = Path.ChangeExtension(dataflowFile, ".csproj");
            File.WriteAllText(projectFile, GenerateProjectFile(codeFiles, metamodelsCovered.Keys));

            stopwatch.Stop();
            Console.WriteLine("Done. Took {0}ms", stopwatch.ElapsedMilliseconds);

            stopwatch.Restart();
            Console.WriteLine("Compiling transformation...");
            var buildJob = Process.Start("MSBuild.exe", projectFile);
            buildJob.WaitForExit();
            stopwatch.Stop();
            Console.WriteLine("Done. Took {0}ms", stopwatch.ElapsedMilliseconds);

            if (buildJob.ExitCode != 0)
            {
                Console.Error.WriteLine("Build Failed. Please revise the dataflow algorithm.");
                Environment.ExitCode = buildJob.ExitCode;
                return;
            }

            stopwatch.Restart();
            Console.WriteLine("Running model transformation for specified inputs...");
            var transformationPath = Path.Combine(Path.GetDirectoryName(projectFile), "bin", Path.GetFileNameWithoutExtension(projectFile) + ".exe");
            var runJob = Process.Start(transformationPath, string.Join(" ", launchConfig.Models.Select(m => m.Location)));
            runJob.Start();
            stopwatch.Stop();
            Console.WriteLine("Done. Took {0}ms", stopwatch.ElapsedMilliseconds);
        }

        private static string GenerateDataflowBasicsFile()
        {
            using (var dataflowBasicsStream = Assembly.GetExecutingAssembly().GetManifestResourceStream("TTC2016.LiveContest.DataflowGenerator.DataFlow.cs"))
            {
                using (var sr = new StreamReader(dataflowBasicsStream))
                {
                    return sr.ReadToEnd();
                }
            }
        }

        private static string GenerateProjectFile(List<string> codeFiles, IEnumerable<string> metamodelsCovered)
        {
            var compileFilesSnippet = string.Concat(codeFiles.Select(file => Environment.NewLine + string.Format("   <Compile Include=\"{0}\" />", Path.GetFileName(file))));
            var embedFilesSnippet = string.Concat(metamodelsCovered.Select(file => Environment.NewLine + string.Format("   <EmbeddedResource Include=\"{0}.nmf\" />", Path.GetFileNameWithoutExtension(file))));
            var collectionsPath = (typeof(ObservableSet<>)).Assembly.Location;
            var expressionsPath = (typeof(INotifyExpression)).Assembly.Location;
            var expressionsLinqPath = (typeof(ExpressionExtensions)).Assembly.Location;
            var modelsPath = typeof(NMF.Models.Model).Assembly.Location;
            var serializationsPath = typeof(XmlSerializer).Assembly.Location;
            var utilitiesPath = typeof(MemoizedFunc<,>).Assembly.Location;
            var expressionsUtilitiesPath = typeof(ChangeAwareDictionary<,>).Assembly.Location;

            using (var projectTemplateStream = Assembly.GetExecutingAssembly().GetManifestResourceStream("TTC2016.LiveContest.DataflowGenerator.ProjectTemplate.csproj"))
            {
                using (var sr = new StreamReader(projectTemplateStream))
                {
                    var projectTemplate = sr.ReadToEnd();

                    return projectTemplate
                        .Replace("%NMFCollectionsPath%", collectionsPath)
                        .Replace("%NMFExpressionsPath%", expressionsPath)
                        .Replace("%NMFExpressionsLinqPath%", expressionsLinqPath)
                        .Replace("%NMFExpressionsUtilitiesPath%", expressionsUtilitiesPath)
                        .Replace("%NMFModelsPath%", modelsPath)
                        .Replace("%NMFSerializationPath%", serializationsPath)
                        .Replace("%NMFUtilitiesPath%", utilitiesPath)
                        .Replace("%CompileFiles%", compileFilesSnippet)
                        .Replace("%EmbedFiles%", embedFilesSnippet);
                }
            }
        }
    }
}
