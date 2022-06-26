package array;

/*
https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1
https://www.geeksforgeeks.org/merge-k-sorted-arrays-set-2-different-sized-arrays/
 */
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Merge_K_SortedArrays {
    public static class PairNode{
        int arrInd;
        int eleInd;
        int val;

        public PairNode(int arrInd, int eleInd, int val) {
            this.arrInd = arrInd;
            this.eleInd = eleInd;
            this.val = val;
        }
    }
    public static List<Integer> mergeArrays(int arr[][], int k){
        List<Integer> result = new ArrayList<>();
        PriorityQueue<PairNode> pq = new PriorityQueue<>((a, b)-> a.val - b.val);
        for(int i = 0; i < k; i++){
            pq.add(new PairNode(i, 0, arr[i][0]));
        }

        while(!pq.isEmpty()){
            PairNode temp = pq.poll();
            result.add(temp.val);
            temp.eleInd++;

            if(temp.eleInd < arr[temp.arrInd].length){
                temp.val = arr[temp.arrInd][temp.eleInd];
                pq.add(temp);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[][] = { {1, 3},{2, 4, 6}, {0, 9, 10, 11}} ;
        int k = 3;
        List<Integer> result = mergeArrays(arr, k);
        System.out.println(result);
    }
}
