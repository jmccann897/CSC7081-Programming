package challengeMailMergerCSVToTxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MailMergerDriver {
	

	public static void main(String[] args) {
		
		List<Student> studentList = readFile();
		List<Student> studentsToWriteTo =  checkTimes(studentList);
		prepareTxtFiles(studentsToWriteTo);
		
	}

	private static void prepareTxtFiles(List<Student> studentsToWriteTo) {
		for (Student s: studentsToWriteTo) {
		String line;
		String fileName = s.getName()+".txt";
		
		try {
			File f = new File(fileName);
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Dear "+s.getName()+",");
			bw.newLine();
			bw.write("You didn't last too long at the lecture today! ("+s.checkDiff() +"mins.) You need to stay for the full duration.");
			bw.newLine();
			bw.newLine();
			bw.write("Name: "+s.getName()+" ");
			bw.newLine();
			bw.write("Student Number: "+s.getStudentNumber());
			bw.newLine();
			bw.write("Log On: "+s.getClockIn());
			bw.newLine();
			bw.write("Log Off: "+s.getClockOut());
			bw.newLine();
			bw.write("Email: "+s.getEmailAddress());
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

	private static List<Student> checkTimes(List<Student> studentList) {
		List<Student> toReturn = new ArrayList<Student>();
		
		for (Student s: studentList) {
			Duration duration;
			duration = Duration.between(s.getClockIn(), s.getClockOut());
			Long diffInMins = duration.toMinutes();
			System.out.println(diffInMins);
			if(diffInMins<100) {
				toReturn.add(s);
			}
		}
		return toReturn;
	}

	private static List<Student> readFile() {
		
		String line="";
		List<Student> toReturn = new ArrayList<Student>();	
		
		try {
			
			File f = new File("input.csv");
			FileReader fr;
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine(); //dump header
			line = br.readLine();
			
			while (line !=null) {
				
			String[] extract = line.split(",");
			String name = extract[0];
			int studentNumber = Integer.parseInt(extract[1]);
			LocalTime clockIn = LocalTime.parse(extract[2]);
			LocalTime clockOut = LocalTime.parse(extract[3]);
			String emailAddress = extract[4];
			Student s = new Student(name, studentNumber, clockIn, clockOut, emailAddress);
			toReturn.add(s);
			
			line = br.readLine();//move to next Line
			
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
