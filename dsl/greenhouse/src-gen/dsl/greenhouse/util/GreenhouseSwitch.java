/**
 * generated by Xtext 2.25.0
 */
package dsl.greenhouse.util;

import dsl.greenhouse.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see dsl.greenhouse.GreenhousePackage
 * @generated
 */
public class GreenhouseSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GreenhousePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreenhouseSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GreenhousePackage.eINSTANCE;
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
      case GreenhousePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.HARDWARE_SETUP:
      {
        HardwareSetup hardwareSetup = (HardwareSetup)theEObject;
        T result = caseHardwareSetup(hardwareSetup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.HARDWARE:
      {
        Hardware hardware = (Hardware)theEObject;
        T result = caseHardware(hardware);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.SETTING_ACTUATOR:
      {
        SettingActuator settingActuator = (SettingActuator)theEObject;
        T result = caseSettingActuator(settingActuator);
        if (result == null) result = caseHardware(settingActuator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.SETTING_SENSOR:
      {
        SettingSensor settingSensor = (SettingSensor)theEObject;
        T result = caseSettingSensor(settingSensor);
        if (result == null) result = caseHardware(settingSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.CONTROLLER:
      {
        Controller controller = (Controller)theEObject;
        T result = caseController(controller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.HEARTBEAT_FREQUENCY:
      {
        HeartbeatFrequency heartbeatFrequency = (HeartbeatFrequency)theEObject;
        T result = caseHeartbeatFrequency(heartbeatFrequency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.CONTROLLER_TYPE:
      {
        ControllerType controllerType = (ControllerType)theEObject;
        T result = caseControllerType(controllerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.CONTROLLER_LISTENER:
      {
        ControllerListener controllerListener = (ControllerListener)theEObject;
        T result = caseControllerListener(controllerListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.CONTROLLER_LISTENER_RULE:
      {
        ControllerListenerRule controllerListenerRule = (ControllerListenerRule)theEObject;
        T result = caseControllerListenerRule(controllerListenerRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.REDUCER:
      {
        Reducer reducer = (Reducer)theEObject;
        T result = caseReducer(reducer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.FREQUENCY:
      {
        Frequency frequency = (Frequency)theEObject;
        T result = caseFrequency(frequency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.TOPIC:
      {
        Topic topic = (Topic)theEObject;
        T result = caseTopic(topic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.SETTING_ACTION:
      {
        SettingAction settingAction = (SettingAction)theEObject;
        T result = caseSettingAction(settingAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.SETTING_VALUE:
      {
        SettingValue settingValue = (SettingValue)theEObject;
        T result = caseSettingValue(settingValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.GREENHOUSE:
      {
        Greenhouse greenhouse = (Greenhouse)theEObject;
        T result = caseGreenhouse(greenhouse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.ROW:
      {
        Row row = (Row)theEObject;
        T result = caseRow(row);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.GREENHOUSE_ELEMENT:
      {
        GreenhouseElement greenhouseElement = (GreenhouseElement)theEObject;
        T result = caseGreenhouseElement(greenhouseElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.ROW_ELEMENT:
      {
        RowElement rowElement = (RowElement)theEObject;
        T result = caseRowElement(rowElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.GREENHOUSE_ACTUATOR:
      {
        GreenhouseActuator greenhouseActuator = (GreenhouseActuator)theEObject;
        T result = caseGreenhouseActuator(greenhouseActuator);
        if (result == null) result = caseGreenhouseElement(greenhouseActuator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.ROW_ACTUATOR:
      {
        RowActuator rowActuator = (RowActuator)theEObject;
        T result = caseRowActuator(rowActuator);
        if (result == null) result = caseRowElement(rowActuator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.GREENHOUSE_SENSOR:
      {
        GreenhouseSensor greenhouseSensor = (GreenhouseSensor)theEObject;
        T result = caseGreenhouseSensor(greenhouseSensor);
        if (result == null) result = caseGreenhouseElement(greenhouseSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.ROW_SENSOR:
      {
        RowSensor rowSensor = (RowSensor)theEObject;
        T result = caseRowSensor(rowSensor);
        if (result == null) result = caseRowElement(rowSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.TRIGGER:
      {
        Trigger trigger = (Trigger)theEObject;
        T result = caseTrigger(trigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.ROW_RULE_SET:
      {
        RowRuleSet rowRuleSet = (RowRuleSet)theEObject;
        T result = caseRowRuleSet(rowRuleSet);
        if (result == null) result = caseRowElement(rowRuleSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.GREENHOUSE_RULE_SET:
      {
        GreenhouseRuleSet greenhouseRuleSet = (GreenhouseRuleSet)theEObject;
        T result = caseGreenhouseRuleSet(greenhouseRuleSet);
        if (result == null) result = caseGreenhouseElement(greenhouseRuleSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpression(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.MULT:
      {
        Mult mult = (Mult)theEObject;
        T result = caseMult(mult);
        if (result == null) result = caseExpression(mult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreenhousePackage.MATH_NUMBER:
      {
        MathNumber mathNumber = (MathNumber)theEObject;
        T result = caseMathNumber(mathNumber);
        if (result == null) result = caseExpression(mathNumber);
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
   * Returns the result of interpreting the object as an instance of '<em>Hardware Setup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hardware Setup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHardwareSetup(HardwareSetup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hardware</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hardware</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHardware(Hardware object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Setting Actuator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Setting Actuator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSettingActuator(SettingActuator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Setting Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Setting Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSettingSensor(SettingSensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseController(Controller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heartbeat Frequency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heartbeat Frequency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeartbeatFrequency(HeartbeatFrequency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControllerType(ControllerType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller Listener</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControllerListener(ControllerListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller Listener Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller Listener Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControllerListenerRule(ControllerListenerRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reducer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reducer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReducer(Reducer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Frequency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Frequency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrequency(Frequency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopic(Topic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Setting Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Setting Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSettingAction(SettingAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Setting Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Setting Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSettingValue(SettingValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greenhouse</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greenhouse</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreenhouse(Greenhouse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRow(Row object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreenhouseElement(GreenhouseElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRowElement(RowElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreenhouseActuator(GreenhouseActuator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row Actuator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Actuator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRowActuator(RowActuator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreenhouseSensor(GreenhouseSensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRowSensor(RowSensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
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
   * Returns the result of interpreting the object as an instance of '<em>Row Rule Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Rule Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRowRuleSet(RowRuleSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreenhouseRuleSet(GreenhouseRuleSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMult(Mult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathNumber(MathNumber object)
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

} //GreenhouseSwitch
