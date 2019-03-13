//Program to implement string concatenation
package string;

class TestConcatenation {
	public static void main(String args[]) {

		String s = "Sachin" + " Tendulkar";
		String s1 = 50 + 30 + "Sachin" + 40 + 40;
		String s2 = "Ashwin ";
		String s3 = "Kumar";
		String s4 = s2.concat(s3);
		System.out.println(s4);// Sachin Tendulkar
		System.out.println(s1);// 80Sachin4040
		System.out.println(s);// Sachin Tendulkar
	}
}
