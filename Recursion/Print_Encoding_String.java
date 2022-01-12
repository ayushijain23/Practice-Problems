package Recursion;

public class Print_Encoding_String {
	
	private static void printEncoding(String str, String res)
	{
		if( str.length() == 0)
		{
			System.out.println(res);
			return;
		}
		
		else if(str.length() == 1)
		{
			char first = str.charAt(0);
			if( first == '0') {
			
				return;
			}
			
			else {
				
				int ch = first - '0';
				char code = (char)('a' + ch - 1 );
				System.out.println(res + code);
			}
		}
		
		else {
			
			char first = str.charAt(0);
			if( first == '0') {
			
				return;
			}
			
			else {
			
				int ch = first - '0';
				char code = (char)('a' + ch - 1);			
			    printEncoding(str.substring(1), res + code);
		    }
			
		String ch12 = str.substring(0,2);
		int ch = Integer.parseInt(ch12);
		if( ch <= 26)
		{
			char code = (char)('a' + ch - 1);
			printEncoding(str.substring(2), res + code);
		}
	}
		
}

	public static void main(String[] args) {
		String str = "123";
		
		printEncoding(str, "");
		
	}

}
