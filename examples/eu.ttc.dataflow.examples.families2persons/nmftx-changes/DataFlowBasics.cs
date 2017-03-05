using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Linq;
using System.Linq.Expressions;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;

namespace TTC2016.LiveContest
{

    public class Dataflow
    {
        private Dictionary<TraceEntry, ItemMultiplicity> trace = new Dictionary<TraceEntry, ItemMultiplicity>();

        public static bool IsTruish(object obj)
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
        }

        public static void IterateAll(IEnumerableExpression<ChangeAwareDictionary<string, object>> rows, bool incremental)
        {
            if (!incremental)
            {
                foreach (var item in rows)
                {
                    Console.Write(".");
                }
            }
            else
            {
                var notifier = rows.AsNotifiable();
                foreach (var item in rows)
                {
                    Console.Write(".");
                }
                notifier.CollectionChanged += (o, e) =>
                {
                    if (e.NewItems != null)
                    {
                        foreach (var item in e.NewItems)
                        {
                            Console.Write(".");
                        }
                    }
                    if (e.OldItems != null)
                    {
                        foreach (var item in e.OldItems)
                        {
                            Console.Write("-");
                        }
                    }
                };
            }
        }

        internal T CreateTraceEntry<T>(Model model, object key) where T : IModelElement, new()
        {
            ItemMultiplicity traced;
            T tracedCasted;
            TraceEntry entry = new TraceEntry(key, typeof(T));
            if (!trace.TryGetValue(entry, out traced))
            {
                tracedCasted = new T();
                traced = new ItemMultiplicity(tracedCasted);
                traced.Increase();
                model.RootElements.Add(tracedCasted);
                trace.Add(entry, traced);
            }
            else
            {
                tracedCasted = (T)traced.Element;
            }
            return tracedCasted;
        }

        internal void RevokeTraceEntry<T>(object key)
        {
            ItemMultiplicity traced;
            TraceEntry tKey = new TraceEntry(key, typeof(T));
            if (trace.TryGetValue(tKey, out traced))
            {
                if (!traced.Decrease())
                {
                    trace.Remove(tKey);
                    traced.Element.Delete();
                }
            }
        }

        private struct TraceEntry : IEquatable<TraceEntry>
        {
            public object Element { get; set; }
            public Type Type { get; set; }

            public TraceEntry(object element, Type type) : this()
            {
                Element = element;
                Type = type;
            }

            public override bool Equals(object obj)
            {
                if (obj is TraceEntry)
                {
                    return Equals((TraceEntry)obj);
                }
                else
                {
                    return false;
                }
            }

            public bool Equals(TraceEntry other)
            {
                return Element == other.Element && Type == other.Type;
            }

            public override int GetHashCode()
            {
                var hash = 0;
                if (Element != null) hash ^= Element.GetHashCode();
                if (Type != null) hash ^= Type.GetHashCode();
                return hash;
            }
        }

        private class ItemMultiplicity
        {
            public IModelElement Element { get; set; }
            public int Count { get; private set; }

            public ItemMultiplicity(IModelElement element)
            {
                Element = element;
            }

            public void Increase()
            {
                Count++;
            }

            public bool Decrease()
            {
                return --Count > 0;
            }
        }

        public static SetField<TValue> SetField<TValue>(IEnumerableExpression<ChangeAwareDictionary<string, object>> source, Expression<Func<ChangeAwareDictionary<string, object>, TValue>> func, Action<ChangeAwareDictionary<string, object>, TValue> setter)
        {
            return new SetField<TValue>(source, func, setter);
        }

        public static AddToCollection<TValue> AddToCollection<TValue>(IEnumerableExpression<ChangeAwareDictionary<string, object>> source, Expression<Func<ChangeAwareDictionary<string, object>, TValue>> func, Func<ChangeAwareDictionary<string, object>, ICollection<TValue>> setter)
        {
            return new AddToCollection<TValue>(source, func, setter);
        }

