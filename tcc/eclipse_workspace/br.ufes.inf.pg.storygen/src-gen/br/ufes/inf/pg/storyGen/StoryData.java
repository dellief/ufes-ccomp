/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.pg.storyGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.pg.storyGen.StoryData#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getStoryData()
 * @model
 * @generated
 */
public interface StoryData extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.pg.storyGen.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see br.ufes.inf.pg.storyGen.StoryGenPackage#getStoryData_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // StoryData
