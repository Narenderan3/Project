/** Program to show the working of the class and objects. **/
class Addition {
	int num1 = 10; // initialization of num1 field
	int num2 = 10; // initialization of num2 field
	int result = num1 + num2; // adding two numbers
}

public class DemoClass {

	public static void main(String[] args) {
		/**
		 *  object creation for Addition class
		 */
		Addition obj = new Addition(); 
		System.out.println(obj.result);// printing result
		

	}

}
