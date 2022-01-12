package Recursion;

public class lengthOfString {
	public static int recLen(String str)
	{
		if (str.equals("")) 
            return 0; 
        else
            return recLen(str.substring(1)) + 1; 
	}
	
	//return recLen(str.substring(1)) + 1; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "geeksforgeeks";
//         String s1="ayushi";
//         System.out.println(s1.compareTo("ajay"));
         System.out.println(recLen(str));
	}
	
	

}
