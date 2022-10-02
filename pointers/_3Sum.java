package pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/3sum/
 */
public class _3Sum {
    private static List<List<Integer>>get3sum(int nums[], int target){
        List<List<Integer>> results = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < len - 2; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int remainingSum = target - nums[i];
            int left = i + 1;
            int right = len - 1;
            while(left < right){
                if(nums[left] + nums[right] > remainingSum){
                    right--;
                }
                else if(nums[left] + nums[right] < remainingSum){
                    left++;
                }
                else{
                    List<Integer>list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    results.add(new ArrayList<>(list));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
            }
        }
      return results;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,2, 3,3,3-1,4};
        int target = 4;
        List<List<Integer>> results = get3sum(nums, target);
        System.out.println(results);
    }
}
