package ik.datastructures;

import java.util.Scanner;

public class Stack {
	Node top = null;
	int size = 0;
/*	Stack minStack = new Stack();
	int min;*/
	
	public static void main(String[] args) {
	int[] stackElements = {19,5,7,43,3,4,86,45,2,45,15,98,3,3,2};
	Stack stack = new Stack();
		for (int i = 0; i < stackElements.length; i++) {
			stack.push(stackElements[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int option = 0;
		//Stack stack = new Stack();
		
		stack.printStack();
		
		do {
			System.out.println("Please enter the your choice: \n 1: pop --  2: push --  3: size --  4: peak --  5: isEMpty -- 6: min -- 7: print --  '10' TO EXIT");
			
			switch (sc.nextInt()) {
			case 1:
				Node poped = stack.pop();
				System.out.println("Poped element : "+poped.val+" New Top element : "+((stack.top!=null)?stack.top.val:"Null"));
				break;

			case 2:
				System.out.println("Please enter the element you want to insert");
				stack.push(sc.nextInt());
				break;
	
			case 3:
				System.out.println("The size of stack is: "+stack.size());
				break;
				
			case 5:
				System.out.println("Is Empty : "+stack.isEmpty());
				break;
				
			case 4:
				System.out.println("Peak element in the stack: "+stack.peak());
				break;
				
			case 7:
				System.out.println("==========================");
				stack.printStack();
				System.out.println("==========================");
				break;	
				
				
			default:
				flag = false;
				break;
			}

		}while(flag);
		
	}
	
	Node peak(){
			return top;
	}
	
	boolean isEmpty(){
		return (top==null);
	}
	
	int peakVal(){
		if(top!=null)
			return top.val;
		return -9999;
	}
	
	Node pop(){
		if(top!=null){
		Node temp = top;
		top = top.next;
		size--;
		return temp;
		}
		return null;
	}
	
	int popedVal(){
		Node poped = pop();
		if(poped==null) return -9999;
		
		return poped.val;
	}
	
	Node push(int value){
		Node newTop = new Node(value);
		/*if(top!=null){
			newTop.next = top;
		}*/
		newTop.next=top;
		top = newTop;
		size++;
		return top;
	}
	
	void push(Node newTop){
		newTop.next=top;
		top=newTop;
		size++;
	}
	
	void delete(){
		pop();
	}
	
	int size(){
		return size;
	}
	
	void printStack(){
		if(top==null){
			System.out.println("Empty Stack");
			return;
		}
		
		Node tempNode = top;
	do {
		System.out.println(tempNode.val);
		tempNode = tempNode.next;
	} while (tempNode!=null);
		
	}
	
	class Node{
		int val;
		Node next;
		
		Node(int value){
			this.val = value;
			this.next = null;			
		}
	}

}
