package Sorting;

import java.util.Arrays;

/*
 * Find kth smallest element in array in O(n);
 */
public class Quick_Select {
	
	private static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printArray(int arr[])
	{
		for( int i : arr)
			System.out.print(i+" ");
	}
	
	private static int partition( int arr[], int low, int high, int pivot)
	{
		int i = low,j =low;
		while( i <= high)
		{
			if(arr[i] <= pivot)
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
	
	private static int sort( int arr[], int low, int high, int k)
	{
		if( k > high)
		{
			return -1;
		}
		
		int pivot = arr[high];
		
		int pi = partition( arr, low, high, pivot);
		
		System.out.println(pi);
		
		if( pi == k)
		{
			return arr[pi];
		}
		
		else if( k < pi)
		{
			return sort(arr, low, pi-1, k);
		}
		
		else {
			return sort( arr, pi+1, high, k);
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {2,5,8,1,4,5,7};
		
		int k = 3;
	   int kthSmallestElement = sort(arr, 0, arr.length-1, k-1);
	   Arrays.sort(arr);
	   printArray(arr);
	   System.out.println();
	   System.out.println(kthSmallestElement);
	}

}
