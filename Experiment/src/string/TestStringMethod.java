//Program to implement intern,valueOf,replace,replaceall
package string;

public class TestStringMethod {
	public static void main(String args[]) {
		String s1 = new String("Sachin");
		String s2 = s1.intern();
		int a = 10;
		String s3 = String.valueOf(a);
		String s4 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s4.replace("Java", "Kava");// replaces all occurrences of "Java" to "Kava"
		System.out.println(replaceString);
		System.out.println(s3 + 10);
		System.out.println(s2);// Sachin
		// This show the difference between replace and replaceall.
		String myString = "   Horse         Cow\n\n   \r Camel \t\t Sheep \n Goat        ";
		String regex = "\\s";
		String replacement = "";
		String newString = myString.replaceAll(regex, replacement);
		String newString1 = myString.replace(regex, replacement);
		System.out.println("Replaceall method:" + newString);
		System.out.println("Replace method:" + newString1);
		// This part shows the working of splits method
		String s = "java string split method by javatpoint";
		String[] words = s.split("\\s");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		System.out.println("Split method:");
		for (String w : words) {
			System.out.println(w);
		}
	}
}
