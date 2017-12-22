package ik.recurssion.test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOfInt_test {


	/*
	 * Complete the function below.
	 */

	//Base case 1 : 
	//Base Case 2 : 
	//Time complexity is 2^n.
	
	
	    static boolean groupSum(int[] a, int i) {
		    	
		    	//System.out.println("i:"+i+" a : ");
		    	
		    	if(i==a.length) System.out.println(a);
		    	
		    	for(int j=i;j<a.length;j++){
		    		swap(a,i,j);
		    		PrintPerm(a,i+1);
		    	    //swap(a,i,j);
		    	
		    }
		    	return false;

	    }
	
	    static void swap(int[] intArr, int from,int to){
	    	int temp;
	    	
	    	temp = intArr[from];
	    	intArr[from] = intArr[to];
	    	intArr[to] = temp;
	    }
	    
	   static void PrintPerm(int[] a, int i){
	    	
	    	//System.out.println("i:"+i+" a : ");
	    	
	    	if(i==a.length) System.out.println(a);
	    	
	    	for(int j=i;j<a.length;j++){
	    		swap(a,i,j);
	    		PrintPerm(a,i+1);
	    	    //swap(a,i,j);
	    	}
	    }
	    
	   public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        boolean res;
	        
	        int _IntArr_size = 0;
	        _IntArr_size = Integer.parseInt(in.nextLine().trim());
	        int[] _IntArr = new int[_IntArr_size];
	        int _IntArr_item;
	        for(int _IntArr_i = 0; _IntArr_i < _IntArr_size; _IntArr_i++) {
	            _IntArr_item = Integer.parseInt(in.nextLine().trim());
	            _IntArr[_IntArr_i] = _IntArr_item;
	        }
	        
	        int _iTarget;
	        _iTarget = Integer.parseInt(in.nextLine().trim());
	        
	       // res = groupSum(_IntArr, _iTarget);
	        int[] input = {1,2,3,4,6,9} ;
	        res = groupSum(input,10);
	        bw.write(String.valueOf(res ? 1 : 0));
	        bw.newLine();
	        
	        bw.close();
	    }
	
}
