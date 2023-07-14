package challengeBookReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReadBook {
	
	private static final String FILENAME = "Dracula.txt";
	
	public static void main(String[] args) {
		
//		Queue<String> Dracula = readInFile();
//		System.out.println(Dracula.size());
		
		//create class with run method
		ReaderDelayThread rdt = new ReaderDelayThread();
		
		
		//pass run class into thread class
		Thread newThread = new Thread(rdt);
		//start the thread via thread class
		Scanner sc = new Scanner(System.in);
		System.out.println("To start the reader, enter 1");
		System.out.println("To stop the reader, enter 2");
		int userinput = sc.nextInt();
		while (userinput!= 2) {
			newThread.start();
		}
		
		
		
		
		
		
		
	}

	private static void BookToScreen(Queue<String> book) {
		
		while (!book.isEmpty()) {
			System.out.println(book.poll());
		}
		
//		for (String s: book) {
//			System.out.println(s);
//			book.poll();
//		}
		
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
