package Recursion;


public class Print_StairPaths {
	private static void findPaths( int n, String paths)
	{
		if( n == 0)
		{
			System.out.print(paths+" ");
			return;			
		}
		
		if( n < 0)
		{
			return;
		}
		
		findPaths( n-1, Integer.toString(1)+ paths);
		findPaths( n-2, Integer.toString(2)+ paths);
		findPaths( n-3, Integer.toString(3)+ paths);
	}

	public static void main(String[] args) {
		 int n = 3;
	     String paths = "";
	     findPaths(n, paths);

	}

}
