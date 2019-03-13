//Program to implement substring,uppercase,lowercase,trim,startswith,endswith,charAt,length,contains,format,bytes,getchars,indexOf,join
package string;

public class SubString {

	public static void main(String args[]) {
		String s = " SachinTendulkar ";
		String name = "what do you know about me";
		String joinString1 = String.join("-", "welcome", "to", "javatpoint"); // join method
		System.out.println(joinString1);
		System.out.println("Contains method:" + name.contains("do you know"));
		System.out.println("Contains method:" + name.contains("about"));
		System.out.println("Contains method:" + name.contains("hello"));
		System.out.println("Empty method:" + s.isEmpty()); // check string s is empty or not
		System.out.println(s.substring(7));// Tendulkar Startindex is inclusive
		System.out.println(s.substring(0, 7));// Sachin endIndex is exclusive
		System.out.println(s.toUpperCase());// SACHINTENDULKAR
		System.out.println(s.toLowerCase());// sachinTendulkar
		System.out.println(s);// original no change
		System.out.println(s.trim());// Eliminates whitespace before and after
		System.out.println(s.startsWith(" Sa"));// true
		System.out.println(s.endsWith("r "));// true
		System.out.println(s.charAt(1));// S
		System.out.println(s.length());//
		String name1 = "sonoo"; // Example for format method
		String sf1 = String.format("name is %s", name1);
		String sf2 = String.format("value is %f", 32.33434);
		String sf3 = String.format("value is %32.12f", 32.33434);// returns 12 char fractional part filling with 0

		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
		String s1 = "ABCDEFG"; // Example for getBytes method
		byte[] barr = s1.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
		String str = new String("hello javatpoint how r u");// getchars method
		char[] ch = new char[10];
		try {
			str.getChars(6, 16, ch, 0);
			System.out.println("getchars method:");
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		String str1 = "this is index of example"; // indexof and lastindexof method
		// passing substring
		int index = str1.lastIndexOf('s');// returns last index of 's' char value
		System.out.println("lastIndexOf method:" + index);// 6
		int index1 = str1.indexOf("is");// returns the index of is substring
		int index2 = str1.indexOf("index");// returns the index of index substring
		System.out.println("indexOf method:" + index1 + "  " + index2);// 2 8

		// passing substring with from index
		int index3 = str1.indexOf("is", 4);// returns the index of is substring after 4th index
		System.out.println("indexOf method:" + index3);// 5 i.e. the index of another is

		// passing char value
		int index4 = str1.indexOf('s');// returns the index of s char value
		System.out.println("indexOf method:" + index4);// 3
	}
}
