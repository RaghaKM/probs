package ik.recurssion.test;

public class ReverseADoublyList {
	Node head = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class Node{
		Node next;
		Node prev;
		int val;
		
		public Node(int val){
			super();
			this.val = val;
		}
	}
	
	Node createList(int[] vals){
		for (int i = 0; i < vals.length; i++) {
			if(head==null)
				head = new Node(vals[i]);

		}
		return null;//TODO
	}
	
}