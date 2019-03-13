package testdriven;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReverse {

	@Test
	void test() {
		ReverseNumber num=new ReverseNumber();
		int result=num.reverse(123);
		assertEquals(321,result);
	}

}
