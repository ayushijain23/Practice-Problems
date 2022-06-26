package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search_Element {

	public static int findElement(int arr[],int l, int r, int k)
	   {
	       if( l > r )
	         return -1;
	         
	       if(arr[l] == k)
	         return l;
	         
	       if(arr[r] == k)
	         return r;
	       
	     return findElement(arr, l+1, r-1, k);
	   }

	   public static int findByBinaryRecursion(int arr[], int low, int high, int x) {
		   if (low <= high) {
			   int mid = low + (high - low) / 2;
			   if (arr[mid] == x) {
				   return mid;
			   }

			   else if (arr[mid] > x) {
				   return findByBinaryRecursion(arr, low, mid - 1, x);
			   }
			   else
				   return findByBinaryRecursion(arr, mid + 1, high, x);
		   }
         return -1;
	   }
	   
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int t =Integer.parseInt(br.readLine());
	   while(t-- > 0)
	   {
	       int n = Integer.parseInt(br.readLine());
	       String input = br.readLine();
	       String ss[] = input.trim().split("\\s");
	       int arr[] = new int [n];
	       
	       for( int i = 0;i<n;i++)
	       {
	           arr[i] = Integer.parseInt(ss[i]);
	       }
	       
	       int k = Integer.parseInt(br.readLine());
	       int result = findElement(arr, 0, n-1, k);
	       System.out.println("Element found at Index:"+result);

		   System.out.println("Element found at Index by Recursion:"+findByBinaryRecursion(arr, 0, n-1, k));
	   }
	  
	}

}
