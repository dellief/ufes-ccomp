/**
 * generated by Xtext 2.17.0
 */
package br.ufes.inf.storyGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Qnty Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.storyGen.BinaryQntyExp#getLeft <em>Left</em>}</li>
 *   <li>{@link br.ufes.inf.storyGen.BinaryQntyExp#getNumOp <em>Num Op</em>}</li>
 *   <li>{@link br.ufes.inf.storyGen.BinaryQntyExp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.storyGen.StoryGenPackage#getBinaryQntyExp()
 * @model
 * @generated
 */
public interface BinaryQntyExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(UnaryQuantityExp)
   * @see br.ufes.inf.storyGen.StoryGenPackage#getBinaryQntyExp_Left()
   * @model containment="true"
   * @generated
   */
  UnaryQuantityExp getLeft();

  /**
   * Sets the value of the '{@link br.ufes.inf.storyGen.BinaryQntyExp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(UnaryQuantityExp value);

  /**
   * Returns the value of the '<em><b>Num Op</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufes.inf.storyGen.NumOp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Op</em>' attribute.
   * @see br.ufes.inf.storyGen.NumOp
   * @see #setNumOp(NumOp)
   * @see br.ufes.inf.storyGen.StoryGenPackage#getBinaryQntyExp_NumOp()
   * @model
   * @generated
   */
  NumOp getNumOp();

  /**
   * Sets the value of the '{@link br.ufes.inf.storyGen.BinaryQntyExp#getNumOp <em>Num Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Op</em>' attribute.
   * @see br.ufes.inf.storyGen.NumOp
   * @see #getNumOp()
   * @generated
   */
  void setNumOp(NumOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(UnaryQuantityExp)
   * @see br.ufes.inf.storyGen.StoryGenPackage#getBinaryQntyExp_Right()
   * @model containment="true"
   * @generated
   */
  UnaryQuantityExp getRight();

  /**
   * Sets the value of the '{@link br.ufes.inf.storyGen.BinaryQntyExp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(UnaryQuantityExp value);

} // BinaryQntyExp
