package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubSequence_String {
	
	private static HashSet<String> sequence(String str)
	{
		if(str.length()== 0)
		{
			//System.out.println("hello");
			//List<String> ss = new ArrayList<String>();
			HashSet<String> ss = new HashSet<String>();
			ss.add("");
			return ss;
			
		}
		
		char temp = str.charAt(0);
		HashSet<String> rem = sequence(str.substring(1));
		HashSet<String> res = new HashSet<String>();
		
		for( String val : rem)
		{
			//System.out.println(val);
			res.add(val);
		}
		
		for( String val : rem)
		{
			res.add(temp + val);
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input = "abc";
        
        HashSet<String> result = new HashSet<String>();
        
        result = sequence(input);
        result.remove("");
        System.out.println(result);
        
        
        input = "ad";
        result = sequence(input);
        result.remove("");
        System.out.println(result);
	}

}
