package challengeCheersForBeers;

import java.util.Comparator;

public class CompareBeersByName implements Comparator<Beer> {

	@Override
	public int compare(Beer o1, Beer o2) {
		//order by name
		return o1.getName().compareTo(o2.getName());
	}
	

}
