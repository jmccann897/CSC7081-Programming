package challengeInterface;

public class Circle implements IMyShape {
	
	//instance vars
	private double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
		
	}

	@Override
	public double calculatePerimeter() {
		return 2*this.radius*Math.PI;
	}


	@Override
	public double calculateArea() {
		return Math.PI*Math.pow(this.radius, 2);
	}


	@Override
	public String getShapeName() {
		return "Circle";
	}
	
	
	

}
