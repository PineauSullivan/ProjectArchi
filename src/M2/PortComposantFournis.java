package M2;

import Donnees.Message;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class PortComposantFournis extends PortComposant {

	public PortComposantFournis(String nom) {
		super(nom);
		this.type = Type.FOURNIS;
	}
	
	public void envoie(Message message){
		System.out.println(this.interfaceComposant.composant.nom+" - Message envoyé sur le port Fournis : "+this.nom);
		this.interfaceComposant.envoie(message, this.nom);
	}
	
	public void recois(Message message){
		System.out.println(this.getNom()+" - Impossible de recevoir un message sur un port fournis");
	}
	
}
