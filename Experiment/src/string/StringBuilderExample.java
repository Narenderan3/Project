//Program to implement to StringBuilder methods
package string;

public class StringBuilderExample {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Hello ");
		StringBuilder sb1 = new StringBuilder();
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		StringBuilder strbuilder = new StringBuilder("Hello");
		strbuilder.insert(1, "Java");// now original string is changed
		System.out.println(strbuilder);// prints HJavaello
		strbuilder.replace(1, 3, "Java");
		System.out.println(strbuilder);// prints HJavavaello
		strbuilder.delete(1, 7);
		System.out.println(strbuilder);// prints Hello
		strbuilder.reverse();
		System.out.println(strbuilder);// prints olleH
		System.out.println(sb1.capacity());// default 16
		sb1.append("Naren");
		System.out.println(sb1.capacity());// now 16
		sb1.append("java is my favourite language");
		System.out.println(sb1.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb1.ensureCapacity(10);// now no change
		System.out.println(sb1.capacity());// now 34
		sb1.ensureCapacity(50);// now (34*2)+2
		System.out.println(sb1.capacity());// now 70
	}
}
