package ik.sorting;

import java.util.Scanner;

public class NutsNBolts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nuts = {3,2,5,4,1};
		int[] bolts = {2,5,1,4,3};

/*        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
        }
        in.close();*/
		
		quickSort(bolts,0,bolts.length-1);
		
	}
	
	
	public void quickSort(int[] bolts,int start,int end){
		int pivot = (start + end)/2;
		
		while(start > end) return;
		
		quickSort(start,pivot-1);
		quickSort(pivot+1,end);
		
	}
	
	public int partition(int st, int end){
		int pivot = (st + end)/2;
		
		while(st > end){
			
			
			
			
		}
		
		
		return pivot;
	}
	

}
