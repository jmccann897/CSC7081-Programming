package practical6Arrays;

public class Practical6Pt1Q9StringArray {

	public static void main(String[] args) {
		// Create a string array

		String s = "Continuous effort not strength nor intelligence is the key for unlocking our potential";
		int count = 0;

		String[] strgs = s.split(" ");
		for (int i = 0; i < strgs.length; i++) {
			System.out.print(strgs[i] + " ");
		}
		System.out.println();
		System.out.println("The number of words in this quote is " + strgs.length);

		for (int i = 0; i < strgs.length; i++) {
			char[] eachLetterinArray = strgs[i].toCharArray();
			for (int j = 0; j < eachLetterinArray.length; j++) {
				count++;
			}
		}

		System.out.println("The number of letters in the quote is " + count);

		System.out.printf("The longest word within the array is %s \n", strgs[getMaxWord(strgs)]);
		System.out.printf("The shortest word within the array is %s\n", strgs[getMinWord(strgs)]);

	}

	public static int getMaxWord(String[] stringArray) {
		// set longest word to first word in array
		int maxWord = stringArray[0].length();
		// store index in var
		int maxWordloc = 0;
		// run loop through each element in array of strings
		for (int j = 1; j < stringArray.length; j++) {
			if (stringArray[j].length() > maxWord) {
				maxWord = stringArray[j].length();
				maxWordloc = j;
			}
		}
		return maxWordloc;
	}

	public static int getMinWord(String[] stringArray) {
		// set shortest word to first word in array
		int minWord = stringArray[0].length();
		// store index in var
		int minWordloc = 0;
		// run loop through each element in array of strings
		for (int j = 1; j < stringArray.length; j++) {
			if (stringArray[j].length() < minWord) {
				minWord = stringArray[j].length();
				minWordloc = j;
			}
		}
		return minWordloc;
	}

}
