/**
 */
package projecttArchitectural.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projecttArchitectural.Attachment;
import projecttArchitectural.AttachmentFournisRequis;
import projecttArchitectural.AttachmentsRequisFournis;
import projecttArchitectural.Binding;
import projecttArchitectural.BindingFournis;
import projecttArchitectural.BindingRequis;
import projecttArchitectural.Composants;
import projecttArchitectural.Configurations;
import projecttArchitectural.Connecteurs;
import projecttArchitectural.Contraintes;
import projecttArchitectural.Element;
import projecttArchitectural.Glue;
import projecttArchitectural.InterfaceComposants;
import projecttArchitectural.Lien;
import projecttArchitectural.PortsCompasants;
import projecttArchitectural.PortsComposantsFournis;
import projecttArchitectural.PortsComposantsRequis;
import projecttArchitectural.ProjecttArchitecturalFactory;
import projecttArchitectural.ProjecttArchitecturalPackage;
import projecttArchitectural.Propriétés;
import projecttArchitectural.PropriétésFonctionnelles;
import projecttArchitectural.PropriétésNonFonctionnelles;
import projecttArchitectural.RoleConnecteurs;
import projecttArchitectural.RoleConnecteursFournis;
import projecttArchitectural.RoleConnecteursRequis;
import projecttArchitectural.ServiceComposants;
import projecttArchitectural.ServiceConposantsFournis;
import projecttArchitectural.ServiceConposantsRequis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjecttArchitecturalPackageImpl extends EPackageImpl implements ProjecttArchitecturalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteursEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propriétésEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propriétésFonctionnellesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propriétésNonFonctionnellesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceComposantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portsCompasantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceComposantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portsComposantsRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portsComposantsFournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConposantsRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConposantsFournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleConnecteursEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleConnecteursFournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleConnecteursRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contraintesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingFournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentsRequisFournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentFournisRequisEClass = null;

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
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProjecttArchitecturalPackageImpl() {
		super(eNS_URI, ProjecttArchitecturalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProjecttArchitecturalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProjecttArchitecturalPackage init() {
		if (isInited) return (ProjecttArchitecturalPackage)EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI);

		// Obtain or create and register package
		ProjecttArchitecturalPackageImpl theProjecttArchitecturalPackage = (ProjecttArchitecturalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProjecttArchitecturalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProjecttArchitecturalPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProjecttArchitecturalPackage.createPackageContents();

		// Initialize created meta-data
		theProjecttArchitecturalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProjecttArchitecturalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProjecttArchitecturalPackage.eNS_URI, theProjecttArchitecturalPackage);
		return theProjecttArchitecturalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Contraintes() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Configurations() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurations() {
		return configurationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurations_Lien() {
		return (EReference)configurationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposants() {
		return composantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposants_Propriétés() {
		return (EReference)composantsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposants_Interfacecomposants() {
		return (EReference)composantsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnecteurs() {
		return connecteursEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurs_Glue() {
		return (EReference)connecteursEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurs_Roleconnecteurs() {
		return (EReference)connecteursEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropriétés() {
		return propriétésEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropriétésFonctionnelles() {
		return propriétésFonctionnellesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropriétésNonFonctionnelles() {
		return propriétésNonFonctionnellesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLien() {
		return lienEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceComposants() {
		return interfaceComposantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceComposants_Portscompasants() {
		return (EReference)interfaceComposantsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceComposants_Servicecomposants() {
		return (EReference)interfaceComposantsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortsCompasants() {
		return portsCompasantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceComposants() {
		return serviceComposantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortsComposantsRequis() {
		return portsComposantsRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortsComposantsFournis() {
		return portsComposantsFournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConposantsRequis() {
		return serviceConposantsRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConposantsFournis() {
		return serviceConposantsFournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlue() {
		return glueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_Roleconnecteurs() {
		return (EReference)glueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleConnecteurs() {
		return roleConnecteursEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleConnecteursFournis() {
		return roleConnecteursFournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleConnecteursRequis() {
		return roleConnecteursRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContraintes() {
		return contraintesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingFournis() {
		return bindingFournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingFournis_Portscomposantsfournis() {
		return (EReference)bindingFournisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingFournis_Roleconnecteursfournis() {
		return (EReference)bindingFournisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingRequis() {
		return bindingRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingRequis_Portscomposantsrequis() {
		return (EReference)bindingRequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingRequis_Roleconnecteursrequis() {
		return (EReference)bindingRequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentsRequisFournis() {
		return attachmentsRequisFournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentsRequisFournis_Portscomposantsrequis() {
		return (EReference)attachmentsRequisFournisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentsRequisFournis_Roleconnecteursfournis() {
		return (EReference)attachmentsRequisFournisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentFournisRequis() {
		return attachmentFournisRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentFournisRequis_Portscomposantsfournis() {
		return (EReference)attachmentFournisRequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentFournisRequis_Roleconnecteursrequis() {
		return (EReference)attachmentFournisRequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjecttArchitecturalFactory getProjecttArchitecturalFactory() {
		return (ProjecttArchitecturalFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__CONTRAINTES);
		createEReference(elementEClass, ELEMENT__CONFIGURATIONS);

		configurationsEClass = createEClass(CONFIGURATIONS);
		createEReference(configurationsEClass, CONFIGURATIONS__LIEN);

		composantsEClass = createEClass(COMPOSANTS);
		createEReference(composantsEClass, COMPOSANTS__PROPRIÉTÉS);
		createEReference(composantsEClass, COMPOSANTS__INTERFACECOMPOSANTS);

		connecteursEClass = createEClass(CONNECTEURS);
		createEReference(connecteursEClass, CONNECTEURS__GLUE);
		createEReference(connecteursEClass, CONNECTEURS__ROLECONNECTEURS);

		propriétésEClass = createEClass(PROPRIÉTÉS);

		propriétésFonctionnellesEClass = createEClass(PROPRIÉTÉS_FONCTIONNELLES);

		propriétésNonFonctionnellesEClass = createEClass(PROPRIÉTÉS_NON_FONCTIONNELLES);

		lienEClass = createEClass(LIEN);

		bindingEClass = createEClass(BINDING);

		attachmentEClass = createEClass(ATTACHMENT);

		interfaceComposantsEClass = createEClass(INTERFACE_COMPOSANTS);
		createEReference(interfaceComposantsEClass, INTERFACE_COMPOSANTS__PORTSCOMPASANTS);
		createEReference(interfaceComposantsEClass, INTERFACE_COMPOSANTS__SERVICECOMPOSANTS);

		portsCompasantsEClass = createEClass(PORTS_COMPASANTS);

		serviceComposantsEClass = createEClass(SERVICE_COMPOSANTS);

		portsComposantsRequisEClass = createEClass(PORTS_COMPOSANTS_REQUIS);

		portsComposantsFournisEClass = createEClass(PORTS_COMPOSANTS_FOURNIS);

		serviceConposantsRequisEClass = createEClass(SERVICE_CONPOSANTS_REQUIS);

		serviceConposantsFournisEClass = createEClass(SERVICE_CONPOSANTS_FOURNIS);

		glueEClass = createEClass(GLUE);
		createEReference(glueEClass, GLUE__ROLECONNECTEURS);

		roleConnecteursEClass = createEClass(ROLE_CONNECTEURS);

		roleConnecteursFournisEClass = createEClass(ROLE_CONNECTEURS_FOURNIS);

		roleConnecteursRequisEClass = createEClass(ROLE_CONNECTEURS_REQUIS);

		contraintesEClass = createEClass(CONTRAINTES);

		bindingFournisEClass = createEClass(BINDING_FOURNIS);
		createEReference(bindingFournisEClass, BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS);
		createEReference(bindingFournisEClass, BINDING_FOURNIS__ROLECONNECTEURSFOURNIS);

		bindingRequisEClass = createEClass(BINDING_REQUIS);
		createEReference(bindingRequisEClass, BINDING_REQUIS__PORTSCOMPOSANTSREQUIS);
		createEReference(bindingRequisEClass, BINDING_REQUIS__ROLECONNECTEURSREQUIS);

		attachmentsRequisFournisEClass = createEClass(ATTACHMENTS_REQUIS_FOURNIS);
		createEReference(attachmentsRequisFournisEClass, ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS);
		createEReference(attachmentsRequisFournisEClass, ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS);

		attachmentFournisRequisEClass = createEClass(ATTACHMENT_FOURNIS_REQUIS);
		createEReference(attachmentFournisRequisEClass, ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS);
		createEReference(attachmentFournisRequisEClass, ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationsEClass.getESuperTypes().add(this.getElement());
		composantsEClass.getESuperTypes().add(this.getElement());
		connecteursEClass.getESuperTypes().add(this.getElement());
		propriétésFonctionnellesEClass.getESuperTypes().add(this.getPropriétés());
		propriétésNonFonctionnellesEClass.getESuperTypes().add(this.getPropriétés());
		bindingEClass.getESuperTypes().add(this.getLien());
		attachmentEClass.getESuperTypes().add(this.getLien());
		portsComposantsRequisEClass.getESuperTypes().add(this.getPortsCompasants());
		portsComposantsFournisEClass.getESuperTypes().add(this.getPortsCompasants());
		serviceConposantsRequisEClass.getESuperTypes().add(this.getServiceComposants());
		serviceConposantsFournisEClass.getESuperTypes().add(this.getServiceComposants());
		roleConnecteursFournisEClass.getESuperTypes().add(this.getRoleConnecteurs());
		roleConnecteursRequisEClass.getESuperTypes().add(this.getRoleConnecteurs());
		bindingFournisEClass.getESuperTypes().add(this.getBinding());
		bindingRequisEClass.getESuperTypes().add(this.getBinding());
		attachmentsRequisFournisEClass.getESuperTypes().add(this.getAttachment());
		attachmentFournisRequisEClass.getESuperTypes().add(this.getAttachment());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Contraintes(), this.getContraintes(), null, "contraintes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Configurations(), this.getConfigurations(), null, "configurations", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationsEClass, Configurations.class, "Configurations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurations_Lien(), this.getLien(), null, "lien", null, 0, -1, Configurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composantsEClass, Composants.class, "Composants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposants_Propriétés(), this.getPropriétés(), null, "propriétés", null, 0, -1, Composants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposants_Interfacecomposants(), this.getInterfaceComposants(), null, "interfacecomposants", null, 0, -1, Composants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connecteursEClass, Connecteurs.class, "Connecteurs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnecteurs_Glue(), this.getGlue(), null, "glue", null, 0, -1, Connecteurs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurs_Roleconnecteurs(), this.getRoleConnecteurs(), null, "roleconnecteurs", null, 0, -1, Connecteurs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propriétésEClass, Propriétés.class, "Propriétés", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propriétésFonctionnellesEClass, PropriétésFonctionnelles.class, "PropriétésFonctionnelles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propriétésNonFonctionnellesEClass, PropriétésNonFonctionnelles.class, "PropriétésNonFonctionnelles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienEClass, Lien.class, "Lien", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceComposantsEClass, InterfaceComposants.class, "InterfaceComposants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceComposants_Portscompasants(), this.getPortsCompasants(), null, "portscompasants", null, 0, -1, InterfaceComposants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceComposants_Servicecomposants(), this.getServiceComposants(), null, "servicecomposants", null, 0, -1, InterfaceComposants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portsCompasantsEClass, PortsCompasants.class, "PortsCompasants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceComposantsEClass, ServiceComposants.class, "ServiceComposants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portsComposantsRequisEClass, PortsComposantsRequis.class, "PortsComposantsRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portsComposantsFournisEClass, PortsComposantsFournis.class, "PortsComposantsFournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceConposantsRequisEClass, ServiceConposantsRequis.class, "ServiceConposantsRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceConposantsFournisEClass, ServiceConposantsFournis.class, "ServiceConposantsFournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(glueEClass, Glue.class, "Glue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlue_Roleconnecteurs(), this.getRoleConnecteurs(), null, "roleconnecteurs", null, 0, -1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleConnecteursEClass, RoleConnecteurs.class, "RoleConnecteurs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleConnecteursFournisEClass, RoleConnecteursFournis.class, "RoleConnecteursFournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleConnecteursRequisEClass, RoleConnecteursRequis.class, "RoleConnecteursRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contraintesEClass, Contraintes.class, "Contraintes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingFournisEClass, BindingFournis.class, "BindingFournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingFournis_Portscomposantsfournis(), this.getPortsComposantsFournis(), null, "portscomposantsfournis", null, 0, 1, BindingFournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingFournis_Roleconnecteursfournis(), this.getRoleConnecteursFournis(), null, "roleconnecteursfournis", null, 0, 1, BindingFournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingRequisEClass, BindingRequis.class, "BindingRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingRequis_Portscomposantsrequis(), this.getPortsComposantsRequis(), null, "portscomposantsrequis", null, 0, 1, BindingRequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingRequis_Roleconnecteursrequis(), this.getRoleConnecteursRequis(), null, "roleconnecteursrequis", null, 0, 1, BindingRequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentsRequisFournisEClass, AttachmentsRequisFournis.class, "AttachmentsRequisFournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentsRequisFournis_Portscomposantsrequis(), this.getPortsComposantsRequis(), null, "portscomposantsrequis", null, 0, 1, AttachmentsRequisFournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentsRequisFournis_Roleconnecteursfournis(), this.getRoleConnecteursFournis(), null, "roleconnecteursfournis", null, 0, 1, AttachmentsRequisFournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentFournisRequisEClass, AttachmentFournisRequis.class, "AttachmentFournisRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentFournisRequis_Portscomposantsfournis(), this.getPortsComposantsFournis(), null, "portscomposantsfournis", null, 0, 1, AttachmentFournisRequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachmentFournisRequis_Roleconnecteursrequis(), this.getRoleConnecteursRequis(), null, "roleconnecteursrequis", null, 0, 1, AttachmentFournisRequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProjecttArchitecturalPackageImpl
