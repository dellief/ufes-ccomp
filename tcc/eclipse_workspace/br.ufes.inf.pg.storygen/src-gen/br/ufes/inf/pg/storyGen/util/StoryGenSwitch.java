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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.pg.storyGen.StoryGenPackage
 * @generated
 */
public class StoryGenSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StoryGenPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoryGenSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = StoryGenPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case StoryGenPackage.STORY:
      {
        Story story = (Story)theEObject;
        T result = caseStory(story);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.STORY_DATA:
      {
        StoryData storyData = (StoryData)theEObject;
        T result = caseStoryData(storyData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.SPACE:
      {
        Space space = (Space)theEObject;
        T result = caseSpace(space);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.PLOT:
      {
        Plot plot = (Plot)theEObject;
        T result = casePlot(plot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.EXISTENT:
      {
        Existent existent = (Existent)theEObject;
        T result = caseExistent(existent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = caseExistent(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.OBJECT:
      {
        br.ufes.inf.pg.storyGen.Object object = (br.ufes.inf.pg.storyGen.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = caseExistent(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.FACT_ATTRIBUTE:
      {
        FactAttribute factAttribute = (FactAttribute)theEObject;
        T result = caseFactAttribute(factAttribute);
        if (result == null) result = caseAttribute(factAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.QUANTITY_ATTRIBUTE:
      {
        QuantityAttribute quantityAttribute = (QuantityAttribute)theEObject;
        T result = caseQuantityAttribute(quantityAttribute);
        if (result == null) result = caseAttribute(quantityAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.ATTRIBUTE_SETTING:
      {
        AttributeSetting attributeSetting = (AttributeSetting)theEObject;
        T result = caseAttributeSetting(attributeSetting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.HAPPENING_EVENT:
      {
        HappeningEvent happeningEvent = (HappeningEvent)theEObject;
        T result = caseHappeningEvent(happeningEvent);
        if (result == null) result = caseEvent(happeningEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.ACTION_EVENT:
      {
        ActionEvent actionEvent = (ActionEvent)theEObject;
        T result = caseActionEvent(actionEvent);
        if (result == null) result = caseEvent(actionEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.EXPRESSION_CONDITION:
      {
        ExpressionCondition expressionCondition = (ExpressionCondition)theEObject;
        T result = caseExpressionCondition(expressionCondition);
        if (result == null) result = caseCondition(expressionCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.ORDER_CONDITION:
      {
        OrderCondition orderCondition = (OrderCondition)theEObject;
        T result = caseOrderCondition(orderCondition);
        if (result == null) result = caseCondition(orderCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.TRIGGER_CONDITION:
      {
        TriggerCondition triggerCondition = (TriggerCondition)theEObject;
        T result = caseTriggerCondition(triggerCondition);
        if (result == null) result = caseCondition(triggerCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.CHANGE:
      {
        Change change = (Change)theEObject;
        T result = caseChange(change);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.EXISTENT_CHANGE:
      {
        ExistentChange existentChange = (ExistentChange)theEObject;
        T result = caseExistentChange(existentChange);
        if (result == null) result = caseChange(existentChange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.STORY_DATA_CHANGE:
      {
        StoryDataChange storyDataChange = (StoryDataChange)theEObject;
        T result = caseStoryDataChange(storyDataChange);
        if (result == null) result = caseChange(storyDataChange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = caseExpression(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.EXISTENT_ATTRIBUTE_TERM:
      {
        ExistentAttributeTerm existentAttributeTerm = (ExistentAttributeTerm)theEObject;
        T result = caseExistentAttributeTerm(existentAttributeTerm);
        if (result == null) result = caseTerm(existentAttributeTerm);
        if (result == null) result = caseExpression(existentAttributeTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.STORY_ATTRIBUTE_TERM:
      {
        StoryAttributeTerm storyAttributeTerm = (StoryAttributeTerm)theEObject;
        T result = caseStoryAttributeTerm(storyAttributeTerm);
        if (result == null) result = caseTerm(storyAttributeTerm);
        if (result == null) result = caseExpression(storyAttributeTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.INTEGER_TERM:
      {
        IntegerTerm integerTerm = (IntegerTerm)theEObject;
        T result = caseIntegerTerm(integerTerm);
        if (result == null) result = caseTerm(integerTerm);
        if (result == null) result = caseExpression(integerTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.BOOLEAN_TERM:
      {
        BooleanTerm booleanTerm = (BooleanTerm)theEObject;
        T result = caseBooleanTerm(booleanTerm);
        if (result == null) result = caseTerm(booleanTerm);
        if (result == null) result = caseExpression(booleanTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.COMPARISON_EXPRESSION:
      {
        ComparisonExpression comparisonExpression = (ComparisonExpression)theEObject;
        T result = caseComparisonExpression(comparisonExpression);
        if (result == null) result = caseExpression(comparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StoryGenPackage.NEGATION_EXPRESSION:
      {
        NegationExpression negationExpression = (NegationExpression)theEObject;
        T result = caseNegationExpression(negationExpression);
        if (result == null) result = caseExpression(negationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Story</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Story</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStory(Story object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Story Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Story Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoryData(StoryData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpace(Space object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlot(Plot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Existent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Existent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistent(Existent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(br.ufes.inf.pg.storyGen.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fact Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fact Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactAttribute(FactAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantity Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantity Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantityAttribute(QuantityAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Setting</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Setting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeSetting(AttributeSetting object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Happening Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Happening Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHappeningEvent(HappeningEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionEvent(ActionEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionCondition(ExpressionCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderCondition(OrderCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriggerCondition(TriggerCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChange(Change object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Existent Change</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Existent Change</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistentChange(ExistentChange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Story Data Change</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Story Data Change</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoryDataChange(StoryDataChange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Existent Attribute Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Existent Attribute Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistentAttributeTerm(ExistentAttributeTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Story Attribute Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Story Attribute Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoryAttributeTerm(StoryAttributeTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerTerm(IntegerTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanTerm(BooleanTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonExpression(ComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegationExpression(NegationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //StoryGenSwitch
