
/**Program to show the working of inheritance and its types single and multilevel**/
import java.util.Scanner;

class Demo2 // Superclass
{
	int mark1, mark2;

	Demo2()// Default constructor of superclass->Demo2
	{
		System.out.println("Enter two marks obtained by the student:");
		Scanner input = new Scanner(System.in);// object creation for the scanner class.
		mark1 = input.nextInt(); // User input for mark1
		mark2 = input.nextInt(); // User input for mark2
	}
}

class Demo3 extends Demo2// Single inheritance(Demo3 inherits Demo2)
{
	int result = mark1 + mark2;

	Demo3()// Default constructor of subclass->Demo3
	{
		System.out.println("Result:" + result);
	}
}

class Demo4 extends Demo3// Multilevel inheritance (Demo4 inherits Demo3)
{
	float avg;

	Demo4()// Default constructor of subclass->Demo4
	{
		avg = (float) result / 2;
		System.out.println("Average of two marks:" + avg);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Demo4 obj = new Demo4();// object creation for the subclass->Demo3.
	}
}
