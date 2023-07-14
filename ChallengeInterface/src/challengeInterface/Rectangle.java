package challengeInterface;

public class Rectangle implements IMyShape {
	
	//instance vars
	private double width;
	private double height;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculatePerimeter() {
		return (this.height*2)+(this.width*2);
	}

	@Override
	public double calculateArea() {
		return this.height*this.width;
	}

	@Override
	public String getShapeName() {
		return "Rectangle";
	}
	
	
}
