package Recursion;

/*
 * https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
 * 
Input :  m = 2, n = 2;
Output : 2                         
There are two paths
(0, 0) -> (0, 1) -> (1, 1)
(0, 0) -> (1, 0) -> (1, 1)

 */

public class MatrixPath {

	public static void main(String[] args) {
		
		int m = 2;
		int n = 3;
		
        System.out.println(path(m,n,0,0));           //0,0 as stating point is top-left most cell i.e. mat[0][0]
        
        System.out.println(path(1,200,0,0));  
        //Output must be 1 as only one row is present. So there would be
                                                       // only one way to move from mat[0][0] -> mat[0][n-1];
  
	}
	
	static int path(int m,int n, int a,int b)
	{		
		if(a==m-1 || b==n-1)
			return 1;
		else
			return path(m,n,a+1,b) + path(m,n,a,b+1);
	}

}
