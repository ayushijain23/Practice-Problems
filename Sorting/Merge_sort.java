package Sorting;

public class Merge_sort {
	public static void printArray(int arr[])
	{
		for( int i : arr)
			System.out.print(i+" ");
	}
	
	public static int[] mergeArrays( int arrLeft[], int arrRight[])
	{
		int res[] = new int[arrLeft.length + arrRight.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < arrLeft.length && j < arrRight.length)
		{
			if(arrLeft[i] < arrRight[j])
			{
				res[k] = arrLeft[i];
				i++;
			}
			else {
				res[k] = arrRight[j];
				j++;
			}
			k++;
		}
		
		while( i < arrLeft.length)
		{
			res[k++] = arrLeft[i];
			i++;
		}
		
		while( j < arrRight.length)
		{
			res[k++] = arrRight[j];
			j++;
		}
		
		return res;
	}
	
	public static int[] mergeSort( int arr[], int low, int high)
	{
		if(low == high)
		{
			int res[] = new int[1];
			res[0] = arr[low];
			return res;
		}
		
		int mid = (low + high)/2;   // 1
		
		int arrLeft[] = mergeSort(arr, low , mid);  //2
		int arrRight[] = mergeSort(arr, mid+1, high); //3
		
		return mergeArrays(arrLeft, arrRight);  //4
	}

	public static void main(String[] args) {
	
		 int arr[] = {2,7,1,4,9,0,2,3,-9};
		
		 arr = mergeSort(arr, 0, arr.length-1 );
		 
		 printArray(arr);
	}

}
