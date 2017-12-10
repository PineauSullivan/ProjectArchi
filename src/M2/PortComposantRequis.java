package M2;

import Donnees.Message;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class PortComposantRequis extends PortComposant {
	public PortComposantRequis(String nom) {
		super(nom);
		this.type = Type.REQUIS;
		// TODO Auto-generated constructor stub
	}
	
	public void envoie(Message message){
		System.out.println(this.getNom()+" - Impossible d'envoyer un message sur un port Requis");
	}
	
	public void recois(Message message){
		System.out.println(this.interfaceComposant.composant.nom+" - Message reçu sur le port Requis : "+this.nom);
		this.interfaceComposant.recois(message,this.nom);
	}
}
