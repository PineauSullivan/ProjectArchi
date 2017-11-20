/**
 */
package projecttArchitectural.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import projecttArchitectural.*;

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
 * @see projecttArchitectural.ProjecttArchitecturalPackage
 * @generated
 */
public class ProjecttArchitecturalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjecttArchitecturalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjecttArchitecturalSwitch() {
		if (modelPackage == null) {
			modelPackage = ProjecttArchitecturalPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProjecttArchitecturalPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.CONFIGURATIONS: {
				Configurations configurations = (Configurations)theEObject;
				T result = caseConfigurations(configurations);
				if (result == null) result = caseElement(configurations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.COMPOSANTS: {
				Composants composants = (Composants)theEObject;
				T result = caseComposants(composants);
				if (result == null) result = caseElement(composants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.CONNECTEURS: {
				Connecteurs connecteurs = (Connecteurs)theEObject;
				T result = caseConnecteurs(connecteurs);
				if (result == null) result = caseElement(connecteurs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.PROPRIÉTÉS: {
				Propriétés propriétés = (Propriétés)theEObject;
				T result = casePropriétés(propriétés);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.PROPRIÉTÉS_FONCTIONNELLES: {
				PropriétésFonctionnelles propriétésFonctionnelles = (PropriétésFonctionnelles)theEObject;
				T result = casePropriétésFonctionnelles(propriétésFonctionnelles);
				if (result == null) result = casePropriétés(propriétésFonctionnelles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.PROPRIÉTÉS_NON_FONCTIONNELLES: {
				PropriétésNonFonctionnelles propriétésNonFonctionnelles = (PropriétésNonFonctionnelles)theEObject;
				T result = casePropriétésNonFonctionnelles(propriétésNonFonctionnelles);
				if (result == null) result = casePropriétés(propriétésNonFonctionnelles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.LIEN: {
				Lien lien = (Lien)theEObject;
				T result = caseLien(lien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseLien(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = caseLien(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS: {
				InterfaceComposants interfaceComposants = (InterfaceComposants)theEObject;
				T result = caseInterfaceComposants(interfaceComposants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.PORTS_COMPASANTS: {
				PortsCompasants portsCompasants = (PortsCompasants)theEObject;
				T result = casePortsCompasants(portsCompasants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.SERVICE_COMPOSANTS: {
				ServiceComposants serviceComposants = (ServiceComposants)theEObject;
				T result = caseServiceComposants(serviceComposants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS: {
				PortsComposantsRequis portsComposantsRequis = (PortsComposantsRequis)theEObject;
				T result = casePortsComposantsRequis(portsComposantsRequis);
				if (result == null) result = casePortsCompasants(portsComposantsRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS: {
				PortsComposantsFournis portsComposantsFournis = (PortsComposantsFournis)theEObject;
				T result = casePortsComposantsFournis(portsComposantsFournis);
				if (result == null) result = casePortsCompasants(portsComposantsFournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.SERVICE_CONPOSANTS_REQUIS: {
				ServiceConposantsRequis serviceConposantsRequis = (ServiceConposantsRequis)theEObject;
				T result = caseServiceConposantsRequis(serviceConposantsRequis);
				if (result == null) result = caseServiceComposants(serviceConposantsRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.SERVICE_CONPOSANTS_FOURNIS: {
				ServiceConposantsFournis serviceConposantsFournis = (ServiceConposantsFournis)theEObject;
				T result = caseServiceConposantsFournis(serviceConposantsFournis);
				if (result == null) result = caseServiceComposants(serviceConposantsFournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.GLUE: {
				Glue glue = (Glue)theEObject;
				T result = caseGlue(glue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.ROLE_CONNECTEURS: {
				RoleConnecteurs roleConnecteurs = (RoleConnecteurs)theEObject;
				T result = caseRoleConnecteurs(roleConnecteurs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS: {
				RoleConnecteursFournis roleConnecteursFournis = (RoleConnecteursFournis)theEObject;
				T result = caseRoleConnecteursFournis(roleConnecteursFournis);
				if (result == null) result = caseRoleConnecteurs(roleConnecteursFournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS: {
				RoleConnecteursRequis roleConnecteursRequis = (RoleConnecteursRequis)theEObject;
				T result = caseRoleConnecteursRequis(roleConnecteursRequis);
				if (result == null) result = caseRoleConnecteurs(roleConnecteursRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.CONTRAINTES: {
				Contraintes contraintes = (Contraintes)theEObject;
				T result = caseContraintes(contraintes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.BINDING_FOURNIS: {
				BindingFournis bindingFournis = (BindingFournis)theEObject;
				T result = caseBindingFournis(bindingFournis);
				if (result == null) result = caseBinding(bindingFournis);
				if (result == null) result = caseLien(bindingFournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.BINDING_REQUIS: {
				BindingRequis bindingRequis = (BindingRequis)theEObject;
				T result = caseBindingRequis(bindingRequis);
				if (result == null) result = caseBinding(bindingRequis);
				if (result == null) result = caseLien(bindingRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS: {
				AttachmentsRequisFournis attachmentsRequisFournis = (AttachmentsRequisFournis)theEObject;
				T result = caseAttachmentsRequisFournis(attachmentsRequisFournis);
				if (result == null) result = caseAttachment(attachmentsRequisFournis);
				if (result == null) result = caseLien(attachmentsRequisFournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS: {
				AttachmentFournisRequis attachmentFournisRequis = (AttachmentFournisRequis)theEObject;
				T result = caseAttachmentFournisRequis(attachmentFournisRequis);
				if (result == null) result = caseAttachment(attachmentFournisRequis);
				if (result == null) result = caseLien(attachmentFournisRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurations(Configurations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposants(Composants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteurs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteurs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteurs(Connecteurs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propriétés</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propriétés</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropriétés(Propriétés object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propriétés Fonctionnelles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propriétés Fonctionnelles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropriétésFonctionnelles(PropriétésFonctionnelles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propriétés Non Fonctionnelles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propriétés Non Fonctionnelles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropriétésNonFonctionnelles(PropriétésNonFonctionnelles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLien(Lien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Composants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Composants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceComposants(InterfaceComposants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Compasants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Compasants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsCompasants(PortsCompasants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Composants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Composants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceComposants(ServiceComposants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Composants Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Composants Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsComposantsRequis(PortsComposantsRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Composants Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Composants Fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsComposantsFournis(PortsComposantsFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Conposants Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Conposants Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConposantsRequis(ServiceConposantsRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Conposants Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Conposants Fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConposantsFournis(ServiceConposantsFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Connecteurs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Connecteurs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleConnecteurs(RoleConnecteurs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Connecteurs Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Connecteurs Fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleConnecteursFournis(RoleConnecteursFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Connecteurs Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Connecteurs Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleConnecteursRequis(RoleConnecteursRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contraintes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contraintes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContraintes(Contraintes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingFournis(BindingFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingRequis(BindingRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachments Requis Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachments Requis Fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentsRequisFournis(AttachmentsRequisFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Fournis Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Fournis Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentFournisRequis(AttachmentFournisRequis object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ProjecttArchitecturalSwitch
