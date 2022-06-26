package Recursion;


// we are at the stair n and want to reach at ground level 
// 1 and 2 steps are valid
// like from stair 3, we can move to n=2 or n=1
// so total paths from n=3 are ( "1,1,1", "2,1", "1,2") 
public class Staircase_1 {

	//recursive - 2 steps
	private static int findTotalPaths2Steps(int n)
	{
		if( n <= 1)
		{
			return 1;
		}
		
		int p1 = findTotalPaths2Steps(n-1);
		int p2 = findTotalPaths2Steps(n-2);
		
		return p1 + p2;
	}
	
	//recursive- 3steps
	private static int findTotalPaths3Steps(int n)
	{
		if( n ==1 || n==0)
		{
			return 1;
		}
		if( n < 0)
		{
			return 0;
		}
		
		int p1 = findTotalPaths3Steps(n-1);
		int p2 = findTotalPaths3Steps(n-2);
		int p3 = findTotalPaths3Steps(n-3);
		
		return p1 + p2 + p3;
	}
	
	//using dp- 2steps
	private static int findPathsByDp(int n)
	{
		int dp[] = new int [n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		for( int i = 2;i<=n;i++)
		{
			dp[i] = dp[i-1] + dp[i-2];
			
		}
		
		return dp[n];
	}

	//memoization (by top-down)
	private static int findsPathsTopToBottom(int n, int dp[]){
		if(n== 0){
			return 1;
		}
		if( n < 0){
			return 0;
		}
		if(dp[n] != 0){
			return dp[n];
		}
		int oneStep = findsPathsTopToBottom(n-1, dp);
		int twoSteps = findsPathsTopToBottom(n-2, dp);
		int threeSteps = findsPathsTopToBottom(n-3, dp);
		return dp[n] = oneStep + twoSteps + threeSteps;
	}
	
	//using dp- 3steps
	private static int findPathsByDp3Steps(int n)
	{
		int dp[] = new int [n+1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for( int i = 3; i<=n; i++)
		{
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(findTotalPaths2Steps(n));
		System.out.println(findPathsByDp(n));
		
		System.out.println(findTotalPaths3Steps(n));
		System.out.println(findPathsByDp3Steps(n));

		int dp[] = new int[n+1];
		System.out.println(findsPathsTopToBottom(n, dp));
	}

}
