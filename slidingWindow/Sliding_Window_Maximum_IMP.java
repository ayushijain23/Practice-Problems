package slidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
https://leetcode.com/problems/sliding-window-maximum/

Find maximum number of each window
 */
public class Sliding_Window_Maximum_IMP {

    public static List<Integer> findMax(int nums[], int k){
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0, n = nums.length;
        Deque<Integer> pq = new LinkedList<>();

        while(j < n){
            while(!pq.isEmpty() && nums[j] > pq.peekLast()){
                pq.pollLast();
            }

            pq.addLast(nums[j]);
            if(j - i + 1 < k){
                j++;
            }

            else if(j - i + 1 == k){
                list.add(pq.peek());
                if(nums[i] == pq.peek()){
                    pq.pollFirst();
                }
            i++;
            j++;
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(findMax(nums, k));
    }

}
