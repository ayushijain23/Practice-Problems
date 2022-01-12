package Recursion;
//example
public class CountConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "geeks ayushi"; 
		 int n = str.length();
		// System.out.println(n);
	        System.out.println(totalConsonants(str,n));
	}

	 static boolean isConsonant(char ch)
	 {
		 ch = Character.toUpperCase(ch);
			if(!(ch == 'A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U') && ch>=65 && ch<=90)
				return true; 
			
			else
				return false;
	 }
	
	private static int totalConsonants(String str, int n) {
		
		if(n==1)
		{
			if(isConsonant(str.charAt(0)))
				return 1;
			else
				return 0;
		}
		
		if(isConsonant(str.charAt(n-1)))
			return totalConsonants(str,n-1) + 1;
		
		else
			return totalConsonants(str,n-1);
			
	

	}

}
