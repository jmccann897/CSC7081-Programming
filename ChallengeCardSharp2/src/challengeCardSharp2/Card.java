package challengeCardSharp2;



public class Card {

	//Instance vars
	private Suit suit;
	private int value;
	private String valueInString;
	
	/**
	 * Constructor for card object
	 * @param suit
	 * @param value
	 */
	public Card(Suit suit, int value) {
		this.suit = suit;
		this.setValue(value);
		this.setValueInString();
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

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		if(value<1 || value>14) {
			throw new IllegalArgumentException("Value must be int between 1 and 14");
		}else {
			this.value = value;
		}
		
	}

	@Override
	public String toString() {
		return String.format("%s of %s", valueWord(this.value), suitWord(this.suit));
	}

	/**
	 * @return the valueInString
	 */
	public String getValueInString() {
		return valueInString;
	}

	/**
	 * @param valueInString the valueInString to set
	 */
	public void setValueInString() {
		switch (this.getValue()) {
		case 1: this.valueInString = "one";break;
		case 2: this.valueInString = "two"; break; 
		case 3: this.valueInString = "three";break;
		case 4: this.valueInString = "four";break;
		case 5: this.valueInString = "five";break;
		case 6: this.valueInString = "six";break;
		case 7: this.valueInString = "seven";break;
		case 8: this.valueInString = "eight";break;
		case 9: this.valueInString = "nine";break;
		case 10: this.valueInString = "ten";break;
		case 11: this.valueInString = "Jack";break;
		case 12: this.valueInString = "Queen";break;
		case 13: this.valueInString = "King";break;
		case 14: this.valueInString = "Ace";break;
		default: System.out.println("Default hit");break;
		}
	}
	
	/**
	 * Helper function to get print friendly version of face value
	 * @param value
	 * @return
	 */
	private String valueWord(int value) {
		String word="ERROR";
		switch(value) {
		case 1:word="One";break;
		case 2:word="Two";break;
		case 3:word="Three";break;
		case 4:word="Four";break;
		case 5:word="Five";break;
		case 6:word="Six";break;
		case 7:word="Seven";break;
		case 8:word="Eight";break;
		case 9:word="Nine";break;
		case 10:word="Ten";break;
		case 11:word="Jack";break;
		case 12:word="Queen";break;
		case 13:word="King";break;
		case 14:word="Ace";break;
		}
		return word;
	}
	
	/**
	 * Helper function to get print friendly version of enum suit value
	 * @param suit
	 * @return
	 */
	private String suitWord(Suit suit) {
		String word="ERROR";
		switch (suit) {
		case CLUBS:word="Clubs";break;
		case HEARTS:word="Hearts";break;
		case SPADES:word="Spades";break;
		case DIAMONDS:word="Diamonds";break;
		}
		return word;
	}
	
}
