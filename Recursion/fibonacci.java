package Recursion;


/*
The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

F[0]= 0;
F[1]= 1

Ex- Input  : n = 2
Output : 1

Input  : n = 9
Output : 34
 */
public class fibonacci {
	
	private static int fib1(int n)
	{
		int a = 0;
		int b = 1;
		if( n==0)
			return a;
		for( int i = 2 ; i<=n;i++)
		{
			int c = a+b;
			a = b;
			b = c;
			
		}
		return b;
	}
	
	private static int fib2(int n) {
		int f[] = new int [n+2];
		f[0] = 0;
		f[1] = 1;
		
		for( int i = 2;i<=n;i++) {
			f[i] = f[i-1]+f[i-2];
		}
		
		return f[n];		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		System.out.println(fib1(n));
		System.out.println(fib2(n));
	}

}
