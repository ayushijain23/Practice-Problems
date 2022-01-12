package Sorting;

public class Sort_0s_1s_2s {

	public static void printArray(int arr[])
	{
		for( int i : arr)
			System.out.print(i+" ");
	}
	
	private static void swap( int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void sortArray(int arr[])
	{
		int i = 0;     // i to k unvisited elements
		int j = 0;     // 0 to j-1 all zeroes
		int k = arr.length-1;     //j to i-1 all 1s And k+1 to end all 2s
		
		while( i <= k)
		{
			if( arr[i] == 1)
			{
				i++;
			}
			
			else if( arr[i] == 0)
			{
				swap(arr, i, j);
				i++;
				j++;
			}
			else if(arr[i] == 2) 
			{
				swap(arr,i,k);
				k--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,2,0,0,0,1,2,1,1,1,0,2};
		
		sortArray(arr);
		
		printArray(arr);
	}

}
