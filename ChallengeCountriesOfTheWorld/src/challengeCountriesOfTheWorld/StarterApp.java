package challengeCountriesOfTheWorld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StarterApp {

	public static void main(String[] args) {
		
		Map<String, String> RegionMap = readInCSVCountryList("countries.csv");
		printMap(RegionMap);
		
		
		
	}
	
	
	
	public static Map<String, String> readInCSVCountryList(String filename) {
		
		String line;
		Map<String, String> RegionMap = new HashMap<String, String>();
		
		try {
			File f = new File(filename);
			FileReader fr;
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine(); //dump headers
			line = br.readLine();
			
			while (line != null) {
				//create string array to hold line contents
				String[] extract = line.split(",");
				
				
				//formatting region
				String firstLetter = extract[1].substring(0, 1);
				String remaining = extract[1].substring(1).toLowerCase();
				String region = firstLetter+remaining;
				
				
				//update map
				RegionMap.put(extract[0], region);
				
				line = br.readLine();
								
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return RegionMap;
		
		
		
	}
	
	public static void printMap(Map<String, String> map) {
		System.out.println("\nMap contains:\nKey\t\t\t Value");
		for (String key: map.keySet()) {
			System.out.printf("%-25s%10s \n", key, map.get(key));
		}
	}
	
}
