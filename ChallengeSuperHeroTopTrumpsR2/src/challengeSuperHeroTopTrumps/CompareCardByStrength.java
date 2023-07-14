package challengeSuperHeroTopTrumps;

import java.util.Comparator;

public class CompareCardByStrength implements Comparator<TopTrumpCard>{

	@Override
	public int compare(TopTrumpCard c1, TopTrumpCard c2) {
		// TODO Auto-generated method stub
		return c2.getStrength() - c1.getStrength();
	}

}
