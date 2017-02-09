using System;
using System.CodeDom;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NMF.Models;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Utilities;
using TTC2016.LiveContest.LaunchConfiguration;

namespace TTC2016.LiveContest.DataflowGenerator
{
    class Generator
    {
        private Dictionary<string, string> models = new Dictionary<string, string>();
        private IDictionary<string, IEnumerable<INamespace>> metamodels; 
        private string ns;
        private Dictionary<string, SymbolInfo> symbolTable = new Dictionary<string, SymbolInfo>();

        private static readonly IType ClassType = MetaRepository.Instance.ResolveType("http://nmf.codeplex.com/nmeta/#//Class/");
        private static readonly IType BooleanType = MetaRepository.Instance.ResolveType("http://nmf.codeplex.com/nmeta/#//Boolean/");
        private static readonly IType StringType = MetaRepository.Instance.ResolveType("http://nmf.codeplex.com/nmeta/#//String/");
        private static readonly IType IntegerType = MetaRepository.Instance.ResolveType("http://nmf.codeplex.com/nmeta/#//Integer/");

        private StringBuilder program = new StringBuilder();

        private struct SymbolInfo
        {
            public string Code { get; set; }
            public IType Type { get; set; }
            public bool IsOrdered { get; set; }
            public bool IsCollection { get; set; }
        }

        public static string GenerateCode(IEnumerable<Dataflow.IElement> elements, string ns, IDictionary<string, IEnumerable<INamespace>> metamodels, IList<IModel> models)
        {
            var instance = new Generator();
            instance.ns = ns;
            instance.metamodels = metamodels;
            instance.WriteUsings();
            instance.WriteMain(elements, models, ns);
            return instance.program.ToString();
        }

        private void AddSymbol(string name, IType type, bool isCollection, bool isOrdered)
        {
            SymbolInfo existing;
            if (symbolTable.TryGetValue(name, out existing))
            {
                var newType = GetLeastCommon(existing.Type, type);
                symbolTable[name] = new SymbolInfo()
                {
                    Code = string.Format("(({0})row[\"{1}\"])", CreateTypeReference(newType, true), name),
                    Type = newType,
                    IsCollection = existing.IsCollection && isCollection,
                    IsOrdered = existing.IsOrdered && isOrdered
                };
            }
            else
            {
                symbolTable.Add(name, new SymbolInfo()
                {
                    Code = string.Format("(({0})row[\"{1}\"])", CreateTypeReference(type, true), name),
                    Type = type,
                    IsCollection = isCollection,
                    IsOrdered = isOrdered
                });
            }
        }

        private IType GetLeastCommon(IType type1, IType type2)
        {
            if (type1 == type2) return type1;

            var class1 = type1 as IClass;
            var class2 = type2 as IClass;

            
            var class1Bases = new List<IClass>();
            while (class1 != null)
            {
                class1Bases.Add(class1);
                class1 = class1.BaseTypes.FirstOrDefault();
            }

            while (class2 != null && !class1Bases.Contains(class2))
            {
                class2 = class2.BaseTypes.FirstOrDefault();
            }

            if (class2 == null) throw new InvalidOperationException(string.Format("Types {0} and {1} could not be unified", type1, type2));
            return class2;
        }

        private void WriteUsings()
        {
            program.AppendLine("using NMF.Models;");
            program.AppendLine("using NMF.Models.Repository;");
            program.AppendLine("using NMF.Collections.ObjectModel;");
            program.AppendLine("using NMF.Expressions;");
            program.AppendLine("using NMF.Expressions.Linq;");
            program.AppendLine("using System.Collections.Generic;");
            program.AppendLine("using TTC2016.LiveContest;");
        }

        private void WriteMain(IEnumerable<Dataflow.IElement> elements, IList<IModel> models, string name)
        {
            program.AppendLine(string.Format("namespace {0}", name));
            program.AppendLine("{");
            program.AppendLine("    public class Program");
            program.AppendLine("    {");
            program.AppendLine("        static void Main(string[] args)");
            program.AppendLine("        {");
            program.AppendLine("            ModelRepository repository = new ModelRepository();");
            WriteModelDeclarations(models);
            program.AppendLine("            Dataflow flow = new Dataflow();");

            var defer = new StringBuilder();
            foreach (var element in elements)
            {
                GenerateElement(element, defer);
            }
            program.Append(defer.ToString());

            program.AppendLine();
            WriteDataflowWiring(elements);
            program.AppendLine();
            WriteExecutes(elements);
            program.AppendLine();
            WriteSaveModels(models);
            program.AppendLine("        }");
            program.AppendLine("    }");
            program.AppendLine("}");

        }

