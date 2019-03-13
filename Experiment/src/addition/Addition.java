/**Program to create a user defined package**/
package addition; //User defined Package

import java.util.Scanner;

public class Addition {
	public void showResult()// Change public modifier to protected(example for protected access modifier)
	{
		int num1, num2, result;
		System.out.println("Enter two values:");
		Scanner input = new Scanner(System.in);// object creation for the scanner class.
		num1 = input.nextInt(); // User input for num1
		num2 = input.nextInt(); // User input for num2
		result = num1 + num2;
		System.out.println("Addition of two number is:" + result);
	}

	void show() {
		System.out.println("User Defined Package");
	}
}
