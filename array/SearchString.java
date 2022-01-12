package array;

import java.util.ArrayList;
import java.util.List;

public class SearchString {
	public static boolean match(List<String> a, String b)
	{  System.out.println(b);
		for( String str : a)
		{
			if(!str.equals(b))
            {
	System.out.println("equal");
	return true;
               }
			
		}
		//System.out.println(b);
		
		return false;
	}
	
	public static void FindWord(String str[], String word)
	{  
	 
		 for(int i = 0;i < str.length;i++)
	       {  
			 List<String> list = new ArrayList<>();
			String  temp = str[i];
			// System.out.println(input[i]);
			 String var = "";
			 for( int j = 0;j<temp.length();j++) {
				 
			 if(temp.charAt(j)==' ')
			 {
				 list.add(var);
				 var = "";
			 }
			 
			 var = var+temp.charAt(j);
			 
	       }
			 System.out.println(list);
			 //System.out.println(list);
			 if(match(list,word))
				 System.out.println(i);
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String input = "Google LLC is an American multinational technology company that specializes\n" + 
   		"in Internet-related services and products which include online advertising\n" + 
   		"technologies a search engine cloud computing software and hardware\n" + 
   		"It is considered one of the Big Five technology companies in the\n" + 
   		"information technology industry";
   
   
       //
       int lineCount = 0;
      
       String str[] = input.trim().split("\\n");
       FindWord(str, "technology");
       
      
	}

}
