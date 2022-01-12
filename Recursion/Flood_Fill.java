package Recursion;

public class Flood_Fill {
	
	private static void floodFill(int mat[][], int i, int j, int dr, int dc, boolean visited[][], String res)
	{
		if( i < 0 || j < 0 || i > dr || j > dc || mat[i][j]==1 || visited[i][j])
		{
			return;
		}
		
		if( i == dr && j == dc)
		{
			System.out.println(res);
			return;
		}
		
		visited[i][j] = true;
		floodFill(mat, i-1, j, dr, dc, visited, res + "t");   //top call
		floodFill( mat,i, j-1, dr, dc, visited, res +"l");   //left call
		floodFill(mat, i, j+1, dr, dc, visited, res +"r");   //right call
		floodFill(mat, i+1, j, dr, dc, visited, res +"d");   //down call
		
		visited[i][j] = false;
	}

	public static void main(String[] args) {
		int mat[][] = {{0,1,0,0}, {0,0,0,1},{0,1,0,1},{0,0,0,0}};
		
		int row = mat.length;
		int col = mat[0].length;
		
		boolean visited[][] = new boolean[row][col];
		String res = "";
		
		floodFill( mat, 0, 0, row-1, col-1, visited, res);

	}

}
