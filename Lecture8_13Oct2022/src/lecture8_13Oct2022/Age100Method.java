package lecture8_13Oct2022;

public class Age100Method {

	public static void main(String[] args) {
		year100(36);
	}

	/**
	 * This method calculates year you turn 100 using parameter age
	 * @param age
	 */
	
	public static void year100(int age) {
		// calculate the year you will turn 100
		// accessing calendar within the method temporarily  
		// accesses current calendar based on the date invoked
		int thisYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		int year100 = 100 - age + thisYear;
		System.out.println("I will turn 100 in " + year100);
	}

}
