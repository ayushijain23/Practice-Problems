/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author acer
 */
public class FindMaximumElementInArray {
	
       static int findMax(int[]arr,int i,int n)
       {
        if (n==1)
            return arr[i];
        
        else
        {
            return Math.max(arr[i],findMax(arr,i+1,n-1));
        }
       }
       
       static int findMax3( int arr[], int idx)
       {
    	   if(idx == arr.length - 1)
    		   return arr[idx];
    	   
    	   int rem = findMax3(arr, idx + 1);
    	   return Math.max(arr[idx], rem);
    	//   return Math.max(arr[idx], findMax3(arr, idx+1));
       }
       
       
       static int findMax2(int arr[], int i, int n)
       {
    	   if(n==1)
    		   return arr[i];
    	   
    	   int maxp = findMax2(arr,i+1,n-1);
    	   int result = Math.max(arr[i], maxp);
    	   
    	   return result;
       }
       
       
       static int findMin(int[] arr, int i, int n)
       {
           if(n==1)
               return arr[i];
           
           else
               return Math.min(arr[i], findMin(arr,i+1,n-1));
       }
       
       static int trial(int arr[], int i, int n, int temp)
       {
         temp = arr[i];
         if(i==n-1)
             return temp;
         else{

             temp = Math.max(temp,trial(arr, i+1, n, temp));
               return(temp);
                           
       }
     }
  
      public static void main(String args[])
     {  
         int arr[] = {1,10,1190,812,5};
         int n = arr.length;
//         System.out.println(findMax(arr,0,n));
//         System.out.println(findMax(arr,0,n));
//         System.out.println(findMin(arr,0,n));
//          System.out.println(trial(arr,0,n,arr[0]));
          System.out.println(findMax3(arr,0));
      
      
      }
}
