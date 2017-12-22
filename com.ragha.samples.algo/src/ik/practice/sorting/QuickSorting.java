package ik.practice.sorting;

import ik.practice.sorting.QuickSort_v2;
import ik.practice.sorting.SortUtil;

public class QuickSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {2,10,-5,7,3,11,40,9};
		//int[] arr = {1,3,4,2,9,6,5,11,3,2};
		int[] arr = {1,3,2,9,6,7,8,5,9,3};
		//int[] arr = {13,1,2,3,4,5,6,7,8,9,10,11,12};
		//int[] arr = {12,11,10,9,8,7,6,5,4,3,2,1};
		//int[] arr = {1,4,2,9,6,5,11,3};
		//int[] arr = {12,3,7,8,2};
		
		SortUtil.print(arr);

		QuickSorting.quickSort(arr,0,arr.length-1);
		SortUtil.print(arr);
		System.out.println("===============================");
		QuickSorting.revSort(arr,0,arr.length-1);
		SortUtil.print(arr);

	}
	
	/*
	 * ~ 10:26
	Time Complexity
		BestCase n.log(n)
		WorstCase : nxn (Ex: when the entire array is reverse sorted)
	
	Space Complexity : 
		Best case is log(n)
		worst case is "n"
	
		*/
		
	public static void quickSort(int[] intArr, int start, int end){

	//System.out.println("Start: "+start+ "   End : " +end);
		
		if(start>end) return;

		int partitionIndex = partition(intArr,start,end);
		quickSort(intArr,start,partitionIndex-1);
		quickSort(intArr,partitionIndex+1,end);
		
	}
		
	static int partition(int[] array, int start, int end){
		int left = start+1;
		int pivot = start;
		int right = end;
		
		while(left < right){
			while((left < array.length) && (array[left] < array[pivot]) ) left++;
			while( (right > 0) && (array[right] > array[pivot]) ) right--;
			
			if(left<right) SortUtil.swap(array,left,right);
		}
		if(array[right] < array[pivot])
			SortUtil.swap(array,pivot,right);
		//System.out.print("Pivot "+pivot+" -- "+"start "+start+" -- "+"End "+end+" -- ");
		SortUtil.print(array);
		return right;
	}
	
	
	public static void revSort(int[] intArr, int start, int end){

	//System.out.println("Start: "+start+ "   End : " +end);
		
		if(start>end) return;

		int partitionIndex = RevPartition(intArr,start,end);
		revSort(intArr,start,partitionIndex-1);
		revSort(intArr,partitionIndex+1,end);
		
	}
		
	static int RevPartition(int[] array, int start, int end){
		int left = start+1;
		int pivot = start;
		int right = end;
		
		while(left < right){
			while((left < array.length) && (array[left] > array[pivot]) ) left++;
			while( (right > 0) && (array[right] < array[pivot]) ) right--;
			
			if(left < right) SortUtil.swap(array,left,right);
		}
		if(array[right] > array[pivot])
			SortUtil.swap(array,pivot,right);
		//System.out.print("Pivot "+pivot+" -- "+"start "+start+" -- "+"End "+end+" -- ");
		SortUtil.print(array);
		return right; 
	}
	


}
