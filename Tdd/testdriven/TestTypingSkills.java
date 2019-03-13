package testdriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTypingSkills {

	@Test
	void test() {
		Intern intern = new Intern();
		String result = intern.typingSkills(-30);
		assertEquals("Invalid Mark", result);
		int rating = intern.get_Rating(5);
		String result1 = intern.edpFeedback(rating);
		assertEquals("Awesome", result1);
	}

}
