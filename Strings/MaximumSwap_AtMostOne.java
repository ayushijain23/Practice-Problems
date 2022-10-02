package Strings;

import java.util.HashMap;

// https://leetcode.com/problems/maximum-swap/

public class MaximumSwap_AtMostOne {
    public static void swap(char temp[], int left, int right){
        char ch = temp[left];
        temp[left] = temp[right];
        temp[right] = ch;
    }

    public static int largestNum(int num){
        int left = -1, right = -1, maxIndex = -1,  maxNum = -1;
        char temp[] = Integer.toString(num).toCharArray();

        for(int i = temp.length - 1; i >= 0; i--){
            if(temp[i] > maxNum){
                maxNum = temp[i];
                maxIndex = i;
            }

            else if(temp[i] < maxNum){
                left = i;
                right = maxIndex;
            }
        }

        if(left == -1){
            return num;
        }
        swap(temp, left, right);
        return Integer.parseInt(String.valueOf(temp));
    }
    public static void main(String[] args) {
        int num = 789;
        System.out.println(largestNum(num));
        num = 49658;
        System.out.println(largestNum(num));
        num = 2135;
        System.out.println(largestNum(num));
        num = 5432;
        System.out.println(largestNum(num));
    }
}
