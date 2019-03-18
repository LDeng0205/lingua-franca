/**
 * generated by Xtext 2.16.0
 */
package org.icyphy.linguaFranca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.icyphy.linguaFranca.Period#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Period#isPeriodic <em>Periodic</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Period#isOnce <em>Once</em>}</li>
 * </ul>
 *
 * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getPeriod()
 * @model
 * @generated
 */
public interface Period extends EObject
{
  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(String)
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getPeriod_Period()
   * @model
   * @generated
   */
  String getPeriod();

  /**
   * Sets the value of the '{@link org.icyphy.linguaFranca.Period#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(String value);

  /**
   * Returns the value of the '<em><b>Periodic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Periodic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Periodic</em>' attribute.
   * @see #setPeriodic(boolean)
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getPeriod_Periodic()
   * @model
   * @generated
   */
  boolean isPeriodic();

  /**
   * Sets the value of the '{@link org.icyphy.linguaFranca.Period#isPeriodic <em>Periodic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Periodic</em>' attribute.
   * @see #isPeriodic()
   * @generated
   */
  void setPeriodic(boolean value);

  /**
   * Returns the value of the '<em><b>Once</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Once</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Once</em>' attribute.
   * @see #setOnce(boolean)
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getPeriod_Once()
   * @model
   * @generated
   */
  boolean isOnce();

  /**
   * Sets the value of the '{@link org.icyphy.linguaFranca.Period#isOnce <em>Once</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Once</em>' attribute.
   * @see #isOnce()
   * @generated
   */
  void setOnce(boolean value);

} // Period
