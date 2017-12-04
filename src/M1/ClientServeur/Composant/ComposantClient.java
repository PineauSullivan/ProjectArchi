/**
 * 
 */
package M1.ClientServeur.Composant;

import M1.ClientServeur.Interface.InterfaceClient;
import M2.Composant;

/**
 * @author sullivan
 *
 */
public class ComposantClient extends Composant{

	public ComposantClient(){
		super("ComposantClient");
		
		InterfaceClient IC = new InterfaceClient();
		
		this.add(IC);
	}
}
