package solarSystem;

public class Planet {

	private String name;
	private PlanetType type;
	

	
	
	/**
	 * 
	 * @param name
	 * @param type
	 */
	public Planet(String name, PlanetType type) {
		this.name = name;
		this.type = type;;
	}

	/**
	 * getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public PlanetType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(PlanetType type) {
		this.type = type;
	}
	
	public void displayPlanetInfo() {
		System.out.println(this.name+": "+this.type);
	}
}
