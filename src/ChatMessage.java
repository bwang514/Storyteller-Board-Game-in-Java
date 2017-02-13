import java.io.*;
import java.util.*;

/*
 * This class defines the different type of messages that will be exchanged between the
 * Clients and the Server. 
 * When talking from a Java Client to a Java Server a lot easier to pass Java objects, no 
 * need to count bytes or to wait for a line feed at the end of the frame
 */

//Game Start = 3;deal card = 4;Teller = 5;Not Teller = 6;
public class ChatMessage implements Serializable {

	protected static final long serialVersionUID = 1112122200L;

	// The different types of message sent by the Client
	// WHOISIN to receive the list of the users connected
	// MESSAGE an ordinary message
	// LOGOUT to disconnect from the Server
	static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
	private int type;
	private String message;
	public ArrayList<Integer> cards = new ArrayList<Integer>();
	
	// constructor
	ChatMessage(int type, String message) {
		this.type = type;
		this.message = message;
	}

	ChatMessage(int type, ArrayList<Integer> cards) {
		this.type = type;
		this.cards = cards;
	}
	// getters
	int getType() {
		return type;
	}
	String getMessage() {
		return message;
	}
}

