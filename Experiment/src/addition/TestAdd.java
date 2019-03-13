package addition;

/**Program to implement a user defined package**/

public class TestAdd { // extends Addition{

	public static void main(String[] args) {
		Addition obj = new Addition();// object creation for class Addition
		obj.showResult();// Invoking a method showResult
		// obj.show();//Error occur because show method is access within package its
		// modifier is default
	}
}
