package Recursion;

import java.util.ArrayList;

public class MatPath {
    
	private static ArrayList<String>findPaths( int arr[][], int i, int j, int n)
	{
		ArrayList<String> hpaths = new ArrayList<>();
		ArrayList<String> vpaths = new ArrayList<>();
		
		if(i == n-1 && j == n-1)
		{
			ArrayList<String> res = new ArrayList<>();
			res.add(Integer.toString(arr[i][j]));
			return res;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		if(j < n-1)
		{
			hpaths = findPaths(arr,i,j+1,n);
		}
		
		if( i < n-1)
		{
			vpaths = findPaths(arr,i+1,j,n);
		}
		
		for( String val : hpaths)
		{
			list.add(Integer.toString(arr[i][j])+val);
		}
		
		for( String val : vpaths)
		{
			list.add(Integer.toString(arr[i][j])+val);
		}
		
		return list;
		
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int n = arr.length;
		System.out.println(n);
		ArrayList<String> list = new ArrayList<>();
		list = findPaths(arr,0,0,n);
        System.out.println(list);
	}

}
