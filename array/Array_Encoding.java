package array;

import java.util.HashMap;
//test1



public class Array_Encoding {
	private static String runEncoding(String input)
	{
		String temp = "";
		temp+=input.charAt(0);
		int count = 1;
		
		for ( int i = 1; i<input.length(); i++)
		{
			
			if(input.charAt(i)!=input.charAt(i-1))
			{
				temp = temp + Integer.toString(count);
				//System.out.println(temp);
				temp = temp + input.charAt(i);
				count = 0;
				
			}
			
			count++;				
		}
		temp+=count;
		
		return temp;
		
	}
	
	private static String run(String str)
	{
		String res = "";
		res+=str.charAt(0);
		
		int count = 1;
		
		for( int i = 1 ; i < str.length() ;i++) {
			
			if( str.charAt(i) == str.charAt(i-1))
			{
				count++;
			}
			
			else
			{
				res = res + count;
				res = res + str.charAt(i);
				count = 1;
			}
				
		}
		res = res + count;
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String input = "aaaabbccdwwwwaaadexxxxxxywww";
      
      //String output = runEncoding(input);
      String output = run(input);
      System.out.println(output);
	}

}
