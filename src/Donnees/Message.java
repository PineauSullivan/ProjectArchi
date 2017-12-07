package Donnees;
/**
 * 
 */

/**
 * @author sullivan
 *
 */
public class Message {
	String content="NULL";
	int type;
	
	public Message(String c, int t){
		content = c;
		type = t;
	}
	public int getType(){
		return this.type;
	}
	public String getContent(){
		return this.content;
	}
	
	public void setContent(String c){
		this.content = c;
	}
	
	public void setType(int t){
		type = t;
	}
}
