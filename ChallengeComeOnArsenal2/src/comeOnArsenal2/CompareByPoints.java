package comeOnArsenal2;

import java.util.Comparator;

public class CompareByPoints implements Comparator<Team> {

	@Override
	public int compare(Team t1, Team t2) {
		// TODO Auto-generated method stub
		return t2.getPoints() - t1.getPoints();
	}

}
