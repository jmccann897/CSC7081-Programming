package practical6Arrays;

public class Practical6Pt1Q1PayCalc {

	private static final double HOURLYRATE = 11.50;
	
	public static void main(String[] args) {
		
		//create double array to store hours worked
		//use index to assign day
		
		double[] hours= {8,7,9,7,4,5,10};
		hoursAndWages(hours);
		
	}

	
	public static void hoursAndWages(double[] weeklyHoursWorked) {
	//loop through array and store total hours
			double totalWeeklyHours = 0;
			
			for (double number: weeklyHoursWorked) {
				totalWeeklyHours+=number;
			}
			
			//calculate pay
			double payday = totalWeeklyHours*HOURLYRATE;
			
			//string for days
			String Mon = "Monday";
			String Tue = "Tuesday";
			String Wed = "Wednesday";
			String Thu = "Thurday";
			String Fri = "Friday";
			String Sat = "Saturday";
			String Sun = "Sunday";
			
			//Print statements
			System.out.printf("%s \t\t %s \n", Mon, weeklyHoursWorked[0]);
			System.out.printf("%s \t %s \n", Tue, weeklyHoursWorked[1]);
			System.out.printf("%s \t %s \n", Wed, weeklyHoursWorked[2]);
			System.out.printf("%s \t %s \n", Thu, weeklyHoursWorked[3]);
			System.out.printf("%s \t\t %s \n", Fri, weeklyHoursWorked[4]);
			
			if (weeklyHoursWorked.length >=5) {
				System.out.printf("%s \t %s \n", Sat, weeklyHoursWorked[5]);
			}
			if (weeklyHoursWorked.length >=6) {
				System.out.printf("%s \t\t %s \n", Sun, weeklyHoursWorked[6]);
			}
			
			System.out.println("Total pay for this week = £"+payday);
			System.out.println("Total hours worked this week = "+totalWeeklyHours);
	}
}
