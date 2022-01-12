package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> list = new ArrayList<>();
       String a = "is";
       list.add("ayu");
       list.add("jain");
       list.add("is");
       list.add("strong");
       list.add("girl");
       
       System.out.println(list);
       
       for(String str : list)
       {
    	   if(str.equals(a))
    	   {   System.out.println(a);
    		   System.out.println("equal");
    	   }
       }
	}

}
