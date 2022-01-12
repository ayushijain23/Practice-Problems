package Sorting;

import java.util.Scanner;
//Insertion sort - O(n^2)

public class insertionSort {
	
	public static void sort(int arr[])
	{
		
		for ( int i = 1; i < arr.length ; i++)
		{
			int temp = arr[i];
			int j = i-1;
			while( j >= 0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void print(int arr[])
	{
		for( int i : arr)
			System.out.print(i+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int arr[] = { 12, 2, 5, 13, 5, 6 };
		
		sort(arr);
		
		print(arr);
			
	}

}
