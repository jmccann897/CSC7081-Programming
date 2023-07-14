package challengeSuperHeroTopTrump;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TopTrumpCard {

	// instance vars
	private String name;
	private String realName;
	private String imageName;
	private Category category;
	private int speed;
	private int strength;
	private int agility;
	private int intelligence;
	private String bio;

	/**
	 * @param name
	 * @param realName
	 * @param imageName
	 * @param category
	 * @param speed
	 * @param strength
	 * @param agility
	 * @param intelligence
	 * @param bio
	 */
	public TopTrumpCard(String name, String realName, String imageName, Category category, int speed, int strength,
			int agility, int intelligence, String bio) {
		this.setName(name);
		this.setRealName(realName);
		this.setImageName(imageName);
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
	 * 
	 * @param name
	 * @throws IllegalArgumentException
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name.length() > 0 && name.length() < 31) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Invalid name set");
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
	public void setRealName(String realName) {
		if (realName.length() > 0 && realName.length() < 31) {
			this.realName = realName;
		} else {
			throw new IllegalArgumentException("Invalid realName set");
		}
	}

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		if (imageName.length() > 4 && imageName.length() < 31) {
			checkFormat(imageName);
			this.imageName = imageName;
		} else {
			throw new IllegalArgumentException("Invalid imageName set");
		}
	}

	private void checkFormat(String s) throws IllegalArgumentException {
		if (s.contains(" ")) {
			throw new IllegalArgumentException("Img name can't contain a space char");
		}
		if(!s.endsWith(".jpg")) {
			throw new IllegalArgumentException("Img name must be a .jpg");
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
	public void setSpeed(int speed) {
		if(speed>=0 && speed <=100) {
			this.speed = speed;
		} else {
			throw new IllegalArgumentException("Illegal speed integer");
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
		if(strength>=0 && strength <=100) {
			this.strength = strength;
		} else {
			throw new IllegalArgumentException("Illegal strength integer");
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
		if(agility>=0 && agility <=100) {
			this.agility = agility;
		} else {
			throw new IllegalArgumentException("Illegal agility integer");
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
		if(intelligence>=0 && intelligence <=100) {
			this.intelligence = intelligence;
		} else {
			throw new IllegalArgumentException("Illegal intelligence integer");
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
		this.bio = bio;
	}

	public int getMaxStatID() {
		// should return 0,1,2,3 depending on max value
		List<Integer> toCheck = Arrays.asList(speed, strength, agility, intelligence);
		int maxValue = Collections.max(toCheck);
		return toCheck.indexOf(maxValue);
	}

	public int getStatScore(int statChoice) {
		// based on statChoice 0,1,2,3 return value for speed, stre, agil, intell
		// respectively
		switch (statChoice) {
		case 0:
			return speed;
		case 1:
			return strength;
		case 2:
			return agility;
		case 3:
			return intelligence;
		default:
			System.out.println("Dont know how you are in default of switch in getStatScore");
			return -1;
		}

	}

}
