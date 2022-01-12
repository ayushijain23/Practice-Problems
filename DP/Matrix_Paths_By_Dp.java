package DP;

public class Matrix_Paths_By_Dp {

	public static void main(String[] args) {
		
		int mat[][] = {{1,2,3},{4,5,6}};
		
		int row = mat.length;
		int col = mat[0].length;
		int dp[][] = new int[row][col];
		
		for(int i = 0 ; i < row ; i++)
		{
			dp[i][0] = 1;
		}
		
		for( int j = 0 ; j < col ; j++)
		{
			dp[0][j] = 1;
		}
		
		for( int i = 1; i < row ; i++)
		{
			for( int j = 1; j < col ; j++)
			{
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		
		System.out.println(dp[row-1][col-1]);

	}

}
