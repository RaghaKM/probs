package AdHoc_ArrayProgs;

import ragha.pract.HackerRank.IK.FindMissingNum;

public class MaxContiguousSubArr {
	public static int area = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array = {1,2,10,12,15,19,1,5,3,0,2,22};
		int[] array = {-100,-2,-10,-10,-1};
	//	System.out.println(findMaxRagha(array));
		System.out.println("Max sum is : "+sumSubArray(array));
		System.out.println("Max Sum 2 is "+sumSubArray2(array));
		System.out.println("Max Sum 3 is "+sumSubArray3(array));
		System.out.println("Max Sum 3 is "+calcArea(array));
		
	}

	
	static int sumSubArray( int[] array)
    {
		int n = array.length;
		int s =Integer.MIN_VALUE;
		int max =Integer.MIN_VALUE;
        // Pick starting point
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
            	s = 0;
                for (int k=i; k<=j; k++){
                    System.out.print(array[k]+" ,");
        			s+=array[k];
					if(s>max)
					max = s;
                }
                System.out.println("");
            }

        }
        return max;
    }
	
	//Joseph B. Kadane's approach
	static int sumSubArray2( int[] array)
    {
		int n = array.length;
		int start =Integer.MIN_VALUE;
		int max =Integer.MIN_VALUE;
		int tempMax = 0;
        // Pick starting point
        for (int i=0; i <n; i++)
        {
        	tempMax = tempMax + array[i];
        	
        	if(max<tempMax)
        		max=tempMax;
        	
        	if(tempMax<0){
        		tempMax =0;
        	}
        }
        return max;
    }		
	
	static int calcArea( int[] array)
    {
		int n = array.length;
		int max =Integer.MIN_VALUE;
		int tempMax = 0; 
		int tempArea = 0;
        // Pick starting point
        for (int i=0; i <n; i++)
        {
        	tempMax = tempMax + array[i];
        	
        	tempArea = tempArea ;
        	//area = area + ();
        	
        	if(max<tempMax)
        		max=tempMax;
        	
        	if(tempMax<0)
        		tempMax =0;

        }
        return max;
    }
	
	
	static int getAreaDiff(int[] arr,int index){
	
	//	if()
		
		return 0;
	}
	
	static int sumSubArray3(int[] a){

		   int max_so_far = a[0];
		   int curr_max = a[0];
		 
		   for (int i = 1; i < a.length; i++)
		   {
		        curr_max = Math.max(a[i], curr_max+a[i]);
		        max_so_far = Math.max(max_so_far, curr_max);
		   }
		   
		   return max_so_far;
		
	}
	
	

	// Time complexity is n^3
	static int findMax(int[] a){
		int max = Integer.MIN_VALUE;
			for(int b=0; b<a.length ; b++){
				for(int e = b+1;e<=a.length ; e++){
					int s = 0;	
					for(int k = b+1;k<e ; k++){

						s+=a[k];
						if(s>max)
						max = s;
					}
				}
			}
			return max;
		}

	//Improved solution
	//Order n^2
	static int findMax2(int[] a){
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int n =0; 
			for(int k=i; k<a.length;k++){
				n+=a[k];
				if(n>max)
					max = n;
			} 
		}
		return max;
	}

	//another condition to avoid including bigger negative numbers
	//order of n
	int findMax3(int[] a){
		int max = Integer.MIN_VALUE;
		int s =0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(s+a[i]>0){
					s+=a[i];
					if(s>max)
						max=s;
			}else{
				s=0;
			}
		}
		return max;
	}
}