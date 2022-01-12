package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Path_With_Obstacle {
	private static List<String> findPaths( int mat[][], int i, int j, int m, int n)
	{
		if( i == m-1 && j ==n-1)
		{
			if(mat[i][j] == 0) {
			List<String> res = new ArrayList<>();
			res.add("");
			return res;
		   }
			else return new ArrayList<>();
		}
		
		List<String> vpaths = new ArrayList<>();
		List<String> hpaths = new ArrayList<>();
		
		if( i < m-1 && mat[i+1][j] == 0)
		{
			vpaths = findPaths(mat, i+1, j, m,n);
		}
		
		if( j < n-1 && mat[i][j+1] == 0)
		{
			hpaths = findPaths(mat, i, j+1, m, n);
		}
		
		List<String> res = new ArrayList<>();
		
		for( String str : hpaths)
		{
			res.add("h"+str);
		}
		
		for( String str : vpaths)
		{
			res.add("v"+str);
		}
		
		return res;
	}

	public static void main(String[] args) {
		int mat[][] = {{0,0,0},{0,1,0},{0,0,0}};
		//int mat[][] = {{1,0}};
		int m = mat.length;
		int n = mat[0].length;
		List<String> list = findPaths(mat,0,0,m,n);
        System.out.println(list);
	}

}
