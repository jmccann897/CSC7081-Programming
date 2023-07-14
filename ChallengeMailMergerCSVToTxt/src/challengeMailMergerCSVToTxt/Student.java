package challengeMailMergerCSVToTxt;

import java.time.Duration;
import java.time.LocalTime;

public class Student {
	
	//instance vars
	private String name;
	private int studentNumber;
	private LocalTime clockIn;
	private LocalTime clockOut;
	private String emailAddress;
	
public Student (String name, int studentNumber, LocalTime clockIn, LocalTime clockOut, String emailAddress) {
	this.name = name;
	this.studentNumber = studentNumber;
	this.clockIn = clockIn;
	this.clockOut = clockOut;
	this.emailAddress = emailAddress;
}

/**
 * @return the firstName
 */
public String getName() {
	return name;
}

/**
 * @param firstName the firstName to set
 */
public void setName(String name) {
	this.name = name;
}


/**
 * @return the studentNumber
 */
public int getStudentNumber() {
	return studentNumber;
}

/**
 * @param studentNumber the studentNumber to set
 */
public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
}

/**
 * @return the clockIn
 */
public LocalTime getClockIn() {
	return clockIn;
}

/**
 * @param clockIn the clockIn to set
 */
public void setClockIn(LocalTime clockIn) {
	this.clockIn = clockIn;
}

/**
 * @return the clockOut
 */
public LocalTime getClockOut() {
	return clockOut;
}

/**
 * @param clockOut the clockOut to set
 */
public void setClockOut(LocalTime clockOut) {
	this.clockOut = clockOut;
}

public Long checkDiff() {
	Duration duration;
	duration = Duration.between(this.getClockIn(), this.getClockOut());
	Long diffInMins = duration.toMinutes();
	return diffInMins;
}

/**
 * @return the emailAddress
 */
public String getEmailAddress() {
	return emailAddress;
}

/**
 * @param emailAddress the emailAddress to set
 */
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}



}