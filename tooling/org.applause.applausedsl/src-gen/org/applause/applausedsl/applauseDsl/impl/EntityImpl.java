/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl.impl;

import java.util.Collection;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
import org.applause.applausedsl.applauseDsl.Entity;
import org.applause.applausedsl.applauseDsl.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.EntityImpl#isRuntimeType <em>Runtime Type</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.EntityImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.EntityImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends TypeImpl implements Entity
{
  /**
   * The default value of the '{@link #isRuntimeType() <em>Runtime Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRuntimeType()
   * @generated
   * @ordered
   */
  protected static final boolean RUNTIME_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRuntimeType() <em>Runtime Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRuntimeType()
   * @generated
   * @ordered
   */
  protected boolean runtimeType = RUNTIME_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected Entity extends_;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return ApplauseDslPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRuntimeType()
  {
    return runtimeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuntimeType(boolean newRuntimeType)
  {
    boolean oldRuntimeType = runtimeType;
    runtimeType = newRuntimeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.ENTITY__RUNTIME_TYPE, oldRuntimeType, runtimeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (Entity)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.ENTITY__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(Entity newExtends)
  {
    Entity oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.ENTITY__EXTENDS, oldExtends, extends_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, ApplauseDslPackage.ENTITY__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.ENTITY__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ApplauseDslPackage.ENTITY__RUNTIME_TYPE:
        return isRuntimeType();
      case ApplauseDslPackage.ENTITY__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
      case ApplauseDslPackage.ENTITY__PROPERTIES:
        return getProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.ENTITY__RUNTIME_TYPE:
        setRuntimeType((Boolean)newValue);
        return;
      case ApplauseDslPackage.ENTITY__EXTENDS:
        setExtends((Entity)newValue);
        return;
      case ApplauseDslPackage.ENTITY__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
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
      case ApplauseDslPackage.ENTITY__RUNTIME_TYPE:
        setRuntimeType(RUNTIME_TYPE_EDEFAULT);
        return;
      case ApplauseDslPackage.ENTITY__EXTENDS:
        setExtends((Entity)null);
        return;
      case ApplauseDslPackage.ENTITY__PROPERTIES:
        getProperties().clear();
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
      case ApplauseDslPackage.ENTITY__RUNTIME_TYPE:
        return runtimeType != RUNTIME_TYPE_EDEFAULT;
      case ApplauseDslPackage.ENTITY__EXTENDS:
        return extends_ != null;
      case ApplauseDslPackage.ENTITY__PROPERTIES:
        return properties != null && !properties.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (runtimeType: ");
    result.append(runtimeType);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
