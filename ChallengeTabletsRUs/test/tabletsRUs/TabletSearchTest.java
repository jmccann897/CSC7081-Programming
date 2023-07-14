package tabletsRUs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabletSearchTest {

	//test data
		Tablet t1, t2, t3;
		ArrayList<Tablet> list;
		
		Manufacturer apple, google, samsung, vankyo;
		String modelValid1, modelValid2, modelValid3;
		String keyword;
		double priceValid1, priceValid2, priceValid3;
		boolean isAndroidValid1, isAndroidValid2, isAndroidValid3;
		double sizeValid1, sizeValid2, sizeValid3;
		String notesValid1, notesValid2, notesValid3;
		
	@BeforeEach
	void setUp() throws Exception {
		apple = Manufacturer.APPLE;
		google = Manufacturer.GOOGLE;
		samsung = Manufacturer.SAMSUNG;
		vankyo = Manufacturer.VANKYO;
		
		modelValid1 = "modelValid1";
		modelValid2 = "modelValid2";
		modelValid3 = "modelValid3";
		
		priceValid1  = 1.00;
		priceValid2  = 2.00;
		priceValid3  = 3.00;
		
		isAndroidValid1 = true;
		isAndroidValid2 = true;
		isAndroidValid3 = false;
		
		sizeValid1 = 6.01;
		sizeValid2 = 12.00;
		sizeValid3 = 20.99;
		
		notesValid1 = "1";
		notesValid2 = "2";
		notesValid3 = "3";
		
		t1 = new Tablet(apple, modelValid1, priceValid1, isAndroidValid1, sizeValid1, notesValid1);
		t2 = new Tablet(google, modelValid2, priceValid2, isAndroidValid2, sizeValid2, notesValid2);
		t3 = new Tablet(samsung, modelValid3, priceValid3, isAndroidValid3, sizeValid3, notesValid3);
		
		list = new ArrayList<Tablet>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
	}

	@Test
	void testSearchByKeyword() {
		ArrayList<Tablet> results = TabletSearchMethods.searchByKeyword(list, notesValid3);
		assertTrue(results.contains(t3));
	}

}
