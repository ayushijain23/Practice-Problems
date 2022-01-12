package Recursion;

/*
 https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
 
 Place N queens in one N*N square matrix such that no two queens can kill each other
 */
public class N_Queens {

	private static boolean isIsSafePlaceForQueen(int[][]chess, int row, int col)
	{
	   for( int i = row-1, j = col; i >=0 ; i--)
	   {
		   if( chess[i][j] == 1)
		   {
			   return false;
		   }
	   }
	   
	   for( int i = row-1, j = col-1 ; i >=0 && j >=0 ; i--,j--)
	   {
		   if( chess[i][j] == 1)
		   {
			   return false;
		   }
	   }
	   
	   for( int i = row-1,j = col +1; i>=0 && j < chess.length ; i--,j++)
	   {
		   if( chess[i][j] == 1)
		   {
			   return false;
		   }
	   }
	   
		return true;
	}
	private static void printNQueens( int chess[][], String res, int row)
	{
		if( row == chess.length)
		{ 
			System.out.println(res);
			return;
		}
		
		for( int col = 0 ; col < chess.length ; col++)
		{
		   if(isIsSafePlaceForQueen(chess, row, col))
		   {
			  chess[row][col] = 1;
			  printNQueens(chess, res + row +"-"+col +",", row + 1);
			  chess[row][col] = 0;
		   }
	     }
	}
	public static void main(String[] args) {
		int n = 4;
		int chess[][] = new int[n][n];
		String res = "";
		
		printNQueens(chess, res , 0);
	}

}
