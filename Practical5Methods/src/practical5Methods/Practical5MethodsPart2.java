package practical5Methods;
import java.util.Random;

public class Practical5MethodsPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(rectArea(3,2));
		System.out.println(numToMonth(2));
		System.out.println(avgCalculator(3, 3, 4));
		System.out.println(g8Capital("Canada"));
		System.out.println(coinToss("tails"));
	}
/**
 * This method take a length and base parameters to return the calculated area
 * Solution to Practical 5 Methods Part 2 Q1
 * @param length
 * @param base
 * @return
 */
	public static int rectArea(int length, int base) {
		// 
		int area = length*base;
		return area;
		
	}
	/**
	 * Method returns a string month desc according to int num input
	 * Solution to Practical 5 Methods Part 2 Q2
	 * @param a
	 * @return
	 */
	public static String numToMonth(int a) {
		if (a == 1) {
			return "Jan";
		} else if (a == 2) {
			return "Feb";
		} else if (a == 3) {
			return "Mar";
		} else if (a == 4) {
			return "Apr";
		} else if (a == 5) {
			return "May";
		} else if (a == 6) {
			return "Jun";
		} else if (a == 7) {
			return "Jul";
		} else if (a == 8) {
			return "Aug";
		} else if (a == 9) {
			return "Sep";
		} else if (a == 10) {
			return "Oct";
		} else if (a == 11) {
			return "Nov";
		} else if (a == 12) {
			return "Dec";
		} else {
			return "Invalid Input";
		}
	}
	/**
	 * Method returns avg of 3 int in double
	 * Solution to Practical 5 Methods Part 2 Q3
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static double avgCalculator(int num1, int num2, int num3) {
		return ((double)num1+(double)num2+(double)num3)/3;
	}
	/**
	 * Method returns name of capital city for G8 country
	 * Solution to Practical 5 Methods Part 2 Q4
	 * @param s
	 * @return
	 */
	public static String g8Capital (String s) {
		if (s.equalsIgnoreCase("canada")) {
			return "Ottawa";
		} else if (s.equalsIgnoreCase("france")) {
			return "Paris";
		} else if (s.equalsIgnoreCase("germany")) {
			return "Berlin";
		} else if (s.equalsIgnoreCase("italy")) {
			return "Rome";
		} else if (s.equalsIgnoreCase("japan")) {
			return "Toyko";
		} else if (s.equalsIgnoreCase("russia")) {
			return "Moscow";
		} else if (s.equalsIgnoreCase("uk")) {
			return "London";
		} else if (s.equalsIgnoreCase("usa")) {
			return "Washington D.C";
		}else {
			return "Sorry Invalid input";
		}
		
	}
	
	public static String coinToss(String str) {
		// having a random selection between 0 and 1
		Random rand = new Random();
		int coinToss = rand.nextInt(2);
		// assign 0 to tails / 1 to heads
		// have issues with handling case sense
		if (str.toLowerCase() == "heads" && coinToss == 1) {
			return "You guessed heads correctly!!";
		} else if (str.toLowerCase() == "heads" && coinToss == 0) {
			return "You guessed heads but it was tails :(";
		} else if (str.toLowerCase() == "tails" && coinToss == 0) {
			return "You guessed tails correctly!";
		} else if (str.toLowerCase() == "tails" && coinToss == 1) {
			return "You guessed tails but it was heads :(";
		} else{
			return "Not sure what is happening here";
		}
		
	}

}
