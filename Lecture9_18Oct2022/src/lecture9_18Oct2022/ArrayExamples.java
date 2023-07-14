package lecture9_18Oct2022;

public class ArrayExamples {

	public static void main(String[] args) {
		// Arrays are data structures
		// Collection of related data items
		// Collection of same types
		// Make it convenient to process related groups of data
		// Arrays remain the same length once created - computer sets memory requirement for set size - Immutable
		// Arrays is a group of variables
		// Arrays are objects - considered reference type
		// Elements of array can be primitive or reference
		// To refer to a particular element, we specify the array ref name and then the index of the element
		// Element position is called index or subscript
		// Arrays are zero indexed
		// Can assign values into an array
		// Each array knows its own length accessed through c.length for array named c.
		
		//declaring an array
		int[] myArray = new int[5];
		
		myArray[0] = 3;
		myArray[1] = 12;
		myArray[2] = 30;
		myArray[3] = 10;
		myArray[4] = 11;
		
		for (int i=0; i<5; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		
		double[] dubdub = new double[5];
		int intVal = 4;
		dubdub[3] = intVal;
		System.out.println(dubdub[3]);
		
		
	}

}
