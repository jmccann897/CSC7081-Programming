package carFactoryPackage;

public class Car {

	//list of attributes each object should have
	String make;
	String model;
	int horsepower; 
	String className = this.getClass().getSimpleName();
	
	//constructor method?
	public Car() {
		
	}
	
	/**
	 * Alt constructor method to request input attributes as arguments
	 * @param make
	 * @param model
	 * @param horsepower
	 */
	public Car(String make, String model, int horsepower) {
		super();
		this.make = make;
		this.model = model;
		this.setHorsepower(horsepower);
	}
	
	

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}

	/**
	 * @param horsepower the horsepower to set
	 */
	public void setHorsepower(int horsepower) {
		if (horsepower<=1000 && horsepower >=0) {
			this.horsepower = horsepower;
		}else {
			this.horsepower = -999;
		}
	}

	public void displayAll() {
		System.out.println(className);
		System.out.println("Make:	"+make);
		System.out.println("Model:	"+ model);
		System.out.println("HP:	"+ horsepower);
		System.out.println();
		
	}
}
