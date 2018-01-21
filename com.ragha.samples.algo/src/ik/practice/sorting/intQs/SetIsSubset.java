package ik.practice.sorting.intQs;

public class SetIsSubset {

/*	Q1: Given two sets, find if one is subset of the other.
	Ex: S1 = {1,2,3,4,5} S2 = {3,4}
*/
	static int[] S1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, S2 = {9,10,11,13};//
	public static void main(String[] args) {
		int i=0,j=0,matches=0;
		while( i<S1.length && j<S2.length ){
			if(matches==Math.min(S1.length, S2.length))
				break;
			
			if(S1[i]>S2[j]){
				j++;
				matches=0;
			}
			else
				if(S1[i]<S2[j]){
					i++;
					matches=0;
				}
			else
			{
				i++;
				j++;
				matches++;
			}
		}
		System.out.println(matches==Math.min(S1.length, S2.length));
		System.out.println("I: "+i+"   J: "+j+"  Matches : "+matches);
	}
}