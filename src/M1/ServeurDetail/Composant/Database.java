/**
 * 
 */
package M1.ServeurDetail.Composant;

import Donnees.Message;
import M1.ServeurDetail.Composant.Interface.InterfaceDatabase;
import M2.Composant;
import M2.Configuration;
import M2.PortComposantFournis;

/**
 * @author sullivan
 *
 */
public class Database extends Composant{
	private boolean ouvert = false;
	private String data = "";
	
	public Database(){
		super("Database");
		
		InterfaceDatabase interfaceDatabase = new InterfaceDatabase();
		
		this.add(interfaceDatabase);
		
		interfaceDatabase.setComposant(this);
	}

	public void recois(Message message, String name){
		PortComposantFournis pcf = null;
		switch(message.getType()){
			case 1:
				this.ouvert = true;
				message.setContent("Database ouvert");
				message.setType(4);
				pcf = this.getPortFournis("PortFournis_database_Security");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
				
			case 2:
				if(this.ouvert){
					data += message.getContent();
					message.setContent("Données enregistrées !");
					message.setType(4);
				}else{				
					message.setContent("Database fermée !");
					message.setType(4);
				}
				pcf = this.getPortFournis("PortFournis_database_Connection");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
			case 3:
				message.setContent(data);
				message.setType(4);
				pcf = this.getPortFournis("PortFournis_database_Connection");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
			default:
				pcf = this.getPortFournis("PortFournis_database_Connection");
				if(pcf!=null){
					pcf.envoie(message);
				}
				break;
		}
	}
}
