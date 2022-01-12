package Recursion;

public class Subsequences_Print {
	
	private static void printSequence(String input, String res)
	{
		if(input.length() == 0)
		{
			System.out.print(res+" ");
			return;
		}
		
		char temp = input.charAt(0);
		
		printSequence( input.substring(1), res + temp);
		printSequence( input.substring(1), res);
	}

	public static void main(String[] args) {
		String input = "abc";
		String res = "";
		printSequence(input, res);
		
	}

}
