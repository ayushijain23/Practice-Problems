package DP;

/*
https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
 */


public class TargetSumSet {
    public static boolean isTargetSumPresent(int nums[], int targetValue){
        int n = nums.length;
        boolean dp[][] = new boolean[n+1][targetValue + 1];

        for(int i = 0; i < n + 1; i++){
            dp[i][0] = true;
        }
        for(int ind = 1; ind < n + 1; ind++){
            for(int target= 1; target < targetValue + 1 ; target++){

                if(dp[ind - 1][target] == true){
                    dp[ind][target] = true;
                }
                else {
                    if (target >= nums[ind - 1]) {
                        dp[ind][target] = dp[ind -1][target - nums[ind - 1]];
                    }
                }
              }
            }
        return dp[n][targetValue];
    }
    public static void main(String[] args) {
        int nums[] = {4, 2, 1, 3 ,7};
        int targetValue = 10;

        boolean isPresent = isTargetSumPresent(nums, targetValue);
        System.out.println(isPresent);

        int nums2[] = {3, 34, 4, 12, 5, 2};
        targetValue = 30;
        isPresent = isTargetSumPresent(nums2, targetValue);
        System.out.println(isPresent);
    }
}
