package Strings;

import java.io.IOException;

public class String_pool {

	public static final int end =Integer.MAX_VALUE;
	public static final int start =end - 100;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      final String abc = "length: 10";
      final String bcd = "length: "+abc.length();
      
      System.out.println(abc);
      System.out.println(bcd);
      
      
      System.out.println(abc==bcd);
      System.out.println(abc.equals(bcd));
		
		

	}

}
