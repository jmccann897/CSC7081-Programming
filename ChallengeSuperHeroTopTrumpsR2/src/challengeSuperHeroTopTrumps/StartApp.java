package challengeSuperHeroTopTrumps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * PUT YOUR NAME HERE AND YOUR STUDENT NUMBER
 * 
 *
 */
public class StartApp {

	/**
	 * Entry point of program - no need to modify this method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		showMenu();
	}

	// TODO modify readData method to populate List appropriately - method partially
	// completed already
	// TODO add static methods to this class as required to achieve tasks outlined
	// in menu
	// TODO modify showMenu method to add calls to new methods you write to
	// accomplish the tasks outlined in the menu

	/**
	 * Launches menu system which in turn calls appropriate methods based on user
	 * choices Partially implemented already requires updating to add calls to other
	 * methods written to achieve the tasks described in tasks 3-10
	 */
	public static void showMenu() {
		List<TopTrumpCard> mainDeck = readData();

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Hero Card Processing");
		do {
			System.out.println("1. (Re)read Data From File (use to restore removed card for example)");
			System.out.println("2. Play Demo Game with Current Deck");
			System.out.println("3. Display the number of Cards in the Current Deck");
			System.out.println("4. Display full details for all cards in the current Deck");
			System.out.println("5. Display summary details of the top 5 strongest Heroes in the Deck");
			System.out.println(
					"6. Display summary details of Villains in the Deck with an agility rating of 75 or more, sorted alphatically by name");
			System.out.println("7. Display the card name and bio of the card/cards with the longest bio in the Deck");
			System.out.println(
					"8. Find Swapsies: Identify and display summary details of any duplicate cards in the Deck");
			System.out.println("9. Remove any duplicate cards from the Deck.");
			System.out.println(
					"10. Sort the deck from highest to lowest determined by average of the 4 main stats. \n\tDisplay summary details of all cards and include the average as part of the summary.");
			System.out.println("11. Quit");
			System.out.println("Enter option ...");
			option = scanner.nextInt();
			System.out.println();
			switch (option) {

			case 1:
				mainDeck = readData();
				break;
			case 2:
				// System.out.println("Option currently disabled...");
				/*
				 * TODO Uncomment method call to enable this option (requires TopTrumpCard class
				 * to match expectations of Game Method to compile successfully) deliberately
				 * commented out initially to allow attempting other tasks
				 */
				CardGame.playDemo(mainDeck);
				break;
			case 3:
				displayDeck(mainDeck);
				break;
			case 4:
				displayAllCards(mainDeck);
				break;
			case 5:
				List<TopTrumpCard> top = findXstrongestHeroes(mainDeck);
				int x = 5;
				for (int i = 0; i < x; i++) {
					displaySummary(top.get(i));
				}
				break;
			case 6:
				// Display summary details of Villains in the current Deck with an agility
				// rating of 75 or more,
				// sorted alphabetically by name (same layout as other methods using summary
				// details)
				int statCutOff = 75;
				// order deck by name
				List<TopTrumpCard> orderedList = new ArrayList(mainDeck);
				Collections.sort(orderedList, new CompareCardsByName());
				// create list to print based on villain >75 agl
				List<TopTrumpCard> toPrint = vilainsAgilityAboveCutOff(orderedList, statCutOff);
				for (int i = 0; i < toPrint.size(); i++) {
					displaySummary(toPrint.get(i));
				}
				break;
			case 7:
				// Display the card name and bio of the card/cards with the longest bio in the
				// current Deck
				// (determined by number of characters in the bio – no word count required)
				longestBioDisplayer(mainDeck);

				break;
			case 8:
				findSwaps(mainDeck);
				// Find Swaps. Top Trumps is a trading card game and as such it is possible to
				// have duplicates
				// of cards. Identify and display summary details of any duplicate cards in the
				// current Deck.
				break;
			case 9:
				removeDupes(mainDeck);
				// Remove any duplicate cards from the current Deck. (The effect of this can be
				// verified with
				// other menu options eg. Option 3 or 4. And can be reversed by reading the file
				// again with
				// Option 1)

				break;
			case 10:
				averages(mainDeck);
				// Sort the deck from highest to lowest determined by average of the 4 main
				// stats. Display
				// summary details of all cards in order and include the average value as part
				// of that
				// summary.
				break;
			case 11:
				System.out.println("Quitting");
				break;
			case 12:
				
				System.out.println("Write out all cards with speed over 60 to a file in separate thread");
				threadWriting();
				
			default:
				System.out.println("Try options again...");
			}
		} while (option != 11);
		scanner.close();
	}

	private static void threadWriting() {
		//create run class
		Ithread ire = new Ithread();
		
		// pass run class into thread class
		Thread newThread = new Thread(ire);
		//start other thread
		newThread.start();
		
	}

	private static void averages(List<TopTrumpCard> mainDeck) {
		Collections.sort(mainDeck, new CompareCardsByAverage());
		for (TopTrumpCard c : mainDeck) {
			displayCard(c);

		}
	}

	private static void displayCard(TopTrumpCard c) {
		System.out.println("------------------");
		System.out.println("Name:          " + c.getName());
		System.out.println("Real Name:     " + c.getRealName());
		System.out.println("Img Filename:  " + c.getImageFilename());
		System.out.printf("spe=%d | str=%d | agl=%d | int=%d %n", c.getSpeed(), c.getStrength(), c.getAgility(),
				c.getIntelligence());
		System.out.println("Bio: " + c.getBio());
		System.out.println("Average: " + (calculateAvg(c)));
		System.out.println("------------------");
		System.out.println();

	}

