package challengeCSVVideoRequestList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ChallengeCSVVideoRequestList {

	private static String FILENAME = "examSubmissionsSample.csv";
	private static int NO_OF_STUDENTS_REQUIRED = 4;
	
	public static void main(String[] args) {

		List<String[]> studentList = readFile(FILENAME);
		//System.out.println("All students recorded");
		//displayList(studentList);
		List<String[]> studentsInLab = identifyIfInLab(studentList);
//		System.out.println("Lab students");
//		displayList(studentsInLab);
		List<String[]> studentsSubmittedByEmail = identifyIfEmailSubmission(studentList);
//		System.out.println("Students by email");
//		displayList(studentsSubmittedByEmail);
		List<String[]> allStudentsToRequest = identifyStudentsToRequest(studentList);
//		System.out.println("Remaining students");
//		displayList(allStudentsToRequest);
		
		System.out.println("Students to request");
		List<String[]> studentsToRequest = studentsToRequest(allStudentsToRequest);
		displayList(studentsToRequest);
	}

	private static void displayList(List<String[]> list) {
		for(String[] strArray : list) {
			for(String s: strArray) {
				System.out.printf("%s, ",s);
			}
			System.out.println();
			}
		
		
	}
	private static List<String[]> studentsToRequest(List<String[]> list) {
		List<String[]> toReturn = new ArrayList<String[]>();
		Random rand = new Random();
		
		Collections.shuffle(list);
		
		for( int i = 0; i<NO_OF_STUDENTS_REQUIRED; i++) {
			//generate random number for index
			int lowerbound = 0;
			int upperbound = list.size();
			int indexToGet = rand.nextInt(upperbound) ;
			String[] toAdd = list.get(indexToGet);
			toReturn.add(toAdd);
		}
		
		return toReturn;
	}
	private static List<String[]> identifyStudentsToRequest(List<String[]> studentList) {
		List<String[]> toReturn = new ArrayList<String[]>();
		for (String[] strArray : studentList) {
			if(strArray.length ==2) {
				toReturn.add(strArray);
			}
		}
		return toReturn;
	}
	private static List<String[]> identifyIfEmailSubmission(List<String[]> studentList) {
		List<String[]> toReturn = new ArrayList<String[]>();
		for (String[] strArray : studentList) {
			if(strArray.length>2  && strArray[2].equalsIgnoreCase("email")) {
				toReturn.add(strArray);
			}
		}
		return toReturn;
	}
	private static List<String[]> identifyIfInLab(List<String[]> studentList) {
		List<String[]> toReturn = new ArrayList<String[]>();
		 for (String[] strArray : studentList) {
			 if(strArray.length>2 && strArray[2].equalsIgnoreCase("lab")) {
				 toReturn.add(strArray);
			 }
		 }
		return toReturn;
	}
	
	private static List<String[]> readFile(String filename) throws IllegalArgumentException{
		
		List<String[]> toReturn = new ArrayList<String[]>();
		File f = new File(filename);
		String line = "";
		
		try(FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr)){
			
			line = br.readLine(); //header? validation?
			if(line != "ID,Name,Indicator (Lab/Email)") {
				throw new IllegalArgumentException("Issue with file header not correct");
			}
			line = br.readLine();
			
			
			while (line != null) {
				String[] extract = line.split(",");
				toReturn.add(extract);
				line = br.readLine();//move to nextLine
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

}
