package challengeSuperHeroTopTrumps;

import java.util.Comparator;

public class CompareCardsByAverage implements Comparator<TopTrumpCard> {


	@Override
	public int compare(TopTrumpCard c1, TopTrumpCard c2) {
		// c1 avg
		double avg1 = (c1.getAgility()+c1.getSpeed()+c1.getStrength()+c1.getIntelligence())/4;
		//c2 avg
		double avg2 = (c2.getAgility()+c2.getSpeed()+c2.getStrength()+c2.getIntelligence())/4;
		return (int) (avg2-avg1);
	}

}