        private void WriteSaveModels(IList<IModel> models)
        {
            var index = 0;
            foreach (var model in models)
            {
                string modelReference;
                if (model.StoreOnDisposal.GetValueOrDefault(false) && this.models.TryGetValue(model.Name, out modelReference))
                {
                    program.AppendLine(string.Format("            repository.Save({0}, args[{1}]);", modelReference, index));
                }
                index++;
            }
        }

        private void WriteExecutes(IEnumerable<Dataflow.IElement> elements)
        {
            foreach (var element in elements)
            {
                if (element.Target == null)
                {
                    program.AppendLine(string.Format("            {0}.Execute(true);", element.Name.ToCamelCase()));
                }
            }
        }

        private void WriteDataflowWiring(IEnumerable<Dataflow.IElement> elements)
        {
            foreach (var element in elements)
            {
                if (element.Target != null)
                {
                    program.AppendLine(string.Format("            {0}.AddTarget({1});", element.Name.ToCamelCase(), element.Target.Name.ToCamelCase()));
                    var targetFilter = element.Target as Dataflow.Filter;
                    if (targetFilter != null)
                    {
                        program.AppendLine(string.Format("            {0}.AddTarget({1}Reject);", element.Name.ToCamelCase(), targetFilter.Name.ToCamelCase()));
                    }
                    var filter = element as Dataflow.Filter;
                    if (filter != null && filter.RejectTarget != null)
                    {
                        program.AppendLine(string.Format("            {0}Reject.AddTarget({1});", element.Name.ToCamelCase(), filter.RejectTarget.Name.ToCamelCase()));
                    }
                }
            }
        }

        private void WriteModelDeclarations(IList<IModel> models)
        {
            var index = 0;
            foreach (var model in models)
            {
                var modelName = model.Name.ToCamelCase() + "Model";
                var initialValue = "new Model()";
                if (model.ReadOnLoad.GetValueOrDefault(true))
                {
                    initialValue = string.Format("repository.Resolve(args[{0}])", index);
                }
                program.AppendLine(string.Format("            Model {0} = {1};", modelName, initialValue));
                this.models.Add(model.Name, modelName);
                index++;
            }
        }

        private void GenerateElement(Dataflow.IElement element, StringBuilder defer)
        {
            defer.AppendLine(string.Format("            var {0} = new DataflowNode(source =>", element.Name.ToCamelCase()));
            GenerateElementInternal((dynamic)element, defer);
        }

        private SymbolInfo GenerateExpression(Dataflow.IExpression expression)
        {
            return GenerateExpressionInternal((dynamic)expression);
        }

        private void GenerateElementInternal(Dataflow.AddToContainer element, StringBuilder defer)
        {
            var value = GenerateExpression(element.Value);
            var isList = element.Position != null && value.IsOrdered;
            var type = CreateTypeReference(value.Type, true);
            defer.AppendLine(string.Format("                Dataflow.AddToCollection(source, row => {1}, row => (ICollection<{0}>)row[\"{2}\"]));", type, value.Code, element.ListField));
        }

        private void GenerateElementInternal(Dataflow.AllInstances element, StringBuilder defer)
        {
            var type = CreateTypeReference(element.Model, element.TypeName, true);

            defer.AppendLine(string.Format("               source.SelectMany(row => {0}.Descendants().OfType<{1}>(),", models[element.Model], type));
            defer.AppendLine(string.Format("                                 (row, _{0}) => row.With(\"{0}\", _{0})));", element.Field));
            AddSymbol(element.Field, FindType(element.Model, element.TypeName), false, false);
        }

        private void GenerateElementInternal(Dataflow.ForEach element, StringBuilder defer)
        {
            var typeObj = symbolTable[element.ListField].Type;
            var type = CreateTypeReference(typeObj, true);
            defer.AppendLine(string.Format("               source.SelectMany(row => (IEnumerableExpression<{0}>)row[\"{1}\"],", type, element.ListField));
            defer.AppendLine(string.Format("                                 (row, {0}) => row.With(\"{0}\", {0})));", element.ItemField));

            AddSymbol(element.ItemField, typeObj, false, false);
        }

        private IType FindType(string model, string typeName)
        {
            IEnumerable<INamespace> ns;
            if (metamodels.TryGetValue(model, out ns))
            {
                foreach (var package in ns)
                {
                    var candidate = FindType(package, typeName);
                    if (candidate != null) return candidate;
                }
            }
            return null;
        }

