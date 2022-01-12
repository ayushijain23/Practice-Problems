package Number_System;

public class Hexa_To_Decimal {
	
	public static String hexaToDecimal(String input)
	{
		String res = "";
		
		int base = 1;
		int dec = 0;
		
		for ( int i = input.length()-1 ;i >= 0;i--)
		{
			
			if( input.charAt(i) >= '0' && input.charAt(i) <= '9')
			{
				dec = dec + (input.charAt(i) - 48) * base;
				base *= 16;
			}
			
			else if(input.charAt(i) >= 'A' && input.charAt(i)<= 'F')
			{
				dec = dec + (input.charAt(i) - 55) * base;
				base = base*16;
				
			}
		}
		//System.out.println(dec);
		
		res = Integer.toString(dec);	
		return res;
	}
	
	
	public static String decToHexa(int dec)
	{
		
	  String res = "";
	  while(dec != 0)
	  {
		 int temp = dec  % 16;
		 
		 if( temp < 10)
		 {
			 res = res + Character.toString((char)(temp + 48));
		 }
		 
		 else
		 {
			 res = res + Character.toString((char)(temp + 55));
		 }	 
		 dec = dec /16;
		 
	  }
     //  System.out.println(res);
	  return res;
	  
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hexadecimal to decimal
       String input1 = "A1";
       String output1 = hexaToDecimal(input1);
       System.out.println(output1);
       
       
    //  decimal to Hexadecimal 
      int input2 = 161;
       String output2 = decToHexa(input2);
       System.out.println(output2);
            
       
	}

}
