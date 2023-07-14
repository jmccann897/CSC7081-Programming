package challengeSuperHeroTopTrumps;

import java.util.Objects;

public class TopTrumpCard {

	// instance vars
	private String name;
	private String realName;
	private String imageFilename;
	private Category category;
	private int speed;
	private int strength;
	private int agility;
	private int intelligence;
	private String bio;

	// constructor w args
	public TopTrumpCard(String name, String realName, String imageFilename, Category category, int speed, int strength,
			int agility, int intelligence, String bio) {

		this.setName(name);
		this.setRealName(realName);
		this.setImageFilename(imageFilename);
		this.setCategory(category);
		this.setSpeed(speed);
		this.setStrength(strength);
		this.setAgility(agility);
		this.setIntelligence(intelligence);
		this.setBio(bio);
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
		if (name.length() > 0 && name.length() < 31) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Name length invalid");
		}

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
		if (realName.length() > 0 && realName.length() < 31) {
			this.realName = realName;
		} else {
			throw new IllegalArgumentException("Real Name length invalid");
		}
	}

	/**
	 * @return the imageFilename
	 */
	public String getImageFilename() {
		return imageFilename;
	}

	/**
	 * @param imageFilename the imageFilename to set
	 */
	public void setImageFilename(String imageFilename) throws IllegalArgumentException {
		if (checkLength(imageFilename)) {
			if (checkFormat(imageFilename)) {
				this.imageFilename = imageFilename;
			} else {
				throw new IllegalArgumentException("Image File Name Format invalid");
			}
		} else {
			throw new IllegalArgumentException("Image File Name Length invalid");
		}

	}

	private boolean checkFormat(String str) {
		// no empty space
		if (str.contains(" ")) {
			return false;
		}
		// check ends with .jpg
		String toCheck = str.substring(str.length() - 4, str.length());
		if (toCheck.matches(".jpg")) {
			return true;
		} else {
			return false;
		}

	}

	private boolean checkLength(String str) {
		if (str.length() > 4 && str.length() < 31) {
			return true;
		} else {
			return false;
		}

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
		if (speed >= 0 && speed < 101) {
			this.speed = speed;
		} else {
			throw new IllegalArgumentException("Speed outside valid bounds 0-100 inclusive");
		}

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
	public void setStrength(int strength) {
		if (strength >= 0 && strength < 101) {
			this.strength = strength;
		} else {
			throw new IllegalArgumentException("Strength outside valid bounds 0-100 inclusive");
		}
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
	public void setAgility(int agility) {
		if (agility >= 0 && agility < 101) {
			this.agility = agility;
		} else {
			throw new IllegalArgumentException("Agility outside valid bounds 0-100 inclusive");
		}
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
	public void setIntelligence(int intelligence) {
		if (intelligence >= 0 && intelligence < 101) {
			this.intelligence = intelligence;
		} else {
			throw new IllegalArgumentException("Intelligence outside valid bounds 0-100 inclusive");
		}
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
	public void setBio(String bio) {
		if(bio != null) {
			this.bio = bio;
		}else {
			throw new IllegalArgumentException("Bio is null!!!!!");
		}
		
	}
	
	/**
	 * getMaxStatID()
	 * This method should return 0,1,2 or 3 depending
	 * on whether Speed, Strength, Agility or 
	 * Intelligence have the highest value respectively.
	 * In the event of multiple values being equally
	 * high then any such value can be returned. (developer choice)
	 */
	public int getMaxStatID() {
		int[] stats = new int[] {speed, strength, agility, intelligence};
		int topStatIndex = 0; //default to speed 
		int placeholder = 0; //to log previous values
		
		for (int i=0; i<stats.length; i++) {
			int curStat = stats[i];
			
			if(curStat>=placeholder) {
				//in equal case - order is intelligence, agility, strength, speed 
				topStatIndex= i ;
				placeholder = curStat;
			}
		}
		return topStatIndex;
		
	}
	
	/**
	 * getStatScore(statChoice)
	 * Should expect to receive an input of 0, 1 2 or 3
	 * and return the actual value of the
	 * corresponding attribute Speed, Strength, Agility
	 * or Intelligence
	 */
	public int getStatScore(int statChoice) {
		switch(statChoice) {
		case 0: return speed;
		case 1: return strength;
		case 2: return agility;
		case 3: return intelligence;
		default: System.out.println("Reached default of getStatScore??"); return -1;
		
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(agility, bio, category, imageFilename, intelligence, name, realName, speed, strength);
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
				&& Objects.equals(imageFilename, other.imageFilename) && intelligence == other.intelligence
				&& Objects.equals(name, other.name) && Objects.equals(realName, other.realName) && speed == other.speed
				&& strength == other.strength;
	}	
	
	

}
