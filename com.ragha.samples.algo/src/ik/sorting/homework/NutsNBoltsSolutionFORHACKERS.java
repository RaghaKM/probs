package ik.sorting.homework;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NutsNBoltsSolutionFORHACKERS {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		// TODO Auto-generated method stub
		//String[] nuts = {"N3","N2","N5","N4","N1"};
		//String[] bolts = {"B2","B5","B1","B4","B3"};
		Scanner scanner = new Scanner(System.in);
		String nutStr = scanner.nextLine();
		//String nutStr = "N3,N2,N5,N4,N1";
		String boltStr = scanner.nextLine();
		//String boltStr = "B2,B5,B1,B4,B3";
		String[] nuts = nutStr.split(",");
		String[] bolts = boltStr.split(",");
		NutsNBoltsSolutionFORHACKERS solObj = new NutsNBoltsSolutionFORHACKERS();
		
		for(int i=0;i<nuts.length;i++){
			solObj.findMatchingBolt(nuts[i],bolts);
		}
    }
    
public void findMatchingBolt(String nut, String[] bolts){
	Integer nutNum = new Integer(nut.substring(1));
	int pivot = partition( nutNum,bolts);
	
	System.out.println(nut+""+bolts[pivot]);
}
	
	public int partition(int nut, String[] bolts){
		int pivot = nut;
		
		int left = 0;
		int right = bolts.length-1;

		while(left < right){
			
			if( left < bolts.length-1 && getNum(bolts[left]) < pivot ) 	left++;
			if( right > 0 && getNum(bolts[right]) > pivot ) 			right--; 
			
			if(left<right)
				swap(bolts,left,right);
		}
		
		return right;
	}
	
	public void swap(String[] bolts, int left, int right){
		String bolt = bolts[left];
		bolts[left] = bolts[right];
		bolts[right] = bolt;
	}
	
	public static int getNum(String nutOrBolt){
		return new Integer(nutOrBolt.substring(1));
		
	}
}