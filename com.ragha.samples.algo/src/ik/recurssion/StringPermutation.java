package ik.recurssion;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringPermutation {
    
	/*
	 * Complete the function below.
	 * When the problem is EASY, take 
	 */

	    void  permutation(String prefix,String restOfIt) {
	   
	    	//String  = "";

	    		
	    		if(restOfIt.length()==1) System.out.println(prefix+restOfIt);


	    	}
	
	    boolean findDictWordImprovedPerformance(char[] a, int i){
	    	if(i==a.length){
	    			System.out.println(a);
	    			return true;
	    	}
	    	
	    	
	    	for(int j=i;j<a.length;j++){ 
	    		swap(a,i,j);
	    		if( validPrefix(a,i) && findDictWordImprovedPerformance(a , i+1)) {
	    	   	swap(a,i,j);
	    			return true; //We are exiting from further recurssions
	    		}
	    	}
	    	return false;
	    }
	    
	    
	 boolean validPrefix(char[] a,int i){
		 return validWord(a,i);
	    	
	    }    
	    
	boolean validWord(char[] a,int i){
		
		if(a.equals("BAD")) return true;
		
		return false;
	}
	    
	    
/*	    boolean findDictWord(char[] a, int i){
	    	if(i==a.length){ System.out.println(a);
	    		if(validWord(a,a.length)){
	    			System.out.println(a);
	    			return true;
	    		}
	    		return false;
	    	}
	    	for(int j=i;j<a.length;j++){
	    		swap(a,i,j);
	    		if(findDictWord(a , i+1)) return true; //We are exiting from further recurssions
	    	swap(a,i,j);
	    	}
	    }*/
	    
	    void PrintPerm2(char[] a, int i){
	    	if(i==a.length) System.out.println(a);
	    	
	    	for(int j=i;j<a.length;j++){ 
	    		//if( (i<3 && isConsonant(a[j]) || (I>=3) )
	    		swap(a,i,j);
	    		PrintPerm2(a,i+1);
	    	swap(a,i,j);
	    	}
	    }	    
	    
	    
	    void PrintPerm(char[] a, int i){
	    	
	    	//System.out.println("i:"+i+" a : ");
	    	
	    	if(i==a.length) System.out.println(a);
	    	
	    	for(int j=i;j<a.length;j++){
	    		swap(a,i,j);
	    		PrintPerm(a,i+1);
	    	    //swap(a,i,j);
	    	}
	    }
	    
	    void swap(char[] charArr, int from,int to){
	    	char temp;
	    	
	    	temp = charArr[from];
	    	charArr[from] = charArr[to];
	    	charArr[to] = temp;
	    }
	    
	    
	    
	    
	    public static void main(String[] args) throws IOException{
	    	String actualStr = "bdef";
	    	//permutation(actualStr.substring(0,1),actualStr.substring(1, length-1));
	    	StringPermutation sp = new StringPermutation();
	    	sp.PrintPerm(actualStr.toCharArray(), 0);
	        //System.out.println(res);
	    	  /*    Scanner in = new Scanner(System.in);
	       // final String fileName = System.getenv("OUTPUT_PATH");
	    //    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int res;
	        String _str;
	        try {
	            _str = in.nextLine();
	        } catch (Exception e) {
	            _str = null;
	        }
	        
	        res = atoiIK("42");
	        System.out.println(res);
	        //   res = atoiIK(_str);
	      bw.write(String.valueOf(res));
	        bw.newLine();
	        
	        bw.close();*/
	    }
	}