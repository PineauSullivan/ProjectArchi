/**
 * 
 */
package M0;

import Donnees.Message;
import M1.Systeme;

/**
 * @author sullivan
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Systeme systeme = new Systeme();

		Message messageOpenDataBasefalse = new Message("dfkjdfshsdfkjhdfskhjds", 1);
		systeme.clientEnvoie(messageOpenDataBasefalse);
		
		
		Message messageSavaDatafalse = new Message("blablabla", 2);
		systeme.clientEnvoie(messageSavaDatafalse);
		
		Message messageOpenDataBase = new Message("security", 1);
		systeme.clientEnvoie(messageOpenDataBase);
		
		Message messageSavaData = new Message("blablabla", 2);
		systeme.clientEnvoie(messageSavaData);
		
		Message messageReadData = new Message(null, 3);
		systeme.clientEnvoie(messageReadData);
		

		Message message = new Message("Je m'envoie mon propre message xD", 4);
		systeme.clientEnvoie(message);
		
	}

}
