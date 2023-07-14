package challengeReadMyBook2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookReader {

	private static String BOOKNAME = "Catch 22.txt";
	private static String BOOKNAMESTR = BOOKNAME.substring(0, BOOKNAME.length() - 4);

	public static void main(String[] args) {

		/**
		 * to simplify methods need to readInFile method to return string [] which can
		 * be used by all other methods
		 */
		List<String[]> book = readFile(BOOKNAME);
		// displayBook(book);
		// checkLines(book);
		// wordCounter(book);
		// charCounter(book);
		// keyWordCount("Yossarian", book);
		//keyCharCount('a', book);
		redactKeyword("Yossarian", book);

	}

	private static List<String[]> readFile(String filename) {
		List<String[]> toReturn = new ArrayList<String[]>();

		File f = new File(filename);
		String line = "";

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {

			line = br.readLine();
			while (line != null) {
				String[] extract = line.split(" ");
				toReturn.add(extract);

				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return toReturn;
	}

	private static void redactKeyword(String keyword, List<String[]> book) {
		// TODO Auto-generated method stub
		File fRedacted = new File("Catch22Redacted.txt");
		
		try (FileWriter fw = new FileWriter(fRedacted);
				BufferedWriter bw = new BufferedWriter(fw);) {
			
			for (String[] strArray : book){
				// string array of read in words
				for (String s : strArray) {
					if (s.equalsIgnoreCase(keyword) || s.contains(keyword)) {
						// replace word in string array with redaction
						String str = s.substring(keyword.length(), s.length());
						s = "-".repeat(keyword.length()) + str;
					}
					// write redacted string to file
					bw.write(s);
					bw.write(" ");
				}
				bw.newLine();
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private static void keyCharCount(char keyChar, List<String[]> book) {
		// TODO Auto-generated method stub
		int keyCount = 0;

		for (String[] strArray : book) {
			for (String s : strArray) {
				char[] characters = s.toCharArray();
				for (char c : characters) {
					if (c == keyChar) {
						keyCount += 1;
					}
				}
			}
		}
		System.out.printf("The book %s contains character=%s %d number of times", BOOKNAMESTR, keyChar,
				keyCount);
	}

	private static void keyWordCount(String keyword, List<String[]> book) {
		// TODO Auto-generated method stub
		int keyCount = 0;
		for (String[] strArray : book) {
			for (String s : strArray) {
				if (s.equalsIgnoreCase(keyword) || s.contains(keyword)) {
					keyCount += 1;
				}
			}
		}
		System.out.printf("The book %s contains %s %d number of times", BOOKNAMESTR, keyword, keyCount);

	}

	private static void charCounter(List<String[]> book) {
		// TODO Auto-generated method stub
		int charCount = 0;
		for (String[] strArray : book) {
			for (String s : strArray) {
				charCount += s.length();
			}
		}
		System.out.printf("The book %s has %d number of characters", BOOKNAMESTR, charCount);
	}

	private static void wordCounter(List<String[]> book) {
		// TODO Auto-generated method stub
		int wordCount = 0;
		for (String[] strArray : book) {
			for (String s : strArray) {
				wordCount += 1;
			}
		}
		System.out.printf("The book %s has %d number of words", BOOKNAMESTR, wordCount);
	}

	private static void checkLines(List<String[]> book) {
		// TODO Auto-generated method stub
		int lineCount = 0;
		for (String[] strArray : book) {
			lineCount += 1;
		}
		System.out.printf("The book %s has %d lines", BOOKNAMESTR, lineCount);
	}

	private static void displayBook(List<String[]> book) {
		// TODO Auto-generated method stub

		for (String[] sArray : book) {
			for (String s : sArray) {
				System.out.printf("%s ", s);
			}
			System.out.println();
		}

	}
}
