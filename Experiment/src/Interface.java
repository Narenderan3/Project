
/**Program to implement Interface and support multiple inheritance through interface**/
import java.util.Scanner;

interface Circle {
	double pi = 3.14;

	public void area(int radius); // abstract method

	default void circumference(int rad) // default method permitted in java 8 and 9 version
	{
		float circum = 2 * (float) pi * rad;
		System.out.println("Circumference of the circle:" + circum);
	}

	static void show() {
		System.out.println("Static method");
	}
}

class Diameter {
	int diameter;
}

class Area extends Diameter implements Circle // Area class inherits Diameter class implements Circle interface
												// (multiple inheritance)
{
	public void area(int radius) {
		float result = (float) pi * radius * radius;
		diameter = 2 * radius;
		System.out.println("Diameter of a circle:" + diameter);
		System.out.println("Area of a circle:" + result);
	}
}

public class Interface {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// object creation for the scanner class.
		System.out.println("Enter the radius of a circle:");
		int rad = input.nextInt();// user gives input for rad
		Area obj = new Area(); // object creation for circle class
		obj.area(rad);// calling area method
		obj.circumference(rad);// calling circumference method
		Circle.show();// calling show method
	}
}