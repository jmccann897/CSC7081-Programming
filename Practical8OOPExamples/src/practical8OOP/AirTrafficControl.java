package practical8OOP;

public class AirTrafficControl {

	public static void main(String[] args) {

		// Default constructor works but need to set args individually
		Flight f1 = new Flight();
		f1.setDestination("Amsterdam");
		f1.setDuration(2.2);
		f1.setOrigin("Belfast");
		f1.setFlightNumber("ESY3214");

		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newark", 8.5);

		// System.out.println(f1.toString());
		String s1 = f1.toString();
		String s2 = f2.toString();
		String s3 = f3.toString();
		String s4 = f4.toString();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		// Storing flights in an array of objects
		Flight[] flights = { f1, f2, f3, f4 };
		// accessing an object within array
		System.out.println(flights[0].getFlightNumber());

		// printing using array loop
		System.out.println("All flights information.....");
		for (int i = 0; i < flights.length; i++) {
			System.out.println(flights[i].toString());
		}

		// finding and outputting longest duration
		double maxdur = -1; // set holder for max dur, initialise to -1 as error code
		for (Flight f : flights) {
			if (f.getDuration() > maxdur) {
				maxdur = f.getDuration();
			}
		}
		System.out.println("The longest duration is " + maxdur);

		// searching array for all flights to dublin
		// for each and print all that match Dublin destination
		System.out.println("The following flights go to Dublin:");
		for (Flight f : flights) {
			if (f.getDestination().equalsIgnoreCase("dublin")) {
				System.out.println(f.toString());
			}
		}
		Flight f5 = new Flight("AUS12", "Bejing", "Paris", 18.1);
		System.out.println(f5.toString());
	}

}
