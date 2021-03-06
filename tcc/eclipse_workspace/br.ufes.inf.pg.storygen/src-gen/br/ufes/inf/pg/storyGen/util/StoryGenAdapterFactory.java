/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.storyGen.util;

import br.ufes.inf.pg.storyGen.ActionEvent;
import br.ufes.inf.pg.storyGen.Actor;
import br.ufes.inf.pg.storyGen.AndExpression;
import br.ufes.inf.pg.storyGen.Attribute;
import br.ufes.inf.pg.storyGen.AttributeSetting;
import br.ufes.inf.pg.storyGen.BooleanTerm;
import br.ufes.inf.pg.storyGen.Change;
import br.ufes.inf.pg.storyGen.ComparisonExpression;
import br.ufes.inf.pg.storyGen.Condition;
import br.ufes.inf.pg.storyGen.Event;
import br.ufes.inf.pg.storyGen.Existent;
import br.ufes.inf.pg.storyGen.ExistentAttributeTerm;
import br.ufes.inf.pg.storyGen.ExistentChange;
import br.ufes.inf.pg.storyGen.Expression;
import br.ufes.inf.pg.storyGen.ExpressionCondition;
import br.ufes.inf.pg.storyGen.FactAttribute;
import br.ufes.inf.pg.storyGen.HappeningEvent;
import br.ufes.inf.pg.storyGen.IntegerTerm;
import br.ufes.inf.pg.storyGen.NegationExpression;
import br.ufes.inf.pg.storyGen.OrExpression;
import br.ufes.inf.pg.storyGen.OrderCondition;
import br.ufes.inf.pg.storyGen.Plot;
import br.ufes.inf.pg.storyGen.QuantityAttribute;
import br.ufes.inf.pg.storyGen.Space;
import br.ufes.inf.pg.storyGen.Story;
import br.ufes.inf.pg.storyGen.StoryAttributeTerm;
import br.ufes.inf.pg.storyGen.StoryData;
import br.ufes.inf.pg.storyGen.StoryDataChange;
import br.ufes.inf.pg.storyGen.StoryGenPackage;
import br.ufes.inf.pg.storyGen.Term;
import br.ufes.inf.pg.storyGen.TriggerCondition;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.pg.storyGen.StoryGenPackage
 * @generated
 */
public class StoryGenAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StoryGenPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoryGenAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StoryGenPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StoryGenSwitch<Adapter> modelSwitch =
    new StoryGenSwitch<Adapter>()
    {
      @Override
      public Adapter caseStory(Story object)
      {
        return createStoryAdapter();
      }
      @Override
      public Adapter caseStoryData(StoryData object)
      {
        return createStoryDataAdapter();
      }
      @Override
      public Adapter caseSpace(Space object)
      {
        return createSpaceAdapter();
      }
      @Override
      public Adapter casePlot(Plot object)
      {
        return createPlotAdapter();
      }
      @Override
      public Adapter caseExistent(Existent object)
      {
        return createExistentAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseObject(br.ufes.inf.pg.storyGen.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseFactAttribute(FactAttribute object)
      {
        return createFactAttributeAdapter();
      }
      @Override
      public Adapter caseQuantityAttribute(QuantityAttribute object)
      {
        return createQuantityAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeSetting(AttributeSetting object)
      {
        return createAttributeSettingAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseHappeningEvent(HappeningEvent object)
      {
        return createHappeningEventAdapter();
      }
      @Override
      public Adapter caseActionEvent(ActionEvent object)
      {
        return createActionEventAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseExpressionCondition(ExpressionCondition object)
      {
        return createExpressionConditionAdapter();
      }
      @Override
      public Adapter caseOrderCondition(OrderCondition object)
      {
        return createOrderConditionAdapter();
      }
      @Override
      public Adapter caseTriggerCondition(TriggerCondition object)
      {
        return createTriggerConditionAdapter();
      }
      @Override
      public Adapter caseChange(Change object)
      {
        return createChangeAdapter();
      }
      @Override
      public Adapter caseExistentChange(ExistentChange object)
      {
        return createExistentChangeAdapter();
      }
      @Override
      public Adapter caseStoryDataChange(StoryDataChange object)
      {
        return createStoryDataChangeAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseExistentAttributeTerm(ExistentAttributeTerm object)
      {
        return createExistentAttributeTermAdapter();
      }
      @Override
      public Adapter caseStoryAttributeTerm(StoryAttributeTerm object)
      {
        return createStoryAttributeTermAdapter();
      }
      @Override
      public Adapter caseIntegerTerm(IntegerTerm object)
      {
        return createIntegerTermAdapter();
      }
      @Override
      public Adapter caseBooleanTerm(BooleanTerm object)
      {
        return createBooleanTermAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseComparisonExpression(ComparisonExpression object)
      {
        return createComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseNegationExpression(NegationExpression object)
      {
        return createNegationExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Story <em>Story</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Story
   * @generated
   */
  public Adapter createStoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.StoryData <em>Story Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.StoryData
   * @generated
   */
  public Adapter createStoryDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Space <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Space
   * @generated
   */
  public Adapter createSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Plot <em>Plot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Plot
   * @generated
   */
  public Adapter createPlotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Existent <em>Existent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Existent
   * @generated
   */
  public Adapter createExistentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.FactAttribute <em>Fact Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.FactAttribute
   * @generated
   */
  public Adapter createFactAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.QuantityAttribute <em>Quantity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.QuantityAttribute
   * @generated
   */
  public Adapter createQuantityAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.AttributeSetting <em>Attribute Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.AttributeSetting
   * @generated
   */
  public Adapter createAttributeSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.HappeningEvent <em>Happening Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.HappeningEvent
   * @generated
   */
  public Adapter createHappeningEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.ActionEvent <em>Action Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.ActionEvent
   * @generated
   */
  public Adapter createActionEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.ExpressionCondition <em>Expression Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.ExpressionCondition
   * @generated
   */
  public Adapter createExpressionConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.OrderCondition <em>Order Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.OrderCondition
   * @generated
   */
  public Adapter createOrderConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.TriggerCondition <em>Trigger Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.TriggerCondition
   * @generated
   */
  public Adapter createTriggerConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Change <em>Change</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Change
   * @generated
   */
  public Adapter createChangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.ExistentChange <em>Existent Change</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.ExistentChange
   * @generated
   */
  public Adapter createExistentChangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.StoryDataChange <em>Story Data Change</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.StoryDataChange
   * @generated
   */
  public Adapter createStoryDataChangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.ExistentAttributeTerm <em>Existent Attribute Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.ExistentAttributeTerm
   * @generated
   */
  public Adapter createExistentAttributeTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.StoryAttributeTerm <em>Story Attribute Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.StoryAttributeTerm
   * @generated
   */
  public Adapter createStoryAttributeTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.IntegerTerm <em>Integer Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.IntegerTerm
   * @generated
   */
  public Adapter createIntegerTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.BooleanTerm <em>Boolean Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.BooleanTerm
   * @generated
   */
  public Adapter createBooleanTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.ComparisonExpression <em>Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.ComparisonExpression
   * @generated
   */
  public Adapter createComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.pg.storyGen.NegationExpression <em>Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.pg.storyGen.NegationExpression
   * @generated
   */
  public Adapter createNegationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //StoryGenAdapterFactory
