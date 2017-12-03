/**
 */
package systeme.ClientServeur;

import org.eclipse.emf.common.util.EList;

import projecttArchitectural.Composants;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.ComposantClient#getInterfaceclient <em>Interfaceclient</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getComposantClient()
 * @model
 * @generated
 */
public interface ComposantClient extends Composants {
	/**
	 * Returns the value of the '<em><b>Interfaceclient</b></em>' containment reference list.
	 * The list contents are of type {@link systeme.ClientServeur.InterfaceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceclient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceclient</em>' containment reference list.
	 * @see systeme.ClientServeur.ClientServeurPackage#getComposantClient_Interfaceclient()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClient> getInterfaceclient();

} // ComposantClient
