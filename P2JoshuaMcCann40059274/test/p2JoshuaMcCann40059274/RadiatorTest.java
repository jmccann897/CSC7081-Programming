package p2JoshuaMcCann40059274;

/**
 * Josh McCann
 * 40059274
 * Testing of radiator objects and devices through inherited methods
 */

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RadiatorTest {

	// test data
	String nameValid, nameInvalidLow, nameInvalidHigh;
	String manufacturerValid, manufactuerInvalidLow, manufacturerInvalidHigh;
	double tempNowValid, tempNowInvalidLow, tempNowInvalidHigh;
	double tempTargetValidAboveNow, tempTargetInvalidLow, tempTargetInvalidHigh, tempTargetValidBelowNow;
	Room house, kitchen, bedroom, bathroom, lounge;
	Powerstate on, off;
	Radiator rad;

	@BeforeEach
	void setUp() throws Exception {
		nameValid = "a".repeat(10);
		nameInvalidLow = "a".repeat(2);
		nameInvalidHigh = "a".repeat(21);

		manufacturerValid = "z".repeat(10);
		manufactuerInvalidLow = "z".repeat(2);
		manufacturerInvalidHigh = "z".repeat(21);

		tempNowValid = 15.5;
		tempNowInvalidLow = -10.1;
		tempNowInvalidHigh = 30.1;

		tempTargetValidAboveNow = 17.5;
		tempTargetValidBelowNow = 14.5;
		tempTargetInvalidLow = 4.9;
		tempTargetInvalidHigh = 26.1;

		house = Room.HOUSE;
		kitchen = Room.KITCHEN;
		bedroom = Room.BEDROOM;
		bathroom = Room.BATHROOM;
		lounge = Room.LOUNGE;

		on = Powerstate.ON;
		off = Powerstate.OFF;

		rad = new Radiator();
	}

	/**
	 * Arg based constructor test
	 */
	@Test
	void testRadiatorConstructorWithArgs() {
		Radiator r = new Radiator(nameValid, manufacturerValid, house, on, tempNowValid, tempTargetValidAboveNow);
		// used comments with println to follow vars set as I had issues with temp set / temp now logic with powerstate
		
//		System.out.println(r.getPowerstate());
//		System.out.println(r.getTempNow());
//		System.out.println(r.getTempTarget());
		assertNotNull(r);
		assertEquals(nameValid, r.getName());
		assertEquals(manufacturerValid, r.getManufacturer());
		assertEquals(house, r.getRoom());
		assertEquals(on, r.getPowerstate());
		assertEquals(tempNowValid, r.getTempNow());
		assertEquals(tempTargetValidAboveNow, r.getTempTarget());

		// testing printing methods for myself
		r.status();
		r.showAll();
		r = new Radiator(nameValid, manufacturerValid, house, on, tempNowValid, tempTargetValidBelowNow);

//		System.out.println(r.getPowerstate());
//		System.out.println(r.getTempNow());
//		System.out.println(r.getTempTarget());
		assertNotNull(r);
		assertEquals(nameValid, r.getName());
		assertEquals(manufacturerValid, r.getManufacturer());
		assertEquals(house, r.getRoom());
		assertEquals(on, r.getPowerstate());
		assertEquals(tempNowValid, r.getTempNow());
		assertEquals(tempTargetValidBelowNow, r.getTempTarget());
	}

	/**
	 * Arg based constructor with invalid args
	 */
	@Test
	void testRadiatorConstructorInvalidArgs() {

		// checking device setName throws Illegal Arg Exception
		assertThrows(IllegalArgumentException.class, () -> {
			Radiator r = new Radiator(nameInvalidLow, manufacturerValid, bathroom, on, tempNowValid,
					tempTargetValidAboveNow);
		});

		// checking device setName throws Illegal Arg Exception
		assertThrows(IllegalArgumentException.class, () -> {
			Radiator r = new Radiator(nameInvalidHigh, manufacturerValid, bathroom, on, tempNowValid,
					tempTargetValidAboveNow);
		});

		// checking device setManufacturer throws Illegal Arg Exception
		assertThrows(IllegalArgumentException.class, () -> {
			Radiator r = new Radiator(nameValid, manufactuerInvalidLow, bathroom, on, tempNowValid,
					tempTargetValidAboveNow);
		});

		// checking device setManufacturer throws Illegal Arg Exception
		assertThrows(IllegalArgumentException.class, () -> {
			Radiator r = new Radiator(nameValid, manufacturerInvalidHigh, bathroom, on, tempNowValid,
					tempTargetValidAboveNow);
		});

		// not bothering with checking enum classes for nulls as expecting them to be
		// forced correct
		// checking tempNow of radiator object throws Illegal Arg exception - Low
		// example
		assertThrows(IllegalArgumentException.class, () -> {
			Radiator r = new Radiator(nameValid, manufacturerValid, bathroom, on, tempNowInvalidLow,
					tempTargetValidAboveNow);
		});
		// checking tempNow of radiator object throws Illegal Arg exception - High
		// example
		assertThrows(IllegalArgumentException.class, () -> {
			Radiator r = new Radiator(nameValid, manufacturerValid, bathroom, on, tempNowInvalidHigh,
					tempTargetValidAboveNow);
		});

		// checking temp target of radiator object throws Illegal Arg exception - Low
		// example
		assertThrows(IllegalArgumentException.class, () -> {
			Radiator r = new Radiator(nameValid, manufacturerValid, bathroom, on, tempNowValid, tempTargetInvalidLow);
		});
		// checking temp target of radiator object throws Illegal Arg exception - High
		// example
		assertThrows(IllegalArgumentException.class, () -> {
			Radiator r = new Radiator(nameValid, manufacturerValid, bathroom, on, tempNowValid, tempTargetInvalidHigh);
		});

	}

	@Test
	void testGetSetTempNow() {
		rad.setTempNow(tempNowValid);
		assertEquals(tempNowValid, rad.getTempNow());
	}

	@Test
	void testGetSetTempNowInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			rad.setTempNow(tempNowInvalidLow);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			rad.setTempNow(tempNowInvalidHigh);
		});
	}

	@Test
	void testGetSetTempTarget() {
		rad.setTempTarget(tempTargetValidAboveNow);
		assertEquals(tempTargetValidAboveNow, rad.getTempTarget());
	}

	@Test
	void testGetSetTempTargetInvalid() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			rad.setTempTarget(tempTargetInvalidLow);
		});

		assertEquals("Target temperature outside valid boundary", e.getMessage());

		e = assertThrows(IllegalArgumentException.class, () -> {
			rad.setTempTarget(tempTargetInvalidHigh);
		});

		assertEquals("Target temperature outside valid boundary", e.getMessage());
	}

	@Test
	void testGetSetName() {
		rad.setName(nameValid);
		assertEquals(nameValid, rad.getName());
	}

	@Test
	void testGetSetNameInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			rad.setName(nameInvalidLow);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			rad.setName(nameInvalidHigh);
		});
	}

}
