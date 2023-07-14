package challengeSuperHeroTopTrumpsRevision;

import java.util.Objects;

public class TopTrumpCard {

	// instance vars
	private String name;
	private String realName;
	private String imageFileName;
	private Category category;
	private int speed;
	private int agility;
	private int strength;
	private int intelligence;
	private String bio;

	// constructor
	public TopTrumpCard(String name, String realName, String imageFileName, Category category, int speed, int strength,
			int agility, int intelligence, String bio) {
		this.setName(name);
		this.setRealName(realName);
		this.setImageFileName(imageFileName);
		this.category = category;
		this.setSpeed(speed);
		this.setStrength(strength);
		this.setAgility(agility);
		this.setIntelligence(intelligence);
		this.setBio(bio);
	}

	// methods
	/**
	 * method to take trump card object, read stats and return 0 if speed is
	 * highest, 1 if strength, 2 if agility and 3 if intelligence if equal, order
	 * determines best stat i.e speed>strength>agility>intelligence
	 * 
	 * @param card
	 * @return
	 */
	public int getMaxStatID() {
		int topStat = 0; // basecase is speed is highest
		int speed = this.getSpeed();
		int stre = this.getStrength();
		int agil = this.getAgility();
		int intel = this.getIntelligence();

		if (speed > stre && speed > agil && speed > intel) {
			topStat = 0;
		}
		if (stre > speed && stre > agil && stre > intel) {
			topStat = 1;
		}
		if (agil > stre && agil > speed && agil > intel) {
			topStat = 2;
		}
		if (intel > stre && intel > agil && intel > speed) {
			topStat = 3;
		}
		return topStat;
	}

	/**
	 * method to take integer 0=speed, 1=strength, 2=agility, 3=intelligence and
	 * return the integer score for that corresponding stat
	 * 
	 * @param statChoice
	 * @return
	 */
	public int getStatScore(int statChoice) {
		switch (statChoice) {
		case (0):
			return this.getSpeed();
		case (1):
			return this.getStrength();
		case (2):
			return this.getAgility();
		case (3):
			return this.getIntelligence();
		default:
			return -1;
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(agility, bio, category, imageFileName, intelligence, name, realName, speed, strength);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TopTrumpCard other = (TopTrumpCard) obj;
		return agility == other.agility && Objects.equals(bio, other.bio) && category == other.category
				&& Objects.equals(imageFileName, other.imageFileName) && intelligence == other.intelligence
				&& Objects.equals(name, other.name) && Objects.equals(realName, other.realName) && speed == other.speed
				&& strength == other.strength;
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
	public void setName(String name) throws IllegalArgumentException {
		if (name.length() < 1 || name.length() > 30) {
			throw new IllegalArgumentException("Name length is invalid");
		}
		this.name = name;
	}

	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) throws IllegalArgumentException {
		if (realName.length() < 1 || realName.length() > 30) {
			throw new IllegalArgumentException("Real name length is invalid");
		}
		this.realName = realName;
	}

	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName;
	}

	/**
	 * @param imageFileName the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) throws IllegalArgumentException {
		if (imageFileName.length() < 5 || imageFileName.length() > 30) {
			throw new IllegalArgumentException("Image file name length is invalid");
		}
		if (imageFileName.contains(" ")) {
			throw new IllegalArgumentException("Image file name can't contain a space character ");
		}
		if (!imageFileName.contains(".jpg")) {
			throw new IllegalArgumentException("Image file must be a .jpg file type");
		}
		this.imageFileName = imageFileName;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) throws IllegalArgumentException {
		if (speed < 0 || speed > 100) {
			throw new IllegalArgumentException("Must be between 0-100");
		}
		this.speed = speed;
	}

	/**
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}

	/**
	 * @param agility the agility to set
	 */
	public void setAgility(int agility) throws IllegalArgumentException {
		if (agility < 0 || agility > 100) {
			throw new IllegalArgumentException("Must be between 0-100");
		}
		this.agility = agility;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) throws IllegalArgumentException {
		if (strength < 0 || strength > 100) {
			throw new IllegalArgumentException("Must be between 0-100");
		}
		this.strength = strength;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) throws IllegalArgumentException {
		if (intelligence < 0 || intelligence > 100) {
			throw new IllegalArgumentException("Must be between 0-100");
		}
		this.intelligence = intelligence;
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) throws IllegalArgumentException {
		if (bio == null) {
			throw new IllegalArgumentException("Bio can't be null");
		}
		this.bio = bio;
	}

	public double calcAverageStat() {
		double avg = 0;
		avg = (this.getAgility()+this.getSpeed()+this.getStrength()+this.getIntelligence())/4;
		return avg;
	}

	// methods

	// getters/setters

}
