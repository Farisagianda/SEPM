import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ViewingTestCase {

	@Test
	void getMovieName() {
		Viewing test = new Viewing("Detective Chinatown 2", "Fitzroy", "16:00");
		String output = test.getMovieName();
		assertEquals("Detective Chinatown 2", output);
	}
	
	@Test
	void getLocation() {
		Viewing test = new Viewing("Detective Chinatown 2", "Fitzroy", "16:00");
		String output = test.getLocation();
		assertEquals("Fitzroy", output);
	}
	
	@Test
	void getTime() {
		Viewing test = new Viewing("Detective Chinatown 2", "Fitzroy", "16:00");
		String output = test.getTime();
		assertEquals("16:00", output);
	}

}
