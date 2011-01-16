/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Replace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.StringReplace#getValue <em>Value</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.StringReplace#getMatch <em>Match</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.StringReplace#getReplacement <em>Replacement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getStringReplace()
 * @model
 * @generated
 */
public interface StringReplace extends StringFunction
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getStringReplace_Value()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getValue();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.StringReplace#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match</em>' containment reference.
   * @see #setMatch(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getStringReplace_Match()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getMatch();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.StringReplace#getMatch <em>Match</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match</em>' containment reference.
   * @see #getMatch()
   * @generated
   */
  void setMatch(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replacement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replacement</em>' containment reference.
   * @see #setReplacement(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getStringReplace_Replacement()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getReplacement();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.StringReplace#getReplacement <em>Replacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replacement</em>' containment reference.
   * @see #getReplacement()
   * @generated
   */
  void setReplacement(ScalarExpression value);

} // StringReplace
