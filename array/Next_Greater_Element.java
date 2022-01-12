package array;

/*
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * 
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 *  and replace the last element with -1.

 * Input: arr = [17,18,5,4,6,1]
  Output: [18,6,6,6,1,-1]
 */
public class Next_Greater_Element {
	
	private static void printArray(int arr[])
	{
		for( int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	
	private static int[] findNextGreater( int arr[])
	{
		int tempMax = -1;
		for( int i = arr.length-1 ;i >=0 ;i--)
		{
			if(arr[i] > tempMax)
			{
				int val = arr[i];
				arr[i] = tempMax;
				tempMax = val;
			}
			
			else {
				arr[i] = tempMax;
			}
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
	
      int arr[] = {17,18,5,4,6,1};
      
      arr = findNextGreater(arr);
      printArray(arr);
	}

}
