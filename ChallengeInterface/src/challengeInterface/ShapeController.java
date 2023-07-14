package challengeInterface;

import java.util.Random;

public class ShapeController {

	private static final int NUMBER_OF_SHAPES = 10;

	public static void main(String[] args) {
		// create random ten shape objects

		// holder for shape objects using interface class to allow for polymorphic
		// method calling
		IMyShape myShape[] = new IMyShape[NUMBER_OF_SHAPES];

		// random num gen
		Random gen = new Random();

		int temp = 0;

		// loop
		for (int i = 0; i < NUMBER_OF_SHAPES; i++) {
			temp = gen.nextInt(3) + 1;
			switch (temp) {
			case 1:
				myShape[i] = new Circle(gen.nextDouble() * gen.nextInt(10));
				break;
			case 2:
				myShape[i] = new Square(gen.nextDouble() * gen.nextInt(10));
				break;
			case 3:
				myShape[i] = new Rectangle(gen.nextDouble()+0.01 * gen.nextInt(10), gen.nextDouble()+0.01 * gen.nextInt(10));
				break;
			default:
				System.out.println("There was an issue with the switch");
			}
		}
		
		for (IMyShape shape: myShape) {
			displayShape(shape);
		}
		

	}

	private static void displayShape(IMyShape shape) {
		System.out.printf("Shape Name: %s%n", shape.getShapeName());
		System.out.printf("Perimeter:  %.3f%n", shape.calculatePerimeter());
		System.out.printf("Area:       %.3f%n", shape.calculateArea());
		
	}

}
