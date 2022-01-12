package array;

import java.util.Arrays;

/*
   https://leetcode.com/problems/boats-to-save-people/
  
  Input: people = [1,2], limit = 3
  Output: 1
  Explanation: 1 boat (1, 2)
  
  
  Input: people = [3,5,3,4], limit = 5
  Output: 4
  Explanation: 4 boats (3), (3), (4), (5)
  
 */
public class Minimum_Boats {

	
	private static int findMinBoats(int [] people, int limit)
	{
		int count = 0;
		Arrays.sort(people);
		int i = 0;
		int j = people.length-1;
		// 1245
		while(i <= j)
		{
			count++;
			
			if( people[i] + people[j] <= limit)
			{
				i++;
			}
			
			j--;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int people[] = {5,1,5,2};
      int limit = 6;
      
     int boats =  findMinBoats(people, limit);
     System.out.println(boats);
	}

}
