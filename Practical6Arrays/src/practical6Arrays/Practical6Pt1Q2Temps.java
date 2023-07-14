package practical6Arrays;

public class Practical6Pt1Q2Temps {

	public static void main(String[] args) {
		// Temperature storage

		//store in a array of double
		double[] temperatures = new double[7];
		
		//assign values to positions
		temperatures[0] = 3.4;
		temperatures[1] = 4.2;
		temperatures[2] = 9.0;
		temperatures[3] = 2.2;
		temperatures[4] = 4.5;
		temperatures[5] = 6.4;
		temperatures[6] = 3.1;
		
		//create variable to store total
		double total = 0;
		for (int i =0; i<temperatures.length; i++) {
			total+=temperatures[i];
		}
		
		double avg = total/temperatures.length;
		System.out.printf("The total of all the temperatures is %.6s degC \n", total);
		System.out.printf("The average temperature is %.6s DegC \n", avg);
		System.out.println("The max temperature is " + getMax(temperatures));
		System.out.println("The min temperature is " + getMin(temperatures));
		
	}

	public static double getMax(double[] temperatures) {
		// 
		double maxValue = temperatures[0];
		for (int i=1; i<temperatures.length; i++) {
			if (maxValue < temperatures[i]) {
				maxValue = temperatures[i];
			}
		}
		return maxValue;
	}
	public static double getMin(double[] temperatures) {
		// 
		double minValue = temperatures[0];
		for (int i=1; i<temperatures.length; i++) {
			if (minValue > temperatures[i]) {
				minValue = temperatures[i];
			}
		}
		return minValue;

	
	}	
}
