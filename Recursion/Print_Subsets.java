package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Print_Subsets {
	public static boolean findSet(int arr[], int target, int ind, int dp[][]){
		if(target == 0){
			return true;
		}
		if(ind == 0){
			return arr[0] == target;
		}

		if(dp[ind][target] != -1){
			return dp[ind][target] == 0 ? false : true;
		}

		boolean notTaken = findSet(arr, target, ind - 1, dp);

		boolean taken = false;
		if(arr[ind] <= target){
			taken = findSet(arr, target - arr[ind], ind - 1, dp);

		}

		dp[ind][target] = taken || notTaken ? 1 : 0;
		return taken || notTaken;
	}

	public static boolean findSetByDP(int arr[], int target){
		int n = arr.length;
		boolean dp[][] = new boolean[n][target + 1];
		for(int i = 0; i < n;i++){
			dp[i][0] = true;
		}
		if(target >= arr[0]){
			dp[0][arr[0]] = true;
		}

		for(int i = 1; i < n;i++){
			for(int tar = 1; tar <= target; tar++){
				boolean notTaken = dp[i - 1 ][tar];

				boolean taken = false;
				if(arr[i] <= tar){
					taken = dp[i - 1][tar - arr[i]];
				}

				dp[i][tar] = taken || notTaken;
			}
		}
		return dp[n - 1][target];
	}
	public static void main(String[] args) throws Exception {
	      
	       int tar = 50;
	       int arr[] = {10,20,30, 40};
	       printTargetSumSubsets(arr, 0, new ArrayList<Integer>(), 0, tar );

		   int len = arr.length;
		   int dp[][] = new int[len][tar + 1];
		   for(int row[] : dp){
			   Arrays.fill(row, -1);
		   }
		   //memoization
		   boolean isSumPresent = findSet(arr, tar, len - 1, dp);
		   System.out.println(isSumPresent);

		System.out.println("By DP:"+ findSetByDP(arr, tar));

		int nums2[] = {3, 34, 4, 12, 5, 2};
		tar = 30;
		boolean isPresent = findSetByDP(nums2, tar);
		System.out.println(isPresent);
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
