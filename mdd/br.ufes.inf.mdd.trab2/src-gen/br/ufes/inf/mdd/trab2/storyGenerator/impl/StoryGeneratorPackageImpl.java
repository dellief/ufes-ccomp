/**
 * generated by Xtext 2.14.0
 */
package br.ufes.inf.mdd.trab2.storyGenerator.impl;

import br.ufes.inf.mdd.trab2.storyGenerator.AttrType;
import br.ufes.inf.mdd.trab2.storyGenerator.Attribute;
import br.ufes.inf.mdd.trab2.storyGenerator.BinaryBoolExp;
import br.ufes.inf.mdd.trab2.storyGenerator.BinaryQntyExp;
import br.ufes.inf.mdd.trab2.storyGenerator.BoolExp;
import br.ufes.inf.mdd.trab2.storyGenerator.BoolOp;
import br.ufes.inf.mdd.trab2.storyGenerator.BooleanValue;
import br.ufes.inf.mdd.trab2.storyGenerator.Condition;
import br.ufes.inf.mdd.trab2.storyGenerator.Event;
import br.ufes.inf.mdd.trab2.storyGenerator.NegateBoolExp;
import br.ufes.inf.mdd.trab2.storyGenerator.NumOp;
import br.ufes.inf.mdd.trab2.storyGenerator.Story;
import br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorFactory;
import br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage;
import br.ufes.inf.mdd.trab2.storyGenerator.UnaryBoolExp;
import br.ufes.inf.mdd.trab2.storyGenerator.UnaryQuantityExp;
import br.ufes.inf.mdd.trab2.storyGenerator.World;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoryGeneratorPackageImpl extends EPackageImpl implements StoryGeneratorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass worldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryBoolExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryQntyExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryBoolExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negateBoolExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryQuantityExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attrTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanValueEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum numOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum boolOpEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.ufes.inf.mdd.trab2.storyGenerator.StoryGeneratorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StoryGeneratorPackageImpl()
  {
    super(eNS_URI, StoryGeneratorFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link StoryGeneratorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StoryGeneratorPackage init()
  {
    if (isInited) return (StoryGeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(StoryGeneratorPackage.eNS_URI);

    // Obtain or create and register package
    StoryGeneratorPackageImpl theStoryGeneratorPackage = (StoryGeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StoryGeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StoryGeneratorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theStoryGeneratorPackage.createPackageContents();

    // Initialize created meta-data
    theStoryGeneratorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStoryGeneratorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StoryGeneratorPackage.eNS_URI, theStoryGeneratorPackage);
    return theStoryGeneratorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStory()
  {
    return storyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStory_World()
  {
    return (EReference)storyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStory_Events()
  {
    return (EReference)storyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorld()
  {
    return worldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorld_Attributes()
  {
    return (EReference)worldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AttrType()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Abstract()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Name()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_SuperType()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Conditions()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_BoolExp()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolExp()
  {
    return boolExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolExp_Left()
  {
    return (EReference)boolExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolExp_BoolOp()
  {
    return (EAttribute)boolExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolExp_Right()
  {
    return (EReference)boolExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolExp_ParBoolExp()
  {
    return (EReference)boolExpEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolExp_BinaryBool()
  {
    return (EReference)boolExpEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolExp_BinaryQnty()
  {
    return (EReference)boolExpEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolExp_NegateBoolExp()
  {
    return (EReference)boolExpEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolExp_UnaryBool()
  {
    return (EReference)boolExpEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryBoolExp()
  {
    return binaryBoolExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryBoolExp_Left()
  {
    return (EReference)binaryBoolExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryBoolExp_BoolOp()
  {
    return (EAttribute)binaryBoolExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryBoolExp_Right()
  {
    return (EReference)binaryBoolExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryQntyExp()
  {
    return binaryQntyExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryQntyExp_Left()
  {
    return (EReference)binaryQntyExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryQntyExp_NumOp()
  {
    return (EAttribute)binaryQntyExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryQntyExp_Right()
  {
    return (EReference)binaryQntyExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryBoolExp()
  {
    return unaryBoolExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryBoolExp_Id()
  {
    return (EReference)unaryBoolExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryBoolExp_Value()
  {
    return (EAttribute)unaryBoolExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegateBoolExp()
  {
    return negateBoolExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegateBoolExp_BoolExp()
  {
    return (EReference)negateBoolExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryQuantityExp()
  {
    return unaryQuantityExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryQuantityExp_Id()
  {
    return (EReference)unaryQuantityExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryQuantityExp_Value()
  {
    return (EAttribute)unaryQuantityExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttrType()
  {
    return attrTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanValue()
  {
    return booleanValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNumOp()
  {
    return numOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBoolOp()
  {
    return boolOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoryGeneratorFactory getStoryGeneratorFactory()
  {
    return (StoryGeneratorFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    storyEClass = createEClass(STORY);
    createEReference(storyEClass, STORY__WORLD);
    createEReference(storyEClass, STORY__EVENTS);

    worldEClass = createEClass(WORLD);
    createEReference(worldEClass, WORLD__ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTR_TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__ABSTRACT);
    createEAttribute(eventEClass, EVENT__NAME);
    createEReference(eventEClass, EVENT__SUPER_TYPE);
    createEReference(eventEClass, EVENT__CONDITIONS);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__BOOL_EXP);

    boolExpEClass = createEClass(BOOL_EXP);
    createEReference(boolExpEClass, BOOL_EXP__LEFT);
    createEAttribute(boolExpEClass, BOOL_EXP__BOOL_OP);
    createEReference(boolExpEClass, BOOL_EXP__RIGHT);
    createEReference(boolExpEClass, BOOL_EXP__PAR_BOOL_EXP);
    createEReference(boolExpEClass, BOOL_EXP__BINARY_BOOL);
    createEReference(boolExpEClass, BOOL_EXP__BINARY_QNTY);
    createEReference(boolExpEClass, BOOL_EXP__NEGATE_BOOL_EXP);
    createEReference(boolExpEClass, BOOL_EXP__UNARY_BOOL);

    binaryBoolExpEClass = createEClass(BINARY_BOOL_EXP);
    createEReference(binaryBoolExpEClass, BINARY_BOOL_EXP__LEFT);
    createEAttribute(binaryBoolExpEClass, BINARY_BOOL_EXP__BOOL_OP);
    createEReference(binaryBoolExpEClass, BINARY_BOOL_EXP__RIGHT);

    binaryQntyExpEClass = createEClass(BINARY_QNTY_EXP);
    createEReference(binaryQntyExpEClass, BINARY_QNTY_EXP__LEFT);
    createEAttribute(binaryQntyExpEClass, BINARY_QNTY_EXP__NUM_OP);
    createEReference(binaryQntyExpEClass, BINARY_QNTY_EXP__RIGHT);

    unaryBoolExpEClass = createEClass(UNARY_BOOL_EXP);
    createEReference(unaryBoolExpEClass, UNARY_BOOL_EXP__ID);
    createEAttribute(unaryBoolExpEClass, UNARY_BOOL_EXP__VALUE);

    negateBoolExpEClass = createEClass(NEGATE_BOOL_EXP);
    createEReference(negateBoolExpEClass, NEGATE_BOOL_EXP__BOOL_EXP);

    unaryQuantityExpEClass = createEClass(UNARY_QUANTITY_EXP);
    createEReference(unaryQuantityExpEClass, UNARY_QUANTITY_EXP__ID);
    createEAttribute(unaryQuantityExpEClass, UNARY_QUANTITY_EXP__VALUE);

    // Create enums
    attrTypeEEnum = createEEnum(ATTR_TYPE);
    booleanValueEEnum = createEEnum(BOOLEAN_VALUE);
    numOpEEnum = createEEnum(NUM_OP);
    boolOpEEnum = createEEnum(BOOL_OP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(storyEClass, Story.class, "Story", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStory_World(), this.getWorld(), null, "world", null, 0, 1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStory_Events(), this.getEvent(), null, "events", null, 0, -1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(worldEClass, World.class, "World", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorld_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, World.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_AttrType(), this.getAttrType(), "attrType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvent_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_SuperType(), this.getEvent(), null, "superType", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_BoolExp(), this.getBoolExp(), null, "boolExp", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolExpEClass, BoolExp.class, "BoolExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoolExp_Left(), this.getUnaryBoolExp(), null, "left", null, 0, 1, BoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBoolExp_BoolOp(), this.getBoolOp(), "boolOp", null, 0, 1, BoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoolExp_Right(), this.getBoolExp(), null, "right", null, 0, 1, BoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoolExp_ParBoolExp(), this.getBoolExp(), null, "parBoolExp", null, 0, 1, BoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoolExp_BinaryBool(), this.getBinaryBoolExp(), null, "binaryBool", null, 0, 1, BoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoolExp_BinaryQnty(), this.getBinaryQntyExp(), null, "binaryQnty", null, 0, 1, BoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoolExp_NegateBoolExp(), this.getNegateBoolExp(), null, "negateBoolExp", null, 0, 1, BoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoolExp_UnaryBool(), this.getUnaryBoolExp(), null, "unaryBool", null, 0, 1, BoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryBoolExpEClass, BinaryBoolExp.class, "BinaryBoolExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryBoolExp_Left(), this.getUnaryBoolExp(), null, "left", null, 0, 1, BinaryBoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryBoolExp_BoolOp(), this.getBoolOp(), "boolOp", null, 0, 1, BinaryBoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryBoolExp_Right(), this.getUnaryBoolExp(), null, "right", null, 0, 1, BinaryBoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryQntyExpEClass, BinaryQntyExp.class, "BinaryQntyExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryQntyExp_Left(), this.getUnaryQuantityExp(), null, "left", null, 0, 1, BinaryQntyExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryQntyExp_NumOp(), this.getNumOp(), "numOp", null, 0, 1, BinaryQntyExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryQntyExp_Right(), this.getUnaryQuantityExp(), null, "right", null, 0, 1, BinaryQntyExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryBoolExpEClass, UnaryBoolExp.class, "UnaryBoolExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryBoolExp_Id(), this.getAttribute(), null, "id", null, 0, 1, UnaryBoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnaryBoolExp_Value(), this.getBooleanValue(), "value", null, 0, 1, UnaryBoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negateBoolExpEClass, NegateBoolExp.class, "NegateBoolExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegateBoolExp_BoolExp(), this.getBoolExp(), null, "boolExp", null, 0, 1, NegateBoolExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryQuantityExpEClass, UnaryQuantityExp.class, "UnaryQuantityExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryQuantityExp_Id(), this.getAttribute(), null, "id", null, 0, 1, UnaryQuantityExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnaryQuantityExp_Value(), ecorePackage.getEInt(), "value", null, 0, 1, UnaryQuantityExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(attrTypeEEnum, AttrType.class, "AttrType");
    addEEnumLiteral(attrTypeEEnum, AttrType.FACT);
    addEEnumLiteral(attrTypeEEnum, AttrType.QUANTITY);

    initEEnum(booleanValueEEnum, BooleanValue.class, "BooleanValue");
    addEEnumLiteral(booleanValueEEnum, BooleanValue.TRUE);
    addEEnumLiteral(booleanValueEEnum, BooleanValue.FALSE);

    initEEnum(numOpEEnum, NumOp.class, "NumOp");
    addEEnumLiteral(numOpEEnum, NumOp.EQ);
    addEEnumLiteral(numOpEEnum, NumOp.NEQ);
    addEEnumLiteral(numOpEEnum, NumOp.GT);
    addEEnumLiteral(numOpEEnum, NumOp.LT);
    addEEnumLiteral(numOpEEnum, NumOp.GE);
    addEEnumLiteral(numOpEEnum, NumOp.LE);

    initEEnum(boolOpEEnum, BoolOp.class, "BoolOp");
    addEEnumLiteral(boolOpEEnum, BoolOp.EQ);
    addEEnumLiteral(boolOpEEnum, BoolOp.NEQ);
    addEEnumLiteral(boolOpEEnum, BoolOp.AND);
    addEEnumLiteral(boolOpEEnum, BoolOp.OR);

    // Create resource
    createResource(eNS_URI);
  }

} //StoryGeneratorPackageImpl
