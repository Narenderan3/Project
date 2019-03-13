/**
 * Program to show the working of the constructor and constructor overloading.
 **/
class Demo1 {
	int num1, num2, result;// Declaration of the class variables.

	Demo1() // Default constructor
	{
		num1 = 10;
		num2 = 10;// Initialization for the class variables.
		result = num1 + num2;// adding numbers and storing the result in result field
		System.out.println("Result:" + result);// Sum of two numbers
	}

	Demo1(int x, int y) // Parameterized constructor
	{
		num1 = x;
		num2 = y;
		result = num1 + num2;
		System.out.println("Result in parameters:" + result);// Sum of two numbers.
	}

	Demo1(Demo1 o) {
		num1 = o.num1;
		num2 = o.num2;
		result = num1 + num2;
		System.out.println("copied result using constructor:" + result);
	}

}

public class DemoConstructor {
	public static void main(String[] args) {
		Demo1 obj = new Demo1();// object creation for the class Demo1, default constructor gets invoked
		Demo1 ob = new Demo1(1, 1);// object creation for the class Demo1, parameterized constructor gets invoked.
		Demo1 object = new Demo1(ob);// copied values using constructor.
		obj.result = ob.result;
		System.out.println("Copied value:" + obj.result);// copying values of ob result to obj result.
	}
}
