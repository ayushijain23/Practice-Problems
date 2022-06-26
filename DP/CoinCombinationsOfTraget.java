package DP;

import java.util.ArrayList;
import java.util.List;

/*
return all possible unique combinations of coins which make total sum as target.
where either the coin can be taken or not means , no unlimited supply  of coins

eg -
input - [2,3,5,6,7]  && target - 12
output - [[2,3,7],[5,7]]

 */
public class CoinCombinationsOfTraget {
    public static void findAllCombinations(int nums[], int target, List<List<Integer>> result, int ind, int  sum, List<Integer> list){
        if(ind == nums.length){
            if(sum == target) {
                result.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(nums[ind]);
        findAllCombinations(nums, target, result, ind + 1, sum + nums[ind], list);
        list.remove(list.size() - 1);

        findAllCombinations(nums, target, result,ind + 1, sum, list);

    }
    public static void main(String[] args) {
        int nums[] = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;
        findAllCombinations(nums, target, result, 0, sum, new ArrayList<>());
        System.out.println(result);
    }
}
