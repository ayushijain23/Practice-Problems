package slidingWindow;

import java.util.HashMap;

/*
https://www.geeksforgeeks.org/longest-sub-array-sum-k/

find length of longest subarray with sum == K
array can have negative numbers too
 */

public class Longest_Subarray_Sum_K {
    public static int findMaxLengthBySlidingWindow(int nums[], int k){
        int i = 0, j = 0, sum = 0;
        int n = nums.length, maxLength = 0;
        while(j < n){
            sum+= nums[j];

            if(sum == k){
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            }
            else if(sum < k){
                j++;
            }
            else if(sum > k){
                while(sum > k){
                    sum = sum - nums[i];
                    i++;
                }

                if(sum == k){
                    maxLength = Math.max(maxLength, j - i + 1);
                }
                j++;
            }
        }
        return maxLength;
    }

    public static int findMaxLengthWithNegNumbers(int nums[], int k){
        HashMap<Integer, Integer>map = new HashMap<>();
        int sum = 0, maxlength = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum+= nums[i];
            if(sum == k){
                maxlength = Math.max(maxlength, i + 1);
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

            if(map.containsKey(sum - k)){
                maxlength = Math.max(maxlength, i - map.get(sum - k));
            }
        }

        return maxlength;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 7, -5, 2, 1, 3};
        int k = 4;
        int maxLength = findMaxLengthWithNegNumbers(nums, k);
        System.out.println(maxLength);


        //when only positive numbers are present in array then sliding window approach can be used
        int nums2[] = {4, 1, 1, 1, 2, 3 , 5};
        k = 5;
        int maxLengthBySlidingWindow = findMaxLengthBySlidingWindow(nums2, k);
        System.out.println(maxLengthBySlidingWindow);

        int[] arr = {10, 5, 2, 7, 1, 9};
        k = 15;
        maxLengthBySlidingWindow = findMaxLengthBySlidingWindow(arr, k);
        System.out.println(maxLengthBySlidingWindow);
    }
}
