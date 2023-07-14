package challengeWoof;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DogDriver {

	private static final String DOG_CSV_FILE = "DogData.csv";
	private static List<Dog> Dogs;

	public static void main(String[] args) {
		Dogs = new ArrayList<Dog>();
		readInData();
		menuSystem();

	}

	private static void menuSystem() {

		Scanner sc = new Scanner(System.in);
		int userinput = 0;
		do {
			System.out.println();
			System.out.println("Please select an option");
			System.out.println("1. Show all");
			System.out.println("2. Order and Show by Height (smallest first)");
			System.out.println("3. Order and Show by Weight (heaviest first)");
			System.out.println("4. Group and Show by Country (frequency per country)");
			System.out.println("5. Exit");
			System.out.println();
			
			userinput = sc.nextInt();

			switch (userinput) {
			case 1:
				showAll();
				break;
			case 2:
				orderByHeight();
				break;
			case 3:
				orderByWeight();
				break;
			case 4:
				GroupByCountry();
				break;
			case 5:
				break;
			default:
				System.out.println("Got to default somehow?");
			}

		} while (userinput != 5);
	}

	private static void GroupByCountry() {
		//map country to breed
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (Dog d: Dogs) {//loop through dog list
			if (map.containsKey(d.getCountryOfOrigin())) {
				//update freq count if present
				int count = map.get(d.getCountryOfOrigin());
				map.put(d.getCountryOfOrigin(), count+1);
			} else {
				//add new country
				map.put(d.getCountryOfOrigin(), 1);
			}
		}
		System.out.println(map.toString());
		
		
	}

	private static void orderByWeight() {
		//use comparator
		Collections.sort(Dogs, new CompareDogsByWeight());
		showAll();
		
	}

	private static void orderByHeight() {
		//use comparator
		Collections.sort(Dogs, new CompareDogsByHeight());
		showAll();
	}

	private static void showAll() {
		for (Dog d : Dogs) {
			System.out.println(d.toString());
		}

	}

	private static void readInData() {

		String line = "";
		int lineCount = 0;
		try {
			File f = new File(DOG_CSV_FILE);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			// clear header
			br.readLine();
			line = br.readLine();
			
			while (line != null) {
				String[] extract = line.split(",");
				String breed = extract[0];
				double weightInKg = Double.parseDouble(extract[1]);
				double heightInCm = Double.parseDouble(extract[2]);
				double lifeExpectancyInYears = Double.parseDouble(extract[3]);
				String colour = extract[4];
				String countryOfOrigin = extract[5];

				Dog d = new Dog(breed, weightInKg, heightInCm, lifeExpectancyInYears, colour, countryOfOrigin);
				Dogs.add(d);

//				System.out.println(d.toString());
//				lineCount += 1;
//				System.out.println(lineCount);

				// move to next line
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
