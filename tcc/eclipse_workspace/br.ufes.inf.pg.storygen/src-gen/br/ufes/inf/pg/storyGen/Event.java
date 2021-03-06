/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.storyGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.pg.storyGen.Event#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Event#getPriority <em>Priority</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Event#getDescription <em>Description</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Event#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Event#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Event#getMayTriggers <em>May Triggers</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Event#getConditions <em>Conditions</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Event#getChanges <em>Changes</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufes.inf.pg.storyGen.EventPriority}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see br.ufes.inf.pg.storyGen.EventPriority
   * @see #setPriority(EventPriority)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent_Priority()
   * @model
   * @generated
   */
  EventPriority getPriority();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Event#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see br.ufes.inf.pg.storyGen.EventPriority
   * @see #getPriority()
   * @generated
   */
  void setPriority(EventPriority value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Event#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Short Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Description</em>' attribute.
   * @see #setShortDescription(String)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent_ShortDescription()
   * @model
   * @generated
   */
  String getShortDescription();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Event#getShortDescription <em>Short Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Description</em>' attribute.
   * @see #getShortDescription()
   * @generated
   */
  void setShortDescription(String value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' reference.
   * @see #setTrigger(Event)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent_Trigger()
   * @model
   * @generated
   */
  Event getTrigger();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Event#getTrigger <em>Trigger</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Event value);

  /**
   * Returns the value of the '<em><b>May Triggers</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.pg.storyGen.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>May Triggers</em>' reference list.
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent_MayTriggers()
   * @model
   * @generated
   */
  EList<Event> getMayTriggers();

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.pg.storyGen.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

  /**
   * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.pg.storyGen.Change}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Changes</em>' containment reference list.
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getEvent_Changes()
   * @model containment="true"
   * @generated
   */
  EList<Change> getChanges();

} // Event
