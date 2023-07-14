package carFactoryPackage;

public class F1 extends Car {

	double area;
	
	//constructor for f1 subclass
	public F1(String make, String model, int horsepower, double area) {
		super(make, model, horsepower);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	
	
	
}
