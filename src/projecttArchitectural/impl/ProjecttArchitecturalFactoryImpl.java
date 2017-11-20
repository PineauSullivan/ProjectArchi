/**
 */
package projecttArchitectural.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projecttArchitectural.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjecttArchitecturalFactoryImpl extends EFactoryImpl implements ProjecttArchitecturalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjecttArchitecturalFactory init() {
		try {
			ProjecttArchitecturalFactory theProjecttArchitecturalFactory = (ProjecttArchitecturalFactory)EPackage.Registry.INSTANCE.getEFactory(ProjecttArchitecturalPackage.eNS_URI);
			if (theProjecttArchitecturalFactory != null) {
				return theProjecttArchitecturalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjecttArchitecturalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjecttArchitecturalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProjecttArchitecturalPackage.ELEMENT: return createElement();
			case ProjecttArchitecturalPackage.CONFIGURATIONS: return createConfigurations();
			case ProjecttArchitecturalPackage.COMPOSANTS: return createComposants();
			case ProjecttArchitecturalPackage.CONNECTEURS: return createConnecteurs();
			case ProjecttArchitecturalPackage.PROPRIÉTÉS: return createPropriétés();
			case ProjecttArchitecturalPackage.PROPRIÉTÉS_FONCTIONNELLES: return createPropriétésFonctionnelles();
			case ProjecttArchitecturalPackage.PROPRIÉTÉS_NON_FONCTIONNELLES: return createPropriétésNonFonctionnelles();
			case ProjecttArchitecturalPackage.LIEN: return createLien();
			case ProjecttArchitecturalPackage.BINDING: return createBinding();
			case ProjecttArchitecturalPackage.ATTACHMENT: return createAttachment();
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS: return createInterfaceComposants();
			case ProjecttArchitecturalPackage.PORTS_COMPASANTS: return createPortsCompasants();
			case ProjecttArchitecturalPackage.SERVICE_COMPOSANTS: return createServiceComposants();
			case ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS: return createPortsComposantsRequis();
			case ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS: return createPortsComposantsFournis();
			case ProjecttArchitecturalPackage.SERVICE_CONPOSANTS_REQUIS: return createServiceConposantsRequis();
			case ProjecttArchitecturalPackage.SERVICE_CONPOSANTS_FOURNIS: return createServiceConposantsFournis();
			case ProjecttArchitecturalPackage.GLUE: return createGlue();
			case ProjecttArchitecturalPackage.ROLE_CONNECTEURS: return createRoleConnecteurs();
			case ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS: return createRoleConnecteursFournis();
			case ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS: return createRoleConnecteursRequis();
			case ProjecttArchitecturalPackage.CONTRAINTES: return createContraintes();
			case ProjecttArchitecturalPackage.BINDING_FOURNIS: return createBindingFournis();
			case ProjecttArchitecturalPackage.BINDING_REQUIS: return createBindingRequis();
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS: return createAttachmentsRequisFournis();
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS: return createAttachmentFournisRequis();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configurations createConfigurations() {
		ConfigurationsImpl configurations = new ConfigurationsImpl();
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composants createComposants() {
		ComposantsImpl composants = new ComposantsImpl();
		return composants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteurs createConnecteurs() {
		ConnecteursImpl connecteurs = new ConnecteursImpl();
		return connecteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propriétés createPropriétés() {
		PropriétésImpl propriétés = new PropriétésImpl();
		return propriétés;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropriétésFonctionnelles createPropriétésFonctionnelles() {
		PropriétésFonctionnellesImpl propriétésFonctionnelles = new PropriétésFonctionnellesImpl();
		return propriétésFonctionnelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropriétésNonFonctionnelles createPropriétésNonFonctionnelles() {
		PropriétésNonFonctionnellesImpl propriétésNonFonctionnelles = new PropriétésNonFonctionnellesImpl();
		return propriétésNonFonctionnelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lien createLien() {
		LienImpl lien = new LienImpl();
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceComposants createInterfaceComposants() {
		InterfaceComposantsImpl interfaceComposants = new InterfaceComposantsImpl();
		return interfaceComposants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsCompasants createPortsCompasants() {
		PortsCompasantsImpl portsCompasants = new PortsCompasantsImpl();
		return portsCompasants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComposants createServiceComposants() {
		ServiceComposantsImpl serviceComposants = new ServiceComposantsImpl();
		return serviceComposants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsComposantsRequis createPortsComposantsRequis() {
		PortsComposantsRequisImpl portsComposantsRequis = new PortsComposantsRequisImpl();
		return portsComposantsRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsComposantsFournis createPortsComposantsFournis() {
		PortsComposantsFournisImpl portsComposantsFournis = new PortsComposantsFournisImpl();
		return portsComposantsFournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConposantsRequis createServiceConposantsRequis() {
		ServiceConposantsRequisImpl serviceConposantsRequis = new ServiceConposantsRequisImpl();
		return serviceConposantsRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConposantsFournis createServiceConposantsFournis() {
		ServiceConposantsFournisImpl serviceConposantsFournis = new ServiceConposantsFournisImpl();
		return serviceConposantsFournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteurs createRoleConnecteurs() {
		RoleConnecteursImpl roleConnecteurs = new RoleConnecteursImpl();
		return roleConnecteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursFournis createRoleConnecteursFournis() {
		RoleConnecteursFournisImpl roleConnecteursFournis = new RoleConnecteursFournisImpl();
		return roleConnecteursFournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursRequis createRoleConnecteursRequis() {
		RoleConnecteursRequisImpl roleConnecteursRequis = new RoleConnecteursRequisImpl();
		return roleConnecteursRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contraintes createContraintes() {
		ContraintesImpl contraintes = new ContraintesImpl();
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFournis createBindingFournis() {
		BindingFournisImpl bindingFournis = new BindingFournisImpl();
		return bindingFournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingRequis createBindingRequis() {
		BindingRequisImpl bindingRequis = new BindingRequisImpl();
		return bindingRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentsRequisFournis createAttachmentsRequisFournis() {
		AttachmentsRequisFournisImpl attachmentsRequisFournis = new AttachmentsRequisFournisImpl();
		return attachmentsRequisFournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentFournisRequis createAttachmentFournisRequis() {
		AttachmentFournisRequisImpl attachmentFournisRequis = new AttachmentFournisRequisImpl();
		return attachmentFournisRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjecttArchitecturalPackage getProjecttArchitecturalPackage() {
		return (ProjecttArchitecturalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjecttArchitecturalPackage getPackage() {
		return ProjecttArchitecturalPackage.eINSTANCE;
	}

} //ProjecttArchitecturalFactoryImpl
