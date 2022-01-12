package array;


/*
 * For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, 
 * it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same.
 * 
 Expected time complexity is O(n) and extra space is O(1).

Example:

Input : arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0};

Input : arr[] = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 */
public class Shift_Zeroes {
	
	private static void printArray(int arr[])
	{
		for( int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	
	private static void shiftZeroes( int arr[])
	{
		int j = 0;
		for( int i = 0 ; i < arr.length ; i++)
		{
			if( arr[i] != 0)
			{
				arr[j++] = arr[i];
			}
		}
		while( j < arr.length)
		{
			arr[j++] = 0;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		
		shiftZeroes(arr);
		
		printArray(arr);	
		
	}

}
