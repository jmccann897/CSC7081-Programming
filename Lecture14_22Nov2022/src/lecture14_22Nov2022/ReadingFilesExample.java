package lecture14_22Nov2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFilesExample {

	public static void main(String[] args) {
		// Read - Write files in Java
		// persistent data - exists beyond program execution

		// Streams - system.in / out / err
		// can be redirected

		// the files to read write need to be at the top level of project folder

		try {
			File myfile = new File("classNames.txt"); // creates a file object which links to the .txt file
			FileReader fr = new FileReader(myfile);
			BufferedReader br = new BufferedReader(fr);// more efficient reader which expects a file reader object
			// read the contents
//			String line = br.readLine(); //creates str var and assigns line from file to var using buffer reader
//			line = br.readLine(); 
//			line = br.readLine();
//			line = br.readLine();
//			line = br.readLine();
//			line = br.readLine();
//			line = br.readLine();
//			line = br.readLine();
			// if you hit the end of the file it will return null --> can use this to loop
			// through file
			String line = br.readLine();
			while (line != null) { // note null is not string --> therefore OK to use equality operators
				System.out.println(line);
				line = br.readLine();
			}
			//close resources
			//use finally block for better practice
			//--> requires br/fr to be initialised to null
			//and in its own try - catch
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("File not found exception");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("IO exception");
		}
		
		System.out.println("End of program");
						
	}
}
