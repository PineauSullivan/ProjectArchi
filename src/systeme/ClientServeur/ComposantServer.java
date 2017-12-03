/**
 */
package systeme.ClientServeur;

import org.eclipse.emf.common.util.EList;

import projecttArchitectural.Composants;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.ComposantServer#getInterfaceserveur <em>Interfaceserveur</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getComposantServer()
 * @model
 * @generated
 */
public interface ComposantServer extends Composants {
	/**
	 * Returns the value of the '<em><b>Interfaceserveur</b></em>' containment reference list.
	 * The list contents are of type {@link systeme.ClientServeur.InterfaceServeur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceserveur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceserveur</em>' containment reference list.
	 * @see systeme.ClientServeur.ClientServeurPackage#getComposantServer_Interfaceserveur()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceServeur> getInterfaceserveur();

} // ComposantServer
