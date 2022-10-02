package DP;

/*
https://www.geeksforgeeks.org/egg-dropping-puzzle-dp-11/
Standard problem
Important
 */
//test2
public class EggDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floors = 10;
		int eggs = 2;
        int ans = eggDrop( floors, eggs);
        System.out.println(ans);
        		
	}
	
	public static int eggDrop(int floors, int eggs)
	{
		int result[][] = new int[floors+1][eggs+1];
		
		for( int i = 0 ;i <= floors; i++)
			result[i][1] = i;
		
		for(int i = 0;i <= eggs; i++)
		{
			result[1][i] = 1;
			
		}
		
		for(int i = 2; i <= floors; i++) 
		{
			for(int j = 2; j <= eggs; j++)
			{
				result[i][j] = Integer.MAX_VALUE;
				
				for( int k = 1; k < i; k++)
				{
					int eggBroken = result[k-1][j-1];
					int eggSurvive = result[i-k][j];
					
					int temp = Math.max(eggBroken, eggSurvive)+1;
					
					if(temp < result[i][j])
						result[i][j] = temp;
				}
			}
		}
		
		return result[floors][eggs];
	}

}
