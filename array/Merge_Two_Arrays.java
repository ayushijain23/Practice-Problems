package array;

import java.util.Arrays;

public class Merge_Two_Arrays {
	
	private static int[] mergeArrays( int arr1[], int arr2[])
	{
		
		int res[] = new int[arr1.length + arr2.length];
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < arr1.length && j < arr2.length)
		{
			if( arr1[i] <= arr2[j])
			{
				res[k] = arr1[i];
				i++;
				k++;
			}
			
			if(arr1[i] > arr2[j])
			{
				res[k] = arr2[j];
				j++;
				k++;
			}
			//System.out.println(res[k]);
		}
		
		while( i < arr1.length)
		{
			res[k++] = arr1[i++];
		}
		
		while( j < arr2.length)
		{
			res[k++] = arr2[j++];
		}
		
		return res;
	}
	
	private static void printArray(int arr[])
	{
		for( int i : arr)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		 
		int arr1[] = {2,4,3,9};
		int arr2[] = {5,3,-7,8,1};
		
		int result[] = mergeArrays(arr1,arr2);
		printArray(result);

	}

}
