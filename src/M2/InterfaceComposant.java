package M2;

import java.util.Hashtable;

import Donnees.Message;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class InterfaceComposant {
	String nom;
	Composant composant;
	
	Hashtable<String, PortComposantFournis> portsFournis = new Hashtable<String, PortComposantFournis>();
	Hashtable<String, PortComposantRequis> portsrequis = new Hashtable<String, PortComposantRequis>();

	public InterfaceComposant(String nom) {
		super();
		this.nom = nom;
		this.composant = null;
	}

	public void setComposant(Composant composant){
		this.composant = composant;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public boolean add(PortComposant port){
		if(port.getClass().equals(PortComposantFournis.class)){
			if(!portsFournis.containsKey(port.getNom())){
				portsFournis.put(port.getNom(), (PortComposantFournis)port);
				return true;
			}
			else return false;
		}
		else if(port.getClass().equals(PortComposantRequis.class)){
			if(!portsrequis.containsKey(port.getNom())){
				portsrequis.put(port.getNom(), (PortComposantRequis)port);
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public PortComposant getPort(String nom){
		if(portsFournis.containsKey(nom)){
			return portsFournis.get(nom);
		}
		else if(portsrequis.containsKey(nom)){
			return portsrequis.get(nom);
		}
		else return null;
	}
	
	public void recois(Message message, String name){
		if(this.composant!=null)
			this.composant.recois(message, name);
	}
	
	public void envoie(Message message, String name){
		if(this.composant!=null)
			this.composant.envoie(message, name);
	}
	
}
