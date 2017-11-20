/**
 */
package projecttArchitectural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connecteurs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.Connecteurs#getGlue <em>Glue</em>}</li>
 *   <li>{@link projecttArchitectural.Connecteurs#getRoleconnecteurs <em>Roleconnecteurs</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getConnecteurs()
 * @model
 * @generated
 */
public interface Connecteurs extends Element {
	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.Glue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getConnecteurs_Glue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Glue> getGlue();

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
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getConnecteurs_Roleconnecteurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleConnecteurs> getRoleconnecteurs();

} // Connecteurs
