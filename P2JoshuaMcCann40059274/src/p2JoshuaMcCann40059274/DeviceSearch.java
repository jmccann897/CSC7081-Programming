package p2JoshuaMcCann40059274;

/**
 * Device Search class which is a utility class to provide search methods for radiator objects
 * @author Josh McCann
 * 40059274
 */

import java.util.ArrayList;

public class DeviceSearch {

	// variables for business logic
	public static final double MIN_TEMP = -10;
	public static final double MAX_TEMP = 30;

	/**
	 * Method that searches a list of radiators and returns list of radiator with
	 * matching room
	 * 
	 * @param listToSearch
	 * @param room
	 * @return
	 * @throws NullPointerException
	 */
	public static ArrayList<Radiator> searchByRoom(ArrayList<Radiator> listToSearch, Room room)
			throws NullPointerException {
		if (room == null || listToSearch == null) {
			throw new NullPointerException("Null argument passed as parameter");
		}

		ArrayList<Radiator> results = new ArrayList<Radiator>();
		for (Radiator r : listToSearch) {
			if (r.getRoom() == room) {
				results.add(r);
			}
		}
		return results;
	}

	/**
	 * Method to search list of radiators within a temperature range
	 * 
	 * @param listToSearch
	 * @param lowerBoundTemp
	 * @param upperBoundTemp
	 * @return
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public static ArrayList<Radiator> searchByTemp(ArrayList<Radiator> listToSearch, double lowerBoundTemp,
			double upperBoundTemp) throws NullPointerException, IllegalArgumentException {
		if (listToSearch == null) {
			throw new NullPointerException("Null argument passed as parameter");
		}
		if (lowerBoundTemp < MIN_TEMP || upperBoundTemp > MAX_TEMP) {
			throw new IllegalArgumentException("Search temperature outside valid boundary");
		}
		if (upperBoundTemp < lowerBoundTemp) {
			throw new IllegalArgumentException("Your upper bound is lower than your lower bound");
		}

		ArrayList<Radiator> results = new ArrayList<Radiator>();
		for (Radiator r : listToSearch) {
			if (r.getTempNow() >= lowerBoundTemp && r.getTempNow() <= upperBoundTemp) {
				results.add(r);
			}
		}
		return results;
	}

}
