package M2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Configuration extends Element {
	
	Hashtable<String, Configuration> configurations;
	Hashtable<String, Composant> composants;
	Hashtable<String, Connecteur> connecteurs;
	
	List<Attachment> attachments;
	List<Binding> bindings;
	
	public Configuration(String n) {
		super(n);
		configurations = new Hashtable<String, Configuration>();
		composants = new Hashtable<String, Composant>();
		connecteurs = new Hashtable<String, Connecteur>();
		
		attachments = new ArrayList<Attachment>();
		bindings = new ArrayList<Binding>();
	}

	public Hashtable<String, Configuration> getConfigurations() {
		return configurations;
	}

	public void setConfigurations(Hashtable<String, Configuration> configurations) {
		this.configurations = configurations;
	}

	public Hashtable<String, Composant> getComposants() {
		return composants;
	}

	public void setComposants(Hashtable<String, Composant> composants) {
		this.composants = composants;
	}

	public Hashtable<String, Connecteur> getConnecteurs() {
		return connecteurs;
	}

	public void setConnecteurs(Hashtable<String, Connecteur> connecteurs) {
		this.connecteurs = connecteurs;
	}
	
	
	
	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public List<Binding> getBindings() {
		return bindings;
	}

	public void setBindings(List<Binding> bindings) {
		this.bindings = bindings;
	}

	public boolean add(Element element){
		if(element.getClass().equals(Configuration.class)){
			if(!configurations.containsKey(element.getNom())){
				configurations.put(element.getNom(), (Configuration)element);
				return true;
			}
			else return false;
		}
		else if(element.getClass().equals(Composant.class)){
			if(!composants.containsKey(element.getNom())){
				composants.put(element.getNom(), (Composant)element);
				return true;
			}
			else return false;
		}
		else if(element.getClass().equals(Connecteur.class)){
			if(!connecteurs.containsKey(element.getNom())){
				connecteurs.put(element.getNom(), (Connecteur)element);
				return true;
			}
			else return false;
		}
		else return false;
			
	}
	
	public void binding(PortComposantRequis port1Requi, PortComposantRequis port2Requi){
		bindings.add(new BindingRequis(port1Requi,port2Requi));
	}
	
	public void binding(PortComposantFournis port1Fourni, PortComposantFournis port2Fourni){
		bindings.add(new BindingFournis(port1Fourni,port2Fourni));
	}
	
	public void attachment(PortComposantRequis portRequi, RoleConnecteurFournis roleFourni){
		attachments.add(new AttachmentRequisFournis(portRequi, roleFourni));
	}
	
	public void attachment(PortComposantFournis portFourni, RoleConnecteurRequis roleRequi){
		attachments.add(new AttachmentFournisRequis(portFourni, roleRequi));
	}
	
	
	
}
