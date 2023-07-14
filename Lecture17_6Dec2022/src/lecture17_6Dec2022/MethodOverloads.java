package lecture17_6Dec2022;

public class MethodOverloads {

	public static void main(String[] args) {


		//square(6,8.0);
		
		int res1 = addNumbers(1, 2);
		int res2 = addNumbers(1, 2, 3);
		int res3 = addNumbers(new int[]{1,2,3,4,5});

		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

	
	public static int addNumbers (int a, int b) {
		return a+b;
	}
	public static int addNumbers (int a, int b, int c) {
		return a+b+c;
	}
	public static int addNumbers(int[] numbers) {
		int total=0;
		for (int x:numbers) {
			total+=x;
		}
		return total;
	}
	
	public static void square(int a, int b) {
		System.out.println("In int version of method");
		System.out.println("Square is "+ (a*b));
	}
	//Can't have same name and parameter types, number of and order (signature)
//	public static int square(int a, int b) {
//		System.out.println("In int return version of method");
//		return (a*b);
//	}
	
	public static void square(double a,int b) {
		System.out.println("In mixed version of method");
		System.out.println("Mixed Square is "+ (a*b));
	}
	
	public static void square(double a,double b) {
		System.out.println("In double version of method");
		System.out.println("Double Square is "+ (a*b));
	}
}
