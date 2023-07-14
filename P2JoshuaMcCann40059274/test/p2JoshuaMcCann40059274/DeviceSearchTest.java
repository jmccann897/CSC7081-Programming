package p2JoshuaMcCann40059274;

/**
 * Josh McCann
 * 40059274
 * Testing of Device Search class
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeviceSearchTest {
	// test data
	Radiator r1, r2, r3, r4;
	String name1, name2, name3, name4;
	String m1, m2, m3, m4;
	Room room1, room2, room3, room4;
	Powerstate p1, p2, p3, p4;
	double tempNow1, tempNow2, tempNow3, tempNow4;
	double tempSearchLow, tempSearchHigh, tempSearchInvalidLow, tempSearchInvalidHigh;
	double target1, target2, target3, target4;
	ArrayList<Radiator> radiators;
	ArrayList<Radiator> results;

	@BeforeEach
	void setUp() throws Exception {
		radiators = new ArrayList<Radiator>();
		results = new ArrayList<Radiator>();

		name1 = "name1";
		name2 = "name2";
		name3 = "name3";
		name4 = "name4";

		m1 = "manf1";
		m2 = "manf2";
		m3 = "manf3";
		m4 = "manf4";

		room1 = Room.BATHROOM;
		room2 = Room.BATHROOM;
		room3 = Room.HOUSE;
		room4 = Room.KITCHEN;

		tempNow1 = 15.0;
		tempNow2 = 17.0;
		tempNow3 = 19.0;
		tempNow4 = 22.0;

		tempSearchLow = 16.0;
		tempSearchHigh = 20.0;
		tempSearchInvalidLow = -10.1;
		tempSearchInvalidHigh = 30.1;

		target1 = 17.0;
		target2 = 24.0;
		target3 = 13.0;
		target4 = 15.0;

		r1 = new Radiator(name1, m1, room1, p1, tempNow1, target1);
		r2 = new Radiator(name2, m2, room2, p2, tempNow2, target2);
		r3 = new Radiator(name3, m3, room3, p3, tempNow3, target3);
		r4 = new Radiator(name4, m4, room4, p4, tempNow4, target4);

		radiators.add(r1);
		radiators.add(r2);
		radiators.add(r3);
		radiators.add(r4);
	}

	@Test
	void testSearchByRoom() {
		results = DeviceSearch.searchByRoom(radiators, room1);
		assertTrue(results.size() == 2);
		assertTrue(results.contains(r1));
		assertTrue(results.contains(r2));
	}

	@Test
	void testSearchByRoomInvalid() {
		assertThrows(NullPointerException.class, () -> {
			results = DeviceSearch.searchByRoom(null, room1);
		});

		assertThrows(NullPointerException.class, () -> {
			results = DeviceSearch.searchByRoom(radiators, null);
		});

	}

	@Test
	void testSearchByTemp() {
		results = DeviceSearch.searchByTemp(radiators, tempSearchLow, tempSearchHigh);
		assertTrue(results.size() == 2);
		assertTrue(results.contains(r2));
		assertTrue(results.contains(r3));
	}

	@Test
	void testSearchByTempInvalid() {
		assertThrows(NullPointerException.class, () -> {
			results = DeviceSearch.searchByTemp(null, tempSearchLow, tempSearchHigh);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			results = DeviceSearch.searchByTemp(radiators, tempSearchInvalidLow, tempSearchHigh);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			results = DeviceSearch.searchByTemp(radiators, tempSearchLow, tempSearchInvalidHigh);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			results = DeviceSearch.searchByTemp(radiators, tempSearchHigh, tempSearchLow);
		});

	}

}
