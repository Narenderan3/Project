/** Program to implement Methodoverriding and super keyword **/
class Override // Superclass
{
	int number = 10;

	void show() {
		System.out.println("Super class");
	}
}

class Demo9 extends Override // Subclass (Demo9 inherits Override class)
{
	void show() {
		int number = 5;
		// super.show(); //To access superclass method
		System.out.println("Sub class and variable number whose value is:" + number);
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		Override obj = new Demo9(); // object creation for subclass
		obj.show();// Methodoverriding (invoke subclass method)
	}
}
