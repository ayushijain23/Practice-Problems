package Recursion;

public class Print_mazePath {

	private static void printPaths( int arr[][], int i, int j, int row, int col, String res)
	{
		if( i == row && j == col)
		{
			System.out.println(res + Integer.toString(arr[i][j]));
			return;
		}
		
		if( j < col)
		printPaths(arr, i, j+1, row, col, res + Integer.toString(arr[i][j]));
		
		if( i < row)
		printPaths(arr, i+1, j, row, col, res + Integer.toString(arr[i][j]));
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
		String res = "";
		printPaths(arr,0,0,row-1,col-1, res);
	}

}
