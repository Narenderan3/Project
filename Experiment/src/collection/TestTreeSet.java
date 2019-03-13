//Program to implement Treeset( print in ascending order) pollfirst and polllast method 
package collection;

import java.util.*;

public class TestTreeSet {
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> set = new TreeSet<String>(); // Creating object reference for treeset
		set.add("Ravi"); // Adding elements into treeset
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) { // Traversing elements in treeset
			System.out.println(itr.next());
		}
		System.out.println("Highest Value: " + set.pollFirst());
		System.out.println("Lowest Value: " + set.pollLast());
		TreeSet<String> set1 = new TreeSet<String>(); // Creating object reference for treeset
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		set1.add("E");
		System.out.println("Initial Set: " + set1);

		System.out.println("Reverse Set: " + set1.descendingSet());

		System.out.println("Head Set: " + set1.headSet("C", true));

		System.out.println("SubSet: " + set1.subSet("A", false, "E", true));

		System.out.println("TailSet: " + set1.tailSet("C", false));

	}
}