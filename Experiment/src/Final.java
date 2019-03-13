/** Program to implement Final keyword **/
/* final */ class Test1 // Final class can't be extended
{
	static final int num1; // static blank final variable
	static // Static block
	{
		num1 = 5;
	}
	final int number = 10;

	final void show() // Final method implementation
	{
		System.out.println("Final Method");
	}
}

class FinalTest extends Test1 {

	/*
	 * void show() { //Error occur when try to change the value of final method
	 * System.out.println("Change final method"); }
	 */
}

public class Final {
	public static void main(String[] args) {
		FinalTest obj = new FinalTest();// object creation for FinalTest
		// obj.number=5; //Error occur when try to change the value of final field
		System.out.println("Final variable value:" + obj.number + "\nstatic final num value is:" + obj.num1);
		obj.show();
	}
}
