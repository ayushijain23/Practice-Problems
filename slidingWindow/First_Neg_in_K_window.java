package slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/

Return first negative number in window of size k
 */

public class First_Neg_in_K_window {
    public static List<Integer> printFirstNegativeInteger(int arr[], int n, int k){
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int j = 0, i = 0;
        while(j < n){
            if(arr[j] < 0){
                queue.add(arr[j]);
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(queue.size() > 0){
                    list.add(queue.peek());
                    if(queue.peek() == arr[i]){
                        queue.poll();
                    }
                }
                else{
                    list.add(0);
                }
                i++;
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {12, 1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
        List<Integer> list = printFirstNegativeInteger(arr, n, k);
        System.out.println(list);


    }
}
