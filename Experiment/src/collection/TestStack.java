//Program to implement stack
package collection;

import java.util.*;

public class TestStack {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>(); // Creating stack
		stack.push("Ayush"); // Adding or pushing object to stack
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		stack.pop(); // Removing last element from Stack
		Iterator<String> itr = stack.iterator(); // Traversing stack through iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
