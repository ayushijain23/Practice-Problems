package Recursion;

import java.util.ArrayList;

public class Keypad_Combinations {
	static String digits[] = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	
	// Method - 1 ( by recursion using first char of string each time)
	private static ArrayList<String> findCombination(String input) {
		if (input.length() == 0) {
			ArrayList<String> res = new ArrayList<String>();
			res.add("");
			return res;
		}

		char temp = input.charAt(0);
		String rstr = input.substring(1);

		ArrayList<String> rem = findCombination(rstr);
		ArrayList<String> res = new ArrayList<String>();

		String dig = digits[temp - '0'];
		for (int i = 0; i < dig.length(); i++) {
			char tt = dig.charAt(i);

			for (String val : rem) {
				res.add(tt + val);
			}
		}

		return res;
	}
	
	//Method -2 
	
	private static void findCombi2(ArrayList<String> result, String input, int index, String curr, String[] digits)
	{
		if( index == input.length())
		{
			result.add(curr);
			return;
		}
		
		char ch = input.charAt(index);
		String str = digits[ ch - '0'];
		for( int i = 0; i < str.length() ;i++)
		{
			char temp = str.charAt(i);
			findCombi2(result, input, index + 1, curr + temp , digits);
		}
		
	}
	

	public static void main(String args[]) {

		String input = "234";
		ArrayList<String> res = findCombination(input);
		System.out.println(res);

		input = "67";
		res = findCombination(input);
		System.out.println(res);
		
		
		// by Method 2
		ArrayList<String>result = new ArrayList<>();
		input = "67";
		findCombi2(result, input, 0, "", digits);
		System.out.println(result);
	}

}
