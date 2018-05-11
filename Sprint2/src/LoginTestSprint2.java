import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoginTestSprint2 {

	@Test
	void getUserName() {
		Login test = new Login("Farisagianda", "12345678");
		String output = test.getUserName();
		assertEquals("Farisagianda", output);
	}
	
	@Test
	void getPassword() {
		Login test = new Login("Farisagianda", "12345678");
		String output = test.getPassword();
		assertEquals("12345678", output);
	}

}
