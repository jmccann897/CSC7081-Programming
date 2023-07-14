package challengeSuperHeroTopTrumpsRevision;

import java.util.Comparator;

public class CompareCardsByName implements Comparator<TopTrumpCard>{

	@Override
	public int compare(TopTrumpCard o1, TopTrumpCard o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
