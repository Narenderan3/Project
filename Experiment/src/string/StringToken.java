//Program to implement StringTokenizer Class
package string;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is naren", " ");
		int count = st.countTokens(); // count total no tokens in st object
		System.out.println("Total number of tokens:" + count);
		while (st.hasMoreTokens()) { // check if there is more tokens available
			System.out.println(st.nextToken()); // return next tokenizer value from st.
		}
		StringTokenizer st1 = new StringTokenizer("my,brother,name,is,ashwin");

		// printing next token
		System.out.println("Next token is : " + st1.nextToken(",")); // return next token based on delimiter.

	}
}