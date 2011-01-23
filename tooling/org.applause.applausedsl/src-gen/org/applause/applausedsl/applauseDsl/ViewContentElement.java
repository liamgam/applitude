/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Content Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ViewContentElement#getIterator <em>Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getViewContentElement()
 * @model
 * @generated
 */
public interface ViewContentElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterator</em>' containment reference.
   * @see #setIterator(CollectionIterator)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getViewContentElement_Iterator()
   * @model containment="true"
   * @generated
   */
  CollectionIterator getIterator();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ViewContentElement#getIterator <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterator</em>' containment reference.
   * @see #getIterator()
   * @generated
   */
  void setIterator(CollectionIterator value);

} // ViewContentElement
