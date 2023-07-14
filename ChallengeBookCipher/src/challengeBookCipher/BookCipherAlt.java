package challengeBookCipher;

import java.util.Arrays;

public class BookCipherAlt {

	public static void main(String[] args) {
		// 2d array of strings
		
		String msg[][] = { { "Buzz", "LightYear" ,"was"},
				{"once", "apon", "a"}, { "time","probably" ,"the "},
				{ "coolest", "character", "in", "Toy", "Story 2"},
				{ "but ", "Woody "},{ "was ", "always ", "Andy's " , "wow"},
				{ "toy.", "i"},{ "was", "never", "keen" },
				{ "because ", "I ", "don't "}, { "rate","Tom","Hanks.", "Woody ", "is","quite","dour"},
				{ "but"," Lightyear,", "could fly, sort of...", "Anyhow"},{ "the","movies","are", "classic"}
				};
		
		//method to extract last word in each row into a new array
		// array.length should ensure length is same as # of rows
		String[] lastWordList = getLastWords(msg);
		System.out.println(Arrays.toString(lastWordList));
		
		
		
		//extract last character in each row
		String lastChar = getLastChar(lastWordList);
		System.out.println(lastChar.toUpperCase());

	}
/**
 * Returns the string of the last chars from an array of strings
 * @param lastWordList
 * @return
 */
	public static String getLastChar(String[] lastWordList) {
		// TODO Auto-generated method stub
		String lastSym = "";
		for (int i=0; i<lastWordList.length; i++) {
			lastSym += lastWordList[i].charAt(lastWordList[i].length()-1);
		}
		return lastSym;
	}
/**
 * returns string array containing the last strings from a 2D string array
 * @param msg
 * @return
 */
	public static String[] getLastWords(String[][] msg) {
		// TODO Auto-generated method stub
		String lastWords[] = new String[msg.length];
		//System.out.println(msg.length);
		for (int i=0; i<msg.length; i++) {
			//for each row of the msg 2D array it assigns the last string in the row
			//to new lastWords 1D array
				lastWords[i] = msg[i][msg[i].length-1];
			}
		return lastWords;
	}

}
