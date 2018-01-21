package sandWorkday;

import ik.sorting.SortUtil;

import java.awt.print.Printable;

public class PushZeroes {

/*	Q: Given a list 1,0,3,5,0,0,34,5,0,36 push all the zeroes to the end. Develop an in-place algorithm
	Soln: */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,3,5,0,0,34,5,0,36};
		SortUtil.print(arr);
		//pushZeroes(arr);
		moveZeroes(arr);
		SortUtil.print(arr);
	}
	private static void pushZeroes(int[] arr) {
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[pos] = arr[i];
				pos++;
			}
		}
		for (int i = pos; i < arr.length; i++)
			arr[i] = 0;
	}
	
	
	private static void moveZeroes(int[] arr) {
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			
			if(pos<0 && arr[i]==0 ){
				pos=i;
			}
			
			if (arr[i] != 0 && pos >=0) {
				
				arr[pos] = arr[i];
				arr[i] = 0;
				pos ++;
			}

		}
	/*	for (int i = pos; i < arr.length; i++)
			arr[i] = 0;
			*/

	}
	
}
















/*

private static void pushZeroes(int[] arr) {
	int pos = 0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] != 0) {
			arr[pos] = arr[i];
			pos++;
		}

	}
	for (int i = pos; i < arr.length; i++)
		arr[i] = 0;

}*/