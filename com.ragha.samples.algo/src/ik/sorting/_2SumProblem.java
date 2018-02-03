package ik.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2SumProblem {

	public static void main(String[] args) {
		
		int[] arr = {2,3,5,11,13,17,69};
		
		int front=0, sum = 0;
		int end = arr.length-1;
		int targetSum = 16;
	bruteForce(arr, targetSum);
	System.out.println("=====================================");
	twoSum(arr, targetSum);
	}
	
	public static void bruteForce(int[] nums, int targetSum){
				
		for(int i=0;i<nums.length;i++){
			for (int j = 0; j < nums.length; j++) {
				if(i==j) continue;
				
				if((nums[i]+nums[j])==targetSum){
					System.out.println(i+"i: "+nums[i]+"  ||| j: "+j+" "+nums[j]);
				//nums[i] =0; nums[j]=0;
				}
				
			}
		}
	}
	
	public static List<List<Integer>> twoSum(int[] nums, int targetSum){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int j=0;
		int k=nums.length-1;
		
		Arrays.sort(nums);
		
        while(j<k){
            if(nums[j]+nums[k]==targetSum){
                List<Integer> l = new ArrayList<Integer>();
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

            }else if(nums[j]+nums[k]<targetSum){
                j++;
            }else{
                k--;
            }
        }
        
	    for (int i = 0; i < result.size(); i++) {
			System.out.println(Arrays.toString(result.get(i).toArray()));
		}
	    
	    return result;
	}
	
}