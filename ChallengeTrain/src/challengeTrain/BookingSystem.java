package challengeTrain;

import java.util.ArrayList;

public class BookingSystem {

	public static void main(String[] args) {
		
		//create Train
		Train train = new Train(3);
		
		Carriage c1 = new Carriage(2, PassengerClass.FIRST);
		Carriage c2 = new Carriage(5, PassengerClass.SECOND);
		Carriage c3 = new Carriage(0, PassengerClass.SECOND);
		Carriage c4 = new Carriage(0, PassengerClass.SECOND);
		
		//add carriages to train object		
		train.addCarriage(c1);
		train.addCarriage(c2);
		train.addCarriage(c3);
		train.addCarriage(c4);
		
		//check current status
		//train.showAllDetails();
	
		//creating passengers
		Passenger p1 = new Passenger("Josh", "McCann", 1, PassengerClass.FIRST);
		Passenger p2 = new Passenger("Catherine", "McCann", 2, PassengerClass.FIRST);
		Passenger p3 = new Passenger("Matthew", "Collins", 3, PassengerClass.SECOND);
		Passenger p4 = new Passenger("Big", "Cat", 4, PassengerClass.SECOND);
		Passenger p5 = new Passenger("Hank", "Lockwood", 5, PassengerClass.SECOND);
		Passenger p6 = new Passenger("PF", "T", 6, PassengerClass.SECOND);
		Passenger p7 = new Passenger("Jake", "Marsh", 7, PassengerClass.FIRST);
		
		//add passengers which should follow train object logic
		train.addPassenger(p1);
		train.addPassenger(p2);
		train.addPassenger(p3);
		train.addPassenger(p4);
		train.addPassenger(p5);
		train.addPassenger(p6);
		train.addPassenger(p7);
		
		
		//check train status
		train.showAllDetails();
		
		
	}

}
