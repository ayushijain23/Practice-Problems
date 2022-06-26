package DP;

import java.util.Arrays;
/*
https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-minimum-moves-official/ojquestion
 */
public class ClimbStairsWithMinimumMoves {

    private static int calculateMinMoves(int n, int[] moves){
        Integer dp[] = new Integer[n + 1];
        dp[n] = 0;

        for(int i = n-1; i >= 0; i --){
            int move = moves[i];
            if(move > 0){
                int minValue = Integer.MAX_VALUE;
                for(int j = 1; j <= move && (i + j) <= n; j++ ) {
                    if (dp[i + j] != null) {
                        minValue = Math.min(minValue, dp[i + j]);
                    }
                }

                if(minValue != Integer.MAX_VALUE){
                    dp[i] = minValue + 1;
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int n = 10;
        int moves[] = {3,3,0,2,1,2,4,2,0,0};
        int minMoves = calculateMinMoves(n, moves);
        System.out.println(minMoves);
    }

}
