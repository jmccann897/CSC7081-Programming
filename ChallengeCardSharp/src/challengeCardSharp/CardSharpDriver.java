package challengeCardSharp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class CardSharpDriver {

	public static void main(String[] args) {
		// create deck of cards
		List<Card> deckOfCards = new ArrayList<Card>();
		createDeck(deckOfCards);

		// HighCard(deckOfCards);
		Snap(deckOfCards);

	}

	public static void Snap(List<Card> deckOfCards) {
		List<Card> player1Deck = new ArrayList<Card>();
		List<Card> player2Deck = new ArrayList<Card>();
		shuffleDeck(deckOfCards);
		dealCards(deckOfCards, player2Deck, player1Deck);
		playSnap(player2Deck, player1Deck);

	}

	/**
	 * Can run mostly Need to print each players card but using Peek runs into null
	 * issue with trying to remove linkedlist if nothing present
	 * 
	 * @param player2Deck
	 * @param player1Deck
	 */
	public static void playSnap(List<Card> player2Deck, List<Card> player1Deck) {
		// pop off each deck into SnapDeck
		List<Card> snapDeck = new ArrayList<Card>();
		// set up players as queues
		shuffleDeck(player1Deck);
		Queue<Card> p1Deck = new LinkedList<Card>();
		p1Deck.addAll(player1Deck);
		shuffleDeck(player2Deck);
		shuffleDeck(player2Deck);
		Queue<Card> p2Deck = new LinkedList<Card>();
		p2Deck.addAll(player2Deck);
		int cardCount = 0;

		// start playing cards into snapDeck
		while (p1Deck.size()>0 | p2Deck.size()>0) {
			if (p1Deck.size() > 1) {
				System.out.println("P1 Card played: " + p1Deck.peek().toString());
			}
			snapDeck.add(p1Deck.remove());
			cardCount += 1;
			if (p1Deck.size() > 1) {
				System.out.println("P2 Card played: " + p2Deck.peek().toString());
			}
			snapDeck.add(p2Deck.remove());
			cardCount += 1;
			checkSnap(p1Deck, p2Deck, snapDeck, cardCount);
		}
		checkForWinner(p1Deck, p2Deck);

	}

	public static void checkForWinner(Queue<Card> p1Deck, Queue<Card> p2Deck) {
		if (p1Deck.isEmpty()) {
			System.out.println("Player 1 won");
		} else if (p2Deck.isEmpty()) {
			System.out.println("Player 2 won");
		} else {
			System.out.println("No winner somehow??");
		}

	}

	public static void checkSnap(Queue<Card> p1Deck, Queue<Card> p2Deck, List<Card> snapDeck, int cardCount) {
		Card c1 = snapDeck.get(cardCount - 1);
		Card c2 = snapDeck.get(cardCount - 2);
		if (c1.faceValueToInteger(c1.getfaceValue()) == c2.faceValueToInteger(c2.getfaceValue())) {
			// System.out.println("previous card value = "+
			// c1.faceValueToInteger(c1.getfaceValue()));
			// System.out.println("-2 cards value = "+
			// c2.faceValueToInteger(c2.getfaceValue()));
			// snap condition
			// p1 is winner
			if (DecideWinner() == 0) {
				// p2 gets Snapdeck
				System.out.println("Player 1 Snaps");
				p2Deck.addAll(snapDeck);
				snapDeck.clear();
				System.out.println("P1 cardCount: " + p1Deck.size());
				System.out.println("P2 cardCount: " + p2Deck.size());
			} else if (DecideWinner() == 1) {
				// p1 gets Snapdeck
				System.out.println("Player 2 Snaps");
				p1Deck.addAll(snapDeck);
				snapDeck.clear();
				System.out.println("P1 cardCount: " + p1Deck.size());
				System.out.println("P2 cardCount: " + p2Deck.size());
			}
		}
	}

	public static int DecideWinner() {
		int num;
		Random rand = new Random();
		return rand.nextInt(2);

	}

	public static void HighCard(List<Card> deckOfCards) {
		int numberOfRounds = 5;
		// int array to hold results
		// index 0 = p1 win count, index 1 = p2 win count, index 2 = tie count
		int[] results = new int[3];

		List<Card> player1Deck = new ArrayList<Card>();
		List<Card> player2Deck = new ArrayList<Card>();

		for (int i = 0; i < numberOfRounds; i++) {
			shuffleDeck(deckOfCards);
			dealCards(deckOfCards, player2Deck, player1Deck);
			playRound(player1Deck, player2Deck, results);

		}

		printFinalStats(results);

	}

	private static void printFinalStats(int[] results) {
		System.out.println("---------------");
		System.out.println("Overall Results");
		System.out.println("---------------");
		System.out.println("Player 1 win count = " + results[0]);
		System.out.println("Player 2 win count = " + results[1]);
		System.out.println("Tie count = " + results[2]);
		System.out.println("---------------");

	}

	private static void playRound(List<Card> player1Deck, List<Card> player2Deck, int[] results) {
		// cut deck == random selection
		Random rand = new Random();

		Card p1card = player1Deck.get(rand.nextInt(51 / 2));
		System.out.println("Player 1 selected " + p1card.toString());
		Card p2card = player2Deck.get(rand.nextInt(51 / 2));
		System.out.println("Player 2 selected " + p2card.toString());

		// compare p1 and p2 cards
		int p1result = p1card.faceValueToInteger(p1card.getfaceValue());
		System.out.println(p1result);
		int p2result = p2card.faceValueToInteger(p2card.getfaceValue());
		System.out.println(p2result);

		if (p1result > p2result) {
			results[0] += 1;
		}
		if (p1result == p2result) {
			results[2] += 1;
		}
		if (p1result < p2result) {
			results[1] += 1;
		}
		System.out.println("Results: " + Arrays.toString(results));
		System.out.println();

	}

	private static void dealCards(List<Card> deckOfCards, List<Card> player2Deck, List<Card> player1Deck) {
		// take in 52 card deck
		// assign cards to new player decks one at a time via queue
		Queue<Card> deckToDeal = new LinkedList<Card>();
		deckToDeal.addAll(deckOfCards);

		// deal cards
		// loop through deckToDeal
		for (int i = deckToDeal.size(); i > 0; i--) {
			// if even deal to p2
			if (i % 2 == 0) {
				player2Deck.add(deckToDeal.remove());
			} else {
				player1Deck.add(deckToDeal.remove());
			}
		}

	}

	public static void shuffleDeck(List<Card> deckOfCards) {
		Collections.shuffle(deckOfCards);
	}

	private static void createDeck(List<Card> deckOfCards) {
		createHearts(deckOfCards);
		createClubs(deckOfCards);
		createDiamonds(deckOfCards);
		createSpades(deckOfCards);

	}

	private static void createSpades(List<Card> deckOfCards) {
		// create Spades
		for (int i = 2; i < 15; i++) {
			String faceValue = toFaceValue(i);
			Card c = new Card(faceValue, Suit.SPADES);
			deckOfCards.add(c);
		}

	}

	private static void createDiamonds(List<Card> deckOfCards) {
		// create Diamonds
		for (int i = 2; i < 15; i++) {
			String faceValue = toFaceValue(i);
			Card c = new Card(faceValue, Suit.DIAMONDS);
			deckOfCards.add(c);
		}

	}

	private static void createClubs(List<Card> deckOfCards) {
		// create Clubs
		for (int i = 2; i < 15; i++) {
			String faceValue = toFaceValue(i);
			Card c = new Card(faceValue, Suit.CLUBS);
			deckOfCards.add(c);
		}

	}

	private static void createHearts(List<Card> deckOfCards) {
		// create Hearts
		for (int i = 2; i < 15; i++) {
			String faceValue = toFaceValue(i);
			Card c = new Card(faceValue, Suit.HEARTS);
			deckOfCards.add(c);
		}

	}

	private static String toFaceValue(int i) {
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
			// System.out.println(Integer.toString(i));
		}

		return toReturn;
	}
}
