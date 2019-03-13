//program to implement vector
package collection;

import java.util.*;

public class TestVector {
	public static void main(String args[]) {
		Vector<String> v = new Vector<String>(); // Creating vector
		v.add("Ayush"); // Adding object to vector
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		Iterator<String> itr = v.iterator(); // Traversing vector through Iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}