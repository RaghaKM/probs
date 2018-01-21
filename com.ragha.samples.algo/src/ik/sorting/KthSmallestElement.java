package ik.sorting;

public class KthSmallestElement {
/*
 * Given N elements (Not sorted) How can we find out the Kth element?
 * 
 */
	static int[] array = {1,5,6,3,34,7,4};
	static int positionk = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k = 5;
		//System.out.println();
		findKthElement(0 , array.length-1);
		SortUtil.print(array);
	}

/*	kthElement(int start, int end){
		
	}*/
	
	static void findKthElement(int start, int end){
		
		if(start>end) return;
			
		int PI = partition(start,end);
/*System.out.println("PI "+PI );		
		if (PI==(positionk-1)) {
			System.out.println(positionk+"th element is "+array[PI]);
			return;
		}
		
		if(PI < (positionk-1)) findKthElement(start, PI-1);
		else findKthElement(PI+1,end);*/
		findKthElement(start, PI-1);
		findKthElement(PI+1,end);
	}
	
	static int partition( int start, int end){
		
		int pivot = start;
		int left = start+1;
		int rt = end;
		
		while(left< rt){

			while((left < end) && (array[left] < array[pivot] )) left++;
			while( (rt > start) && (array[rt] > array[pivot])) rt--;
			
			if(left < rt) SortUtil.swap(array, left, rt);
		}
		
		if(array[rt] < array[pivot])  SortUtil.swap(array, rt, pivot);
		
		return rt;
	}	
	
}
