package Sorting;

public class Quick_Sort {
	
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
	
	private static int partition( int arr[] , int pivot, int low, int high)
	{
		int i = low, j = low;
		
		while( i <= high)
		{
			if( arr[i] <= pivot)
			{
				swap(arr, i, j);
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		return j-1;
	}
	
	private static void quickSort( int arr[], int low, int high)
	{
		if( low >= high)
		{
			return;
		}
		
		int pivot = arr[high];
		
		int pi  = partition( arr, pivot, low, high);
		
		quickSort(arr, low, pi-1);
		quickSort(arr, pi+1, high);
		
	}

	public static void main(String[] args) {
		 int arr[] = {2,7,9,1,3,6,7,3};
		 
		 quickSort(arr, 0, arr.length-1);
		 
		 printArray(arr);
	}

}
