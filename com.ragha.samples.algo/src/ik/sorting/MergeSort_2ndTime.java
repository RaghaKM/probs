package ik.sorting;

import java.util.Iterator;
import java.util.Scanner;

public class MergeSort_2ndTime {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextLine());*/
		int[] arr = {1,3,4,2,9,6,5,11,3,2};
		int[] arrB = new int[arr.length];
		SortUtil.print(arr);
		System.out.println("================= AFTER SORTING ===============");
		mergeSort(arr,0,arr.length-1,arrB);
		SortUtil.print(arr);
	}
	
	public static void mergeSort(int[] arr, int start, int end,int[] arrB){

		if(start>=end) return;
		//int mid = start+(end-start)/2;
		int mid = (start+end)/2;
		
		mergeSort(arr,start,mid,arrB);
		mergeSort(arr,mid+1,end,arrB);
		
		merge(arr,start,mid,end,arrB);
	}
	
	public static void merge(int[] arr, int start, int mid, int end,int[] arrB){
		int leftPtr = start;
		int rightPtr = mid + 1;
		int j = start;
		//int[] arrB = new int[end-start+1];
		
		
		while( (leftPtr <= mid) && (rightPtr <= end) ){
			
			if(arr[leftPtr] > arr[rightPtr])
				arrB[j++] = arr[leftPtr++];
			else
				arrB[j++] = arr[rightPtr++];
		}
			while(leftPtr<=mid){
				arrB[j++] = arr[leftPtr++];
			}
			
			while(rightPtr<=end){
				arrB[j++] = arr[rightPtr++];
			}
		
		//Copy the merged array to the orginal array
		copy(arr,arrB,start,end);
		
		
	}
	
	public static void copy(int[] arr, int[] arrB,int start,int end){
		int j = start;
	/*	for (int i=start;i<end;i++) {
			arr[start++] = arrB[start];			
		}*/
		while(start<=end)
			arr[start++] = arrB[j++];
		
		//SortUtil.print(arr);
	}
	
}
