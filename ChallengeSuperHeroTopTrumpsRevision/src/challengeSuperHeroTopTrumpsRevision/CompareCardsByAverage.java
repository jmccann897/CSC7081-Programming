package challengeSuperHeroTopTrumpsRevision;

import java.util.Comparator;

public class CompareCardsByAverage implements Comparator<TopTrumpCard> {

//	@Override
//	public int compare(Object o1, Object o2) {
//		TopTrumpCard c1 = (TopTrumpCard)o1; //cast to access methods
//		TopTrumpCard c2 = (TopTrumpCard)o2; 
//		double avg1 = (c1.getAgility()+c1.getIntelligence()+c1.getSpeed()+c1.getStrength())/4;
//		double avg2 = (c2.getAgility()+c2.getIntelligence()+c2.getSpeed()+c2.getStrength())/4;
//		return (int) (avg2-avg1);
//	}

	@Override
	public int compare(TopTrumpCard o1, TopTrumpCard o2) {
		double avg1 = (o1.getAgility()+o1.getIntelligence()+o1.getSpeed()+o1.getStrength())/4;
		double avg2 = (o2.getAgility()+o2.getIntelligence()+o2.getSpeed()+o2.getStrength())/4;
		return (int) (avg2-avg1);
	}

}
