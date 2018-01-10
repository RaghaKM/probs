package practice.misc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class linearSearch {
    /*
     * Read input USING SCANNER method 
     * */
   /* public static void main(String args[] ) throws Exception {

    	int index = -1;
       
        //Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Enter M and N");
        int N = s.nextInt();
        int M = s.nextInt();
        
        System.out.println("Enter N ints");
        for (int i = 0; i < N; i++) {
            if(M==s.nextInt())
            	index = i+1;
        }
        System.out.println(index);
    	main2();
    }*/
    
    /*
     * Read input USING BUFFER READER method 
     * */
    public static void main(String args[] ) throws Exception{
    	 System.out.println("Enter new M and N");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int index = -1;
        System.out.println("Enter the size of the array");
        int N = Integer.parseInt(line);
        System.out.println("Enter the int to be found");
        int M = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
        	System.out.println("Enter"+(i+1)+"th Element");
            if(M==Integer.parseInt(br.readLine())) index = i+1;
        }
        System.out.println("");
    }
}