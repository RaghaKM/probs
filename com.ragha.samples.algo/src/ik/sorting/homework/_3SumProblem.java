package ik.sorting.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3SumProblem {

	public static void main(String[] args) {
		int targetSum = 0;
		//int[] arr = {2,10,-5,7,3,-10,40,9};
		int[] arr = {6,10,3,-4,1,-6,9};
		//int[] arr = {1,3,4,2,9,6,5,11,3,2};
		//int[] arr = {1,3,2,9,6,7,8,5,9,3};
		//int[] arr = {13,1,2,3,4,5,6,7,8,9,10,11,12};
		//int[] arr = {12,11,10,9,8,7,6,5,4,3,2,1};
		//int[] arr = {1,4,2,9,6,5,11,3};
		//int[] arr = {12,3,7,8,2};
		find3SumBruteForce(arr);
		System.out.println("===========================");
		threeSum(arr);
		System.out.println("===========================");
		ragha3Sum(arr, targetSum);
	}

	public static void find3SumBruteForce(int[] arr){
		for(int i = 0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
				if(j==i)continue;
				for(int k = +1;k<arr.length;k++){
					if(k==j)continue;
					
					if(arr[i]+arr[j]+arr[k] == 0){
						//System.out.println(i+"  i "+arr[i]+" --  "+j+"  j "+arr[j]+" --  "+k+"  k "+arr[k]);
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
	}
	
	public static String[] ragha3Sum(int[] nums, int sum){
		int j, k;
		List<List<Integer>> result = new ArrayList<List<Integer>>();

	for (int i = 0; i < nums.length-2; i++){
		if(i==0||nums[i]>nums[i-1]){
			j=i+1;
			k=nums.length-1;
			while(j<k){
				if(nums[i]+nums[j]+nums[k]==sum){
					//TODO
					//add to list and list to result
					List<Integer> L = new ArrayList<Integer>();
					L.add(nums[i]);
					L.add(nums[j]);
					L.add(nums[k]);
					result.add(L);
					
					j++;
					k--;
									
				}else if(nums[i]+nums[j]+nums[k] < sum){
					j++;
				}else{
					k--;
				}
				//TODO Handle duplicates
				while(nums[j]==nums[j-1]) j++;
				while(nums[k]==nums[k+1]) k--;
			}
		}
	}
	 String[] resultStrs = new String[result.size()];
    for (int i = 0; i < result.size(); i++) {
    	resultStrs[i] = Arrays.toString(result.get(i).toArray());
	}
    return resultStrs;
}
	
	public static List<List<Integer>> threeSum(int[] nums) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	 
	    if(nums == null || nums.length<3)
	        return result;
	 
	    Arrays.sort(nums);
	 
	    for(int i=0; i<nums.length-2; i++){
	        if(i==0 || nums[i] > nums[i-1]){
	            int j=i+1;
	            int k=nums.length-1;
	 
	            while(j<k){
	                if(nums[i]+nums[j]+nums[k]==0){
	                    List<Integer> l = new ArrayList<Integer>();
	                    l.add(nums[i]);
	                    l.add(nums[j]);
	                    l.add(nums[k]);
	                    result.add(l);
	 
	                    j++;
	                    k--;
	 
	                    //handle duplicate here
	                    while(j<k && nums[j]==nums[j-1])
	                        j++;
	                    while(j<k && nums[k]==nums[k+1])
	                        k--;
	 
	                }else if(nums[i]+nums[j]+nums[k]<0){
	                    j++;
	                }else{
	                    k--;
	                }
	            }
	        }
	    }

	    for (int i = 0; i < result.size(); i++) {
			System.out.println(Arrays.toString(result.get(i).toArray()));
	    	
		}
	    return result;
	}
	
}