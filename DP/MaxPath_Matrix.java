package DP;

/*
 * https://www.geeksforgeeks.org/maximum-sum-path-in-a-matrix-from-top-left-to-bottom-right/
 * 
 *  int [][]grid = {{1, 2},
 *                  {3, 5}}; 
 *                  
 *      output = 9;            
 * 
 */

public class MaxPath_Matrix {
	
	public static int findMaxPath(int[][]arr)
	{
		int n = arr.length;
		int m = arr[0].length;
		int dp[][] = new int[n][m];
		
		for( int i = n-1 ;i >=0; i--)
		{
			for(int j = m-1;j >=0; j--)
			{
				if( i==n-1 && j==m-1)
				{
					dp[i][j] = arr[i][j];
				}
				else if( i == n-1)
				{
					dp[i][j] = dp[i][j+1] + arr[i][j];
				}
				
				else if( j==m-1)
				{
					dp[i][j] = dp[i+1][j] + arr[i][j];
				}
				
				else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]) + arr[i][j];
				}
				
			}
		}
			
		return dp[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1, 6, 8},
				       {13, 0, 5},
		               {9, 2, 4}}; 
		 
		int maxsum = findMaxPath(grid);
		System.out.println(maxsum);

	}

}
