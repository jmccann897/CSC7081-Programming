package lecture15_29Nov2022;

public class GreetingsManager {

	public static void main(String[] args) {
		// Use object within package to construct object to run method
		MessageCentre msg = new MessageCentre();
		//use object to call a method
		msg.displayWelcomeMessage();
		//this method call is different to one above as it requires an argument
		msg.displayWelcomeMessage("Josh");
	}

}
