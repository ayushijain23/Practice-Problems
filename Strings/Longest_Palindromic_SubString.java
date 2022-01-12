package Strings;

public class Longest_Palindromic_SubString {
	
	
	// O(n3) approach 
	private static String findPalindromicString(String str)
	{
		int start = 0;
		int maxLength = 1;
		
		for( int i = 0; i<str.length(); i++)
		{
			for(int j = i+1;  j<str.length(); j++)
			{
				boolean flag = true;
				
				for( int k = 0; k< (j-i+1)/2 ; k++)
				{
					if(str.charAt(i+k) != str.charAt(j-k)) 
					{
						flag = false;
						break;
					}
					
				}
					
				if( flag && (j-i+1) > maxLength)
				{
					maxLength = j-i+1;
					start = i;
				}
					
			}
		}
		
		String result = str.substring(start, start+maxLength);
		System.out.println(start +" "+maxLength);
		//System.out.println(result);
				return result;
	}
	
	
	private static String findEvenOdd(String str)
	{
		int n = str.length();
		
		int start = 0;
		int maxLength = 1;
		
		for( int i = 1;i<n;i++)
		{
		
			int i1 = i+1;
			int i2 = i-1;
			
			
			//odd palindrome
			while( i1<n && i2 >=0)
			{
				if(str.charAt(i2)==str.charAt(i1))
				{
					
					if(i1-i2+1 > maxLength)
				   {maxLength = i1-i2+1;
						start = i2;
						}
					
					i1++;
					i2--;
				}
				else
					break;
			}
			
			
			//even Palindrome
			i1 = i;
			i2= i-1;
			
			while( i1 <n && i2 >=0)
			{
				if(str.charAt(i1)== str.charAt(i2))
				{				
					if(i1-i2+1 >maxLength)
					   {maxLength = i1-i2+1;
							start = i2;
							}
					
					i1++;
					i2--;
				}
				else
					break;
			}
		}
		
		String res = str.substring(start, start+maxLength);
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "forgeeksskeegfor";
       
       String result = findPalindromicString(str);
       String result2 = findEvenOdd(str);
       
       System.out.println(result);
       System.out.println(result2);
	}

}
