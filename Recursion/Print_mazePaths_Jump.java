package Recursion;

public class Print_mazePaths_Jump {
	
	private static void printPathsWithJumps(int i, int j, int row, int col, String res)
	{

		//base case
		if( i == row && j == col)
		{
			System.out.print(res+" ");
			return;
		}
		
		//horizontal paths
		for( int ms = 1 ; ms <= col-j ; ms++)
		{
			printPathsWithJumps(i, ms + j, row, col, res + "h"+Integer.toString(ms));
		}
		
		//vertical paths
		for( int ms = 1 ; ms <= row - i ; ms++)
		{
			printPathsWithJumps(ms + i, j, row, col, res + "v"+Integer.toString(ms));
		}
		
		//diaogonal paths
		for( int ms = 1 ; ms <= row - i && ms <= col - j; ms++)
		{
			printPathsWithJumps(ms + i, ms+ j, row, col, res + "d"+Integer.toString(ms));
		}
	}

	public static void main(String[] args) {
		
		int row = 3;
		int col = 3;
		String res = "";
		
		printPathsWithJumps(1, 1, row, col, res );

	}

}
