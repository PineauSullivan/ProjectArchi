/**
 */
package projecttArchitectural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Fournis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.BindingFournis#getPortscomposantsfournis <em>Portscomposantsfournis</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getBindingFournis()
 * @model
 * @generated
 */
public interface BindingFournis extends Binding {
	/**
	 * Returns the value of the '<em><b>Portscomposantsfournis</b></em>' reference list.
	 * The list contents are of type {@link projecttArchitectural.PortsComposantsFournis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portscomposantsfournis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portscomposantsfournis</em>' reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getBindingFournis_Portscomposantsfournis()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<PortsComposantsFournis> getPortscomposantsfournis();

} // BindingFournis
