package carFactoryPackage;

public class RallyCar extends Car {

	double area;
	
	public RallyCar (String make, String model, int horsepower, double area) {
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
