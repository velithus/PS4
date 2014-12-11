package ps4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcEngineTest {

	@Test
	public void test() {
		double result = Calculation.calc(10000, 3, 3.25);
		assertEquals(11007.03, result, 0.1);
	}

}
