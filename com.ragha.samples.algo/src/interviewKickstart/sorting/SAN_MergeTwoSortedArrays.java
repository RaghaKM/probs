package interviewKickstart.sorting;

import java.util.Arrays;

//  start from the last index of array and replace the values in longindex

public class SAN_MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] a1 = { 1, 3, 5, 7, 7 };
		int[] a2 = { 2, 4, 6, 8, 0, 0, 0, 0, 0 };
		int[] result = mergeFirstIntoAnother(a1, a2);
		System.out.println(Arrays.toString(result));
	}

	static int[] mergeFirstIntoAnother(int[] intArrShort, int[] intArrLong) {
		int len = intArrLong.length;
		int j = 0;
		if (len % 2 == 0)
			j = len / 2;
		else
			j = len / 2 - 1;
		int i = intArrShort.length - 1, k = intArrLong.length - 1;
		while (k >= 0 && i >= 0 && j >= 0) {
			if (intArrShort[i] > intArrLong[j]) {
				intArrLong[k] = intArrShort[i];
				i--;
			} else {
				intArrLong[k] = intArrLong[j];
				j--;
			}
			k--;

		}

		while (i >= 0 && k >= 0)
			intArrLong[k--] = intArrShort[i--];

		while (j >= 0 && k >= 0)
			intArrLong[k--] = intArrLong[j--];

		return intArrLong;

	}

}
