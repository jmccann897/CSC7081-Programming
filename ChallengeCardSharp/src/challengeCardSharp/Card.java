package challengeCardSharp;

public class Card {

	// instance vars
	private String faceValue;
	private Suit suit;

	// Need card object to have a value and suit?
	// how to use collection framework??
	public Card(String faceValue, Suit suit) {
		this.setFaceValue(faceValue);
		this.suit = suit;
	}

	/**
	 * @return the value
	 */
	public String getfaceValue() {
		return faceValue;
	}

	/**
	 * @param value the value to set
	 */
	public void setFaceValue(String faceValue) throws IllegalArgumentException {
		String toCheck = faceValue.toLowerCase();
		String validChoices = "2345678910twothreefourfivesixseveneightninetenjackqueenkingace";
		if (validChoices.contains(toCheck)) {
			this.faceValue = faceValue;
		} else {
			throw new IllegalArgumentException("Your face value doesn't match expected input");
		}
	}

	/**
	 * @return the suit
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return this.faceValue + " of " + this.suit.toString();
	}

	public int faceValueToInteger(String faceValue) {
		if (faceValue.equalsIgnoreCase("two") | faceValue.equalsIgnoreCase("2")) {
			return 2;
		}
		if (faceValue.equalsIgnoreCase("three")| faceValue.equalsIgnoreCase("3")) {
			return 3;
		}
		if (faceValue.equalsIgnoreCase("four")| faceValue.equalsIgnoreCase("4")) {
			return 4;
		}
		if (faceValue.equalsIgnoreCase("five")| faceValue.equalsIgnoreCase("5")) {
			return 5;
		}
		if (faceValue.equalsIgnoreCase("six")| faceValue.equalsIgnoreCase("6")) {
			return 6;
		}
		if (faceValue.equalsIgnoreCase("seven")| faceValue.equalsIgnoreCase("7")) {
			return 7;
		}
		if (faceValue.equalsIgnoreCase("eight")| faceValue.equalsIgnoreCase("8")) {
			return 8;
		}
		if (faceValue.equalsIgnoreCase("nine")| faceValue.equalsIgnoreCase("9")) {
			return 9;
		}
		if (faceValue.equalsIgnoreCase("ten")| faceValue.equalsIgnoreCase("10")) {
			return 10;
		}
		if (faceValue.equalsIgnoreCase("Jack")) {
			return 11;
		}
		if (faceValue.equalsIgnoreCase("Queen")) {
			return 12;
		}
		if (faceValue.equalsIgnoreCase("King")) {
			return 13;
		}
		if (faceValue.equalsIgnoreCase("Ace")) {
			return 14;
		}
		else {
			
			return -1;
		}
		
	}

}
