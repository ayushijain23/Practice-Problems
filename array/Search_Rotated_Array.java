package array;
/*
https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

public class Search_Rotated_Array {
    public static int searchTarget(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target) return mid;
            //left is sorted
            if(arr[low] < arr[mid]){
                if(target >= arr[low] && target < arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            //right is sorted
            else{
                if(arr[high] >= target && arr[mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12, 15, 18, 2, 5, 6, 8, 11};
        int tar = 8;

        int index = searchTarget(arr, tar);
        System.out.println(index);
    }
}
