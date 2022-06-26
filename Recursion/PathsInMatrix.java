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


	public static void solve(int mat[][], int i, int j, int m, int n, ArrayList<String> result, String move){

		if(i == m-1 && j ==n-1){
			move = move + Integer.toString(mat[i][j]);
			result.add(move);
			return;
		}

		if( i < m-1 && i >= 0){
			solve(mat, i+1, j, m, n, result, move +Integer.toString(mat[i][j]));
		}

		if(j < n-1 && j >= 0){
			solve(mat, i, j+1, m, n, result, move + Integer.toString(mat[i][j]));
		}
	}

	public static void solve2(int mat[][], int i, int j, int m, int n, int di[], int dj[], ArrayList<String> result, String move){

		if(i == m-1 && j ==n-1){
			result.add(move);
			return;
		}
        String dir = "HV";
		for(int l = 0; l < dir.length(); l++) {
			int nexti = i + di[l];
			int nextj = j + dj[l];
			if (nexti < m && nexti >= 0 && nextj < n && nextj >= 0) {
				solve2(mat, nexti, nextj, m, n, di, dj, result, move + dir.charAt(l));
			}
		}
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

	//Another method
	ArrayList<String> resultPaths = new ArrayList<>();
	solve(mat, 0, 0, m, n, resultPaths, "");
		System.out.println(resultPaths);

		int di[] = {0, 1};
		int dj[] = {1, 0};

		ArrayList<String> resultPaths2 = new ArrayList<>();
		solve2(mat, 0, 0, m, n , di, dj, resultPaths2, "");
		System.out.println(resultPaths2);

	}





}
