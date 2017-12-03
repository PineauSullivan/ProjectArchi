/**
 */
package systeme.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projecttArchitectural.ProjecttArchitecturalPackage;

import projecttArchitectural.impl.ProjecttArchitecturalPackageImpl;

import systeme.BindingFournisCS;
import systeme.BindingRequisCS;

import systeme.ClientServeur.ClientServeurPackage;

import systeme.ClientServeur.impl.ClientServeurPackageImpl;

import systeme.FonctionServeur.FonctionServeurPackage;

import systeme.FonctionServeur.impl.FonctionServeurPackageImpl;

import systeme.Systeme;
import systeme.SystemeFactory;
import systeme.SystemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemePackageImpl extends EPackageImpl implements SystemePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingRequisCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingFournisCSEClass = null;

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
	 * @see systeme.SystemePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemePackageImpl() {
		super(eNS_URI, SystemeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemePackage init() {
		if (isInited) return (SystemePackage)EPackage.Registry.INSTANCE.getEPackage(SystemePackage.eNS_URI);

		// Obtain or create and register package
		SystemePackageImpl theSystemePackage = (SystemePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SystemePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SystemePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ClientServeurPackageImpl theClientServeurPackage = (ClientServeurPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientServeurPackage.eNS_URI) instanceof ClientServeurPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientServeurPackage.eNS_URI) : ClientServeurPackage.eINSTANCE);
		FonctionServeurPackageImpl theFonctionServeurPackage = (FonctionServeurPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FonctionServeurPackage.eNS_URI) instanceof FonctionServeurPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FonctionServeurPackage.eNS_URI) : FonctionServeurPackage.eINSTANCE);
		ProjecttArchitecturalPackageImpl theProjecttArchitecturalPackage = (ProjecttArchitecturalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI) instanceof ProjecttArchitecturalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI) : ProjecttArchitecturalPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemePackage.createPackageContents();
		theClientServeurPackage.createPackageContents();
		theFonctionServeurPackage.createPackageContents();
		theProjecttArchitecturalPackage.createPackageContents();

		// Initialize created meta-data
		theSystemePackage.initializePackageContents();
		theClientServeurPackage.initializePackageContents();
		theFonctionServeurPackage.initializePackageContents();
		theProjecttArchitecturalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemePackage.eNS_URI, theSystemePackage);
		return theSystemePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysteme() {
		return systemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysteme_Configurationclientserveur() {
		return (EReference)systemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysteme_Serveurdetail() {
		return (EReference)systemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysteme_Bindingrequiscs() {
		return (EReference)systemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysteme_Bindingfourniscs() {
		return (EReference)systemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingRequisCS() {
		return bindingRequisCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingRequisCS_Portrequisconfigcs() {
		return (EReference)bindingRequisCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingRequisCS_Port_receive_request() {
		return (EReference)bindingRequisCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingFournisCS() {
		return bindingFournisCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingFournisCS_Port_receive_request() {
		return (EReference)bindingFournisCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingFournisCS_Portfourniscs() {
		return (EReference)bindingFournisCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemeFactory getSystemeFactory() {
		return (SystemeFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemeEClass = createEClass(SYSTEME);
		createEReference(systemeEClass, SYSTEME__CONFIGURATIONCLIENTSERVEUR);
		createEReference(systemeEClass, SYSTEME__SERVEURDETAIL);
		createEReference(systemeEClass, SYSTEME__BINDINGREQUISCS);
		createEReference(systemeEClass, SYSTEME__BINDINGFOURNISCS);

		bindingRequisCSEClass = createEClass(BINDING_REQUIS_CS);
		createEReference(bindingRequisCSEClass, BINDING_REQUIS_CS__PORTREQUISCONFIGCS);
		createEReference(bindingRequisCSEClass, BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST);

		bindingFournisCSEClass = createEClass(BINDING_FOURNIS_CS);
		createEReference(bindingFournisCSEClass, BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST);
		createEReference(bindingFournisCSEClass, BINDING_FOURNIS_CS__PORTFOURNISCS);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ClientServeurPackage theClientServeurPackage = (ClientServeurPackage)EPackage.Registry.INSTANCE.getEPackage(ClientServeurPackage.eNS_URI);
		FonctionServeurPackage theFonctionServeurPackage = (FonctionServeurPackage)EPackage.Registry.INSTANCE.getEPackage(FonctionServeurPackage.eNS_URI);
		ProjecttArchitecturalPackage theProjecttArchitecturalPackage = (ProjecttArchitecturalPackage)EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theClientServeurPackage);
		getESubpackages().add(theFonctionServeurPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemeEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getConfigurations());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemeEClass, Systeme.class, "Systeme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysteme_Configurationclientserveur(), theClientServeurPackage.getConfigurationClientServeur(), null, "configurationclientserveur", null, 0, 1, Systeme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Serveurdetail(), theFonctionServeurPackage.getServeurDetail(), null, "serveurdetail", null, 0, 1, Systeme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Bindingrequiscs(), this.getBindingRequisCS(), null, "bindingrequiscs", null, 0, 1, Systeme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Bindingfourniscs(), this.getBindingFournisCS(), null, "bindingfourniscs", null, 0, 1, Systeme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingRequisCSEClass, BindingRequisCS.class, "BindingRequisCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingRequisCS_Portrequisconfigcs(), theFonctionServeurPackage.getPortRequisConfigCS(), null, "portrequisconfigcs", null, 0, 1, BindingRequisCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingRequisCS_Port_receive_request(), theClientServeurPackage.getPort_Send_Serveur(), null, "port_receive_request", null, 0, 1, BindingRequisCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingFournisCSEClass, BindingFournisCS.class, "BindingFournisCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingFournisCS_Port_receive_request(), theClientServeurPackage.getPort_Receive_Request(), null, "port_receive_request", null, 0, 1, BindingFournisCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingFournisCS_Portfourniscs(), theFonctionServeurPackage.getPortFournisCS(), null, "portfourniscs", null, 0, 1, BindingFournisCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SystemePackageImpl
