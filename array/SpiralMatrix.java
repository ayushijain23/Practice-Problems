package array;

public class SpiralMatrix {

	 private static void printMatrix(int arr[][], int row, int col)
	 {
		 for(int i = 0;i<row;i++)
		 {
			 for(int j=0; j< col;j++)
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 
			 System.out.println();
			 
		 }
	 }
	 
	 private static void printSpiral(int arr[][], int row,int col)
	 {
		 int k = 0;
		 int l = 0;
		 
		 while( k < row && l <col)
		 {
			 // printing first row from remaining rows
			 for( int i = l ;i <col;i++)
			 {
				 System.out.print(arr[k][i]+" ");
			 }
			 k++;
			 
			 // printing last column from remaining columns
			 for(int i = k; i<row; i++)
			 {
				 System.out.print(arr[i][col-1]+" ");
			 }
			 col--;
			 
			 //printing last row from remaining
			 if(k<row) {
			 for(int i = col-1 ; i >= l; i--)
			 {
				 System.out.print(arr[row-1][i]+" ");
			 }
			 row--;		 
			 }
			 
			 //printing first column from remaining column
			 if(l<col) {
			 for(int i = row-1; i >= k; i--)
			 {
				 System.out.print(arr[i][l]+" ");
			 }
			 l++;
			 } 
			 
		 }
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 3;
		int col = 6;
		
		 int arr[][] = { { 1, 2, 3, 4, 5, 6 },
                 { 7, 8, 9, 10, 11, 12 },
                 { 13, 14, 15, 16, 17, 18 } };
		
		printMatrix(arr, row, col);
		System.out.println();
		printSpiral(arr, row, col);
		
		
	}

}
