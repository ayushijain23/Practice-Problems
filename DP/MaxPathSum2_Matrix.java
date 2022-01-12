package DP;


/*
 * 
 */
public class MaxPathSum2_Matrix {
	
	public static int findMaxPathSum(int[][]grid)
	{
		int n = grid.length;
		int m = grid[0].length;
		
		int dp[][] = new int[n][m];
		
		for(int i = n-1;i>=0;i--)
		{
			for(int j=m-1;j>=0;j--)
			{
				if(i==n-1)
				{
					dp[i][j] = grid[i][j];
				}
				
				else if(j==m-1)
				{
					dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j-1]) + grid[i][j];
				}
				
				else if(j==0 )
				{
					dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]) + grid[i][j];
				}
				
				else {
					dp[i][j] = Math.max(dp[i+1][j], Math.max(dp[i+1][j-1], dp[i+1][j+1])) + grid[i][j];
				}
							
			}
		}
		
		
//		
//		for(int i =0;i<n;i++)
//		{
//			for(int j =0;j<m;j++)
//			{
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int maxSum =Integer.MIN_VALUE;
		
		for(int i = 0;i<m;i++)
		{
			if(dp[0][i] >= maxSum)
				{//System.out.println(dp[0][i]);
				maxSum = dp[0][i];}
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			int[][] grid = {{1, 2, 3},
					       {9, 8, 7},
			               {4, 5, 6}}; 
			
			int[][]mat = {{10, 10, 2,  0,  20, 4},
	                      {1,  0,  0,  30, 2,  5},
	                      {0, 10,  4,  0,  2,  0},
	                      {1,  0,  2,  20, 0,  4}};
			 
			int maxsum = findMaxPathSum(grid);
			System.out.println(maxsum);
			
			System.out.println(findMaxPathSum(mat));
		
	}
}
