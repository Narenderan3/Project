
/**Program to implement Methodoverloading**/
import java.util.Scanner;

class Overload {
	void add(int num1, int num2) // method to add two values
	{
		int result = num1 + num2;
		System.out.print("Result:" + result);
	}

	void add(long num1, long num2, int num3) // method to add three values and num1,num2 are type promoted from int to
												// long.
	{
		int result = (int) num1 + (int) num2 + num3;
		System.out.print("\nResult:" + result);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.println("Enter values for two numbers:");
		Scanner input = new Scanner(System.in);// object creation for the scanner class.
		num1 = input.nextInt(); // User input for num1
		num2 = input.nextInt(); // User input for num2
		Overload obj = new Overload(); // object creation for Overload class
		obj.add(num1, num2);// invoking add method with two parameters
		System.out.println("\nEnter values for third numbers:");
		num3 = input.nextInt(); // User input for num3
		obj.add(num1, num2, num3);// invoking add method with three parameters
	}
}
