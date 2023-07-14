package p3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
* @author - McCannJoshua 40059274
*/
public class Ithread implements Runnable{
	
	//instance var
	List<Accommodation> list;

	//constructor to pass in list variable
	public Ithread(List<Accommodation> mainList) {
		this.list = mainList;
	}
	
	@Override
	public void run() {
		
		//creating file object
		File f = new File("averageCosts.csv");
		//creating set of unique name strings
		Set<String> cityNames = Launcher.uniqueCities(list);
		//using conversion constructor to make it a list 
		List<String> toCalc = new ArrayList<String>(cityNames);
		//sort using natural ordering on strings as all cities should have 1st letter upper case
		Collections.sort(toCalc); 
		
		try(FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);){
			
			//Write header
			bw.write("City,Average Price");
			bw.newLine();
			//for each city
			for (String s: toCalc) {
				String cityName = s;
				double avg = Launcher.calculateAvgPrice(Launcher.filterByCity(list, s));
				String avgInStr = String.format("%.2f", avg);
				bw.write(cityName);
				bw.write(",");
				bw.write(avgInStr);
				bw.newLine();
			}
			bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
