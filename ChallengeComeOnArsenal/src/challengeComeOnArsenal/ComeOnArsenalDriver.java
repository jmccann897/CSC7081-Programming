package challengeComeOnArsenal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ComeOnArsenalDriver {
	
	private static Map<String, Team> teams = new HashMap<String, Team>();

	public static void main(String[] args) {
		
		String line;
		
		//read in file
		try {
			File f = new File("Results.txt");
			FileReader fr;
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine(); //no header line so process first line
			
			//while info in file do something
			while (line != null) {
				String[] extract = line.split(" ");
				
				//check if team isn't on map and create else skip
				//key == teamName
				if(!teams.containsKey(extract[0])){
					Team t = new Team(extract[0]);
					//update for stats
					int goalsFor = Integer.parseInt(extract[1]);
					t.setGoalsFor(goalsFor);
					int goalsAgainst = Integer.parseInt(extract[2]);
					t.setGoalsAgainst(goalsAgainst);
					t.setGamesPlayed(t.getGamesPlayed()+1);
					if(goalsFor > goalsAgainst) {
						t.setWins(t.getWins()+1);
					}else if(goalsFor == goalsAgainst) {
						t.setDraws(t.getDraws()+1);
					}else {
						t.setLosses(t.getLosses()+1);
					}
					teams.put(extract[0], t);
				}
				
				if(!teams.containsKey(extract[3])){
					Team t = new Team(extract[3]);
					//update for stats
					int goalsFor = Integer.parseInt(extract[2]);
					t.setGoalsFor(goalsFor);
					int goalsAgainst = Integer.parseInt(extract[1]);
					t.setGoalsAgainst(goalsAgainst);
					t.setGamesPlayed(t.getGamesPlayed()+1);
					if(goalsFor > goalsAgainst) {
						t.setWins(t.getWins()+1);
					}else if(goalsFor == goalsAgainst) {
						t.setDraws(t.getDraws()+1);
					}else {
						t.setLosses(t.getLosses()+1);
					}
					teams.put(extract[3], t);
				}
				
				//all teams caught by now
				
				//need to update team stats if they are found again
				
				
				/**
				 * Issue with looping through full map 
				 * as its created and updated then updated from first encounter
				 * might need to loop through and create team names
				 * loop through map to update stats with all teams created
				 */
				Collection<Team> vals = teams.values();
				for (Team t: vals) {
					if (extract[0].equals(t.getTeamName())) {
						//update stats
						int goalsFor = Integer.parseInt(extract[1]);
						//need to add previous goalsFor
						t.setGoalsFor(t.getGoalsFor() +goalsFor);
						int goalsAgainst = Integer.parseInt(extract[2]);
						t.setGoalsAgainst(t.getGoalsAgainst()+goalsAgainst);
						t.setGamesPlayed(t.getGamesPlayed()+1);
						if(goalsFor > goalsAgainst) {
							t.setWins(t.getWins()+1);
						}else if(goalsFor == goalsAgainst) {
							t.setDraws(t.getDraws()+1);
						}else {
							t.setLosses(t.getLosses()+1);
						}
						
					}
					if(extract[3].equals(t.getTeamName())) {
						//update stats
						int goalsFor = Integer.parseInt(extract[2]);
						t.setGoalsFor(t.getGoalsFor()+goalsFor);
						int goalsAgainst = Integer.parseInt(extract[1]);
						t.setGoalsAgainst(t.getGoalsAgainst()+goalsAgainst);
						t.setGamesPlayed(t.getGamesPlayed()+1);
						if(goalsFor > goalsAgainst) {
							t.setWins(t.getWins()+1);
						}else if(goalsFor == goalsAgainst) {
							t.setDraws(t.getDraws()+1);
						}else {
							t.setLosses(t.getLosses()+1);
						}
					}
				}

				
				
				
				//move to next line
				line=br.readLine();
			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("\nMap contains: \nKey\t\tValue");
		for (String key: teams.keySet()) {
			System.out.printf("%-10s%10s \n", key, teams.get(key));
		}


		


	}

}
