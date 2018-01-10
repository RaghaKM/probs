package ik.datastructures;

import java.util.Scanner;

public class MinStack1 {
	public static ik.datastructures.Stack minStack = new ik.datastructures.Stack();
	public static ik.datastructures.Stack stack = new ik.datastructures.Stack();
	
	public static void main(String[] args) {
	int[] stackElements = {19,5,7,43,3,4,86,45,2,45,15,98,3,3,2};
	
/*		for (int i = 0; i < stackElements.length; i++) {
			stack.push(stackElements[i]);
		}*/
		MinStack1 minStackImpl = new MinStack1();
		minStackImpl.runMinStack();
	}
	
	void runMinStack(){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int option = 0;
		//Stack stack = new Stack();
		
		stack.printStack();
		
		do {
			System.out.println("Please enter the your choice: \n 1: pop --  2: push --  3: size --  4: peak --  5: isEMpty -- 6: min -- 7: print --  '10' TO EXIT");
			
			switch (sc.nextInt()) {
			case 1:
				pop();
				break;

			case 2:
				System.out.println("Enter element to be inserted");
				push(sc.nextInt());				
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
				
			case 6:
				System.out.println("Min element is: "+min());
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
	
	void pop(){
		int popedVal = stack.popedVal();
		System.out.println("Poped element : "+ popedVal + " New Top element : "+(stack.peakVal()));
		/*Managing Min Stack*/
		if(popedVal==minStack.peakVal())
				minStack.pop();	
	}
	
	void push(int valToPush){
		stack.push(valToPush);
		
		/*Managing Min Stack*/
		if(minStack.isEmpty() || (valToPush <= minStack.peakVal()) )
			minStack.push(valToPush);	
	}
	
	int min(){
		return minStack.peak().val;
	}
	
}
