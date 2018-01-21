package ik.sorting;

import java.util.Arrays;
import java.util.Collections;

public class MiscSorts {

	//TRY Arrays sorting methods.
	public static void main(String[] args) {
		Integer[] givenArr = {3,4,6,2,9,34,87,91,2,6,8,65,86,71,33};
		int[] givenIntArr = {3,4,6,2,9,34,87,91,2,6,8,65,86,71,33};
		print(givenArr);
		Arrays.sort(givenArr,Collections.reverseOrder());
		Arrays.sort(givenIntArr);
		print(givenArr);
	}

	public static void print(int[] arr){
		System.out.println("Array Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println("-");
	}
	
	public static void print(Integer[] arr){
		System.out.println("Array Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println("-");
	}
}