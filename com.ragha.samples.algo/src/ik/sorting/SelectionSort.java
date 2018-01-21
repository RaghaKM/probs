package ik.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = {3,6,8,4,2,5,6,34,1,32};
		
	System.out.println("Array before Sorting");
		printIntArry(input);
		if(input!=null && input.length>1)
			selectionSortBF(input);
		
		System.out.println("Array after Sorting");	
		printIntArry(input);
	}
	
	static void selectionSortBF(int[] input){
		int minIndex =0;
		int temp;
		
		for (int i = 0; i < input.length; i++) {
			minIndex =i;
			for (int j = i; j < input.length; j++) {
				if(input[j]<input[minIndex])
					minIndex = j;
			}
			temp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = temp;
			//printIntArry(input);
		}
	}
	
	static void printIntArry(int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("->"+arr[i]);
		}
		System.out.println();
	}

}