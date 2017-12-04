package M2;

import java.util.Hashtable;

public class InterfaceComposant {
	String nom;
	
	Hashtable<String, PortComposantFournis> portsFournis;
	Hashtable<String, PortComposantRequis> portsrequis;

	public InterfaceComposant(String nom) {
		super();
		this.nom = nom;
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
	
}
