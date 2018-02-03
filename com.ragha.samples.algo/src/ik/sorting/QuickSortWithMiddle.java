package ik.sorting;

import java.util.Arrays;

public class QuickSortWithMiddle {

	public static void main(String[] args) {
		//int[] arr = { 7, 4, 5, 1, 2, 6, 9, 3 };
		//int[] arr = {11,12,1,3,7,8,2,13};
		//int[] arr = {2,10,-5,7,3,11,40,9};
		//int[] arr = {1,3,4,2,9,6,5,11};
		int[] arr = {1,2,6,7,8,5,9,3};
		//int[] arr = {13,1,2,3,4,5,6,7,8,9,10,11,12};
		//int[] arr = {12,11,10,9,8,7,6,5,4,3,2,1};
		//int[] arr = {1,4,2,9,6,5,11,3};
		quicksort(arr, 0, arr.length - 1);
		System.out.println("output " + Arrays.toString(arr));
	}

	static int partition(int[] arr, int start, int end)
	{
		int pivot = arr[(start+end)/2];
		int i = start ;
		int j = end;
		while (i < j) {
			while (i < end && arr[i] < pivot)
				i++;
			while (j > start && arr[j] > pivot)
				j--;
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
//				i++;
//				j--;
			}
		}

/*		if (arr[j] < arr[start]) {
			int temp = arr[start];
			arr[start] = arr[j];
			arr[j] = temp;
		}*/

		System.out.println(Arrays.toString(arr));
		return j;

	}

	static void quicksort(int[] arr, int start, int end) {
		int p1;
		if (start < end) {
			p1 = partition(arr, start, end);
			quicksort(arr, start, p1 - 1);
			quicksort(arr, p1 + 1, end);
		}
	}
}
