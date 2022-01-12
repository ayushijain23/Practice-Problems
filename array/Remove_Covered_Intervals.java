/*
 
Given a list of intervals, remove all intervals that are covered by another interval in the list.


Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.

After doing so, return the number of remaining intervals.

Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.

Question Link - https://leetcode.com/problems/remove-covered-intervals/
 */
package array;
import java.util.*;

public class Remove_Covered_Intervals {
    
    public static int removeCoveredIntervals(int[][] intervals)
    {
         Arrays.sort(intervals, new Comparator<int[]>(){
        
         @Override
         public int compare(int[]x, int[]y)
         {
             if(x[0] == y[0])
                  return y[1]-x[1];
             else
             return x[0]-y[0];
             
         }
     });
        
        int maxEnd = 0;
        int ans = intervals.length;
        for( int[]temp : intervals)
        {
            int currEnd = temp[1];
            
            if(currEnd <= maxEnd)
                ans--;
            
            else 
                maxEnd = currEnd;
                
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int [][] intervals = {{1,4},{3,6},{2,8}};
        int [][] intervals2 = {{1,4},{2,3}};
        int [][] intervals3 = {{1,2},{2,3},{4,6},{1,5}};
        
        int result = removeCoveredIntervals(intervals);
        System.out.println(result);
        System.out.println(removeCoveredIntervals(intervals2));
        System.out.println(removeCoveredIntervals(intervals3));
    }
    
}
