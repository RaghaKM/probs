package ik.sorting;

public class HeapSort_Min {
	public static int arr[] = {12, 11, 13, 5, 6, 7,10};
	public static void main(String[] args) {
		  printArray(arr);
		  heap_Sort(arr);
		  printArray(arr);
	}

	 static void printArray(int arr[])
	 {
	     int n = arr.length;
	     for (int i=0; i<n; ++i)
	         System.out.print(arr[i]+" ");
	     System.out.println();
	 }
	
	public static void heap_Sort(int[] arr){
		int n = arr.length;
		for(int i=n/2-1;i>=0;i--)
			heapify(i,n);
		System.out.println("================================");
		//for(int j=n-1;j>=0;j--){
		for(int j=n-1;j>=0;j--){
			delete(j);
		}
	}
	
	public static void delete(int j){
		swap(0, j);
		heapify(0,j);
	}
	
	public static void heapify(int i,int n){
		int l = 2*i+1;
		int r = 2*i+2;
		// This commented section will do the same as the rest of this method
		/*int min = min(i,l,r);
		if(min!=i){
			swap(i,min);
			heapify(min);
		}
		//In other words its swap(i,min(i,l,r))
		*/
		
		int min = i;
		
		System.out.println("i "+i+"  l: "+l+"  r: "+r);
		
		if(r < n && arr[r]<arr[min]) {
			min = r;
		}
		
		if(l < n && arr[l]<arr[min]) {
			min = l;
		}
		
		if(min!=i){
			swap(i,min);
			heapify(min,n);
		}
	}
	
	public static void swap( int l, int r){
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
	
	public static int min(int a, int b, int c){
		return Math.min(a, Math.min(b, c));
	}
	
}