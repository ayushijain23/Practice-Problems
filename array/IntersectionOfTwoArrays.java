/*
Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
 */
package array;

import java.util.*;

public class IntersectionOfTwoArrays {
   
    public static int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for( int i = 0;i<nums1.length;i++)
        {
            if(!map.containsKey(nums1[i]))
            {
                map.put(nums1[i], 1);
            }
        }
        int i = 0;
    
        
        for( int j = 0;j<nums2.length;j++)
        {
            if(map.containsKey(nums2[j]) && map.get(nums2[j])>0)
            {
                list.add(nums2[j]);
                map.put(nums2[j],-1);
             
             }
        }
       int result[] = new int[list.size()];
       for( i = 0; i < list.size(); i++)
       {
           result[i] = list.get(i);
       }
       return result;
    }
    
    //Method 2
    private static int[] findIntersection( int arr1[], int arr2[])
    {
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	HashSet<Integer> set = new HashSet<>();
    	for(int i : arr1)
    	{
    		set.add(i);
    	}
    	for( int i : arr2)
    	{
    		if(set.contains(i))
    		{
    			list.add(i);
    			set.remove(i);
    		}
    	}
    	
    	int result[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }
        return result;	
    }
    private static void printArray( int arr[])
    {
    	for( int i : arr)
    	{
    		System.out.print(i+" ");
    	}
    }
    
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1,3};
        int nums2[] = {2,2,3,1};
        
        int result[] = intersection(nums1, nums2);
        printArray(result);
        System.out.println();
        
        int result2[] = findIntersection(nums1, nums2);
        printArray(result2);
       
    }
}
