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

	private static int MaxSubProduct(int nums[])
	{
		int maxSoFar = nums[0];
		int minSoFar = nums[0];
		int maxProduct = nums[0];

		for(int i = 1; i < nums.length; i++){
			if(nums[i] >= 0){
				maxSoFar = Math.max(maxSoFar * nums[i], nums[i]);
				minSoFar = Math.min(minSoFar * nums[i], nums[i]);
			}

			else{
				int temp = maxSoFar;
				maxSoFar = Math.max(minSoFar * nums[i], nums[i]);
				minSoFar = Math.min(temp * nums[i], nums[i]);
			}

			maxProduct = Math.max(maxProduct, maxSoFar);
		}
		return maxProduct;
	}
	
	private static int MaxSubProductArray(int arr[])
	{
		int n = arr.length;
		int result = 0;
		int ans = Integer.MIN_VALUE;
		int l = 0,m=0;
		for( int i = 0;i<n;i++)
		{
			for(int j = i; j < n; j++)
			{
				int product = 1;
				for( int k = i; k <= j; k++)
				{
					product = product * arr[k];
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
        int arr2[] = {-3,-1,-1};
        int arr3[] = {2,1,2,-4};
        
     System.out.println(MaxSubProduct(arr2));
     System.out.println(MaxSubProductArray(arr1));
      System.out.println(MaxSubProductArray(arr3));
	}

}
