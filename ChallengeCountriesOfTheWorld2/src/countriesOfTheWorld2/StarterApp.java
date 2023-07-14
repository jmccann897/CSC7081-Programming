package countriesOfTheWorld2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StarterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Country> countryList = readInCSVFile();
		display(countryList);
		searchByRegion("Near east", countryList);
		Collections.sort(countryList, new CompareCountryByPopulation());
		displayPopulation(countryList);
		
		
	}

	private static void displayPopulation(List<Country> countryList) {
		System.out.println("Countries by population ascending");
		for (Country c: countryList) {
			System.out.printf("%-10d   %s%n", c.getPopulation(), c.getName());
		}
		
	}

	private static void searchByRegion(String string, List<Country> list) {
		System.out.println("Regional Data - "+string);
		for(Country c : list) {
			if (c.getRegion().equalsIgnoreCase(string)) {
				System.out.println(string+" "+c.getName());
			}
		}


		
	}

	private static void display(List<Country> countryList) {
		for (Country c: countryList) {
			System.out.println();
			System.out.printf("Name:         %s%n", c.getName());
			System.out.printf("Region:       %s%n", c.getRegion());
			System.out.printf("Population:   %d%n", c.getPopulation());
			System.out.printf("Area:         %d%n", c.getArea());
			System.out.printf("Density:      %.2f%n", c.getDensity());
			System.out.println();
		}
		
	}

	private static List<Country> readInCSVFile() {

		List<Country> toReturn = new ArrayList<Country>();
		String line;
		File f;
		FileReader fr;
		BufferedReader br;
		
		try {
			f = new File("countries.csv");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			line = br.readLine(); //dump header
			line=br.readLine();
			
			while (line != null) {
				
				String [] extract = line.split(",");
				//create country object and add to arrayList
				String name = extract[0].trim();
				String regionRough = extract[1].strip();
				String region = processRegionString(regionRough);
				int population = Integer.parseInt(extract[2]);
				int area = Integer.parseInt(extract[3]);
				Country c = new Country(name, region, population, area);
				toReturn.add(c);
				line = br.readLine();//move to next line
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return toReturn;
		
	}

	private static String processRegionString(String str) {
		str = correctRegion(str);
		str = correctFormat(str);
		return str;
	}

	private static String correctFormat(String str) {
		String firstLetter = str.substring(0, 1).toUpperCase();
		String remainingLetters = str.substring(1).toLowerCase();
		return firstLetter+remainingLetters;
		
	}

	private static String correctRegion(String str) {
		// Eastern/Western Europe = Europe
		if (str.contains("EASTERN EUROPE") || str.contains("WESTERN EUROPE")) {
			str =  "Europe";
		}
		//Sub-saharan africa / Northern africa = Africa
		if (str.contains("SUB-SAHARAN AFRICA") || str.contains("NORTHERN AFRICA")) {
			str =  "Africa";
		}
		return str;
	}

}
