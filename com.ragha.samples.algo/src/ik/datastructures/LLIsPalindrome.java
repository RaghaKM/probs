package ik.datastructures;

//import java.util.ArrayList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LLIsPalindrome {

	public static void main(String[] args) {
		LinkedList<Node> sll = new LinkedList<Node>();
		//Character[] charArray = {'a','b','c','d','e','d','c','b','a'};
		Character[] charArray = {'r','a','c','e','s','a','r'};
		/*
		//ArrayList<Character> list = new ArrayList<Character>(Arrays.asList(charArray));
		sll.addAll(Arrays.asList(charArray));*/
		Node prev=null, curr=null;
		LLIsPalindrome llPalin = new LLIsPalindrome();
		for (int i = 0; i < charArray.length; i++) {
			curr = new LLIsPalindrome().new Node(charArray[i]);
			sll.add(curr);
			
			if(prev!=null)
				prev.next = curr;
			
			prev = curr;
		}
		print(sll);
		
		System.out.println("Given LL "+ ( isPalindrome(sll)?" is a ":" is NOT a ") +" palindrome.");
	}
	
	static boolean isPalindrome(LinkedList<Node> sll){
		if(sll.isEmpty()) return false;

		if(sll.size()==1) return true;
		
		Stack<Character> stack = new Stack<Character>();
		
		Node head = sll.getFirst();
		while(head.next!=null){
			stack.add(head.val);
			head = head.next;			
		}
		stack.add(head.val);
		
		head = sll.getFirst();
		while(head.next!=null){
			char a = stack.pop().charValue(); 
			char b =  head.val;
			if(a!=b) return false;	
			head = head.next;
		}
		
		if(head.val==stack.pop()) return true;
		
		return false;
	}
	
	static void print(LinkedList<Node> sll){
		Node head = sll.getFirst();
		if(head==null) {
			System.out.println("Empty List");
			return;
		}
		
		while(head.next!=null){
			System.out.print(" -> "+head);
			head = head.next;
		}
		System.out.print(" -> "+head);
		System.out.println();
	}

	public class Node{
		char val;
		Node next;
		
		Node(){
			//val = Character.MIN_VALUE;
			next = null;
		}
		
		Node(Character value){
			val = value;
			next = null;
		}
		
		public String toString(){
			return this.val+"";
		}
	}
	
}