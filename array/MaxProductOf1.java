package array;
/*
Problem Statement:
Find a subarray of maximum length such that the product of all the elements in the subarray is 1.

Sample input:
array size: n = 6
array = [1, -1, -1, -1, 1, 1]

Sample output:
4

array size: n = 6
array = [1, -1, -1, 1, 1, -1]

Sample output:
5

 */
public class MaxProductOf1 {
    public static int getMaxLengthOfSubarray(int arr[]) {
        int product = arr[0];
        for (int i = 1; i < arr.length; i++) {
            product *= arr[i];
        }

        if (product == 1) {
            return arr.length;
        } else {
            int i = 0;
            int j = arr.length - 1;
            while(i < arr.length) {
                if (arr[i] == -1) {
                    i++;
                    break;
                }
                i++;
            }
            while( j >= 0) {
                if (arr[j] == -1) {
                    j--;
                    break;
                }
                j--;
            }
        return Math.max(arr.length - i, j + 1);
        }
    }
    public static void main(String[] args) {
        int array[] = {1, -1, -1, 1 ,1, -1};
        int array2[] = {1, 1, 1, 1, -1, 1};
        int maxLength = getMaxLengthOfSubarray(array);
        int maxLength2 = getMaxLengthOfSubarray(array2);
        System.out.println(maxLength);
        System.out.println(maxLength2);
    }
}
