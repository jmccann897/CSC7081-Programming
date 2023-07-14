package lecture8_13Oct2022;

public class Methods {

	/**
	 * this method is within invokeMe
	 */
	public static void method() {
		System.out.println("In this method");
	}

	/**
	 * this method is a test
	 */
	public static void invokeMe() {
		method();
	}

	public static void main(String[] args) {
		// methods only occur if they are called within the main method
		// main is where the program starts reading
		// stick to either having methods above or below main
		// Use below
		// everything done within a method is local to that method
		// methods expect parameters but receive arguments representing the parameter
		// If its not a static method, its an instance method and can only be used within that class

		// calling a method
		invokeMe();
		testMethodAfterMain();

		
		//you can call undefined methods
		//click on suggested edit to create the instance
		myAdditionalMethod();
	}

	/**
	 * this method was auto suggested by Eclipse
	 */
	private static void myAdditionalMethod() {
		// 
		System.out.println("This was created after writing the call to");
		
	}

	/**
	 * This method is written below main
	 */
	public static void testMethodAfterMain() {
		System.out.println("This was printed accessing a method below main ");
	}

}

