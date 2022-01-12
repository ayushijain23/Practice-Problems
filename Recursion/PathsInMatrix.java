package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PathsInMatrix {
	
	private static ArrayList<String> findPaths(int i, int j, int mat[][], int m, int n)
	{
		ArrayList<String> hpath = new ArrayList<>();
		ArrayList<String> vpath = new ArrayList<>();
		
		if( i == m-1 && j == n-1)
		{
			ArrayList<String> res =  new ArrayList<String>();
			res.add("");
			return res;
		}
		
		if( j < n-1)
		{
		hpath = findPaths(i, j+1, mat, m, n);
		}
		
		if( i < m-1)
		{
		vpath = findPaths(i+1, j, mat, m, n);
	    }
		
		ArrayList<String> res = new ArrayList<>();
		
		for(String val : hpath)
		{
			res.add('h'+val);
		}
		
		for(String val : vpath )
		{
			res.add('v' + val);
		}
		
		return res;
		
	}	

	
	private static ArrayList<String> findPaths2(int i, int j, int mat[][], int m, int n)
	{
		ArrayList<String> hpath = new ArrayList<>();
		ArrayList<String> vpath = new ArrayList<>();
		
		if( i == m-1 && j == n-1)
		{
			ArrayList<String> res =  new ArrayList<String>();
			res.add(Integer.toString(mat[i][j]));
			return res;
		}
		
		if( j < n-1)
		{
		hpath = findPaths2(i, j+1, mat, m, n);
		}
		
		if( i < m-1)
		{
		vpath = findPaths2(i+1, j, mat, m, n);
	    }
		
		ArrayList<String> res = new ArrayList<>();
		
		for(String val : hpath)
		{
			res.add(Integer.toString(mat[i][j])+val);
		}
		
		for(String val : vpath )
		{
			res.add(Integer.toString(mat[i][j])+val);
		}
		
		return res;
		
	}	

	private static ArrayList<String> findPaths3(int mat[][], int i , int j, int m, int n)
	{
		ArrayList<String> hpaths = new ArrayList<>();
		ArrayList<String> vpaths = new ArrayList<>();
		
		if( i == m-1 &&  j == n-1)
		{
			ArrayList<String> res = new ArrayList<>();
			res.add(Integer.toString(mat[i][j]));
			return res;
		}
		
		if( j < n-1)
		{
			hpaths = findPaths3(mat, i, j+1, m, n);
		}
		
		if( i < m-1)
		{
			vpaths = findPaths3(mat, i+1, j, m ,n);
		}
		
		ArrayList<String> res = new ArrayList<>();
		
		for(String str : hpaths)
		{
			res.add(Integer.toString(mat[i][j])+str);
		}
		
		for(String str : vpaths)
		{
			res.add(Integer.toString(mat[i][j])+str);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	
	int mat[][] = new int[m][n];
	for (int i = 0;i < m ;i++)
	{
		for( int j = 0; j < n; j++)
		{
			mat[i][j] = sc.nextInt();
		}
	}
	
	
	ArrayList<String> result = findPaths(0,0,mat,m,n);
    System.out.println(result);
    
	 result = findPaths2(0,0,mat,m,n);
    System.out.println(result);
    
    result = findPaths3(mat,0,0,m,n);
    System.out.println(result);
	}

}
