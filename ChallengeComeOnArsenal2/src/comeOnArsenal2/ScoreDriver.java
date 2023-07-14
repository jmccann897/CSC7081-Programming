package comeOnArsenal2;

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
import java.util.Set;

public class ScoreDriver {
	private static final String FILENAME = "Results.txt";
	private static final Map<String, Team> TEAMS = new HashMap<String, Team>();
	private static final int WINPOINTS = 3;
	private static final int DRAWPOINTS = 1;
	private static final int LOSSPOINTS = 0;

	public static void main(String[] args) {

		processResults();
		
		List<Team> sortedByName = new ArrayList<Team>(TEAMS.values());
		List<Team> sortedByPoints = new ArrayList<Team>(TEAMS.values());
		Collections.sort(sortedByPoints, new CompareByPoints());
		//displayMap(TEAMS);
		displayTeams(sortedByPoints);

	}

	private static void displayTeams(List<Team> list) {
		System.out.println("Team           Played For Against               W  D  L     Points");
		for(Team t: list) {
			t.displayTeamInfo();
		}
	}

	private static void displayMap(Map<String, Team> map) {
		// TODO Auto-generated method stub
		for (String key : map.keySet()) {
			System.out.printf("%s, %s%n", key, map.get(key));
		}
		
	}

	private static void processResults() {
		// read in file

		File path = new File(FILENAME);
		
		

		String line;

		try(FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)) {
			
			line = br.readLine(); // first line

			while (line != null) {
				String[] extract = line.split(" ");
				checkTeam(extract);

				line = br.readLine(); // move to next line
			}  

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void checkTeam(String[] matchInfo) {
		/**
		 * String MatchInfo contains the following format
		 * Team1Name, Team1Score, Team2Score, Team2Name 
		 * 
		 * Data stored in map with keys being strings for team names Values are the
		 * complex team object - which can be updated
		 * 
		 * Checks for team 1 in map then checks if team 2 in map 
		 * and then recursively calls for updateTeamStats
		 * 
		 */

		String Team1Name = matchInfo[0];
		String Team2Name = matchInfo[3];

		if (!TEAMS.containsKey(Team1Name)) {
			TEAMS.put(Team1Name, new Team(Team1Name));
			checkTeam(matchInfo);
		} else if (!TEAMS.containsKey(Team2Name)) {
			TEAMS.put(Team2Name, new Team(Team2Name));
			checkTeam(matchInfo);
		} else {
			updateTeamStats(matchInfo);
		}

	}

	private static void updateTeamStats(String[] matchInfo) {
		/**
		 *  String MatchInfo contains the following format Team1Name, Team1Score,
		 *  Team2Score, Team2Name 
		 *  TODO - process results, Update team data
		 */
		//update team 1 details
		updateTeam1(matchInfo);
		updateTeam2(matchInfo);
		

	}

	private static void updateTeam2(String[] matchInfo) {
		// TODO Auto-generated method stub
		if (TEAMS.containsKey(matchInfo[3])) {
			//prep variables to update
			//update goals for and against
			int goalsFor = Integer.parseInt(matchInfo[2]);
			int goalsAgainst = Integer.parseInt(matchInfo[1]);
			int addToPlayed = 1;
			int matchPoints = matchOutcome(goalsFor, goalsAgainst);
			//update object in map
			Team t = TEAMS.get(matchInfo[3]);
			t.setPoints(t.getPoints()+matchPoints);
			t.setGoalsFor(t.getGoalsFor()+goalsFor);
			t.setGoalsAgainst(t.getGoalsAgainst()+goalsAgainst);
			//+1 to played
			t.setPlayed(t.getPlayed()+addToPlayed);
			//identify if win, loss , draw
			switch(matchPoints) {
			case 3: t.setWin(t.getWin()+1); break;
			case 1: t.setDraw(t.getDraw()+1); break;
			case 0: t.setLoss(t.getLoss()+1); break;
			default: System.out.println("In matchPoint switch default somehow");
			}
		}
		
	}

	private static void updateTeam1(String[] matchInfo) {
		// TODO Auto-generated method stub
		if (TEAMS.containsKey(matchInfo[0])) {
			//prep variables to update
			//update goals for and against
			int goalsFor = Integer.parseInt(matchInfo[1]);
			int goalsAgainst = Integer.parseInt(matchInfo[2]);
			int addToPlayed = 1;
			int matchPoints = matchOutcome(goalsFor, goalsAgainst);
			//update object in map
			Team t = TEAMS.get(matchInfo[0]);
			t.setPoints(t.getPoints()+matchPoints);
			t.setGoalsFor(t.getGoalsFor()+goalsFor);
			t.setGoalsAgainst(t.getGoalsAgainst()+goalsAgainst);
			//+1 to played
			t.setPlayed(t.getPlayed()+addToPlayed);
			//identify if win, loss , draw
			switch(matchPoints) {
			case 3: t.setWin(t.getWin()+1); break;
			case 1: t.setDraw(t.getDraw()+1); break;
			case 0: t.setLoss(t.getLoss()+1); break;
			default: System.out.println("In matchPoint switch default somehow");
			}
		}
		
	}

	private static int matchOutcome(int goalsFor, int goalsAgainst) {
		// switch
		int gdiff = goalsFor-goalsAgainst;
		int toReturn = 0;
		if (gdiff>0) {
			toReturn = WINPOINTS;
		}
		if(gdiff<0) {
			toReturn = LOSSPOINTS;
		}
		if (gdiff==0) {
			toReturn = DRAWPOINTS;
		}
		return toReturn;
	}

}
