package lecture17_6Dec2022;

public class WrapperExperiments {
	
	public static void main(String[] args) {
		
		int primativeInt = 35;
		Integer wrappedInt = 40;
		
		int value = Integer.parseInt("567");
		double value2 = Double.parseDouble("2.02");
		
//		System.out.println(value+5);
//		System.out.println(value2+5);
//		System.out.println(wrappedInt+5);
		
		
		Integer first = 5;
		Integer second = 15;
		
		//when comparing two wrapper objects use in built .equals the same as for all reference types
		//even if == equality operators work
		System.out.println(first.equals(second));
		
		System.out.println(first.equals(second));
		
		System.out.println(first.compareTo(second));
				
		Integer[] nums = new Integer[] {first, second};
		
	}

	
	

}
