package practical6Arrays;

public class Practical6Pt1Q3Heights {

	public static void main(String[] args) {
		// Create double array to store heights
		double[] studentHeights = { 1.4, 1.9, 1.31, 1.2 };

		heightAvgMinMax(studentHeights);

	}

	public static void heightAvgMinMax(double[] heights) {
		// Calc Avg
		double total = 0;
		
		for (int i=0; i < heights.length; i++) {
			total += heights[i];
		}
		System.out.println(total/heights.length);
		System.out.println("The maximum height is " + getMax(heights));
		System.out.println("The minimum height is " + getMin(heights));
	}

	public static double getMax(double[] heights) {
		//
		double maxValue = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] > maxValue) {
				maxValue = heights[i];
			}
		}
		return maxValue;
	}

	public static double getMin(double[] heights) {
		// 
		double minValue = heights[0];
		for (int i=1; i<heights.length; i++) {
			if(heights[i] < minValue) {
				minValue = heights[i];
			}
		}
		return minValue;
	}
}
