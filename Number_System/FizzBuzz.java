package Number_System;
/*
Good problem
*/
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 0;
		int var2 = 0;
		for( int i = 1 ; i <= 100 ; i++)
		{
//			if( i % 15 == 0)
//			{
//				System.out.println("FizzBuzz");
//			}
//			else if( i % 3 == 0)
//			{
//				System.out.println("Fizz");
//			}
//			else if( i % 5 == 0)
//			{
//				System.out.println("Buzz");
//			}
//			else
//				System.out.println(i);
			
			
			//Method - 2
//			String d = "";
//			if( i % 3 == 0)
//		   {
//				d += "Fizz";
//				
//			}
//			
//		   if( i % 5 == 0 )
//		   {
//			   d+= "Buzz";
//		   }
//		  
//		   if( d == "")
//		   {
//			   System.out.println(i);
//		   }
//		   else {
//			   System.out.println(d);
//		   }
			
			
//			Mthod - 3
			var1++;
			var2++;
			String d = "";
			if( var1 == 3)
			{
				d+="Fizz";
				var1 = 0;
			}
			
			if( var2 == 5)
			{
				d+="Buzz";
				var2 = 0;
			}
		
			if( d == "")
			{
				System.out.println(i);
			}
			else {
				System.out.println(d);
			}
			
		}

	}

}
