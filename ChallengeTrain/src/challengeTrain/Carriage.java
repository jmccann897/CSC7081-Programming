package challengeTrain;

import java.util.ArrayList;

public class Carriage {

	// instance vars
	private  int maxPassengers;
	private PassengerClass passengerClass;
	private  ArrayList<Passenger> passengerList;

	public Carriage(int maxPassengers, PassengerClass passengerClass) {
		this.maxPassengers = maxPassengers;
		this.passengerClass = passengerClass;
		passengerList = new ArrayList<Passenger>();
	}

	/**
	 * @return the maxPassengers
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/**
	 * @param maxPassengers the maxPassengers to set
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	/**
	 * @return the passengerClass
	 */
	public PassengerClass getPassengerClass() {
		return passengerClass;
	}

	/**
	 * @param passengerClass the passengerClass to set
	 */
	public void setPassengerClass(PassengerClass passengerClass) {
		this.passengerClass = passengerClass;
	}

	public boolean isCarriageFull() {
		return currentPassengers() == this.maxPassengers; 
	}
	
	public int currentPassengers() {
		return this.passengerList.size();
	}
	
	public void addPassenger(Passenger p) {
		this.passengerList.add(p);
	}
	
	public void displayAll() {
		System.out.println("Carriage details_____________");
		System.out.println("Max Passengers    :"+   this.getMaxPassengers());
		System.out.println("Current Passengers:"+ this.currentPassengers());
		System.out.println("Carraige class    :"+    this.passengerClass);
		System.out.println();
		
		for (Passenger p: this.passengerList) {
			System.out.println(p.toString());
		}
		
		
	}

}
