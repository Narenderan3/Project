/** program to implement this keyword **/
class Example {
	int num1 = 10;

	Example getEx() {
		return this; // this used as a current class instance
	}

	Example() // default constructor
	{
		System.out.println("Default constructor");
	}

	Example(int x) // parameterized constructor
	{
		this(); // invoke default constructor (refer current class construcutor)
		System.out.println(x);
	}

	void demo(int num1) {
		System.out.println(num1); // invoke current class variable
		method(this); // this passing as an argument in method
	}

	void method(Example ob) {
		System.out.println("This pass as an argument in the method");
	}

	void demo1() {
		System.out.println("hello demo1");
		// demo();//same as this.demo()
		this.demo(num1); // invoke current class method
	}
}

class This {
	public static void main(String args[]) {
		Example obj = new Example(5); // object creation for Example
		obj.demo1(); // invoking method demo1
		new Example().getEx(); // anonymous object
	}
}
