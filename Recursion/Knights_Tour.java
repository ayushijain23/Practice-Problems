package Recursion;

/*
    https://www.geeksforgeeks.org/the-knights-tour-problem-backtracking-1/
    
    Move knight in all squares such that each cell is visited once and knights visits all cell.
 */
public class Knights_Tour {
	private static void printChess(int chess[][])
	{
		for( int i = 0 ; i < chess.length ; i++)
		{
			for( int j = 0 ; j < chess.length ; j++)
			{
				System.out.print(chess[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void knightPath(int chess[][], int row, int col, int move)
	{
		if( row < 0 || col < 0 || row >=chess.length || col >= chess.length || chess[row][col] > 0)
		{
			return;
		}
		else if( move == chess.length * chess.length)
		{
			chess[row][col]= move;
			printChess(chess);
			chess[row][col] = 0;
			return;
		}
		
		chess[row][col] = move;
		knightPath( chess, row-2, col+1, move+1);
		knightPath( chess, row-1, col+2, move+1);
		knightPath( chess, row+1, col+2, move+1);
		knightPath( chess, row+2, col+1, move+1);
		knightPath( chess, row+2, col-1, move+1);
		knightPath( chess, row+1, col-2, move+1);
		knightPath( chess, row-1, col-2, move+1);
		knightPath( chess, row-2, col-1, move+1);
		chess[row][col] = 0;
		
	}
	public static void main(String[] args) {
      int n = 5;
      
      int chess[][] = new int[n][n];
       int row = 2;
       int col = 0;
       
       knightPath( chess, row, col, 1);
	}

}
