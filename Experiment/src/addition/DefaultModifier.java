/**Program to implement default access modifier**/
package addition;

public class DefaultModifier {

	public static void main(String[] args) {
		Addition obj=new Addition();//object creation for class Addition 
		obj.showResult();// Invoking a method showResult
		obj.show(); //Call show method and gets accessed because this method is within package so default members can be accessed.

	}

}
