package array;

public class Testnew {

	public static void main(String[] args) {
		String str = "aaabaaac";
		
		int len = str.length();
		int result = 0;
		for( int i = 0;i<len;i++)
		{
		  for(int j = i+1;j<len;j++)
		  { 
		     boolean f = false;
		     int end = j;
		     for( int k = i;k<=j/2;k++)
			 {   
			    
			    	if(str.charAt(k)== str.charAt(end--))
					 {
					   f = true;
				     }
			    	
			    	else
			    	{
			    		f = false;
			    		break;
			    	}
			  		    
		    }
		  if(f==true)
		  {
		  System.out.println(str.substring(i,j+1));
		  result = Math.max(result, j-i+1);       
		  }
		}
		  
		}
		System.out.println(result);
	}

}
