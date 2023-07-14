package challengeCardSharp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class driver {

	private static final int NO_OF_ROUNDS = 5;

	public static void main(String[] args) {

		List<Card> mainDeck = create52Deck();
		// HighCard(mainDeck);
		Snap(mainDeck);

	}

	private static void Snap(List<Card> mainDeck) {
		// shuffle
		Collections.shuffle(mainDeck);

		Queue<Card> dealer = new LinkedList<Card>(mainDeck);

		Queue<Card> p1deck = new LinkedList<Card>();
		Queue<Card> p2deck = new LinkedList<Card>();
		List<Card> centerPile = new LinkedList<Card>();

		// deal cards
		while (!dealer.isEmpty()) {
			p1deck.add(dealer.remove());
			p2deck.add(dealer.remove());
		}

		System.out.println(p1deck.size());
		System.out.println(p1deck.size());
		
		Random rand = new Random();

		System.out.println("-------------");
		System.out.println("!!PLAY SNAP!!");
		System.out.println("-------------");

		// Start game
		System.out.println("P1 plays " + p1deck.peek().toString());
		centerPile.add(p1deck.remove());// p1 always starts

		int currentPlayer = 2;

		while (p1deck.size() > 0 && p2deck.size() > 0) {
			// create cur player deck based on who is current player
			Queue<Card> curPlayerDeck = currentPlayer == 1 ? p1deck : p2deck;
			Queue<Card> opponentDeck = currentPlayer == 2 ? p2deck : p1deck;
			// determine other player based on current player
			int otherPlayer = currentPlayer == 1 ? 2 : 1;
			// create card objects based on card played and card to be played
			Card topCard = centerPile.get(centerPile.size() - 1);
			Card curCard = curPlayerDeck.peek();

			System.out.printf("Player %d plays: " + curCard.toString() + "%n", currentPlayer);
			centerPile.add(curPlayerDeck.remove());

			// check for snap conditions
			if (topCard.getValue() != curCard.getValue()) {
				System.out.println("No match");
			} else {
				System.out.println("--!!SNAP!!--");
				int race = rand.nextInt(2) + 1; // rand num to determine if p1 or p2 wins race
				int opponent = race == 1 ? 2 : 1;
				System.out.printf("Player %d snapped first, player %d must take the cards%n", race, opponent);
				// actions for outcome
				if (race == 1) {
					p2deck.addAll(centerPile);
					centerPile.clear();
				} else {
					p1deck.addAll(centerPile);
					centerPile.clear();
				}
				System.out.printf("Card counts: P1-%d cards | P2-%d cards | Center-%d cards | Total-%d cards%n",
						p1deck.size(), p2deck.size(), centerPile.size(),
						(p1deck.size() + p2deck.size() + centerPile.size()));
			}
			// continue playing after snap
			if (centerPile.size() == 0 && opponentDeck.size() > 0) {
				// play first card
				Card nextCard = opponentDeck.peek();
				System.out.printf("Player %d plays: " + nextCard.toString() + "%n", currentPlayer);
				centerPile.add(opponentDeck.remove());
			} else {
				currentPlayer = currentPlayer == 1 ? 2 : 1;
			}
		}
		//game over
		System.out.println("GAME OVER");
		System.out.printf("Final card counts: P1-%d cards | P2-%d cards | Center-%d cards | Total-%d cards%n", 
				p1deck.size(), p2deck.size(), centerPile.size(),
				(p1deck.size() + p2deck.size() + centerPile.size()));
		if(p1deck.size() == p2deck.size()) {
			System.out.println("Draw");
		}else if (p1deck.size()==0){
			System.out.println("Player 1 Wins");
		}else {
			System.out.println("Player 2 Wins");
		}
		System.out.println();

	}

	private static void HighCard(List<Card> mainDeck) {
		// shuffle deck before deal
		Collections.shuffle(mainDeck);
		// deal cards one by one to each player via queue
		Queue<Card> deckToDeal = new LinkedList<Card>(mainDeck);

		// create player decks to hold dealt cards
		List<Card> p1deck = new ArrayList<Card>();
		List<Card> p2deck = new ArrayList<Card>();

		while (deckToDeal.peek() != null) {
			// System.out.println(deckToDeal.peek());
			p1deck.add(deckToDeal.poll());
			// System.out.println(deckToDeal.peek());
			p2deck.add(deckToDeal.poll());
		}
//		System.out.println("Deck1");
//		displayDeck(p1deck);
//		System.out.println("Deck2");
//		displayDeck(p2deck);

		// play Round
		int[] results = new int[] { 0, 0, 0 };
		for (int i = 1; i < NO_OF_ROUNDS; i++) {
			playRound(p1deck, p2deck, results);
		}
		System.out.printf("Player 1 won %d%n", results[0]);
		System.out.printf("Player 2 won %d%n", results[1]);
		System.out.printf("Number of draws %d%n", results[2]);

	}

	private static void playRound(List<Card> p1deck, List<Card> p2deck, int[] results) {
		Random rand = new Random();
		Card c1 = p1deck.get(rand.nextInt(27));
		Card c2 = p2deck.get(rand.nextInt(27));

		String resultStr = "";
		// check winner
		if (c1.getValue() > c2.getValue()) {
			results[0] += 1;
			resultStr = "1";
		} else if (c1.getValue() < c2.getValue()) {
			results[1] += 1;
			resultStr = "2";
		} else {
			results[2] += 1;
			resultStr = "Draw";
		}

		System.out.printf("Player 1 played %s%n", c1.toString());
		System.out.printf("Player 2 played %s%n", c2.toString());
		System.out.printf("Winner = Player %s%n", resultStr);
		System.out.println();

	}

	private static void displayDeck(List<Card> mainDeck) {
		for (Card c : mainDeck) {
			System.out.println(c.toString());
		}

	}

	private static List<Card> create52Deck() {
		// need a deck of
		List<Card> deck = new ArrayList<Card>();
		for (int i = 1; i < 15; i++) {
			Card c = new Card(Suit.CLUBS, i);
			deck.add(c);
		}
		for (int i = 1; i < 15; i++) {
			Card c = new Card(Suit.DIAMONDS, i);
			deck.add(c);
		}
		for (int i = 1; i < 15; i++) {
			Card c = new Card(Suit.HEARTS, i);
			deck.add(c);
		}
		for (int i = 1; i < 15; i++) {
			Card c = new Card(Suit.SPADES, i);
			deck.add(c);
		}
		return deck;
	}

}
