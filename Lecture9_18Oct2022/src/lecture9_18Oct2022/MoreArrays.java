package lecture9_18Oct2022;

public class MoreArrays {

	public static void main(String[] args) {
		// String array
		// default value for reference types like strings is null

		String[] names = new String[3];

		names[0] = "Josh";
		names[1] = "McCann";
		names[2] = "More words";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println(names[1].length());

	}

}
