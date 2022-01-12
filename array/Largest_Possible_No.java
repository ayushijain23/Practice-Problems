package array;

import java.util.Arrays;
import java.util.Comparator;

public class Largest_Possible_No {

	public static String findLargest(int arr[])
	{
		String str[] = new String[arr.length];
		for(int i = 0; i<arr.length; i++)
		{
			
			str[i] = Integer.toString(arr[i]);
		}
		
		
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String a, String b)
			{
				String xy = a + b;
				String yx = b + a;
				
				return xy.compareTo(yx) > 0 ? -1 : 1;
			}
			
		});
		
		String res = "";
		for( String input : str)
		{
			res = res + input;
		}
		
		return res;
	}
	
	public static String findLargestByString(String str[])
	{
		Arrays.sort(str, new Comparator<String>() {
		public int compare(String a, String b)
		{
				String xy = a + b;
				String yx = b + a;
				
				return xy.compareTo(yx) > 0 ? -1 : 1;
		}
			
		});
		
		String res = "";
		for( String input : str)
		{
			res = res + input;
		}
		
		return res;
	}
	public static void main(String[] args) {
		
       int arr[] = {3,34,30,9,56};
       int arr2[] = {11,11,02};
       
       String inputStr[] = {"11","12","01"};
       
       String result = findLargest(arr);
       System.out.println(result);
       
       result = findLargest(arr2);
 //      System.out.println(result);
       
       result = findLargestByString(inputStr);
       System.out.println(result);
	}

}
