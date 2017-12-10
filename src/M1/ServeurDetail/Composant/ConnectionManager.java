/**
 * 
 */
package M1.ServeurDetail.Composant;

import Donnees.Message;
import M1.ServeurDetail.Composant.Interface.InterfaceConnectionManager;
import M2.Composant;
import M2.PortComposantFournis;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class ConnectionManager extends Composant {
	public ConnectionManager(){
		super("ConnectionManager");
		
		InterfaceConnectionManager interfaceConnectionManager = new InterfaceConnectionManager();
		
		this.add(interfaceConnectionManager);
		
		interfaceConnectionManager.setComposant(this);
	}
	
	public void recois(Message message, String name){
		PortComposantFournis pcf = null;
		switch(message.getType()){
			case 1:
				pcf = this.getPortFournis("PortFournis_ConnectionManager_Security");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
			case 2:
				pcf = this.getPortFournis("PortFournis_ConnectionManager_Database");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
			case 3:
				pcf = this.getPortFournis("PortFournis_ConnectionManager_Database");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
			case 4:
				pcf = this.getPortFournis("PortFournisCS");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
			default:
				pcf = this.getPortFournis("PortFournisCS");
				message.setContent("Type du message inconnu");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
		}
	}
	
}
