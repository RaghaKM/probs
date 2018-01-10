package ik.datastructures;

import ik.datastructures.LL.Node;

public class ReverseAList_Iterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] listVals = {1,2,3,4,5,7};
		LL singleLL = new LL(listVals);
		ReverseAList_Iterative reverseLL = new ReverseAList_Iterative();
		
		System.out.println("Given List is : ");
		singleLL.printLL();
		reverseLL.reverseThe_LL(singleLL);
		System.out.println("Reversed List is :");
		singleLL.printLL(singleLL.last);
	}

	void reverseThe_LL(LL singleLL){
		Node curr = singleLL.first;
		Node next = null;
		Node prev = null;
		
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
	}
}