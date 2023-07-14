package lecture11_25Oct2022;

import java.util.Arrays;
public class MatthewsVowelCounter {

	//public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name = "Matthew"; //getName();
		
		displayIntArray(countVowels(name));
		displayIntArray(countVowels_Alt(name));
		
		
	}
	public static void displayIntArray(int [] anArray) {
		// NOT entirely right yet
		System.out.println("Total A: "+anArray[0]);
		System.out.println("Total I: "+anArray[1]);
		System.out.println("Total E: "+anArray[2]);
		System.out.println("Total O: "+anArray[3]);
		System.out.println("Total U: "+anArray[4]);
		
	}
	/**
     * Process a given input String
     * Count the vowels (case insensitive) and return them in a 5 element array
     * where index 0 is A/a, 1 is E/e, 2 is I/i, 3 is O/o and 4 is U/u
     * @param inputString
     * @return vowel count array of the specified form
     */
    private static int[] countVowels(String inputString) {
        int[] vowelCount = new int[5];
        // note these few lines could be replaced with:
        // char[] letters = name.toCharArray();
        char[] letters = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            letters[i] = inputString.charAt(i);
        }
        for (char currentChar : letters) {
            switch (currentChar) {
            case 'a':
            case 'A':
                vowelCount[0]++;
                break;
            case 'e':
            case 'E':
                vowelCount[1]++;
                break;
            case 'i':
            case 'I':
                vowelCount[2]++;
                break;
            case 'o':
            case 'O':
                vowelCount[3]++;
                break;
            case 'u':
            case 'U':
                vowelCount[4]++;
                break;
            default:// not a vowel
            }
        } // end of loop
        return vowelCount;
    }
    
    /**
     * Alternate version of countVowels method
     * Produces 5 element int array of the same format
     * @param inputString
     * @return int[] of size 5 corresponding to counts of a,e,i,o,u (case insensitive)
     */
    private static int[] countVowels_Alt(String inputString) {
        //change local variable to lowercase to simplify processing
        inputString = inputString.toLowerCase();
        //vowels to check for (corresponding to indexes of counts in int array
        String vowels = "aeiou";
        int[] vCount = new int[5];
        //count vowel occurrences and update vCount array for each letter
        //error within this loop
        for(int i=0;i<inputString.length();i++) {
            int vIndex = vowels.indexOf(inputString.charAt(i));
            if(vIndex>0) {
                vCount[vIndex]++;
            }
        }
        return vCount;
    }
    
}
