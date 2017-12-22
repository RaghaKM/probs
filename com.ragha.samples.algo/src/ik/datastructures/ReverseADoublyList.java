package IK.datastructures;

import java.util.Scanner;

public class ReverseADoublyList {
	Node head = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		scan.nextInt()

	}

	public static class Node{
		Node next;
		Node prev;
		int val;
		
		public Node(int val){
			super();
			this.val = val;
			this.next = null;
			this.prev = null;
		}
	}
	
	Node createList(int[] vals){
		for (int i = 0; i < vals.length; i++){
			Node 
			if(head==null)
				head = new Node(vals[i]);
			
			
		}
		return head;
	}
}