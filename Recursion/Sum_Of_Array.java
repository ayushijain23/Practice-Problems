package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_Of_Array {
	static int sum = 0;
    public static int findSum(int arr[], int l, int r)
    {
        if( l > r)
           return 0;
           
          else if(l==r)
           {
               sum = arr[l] + findSum(arr, l+1, r-1);
           }
           
           else{
            sum = arr[l] + arr[r] + findSum(arr, l+1, r-1);
           } 
           return sum;
           
    }
    
    public static int findSum2( int arr[], int n)
    {
    	if(n < 0)
    		 return 0;
    	
    	return findSum2(arr, n-1) + arr[n];
    }
    
    
	public static void main (String[] args) throws IOException {
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
	       
	      // System.out.println(findSum(arr, 0, n-1));
	       System.out.println(findSum2(arr,n-1));
	}
}
}
