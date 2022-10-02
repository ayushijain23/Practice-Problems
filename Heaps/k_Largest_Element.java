package Heaps;

// https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/

import java.util.Collections;
import java.util.PriorityQueue;

public class k_Largest_Element {
    public static void firstKLargestElements(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k ; i++){
            pq.add(arr[i]);
        }

        for(int i = k ; i < arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.print(" "+pq.poll());
        }

    }

    public static void firstKSmallestElements(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k ; i++){
            pq.add(arr[i]);
        }

        for(int i = k ; i < arr.length; i++){
            if(arr[i] < pq.peek() && !pq.contains(arr[i])){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.print(" "+pq.poll());
        }
    }
    public static void main(String[] args) {
        int arr[] = { 11, 3, 2, 15, 5, 4, 45, 88, 1, 96, 50, 45 };
        int k = 4;

        firstKLargestElements(arr, k);
        System.out.println();
        firstKSmallestElements(arr, k);
        System.out.println();
        int arr2[] = {7, 4, 4, 3, 6, 3, 9, 1};
        firstKSmallestElements(arr2, 3);

    }
}
