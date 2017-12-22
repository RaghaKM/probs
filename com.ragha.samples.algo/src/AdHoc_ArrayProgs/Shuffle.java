package AdHoc_ArrayProgs;

import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int[] randomShuffle(int[] a){
		int n = a.length;
		int j;
		Random r = new Random();
		for(int i=0;i<n;i++){
			j = r.nextInt(n-i);
			swap(a,i,j+i);
		}
		return a;
	}
	
	void swap(int [] a, int i, int j){
		int temp = a[i];
		a[i] =  a[j];
		a[j] = temp;
	}
	
	int[] unSureShuffle(int[] a){
		int n = a.length;
		int j;
		Random r = new Random();
		for(int i=0;i<n;i++){
			j = r.nextInt(n);
			swap(a,i,j);
		}
		return a;
	}
	

}
