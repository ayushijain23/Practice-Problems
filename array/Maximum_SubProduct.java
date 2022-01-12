package array;

/*
 * https://leetcode.com/problems/maximum-product-subarray/
 * 
 * 1. Input: [2,3,-2,4]
   Output: 6
   Explanation: [2,3] has the largest product 6.
   
   2. Input: [-2,0,-1]
     Output: 0
     Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */

public class Maximum_SubProduct {

	private static int MaxSubProduct(int arr[])
	{
		int ans= Integer.MIN_VALUE;
		
		int maxProduct = 1;
		int minProduct = 1;
		
		for(int i = 0;i < arr.length;i++)
		{
			//Case 1 : when arr[i] > 0 
		if(arr[i]>0)
		{
			maxProduct = maxProduct * arr[i];
			minProduct = Math.min(1,  minProduct*arr[i]);
		}
		
		else if(arr[i]==0)
		{
			maxProduct = 0;
			minProduct = 0;
		}
		
		
		else if(arr[i] < 0)
		{
		   int temp = maxProduct;
		   maxProduct = minProduct * arr[i];
		   minProduct = temp * arr[i];
		}
		
		if(ans < maxProduct)
			 ans = maxProduct;
		
		if(maxProduct<=0 || minProduct==0)
		{
			maxProduct = 1;
			minProduct = 1;
		}
		
	   }
	  return ans;
	}
	
	private static int MaxSubProductArray(int arr[])
	{
		int n = arr.length;
		int result = 0;
		int ans = Integer.MIN_VALUE;
		int l = 0,m=0;
		for( int i = 0;i<n;i++)
		{
			for(int j = i;j<n;j++)
			{
				int product = 1;
				for( int k = i;k<=j;k++)
				{
					product=product*arr[k];
				}
				
				if(product > ans)
				{
					ans = product;
					l = i;
					m = j;
					
				}
			}
			
		}
		result = m-l+1;
		System.out.println(ans);
		System.out.println(l+" & "+m);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[] = {2,3,2,-4};
        int arr2[] = {-2,0,-1};
        int arr3[] = {2,1,2,-4};
        
     System.out.println(MaxSubProduct(arr3));
     System.out.println(MaxSubProductArray(arr1));
      System.out.println(MaxSubProductArray(arr3));
	}

}
