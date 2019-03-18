/**
 * generated by Xtext 2.16.0
 */
package org.icyphy.linguaFranca.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.icyphy.linguaFranca.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinguaFrancaFactoryImpl extends EFactoryImpl implements LinguaFrancaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LinguaFrancaFactory init()
  {
    try
    {
      LinguaFrancaFactory theLinguaFrancaFactory = (LinguaFrancaFactory)EPackage.Registry.INSTANCE.getEFactory(LinguaFrancaPackage.eNS_URI);
      if (theLinguaFrancaFactory != null)
      {
        return theLinguaFrancaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LinguaFrancaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinguaFrancaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LinguaFrancaPackage.MODEL: return createModel();
      case LinguaFrancaPackage.TARGET: return createTarget();
      case LinguaFrancaPackage.IMPORT: return createImport();
      case LinguaFrancaPackage.ACTOR: return createActor();
      case LinguaFrancaPackage.COMPOSITE: return createComposite();
      case LinguaFrancaPackage.INPUT: return createInput();
      case LinguaFrancaPackage.OUTPUT: return createOutput();
      case LinguaFrancaPackage.TRIGGER: return createTrigger();
      case LinguaFrancaPackage.REACTION: return createReaction();
      case LinguaFrancaPackage.PREAMBLE: return createPreamble();
      case LinguaFrancaPackage.INITIALIZE: return createInitialize();
      case LinguaFrancaPackage.INSTANCE: return createInstance();
      case LinguaFrancaPackage.CONNECTION: return createConnection();
      case LinguaFrancaPackage.ASSIGNMENTS: return createAssignments();
      case LinguaFrancaPackage.ASSIGNMENT: return createAssignment();
      case LinguaFrancaPackage.GETS: return createGets();
      case LinguaFrancaPackage.PARAMS: return createParams();
      case LinguaFrancaPackage.PARAM: return createParam();
      case LinguaFrancaPackage.PERIOD: return createPeriod();
      case LinguaFrancaPackage.SETS: return createSets();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Composite createComposite()
  {
    CompositeImpl composite = new CompositeImpl();
    return composite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reaction createReaction()
  {
    ReactionImpl reaction = new ReactionImpl();
    return reaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Preamble createPreamble()
  {
    PreambleImpl preamble = new PreambleImpl();
    return preamble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Initialize createInitialize()
  {
    InitializeImpl initialize = new InitializeImpl();
    return initialize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connection createConnection()
  {
    ConnectionImpl connection = new ConnectionImpl();
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignments createAssignments()
  {
    AssignmentsImpl assignments = new AssignmentsImpl();
    return assignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Gets createGets()
  {
    GetsImpl gets = new GetsImpl();
    return gets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Params createParams()
  {
    ParamsImpl params = new ParamsImpl();
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Period createPeriod()
  {
    PeriodImpl period = new PeriodImpl();
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sets createSets()
  {
    SetsImpl sets = new SetsImpl();
    return sets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LinguaFrancaPackage getLinguaFrancaPackage()
  {
    return (LinguaFrancaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LinguaFrancaPackage getPackage()
  {
    return LinguaFrancaPackage.eINSTANCE;
  }

} //LinguaFrancaFactoryImpl
