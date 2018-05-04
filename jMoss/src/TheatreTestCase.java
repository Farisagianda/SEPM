import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TheatreTestCase {

	@Test
	void test() {
		Theatre test = new Theatre();
		String[][] output = test.getSeatMap();
	}
	
	@Test
	void test2() {
		Theatre test = new Theatre();
		String[][] seatMap = new String[10][10];
        for(int x = 0; x < 10; x ++) {
            for (int y = 0; y < 10; y++) {
                seatMap[x][y] = Integer.toString(x + 1) + "." + Integer.toString(y + 1);
            }
        }
        seatMap = test.getSeatMap();
	}
}
