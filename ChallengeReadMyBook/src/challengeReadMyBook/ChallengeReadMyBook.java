package challengeReadMyBook;

//import java.util.Scanner;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class ChallengeReadMyBook {

	public static void main(String[] args) {
		/*
		 * 1. Output the full text to screen 2. Output the number of lines 3. Output the
		 * number of words 4. Output the number of characters 5. Output the number of
		 * times the main character's name (Yossarian) is referenced in the text. 6.
		 * Output the number of times the letter a is used. 7. Redact the word Yossarian
		 * from the complete text and replace with --------- (output the redacted text
		 * to an new file Catch22Redacted.txt)
		 */

		String line;
		int lineCount = 0;
		int wordCount = 0;
		int cCount = 0;
		int yossCount = 0;
		int aCount = 0;

		try {
			// create file object
			File file = new File("Catch 22.txt");
			File redacted = new File("Catch22Redacted.txt");

			// create filereader
			FileReader fr = new FileReader(file);
			// create bufferedfilereader
			BufferedReader br = new BufferedReader(fr);

			// writing to redacted
			FileWriter fw = new FileWriter(redacted);
			BufferedWriter bw = new BufferedWriter(fw);

			// create line var to store text
			line = br.readLine();

			while (line != null) {
				// System.out.println(line); // print line
				lineCount += 1;
				cCount += line.length();

				if (line.length() > 0) { // check if line contains words
					String words[] = line.split(" "); // creates array for each line to fill with words split by
														// whitespace
					wordCount = wordCount + words.length;
				}

				// finding Yoss'

				if (line.toLowerCase().contains("yossarian")) { // issue with name in all caps and multiple counts of
																// yossarian
					String[] words = line.toLowerCase().split(" ");// use lower case for caps
					for (String word : words) { // loop through string array of line
						if (word.contains("yossarian")) {// use contain instead or .equals as it may have full stop
							yossCount++;
						}
					}
 
					// redaction
					String redactedLine = line.replace("yossarian", "---------");
					redactedLine = redactedLine.replace("YOSSARIAN", "---------");
					bw.write(redactedLine + "\n");

				} else {
					bw.write(line + "\n");
				}

				// how many vowels
				for (int i = 0; i < line.length(); i++) {
					switch (line.charAt(i)) {
					case 'a':
					case 'A':
						aCount++;
						break;
					default: // nothing
					}
				}

				line = br.readLine(); // move to next line **Always last thing to do in loop
			}

			System.out.println("There are " + lineCount + " number of lines");
			System.out.println("There are " + wordCount + " number of words");
			System.out.println("There are " + cCount + " number of characters");
			System.out.println("There are " + yossCount + " mention of Yossarian");
			System.out.println("There are " + aCount + " number of the letter 'a'");

			// close resources
			br.close();
			fr.close();
			bw.close();
			fw.close();

			// catch errors
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
