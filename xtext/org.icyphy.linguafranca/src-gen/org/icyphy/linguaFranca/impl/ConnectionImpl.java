/**
 * generated by Xtext 2.16.0
 */
package org.icyphy.linguaFranca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.icyphy.linguaFranca.Connection;
import org.icyphy.linguaFranca.LinguaFrancaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.icyphy.linguaFranca.impl.ConnectionImpl#getLeftPort <em>Left Port</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.impl.ConnectionImpl#getRightPort <em>Right Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection
{
  /**
   * The default value of the '{@link #getLeftPort() <em>Left Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftPort()
   * @generated
   * @ordered
   */
  protected static final String LEFT_PORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftPort() <em>Left Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftPort()
   * @generated
   * @ordered
   */
  protected String leftPort = LEFT_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getRightPort() <em>Right Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPort()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_PORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightPort() <em>Right Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPort()
   * @generated
   * @ordered
   */
  protected String rightPort = RIGHT_PORT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LinguaFrancaPackage.Literals.CONNECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLeftPort()
  {
    return leftPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeftPort(String newLeftPort)
  {
    String oldLeftPort = leftPort;
    leftPort = newLeftPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinguaFrancaPackage.CONNECTION__LEFT_PORT, oldLeftPort, leftPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRightPort()
  {
    return rightPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRightPort(String newRightPort)
  {
    String oldRightPort = rightPort;
    rightPort = newRightPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinguaFrancaPackage.CONNECTION__RIGHT_PORT, oldRightPort, rightPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LinguaFrancaPackage.CONNECTION__LEFT_PORT:
        return getLeftPort();
      case LinguaFrancaPackage.CONNECTION__RIGHT_PORT:
        return getRightPort();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LinguaFrancaPackage.CONNECTION__LEFT_PORT:
        setLeftPort((String)newValue);
        return;
      case LinguaFrancaPackage.CONNECTION__RIGHT_PORT:
        setRightPort((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LinguaFrancaPackage.CONNECTION__LEFT_PORT:
        setLeftPort(LEFT_PORT_EDEFAULT);
        return;
      case LinguaFrancaPackage.CONNECTION__RIGHT_PORT:
        setRightPort(RIGHT_PORT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LinguaFrancaPackage.CONNECTION__LEFT_PORT:
        return LEFT_PORT_EDEFAULT == null ? leftPort != null : !LEFT_PORT_EDEFAULT.equals(leftPort);
      case LinguaFrancaPackage.CONNECTION__RIGHT_PORT:
        return RIGHT_PORT_EDEFAULT == null ? rightPort != null : !RIGHT_PORT_EDEFAULT.equals(rightPort);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (leftPort: ");
    result.append(leftPort);
    result.append(", rightPort: ");
    result.append(rightPort);
    result.append(')');
    return result.toString();
  }

} //ConnectionImpl
