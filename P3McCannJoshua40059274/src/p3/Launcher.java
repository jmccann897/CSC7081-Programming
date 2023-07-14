package p3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
* @author - McCannJoshua 40059274
*/

public class Launcher {
	

	private static Scanner scanner = new Scanner(System.in);
	private static final int QUIT = 10;

	/**
	 * Entry point of program - no need to modify this method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launchMenu();
		scanner.close();// close scanner once menu system completes
	}

	// TODO modify readData method to populate List appropriately - method partially
	// completed already
	// TODO add static methods to this class as required to achieve tasks outlined
	// in menu
	// TODO modify launchMenu method to add calls to new methods you write etc to
	// accomplish the tasks outlined in the menu

	/**
	 * Launches menu system which in turn calls appropriate methods based on user
	 * choices Partially implemented already. Requires updating to add calls to
	 * other methods written to achieve the tasks described in tasks 3-9
	 */
	public static void launchMenu() {
		List<Accommodation> mainList = readRoomData("Rooms.csv");

		System.out.println();
		int option;
		System.out.println("AccommyNation.com - Wherever you go, you'll need to stay");

		// repeat until quit chosen
		do {
			displayOptions();

			// get input
			option = getMenuChoice("Enter choice ...");
			System.out.println();

			try {
				// process choice - invoke relevant methods etc.
				switch (option) {

				case 1:
					mainList = readRoomData("Rooms.csv");
					break;
				case 2:
					System.out.println("Number of places to stay is " + mainList.size());
					break;
				case 3:
					System.out.println("Display printed details of all places in current list");
					displayList(mainList);
					break;
				case 4:
					System.out.println("3 Least Expensive in LA with 4 star rating, low to high price");
					//filter by city first
					List<Accommodation> filteredByCity = filterByCity(mainList, "Los Angeles");
					//filter by star
					List<Accommodation> filteredByStar = filterByStar(filteredByCity, 4);
					//order by price
					List<Accommodation> orderedByPrice = XleastExpensive(filteredByStar, 3);
					//call display method
					displayList(orderedByPrice);

					break;
				case 5:
					System.out.println("Display number of unique city names in current list");
					//private method call to achieve output
					uniqueCityNames(mainList);
					break;
				case 6:
					System.out.println("Details of 4 most expsive BNBs in Dublin, ordered by price high to low");
					//filter by city
					List<Accommodation> dublinPlaces = filterByCity(mainList, "Dublin");
					//filter by type
					List<Accommodation> dublinBNBs = filterByType(dublinPlaces, Type.BNB);
					//order by price
					List<Accommodation> dubPrices = XMostExpensive(dublinBNBs, 4);
					//display results
					displayList(dubPrices);
					break;
				case 7:
					// could try to better parametrise cityname and type
					System.out.println("Display average price for a Hotel in New York to 2 dp");
					//filter by city
					List<Accommodation> NYplaces = filterByCity(mainList, "New York");
					//filter by type
					List<Accommodation> NYhotels = filterByType(NYplaces, Type.HOTEL);
					//helper method to calculate average for a list
					double average = calculateAvgPrice(NYhotels);
					//helper method to display average
					displayAverage(average, "New York");
					break;
				case 8:
					System.out.println("Remove all entries from current list with <10 rooms in Paris");
					//filter by city
					List<Accommodation> ParisPlaces = filterByCity(mainList, "Paris");
					//filter by room max rooms == rooms to remove
					List<Accommodation> ParisBelowXRooms = BelowXRooms(ParisPlaces, 10);
					//removing all rooms below size from mainList 
					mainList.removeAll(ParisBelowXRooms);
					break;
				case 9:
					System.out.println("In another thread write to csv, city and avg price");
					//creating runnable object
					Ithread ire = new Ithread(mainList);
					//creating thread object with runnable object argument
					Thread t1 = new Thread(ire);
					try{
						//starting the other thread
						t1.start();
					} catch (Exception e) {
						// TODO: handle exception
					}
					break;
				case QUIT:
					System.out.println("Quitting");
					break;
				default:
					System.out.println("Try options again...");
				}

			} catch (Exception e) {
				System.out.println("Exception caught");
				System.out.println(e.getMessage());
				System.out.println("please try again");
			}

		} while (option != QUIT);
	}

	/**
	 * Helper method to return a set of strings representing city names for accommodation objects
	 * @param list
	 * @return
	 */
	public static Set<String> uniqueCities(List<Accommodation> list) {
		// If I had more time, I would look into a conversion constructor to possibly achieve this
		Set<String> uniqueList = new HashSet<String>();
		//loop through accommodation objects, and if city name string isn't present add to the set
		for (Accommodation a: list) {
			if (!uniqueList.contains(a.getCity())) {
				uniqueList.add(a.getCity());
			}
		}
		return uniqueList;
	}
	
	
	/**
	 * Helper method to return list of accommodation objects with room values below maxRooms
	 * @param list
	 * @param maxRooms
	 * @return
	 * @throws IllegalArgumentException
	 */
	private static List<Accommodation> BelowXRooms(List<Accommodation> list, int maxRooms) throws IllegalArgumentException {
		// quick validation - null check first otherwise cant be reached
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List passed into calculateAvgPrice is either null or empty");
		}
		// created local copy to hold ordered list
		List<Accommodation> localCopy = new ArrayList<Accommodation>(list);
		List<Accommodation> toReturn = new ArrayList<Accommodation>();

