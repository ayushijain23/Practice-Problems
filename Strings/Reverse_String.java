package Strings;

import java.util.Stack;

/*
   Reverse words in a string - 
    Input - 
 */
public class Reverse_String {
	
	//Method 1 - with stack( can't handle whitespaces - " Hello World  "
	private static String reverse(String str)
	{
		Stack<Character> stack = new Stack<>();
		int i = 0;
		String res = "";
		while( i < str.length())
		{
			stack.push(str.charAt(i));
			i++;
		}
		
		String temp ="";
		while( !stack.isEmpty())
		{
			char ch = stack.pop();
			if( ch == ' ') {
			
				res = res + temp + ch;
				//System.out.println(res);
				temp = "";
			}
			else {
			temp = ch + temp;
			}
			
		}
		res = res + temp;
		//System.out.println(res);
		return res;
	}
	
	//Method -2 (efficient)
	private static String reverseByStringArray(String s)
	{
		    s.trim();
	        String str[] = s.split(" "); 
	        
	        StringBuilder sb = new StringBuilder();
	        for(int i=str.length-1;i>=0;i--)
	        {    
	            str[i].trim();
	            if( str[i].equals(""))
	              continue;
	         
	          sb.append(str[i]+" ");
	        }
	     
	        s = sb.toString();
	        s.trim();
	        return s;
	          
	}

	public static void main(String[] args) {
		//Method 1
		String str = "I love my Parents";
		str = reverse(str);
		System.out.println(str);
		
		str = "I love   my   Parents  ";
		str = reverseByStringArray(str);
		System.out.println(str);
	}

}
