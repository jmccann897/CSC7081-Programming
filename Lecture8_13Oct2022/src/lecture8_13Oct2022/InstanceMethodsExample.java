package lecture8_13Oct2022;

public class InstanceMethodsExample {

	public static void main(String[] args) {
		// Although it can be done by calling the class and constructing a object to use instance method
		// It is not suggested yet, use static instead
		InstanceMethodsExample examp = new InstanceMethodsExample();
		examp.message();
		examp.rectArea(2,4);

	}

	public void message() {
		System.out.println("Printing a message");
	}
	
	public void rectArea(int width, int length) {
		int area = width * length;
		System.out.println("Area is: "+area);
	}
}
