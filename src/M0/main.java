/**
 * 
 */
package M0;

import Donnees.Message;
import M1.Systeme;
import M1.ClientServeur.Composant.ComposantClient;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Systeme systeme = new Systeme();
		ComposantClient client;
		client = systeme.getClient();

		System.out.println("----------------------------------------------------------------");
		System.out.println("------------------ Message open Database false -----------------");
		System.out.println("----------------------------------------------------------------");
		Message messageOpenDataBasefalse = new Message("dfkjdfshsdfkjhdfskhjds", 1);
		client.envoieMessage(messageOpenDataBasefalse);
		System.out.println("----------------------------------------------------------------");
		
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("--------------- Message save data false ------------------------");
		System.out.println("----------------------------------------------------------------");
		Message messageSavaDatafalse = new Message("blablabla", 2);
		client.envoieMessage(messageSavaDatafalse);
		System.out.println("----------------------------------------------------------------");

		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("------------- Message open Database true -----------------------");
		System.out.println("----------------------------------------------------------------");
		Message messageOpenDataBase = new Message("security", 1);
		client.envoieMessage(messageOpenDataBase);
		System.out.println("----------------------------------------------------------------");

		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("--------------- Message save data true -------------------------");
		System.out.println("----------------------------------------------------------------");
		Message messageSavaData = new Message("blablabla", 2);
		client.envoieMessage(messageSavaData);
		System.out.println("----------------------------------------------------------------");

		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------- Message read data false -----------------------------");
		System.out.println("----------------------------------------------------------------");
		Message messageReadDatafalse = new Message(null, 3);
		client.envoieMessage(messageReadDatafalse);
		System.out.println("----------------------------------------------------------------");


		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("------------- Message open Database bis true -------------------");
		System.out.println("----------------------------------------------------------------");
		Message messageOpenDataBasebis = new Message("security", 1);
		client.envoieMessage(messageOpenDataBasebis);
		System.out.println("----------------------------------------------------------------");


		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------- Message read data true -----------------------------");
		System.out.println("----------------------------------------------------------------");
		Message messageReadDatatrue = new Message(null, 3);
		client.envoieMessage(messageReadDatatrue);
		System.out.println("----------------------------------------------------------------");

		
		
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------- Message a destinataires du client ------------------");
		System.out.println("----------------------------------------------------------------");
		Message message = new Message("Je m'envoie mon propre message xD", 4);
		client.envoieMessage(message);
		
	}

}
