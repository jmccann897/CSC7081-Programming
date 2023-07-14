package challengeSuperHeroTopTrumps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ithread implements Runnable {

	@Override
	public void run() {
		// take in deck && create new one for writing
		List<TopTrumpCard> localVerOfMainDeck = StartApp.readData();
		List<TopTrumpCard> speedyList = new ArrayList<TopTrumpCard>();
		// sort and filter by speed>60
		for (TopTrumpCard c : localVerOfMainDeck) {
			if (c.getSpeed() > 70) {
				speedyList.add(c);
			}
		}
		// display speedy list to show it reached this far
//		for (TopTrumpCard c: speedyList) {
//			System.out.println("Card name: "+ c.getName());
//		}

		// write results to file
		File f = new File("TopTrumpCardsAbove70Speed.csv");
		String line = "";

		try (FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw)) {

			// write header
			line = "Name,Real Name,Image Filename,Category,Speed,Strength,Agility,Intelligence,Bio";
			bw.write(line); // write line to file
			bw.newLine(); // move to next line

			// loop through list to write to file
			for (TopTrumpCard c : speedyList) {
				// order elements to match file
				String s = String.format("Name: %s | Spd: %d", c.getName(), c.getSpeed());
				
				bw.write(s);
				bw.newLine();
				
//				bw.write(c.getName());
//				bw.write(",");
//				bw.write(c.getRealName());
//				bw.write(",");
//				bw.write(c.getImageFilename());
//				bw.write(",");
//				bw.write(Integer.toString(c.getSpeed()));
//				bw.write(",");
//				bw.write(Integer.toString(c.getStrength()));
//				bw.write(",");
//				bw.write(Integer.toString(c.getAgility()));
//				bw.write(",");
//				bw.write(Integer.toString(c.getIntelligence()));
//				bw.write(",");
//				bw.write(c.getBio());
//				bw.write(",");
//				bw.newLine();

			}
			
			//flush bw
			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//stop thread
//		Thread.currentThread().interrupt();
	}

}
