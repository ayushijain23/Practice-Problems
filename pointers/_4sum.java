package pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/4sum/
 */
public class _4sum {
    private static List<Integer> helper(int nums[], int i, int j, int k, int l){
        List<Integer>list = new ArrayList<>();
        list.add(nums[i]);
        list.add(nums[j]);
        list.add(nums[k]);
        list.add(nums[l]);
        return list;
    }
    private static List<List<Integer>> get4sum(int nums[], int target){
       //idea is to loop from i and then inner loop from i+ 1
        // then to find unique combinations, check for duplicates while traversing only
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < len - 1; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1; j < len - 1; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int remainingSum = target - (nums[i] + nums[j]);
                int left = j + 1;
                int right = len - 1;

                while(left < right){
                    if(nums[left] + nums[right] > remainingSum){
                        right--;
                    }
                    else if(nums[left] + nums[right] < remainingSum){
                        left++;
                    }
                    else{
                        List<Integer> list = helper(nums, i, j, left, right);
                        res.add(new ArrayList<>(list));
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
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2, 2};
        int target = 0;
        List<List<Integer>> results = get4sum(nums, target);
        System.out.println(results);
    }
}
