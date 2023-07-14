package oopIntroQuotes;

public class Quotes {
	
	public static void main(String[] args) {
		Quotes q1 = new Quotes();
		q1.churchillQuote();
		shakespeareQuote();
		oscarWildeQuote();
		georgeWBushQuote();
		albertEinsteinQuote();
	}

	public static void albertEinsteinQuote() {
		System.out.println("If the facts don't fit the theory, change the facts. Albert Einstein");
		
	}

	public static void georgeWBushQuote() {
		System.out.println("One of the great things about books is sometimes there are some fantastic pictures. George W Bush");
		
	}

	public void churchillQuote() {
		System.out.println("Continuous effort - not strength or intelligence - is the key to unlocking our potential. Churchill");
		
	}

	public static void oscarWildeQuote() {
		System.out.println("Experience is simply the name we give our mistakes. Wilde");
		
	}

	public static void shakespeareQuote() {
		System.out.println("Good night! Good night! Parting is such sweet sorrow, that I shall say good night till it be morrow. Shakespeare");
		
	}

}
