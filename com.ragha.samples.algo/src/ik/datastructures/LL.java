package ik.datastructures;

public class LL {
	Node first = null;
	Node last = null;
	
	public static void main(String[] args) {

	}

	public LL(){
		first = null;
		last = null;
	}
	public LL(int[] vals){
		for(int i=0;i<vals.length;i++){
			add(vals[i]);
		}
	}
	
	void add(int val){
		
		Node newNode = new Node(val);
		
		if(first==null){
			first = newNode;
			last = newNode;
		}
		last.next=newNode;
		last = newNode;
	}
	
	void delete(int val){
		
		if(first==null) System.out.println("Cannot delete, no records found");
		
		if(first.val==val && first.next==null){
			
		}else if(first.val==val){
			first = first.next;
		}else{
			
			Node currNode = first;
			Node prevNode = null;
			
			
			while(currNode.next!=null){
				prevNode = currNode;
				
				if(currNode.val==val){
					prevNode.next = currNode.next;
					currNode.next = null;
				}
			}
			
			}
	}
	
	void printLL(){
		Node head = first;
		while(head!=null){
			System.out.print("->"+head.val);
			head=head.next;
		}
		System.out.println();
	}
	
	void printLL(Node head){

		while(head!=null){
			System.out.print("->"+head.val);
			head=head.next;
		}
		System.out.println();
	}	
	
	class Node{
	 int val;
	 Node next = null;
	 
	 Node(int value){
		 this.val = value; 
	 }
	 
	 public String toString(){
		 return val+"";
	 }
	 
	}
}