package ragha.pract.HackerRank.IK;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsPalindrome {

	/*
	 * Complete the function below.
	 */

	    static int isPalindrome(String str) {
	    	
	    }

public static void main(String[] args) throws IOException{   Scanner in = new Scanner(System.in);
final String fileName = System.getenv("OUTPUT_PATH");
BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
boolean res;
String _strarr;
try {
    _strarr = in.nextLine();
} catch (Exception e) {
    _strarr = null;
}

res = isPalindrome(_strarr);
bw.write(String.valueOf(res ? 1 : 0));
bw.newLine();

bw.close();}
}