package sandWorkday;

import java.util.Arrays;

public class QuickSortWithMiddle {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 5, 1, 2, 6, 9, 3 };
		quicksort(arr, 0, arr.length - 1);
		System.out.println("output " + Arrays.toString(arr));
	}

	static int partition(int[] arr, int start, int end)
	{
		int pivot = arr[start];
		int i = start + 1;
		int j = end;
		while (i <= j) {
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

		if (arr[j] < arr[start]) {
			int temp = arr[start];
			arr[start] = arr[j];
			arr[j] = temp;
		}

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
