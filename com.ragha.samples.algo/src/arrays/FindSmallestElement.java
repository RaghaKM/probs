package arrays;

import java.util.Scanner;

/* Using the same logic that I have used in leftShiftArraySearch (ShiftedArraySearch.java).
 *  
 * A sorted array of distinct integers shiftArr i
 */
public class FindSmallestElement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		int size;
		
		/*System.out.println("Size of the array");
		size = scn.nextInt();
		int[] shiftArr = new int[size];
		System.out.println("Enter the numbers");
		for (int i = 0; i < size; i++) {
			shiftArr[i] = scn.nextInt();
		}*/
		int[] shiftArr = {3,4,5,6,7,8,1,2};
		//System.out.println("Enter the Number to be found");
		//num = scn.nextInt();
		
		//if(num>shiftArr[0])
		
		System.out.println(shiftedArrSearch(shiftArr,0,shiftArr.length-1));// WRONG LOGIC
		System.out.println(findPivot(shiftArr, 0, shiftArr.length-1));

	}
	
	static int shiftedArrSearch(int[] arr, int left, int right){

		int mid = left + (right-left)/2;

			if(left>right) return -1;

			if(left==right) return left;

				if(arr[left]< arr[mid])
					return shiftedArrSearch(arr,mid + 1,right);//right = mid-1;
				else 
					return shiftedArrSearch(arr,left,mid-1);//left = mid + 1;
	}
	
	static int findPivot(int arr[], int low, int high)
    {
       // base cases
       if (high < low)  
            return -1;
       if (high == low) 
            return low;
        
       /* low + (high - low)/2; */
       int mid =  low + (high - low)/2;   
       if (mid < high && arr[mid] > arr[mid + 1])
           return mid;
       if (mid > low && arr[mid] < arr[mid - 1])
           return (mid-1);
       if (arr[low] >= arr[mid])
           return findPivot(arr, low, mid-1);
       return findPivot(arr, mid + 1, high);
    }
	
	
}