package Strings;

/*
 * Find all permutations of a string
 * Input:  String str = "abc";
 * Output : abc,abc,bac,bca,cab,cba;
 
 
 
 
 * 
 */

public class Permutations_Strings {
	
	public static void allPermutations(String str)
	{
		permute(str, 0, str.length()-1);
		System.out.println();
	}
	
	public static void permute(String str, int l, int r)
	{
		if(l==r)
		{
			System.out.print(str+" ");
		}
		
		else {
		
		for( int i = l; i <= r; i++)
		{
			str = swap(str, i, l);
			permute(str, l+1, r);
			str = swap(str, i, l);
		}
	  }
	}	
	public static String swap(String str, int i, int j)
	{
		char temp ;
		char array[] = str.toCharArray();
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
		return String.valueOf(array);	
	}
	
	public static void findAllPermutations2(String str, String sofar)
	{   
		if(str.length()==0)
		{
			System.out.print(sofar+" ");
		}
		
		else {
		for( int i = 0; i<str.length(); i++)
		{
			char temp = str.charAt(i);
			
			String left = str.substring(0,i);
			String right = str.substring(i+1);
			
			String rem = left+right;
			
			findAllPermutations2(rem, sofar + temp );
		}
	  }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		
		allPermutations(str);       // first method (by swapping)
		findAllPermutations2(str, "");   // second method(by subString)
		
		System.out.println();		
		System.out.println(str);

	}

}
