package challengeInterface;

public class Square implements IMyShape {
	
	//instance vars
	private double sideLength;
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double calculatePerimeter() {
		return this.sideLength*4;
	}

	@Override
	public double calculateArea() {
		return this.sideLength*this.sideLength;
	}

	@Override
	public String getShapeName() {
		return "Square";
	}

}
