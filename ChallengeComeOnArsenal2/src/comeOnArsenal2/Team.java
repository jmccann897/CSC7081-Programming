package comeOnArsenal2;

public class Team {

	//instance vars
	private String name;
	private int played;
	private int goalsFor;
	private int goalsAgainst;
	private int win;
	private int loss;
	private int draw;
	private int points;
	
	
	
	public Team(String name) {
		this.name = name;
		this.setPoints(0);
		this.played =0;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the played
	 */
	public int getPlayed() {
		return played;
	}



	/**
	 * @param played the played to set
	 */
	public void setPlayed(int played) {
		this.played = played;
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
	 * @return the win
	 */
	public int getWin() {
		return win;
	}



	/**
	 * @param win the win to set
	 */
	public void setWin(int win) {
		this.win = win;
	}



	/**
	 * @return the loss
	 */
	public int getLoss() {
		return loss;
	}



	/**
	 * @param loss the loss to set
	 */
	public void setLoss(int loss) {
		this.loss = loss;
	}



	/**
	 * @return the draw
	 */
	public int getDraw() {
		return draw;
	}



	/**
	 * @param draw the draw to set
	 */
	public void setDraw(int draw) {
		this.draw = draw;
	}



	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}



	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}



	@Override
	public String toString() {
		return "Team [name=" + name + ", played=" + played + ", goalsFor=" + goalsFor + ", goalsAgainst=" + goalsAgainst
				+ ", win=" + win + ", loss=" + loss + ", draw=" + draw + ", points=" + points + "]";
	}
	
	
	public void displayTeamInfo() {
		System.out.printf("%-10s \t%d\t%d\t%d \t\t%d  %d  %d \t%d%n", name, played, goalsFor, goalsAgainst, win, draw, loss, points);
	}
	
}
