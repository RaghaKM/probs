package arrays;

import java.util.Scanner;

/*Shifted Array Search

A sorted array of distinct integers shiftArr is shifted to the left by an unknown offset and you don�t have a pre-shifted copy of it. For instance, the sequence 1, 2, 3, 4, 5 becomes 3, 4, 5, 1, 2, after shifting it twice to the left.
Given shiftArr and an integer num, implement a function shiftedArrSearch that finds and returns the index of num in shiftArr. If num isn�t in shiftArr, return -1. Assume that the offset doesn�t equal to 0 (i.e. assume the array is shifted at least once) or to arr.length - 1 (i.e. assume the shifted array isn�t fully reversed).
Explain your solution and analyze its time and space complexities.

Example:
input:  shiftArr = [9, 12, 17, 2, 4, 5], num = 2 # shiftArr is the
                                                 # outcome of shifting
                                                 # [2, 4, 5, 9, 12, 17]
                                                 # three times to the left

output: 3 # since it�s the index of 2 in arr
Constraints:

[time limit] 5000ms
[input] array.integer arr
[input] integer num
[output] integer

Solution : 
https://articles.leetcode.com/searching-element-in-rotated-array/
*/
public class ShiftedArraySearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		int size;
		
		System.out.println("Size of the array");
		size = scn.nextInt();
		int[] shiftArr = new int[size];
		System.out.println("Enter the numbers");
		for (int i = 0; i < size; i++) {
			shiftArr[i] = scn.nextInt();
		}
		
		System.out.println("Enter the Number to be found");
		num = scn.nextInt();
		
		//if(num>shiftArr[0])
		
		System.out.println(shiftedArrSearch(shiftArr,num,0,0,shiftArr.length-1));

	}
	
	static int shiftedArrSearch(int[] arr, int key,int left, int mid, int right){
		//left = shiftArr[0];
		//right = shiftArr[shiftArr.length-1];
		
		
		while(left<right){
			mid = left + (right-left)/2;
			
			if(key==arr[mid]) return mid;
			//this IF is to check if the first half is sorted array. 
			//If the key is not in the sorted array where we can check logically, if not we assume its in second half.
			if(arr[left]<arr[mid]){
				if(arr[left]<= key && key < arr[mid])
					right = mid-1;
				else 
					left = mid + 1;
			}else{
				if(arr[mid]< key && key <= arr[right])
					left = mid + 1;
				else 
					right = mid-1;
			}
		}
		
		return -1;
	}
}