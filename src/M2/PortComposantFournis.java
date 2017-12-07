package M2;

import Donnees.Message;

public class PortComposantFournis extends PortComposant {

	public PortComposantFournis(String nom) {
		super(nom);
		this.type = Type.FOURNIS;
	}
	
	public void envoie(Message message){
		System.out.println("Message envoyé sur le port Fournis : "+this.nom);
		this.interfaceComposant.envoie(message, this.nom);
	}
	
	public void recois(Message message){
		// Par défaut, ne fait rien
		System.out.println("Impossible de recevoir un message sur un port fournis");
	}
	
}
