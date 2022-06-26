package Strings;

import java.util.HashMap;
import java.util.Map;

/*
Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.

Return the minimum number of steps to make t an anagram of s.

An Anagram of a string is a string that contains the same
 characters with a different (or the same) ordering.
Example 1:

Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
Example 2:

Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
 */
public class Equal_Anagrams {

	public static void main(String[] args) {
		String s = "leetcode";
		String t = "practice";
		
		int count[] = new int[26];
        int sum = 0;
        for( int i = 0 ; i < s.length() ; i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for( int i = 0 ; i <26 ; i++)
        {
            if( count[i] >=1)
            {
                sum = sum + count[i];
            }
        }
        System.out.println(sum);
	}

}
