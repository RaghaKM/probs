package ik.concurrency;

import java.util.concurrent.locks.Lock;

public class DiningPhilosophers {
	
	static int[] c = {0,0,0,0,0}; //Chopsticks
	static int[] phil = {0,0,0,0,0}; //philosophers
	static Lock[] locks = new Lock[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < phil.length; i++)	
	System.out.println(c[(c.length-i)%(c.length+1)]+" -- "+i);
	}
	
	
	
	
	void eat(int i){
		int philosopher = phil[i];
		int ch1 = c[(i-1)%(c.length+1)];
		int ch2 = c[i];
		
		if(ch1==0 && ch2==0) {
			c[(i-1)%(c.length+1)] = 1;
			c[i] = 1; 
		}
		
		if(ch1==0)
			
		
		phil[i] = 1;
		
	}
	
	void wait(int i){
		int philosopher = phil[i];
		int ch1 = c[(i-1)%c.length];
		
		phil[i] = 1;
		
	}
	
}