package challengeTVRater;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProgramDriver {

	public static void main(String[] args) {

		// create arrayList to hold program
		ArrayList<Programme> programList = new ArrayList<Programme>();

		// read in files
		readInProgrammesFromFile(programList);
		
		//output all details
		showAllDetails(programList);

		
		//output BBC shows
		searchByBroadcaster(programList, "BBC");
	}

	public static void readInProgrammesFromFile(ArrayList<Programme> tvProgrammes) {

		File file = new File("TVProgrammes.csv");
		String line;
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// read line by line
			line = bufferedReader.readLine(); // skipping first line
			line = bufferedReader.readLine();

			while (line != null) {
				// System.out.println(line);

				// create OOP class to hold program
				Programme programme = new Programme();

				// split the string based on ","
				String[] splitLine = line.split(",");

				programme.setProgramName(splitLine[0]);
				programme.setBroadcaster(splitLine[1]);
				programme.setRating(Integer.parseInt(splitLine[2]));
				programme.setAudience(Double.parseDouble(splitLine[3]));

				// add to arrayList
				tvProgrammes.add(programme);

				line = bufferedReader.readLine(); // move to next line
			}

			bufferedReader.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (Exception exception) {
			System.out.println("General issue");
		}

	}
	
	public static void showAllDetails(ArrayList<Programme> tvPrograms) {
		for (Programme p: tvPrograms) {
			System.out.printf("Name: %s %n", p.getProgramName());
			System.out.printf("Broadcaster: %s %n", p.getBroadcaster());
			System.out.printf("Rating: %d %n", p.getRating());
			System.out.printf("Audience: %s %n", p.getAudience());
			System.out.println();
		}
	}
	
	public static void searchByBroadcaster(ArrayList<Programme> tvPrograms, String searchTerm) {
		for (Programme p : tvPrograms) {
			if(p.getBroadcaster().equalsIgnoreCase(searchTerm)) {
				System.out.println(p.getProgramName());
			}
		}
	}
}
