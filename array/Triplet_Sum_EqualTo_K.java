package array;

import java.util.HashSet;

/*
 * https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
 * 
Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
Output: 12, 3, 9
Explanation: There is a triplet (12, 3 and 9) present
in the array whose sum is 24. 

Input: array = {1, 2, 3, 4, 5}, sum = 9
Output: 5, 3, 1
Explanation: There is a triplet (5, 3 and 1) present 
in the array whose sum is 9. 

 */
public class Triplet_Sum_EqualTo_K {
    private static void findTriplets(int arr[], int k )
    {
    	for( int i = 0;i<arr.length-2;i++)
    	{
    		
    		HashSet<Integer> set = new HashSet<>();
    		int sum = k - arr[i];
    	//	System.out.println(sum);
    		for( int j = i+1;j<arr.length;j++)
    		{
    			if(set.contains(sum-arr[j]))
    			{
    			  System.out.println("Triplet is:"+arr[i]+","+arr[j]+","+(sum-arr[j]));
    			  return;
    			  
    			}
    			set.add(arr[j]);
    			
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 3, 4, 1, 6, 9};
		int k = 24;
		findTriplets(arr,k);
		
		k = 11;
		findTriplets(arr,k);

	}

}
