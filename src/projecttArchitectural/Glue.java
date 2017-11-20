/**
 */
package projecttArchitectural;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.Glue#getRoleconnecteurs <em>Roleconnecteurs</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getGlue()
 * @model
 * @generated
 */
public interface Glue extends EObject {
	/**
	 * Returns the value of the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.RoleConnecteurs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roleconnecteurs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roleconnecteurs</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getGlue_Roleconnecteurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleConnecteurs> getRoleconnecteurs();

} // Glue