	public static int calculateAvg(TopTrumpCard c) {
		// TODO Auto-generated method stub
		return (c.getAgility() + c.getSpeed() + c.getStrength() + c.getIntelligence()) / 4;
	}

	private static void removeDupes(List<TopTrumpCard> mainDeck) {
		Set<TopTrumpCard> set = new HashSet<TopTrumpCard>(mainDeck);
		mainDeck.clear();
		mainDeck.addAll(set);

	}

	private static void findSwaps(List<TopTrumpCard> mainDeck) {
		// create lists to hold duplicates and unqiues
		List<TopTrumpCard> duplicates = new ArrayList<TopTrumpCard>();
		List<TopTrumpCard> uniques = new ArrayList<TopTrumpCard>();

				
		for (TopTrumpCard c : mainDeck) {
			if (!uniques.contains(c)) {
				uniques.add(c);
			} else {
				duplicates.add(c);
			}
		}

		System.out.println("Main deck size = " + mainDeck.size());
		System.out.println("Uniques deck size = " + uniques.size());
		System.out.println("Duplicates size = " + duplicates.size());
		// displayAllCards(dupes);

	}

	private static void longestBioDisplayer(List<TopTrumpCard> mainDeck) {
		// set counter to first bio length
		int longestBio = mainDeck.get(0).getBio().length();
		List<TopTrumpCard> longestBioList = new ArrayList<TopTrumpCard>();

		// loop through, find longest bio count
		for (TopTrumpCard c : mainDeck) {

			if (c.getBio().length() > longestBio) {
				longestBio = c.getBio().length();
			}
		}

		// loop through again and add any bios that match the length
		for (TopTrumpCard c : mainDeck) {
			if (c.getBio().length() == longestBio) {
				longestBioList.add(c);
			}
		}

		for (int i = 0; i < longestBioList.size(); i++) {
			displayBioSummary(longestBioList.get(i));
		}
	}

	private static void displayBioSummary(TopTrumpCard c) {
		System.out.printf("%s	%s%n", c.getName(), c.getBio());
		System.out.println();
	}

	private static List<TopTrumpCard> vilainsAgilityAboveCutOff(List<TopTrumpCard> list, int statCutOff) {
		List<TopTrumpCard> toReturn = new ArrayList();
		for (TopTrumpCard c : list) {
			if (c.getCategory() == Category.VILLAIN && c.getAgility() >= statCutOff) {
				toReturn.add(c);
			}
		}
		return toReturn;
	}

	private static void displaySummary(TopTrumpCard c) {
		System.out.printf("%s / %s (%s)%n", c.getName(), c.getRealName(), c.getCategory().toString());
		System.out.printf("spe=%d | str=%d | agl=%d | int=%d %n", c.getSpeed(), c.getStrength(), c.getAgility(),
				c.getIntelligence());
		System.out.println();

	}

	private static List<TopTrumpCard> findXstrongestHeroes(List<TopTrumpCard> mainDeck) {

		// sort list to heros
		// sort by strength
		List<TopTrumpCard> heroList = new ArrayList<TopTrumpCard>();
		for (TopTrumpCard c : mainDeck) {
			if (c.getCategory() == Category.HERO) {
				heroList.add(c);
			}
		}

		Collections.sort(heroList, new CompareCardByStrength());

		return heroList;
	}

	private static void displayAllCards(List<TopTrumpCard> mainDeck) {
		for (TopTrumpCard c : mainDeck) {
			System.out.println("------------------");
			System.out.println("Name:          " + c.getName());
			System.out.println("Real Name:     " + c.getRealName());
			System.out.println("Img Filename:  " + c.getImageFilename());
			System.out.printf("spe=%d | str=%d | agl=%d | int=%d %n", c.getSpeed(), c.getStrength(), c.getAgility(),
					c.getIntelligence());
			System.out.println("Bio: " + c.getBio());
			System.out.println("------------------");
			System.out.println();
		}

	}

	private static void displayDeck(List<TopTrumpCard> mainDeck) {
		System.out.println("Number of cards in current deck: " + mainDeck.size());
		System.out.println();

	}

	/**
	 * Reads in the data from the provided csv and returns a list of TopTrumpCard
	 * objects for further processing - requires updating for full functionality
	 */
	public static List<TopTrumpCard> readData() {

		List<TopTrumpCard> listFromFile = new ArrayList<TopTrumpCard>();

		File file = new File("toptrumpscards.csv"); // hard coded to specific file

		// try with resources - auto closes reader resources when finished/exception
		// occurs
		try (FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr);) {

			String line = reader.readLine(); // discard header
			line = reader.readLine(); // read first line

			while (line != null) {

				String[] extract = line.split(",");// split by coma
				String name = extract[0];
				String realName = extract[1];
				String imageFilename = extract[2];
				Category category = Category.valueOf(extract[3].toUpperCase());
				int speed = Integer.parseInt(extract[4]);
				int strength = Integer.parseInt(extract[5]);
				int agility = Integer.parseInt(extract[6]);
				int intelligence = Integer.parseInt(extract[7]);
				String bio = extract[8];

				TopTrumpCard c = new TopTrumpCard(name, realName, imageFilename, category, speed, strength, agility,
						intelligence, bio);

				// TODO Code to process current line
				// TODO instantiate TopTrumpCard object
				// TODO and add to list

				listFromFile.add(c);

				line = reader.readLine();// attempt to read next line and loop again
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch (Exception e) {
			System.out.println("Exception occured");
			System.out.println(listFromFile.size() + " lines read successfully");
			System.out.println(e.getMessage());
		}
		System.out.println(listFromFile.size() + " lines read successfully");
		return listFromFile;
	}

}
