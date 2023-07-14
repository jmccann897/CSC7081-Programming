package challengeSuperHeroTopTrumpsRevision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
	 * @param args
	 */
	public static void main(String[] args) {
		showMenu();	
	}
	
	//TODO modify readData method to populate List appropriately - method partially completed already
	//TODO add static methods to this class as required to achieve tasks outlined in menu
	//TODO modify showMenu method to add calls to new methods you write to accomplish the tasks outlined in the menu

	/**
	 * Launches menu system which in turn calls appropriate methods based on user choices
	 * Partially implemented already
	 * requires updating to add calls to other methods written to achieve the tasks described in tasks 3-10
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
				//System.out.println("Option currently disabled...");
				/* TODO Uncomment method call to enable this option 
				 * (requires TopTrumpCard class to match expectations of Game Method to compile successfully)
				 * deliberately commented out initially to allow attempting other tasks
				 */
				CardGame.playDemo(mainDeck);
				break;
			case 3:
				System.out.println("Number of cards in current deck = "+mainDeck.size());
				break;
			case 4:
				displayDeck(mainDeck);
				// TODO add required method call(s)
				break;
			case 5:
				top5Strongest(mainDeck);
				break;
			case 6:
				//create villain list
				List<TopTrumpCard> villainList = extractVillains(mainDeck);
				List<TopTrumpCard> villainsByAgility = extractByStat(villainList, 2, 75);
				//use comparator to order alphabetically
				Collections.sort(villainsByAgility, new CompareCardsByName());
				displayDeck(villainsByAgility);
				break;
			case 7:
				Collections.sort(mainDeck, new CompareCardsByBio());
				displayNameAndBio(mainDeck);
				break;
			case 8:
				//identify and display duplicates
				findDuplicates(mainDeck);
				break;
			case 9:
				removeDuplicates(mainDeck);
				break;
			case 10:
				findAverages(mainDeck);
				break;
			case 11:
				System.out.println("Quitting");
				break;
			default:
				System.out.println("Try options again...");
			}
		} while (option != 11);
		scanner.close();
	}
private static void findAverages(List<TopTrumpCard> mainDeck) {
		Collections.sort(mainDeck, new CompareCardsByAverage());
		displayDeckWithAverages(mainDeck);
		}
		
	private static void displayDeckWithAverages(List<TopTrumpCard> mainDeck) {
		int iteration=1;
		for(TopTrumpCard c: mainDeck) {
			System.out.println();
			System.out.println("No. "+iteration);
			System.out.printf("%s / %s (%s)%n", c.getName(), c.getRealName(), c.getCategory());
			System.out.printf("Sp: %d | St: %d | Ag: %d | In: %d%n", c.getSpeed(), c.getStrength(), c.getAgility(), c.getIntelligence());
			System.out.printf("Average Stat: %.2f%n", c.calcAverageStat());
			System.out.println();
			iteration+=1;
		}
		
	}

private static void removeDuplicates(List<TopTrumpCard> mainDeck) {
		Set<TopTrumpCard> noDuplicates = new HashSet<TopTrumpCard>(mainDeck);
		mainDeck.clear();
		mainDeck.addAll(noDuplicates);
	}

private static void findDuplicates(List<TopTrumpCard> mainDeck) {
		List<TopTrumpCard> duplicates = new ArrayList<TopTrumpCard>();
		List<TopTrumpCard> uniques = new ArrayList<TopTrumpCard>();
		for(TopTrumpCard c: mainDeck) {
			if(!uniques.contains(c)) {
				uniques.add(c);
			}else {
				duplicates.add(c);
			}
		}
		System.out.println("main deck size = "+mainDeck.size());
		System.out.println("uniques deck size = "+uniques.size());
		System.out.println("duplicates deck size = "+duplicates.size());
		displayDeck(duplicates);
		
	}

private static void displayNameAndBio(List<TopTrumpCard> mainDeck) {
		for (TopTrumpCard c: mainDeck) {
			System.out.println();
			System.out.printf("Name: %s%n", c.getName());
			System.out.printf("Bio:  %s%n", c.getBio());
			
		}
		
	}

