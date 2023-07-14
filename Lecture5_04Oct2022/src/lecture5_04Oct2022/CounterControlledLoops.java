package lecture5_04Oct2022;

public class CounterControlledLoops {

	public static void main(String[] args) {
		// Counter based loops
		//Requires;
		//Control variable
		//Initial value
		//Increment
		//Loop condition
		//While loops may or may not execute dependent on initial state of variable
		
		int count;
		count = 1;
		
		while (count<10) {
			System.out.println("Count is "+ count);
			count++;
		}
		System.out.println("End of program");
		
		
		// Careful of this condition as it may iterate around 0 and create infinite loop
		int countDown = 10;
		while (countDown != 0) {
			System.out.println(countDown);
			countDown--;
		}
		
		System.out.println("Blast Off!");
		
		//CountEven
		int var =1;
		while (var<=20) {
			if (var %2==0) {
				System.out.println("Even number: "+ var);
			}
			var++;
		}//end of loop
		System.out.println("End");
		
		
	}// end of main

}//end of class
