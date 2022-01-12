package array;

import java.util.TreeSet;

/*
   https://www.geeksforgeeks.org/minimize-deviation-of-an-array-by-given-operations/
   
   A[] - contains positive integers,
  find minimum possible deviation of A[] after performing the following operations any number of times:

Operation 1: If the array element is even, divide it by 2.
Operation 2: If the array element is odd, multiply it by 2.

Input: A[] = {4, 1, 5, 20, 3}
Output: 3
Explanation: Array modifies to {4, 2, 5, 5, 3} after performing given operations. Therefore, deviation = 5 – 2 = 3.



 */
public class Minimum_Deviation_in_Array {
	private static int findDeviation( int arr[])
	{
		int n = arr.length;
		int diff = -1;
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for( int i = 0 ; i < n; i++)
		{
			if( arr[i] % 2 == 1)
			{
				set.add( 2 * arr[i]);
			}
			else {
				set.add(arr[i]);
			}
			
			
		}
		
		diff = set.last() - set.first();
		
		while( set.size() > 0 && set.last()%2 == 0)
		{ 
			int temp = set.last();
			set.remove(temp);
			set.add(temp/2);
			
			diff = Math.min(diff, set.last() - set.first());
		}
	
		
		return diff;
	}

	public static void main(String[] args) {
       int arr[] = {4, 1, 5, 20, 3};
       System.out.println(findDeviation(arr));
       
       int arr2[] = {3,5};
       System.out.println(findDeviation(arr2));
	}

}