		for(Accommodation a: list) {
			if(a.getRooms() < maxRooms) {
				toReturn.add(a);
			}
		}
		
		return toReturn;
	}

	/**
	 * Helper method to display Average for a given city
	 * @param average
	 * @param cityName
	 */
	private static void displayAverage(double average, String cityName) {
		System.out.printf("Average Price %s: £%.2f%n", cityName, average);

	}

	/**
	 * Helper method to calculate average for a list of accommodation objects
	 * @param list
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static double calculateAvgPrice(List<Accommodation> list) throws IllegalArgumentException {
		// quick validation - null check first otherwise cant be reached
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List passed into calculateAvgPrice is either null or empty");
		}

		double total = 0.0;
		int count = 0;
		for (Accommodation a : list) {
			total += a.getPrice();
			count += 1;
		}

		return total / count;
	}

	/**
	 * Helper method to filter by Accommodation type
	 * @param list
	 * @param type
	 * @return
	 * @throws IllegalArgumentException
	 */
	private static List<Accommodation> filterByType(List<Accommodation> list, Type type) throws IllegalArgumentException {
		// quick validation - null check first otherwise cant be reached
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List passed into filterByType is either null or empty");
		}
		// created local copy to hold ordered list
		List<Accommodation> localCopy = new ArrayList<Accommodation>(list);
		List<Accommodation> toReturn = new ArrayList<Accommodation>();

		for (Accommodation a : list) {
			if (a.getType() == type) {
				toReturn.add(a);
			}
		}

		return toReturn;
	}

	/**
	 * Helper method to return a list of accommodation of size numToReturn 
	 * ordered by price high to low
	 * @param list
	 * @param numToReturn
	 * @return
	 * @throws IllegalArgumentException
	 */
	private static List<Accommodation> XMostExpensive(List<Accommodation> list, int numToReturn) throws IllegalArgumentException{
		// quick validation - null check first otherwise cant be reached
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List passed into XMostExpensive is either null or empty");
		}

		// created local copy to hold ordered list
		List<Accommodation> localCopy = new ArrayList<Accommodation>(list);
		List<Accommodation> toReturn = new ArrayList<Accommodation>();
		Collections.sort(localCopy, new CompareAccByPrice());
		Collections.reverse(localCopy); // could create new comparator but used inbuilt collections option

		// loop logic to capture X argument
		for (int i = 0; i < numToReturn; i++) {
			toReturn.add(localCopy.get(i));
		}

		return toReturn;
	}

	/**
	 * Helper method which takes in Accommodation object list
	 * Creates a map of String - city names, and frequency count of their presence
	 * Calculates total of unique city names
	 * @param list
	 */
	private static void uniqueCityNames(List<Accommodation> list) {
		// print out unique city name list

		// loop through and create a map based on String CityName: freq count
		Map<String, Integer> cityCount = new HashMap<String, Integer>();
		for (Accommodation a : list) {
			if (cityCount.containsKey(a.getCity())) {
				// update counter by 1
				int count = cityCount.get(a.getCity());
				cityCount.put(a.getCity(), count + 1);
			} else {
				// place key in map
				cityCount.put(a.getCity(), 1);
			}
		}
		int total = 0;
		for (String key : cityCount.keySet()) {
			System.out.printf("%-10s%10d %n", key, cityCount.get(key));
			total++;
		}

		System.out.println("Number of Cities = " + total);

	}

	/**
	 * Helper method to return accommodation list 
	 * based on greater than or equal to starRating 
	 * @param list
	 * @param starRating
	 * @return
	 * @throws IllegalArgumentException
	 */
	private static List<Accommodation> filterByStar(List<Accommodation> list, int starRating)
			throws IllegalArgumentException {
		// quick validation - null check first otherwise cant be reached
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List passed into filterByStar is either null or empty");
		}

		List<Accommodation> localCopy = new ArrayList<Accommodation>(list);
		List<Accommodation> toReturn = new ArrayList<Accommodation>();

		for (Accommodation a : list) {
			if (a.getStars() >= starRating) {
				toReturn.add(a);
			}
		}

		return toReturn;
	}

	/**
	 * Helper method to filter by city based on string cityname
	 * @param list
	 * @param cityName
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static List<Accommodation> filterByCity(List<Accommodation> list, String cityName)
			throws IllegalArgumentException {
		// quick validation - null check first otherwise cant be reached
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List passed into filterByCity is either null or empty");
		}

		List<Accommodation> localCopy = new ArrayList<Accommodation>(list);
		List<Accommodation> toReturn = new ArrayList<Accommodation>();

		for (Accommodation a : list) {
			if (a.getCity().equalsIgnoreCase(cityName)) {
				toReturn.add(a);
			}
		}

		return toReturn;
	}

	/**
	 * Helper method to return list sized by numToReturn ordered by price low to high
	 * @param list
	 * @param numToReturn
	 * @return
	 * @throws IllegalArgumentException
	 */
	private static List<Accommodation> XleastExpensive(List<Accommodation> list, int numToReturn)
			throws IllegalArgumentException {
		// quick validation - null check first otherwise cant be reached
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List passed into XleastExpensive is either null or empty");
		}

		// created local copy to hold ordered list
		List<Accommodation> localCopy = new ArrayList<Accommodation>(list);
		List<Accommodation> toReturn = new ArrayList<Accommodation>();
		Collections.sort(localCopy, new CompareAccByPrice());

		// loop logic to capture X argument
		for (int i = 0; i < numToReturn; i++) {
			toReturn.add(localCopy.get(i));
		}

		return toReturn;
	}

	/**
	 * helper method to display accommodation objects in a list
	 * @param mainList
	 */
	private static void displayList(List<Accommodation> mainList) {
		// go through list and print details
		int numOrder = 1;
		for (Accommodation a : mainList) {
			System.out.println(numOrder + ")");
			a.printDetails();
			System.out.println();
			numOrder++;
		}

	}

	/**
	 * Read data from a given filename for a formatted csv file of accommodation
	 * data
	 * 
	 * @param filename
	 * @return list of accommodation objects for each row of the file containing
	 *         valid data
	 */
	public static List<Accommodation> readRoomData(String filename) {
		List<Accommodation> rooms = new ArrayList<Accommodation>();

		// TODO update method to read from formatted csv
		// TODO create an Accommodation object for each line of the file and add to
		// rooms list
		// TODO skip any lines which contain data which doesnt match business rules

		File f = new File("Rooms.csv"); // currently hardcoding filename in
		String line = "";

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {

			line = br.readLine(); // dump header
			line = br.readLine();
			// line counter to help navigate bad data in csv
			// starts at two to match csv but issue with when it hit exception as to actual
			// count value
			int lineCount = 2;

			// loop through
			while (line != null) {
				// issue of bad data - use try catch
				try {

					//could have extracted to AccommodationFactory method if more time
					String[] extract = line.split(",");
					String name = extract[0];
					Type type = Type.valueOf(extract[1].toUpperCase());
					int stars = Integer.parseInt(extract[2]);
					String city = extract[3];
					double price = Double.parseDouble(extract[4]);
					int rooms1 = Integer.parseInt(extract[5]);
					Accommodation a = new Accommodation(name, type, stars, city, price, rooms1);

					// add obj to list to return
					rooms.add(a);
					lineCount++;

				} catch (Exception e) {
					System.out.println("Bad data encountered around line " + lineCount);
					e.printStackTrace();
				}

				line = br.readLine(); // move to next line
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(rooms.size() + " entries read successfully");
		return rooms;
	}

	/**
	 * Display prompt and get int user input via static scanner repeat if invalid
	 * input type given - no need to modify this method
	 * 
	 * @return int value entered via scanner
	 */
	private static int getMenuChoice(String prompt) {
		try {
			System.out.println(prompt);
			int choice = scanner.nextInt();
			return choice;
		} catch (Exception e) {
			System.out.println("Invalid input try again");
			// clear buffer if required
			if (scanner.hasNext()) {
				scanner.next();// read and discard line break
			}
			return getMenuChoice(prompt);// return recursive call to method to recover
		}
	}

	/**
	 * Writes menu options to console - no need to modify this method
	 */
	private static void displayOptions() {
		System.out.println();
		System.out.println("Menu Options:");
		System.out.println("1. (Re)read Data From Original File (use to restore removed data for example)");
		System.out.println("2. Display the number of places to stay in the current list");
		System.out.println("3. Display details for all places to stay in the current list");
		System.out.println(
				"4. Display details of the 3 least expensive 4 Star places to stay in Los Angeles (low to high)");
		System.out.println("5. Display the number of cities in the current list");
		System.out.println("6. Display details of the 4 most expensive BnBs in Dublin (high to low)");
		System.out.println("7. Display the average price of a hotel in New York");
		System.out.println("8. Remove all entries with fewer than 10 rooms available for Paris from the current list");
		System.out.println("9. (Separate Thread) Write out to a formatted csv, "
				+ "\nthe name of each city and the average price of a hotel there (2 decimal places, alphabetcically by City name)");
		System.out.println("10. Quit");
	}

}
