package practical6Arrays;

public class Practical6Pt1Q8TestMarker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] assign1Marks = { 24, 42, 29, 66, 77 };
		int[] assign2Marks = { 79, 68, 31, 22, 42 };
		int total1 = 0;
		double avg1 = 0;
		int total2 = 0;
		double avg2 = 0;
		double sumAvg = 0;

		// loop for 1st assign mark average
		for (int i = 0; i < assign1Marks.length; i++) {
			total1 += assign1Marks[i];
		}
		avg1 = (double) total1 / assign1Marks.length;
		System.out.println("The average mark for Assignment 1 is " + avg1);

		// loop for 2nd assign mark average
		for (int i = 0; i < assign2Marks.length; i++) {
			total2 += assign2Marks[i];
		}
		avg2 = (double) total2 / assign2Marks.length;
		System.out.println("The average mark for Assignment 2 is " + avg2);

		// calculate overall average
		sumAvg = (avg1 + avg2) / 2;
		System.out.println("The overall average for both assignments is " + sumAvg);

		// best avg assignment
		if (avg1 > avg2) {
			System.out.println("Assignment 1 has a better average");
		} else if (avg2 > avg1){
			System.out.println("Assignment 2 has a better average");
		} else {
			System.out.println("Both assignment averages are the same");
		}
	}

}
