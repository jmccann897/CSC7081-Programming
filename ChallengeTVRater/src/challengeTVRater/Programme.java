package challengeTVRater;

public class Programme {

	private String programName;
	private String broadcaster; // should be enum
	private int rating;
	private double audience;

	public Programme() {
		// TODO Auto-generated constructor stub
	}

	public Programme(String programName, String broadcaster, int rating, double audience) {
		this.programName = programName;
		this.broadcaster = broadcaster;
		this.rating = rating;
		this.audience = audience;

	}

	// getters & setters
	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getBroadcaster() {
		return broadcaster;
	}

	public void setBroadcaster(String broadcaster) {
		this.broadcaster = broadcaster;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getAudience() {
		return audience;
	}

	public void setAudience(double audience) {
		this.audience = audience;
	}

}
