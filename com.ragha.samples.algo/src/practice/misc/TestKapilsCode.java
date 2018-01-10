package practice.misc;

import java.util.Hashtable;

public class TestKapilsCode {

	public static void main(String[] args) {
	   	Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();

	       Integer alpha = new Integer(1);
	       Integer foo = new Integer(1);

	       table.put(alpha,alpha);

	       if(table.contains(foo)){
	      //  System.out.println("Adding foo...");
	       //	table.put(foo,foo);
	    	   
	    	   System.out.println(table.get(foo).intValue());
	       }else{
	       	System.out.println("Table size : " + table.size());
	       }
	   }
}