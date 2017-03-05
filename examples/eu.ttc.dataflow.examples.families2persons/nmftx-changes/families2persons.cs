using NMF.Models;
using NMF.Models.Repository;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using System.Collections.Generic;
using TTC2016.LiveContest;
namespace Families2persons
{
    public class Program
    {
        static void Main(string[] args)
        {
            ModelRepository repository = new ModelRepository();
            Model familiesModel = repository.Resolve(args[0]);
            Model personsModel = new Model();
            Dataflow flow = new Dataflow();
            var computeFullNameFunc = ObservingFunc<ChangeAwareDictionary<string, object>, object>.FromExpression(row => ((((Families.IMember)row["member"]).FirstName + " ") + ((Families.IFamily)((Families.IMember)row["member"]).Parent).LastName));
            var allMembers = new DataflowNode(source =>
               source.SelectMany(row => familiesModel.Descendants().OfType<Families.IMember>(),
                                 (row, _member) => row.With("member", _member)));
            var computeFullName = new DataflowNode(source =>
                source.Select(row => row.With("fullName", computeFullNameFunc.Observe(row)))); 
            var splitByGender = new DataflowNode(source =>
                source.Where(row => (Dataflow.IsTruish(((Families.IMember)row["member"]).FamilyMother) || Dataflow.IsTruish(((Families.IMember)row["member"]).FamilyDaughter)))); 
            var splitByGenderReject = new DataflowNode(source =>
                source.Where(row => !(Dataflow.IsTruish(((Families.IMember)row["member"]).FamilyMother) || Dataflow.IsTruish(((Families.IMember)row["member"]).FamilyDaughter)))); 
            var newMale = new DataflowNode(source =>
                flow.NewInstance<Persons.Male>(source, "person", personsModel, row => ((Families.IMember)row["member"])));
            var newFemale = new DataflowNode(source =>
                flow.NewInstance<Persons.Female>(source, "person", personsModel, row => ((Families.IMember)row["member"])));
            var setPersonName = new DataflowNode(source =>
                Dataflow.SetField(source, row => ((System.String)row["fullName"]), (row, value) => ((Persons.IPerson)row["person"]).FullName = value)); 

            allMembers.AddTarget(computeFullName);
            computeFullName.AddTarget(splitByGender);
            computeFullName.AddTarget(splitByGenderReject);
            splitByGender.AddTarget(newFemale);
            splitByGenderReject.AddTarget(newMale);
            newMale.AddTarget(setPersonName);
            newFemale.AddTarget(setPersonName);

            setPersonName.Execute(true);

            var stopwatch = new System.Diagnostics.Stopwatch();
            stopwatch.Start();
            setPersonName.Execute(true);
            stopwatch.Stop();
            System.Console.WriteLine("Initial transformation in {0}ms", stopwatch.ElapsedMilliseconds);

            var nChanges = System.Int32.Parse(args[2]);
            var pathChangedSource = args[3];
            GenerateChanges(familiesModel, nChanges);
            repository.Save(familiesModel, pathChangedSource);
            repository.Save(personsModel, args[1]);
        }

        private static void GenerateChanges(Model familiesModel, int n)
        {
            var stopwatch = new System.Diagnostics.Stopwatch();
            stopwatch.Start();
            var rand = new System.Random();
            for (int i = 0; i < n; i++)
            {
                var dice = rand.NextDouble();
                if (dice < 0.2)
                {
                    // change the name of a random family
                    var family = familiesModel.RootElements[rand.Next(familiesModel.RootElements.Count)] as Families.Family;
                    family.LastName = family.LastName + "-Smith";
                }
                else if (dice < 0.6)
                {
                    // rename an arbitrary family member
                    var family = familiesModel.RootElements[rand.Next(familiesModel.RootElements.Count)] as Families.Family;
                    var familyDice = rand.NextDouble();
                    if (familyDice < 0.2 && family.Father != null)
                    {
                        family.Father.FirstName += "son";
                    }
                    else if (familyDice < 0.4 && family.Mother != null)
                    {
                        family.Mother.FirstName += "daughter";
                    }
                    else if (familyDice < 0.7 && family.Daughters.Count > 0)
                    {
                        family.Daughters.FirstOrDefault().FirstName += "daugher";
                    }
                    else if (family.Sons.Count > 0)
                    {
                        family.Sons.FirstOrDefault().FirstName += "son";
                    }
                    else if (family.Children != null && family.Children.OfType<Families.Member>().FirstOrDefault() != null)
                    {
                        family.Children.OfType<Families.Member>().FirstOrDefault().FirstName += "guy";
                    }
                }
                else if (dice < 0.8)
                {
                    // remove an arbitrary family
                    familiesModel.RootElements.RemoveAt(rand.Next(familiesModel.RootElements.Count));
                }
                else
                {
                    var family = new Families.Family
                    {
                        LastName = "Simpson",
                        Father = new Families.Member
                        {
                            FirstName = "Homer"
                        },
                        Mother = new Families.Member
                        {
                            FirstName = "Marge"
                        }
                    };
                    family.Sons.Add(new Families.Member() { FirstName = "Bart" });
                    family.Daughters.Add(new Families.Member() { FirstName = "Lisa" });
                    family.Daughters.Add(new Families.Member() { FirstName = "Maggie" });
                    familiesModel.RootElements.Add(family);
                }
            }
            stopwatch.Stop();
            System.Console.WriteLine("Propagated {0} changes in {1}ms", n, stopwatch.ElapsedMilliseconds);
        }
    }
}
