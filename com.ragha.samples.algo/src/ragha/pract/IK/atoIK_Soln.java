package ragha.pract.IK;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class atoIK_Soln {
    
	/*
	 * Complete the function below.
	 * When the problem is EASY, take 
	 */

	    static int atoiIK(String str) {
	    	char sign = 'x';
	    	String intVal = "";
	    	for(char x : str.toCharArray())//for(char x : Lists.charactersOf(str))//
	    	{
	    		if((x == '+' || x == '-')){ // use isSign
	    			//(sign=='+'||sign=='-') && 

	    			if((sign=='+'||sign=='-') && intVal!="")
	    				return  Integer.parseInt(Character.toString(sign)+intVal);
	    			else if(intVal!="") return Integer.parseInt(intVal);
	    			else if(sign=='x') sign = x;
	    			else sign ='x';
	    			continue;
	    		}
	    		
	    		if((Character.getType(x)==9)){ // OR try to minus 0 to get the ascii value. 
	    			intVal = intVal+x;
	    		}
	    	}
	    	
	    	if(intVal=="") 	return 0;
	    	
	    	System.out.println(sign+intVal);
	    	
	    	return Integer.parseInt(sign+intVal);
	    	}
	
	    
	    
	    public static void main(String[] args) throws IOException{
	       int  res = atoiIK("+a32+--42");
	        System.out.println(res);
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