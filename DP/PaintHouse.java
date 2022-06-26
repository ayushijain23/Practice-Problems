package DP;

/*
https://www.geeksforgeeks.org/minimize-cost-of-painting-n-houses-such-that-adjacent-houses-have-different-colors/
 */
public class PaintHouse {
    public static int minCost(int costs[][], int n){
        int dp[][] = new int[costs.length][costs[0].length];
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

        for(int i =  1; i < costs.length; i++){
            dp[i][0] = costs[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = costs[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = costs[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        return Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
    }
    public static void main(String[] args) {
        int costs[][] = { { 14, 2, 11 },
                          { 11, 14, 5 },
                          { 14, 3, 10 } };
        int n = costs.length;
        // Function Call
        int minimumCost = minCost(costs, n);
        System.out.println(minimumCost);
    }
}
