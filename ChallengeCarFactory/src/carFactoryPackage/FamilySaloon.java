package carFactoryPackage;

public class FamilySaloon extends Car {

	boolean metallicPaint;//additional attribute
	
	public FamilySaloon (String make, String model, int horsepower, boolean metallicPaint) {
		super(make, model, horsepower);
		this.metallicPaint = metallicPaint;
	}
	
	
	public boolean getMetallicPaint() {
		return metallicPaint;
	}
	
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
		
	}
	
	/**
	 * overiding display all method of super to suit sub class requirement
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println(metallicPaint);
	}
}
