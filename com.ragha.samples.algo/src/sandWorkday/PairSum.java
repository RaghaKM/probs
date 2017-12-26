package sandWorkday;

import java.util.HashSet;
import java.util.Set;

class PairSum
{
	private static void printpairs(double target, double[] arr) {

		Set<Double> compliments = new HashSet<>();
		for (int i = 0; i<arr.length; i++) {
			
			double compliment = target - arr[i];
			if (compliments.contains(arr[i])) {
				System.out.println("-- Two numbers are :> "+arr[i]+"  "+compliment);
				System.exit(0);
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