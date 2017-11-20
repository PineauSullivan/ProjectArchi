/**
 */
package projecttArchitectural;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see projecttArchitectural.ProjecttArchitecturalPackage
 * @generated
 */
public interface ProjecttArchitecturalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjecttArchitecturalFactory eINSTANCE = projecttArchitectural.impl.ProjecttArchitecturalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configurations</em>'.
	 * @generated
	 */
	Configurations createConfigurations();

	/**
	 * Returns a new object of class '<em>Composants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composants</em>'.
	 * @generated
	 */
	Composants createComposants();

	/**
	 * Returns a new object of class '<em>Connecteurs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connecteurs</em>'.
	 * @generated
	 */
	Connecteurs createConnecteurs();

	/**
	 * Returns a new object of class '<em>Propriétés</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriétés</em>'.
	 * @generated
	 */
	Propriétés createPropriétés();

	/**
	 * Returns a new object of class '<em>Propriétés Fonctionnelles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriétés Fonctionnelles</em>'.
	 * @generated
	 */
	PropriétésFonctionnelles createPropriétésFonctionnelles();

	/**
	 * Returns a new object of class '<em>Propriétés Non Fonctionnelles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriétés Non Fonctionnelles</em>'.
	 * @generated
	 */
	PropriétésNonFonctionnelles createPropriétésNonFonctionnelles();

	/**
	 * Returns a new object of class '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lien</em>'.
	 * @generated
	 */
	Lien createLien();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Interface Composants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Composants</em>'.
	 * @generated
	 */
	InterfaceComposants createInterfaceComposants();

	/**
	 * Returns a new object of class '<em>Ports Compasants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ports Compasants</em>'.
	 * @generated
	 */
	PortsCompasants createPortsCompasants();

	/**
	 * Returns a new object of class '<em>Service Composants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Composants</em>'.
	 * @generated
	 */
	ServiceComposants createServiceComposants();

	/**
	 * Returns a new object of class '<em>Ports Composants Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ports Composants Requis</em>'.
	 * @generated
	 */
	PortsComposantsRequis createPortsComposantsRequis();

	/**
	 * Returns a new object of class '<em>Ports Composants Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ports Composants Fournis</em>'.
	 * @generated
	 */
	PortsComposantsFournis createPortsComposantsFournis();

	/**
	 * Returns a new object of class '<em>Service Conposants Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Conposants Requis</em>'.
	 * @generated
	 */
	ServiceConposantsRequis createServiceConposantsRequis();

	/**
	 * Returns a new object of class '<em>Service Conposants Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Conposants Fournis</em>'.
	 * @generated
	 */
	ServiceConposantsFournis createServiceConposantsFournis();

	/**
	 * Returns a new object of class '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue</em>'.
	 * @generated
	 */
	Glue createGlue();

	/**
	 * Returns a new object of class '<em>Role Connecteurs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Connecteurs</em>'.
	 * @generated
	 */
	RoleConnecteurs createRoleConnecteurs();

	/**
	 * Returns a new object of class '<em>Role Connecteurs Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Connecteurs Fournis</em>'.
	 * @generated
	 */
	RoleConnecteursFournis createRoleConnecteursFournis();

	/**
	 * Returns a new object of class '<em>Role Connecteurs Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Connecteurs Requis</em>'.
	 * @generated
	 */
	RoleConnecteursRequis createRoleConnecteursRequis();

	/**
	 * Returns a new object of class '<em>Contraintes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contraintes</em>'.
	 * @generated
	 */
	Contraintes createContraintes();

	/**
	 * Returns a new object of class '<em>Binding Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Fournis</em>'.
	 * @generated
	 */
	BindingFournis createBindingFournis();

	/**
	 * Returns a new object of class '<em>Binding Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Requis</em>'.
	 * @generated
	 */
	BindingRequis createBindingRequis();

	/**
	 * Returns a new object of class '<em>Attachments Requis Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachments Requis Fournis</em>'.
	 * @generated
	 */
	AttachmentsRequisFournis createAttachmentsRequisFournis();

	/**
	 * Returns a new object of class '<em>Attachment Fournis Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Fournis Requis</em>'.
	 * @generated
	 */
	AttachmentFournisRequis createAttachmentFournisRequis();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjecttArchitecturalPackage getProjecttArchitecturalPackage();

} //ProjecttArchitecturalFactory
