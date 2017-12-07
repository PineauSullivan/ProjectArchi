package M2;

import Donnees.Message;

public abstract class PortComposant {
	public Type type = null;
	String nom;
	InterfaceComposant interfaceComposant;
		
	public PortComposant(String nom) {
		super();
		this.nom = nom;
		this.interfaceComposant = interfaceComposant;
	}

	public void setInterfaceComposant(InterfaceComposant interfaceComposant){
		this.interfaceComposant = interfaceComposant;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Type getType(){
		return type;
	}
	public void envoie(Message message){
		// Par défaut, ne fait rien
	}
	
	public void recois(Message message){
		// Par défaut, ne fait rien
	}
	
}
