package challengeBookReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class ReaderDelayThread implements Runnable{
	private static final String FILENAME = "Dracula.txt";

	@Override
	public void run() {
		
		Queue<String> Dracula = readInFile();
		while (!Dracula.isEmpty()) {
			System.out.println(Dracula.remove()+" -rdt");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		
	}
	private static Queue<String> readInFile() {
		// Access and store using Queue Dracula txt
		
		Queue<String> textQueue = new LinkedList<String>();
		String line;
		//usual file loop
		
		
		try {
			
			File f = new File(FILENAME);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			line=br.readLine();
			
			while (line !=null) {
				
				textQueue.add(line);
				line = br.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return textQueue;
		
		
		
	}

}
