package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SignupTest {

	@Test
	void test() {

		Signup signup = new Signup();
		boolean result = signup.usernameContainsNumber();
		boolean special = signup.usernameContainsSpecialcharacters();
		assertEquals(true, special);
	}

}
