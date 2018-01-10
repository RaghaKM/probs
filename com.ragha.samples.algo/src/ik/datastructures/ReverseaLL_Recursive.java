package ik.datastructures;

import ik.datastructures.LL.Node;

public class ReverseaLL_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] listVals = {1,2,3,4,5,7};
		LL singleLL = new LL(listVals);
		ReverseaLL_Recursive reverseLL = new ReverseaLL_Recursive();
		
		System.out.println("Given List is : ");
		singleLL.printLL();
		reverseLL.reverseThe_LL(singleLL.first, null, null);
		System.out.println("Reversed List is :");
		singleLL.printLL(singleLL.last);
	}

	void reverseThe_LL(Node curr, Node prev, Node next){
		
		if(curr==null){
			return;
		}
		System.out.println(curr.val);
		/*Node next = null;
		Node prev = null;*/
		
		if(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			reverseThe_LL(next, prev,next);
		}
	}
}