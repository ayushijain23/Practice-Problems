package DP;

//https://www.geeksforgeeks.org/climb-n-th-stair-with-all-jumps-from-1-to-n-allowed-three-different-approaches/

/*here in dp array, each elements gives no of ways of reaching nth stair with index i.
like dp[0] ~ gives ways to reach nth stair from 0th stair
    dp[3] ~ gives ways to reach nth stair from 3rd stair
hence smaller problem is near nth and we move from right -> left in dp array.

~ If instalead of jumps between 1 to n, jump aaray is also given then refer calculateTotalWaysWithVariableJumps
*/

import java.util.Arrays;

public class ClimbStairsVariableJumps {
    private static int calculateTotalWaysWithVariableJumps(int n, int dp[], int jumps[]){
        dp[n] = 1;
        for(int i = n-1; i >=0; i--){
            int steps = jumps[i];
            for(int j = 1; j <= steps && i + j <= n; j++){
                dp[i]+= dp[i+j];
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        System.out.println(calculateTotalWays(n,dp));

        Arrays.fill(dp, 0);
        int jumps[] = {1, 2, 3, 4};
        System.out.println(calculateTotalWaysWithVariableJumps(n,dp, jumps));
    }

    private static int calculateTotalWays(int n, int[] dp) {
        dp[n] = 1;
        for(int i = n-1 ; i >= 0; i --){
            int steps = n;
            for(int j =  1; j <= steps && i + j <= n; j++){
                dp[i]+= dp[i + j];
            }
        }
        return dp[0];
    }

}
