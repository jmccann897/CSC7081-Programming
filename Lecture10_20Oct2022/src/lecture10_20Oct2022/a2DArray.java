package lecture10_20Oct2022;

public class a2DArray {

	public static void main(String[] args) {
		// 

		int [][] grid = new int[3][4];
		
		// int [] grid has length 3 with each element an array of length 4
		// System.out.println(grid.length);
		
		displayArray(grid);
		
	}
/**
 * 
 * @param grid
 */
	public static void displayArray(int[][] grid) {
		//for loop to display 2d array 
		for (int i =0; i<grid.length; i++) {
			// can use j<grid[0].length if a regular array
			// use of j<grid[i].length which uses the length of current row which handles irregular array
			for (int j=0; j<grid[i].length; j++) {
				System.out.print("["+i+","+j+"]"+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
