import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookingTestSprint2 {

	@Test
	void getName() {
		Booking test = new Booking("Faris", "Faris.agianda@gmail.com", "Brunswick");
		String output = test.getName();
		assertEquals("Faris", output);
	}
	
	@Test
	void getEmail() {
		Booking test = new Booking("Faris", "Faris.agianda@gmail.com", "Brunswick");
		String output = test.getEmail();
		assertEquals("Faris.agianda@gmail.com", output);
	}
	
	@Test
	void getSuburb() {
		Booking test = new Booking("Faris", "Faris.agianda@gmail.com", "Brunswick");
		String output = test.getSuburb();
		assertEquals("Brunswick", output);
	}

}

