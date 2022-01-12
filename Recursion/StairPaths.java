package Recursion;

import java.util.ArrayList;

//we are at the stair n and want to reach at ground level 
//1 and 2 steps are valid
//like from stair 3, we can move to n=2 or n=1
//so total paths from n=3 are ( "1,1,1", "2,1", "1,2")
// store all paths in a list
public class StairPaths {

	private static ArrayList<String> findPaths(int n)
	{
	    if(n == 0)
	    {
	    	ArrayList<String> res = new ArrayList<>();
	    	res.add("");
	    	return res;
	    }
	    
	    if(n < 0)
	    {
	    	ArrayList<String> res = new ArrayList<>();
	    	return res;
	    }
	    
		ArrayList<String> paths1 = findPaths(n-1);
		ArrayList<String> paths2 = findPaths(n-2);
		
		ArrayList<String> res = new ArrayList<>();
		
		for( String path : paths1)
		{
			res.add(Integer.toString(1)+path);
		}
		
		for( String path : paths2)
		{
			res.add(Integer.toString(2)+path);
		}
		
		return res;
		
	}
	public static void main(String[] args) {
     int n = 4;
     
     ArrayList<String> result = findPaths(n);
     System.out.println(result);

	}

}
