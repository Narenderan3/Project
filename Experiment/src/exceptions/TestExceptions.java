//Program to show the working of exceptions with try and catch blocks where exception code is written in catch block rest of the code is not executed
package exceptions;

public class TestExceptions {
	public static void main(String args[]) {
		try {
			int data1 = 50 / 0; // may throw exception

		}

		// handling the exception
		catch (Exception e) {
			// generating the exception in catch block
			int data2 = 50 / 0; // may throw exception

		}

		System.out.println("rest of the code");
	}
}
