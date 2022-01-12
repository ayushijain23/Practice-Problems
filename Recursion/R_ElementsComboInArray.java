/*
Given an array of size n, generate and print all possible combinations of r elements in array. 
For example, if input array is {1, 2, 3, 4} and r is 2, then output should be {1, 2}, {1, 3}, 
{1, 4}, {2, 3}, {2, 4} and {3, 4}.
 */
package Recursion;
import java.io.*;
import java.util.*;

/**
 *
 * @author ayu
 */
public class R_ElementsComboInArray {
   static void PrintCombination(int arr[], int data[], int i, int index,int n, int r)
    {
        if(index==r)                                       //base case
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(data[j]+" ");
            }
            System.out.println();
            return;
        }
        
        if(i>=n)
            return;
        
        data[index] = arr[i];                              //ith value is included in data
        PrintCombination(arr, data, i+1, index+1,n,r);

        PrintCombination(arr,data,i+1,index,n,r);     
    }
    
  public static void main(String args[])
  {  int arr[] = {1,2,3,4,5};
  int r = 3;
 
      int data[] = new int[r];
      int n = arr.length;
            Arrays.sort(arr);
    PrintCombination(arr,data,0,0,n,r);
      System.out.println("");
      
      
     
  }
   
     
}
