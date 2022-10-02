package array;
/*
https://leetcode.com/problems/rotate-array/

Rotating array left times == len - rotating array right times

so if we need to find left rotation below is solution and if we need to find right rotation then just
find k % len and then find len - k right rotations

kyuki left se suppose 3 rotate krna == right se len - 3 rotate krna hai
 */


public class RotateArray {
    public static void printArray(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void reverse(int arr[], int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void rotate(int arr[], int k){
        int len = arr.length;
        k = k % len;

        reverse(arr, 0, k - 1);
        reverse(arr, k , len - 1);
        reverse(arr, 0, len - 1);
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8 };
        int k = 3;
        rotate(arr, k);
        printArray(arr);

        //now rotate array right by k times
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8 };
        k = 2;
        k = k % arr2.length;
        rotate(arr2, arr2.length - k);
        printArray(arr2);
    }
}
