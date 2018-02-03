package ik.sorting.homework;

import java.util.Comparator;
import java.util.Scanner;

public class NutsNBolts_V2 {

	public static void main(String[] args) {
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
		NutsNBolts_V2 obj = new NutsNBolts_V2();
		
		for(int i=0;i<nuts.length;i++){
			obj.findMatchingBolt(nuts[i],bolts);
		}
	}

public void findMatchingBolt(String nut, String[] bolts){
	Integer nutNum = new Integer(nut.substring(1));
	int pivot = partition( nutNum,bolts);
	
	System.out.println(nut+"-"+bolts[pivot]);
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
	
	public int compareStr(String nut,String bolt){

	    	Integer nutNum = new Integer(nut.substring(1));
	    	Integer boltNum = new Integer(bolt.substring(1));
	    	
	        if(nutNum > boltNum) return 1;
	        else if(nutNum < boltNum) return -1; 
	        return 0;
	}
	
	class NutRBolt{
		String nutRbolt;
	}

	class mycomp implements Comparator<NutRBolt>
	{
	    public int compare(NutRBolt nut,NutRBolt bolt)
	    {
	    	Integer nutNum = new Integer(nut.nutRbolt.substring(1));
	    	Integer boltNum = new Integer(bolt.nutRbolt.substring(1));
	    	
	        if(nutNum > boltNum) return 1;
	        else if(nutNum < boltNum) return -1; 
	        return 0;
	    }
	}
}