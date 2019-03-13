//Program to implement priorityqueue
package collection;

import java.util.*;

public class TestPriorityQueue {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>(); // Creating priority queue
		queue.add("Amit Sharma"); // Adding element to queue
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");
		System.out.println("head:" + queue.element()); // Printing the first element
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) { // Traversing the queue
			System.out.println(itr.next());
		}
		queue.remove(); // removing the head element
		queue.poll(); // removing the second(head) element
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) { // Traversing the Queue
			System.out.println(itr2.next());
		}
	}
}