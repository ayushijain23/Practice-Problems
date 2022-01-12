package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Villain_hero {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-->0)
      {
    	  int n = Integer.parseInt(br.readLine());
    	  
    	  String vil = br.readLine();
    	  String hero = br.readLine();
    	  
    	  String str1[] = vil.trim().split(",");
    	  String str2[] = hero.trim().split(",");
    	  
    	  int arr1[] = new int[str1.length];
    	  int arr2[] = new int[str2.length];
    	  for(int i =0;i<str1.length;i++)
    	  {
    		  arr1[i] = Integer.parseInt(str1[i]);
    		  arr2[i] = Integer.parseInt(str2[i]);
    	  }
    	  
    	  for(int i =0;i<str1.length;i++)
    	  {
    		System.out.println(arr1[i]+"  "+arr2[i]);
    	  }
    	  
    	  Arrays.sort(arr1);
    	  Arrays.sort(arr2);
    	  boolean flag = true;
    	  for(int i = 0;i<arr1.length;i++)
    	  {
    		  if(arr1[i] >= arr2[i])
    		  {
    			  flag = false;
    			  break;
    		  }
    	  }
    	  
    	  if(flag == true)
    	  {
    		  System.out.println("WIN");
    	  }
    	  
    	  else if(flag==false)
    	  {
    		  System.out.println("LOSE");
    	  }
      }
      
	}

}
