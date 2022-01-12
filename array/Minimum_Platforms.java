package array;


/*
 * This problem is same, for minimum platforms and minimun no of meeting rooms
 * 
 * Given arrival and departure times of all trains that reach a railway station, 
 * the task is to find the minimum number of platforms required for the railway station so that no train waits.
 * 
 * 
 * https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
 */
import java.util.ArrayList;
import java.util.Arrays;


public class Minimum_Platforms {
	
	private static int findPlatforms( int arr[], int dep[])
	{
		Arrays.sort(arr);
		Arrays.sort(dep);
		int platforms = 1;
		int count = 1;
		int i = 1, j= 0;
		while( i < arr.length && j < dep.length)
		{
			if( arr[i] <= dep[j])
			{
				i++;
				count++;
			}
			
			else if( arr[i] > dep[j])
			{
				count--;
				j++;
			}
			
	   platforms = Math.max(platforms,count );	
		}
		
		return platforms;
	}

	public static void main(String[] args) {
		int N = 6 ;
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
	    int dep[] = {910 ,1200, 1120, 1130, 1900, 2000};
	    
	    int result = findPlatforms( arr, dep);
	    System.out.println(result);
	    
	    
	    int arr2[] = {0, 5, 15};
	    int dep2[] = {30, 10, 20};
	     result = findPlatforms( arr2, dep2);
	    System.out.println(result);
	    
	    int arr3[] = {1,18,15,4,2,5};
	    int dep3[] = {18,23,29,15,11,13};
	     result = findPlatforms( arr3, dep3);
	    System.out.println(result);
	   
	}

}
