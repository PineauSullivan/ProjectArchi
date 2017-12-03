/**
 */
package projecttArchitectural;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.Element#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link projecttArchitectural.Element#getContraintes <em>Contraintes</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.Configurations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getElement_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configurations> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Contraintes</b></em>' containment reference list.
	 * The list contents are of type {@link projecttArchitectural.Contraintes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraintes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes</em>' containment reference list.
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getElement_Contraintes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contraintes> getContraintes();

} // Element
