package ik.datastructures;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(10);
		arrList.add(15);
		arrList.add(20);
		arrList.add(25);
		arrList.add(30);
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(5);
		pQueue.add(0);
		pQueue.add(10);
		pQueue.add(3);
		pQueue.add(2);
		System.out.println("Poll : "+pQueue.poll());
		System.out.println("Peek : "+pQueue.peek());
		System.out.println("Offer : "+pQueue.offer(3));
		System.out.println("contains:"+pQueue.contains(10));
		System.out.println("---- "+pQueue.);
		
		PriorityQueue<Integer> pQueueList = new PriorityQueue<Integer>(arrList);
		
		Object[] intArr = pQueueList.toArray();
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println((Integer)intArr[i]);
		}
		
			
		};
		
	}

}
