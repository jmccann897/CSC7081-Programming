package challengeWoof;

public class Dog {

	//instance vars
	private String breed;
	private double weightInKg;
	private double heightInCm;
	private double lifeExpectancyInYears;
	private String colour;
	private String countryOfOrigin;
	/**
	 * @param breed
	 * @param weightInKg
	 * @param heightInCm
	 * @param lifeExpectancyInYears
	 * @param colour
	 * @param countryOfOrigin
	 */
	public Dog(String breed, double weightInKg, double heightInCm, double lifeExpectancyInYears, String colour,
			String countryOfOrigin) {
		this.breed = breed;
		this.weightInKg = weightInKg;
		this.heightInCm = heightInCm;
		this.lifeExpectancyInYears = lifeExpectancyInYears;
		this.colour = colour;
		this.countryOfOrigin = countryOfOrigin;
	}
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the weightInKg
	 */
	public double getWeightInKg() {
		return weightInKg;
	}
	/**
	 * @param weightInKg the weightInKg to set
	 */
	public void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}
	/**
	 * @return the heightInCm
	 */
	public double getHeightInCm() {
		return heightInCm;
	}
	/**
	 * @param heightInCm the heightInCm to set
	 */
	public void setHeightInCm(double heightInCm) {
		this.heightInCm = heightInCm;
	}
	/**
	 * @return the lifeExpectancyInYears
	 */
	public double getLifeExpectancyInYears() {
		return lifeExpectancyInYears;
	}
	/**
	 * @param lifeExpectancyInYears the lifeExpectancyInYears to set
	 */
	public void setLifeExpectancyInYears(double lifeExpectancyInYears) {
		this.lifeExpectancyInYears = lifeExpectancyInYears;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", weightInKg=" + weightInKg + ", heightInCm=" + heightInCm
				+ ", lifeExpectancyInYears=" + lifeExpectancyInYears + ", colour=" + colour + ", countryOfOrigin="
				+ countryOfOrigin + "]";
	}
	
	
	
}
