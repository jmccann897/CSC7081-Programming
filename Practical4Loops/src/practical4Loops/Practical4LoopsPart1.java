package practical4Loops;

public class Practical4LoopsPart1 {

	public static void main(String[] args) {
		// Part1
		int sum;
		int num;
		sum=0;
		num=1;
		
		//sum=sum+num;
		//System.out.println("The sum is: "+sum);
		

		while (num<11) {
			sum+=num;
			num++;
			System.out.println("The sum is: "+sum+ " and the value of num is: "+num);
		}
	}

}
