package ik.recurssion.test;

public class reverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "Ragha";
		//String reversed = ;
 //System.out.println(reverseAstring(reverse.toCharArray(),0));
 	//printReverseString(reverse.toCharArray(),0);
 	System.out.println('A'^'B');
 	System.out.println('B'^3);
 	System.out.println(3^65);
	}

	public static String reverseAstring(char[] name,int i){
		//if(name.length==0) return null;
		if( name.length-i==1) return name[i]+"";
		
		return  reverseAstring(name,i+1) + name[i];
		
	}
	
	public static void printReverseString(char[] name,int i){
		//if(name.length==0) return null;
		if(i == name.length-1) { 
			System.out.print(name[i]);
		return;
		}
		
		printReverseString(name,i+1) ;
		 
		System.out.print(name[i]);
		
	}
	
}
