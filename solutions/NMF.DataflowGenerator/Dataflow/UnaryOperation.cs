//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2016.LiveContest.Dataflow
{
    
    
    /// <summary>
    /// The default implementation of the UnaryOperation class
    /// </summary>
    [XmlNamespaceAttribute("http://transformation-tool-contest.eu/2016/dataflow")]
    [XmlNamespacePrefixAttribute("df")]
    [ModelRepresentationClassAttribute("http://transformation-tool-contest.eu/2016/dataflow#//UnaryOperation/")]
    public class UnaryOperation : Expression, IUnaryOperation, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Operator property
        /// </summary>
        private Nullable<UnaryOperator> _operator;
        
        /// <summary>
        /// The backing field for the Expression property
        /// </summary>
        private IExpression _expression;
        
        private static IClass _classInstance;
        
        /// <summary>
        /// The operator property
        /// </summary>
        [XmlElementNameAttribute("operator")]
        [XmlAttributeAttribute(true)]
        public virtual Nullable<UnaryOperator> Operator
        {
            get
            {
                return this._operator;
            }
            set
            {
                if ((this._operator != value))
                {
                    Nullable<UnaryOperator> old = this._operator;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnOperatorChanging(e);
                    this.OnPropertyChanging("Operator", e);
                    this._operator = value;
                    this.OnOperatorChanged(e);
                    this.OnPropertyChanged("Operator", e);
                }
            }
        }
        
        /// <summary>
        /// The expression property
        /// </summary>
        [XmlElementNameAttribute("expression")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        public virtual IExpression Expression
        {
            get
            {
                return this._expression;
            }
            set
            {
                if ((this._expression != value))
                {
                    IExpression old = this._expression;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnExpressionChanging(e);
                    this.OnPropertyChanging("Expression", e);
                    this._expression = value;
                    if ((old != null))
                    {
                        old.Parent = null;
                        old.Deleted -= this.OnResetExpression;
                    }
                    if ((value != null))
                    {
                        value.Parent = this;
                        value.Deleted += this.OnResetExpression;
                    }
                    this.OnExpressionChanged(e);
                    this.OnPropertyChanged("Expression", e);
                }
            }
        }
        
        /// <summary>
        /// Gets the child model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> Children
        {
            get
            {
                return base.Children.Concat(new UnaryOperationChildrenCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new UnaryOperationReferencedElementsCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the Class model for this type
        /// </summary>
        public new static IClass ClassInstance
        {
            get
            {
                if ((_classInstance == null))
                {
                    _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://transformation-tool-contest.eu/2016/dataflow#//UnaryOperation/")));
                }
                return _classInstance;
            }
        }
        
        /// <summary>
        /// Gets fired before the Operator property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> OperatorChanging;
        
        /// <summary>
        /// Gets fired when the Operator property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> OperatorChanged;
        
        /// <summary>
        /// Gets fired before the Expression property changes its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ExpressionChanging;
        
        /// <summary>
        /// Gets fired when the Expression property changed its value
        /// </summary>
        public event System.EventHandler<ValueChangedEventArgs> ExpressionChanged;
        
        /// <summary>
        /// Raises the OperatorChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnOperatorChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.OperatorChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the OperatorChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnOperatorChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.OperatorChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ExpressionChanging event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnExpressionChanging(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ExpressionChanging;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ExpressionChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnExpressionChanged(ValueChangedEventArgs eventArgs)
        {
            System.EventHandler<ValueChangedEventArgs> handler = this.ExpressionChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the Expression property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetExpression(object sender, System.EventArgs eventArgs)
        {
            this.Expression = null;
        }
        
        /// <summary>
        /// Gets the relative URI fragment for the given child model element
        /// </summary>
        /// <returns>A fragment of the relative URI</returns>
        /// <param name="element">The element that should be looked for</param>
        protected override string GetRelativePathForNonIdentifiedChild(IModelElement element)
        {
            if ((element == this.Expression))
            {
                return ModelHelper.CreatePath("Expression");
            }
            return base.GetRelativePathForNonIdentifiedChild(element);
        }
        
        /// <summary>
        /// Resolves the given URI to a child model element
        /// </summary>
        /// <returns>The model element or null if it could not be found</returns>
        /// <param name="reference">The requested reference name</param>
        /// <param name="index">The index of this reference</param>
        protected override IModelElement GetModelElementForReference(string reference, int index)
        {
            if ((reference == "EXPRESSION"))
            {
                return this.Expression;
            }
            return base.GetModelElementForReference(reference, index);
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "OPERATOR"))
            {
                return this.Operator;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "EXPRESSION"))
            {
                this.Expression = ((IExpression)(value));
                return;
            }
            if ((feature == "OPERATOR"))
            {
                this.Operator = ((UnaryOperator)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the property expression for the given attribute
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="attribute">The requested attribute in upper case</param>
        protected override NMF.Expressions.INotifyExpression<object> GetExpressionForAttribute(string attribute)
        {
            if ((attribute == "EXPRESSION"))
            {
                return new ExpressionProxy(this);
            }
            return base.GetExpressionForAttribute(attribute);
        }
        
        /// <summary>
        /// Gets the property expression for the given reference
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="reference">The requested reference in upper case</param>
        protected override NMF.Expressions.INotifyExpression<NMF.Models.IModelElement> GetExpressionForReference(string reference)
        {
            if ((reference == "EXPRESSION"))
            {
                return new ExpressionProxy(this);
            }
            return base.GetExpressionForReference(reference);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            if ((_classInstance == null))
            {
                _classInstance = ((IClass)(MetaRepository.Instance.Resolve("http://transformation-tool-contest.eu/2016/dataflow#//UnaryOperation/")));
            }
            return _classInstance;
        }
        
        /// <summary>
        /// The collection class to to represent the children of the UnaryOperation class
        /// </summary>
        public class UnaryOperationChildrenCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private UnaryOperation _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public UnaryOperationChildrenCollection(UnaryOperation parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    if ((this._parent.Expression != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.ExpressionChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.ExpressionChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.Expression == null))
                {
                    IExpression expressionCasted = item.As<IExpression>();
                    if ((expressionCasted != null))
                    {
                        this._parent.Expression = expressionCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Expression = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.Expression))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                if ((this._parent.Expression != null))
                {
                    array[arrayIndex] = this._parent.Expression;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                if ((this._parent.Expression == item))
                {
                    this._parent.Expression = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Expression).GetEnumerator();
            }
        }
        
        /// <summary>
        /// The collection class to to represent the children of the UnaryOperation class
        /// </summary>
        public class UnaryOperationReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private UnaryOperation _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public UnaryOperationReferencedElementsCollection(UnaryOperation parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    if ((this._parent.Expression != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.ExpressionChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.ExpressionChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.Expression == null))
                {
                    IExpression expressionCasted = item.As<IExpression>();
                    if ((expressionCasted != null))
                    {
                        this._parent.Expression = expressionCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Expression = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.Expression))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                if ((this._parent.Expression != null))
                {
                    array[arrayIndex] = this._parent.Expression;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                if ((this._parent.Expression == item))
                {
                    this._parent.Expression = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Expression).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the operator property
        /// </summary>
        private sealed class OperatorProxy : ModelPropertyChange<IUnaryOperation, Nullable<UnaryOperator>>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public OperatorProxy(IUnaryOperation modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override Nullable<UnaryOperator> Value
            {
                get
                {
                    return this.ModelElement.Operator;
                }
                set
                {
                    this.ModelElement.Operator = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.OperatorChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.OperatorChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the expression property
        /// </summary>
        private sealed class ExpressionProxy : ModelPropertyChange<IUnaryOperation, IExpression>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ExpressionProxy(IUnaryOperation modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IExpression Value
            {
                get
                {
                    return this.ModelElement.Expression;
                }
                set
                {
                    this.ModelElement.Expression = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ExpressionChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ExpressionChanged -= handler;
            }
        }
    }
}

