package Recursion;

/*
 * Print descending no by recursion
 * 
 * desc = 5 4 3 2 1
 */
public class Desc {
	
	public static void desfun(int n)
	{
		if(n==0)
			return;
		System.out.print(n+" ");
		desfun(n-1);
		System.out.println("Hello "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
        desfun(n);
	}

}
