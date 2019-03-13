//Program to implement StringBuffer methods
package string;

class StringBufferExample {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		StringBuffer sb1 = new StringBuffer();
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		StringBuffer strbuffer = new StringBuffer("Hello");
		strbuffer.insert(1, "Java");// now original string is changed
		System.out.println(strbuffer);// prints HJavaello
		strbuffer.replace(1, 3, "Java");
		System.out.println(strbuffer);// prints HJavavaello
		strbuffer.delete(1, 7);
		System.out.println(strbuffer);// prints Hello
		strbuffer.reverse();
		System.out.println(strbuffer);// prints olleH
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
