package ik.practice.sorting;

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
		System.out.println(findKthElement(0 , array.length-1));
		
	}

	static int findKthElement(int start, int end){
		
		int PI = partition(start,end);
		
		if (PI==(positionk-1))
			return array[positionk];
		
		if(PI < (positionk-1)) findKthElement(PI+1,end);
		else findKthElement(start, PI-1);
		
		return -1;
	}
	
	static int partition( int left, int rt){
		
		int pivot = left;
		
		while(left< rt){

			while((left < array.length-1) && (array[left] < array[pivot] )) left++;
			while( (rt > 0) && (array[rt] > array[pivot])) rt--;
			
			if(left < rt) SortUtil.swap(array, left, rt);
		}
		
		if(array[rt] < array[pivot])  SortUtil.swap(array, rt, pivot);
		
		return rt;
	}	
	
}
