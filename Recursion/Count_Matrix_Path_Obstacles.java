package Recursion;

/*
   https://leetcode.com/problems/unique-paths-ii/
   
Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right

It's an Standard problem & important

 */
public class Count_Matrix_Path_Obstacles {
	
	private static int countPaths( int mat[][])
	{
		int row = mat.length;
		int col = mat[0].length;
		
		int count[][] = new int[row][col];
		
		
		if(mat[0][0] == 0)
		{
			count[0][0] = 1;
		}
		
		//first col
		for( int i = 1 ; i < row ; i++)
		{
			if( mat[i][0] == 0)
			{
				count[i][0] = count[i-1][0];
			}
		}
		
		//first row
		for( int j = 1 ; j < col ; j++)
		{
			if( mat[0][j] == 0)
			{
				count[0][j] = count[0][j-1];
			}
		}
		
		for( int i = 1 ; i < row ; i++)
		{
			for( int j = 1; j < col ;j++)
			{
				if( mat[i][j] == 0) {
				count[i][j] = count[i-1][j] + count[i][j-1];
			    }
			}
		}
		
		return count[row-1][col-1];
	}

	public static int countPathsByRecursion(int mat[][], int i, int j, int row, int col, int dp[][]){
        if(i < 0 || i >= row || j < 0 || j >= col)
			return 0;
		if(mat[i][j] == 1)
			return 0;

		if(i == row -1 && j ==col - 1){
		   return 1;
	    }

		if(dp[i][j] != 0){
			return dp[i][j];
		}
		int right = countPathsByRecursion(mat, i, j+1, row, col, dp);
		int down = countPathsByRecursion(mat, i+1, j , row, col, dp);
        return dp[i][j] = right +down;
		//return right + down;

	}

	public static void main(String[] args) {
		int mat[][] = {{0,1,0},{0,0,1},{0,0,0}};

		int paths = countPaths(mat);
		System.out.println(paths);

		int dp[][] = new int[mat.length][mat[0].length];
		int totalPaths = countPathsByRecursion(mat, 0, 0, mat.length, mat[0].length, dp);
		System.out.println(totalPaths);
	}

}