        private IType FindType(INamespace ns, string typeName)
        {
            var found = ns.Types.FirstOrDefault(t => t.Name == typeName);
            if (found != null) return found;
            foreach (var subNamespace in ns.ChildNamespaces)
            {
                var child = FindType(subNamespace, typeName);
                if (child != null) return child;
            }
            return null;
        }

        private string CreateTypeReference(string model, string typeName, bool useInterface)
        {
            return CreateTypeReference(FindType(model, typeName), useInterface);
        }

        private string CreateTypeReference(IType type, bool useInterface)
        {
            var mapped = type.GetExtension<MappedType>();
            if (mapped != null)
            {
                return mapped.SystemType.FullName;
            }
            var typeName = type.Name.ToString();
            var ns = type.Namespace;
            while (ns != null)
            {
                typeName = ns.Name.ToPascalCase() + "." + (useInterface ? "I" : "") + typeName;
                ns = ns.ParentNamespace;
            }
            return typeName;
        }

        private void GenerateElementInternal(Dataflow.NewInstance element, StringBuilder defer)
        {
            var type = CreateTypeReference(element.Model, element.TypeName, false);
            var key = GenerateExpression(element.Key);

            program.AppendLine(string.Format("            var {0}Func = ObservingFunc<ChangeAwareDictionary<string, object>, object>.FromExpression(row => flow.NewInstance<{1}>({2}, {3}));",
                element.Name.ToCamelCase(), type, models[element.Model], key.Code));

            defer.AppendLine(string.Format("                source.Select(row => row.With(\"{0}\", {1}Func.Observe(row)))); ", element.InstanceField, element.Name.ToCamelCase()));

            AddSymbol(element.InstanceField, FindType(element.Model, element.TypeName), false, false);
        }

        private void GenerateElementInternal(Dataflow.Evaluate element, StringBuilder defer)
        {
            var value = GenerateExpression(element.Expression);
            program.AppendLine(string.Format("            var {0}Func = ObservingFunc<ChangeAwareDictionary<string, object>, object>.FromExpression(row => {1});", element.Name.ToCamelCase(), value.Code));
            
            defer.AppendLine(string.Format("                source.Select(row => row.With(\"{0}\", {1}Func.Observe(row)))); ", element.Field, element.Name.ToCamelCase()));

            var expression = GenerateExpression(element.Expression);
            AddSymbol(element.Field, value.Type, value.IsCollection, value.IsOrdered);
        }

        private void GenerateElementInternal(Dataflow.Filter element, StringBuilder defer)
        {
            var filter = GenerateExpression(element.FilterBy);
            defer.AppendLine(string.Format("                source.Where(row => {0})); ", filter.Code));

            if (element.RejectTarget != null)
            {
                defer.AppendLine(string.Format("            var {0}Reject = new DataflowNode(source =>", element.Name.ToCamelCase()));
                defer.AppendLine(string.Format("                source.Where(row => !{0})); ", filter.Code));
            }
        }

        private void GenerateElementInternal(Dataflow.SetFeature_ element, StringBuilder defer)
        {
            var value = GenerateExpression(element.Value);
            var target = symbolTable[element.ObjectField];
            defer.AppendLine(string.Format("                Dataflow.SetField(source, row => {0}, (row, value) => {1}.{2} = value)); ", value.Code, target.Code, element.Feature.ToPascalCase()));
        }


