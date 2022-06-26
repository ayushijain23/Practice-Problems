package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_Subsets {
	public static void main(String[] args) throws Exception {
	      
	       int tar = 50;
	       int arr[] = {10,20,30, 40};
	       printTargetSumSubsets(arr, 0, new ArrayList<Integer>(), 0, tar );
	    }

	    // set is the subset
	    // sos is sum of subset
	    // tar is target
	    public static void printTargetSumSubsets(int[] arr, int idx, List<Integer> list,int sum, int tar) {
	          if( idx == arr.length)
	          {
				  //System.out.print(list);
	              if( tar == sum)
	              {
	                  System.out.println(list);
	              }
	              return;
	          }

			  list.add(arr[idx]);
	          printTargetSumSubsets(arr, idx + 1, list, sum + arr[idx], tar);
			  list.remove(list.size() - 1);

	          printTargetSumSubsets(arr, idx + 1, list , sum, tar);
	    }
}
