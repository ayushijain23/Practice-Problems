package Recursion;

import java.util.ArrayList;

public class GetSequences {

	private static ArrayList<String> getSequences(String str)
	{
		if( str.length() == 0)
		{
			ArrayList<String> res =  new ArrayList<String>();
			res.add("");
			return res;
		}
		
		char temp = str.charAt(0);
		ArrayList<String> rom = getSequences(str.substring(1));
		ArrayList<String> res = new ArrayList<>();
		
		for( String val : rom)
		{
			res.add(temp + val);
			res.add(val);
		}
		
//		for( String val : rom)
//		{
//			res.add(val);
//		}
		return res;
	}
	
	public static void main(String[] args) {
		
		String input = "abc";
		
		ArrayList<String> res = getSequences(input);
		res.remove("");
		System.out.println(res);

	}

}
