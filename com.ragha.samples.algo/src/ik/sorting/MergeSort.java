package ik.sorting;

public class MergeSort {
static int[] array = {12,11,10,9,8,7,6,5,4,3,2,1};
static int[] array2 = {1,3,4,2,9,6,5,11,3,2};
	public static void main(String[] args) {
		SortUtil.print(array);
		mergeSort(0,array.length-1);
		SortUtil.print(array);
	}

	static void mergeSort(int start, int end){

		if((start >= end) ) return;

		int mid = (start+end)/2;
		mergeSort(start,mid);
		mergeSort(mid+1,end);

		merge(start,mid,end);
	}
	
	static void merge(int st,int mid,int end){
		int left = st;
		int right = mid+1;
		int k = 0;
		int[] tempArray = new int[end-st+1];
		
		//Sunny's while loop
		while ( left<=mid && right <= end) {
			
			if(array[left] < array[right]){
				tempArray[k++] = array[left++];
			}
			else tempArray[k++] = array[right++]; 
		}
		
		//Copy left over items from Left array to Temp Array
		while(left<=mid){
			tempArray[k++] = array[left++];
		}
		
		//Copy left over items from right array to Temp Array
		while(right<=end){
			tempArray[k++] = array[right++];
		}
		//End of Sunny's while loop
		
		//Replacement code for while with one for
		
/*		for (int i = 0; i < tempArray.length; i++) {
			if((left >mid )){
				tempArray[i] = array[right++];
			} else	if(right > end){
				tempArray[i] = array[left++];
			}
			else if(array[left] < array[right]){
				tempArray[i] = array[left++];
			}else{
				tempArray[i] = array[right++];
			}
		}*/
		copy(tempArray, st, end);
	}
	
	static void copy(int[] B, int st, int end){
		for (int i = 0; i < B.length; i++) {
			array[st++]=B[i];
		}
	}

}