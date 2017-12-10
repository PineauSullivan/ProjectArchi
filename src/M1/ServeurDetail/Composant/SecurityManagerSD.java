/**
 * 
 */
package M1.ServeurDetail.Composant;

import Donnees.Message;
import M1.ServeurDetail.Composant.Interface.InterfaceSecurityManager;
import M2.Composant;
import M2.PortComposantFournis;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class SecurityManagerSD extends Composant {
	String password = "security";
	
	public SecurityManagerSD(){
		super("SecurityManager");
		
		InterfaceSecurityManager interfaceSecurityManager = new InterfaceSecurityManager();
		
		this.add(interfaceSecurityManager);
		
		interfaceSecurityManager.setComposant(this);
	}

	public void recois(Message message, String name){
		PortComposantFournis pcf = null;
		switch(message.getType()){
			case 1:
				if(message.getContent().equals(password)){
					pcf = this.getPortFournis("PortFournis_Security_Database");					
				}else{
					message.setContent("Password incorrect !!");
					message.setType(4);
					pcf = this.getPortFournis("PortFournis_Security_Connection");
				}
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
			default:
				pcf = this.getPortFournis("PortFournis_Security_Connection");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
		}
	}
}
