package DP;

//https://leetcode.com/problems/coin-change-2/

public class CoinChangeComboByDP {
    public static int totalCombinations(int coins[], int amount){
        int dp[] = new int[amount + 1];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++){
            for(int amt = coins[i] ; amt < dp.length ; amt++){
                dp[amt]+= dp[amt - coins[i]];
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 5;
        int totalWays = totalCombinations(coins, amount);
        System.out.println(totalWays);
    }
}
