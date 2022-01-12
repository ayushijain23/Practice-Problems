package Sorting;

/*
 * 
 * arr.length-1 iterations occur, and in each iteration, largest element reaches to end of array.
 */
public class Bubble_Sort {
	
	public static void printArray(int arr[])
	{
		for( int i : arr)
			System.out.print(i+" ");
	}
	
	private static boolean isSmaller( int arr[], int i, int j)
	{
		if( arr[i] < arr[j])
			return true;
		
		return false;
	}
	
	private static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	private static void bubbleSort(int arr[])
	{
		int n = arr.length - 1;
		int itr = 1;
		
		while( itr <= n)
		{
			for( int i = 0; i < arr.length - itr ; i++)
			{
				if( isSmaller(arr, i+1, i))
				{
					swap( arr, i+1, i);
				}
			}
			
			itr++;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {3,7,8,1,2,4,6};
		
		bubbleSort(arr);
		
		printArray(arr);

	}

}
