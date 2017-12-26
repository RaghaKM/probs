package sandWorkday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/* https://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/

The first solution is O(nlogn) to O(n^2) depending on the sort algo we use
Second solution has HashMapj(Pre requisite is : Range fo the number is known), need to understand the same

Second Solution : https://ide.geeksforgeeks.org/0KVsXK
import java.util.Set;
import java.util.HashSet;

class PairSum
{
	private static void printpairs(double target, double...arr) {

		Set<Double> compliments = new HashSet<>();
		for (int i = 0; i<arr.length; i++) {
			
			double compliment = target - arr[i];
			if (compliments.contains(arr[i])) {
				System.out.println(arr[i]+"  "+compliment);
			}
			compliments.add(compliment);
		}
	}

	// Main to test the above function
	public static void main (String[] args)
	{
		double[] arr = {1, 4, 24, 45, 6, 10, 16, 8, -8, 15.5, 0.5, 16.5, -0.5};
		double target = 16;
		printpairs(target, arr);
	}
}
 */

public class FirstTwoSum {
	static double[] given = {1,10,5,4,8,2,3};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = sc.nextInt();
		double compliment;
		//System.out.println("----- TEST ----"+sum);
		HashSet<Double> set = new HashSet<Double>();
	
		for (int i = 0; i < given.length; i++) {
		compliment = sum-given[i];
		if(set.contains(given[i])){
			System.out.println("First two set of numbers that add up to \""+sum+"\" are '"+compliment+"' and '"+given[i]+"'");
			System.exit(0);;
		}
		else
			set.add(compliment);
		}
	}
}