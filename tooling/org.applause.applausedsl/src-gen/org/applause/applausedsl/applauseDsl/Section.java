/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Section#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Section#getCells <em>Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends ViewContentElement
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSection_Title()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitle();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Section#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.applausedsl.applauseDsl.Cell}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' containment reference list.
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getSection_Cells()
   * @model containment="true"
   * @generated
   */
  EList<Cell> getCells();

} // Section
