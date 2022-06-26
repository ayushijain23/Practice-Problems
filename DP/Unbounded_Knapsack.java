package DP;

import java.util.Arrays;

public class Unbounded_Knapsack {
    public static int unbounded_knapsack(int val[], int wt[], int N, int weight){
        int dp[] = new int[weight + 1];
        dp[0] = 0;
        for(int cap = 1; cap <= weight; cap++) {
            dp[cap] = 0;
            for (int i = 0; i < val.length; i++) {
                if (wt[i] <= cap) {
                    dp[cap] = Math.max(dp[cap], dp[cap - wt[i]] + val[i]);
                }
            }
        }
        return dp[weight];
    }
    public static void main(String[] args) {
        int val[] = new int[] { 15, 14, 10, 45, 30 };
        int wt[] = new int[] { 2, 5, 1, 3, 4};
        int W = 7;
        int N = val.length;

        System.out.println(unbounded_knapsack(val, wt, N, W));
    }
}
