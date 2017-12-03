/**
 */
package projecttArchitectural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.BindingRequis#getPortscomposantsrequis <em>Portscomposantsrequis</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getBindingRequis()
 * @model
 * @generated
 */
public interface BindingRequis extends Binding {
	/**
	 * Returns the value of the '<em><b>Portscomposantsrequis</b></em>' reference list.
	 * The list contents are of type {@link projecttArchitectural.PortsComposantsRequis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portscomposantsrequis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portscomposantsrequis</em>' reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getBindingRequis_Portscomposantsrequis()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<PortsComposantsRequis> getPortscomposantsrequis();

} // BindingRequis
