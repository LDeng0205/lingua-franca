/**
 * generated by Xtext 2.16.0
 */
package org.icyphy.linguaFranca.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.icyphy.linguaFranca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.icyphy.linguaFranca.LinguaFrancaPackage
 * @generated
 */
public class LinguaFrancaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LinguaFrancaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinguaFrancaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LinguaFrancaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LinguaFrancaPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.TARGET:
      {
        Target target = (Target)theEObject;
        T result = caseTarget(target);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.COMPOSITE:
      {
        Composite composite = (Composite)theEObject;
        T result = caseComposite(composite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.TRIGGER:
      {
        Trigger trigger = (Trigger)theEObject;
        T result = caseTrigger(trigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.REACTION:
      {
        Reaction reaction = (Reaction)theEObject;
        T result = caseReaction(reaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.PREAMBLE:
      {
        Preamble preamble = (Preamble)theEObject;
        T result = casePreamble(preamble);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.INITIALIZE:
      {
        Initialize initialize = (Initialize)theEObject;
        T result = caseInitialize(initialize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.INSTANCE:
      {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.CONNECTION:
      {
        Connection connection = (Connection)theEObject;
        T result = caseConnection(connection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.ASSIGNMENTS:
      {
        Assignments assignments = (Assignments)theEObject;
        T result = caseAssignments(assignments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.GETS:
      {
        Gets gets = (Gets)theEObject;
        T result = caseGets(gets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.PARAMS:
      {
        Params params = (Params)theEObject;
        T result = caseParams(params);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.PERIOD:
      {
        Period period = (Period)theEObject;
        T result = casePeriod(period);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LinguaFrancaPackage.SETS:
      {
        Sets sets = (Sets)theEObject;
        T result = caseSets(sets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTarget(Target object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComposite(Composite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput(Output object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrigger(Trigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReaction(Reaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preamble</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preamble</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreamble(Preamble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initialize</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initialize</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialize(Initialize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnection(Connection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignments(Assignments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGets(Gets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParams(Params object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Period</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePeriod(Period object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSets(Sets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LinguaFrancaSwitch
