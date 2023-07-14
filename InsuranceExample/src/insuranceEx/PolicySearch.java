package insuranceEx;

import java.util.ArrayList;

public class PolicySearch {

	/**
	 * This method searches the policy list for ages between the two boundaries
	 * inclusive
	 * 
	 * @param listToSearch
	 * @param lowerBoundAge
	 * @param upperBoundAge
	 * @return
	 */
	public static ArrayList<MotorPolicy> searchByAge(ArrayList<MotorPolicy> listToSearch, int lowerBoundAge,
			int upperBoundAge) {
		//input check
		if(lowerBoundAge<0) {
			throw new IllegalArgumentException("Age can't be negative");
		}
		if(upperBoundAge>100) {
			throw new IllegalArgumentException("Age can't be greater than 100");
		}
		
		if(upperBoundAge<lowerBoundAge) {
			throw new IllegalArgumentException("Upper Bound age can't be less than Lower Bound age");
		}
		
		ArrayList<MotorPolicy> results = new ArrayList<MotorPolicy>();
		for (MotorPolicy m : listToSearch) {
			if (m.getAge() >= lowerBoundAge && m.getAge() <= upperBoundAge) {
				results.add(m);
			}
		}
		return results;
	}

	/**
	 * This method searches the policy list for policies that match the given MotorTypes
	 * @param listToSearch
	 * @param type
	 * @return
	 */
	public static ArrayList<MotorPolicy> searchForAllByMotorPolicyType(ArrayList<MotorPolicy> listToSearch,
			MotorType type) {
		ArrayList<MotorPolicy> results = new ArrayList<MotorPolicy>();
		for (MotorPolicy m : listToSearch) {
			if (m.getMotorType() == type) {
				results.add(m);
			}
		}
		return results;
	}

}