/**
 * helper method to create a new arraylist of cards extracted from another list of cards by a stat 
 * 0=speed, 1 = strength, 2 = agility, 3 = intelligence
 * cutoff is the min value inclusive for cards to have of the particular stat defined
 * @param List
 * @param statName
 * @param cutoff
 * @return
 */
	private static List<TopTrumpCard> extractByStat(List<TopTrumpCard> List, int statName, int cutoff) {
		List<TopTrumpCard> toReturn = new ArrayList<TopTrumpCard>();
		if (statName==0) {
			for (TopTrumpCard c: List) {
				if (c.getSpeed()>=cutoff) {
					toReturn.add(c);
				}
			}
		}
		if (statName==1) {
			for (TopTrumpCard c: List) {
				if (c.getStrength()>=cutoff) {
					toReturn.add(c);
				}
			}
		}
		if (statName==2) {
			for (TopTrumpCard c: List) {
				if (c.getAgility()>=cutoff) {
					toReturn.add(c);
				}
			}
		}
		if (statName==3) {
			for (TopTrumpCard c: List) {
				if (c.getIntelligence()>=cutoff) {
					toReturn.add(c);
				}
			}
		}
		
		return toReturn;
	}

	private static List<TopTrumpCard> extractVillains(List<TopTrumpCard> mainDeck) {
		List<TopTrumpCard> toReturn = new ArrayList<TopTrumpCard>();
		for (TopTrumpCard c : mainDeck) {
			if(c.getCategory() == Category.VILLAIN) {
				toReturn.add(c);
			}
		}
		return toReturn;
	}

	private static void top5Strongest(List<TopTrumpCard> mainDeck) {
		//use comparator based on strength value
		Collections.sort(mainDeck, new CompareCardsByStrength());
		displaytop5(mainDeck);
	}

	private static void displaytop5(List<TopTrumpCard> mainDeck) {
		int iteration = 1;
		for (int i = mainDeck.size()-1; i>mainDeck.size()-6; i--) {
			TopTrumpCard c = mainDeck.get(i);
			
			System.out.println();
			System.out.println("No."+ iteration);
			System.out.printf("name:           %s%n", c.getName());
			System.out.printf("realname:       %s%n", c.getRealName());
			System.out.printf("Image filename: %s%n", c.getImageFileName());
			System.out.printf("Speed:          %d%n", c.getSpeed());
			System.out.printf("Strength:       %d%n", c.getStrength());
			System.out.printf("Agility:        %d%n", c.getAgility());
			System.out.printf("Intelligence:   %d%n", c.getIntelligence());
			System.out.printf("Bio:            %s%n", c.getBio());
			System.out.println();
			iteration+=1;
		}
		
	}

	private static void displayDeck(List<TopTrumpCard> mainDeck) {
		for(TopTrumpCard c: mainDeck) {
			System.out.println();
			System.out.printf("name:           %s%n", c.getName());
			System.out.printf("realname:       %s%n", c.getRealName());
			System.out.printf("Image filename: %s%n", c.getImageFileName());
			System.out.printf("Speed:          %d%n", c.getSpeed());
			System.out.printf("Strength:       %d%n", c.getStrength());
			System.out.printf("Agility:        %d%n", c.getAgility());
			System.out.printf("Intelligence:   %d%n", c.getIntelligence());
			System.out.printf("Bio:            %s%n", c.getBio());
			System.out.println();
		}
		
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

				//create arguments for constructor
				String[] extract = line.split(",");
				String name = extract[0];
				String realName = extract[1];
				String imageFileName = extract[2];
				Category category = Category.valueOf(extract[3].toUpperCase());
				int speed = Integer.parseInt(extract[4]);
				int strength = Integer.parseInt(extract[5]);
				int agility = Integer.parseInt(extract[6]);
				int intelligence = Integer.parseInt(extract[7]);
				String bio = extract[8];
					
				//create card to add
				TopTrumpCard c = new TopTrumpCard(name, realName, imageFileName, category, speed, strength, agility, intelligence, bio);
				
				listFromFile.add(c);
				// TODO Code to process current line
				// TODO instantiate TopTrumpCard object
				// TODO and add to list

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
