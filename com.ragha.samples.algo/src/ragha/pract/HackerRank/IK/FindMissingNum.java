package ragha.pract.HackerRank.IK;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindMissingNum {

	/*
	 * Complete the function below.
	 */

	    static int findMissingNumber(int[] intarr) {
	        int[] newArr = new int[intarr.length+2];
	        for(int i=0;i < intarr.length;i++){
	            newArr[intarr[i]] = intarr[i];
	        }
	        
	        for(int j=1;j < newArr.length;j++){
	            if(newArr[j]<=0)
	                return  j;
	            
	        }
	        return -9999;
	    }

public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    final String fileName = "ragha";//System.getenv("OUTPUT_PATH");
    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
    int res;
    
    int _intarr_size = 0;
    _intarr_size = Integer.parseInt(in.nextLine().trim());
    int[] _intarr = new int[_intarr_size];
    int _intarr_item;
    for(int _intarr_i = 0; _intarr_i < _intarr_size; _intarr_i++) {
        _intarr_item = Integer.parseInt(in.nextLine().trim());
        _intarr[_intarr_i] = _intarr_item;
    }
    
    res = findMissingNumber(_intarr);
    bw.write(String.valueOf(res));
    bw.newLine();
    
    bw.close();
}
}