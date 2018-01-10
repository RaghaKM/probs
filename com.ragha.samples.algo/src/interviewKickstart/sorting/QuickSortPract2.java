package interviewKickstart.sorting;

public class QuickSortPract2 {

	public static void main(String[] args) {
	int[] arr = {1,3,4,2,9,6,5,11,3,2};
	print(arr);
	quickSort(arr,0,arr.length-1);
	print(arr);
	}
	
	public static void quickSort(int[] arr,int left, int right){
		
		if(left>right)return;
		int pivot = calcPivot(arr,left,right);		
		quickSort(arr,left,pivot-1);
		quickSort(arr,pivot+1,right);
	}

	public static int calcPivot(int[] arr, int start,int end){
		int left = start+1;
		int pivot = start;
		int right = end;
		
		while(left<right){
		
			while(left < end && arr[left] < arr[pivot]) left++;
			while(right > start && arr[right] > arr[pivot]) right--;
			
			if(left<right) swap(arr,left,right);
		}
		
		//if(arr[right]<arr[pivot]) swap(arr,pivot,right);
		
		print(arr);
		
		return right;
	}
	
	public static void swap(int[] arr,int first,int sec){
		int temp = arr[first];
		arr[first] = arr[sec];
		arr[sec] = temp;
	}
	
	public static void print(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("=====================");
	}
	
}