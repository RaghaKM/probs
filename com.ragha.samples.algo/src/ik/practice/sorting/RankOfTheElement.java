package ik.practice.sorting;

public class RankOfTheElement {

	/*
	 * This problem is same as Kth smallest element. solved in KthSmallestElement.java
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * ~ 10:40
	Time Complexity
		BestCase n.
		WorstCase : nxn (Ex: when the entire array is reverse sorted)
	
		*/
		
	void QuickSort(int[] intArr, int start, int end){
		
		if(start>end) return;
		
		int PI = partition(intArr,start,end);// PI = PartitionIndex;
		QuickSort(intArr,start,PI-1);
		QuickSort(intArr,PI+1,end);
		
	}
	
/*	rankTheElement(){
		
	}*/
	
		
	int partition(int[] array, int start, int end){
		int left = start+1;
		int pivot = start;
		int right = end;
		
		while(left<right){
			while(array[left]<pivot) left++;
			while(array[right]>pivot) right++;
			if(left<right) swap (array,left,right);
		}
	
		swap(array,start,right);

		return right; //y right
		
	}
	
	void swap(int[] array, int start,int end){
		
		
	}

}
