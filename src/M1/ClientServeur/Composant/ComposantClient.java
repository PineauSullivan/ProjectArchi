/**
 * 
 */
package M1.ClientServeur.Composant;

import Donnees.Message;
import M1.ClientServeur.Interface.InterfaceClient;
import M2.Composant;
import M2.PortComposantFournis;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class ComposantClient extends Composant{

	public ComposantClient(){
		super("ComposantClient");
		
		InterfaceClient IC = new InterfaceClient();
		
		this.add(IC);
		
		IC.setComposant(this);
	}
	
	public void recois(Message message, String name){
		System.out.println("REPONSE SERVEUR "+name+" - "+message.getContent());
	}
	
	public void envoieMessage(Message message){
		PortComposantFournis pcf = this.getPortFournis("Port_Receive_Client");
		pcf.envoie(message);
	}
}
