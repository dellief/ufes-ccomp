/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.storyGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.pg.storyGen.Actor#isPlayable <em>Playable</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Actor#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Existent
{
  /**
   * Returns the value of the '<em><b>Playable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Playable</em>' attribute.
   * @see #setPlayable(boolean)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getActor_Playable()
   * @model
   * @generated
   */
  boolean isPlayable();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Actor#isPlayable <em>Playable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Playable</em>' attribute.
   * @see #isPlayable()
   * @generated
   */
  void setPlayable(boolean value);

  /**
   * Returns the value of the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Name</em>' attribute.
   * @see #setDisplayName(String)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getActor_DisplayName()
   * @model
   * @generated
   */
  String getDisplayName();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Actor#getDisplayName <em>Display Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Name</em>' attribute.
   * @see #getDisplayName()
   * @generated
   */
  void setDisplayName(String value);

} // Actor
