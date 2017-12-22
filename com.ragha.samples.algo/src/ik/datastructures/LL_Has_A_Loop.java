package ik.datastructures;

public class LL_Has_A_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		Node next;
		//Node right;
		int Val;
	}
	
	boolean findLoop(Node head){
		
		if(head==null) return false;
		
		Node slow = head,fast = slow.next;
		//Node fast = slow.next;

		while(fast!=null && fast.next!=null){
			if(fast==slow) return true;

			slow = slow.next;
			fast = fast.next.next;
		}
		
		return false;
	}

	/*Node createList(int[] vals){
		for(vals
	}*/
	
}