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

	public static int finsMaxPath2(int grid[][]){
		int rows = grid.length;
		int cols = grid[0].length;
		int dp[][] = new int[rows][cols];

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(i == 0 && j == 0){
					dp[i][j] = grid[i][j];
				}
				else if(i == 0){
					dp[i][j] = dp[i][j - 1] + grid[i][j];
				}
				else if(j == 0){
					dp[i][j] = dp[i - 1][j] + grid[i][j];
				}
				else{
					dp[i][j] = grid[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}

		return dp[rows -1][cols - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1, 6, 8},
				       {13, 0, 5},
		               {9, 2, 4}}; 
		 
		int maxsum = findMaxPath(grid);
		System.out.println(maxsum);

		System.out.println("2nd Method :"+finsMaxPath2(grid));

	}

}
