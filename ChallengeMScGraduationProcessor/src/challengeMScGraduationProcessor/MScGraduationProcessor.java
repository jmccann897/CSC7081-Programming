package challengeMScGraduationProcessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MScGraduationProcessor {

	public static void main(String[] args) {

		// Storing student objects
		ArrayList<Student> students = new ArrayList<Student>();

		// generating and storing student objects
		File file = new File("ModuleScoresMSc.csv");
		FileReader fr;
		BufferedReader br;
		String line;
		String[] splitLine;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			line = br.readLine(); // load line into object
			line = br.readLine(); // clear first line
			while (line != null) {
				splitLine = line.split(",");
				Student s = new Student();
				s.setStudentNo(Integer.parseInt(splitLine[0]));
				s.setFirstName(splitLine[1]);
				s.setLastName(splitLine[2]);
				s.setProgram(Integer.parseInt(splitLine[3]));
				s.setCompFound(Integer.parseInt(splitLine[4]));
				s.setDbs(Integer.parseInt(splitLine[5]));
				s.setWeb(Integer.parseInt(splitLine[6]));
				s.setSoftwareE(Integer.parseInt(splitLine[7]));
				s.setAverage(s.getProgram(), s.getCompFound(), s.getDbs(), s.getWeb(), s.getSoftwareE());
				s.setClassification(s.getClassification());
				students.add(s);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//printStudents(students);
		generateGradList(students);
	}

	public static void printStudents(ArrayList<Student> studentList) {
		for (Student s : studentList) {
			s.displayStudent();
		}
	}

	public static void generateGradList(ArrayList<Student> studentList) {
		// sort list by classification
		File file = new File("ListForGraduation.txt");
		FileWriter fw;
		BufferedWriter bw;

		try {
			fw = new FileWriter(file, false);
			bw = new BufferedWriter(fw);

			for (Student s : studentList) {
				bw.write(s.getStudentNo() + " " + s.getFirstName() + " " + s.getLastName() + " " + s.getClassification()
						+ "\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("Not able to write to file");
		}
	}
}
