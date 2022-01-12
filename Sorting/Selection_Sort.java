package Sorting;

/*
 * Total iteration would be n-1;
 * And in each iteration, minimum element would be kept in starting.
 * by swapping i, and min th index.
 * 
 */
public class Selection_Sort {
	private static void printArray( int arr[])
	{
		for( int temp : arr)
		{
			System.out.print(temp+" ");
		}
	}
	
	private static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void SelectionSort(int arr[])
	{
	  for( int i = 0 ; i < arr.length-1; i++)
	  {
		  int min = i;
		  for( int j = i+1 ; j < arr.length ; j++)
		  {
			  if( arr[j] < arr[min])
			  {
				  min = j;
			  }
		  }
		  swap(arr, i, min);
	  }
	}

	public static void main(String[] args) {
		
		int arr[] = {5,9,8,1,2,9,2};
		
		SelectionSort(arr);
		
		printArray(arr);

	}

}
