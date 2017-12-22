package interviewKickstart.sorting;

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
		findKthElement(0 , array.length-1);
		
	}

	static int findKthElement(int start, int end){
		
		int PI = partition(start,end);
		
		if (PI==(positionk-1))
			return array[positionk];
		
		if(PI>(positionk-1)) findKthElement(PI+1,end);
		else findKthElement(start, PI-1);
		
		return -1;
	}
	
	static int partition(int start, int end){
		
		return 0;
	}
	
}