        public NewInstance<T> NewInstance<T>(IEnumerableExpression<ChangeAwareDictionary<string, object>> source, string field, Model model, Expression<Func<ChangeAwareDictionary<string, object>, object>> keySelector) where T : IModelElement, new()
        {
            return new NewInstance<T>(source, this, model, field, keySelector);
        }
    }

    public static class DataflowExtensions
    {
        public static ChangeAwareDictionary<string, object> With(this ChangeAwareDictionary<string, object> current, string key, INotifyValue<object> newValue)
        {
            var newRow = new ChangeAwareDictionary<string, object>(current);
            var val = newRow.AsNotifiable(key);
            val.Value = newValue.Value;
            newValue.ValueChanged += (o, e) => val.Value = newValue.Value;
            return newRow;
        }

        public static ChangeAwareDictionary<string, object> With(this ChangeAwareDictionary<string, object> current, string key, object newValue)
        {
            var newRow = new ChangeAwareDictionary<string, object>(current);
            newRow[key] = newValue;
            return newRow;
        }
    }

    public class NewInstance<T> : IEnumerableExpression<ChangeAwareDictionary<string, object>> where T : IModelElement, new()
    {
        public IEnumerableExpression<ChangeAwareDictionary<string, object>> Source { get; private set; }
        public Model Model { get; set; }
        public string Field { get; set; }
        public Dataflow Dataflow { get; set; }
        public ObservingFunc<ChangeAwareDictionary<string, object>, object> KeySelector { get; set; }

        public NewInstance(IEnumerableExpression<ChangeAwareDictionary<string, object>> source, Dataflow dataflow, Model model, string field, ObservingFunc<ChangeAwareDictionary<string, object>, object> keySelector)
        {
            Source = source;
            Dataflow = dataflow;
            Model = model;
            Field = field;
            KeySelector = keySelector;
        }

        public INotifyEnumerable<ChangeAwareDictionary<string, object>> AsNotifiable()
        {
            return new Notifiable(Source.AsNotifiable(), Model, Field, Dataflow, KeySelector);
        }

        public IEnumerator<ChangeAwareDictionary<string, object>> GetEnumerator()
        {
            foreach (var row in Source)
            {
                row[Field] = Dataflow.CreateTraceEntry<T>(Model, KeySelector.Evaluate(row));
                yield return row;
            }
        }

        INotifyEnumerable IEnumerableExpression.AsNotifiable()
        {
            return AsNotifiable();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return GetEnumerator();
        }

        private class Notifiable : INotifyEnumerable<ChangeAwareDictionary<string, object>>
        {
            public INotifyEnumerable<ChangeAwareDictionary<string, object>> Source { get; private set; }
            public Model Model { get; set; }
            public string Field { get; set; }
            public Dataflow Dataflow { get; set; }
            public ObservingFunc<ChangeAwareDictionary<string, object>, object> KeySelector { get; set; }
            private Dictionary<ChangeAwareDictionary<string, object>, INotifyValue<object>> dict = new Dictionary<ChangeAwareDictionary<string, object>, INotifyValue<object>>();

            public Notifiable(INotifyEnumerable<ChangeAwareDictionary<string, object>> source, Model model, string field, Dataflow dataflow, ObservingFunc<ChangeAwareDictionary<string, object>, object> keySelector)
            {
                Source = source;
                Model = model;
                Field = field;
                Dataflow = dataflow;
                KeySelector = keySelector;

                Source.CollectionChanged += SourceCollectionChanged;

                if (Source.IsAttached)
                {
                    AttachItems(Source);
                }
            }

            private void AttachItems(IEnumerable<ChangeAwareDictionary<string, object>> items)
            {
                foreach (var item in items)
                {
                    INotifyValue<object> keyTracker;
                    if (!dict.TryGetValue(item, out keyTracker))
                    {
                        keyTracker = KeySelector.Observe(item);
                        dict.Add(item, keyTracker);
                        keyTracker.ValueChanged += (o, e) =>
                        {
                            Dataflow.RevokeTraceEntry<T>(e.OldValue);
                            item[Field] = Dataflow.CreateTraceEntry<T>(Model, e.NewValue);
                        };
                    }
                    keyTracker.Attach();
                    item[Field] = Dataflow.CreateTraceEntry<T>(Model, keyTracker.Value);
                }
            }

            private void DetachItems(IEnumerable<ChangeAwareDictionary<string, object>> items)
            {
                foreach (var item in items)
                {
                    INotifyValue<object> keyTracker;
                    if (dict.TryGetValue(item, out keyTracker))
                    {
                        Dataflow.RevokeTraceEntry<T>(keyTracker.Value);
                        keyTracker.Detach();
                    }
                }
            }

            private void SourceCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
            {
                if (e.Action == NotifyCollectionChangedAction.Reset)
                {
                    foreach (var item in dict.Values)
                    {
                        item.Detach();
                    }
                    dict.Clear();
                    AttachItems(Source);
                    return;
                }
                if (e.OldItems != null) DetachItems(e.OldItems.Cast<ChangeAwareDictionary<string, object>>());
                if (e.NewItems != null) AttachItems(e.NewItems.Cast<ChangeAwareDictionary<string, object>>());
                CollectionChanged?.Invoke(this, e);
            }

            public bool IsAttached
            {
                get
                {
                    return Source.IsAttached;
                }
            }

            public event NotifyCollectionChangedEventHandler CollectionChanged;

            public void Attach()
            {
                Source.Attach();
                AttachItems(Source);
            }

            public void Detach()
            {
                DetachItems(Source);
                Source.Detach();
            }

            public IEnumerator<ChangeAwareDictionary<string, object>> GetEnumerator()
            {
                return Source.GetEnumerator();
            }

            IEnumerator IEnumerable.GetEnumerator()
            {
                return GetEnumerator();
            }
        }
    }

    public class SetField<TValue> : IEnumerableExpression<ChangeAwareDictionary<string, object>>
    {
        public IEnumerableExpression<ChangeAwareDictionary<string, object>> Source { get; private set; }
        public ObservingFunc<ChangeAwareDictionary<string, object>, TValue> Func { get; private set; }
        public Action<ChangeAwareDictionary<string, object>, TValue> Setter { get; private set; }

        public SetField(IEnumerableExpression<ChangeAwareDictionary<string, object>> source, Expression<Func<ChangeAwareDictionary<string, object>, TValue>> func, Action<ChangeAwareDictionary<string, object>, TValue> setter)
        {
            Source = source;
            Func = Observable.Func(func);
            Setter = setter;
        }

        public INotifyEnumerable<ChangeAwareDictionary<string, object>> AsNotifiable()
        {
            return new Notifiable(Source.AsNotifiable(), Func, Setter);
        }

        private IEnumerable<ChangeAwareDictionary<string, object>> ItemsInternal
        {
            get
            {
                foreach (var row in Source)
                {
                    Setter(row, Func.Evaluate(row));
                    yield return row;
                }
            }
        }

        public IEnumerator<ChangeAwareDictionary<string, object>> GetEnumerator()
        {
            return ItemsInternal.GetEnumerator();
        }

        INotifyEnumerable IEnumerableExpression.AsNotifiable()
        {
            return AsNotifiable();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return GetEnumerator();
        }

        private class Notifiable : INotifyEnumerable<ChangeAwareDictionary<string, object>>
        {
            public INotifyEnumerable<ChangeAwareDictionary<string, object>> Source { get; private set; }
            public ObservingFunc<ChangeAwareDictionary<string, object>, TValue> Func { get; private set; }
            public Action<ChangeAwareDictionary<string, object>, TValue> Setter { get; private set; }
            private Dictionary<ChangeAwareDictionary<string, object>, INotifyValue<TValue>> dict = new Dictionary<ChangeAwareDictionary<string, object>, INotifyValue<TValue>>();

            public Notifiable(INotifyEnumerable<ChangeAwareDictionary<string, object>> source, ObservingFunc<ChangeAwareDictionary<string, object>, TValue> func, Action<ChangeAwareDictionary<string, object>, TValue> setter)
            {
                Source = source;
                Func = func;
                Setter = setter;

                Source.CollectionChanged += SourceCollectionChanged;

                if (Source.IsAttached)
                {
                    AttachItems(Source);
                }
            }

            private void AttachItems(IEnumerable<ChangeAwareDictionary<string, object>> items)
            {
                foreach (var item in items)
                {
                    INotifyValue<TValue> valueTracker;
                    if (!dict.TryGetValue(item, out valueTracker))
                    {
                        valueTracker = Func.Observe(item);
                        dict.Add(item, valueTracker);
                        valueTracker.ValueChanged += (o, e) => Setter(item, valueTracker.Value);
                    }
                    if (!valueTracker.IsAttached) valueTracker.Attach();
                    Setter(item, valueTracker.Value);
                }
            }

            private void DetachItems(IEnumerable<ChangeAwareDictionary<string, object>> items)
            {
                foreach (var item in items)
                {
                    INotifyValue<TValue> valueTracker;
                    if (dict.TryGetValue(item, out valueTracker))
                    {
                        valueTracker.Detach();
                    }
                }
            }

            private void SourceCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
            {
                if (e.Action == NotifyCollectionChangedAction.Reset)
                {
                    foreach (var item in dict.Values)
                    {
                        item.Detach();
                    }
                    dict.Clear();
                    AttachItems(Source);
                    return;
                }
                if (e.OldItems != null) DetachItems(e.OldItems.Cast<ChangeAwareDictionary<string, object>>());
                if (e.NewItems != null) AttachItems(e.NewItems.Cast<ChangeAwareDictionary<string, object>>());
                CollectionChanged?.Invoke(this, e);
            }

            public bool IsAttached
            {
                get
                {
                    return Source.IsAttached;
                }
            }

            public event NotifyCollectionChangedEventHandler CollectionChanged;

            public void Attach()
            {
                Source.Attach();
                AttachItems(Source);
            }

            public void Detach()
            {
                DetachItems(Source);
                Source.Detach();
            }

            public IEnumerator<ChangeAwareDictionary<string, object>> GetEnumerator()
            {
                return Source.GetEnumerator();
            }

            IEnumerator IEnumerable.GetEnumerator()
            {
                return GetEnumerator();
            }
        }
    }

    public class AddToCollection<TValue> : IEnumerableExpression<ChangeAwareDictionary<string, object>>
    {
        public IEnumerableExpression<ChangeAwareDictionary<string, object>> Source { get; private set; }
        public ObservingFunc<ChangeAwareDictionary<string, object>, TValue> Func { get; private set; }
        public Func<ChangeAwareDictionary<string, object>, ICollection<TValue>> CollectionGetter { get; private set; }

        public AddToCollection(IEnumerableExpression<ChangeAwareDictionary<string, object>> source, Expression<Func<ChangeAwareDictionary<string, object>, TValue>> func, Func<ChangeAwareDictionary<string, object>, ICollection<TValue>> collectionGetter)
        {
            Source = source;
            Func = Observable.Func(func);
            CollectionGetter = collectionGetter;
        }

        public INotifyEnumerable<ChangeAwareDictionary<string, object>> AsNotifiable()
        {
            return new Notifiable(Source.AsNotifiable(), Func, CollectionGetter);
        }

        private IEnumerable<ChangeAwareDictionary<string, object>> ItemsInternal
        {
            get
            {
                foreach (var row in Source)
                {
                    CollectionGetter(row).Add(Func.Evaluate(row));
                    yield return row;
                }
            }
        }

        public IEnumerator<ChangeAwareDictionary<string, object>> GetEnumerator()
        {
            return ItemsInternal.GetEnumerator();
        }

        INotifyEnumerable IEnumerableExpression.AsNotifiable()
        {
            return AsNotifiable();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return GetEnumerator();
        }

        private class Notifiable : INotifyEnumerable<ChangeAwareDictionary<string, object>>
        {
            public INotifyEnumerable<ChangeAwareDictionary<string, object>> Source { get; private set; }
            public ObservingFunc<ChangeAwareDictionary<string, object>, TValue> Func { get; private set; }
            public Func<ChangeAwareDictionary<string, object>, ICollection<TValue>> CollectionGetter { get; private set; }
            private Dictionary<ChangeAwareDictionary<string, object>, INotifyValue<TValue>> dict = new Dictionary<ChangeAwareDictionary<string, object>, INotifyValue<TValue>>();

            public Notifiable(INotifyEnumerable<ChangeAwareDictionary<string, object>> source, ObservingFunc<ChangeAwareDictionary<string, object>, TValue> func, Func<ChangeAwareDictionary<string, object>, ICollection<TValue>> collectionGetter)
            {
                Source = source;
                Func = func;
                CollectionGetter = collectionGetter;

                Source.CollectionChanged += SourceCollectionChanged;

                if (Source.IsAttached)
                {
                    AttachItems(Source);
                }
            }

            private void AttachItems(IEnumerable<ChangeAwareDictionary<string, object>> items)
            {
                foreach (var item in items)
                {
                    INotifyValue<TValue> valueTracker;
                    if (!dict.TryGetValue(item, out valueTracker))
                    {
                        valueTracker = Func.Observe(item);
                        dict.Add(item, valueTracker);
                        valueTracker.ValueChanged += (o, e) => Process(item, e);
                    }
                    if (!valueTracker.IsAttached) valueTracker.Attach();
                    CollectionGetter(item).Add(valueTracker.Value);
                }
            }

            private void Process(ChangeAwareDictionary<string, object> item, ValueChangedEventArgs e)
            {
                var collection = CollectionGetter(item);
                if (e.OldValue != null) collection.Remove((TValue)e.OldValue);
                if (e.NewValue != null) collection.Add((TValue)e.NewValue);
            }

            private void DetachItems(IEnumerable<ChangeAwareDictionary<string, object>> items)
            {
                foreach (var item in items)
                {
                    INotifyValue<TValue> valueTracker;
                    if (dict.TryGetValue(item, out valueTracker))
                    {
                        CollectionGetter(item).Remove(valueTracker.Value);
                        valueTracker.Detach();
                    }
                }
            }

            private void SourceCollectionChanged(object sender, NotifyCollectionChangedEventArgs e)
            {
                if (e.Action == NotifyCollectionChangedAction.Reset)
                {
                    foreach (var item in dict.Values)
                    {
                        item.Detach();
                    }
                    dict.Clear();
                    AttachItems(Source);
                    return;
                }
                if (e.OldItems != null) DetachItems(e.OldItems.Cast<ChangeAwareDictionary<string, object>>());
                if (e.NewItems != null) AttachItems(e.NewItems.Cast<ChangeAwareDictionary<string, object>>());
                CollectionChanged?.Invoke(this, e);
            }

            public bool IsAttached
            {
                get
                {
                    return Source.IsAttached;
                }
            }

            public event NotifyCollectionChangedEventHandler CollectionChanged;

            public void Attach()
            {
                Source.Attach();
                AttachItems(Source);
            }

            public void Detach()
            {
                DetachItems(Source);
                Source.Detach();
            }

            public IEnumerator<ChangeAwareDictionary<string, object>> GetEnumerator()
            {
                return Source.GetEnumerator();
            }

            IEnumerator IEnumerable.GetEnumerator()
            {
                return GetEnumerator();
            }
        }
    }

    public class DataflowNode
    {
        public Func<IEnumerableExpression<ChangeAwareDictionary<string, object>>, IEnumerableExpression<ChangeAwareDictionary<string, object>>> Func { get; private set; }
        private IEnumerableExpression<ChangeAwareDictionary<string, object>> Enumerable;
        private List<DataflowNode> Sources;

        public DataflowNode(Func<IEnumerableExpression<ChangeAwareDictionary<string, object>>, IEnumerableExpression<ChangeAwareDictionary<string, object>>> func)
        {
            Func = func;
            Sources = new List<DataflowNode>();
        }

        public void AddTarget(DataflowNode target)
        {
            if (target == null) throw new ArgumentNullException("target");

            target.Sources.Add(this);
        }

        public IEnumerableExpression<ChangeAwareDictionary<string, object>> Apply()
        {
            if (Enumerable == null)
            {
                if (Sources.Count == 0)
                {
                    Enumerable = new ObservableList<ChangeAwareDictionary<string, object>>() { new ChangeAwareDictionary<string, object>() };
                }
                else
                {
                    Enumerable = Sources[0].Apply();
                    for (int i = 1; i < Sources.Count; i++)
                    {
                        Enumerable = Enumerable.Concat(Sources[i].Apply());
                    }
                }
                Enumerable = Func(Enumerable);
            }
            return Enumerable;
        }

        public void Execute(bool incremental)
        {
            Dataflow.IterateAll(Apply(), incremental);
        }
    }
}
