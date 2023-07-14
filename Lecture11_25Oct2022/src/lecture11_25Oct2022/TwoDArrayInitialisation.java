package lecture11_25Oct2022;

import java.util.Arrays;

public class TwoDArrayInitialisation {

	public static void main(String[] args) {
		// declare 2d array

		// method to initialise array in one line
		int[] myArray = new int[] { 4, 6, 7, 89, 12, 12 };
		
		//sorting an array - bubble sort
		//printArray(myArray);
		//System.out.println();
		
		//swap(myArray,2,3);
		
		//printArray(myArray);
		
		//alt method to print 1D arrays using in-built arrays method
		//can store it to a strg var
		System.out.println(Arrays.toString(myArray));

		// 2D Arrays can be done in a similar method
		int[][] my2D = new int[][] { { 34, 12, 10 }, { 1, 2, 3 }, { 5, 8, 20 }, { 9, 8, 7, 77, 100 } };

		//toPrint(my2D);
		
		//alt method to print 2D arrays using in-built arrays method
		System.out.println(Arrays.deepToString(my2D));
		
		//Arrays has in-built function to sort
		// string arrays are also sort-able
		System.out.println("Unsorted "+Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println("Sorted "+Arrays.toString(myArray));
		
		System.out.println(myArray[myArray.length-1]);
		
		
	}

	public static void swap(int[] myArray, int i, int j) {
		// simple index swapper
		int temp = myArray[i];
		myArray[i]=myArray[j];
		myArray[j] = temp;
		
	}

	public static void printArray(int[] myArray) {
		// prints 1d array
		for (int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}
	}

	public static void toPrint(int[][] toPrint) {
		// prints 2D arrays
		for (int i = 0; i < toPrint.length; i++) {
			for (int j = 0; j < toPrint[i].length; j++) {
				System.out.printf("[%d,%d] - %d", i, j, toPrint[i][j]);
			}
			System.out.println();
		}
	}

}
