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
        private Dictionary<string, CodeExpression> models = new Dictionary<string, CodeExpression>();
        private CodeExpression trace;
        private HashSet<Dataflow.IElement> elementsProcessed = new HashSet<Dataflow.IElement>();
        private CodeMemberMethod main;
        private CodeTypeMember truish;
        private IDictionary<string, INamespace> metamodels; 
        private string ns;
        private Dictionary<string, Stack<IType>> symbolTable = new Dictionary<string, Stack<IType>>();

        public static CodeCompileUnit GenerateCode(IEnumerable<Dataflow.IElement> elements, string ns, IDictionary<string, INamespace> metamodels, IList<IModel> models)
        {
            var instance = new Generator();
            instance.ns = ns;
            instance.metamodels = metamodels;
            instance.CreateTruish();
            instance.CreateMain(elements, models);
            var unit = new CodeCompileUnit();
            var codeNs = new CodeNamespace(ns);
            codeNs.Imports.Add(new CodeNamespaceImport("NMF.Models"));
            codeNs.Imports.Add(new CodeNamespaceImport("NMF.Expressions.Linq"));
            codeNs.Imports.Add(new CodeNamespaceImport("System.Collections.Generic"));
            unit.Namespaces.Add(codeNs);
            var programClass = new CodeTypeDeclaration()
            {
                Attributes = MemberAttributes.Static | MemberAttributes.Assembly,
                Name = "Program",
                IsClass = true
            };
            programClass.Members.Add(instance.main);
            programClass.Members.Add(instance.truish);
            codeNs.Types.Add(programClass);
            return unit;
        }

        private void CreateMain(IEnumerable<Dataflow.IElement> elements, IList<IModel> models)
        {
            main = new CodeMemberMethod()
            {
                Name = "Main",
                Attributes = MemberAttributes.Static
            };
            main.Parameters.Add(new CodeParameterDeclarationExpression(typeof(string[]), "args"));
            var argsRef = new CodeArgumentReferenceExpression("args");

            main.Statements.Add(new CodeVariableDeclarationStatement(typeof(ModelRepository), "repository",
                new CodeObjectCreateExpression(typeof(ModelRepository))));
            var repositoryRef = new CodeVariableReferenceExpression("repository");
            var index = 0;
            foreach (var model in models)
            {
                var reference = new CodeVariableReferenceExpression(model.Name.ToCamelCase() + "Model");
                CodeExpression initExpression;
                if (model.ReadOnLoad.GetValueOrDefault(false))
                {
                    initExpression = new CodeMethodInvokeExpression(repositoryRef, "Resolve", new CodeIndexerExpression(argsRef, new CodePrimitiveExpression(index)));
                }
                else
                {
                    initExpression = new CodeObjectCreateExpression(typeof(NMF.Models.Model));
                }
                main.Statements.Add(new CodeVariableDeclarationStatement(typeof(NMF.Models.Model), reference.VariableName, initExpression));
                this.models.Add(model.Name, reference);
                index++;
            }
            main.Statements.Add(new CodeVariableDeclarationStatement(typeof(Dictionary<object, IModelElement>), "trace",
                new CodeObjectCreateExpression(typeof(Dictionary<object, IModelElement>))));
            trace = new CodeVariableReferenceExpression("trace");

            foreach (var element in elements)
            {
                if (elementsProcessed.Add(element))
                {
                    GenerateElement(element, main.Statements);
                }
            }

            index = 0;
            foreach (var model in models)
            {
                CodeExpression modelReference;
                if (model.StoreOnDisposal.GetValueOrDefault(false) && this.models.TryGetValue(model.Name, out modelReference))
                {
                    main.Statements.Add(new CodeMethodInvokeExpression(repositoryRef, "Save", modelReference, new CodeIndexerExpression(argsRef, new CodePrimitiveExpression(index))));
                }
                index++;
            }
        }

        private void CreateTruish()
        {
            truish = new CodeSnippetTypeMember(@"
        private static bool IsTruish(object obj)
        {
            if (obj == null) return false;
            if (obj is bool)
            {
                return (bool)obj;
            }
            if (obj is System.Collections.IEnumerable)
            {
                var enumerator = ((System.Collections.IEnumerable)obj).GetEnumerator();
                return enumerator.MoveNext();
            }
            return true;
        }");
        }

        private void GenerateElement(Dataflow.IElement element, CodeStatementCollection scope)
        {
            elementsProcessed.Add(element);
            GenerateElementInternal((dynamic)element, scope);
        }

        private CodeExpression GenerateExpression(Dataflow.IExpression expression)
        {
            return GenerateExpressionInternal((dynamic)expression);
        }

        private void GenerateElementInternal(Dataflow.AllInstances element, CodeStatementCollection scope)
        {
            CodeTypeReference type = CreateTypeReference(element.Model, element.TypeName);
            var enumeratorDef = new CodeVariableDeclarationStatement(new CodeTypeReference(typeof(IEnumerator<>).Name, type), element.Field + "Enumerator");
            var modelReference = models[element.Model];
            enumeratorDef.InitExpression = new CodeMethodInvokeExpression(new CodeMethodInvokeExpression(new CodeMethodReferenceExpression(new CodeMethodInvokeExpression(modelReference, "Descendants"), "OfType", type)), "GetEnumerator");
            var enumeratorRef = new CodeVariableReferenceExpression(enumeratorDef.Name);
            var foreachLoop = new CodeIterationStatement(enumeratorDef, new CodeMethodInvokeExpression(enumeratorRef, "MoveNext"), new CodeSnippetStatement());
            scope.Add(foreachLoop);
            var fieldDef = new CodeVariableDeclarationStatement(type, element.Field, new CodePropertyReferenceExpression(enumeratorRef, "Current"));
            foreachLoop.Statements.Add(fieldDef);
            Stack<IType> symbol;
            if (!symbolTable.TryGetValue(element.Field, out symbol))
            {
                symbol = new Stack<IType>();
                symbolTable.Add(element.Field, symbol);
            }
            symbol.Push(FindType(element.Model, element.TypeName));
            if (element.Target != null)
            {
                GenerateElement(element.Target, foreachLoop.Statements);
            }
            symbol.Pop();
        }

        private IType FindType(string model, string typeName)
        {
            INamespace ns;
            if (metamodels.TryGetValue(model, out ns))
            {
                return FindType(ns, typeName);   
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

        private IType FindType(CodeExpression expression)
        {
            if (expression.UserData.Contains("type"))
            {
                return expression.UserData["type"] as IType;
            }
            else
            {
                return null;
            }
        }

        private CodeTypeReference CreateTypeReference(string model, string typeName)
        {
            return CreateTypeReference(FindType(model, typeName));
        }

        private CodeTypeReference CreateTypeReference(IType type)
        {
            var typeName = type.Name.ToString();
            var ns = type.Namespace;
            while (ns != null)
            {
                typeName = ns.Name.ToPascalCase() + "." + typeName;
                ns = ns.ParentNamespace;
            }
            return new CodeTypeReference(typeName);
        }

        private void GenerateElementInternal(Dataflow.NewInstance element, CodeStatementCollection scope)
        {
            CodeTypeReference type = CreateTypeReference(element.Model, element.TypeName);
            var instanceRef = new CodeVariableReferenceExpression(element.InstanceField);
            var instanceTraceRef = new CodeVariableReferenceExpression("_" + element.InstanceField + "Traced");
            var keyRef = new CodeVariableReferenceExpression("_" + element.InstanceField + "Key");
            scope.Add(new CodeVariableDeclarationStatement(type, instanceRef.VariableName));
            scope.Add(new CodeVariableDeclarationStatement(typeof(IModelElement), instanceTraceRef.VariableName));
            scope.Add(new CodeVariableDeclarationStatement(typeof(object), keyRef.VariableName, GenerateExpression(element.Key)));
            var checkTrace = new CodeConditionStatement();
            checkTrace.Condition = new CodeMethodInvokeExpression(trace, "TryGetValue", keyRef, new CodeDirectionExpression(FieldDirection.Out, instanceTraceRef));
            checkTrace.TrueStatements.Add(new CodeAssignStatement(instanceRef, new CodeCastExpression(type, instanceTraceRef)));
            checkTrace.FalseStatements.Add(new CodeAssignStatement(instanceRef, new CodeObjectCreateExpression(type)));
            var modelReference = models[element.Model];
            checkTrace.FalseStatements.Add(new CodeMethodInvokeExpression(new CodePropertyReferenceExpression(modelReference, "RootElements"), "Add", instanceRef));
            checkTrace.FalseStatements.Add(new CodeMethodInvokeExpression(trace, "Add", keyRef, instanceRef));
            scope.Add(checkTrace);
            Stack<IType> symbol;
            if (!symbolTable.TryGetValue(element.InstanceField, out symbol))
            {
                symbol = new Stack<IType>();
                symbolTable.Add(element.InstanceField, symbol);
            }
            symbol.Push(FindType(element.Model, element.TypeName));
            if (element.Target != null)
            {
                GenerateElement(element.Target, scope);
            }
            symbol.Pop();
        }

        private void GenerateElementInternal(Dataflow.Evaluate element, CodeStatementCollection scope)
        {
            var type = new CodeTypeReference(typeof(string));
            var expression = GenerateExpression(element.Expression);
            scope.Add(new CodeVariableDeclarationStatement(type, element.Field, expression));
            Stack<IType> symbol;
            if (!symbolTable.TryGetValue(element.Field, out symbol))
            {
                symbol = new Stack<IType>();
                symbolTable.Add(element.Field, symbol);
            }
            symbol.Push(FindType(expression));
            if (element.Target != null)
            {
                GenerateElement(element.Target, scope);
            }
            symbol.Pop();
        }

        private void GenerateElementInternal(Dataflow.Filter element, CodeStatementCollection scope)
        {
            var ifStmt = new CodeConditionStatement(GenerateExpression(element.FilterBy));
            if (element.Target != null)
            {
                GenerateElement(element.Target, ifStmt.TrueStatements);
            }
            if (element.RejectTarget != null)
            {
                GenerateElement(element.RejectTarget, ifStmt.FalseStatements);
            }
            scope.Add(ifStmt);
        }

        private void GenerateElementInternal(Dataflow.SetFeature_ element, CodeStatementCollection scope)
        {
            var featureRef = new CodePropertyReferenceExpression(new CodeVariableReferenceExpression(element.ObjectField), element.Feature.ToPascalCase());
            scope.Add(new CodeAssignStatement(featureRef, GenerateExpression(element.Value)));
            if (element.Target != null)
            {
                GenerateElement(element.Target, scope);
            }
        }


        private CodeExpression GenerateExpressionInternal(Dataflow.BinaryOperation expression)
        {
            var left = GenerateExpression(expression.LeftExpression);
            var right = GenerateExpression(expression.RightExpression);
            switch (expression.Operator.GetValueOrDefault(Dataflow.BinaryOperator.EQ))
            {
                case Dataflow.BinaryOperator.EQ:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.IdentityEquality, right);
                case Dataflow.BinaryOperator.NE:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.IdentityInequality, right);
                case Dataflow.BinaryOperator.GT:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.GreaterThan, right);
                case Dataflow.BinaryOperator.GE:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.GreaterThanOrEqual, right);
                case Dataflow.BinaryOperator.LT:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.LessThan, right);
                case Dataflow.BinaryOperator.LE:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.LessThanOrEqual, right);
                case Dataflow.BinaryOperator.AND:
                    return new CodeBinaryOperatorExpression(Truish(left), CodeBinaryOperatorType.BooleanAnd, Truish(right));
                case Dataflow.BinaryOperator.OR:
                    return new CodeBinaryOperatorExpression(Truish(left), CodeBinaryOperatorType.BooleanOr, Truish(right));
                case Dataflow.BinaryOperator.XOR:
                    throw new NotSupportedException();
                case Dataflow.BinaryOperator.ADD:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.Add, right);
                case Dataflow.BinaryOperator.SUBTRACT:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.Subtract, right);
                case Dataflow.BinaryOperator.MULTIPLY:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.Multiply, right);
                case Dataflow.BinaryOperator.DIVIDE:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.Divide, right);
                case Dataflow.BinaryOperator.MODULO:
                    return new CodeBinaryOperatorExpression(left, CodeBinaryOperatorType.Modulus, right);
                default:
                    throw new ArgumentOutOfRangeException("expression");
            }
        }

        private CodeExpression GenerateExpressionInternal(Dataflow.BooleanLiteral literal)
        {
            return new CodePrimitiveExpression(literal.Value.GetValueOrDefault(false));
        }

        private CodeExpression GenerateExpressionInternal(Dataflow.StringLiteral literal)
        {
            return new CodePrimitiveExpression(literal.Value);
        }

        private CodeExpression GenerateExpressionInternal(Dataflow.IntegerLiteral literal)
        {
            return new CodePrimitiveExpression(literal.Value.GetValueOrDefault(0));
        }

        private CodeExpression GenerateExpressionInternal(Dataflow.FeatureCall expression)
        {
            var target = GenerateExpression(expression.TargetExpression);
            if (expression.Feature == "eClass")
            {
                return new CodeMethodInvokeExpression(target, "GetClass");
            }
            else if (expression.Feature == "eContainer")
            {
                var type = FindType(target);
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
                var parentType = CreateTypeReference(potentialParents[0]);
                return new CodeCastExpression(parentType, new CodePropertyReferenceExpression(target, "Parent"));
            }
            else
            {
                return new CodePropertyReferenceExpression(target, expression.Feature.ToPascalCase());
            }
        }

        private CodeExpression GenerateExpressionInternal(Dataflow.FieldReference expression)
        {
            var result = new CodeVariableReferenceExpression(expression.Field);
            Stack<IType> symbol;
            if (symbolTable.TryGetValue(expression.Field, out symbol))
            {
                result.UserData["type"] = symbol.Peek();
            }
            return result;
        }

        private CodeExpression Truish(CodeExpression original)
        {
            return new CodeMethodInvokeExpression(new CodeTypeReferenceExpression("Program"), "IsTruish", original);
        }
    }
}
