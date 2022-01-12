package Strings;

public class Encode_String {
	 private static String encodeStr(String str, int k)
	 {
		 String result = "";
		 
		 for( int i = 0;i<str.length();i++)
		 {
			 
			 int val = str.charAt(i);
			// char ch = str.charAt(i);
			 
			 int temp = k;
	 
			 // if val+k exceeds z
			 if(val + k > 122)
			 {
				 k = k + val -122;
				 k= k%26;
				 result+= (char)(96 + k);							 
			 }
			 
			 else
			 {
				 result += (char)(k + val);
				 
			 }
			 
			 k = temp;
			 
		 }
		 return result;
		 
	 }

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "xyz";
       int k = 1;
       
       String result = encodeStr(str,k);
       System.out.println(result);
	}

}
