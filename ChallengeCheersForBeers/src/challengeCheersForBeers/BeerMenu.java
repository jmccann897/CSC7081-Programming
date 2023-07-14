package challengeCheersForBeers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BeerMenu {

	public static void main(String[] args) {

		List<Beer> BeerMenu = readInFile();

		menu(BeerMenu);

	}

	private static void menu(List<Beer> beerMenu) {
		int userinput;
		do {
		// menu system
		// menu options
		System.out.println("Please select an option:");
		System.out.println("1: Show all beers");
		System.out.println("2: Order by name");
		System.out.println("3: Output to file all beers above 6% alcohol content");
		System.out.println("4: Quit");

		Scanner sc = new Scanner(System.in);
		userinput = sc.nextInt();

		// switch to capture user input
		//do while to keep menu open until 4 is entered
		
		switch (userinput) {
		case 1:
			showAllBeers(beerMenu);
			break;
		case 2:
			OrderByName(beerMenu);
			break;
		case 3:
			beerAbove6(beerMenu);
			break;
		default:
			System.out.println("User has exited the menu");
		}
		
		} while (userinput!=4);
	}

	private static void beerAbove6(List<Beer> beerMenu) {
		List<Beer> above6 = new ArrayList<Beer>();
		// Loop through list
		for (Beer b : beerMenu) {
			if (b.getAlcoholContent() > 6) {// add to second list which meet criteria
				above6.add(b);
			}
		}
		outputToFile(above6);
		System.out.println();
	}

	private static void outputToFile(List<Beer> above6) {
		// create file & writer
		String filename = "BeerListAbove6.txt";
		String line;

		try {
			File f = new File(filename);
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);

			// loop through list to add beers
			for (Beer b : above6) {
				bw.write(b.toString());
				bw.newLine();
			}

			bw.close();
			fw.close();
			System.out.println();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void OrderByName(List<Beer> beerMenu) {
		// Show to screen list of beers ordered alphabetically on name
		// use comparator
		Collections.sort(beerMenu, new CompareBeersByName());
		showAllBeers(beerMenu);
		System.out.println();

	}

	private static void showAllBeers(List<Beer> beerMenu) {
		System.out.println();
		for (Beer b : beerMenu) {
			System.out.println(b.toString());
			// System.out.println(b.getName()+" Alc% "+b.getAlcoholContent());
		}
		System.out.println();

	}

	private static List<Beer> readInFile() {

		List<Beer> beerList = new ArrayList<Beer>();
		String line;

		try {
			File f = new File("beer_data.csv");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			line = br.readLine(); // dump header

			while (line != null) {
				line = br.readLine();
				String[] extract = line.split(",");
				String name = extract[0];
				String style = extract[1];
				String country = extract[2];
				double alcoholContent = Double.parseDouble(extract[3]);
				Beer b = new Beer(name, style, country, alcoholContent);
				beerList.add(b);
				// System.out.println(b.toString());
				line = br.readLine(); // move to next line
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return beerList;

	}

}
