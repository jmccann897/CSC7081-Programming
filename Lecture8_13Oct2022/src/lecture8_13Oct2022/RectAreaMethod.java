package lecture8_13Oct2022;

public class RectAreaMethod {

	public static void main(String[] args) {
		//calling same method with different values

		System.out.println("Rectangle 1");
		rectArea(5,7);
		
		System.out.println("Rectangle 2");
		rectArea(12,3);
		
		System.out.println("Rectangle 3");
		rectArea(4,19);
		
	}

	public static void rectArea (int length, int width) {
		int area = width*length;
		System.out.println("Area is "+area);
	}
}
