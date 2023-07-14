package challengeCardSharp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	public static int DeckSize = 52;

	// instance vars

	public Deck() {
		List<Card> deckOfCards = new ArrayList<Card>();
		createDeck(deckOfCards);

	}
	
	private void createDeck(List<Card> deckOfCards) {
		createHearts(deckOfCards);
		createClubs(deckOfCards);
		createDiamonds(deckOfCards);
		createSpades(deckOfCards);

	}

	private void createSpades(List<Card> deckOfCards) {
		// create Spades
		for (int i = 2; i < 15; i++) {
			String faceValue = toFaceValue(i);
			Card c = new Card(faceValue, Suit.SPADES);
			deckOfCards.add(c);
		}

	}

	private void createDiamonds(List<Card> deckOfCards) {
		// create Diamonds
		for (int i = 2; i < 15; i++) {
			String faceValue = toFaceValue(i);
			Card c = new Card(faceValue, Suit.DIAMONDS);
			deckOfCards.add(c);
		}

	}

	private void createClubs(List<Card> deckOfCards) {
		// create Clubs
		for (int i = 2; i < 15; i++) {
			String faceValue = toFaceValue(i);
			Card c = new Card(faceValue, Suit.CLUBS);
			deckOfCards.add(c);
		}

	}

	private void createHearts(List<Card> deckOfCards) {
		// create Hearts
		for (int i = 2; i < 15; i++) {
			String faceValue = toFaceValue(i);
			Card c = new Card(faceValue, Suit.HEARTS);
			deckOfCards.add(c);
		}

	}

	private String toFaceValue(int i) {
		String toReturn;

		switch (i) {
		case 11:
			toReturn = "Jack";
			break;
		case 12:
			toReturn = "Queen";
			break;
		case 13:
			toReturn = "King";
			break;
		case 14:
			toReturn = "Ace";
			break;
		default:
			toReturn = Integer.toString(i);
			System.out.println(Integer.toString(i));
		}

		return toReturn;
	}
}
