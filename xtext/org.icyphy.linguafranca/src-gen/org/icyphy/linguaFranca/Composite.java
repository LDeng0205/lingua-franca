/**
 * generated by Xtext 2.16.0
 */
package org.icyphy.linguaFranca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getName <em>Name</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getInitialize <em>Initialize</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getReactions <em>Reactions</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.icyphy.linguaFranca.Composite#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.icyphy.linguaFranca.Composite#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(Params)
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Parameters()
   * @model containment="true"
   * @generated
   */
  Params getParameters();

  /**
   * Sets the value of the '{@link org.icyphy.linguaFranca.Composite#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(Params value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link org.icyphy.linguaFranca.Input}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<Input> getInputs();

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link org.icyphy.linguaFranca.Output}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<Output> getOutputs();

  /**
   * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
   * The list contents are of type {@link org.icyphy.linguaFranca.Trigger}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggers</em>' containment reference list.
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Triggers()
   * @model containment="true"
   * @generated
   */
  EList<Trigger> getTriggers();

  /**
   * Returns the value of the '<em><b>Preamble</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preamble</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preamble</em>' containment reference.
   * @see #setPreamble(Preamble)
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Preamble()
   * @model containment="true"
   * @generated
   */
  Preamble getPreamble();

  /**
   * Sets the value of the '{@link org.icyphy.linguaFranca.Composite#getPreamble <em>Preamble</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preamble</em>' containment reference.
   * @see #getPreamble()
   * @generated
   */
  void setPreamble(Preamble value);

  /**
   * Returns the value of the '<em><b>Initialize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialize</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialize</em>' containment reference.
   * @see #setInitialize(Initialize)
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Initialize()
   * @model containment="true"
   * @generated
   */
  Initialize getInitialize();

  /**
   * Sets the value of the '{@link org.icyphy.linguaFranca.Composite#getInitialize <em>Initialize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialize</em>' containment reference.
   * @see #getInitialize()
   * @generated
   */
  void setInitialize(Initialize value);

  /**
   * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
   * The list contents are of type {@link org.icyphy.linguaFranca.Reaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reactions</em>' containment reference list.
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Reactions()
   * @model containment="true"
   * @generated
   */
  EList<Reaction> getReactions();

  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.icyphy.linguaFranca.Instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Instances()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstances();

  /**
   * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
   * The list contents are of type {@link org.icyphy.linguaFranca.Connection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connections</em>' containment reference list.
   * @see org.icyphy.linguaFranca.LinguaFrancaPackage#getComposite_Connections()
   * @model containment="true"
   * @generated
   */
  EList<Connection> getConnections();

} // Composite
