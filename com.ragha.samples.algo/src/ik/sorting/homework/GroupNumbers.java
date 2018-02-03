package ik.sorting.homework;

import java.util.Arrays;

public class GroupNumbers {
//Trying to keep the input order
	public static void main(String[] args) {
		//int[] arr = {2,10,-5,7,3,11,40,9};
		//int[] arr = {1,3,4,2,9,6,5,11,3,2};
		int[] arr = {1,3,2,9,6,7,8,5,9,3};
		//int[] arr = {13,1,2,3,4,5,6,7,8,9,10,11,12};
		//int[] arr = {12,11,10,9,8,7,6,5,4,3,2,1};
		//int[] arr = {1,4,2,9,6,5,11,3};
		//int[] arr = {12,3,7,8,2};
	System.out.println(Arrays.toString(groupNumbers(arr)));
	}

    static int[] groupNumbers(int[] intArr) {
    	int pos=0;
    	int temp;
    	for(int i=0;i<intArr.length;i++){
    		if(intArr[i]%2==0){
    			temp = intArr[i];
    			intArr[i] = intArr[pos];
    			intArr[pos] = temp;
    			pos++;
    		}
    	}
    	return intArr;
    }
}