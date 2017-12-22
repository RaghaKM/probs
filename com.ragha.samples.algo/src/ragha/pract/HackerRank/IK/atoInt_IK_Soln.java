package ragha.pract.HackerRank.IK;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class atoInt_IK_Soln {
    
	/*
	 * Complete the function below.
	 * When the problem is EASY, take 
	 */

	    static int atoiIK(String str) {

	    	char sign = ')';
	    	String intVal = "";
	    	for(char x : str.toCharArray())//for(char x : Lists.charactersOf(str))//
	    	{
	    		if((x == '+' || x == '-')){ // use isSign

	    			if((sign=='+'||sign=='-') && intVal!="")
	    				return  Integer.parseInt(Character.toString(sign)+intVal);
	    			else if(intVal!="") return Integer.parseInt(intVal);
	    			else sign = x;
	    			//else sign =')';
	    			continue;
	    		}else if((Character.getType(x)==9)){ // OR try to minus 0 to get the ascii value. 
	    			intVal = intVal+x;
	    		}else if(intVal!="") { 
	    				if(intVal!="" && sign!=')') return Integer.parseInt(sign+intVal);
	    			System.out.println(sign+intVal);
	    			return Integer.parseInt(intVal);
	    		}
	    	}
	    	
	    	if(intVal!="" && sign==')') return Integer.parseInt(intVal);
	    	
	    	if(intVal=="") 	return 0;
	    	
	    	System.out.println(sign+intVal);
	    	
	    	return Integer.parseInt(sign+intVal);
	    	}
	
	    
	    static int atoiIK2(String str) {

	    	char sign = ')';
	    	String intVal = "";
	    	char[] output = new char[str.length()];
	    	for(char x : str.toCharArray())//for(char x : Lists.charactersOf(str))//
	    	{

	    	}
	    	
	    	if(intVal!="" && sign==')') return Integer.parseInt(intVal);
	    	
	    	if(intVal=="") 	return 0;
	    	
	    	System.out.println(sign+intVal);
	    	
	    	return Integer.parseInt(sign+intVal);
	    	}  
	    
	    
	    public static void main(String[] args) throws IOException{
	       int  res = atoiIK(")");
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