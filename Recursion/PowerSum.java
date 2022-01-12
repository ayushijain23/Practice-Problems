package Recursion;

/*
 *   https://www.geeksforgeeks.org/find-ways-integer-can-expressed-sum-n-th-power-unique-natural-numbers/
 *   https://www.hackerrank.com/challenges/the-power-sum/problem
 *   
 *   powerSum(int X, int N) -
 *   Input - X=10 & N=2;
 *   Output - 1 ( 3^2 + 1^2 )
 *   
 *   Input - X =100 & N=2;
 *   output - 3 (10^2),(6^2+8^2),(1^2+3^2+4^2+5^2+7^2)
 */
public class PowerSum {
	static int power(int a, int b)
	{
		if(b == 0)
		{
			return 1;
		}
		
		if( b%2==1 )
		{
			return  a * power(a,b/2) * power(a,b/2);		
		}
		
		else
			return power(a,b/2) * power(a,b/2);
	}
	
	
	static int findPowerSum(int X,int N,int currNum,int currSum)
	{
		
		int p = power(currNum, N);
		int result = 0;
		//System.out.println(p);
		while( p + currSum < X )
		{
			result += findPowerSum(X, N, currNum+1, currSum+p);
			currNum++;
			p = power(currNum, N);			
		}
		
		if( p + currSum == X)
		{
			result++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
         int X = 100;
         int N = 2;
         
        int result = findPowerSum(X,N,1,0);
         System.out.println(result);
	}

}
