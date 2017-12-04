/**
 * 
 */
package M1.ClientServeur.Composant;

import M1.ClientServeur.Interface.InterfaceServeur;
import M2.Composant;

/**
 * @author sullivan
 *
 */
public class ComposantServeur extends Composant {

	public ComposantServeur(){
		
		super("ComposantServeur");
		
		InterfaceServeur IS = new InterfaceServeur();
		
		this.add(IS);
	}
}
