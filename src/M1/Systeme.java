/**
 * 
 */
package M1;

import M1.ServeurDetail.ConfigurationServeurDetail;
import Donnees.Message;
import M1.ClientServeur.ConfigurationClientServeur;
import M1.ClientServeur.Connecteur.RPC;
import M2.Configuration;
import M2.Connecteur;
import M2.PortComposantFournis;
import M2.PortComposantRequis;

/**
 * @author sullivan
 *
 */
public class Systeme extends Configuration {
	
	public Systeme(){
		super("Systeme");
		ConfigurationServeurDetail configServeurDetail = new ConfigurationServeurDetail();
		ConfigurationClientServeur configClientServeur = new ConfigurationClientServeur();
		
		this.add(configServeurDetail);
		this.add(configClientServeur);
		
		PortComposantRequis PCRServeur = (PortComposantRequis) configClientServeur.getComposant("ComposantServeur").getInterface("InterfaceServeur").getPort("Port_Send_Serveur");
		PortComposantRequis PCRServeurDetail = (PortComposantRequis) configServeurDetail.getComposant("ConnectionManager").getInterface("InterfaceConnectionManager").getPort("PortRequisConfigCS");
		this.binding(PCRServeur , PCRServeurDetail );

		PortComposantFournis PCFServeur = (PortComposantFournis) configClientServeur.getComposant("ComposantServeur").getInterface("InterfaceServeur").getPort("Port_Receive_Request");
		PortComposantFournis PCFServeurDetail = (PortComposantFournis) configServeurDetail.getComposant("ConnectionManager").getInterface("InterfaceConnectionManager").getPort("PortFournisCS");
		this.binding(PCFServeur, PCFServeurDetail);
		
		for(Configuration conf : this.getConfigurations().values()){
			conf.setConfiguration(this);
		}
	}
	
	public void clientEnvoie(Message message){
		PortComposantFournis pcf = this.getConfigurations().get("ConfigurationClientServeur").getComposant("ComposantClient").getPortFournis("Port_Receive_Client");
		pcf.envoie(message);
	}
}
