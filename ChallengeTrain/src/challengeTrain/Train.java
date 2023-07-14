package challengeTrain;

import java.util.ArrayList;

public class Train {
	//instance vars
	private int maxNumberOfCarriages;
	private ArrayList<Carriage> carriageList;
	
	public Train(int maxNumberOfCarriages)  {
		this.maxNumberOfCarriages = maxNumberOfCarriages;
		carriageList = new ArrayList<Carriage>();
	}

	public void addCarriage(Carriage c) {
		this.carriageList.add(c);
	}
	
	public int getTotalCurrentPassengers() {
		int Total=0;
		for (Carriage c: this.carriageList) {
			Total += c.currentPassengers();
		}
		return Total;
	}
	
	public int getTrainMaxCapacity() {
		int max=0;
		for (Carriage c: this.carriageList) {
			max += c.getMaxPassengers();
		}
		return max;
	}

	public void addPassenger(Passenger p) {
		System.out.println("Attempting to add passenger");
		
		//is there space?
		if (this.getTrainMaxCapacity() > this.getTotalCurrentPassengers()) {
			
			//creating flag to catch passengers overflowing to another carriage
			boolean passengerAdded = false;
			
			//loop through carriage arraylist to check carriage by carriage and add passengers
			for (Carriage c: carriageList) {
				//if there is space to add
				//check class of carriage and passenger
				if (c.getPassengerClass().equals(p.getPassengerClass()) && !c.isCarriageFull()) {
					c.addPassenger(p);
					passengerAdded = true;
					System.out.println(p.toString());
					System.out.println("Added to : " + c.getPassengerClass());
					System.out.println();
					break;
				}
			}
			
			//first class passenger with first class carriages full to be in second
			if (!passengerAdded && p.getPassengerClass().equals(PassengerClass.FIRST)) {
				for (Carriage c: carriageList) {
					if (c.getPassengerClass().equals(PassengerClass.SECOND)) {
						c.addPassenger(p);
						passengerAdded = true;
						System.out.println(p.toString());
						System.out.println("Added to :"+c.getPassengerClass() + " as no capacity in 1st class");
						System.out.println();
						break;
					}
					
				}
				
			}
			
			//if second passenger, check no first passengers left, then add to second carriages
			if (!passengerAdded) {
				System.out.println(p.toString());
				System.out.println("Sorry no capacity for 2nd class - you'll have to upgrade to 1st. Or get the next train.");
				System.out.println();
			}
			
			
		}else {
			System.out.println("Train full");
			System.out.println();
		}
		System.out.println();
		
	}
	
	public void showAllDetails() {
		
		System.out.println("Train details_________________");
		System.out.println("Number of Carriages			 :"+ this.carriageList.size());
		System.out.println("Train max capacity			 :" + this.getTrainMaxCapacity());
		System.out.println("Train current passenger count:"+ this.getTotalCurrentPassengers());
		System.out.println();
		
		for (Carriage c: carriageList) {
			c.displayAll();
		}
	}
	
	
}
