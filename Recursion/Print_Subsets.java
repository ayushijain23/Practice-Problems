package Recursion;

import java.util.Scanner;

public class Print_Subsets {
	public static void main(String[] args) throws Exception {
	      
	       int tar = 50;
	       int arr[] = {10,20,30,40,50};
	       printTargetSumSubsets(arr, 0, "", 0, tar );
	    }

	    // set is the subset
	    // sos is sum of subset
	    // tar is target
	    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
	          if( idx == arr.length)
	          {
	              if( sos == tar)
	              {
	                  System.out.println(set +".");
	              }
	              return;
	          }

	          printTargetSumSubsets(arr, idx + 1, set + Integer.toString(arr[idx]) +",", sos + arr[idx], tar);
	          printTargetSumSubsets(arr, idx + 1, set , sos, tar);
	    }
}
