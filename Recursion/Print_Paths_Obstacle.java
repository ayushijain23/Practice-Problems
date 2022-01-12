package Recursion;

import java.util.List;

public class Print_Paths_Obstacle {

	
	private static void findPaths(int[][]mat, int i , int j, int dr,int dc,String path)
	{
	
		if( i == dr && j == dc)
		{
			System.out.println(path);
		    return;
		}
		//hpaths
		if( j < dc && mat[i][j+1] == 0)
		{
			 findPaths(mat, i, j+1, dr, dc, "h"+ path);
		}
		
		//vertical paths
		if( i < dr && mat[i+1][j] == 0)
		{
			findPaths(mat, i+1, j, dr, dc, "v"+ path);
		}
		
		
	}
	public static void main(String[] args) {
		
		int mat[][] = {{0,0,0},{0,1,0},{0,0,0}};
		//int mat[][] = {{1,0}};
		int m = mat.length;
		int n = mat[0].length;
		String path = "";
		findPaths(mat, 0, 0, m-1, n-1, path);

		
	}

}
