/** Program to implement this passed as a argument in constructor call **/
class ExampleThis {
	ThisConstructor obj; // object reference for ThisConstructor class

	ExampleThis(ThisConstructor obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);// using data member of ThisConstructor class
	}
}

class ThisConstructor {
	int data = 10;

	ThisConstructor() {
		ExampleThis ex = new ExampleThis(this); // This passed as a argument in a constructor call
		ex.display(); //
	}

	public static void main(String args[]) {
		ThisConstructor th = new ThisConstructor(); // object creation for ThisConstructor class
	}
}