package array;
import java.util.*;
import java.io.*;


public class example {
	
	  static boolean findIteminSource1(List<String> sourceOne ,String item)
      {
      	for(String str : sourceOne)
      	{
      		if(str.equals(item))
      			return true;
      	}
      	
      	return false;
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     
            
        List<String> sourceOne = new ArrayList<>();
        
        List<String> sourceTwo = new ArrayList<>();
        
        List<String> items = new ArrayList<>();
        
        sourceOne.add("a");
        sourceOne.add("b");
        sourceOne.add("c");
        
        sourceTwo.add("x");
        sourceTwo.add("y");
        sourceTwo.add("z");
        
        items.add("x");
        items.add("y");
        items.add("c");
        
        
   
    
         List<String> result = new ArrayList<>();
        
      
        
        for( String item : items)
        	
        {
        	if( findIteminSource1(sourceOne,item))
        	{
        		result.add("source1");
        	}
        	
        	else
        		result.add("source2");
        	
        	
        }
        
        System.out.println(result);
        
  for( String item : result)
        	
        {
        	System.out.println(item+" ");
        	
        	
        }
        

        
	}

}
