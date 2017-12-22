package ik.practice.sorting;

public class MergingTwoSortedArrays {

	/*
	 * You're given two sorted arrays: 
	1. Array 1, size 'N', which has N sorted positive integers 
	2. Array2, size '2N' (twice the size of first), which also has only N sorted positive integers in its first half. Second half of this array is empty. (Empty elements are marked by 0). 

		Write a function that takes these two arrays, and merges the first one into second one, resulting in one fully sorted array of 2N elements. 

	Constraints: You can use only constant extra space. Need a linear solution. Repeats are allowed. Only positive non-zero integers are found in input. O denotes an empty space. 

	(Expected interview time: 20 minutes) 
	 */
	static int[] array1 = {1,2,3,4,5};
	static int[] array2 = {23,24,36,58,55,0,0,0,0,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortUtil.print(array2);
		mergeSortedArrays();
	}
	
	static void mergeSortedArrays(){
		int fElement, sElement;
		int Fi=array1.length-1,Sj = array1.length-1;
		//int index2 = array2.length-1;
		for (int i = array2.length - 1; i >= 0 ; i--) {

			if(Fi<0) fElement = Integer.MIN_VALUE;
			else fElement = array1[Fi];
			
			if(Sj<0) sElement = Integer.MIN_VALUE;
			else sElement = array2[Sj];
			
			if(fElement > sElement)
			{
				array2[i] = fElement;
				Fi--;
			}
			else{
				array2[i] = sElement;
				Sj--;
			}
		}
		SortUtil.print(array2);
	}
	
}