/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.storyGen.util;

import br.ufes.inf.storyGen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.storyGen.StoryGenPackage
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
      public Adapter caseWorld(World object)
      {
        return createWorldAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseBoolExp(BoolExp object)
      {
        return createBoolExpAdapter();
      }
      @Override
      public Adapter caseBinaryBoolExp(BinaryBoolExp object)
      {
        return createBinaryBoolExpAdapter();
      }
      @Override
      public Adapter caseBinaryQntyExp(BinaryQntyExp object)
      {
        return createBinaryQntyExpAdapter();
      }
      @Override
      public Adapter caseUnaryBoolExp(UnaryBoolExp object)
      {
        return createUnaryBoolExpAdapter();
      }
      @Override
      public Adapter caseNegateBoolExp(NegateBoolExp object)
      {
        return createNegateBoolExpAdapter();
      }
      @Override
      public Adapter caseUnaryQuantityExp(UnaryQuantityExp object)
      {
        return createUnaryQuantityExpAdapter();
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
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.Story <em>Story</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.Story
   * @generated
   */
  public Adapter createStoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.World <em>World</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.World
   * @generated
   */
  public Adapter createWorldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.BoolExp <em>Bool Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.BoolExp
   * @generated
   */
  public Adapter createBoolExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.BinaryBoolExp <em>Binary Bool Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.BinaryBoolExp
   * @generated
   */
  public Adapter createBinaryBoolExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.BinaryQntyExp <em>Binary Qnty Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.BinaryQntyExp
   * @generated
   */
  public Adapter createBinaryQntyExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.UnaryBoolExp <em>Unary Bool Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.UnaryBoolExp
   * @generated
   */
  public Adapter createUnaryBoolExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.NegateBoolExp <em>Negate Bool Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.NegateBoolExp
   * @generated
   */
  public Adapter createNegateBoolExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.storyGen.UnaryQuantityExp <em>Unary Quantity Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.storyGen.UnaryQuantityExp
   * @generated
   */
  public Adapter createUnaryQuantityExpAdapter()
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
