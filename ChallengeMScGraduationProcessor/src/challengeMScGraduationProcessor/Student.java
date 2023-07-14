package challengeMScGraduationProcessor;

public class Student {

	private int studentNo;
	private String firstName;
	private String lastName;
	private int program;
	private int compFound;
	private int dbs;
	private int web;
	private int softwareE;
	private double average;
	private String classification;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentNo
	 * @param firstName
	 * @param lastName
	 * @param program
	 * @param compFound
	 * @param dBs
	 * @param web
	 * @param softwareE
	 * @param avergae
	 * @param classification
	 */
	public Student(int studentNo, String firstName, String lastName, int program, int compFound, int dbs, int web,
			int softwareE, double avergae, String classification) {

		this.studentNo = studentNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.program = program;
		this.compFound = compFound;
		this.dbs = dbs;
		this.web = web;
		this.softwareE = softwareE;
		this.setAverage(program, compFound, dbs, web, softwareE);
		;
		this.classification = classification;
	}

	/**
	 * @return the studentNo
	 */
	public int getStudentNo() {
		return studentNo;
	}

	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the program
	 */
	public int getProgram() {
		return program;
	}

	/**
	 * @param program the program to set
	 */
	public void setProgram(int program) {
		this.program = program;
	}

	/**
	 * @return the compFound
	 */
	public int getCompFound() {
		return compFound;
	}

	/**
	 * @param compFound the compFound to set
	 */
	public void setCompFound(int compFound) {
		this.compFound = compFound;
	}

	/**
	 * @return the dBs
	 */
	public int getDbs() {
		return dbs;
	}

	/**
	 * @param dBs the dBs to set
	 */
	public void setDbs(int dbs) {
		this.dbs = dbs;
	}

	/**
	 * @return the web
	 */
	public int getWeb() {
		return web;
	}

	/**
	 * @param web the web to set
	 */
	public void setWeb(int web) {
		this.web = web;
	}

	/**
	 * @return the softwareE
	 */
	public int getSoftwareE() {
		return softwareE;
	}

	/**
	 * @param softwareE the softwareE to set
	 */
	public void setSoftwareE(int softwareE) {
		this.softwareE = softwareE;
	}

	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(int program, int compFound, int DBs, int Web, int softwareE) {
		this.average = (program*2 + compFound + DBs + Web + softwareE) / 5;
	}

	/**
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @param classification the classification to set
	 */
	public void setClassification(String classification) {
		if(this.average>=70) {
		this.classification = "distinction";
	}else if (this.average >=60 && this.average <70) {
		this.classification = "commendation";
	}else if (this.average >= 50 && this.average <60) {
		this.classification = "pass";
	}else if (this.average <=49) {
		this.classification = "fail";
	}else if(this.average<0 || this.average>100) {
		this.classification = "Error, average outside of 0-100 range";
	}
		}

	public void displayStudent() {
		System.out.printf("Student no.: %s %n", studentNo);
		System.out.printf("First name: %s %n", firstName);
		System.out.printf("Last name: %s %n", lastName);
		System.out.printf("Module results %n");
		System.out.printf("Program: %s %n", program);
		System.out.printf("Comp Found: %s %n", compFound);
		System.out.printf("DBs: %s %n", dbs);
		System.out.printf("Web: %s %n", web);
		System.out.printf("Software E: %s %n", softwareE);
		System.out.printf("Average: %s %n", average);
		System.out.printf("Classification: %s %n", classification);
		System.out.println();
	}

}
