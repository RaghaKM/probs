package sandWorkday;

/*Sorted Search, No Size: 
 * You are given an array-like data structure Listy 
 * which lacks a size method. It does, however, have an elementAt (i)
 *  method that returns the element at index i in 0(1) time. 
 *  If i is beyond the bounds of the data structure, it returns - 1. 
 *  (For this reason, the data structure only supports positive integers.) 
 *  Given a Listy which contains sorted, positive integers, find the index 
 *  at which an element x occurs. If x occurs multiple times, you may return any index.
 *  
 *  Solution thoughts: 
 *  Broot force : Find the number in linear. 
 *  2nd Sol: Find the size and then use binary. 
 *  
 *  */

public class SearchinSortedArrNoSize {

	public static void main(String[] args) {
	int[] arr = {2,3,4,5,7,23,25,26,27,34,36,38,39,41,42,45,46,47,49,52,55,57,59,61,64,69,72};
	int key = 36;
	
	if(arr[key]==key) 		System.out.println("Index is "+key);
	if(arr[0]==key)			System.out.println("Found at Zero");	
	
	//Find the array size or upper bound
	int size = fidnArrayUpperLim(arr,key);
	
	//Find the index
	System.out.println(  	binSearch(arr,0,size,key)		);
	
	}

	public static int 	fidnArrayUpperLim(int[] arr, int key){
	boolean flag = true;
	int power = 1;
		while(flag){
			if(key > arr[power])
				power = power*2;
			else {
				flag = false;
				 return power;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[] arr, int left,int right, int key){
		
		return -1;
	}
	
}
