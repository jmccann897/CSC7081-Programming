/**
 * 
 */
package lecture15_29Nov2022;

/**
 * Simple Message Centre Greetings Object
 * @author joshm
 *
 */
public class MessageCentre {

	/**
	 * Display welcome message to console
	 */
	public void displayWelcomeMessage() {
		System.out.println("Hello and Welcome!!");
	}//end of method
	
	/**
	 * Display message using string name to be greeted
	 * Note same name as other method but requires a parameter
	 * @param name
	 */
	public void displayWelcomeMessage(String name) {
		System.out.printf("Hello %s and Welcome!!%n", name);
	}
	
	
}//end of class
