package Sorting;


/*Sort the urls by frequency
 * 
 * Input -                                             
n = 5
https://www.hackerearth.com                            
https://www.wikipedia.org
https://www.google.com
https://www.hackerearth.com
https://www.hackerearth.com
 
 
OutPut- 
3
https://www.hackerearth.com
https://www.google.com
https://www.wikipedia.org


done!
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Sort_URLs_By_Frequency {
	
	public static void printList(List<String> list)
	{
		for(String res : list)
	    {
	    	System.out.println(res);
	    }
	}
	
	public static List<String> sortURL(int n, String[]input)
	{
		HashMap<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		for(String str : input)
		{
		if(map.containsKey(str))
		{
		   int val = map.get(str);
		   map.put(str, val+1);
		}
		else
		{
		map.put(str, 1);
		list.add(str);
		}
	     }

		Collections.sort(list, new Comparator<String>(){
		  public int compare(String a, String b)
		  {
		    int x = map.get(a);
			int y = map.get(b);
			
			if(x==y)
			   return a.compareTo(b);
			   
			  else 
			   return y-x;   
		  
		  }
		});
		
		return list;
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	int n = Integer.parseInt(br.readLine());
	//	String input[] = new String[n];
		
	String input[] = {
			          "https://www.hackerearth.com",                          
		              "https://www.wikipedia.org",
			          "https://www.google.com",
			          "https://www.hackerearth.com",
			           "https://www.hackerearth.com",
			           "https://www.wikipedia.org",
			           "https://www.wikipedia.org",
			           "https://www.stackoverflow.com" };
	
	    int n = input.length;
	
	    List<String>sortedURLs = sortURL(n,input);
	    
	    System.out.println(sortedURLs.size());
	    
	    printList(sortedURLs);
	    
	}
}
