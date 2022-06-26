package Recursion;

/*
https://leetcode.com/problems/coin-change-2/
 */
public class CoinChangeComboByRecursion {
    public static int isSumPossible(int coins[], int ind, int amount){

        if(amount == 0){
            return 1;
        }
        if(ind >= coins.length || amount < 0)
            return 0;

        return isSumPossible(coins, ind, amount - coins[ind]) + isSumPossible(coins, ind + 1, amount);

    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 5;
        int totalWays = isSumPossible(coins, 0, amount);
        System.out.println(totalWays);
    }
}
