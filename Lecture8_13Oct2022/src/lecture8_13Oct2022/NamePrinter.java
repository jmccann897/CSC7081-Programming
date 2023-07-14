package lecture8_13Oct2022;

public class NamePrinter {

	public static void main(String[] args) {
		// 
		messagePrinter(5, "Josh");

		messagePrinter(4, "McCann");
		
	}
	
/**
 * This method prints a message a certain number of times
 * @param times
 * @param name
 */
	public static void messagePrinter(int times, String name) {
		for (int i=0; i<times; i++) {
			System.out.println(name);
		}
	}
}
