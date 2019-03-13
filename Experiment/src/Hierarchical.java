/** Program to implement hierarchical inheritance **/
class Demo6// Superclass
{
	public void methodA() {
		System.out.println("method of Class A");
	}
}

class Demo7 extends Demo6// Subclass(Demo7 inherits Demo6)
{
	public void methodB() {
		System.out.println("method of Class B");
	}
}
 
class Demo8 extends Demo6 // Subclass(Demo8 inherits Demo6)
{
	public void methodC() {
		System.out.println("method of Class C");
	}
}

class Hierarchical {
	public static void main(String args[]) {
		Demo7 obj1 = new Demo7(); // Object creation for Demo7
		Demo8 obj2 = new Demo8(); // Object creation for Demo8
		// All classes can access the method of class A
		obj1.methodA();
		obj1.methodB();
		obj2.methodA();
		obj2.methodC();
	}
}