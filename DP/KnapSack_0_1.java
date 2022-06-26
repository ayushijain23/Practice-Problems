package DP;
/*

*/

import java.util.Arrays;

public class KnapSack_0_1 {

	public static int knapSack(int wt[], int val[], int W, int n)
	{
		if(W == 0 || n < 0)
		{
			return 0;
		}
		// when weight of item is less than Weight of knapsack, then we can either put it into bag or not.
		// Hence max of these two conditions.
		if(wt[n] <= W)
		{
			return Math.max( val[n] + knapSack(wt, val, W-wt[n], n-1), knapSack(wt, val, W, n-1 ));
		}

	    // When item weight[n-1] > Weight of knapsack, then we can't put it into bag
	    // i.e. When wt[n-1] > W
	    else
		return knapSack( wt, val, W, n-1);
	}

	public static int knapSackByMemoization(int wt[], int val[], int W, int N, int dp[][])
	{
		if(N == 0 || W == 0)
			return 0;

		if(dp[N][W] != -1){
	     return dp[N][W];
	    }
		if(wt[N-1] <= W){
			//either take it or not take it, then take its  max
			dp[N][W] = Math.max(val[N-1] + knapSackByMemoization(wt, val, W- wt[N-1], N-1, dp) , knapSackByMemoization(wt, val, W, N-1, dp));
		}

		else{
			dp[N][W] = knapSackByMemoization(wt, val, W, N-1, dp);
		}
		return dp[N][W];
	}

	public static int knapSackByTabulation(int wt[], int val[], int W, int N){
		int dp[][] = new int[N + 1][W + 1];
		for(int i = 1; i < N + 1; i++){
			for(int j = 1; j < W + 1; j++){
				if(wt[i - 1] <= j){
					//here we have two choices, either take the element or not. And then find max of both cases.
					int rweight = j - wt[i - 1];
					dp[i][j] = Math.max(dp[i - 1][rweight] + val[i - 1], dp[i-1][j]);
				}
				else{
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
	  return dp[N][W];
	}

	
	public static void main(String[] args) {
		int val[] = new int[] { 60, 100, 120, 170 };
        int wt[] = new int[] { 10, 20, 30, 40 };
        int W = 50; 
        int N = val.length;
		int dp[][] = new int[val.length + 1][W + 1];
		for(int row[] : dp){
			Arrays.fill(row, -1);
		}
        System.out.println("By Recursion- "+knapSack(wt,val,W, N - 1));
		System.out.println("By Memoization- "+knapSackByMemoization(wt,val,W, N, dp));
		System.out.println("By Tabulation- "+knapSackByTabulation(wt,val,W, N));
		System.out.println();

		//2nd example
		int val2[] = new int[] {10, 15, 40};
		int wt2[] = new int[] {1, 2, 3};
		int W2 = 6;
        int  N2 = val2.length;
		int dp2[][] = new int[N2+1][W2 + 1];
		for(int row[] : dp2){
			Arrays.fill(row, -1);
		}
		System.out.println("By Recursion 2- "+knapSack(wt2,val2,W2, N2 - 1));
		System.out.println("By Memoization 2- "+knapSackByMemoization(wt2,val2,W2, N2, dp2));
		System.out.println("By Tabulation 2- "+knapSackByTabulation(wt2,val2,W2, N2));

	}
}
