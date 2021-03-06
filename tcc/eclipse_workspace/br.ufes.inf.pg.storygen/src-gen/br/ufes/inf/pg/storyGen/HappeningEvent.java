/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.storyGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Happening Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.pg.storyGen.HappeningEvent#isOpening <em>Opening</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.HappeningEvent#isEnding <em>Ending</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getHappeningEvent()
 * @model
 * @generated
 */
public interface HappeningEvent extends Event
{
  /**
   * Returns the value of the '<em><b>Opening</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opening</em>' attribute.
   * @see #setOpening(boolean)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getHappeningEvent_Opening()
   * @model
   * @generated
   */
  boolean isOpening();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.HappeningEvent#isOpening <em>Opening</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opening</em>' attribute.
   * @see #isOpening()
   * @generated
   */
  void setOpening(boolean value);

  /**
   * Returns the value of the '<em><b>Ending</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ending</em>' attribute.
   * @see #setEnding(boolean)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getHappeningEvent_Ending()
   * @model
   * @generated
   */
  boolean isEnding();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.HappeningEvent#isEnding <em>Ending</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ending</em>' attribute.
   * @see #isEnding()
   * @generated
   */
  void setEnding(boolean value);

} // HappeningEvent
