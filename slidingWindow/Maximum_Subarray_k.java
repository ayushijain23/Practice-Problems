package slidingWindow;

/*
https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/
 */
public class Maximum_Subarray_k {
    public static int maxSum(int arr[], int n, int k){
        int i = 0, j = 0;
        int sum = 0;
        int ms = Integer.MIN_VALUE;

        while(j < n){
            sum+= arr[j];

            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                ms = Math.max(sum, ms);
                sum = sum - arr[i];
                j++;
                i++;
            }
        }
        return ms;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 10, 2, 3, 1, 4, 15};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
