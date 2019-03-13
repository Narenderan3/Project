//Program to implement LinkedHashSet (ordered one)
package collection;

import java.util.*;

public class TestLinkedHashSet {
	public static void main(String args[]) {
		LinkedHashSet<String> set = new LinkedHashSet<String>(); // Creating Object reference for Linkedhashset
		set.add("Ravi"); // Adding element to linkedhashset
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.add("Naren");
		set.add("Ram");
		set.add("Akash");
		Iterator<String> itr = set.iterator(); // Traversing element in linkedhashset
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}