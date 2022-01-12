package Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mbabm";

		int i = 0;
		int len = str.length()-1;
		boolean f = true;

		while( i <= len/2 )
		{
		if( str.charAt(i) != str.charAt(len-i))
		{
		  f= false;
		  break;
		}
		i++;

		}

		if( f)
		{
		System.out.println("Yes");
		}
		
		else {
			System.out.println("No");
		}
	}

}
