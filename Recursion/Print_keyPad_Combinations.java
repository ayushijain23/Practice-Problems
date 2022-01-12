package Recursion;

public class Print_keyPad_Combinations {
	static String digits[] = { ",;","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz" };
	
	private static void printCombinations(String str, String res)
	{
		if(str.length() == 0)
		{
			System.out.print(res+" ");
			return;
		}
		
		char ch = str.charAt(0);
		String temp = digits[ch - '0'];
		
		for( int i = 0 ; i < temp.length() ; i++)
		{
			printCombinations(str.substring(1), res + temp.charAt(i));
		}
	}
	public static void main(String[] args) {

		String str = "123";
		String res = "";
		
		printCombinations(str, res);

	}

}
