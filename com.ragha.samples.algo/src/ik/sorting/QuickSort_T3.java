package ik.sorting;

public class QuickSort_T3 {

	public static void main(String[] args) {
		int[] arr = {11,12,1,3,7,8,2,13};
		SortUtil.print(arr);
		sortArr(arr,0,arr.length-1);
		System.out.println("===================");
		SortUtil.print(arr);
	}
	
	//public static void sortArr(int[] arr,int pivot, int left, int right){
	public static void sortArr(int[] arr, int left, int right){
		if(left>right) return;

		int pivotIndex = partition(arr,left,right);

		sortArr(arr, left, pivotIndex-1);
		sortArr(arr, pivotIndex+1, right);
	}
	
	public static void swap(int[] arr,int left,int right){
		int temp 	= arr[left];
		arr[left] 	= arr[right];
		arr[right] 	= temp;
	}
	
	public static int partition(int[] arr, int start, int end){
		int left = 0; //left = 0 ;// 
		int right = end;
		int pivot = (start+end)/2;
		
		while(left<right){
			while(arr[left]<arr[pivot] && left < end) left++;
			while(arr[right]>arr[pivot] && right > start) right--;
			
			if(left<right) swap(arr,left,right);
		}
		
		if(arr[right]<arr[pivot])//???
			swap(arr,right,pivot);
			
		return right;
	}
}