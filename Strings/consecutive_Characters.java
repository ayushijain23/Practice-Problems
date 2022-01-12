package Strings;


/*
 Link -
  https://leetcode.com/problems/consecutive-characters/
  
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

Done

 */
public class consecutive_Characters {
	
	private static int maxPower(String s)
	{
		int result = 0;
		int len = s.length();
		int count = 1;
		for( int i =0; i<len; i++)
		{
			if(i==len-1 || s.charAt(i)!=s.charAt(i+1))
			{
				result = Math.max(result, count);
				count = 1;
			}
			
			else {
				count++;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input = "leetcode";
       System.out.println(maxPower(input));
	}

}
