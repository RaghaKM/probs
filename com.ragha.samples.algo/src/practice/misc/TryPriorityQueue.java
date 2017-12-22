package practice.misc;

import java.util.PriorityQueue;

public class TryPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("ragha");
		pq.add("blore");
		pq.add("same");
		pq.add("queue");
		pq.add("1priority");		*/
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(new Integer(124));
		pq.add(new Integer(10));
		pq.add(new Integer(11));
		pq.add(new Integer(1));
		pq.add(new Integer(3));
		pq.add(new Integer(8));
		pq.add(new Integer(2));

		
		System.out.println(pq.toString());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.toString());
		System.out.println(pq.poll());
		System.out.println(pq.toString());
		System.out.println(pq.poll());
		System.out.println(pq.toString());
		System.out.println(pq.poll());
		System.out.println(pq.toString());
	}
}
