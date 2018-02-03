package ik.sorting;

import java.util.Arrays;

public class QuickSort_v2 {

	public static void main(String args[]){
		
		//int[] arr = {2,10,-5,7,3,11,40,9};
		//int[] arr = {1,3,4,2,9,6,5,11,3,2};
		//int[] arr = {1,3,2,9,6,7,8,5,9,3};
		//int[] arr = {13,1,2,3,4,5,6,7,8,9,10,11,12};
		//int[] arr = {12,11,10,9,8,7,6,5,4,3,2,1};
		//int[] arr = {1,4,2,9,6,5,11,3};
		int[] arr = {11,12,1,3,7,8,2,13};
		QuickSort_v2 qSort = new QuickSort_v2();
		
		SortUtil.print(arr);

		qSort.quickSort(arr,0,arr.length-1);
		SortUtil.print(arr);
	}

	void quickSort(int[] arr, int start, int end){
		
		if(start > end) return;
		
		int partitionIndex = partition(arr,start,end);
		//System.out.println(partitionIndex + "PI");
		//System.out.println("");
		//SortUtil.print(arr);
 		quickSort(arr,start,partitionIndex-1);
		quickSort(arr, partitionIndex+1, end);
	}
	
	int partition(int[] arr, int start, int end){
		//System.out.println("--Left-- "+start+"---Right- "+end);
		int left = start;
		int pivot = (start+end)/2;
		pivot = arr[pivot];
		int rt = end;
		
		while(left<= rt){
			//This will end up comparing all the way 
			//while((left < arr.length-1) && (arr[left] < arr[pivot] )) left++;
			//while((left < arr.length-1) && (arr[left] < arr[pivot] )) left++;
			while((arr[left] <= pivot ) ) left++; 
			while((arr[rt] > pivot) ) rt--;
			
			if(left < rt  ) SortUtil.swap(arr, left, rt);
			//System.out.println("Pivot : "+pivot);
			System.out.println(Arrays.toString(arr));
		}
		
		if(arr[rt] < pivot){  
			//System.out.println("---- "+pivot+"--Left-- "+left+"---Right- "+rt);
			//SortUtil.swap(arr, rt, pivot);
		}
		//SortUtil.swap(arr, rt, pivot);
		
		return rt;
	}
}