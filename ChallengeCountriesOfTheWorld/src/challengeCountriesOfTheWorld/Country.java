package challengeCountriesOfTheWorld;

public class Country {

	//instance vars
	private String countryName;
	private String region;
	private int population;
	private int areaInSqMile;
	private int density;
	
	
	//maps for Each heading and some cleaning up
	
	//constructor
	public Country(String countryName, String region, int population, int areaInSqMile) {
		this.countryName = countryName;
		this.region = region;
		this.population = population;
		this.areaInSqMile = areaInSqMile;
		this.density = calculateDensity();
	}


	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}


	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}


	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}


	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}


	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}


	/**
	 * @return the areaInSqMile
	 */
	public int getAreaInSqMile() {
		return areaInSqMile;
	}


	/**
	 * @param areaInSqMile the areaInSqMile to set
	 */
	public void setAreaInSqMile(int areaInSqMile) {
		this.areaInSqMile = areaInSqMile;
	}


	private int calculateDensity() {
		return this.population/this.areaInSqMile;
	}
	
	
	
}
