/**
 * 
 */
package oopIntroQuotes;

/**
 * @author joshm
 *
 */
public class CartoonApp extends SimpsonsCharacter {

	public CartoonApp(String name, String catchPhrase) {
		super(name, catchPhrase);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Bart
		SimpsonsCharacter Bart = new SimpsonsCharacter("Bart", "eat my shorts!");
		Bart.sayCatchPhrase();
		
		//create Homer
		SimpsonsCharacter Homer = new SimpsonsCharacter("Homer", "D'oh!");
		Homer.sayCatchPhrase();
		
		//create Lisa
		SimpsonsCharacter Lisa = new SimpsonsCharacter("Lisa", "I'll be in my room.");
		Lisa.sayCatchPhrase();
		
		//create Nelson
		SimpsonsCharacter Nelson = new SimpsonsCharacter("Nelson", "haha!");
		Nelson.sayCatchPhrase();
		
		
		

	}

}
