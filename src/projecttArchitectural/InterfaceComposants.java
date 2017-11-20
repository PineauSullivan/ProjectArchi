/**
 */
package projecttArchitectural;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Composants</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.InterfaceComposants#getPortscompasants <em>Portscompasants</em>}</li>
 *   <li>{@link projecttArchitectural.InterfaceComposants#getServicecomposants <em>Servicecomposants</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getInterfaceComposants()
 * @model
 * @generated
 */
public interface InterfaceComposants extends EObject {
	/**
	 * Returns the value of the '<em><b>Portscompasants</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.PortsCompasants}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portscompasants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portscompasants</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getInterfaceComposants_Portscompasants()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortsCompasants> getPortscompasants();

	/**
	 * Returns the value of the '<em><b>Servicecomposants</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.ServiceComposants}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicecomposants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicecomposants</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getInterfaceComposants_Servicecomposants()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceComposants> getServicecomposants();

} // InterfaceComposants
