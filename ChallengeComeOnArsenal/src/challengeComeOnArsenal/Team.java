package challengeComeOnArsenal;

public class Team {

	// instance vars
	private String teamName;
	private int gamesPlayed;
	private int goalsFor;
	private int goalsAgainst;
	private int wins;
	private int draws;
	private int losses;
	private int totalPoints;

	// constructor with args
	public Team(String teamName) {
		this.teamName = teamName;
		// initialise stat counters
		this.gamesPlayed = 0;
		this.goalsFor = 0;
		this.goalsAgainst = 0;
		this.wins = 0;
		this.draws = 0;
		this.losses = 0;
		this.setTotalPoints();
	}

	private void setTotalPoints() {
		this.totalPoints = (this.getWins()*3) + this.getDraws();
		
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the gamesPlayed
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * @param gamesPlayed the gamesPlayed to set
	 */
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	/**
	 * @return the goalsFor
	 */
	public int getGoalsFor() {
		return goalsFor;
	}

	/**
	 * @param goalsFor the goalsFor to set
	 */
	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}

	/**
	 * @return the goalsAgainst
	 */
	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	/**
	 * @param goalsAgainst the goalsAgainst to set
	 */
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}

	/**
	 * @return the draws
	 */
	public int getDraws() {
		return draws;
	}

	/**
	 * @param draws the draws to set
	 */
	public void setDraws(int draws) {
		this.draws = draws;
	}

	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", gamesPlayed=" + gamesPlayed + ", goalsFor=" + goalsFor
				+ ", goalsAgainst=" + goalsAgainst + ", wins=" + wins + ", draws=" + draws + ", losses=" + losses
				+ ", totalPoints=" + totalPoints + "]";
	}

	
	
}
