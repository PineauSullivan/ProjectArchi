/**
 */
package projecttArchitectural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.Configurations#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getConfigurations()
 * @model
 * @generated
 */
public interface Configurations extends Element {
	/**
	 * Returns the value of the '<em><b>Lien</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.Lien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getConfigurations_Lien()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lien> getLien();

} // Configurations
