package array;

// https://www.geeksforgeeks.org/find-number-of-triangles-possible/

import java.util.Arrays;

public class Valid_Traingles_Count {
    public static int validTriangles(int nums[], int len){
        int count = 0;
        Arrays.sort(nums);
        for(int i = len - 1; i > 1; i--){
            int low = 0;
            int end = i - 1;
            while(low < end){
                if(nums[low] + nums[end] > nums[i]){
                    count+= end - low;
                    end--;
                }
                else{
                    low++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {4, 3, 5, 7, 6 };
        int possibleTraingles = validTriangles(nums, nums.length);
        System.out.println(possibleTraingles);

    
    }
}
