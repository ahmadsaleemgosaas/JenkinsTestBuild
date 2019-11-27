import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MathUtil;

class TestMath {

	@Test
	public void test() {
		assertEquals(10, new MathUtil().add(5, 5));
	}

}
