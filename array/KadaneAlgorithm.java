/*
Problem - Maximum sum subarray- kadane's algo
Time Complexity - O(n)
Space Complexity - O(1)
https://leetcode.com/problems/maximum-subarray/
 */
package array;


public class KadaneAlgorithm {
	 static int findSum( int arr[])
	 {
		 int currSum = 0;
		 int maxSum = Integer.MIN_VALUE;
		 int start = 0;
		 int s = 0;
		 int end = 0;
		 
		 for( int i = 0; i < arr.length ;i++)
		 {
			 currSum = currSum + arr[i];
			
			 if( maxSum < currSum)
			 {
				 maxSum = currSum;
				 start = s;
				 end = i;
			 }
			 
			 if( currSum < 0)
			 {
				 currSum = 0;
				 s = i+1;
			 }
		 }
		 System.out.println("i="+start+" & j="+end);
		 return maxSum;
	 }
	
	 // Method -2
	 static int findSum2( int arr[])
	 {
		 int currSum = arr[0];
		 int maxSum = arr[0];
		 
		 for( int i = 1; i < arr.length ;i++)
		 {
			 currSum = Math.max(currSum + arr[i], arr[i]);
			 maxSum = Math.max(currSum, maxSum);
		 }
		 return maxSum;
	 }
	
	 // Method-3 To find maximum sum subarray indexes
      static int findMaxSum(int arr[])
      {
          int maximum = arr[0];
          int sum = 0;
          int startIndex = 0;
          int endIndex = 0;
          int s = 0;
          
          for( int i = 0;i<arr.length;i++)
          {
              sum = sum + arr[i];
              
              if(sum > maximum)
              {
                  maximum = sum;
                  startIndex = s;
                  endIndex = i;
              }
              if(sum < 0)
              {
                  sum = 0;
                  s = i+1;
              }
          }
          System.out.println("i="+startIndex+" & j="+endIndex);
          
          return maximum;
                   
      }
    
    
          public static void main(String[] args) {
       int arr[] = {-2,0,-1,-3,5,4,-6,-5,7,5};
       int arr2[] = {-2,-5,-1,-3};
       int arr3[] = {10,-9,20,-8};
       int arr4[]= {2,5,-4,-3,-9};
       
       int result = findMaxSum(arr4);
       System.out.println(result);
       
        result = findSum(arr4);
        System.out.println(result);
        
        result = findSum2(arr4);
        System.out.println(result);

		result = kadaneAlgo(arr2);
		System.out.println(result);
    }

	private static int kadaneAlgo(int[] arr4) {
		 int maxVal = Integer.MIN_VALUE;
		 int sum = 0;

		 for(int val : arr4){
			 sum+= val;

			 if(maxVal < sum){
				 maxVal = sum;
			 }
			 if(sum < 0){
				 sum = 0;
			 }
		 }

		 return maxVal;
	}
}
