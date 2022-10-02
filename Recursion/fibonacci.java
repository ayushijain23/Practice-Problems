package Recursion;


import java.util.Arrays;

/*
The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ??..

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
		int prev2 = 0;
		int prev = 1;
		if(n==0)
			return prev2;
		for( int i = 2 ; i<=n;i++)
		{
			int currSum = prev2 + prev;
			prev2 = prev;
			prev = currSum;
		}
		return prev;
	}

	//tabulation(bottom-> up)
	private static int fib2(int n) {
		int f[] = new int [n+1];
		f[0] = 0;
		f[1] = 1;
		
		for( int i = 2; i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		
		return f[n];		
	}

	//memoization(top -> bottom)
    public static int fib3(int n, int dp[]){
       if(n == 1 || n == 0){
		   return n;
	   }
	   if(dp[n] != 0){
		   return dp[n];
	   }
	   dp[n] = fib3(n - 1, dp) + fib3(n - 2, dp);
	   return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		System.out.println(fib1(n));
		System.out.println(fib2(n));

		int dp[] = new int[n + 1];
		Arrays.fill(dp, 0);
		System.out.println(fib3(n, dp));
	}

}
