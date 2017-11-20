/**
 */
package projecttArchitectural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composants</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.Composants#getPropriétés <em>Propriétés</em>}</li>
 *   <li>{@link projecttArchitectural.Composants#getInterfacecomposants <em>Interfacecomposants</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getComposants()
 * @model
 * @generated
 */
public interface Composants extends Element {
	/**
	 * Returns the value of the '<em><b>Propriétés</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.Propriétés}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propriétés</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propriétés</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getComposants_Propriétés()
	 * @model containment="true"
	 * @generated
	 */
	EList<Propriétés> getPropriétés();

	/**
	 * Returns the value of the '<em><b>Interfacecomposants</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.InterfaceComposants}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacecomposants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacecomposants</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getComposants_Interfacecomposants()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceComposants> getInterfacecomposants();

} // Composants
