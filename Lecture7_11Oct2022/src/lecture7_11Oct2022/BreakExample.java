package lecture7_11Oct2022;

public class BreakExample {

	public static void main(String[] args) {
		// if program hits break, it exits the loop immediately
		// can also be implemented in for loops in same manner
		
		int count = 10;
		while (count>0) {
			if (count==3){
				break;
			}
			System.out.print(count+" ");
			count--;
		}
		System.out.println("End");
	}

}
