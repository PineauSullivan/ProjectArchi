/**
 */
package projecttArchitectural.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import projecttArchitectural.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see projecttArchitectural.ProjecttArchitecturalPackage
 * @generated
 */
public class ProjecttArchitecturalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjecttArchitecturalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjecttArchitecturalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProjecttArchitecturalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjecttArchitecturalSwitch<Adapter> modelSwitch =
		new ProjecttArchitecturalSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseConfigurations(Configurations object) {
				return createConfigurationsAdapter();
			}
			@Override
			public Adapter caseComposants(Composants object) {
				return createComposantsAdapter();
			}
			@Override
			public Adapter caseConnecteurs(Connecteurs object) {
				return createConnecteursAdapter();
			}
			@Override
			public Adapter casePropriétés(Propriétés object) {
				return createPropriétésAdapter();
			}
			@Override
			public Adapter casePropriétésFonctionnelles(PropriétésFonctionnelles object) {
				return createPropriétésFonctionnellesAdapter();
			}
			@Override
			public Adapter casePropriétésNonFonctionnelles(PropriétésNonFonctionnelles object) {
				return createPropriétésNonFonctionnellesAdapter();
			}
			@Override
			public Adapter caseLien(Lien object) {
				return createLienAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseInterfaceComposants(InterfaceComposants object) {
				return createInterfaceComposantsAdapter();
			}
			@Override
			public Adapter casePortsComposants(PortsComposants object) {
				return createPortsComposantsAdapter();
			}
			@Override
			public Adapter caseServiceComposants(ServiceComposants object) {
				return createServiceComposantsAdapter();
			}
			@Override
			public Adapter casePortsComposantsRequis(PortsComposantsRequis object) {
				return createPortsComposantsRequisAdapter();
			}
			@Override
			public Adapter casePortsComposantsFournis(PortsComposantsFournis object) {
				return createPortsComposantsFournisAdapter();
			}
			@Override
			public Adapter caseServiceConposantsRequis(ServiceConposantsRequis object) {
				return createServiceConposantsRequisAdapter();
			}
			@Override
			public Adapter caseServiceConposantsFournis(ServiceConposantsFournis object) {
				return createServiceConposantsFournisAdapter();
			}
			@Override
			public Adapter caseGlue(Glue object) {
				return createGlueAdapter();
			}
			@Override
			public Adapter caseRoleConnecteurs(RoleConnecteurs object) {
				return createRoleConnecteursAdapter();
			}
			@Override
			public Adapter caseRoleConnecteursFournis(RoleConnecteursFournis object) {
				return createRoleConnecteursFournisAdapter();
			}
			@Override
			public Adapter caseRoleConnecteursRequis(RoleConnecteursRequis object) {
				return createRoleConnecteursRequisAdapter();
			}
			@Override
			public Adapter caseContraintes(Contraintes object) {
				return createContraintesAdapter();
			}
			@Override
			public Adapter caseBindingFournis(BindingFournis object) {
				return createBindingFournisAdapter();
			}
			@Override
			public Adapter caseBindingRequis(BindingRequis object) {
				return createBindingRequisAdapter();
			}
			@Override
			public Adapter caseAttachmentsRequisFournis(AttachmentsRequisFournis object) {
				return createAttachmentsRequisFournisAdapter();
			}
			@Override
			public Adapter caseAttachmentFournisRequis(AttachmentFournisRequis object) {
				return createAttachmentFournisRequisAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Configurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Configurations
	 * @generated
	 */
	public Adapter createConfigurationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Composants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Composants
	 * @generated
	 */
	public Adapter createComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Connecteurs <em>Connecteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Connecteurs
	 * @generated
	 */
	public Adapter createConnecteursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Propriétés <em>Propriétés</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Propriétés
	 * @generated
	 */
	public Adapter createPropriétésAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.PropriétésFonctionnelles <em>Propriétés Fonctionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.PropriétésFonctionnelles
	 * @generated
	 */
	public Adapter createPropriétésFonctionnellesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.PropriétésNonFonctionnelles <em>Propriétés Non Fonctionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.PropriétésNonFonctionnelles
	 * @generated
	 */
	public Adapter createPropriétésNonFonctionnellesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Lien
	 * @generated
	 */
	public Adapter createLienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.InterfaceComposants <em>Interface Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.InterfaceComposants
	 * @generated
	 */
	public Adapter createInterfaceComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.PortsComposants <em>Ports Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.PortsComposants
	 * @generated
	 */
	public Adapter createPortsComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.ServiceComposants <em>Service Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.ServiceComposants
	 * @generated
	 */
	public Adapter createServiceComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.PortsComposantsRequis <em>Ports Composants Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.PortsComposantsRequis
	 * @generated
	 */
	public Adapter createPortsComposantsRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.PortsComposantsFournis <em>Ports Composants Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.PortsComposantsFournis
	 * @generated
	 */
	public Adapter createPortsComposantsFournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.ServiceConposantsRequis <em>Service Conposants Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.ServiceConposantsRequis
	 * @generated
	 */
	public Adapter createServiceConposantsRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.ServiceConposantsFournis <em>Service Conposants Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.ServiceConposantsFournis
	 * @generated
	 */
	public Adapter createServiceConposantsFournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.RoleConnecteurs <em>Role Connecteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.RoleConnecteurs
	 * @generated
	 */
	public Adapter createRoleConnecteursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.RoleConnecteursFournis <em>Role Connecteurs Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.RoleConnecteursFournis
	 * @generated
	 */
	public Adapter createRoleConnecteursFournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.RoleConnecteursRequis <em>Role Connecteurs Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.RoleConnecteursRequis
	 * @generated
	 */
	public Adapter createRoleConnecteursRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Contraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Contraintes
	 * @generated
	 */
	public Adapter createContraintesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.BindingFournis <em>Binding Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.BindingFournis
	 * @generated
	 */
	public Adapter createBindingFournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.BindingRequis <em>Binding Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.BindingRequis
	 * @generated
	 */
	public Adapter createBindingRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.AttachmentsRequisFournis <em>Attachments Requis Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.AttachmentsRequisFournis
	 * @generated
	 */
	public Adapter createAttachmentsRequisFournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.AttachmentFournisRequis <em>Attachment Fournis Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.AttachmentFournisRequis
	 * @generated
	 */
	public Adapter createAttachmentFournisRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProjecttArchitecturalAdapterFactory
