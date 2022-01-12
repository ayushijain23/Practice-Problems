package array;

public class Spiral_Matrix {
	
	public static void spiral(int arr[][])
	{
		int n = arr.length;
		int m = arr[0].length;
		
		int minr = 0;
		int maxr = n-1;
		int minc = 0;
		int maxc = m-1;
		int j,i;
		
		int ele = n*m;
		int c = 0;
		//top wall
		
		while(c<ele) {
			
			//top wall
		for(i = minr,j=minc;j<=maxc && c < ele ;j++)
		{
			System.out.print(arr[i][j]+" ");
			c++;
		}
		minr++;
		
		//right wall
		for(i = minr, j= maxc; i<=maxr && c < ele ; i++)
		{
			System.out.print(arr[i][j]+" ");
			c++;
		}
		maxc--;
		
		
		//bottom wall		
		for(i = maxr,j=maxc; j>=minc && c<ele ;j--)
		{
			System.out.print(arr[i][j]+" ");
			c++;
		}
		maxr--;
		
		for(i = maxr,j=minc ; i>=minr && c<ele ; i--)
		{
			System.out.print(arr[i][j]+" ");
			c++;
		}
		minc++;
		
		}	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][] = {{1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}};
       int arr2[][] = {{1,2,3},{4,5,6},{7,8,9,}};
       spiral(arr);
       System.out.println();
       spiral(arr2);
       
	}

}
