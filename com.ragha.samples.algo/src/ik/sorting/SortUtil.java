package ik.sorting;

public class SortUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void print(int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(i+" - "+arr[i]);
			System.out.print(arr[i]+"      ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr, int from,int to){
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}
}