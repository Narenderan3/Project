package tdd;

import java.util.regex.Pattern;

public class Signup {
	String name = "naren@";

	boolean usernameContainsNumber() {
		boolean stringContainsNumber = Pattern.compile("[0-9]").matcher(name).find();
		return stringContainsNumber;
	}

	boolean usernameContainsSpecialcharacters() {
		boolean stringContainsSpecialCharacter = Pattern.compile("[^a-zA-Z ]").matcher(name).find();
		return stringContainsSpecialCharacter;
	}
}
