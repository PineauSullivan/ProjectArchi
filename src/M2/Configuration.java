package M2;

import java.util.Hashtable;

public class Configuration extends Element {
	
	Hashtable<String, Configuration> configurations;
	Hashtable<String, Composant> composants;
	Hashtable<String, Connecteur> connecteurs;
	
	public Configuration() {
		configurations = new Hashtable<String, Configuration>();
		composants = new Hashtable<String, Composant>();
		connecteurs = new Hashtable<String, Connecteur>();
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
	
	public boolean add(String nameElement, Element element){
		if(element.getClass().equals(Configuration.class)){
			if(!configurations.containsKey(nameElement)){
				configurations.put(nameElement, (Configuration)element);
				return true;
			}
			else return false;
		}
		else if(element.getClass().equals(Composant.class)){
			if(!composants.containsKey(nameElement)){
				composants.put(nameElement, (Composant)element);
				return true;
			}
			else return false;
		}
		else if(element.getClass().equals(Connecteur.class)){
			if(!connecteurs.containsKey(nameElement)){
				connecteurs.put(nameElement, (Connecteur)element);
				return true;
			}
			else return false;
		}
		else return false;
			
	}
	
	
	
}
