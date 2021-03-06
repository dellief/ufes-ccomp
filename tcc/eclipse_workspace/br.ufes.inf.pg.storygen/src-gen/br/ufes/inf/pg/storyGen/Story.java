/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.storyGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.pg.storyGen.Story#getData <em>Data</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Story#getSpace <em>Space</em>}</li>
 *   <li>{@link br.ufes.inf.pg.storyGen.Story#getPlot <em>Plot</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getStory()
 * @model
 * @generated
 */
public interface Story extends EObject
{
  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(StoryData)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getStory_Data()
   * @model containment="true"
   * @generated
   */
  StoryData getData();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Story#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(StoryData value);

  /**
   * Returns the value of the '<em><b>Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Space</em>' containment reference.
   * @see #setSpace(Space)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getStory_Space()
   * @model containment="true"
   * @generated
   */
  Space getSpace();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Story#getSpace <em>Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Space</em>' containment reference.
   * @see #getSpace()
   * @generated
   */
  void setSpace(Space value);

  /**
   * Returns the value of the '<em><b>Plot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plot</em>' containment reference.
   * @see #setPlot(Plot)
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getStory_Plot()
   * @model containment="true"
   * @generated
   */
  Plot getPlot();

  /**
   * Sets the value of the '{@link br.ufes.inf.pg.storyGen.Story#getPlot <em>Plot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plot</em>' containment reference.
   * @see #getPlot()
   * @generated
   */
  void setPlot(Plot value);

} // Story
