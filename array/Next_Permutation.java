package array;

import java.util.Arrays;

/*
 https://leetcode.com/problems/next-permutation/submissions/
 
 Implement next permutation, which rearranges numbers into
  the lexicographically next greater permutation of numbers.
  
Input: nums = [1,2,3]
Output: [1,3,2]

Input: nums = [1,1,5]
Output: [1,5,1]

 */
public class Next_Permutation {

	private static void printArray(int arr[])
	{
		for( int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	
	private static void swap(int nums[], int i, int j)
	{
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private static void reverse(int nums[], int i)
    {
        int j = nums.length-1;
        while( i < j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
	
	private static void findNext(int nums[])
	{
		int i = nums.length-2;
		while( i>=0 && nums[i] >= nums[i+1])
		{
			i--;
		}
		
		if( i >= 0)
		{
			int j = nums.length -1;
			while( j>=i && nums[j] <= nums[i])
			{
				j--;
			}
			
			swap(nums,i,j);
			
		}
		
		reverse(nums,i+1);
		//or you can Array remaining array after i
		//Arrays.sort(nums,i+1,nums.length);
	}
	public static void main(String[] args) {
		int nums[] = {17,19,15,14,13};
		findNext(nums);
		printArray(nums);
	}

}
