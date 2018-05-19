import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShowingTestSprint2 {

	private static final Seatmap Seatmap = null;

	@Test
	void getTitle() {
		Showing test = new Showing("StKilda", "The Avengers", "Monday", "19:00", Seatmap);
		String output = test.getTitle();
		assertEquals("The Avengers", output);
	}
	
	@Test
	void getTime() {
		Showing test = new Showing("StKilda", "The Avengers", "Monday", "19:00", Seatmap);
		String output = test.getTime();
		assertEquals("19:00", output);
	}
	
	@Test
	void getDay() {
		Showing test = new Showing("StKilda", "The Avengers", "Monday", "19:00", Seatmap);
		String output = test.getDay();
		assertEquals("Monday", output);
	}
	
	@Test
	void getLocation() {
		Showing test = new Showing("StKilda", "The Avengers", "Monday", "19:00", Seatmap);
		String output = test.getLocation();
		assertEquals("StKilda", output);
	}

	@Test
	void getSeats() {
		Showing test = new Showing("StKilda", "The Avengers", "Monday", "19:00", Seatmap);
		Seatmap output = test.getSeats();
		assertEquals(Seatmap, output);
	}
}
