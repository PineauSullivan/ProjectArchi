/**
 * 
 */
package M1.ClientServeur.Composant;

import Donnees.Message;
import M1.ClientServeur.Interface.InterfaceServeur;
import M2.Composant;
import M2.Configuration;

/**
 * @author sullivan
 *
 */
public class ComposantServeur extends Composant {

	public ComposantServeur(){
		
		super("ComposantServeur");
		
		InterfaceServeur IS = new InterfaceServeur();
		
		this.add(IS);

		IS.setComposant(this);

	}
	
}
