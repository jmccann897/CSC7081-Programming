/**
 * 
 */
package oopIntroQuotes;

/**
 * @author joshm
 *
 */
public class CalcTester extends Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create calc object
		Calculator c1 = new Calculator();
		
		//use calc
		int check1 = c1.addNumbers(2, 4);
		int check2 = c1.subtract(2, 17);
		int check3 = c1.divide(200, 20);
		int check4 = c1.multiply(3, 13);
		int check5 = c1.sqrt(273);
		
		//check memory methods - not sure how to implement storing returned value to memory
		System.out.println(c1.getMemory());
		c1.setMemory(10);
		System.out.println(c1.getMemory());
		c1.clearMemory();
		System.out.println(c1.getMemory());
		
		//check results are expected
		System.out.println(check1);
		System.out.println(c1.getMemory());
		System.out.println(check2);
		System.out.println(check3);
		System.out.println(check4);
		System.out.println(check5);
		

	}

}
