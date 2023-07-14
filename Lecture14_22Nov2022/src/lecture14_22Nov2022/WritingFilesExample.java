package lecture14_22Nov2022;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFilesExample {

	public static void main(String[] args) {
		// running will create a txt file within the project folder
		// to write ints, need to convert to String??
		// note when reading back in, can use wrapper Integer.parseInt() method
		// to set it to integers when reading in
		try {
			File file = new File("output.txt");
			FileWriter fw = new FileWriter(file, true); // add boolean true for append, false for overwrite
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Words");
			bw.newLine();
			bw.write("About");
			bw.newLine();
			bw.write("Things");
			bw.newLine();

			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("End of program");

	}

}
