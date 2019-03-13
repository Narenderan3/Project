package testdriven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddJunit {

	@Test
	void test() {
		JunitClass unit = new JunitClass();
		int result = unit.add(2, 3);
		assertEquals(5, result);
	}

}
