package practical10_JUnit;

public class mp3 {

	// currently this is unused??
	//public final static int LOWER_RATING = 0;

	// moved instance vars to top for visibility
	private int ref;
	private String artist;
	private String songName;
	private int rating;
	private int songLength;

	/**
	 * default constructor
	 */
	public mp3() {

	}

	/**
	 * Constructor with Args
	 * 
	 * @param ref
	 * @param artist
	 * @param songName
	 * @param rating
	 * @param songLength
	 */
	public mp3(int ref, String artist, String songName, int rating, int songLength) {
		this.setRef(ref);
		this.artist = artist;
		this.songName = songName;
		// Adjusted rating to reflect business logic
		this.setRating(rating);
		this.setSongLength(songLength);
	}

	/**
	 * Getter for Ref
	 * 
	 * @return
	 */
	public int getRef() {
		return ref;
	}

	/**
	 * Setter for Ref If less than zero then throw exception
	 * 
	 * @param ref
	 */
	public void setRef(int ref) throws IllegalArgumentException {

		// needed <= changed to >0 to implement if loop correctly
		if (ref >= 0) {
			this.ref = ref;
		} else {
			throw new IllegalArgumentException("Ref less than 0");
		}
	}

	/**
	 * Getter for Artist
	 * 
	 * @return
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * Setter for Artist
	 * 
	 * @param artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * Getter for SongName
	 * 
	 * @return
	 */
	public String getSongName() {
		return songName;
	}

	/**
	 * Setter for SongName
	 * 
	 * @param songName
	 */
	public void setSongName(String songName) {
		this.songName = songName;
	}

	/**
	 * Getter for Rating
	 * 
	 * @return
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * Setter for rating with pre-defined business rules throws Illegal Arg
	 * Exception
	 * 
	 * @param rating
	 */
	public void setRating(int rating) {
		if ((rating >= 1) && (rating <= 5)) {
			this.rating = rating;
		} // added in handling of outside logic
		else {
			throw new IllegalArgumentException("Invalid rating input");
		}

	}

	/**
	 * @return the songLength
	 */
	public int getSongLength() {
		return songLength;
	}

	/**
	 * @param songLength the songLength to set Business rule added for song length
	 *                   throws Illegal Arg Exception
	 */
	public void setSongLength(int songLength) {
		if (songLength >= 1 && songLength <= 2500) {
			this.songLength = songLength;
		} else {
			throw new IllegalArgumentException("Invalid song length entered");
		}
	}
}
