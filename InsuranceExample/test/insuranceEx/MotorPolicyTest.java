package insuranceEx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorPolicyTest {

	// test data
	String surname, surnameValid, surnameInvalidLow, surnameInvalidHigh;
	int ageValid, ageInvalidLow, ageInvalidHigh;
	MotorType car, bus, taxi;

	@BeforeEach
	void setUp() throws Exception {
		surname = "surname";
		surnameValid = "a".repeat(3);
		surnameInvalidLow = "a".repeat(2);
		surnameInvalidHigh = "a".repeat(21);

		ageValid = 30;
		ageInvalidLow = -1;
		ageInvalidHigh = 101;

		car = MotorType.CAR;
		bus = MotorType.BUS;
		taxi = MotorType.TAXI;
	}

	@Test
	void testMotorPolicyConstructorValid() {
		MotorPolicy m = new MotorPolicy("Name", 20, car);
		assertNotNull(m);
		assertEquals("Name", m.getSurname());
		assertEquals(20, m.getAge());
		assertEquals(car, m.getMotorType());

		// verify policy was set to something
		assertNotNull(m.getMotorPolicyID());

		// easy way to test out display methods but not unit test
		m.displayAll();
	}

	@Test
	void testMotorPolicyConstructorInvalid() {

		assertThrows(IllegalArgumentException.class, () -> {
			MotorPolicy m = new MotorPolicy(surnameInvalidLow, ageValid, car);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			MotorPolicy m = new MotorPolicy(surnameInvalidHigh, ageValid, car);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			MotorPolicy m = new MotorPolicy(surnameValid, ageInvalidLow, car);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			MotorPolicy m = new MotorPolicy(surnameValid, ageInvalidHigh, car);
		});

	}

}
