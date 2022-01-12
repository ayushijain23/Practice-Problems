package DP;
/*

*/

public class KnapSack_0_1 {

	public static int knapSack(int wt[], int val[], int W, int n)
	{
		if( W == 0 || n==0 )
		{
			return 0;
		}
		
		// when weight of item is less than Weight of knapsack, then we can either put it into bag or not.
		// Hence max of these two conditions.
		
		if(wt[n-1] <= W)
		{
			return Math.max( val[n-1] + knapSack(wt, val, W-wt[n-1], n-1), knapSack(wt, val, W, n-1 ));
		}
		
		
	   // When item weight[n-1] > Weight of knapsack, then we can't put it into bag
	   // i.e. When wt[n-1] > W
	    else
		return knapSack( wt, val, W, n-1);
		
	}
	
	public static void main(String[] args) {
		
		int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W = 50; 
        int n = val.length; 
        System.out.println(knapSack(wt,val,W, n)); 

	}

}
