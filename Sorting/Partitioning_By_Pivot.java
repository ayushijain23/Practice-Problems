package Sorting;

public class Partitioning_By_Pivot {
	
	public static void printArray(int arr[])
	{
		for( int i : arr)
			System.out.print(i+" ");
	}
	
	private static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static int[] partition( int arr[], int pivot)
	{
		int i = 0;
		int j = 0;
		
		while( i < arr.length)
		{
			if( arr[i] > pivot)
			{
				i++;
			}
			else
			{
				swap(arr, i, j);
				i++;
				j++;
			}
		}
		System.out.println("J is :"+j);
		return arr;
	}

	public static void main(String[] args) {
		 int arr[] = {10,1,7,9,4,8,2,6,2,1};
		 int pivot = 5;
		 
		 arr = partition(arr, pivot);
		 printArray(arr);
		 
	}

}
