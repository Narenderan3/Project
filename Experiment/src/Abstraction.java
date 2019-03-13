
/**Program to implement Abstraction through abstract class**/
import java.util.Scanner;

//import java.io.DataInputStream;
abstract class Test // Super class
{
	abstract void add(int num1, int num2); // add is a Abstract method

}

class Testing extends Test// Testing inherits Test
{
	int num1, num2, result;

	void add(int num1, int num2) { // Method to add two numbers
		result = num1 + num2;
		System.out.println("Result:" + result);
	}
}

public class Abstraction {
	public static void main(String[] args) {
		int num1, num2;
		// DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the values for two numbers:");
		// num1=dis.readInt();
		Scanner input = new Scanner(System.in);// object creation for the scanner class.
		num1 = input.nextInt(); // User input for num1
		num2 = input.nextInt(); // User input for num2
		Testing obj = new Testing(); // Object creation for Sub class Testing
		obj.add(num1, num2); // Calling method add
		
	}
}
