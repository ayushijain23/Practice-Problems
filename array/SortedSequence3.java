package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
https://leetcode.com/problems/increasing-triplet-subsequence/
 */
public class SortedSequence3 {

    public static boolean isTripletPresent(int nums[]){
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(val <= min){
                min = val;
            }
            else if(val <= secondMin){
                secondMin = val;
            }
            else if(val > secondMin){
                List<Integer> list = new ArrayList<>();
                list.add(min);
                list.add(secondMin);
                list.add(val);
                System.out.println(list);
                return true;
            }
        }
     return false;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,0,1,0,5};
        System.out.println("Num1 :"+ isTripletPresent(nums1));

        int nums2[] = {5,4,3,2,1};
        System.out.println("Num2 :"+ isTripletPresent(nums2));
    }
}
