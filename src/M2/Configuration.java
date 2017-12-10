package M2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import Donnees.Message;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class Configuration extends Element {
	
	Hashtable<String, Configuration> configurations;
	Hashtable<String, Composant> composants;
	Hashtable<String, Connecteur> connecteurs;
	
	List<Attachment> attachments ;
	List<Binding> bindings;
	
	Configuration configuration;
	
	public Configuration(String n) {
		super(n);
		configurations = new Hashtable<String, Configuration>();
		composants = new Hashtable<String, Composant>();
		connecteurs = new Hashtable<String, Connecteur>();
		
		attachments = new ArrayList<Attachment>();
		bindings = new ArrayList<Binding>();
		
		this.configuration = null;
	}

	public void setConfiguration(Configuration configuration){
		this.configuration = configuration;
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
		if(element.getClass().equals(Configuration.class)||element.getClass().getSuperclass().equals(Configuration.class)){
			if(!configurations.containsKey(element.getNom())){
				configurations.put(element.getNom(), (Configuration)element);
				return true;
			}
			else return false;
		}
		else if(element.getClass().equals(Composant.class)||element.getClass().getSuperclass().equals(Composant.class)){
			if(!composants.containsKey(element.getNom())){
				composants.put(element.getNom(), (Composant)element);
				return true;
			}
			else return false;
		}
		else if(element.getClass().equals(Composant.class)||element.getClass().getSuperclass().equals(Composant.class)){
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
	
	public Composant getComposant(String nom){
		if(composants.containsKey(nom)){
			return composants.get(nom);
		}
		else return null;
	}
	
	public void envoie(Message message, String name){
		boolean envoieAttachment = false;
		if(attachments.size()!=0){
			RoleConnecteurRequis roleRequis = null;
			for(Attachment attachment : attachments){
				if(attachment.getPort().getNom().equals(name)){
					roleRequis = (RoleConnecteurRequis) attachment.getRole();
				}
			}
			RoleConnecteurFournis roleFournis = null;
			if(roleRequis != null){
				for(Connecteur connecteur : connecteurs.values()){
					for(Glue glue : connecteur.glues.values()){
						if(glue.getRoleRequi().getNom().equals(roleRequis.getNom())){
							roleFournis = glue.getRoleFourni();
						}
					}
				}
				if(roleFournis!=null){
					PortComposantRequis portComposantRequis = null;
					for(Attachment attachment : attachments){
						if(attachment.getRole().getNom().equals(roleFournis.getNom())){
							portComposantRequis = (PortComposantRequis) attachment.getPort();
						}
					}
					if(portComposantRequis!=null){
						System.out.println("Attachment trouvé entre : "+name+" -> "+ portComposantRequis.getNom());
						portComposantRequis.recois(message);
						envoieAttachment= true;
					}
				}
			}
			
		}
		if(!envoieAttachment && bindings.size()!=0){
			for(Binding binding : bindings){
				if(binding.getPort1().getNom().equals(name)){
					if(binding.getPort2().getType().equals(Type.REQUIS)){
						System.out.println("Binding trouvé entre : "+name+" -> "+ binding.getPort2().getNom());
						binding.getPort2().recois(message);
					}else{
						System.out.println("Binding trouvé entre : "+name+" -> "+ binding.getPort2().getNom());
						binding.getPort2().envoie(message);
					}
					break;
				}else if(binding.getPort2().getNom().equals(name)){
					if(binding.getPort1().getType().equals(Type.REQUIS)){
						System.out.println("Binding trouvé entre : "+name+" -> "+ binding.getPort2().getNom());
						binding.getPort1().recois(message);
					}else{
						System.out.println("Binding trouvé entre : "+name+" -> "+ binding.getPort2().getNom());
						binding.getPort1().envoie(message);
					}
					break;
				}
			}
		}
		if(!envoieAttachment && this.configuration!=null){
			this.configuration.envoie(message, name);			
		}
	}

	public void recois(Message message, String name){
		if(bindings.size()!=0){
			for(Binding binding : bindings){
				if(binding.getPort1().getNom().equals(name)){
					if(binding.getPort2().getType().equals(Type.REQUIS)){
						System.out.println("Binding trouvé entre : "+name+" -> "+ binding.getPort2().getNom());
						binding.getPort2().recois(message);
					}else{
						System.out.println("Binding trouvé entre : "+name+" -> "+ binding.getPort2().getNom());
						binding.getPort2().envoie(message);
					}
					break;
				}else if(binding.getPort2().getNom().equals(name)){
					if(binding.getPort1().getType().equals(Type.REQUIS)){
						System.out.println("Binding trouvé entre : "+name+" -> "+ binding.getPort2().getNom());
						binding.getPort1().recois(message);
					}else{
						System.out.println("Binding trouvé entre : "+name+" -> "+ binding.getPort2().getNom());
						binding.getPort1().envoie(message);
					}
					break;
				}
			}
		}
		if(this.configuration!=null){
			this.configuration.recois(message, name);
		}
	}
	
	public boolean addConnecteur(Connecteur connecteur){
		if(connecteur!=null){
			connecteurs.put(connecteur.getNom(), connecteur);
			return true;
		}else{
			return false;
		}
	}
}