        private SymbolInfo GenerateExpressionInternal(Dataflow.BinaryOperation expression)
        {
            var left = GenerateExpression(expression.LeftExpression);
            var right = GenerateExpression(expression.RightExpression);
            var type = BooleanType;
            string code;
            switch (expression.Operator.GetValueOrDefault(Dataflow.BinaryOperator.EQ))
            {
                case Dataflow.BinaryOperator.EQ:
                    code = left.Code + " == " + right.Code;
                    break;
                case Dataflow.BinaryOperator.NE:
                    code = left.Code + " != " + right.Code;
                    break;
                case Dataflow.BinaryOperator.GT:
                    code = left.Code + " > " + right.Code;
                    break;
                case Dataflow.BinaryOperator.GE:
                    code = left.Code + " >= " + right.Code;
                    break;
                case Dataflow.BinaryOperator.LT:
                    code = left.Code + " < " + right.Code;
                    break;
                case Dataflow.BinaryOperator.LE:
                    code = left.Code + " <= " + right.Code;
                    break;
                case Dataflow.BinaryOperator.AND:
                    code = string.Format("Dataflow.IsTruish({0}) && Dataflow.IsTruish({1})", left.Code, right.Code);
                    break;
                case Dataflow.BinaryOperator.OR:
                    code = string.Format("Dataflow.IsTruish({0}) || Dataflow.IsTruish({1})", left.Code, right.Code);
                    break;
                case Dataflow.BinaryOperator.XOR:
                    code = left.Code + " ^ " + right.Code;
                    break;
                case Dataflow.BinaryOperator.ADD:
                    code = left.Code + " + " + right.Code;
                    type = left.Type;
                    break;
                case Dataflow.BinaryOperator.SUBTRACT:
                    code = left.Code + " - " + right.Code;
                    type = left.Type;
                    break;
                case Dataflow.BinaryOperator.MULTIPLY:
                    code = left.Code + " * " + right.Code;
                    type = left.Type;
                    break;
                case Dataflow.BinaryOperator.DIVIDE:
                    code = left.Code + " / " + right.Code;
                    type = left.Type;
                    break;
                case Dataflow.BinaryOperator.MODULO:
                    code = left.Code + " % " + right.Code;
                    type = left.Type;
                    break;
                default:
                    throw new ArgumentOutOfRangeException("expression");
            }
            return new SymbolInfo()
            {
                Code = "(" + code + ")",
                IsCollection = false,
                IsOrdered = false,
                Type = type
            };
        }

        private SymbolInfo GenerateExpressionInternal(Dataflow.BooleanLiteral literal)
        {
            return new SymbolInfo()
            {
                Code = literal.Value.GetValueOrDefault(false) ? "true" : "false",
                IsCollection = false,
                IsOrdered = false,
                Type = BooleanType
            };
        }

        private SymbolInfo GenerateExpressionInternal(Dataflow.StringLiteral literal)
        {
            return new SymbolInfo()
            {
                Code = "\"" + literal.Value + "\"",
                IsCollection = false,
                IsOrdered = false,
                Type = StringType
            };
        }

        private SymbolInfo GenerateExpressionInternal(Dataflow.IntegerLiteral literal)
        {
            return new SymbolInfo()
            {
                Code = literal.Value.GetValueOrDefault(0).ToString(),
                IsCollection = false,
                IsOrdered = false,
                Type = IntegerType
            };
        }

        private SymbolInfo GenerateExpressionInternal(Dataflow.FeatureCall expression)
        {
            var target = GenerateExpression(expression.TargetExpression);
            if (expression.Feature == "eClass")
            {
                return new SymbolInfo()
                {
                    Code = target.Code + ".GetClass()",
                    Type = ClassType,
                    IsCollection = false
                };
            }
            else if (expression.Feature == "eContainer")
            {
                var type = target.Type;
                if (type == null) throw new InvalidOperationException("Could not identify type of expression " + expression.ToString());
                var parentNs = type.Parent as INamespace;
                var potentialParents = new List<IClass>();
                foreach (var potentialParent in parentNs.Types.OfType<IClass>())
                {
                    if (potentialParent.References.Any(r => r.IsContainment && r.Type == type))
                    {
                        potentialParents.Add(potentialParent);
                    }
                }
                if (potentialParents.Count != 1) throw new InvalidOperationException("The type of the parent could not be detected automatically.");
                var parentType = CreateTypeReference(potentialParents[0], true);
                return new SymbolInfo()
                {
                    Code = string.Format("(({0}){1}.Parent)", parentType, target.Code),
                    Type = potentialParents[0],
                    IsCollection = false
                };
            }
            else
            {
                var isCollection = false;
                var isOrdered = false;
                var targetType = target.Type as IClass;
                IType type = null;
                if (targetType != null)
                {
                    var feature = (ITypedElement)targetType.LookupAttribute(expression.Feature) ?? targetType.LookupReference(expression.Feature);
                    if (feature != null)
                    {
                        isCollection = feature.UpperBound != 1;
                        isOrdered = feature.IsOrdered;
                        type = feature.Type;
                    }
                }
                return new SymbolInfo()
                {
                    Code = target.Code + "." + expression.Feature.ToPascalCase(),
                    Type = type,
                    IsCollection = isCollection,
                    IsOrdered = isOrdered
                };
            }
        }

        private SymbolInfo GenerateExpressionInternal(Dataflow.FieldReference expression)
        {
            return symbolTable[expression.Field];
        }
    }
}
