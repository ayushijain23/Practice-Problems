package array;

/* Link - https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 * 
 * Return the number of pairs of songs for which their total duration in seconds is divisible by 60.
 * Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
 * 
 * Input: time = [30,20,150,100,40]
   Output: 3  -{(30,150),(20,100),(20,40)}
   
   Input: time = [60,60,60]
   Output: 3
   
 */
public class Songs_Pair_Sum {
	public static int findPairCount(int input[])
	{
		int count = 0;
		int arr[] = new int[60];            //becoz sum of pair must be divisble by 60
		
		for( int i : input)
		{
			if(i % 60 == 0)
			{
				count += arr[0];
			}
			
			else
			{
				count += arr[60 - (i% 60)];
			}
			arr[i % 60]++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {30,20,150,100,40};
		
		int pair = findPairCount(input);
		
		System.out.println(pair);
		
		//case 2
        int input2[] = {120,60,180,120};
		
		 pair = findPairCount(input2);
		
		System.out.println(pair);

	}

}
