package DP;

/* https://www.geeksforgeeks.org/unique-paths-in-a-grid-with-obstacles/
 * 
  An obstacle and space is marked as 1 and 0 respectively in the grid.

1. Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
   Output: 2
Explanation: There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right


2. Input: obstacleGrid = [[0,1],[0,0]]
   Output: 1
   
 */
public class Matrix_path_With_Obstacle {

	public static void main(String[] args) {
		
		int obstacleGrid[][] = {{0,1,0,0}, {0,0,0,1},{0,1,0,1},{0,0,0,0}};
		
		int row = obstacleGrid.length;
		int col = obstacleGrid[0].length;
		int dp[][] = new int[row][col];
        
		if(obstacleGrid[0][0]==0)
        {
            dp[0][0] = 1;
        }
        
		for(int i = 1 ; i < row ; i++)
		{
            if(obstacleGrid[i][0]==0)
			  dp[i][0] = dp[i-1][0];
		}
		
		for( int j = 1 ; j < col ; j++)
		{
           if(obstacleGrid[0][j]==0)
		   dp[0][j] = dp[0][j-1];
		}
		
		for( int i = 1; i < row ; i++)
		{
			for( int j = 1; j < col ; j++)
			{
                if(obstacleGrid[i][j]==0)
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		
		System.out.println(dp[row-1][col-1]);
	}

}
