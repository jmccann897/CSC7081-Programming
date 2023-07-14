package challengeSuperHeroTopTrumps;

import java.util.Comparator;

public class CompareCardsByName implements Comparator<TopTrumpCard> {

	@Override
	public int compare(TopTrumpCard c1, TopTrumpCard c2) {
		// TODO Auto-generated method stub
		return c1.getName().compareTo(c2.getName());
	}

}
