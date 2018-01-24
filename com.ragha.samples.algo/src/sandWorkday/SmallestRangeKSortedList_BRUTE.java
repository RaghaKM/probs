package sandWorkday;

/*Given K sorted integer arrays filled on average with N elements, 
 * how do you find a minimal span of numbers that contain at least one number from each 
 * array (inclusive of the boundaries).
	https://www.geeksforgeeks.org/find-smallest-range-containing-elements-from-k-lists/
	
	Naive approach : The idea is to maintain pointers to every list using array ptr[k].Below are the steps :

	Initially the index of every list is 0,therefore initialize every element of ptr[0..k] to 0;
	Repeat the following steps until atleast one list exhausts :
	Now find the minimum and maximum value among the current elements of all the list pointed by the ptr[0…k] array.
	Now update the minrange if current (max-min) is less than minrange.
	increment the pointer pointing to current minimum element.

*/
public class SmallestRangeKSortedList_BRUTE {

	public static void main(String[] args) {

	}
	
}